/**
 * Copyright (C) 2019 yamm.online, Ralf Buschermöhle
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
package online.yamm.init;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.internal.ui.SWTFactory;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;


/**
 * This class represents the launch configuration tab "RMOF Analysis Configuration" which is shown in 
 * the configuration dialog. 
 * It implements functions needed for receiving the RMOF Analysis Compile Path and loading the 
 * RMOF Analysis parameter files for running/ debugging purposes. 
 */
@SuppressWarnings("restriction")
public class LaunchTabAnalysis extends AbstractLaunchConfigurationTab 
{


	private Text textAnalysisParameterFile;
	private Button buttonWorkspaceBrowserAnalysisParameterFile;
	private Text textCompilePath;
	private Button buttonWorkspaceBrowserCompilePath;
	private Combo comboBreedingThreadsDropDown;
	private Combo comboEvaluationThreadsDropDown;
	private Text textGenerations;
	private Text textIndividuals;
	private Text textPathToStoreBestModel;
	private Button buttonWorkspaceBrowserPathToStoreBestModel;
	private Text textPathToStoreBestIndividuum;
	private Button buttonWorkspaceBrowserPathToStoreBestIndividuum;
	private Text textNetworkPort;

	
	/**
	 * Creates the top level control for the RMOF Analysis Configuration tab.
	 * 
	 * @param parent the top level control
	 */
	@Override
	public void createControl(Composite parent) 
	{

		Composite compOverall = new Composite(parent, SWT.NONE);
		setControl(compOverall);
		compOverall.setLayout(new GridLayout(1, true));
		compOverall.setFont(parent.getFont());
		
		Group groupCompilePath = SWTFactory.createGroup(compOverall, "RMOF Analysis Compile Path", 
				1, 2, GridData.FILL_HORIZONTAL);
		Composite compCompilePath = SWTFactory.createComposite(groupCompilePath, parent.getFont(), 
				3, 3, GridData.FILL_HORIZONTAL, 0, 0);
		textCompilePath = SWTFactory.createSingleText(compCompilePath, 4);
		textCompilePath.setToolTipText("Set the Analysis Compile Path (relative to workspace)");
		textCompilePath.addListener(SWT.KeyUp, new Listener() 
		{
			@Override
			public void handleEvent(Event event) {
				updateLaunchConfigurationDialog();		
			}
		});
		buttonWorkspaceBrowserCompilePath = createPushButton(compCompilePath, "Workspace", null); 
		buttonWorkspaceBrowserCompilePath.addSelectionListener(new SelectionAdapter() 
		{
			@Override
			public void widgetSelected(SelectionEvent e)
			{
				DirectoryDialog openDirectory = new DirectoryDialog(getShell(), SWT.OPEN);
				openDirectory.setFilterPath(ResourcesPlugin.getWorkspace().getRoot().getLocation().toString());
				String fullPath = openDirectory.open();
				if (fullPath != null && !fullPath.isEmpty()) 
				{
					//String fileLoc = Activator.getDefault().getStringVariableManager().generateVariableExpression("workspace_loc", arg); //$NON-NLS-1$
					textCompilePath.setText(fullPath);
					updateLaunchConfigurationDialog();
				}
			}
		});

		Composite compAnalysisParameterFile = new Composite(compOverall, SWT.NONE);
		compAnalysisParameterFile.setLayout(new GridLayout(1, true));
		compAnalysisParameterFile.setFont(compOverall.getFont());	
		Group groupAnalysisParameterFile = SWTFactory.createGroup(compOverall, "RMOF Analysis Parameter File", 1,
				2, GridData.FILL_HORIZONTAL);
		compAnalysisParameterFile = SWTFactory.createComposite(groupAnalysisParameterFile, parent.getFont(), 
				3, 3, GridData.FILL_HORIZONTAL, 0, 0);
		textAnalysisParameterFile = SWTFactory.createSingleText(compAnalysisParameterFile, 4);
		textAnalysisParameterFile.setToolTipText("Set the Analysis Parameter File (relative to workspace)");
		textAnalysisParameterFile.addListener(SWT.KeyUp, new Listener() 
		{
			@Override
			public void handleEvent(Event event) 
			{
				updateLaunchConfigurationDialog();		
			}
		});
		buttonWorkspaceBrowserAnalysisParameterFile = createPushButton(compAnalysisParameterFile, "Workspace", null); 
		buttonWorkspaceBrowserAnalysisParameterFile.addSelectionListener(new SelectionAdapter() 
		{
			@Override
			public void widgetSelected(SelectionEvent e)
			{
				FileDialog openFile = new FileDialog(getShell(), SWT.OPEN);
				openFile.setFilterNames(new String[] { "Parameter Files", "All Files (*.*)" });
				openFile.setFilterExtensions(new String[] { "*.params", "*.*" }); // Windows
				openFile.setFilterPath(ResourcesPlugin.getWorkspace().getRoot().getLocation().toString()); // Windows path
				String fullPath = openFile.open();
				if (fullPath != null && !fullPath.isEmpty()) 
				{
					//String fileLoc = Activator.getDefault().getStringVariableManager().generateVariableExpression("workspace_loc", arg); //$NON-NLS-1$
					textAnalysisParameterFile.setText(fullPath);
					updateLaunchConfigurationDialog();
				}
				
			}
		});		
		
		Group groupAnalysisConfiguration = SWTFactory.createGroup(compOverall, "Analysis Parameter", 4, 2, GridData.FILL_HORIZONTAL);
		
		Group groupBreedingThreads = SWTFactory.createGroup(groupAnalysisConfiguration, "BThreads", 1, 1, GridData.BEGINNING);
		comboBreedingThreadsDropDown = new Combo(groupBreedingThreads, SWT.DROP_DOWN | SWT.BORDER);
		Runtime runtime = Runtime.getRuntime();
		for (Integer i = 1; i < runtime.availableProcessors()+1; i++) 
		{
			comboBreedingThreadsDropDown.add(i.toString());
		}
		comboBreedingThreadsDropDown.setToolTipText("Shows (in the dropdown) the number of available processors.");
		comboBreedingThreadsDropDown.addListener(SWT.KeyUp, new Listener()
		{
			@Override
			public void handleEvent(Event event) 
			{
				updateLaunchConfigurationDialog();		
			}
		});
		comboBreedingThreadsDropDown.addSelectionListener(new SelectionAdapter() 
		{
			public void widgetSelected(SelectionEvent e) 
			{
				updateLaunchConfigurationDialog();
			}
		});
		
		Group groupEvaluationThreads = SWTFactory.createGroup(groupAnalysisConfiguration, "EThreads", 1, 1, GridData.BEGINNING);
		comboEvaluationThreadsDropDown = new Combo(groupEvaluationThreads, SWT.DROP_DOWN | SWT.BORDER);
		for (Integer i = 1; i < runtime.availableProcessors()+1; i++) 
		{
			comboEvaluationThreadsDropDown.add(i.toString());
		}
		comboEvaluationThreadsDropDown.setToolTipText("Shows (in the dropdown) the number of available processors.");
		comboEvaluationThreadsDropDown.addListener(SWT.KeyUp, new Listener() 
		{
			@Override
			public void handleEvent(Event event)
			{
				updateLaunchConfigurationDialog();		
			}
		});
		comboEvaluationThreadsDropDown.addSelectionListener(new SelectionAdapter()
		{
			public void widgetSelected(SelectionEvent e) 
			{
				updateLaunchConfigurationDialog();
			}
		});
		
		Group groupGenerations = SWTFactory.createGroup(groupAnalysisConfiguration, "Generations", 1, 1, GridData.BEGINNING);
		textGenerations = SWTFactory.createSingleText(groupGenerations, 4);
		textGenerations.addListener(SWT.KeyUp, new Listener() 
		{
			@Override
			public void handleEvent(Event event) 
			{
 				updateLaunchConfigurationDialog();		
			}
		});
		
		Group groupIndividuals = SWTFactory.createGroup(groupAnalysisConfiguration, "Individuals", 1, 1, GridData.BEGINNING);
		textIndividuals = SWTFactory.createSingleText(groupIndividuals, 4);
		textIndividuals.addListener(SWT.KeyUp, new Listener() 
		{
			@Override
			public void handleEvent(Event event) 
			{
				updateLaunchConfigurationDialog();		
			}
		});
		
		Group groupResultAnalysisModelConfiguration = SWTFactory.createGroup(compOverall, "Analysis Results Model File", 
				1, 2, GridData.FILL_HORIZONTAL);
		Composite compResultAnalysisModelConfiguration = SWTFactory.createComposite(groupResultAnalysisModelConfiguration, 
				parent.getFont(), 3, 3, GridData.FILL_HORIZONTAL, 0, 0);
		textPathToStoreBestModel = SWTFactory.createSingleText(compResultAnalysisModelConfiguration, 4);
		textPathToStoreBestModel.setToolTipText("Set the Analysis Result Path (relative to workspace)");
		textPathToStoreBestModel.addListener(SWT.KeyUp, new Listener() {
			@Override
			public void handleEvent(Event event) 
			{
				updateLaunchConfigurationDialog();		
			}
		});
		buttonWorkspaceBrowserPathToStoreBestModel = createPushButton(compResultAnalysisModelConfiguration, "Workspace", null); 
		buttonWorkspaceBrowserPathToStoreBestModel.addSelectionListener(new SelectionAdapter() 
		{
			@Override
			public void widgetSelected(SelectionEvent e)
			{
				FileDialog saveFile = new FileDialog(getShell(), SWT.SAVE);
				saveFile.setFilterNames(new String[] { "RMOF Files", "All Files (*.*)" });
				saveFile.setFilterExtensions(new String[] { "*.rmof", "*.*" }); // Windows
				saveFile.setFilterPath(ResourcesPlugin.getWorkspace().getRoot().getLocation().toString()); // Windows path
				String fullPath = saveFile.open();
				if (fullPath != null && !fullPath.isEmpty()) 
				{
					textPathToStoreBestModel.setText(fullPath);
				}
				updateLaunchConfigurationDialog();
			}
		});
		
		Group groupResultAnalysisIndividuumConfiguration = SWTFactory.createGroup(compOverall, "Analysis Results Individuum File",
				1, 2, GridData.FILL_HORIZONTAL);
		Composite compResultAnalysisIndividuumConfiguration = SWTFactory.createComposite(groupResultAnalysisIndividuumConfiguration,
				parent.getFont(), 3, 3, GridData.FILL_HORIZONTAL, 0, 0);
		textPathToStoreBestIndividuum = SWTFactory.createSingleText(compResultAnalysisIndividuumConfiguration, 4);
		textPathToStoreBestIndividuum.setToolTipText("Set the Analysis Result Path (relative to workspace)");
		textPathToStoreBestIndividuum.addListener(SWT.KeyUp, new Listener() 
		{
			@Override
			public void handleEvent(Event event) 
			{
				updateLaunchConfigurationDialog();		
			}
		});
		buttonWorkspaceBrowserPathToStoreBestIndividuum = createPushButton(compResultAnalysisIndividuumConfiguration, 
				"Workspace", null); 
		buttonWorkspaceBrowserPathToStoreBestIndividuum.addSelectionListener(new SelectionAdapter() 
		{
			@Override
			public void widgetSelected(SelectionEvent e)
			{
				FileDialog saveFile = new FileDialog(getShell(), SWT.SAVE);
				saveFile.setFilterNames(new String[] { "Individuum Files", "All Files (*.*)" });
				saveFile.setFilterExtensions(new String[] { "*.ind", "*.*" }); // Windows
				saveFile.setFilterPath(ResourcesPlugin.getWorkspace().getRoot().getLocation().toString()); // Windows path
				String fullPath = saveFile.open();
				if (fullPath != null && !fullPath.isEmpty()) 
				{
					//String fileLoc = Activator.getDefault().getStringVariableManager().generateVariableExpression("workspace_loc", arg); //$NON-NLS-1$
					textPathToStoreBestIndividuum.setText(fullPath);
				}
				updateLaunchConfigurationDialog();
			}
		});
		
		Group groupCommunicationConfiguration = SWTFactory.createGroup(compOverall, "Communication Parameter",
				4, 2, GridData.FILL_HORIZONTAL);
		Group groupPort = SWTFactory.createGroup(groupCommunicationConfiguration, "Network Port", 1, 1, GridData.BEGINNING);
		textNetworkPort = SWTFactory.createSingleText(groupPort, 4);
		textNetworkPort.addListener(SWT.KeyUp, new Listener() 
		{
			@Override
			public void handleEvent(Event event)
			{
				updateLaunchConfigurationDialog();		
			}
		});
	}
	
