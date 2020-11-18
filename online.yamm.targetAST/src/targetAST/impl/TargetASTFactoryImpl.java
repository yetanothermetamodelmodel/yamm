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
package targetAST.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import targetAST.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TargetASTFactoryImpl extends EFactoryImpl implements TargetASTFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TargetASTFactory init() {
		try {
			TargetASTFactory theTargetASTFactory = (TargetASTFactory)EPackage.Registry.INSTANCE.getEFactory(TargetASTPackage.eNS_URI);
			if (theTargetASTFactory != null) {
				return theTargetASTFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TargetASTFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetASTFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TargetASTPackage.TARGET_AST_ROOT: return createTargetASTRoot();
			case TargetASTPackage.TBINARY_EXP: return createT_BinaryExp();
			case TargetASTPackage.TGET: return createT_Get();
			case TargetASTPackage.TSET: return createT_Set();
			case TargetASTPackage.TEXT_CALL: return createT_ExtCall();
			case TargetASTPackage.TLITERAL: return createT_Literal();
			case TargetASTPackage.TINSTANCE_OF_EXP: return createT_InstanceOfExp();
			case TargetASTPackage.TUNARY_EXP: return createT_UnaryExp();
			case TargetASTPackage.TCREATE_INSTANCE_EXP: return createT_CreateInstanceExp();
			case TargetASTPackage.TPRINT_EXP: return createT_PrintExp();
			case TargetASTPackage.TGET_INSTANCES_OF_EXP: return createT_GetInstancesOfExp();
			case TargetASTPackage.TSET_RETURN: return createT_SetReturn();
			case TargetASTPackage.TEXT_CONSTRUCTOR: return createT_ExtConstructor();
			case TargetASTPackage.TEXT_TYPE: return createT_ExtType();
			case TargetASTPackage.TEXT_ATTR_CALL: return createT_ExtAttrCall();
			case TargetASTPackage.TOP_CALL: return createT_OpCall();
			case TargetASTPackage.TCOLOR_DFA: return createT_ColorDFA();
			case TargetASTPackage.TGET_INSTANCES: return createT_GetInstances();
			case TargetASTPackage.TCOUNT_FINAL_STATES: return createT_CountFinalStates();
			case TargetASTPackage.TCOUNT_INITIAL_STATES: return createT_CountInitialStates();
			case TargetASTPackage.TCOUNT_STATES: return createT_CountStates();
			case TargetASTPackage.TSET_ABSOLUTE_NODE_PROPABILITY: return createT_SetAbsoluteNodePropability();
			case TargetASTPackage.TCOUNT_REACHABLE_STATES: return createT_CountReachableStates();
			case TargetASTPackage.TCOUNT_IN_VALID_TRANSITIONS: return createT_CountInValidTransitions();
			case TargetASTPackage.TSET_POPULATION_SIZE: return createT_SetPopulationSize();
			case TargetASTPackage.TGET_LAYER_INFORMATION: return createT_GetLayerInformation();
			case TargetASTPackage.TGET_OBJECT_MANAGEMENT: return createT_GetObjectManagement();
			case TargetASTPackage.TLOAD_MODEL: return createT_LoadModel();
			case TargetASTPackage.TGET_ENUM_LITERAL: return createT_GetEnumLiteral();
			case TargetASTPackage.TDES_EVENT_QUEUE_PEEK: return createT_DesEventQueuePeek();
			case TargetASTPackage.TDES_EVENT_QUEUE_CONSUME: return createT_DesEventQueueConsume();
			case TargetASTPackage.TDES_QUEUE_PEEK: return createT_DesQueuePeek();
			case TargetASTPackage.TDES_QUEUE_CONSUME: return createT_DesQueueConsume();
			case TargetASTPackage.TTYPE: return createT_Type();
			case TargetASTPackage.TTIME_STEP: return createT_TimeStep();
			case TargetASTPackage.TOBSERVER_ADD_VALUE: return createT_ObserverAddValue();
			case TargetASTPackage.TGET_INSTANCE_FOR_STATIC_ACCESS: return createT_GetInstanceForStaticAccess();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetASTRoot createTargetASTRoot() {
		TargetASTRootImpl targetASTRoot = new TargetASTRootImpl();
		return targetASTRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T_BinaryExp createT_BinaryExp() {
		T_BinaryExpImpl t_BinaryExp = new T_BinaryExpImpl();
		return t_BinaryExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T_Get createT_Get() {
		T_GetImpl t_Get = new T_GetImpl();
		return t_Get;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T_Set createT_Set() {
		T_SetImpl t_Set = new T_SetImpl();
		return t_Set;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T_ExtCall createT_ExtCall() {
		T_ExtCallImpl t_ExtCall = new T_ExtCallImpl();
		return t_ExtCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T_Literal createT_Literal() {
		T_LiteralImpl t_Literal = new T_LiteralImpl();
		return t_Literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T_InstanceOfExp createT_InstanceOfExp() {
		T_InstanceOfExpImpl t_InstanceOfExp = new T_InstanceOfExpImpl();
		return t_InstanceOfExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T_UnaryExp createT_UnaryExp() {
		T_UnaryExpImpl t_UnaryExp = new T_UnaryExpImpl();
		return t_UnaryExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T_CreateInstanceExp createT_CreateInstanceExp() {
		T_CreateInstanceExpImpl t_CreateInstanceExp = new T_CreateInstanceExpImpl();
		return t_CreateInstanceExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T_PrintExp createT_PrintExp() {
		T_PrintExpImpl t_PrintExp = new T_PrintExpImpl();
		return t_PrintExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T_GetInstancesOfExp createT_GetInstancesOfExp() {
		T_GetInstancesOfExpImpl t_GetInstancesOfExp = new T_GetInstancesOfExpImpl();
		return t_GetInstancesOfExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T_SetReturn createT_SetReturn() {
		T_SetReturnImpl t_SetReturn = new T_SetReturnImpl();
		return t_SetReturn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T_ExtConstructor createT_ExtConstructor() {
		T_ExtConstructorImpl t_ExtConstructor = new T_ExtConstructorImpl();
		return t_ExtConstructor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T_ExtType createT_ExtType() {
		T_ExtTypeImpl t_ExtType = new T_ExtTypeImpl();
		return t_ExtType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T_ExtAttrCall createT_ExtAttrCall() {
		T_ExtAttrCallImpl t_ExtAttrCall = new T_ExtAttrCallImpl();
		return t_ExtAttrCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T_OpCall createT_OpCall() {
		T_OpCallImpl t_OpCall = new T_OpCallImpl();
		return t_OpCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T_ColorDFA createT_ColorDFA() {
		T_ColorDFAImpl t_ColorDFA = new T_ColorDFAImpl();
		return t_ColorDFA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T_GetInstances createT_GetInstances() {
		T_GetInstancesImpl t_GetInstances = new T_GetInstancesImpl();
		return t_GetInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T_CountFinalStates createT_CountFinalStates() {
		T_CountFinalStatesImpl t_CountFinalStates = new T_CountFinalStatesImpl();
		return t_CountFinalStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T_CountInitialStates createT_CountInitialStates() {
		T_CountInitialStatesImpl t_CountInitialStates = new T_CountInitialStatesImpl();
		return t_CountInitialStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T_CountStates createT_CountStates() {
		T_CountStatesImpl t_CountStates = new T_CountStatesImpl();
		return t_CountStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T_SetAbsoluteNodePropability createT_SetAbsoluteNodePropability() {
		T_SetAbsoluteNodePropabilityImpl t_SetAbsoluteNodePropability = new T_SetAbsoluteNodePropabilityImpl();
		return t_SetAbsoluteNodePropability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T_CountReachableStates createT_CountReachableStates() {
		T_CountReachableStatesImpl t_CountReachableStates = new T_CountReachableStatesImpl();
		return t_CountReachableStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T_CountInValidTransitions createT_CountInValidTransitions() {
		T_CountInValidTransitionsImpl t_CountInValidTransitions = new T_CountInValidTransitionsImpl();
		return t_CountInValidTransitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T_SetPopulationSize createT_SetPopulationSize() {
		T_SetPopulationSizeImpl t_SetPopulationSize = new T_SetPopulationSizeImpl();
		return t_SetPopulationSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T_GetLayerInformation createT_GetLayerInformation() {
		T_GetLayerInformationImpl t_GetLayerInformation = new T_GetLayerInformationImpl();
		return t_GetLayerInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T_GetObjectManagement createT_GetObjectManagement() {
		T_GetObjectManagementImpl t_GetObjectManagement = new T_GetObjectManagementImpl();
		return t_GetObjectManagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T_LoadModel createT_LoadModel()
	{
		T_LoadModelImpl t_LoadModel = new T_LoadModelImpl();
		return t_LoadModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T_GetEnumLiteral createT_GetEnumLiteral()
	{
		T_GetEnumLiteralImpl t_GetEnumLiteral = new T_GetEnumLiteralImpl();
		return t_GetEnumLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T_DesEventQueuePeek createT_DesEventQueuePeek()
	{
		T_DesEventQueuePeekImpl t_DesEventQueuePeek = new T_DesEventQueuePeekImpl();
		return t_DesEventQueuePeek;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T_DesEventQueueConsume createT_DesEventQueueConsume()
	{
		T_DesEventQueueConsumeImpl t_DesEventQueueConsume = new T_DesEventQueueConsumeImpl();
		return t_DesEventQueueConsume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T_DesQueuePeek createT_DesQueuePeek() {
		T_DesQueuePeekImpl t_DesQueuePeek = new T_DesQueuePeekImpl();
		return t_DesQueuePeek;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T_DesQueueConsume createT_DesQueueConsume() {
		T_DesQueueConsumeImpl t_DesQueueConsume = new T_DesQueueConsumeImpl();
		return t_DesQueueConsume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T_Type createT_Type() {
		T_TypeImpl t_Type = new T_TypeImpl();
		return t_Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T_TimeStep createT_TimeStep() {
		T_TimeStepImpl t_TimeStep = new T_TimeStepImpl();
		return t_TimeStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T_ObserverAddValue createT_ObserverAddValue() {
		T_ObserverAddValueImpl t_ObserverAddValue = new T_ObserverAddValueImpl();
		return t_ObserverAddValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T_GetInstanceForStaticAccess createT_GetInstanceForStaticAccess() {
		T_GetInstanceForStaticAccessImpl t_GetInstanceForStaticAccess = new T_GetInstanceForStaticAccessImpl();
		return t_GetInstanceForStaticAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetASTPackage getTargetASTPackage() {
		return (TargetASTPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TargetASTPackage getPackage() {
		return TargetASTPackage.eINSTANCE;
	}

} //TargetASTFactoryImpl
