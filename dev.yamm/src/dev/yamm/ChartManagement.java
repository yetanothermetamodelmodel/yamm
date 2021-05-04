/**
 * Copyright (C) 2019 yamm.dev, Ralf Buschermöhle
 * 	
 * YAMM is made available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * YAMM makes use of JScience - Java(TM) Tools and Libraries for the 
 * Advancement of Sciences: Copyright (C) 2006 - JScience (http://jscience.org/) 
 * All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * 
 * see LICENSE.txt
 * 
 */
package dev.yamm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.debug.core.DebugException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;

import dev.yamm.compile.Compilation;
import dev.yamm.coreModelXmi.yamm.YClass;
import dev.yamm.coreModelXmi.yamm.YGlobalStateMachine;
import dev.yamm.coreModelXmi.yamm.YInternal;
import dev.yamm.coreModelXmi.yamm.YammFactory;
import dev.yamm.gui.Layer;
import dev.yamm.gui.LayerView;
import dev.yamm.gui.LayerViewLaboratory;
import dev.yamm.gui.OutputObserver;
import dev.yamm.logger.YAMMLogger;
import dev.yamm.objDiagram.ObjectDiagramManager;

/**
 * Maintains the state of the simulation (Zerochart)
 * 
 */
public class ChartManagement {

	private static YAMMLogger logger = YAMMLogger.getYAMMLogger("YAMM Log");

	public boolean standalone = false;
	
	public boolean simulationInStepMode 	= false; // --> waits at every waiting();
	public boolean simulationInStepOverMode = false; // --> waits at every waiting of the calling state machine (of an operation call)
	public boolean stepReturn = false;
	
	/** active state of the interpreter(Zerochart) */
	public int stateNR = 0;
	
	/** breakpoints are active */
	public boolean breakpoint = false;
	
	public boolean simulationBeenStarted = false;
	public boolean wait = false;
	
	/** true when a simulation stops after an trnasition switches
	 *  false when a simulation stops before an effect is evaluated
	 */
	public boolean transitionBreak = false;

	private static String layerPathPrefix = "";

	// refereces to main runtime classes
	public EvalGuardOrEffect execute;
	public InitializeLayer loading;
	public ResourceManagement resourceManagement;
	public ObjectManagement objectManagement;
	public Zerochart zerochart;
	public Compilation compilation;
	public String simualtionTimeStamp;


	public static boolean startupDone = false;
	
	public boolean simulationIsRunning;
	public List<SimulationIsRunningListener> simulationIsRunningListener = new ArrayList<>();

	public String standaloneProjectName = null;

	public String standaloneWorkspacePath = null;
	
	public Map<String, String> parameter;
	public void setInitializerParams(Map<String, String> parameterMap) {
		parameter = parameterMap;
	}
	
	private Map<Integer, Map<String, String>> paramterMultithreading = new HashMap<>();
	

	
	public static interface SimulationIsRunningListener {
		void changed(boolean isRunning);
	}
	public void setSimulationIsRunning(boolean isRunning) {
		simulationIsRunning = isRunning;
		List<SimulationIsRunningListener> listernCopy = new ArrayList<>();
		listernCopy.addAll(simulationIsRunningListener);
		listernCopy.forEach(listener -> listener.changed(isRunning));
	}
	/** 
	 * Initializes main runtime classes
	 * 
	 * @param yamm the central ResourceManagment object
	 */
	public ChartManagement(ResourceManagement yamm) {
		this.resourceManagement = yamm;
		execute = new EvalGuardOrEffect(this);
		loading = new InitializeLayer(this);
		zerochart = new Zerochart(this);
		compilation = new Compilation(this);
		objectManagement = new ObjectManagement(this);
		
	}

	
	/**
	 * loads layers(Layer) and runtime models(-> loadAllInstances) 
	 * 
	 * called from (indirect): PTASimulation..., StandaloneYAMM..., YAMMInterface...
	 * @param prefix
	 * @param path
	 */
	public void setLayer(String prefix, String path) {
		logger.info("Model Information reset.");
		objectManagement.clearObjectCaches();
		objectManagement.clearEPackages();
		execute.getValue.valueMap.clear();
		if (execute.getValue.regexMap.size() > 10000) {
			execute.getValue.regexMap.clear();
		}
		simulationBeenStarted = true;
		stateNR = 0;
		ConfigurationManagement.setColoring(false);
		
	
		loadViewLayers(prefix, path);
		
		loading.loadAllInstances(null, null);
		
	}


