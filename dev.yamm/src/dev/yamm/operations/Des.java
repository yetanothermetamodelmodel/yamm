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

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;

import dev.yamm.EvalGuardOrEffect;
import dev.yamm.ObjectManagement;

public class Des
{

	EvalGuardOrEffect execute;
	
	public Des(EvalGuardOrEffect execute)
	{
		this.execute = execute;
	}

	/********************** Event Queue ************************************************/
	
	public EObject eventQueueConsume(Integer timeStep, Boolean past, Object eventType, Object receiver,
			Object receiverType, int layer)
	{
		List<EObject> eventQueue = execute.reflectivStateChart.objectManagement.eventQueue.get(layer);
		EObject event = getElementEventQueue(eventQueue, timeStep, past, eventType, receiver, receiverType);
		if (event != null)
			execute.reflectivStateChart.objectManagement.removeEvent(event, layer);
		return event;
	}

	public EObject eventQueuePeek(Integer timeStep, Boolean past, Object eventType, Object receiver,
			Object receiverType, int layer)
	{
		List<EObject> eventQueue = execute.reflectivStateChart.objectManagement.eventQueue.get(layer);
		EObject event = getElementEventQueue(eventQueue, timeStep, past, eventType, receiver, receiverType);
		return event;
	}

	private EObject getElementEventQueue(List<EObject> eventQueue, int timeStep, Boolean past, Object eventType,
			Object receiver, Object receiverType)
	{
		ObjectManagement om = execute.reflectivStateChart.objectManagement;
		List<EObject> matchingEvents = new ArrayList<>();
		for (EObject event : eventQueue)
		{
			if ((past && timeStep >= (Integer) om.get(event, "timeStep")
					|| !past && timeStep <= (Integer) om.get(event, "timeStep"))
					&& (receiverType == null || receiverType == om.get(event, "receivingType"))
					&& (receiver == null || receiver == om.get(event, "receivingObject"))
					&& (eventType == null || om.<String>getGen((EObject) eventType, "name").equals(om.<String>getGen(event, "yClass", "name"))))
				matchingEvents.add(event);
		}
		if (matchingEvents.isEmpty())
			return null;
		EObject nextEvent = matchingEvents.get(0);
		for (EObject event : matchingEvents)
		{
			if ((Integer) om.get(nextEvent, "timeStep") > (Integer) om.get(event, "timeStep"))
				nextEvent = event;
		}
		return nextEvent;
	}
	
	/********************** Queue ************************************************/
	
	public EObject queueConsume(Object filterMapParam, EObject queue, int layer)
	{
		Map<String, Object> filterMap = (Map<String, Object>) filterMapParam;	
//		EClassifier queueType = queue.eClass().getEStructuralFeature("type").getEType();
		
		List<EObject> objectsInQueue = (List<EObject>) execute.reflectivStateChart.objectManagement.get(queue, "queue");
		
		for (EObject queueEntry : objectsInQueue)
		{
			EClass metaData = queueEntry.eClass();
			boolean match = true;
			for (Entry<String, Object> filter: filterMap.entrySet())
			{
				EStructuralFeature feature = metaData.getEStructuralFeature(filter.getKey());
	
				if (feature != null)
				{
					Object queueEntryValue = queueEntry.eGet(feature);
					
					if (filter.getValue() == null && queueEntryValue == null)
						match = true;
					else if (filter.getValue() == null)
						match = false;
					else if (queueEntryValue == null)
						match = false;
					else if (feature.getEType() == EcorePackage.Literals.EINT 
							&& ((Integer) queueEntryValue).intValue() != (Integer) filter.getValue())
						match = false;
					else if (feature.getEType() == EcorePackage.Literals.EBOOLEAN 
							&& ((Boolean) queueEntryValue).booleanValue() != (Boolean) filter.getValue())
						match = false;
					else if (feature.getEType() == EcorePackage.Literals.ESTRING 
							&& !((String) queueEntryValue).equals(filter.getValue()))
						match = false;
					else if (feature.getEType() == EcorePackage.Literals.EFLOAT 
							&& ((Float) queueEntryValue).floatValue() != (Float) filter.getValue())
						match = false;
					else if (feature.getEType() == EcorePackage.Literals.EDOUBLE 
							&& ((Double) queueEntryValue).doubleValue() != (Double) filter.getValue())
						match = false;
					else if (feature.getEType() == EcorePackage.Literals.EJAVA_OBJECT  
							&& queueEntryValue != filter.getValue())
						match = false;
//					else if (feature.getEType() == yammPackage.getYLargeInteger() yammPackage.getYRational() yammPackage.getYReal()
//							&& ((Integer) queueEntryValue).intValue() != (Integer) filter.getValue())
//						match = true;
				}			
			}
			if (match)
			{
				objectsInQueue.remove(queueEntry);
				execute.reflectivStateChart.objectManagement.removeQueueElement(queue, queueEntry, layer);
				return queueEntry;
			}	
		}
		return null;
	}

	public EObject queuePeek(Object filterMapParam, EObject queue, int layer)
	{
		Map<String, Object> filterMap = (Map<String, Object>) filterMapParam;	
//		EClassifier queueType = queue.eClass().getEStructuralFeature("type").getEType();
		
		List<EObject> objectsInQueue = (List<EObject>) execute.reflectivStateChart.objectManagement.get(queue, "queue");
		
		for (EObject queueEntry : objectsInQueue)
		{
			EClass metaData = queueEntry.eClass();
			boolean match = true;
			for (Entry<String, Object> filter: filterMap.entrySet())
			{
				EStructuralFeature feature = metaData.getEStructuralFeature(filter.getKey());
	
				if (feature != null)
				{
					Object queueEntryValue = queueEntry.eGet(feature);
					
					if (filter.getValue() == null && queueEntryValue == null)
						match = true;
					else if (filter.getValue() == null)
						match = false;
					else if (queueEntryValue == null)
						match = false;
					else if (feature.getEType() == EcorePackage.Literals.EINT 
							&& ((Integer) queueEntryValue).intValue() != (Integer) filter.getValue())
						match = false;
					else if (feature.getEType() == EcorePackage.Literals.EBOOLEAN 
							&& ((Boolean) queueEntryValue).booleanValue() != (Boolean) filter.getValue())
						match = false;
					else if (feature.getEType() == EcorePackage.Literals.ESTRING 
							&& !((String) queueEntryValue).equals(filter.getValue()))
						match = false;
					else if (feature.getEType() == EcorePackage.Literals.EFLOAT 
							&& ((Float) queueEntryValue).floatValue() != (Float) filter.getValue())
						match = false;
					else if (feature.getEType() == EcorePackage.Literals.EDOUBLE 
							&& ((Double) queueEntryValue).doubleValue() != (Double) filter.getValue())
						match = false;
					else if (feature.getEType() == EcorePackage.Literals.EJAVA_OBJECT  
							&& queueEntryValue != filter.getValue())
						match = false;
//					else if (feature.getEType() == yammPackage.getYLargeInteger() yammPackage.getYRational() yammPackage.getYReal()
//							&& ((Integer) queueEntryValue).intValue() != (Integer) filter.getValue())
//						match = true;
				}			
			}
			if (match)
			{
				return queueEntry;
			}	
		}
		return null;
	}
	
	
	public Integer timeStep(int layer)
	{
		return execute.reflectivStateChart.internal.getSimulationTime();
		// TODO: timeStep for layer != 1
	}
	
	
	
}



















