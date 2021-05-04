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
package dev.yamm;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EObject;

public class QueueObserver {

	private ObjectManagement om;
	
	/** queue -> timeStep:int -> size:int */
	private Map<Object, List<Entry<Integer, Integer>>> queueToQueueValues = new HashMap<>();
	private Map<Object, Integer> lastSize = new HashMap<>();
	private Map<Object, String> typeAndIds = new HashMap<>();

	public QueueObserver(ObjectManagement objectManagement) {
		om = objectManagement;
		om.addQueueListener.add((queue, layer, queueList, delayQueueList) -> {
			queueToQueueValues.put(queue, new ArrayList<>());
			lastSize.put(queue, 0);
			String objectId = (String) ((EObject) queue).eGet(((EObject) queue).eClass().getEStructuralFeature("ObjectID"));
			String name = om.objectIdToName.get(layer).get(objectId);
			String type = ((EObject) queue).eClass().getName();
			String typeAndId = type + " " + name; 
			typeAndIds.put(queue, typeAndId);
		});
		
		om.queueListener.add((event, object, queue) -> {
			
			int timeStep = om.reflectivStateChart.internal.getSimulationTime();
			
			if (event == ObjectManagement.QueueListener.ADD)
			{
				int lastSize = this.lastSize.get(queue);
				int sizeQueue = ((List<EObject>) ((EObject) queue).eGet(((EObject) queue).eClass().getEStructuralFeature("queue"))).size();
				int sizeQueueDelayed = ((List<EObject>) ((EObject) queue).eGet(((EObject) queue).eClass().getEStructuralFeature("delayed"))).size();
				int sizeTotal = sizeQueue + sizeQueueDelayed;
				if (lastSize < sizeTotal)
				{
					queueToQueueValues.get(queue).add(new AbstractMap.SimpleEntry<Integer, Integer>(timeStep, lastSize + 1));
					this.lastSize.put(queue, lastSize + 1);
				}
			}
			else if (event == ObjectManagement.QueueListener.REMOVE)
			{
				int lastSize = this.lastSize.get(queue);
				queueToQueueValues.get(queue).add(new AbstractMap.SimpleEntry<Integer, Integer>(timeStep, lastSize - 1));
				this.lastSize.put(queue, lastSize - 1);
			}
		});
		
		om.delayQueueListener.add((event, object, queue) -> {			

			int timeStep = om.reflectivStateChart.internal.getSimulationTime();
			
			if (event == ObjectManagement.QueueListener.ADD)
			{
				int lastSize = this.lastSize.get(queue);
				queueToQueueValues.get(queue).add(new AbstractMap.SimpleEntry<Integer, Integer>(timeStep, lastSize + 1));
				this.lastSize.put(queue, lastSize + 1);
			}

		});
		
		om.reflectivStateChart.simulationIsRunningListener.add(new ChartManagement.SimulationIsRunningListener() {
			
			@Override
			public void changed(boolean isRunning) {
				if (!isRunning)
				{	
					Map<String, List<Entry<Integer, Integer>>> output = new HashMap<>();
					for (Entry<Object, List<Entry<Integer, Integer>>> entry : queueToQueueValues.entrySet())
					{
						Object queue = entry.getKey();
						String typeAndId = typeAndIds.get(queue);
						String[] typ = typeAndId.split(" ");
						String objectId = (String) ((EObject) queue).eGet(((EObject) queue).eClass().getEStructuralFeature("ObjectID"));
						typeAndId = typ[0] + " " + om.objectIdToName.get(1).get(objectId);
						entry.getValue();
						output.put(typeAndId, entry.getValue());
					}
					om.setResultQueue(output);	
					
					om.reflectivStateChart.simulationIsRunningListener.remove(this);
				}
				
			}
		});

	}
}
