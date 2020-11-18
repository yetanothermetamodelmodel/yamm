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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;

import org.eclipse.debug.core.DebugEvent;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.core.model.IStackFrame;
import org.eclipse.debug.core.model.IThread;
import org.eclipse.debug.core.model.IVariable;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import online.yamm.ChartManagement;
import online.yamm.gui.LayerView;
import online.yamm.gui.SimulationPauses;
import online.yamm.gui.SimulationState;

/**
 * A YAMM thread. The YAMM vm is multi - threaded but not really parallel but sequential.
 */

public class YAMMThread extends YAMMDebugElement implements IThread {

	/**
	 * ID of this thread as reported by YAMM.
	 */
	private final int fThreadId;

	/**A flag indicating, that this thread is ready to be terminated 
	 * out of the zerochart (this is the case ONLY when the thread reached its regular end when final state is reached).*/
	public boolean canBeTerminated;

	/**
	 * Table mapping stack frames to current variables
	 */
	private Map<IStackFrame, IVariable[]> fVariables = Collections.synchronizedMap(new HashMap<IStackFrame, IVariable[]>());

	/** A Stack of {@code YAMMStackFrame}s assigned to the {@YAMMThread} instance.*/
	private Stack<YAMMStackFrame> fStackFrames = new Stack<YAMMStackFrame> ();

	/** Maps the hash value generated of  an IVarible's name to the {@code VariableDebugEntry} object storing the variable's data.*/
	public static ConcurrentHashMap<Integer, VariableDebugEntry> objectReferences = new ConcurrentHashMap<Integer, VariableDebugEntry>();

	/** Stores the IDs of the primitive YAMMVariables that are to be removed out of {@code objectReferences} and {@code YAMMVariable.variableList
	 * after a fulfilled step action.*/
	static List<Integer> listOfPrimitives = Collections.synchronizedList(new ArrayList<Integer>());

	/** The DebugTarget this YAMMThread instance is associated with. */
	private YAMMDebugTarget debugTarget;

	public static Map<?, ?> environment = null;

	private enum State {
		RUNNING, STEPPING, SUSPENDED, TERMINATED
	}

	private State currentState;

	private Thread thread;



