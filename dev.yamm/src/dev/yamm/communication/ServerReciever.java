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
package dev.yamm.communication;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.swt.widgets.Display;

import dev.yamm.Pair;
import dev.yamm.gui.LayerViewLaboratory;
import dev.yamm.gui.LayerViewPivotGrid;

public class ServerReciever{


	public void testConnection(String message) {
		System.out.println(message);
		
	}

	public void setMarkedProperties(Entry<Map<String, Pair<String>>, Map<String, List<Pair<String>>>> resultMarkedProperties, int row) {
		Display.getDefault().asyncExec(new Runnable() {
            public void run() {
            	LayerViewPivotGrid.instance.porpertyObserver(resultMarkedProperties.getKey(), resultMarkedProperties.getValue(),row);
            }
        });	
	}
	
	public void setProgress(int row, int iteration) {
		Display.getDefault().asyncExec(new Runnable() {
            public void run() {
            	LayerViewLaboratory.instance.setProgress(row, iteration);
            }
        });	
	}
	
	public void setResultQueue(Map<String, List<Entry<Integer, Integer>>> list, int row) {
		Display.getDefault().asyncExec(new Runnable() {
            public void run() {
            	LayerViewPivotGrid.instance.resultQueue(list, row);
            }
        });	
	}
	
	public void setResultSimObjectActive(Map<String, List<Entry<Integer, Boolean>>> resultSimObjActive, int row) {
		Display.getDefault().asyncExec(new Runnable() {
            public void run() {
            	LayerViewPivotGrid.instance.resultObjectActivity(resultSimObjActive, row);
            }
		});
	}
}
