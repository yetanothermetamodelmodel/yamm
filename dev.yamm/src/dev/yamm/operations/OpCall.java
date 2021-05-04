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

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.EEnumLiteralImpl;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;

import dev.yamm.ChartManagement;
import dev.yamm.EEnumLiteralAdapter;
import dev.yamm.EvalGuardOrEffect;
import dev.yamm.ObjectManagement;
import dev.yamm.Phase;
import dev.yamm.coloring.ObjectsToColor;
import dev.yamm.coreModelXmi.yamm.YClass;
import dev.yamm.coreModelXmi.yamm.YGlobalStateMachine;
import dev.yamm.coreModelXmi.yamm.YOperation;
import dev.yamm.coreModelXmi.yamm.YParameter;
import dev.yamm.coreModelXmi.yamm.YParameterDirectionKind;
import dev.yamm.coreModelXmi.yamm.YStateMachineHandler;
import dev.yamm.coreModelXmi.yamm.YType;
import dev.yamm.gui.LayerView;
import dev.yamm.logger.YAMMLogger;

public class OpCall {

	private static YAMMLogger logger = YAMMLogger.getYAMMLogger("YAMM Log");
	EvalGuardOrEffect execute;

	public OpCall(EvalGuardOrEffect execute) {
		this.execute = execute;
	}

	// TODO: anpassen wie activateOperation...

	public Object activateStaticOperation(String className, String operationName, int layer, Object... args) {
		EMap<String, EObject> statics = execute.reflectivStateChart.objectManagement.getStatics(layer);

//		if(statics.containsKey(className)) {
//			return activateOperation(statics.get(className), operationName, layer, null, args);
//		} else {
//			EClass eClass =  (EClass) execute.reflectivStateChart.objectManagement.getEClassifier(className, layer);
//			EObject eObject = eClass.getEPackage().getEFactoryInstance().create(eClass);
//			statics.put(className, eObject);
//			return activateOperation(eObject, operationName, layer, null, args);
//		}
		return null;
	}

