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
package dev.yamm.objectDiagram.design;

import java.util.Map;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class ObjectManagement {

	public <T> T getGen(EObject eObject, String... attributeNames) {
		return (T) get("", eObject, attributeNames);
	}
	
	public Object get(String postfix, EObject eObject, String... attributeNames) {

		if (attributeNames == null || (attributeNames != null && attributeNames.length == 0))
			return eObject;

		boolean lastFeatureIsStatic = false;
		Integer layer = null;
		String qualifiedClassName = null;
		Map<EStructuralFeature, Object> staticMap = null;
		EStructuralFeature feature = null;
		
		Object result = null;
		String lastFeatureName = null;
		
		for (String featureName : attributeNames) {
			lastFeatureName = featureName;
			
			if (featureName.equals("yContainer") || featureName.equals("container") || featureName.equals("rContainer") ) {
				result = eObject.eContainer();
			} else {
				feature = eObject.eClass().getEStructuralFeature(featureName);
				try {
					feature.getEAnnotation("staticFeature");
				} catch (Exception e) {
					e.printStackTrace();
				}
					lastFeatureIsStatic = false;
					result = eObject.eGet(feature);		
			}
			if (result instanceof EObject) {
				eObject = (EObject) result;
			}

		}
	
		return result;
	}
}
