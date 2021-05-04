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
package dev.yamm.gui;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.debug.core.DebugEvent;
import org.eclipse.debug.ui.DebugUITools;

import dev.yamm.debug.model.YAMMDebugTarget;
import dev.yamm.debug.model.YAMMStackFrame;
import dev.yamm.debug.model.YAMMThread;

/**
 * The abstract base class for the concrete states of the Simulation.
 * The concrete states can be triggered  by an users interaction (pushing a button).
 */
public abstract class SimulationState 
{
	public final String SIM_STOP = "stop";
	
	public final String SIM_SUSPEND = "step";
	
	public static boolean compileError;
	
	/** marks if it is a restart of the Simulation after a Pause*/
	public static boolean isContinuationAfterPause;
	
	/**
	 * The state - specific behavior when the Stop Button is pressed.
	 * If Simulation is has not define a state (in case an error occurred) it has to be 
	 * stopped here.
	 */
	public void stop(boolean calledIntern)
	{
		LayerView.yamm.reflectivStateChart.setSimulationIsRunning(false);
		if (calledIntern)
		{
			compileError = true;
			SimulationIsRunning.getInstance().stop(true);
		}
	}
	
	/**
	 * The state - specific behavior when the Run Button is pressed..
	 */
	public void run()
	{
	
	}

	
	/**
	 * The state - specific behavior when the Step Into Button is pressed.
	 */
	public void stepInto(boolean calledIntern)
	{
		
	}
	
	/**
	 * The state - specific behavior when the Step Over Button is pressed.
	 */
	public void stepOver(boolean calledIntern)
	{
		
	}
	
	/**
	 * The state - specific behavior when the Return Button is pressed.
	 */
	public void stepReturn(boolean calledIntern)
	{
		
	}
	
	/**
	 * Is only called when the Simulation has not been started by the Debugger (but directly or indirectly
	 * by the Layer View).
	 * Gets the {@codeYAMMDebugTarget} of the given {@YAMMDebugElement} first and suspends or terminates
	 * the virtual machine then.
	 * 
	 * @param stepOrStop :	indicates if the actions has been a executed step action or if the stop button
	 * 						has been pressed. 
	 */
	public void calledIntern(String stepOrStop)
	{
		IAdaptable adaptable = DebugUITools.getDebugContext();
		YAMMDebugTarget yammDebugTarget = null;
		
		//get DebugTarget for DebugElement
		if (adaptable instanceof YAMMDebugTarget)
		{
			yammDebugTarget = (YAMMDebugTarget) adaptable;
		}
		if (adaptable instanceof YAMMStackFrame) 
		{
			YAMMStackFrame yammStackFrame = (YAMMStackFrame) adaptable;
			yammDebugTarget = (YAMMDebugTarget) yammStackFrame.getDebugTarget();
		}
		if (adaptable instanceof YAMMThread)
		{
			YAMMThread yammThread = (YAMMThread) adaptable;
			yammDebugTarget = (YAMMDebugTarget) yammThread.getDebugTarget();
		}
		suspendOrTerminateVM(yammDebugTarget, stepOrStop);
	}
	
	/**
	 * Dependent on the user interaction (step or stop button pressed) the vm of the
	 * Yamm debugger is to be suspended or terminated.
	 *  
	 * @param yammDebugTarget	: the {@codeYAMMDebugTarget}
	 * @param stepOrStop		: the user interaction
	 */
	private void suspendOrTerminateVM(YAMMDebugTarget yammDebugTarget, String stepOrStop)
	{
		if (yammDebugTarget != null)
		{
			if (stepOrStop.equals(SIM_SUSPEND))
				yammDebugTarget.vmSuspend(DebugEvent.STEP_END);

			else if (stepOrStop.equals(SIM_STOP))
			{
				yammDebugTarget.vmTerminated();
			}
		}
	}
}
