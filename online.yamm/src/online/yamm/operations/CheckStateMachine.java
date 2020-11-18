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

import java.util.ArrayList;
import java.util.HashMap;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

//import online.yamm.XMLCache.AbstractInteraction;
//import online.yamm.XMLCache.TrackingCache;
//import online.yamm.XMLCache.TrackingEntryType;
import online.yamm.EvalGuardOrEffect;
import online.yamm.init.LaunchTabGroupAnalysis;

/**
 * @author lobe
 *
 */

enum StateKind {START, NORMAL, END, UNKOWN};

public class CheckStateMachine 
{
	EvalGuardOrEffect execute = null;
	online.yamm.coreModelDiagram.yammDiagram.YVertex vertex = null;
	int validTransitions = -1;

	public CheckStateMachine(EvalGuardOrEffect execute) {
		this.execute = execute;
	}


	public Integer countInitialStates(Integer layer, String stateMachineObjectID, Boolean resetCache) {
		return execute.reflectivStateChart.objectManagement.getEObjects(layer, "Pseudostate-container-".concat(stateMachineObjectID)).size();
	}


	public Integer countFinalStates(Integer layer, String stateMachineObjectID, Boolean resetCache) {
		return execute.reflectivStateChart.objectManagement.getEObjects(layer, "FinalState-container-".concat(stateMachineObjectID)).size();
	}


	public Integer countStates(Integer layer, String stateMachineObjectID, Boolean resetCache) {
		return execute.reflectivStateChart.objectManagement.getEObjects(layer, "Pseudostate-container-".concat(stateMachineObjectID)).size() 
				+ execute.reflectivStateChart.objectManagement.getEObjects(layer, "State-container-".concat(stateMachineObjectID)).size()
				+ execute.reflectivStateChart.objectManagement.getEObjects(layer, "FinalState-container-".concat(stateMachineObjectID)).size();
	}


	public Integer countReachableStates(Integer layer, String stateMachineObjectID, boolean directionIsForward, Boolean resetCache) {		
		return reachableStates(layer, stateMachineObjectID, directionIsForward, resetCache).size();
	}


	public EList<EObject> reachableStates(Integer layer, String stateMachineObjectID, boolean directionIsForward, Boolean resetCache) {		
		EObject initialState;
		if (directionIsForward) {
			EList<EObject> initialStates = execute.reflectivStateChart.objectManagement.getEObjects(layer, "Pseudostate-container-".concat(stateMachineObjectID));
			if (initialStates.size() != 1)
				return new BasicEList<EObject>();
			initialState = initialStates.get(0);
		} else {
			EList<EObject> finalStates = execute.reflectivStateChart.objectManagement.getEObjects(layer, "FinalState-container-".concat(stateMachineObjectID));
			if (finalStates.size() != 1)
				return new BasicEList<EObject>();
			initialState = finalStates.get(0);
		}

		EList<EObject> reachedStates = new BasicEList<EObject>();
		reachedStates.add(initialState);
		computeReachableStates(layer, initialState, reachedStates, directionIsForward);
		//System.out.println(countStates(layer, stateMachineObjectID, resetCache) + " -> " + reachedStates.size());
		return reachedStates;
	}


	private void computeReachableStates(Integer layer, EObject currentState, EList<EObject> reachedStates, boolean directionIsForward) {
		String objectIDOfState = directionIsForward ? "source-".concat((String) execute.reflectivStateChart.objectManagement.get(currentState, "ObjectID")) :
			"target-".concat((String) execute.reflectivStateChart.objectManagement.get(currentState, "ObjectID"));
		EList<EObject> transitions = execute.reflectivStateChart.objectManagement.getEObjects(layer, objectIDOfState);

		EObject vertex;
		for (EObject transition : transitions) {
			vertex = (EObject) (directionIsForward ? execute.reflectivStateChart.objectManagement.get(transition, "target") : execute.reflectivStateChart.objectManagement.get(transition, "source"));
			if (!reachedStates.contains(vertex)) {
				reachedStates.add(vertex);
				if (vertex.eClass().getName().equals("State")) 
					computeReachableStates(layer, vertex, reachedStates, directionIsForward);		
			}
		}

	}


