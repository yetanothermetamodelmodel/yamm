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
package online.yamm.debug.model;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EContentAdapter;

import online.yamm.coreModelXmi.yamm.YStateMachineHandler;
import online.yamm.gui.LayerView;
import online.yamm.gui.SimulationIsRunning;
import online.yamm.logger.YAMMLogger;

/**
 * A class for keeping the Debug Model Elements up to date: 
 * Each Stack Frame shown in the Debug View is associated to a
 * YAMMVariableAdapter instance. An adapter instance, in turn, is associated to an {@code Zerochart}'s active State Machine.
 * Registrates changes affecting the class owning the respective State Machine.
 */
public class YAMMVariableAdapter extends EContentAdapter { 
	
	/** Holds all Adapter instances of every State Machine that is or has been active*/  
	public static ConcurrentHashMap <YAMMVariableAdapter, Boolean> allVariableAdapters =
			new ConcurrentHashMap <YAMMVariableAdapter, Boolean> ();
	
	
	public static ConcurrentHashMap <EObject, YAMMVariableAdapter> thisAndAdapter = new ConcurrentHashMap <EObject, YAMMVariableAdapter> ();
	/** Marks {@code YAMMVariableAdapter} as active when the assigned State Machine is currently active. */
	private boolean smIsActive;
	
	/** The adapter's name (equal to its assigned State Machine's name) */
	private String currentStateMachinesName;
	
	/** Stores the content of the currently active State Machine. 
	 *  As key: the meta object of {@code this} or the operation parameter
	 *  As value: its actual value.*/
	public HashMap <EStructuralFeature, Object> thisAndParamsOfSMs =
			new HashMap <EStructuralFeature, Object> ();
	
	/** Stores the content of the currently active State Machine. 
	 *  As key: the meta object of the EStructuralFeature (the instance variable)
	 *  As value: its actual value.*/
	public HashMap <EStructuralFeature, Object> featuresAndValuesOfThis =
			new HashMap <EStructuralFeature, Object> ();
	
	/** An operation's instance. Has as Structural Features the operation's parameter and the class owning the
	 * state machine (the instance of "itsYammClass".*/
	public EObject operationClass = null;
	
	/** The logger */
	public static online.yamm.logger.YAMMLogger logger = YAMMLogger.getYAMMLogger("YAMM Log");

	
	private int adapterId = 0;
	
	/** Marks the context (state machine) as initial active*/
	public boolean isInitialActive;
	
	public boolean isCalledFrom;
	
	/** The handler of the state machine that called the state machine assigned to this YAMMVariableAdapter instance.*/
	private YStateMachineHandler caller;
	
	/** state machine handler mapped to this YAMMVariableAdapter instance*/
	public static  ConcurrentHashMap<YStateMachineHandler, YAMMVariableAdapter> smhAndVariableAdapter = new ConcurrentHashMap <YStateMachineHandler, YAMMVariableAdapter>();
	
	/** the ID of the assigned YAMMThread instance.*/
	public int threadId;
	
	/** the number of all YAMMThread instances. Increases every time createNewYAMMThread() is invoked.*/
	public static int threadCounter = 0;
	
	public static ConcurrentHashMap<Integer, YAMMVariableAdapter> threadIdAndTopVariableAdapter= new ConcurrentHashMap<Integer, YAMMVariableAdapter>();


	/**
	 * The constructor. Instances of this class are created in the Zerochart during the 
	 * execution of the Interpreter.
	 * 
	 * @param adapterName		:	the adapter name - similar to the YAMMStackFrame's name
	 * @param operationClass	:	initializes {@link #operationClass}
	 * @param smh				:	the handler assigned to the state machine represented by 
	 * 								an instance of this class
	 */
	public YAMMVariableAdapter(String adapterName, EObject operationClass, 
			boolean isInitialActive, YStateMachineHandler caller, YStateMachineHandler smh) 
	{
		allVariableAdapters.put(this, true);
		this.operationClass = operationClass;
		this.isInitialActive = isInitialActive;
		this.caller = caller;
		initializeVariableAdapter(adapterName, smh);
	}
	


