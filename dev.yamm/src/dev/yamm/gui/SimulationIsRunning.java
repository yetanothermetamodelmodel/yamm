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

import org.eclipse.swt.widgets.Display;

import dev.yamm.coloring.ColorYAMMDiagram;
import dev.yamm.debug.model.YAMMDebugTarget;

/**
 * The state of a Simulation that already has been started (e.g. by pressing Run,
 * Step Into or Step Over button).
 */
public class SimulationIsRunning extends SimulationState {

	/** The Singleton instance of class SimulationIsRunning. */
	private static SimulationIsRunning instance;
	
	
	/** The private constructor. */
	private SimulationIsRunning()
	{
	}
	
	/**
	 * The getter for the Singleton instance of {@code SimulationIsRunning}.
	 * 
	 * @return {@link #instance}
	 */
	public static SimulationIsRunning getInstance()
	{
		if (instance == null)
			instance = new SimulationIsRunning();
		
		return instance;
	}
	
	/**
	 * The Simulations behavior when the Stop Button is pressed and the Simulation has already
	 * been started:
	 * Does some resetting and clearing of maps, sets boolean variables to false again. 
	 * changes the Simulations state to {@code SimulationNotYetStarted}.
	 * 
	 *  @param calledIntern	:	<b>true</b> if method is called from from any place exceptYAMMDebugTarget
	 *  						(in this case {@link YAMMDebugTarget #vmTerminated()} has to be called)
	 * 							<b>false</b> otherwise
	 */
	@Override
	public void stop(boolean calledIntern) {
		LayerView.yamm.reflectivStateChart.setSimulationIsRunning(false);
		LayerView.getActionStop().setImageDescriptor(dev.yamm.init.Activator.getImageDescriptor(LayerView.getTerminateChartGif()));
		LayerView.runWaitTimeStop = false;
		LayerView.runWaitTime = false; 
		LayerView.breakActive = false;
		LayerView.step = false;
		LayerView.breakpointIsHit = false;
		isContinuationAfterPause = false;
		LayerView.run = false;
		LayerView.blueStop = false;
		LayerView.yamm.reflectivStateChart.stopSimulation();
		
		Display.getDefault().syncExec(new Runnable() { 
			@Override
			public void run() {
				ColorYAMMDiagram.clear();
			}
		});
//		ModifyUMADiagram.reset();
		LayerView.setRunWaitTime(false);
		LayerView.setBreakActive(false);
		LayerView.getActionStop().setEnabled(false);
		LayerView.yamm.reflectivStateChart.simulationBeenStarted = false;
		
		// terminate vm
		if (calledIntern) 
			calledIntern(SIM_STOP);
			
		LayerView.logger.info("Simulation Reset."); //$NON-NLS-1$
		LayerView.logger.info("", false, false); //$NON-NLS-1$
		LayerView.logger.info("", false, false); //$NON-NLS-1$
		LayerView.setStartButtonsEnabledState(true, null);
		LayerView.getActionStepReturn().setEnabled(false);
		LayerView.getActionStart().setImageDescriptor(dev.yamm.init.Activator.getImageDescriptor(LayerView.getRunChartGif()));
		LayerView.setSimulationState(SimulationNotYetStarted.getInstance());
	}

	/**
	 * The Simulations behavior when the Run Button is pressed and the Simulation has already
	 * been started (e.g. by pressing Step Into / Step Over button before so that 
	 * {@link LayerView #breakActive} is true).
	 * Continues the Simulation.
	 * If {@code LayerView.runWaitTime) is true (when the waittime is set in the view) the 
	 * Simulations state is changed and {@link SimulationPauses #run(calledIntern)} is called. 
	 * 
	 * @param calledIntern	:	<b>true</b> if method is called directly or indirectly from {@code LayerView} /
	 * 							<b>false</b> called by debug model
	 */
	@Override
	public synchronized void run() { 
		LayerView.getActionStart().setImageDescriptor(dev.yamm.init.Activator.getImageDescriptor(LayerView.getRunChartGif())); 
		
		if ((!LayerView.runWaitTime && LayerView.breakActive)//eg by first pressing StepInto/ StepOver and then continuing with run
				||(!LayerView.runWaitTime && !LayerView.breakActive && isContinuationAfterPause)) // continue Simulation after Pause 
		{
			LayerView.setBreakpointIsHit(false);
			//if waittime is set,it is stepping mode
			if (LayerView.isWaitTimeSet())
				LayerView.setStep(true);
			else 
				LayerView.setStep(false); 
			
			
			isContinuationAfterPause = false;
			
			Display.getDefault().syncExec(new Runnable() { 
				@Override
				public void run() {
					ColorYAMMDiagram.clear();
				}
			});
			LayerView.runWaitTimeStop = false;
			LayerView.setStartButtonsEnabledState(false, null);
			LayerView.yamm.reflectivStateChart.execute.chartOperation.continueChart();
			LayerView.yamm.reflectivStateChart.simulationInStepMode = false;
		} 
		else if (LayerView.runWaitTime) //pause the Simulation
		{
			LayerView.setStep(true);
			LayerView.setSimulationState(SimulationPauses.getInstance());
			LayerView.getSimulationState().run();   
		}
	}

