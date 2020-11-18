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
package targetAST;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see targetAST.TargetASTPackage
 * @generated
 */
public interface TargetASTFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TargetASTFactory eINSTANCE = targetAST.impl.TargetASTFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root</em>'.
	 * @generated
	 */
	TargetASTRoot createTargetASTRoot();

	/**
	 * Returns a new object of class '<em>TBinary Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TBinary Exp</em>'.
	 * @generated
	 */
	T_BinaryExp createT_BinaryExp();

	/**
	 * Returns a new object of class '<em>TGet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TGet</em>'.
	 * @generated
	 */
	T_Get createT_Get();

	/**
	 * Returns a new object of class '<em>TSet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TSet</em>'.
	 * @generated
	 */
	T_Set createT_Set();

	/**
	 * Returns a new object of class '<em>TExt Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TExt Call</em>'.
	 * @generated
	 */
	T_ExtCall createT_ExtCall();

	/**
	 * Returns a new object of class '<em>TLiteral</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TLiteral</em>'.
	 * @generated
	 */
	T_Literal createT_Literal();

	/**
	 * Returns a new object of class '<em>TInstance Of Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TInstance Of Exp</em>'.
	 * @generated
	 */
	T_InstanceOfExp createT_InstanceOfExp();

	/**
	 * Returns a new object of class '<em>TUnary Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TUnary Exp</em>'.
	 * @generated
	 */
	T_UnaryExp createT_UnaryExp();

	/**
	 * Returns a new object of class '<em>TCreate Instance Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TCreate Instance Exp</em>'.
	 * @generated
	 */
	T_CreateInstanceExp createT_CreateInstanceExp();

	/**
	 * Returns a new object of class '<em>TPrint Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TPrint Exp</em>'.
	 * @generated
	 */
	T_PrintExp createT_PrintExp();

	/**
	 * Returns a new object of class '<em>TGet Instances Of Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TGet Instances Of Exp</em>'.
	 * @generated
	 */
	T_GetInstancesOfExp createT_GetInstancesOfExp();

	/**
	 * Returns a new object of class '<em>TSet Return</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TSet Return</em>'.
	 * @generated
	 */
	T_SetReturn createT_SetReturn();

	/**
	 * Returns a new object of class '<em>TExt Constructor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TExt Constructor</em>'.
	 * @generated
	 */
	T_ExtConstructor createT_ExtConstructor();

	/**
	 * Returns a new object of class '<em>TExt Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TExt Type</em>'.
	 * @generated
	 */
	T_ExtType createT_ExtType();

	/**
	 * Returns a new object of class '<em>TExt Attr Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TExt Attr Call</em>'.
	 * @generated
	 */
	T_ExtAttrCall createT_ExtAttrCall();

	/**
	 * Returns a new object of class '<em>TOp Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TOp Call</em>'.
	 * @generated
	 */
	T_OpCall createT_OpCall();

	/**
	 * Returns a new object of class '<em>TColor DFA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TColor DFA</em>'.
	 * @generated
	 */
	T_ColorDFA createT_ColorDFA();

	/**
	 * Returns a new object of class '<em>TGet Instances</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TGet Instances</em>'.
	 * @generated
	 */
	T_GetInstances createT_GetInstances();

	/**
	 * Returns a new object of class '<em>TCount Final States</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TCount Final States</em>'.
	 * @generated
	 */
	T_CountFinalStates createT_CountFinalStates();

	/**
	 * Returns a new object of class '<em>TCount Initial States</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TCount Initial States</em>'.
	 * @generated
	 */
	T_CountInitialStates createT_CountInitialStates();

	/**
	 * Returns a new object of class '<em>TCount States</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TCount States</em>'.
	 * @generated
	 */
	T_CountStates createT_CountStates();

	/**
	 * Returns a new object of class '<em>TSet Absolute Node Propability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TSet Absolute Node Propability</em>'.
	 * @generated
	 */
	T_SetAbsoluteNodePropability createT_SetAbsoluteNodePropability();

	/**
	 * Returns a new object of class '<em>TCount Reachable States</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TCount Reachable States</em>'.
	 * @generated
	 */
	T_CountReachableStates createT_CountReachableStates();

	/**
	 * Returns a new object of class '<em>TCount In Valid Transitions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TCount In Valid Transitions</em>'.
	 * @generated
	 */
	T_CountInValidTransitions createT_CountInValidTransitions();

	/**
	 * Returns a new object of class '<em>TSet Population Size</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TSet Population Size</em>'.
	 * @generated
	 */
	T_SetPopulationSize createT_SetPopulationSize();

	/**
	 * Returns a new object of class '<em>TGet Layer Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TGet Layer Information</em>'.
	 * @generated
	 */
	T_GetLayerInformation createT_GetLayerInformation();

	/**
	 * Returns a new object of class '<em>TGet Object Management</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TGet Object Management</em>'.
	 * @generated
	 */
	T_GetObjectManagement createT_GetObjectManagement();

	/**
	 * Returns a new object of class '<em>TLoad Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TLoad Model</em>'.
	 * @generated
	 */
	T_LoadModel createT_LoadModel();

	/**
	 * Returns a new object of class '<em>TGet Enum Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TGet Enum Literal</em>'.
	 * @generated
	 */
	T_GetEnumLiteral createT_GetEnumLiteral();

	/**
	 * Returns a new object of class '<em>TDes Event Queue Peek</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TDes Event Queue Peek</em>'.
	 * @generated
	 */
	T_DesEventQueuePeek createT_DesEventQueuePeek();

	/**
	 * Returns a new object of class '<em>TDes Event Queue Consume</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TDes Event Queue Consume</em>'.
	 * @generated
	 */
	T_DesEventQueueConsume createT_DesEventQueueConsume();

	/**
	 * Returns a new object of class '<em>TDes Queue Peek</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TDes Queue Peek</em>'.
	 * @generated
	 */
	T_DesQueuePeek createT_DesQueuePeek();

	/**
	 * Returns a new object of class '<em>TDes Queue Consume</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TDes Queue Consume</em>'.
	 * @generated
	 */
	T_DesQueueConsume createT_DesQueueConsume();

	/**
	 * Returns a new object of class '<em>TType</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TType</em>'.
	 * @generated
	 */
	T_Type createT_Type();

	/**
	 * Returns a new object of class '<em>TTime Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TTime Step</em>'.
	 * @generated
	 */
	T_TimeStep createT_TimeStep();

	/**
	 * Returns a new object of class '<em>TObserver Add Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TObserver Add Value</em>'.
	 * @generated
	 */
	T_ObserverAddValue createT_ObserverAddValue();

	/**
	 * Returns a new object of class '<em>TGet Instance For Static Access</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TGet Instance For Static Access</em>'.
	 * @generated
	 */
	T_GetInstanceForStaticAccess createT_GetInstanceForStaticAccess();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TargetASTPackage getTargetASTPackage();

} //TargetASTFactory
