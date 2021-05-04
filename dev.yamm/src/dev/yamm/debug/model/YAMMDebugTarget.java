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
package dev.yamm.debug.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IMarkerDelta;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.debug.core.DebugEvent;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.IBreakpointManager;
import org.eclipse.debug.core.IBreakpointManagerListener;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.core.model.IDebugElement;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.debug.core.model.IMemoryBlock;
import org.eclipse.debug.core.model.IProcess;
import org.eclipse.debug.core.model.IStep;
import org.eclipse.debug.core.model.IThread;
import org.eclipse.debug.core.model.IWatchExpressionDelegate;
import org.eclipse.debug.core.model.IWatchExpressionListener;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import dev.yamm.debug.breakpoints.YAMMLineBreakpoint;
import dev.yamm.debug.breakpoints.YAMMRunToLineBreakpoint;
import dev.yamm.gui.LayerView;
import dev.yamm.init.LaunchDelegate;
import dev.yamm.logger.YAMMLogger;



/**
 * Implements {@code IDebugTarget} of the org.eclipse.debug.core.model.
 * 
 */
@SuppressWarnings({ "unused", "unchecked" })
public class YAMMDebugTarget extends YAMMDebugElement implements IDebugTarget, IBreakpointManagerListener, IWatchExpressionDelegate {

	// associated system process (VM) not used
	private IProcess fProcess;
	
	// containing launch object
	private ILaunch fLaunch;
	
	// threads
	private Map fThreads = Collections.synchronizedMap(new LinkedHashMap());
	
	private YAMMThread activeYAMMThread;
		

	
	/**
	 * Constructs a new debug target in the given launch for the 
	 * associated YAMM VM process.
	 * 
	 * @param launch containing launch
	 */
	public YAMMDebugTarget(ILaunch launch) {

		super(null);
		fLaunch = launch;
		LaunchDelegate.debugMode = true;
		
		started();
		//fireCreationEvent();
	}

   
	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IDebugTarget#getThreads()
	 */
	public IThread[] getThreads() throws DebugException {
	    synchronized (fThreads) {
	        return (IThread[])fThreads.values().toArray(new IThread[fThreads.size()]);
	    }
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IDebugTarget#hasThreads()
	 */
	public boolean hasThreads() throws DebugException {
		return fThreads.size() > 0;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IDebugTarget#getName()
	 */
	public String getName() throws DebugException {
		return "YAMM Simulation Run ";
	}
	

	
	public synchronized YAMMThread getActiveYAMMThread() {
		return activeYAMMThread;
	}

	public synchronized void setActiveYAMMThread(int fThreadId) {
		this.activeYAMMThread = getThread(fThreadId);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IDebugElement#getDebugTarget()
	 */
	@Override
	public IDebugTarget getDebugTarget() {
		return this;
	}
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IDebugElement#getLaunch()
	 */
	@Override
	public ILaunch getLaunch() {
		return fLaunch;
	}
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.ITerminate#canTerminate()
	 */
	public boolean canTerminate() {
		return dev.yamm.gui.LayerView.run;
	}
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.ITerminate#isTerminated()
	 */
	public synchronized boolean isTerminated() {
		return !dev.yamm.gui.LayerView.run;
	}
	/** (non-Javadoc)
	 * @see org.eclipse.debug.core.model.ITerminate#terminate()
	 */
	public void terminate() throws DebugException 
	{
		dev.yamm.gui.LayerView.getSimulationState().stop(false);
		PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
			public void run() {
				IWorkbenchWindow dwindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
				IWorkbenchPage page = dwindow.getActivePage();
				if (page != null) {
					LayerView layerview = (LayerView) page.findView("action.actions.LayerView");
					if (layerview != null) {					
						layerview.updateView();
					} else {
						//logger.error("Could not connect to Layer View - Aborting ...");
					}
				}
			}
		});
		vmTerminated();
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
		return dev.yamm.gui.LayerView.runWaitTime
				&& !dev.yamm.gui.LayerView.breakActive;
	}
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.ISuspendResume#isSuspended()
	 */
	public synchronized boolean isSuspended() {
		return dev.yamm.gui.LayerView.run 
				&& dev.yamm.gui.LayerView.isStep()
				&& !LayerView.blueStop;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.ISuspendResume#resume()
	 */
	public void resume() throws DebugException {
	}

	private void updateLayerView() {
		PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
			public void run() {
				IWorkbenchWindow dwindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
				IWorkbenchPage page = dwindow.getActivePage();
				if (page != null) {
					LayerView layerview = (LayerView) page.findView("action.actions.LayerView");
					if (layerview != null) {
						//layerview.actionStartStep();						
						layerview.updateView();
					} else {
						//logger.error("Could not connect to Layer View - Aborting ...");
					}
				}
			}
		});
	}	
	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.ISuspendResume#suspend()
	 */
	public void suspend() throws DebugException {
//		if (hasThreads()) 
//		{
//			IThread[] threads = getThreads(); //TODO!!
//			threads[0].suspend();
//		}
	}

	
	/**
	 * Called when this debug target terminates.
	 */
	public void vmTerminated() {
		LaunchDelegate.debugMode = false;
		YAMMVariableAdapter.clearStatics();
		VariableDebugEntry.allDynamicObjectsAndMetaInfo.clear();
		VariableDebugEntry.allReferenceIDs.clear();
		VariableDebugEntry.variableCounter = 0;
		YAMMVariable.variableList.clear();
		YAMMThread.objectReferences.clear();
		YAMMThread.listOfPrimitives.clear();
		activeYAMMThread = null;
		fThreads.clear();
		IBreakpointManager breakpointManager = getBreakpointManager();
        breakpointManager.removeBreakpointListener(this);
		breakpointManager.removeBreakpointManagerListener(this);
		fireTerminateEvent();
		
	}
	
	
	
