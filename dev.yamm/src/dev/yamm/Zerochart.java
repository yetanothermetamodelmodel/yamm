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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;
import java.util.Random;

import org.eclipse.debug.core.DebugException;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.swt.widgets.Display;

import dev.yamm.coloring.AttachmentIdAndEffectId;
import dev.yamm.coloring.ColorYAMMDiagram;
import dev.yamm.coloring.ObjectsToColor;
import dev.yamm.coreModelXmi.yamm.YClass;
import dev.yamm.coreModelXmi.yamm.YEnumeration;
import dev.yamm.coreModelXmi.yamm.YFinalState;
import dev.yamm.coreModelXmi.yamm.YGlobalStateMachine;
import dev.yamm.coreModelXmi.yamm.YModel;
import dev.yamm.coreModelXmi.yamm.YOperation;
import dev.yamm.coreModelXmi.yamm.YPackage;
import dev.yamm.coreModelXmi.yamm.YParameter;
import dev.yamm.coreModelXmi.yamm.YRunToCompletion;
import dev.yamm.coreModelXmi.yamm.YStateMachine;
import dev.yamm.coreModelXmi.yamm.YStateMachineHandler;
import dev.yamm.coreModelXmi.yamm.YammFactory;
import dev.yamm.coreModelXmi.yamm.impl.YStateMachineImpl;
import dev.yamm.debug.model.YAMMDebugTarget;
import dev.yamm.debug.model.YAMMVariableAdapter;
import dev.yamm.gui.Layer;
import dev.yamm.gui.LayerView;
import dev.yamm.init.Activator;
import dev.yamm.init.LaunchDelegate;
import dev.yamm.logger.YAMMLogger;
import dev.yamm.objDiagram.ModelSynchronizer;
import dev.yamm.operations.InoutAdapter;
import dev.yamm.preferencePage.PreferenceConstants;

public class Zerochart 
{
	private static YAMMLogger logger = YAMMLogger.getYAMMLogger("YAMM Log");
	
	ChartManagement reflectivStateChart;
	EvalGuardOrEffect execute;
	ObjectManagement om;
	
	
	boolean noNormalSMHs;
	List<EObject> simObjects;
	YStateMachineHandler simulateSMH;
	EObject metaData;
	EObject simulateOperation;
	String classObjectID;
	String newClassID;
	EObject opClass;
	YParameter timeStepParameter;
	List<EObject> SMHs;
	int currentSimTime;
	int nextSimTime;
	int timeStep;
	EObject stateMachine;
	EObject vertex;
	Object returnValue;
	String nameOfRetunVar;
	String itsClassID;
	EObject operationClass;
	EList inAdapters;
	boolean calledFromNothing;
	List<EObject> transitions;
	int stateExitNo;
	boolean isWaitTimeSet;
	ObjectsToColor colorObj;
	EObject attachment;
	long numberMillis;
	String itsClassId;
	EList<EObject> outgoingtTranstions;
	boolean evaluatedGuard;
	List<EObject> guardsFalse;
	EObject guard;
	List<EObject> guardsNotChecked;
	int effectCount;
	boolean color;
	ObjectsToColor colorObj2;
	EObject effectObject2;
	AttachmentIdAndEffectId attachmentIdAndEffectId;
	String rtc ;
	boolean propertyBreakpointIsSet;
	boolean breakpointsInLayerViewActivated;
	boolean isBreakpoint;
	EList<EObject> effects;
	int effectCount2;
	YAMMVariableAdapter activeAdapter;
	YAMMDebugTarget debugTarget;
	

	//-----------------------------------------------------------------
	public int layer;
	private boolean desPhaseExecutedAtLeastOnes = false; // fist des Phase can execute when no event is in EventQueue (a SimObj 
									// in a normal Queue can consumed in a SimObj.simulate Method); only possible ones because we need 
									// an abbruchbedingung for the simulaion(-> no events in EventQueue) but also a start when something is in a normal Qeueue
	public YGlobalStateMachine globalStateMachine;
	public static ModelSynchronizer modelSynchronizer;
	public EObject activeStateMachineHandler;
	private int smhCounter;
	private Random guardRand;
	private boolean allSimulateOperationsReturnedFalse;
	private YStateMachineHandler desRootSMH;	
	private EObject desInitStatemachine;
	private List<EObject> initalActiveStatemachines;
	private List<EObject> observerStatemachines;
	private EObject desInitStatemachineHandler;
	private List<EObject> initalActiveStatemachinesHandler;
	private List<EObject> observerStatemachinesHandler;
	public YStateMachineHandler opCallStateMachineHandler;
	
	//------------------------------------------------------------------
	public static Phase phase;
	private static Phase lastPhase;
	
	public final static int PSEUDOSTATE = 0;
	public final static int startPhaseDesInit = 1;
	public final static int startPhaseNormal = 2;
	public final static int startPhaseDes = 3;
	public final static int startPhaseObserver = 4;
	public final static int beforeExcuteSubEffectsIdentified = 5;
	public final static int StateIdentified = 6;
	public final static int assignmentdone = 7;
	public final static int executingStateMachines = 8;
	public final static int TransitionIdentified = 9;
	public final static int SubEffectIdentified = 10;
	public final static int OperationIdentified = 11;
	public final static int EffectsExecuted = 12;
	public final static int StateMachinesNotSwitchedYet = 13;
	public final static int finalstate = 100;
	
	public Zerochart(ChartManagement reflectivStateChart) 
	{
		this.reflectivStateChart = reflectivStateChart;
		this.execute = reflectivStateChart.execute;
	}
	