	/**
	 * Returns the name of this tab.
	 * 
	 * @return the name of this launch configuration tab
	 */
	@Override
	public String getName() 
	{
		return "RMOF Analysis Configuration";
	}
	
	/**
	 * The place where the controls of the launch configuration are initialized with values. 
	 * The method is called when a launch configuration is selected to be displayed. 
	 * 
	 * @param configuration the specific launch configuration.
	 */
	@Override
	public void initializeFrom(ILaunchConfiguration configuration)
	{
		String layerfile = "";
		String compiledClasses = "";
		String numberOfBreedingThreads = "1";
		String numberOfEvaluationThreads = "1";
		String numberOfGenerations = "1";
		String numberOfIndividuals = "1";
		String pathToBestModel = "";
		String pathToBestIndividuum = "";
		String networkPort = "1000";
		
		try 
		{
			compiledClasses = configuration.getAttribute(AnalysisLaunchConfigurationConstants.L_ANALYSISCOMPILEDCLASSPATH, "");
			layerfile = configuration.getAttribute(AnalysisLaunchConfigurationConstants.L_ANALYSISPARAMETERPATH, "");
			numberOfBreedingThreads = tryToParseInteger(configuration.getAttribute(AnalysisLaunchConfigurationConstants.L_BREEDINGTHREADS, "1"));
			numberOfEvaluationThreads = tryToParseInteger(configuration.getAttribute(AnalysisLaunchConfigurationConstants.L_EVALUATIONTHREADS, "1"));
			numberOfGenerations = tryToParseInteger(configuration.getAttribute(AnalysisLaunchConfigurationConstants.L_GENERATIONS, "1"));
			numberOfIndividuals = tryToParseInteger(configuration.getAttribute(AnalysisLaunchConfigurationConstants.L_INDIVIDUALS, "1"));
			pathToBestModel = configuration.getAttribute(AnalysisLaunchConfigurationConstants.L_BESTMODELPATH, "");
			pathToBestIndividuum = configuration.getAttribute(AnalysisLaunchConfigurationConstants.L_BESTINDIVIDUUMPATH, "");
			networkPort = configuration.getAttribute(AnalysisLaunchConfigurationConstants.L_NETWORKPORT, "1000");
		} 
		catch (CoreException e) 
		{
		}
		
		textCompilePath.setText(compiledClasses);
		textAnalysisParameterFile.setText(layerfile);
		comboBreedingThreadsDropDown.setText(numberOfBreedingThreads);
		comboEvaluationThreadsDropDown.setText(numberOfEvaluationThreads);
		textGenerations.setText(numberOfGenerations);
		textIndividuals.setText(numberOfIndividuals);
		textPathToStoreBestModel.setText(pathToBestModel);
		textPathToStoreBestIndividuum.setText(pathToBestIndividuum);
		textNetworkPort.setText(networkPort);
	}
	