	public synchronized void vmSuspend(int detail) 
	{
	    fireSuspendEvent(detail);
	}
	
	/**
	 * Starts every thread except the first one (this is started in {@link #started(YAMMStartedEvent)}.
	 * 
	 * @param threadId	:	the ID (numbered consecutively starting with '1' because 0 is reserved for the starting thread)
	 */
	public void getThreadStarted(int threadId)
	{
		YAMMThread newThread = new YAMMThread(this, threadId);
		activeYAMMThread = newThread;
		arrangeThreads(threadId, false);
		if (LayerView.isStep()) //TODO
			newThread.start();
	}
	
	
	/**
	 * Starts the first Thread.
	 */
	private void started() {
	    YAMMThread newThread = new YAMMThread(this, 0);
	    fThreads.put(new Integer(0), newThread);
	    setActiveYAMMThread(0);
	    newThread.start();
	}
	
	/**
	 * Arranges {@link #fThreads} so that the active YAMMThread is always the topmost one
	 * (and its top stack frame is automatically selected).
	 * Avoids arranging Threads when a breakpoint is hit and the call is not directly by Zerochart 
	 * (e.g. when YAMMThread.getStackFrames() is called, triggered by suspendEvent. 
	 * 
	 * @param threadId : the iD of the topmost and to be selected YAMMThread
	 */
	public synchronized void arrangeThreads(int threadId, boolean calledAfterBreakpointHit)
	{
		if (LayerView.isBreakpointIsHit() && !calledAfterBreakpointHit) 
			return;
					
		YAMMThread newThread = getThread(threadId);
		if (newThread == null)
		{
			newThread = getActiveYAMMThread();
		}
		HashMap oldThreads = new HashMap();
		oldThreads.putAll(fThreads);
		fThreads.clear();
		fThreads.put(new Integer(threadId), newThread);
		fThreads.putAll(oldThreads);
		
		if (LayerView.isStep() || LayerView.isBreakpointIsHit())
			suspendThreads();
	}
	
