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

import java.util.Iterator;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;

import online.yamm.Common;
import online.yamm.EvalGuardOrEffect;
import online.yamm.coreModelXmi.yamm.YModel;
import online.yamm.coreModelXmi.yamm.YNamedElement;
import online.yamm.logger.YAMMLogger;


public class GetInstances {

	private static YAMMLogger logger = YAMMLogger.getYAMMLogger("YAMM Log");
	EvalGuardOrEffect execute;

	public GetInstances(EvalGuardOrEffect execute) {
		this.execute = execute;
	}

	public void saveModel(Integer layer, String filePrefix) {
		Iterator<?> objectList = execute.reflectivStateChart.objectManagement.getObjectCache(layer).listIterator();
		while(objectList.hasNext()) {
			Object object = ((Entry<?,?>) objectList.next()).getValue();
			//System.out.println(object);
			if (object instanceof YModel) {
				try {
					URI fileURI = URI.createFileURI(filePrefix);
					Resource resource = new XMLResourceFactoryImpl().createResource(fileURI);
					resource.getContents().add((EObject) object);
					resource.save(null);
					//break;
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else if (object instanceof YNamedElement) {
				//System.out.println("Name : " + ((rmof.NamedElement) object).getName());
			}
		}
	}

	public EList<Object> getInstances(Integer layer, String className, Object... args) {
		String shortClassName = className.contains(".") ? className.substring(className.lastIndexOf(".")+1) : className;	
		EList<Object> list = new BasicEList<Object>();
		Iterator<?> iterator = execute.reflectivStateChart.objectManagement.getEObjects(layer, shortClassName).iterator();
		//EStructuralFeature eStructuralFeatureToCompare;
		EObject objectToCompare;
		Object valueToCompare;
		boolean compare;

		for(;iterator.hasNext();) {
			objectToCompare = (EObject) iterator.next();
			//System.out.println(objectToCompare.eClass().getName() + " : " + className);
			if (objectToCompare.eClass().getName().equals(className)) {
				// check arguments
				if(args.length>0) {
					compare = true;
					for(int i=0;i+1<args.length && compare == true;i+=2) {
						valueToCompare = execute.reflectivStateChart.objectManagement.get(objectToCompare, (String) args[i]);
						if(valueToCompare == null || !valueToCompare.equals(Common.determineObjectOfString((String) args[i+1]))) {
							compare = false;
						}
					}
					if(compare) {
						list.add(objectToCompare);
					}
				} else {
					list.add(objectToCompare);
				}
			}

		}
		return list;
	}

	private EStructuralFeature getFeature(EClass eClass, String featureName) {
		EStructuralFeature feature = eClass.getEStructuralFeature(featureName);
		if(feature == null) {
			if(Character.isUpperCase(featureName.charAt(0))) {
				featureName = Character.toLowerCase(featureName.charAt(0))+featureName.substring(1);
			} else {
				featureName = Character.toUpperCase(featureName.charAt(0))+featureName.substring(1);
			}
			feature = eClass.getEStructuralFeature(featureName);
			if(feature == null) {
				logger.error("Could not find feature \"".concat(featureName).concat("\"."));
			}
		}
		return feature;
	}

}