	/**
	 * The Simulations behavior when the Step Into Button is pressed and the Simulation has already
	 * been started:
	 * Stays in the {@code SimulationIsRunning} state.
	 * 
	 * @param calledIntern	:	<b>true</b> if method is called directly or indirectly from {@code LayerView} /
	 * 							<b>false</b> called by debug model
	 */
	@Override
	public synchronized void stepInto(boolean calledIntern) 
	{	
		if (LayerView.runWaitTime && LayerView.run)   
		{
			LayerView.yamm.reflectivStateChart.simulationInStepMode = true;
			LayerView.setRunWaitTime(false);
			LayerView.runWaitTimeStop = true;
			LayerView.setStep(true);
		}
		
		else if (!LayerView.runWaitTime && LayerView.run) 
		{
			isContinuationAfterPause = false;
			LayerView.setStep(true);
			LayerView.setBreakpointIsHit(false);
			
			if (LayerView.yamm.reflectivStateChart.wait) //PauseExecution.waiting() is invoked
			{
				return;
			}
			if(((Layer) LayerView.yamm.reflectivStateChart.objectManagement.getViewLayers().get(0)).isStepWait()) 
			{
				LayerView.yamm.reflectivStateChart.simulationInStepMode = true;
				LayerView.setStartButtonsEnabledState(false, null);
				
				try
				{
					LayerView.yamm.reflectivStateChart.execute.chartOperation.continueStep();
				}
				catch(Exception e)
				{
					e.printStackTrace();	
				}
				

				if (!LayerView.blueStop)
					LayerView.setStartButtonsEnabledState(true, null);
			}
			else //run && !wait && !isStepWait() && !reflectivStateChart.wait()
			{
				LayerView.yamm.reflectivStateChart.simulationInStepMode = true;
				LayerView.setStep(true);
				LayerView.setBreakpointIsHit(false);
				LayerView.setStartButtonsEnabledState(false, null);
				try
				{
					LayerView.yamm.reflectivStateChart.execute.chartOperation.continueChart();
				}
				catch(Exception e)
				{
					e.printStackTrace();	
				}
				LayerView.setStartButtonsEnabledState(true, null);
			}
		}
			if (calledIntern)
				calledIntern(SIM_SUSPEND);
	}

	/**
	 * The Simulations behavior when the Step Over Button is pressed and the Simulation has already
	 * been started:
	 * Stays in the {@code SimulationIsRunning} state.
	 * 
	 * @param calledIntern	:	<b>true</b> if method is called directly or indirectly from {@code LayerView} /
	 * 							<b>false</b> called by debug model
	 */
	@Override
	public synchronized void stepOver(boolean calledIntern) 
	{
		if(LayerView.runWaitTime && LayerView.run) 
		{
			LayerView.yamm.reflectivStateChart.simulationInStepMode = true;
			LayerView.setRunWaitTime(false);
			LayerView.runWaitTimeStop = true;	
			LayerView.setStep(true);
			LayerView.setBreakpointIsHit(false);
		}
		else if (!LayerView.runWaitTime && LayerView.run)
		{
			isContinuationAfterPause = false;
			LayerView.setStep(true);
			LayerView.setBreakpointIsHit(false);
			
			if(LayerView.yamm.reflectivStateChart.wait) //PauseExecution.waiting() is invoked
			{
				return;
			}
			LayerView.yamm.reflectivStateChart.simulationInStepMode = true;
			LayerView.yamm.reflectivStateChart.execute.pauseExecution.stateMachineHandler = LayerView.yamm.reflectivStateChart.zerochart.activeStateMachineHandler;
			LayerView.yamm.reflectivStateChart.execute.pauseExecution.stepOver = true;
			LayerView.yamm.reflectivStateChart.execute.pauseExecution.stepReturn = false;
			try
			{
				LayerView.yamm.reflectivStateChart.execute.chartOperation.continueChart();
			}
			catch(Exception e)
			{
				e.printStackTrace();	
			}
			LayerView.runWaitTimeStop = true;

			if (LayerView.blueStop)
				LayerView.setStartButtonsEnabledState(false, null);
		}
		if (calledIntern)
			calledIntern(SIM_SUSPEND);
	}

	/**
	 * The Simulations behavior when the Step Return Button is pressed.
	 * Continues simulation of the first state machine after a second state machine 
	 * has been activated via an opCall.
	 * Can only be invoked when {@link #returnEnabled} has been set true by 
	 * {@link dev.yamm.Zerochart #reflectivChart()}.
	 * Stays in the {@code SimulationIsRunning} state.
	 * 
	 * @param calledIntern	:	<b>true</b> if method is called directly or indirectly from {@code LayerView} /
	 * 							<b>false</b> called by debug model
	 */
	@Override
	public synchronized void stepReturn(boolean calledIntern)
	{
		LayerView.yamm.reflectivStateChart.execute.pauseExecution.stateMachineHandler = LayerView.yamm.reflectivStateChart
				.zerochart.activeStateMachineHandler;
		LayerView.yamm.reflectivStateChart.execute.pauseExecution.stepOver = false;
		LayerView.yamm.reflectivStateChart.simulationInStepMode = true;
		LayerView.yamm.reflectivStateChart.execute.pauseExecution.stepReturn = true;
		LayerView.setStep(true);
		LayerView.setBreakpointIsHit(false);
		try
		{
			LayerView.yamm.reflectivStateChart.execute.chartOperation.continueChart();
		}
		catch(Exception e)
		{
			e.printStackTrace();	
		}
		LayerView.runWaitTimeStop = true;

		if (calledIntern)
			calledIntern(SIM_SUSPEND);
		
	}



}
