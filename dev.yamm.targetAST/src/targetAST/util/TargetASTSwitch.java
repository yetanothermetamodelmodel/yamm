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
package targetAST.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import targetAST.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see targetAST.TargetASTPackage
 * @generated
 */
public class TargetASTSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TargetASTPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetASTSwitch() {
		if (modelPackage == null) {
			modelPackage = TargetASTPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TargetASTPackage.TARGET_AST_ROOT: {
				TargetASTRoot targetASTRoot = (TargetASTRoot)theEObject;
				T result = caseTargetASTRoot(targetASTRoot);
				if (result == null) result = caseT_ExpLevelA(targetASTRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetASTPackage.TBINARY_EXP: {
				T_BinaryExp t_BinaryExp = (T_BinaryExp)theEObject;
				T result = caseT_BinaryExp(t_BinaryExp);
				if (result == null) result = caseT_ExpLevelA(t_BinaryExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetASTPackage.TGET: {
				T_Get t_Get = (T_Get)theEObject;
				T result = caseT_Get(t_Get);
				if (result == null) result = caseT_ExpLevelB(t_Get);
				if (result == null) result = caseT_ExpLevelA(t_Get);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetASTPackage.TSET: {
				T_Set t_Set = (T_Set)theEObject;
				T result = caseT_Set(t_Set);
				if (result == null) result = caseT_ExpLevelB(t_Set);
				if (result == null) result = caseT_ExpLevelA(t_Set);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetASTPackage.TEXT_CALL: {
				T_ExtCall t_ExtCall = (T_ExtCall)theEObject;
				T result = caseT_ExtCall(t_ExtCall);
				if (result == null) result = caseT_ExpLevelB(t_ExtCall);
				if (result == null) result = caseT_ExpLevelA(t_ExtCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetASTPackage.TEXP_LEVEL_B: {
				T_ExpLevelB t_ExpLevelB = (T_ExpLevelB)theEObject;
				T result = caseT_ExpLevelB(t_ExpLevelB);
				if (result == null) result = caseT_ExpLevelA(t_ExpLevelB);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetASTPackage.TLITERAL: {
				T_Literal t_Literal = (T_Literal)theEObject;
				T result = caseT_Literal(t_Literal);
				if (result == null) result = caseT_ExpLevelA(t_Literal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetASTPackage.TEXP_LEVEL_A: {
				T_ExpLevelA t_ExpLevelA = (T_ExpLevelA)theEObject;
				T result = caseT_ExpLevelA(t_ExpLevelA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetASTPackage.TINSTANCE_OF_EXP: {
				T_InstanceOfExp t_InstanceOfExp = (T_InstanceOfExp)theEObject;
				T result = caseT_InstanceOfExp(t_InstanceOfExp);
				if (result == null) result = caseT_ExpLevelA(t_InstanceOfExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetASTPackage.TUNARY_EXP: {
				T_UnaryExp t_UnaryExp = (T_UnaryExp)theEObject;
				T result = caseT_UnaryExp(t_UnaryExp);
				if (result == null) result = caseT_ExpLevelB(t_UnaryExp);
				if (result == null) result = caseT_ExpLevelA(t_UnaryExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetASTPackage.TCREATE_INSTANCE_EXP: {
				T_CreateInstanceExp t_CreateInstanceExp = (T_CreateInstanceExp)theEObject;
				T result = caseT_CreateInstanceExp(t_CreateInstanceExp);
				if (result == null) result = caseT_ExpLevelA(t_CreateInstanceExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetASTPackage.TPRINT_EXP: {
				T_PrintExp t_PrintExp = (T_PrintExp)theEObject;
				T result = caseT_PrintExp(t_PrintExp);
				if (result == null) result = caseT_ExpLevelA(t_PrintExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetASTPackage.TGET_INSTANCES_OF_EXP: {
				T_GetInstancesOfExp t_GetInstancesOfExp = (T_GetInstancesOfExp)theEObject;
				T result = caseT_GetInstancesOfExp(t_GetInstancesOfExp);
				if (result == null) result = caseT_ExpLevelA(t_GetInstancesOfExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetASTPackage.TSET_RETURN: {
				T_SetReturn t_SetReturn = (T_SetReturn)theEObject;
				T result = caseT_SetReturn(t_SetReturn);
				if (result == null) result = caseT_ExpLevelA(t_SetReturn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetASTPackage.TEXT_CONSTRUCTOR: {
				T_ExtConstructor t_ExtConstructor = (T_ExtConstructor)theEObject;
				T result = caseT_ExtConstructor(t_ExtConstructor);
				if (result == null) result = caseT_ExpLevelA(t_ExtConstructor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetASTPackage.TEXT_TYPE: {
				T_ExtType t_ExtType = (T_ExtType)theEObject;
				T result = caseT_ExtType(t_ExtType);
				if (result == null) result = caseT_ExpLevelB(t_ExtType);
				if (result == null) result = caseT_ExpLevelA(t_ExtType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetASTPackage.TEXT_ATTR_CALL: {
				T_ExtAttrCall t_ExtAttrCall = (T_ExtAttrCall)theEObject;
				T result = caseT_ExtAttrCall(t_ExtAttrCall);
				if (result == null) result = caseT_ExpLevelA(t_ExtAttrCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetASTPackage.TOP_CALL: {
				T_OpCall t_OpCall = (T_OpCall)theEObject;
				T result = caseT_OpCall(t_OpCall);
				if (result == null) result = caseT_ExpLevelA(t_OpCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetASTPackage.TCOLOR_DFA: {
				T_ColorDFA t_ColorDFA = (T_ColorDFA)theEObject;
				T result = caseT_ColorDFA(t_ColorDFA);
				if (result == null) result = caseT_ExpLevelA(t_ColorDFA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetASTPackage.TGET_INSTANCES: {
				T_GetInstances t_GetInstances = (T_GetInstances)theEObject;
				T result = caseT_GetInstances(t_GetInstances);
				if (result == null) result = caseT_ExpLevelA(t_GetInstances);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetASTPackage.TCOUNT_FINAL_STATES: {
				T_CountFinalStates t_CountFinalStates = (T_CountFinalStates)theEObject;
				T result = caseT_CountFinalStates(t_CountFinalStates);
				if (result == null) result = caseT_ExpLevelA(t_CountFinalStates);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetASTPackage.TCOUNT_INITIAL_STATES: {
				T_CountInitialStates t_CountInitialStates = (T_CountInitialStates)theEObject;
				T result = caseT_CountInitialStates(t_CountInitialStates);
				if (result == null) result = caseT_ExpLevelA(t_CountInitialStates);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetASTPackage.TCOUNT_STATES: {
				T_CountStates t_CountStates = (T_CountStates)theEObject;
				T result = caseT_CountStates(t_CountStates);
				if (result == null) result = caseT_ExpLevelA(t_CountStates);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetASTPackage.TSET_ABSOLUTE_NODE_PROPABILITY: {
				T_SetAbsoluteNodePropability t_SetAbsoluteNodePropability = (T_SetAbsoluteNodePropability)theEObject;
				T result = caseT_SetAbsoluteNodePropability(t_SetAbsoluteNodePropability);
				if (result == null) result = caseT_ExpLevelA(t_SetAbsoluteNodePropability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetASTPackage.TCOUNT_REACHABLE_STATES: {
				T_CountReachableStates t_CountReachableStates = (T_CountReachableStates)theEObject;
				T result = caseT_CountReachableStates(t_CountReachableStates);
				if (result == null) result = caseT_ExpLevelA(t_CountReachableStates);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetASTPackage.TCOUNT_IN_VALID_TRANSITIONS: {
				T_CountInValidTransitions t_CountInValidTransitions = (T_CountInValidTransitions)theEObject;
				T result = caseT_CountInValidTransitions(t_CountInValidTransitions);
				if (result == null) result = caseT_ExpLevelA(t_CountInValidTransitions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetASTPackage.TSET_POPULATION_SIZE: {
				T_SetPopulationSize t_SetPopulationSize = (T_SetPopulationSize)theEObject;
				T result = caseT_SetPopulationSize(t_SetPopulationSize);
				if (result == null) result = caseT_ExpLevelA(t_SetPopulationSize);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetASTPackage.TGET_LAYER_INFORMATION: {
				T_GetLayerInformation t_GetLayerInformation = (T_GetLayerInformation)theEObject;
				T result = caseT_GetLayerInformation(t_GetLayerInformation);
				if (result == null) result = caseT_ExpLevelA(t_GetLayerInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetASTPackage.TGET_OBJECT_MANAGEMENT: {
				T_GetObjectManagement t_GetObjectManagement = (T_GetObjectManagement)theEObject;
				T result = caseT_GetObjectManagement(t_GetObjectManagement);
				if (result == null) result = caseT_ExpLevelA(t_GetObjectManagement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetASTPackage.TLOAD_MODEL: {
				T_LoadModel t_LoadModel = (T_LoadModel)theEObject;
				T result = caseT_LoadModel(t_LoadModel);
				if (result == null) result = caseT_ExpLevelA(t_LoadModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetASTPackage.TGET_ENUM_LITERAL: {
				T_GetEnumLiteral t_GetEnumLiteral = (T_GetEnumLiteral)theEObject;
				T result = caseT_GetEnumLiteral(t_GetEnumLiteral);
				if (result == null) result = caseT_ExpLevelA(t_GetEnumLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetASTPackage.TDES_EVENT_QUEUE_PEEK: {
				T_DesEventQueuePeek t_DesEventQueuePeek = (T_DesEventQueuePeek)theEObject;
				T result = caseT_DesEventQueuePeek(t_DesEventQueuePeek);
				if (result == null) result = caseT_ExpLevelA(t_DesEventQueuePeek);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetASTPackage.TDES_EVENT_QUEUE_CONSUME: {
				T_DesEventQueueConsume t_DesEventQueueConsume = (T_DesEventQueueConsume)theEObject;
				T result = caseT_DesEventQueueConsume(t_DesEventQueueConsume);
				if (result == null) result = caseT_ExpLevelA(t_DesEventQueueConsume);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetASTPackage.TDES_QUEUE_PEEK: {
				T_DesQueuePeek t_DesQueuePeek = (T_DesQueuePeek)theEObject;
				T result = caseT_DesQueuePeek(t_DesQueuePeek);
				if (result == null) result = caseT_ExpLevelA(t_DesQueuePeek);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetASTPackage.TDES_QUEUE_CONSUME: {
				T_DesQueueConsume t_DesQueueConsume = (T_DesQueueConsume)theEObject;
				T result = caseT_DesQueueConsume(t_DesQueueConsume);
				if (result == null) result = caseT_ExpLevelA(t_DesQueueConsume);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetASTPackage.TTYPE: {
				T_Type t_Type = (T_Type)theEObject;
				T result = caseT_Type(t_Type);
				if (result == null) result = caseT_ExpLevelA(t_Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetASTPackage.TTIME_STEP: {
				T_TimeStep t_TimeStep = (T_TimeStep)theEObject;
				T result = caseT_TimeStep(t_TimeStep);
				if (result == null) result = caseT_ExpLevelA(t_TimeStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetASTPackage.TOBSERVER_ADD_VALUE: {
				T_ObserverAddValue t_ObserverAddValue = (T_ObserverAddValue)theEObject;
				T result = caseT_ObserverAddValue(t_ObserverAddValue);
				if (result == null) result = caseT_ExpLevelA(t_ObserverAddValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetASTPackage.TGET_INSTANCE_FOR_STATIC_ACCESS: {
				T_GetInstanceForStaticAccess t_GetInstanceForStaticAccess = (T_GetInstanceForStaticAccess)theEObject;
				T result = caseT_GetInstanceForStaticAccess(t_GetInstanceForStaticAccess);
				if (result == null) result = caseT_ExpLevelB(t_GetInstanceForStaticAccess);
				if (result == null) result = caseT_ExpLevelA(t_GetInstanceForStaticAccess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargetASTRoot(TargetASTRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TBinary Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TBinary Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseT_BinaryExp(T_BinaryExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TGet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TGet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseT_Get(T_Get object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TSet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TSet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseT_Set(T_Set object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TExt Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TExt Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseT_ExtCall(T_ExtCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TExp Level B</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TExp Level B</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseT_ExpLevelB(T_ExpLevelB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TLiteral</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TLiteral</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseT_Literal(T_Literal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TExp Level A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TExp Level A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseT_ExpLevelA(T_ExpLevelA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TInstance Of Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TInstance Of Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseT_InstanceOfExp(T_InstanceOfExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TUnary Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TUnary Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseT_UnaryExp(T_UnaryExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TCreate Instance Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TCreate Instance Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseT_CreateInstanceExp(T_CreateInstanceExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TPrint Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TPrint Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseT_PrintExp(T_PrintExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TGet Instances Of Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TGet Instances Of Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseT_GetInstancesOfExp(T_GetInstancesOfExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TSet Return</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TSet Return</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseT_SetReturn(T_SetReturn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TExt Constructor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TExt Constructor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseT_ExtConstructor(T_ExtConstructor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TExt Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TExt Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseT_ExtType(T_ExtType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TExt Attr Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TExt Attr Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseT_ExtAttrCall(T_ExtAttrCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TOp Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TOp Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseT_OpCall(T_OpCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TColor DFA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TColor DFA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseT_ColorDFA(T_ColorDFA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TGet Instances</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TGet Instances</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseT_GetInstances(T_GetInstances object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TCount Final States</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TCount Final States</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseT_CountFinalStates(T_CountFinalStates object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TCount Initial States</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TCount Initial States</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseT_CountInitialStates(T_CountInitialStates object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TCount States</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TCount States</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseT_CountStates(T_CountStates object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TSet Absolute Node Propability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TSet Absolute Node Propability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseT_SetAbsoluteNodePropability(T_SetAbsoluteNodePropability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TCount Reachable States</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TCount Reachable States</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseT_CountReachableStates(T_CountReachableStates object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TCount In Valid Transitions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TCount In Valid Transitions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseT_CountInValidTransitions(T_CountInValidTransitions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TSet Population Size</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TSet Population Size</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseT_SetPopulationSize(T_SetPopulationSize object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TGet Layer Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TGet Layer Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseT_GetLayerInformation(T_GetLayerInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TGet Object Management</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TGet Object Management</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseT_GetObjectManagement(T_GetObjectManagement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TLoad Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TLoad Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseT_LoadModel(T_LoadModel object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TGet Enum Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TGet Enum Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseT_GetEnumLiteral(T_GetEnumLiteral object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TDes Event Queue Peek</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TDes Event Queue Peek</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseT_DesEventQueuePeek(T_DesEventQueuePeek object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TDes Event Queue Consume</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TDes Event Queue Consume</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseT_DesEventQueueConsume(T_DesEventQueueConsume object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TDes Queue Peek</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TDes Queue Peek</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseT_DesQueuePeek(T_DesQueuePeek object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TDes Queue Consume</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TDes Queue Consume</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseT_DesQueueConsume(T_DesQueueConsume object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TType</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TType</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseT_Type(T_Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TTime Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TTime Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseT_TimeStep(T_TimeStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TObserver Add Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TObserver Add Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseT_ObserverAddValue(T_ObserverAddValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TGet Instance For Static Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TGet Instance For Static Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseT_GetInstanceForStaticAccess(T_GetInstanceForStaticAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //TargetASTSwitch
