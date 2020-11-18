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
package online.yamm.coreModelXmi.yamm;

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
 * @see online.yamm.coreModelXmi.yamm.YammFactory
 * @model kind="package"
 * @generated
 */
public interface YammPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "yamm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.yamm.online/coreModelXmi/Yamm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "yamm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	YammPackage eINSTANCE = online.yamm.coreModelXmi.yamm.impl.YammPackageImpl.init();

	/**
	 * The meta object id for the '{@link online.yamm.coreModelXmi.yamm.impl.YObjectImpl <em>YObject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.coreModelXmi.yamm.impl.YObjectImpl
	 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYObject()
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
	 * The meta object id for the '{@link online.yamm.coreModelXmi.yamm.impl.YElementImpl <em>YElement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.coreModelXmi.yamm.impl.YElementImpl
	 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYElement()
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
	 * The meta object id for the '{@link online.yamm.coreModelXmi.yamm.impl.YClassImpl <em>YClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.coreModelXmi.yamm.impl.YClassImpl
	 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYClass()
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
	 * The feature id for the '<em><b>Insert Line Super Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCLASS__INSERT_LINE_SUPER_CLASS = YELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Insert Line Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCLASS__INSERT_LINE_ATTRIBUTE = YELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Insert Line Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCLASS__INSERT_LINE_OPERATION = YELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Pos Object ID</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCLASS__POS_OBJECT_ID = YELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Pos Is Abstract</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCLASS__POS_IS_ABSTRACT = YELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Pos Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCLASS__POS_NAME = YELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Pos Qualified Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCLASS__POS_QUALIFIED_NAME = YELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Pos Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCLASS__POS_PACKAGE = YELEMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Observe Queue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCLASS__OBSERVE_QUEUE = YELEMENT_FEATURE_COUNT + 16;

	/**
	 * The number of structural features of the '<em>YClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCLASS_FEATURE_COUNT = YELEMENT_FEATURE_COUNT + 17;

	/**
	 * The meta object id for the '{@link online.yamm.coreModelXmi.yamm.impl.YClassifierImpl <em>YClassifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.coreModelXmi.yamm.impl.YClassifierImpl
	 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYClassifier()
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
	 * The meta object id for the '{@link online.yamm.coreModelXmi.yamm.impl.YCommentImpl <em>YComment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.coreModelXmi.yamm.impl.YCommentImpl
	 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYComment()
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
	 * The meta object id for the '{@link online.yamm.coreModelXmi.yamm.impl.YConstraintImpl <em>YConstraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.coreModelXmi.yamm.impl.YConstraintImpl
	 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYConstraint()
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
	 * The meta object id for the '{@link online.yamm.coreModelXmi.yamm.impl.YDataTypeImpl <em>YData Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.coreModelXmi.yamm.impl.YDataTypeImpl
	 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYDataType()
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
	 * The meta object id for the '{@link online.yamm.coreModelXmi.yamm.impl.YElementImportImpl <em>YElement Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.coreModelXmi.yamm.impl.YElementImportImpl
	 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYElementImport()
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
	 * The meta object id for the '{@link online.yamm.coreModelXmi.yamm.impl.YEnumerationImpl <em>YEnumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.coreModelXmi.yamm.impl.YEnumerationImpl
	 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYEnumeration()
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
	 * The feature id for the '<em><b>Pos Object ID</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YENUMERATION__POS_OBJECT_ID = YELEMENT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Pos Is Abstract</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YENUMERATION__POS_IS_ABSTRACT = YELEMENT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Pos Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YENUMERATION__POS_NAME = YELEMENT_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Pos Qualified Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YENUMERATION__POS_QUALIFIED_NAME = YELEMENT_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Pos Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YENUMERATION__POS_PACKAGE = YELEMENT_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Insert Line Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YENUMERATION__INSERT_LINE_LITERAL = YELEMENT_FEATURE_COUNT + 23;

	/**
	 * The number of structural features of the '<em>YEnumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YENUMERATION_FEATURE_COUNT = YELEMENT_FEATURE_COUNT + 24;

	/**
	 * The meta object id for the '{@link online.yamm.coreModelXmi.yamm.impl.YEnumerationLiteralImpl <em>YEnumeration Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.coreModelXmi.yamm.impl.YEnumerationLiteralImpl
	 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYEnumerationLiteral()
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
	 * The feature id for the '<em><b>Pos Object ID</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YENUMERATION_LITERAL__POS_OBJECT_ID = YELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Pos Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YENUMERATION_LITERAL__POS_NAME = YELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Pos Qualified Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YENUMERATION_LITERAL__POS_QUALIFIED_NAME = YELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>YEnumeration Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YENUMERATION_LITERAL_FEATURE_COUNT = YELEMENT_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link online.yamm.coreModelXmi.yamm.impl.YFeatureImpl <em>YFeature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.coreModelXmi.yamm.impl.YFeatureImpl
	 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYFeature()
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
	 * The meta object id for the '{@link online.yamm.coreModelXmi.yamm.impl.YNamedElementImpl <em>YNamed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.coreModelXmi.yamm.impl.YNamedElementImpl
	 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYNamedElement()
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
	 * The meta object id for the '{@link online.yamm.coreModelXmi.yamm.impl.YNamespaceImpl <em>YNamespace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.coreModelXmi.yamm.impl.YNamespaceImpl
	 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYNamespace()
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
	 * The meta object id for the '{@link online.yamm.coreModelXmi.yamm.impl.YOperationImpl <em>YOperation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.coreModelXmi.yamm.impl.YOperationImpl
	 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYOperation()
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
	 * The feature id for the '<em><b>Pos Object ID</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOPERATION__POS_OBJECT_ID = YELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Pos Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOPERATION__POS_NAME = YELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Pos Clazz</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOPERATION__POS_CLAZZ = YELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Pos Lower</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOPERATION__POS_LOWER = YELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Pos Upper</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOPERATION__POS_UPPER = YELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Pos State Machine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOPERATION__POS_STATE_MACHINE = YELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Pos Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOPERATION__POS_RETURN_TYPE = YELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Insert Line Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOPERATION__INSERT_LINE_PARAMETER = YELEMENT_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>YOperation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOPERATION_FEATURE_COUNT = YELEMENT_FEATURE_COUNT + 16;

	/**
	 * The meta object id for the '{@link online.yamm.coreModelXmi.yamm.impl.YPackageImpl <em>YPackage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.coreModelXmi.yamm.impl.YPackageImpl
	 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYPackage()
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
	 * The feature id for the '<em><b>Pos Object ID</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPACKAGE__POS_OBJECT_ID = YELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Pos Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPACKAGE__POS_NAME = YELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Pos Qualified Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPACKAGE__POS_QUALIFIED_NAME = YELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Pos Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPACKAGE__POS_PACKAGE = YELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Insert Line Member</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPACKAGE__INSERT_LINE_MEMBER = YELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>YPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPACKAGE_FEATURE_COUNT = YELEMENT_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link online.yamm.coreModelXmi.yamm.impl.YPackageableElementImpl <em>YPackageable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.coreModelXmi.yamm.impl.YPackageableElementImpl
	 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYPackageableElement()
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
	 * The meta object id for the '{@link online.yamm.coreModelXmi.yamm.impl.YPackageImportImpl <em>YPackage Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.coreModelXmi.yamm.impl.YPackageImportImpl
	 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYPackageImport()
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
	 * The meta object id for the '{@link online.yamm.coreModelXmi.yamm.impl.YParameterImpl <em>YParameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.coreModelXmi.yamm.impl.YParameterImpl
	 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYParameter()
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
	 * The feature id for the '<em><b>Pos Object ID</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPARAMETER__POS_OBJECT_ID = YELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Pos Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPARAMETER__POS_NAME = YELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Pos Ordered</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPARAMETER__POS_ORDERED = YELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Pos Unique</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPARAMETER__POS_UNIQUE = YELEMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Pos Lower</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPARAMETER__POS_LOWER = YELEMENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Pos Upper</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPARAMETER__POS_UPPER = YELEMENT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Pos Upperbound Wildcard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPARAMETER__POS_UPPERBOUND_WILDCARD = YELEMENT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Pos Direction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPARAMETER__POS_DIRECTION = YELEMENT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Pos Default Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPARAMETER__POS_DEFAULT_VALUE = YELEMENT_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Pos Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPARAMETER__POS_TYPE = YELEMENT_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Pos Qualified Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPARAMETER__POS_QUALIFIED_NAME = YELEMENT_FEATURE_COUNT + 22;

	/**
	 * The number of structural features of the '<em>YParameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPARAMETER_FEATURE_COUNT = YELEMENT_FEATURE_COUNT + 23;

	/**
	 * The meta object id for the '{@link online.yamm.coreModelXmi.yamm.impl.YPrimitiveTypeImpl <em>YPrimitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.coreModelXmi.yamm.impl.YPrimitiveTypeImpl
	 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYPrimitiveType()
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
	 * The meta object id for the '{@link online.yamm.coreModelXmi.yamm.impl.YPropertyImpl <em>YProperty</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.coreModelXmi.yamm.impl.YPropertyImpl
	 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYProperty()
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
	 * The feature id for the '<em><b>Pos Object ID</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPROPERTY__POS_OBJECT_ID = YELEMENT_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Pos Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPROPERTY__POS_NAME = YELEMENT_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Pos Ordered</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPROPERTY__POS_ORDERED = YELEMENT_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Pos Unique</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPROPERTY__POS_UNIQUE = YELEMENT_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Pos Lower</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPROPERTY__POS_LOWER = YELEMENT_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Pos Upper</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPROPERTY__POS_UPPER = YELEMENT_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Pos Default Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPROPERTY__POS_DEFAULT_VALUE = YELEMENT_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Pos Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPROPERTY__POS_TYPE = YELEMENT_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Pos Clazz</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPROPERTY__POS_CLAZZ = YELEMENT_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Pos Derived</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPROPERTY__POS_DERIVED = YELEMENT_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Pos Derived Union</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPROPERTY__POS_DERIVED_UNION = YELEMENT_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Pos Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPROPERTY__POS_ASSOCIATION = YELEMENT_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Pos Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPROPERTY__POS_VISIBILITY = YELEMENT_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>Pos Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPROPERTY__POS_OPPOSITE = YELEMENT_FEATURE_COUNT + 34;

	/**
	 * The feature id for the '<em><b>Pos Aggregation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPROPERTY__POS_AGGREGATION = YELEMENT_FEATURE_COUNT + 35;

	/**
	 * The feature id for the '<em><b>Pos Qualified Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPROPERTY__POS_QUALIFIED_NAME = YELEMENT_FEATURE_COUNT + 36;

	/**
	 * The feature id for the '<em><b>Observe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPROPERTY__OBSERVE = YELEMENT_FEATURE_COUNT + 37;

	/**
	 * The feature id for the '<em><b>Invarinat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPROPERTY__INVARINAT = YELEMENT_FEATURE_COUNT + 38;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPROPERTY__STATIC = YELEMENT_FEATURE_COUNT + 39;

	/**
	 * The number of structural features of the '<em>YProperty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPROPERTY_FEATURE_COUNT = YELEMENT_FEATURE_COUNT + 40;

	/**
	 * The meta object id for the '{@link online.yamm.coreModelXmi.yamm.impl.YTypeImpl <em>YType</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.coreModelXmi.yamm.impl.YTypeImpl
	 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYType()
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
	 * The meta object id for the '{@link online.yamm.coreModelXmi.yamm.impl.YStateMachineImpl <em>YState Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.coreModelXmi.yamm.impl.YStateMachineImpl
	 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYStateMachine()
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
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTATE_MACHINE__QUALIFIED_NAME = YELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rtc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTATE_MACHINE__RTC = YELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Max Effects To Be Processed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTATE_MACHINE__MAX_EFFECTS_TO_BE_PROCESSED = YELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Called Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTATE_MACHINE__CALLED_OPERATION = YELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTATE_MACHINE__OWNED_COMMENT = YELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTATE_MACHINE__OWNED_ELEMENT = YELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTATE_MACHINE__TRANSITION = YELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Subvertex</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTATE_MACHINE__SUBVERTEX = YELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Tr Attach</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTATE_MACHINE__TR_ATTACH = YELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTATE_MACHINE__OPERATION = YELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Pos Object ID</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTATE_MACHINE__POS_OBJECT_ID = YELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Pos Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTATE_MACHINE__POS_NAME = YELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Pos Qualified Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTATE_MACHINE__POS_QUALIFIED_NAME = YELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Pos Initial Active</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTATE_MACHINE__POS_INITIAL_ACTIVE = YELEMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Pos Rtc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTATE_MACHINE__POS_RTC = YELEMENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Pos Max Effects To Be Processed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTATE_MACHINE__POS_MAX_EFFECTS_TO_BE_PROCESSED = YELEMENT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Insert Line Transition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTATE_MACHINE__INSERT_LINE_TRANSITION = YELEMENT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Insert Line Vertex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTATE_MACHINE__INSERT_LINE_VERTEX = YELEMENT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Insert Line Attachment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTATE_MACHINE__INSERT_LINE_ATTACHMENT = YELEMENT_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Des Initializer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTATE_MACHINE__DES_INITIALIZER = YELEMENT_FEATURE_COUNT + 21;

	/**
	 * The number of structural features of the '<em>YState Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTATE_MACHINE_FEATURE_COUNT = YELEMENT_FEATURE_COUNT + 22;

	/**
	 * The meta object id for the '{@link online.yamm.coreModelXmi.yamm.impl.YTransitionImpl <em>YTransition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.coreModelXmi.yamm.impl.YTransitionImpl
	 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYTransition()
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
	 * The feature id for the '<em><b>Pos Object ID</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTRANSITION__POS_OBJECT_ID = YELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Pos Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTRANSITION__POS_NAME = YELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Pos Qualified Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTRANSITION__POS_QUALIFIED_NAME = YELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Pos Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTRANSITION__POS_SOURCE = YELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Pos Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTRANSITION__POS_TARGET = YELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Pos Attachment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTRANSITION__POS_ATTACHMENT = YELEMENT_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>YTransition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTRANSITION_FEATURE_COUNT = YELEMENT_FEATURE_COUNT + 13;

	/**
	 * The meta object id for the '{@link online.yamm.coreModelXmi.yamm.impl.YTrAttachmentImpl <em>YTr Attachment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.coreModelXmi.yamm.impl.YTrAttachmentImpl
	 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYTrAttachment()
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
	 * The feature id for the '<em><b>Pos Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTR_ATTACHMENT__POS_TRANSITION = YELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Pos Object ID</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTR_ATTACHMENT__POS_OBJECT_ID = YELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Pos Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTR_ATTACHMENT__POS_NAME = YELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Pos Qualified Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTR_ATTACHMENT__POS_QUALIFIED_NAME = YELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Insert Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTR_ATTACHMENT__INSERT_EFFECT = YELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>YTr Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTR_ATTACHMENT_FEATURE_COUNT = YELEMENT_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link online.yamm.coreModelXmi.yamm.impl.YEffectImpl <em>YEffect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.coreModelXmi.yamm.impl.YEffectImpl
	 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYEffect()
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
	 * The feature id for the '<em><b>Pos Object ID</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEFFECT__POS_OBJECT_ID = YOBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Pos Breakpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEFFECT__POS_BREAKPOINT = YOBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>YEffect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEFFECT_FEATURE_COUNT = YOBJECT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link online.yamm.coreModelXmi.yamm.impl.YVertexImpl <em>YVertex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.coreModelXmi.yamm.impl.YVertexImpl
	 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYVertex()
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
	 * The meta object id for the '{@link online.yamm.coreModelXmi.yamm.impl.YPseudostateImpl <em>YPseudostate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.coreModelXmi.yamm.impl.YPseudostateImpl
	 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYPseudostate()
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
	 * The feature id for the '<em><b>Pos Object ID</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPSEUDOSTATE__POS_OBJECT_ID = YELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Pos Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPSEUDOSTATE__POS_NAME = YELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Pos Qualified Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPSEUDOSTATE__POS_QUALIFIED_NAME = YELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Insert Outgoing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPSEUDOSTATE__INSERT_OUTGOING = YELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Insert Incoming</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPSEUDOSTATE__INSERT_INCOMING = YELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>YPseudostate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPSEUDOSTATE_FEATURE_COUNT = YELEMENT_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link online.yamm.coreModelXmi.yamm.impl.YFinalStateImpl <em>YFinal State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.coreModelXmi.yamm.impl.YFinalStateImpl
	 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYFinalState()
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
	 * The feature id for the '<em><b>Pos Object ID</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YFINAL_STATE__POS_OBJECT_ID = YELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Pos Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YFINAL_STATE__POS_NAME = YELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Pos Qualified Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YFINAL_STATE__POS_QUALIFIED_NAME = YELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Insert Outgoing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YFINAL_STATE__INSERT_OUTGOING = YELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Insert Incoming</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YFINAL_STATE__INSERT_INCOMING = YELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>YFinal State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YFINAL_STATE_FEATURE_COUNT = YELEMENT_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link online.yamm.coreModelXmi.yamm.impl.YStateImpl <em>YState</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.coreModelXmi.yamm.impl.YStateImpl
	 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYState()
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
	 * The feature id for the '<em><b>Pos Object ID</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTATE__POS_OBJECT_ID = YELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Pos Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTATE__POS_NAME = YELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Pos Qualified Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTATE__POS_QUALIFIED_NAME = YELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Insert Outgoing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTATE__INSERT_OUTGOING = YELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Insert Incoming</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTATE__INSERT_INCOMING = YELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>YState</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSTATE_FEATURE_COUNT = YELEMENT_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link online.yamm.coreModelXmi.yamm.impl.YModelImpl <em>YModel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.coreModelXmi.yamm.impl.YModelImpl
	 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYModel()
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
	 * The feature id for the '<em><b>Pos Object ID</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMODEL__POS_OBJECT_ID = YOBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Insert Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMODEL__INSERT_CLASS = YOBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Insert Enum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMODEL__INSERT_ENUM = YOBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Insert Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMODEL__INSERT_PACKAGE = YOBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMODEL__TYPES = YOBJECT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>YModel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMODEL_FEATURE_COUNT = YOBJECT_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link online.yamm.coreModelXmi.yamm.impl.YSharedEdgeImpl <em>YShared Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.coreModelXmi.yamm.impl.YSharedEdgeImpl
	 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYSharedEdge()
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
	 * The meta object id for the '{@link online.yamm.coreModelXmi.yamm.impl.YCompositeEdgeImpl <em>YComposite Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.coreModelXmi.yamm.impl.YCompositeEdgeImpl
	 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYCompositeEdge()
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
	 * The meta object id for the '{@link online.yamm.coreModelXmi.yamm.impl.YStateMachineHandlerImpl <em>YState Machine Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.coreModelXmi.yamm.impl.YStateMachineHandlerImpl
	 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYStateMachineHandler()
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
	 * The meta object id for the '{@link online.yamm.coreModelXmi.yamm.impl.YGlobalStateMachineImpl <em>YGlobal State Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.coreModelXmi.yamm.impl.YGlobalStateMachineImpl
	 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYGlobalStateMachine()
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
	 * The feature id for the '<em><b>Des Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YGLOBAL_STATE_MACHINE__DES_PHASE = YOBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Internal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YGLOBAL_STATE_MACHINE__INTERNAL = YOBJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Not Yet Executed Initial Active Statemachines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YGLOBAL_STATE_MACHINE__NOT_YET_EXECUTED_INITIAL_ACTIVE_STATEMACHINES = YOBJECT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Desinit State Machine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YGLOBAL_STATE_MACHINE__DESINIT_STATE_MACHINE = YOBJECT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Execution Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YGLOBAL_STATE_MACHINE__EXECUTION_PHASE = YOBJECT_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>YGlobal State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YGLOBAL_STATE_MACHINE_FEATURE_COUNT = YOBJECT_FEATURE_COUNT + 15;

	/**
	 * The meta object id for the '{@link online.yamm.coreModelXmi.yamm.impl.YCreateInstanceExpressionImpl <em>YCreate Instance Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.coreModelXmi.yamm.impl.YCreateInstanceExpressionImpl
	 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYCreateInstanceExpression()
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
	 * The meta object id for the '{@link online.yamm.coreModelXmi.yamm.impl.YPrintExpressionImpl <em>YPrint Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.coreModelXmi.yamm.impl.YPrintExpressionImpl
	 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYPrintExpression()
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
	 * The meta object id for the '{@link online.yamm.coreModelXmi.yamm.impl.YSetReturnValueImpl <em>YSet Return Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.coreModelXmi.yamm.impl.YSetReturnValueImpl
	 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYSetReturnValue()
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
	 * The meta object id for the '{@link online.yamm.coreModelXmi.yamm.impl.YGetInstancesOfExpressionImpl <em>YGet Instances Of Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.coreModelXmi.yamm.impl.YGetInstancesOfExpressionImpl
	 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYGetInstancesOfExpression()
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
	 * The meta object id for the '{@link online.yamm.coreModelXmi.yamm.impl.YMemberFeatureCallImpl <em>YMember Feature Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.coreModelXmi.yamm.impl.YMemberFeatureCallImpl
	 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYMemberFeatureCall()
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
	 * The meta object id for the '{@link online.yamm.coreModelXmi.yamm.impl.YFeatureCallImpl <em>YFeature Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.coreModelXmi.yamm.impl.YFeatureCallImpl
	 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYFeatureCall()
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
	 * The meta object id for the '{@link online.yamm.coreModelXmi.yamm.impl.YGetObjectManagementImpl <em>YGet Object Management</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.coreModelXmi.yamm.impl.YGetObjectManagementImpl
	 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYGetObjectManagement()
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
	 * The meta object id for the '{@link online.yamm.coreModelXmi.yamm.impl.YGetLayerInformationImpl <em>YGet Layer Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.coreModelXmi.yamm.impl.YGetLayerInformationImpl
	 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYGetLayerInformation()
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
	 * The meta object id for the '{@link online.yamm.coreModelXmi.yamm.impl.YColorDFAObjectImpl <em>YColor DFA Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.coreModelXmi.yamm.impl.YColorDFAObjectImpl
	 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYColorDFAObject()
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
	 * The meta object id for the '{@link online.yamm.coreModelXmi.yamm.impl.YGetInstancesImpl <em>YGet Instances</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.coreModelXmi.yamm.impl.YGetInstancesImpl
	 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYGetInstances()
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
	 * The meta object id for the '{@link online.yamm.coreModelXmi.yamm.impl.YCountFinalStatesImpl <em>YCount Final States</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.coreModelXmi.yamm.impl.YCountFinalStatesImpl
	 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYCountFinalStates()
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
	 * The meta object id for the '{@link online.yamm.coreModelXmi.yamm.impl.YCountInitialStatesImpl <em>YCount Initial States</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.coreModelXmi.yamm.impl.YCountInitialStatesImpl
	 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYCountInitialStates()
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
	 * The meta object id for the '{@link online.yamm.coreModelXmi.yamm.impl.YCountStatesImpl <em>YCount States</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.coreModelXmi.yamm.impl.YCountStatesImpl
	 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYCountStates()
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
	 * The meta object id for the '{@link online.yamm.coreModelXmi.yamm.impl.YSetAbsoluteNodePropabilityImpl <em>YSet Absolute Node Propability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.coreModelXmi.yamm.impl.YSetAbsoluteNodePropabilityImpl
	 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYSetAbsoluteNodePropability()
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
	 * The meta object id for the '{@link online.yamm.coreModelXmi.yamm.impl.YCountReachableStatesImpl <em>YCount Reachable States</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.coreModelXmi.yamm.impl.YCountReachableStatesImpl
	 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYCountReachableStates()
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
	 * The meta object id for the '{@link online.yamm.coreModelXmi.yamm.impl.YCountInValidTransitionsImpl <em>YCount In Valid Transitions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.coreModelXmi.yamm.impl.YCountInValidTransitionsImpl
	 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYCountInValidTransitions()
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
	 * The meta object id for the '{@link online.yamm.coreModelXmi.yamm.impl.YSetPopulationSizeImpl <em>YSet Population Size</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.coreModelXmi.yamm.impl.YSetPopulationSizeImpl
	 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYSetPopulationSize()
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
	 * The meta object id for the '{@link online.yamm.coreModelXmi.yamm.impl.YLoadModelImpl <em>YLoad Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.coreModelXmi.yamm.impl.YLoadModelImpl
	 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYLoadModel()
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
	 * The meta object id for the '{@link online.yamm.coreModelXmi.yamm.impl.DslInfoImpl <em>Dsl Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.coreModelXmi.yamm.impl.DslInfoImpl
	 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getDslInfo()
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
	 * The meta object id for the '{@link online.yamm.coreModelXmi.yamm.impl.FeatureInfoImpl <em>Feature Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.coreModelXmi.yamm.impl.FeatureInfoImpl
	 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getFeatureInfo()
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
	 * The meta object id for the '{@link online.yamm.coreModelXmi.yamm.impl.SingleLinePropertyInfoImpl <em>Single Line Property Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.coreModelXmi.yamm.impl.SingleLinePropertyInfoImpl
	 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getSingleLinePropertyInfo()
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
	 * The meta object id for the '{@link online.yamm.coreModelXmi.yamm.impl.GuardInfoImpl <em>Guard Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.coreModelXmi.yamm.impl.GuardInfoImpl
	 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getGuardInfo()
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
	 * The meta object id for the '{@link online.yamm.coreModelXmi.yamm.impl.EffectInfoImpl <em>Effect Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.coreModelXmi.yamm.impl.EffectInfoImpl
	 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getEffectInfo()
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
	 * The meta object id for the '{@link online.yamm.coreModelXmi.yamm.impl.ContainmentInfoImpl <em>Containment Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.coreModelXmi.yamm.impl.ContainmentInfoImpl
	 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getContainmentInfo()
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
	 * The meta object id for the '{@link online.yamm.coreModelXmi.yamm.impl.EStructuralFeatureToFeatureInfoMapImpl <em>EStructural Feature To Feature Info Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.coreModelXmi.yamm.impl.EStructuralFeatureToFeatureInfoMapImpl
	 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getEStructuralFeatureToFeatureInfoMap()
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
	 * The meta object id for the '{@link online.yamm.coreModelXmi.yamm.impl.LineImpl <em>Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.coreModelXmi.yamm.impl.LineImpl
	 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getLine()
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
	 * The meta object id for the '{@link online.yamm.coreModelXmi.yamm.impl.YStructureImpl <em>YStructure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.coreModelXmi.yamm.impl.YStructureImpl
	 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYStructure()
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
	 * The meta object id for the '{@link online.yamm.coreModelXmi.yamm.impl.YInternalImpl <em>YInternal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.coreModelXmi.yamm.impl.YInternalImpl
	 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYInternal()
	 * @generated
	 */
	int YINTERNAL = 61;

	/**
	 * The feature id for the '<em><b>Simulation Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YINTERNAL__SIMULATION_TIME = 0;

	/**
	 * The feature id for the '<em><b>Global State Machine</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YINTERNAL__GLOBAL_STATE_MACHINE = 1;

	/**
	 * The number of structural features of the '<em>YInternal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YINTERNAL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link online.yamm.coreModelXmi.yamm.impl.YTimeStepImpl <em>YTime Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.coreModelXmi.yamm.impl.YTimeStepImpl
	 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYTimeStep()
	 * @generated
	 */
	int YTIME_STEP = 62;

	/**
	 * The number of structural features of the '<em>YTime Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTIME_STEP_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link online.yamm.coreModelXmi.yamm.impl.YObserverAddValueImpl <em>YObserver Add Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.coreModelXmi.yamm.impl.YObserverAddValueImpl
	 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYObserverAddValue()
	 * @generated
	 */
	int YOBSERVER_ADD_VALUE = 63;

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
	 * The meta object id for the '{@link online.yamm.coreModelXmi.yamm.YAggregationKind <em>YAggregation Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.coreModelXmi.yamm.YAggregationKind
	 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYAggregationKind()
	 * @generated
	 */
	int YAGGREGATION_KIND = 64;

	/**
	 * The meta object id for the '{@link online.yamm.coreModelXmi.yamm.YParameterDirectionKind <em>YParameter Direction Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.coreModelXmi.yamm.YParameterDirectionKind
	 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYParameterDirectionKind()
	 * @generated
	 */
	int YPARAMETER_DIRECTION_KIND = 65;

	/**
	 * The meta object id for the '{@link online.yamm.coreModelXmi.yamm.YRunToCompletion <em>YRun To Completion</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.coreModelXmi.yamm.YRunToCompletion
	 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYRunToCompletion()
	 * @generated
	 */
	int YRUN_TO_COMPLETION = 66;

	/**
	 * The meta object id for the '{@link online.yamm.coreModelXmi.yamm.ExecutionPhase <em>Execution Phase</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.coreModelXmi.yamm.ExecutionPhase
	 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getExecutionPhase()
	 * @generated
	 */
	int EXECUTION_PHASE = 67;

	/**
	 * The meta object id for the '{@link online.yamm.coreModelXmi.yamm.YVisibilityKind <em>YVisibility Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.coreModelXmi.yamm.YVisibilityKind
	 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYVisibilityKind()
	 * @generated
	 */
	int YVISIBILITY_KIND = 68;

	/**
	 * The meta object id for the '<em>EString2</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getEString2()
	 * @generated
	 */
	int ESTRING2 = 69;


	/**
	 * Returns the meta object for class '{@link online.yamm.coreModelXmi.yamm.YClass <em>YClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YClass</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YClass
	 * @generated
	 */
	EClass getYClass();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YClass#isIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YClass#isIsAbstract()
	 * @see #getYClass()
	 * @generated
	 */
	EAttribute getYClass_IsAbstract();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YClass#getQualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Name</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YClass#getQualifiedName()
	 * @see #getYClass()
	 * @generated
	 */
	EAttribute getYClass_QualifiedName();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YClass#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Package</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YClass#getPackage()
	 * @see #getYClass()
	 * @generated
	 */
	EReference getYClass_Package();

	/**
	 * Returns the meta object for the reference list '{@link online.yamm.coreModelXmi.yamm.YClass#getSuperClass <em>Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Super Class</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YClass#getSuperClass()
	 * @see #getYClass()
	 * @generated
	 */
	EReference getYClass_SuperClass();

	/**
	 * Returns the meta object for the containment reference list '{@link online.yamm.coreModelXmi.yamm.YClass#getOwnedAttribute <em>Owned Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Attribute</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YClass#getOwnedAttribute()
	 * @see #getYClass()
	 * @generated
	 */
	EReference getYClass_OwnedAttribute();

	/**
	 * Returns the meta object for the containment reference list '{@link online.yamm.coreModelXmi.yamm.YClass#getOwnedOperation <em>Owned Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Operation</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YClass#getOwnedOperation()
	 * @see #getYClass()
	 * @generated
	 */
	EReference getYClass_OwnedOperation();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YClass#getInsertLineSuperClass <em>Insert Line Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insert Line Super Class</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YClass#getInsertLineSuperClass()
	 * @see #getYClass()
	 * @generated
	 */
	EAttribute getYClass_InsertLineSuperClass();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YClass#getInsertLineAttribute <em>Insert Line Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insert Line Attribute</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YClass#getInsertLineAttribute()
	 * @see #getYClass()
	 * @generated
	 */
	EAttribute getYClass_InsertLineAttribute();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YClass#getInsertLineOperation <em>Insert Line Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insert Line Operation</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YClass#getInsertLineOperation()
	 * @see #getYClass()
	 * @generated
	 */
	EAttribute getYClass_InsertLineOperation();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YClass#getPosObjectID <em>Pos Object ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Object ID</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YClass#getPosObjectID()
	 * @see #getYClass()
	 * @generated
	 */
	EReference getYClass_PosObjectID();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YClass#getPosIsAbstract <em>Pos Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Is Abstract</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YClass#getPosIsAbstract()
	 * @see #getYClass()
	 * @generated
	 */
	EReference getYClass_PosIsAbstract();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YClass#getPosName <em>Pos Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Name</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YClass#getPosName()
	 * @see #getYClass()
	 * @generated
	 */
	EReference getYClass_PosName();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YClass#getPosQualifiedName <em>Pos Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Qualified Name</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YClass#getPosQualifiedName()
	 * @see #getYClass()
	 * @generated
	 */
	EReference getYClass_PosQualifiedName();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YClass#getPosPackage <em>Pos Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Package</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YClass#getPosPackage()
	 * @see #getYClass()
	 * @generated
	 */
	EReference getYClass_PosPackage();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YClass#isObserveQueue <em>Observe Queue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Observe Queue</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YClass#isObserveQueue()
	 * @see #getYClass()
	 * @generated
	 */
	EAttribute getYClass_ObserveQueue();

	/**
	 * Returns the meta object for class '{@link online.yamm.coreModelXmi.yamm.YClassifier <em>YClassifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YClassifier</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YClassifier
	 * @generated
	 */
	EClass getYClassifier();

	/**
	 * Returns the meta object for class '{@link online.yamm.coreModelXmi.yamm.YComment <em>YComment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YComment</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YComment
	 * @generated
	 */
	EClass getYComment();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YComment#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YComment#getBody()
	 * @see #getYComment()
	 * @generated
	 */
	EAttribute getYComment_Body();

	/**
	 * Returns the meta object for the reference list '{@link online.yamm.coreModelXmi.yamm.YComment#getAnnotatedElement <em>Annotated Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Annotated Element</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YComment#getAnnotatedElement()
	 * @see #getYComment()
	 * @generated
	 */
	EReference getYComment_AnnotatedElement();

	/**
	 * Returns the meta object for the containment reference '{@link online.yamm.coreModelXmi.yamm.YComment#getOwnedComment <em>Owned Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Comment</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YComment#getOwnedComment()
	 * @see #getYComment()
	 * @generated
	 */
	EReference getYComment_OwnedComment();

	/**
	 * Returns the meta object for the containment reference list '{@link online.yamm.coreModelXmi.yamm.YComment#getOwnedElement <em>Owned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Element</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YComment#getOwnedElement()
	 * @see #getYComment()
	 * @generated
	 */
	EReference getYComment_OwnedElement();

	/**
	 * Returns the meta object for class '{@link online.yamm.coreModelXmi.yamm.YConstraint <em>YConstraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YConstraint</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YConstraint
	 * @generated
	 */
	EClass getYConstraint();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YConstraint#getQualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Name</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YConstraint#getQualifiedName()
	 * @see #getYConstraint()
	 * @generated
	 */
	EAttribute getYConstraint_QualifiedName();

	/**
	 * Returns the meta object for the reference list '{@link online.yamm.coreModelXmi.yamm.YConstraint#getConstrainedElement <em>Constrained Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Constrained Element</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YConstraint#getConstrainedElement()
	 * @see #getYConstraint()
	 * @generated
	 */
	EReference getYConstraint_ConstrainedElement();

	/**
	 * Returns the meta object for the containment reference '{@link online.yamm.coreModelXmi.yamm.YConstraint#getOwnedComment <em>Owned Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Comment</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YConstraint#getOwnedComment()
	 * @see #getYConstraint()
	 * @generated
	 */
	EReference getYConstraint_OwnedComment();

	/**
	 * Returns the meta object for the containment reference list '{@link online.yamm.coreModelXmi.yamm.YConstraint#getOwnedElement <em>Owned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Element</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YConstraint#getOwnedElement()
	 * @see #getYConstraint()
	 * @generated
	 */
	EReference getYConstraint_OwnedElement();

	/**
	 * Returns the meta object for the containment reference '{@link online.yamm.coreModelXmi.yamm.YConstraint#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specification</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YConstraint#getSpecification()
	 * @see #getYConstraint()
	 * @generated
	 */
	EReference getYConstraint_Specification();

	/**
	 * Returns the meta object for class '{@link online.yamm.coreModelXmi.yamm.YDataType <em>YData Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YData Type</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YDataType
	 * @generated
	 */
	EClass getYDataType();

	/**
	 * Returns the meta object for class '{@link online.yamm.coreModelXmi.yamm.YElement <em>YElement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YElement</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YElement
	 * @generated
	 */
	EClass getYElement();

	/**
	 * Returns the meta object for class '{@link online.yamm.coreModelXmi.yamm.YElementImport <em>YElement Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YElement Import</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YElementImport
	 * @generated
	 */
	EClass getYElementImport();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YElementImport#getImportedElement <em>Imported Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Imported Element</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YElementImport#getImportedElement()
	 * @see #getYElementImport()
	 * @generated
	 */
	EReference getYElementImport_ImportedElement();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YElementImport#getImportingNamespace <em>Importing Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Importing Namespace</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YElementImport#getImportingNamespace()
	 * @see #getYElementImport()
	 * @generated
	 */
	EReference getYElementImport_ImportingNamespace();

	/**
	 * Returns the meta object for the containment reference '{@link online.yamm.coreModelXmi.yamm.YElementImport#getOwnedComment <em>Owned Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Comment</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YElementImport#getOwnedComment()
	 * @see #getYElementImport()
	 * @generated
	 */
	EReference getYElementImport_OwnedComment();

	/**
	 * Returns the meta object for the containment reference list '{@link online.yamm.coreModelXmi.yamm.YElementImport#getOwnedElement <em>Owned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Element</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YElementImport#getOwnedElement()
	 * @see #getYElementImport()
	 * @generated
	 */
	EReference getYElementImport_OwnedElement();

	/**
	 * Returns the meta object for class '{@link online.yamm.coreModelXmi.yamm.YEnumeration <em>YEnumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YEnumeration</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YEnumeration
	 * @generated
	 */
	EClass getYEnumeration();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YEnumeration#isIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YEnumeration#isIsAbstract()
	 * @see #getYEnumeration()
	 * @generated
	 */
	EAttribute getYEnumeration_IsAbstract();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YEnumeration#getQualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Name</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YEnumeration#getQualifiedName()
	 * @see #getYEnumeration()
	 * @generated
	 */
	EAttribute getYEnumeration_QualifiedName();

	/**
	 * Returns the meta object for the reference list '{@link online.yamm.coreModelXmi.yamm.YEnumeration#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Member</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YEnumeration#getMember()
	 * @see #getYEnumeration()
	 * @generated
	 */
	EReference getYEnumeration_Member();

	/**
	 * Returns the meta object for the reference list '{@link online.yamm.coreModelXmi.yamm.YEnumeration#getElementImport <em>Element Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Element Import</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YEnumeration#getElementImport()
	 * @see #getYEnumeration()
	 * @generated
	 */
	EReference getYEnumeration_ElementImport();

	/**
	 * Returns the meta object for the reference list '{@link online.yamm.coreModelXmi.yamm.YEnumeration#getImportedMember <em>Imported Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Imported Member</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YEnumeration#getImportedMember()
	 * @see #getYEnumeration()
	 * @generated
	 */
	EReference getYEnumeration_ImportedMember();

	/**
	 * Returns the meta object for the reference list '{@link online.yamm.coreModelXmi.yamm.YEnumeration#getPackageImport <em>Package Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Package Import</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YEnumeration#getPackageImport()
	 * @see #getYEnumeration()
	 * @generated
	 */
	EReference getYEnumeration_PackageImport();

	/**
	 * Returns the meta object for the reference list '{@link online.yamm.coreModelXmi.yamm.YEnumeration#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attribute</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YEnumeration#getAttribute()
	 * @see #getYEnumeration()
	 * @generated
	 */
	EReference getYEnumeration_Attribute();

	/**
	 * Returns the meta object for the reference list '{@link online.yamm.coreModelXmi.yamm.YEnumeration#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Feature</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YEnumeration#getFeature()
	 * @see #getYEnumeration()
	 * @generated
	 */
	EReference getYEnumeration_Feature();

	/**
	 * Returns the meta object for the reference list '{@link online.yamm.coreModelXmi.yamm.YEnumeration#getGeneral <em>General</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>General</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YEnumeration#getGeneral()
	 * @see #getYEnumeration()
	 * @generated
	 */
	EReference getYEnumeration_General();

	/**
	 * Returns the meta object for the reference list '{@link online.yamm.coreModelXmi.yamm.YEnumeration#getInheritedMember <em>Inherited Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inherited Member</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YEnumeration#getInheritedMember()
	 * @see #getYEnumeration()
	 * @generated
	 */
	EReference getYEnumeration_InheritedMember();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YEnumeration#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Package</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YEnumeration#getPackage()
	 * @see #getYEnumeration()
	 * @generated
	 */
	EReference getYEnumeration_Package();

	/**
	 * Returns the meta object for the containment reference '{@link online.yamm.coreModelXmi.yamm.YEnumeration#getOwnedComment <em>Owned Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Comment</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YEnumeration#getOwnedComment()
	 * @see #getYEnumeration()
	 * @generated
	 */
	EReference getYEnumeration_OwnedComment();

	/**
	 * Returns the meta object for the containment reference list '{@link online.yamm.coreModelXmi.yamm.YEnumeration#getOwnedElement <em>Owned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Element</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YEnumeration#getOwnedElement()
	 * @see #getYEnumeration()
	 * @generated
	 */
	EReference getYEnumeration_OwnedElement();

	/**
	 * Returns the meta object for the containment reference list '{@link online.yamm.coreModelXmi.yamm.YEnumeration#getOwnedMember <em>Owned Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Member</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YEnumeration#getOwnedMember()
	 * @see #getYEnumeration()
	 * @generated
	 */
	EReference getYEnumeration_OwnedMember();

	/**
	 * Returns the meta object for the containment reference list '{@link online.yamm.coreModelXmi.yamm.YEnumeration#getOwnedRule <em>Owned Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Rule</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YEnumeration#getOwnedRule()
	 * @see #getYEnumeration()
	 * @generated
	 */
	EReference getYEnumeration_OwnedRule();

	/**
	 * Returns the meta object for the containment reference list '{@link online.yamm.coreModelXmi.yamm.YEnumeration#getOwnedLiteral <em>Owned Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Literal</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YEnumeration#getOwnedLiteral()
	 * @see #getYEnumeration()
	 * @generated
	 */
	EReference getYEnumeration_OwnedLiteral();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YEnumeration#getPosObjectID <em>Pos Object ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Object ID</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YEnumeration#getPosObjectID()
	 * @see #getYEnumeration()
	 * @generated
	 */
	EReference getYEnumeration_PosObjectID();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YEnumeration#getPosIsAbstract <em>Pos Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Is Abstract</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YEnumeration#getPosIsAbstract()
	 * @see #getYEnumeration()
	 * @generated
	 */
	EReference getYEnumeration_PosIsAbstract();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YEnumeration#getPosName <em>Pos Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Name</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YEnumeration#getPosName()
	 * @see #getYEnumeration()
	 * @generated
	 */
	EReference getYEnumeration_PosName();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YEnumeration#getPosQualifiedName <em>Pos Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Qualified Name</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YEnumeration#getPosQualifiedName()
	 * @see #getYEnumeration()
	 * @generated
	 */
	EReference getYEnumeration_PosQualifiedName();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YEnumeration#getPosPackage <em>Pos Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Package</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YEnumeration#getPosPackage()
	 * @see #getYEnumeration()
	 * @generated
	 */
	EReference getYEnumeration_PosPackage();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YEnumeration#getInsertLineLiteral <em>Insert Line Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insert Line Literal</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YEnumeration#getInsertLineLiteral()
	 * @see #getYEnumeration()
	 * @generated
	 */
	EAttribute getYEnumeration_InsertLineLiteral();

	/**
	 * Returns the meta object for class '{@link online.yamm.coreModelXmi.yamm.YEnumerationLiteral <em>YEnumeration Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YEnumeration Literal</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YEnumerationLiteral
	 * @generated
	 */
	EClass getYEnumerationLiteral();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YEnumerationLiteral#getQualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Name</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YEnumerationLiteral#getQualifiedName()
	 * @see #getYEnumerationLiteral()
	 * @generated
	 */
	EAttribute getYEnumerationLiteral_QualifiedName();

	/**
	 * Returns the meta object for the containment reference '{@link online.yamm.coreModelXmi.yamm.YEnumerationLiteral#getOwnedComment <em>Owned Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Comment</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YEnumerationLiteral#getOwnedComment()
	 * @see #getYEnumerationLiteral()
	 * @generated
	 */
	EReference getYEnumerationLiteral_OwnedComment();

	/**
	 * Returns the meta object for the containment reference list '{@link online.yamm.coreModelXmi.yamm.YEnumerationLiteral#getOwnedElement <em>Owned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Element</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YEnumerationLiteral#getOwnedElement()
	 * @see #getYEnumerationLiteral()
	 * @generated
	 */
	EReference getYEnumerationLiteral_OwnedElement();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YEnumerationLiteral#getPosObjectID <em>Pos Object ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Object ID</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YEnumerationLiteral#getPosObjectID()
	 * @see #getYEnumerationLiteral()
	 * @generated
	 */
	EReference getYEnumerationLiteral_PosObjectID();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YEnumerationLiteral#getPosName <em>Pos Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Name</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YEnumerationLiteral#getPosName()
	 * @see #getYEnumerationLiteral()
	 * @generated
	 */
	EReference getYEnumerationLiteral_PosName();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YEnumerationLiteral#getPosQualifiedName <em>Pos Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Qualified Name</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YEnumerationLiteral#getPosQualifiedName()
	 * @see #getYEnumerationLiteral()
	 * @generated
	 */
	EReference getYEnumerationLiteral_PosQualifiedName();

	/**
	 * Returns the meta object for class '{@link online.yamm.coreModelXmi.yamm.YFeature <em>YFeature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YFeature</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YFeature
	 * @generated
	 */
	EClass getYFeature();

	/**
	 * Returns the meta object for class '{@link online.yamm.coreModelXmi.yamm.YNamedElement <em>YNamed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YNamed Element</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YNamedElement
	 * @generated
	 */
	EClass getYNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YNamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YNamedElement#getName()
	 * @see #getYNamedElement()
	 * @generated
	 */
	EAttribute getYNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link online.yamm.coreModelXmi.yamm.YNamespace <em>YNamespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YNamespace</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YNamespace
	 * @generated
	 */
	EClass getYNamespace();

	/**
	 * Returns the meta object for class '{@link online.yamm.coreModelXmi.yamm.YOperation <em>YOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YOperation</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YOperation
	 * @generated
	 */
	EClass getYOperation();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YOperation#getQualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Name</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YOperation#getQualifiedName()
	 * @see #getYOperation()
	 * @generated
	 */
	EAttribute getYOperation_QualifiedName();

	/**
	 * Returns the meta object for the containment reference list '{@link online.yamm.coreModelXmi.yamm.YOperation#getOwnedParameter <em>Owned Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Parameter</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YOperation#getOwnedParameter()
	 * @see #getYOperation()
	 * @generated
	 */
	EReference getYOperation_OwnedParameter();

	/**
	 * Returns the meta object for the containment reference '{@link online.yamm.coreModelXmi.yamm.YOperation#getStateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>State Machine</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YOperation#getStateMachine()
	 * @see #getYOperation()
	 * @generated
	 */
	EReference getYOperation_StateMachine();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YOperation#getClazz <em>Clazz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Clazz</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YOperation#getClazz()
	 * @see #getYOperation()
	 * @generated
	 */
	EReference getYOperation_Clazz();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YOperation#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Type</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YOperation#getReturnType()
	 * @see #getYOperation()
	 * @generated
	 */
	EReference getYOperation_ReturnType();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YOperation#getLower <em>Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YOperation#getLower()
	 * @see #getYOperation()
	 * @generated
	 */
	EAttribute getYOperation_Lower();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YOperation#getUpper <em>Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YOperation#getUpper()
	 * @see #getYOperation()
	 * @generated
	 */
	EAttribute getYOperation_Upper();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YOperation#getPosObjectID <em>Pos Object ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Object ID</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YOperation#getPosObjectID()
	 * @see #getYOperation()
	 * @generated
	 */
	EReference getYOperation_PosObjectID();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YOperation#getPosName <em>Pos Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Name</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YOperation#getPosName()
	 * @see #getYOperation()
	 * @generated
	 */
	EReference getYOperation_PosName();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YOperation#getPosClazz <em>Pos Clazz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Clazz</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YOperation#getPosClazz()
	 * @see #getYOperation()
	 * @generated
	 */
	EReference getYOperation_PosClazz();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YOperation#getPosLower <em>Pos Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Lower</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YOperation#getPosLower()
	 * @see #getYOperation()
	 * @generated
	 */
	EReference getYOperation_PosLower();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YOperation#getPosUpper <em>Pos Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Upper</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YOperation#getPosUpper()
	 * @see #getYOperation()
	 * @generated
	 */
	EReference getYOperation_PosUpper();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YOperation#getPosStateMachine <em>Pos State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos State Machine</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YOperation#getPosStateMachine()
	 * @see #getYOperation()
	 * @generated
	 */
	EReference getYOperation_PosStateMachine();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YOperation#getPosReturnType <em>Pos Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Return Type</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YOperation#getPosReturnType()
	 * @see #getYOperation()
	 * @generated
	 */
	EReference getYOperation_PosReturnType();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YOperation#getInsertLineParameter <em>Insert Line Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insert Line Parameter</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YOperation#getInsertLineParameter()
	 * @see #getYOperation()
	 * @generated
	 */
	EAttribute getYOperation_InsertLineParameter();

	/**
	 * Returns the meta object for class '{@link online.yamm.coreModelXmi.yamm.YPackage <em>YPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YPackage</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YPackage
	 * @generated
	 */
	EClass getYPackage();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YPackage#getQualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Name</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YPackage#getQualifiedName()
	 * @see #getYPackage()
	 * @generated
	 */
	EAttribute getYPackage_QualifiedName();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YPackage#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Package</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YPackage#getPackage()
	 * @see #getYPackage()
	 * @generated
	 */
	EReference getYPackage_Package();

	/**
	 * Returns the meta object for the containment reference list '{@link online.yamm.coreModelXmi.yamm.YPackage#getOwnedMemberPackage <em>Owned Member Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Member Package</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YPackage#getOwnedMemberPackage()
	 * @see #getYPackage()
	 * @generated
	 */
	EReference getYPackage_OwnedMemberPackage();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YPackage#getPosObjectID <em>Pos Object ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Object ID</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YPackage#getPosObjectID()
	 * @see #getYPackage()
	 * @generated
	 */
	EReference getYPackage_PosObjectID();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YPackage#getPosName <em>Pos Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Name</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YPackage#getPosName()
	 * @see #getYPackage()
	 * @generated
	 */
	EReference getYPackage_PosName();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YPackage#getPosQualifiedName <em>Pos Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Qualified Name</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YPackage#getPosQualifiedName()
	 * @see #getYPackage()
	 * @generated
	 */
	EReference getYPackage_PosQualifiedName();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YPackage#getPosPackage <em>Pos Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Package</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YPackage#getPosPackage()
	 * @see #getYPackage()
	 * @generated
	 */
	EReference getYPackage_PosPackage();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YPackage#getInsertLineMember <em>Insert Line Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insert Line Member</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YPackage#getInsertLineMember()
	 * @see #getYPackage()
	 * @generated
	 */
	EAttribute getYPackage_InsertLineMember();

	/**
	 * Returns the meta object for class '{@link online.yamm.coreModelXmi.yamm.YPackageableElement <em>YPackageable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YPackageable Element</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YPackageableElement
	 * @generated
	 */
	EClass getYPackageableElement();

	/**
	 * Returns the meta object for the container reference '{@link online.yamm.coreModelXmi.yamm.YPackageableElement#getParentElement <em>Parent Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Element</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YPackageableElement#getParentElement()
	 * @see #getYPackageableElement()
	 * @generated
	 */
	EReference getYPackageableElement_ParentElement();

	/**
	 * Returns the meta object for class '{@link online.yamm.coreModelXmi.yamm.YPackageImport <em>YPackage Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YPackage Import</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YPackageImport
	 * @generated
	 */
	EClass getYPackageImport();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YPackageImport#getImportedPackage <em>Imported Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Imported Package</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YPackageImport#getImportedPackage()
	 * @see #getYPackageImport()
	 * @generated
	 */
	EReference getYPackageImport_ImportedPackage();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YPackageImport#getImportingNamespace <em>Importing Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Importing Namespace</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YPackageImport#getImportingNamespace()
	 * @see #getYPackageImport()
	 * @generated
	 */
	EReference getYPackageImport_ImportingNamespace();

	/**
	 * Returns the meta object for the containment reference '{@link online.yamm.coreModelXmi.yamm.YPackageImport#getOwnedComment <em>Owned Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Comment</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YPackageImport#getOwnedComment()
	 * @see #getYPackageImport()
	 * @generated
	 */
	EReference getYPackageImport_OwnedComment();

	/**
	 * Returns the meta object for the containment reference list '{@link online.yamm.coreModelXmi.yamm.YPackageImport#getOwnedElement <em>Owned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Element</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YPackageImport#getOwnedElement()
	 * @see #getYPackageImport()
	 * @generated
	 */
	EReference getYPackageImport_OwnedElement();

	/**
	 * Returns the meta object for class '{@link online.yamm.coreModelXmi.yamm.YParameter <em>YParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YParameter</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YParameter
	 * @generated
	 */
	EClass getYParameter();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YParameter#isIsOrdered <em>Is Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Ordered</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YParameter#isIsOrdered()
	 * @see #getYParameter()
	 * @generated
	 */
	EAttribute getYParameter_IsOrdered();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YParameter#isIsUnique <em>Is Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Unique</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YParameter#isIsUnique()
	 * @see #getYParameter()
	 * @generated
	 */
	EAttribute getYParameter_IsUnique();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YParameter#getLower <em>Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YParameter#getLower()
	 * @see #getYParameter()
	 * @generated
	 */
	EAttribute getYParameter_Lower();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YParameter#getUpper <em>Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YParameter#getUpper()
	 * @see #getYParameter()
	 * @generated
	 */
	EAttribute getYParameter_Upper();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YParameter#getQualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Name</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YParameter#getQualifiedName()
	 * @see #getYParameter()
	 * @generated
	 */
	EAttribute getYParameter_QualifiedName();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YParameter#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YParameter#getDirection()
	 * @see #getYParameter()
	 * @generated
	 */
	EAttribute getYParameter_Direction();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YParameter#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YParameter#getDefaultValue()
	 * @see #getYParameter()
	 * @generated
	 */
	EAttribute getYParameter_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YParameter#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YParameter#getDescription()
	 * @see #getYParameter()
	 * @generated
	 */
	EAttribute getYParameter_Description();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YParameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YParameter#getType()
	 * @see #getYParameter()
	 * @generated
	 */
	EReference getYParameter_Type();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YParameter#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signature</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YParameter#getSignature()
	 * @see #getYParameter()
	 * @generated
	 */
	EAttribute getYParameter_Signature();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YParameter#isUpperboundWildcard <em>Upperbound Wildcard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upperbound Wildcard</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YParameter#isUpperboundWildcard()
	 * @see #getYParameter()
	 * @generated
	 */
	EAttribute getYParameter_UpperboundWildcard();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YParameter#getPosObjectID <em>Pos Object ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Object ID</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YParameter#getPosObjectID()
	 * @see #getYParameter()
	 * @generated
	 */
	EReference getYParameter_PosObjectID();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YParameter#getPosName <em>Pos Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Name</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YParameter#getPosName()
	 * @see #getYParameter()
	 * @generated
	 */
	EReference getYParameter_PosName();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YParameter#getPosOrdered <em>Pos Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Ordered</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YParameter#getPosOrdered()
	 * @see #getYParameter()
	 * @generated
	 */
	EReference getYParameter_PosOrdered();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YParameter#getPosUnique <em>Pos Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Unique</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YParameter#getPosUnique()
	 * @see #getYParameter()
	 * @generated
	 */
	EReference getYParameter_PosUnique();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YParameter#getPosLower <em>Pos Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Lower</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YParameter#getPosLower()
	 * @see #getYParameter()
	 * @generated
	 */
	EReference getYParameter_PosLower();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YParameter#getPosUpper <em>Pos Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Upper</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YParameter#getPosUpper()
	 * @see #getYParameter()
	 * @generated
	 */
	EReference getYParameter_PosUpper();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YParameter#getPosUpperboundWildcard <em>Pos Upperbound Wildcard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Upperbound Wildcard</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YParameter#getPosUpperboundWildcard()
	 * @see #getYParameter()
	 * @generated
	 */
	EReference getYParameter_PosUpperboundWildcard();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YParameter#getPosDirection <em>Pos Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Direction</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YParameter#getPosDirection()
	 * @see #getYParameter()
	 * @generated
	 */
	EReference getYParameter_PosDirection();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YParameter#getPosDefaultValue <em>Pos Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Default Value</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YParameter#getPosDefaultValue()
	 * @see #getYParameter()
	 * @generated
	 */
	EReference getYParameter_PosDefaultValue();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YParameter#getPosType <em>Pos Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Type</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YParameter#getPosType()
	 * @see #getYParameter()
	 * @generated
	 */
	EReference getYParameter_PosType();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YParameter#getPosQualifiedName <em>Pos Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Qualified Name</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YParameter#getPosQualifiedName()
	 * @see #getYParameter()
	 * @generated
	 */
	EReference getYParameter_PosQualifiedName();

	/**
	 * Returns the meta object for class '{@link online.yamm.coreModelXmi.yamm.YPrimitiveType <em>YPrimitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YPrimitive Type</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YPrimitiveType
	 * @generated
	 */
	EClass getYPrimitiveType();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YPrimitiveType#isIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YPrimitiveType#isIsAbstract()
	 * @see #getYPrimitiveType()
	 * @generated
	 */
	EAttribute getYPrimitiveType_IsAbstract();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YPrimitiveType#getQualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Name</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YPrimitiveType#getQualifiedName()
	 * @see #getYPrimitiveType()
	 * @generated
	 */
	EAttribute getYPrimitiveType_QualifiedName();

	/**
	 * Returns the meta object for the reference list '{@link online.yamm.coreModelXmi.yamm.YPrimitiveType#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Member</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YPrimitiveType#getMember()
	 * @see #getYPrimitiveType()
	 * @generated
	 */
	EReference getYPrimitiveType_Member();

	/**
	 * Returns the meta object for the reference list '{@link online.yamm.coreModelXmi.yamm.YPrimitiveType#getElementImport <em>Element Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Element Import</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YPrimitiveType#getElementImport()
	 * @see #getYPrimitiveType()
	 * @generated
	 */
	EReference getYPrimitiveType_ElementImport();

	/**
	 * Returns the meta object for the reference list '{@link online.yamm.coreModelXmi.yamm.YPrimitiveType#getImportedMember <em>Imported Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Imported Member</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YPrimitiveType#getImportedMember()
	 * @see #getYPrimitiveType()
	 * @generated
	 */
	EReference getYPrimitiveType_ImportedMember();

	/**
	 * Returns the meta object for the reference list '{@link online.yamm.coreModelXmi.yamm.YPrimitiveType#getPackageImport <em>Package Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Package Import</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YPrimitiveType#getPackageImport()
	 * @see #getYPrimitiveType()
	 * @generated
	 */
	EReference getYPrimitiveType_PackageImport();

	/**
	 * Returns the meta object for the reference list '{@link online.yamm.coreModelXmi.yamm.YPrimitiveType#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attribute</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YPrimitiveType#getAttribute()
	 * @see #getYPrimitiveType()
	 * @generated
	 */
	EReference getYPrimitiveType_Attribute();

	/**
	 * Returns the meta object for the reference list '{@link online.yamm.coreModelXmi.yamm.YPrimitiveType#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Feature</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YPrimitiveType#getFeature()
	 * @see #getYPrimitiveType()
	 * @generated
	 */
	EReference getYPrimitiveType_Feature();

	/**
	 * Returns the meta object for the reference list '{@link online.yamm.coreModelXmi.yamm.YPrimitiveType#getGeneral <em>General</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>General</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YPrimitiveType#getGeneral()
	 * @see #getYPrimitiveType()
	 * @generated
	 */
	EReference getYPrimitiveType_General();

	/**
	 * Returns the meta object for the reference list '{@link online.yamm.coreModelXmi.yamm.YPrimitiveType#getInheritedMember <em>Inherited Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inherited Member</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YPrimitiveType#getInheritedMember()
	 * @see #getYPrimitiveType()
	 * @generated
	 */
	EReference getYPrimitiveType_InheritedMember();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YPrimitiveType#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Package</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YPrimitiveType#getPackage()
	 * @see #getYPrimitiveType()
	 * @generated
	 */
	EReference getYPrimitiveType_Package();

	/**
	 * Returns the meta object for the containment reference '{@link online.yamm.coreModelXmi.yamm.YPrimitiveType#getOwnedComment <em>Owned Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Comment</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YPrimitiveType#getOwnedComment()
	 * @see #getYPrimitiveType()
	 * @generated
	 */
	EReference getYPrimitiveType_OwnedComment();

	/**
	 * Returns the meta object for the containment reference list '{@link online.yamm.coreModelXmi.yamm.YPrimitiveType#getOwnedElement <em>Owned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Element</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YPrimitiveType#getOwnedElement()
	 * @see #getYPrimitiveType()
	 * @generated
	 */
	EReference getYPrimitiveType_OwnedElement();

	/**
	 * Returns the meta object for the containment reference list '{@link online.yamm.coreModelXmi.yamm.YPrimitiveType#getOwnedMember <em>Owned Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Member</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YPrimitiveType#getOwnedMember()
	 * @see #getYPrimitiveType()
	 * @generated
	 */
	EReference getYPrimitiveType_OwnedMember();

	/**
	 * Returns the meta object for the containment reference list '{@link online.yamm.coreModelXmi.yamm.YPrimitiveType#getOwnedRule <em>Owned Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Rule</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YPrimitiveType#getOwnedRule()
	 * @see #getYPrimitiveType()
	 * @generated
	 */
	EReference getYPrimitiveType_OwnedRule();

	/**
	 * Returns the meta object for class '{@link online.yamm.coreModelXmi.yamm.YProperty <em>YProperty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YProperty</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YProperty
	 * @generated
	 */
	EClass getYProperty();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YProperty#isIsOrdered <em>Is Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Ordered</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YProperty#isIsOrdered()
	 * @see #getYProperty()
	 * @generated
	 */
	EAttribute getYProperty_IsOrdered();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YProperty#isIsDerived <em>Is Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Derived</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YProperty#isIsDerived()
	 * @see #getYProperty()
	 * @generated
	 */
	EAttribute getYProperty_IsDerived();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YProperty#isIsDerivedUnion <em>Is Derived Union</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Derived Union</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YProperty#isIsDerivedUnion()
	 * @see #getYProperty()
	 * @generated
	 */
	EAttribute getYProperty_IsDerivedUnion();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YProperty#isAssociation <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Association</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YProperty#isAssociation()
	 * @see #getYProperty()
	 * @generated
	 */
	EAttribute getYProperty_Association();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YProperty#getQualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Name</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YProperty#getQualifiedName()
	 * @see #getYProperty()
	 * @generated
	 */
	EAttribute getYProperty_QualifiedName();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YProperty#isIsUnique <em>Is Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Unique</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YProperty#isIsUnique()
	 * @see #getYProperty()
	 * @generated
	 */
	EAttribute getYProperty_IsUnique();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YProperty#getLower <em>Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YProperty#getLower()
	 * @see #getYProperty()
	 * @generated
	 */
	EAttribute getYProperty_Lower();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YProperty#getUpper <em>Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YProperty#getUpper()
	 * @see #getYProperty()
	 * @generated
	 */
	EAttribute getYProperty_Upper();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YProperty#getAggregation <em>Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aggregation</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YProperty#getAggregation()
	 * @see #getYProperty()
	 * @generated
	 */
	EAttribute getYProperty_Aggregation();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YProperty#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YProperty#getDefaultValue()
	 * @see #getYProperty()
	 * @generated
	 */
	EAttribute getYProperty_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YProperty#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YProperty#getDescription()
	 * @see #getYProperty()
	 * @generated
	 */
	EAttribute getYProperty_Description();

	/**
	 * Returns the meta object for the reference list '{@link online.yamm.coreModelXmi.yamm.YProperty#getFeaturingClassifier <em>Featuring Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Featuring Classifier</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YProperty#getFeaturingClassifier()
	 * @see #getYProperty()
	 * @generated
	 */
	EReference getYProperty_FeaturingClassifier();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YProperty#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YProperty#getType()
	 * @see #getYProperty()
	 * @generated
	 */
	EReference getYProperty_Type();

	/**
	 * Returns the meta object for the reference list '{@link online.yamm.coreModelXmi.yamm.YProperty#getSubsettedProperty <em>Subsetted Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subsetted Property</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YProperty#getSubsettedProperty()
	 * @see #getYProperty()
	 * @generated
	 */
	EReference getYProperty_SubsettedProperty();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YProperty#getOpposite <em>Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Opposite</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YProperty#getOpposite()
	 * @see #getYProperty()
	 * @generated
	 */
	EReference getYProperty_Opposite();

	/**
	 * Returns the meta object for the containment reference '{@link online.yamm.coreModelXmi.yamm.YProperty#getOwnedComment <em>Owned Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Comment</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YProperty#getOwnedComment()
	 * @see #getYProperty()
	 * @generated
	 */
	EReference getYProperty_OwnedComment();

	/**
	 * Returns the meta object for the containment reference list '{@link online.yamm.coreModelXmi.yamm.YProperty#getOwnedElement <em>Owned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Element</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YProperty#getOwnedElement()
	 * @see #getYProperty()
	 * @generated
	 */
	EReference getYProperty_OwnedElement();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YProperty#getClazz <em>Clazz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Clazz</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YProperty#getClazz()
	 * @see #getYProperty()
	 * @generated
	 */
	EReference getYProperty_Clazz();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YProperty#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signature</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YProperty#getSignature()
	 * @see #getYProperty()
	 * @generated
	 */
	EAttribute getYProperty_Signature();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YProperty#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YProperty#getVisibility()
	 * @see #getYProperty()
	 * @generated
	 */
	EAttribute getYProperty_Visibility();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YProperty#getPosObjectID <em>Pos Object ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Object ID</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YProperty#getPosObjectID()
	 * @see #getYProperty()
	 * @generated
	 */
	EReference getYProperty_PosObjectID();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YProperty#getPosName <em>Pos Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Name</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YProperty#getPosName()
	 * @see #getYProperty()
	 * @generated
	 */
	EReference getYProperty_PosName();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YProperty#getPosOrdered <em>Pos Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Ordered</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YProperty#getPosOrdered()
	 * @see #getYProperty()
	 * @generated
	 */
	EReference getYProperty_PosOrdered();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YProperty#getPosUnique <em>Pos Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Unique</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YProperty#getPosUnique()
	 * @see #getYProperty()
	 * @generated
	 */
	EReference getYProperty_PosUnique();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YProperty#getPosLower <em>Pos Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Lower</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YProperty#getPosLower()
	 * @see #getYProperty()
	 * @generated
	 */
	EReference getYProperty_PosLower();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YProperty#getPosUpper <em>Pos Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Upper</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YProperty#getPosUpper()
	 * @see #getYProperty()
	 * @generated
	 */
	EReference getYProperty_PosUpper();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YProperty#getPosDefaultValue <em>Pos Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Default Value</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YProperty#getPosDefaultValue()
	 * @see #getYProperty()
	 * @generated
	 */
	EReference getYProperty_PosDefaultValue();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YProperty#getPosType <em>Pos Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Type</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YProperty#getPosType()
	 * @see #getYProperty()
	 * @generated
	 */
	EReference getYProperty_PosType();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YProperty#getPosClazz <em>Pos Clazz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Clazz</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YProperty#getPosClazz()
	 * @see #getYProperty()
	 * @generated
	 */
	EReference getYProperty_PosClazz();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YProperty#getPosDerived <em>Pos Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Derived</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YProperty#getPosDerived()
	 * @see #getYProperty()
	 * @generated
	 */
	EReference getYProperty_PosDerived();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YProperty#getPosDerivedUnion <em>Pos Derived Union</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Derived Union</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YProperty#getPosDerivedUnion()
	 * @see #getYProperty()
	 * @generated
	 */
	EReference getYProperty_PosDerivedUnion();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YProperty#getPosAssociation <em>Pos Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Association</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YProperty#getPosAssociation()
	 * @see #getYProperty()
	 * @generated
	 */
	EReference getYProperty_PosAssociation();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YProperty#getPosVisibility <em>Pos Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Visibility</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YProperty#getPosVisibility()
	 * @see #getYProperty()
	 * @generated
	 */
	EReference getYProperty_PosVisibility();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YProperty#getPosOpposite <em>Pos Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Opposite</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YProperty#getPosOpposite()
	 * @see #getYProperty()
	 * @generated
	 */
	EReference getYProperty_PosOpposite();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YProperty#getPosAggregation <em>Pos Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Aggregation</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YProperty#getPosAggregation()
	 * @see #getYProperty()
	 * @generated
	 */
	EReference getYProperty_PosAggregation();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YProperty#getPosQualifiedName <em>Pos Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Qualified Name</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YProperty#getPosQualifiedName()
	 * @see #getYProperty()
	 * @generated
	 */
	EReference getYProperty_PosQualifiedName();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YProperty#isObserve <em>Observe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Observe</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YProperty#isObserve()
	 * @see #getYProperty()
	 * @generated
	 */
	EAttribute getYProperty_Observe();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YProperty#getInvarinat <em>Invarinat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invarinat</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YProperty#getInvarinat()
	 * @see #getYProperty()
	 * @generated
	 */
	EAttribute getYProperty_Invarinat();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YProperty#isStatic <em>Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Static</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YProperty#isStatic()
	 * @see #getYProperty()
	 * @generated
	 */
	EAttribute getYProperty_Static();

	/**
	 * Returns the meta object for class '{@link online.yamm.coreModelXmi.yamm.YType <em>YType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YType</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YType
	 * @generated
	 */
	EClass getYType();

	/**
	 * Returns the meta object for class '{@link online.yamm.coreModelXmi.yamm.YStateMachine <em>YState Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YState Machine</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YStateMachine
	 * @generated
	 */
	EClass getYStateMachine();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YStateMachine#isInitialActive <em>Initial Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Active</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YStateMachine#isInitialActive()
	 * @see #getYStateMachine()
	 * @generated
	 */
	EAttribute getYStateMachine_InitialActive();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YStateMachine#getQualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Name</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YStateMachine#getQualifiedName()
	 * @see #getYStateMachine()
	 * @generated
	 */
	EAttribute getYStateMachine_QualifiedName();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YStateMachine#getRtc <em>Rtc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rtc</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YStateMachine#getRtc()
	 * @see #getYStateMachine()
	 * @generated
	 */
	EAttribute getYStateMachine_Rtc();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YStateMachine#getMaxEffectsToBeProcessed <em>Max Effects To Be Processed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Effects To Be Processed</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YStateMachine#getMaxEffectsToBeProcessed()
	 * @see #getYStateMachine()
	 * @generated
	 */
	EAttribute getYStateMachine_MaxEffectsToBeProcessed();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YStateMachine#getCalledOperation <em>Called Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Called Operation</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YStateMachine#getCalledOperation()
	 * @see #getYStateMachine()
	 * @generated
	 */
	EReference getYStateMachine_CalledOperation();

	/**
	 * Returns the meta object for the containment reference '{@link online.yamm.coreModelXmi.yamm.YStateMachine#getOwnedComment <em>Owned Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Comment</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YStateMachine#getOwnedComment()
	 * @see #getYStateMachine()
	 * @generated
	 */
	EReference getYStateMachine_OwnedComment();

	/**
	 * Returns the meta object for the containment reference list '{@link online.yamm.coreModelXmi.yamm.YStateMachine#getOwnedElement <em>Owned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Element</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YStateMachine#getOwnedElement()
	 * @see #getYStateMachine()
	 * @generated
	 */
	EReference getYStateMachine_OwnedElement();

	/**
	 * Returns the meta object for the containment reference list '{@link online.yamm.coreModelXmi.yamm.YStateMachine#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transition</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YStateMachine#getTransition()
	 * @see #getYStateMachine()
	 * @generated
	 */
	EReference getYStateMachine_Transition();

	/**
	 * Returns the meta object for the containment reference list '{@link online.yamm.coreModelXmi.yamm.YStateMachine#getSubvertex <em>Subvertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subvertex</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YStateMachine#getSubvertex()
	 * @see #getYStateMachine()
	 * @generated
	 */
	EReference getYStateMachine_Subvertex();

	/**
	 * Returns the meta object for the containment reference list '{@link online.yamm.coreModelXmi.yamm.YStateMachine#getTrAttach <em>Tr Attach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tr Attach</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YStateMachine#getTrAttach()
	 * @see #getYStateMachine()
	 * @generated
	 */
	EReference getYStateMachine_TrAttach();

	/**
	 * Returns the meta object for the container reference '{@link online.yamm.coreModelXmi.yamm.YStateMachine#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Operation</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YStateMachine#getOperation()
	 * @see #getYStateMachine()
	 * @generated
	 */
	EReference getYStateMachine_Operation();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YStateMachine#getPosObjectID <em>Pos Object ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Object ID</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YStateMachine#getPosObjectID()
	 * @see #getYStateMachine()
	 * @generated
	 */
	EReference getYStateMachine_PosObjectID();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YStateMachine#getPosName <em>Pos Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Name</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YStateMachine#getPosName()
	 * @see #getYStateMachine()
	 * @generated
	 */
	EReference getYStateMachine_PosName();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YStateMachine#getPosQualifiedName <em>Pos Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Qualified Name</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YStateMachine#getPosQualifiedName()
	 * @see #getYStateMachine()
	 * @generated
	 */
	EReference getYStateMachine_PosQualifiedName();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YStateMachine#getPosInitialActive <em>Pos Initial Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Initial Active</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YStateMachine#getPosInitialActive()
	 * @see #getYStateMachine()
	 * @generated
	 */
	EReference getYStateMachine_PosInitialActive();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YStateMachine#getPosRtc <em>Pos Rtc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Rtc</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YStateMachine#getPosRtc()
	 * @see #getYStateMachine()
	 * @generated
	 */
	EReference getYStateMachine_PosRtc();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YStateMachine#getPosMaxEffectsToBeProcessed <em>Pos Max Effects To Be Processed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Max Effects To Be Processed</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YStateMachine#getPosMaxEffectsToBeProcessed()
	 * @see #getYStateMachine()
	 * @generated
	 */
	EReference getYStateMachine_PosMaxEffectsToBeProcessed();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YStateMachine#getInsertLineTransition <em>Insert Line Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insert Line Transition</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YStateMachine#getInsertLineTransition()
	 * @see #getYStateMachine()
	 * @generated
	 */
	EAttribute getYStateMachine_InsertLineTransition();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YStateMachine#getInsertLineVertex <em>Insert Line Vertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insert Line Vertex</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YStateMachine#getInsertLineVertex()
	 * @see #getYStateMachine()
	 * @generated
	 */
	EAttribute getYStateMachine_InsertLineVertex();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YStateMachine#getInsertLineAttachment <em>Insert Line Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insert Line Attachment</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YStateMachine#getInsertLineAttachment()
	 * @see #getYStateMachine()
	 * @generated
	 */
	EAttribute getYStateMachine_InsertLineAttachment();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YStateMachine#isDesInitializer <em>Des Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Des Initializer</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YStateMachine#isDesInitializer()
	 * @see #getYStateMachine()
	 * @generated
	 */
	EAttribute getYStateMachine_DesInitializer();

	/**
	 * Returns the meta object for class '{@link online.yamm.coreModelXmi.yamm.YTransition <em>YTransition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YTransition</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YTransition
	 * @generated
	 */
	EClass getYTransition();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YTransition#getQualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Name</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YTransition#getQualifiedName()
	 * @see #getYTransition()
	 * @generated
	 */
	EAttribute getYTransition_QualifiedName();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YTransition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YTransition#getSource()
	 * @see #getYTransition()
	 * @generated
	 */
	EReference getYTransition_Source();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YTransition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YTransition#getTarget()
	 * @see #getYTransition()
	 * @generated
	 */
	EReference getYTransition_Target();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YTransition#getAttachment <em>Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attachment</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YTransition#getAttachment()
	 * @see #getYTransition()
	 * @generated
	 */
	EReference getYTransition_Attachment();

	/**
	 * Returns the meta object for the containment reference '{@link online.yamm.coreModelXmi.yamm.YTransition#getOwnedComment <em>Owned Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Comment</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YTransition#getOwnedComment()
	 * @see #getYTransition()
	 * @generated
	 */
	EReference getYTransition_OwnedComment();

	/**
	 * Returns the meta object for the containment reference list '{@link online.yamm.coreModelXmi.yamm.YTransition#getOwnedElement <em>Owned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Element</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YTransition#getOwnedElement()
	 * @see #getYTransition()
	 * @generated
	 */
	EReference getYTransition_OwnedElement();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YTransition#getPosObjectID <em>Pos Object ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Object ID</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YTransition#getPosObjectID()
	 * @see #getYTransition()
	 * @generated
	 */
	EReference getYTransition_PosObjectID();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YTransition#getPosName <em>Pos Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Name</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YTransition#getPosName()
	 * @see #getYTransition()
	 * @generated
	 */
	EReference getYTransition_PosName();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YTransition#getPosQualifiedName <em>Pos Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Qualified Name</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YTransition#getPosQualifiedName()
	 * @see #getYTransition()
	 * @generated
	 */
	EReference getYTransition_PosQualifiedName();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YTransition#getPosSource <em>Pos Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Source</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YTransition#getPosSource()
	 * @see #getYTransition()
	 * @generated
	 */
	EReference getYTransition_PosSource();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YTransition#getPosTarget <em>Pos Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Target</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YTransition#getPosTarget()
	 * @see #getYTransition()
	 * @generated
	 */
	EReference getYTransition_PosTarget();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YTransition#getPosAttachment <em>Pos Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Attachment</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YTransition#getPosAttachment()
	 * @see #getYTransition()
	 * @generated
	 */
	EReference getYTransition_PosAttachment();

	/**
	 * Returns the meta object for class '{@link online.yamm.coreModelXmi.yamm.YTrAttachment <em>YTr Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YTr Attachment</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YTrAttachment
	 * @generated
	 */
	EClass getYTrAttachment();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YTrAttachment#getQualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Name</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YTrAttachment#getQualifiedName()
	 * @see #getYTrAttachment()
	 * @generated
	 */
	EAttribute getYTrAttachment_QualifiedName();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YTrAttachment#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transition</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YTrAttachment#getTransition()
	 * @see #getYTrAttachment()
	 * @generated
	 */
	EReference getYTrAttachment_Transition();

	/**
	 * Returns the meta object for the containment reference list '{@link online.yamm.coreModelXmi.yamm.YTrAttachment#getEffects <em>Effects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Effects</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YTrAttachment#getEffects()
	 * @see #getYTrAttachment()
	 * @generated
	 */
	EReference getYTrAttachment_Effects();

	/**
	 * Returns the meta object for the containment reference '{@link online.yamm.coreModelXmi.yamm.YTrAttachment#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Guard</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YTrAttachment#getGuard()
	 * @see #getYTrAttachment()
	 * @generated
	 */
	EReference getYTrAttachment_Guard();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YTrAttachment#getGuardStringRep <em>Guard String Rep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard String Rep</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YTrAttachment#getGuardStringRep()
	 * @see #getYTrAttachment()
	 * @generated
	 */
	EAttribute getYTrAttachment_GuardStringRep();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YTrAttachment#getPosTransition <em>Pos Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Transition</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YTrAttachment#getPosTransition()
	 * @see #getYTrAttachment()
	 * @generated
	 */
	EReference getYTrAttachment_PosTransition();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YTrAttachment#getPosObjectID <em>Pos Object ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Object ID</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YTrAttachment#getPosObjectID()
	 * @see #getYTrAttachment()
	 * @generated
	 */
	EReference getYTrAttachment_PosObjectID();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YTrAttachment#getPosName <em>Pos Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Name</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YTrAttachment#getPosName()
	 * @see #getYTrAttachment()
	 * @generated
	 */
	EReference getYTrAttachment_PosName();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YTrAttachment#getPosQualifiedName <em>Pos Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Qualified Name</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YTrAttachment#getPosQualifiedName()
	 * @see #getYTrAttachment()
	 * @generated
	 */
	EReference getYTrAttachment_PosQualifiedName();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YTrAttachment#getInsertEffect <em>Insert Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insert Effect</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YTrAttachment#getInsertEffect()
	 * @see #getYTrAttachment()
	 * @generated
	 */
	EAttribute getYTrAttachment_InsertEffect();

	/**
	 * Returns the meta object for class '{@link online.yamm.coreModelXmi.yamm.YEffect <em>YEffect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YEffect</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YEffect
	 * @generated
	 */
	EClass getYEffect();

	/**
	 * Returns the meta object for the containment reference '{@link online.yamm.coreModelXmi.yamm.YEffect#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YEffect#getBody()
	 * @see #getYEffect()
	 * @generated
	 */
	EReference getYEffect_Body();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YEffect#isBreakpoint <em>Breakpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Breakpoint</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YEffect#isBreakpoint()
	 * @see #getYEffect()
	 * @generated
	 */
	EAttribute getYEffect_Breakpoint();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YEffect#getEffectStringRep <em>Effect String Rep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effect String Rep</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YEffect#getEffectStringRep()
	 * @see #getYEffect()
	 * @generated
	 */
	EAttribute getYEffect_EffectStringRep();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YEffect#getPosObjectID <em>Pos Object ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Object ID</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YEffect#getPosObjectID()
	 * @see #getYEffect()
	 * @generated
	 */
	EReference getYEffect_PosObjectID();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YEffect#getPosBreakpoint <em>Pos Breakpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Breakpoint</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YEffect#getPosBreakpoint()
	 * @see #getYEffect()
	 * @generated
	 */
	EReference getYEffect_PosBreakpoint();

	/**
	 * Returns the meta object for class '{@link online.yamm.coreModelXmi.yamm.YVertex <em>YVertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YVertex</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YVertex
	 * @generated
	 */
	EClass getYVertex();

	/**
	 * Returns the meta object for the reference list '{@link online.yamm.coreModelXmi.yamm.YVertex#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YVertex#getOutgoing()
	 * @see #getYVertex()
	 * @generated
	 */
	EReference getYVertex_Outgoing();

	/**
	 * Returns the meta object for the reference list '{@link online.yamm.coreModelXmi.yamm.YVertex#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YVertex#getIncoming()
	 * @see #getYVertex()
	 * @generated
	 */
	EReference getYVertex_Incoming();

	/**
	 * Returns the meta object for class '{@link online.yamm.coreModelXmi.yamm.YPseudostate <em>YPseudostate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YPseudostate</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YPseudostate
	 * @generated
	 */
	EClass getYPseudostate();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YPseudostate#getQualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Name</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YPseudostate#getQualifiedName()
	 * @see #getYPseudostate()
	 * @generated
	 */
	EAttribute getYPseudostate_QualifiedName();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YPseudostate#getPosObjectID <em>Pos Object ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Object ID</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YPseudostate#getPosObjectID()
	 * @see #getYPseudostate()
	 * @generated
	 */
	EReference getYPseudostate_PosObjectID();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YPseudostate#getPosName <em>Pos Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Name</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YPseudostate#getPosName()
	 * @see #getYPseudostate()
	 * @generated
	 */
	EReference getYPseudostate_PosName();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YPseudostate#getPosQualifiedName <em>Pos Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Qualified Name</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YPseudostate#getPosQualifiedName()
	 * @see #getYPseudostate()
	 * @generated
	 */
	EReference getYPseudostate_PosQualifiedName();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YPseudostate#getInsertOutgoing <em>Insert Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insert Outgoing</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YPseudostate#getInsertOutgoing()
	 * @see #getYPseudostate()
	 * @generated
	 */
	EAttribute getYPseudostate_InsertOutgoing();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YPseudostate#getInsertIncoming <em>Insert Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insert Incoming</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YPseudostate#getInsertIncoming()
	 * @see #getYPseudostate()
	 * @generated
	 */
	EAttribute getYPseudostate_InsertIncoming();

	/**
	 * Returns the meta object for class '{@link online.yamm.coreModelXmi.yamm.YFinalState <em>YFinal State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YFinal State</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YFinalState
	 * @generated
	 */
	EClass getYFinalState();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YFinalState#getQualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Name</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YFinalState#getQualifiedName()
	 * @see #getYFinalState()
	 * @generated
	 */
	EAttribute getYFinalState_QualifiedName();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YFinalState#getPosObjectID <em>Pos Object ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Object ID</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YFinalState#getPosObjectID()
	 * @see #getYFinalState()
	 * @generated
	 */
	EReference getYFinalState_PosObjectID();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YFinalState#getPosName <em>Pos Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Name</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YFinalState#getPosName()
	 * @see #getYFinalState()
	 * @generated
	 */
	EReference getYFinalState_PosName();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YFinalState#getPosQualifiedName <em>Pos Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Qualified Name</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YFinalState#getPosQualifiedName()
	 * @see #getYFinalState()
	 * @generated
	 */
	EReference getYFinalState_PosQualifiedName();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YFinalState#getInsertOutgoing <em>Insert Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insert Outgoing</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YFinalState#getInsertOutgoing()
	 * @see #getYFinalState()
	 * @generated
	 */
	EAttribute getYFinalState_InsertOutgoing();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YFinalState#getInsertIncoming <em>Insert Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insert Incoming</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YFinalState#getInsertIncoming()
	 * @see #getYFinalState()
	 * @generated
	 */
	EAttribute getYFinalState_InsertIncoming();

	/**
	 * Returns the meta object for class '{@link online.yamm.coreModelXmi.yamm.YState <em>YState</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YState</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YState
	 * @generated
	 */
	EClass getYState();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YState#getQualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Name</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YState#getQualifiedName()
	 * @see #getYState()
	 * @generated
	 */
	EAttribute getYState_QualifiedName();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YState#getPosObjectID <em>Pos Object ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Object ID</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YState#getPosObjectID()
	 * @see #getYState()
	 * @generated
	 */
	EReference getYState_PosObjectID();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YState#getPosName <em>Pos Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Name</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YState#getPosName()
	 * @see #getYState()
	 * @generated
	 */
	EReference getYState_PosName();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YState#getPosQualifiedName <em>Pos Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Qualified Name</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YState#getPosQualifiedName()
	 * @see #getYState()
	 * @generated
	 */
	EReference getYState_PosQualifiedName();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YState#getInsertOutgoing <em>Insert Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insert Outgoing</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YState#getInsertOutgoing()
	 * @see #getYState()
	 * @generated
	 */
	EAttribute getYState_InsertOutgoing();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YState#getInsertIncoming <em>Insert Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insert Incoming</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YState#getInsertIncoming()
	 * @see #getYState()
	 * @generated
	 */
	EAttribute getYState_InsertIncoming();

	/**
	 * Returns the meta object for class '{@link online.yamm.coreModelXmi.yamm.YModel <em>YModel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YModel</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YModel
	 * @generated
	 */
	EClass getYModel();

	/**
	 * Returns the meta object for the containment reference list '{@link online.yamm.coreModelXmi.yamm.YModel#getClazz <em>Clazz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clazz</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YModel#getClazz()
	 * @see #getYModel()
	 * @generated
	 */
	EReference getYModel_Clazz();

	/**
	 * Returns the meta object for the containment reference list '{@link online.yamm.coreModelXmi.yamm.YModel#getEnumerations <em>Enumerations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enumerations</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YModel#getEnumerations()
	 * @see #getYModel()
	 * @generated
	 */
	EReference getYModel_Enumerations();

	/**
	 * Returns the meta object for the containment reference list '{@link online.yamm.coreModelXmi.yamm.YModel#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packages</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YModel#getPackages()
	 * @see #getYModel()
	 * @generated
	 */
	EReference getYModel_Packages();

	/**
	 * Returns the meta object for the containment reference list '{@link online.yamm.coreModelXmi.yamm.YModel#getObjects <em>Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Objects</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YModel#getObjects()
	 * @see #getYModel()
	 * @generated
	 */
	EReference getYModel_Objects();

	/**
	 * Returns the meta object for the containment reference list '{@link online.yamm.coreModelXmi.yamm.YModel#getSharedEdges <em>Shared Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Shared Edges</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YModel#getSharedEdges()
	 * @see #getYModel()
	 * @generated
	 */
	EReference getYModel_SharedEdges();

	/**
	 * Returns the meta object for the containment reference list '{@link online.yamm.coreModelXmi.yamm.YModel#getCompositeEdges <em>Composite Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composite Edges</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YModel#getCompositeEdges()
	 * @see #getYModel()
	 * @generated
	 */
	EReference getYModel_CompositeEdges();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YModel#getPosObjectID <em>Pos Object ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos Object ID</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YModel#getPosObjectID()
	 * @see #getYModel()
	 * @generated
	 */
	EReference getYModel_PosObjectID();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YModel#getInsertClass <em>Insert Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insert Class</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YModel#getInsertClass()
	 * @see #getYModel()
	 * @generated
	 */
	EAttribute getYModel_InsertClass();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YModel#getInsertEnum <em>Insert Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insert Enum</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YModel#getInsertEnum()
	 * @see #getYModel()
	 * @generated
	 */
	EAttribute getYModel_InsertEnum();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YModel#getInsertPackage <em>Insert Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insert Package</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YModel#getInsertPackage()
	 * @see #getYModel()
	 * @generated
	 */
	EAttribute getYModel_InsertPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link online.yamm.coreModelXmi.yamm.YModel#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YModel#getTypes()
	 * @see #getYModel()
	 * @generated
	 */
	EReference getYModel_Types();

	/**
	 * Returns the meta object for class '{@link online.yamm.coreModelXmi.yamm.YSharedEdge <em>YShared Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YShared Edge</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YSharedEdge
	 * @generated
	 */
	EClass getYSharedEdge();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YSharedEdge#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YSharedEdge#getDescription()
	 * @see #getYSharedEdge()
	 * @generated
	 */
	EAttribute getYSharedEdge_Description();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YSharedEdge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YSharedEdge#getSource()
	 * @see #getYSharedEdge()
	 * @generated
	 */
	EReference getYSharedEdge_Source();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YSharedEdge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YSharedEdge#getTarget()
	 * @see #getYSharedEdge()
	 * @generated
	 */
	EReference getYSharedEdge_Target();

	/**
	 * Returns the meta object for class '{@link online.yamm.coreModelXmi.yamm.YCompositeEdge <em>YComposite Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YComposite Edge</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YCompositeEdge
	 * @generated
	 */
	EClass getYCompositeEdge();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YCompositeEdge#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YCompositeEdge#getDescription()
	 * @see #getYCompositeEdge()
	 * @generated
	 */
	EAttribute getYCompositeEdge_Description();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YCompositeEdge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YCompositeEdge#getSource()
	 * @see #getYCompositeEdge()
	 * @generated
	 */
	EReference getYCompositeEdge_Source();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YCompositeEdge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YCompositeEdge#getTarget()
	 * @see #getYCompositeEdge()
	 * @generated
	 */
	EReference getYCompositeEdge_Target();

	/**
	 * Returns the meta object for class '{@link online.yamm.coreModelXmi.yamm.YObject <em>YObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YObject</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YObject
	 * @generated
	 */
	EClass getYObject();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YObject#getObjectID <em>Object ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object ID</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YObject#getObjectID()
	 * @see #getYObject()
	 * @generated
	 */
	EAttribute getYObject_ObjectID();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YObject#getDslInfo <em>Dsl Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dsl Info</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YObject#getDslInfo()
	 * @see #getYObject()
	 * @generated
	 */
	EReference getYObject_DslInfo();

	/**
	 * Returns the meta object for class '{@link online.yamm.coreModelXmi.yamm.YStateMachineHandler <em>YState Machine Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YState Machine Handler</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YStateMachineHandler
	 * @generated
	 */
	EClass getYStateMachineHandler();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YStateMachineHandler#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YStateMachineHandler#getState()
	 * @see #getYStateMachineHandler()
	 * @generated
	 */
	EReference getYStateMachineHandler_State();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YStateMachineHandler#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transition</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YStateMachineHandler#getTransition()
	 * @see #getYStateMachineHandler()
	 * @generated
	 */
	EReference getYStateMachineHandler_Transition();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YStateMachineHandler#isIsSuspended <em>Is Suspended</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Suspended</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YStateMachineHandler#isIsSuspended()
	 * @see #getYStateMachineHandler()
	 * @generated
	 */
	EAttribute getYStateMachineHandler_IsSuspended();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YStateMachineHandler#getEffectCount <em>Effect Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effect Count</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YStateMachineHandler#getEffectCount()
	 * @see #getYStateMachineHandler()
	 * @generated
	 */
	EAttribute getYStateMachineHandler_EffectCount();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YStateMachineHandler#getEffectNo <em>Effect No</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effect No</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YStateMachineHandler#getEffectNo()
	 * @see #getYStateMachineHandler()
	 * @generated
	 */
	EAttribute getYStateMachineHandler_EffectNo();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YStateMachineHandler#getStateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State Machine</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YStateMachineHandler#getStateMachine()
	 * @see #getYStateMachineHandler()
	 * @generated
	 */
	EReference getYStateMachineHandler_StateMachine();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YStateMachineHandler#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effect</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YStateMachineHandler#getEffect()
	 * @see #getYStateMachineHandler()
	 * @generated
	 */
	EAttribute getYStateMachineHandler_Effect();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YStateMachineHandler#getCalledFrom <em>Called From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Called From</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YStateMachineHandler#getCalledFrom()
	 * @see #getYStateMachineHandler()
	 * @generated
	 */
	EReference getYStateMachineHandler_CalledFrom();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YStateMachineHandler#getItsClassID <em>Its Class ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Its Class ID</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YStateMachineHandler#getItsClassID()
	 * @see #getYStateMachineHandler()
	 * @generated
	 */
	EAttribute getYStateMachineHandler_ItsClassID();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YStateMachineHandler#getOperationInstance <em>Operation Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation Instance</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YStateMachineHandler#getOperationInstance()
	 * @see #getYStateMachineHandler()
	 * @generated
	 */
	EReference getYStateMachineHandler_OperationInstance();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YStateMachineHandler#getEffectsProcessed <em>Effects Processed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effects Processed</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YStateMachineHandler#getEffectsProcessed()
	 * @see #getYStateMachineHandler()
	 * @generated
	 */
	EAttribute getYStateMachineHandler_EffectsProcessed();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YStateMachineHandler#getMaxEffectsToBeProcessed <em>Max Effects To Be Processed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Effects To Be Processed</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YStateMachineHandler#getMaxEffectsToBeProcessed()
	 * @see #getYStateMachineHandler()
	 * @generated
	 */
	EAttribute getYStateMachineHandler_MaxEffectsToBeProcessed();

	/**
	 * Returns the meta object for the attribute list '{@link online.yamm.coreModelXmi.yamm.YStateMachineHandler#getInAdapters <em>In Adapters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>In Adapters</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YStateMachineHandler#getInAdapters()
	 * @see #getYStateMachineHandler()
	 * @generated
	 */
	EAttribute getYStateMachineHandler_InAdapters();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YStateMachineHandler#getObjectsBindedWithInoutParameters <em>Objects Binded With Inout Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Objects Binded With Inout Parameters</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YStateMachineHandler#getObjectsBindedWithInoutParameters()
	 * @see #getYStateMachineHandler()
	 * @generated
	 */
	EAttribute getYStateMachineHandler_ObjectsBindedWithInoutParameters();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YStateMachineHandler#getReturnVar <em>Return Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Var</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YStateMachineHandler#getReturnVar()
	 * @see #getYStateMachineHandler()
	 * @generated
	 */
	EAttribute getYStateMachineHandler_ReturnVar();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YStateMachineHandler#getNameOfRetunVar <em>Name Of Retun Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Of Retun Var</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YStateMachineHandler#getNameOfRetunVar()
	 * @see #getYStateMachineHandler()
	 * @generated
	 */
	EAttribute getYStateMachineHandler_NameOfRetunVar();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YStateMachineHandler#getObjectsToColor <em>Objects To Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Objects To Color</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YStateMachineHandler#getObjectsToColor()
	 * @see #getYStateMachineHandler()
	 * @generated
	 */
	EAttribute getYStateMachineHandler_ObjectsToColor();

	/**
	 * Returns the meta object for class '{@link online.yamm.coreModelXmi.yamm.YGlobalStateMachine <em>YGlobal State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YGlobal State Machine</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YGlobalStateMachine
	 * @generated
	 */
	EClass getYGlobalStateMachine();

	/**
	 * Returns the meta object for the reference list '{@link online.yamm.coreModelXmi.yamm.YGlobalStateMachine#getStateMachines <em>State Machines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>State Machines</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YGlobalStateMachine#getStateMachines()
	 * @see #getYGlobalStateMachine()
	 * @generated
	 */
	EReference getYGlobalStateMachine_StateMachines();

	/**
	 * Returns the meta object for the reference list '{@link online.yamm.coreModelXmi.yamm.YGlobalStateMachine#getStateMachineHandlers <em>State Machine Handlers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>State Machine Handlers</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YGlobalStateMachine#getStateMachineHandlers()
	 * @see #getYGlobalStateMachine()
	 * @generated
	 */
	EReference getYGlobalStateMachine_StateMachineHandlers();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YGlobalStateMachine#getStateMachineHandlerCount <em>State Machine Handler Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State Machine Handler Count</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YGlobalStateMachine#getStateMachineHandlerCount()
	 * @see #getYGlobalStateMachine()
	 * @generated
	 */
	EAttribute getYGlobalStateMachine_StateMachineHandlerCount();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YGlobalStateMachine#isConstraintsAllTrue <em>Constraints All True</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraints All True</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YGlobalStateMachine#isConstraintsAllTrue()
	 * @see #getYGlobalStateMachine()
	 * @generated
	 */
	EAttribute getYGlobalStateMachine_ConstraintsAllTrue();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YGlobalStateMachine#isHasReturnParam <em>Has Return Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Return Param</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YGlobalStateMachine#isHasReturnParam()
	 * @see #getYGlobalStateMachine()
	 * @generated
	 */
	EAttribute getYGlobalStateMachine_HasReturnParam();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YGlobalStateMachine#getParamCount <em>Param Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Param Count</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YGlobalStateMachine#getParamCount()
	 * @see #getYGlobalStateMachine()
	 * @generated
	 */
	EAttribute getYGlobalStateMachine_ParamCount();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YGlobalStateMachine#getStateExitCount <em>State Exit Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State Exit Count</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YGlobalStateMachine#getStateExitCount()
	 * @see #getYGlobalStateMachine()
	 * @generated
	 */
	EAttribute getYGlobalStateMachine_StateExitCount();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YGlobalStateMachine#getStateExitNo <em>State Exit No</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State Exit No</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YGlobalStateMachine#getStateExitNo()
	 * @see #getYGlobalStateMachine()
	 * @generated
	 */
	EAttribute getYGlobalStateMachine_StateExitNo();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YGlobalStateMachine#getO <em>O</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>O</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YGlobalStateMachine#getO()
	 * @see #getYGlobalStateMachine()
	 * @generated
	 */
	EReference getYGlobalStateMachine_O();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YGlobalStateMachine#isObserverActive <em>Observer Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Observer Active</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YGlobalStateMachine#isObserverActive()
	 * @see #getYGlobalStateMachine()
	 * @generated
	 */
	EAttribute getYGlobalStateMachine_ObserverActive();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YGlobalStateMachine#isDesPhase <em>Des Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Des Phase</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YGlobalStateMachine#isDesPhase()
	 * @see #getYGlobalStateMachine()
	 * @generated
	 */
	EAttribute getYGlobalStateMachine_DesPhase();

	/**
	 * Returns the meta object for the containment reference '{@link online.yamm.coreModelXmi.yamm.YGlobalStateMachine#getInternal <em>Internal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Internal</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YGlobalStateMachine#getInternal()
	 * @see #getYGlobalStateMachine()
	 * @generated
	 */
	EReference getYGlobalStateMachine_Internal();

	/**
	 * Returns the meta object for the reference list '{@link online.yamm.coreModelXmi.yamm.YGlobalStateMachine#getNotYetExecutedInitialActiveStatemachines <em>Not Yet Executed Initial Active Statemachines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Not Yet Executed Initial Active Statemachines</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YGlobalStateMachine#getNotYetExecutedInitialActiveStatemachines()
	 * @see #getYGlobalStateMachine()
	 * @generated
	 */
	EReference getYGlobalStateMachine_NotYetExecutedInitialActiveStatemachines();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YGlobalStateMachine#getDesinitStateMachine <em>Desinit State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Desinit State Machine</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YGlobalStateMachine#getDesinitStateMachine()
	 * @see #getYGlobalStateMachine()
	 * @generated
	 */
	EReference getYGlobalStateMachine_DesinitStateMachine();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YGlobalStateMachine#getExecutionPhase <em>Execution Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Phase</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YGlobalStateMachine#getExecutionPhase()
	 * @see #getYGlobalStateMachine()
	 * @generated
	 */
	EAttribute getYGlobalStateMachine_ExecutionPhase();

	/**
	 * Returns the meta object for class '{@link online.yamm.coreModelXmi.yamm.YCreateInstanceExpression <em>YCreate Instance Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YCreate Instance Expression</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YCreateInstanceExpression
	 * @generated
	 */
	EClass getYCreateInstanceExpression();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YCreateInstanceExpression#getClazz <em>Clazz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Clazz</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YCreateInstanceExpression#getClazz()
	 * @see #getYCreateInstanceExpression()
	 * @generated
	 */
	EReference getYCreateInstanceExpression_Clazz();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YCreateInstanceExpression#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YCreateInstanceExpression#getFeature()
	 * @see #getYCreateInstanceExpression()
	 * @generated
	 */
	EReference getYCreateInstanceExpression_Feature();

	/**
	 * Returns the meta object for class '{@link online.yamm.coreModelXmi.yamm.YPrintExpression <em>YPrint Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YPrint Expression</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YPrintExpression
	 * @generated
	 */
	EClass getYPrintExpression();

	/**
	 * Returns the meta object for the containment reference '{@link online.yamm.coreModelXmi.yamm.YPrintExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YPrintExpression#getExpression()
	 * @see #getYPrintExpression()
	 * @generated
	 */
	EReference getYPrintExpression_Expression();

	/**
	 * Returns the meta object for class '{@link online.yamm.coreModelXmi.yamm.YSetReturnValue <em>YSet Return Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YSet Return Value</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YSetReturnValue
	 * @generated
	 */
	EClass getYSetReturnValue();

	/**
	 * Returns the meta object for the containment reference '{@link online.yamm.coreModelXmi.yamm.YSetReturnValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YSetReturnValue#getValue()
	 * @see #getYSetReturnValue()
	 * @generated
	 */
	EReference getYSetReturnValue_Value();

	/**
	 * Returns the meta object for class '{@link online.yamm.coreModelXmi.yamm.YGetInstancesOfExpression <em>YGet Instances Of Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YGet Instances Of Expression</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YGetInstancesOfExpression
	 * @generated
	 */
	EClass getYGetInstancesOfExpression();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YGetInstancesOfExpression#getClazz <em>Clazz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Clazz</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YGetInstancesOfExpression#getClazz()
	 * @see #getYGetInstancesOfExpression()
	 * @generated
	 */
	EReference getYGetInstancesOfExpression_Clazz();

	/**
	 * Returns the meta object for class '{@link online.yamm.coreModelXmi.yamm.YMemberFeatureCall <em>YMember Feature Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YMember Feature Call</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YMemberFeatureCall
	 * @generated
	 */
	EClass getYMemberFeatureCall();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YMemberFeatureCall#getInheritanceType <em>Inheritance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inheritance Type</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YMemberFeatureCall#getInheritanceType()
	 * @see #getYMemberFeatureCall()
	 * @generated
	 */
	EReference getYMemberFeatureCall_InheritanceType();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YMemberFeatureCall#isExplicitInheritanceType <em>Explicit Inheritance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Explicit Inheritance Type</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YMemberFeatureCall#isExplicitInheritanceType()
	 * @see #getYMemberFeatureCall()
	 * @generated
	 */
	EAttribute getYMemberFeatureCall_ExplicitInheritanceType();

	/**
	 * Returns the meta object for class '{@link online.yamm.coreModelXmi.yamm.YFeatureCall <em>YFeature Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YFeature Call</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YFeatureCall
	 * @generated
	 */
	EClass getYFeatureCall();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YFeatureCall#isExplicitInheritanceType <em>Explicit Inheritance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Explicit Inheritance Type</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YFeatureCall#isExplicitInheritanceType()
	 * @see #getYFeatureCall()
	 * @generated
	 */
	EAttribute getYFeatureCall_ExplicitInheritanceType();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.YFeatureCall#getInheritanceType <em>Inheritance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inheritance Type</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YFeatureCall#getInheritanceType()
	 * @see #getYFeatureCall()
	 * @generated
	 */
	EReference getYFeatureCall_InheritanceType();

	/**
	 * Returns the meta object for class '{@link online.yamm.coreModelXmi.yamm.YGetObjectManagement <em>YGet Object Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YGet Object Management</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YGetObjectManagement
	 * @generated
	 */
	EClass getYGetObjectManagement();

	/**
	 * Returns the meta object for the containment reference list '{@link online.yamm.coreModelXmi.yamm.YGetObjectManagement#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YGetObjectManagement#getParameter()
	 * @see #getYGetObjectManagement()
	 * @generated
	 */
	EReference getYGetObjectManagement_Parameter();

	/**
	 * Returns the meta object for class '{@link online.yamm.coreModelXmi.yamm.YGetLayerInformation <em>YGet Layer Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YGet Layer Information</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YGetLayerInformation
	 * @generated
	 */
	EClass getYGetLayerInformation();

	/**
	 * Returns the meta object for the containment reference list '{@link online.yamm.coreModelXmi.yamm.YGetLayerInformation#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YGetLayerInformation#getParameter()
	 * @see #getYGetLayerInformation()
	 * @generated
	 */
	EReference getYGetLayerInformation_Parameter();

	/**
	 * Returns the meta object for class '{@link online.yamm.coreModelXmi.yamm.YColorDFAObject <em>YColor DFA Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YColor DFA Object</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YColorDFAObject
	 * @generated
	 */
	EClass getYColorDFAObject();

	/**
	 * Returns the meta object for the containment reference '{@link online.yamm.coreModelXmi.yamm.YColorDFAObject#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Id</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YColorDFAObject#getId()
	 * @see #getYColorDFAObject()
	 * @generated
	 */
	EReference getYColorDFAObject_Id();

	/**
	 * Returns the meta object for class '{@link online.yamm.coreModelXmi.yamm.YGetInstances <em>YGet Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YGet Instances</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YGetInstances
	 * @generated
	 */
	EClass getYGetInstances();

	/**
	 * Returns the meta object for the containment reference list '{@link online.yamm.coreModelXmi.yamm.YGetInstances#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YGetInstances#getParameter()
	 * @see #getYGetInstances()
	 * @generated
	 */
	EReference getYGetInstances_Parameter();

	/**
	 * Returns the meta object for class '{@link online.yamm.coreModelXmi.yamm.YCountFinalStates <em>YCount Final States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YCount Final States</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YCountFinalStates
	 * @generated
	 */
	EClass getYCountFinalStates();

	/**
	 * Returns the meta object for the containment reference list '{@link online.yamm.coreModelXmi.yamm.YCountFinalStates#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YCountFinalStates#getParameter()
	 * @see #getYCountFinalStates()
	 * @generated
	 */
	EReference getYCountFinalStates_Parameter();

	/**
	 * Returns the meta object for class '{@link online.yamm.coreModelXmi.yamm.YCountInitialStates <em>YCount Initial States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YCount Initial States</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YCountInitialStates
	 * @generated
	 */
	EClass getYCountInitialStates();

	/**
	 * Returns the meta object for the containment reference list '{@link online.yamm.coreModelXmi.yamm.YCountInitialStates#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YCountInitialStates#getParameter()
	 * @see #getYCountInitialStates()
	 * @generated
	 */
	EReference getYCountInitialStates_Parameter();

	/**
	 * Returns the meta object for class '{@link online.yamm.coreModelXmi.yamm.YCountStates <em>YCount States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YCount States</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YCountStates
	 * @generated
	 */
	EClass getYCountStates();

	/**
	 * Returns the meta object for the containment reference list '{@link online.yamm.coreModelXmi.yamm.YCountStates#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YCountStates#getParameter()
	 * @see #getYCountStates()
	 * @generated
	 */
	EReference getYCountStates_Parameter();

	/**
	 * Returns the meta object for class '{@link online.yamm.coreModelXmi.yamm.YSetAbsoluteNodePropability <em>YSet Absolute Node Propability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YSet Absolute Node Propability</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YSetAbsoluteNodePropability
	 * @generated
	 */
	EClass getYSetAbsoluteNodePropability();

	/**
	 * Returns the meta object for the containment reference list '{@link online.yamm.coreModelXmi.yamm.YSetAbsoluteNodePropability#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YSetAbsoluteNodePropability#getParameter()
	 * @see #getYSetAbsoluteNodePropability()
	 * @generated
	 */
	EReference getYSetAbsoluteNodePropability_Parameter();

	/**
	 * Returns the meta object for class '{@link online.yamm.coreModelXmi.yamm.YCountReachableStates <em>YCount Reachable States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YCount Reachable States</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YCountReachableStates
	 * @generated
	 */
	EClass getYCountReachableStates();

	/**
	 * Returns the meta object for the containment reference list '{@link online.yamm.coreModelXmi.yamm.YCountReachableStates#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YCountReachableStates#getParameter()
	 * @see #getYCountReachableStates()
	 * @generated
	 */
	EReference getYCountReachableStates_Parameter();

	/**
	 * Returns the meta object for class '{@link online.yamm.coreModelXmi.yamm.YCountInValidTransitions <em>YCount In Valid Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YCount In Valid Transitions</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YCountInValidTransitions
	 * @generated
	 */
	EClass getYCountInValidTransitions();

	/**
	 * Returns the meta object for the containment reference list '{@link online.yamm.coreModelXmi.yamm.YCountInValidTransitions#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YCountInValidTransitions#getParameter()
	 * @see #getYCountInValidTransitions()
	 * @generated
	 */
	EReference getYCountInValidTransitions_Parameter();

	/**
	 * Returns the meta object for class '{@link online.yamm.coreModelXmi.yamm.YSetPopulationSize <em>YSet Population Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YSet Population Size</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YSetPopulationSize
	 * @generated
	 */
	EClass getYSetPopulationSize();

	/**
	 * Returns the meta object for the containment reference list '{@link online.yamm.coreModelXmi.yamm.YSetPopulationSize#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YSetPopulationSize#getParameter()
	 * @see #getYSetPopulationSize()
	 * @generated
	 */
	EReference getYSetPopulationSize_Parameter();

	/**
	 * Returns the meta object for class '{@link online.yamm.coreModelXmi.yamm.YLoadModel <em>YLoad Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YLoad Model</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YLoadModel
	 * @generated
	 */
	EClass getYLoadModel();

	/**
	 * Returns the meta object for the containment reference '{@link online.yamm.coreModelXmi.yamm.YLoadModel#getRelModelPath <em>Rel Model Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rel Model Path</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YLoadModel#getRelModelPath()
	 * @see #getYLoadModel()
	 * @generated
	 */
	EReference getYLoadModel_RelModelPath();

	/**
	 * Returns the meta object for class '{@link online.yamm.coreModelXmi.yamm.DslInfo <em>Dsl Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dsl Info</em>'.
	 * @see online.yamm.coreModelXmi.yamm.DslInfo
	 * @generated
	 */
	EClass getDslInfo();

	/**
	 * Returns the meta object for the map '{@link online.yamm.coreModelXmi.yamm.DslInfo#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Features</em>'.
	 * @see online.yamm.coreModelXmi.yamm.DslInfo#getFeatures()
	 * @see #getDslInfo()
	 * @generated
	 */
	EReference getDslInfo_Features();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.DslInfo#getFirstLine <em>First Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>First Line</em>'.
	 * @see online.yamm.coreModelXmi.yamm.DslInfo#getFirstLine()
	 * @see #getDslInfo()
	 * @generated
	 */
	EReference getDslInfo_FirstLine();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.DslInfo#getLastLine <em>Last Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Last Line</em>'.
	 * @see online.yamm.coreModelXmi.yamm.DslInfo#getLastLine()
	 * @see #getDslInfo()
	 * @generated
	 */
	EReference getDslInfo_LastLine();

	/**
	 * Returns the meta object for class '{@link online.yamm.coreModelXmi.yamm.FeatureInfo <em>Feature Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Info</em>'.
	 * @see online.yamm.coreModelXmi.yamm.FeatureInfo
	 * @generated
	 */
	EClass getFeatureInfo();

	/**
	 * Returns the meta object for class '{@link online.yamm.coreModelXmi.yamm.SingleLinePropertyInfo <em>Single Line Property Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Line Property Info</em>'.
	 * @see online.yamm.coreModelXmi.yamm.SingleLinePropertyInfo
	 * @generated
	 */
	EClass getSingleLinePropertyInfo();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.SingleLinePropertyInfo#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Line</em>'.
	 * @see online.yamm.coreModelXmi.yamm.SingleLinePropertyInfo#getLine()
	 * @see #getSingleLinePropertyInfo()
	 * @generated
	 */
	EReference getSingleLinePropertyInfo_Line();

	/**
	 * Returns the meta object for class '{@link online.yamm.coreModelXmi.yamm.GuardInfo <em>Guard Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guard Info</em>'.
	 * @see online.yamm.coreModelXmi.yamm.GuardInfo
	 * @generated
	 */
	EClass getGuardInfo();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.GuardInfo#getFirstLineGuard <em>First Line Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>First Line Guard</em>'.
	 * @see online.yamm.coreModelXmi.yamm.GuardInfo#getFirstLineGuard()
	 * @see #getGuardInfo()
	 * @generated
	 */
	EReference getGuardInfo_FirstLineGuard();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.GuardInfo#getLastLineGuard <em>Last Line Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Last Line Guard</em>'.
	 * @see online.yamm.coreModelXmi.yamm.GuardInfo#getLastLineGuard()
	 * @see #getGuardInfo()
	 * @generated
	 */
	EReference getGuardInfo_LastLineGuard();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.GuardInfo#isIgnoreNotification <em>Ignore Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignore Notification</em>'.
	 * @see online.yamm.coreModelXmi.yamm.GuardInfo#isIgnoreNotification()
	 * @see #getGuardInfo()
	 * @generated
	 */
	EAttribute getGuardInfo_IgnoreNotification();

	/**
	 * Returns the meta object for class '{@link online.yamm.coreModelXmi.yamm.EffectInfo <em>Effect Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Effect Info</em>'.
	 * @see online.yamm.coreModelXmi.yamm.EffectInfo
	 * @generated
	 */
	EClass getEffectInfo();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.EffectInfo#getFirstLineEffect <em>First Line Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>First Line Effect</em>'.
	 * @see online.yamm.coreModelXmi.yamm.EffectInfo#getFirstLineEffect()
	 * @see #getEffectInfo()
	 * @generated
	 */
	EReference getEffectInfo_FirstLineEffect();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.EffectInfo#getLastLineEffect <em>Last Line Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Last Line Effect</em>'.
	 * @see online.yamm.coreModelXmi.yamm.EffectInfo#getLastLineEffect()
	 * @see #getEffectInfo()
	 * @generated
	 */
	EReference getEffectInfo_LastLineEffect();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.EffectInfo#isIgnoreNotification <em>Ignore Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignore Notification</em>'.
	 * @see online.yamm.coreModelXmi.yamm.EffectInfo#isIgnoreNotification()
	 * @see #getEffectInfo()
	 * @generated
	 */
	EAttribute getEffectInfo_IgnoreNotification();

	/**
	 * Returns the meta object for class '{@link online.yamm.coreModelXmi.yamm.ContainmentInfo <em>Containment Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Containment Info</em>'.
	 * @see online.yamm.coreModelXmi.yamm.ContainmentInfo
	 * @generated
	 */
	EClass getContainmentInfo();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.coreModelXmi.yamm.ContainmentInfo#getInsertionLine <em>Insertion Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Insertion Line</em>'.
	 * @see online.yamm.coreModelXmi.yamm.ContainmentInfo#getInsertionLine()
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
	 *        valueType="online.yamm.coreModelXmi.yamm.FeatureInfo"
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
	 * Returns the meta object for class '{@link online.yamm.coreModelXmi.yamm.Line <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line</em>'.
	 * @see online.yamm.coreModelXmi.yamm.Line
	 * @generated
	 */
	EClass getLine();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.Line#getPos <em>Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos</em>'.
	 * @see online.yamm.coreModelXmi.yamm.Line#getPos()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_Pos();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.Line#getProcessedOffsets <em>Processed Offsets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Processed Offsets</em>'.
	 * @see online.yamm.coreModelXmi.yamm.Line#getProcessedOffsets()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_ProcessedOffsets();

	/**
	 * Returns the meta object for class '{@link online.yamm.coreModelXmi.yamm.YStructure <em>YStructure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YStructure</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YStructure
	 * @generated
	 */
	EClass getYStructure();

	/**
	 * Returns the meta object for class '{@link online.yamm.coreModelXmi.yamm.YInternal <em>YInternal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YInternal</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YInternal
	 * @generated
	 */
	EClass getYInternal();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.coreModelXmi.yamm.YInternal#getSimulationTime <em>Simulation Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Simulation Time</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YInternal#getSimulationTime()
	 * @see #getYInternal()
	 * @generated
	 */
	EAttribute getYInternal_SimulationTime();

	/**
	 * Returns the meta object for the container reference '{@link online.yamm.coreModelXmi.yamm.YInternal#getGlobalStateMachine <em>Global State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Global State Machine</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YInternal#getGlobalStateMachine()
	 * @see #getYInternal()
	 * @generated
	 */
	EReference getYInternal_GlobalStateMachine();

	/**
	 * Returns the meta object for class '{@link online.yamm.coreModelXmi.yamm.YTimeStep <em>YTime Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YTime Step</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YTimeStep
	 * @generated
	 */
	EClass getYTimeStep();

	/**
	 * Returns the meta object for class '{@link online.yamm.coreModelXmi.yamm.YObserverAddValue <em>YObserver Add Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YObserver Add Value</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YObserverAddValue
	 * @generated
	 */
	EClass getYObserverAddValue();

	/**
	 * Returns the meta object for the containment reference list '{@link online.yamm.coreModelXmi.yamm.YObserverAddValue#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YObserverAddValue#getParameter()
	 * @see #getYObserverAddValue()
	 * @generated
	 */
	EReference getYObserverAddValue_Parameter();

	/**
	 * Returns the meta object for enum '{@link online.yamm.coreModelXmi.yamm.YAggregationKind <em>YAggregation Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>YAggregation Kind</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YAggregationKind
	 * @generated
	 */
	EEnum getYAggregationKind();

	/**
	 * Returns the meta object for enum '{@link online.yamm.coreModelXmi.yamm.YParameterDirectionKind <em>YParameter Direction Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>YParameter Direction Kind</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YParameterDirectionKind
	 * @generated
	 */
	EEnum getYParameterDirectionKind();

	/**
	 * Returns the meta object for enum '{@link online.yamm.coreModelXmi.yamm.YRunToCompletion <em>YRun To Completion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>YRun To Completion</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YRunToCompletion
	 * @generated
	 */
	EEnum getYRunToCompletion();

	/**
	 * Returns the meta object for enum '{@link online.yamm.coreModelXmi.yamm.ExecutionPhase <em>Execution Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Execution Phase</em>'.
	 * @see online.yamm.coreModelXmi.yamm.ExecutionPhase
	 * @generated
	 */
	EEnum getExecutionPhase();

	/**
	 * Returns the meta object for enum '{@link online.yamm.coreModelXmi.yamm.YVisibilityKind <em>YVisibility Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>YVisibility Kind</em>'.
	 * @see online.yamm.coreModelXmi.yamm.YVisibilityKind
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
	YammFactory getYammFactory();

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
		 * The meta object literal for the '{@link online.yamm.coreModelXmi.yamm.impl.YClassImpl <em>YClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.coreModelXmi.yamm.impl.YClassImpl
		 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYClass()
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
		 * The meta object literal for the '<em><b>Insert Line Super Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YCLASS__INSERT_LINE_SUPER_CLASS = eINSTANCE.getYClass_InsertLineSuperClass();

		/**
		 * The meta object literal for the '<em><b>Insert Line Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YCLASS__INSERT_LINE_ATTRIBUTE = eINSTANCE.getYClass_InsertLineAttribute();

		/**
		 * The meta object literal for the '<em><b>Insert Line Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YCLASS__INSERT_LINE_OPERATION = eINSTANCE.getYClass_InsertLineOperation();

		/**
		 * The meta object literal for the '<em><b>Pos Object ID</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YCLASS__POS_OBJECT_ID = eINSTANCE.getYClass_PosObjectID();

		/**
		 * The meta object literal for the '<em><b>Pos Is Abstract</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YCLASS__POS_IS_ABSTRACT = eINSTANCE.getYClass_PosIsAbstract();

		/**
		 * The meta object literal for the '<em><b>Pos Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YCLASS__POS_NAME = eINSTANCE.getYClass_PosName();

		/**
		 * The meta object literal for the '<em><b>Pos Qualified Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YCLASS__POS_QUALIFIED_NAME = eINSTANCE.getYClass_PosQualifiedName();

		/**
		 * The meta object literal for the '<em><b>Pos Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YCLASS__POS_PACKAGE = eINSTANCE.getYClass_PosPackage();

		/**
		 * The meta object literal for the '<em><b>Observe Queue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YCLASS__OBSERVE_QUEUE = eINSTANCE.getYClass_ObserveQueue();

		/**
		 * The meta object literal for the '{@link online.yamm.coreModelXmi.yamm.impl.YClassifierImpl <em>YClassifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.coreModelXmi.yamm.impl.YClassifierImpl
		 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYClassifier()
		 * @generated
		 */
		EClass YCLASSIFIER = eINSTANCE.getYClassifier();

		/**
		 * The meta object literal for the '{@link online.yamm.coreModelXmi.yamm.impl.YCommentImpl <em>YComment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.coreModelXmi.yamm.impl.YCommentImpl
		 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYComment()
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
		 * The meta object literal for the '{@link online.yamm.coreModelXmi.yamm.impl.YConstraintImpl <em>YConstraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.coreModelXmi.yamm.impl.YConstraintImpl
		 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYConstraint()
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
		 * The meta object literal for the '{@link online.yamm.coreModelXmi.yamm.impl.YDataTypeImpl <em>YData Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.coreModelXmi.yamm.impl.YDataTypeImpl
		 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYDataType()
		 * @generated
		 */
		EClass YDATA_TYPE = eINSTANCE.getYDataType();

		/**
		 * The meta object literal for the '{@link online.yamm.coreModelXmi.yamm.impl.YElementImpl <em>YElement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.coreModelXmi.yamm.impl.YElementImpl
		 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYElement()
		 * @generated
		 */
		EClass YELEMENT = eINSTANCE.getYElement();

		/**
		 * The meta object literal for the '{@link online.yamm.coreModelXmi.yamm.impl.YElementImportImpl <em>YElement Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.coreModelXmi.yamm.impl.YElementImportImpl
		 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYElementImport()
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
		 * The meta object literal for the '{@link online.yamm.coreModelXmi.yamm.impl.YEnumerationImpl <em>YEnumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.coreModelXmi.yamm.impl.YEnumerationImpl
		 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYEnumeration()
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
		 * The meta object literal for the '<em><b>Pos Object ID</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YENUMERATION__POS_OBJECT_ID = eINSTANCE.getYEnumeration_PosObjectID();

		/**
		 * The meta object literal for the '<em><b>Pos Is Abstract</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YENUMERATION__POS_IS_ABSTRACT = eINSTANCE.getYEnumeration_PosIsAbstract();

		/**
		 * The meta object literal for the '<em><b>Pos Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YENUMERATION__POS_NAME = eINSTANCE.getYEnumeration_PosName();

		/**
		 * The meta object literal for the '<em><b>Pos Qualified Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YENUMERATION__POS_QUALIFIED_NAME = eINSTANCE.getYEnumeration_PosQualifiedName();

		/**
		 * The meta object literal for the '<em><b>Pos Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YENUMERATION__POS_PACKAGE = eINSTANCE.getYEnumeration_PosPackage();

		/**
		 * The meta object literal for the '<em><b>Insert Line Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YENUMERATION__INSERT_LINE_LITERAL = eINSTANCE.getYEnumeration_InsertLineLiteral();

		/**
		 * The meta object literal for the '{@link online.yamm.coreModelXmi.yamm.impl.YEnumerationLiteralImpl <em>YEnumeration Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.coreModelXmi.yamm.impl.YEnumerationLiteralImpl
		 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYEnumerationLiteral()
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
		 * The meta object literal for the '<em><b>Pos Object ID</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YENUMERATION_LITERAL__POS_OBJECT_ID = eINSTANCE.getYEnumerationLiteral_PosObjectID();

		/**
		 * The meta object literal for the '<em><b>Pos Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YENUMERATION_LITERAL__POS_NAME = eINSTANCE.getYEnumerationLiteral_PosName();

		/**
		 * The meta object literal for the '<em><b>Pos Qualified Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YENUMERATION_LITERAL__POS_QUALIFIED_NAME = eINSTANCE.getYEnumerationLiteral_PosQualifiedName();

		/**
		 * The meta object literal for the '{@link online.yamm.coreModelXmi.yamm.impl.YFeatureImpl <em>YFeature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.coreModelXmi.yamm.impl.YFeatureImpl
		 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYFeature()
		 * @generated
		 */
		EClass YFEATURE = eINSTANCE.getYFeature();

		/**
		 * The meta object literal for the '{@link online.yamm.coreModelXmi.yamm.impl.YNamedElementImpl <em>YNamed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.coreModelXmi.yamm.impl.YNamedElementImpl
		 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYNamedElement()
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
		 * The meta object literal for the '{@link online.yamm.coreModelXmi.yamm.impl.YNamespaceImpl <em>YNamespace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.coreModelXmi.yamm.impl.YNamespaceImpl
		 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYNamespace()
		 * @generated
		 */
		EClass YNAMESPACE = eINSTANCE.getYNamespace();

		/**
		 * The meta object literal for the '{@link online.yamm.coreModelXmi.yamm.impl.YOperationImpl <em>YOperation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.coreModelXmi.yamm.impl.YOperationImpl
		 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYOperation()
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
		 * The meta object literal for the '<em><b>Pos Object ID</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YOPERATION__POS_OBJECT_ID = eINSTANCE.getYOperation_PosObjectID();

		/**
		 * The meta object literal for the '<em><b>Pos Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YOPERATION__POS_NAME = eINSTANCE.getYOperation_PosName();

		/**
		 * The meta object literal for the '<em><b>Pos Clazz</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YOPERATION__POS_CLAZZ = eINSTANCE.getYOperation_PosClazz();

		/**
		 * The meta object literal for the '<em><b>Pos Lower</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YOPERATION__POS_LOWER = eINSTANCE.getYOperation_PosLower();

		/**
		 * The meta object literal for the '<em><b>Pos Upper</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YOPERATION__POS_UPPER = eINSTANCE.getYOperation_PosUpper();

		/**
		 * The meta object literal for the '<em><b>Pos State Machine</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YOPERATION__POS_STATE_MACHINE = eINSTANCE.getYOperation_PosStateMachine();

		/**
		 * The meta object literal for the '<em><b>Pos Return Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YOPERATION__POS_RETURN_TYPE = eINSTANCE.getYOperation_PosReturnType();

		/**
		 * The meta object literal for the '<em><b>Insert Line Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YOPERATION__INSERT_LINE_PARAMETER = eINSTANCE.getYOperation_InsertLineParameter();

		/**
		 * The meta object literal for the '{@link online.yamm.coreModelXmi.yamm.impl.YPackageImpl <em>YPackage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.coreModelXmi.yamm.impl.YPackageImpl
		 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYPackage()
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
		 * The meta object literal for the '<em><b>Pos Object ID</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPACKAGE__POS_OBJECT_ID = eINSTANCE.getYPackage_PosObjectID();

		/**
		 * The meta object literal for the '<em><b>Pos Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPACKAGE__POS_NAME = eINSTANCE.getYPackage_PosName();

		/**
		 * The meta object literal for the '<em><b>Pos Qualified Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPACKAGE__POS_QUALIFIED_NAME = eINSTANCE.getYPackage_PosQualifiedName();

		/**
		 * The meta object literal for the '<em><b>Pos Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPACKAGE__POS_PACKAGE = eINSTANCE.getYPackage_PosPackage();

		/**
		 * The meta object literal for the '<em><b>Insert Line Member</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YPACKAGE__INSERT_LINE_MEMBER = eINSTANCE.getYPackage_InsertLineMember();

		/**
		 * The meta object literal for the '{@link online.yamm.coreModelXmi.yamm.impl.YPackageableElementImpl <em>YPackageable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.coreModelXmi.yamm.impl.YPackageableElementImpl
		 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYPackageableElement()
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
		 * The meta object literal for the '{@link online.yamm.coreModelXmi.yamm.impl.YPackageImportImpl <em>YPackage Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.coreModelXmi.yamm.impl.YPackageImportImpl
		 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYPackageImport()
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
		 * The meta object literal for the '{@link online.yamm.coreModelXmi.yamm.impl.YParameterImpl <em>YParameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.coreModelXmi.yamm.impl.YParameterImpl
		 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYParameter()
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
		 * The meta object literal for the '<em><b>Pos Object ID</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPARAMETER__POS_OBJECT_ID = eINSTANCE.getYParameter_PosObjectID();

		/**
		 * The meta object literal for the '<em><b>Pos Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPARAMETER__POS_NAME = eINSTANCE.getYParameter_PosName();

		/**
		 * The meta object literal for the '<em><b>Pos Ordered</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPARAMETER__POS_ORDERED = eINSTANCE.getYParameter_PosOrdered();

		/**
		 * The meta object literal for the '<em><b>Pos Unique</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPARAMETER__POS_UNIQUE = eINSTANCE.getYParameter_PosUnique();

		/**
		 * The meta object literal for the '<em><b>Pos Lower</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPARAMETER__POS_LOWER = eINSTANCE.getYParameter_PosLower();

		/**
		 * The meta object literal for the '<em><b>Pos Upper</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPARAMETER__POS_UPPER = eINSTANCE.getYParameter_PosUpper();

		/**
		 * The meta object literal for the '<em><b>Pos Upperbound Wildcard</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPARAMETER__POS_UPPERBOUND_WILDCARD = eINSTANCE.getYParameter_PosUpperboundWildcard();

		/**
		 * The meta object literal for the '<em><b>Pos Direction</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPARAMETER__POS_DIRECTION = eINSTANCE.getYParameter_PosDirection();

		/**
		 * The meta object literal for the '<em><b>Pos Default Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPARAMETER__POS_DEFAULT_VALUE = eINSTANCE.getYParameter_PosDefaultValue();

		/**
		 * The meta object literal for the '<em><b>Pos Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPARAMETER__POS_TYPE = eINSTANCE.getYParameter_PosType();

		/**
		 * The meta object literal for the '<em><b>Pos Qualified Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPARAMETER__POS_QUALIFIED_NAME = eINSTANCE.getYParameter_PosQualifiedName();

		/**
		 * The meta object literal for the '{@link online.yamm.coreModelXmi.yamm.impl.YPrimitiveTypeImpl <em>YPrimitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.coreModelXmi.yamm.impl.YPrimitiveTypeImpl
		 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYPrimitiveType()
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
		 * The meta object literal for the '{@link online.yamm.coreModelXmi.yamm.impl.YPropertyImpl <em>YProperty</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.coreModelXmi.yamm.impl.YPropertyImpl
		 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYProperty()
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
		 * The meta object literal for the '<em><b>Pos Object ID</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPROPERTY__POS_OBJECT_ID = eINSTANCE.getYProperty_PosObjectID();

		/**
		 * The meta object literal for the '<em><b>Pos Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPROPERTY__POS_NAME = eINSTANCE.getYProperty_PosName();

		/**
		 * The meta object literal for the '<em><b>Pos Ordered</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPROPERTY__POS_ORDERED = eINSTANCE.getYProperty_PosOrdered();

		/**
		 * The meta object literal for the '<em><b>Pos Unique</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPROPERTY__POS_UNIQUE = eINSTANCE.getYProperty_PosUnique();

		/**
		 * The meta object literal for the '<em><b>Pos Lower</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPROPERTY__POS_LOWER = eINSTANCE.getYProperty_PosLower();

		/**
		 * The meta object literal for the '<em><b>Pos Upper</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPROPERTY__POS_UPPER = eINSTANCE.getYProperty_PosUpper();

		/**
		 * The meta object literal for the '<em><b>Pos Default Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPROPERTY__POS_DEFAULT_VALUE = eINSTANCE.getYProperty_PosDefaultValue();

		/**
		 * The meta object literal for the '<em><b>Pos Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPROPERTY__POS_TYPE = eINSTANCE.getYProperty_PosType();

		/**
		 * The meta object literal for the '<em><b>Pos Clazz</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPROPERTY__POS_CLAZZ = eINSTANCE.getYProperty_PosClazz();

		/**
		 * The meta object literal for the '<em><b>Pos Derived</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPROPERTY__POS_DERIVED = eINSTANCE.getYProperty_PosDerived();

		/**
		 * The meta object literal for the '<em><b>Pos Derived Union</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPROPERTY__POS_DERIVED_UNION = eINSTANCE.getYProperty_PosDerivedUnion();

		/**
		 * The meta object literal for the '<em><b>Pos Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPROPERTY__POS_ASSOCIATION = eINSTANCE.getYProperty_PosAssociation();

		/**
		 * The meta object literal for the '<em><b>Pos Visibility</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPROPERTY__POS_VISIBILITY = eINSTANCE.getYProperty_PosVisibility();

		/**
		 * The meta object literal for the '<em><b>Pos Opposite</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPROPERTY__POS_OPPOSITE = eINSTANCE.getYProperty_PosOpposite();

		/**
		 * The meta object literal for the '<em><b>Pos Aggregation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPROPERTY__POS_AGGREGATION = eINSTANCE.getYProperty_PosAggregation();

		/**
		 * The meta object literal for the '<em><b>Pos Qualified Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPROPERTY__POS_QUALIFIED_NAME = eINSTANCE.getYProperty_PosQualifiedName();

		/**
		 * The meta object literal for the '<em><b>Observe</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YPROPERTY__OBSERVE = eINSTANCE.getYProperty_Observe();

		/**
		 * The meta object literal for the '<em><b>Invarinat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YPROPERTY__INVARINAT = eINSTANCE.getYProperty_Invarinat();

		/**
		 * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YPROPERTY__STATIC = eINSTANCE.getYProperty_Static();

		/**
		 * The meta object literal for the '{@link online.yamm.coreModelXmi.yamm.impl.YTypeImpl <em>YType</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.coreModelXmi.yamm.impl.YTypeImpl
		 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYType()
		 * @generated
		 */
		EClass YTYPE = eINSTANCE.getYType();

		/**
		 * The meta object literal for the '{@link online.yamm.coreModelXmi.yamm.impl.YStateMachineImpl <em>YState Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.coreModelXmi.yamm.impl.YStateMachineImpl
		 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYStateMachine()
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
		 * The meta object literal for the '<em><b>Pos Object ID</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YSTATE_MACHINE__POS_OBJECT_ID = eINSTANCE.getYStateMachine_PosObjectID();

		/**
		 * The meta object literal for the '<em><b>Pos Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YSTATE_MACHINE__POS_NAME = eINSTANCE.getYStateMachine_PosName();

		/**
		 * The meta object literal for the '<em><b>Pos Qualified Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YSTATE_MACHINE__POS_QUALIFIED_NAME = eINSTANCE.getYStateMachine_PosQualifiedName();

		/**
		 * The meta object literal for the '<em><b>Pos Initial Active</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YSTATE_MACHINE__POS_INITIAL_ACTIVE = eINSTANCE.getYStateMachine_PosInitialActive();

		/**
		 * The meta object literal for the '<em><b>Pos Rtc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YSTATE_MACHINE__POS_RTC = eINSTANCE.getYStateMachine_PosRtc();

		/**
		 * The meta object literal for the '<em><b>Pos Max Effects To Be Processed</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YSTATE_MACHINE__POS_MAX_EFFECTS_TO_BE_PROCESSED = eINSTANCE.getYStateMachine_PosMaxEffectsToBeProcessed();

		/**
		 * The meta object literal for the '<em><b>Insert Line Transition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YSTATE_MACHINE__INSERT_LINE_TRANSITION = eINSTANCE.getYStateMachine_InsertLineTransition();

		/**
		 * The meta object literal for the '<em><b>Insert Line Vertex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YSTATE_MACHINE__INSERT_LINE_VERTEX = eINSTANCE.getYStateMachine_InsertLineVertex();

		/**
		 * The meta object literal for the '<em><b>Insert Line Attachment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YSTATE_MACHINE__INSERT_LINE_ATTACHMENT = eINSTANCE.getYStateMachine_InsertLineAttachment();

		/**
		 * The meta object literal for the '<em><b>Des Initializer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YSTATE_MACHINE__DES_INITIALIZER = eINSTANCE.getYStateMachine_DesInitializer();

		/**
		 * The meta object literal for the '{@link online.yamm.coreModelXmi.yamm.impl.YTransitionImpl <em>YTransition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.coreModelXmi.yamm.impl.YTransitionImpl
		 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYTransition()
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
		 * The meta object literal for the '<em><b>Pos Object ID</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YTRANSITION__POS_OBJECT_ID = eINSTANCE.getYTransition_PosObjectID();

		/**
		 * The meta object literal for the '<em><b>Pos Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YTRANSITION__POS_NAME = eINSTANCE.getYTransition_PosName();

		/**
		 * The meta object literal for the '<em><b>Pos Qualified Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YTRANSITION__POS_QUALIFIED_NAME = eINSTANCE.getYTransition_PosQualifiedName();

		/**
		 * The meta object literal for the '<em><b>Pos Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YTRANSITION__POS_SOURCE = eINSTANCE.getYTransition_PosSource();

		/**
		 * The meta object literal for the '<em><b>Pos Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YTRANSITION__POS_TARGET = eINSTANCE.getYTransition_PosTarget();

		/**
		 * The meta object literal for the '<em><b>Pos Attachment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YTRANSITION__POS_ATTACHMENT = eINSTANCE.getYTransition_PosAttachment();

		/**
		 * The meta object literal for the '{@link online.yamm.coreModelXmi.yamm.impl.YTrAttachmentImpl <em>YTr Attachment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.coreModelXmi.yamm.impl.YTrAttachmentImpl
		 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYTrAttachment()
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
		 * The meta object literal for the '<em><b>Pos Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YTR_ATTACHMENT__POS_TRANSITION = eINSTANCE.getYTrAttachment_PosTransition();

		/**
		 * The meta object literal for the '<em><b>Pos Object ID</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YTR_ATTACHMENT__POS_OBJECT_ID = eINSTANCE.getYTrAttachment_PosObjectID();

		/**
		 * The meta object literal for the '<em><b>Pos Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YTR_ATTACHMENT__POS_NAME = eINSTANCE.getYTrAttachment_PosName();

		/**
		 * The meta object literal for the '<em><b>Pos Qualified Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YTR_ATTACHMENT__POS_QUALIFIED_NAME = eINSTANCE.getYTrAttachment_PosQualifiedName();

		/**
		 * The meta object literal for the '<em><b>Insert Effect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YTR_ATTACHMENT__INSERT_EFFECT = eINSTANCE.getYTrAttachment_InsertEffect();

		/**
		 * The meta object literal for the '{@link online.yamm.coreModelXmi.yamm.impl.YEffectImpl <em>YEffect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.coreModelXmi.yamm.impl.YEffectImpl
		 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYEffect()
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
		 * The meta object literal for the '<em><b>Pos Object ID</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YEFFECT__POS_OBJECT_ID = eINSTANCE.getYEffect_PosObjectID();

		/**
		 * The meta object literal for the '<em><b>Pos Breakpoint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YEFFECT__POS_BREAKPOINT = eINSTANCE.getYEffect_PosBreakpoint();

		/**
		 * The meta object literal for the '{@link online.yamm.coreModelXmi.yamm.impl.YVertexImpl <em>YVertex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.coreModelXmi.yamm.impl.YVertexImpl
		 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYVertex()
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
		 * The meta object literal for the '{@link online.yamm.coreModelXmi.yamm.impl.YPseudostateImpl <em>YPseudostate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.coreModelXmi.yamm.impl.YPseudostateImpl
		 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYPseudostate()
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
		 * The meta object literal for the '<em><b>Pos Object ID</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPSEUDOSTATE__POS_OBJECT_ID = eINSTANCE.getYPseudostate_PosObjectID();

		/**
		 * The meta object literal for the '<em><b>Pos Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPSEUDOSTATE__POS_NAME = eINSTANCE.getYPseudostate_PosName();

		/**
		 * The meta object literal for the '<em><b>Pos Qualified Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPSEUDOSTATE__POS_QUALIFIED_NAME = eINSTANCE.getYPseudostate_PosQualifiedName();

		/**
		 * The meta object literal for the '<em><b>Insert Outgoing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YPSEUDOSTATE__INSERT_OUTGOING = eINSTANCE.getYPseudostate_InsertOutgoing();

		/**
		 * The meta object literal for the '<em><b>Insert Incoming</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YPSEUDOSTATE__INSERT_INCOMING = eINSTANCE.getYPseudostate_InsertIncoming();

		/**
		 * The meta object literal for the '{@link online.yamm.coreModelXmi.yamm.impl.YFinalStateImpl <em>YFinal State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.coreModelXmi.yamm.impl.YFinalStateImpl
		 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYFinalState()
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
		 * The meta object literal for the '<em><b>Pos Object ID</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YFINAL_STATE__POS_OBJECT_ID = eINSTANCE.getYFinalState_PosObjectID();

		/**
		 * The meta object literal for the '<em><b>Pos Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YFINAL_STATE__POS_NAME = eINSTANCE.getYFinalState_PosName();

		/**
		 * The meta object literal for the '<em><b>Pos Qualified Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YFINAL_STATE__POS_QUALIFIED_NAME = eINSTANCE.getYFinalState_PosQualifiedName();

		/**
		 * The meta object literal for the '<em><b>Insert Outgoing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YFINAL_STATE__INSERT_OUTGOING = eINSTANCE.getYFinalState_InsertOutgoing();

		/**
		 * The meta object literal for the '<em><b>Insert Incoming</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YFINAL_STATE__INSERT_INCOMING = eINSTANCE.getYFinalState_InsertIncoming();

		/**
		 * The meta object literal for the '{@link online.yamm.coreModelXmi.yamm.impl.YStateImpl <em>YState</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.coreModelXmi.yamm.impl.YStateImpl
		 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYState()
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
		 * The meta object literal for the '<em><b>Pos Object ID</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YSTATE__POS_OBJECT_ID = eINSTANCE.getYState_PosObjectID();

		/**
		 * The meta object literal for the '<em><b>Pos Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YSTATE__POS_NAME = eINSTANCE.getYState_PosName();

		/**
		 * The meta object literal for the '<em><b>Pos Qualified Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YSTATE__POS_QUALIFIED_NAME = eINSTANCE.getYState_PosQualifiedName();

		/**
		 * The meta object literal for the '<em><b>Insert Outgoing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YSTATE__INSERT_OUTGOING = eINSTANCE.getYState_InsertOutgoing();

		/**
		 * The meta object literal for the '<em><b>Insert Incoming</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YSTATE__INSERT_INCOMING = eINSTANCE.getYState_InsertIncoming();

		/**
		 * The meta object literal for the '{@link online.yamm.coreModelXmi.yamm.impl.YModelImpl <em>YModel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.coreModelXmi.yamm.impl.YModelImpl
		 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYModel()
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
		 * The meta object literal for the '<em><b>Pos Object ID</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YMODEL__POS_OBJECT_ID = eINSTANCE.getYModel_PosObjectID();

		/**
		 * The meta object literal for the '<em><b>Insert Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YMODEL__INSERT_CLASS = eINSTANCE.getYModel_InsertClass();

		/**
		 * The meta object literal for the '<em><b>Insert Enum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YMODEL__INSERT_ENUM = eINSTANCE.getYModel_InsertEnum();

		/**
		 * The meta object literal for the '<em><b>Insert Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YMODEL__INSERT_PACKAGE = eINSTANCE.getYModel_InsertPackage();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YMODEL__TYPES = eINSTANCE.getYModel_Types();

		/**
		 * The meta object literal for the '{@link online.yamm.coreModelXmi.yamm.impl.YSharedEdgeImpl <em>YShared Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.coreModelXmi.yamm.impl.YSharedEdgeImpl
		 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYSharedEdge()
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
		 * The meta object literal for the '{@link online.yamm.coreModelXmi.yamm.impl.YCompositeEdgeImpl <em>YComposite Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.coreModelXmi.yamm.impl.YCompositeEdgeImpl
		 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYCompositeEdge()
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
		 * The meta object literal for the '{@link online.yamm.coreModelXmi.yamm.impl.YObjectImpl <em>YObject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.coreModelXmi.yamm.impl.YObjectImpl
		 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYObject()
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
		 * The meta object literal for the '{@link online.yamm.coreModelXmi.yamm.impl.YStateMachineHandlerImpl <em>YState Machine Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.coreModelXmi.yamm.impl.YStateMachineHandlerImpl
		 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYStateMachineHandler()
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
		 * The meta object literal for the '{@link online.yamm.coreModelXmi.yamm.impl.YGlobalStateMachineImpl <em>YGlobal State Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.coreModelXmi.yamm.impl.YGlobalStateMachineImpl
		 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYGlobalStateMachine()
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
		 * The meta object literal for the '<em><b>Des Phase</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YGLOBAL_STATE_MACHINE__DES_PHASE = eINSTANCE.getYGlobalStateMachine_DesPhase();

		/**
		 * The meta object literal for the '<em><b>Internal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YGLOBAL_STATE_MACHINE__INTERNAL = eINSTANCE.getYGlobalStateMachine_Internal();

		/**
		 * The meta object literal for the '<em><b>Not Yet Executed Initial Active Statemachines</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YGLOBAL_STATE_MACHINE__NOT_YET_EXECUTED_INITIAL_ACTIVE_STATEMACHINES = eINSTANCE.getYGlobalStateMachine_NotYetExecutedInitialActiveStatemachines();

		/**
		 * The meta object literal for the '<em><b>Desinit State Machine</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YGLOBAL_STATE_MACHINE__DESINIT_STATE_MACHINE = eINSTANCE.getYGlobalStateMachine_DesinitStateMachine();

		/**
		 * The meta object literal for the '<em><b>Execution Phase</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YGLOBAL_STATE_MACHINE__EXECUTION_PHASE = eINSTANCE.getYGlobalStateMachine_ExecutionPhase();

		/**
		 * The meta object literal for the '{@link online.yamm.coreModelXmi.yamm.impl.YCreateInstanceExpressionImpl <em>YCreate Instance Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.coreModelXmi.yamm.impl.YCreateInstanceExpressionImpl
		 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYCreateInstanceExpression()
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
		 * The meta object literal for the '{@link online.yamm.coreModelXmi.yamm.impl.YPrintExpressionImpl <em>YPrint Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.coreModelXmi.yamm.impl.YPrintExpressionImpl
		 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYPrintExpression()
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
		 * The meta object literal for the '{@link online.yamm.coreModelXmi.yamm.impl.YSetReturnValueImpl <em>YSet Return Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.coreModelXmi.yamm.impl.YSetReturnValueImpl
		 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYSetReturnValue()
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
		 * The meta object literal for the '{@link online.yamm.coreModelXmi.yamm.impl.YGetInstancesOfExpressionImpl <em>YGet Instances Of Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.coreModelXmi.yamm.impl.YGetInstancesOfExpressionImpl
		 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYGetInstancesOfExpression()
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
		 * The meta object literal for the '{@link online.yamm.coreModelXmi.yamm.impl.YMemberFeatureCallImpl <em>YMember Feature Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.coreModelXmi.yamm.impl.YMemberFeatureCallImpl
		 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYMemberFeatureCall()
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
		 * The meta object literal for the '{@link online.yamm.coreModelXmi.yamm.impl.YFeatureCallImpl <em>YFeature Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.coreModelXmi.yamm.impl.YFeatureCallImpl
		 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYFeatureCall()
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
		 * The meta object literal for the '{@link online.yamm.coreModelXmi.yamm.impl.YGetObjectManagementImpl <em>YGet Object Management</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.coreModelXmi.yamm.impl.YGetObjectManagementImpl
		 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYGetObjectManagement()
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
		 * The meta object literal for the '{@link online.yamm.coreModelXmi.yamm.impl.YGetLayerInformationImpl <em>YGet Layer Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.coreModelXmi.yamm.impl.YGetLayerInformationImpl
		 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYGetLayerInformation()
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
		 * The meta object literal for the '{@link online.yamm.coreModelXmi.yamm.impl.YColorDFAObjectImpl <em>YColor DFA Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.coreModelXmi.yamm.impl.YColorDFAObjectImpl
		 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYColorDFAObject()
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
		 * The meta object literal for the '{@link online.yamm.coreModelXmi.yamm.impl.YGetInstancesImpl <em>YGet Instances</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.coreModelXmi.yamm.impl.YGetInstancesImpl
		 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYGetInstances()
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
		 * The meta object literal for the '{@link online.yamm.coreModelXmi.yamm.impl.YCountFinalStatesImpl <em>YCount Final States</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.coreModelXmi.yamm.impl.YCountFinalStatesImpl
		 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYCountFinalStates()
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
		 * The meta object literal for the '{@link online.yamm.coreModelXmi.yamm.impl.YCountInitialStatesImpl <em>YCount Initial States</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.coreModelXmi.yamm.impl.YCountInitialStatesImpl
		 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYCountInitialStates()
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
		 * The meta object literal for the '{@link online.yamm.coreModelXmi.yamm.impl.YCountStatesImpl <em>YCount States</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.coreModelXmi.yamm.impl.YCountStatesImpl
		 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYCountStates()
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
		 * The meta object literal for the '{@link online.yamm.coreModelXmi.yamm.impl.YSetAbsoluteNodePropabilityImpl <em>YSet Absolute Node Propability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.coreModelXmi.yamm.impl.YSetAbsoluteNodePropabilityImpl
		 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYSetAbsoluteNodePropability()
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
		 * The meta object literal for the '{@link online.yamm.coreModelXmi.yamm.impl.YCountReachableStatesImpl <em>YCount Reachable States</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.coreModelXmi.yamm.impl.YCountReachableStatesImpl
		 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYCountReachableStates()
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
		 * The meta object literal for the '{@link online.yamm.coreModelXmi.yamm.impl.YCountInValidTransitionsImpl <em>YCount In Valid Transitions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.coreModelXmi.yamm.impl.YCountInValidTransitionsImpl
		 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYCountInValidTransitions()
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
		 * The meta object literal for the '{@link online.yamm.coreModelXmi.yamm.impl.YSetPopulationSizeImpl <em>YSet Population Size</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.coreModelXmi.yamm.impl.YSetPopulationSizeImpl
		 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYSetPopulationSize()
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
		 * The meta object literal for the '{@link online.yamm.coreModelXmi.yamm.impl.YLoadModelImpl <em>YLoad Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.coreModelXmi.yamm.impl.YLoadModelImpl
		 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYLoadModel()
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
		 * The meta object literal for the '{@link online.yamm.coreModelXmi.yamm.impl.DslInfoImpl <em>Dsl Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.coreModelXmi.yamm.impl.DslInfoImpl
		 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getDslInfo()
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
		 * The meta object literal for the '{@link online.yamm.coreModelXmi.yamm.impl.FeatureInfoImpl <em>Feature Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.coreModelXmi.yamm.impl.FeatureInfoImpl
		 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getFeatureInfo()
		 * @generated
		 */
		EClass FEATURE_INFO = eINSTANCE.getFeatureInfo();

		/**
		 * The meta object literal for the '{@link online.yamm.coreModelXmi.yamm.impl.SingleLinePropertyInfoImpl <em>Single Line Property Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.coreModelXmi.yamm.impl.SingleLinePropertyInfoImpl
		 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getSingleLinePropertyInfo()
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
		 * The meta object literal for the '{@link online.yamm.coreModelXmi.yamm.impl.GuardInfoImpl <em>Guard Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.coreModelXmi.yamm.impl.GuardInfoImpl
		 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getGuardInfo()
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
		 * The meta object literal for the '{@link online.yamm.coreModelXmi.yamm.impl.EffectInfoImpl <em>Effect Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.coreModelXmi.yamm.impl.EffectInfoImpl
		 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getEffectInfo()
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
		 * The meta object literal for the '{@link online.yamm.coreModelXmi.yamm.impl.ContainmentInfoImpl <em>Containment Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.coreModelXmi.yamm.impl.ContainmentInfoImpl
		 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getContainmentInfo()
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
		 * The meta object literal for the '{@link online.yamm.coreModelXmi.yamm.impl.EStructuralFeatureToFeatureInfoMapImpl <em>EStructural Feature To Feature Info Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.coreModelXmi.yamm.impl.EStructuralFeatureToFeatureInfoMapImpl
		 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getEStructuralFeatureToFeatureInfoMap()
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
		 * The meta object literal for the '{@link online.yamm.coreModelXmi.yamm.impl.LineImpl <em>Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.coreModelXmi.yamm.impl.LineImpl
		 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getLine()
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
		 * The meta object literal for the '{@link online.yamm.coreModelXmi.yamm.impl.YStructureImpl <em>YStructure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.coreModelXmi.yamm.impl.YStructureImpl
		 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYStructure()
		 * @generated
		 */
		EClass YSTRUCTURE = eINSTANCE.getYStructure();

		/**
		 * The meta object literal for the '{@link online.yamm.coreModelXmi.yamm.impl.YInternalImpl <em>YInternal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.coreModelXmi.yamm.impl.YInternalImpl
		 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYInternal()
		 * @generated
		 */
		EClass YINTERNAL = eINSTANCE.getYInternal();

		/**
		 * The meta object literal for the '<em><b>Simulation Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YINTERNAL__SIMULATION_TIME = eINSTANCE.getYInternal_SimulationTime();

		/**
		 * The meta object literal for the '<em><b>Global State Machine</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YINTERNAL__GLOBAL_STATE_MACHINE = eINSTANCE.getYInternal_GlobalStateMachine();

		/**
		 * The meta object literal for the '{@link online.yamm.coreModelXmi.yamm.impl.YTimeStepImpl <em>YTime Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.coreModelXmi.yamm.impl.YTimeStepImpl
		 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYTimeStep()
		 * @generated
		 */
		EClass YTIME_STEP = eINSTANCE.getYTimeStep();

		/**
		 * The meta object literal for the '{@link online.yamm.coreModelXmi.yamm.impl.YObserverAddValueImpl <em>YObserver Add Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.coreModelXmi.yamm.impl.YObserverAddValueImpl
		 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYObserverAddValue()
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
		 * The meta object literal for the '{@link online.yamm.coreModelXmi.yamm.YAggregationKind <em>YAggregation Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.coreModelXmi.yamm.YAggregationKind
		 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYAggregationKind()
		 * @generated
		 */
		EEnum YAGGREGATION_KIND = eINSTANCE.getYAggregationKind();

		/**
		 * The meta object literal for the '{@link online.yamm.coreModelXmi.yamm.YParameterDirectionKind <em>YParameter Direction Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.coreModelXmi.yamm.YParameterDirectionKind
		 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYParameterDirectionKind()
		 * @generated
		 */
		EEnum YPARAMETER_DIRECTION_KIND = eINSTANCE.getYParameterDirectionKind();

		/**
		 * The meta object literal for the '{@link online.yamm.coreModelXmi.yamm.YRunToCompletion <em>YRun To Completion</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.coreModelXmi.yamm.YRunToCompletion
		 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYRunToCompletion()
		 * @generated
		 */
		EEnum YRUN_TO_COMPLETION = eINSTANCE.getYRunToCompletion();

		/**
		 * The meta object literal for the '{@link online.yamm.coreModelXmi.yamm.ExecutionPhase <em>Execution Phase</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.coreModelXmi.yamm.ExecutionPhase
		 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getExecutionPhase()
		 * @generated
		 */
		EEnum EXECUTION_PHASE = eINSTANCE.getExecutionPhase();

		/**
		 * The meta object literal for the '{@link online.yamm.coreModelXmi.yamm.YVisibilityKind <em>YVisibility Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.coreModelXmi.yamm.YVisibilityKind
		 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getYVisibilityKind()
		 * @generated
		 */
		EEnum YVISIBILITY_KIND = eINSTANCE.getYVisibilityKind();

		/**
		 * The meta object literal for the '<em>EString2</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see online.yamm.coreModelXmi.yamm.impl.YammPackageImpl#getEString2()
		 * @generated
		 */
		EDataType ESTRING2 = eINSTANCE.getEString2();

	}

} //YammPackage
