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
package targetAST.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
import targetAST.T_GetInstanceForStaticAccess;
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
import targetAST.TargetASTFactory;
import targetAST.TargetASTPackage;
import targetAST.TargetASTRoot;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TargetASTPackageImpl extends EPackageImpl implements TargetASTPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetASTRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t_BinaryExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t_GetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t_SetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t_ExtCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t_ExpLevelBEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t_LiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t_ExpLevelAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t_InstanceOfExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t_UnaryExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t_CreateInstanceExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t_PrintExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t_GetInstancesOfExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t_SetReturnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t_ExtConstructorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t_ExtTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t_ExtAttrCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t_OpCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t_ColorDFAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t_GetInstancesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t_CountFinalStatesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t_CountInitialStatesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t_CountStatesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t_SetAbsoluteNodePropabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t_CountReachableStatesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t_CountInValidTransitionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t_SetPopulationSizeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t_GetLayerInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t_GetObjectManagementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t_LoadModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t_GetEnumLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t_DesEventQueuePeekEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t_DesEventQueueConsumeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t_DesQueuePeekEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t_DesQueueConsumeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t_TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t_TimeStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t_ObserverAddValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t_GetInstanceForStaticAccessEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see targetAST.TargetASTPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TargetASTPackageImpl() {
		super(eNS_URI, TargetASTFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link TargetASTPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TargetASTPackage init() {
		if (isInited) return (TargetASTPackage)EPackage.Registry.INSTANCE.getEPackage(TargetASTPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTargetASTPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TargetASTPackageImpl theTargetASTPackage = registeredTargetASTPackage instanceof TargetASTPackageImpl ? (TargetASTPackageImpl)registeredTargetASTPackage : new TargetASTPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theTargetASTPackage.createPackageContents();

		// Initialize created meta-data
		theTargetASTPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTargetASTPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TargetASTPackage.eNS_URI, theTargetASTPackage);
		return theTargetASTPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetASTRoot() {
		return targetASTRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetASTRoot_Expression() {
		return (EReference)targetASTRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT_BinaryExp() {
		return t_BinaryExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getT_BinaryExp_LeftOperand() {
		return (EReference)t_BinaryExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getT_BinaryExp_RightOperand() {
		return (EReference)t_BinaryExpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT_BinaryExp_Operator() {
		return (EAttribute)t_BinaryExpEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT_Get() {
		return t_GetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT_Get_Features() {
		return (EAttribute)t_GetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT_Get_ObjectIsParam() {
		return (EAttribute)t_GetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT_Get_Postfix() {
		return (EAttribute)t_GetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT_Set() {
		return t_SetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT_Set_Features() {
		return (EAttribute)t_SetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT_Set_ObjectIsParam() {
		return (EAttribute)t_SetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getT_Set_Value() {
		return (EReference)t_SetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT_ExtCall() {
		return t_ExtCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getT_ExtCall_Arguments() {
		return (EReference)t_ExtCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT_ExtCall_MethodName() {
		return (EAttribute)t_ExtCallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT_ExtCall_StringLiteral() {
		return (EAttribute)t_ExtCallEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT_ExtCall_TypeArguments() {
		return (EAttribute)t_ExtCallEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT_ExpLevelB() {
		return t_ExpLevelBEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT_ExpLevelB_TypeObject() {
		return (EAttribute)t_ExpLevelBEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT_Literal() {
		return t_LiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT_Literal_Value() {
		return (EAttribute)t_LiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT_ExpLevelA() {
		return t_ExpLevelAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT_ExpLevelA_CastTo() {
		return (EAttribute)t_ExpLevelAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT_ExpLevelA_CastToPrimitiveMethodCall() {
		return (EAttribute)t_ExpLevelAEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT_ExpLevelA_CastToPrimitive() {
		return (EAttribute)t_ExpLevelAEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getT_ExpLevelA_Object() {
		return (EReference)t_ExpLevelAEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT_ExpLevelA_PrimitiveToWrapper() {
		return (EAttribute)t_ExpLevelAEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT_ExpLevelA_Code() {
		return (EAttribute)t_ExpLevelAEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT_InstanceOfExp() {
		return t_InstanceOfExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getT_InstanceOfExp_Expression() {
		return (EReference)t_InstanceOfExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT_InstanceOfExp_TypeIsExternal() {
		return (EAttribute)t_InstanceOfExpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT_InstanceOfExp_Type() {
		return (EAttribute)t_InstanceOfExpEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT_UnaryExp() {
		return t_UnaryExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT_UnaryExp_Operator() {
		return (EAttribute)t_UnaryExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT_CreateInstanceExp() {
		return t_CreateInstanceExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT_CreateInstanceExp_TypeQualifiedName() {
		return (EAttribute)t_CreateInstanceExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT_PrintExp() {
		return t_PrintExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getT_PrintExp_Expression() {
		return (EReference)t_PrintExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT_GetInstancesOfExp() {
		return t_GetInstancesOfExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getT_GetInstancesOfExp_Expression() {
		return (EReference)t_GetInstancesOfExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT_GetInstancesOfExp_ClassName() {
		return (EAttribute)t_GetInstancesOfExpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT_SetReturn() {
		return t_SetReturnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getT_SetReturn_Expression() {
		return (EReference)t_SetReturnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT_ExtConstructor() {
		return t_ExtConstructorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getT_ExtConstructor_Arguments() {
		return (EReference)t_ExtConstructorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT_ExtConstructor_TypeQualifiedName() {
		return (EAttribute)t_ExtConstructorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT_ExtType() {
		return t_ExtTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT_ExtType_NewAttribute() {
		return (EAttribute)t_ExtTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT_ExtAttrCall() {
		return t_ExtAttrCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT_ExtAttrCall_AttributeName() {
		return (EAttribute)t_ExtAttrCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT_OpCall() {
		return t_OpCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT_OpCall_VarNamesForReturn() {
		return (EAttribute)t_OpCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT_OpCall_OperationName() {
		return (EAttribute)t_OpCallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getT_OpCall_Arguments() {
		return (EReference)t_OpCallEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT_OpCall_HasINOUT() {
		return (EAttribute)t_OpCallEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT_OpCall_LastFeaturesName() {
		return (EAttribute)t_OpCallEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT_OpCall_Postfix() {
		return (EAttribute)t_OpCallEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT_OpCall_IsINOUT() {
		return (EAttribute)t_OpCallEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT_OpCall_Param() {
		return (EAttribute)t_OpCallEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT_OpCall_TypeForMultiInheritance() {
		return (EAttribute)t_OpCallEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT_OpCall_QualifiedNameOperation()
	{
		return (EAttribute)t_OpCallEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT_ColorDFA() {
		return t_ColorDFAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getT_ColorDFA_Id() {
		return (EReference)t_ColorDFAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT_GetInstances() {
		return t_GetInstancesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getT_GetInstances_Parameter() {
		return (EReference)t_GetInstancesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT_CountFinalStates() {
		return t_CountFinalStatesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getT_CountFinalStates_Parameter() {
		return (EReference)t_CountFinalStatesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT_CountInitialStates() {
		return t_CountInitialStatesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getT_CountInitialStates_Parameter() {
		return (EReference)t_CountInitialStatesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT_CountStates() {
		return t_CountStatesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getT_CountStates_Parameter() {
		return (EReference)t_CountStatesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT_SetAbsoluteNodePropability() {
		return t_SetAbsoluteNodePropabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getT_SetAbsoluteNodePropability_Parameter() {
		return (EReference)t_SetAbsoluteNodePropabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT_CountReachableStates() {
		return t_CountReachableStatesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getT_CountReachableStates_Parameter() {
		return (EReference)t_CountReachableStatesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT_CountInValidTransitions() {
		return t_CountInValidTransitionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getT_CountInValidTransitions_Parameter() {
		return (EReference)t_CountInValidTransitionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT_SetPopulationSize() {
		return t_SetPopulationSizeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getT_SetPopulationSize_Parameter() {
		return (EReference)t_SetPopulationSizeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT_GetLayerInformation() {
		return t_GetLayerInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getT_GetLayerInformation_Parameter() {
		return (EReference)t_GetLayerInformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT_GetObjectManagement() {
		return t_GetObjectManagementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getT_GetObjectManagement_Parameter() {
		return (EReference)t_GetObjectManagementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT_LoadModel()
	{
		return t_LoadModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getT_LoadModel_RelModelPath()
	{
		return (EReference)t_LoadModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT_GetEnumLiteral()
	{
		return t_GetEnumLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT_GetEnumLiteral_QualifiedEnumName()
	{
		return (EAttribute)t_GetEnumLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT_GetEnumLiteral_LiteralName()
	{
		return (EAttribute)t_GetEnumLiteralEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT_DesEventQueuePeek()
	{
		return t_DesEventQueuePeekEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getT_DesEventQueuePeek_Arguments()
	{
		return (EReference)t_DesEventQueuePeekEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT_DesEventQueueConsume()
	{
		return t_DesEventQueueConsumeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getT_DesEventQueueConsume_Arguments()
	{
		return (EReference)t_DesEventQueueConsumeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT_DesQueuePeek() {
		return t_DesQueuePeekEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getT_DesQueuePeek_Arguments() {
		return (EReference)t_DesQueuePeekEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT_DesQueueConsume() {
		return t_DesQueueConsumeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getT_DesQueueConsume_Arguments() {
		return (EReference)t_DesQueueConsumeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT_Type() {
		return t_TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT_Type_Type() {
		return (EAttribute)t_TypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT_TimeStep() {
		return t_TimeStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT_ObserverAddValue() {
		return t_ObserverAddValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getT_ObserverAddValue_Parameter() {
		return (EReference)t_ObserverAddValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getT_GetInstanceForStaticAccess() {
		return t_GetInstanceForStaticAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getT_GetInstanceForStaticAccess_QualifiedClassName() {
		return (EAttribute)t_GetInstanceForStaticAccessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetASTFactory getTargetASTFactory() {
		return (TargetASTFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		targetASTRootEClass = createEClass(TARGET_AST_ROOT);
		createEReference(targetASTRootEClass, TARGET_AST_ROOT__EXPRESSION);

		t_BinaryExpEClass = createEClass(TBINARY_EXP);
		createEReference(t_BinaryExpEClass, TBINARY_EXP__LEFT_OPERAND);
		createEReference(t_BinaryExpEClass, TBINARY_EXP__RIGHT_OPERAND);
		createEAttribute(t_BinaryExpEClass, TBINARY_EXP__OPERATOR);

		t_GetEClass = createEClass(TGET);
		createEAttribute(t_GetEClass, TGET__FEATURES);
		createEAttribute(t_GetEClass, TGET__OBJECT_IS_PARAM);
		createEAttribute(t_GetEClass, TGET__POSTFIX);

		t_SetEClass = createEClass(TSET);
		createEAttribute(t_SetEClass, TSET__FEATURES);
		createEAttribute(t_SetEClass, TSET__OBJECT_IS_PARAM);
		createEReference(t_SetEClass, TSET__VALUE);

		t_ExtCallEClass = createEClass(TEXT_CALL);
		createEReference(t_ExtCallEClass, TEXT_CALL__ARGUMENTS);
		createEAttribute(t_ExtCallEClass, TEXT_CALL__METHOD_NAME);
		createEAttribute(t_ExtCallEClass, TEXT_CALL__STRING_LITERAL);
		createEAttribute(t_ExtCallEClass, TEXT_CALL__TYPE_ARGUMENTS);

		t_ExpLevelBEClass = createEClass(TEXP_LEVEL_B);
		createEAttribute(t_ExpLevelBEClass, TEXP_LEVEL_B__TYPE_OBJECT);

		t_LiteralEClass = createEClass(TLITERAL);
		createEAttribute(t_LiteralEClass, TLITERAL__VALUE);

		t_ExpLevelAEClass = createEClass(TEXP_LEVEL_A);
		createEAttribute(t_ExpLevelAEClass, TEXP_LEVEL_A__CAST_TO);
		createEAttribute(t_ExpLevelAEClass, TEXP_LEVEL_A__CAST_TO_PRIMITIVE_METHOD_CALL);
		createEAttribute(t_ExpLevelAEClass, TEXP_LEVEL_A__CAST_TO_PRIMITIVE);
		createEReference(t_ExpLevelAEClass, TEXP_LEVEL_A__OBJECT);
		createEAttribute(t_ExpLevelAEClass, TEXP_LEVEL_A__PRIMITIVE_TO_WRAPPER);
		createEAttribute(t_ExpLevelAEClass, TEXP_LEVEL_A__CODE);

		t_InstanceOfExpEClass = createEClass(TINSTANCE_OF_EXP);
		createEReference(t_InstanceOfExpEClass, TINSTANCE_OF_EXP__EXPRESSION);
		createEAttribute(t_InstanceOfExpEClass, TINSTANCE_OF_EXP__TYPE_IS_EXTERNAL);
		createEAttribute(t_InstanceOfExpEClass, TINSTANCE_OF_EXP__TYPE);

		t_UnaryExpEClass = createEClass(TUNARY_EXP);
		createEAttribute(t_UnaryExpEClass, TUNARY_EXP__OPERATOR);

		t_CreateInstanceExpEClass = createEClass(TCREATE_INSTANCE_EXP);
		createEAttribute(t_CreateInstanceExpEClass, TCREATE_INSTANCE_EXP__TYPE_QUALIFIED_NAME);

		t_PrintExpEClass = createEClass(TPRINT_EXP);
		createEReference(t_PrintExpEClass, TPRINT_EXP__EXPRESSION);

		t_GetInstancesOfExpEClass = createEClass(TGET_INSTANCES_OF_EXP);
		createEReference(t_GetInstancesOfExpEClass, TGET_INSTANCES_OF_EXP__EXPRESSION);
		createEAttribute(t_GetInstancesOfExpEClass, TGET_INSTANCES_OF_EXP__CLASS_NAME);

		t_SetReturnEClass = createEClass(TSET_RETURN);
		createEReference(t_SetReturnEClass, TSET_RETURN__EXPRESSION);

		t_ExtConstructorEClass = createEClass(TEXT_CONSTRUCTOR);
		createEReference(t_ExtConstructorEClass, TEXT_CONSTRUCTOR__ARGUMENTS);
		createEAttribute(t_ExtConstructorEClass, TEXT_CONSTRUCTOR__TYPE_QUALIFIED_NAME);

		t_ExtTypeEClass = createEClass(TEXT_TYPE);
		createEAttribute(t_ExtTypeEClass, TEXT_TYPE__NEW_ATTRIBUTE);

		t_ExtAttrCallEClass = createEClass(TEXT_ATTR_CALL);
		createEAttribute(t_ExtAttrCallEClass, TEXT_ATTR_CALL__ATTRIBUTE_NAME);

		t_OpCallEClass = createEClass(TOP_CALL);
		createEAttribute(t_OpCallEClass, TOP_CALL__VAR_NAMES_FOR_RETURN);
		createEAttribute(t_OpCallEClass, TOP_CALL__OPERATION_NAME);
		createEReference(t_OpCallEClass, TOP_CALL__ARGUMENTS);
		createEAttribute(t_OpCallEClass, TOP_CALL__HAS_INOUT);
		createEAttribute(t_OpCallEClass, TOP_CALL__LAST_FEATURES_NAME);
		createEAttribute(t_OpCallEClass, TOP_CALL__POSTFIX);
		createEAttribute(t_OpCallEClass, TOP_CALL__IS_INOUT);
		createEAttribute(t_OpCallEClass, TOP_CALL__PARAM);
		createEAttribute(t_OpCallEClass, TOP_CALL__TYPE_FOR_MULTI_INHERITANCE);
		createEAttribute(t_OpCallEClass, TOP_CALL__QUALIFIED_NAME_OPERATION);

		t_ColorDFAEClass = createEClass(TCOLOR_DFA);
		createEReference(t_ColorDFAEClass, TCOLOR_DFA__ID);

		t_GetInstancesEClass = createEClass(TGET_INSTANCES);
		createEReference(t_GetInstancesEClass, TGET_INSTANCES__PARAMETER);

		t_CountFinalStatesEClass = createEClass(TCOUNT_FINAL_STATES);
		createEReference(t_CountFinalStatesEClass, TCOUNT_FINAL_STATES__PARAMETER);

		t_CountInitialStatesEClass = createEClass(TCOUNT_INITIAL_STATES);
		createEReference(t_CountInitialStatesEClass, TCOUNT_INITIAL_STATES__PARAMETER);

		t_CountStatesEClass = createEClass(TCOUNT_STATES);
		createEReference(t_CountStatesEClass, TCOUNT_STATES__PARAMETER);

		t_SetAbsoluteNodePropabilityEClass = createEClass(TSET_ABSOLUTE_NODE_PROPABILITY);
		createEReference(t_SetAbsoluteNodePropabilityEClass, TSET_ABSOLUTE_NODE_PROPABILITY__PARAMETER);

		t_CountReachableStatesEClass = createEClass(TCOUNT_REACHABLE_STATES);
		createEReference(t_CountReachableStatesEClass, TCOUNT_REACHABLE_STATES__PARAMETER);

		t_CountInValidTransitionsEClass = createEClass(TCOUNT_IN_VALID_TRANSITIONS);
		createEReference(t_CountInValidTransitionsEClass, TCOUNT_IN_VALID_TRANSITIONS__PARAMETER);

		t_SetPopulationSizeEClass = createEClass(TSET_POPULATION_SIZE);
		createEReference(t_SetPopulationSizeEClass, TSET_POPULATION_SIZE__PARAMETER);

		t_GetLayerInformationEClass = createEClass(TGET_LAYER_INFORMATION);
		createEReference(t_GetLayerInformationEClass, TGET_LAYER_INFORMATION__PARAMETER);

		t_GetObjectManagementEClass = createEClass(TGET_OBJECT_MANAGEMENT);
		createEReference(t_GetObjectManagementEClass, TGET_OBJECT_MANAGEMENT__PARAMETER);

		t_LoadModelEClass = createEClass(TLOAD_MODEL);
		createEReference(t_LoadModelEClass, TLOAD_MODEL__REL_MODEL_PATH);

		t_GetEnumLiteralEClass = createEClass(TGET_ENUM_LITERAL);
		createEAttribute(t_GetEnumLiteralEClass, TGET_ENUM_LITERAL__QUALIFIED_ENUM_NAME);
		createEAttribute(t_GetEnumLiteralEClass, TGET_ENUM_LITERAL__LITERAL_NAME);

		t_DesEventQueuePeekEClass = createEClass(TDES_EVENT_QUEUE_PEEK);
		createEReference(t_DesEventQueuePeekEClass, TDES_EVENT_QUEUE_PEEK__ARGUMENTS);

		t_DesEventQueueConsumeEClass = createEClass(TDES_EVENT_QUEUE_CONSUME);
		createEReference(t_DesEventQueueConsumeEClass, TDES_EVENT_QUEUE_CONSUME__ARGUMENTS);

		t_DesQueuePeekEClass = createEClass(TDES_QUEUE_PEEK);
		createEReference(t_DesQueuePeekEClass, TDES_QUEUE_PEEK__ARGUMENTS);

		t_DesQueueConsumeEClass = createEClass(TDES_QUEUE_CONSUME);
		createEReference(t_DesQueueConsumeEClass, TDES_QUEUE_CONSUME__ARGUMENTS);

		t_TypeEClass = createEClass(TTYPE);
		createEAttribute(t_TypeEClass, TTYPE__TYPE);

		t_TimeStepEClass = createEClass(TTIME_STEP);

		t_ObserverAddValueEClass = createEClass(TOBSERVER_ADD_VALUE);
		createEReference(t_ObserverAddValueEClass, TOBSERVER_ADD_VALUE__PARAMETER);

		t_GetInstanceForStaticAccessEClass = createEClass(TGET_INSTANCE_FOR_STATIC_ACCESS);
		createEAttribute(t_GetInstanceForStaticAccessEClass, TGET_INSTANCE_FOR_STATIC_ACCESS__QUALIFIED_CLASS_NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		targetASTRootEClass.getESuperTypes().add(this.getT_ExpLevelA());
		t_BinaryExpEClass.getESuperTypes().add(this.getT_ExpLevelA());
		t_GetEClass.getESuperTypes().add(this.getT_ExpLevelB());
		t_SetEClass.getESuperTypes().add(this.getT_ExpLevelB());
		t_ExtCallEClass.getESuperTypes().add(this.getT_ExpLevelB());
		t_ExpLevelBEClass.getESuperTypes().add(this.getT_ExpLevelA());
		t_LiteralEClass.getESuperTypes().add(this.getT_ExpLevelA());
		t_InstanceOfExpEClass.getESuperTypes().add(this.getT_ExpLevelA());
		t_UnaryExpEClass.getESuperTypes().add(this.getT_ExpLevelB());
		t_CreateInstanceExpEClass.getESuperTypes().add(this.getT_ExpLevelA());
		t_PrintExpEClass.getESuperTypes().add(this.getT_ExpLevelA());
		t_GetInstancesOfExpEClass.getESuperTypes().add(this.getT_ExpLevelA());
		t_SetReturnEClass.getESuperTypes().add(this.getT_ExpLevelA());
		t_ExtConstructorEClass.getESuperTypes().add(this.getT_ExpLevelA());
		t_ExtTypeEClass.getESuperTypes().add(this.getT_ExpLevelB());
		t_ExtAttrCallEClass.getESuperTypes().add(this.getT_ExpLevelA());
		t_OpCallEClass.getESuperTypes().add(this.getT_ExpLevelA());
		t_ColorDFAEClass.getESuperTypes().add(this.getT_ExpLevelA());
		t_GetInstancesEClass.getESuperTypes().add(this.getT_ExpLevelA());
		t_CountFinalStatesEClass.getESuperTypes().add(this.getT_ExpLevelA());
		t_CountInitialStatesEClass.getESuperTypes().add(this.getT_ExpLevelA());
		t_CountStatesEClass.getESuperTypes().add(this.getT_ExpLevelA());
		t_SetAbsoluteNodePropabilityEClass.getESuperTypes().add(this.getT_ExpLevelA());
		t_CountReachableStatesEClass.getESuperTypes().add(this.getT_ExpLevelA());
		t_CountInValidTransitionsEClass.getESuperTypes().add(this.getT_ExpLevelA());
		t_SetPopulationSizeEClass.getESuperTypes().add(this.getT_ExpLevelA());
		t_GetLayerInformationEClass.getESuperTypes().add(this.getT_ExpLevelA());
		t_GetObjectManagementEClass.getESuperTypes().add(this.getT_ExpLevelA());
		t_LoadModelEClass.getESuperTypes().add(this.getT_ExpLevelA());
		t_GetEnumLiteralEClass.getESuperTypes().add(this.getT_ExpLevelA());
		t_DesEventQueuePeekEClass.getESuperTypes().add(this.getT_ExpLevelA());
		t_DesEventQueueConsumeEClass.getESuperTypes().add(this.getT_ExpLevelA());
		t_DesQueuePeekEClass.getESuperTypes().add(this.getT_ExpLevelA());
		t_DesQueueConsumeEClass.getESuperTypes().add(this.getT_ExpLevelA());
		t_TypeEClass.getESuperTypes().add(this.getT_ExpLevelA());
		t_TimeStepEClass.getESuperTypes().add(this.getT_ExpLevelA());
		t_ObserverAddValueEClass.getESuperTypes().add(this.getT_ExpLevelA());
		t_GetInstanceForStaticAccessEClass.getESuperTypes().add(this.getT_ExpLevelB());

		// Initialize classes, features, and operations; add parameters
		initEClass(targetASTRootEClass, TargetASTRoot.class, "TargetASTRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTargetASTRoot_Expression(), this.getT_ExpLevelA(), null, "expression", null, 1, 1, TargetASTRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(t_BinaryExpEClass, T_BinaryExp.class, "T_BinaryExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getT_BinaryExp_LeftOperand(), this.getT_ExpLevelA(), null, "leftOperand", null, 1, 1, T_BinaryExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getT_BinaryExp_RightOperand(), this.getT_ExpLevelA(), null, "rightOperand", null, 1, 1, T_BinaryExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getT_BinaryExp_Operator(), ecorePackage.getEString(), "operator", null, 1, 1, T_BinaryExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(t_GetEClass, T_Get.class, "T_Get", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getT_Get_Features(), ecorePackage.getEString(), "features", null, 1, -1, T_Get.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getT_Get_ObjectIsParam(), ecorePackage.getEBoolean(), "objectIsParam", null, 0, 1, T_Get.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getT_Get_Postfix(), ecorePackage.getEString(), "postfix", "", 0, 1, T_Get.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(t_SetEClass, T_Set.class, "T_Set", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getT_Set_Features(), ecorePackage.getEString(), "features", null, 1, -1, T_Set.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getT_Set_ObjectIsParam(), ecorePackage.getEBoolean(), "objectIsParam", null, 0, 1, T_Set.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getT_Set_Value(), this.getT_ExpLevelA(), null, "value", null, 1, 1, T_Set.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(t_ExtCallEClass, T_ExtCall.class, "T_ExtCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getT_ExtCall_Arguments(), this.getT_ExpLevelA(), null, "arguments", null, 0, -1, T_ExtCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getT_ExtCall_MethodName(), ecorePackage.getEString(), "methodName", null, 1, 1, T_ExtCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getT_ExtCall_StringLiteral(), ecorePackage.getEString(), "stringLiteral", null, 0, 1, T_ExtCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getT_ExtCall_TypeArguments(), ecorePackage.getEString(), "typeArguments", null, 0, -1, T_ExtCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(t_ExpLevelBEClass, T_ExpLevelB.class, "T_ExpLevelB", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getT_ExpLevelB_TypeObject(), ecorePackage.getEString(), "typeObject", null, 0, 1, T_ExpLevelB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(t_LiteralEClass, T_Literal.class, "T_Literal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getT_Literal_Value(), ecorePackage.getEString(), "value", null, 0, 1, T_Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(t_ExpLevelAEClass, T_ExpLevelA.class, "T_ExpLevelA", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getT_ExpLevelA_CastTo(), ecorePackage.getEString(), "castTo", null, 0, 1, T_ExpLevelA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getT_ExpLevelA_CastToPrimitiveMethodCall(), ecorePackage.getEString(), "castToPrimitiveMethodCall", null, 0, 1, T_ExpLevelA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getT_ExpLevelA_CastToPrimitive(), ecorePackage.getEBoolean(), "castToPrimitive", null, 0, 1, T_ExpLevelA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getT_ExpLevelA_Object(), this.getT_ExpLevelA(), null, "object", null, 0, 1, T_ExpLevelA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getT_ExpLevelA_PrimitiveToWrapper(), ecorePackage.getEString(), "primitiveToWrapper", null, 0, 1, T_ExpLevelA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getT_ExpLevelA_Code(), ecorePackage.getEString(), "Code", null, 0, 1, T_ExpLevelA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(t_InstanceOfExpEClass, T_InstanceOfExp.class, "T_InstanceOfExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getT_InstanceOfExp_Expression(), this.getT_ExpLevelA(), null, "expression", null, 1, 1, T_InstanceOfExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getT_InstanceOfExp_TypeIsExternal(), ecorePackage.getEBoolean(), "typeIsExternal", null, 0, 1, T_InstanceOfExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getT_InstanceOfExp_Type(), ecorePackage.getEString(), "type", null, 0, 1, T_InstanceOfExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(t_UnaryExpEClass, T_UnaryExp.class, "T_UnaryExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getT_UnaryExp_Operator(), ecorePackage.getEString(), "Operator", null, 1, 1, T_UnaryExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(t_CreateInstanceExpEClass, T_CreateInstanceExp.class, "T_CreateInstanceExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getT_CreateInstanceExp_TypeQualifiedName(), ecorePackage.getEString(), "typeQualifiedName", null, 0, 1, T_CreateInstanceExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(t_PrintExpEClass, T_PrintExp.class, "T_PrintExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getT_PrintExp_Expression(), this.getT_ExpLevelA(), null, "expression", null, 0, 1, T_PrintExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(t_GetInstancesOfExpEClass, T_GetInstancesOfExp.class, "T_GetInstancesOfExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getT_GetInstancesOfExp_Expression(), this.getT_ExpLevelA(), null, "expression", null, 0, 1, T_GetInstancesOfExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getT_GetInstancesOfExp_ClassName(), ecorePackage.getEString(), "className", null, 0, 1, T_GetInstancesOfExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(t_SetReturnEClass, T_SetReturn.class, "T_SetReturn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getT_SetReturn_Expression(), this.getT_ExpLevelA(), null, "expression", null, 0, 1, T_SetReturn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(t_ExtConstructorEClass, T_ExtConstructor.class, "T_ExtConstructor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getT_ExtConstructor_Arguments(), this.getT_ExpLevelA(), null, "arguments", null, 0, -1, T_ExtConstructor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getT_ExtConstructor_TypeQualifiedName(), ecorePackage.getEString(), "typeQualifiedName", null, 0, 1, T_ExtConstructor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(t_ExtTypeEClass, T_ExtType.class, "T_ExtType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getT_ExtType_NewAttribute(), ecorePackage.getEString(), "newAttribute", null, 0, 1, T_ExtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(t_ExtAttrCallEClass, T_ExtAttrCall.class, "T_ExtAttrCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getT_ExtAttrCall_AttributeName(), ecorePackage.getEString(), "attributeName", null, 0, 1, T_ExtAttrCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(t_OpCallEClass, T_OpCall.class, "T_OpCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getT_OpCall_VarNamesForReturn(), ecorePackage.getEString(), "varNamesForReturn", null, 0, 1, T_OpCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getT_OpCall_OperationName(), ecorePackage.getEString(), "operationName", null, 0, 1, T_OpCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getT_OpCall_Arguments(), this.getT_ExpLevelA(), null, "arguments", null, 0, -1, T_OpCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getT_OpCall_HasINOUT(), ecorePackage.getEBoolean(), "hasINOUT", "false", 0, 1, T_OpCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getT_OpCall_LastFeaturesName(), ecorePackage.getEString(), "lastFeaturesName", null, 0, -1, T_OpCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getT_OpCall_Postfix(), ecorePackage.getEString(), "postfix", null, 0, -1, T_OpCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getT_OpCall_IsINOUT(), ecorePackage.getEBoolean(), "isINOUT", null, 0, -1, T_OpCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getT_OpCall_Param(), ecorePackage.getEBoolean(), "param", "false", 0, 1, T_OpCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getT_OpCall_TypeForMultiInheritance(), ecorePackage.getEString(), "typeForMultiInheritance", null, 0, 1, T_OpCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getT_OpCall_QualifiedNameOperation(), ecorePackage.getEString(), "qualifiedNameOperation", null, 0, 1, T_OpCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(t_ColorDFAEClass, T_ColorDFA.class, "T_ColorDFA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getT_ColorDFA_Id(), this.getT_ExpLevelA(), null, "id", null, 0, 1, T_ColorDFA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(t_GetInstancesEClass, T_GetInstances.class, "T_GetInstances", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getT_GetInstances_Parameter(), this.getT_ExpLevelA(), null, "parameter", null, 0, -1, T_GetInstances.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(t_CountFinalStatesEClass, T_CountFinalStates.class, "T_CountFinalStates", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getT_CountFinalStates_Parameter(), this.getT_ExpLevelA(), null, "parameter", null, 0, -1, T_CountFinalStates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(t_CountInitialStatesEClass, T_CountInitialStates.class, "T_CountInitialStates", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getT_CountInitialStates_Parameter(), this.getT_ExpLevelA(), null, "parameter", null, 0, -1, T_CountInitialStates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(t_CountStatesEClass, T_CountStates.class, "T_CountStates", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getT_CountStates_Parameter(), this.getT_ExpLevelA(), null, "parameter", null, 0, -1, T_CountStates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(t_SetAbsoluteNodePropabilityEClass, T_SetAbsoluteNodePropability.class, "T_SetAbsoluteNodePropability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getT_SetAbsoluteNodePropability_Parameter(), this.getT_ExpLevelA(), null, "parameter", null, 0, -1, T_SetAbsoluteNodePropability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(t_CountReachableStatesEClass, T_CountReachableStates.class, "T_CountReachableStates", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getT_CountReachableStates_Parameter(), this.getT_ExpLevelA(), null, "parameter", null, 0, -1, T_CountReachableStates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(t_CountInValidTransitionsEClass, T_CountInValidTransitions.class, "T_CountInValidTransitions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getT_CountInValidTransitions_Parameter(), this.getT_ExpLevelA(), null, "parameter", null, 0, -1, T_CountInValidTransitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(t_SetPopulationSizeEClass, T_SetPopulationSize.class, "T_SetPopulationSize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getT_SetPopulationSize_Parameter(), this.getT_ExpLevelA(), null, "parameter", null, 0, -1, T_SetPopulationSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(t_GetLayerInformationEClass, T_GetLayerInformation.class, "T_GetLayerInformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getT_GetLayerInformation_Parameter(), this.getT_ExpLevelA(), null, "parameter", null, 0, -1, T_GetLayerInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(t_GetObjectManagementEClass, T_GetObjectManagement.class, "T_GetObjectManagement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getT_GetObjectManagement_Parameter(), this.getT_ExpLevelA(), null, "parameter", null, 0, -1, T_GetObjectManagement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(t_LoadModelEClass, T_LoadModel.class, "T_LoadModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getT_LoadModel_RelModelPath(), this.getT_ExpLevelA(), null, "relModelPath", null, 0, 1, T_LoadModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(t_GetEnumLiteralEClass, T_GetEnumLiteral.class, "T_GetEnumLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getT_GetEnumLiteral_QualifiedEnumName(), ecorePackage.getEString(), "qualifiedEnumName", null, 0, 1, T_GetEnumLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getT_GetEnumLiteral_LiteralName(), ecorePackage.getEString(), "literalName", null, 0, 1, T_GetEnumLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(t_DesEventQueuePeekEClass, T_DesEventQueuePeek.class, "T_DesEventQueuePeek", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getT_DesEventQueuePeek_Arguments(), this.getT_ExpLevelA(), null, "arguments", null, 0, -1, T_DesEventQueuePeek.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(t_DesEventQueueConsumeEClass, T_DesEventQueueConsume.class, "T_DesEventQueueConsume", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getT_DesEventQueueConsume_Arguments(), this.getT_ExpLevelA(), null, "arguments", null, 0, -1, T_DesEventQueueConsume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(t_DesQueuePeekEClass, T_DesQueuePeek.class, "T_DesQueuePeek", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getT_DesQueuePeek_Arguments(), this.getT_ExpLevelA(), null, "arguments", null, 0, -1, T_DesQueuePeek.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(t_DesQueueConsumeEClass, T_DesQueueConsume.class, "T_DesQueueConsume", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getT_DesQueueConsume_Arguments(), this.getT_ExpLevelA(), null, "arguments", null, 0, -1, T_DesQueueConsume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(t_TypeEClass, T_Type.class, "T_Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getT_Type_Type(), ecorePackage.getEString(), "type", null, 0, 1, T_Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(t_TimeStepEClass, T_TimeStep.class, "T_TimeStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(t_ObserverAddValueEClass, T_ObserverAddValue.class, "T_ObserverAddValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getT_ObserverAddValue_Parameter(), this.getT_ExpLevelA(), null, "parameter", null, 0, -1, T_ObserverAddValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(t_GetInstanceForStaticAccessEClass, T_GetInstanceForStaticAccess.class, "T_GetInstanceForStaticAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getT_GetInstanceForStaticAccess_QualifiedClassName(), ecorePackage.getEString(), "qualifiedClassName", null, 0, 1, T_GetInstanceForStaticAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //TargetASTPackageImpl
