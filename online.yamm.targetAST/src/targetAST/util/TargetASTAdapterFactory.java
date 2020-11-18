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
package targetAST.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import targetAST.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see targetAST.TargetASTPackage
 * @generated
 */
public class TargetASTAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TargetASTPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetASTAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TargetASTPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TargetASTSwitch<Adapter> modelSwitch =
		new TargetASTSwitch<Adapter>() {
			@Override
			public Adapter caseTargetASTRoot(TargetASTRoot object) {
				return createTargetASTRootAdapter();
			}
			@Override
			public Adapter caseT_BinaryExp(T_BinaryExp object) {
				return createT_BinaryExpAdapter();
			}
			@Override
			public Adapter caseT_Get(T_Get object) {
				return createT_GetAdapter();
			}
			@Override
			public Adapter caseT_Set(T_Set object) {
				return createT_SetAdapter();
			}
			@Override
			public Adapter caseT_ExtCall(T_ExtCall object) {
				return createT_ExtCallAdapter();
			}
			@Override
			public Adapter caseT_ExpLevelB(T_ExpLevelB object) {
				return createT_ExpLevelBAdapter();
			}
			@Override
			public Adapter caseT_Literal(T_Literal object) {
				return createT_LiteralAdapter();
			}
			@Override
			public Adapter caseT_ExpLevelA(T_ExpLevelA object) {
				return createT_ExpLevelAAdapter();
			}
			@Override
			public Adapter caseT_InstanceOfExp(T_InstanceOfExp object) {
				return createT_InstanceOfExpAdapter();
			}
			@Override
			public Adapter caseT_UnaryExp(T_UnaryExp object) {
				return createT_UnaryExpAdapter();
			}
			@Override
			public Adapter caseT_CreateInstanceExp(T_CreateInstanceExp object) {
				return createT_CreateInstanceExpAdapter();
			}
			@Override
			public Adapter caseT_PrintExp(T_PrintExp object) {
				return createT_PrintExpAdapter();
			}
			@Override
			public Adapter caseT_GetInstancesOfExp(T_GetInstancesOfExp object) {
				return createT_GetInstancesOfExpAdapter();
			}
			@Override
			public Adapter caseT_SetReturn(T_SetReturn object) {
				return createT_SetReturnAdapter();
			}
			@Override
			public Adapter caseT_ExtConstructor(T_ExtConstructor object) {
				return createT_ExtConstructorAdapter();
			}
			@Override
			public Adapter caseT_ExtType(T_ExtType object) {
				return createT_ExtTypeAdapter();
			}
			@Override
			public Adapter caseT_ExtAttrCall(T_ExtAttrCall object) {
				return createT_ExtAttrCallAdapter();
			}
			@Override
			public Adapter caseT_OpCall(T_OpCall object) {
				return createT_OpCallAdapter();
			}
			@Override
			public Adapter caseT_ColorDFA(T_ColorDFA object) {
				return createT_ColorDFAAdapter();
			}
			@Override
			public Adapter caseT_GetInstances(T_GetInstances object) {
				return createT_GetInstancesAdapter();
			}
			@Override
			public Adapter caseT_CountFinalStates(T_CountFinalStates object) {
				return createT_CountFinalStatesAdapter();
			}
			@Override
			public Adapter caseT_CountInitialStates(T_CountInitialStates object) {
				return createT_CountInitialStatesAdapter();
			}
			@Override
			public Adapter caseT_CountStates(T_CountStates object) {
				return createT_CountStatesAdapter();
			}
			@Override
			public Adapter caseT_SetAbsoluteNodePropability(T_SetAbsoluteNodePropability object) {
				return createT_SetAbsoluteNodePropabilityAdapter();
			}
			@Override
			public Adapter caseT_CountReachableStates(T_CountReachableStates object) {
				return createT_CountReachableStatesAdapter();
			}
			@Override
			public Adapter caseT_CountInValidTransitions(T_CountInValidTransitions object) {
				return createT_CountInValidTransitionsAdapter();
			}
			@Override
			public Adapter caseT_SetPopulationSize(T_SetPopulationSize object) {
				return createT_SetPopulationSizeAdapter();
			}
			@Override
			public Adapter caseT_GetLayerInformation(T_GetLayerInformation object) {
				return createT_GetLayerInformationAdapter();
			}
			@Override
			public Adapter caseT_GetObjectManagement(T_GetObjectManagement object) {
				return createT_GetObjectManagementAdapter();
			}
			@Override
			public Adapter caseT_LoadModel(T_LoadModel object) {
				return createT_LoadModelAdapter();
			}
			@Override
			public Adapter caseT_GetEnumLiteral(T_GetEnumLiteral object) {
				return createT_GetEnumLiteralAdapter();
			}
			@Override
			public Adapter caseT_DesEventQueuePeek(T_DesEventQueuePeek object) {
				return createT_DesEventQueuePeekAdapter();
			}
			@Override
			public Adapter caseT_DesEventQueueConsume(T_DesEventQueueConsume object) {
				return createT_DesEventQueueConsumeAdapter();
			}
			@Override
			public Adapter caseT_DesQueuePeek(T_DesQueuePeek object) {
				return createT_DesQueuePeekAdapter();
			}
			@Override
			public Adapter caseT_DesQueueConsume(T_DesQueueConsume object) {
				return createT_DesQueueConsumeAdapter();
			}
			@Override
			public Adapter caseT_Type(T_Type object) {
				return createT_TypeAdapter();
			}
			@Override
			public Adapter caseT_TimeStep(T_TimeStep object) {
				return createT_TimeStepAdapter();
			}
			@Override
			public Adapter caseT_ObserverAddValue(T_ObserverAddValue object) {
				return createT_ObserverAddValueAdapter();
			}
			@Override
			public Adapter caseT_GetInstanceForStaticAccess(T_GetInstanceForStaticAccess object) {
				return createT_GetInstanceForStaticAccessAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link targetAST.TargetASTRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targetAST.TargetASTRoot
	 * @generated
	 */
	public Adapter createTargetASTRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targetAST.T_BinaryExp <em>TBinary Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targetAST.T_BinaryExp
	 * @generated
	 */
	public Adapter createT_BinaryExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targetAST.T_Get <em>TGet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targetAST.T_Get
	 * @generated
	 */
	public Adapter createT_GetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targetAST.T_Set <em>TSet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targetAST.T_Set
	 * @generated
	 */
	public Adapter createT_SetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targetAST.T_ExtCall <em>TExt Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targetAST.T_ExtCall
	 * @generated
	 */
	public Adapter createT_ExtCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targetAST.T_ExpLevelB <em>TExp Level B</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targetAST.T_ExpLevelB
	 * @generated
	 */
	public Adapter createT_ExpLevelBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targetAST.T_Literal <em>TLiteral</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targetAST.T_Literal
	 * @generated
	 */
	public Adapter createT_LiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targetAST.T_ExpLevelA <em>TExp Level A</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targetAST.T_ExpLevelA
	 * @generated
	 */
	public Adapter createT_ExpLevelAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targetAST.T_InstanceOfExp <em>TInstance Of Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targetAST.T_InstanceOfExp
	 * @generated
	 */
	public Adapter createT_InstanceOfExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targetAST.T_UnaryExp <em>TUnary Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targetAST.T_UnaryExp
	 * @generated
	 */
	public Adapter createT_UnaryExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targetAST.T_CreateInstanceExp <em>TCreate Instance Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targetAST.T_CreateInstanceExp
	 * @generated
	 */
	public Adapter createT_CreateInstanceExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targetAST.T_PrintExp <em>TPrint Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targetAST.T_PrintExp
	 * @generated
	 */
	public Adapter createT_PrintExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targetAST.T_GetInstancesOfExp <em>TGet Instances Of Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targetAST.T_GetInstancesOfExp
	 * @generated
	 */
	public Adapter createT_GetInstancesOfExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targetAST.T_SetReturn <em>TSet Return</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targetAST.T_SetReturn
	 * @generated
	 */
	public Adapter createT_SetReturnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targetAST.T_ExtConstructor <em>TExt Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targetAST.T_ExtConstructor
	 * @generated
	 */
	public Adapter createT_ExtConstructorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targetAST.T_ExtType <em>TExt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targetAST.T_ExtType
	 * @generated
	 */
	public Adapter createT_ExtTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targetAST.T_ExtAttrCall <em>TExt Attr Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targetAST.T_ExtAttrCall
	 * @generated
	 */
	public Adapter createT_ExtAttrCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targetAST.T_OpCall <em>TOp Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targetAST.T_OpCall
	 * @generated
	 */
	public Adapter createT_OpCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targetAST.T_ColorDFA <em>TColor DFA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targetAST.T_ColorDFA
	 * @generated
	 */
	public Adapter createT_ColorDFAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targetAST.T_GetInstances <em>TGet Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targetAST.T_GetInstances
	 * @generated
	 */
	public Adapter createT_GetInstancesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targetAST.T_CountFinalStates <em>TCount Final States</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targetAST.T_CountFinalStates
	 * @generated
	 */
	public Adapter createT_CountFinalStatesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targetAST.T_CountInitialStates <em>TCount Initial States</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targetAST.T_CountInitialStates
	 * @generated
	 */
	public Adapter createT_CountInitialStatesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targetAST.T_CountStates <em>TCount States</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targetAST.T_CountStates
	 * @generated
	 */
	public Adapter createT_CountStatesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targetAST.T_SetAbsoluteNodePropability <em>TSet Absolute Node Propability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targetAST.T_SetAbsoluteNodePropability
	 * @generated
	 */
	public Adapter createT_SetAbsoluteNodePropabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targetAST.T_CountReachableStates <em>TCount Reachable States</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targetAST.T_CountReachableStates
	 * @generated
	 */
	public Adapter createT_CountReachableStatesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targetAST.T_CountInValidTransitions <em>TCount In Valid Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targetAST.T_CountInValidTransitions
	 * @generated
	 */
	public Adapter createT_CountInValidTransitionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targetAST.T_SetPopulationSize <em>TSet Population Size</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targetAST.T_SetPopulationSize
	 * @generated
	 */
	public Adapter createT_SetPopulationSizeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targetAST.T_GetLayerInformation <em>TGet Layer Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targetAST.T_GetLayerInformation
	 * @generated
	 */
	public Adapter createT_GetLayerInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targetAST.T_GetObjectManagement <em>TGet Object Management</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targetAST.T_GetObjectManagement
	 * @generated
	 */
	public Adapter createT_GetObjectManagementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targetAST.T_LoadModel <em>TLoad Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targetAST.T_LoadModel
	 * @generated
	 */
	public Adapter createT_LoadModelAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targetAST.T_GetEnumLiteral <em>TGet Enum Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targetAST.T_GetEnumLiteral
	 * @generated
	 */
	public Adapter createT_GetEnumLiteralAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targetAST.T_DesEventQueuePeek <em>TDes Event Queue Peek</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targetAST.T_DesEventQueuePeek
	 * @generated
	 */
	public Adapter createT_DesEventQueuePeekAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targetAST.T_DesEventQueueConsume <em>TDes Event Queue Consume</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targetAST.T_DesEventQueueConsume
	 * @generated
	 */
	public Adapter createT_DesEventQueueConsumeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targetAST.T_DesQueuePeek <em>TDes Queue Peek</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targetAST.T_DesQueuePeek
	 * @generated
	 */
	public Adapter createT_DesQueuePeekAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targetAST.T_DesQueueConsume <em>TDes Queue Consume</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targetAST.T_DesQueueConsume
	 * @generated
	 */
	public Adapter createT_DesQueueConsumeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targetAST.T_Type <em>TType</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targetAST.T_Type
	 * @generated
	 */
	public Adapter createT_TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targetAST.T_TimeStep <em>TTime Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targetAST.T_TimeStep
	 * @generated
	 */
	public Adapter createT_TimeStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targetAST.T_ObserverAddValue <em>TObserver Add Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targetAST.T_ObserverAddValue
	 * @generated
	 */
	public Adapter createT_ObserverAddValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targetAST.T_GetInstanceForStaticAccess <em>TGet Instance For Static Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targetAST.T_GetInstanceForStaticAccess
	 * @generated
	 */
	public Adapter createT_GetInstanceForStaticAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TargetASTAdapterFactory