	public void reflectivChart() throws DebugException 
	{
		om = execute.reflectivStateChart.objectManagement;	
		
		boolean executedAsGraphicalSimulation = reflectivStateChart.resourceManagement.threadnum.equals("");
		boolean loggingActive = executedAsGraphicalSimulation; // currently only the graphical version supports logging
	
		if (om.isHasBeenSoftReseted()) 
		{
			reflectivStateChart.stateNR = PSEUDOSTATE;
			om.setHasBeenSoftResetted(false);
		}
		
		
		do {
			switch (reflectivStateChart.stateNR) {

			case PSEUDOSTATE: {
				logger.trace("PSEUDOSTATE");
				
				layer = 0;
				String seedString = "";
				if (!execute.reflectivStateChart.standalone) 
					seedString = Activator.getActionPreferenceStore().getString(PreferenceConstants.P_SEED_GUARD);
				
				long guardSeed;
				try {
					guardSeed = Long.parseLong(seedString);
				} catch (Exception e) {
					guardSeed = 1;
				}
				guardRand = new Random(guardSeed);
				desRootSMH = null;	
				reflectivStateChart.setTimeStep(0);
				globalStateMachine.getInternal().setSimulationTime(0);
				desPhaseExecutedAtLeastOnes = false;
				
				reflectivStateChart.setSimulationIsRunning(true);	
				if (!execute.reflectivStateChart.standalone) 
				{
					Display.getDefault().syncExec(new Runnable() {
						@Override
						public void run() {
							ColorYAMMDiagram.clear();
						}
					});
				}
				
				createEnumerations_Init();
				
				// load from Objectdiagram
				modelSynchronizer = new ModelSynchronizer(reflectivStateChart);
				modelSynchronizer.loadFromObjectDiagram();
				
				loadStatemachines_Init();
				initStatemachineHandlers();
								
				// select start phase
				if (desInitStatemachineHandler != null)
				{
					reflectivStateChart.stateNR = startPhaseDesInit;
					break;
				}
				if (!initalActiveStatemachinesHandler.isEmpty())
				{
					reflectivStateChart.stateNR = startPhaseNormal;
					break;
				}
				if (!reflectivStateChart.objectManagement.simulationObjectInsances.get(1).isEmpty())
				{
					reflectivStateChart.stateNR = startPhaseDes;
					break;
				}
				
				logger.error("no inital active(which is not an observer), no desinitializer, no SimualtionObject instance");
				reflectivStateChart.stateNR = finalstate;
				break;
			}
			
			case startPhaseDesInit: {
				phase = Phase.desInit;

				if (LaunchDelegate.debugMode && layer == 0)
					keepDebugModelUpToDate((YStateMachineHandler) desInitStatemachineHandler, true);
				
				om.set(globalStateMachine, new BasicEList<EObject>(), "stateMachineHandlers");
					
				activeStateMachineHandler = desInitStatemachineHandler;
				
				reflectivStateChart.stateNR = StateMachinesNotSwitchedYet;
				break;
				
			}
			
			case startPhaseDes: {
				desPhaseExecutedAtLeastOnes = true;
				if (phase != Phase.des)
					lastPhase = phase;
				phase = Phase.des;
				
				if (desRootSMH == null)
				{
					createDesRootThread();
				}

				simObjects = new ArrayList<>(reflectivStateChart.objectManagement.simulationObjectInsances.get(1));

				om.set(globalStateMachine, new BasicEList<EObject>(), "stateMachineHandlers");

				// create all SMH(opCall)
				for (EObject simObj : simObjects)
				{
					simulateSMH = (YStateMachineHandler) execute.createInstance
							.createInstance("YStateMachineHandler", 0);						
					om.add(globalStateMachine, simulateSMH, "stateMachineHandlers");
					simulateSMH.setObjectsToColor(new ObjectsToColor());

					metaData = execute.reflectivStateChart.objectManagement.eClassifierToYClassifier.get(simObj.eClass());
					simulateOperation = findSimulateOperaton(metaData);
					if (simulateOperation == null)
					{
						logger.error("no simulate operation found in class " + metaData);
						simulateOperation = findSimulateOperaton(metaData);
						reflectivStateChart.stateNR = finalstate;
						break;
					}
					classObjectID = (String) execute.reflectivStateChart.objectManagement.get(simulateOperation, "clazz", "name")
							+ (String) execute.reflectivStateChart.objectManagement.get(simulateOperation, "name")
							+ (String) execute.reflectivStateChart.objectManagement.get(simulateOperation, "ObjectID");	
					newClassID = execute.getID.getID(classObjectID, 0);
					opClass = (EObject) execute.maps[1].get(newClassID);
					om.set(opClass, simObj, "itsRmofClass");					
					om.set(simulateSMH, newClassID, "itsClassID");
					om.set(simulateSMH, execute.reflectivStateChart.objectManagement.get(simulateOperation, "stateMachine"), "stateMachine");

					om.set(simulateSMH, desRootSMH, "calledFrom");
					
					timeStepParameter = ((EList<YParameter>) execute.reflectivStateChart.objectManagement.get(simulateOperation,
							"ownedParameter")).get(0);		
					om.set(opClass, globalStateMachine.getInternal().getSimulationTime(), (String) execute.reflectivStateChart.objectManagement.get(timeStepParameter, "name"));
				}				
				
				allSimulateOperationsReturnedFalse = true;
				
				smhCounter = 0;
				activeStateMachineHandler = ((List<EObject>) om.get(globalStateMachine, "stateMachineHandlers")).get(smhCounter);
				reflectivStateChart.stateNR = StateMachinesNotSwitchedYet;
				break;
			}
			
			case startPhaseObserver: {
				lastPhase = phase;
				phase = Phase.observer;
				
				om.set(globalStateMachine, new BasicEList<EObject>(), "stateMachineHandlers");
				for (EObject smh : observerStatemachinesHandler) {
					om.add(globalStateMachine, smh, "stateMachineHandlers");
				}
				smhCounter = 0;
				
				reflectivStateChart.stateNR = StateMachinesNotSwitchedYet;
				break;
			}
			
			case startPhaseNormal: {
				logger.trace("startPhaseNormal");
				
				
				noNormalSMHs = true;
				// get SMHs (initialActive and created in opCall(not suspended ones)) --> find all in layerinformation
				om.set(globalStateMachine, new BasicEList<EObject>(), "stateMachineHandlers");
				for (EObject smh : om.getEObjects(0, "YStateMachineHandler")) {
					if (!(Boolean) om.get(smh, "isSuspended") && om.get(smh, "stateMachine", "rtc") != YRunToCompletion.OBSERVER) {
						om.add(globalStateMachine, smh, "stateMachineHandlers");
						noNormalSMHs = false;
					}
				}
				smhCounter = 0;
				
				if (noNormalSMHs)
				{
					if ((!desPhaseExecutedAtLeastOnes && !reflectivStateChart.objectManagement.simulationObjectInsances.get(1).isEmpty()) 
							|| (!reflectivStateChart.objectManagement.simulationObjectInsances.get(1).isEmpty()
									&& !om.eventQueue.get(1).isEmpty()))
					{
						reflectivStateChart.stateNR = startPhaseDes;
						break;
					}
					reflectivStateChart.stateNR = finalstate;
					break;
				}
				lastPhase = phase;
				phase = Phase.normal;
				reflectivStateChart.stateNR = StateMachinesNotSwitchedYet;
				break;
			}
			
			case executingStateMachines: {
				logger.trace("executingStateMachines");
				if (phase == Phase.normal)
				{
					List<EObject> SMHs = ((List<EObject>) om.get(globalStateMachine, "stateMachineHandlers"));
					if (smhCounter >= SMHs.size())
					{
						if (!observerStatemachinesHandler.isEmpty())
						{
							reflectivStateChart.stateNR = startPhaseObserver;
							break;
						}
						else if ((!desPhaseExecutedAtLeastOnes && !reflectivStateChart.objectManagement.simulationObjectInsances.get(1).isEmpty()) 
								|| (!reflectivStateChart.objectManagement.simulationObjectInsances.get(1).isEmpty()
										&& !om.eventQueue.get(1).isEmpty()))
						{
							reflectivStateChart.stateNR = startPhaseDes;
							break;
						}
						reflectivStateChart.stateNR = startPhaseNormal;
						break;
					}
					else
					{
						reflectivStateChart.stateNR = StateMachinesNotSwitchedYet;
						break;
					}
				}
				if (phase == Phase.observer)
				{
					SMHs = ((List<EObject>) om.get(globalStateMachine, "stateMachineHandlers"));
					if (smhCounter >= SMHs.size())
					{
						if (lastPhase == Phase.normal)
						{
							if ((!desPhaseExecutedAtLeastOnes && !reflectivStateChart.objectManagement.simulationObjectInsances.get(1).isEmpty()) 
									|| (!reflectivStateChart.objectManagement.simulationObjectInsances.get(1).isEmpty()
											&& !om.eventQueue.get(1).isEmpty()))
							{
								reflectivStateChart.stateNR = startPhaseDes;
								break;
							}
						}
						reflectivStateChart.stateNR = startPhaseNormal;
						break;
					}
					else
					{
						reflectivStateChart.stateNR = StateMachinesNotSwitchedYet;
						break;
					}
				}
				if (phase == Phase.desInit)
				{
					if (!observerStatemachinesHandler.isEmpty())
					{
						reflectivStateChart.stateNR = startPhaseObserver;
						break;
					}
					reflectivStateChart.stateNR = startPhaseNormal;
					break;
				}
				if (phase == Phase.des) 
				{
					SMHs = ((List<EObject>) om.get(globalStateMachine, "stateMachineHandlers"));
					if (smhCounter >= SMHs.size())
					{
						if (allSimulateOperationsReturnedFalse)
						{
							currentSimTime = globalStateMachine.getInternal().getSimulationTime();
							nextSimTime = -1;
							for (EObject event : om.eventQueue.get(1))
							{
								timeStep = (Integer) om.get(event, "timeStep");
								if (timeStep > currentSimTime && (nextSimTime == -1 || timeStep < nextSimTime))
									nextSimTime = timeStep;
							}

							reflectivStateChart.setTimeStep(nextSimTime);
							globalStateMachine.getInternal().setSimulationTime(nextSimTime);
							if (!observerStatemachinesHandler.isEmpty())
							{
								reflectivStateChart.stateNR = startPhaseObserver;
								break;
							}
							reflectivStateChart.stateNR = startPhaseNormal;
							break;
						}
						else
						{
							reflectivStateChart.stateNR = startPhaseDes;
							break;
						}
					}
					else
					{
						activeStateMachineHandler = ((List<EObject>) om.get(globalStateMachine, "stateMachineHandlers")).get(smhCounter);
						reflectivStateChart.stateNR = StateMachinesNotSwitchedYet;
						break;
					}
				}
			}
			
			case StateMachinesNotSwitchedYet: {
				logger.trace("StateMachinesNotSwitchedYet");
				
				if (phase == Phase.normal || phase == Phase.observer)
				{
					activeStateMachineHandler = ((List<EObject>) om.get(globalStateMachine, "stateMachineHandlers")).get(smhCounter);

					if (LaunchDelegate.debugMode)
						keepDebugModelUpToDate((YStateMachineHandler) activeStateMachineHandler, null);

					if (om.get(activeStateMachineHandler, "state") != null) {
						if ((Integer) om.get(activeStateMachineHandler, "effectCount") < (Integer) om.get(activeStateMachineHandler,
								"effectNo")) {

							reflectivStateChart.stateNR = beforeExcuteSubEffectsIdentified;
							break;
						} else {
							if ((Integer) om.get(activeStateMachineHandler, "effectNo") != 0)
								reflectivStateChart.stateNR = assignmentdone;
							else
								reflectivStateChart.stateNR = StateIdentified;
							break;
						}
					} else {
						stateMachine = (EObject) om.get(activeStateMachineHandler, "stateMachine");
						for (EObject pseudostate2 : om.getEObjects(0,
								"YPseudostate-container-".concat((String) om.get(stateMachine, "ObjectID")))) {
							if (om.get(pseudostate2, "container") == stateMachine) {
								om.set(activeStateMachineHandler, pseudostate2, "state");
								break;
							}
						}
						if (om.get(activeStateMachineHandler, "state") == null) {
							logger.error("Could not find initial PseudoState in State Machine \""
									.concat((String) om.get(stateMachine, "name")).concat("\"!"));
							if (executedAsGraphicalSimulation) {
								// LayerView.actionStop(true); TODO remove
								LayerView.getSimulationState().stop(true);
							}
							reflectivStateChart.stateNR = finalstate + 1;
							break;
						}
						om.set(activeStateMachineHandler, 0, "effectCount");
						reflectivStateChart.stateNR = StateIdentified;
						break;
					}
				}
				if (phase == Phase.desInit || phase == Phase.des)
				{	
					if (LaunchDelegate.debugMode)
					{
						if (phase == Phase.desInit)
						{
						if (om.get(activeStateMachineHandler, "calledFrom") != null)
							keepDebugModelUpToDate((YStateMachineHandler) activeStateMachineHandler, false);
						else
							keepDebugModelUpToDate((YStateMachineHandler) activeStateMachineHandler, true);
						}
						else // Phase.des
						{
//							if (om.get(activeStateMachineHandler, "calledFrom") != desRootSMH)
								keepDebugModelUpToDate((YStateMachineHandler) activeStateMachineHandler, false);
//							else
//								keepDebugModelUpToDate((YStateMachineHandler) activeStateMachineHandler, true);
						}
					}
					
					if (om.get(activeStateMachineHandler, "state") != null) {
						if ((Integer) om.get(activeStateMachineHandler, "effectCount") < (Integer) om.get(activeStateMachineHandler,
								"effectNo")) {

							reflectivStateChart.stateNR = beforeExcuteSubEffectsIdentified;
							break;
						} else {
							if ((Integer) om.get(activeStateMachineHandler, "effectNo") != 0)
								reflectivStateChart.stateNR = assignmentdone;
							else
								reflectivStateChart.stateNR = StateIdentified;
							break;
						}
					} else {
						stateMachine = (EObject) om.get(activeStateMachineHandler, "stateMachine");
						try {
							for (EObject pseudostate2 : om.getEObjects(0,
									"YPseudostate-container-".concat((String) om.get(stateMachine, "ObjectID")))) {
								if (om.get(pseudostate2, "container") == stateMachine) {
									om.set(activeStateMachineHandler, pseudostate2, "state");
									break;
								}
							}
						} catch (Exception e) {
							e.printStackTrace();
						}

						if (om.get(activeStateMachineHandler, "state") == null) {
							logger.error("Could not find initial PseudoState in State Machine \""
									.concat((String) om.get(stateMachine, "name")).concat("\"!"));
							if (executedAsGraphicalSimulation) {
								// LayerView.actionStop(true); TODO remove
								LayerView.getSimulationState().stop(true);
							}
							reflectivStateChart.stateNR = finalstate + 1;
							break;
						}
						om.set(activeStateMachineHandler, 0, "effectCount");
						reflectivStateChart.stateNR = StateIdentified;
						break;
					}
				}
			}
			
			case StateIdentified: {
				logger.trace("StateIdentified");

				vertex = (EObject) om.get(activeStateMachineHandler, "state");

				if (vertex instanceof YFinalState || "YFinalState".equals(vertex.eClass().getName()))
				{
					//  set return value
					returnValue = om.get(activeStateMachineHandler, "returnVar");
					nameOfRetunVar = om.getGen(activeStateMachineHandler, "nameOfRetunVar");
					if (phase == Phase.des && om.get(activeStateMachineHandler, "calledFrom") == desRootSMH) {
						if ((Boolean) returnValue)
							allSimulateOperationsReturnedFalse = false;
					}
					else if (nameOfRetunVar != null && !"".equals(nameOfRetunVar)) {
						itsClassID = (String) om.get(activeStateMachineHandler, "calledFrom", "itsClassID");
						operationClass = execute.maps[1].get(itsClassID);
						om.set(operationClass, returnValue, nameOfRetunVar.split("\\."));
					}

					itsClassID = (String) om.get(activeStateMachineHandler, "itsClassID");
					operationClass = execute.maps[1].get(itsClassID);
					//  deregister inAdapter
					inAdapters = (EList) om.get(activeStateMachineHandler, "inAdapters");
					for (Object adapter : inAdapters) {
						for (Notifier target : ((InoutAdapter)adapter).getTargets()) {
							target.eAdapters().remove(adapter);
						}
					}

					if (activeStateMachineHandler.equals(reflectivStateChart.execute.pauseExecution.stateMachineHandler)) {
						reflectivStateChart.execute.pauseExecution.stepOver = false;
						reflectivStateChart.execute.pauseExecution.stepReturn = false;
					}
					// Nach einem Operationsaufruf muss entsprechend aufgerÃ¯Â¿Â½umt werden.
					calledFromNothing = false;
					if (phase == Phase.des && om.get(activeStateMachineHandler, "calledFrom") == desRootSMH)
					{
						if (LaunchDelegate.debugMode)
						{
							keepDebugModelUpToDate((YStateMachineHandler) activeStateMachineHandler, false);
							keepDebugModelUpToDate(desRootSMH, false);
						}
						calledFromNothing = true;
					}
					if (phase != Phase.des && om.get(activeStateMachineHandler, "calledFrom") == null)
					{
						calledFromNothing = true;
					}
					
					
					if (!calledFromNothing) {
						om.set(activeStateMachineHandler, true, "isSuspended");
						om.set(activeStateMachineHandler, false, "calledFrom", "isSuspended");

						om.set(activeStateMachineHandler,
								((Integer) om.get(activeStateMachineHandler, "calledFrom", "effectCount")) + 1, "calledFrom",
								"effectCount");
						om.set(activeStateMachineHandler, null, "calledFrom", "operationInstance");

						if (phase == Phase.desInit || phase == Phase.des)
						{							
							activeStateMachineHandler = om.getGen(activeStateMachineHandler, "calledFrom");
							reflectivStateChart.stateNR = StateMachinesNotSwitchedYet;
							break;
						}
						else
						{
							smhCounter++;
							reflectivStateChart.stateNR = executingStateMachines;
							break;
						}

					} else {
						if (om.get(activeStateMachineHandler, "stateMachine", "rtc").toString().equals("observer"))
						{
							// reset SMH
							om.set(activeStateMachineHandler, null, "state");
							om.set(activeStateMachineHandler, null, "transition");						
						}
						else
						{		
							if (phase != Phase.des)
							{
								if (LaunchDelegate.debugMode)
									terminateYAMMDebugThread((YStateMachineHandler) activeStateMachineHandler);
							}
							om.set(activeStateMachineHandler, true, "isSuspended");
						}	
						if (phase == Phase.desInit)
						{
							reflectivStateChart.stateNR = executingStateMachines;
						}
						else
						{
							smhCounter++;
							reflectivStateChart.stateNR = executingStateMachines;
						}

						break;
					}

				}
				else if (!(vertex instanceof YFinalState) && !"YFinalState".equals(vertex.eClass().getName()))
				{
					transitions = om.getEObjects(0, "source-".concat((String) om.get(vertex, "ObjectID")));
					stateExitNo = transitions.size();
					if (stateExitNo == 0) {
						logger.error("No outgoing transition found on layer 1 - breaking up!");
						if (executedAsGraphicalSimulation) {
							LayerView.getSimulationState().stop(true);
						}
						reflectivStateChart.stateNR = finalstate + 1;
					} else {
						om.set(activeStateMachineHandler, transitions.get(0), "transition");

						// blue transitions also when waittime set
						isWaitTimeSet = false;
						if (LayerView.isWaitTimeSet())
							isWaitTimeSet = true;

						if (reflectivStateChart.breakpoint || isWaitTimeSet) {
							if (reflectivStateChart.simulationInStepMode || isWaitTimeSet) {
								reflectivStateChart.simulationInStepMode = false;
								// color all next transitions ang guars (all blue)
								colorObj = (ObjectsToColor) om.get(activeStateMachineHandler,
										"objectsToColor");
								colorObj.clearEffects();
								for (EObject transition : transitions) {
									colorObj.addTransition((String) om.get(transition, "ObjectID"), 3); // blue
									attachment = null;
									if ((attachment = (EObject) om.get(transition, "attachment")) != null) {
										colorObj.addGuard((String) om.get(attachment, "ObjectID"), 3); // blue
									}
								}

							}

							if (ConfigurationManagement.isColoring() && !reflectivStateChart.wait || isWaitTimeSet) {
								if (Display.getDefault().getThread() != Thread.currentThread()) {
									Display.getDefault().asyncExec(new Runnable() {
										public void run() {
											ColorYAMMDiagram.colorStatemachine(activeStateMachineHandler);
										}
									});
								} else {
									Display.getDefault().syncExec(new Runnable() {
										public void run() {
											ColorYAMMDiagram.colorStatemachine(activeStateMachineHandler);
										}
									});
								}
							}

							if (!isWaitTimeSet) // do set flags when simulation runs with waittime set!
							{
								reflectivStateChart.wait = false;
								reflectivStateChart.transitionBreak = true;
							}

							if (isWaitTimeSet) // do not exit reflectivChart() when simulation runs with waittime set!
							{
								// give the time for showing blue-colored Transitions and guards (otherwise
								// would turn red directly)
								try {
									numberMillis = ((Layer) om.getViewLayers().get(0)).getWaittime();
									Thread.sleep(numberMillis); // time according to the waittime set by the user
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
								reflectivStateChart.stateNR = TransitionIdentified;
								break;
							}
							reflectivStateChart.stateNR = finalstate + 1;
							break;

						}
						reflectivStateChart.stateNR = TransitionIdentified;
					}
					break;

				}
			}

			case TransitionIdentified: {
				logger.trace("TransitionIdentified");

				// set smhc for opCall to find the appropriate SMH to suspend
				om.set(globalStateMachine, smhCounter, "stateMachineHandlerCount");

				itsClassId = (String) om.get(activeStateMachineHandler, "itsClassID");
				outgoingtTranstions = new BasicEList<EObject>(
						(Collection) om.get(activeStateMachineHandler, "state", "outgoing"));

				//					outgoingtTranstions.forEach(transition -> swap(outgoingtTranstions, guardRand.nextInt(outgoingtTranstions.size()), transition));
				Collections.shuffle(outgoingtTranstions, guardRand);

				evaluatedGuard = false;
				guardsFalse = new ArrayList<EObject>();

				for (EObject transition : outgoingtTranstions) {

					om.set(activeStateMachineHandler, transition, "transition");
					attachment = (EObject) om.get(transition, "attachment");
					if (attachment != null) {
						guard = (EObject) om.get(attachment, "guard");

						evaluatedGuard = attachment == null || guard == null ? true
								: execute.evalGuard(itsClassId, transition, 0);
					} else {
						evaluatedGuard = true;
					}

					if (evaluatedGuard) {
						break;
					} else {
						guardsFalse.add(transition);
					}

				}

				outgoingtTranstions.removeAll(guardsFalse);
				outgoingtTranstions.remove(om.get(activeStateMachineHandler, "transition"));
				guardsNotChecked = new ArrayList<EObject>(outgoingtTranstions);

				if (evaluatedGuard) {
					if (om.get(activeStateMachineHandler, "transition", "attachment") != null) {
						om.set(activeStateMachineHandler,
								((EList<EObject>) om.get(activeStateMachineHandler, "transition", "attachment", "effects"))
								.size(),
								"effectNo");
					} else {
						om.set(activeStateMachineHandler, 0, "effectNo");
					}

					colorObj = (ObjectsToColor) om.get(activeStateMachineHandler, "objectsToColor");

					colorObj.setTransition((String) om.get(activeStateMachineHandler, "transition", "ObjectID"), 1); // red
					colorObj.setState((String) om.get(activeStateMachineHandler, "transition", "target", "ObjectID"), 1); // green
					colorObj.clearGuards();

					for (EObject guardFalse : guardsFalse) {
						attachment = (EObject) om.get(guardFalse, "attachment");
						if (attachment != null)
							colorObj.addGuard((String) om.get(attachment, "ObjectID"), 1); // green
					}

					for (EObject guardNotChecked : guardsNotChecked) {
						attachment = (EObject) om.get(guardNotChecked, "attachment");
						if (attachment != null)
							colorObj.addGuard((String) om.get(attachment, "ObjectID"), 3); // blue
					}
					attachment = (EObject) om.get(activeStateMachineHandler, "transition", "attachment");
					if (attachment != null)
						colorObj.addGuard((String) om.get(attachment, "ObjectID"), 2); // green

					if (reflectivStateChart.simulationInStepMode) {
						if (ConfigurationManagement.isColoring() && !reflectivStateChart.wait) {
							if (Display.getDefault().getThread() != Thread.currentThread()) {
								Display.getDefault().asyncExec(new Runnable() {
									public void run() {
										ColorYAMMDiagram.colorStatemachine(activeStateMachineHandler);
									}
								});
							} else {
								Display.getDefault().syncExec(new Runnable() {
									public void run() {
										ColorYAMMDiagram.colorStatemachine(activeStateMachineHandler);
									}
								});
							}
						}
					}
					reflectivStateChart.stateNR = beforeExcuteSubEffectsIdentified;
					break;

				} else {
					smhCounter++;
					if (phase == Phase.des || phase == Phase.desInit)
					{
						logger.error("no outgoing transition is true");
						reflectivStateChart.stateNR = finalstate;
						break;
						// TODO:
//						EObject smh = activeStateMachineHandler;
//						while (om.getGen(smh, "calledFrom") != null)
//						{
//							om.set(smh, true, "isSuspended");
//							smh = om.getGen(smh, "calledFrom");
//							if (LaunchDelegate.debugMode)
//								keepDebugModelUpToDate((YStateMachineHandler) smh, null);
//						}
//
//						if (LaunchDelegate.debugMode)
//							terminateYAMMDebugThread((YStateMachineHandler) smh);

					}
					reflectivStateChart.stateNR = executingStateMachines;
					break;
				}
			}
			
			case SubEffectIdentified: {
				logger.trace("SubEffectIdentified");

				// set smhc for opCall to find the appropriate SMH to suspend
				om.set(globalStateMachine, smhCounter, "stateMachineHandlerCount");

				effectCount = (Integer) om.get(activeStateMachineHandler, "effectCount");

				if (effectCount < (Integer) om.get(activeStateMachineHandler, "effectNo")) 
				{
					execute.evalEffect((String) om.get(activeStateMachineHandler, "itsClassID"),
							om.get(activeStateMachineHandler, "transition"), effectCount, 0);
					om.set(activeStateMachineHandler, ((Integer) om.get(activeStateMachineHandler, "effectsProcessed")) + 1,
							"effectsProcessed");

					if (!execute.reflectivStateChart.resourceManagement.threads) {
						// execute.pauseExecution.pause(1000, 0); //is never 1000ms TODO
						if (reflectivStateChart.stateNR == finalstate) {
							break;
						}
						// breakpoints
						if (reflectivStateChart.breakpoint) {
							reflectivStateChart.stateNR = OperationIdentified;
							break;
						}
					}
					reflectivStateChart.stateNR = OperationIdentified;
					break;
				} else {
					reflectivStateChart.stateNR = assignmentdone;
					break;
				}
			}

			case OperationIdentified: {
				logger.trace("OperationIdentified");

				effectCount = (Integer) om.get(activeStateMachineHandler, "effectCount");
				color = effectCount + 1 < (Integer) om.get(activeStateMachineHandler, "effectNo");
				
				colorObj2 = (ObjectsToColor) om.get(activeStateMachineHandler, "objectsToColor");
				colorObj2.clearEffects();

				if (color && reflectivStateChart.simulationInStepMode) {
					effectObject2 = ((EList<EObject>) om.get(activeStateMachineHandler, "transition", "attachment",
							"effects")).get(effectCount + 1);

					attachmentIdAndEffectId = new AttachmentIdAndEffectId();
					attachmentIdAndEffectId.effectId = (String) om.get(effectObject2, "ObjectID");
					attachmentIdAndEffectId.attachmentId = (String) om.get(activeStateMachineHandler, "transition",
							"attachment", "ObjectID");
					if (LayerView.yamm.reflectivStateChart.execute.pauseExecution.stepOver)
						colorObj2.setEffect(attachmentIdAndEffectId, 1); // red
					else
						colorObj2.setEffect(attachmentIdAndEffectId, 2); // pink

					// color all cached colorElements
					if (ConfigurationManagement.isColoring() && !reflectivStateChart.wait) {
						if (Display.getDefault().getThread() != Thread.currentThread()) {
							Display.getDefault().asyncExec(new Runnable() {
								public void run() {
									ColorYAMMDiagram.colorStatemachine(activeStateMachineHandler);
								}
							});
						} else {
							Display.getDefault().syncExec(new Runnable() {
								public void run() {
									ColorYAMMDiagram.colorStatemachine(activeStateMachineHandler);
								}
							});
						}
					}
				}
				
				if (!om.<Boolean>getGen(activeStateMachineHandler, "isSuspended")) {
					om.set(activeStateMachineHandler, ((Integer) om.get(activeStateMachineHandler, "effectCount")) + 1,
							"effectCount");
					reflectivStateChart.stateNR = assignmentdone;

				} else { // was opcall		
					if (phase == Phase.normal || phase == Phase.observer)
					{
						smhCounter++;
						reflectivStateChart.stateNR = executingStateMachines;
					}
					else if (phase == Phase.des || phase == Phase.desInit)
					{
						activeStateMachineHandler = opCallStateMachineHandler;
						reflectivStateChart.stateNR = StateMachinesNotSwitchedYet;
					}
				}
				
				break;
			}
			
			case assignmentdone: {
				logger.trace("assignmentdone");
				if (phase == Phase.normal || phase == Phase.observer)
				{
					if (((Integer) om.get(activeStateMachineHandler, "effectCount")).intValue() < ((Integer) om.get(activeStateMachineHandler,
							"effectNo")).intValue()) {
						rtc = om.get(activeStateMachineHandler, "stateMachine", "rtc").toString();
						if (phase == Phase.observer) {
							reflectivStateChart.stateNR = beforeExcuteSubEffectsIdentified;
							break;
						}
						if (rtc.equals("statemachine")) {
							reflectivStateChart.stateNR = beforeExcuteSubEffectsIdentified;
							break;
						}
						if (!rtc.equals("effect")) { //  transition
							reflectivStateChart.stateNR = beforeExcuteSubEffectsIdentified;
							break;
						} else {
							smhCounter++;
							reflectivStateChart.stateNR = executingStateMachines;
							break;
						}
					} else {
						om.set(activeStateMachineHandler, om.get(activeStateMachineHandler, "transition", "target"), "state");	
						om.set(activeStateMachineHandler, 0, "effectCount");
						om.set(activeStateMachineHandler, 0, "effectNo");
						
						reflectivStateChart.stateNR = EffectsExecuted;
						break;
					}
				}
				if (phase == Phase.desInit || phase == Phase.des)
				{
					if (((Integer) om.get(activeStateMachineHandler, "effectCount")).intValue() < ((Integer) om.get(activeStateMachineHandler,
							"effectNo")).intValue())
					{
						reflectivStateChart.stateNR = beforeExcuteSubEffectsIdentified;
						break;
					}
					else
					{
						om.set(activeStateMachineHandler, om.get(activeStateMachineHandler, "transition", "target"), "state");
						om.set(activeStateMachineHandler, 0, "effectCount");
						om.set(activeStateMachineHandler, 0, "effectNo");
						reflectivStateChart.stateNR = EffectsExecuted;
						break;
					}
				}
			}
			
			case EffectsExecuted: {
				logger.trace("EffectsExecuted");
				if (phase == Phase.normal)
				{
					rtc = om.get(activeStateMachineHandler, "stateMachine", "rtc").toString();
					if (!rtc.equals("statemachine")) {
						smhCounter++;
						reflectivStateChart.stateNR = executingStateMachines;
						break;
					}
					if (rtc.equals("statemachine")) {
						reflectivStateChart.stateNR = StateIdentified;
						break;
					}
				}
				else if (phase == Phase.observer || phase == Phase.des || phase == Phase.desInit)
				{
					reflectivStateChart.stateNR = StateIdentified;
					break;
				}
			}			
			
			case beforeExcuteSubEffectsIdentified: {
				logger.trace("beforeExcuteSubEffectsIdentified");

				if (!execute.reflectivStateChart.resourceManagement.threads) {
					propertyBreakpointIsSet = false; // Effect's property 'breakpoint' is set?
					breakpointsInLayerViewActivated = false; // all Breakpoints enabled in Layer View?
					isBreakpoint = false; // if property is set and breakpoints enabled

					if ((attachment = (EObject) om.get(activeStateMachineHandler, "transition", "attachment")) != null) {
						effects = (EList<EObject>) om.get(attachment, "effects");
						if (effects != null && !effects.isEmpty()) {
							effectCount2 = (Integer) om.get(activeStateMachineHandler, "effectCount");
							effectObject2 = effects.get(effectCount2);

							// to be sure that the model element has the option 'breakpoint' in the
							// properties view
							if (om.get(effectObject2, "breakpoint") != null) {
								// Effect's property 'breakpoint' is set?
								propertyBreakpointIsSet = (Boolean) om.get(effectObject2, "breakpoint");
								// all Breakpoints enabled in Layer View?
								breakpointsInLayerViewActivated = om.getViewLayers().get(0).isBreakpoint();
								if (propertyBreakpointIsSet && breakpointsInLayerViewActivated
										&& !LayerView.isWaitTimeSet())
									isBreakpoint = true;

								if (isBreakpoint) {
									reflectivStateChart.execute.chartOperation.breakpoint();
									if (LaunchDelegate.debugMode) {
										activeAdapter = YAMMVariableAdapter.getAdapterOfActiveSM();
										debugTarget = activeAdapter.getYAMMDebugTarget();
										debugTarget.setActiveYAMMThread(activeAdapter.threadId);
										LayerView.setStep(true);
										LayerView.setBreakpointIsHit(true);
										debugTarget.arrangeThreads(activeAdapter.threadId, true);
									}

								}
							}
							colorObj = (ObjectsToColor) om.get(activeStateMachineHandler, "objectsToColor");
							attachmentIdAndEffectId = new AttachmentIdAndEffectId();
							attachmentIdAndEffectId.effectId = (String) om.get(effectObject2, "ObjectID");
							attachmentIdAndEffectId.attachmentId = (String) om.get(activeStateMachineHandler, "transition",
									"attachment", "ObjectID");
							colorObj.setEffect(attachmentIdAndEffectId, 1); // red
						}
					}

					execute.pauseExecution.pause(1000, 0, activeStateMachineHandler); // is never 1000ms TODO

					if (reflectivStateChart.stateNR == finalstate) {
						break;
					}
					// breakpoints
					if (reflectivStateChart.breakpoint) {
						if (reflectivStateChart.simulationInStepMode || isBreakpoint) // color the Effect if simulation
							// is in step mode or Effect's
							// property 'breakpoint' is set
						{
							// color all cached colorElements
							if (ConfigurationManagement.isColoring() && !reflectivStateChart.wait) {
								if (Display.getDefault().getThread() != Thread.currentThread()) {
									Display.getDefault().asyncExec(new Runnable() {
										public void run() {
											ColorYAMMDiagram.colorStatemachine(activeStateMachineHandler);
										}
									});
								} else {
									Display.getDefault().syncExec(new Runnable() {
										public void run() {
											ColorYAMMDiagram.colorStatemachine(activeStateMachineHandler);
										}
									});
								}
							}
						}

						reflectivStateChart.simulationInStepMode = false;
						reflectivStateChart.transitionBreak = false;

						reflectivStateChart.wait = false;
						reflectivStateChart.stateNR = finalstate + 1;

						if (!LayerView.runWaitTime) {
							LayerView.setStartButtonsEnabledState(true, null);
						}
						break;
					}
				}
				reflectivStateChart.stateNR = SubEffectIdentified;
				break;
			}
			
			case finalstate: {
				logger.trace("finalstate");
		
				reflectivStateChart.setSimulationIsRunning(false);
				//  print test result:
//				if (!execute.testUtil.tests.isEmpty())
//					execute.testUtil.printResult();
				if (loggingActive) {
					logger.info("Reached FinalState.");
				}

				if (ConfigurationManagement.isColoring()) {
					Display.getDefault().syncExec(new Runnable() {
						@Override
						public void run() {
							ColorYAMMDiagram.clear();
						}
					});
				}
				reflectivStateChart.stateNR++;

				if (executedAsGraphicalSimulation) {
					LayerView.blueStop();
				}

				break;
			}
			}
		} while (reflectivStateChart.stateNR != finalstate + 1);
	}

	private void createDesRootThread() {
		String itsClassId = "DES";
		
		desRootSMH = YammFactory.eINSTANCE.createYStateMachineHandler();
		desRootSMH.setItsClassID(itsClassId);
		desRootSMH.setObjectID("desSMH");
		YOperation desDummyOp = YammFactory.eINSTANCE.createYOperation();
		desDummyOp.setName("DESDummyOp");
		YStateMachine desDummyStatemachine = YammFactory.eINSTANCE.createYStateMachine();
		desDummyOp.setStateMachine(desDummyStatemachine);
		desDummyStatemachine.setOperation(desDummyOp);
		desDummyStatemachine.setInitialActive(true);
		desRootSMH.setStateMachine(desDummyStatemachine);
		
		EPackage desDummyPackage = EcoreFactory.eINSTANCE.createEPackage();
		EClass desDummyClass = EcoreFactory.eINSTANCE.createEClass();
		desDummyPackage.getEClassifiers().add(desDummyClass);
		EClass desDummyOperationClass = EcoreFactory.eINSTANCE.createEClass();
		desDummyPackage.getEClassifiers().add(desDummyOperationClass);
		EReference itsRmofClassRef = EcoreFactory.eINSTANCE.createEReference();
		itsRmofClassRef.setName("itsRmofClass");
		itsRmofClassRef.setEType(desDummyClass);
		desDummyOperationClass.getEStructuralFeatures().add(itsRmofClassRef);
		
		EObject desDummyInstance = desDummyPackage.getEFactoryInstance().create(desDummyClass);
		EObject desDummyOperationInstance = desDummyPackage.getEFactoryInstance().create(desDummyOperationClass);				
		desDummyOperationInstance.eSet(itsRmofClassRef, desDummyInstance);	
		
		execute.maps[1].put(itsClassId, desDummyOperationInstance);
		
		if (LaunchDelegate.debugMode)
		{
			try {
				keepDebugModelUpToDate(desRootSMH, true);
			} catch (DebugException e) {
				e.printStackTrace();
			}
		}
	}

	private void initStatemachineHandlers() {
		desInitStatemachineHandler = null;
		initalActiveStatemachinesHandler = new ArrayList<>();
		observerStatemachinesHandler = new ArrayList<>();
		
		for (EObject initialActiveSM : initalActiveStatemachines)
		{
			EObject smh =  createStatemachineHandler(initialActiveSM);
			initalActiveStatemachinesHandler.add(smh);
			createItsYammClassObjectAndOperationObject(initialActiveSM, smh);
		}
		
		for (EObject observerSM : observerStatemachines)
		{
			EObject smh = createStatemachineHandler(observerSM);
			observerStatemachinesHandler.add(smh);
			createItsYammClassObjectAndOperationObject(observerSM, smh);
		}
		
		if (desInitStatemachine != null)
		{
			desInitStatemachineHandler = createStatemachineHandler(desInitStatemachine);
			createItsYammClassObjectAndOperationObject(desInitStatemachine, desInitStatemachineHandler);
			
			if (reflectivStateChart.parameter != null)
			{
				String id = (String) om.get(desInitStatemachineHandler, "itsClassID");
				EObject operationClass = execute.maps[1].get(id);
				EClass operationMetaData = operationClass.eClass();
				for (Entry<String, String> paramEntry : reflectivStateChart.parameter.entrySet())
				{
					if (paramEntry.getValue() != null && !paramEntry.getValue().isEmpty())
					{
						EStructuralFeature paramFeature = operationMetaData.getEStructuralFeature(paramEntry.getKey());
						if (paramFeature != null)
						{
							String value = paramEntry.getValue();

							EClassifier type = paramFeature.getEType();

							if (type == EcorePackage.Literals.EINT)
							{
								try {
									operationClass.eSet(paramFeature, Integer.parseInt(paramEntry.getValue()));
								} finally {}	
							}
							else if (type == EcorePackage.Literals.EBOOLEAN)
							{
								if ("true".equals(paramEntry.getValue().toLowerCase()))
									operationClass.eSet(paramFeature, "true");
								else
									operationClass.eSet(paramFeature, "false");
							}
							else if (type == EcorePackage.Literals.ESTRING)
							{
								operationClass.eSet(paramFeature, paramEntry.getValue());
							}
							else if (type == EcorePackage.Literals.EFLOAT)
							{
								try {
									operationClass.eSet(paramFeature, Float.parseFloat(paramEntry.getValue()));
								} finally {}
							}
							else if (type == EcorePackage.Literals.EDOUBLE)
							{
								try {
									operationClass.eSet(paramFeature, Double.parseDouble(paramEntry.getValue()));
								} finally {}
							}				
						}
					}
				}
			}
			
		}
	}
	
	private boolean loadStatemachines_Init()
	{
		boolean initalActiveOrDesInitialzerExists = false;
		desInitStatemachine = null;
		initalActiveStatemachines = new ArrayList<>();
		observerStatemachines = new ArrayList<>();
		
		for (EObject statemachine : om.getEObjects(0, "YStateMachine")) 
		{
			if ((Boolean) om.get(statemachine, "initialActive"))
			{
				if (om.get(statemachine, "rtc") == YRunToCompletion.OBSERVER)
				{
					observerStatemachines.add(statemachine);
				}
				else
				{
					initalActiveStatemachines.add(statemachine);
					initalActiveOrDesInitialzerExists = true;
				}
			}
			else if ((Boolean) om.get(statemachine, "desInitializer")) 
			{
				desInitStatemachine = statemachine;
				initalActiveOrDesInitialzerExists = true;
			}
		}
		
		return initalActiveOrDesInitialzerExists;
	}
	
	private void createEnumerations_Init()
	{
		// create Enumerations
		reflectivStateChart.execute.enumations.enums.clear();
		for (EObject enumeration : om.getEObjects(0, "YEnumeration"))
		{
			String qualifiedEnumName = ((YEnumeration) enumeration).getName();
			EObject elem = enumeration;
			while (!((elem = elem.eContainer()) instanceof YModel))
			{
				qualifiedEnumName = ((YPackage) elem).getName() + "." + qualifiedEnumName;
			}		
			EEnum eenum = (EEnum) execute.reflectivStateChart.objectManagement.getEClassifier(qualifiedEnumName, 1);

			for (EEnumLiteral enumLiteral : eenum.getELiterals())
			{
				reflectivStateChart.execute.enumations.enums.put(qualifiedEnumName + "." + enumLiteral.getName(), (EEnumLiteralAdapter) enumLiteral); 
			}	
		}	
	}
	
	private EObject createStatemachineHandler(EObject stateMachine) 
	{
		EObject stateMachineHandler;
		if (layer == 0)
			stateMachineHandler = reflectivStateChart.resourceManagement.yammFactory.createYStateMachineHandler();
		else
		{
			EClass smhMetaClass= (EClass) om.getEClassifier("YStateMachineHandler", layer);
			stateMachineHandler = smhMetaClass.getEPackage().getEFactoryInstance().create(smhMetaClass);
			((EObjectImpl)stateMachineHandler).eSetClass(smhMetaClass); //so it is really dynamic	
		}
	
		stateMachineHandler = reflectivStateChart.resourceManagement.yammFactory.createYStateMachineHandler();
		
		om.set(stateMachineHandler, new ObjectsToColor(), "objectsToColor");
		om.set(stateMachineHandler, om.get(stateMachine, "maxEffectsToBeProcessed"),
				"maxEffectsToBeProcessed");
		
		om.set(stateMachineHandler, stateMachine, "stateMachine");
		
		//TODO: wird im original nicht für desinitilazer gemacht
		om.introduceObjectToObjectCache(layer, stateMachineHandler);
		om.introduceEObjectToLayerInformation(layer, stateMachineHandler);
		
		return stateMachineHandler;
	}
	
	private void createItsYammClassObjectAndOperationObject(EObject stateMachine, EObject stateMachineHandler) 
	{
		final EObject operation = (EObject) om.get(stateMachine, "operation");

		EObject curObj = (EObject) om.get(stateMachine, "operation", "clazz");
		String objectID = Integer.toHexString(curObj.hashCode());

		YPackage yammPackage = ((YClass) curObj)
				.getParentElement();
		String packages = "";

		while (yammPackage != null) {
			packages = yammPackage.getName().concat(".").concat(packages);
			yammPackage = yammPackage.getParentElement();
		}

		String qualifiedName = packages.concat((String) om.get(curObj, "name"));
		EClass classifierOfToCreated = (EClass) om
				.getEClassifier(qualifiedName, 1);

		EObject createdClass = (EObject) classifierOfToCreated.getEPackage().getEFactoryInstance()
				.create(classifierOfToCreated);
		((EObjectImpl) createdClass).eSetClass(classifierOfToCreated); // so it is really dynamic
		execute.maps[1].put(objectID, createdClass);
		// TODO : --> objectID = om.introduceObjectToObjectCache(1, createdClass);
		//  initialize this:
		if (createdClass.eClass().getEStructuralFeature("this") != null)
			om.set(createdClass, createdClass, "this");
		//initialize yClass:
		if(createdClass.eClass().getEStructuralFeature("yClass") != null)
			execute.reflectivStateChart.objectManagement
				.set(createdClass, execute.reflectivStateChart.objectManagement.eClassifierToYClassifierTransformed.get(createdClass.eClass()), "yClass");	
//				.set(createdClass, execute.reflectivStateChart.objectManagement.eClassifierToYClassifier.get(createdClass.eClass()), "yClass");	
		// createdClass.eAdapters().add(new InternalModelChangeListener());

		if (!execute.reflectivStateChart.objectManagement.qualifiedTypeNameToNextDefaultNameNumber.containsKey(qualifiedName))
			execute.reflectivStateChart.objectManagement.qualifiedTypeNameToNextDefaultNameNumber.put(qualifiedName, 1);
		int number = execute.reflectivStateChart.objectManagement.qualifiedTypeNameToNextDefaultNameNumber.get(qualifiedName);
		execute.reflectivStateChart.objectManagement.qualifiedTypeNameToNextDefaultNameNumber.put(qualifiedName, number + 1);
		execute.reflectivStateChart.objectManagement.objectIdToName.get(1).put(Integer.toHexString(createdClass.hashCode()), qualifiedName + number);
		
		//initialize yammInternal:
		EStructuralFeature internal = createdClass.eClass().getEStructuralFeature("yammInternal");
		if (internal != null && createdClass.eGet(internal) == null) {	
			createdClass.eSet(internal, execute.reflectivStateChart.internal);
		}
		execute.reflectivStateChart.objectManagement.set(createdClass, Integer.toHexString(createdClass.hashCode()),"ObjectID");
		
		om.introduceEObjectToLayerInformation(1, createdClass);

		if (om.observedValues.containsKey(qualifiedName))
		{
			reflectivStateChart.objectManagement.propertyObserver
				.addObserver(createdClass, om.observedValues.get(qualifiedName), 1);
		}							
		
		if (om.get(operation, "name").equals(om.get(operation, "clazz", "name"))) {
			om.set(stateMachineHandler, objectID, "itsClassID");
		} else {
			// Create operation class
			EClass eclass = (EClass) om.getEClassifier(
					((String) om.get(operation, "clazz", "name")).concat((String) om.get(operation, "name"))
							.concat((String) om.get(operation, "ObjectID")),
					1);
			EObject eObjectCreated = eclass.getEPackage().getEFactoryInstance().create(eclass);
			((EObjectImpl) eObjectCreated).eSetClass(eclass); // so it is really dynamic
			execute.maps[1].put(Integer.toHexString(eObjectCreated.hashCode()), eObjectCreated);

			// set itsRmofClass
			om.set(eObjectCreated, createdClass, "itsRmofClass");
			// setID
			om.set(stateMachineHandler, Integer.toHexString(eObjectCreated.hashCode()), "itsClassID");
			// eObjectCreated.eAdapters().add(new InternalModelChangeListener());

		}

		om.setInvalidStructureInformation(1);
	}
	
	private EObject findSimulateOperaton(EObject yclass)
	{
		ObjectManagement om = execute.reflectivStateChart.objectManagement;
		for (EObject operation : om.<List<EObject>>getGen(yclass, "ownedOperation"))
		{
			if ("simulate".equals(om.<String>getGen(operation, "name"))
					&& om.<List<EObject>>getGen(operation, "ownedParameter").size() == 1
					&& "timeStep".equals(om.<String>getGen(om.<List<EObject>>getGen(operation, "ownedParameter").get(0), "name")))
			{
				return operation;
			}
		}
		
		for (EObject supClass : om.<List<EObject>>getGen(yclass, "superClass"))
		{
			EObject simulate= findSimulateOperaton(supClass);
			if (simulate != null)
				return simulate;
		}
		
		return null;
	}
		
	/**
	 * Terminates the specific {@codeYAMMDebugThread} after the simulation
	 * has reached its Final State to be sure that the Simulation and the Debugging
	 * is correctly terminated after it is begun by a Resume.
	 */
	private void terminateYAMMDebugThread(YStateMachineHandler smh) {
		YAMMVariableAdapter adapter = YAMMVariableAdapter.getVariableAdapterByStateMachineHandler(smh);
		adapter.stopYAMMThread();
	}

	/**
	 * Notifies {@codeYAMMVariableAdapter} as the place where the data for
	 * the Variables of the Debug Model are stored. For each dynamic instance of the
	 * operation classes "itsRmofClass" type an own Adapter is created.
	 * 
	 * @param smh : StateMachineHandler
	 * @throws DebugException
	 */
	@SuppressWarnings("unchecked")
	private void keepDebugModelUpToDate(YStateMachineHandler smh, Boolean newThread) throws DebugException {

		String id = smh.getItsClassID();
		// System.out.println(smh.getStateMachine().getName());
		EObject createdClass = null;
		String adapterName = null;
		EObject operationClass = execute.maps[1].get(id);
		boolean adapterAlreadyExists = false;
		boolean isInitialActive = false;
		YStateMachineHandler caller = null;

		for (EStructuralFeature feature : operationClass.eClass().getEStructuralFeatures()) {
			if ("itsRmofClass".equals(feature.getName())) {
				EObject sm = (EObject) om.get(smh, "stateMachine");
				if (newThread == null)
					isInitialActive = (((YStateMachineImpl) sm).isInitialActive());
				else
					isInitialActive = newThread;	
				EObject operation = (EObject) om.get(sm, "operation");
				createdClass = (EObject) operationClass.eGet(feature);
				if ("null.DESDummyOp".equals((createdClass.eClass().getName()) + ("." + om.get(operation, "name"))))
				{
					adapterName = "DES";
				}
				else
					adapterName = (createdClass.eClass().getName()) + ("." + om.get(operation, "name") + ", ID: ")
							+ (operationClass.hashCode());

//				logger.trace("*****Zerochart.keepDebugModelUpToDate***** \ncurrent smh : " 
//						+ smh.getObjectID() +"\n name: " + adapterName+"\n");

				for (Entry e : YAMMVariableAdapter.allVariableAdapters.entrySet()) {
					YAMMVariableAdapter adapter = (YAMMVariableAdapter) e.getKey();
					if (adapter.getAdapterName().equals(adapterName)) {
						YAMMVariableAdapter.setThreadIdAndTopVariableAdapter(adapter.threadId, adapter);
						adapterAlreadyExists = true;
						YAMMVariableAdapter.setAdapterOfCurrentThreadActive(adapter.threadId);
						YAMMVariableAdapter activeAdapter = YAMMVariableAdapter.getAdapterOfActiveSM();

						// takes care that theYAMMThread of the activeAdapter (=StackFrame) is the
						// topmost Thread in the View, so it is automatically selected
						YAMMDebugTarget debugTarget = activeAdapter.getYAMMDebugTarget();
						if (debugTarget == null) {
							
						}
						debugTarget.setActiveYAMMThread(activeAdapter.threadId);
						debugTarget.arrangeThreads(activeAdapter.threadId, false);

						if (operationClass != activeAdapter.operationClass) {
							if (activeAdapter.operationClass.eAdapters().contains(activeAdapter))
								activeAdapter.operationClass.eAdapters().remove(activeAdapter);
							activeAdapter.addOperationsParametersToVariablesMap(operationClass);
						}
						activeAdapter.assignThisToAdapterInstance(activeAdapter.getItsRmofClassValue());
						if (!LayerView.step) // create also StackFrames when resuming and no Event calls
												// getStackFrames()
							debugTarget.createStackFramesWhileResuming();

						break;
					}
				}
				if (!adapterAlreadyExists) {
					if (om.get(smh, "calledFrom") != null) {
						caller = (YStateMachineHandler) om.get(smh, "calledFrom");
					}
					YAMMVariableAdapter r = new YAMMVariableAdapter(adapterName, operationClass, isInitialActive,
							caller, smh);				

					createdClass.eAdapters().add(r);
				}
				break;
			}
		}
	}


}