	/**
	 *  Invoked when a button is pressed in the layer-view to start a simulation
	 * 	init in buildAndMergeModelLayers.
	 * 	Starts the Interpreter/simulation or continues it when it has already been started.
	 */
	public void start() {
		if(simulationBeenStarted) {
			execute.chartOperation.continueChart();
		} else {
			if (buildAndMergeModelLayers("Start simulation", true, null, null)) {
				simulationBeenStarted = true;
				startupDone = true;
				reflectivSChart();
			}
		}
	}

	public YInternal internal;

	private int timeStep = 0;
	/**
	 * loads runtime models and compiles effects; initializes the GlobalStateMachine
	 * 
	 * @param messageToBePrinted
	 * @param compileIt 
	 * @param nsURIs null is possible --> see InitializeLayer.loadAllInstances(...)
	 * @param modelFiles null is possible --> see InitializeLayer.loadAllInstances(...)
	 * @return
	 */
	public boolean buildAndMergeModelLayers(String messageToBePrinted, boolean compileIt, ArrayList<String> nsURIs, ArrayList<String> modelFiles) {
		YAMMLogger.reset();
		logger.resetLocal();
		logger.info("\n****************************************************************************************************\n" 
				+ messageToBePrinted + "\n****************************************************************************************************", false, false);
		logger.info("Model reset.");
		
		
		
		objectManagement.clearEPackages();
		resourceManagement.registerMetaModelPackages();
		internal = resourceManagement.yammFactory.createYInternal();
		stateNR = 0;
		if (loading.loadAllInstances(nsURIs, modelFiles)) {
			objectManagement.buildStructureInformationForAllLayers(false);
			
			// qualiClassName -> all prop
			Map<String, List<EObject>> classAndProperties = new HashMap<>();
			Map<EObject, String> classToName = new HashMap<>();
			for (EObject propObserve : objectManagement.getEObjects(0, "ObserveProperty:")) {
				EObject yclass = (EObject) objectManagement.get(propObserve, "container");
				if (classToName.containsKey(yclass))
					classAndProperties.get(classToName.get(yclass)).add(propObserve);
				else
				{
					String qualifiedClassName = Common.getQualifiedNameYClass((YClass)yclass);
					classToName.put(yclass, qualifiedClassName);
					classAndProperties.put(qualifiedClassName, new ArrayList<>());
					classAndProperties.get(qualifiedClassName).add(propObserve);
				}
			}
			objectManagement.observedValues = classAndProperties;
			setInitializerParams(null);
			

			if (compileIt) {
				logger.info("Start guards and effects compilation ...");
				compilation.prepareForCompile(null, true, true);
				if(compilation.compileErrors) {
					logger.error("Problems occurred during compiling process.");
					LayerView.getSimulationState().stop(true);
					return false;
				}
				logger.info("... compiling guards and effects (successfully) done.");
			}
			
			DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd_HH-mm-ss");
			Date date = new Date();
			simualtionTimeStamp = dateFormat.format(date);
			
			String output = "Parameter:\n";
			List<String> out = new ArrayList<>();
			out.add("");
			if (LayerViewLaboratory.instance.useParameter) 
			{
				LayerViewLaboratory.instance.useParameter = false;
				Map<String, String> parameterMap = new HashMap<>();  

				if (LayerView.instance.parameterTextLabels != null)
				{
					Display.getDefault().syncExec(new Runnable() {
						public void run() {

					for (Entry<String, String> entry : LayerViewLaboratory.instance.getparaMap().entrySet())
					{
						String paramName = entry.getKey();
						String value = entry.getValue();
						parameterMap.put(paramName, value);
						setInitializerParams(parameterMap);
						out.set(0, out.get(0) + " " + paramName + " = " + value + ",");
					}
					
				}
			});
				}
			}
			output += out.get(0);
			output += "\n\n";

			String fileName = simualtionTimeStamp + ".txt";
			String wsPath = ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString();   
			String path = wsPath + File.separator + compilation.projectName + File.separator + "output";
			String outputDirectoryPath = path;
			path += File.separator + fileName;	
			
			File outputDir = new File(outputDirectoryPath);
			if (!outputDir.exists())
				outputDir.mkdir();
			try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
				    writer.write(output);   
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			objectManagement.propertyObserver = new PropertyObserver(objectManagement);
			objectManagement.queueObserver = new QueueObserver(objectManagement);
			OutputObserver.om = objectManagement;

			YGlobalStateMachine globalStateMachine = resourceManagement.yammFactory.createYGlobalStateMachine();
			globalStateMachine.setInternal(internal);
			execute.ID_0 = objectManagement.introduceObjectToObjectCache(0, globalStateMachine);
			zerochart.globalStateMachine = globalStateMachine;
			execute.loadMaps();
			logger.info("Starting constraint checking of yamm layer 1 ... ");
			logger.info("... constraint checking done.");
			return true;
		} else {
			logger.error("Problems occurred while loading the model content.");
			LayerView.getSimulationState().stop(true);
			return false;
		}
	}


