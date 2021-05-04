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

private Object inoutHelper(String lastFeatureName, String postfix
			, boolean isINOUT, EList<InoutAdapter> inAdapters, Function<Object, Object> exp, boolean isParam) {
			
		if (isINOUT) {
			InoutAdapter inAdapter;
			
			EObject containingClass = (EObject) exp.apply(null); // --> Stackframe if isParam == true
			
			if (containingClass.eClass().getEStructuralFeature(lastFeatureName).isMany())
				inAdapter = new InoutAdapterMany();
			else
				inAdapter = new InoutAdapterSingle();
			
			inAdapters.add(inAdapter);
			
			Object arg = get(postfix, containingClass, lastFeatureName);
			
			if (isParam) {
				inAdapter.setParamNameForInit(lastFeatureName);
			} else {
				inAdapter.setPropertyName(lastFeatureName);
				inAdapter.setObjWithProperty(containingClass);
			}

			return arg;
		} else {
			return exp.apply(null);
		}
	
	}
