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
/**
 */
package dev.yamm.coreModelDiagram.yammDiagram;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.xtext.xbase.XbasePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see dev.yamm.coreModelDiagram.yammDiagram.YammDiagramFactory
 * @model kind="package"
 * @generated
 */
public interface YammDiagramPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "yammDiagram";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.yamm.dev/coreModelDiagram/YammDiagram";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "yammDiagram";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	YammDiagramPackage eINSTANCE = dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl.init();

	/**
	 * The meta object id for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YObjectImpl <em>YObject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YObjectImpl
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYObject()
	 * @generated
	 */
	int YOBJECT = 31;

	/**
	 * The feature id for the '<em><b>Object ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOBJECT__OBJECT_ID = 0;

	/**
	 * The feature id for the '<em><b>Dsl Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOBJECT__DSL_INFO = 1;

	/**
	 * The number of structural features of the '<em>YObject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOBJECT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YElementImpl <em>YElement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YElementImpl
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYElement()
	 * @generated
	 */
	int YELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Object ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YELEMENT__OBJECT_ID = YOBJECT__OBJECT_ID;

	/**
	 * The feature id for the '<em><b>Dsl Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YELEMENT__DSL_INFO = YOBJECT__DSL_INFO;

	/**
	 * The number of structural features of the '<em>YElement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YELEMENT_FEATURE_COUNT = YOBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YClassImpl <em>YClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YClassImpl
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYClass()
	 * @generated
	 */
	int YCLASS = 0;

	/**
	 * The feature id for the '<em><b>Object ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCLASS__OBJECT_ID = YELEMENT__OBJECT_ID;

	/**
	 * The feature id for the '<em><b>Dsl Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCLASS__DSL_INFO = YELEMENT__DSL_INFO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCLASS__NAME = YELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCLASS__PARENT_ELEMENT = YELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCLASS__IS_ABSTRACT = YELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCLASS__QUALIFIED_NAME = YELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCLASS__PACKAGE = YELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCLASS__SUPER_CLASS = YELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCLASS__OWNED_ATTRIBUTE = YELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCLASS__OWNED_OPERATION = YELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Observe Queue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCLASS__OBSERVE_QUEUE = YELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>YClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCLASS_FEATURE_COUNT = YELEMENT_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YClassifierImpl <em>YClassifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YClassifierImpl
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYClassifier()
	 * @generated
	 */
	int YCLASSIFIER = 1;

	/**
	 * The feature id for the '<em><b>Object ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCLASSIFIER__OBJECT_ID = YOBJECT__OBJECT_ID;

	/**
	 * The feature id for the '<em><b>Dsl Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCLASSIFIER__DSL_INFO = YOBJECT__DSL_INFO;

	/**
	 * The number of structural features of the '<em>YClassifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCLASSIFIER_FEATURE_COUNT = YOBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YCommentImpl <em>YComment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YCommentImpl
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYComment()
	 * @generated
	 */
	int YCOMMENT = 2;

	/**
	 * The feature id for the '<em><b>Object ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOMMENT__OBJECT_ID = YELEMENT__OBJECT_ID;

	/**
	 * The feature id for the '<em><b>Dsl Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOMMENT__DSL_INFO = YELEMENT__DSL_INFO;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOMMENT__BODY = YELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Annotated Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOMMENT__ANNOTATED_ELEMENT = YELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOMMENT__OWNED_COMMENT = YELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOMMENT__OWNED_ELEMENT = YELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>YComment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOMMENT_FEATURE_COUNT = YELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YConstraintImpl <em>YConstraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YConstraintImpl
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYConstraint()
	 * @generated
	 */
	int YCONSTRAINT = 3;

	/**
	 * The feature id for the '<em><b>Object ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCONSTRAINT__OBJECT_ID = YELEMENT__OBJECT_ID;

	/**
	 * The feature id for the '<em><b>Dsl Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCONSTRAINT__DSL_INFO = YELEMENT__DSL_INFO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCONSTRAINT__NAME = YELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCONSTRAINT__PARENT_ELEMENT = YELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCONSTRAINT__QUALIFIED_NAME = YELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Constrained Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCONSTRAINT__CONSTRAINED_ELEMENT = YELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCONSTRAINT__OWNED_COMMENT = YELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCONSTRAINT__OWNED_ELEMENT = YELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCONSTRAINT__SPECIFICATION = YELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>YConstraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCONSTRAINT_FEATURE_COUNT = YELEMENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YDataTypeImpl <em>YData Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YDataTypeImpl
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYDataType()
	 * @generated
	 */
	int YDATA_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Object ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDATA_TYPE__OBJECT_ID = YOBJECT__OBJECT_ID;

	/**
	 * The feature id for the '<em><b>Dsl Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDATA_TYPE__DSL_INFO = YOBJECT__DSL_INFO;

	/**
	 * The number of structural features of the '<em>YData Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDATA_TYPE_FEATURE_COUNT = YOBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YElementImportImpl <em>YElement Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YElementImportImpl
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYElementImport()
	 * @generated
	 */
	int YELEMENT_IMPORT = 6;

	/**
	 * The feature id for the '<em><b>Object ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YELEMENT_IMPORT__OBJECT_ID = YELEMENT__OBJECT_ID;

	/**
	 * The feature id for the '<em><b>Dsl Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YELEMENT_IMPORT__DSL_INFO = YELEMENT__DSL_INFO;

	/**
	 * The feature id for the '<em><b>Imported Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YELEMENT_IMPORT__IMPORTED_ELEMENT = YELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Importing Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YELEMENT_IMPORT__IMPORTING_NAMESPACE = YELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YELEMENT_IMPORT__OWNED_COMMENT = YELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YELEMENT_IMPORT__OWNED_ELEMENT = YELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>YElement Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YELEMENT_IMPORT_FEATURE_COUNT = YELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YEnumerationImpl <em>YEnumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YEnumerationImpl
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYEnumeration()
	 * @generated
	 */
	int YENUMERATION = 7;

	/**
	 * The feature id for the '<em><b>Object ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YENUMERATION__OBJECT_ID = YELEMENT__OBJECT_ID;

	/**
	 * The feature id for the '<em><b>Dsl Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YENUMERATION__DSL_INFO = YELEMENT__DSL_INFO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YENUMERATION__NAME = YELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YENUMERATION__PARENT_ELEMENT = YELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YENUMERATION__IS_ABSTRACT = YELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YENUMERATION__QUALIFIED_NAME = YELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YENUMERATION__MEMBER = YELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YENUMERATION__ELEMENT_IMPORT = YELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YENUMERATION__IMPORTED_MEMBER = YELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YENUMERATION__PACKAGE_IMPORT = YELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YENUMERATION__ATTRIBUTE = YELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YENUMERATION__FEATURE = YELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YENUMERATION__GENERAL = YELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Inherited Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YENUMERATION__INHERITED_MEMBER = YELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YENUMERATION__PACKAGE = YELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YENUMERATION__OWNED_COMMENT = YELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YENUMERATION__OWNED_ELEMENT = YELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YENUMERATION__OWNED_MEMBER = YELEMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YENUMERATION__OWNED_RULE = YELEMENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Owned Literal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YENUMERATION__OWNED_LITERAL = YELEMENT_FEATURE_COUNT + 17;

	/**
	 * The number of structural features of the '<em>YEnumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YENUMERATION_FEATURE_COUNT = YELEMENT_FEATURE_COUNT + 18;

	/**
	 * The meta object id for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YEnumerationLiteralImpl <em>YEnumeration Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YEnumerationLiteralImpl
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYEnumerationLiteral()
	 * @generated
	 */
	int YENUMERATION_LITERAL = 8;

	/**
	 * The feature id for the '<em><b>Object ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YENUMERATION_LITERAL__OBJECT_ID = YELEMENT__OBJECT_ID;

	/**
	 * The feature id for the '<em><b>Dsl Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YENUMERATION_LITERAL__DSL_INFO = YELEMENT__DSL_INFO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YENUMERATION_LITERAL__NAME = YELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YENUMERATION_LITERAL__PARENT_ELEMENT = YELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YENUMERATION_LITERAL__QUALIFIED_NAME = YELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YENUMERATION_LITERAL__OWNED_COMMENT = YELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YENUMERATION_LITERAL__OWNED_ELEMENT = YELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>YEnumeration Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YENUMERATION_LITERAL_FEATURE_COUNT = YELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YFeatureImpl <em>YFeature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YFeatureImpl
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYFeature()
	 * @generated
	 */
	int YFEATURE = 9;

	/**
	 * The feature id for the '<em><b>Object ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YFEATURE__OBJECT_ID = YOBJECT__OBJECT_ID;

	/**
	 * The feature id for the '<em><b>Dsl Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YFEATURE__DSL_INFO = YOBJECT__DSL_INFO;

	/**
	 * The number of structural features of the '<em>YFeature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YFEATURE_FEATURE_COUNT = YOBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YNamedElementImpl <em>YNamed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YNamedElementImpl
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYNamedElement()
	 * @generated
	 */
	int YNAMED_ELEMENT = 10;

	/**
	 * The feature id for the '<em><b>Object ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNAMED_ELEMENT__OBJECT_ID = YOBJECT__OBJECT_ID;

	/**
	 * The feature id for the '<em><b>Dsl Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNAMED_ELEMENT__DSL_INFO = YOBJECT__DSL_INFO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNAMED_ELEMENT__NAME = YOBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>YNamed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNAMED_ELEMENT_FEATURE_COUNT = YOBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YNamespaceImpl <em>YNamespace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YNamespaceImpl
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYNamespace()
	 * @generated
	 */
	int YNAMESPACE = 11;

	/**
	 * The feature id for the '<em><b>Object ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNAMESPACE__OBJECT_ID = YOBJECT__OBJECT_ID;

	/**
	 * The feature id for the '<em><b>Dsl Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNAMESPACE__DSL_INFO = YOBJECT__DSL_INFO;

	/**
	 * The number of structural features of the '<em>YNamespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNAMESPACE_FEATURE_COUNT = YOBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YOperationImpl <em>YOperation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YOperationImpl
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYOperation()
	 * @generated
	 */
	int YOPERATION = 12;

	/**
	 * The feature id for the '<em><b>Object ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOPERATION__OBJECT_ID = YELEMENT__OBJECT_ID;

	/**
	 * The feature id for the '<em><b>Dsl Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOPERATION__DSL_INFO = YELEMENT__DSL_INFO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOPERATION__NAME = YELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOPERATION__QUALIFIED_NAME = YELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOPERATION__OWNED_PARAMETER = YELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>State Machine</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOPERATION__STATE_MACHINE = YELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Clazz</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOPERATION__CLAZZ = YELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOPERATION__RETURN_TYPE = YELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOPERATION__LOWER = YELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOPERATION__UPPER = YELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOPERATION__SIGNATURE = YELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>YOperation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOPERATION_FEATURE_COUNT = YELEMENT_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YPackageImpl <em>YPackage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YPackageImpl
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYPackage()
	 * @generated
	 */
	int YPACKAGE = 13;

	/**
	 * The feature id for the '<em><b>Object ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPACKAGE__OBJECT_ID = YELEMENT__OBJECT_ID;

	/**
	 * The feature id for the '<em><b>Dsl Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPACKAGE__DSL_INFO = YELEMENT__DSL_INFO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPACKAGE__NAME = YELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPACKAGE__PARENT_ELEMENT = YELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPACKAGE__QUALIFIED_NAME = YELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPACKAGE__PACKAGE = YELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owned Member Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPACKAGE__OWNED_MEMBER_PACKAGE = YELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>YPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPACKAGE_FEATURE_COUNT = YELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YPackageableElementImpl <em>YPackageable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YPackageableElementImpl
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYPackageableElement()
	 * @generated
	 */
	int YPACKAGEABLE_ELEMENT = 14;

	/**
	 * The feature id for the '<em><b>Object ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPACKAGEABLE_ELEMENT__OBJECT_ID = YOBJECT__OBJECT_ID;

	/**
	 * The feature id for the '<em><b>Dsl Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPACKAGEABLE_ELEMENT__DSL_INFO = YOBJECT__DSL_INFO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPACKAGEABLE_ELEMENT__NAME = YOBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPACKAGEABLE_ELEMENT__PARENT_ELEMENT = YOBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>YPackageable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPACKAGEABLE_ELEMENT_FEATURE_COUNT = YOBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YPackageImportImpl <em>YPackage Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YPackageImportImpl
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYPackageImport()
	 * @generated
	 */
	int YPACKAGE_IMPORT = 15;

	/**
	 * The feature id for the '<em><b>Object ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPACKAGE_IMPORT__OBJECT_ID = YELEMENT__OBJECT_ID;

	/**
	 * The feature id for the '<em><b>Dsl Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPACKAGE_IMPORT__DSL_INFO = YELEMENT__DSL_INFO;

	/**
	 * The feature id for the '<em><b>Imported Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPACKAGE_IMPORT__IMPORTED_PACKAGE = YELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Importing Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPACKAGE_IMPORT__IMPORTING_NAMESPACE = YELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPACKAGE_IMPORT__OWNED_COMMENT = YELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPACKAGE_IMPORT__OWNED_ELEMENT = YELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>YPackage Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPACKAGE_IMPORT_FEATURE_COUNT = YELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YParameterImpl <em>YParameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YParameterImpl
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYParameter()
	 * @generated
	 */
	int YPARAMETER = 16;

	/**
	 * The feature id for the '<em><b>Object ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPARAMETER__OBJECT_ID = YELEMENT__OBJECT_ID;

	/**
	 * The feature id for the '<em><b>Dsl Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPARAMETER__DSL_INFO = YELEMENT__DSL_INFO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPARAMETER__NAME = YELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPARAMETER__IS_ORDERED = YELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPARAMETER__IS_UNIQUE = YELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPARAMETER__LOWER = YELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPARAMETER__UPPER = YELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPARAMETER__QUALIFIED_NAME = YELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPARAMETER__DIRECTION = YELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPARAMETER__DEFAULT_VALUE = YELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPARAMETER__DESCRIPTION = YELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPARAMETER__TYPE = YELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPARAMETER__SIGNATURE = YELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Upperbound Wildcard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPARAMETER__UPPERBOUND_WILDCARD = YELEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>YParameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPARAMETER_FEATURE_COUNT = YELEMENT_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YPrimitiveTypeImpl <em>YPrimitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YPrimitiveTypeImpl
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYPrimitiveType()
	 * @generated
	 */
	int YPRIMITIVE_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Object ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPRIMITIVE_TYPE__OBJECT_ID = YELEMENT__OBJECT_ID;

	/**
	 * The feature id for the '<em><b>Dsl Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPRIMITIVE_TYPE__DSL_INFO = YELEMENT__DSL_INFO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPRIMITIVE_TYPE__NAME = YELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPRIMITIVE_TYPE__PARENT_ELEMENT = YELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPRIMITIVE_TYPE__IS_ABSTRACT = YELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPRIMITIVE_TYPE__QUALIFIED_NAME = YELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPRIMITIVE_TYPE__MEMBER = YELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPRIMITIVE_TYPE__ELEMENT_IMPORT = YELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPRIMITIVE_TYPE__IMPORTED_MEMBER = YELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPRIMITIVE_TYPE__PACKAGE_IMPORT = YELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPRIMITIVE_TYPE__ATTRIBUTE = YELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPRIMITIVE_TYPE__FEATURE = YELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPRIMITIVE_TYPE__GENERAL = YELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Inherited Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPRIMITIVE_TYPE__INHERITED_MEMBER = YELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPRIMITIVE_TYPE__PACKAGE = YELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPRIMITIVE_TYPE__OWNED_COMMENT = YELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPRIMITIVE_TYPE__OWNED_ELEMENT = YELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPRIMITIVE_TYPE__OWNED_MEMBER = YELEMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPRIMITIVE_TYPE__OWNED_RULE = YELEMENT_FEATURE_COUNT + 16;

	/**
	 * The number of structural features of the '<em>YPrimitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPRIMITIVE_TYPE_FEATURE_COUNT = YELEMENT_FEATURE_COUNT + 17;

	/**
	 * The meta object id for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YPropertyImpl <em>YProperty</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YPropertyImpl
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYProperty()
	 * @generated
	 */
	int YPROPERTY = 18;

	/**
	 * The feature id for the '<em><b>Object ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPROPERTY__OBJECT_ID = YELEMENT__OBJECT_ID;

	/**
	 * The feature id for the '<em><b>Dsl Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPROPERTY__DSL_INFO = YELEMENT__DSL_INFO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPROPERTY__NAME = YELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPROPERTY__IS_ORDERED = YELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPROPERTY__IS_DERIVED = YELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Derived Union</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPROPERTY__IS_DERIVED_UNION = YELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Association</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPROPERTY__ASSOCIATION = YELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPROPERTY__QUALIFIED_NAME = YELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPROPERTY__IS_UNIQUE = YELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPROPERTY__LOWER = YELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPROPERTY__UPPER = YELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Aggregation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPROPERTY__AGGREGATION = YELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPROPERTY__DEFAULT_VALUE = YELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPROPERTY__DESCRIPTION = YELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Featuring Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPROPERTY__FEATURING_CLASSIFIER = YELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPROPERTY__TYPE = YELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Subsetted Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPROPERTY__SUBSETTED_PROPERTY = YELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPROPERTY__OPPOSITE = YELEMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPROPERTY__OWNED_COMMENT = YELEMENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPROPERTY__OWNED_ELEMENT = YELEMENT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Clazz</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPROPERTY__CLAZZ = YELEMENT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPROPERTY__SIGNATURE = YELEMENT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPROPERTY__VISIBILITY = YELEMENT_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Observe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPROPERTY__OBSERVE = YELEMENT_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Invariant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPROPERTY__INVARIANT = YELEMENT_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPROPERTY__STATIC = YELEMENT_FEATURE_COUNT + 23;

	/**
	 * The number of structural features of the '<em>YProperty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPROPERTY_FEATURE_COUNT = YELEMENT_FEATURE_COUNT + 24;

	/**
	 * The meta object id for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YTypeImpl <em>YType</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YTypeImpl
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYType()
	 * @generated
	 */
	int YTYPE = 19;

	/**
	 * The feature id for the '<em><b>Object ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTYPE__OBJECT_ID = YOBJECT__OBJECT_ID;

	/**
	 * The feature id for the '<em><b>Dsl Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTYPE__DSL_INFO = YOBJECT__DSL_INFO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTYPE__NAME = YOBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>YType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTYPE_FEATURE_COUNT = YOBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YStateMachineImpl <em>YState Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YStateMachineImpl
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYStateMachine()
	 * @generated
	 */
	int YSTATE_MACHINE = 20;

	/**
	 * The feature id for the '<em><b>Object ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTATE_MACHINE__OBJECT_ID = YELEMENT__OBJECT_ID;

	/**
	 * The feature id for the '<em><b>Dsl Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTATE_MACHINE__DSL_INFO = YELEMENT__DSL_INFO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTATE_MACHINE__NAME = YELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initial Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTATE_MACHINE__INITIAL_ACTIVE = YELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Des Initializer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTATE_MACHINE__DES_INITIALIZER = YELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTATE_MACHINE__QUALIFIED_NAME = YELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rtc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTATE_MACHINE__RTC = YELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Max Effects To Be Processed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTATE_MACHINE__MAX_EFFECTS_TO_BE_PROCESSED = YELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Called Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTATE_MACHINE__CALLED_OPERATION = YELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTATE_MACHINE__OWNED_COMMENT = YELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTATE_MACHINE__OWNED_ELEMENT = YELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTATE_MACHINE__TRANSITION = YELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Subvertex</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTATE_MACHINE__SUBVERTEX = YELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Tr Attach</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTATE_MACHINE__TR_ATTACH = YELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTATE_MACHINE__OPERATION = YELEMENT_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>YState Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTATE_MACHINE_FEATURE_COUNT = YELEMENT_FEATURE_COUNT + 13;

	/**
	 * The meta object id for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YTransitionImpl <em>YTransition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YTransitionImpl
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYTransition()
	 * @generated
	 */
	int YTRANSITION = 21;

	/**
	 * The feature id for the '<em><b>Object ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTRANSITION__OBJECT_ID = YELEMENT__OBJECT_ID;

	/**
	 * The feature id for the '<em><b>Dsl Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTRANSITION__DSL_INFO = YELEMENT__DSL_INFO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTRANSITION__NAME = YELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTRANSITION__QUALIFIED_NAME = YELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTRANSITION__SOURCE = YELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTRANSITION__TARGET = YELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Attachment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTRANSITION__ATTACHMENT = YELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTRANSITION__OWNED_COMMENT = YELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTRANSITION__OWNED_ELEMENT = YELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>YTransition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTRANSITION_FEATURE_COUNT = YELEMENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YTrAttachmentImpl <em>YTr Attachment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YTrAttachmentImpl
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYTrAttachment()
	 * @generated
	 */
	int YTR_ATTACHMENT = 22;

	/**
	 * The feature id for the '<em><b>Object ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTR_ATTACHMENT__OBJECT_ID = YELEMENT__OBJECT_ID;

	/**
	 * The feature id for the '<em><b>Dsl Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTR_ATTACHMENT__DSL_INFO = YELEMENT__DSL_INFO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTR_ATTACHMENT__NAME = YELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTR_ATTACHMENT__QUALIFIED_NAME = YELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTR_ATTACHMENT__TRANSITION = YELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTR_ATTACHMENT__EFFECTS = YELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTR_ATTACHMENT__GUARD = YELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Guard String Rep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTR_ATTACHMENT__GUARD_STRING_REP = YELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>YTr Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTR_ATTACHMENT_FEATURE_COUNT = YELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YEffectImpl <em>YEffect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YEffectImpl
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYEffect()
	 * @generated
	 */
	int YEFFECT = 23;

	/**
	 * The feature id for the '<em><b>Object ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEFFECT__OBJECT_ID = YOBJECT__OBJECT_ID;

	/**
	 * The feature id for the '<em><b>Dsl Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEFFECT__DSL_INFO = YOBJECT__DSL_INFO;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEFFECT__BODY = YOBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Breakpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEFFECT__BREAKPOINT = YOBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Effect String Rep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEFFECT__EFFECT_STRING_REP = YOBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>YEffect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEFFECT_FEATURE_COUNT = YOBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YVertexImpl <em>YVertex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YVertexImpl
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYVertex()
	 * @generated
	 */
	int YVERTEX = 24;

	/**
	 * The feature id for the '<em><b>Object ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVERTEX__OBJECT_ID = YOBJECT__OBJECT_ID;

	/**
	 * The feature id for the '<em><b>Dsl Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVERTEX__DSL_INFO = YOBJECT__DSL_INFO;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVERTEX__OUTGOING = YOBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVERTEX__INCOMING = YOBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>YVertex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVERTEX_FEATURE_COUNT = YOBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YPseudostateImpl <em>YPseudostate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YPseudostateImpl
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYPseudostate()
	 * @generated
	 */
	int YPSEUDOSTATE = 25;

	/**
	 * The feature id for the '<em><b>Object ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPSEUDOSTATE__OBJECT_ID = YELEMENT__OBJECT_ID;

	/**
	 * The feature id for the '<em><b>Dsl Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPSEUDOSTATE__DSL_INFO = YELEMENT__DSL_INFO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPSEUDOSTATE__NAME = YELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPSEUDOSTATE__OUTGOING = YELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPSEUDOSTATE__INCOMING = YELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPSEUDOSTATE__QUALIFIED_NAME = YELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>YPseudostate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPSEUDOSTATE_FEATURE_COUNT = YELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YFinalStateImpl <em>YFinal State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YFinalStateImpl
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYFinalState()
	 * @generated
	 */
	int YFINAL_STATE = 26;

	/**
	 * The feature id for the '<em><b>Object ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YFINAL_STATE__OBJECT_ID = YELEMENT__OBJECT_ID;

	/**
	 * The feature id for the '<em><b>Dsl Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YFINAL_STATE__DSL_INFO = YELEMENT__DSL_INFO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YFINAL_STATE__NAME = YELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YFINAL_STATE__OUTGOING = YELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YFINAL_STATE__INCOMING = YELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YFINAL_STATE__QUALIFIED_NAME = YELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>YFinal State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YFINAL_STATE_FEATURE_COUNT = YELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YStateImpl <em>YState</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YStateImpl
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYState()
	 * @generated
	 */
	int YSTATE = 27;

	/**
	 * The feature id for the '<em><b>Object ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTATE__OBJECT_ID = YELEMENT__OBJECT_ID;

	/**
	 * The feature id for the '<em><b>Dsl Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTATE__DSL_INFO = YELEMENT__DSL_INFO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTATE__NAME = YELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTATE__OUTGOING = YELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTATE__INCOMING = YELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTATE__QUALIFIED_NAME = YELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>State Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTATE__STATE_NAME = YELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>YState</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTATE_FEATURE_COUNT = YELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YModelImpl <em>YModel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YModelImpl
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYModel()
	 * @generated
	 */
	int YMODEL = 28;

	/**
	 * The feature id for the '<em><b>Object ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMODEL__OBJECT_ID = YOBJECT__OBJECT_ID;

	/**
	 * The feature id for the '<em><b>Dsl Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMODEL__DSL_INFO = YOBJECT__DSL_INFO;

	/**
	 * The feature id for the '<em><b>Clazz</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMODEL__CLAZZ = YOBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Enumerations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMODEL__ENUMERATIONS = YOBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMODEL__PACKAGES = YOBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMODEL__OBJECTS = YOBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Shared Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMODEL__SHARED_EDGES = YOBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Composite Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMODEL__COMPOSITE_EDGES = YOBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>YModel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMODEL_FEATURE_COUNT = YOBJECT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YSharedEdgeImpl <em>YShared Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YSharedEdgeImpl
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYSharedEdge()
	 * @generated
	 */
	int YSHARED_EDGE = 29;

	/**
	 * The feature id for the '<em><b>Object ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSHARED_EDGE__OBJECT_ID = YOBJECT__OBJECT_ID;

	/**
	 * The feature id for the '<em><b>Dsl Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSHARED_EDGE__DSL_INFO = YOBJECT__DSL_INFO;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSHARED_EDGE__DESCRIPTION = YOBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSHARED_EDGE__SOURCE = YOBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSHARED_EDGE__TARGET = YOBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>YShared Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSHARED_EDGE_FEATURE_COUNT = YOBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YCompositeEdgeImpl <em>YComposite Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YCompositeEdgeImpl
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYCompositeEdge()
	 * @generated
	 */
	int YCOMPOSITE_EDGE = 30;

	/**
	 * The feature id for the '<em><b>Object ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOMPOSITE_EDGE__OBJECT_ID = YOBJECT__OBJECT_ID;

	/**
	 * The feature id for the '<em><b>Dsl Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOMPOSITE_EDGE__DSL_INFO = YOBJECT__DSL_INFO;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOMPOSITE_EDGE__DESCRIPTION = YOBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOMPOSITE_EDGE__SOURCE = YOBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOMPOSITE_EDGE__TARGET = YOBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>YComposite Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOMPOSITE_EDGE_FEATURE_COUNT = YOBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YStateMachineHandlerImpl <em>YState Machine Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YStateMachineHandlerImpl
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYStateMachineHandler()
	 * @generated
	 */
	int YSTATE_MACHINE_HANDLER = 32;

	/**
	 * The feature id for the '<em><b>Object ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTATE_MACHINE_HANDLER__OBJECT_ID = YOBJECT__OBJECT_ID;

	/**
	 * The feature id for the '<em><b>Dsl Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTATE_MACHINE_HANDLER__DSL_INFO = YOBJECT__DSL_INFO;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTATE_MACHINE_HANDLER__STATE = YOBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTATE_MACHINE_HANDLER__TRANSITION = YOBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Suspended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTATE_MACHINE_HANDLER__IS_SUSPENDED = YOBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Effect Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTATE_MACHINE_HANDLER__EFFECT_COUNT = YOBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Effect No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTATE_MACHINE_HANDLER__EFFECT_NO = YOBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>State Machine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTATE_MACHINE_HANDLER__STATE_MACHINE = YOBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTATE_MACHINE_HANDLER__EFFECT = YOBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Called From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTATE_MACHINE_HANDLER__CALLED_FROM = YOBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Its Class ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTATE_MACHINE_HANDLER__ITS_CLASS_ID = YOBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Operation Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTATE_MACHINE_HANDLER__OPERATION_INSTANCE = YOBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Effects Processed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTATE_MACHINE_HANDLER__EFFECTS_PROCESSED = YOBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Max Effects To Be Processed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTATE_MACHINE_HANDLER__MAX_EFFECTS_TO_BE_PROCESSED = YOBJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>In Adapters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTATE_MACHINE_HANDLER__IN_ADAPTERS = YOBJECT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Objects Binded With Inout Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTATE_MACHINE_HANDLER__OBJECTS_BINDED_WITH_INOUT_PARAMETERS = YOBJECT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Return Var</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTATE_MACHINE_HANDLER__RETURN_VAR = YOBJECT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Name Of Retun Var</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTATE_MACHINE_HANDLER__NAME_OF_RETUN_VAR = YOBJECT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Objects To Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTATE_MACHINE_HANDLER__OBJECTS_TO_COLOR = YOBJECT_FEATURE_COUNT + 16;

	/**
	 * The number of structural features of the '<em>YState Machine Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTATE_MACHINE_HANDLER_FEATURE_COUNT = YOBJECT_FEATURE_COUNT + 17;

	/**
	 * The meta object id for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YGlobalStateMachineImpl <em>YGlobal State Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YGlobalStateMachineImpl
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYGlobalStateMachine()
	 * @generated
	 */
	int YGLOBAL_STATE_MACHINE = 33;

	/**
	 * The feature id for the '<em><b>Object ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YGLOBAL_STATE_MACHINE__OBJECT_ID = YOBJECT__OBJECT_ID;

	/**
	 * The feature id for the '<em><b>Dsl Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YGLOBAL_STATE_MACHINE__DSL_INFO = YOBJECT__DSL_INFO;

	/**
	 * The feature id for the '<em><b>State Machines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YGLOBAL_STATE_MACHINE__STATE_MACHINES = YOBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>State Machine Handlers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YGLOBAL_STATE_MACHINE__STATE_MACHINE_HANDLERS = YOBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>State Machine Handler Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YGLOBAL_STATE_MACHINE__STATE_MACHINE_HANDLER_COUNT = YOBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Constraints All True</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YGLOBAL_STATE_MACHINE__CONSTRAINTS_ALL_TRUE = YOBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Has Return Param</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YGLOBAL_STATE_MACHINE__HAS_RETURN_PARAM = YOBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Param Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YGLOBAL_STATE_MACHINE__PARAM_COUNT = YOBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>State Exit Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YGLOBAL_STATE_MACHINE__STATE_EXIT_COUNT = YOBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>State Exit No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YGLOBAL_STATE_MACHINE__STATE_EXIT_NO = YOBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>O</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YGLOBAL_STATE_MACHINE__O = YOBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Observer Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YGLOBAL_STATE_MACHINE__OBSERVER_ACTIVE = YOBJECT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>YGlobal State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YGLOBAL_STATE_MACHINE_FEATURE_COUNT = YOBJECT_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YCreateInstanceExpressionImpl <em>YCreate Instance Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YCreateInstanceExpressionImpl
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYCreateInstanceExpression()
	 * @generated
	 */
	int YCREATE_INSTANCE_EXPRESSION = 34;

	/**
	 * The feature id for the '<em><b>Clazz</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCREATE_INSTANCE_EXPRESSION__CLAZZ = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCREATE_INSTANCE_EXPRESSION__FEATURE = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>YCreate Instance Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCREATE_INSTANCE_EXPRESSION_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YPrintExpressionImpl <em>YPrint Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YPrintExpressionImpl
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYPrintExpression()
	 * @generated
	 */
	int YPRINT_EXPRESSION = 35;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPRINT_EXPRESSION__EXPRESSION = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>YPrint Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPRINT_EXPRESSION_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YSetReturnValueImpl <em>YSet Return Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YSetReturnValueImpl
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYSetReturnValue()
	 * @generated
	 */
	int YSET_RETURN_VALUE = 36;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSET_RETURN_VALUE__VALUE = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>YSet Return Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSET_RETURN_VALUE_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YGetInstancesOfExpressionImpl <em>YGet Instances Of Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YGetInstancesOfExpressionImpl
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYGetInstancesOfExpression()
	 * @generated
	 */
	int YGET_INSTANCES_OF_EXPRESSION = 37;

	/**
	 * The feature id for the '<em><b>Clazz</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YGET_INSTANCES_OF_EXPRESSION__CLAZZ = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>YGet Instances Of Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YGET_INSTANCES_OF_EXPRESSION_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YMemberFeatureCallImpl <em>YMember Feature Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YMemberFeatureCallImpl
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYMemberFeatureCall()
	 * @generated
	 */
	int YMEMBER_FEATURE_CALL = 38;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @since 2.7
	 * @generated
	 * @ordered
	 */
	int YMEMBER_FEATURE_CALL__FEATURE = XbasePackage.XMEMBER_FEATURE_CALL__FEATURE;

	/**
	 * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @since 2.7
	 * @generated
	 * @ordered
	 */
	int YMEMBER_FEATURE_CALL__TYPE_ARGUMENTS = XbasePackage.XMEMBER_FEATURE_CALL__TYPE_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Implicit Receiver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @since 2.7
	 * @generated
	 * @ordered
	 */
	int YMEMBER_FEATURE_CALL__IMPLICIT_RECEIVER = XbasePackage.XMEMBER_FEATURE_CALL__IMPLICIT_RECEIVER;

	/**
	 * The feature id for the '<em><b>Invalid Feature Issue Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @since 2.7
	 * @deprecated See {@link org.eclipse.xtext.xbase.XAbstractFeatureCall#getInvalidFeatureIssueCode() model documentation} for details.
	 * @generated
	 * @ordered
	 */
	@Deprecated
	int YMEMBER_FEATURE_CALL__INVALID_FEATURE_ISSUE_CODE = XbasePackage.XMEMBER_FEATURE_CALL__INVALID_FEATURE_ISSUE_CODE;

	/**
	 * The feature id for the '<em><b>Valid Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @since 2.7
	 * @deprecated See {@link org.eclipse.xtext.xbase.XAbstractFeatureCall#isValidFeature() model documentation} for details.
	 * @generated
	 * @ordered
	 */
	@Deprecated
	int YMEMBER_FEATURE_CALL__VALID_FEATURE = XbasePackage.XMEMBER_FEATURE_CALL__VALID_FEATURE;

	/**
	 * The feature id for the '<em><b>Implicit First Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @since 2.7
	 * @generated
	 * @ordered
	 */
	int YMEMBER_FEATURE_CALL__IMPLICIT_FIRST_ARGUMENT = XbasePackage.XMEMBER_FEATURE_CALL__IMPLICIT_FIRST_ARGUMENT;

	/**
	 * The feature id for the '<em><b>Member Call Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @since 2.7
	 * @generated
	 * @ordered
	 */
	int YMEMBER_FEATURE_CALL__MEMBER_CALL_TARGET = XbasePackage.XMEMBER_FEATURE_CALL__MEMBER_CALL_TARGET;

	/**
	 * The feature id for the '<em><b>Member Call Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @since 2.7
	 * @generated
	 * @ordered
	 */
	int YMEMBER_FEATURE_CALL__MEMBER_CALL_ARGUMENTS = XbasePackage.XMEMBER_FEATURE_CALL__MEMBER_CALL_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Explicit Operation Call</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @since 2.7
	 * @generated
	 * @ordered
	 */
	int YMEMBER_FEATURE_CALL__EXPLICIT_OPERATION_CALL = XbasePackage.XMEMBER_FEATURE_CALL__EXPLICIT_OPERATION_CALL;

	/**
	 * The feature id for the '<em><b>Explicit Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @since 2.7
	 * @generated
	 * @ordered
	 */
	int YMEMBER_FEATURE_CALL__EXPLICIT_STATIC = XbasePackage.XMEMBER_FEATURE_CALL__EXPLICIT_STATIC;

	/**
	 * The feature id for the '<em><b>Null Safe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @since 2.7
	 * @generated
	 * @ordered
	 */
	int YMEMBER_FEATURE_CALL__NULL_SAFE = XbasePackage.XMEMBER_FEATURE_CALL__NULL_SAFE;

	/**
	 * The feature id for the '<em><b>Type Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @since 2.7
	 * @generated
	 * @ordered
	 */
	int YMEMBER_FEATURE_CALL__TYPE_LITERAL = XbasePackage.XMEMBER_FEATURE_CALL__TYPE_LITERAL;

	/**
	 * The feature id for the '<em><b>Static With Declaring Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @since 2.7
	 * @generated
	 * @ordered
	 */
	int YMEMBER_FEATURE_CALL__STATIC_WITH_DECLARING_TYPE = XbasePackage.XMEMBER_FEATURE_CALL__STATIC_WITH_DECLARING_TYPE;

	/**
	 * The feature id for the '<em><b>Package Fragment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @since 2.7
	 * @generated
	 * @ordered
	 */
	int YMEMBER_FEATURE_CALL__PACKAGE_FRAGMENT = XbasePackage.XMEMBER_FEATURE_CALL__PACKAGE_FRAGMENT;

	/**
	 * The feature id for the '<em><b>Inheritance Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMEMBER_FEATURE_CALL__INHERITANCE_TYPE = XbasePackage.XMEMBER_FEATURE_CALL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Explicit Inheritance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMEMBER_FEATURE_CALL__EXPLICIT_INHERITANCE_TYPE = XbasePackage.XMEMBER_FEATURE_CALL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>YMember Feature Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMEMBER_FEATURE_CALL_FEATURE_COUNT = XbasePackage.XMEMBER_FEATURE_CALL_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YFeatureCallImpl <em>YFeature Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YFeatureCallImpl
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYFeatureCall()
	 * @generated
	 */
	int YFEATURE_CALL = 39;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @since 2.7
	 * @generated
	 * @ordered
	 */
	int YFEATURE_CALL__FEATURE = XbasePackage.XFEATURE_CALL__FEATURE;

	/**
	 * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @since 2.7
	 * @generated
	 * @ordered
	 */
	int YFEATURE_CALL__TYPE_ARGUMENTS = XbasePackage.XFEATURE_CALL__TYPE_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Implicit Receiver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @since 2.7
	 * @generated
	 * @ordered
	 */
	int YFEATURE_CALL__IMPLICIT_RECEIVER = XbasePackage.XFEATURE_CALL__IMPLICIT_RECEIVER;

	/**
	 * The feature id for the '<em><b>Invalid Feature Issue Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @since 2.7
	 * @deprecated See {@link org.eclipse.xtext.xbase.XAbstractFeatureCall#getInvalidFeatureIssueCode() model documentation} for details.
	 * @generated
	 * @ordered
	 */
	@Deprecated
	int YFEATURE_CALL__INVALID_FEATURE_ISSUE_CODE = XbasePackage.XFEATURE_CALL__INVALID_FEATURE_ISSUE_CODE;

	/**
	 * The feature id for the '<em><b>Valid Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @since 2.7
	 * @deprecated See {@link org.eclipse.xtext.xbase.XAbstractFeatureCall#isValidFeature() model documentation} for details.
	 * @generated
	 * @ordered
	 */
	@Deprecated
	int YFEATURE_CALL__VALID_FEATURE = XbasePackage.XFEATURE_CALL__VALID_FEATURE;

	/**
	 * The feature id for the '<em><b>Implicit First Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @since 2.7
	 * @generated
	 * @ordered
	 */
	int YFEATURE_CALL__IMPLICIT_FIRST_ARGUMENT = XbasePackage.XFEATURE_CALL__IMPLICIT_FIRST_ARGUMENT;

	/**
	 * The feature id for the '<em><b>Feature Call Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @since 2.7
	 * @generated
	 * @ordered
	 */
	int YFEATURE_CALL__FEATURE_CALL_ARGUMENTS = XbasePackage.XFEATURE_CALL__FEATURE_CALL_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Explicit Operation Call</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @since 2.7
	 * @generated
	 * @ordered
	 */
	int YFEATURE_CALL__EXPLICIT_OPERATION_CALL = XbasePackage.XFEATURE_CALL__EXPLICIT_OPERATION_CALL;

	/**
	 * The feature id for the '<em><b>Type Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @since 2.7
	 * @generated
	 * @ordered
	 */
	int YFEATURE_CALL__TYPE_LITERAL = XbasePackage.XFEATURE_CALL__TYPE_LITERAL;

	/**
	 * The feature id for the '<em><b>Package Fragment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @since 2.7
	 * @generated
	 * @ordered
	 */
	int YFEATURE_CALL__PACKAGE_FRAGMENT = XbasePackage.XFEATURE_CALL__PACKAGE_FRAGMENT;

	/**
	 * The feature id for the '<em><b>Explicit Inheritance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YFEATURE_CALL__EXPLICIT_INHERITANCE_TYPE = XbasePackage.XFEATURE_CALL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inheritance Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YFEATURE_CALL__INHERITANCE_TYPE = XbasePackage.XFEATURE_CALL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>YFeature Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YFEATURE_CALL_FEATURE_COUNT = XbasePackage.XFEATURE_CALL_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YGetObjectManagementImpl <em>YGet Object Management</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YGetObjectManagementImpl
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYGetObjectManagement()
	 * @generated
	 */
	int YGET_OBJECT_MANAGEMENT = 40;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YGET_OBJECT_MANAGEMENT__PARAMETER = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>YGet Object Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YGET_OBJECT_MANAGEMENT_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YGetLayerInformationImpl <em>YGet Layer Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YGetLayerInformationImpl
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYGetLayerInformation()
	 * @generated
	 */
	int YGET_LAYER_INFORMATION = 41;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YGET_LAYER_INFORMATION__PARAMETER = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>YGet Layer Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YGET_LAYER_INFORMATION_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YColorDFAObjectImpl <em>YColor DFA Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YColorDFAObjectImpl
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYColorDFAObject()
	 * @generated
	 */
	int YCOLOR_DFA_OBJECT = 42;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOLOR_DFA_OBJECT__ID = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>YColor DFA Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOLOR_DFA_OBJECT_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YGetInstancesImpl <em>YGet Instances</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YGetInstancesImpl
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYGetInstances()
	 * @generated
	 */
	int YGET_INSTANCES = 43;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YGET_INSTANCES__PARAMETER = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>YGet Instances</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YGET_INSTANCES_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YCountFinalStatesImpl <em>YCount Final States</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YCountFinalStatesImpl
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYCountFinalStates()
	 * @generated
	 */
	int YCOUNT_FINAL_STATES = 44;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOUNT_FINAL_STATES__PARAMETER = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>YCount Final States</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOUNT_FINAL_STATES_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YCountInitialStatesImpl <em>YCount Initial States</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YCountInitialStatesImpl
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYCountInitialStates()
	 * @generated
	 */
	int YCOUNT_INITIAL_STATES = 45;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOUNT_INITIAL_STATES__PARAMETER = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>YCount Initial States</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOUNT_INITIAL_STATES_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YCountStatesImpl <em>YCount States</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YCountStatesImpl
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYCountStates()
	 * @generated
	 */
	int YCOUNT_STATES = 46;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOUNT_STATES__PARAMETER = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>YCount States</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOUNT_STATES_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YSetAbsoluteNodePropabilityImpl <em>YSet Absolute Node Propability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YSetAbsoluteNodePropabilityImpl
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYSetAbsoluteNodePropability()
	 * @generated
	 */
	int YSET_ABSOLUTE_NODE_PROPABILITY = 47;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSET_ABSOLUTE_NODE_PROPABILITY__PARAMETER = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>YSet Absolute Node Propability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSET_ABSOLUTE_NODE_PROPABILITY_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YCountReachableStatesImpl <em>YCount Reachable States</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YCountReachableStatesImpl
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYCountReachableStates()
	 * @generated
	 */
	int YCOUNT_REACHABLE_STATES = 48;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOUNT_REACHABLE_STATES__PARAMETER = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>YCount Reachable States</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOUNT_REACHABLE_STATES_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YCountInValidTransitionsImpl <em>YCount In Valid Transitions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YCountInValidTransitionsImpl
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYCountInValidTransitions()
	 * @generated
	 */
	int YCOUNT_IN_VALID_TRANSITIONS = 49;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOUNT_IN_VALID_TRANSITIONS__PARAMETER = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>YCount In Valid Transitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOUNT_IN_VALID_TRANSITIONS_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YSetPopulationSizeImpl <em>YSet Population Size</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YSetPopulationSizeImpl
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYSetPopulationSize()
	 * @generated
	 */
	int YSET_POPULATION_SIZE = 50;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSET_POPULATION_SIZE__PARAMETER = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>YSet Population Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSET_POPULATION_SIZE_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YLoadModelImpl <em>YLoad Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YLoadModelImpl
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYLoadModel()
	 * @generated
	 */
	int YLOAD_MODEL = 51;

	/**
	 * The feature id for the '<em><b>Rel Model Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLOAD_MODEL__REL_MODEL_PATH = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>YLoad Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLOAD_MODEL_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.DslInfoImpl <em>Dsl Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.DslInfoImpl
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getDslInfo()
	 * @generated
	 */
	int DSL_INFO = 52;

	/**
	 * The feature id for the '<em><b>Features</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_INFO__FEATURES = 0;

	/**
	 * The feature id for the '<em><b>First Line</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_INFO__FIRST_LINE = 1;

	/**
	 * The feature id for the '<em><b>Last Line</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_INFO__LAST_LINE = 2;

	/**
	 * The number of structural features of the '<em>Dsl Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_INFO_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.FeatureInfoImpl <em>Feature Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.FeatureInfoImpl
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getFeatureInfo()
	 * @generated
	 */
	int FEATURE_INFO = 53;

	/**
	 * The number of structural features of the '<em>Feature Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_INFO_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.SingleLinePropertyInfoImpl <em>Single Line Property Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.SingleLinePropertyInfoImpl
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getSingleLinePropertyInfo()
	 * @generated
	 */
	int SINGLE_LINE_PROPERTY_INFO = 54;

	/**
	 * The feature id for the '<em><b>Line</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_LINE_PROPERTY_INFO__LINE = FEATURE_INFO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Single Line Property Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_LINE_PROPERTY_INFO_FEATURE_COUNT = FEATURE_INFO_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.GuardInfoImpl <em>Guard Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.GuardInfoImpl
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getGuardInfo()
	 * @generated
	 */
	int GUARD_INFO = 55;

	/**
	 * The feature id for the '<em><b>First Line Guard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_INFO__FIRST_LINE_GUARD = FEATURE_INFO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Last Line Guard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_INFO__LAST_LINE_GUARD = FEATURE_INFO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ignore Notification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_INFO__IGNORE_NOTIFICATION = FEATURE_INFO_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Guard Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_INFO_FEATURE_COUNT = FEATURE_INFO_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.EffectInfoImpl <em>Effect Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.EffectInfoImpl
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getEffectInfo()
	 * @generated
	 */
	int EFFECT_INFO = 56;

	/**
	 * The feature id for the '<em><b>First Line Effect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_INFO__FIRST_LINE_EFFECT = FEATURE_INFO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Last Line Effect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_INFO__LAST_LINE_EFFECT = FEATURE_INFO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ignore Notification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_INFO__IGNORE_NOTIFICATION = FEATURE_INFO_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Effect Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_INFO_FEATURE_COUNT = FEATURE_INFO_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.ContainmentInfoImpl <em>Containment Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.ContainmentInfoImpl
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getContainmentInfo()
	 * @generated
	 */
	int CONTAINMENT_INFO = 57;

	/**
	 * The feature id for the '<em><b>Insertion Line</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_INFO__INSERTION_LINE = FEATURE_INFO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Containment Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_INFO_FEATURE_COUNT = FEATURE_INFO_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.EStructuralFeatureToFeatureInfoMapImpl <em>EStructural Feature To Feature Info Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.EStructuralFeatureToFeatureInfoMapImpl
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getEStructuralFeatureToFeatureInfoMap()
	 * @generated
	 */
	int ESTRUCTURAL_FEATURE_TO_FEATURE_INFO_MAP = 58;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_TO_FEATURE_INFO_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_TO_FEATURE_INFO_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>EStructural Feature To Feature Info Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_TO_FEATURE_INFO_MAP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.LineImpl <em>Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.LineImpl
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getLine()
	 * @generated
	 */
	int LINE = 59;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__POS = 0;

	/**
	 * The feature id for the '<em><b>Processed Offsets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__PROCESSED_OFFSETS = 1;

	/**
	 * The number of structural features of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YStructureImpl <em>YStructure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YStructureImpl
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYStructure()
	 * @generated
	 */
	int YSTRUCTURE = 60;

	/**
	 * The number of structural features of the '<em>YStructure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTRUCTURE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YObserverAddValueImpl <em>YObserver Add Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YObserverAddValueImpl
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYObserverAddValue()
	 * @generated
	 */
	int YOBSERVER_ADD_VALUE = 61;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOBSERVER_ADD_VALUE__PARAMETER = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>YObserver Add Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOBSERVER_ADD_VALUE_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dev.yamm.coreModelDiagram.yammDiagram.YAggregationKind <em>YAggregation Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YAggregationKind
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYAggregationKind()
	 * @generated
	 */
	int YAGGREGATION_KIND = 62;

	/**
	 * The meta object id for the '{@link dev.yamm.coreModelDiagram.yammDiagram.YParameterDirectionKind <em>YParameter Direction Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YParameterDirectionKind
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYParameterDirectionKind()
	 * @generated
	 */
	int YPARAMETER_DIRECTION_KIND = 63;

	/**
	 * The meta object id for the '{@link dev.yamm.coreModelDiagram.yammDiagram.YRunToCompletion <em>YRun To Completion</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YRunToCompletion
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYRunToCompletion()
	 * @generated
	 */
	int YRUN_TO_COMPLETION = 64;

	/**
	 * The meta object id for the '{@link dev.yamm.coreModelDiagram.yammDiagram.YVisibilityKind <em>YVisibility Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YVisibilityKind
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYVisibilityKind()
	 * @generated
	 */
	int YVISIBILITY_KIND = 65;

	/**
	 * The meta object id for the '<em>EString2</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getEString2()
	 * @generated
	 */
	int ESTRING2 = 66;


	/**
	 * Returns the meta object for class '{@link dev.yamm.coreModelDiagram.yammDiagram.YClass <em>YClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YClass</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YClass
	 * @generated
	 */
	EClass getYClass();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YClass#isIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YClass#isIsAbstract()
	 * @see #getYClass()
	 * @generated
	 */
	EAttribute getYClass_IsAbstract();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YClass#getQualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Name</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YClass#getQualifiedName()
	 * @see #getYClass()
	 * @generated
	 */
	EAttribute getYClass_QualifiedName();

	/**
	 * Returns the meta object for the reference '{@link dev.yamm.coreModelDiagram.yammDiagram.YClass#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Package</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YClass#getPackage()
	 * @see #getYClass()
	 * @generated
	 */
	EReference getYClass_Package();

	/**
	 * Returns the meta object for the reference list '{@link dev.yamm.coreModelDiagram.yammDiagram.YClass#getSuperClass <em>Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Super Class</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YClass#getSuperClass()
	 * @see #getYClass()
	 * @generated
	 */
	EReference getYClass_SuperClass();

	/**
	 * Returns the meta object for the containment reference list '{@link dev.yamm.coreModelDiagram.yammDiagram.YClass#getOwnedAttribute <em>Owned Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Attribute</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YClass#getOwnedAttribute()
	 * @see #getYClass()
	 * @generated
	 */
	EReference getYClass_OwnedAttribute();

	/**
	 * Returns the meta object for the containment reference list '{@link dev.yamm.coreModelDiagram.yammDiagram.YClass#getOwnedOperation <em>Owned Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Operation</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YClass#getOwnedOperation()
	 * @see #getYClass()
	 * @generated
	 */
	EReference getYClass_OwnedOperation();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YClass#isObserveQueue <em>Observe Queue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Observe Queue</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YClass#isObserveQueue()
	 * @see #getYClass()
	 * @generated
	 */
	EAttribute getYClass_ObserveQueue();

	/**
	 * Returns the meta object for class '{@link dev.yamm.coreModelDiagram.yammDiagram.YClassifier <em>YClassifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YClassifier</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YClassifier
	 * @generated
	 */
	EClass getYClassifier();

	/**
	 * Returns the meta object for class '{@link dev.yamm.coreModelDiagram.yammDiagram.YComment <em>YComment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YComment</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YComment
	 * @generated
	 */
	EClass getYComment();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YComment#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YComment#getBody()
	 * @see #getYComment()
	 * @generated
	 */
	EAttribute getYComment_Body();

	/**
	 * Returns the meta object for the reference list '{@link dev.yamm.coreModelDiagram.yammDiagram.YComment#getAnnotatedElement <em>Annotated Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Annotated Element</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YComment#getAnnotatedElement()
	 * @see #getYComment()
	 * @generated
	 */
	EReference getYComment_AnnotatedElement();

	/**
	 * Returns the meta object for the containment reference '{@link dev.yamm.coreModelDiagram.yammDiagram.YComment#getOwnedComment <em>Owned Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Comment</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YComment#getOwnedComment()
	 * @see #getYComment()
	 * @generated
	 */
	EReference getYComment_OwnedComment();

	/**
	 * Returns the meta object for the containment reference list '{@link dev.yamm.coreModelDiagram.yammDiagram.YComment#getOwnedElement <em>Owned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Element</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YComment#getOwnedElement()
	 * @see #getYComment()
	 * @generated
	 */
	EReference getYComment_OwnedElement();

	/**
	 * Returns the meta object for class '{@link dev.yamm.coreModelDiagram.yammDiagram.YConstraint <em>YConstraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YConstraint</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YConstraint
	 * @generated
	 */
	EClass getYConstraint();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YConstraint#getQualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Name</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YConstraint#getQualifiedName()
	 * @see #getYConstraint()
	 * @generated
	 */
	EAttribute getYConstraint_QualifiedName();

	/**
	 * Returns the meta object for the reference list '{@link dev.yamm.coreModelDiagram.yammDiagram.YConstraint#getConstrainedElement <em>Constrained Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Constrained Element</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YConstraint#getConstrainedElement()
	 * @see #getYConstraint()
	 * @generated
	 */
	EReference getYConstraint_ConstrainedElement();

	/**
	 * Returns the meta object for the containment reference '{@link dev.yamm.coreModelDiagram.yammDiagram.YConstraint#getOwnedComment <em>Owned Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Comment</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YConstraint#getOwnedComment()
	 * @see #getYConstraint()
	 * @generated
	 */
	EReference getYConstraint_OwnedComment();

	/**
	 * Returns the meta object for the containment reference list '{@link dev.yamm.coreModelDiagram.yammDiagram.YConstraint#getOwnedElement <em>Owned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Element</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YConstraint#getOwnedElement()
	 * @see #getYConstraint()
	 * @generated
	 */
	EReference getYConstraint_OwnedElement();

	/**
	 * Returns the meta object for the containment reference '{@link dev.yamm.coreModelDiagram.yammDiagram.YConstraint#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specification</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YConstraint#getSpecification()
	 * @see #getYConstraint()
	 * @generated
	 */
	EReference getYConstraint_Specification();

	/**
	 * Returns the meta object for class '{@link dev.yamm.coreModelDiagram.yammDiagram.YDataType <em>YData Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YData Type</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YDataType
	 * @generated
	 */
	EClass getYDataType();

	/**
	 * Returns the meta object for class '{@link dev.yamm.coreModelDiagram.yammDiagram.YElement <em>YElement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YElement</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YElement
	 * @generated
	 */
	EClass getYElement();

	/**
	 * Returns the meta object for class '{@link dev.yamm.coreModelDiagram.yammDiagram.YElementImport <em>YElement Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YElement Import</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YElementImport
	 * @generated
	 */
	EClass getYElementImport();

	/**
	 * Returns the meta object for the reference '{@link dev.yamm.coreModelDiagram.yammDiagram.YElementImport#getImportedElement <em>Imported Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Imported Element</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YElementImport#getImportedElement()
	 * @see #getYElementImport()
	 * @generated
	 */
	EReference getYElementImport_ImportedElement();

	/**
	 * Returns the meta object for the reference '{@link dev.yamm.coreModelDiagram.yammDiagram.YElementImport#getImportingNamespace <em>Importing Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Importing Namespace</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YElementImport#getImportingNamespace()
	 * @see #getYElementImport()
	 * @generated
	 */
	EReference getYElementImport_ImportingNamespace();

	/**
	 * Returns the meta object for the containment reference '{@link dev.yamm.coreModelDiagram.yammDiagram.YElementImport#getOwnedComment <em>Owned Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Comment</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YElementImport#getOwnedComment()
	 * @see #getYElementImport()
	 * @generated
	 */
	EReference getYElementImport_OwnedComment();

	/**
	 * Returns the meta object for the containment reference list '{@link dev.yamm.coreModelDiagram.yammDiagram.YElementImport#getOwnedElement <em>Owned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Element</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YElementImport#getOwnedElement()
	 * @see #getYElementImport()
	 * @generated
	 */
	EReference getYElementImport_OwnedElement();

	/**
	 * Returns the meta object for class '{@link dev.yamm.coreModelDiagram.yammDiagram.YEnumeration <em>YEnumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YEnumeration</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YEnumeration
	 * @generated
	 */
	EClass getYEnumeration();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YEnumeration#isIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YEnumeration#isIsAbstract()
	 * @see #getYEnumeration()
	 * @generated
	 */
	EAttribute getYEnumeration_IsAbstract();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YEnumeration#getQualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Name</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YEnumeration#getQualifiedName()
	 * @see #getYEnumeration()
	 * @generated
	 */
	EAttribute getYEnumeration_QualifiedName();

	/**
	 * Returns the meta object for the reference list '{@link dev.yamm.coreModelDiagram.yammDiagram.YEnumeration#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Member</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YEnumeration#getMember()
	 * @see #getYEnumeration()
	 * @generated
	 */
	EReference getYEnumeration_Member();

	/**
	 * Returns the meta object for the reference list '{@link dev.yamm.coreModelDiagram.yammDiagram.YEnumeration#getElementImport <em>Element Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Element Import</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YEnumeration#getElementImport()
	 * @see #getYEnumeration()
	 * @generated
	 */
	EReference getYEnumeration_ElementImport();

	/**
	 * Returns the meta object for the reference list '{@link dev.yamm.coreModelDiagram.yammDiagram.YEnumeration#getImportedMember <em>Imported Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Imported Member</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YEnumeration#getImportedMember()
	 * @see #getYEnumeration()
	 * @generated
	 */
	EReference getYEnumeration_ImportedMember();

	/**
	 * Returns the meta object for the reference list '{@link dev.yamm.coreModelDiagram.yammDiagram.YEnumeration#getPackageImport <em>Package Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Package Import</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YEnumeration#getPackageImport()
	 * @see #getYEnumeration()
	 * @generated
	 */
	EReference getYEnumeration_PackageImport();

	/**
	 * Returns the meta object for the reference list '{@link dev.yamm.coreModelDiagram.yammDiagram.YEnumeration#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attribute</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YEnumeration#getAttribute()
	 * @see #getYEnumeration()
	 * @generated
	 */
	EReference getYEnumeration_Attribute();

	/**
	 * Returns the meta object for the reference list '{@link dev.yamm.coreModelDiagram.yammDiagram.YEnumeration#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Feature</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YEnumeration#getFeature()
	 * @see #getYEnumeration()
	 * @generated
	 */
	EReference getYEnumeration_Feature();

	/**
	 * Returns the meta object for the reference list '{@link dev.yamm.coreModelDiagram.yammDiagram.YEnumeration#getGeneral <em>General</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>General</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YEnumeration#getGeneral()
	 * @see #getYEnumeration()
	 * @generated
	 */
	EReference getYEnumeration_General();

	/**
	 * Returns the meta object for the reference list '{@link dev.yamm.coreModelDiagram.yammDiagram.YEnumeration#getInheritedMember <em>Inherited Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inherited Member</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YEnumeration#getInheritedMember()
	 * @see #getYEnumeration()
	 * @generated
	 */
	EReference getYEnumeration_InheritedMember();

	/**
	 * Returns the meta object for the reference '{@link dev.yamm.coreModelDiagram.yammDiagram.YEnumeration#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Package</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YEnumeration#getPackage()
	 * @see #getYEnumeration()
	 * @generated
	 */
	EReference getYEnumeration_Package();

	/**
	 * Returns the meta object for the containment reference '{@link dev.yamm.coreModelDiagram.yammDiagram.YEnumeration#getOwnedComment <em>Owned Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Comment</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YEnumeration#getOwnedComment()
	 * @see #getYEnumeration()
	 * @generated
	 */
	EReference getYEnumeration_OwnedComment();

	/**
	 * Returns the meta object for the containment reference list '{@link dev.yamm.coreModelDiagram.yammDiagram.YEnumeration#getOwnedElement <em>Owned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Element</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YEnumeration#getOwnedElement()
	 * @see #getYEnumeration()
	 * @generated
	 */
	EReference getYEnumeration_OwnedElement();

	/**
	 * Returns the meta object for the containment reference list '{@link dev.yamm.coreModelDiagram.yammDiagram.YEnumeration#getOwnedMember <em>Owned Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Member</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YEnumeration#getOwnedMember()
	 * @see #getYEnumeration()
	 * @generated
	 */
	EReference getYEnumeration_OwnedMember();

	/**
	 * Returns the meta object for the containment reference list '{@link dev.yamm.coreModelDiagram.yammDiagram.YEnumeration#getOwnedRule <em>Owned Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Rule</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YEnumeration#getOwnedRule()
	 * @see #getYEnumeration()
	 * @generated
	 */
	EReference getYEnumeration_OwnedRule();

	/**
	 * Returns the meta object for the containment reference list '{@link dev.yamm.coreModelDiagram.yammDiagram.YEnumeration#getOwnedLiteral <em>Owned Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Literal</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YEnumeration#getOwnedLiteral()
	 * @see #getYEnumeration()
	 * @generated
	 */
	EReference getYEnumeration_OwnedLiteral();

	/**
	 * Returns the meta object for class '{@link dev.yamm.coreModelDiagram.yammDiagram.YEnumerationLiteral <em>YEnumeration Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YEnumeration Literal</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YEnumerationLiteral
	 * @generated
	 */
	EClass getYEnumerationLiteral();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YEnumerationLiteral#getQualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Name</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YEnumerationLiteral#getQualifiedName()
	 * @see #getYEnumerationLiteral()
	 * @generated
	 */
	EAttribute getYEnumerationLiteral_QualifiedName();

	/**
	 * Returns the meta object for the containment reference '{@link dev.yamm.coreModelDiagram.yammDiagram.YEnumerationLiteral#getOwnedComment <em>Owned Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Comment</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YEnumerationLiteral#getOwnedComment()
	 * @see #getYEnumerationLiteral()
	 * @generated
	 */
	EReference getYEnumerationLiteral_OwnedComment();

	/**
	 * Returns the meta object for the containment reference list '{@link dev.yamm.coreModelDiagram.yammDiagram.YEnumerationLiteral#getOwnedElement <em>Owned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Element</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YEnumerationLiteral#getOwnedElement()
	 * @see #getYEnumerationLiteral()
	 * @generated
	 */
	EReference getYEnumerationLiteral_OwnedElement();

	/**
	 * Returns the meta object for class '{@link dev.yamm.coreModelDiagram.yammDiagram.YFeature <em>YFeature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YFeature</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YFeature
	 * @generated
	 */
	EClass getYFeature();

	/**
	 * Returns the meta object for class '{@link dev.yamm.coreModelDiagram.yammDiagram.YNamedElement <em>YNamed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YNamed Element</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YNamedElement
	 * @generated
	 */
	EClass getYNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YNamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YNamedElement#getName()
	 * @see #getYNamedElement()
	 * @generated
	 */
	EAttribute getYNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link dev.yamm.coreModelDiagram.yammDiagram.YNamespace <em>YNamespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YNamespace</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YNamespace
	 * @generated
	 */
	EClass getYNamespace();

	/**
	 * Returns the meta object for class '{@link dev.yamm.coreModelDiagram.yammDiagram.YOperation <em>YOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YOperation</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YOperation
	 * @generated
	 */
	EClass getYOperation();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YOperation#getQualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Name</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YOperation#getQualifiedName()
	 * @see #getYOperation()
	 * @generated
	 */
	EAttribute getYOperation_QualifiedName();

	/**
	 * Returns the meta object for the containment reference list '{@link dev.yamm.coreModelDiagram.yammDiagram.YOperation#getOwnedParameter <em>Owned Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Parameter</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YOperation#getOwnedParameter()
	 * @see #getYOperation()
	 * @generated
	 */
	EReference getYOperation_OwnedParameter();

	/**
	 * Returns the meta object for the containment reference '{@link dev.yamm.coreModelDiagram.yammDiagram.YOperation#getStateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>State Machine</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YOperation#getStateMachine()
	 * @see #getYOperation()
	 * @generated
	 */
	EReference getYOperation_StateMachine();

	/**
	 * Returns the meta object for the reference '{@link dev.yamm.coreModelDiagram.yammDiagram.YOperation#getClazz <em>Clazz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Clazz</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YOperation#getClazz()
	 * @see #getYOperation()
	 * @generated
	 */
	EReference getYOperation_Clazz();

	/**
	 * Returns the meta object for the reference '{@link dev.yamm.coreModelDiagram.yammDiagram.YOperation#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Type</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YOperation#getReturnType()
	 * @see #getYOperation()
	 * @generated
	 */
	EReference getYOperation_ReturnType();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YOperation#getLower <em>Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YOperation#getLower()
	 * @see #getYOperation()
	 * @generated
	 */
	EAttribute getYOperation_Lower();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YOperation#getUpper <em>Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YOperation#getUpper()
	 * @see #getYOperation()
	 * @generated
	 */
	EAttribute getYOperation_Upper();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YOperation#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signature</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YOperation#getSignature()
	 * @see #getYOperation()
	 * @generated
	 */
	EAttribute getYOperation_Signature();

	/**
	 * Returns the meta object for class '{@link dev.yamm.coreModelDiagram.yammDiagram.YPackage <em>YPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YPackage</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YPackage
	 * @generated
	 */
	EClass getYPackage();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YPackage#getQualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Name</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YPackage#getQualifiedName()
	 * @see #getYPackage()
	 * @generated
	 */
	EAttribute getYPackage_QualifiedName();

	/**
	 * Returns the meta object for the reference '{@link dev.yamm.coreModelDiagram.yammDiagram.YPackage#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Package</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YPackage#getPackage()
	 * @see #getYPackage()
	 * @generated
	 */
	EReference getYPackage_Package();

	/**
	 * Returns the meta object for the containment reference list '{@link dev.yamm.coreModelDiagram.yammDiagram.YPackage#getOwnedMemberPackage <em>Owned Member Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Member Package</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YPackage#getOwnedMemberPackage()
	 * @see #getYPackage()
	 * @generated
	 */
	EReference getYPackage_OwnedMemberPackage();

	/**
	 * Returns the meta object for class '{@link dev.yamm.coreModelDiagram.yammDiagram.YPackageableElement <em>YPackageable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YPackageable Element</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YPackageableElement
	 * @generated
	 */
	EClass getYPackageableElement();

	/**
	 * Returns the meta object for the container reference '{@link dev.yamm.coreModelDiagram.yammDiagram.YPackageableElement#getParentElement <em>Parent Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Element</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YPackageableElement#getParentElement()
	 * @see #getYPackageableElement()
	 * @generated
	 */
	EReference getYPackageableElement_ParentElement();

	/**
	 * Returns the meta object for class '{@link dev.yamm.coreModelDiagram.yammDiagram.YPackageImport <em>YPackage Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YPackage Import</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YPackageImport
	 * @generated
	 */
	EClass getYPackageImport();

	/**
	 * Returns the meta object for the reference '{@link dev.yamm.coreModelDiagram.yammDiagram.YPackageImport#getImportedPackage <em>Imported Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Imported Package</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YPackageImport#getImportedPackage()
	 * @see #getYPackageImport()
	 * @generated
	 */
	EReference getYPackageImport_ImportedPackage();

	/**
	 * Returns the meta object for the reference '{@link dev.yamm.coreModelDiagram.yammDiagram.YPackageImport#getImportingNamespace <em>Importing Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Importing Namespace</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YPackageImport#getImportingNamespace()
	 * @see #getYPackageImport()
	 * @generated
	 */
	EReference getYPackageImport_ImportingNamespace();

	/**
	 * Returns the meta object for the containment reference '{@link dev.yamm.coreModelDiagram.yammDiagram.YPackageImport#getOwnedComment <em>Owned Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Comment</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YPackageImport#getOwnedComment()
	 * @see #getYPackageImport()
	 * @generated
	 */
	EReference getYPackageImport_OwnedComment();

	/**
	 * Returns the meta object for the containment reference list '{@link dev.yamm.coreModelDiagram.yammDiagram.YPackageImport#getOwnedElement <em>Owned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Element</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YPackageImport#getOwnedElement()
	 * @see #getYPackageImport()
	 * @generated
	 */
	EReference getYPackageImport_OwnedElement();

	/**
	 * Returns the meta object for class '{@link dev.yamm.coreModelDiagram.yammDiagram.YParameter <em>YParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YParameter</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YParameter
	 * @generated
	 */
	EClass getYParameter();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YParameter#isIsOrdered <em>Is Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Ordered</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YParameter#isIsOrdered()
	 * @see #getYParameter()
	 * @generated
	 */
	EAttribute getYParameter_IsOrdered();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YParameter#isIsUnique <em>Is Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Unique</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YParameter#isIsUnique()
	 * @see #getYParameter()
	 * @generated
	 */
	EAttribute getYParameter_IsUnique();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YParameter#getLower <em>Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YParameter#getLower()
	 * @see #getYParameter()
	 * @generated
	 */
	EAttribute getYParameter_Lower();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YParameter#getUpper <em>Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YParameter#getUpper()
	 * @see #getYParameter()
	 * @generated
	 */
	EAttribute getYParameter_Upper();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YParameter#getQualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Name</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YParameter#getQualifiedName()
	 * @see #getYParameter()
	 * @generated
	 */
	EAttribute getYParameter_QualifiedName();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YParameter#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YParameter#getDirection()
	 * @see #getYParameter()
	 * @generated
	 */
	EAttribute getYParameter_Direction();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YParameter#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YParameter#getDefaultValue()
	 * @see #getYParameter()
	 * @generated
	 */
	EAttribute getYParameter_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YParameter#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YParameter#getDescription()
	 * @see #getYParameter()
	 * @generated
	 */
	EAttribute getYParameter_Description();

	/**
	 * Returns the meta object for the reference '{@link dev.yamm.coreModelDiagram.yammDiagram.YParameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YParameter#getType()
	 * @see #getYParameter()
	 * @generated
	 */
	EReference getYParameter_Type();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YParameter#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signature</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YParameter#getSignature()
	 * @see #getYParameter()
	 * @generated
	 */
	EAttribute getYParameter_Signature();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YParameter#isUpperboundWildcard <em>Upperbound Wildcard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upperbound Wildcard</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YParameter#isUpperboundWildcard()
	 * @see #getYParameter()
	 * @generated
	 */
	EAttribute getYParameter_UpperboundWildcard();

	/**
	 * Returns the meta object for class '{@link dev.yamm.coreModelDiagram.yammDiagram.YPrimitiveType <em>YPrimitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YPrimitive Type</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YPrimitiveType
	 * @generated
	 */
	EClass getYPrimitiveType();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YPrimitiveType#isIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YPrimitiveType#isIsAbstract()
	 * @see #getYPrimitiveType()
	 * @generated
	 */
	EAttribute getYPrimitiveType_IsAbstract();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YPrimitiveType#getQualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Name</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YPrimitiveType#getQualifiedName()
	 * @see #getYPrimitiveType()
	 * @generated
	 */
	EAttribute getYPrimitiveType_QualifiedName();

	/**
	 * Returns the meta object for the reference list '{@link dev.yamm.coreModelDiagram.yammDiagram.YPrimitiveType#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Member</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YPrimitiveType#getMember()
	 * @see #getYPrimitiveType()
	 * @generated
	 */
	EReference getYPrimitiveType_Member();

	/**
	 * Returns the meta object for the reference list '{@link dev.yamm.coreModelDiagram.yammDiagram.YPrimitiveType#getElementImport <em>Element Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Element Import</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YPrimitiveType#getElementImport()
	 * @see #getYPrimitiveType()
	 * @generated
	 */
	EReference getYPrimitiveType_ElementImport();

	/**
	 * Returns the meta object for the reference list '{@link dev.yamm.coreModelDiagram.yammDiagram.YPrimitiveType#getImportedMember <em>Imported Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Imported Member</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YPrimitiveType#getImportedMember()
	 * @see #getYPrimitiveType()
	 * @generated
	 */
	EReference getYPrimitiveType_ImportedMember();

	/**
	 * Returns the meta object for the reference list '{@link dev.yamm.coreModelDiagram.yammDiagram.YPrimitiveType#getPackageImport <em>Package Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Package Import</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YPrimitiveType#getPackageImport()
	 * @see #getYPrimitiveType()
	 * @generated
	 */
	EReference getYPrimitiveType_PackageImport();

	/**
	 * Returns the meta object for the reference list '{@link dev.yamm.coreModelDiagram.yammDiagram.YPrimitiveType#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attribute</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YPrimitiveType#getAttribute()
	 * @see #getYPrimitiveType()
	 * @generated
	 */
	EReference getYPrimitiveType_Attribute();

	/**
	 * Returns the meta object for the reference list '{@link dev.yamm.coreModelDiagram.yammDiagram.YPrimitiveType#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Feature</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YPrimitiveType#getFeature()
	 * @see #getYPrimitiveType()
	 * @generated
	 */
	EReference getYPrimitiveType_Feature();

	/**
	 * Returns the meta object for the reference list '{@link dev.yamm.coreModelDiagram.yammDiagram.YPrimitiveType#getGeneral <em>General</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>General</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YPrimitiveType#getGeneral()
	 * @see #getYPrimitiveType()
	 * @generated
	 */
	EReference getYPrimitiveType_General();

	/**
	 * Returns the meta object for the reference list '{@link dev.yamm.coreModelDiagram.yammDiagram.YPrimitiveType#getInheritedMember <em>Inherited Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inherited Member</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YPrimitiveType#getInheritedMember()
	 * @see #getYPrimitiveType()
	 * @generated
	 */
	EReference getYPrimitiveType_InheritedMember();

	/**
	 * Returns the meta object for the reference '{@link dev.yamm.coreModelDiagram.yammDiagram.YPrimitiveType#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Package</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YPrimitiveType#getPackage()
	 * @see #getYPrimitiveType()
	 * @generated
	 */
	EReference getYPrimitiveType_Package();

	/**
	 * Returns the meta object for the containment reference '{@link dev.yamm.coreModelDiagram.yammDiagram.YPrimitiveType#getOwnedComment <em>Owned Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Comment</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YPrimitiveType#getOwnedComment()
	 * @see #getYPrimitiveType()
	 * @generated
	 */
	EReference getYPrimitiveType_OwnedComment();

	/**
	 * Returns the meta object for the containment reference list '{@link dev.yamm.coreModelDiagram.yammDiagram.YPrimitiveType#getOwnedElement <em>Owned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Element</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YPrimitiveType#getOwnedElement()
	 * @see #getYPrimitiveType()
	 * @generated
	 */
	EReference getYPrimitiveType_OwnedElement();

	/**
	 * Returns the meta object for the containment reference list '{@link dev.yamm.coreModelDiagram.yammDiagram.YPrimitiveType#getOwnedMember <em>Owned Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Member</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YPrimitiveType#getOwnedMember()
	 * @see #getYPrimitiveType()
	 * @generated
	 */
	EReference getYPrimitiveType_OwnedMember();

	/**
	 * Returns the meta object for the containment reference list '{@link dev.yamm.coreModelDiagram.yammDiagram.YPrimitiveType#getOwnedRule <em>Owned Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Rule</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YPrimitiveType#getOwnedRule()
	 * @see #getYPrimitiveType()
	 * @generated
	 */
	EReference getYPrimitiveType_OwnedRule();

	/**
	 * Returns the meta object for class '{@link dev.yamm.coreModelDiagram.yammDiagram.YProperty <em>YProperty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YProperty</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YProperty
	 * @generated
	 */
	EClass getYProperty();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YProperty#isIsOrdered <em>Is Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Ordered</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YProperty#isIsOrdered()
	 * @see #getYProperty()
	 * @generated
	 */
	EAttribute getYProperty_IsOrdered();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YProperty#isIsDerived <em>Is Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Derived</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YProperty#isIsDerived()
	 * @see #getYProperty()
	 * @generated
	 */
	EAttribute getYProperty_IsDerived();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YProperty#isIsDerivedUnion <em>Is Derived Union</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Derived Union</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YProperty#isIsDerivedUnion()
	 * @see #getYProperty()
	 * @generated
	 */
	EAttribute getYProperty_IsDerivedUnion();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YProperty#isAssociation <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Association</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YProperty#isAssociation()
	 * @see #getYProperty()
	 * @generated
	 */
	EAttribute getYProperty_Association();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YProperty#getQualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Name</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YProperty#getQualifiedName()
	 * @see #getYProperty()
	 * @generated
	 */
	EAttribute getYProperty_QualifiedName();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YProperty#isIsUnique <em>Is Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Unique</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YProperty#isIsUnique()
	 * @see #getYProperty()
	 * @generated
	 */
	EAttribute getYProperty_IsUnique();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YProperty#getLower <em>Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YProperty#getLower()
	 * @see #getYProperty()
	 * @generated
	 */
	EAttribute getYProperty_Lower();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YProperty#getUpper <em>Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YProperty#getUpper()
	 * @see #getYProperty()
	 * @generated
	 */
	EAttribute getYProperty_Upper();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YProperty#getAggregation <em>Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aggregation</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YProperty#getAggregation()
	 * @see #getYProperty()
	 * @generated
	 */
	EAttribute getYProperty_Aggregation();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YProperty#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YProperty#getDefaultValue()
	 * @see #getYProperty()
	 * @generated
	 */
	EAttribute getYProperty_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YProperty#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YProperty#getDescription()
	 * @see #getYProperty()
	 * @generated
	 */
	EAttribute getYProperty_Description();

	/**
	 * Returns the meta object for the reference list '{@link dev.yamm.coreModelDiagram.yammDiagram.YProperty#getFeaturingClassifier <em>Featuring Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Featuring Classifier</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YProperty#getFeaturingClassifier()
	 * @see #getYProperty()
	 * @generated
	 */
	EReference getYProperty_FeaturingClassifier();

	/**
	 * Returns the meta object for the reference '{@link dev.yamm.coreModelDiagram.yammDiagram.YProperty#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YProperty#getType()
	 * @see #getYProperty()
	 * @generated
	 */
	EReference getYProperty_Type();

	/**
	 * Returns the meta object for the reference list '{@link dev.yamm.coreModelDiagram.yammDiagram.YProperty#getSubsettedProperty <em>Subsetted Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subsetted Property</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YProperty#getSubsettedProperty()
	 * @see #getYProperty()
	 * @generated
	 */
	EReference getYProperty_SubsettedProperty();

	/**
	 * Returns the meta object for the reference '{@link dev.yamm.coreModelDiagram.yammDiagram.YProperty#getOpposite <em>Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Opposite</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YProperty#getOpposite()
	 * @see #getYProperty()
	 * @generated
	 */
	EReference getYProperty_Opposite();

	/**
	 * Returns the meta object for the containment reference '{@link dev.yamm.coreModelDiagram.yammDiagram.YProperty#getOwnedComment <em>Owned Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Comment</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YProperty#getOwnedComment()
	 * @see #getYProperty()
	 * @generated
	 */
	EReference getYProperty_OwnedComment();

	/**
	 * Returns the meta object for the containment reference list '{@link dev.yamm.coreModelDiagram.yammDiagram.YProperty#getOwnedElement <em>Owned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Element</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YProperty#getOwnedElement()
	 * @see #getYProperty()
	 * @generated
	 */
	EReference getYProperty_OwnedElement();

	/**
	 * Returns the meta object for the reference '{@link dev.yamm.coreModelDiagram.yammDiagram.YProperty#getClazz <em>Clazz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Clazz</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YProperty#getClazz()
	 * @see #getYProperty()
	 * @generated
	 */
	EReference getYProperty_Clazz();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YProperty#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signature</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YProperty#getSignature()
	 * @see #getYProperty()
	 * @generated
	 */
	EAttribute getYProperty_Signature();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YProperty#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YProperty#getVisibility()
	 * @see #getYProperty()
	 * @generated
	 */
	EAttribute getYProperty_Visibility();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YProperty#isObserve <em>Observe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Observe</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YProperty#isObserve()
	 * @see #getYProperty()
	 * @generated
	 */
	EAttribute getYProperty_Observe();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YProperty#getInvariant <em>Invariant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invariant</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YProperty#getInvariant()
	 * @see #getYProperty()
	 * @generated
	 */
	EAttribute getYProperty_Invariant();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YProperty#isStatic <em>Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Static</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YProperty#isStatic()
	 * @see #getYProperty()
	 * @generated
	 */
	EAttribute getYProperty_Static();

	/**
	 * Returns the meta object for class '{@link dev.yamm.coreModelDiagram.yammDiagram.YType <em>YType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YType</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YType
	 * @generated
	 */
	EClass getYType();

	/**
	 * Returns the meta object for class '{@link dev.yamm.coreModelDiagram.yammDiagram.YStateMachine <em>YState Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YState Machine</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YStateMachine
	 * @generated
	 */
	EClass getYStateMachine();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YStateMachine#isInitialActive <em>Initial Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Active</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YStateMachine#isInitialActive()
	 * @see #getYStateMachine()
	 * @generated
	 */
	EAttribute getYStateMachine_InitialActive();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YStateMachine#getQualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Name</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YStateMachine#getQualifiedName()
	 * @see #getYStateMachine()
	 * @generated
	 */
	EAttribute getYStateMachine_QualifiedName();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YStateMachine#getRtc <em>Rtc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rtc</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YStateMachine#getRtc()
	 * @see #getYStateMachine()
	 * @generated
	 */
	EAttribute getYStateMachine_Rtc();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YStateMachine#getMaxEffectsToBeProcessed <em>Max Effects To Be Processed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Effects To Be Processed</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YStateMachine#getMaxEffectsToBeProcessed()
	 * @see #getYStateMachine()
	 * @generated
	 */
	EAttribute getYStateMachine_MaxEffectsToBeProcessed();

	/**
	 * Returns the meta object for the reference '{@link dev.yamm.coreModelDiagram.yammDiagram.YStateMachine#getCalledOperation <em>Called Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Called Operation</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YStateMachine#getCalledOperation()
	 * @see #getYStateMachine()
	 * @generated
	 */
	EReference getYStateMachine_CalledOperation();

	/**
	 * Returns the meta object for the containment reference '{@link dev.yamm.coreModelDiagram.yammDiagram.YStateMachine#getOwnedComment <em>Owned Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Comment</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YStateMachine#getOwnedComment()
	 * @see #getYStateMachine()
	 * @generated
	 */
	EReference getYStateMachine_OwnedComment();

	/**
	 * Returns the meta object for the containment reference list '{@link dev.yamm.coreModelDiagram.yammDiagram.YStateMachine#getOwnedElement <em>Owned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Element</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YStateMachine#getOwnedElement()
	 * @see #getYStateMachine()
	 * @generated
	 */
	EReference getYStateMachine_OwnedElement();

	/**
	 * Returns the meta object for the containment reference list '{@link dev.yamm.coreModelDiagram.yammDiagram.YStateMachine#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transition</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YStateMachine#getTransition()
	 * @see #getYStateMachine()
	 * @generated
	 */
	EReference getYStateMachine_Transition();

	/**
	 * Returns the meta object for the containment reference list '{@link dev.yamm.coreModelDiagram.yammDiagram.YStateMachine#getSubvertex <em>Subvertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subvertex</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YStateMachine#getSubvertex()
	 * @see #getYStateMachine()
	 * @generated
	 */
	EReference getYStateMachine_Subvertex();

	/**
	 * Returns the meta object for the containment reference list '{@link dev.yamm.coreModelDiagram.yammDiagram.YStateMachine#getTrAttach <em>Tr Attach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tr Attach</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YStateMachine#getTrAttach()
	 * @see #getYStateMachine()
	 * @generated
	 */
	EReference getYStateMachine_TrAttach();

	/**
	 * Returns the meta object for the container reference '{@link dev.yamm.coreModelDiagram.yammDiagram.YStateMachine#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Operation</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YStateMachine#getOperation()
	 * @see #getYStateMachine()
	 * @generated
	 */
	EReference getYStateMachine_Operation();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YStateMachine#isDesInitializer <em>Des Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Des Initializer</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YStateMachine#isDesInitializer()
	 * @see #getYStateMachine()
	 * @generated
	 */
	EAttribute getYStateMachine_DesInitializer();

	/**
	 * Returns the meta object for class '{@link dev.yamm.coreModelDiagram.yammDiagram.YTransition <em>YTransition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YTransition</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YTransition
	 * @generated
	 */
	EClass getYTransition();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YTransition#getQualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Name</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YTransition#getQualifiedName()
	 * @see #getYTransition()
	 * @generated
	 */
	EAttribute getYTransition_QualifiedName();

	/**
	 * Returns the meta object for the reference '{@link dev.yamm.coreModelDiagram.yammDiagram.YTransition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YTransition#getSource()
	 * @see #getYTransition()
	 * @generated
	 */
	EReference getYTransition_Source();

	/**
	 * Returns the meta object for the reference '{@link dev.yamm.coreModelDiagram.yammDiagram.YTransition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YTransition#getTarget()
	 * @see #getYTransition()
	 * @generated
	 */
	EReference getYTransition_Target();

	/**
	 * Returns the meta object for the reference '{@link dev.yamm.coreModelDiagram.yammDiagram.YTransition#getAttachment <em>Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attachment</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YTransition#getAttachment()
	 * @see #getYTransition()
	 * @generated
	 */
	EReference getYTransition_Attachment();

	/**
	 * Returns the meta object for the containment reference '{@link dev.yamm.coreModelDiagram.yammDiagram.YTransition#getOwnedComment <em>Owned Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Comment</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YTransition#getOwnedComment()
	 * @see #getYTransition()
	 * @generated
	 */
	EReference getYTransition_OwnedComment();

	/**
	 * Returns the meta object for the containment reference list '{@link dev.yamm.coreModelDiagram.yammDiagram.YTransition#getOwnedElement <em>Owned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Element</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YTransition#getOwnedElement()
	 * @see #getYTransition()
	 * @generated
	 */
	EReference getYTransition_OwnedElement();

	/**
	 * Returns the meta object for class '{@link dev.yamm.coreModelDiagram.yammDiagram.YTrAttachment <em>YTr Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YTr Attachment</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YTrAttachment
	 * @generated
	 */
	EClass getYTrAttachment();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YTrAttachment#getQualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Name</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YTrAttachment#getQualifiedName()
	 * @see #getYTrAttachment()
	 * @generated
	 */
	EAttribute getYTrAttachment_QualifiedName();

	/**
	 * Returns the meta object for the reference '{@link dev.yamm.coreModelDiagram.yammDiagram.YTrAttachment#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transition</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YTrAttachment#getTransition()
	 * @see #getYTrAttachment()
	 * @generated
	 */
	EReference getYTrAttachment_Transition();

	/**
	 * Returns the meta object for the containment reference list '{@link dev.yamm.coreModelDiagram.yammDiagram.YTrAttachment#getEffects <em>Effects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Effects</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YTrAttachment#getEffects()
	 * @see #getYTrAttachment()
	 * @generated
	 */
	EReference getYTrAttachment_Effects();

	/**
	 * Returns the meta object for the containment reference '{@link dev.yamm.coreModelDiagram.yammDiagram.YTrAttachment#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Guard</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YTrAttachment#getGuard()
	 * @see #getYTrAttachment()
	 * @generated
	 */
	EReference getYTrAttachment_Guard();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YTrAttachment#getGuardStringRep <em>Guard String Rep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard String Rep</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YTrAttachment#getGuardStringRep()
	 * @see #getYTrAttachment()
	 * @generated
	 */
	EAttribute getYTrAttachment_GuardStringRep();

	/**
	 * Returns the meta object for class '{@link dev.yamm.coreModelDiagram.yammDiagram.YEffect <em>YEffect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YEffect</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YEffect
	 * @generated
	 */
	EClass getYEffect();

	/**
	 * Returns the meta object for the containment reference '{@link dev.yamm.coreModelDiagram.yammDiagram.YEffect#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YEffect#getBody()
	 * @see #getYEffect()
	 * @generated
	 */
	EReference getYEffect_Body();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YEffect#isBreakpoint <em>Breakpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Breakpoint</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YEffect#isBreakpoint()
	 * @see #getYEffect()
	 * @generated
	 */
	EAttribute getYEffect_Breakpoint();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YEffect#getEffectStringRep <em>Effect String Rep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effect String Rep</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YEffect#getEffectStringRep()
	 * @see #getYEffect()
	 * @generated
	 */
	EAttribute getYEffect_EffectStringRep();

	/**
	 * Returns the meta object for class '{@link dev.yamm.coreModelDiagram.yammDiagram.YVertex <em>YVertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YVertex</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YVertex
	 * @generated
	 */
	EClass getYVertex();

	/**
	 * Returns the meta object for the reference list '{@link dev.yamm.coreModelDiagram.yammDiagram.YVertex#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YVertex#getOutgoing()
	 * @see #getYVertex()
	 * @generated
	 */
	EReference getYVertex_Outgoing();

	/**
	 * Returns the meta object for the reference list '{@link dev.yamm.coreModelDiagram.yammDiagram.YVertex#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YVertex#getIncoming()
	 * @see #getYVertex()
	 * @generated
	 */
	EReference getYVertex_Incoming();

	/**
	 * Returns the meta object for class '{@link dev.yamm.coreModelDiagram.yammDiagram.YPseudostate <em>YPseudostate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YPseudostate</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YPseudostate
	 * @generated
	 */
	EClass getYPseudostate();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YPseudostate#getQualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Name</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YPseudostate#getQualifiedName()
	 * @see #getYPseudostate()
	 * @generated
	 */
	EAttribute getYPseudostate_QualifiedName();

	/**
	 * Returns the meta object for class '{@link dev.yamm.coreModelDiagram.yammDiagram.YFinalState <em>YFinal State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YFinal State</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YFinalState
	 * @generated
	 */
	EClass getYFinalState();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YFinalState#getQualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Name</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YFinalState#getQualifiedName()
	 * @see #getYFinalState()
	 * @generated
	 */
	EAttribute getYFinalState_QualifiedName();

	/**
	 * Returns the meta object for class '{@link dev.yamm.coreModelDiagram.yammDiagram.YState <em>YState</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YState</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YState
	 * @generated
	 */
	EClass getYState();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YState#getQualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Name</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YState#getQualifiedName()
	 * @see #getYState()
	 * @generated
	 */
	EAttribute getYState_QualifiedName();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YState#getStateName <em>State Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State Name</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YState#getStateName()
	 * @see #getYState()
	 * @generated
	 */
	EAttribute getYState_StateName();

	/**
	 * Returns the meta object for class '{@link dev.yamm.coreModelDiagram.yammDiagram.YModel <em>YModel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YModel</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YModel
	 * @generated
	 */
	EClass getYModel();

	/**
	 * Returns the meta object for the containment reference list '{@link dev.yamm.coreModelDiagram.yammDiagram.YModel#getClazz <em>Clazz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clazz</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YModel#getClazz()
	 * @see #getYModel()
	 * @generated
	 */
	EReference getYModel_Clazz();

	/**
	 * Returns the meta object for the containment reference list '{@link dev.yamm.coreModelDiagram.yammDiagram.YModel#getEnumerations <em>Enumerations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enumerations</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YModel#getEnumerations()
	 * @see #getYModel()
	 * @generated
	 */
	EReference getYModel_Enumerations();

	/**
	 * Returns the meta object for the containment reference list '{@link dev.yamm.coreModelDiagram.yammDiagram.YModel#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packages</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YModel#getPackages()
	 * @see #getYModel()
	 * @generated
	 */
	EReference getYModel_Packages();

	/**
	 * Returns the meta object for the containment reference list '{@link dev.yamm.coreModelDiagram.yammDiagram.YModel#getObjects <em>Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Objects</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YModel#getObjects()
	 * @see #getYModel()
	 * @generated
	 */
	EReference getYModel_Objects();

	/**
	 * Returns the meta object for the containment reference list '{@link dev.yamm.coreModelDiagram.yammDiagram.YModel#getSharedEdges <em>Shared Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Shared Edges</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YModel#getSharedEdges()
	 * @see #getYModel()
	 * @generated
	 */
	EReference getYModel_SharedEdges();

	/**
	 * Returns the meta object for the containment reference list '{@link dev.yamm.coreModelDiagram.yammDiagram.YModel#getCompositeEdges <em>Composite Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composite Edges</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YModel#getCompositeEdges()
	 * @see #getYModel()
	 * @generated
	 */
	EReference getYModel_CompositeEdges();

	/**
	 * Returns the meta object for class '{@link dev.yamm.coreModelDiagram.yammDiagram.YSharedEdge <em>YShared Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YShared Edge</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YSharedEdge
	 * @generated
	 */
	EClass getYSharedEdge();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YSharedEdge#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YSharedEdge#getDescription()
	 * @see #getYSharedEdge()
	 * @generated
	 */
	EAttribute getYSharedEdge_Description();

	/**
	 * Returns the meta object for the reference '{@link dev.yamm.coreModelDiagram.yammDiagram.YSharedEdge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YSharedEdge#getSource()
	 * @see #getYSharedEdge()
	 * @generated
	 */
	EReference getYSharedEdge_Source();

	/**
	 * Returns the meta object for the reference '{@link dev.yamm.coreModelDiagram.yammDiagram.YSharedEdge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YSharedEdge#getTarget()
	 * @see #getYSharedEdge()
	 * @generated
	 */
	EReference getYSharedEdge_Target();

	/**
	 * Returns the meta object for class '{@link dev.yamm.coreModelDiagram.yammDiagram.YCompositeEdge <em>YComposite Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YComposite Edge</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YCompositeEdge
	 * @generated
	 */
	EClass getYCompositeEdge();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YCompositeEdge#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YCompositeEdge#getDescription()
	 * @see #getYCompositeEdge()
	 * @generated
	 */
	EAttribute getYCompositeEdge_Description();

	/**
	 * Returns the meta object for the reference '{@link dev.yamm.coreModelDiagram.yammDiagram.YCompositeEdge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YCompositeEdge#getSource()
	 * @see #getYCompositeEdge()
	 * @generated
	 */
	EReference getYCompositeEdge_Source();

	/**
	 * Returns the meta object for the reference '{@link dev.yamm.coreModelDiagram.yammDiagram.YCompositeEdge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YCompositeEdge#getTarget()
	 * @see #getYCompositeEdge()
	 * @generated
	 */
	EReference getYCompositeEdge_Target();

	/**
	 * Returns the meta object for class '{@link dev.yamm.coreModelDiagram.yammDiagram.YObject <em>YObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YObject</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YObject
	 * @generated
	 */
	EClass getYObject();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YObject#getObjectID <em>Object ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object ID</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YObject#getObjectID()
	 * @see #getYObject()
	 * @generated
	 */
	EAttribute getYObject_ObjectID();

	/**
	 * Returns the meta object for the reference '{@link dev.yamm.coreModelDiagram.yammDiagram.YObject#getDslInfo <em>Dsl Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dsl Info</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YObject#getDslInfo()
	 * @see #getYObject()
	 * @generated
	 */
	EReference getYObject_DslInfo();

	/**
	 * Returns the meta object for class '{@link dev.yamm.coreModelDiagram.yammDiagram.YStateMachineHandler <em>YState Machine Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YState Machine Handler</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YStateMachineHandler
	 * @generated
	 */
	EClass getYStateMachineHandler();

	/**
	 * Returns the meta object for the reference '{@link dev.yamm.coreModelDiagram.yammDiagram.YStateMachineHandler#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YStateMachineHandler#getState()
	 * @see #getYStateMachineHandler()
	 * @generated
	 */
	EReference getYStateMachineHandler_State();

	/**
	 * Returns the meta object for the reference '{@link dev.yamm.coreModelDiagram.yammDiagram.YStateMachineHandler#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transition</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YStateMachineHandler#getTransition()
	 * @see #getYStateMachineHandler()
	 * @generated
	 */
	EReference getYStateMachineHandler_Transition();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YStateMachineHandler#isIsSuspended <em>Is Suspended</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Suspended</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YStateMachineHandler#isIsSuspended()
	 * @see #getYStateMachineHandler()
	 * @generated
	 */
	EAttribute getYStateMachineHandler_IsSuspended();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YStateMachineHandler#getEffectCount <em>Effect Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effect Count</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YStateMachineHandler#getEffectCount()
	 * @see #getYStateMachineHandler()
	 * @generated
	 */
	EAttribute getYStateMachineHandler_EffectCount();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YStateMachineHandler#getEffectNo <em>Effect No</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effect No</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YStateMachineHandler#getEffectNo()
	 * @see #getYStateMachineHandler()
	 * @generated
	 */
	EAttribute getYStateMachineHandler_EffectNo();

	/**
	 * Returns the meta object for the reference '{@link dev.yamm.coreModelDiagram.yammDiagram.YStateMachineHandler#getStateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State Machine</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YStateMachineHandler#getStateMachine()
	 * @see #getYStateMachineHandler()
	 * @generated
	 */
	EReference getYStateMachineHandler_StateMachine();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YStateMachineHandler#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effect</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YStateMachineHandler#getEffect()
	 * @see #getYStateMachineHandler()
	 * @generated
	 */
	EAttribute getYStateMachineHandler_Effect();

	/**
	 * Returns the meta object for the reference '{@link dev.yamm.coreModelDiagram.yammDiagram.YStateMachineHandler#getCalledFrom <em>Called From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Called From</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YStateMachineHandler#getCalledFrom()
	 * @see #getYStateMachineHandler()
	 * @generated
	 */
	EReference getYStateMachineHandler_CalledFrom();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YStateMachineHandler#getItsClassID <em>Its Class ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Its Class ID</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YStateMachineHandler#getItsClassID()
	 * @see #getYStateMachineHandler()
	 * @generated
	 */
	EAttribute getYStateMachineHandler_ItsClassID();

	/**
	 * Returns the meta object for the reference '{@link dev.yamm.coreModelDiagram.yammDiagram.YStateMachineHandler#getOperationInstance <em>Operation Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation Instance</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YStateMachineHandler#getOperationInstance()
	 * @see #getYStateMachineHandler()
	 * @generated
	 */
	EReference getYStateMachineHandler_OperationInstance();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YStateMachineHandler#getEffectsProcessed <em>Effects Processed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effects Processed</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YStateMachineHandler#getEffectsProcessed()
	 * @see #getYStateMachineHandler()
	 * @generated
	 */
	EAttribute getYStateMachineHandler_EffectsProcessed();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YStateMachineHandler#getMaxEffectsToBeProcessed <em>Max Effects To Be Processed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Effects To Be Processed</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YStateMachineHandler#getMaxEffectsToBeProcessed()
	 * @see #getYStateMachineHandler()
	 * @generated
	 */
	EAttribute getYStateMachineHandler_MaxEffectsToBeProcessed();

	/**
	 * Returns the meta object for the attribute list '{@link dev.yamm.coreModelDiagram.yammDiagram.YStateMachineHandler#getInAdapters <em>In Adapters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>In Adapters</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YStateMachineHandler#getInAdapters()
	 * @see #getYStateMachineHandler()
	 * @generated
	 */
	EAttribute getYStateMachineHandler_InAdapters();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YStateMachineHandler#getObjectsBindedWithInoutParameters <em>Objects Binded With Inout Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Objects Binded With Inout Parameters</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YStateMachineHandler#getObjectsBindedWithInoutParameters()
	 * @see #getYStateMachineHandler()
	 * @generated
	 */
	EAttribute getYStateMachineHandler_ObjectsBindedWithInoutParameters();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YStateMachineHandler#getReturnVar <em>Return Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Var</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YStateMachineHandler#getReturnVar()
	 * @see #getYStateMachineHandler()
	 * @generated
	 */
	EAttribute getYStateMachineHandler_ReturnVar();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YStateMachineHandler#getNameOfRetunVar <em>Name Of Retun Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Of Retun Var</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YStateMachineHandler#getNameOfRetunVar()
	 * @see #getYStateMachineHandler()
	 * @generated
	 */
	EAttribute getYStateMachineHandler_NameOfRetunVar();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YStateMachineHandler#getObjectsToColor <em>Objects To Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Objects To Color</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YStateMachineHandler#getObjectsToColor()
	 * @see #getYStateMachineHandler()
	 * @generated
	 */
	EAttribute getYStateMachineHandler_ObjectsToColor();

	/**
	 * Returns the meta object for class '{@link dev.yamm.coreModelDiagram.yammDiagram.YGlobalStateMachine <em>YGlobal State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YGlobal State Machine</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YGlobalStateMachine
	 * @generated
	 */
	EClass getYGlobalStateMachine();

	/**
	 * Returns the meta object for the reference list '{@link dev.yamm.coreModelDiagram.yammDiagram.YGlobalStateMachine#getStateMachines <em>State Machines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>State Machines</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YGlobalStateMachine#getStateMachines()
	 * @see #getYGlobalStateMachine()
	 * @generated
	 */
	EReference getYGlobalStateMachine_StateMachines();

	/**
	 * Returns the meta object for the reference list '{@link dev.yamm.coreModelDiagram.yammDiagram.YGlobalStateMachine#getStateMachineHandlers <em>State Machine Handlers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>State Machine Handlers</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YGlobalStateMachine#getStateMachineHandlers()
	 * @see #getYGlobalStateMachine()
	 * @generated
	 */
	EReference getYGlobalStateMachine_StateMachineHandlers();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YGlobalStateMachine#getStateMachineHandlerCount <em>State Machine Handler Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State Machine Handler Count</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YGlobalStateMachine#getStateMachineHandlerCount()
	 * @see #getYGlobalStateMachine()
	 * @generated
	 */
	EAttribute getYGlobalStateMachine_StateMachineHandlerCount();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YGlobalStateMachine#isConstraintsAllTrue <em>Constraints All True</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraints All True</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YGlobalStateMachine#isConstraintsAllTrue()
	 * @see #getYGlobalStateMachine()
	 * @generated
	 */
	EAttribute getYGlobalStateMachine_ConstraintsAllTrue();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YGlobalStateMachine#isHasReturnParam <em>Has Return Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Return Param</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YGlobalStateMachine#isHasReturnParam()
	 * @see #getYGlobalStateMachine()
	 * @generated
	 */
	EAttribute getYGlobalStateMachine_HasReturnParam();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YGlobalStateMachine#getParamCount <em>Param Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Param Count</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YGlobalStateMachine#getParamCount()
	 * @see #getYGlobalStateMachine()
	 * @generated
	 */
	EAttribute getYGlobalStateMachine_ParamCount();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YGlobalStateMachine#getStateExitCount <em>State Exit Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State Exit Count</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YGlobalStateMachine#getStateExitCount()
	 * @see #getYGlobalStateMachine()
	 * @generated
	 */
	EAttribute getYGlobalStateMachine_StateExitCount();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YGlobalStateMachine#getStateExitNo <em>State Exit No</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State Exit No</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YGlobalStateMachine#getStateExitNo()
	 * @see #getYGlobalStateMachine()
	 * @generated
	 */
	EAttribute getYGlobalStateMachine_StateExitNo();

	/**
	 * Returns the meta object for the reference '{@link dev.yamm.coreModelDiagram.yammDiagram.YGlobalStateMachine#getO <em>O</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>O</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YGlobalStateMachine#getO()
	 * @see #getYGlobalStateMachine()
	 * @generated
	 */
	EReference getYGlobalStateMachine_O();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YGlobalStateMachine#isObserverActive <em>Observer Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Observer Active</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YGlobalStateMachine#isObserverActive()
	 * @see #getYGlobalStateMachine()
	 * @generated
	 */
	EAttribute getYGlobalStateMachine_ObserverActive();

	/**
	 * Returns the meta object for class '{@link dev.yamm.coreModelDiagram.yammDiagram.YCreateInstanceExpression <em>YCreate Instance Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YCreate Instance Expression</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YCreateInstanceExpression
	 * @generated
	 */
	EClass getYCreateInstanceExpression();

	/**
	 * Returns the meta object for the reference '{@link dev.yamm.coreModelDiagram.yammDiagram.YCreateInstanceExpression#getClazz <em>Clazz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Clazz</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YCreateInstanceExpression#getClazz()
	 * @see #getYCreateInstanceExpression()
	 * @generated
	 */
	EReference getYCreateInstanceExpression_Clazz();

	/**
	 * Returns the meta object for the reference '{@link dev.yamm.coreModelDiagram.yammDiagram.YCreateInstanceExpression#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YCreateInstanceExpression#getFeature()
	 * @see #getYCreateInstanceExpression()
	 * @generated
	 */
	EReference getYCreateInstanceExpression_Feature();

	/**
	 * Returns the meta object for class '{@link dev.yamm.coreModelDiagram.yammDiagram.YPrintExpression <em>YPrint Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YPrint Expression</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YPrintExpression
	 * @generated
	 */
	EClass getYPrintExpression();

	/**
	 * Returns the meta object for the containment reference '{@link dev.yamm.coreModelDiagram.yammDiagram.YPrintExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YPrintExpression#getExpression()
	 * @see #getYPrintExpression()
	 * @generated
	 */
	EReference getYPrintExpression_Expression();

	/**
	 * Returns the meta object for class '{@link dev.yamm.coreModelDiagram.yammDiagram.YSetReturnValue <em>YSet Return Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YSet Return Value</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YSetReturnValue
	 * @generated
	 */
	EClass getYSetReturnValue();

	/**
	 * Returns the meta object for the containment reference '{@link dev.yamm.coreModelDiagram.yammDiagram.YSetReturnValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YSetReturnValue#getValue()
	 * @see #getYSetReturnValue()
	 * @generated
	 */
	EReference getYSetReturnValue_Value();

	/**
	 * Returns the meta object for class '{@link dev.yamm.coreModelDiagram.yammDiagram.YGetInstancesOfExpression <em>YGet Instances Of Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YGet Instances Of Expression</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YGetInstancesOfExpression
	 * @generated
	 */
	EClass getYGetInstancesOfExpression();

	/**
	 * Returns the meta object for the reference '{@link dev.yamm.coreModelDiagram.yammDiagram.YGetInstancesOfExpression#getClazz <em>Clazz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Clazz</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YGetInstancesOfExpression#getClazz()
	 * @see #getYGetInstancesOfExpression()
	 * @generated
	 */
	EReference getYGetInstancesOfExpression_Clazz();

	/**
	 * Returns the meta object for class '{@link dev.yamm.coreModelDiagram.yammDiagram.YMemberFeatureCall <em>YMember Feature Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YMember Feature Call</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YMemberFeatureCall
	 * @generated
	 */
	EClass getYMemberFeatureCall();

	/**
	 * Returns the meta object for the reference '{@link dev.yamm.coreModelDiagram.yammDiagram.YMemberFeatureCall#getInheritanceType <em>Inheritance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inheritance Type</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YMemberFeatureCall#getInheritanceType()
	 * @see #getYMemberFeatureCall()
	 * @generated
	 */
	EReference getYMemberFeatureCall_InheritanceType();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YMemberFeatureCall#isExplicitInheritanceType <em>Explicit Inheritance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Explicit Inheritance Type</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YMemberFeatureCall#isExplicitInheritanceType()
	 * @see #getYMemberFeatureCall()
	 * @generated
	 */
	EAttribute getYMemberFeatureCall_ExplicitInheritanceType();

	/**
	 * Returns the meta object for class '{@link dev.yamm.coreModelDiagram.yammDiagram.YFeatureCall <em>YFeature Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YFeature Call</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YFeatureCall
	 * @generated
	 */
	EClass getYFeatureCall();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.YFeatureCall#isExplicitInheritanceType <em>Explicit Inheritance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Explicit Inheritance Type</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YFeatureCall#isExplicitInheritanceType()
	 * @see #getYFeatureCall()
	 * @generated
	 */
	EAttribute getYFeatureCall_ExplicitInheritanceType();

	/**
	 * Returns the meta object for the reference '{@link dev.yamm.coreModelDiagram.yammDiagram.YFeatureCall#getInheritanceType <em>Inheritance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inheritance Type</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YFeatureCall#getInheritanceType()
	 * @see #getYFeatureCall()
	 * @generated
	 */
	EReference getYFeatureCall_InheritanceType();

	/**
	 * Returns the meta object for class '{@link dev.yamm.coreModelDiagram.yammDiagram.YGetObjectManagement <em>YGet Object Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YGet Object Management</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YGetObjectManagement
	 * @generated
	 */
	EClass getYGetObjectManagement();

	/**
	 * Returns the meta object for the containment reference list '{@link dev.yamm.coreModelDiagram.yammDiagram.YGetObjectManagement#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YGetObjectManagement#getParameter()
	 * @see #getYGetObjectManagement()
	 * @generated
	 */
	EReference getYGetObjectManagement_Parameter();

	/**
	 * Returns the meta object for class '{@link dev.yamm.coreModelDiagram.yammDiagram.YGetLayerInformation <em>YGet Layer Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YGet Layer Information</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YGetLayerInformation
	 * @generated
	 */
	EClass getYGetLayerInformation();

	/**
	 * Returns the meta object for the containment reference list '{@link dev.yamm.coreModelDiagram.yammDiagram.YGetLayerInformation#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YGetLayerInformation#getParameter()
	 * @see #getYGetLayerInformation()
	 * @generated
	 */
	EReference getYGetLayerInformation_Parameter();

	/**
	 * Returns the meta object for class '{@link dev.yamm.coreModelDiagram.yammDiagram.YColorDFAObject <em>YColor DFA Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YColor DFA Object</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YColorDFAObject
	 * @generated
	 */
	EClass getYColorDFAObject();

	/**
	 * Returns the meta object for the containment reference '{@link dev.yamm.coreModelDiagram.yammDiagram.YColorDFAObject#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Id</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YColorDFAObject#getId()
	 * @see #getYColorDFAObject()
	 * @generated
	 */
	EReference getYColorDFAObject_Id();

	/**
	 * Returns the meta object for class '{@link dev.yamm.coreModelDiagram.yammDiagram.YGetInstances <em>YGet Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YGet Instances</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YGetInstances
	 * @generated
	 */
	EClass getYGetInstances();

	/**
	 * Returns the meta object for the containment reference list '{@link dev.yamm.coreModelDiagram.yammDiagram.YGetInstances#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YGetInstances#getParameter()
	 * @see #getYGetInstances()
	 * @generated
	 */
	EReference getYGetInstances_Parameter();

	/**
	 * Returns the meta object for class '{@link dev.yamm.coreModelDiagram.yammDiagram.YCountFinalStates <em>YCount Final States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YCount Final States</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YCountFinalStates
	 * @generated
	 */
	EClass getYCountFinalStates();

	/**
	 * Returns the meta object for the containment reference list '{@link dev.yamm.coreModelDiagram.yammDiagram.YCountFinalStates#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YCountFinalStates#getParameter()
	 * @see #getYCountFinalStates()
	 * @generated
	 */
	EReference getYCountFinalStates_Parameter();

	/**
	 * Returns the meta object for class '{@link dev.yamm.coreModelDiagram.yammDiagram.YCountInitialStates <em>YCount Initial States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YCount Initial States</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YCountInitialStates
	 * @generated
	 */
	EClass getYCountInitialStates();

	/**
	 * Returns the meta object for the containment reference list '{@link dev.yamm.coreModelDiagram.yammDiagram.YCountInitialStates#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YCountInitialStates#getParameter()
	 * @see #getYCountInitialStates()
	 * @generated
	 */
	EReference getYCountInitialStates_Parameter();

	/**
	 * Returns the meta object for class '{@link dev.yamm.coreModelDiagram.yammDiagram.YCountStates <em>YCount States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YCount States</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YCountStates
	 * @generated
	 */
	EClass getYCountStates();

	/**
	 * Returns the meta object for the containment reference list '{@link dev.yamm.coreModelDiagram.yammDiagram.YCountStates#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YCountStates#getParameter()
	 * @see #getYCountStates()
	 * @generated
	 */
	EReference getYCountStates_Parameter();

	/**
	 * Returns the meta object for class '{@link dev.yamm.coreModelDiagram.yammDiagram.YSetAbsoluteNodePropability <em>YSet Absolute Node Propability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YSet Absolute Node Propability</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YSetAbsoluteNodePropability
	 * @generated
	 */
	EClass getYSetAbsoluteNodePropability();

	/**
	 * Returns the meta object for the containment reference list '{@link dev.yamm.coreModelDiagram.yammDiagram.YSetAbsoluteNodePropability#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YSetAbsoluteNodePropability#getParameter()
	 * @see #getYSetAbsoluteNodePropability()
	 * @generated
	 */
	EReference getYSetAbsoluteNodePropability_Parameter();

	/**
	 * Returns the meta object for class '{@link dev.yamm.coreModelDiagram.yammDiagram.YCountReachableStates <em>YCount Reachable States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YCount Reachable States</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YCountReachableStates
	 * @generated
	 */
	EClass getYCountReachableStates();

	/**
	 * Returns the meta object for the containment reference list '{@link dev.yamm.coreModelDiagram.yammDiagram.YCountReachableStates#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YCountReachableStates#getParameter()
	 * @see #getYCountReachableStates()
	 * @generated
	 */
	EReference getYCountReachableStates_Parameter();

	/**
	 * Returns the meta object for class '{@link dev.yamm.coreModelDiagram.yammDiagram.YCountInValidTransitions <em>YCount In Valid Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YCount In Valid Transitions</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YCountInValidTransitions
	 * @generated
	 */
	EClass getYCountInValidTransitions();

	/**
	 * Returns the meta object for the containment reference list '{@link dev.yamm.coreModelDiagram.yammDiagram.YCountInValidTransitions#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YCountInValidTransitions#getParameter()
	 * @see #getYCountInValidTransitions()
	 * @generated
	 */
	EReference getYCountInValidTransitions_Parameter();

	/**
	 * Returns the meta object for class '{@link dev.yamm.coreModelDiagram.yammDiagram.YSetPopulationSize <em>YSet Population Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YSet Population Size</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YSetPopulationSize
	 * @generated
	 */
	EClass getYSetPopulationSize();

	/**
	 * Returns the meta object for the containment reference list '{@link dev.yamm.coreModelDiagram.yammDiagram.YSetPopulationSize#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YSetPopulationSize#getParameter()
	 * @see #getYSetPopulationSize()
	 * @generated
	 */
	EReference getYSetPopulationSize_Parameter();

	/**
	 * Returns the meta object for class '{@link dev.yamm.coreModelDiagram.yammDiagram.YLoadModel <em>YLoad Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YLoad Model</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YLoadModel
	 * @generated
	 */
	EClass getYLoadModel();

	/**
	 * Returns the meta object for the containment reference '{@link dev.yamm.coreModelDiagram.yammDiagram.YLoadModel#getRelModelPath <em>Rel Model Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rel Model Path</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YLoadModel#getRelModelPath()
	 * @see #getYLoadModel()
	 * @generated
	 */
	EReference getYLoadModel_RelModelPath();

	/**
	 * Returns the meta object for class '{@link dev.yamm.coreModelDiagram.yammDiagram.DslInfo <em>Dsl Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dsl Info</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.DslInfo
	 * @generated
	 */
	EClass getDslInfo();

	/**
	 * Returns the meta object for the map '{@link dev.yamm.coreModelDiagram.yammDiagram.DslInfo#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Features</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.DslInfo#getFeatures()
	 * @see #getDslInfo()
	 * @generated
	 */
	EReference getDslInfo_Features();

	/**
	 * Returns the meta object for the reference '{@link dev.yamm.coreModelDiagram.yammDiagram.DslInfo#getFirstLine <em>First Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>First Line</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.DslInfo#getFirstLine()
	 * @see #getDslInfo()
	 * @generated
	 */
	EReference getDslInfo_FirstLine();

	/**
	 * Returns the meta object for the reference '{@link dev.yamm.coreModelDiagram.yammDiagram.DslInfo#getLastLine <em>Last Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Last Line</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.DslInfo#getLastLine()
	 * @see #getDslInfo()
	 * @generated
	 */
	EReference getDslInfo_LastLine();

	/**
	 * Returns the meta object for class '{@link dev.yamm.coreModelDiagram.yammDiagram.FeatureInfo <em>Feature Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Info</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.FeatureInfo
	 * @generated
	 */
	EClass getFeatureInfo();

	/**
	 * Returns the meta object for class '{@link dev.yamm.coreModelDiagram.yammDiagram.SingleLinePropertyInfo <em>Single Line Property Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Line Property Info</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.SingleLinePropertyInfo
	 * @generated
	 */
	EClass getSingleLinePropertyInfo();

	/**
	 * Returns the meta object for the reference '{@link dev.yamm.coreModelDiagram.yammDiagram.SingleLinePropertyInfo#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Line</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.SingleLinePropertyInfo#getLine()
	 * @see #getSingleLinePropertyInfo()
	 * @generated
	 */
	EReference getSingleLinePropertyInfo_Line();

	/**
	 * Returns the meta object for class '{@link dev.yamm.coreModelDiagram.yammDiagram.GuardInfo <em>Guard Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guard Info</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.GuardInfo
	 * @generated
	 */
	EClass getGuardInfo();

	/**
	 * Returns the meta object for the reference '{@link dev.yamm.coreModelDiagram.yammDiagram.GuardInfo#getFirstLineGuard <em>First Line Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>First Line Guard</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.GuardInfo#getFirstLineGuard()
	 * @see #getGuardInfo()
	 * @generated
	 */
	EReference getGuardInfo_FirstLineGuard();

	/**
	 * Returns the meta object for the reference '{@link dev.yamm.coreModelDiagram.yammDiagram.GuardInfo#getLastLineGuard <em>Last Line Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Last Line Guard</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.GuardInfo#getLastLineGuard()
	 * @see #getGuardInfo()
	 * @generated
	 */
	EReference getGuardInfo_LastLineGuard();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.GuardInfo#isIgnoreNotification <em>Ignore Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignore Notification</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.GuardInfo#isIgnoreNotification()
	 * @see #getGuardInfo()
	 * @generated
	 */
	EAttribute getGuardInfo_IgnoreNotification();

	/**
	 * Returns the meta object for class '{@link dev.yamm.coreModelDiagram.yammDiagram.EffectInfo <em>Effect Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Effect Info</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.EffectInfo
	 * @generated
	 */
	EClass getEffectInfo();

	/**
	 * Returns the meta object for the reference '{@link dev.yamm.coreModelDiagram.yammDiagram.EffectInfo#getFirstLineEffect <em>First Line Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>First Line Effect</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.EffectInfo#getFirstLineEffect()
	 * @see #getEffectInfo()
	 * @generated
	 */
	EReference getEffectInfo_FirstLineEffect();

	/**
	 * Returns the meta object for the reference '{@link dev.yamm.coreModelDiagram.yammDiagram.EffectInfo#getLastLineEffect <em>Last Line Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Last Line Effect</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.EffectInfo#getLastLineEffect()
	 * @see #getEffectInfo()
	 * @generated
	 */
	EReference getEffectInfo_LastLineEffect();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.EffectInfo#isIgnoreNotification <em>Ignore Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignore Notification</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.EffectInfo#isIgnoreNotification()
	 * @see #getEffectInfo()
	 * @generated
	 */
	EAttribute getEffectInfo_IgnoreNotification();

	/**
	 * Returns the meta object for class '{@link dev.yamm.coreModelDiagram.yammDiagram.ContainmentInfo <em>Containment Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Containment Info</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.ContainmentInfo
	 * @generated
	 */
	EClass getContainmentInfo();

	/**
	 * Returns the meta object for the reference '{@link dev.yamm.coreModelDiagram.yammDiagram.ContainmentInfo#getInsertionLine <em>Insertion Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Insertion Line</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.ContainmentInfo#getInsertionLine()
	 * @see #getContainmentInfo()
	 * @generated
	 */
	EReference getContainmentInfo_InsertionLine();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>EStructural Feature To Feature Info Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EStructural Feature To Feature Info Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyType="org.eclipse.emf.ecore.EStructuralFeature"
	 *        valueType="dev.yamm.coreModelDiagram.yammDiagram.FeatureInfo"
	 * @generated
	 */
	EClass getEStructuralFeatureToFeatureInfoMap();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getEStructuralFeatureToFeatureInfoMap()
	 * @generated
	 */
	EReference getEStructuralFeatureToFeatureInfoMap_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getEStructuralFeatureToFeatureInfoMap()
	 * @generated
	 */
	EReference getEStructuralFeatureToFeatureInfoMap_Value();

	/**
	 * Returns the meta object for class '{@link dev.yamm.coreModelDiagram.yammDiagram.Line <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.Line
	 * @generated
	 */
	EClass getLine();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.Line#getPos <em>Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.Line#getPos()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_Pos();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.coreModelDiagram.yammDiagram.Line#getProcessedOffsets <em>Processed Offsets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Processed Offsets</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.Line#getProcessedOffsets()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_ProcessedOffsets();

	/**
	 * Returns the meta object for class '{@link dev.yamm.coreModelDiagram.yammDiagram.YStructure <em>YStructure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YStructure</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YStructure
	 * @generated
	 */
	EClass getYStructure();

	/**
	 * Returns the meta object for class '{@link dev.yamm.coreModelDiagram.yammDiagram.YObserverAddValue <em>YObserver Add Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YObserver Add Value</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YObserverAddValue
	 * @generated
	 */
	EClass getYObserverAddValue();

	/**
	 * Returns the meta object for the containment reference list '{@link dev.yamm.coreModelDiagram.yammDiagram.YObserverAddValue#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YObserverAddValue#getParameter()
	 * @see #getYObserverAddValue()
	 * @generated
	 */
	EReference getYObserverAddValue_Parameter();

	/**
	 * Returns the meta object for enum '{@link dev.yamm.coreModelDiagram.yammDiagram.YAggregationKind <em>YAggregation Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>YAggregation Kind</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YAggregationKind
	 * @generated
	 */
	EEnum getYAggregationKind();

	/**
	 * Returns the meta object for enum '{@link dev.yamm.coreModelDiagram.yammDiagram.YParameterDirectionKind <em>YParameter Direction Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>YParameter Direction Kind</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YParameterDirectionKind
	 * @generated
	 */
	EEnum getYParameterDirectionKind();

	/**
	 * Returns the meta object for enum '{@link dev.yamm.coreModelDiagram.yammDiagram.YRunToCompletion <em>YRun To Completion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>YRun To Completion</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YRunToCompletion
	 * @generated
	 */
	EEnum getYRunToCompletion();

	/**
	 * Returns the meta object for enum '{@link dev.yamm.coreModelDiagram.yammDiagram.YVisibilityKind <em>YVisibility Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>YVisibility Kind</em>'.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YVisibilityKind
	 * @generated
	 */
	EEnum getYVisibilityKind();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>EString2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EString2</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getEString2();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	YammDiagramFactory getYammDiagramFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YClassImpl <em>YClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YClassImpl
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYClass()
		 * @generated
		 */
		EClass YCLASS = eINSTANCE.getYClass();

		/**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YCLASS__IS_ABSTRACT = eINSTANCE.getYClass_IsAbstract();

		/**
		 * The meta object literal for the '<em><b>Qualified Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YCLASS__QUALIFIED_NAME = eINSTANCE.getYClass_QualifiedName();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YCLASS__PACKAGE = eINSTANCE.getYClass_Package();

		/**
		 * The meta object literal for the '<em><b>Super Class</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YCLASS__SUPER_CLASS = eINSTANCE.getYClass_SuperClass();

		/**
		 * The meta object literal for the '<em><b>Owned Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YCLASS__OWNED_ATTRIBUTE = eINSTANCE.getYClass_OwnedAttribute();

		/**
		 * The meta object literal for the '<em><b>Owned Operation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YCLASS__OWNED_OPERATION = eINSTANCE.getYClass_OwnedOperation();

		/**
		 * The meta object literal for the '<em><b>Observe Queue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YCLASS__OBSERVE_QUEUE = eINSTANCE.getYClass_ObserveQueue();

		/**
		 * The meta object literal for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YClassifierImpl <em>YClassifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YClassifierImpl
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYClassifier()
		 * @generated
		 */
		EClass YCLASSIFIER = eINSTANCE.getYClassifier();

		/**
		 * The meta object literal for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YCommentImpl <em>YComment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YCommentImpl
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYComment()
		 * @generated
		 */
		EClass YCOMMENT = eINSTANCE.getYComment();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YCOMMENT__BODY = eINSTANCE.getYComment_Body();

		/**
		 * The meta object literal for the '<em><b>Annotated Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YCOMMENT__ANNOTATED_ELEMENT = eINSTANCE.getYComment_AnnotatedElement();

		/**
		 * The meta object literal for the '<em><b>Owned Comment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YCOMMENT__OWNED_COMMENT = eINSTANCE.getYComment_OwnedComment();

		/**
		 * The meta object literal for the '<em><b>Owned Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YCOMMENT__OWNED_ELEMENT = eINSTANCE.getYComment_OwnedElement();

		/**
		 * The meta object literal for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YConstraintImpl <em>YConstraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YConstraintImpl
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYConstraint()
		 * @generated
		 */
		EClass YCONSTRAINT = eINSTANCE.getYConstraint();

		/**
		 * The meta object literal for the '<em><b>Qualified Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YCONSTRAINT__QUALIFIED_NAME = eINSTANCE.getYConstraint_QualifiedName();

		/**
		 * The meta object literal for the '<em><b>Constrained Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YCONSTRAINT__CONSTRAINED_ELEMENT = eINSTANCE.getYConstraint_ConstrainedElement();

		/**
		 * The meta object literal for the '<em><b>Owned Comment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YCONSTRAINT__OWNED_COMMENT = eINSTANCE.getYConstraint_OwnedComment();

		/**
		 * The meta object literal for the '<em><b>Owned Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YCONSTRAINT__OWNED_ELEMENT = eINSTANCE.getYConstraint_OwnedElement();

		/**
		 * The meta object literal for the '<em><b>Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YCONSTRAINT__SPECIFICATION = eINSTANCE.getYConstraint_Specification();

		/**
		 * The meta object literal for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YDataTypeImpl <em>YData Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YDataTypeImpl
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYDataType()
		 * @generated
		 */
		EClass YDATA_TYPE = eINSTANCE.getYDataType();

		/**
		 * The meta object literal for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YElementImpl <em>YElement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YElementImpl
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYElement()
		 * @generated
		 */
		EClass YELEMENT = eINSTANCE.getYElement();

		/**
		 * The meta object literal for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YElementImportImpl <em>YElement Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YElementImportImpl
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYElementImport()
		 * @generated
		 */
		EClass YELEMENT_IMPORT = eINSTANCE.getYElementImport();

		/**
		 * The meta object literal for the '<em><b>Imported Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YELEMENT_IMPORT__IMPORTED_ELEMENT = eINSTANCE.getYElementImport_ImportedElement();

		/**
		 * The meta object literal for the '<em><b>Importing Namespace</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YELEMENT_IMPORT__IMPORTING_NAMESPACE = eINSTANCE.getYElementImport_ImportingNamespace();

		/**
		 * The meta object literal for the '<em><b>Owned Comment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YELEMENT_IMPORT__OWNED_COMMENT = eINSTANCE.getYElementImport_OwnedComment();

		/**
		 * The meta object literal for the '<em><b>Owned Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YELEMENT_IMPORT__OWNED_ELEMENT = eINSTANCE.getYElementImport_OwnedElement();

		/**
		 * The meta object literal for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YEnumerationImpl <em>YEnumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YEnumerationImpl
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYEnumeration()
		 * @generated
		 */
		EClass YENUMERATION = eINSTANCE.getYEnumeration();

		/**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YENUMERATION__IS_ABSTRACT = eINSTANCE.getYEnumeration_IsAbstract();

		/**
		 * The meta object literal for the '<em><b>Qualified Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YENUMERATION__QUALIFIED_NAME = eINSTANCE.getYEnumeration_QualifiedName();

		/**
		 * The meta object literal for the '<em><b>Member</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YENUMERATION__MEMBER = eINSTANCE.getYEnumeration_Member();

		/**
		 * The meta object literal for the '<em><b>Element Import</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YENUMERATION__ELEMENT_IMPORT = eINSTANCE.getYEnumeration_ElementImport();

		/**
		 * The meta object literal for the '<em><b>Imported Member</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YENUMERATION__IMPORTED_MEMBER = eINSTANCE.getYEnumeration_ImportedMember();

		/**
		 * The meta object literal for the '<em><b>Package Import</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YENUMERATION__PACKAGE_IMPORT = eINSTANCE.getYEnumeration_PackageImport();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YENUMERATION__ATTRIBUTE = eINSTANCE.getYEnumeration_Attribute();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YENUMERATION__FEATURE = eINSTANCE.getYEnumeration_Feature();

		/**
		 * The meta object literal for the '<em><b>General</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YENUMERATION__GENERAL = eINSTANCE.getYEnumeration_General();

		/**
		 * The meta object literal for the '<em><b>Inherited Member</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YENUMERATION__INHERITED_MEMBER = eINSTANCE.getYEnumeration_InheritedMember();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YENUMERATION__PACKAGE = eINSTANCE.getYEnumeration_Package();

		/**
		 * The meta object literal for the '<em><b>Owned Comment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YENUMERATION__OWNED_COMMENT = eINSTANCE.getYEnumeration_OwnedComment();

		/**
		 * The meta object literal for the '<em><b>Owned Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YENUMERATION__OWNED_ELEMENT = eINSTANCE.getYEnumeration_OwnedElement();

		/**
		 * The meta object literal for the '<em><b>Owned Member</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YENUMERATION__OWNED_MEMBER = eINSTANCE.getYEnumeration_OwnedMember();

		/**
		 * The meta object literal for the '<em><b>Owned Rule</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YENUMERATION__OWNED_RULE = eINSTANCE.getYEnumeration_OwnedRule();

		/**
		 * The meta object literal for the '<em><b>Owned Literal</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YENUMERATION__OWNED_LITERAL = eINSTANCE.getYEnumeration_OwnedLiteral();

		/**
		 * The meta object literal for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YEnumerationLiteralImpl <em>YEnumeration Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YEnumerationLiteralImpl
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYEnumerationLiteral()
		 * @generated
		 */
		EClass YENUMERATION_LITERAL = eINSTANCE.getYEnumerationLiteral();

		/**
		 * The meta object literal for the '<em><b>Qualified Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YENUMERATION_LITERAL__QUALIFIED_NAME = eINSTANCE.getYEnumerationLiteral_QualifiedName();

		/**
		 * The meta object literal for the '<em><b>Owned Comment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YENUMERATION_LITERAL__OWNED_COMMENT = eINSTANCE.getYEnumerationLiteral_OwnedComment();

		/**
		 * The meta object literal for the '<em><b>Owned Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YENUMERATION_LITERAL__OWNED_ELEMENT = eINSTANCE.getYEnumerationLiteral_OwnedElement();

		/**
		 * The meta object literal for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YFeatureImpl <em>YFeature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YFeatureImpl
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYFeature()
		 * @generated
		 */
		EClass YFEATURE = eINSTANCE.getYFeature();

		/**
		 * The meta object literal for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YNamedElementImpl <em>YNamed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YNamedElementImpl
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYNamedElement()
		 * @generated
		 */
		EClass YNAMED_ELEMENT = eINSTANCE.getYNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YNAMED_ELEMENT__NAME = eINSTANCE.getYNamedElement_Name();

		/**
		 * The meta object literal for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YNamespaceImpl <em>YNamespace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YNamespaceImpl
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYNamespace()
		 * @generated
		 */
		EClass YNAMESPACE = eINSTANCE.getYNamespace();

		/**
		 * The meta object literal for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YOperationImpl <em>YOperation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YOperationImpl
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYOperation()
		 * @generated
		 */
		EClass YOPERATION = eINSTANCE.getYOperation();

		/**
		 * The meta object literal for the '<em><b>Qualified Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YOPERATION__QUALIFIED_NAME = eINSTANCE.getYOperation_QualifiedName();

		/**
		 * The meta object literal for the '<em><b>Owned Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YOPERATION__OWNED_PARAMETER = eINSTANCE.getYOperation_OwnedParameter();

		/**
		 * The meta object literal for the '<em><b>State Machine</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YOPERATION__STATE_MACHINE = eINSTANCE.getYOperation_StateMachine();

		/**
		 * The meta object literal for the '<em><b>Clazz</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YOPERATION__CLAZZ = eINSTANCE.getYOperation_Clazz();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YOPERATION__RETURN_TYPE = eINSTANCE.getYOperation_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Lower</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YOPERATION__LOWER = eINSTANCE.getYOperation_Lower();

		/**
		 * The meta object literal for the '<em><b>Upper</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YOPERATION__UPPER = eINSTANCE.getYOperation_Upper();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YOPERATION__SIGNATURE = eINSTANCE.getYOperation_Signature();

		/**
		 * The meta object literal for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YPackageImpl <em>YPackage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YPackageImpl
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYPackage()
		 * @generated
		 */
		EClass YPACKAGE = eINSTANCE.getYPackage();

		/**
		 * The meta object literal for the '<em><b>Qualified Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YPACKAGE__QUALIFIED_NAME = eINSTANCE.getYPackage_QualifiedName();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPACKAGE__PACKAGE = eINSTANCE.getYPackage_Package();

		/**
		 * The meta object literal for the '<em><b>Owned Member Package</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPACKAGE__OWNED_MEMBER_PACKAGE = eINSTANCE.getYPackage_OwnedMemberPackage();

		/**
		 * The meta object literal for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YPackageableElementImpl <em>YPackageable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YPackageableElementImpl
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYPackageableElement()
		 * @generated
		 */
		EClass YPACKAGEABLE_ELEMENT = eINSTANCE.getYPackageableElement();

		/**
		 * The meta object literal for the '<em><b>Parent Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPACKAGEABLE_ELEMENT__PARENT_ELEMENT = eINSTANCE.getYPackageableElement_ParentElement();

		/**
		 * The meta object literal for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YPackageImportImpl <em>YPackage Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YPackageImportImpl
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYPackageImport()
		 * @generated
		 */
		EClass YPACKAGE_IMPORT = eINSTANCE.getYPackageImport();

		/**
		 * The meta object literal for the '<em><b>Imported Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPACKAGE_IMPORT__IMPORTED_PACKAGE = eINSTANCE.getYPackageImport_ImportedPackage();

		/**
		 * The meta object literal for the '<em><b>Importing Namespace</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPACKAGE_IMPORT__IMPORTING_NAMESPACE = eINSTANCE.getYPackageImport_ImportingNamespace();

		/**
		 * The meta object literal for the '<em><b>Owned Comment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPACKAGE_IMPORT__OWNED_COMMENT = eINSTANCE.getYPackageImport_OwnedComment();

		/**
		 * The meta object literal for the '<em><b>Owned Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPACKAGE_IMPORT__OWNED_ELEMENT = eINSTANCE.getYPackageImport_OwnedElement();

		/**
		 * The meta object literal for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YParameterImpl <em>YParameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YParameterImpl
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYParameter()
		 * @generated
		 */
		EClass YPARAMETER = eINSTANCE.getYParameter();

		/**
		 * The meta object literal for the '<em><b>Is Ordered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YPARAMETER__IS_ORDERED = eINSTANCE.getYParameter_IsOrdered();

		/**
		 * The meta object literal for the '<em><b>Is Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YPARAMETER__IS_UNIQUE = eINSTANCE.getYParameter_IsUnique();

		/**
		 * The meta object literal for the '<em><b>Lower</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YPARAMETER__LOWER = eINSTANCE.getYParameter_Lower();

		/**
		 * The meta object literal for the '<em><b>Upper</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YPARAMETER__UPPER = eINSTANCE.getYParameter_Upper();

		/**
		 * The meta object literal for the '<em><b>Qualified Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YPARAMETER__QUALIFIED_NAME = eINSTANCE.getYParameter_QualifiedName();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YPARAMETER__DIRECTION = eINSTANCE.getYParameter_Direction();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YPARAMETER__DEFAULT_VALUE = eINSTANCE.getYParameter_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YPARAMETER__DESCRIPTION = eINSTANCE.getYParameter_Description();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPARAMETER__TYPE = eINSTANCE.getYParameter_Type();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YPARAMETER__SIGNATURE = eINSTANCE.getYParameter_Signature();

		/**
		 * The meta object literal for the '<em><b>Upperbound Wildcard</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YPARAMETER__UPPERBOUND_WILDCARD = eINSTANCE.getYParameter_UpperboundWildcard();

		/**
		 * The meta object literal for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YPrimitiveTypeImpl <em>YPrimitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YPrimitiveTypeImpl
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYPrimitiveType()
		 * @generated
		 */
		EClass YPRIMITIVE_TYPE = eINSTANCE.getYPrimitiveType();

		/**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YPRIMITIVE_TYPE__IS_ABSTRACT = eINSTANCE.getYPrimitiveType_IsAbstract();

		/**
		 * The meta object literal for the '<em><b>Qualified Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YPRIMITIVE_TYPE__QUALIFIED_NAME = eINSTANCE.getYPrimitiveType_QualifiedName();

		/**
		 * The meta object literal for the '<em><b>Member</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPRIMITIVE_TYPE__MEMBER = eINSTANCE.getYPrimitiveType_Member();

		/**
		 * The meta object literal for the '<em><b>Element Import</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPRIMITIVE_TYPE__ELEMENT_IMPORT = eINSTANCE.getYPrimitiveType_ElementImport();

		/**
		 * The meta object literal for the '<em><b>Imported Member</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPRIMITIVE_TYPE__IMPORTED_MEMBER = eINSTANCE.getYPrimitiveType_ImportedMember();

		/**
		 * The meta object literal for the '<em><b>Package Import</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPRIMITIVE_TYPE__PACKAGE_IMPORT = eINSTANCE.getYPrimitiveType_PackageImport();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPRIMITIVE_TYPE__ATTRIBUTE = eINSTANCE.getYPrimitiveType_Attribute();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPRIMITIVE_TYPE__FEATURE = eINSTANCE.getYPrimitiveType_Feature();

		/**
		 * The meta object literal for the '<em><b>General</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPRIMITIVE_TYPE__GENERAL = eINSTANCE.getYPrimitiveType_General();

		/**
		 * The meta object literal for the '<em><b>Inherited Member</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPRIMITIVE_TYPE__INHERITED_MEMBER = eINSTANCE.getYPrimitiveType_InheritedMember();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPRIMITIVE_TYPE__PACKAGE = eINSTANCE.getYPrimitiveType_Package();

		/**
		 * The meta object literal for the '<em><b>Owned Comment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPRIMITIVE_TYPE__OWNED_COMMENT = eINSTANCE.getYPrimitiveType_OwnedComment();

		/**
		 * The meta object literal for the '<em><b>Owned Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPRIMITIVE_TYPE__OWNED_ELEMENT = eINSTANCE.getYPrimitiveType_OwnedElement();

		/**
		 * The meta object literal for the '<em><b>Owned Member</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPRIMITIVE_TYPE__OWNED_MEMBER = eINSTANCE.getYPrimitiveType_OwnedMember();

		/**
		 * The meta object literal for the '<em><b>Owned Rule</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPRIMITIVE_TYPE__OWNED_RULE = eINSTANCE.getYPrimitiveType_OwnedRule();

		/**
		 * The meta object literal for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YPropertyImpl <em>YProperty</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YPropertyImpl
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYProperty()
		 * @generated
		 */
		EClass YPROPERTY = eINSTANCE.getYProperty();

		/**
		 * The meta object literal for the '<em><b>Is Ordered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YPROPERTY__IS_ORDERED = eINSTANCE.getYProperty_IsOrdered();

		/**
		 * The meta object literal for the '<em><b>Is Derived</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YPROPERTY__IS_DERIVED = eINSTANCE.getYProperty_IsDerived();

		/**
		 * The meta object literal for the '<em><b>Is Derived Union</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YPROPERTY__IS_DERIVED_UNION = eINSTANCE.getYProperty_IsDerivedUnion();

		/**
		 * The meta object literal for the '<em><b>Association</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YPROPERTY__ASSOCIATION = eINSTANCE.getYProperty_Association();

		/**
		 * The meta object literal for the '<em><b>Qualified Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YPROPERTY__QUALIFIED_NAME = eINSTANCE.getYProperty_QualifiedName();

		/**
		 * The meta object literal for the '<em><b>Is Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YPROPERTY__IS_UNIQUE = eINSTANCE.getYProperty_IsUnique();

		/**
		 * The meta object literal for the '<em><b>Lower</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YPROPERTY__LOWER = eINSTANCE.getYProperty_Lower();

		/**
		 * The meta object literal for the '<em><b>Upper</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YPROPERTY__UPPER = eINSTANCE.getYProperty_Upper();

		/**
		 * The meta object literal for the '<em><b>Aggregation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YPROPERTY__AGGREGATION = eINSTANCE.getYProperty_Aggregation();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YPROPERTY__DEFAULT_VALUE = eINSTANCE.getYProperty_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YPROPERTY__DESCRIPTION = eINSTANCE.getYProperty_Description();

		/**
		 * The meta object literal for the '<em><b>Featuring Classifier</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPROPERTY__FEATURING_CLASSIFIER = eINSTANCE.getYProperty_FeaturingClassifier();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPROPERTY__TYPE = eINSTANCE.getYProperty_Type();

		/**
		 * The meta object literal for the '<em><b>Subsetted Property</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPROPERTY__SUBSETTED_PROPERTY = eINSTANCE.getYProperty_SubsettedProperty();

		/**
		 * The meta object literal for the '<em><b>Opposite</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPROPERTY__OPPOSITE = eINSTANCE.getYProperty_Opposite();

		/**
		 * The meta object literal for the '<em><b>Owned Comment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPROPERTY__OWNED_COMMENT = eINSTANCE.getYProperty_OwnedComment();

		/**
		 * The meta object literal for the '<em><b>Owned Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPROPERTY__OWNED_ELEMENT = eINSTANCE.getYProperty_OwnedElement();

		/**
		 * The meta object literal for the '<em><b>Clazz</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPROPERTY__CLAZZ = eINSTANCE.getYProperty_Clazz();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YPROPERTY__SIGNATURE = eINSTANCE.getYProperty_Signature();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YPROPERTY__VISIBILITY = eINSTANCE.getYProperty_Visibility();

		/**
		 * The meta object literal for the '<em><b>Observe</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YPROPERTY__OBSERVE = eINSTANCE.getYProperty_Observe();

		/**
		 * The meta object literal for the '<em><b>Invariant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YPROPERTY__INVARIANT = eINSTANCE.getYProperty_Invariant();

		/**
		 * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YPROPERTY__STATIC = eINSTANCE.getYProperty_Static();

		/**
		 * The meta object literal for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YTypeImpl <em>YType</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YTypeImpl
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYType()
		 * @generated
		 */
		EClass YTYPE = eINSTANCE.getYType();

		/**
		 * The meta object literal for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YStateMachineImpl <em>YState Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YStateMachineImpl
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYStateMachine()
		 * @generated
		 */
		EClass YSTATE_MACHINE = eINSTANCE.getYStateMachine();

		/**
		 * The meta object literal for the '<em><b>Initial Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YSTATE_MACHINE__INITIAL_ACTIVE = eINSTANCE.getYStateMachine_InitialActive();

		/**
		 * The meta object literal for the '<em><b>Qualified Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YSTATE_MACHINE__QUALIFIED_NAME = eINSTANCE.getYStateMachine_QualifiedName();

		/**
		 * The meta object literal for the '<em><b>Rtc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YSTATE_MACHINE__RTC = eINSTANCE.getYStateMachine_Rtc();

		/**
		 * The meta object literal for the '<em><b>Max Effects To Be Processed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YSTATE_MACHINE__MAX_EFFECTS_TO_BE_PROCESSED = eINSTANCE.getYStateMachine_MaxEffectsToBeProcessed();

		/**
		 * The meta object literal for the '<em><b>Called Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YSTATE_MACHINE__CALLED_OPERATION = eINSTANCE.getYStateMachine_CalledOperation();

		/**
		 * The meta object literal for the '<em><b>Owned Comment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YSTATE_MACHINE__OWNED_COMMENT = eINSTANCE.getYStateMachine_OwnedComment();

		/**
		 * The meta object literal for the '<em><b>Owned Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YSTATE_MACHINE__OWNED_ELEMENT = eINSTANCE.getYStateMachine_OwnedElement();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YSTATE_MACHINE__TRANSITION = eINSTANCE.getYStateMachine_Transition();

		/**
		 * The meta object literal for the '<em><b>Subvertex</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YSTATE_MACHINE__SUBVERTEX = eINSTANCE.getYStateMachine_Subvertex();

		/**
		 * The meta object literal for the '<em><b>Tr Attach</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YSTATE_MACHINE__TR_ATTACH = eINSTANCE.getYStateMachine_TrAttach();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YSTATE_MACHINE__OPERATION = eINSTANCE.getYStateMachine_Operation();

		/**
		 * The meta object literal for the '<em><b>Des Initializer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YSTATE_MACHINE__DES_INITIALIZER = eINSTANCE.getYStateMachine_DesInitializer();

		/**
		 * The meta object literal for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YTransitionImpl <em>YTransition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YTransitionImpl
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYTransition()
		 * @generated
		 */
		EClass YTRANSITION = eINSTANCE.getYTransition();

		/**
		 * The meta object literal for the '<em><b>Qualified Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YTRANSITION__QUALIFIED_NAME = eINSTANCE.getYTransition_QualifiedName();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YTRANSITION__SOURCE = eINSTANCE.getYTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YTRANSITION__TARGET = eINSTANCE.getYTransition_Target();

		/**
		 * The meta object literal for the '<em><b>Attachment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YTRANSITION__ATTACHMENT = eINSTANCE.getYTransition_Attachment();

		/**
		 * The meta object literal for the '<em><b>Owned Comment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YTRANSITION__OWNED_COMMENT = eINSTANCE.getYTransition_OwnedComment();

		/**
		 * The meta object literal for the '<em><b>Owned Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YTRANSITION__OWNED_ELEMENT = eINSTANCE.getYTransition_OwnedElement();

		/**
		 * The meta object literal for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YTrAttachmentImpl <em>YTr Attachment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YTrAttachmentImpl
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYTrAttachment()
		 * @generated
		 */
		EClass YTR_ATTACHMENT = eINSTANCE.getYTrAttachment();

		/**
		 * The meta object literal for the '<em><b>Qualified Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YTR_ATTACHMENT__QUALIFIED_NAME = eINSTANCE.getYTrAttachment_QualifiedName();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YTR_ATTACHMENT__TRANSITION = eINSTANCE.getYTrAttachment_Transition();

		/**
		 * The meta object literal for the '<em><b>Effects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YTR_ATTACHMENT__EFFECTS = eINSTANCE.getYTrAttachment_Effects();

		/**
		 * The meta object literal for the '<em><b>Guard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YTR_ATTACHMENT__GUARD = eINSTANCE.getYTrAttachment_Guard();

		/**
		 * The meta object literal for the '<em><b>Guard String Rep</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YTR_ATTACHMENT__GUARD_STRING_REP = eINSTANCE.getYTrAttachment_GuardStringRep();

		/**
		 * The meta object literal for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YEffectImpl <em>YEffect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YEffectImpl
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYEffect()
		 * @generated
		 */
		EClass YEFFECT = eINSTANCE.getYEffect();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YEFFECT__BODY = eINSTANCE.getYEffect_Body();

		/**
		 * The meta object literal for the '<em><b>Breakpoint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YEFFECT__BREAKPOINT = eINSTANCE.getYEffect_Breakpoint();

		/**
		 * The meta object literal for the '<em><b>Effect String Rep</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YEFFECT__EFFECT_STRING_REP = eINSTANCE.getYEffect_EffectStringRep();

		/**
		 * The meta object literal for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YVertexImpl <em>YVertex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YVertexImpl
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYVertex()
		 * @generated
		 */
		EClass YVERTEX = eINSTANCE.getYVertex();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YVERTEX__OUTGOING = eINSTANCE.getYVertex_Outgoing();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YVERTEX__INCOMING = eINSTANCE.getYVertex_Incoming();

		/**
		 * The meta object literal for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YPseudostateImpl <em>YPseudostate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YPseudostateImpl
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYPseudostate()
		 * @generated
		 */
		EClass YPSEUDOSTATE = eINSTANCE.getYPseudostate();

		/**
		 * The meta object literal for the '<em><b>Qualified Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YPSEUDOSTATE__QUALIFIED_NAME = eINSTANCE.getYPseudostate_QualifiedName();

		/**
		 * The meta object literal for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YFinalStateImpl <em>YFinal State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YFinalStateImpl
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYFinalState()
		 * @generated
		 */
		EClass YFINAL_STATE = eINSTANCE.getYFinalState();

		/**
		 * The meta object literal for the '<em><b>Qualified Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YFINAL_STATE__QUALIFIED_NAME = eINSTANCE.getYFinalState_QualifiedName();

		/**
		 * The meta object literal for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YStateImpl <em>YState</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YStateImpl
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYState()
		 * @generated
		 */
		EClass YSTATE = eINSTANCE.getYState();

		/**
		 * The meta object literal for the '<em><b>Qualified Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YSTATE__QUALIFIED_NAME = eINSTANCE.getYState_QualifiedName();

		/**
		 * The meta object literal for the '<em><b>State Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YSTATE__STATE_NAME = eINSTANCE.getYState_StateName();

		/**
		 * The meta object literal for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YModelImpl <em>YModel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YModelImpl
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYModel()
		 * @generated
		 */
		EClass YMODEL = eINSTANCE.getYModel();

		/**
		 * The meta object literal for the '<em><b>Clazz</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YMODEL__CLAZZ = eINSTANCE.getYModel_Clazz();

		/**
		 * The meta object literal for the '<em><b>Enumerations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YMODEL__ENUMERATIONS = eINSTANCE.getYModel_Enumerations();

		/**
		 * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YMODEL__PACKAGES = eINSTANCE.getYModel_Packages();

		/**
		 * The meta object literal for the '<em><b>Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YMODEL__OBJECTS = eINSTANCE.getYModel_Objects();

		/**
		 * The meta object literal for the '<em><b>Shared Edges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YMODEL__SHARED_EDGES = eINSTANCE.getYModel_SharedEdges();

		/**
		 * The meta object literal for the '<em><b>Composite Edges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YMODEL__COMPOSITE_EDGES = eINSTANCE.getYModel_CompositeEdges();

		/**
		 * The meta object literal for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YSharedEdgeImpl <em>YShared Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YSharedEdgeImpl
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYSharedEdge()
		 * @generated
		 */
		EClass YSHARED_EDGE = eINSTANCE.getYSharedEdge();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YSHARED_EDGE__DESCRIPTION = eINSTANCE.getYSharedEdge_Description();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YSHARED_EDGE__SOURCE = eINSTANCE.getYSharedEdge_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YSHARED_EDGE__TARGET = eINSTANCE.getYSharedEdge_Target();

		/**
		 * The meta object literal for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YCompositeEdgeImpl <em>YComposite Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YCompositeEdgeImpl
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYCompositeEdge()
		 * @generated
		 */
		EClass YCOMPOSITE_EDGE = eINSTANCE.getYCompositeEdge();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YCOMPOSITE_EDGE__DESCRIPTION = eINSTANCE.getYCompositeEdge_Description();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YCOMPOSITE_EDGE__SOURCE = eINSTANCE.getYCompositeEdge_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YCOMPOSITE_EDGE__TARGET = eINSTANCE.getYCompositeEdge_Target();

		/**
		 * The meta object literal for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YObjectImpl <em>YObject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YObjectImpl
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYObject()
		 * @generated
		 */
		EClass YOBJECT = eINSTANCE.getYObject();

		/**
		 * The meta object literal for the '<em><b>Object ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YOBJECT__OBJECT_ID = eINSTANCE.getYObject_ObjectID();

		/**
		 * The meta object literal for the '<em><b>Dsl Info</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YOBJECT__DSL_INFO = eINSTANCE.getYObject_DslInfo();

		/**
		 * The meta object literal for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YStateMachineHandlerImpl <em>YState Machine Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YStateMachineHandlerImpl
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYStateMachineHandler()
		 * @generated
		 */
		EClass YSTATE_MACHINE_HANDLER = eINSTANCE.getYStateMachineHandler();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YSTATE_MACHINE_HANDLER__STATE = eINSTANCE.getYStateMachineHandler_State();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YSTATE_MACHINE_HANDLER__TRANSITION = eINSTANCE.getYStateMachineHandler_Transition();

		/**
		 * The meta object literal for the '<em><b>Is Suspended</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YSTATE_MACHINE_HANDLER__IS_SUSPENDED = eINSTANCE.getYStateMachineHandler_IsSuspended();

		/**
		 * The meta object literal for the '<em><b>Effect Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YSTATE_MACHINE_HANDLER__EFFECT_COUNT = eINSTANCE.getYStateMachineHandler_EffectCount();

		/**
		 * The meta object literal for the '<em><b>Effect No</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YSTATE_MACHINE_HANDLER__EFFECT_NO = eINSTANCE.getYStateMachineHandler_EffectNo();

		/**
		 * The meta object literal for the '<em><b>State Machine</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YSTATE_MACHINE_HANDLER__STATE_MACHINE = eINSTANCE.getYStateMachineHandler_StateMachine();

		/**
		 * The meta object literal for the '<em><b>Effect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YSTATE_MACHINE_HANDLER__EFFECT = eINSTANCE.getYStateMachineHandler_Effect();

		/**
		 * The meta object literal for the '<em><b>Called From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YSTATE_MACHINE_HANDLER__CALLED_FROM = eINSTANCE.getYStateMachineHandler_CalledFrom();

		/**
		 * The meta object literal for the '<em><b>Its Class ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YSTATE_MACHINE_HANDLER__ITS_CLASS_ID = eINSTANCE.getYStateMachineHandler_ItsClassID();

		/**
		 * The meta object literal for the '<em><b>Operation Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YSTATE_MACHINE_HANDLER__OPERATION_INSTANCE = eINSTANCE.getYStateMachineHandler_OperationInstance();

		/**
		 * The meta object literal for the '<em><b>Effects Processed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YSTATE_MACHINE_HANDLER__EFFECTS_PROCESSED = eINSTANCE.getYStateMachineHandler_EffectsProcessed();

		/**
		 * The meta object literal for the '<em><b>Max Effects To Be Processed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YSTATE_MACHINE_HANDLER__MAX_EFFECTS_TO_BE_PROCESSED = eINSTANCE.getYStateMachineHandler_MaxEffectsToBeProcessed();

		/**
		 * The meta object literal for the '<em><b>In Adapters</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YSTATE_MACHINE_HANDLER__IN_ADAPTERS = eINSTANCE.getYStateMachineHandler_InAdapters();

		/**
		 * The meta object literal for the '<em><b>Objects Binded With Inout Parameters</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YSTATE_MACHINE_HANDLER__OBJECTS_BINDED_WITH_INOUT_PARAMETERS = eINSTANCE.getYStateMachineHandler_ObjectsBindedWithInoutParameters();

		/**
		 * The meta object literal for the '<em><b>Return Var</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YSTATE_MACHINE_HANDLER__RETURN_VAR = eINSTANCE.getYStateMachineHandler_ReturnVar();

		/**
		 * The meta object literal for the '<em><b>Name Of Retun Var</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YSTATE_MACHINE_HANDLER__NAME_OF_RETUN_VAR = eINSTANCE.getYStateMachineHandler_NameOfRetunVar();

		/**
		 * The meta object literal for the '<em><b>Objects To Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YSTATE_MACHINE_HANDLER__OBJECTS_TO_COLOR = eINSTANCE.getYStateMachineHandler_ObjectsToColor();

		/**
		 * The meta object literal for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YGlobalStateMachineImpl <em>YGlobal State Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YGlobalStateMachineImpl
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYGlobalStateMachine()
		 * @generated
		 */
		EClass YGLOBAL_STATE_MACHINE = eINSTANCE.getYGlobalStateMachine();

		/**
		 * The meta object literal for the '<em><b>State Machines</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YGLOBAL_STATE_MACHINE__STATE_MACHINES = eINSTANCE.getYGlobalStateMachine_StateMachines();

		/**
		 * The meta object literal for the '<em><b>State Machine Handlers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YGLOBAL_STATE_MACHINE__STATE_MACHINE_HANDLERS = eINSTANCE.getYGlobalStateMachine_StateMachineHandlers();

		/**
		 * The meta object literal for the '<em><b>State Machine Handler Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YGLOBAL_STATE_MACHINE__STATE_MACHINE_HANDLER_COUNT = eINSTANCE.getYGlobalStateMachine_StateMachineHandlerCount();

		/**
		 * The meta object literal for the '<em><b>Constraints All True</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YGLOBAL_STATE_MACHINE__CONSTRAINTS_ALL_TRUE = eINSTANCE.getYGlobalStateMachine_ConstraintsAllTrue();

		/**
		 * The meta object literal for the '<em><b>Has Return Param</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YGLOBAL_STATE_MACHINE__HAS_RETURN_PARAM = eINSTANCE.getYGlobalStateMachine_HasReturnParam();

		/**
		 * The meta object literal for the '<em><b>Param Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YGLOBAL_STATE_MACHINE__PARAM_COUNT = eINSTANCE.getYGlobalStateMachine_ParamCount();

		/**
		 * The meta object literal for the '<em><b>State Exit Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YGLOBAL_STATE_MACHINE__STATE_EXIT_COUNT = eINSTANCE.getYGlobalStateMachine_StateExitCount();

		/**
		 * The meta object literal for the '<em><b>State Exit No</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YGLOBAL_STATE_MACHINE__STATE_EXIT_NO = eINSTANCE.getYGlobalStateMachine_StateExitNo();

		/**
		 * The meta object literal for the '<em><b>O</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YGLOBAL_STATE_MACHINE__O = eINSTANCE.getYGlobalStateMachine_O();

		/**
		 * The meta object literal for the '<em><b>Observer Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YGLOBAL_STATE_MACHINE__OBSERVER_ACTIVE = eINSTANCE.getYGlobalStateMachine_ObserverActive();

		/**
		 * The meta object literal for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YCreateInstanceExpressionImpl <em>YCreate Instance Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YCreateInstanceExpressionImpl
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYCreateInstanceExpression()
		 * @generated
		 */
		EClass YCREATE_INSTANCE_EXPRESSION = eINSTANCE.getYCreateInstanceExpression();

		/**
		 * The meta object literal for the '<em><b>Clazz</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YCREATE_INSTANCE_EXPRESSION__CLAZZ = eINSTANCE.getYCreateInstanceExpression_Clazz();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YCREATE_INSTANCE_EXPRESSION__FEATURE = eINSTANCE.getYCreateInstanceExpression_Feature();

		/**
		 * The meta object literal for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YPrintExpressionImpl <em>YPrint Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YPrintExpressionImpl
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYPrintExpression()
		 * @generated
		 */
		EClass YPRINT_EXPRESSION = eINSTANCE.getYPrintExpression();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPRINT_EXPRESSION__EXPRESSION = eINSTANCE.getYPrintExpression_Expression();

		/**
		 * The meta object literal for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YSetReturnValueImpl <em>YSet Return Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YSetReturnValueImpl
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYSetReturnValue()
		 * @generated
		 */
		EClass YSET_RETURN_VALUE = eINSTANCE.getYSetReturnValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YSET_RETURN_VALUE__VALUE = eINSTANCE.getYSetReturnValue_Value();

		/**
		 * The meta object literal for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YGetInstancesOfExpressionImpl <em>YGet Instances Of Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YGetInstancesOfExpressionImpl
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYGetInstancesOfExpression()
		 * @generated
		 */
		EClass YGET_INSTANCES_OF_EXPRESSION = eINSTANCE.getYGetInstancesOfExpression();

		/**
		 * The meta object literal for the '<em><b>Clazz</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YGET_INSTANCES_OF_EXPRESSION__CLAZZ = eINSTANCE.getYGetInstancesOfExpression_Clazz();

		/**
		 * The meta object literal for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YMemberFeatureCallImpl <em>YMember Feature Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YMemberFeatureCallImpl
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYMemberFeatureCall()
		 * @generated
		 */
		EClass YMEMBER_FEATURE_CALL = eINSTANCE.getYMemberFeatureCall();

		/**
		 * The meta object literal for the '<em><b>Inheritance Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YMEMBER_FEATURE_CALL__INHERITANCE_TYPE = eINSTANCE.getYMemberFeatureCall_InheritanceType();

		/**
		 * The meta object literal for the '<em><b>Explicit Inheritance Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YMEMBER_FEATURE_CALL__EXPLICIT_INHERITANCE_TYPE = eINSTANCE.getYMemberFeatureCall_ExplicitInheritanceType();

		/**
		 * The meta object literal for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YFeatureCallImpl <em>YFeature Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YFeatureCallImpl
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYFeatureCall()
		 * @generated
		 */
		EClass YFEATURE_CALL = eINSTANCE.getYFeatureCall();

		/**
		 * The meta object literal for the '<em><b>Explicit Inheritance Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YFEATURE_CALL__EXPLICIT_INHERITANCE_TYPE = eINSTANCE.getYFeatureCall_ExplicitInheritanceType();

		/**
		 * The meta object literal for the '<em><b>Inheritance Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YFEATURE_CALL__INHERITANCE_TYPE = eINSTANCE.getYFeatureCall_InheritanceType();

		/**
		 * The meta object literal for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YGetObjectManagementImpl <em>YGet Object Management</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YGetObjectManagementImpl
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYGetObjectManagement()
		 * @generated
		 */
		EClass YGET_OBJECT_MANAGEMENT = eINSTANCE.getYGetObjectManagement();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YGET_OBJECT_MANAGEMENT__PARAMETER = eINSTANCE.getYGetObjectManagement_Parameter();

		/**
		 * The meta object literal for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YGetLayerInformationImpl <em>YGet Layer Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YGetLayerInformationImpl
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYGetLayerInformation()
		 * @generated
		 */
		EClass YGET_LAYER_INFORMATION = eINSTANCE.getYGetLayerInformation();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YGET_LAYER_INFORMATION__PARAMETER = eINSTANCE.getYGetLayerInformation_Parameter();

		/**
		 * The meta object literal for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YColorDFAObjectImpl <em>YColor DFA Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YColorDFAObjectImpl
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYColorDFAObject()
		 * @generated
		 */
		EClass YCOLOR_DFA_OBJECT = eINSTANCE.getYColorDFAObject();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YCOLOR_DFA_OBJECT__ID = eINSTANCE.getYColorDFAObject_Id();

		/**
		 * The meta object literal for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YGetInstancesImpl <em>YGet Instances</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YGetInstancesImpl
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYGetInstances()
		 * @generated
		 */
		EClass YGET_INSTANCES = eINSTANCE.getYGetInstances();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YGET_INSTANCES__PARAMETER = eINSTANCE.getYGetInstances_Parameter();

		/**
		 * The meta object literal for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YCountFinalStatesImpl <em>YCount Final States</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YCountFinalStatesImpl
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYCountFinalStates()
		 * @generated
		 */
		EClass YCOUNT_FINAL_STATES = eINSTANCE.getYCountFinalStates();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YCOUNT_FINAL_STATES__PARAMETER = eINSTANCE.getYCountFinalStates_Parameter();

		/**
		 * The meta object literal for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YCountInitialStatesImpl <em>YCount Initial States</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YCountInitialStatesImpl
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYCountInitialStates()
		 * @generated
		 */
		EClass YCOUNT_INITIAL_STATES = eINSTANCE.getYCountInitialStates();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YCOUNT_INITIAL_STATES__PARAMETER = eINSTANCE.getYCountInitialStates_Parameter();

		/**
		 * The meta object literal for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YCountStatesImpl <em>YCount States</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YCountStatesImpl
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYCountStates()
		 * @generated
		 */
		EClass YCOUNT_STATES = eINSTANCE.getYCountStates();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YCOUNT_STATES__PARAMETER = eINSTANCE.getYCountStates_Parameter();

		/**
		 * The meta object literal for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YSetAbsoluteNodePropabilityImpl <em>YSet Absolute Node Propability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YSetAbsoluteNodePropabilityImpl
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYSetAbsoluteNodePropability()
		 * @generated
		 */
		EClass YSET_ABSOLUTE_NODE_PROPABILITY = eINSTANCE.getYSetAbsoluteNodePropability();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YSET_ABSOLUTE_NODE_PROPABILITY__PARAMETER = eINSTANCE.getYSetAbsoluteNodePropability_Parameter();

		/**
		 * The meta object literal for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YCountReachableStatesImpl <em>YCount Reachable States</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YCountReachableStatesImpl
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYCountReachableStates()
		 * @generated
		 */
		EClass YCOUNT_REACHABLE_STATES = eINSTANCE.getYCountReachableStates();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YCOUNT_REACHABLE_STATES__PARAMETER = eINSTANCE.getYCountReachableStates_Parameter();

		/**
		 * The meta object literal for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YCountInValidTransitionsImpl <em>YCount In Valid Transitions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YCountInValidTransitionsImpl
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYCountInValidTransitions()
		 * @generated
		 */
		EClass YCOUNT_IN_VALID_TRANSITIONS = eINSTANCE.getYCountInValidTransitions();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YCOUNT_IN_VALID_TRANSITIONS__PARAMETER = eINSTANCE.getYCountInValidTransitions_Parameter();

		/**
		 * The meta object literal for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YSetPopulationSizeImpl <em>YSet Population Size</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YSetPopulationSizeImpl
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYSetPopulationSize()
		 * @generated
		 */
		EClass YSET_POPULATION_SIZE = eINSTANCE.getYSetPopulationSize();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YSET_POPULATION_SIZE__PARAMETER = eINSTANCE.getYSetPopulationSize_Parameter();

		/**
		 * The meta object literal for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YLoadModelImpl <em>YLoad Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YLoadModelImpl
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYLoadModel()
		 * @generated
		 */
		EClass YLOAD_MODEL = eINSTANCE.getYLoadModel();

		/**
		 * The meta object literal for the '<em><b>Rel Model Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YLOAD_MODEL__REL_MODEL_PATH = eINSTANCE.getYLoadModel_RelModelPath();

		/**
		 * The meta object literal for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.DslInfoImpl <em>Dsl Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.DslInfoImpl
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getDslInfo()
		 * @generated
		 */
		EClass DSL_INFO = eINSTANCE.getDslInfo();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL_INFO__FEATURES = eINSTANCE.getDslInfo_Features();

		/**
		 * The meta object literal for the '<em><b>First Line</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL_INFO__FIRST_LINE = eINSTANCE.getDslInfo_FirstLine();

		/**
		 * The meta object literal for the '<em><b>Last Line</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL_INFO__LAST_LINE = eINSTANCE.getDslInfo_LastLine();

		/**
		 * The meta object literal for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.FeatureInfoImpl <em>Feature Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.FeatureInfoImpl
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getFeatureInfo()
		 * @generated
		 */
		EClass FEATURE_INFO = eINSTANCE.getFeatureInfo();

		/**
		 * The meta object literal for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.SingleLinePropertyInfoImpl <em>Single Line Property Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.SingleLinePropertyInfoImpl
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getSingleLinePropertyInfo()
		 * @generated
		 */
		EClass SINGLE_LINE_PROPERTY_INFO = eINSTANCE.getSingleLinePropertyInfo();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_LINE_PROPERTY_INFO__LINE = eINSTANCE.getSingleLinePropertyInfo_Line();

		/**
		 * The meta object literal for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.GuardInfoImpl <em>Guard Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.GuardInfoImpl
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getGuardInfo()
		 * @generated
		 */
		EClass GUARD_INFO = eINSTANCE.getGuardInfo();

		/**
		 * The meta object literal for the '<em><b>First Line Guard</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUARD_INFO__FIRST_LINE_GUARD = eINSTANCE.getGuardInfo_FirstLineGuard();

		/**
		 * The meta object literal for the '<em><b>Last Line Guard</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUARD_INFO__LAST_LINE_GUARD = eINSTANCE.getGuardInfo_LastLineGuard();

		/**
		 * The meta object literal for the '<em><b>Ignore Notification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUARD_INFO__IGNORE_NOTIFICATION = eINSTANCE.getGuardInfo_IgnoreNotification();

		/**
		 * The meta object literal for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.EffectInfoImpl <em>Effect Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.EffectInfoImpl
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getEffectInfo()
		 * @generated
		 */
		EClass EFFECT_INFO = eINSTANCE.getEffectInfo();

		/**
		 * The meta object literal for the '<em><b>First Line Effect</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EFFECT_INFO__FIRST_LINE_EFFECT = eINSTANCE.getEffectInfo_FirstLineEffect();

		/**
		 * The meta object literal for the '<em><b>Last Line Effect</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EFFECT_INFO__LAST_LINE_EFFECT = eINSTANCE.getEffectInfo_LastLineEffect();

		/**
		 * The meta object literal for the '<em><b>Ignore Notification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFFECT_INFO__IGNORE_NOTIFICATION = eINSTANCE.getEffectInfo_IgnoreNotification();

		/**
		 * The meta object literal for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.ContainmentInfoImpl <em>Containment Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.ContainmentInfoImpl
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getContainmentInfo()
		 * @generated
		 */
		EClass CONTAINMENT_INFO = eINSTANCE.getContainmentInfo();

		/**
		 * The meta object literal for the '<em><b>Insertion Line</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINMENT_INFO__INSERTION_LINE = eINSTANCE.getContainmentInfo_InsertionLine();

		/**
		 * The meta object literal for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.EStructuralFeatureToFeatureInfoMapImpl <em>EStructural Feature To Feature Info Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.EStructuralFeatureToFeatureInfoMapImpl
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getEStructuralFeatureToFeatureInfoMap()
		 * @generated
		 */
		EClass ESTRUCTURAL_FEATURE_TO_FEATURE_INFO_MAP = eINSTANCE.getEStructuralFeatureToFeatureInfoMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESTRUCTURAL_FEATURE_TO_FEATURE_INFO_MAP__KEY = eINSTANCE.getEStructuralFeatureToFeatureInfoMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESTRUCTURAL_FEATURE_TO_FEATURE_INFO_MAP__VALUE = eINSTANCE.getEStructuralFeatureToFeatureInfoMap_Value();

		/**
		 * The meta object literal for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.LineImpl <em>Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.LineImpl
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getLine()
		 * @generated
		 */
		EClass LINE = eINSTANCE.getLine();

		/**
		 * The meta object literal for the '<em><b>Pos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE__POS = eINSTANCE.getLine_Pos();

		/**
		 * The meta object literal for the '<em><b>Processed Offsets</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE__PROCESSED_OFFSETS = eINSTANCE.getLine_ProcessedOffsets();

		/**
		 * The meta object literal for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YStructureImpl <em>YStructure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YStructureImpl
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYStructure()
		 * @generated
		 */
		EClass YSTRUCTURE = eINSTANCE.getYStructure();

		/**
		 * The meta object literal for the '{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YObserverAddValueImpl <em>YObserver Add Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YObserverAddValueImpl
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYObserverAddValue()
		 * @generated
		 */
		EClass YOBSERVER_ADD_VALUE = eINSTANCE.getYObserverAddValue();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YOBSERVER_ADD_VALUE__PARAMETER = eINSTANCE.getYObserverAddValue_Parameter();

		/**
		 * The meta object literal for the '{@link dev.yamm.coreModelDiagram.yammDiagram.YAggregationKind <em>YAggregation Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dev.yamm.coreModelDiagram.yammDiagram.YAggregationKind
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYAggregationKind()
		 * @generated
		 */
		EEnum YAGGREGATION_KIND = eINSTANCE.getYAggregationKind();

		/**
		 * The meta object literal for the '{@link dev.yamm.coreModelDiagram.yammDiagram.YParameterDirectionKind <em>YParameter Direction Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dev.yamm.coreModelDiagram.yammDiagram.YParameterDirectionKind
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYParameterDirectionKind()
		 * @generated
		 */
		EEnum YPARAMETER_DIRECTION_KIND = eINSTANCE.getYParameterDirectionKind();

		/**
		 * The meta object literal for the '{@link dev.yamm.coreModelDiagram.yammDiagram.YRunToCompletion <em>YRun To Completion</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dev.yamm.coreModelDiagram.yammDiagram.YRunToCompletion
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYRunToCompletion()
		 * @generated
		 */
		EEnum YRUN_TO_COMPLETION = eINSTANCE.getYRunToCompletion();

		/**
		 * The meta object literal for the '{@link dev.yamm.coreModelDiagram.yammDiagram.YVisibilityKind <em>YVisibility Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dev.yamm.coreModelDiagram.yammDiagram.YVisibilityKind
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getYVisibilityKind()
		 * @generated
		 */
		EEnum YVISIBILITY_KIND = eINSTANCE.getYVisibilityKind();

		/**
		 * The meta object literal for the '<em>EString2</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see dev.yamm.coreModelDiagram.yammDiagram.impl.YammDiagramPackageImpl#getEString2()
		 * @generated
		 */
		EDataType ESTRING2 = eINSTANCE.getEString2();

	}

} //YammDiagramPackage
