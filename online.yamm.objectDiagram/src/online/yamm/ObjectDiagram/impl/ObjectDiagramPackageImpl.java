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
package online.yamm.ObjectDiagram.impl;

import java.util.Map;
import online.yamm.ObjectDiagram.ODAttribute;
import online.yamm.ObjectDiagram.ODDateType;
import online.yamm.ObjectDiagram.ODObject;
import online.yamm.ObjectDiagram.ODReference;
import online.yamm.ObjectDiagram.ODStackframe;
import online.yamm.ObjectDiagram.ODType;
import online.yamm.ObjectDiagram.ObjectDiagram;
import online.yamm.ObjectDiagram.ObjectDiagramFactory;
import online.yamm.ObjectDiagram.ObjectDiagramPackage;

import online.yamm.coreModelXmi.yamm.YammPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xtext.common.types.TypesPackage;

import org.eclipse.xtext.xbase.XbasePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ObjectDiagramPackageImpl extends EPackageImpl implements ObjectDiagramPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass odObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass odTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass odReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass odDateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass odAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass odStackframeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eStringToODTypeMapEClass = null;

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
	 * @see online.yamm.ObjectDiagram.ObjectDiagramPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ObjectDiagramPackageImpl() {
		super(eNS_URI, ObjectDiagramFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ObjectDiagramPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ObjectDiagramPackage init() {
		if (isInited) return (ObjectDiagramPackage)EPackage.Registry.INSTANCE.getEPackage(ObjectDiagramPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredObjectDiagramPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ObjectDiagramPackageImpl theObjectDiagramPackage = registeredObjectDiagramPackage instanceof ObjectDiagramPackageImpl ? (ObjectDiagramPackageImpl)registeredObjectDiagramPackage : new ObjectDiagramPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		XbasePackage.eINSTANCE.eClass();
		YammPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theObjectDiagramPackage.createPackageContents();

		// Initialize created meta-data
		theObjectDiagramPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theObjectDiagramPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ObjectDiagramPackage.eNS_URI, theObjectDiagramPackage);
		return theObjectDiagramPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectDiagram() {
		return objectDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectDiagram_Objects() {
		return (EReference)objectDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectDiagram_Types() {
		return (EReference)objectDiagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectDiagram_DataTypes() {
		return (EReference)objectDiagramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectDiagram_Stackframes() {
		return (EReference)objectDiagramEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectDiagram_YammModelPath() {
		return (EAttribute)objectDiagramEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectDiagram_MetaDataPackage() {
		return (EReference)objectDiagramEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectDiagram_TypeObjectCreate() {
		return (EReference)objectDiagramEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectDiagram_InitialModel() {
		return (EReference)objectDiagramEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getODObject() {
		return odObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getODObject_ObjectID() {
		return (EAttribute)odObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getODObject_Type() {
		return (EReference)odObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getODObject_References() {
		return (EReference)odObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getODObject_Attributes() {
		return (EReference)odObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getODObject_RuntimeObject() {
		return (EReference)odObjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getODType() {
		return odTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getODType_Name() {
		return (EAttribute)odTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getODType_QualifiedName() {
		return (EAttribute)odTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getODType_RuntimeType() {
		return (EReference)odTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getODType_YammType() {
		return (EReference)odTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getODType_ObjectID() {
		return (EAttribute)odTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getODReference() {
		return odReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getODReference_Name() {
		return (EAttribute)odReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getODReference_Type() {
		return (EReference)odReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getODReference_Containment() {
		return (EAttribute)odReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getODReference_Opposites() {
		return (EReference)odReferenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getODReference_Lower() {
		return (EAttribute)odReferenceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getODReference_Upper() {
		return (EAttribute)odReferenceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getODReference_Value() {
		return (EReference)odReferenceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getODReference_Bidirectional() {
		return (EAttribute)odReferenceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getODDateType() {
		return odDateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getODDateType_Enum() {
		return (EAttribute)odDateTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getODAttribute() {
		return odAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getODAttribute_DataType() {
		return (EReference)odAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getODAttribute_Lower() {
		return (EAttribute)odAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getODAttribute_Upper() {
		return (EAttribute)odAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getODAttribute_Name() {
		return (EAttribute)odAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getODAttribute_Value() {
		return (EAttribute)odAttributeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getODStackframe() {
		return odStackframeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getODStackframe_ParameterPrimitive() {
		return (EReference)odStackframeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getODStackframe_ParametersObjects() {
		return (EReference)odStackframeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getODStackframe_ContainingObject() {
		return (EReference)odStackframeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getODStackframe_OperationName() {
		return (EAttribute)odStackframeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEStringToODTypeMap() {
		return eStringToODTypeMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStringToODTypeMap_Key() {
		return (EAttribute)eStringToODTypeMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEStringToODTypeMap_Value() {
		return (EReference)eStringToODTypeMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectDiagramFactory getObjectDiagramFactory() {
		return (ObjectDiagramFactory)getEFactoryInstance();
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
		objectDiagramEClass = createEClass(OBJECT_DIAGRAM);
		createEReference(objectDiagramEClass, OBJECT_DIAGRAM__OBJECTS);
		createEReference(objectDiagramEClass, OBJECT_DIAGRAM__TYPES);
		createEReference(objectDiagramEClass, OBJECT_DIAGRAM__DATA_TYPES);
		createEReference(objectDiagramEClass, OBJECT_DIAGRAM__STACKFRAMES);
		createEAttribute(objectDiagramEClass, OBJECT_DIAGRAM__YAMM_MODEL_PATH);
		createEReference(objectDiagramEClass, OBJECT_DIAGRAM__META_DATA_PACKAGE);
		createEReference(objectDiagramEClass, OBJECT_DIAGRAM__TYPE_OBJECT_CREATE);
		createEReference(objectDiagramEClass, OBJECT_DIAGRAM__INITIAL_MODEL);

		odObjectEClass = createEClass(OD_OBJECT);
		createEAttribute(odObjectEClass, OD_OBJECT__OBJECT_ID);
		createEReference(odObjectEClass, OD_OBJECT__TYPE);
		createEReference(odObjectEClass, OD_OBJECT__REFERENCES);
		createEReference(odObjectEClass, OD_OBJECT__ATTRIBUTES);
		createEReference(odObjectEClass, OD_OBJECT__RUNTIME_OBJECT);

		odTypeEClass = createEClass(OD_TYPE);
		createEAttribute(odTypeEClass, OD_TYPE__NAME);
		createEAttribute(odTypeEClass, OD_TYPE__QUALIFIED_NAME);
		createEReference(odTypeEClass, OD_TYPE__RUNTIME_TYPE);
		createEReference(odTypeEClass, OD_TYPE__YAMM_TYPE);
		createEAttribute(odTypeEClass, OD_TYPE__OBJECT_ID);

		odReferenceEClass = createEClass(OD_REFERENCE);
		createEAttribute(odReferenceEClass, OD_REFERENCE__NAME);
		createEReference(odReferenceEClass, OD_REFERENCE__TYPE);
		createEAttribute(odReferenceEClass, OD_REFERENCE__CONTAINMENT);
		createEReference(odReferenceEClass, OD_REFERENCE__OPPOSITES);
		createEAttribute(odReferenceEClass, OD_REFERENCE__LOWER);
		createEAttribute(odReferenceEClass, OD_REFERENCE__UPPER);
		createEReference(odReferenceEClass, OD_REFERENCE__VALUE);
		createEAttribute(odReferenceEClass, OD_REFERENCE__BIDIRECTIONAL);

		odDateTypeEClass = createEClass(OD_DATE_TYPE);
		createEAttribute(odDateTypeEClass, OD_DATE_TYPE__ENUM);

		odAttributeEClass = createEClass(OD_ATTRIBUTE);
		createEAttribute(odAttributeEClass, OD_ATTRIBUTE__NAME);
		createEReference(odAttributeEClass, OD_ATTRIBUTE__DATA_TYPE);
		createEAttribute(odAttributeEClass, OD_ATTRIBUTE__LOWER);
		createEAttribute(odAttributeEClass, OD_ATTRIBUTE__UPPER);
		createEAttribute(odAttributeEClass, OD_ATTRIBUTE__VALUE);

		odStackframeEClass = createEClass(OD_STACKFRAME);
		createEReference(odStackframeEClass, OD_STACKFRAME__PARAMETER_PRIMITIVE);
		createEReference(odStackframeEClass, OD_STACKFRAME__PARAMETERS_OBJECTS);
		createEReference(odStackframeEClass, OD_STACKFRAME__CONTAINING_OBJECT);
		createEAttribute(odStackframeEClass, OD_STACKFRAME__OPERATION_NAME);

		eStringToODTypeMapEClass = createEClass(ESTRING_TO_OD_TYPE_MAP);
		createEAttribute(eStringToODTypeMapEClass, ESTRING_TO_OD_TYPE_MAP__KEY);
		createEReference(eStringToODTypeMapEClass, ESTRING_TO_OD_TYPE_MAP__VALUE);
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

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		YammPackage theYammPackage = (YammPackage)EPackage.Registry.INSTANCE.getEPackage(YammPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		odDateTypeEClass.getESuperTypes().add(this.getODType());

		// Initialize classes, features, and operations; add parameters
		initEClass(objectDiagramEClass, ObjectDiagram.class, "ObjectDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectDiagram_Objects(), this.getODObject(), null, "objects", null, 0, -1, ObjectDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectDiagram_Types(), this.getEStringToODTypeMap(), null, "types", null, 0, -1, ObjectDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectDiagram_DataTypes(), this.getEStringToODTypeMap(), null, "dataTypes", null, 0, -1, ObjectDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectDiagram_Stackframes(), this.getODStackframe(), null, "stackframes", null, 0, -1, ObjectDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectDiagram_YammModelPath(), ecorePackage.getEString(), "yammModelPath", null, 0, 1, ObjectDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectDiagram_MetaDataPackage(), theEcorePackage.getEPackage(), null, "metaDataPackage", null, 0, 1, ObjectDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectDiagram_TypeObjectCreate(), theEcorePackage.getEClass(), null, "typeObjectCreate", null, 0, 1, ObjectDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectDiagram_InitialModel(), this.getODObject(), null, "initialModel", null, 0, -1, ObjectDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(odObjectEClass, ODObject.class, "ODObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getODObject_ObjectID(), ecorePackage.getEString(), "ObjectID", null, 0, 1, ODObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getODObject_Type(), this.getODType(), null, "type", null, 0, 1, ODObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getODObject_References(), this.getODReference(), null, "references", null, 0, -1, ODObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getODObject_Attributes(), this.getODAttribute(), null, "attributes", null, 0, -1, ODObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getODObject_RuntimeObject(), theEcorePackage.getEObject(), null, "runtimeObject", null, 0, 1, ODObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(odTypeEClass, ODType.class, "ODType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getODType_Name(), ecorePackage.getEString(), "name", null, 0, 1, ODType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getODType_QualifiedName(), ecorePackage.getEString(), "qualifiedName", null, 0, 1, ODType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getODType_RuntimeType(), theEcorePackage.getEClassifier(), null, "runtimeType", null, 0, 1, ODType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getODType_YammType(), theYammPackage.getYClass(), null, "yammType", null, 0, 1, ODType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getODType_ObjectID(), ecorePackage.getEString(), "ObjectID", null, 0, 1, ODType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(odReferenceEClass, ODReference.class, "ODReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getODReference_Name(), ecorePackage.getEString(), "name", null, 0, 1, ODReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getODReference_Type(), this.getODType(), null, "type", null, 0, 1, ODReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getODReference_Containment(), ecorePackage.getEBoolean(), "containment", "false", 0, 1, ODReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getODReference_Opposites(), this.getODReference(), null, "opposites", null, 0, -1, ODReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getODReference_Lower(), ecorePackage.getEInt(), "lower", null, 0, 1, ODReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getODReference_Upper(), ecorePackage.getEInt(), "upper", null, 0, 1, ODReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getODReference_Value(), this.getODObject(), null, "value", null, 0, -1, ODReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getODReference_Bidirectional(), ecorePackage.getEBoolean(), "bidirectional", null, 0, 1, ODReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(odDateTypeEClass, ODDateType.class, "ODDateType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getODDateType_Enum(), ecorePackage.getEBoolean(), "enum", null, 0, 1, ODDateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(odAttributeEClass, ODAttribute.class, "ODAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getODAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, ODAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getODAttribute_DataType(), this.getODType(), null, "dataType", null, 0, 1, ODAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getODAttribute_Lower(), ecorePackage.getEInt(), "lower", null, 0, 1, ODAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getODAttribute_Upper(), ecorePackage.getEInt(), "upper", null, 0, 1, ODAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getODAttribute_Value(), ecorePackage.getEString(), "value", null, 0, 1, ODAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(odStackframeEClass, ODStackframe.class, "ODStackframe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getODStackframe_ParameterPrimitive(), this.getODAttribute(), null, "parameterPrimitive", null, 0, -1, ODStackframe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getODStackframe_ParametersObjects(), this.getODReference(), null, "parametersObjects", null, 0, -1, ODStackframe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getODStackframe_ContainingObject(), this.getODObject(), null, "containingObject", null, 0, 1, ODStackframe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getODStackframe_OperationName(), ecorePackage.getEString(), "operationName", null, 0, 1, ODStackframe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eStringToODTypeMapEClass, Map.Entry.class, "EStringToODTypeMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEStringToODTypeMap_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEStringToODTypeMap_Value(), this.getODType(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ObjectDiagramPackageImpl