	/**
	 * 	starts or continues a simulation. 
	 * 	When the simulation is already running: execute.chartOperation.continueChart() 
	 * 											continues the Interpreter at the correct position
	 * 	When the simulation hasn't been started: (it doesn't loads a model, should have been done already)
	 * 											starts the Interpreter
	 * 
	 * called from : StandaloneYAMM..., YAMMInterface...
	 * 
	 */
	public void startSimulation(Map<String, String> parameterMap) {
		if(simulationBeenStarted) {
			execute.chartOperation.continueChart();
		} else {
			//buildListOfRelevantNSURIsAndSetResourceSet();
			//logger.info("****************************************************************************************************");
			//logger.info("Start the simulation");
			//logger.info("****************************************************************************************************");
			YammFactory yammFactory = resourceManagement.yammFactory;
			YGlobalStateMachine globalStateMachine = yammFactory.createYGlobalStateMachine();
			
			
			Map<String, List<EObject>> classAndProperties = new HashMap<>();
			Map<EObject, String> classToName = new HashMap<>();
			for (EObject propObserve : objectManagement.getEObjects(0, "ObserveProperty:")) {
				EObject yclass = (EObject) objectManagement.get(propObserve, "container");
				if (classToName.containsKey(yclass))
					classAndProperties.get(classToName.get(yclass)).add(propObserve);
				else
				{
					String qualifiedClassName = Common.getQualifiedNameYClass((YClass)yclass);
					classToName.put(yclass, qualifiedClassName);
					classAndProperties.put(qualifiedClassName, new ArrayList<>());
					classAndProperties.get(qualifiedClassName).add(propObserve);
				}
			}
			objectManagement.observedValues = classAndProperties;
			
			objectManagement.propertyObserver = new PropertyObserver(objectManagement);
			objectManagement.queueObserver = new QueueObserver(objectManagement);
			
			setInitializerParams(null);	
			
			setInitializerParams(parameterMap);
			
			internal = resourceManagement.yammFactory.createYInternal();
			DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd_HH-mm-ss");
			Date date = new Date();
			simualtionTimeStamp = dateFormat.format(date);
			globalStateMachine.setInternal(internal);
			
			execute.ID_0 = objectManagement.introduceObjectToObjectCache(0, globalStateMachine);	
			zerochart.globalStateMachine = globalStateMachine;
			execute.loadMaps();
			reflectivSChart();
		}
	}

	
	/**
	 * stops a Simulation, e.g. when (runtime) error occur or problems when executing the chart 
	 */
	public void stopSimulation() {		
		objectManagement.reset();
		execute.lifeness.reset();

		simulationBeenStarted = false;
		startupDone = false;

		execute.pauseExecution.stateMachineHandler = null;
		execute.pauseExecution.stepOver = false;

	}

	/**
	 * starts(or continues) the Interpreter after an applicable 
	 * button is pressed in the Layer-view. 
	 */
	public void reflectivSChart() {
		try {
			zerochart.reflectivChart();
			if (!execute.reflectivStateChart.standalone)
			{
				String objectDiagrampath = execute.reflectivStateChart.objectManagement.getViewLayers().get(0).getObjectDiagramPath();
				if (objectDiagrampath != null
						&& !objectDiagrampath.equals("")
						&& ObjectDiagramManager.openObjectDiagrams.contains(objectDiagrampath))
				{
					Display.getDefault().syncExec(new Runnable() {
						public void run() {
							Zerochart.modelSynchronizer.updateObjectDiagram();
						}
					});
				}
					
			}
		} catch (DebugException e) {
			e.printStackTrace();
		}
	}