	public Integer countValidTransitions(Integer layer, String stateMachineObjectID, Boolean resetCache) {
		if (validTransitions == -1 || resetCache == true) {
			EList<EObject> transitions = execute.reflectivStateChart.objectManagement.getEObjects(layer, "Transition-container-".concat(stateMachineObjectID));
			validTransitions = 0;
			EObject attachment;
			for (EObject transition : transitions) {
				attachment = (EObject) execute.reflectivStateChart.objectManagement.get(transition, "attachment");
				if (((EObject) execute.reflectivStateChart.objectManagement.get(transition, "source")).eClass().getName().equals("Pseudostate") 
						|| ((EObject) execute.reflectivStateChart.objectManagement.get(transition, "source")).eClass().getName().equals("FinalState") ||
						attachment != null && ((EList<EObject>) execute.reflectivStateChart.objectManagement.get(attachment, "effects")).size() > 0)
					validTransitions++;
			}
		}

		return validTransitions;
	}


	public Integer countInValidTransitions(Integer layer, String stateMachineObjectID, Boolean resetCache) {
		return ((EList<EObject>) execute.reflectivStateChart.objectManagement.getEObjects(layer, "Transition-container-".concat(stateMachineObjectID))).size() 
				- countValidTransitions(layer, stateMachineObjectID, resetCache);
	}


	public Integer countRedundantTransitions(Integer layer, String stateMachineObjectID, Boolean resetCache) {
		EList<EObject> transitions = (EList<EObject>) execute.reflectivStateChart.objectManagement.getEObjects(layer, "Transition-container-".concat(stateMachineObjectID));
		HashMap<EObject, EList<EObject>> connectionsProcessed = new HashMap<EObject, EList<EObject>>();
		EList<EObject> targets = null;
		Integer redundantTransitions = 0;

		for (EObject transition : transitions) {
			if (connectionsProcessed.containsKey(execute.reflectivStateChart.objectManagement.get(transition, "source"))) {
				targets = connectionsProcessed.get(execute.reflectivStateChart.objectManagement.get(transition, "source"));
				if (targets.contains(execute.reflectivStateChart.objectManagement.get(transition, "target"))) {
					redundantTransitions++;
				} else {
					targets.add((EObject) execute.reflectivStateChart.objectManagement.get(transition, "target"));
					connectionsProcessed.put((EObject) execute.reflectivStateChart.objectManagement.get(transition, "source"), targets);
				}
			} else {
				targets = new BasicEList<EObject>();
				targets.add((EObject) execute.reflectivStateChart.objectManagement.get(transition, "target"));
				connectionsProcessed.put((EObject) execute.reflectivStateChart.objectManagement.get(transition, "source"), targets);	
			}
		}
		return redundantTransitions;
	}


