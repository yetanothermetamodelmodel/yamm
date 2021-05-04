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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import dev.yamm.EvalGuardOrEffect;
import dev.yamm.coreModelXmi.yamm.YClass;

public class CreateInstance {

	EvalGuardOrEffect execute;

	public CreateInstance(EvalGuardOrEffect execute) {
		this.execute = execute;
	}

	/** 
	 * instantiates a class.
	 * 
	 * @param className qualified class name
	 * @param layer current layer ( = 1)
	 * @return the created object
	 */
	public EObject createInstance(String className, int layer) {

		EClassifier eclassifier = execute.reflectivStateChart.objectManagement.getEClassifier(className, layer);

		if (eclassifier instanceof EClass) {
			EClass eclass = (EClass) eclassifier;
			EObject addingObject = eclass.getEPackage().getEFactoryInstance().create(eclass);
			//so it is really dynamic
			if(layer != 0) {
				if (addingObject instanceof EObjectImpl)
					((EObjectImpl)addingObject).eSetClass(eclass);
			}		
		
			execute.maps[layer].put(Integer.toHexString(addingObject.hashCode()), addingObject);
			execute.reflectivStateChart.objectManagement.introduceEObjectToLayerInformation(layer, addingObject);

			String objectId = "";
			// objectID
			if(addingObject.eClass().getEStructuralFeature("ObjectID") != null)
				execute.reflectivStateChart.objectManagement.set(addingObject, objectId = Integer.toHexString(addingObject.hashCode()),"ObjectID");
	
			// initialize this:
			if(addingObject.eClass().getEStructuralFeature("this") != null)
				execute.reflectivStateChart.objectManagement.set(addingObject, addingObject, "this");
			
			// initialize yClass:
			if(addingObject.eClass().getEStructuralFeature("yClass") != null)
			{	
				EObject metadata = execute.reflectivStateChart.objectManagement.eClassifierToYClassifierTransformed.get(addingObject.eClass());
				execute.reflectivStateChart.objectManagement.set(addingObject, metadata, "yClass");
			}
//				execute.reflectivStateChart.objectManagement.set(addingObject, execute.reflectivStateChart.objectManagement.eClassifierToYClassifier.get(eclass), "yClass");			
			
			//initialize internal:
			EStructuralFeature internal = addingObject.eClass().getEStructuralFeature("yammInternal");
			if (internal != null && addingObject.eGet(internal) == null) {	
				addingObject.eSet(internal, execute.reflectivStateChart.internal);
			}
			
			String name = "";
			if (!execute.reflectivStateChart.objectManagement.qualifiedTypeNameToNextDefaultNameNumber.containsKey(className))
				execute.reflectivStateChart.objectManagement.qualifiedTypeNameToNextDefaultNameNumber.put(className, 1);
			int number = execute.reflectivStateChart.objectManagement.qualifiedTypeNameToNextDefaultNameNumber.get(className);
			execute.reflectivStateChart.objectManagement.qualifiedTypeNameToNextDefaultNameNumber.put(className, number + 1);
			execute.reflectivStateChart.objectManagement.objectIdToName.get(layer).put(objectId, className + number);
			
			EClassifier simObj = execute.reflectivStateChart.objectManagement.getEClassifier("DES.SimulationObject", layer);
			if(simObj != null && aIsB(eclass, (EClass) simObj))
			{
				addingObject.eSet(addingObject.eClass().getEStructuralFeature("name"), name);			
				execute.reflectivStateChart.objectManagement.addSimObject(layer, addingObject);
			}
			EClassifier event = execute.reflectivStateChart.objectManagement.getEClassifier("DES.Event", layer);
			if(event != null && aIsB(eclass, (EClass) event))
			{
				execute.reflectivStateChart.objectManagement.addEvent(addingObject, layer);
			}
			if (layer > 0)
			{
				EObject yammInstance = execute.reflectivStateChart.objectManagement.qualifiedNameToYClassifier.get(layer).get(className);
				EClassifier queue = execute.reflectivStateChart.objectManagement.getEClassifier("DES.Queue", layer);

				if(queue != null && aIsB(eclass, (EClass) queue))
				{
					execute.reflectivStateChart.objectManagement.addQueue(addingObject, layer);
					execute.reflectivStateChart.objectManagement.addDelayQueue(addingObject, layer);
				}
				if (execute.reflectivStateChart.objectManagement.observedValues.containsKey(className))
				{
					execute.reflectivStateChart.objectManagement.propertyObserver
					.addObserver(addingObject, execute.reflectivStateChart.objectManagement.observedValues.get(className), layer);
				}							
			}

			return addingObject;
		}
		return null;
	}
	
	private boolean aIsB(EClass a, EClass b) {
		if (a.getEAllSuperTypes().contains(b))
			return true;
		else {
			for (EClass superType : a.getEAllSuperTypes()) {
				if (aIsB(superType, b)) {
					return true;
				}
			}
			return false;
		}
	}
	
	
}
