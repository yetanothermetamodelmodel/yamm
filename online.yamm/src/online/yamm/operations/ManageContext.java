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

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import online.yamm.EvalGuardOrEffect;

public class ManageContext {
	
	EvalGuardOrEffect execute;

	EMap<String, EList<EObject>> context = new BasicEMap<String, EList<EObject>>();
	
	public ManageContext(EvalGuardOrEffect execute) {
		this.execute = execute;
	}
	
	public void createContext(String name, int layer) {
		EList<EObject> list = new UniqueEList<EObject>();
		context.put(name, list);
	}
	
	public EList<EObject> getContext(String name, int layer) {
		return context.get(name);
	}
	
	public void removeContext(String name, int layer) {
		context.removeKey(name);
	}
	
	public EList<EObject> getInstancesOfContext(String contextName, String className, int layer) {
		EList<EObject> list = context.get(contextName);
		EList<EObject> result = new BasicEList<EObject>();
		for(EObject obj : list) {
			EClass eClass = obj.eClass();
			if(eClass.getName().equals(className)) {
				result.add(obj);
			}
		}
		return result;
	}
}