	String tryToParseInteger(String somePotentialNumber) 
	{
		Integer someNumber = null;
		try 
		{
			someNumber = Integer.parseInt(somePotentialNumber);
		} 
		catch (NumberFormatException e)
		{
			somePotentialNumber = "1";
		}
		if (someNumber != null && someNumber < 1) 
		{
			somePotentialNumber = "1";
		}
		return somePotentialNumber;
	}

	/**
	 * Puts the values of tab "RMOF Launch Configuration" into the current launch configuration.
	 * 
	 * @param configuration the specific launch configuration.
	 */
	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) 
	{
		configuration.setAttribute(AnalysisLaunchConfigurationConstants.L_ANALYSISCOMPILEDCLASSPATH, textCompilePath.getText());
		configuration.setAttribute(AnalysisLaunchConfigurationConstants.L_ANALYSISPARAMETERPATH, textAnalysisParameterFile.getText());
		configuration.setAttribute(AnalysisLaunchConfigurationConstants.L_BREEDINGTHREADS, comboBreedingThreadsDropDown.getText());
		configuration.setAttribute(AnalysisLaunchConfigurationConstants.L_EVALUATIONTHREADS, comboEvaluationThreadsDropDown.getText());
		configuration.setAttribute(AnalysisLaunchConfigurationConstants.L_GENERATIONS, textGenerations.getText());
		configuration.setAttribute(AnalysisLaunchConfigurationConstants.L_INDIVIDUALS, textIndividuals.getText());
		configuration.setAttribute(AnalysisLaunchConfigurationConstants.L_BESTMODELPATH, textPathToStoreBestModel.getText());
		configuration.setAttribute(AnalysisLaunchConfigurationConstants.L_BESTINDIVIDUUMPATH, textPathToStoreBestIndividuum.getText());
		configuration.setAttribute(AnalysisLaunchConfigurationConstants.L_NETWORKPORT, textNetworkPort.getText());
	}

	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) 
	{
		//System.out.println("TestsetDefaults");
	}

}
