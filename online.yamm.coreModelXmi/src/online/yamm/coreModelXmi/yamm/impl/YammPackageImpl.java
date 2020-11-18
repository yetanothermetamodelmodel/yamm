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
/**
 */
package online.yamm.coreModelXmi.yamm.impl;

import java.util.Map;
import online.yamm.coreModelXmi.yamm.ContainmentInfo;
import online.yamm.coreModelXmi.yamm.DslInfo;
import online.yamm.coreModelXmi.yamm.EffectInfo;
import online.yamm.coreModelXmi.yamm.ExecutionPhase;
import online.yamm.coreModelXmi.yamm.FeatureInfo;
import online.yamm.coreModelXmi.yamm.GuardInfo;
import online.yamm.coreModelXmi.yamm.Line;
import online.yamm.coreModelXmi.yamm.SingleLinePropertyInfo;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.xtext.common.types.TypesPackage;
import org.eclipse.xtext.xbase.XbasePackage;

import online.yamm.coreModelXmi.yamm.YAggregationKind;
import online.yamm.coreModelXmi.yamm.YClass;
import online.yamm.coreModelXmi.yamm.YClassifier;
import online.yamm.coreModelXmi.yamm.YColorDFAObject;
import online.yamm.coreModelXmi.yamm.YComment;
import online.yamm.coreModelXmi.yamm.YCompositeEdge;
import online.yamm.coreModelXmi.yamm.YConstraint;
import online.yamm.coreModelXmi.yamm.YCountFinalStates;
import online.yamm.coreModelXmi.yamm.YCountInValidTransitions;
import online.yamm.coreModelXmi.yamm.YCountInitialStates;
import online.yamm.coreModelXmi.yamm.YCountReachableStates;
import online.yamm.coreModelXmi.yamm.YCountStates;
import online.yamm.coreModelXmi.yamm.YCreateInstanceExpression;
import online.yamm.coreModelXmi.yamm.YDataType;
import online.yamm.coreModelXmi.yamm.YEffect;
import online.yamm.coreModelXmi.yamm.YElement;
import online.yamm.coreModelXmi.yamm.YElementImport;
import online.yamm.coreModelXmi.yamm.YEnumeration;
import online.yamm.coreModelXmi.yamm.YEnumerationLiteral;
import online.yamm.coreModelXmi.yamm.YFeature;
import online.yamm.coreModelXmi.yamm.YFeatureCall;
import online.yamm.coreModelXmi.yamm.YFinalState;
import online.yamm.coreModelXmi.yamm.YGetInstances;
import online.yamm.coreModelXmi.yamm.YGetInstancesOfExpression;
import online.yamm.coreModelXmi.yamm.YGetLayerInformation;
import online.yamm.coreModelXmi.yamm.YGetObjectManagement;
import online.yamm.coreModelXmi.yamm.YGlobalStateMachine;
import online.yamm.coreModelXmi.yamm.YInternal;
import online.yamm.coreModelXmi.yamm.YLoadModel;
import online.yamm.coreModelXmi.yamm.YMemberFeatureCall;
import online.yamm.coreModelXmi.yamm.YModel;
import online.yamm.coreModelXmi.yamm.YNamedElement;
import online.yamm.coreModelXmi.yamm.YNamespace;
import online.yamm.coreModelXmi.yamm.YObject;
import online.yamm.coreModelXmi.yamm.YObserverAddValue;
import online.yamm.coreModelXmi.yamm.YOperation;
import online.yamm.coreModelXmi.yamm.YPackage;
import online.yamm.coreModelXmi.yamm.YPackageImport;
import online.yamm.coreModelXmi.yamm.YPackageableElement;
import online.yamm.coreModelXmi.yamm.YParameter;
import online.yamm.coreModelXmi.yamm.YParameterDirectionKind;
import online.yamm.coreModelXmi.yamm.YPrimitiveType;
import online.yamm.coreModelXmi.yamm.YPrintExpression;
import online.yamm.coreModelXmi.yamm.YProperty;
import online.yamm.coreModelXmi.yamm.YPseudostate;
import online.yamm.coreModelXmi.yamm.YRunToCompletion;
import online.yamm.coreModelXmi.yamm.YSetAbsoluteNodePropability;
import online.yamm.coreModelXmi.yamm.YSetPopulationSize;
import online.yamm.coreModelXmi.yamm.YSetReturnValue;
import online.yamm.coreModelXmi.yamm.YSharedEdge;
import online.yamm.coreModelXmi.yamm.YState;
import online.yamm.coreModelXmi.yamm.YStateMachine;
import online.yamm.coreModelXmi.yamm.YStateMachineHandler;
import online.yamm.coreModelXmi.yamm.YStructure;
import online.yamm.coreModelXmi.yamm.YTimeStep;
import online.yamm.coreModelXmi.yamm.YTrAttachment;
import online.yamm.coreModelXmi.yamm.YTransition;
import online.yamm.coreModelXmi.yamm.YType;
import online.yamm.coreModelXmi.yamm.YVertex;
import online.yamm.coreModelXmi.yamm.YVisibilityKind;
import online.yamm.coreModelXmi.yamm.YammFactory;
import online.yamm.coreModelXmi.yamm.YammPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class YammPackageImpl extends EPackageImpl implements YammPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yCommentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yElementImportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yEnumerationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yEnumerationLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yNamedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yNamespaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yPackageableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yPackageImportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yPrimitiveTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yStateMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yTrAttachmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yEffectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yVertexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yPseudostateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yFinalStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ySharedEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yCompositeEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yStateMachineHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yGlobalStateMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yCreateInstanceExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yPrintExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ySetReturnValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yGetInstancesOfExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yMemberFeatureCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yFeatureCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yGetObjectManagementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yGetLayerInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yColorDFAObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yGetInstancesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yCountFinalStatesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yCountInitialStatesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yCountStatesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ySetAbsoluteNodePropabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yCountReachableStatesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yCountInValidTransitionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ySetPopulationSizeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yLoadModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dslInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleLinePropertyInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guardInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass effectInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containmentInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eStructuralFeatureToFeatureInfoMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yInternalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yTimeStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yObserverAddValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum yAggregationKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum yParameterDirectionKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum yRunToCompletionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum executionPhaseEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum yVisibilityKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eString2EDataType = null;

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
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private YammPackageImpl()
	{
		super(eNS_URI, YammFactory.eINSTANCE);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * was not generated!
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public YammPackageImpl(EFactory factory) {
		super(factory);
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
	 * <p>This method is used to initialize {@link YammPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static YammPackage init()
	{
		if (isInited) return (YammPackage)EPackage.Registry.INSTANCE.getEPackage(YammPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredYammPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		YammPackageImpl theYammPackage = registeredYammPackage instanceof YammPackageImpl ? (YammPackageImpl)registeredYammPackage : new YammPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		XbasePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theYammPackage.createPackageContents();

		// Initialize created meta-data
		theYammPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theYammPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(YammPackage.eNS_URI, theYammPackage);
		return theYammPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYClass()
	{
		return yClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYClass_IsAbstract()
	{
		return (EAttribute)yClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYClass_QualifiedName()
	{
		return (EAttribute)yClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYClass_Package()
	{
		return (EReference)yClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYClass_SuperClass()
	{
		return (EReference)yClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYClass_OwnedAttribute()
	{
		return (EReference)yClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYClass_OwnedOperation()
	{
		return (EReference)yClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYClass_InsertLineSuperClass()
	{
		return (EAttribute)yClassEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYClass_InsertLineAttribute()
	{
		return (EAttribute)yClassEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYClass_InsertLineOperation()
	{
		return (EAttribute)yClassEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYClass_PosObjectID()
	{
		return (EReference)yClassEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYClass_PosIsAbstract()
	{
		return (EReference)yClassEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYClass_PosName()
	{
		return (EReference)yClassEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYClass_PosQualifiedName()
	{
		return (EReference)yClassEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYClass_PosPackage()
	{
		return (EReference)yClassEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYClass_ObserveQueue() {
		return (EAttribute)yClassEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYClassifier()
	{
		return yClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYComment()
	{
		return yCommentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYComment_Body()
	{
		return (EAttribute)yCommentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYComment_AnnotatedElement()
	{
		return (EReference)yCommentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYComment_OwnedComment()
	{
		return (EReference)yCommentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYComment_OwnedElement()
	{
		return (EReference)yCommentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYConstraint()
	{
		return yConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYConstraint_QualifiedName()
	{
		return (EAttribute)yConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYConstraint_ConstrainedElement()
	{
		return (EReference)yConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYConstraint_OwnedComment()
	{
		return (EReference)yConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYConstraint_OwnedElement()
	{
		return (EReference)yConstraintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYConstraint_Specification()
	{
		return (EReference)yConstraintEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYDataType()
	{
		return yDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYElement()
	{
		return yElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYElementImport()
	{
		return yElementImportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYElementImport_ImportedElement()
	{
		return (EReference)yElementImportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYElementImport_ImportingNamespace()
	{
		return (EReference)yElementImportEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYElementImport_OwnedComment()
	{
		return (EReference)yElementImportEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYElementImport_OwnedElement()
	{
		return (EReference)yElementImportEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYEnumeration()
	{
		return yEnumerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYEnumeration_IsAbstract()
	{
		return (EAttribute)yEnumerationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYEnumeration_QualifiedName()
	{
		return (EAttribute)yEnumerationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYEnumeration_Member()
	{
		return (EReference)yEnumerationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYEnumeration_ElementImport()
	{
		return (EReference)yEnumerationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYEnumeration_ImportedMember()
	{
		return (EReference)yEnumerationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYEnumeration_PackageImport()
	{
		return (EReference)yEnumerationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYEnumeration_Attribute()
	{
		return (EReference)yEnumerationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYEnumeration_Feature()
	{
		return (EReference)yEnumerationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYEnumeration_General()
	{
		return (EReference)yEnumerationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYEnumeration_InheritedMember()
	{
		return (EReference)yEnumerationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYEnumeration_Package()
	{
		return (EReference)yEnumerationEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYEnumeration_OwnedComment()
	{
		return (EReference)yEnumerationEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYEnumeration_OwnedElement()
	{
		return (EReference)yEnumerationEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYEnumeration_OwnedMember()
	{
		return (EReference)yEnumerationEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYEnumeration_OwnedRule()
	{
		return (EReference)yEnumerationEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYEnumeration_OwnedLiteral()
	{
		return (EReference)yEnumerationEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYEnumeration_PosObjectID()
	{
		return (EReference)yEnumerationEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYEnumeration_PosIsAbstract()
	{
		return (EReference)yEnumerationEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYEnumeration_PosName()
	{
		return (EReference)yEnumerationEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYEnumeration_PosQualifiedName()
	{
		return (EReference)yEnumerationEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYEnumeration_PosPackage()
	{
		return (EReference)yEnumerationEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYEnumeration_InsertLineLiteral()
	{
		return (EAttribute)yEnumerationEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYEnumerationLiteral()
	{
		return yEnumerationLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYEnumerationLiteral_QualifiedName()
	{
		return (EAttribute)yEnumerationLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYEnumerationLiteral_OwnedComment()
	{
		return (EReference)yEnumerationLiteralEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYEnumerationLiteral_OwnedElement()
	{
		return (EReference)yEnumerationLiteralEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYEnumerationLiteral_PosObjectID()
	{
		return (EReference)yEnumerationLiteralEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYEnumerationLiteral_PosName()
	{
		return (EReference)yEnumerationLiteralEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYEnumerationLiteral_PosQualifiedName()
	{
		return (EReference)yEnumerationLiteralEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYFeature()
	{
		return yFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYNamedElement()
	{
		return yNamedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYNamedElement_Name()
	{
		return (EAttribute)yNamedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYNamespace()
	{
		return yNamespaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYOperation()
	{
		return yOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYOperation_QualifiedName()
	{
		return (EAttribute)yOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYOperation_OwnedParameter()
	{
		return (EReference)yOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYOperation_StateMachine()
	{
		return (EReference)yOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYOperation_Clazz()
	{
		return (EReference)yOperationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYOperation_ReturnType()
	{
		return (EReference)yOperationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYOperation_Lower()
	{
		return (EAttribute)yOperationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYOperation_Upper()
	{
		return (EAttribute)yOperationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYOperation_PosObjectID()
	{
		return (EReference)yOperationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYOperation_PosName()
	{
		return (EReference)yOperationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYOperation_PosClazz()
	{
		return (EReference)yOperationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYOperation_PosLower()
	{
		return (EReference)yOperationEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYOperation_PosUpper()
	{
		return (EReference)yOperationEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYOperation_PosStateMachine()
	{
		return (EReference)yOperationEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYOperation_PosReturnType()
	{
		return (EReference)yOperationEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYOperation_InsertLineParameter()
	{
		return (EAttribute)yOperationEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYPackage()
	{
		return yPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYPackage_QualifiedName()
	{
		return (EAttribute)yPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYPackage_Package()
	{
		return (EReference)yPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYPackage_OwnedMemberPackage()
	{
		return (EReference)yPackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYPackage_PosObjectID()
	{
		return (EReference)yPackageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYPackage_PosName()
	{
		return (EReference)yPackageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYPackage_PosQualifiedName()
	{
		return (EReference)yPackageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYPackage_PosPackage()
	{
		return (EReference)yPackageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYPackage_InsertLineMember()
	{
		return (EAttribute)yPackageEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYPackageableElement()
	{
		return yPackageableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYPackageableElement_ParentElement()
	{
		return (EReference)yPackageableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYPackageImport()
	{
		return yPackageImportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYPackageImport_ImportedPackage()
	{
		return (EReference)yPackageImportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYPackageImport_ImportingNamespace()
	{
		return (EReference)yPackageImportEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYPackageImport_OwnedComment()
	{
		return (EReference)yPackageImportEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYPackageImport_OwnedElement()
	{
		return (EReference)yPackageImportEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYParameter()
	{
		return yParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYParameter_IsOrdered()
	{
		return (EAttribute)yParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYParameter_IsUnique()
	{
		return (EAttribute)yParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYParameter_Lower()
	{
		return (EAttribute)yParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYParameter_Upper()
	{
		return (EAttribute)yParameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYParameter_QualifiedName()
	{
		return (EAttribute)yParameterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYParameter_Direction()
	{
		return (EAttribute)yParameterEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYParameter_DefaultValue()
	{
		return (EAttribute)yParameterEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYParameter_Description()
	{
		return (EAttribute)yParameterEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYParameter_Type()
	{
		return (EReference)yParameterEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYParameter_Signature()
	{
		return (EAttribute)yParameterEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYParameter_UpperboundWildcard()
	{
		return (EAttribute)yParameterEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYParameter_PosObjectID()
	{
		return (EReference)yParameterEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYParameter_PosName()
	{
		return (EReference)yParameterEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYParameter_PosOrdered()
	{
		return (EReference)yParameterEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYParameter_PosUnique()
	{
		return (EReference)yParameterEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYParameter_PosLower()
	{
		return (EReference)yParameterEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYParameter_PosUpper()
	{
		return (EReference)yParameterEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYParameter_PosUpperboundWildcard()
	{
		return (EReference)yParameterEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYParameter_PosDirection()
	{
		return (EReference)yParameterEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYParameter_PosDefaultValue()
	{
		return (EReference)yParameterEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYParameter_PosType()
	{
		return (EReference)yParameterEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYParameter_PosQualifiedName()
	{
		return (EReference)yParameterEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYPrimitiveType()
	{
		return yPrimitiveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYPrimitiveType_IsAbstract()
	{
		return (EAttribute)yPrimitiveTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYPrimitiveType_QualifiedName()
	{
		return (EAttribute)yPrimitiveTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYPrimitiveType_Member()
	{
		return (EReference)yPrimitiveTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYPrimitiveType_ElementImport()
	{
		return (EReference)yPrimitiveTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYPrimitiveType_ImportedMember()
	{
		return (EReference)yPrimitiveTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYPrimitiveType_PackageImport()
	{
		return (EReference)yPrimitiveTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYPrimitiveType_Attribute()
	{
		return (EReference)yPrimitiveTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYPrimitiveType_Feature()
	{
		return (EReference)yPrimitiveTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYPrimitiveType_General()
	{
		return (EReference)yPrimitiveTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYPrimitiveType_InheritedMember()
	{
		return (EReference)yPrimitiveTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYPrimitiveType_Package()
	{
		return (EReference)yPrimitiveTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYPrimitiveType_OwnedComment()
	{
		return (EReference)yPrimitiveTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYPrimitiveType_OwnedElement()
	{
		return (EReference)yPrimitiveTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYPrimitiveType_OwnedMember()
	{
		return (EReference)yPrimitiveTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYPrimitiveType_OwnedRule()
	{
		return (EReference)yPrimitiveTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYProperty()
	{
		return yPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYProperty_IsOrdered()
	{
		return (EAttribute)yPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYProperty_IsDerived()
	{
		return (EAttribute)yPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYProperty_IsDerivedUnion()
	{
		return (EAttribute)yPropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYProperty_Association()
	{
		return (EAttribute)yPropertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYProperty_QualifiedName()
	{
		return (EAttribute)yPropertyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYProperty_IsUnique()
	{
		return (EAttribute)yPropertyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYProperty_Lower()
	{
		return (EAttribute)yPropertyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYProperty_Upper()
	{
		return (EAttribute)yPropertyEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYProperty_Aggregation()
	{
		return (EAttribute)yPropertyEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYProperty_DefaultValue()
	{
		return (EAttribute)yPropertyEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYProperty_Description()
	{
		return (EAttribute)yPropertyEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYProperty_FeaturingClassifier()
	{
		return (EReference)yPropertyEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYProperty_Type()
	{
		return (EReference)yPropertyEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYProperty_SubsettedProperty()
	{
		return (EReference)yPropertyEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYProperty_Opposite()
	{
		return (EReference)yPropertyEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYProperty_OwnedComment()
	{
		return (EReference)yPropertyEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYProperty_OwnedElement()
	{
		return (EReference)yPropertyEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYProperty_Clazz()
	{
		return (EReference)yPropertyEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYProperty_Signature()
	{
		return (EAttribute)yPropertyEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYProperty_Visibility()
	{
		return (EAttribute)yPropertyEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYProperty_PosObjectID()
	{
		return (EReference)yPropertyEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYProperty_PosName()
	{
		return (EReference)yPropertyEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYProperty_PosOrdered()
	{
		return (EReference)yPropertyEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYProperty_PosUnique()
	{
		return (EReference)yPropertyEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYProperty_PosLower()
	{
		return (EReference)yPropertyEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYProperty_PosUpper()
	{
		return (EReference)yPropertyEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYProperty_PosDefaultValue()
	{
		return (EReference)yPropertyEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYProperty_PosType()
	{
		return (EReference)yPropertyEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYProperty_PosClazz()
	{
		return (EReference)yPropertyEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYProperty_PosDerived()
	{
		return (EReference)yPropertyEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYProperty_PosDerivedUnion()
	{
		return (EReference)yPropertyEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYProperty_PosAssociation()
	{
		return (EReference)yPropertyEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYProperty_PosVisibility()
	{
		return (EReference)yPropertyEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYProperty_PosOpposite()
	{
		return (EReference)yPropertyEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYProperty_PosAggregation()
	{
		return (EReference)yPropertyEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYProperty_PosQualifiedName()
	{
		return (EReference)yPropertyEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYProperty_Observe() {
		return (EAttribute)yPropertyEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYProperty_Invarinat() {
		return (EAttribute)yPropertyEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYProperty_Static() {
		return (EAttribute)yPropertyEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYType()
	{
		return yTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYStateMachine()
	{
		return yStateMachineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYStateMachine_InitialActive()
	{
		return (EAttribute)yStateMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYStateMachine_QualifiedName()
	{
		return (EAttribute)yStateMachineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYStateMachine_Rtc()
	{
		return (EAttribute)yStateMachineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYStateMachine_MaxEffectsToBeProcessed()
	{
		return (EAttribute)yStateMachineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYStateMachine_CalledOperation()
	{
		return (EReference)yStateMachineEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYStateMachine_OwnedComment()
	{
		return (EReference)yStateMachineEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYStateMachine_OwnedElement()
	{
		return (EReference)yStateMachineEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYStateMachine_Transition()
	{
		return (EReference)yStateMachineEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYStateMachine_Subvertex()
	{
		return (EReference)yStateMachineEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYStateMachine_TrAttach()
	{
		return (EReference)yStateMachineEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYStateMachine_Operation()
	{
		return (EReference)yStateMachineEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYStateMachine_PosObjectID()
	{
		return (EReference)yStateMachineEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYStateMachine_PosName()
	{
		return (EReference)yStateMachineEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYStateMachine_PosQualifiedName()
	{
		return (EReference)yStateMachineEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYStateMachine_PosInitialActive()
	{
		return (EReference)yStateMachineEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYStateMachine_PosRtc()
	{
		return (EReference)yStateMachineEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYStateMachine_PosMaxEffectsToBeProcessed()
	{
		return (EReference)yStateMachineEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYStateMachine_InsertLineTransition()
	{
		return (EAttribute)yStateMachineEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYStateMachine_InsertLineVertex()
	{
		return (EAttribute)yStateMachineEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYStateMachine_InsertLineAttachment()
	{
		return (EAttribute)yStateMachineEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYStateMachine_DesInitializer()
	{
		return (EAttribute)yStateMachineEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYTransition()
	{
		return yTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYTransition_QualifiedName()
	{
		return (EAttribute)yTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYTransition_Source()
	{
		return (EReference)yTransitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYTransition_Target()
	{
		return (EReference)yTransitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYTransition_Attachment()
	{
		return (EReference)yTransitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYTransition_OwnedComment()
	{
		return (EReference)yTransitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYTransition_OwnedElement()
	{
		return (EReference)yTransitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYTransition_PosObjectID()
	{
		return (EReference)yTransitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYTransition_PosName()
	{
		return (EReference)yTransitionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYTransition_PosQualifiedName()
	{
		return (EReference)yTransitionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYTransition_PosSource()
	{
		return (EReference)yTransitionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYTransition_PosTarget()
	{
		return (EReference)yTransitionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYTransition_PosAttachment()
	{
		return (EReference)yTransitionEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYTrAttachment()
	{
		return yTrAttachmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYTrAttachment_QualifiedName()
	{
		return (EAttribute)yTrAttachmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYTrAttachment_Transition()
	{
		return (EReference)yTrAttachmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYTrAttachment_Effects()
	{
		return (EReference)yTrAttachmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYTrAttachment_Guard()
	{
		return (EReference)yTrAttachmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYTrAttachment_GuardStringRep()
	{
		return (EAttribute)yTrAttachmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYTrAttachment_PosTransition()
	{
		return (EReference)yTrAttachmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYTrAttachment_PosObjectID()
	{
		return (EReference)yTrAttachmentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYTrAttachment_PosName()
	{
		return (EReference)yTrAttachmentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYTrAttachment_PosQualifiedName()
	{
		return (EReference)yTrAttachmentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYTrAttachment_InsertEffect()
	{
		return (EAttribute)yTrAttachmentEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYEffect()
	{
		return yEffectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYEffect_Body()
	{
		return (EReference)yEffectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYEffect_Breakpoint()
	{
		return (EAttribute)yEffectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYEffect_EffectStringRep()
	{
		return (EAttribute)yEffectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYEffect_PosObjectID()
	{
		return (EReference)yEffectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYEffect_PosBreakpoint()
	{
		return (EReference)yEffectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYVertex()
	{
		return yVertexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYVertex_Outgoing()
	{
		return (EReference)yVertexEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYVertex_Incoming()
	{
		return (EReference)yVertexEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYPseudostate()
	{
		return yPseudostateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYPseudostate_QualifiedName()
	{
		return (EAttribute)yPseudostateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYPseudostate_PosObjectID()
	{
		return (EReference)yPseudostateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYPseudostate_PosName()
	{
		return (EReference)yPseudostateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYPseudostate_PosQualifiedName()
	{
		return (EReference)yPseudostateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYPseudostate_InsertOutgoing()
	{
		return (EAttribute)yPseudostateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYPseudostate_InsertIncoming()
	{
		return (EAttribute)yPseudostateEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYFinalState()
	{
		return yFinalStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYFinalState_QualifiedName()
	{
		return (EAttribute)yFinalStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYFinalState_PosObjectID()
	{
		return (EReference)yFinalStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYFinalState_PosName()
	{
		return (EReference)yFinalStateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYFinalState_PosQualifiedName()
	{
		return (EReference)yFinalStateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYFinalState_InsertOutgoing()
	{
		return (EAttribute)yFinalStateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYFinalState_InsertIncoming()
	{
		return (EAttribute)yFinalStateEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYState()
	{
		return yStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYState_QualifiedName()
	{
		return (EAttribute)yStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYState_PosObjectID()
	{
		return (EReference)yStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYState_PosName()
	{
		return (EReference)yStateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYState_PosQualifiedName()
	{
		return (EReference)yStateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYState_InsertOutgoing()
	{
		return (EAttribute)yStateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYState_InsertIncoming()
	{
		return (EAttribute)yStateEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYModel()
	{
		return yModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYModel_Clazz()
	{
		return (EReference)yModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYModel_Enumerations()
	{
		return (EReference)yModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYModel_Packages()
	{
		return (EReference)yModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYModel_Objects()
	{
		return (EReference)yModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYModel_SharedEdges()
	{
		return (EReference)yModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYModel_CompositeEdges()
	{
		return (EReference)yModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYModel_PosObjectID()
	{
		return (EReference)yModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYModel_InsertClass()
	{
		return (EAttribute)yModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYModel_InsertEnum()
	{
		return (EAttribute)yModelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYModel_InsertPackage()
	{
		return (EAttribute)yModelEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYModel_Types()
	{
		return (EReference)yModelEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYSharedEdge()
	{
		return ySharedEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYSharedEdge_Description()
	{
		return (EAttribute)ySharedEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYSharedEdge_Source()
	{
		return (EReference)ySharedEdgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYSharedEdge_Target()
	{
		return (EReference)ySharedEdgeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYCompositeEdge()
	{
		return yCompositeEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYCompositeEdge_Description()
	{
		return (EAttribute)yCompositeEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYCompositeEdge_Source()
	{
		return (EReference)yCompositeEdgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYCompositeEdge_Target()
	{
		return (EReference)yCompositeEdgeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYObject()
	{
		return yObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYObject_ObjectID()
	{
		return (EAttribute)yObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYObject_DslInfo()
	{
		return (EReference)yObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYStateMachineHandler()
	{
		return yStateMachineHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYStateMachineHandler_State()
	{
		return (EReference)yStateMachineHandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYStateMachineHandler_Transition()
	{
		return (EReference)yStateMachineHandlerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYStateMachineHandler_IsSuspended()
	{
		return (EAttribute)yStateMachineHandlerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYStateMachineHandler_EffectCount()
	{
		return (EAttribute)yStateMachineHandlerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYStateMachineHandler_EffectNo()
	{
		return (EAttribute)yStateMachineHandlerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYStateMachineHandler_StateMachine()
	{
		return (EReference)yStateMachineHandlerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYStateMachineHandler_Effect()
	{
		return (EAttribute)yStateMachineHandlerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYStateMachineHandler_CalledFrom()
	{
		return (EReference)yStateMachineHandlerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYStateMachineHandler_ItsClassID()
	{
		return (EAttribute)yStateMachineHandlerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYStateMachineHandler_OperationInstance()
	{
		return (EReference)yStateMachineHandlerEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYStateMachineHandler_EffectsProcessed()
	{
		return (EAttribute)yStateMachineHandlerEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYStateMachineHandler_MaxEffectsToBeProcessed()
	{
		return (EAttribute)yStateMachineHandlerEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYStateMachineHandler_InAdapters()
	{
		return (EAttribute)yStateMachineHandlerEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYStateMachineHandler_ObjectsBindedWithInoutParameters()
	{
		return (EAttribute)yStateMachineHandlerEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYStateMachineHandler_ReturnVar()
	{
		return (EAttribute)yStateMachineHandlerEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYStateMachineHandler_NameOfRetunVar()
	{
		return (EAttribute)yStateMachineHandlerEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYStateMachineHandler_ObjectsToColor()
	{
		return (EAttribute)yStateMachineHandlerEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYGlobalStateMachine()
	{
		return yGlobalStateMachineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYGlobalStateMachine_StateMachines()
	{
		return (EReference)yGlobalStateMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYGlobalStateMachine_StateMachineHandlers()
	{
		return (EReference)yGlobalStateMachineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYGlobalStateMachine_StateMachineHandlerCount()
	{
		return (EAttribute)yGlobalStateMachineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYGlobalStateMachine_ConstraintsAllTrue()
	{
		return (EAttribute)yGlobalStateMachineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYGlobalStateMachine_HasReturnParam()
	{
		return (EAttribute)yGlobalStateMachineEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYGlobalStateMachine_ParamCount()
	{
		return (EAttribute)yGlobalStateMachineEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYGlobalStateMachine_StateExitCount()
	{
		return (EAttribute)yGlobalStateMachineEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYGlobalStateMachine_StateExitNo()
	{
		return (EAttribute)yGlobalStateMachineEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYGlobalStateMachine_O()
	{
		return (EReference)yGlobalStateMachineEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYGlobalStateMachine_ObserverActive()
	{
		return (EAttribute)yGlobalStateMachineEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYGlobalStateMachine_DesPhase()
	{
		return (EAttribute)yGlobalStateMachineEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYGlobalStateMachine_Internal() {
		return (EReference)yGlobalStateMachineEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYGlobalStateMachine_NotYetExecutedInitialActiveStatemachines() {
		return (EReference)yGlobalStateMachineEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYGlobalStateMachine_DesinitStateMachine() {
		return (EReference)yGlobalStateMachineEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYGlobalStateMachine_ExecutionPhase() {
		return (EAttribute)yGlobalStateMachineEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYCreateInstanceExpression()
	{
		return yCreateInstanceExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYCreateInstanceExpression_Clazz()
	{
		return (EReference)yCreateInstanceExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYCreateInstanceExpression_Feature()
	{
		return (EReference)yCreateInstanceExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYPrintExpression()
	{
		return yPrintExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYPrintExpression_Expression()
	{
		return (EReference)yPrintExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYSetReturnValue()
	{
		return ySetReturnValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYSetReturnValue_Value()
	{
		return (EReference)ySetReturnValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYGetInstancesOfExpression()
	{
		return yGetInstancesOfExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYGetInstancesOfExpression_Clazz()
	{
		return (EReference)yGetInstancesOfExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYMemberFeatureCall()
	{
		return yMemberFeatureCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYMemberFeatureCall_InheritanceType()
	{
		return (EReference)yMemberFeatureCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYMemberFeatureCall_ExplicitInheritanceType()
	{
		return (EAttribute)yMemberFeatureCallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYFeatureCall()
	{
		return yFeatureCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYFeatureCall_ExplicitInheritanceType()
	{
		return (EAttribute)yFeatureCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYFeatureCall_InheritanceType()
	{
		return (EReference)yFeatureCallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYGetObjectManagement()
	{
		return yGetObjectManagementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYGetObjectManagement_Parameter()
	{
		return (EReference)yGetObjectManagementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYGetLayerInformation()
	{
		return yGetLayerInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYGetLayerInformation_Parameter()
	{
		return (EReference)yGetLayerInformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYColorDFAObject()
	{
		return yColorDFAObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYColorDFAObject_Id()
	{
		return (EReference)yColorDFAObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYGetInstances()
	{
		return yGetInstancesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYGetInstances_Parameter()
	{
		return (EReference)yGetInstancesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYCountFinalStates()
	{
		return yCountFinalStatesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYCountFinalStates_Parameter()
	{
		return (EReference)yCountFinalStatesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYCountInitialStates()
	{
		return yCountInitialStatesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYCountInitialStates_Parameter()
	{
		return (EReference)yCountInitialStatesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYCountStates()
	{
		return yCountStatesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYCountStates_Parameter()
	{
		return (EReference)yCountStatesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYSetAbsoluteNodePropability()
	{
		return ySetAbsoluteNodePropabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYSetAbsoluteNodePropability_Parameter()
	{
		return (EReference)ySetAbsoluteNodePropabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYCountReachableStates()
	{
		return yCountReachableStatesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYCountReachableStates_Parameter()
	{
		return (EReference)yCountReachableStatesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYCountInValidTransitions()
	{
		return yCountInValidTransitionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYCountInValidTransitions_Parameter()
	{
		return (EReference)yCountInValidTransitionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYSetPopulationSize()
	{
		return ySetPopulationSizeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYSetPopulationSize_Parameter()
	{
		return (EReference)ySetPopulationSizeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYLoadModel()
	{
		return yLoadModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYLoadModel_RelModelPath()
	{
		return (EReference)yLoadModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDslInfo()
	{
		return dslInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDslInfo_Features()
	{
		return (EReference)dslInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDslInfo_FirstLine()
	{
		return (EReference)dslInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDslInfo_LastLine()
	{
		return (EReference)dslInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureInfo()
	{
		return featureInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleLinePropertyInfo()
	{
		return singleLinePropertyInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleLinePropertyInfo_Line()
	{
		return (EReference)singleLinePropertyInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuardInfo()
	{
		return guardInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuardInfo_FirstLineGuard()
	{
		return (EReference)guardInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuardInfo_LastLineGuard()
	{
		return (EReference)guardInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuardInfo_IgnoreNotification()
	{
		return (EAttribute)guardInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEffectInfo()
	{
		return effectInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEffectInfo_FirstLineEffect()
	{
		return (EReference)effectInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEffectInfo_LastLineEffect()
	{
		return (EReference)effectInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEffectInfo_IgnoreNotification()
	{
		return (EAttribute)effectInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainmentInfo()
	{
		return containmentInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainmentInfo_InsertionLine()
	{
		return (EReference)containmentInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEStructuralFeatureToFeatureInfoMap()
	{
		return eStructuralFeatureToFeatureInfoMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEStructuralFeatureToFeatureInfoMap_Key()
	{
		return (EReference)eStructuralFeatureToFeatureInfoMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEStructuralFeatureToFeatureInfoMap_Value()
	{
		return (EReference)eStructuralFeatureToFeatureInfoMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLine()
	{
		return lineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLine_Pos()
	{
		return (EAttribute)lineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLine_ProcessedOffsets()
	{
		return (EAttribute)lineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYStructure()
	{
		return yStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYInternal() {
		return yInternalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYInternal_SimulationTime() {
		return (EAttribute)yInternalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYInternal_GlobalStateMachine() {
		return (EReference)yInternalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYTimeStep() {
		return yTimeStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYObserverAddValue() {
		return yObserverAddValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYObserverAddValue_Parameter() {
		return (EReference)yObserverAddValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getYAggregationKind()
	{
		return yAggregationKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getYParameterDirectionKind()
	{
		return yParameterDirectionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getYRunToCompletion()
	{
		return yRunToCompletionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getExecutionPhase() {
		return executionPhaseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getYVisibilityKind()
	{
		return yVisibilityKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEString2()
	{
		return eString2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YammFactory getYammFactory()
	{
		return (YammFactory)getEFactoryInstance();
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
	public void createPackageContents()
	{
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		yClassEClass = createEClass(YCLASS);
		createEAttribute(yClassEClass, YCLASS__IS_ABSTRACT);
		createEAttribute(yClassEClass, YCLASS__QUALIFIED_NAME);
		createEReference(yClassEClass, YCLASS__PACKAGE);
		createEReference(yClassEClass, YCLASS__SUPER_CLASS);
		createEReference(yClassEClass, YCLASS__OWNED_ATTRIBUTE);
		createEReference(yClassEClass, YCLASS__OWNED_OPERATION);
		createEAttribute(yClassEClass, YCLASS__INSERT_LINE_SUPER_CLASS);
		createEAttribute(yClassEClass, YCLASS__INSERT_LINE_ATTRIBUTE);
		createEAttribute(yClassEClass, YCLASS__INSERT_LINE_OPERATION);
		createEReference(yClassEClass, YCLASS__POS_OBJECT_ID);
		createEReference(yClassEClass, YCLASS__POS_IS_ABSTRACT);
		createEReference(yClassEClass, YCLASS__POS_NAME);
		createEReference(yClassEClass, YCLASS__POS_QUALIFIED_NAME);
		createEReference(yClassEClass, YCLASS__POS_PACKAGE);
		createEAttribute(yClassEClass, YCLASS__OBSERVE_QUEUE);

		yClassifierEClass = createEClass(YCLASSIFIER);

		yCommentEClass = createEClass(YCOMMENT);
		createEAttribute(yCommentEClass, YCOMMENT__BODY);
		createEReference(yCommentEClass, YCOMMENT__ANNOTATED_ELEMENT);
		createEReference(yCommentEClass, YCOMMENT__OWNED_COMMENT);
		createEReference(yCommentEClass, YCOMMENT__OWNED_ELEMENT);

		yConstraintEClass = createEClass(YCONSTRAINT);
		createEAttribute(yConstraintEClass, YCONSTRAINT__QUALIFIED_NAME);
		createEReference(yConstraintEClass, YCONSTRAINT__CONSTRAINED_ELEMENT);
		createEReference(yConstraintEClass, YCONSTRAINT__OWNED_COMMENT);
		createEReference(yConstraintEClass, YCONSTRAINT__OWNED_ELEMENT);
		createEReference(yConstraintEClass, YCONSTRAINT__SPECIFICATION);

		yDataTypeEClass = createEClass(YDATA_TYPE);

		yElementEClass = createEClass(YELEMENT);

		yElementImportEClass = createEClass(YELEMENT_IMPORT);
		createEReference(yElementImportEClass, YELEMENT_IMPORT__IMPORTED_ELEMENT);
		createEReference(yElementImportEClass, YELEMENT_IMPORT__IMPORTING_NAMESPACE);
		createEReference(yElementImportEClass, YELEMENT_IMPORT__OWNED_COMMENT);
		createEReference(yElementImportEClass, YELEMENT_IMPORT__OWNED_ELEMENT);

		yEnumerationEClass = createEClass(YENUMERATION);
		createEAttribute(yEnumerationEClass, YENUMERATION__IS_ABSTRACT);
		createEAttribute(yEnumerationEClass, YENUMERATION__QUALIFIED_NAME);
		createEReference(yEnumerationEClass, YENUMERATION__MEMBER);
		createEReference(yEnumerationEClass, YENUMERATION__ELEMENT_IMPORT);
		createEReference(yEnumerationEClass, YENUMERATION__IMPORTED_MEMBER);
		createEReference(yEnumerationEClass, YENUMERATION__PACKAGE_IMPORT);
		createEReference(yEnumerationEClass, YENUMERATION__ATTRIBUTE);
		createEReference(yEnumerationEClass, YENUMERATION__FEATURE);
		createEReference(yEnumerationEClass, YENUMERATION__GENERAL);
		createEReference(yEnumerationEClass, YENUMERATION__INHERITED_MEMBER);
		createEReference(yEnumerationEClass, YENUMERATION__PACKAGE);
		createEReference(yEnumerationEClass, YENUMERATION__OWNED_COMMENT);
		createEReference(yEnumerationEClass, YENUMERATION__OWNED_ELEMENT);
		createEReference(yEnumerationEClass, YENUMERATION__OWNED_MEMBER);
		createEReference(yEnumerationEClass, YENUMERATION__OWNED_RULE);
		createEReference(yEnumerationEClass, YENUMERATION__OWNED_LITERAL);
		createEReference(yEnumerationEClass, YENUMERATION__POS_OBJECT_ID);
		createEReference(yEnumerationEClass, YENUMERATION__POS_IS_ABSTRACT);
		createEReference(yEnumerationEClass, YENUMERATION__POS_NAME);
		createEReference(yEnumerationEClass, YENUMERATION__POS_QUALIFIED_NAME);
		createEReference(yEnumerationEClass, YENUMERATION__POS_PACKAGE);
		createEAttribute(yEnumerationEClass, YENUMERATION__INSERT_LINE_LITERAL);

		yEnumerationLiteralEClass = createEClass(YENUMERATION_LITERAL);
		createEAttribute(yEnumerationLiteralEClass, YENUMERATION_LITERAL__QUALIFIED_NAME);
		createEReference(yEnumerationLiteralEClass, YENUMERATION_LITERAL__OWNED_COMMENT);
		createEReference(yEnumerationLiteralEClass, YENUMERATION_LITERAL__OWNED_ELEMENT);
		createEReference(yEnumerationLiteralEClass, YENUMERATION_LITERAL__POS_OBJECT_ID);
		createEReference(yEnumerationLiteralEClass, YENUMERATION_LITERAL__POS_NAME);
		createEReference(yEnumerationLiteralEClass, YENUMERATION_LITERAL__POS_QUALIFIED_NAME);

		yFeatureEClass = createEClass(YFEATURE);

		yNamedElementEClass = createEClass(YNAMED_ELEMENT);
		createEAttribute(yNamedElementEClass, YNAMED_ELEMENT__NAME);

		yNamespaceEClass = createEClass(YNAMESPACE);

		yOperationEClass = createEClass(YOPERATION);
		createEAttribute(yOperationEClass, YOPERATION__QUALIFIED_NAME);
		createEReference(yOperationEClass, YOPERATION__OWNED_PARAMETER);
		createEReference(yOperationEClass, YOPERATION__STATE_MACHINE);
		createEReference(yOperationEClass, YOPERATION__CLAZZ);
		createEReference(yOperationEClass, YOPERATION__RETURN_TYPE);
		createEAttribute(yOperationEClass, YOPERATION__LOWER);
		createEAttribute(yOperationEClass, YOPERATION__UPPER);
		createEReference(yOperationEClass, YOPERATION__POS_OBJECT_ID);
		createEReference(yOperationEClass, YOPERATION__POS_NAME);
		createEReference(yOperationEClass, YOPERATION__POS_CLAZZ);
		createEReference(yOperationEClass, YOPERATION__POS_LOWER);
		createEReference(yOperationEClass, YOPERATION__POS_UPPER);
		createEReference(yOperationEClass, YOPERATION__POS_STATE_MACHINE);
		createEReference(yOperationEClass, YOPERATION__POS_RETURN_TYPE);
		createEAttribute(yOperationEClass, YOPERATION__INSERT_LINE_PARAMETER);

		yPackageEClass = createEClass(YPACKAGE);
		createEAttribute(yPackageEClass, YPACKAGE__QUALIFIED_NAME);
		createEReference(yPackageEClass, YPACKAGE__PACKAGE);
		createEReference(yPackageEClass, YPACKAGE__OWNED_MEMBER_PACKAGE);
		createEReference(yPackageEClass, YPACKAGE__POS_OBJECT_ID);
		createEReference(yPackageEClass, YPACKAGE__POS_NAME);
		createEReference(yPackageEClass, YPACKAGE__POS_QUALIFIED_NAME);
		createEReference(yPackageEClass, YPACKAGE__POS_PACKAGE);
		createEAttribute(yPackageEClass, YPACKAGE__INSERT_LINE_MEMBER);

		yPackageableElementEClass = createEClass(YPACKAGEABLE_ELEMENT);
		createEReference(yPackageableElementEClass, YPACKAGEABLE_ELEMENT__PARENT_ELEMENT);

		yPackageImportEClass = createEClass(YPACKAGE_IMPORT);
		createEReference(yPackageImportEClass, YPACKAGE_IMPORT__IMPORTED_PACKAGE);
		createEReference(yPackageImportEClass, YPACKAGE_IMPORT__IMPORTING_NAMESPACE);
		createEReference(yPackageImportEClass, YPACKAGE_IMPORT__OWNED_COMMENT);
		createEReference(yPackageImportEClass, YPACKAGE_IMPORT__OWNED_ELEMENT);

		yParameterEClass = createEClass(YPARAMETER);
		createEAttribute(yParameterEClass, YPARAMETER__IS_ORDERED);
		createEAttribute(yParameterEClass, YPARAMETER__IS_UNIQUE);
		createEAttribute(yParameterEClass, YPARAMETER__LOWER);
		createEAttribute(yParameterEClass, YPARAMETER__UPPER);
		createEAttribute(yParameterEClass, YPARAMETER__QUALIFIED_NAME);
		createEAttribute(yParameterEClass, YPARAMETER__DIRECTION);
		createEAttribute(yParameterEClass, YPARAMETER__DEFAULT_VALUE);
		createEAttribute(yParameterEClass, YPARAMETER__DESCRIPTION);
		createEReference(yParameterEClass, YPARAMETER__TYPE);
		createEAttribute(yParameterEClass, YPARAMETER__SIGNATURE);
		createEAttribute(yParameterEClass, YPARAMETER__UPPERBOUND_WILDCARD);
		createEReference(yParameterEClass, YPARAMETER__POS_OBJECT_ID);
		createEReference(yParameterEClass, YPARAMETER__POS_NAME);
		createEReference(yParameterEClass, YPARAMETER__POS_ORDERED);
		createEReference(yParameterEClass, YPARAMETER__POS_UNIQUE);
		createEReference(yParameterEClass, YPARAMETER__POS_LOWER);
		createEReference(yParameterEClass, YPARAMETER__POS_UPPER);
		createEReference(yParameterEClass, YPARAMETER__POS_UPPERBOUND_WILDCARD);
		createEReference(yParameterEClass, YPARAMETER__POS_DIRECTION);
		createEReference(yParameterEClass, YPARAMETER__POS_DEFAULT_VALUE);
		createEReference(yParameterEClass, YPARAMETER__POS_TYPE);
		createEReference(yParameterEClass, YPARAMETER__POS_QUALIFIED_NAME);

		yPrimitiveTypeEClass = createEClass(YPRIMITIVE_TYPE);
		createEAttribute(yPrimitiveTypeEClass, YPRIMITIVE_TYPE__IS_ABSTRACT);
		createEAttribute(yPrimitiveTypeEClass, YPRIMITIVE_TYPE__QUALIFIED_NAME);
		createEReference(yPrimitiveTypeEClass, YPRIMITIVE_TYPE__MEMBER);
		createEReference(yPrimitiveTypeEClass, YPRIMITIVE_TYPE__ELEMENT_IMPORT);
		createEReference(yPrimitiveTypeEClass, YPRIMITIVE_TYPE__IMPORTED_MEMBER);
		createEReference(yPrimitiveTypeEClass, YPRIMITIVE_TYPE__PACKAGE_IMPORT);
		createEReference(yPrimitiveTypeEClass, YPRIMITIVE_TYPE__ATTRIBUTE);
		createEReference(yPrimitiveTypeEClass, YPRIMITIVE_TYPE__FEATURE);
		createEReference(yPrimitiveTypeEClass, YPRIMITIVE_TYPE__GENERAL);
		createEReference(yPrimitiveTypeEClass, YPRIMITIVE_TYPE__INHERITED_MEMBER);
		createEReference(yPrimitiveTypeEClass, YPRIMITIVE_TYPE__PACKAGE);
		createEReference(yPrimitiveTypeEClass, YPRIMITIVE_TYPE__OWNED_COMMENT);
		createEReference(yPrimitiveTypeEClass, YPRIMITIVE_TYPE__OWNED_ELEMENT);
		createEReference(yPrimitiveTypeEClass, YPRIMITIVE_TYPE__OWNED_MEMBER);
		createEReference(yPrimitiveTypeEClass, YPRIMITIVE_TYPE__OWNED_RULE);

		yPropertyEClass = createEClass(YPROPERTY);
		createEAttribute(yPropertyEClass, YPROPERTY__IS_ORDERED);
		createEAttribute(yPropertyEClass, YPROPERTY__IS_DERIVED);
		createEAttribute(yPropertyEClass, YPROPERTY__IS_DERIVED_UNION);
		createEAttribute(yPropertyEClass, YPROPERTY__ASSOCIATION);
		createEAttribute(yPropertyEClass, YPROPERTY__QUALIFIED_NAME);
		createEAttribute(yPropertyEClass, YPROPERTY__IS_UNIQUE);
		createEAttribute(yPropertyEClass, YPROPERTY__LOWER);
		createEAttribute(yPropertyEClass, YPROPERTY__UPPER);
		createEAttribute(yPropertyEClass, YPROPERTY__AGGREGATION);
		createEAttribute(yPropertyEClass, YPROPERTY__DEFAULT_VALUE);
		createEAttribute(yPropertyEClass, YPROPERTY__DESCRIPTION);
		createEReference(yPropertyEClass, YPROPERTY__FEATURING_CLASSIFIER);
		createEReference(yPropertyEClass, YPROPERTY__TYPE);
		createEReference(yPropertyEClass, YPROPERTY__SUBSETTED_PROPERTY);
		createEReference(yPropertyEClass, YPROPERTY__OPPOSITE);
		createEReference(yPropertyEClass, YPROPERTY__OWNED_COMMENT);
		createEReference(yPropertyEClass, YPROPERTY__OWNED_ELEMENT);
		createEReference(yPropertyEClass, YPROPERTY__CLAZZ);
		createEAttribute(yPropertyEClass, YPROPERTY__SIGNATURE);
		createEAttribute(yPropertyEClass, YPROPERTY__VISIBILITY);
		createEReference(yPropertyEClass, YPROPERTY__POS_OBJECT_ID);
		createEReference(yPropertyEClass, YPROPERTY__POS_NAME);
		createEReference(yPropertyEClass, YPROPERTY__POS_ORDERED);
		createEReference(yPropertyEClass, YPROPERTY__POS_UNIQUE);
		createEReference(yPropertyEClass, YPROPERTY__POS_LOWER);
		createEReference(yPropertyEClass, YPROPERTY__POS_UPPER);
		createEReference(yPropertyEClass, YPROPERTY__POS_DEFAULT_VALUE);
		createEReference(yPropertyEClass, YPROPERTY__POS_TYPE);
		createEReference(yPropertyEClass, YPROPERTY__POS_CLAZZ);
		createEReference(yPropertyEClass, YPROPERTY__POS_DERIVED);
		createEReference(yPropertyEClass, YPROPERTY__POS_DERIVED_UNION);
		createEReference(yPropertyEClass, YPROPERTY__POS_ASSOCIATION);
		createEReference(yPropertyEClass, YPROPERTY__POS_VISIBILITY);
		createEReference(yPropertyEClass, YPROPERTY__POS_OPPOSITE);
		createEReference(yPropertyEClass, YPROPERTY__POS_AGGREGATION);
		createEReference(yPropertyEClass, YPROPERTY__POS_QUALIFIED_NAME);
		createEAttribute(yPropertyEClass, YPROPERTY__OBSERVE);
		createEAttribute(yPropertyEClass, YPROPERTY__INVARINAT);
		createEAttribute(yPropertyEClass, YPROPERTY__STATIC);

		yTypeEClass = createEClass(YTYPE);

		yStateMachineEClass = createEClass(YSTATE_MACHINE);
		createEAttribute(yStateMachineEClass, YSTATE_MACHINE__INITIAL_ACTIVE);
		createEAttribute(yStateMachineEClass, YSTATE_MACHINE__QUALIFIED_NAME);
		createEAttribute(yStateMachineEClass, YSTATE_MACHINE__RTC);
		createEAttribute(yStateMachineEClass, YSTATE_MACHINE__MAX_EFFECTS_TO_BE_PROCESSED);
		createEReference(yStateMachineEClass, YSTATE_MACHINE__CALLED_OPERATION);
		createEReference(yStateMachineEClass, YSTATE_MACHINE__OWNED_COMMENT);
		createEReference(yStateMachineEClass, YSTATE_MACHINE__OWNED_ELEMENT);
		createEReference(yStateMachineEClass, YSTATE_MACHINE__TRANSITION);
		createEReference(yStateMachineEClass, YSTATE_MACHINE__SUBVERTEX);
		createEReference(yStateMachineEClass, YSTATE_MACHINE__TR_ATTACH);
		createEReference(yStateMachineEClass, YSTATE_MACHINE__OPERATION);
		createEReference(yStateMachineEClass, YSTATE_MACHINE__POS_OBJECT_ID);
		createEReference(yStateMachineEClass, YSTATE_MACHINE__POS_NAME);
		createEReference(yStateMachineEClass, YSTATE_MACHINE__POS_QUALIFIED_NAME);
		createEReference(yStateMachineEClass, YSTATE_MACHINE__POS_INITIAL_ACTIVE);
		createEReference(yStateMachineEClass, YSTATE_MACHINE__POS_RTC);
		createEReference(yStateMachineEClass, YSTATE_MACHINE__POS_MAX_EFFECTS_TO_BE_PROCESSED);
		createEAttribute(yStateMachineEClass, YSTATE_MACHINE__INSERT_LINE_TRANSITION);
		createEAttribute(yStateMachineEClass, YSTATE_MACHINE__INSERT_LINE_VERTEX);
		createEAttribute(yStateMachineEClass, YSTATE_MACHINE__INSERT_LINE_ATTACHMENT);
		createEAttribute(yStateMachineEClass, YSTATE_MACHINE__DES_INITIALIZER);

		yTransitionEClass = createEClass(YTRANSITION);
		createEAttribute(yTransitionEClass, YTRANSITION__QUALIFIED_NAME);
		createEReference(yTransitionEClass, YTRANSITION__SOURCE);
		createEReference(yTransitionEClass, YTRANSITION__TARGET);
		createEReference(yTransitionEClass, YTRANSITION__ATTACHMENT);
		createEReference(yTransitionEClass, YTRANSITION__OWNED_COMMENT);
		createEReference(yTransitionEClass, YTRANSITION__OWNED_ELEMENT);
		createEReference(yTransitionEClass, YTRANSITION__POS_OBJECT_ID);
		createEReference(yTransitionEClass, YTRANSITION__POS_NAME);
		createEReference(yTransitionEClass, YTRANSITION__POS_QUALIFIED_NAME);
		createEReference(yTransitionEClass, YTRANSITION__POS_SOURCE);
		createEReference(yTransitionEClass, YTRANSITION__POS_TARGET);
		createEReference(yTransitionEClass, YTRANSITION__POS_ATTACHMENT);

		yTrAttachmentEClass = createEClass(YTR_ATTACHMENT);
		createEAttribute(yTrAttachmentEClass, YTR_ATTACHMENT__QUALIFIED_NAME);
		createEReference(yTrAttachmentEClass, YTR_ATTACHMENT__TRANSITION);
		createEReference(yTrAttachmentEClass, YTR_ATTACHMENT__EFFECTS);
		createEReference(yTrAttachmentEClass, YTR_ATTACHMENT__GUARD);
		createEAttribute(yTrAttachmentEClass, YTR_ATTACHMENT__GUARD_STRING_REP);
		createEReference(yTrAttachmentEClass, YTR_ATTACHMENT__POS_TRANSITION);
		createEReference(yTrAttachmentEClass, YTR_ATTACHMENT__POS_OBJECT_ID);
		createEReference(yTrAttachmentEClass, YTR_ATTACHMENT__POS_NAME);
		createEReference(yTrAttachmentEClass, YTR_ATTACHMENT__POS_QUALIFIED_NAME);
		createEAttribute(yTrAttachmentEClass, YTR_ATTACHMENT__INSERT_EFFECT);

		yEffectEClass = createEClass(YEFFECT);
		createEReference(yEffectEClass, YEFFECT__BODY);
		createEAttribute(yEffectEClass, YEFFECT__BREAKPOINT);
		createEAttribute(yEffectEClass, YEFFECT__EFFECT_STRING_REP);
		createEReference(yEffectEClass, YEFFECT__POS_OBJECT_ID);
		createEReference(yEffectEClass, YEFFECT__POS_BREAKPOINT);

		yVertexEClass = createEClass(YVERTEX);
		createEReference(yVertexEClass, YVERTEX__OUTGOING);
		createEReference(yVertexEClass, YVERTEX__INCOMING);

		yPseudostateEClass = createEClass(YPSEUDOSTATE);
		createEAttribute(yPseudostateEClass, YPSEUDOSTATE__QUALIFIED_NAME);
		createEReference(yPseudostateEClass, YPSEUDOSTATE__POS_OBJECT_ID);
		createEReference(yPseudostateEClass, YPSEUDOSTATE__POS_NAME);
		createEReference(yPseudostateEClass, YPSEUDOSTATE__POS_QUALIFIED_NAME);
		createEAttribute(yPseudostateEClass, YPSEUDOSTATE__INSERT_OUTGOING);
		createEAttribute(yPseudostateEClass, YPSEUDOSTATE__INSERT_INCOMING);

		yFinalStateEClass = createEClass(YFINAL_STATE);
		createEAttribute(yFinalStateEClass, YFINAL_STATE__QUALIFIED_NAME);
		createEReference(yFinalStateEClass, YFINAL_STATE__POS_OBJECT_ID);
		createEReference(yFinalStateEClass, YFINAL_STATE__POS_NAME);
		createEReference(yFinalStateEClass, YFINAL_STATE__POS_QUALIFIED_NAME);
		createEAttribute(yFinalStateEClass, YFINAL_STATE__INSERT_OUTGOING);
		createEAttribute(yFinalStateEClass, YFINAL_STATE__INSERT_INCOMING);

		yStateEClass = createEClass(YSTATE);
		createEAttribute(yStateEClass, YSTATE__QUALIFIED_NAME);
		createEReference(yStateEClass, YSTATE__POS_OBJECT_ID);
		createEReference(yStateEClass, YSTATE__POS_NAME);
		createEReference(yStateEClass, YSTATE__POS_QUALIFIED_NAME);
		createEAttribute(yStateEClass, YSTATE__INSERT_OUTGOING);
		createEAttribute(yStateEClass, YSTATE__INSERT_INCOMING);

		yModelEClass = createEClass(YMODEL);
		createEReference(yModelEClass, YMODEL__CLAZZ);
		createEReference(yModelEClass, YMODEL__ENUMERATIONS);
		createEReference(yModelEClass, YMODEL__PACKAGES);
		createEReference(yModelEClass, YMODEL__OBJECTS);
		createEReference(yModelEClass, YMODEL__SHARED_EDGES);
		createEReference(yModelEClass, YMODEL__COMPOSITE_EDGES);
		createEReference(yModelEClass, YMODEL__POS_OBJECT_ID);
		createEAttribute(yModelEClass, YMODEL__INSERT_CLASS);
		createEAttribute(yModelEClass, YMODEL__INSERT_ENUM);
		createEAttribute(yModelEClass, YMODEL__INSERT_PACKAGE);
		createEReference(yModelEClass, YMODEL__TYPES);

		ySharedEdgeEClass = createEClass(YSHARED_EDGE);
		createEAttribute(ySharedEdgeEClass, YSHARED_EDGE__DESCRIPTION);
		createEReference(ySharedEdgeEClass, YSHARED_EDGE__SOURCE);
		createEReference(ySharedEdgeEClass, YSHARED_EDGE__TARGET);

		yCompositeEdgeEClass = createEClass(YCOMPOSITE_EDGE);
		createEAttribute(yCompositeEdgeEClass, YCOMPOSITE_EDGE__DESCRIPTION);
		createEReference(yCompositeEdgeEClass, YCOMPOSITE_EDGE__SOURCE);
		createEReference(yCompositeEdgeEClass, YCOMPOSITE_EDGE__TARGET);

		yObjectEClass = createEClass(YOBJECT);
		createEAttribute(yObjectEClass, YOBJECT__OBJECT_ID);
		createEReference(yObjectEClass, YOBJECT__DSL_INFO);

		yStateMachineHandlerEClass = createEClass(YSTATE_MACHINE_HANDLER);
		createEReference(yStateMachineHandlerEClass, YSTATE_MACHINE_HANDLER__STATE);
		createEReference(yStateMachineHandlerEClass, YSTATE_MACHINE_HANDLER__TRANSITION);
		createEAttribute(yStateMachineHandlerEClass, YSTATE_MACHINE_HANDLER__IS_SUSPENDED);
		createEAttribute(yStateMachineHandlerEClass, YSTATE_MACHINE_HANDLER__EFFECT_COUNT);
		createEAttribute(yStateMachineHandlerEClass, YSTATE_MACHINE_HANDLER__EFFECT_NO);
		createEReference(yStateMachineHandlerEClass, YSTATE_MACHINE_HANDLER__STATE_MACHINE);
		createEAttribute(yStateMachineHandlerEClass, YSTATE_MACHINE_HANDLER__EFFECT);
		createEReference(yStateMachineHandlerEClass, YSTATE_MACHINE_HANDLER__CALLED_FROM);
		createEAttribute(yStateMachineHandlerEClass, YSTATE_MACHINE_HANDLER__ITS_CLASS_ID);
		createEReference(yStateMachineHandlerEClass, YSTATE_MACHINE_HANDLER__OPERATION_INSTANCE);
		createEAttribute(yStateMachineHandlerEClass, YSTATE_MACHINE_HANDLER__EFFECTS_PROCESSED);
		createEAttribute(yStateMachineHandlerEClass, YSTATE_MACHINE_HANDLER__MAX_EFFECTS_TO_BE_PROCESSED);
		createEAttribute(yStateMachineHandlerEClass, YSTATE_MACHINE_HANDLER__IN_ADAPTERS);
		createEAttribute(yStateMachineHandlerEClass, YSTATE_MACHINE_HANDLER__OBJECTS_BINDED_WITH_INOUT_PARAMETERS);
		createEAttribute(yStateMachineHandlerEClass, YSTATE_MACHINE_HANDLER__RETURN_VAR);
		createEAttribute(yStateMachineHandlerEClass, YSTATE_MACHINE_HANDLER__NAME_OF_RETUN_VAR);
		createEAttribute(yStateMachineHandlerEClass, YSTATE_MACHINE_HANDLER__OBJECTS_TO_COLOR);

		yGlobalStateMachineEClass = createEClass(YGLOBAL_STATE_MACHINE);
		createEReference(yGlobalStateMachineEClass, YGLOBAL_STATE_MACHINE__STATE_MACHINES);
		createEReference(yGlobalStateMachineEClass, YGLOBAL_STATE_MACHINE__STATE_MACHINE_HANDLERS);
		createEAttribute(yGlobalStateMachineEClass, YGLOBAL_STATE_MACHINE__STATE_MACHINE_HANDLER_COUNT);
		createEAttribute(yGlobalStateMachineEClass, YGLOBAL_STATE_MACHINE__CONSTRAINTS_ALL_TRUE);
		createEAttribute(yGlobalStateMachineEClass, YGLOBAL_STATE_MACHINE__HAS_RETURN_PARAM);
		createEAttribute(yGlobalStateMachineEClass, YGLOBAL_STATE_MACHINE__PARAM_COUNT);
		createEAttribute(yGlobalStateMachineEClass, YGLOBAL_STATE_MACHINE__STATE_EXIT_COUNT);
		createEAttribute(yGlobalStateMachineEClass, YGLOBAL_STATE_MACHINE__STATE_EXIT_NO);
		createEReference(yGlobalStateMachineEClass, YGLOBAL_STATE_MACHINE__O);
		createEAttribute(yGlobalStateMachineEClass, YGLOBAL_STATE_MACHINE__OBSERVER_ACTIVE);
		createEAttribute(yGlobalStateMachineEClass, YGLOBAL_STATE_MACHINE__DES_PHASE);
		createEReference(yGlobalStateMachineEClass, YGLOBAL_STATE_MACHINE__INTERNAL);
		createEReference(yGlobalStateMachineEClass, YGLOBAL_STATE_MACHINE__NOT_YET_EXECUTED_INITIAL_ACTIVE_STATEMACHINES);
		createEReference(yGlobalStateMachineEClass, YGLOBAL_STATE_MACHINE__DESINIT_STATE_MACHINE);
		createEAttribute(yGlobalStateMachineEClass, YGLOBAL_STATE_MACHINE__EXECUTION_PHASE);

		yCreateInstanceExpressionEClass = createEClass(YCREATE_INSTANCE_EXPRESSION);
		createEReference(yCreateInstanceExpressionEClass, YCREATE_INSTANCE_EXPRESSION__CLAZZ);
		createEReference(yCreateInstanceExpressionEClass, YCREATE_INSTANCE_EXPRESSION__FEATURE);

		yPrintExpressionEClass = createEClass(YPRINT_EXPRESSION);
		createEReference(yPrintExpressionEClass, YPRINT_EXPRESSION__EXPRESSION);

		ySetReturnValueEClass = createEClass(YSET_RETURN_VALUE);
		createEReference(ySetReturnValueEClass, YSET_RETURN_VALUE__VALUE);

		yGetInstancesOfExpressionEClass = createEClass(YGET_INSTANCES_OF_EXPRESSION);
		createEReference(yGetInstancesOfExpressionEClass, YGET_INSTANCES_OF_EXPRESSION__CLAZZ);

		yMemberFeatureCallEClass = createEClass(YMEMBER_FEATURE_CALL);
		createEReference(yMemberFeatureCallEClass, YMEMBER_FEATURE_CALL__INHERITANCE_TYPE);
		createEAttribute(yMemberFeatureCallEClass, YMEMBER_FEATURE_CALL__EXPLICIT_INHERITANCE_TYPE);

		yFeatureCallEClass = createEClass(YFEATURE_CALL);
		createEAttribute(yFeatureCallEClass, YFEATURE_CALL__EXPLICIT_INHERITANCE_TYPE);
		createEReference(yFeatureCallEClass, YFEATURE_CALL__INHERITANCE_TYPE);

		yGetObjectManagementEClass = createEClass(YGET_OBJECT_MANAGEMENT);
		createEReference(yGetObjectManagementEClass, YGET_OBJECT_MANAGEMENT__PARAMETER);

		yGetLayerInformationEClass = createEClass(YGET_LAYER_INFORMATION);
		createEReference(yGetLayerInformationEClass, YGET_LAYER_INFORMATION__PARAMETER);

		yColorDFAObjectEClass = createEClass(YCOLOR_DFA_OBJECT);
		createEReference(yColorDFAObjectEClass, YCOLOR_DFA_OBJECT__ID);

		yGetInstancesEClass = createEClass(YGET_INSTANCES);
		createEReference(yGetInstancesEClass, YGET_INSTANCES__PARAMETER);

		yCountFinalStatesEClass = createEClass(YCOUNT_FINAL_STATES);
		createEReference(yCountFinalStatesEClass, YCOUNT_FINAL_STATES__PARAMETER);

		yCountInitialStatesEClass = createEClass(YCOUNT_INITIAL_STATES);
		createEReference(yCountInitialStatesEClass, YCOUNT_INITIAL_STATES__PARAMETER);

		yCountStatesEClass = createEClass(YCOUNT_STATES);
		createEReference(yCountStatesEClass, YCOUNT_STATES__PARAMETER);

		ySetAbsoluteNodePropabilityEClass = createEClass(YSET_ABSOLUTE_NODE_PROPABILITY);
		createEReference(ySetAbsoluteNodePropabilityEClass, YSET_ABSOLUTE_NODE_PROPABILITY__PARAMETER);

		yCountReachableStatesEClass = createEClass(YCOUNT_REACHABLE_STATES);
		createEReference(yCountReachableStatesEClass, YCOUNT_REACHABLE_STATES__PARAMETER);

		yCountInValidTransitionsEClass = createEClass(YCOUNT_IN_VALID_TRANSITIONS);
		createEReference(yCountInValidTransitionsEClass, YCOUNT_IN_VALID_TRANSITIONS__PARAMETER);

		ySetPopulationSizeEClass = createEClass(YSET_POPULATION_SIZE);
		createEReference(ySetPopulationSizeEClass, YSET_POPULATION_SIZE__PARAMETER);

		yLoadModelEClass = createEClass(YLOAD_MODEL);
		createEReference(yLoadModelEClass, YLOAD_MODEL__REL_MODEL_PATH);

		dslInfoEClass = createEClass(DSL_INFO);
		createEReference(dslInfoEClass, DSL_INFO__FEATURES);
		createEReference(dslInfoEClass, DSL_INFO__FIRST_LINE);
		createEReference(dslInfoEClass, DSL_INFO__LAST_LINE);

		featureInfoEClass = createEClass(FEATURE_INFO);

		singleLinePropertyInfoEClass = createEClass(SINGLE_LINE_PROPERTY_INFO);
		createEReference(singleLinePropertyInfoEClass, SINGLE_LINE_PROPERTY_INFO__LINE);

		guardInfoEClass = createEClass(GUARD_INFO);
		createEReference(guardInfoEClass, GUARD_INFO__FIRST_LINE_GUARD);
		createEReference(guardInfoEClass, GUARD_INFO__LAST_LINE_GUARD);
		createEAttribute(guardInfoEClass, GUARD_INFO__IGNORE_NOTIFICATION);

		effectInfoEClass = createEClass(EFFECT_INFO);
		createEReference(effectInfoEClass, EFFECT_INFO__FIRST_LINE_EFFECT);
		createEReference(effectInfoEClass, EFFECT_INFO__LAST_LINE_EFFECT);
		createEAttribute(effectInfoEClass, EFFECT_INFO__IGNORE_NOTIFICATION);

		containmentInfoEClass = createEClass(CONTAINMENT_INFO);
		createEReference(containmentInfoEClass, CONTAINMENT_INFO__INSERTION_LINE);

		eStructuralFeatureToFeatureInfoMapEClass = createEClass(ESTRUCTURAL_FEATURE_TO_FEATURE_INFO_MAP);
		createEReference(eStructuralFeatureToFeatureInfoMapEClass, ESTRUCTURAL_FEATURE_TO_FEATURE_INFO_MAP__KEY);
		createEReference(eStructuralFeatureToFeatureInfoMapEClass, ESTRUCTURAL_FEATURE_TO_FEATURE_INFO_MAP__VALUE);

		lineEClass = createEClass(LINE);
		createEAttribute(lineEClass, LINE__POS);
		createEAttribute(lineEClass, LINE__PROCESSED_OFFSETS);

		yStructureEClass = createEClass(YSTRUCTURE);

		yInternalEClass = createEClass(YINTERNAL);
		createEAttribute(yInternalEClass, YINTERNAL__SIMULATION_TIME);
		createEReference(yInternalEClass, YINTERNAL__GLOBAL_STATE_MACHINE);

		yTimeStepEClass = createEClass(YTIME_STEP);

		yObserverAddValueEClass = createEClass(YOBSERVER_ADD_VALUE);
		createEReference(yObserverAddValueEClass, YOBSERVER_ADD_VALUE__PARAMETER);

		// Create enums
		yAggregationKindEEnum = createEEnum(YAGGREGATION_KIND);
		yParameterDirectionKindEEnum = createEEnum(YPARAMETER_DIRECTION_KIND);
		yRunToCompletionEEnum = createEEnum(YRUN_TO_COMPLETION);
		executionPhaseEEnum = createEEnum(EXECUTION_PHASE);
		yVisibilityKindEEnum = createEEnum(YVISIBILITY_KIND);

		// Create data types
		eString2EDataType = createEDataType(ESTRING2);
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
	public void initializePackageContents()
	{
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XbasePackage theXbasePackage = (XbasePackage)EPackage.Registry.INSTANCE.getEPackage(XbasePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		yClassEClass.getESuperTypes().add(this.getYElement());
		yClassEClass.getESuperTypes().add(this.getYNamedElement());
		yClassEClass.getESuperTypes().add(this.getYPackageableElement());
		yClassEClass.getESuperTypes().add(this.getYClassifier());
		yClassEClass.getESuperTypes().add(this.getYType());
		yClassEClass.getESuperTypes().add(this.getYNamespace());
		yClassEClass.getESuperTypes().add(this.getYObject());
		yClassifierEClass.getESuperTypes().add(this.getYObject());
		yCommentEClass.getESuperTypes().add(this.getYElement());
		yCommentEClass.getESuperTypes().add(this.getYObject());
		yConstraintEClass.getESuperTypes().add(this.getYElement());
		yConstraintEClass.getESuperTypes().add(this.getYNamedElement());
		yConstraintEClass.getESuperTypes().add(this.getYPackageableElement());
		yConstraintEClass.getESuperTypes().add(this.getYObject());
		yDataTypeEClass.getESuperTypes().add(this.getYObject());
		yElementEClass.getESuperTypes().add(this.getYObject());
		yElementImportEClass.getESuperTypes().add(this.getYElement());
		yElementImportEClass.getESuperTypes().add(this.getYObject());
		yEnumerationEClass.getESuperTypes().add(this.getYElement());
		yEnumerationEClass.getESuperTypes().add(this.getYNamedElement());
		yEnumerationEClass.getESuperTypes().add(this.getYPackageableElement());
		yEnumerationEClass.getESuperTypes().add(this.getYClassifier());
		yEnumerationEClass.getESuperTypes().add(this.getYType());
		yEnumerationEClass.getESuperTypes().add(this.getYNamespace());
		yEnumerationEClass.getESuperTypes().add(this.getYObject());
		yEnumerationLiteralEClass.getESuperTypes().add(this.getYElement());
		yEnumerationLiteralEClass.getESuperTypes().add(this.getYNamedElement());
		yEnumerationLiteralEClass.getESuperTypes().add(this.getYPackageableElement());
		yEnumerationLiteralEClass.getESuperTypes().add(this.getYObject());
		yFeatureEClass.getESuperTypes().add(this.getYObject());
		yNamedElementEClass.getESuperTypes().add(this.getYObject());
		yNamespaceEClass.getESuperTypes().add(this.getYObject());
		yOperationEClass.getESuperTypes().add(this.getYElement());
		yOperationEClass.getESuperTypes().add(this.getYNamedElement());
		yOperationEClass.getESuperTypes().add(this.getYFeature());
		yOperationEClass.getESuperTypes().add(this.getYNamespace());
		yOperationEClass.getESuperTypes().add(this.getYObject());
		yPackageEClass.getESuperTypes().add(this.getYElement());
		yPackageEClass.getESuperTypes().add(this.getYNamedElement());
		yPackageEClass.getESuperTypes().add(this.getYPackageableElement());
		yPackageEClass.getESuperTypes().add(this.getYNamespace());
		yPackageEClass.getESuperTypes().add(this.getYObject());
		yPackageableElementEClass.getESuperTypes().add(this.getYObject());
		yPackageableElementEClass.getESuperTypes().add(this.getYNamedElement());
		yPackageImportEClass.getESuperTypes().add(this.getYElement());
		yPackageImportEClass.getESuperTypes().add(this.getYObject());
		yParameterEClass.getESuperTypes().add(this.getYElement());
		yParameterEClass.getESuperTypes().add(this.getYNamedElement());
		yParameterEClass.getESuperTypes().add(this.getYObject());
		yPrimitiveTypeEClass.getESuperTypes().add(this.getYElement());
		yPrimitiveTypeEClass.getESuperTypes().add(this.getYNamedElement());
		yPrimitiveTypeEClass.getESuperTypes().add(this.getYPackageableElement());
		yPrimitiveTypeEClass.getESuperTypes().add(this.getYClassifier());
		yPrimitiveTypeEClass.getESuperTypes().add(this.getYType());
		yPrimitiveTypeEClass.getESuperTypes().add(this.getYNamespace());
		yPrimitiveTypeEClass.getESuperTypes().add(this.getYObject());
		yPropertyEClass.getESuperTypes().add(this.getYElement());
		yPropertyEClass.getESuperTypes().add(this.getYNamedElement());
		yPropertyEClass.getESuperTypes().add(this.getYFeature());
		yPropertyEClass.getESuperTypes().add(this.getYObject());
		yTypeEClass.getESuperTypes().add(this.getYObject());
		yTypeEClass.getESuperTypes().add(this.getYNamedElement());
		yStateMachineEClass.getESuperTypes().add(this.getYElement());
		yStateMachineEClass.getESuperTypes().add(this.getYNamedElement());
		yStateMachineEClass.getESuperTypes().add(this.getYObject());
		yTransitionEClass.getESuperTypes().add(this.getYElement());
		yTransitionEClass.getESuperTypes().add(this.getYNamedElement());
		yTransitionEClass.getESuperTypes().add(this.getYObject());
		yTrAttachmentEClass.getESuperTypes().add(this.getYElement());
		yTrAttachmentEClass.getESuperTypes().add(this.getYNamedElement());
		yTrAttachmentEClass.getESuperTypes().add(this.getYObject());
		yEffectEClass.getESuperTypes().add(this.getYObject());
		yVertexEClass.getESuperTypes().add(this.getYObject());
		yPseudostateEClass.getESuperTypes().add(this.getYElement());
		yPseudostateEClass.getESuperTypes().add(this.getYNamedElement());
		yPseudostateEClass.getESuperTypes().add(this.getYVertex());
		yPseudostateEClass.getESuperTypes().add(this.getYObject());
		yFinalStateEClass.getESuperTypes().add(this.getYElement());
		yFinalStateEClass.getESuperTypes().add(this.getYNamedElement());
		yFinalStateEClass.getESuperTypes().add(this.getYVertex());
		yFinalStateEClass.getESuperTypes().add(this.getYObject());
		yStateEClass.getESuperTypes().add(this.getYElement());
		yStateEClass.getESuperTypes().add(this.getYNamedElement());
		yStateEClass.getESuperTypes().add(this.getYNamespace());
		yStateEClass.getESuperTypes().add(this.getYVertex());
		yStateEClass.getESuperTypes().add(this.getYObject());
		yModelEClass.getESuperTypes().add(this.getYObject());
		ySharedEdgeEClass.getESuperTypes().add(this.getYObject());
		yCompositeEdgeEClass.getESuperTypes().add(this.getYObject());
		yStateMachineHandlerEClass.getESuperTypes().add(this.getYObject());
		yGlobalStateMachineEClass.getESuperTypes().add(this.getYObject());
		yCreateInstanceExpressionEClass.getESuperTypes().add(theXbasePackage.getXExpression());
		yPrintExpressionEClass.getESuperTypes().add(theXbasePackage.getXExpression());
		ySetReturnValueEClass.getESuperTypes().add(theXbasePackage.getXExpression());
		yGetInstancesOfExpressionEClass.getESuperTypes().add(theXbasePackage.getXExpression());
		yMemberFeatureCallEClass.getESuperTypes().add(theXbasePackage.getXMemberFeatureCall());
		yFeatureCallEClass.getESuperTypes().add(theXbasePackage.getXFeatureCall());
		yGetObjectManagementEClass.getESuperTypes().add(theXbasePackage.getXExpression());
		yGetLayerInformationEClass.getESuperTypes().add(theXbasePackage.getXExpression());
		yColorDFAObjectEClass.getESuperTypes().add(theXbasePackage.getXExpression());
		yGetInstancesEClass.getESuperTypes().add(theXbasePackage.getXExpression());
		yCountFinalStatesEClass.getESuperTypes().add(theXbasePackage.getXExpression());
		yCountInitialStatesEClass.getESuperTypes().add(theXbasePackage.getXExpression());
		yCountStatesEClass.getESuperTypes().add(theXbasePackage.getXExpression());
		ySetAbsoluteNodePropabilityEClass.getESuperTypes().add(theXbasePackage.getXExpression());
		yCountReachableStatesEClass.getESuperTypes().add(theXbasePackage.getXExpression());
		yCountInValidTransitionsEClass.getESuperTypes().add(theXbasePackage.getXExpression());
		ySetPopulationSizeEClass.getESuperTypes().add(theXbasePackage.getXExpression());
		yLoadModelEClass.getESuperTypes().add(theXbasePackage.getXExpression());
		singleLinePropertyInfoEClass.getESuperTypes().add(this.getFeatureInfo());
		guardInfoEClass.getESuperTypes().add(this.getFeatureInfo());
		effectInfoEClass.getESuperTypes().add(this.getFeatureInfo());
		containmentInfoEClass.getESuperTypes().add(this.getFeatureInfo());
		yTimeStepEClass.getESuperTypes().add(theXbasePackage.getXExpression());
		yObserverAddValueEClass.getESuperTypes().add(theXbasePackage.getXExpression());

		// Initialize classes and features; add operations and parameters
		initEClass(yClassEClass, YClass.class, "YClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYClass_IsAbstract(), ecorePackage.getEBoolean(), "isAbstract", null, 0, 1, YClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYClass_QualifiedName(), ecorePackage.getEString(), "qualifiedName", null, 0, 1, YClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYClass_Package(), this.getYNamedElement(), null, "package", null, 0, 1, YClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYClass_SuperClass(), this.getYClass(), null, "superClass", null, 0, -1, YClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYClass_OwnedAttribute(), this.getYProperty(), null, "ownedAttribute", null, 0, -1, YClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYClass_OwnedOperation(), this.getYOperation(), null, "ownedOperation", null, 0, -1, YClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYClass_InsertLineSuperClass(), ecorePackage.getEInt(), "insertLineSuperClass", null, 0, 1, YClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYClass_InsertLineAttribute(), ecorePackage.getEInt(), "insertLineAttribute", null, 0, 1, YClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYClass_InsertLineOperation(), ecorePackage.getEInt(), "insertLineOperation", null, 0, 1, YClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYClass_PosObjectID(), this.getSingleLinePropertyInfo(), null, "posObjectID", null, 0, 1, YClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYClass_PosIsAbstract(), this.getSingleLinePropertyInfo(), null, "posIsAbstract", null, 0, 1, YClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYClass_PosName(), this.getSingleLinePropertyInfo(), null, "posName", null, 0, 1, YClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYClass_PosQualifiedName(), this.getSingleLinePropertyInfo(), null, "posQualifiedName", null, 0, 1, YClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYClass_PosPackage(), this.getSingleLinePropertyInfo(), null, "posPackage", null, 0, 1, YClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYClass_ObserveQueue(), ecorePackage.getEBoolean(), "observeQueue", null, 0, 1, YClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yClassifierEClass, YClassifier.class, "YClassifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(yCommentEClass, YComment.class, "YComment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYComment_Body(), ecorePackage.getEString(), "body", null, 0, 1, YComment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYComment_AnnotatedElement(), this.getYElement(), null, "annotatedElement", null, 0, -1, YComment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYComment_OwnedComment(), this.getYComment(), null, "ownedComment", null, 0, 1, YComment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYComment_OwnedElement(), this.getYElement(), null, "ownedElement", null, 0, -1, YComment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yConstraintEClass, YConstraint.class, "YConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYConstraint_QualifiedName(), ecorePackage.getEString(), "qualifiedName", null, 0, 1, YConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYConstraint_ConstrainedElement(), this.getYElement(), null, "constrainedElement", null, 0, -1, YConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYConstraint_OwnedComment(), this.getYComment(), null, "ownedComment", null, 0, 1, YConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYConstraint_OwnedElement(), this.getYElement(), null, "ownedElement", null, 0, -1, YConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYConstraint_Specification(), this.getYOperation(), null, "specification", null, 0, 1, YConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yDataTypeEClass, YDataType.class, "YDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(yElementEClass, YElement.class, "YElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(yElementImportEClass, YElementImport.class, "YElementImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYElementImport_ImportedElement(), this.getYPackageableElement(), null, "importedElement", null, 0, 1, YElementImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYElementImport_ImportingNamespace(), this.getYNamespace(), null, "importingNamespace", null, 0, 1, YElementImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYElementImport_OwnedComment(), this.getYComment(), null, "ownedComment", null, 0, 1, YElementImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYElementImport_OwnedElement(), this.getYElement(), null, "ownedElement", null, 0, -1, YElementImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yEnumerationEClass, YEnumeration.class, "YEnumeration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYEnumeration_IsAbstract(), ecorePackage.getEBoolean(), "isAbstract", null, 0, 1, YEnumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYEnumeration_QualifiedName(), ecorePackage.getEString(), "qualifiedName", null, 0, 1, YEnumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYEnumeration_Member(), this.getYNamedElement(), null, "member", null, 0, -1, YEnumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYEnumeration_ElementImport(), this.getYPackageableElement(), null, "elementImport", null, 0, -1, YEnumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYEnumeration_ImportedMember(), this.getYPackageableElement(), null, "importedMember", null, 0, -1, YEnumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYEnumeration_PackageImport(), this.getYPackageableElement(), null, "packageImport", null, 0, -1, YEnumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYEnumeration_Attribute(), this.getYProperty(), null, "attribute", null, 0, -1, YEnumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYEnumeration_Feature(), this.getYFeature(), null, "feature", null, 0, -1, YEnumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYEnumeration_General(), this.getYClassifier(), null, "general", null, 0, -1, YEnumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYEnumeration_InheritedMember(), this.getYNamedElement(), null, "inheritedMember", null, 0, -1, YEnumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYEnumeration_Package(), this.getYNamedElement(), null, "package", null, 0, 1, YEnumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYEnumeration_OwnedComment(), this.getYComment(), null, "ownedComment", null, 0, 1, YEnumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYEnumeration_OwnedElement(), this.getYElement(), null, "ownedElement", null, 0, -1, YEnumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYEnumeration_OwnedMember(), this.getYNamedElement(), null, "ownedMember", null, 0, -1, YEnumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYEnumeration_OwnedRule(), this.getYConstraint(), null, "ownedRule", null, 0, -1, YEnumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYEnumeration_OwnedLiteral(), this.getYEnumerationLiteral(), null, "ownedLiteral", null, 0, -1, YEnumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYEnumeration_PosObjectID(), this.getSingleLinePropertyInfo(), null, "posObjectID", null, 0, 1, YEnumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYEnumeration_PosIsAbstract(), this.getSingleLinePropertyInfo(), null, "posIsAbstract", null, 0, 1, YEnumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYEnumeration_PosName(), this.getSingleLinePropertyInfo(), null, "posName", null, 0, 1, YEnumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYEnumeration_PosQualifiedName(), this.getSingleLinePropertyInfo(), null, "posQualifiedName", null, 0, 1, YEnumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYEnumeration_PosPackage(), this.getSingleLinePropertyInfo(), null, "posPackage", null, 0, 1, YEnumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYEnumeration_InsertLineLiteral(), ecorePackage.getEInt(), "insertLineLiteral", null, 0, 1, YEnumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yEnumerationLiteralEClass, YEnumerationLiteral.class, "YEnumerationLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYEnumerationLiteral_QualifiedName(), ecorePackage.getEString(), "qualifiedName", null, 0, 1, YEnumerationLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYEnumerationLiteral_OwnedComment(), this.getYComment(), null, "ownedComment", null, 0, 1, YEnumerationLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYEnumerationLiteral_OwnedElement(), this.getYElement(), null, "ownedElement", null, 0, -1, YEnumerationLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYEnumerationLiteral_PosObjectID(), this.getSingleLinePropertyInfo(), null, "posObjectID", null, 0, 1, YEnumerationLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYEnumerationLiteral_PosName(), this.getSingleLinePropertyInfo(), null, "posName", null, 0, 1, YEnumerationLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYEnumerationLiteral_PosQualifiedName(), this.getSingleLinePropertyInfo(), null, "posQualifiedName", null, 0, 1, YEnumerationLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yFeatureEClass, YFeature.class, "YFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(yNamedElementEClass, YNamedElement.class, "YNamedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, YNamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yNamespaceEClass, YNamespace.class, "YNamespace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(yOperationEClass, YOperation.class, "YOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYOperation_QualifiedName(), ecorePackage.getEString(), "qualifiedName", null, 0, 1, YOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYOperation_OwnedParameter(), this.getYParameter(), null, "ownedParameter", null, 0, -1, YOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYOperation_StateMachine(), this.getYStateMachine(), this.getYStateMachine_Operation(), "stateMachine", null, 0, 1, YOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYOperation_Clazz(), this.getYClass(), null, "clazz", null, 0, 1, YOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYOperation_ReturnType(), this.getYType(), null, "returnType", null, 0, 1, YOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYOperation_Lower(), ecorePackage.getEInt(), "lower", "0", 0, 1, YOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYOperation_Upper(), ecorePackage.getEInt(), "upper", "1", 0, 1, YOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYOperation_PosObjectID(), this.getSingleLinePropertyInfo(), null, "posObjectID", null, 0, 1, YOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYOperation_PosName(), this.getSingleLinePropertyInfo(), null, "posName", null, 0, 1, YOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYOperation_PosClazz(), this.getSingleLinePropertyInfo(), null, "posClazz", null, 0, 1, YOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYOperation_PosLower(), this.getSingleLinePropertyInfo(), null, "posLower", null, 0, 1, YOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYOperation_PosUpper(), this.getSingleLinePropertyInfo(), null, "posUpper", null, 0, 1, YOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYOperation_PosStateMachine(), this.getSingleLinePropertyInfo(), null, "posStateMachine", null, 0, 1, YOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYOperation_PosReturnType(), this.getSingleLinePropertyInfo(), null, "posReturnType", null, 0, 1, YOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYOperation_InsertLineParameter(), ecorePackage.getEInt(), "insertLineParameter", null, 0, 1, YOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yPackageEClass, YPackage.class, "YPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYPackage_QualifiedName(), ecorePackage.getEString(), "qualifiedName", null, 0, 1, YPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYPackage_Package(), this.getYPackage(), null, "package", null, 0, 1, YPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYPackage_OwnedMemberPackage(), this.getYPackageableElement(), this.getYPackageableElement_ParentElement(), "ownedMemberPackage", null, 0, -1, YPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYPackage_PosObjectID(), this.getSingleLinePropertyInfo(), null, "posObjectID", null, 0, 1, YPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYPackage_PosName(), this.getSingleLinePropertyInfo(), null, "posName", null, 0, 1, YPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYPackage_PosQualifiedName(), this.getSingleLinePropertyInfo(), null, "posQualifiedName", null, 0, 1, YPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYPackage_PosPackage(), this.getSingleLinePropertyInfo(), null, "posPackage", null, 0, 1, YPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYPackage_InsertLineMember(), ecorePackage.getEInt(), "insertLineMember", null, 0, 1, YPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yPackageableElementEClass, YPackageableElement.class, "YPackageableElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYPackageableElement_ParentElement(), this.getYPackage(), this.getYPackage_OwnedMemberPackage(), "parentElement", null, 0, 1, YPackageableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yPackageImportEClass, YPackageImport.class, "YPackageImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYPackageImport_ImportedPackage(), this.getYPackage(), null, "importedPackage", null, 0, 1, YPackageImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYPackageImport_ImportingNamespace(), this.getYNamespace(), null, "importingNamespace", null, 0, 1, YPackageImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYPackageImport_OwnedComment(), this.getYComment(), null, "ownedComment", null, 0, 1, YPackageImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYPackageImport_OwnedElement(), this.getYElement(), null, "ownedElement", null, 0, -1, YPackageImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yParameterEClass, YParameter.class, "YParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYParameter_IsOrdered(), ecorePackage.getEBoolean(), "isOrdered", null, 0, 1, YParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYParameter_IsUnique(), ecorePackage.getEBoolean(), "isUnique", null, 0, 1, YParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYParameter_Lower(), ecorePackage.getEInt(), "lower", null, 0, 1, YParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYParameter_Upper(), ecorePackage.getEInt(), "upper", "1", 0, 1, YParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYParameter_QualifiedName(), ecorePackage.getEString(), "qualifiedName", null, 0, 1, YParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYParameter_Direction(), this.getYParameterDirectionKind(), "direction", null, 0, 1, YParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYParameter_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, YParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYParameter_Description(), ecorePackage.getEString(), "description", null, 0, 1, YParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYParameter_Type(), this.getYType(), null, "type", null, 0, 1, YParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYParameter_Signature(), ecorePackage.getEString(), "signature", null, 0, 1, YParameter.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYParameter_UpperboundWildcard(), ecorePackage.getEBoolean(), "upperboundWildcard", "false", 0, 1, YParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYParameter_PosObjectID(), this.getSingleLinePropertyInfo(), null, "posObjectID", null, 0, 1, YParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYParameter_PosName(), this.getSingleLinePropertyInfo(), null, "posName", null, 0, 1, YParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYParameter_PosOrdered(), this.getSingleLinePropertyInfo(), null, "posOrdered", null, 0, 1, YParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYParameter_PosUnique(), this.getSingleLinePropertyInfo(), null, "posUnique", null, 0, 1, YParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYParameter_PosLower(), this.getSingleLinePropertyInfo(), null, "posLower", null, 0, 1, YParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYParameter_PosUpper(), this.getSingleLinePropertyInfo(), null, "posUpper", null, 0, 1, YParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYParameter_PosUpperboundWildcard(), this.getSingleLinePropertyInfo(), null, "posUpperboundWildcard", null, 0, 1, YParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYParameter_PosDirection(), this.getSingleLinePropertyInfo(), null, "posDirection", null, 0, 1, YParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYParameter_PosDefaultValue(), this.getSingleLinePropertyInfo(), null, "posDefaultValue", null, 0, 1, YParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYParameter_PosType(), this.getSingleLinePropertyInfo(), null, "posType", null, 0, 1, YParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYParameter_PosQualifiedName(), this.getSingleLinePropertyInfo(), null, "posQualifiedName", null, 0, 1, YParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yPrimitiveTypeEClass, YPrimitiveType.class, "YPrimitiveType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYPrimitiveType_IsAbstract(), ecorePackage.getEBoolean(), "isAbstract", null, 0, 1, YPrimitiveType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYPrimitiveType_QualifiedName(), ecorePackage.getEString(), "qualifiedName", null, 0, 1, YPrimitiveType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYPrimitiveType_Member(), this.getYNamedElement(), null, "member", null, 0, -1, YPrimitiveType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYPrimitiveType_ElementImport(), this.getYPackageableElement(), null, "elementImport", null, 0, -1, YPrimitiveType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYPrimitiveType_ImportedMember(), this.getYPackageableElement(), null, "importedMember", null, 0, -1, YPrimitiveType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYPrimitiveType_PackageImport(), this.getYPackageableElement(), null, "packageImport", null, 0, -1, YPrimitiveType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYPrimitiveType_Attribute(), this.getYProperty(), null, "attribute", null, 0, -1, YPrimitiveType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYPrimitiveType_Feature(), this.getYFeature(), null, "feature", null, 0, -1, YPrimitiveType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYPrimitiveType_General(), this.getYClassifier(), null, "general", null, 0, -1, YPrimitiveType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYPrimitiveType_InheritedMember(), this.getYNamedElement(), null, "inheritedMember", null, 0, -1, YPrimitiveType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYPrimitiveType_Package(), this.getYNamedElement(), null, "package", null, 0, 1, YPrimitiveType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYPrimitiveType_OwnedComment(), this.getYComment(), null, "ownedComment", null, 0, 1, YPrimitiveType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYPrimitiveType_OwnedElement(), this.getYElement(), null, "ownedElement", null, 0, -1, YPrimitiveType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYPrimitiveType_OwnedMember(), this.getYNamedElement(), null, "ownedMember", null, 0, -1, YPrimitiveType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYPrimitiveType_OwnedRule(), this.getYConstraint(), null, "ownedRule", null, 0, -1, YPrimitiveType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yPropertyEClass, YProperty.class, "YProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYProperty_IsOrdered(), ecorePackage.getEBoolean(), "isOrdered", null, 0, 1, YProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYProperty_IsDerived(), ecorePackage.getEBoolean(), "isDerived", null, 0, 1, YProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYProperty_IsDerivedUnion(), ecorePackage.getEBoolean(), "isDerivedUnion", null, 0, 1, YProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYProperty_Association(), ecorePackage.getEBoolean(), "association", "false", 0, 1, YProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYProperty_QualifiedName(), ecorePackage.getEString(), "qualifiedName", null, 0, 1, YProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYProperty_IsUnique(), ecorePackage.getEBoolean(), "isUnique", null, 0, 1, YProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYProperty_Lower(), ecorePackage.getEInt(), "lower", null, 0, 1, YProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYProperty_Upper(), ecorePackage.getEInt(), "upper", "1", 0, 1, YProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYProperty_Aggregation(), this.getYAggregationKind(), "aggregation", null, 0, 1, YProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYProperty_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, YProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYProperty_Description(), ecorePackage.getEString(), "description", null, 0, 1, YProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYProperty_FeaturingClassifier(), this.getYClass(), null, "featuringClassifier", null, 0, -1, YProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYProperty_Type(), this.getYType(), null, "type", null, 0, 1, YProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYProperty_SubsettedProperty(), this.getYProperty(), null, "subsettedProperty", null, 0, -1, YProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYProperty_Opposite(), this.getYProperty(), null, "opposite", null, 0, 1, YProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYProperty_OwnedComment(), this.getYComment(), null, "ownedComment", null, 0, 1, YProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYProperty_OwnedElement(), this.getYElement(), null, "ownedElement", null, 0, -1, YProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYProperty_Clazz(), this.getYClass(), null, "clazz", null, 0, 1, YProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYProperty_Signature(), ecorePackage.getEString(), "signature", null, 0, 1, YProperty.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYProperty_Visibility(), this.getYVisibilityKind(), "visibility", "public", 0, 1, YProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYProperty_PosObjectID(), this.getSingleLinePropertyInfo(), null, "posObjectID", null, 0, 1, YProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYProperty_PosName(), this.getSingleLinePropertyInfo(), null, "posName", null, 0, 1, YProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYProperty_PosOrdered(), this.getSingleLinePropertyInfo(), null, "posOrdered", null, 0, 1, YProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYProperty_PosUnique(), this.getSingleLinePropertyInfo(), null, "posUnique", null, 0, 1, YProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYProperty_PosLower(), this.getSingleLinePropertyInfo(), null, "posLower", null, 0, 1, YProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYProperty_PosUpper(), this.getSingleLinePropertyInfo(), null, "posUpper", null, 0, 1, YProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYProperty_PosDefaultValue(), this.getSingleLinePropertyInfo(), null, "posDefaultValue", null, 0, 1, YProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYProperty_PosType(), this.getSingleLinePropertyInfo(), null, "posType", null, 0, 1, YProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYProperty_PosClazz(), this.getSingleLinePropertyInfo(), null, "posClazz", null, 0, 1, YProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYProperty_PosDerived(), this.getSingleLinePropertyInfo(), null, "posDerived", null, 0, 1, YProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYProperty_PosDerivedUnion(), this.getSingleLinePropertyInfo(), null, "posDerivedUnion", null, 0, 1, YProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYProperty_PosAssociation(), this.getSingleLinePropertyInfo(), null, "posAssociation", null, 0, 1, YProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYProperty_PosVisibility(), this.getSingleLinePropertyInfo(), null, "posVisibility", null, 0, 1, YProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYProperty_PosOpposite(), this.getSingleLinePropertyInfo(), null, "posOpposite", null, 0, 1, YProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYProperty_PosAggregation(), this.getSingleLinePropertyInfo(), null, "posAggregation", null, 0, 1, YProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYProperty_PosQualifiedName(), this.getSingleLinePropertyInfo(), null, "posQualifiedName", null, 0, 1, YProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYProperty_Observe(), ecorePackage.getEBoolean(), "observe", null, 0, 1, YProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYProperty_Invarinat(), ecorePackage.getEString(), "invarinat", null, 0, 1, YProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYProperty_Static(), ecorePackage.getEBoolean(), "static", null, 0, 1, YProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yTypeEClass, YType.class, "YType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(yStateMachineEClass, YStateMachine.class, "YStateMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYStateMachine_InitialActive(), ecorePackage.getEBoolean(), "initialActive", null, 0, 1, YStateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYStateMachine_QualifiedName(), ecorePackage.getEString(), "qualifiedName", null, 0, 1, YStateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYStateMachine_Rtc(), this.getYRunToCompletion(), "rtc", null, 0, 1, YStateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYStateMachine_MaxEffectsToBeProcessed(), ecorePackage.getEInt(), "maxEffectsToBeProcessed", null, 0, 1, YStateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYStateMachine_CalledOperation(), this.getYOperation(), null, "calledOperation", null, 0, 1, YStateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYStateMachine_OwnedComment(), this.getYComment(), null, "ownedComment", null, 0, 1, YStateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYStateMachine_OwnedElement(), this.getYElement(), null, "ownedElement", null, 0, -1, YStateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYStateMachine_Transition(), this.getYTransition(), null, "transition", null, 0, -1, YStateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYStateMachine_Subvertex(), this.getYVertex(), null, "subvertex", null, 0, -1, YStateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYStateMachine_TrAttach(), this.getYTrAttachment(), null, "trAttach", null, 0, -1, YStateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYStateMachine_Operation(), this.getYOperation(), this.getYOperation_StateMachine(), "operation", null, 1, 1, YStateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYStateMachine_PosObjectID(), this.getSingleLinePropertyInfo(), null, "posObjectID", null, 0, 1, YStateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYStateMachine_PosName(), this.getSingleLinePropertyInfo(), null, "posName", null, 0, 1, YStateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYStateMachine_PosQualifiedName(), this.getSingleLinePropertyInfo(), null, "posQualifiedName", null, 0, 1, YStateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYStateMachine_PosInitialActive(), this.getSingleLinePropertyInfo(), null, "posInitialActive", null, 0, 1, YStateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYStateMachine_PosRtc(), this.getSingleLinePropertyInfo(), null, "posRtc", null, 0, 1, YStateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYStateMachine_PosMaxEffectsToBeProcessed(), this.getSingleLinePropertyInfo(), null, "posMaxEffectsToBeProcessed", null, 0, 1, YStateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYStateMachine_InsertLineTransition(), ecorePackage.getEInt(), "insertLineTransition", null, 0, 1, YStateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYStateMachine_InsertLineVertex(), ecorePackage.getEInt(), "insertLineVertex", null, 0, 1, YStateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYStateMachine_InsertLineAttachment(), ecorePackage.getEInt(), "insertLineAttachment", null, 0, 1, YStateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYStateMachine_DesInitializer(), ecorePackage.getEBoolean(), "desInitializer", "false", 0, 1, YStateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yTransitionEClass, YTransition.class, "YTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYTransition_QualifiedName(), ecorePackage.getEString(), "qualifiedName", null, 0, 1, YTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYTransition_Source(), this.getYVertex(), null, "source", null, 0, 1, YTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYTransition_Target(), this.getYVertex(), null, "target", null, 0, 1, YTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYTransition_Attachment(), this.getYTrAttachment(), null, "attachment", null, 0, 1, YTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYTransition_OwnedComment(), this.getYComment(), null, "ownedComment", null, 0, 1, YTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYTransition_OwnedElement(), this.getYElement(), null, "ownedElement", null, 0, -1, YTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYTransition_PosObjectID(), this.getSingleLinePropertyInfo(), null, "posObjectID", null, 0, 1, YTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYTransition_PosName(), this.getSingleLinePropertyInfo(), null, "posName", null, 0, 1, YTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYTransition_PosQualifiedName(), this.getSingleLinePropertyInfo(), null, "posQualifiedName", null, 0, 1, YTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYTransition_PosSource(), this.getSingleLinePropertyInfo(), null, "posSource", null, 0, 1, YTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYTransition_PosTarget(), this.getSingleLinePropertyInfo(), null, "posTarget", null, 0, 1, YTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYTransition_PosAttachment(), this.getSingleLinePropertyInfo(), null, "posAttachment", null, 0, 1, YTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yTrAttachmentEClass, YTrAttachment.class, "YTrAttachment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYTrAttachment_QualifiedName(), ecorePackage.getEString(), "qualifiedName", null, 0, 1, YTrAttachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYTrAttachment_Transition(), this.getYTransition(), null, "transition", null, 0, 1, YTrAttachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYTrAttachment_Effects(), this.getYEffect(), null, "effects", null, 0, -1, YTrAttachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYTrAttachment_Guard(), theXbasePackage.getXExpression(), null, "guard", null, 0, 1, YTrAttachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYTrAttachment_GuardStringRep(), ecorePackage.getEString(), "guardStringRep", null, 0, 1, YTrAttachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYTrAttachment_PosTransition(), this.getSingleLinePropertyInfo(), null, "posTransition", null, 0, 1, YTrAttachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYTrAttachment_PosObjectID(), this.getSingleLinePropertyInfo(), null, "posObjectID", null, 0, 1, YTrAttachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYTrAttachment_PosName(), this.getSingleLinePropertyInfo(), null, "posName", null, 0, 1, YTrAttachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYTrAttachment_PosQualifiedName(), this.getSingleLinePropertyInfo(), null, "posQualifiedName", null, 0, 1, YTrAttachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYTrAttachment_InsertEffect(), ecorePackage.getEInt(), "insertEffect", null, 0, 1, YTrAttachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yEffectEClass, YEffect.class, "YEffect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYEffect_Body(), theXbasePackage.getXExpression(), null, "body", null, 0, 1, YEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYEffect_Breakpoint(), ecorePackage.getEBoolean(), "breakpoint", "false", 0, 1, YEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYEffect_EffectStringRep(), ecorePackage.getEString(), "effectStringRep", null, 0, 1, YEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYEffect_PosObjectID(), this.getSingleLinePropertyInfo(), null, "posObjectID", null, 0, 1, YEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYEffect_PosBreakpoint(), this.getSingleLinePropertyInfo(), null, "posBreakpoint", null, 0, 1, YEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yVertexEClass, YVertex.class, "YVertex", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYVertex_Outgoing(), this.getYTransition(), null, "outgoing", null, 0, -1, YVertex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYVertex_Incoming(), this.getYTransition(), null, "incoming", null, 0, -1, YVertex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yPseudostateEClass, YPseudostate.class, "YPseudostate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYPseudostate_QualifiedName(), ecorePackage.getEString(), "qualifiedName", null, 0, 1, YPseudostate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYPseudostate_PosObjectID(), this.getSingleLinePropertyInfo(), null, "posObjectID", null, 0, 1, YPseudostate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYPseudostate_PosName(), this.getSingleLinePropertyInfo(), null, "posName", null, 0, 1, YPseudostate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYPseudostate_PosQualifiedName(), this.getSingleLinePropertyInfo(), null, "posQualifiedName", null, 0, 1, YPseudostate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYPseudostate_InsertOutgoing(), ecorePackage.getEInt(), "insertOutgoing", null, 0, 1, YPseudostate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYPseudostate_InsertIncoming(), ecorePackage.getEInt(), "insertIncoming", null, 0, 1, YPseudostate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yFinalStateEClass, YFinalState.class, "YFinalState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYFinalState_QualifiedName(), ecorePackage.getEString(), "qualifiedName", null, 0, 1, YFinalState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYFinalState_PosObjectID(), this.getSingleLinePropertyInfo(), null, "posObjectID", null, 0, 1, YFinalState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYFinalState_PosName(), this.getSingleLinePropertyInfo(), null, "posName", null, 0, 1, YFinalState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYFinalState_PosQualifiedName(), this.getSingleLinePropertyInfo(), null, "posQualifiedName", null, 0, 1, YFinalState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYFinalState_InsertOutgoing(), ecorePackage.getEInt(), "insertOutgoing", null, 0, 1, YFinalState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYFinalState_InsertIncoming(), ecorePackage.getEInt(), "insertIncoming", null, 0, 1, YFinalState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yStateEClass, YState.class, "YState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYState_QualifiedName(), ecorePackage.getEString(), "qualifiedName", null, 0, 1, YState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYState_PosObjectID(), this.getSingleLinePropertyInfo(), null, "posObjectID", null, 0, 1, YState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYState_PosName(), this.getSingleLinePropertyInfo(), null, "posName", null, 0, 1, YState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYState_PosQualifiedName(), this.getSingleLinePropertyInfo(), null, "posQualifiedName", null, 0, 1, YState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYState_InsertOutgoing(), ecorePackage.getEInt(), "insertOutgoing", null, 0, 1, YState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYState_InsertIncoming(), ecorePackage.getEInt(), "insertIncoming", null, 0, 1, YState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yModelEClass, YModel.class, "YModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYModel_Clazz(), this.getYClass(), null, "clazz", null, 0, -1, YModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYModel_Enumerations(), this.getYEnumeration(), null, "enumerations", null, 0, -1, YModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYModel_Packages(), this.getYPackage(), null, "packages", null, 0, -1, YModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYModel_Objects(), ecorePackage.getEObject(), null, "objects", null, 0, -1, YModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYModel_SharedEdges(), this.getYSharedEdge(), null, "sharedEdges", null, 0, -1, YModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYModel_CompositeEdges(), this.getYCompositeEdge(), null, "compositeEdges", null, 0, -1, YModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYModel_PosObjectID(), this.getSingleLinePropertyInfo(), null, "posObjectID", null, 0, 1, YModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYModel_InsertClass(), ecorePackage.getEInt(), "insertClass", null, 0, 1, YModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYModel_InsertEnum(), ecorePackage.getEInt(), "insertEnum", null, 0, 1, YModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYModel_InsertPackage(), ecorePackage.getEInt(), "insertPackage", null, 0, 1, YModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYModel_Types(), theEcorePackage.getEObject(), null, "types", null, 0, -1, YModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ySharedEdgeEClass, YSharedEdge.class, "YSharedEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYSharedEdge_Description(), ecorePackage.getEString(), "description", null, 0, 1, YSharedEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYSharedEdge_Source(), this.getYClass(), null, "source", null, 0, 1, YSharedEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYSharedEdge_Target(), this.getYClass(), null, "target", null, 0, 1, YSharedEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yCompositeEdgeEClass, YCompositeEdge.class, "YCompositeEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYCompositeEdge_Description(), ecorePackage.getEString(), "description", null, 0, 1, YCompositeEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYCompositeEdge_Source(), this.getYClass(), null, "source", null, 0, 1, YCompositeEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYCompositeEdge_Target(), this.getYClass(), null, "target", null, 0, 1, YCompositeEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yObjectEClass, YObject.class, "YObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYObject_ObjectID(), ecorePackage.getEString(), "ObjectID", "e", 0, 1, YObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYObject_DslInfo(), this.getDslInfo(), null, "dslInfo", null, 0, 1, YObject.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yStateMachineHandlerEClass, YStateMachineHandler.class, "YStateMachineHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYStateMachineHandler_State(), this.getYVertex(), null, "state", null, 1, 1, YStateMachineHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYStateMachineHandler_Transition(), this.getYTransition(), null, "transition", null, 1, 1, YStateMachineHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYStateMachineHandler_IsSuspended(), ecorePackage.getEBoolean(), "isSuspended", "false", 1, 1, YStateMachineHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYStateMachineHandler_EffectCount(), ecorePackage.getEInt(), "effectCount", "0", 1, 1, YStateMachineHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYStateMachineHandler_EffectNo(), ecorePackage.getEInt(), "effectNo", "0", 1, 1, YStateMachineHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYStateMachineHandler_StateMachine(), this.getYStateMachine(), null, "stateMachine", null, 1, 1, YStateMachineHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYStateMachineHandler_Effect(), ecorePackage.getEString(), "effect", "\"\"", 1, 1, YStateMachineHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYStateMachineHandler_CalledFrom(), this.getYStateMachineHandler(), null, "calledFrom", null, 0, 1, YStateMachineHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYStateMachineHandler_ItsClassID(), ecorePackage.getEString(), "itsClassID", null, 0, 1, YStateMachineHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYStateMachineHandler_OperationInstance(), ecorePackage.getEObject(), null, "operationInstance", null, 0, 1, YStateMachineHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYStateMachineHandler_EffectsProcessed(), ecorePackage.getEInt(), "effectsProcessed", "0", 1, 1, YStateMachineHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYStateMachineHandler_MaxEffectsToBeProcessed(), ecorePackage.getEInt(), "maxEffectsToBeProcessed", "-1", 1, 1, YStateMachineHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYStateMachineHandler_InAdapters(), ecorePackage.getEJavaObject(), "inAdapters", null, 0, -1, YStateMachineHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYStateMachineHandler_ObjectsBindedWithInoutParameters(), ecorePackage.getEJavaObject(), "objectsBindedWithInoutParameters", null, 0, 1, YStateMachineHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYStateMachineHandler_ReturnVar(), ecorePackage.getEJavaObject(), "returnVar", null, 0, 1, YStateMachineHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYStateMachineHandler_NameOfRetunVar(), ecorePackage.getEString(), "nameOfRetunVar", null, 0, 1, YStateMachineHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYStateMachineHandler_ObjectsToColor(), ecorePackage.getEJavaObject(), "objectsToColor", null, 0, 1, YStateMachineHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yGlobalStateMachineEClass, YGlobalStateMachine.class, "YGlobalStateMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYGlobalStateMachine_StateMachines(), this.getYStateMachine(), null, "stateMachines", null, 0, -1, YGlobalStateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYGlobalStateMachine_StateMachineHandlers(), this.getYStateMachineHandler(), null, "stateMachineHandlers", null, 0, -1, YGlobalStateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYGlobalStateMachine_StateMachineHandlerCount(), ecorePackage.getEInt(), "stateMachineHandlerCount", "0", 1, 1, YGlobalStateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYGlobalStateMachine_ConstraintsAllTrue(), ecorePackage.getEBoolean(), "constraintsAllTrue", null, 1, 1, YGlobalStateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYGlobalStateMachine_HasReturnParam(), ecorePackage.getEBoolean(), "hasReturnParam", "false", 1, 1, YGlobalStateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYGlobalStateMachine_ParamCount(), ecorePackage.getEInt(), "paramCount", null, 1, 1, YGlobalStateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYGlobalStateMachine_StateExitCount(), ecorePackage.getEInt(), "stateExitCount", null, 1, 1, YGlobalStateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYGlobalStateMachine_StateExitNo(), ecorePackage.getEInt(), "stateExitNo", null, 1, 1, YGlobalStateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYGlobalStateMachine_O(), this.getYOperation(), null, "o", null, 0, 1, YGlobalStateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYGlobalStateMachine_ObserverActive(), ecorePackage.getEBoolean(), "observerActive", "false", 0, 1, YGlobalStateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYGlobalStateMachine_DesPhase(), theEcorePackage.getEBoolean(), "desPhase", "false", 0, 1, YGlobalStateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYGlobalStateMachine_Internal(), this.getYInternal(), this.getYInternal_GlobalStateMachine(), "internal", null, 0, 1, YGlobalStateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYGlobalStateMachine_NotYetExecutedInitialActiveStatemachines(), this.getYStateMachine(), null, "notYetExecutedInitialActiveStatemachines", null, 0, -1, YGlobalStateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYGlobalStateMachine_DesinitStateMachine(), this.getYStateMachine(), null, "desinitStateMachine", null, 0, 1, YGlobalStateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYGlobalStateMachine_ExecutionPhase(), this.getExecutionPhase(), "executionPhase", null, 0, 1, YGlobalStateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yCreateInstanceExpressionEClass, YCreateInstanceExpression.class, "YCreateInstanceExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYCreateInstanceExpression_Clazz(), this.getYClass(), null, "clazz", null, 0, 1, YCreateInstanceExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYCreateInstanceExpression_Feature(), theTypesPackage.getJvmIdentifiableElement(), null, "feature", null, 0, 1, YCreateInstanceExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yPrintExpressionEClass, YPrintExpression.class, "YPrintExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYPrintExpression_Expression(), theXbasePackage.getXExpression(), null, "expression", null, 0, 1, YPrintExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ySetReturnValueEClass, YSetReturnValue.class, "YSetReturnValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYSetReturnValue_Value(), theXbasePackage.getXExpression(), null, "value", null, 0, 1, YSetReturnValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yGetInstancesOfExpressionEClass, YGetInstancesOfExpression.class, "YGetInstancesOfExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYGetInstancesOfExpression_Clazz(), this.getYClass(), null, "clazz", null, 0, 1, YGetInstancesOfExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yMemberFeatureCallEClass, YMemberFeatureCall.class, "YMemberFeatureCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYMemberFeatureCall_InheritanceType(), theTypesPackage.getJvmIdentifiableElement(), null, "inheritanceType", null, 0, 1, YMemberFeatureCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYMemberFeatureCall_ExplicitInheritanceType(), ecorePackage.getEBoolean(), "explicitInheritanceType", null, 0, 1, YMemberFeatureCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yFeatureCallEClass, YFeatureCall.class, "YFeatureCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYFeatureCall_ExplicitInheritanceType(), ecorePackage.getEBoolean(), "explicitInheritanceType", null, 0, 1, YFeatureCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYFeatureCall_InheritanceType(), theTypesPackage.getJvmIdentifiableElement(), null, "inheritanceType", null, 0, 1, YFeatureCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yGetObjectManagementEClass, YGetObjectManagement.class, "YGetObjectManagement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYGetObjectManagement_Parameter(), theXbasePackage.getXExpression(), null, "parameter", null, 0, -1, YGetObjectManagement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yGetLayerInformationEClass, YGetLayerInformation.class, "YGetLayerInformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYGetLayerInformation_Parameter(), theXbasePackage.getXExpression(), null, "parameter", null, 0, -1, YGetLayerInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yColorDFAObjectEClass, YColorDFAObject.class, "YColorDFAObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYColorDFAObject_Id(), theXbasePackage.getXExpression(), null, "id", null, 0, 1, YColorDFAObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yGetInstancesEClass, YGetInstances.class, "YGetInstances", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYGetInstances_Parameter(), theXbasePackage.getXExpression(), null, "parameter", null, 0, -1, YGetInstances.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yCountFinalStatesEClass, YCountFinalStates.class, "YCountFinalStates", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYCountFinalStates_Parameter(), theXbasePackage.getXExpression(), null, "parameter", null, 0, -1, YCountFinalStates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yCountInitialStatesEClass, YCountInitialStates.class, "YCountInitialStates", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYCountInitialStates_Parameter(), theXbasePackage.getXExpression(), null, "parameter", null, 0, -1, YCountInitialStates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yCountStatesEClass, YCountStates.class, "YCountStates", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYCountStates_Parameter(), theXbasePackage.getXExpression(), null, "parameter", null, 0, -1, YCountStates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ySetAbsoluteNodePropabilityEClass, YSetAbsoluteNodePropability.class, "YSetAbsoluteNodePropability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYSetAbsoluteNodePropability_Parameter(), theXbasePackage.getXExpression(), null, "parameter", null, 0, -1, YSetAbsoluteNodePropability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yCountReachableStatesEClass, YCountReachableStates.class, "YCountReachableStates", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYCountReachableStates_Parameter(), theXbasePackage.getXExpression(), null, "parameter", null, 0, -1, YCountReachableStates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yCountInValidTransitionsEClass, YCountInValidTransitions.class, "YCountInValidTransitions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYCountInValidTransitions_Parameter(), theXbasePackage.getXExpression(), null, "parameter", null, 0, -1, YCountInValidTransitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ySetPopulationSizeEClass, YSetPopulationSize.class, "YSetPopulationSize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYSetPopulationSize_Parameter(), theXbasePackage.getXExpression(), null, "parameter", null, 0, -1, YSetPopulationSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yLoadModelEClass, YLoadModel.class, "YLoadModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYLoadModel_RelModelPath(), theXbasePackage.getXExpression(), null, "relModelPath", null, 0, 1, YLoadModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dslInfoEClass, DslInfo.class, "DslInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDslInfo_Features(), this.getEStructuralFeatureToFeatureInfoMap(), null, "features", null, 0, -1, DslInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDslInfo_FirstLine(), this.getLine(), null, "firstLine", null, 0, 1, DslInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDslInfo_LastLine(), this.getLine(), null, "lastLine", null, 0, 1, DslInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureInfoEClass, FeatureInfo.class, "FeatureInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(singleLinePropertyInfoEClass, SingleLinePropertyInfo.class, "SingleLinePropertyInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSingleLinePropertyInfo_Line(), this.getLine(), null, "line", null, 0, 1, SingleLinePropertyInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(guardInfoEClass, GuardInfo.class, "GuardInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGuardInfo_FirstLineGuard(), this.getLine(), null, "firstLineGuard", null, 0, 1, GuardInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGuardInfo_LastLineGuard(), this.getLine(), null, "lastLineGuard", null, 0, 1, GuardInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGuardInfo_IgnoreNotification(), theEcorePackage.getEBoolean(), "ignoreNotification", null, 0, 1, GuardInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(effectInfoEClass, EffectInfo.class, "EffectInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEffectInfo_FirstLineEffect(), this.getLine(), null, "firstLineEffect", null, 0, 1, EffectInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEffectInfo_LastLineEffect(), this.getLine(), null, "lastLineEffect", null, 0, 1, EffectInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEffectInfo_IgnoreNotification(), theEcorePackage.getEBoolean(), "ignoreNotification", null, 0, 1, EffectInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containmentInfoEClass, ContainmentInfo.class, "ContainmentInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainmentInfo_InsertionLine(), this.getLine(), null, "insertionLine", null, 0, 1, ContainmentInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eStructuralFeatureToFeatureInfoMapEClass, Map.Entry.class, "EStructuralFeatureToFeatureInfoMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEStructuralFeatureToFeatureInfoMap_Key(), theEcorePackage.getEStructuralFeature(), null, "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEStructuralFeatureToFeatureInfoMap_Value(), this.getFeatureInfo(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lineEClass, Line.class, "Line", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLine_Pos(), ecorePackage.getEInt(), "pos", null, 0, 1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLine_ProcessedOffsets(), ecorePackage.getEInt(), "processedOffsets", "-1", 0, 1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(yStructureEClass, YStructure.class, "YStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(yInternalEClass, YInternal.class, "YInternal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYInternal_SimulationTime(), theEcorePackage.getEInt(), "simulationTime", null, 0, 1, YInternal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYInternal_GlobalStateMachine(), this.getYGlobalStateMachine(), this.getYGlobalStateMachine_Internal(), "globalStateMachine", null, 0, 1, YInternal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yTimeStepEClass, YTimeStep.class, "YTimeStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(yObserverAddValueEClass, YObserverAddValue.class, "YObserverAddValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYObserverAddValue_Parameter(), theXbasePackage.getXExpression(), null, "parameter", null, 0, -1, YObserverAddValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(yAggregationKindEEnum, YAggregationKind.class, "YAggregationKind");
		addEEnumLiteral(yAggregationKindEEnum, YAggregationKind.NONE);
		addEEnumLiteral(yAggregationKindEEnum, YAggregationKind.SHARED);
		addEEnumLiteral(yAggregationKindEEnum, YAggregationKind.COMPOSITE);

		initEEnum(yParameterDirectionKindEEnum, YParameterDirectionKind.class, "YParameterDirectionKind");
		addEEnumLiteral(yParameterDirectionKindEEnum, YParameterDirectionKind.IN);
		addEEnumLiteral(yParameterDirectionKindEEnum, YParameterDirectionKind.INOUT);
		addEEnumLiteral(yParameterDirectionKindEEnum, YParameterDirectionKind.IN_DEEP);

		initEEnum(yRunToCompletionEEnum, YRunToCompletion.class, "YRunToCompletion");
		addEEnumLiteral(yRunToCompletionEEnum, YRunToCompletion.EFFECT);
		addEEnumLiteral(yRunToCompletionEEnum, YRunToCompletion.TRANSITION);
		addEEnumLiteral(yRunToCompletionEEnum, YRunToCompletion.STATEMACHINE);
		addEEnumLiteral(yRunToCompletionEEnum, YRunToCompletion.OBSERVER);

		initEEnum(executionPhaseEEnum, ExecutionPhase.class, "ExecutionPhase");
		addEEnumLiteral(executionPhaseEEnum, ExecutionPhase.DESINIT);
		addEEnumLiteral(executionPhaseEEnum, ExecutionPhase.DES);
		addEEnumLiteral(executionPhaseEEnum, ExecutionPhase.NORMAL);
		addEEnumLiteral(executionPhaseEEnum, ExecutionPhase.OBSERVER);

		initEEnum(yVisibilityKindEEnum, YVisibilityKind.class, "YVisibilityKind");
		addEEnumLiteral(yVisibilityKindEEnum, YVisibilityKind.PUBLIC);
		addEEnumLiteral(yVisibilityKindEEnum, YVisibilityKind.PRIVATE);
		addEEnumLiteral(yVisibilityKindEEnum, YVisibilityKind.PROTECTED);
		addEEnumLiteral(yVisibilityKindEEnum, YVisibilityKind.PACKAGE);

		// Initialize data types
		initEDataType(eString2EDataType, Object.class, "EString2", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //YammPackageImpl
