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
package online.yamm.coreModelDiagram.yammDiagram.impl;

import java.io.IOException;

import java.net.URL;

import online.yamm.coreModelDiagram.yammDiagram.YammDiagramFactory;
import online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.eclipse.xtext.common.types.TypesPackage;

import org.eclipse.xtext.xbase.XbasePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class YammDiagramPackageImpl extends EPackageImpl implements YammDiagramPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "yammDiagram.ecore";

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
	 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private YammDiagramPackageImpl()
	{
		super(eNS_URI, YammDiagramFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link YammDiagramPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static YammDiagramPackage init()
	{
		if (isInited) return (YammDiagramPackage)EPackage.Registry.INSTANCE.getEPackage(YammDiagramPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredYammDiagramPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		YammDiagramPackageImpl theYammDiagramPackage = registeredYammDiagramPackage instanceof YammDiagramPackageImpl ? (YammDiagramPackageImpl)registeredYammDiagramPackage : new YammDiagramPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		XbasePackage.eINSTANCE.eClass();

		// Load packages
		theYammDiagramPackage.loadPackage();

		// Fix loaded packages
		theYammDiagramPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theYammDiagramPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(YammDiagramPackage.eNS_URI, theYammDiagramPackage);
		return theYammDiagramPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYClass()
	{
		if (yClassEClass == null) {
			yClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YammDiagramPackage.eNS_URI).getEClassifiers().get(1);
		}
		return yClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYClass_IsAbstract()
	{
        return (EAttribute)getYClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYClass_QualifiedName()
	{
        return (EAttribute)getYClass().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYClass_Package()
	{
        return (EReference)getYClass().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYClass_SuperClass()
	{
        return (EReference)getYClass().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYClass_OwnedAttribute()
	{
        return (EReference)getYClass().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYClass_OwnedOperation()
	{
        return (EReference)getYClass().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYClass_ObserveQueue() {
        return (EAttribute)getYClass().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYClassifier()
	{
		if (yClassifierEClass == null) {
			yClassifierEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YammDiagramPackage.eNS_URI).getEClassifiers().get(2);
		}
		return yClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYComment()
	{
		if (yCommentEClass == null) {
			yCommentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YammDiagramPackage.eNS_URI).getEClassifiers().get(3);
		}
		return yCommentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYComment_Body()
	{
        return (EAttribute)getYComment().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYComment_AnnotatedElement()
	{
        return (EReference)getYComment().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYComment_OwnedComment()
	{
        return (EReference)getYComment().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYComment_OwnedElement()
	{
        return (EReference)getYComment().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYConstraint()
	{
		if (yConstraintEClass == null) {
			yConstraintEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YammDiagramPackage.eNS_URI).getEClassifiers().get(4);
		}
		return yConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYConstraint_QualifiedName()
	{
        return (EAttribute)getYConstraint().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYConstraint_ConstrainedElement()
	{
        return (EReference)getYConstraint().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYConstraint_OwnedComment()
	{
        return (EReference)getYConstraint().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYConstraint_OwnedElement()
	{
        return (EReference)getYConstraint().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYConstraint_Specification()
	{
        return (EReference)getYConstraint().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYDataType()
	{
		if (yDataTypeEClass == null) {
			yDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YammDiagramPackage.eNS_URI).getEClassifiers().get(5);
		}
		return yDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYElement()
	{
		if (yElementEClass == null) {
			yElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YammDiagramPackage.eNS_URI).getEClassifiers().get(6);
		}
		return yElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYElementImport()
	{
		if (yElementImportEClass == null) {
			yElementImportEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YammDiagramPackage.eNS_URI).getEClassifiers().get(7);
		}
		return yElementImportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYElementImport_ImportedElement()
	{
        return (EReference)getYElementImport().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYElementImport_ImportingNamespace()
	{
        return (EReference)getYElementImport().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYElementImport_OwnedComment()
	{
        return (EReference)getYElementImport().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYElementImport_OwnedElement()
	{
        return (EReference)getYElementImport().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYEnumeration()
	{
		if (yEnumerationEClass == null) {
			yEnumerationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YammDiagramPackage.eNS_URI).getEClassifiers().get(8);
		}
		return yEnumerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYEnumeration_IsAbstract()
	{
        return (EAttribute)getYEnumeration().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYEnumeration_QualifiedName()
	{
        return (EAttribute)getYEnumeration().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYEnumeration_Member()
	{
        return (EReference)getYEnumeration().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYEnumeration_ElementImport()
	{
        return (EReference)getYEnumeration().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYEnumeration_ImportedMember()
	{
        return (EReference)getYEnumeration().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYEnumeration_PackageImport()
	{
        return (EReference)getYEnumeration().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYEnumeration_Attribute()
	{
        return (EReference)getYEnumeration().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYEnumeration_Feature()
	{
        return (EReference)getYEnumeration().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYEnumeration_General()
	{
        return (EReference)getYEnumeration().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYEnumeration_InheritedMember()
	{
        return (EReference)getYEnumeration().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYEnumeration_Package()
	{
        return (EReference)getYEnumeration().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYEnumeration_OwnedComment()
	{
        return (EReference)getYEnumeration().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYEnumeration_OwnedElement()
	{
        return (EReference)getYEnumeration().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYEnumeration_OwnedMember()
	{
        return (EReference)getYEnumeration().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYEnumeration_OwnedRule()
	{
        return (EReference)getYEnumeration().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYEnumeration_OwnedLiteral()
	{
        return (EReference)getYEnumeration().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYEnumerationLiteral()
	{
		if (yEnumerationLiteralEClass == null) {
			yEnumerationLiteralEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YammDiagramPackage.eNS_URI).getEClassifiers().get(9);
		}
		return yEnumerationLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYEnumerationLiteral_QualifiedName()
	{
        return (EAttribute)getYEnumerationLiteral().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYEnumerationLiteral_OwnedComment()
	{
        return (EReference)getYEnumerationLiteral().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYEnumerationLiteral_OwnedElement()
	{
        return (EReference)getYEnumerationLiteral().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYFeature()
	{
		if (yFeatureEClass == null) {
			yFeatureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YammDiagramPackage.eNS_URI).getEClassifiers().get(10);
		}
		return yFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYNamedElement()
	{
		if (yNamedElementEClass == null) {
			yNamedElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YammDiagramPackage.eNS_URI).getEClassifiers().get(11);
		}
		return yNamedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYNamedElement_Name()
	{
        return (EAttribute)getYNamedElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYNamespace()
	{
		if (yNamespaceEClass == null) {
			yNamespaceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YammDiagramPackage.eNS_URI).getEClassifiers().get(12);
		}
		return yNamespaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYOperation()
	{
		if (yOperationEClass == null) {
			yOperationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YammDiagramPackage.eNS_URI).getEClassifiers().get(13);
		}
		return yOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYOperation_QualifiedName()
	{
        return (EAttribute)getYOperation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYOperation_OwnedParameter()
	{
        return (EReference)getYOperation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYOperation_StateMachine()
	{
        return (EReference)getYOperation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYOperation_Clazz()
	{
        return (EReference)getYOperation().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYOperation_ReturnType()
	{
        return (EReference)getYOperation().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYOperation_Lower()
	{
        return (EAttribute)getYOperation().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYOperation_Upper()
	{
        return (EAttribute)getYOperation().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYOperation_Signature() {
        return (EAttribute)getYOperation().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYPackage()
	{
		if (yPackageEClass == null) {
			yPackageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YammDiagramPackage.eNS_URI).getEClassifiers().get(14);
		}
		return yPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYPackage_QualifiedName()
	{
        return (EAttribute)getYPackage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYPackage_Package()
	{
        return (EReference)getYPackage().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYPackage_OwnedMemberPackage()
	{
        return (EReference)getYPackage().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYPackageableElement()
	{
		if (yPackageableElementEClass == null) {
			yPackageableElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YammDiagramPackage.eNS_URI).getEClassifiers().get(15);
		}
		return yPackageableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYPackageableElement_ParentElement()
	{
        return (EReference)getYPackageableElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYPackageImport()
	{
		if (yPackageImportEClass == null) {
			yPackageImportEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YammDiagramPackage.eNS_URI).getEClassifiers().get(16);
		}
		return yPackageImportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYPackageImport_ImportedPackage()
	{
        return (EReference)getYPackageImport().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYPackageImport_ImportingNamespace()
	{
        return (EReference)getYPackageImport().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYPackageImport_OwnedComment()
	{
        return (EReference)getYPackageImport().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYPackageImport_OwnedElement()
	{
        return (EReference)getYPackageImport().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYParameter()
	{
		if (yParameterEClass == null) {
			yParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YammDiagramPackage.eNS_URI).getEClassifiers().get(17);
		}
		return yParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYParameter_IsOrdered()
	{
        return (EAttribute)getYParameter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYParameter_IsUnique()
	{
        return (EAttribute)getYParameter().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYParameter_Lower()
	{
        return (EAttribute)getYParameter().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYParameter_Upper()
	{
        return (EAttribute)getYParameter().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYParameter_QualifiedName()
	{
        return (EAttribute)getYParameter().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYParameter_Direction()
	{
        return (EAttribute)getYParameter().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYParameter_DefaultValue()
	{
        return (EAttribute)getYParameter().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYParameter_Description()
	{
        return (EAttribute)getYParameter().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYParameter_Type()
	{
        return (EReference)getYParameter().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYParameter_Signature()
	{
        return (EAttribute)getYParameter().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYParameter_UpperboundWildcard()
	{
        return (EAttribute)getYParameter().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYPrimitiveType()
	{
		if (yPrimitiveTypeEClass == null) {
			yPrimitiveTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YammDiagramPackage.eNS_URI).getEClassifiers().get(19);
		}
		return yPrimitiveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYPrimitiveType_IsAbstract()
	{
        return (EAttribute)getYPrimitiveType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYPrimitiveType_QualifiedName()
	{
        return (EAttribute)getYPrimitiveType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYPrimitiveType_Member()
	{
        return (EReference)getYPrimitiveType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYPrimitiveType_ElementImport()
	{
        return (EReference)getYPrimitiveType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYPrimitiveType_ImportedMember()
	{
        return (EReference)getYPrimitiveType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYPrimitiveType_PackageImport()
	{
        return (EReference)getYPrimitiveType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYPrimitiveType_Attribute()
	{
        return (EReference)getYPrimitiveType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYPrimitiveType_Feature()
	{
        return (EReference)getYPrimitiveType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYPrimitiveType_General()
	{
        return (EReference)getYPrimitiveType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYPrimitiveType_InheritedMember()
	{
        return (EReference)getYPrimitiveType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYPrimitiveType_Package()
	{
        return (EReference)getYPrimitiveType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYPrimitiveType_OwnedComment()
	{
        return (EReference)getYPrimitiveType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYPrimitiveType_OwnedElement()
	{
        return (EReference)getYPrimitiveType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYPrimitiveType_OwnedMember()
	{
        return (EReference)getYPrimitiveType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYPrimitiveType_OwnedRule()
	{
        return (EReference)getYPrimitiveType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYProperty()
	{
		if (yPropertyEClass == null) {
			yPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YammDiagramPackage.eNS_URI).getEClassifiers().get(20);
		}
		return yPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYProperty_IsOrdered()
	{
        return (EAttribute)getYProperty().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYProperty_IsDerived()
	{
        return (EAttribute)getYProperty().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYProperty_IsDerivedUnion()
	{
        return (EAttribute)getYProperty().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYProperty_Association()
	{
        return (EAttribute)getYProperty().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYProperty_QualifiedName()
	{
        return (EAttribute)getYProperty().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYProperty_IsUnique()
	{
        return (EAttribute)getYProperty().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYProperty_Lower()
	{
        return (EAttribute)getYProperty().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYProperty_Upper()
	{
        return (EAttribute)getYProperty().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYProperty_Aggregation()
	{
        return (EAttribute)getYProperty().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYProperty_DefaultValue()
	{
        return (EAttribute)getYProperty().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYProperty_Description()
	{
        return (EAttribute)getYProperty().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYProperty_FeaturingClassifier()
	{
        return (EReference)getYProperty().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYProperty_Type()
	{
        return (EReference)getYProperty().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYProperty_SubsettedProperty()
	{
        return (EReference)getYProperty().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYProperty_Opposite()
	{
        return (EReference)getYProperty().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYProperty_OwnedComment()
	{
        return (EReference)getYProperty().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYProperty_OwnedElement()
	{
        return (EReference)getYProperty().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYProperty_Clazz()
	{
        return (EReference)getYProperty().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYProperty_Signature()
	{
        return (EAttribute)getYProperty().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYProperty_Visibility()
	{
        return (EAttribute)getYProperty().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYProperty_Observe() {
        return (EAttribute)getYProperty().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYProperty_Invariant() {
        return (EAttribute)getYProperty().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYProperty_Static() {
        return (EAttribute)getYProperty().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYType()
	{
		if (yTypeEClass == null) {
			yTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YammDiagramPackage.eNS_URI).getEClassifiers().get(21);
		}
		return yTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYStateMachine()
	{
		if (yStateMachineEClass == null) {
			yStateMachineEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YammDiagramPackage.eNS_URI).getEClassifiers().get(22);
		}
		return yStateMachineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYStateMachine_InitialActive()
	{
        return (EAttribute)getYStateMachine().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYStateMachine_QualifiedName()
	{
        return (EAttribute)getYStateMachine().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYStateMachine_Rtc()
	{
        return (EAttribute)getYStateMachine().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYStateMachine_MaxEffectsToBeProcessed()
	{
        return (EAttribute)getYStateMachine().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYStateMachine_CalledOperation()
	{
        return (EReference)getYStateMachine().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYStateMachine_OwnedComment()
	{
        return (EReference)getYStateMachine().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYStateMachine_OwnedElement()
	{
        return (EReference)getYStateMachine().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYStateMachine_Transition()
	{
        return (EReference)getYStateMachine().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYStateMachine_Subvertex()
	{
        return (EReference)getYStateMachine().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYStateMachine_TrAttach()
	{
        return (EReference)getYStateMachine().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYStateMachine_Operation()
	{
        return (EReference)getYStateMachine().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYStateMachine_DesInitializer()
	{
        return (EAttribute)getYStateMachine().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYTransition()
	{
		if (yTransitionEClass == null) {
			yTransitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YammDiagramPackage.eNS_URI).getEClassifiers().get(24);
		}
		return yTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYTransition_QualifiedName()
	{
        return (EAttribute)getYTransition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYTransition_Source()
	{
        return (EReference)getYTransition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYTransition_Target()
	{
        return (EReference)getYTransition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYTransition_Attachment()
	{
        return (EReference)getYTransition().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYTransition_OwnedComment()
	{
        return (EReference)getYTransition().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYTransition_OwnedElement()
	{
        return (EReference)getYTransition().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYTrAttachment()
	{
		if (yTrAttachmentEClass == null) {
			yTrAttachmentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YammDiagramPackage.eNS_URI).getEClassifiers().get(25);
		}
		return yTrAttachmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYTrAttachment_QualifiedName()
	{
        return (EAttribute)getYTrAttachment().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYTrAttachment_Transition()
	{
        return (EReference)getYTrAttachment().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYTrAttachment_Effects()
	{
        return (EReference)getYTrAttachment().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYTrAttachment_Guard()
	{
        return (EReference)getYTrAttachment().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYTrAttachment_GuardStringRep()
	{
        return (EAttribute)getYTrAttachment().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYEffect()
	{
		if (yEffectEClass == null) {
			yEffectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YammDiagramPackage.eNS_URI).getEClassifiers().get(26);
		}
		return yEffectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYEffect_Body()
	{
        return (EReference)getYEffect().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYEffect_Breakpoint()
	{
        return (EAttribute)getYEffect().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYEffect_EffectStringRep()
	{
        return (EAttribute)getYEffect().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYVertex()
	{
		if (yVertexEClass == null) {
			yVertexEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YammDiagramPackage.eNS_URI).getEClassifiers().get(27);
		}
		return yVertexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYVertex_Outgoing()
	{
        return (EReference)getYVertex().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYVertex_Incoming()
	{
        return (EReference)getYVertex().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYPseudostate()
	{
		if (yPseudostateEClass == null) {
			yPseudostateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YammDiagramPackage.eNS_URI).getEClassifiers().get(28);
		}
		return yPseudostateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYPseudostate_QualifiedName()
	{
        return (EAttribute)getYPseudostate().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYFinalState()
	{
		if (yFinalStateEClass == null) {
			yFinalStateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YammDiagramPackage.eNS_URI).getEClassifiers().get(29);
		}
		return yFinalStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYFinalState_QualifiedName()
	{
        return (EAttribute)getYFinalState().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYState()
	{
		if (yStateEClass == null) {
			yStateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YammDiagramPackage.eNS_URI).getEClassifiers().get(30);
		}
		return yStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYState_QualifiedName()
	{
        return (EAttribute)getYState().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYState_StateName() {
        return (EAttribute)getYState().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYModel()
	{
		if (yModelEClass == null) {
			yModelEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YammDiagramPackage.eNS_URI).getEClassifiers().get(31);
		}
		return yModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYModel_Clazz()
	{
        return (EReference)getYModel().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYModel_Enumerations()
	{
        return (EReference)getYModel().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYModel_Packages()
	{
        return (EReference)getYModel().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYModel_Objects()
	{
        return (EReference)getYModel().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYModel_SharedEdges()
	{
        return (EReference)getYModel().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYModel_CompositeEdges()
	{
        return (EReference)getYModel().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYSharedEdge()
	{
		if (ySharedEdgeEClass == null) {
			ySharedEdgeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YammDiagramPackage.eNS_URI).getEClassifiers().get(32);
		}
		return ySharedEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYSharedEdge_Description()
	{
        return (EAttribute)getYSharedEdge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYSharedEdge_Source()
	{
        return (EReference)getYSharedEdge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYSharedEdge_Target()
	{
        return (EReference)getYSharedEdge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYCompositeEdge()
	{
		if (yCompositeEdgeEClass == null) {
			yCompositeEdgeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YammDiagramPackage.eNS_URI).getEClassifiers().get(33);
		}
		return yCompositeEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYCompositeEdge_Description()
	{
        return (EAttribute)getYCompositeEdge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYCompositeEdge_Source()
	{
        return (EReference)getYCompositeEdge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYCompositeEdge_Target()
	{
        return (EReference)getYCompositeEdge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYObject()
	{
		if (yObjectEClass == null) {
			yObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YammDiagramPackage.eNS_URI).getEClassifiers().get(34);
		}
		return yObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYObject_ObjectID()
	{
        return (EAttribute)getYObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYObject_DslInfo()
	{
        return (EReference)getYObject().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYStateMachineHandler()
	{
		if (yStateMachineHandlerEClass == null) {
			yStateMachineHandlerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YammDiagramPackage.eNS_URI).getEClassifiers().get(35);
		}
		return yStateMachineHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYStateMachineHandler_State()
	{
        return (EReference)getYStateMachineHandler().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYStateMachineHandler_Transition()
	{
        return (EReference)getYStateMachineHandler().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYStateMachineHandler_IsSuspended()
	{
        return (EAttribute)getYStateMachineHandler().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYStateMachineHandler_EffectCount()
	{
        return (EAttribute)getYStateMachineHandler().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYStateMachineHandler_EffectNo()
	{
        return (EAttribute)getYStateMachineHandler().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYStateMachineHandler_StateMachine()
	{
        return (EReference)getYStateMachineHandler().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYStateMachineHandler_Effect()
	{
        return (EAttribute)getYStateMachineHandler().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYStateMachineHandler_CalledFrom()
	{
        return (EReference)getYStateMachineHandler().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYStateMachineHandler_ItsClassID()
	{
        return (EAttribute)getYStateMachineHandler().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYStateMachineHandler_OperationInstance()
	{
        return (EReference)getYStateMachineHandler().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYStateMachineHandler_EffectsProcessed()
	{
        return (EAttribute)getYStateMachineHandler().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYStateMachineHandler_MaxEffectsToBeProcessed()
	{
        return (EAttribute)getYStateMachineHandler().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYStateMachineHandler_InAdapters()
	{
        return (EAttribute)getYStateMachineHandler().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYStateMachineHandler_ObjectsBindedWithInoutParameters()
	{
        return (EAttribute)getYStateMachineHandler().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYStateMachineHandler_ReturnVar()
	{
        return (EAttribute)getYStateMachineHandler().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYStateMachineHandler_NameOfRetunVar()
	{
        return (EAttribute)getYStateMachineHandler().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYStateMachineHandler_ObjectsToColor()
	{
        return (EAttribute)getYStateMachineHandler().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYGlobalStateMachine()
	{
		if (yGlobalStateMachineEClass == null) {
			yGlobalStateMachineEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YammDiagramPackage.eNS_URI).getEClassifiers().get(36);
		}
		return yGlobalStateMachineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYGlobalStateMachine_StateMachines()
	{
        return (EReference)getYGlobalStateMachine().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYGlobalStateMachine_StateMachineHandlers()
	{
        return (EReference)getYGlobalStateMachine().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYGlobalStateMachine_StateMachineHandlerCount()
	{
        return (EAttribute)getYGlobalStateMachine().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYGlobalStateMachine_ConstraintsAllTrue()
	{
        return (EAttribute)getYGlobalStateMachine().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYGlobalStateMachine_HasReturnParam()
	{
        return (EAttribute)getYGlobalStateMachine().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYGlobalStateMachine_ParamCount()
	{
        return (EAttribute)getYGlobalStateMachine().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYGlobalStateMachine_StateExitCount()
	{
        return (EAttribute)getYGlobalStateMachine().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYGlobalStateMachine_StateExitNo()
	{
        return (EAttribute)getYGlobalStateMachine().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYGlobalStateMachine_O()
	{
        return (EReference)getYGlobalStateMachine().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYGlobalStateMachine_ObserverActive()
	{
        return (EAttribute)getYGlobalStateMachine().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYCreateInstanceExpression()
	{
		if (yCreateInstanceExpressionEClass == null) {
			yCreateInstanceExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YammDiagramPackage.eNS_URI).getEClassifiers().get(38);
		}
		return yCreateInstanceExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYCreateInstanceExpression_Clazz()
	{
        return (EReference)getYCreateInstanceExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYCreateInstanceExpression_Feature()
	{
        return (EReference)getYCreateInstanceExpression().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYPrintExpression()
	{
		if (yPrintExpressionEClass == null) {
			yPrintExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YammDiagramPackage.eNS_URI).getEClassifiers().get(39);
		}
		return yPrintExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYPrintExpression_Expression()
	{
        return (EReference)getYPrintExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYSetReturnValue()
	{
		if (ySetReturnValueEClass == null) {
			ySetReturnValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YammDiagramPackage.eNS_URI).getEClassifiers().get(40);
		}
		return ySetReturnValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYSetReturnValue_Value()
	{
        return (EReference)getYSetReturnValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYGetInstancesOfExpression()
	{
		if (yGetInstancesOfExpressionEClass == null) {
			yGetInstancesOfExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YammDiagramPackage.eNS_URI).getEClassifiers().get(42);
		}
		return yGetInstancesOfExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYGetInstancesOfExpression_Clazz()
	{
        return (EReference)getYGetInstancesOfExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYMemberFeatureCall()
	{
		if (yMemberFeatureCallEClass == null) {
			yMemberFeatureCallEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YammDiagramPackage.eNS_URI).getEClassifiers().get(43);
		}
		return yMemberFeatureCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYMemberFeatureCall_InheritanceType()
	{
        return (EReference)getYMemberFeatureCall().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYMemberFeatureCall_ExplicitInheritanceType()
	{
        return (EAttribute)getYMemberFeatureCall().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYFeatureCall()
	{
		if (yFeatureCallEClass == null) {
			yFeatureCallEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YammDiagramPackage.eNS_URI).getEClassifiers().get(44);
		}
		return yFeatureCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYFeatureCall_ExplicitInheritanceType()
	{
        return (EAttribute)getYFeatureCall().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYFeatureCall_InheritanceType()
	{
        return (EReference)getYFeatureCall().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYGetObjectManagement()
	{
		if (yGetObjectManagementEClass == null) {
			yGetObjectManagementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YammDiagramPackage.eNS_URI).getEClassifiers().get(45);
		}
		return yGetObjectManagementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYGetObjectManagement_Parameter()
	{
        return (EReference)getYGetObjectManagement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYGetLayerInformation()
	{
		if (yGetLayerInformationEClass == null) {
			yGetLayerInformationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YammDiagramPackage.eNS_URI).getEClassifiers().get(46);
		}
		return yGetLayerInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYGetLayerInformation_Parameter()
	{
        return (EReference)getYGetLayerInformation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYColorDFAObject()
	{
		if (yColorDFAObjectEClass == null) {
			yColorDFAObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YammDiagramPackage.eNS_URI).getEClassifiers().get(47);
		}
		return yColorDFAObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYColorDFAObject_Id()
	{
        return (EReference)getYColorDFAObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYGetInstances()
	{
		if (yGetInstancesEClass == null) {
			yGetInstancesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YammDiagramPackage.eNS_URI).getEClassifiers().get(48);
		}
		return yGetInstancesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYGetInstances_Parameter()
	{
        return (EReference)getYGetInstances().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYCountFinalStates()
	{
		if (yCountFinalStatesEClass == null) {
			yCountFinalStatesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YammDiagramPackage.eNS_URI).getEClassifiers().get(49);
		}
		return yCountFinalStatesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYCountFinalStates_Parameter()
	{
        return (EReference)getYCountFinalStates().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYCountInitialStates()
	{
		if (yCountInitialStatesEClass == null) {
			yCountInitialStatesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YammDiagramPackage.eNS_URI).getEClassifiers().get(50);
		}
		return yCountInitialStatesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYCountInitialStates_Parameter()
	{
        return (EReference)getYCountInitialStates().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYCountStates()
	{
		if (yCountStatesEClass == null) {
			yCountStatesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YammDiagramPackage.eNS_URI).getEClassifiers().get(51);
		}
		return yCountStatesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYCountStates_Parameter()
	{
        return (EReference)getYCountStates().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYSetAbsoluteNodePropability()
	{
		if (ySetAbsoluteNodePropabilityEClass == null) {
			ySetAbsoluteNodePropabilityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YammDiagramPackage.eNS_URI).getEClassifiers().get(52);
		}
		return ySetAbsoluteNodePropabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYSetAbsoluteNodePropability_Parameter()
	{
        return (EReference)getYSetAbsoluteNodePropability().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYCountReachableStates()
	{
		if (yCountReachableStatesEClass == null) {
			yCountReachableStatesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YammDiagramPackage.eNS_URI).getEClassifiers().get(53);
		}
		return yCountReachableStatesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYCountReachableStates_Parameter()
	{
        return (EReference)getYCountReachableStates().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYCountInValidTransitions()
	{
		if (yCountInValidTransitionsEClass == null) {
			yCountInValidTransitionsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YammDiagramPackage.eNS_URI).getEClassifiers().get(54);
		}
		return yCountInValidTransitionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYCountInValidTransitions_Parameter()
	{
        return (EReference)getYCountInValidTransitions().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYSetPopulationSize()
	{
		if (ySetPopulationSizeEClass == null) {
			ySetPopulationSizeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YammDiagramPackage.eNS_URI).getEClassifiers().get(55);
		}
		return ySetPopulationSizeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYSetPopulationSize_Parameter()
	{
        return (EReference)getYSetPopulationSize().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYLoadModel()
	{
		if (yLoadModelEClass == null) {
			yLoadModelEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YammDiagramPackage.eNS_URI).getEClassifiers().get(56);
		}
		return yLoadModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYLoadModel_RelModelPath()
	{
        return (EReference)getYLoadModel().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDslInfo()
	{
		if (dslInfoEClass == null) {
			dslInfoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YammDiagramPackage.eNS_URI).getEClassifiers().get(57);
		}
		return dslInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDslInfo_Features()
	{
        return (EReference)getDslInfo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDslInfo_FirstLine()
	{
        return (EReference)getDslInfo().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDslInfo_LastLine()
	{
        return (EReference)getDslInfo().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureInfo()
	{
		if (featureInfoEClass == null) {
			featureInfoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YammDiagramPackage.eNS_URI).getEClassifiers().get(58);
		}
		return featureInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleLinePropertyInfo()
	{
		if (singleLinePropertyInfoEClass == null) {
			singleLinePropertyInfoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YammDiagramPackage.eNS_URI).getEClassifiers().get(59);
		}
		return singleLinePropertyInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleLinePropertyInfo_Line()
	{
        return (EReference)getSingleLinePropertyInfo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuardInfo()
	{
		if (guardInfoEClass == null) {
			guardInfoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YammDiagramPackage.eNS_URI).getEClassifiers().get(60);
		}
		return guardInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuardInfo_FirstLineGuard()
	{
        return (EReference)getGuardInfo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuardInfo_LastLineGuard()
	{
        return (EReference)getGuardInfo().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuardInfo_IgnoreNotification()
	{
        return (EAttribute)getGuardInfo().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEffectInfo()
	{
		if (effectInfoEClass == null) {
			effectInfoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YammDiagramPackage.eNS_URI).getEClassifiers().get(61);
		}
		return effectInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEffectInfo_FirstLineEffect()
	{
        return (EReference)getEffectInfo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEffectInfo_LastLineEffect()
	{
        return (EReference)getEffectInfo().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEffectInfo_IgnoreNotification()
	{
        return (EAttribute)getEffectInfo().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainmentInfo()
	{
		if (containmentInfoEClass == null) {
			containmentInfoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YammDiagramPackage.eNS_URI).getEClassifiers().get(62);
		}
		return containmentInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainmentInfo_InsertionLine()
	{
        return (EReference)getContainmentInfo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEStructuralFeatureToFeatureInfoMap()
	{
		if (eStructuralFeatureToFeatureInfoMapEClass == null) {
			eStructuralFeatureToFeatureInfoMapEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YammDiagramPackage.eNS_URI).getEClassifiers().get(63);
		}
		return eStructuralFeatureToFeatureInfoMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEStructuralFeatureToFeatureInfoMap_Key()
	{
        return (EReference)getEStructuralFeatureToFeatureInfoMap().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEStructuralFeatureToFeatureInfoMap_Value()
	{
        return (EReference)getEStructuralFeatureToFeatureInfoMap().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLine()
	{
		if (lineEClass == null) {
			lineEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YammDiagramPackage.eNS_URI).getEClassifiers().get(64);
		}
		return lineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLine_Pos()
	{
        return (EAttribute)getLine().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLine_ProcessedOffsets()
	{
        return (EAttribute)getLine().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYStructure()
	{
		if (yStructureEClass == null) {
			yStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YammDiagramPackage.eNS_URI).getEClassifiers().get(65);
		}
		return yStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYObserverAddValue() {
		if (yObserverAddValueEClass == null) {
			yObserverAddValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YammDiagramPackage.eNS_URI).getEClassifiers().get(66);
		}
		return yObserverAddValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYObserverAddValue_Parameter() {
        return (EReference)getYObserverAddValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getYAggregationKind()
	{
		if (yAggregationKindEEnum == null) {
			yAggregationKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(YammDiagramPackage.eNS_URI).getEClassifiers().get(0);
		}
		return yAggregationKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getYParameterDirectionKind()
	{
		if (yParameterDirectionKindEEnum == null) {
			yParameterDirectionKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(YammDiagramPackage.eNS_URI).getEClassifiers().get(18);
		}
		return yParameterDirectionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getYRunToCompletion()
	{
		if (yRunToCompletionEEnum == null) {
			yRunToCompletionEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(YammDiagramPackage.eNS_URI).getEClassifiers().get(23);
		}
		return yRunToCompletionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getYVisibilityKind()
	{
		if (yVisibilityKindEEnum == null) {
			yVisibilityKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(YammDiagramPackage.eNS_URI).getEClassifiers().get(41);
		}
		return yVisibilityKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEString2()
	{
		if (eString2EDataType == null) {
			eString2EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(YammDiagramPackage.eNS_URI).getEClassifiers().get(37);
		}
		return eString2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YammDiagramFactory getYammDiagramFactory()
	{
		return (YammDiagramFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage()
	{
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents()
	{
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier)
	{
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("online.yamm.coreModelDiagram.yammDiagram." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //YammDiagramPackageImpl
