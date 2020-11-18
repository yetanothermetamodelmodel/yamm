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

/**
 * The state of the Simulation when {@link Layer #getWaittime()} is != 0.
 */
public class SimulationPauses extends SimulationState {

	/** The Singleton instance of class SimulationPauses. */
	private static SimulationPauses instance;
	
	
	/** The private constructor. */
	private SimulationPauses()
	{
	}
	
	/**
	 * The getter for the Singleton instance of {@code SimulationPauses}.
	 * 
	 * @return {@link #instance}
	 */
	public static SimulationPauses getInstance()
	{
		if (instance == null)
			instance = new SimulationPauses();
		
		return instance;
	}

	/**
	 * The Simulations behavior when the  run (pause) button has been pressed: the simulation pauses
	 * and prepares for continuing. Changes the Simulations state to: SimulationIsRunning.
	 */
	@Override
	public synchronized void run() 
	{
		if (LayerView.runWaitTime && !LayerView.breakActive)  
		{	 
		LayerView.getActionStart().setImageDescriptor(online.yamm.init.Activator.getImageDescriptor(LayerView.getRunChartGif())); 
		LayerView.yamm.reflectivStateChart.simulationInStepMode = true;
		LayerView.setRunWaitTime(false);
		LayerView.runWaitTimeStop = true;
		LayerView.setSimulationState(SimulationIsRunning.getInstance());
		isContinuationAfterPause = true;
		}
	}
}