	/**
	 * Takes care that all stack frames are created when simulation runs in resume mode
	 * and no event calls YAMMThread.getStackFrames().
	 */
	public void createStackFramesWhileResuming()
	{
		try 
		{
			if (getActiveYAMMThread() != null)
				getActiveYAMMThread().getStackFrames();
		} 
		catch (DebugException e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Suspends every YAMMThread instance so that they are 'opened' and their stack frames are shown.
	 */
	public synchronized void suspendThreads() 
	{
		YAMMThread[] threadsToBeSuspended = (YAMMThread[])fThreads.values().toArray(new YAMMThread[fThreads.size()]);
		//Collections.reverse(Arrays.asList(threadsToBeSuspended));
		for(YAMMThread thread : threadsToBeSuspended)
		{
			if (thread != null)
				thread.fireSuspendEvent(DebugEvent.CLIENT_REQUEST);
		}
	}
	
	
	/**
	 * Suspends every YAMMThread instance so that they are 'opened' and their stack frames are shown.
	 * Last, suspends the topmost YAMMThread.
	 */
	public synchronized void resumeThreads() 
	{
		YAMMThread[] threadsToBeSuspended = (YAMMThread[])fThreads.values().toArray(new YAMMThread[fThreads.size()]);
		for(YAMMThread thread : threadsToBeSuspended)
		{
			if (thread != null)
				thread.fireResumeEvent(DebugEvent.CLIENT_REQUEST);
		}
	}
	
	/**
	 * Returns this debug target's single thread, or <code>null</code>
	 * if terminated.
	 * 
	 * @param threadId ID of the thread to return, or <code>0</code>
	 * to return the first available thread
	 * @return this debug target's single thread, or <code>null</code>
	 * if terminated
	 */
	public YAMMThread getThread(int threadId) {
	    if (threadId >= 0) {
	        return (YAMMThread)fThreads.get(new Integer(threadId));
	    } else {
    	    synchronized(fThreads) {
    	        if (fThreads.size() > 0) {
    	            return (YAMMThread)fThreads.values().iterator().next();
    	        }
    	    }
	    }
		return null;
	}
	
	/**
	 * Removes a YAMMThread after it has reached its final state.
	 * 
	 * @param threadId	:	the YAMMThread identifier
	 */
	public void removeYAMMThread(int threadId)
	{
		if (fThreads.containsKey(threadId))
			fThreads.remove(threadId);
	}

	
//***********************************************************not used by now ************************
	/**
	 * When the breakpoint manager disables, remove all registered breakpoints
	 * requests from the VM. When it enables, reinstall them.
	 */
	public void breakpointManagerEnablementChanged(boolean enabled) {
		IBreakpoint[] breakpoints = getBreakpointManager().getBreakpoints(getModelIdentifier());
		for (int i = 0; i < breakpoints.length; i++) {
			if (enabled) {
				breakpointAdded(breakpoints[i]);
			} else {
				breakpointRemoved(breakpoints[i], null);
			}
        }
	}	
	
	
	@Override
	public void evaluateExpression(String expression, IDebugElement context,
			IWatchExpressionListener listener) {
	}
	
	/* -> currently not used
	 *  (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IDebugTarget#supportsBreakpoint(org.eclipse.debug.core.model.IBreakpoint)
	 */
	public boolean supportsBreakpoint(IBreakpoint breakpoint) {
//		if (!isTerminated() && breakpoint.getModelIdentifier().equals(getModelIdentifier())) {
//			try {
//				String program = getLaunch().getLaunchConfiguration().getAttribute(DebugCorePlugin.ATTR_RMOF_PROGRAM, (String)null);
//				if (program != null) {
//					IResource resource = null;
//					if (breakpoint instanceof RMOFRunToLineBreakpoint) {
//						RMOFRunToLineBreakpoint rtl = (RMOFRunToLineBreakpoint) breakpoint;
//						resource = rtl.getSourceFile();
//					} else {
//						IMarker marker = breakpoint.getMarker();
//						if (marker != null) {
//							resource = marker.getResource();
//						}
//					}
//					if (resource != null) {
//						IPath p = new Path(program);
//						return resource.getFullPath().equals(p);
//					}
//				}
//			} catch (CoreException e) {
//			}			
//		}
		return false;
	}
	 /* (non-Javadoc)
		 * @see org.eclipse.debug.core.model.IDebugTarget#getProcess()
		 */
		public IProcess getProcess() {
			return fProcess;
		}
	
	
	/*  -> currently not used
	 * (non-Javadoc)
	 * @see org.eclipse.debug.core.IBreakpointListener#breakpointAdded(org.eclipse.debug.core.model.IBreakpoint)
	 */
	public void breakpointAdded(IBreakpoint breakpoint) {
//		if (supportsBreakpoint(breakpoint)) {
//			try {
//				if ((breakpoint.isEnabled() && getBreakpointManager().isEnabled()) || !breakpoint.isRegistered()) {
//					RMOFLineBreakpoint RMOFBreakpoint = (RMOFLineBreakpoint)breakpoint;
//				    RMOFBreakpoint.install(this);
//				}
//			} catch (CoreException e) {
//			}
//		}
	}
	/*  -> currently not used
	 * (non-Javadoc)
	 * @see org.eclipse.debug.core.IBreakpointListener#breakpointRemoved(org.eclipse.debug.core.model.IBreakpoint, org.eclipse.core.resources.IMarkerDelta)
	 */
	public void breakpointRemoved(IBreakpoint breakpoint, IMarkerDelta delta) {
//		if (supportsBreakpoint(breakpoint)) {
//			try {
//			    RMOFLineBreakpoint RMOFBreakpoint = (RMOFLineBreakpoint)breakpoint;
//				RMOFBreakpoint.remove(this);
//			} catch (CoreException e) {
//			}
//		}
	}
	
	/*  -> currently not used
	 * (non-Javadoc)
	 * @see org.eclipse.debug.core.IBreakpointListener#breakpointChanged(org.eclipse.debug.core.model.IBreakpoint, org.eclipse.core.resources.IMarkerDelta)
	 */
	public void breakpointChanged(IBreakpoint breakpoint, IMarkerDelta delta) {
//		if (supportsBreakpoint(breakpoint)) {
//			try {
//				if (breakpoint.isEnabled() && getBreakpointManager().isEnabled()) {
//					breakpointAdded(breakpoint);
//				} else {
//					breakpointRemoved(breakpoint, null);
//				}
//			} catch (CoreException e) {
//			}
//		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IDisconnect#canDisconnect()
	 */
	public boolean canDisconnect() {
		return false;
	}
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IDisconnect#disconnect()
	 */
	public void disconnect() throws DebugException {
	}
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IDisconnect#isDisconnected()
	 */
	public boolean isDisconnected() {
		return false;
	}
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IMemoryBlockRetrieval#supportsStorageRetrieval()
	 */
	public boolean supportsStorageRetrieval() {
		return false;
	}
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IMemoryBlockRetrieval#getMemoryBlock(long, long)
	 */
	public IMemoryBlock getMemoryBlock(long startAddress, long length) throws DebugException {
		return null;
	}
}
