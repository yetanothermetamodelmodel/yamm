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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import online.yamm.ChartManagement.SimulationIsRunningListener;
import online.yamm.ObjectManagement;

public class OutputObserver {

	public static HashMap<String, List<TimeToValue>> outputValues = new HashMap<>();
	public static ObjectManagement om;

	public static void setOutputObserver(EObject object, String featureName, String columnName) {
		
		outputValues.put(columnName, new ArrayList<>());
		
		object.eAdapters().add(new AdapterImpl() {
			@Override
			public void notifyChanged(Notification msg) {

				if (msg.getFeature() instanceof EStructuralFeature
						&& featureName.equals(((EStructuralFeature) msg.getFeature()).getName())) {
					TimeToValue<Integer,Double> newEntry = new TimeToValue<Integer,Double>(om.reflectivStateChart.getTimeStep(), ((Number) msg.getNewValue()).doubleValue());
					outputValues.get(columnName).add(newEntry);
				}
				
			}

		});
		om.reflectivStateChart.simulationIsRunningListener.add(new SimulationIsRunningListener() {
			
			@Override
			public void changed(boolean isRunning) {
				if(!isRunning) {
					om.reflectivStateChart.simulationIsRunningListener.remove(this);
					try {
						LayerViewLaboratory.instance.setOutputValue((om.getOutputEvalMethods().get("_Ouput_Eval_" + columnName).invoke(om.getOutputEvalObject().get("_Ouput_Eval_" + columnName), outputValues.get(columnName)).toString()),columnName,LayerViewLaboratory.instance.getRunNumber());
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						LayerViewLaboratory.instance.setOutputValue("Error", columnName, LayerViewLaboratory.instance.getRunNumber());
					}
				}
				
			}
		});
	}
}
