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
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;

import online.yamm.EvalGuardOrEffect;
import online.yamm.coreModelXmi.yamm.YModel;
import online.yamm.coreModelXmi.yamm.YNamedElement;
import online.yamm.logger.YAMMLogger;

public class GetInstancesOf {
	
	private static YAMMLogger logger = YAMMLogger.getYAMMLogger("YAMM Log");
	EvalGuardOrEffect execute;

	public GetInstancesOf(EvalGuardOrEffect execute) {
		this.execute = execute;
	}

	public void saveModel(Integer layer, String filePrefix) {
		EMap<?, ?> objectMap = execute.reflectivStateChart.objectManagement.getObjectCache(layer);	
		Iterator<?> objectList = objectMap.listIterator();
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
	
	public EList<Object> getInstancesOf(String className, String operandA, Object operandB, int layer, Object... args) {
		
		// String shortClassName = className.contains(".") ? className.substring(className.lastIndexOf(".")+1) : className;
		//saveModel(0, "c:/tmp/test.rmof");
		//Object second = operandB instanceof String ? execute.getValue.getValue(operandB.toString(), layer) : operandB;

		Object second = null;
		if (operandB instanceof String) {
			second = ((String) operandB).charAt(0) == '0' ? operandB.toString().substring(1, operandB.toString().length()) : execute.getValue.getValue(operandB.toString(), layer);
		} else {
			second = operandB;
		}
		
		Object[] moreValues = null;
		EList<Object> list = new BasicEList<Object>();

		if (args.length > 0) {
			if (args.length % 2 == 0) {
				moreValues = new Object[args.length / 2];
				int a = 0;
				for(int i = 0; i < args.length; i++) {
					if (i%2 != 0) {
						args[i] = args[i] instanceof String ? moreValues[a] = execute.getValue.getValue(args[i].toString(), layer) : args[i];
						a++;
					}
				}
			} else {
				logger.error("Wrong number of variables getInstancesOF");
				return list;
			}
		}

		Iterator<?> iterator = execute.reflectivStateChart.objectManagement.getEObjects(layer, className).iterator();
		// use object cache if possible
//		if(shortClassName.equals("Transition")) {
//			iterator = execute.reflectivStateChart.objectManagement.getTransitions(layer).iterator();
//		} else if (shortClassName.equals("Pseudostate")) {
//			iterator = execute.reflectivStateChart.objectManagement.getPseudoStates(layer).iterator();
//		} else if (shortClassName.equals("StateMachine")) {
//			iterator = execute.reflectivStateChart.objectManagement.getStateMachines(layer).iterator();
//		} else if (shortClassName.equals("StateMachineHandler")) {
//			iterator = execute.reflectivStateChart.objectManagement.getStateMachineHandlers(layer).iterator();
//		} else {
//			iterator = execute.maps[layer].values().iterator();
//		}

		EClass eClass = (EClass) execute.reflectivStateChart.objectManagement.getEClassifier(className, layer);

		if(eClass == null) {
			logger.error("Could not find class \"".concat(className).concat("\"."));
			return list;
		}

		EStructuralFeature featureToCompare = null;
		if(operandA != null) {
			featureToCompare = getFeature(eClass, operandA);
		}
		
		Object cmpObject;
		EStructuralFeature nextFeatureToCompare;
		for(;iterator.hasNext();) {
			EObject classInstance = (EObject) iterator.next();
			//			((EObjectImpl)classInstance).eSetClass(eClass); // initial loaded objects aren't dynamic
			// check additional constraints for the class instance e.g., getInstancesOf(x, a, 40) 
			if(eClass.isInstance(classInstance)) {
				if(operandA == null) {
					list.add(classInstance);
				} else {
					Object first = null;
					try {
						first = execute.reflectivStateChart.objectManagement.get(classInstance, featureToCompare.getName());
					} catch (Exception e) {
						featureToCompare = getFeature(classInstance.eClass(), operandA);
						first = execute.reflectivStateChart.objectManagement.get(classInstance, featureToCompare.getName());
					}
					if (first != null) {
						if (first.equals(second)) {
							if(args.length>0) {
								boolean compare = true;
								int a=0;
								for(int i=0;i<args.length && compare == true;i+=2) {
									nextFeatureToCompare = getFeature(eClass, (String) args[i]);
									cmpObject = execute.reflectivStateChart.objectManagement.get(classInstance, nextFeatureToCompare.getName());
									if(cmpObject != null) {
										if(cmpObject.equals(moreValues[a])) {

										} else {
											compare = false;
										}
									} else {
										compare = false;
									}
									a++;
								}
								if(compare) {
									list.add(classInstance);
								}
							} else {
								list.add(classInstance);
							}

						}
					}
				}
			}
		}
		//saveModel(0, "c:/tmp/test3.rmof");
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

//	public EList<Object> getInstancesOfAlt(String className, String operandA, Object operandB, int layer, Object... args) {
//		Vector<String> packageNames = new Vector<String>();
//		while(className.contains(".")) {
//			String packageName = className.substring(0, className.indexOf('.'));
//			className = className.substring(className.indexOf('.')+1);
//			packageNames.add(packageName);
//		}
//		String shortClassName = className;
//		String packageName = execute.reflectivStateChart.overAll.getPackageNames().get(layer);
//		className = packageName.concat(".").concat(className);
//
//		if(args.length>0 && (args.length %2) != 0) {
//			logger.error("Wrong number of variables getInstancesOF");
//		}
//
//		Object second = null;
//		if(operandB == null) {
//			second = null;
//		} else if(operandB.equals(true)) {
//			second = true;
//		} else if (operandB.equals(false)) {
//			second = false;
//		} else if (operandB instanceof String){
//			second = execute.getValue.getValue(operandB.toString(), layer);
//		} else {
//			second = operandB;
//		}
//
//		Object[] moreValues = null;
//		if(args.length>0) {
//			moreValues = new Object[args.length/2];
//			int a=0;
//			for(int i=0;i<args.length;i++) {
//				if(i%2 == 0) {
//					if(args[i] instanceof String && !Character.isUpperCase(((String)args[i]).charAt(0))) {
//						args[i] = Character.toUpperCase(((String)args[i]).charAt(0))+((String)args[i]).substring(1);
//					}
//				} else {
//					if(args[i] == null) {
//						moreValues[a] = null;
//					} else if(args[i].equals(true)) {
//						moreValues[a] = true;
//					} else if (args[i].equals(false)) {
//						moreValues[a] = false;
//					} else if (args[i] instanceof String){
//						moreValues[a] = execute.getValue.getValue(args[i].toString(), layer);
//					} else {
//						moreValues[a] = args[i];
//					}
//					a++;
//				}
//			}
//		}
//
//		Boolean noCondition = (operandA == null) ? true : false;
//		EList<Object> list = new BasicEList<Object>();
//		Iterator<?> iterator = null;
//		if(shortClassName.equals("Transition")) {
//			iterator = execute.reflectivStateChart.overAll.getTransitions(layer).iterator();
//		} else if (shortClassName.equals("Pseudostate")) {
//			iterator = execute.reflectivStateChart.overAll.getPseudoStates(layer).iterator();
//		} else if (shortClassName.equals("StateMachine")) {
//			iterator = execute.reflectivStateChart.overAll.getStateMachines(layer).iterator();
//		} else if (shortClassName.equals("StateMachineHandler")) {
//			iterator = execute.reflectivStateChart.overAll.getStateMachineHandlers(layer).iterator();
//		} else {
//			iterator = execute.maps[layer].values().iterator();
//		}
//
//		if(!noCondition && !(operandA.equals("")) && !Character.isUpperCase(operandA.charAt(0))) {
//			operandA = Character.toUpperCase(operandA.charAt(0))+operandA.substring(1);
//		}
//
//		// applies only for generated classes
//		Class<?> cmpClass = null;
//		try {
//			cmpClass = Class.forName ( className );
//		} catch (ClassNotFoundException e) {
//		}
//
//		rmof.Class rmofClass = null;
//		if (cmpClass == null) {
//			for (rmof.Class rmofClassCompare : execute.reflectivStateChart.overAll.getClasses(layer-1)) {
//				if (rmofClassCompare.getName().equals(shortClassName)) {
//					if(packageNames.size()>0) {
//						if(rmofClassCompare.getParentElement() instanceof rmof.Package) {
//							rmof.Package actPackage = rmofClassCompare.getParentElement();
//							for(int i = packageNames.size()-1; i >= 0; i--) {
//								String curPackageName = packageNames.get(i);
//								if(actPackage.getName().equals(curPackageName)) {
//									if(i == 0) {
//										rmofClass = rmofClassCompare;
//										break;
//									}
//								} else {
//									break;
//								}
//							}
//						}
//					} else {
//						rmofClass = rmofClassCompare;
//						//System.out.println(rmofClass);
//						break;
//					}
//				}
//			}
//		}
//
//		for(;iterator.hasNext();) {
//			Object classInstance = iterator.next();
//			if (cmpClass == null && rmofClass == null) {
//				logger.error("Could not find class \"".concat(className).concat("\"."));
//				return list;
//			}
//
//
//			// check additional constraints for the class instance e.g., getInstancesOf(x, a, 40) 
//			if((cmpClass != null && cmpClass.isInstance(classInstance)) || (rmofClass != null && classInstance instanceof EObject && ((EObject) classInstance).eClass().getName().equals(rmofClass.getName()))) {
//				if(noCondition) {
//					list.add(classInstance);
//				} else {
//					Method getMethod_operandA;
//
//					try {
//						if (second instanceof Boolean) {
//							getMethod_operandA = classInstance.getClass().getMethod("is"+operandA, new Class<?>[] {});
//						} else {
//							getMethod_operandA = classInstance.getClass().getMethod("get"+operandA, new Class<?>[] {});
//						}				
//						//						System.out.println(operandA);
//						//						if(operandA.equals("IsSuspended")) {
//						//							System.out.println("blub");
//						//							System.out.println(classInstance);
//						//							EObject test = (EObject) classInstance;
//						//							System.out.println(test.eClass().getEStructuralFeatures());
//						//							EClass eClass = test.eClass();
//						//							System.out.println(eClass.getEStructuralFeature("isSuspended"));
//						//							test.eGet(eClass.getEStructuralFeature("IsSuspended"));
//						//						}
//						Object first = getMethod_operandA.invoke(classInstance, new Object[] {});
//
//						if (first != null) {
//							if (first.equals(second)) {
//								if(args.length>0) {
//									boolean compare = true;
//									int a=0;
//									for(int i=0;i<args.length && compare == true;i+=2) {
//										if (moreValues[a] instanceof Boolean) {
//											getMethod_operandA = classInstance.getClass().getMethod("is"+args[i], new Class<?>[] {});
//										} else {
//											getMethod_operandA = classInstance.getClass().getMethod("get"+args[i], new Class<?>[] {});
//										}				
//										Object cmpObject = getMethod_operandA.invoke(classInstance, new Object[] {});
//										if(cmpObject != null) {
//											if(cmpObject.equals(moreValues[a])) {
//
//											} else {
//												compare = false;
//											}
//										} else {
//											compare = false;
//										}
//										a++;
//									}
//									if(compare) {
//										list.add(classInstance);
//									}
//								} else {
//									list.add(classInstance);
//								}
//
//							}
//						}
//					} catch (SecurityException e) {
//						e.printStackTrace();
//					} catch (NoSuchMethodException e) {
//						e.printStackTrace();
//					} catch (IllegalArgumentException e) {
//						e.printStackTrace();
//					} catch (IllegalAccessException e) {
//						e.printStackTrace();
//					} catch (InvocationTargetException e) {
//						e.printStackTrace();
//					}
//				}
//			}
//		}
//		return list;
//	}

	public EList<Object> getInstancesOfLayer(Integer layer, String className, String operandA, Object operandB, Object... args) {
		return getInstancesOf(className, operandA, operandB, layer, args);
	}
}