	/**
	 * Constructs a new thread for the given target
	 * 
	 * @param target VM
	 */
	public YAMMThread(YAMMDebugTarget target, int threadId) {
		super(target);
		fThreadId = threadId;
		debugTarget = target;
		if (threadId == 0)
		{
			thread = new Thread(new StepInto());
			thread.start();
		}
	}



	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IThread#getStackFrames()
	 */
	@SuppressWarnings("unchecked")
	public IStackFrame[] getStackFrames() throws DebugException {
		synchronized(this)
		{
			if (isSuspended())
			{
				while (!ChartManagement.startupDone
						&& !SimulationState.compileError) 
				{
					// give some time to load the layers
					try
					{
						Thread.currentThread();
						Thread.sleep(1000); //TODO vorher 100
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			IStackFrame[] frames = null;

			if(!YAMMVariableAdapter.allVariableAdapters.isEmpty())
			{
				frames = createStackFramesAndDetermineTopFrame();
			}
			if (frames == null)
				return new IStackFrame[0];

			Collections.reverse(Arrays.asList(frames));
			return frames;
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IThread#hasStackFrames()
	 */
	public boolean hasStackFrames() throws DebugException {
		return isSuspended();
	}

	/**
	 * A getter for {@link #fStackFrames}.
	 * @return {@code fStackFrames}
	 */
	public Stack getVectorFStackFrames() {
		return fStackFrames;
	}

	/**
	 * Pushes a new frame on the Stack.
	 * 
	 * @param frame
	 */
	public void pushFrame(YAMMStackFrame frame)
	{
		fStackFrames.push(frame);
		debugTarget.setActiveYAMMThread(this.fThreadId);
		debugTarget.arrangeThreads(this.fThreadId, false);
	}


	/**
	 * Pops the top frame off the callstack.
	 */
	public void popFrame() { 
		fStackFrames.pop();
		debugTarget.setActiveYAMMThread(this.fThreadId);
		debugTarget.arrangeThreads(this.fThreadId, false);
	}



	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IThread#getPriority()
	 */
	public int getPriority() throws DebugException {
		return 0;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IThread#getTopStackFrame()
	 */
	public IStackFrame getTopStackFrame() throws DebugException {
		IStackFrame[] frames = getStackFrames();

		if (frames.length > 0) {
			return frames[0];
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IThread#getName()
	 */
	public String getName() {
		return "Main Thread";
	}


	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.ISuspendResume#canResume()
	 */
	public boolean canResume() {
		return isSuspended();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.ISuspendResume#canSuspend()
	 */
	public boolean canSuspend() {
		return false;
//				return de.d2o.rmof.gui.LayerView.runWaitTime
//				&& !de.d2o.rmof.gui.LayerView.breakActive; 
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.ISuspendResume#isSuspended()
	 */
	public boolean isSuspended() {
		return online.yamm.gui.LayerView.run 
				&& online.yamm.gui.LayerView.isStep()
				&& !online.yamm.gui.LayerView.blueStop;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.ISuspendResume#resume()
	 */
	public void resume() throws DebugException 
	{ 
		synchronized (this) 
		{
			if (!online.yamm.gui.LayerView.runWaitTime)
			{
				thread = new Thread(new Resume());
				thread.start();
			}
		}
	}
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.ISuspendResume#suspend()
	 */
	public void suspend() throws DebugException 
	{
		synchronized (this) 
		{
			fireSuspendEvent(DebugEvent.CLIENT_REQUEST);
			LayerView.setSimulationState(SimulationPauses.getInstance());
			LayerView.getSimulationState().run();
		}

	}
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IStep#canStepInto()
	 */
	public boolean canStepInto() {
		return isSuspended();
	}
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IStep#canStepOver()
	 */
	public boolean canStepOver() {
		//return isSuspended(); 
		return false;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IStep#canStepReturn()
	 */
	public boolean canStepReturn() {
		return isSuspended() && LayerView.returnEnabled;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IStep#isStepping()
	 */
	public boolean isStepping() {
		return State.STEPPING.equals(currentState);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IStep#stepInto()
	 */
	public void stepInto() throws DebugException 
	{
		removePrimitives();

		synchronized (this) 
		{ 
			thread = new Thread(new StepInto());
			thread.setName("capability stepInto");
			thread.start();
		} 
	}


	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IStep#stepOver()
	 */
	public void stepOver() throws DebugException {
		synchronized (this) 
		{
			thread = new Thread(new StepOver());
			thread.setName("capability stepOver");
			thread.start();
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IStep#stepReturn()
	 */
	public void stepReturn() throws DebugException 
	{
		thread = new Thread(new StepReturn());
		thread.setName("capability StepReturn");
		thread.start();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.ITerminate#canTerminate()
	 */
	public boolean canTerminate() {
		return !isTerminated();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.ITerminate#isTerminated()
	 */
	public boolean isTerminated() {
		return getDebugTarget().isTerminated();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.ITerminate#terminate()
	 */
	public void terminate() throws DebugException {
		if (!getDebugTarget().isTerminated() && canBeTerminated)
		{
			debugTarget.removeYAMMThread(fThreadId);
			fireTerminateEvent(); // terminate specific Thread
			IThread [] threads = debugTarget.getThreads();
			if (threads.length >= 1)
			{
				debugTarget.suspendThreads();
			}
		}
		else
			debugTarget.terminate(); /*terminate subordinated Debug Target if not
									   a single thread is to be terminated but the whole
									  debugging session */
	}

	/**
	 * The behavior, when resume button is pressed.
	 * -> "run until breakpoint is hit"
	 */
	class Resume implements Runnable
	{
		int debugEventAfterResume = DebugEvent.UNSPECIFIED;
		
		@Override
		public void run() 
		{
			synchronized (YAMMThread.this) 
			{	
				currentState = State.RUNNING;
			}
			try 
			{
			LayerView.getSimulationState().run(); 
			} catch (Exception e)
			{
				debugEventAfterResume = DebugEvent.TERMINATE;
			}
			fireSuspendOrTerminateEvent(debugEventAfterResume);
		}

	}
	
	/**
	 *The behavior, when step into button is pressed.
	 */
	class StepInto implements Runnable
	{

		@Override
		public void run() 
		{
			synchronized (YAMMThread.this) 
			{
				currentState = State.STEPPING;
			}
			executeDebugAction(DebugEvent.STEP_INTO);
			fireSuspendOrTerminateEvent(DebugEvent.UNSPECIFIED); 
		}

	}
	
	/**
	 * The behavior, when step over button is pressed.
	 */
	class StepOver implements Runnable
	{

		@Override
		public void run()
		{
			synchronized (YAMMThread.this) 
			{
				currentState = State.STEPPING;
			}
			executeDebugAction(DebugEvent.STEP_OVER);
			fireSuspendOrTerminateEvent(DebugEvent.UNSPECIFIED);
		}
	}

	/**
	 * The behavior, when return button is pressed.
	 * A return is only possible if a thread has more than
	 * one stack frames, means that a state machine has been
	 * called by another state machine: execution of the called
	 * state machine is interrupted and the simulation continues 
	 * in the calling state machine.
	 */
	class StepReturn implements Runnable
	{

		@Override
		public void run() 
		{
			synchronized (YAMMThread.this) 
			{
				currentState = State.STEPPING;
			}
			executeDebugAction(DebugEvent.STEP_RETURN);
			fireSuspendOrTerminateEvent(DebugEvent.UNSPECIFIED);
		}

	}

	/**
	 * -> Right now does not work with terminate or suspend.
	 * 
	 * Selects the kind of event and invokes the assigned operation in {@code YAMMDebugTarget}.
	 * 
	 * @param event : kind of DebugEvent
	 */
	private void fireSuspendOrTerminateEvent(int event) //TODO: Refactoring!
	{
		int detail = DebugEvent.UNSPECIFIED;
		synchronized (YAMMThread.this) 
		{
			// update state
			switch (event) 
			{
			case DebugEvent.UNSPECIFIED:
				currentState = State.SUSPENDED;
				detail = DebugEvent.STEP_END;
				break;
			case DebugEvent.TERMINATE:
				currentState = State.TERMINATED;
				detail = DebugEvent.TERMINATE;
				break;
			case DebugEvent.SUSPEND:
				currentState = State.SUSPENDED;
				detail = DebugEvent.CLIENT_REQUEST;
				break;
			}
		}
		switch (currentState) {
		case SUSPENDED:
			((YAMMDebugTarget)getDebugTarget()).vmSuspend(detail);
			break;
		case TERMINATED:
			((YAMMDebugTarget)getDebugTarget()).vmTerminated();
			break;
		default:
			break;
		}
	}	


	/**
	 * Depending on the user's interaction a assigned Simulation State is
	 * chosen. The state defines the way the interpreter starts or continues its
	 * work.
	 * 
	 * @param debugAction : the user's interaction
	 */
	private void executeDebugAction(int debugAction)
	{
		setHasValueChangedOfAllVariables(false);

		switch(debugAction)
		{
		case DebugEvent.STEP_INTO:
			LayerView.getSimulationState().stepInto(false);
			break;
		case DebugEvent.STEP_OVER:
			LayerView.getSimulationState().stepOver(false);
			break;
		case DebugEvent.STEP_RETURN:
			LayerView.getSimulationState().stepReturn(false);
			break;
		}

	}

	/**
	 * Checks if there are already existing IStackFrame instances. If so, determines the number of 
	 * the Stack Frames to be shown in the Debug View and delegates comparing old and new values
	 * of a stack frame's variable to {@link #createFrameDataForTopFrame(YAMMVariableAdapter)}.
	 * 
	 * @return frames	:	the stack frames to be shown in the variables view
	 */
	public IStackFrame[] createStackFramesAndDetermineTopFrame() {
		YAMMFrameData yammFrameData = null;
		YAMMVariableAdapter.setAdapterOfCurrentThreadActive(getIdentifier());
		YAMMVariableAdapter activeAdapter =	YAMMVariableAdapter.getAdapterOfActiveSM();

		int countFrames = 0; 
		YAMMStackFrame topFrame = null;
		IStackFrame[] frames = null;

		if (!fStackFrames.isEmpty()) //get bottom frames and figure out if there is already a StackFrame object for the top StackFrame available
		{		
			frames = new IStackFrame[calculateSizeOfIStackFrames(activeAdapter)];

			if (isPreviousFrameAfterReturn(activeAdapter) 
					|| (isTopFrame(activeAdapter)))
			{
				if (isPreviousFrameAfterReturn(activeAdapter))
					popFrame();

				for (int i = 0; i < frames.length; i++)
				{
					frames[i] = (IStackFrame) fStackFrames.get(i);
				}
				topFrame = (YAMMStackFrame) fStackFrames.lastElement();
				yammFrameData = new YAMMFrameData(createFrameDataForTopFrame(activeAdapter));		
				topFrame.init(yammFrameData);
			}
			else //it is a new StackFrame
			{
				for (int i = 0; i < fStackFrames.size() - 1; i++)
				{
					frames[i] = (IStackFrame) fStackFrames.get(i);
				}
				yammFrameData = new YAMMFrameData(createFrameDataForTopFrame(activeAdapter));	
				frames[frames.length -1] = (IStackFrame) new YAMMStackFrame(this, yammFrameData, countFrames);	
			}
		}		
		else if (activeAdapter != null)
		{
			yammFrameData = new YAMMFrameData(createFrameDataForTopFrame(activeAdapter));	
			frames = new IStackFrame[1];
			frames[0] = (IStackFrame) new YAMMStackFrame(this, yammFrameData, countFrames);
		}

		if (activeAdapter != null)
			createVariablesOfFeaturesOfThis(activeAdapter, (YAMMStackFrame)frames[frames.length-1]);
		return frames;
	}

	/**
	 * Removes primitive Variables out of {@code objectReferences}
	 * and {@code YAMMVariable.listOfPrimitives}.
	 */
	private void removePrimitives()
	{
		synchronized(listOfPrimitives)
		{
			if (!listOfPrimitives.isEmpty())
			{
				Iterator iterator = listOfPrimitives.iterator();
				while(iterator.hasNext())
				{
					int id = (Integer) iterator.next();
					if (objectReferences.containsKey(id))
						objectReferences.remove(id);
					if (YAMMVariable.variableList.containsKey(id))
						YAMMVariable.variableList.remove(id);
				}
			}
			listOfPrimitives.clear();
		}
	}

	/**
	 * Checks {@link #objectReferences} if a {@code VariableDebugEntry} for each top level variable (this/ 
	 * parameter) of top IStackFrame is already existing. If not - creates them.
	 * Creates the data String for {@code YAMMFrameData} instances.
	 * Checks if the value of a existing variable has changed.
	 * 
	 * @param activeAdapter	:	the Adapter of the currently active IStackFrame
	 * @return	String - frame data
	 */
	private String createFrameDataForTopFrame(YAMMVariableAdapter activeAdapter) 
	{
		String variableName = "";
		String allVariableIDs = "";
		String frameDataString = "";
		int variableId = 0;
		for (Entry e : activeAdapter.thisAndParamsOfSMs.entrySet())
		{
			Object currentFeaturesValue 					= 	e.getValue();
			EStructuralFeature currentFeaturesMetaObject 	= 	(EStructuralFeature) e.getKey();
			variableName 									= 	currentFeaturesMetaObject.getName().toString();
			
			if (!(variableName.equals("this") && e.getValue() == null)) //inhibit this of super class
			{
				variableId 			= 	YAMMValue.generateVariableId(currentFeaturesMetaObject, currentFeaturesValue, activeAdapter);
				allVariableIDs 		= 	allVariableIDs + "|" + (Integer.toString(variableId));
				int potentialOldId 	= 	YAMMValue.generateVariableId(currentFeaturesMetaObject, null, activeAdapter);
			
				createOrGetDebugEntry(variableName, variableId, currentFeaturesValue, currentFeaturesMetaObject,
						potentialOldId);
			}
		}

		if (!activeAdapter.getAdapterName().equals(null))
			frameDataString = activeAdapter.getAdapterName() + allVariableIDs;
		else
			frameDataString = "" + allVariableIDs;
		return frameDataString;
	}



	/**
	 * Creates variables of the top - level variable 'this' it it has Structural Features.
	 * 
	 * @param activeAdapter	: YAMMVariableAdapter of the assignes state machine.
	 * @param frame			: YAMMStackFrame
	 */
	private void createVariablesOfFeaturesOfThis(YAMMVariableAdapter activeAdapter, YAMMStackFrame frame) {
		String variableName;
		int variableId;
		for (Entry e : YAMMVariableAdapter.getAdapterOfActiveSM().featuresAndValuesOfThis.entrySet())
		{
			Object currentFeaturesValue 					= 	e.getValue();
			EStructuralFeature currentFeaturesMetaObject 	= 	(EStructuralFeature) e.getKey();
			variableName 									= 	currentFeaturesMetaObject.getName().toString();

			variableId 										= 	YAMMValue.generateVariableId(currentFeaturesMetaObject, currentFeaturesValue, activeAdapter);
			int potentialOldId 								= 	YAMMValue.generateVariableId(currentFeaturesMetaObject, null, activeAdapter);
			createOrGetDebugEntry(variableName, variableId, currentFeaturesValue, currentFeaturesMetaObject,
					potentialOldId);

			if (!YAMMVariable.variableList.containsKey(variableId))
			{
				try
				{
					new YAMMVariable(frame, variableId, false, null);
				} 
				catch (DebugException e1) 
				{
					e1.printStackTrace();
				}
			}
		}
	}



	/**
	 * Checks if {@link #objectReferences} already contains the specific variable.
	 * There are four possible cases:
	 * <ol> <li>it is a new variable	   -> create {@code VariableDebugEntry}</li>
	 * 		<li>it is a primitive variable -> create {@code VariableDebugEntry}</li>
	 *		<li>an already created variable with a former null value and now a new value 		
	 *									   -> get {@code VariableDebugEntry} and set new value </li>
	 *	    <li>an already created value   -> get {@code VariableDebugEntry} and check value </li></li>
	 * <br>
	 * @param variableName				:	variable's name as it is shown in the view
	 * @param variableId				:	the unique variables identifier
	 * @param currentFeaturesValue		:	a value of an EReference or EAttribute
	 * @param currentFeaturesMetaObject :	the meta object of {@code currentFeaturesValue}s
	 * @param potentialOldId			: 	an ID generated with only the meta object 
	 */
	private void createOrGetDebugEntry(String variableName, int variableId, Object currentFeaturesValue,
			EStructuralFeature currentFeaturesMetaObject, int potentialOldId) 
	{
		if (!objectReferences.containsKey(variableId) //a new Variable
				&& !objectReferences.containsKey(potentialOldId))
		{
			objectReferences.put(variableId, new VariableDebugEntry(currentFeaturesMetaObject,  
					variableName, currentFeaturesMetaObject.getClass().getName(), currentFeaturesValue, variableId));
		}
		else if (objectReferences.containsKey(potentialOldId) 
				&& YAMMValue.isPrimitiveType(currentFeaturesValue))
		{
			objectReferences.remove(potentialOldId);
			objectReferences.put(variableId, new VariableDebugEntry(currentFeaturesMetaObject,
					variableName, currentFeaturesMetaObject.getClass().getName(), currentFeaturesValue, variableId));
		}
		else if (objectReferences.containsKey(potentialOldId) 
				&& currentFeaturesValue != null)
		{
			VariableDebugEntry debugEntry = objectReferences.get(potentialOldId);		
			checkValueOfVariable(potentialOldId, currentFeaturesMetaObject, currentFeaturesValue, debugEntry, false, null);
		}
		else
		{
			VariableDebugEntry debugEntry = objectReferences.get(variableId);		
			checkValueOfVariable(variableId, currentFeaturesMetaObject, currentFeaturesValue, debugEntry, false, null);
		}
	}


	/**
	 * Checks if the value of an already existing variable has changed and registers the potential changes
	 * in the assigned {@code VariableDebugEntry} object. If the variable's value is a complex type having 
	 * EStructuralFeatures itself, changes their values either.
	 * 
	 * @param variableId		: {@link YAMMVariable #iD}
	 * @param featureAndValue	: the EStructuralFeature and it's value as an Entry of
	 * 							  {@link YAMMVariableAdapter #thisAndParamsOfSMs}
	 * @param debugEntry		: a {@code VariableDebugEntry} object - stores the data of 
	 * 							  a Variable
	 */
	public void checkValueOfVariable(int variableId, EObject newFeature, Object newValue, 
			VariableDebugEntry debugEntry, boolean isSubordinated, YAMMVariableAdapter adapterOfValue) 
	{
		Object value = debugEntry.getValue();
		
		if (YAMMVariable.variableList.get(variableId) != null)
		{
			YAMMVariable currentVar = YAMMVariable.variableList.get(variableId);
			if (valueOfFeatureHasChanged(newValue, debugEntry))
			{ 
				currentVar.setHasValueChanged(true);

				if (value == null)
				{
					calculateNewVariableIdForNewValue(newFeature, newValue, debugEntry, null);
				}
				debugEntry.setValue(newValue);
			}
			if (currentVar.hasStructuralFeatures() && value != null)
			{

				EList<EStructuralFeature> allFeatures = YAMMValue.getEStructuralFeaturesOfEReference(value);
				IVariable[] children = new IVariable[allFeatures.size()];
				createOrGetYAMMVariablesOfEReference(currentVar.getStackFrame(), allFeatures, children, debugEntry, isSubordinated, adapterOfValue);
			}
		}
	}



	/**
	 * The Id of an YAMMVariable (also used as key in {@link #objectReferences}) must be unique. 
	 * To ensure that e.g. several instances of one meta class have their own unique id, 
	 * the hash code of the specified value of the meta object ( the {@code DynamicEObjectImpl}) is used in 
	 * {@link YAMMValue #generateVariableId(EObject, Object)}.
	 * As long as the value is null (instance not created), a temporary hash code is used. After creation
	 * of the instance, the old id has to be replace by the unique id.
	 * 
	 * @param newValue			:	the new Value
	 * @param feature	 		: 	the meta class
	 * @param debugEntry		:	a {@code VariableDebugEntry} object - stores the data of 
	 * 							 	a Variable
	 * @param valueAdapter 
	 */
	public synchronized static void calculateNewVariableIdForNewValue(EObject metaInformation, Object newValue, 
			VariableDebugEntry debugEntry, YAMMVariableAdapter valueAdapter) 
	{
		int variableId = 0;
		if (valueAdapter == null)
			variableId = YAMMValue.generateVariableId(metaInformation, newValue, YAMMVariableAdapter.getAdapterOfActiveSM());
		else
			variableId = YAMMValue.generateVariableId(metaInformation, newValue, valueAdapter);

		if (YAMMVariable.variableList.containsKey(debugEntry.yammVariableId))
		{
			YAMMVariable var = YAMMVariable.variableList.get(debugEntry.yammVariableId);
			YAMMVariable.variableList.remove(debugEntry.yammVariableId);
			var.setId(variableId);
			YAMMVariable.variableList.put(variableId, var);
		}
		objectReferences.remove(debugEntry.yammVariableId, debugEntry);
		debugEntry.yammVariableId = variableId;
		objectReferences.put(variableId, debugEntry);
	}

	/**
	 * Invokes {@link YAMMVariable #hasValueChanged()} all variables of the
	 * top stack frame.
	 * 
	 * @param hasChanged
	 */
	public void setHasValueChangedOfAllVariables(boolean hasChanged)
	{
		if (!YAMMVariable.variableList.isEmpty())
		{
			for (Entry e  : YAMMVariable.variableList.entrySet())
			{
				YAMMVariable var = (YAMMVariable) e.getValue();
				var.setHasValueChanged(hasChanged);
			}
		}
	}

	/**
	 * Checks if a {@code VariableDebugEntry} instance assigned to this complex type already exists. 
	 * If it does, gets the correspondent  {@code YAMMVariable} instance and refreshes its value.
	 * If it does not already exist, creates a new one (and also completes {@link YAMMThread #objectReferences} and
	 * {@code VariableDebugEntry}).
	 * 
	 * @param frame					: current {@code YAMMStackFrame}
	 * @param variableList			: List of Variables associated with a complex type
	 * @param adapterOfValue 
	 * @param debugEntryOfEReference: the assigned {@code VariableDebugEntry} object 
	 */
	public static void createOrGetYAMMVariablesOfEReference(YAMMStackFrame frame, EList<EStructuralFeature> variableList, 
			IVariable[] children, VariableDebugEntry debugEntryOfEReference, boolean variableIsSubordinated, YAMMVariableAdapter adapterOfValue) 
	{
		IVariable var = null;
		int countVars = 0;
		int objectKey = 0;
		Object value = null;
		EObject obj = (EObject) debugEntryOfEReference.getValue();

		for (EStructuralFeature featureOfEReference : variableList)
		{
			if (!(variableIsSubordinated && featureOfEReference.getName().equals("this")))
			{
				value = obj.eGet(featureOfEReference);

				if (adapterOfValue == null)
					objectKey = YAMMValue.generateVariableId(featureOfEReference, value, YAMMVariableAdapter.getAdapterOfActiveSM()); //TODO Statt null
				else
					objectKey = YAMMValue.generateVariableId(featureOfEReference, value, adapterOfValue);

				YAMMThread.objectReferences.put(objectKey, new VariableDebugEntry(featureOfEReference,  
						featureOfEReference.getName(), featureOfEReference.getClass().getName(), 
						value, objectKey));
				try 
				{
					var = new YAMMVariable(frame, objectKey, false, adapterOfValue); 
				} 
				catch (DebugException e) 
				{
					e.printStackTrace();
				}
				children[countVars] = var;
				countVars++;
			}
		}
	}

	/**
	 * Determines the size of the IStackFrame[] to be returned by {@link #getStackFrames()},
	 * dependent on the previous position of the Stack Frame that is associated to parameter {@code activeAdapter).
	 * 
	 * @param activeAdapter	: the Adapter of the currently active SM
	 * @return				: size of IStackFrame[]
	 */
	private int calculateSizeOfIStackFrames(YAMMVariableAdapter activeAdapter) 
	{
		if (isTopFrame(activeAdapter))
			return fStackFrames.size();
		else if (isPreviousFrameAfterReturn(activeAdapter))
			return fStackFrames.size() - 1;
		return fStackFrames.size() + 1;
	}

	/**
	 * Checks if the active StackFrame is the top frame in {@link #fStackFrames}: this is
	 * the case when the State Machine is not left by an opCall or return.
	 * 
	 * @param activeAdapter :	the Adapter of the currently active SM
	 * @return true			: 	active Frame is on top 
	 * 		   false		:	otherwise
	 */
	private boolean isTopFrame(YAMMVariableAdapter activeAdapter)
	{
		IStackFrame topFrame = (IStackFrame) fStackFrames.get(fStackFrames.size() - 1);
		boolean isTopFrame = false;
		try 
		{
			isTopFrame = topFrame.getName().equals(activeAdapter.getAdapterName());
		} 
		catch (DebugException e)
		{
			e.printStackTrace();
		}
		return isTopFrame;
	}

	/**
	 * Checks if the active StackFrame is the frame under the top frame: this is
	 * the case after a return to the 'calling State Machine' (after an opCall).
	 * 
	 * @param activeAdapter	:	the Adapter of the currently active SM
	 * @return true			: 	if it's a return / 
	 * 		   false		: 	no return 
	 */
	private boolean isPreviousFrameAfterReturn(YAMMVariableAdapter activeAdapter) {
		IStackFrame topFrame = null;
		IStackFrame bottomFrames = null;

		if (!fStackFrames.isEmpty())
		{
			topFrame = (IStackFrame) fStackFrames.get(fStackFrames.size() - 1);
			try {
				if (!topFrame.getName().equals(activeAdapter.getAdapterName()))
				{
					if (fStackFrames.size() >= 2)
					{
						bottomFrames = (IStackFrame) fStackFrames.get(fStackFrames.size() - 2);
						if (bottomFrames.getName().equals(activeAdapter.getAdapterName()))
						{
							return true;
						}
					}
				}
			} 
			catch (DebugException e) 
			{
				e.printStackTrace();
			}
		}
		return false;
	}

	/**
	 * Checks whether the value of an existing {@code VariableDebugEntry} instance
	 * has changed. 
	 * 
	 * @param newValue		: 	a potential new Value
	 * @param debugEntry	:	the place where the Variable's Data is stored.
	 * @return				: 	true: value has changed / false otherwise
	 */
	synchronized static boolean valueOfFeatureHasChanged(Object newValue, VariableDebugEntry debugEntry) {
		if (newValue == null)
			return false;
		return  (debugEntry != null
				&& debugEntry.getValue() != null)
				&& !(newValue.equals(debugEntry.getValue()))
				|| ((newValue != null) && debugEntry.getValue() == null);
	}

	/**
	 * Sets the current variables for the given stack frame. Called
	 * by YAMM stack frame when it is created.
	 * 
	 * @param frame
	 * @param variables
	 */
	protected void setVariables(IStackFrame frame, IVariable[] variables) {
		synchronized (fVariables) {
			fVariables.put(frame, variables);
		}
	}

	/**
	 * Returns the current variables for the given stack frame, or
	 * <code>null</code> if none.
	 * 
	 * @param frame stack frame
	 * @return variables or <code>null</code>
	 */
	protected IVariable[] getVariables(IStackFrame frame) {
		synchronized (fVariables) {
			IVariable[] variables = (IVariable[]) fVariables.get(frame);
			if (variables == null) {
				return new IVariable[0];
			}
			return variables;
		}
	}


	/**
	 * Called by the debug target after the thread is created.
	 * 
	 * @since 3.5
	 */
	void start() {
		//fireCreationEvent();
	}



	/**
	 * Returns this thread's unique identifier
	 * 
	 * @return this thread's unique identifier
	 * 
	 * @since 3.5
	 */
	public int getIdentifier() {
		return fThreadId;
	}



	@Override
	public IBreakpoint[] getBreakpoints() {
		return null;
	}
}