	/**
	 * Performs the settings for this YAMMVariableAdapter instance.
	 * 
	 * @param adapterName 	:	the name of the adapter and also of the assigned Stack Frame in the Debug View
	 * @param smh 
	 */
	private void initializeVariableAdapter(String adapterName, YStateMachineHandler smh) 
	{
		setAdapterId(this.hashCode());
		setAdapterName(adapterName);
		threadOrOpCall();
		smhAndVariableAdapter.put(smh, this);
		setThreadIdAndTopVariableAdapter(threadId, this);
		setAdapterOfCurrentThreadActive(threadId);
		addThisAndAttributesToVariablesMap(getItsRmofClassValue());
		addOperationsParametersToVariablesMap(operationClass);
		assignThisToAdapterInstance(getItsRmofClassValue());
		
		while (getYAMMDebugTarget() == null)
		{
			try 
			{
				Thread.currentThread();
				Thread.sleep(100);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
		getYAMMDebugTarget().setActiveYAMMThread(threadId);
		if (getAssociatedYAMMThread() != null)  //when Simulation in waittime mode it needs a Refresh with every new YAMMVariableAdapter (stepping events are missing)
			getAssociatedYAMMThread().fireCreationEvent();
		if (!LayerView.step)
			getYAMMDebugTarget().createStackFramesWhileResuming();
	}



	/**
	 * Determines if the state machine (the later stack frame) is  called by another state machine, 
	 * or if its initial active and not called by  another state machine.
	 */
	private void threadOrOpCall() 
	{
		if (caller != null)
		{
			isCalledFrom = true;
			setThreadIdOfCalledSM();
		}
		if (isInitialActive && !isCalledFrom) 
			createNewYAMMThread();
	}
	
	/**
	 * Sets the Thread ID of a state machine, that has been called from another state machine.
	 */
	private void setThreadIdOfCalledSM()
	{
		threadId = getThreadIDOfCaller();
		setThreadIdAndTopVariableAdapter(threadId, this);
	}
	
	/**
	 * Gets the Thread ID of a state machine, that has called the currently active state machine.
	 * 
	 * @return thread ID of calling state machine
	 */
	public int getThreadIDOfCaller()
	{
		YAMMVariableAdapter adapterOfCaller = getCaller();
		
		for (Entry e : threadIdAndTopVariableAdapter.entrySet())
		{
			if (e.getValue().equals(adapterOfCaller))
			{
				return (Integer) e.getKey();
			}
		}
		for (Entry e : threadIdAndTopVariableAdapter.entrySet())
		{
			if (e.getValue().equals(adapterOfCaller))
			{
				return (Integer) e.getKey();
			}
		}
		return 0; 
	}
	
	public static synchronized YAMMVariableAdapter getVariableAdapterByStateMachineHandler(YStateMachineHandler smh)
	{
		return smhAndVariableAdapter.get(smh);
	}
	
	/**
	 * Gets the YAMMVariabelAdapter intance by its unique name. This can be useful if only the
	 * stack frame's name (identical to the assigned YAMMVariabelAdapter instance) is 
	 * available.
	 * 
	 * @param name	:	the name of the adapter / YAMMStackFrame
	 * @return		:	the assigned YAMMVariableAdapter 
	 * 					or null
	 */
	public synchronized static YAMMVariableAdapter getVariableAdapterByName(String name)
	{
		for (YAMMVariableAdapter adapter : allVariableAdapters.keySet())
		{
			if (adapter.getAdapterName().equals(name))
			{
				return adapter;
			}
				
		}
		return null;
	}
	
	/**
	 * Gets the VariableAdapter the current state machine is called from.
	 * 
	 * @return	the VariableAdapter
	 */
	public YAMMVariableAdapter getCaller()
	{
		if (isCalledFrom)
		{
			return smhAndVariableAdapter.get(caller);
		}
		return null;
	}
	

	/**
	 * Gets "itsRMOFClass" of the current operation class. 
	 * @return 
	 */
	public EObject getItsRmofClassValue() 
	{	
		for (EStructuralFeature feature : operationClass.eClass().getEStructuralFeatures())
		{
			if("itsRmofClass".equals(feature.getName()))
				return (EObject) operationClass.eGet(feature);
		}
		return null;
	}


	/**
	 * The State Machine of this YAMMVariableAdapter object is initial active without being called by another
	 * state machine. So here is to be created a new YAMMThread instance (except for threadNumber 0, because 
	 * this is the start thread created automatically with launching in debug mode).
	 */
	private void createNewYAMMThread() //TODO
	{
			threadId = threadCounter;
			threadCounter++;
			setThreadIdAndTopVariableAdapter(threadId, this);
			
			if (threadId > 0) //Thread[start] is created by launching
			{
				YAMMDebugTarget yammDebugTarget = getYAMMDebugTarget();
				if (yammDebugTarget != null)
					yammDebugTarget.getThreadStarted(threadId);
			}	
	}
	
	public synchronized static void setThreadIdAndTopVariableAdapter(int threadId, YAMMVariableAdapter topAdapter)
	{
		threadIdAndTopVariableAdapter.put(threadId, topAdapter);
	}

	/**
	 * A setter for the Adapter's name {@link #currentStateMachinesName}. It is equal 
	 * to the State Machine's name the adapter is assigned to.
	 * 
	 * @param currentSmName: indicates the assigned State Machine as in- / active
	 */
	public void setAdapterName(String adapterName)
	{
		currentStateMachinesName = adapterName;
	}
	
	/**
	 * A getter for {@link #currentStateMachinesName}.
	 */
	public String getAdapterName()
	{
		return currentStateMachinesName;
	}
	
	
	/**
	 * A getter for {@link #smIsActive}.
	 * 
	 * @return 	true	: when the State Machine of this Adapter is active /
	 * 			false	: otherwise
	 */
	public boolean isSmIsActive() {
		return smIsActive;
	}

	
	/**
	 * A setter for {@link #smIsActive}.
	 * 
	 * @param smIsActive : indicates the assigned State Machine as in- / active
	 */
	public void setSmIsActive(boolean smIsActive) {
		this.smIsActive = smIsActive;
	}
	
	
	/**
	 * Allows access to the Adapter of the currently active State Machine. 
	 * 
	 * @return adapter	:	the adapter of active State Machine
	 */
	public synchronized static YAMMVariableAdapter getAdapterOfActiveSM()
	{
		boolean isActive;
		YAMMVariableAdapter adapter = null;
		
		for (Entry e : allVariableAdapters.entrySet())
		{
			isActive = (Boolean) e.getValue();
			if (isActive)
			{
				adapter = (YAMMVariableAdapter) e.getKey();
				break;
			}
		}
		if (adapter != null)
			return adapter;
		
		logger.error("No active Adapter for Debug Model found!");
		return null;
	}
	

	/**
	 * Gets the adapter of the YAMMThread assigned to threadId and sets
	 * it true.
	 * 
	 * @param threadId	:	the ID of the YAMMThread instance
	 */
	public synchronized static void setAdapterOfCurrentThreadActive(int threadId)
	{
		YAMMVariableAdapter adapter = threadIdAndTopVariableAdapter.get(threadId);
		setAdapterActive(adapter.getAdapterName());
	}
	
	/**
	 * Sets the adapters stored {@link #allVariableAdapters} false if they
	 * are assigned to an inactive State Machine and true otherwise.
	 * 
	 * @param nameOfActiveSm	:	the active StateMachine
	 */
	@SuppressWarnings("unchecked")
	public synchronized static void setAdapterActive(String adapterName)
	{
		YAMMVariableAdapter adapter = null;
		for (Entry e : allVariableAdapters.entrySet())
		{
			adapter = (YAMMVariableAdapter) e.getKey();
			try
			{
				if (adapter.getAdapterName().equals(adapterName))
				{
					e.setValue(true);
					adapter.setSmIsActive(true);
				}
				else 
				{
					e.setValue(false);
					adapter.setSmIsActive(false);
				}
			}
			catch (Exception e2)
			{
				e2.printStackTrace();
			}

		}
	}
	
	/**
	 * Adds {@code this} and the EStructuralFeatures of "itsRmofClass" to {@link #thisAndParamsOfSMs}. 
	 * 
	 * @param itsRmofClassInstance	:	the instance of the "itsRmofClass" - EStructuralFeature of 
	 * 									{@link #operationClass}
	 */
	public void addThisAndAttributesToVariablesMap(EObject itsRmofClassInstance)
	{
		EClass metaClassOfItsRmofClassInstance = itsRmofClassInstance.eClass();
		for (EStructuralFeature feature : metaClassOfItsRmofClassInstance.getEAllStructuralFeatures()) 
		{
			if (feature.getName().equals("this")) 
				thisAndParamsOfSMs.put(feature, itsRmofClassInstance.eGet(feature)); 
			else 
				featuresAndValuesOfThis.put(feature, itsRmofClassInstance.eGet(feature));
		}
	}
	
	/**
	 * Adds the parameters of an operation to {@link #thisAndParamsOfSMs} and adds the current adapter's
	 * instance to the operationClass.
	 * Is also called directly by {@link online.yamm.Zerochart #keepDebugModelUpToDate} when the operation
	 * class changes (with every opCall()) for keeping {@link #operationClass} up to date.
	 * 
	 * @param operationClass	:	the class owning {@code param}
	 * @param param				:	parameter of {@code operationClass} (EStructuralFeature: can be an EReference
	 * 								or an EAttribute)
	 */
	public void addOperationsParametersToVariablesMap(EObject operationClass) 
	{
		for (EStructuralFeature param : operationClass.eClass().getEStructuralFeatures())
		{
			if(!"itsRmofClass".equals(param.getName()))
			{
				operationClass.eAdapters().add(this);
				Object value = (Object) operationClass.eGet(param); 
				thisAndParamsOfSMs.put(param, value);
				this.operationClass = operationClass;
			}
		}			
	}
	
	public void assignThisToAdapterInstance(EObject itsRmofClassInstance) 
	{
		EClass metaClassOfItsRmofClassInstance = itsRmofClassInstance.eClass();
		for (EStructuralFeature feature : metaClassOfItsRmofClassInstance.getEAllStructuralFeatures()) 
		{
			if (feature.getName().equals("this"))
			{
				thisAndAdapter.put((EObject) itsRmofClassInstance.eGet(feature), this);
				break;
			}
		}
	}
	
	
	
	@Override
	public void notifyChanged(Notification notification) {
		
		Object changedFeature = notification.getFeature();
		if (thisAndParamsOfSMs.containsKey(changedFeature))
			notifyChangesOfThisOrParams(notification, changedFeature);
		
		else if (featuresAndValuesOfThis.containsKey(changedFeature))
			notifyChangesOfAttributes(notification, changedFeature);		
	}



	/**
	 * Handles the notification in case a attribute has changed.
	 * Called by {@link #notifyChanged(Notification)}.
	 * 
	 * @param notification	: the notification
	 * @param changedFeature: the changed attribute
	 */
	private void notifyChangesOfAttributes(Notification notification, Object changedFeature) 
	{
		for (Entry e : featuresAndValuesOfThis.entrySet()) 
		{
			if (e.getKey().equals(changedFeature))
			{
				featuresAndValuesOfThis.replace((EStructuralFeature) e.getKey(), notification.getOldValue(), notification.getNewValue());
				isIVariableCreated(changedFeature.hashCode());
				break;
			}
		}
	}


	/**
	 * Handles the notification in case a parameter has changed.
	 * Called by {@link #notifyChanged(Notification)}.
	 * 
	 * @param notification	: the notification
	 * @param changedFeature: the changed parameter
	 */
	private void notifyChangesOfThisOrParams(Notification notification, Object changedFeature) 
	{
		for (Entry e : thisAndParamsOfSMs.entrySet()) 
		{
			if (e.getKey().equals(changedFeature))
			{
				thisAndParamsOfSMs.replace((EStructuralFeature) e.getKey(), notification.getOldValue(), notification.getNewValue());
				isIVariableCreated(changedFeature.hashCode());
				break;
			}
		}
	}

	/**
	 * Checks whether a Variable is already been created. In that case a ResumeEvent is to be fired
	 * so that the Variable receives its new value and also to keep the other Debug Model Elements
	 * up to date.
	 * 
	 * @param id : the Name of the Variable 
	 */
	private void isIVariableCreated(int id) {
		if (!YAMMVariable.variableList.isEmpty()
				&& YAMMVariable.variableList.containsKey(id))
		{
			YAMMVariable var = YAMMVariable.variableList.get(id);
			YAMMStackFrame frame = var.getStackFrame();
			YAMMThread thread = (YAMMThread) frame.getThread();
			thread.setHasValueChangedOfAllVariables(false);
		}
		else
		{
			//System.out.println("befindet sich noch nicht in der variableList: " + id);//
		}
	}
	
	/**
	 * A getter for the current YAMMDebugTarget instance.
	 * 
	 * @return YAMMDebugTarget : current DebugTarget instance
	 */
	public YAMMDebugTarget getYAMMDebugTarget()
	{
		IAdaptable adaptable = DebugUITools.getDebugContext();
		if (adaptable instanceof YAMMDebugTarget) 
		{
			return (YAMMDebugTarget) adaptable;
		}
		if (adaptable instanceof YAMMStackFrame) 
		{
			YAMMStackFrame yammStackFrame = (YAMMStackFrame) adaptable;
			return (YAMMDebugTarget) yammStackFrame.getDebugTarget();
		}
		if (adaptable instanceof YAMMThread)
		{
			YAMMThread yammThread = (YAMMThread) adaptable;
			return (YAMMDebugTarget) yammThread.getDebugTarget();
		}
		else
			return null;
	}
	
	
	/**
	 * Realizes the former "blueStop" function in the LayerView by terminating the debug target.
	 */
	public void stopDebuggingWithoutTerminating() 
	{
		YAMMDebugTarget yammDebugTarget = getYAMMDebugTarget();
		if (yammDebugTarget != null)
		{
			try 
			{
				yammDebugTarget.suspend();
				LayerView.setSimulationState(SimulationIsRunning.getInstance());
			}
			catch (DebugException e) 
			{
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * Gets the {@code YAMMThread} instance this Adapter is associated with.
	 */
	private YAMMThread getAssociatedYAMMThread()
	{
		YAMMDebugTarget target = getYAMMDebugTarget();
		YAMMThread thread = null;
		if (target != null)
			 thread = target.getThread(threadId);
		return thread;
	}
	
	/**
	 * Stops a single YAMMThread after it has reached its final state.
	 */
	public void stopYAMMThread()
	{
		YAMMThread thread = getAssociatedYAMMThread();
		if (thread != null)
		{
			thread.canBeTerminated = true;
			try 
			{
				thread.terminate();
			} 
			catch (DebugException e)
			{
				e.printStackTrace();
			}
		}
	}

	/**
	 * Has to be done before terminating Debugging.
	 */
    public synchronized static void clearStatics()
    {
    	thisAndAdapter.clear();
    	allVariableAdapters.clear();
    	threadCounter = 0;
    	threadIdAndTopVariableAdapter.clear();
    	smhAndVariableAdapter.clear();

    }
    
	@Override
	public Notifier getTarget() {
		return null;
	}

	@Override
	public void setTarget(Notifier newTarget) {
	}

	@Override
	public boolean isAdapterForType(Object type) {
		return false;
	}


	public int getAdapterId() {
		return adapterId;
	}


	public void setAdapterId(int adapterId) {
		this.adapterId = adapterId;
	}
}