	/**
	 * sets the next state of the Interpreter before continuing the Interpreter
	 * @param NR next state of Interpreter
	 */
	public void setStateNR(int NR) {
		stateNR = NR;
	}

	/**
	 * gets the current state of the Interpreter,
	 * if it is finalstate + 1 (= 15) the chart is paused.
	 * @return gets the current state of the Interpreter
	 */
	public int getStateNR() {
		return stateNR;
	}


	/**
	 * activates/deactivates breakpoints in the simulation. 
	 * @param breakpoint activates/deactivates breakpoints
	 */
	public void setBreakpoint(boolean breakpoint) {
		this.breakpoint = breakpoint;
	}

	/**
	 * Loads the layer file and creates a new Layer instances. Initializes the attributes of the Layer instances
	 * with corresponding values readout of the loaded file line by line. Adds the {@code Layer} to
	 * {@code ObjectManagement.viewLayers}.
	 * 
	 * @param prefix 	:	the prefix of the path to the corresponding file if method is (indirectly) called by
	 * 						PTASimulation.main(...), StandaloneYAMM.main(...), YAMMInterface(...) /
	 * 						 is {@code null} if it is called by {@code LayerView}.
	 * @param fullPath	:	the path to the layer file
	 */
	public void loadViewLayers(String prefix, String fullPath) 
	{
		objectManagement.getViewLayers().clear();
		BufferedReader in = null;
		String t;
		Layer actLayer = new Layer();
		int lineNR = 0;
		int maxLines = 6;
		int nextLayer = 0;
		
		if ((new File(fullPath)).exists()) 
		{
			try 
			{
				in = new BufferedReader(
						new InputStreamReader(
								new FileInputStream( fullPath ) ) );
				while ( null != (t = in.readLine()) )
				{
					switch (lineNR) 
					{
					case 0: 
					{
						actLayer = new Layer();
						if (objectManagement.getViewLayers().size()==0) 
						{
							actLayer.setStepWait(true);
						}
						if (prefix == null) 
						{
							actLayer.setPath(t);
						}
						else
						{
							if (t.trim().contains(" "))
							{
								actLayer.setPath(prefix + t);
							}
							else
							{
								String[] paths = t.trim().split(" ");
								actLayer.setPath(prefix + paths[0]);
								
								for (int i = 1; i < paths.length; i++)
								{
									actLayer.addExtYammLayerPath(paths[i]);
								}
							}
						}
						break;
					}
					case 1: 
					{
						actLayer.setNsURI(t);
						break;
					}
					case 2: 
					{
						if (t.equals("true")) actLayer.setBreakpoint(true);
						if (t.equals("false")) actLayer.setBreakpoint(false);
						break;
					}
					case 3: 
					{
						long waittime = Long.valueOf(t).longValue();
						actLayer.setWaittime(waittime);
						break;
					}
					case 4: 
					{
						if(t.equals("true")) actLayer.setColorLayer(true);
						if(t.equals("false")) actLayer.setColorLayer(false);
						break;
					}
					case 5:
					{
						if(t.equals("true")) actLayer.setColorLayer(true);
						if(t.equals("false")) actLayer.setColorLayer(false);
						objectManagement.getViewLayers().add(actLayer);
						break;
					}
					case 6:
					{
						if (!"".equals(t))
							actLayer.setObjectDiagramPath(t);
						break;
					}
					}
					lineNR++;
					if (lineNR > maxLines) 
					{
						lineNR = nextLayer;
					}
				}
				in.close();
			} 
			catch (FileNotFoundException e) 
			{
			} 
			catch (IOException e) 
			{
				logger.error(e);
			}
		} 
		else
		{
			logger.error("Can't find the file");
		}	
	}

	/**
	 * Invokes the runtime-compiler.
	 * 
	 * Called from(indirect): YAMMInterface..., StandaloneYAMM...
	 * 
	 * @param threadNumber
	 * @param resetCaches
	 */
	public void compile(Integer threadNumber, boolean resetCaches) {
		compilation.prepareForCompile(threadNumber, resetCaches, false);
	}
	public void setTimeStep(int timeStep) {
		this.timeStep= timeStep;
	}
	public int getTimeStep() {
		return timeStep;
	}


}
