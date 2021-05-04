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
package dev.yamm.operations;

import org.eclipse.swt.widgets.Display;

import dev.yamm.EvalGuardOrEffect;
import dev.yamm.ObjectManagement;
import dev.yamm.Zerochart;
import dev.yamm.coloring.ColorYAMMDiagram;
import dev.yamm.gui.LayerView;
import dev.yamm.init.LaunchTabGroupAnalysis;
import dev.yamm.objDiagram.ObjectDiagramManager;

public class ChartOperation {

	int stateNR;

	EvalGuardOrEffect execute;

	public ChartOperation(EvalGuardOrEffect execute) {
		this.execute = execute;
	}

	public void breakpoint() {
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

		execute.pauseExecution.stepOver = false;
		execute.pauseExecution.stepReturn = false;

		stateNR = execute.reflectivStateChart.getStateNR();
		execute.reflectivStateChart.setStateNR(Zerochart.finalstate+1);
		execute.reflectivStateChart.setBreakpoint(true);

		LayerView.setBreakActive(true);
	}

	public void continueChart() {
		if(execute.reflectivStateChart.getStateNR()!= Zerochart.finalstate) {
			if (!execute.reflectivStateChart.standalone)
			{
				String objectDiagrampath = execute.reflectivStateChart.objectManagement.getViewLayers().get(0).getObjectDiagramPath();
				if (objectDiagrampath != null
						&& !objectDiagrampath.equals("")
						&& ObjectDiagramManager.openObjectDiagrams.contains(objectDiagrampath))
				{
					Display.getDefault().syncExec(new Runnable() {
						public void run() {
							Zerochart.modelSynchronizer.updateRuntimeModel();
						}
					});
				}
					
			}
			LayerView.setBreakActive(false);
			if(execute.reflectivStateChart.transitionBreak) {
				execute.reflectivStateChart.setStateNR(Zerochart.TransitionIdentified);
				execute.reflectivStateChart.transitionBreak = false;
			} else {
				execute.reflectivStateChart.setStateNR(Zerochart.SubEffectIdentified);
			}

			execute.reflectivStateChart.setBreakpoint(false);			
			execute.reflectivStateChart.reflectivSChart();
		}
	}

	public void continueStep() {
		if(execute.reflectivStateChart.getStateNR()!= Zerochart.finalstate) {
			if (!execute.reflectivStateChart.standalone)
			{
				String objectDiagrampath = execute.reflectivStateChart.objectManagement.getViewLayers().get(0).getObjectDiagramPath();
				if (objectDiagrampath != null
						&& !objectDiagrampath.equals("")
						&& ObjectDiagramManager.openObjectDiagrams.contains(objectDiagrampath))
				{
					Display.getDefault().syncExec(new Runnable() {
						public void run() {
							Zerochart.modelSynchronizer.updateRuntimeModel();
						}
					});
				}
			}
			if(execute.reflectivStateChart.transitionBreak) {
				execute.reflectivStateChart.setStateNR(Zerochart.TransitionIdentified);
				execute.reflectivStateChart.transitionBreak = false;
			} else {
				execute.reflectivStateChart.setStateNR(Zerochart.SubEffectIdentified);
			}
			execute.reflectivStateChart.reflectivSChart();
		}
	}
}