	/**
	 * Called form within the generaed code of an effect to activate an operation.
	 * Gets the correct YOperation and instantiates a new stackframe representation 
	 * (StateMachineHandler and Operation-Object).
	 * 
	 * 
	 * @param instanceObject                    the object containing the operation
	 *                                          to invoke
	 * @param typeForMultiInheritance           qualified name of the class for multiple inheritance
	 * @param operationName                     the name of the operation
	 * @param layer                             = 1
	 * @param inAdapterList						the adapter for inout parameter
	 * @param notUsed not used
	 * @param returnVarName                     name of the feature/property to set
	 *                                          the return value (xy = opA())
	 * @param args                              the actual parameter
	 * @return always null
	 */
	public Object activateOperation(Object instanceObject, final String typeForMultiInheritance, String operationName,
			int layer, EList<InoutAdapter> inAdapterList, EList notUsed, String returnVarName,
			Object... args) {

		boolean constCall = false;
		EObject classInstance = null;
		String qualifiedNameClass = null;
		if (instanceObject instanceof EObject) {
			classInstance = (EObject) instanceObject;
			qualifiedNameClass = getQualifiedName(classInstance);
		} 
		else if (instanceObject instanceof String)
		{
			qualifiedNameClass = (String) instanceObject;
			constCall = true;
		}
		else {
			logger.error(
					"Operationsaufruf fehlgeschlagen. Instanzobjekt(" + instanceObject + ") nicht vom Typ EObject");
			return null;
		}

		EObject actOp = findOperationMultiInheritance(execute.reflectivStateChart, qualifiedNameClass,
				operationName, typeForMultiInheritance, layer, args);
		
		if (args == null) {
			args = new Object[1];
		}

		if (actOp == null) {
			System.err.println("operation konnte nicht gefunden werden");
			return null;
		}
		boolean hasReturn = false;
		EList<EObject> ownedParameters = ((EList<EObject>) execute.reflectivStateChart.objectManagement.get(actOp,
				"ownedParameter"));

		YGlobalStateMachine gsm = findGlobalStateMachine(layer - 1);
		EObject curSMH = null;
		if (execute.reflectivStateChart.zerochart.phase == Phase.desInit || execute.reflectivStateChart.zerochart.phase == Phase.des)
		{	
				curSMH = execute.reflectivStateChart.zerochart.activeStateMachineHandler;
		}
		else
		{
			EList<EObject> smhs = (EList<EObject>) execute.reflectivStateChart.objectManagement.get(gsm,
					"stateMachineHandlers");
			int smhc = (Integer) execute.reflectivStateChart.objectManagement.get(gsm, "stateMachineHandlerCount");
			try {
				curSMH = (EObject) smhs.get(smhc);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		

		// initialize new SMH
		// curSMH.setIsSuspended(true); -- !Wird so nicht global auf true gesetzt! -
		// dynamische Objekte
		set(curSMH, "isSuspended", true);

		// creates a new SMH
		YStateMachineHandler operationSMH = (YStateMachineHandler) execute.createInstance
				.createInstance("YStateMachineHandler", layer - 1);
		operationSMH.setObjectsToColor(new ObjectsToColor());

		if (execute.reflectivStateChart.objectManagement.get(actOp, "name")
				.equals(execute.reflectivStateChart.objectManagement.get(actOp.eContainer(), "name")))
		{
			EObject yclass = (EObject) actOp.eContainer();
			operationSMH.setReturnVar(classInstance = execute.createInstance.createInstance(getQualifiedNameYClass(yclass) , layer));
		}
		
		// init return var Name(can be null):
		operationSMH.setNameOfRetunVar(returnVarName);
		set(operationSMH, "calledFrom", curSMH);

		String newClassID = null;
		// find the meta-data for the operation-object
		String classObjectID = (String) execute.reflectivStateChart.objectManagement.get(actOp, "clazz", "name")
				+ (String) execute.reflectivStateChart.objectManagement.get(actOp, "name")
				+ (String) execute.reflectivStateChart.objectManagement.get(actOp, "ObjectID");

		if (classInstance != null) {
			// creates the new opeeration-object and adds it to execute.maps[layer]
			newClassID = execute.getID.getID(classObjectID, layer - 1);
		} else {
			// creates the new opeeration-object and adds it to execute.maps[layer]
			newClassID = execute.getID.getID(execute.reflectivStateChart.objectManagement.get(actOp, "clazz"),
					layer - 1);
		}

		EObject opClass = (EObject) execute.maps[layer].get(newClassID);

		// connects the operation-objects and the object containing the operation
		if (classInstance != null) {
			set(opClass, "itsRmofClass", classInstance);
		}

		// connects the SMH and the operation-object
		set(operationSMH, "itsClassID", newClassID);

		// connects the SMH and the statemachine model
		set(operationSMH, "stateMachine", execute.reflectivStateChart.objectManagement.get(actOp, "stateMachine"));

		if (execute.reflectivStateChart.zerochart.phase == Phase.desInit || execute.reflectivStateChart.zerochart.phase == Phase.des)
		{
			execute.reflectivStateChart.zerochart.opCallStateMachineHandler = operationSMH;
		}
//		gsm.getStateMachineHandlers().add(operationSMH);

		int argsCounter = 0;
		for (int i = 0; i < ownedParameters.size(); i++) {
			EObject parameter = ownedParameters.get(i);
			Object paramObject = args[argsCounter];
			if (paramObject instanceof EEnumLiteralAdapter) {
				paramObject = ((EEnumLiteralAdapter) paramObject).getName();
				
			}
			if (execute.reflectivStateChart.objectManagement.get(parameter, "direction")
					.equals(YParameterDirectionKind.IN_DEEP)) {
				if (args[argsCounter] instanceof EObject || args[argsCounter] instanceof EList) {
					set(opClass, (String) execute.reflectivStateChart.objectManagement.get(parameter, "name"),
							DeepCopy.deepCopy(paramObject, layer));
				} else {
					// TODO: deepcopy of none EObjects
					set(opClass, (String) execute.reflectivStateChart.objectManagement.get(parameter, "name"),
							paramObject);
				}
			} else { // inout or in
				if (args[argsCounter] instanceof EObject) {
					set(opClass, (String) execute.reflectivStateChart.objectManagement.get(parameter, "name"),
							paramObject);
				} else {
					set(opClass, (String) execute.reflectivStateChart.objectManagement.get(parameter, "name"),
							paramObject);
				}
			}
			argsCounter++;
		}		

		// initializes inoutAdapter
		bindInOutParameter(opClass, layer, inAdapterList, operationSMH, curSMH, ownedParameters, newClassID, args);

		// just for state OperationIdentified in zerochart?
		execute.reflectivStateChart.objectManagement.set(curSMH, opClass, "operationInstance");
		
		return null;

	}

	/**
	 * the second part of the initialisation of InoutAdapter. The first 
	 * is done in the generated code before calling ativateOperation.
	 * 
	 * @param operationObject the new operation-object
	 * @param layer	= 1
	 * @param inoutAdapters the InoutAdapter
	 * @param operationSMH	the new SMH
	 * @param curSMH the SMH of the calling operation
	 * @param parameters the YParameter of the operation
	 * @param newClassID the ID of the object containing the operation
	 * @param args the actual parameters
	 */
	private void bindInOutParameter(EObject operationObject, int layer, EList<InoutAdapter> inoutAdapters,
			YStateMachineHandler operationSMH, EObject curSMH, EList<EObject> parameters,
			String newClassID, Object... args) {
		ObjectManagement om = execute.reflectivStateChart.objectManagement;
		if (inoutAdapters != null && !inoutAdapters.isEmpty()) {

			Map<String, ObjectToBind> inoutParamToPropertyToBindWith = new HashMap<String, ObjectToBind>();

			Iterator<EObject> rParamIter = parameters.iterator();
			for (InoutAdapter adapter : inoutAdapters) {

				adapter.setOm(om);

				// n�chster inout-Parameter
				EObject rParam = rParamIter.next();
				while (!om.get(rParam, "direction").equals(YParameterDirectionKind.INOUT))
					rParam = rParamIter.next();

				adapter.setStackFrame(operationObject);
				adapter.setParameterName((String) om.get(rParam, "name"));

				if (adapter.getParamNameForInit() != null) { // (inout parameter wieder als inout-parameter �bergeben)

					Object objsToBindWith = om.get(curSMH, "objectsBindedWithInoutParameters");
					if (objsToBindWith == null) {
						continue;
					}
					ObjectToBind objToBindWith = ((Map<String, ObjectToBind>) objsToBindWith)
							.get(adapter.getParamNameForInit());

					adapter.setObjWithProperty(objToBindWith.containingClass);
					adapter.setPropertyName(objToBindWith.featureName);
				}

				// f�r den n�chsten opCall ben�tigt, falls inoutP. wieder als inoutP. �bergeben
				// wird
				ObjectToBind propertyWithContainigObjectToBindParameterWith = new ObjectToBind();
				propertyWithContainigObjectToBindParameterWith.containingClass = adapter.getObjWithProperty();
				propertyWithContainigObjectToBindParameterWith.featureName = adapter.getPropertyName();
				inoutParamToPropertyToBindWith.put(adapter.getParameterName(),
						propertyWithContainigObjectToBindParameterWith);
				om.set(operationSMH, inoutParamToPropertyToBindWith, "objectsBindedWithInoutParameters");

				// Adapter registrieren
				adapter.getObjWithProperty().eAdapters().add(adapter);
				adapter.getStackFrame().eAdapters().add(adapter);

				// im zerochart erwendet um die Adapter wieder zu deregistieren
				operationSMH.getInAdapters().add(adapter);

			}
		}

	}

	/**
	 * Used for the Benchmark model
	 * 
	 * @param layer = 0
	 * @return the GSM
	 */
	private YGlobalStateMachine findGlobalStateMachine(int layer) {

		if (layer == 0)
			return execute.reflectivStateChart.zerochart.globalStateMachine;

		Iterator<Entry<String, EObject>> it = execute.maps[layer].iterator();
		while (it.hasNext()) {
			Entry<String, EObject> actObj = it.next();
			if (actObj.getValue() instanceof YGlobalStateMachine) {
				return (YGlobalStateMachine) actObj.getValue();
			}
		}
		return null;
	}

	/**
	 * Finds the operation. Gets all possible YOperations in the inheritance hierarchy and returns the best match.
	 * 
	 * 
	 * @param reflectiveStateChart    connection to the central
	 *                                ObjectMangament
	 * @param classInstance			  the object containing the operation
	 * @param operationName           the name of the operation
	 * @param typeForMultiInheritance the name of the class containing the operation
	 *                                (optional)
	 * @param layer                   = 1
	 * @param args                    the actual parameter
	 * @return
	 */
	private EObject findOperationMultiInheritance(ChartManagement reflectiveStateChart,
			String qualifiedName , String operationName, String typeForMultiInheritance, int layer, Object[] args) {

		int paramNumber = args == null ? 1 : args.length; // args == null --> one param, null Literal: op(null)
		final Object[] actualParams = new Object[paramNumber];
		if (args != null)
			for (int i = 0; i < args.length; i++)
				actualParams[i] = args[i]; // params = []-> no parameter..., params = [null]--> null literal, ...

		YClass yammClassInstance = null;
		String nameClassWithOp = qualifiedName;
		for (EObject clazz : reflectiveStateChart.objectManagement.getEObjects(layer - 1, "YClass")) {
			if (nameClassWithOp.equals(getQualifiedNameOfClassYammModel(reflectiveStateChart, clazz)))
				yammClassInstance = (YClass) clazz;

		}

		EList<PotentialOperation> operations = findPotientialOperations(yammClassInstance, operationName, paramNumber,
				actualParams);

		boolean containsNull = false;
		for (Object actualParam : actualParams) {
			if (actualParam == null)
				containsNull = true;
		}

		operations.sort(new Comparator<PotentialOperation>() {
			@Override
			public int compare(PotentialOperation o1, PotentialOperation o2) {
				int ret;
				if (o1.inheritanceLevel < o2.inheritanceLevel)
					ret = -1;
				if (o1.inheritanceLevel > o2.inheritanceLevel)
					ret = 1;
				else
					ret = 0;

				for (int i = 0; i < actualParams.length; i++) {
					Object actualParam = actualParams[i];
					YType yammParamO1Type = o1.operation.getOwnedParameter().get(i).getType();
					YType yammParamO2Type = o2.operation.getOwnedParameter().get(i).getType();
					YType yammParamO1TypeClass = (YType) yammParamO1Type;
					YType yammParamO2TypeClass = (YType) yammParamO2Type;
					if (actualParam == null) {
						if (o1.operation.getOwnedParameter().get(i).getUpper() == -1) {
							if (o2.operation.getOwnedParameter().get(i).getUpper() != -1) {
								return 0;
							}
						} else {
							if (aInheritsFromB(yammParamO1TypeClass, yammParamO2TypeClass)) {
								return -1;
							} else if (aInheritsFromB(yammParamO2TypeClass, yammParamO1TypeClass)) {
								return 1;
							}
						}
					} else {
						if (aInheritsFromB(yammParamO1TypeClass, yammParamO2TypeClass)) {
							return -1;
						} else if (aInheritsFromB(yammParamO2TypeClass, yammParamO1TypeClass)) {
							return 1;
						}
					}
				}

				return ret;
			}

		});

		if (operations.isEmpty())
			return null;

		if (typeForMultiInheritance == null)
			return operations.get(0).operation;

		YOperation operationToUse = null;
		for (PotentialOperation pOp : operations) {
			if (typeForMultiInheritance.equals(getQualifiedNameOfClassYammModel(reflectiveStateChart, pOp.clazz))) {
				operationToUse = pOp.operation;
				break;
			}
		}

		return operationToUse;
	}

	class PotentialOperation {
		public YOperation operation;
		public int inheritanceLevel;
		public YClass clazz;

		public PotentialOperation(YOperation operation, int inheritanceLevel, YClass clazz) {
			this.operation = operation;
			this.inheritanceLevel = inheritanceLevel;
			this.clazz = clazz;
		}

		@Override
		public String toString() {
			return inheritanceLevel + " " + clazz.getName() + " " + operation.getName();
		}

	}

	private EList<PotentialOperation> findPotientialOperations(YClass yammClassInstance, String operationName,
			int paramNumber, Object[] params) {

		EList<PotentialOperation> operations = new BasicEList<OpCall.PotentialOperation>();
		findPotientialOperationsRecursive(yammClassInstance, operationName, paramNumber, operations, 0, params);
		return operations;

	}

	private void findPotientialOperationsRecursive(YClass yammClassInstance, String operationName, int paramNumber,
			EList<PotentialOperation> operations, int inheritanceLevel, Object[] params) {

		for (YOperation operation : yammClassInstance.getOwnedOperation()) {
			if (operation.getName().equals(operationName) && operation.getOwnedParameter().size() == paramNumber) {
				boolean paramsTypeMatch = true;

				for (int i = 0; i < operation.getOwnedParameter().size(); i++) {
					YParameter yammParam = operation.getOwnedParameter().get(i);
					Object actualParam = params[i];

					if (actualParam == null) {
						if (isPrimitiveParamNotString(yammParam.getType().getName())) {
							paramsTypeMatch = false;
							break;
						} else
							continue; // --> match
					}

					if ("Object".equals(yammParam.getType().getName()))
						continue; // --> match

					if (actualParam instanceof EcoreEList) {
						if (-1 == yammParam.getUpper()) {
							EClassifier classifier = ((EcoreEList) actualParam).getEStructuralFeature().getEType();
							if (classifier instanceof EDataType) {
								String rParamType = yammParam.getType().getName();
								String actualParamType = classifier.getName();
								if ("Integer".equals(rParamType)) {
									if (!"EInt".equals(actualParamType))
										paramsTypeMatch = false;
								} else if ("Double".equals(rParamType)) {
									if (!"EDouble".equals(actualParamType))
										paramsTypeMatch = false;
								} else if ("Float".equals(rParamType)) {
									if (!"EFloat".equals(actualParamType))
										paramsTypeMatch = false;
								} else if ("Boolean".equals(rParamType)) {
									if (!"EBoolean".equals(actualParamType))
										paramsTypeMatch = false;
								} else if ("String".equals(rParamType)) {
									if (!"EString".equals(actualParamType))
										paramsTypeMatch = false;
								} else {
									paramsTypeMatch = false;
								}
							} else {
								EClass eClassActualParamter = (EClass) classifier;
								String yammParamTypeName = yammParam.getType().getName();

								if (!aIsB(eClassActualParamter, (YType) yammParam.getType())) {
									paramsTypeMatch = false;
								}
							}
						}
					} else if (actualParam instanceof EObject) { // --> no primitve (internal yammClass)
						if (actualParam instanceof EEnumLiteralAdapter)
						{
							String qualifiedNameActualParam = getQualifiedNameEClass((EClassifier) ((EObject) actualParam).eContainer());
							String qualifiedNameParam = getQualifiedNameOfClassYammModel(execute.reflectivStateChart, (YType) yammParam.getType());
							if (!qualifiedNameActualParam.equals(qualifiedNameParam))
								paramsTypeMatch = false;
						}
						else if (!aIsB(((EObject) actualParam).eClass(), (YType) yammParam.getType())) {
							paramsTypeMatch = false;
						}
					} else if (actualParam instanceof String) {
						if (!"String".equals(yammParam.getType().getName()))
							paramsTypeMatch = false;
					} else if (actualParam instanceof Boolean) {
						if (!"Boolean".equals(yammParam.getType().getName()))
							paramsTypeMatch = false;
					} else if (actualParam instanceof Number) { // other Wrapper
						// Integer -> Long/Integer/Double/Float
						if (actualParam instanceof Integer && !("Integer".equals(yammParam.getType().getName())
								|| "Double".equals(yammParam.getType().getName())
								|| "Float".equals(yammParam.getType().getName())
								|| "Long".equals(yammParam.getType().getName())))
							paramsTypeMatch = false;
						// Double -> Double
						else if (actualParam instanceof Double && !"Double".equals(yammParam.getType().getName()))
							paramsTypeMatch = false;
						// Long -> Long
						else if (actualParam instanceof Long && !"Long".equals(yammParam.getType().getName()))
							paramsTypeMatch = false;
						// Float -> Float/Double
						else if (actualParam instanceof Float && !("Float".equals(yammParam.getType().getName())
								|| "Double".equals(yammParam.getType().getName())))
							paramsTypeMatch = false;
					} else { // actualParam is extObject
						paramsTypeMatch = false;
					}

				}
				if (paramsTypeMatch)
					operations.add(new PotentialOperation(operation, inheritanceLevel, yammClassInstance));

			}

		}

		// search in superclass:
		for (YClass superClass : yammClassInstance.getSuperClass())
			findPotientialOperationsRecursive(superClass, operationName, paramNumber, operations, inheritanceLevel + 1,
					params);
	}

	/**
	 * is "actualParam" of type "type"?
	 * 
	 * @param actualParam object in runtime model
	 * @param type object in yamm model
	 * @return
	 */
	private boolean aIsB(EClass actualParam, YType type) {
		String qualifiedNameActualParam = getQualifiedNameEClass(actualParam);
		String qualifiedNameParam = getQualifiedNameOfClassYammModel(execute.reflectivStateChart, type);
		if (qualifiedNameActualParam.equals(qualifiedNameParam))
			return true;
		else {
			boolean supertypematch = false;
			for (EClass superType : actualParam.getESuperTypes()) {
				if (aIsB(superType, type)) {
					supertypematch = true;
					break;
				}
			}
			return supertypematch;
		}

	}

	/**
	 * is a of type b?
	 * 
	 * @param a yamm object
	 * @param b yamm object
	 * @return
	 */
	private boolean aInheritsFromB(YType a, YType b) {
		if (a instanceof YClass)
		{
			YClass _a = (YClass) a;
			if (_a.getSuperClass().contains(b))
				return true;
			else {
				for (YClass superType : _a.getSuperClass()) {
					if (aInheritsFromB(superType, b)) {
						return true;
					}
				}
				return false;
			}
		}
		return false;
	}

	private boolean isPrimitiveParamNotString(String typeName) {
		if ("Double".equals(typeName))
			return true;
		else if ("Float".equals(typeName))
			return true;
		else if ("Long".equals(typeName))
			return true;
		else if ("Integer".equals(typeName))
			return true;
		else if ("Boolean".equals(typeName))
			return true;
		return false;
	}

	private static String getQualifiedNameOfClassYammModel(ChartManagement reflectiveStateChart, EObject object) {
		ObjectManagement om = reflectiveStateChart.objectManagement;

		String qualifiedName = (String) om.get(object, "name");
		EObject pack = null;

		while ((pack = (EObject) om.get(object, "package")) != null) {
			qualifiedName = om.get(pack, "name") + "." + qualifiedName;
			object = pack;
		}
		return qualifiedName;
	}


	@SuppressWarnings("unchecked")
	private void set(Object obj, String name, Object value) {
		EClass eClass = ((EObject) obj).eClass();
		Object oldValue = execute.reflectivStateChart.objectManagement.get((EObject) obj, name);
		if (oldValue instanceof EList) {
			if (value == null) {
				return;
			}
			if (value instanceof EList) {
				EList values = (EList) value;
				EList oldValues = (EList) oldValue;
				oldValues.addAll(values);
				return;
			}
		}
		try {
			execute.reflectivStateChart.objectManagement.set((EObject) obj, value, name);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("(opCall)Type Error. Tried to set feature \"" + name + "\" of class \"" + eClass.getName()
					+ "\" on value \"" + value + "\".");
		}
	}

	private Object get(EObject obj, String name) {
		return execute.reflectivStateChart.objectManagement.get(obj, name);
	}

	private static String getQualifiedName(EObject object) {
		String qualifiedName = object.eClass().getName();
		EPackage pack = object.eClass().getEPackage();

		while (pack.getESuperPackage() != null) {
			qualifiedName = pack.getName() + "." + qualifiedName;
			pack = pack.getESuperPackage();
		}
		return qualifiedName;
	}

	private static String getQualifiedNameEClass(EClassifier eClass) {
		String qualifiedName = eClass.getName();
		EPackage pack = eClass.getEPackage();

		while (pack.getESuperPackage() != null) {
			qualifiedName = pack.getName() + "." + qualifiedName;
			pack = pack.getESuperPackage();
		}
		return qualifiedName;
	}
	
	private String getQualifiedNameYClass(EObject yClass)
	{
		ObjectManagement om = execute.reflectivStateChart.objectManagement;
		String qualifiedName = (String) om.get(yClass, "name");
		EObject pack = (EObject) om.get(yClass, "package");
		
		while (pack != null)
		{
			qualifiedName = om.get(pack, "name") + "." + qualifiedName;
			pack = (EObject) om.get(pack, "package");
		}
		return qualifiedName;
	}
}

class ObjectToBind {
	public String featureName;
	public EObject containingClass;
}

/** 
 * Creates a deep copy of an EObject. Clones also cross references.
 */
class DeepCopy {
	private static CreateInstance createOperation;

	private static Map<Object, Object> originalToClonedObjects = new HashMap<Object, Object>();

	private static Map<Object, Object> clonedToOriginalobjects = new HashMap<Object, Object>();

	private static Map<Object, Object> clonedObjectsWithContainerToOriginalContainer = new HashMap<Object, Object>();

	/**
	 * Creates a deep copy of an EObject. Clones also cross references.
	 * 
	 * @param objectToCopy the obejct to clone
	 * @param layer = 1
	 * @return deep copy of objectToCopy
	 */
	public static Object deepCopy(Object objectToCopy, int layer) {
		originalToClonedObjects.clear();
		clonedObjectsWithContainerToOriginalContainer.clear();
		clonedToOriginalobjects.clear();
		createOperation = LayerView.yamm.reflectivStateChart.execute.createInstance;
		Object copy = copy(objectToCopy, layer);
		resolveContainment();
		return copy;
	}

	private static void resolveContainment() {
		for (Entry clonedobjToOriginalContainer : clonedObjectsWithContainerToOriginalContainer.entrySet()) {
			if (originalToClonedObjects.containsKey(clonedobjToOriginalContainer.getValue())) {
				EObject originalObject = (EObject) clonedToOriginalobjects.get(clonedobjToOriginalContainer.getKey());
				EObject clonedContainer = (EObject) originalToClonedObjects
						.get(clonedobjToOriginalContainer.getValue());
				EObject clonedContainedObj = (EObject) clonedobjToOriginalContainer.getKey();
				EStructuralFeature containingFeature = originalObject.eContainingFeature();
				clonedContainer.eSet(containingFeature, clonedContainedObj);
			} else {
				// no container references to objects that are not cloned
			}
		}

	}

	private static Object copy(Object objectToCopy, int layer) {

		Object copy = null;
		if (objectToCopy instanceof EObject) {
			if (originalToClonedObjects.containsKey(objectToCopy)) {
				copy = originalToClonedObjects.get(objectToCopy);
				return copy;
			} else {
				copy = createOperation.createInstance(getQualifiedName((EObject) objectToCopy), layer);
				originalToClonedObjects.put(objectToCopy, copy);
				clonedToOriginalobjects.put(copy, objectToCopy);
				for (EStructuralFeature feature : ((EObject) copy).eClass().getEAllStructuralFeatures()) {
					if (feature instanceof EAttribute) {
						((EObject) copy).eSet(feature, ((EObject) objectToCopy).eGet(feature));
					} else if (feature.getName().equals("this")) {
						((EObject) copy).eSet(feature, copy);
					} else if (feature.getName().equals("container")) {
						if (((EObject) objectToCopy).eContainer() != null)
							clonedObjectsWithContainerToOriginalContainer.put(copy,
									((EObject) objectToCopy).eContainer());
					} else {
						((EObject) copy).eSet(feature, copy(((EObject) objectToCopy).eGet(feature), layer));
					}
				}
				return copy;
			}
		} else if (objectToCopy instanceof EList) {
			EList listToCopy = (EList) objectToCopy;
			copy = new BasicEList<Object>();
			for (Object listElementToCopy : listToCopy) {
				((EList<Object>) copy).add(copy(listElementToCopy, layer));
			}
			return copy;
		} else // primitive type or Object(no copy TODO: (deep)copy also none EObjects)...
		{
			return objectToCopy;
		}

	}

	private static String getQualifiedName(EObject object) {
		String qualifiedName = object.eClass().getName();
		EPackage pack = object.eClass().getEPackage();

		while (pack.getESuperPackage() != null) {
			qualifiedName = pack.getName() + "." + qualifiedName;
			pack = pack.getESuperPackage();
		}
		return qualifiedName;
	}
}
