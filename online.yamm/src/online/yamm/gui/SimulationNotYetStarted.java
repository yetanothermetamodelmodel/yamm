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
package online.yamm.gui;

import online.yamm.coloring.ColorYAMMDiagram;
import online.yamm.init.LaunchDelegate;
import online.yamm.logger.YAMMLogger;

/**
 * The initial state of a Simulation that has not yet been started.
 */
public class SimulationNotYetStarted extends SimulationState 
{
	public static YAMMLogger logger = YAMMLogger.getYAMMLogger("YAMM Log");

	/** The Singleton instance of class SimulationNotYetStarted. */
	private static SimulationNotYetStarted instance;
	
	
	/** The private constructor. */
	private SimulationNotYetStarted()
	{
	}
	
	/**
	 * The getter for the Singleton instance of {@code SimulationNotYetStarted}.
	 * 
	 * @return {@link #instance}
	 */
	public static SimulationNotYetStarted getInstance()
	{
		if (instance == null)
			instance = new SimulationNotYetStarted();
		
		return instance;
	}
	
	/**
	 * The Simulations behavior when the Run Button is pressed and the Simulation has not
	 * yet been started:
	 * Prepares and starts the Simulation, changes the Simulations state to {@code SimulationIsRunning}.
	 */
	@Override
	public synchronized void run() 
	{
		if (!isLayerAttached())
			return;

		if (!isNsURISet())
			return;

		if (!LayerView.breakActive && !LayerView.runWaitTime) 
		{
			resetSimulation();
			LayerView.yamm.reflectivStateChart.simulationInStepMode = false;
			LayerView.runWaitTimeStop = false; 

			//if waittime is set,it is stepping mode
			if (LayerView.isWaitTimeSet())
				LayerView.setStep(true);
			else 
				LayerView.setStep(false); 

			LayerView.run = true;
			LayerView.yamm.reflectivStateChart.setBreakpoint(false);
			try
			{
				LayerView.yamm.reflectivStateChart.start(); 
			}
			catch(Exception e)
			{
				e.printStackTrace();
				logger.error("Simulation could not be performed.");
				LayerView.getSimulationState().stop(true);
				return;	
			}
			if(LaunchDelegate.debugMode) //Simulation in debug mode needs to be prepared for next steps
			{
				LayerView.setSimulationState(SimulationIsRunning.getInstance());
			}
			else //Simulation is launched in run mode, now it needs to be stopped
				LayerView.getSimulationState().stop(true);
		}
	}

	
	/**
	 * The Simulations behavior when the Step Into Button is pressed and the Simulation has not
	 * yet been started:
	 * delegates preparing and starting of the simulation to {@link #stepIntoStepOver()}.
	 * 
	 * @param calledIntern	:	true if method is called from {@code LayerView} /
	 * 							false otherwise
	 */
	@Override
	public synchronized void stepInto(boolean calledIntern) 
	{
		stepIntoStepOver(calledIntern);
	}

	
	/**
	 * The Simulations behavior when the Step Over Button is pressed and the Simulation has not
	 * yet been started:
	 * delegates preparing and starting of the simulation to {@link #stepIntoStepOver()}.
	 * 
	 * @param calledIntern	:	true if method is called from {@code LayerView} /
	 * 							false otherwise
	 */
	@Override
	public synchronized void stepOver(boolean calledIntern) 
	{
		stepIntoStepOver(calledIntern);
	}
	
	
	/**
	 * Prepares and starts the simulation when either the Step Into or the StepOver Button is 
	 * pressed and the Simulation has not yet been started.
	 * Changes the Simulation state to {@code SimulationIsRunning}.
	 * 
	 *  @param calledIntern	:	true if method is called from {@code LayerView} /
	 * 							false otherwise
	 */
	private synchronized void stepIntoStepOver(boolean calledIntern)
	{
		if (!LayerView.run) 
		{	
			
			if (!isLayerAttached())
				return;

			if (!isNsURISet())
				return;

			resetSimulation();

			LayerView.runWaitTimeStop = true;
			LayerView.setRunWaitTime(false);

			if(((Layer)LayerView.yamm.reflectivStateChart.objectManagement.getViewLayers().get(0)).isStepWait()) 
			{
				LayerView.setBreakActive(true);
				LayerView.yamm.reflectivStateChart.setBreakpoint(true);
			}
			else
			{
				LayerView.yamm.reflectivStateChart.setBreakpoint(false);
			}

			LayerView.run = true;
			LayerView.setStep(true);
			LayerView.yamm.reflectivStateChart.simulationInStepMode = true; 
			try
			{
			LayerView.yamm.reflectivStateChart.start(); 
			}
			catch(Exception e)
			{
				e.printStackTrace();
				logger.error("Simulation could not start.");
				LayerView.getSimulationState().stop(true);
				return;
			}
			LayerView.setStartButtonsEnabledState(true, null);

			if (calledIntern)
				calledIntern(SIM_SUSPEND);	

			LayerView.setSimulationState(SimulationIsRunning.getInstance());
		}
	}
	
	
	/**
	 * Checks if a Layer File has been loaded into the Layer View.
	 * 
	 * @return	<b>true</b>  - if there is at least one {@code Layer} object found/
	 * 			<b>false</b> - otherwise  
	 */
	private boolean isLayerAttached() 
	{
		if (LayerView.yamm.reflectivStateChart.objectManagement.getViewLayers().size() == 0) 
		{
			LayerView.logger.error("No layer attached"); 
			return false;
		} 
		else 
		{
			return true;
		}
	}
	
	
	/**
	 * Checks if a Layer File has a nsURI.
	 * 
	 * @return	<b>true</b>  - if the files has a nsURI/
	 * 			<b>false</b> - otherwise
	 */
	private boolean isNsURISet()
	{
		if (((Layer) LayerView.yamm.reflectivStateChart.objectManagement.getViewLayers()
				.get(LayerView.yamm.reflectivStateChart.objectManagement
				.getViewLayers().size()-1)).getNsURI().equals(""))  
		{
			LayerView.logger.error("nsURI is empty"); 
			return false;
		} 
		else
		{
			return true;
		}
	}
	
	
	/**
	 * Before Simulation starts a reset is done by clearing maps and lists of classes from the 
	 * yamm package. 
	 */
	private void resetSimulation()
	{
		LayerView.getActionStart().setImageDescriptor(online.yamm.init.Activator.getImageDescriptor(LayerView.getRunChartGif())); 
		LayerView.yamm.reflectivStateChart.objectManagement.clearObjectCaches();
		LayerView.yamm.reflectivStateChart.objectManagement.clearEPackages();
		ColorYAMMDiagram.clear();
//		ModifyYAMMDiagram.editParts.clear();
		LayerView.yamm.reflectivStateChart.objectManagement.resetNSURIs();
		online.yamm.logger.YAMMLogger.reset();
		LayerView.logger.resetLocal();
		LayerView.setStartButtonsEnabledState(false, true);
	}
}