	private Object getSetOfIdentifiedInteractions(Integer layer, String objectsFromClass) 
	{
//		// get all generated (starting point) interactions with all "next" interactions
//		ArrayList<ArrayList<EObject>> setOfidentifiedInteractions = new ArrayList<ArrayList<EObject>>();
//		int maxLength = 0;
//
//		EList<EObject> interactionPatternsEList = execute.reflectivStateChart.objectManagement.getEObjects(layer, objectsFromClass);		
//		for (EObject interactionPattern : interactionPatternsEList)
//		{
//			EStructuralFeature featInteractions = interactionPattern.eClass().getEStructuralFeature("interactions");
//			if (featInteractions != null)
//			{
//				Object interactionsObject = interactionPattern.eGet(featInteractions);
//				if (interactionsObject instanceof EList)
//				{
//					EList<?> interactionsEList = (EList<?>) interactionsObject;
//
//					// System.out.println("RMOF::Interactions found : " + interactionsEList.size());
//
//					for (Object interactionObject : interactionsEList)
//					{
//						if (interactionObject instanceof EObject)
//						{
//							EObject interaction = (EObject) interactionObject;
//
//							//							EStructuralFeature objectID = interaction.eClass().getEStructuralFeature("ObjectID");
//
//							// if there is no previous interaction ... we have a starting point 
//							EStructuralFeature featPrevious = interaction.eClass().getEStructuralFeature("previous");
//							EStructuralFeature featNext = interaction.eClass().getEStructuralFeature("next");
//							//							EStructuralFeature guiElement = interaction.eClass().getEStructuralFeature("guiElement");
//							//							System.out.println("Interaction element found with objectID : " + interaction.eGet(objectID) + " / " + interaction);
//							//							System.out.println("--> previous element : " + interaction.eGet(featPrevious));
//							//							System.out.println("--> next element : " + interaction.eGet(featNext));
//							//							System.out.println("--> GUI element : " + interaction.eGet(guiElement));
//							//							System.out.println();
//
//							Object previousInteractions = interaction.eGet(featPrevious);
//
//							if (featPrevious != null && previousInteractions instanceof EList<?> 
//							&& ((EList<?>) previousInteractions).size() == 0)		
//							{
//								ArrayList<EObject> identifiedInteractions = new ArrayList<EObject>();
//								identifiedInteractions.add(interaction);
//
//								// System.out.println("--> Next element : " + interaction.eGet(featNext));
//								// System.out.println("--> GUI element : " + interaction.eGet(guiElement));
//
//								// store all "next" interactions ...
//								Object nextInteraction = interaction.eGet(featNext);
//								// int nextCounter = 0;
//								while (nextInteraction != null 
//										&& nextInteraction instanceof EObject 
//										&& !identifiedInteractions.contains(nextInteraction))	// cycle
//								{
//									identifiedInteractions.add((EObject) nextInteraction);
//									interaction = (EObject) nextInteraction;
//									nextInteraction = interaction.eGet(featNext);
//
//									// System.out.println("--> Next element : " + interaction.eGet(featNext) + " / " + nextCounter++);
//									// System.out.println("--> GUI element : " + interaction.eGet(guiElement));
//								}
//
//								//								// only store interaction sequences longer than one
//								//if (identifiedInteractions.size() > 1)
//								//{
//								maxLength = Math.max(identifiedInteractions.size(), maxLength);
//								setOfidentifiedInteractions.add(identifiedInteractions);
//								//}
//							}
//						}
//					}
//				}
//			}
//		}
//
//		// int counter = 0;
//
//		HashMap<Integer, Integer> length2NumberOfIdentifiedInteractions = new HashMap<Integer, Integer>();
//		for (ArrayList<EObject> identifiedInteractions : setOfidentifiedInteractions)
//		{
//			Integer key = identifiedInteractions.size();
//			Integer value = length2NumberOfIdentifiedInteractions.get(key);
//
//			if (value == null)
//				value = new Integer(1);
//			else
//				value = new Integer(value + 1);
//
//			length2NumberOfIdentifiedInteractions.put(key, value);
//		}
//
//		//		int connectedNodes = 0;
//		//		int nodes = 0;
//		//		for (Integer length : length2NumberOfIdentifiedInteractions.keySet())
//		//		{
//		//			// System.out.println("RMOF::Length : " + length + " --> " + length2NumberOfIdentifiedInteractions.get(length));
//		//			connectedNodes += length * length2NumberOfIdentifiedInteractions.get(length);
//		//			nodes += length2NumberOfIdentifiedInteractions.get(length);
//		//		}
//		//		 System.out.println("RMOF::Nodes : " + nodes + ", connected nodes : " + connectedNodes);
//
//		// fill abstract interactions
//		AbstractInteraction[][] abstractInteractions = new AbstractInteraction[setOfidentifiedInteractions.size()][maxLength];
//		for (int interactionSequenceCounter = 0; interactionSequenceCounter < setOfidentifiedInteractions.size(); interactionSequenceCounter++)
//		{
//			ArrayList<EObject> identifiedInteractions = setOfidentifiedInteractions.get(interactionSequenceCounter);
//
//			// fill assigned set with interaction abstractions
//			for (int interactionElementCounter=0; interactionElementCounter<identifiedInteractions.size(); interactionElementCounter++)
//			{	
//				EObject interactionEObject = identifiedInteractions.get(interactionElementCounter);
//				EClass interactionEClass = interactionEObject.eClass();
//				String interactionClassName = interactionEClass.getName();
//				EStructuralFeature referencedGUIElementFeature = interactionEClass.getEStructuralFeature("guiElement");
//				String GUID = null;
//
//				if (referencedGUIElementFeature != null)
//				{
//					Object referencedGUIElement = interactionEObject.eGet(referencedGUIElementFeature);
//					if (referencedGUIElement != null)
//					{
//						EObject guiElementEObject = (EObject) referencedGUIElement;
//						EStructuralFeature referencedGUIDFeature = guiElementEObject.eClass().getEStructuralFeature("referencedGUIElement");
//						if (referencedGUIDFeature != null)
//							GUID = (String) guiElementEObject.eGet(referencedGUIDFeature);
//					}
//				}
//
//				EStructuralFeature stateMaskFeature = interactionEClass.getEStructuralFeature("stateMask");
//				byte stateMaskIndex = (Byte) interactionEObject.eGet(stateMaskFeature);
//
//				HashMap<Short, Short> asciikeys = null;
//				if ("KeyboardInteraction".equals(interactionEClass.getName()))
//				{
//					asciikeys = new HashMap<Short, Short>();
//					EStructuralFeature asciiCodeFeature = interactionEClass.getEStructuralFeature("asciikeys");
//
//					Object value = interactionEObject.eGet(asciiCodeFeature);
//					if (value != null && value instanceof EList<?>)
//					{
//						EList<Object> values = (EList<Object>) value;
//						for (Object untypedValue : values)
//						{
//							if (untypedValue instanceof Short)
//								asciikeys.put((Short) untypedValue, (Short) untypedValue);
//						}
//					}
//				}
//
//				EStructuralFeature objectIDFeature = interactionEClass.getEStructuralFeature("ObjectID");
//				String objectID = (String) interactionEObject.eGet(objectIDFeature);
//
//				// System.out.println(" <Building the abstraction> " + interactionEObject + "\n REFERENCES GUI ELEMENT = " + GUID);
//
//				AbstractInteraction newAbstractInteraction = null;
//
//				if ("VoidInteraction".equals(interactionClassName))
//					newAbstractInteraction = new AbstractInteraction(objectID, TrackingEntryType.VOID_INTERACTION, identifiedInteractions.get(interactionElementCounter), GUID, stateMaskIndex, asciikeys);
//				else if ("KeyboardInteraction".equals(interactionClassName))
//					newAbstractInteraction = new AbstractInteraction(objectID, TrackingEntryType.KEYBOARD_INTERACTION, identifiedInteractions.get(interactionElementCounter), GUID, stateMaskIndex, asciikeys);
//				else if ("LeftButtonMouseInteraction".equals(interactionClassName))
//					newAbstractInteraction = new AbstractInteraction(objectID, TrackingEntryType.LEFT_BUTTON_MOUSE_INTERACTION, identifiedInteractions.get(interactionElementCounter), GUID, stateMaskIndex, asciikeys);
//				else if ("MiddleButtonMouseInteraction".equals(interactionClassName))
//					newAbstractInteraction = new AbstractInteraction(objectID, TrackingEntryType.MIDDLE_BUTTON_MOUSE_INTERACTION, identifiedInteractions.get(interactionElementCounter), GUID, stateMaskIndex, asciikeys);
//				else if ("RightButtonMouseInteraction".equals(interactionClassName))
//					newAbstractInteraction = new AbstractInteraction(objectID, TrackingEntryType.RIGHT_BUTTON_MOUSE_INTERACTION, identifiedInteractions.get(interactionElementCounter), GUID, stateMaskIndex, asciikeys);
//				else if ("WheelMouseInteraction".equals(interactionClassName))
//					newAbstractInteraction = new AbstractInteraction(objectID, TrackingEntryType.WHEEL_MOUSE_INTERACTION, identifiedInteractions.get(interactionElementCounter), GUID, stateMaskIndex, asciikeys);
//				else
//					newAbstractInteraction = new AbstractInteraction(objectID, TrackingEntryType.UNKNOWN, identifiedInteractions.get(interactionElementCounter), GUID, stateMaskIndex, asciikeys);
//
//				//				boolean found = false;
//				//				for (AbstractInteraction[] createdAbstractInteractions : abstractInteractions)
//				//				{
//				//					for (AbstractInteraction createdAbstractInteraction : createdAbstractInteractions)
//				//					{
//				//						if (createdAbstractInteraction == null)
//				//							break;
//				//						
//				//						if (createdAbstractInteraction.equals(newAbstractInteraction))
//				//						{
//				//							abstractInteractions[interactionSequenceCounter][interactionElementCounter] = createdAbstractInteraction;
//				//							found = true;
//				//							// break;
//				//						}
//				//					}
//				//					
//				//					if (found)
//				//						break;
//				//				}
//				//				
//				//				if (!found)
//				abstractInteractions[interactionSequenceCounter][interactionElementCounter] = newAbstractInteraction;
//			}
//		}
//
//		HashMap<Integer, Integer> length2NumberOfAbstractInteractions = new HashMap<Integer, Integer>();
//		for (int a = 0; a < abstractInteractions.length; a++)
//		{
//			AbstractInteraction[] identifiedInteractions = abstractInteractions[a];
//			Integer key = new Integer(0);
//			while (key < identifiedInteractions.length 
//					&& identifiedInteractions[key] != null)
//				key = new Integer(key + 1);
//
//			Integer value = length2NumberOfAbstractInteractions.get(key);
//
//			if (value == null)
//				value = new Integer(1);
//			else
//				value = new Integer(value + 1);
//
//			length2NumberOfAbstractInteractions.put(key, value);
//		}
//
//		//		connectedNodes = 0;
//		//		nodes = 0;
//		//		for (Integer length : length2NumberOfAbstractInteractions.keySet())
//		//		{
//		//			// System.out.println("Abstractions::Length : " + length + " --> " + length2NumberOfAbstractInteractions.get(length));
//		//			connectedNodes += length * length2NumberOfAbstractInteractions.get(length);
//		//			nodes += length2NumberOfAbstractInteractions.get(length);
//		//		}
//		//		System.out.println("Abstractions::Nodes : " + nodes + ", connected nodes : " + connectedNodes);

//		return abstractInteractions;
		return null;
	}


	public void computePattern(Integer layer1, String interactionPatternClass, Integer layer2, String fitnessObserverClass) 	
	{
//		AbstractInteraction[][] abstractInteractions = getSetOfIdentifiedInteractions(layer1, interactionPatternClass);
//
//		for (EObject fitnessObserver : execute.reflectivStateChart.objectManagement.getEObjects(layer2, fitnessObserverClass))	
//		{
//			TrackingCache trackingCache = TrackingCache.getInstance();
//			if (trackingCache != null)
//				trackingCache.computePatternCoverage(abstractInteractions, fitnessObserver, execute.reflectivStateChart.objectManagement);	
//			else
//				System.err.println("TrackingCache was not set!");
//		}
	}

}
