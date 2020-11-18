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

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import online.yamm.EvalGuardOrEffect;
import online.yamm.coreModelXmi.yamm.YOperation;

public class CreateObjectID {
	
	EvalGuardOrEffect execute;
	
	public CreateObjectID(EvalGuardOrEffect execute) {
		this.execute = execute;
	}
	
	public String getID(Object actObject, int layer) {
		YOperation operation = null;
		if(actObject instanceof YOperation) {
			operation = (YOperation) actObject;
			actObject = operation.getClazz();
		}
		EMap<String, EObject> actLayer = execute.reflectivStateChart.objectManagement.getObjectCache(layer+1);
		String metaInstanceName ="";
		String IDObject = Integer.toHexString(actObject.hashCode());
	
		EObject curObj = (EObject) actObject;
		metaInstanceName = (String) execute.reflectivStateChart.objectManagement.get(curObj, "name");
		EClass eclass = (EClass) execute.reflectivStateChart.objectManagement.getEClassifier(metaInstanceName,layer+1);
		EObject created = eclass.getEPackage().getEFactoryInstance().create(eclass);
	 	((EObjectImpl)created).eSetClass(eclass); //so it is really dynamic
		//Connection ID(upperObject) -> Object
		actLayer.put(IDObject, created);

		if(operation != null) {
			//Create operation class
			String className = operation.getClazz().getName()+operation.getName()+operation.getObjectID();
			EClass opclass = (EClass) execute.reflectivStateChart.objectManagement.getEClassifier(className,layer+1);
			EObject newCreated = opclass.getEPackage().getEFactoryInstance().create(opclass);
		 	((EObjectImpl)newCreated).eSetClass(opclass); //so it is really dynamic
			IDObject = Integer.toHexString(newCreated.hashCode());
			actLayer.put(IDObject, created);
			//set itsRmofClass
			execute.reflectivStateChart.objectManagement.set(newCreated, created, "itsRmofClass");
			//setID
			IDObject = Integer.toHexString(newCreated.hashCode());
		}
		
		return IDObject;
	}
	
	public String getID(String className, int layer) {
		EMap<String, EObject> actLayer = execute.reflectivStateChart.objectManagement.getObjectCache(layer+1);
		EClass eclass = (EClass) execute.reflectivStateChart.objectManagement.getEClassifier(className,layer+1);
		EObject created = eclass.getEPackage().getEFactoryInstance().create(eclass);
	 	((EObjectImpl)created).eSetClass(eclass); //so it is really dynamic
		String IDObject = Integer.toHexString(created.hashCode());
		
		//Connection ID(upperObject) -> Object
		actLayer.put(IDObject, created);
		
		
		
		
		
		return IDObject;
	}
}
