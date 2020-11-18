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
package online.yamm.compile;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import targetAST.T_BinaryExp;
import targetAST.T_ColorDFA;
import targetAST.T_CountFinalStates;
import targetAST.T_CountInValidTransitions;
import targetAST.T_CountInitialStates;
import targetAST.T_CountReachableStates;
import targetAST.T_CountStates;
import targetAST.T_CreateInstanceExp;
import targetAST.T_DesEventQueueConsume;
import targetAST.T_DesEventQueuePeek;
import targetAST.T_DesQueueConsume;
import targetAST.T_DesQueuePeek;
import targetAST.T_ExpLevelA;
import targetAST.T_ExpLevelB;
import targetAST.T_ExtAttrCall;
import targetAST.T_ExtCall;
import targetAST.T_ExtConstructor;
import targetAST.T_ExtType;
import targetAST.T_Get;
import targetAST.T_GetEnumLiteral;
import targetAST.T_GetInstances;
import targetAST.T_GetInstancesOfExp;
import targetAST.T_GetLayerInformation;
import targetAST.T_GetObjectManagement;
import targetAST.T_InstanceOfExp;
import targetAST.T_Literal;
import targetAST.T_LoadModel;
import targetAST.T_ObserverAddValue;
import targetAST.T_OpCall;
import targetAST.T_PrintExp;
import targetAST.T_Set;
import targetAST.T_SetAbsoluteNodePropability;
import targetAST.T_SetPopulationSize;
import targetAST.T_SetReturn;
import targetAST.T_TimeStep;
import targetAST.T_Type;
import targetAST.T_UnaryExp;
import targetAST.TargetASTPackage;

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
public class ModifiedTargetSwitch extends Switch<T_ExpLevelA> {
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
	public ModifiedTargetSwitch() {
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
	 * @generated not
	 */
	@Override
	protected T_ExpLevelA doSwitch(int classifierID, EObject theEObject) {
		if (theEObject instanceof T_ExpLevelA)
			return doSwitch(classifierID, (T_ExpLevelA) theEObject); 
		return null;
	}
	
	
	protected T_ExpLevelA doSwitch(int classifierID, T_ExpLevelA theEObject) {
		switch (classifierID) {
			case TargetASTPackage.TARGET_AST_ROOT: {
				return caseTargetASTRoot(theEObject);
			}
			case TargetASTPackage.TBINARY_EXP: {
				return caseT_ExpLevelA(caseT_BinaryExp(theEObject));
			}
			case TargetASTPackage.TGET: {				
				return caseT_ExpLevelA(caseT_ExpLevelB(caseT_Get(theEObject)));
			}
			case TargetASTPackage.TSET: {
				return caseT_ExpLevelA(caseT_ExpLevelB(caseT_Set(theEObject)));
			}
			case TargetASTPackage.TEXT_CALL: {
				return caseT_ExpLevelA(caseT_ExpLevelB(caseT_ExtCall(theEObject)));
			}
			case TargetASTPackage.TEXP_LEVEL_B: {
				return caseT_ExpLevelA(caseT_ExpLevelB(theEObject));
			}
			case TargetASTPackage.TLITERAL: {
				return caseT_Literal((T_Literal) theEObject);
			}
			case TargetASTPackage.TEXP_LEVEL_A: {
				return caseT_ExpLevelA(theEObject);
			}
			case TargetASTPackage.TINSTANCE_OF_EXP: {
				return caseT_ExpLevelA(caseT_InstanceOfExp(theEObject));
			}
			case TargetASTPackage.TUNARY_EXP: {
				return caseT_ExpLevelA(caseT_ExpLevelB(caseT_UnaryExp(theEObject)));
			}
			case TargetASTPackage.TCREATE_INSTANCE_EXP: {
				return caseT_ExpLevelA(caseT_CreateInstanceExp(theEObject));
			}
			case TargetASTPackage.TPRINT_EXP: {
				return caseT_PrintExp(theEObject);
			}
			case TargetASTPackage.TGET_INSTANCES_OF_EXP: {
				return caseT_ExpLevelA(caseT_GetInstancesOfExp(theEObject));
			}
			case TargetASTPackage.TSET_RETURN: {
				return caseT_ExpLevelA(caseT_SetReturn(theEObject));
			}
			case TargetASTPackage.TEXT_CONSTRUCTOR: {
				return caseT_ExpLevelA(caseT_ExtConstructor(theEObject));
			}
			case TargetASTPackage.TEXT_TYPE: {
				return caseT_ExpLevelA(caseT_ExpLevelB(caseT_ExtType(theEObject)));
			}
			case TargetASTPackage.TEXT_ATTR_CALL: {
				return caseT_ExpLevelA(caseT_ExtAttrCall(theEObject));
			}
			case TargetASTPackage.TOP_CALL: {
				return caseT_ExpLevelA(caseT_OpCall(theEObject));
			}
			case TargetASTPackage.TCOLOR_DFA: {
				return caseT_ExpLevelA(caseT_ColorDFA(theEObject));
			}
			case TargetASTPackage.TGET_INSTANCES: {
				return caseT_ExpLevelA(caseT_GetInstances(theEObject));
			}
			case TargetASTPackage.TCOUNT_FINAL_STATES: {
				return caseT_ExpLevelA(caseT_CountFinalStates(theEObject));
			}
			case TargetASTPackage.TCOUNT_INITIAL_STATES: {
				return caseT_ExpLevelA(caseT_CountInitialStates(theEObject));
			}
			case TargetASTPackage.TCOUNT_STATES: {
				return caseT_ExpLevelA(caseT_CountStates(theEObject));
			}
			case TargetASTPackage.TSET_ABSOLUTE_NODE_PROPABILITY: {
				return caseT_ExpLevelA(caseT_SetAbsoluteNodePropability(theEObject));
			}
			case TargetASTPackage.TCOUNT_REACHABLE_STATES: {			
				return caseT_ExpLevelA(caseT_CountReachableStates(theEObject));
			}
			case TargetASTPackage.TCOUNT_IN_VALID_TRANSITIONS: {
				return caseT_ExpLevelA(caseT_CountInValidTransitions(theEObject));
			}
			case TargetASTPackage.TSET_POPULATION_SIZE: {
				return caseT_ExpLevelA(caseT_SetPopulationSize(theEObject));
			}
			case TargetASTPackage.TGET_LAYER_INFORMATION: {
				return caseT_ExpLevelA(caseT_GetLayerInformation(theEObject));
			}
			case TargetASTPackage.TGET_OBJECT_MANAGEMENT: {
				return caseT_ExpLevelA(caseT_GetObjectManagement(theEObject));
			}
			case TargetASTPackage.TLOAD_MODEL: {
				return caseT_ExpLevelA(caseT_LoadModel(theEObject));
			}
			case TargetASTPackage.TGET_ENUM_LITERAL: {
				return caseT_ExpLevelA(caseT_GetEnumLiteral(theEObject));
			}
			case TargetASTPackage.TDES_EVENT_QUEUE_PEEK: {
				return caseT_ExpLevelA(caseT_DesEventQueuePeek(theEObject));
			}
			case TargetASTPackage.TDES_EVENT_QUEUE_CONSUME: {
				return caseT_ExpLevelA(caseT_DesEventQueueConsume(theEObject));
			}
			case TargetASTPackage.TDES_QUEUE_PEEK: {
				return caseT_ExpLevelA(caseT_DesQueuePeek(theEObject));
			}
			case TargetASTPackage.TDES_QUEUE_CONSUME: {
				return caseT_ExpLevelA(caseT_DesQueueConsume(theEObject));
			}
			case TargetASTPackage.TTYPE: {
				return caseT_ExpLevelA(caseT_Type(theEObject));
			}
			case TargetASTPackage.TTIME_STEP: {
				return caseT_ExpLevelA(caseT_TimeStep(theEObject));
			}
			case TargetASTPackage.TOBSERVER_ADD_VALUE: {
				return caseT_ExpLevelA(caseT_ObserverAddValue(theEObject));
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
	public T_ExpLevelA caseTargetASTRoot(T_ExpLevelA object) {
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
	public T_ExpLevelA caseT_BinaryExp(T_ExpLevelA object) {
		return null;
	}

	/**
	 * abstract
	 * 
	 * @param object
	 * @return
	 */
	public T_ExpLevelA caseT_ExpLevelA(T_ExpLevelA object) {
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
	public T_ExpLevelA caseT_Get(T_ExpLevelA object) {
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
	public T_ExpLevelA caseT_Set(T_ExpLevelA object) {
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
	public T_ExpLevelA caseT_ExtCall(T_ExpLevelA object) {
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
	public T_ExpLevelA caseT_ExpLevelB(T_ExpLevelA object) {
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
	public T_ExpLevelA caseT_Literal(T_ExpLevelA object) {
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
	public T_ExpLevelA caseT_T_ExpLevelA(T_ExpLevelA object) {
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
	public T_ExpLevelA caseT_InstanceOfExp(T_ExpLevelA object) {
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
	public T_ExpLevelA caseT_UnaryExp(T_ExpLevelA object) {
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
	public T_ExpLevelA caseT_CreateInstanceExp(T_ExpLevelA object) {
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
	public T_ExpLevelA caseT_PrintExp(T_ExpLevelA object) {
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
	public T_ExpLevelA caseT_GetInstancesOfExp(T_ExpLevelA object) {
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
	public T_ExpLevelA caseT_SetReturn(T_ExpLevelA object) {
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
	public T_ExpLevelA caseT_ExtConstructor(T_ExpLevelA object) {
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
	public T_ExpLevelA caseT_ExtType(T_ExpLevelA object) {
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
	public T_ExpLevelA caseT_ExtAttrCall(T_ExpLevelA object) {
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
	public T_ExpLevelA caseT_OpCall(T_ExpLevelA object) {
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
	public T_ExpLevelA caseT_ColorDFA(T_ExpLevelA object) {
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
	public T_ExpLevelA caseT_GetInstances(T_ExpLevelA object) {
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
	public T_ExpLevelA caseT_CountFinalStates(T_ExpLevelA object) {
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
	public T_ExpLevelA caseT_CountInitialStates(T_ExpLevelA object) {
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
	public T_ExpLevelA caseT_CountStates(T_ExpLevelA object) {
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
	public T_ExpLevelA caseT_SetAbsoluteNodePropability(T_ExpLevelA object) {
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
	public T_ExpLevelA caseT_CountReachableStates(T_ExpLevelA object) {
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
	public T_ExpLevelA caseT_CountInValidTransitions(T_ExpLevelA object) {
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
	public T_ExpLevelA caseT_SetPopulationSize(T_ExpLevelA object) {
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
	public T_ExpLevelA caseT_GetLayerInformation(T_ExpLevelA object) {
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
	public T_ExpLevelA caseT_GetObjectManagement(T_ExpLevelA object) {
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
	public T_ExpLevelA caseT_LoadModel(T_ExpLevelA object)
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
	public T_ExpLevelA caseT_GetEnumLiteral(T_ExpLevelA object)
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
	public T_ExpLevelA caseT_DesEventQueuePeek(T_ExpLevelA object)
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
	public T_ExpLevelA caseT_DesEventQueueConsume(T_ExpLevelA object)
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
	public T_ExpLevelA caseT_DesQueuePeek(T_ExpLevelA object) {
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
	public T_ExpLevelA caseT_DesQueueConsume(T_ExpLevelA object) {
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
	public T_ExpLevelA caseT_Type(T_ExpLevelA object) {
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
	public T_ExpLevelA caseT_TimeStep(T_ExpLevelA object) {
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
	public T_ExpLevelA caseT_ObserverAddValue(T_ExpLevelA object) {
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
	public T_ExpLevelA defaultCase(EObject object) {
		return null;
	}

} //TargetASTSwitch
