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
package online.yamm.operations;


import java.util.Date;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.widgets.Display;

import online.yamm.ConfigurationManagement;
import online.yamm.EvalGuardOrEffect;
import online.yamm.Zerochart;
import online.yamm.coloring.ColorYAMMDiagram;
import online.yamm.gui.Layer;
import online.yamm.gui.LayerView;
import online.yamm.logger.YAMMLogger;


public class PauseExecution {

	private static YAMMLogger logger = YAMMLogger.getYAMMLogger("YAMM Log");
	EvalGuardOrEffect execute;
	public EObject stateMachineHandler = null;
	public boolean stepOver = false;
	public boolean stepReturn = false;
	
    public PauseExecution(EvalGuardOrEffect execute) {
    	this.execute = execute;
	}

	public void pause( long numberMillis, int layer, final EObject smh ) //TODO Parameter numberMillis entfernen?
    {
		
    	int layerSize = execute.reflectivStateChart.objectManagement.getViewLayers().size();
    	if(layer < layerSize && ((Layer)execute.reflectivStateChart.objectManagement.getViewLayers().get(layer)).isStepWait()) {
    		numberMillis = ((Layer)execute.reflectivStateChart.objectManagement.getViewLayers().get(layer)).getWaittime();
    		if(numberMillis == 0 && !LayerView.runWaitTimeStop) {
    			return;
    		}
    		if(LayerView.runWaitTimeStop) {
    			if(stepReturn) {
    				//do nothin
    			} else if(stepOver) { // simulation in step over mode. If zerochart.smh is not the same as the smh from the beginning of the step, breakpoint() is not invoked  
    				if(stateMachineHandler.equals(execute.reflectivStateChart.zerochart.activeStateMachineHandler)) { 
    					stepOver = false;
    					stateMachineHandler = null;
    					
    					execute.chartOperation.breakpoint();
    				}
    			} else { //step into
    				execute.chartOperation.breakpoint();
    			}
    		} else /*if(numberMillis is set via waittime in the view) && !LayerView.runWaitTimeStop -> (runWaitTimeStop only after run or stop false!)*/ {
    			waiting();
    			
				//color all cached colorElements 
				if(ConfigurationManagement.isColoring()) {
					Display.getDefault().syncExec(new Runnable() {
						public void run() {
							//ModifyRMOFDiagram.flushColor();
//							ModifyUMADiagram.flushColor();
							ColorYAMMDiagram.colorStatemachine(smh);
						}
					});
				}
    			
            	TimeThread p = new TimeThread(numberMillis, execute);
            	p.start();
    		}
    	}	
    }
    
	private void waiting() {
		execute.reflectivStateChart.setStateNR(Zerochart.finalstate+1);
		execute.reflectivStateChart.setBreakpoint(true);
		execute.reflectivStateChart.wait = true;	
		LayerView.setRunWaitTime(true);
	}

	public void waitEnd() {
		if(execute.reflectivStateChart.getStateNR()!= Zerochart.finalstate && !LayerView.runWaitTimeStop) {
//			logger.info("Continue the chart on state: OperationIdentified layer: -1");
			execute.reflectivStateChart.setStateNR(Zerochart.SubEffectIdentified);
			execute.reflectivStateChart.setBreakpoint(false);
			LayerView.setRunWaitTime(false);
			
			execute.reflectivStateChart.reflectivSChart();	
		}
	}

}

class TimeThread extends Thread {
	long numberMillis;
	EvalGuardOrEffect execute;
	
	TimeThread(long numberMillis, EvalGuardOrEffect execute) {
		this.numberMillis = numberMillis;
		this.execute = execute;
	}
	
    @Override
	public void run() {
      Date now = new Date();
      long exitTime = now.getTime() + numberMillis;
      boolean wait = true;
      while( wait ) {
			now = new Date();
			if( now.getTime() > exitTime ) {
				if(execute.reflectivStateChart.breakpoint && LayerView.runWaitTime) {
					execute.pauseExecution.waitEnd();
				}			
			    return;
			}
	    }
        
    }
}
