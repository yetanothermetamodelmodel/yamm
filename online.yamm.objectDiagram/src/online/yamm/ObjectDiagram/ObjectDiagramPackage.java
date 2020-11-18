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
package online.yamm.ObjectDiagram;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see online.yamm.ObjectDiagram.ObjectDiagramFactory
 * @model kind="package"
 * @generated
 */
public interface ObjectDiagramPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ObjectDiagram";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.yamm.online/objectDiagram/ObjectDiagram";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ObjectDiagram";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ObjectDiagramPackage eINSTANCE = online.yamm.ObjectDiagram.impl.ObjectDiagramPackageImpl.init();

	/**
	 * The meta object id for the '{@link online.yamm.ObjectDiagram.impl.ObjectDiagramImpl <em>Object Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.ObjectDiagram.impl.ObjectDiagramImpl
	 * @see online.yamm.ObjectDiagram.impl.ObjectDiagramPackageImpl#getObjectDiagram()
	 * @generated
	 */
	int OBJECT_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_DIAGRAM__OBJECTS = 0;

	/**
	 * The feature id for the '<em><b>Types</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_DIAGRAM__TYPES = 1;

	/**
	 * The feature id for the '<em><b>Data Types</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_DIAGRAM__DATA_TYPES = 2;

	/**
	 * The feature id for the '<em><b>Stackframes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_DIAGRAM__STACKFRAMES = 3;

	/**
	 * The feature id for the '<em><b>Yamm Model Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_DIAGRAM__YAMM_MODEL_PATH = 4;

	/**
	 * The feature id for the '<em><b>Meta Data Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_DIAGRAM__META_DATA_PACKAGE = 5;

	/**
	 * The feature id for the '<em><b>Type Object Create</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_DIAGRAM__TYPE_OBJECT_CREATE = 6;

	/**
	 * The feature id for the '<em><b>Initial Model</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_DIAGRAM__INITIAL_MODEL = 7;

	/**
	 * The number of structural features of the '<em>Object Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_DIAGRAM_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Object Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_DIAGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link online.yamm.ObjectDiagram.impl.ODObjectImpl <em>OD Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.ObjectDiagram.impl.ODObjectImpl
	 * @see online.yamm.ObjectDiagram.impl.ObjectDiagramPackageImpl#getODObject()
	 * @generated
	 */
	int OD_OBJECT = 1;

	/**
	 * The feature id for the '<em><b>Object ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_OBJECT__OBJECT_ID = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_OBJECT__TYPE = 1;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_OBJECT__REFERENCES = 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_OBJECT__ATTRIBUTES = 3;

	/**
	 * The feature id for the '<em><b>Runtime Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_OBJECT__RUNTIME_OBJECT = 4;

	/**
	 * The number of structural features of the '<em>OD Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_OBJECT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>OD Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link online.yamm.ObjectDiagram.impl.ODTypeImpl <em>OD Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.ObjectDiagram.impl.ODTypeImpl
	 * @see online.yamm.ObjectDiagram.impl.ObjectDiagramPackageImpl#getODType()
	 * @generated
	 */
	int OD_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_TYPE__QUALIFIED_NAME = 1;

	/**
	 * The feature id for the '<em><b>Runtime Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_TYPE__RUNTIME_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Yamm Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_TYPE__YAMM_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Object ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_TYPE__OBJECT_ID = 4;

	/**
	 * The number of structural features of the '<em>OD Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>OD Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link online.yamm.ObjectDiagram.impl.ODReferenceImpl <em>OD Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.ObjectDiagram.impl.ODReferenceImpl
	 * @see online.yamm.ObjectDiagram.impl.ObjectDiagramPackageImpl#getODReference()
	 * @generated
	 */
	int OD_REFERENCE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_REFERENCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_REFERENCE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_REFERENCE__CONTAINMENT = 2;

	/**
	 * The feature id for the '<em><b>Opposites</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_REFERENCE__OPPOSITES = 3;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_REFERENCE__LOWER = 4;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_REFERENCE__UPPER = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_REFERENCE__VALUE = 6;

	/**
	 * The feature id for the '<em><b>Bidirectional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_REFERENCE__BIDIRECTIONAL = 7;

	/**
	 * The number of structural features of the '<em>OD Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_REFERENCE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>OD Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link online.yamm.ObjectDiagram.impl.ODDateTypeImpl <em>OD Date Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.ObjectDiagram.impl.ODDateTypeImpl
	 * @see online.yamm.ObjectDiagram.impl.ObjectDiagramPackageImpl#getODDateType()
	 * @generated
	 */
	int OD_DATE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_DATE_TYPE__NAME = OD_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_DATE_TYPE__QUALIFIED_NAME = OD_TYPE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Runtime Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_DATE_TYPE__RUNTIME_TYPE = OD_TYPE__RUNTIME_TYPE;

	/**
	 * The feature id for the '<em><b>Yamm Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_DATE_TYPE__YAMM_TYPE = OD_TYPE__YAMM_TYPE;

	/**
	 * The feature id for the '<em><b>Object ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_DATE_TYPE__OBJECT_ID = OD_TYPE__OBJECT_ID;

	/**
	 * The feature id for the '<em><b>Enum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_DATE_TYPE__ENUM = OD_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OD Date Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_DATE_TYPE_FEATURE_COUNT = OD_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>OD Date Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_DATE_TYPE_OPERATION_COUNT = OD_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link online.yamm.ObjectDiagram.impl.ODAttributeImpl <em>OD Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.ObjectDiagram.impl.ODAttributeImpl
	 * @see online.yamm.ObjectDiagram.impl.ObjectDiagramPackageImpl#getODAttribute()
	 * @generated
	 */
	int OD_ATTRIBUTE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_ATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_ATTRIBUTE__DATA_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_ATTRIBUTE__LOWER = 2;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_ATTRIBUTE__UPPER = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_ATTRIBUTE__VALUE = 4;

	/**
	 * The number of structural features of the '<em>OD Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_ATTRIBUTE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>OD Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link online.yamm.ObjectDiagram.impl.ODStackframeImpl <em>OD Stackframe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.ObjectDiagram.impl.ODStackframeImpl
	 * @see online.yamm.ObjectDiagram.impl.ObjectDiagramPackageImpl#getODStackframe()
	 * @generated
	 */
	int OD_STACKFRAME = 6;

	/**
	 * The feature id for the '<em><b>Parameter Primitive</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_STACKFRAME__PARAMETER_PRIMITIVE = 0;

	/**
	 * The feature id for the '<em><b>Parameters Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_STACKFRAME__PARAMETERS_OBJECTS = 1;

	/**
	 * The feature id for the '<em><b>Containing Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_STACKFRAME__CONTAINING_OBJECT = 2;

	/**
	 * The feature id for the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_STACKFRAME__OPERATION_NAME = 3;

	/**
	 * The number of structural features of the '<em>OD Stackframe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_STACKFRAME_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>OD Stackframe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_STACKFRAME_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link online.yamm.ObjectDiagram.impl.EStringToODTypeMapImpl <em>EString To OD Type Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.ObjectDiagram.impl.EStringToODTypeMapImpl
	 * @see online.yamm.ObjectDiagram.impl.ObjectDiagramPackageImpl#getEStringToODTypeMap()
	 * @generated
	 */
	int ESTRING_TO_OD_TYPE_MAP = 7;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TO_OD_TYPE_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TO_OD_TYPE_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>EString To OD Type Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TO_OD_TYPE_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>EString To OD Type Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TO_OD_TYPE_MAP_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link online.yamm.ObjectDiagram.ObjectDiagram <em>Object Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Diagram</em>'.
	 * @see online.yamm.ObjectDiagram.ObjectDiagram
	 * @generated
	 */
	EClass getObjectDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link online.yamm.ObjectDiagram.ObjectDiagram#getObjects <em>Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Objects</em>'.
	 * @see online.yamm.ObjectDiagram.ObjectDiagram#getObjects()
	 * @see #getObjectDiagram()
	 * @generated
	 */
	EReference getObjectDiagram_Objects();

	/**
	 * Returns the meta object for the map '{@link online.yamm.ObjectDiagram.ObjectDiagram#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Types</em>'.
	 * @see online.yamm.ObjectDiagram.ObjectDiagram#getTypes()
	 * @see #getObjectDiagram()
	 * @generated
	 */
	EReference getObjectDiagram_Types();

	/**
	 * Returns the meta object for the map '{@link online.yamm.ObjectDiagram.ObjectDiagram#getDataTypes <em>Data Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Data Types</em>'.
	 * @see online.yamm.ObjectDiagram.ObjectDiagram#getDataTypes()
	 * @see #getObjectDiagram()
	 * @generated
	 */
	EReference getObjectDiagram_DataTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link online.yamm.ObjectDiagram.ObjectDiagram#getStackframes <em>Stackframes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stackframes</em>'.
	 * @see online.yamm.ObjectDiagram.ObjectDiagram#getStackframes()
	 * @see #getObjectDiagram()
	 * @generated
	 */
	EReference getObjectDiagram_Stackframes();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.ObjectDiagram.ObjectDiagram#getYammModelPath <em>Yamm Model Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Yamm Model Path</em>'.
	 * @see online.yamm.ObjectDiagram.ObjectDiagram#getYammModelPath()
	 * @see #getObjectDiagram()
	 * @generated
	 */
	EAttribute getObjectDiagram_YammModelPath();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.ObjectDiagram.ObjectDiagram#getMetaDataPackage <em>Meta Data Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Meta Data Package</em>'.
	 * @see online.yamm.ObjectDiagram.ObjectDiagram#getMetaDataPackage()
	 * @see #getObjectDiagram()
	 * @generated
	 */
	EReference getObjectDiagram_MetaDataPackage();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.ObjectDiagram.ObjectDiagram#getTypeObjectCreate <em>Type Object Create</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Object Create</em>'.
	 * @see online.yamm.ObjectDiagram.ObjectDiagram#getTypeObjectCreate()
	 * @see #getObjectDiagram()
	 * @generated
	 */
	EReference getObjectDiagram_TypeObjectCreate();

	/**
	 * Returns the meta object for the containment reference list '{@link online.yamm.ObjectDiagram.ObjectDiagram#getInitialModel <em>Initial Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Initial Model</em>'.
	 * @see online.yamm.ObjectDiagram.ObjectDiagram#getInitialModel()
	 * @see #getObjectDiagram()
	 * @generated
	 */
	EReference getObjectDiagram_InitialModel();

	/**
	 * Returns the meta object for class '{@link online.yamm.ObjectDiagram.ODObject <em>OD Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OD Object</em>'.
	 * @see online.yamm.ObjectDiagram.ODObject
	 * @generated
	 */
	EClass getODObject();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.ObjectDiagram.ODObject#getObjectID <em>Object ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object ID</em>'.
	 * @see online.yamm.ObjectDiagram.ODObject#getObjectID()
	 * @see #getODObject()
	 * @generated
	 */
	EAttribute getODObject_ObjectID();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.ObjectDiagram.ODObject#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see online.yamm.ObjectDiagram.ODObject#getType()
	 * @see #getODObject()
	 * @generated
	 */
	EReference getODObject_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link online.yamm.ObjectDiagram.ODObject#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>References</em>'.
	 * @see online.yamm.ObjectDiagram.ODObject#getReferences()
	 * @see #getODObject()
	 * @generated
	 */
	EReference getODObject_References();

	/**
	 * Returns the meta object for the containment reference list '{@link online.yamm.ObjectDiagram.ODObject#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see online.yamm.ObjectDiagram.ODObject#getAttributes()
	 * @see #getODObject()
	 * @generated
	 */
	EReference getODObject_Attributes();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.ObjectDiagram.ODObject#getRuntimeObject <em>Runtime Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Runtime Object</em>'.
	 * @see online.yamm.ObjectDiagram.ODObject#getRuntimeObject()
	 * @see #getODObject()
	 * @generated
	 */
	EReference getODObject_RuntimeObject();

	/**
	 * Returns the meta object for class '{@link online.yamm.ObjectDiagram.ODType <em>OD Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OD Type</em>'.
	 * @see online.yamm.ObjectDiagram.ODType
	 * @generated
	 */
	EClass getODType();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.ObjectDiagram.ODType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see online.yamm.ObjectDiagram.ODType#getName()
	 * @see #getODType()
	 * @generated
	 */
	EAttribute getODType_Name();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.ObjectDiagram.ODType#getQualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Name</em>'.
	 * @see online.yamm.ObjectDiagram.ODType#getQualifiedName()
	 * @see #getODType()
	 * @generated
	 */
	EAttribute getODType_QualifiedName();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.ObjectDiagram.ODType#getRuntimeType <em>Runtime Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Runtime Type</em>'.
	 * @see online.yamm.ObjectDiagram.ODType#getRuntimeType()
	 * @see #getODType()
	 * @generated
	 */
	EReference getODType_RuntimeType();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.ObjectDiagram.ODType#getYammType <em>Yamm Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Yamm Type</em>'.
	 * @see online.yamm.ObjectDiagram.ODType#getYammType()
	 * @see #getODType()
	 * @generated
	 */
	EReference getODType_YammType();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.ObjectDiagram.ODType#getObjectID <em>Object ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object ID</em>'.
	 * @see online.yamm.ObjectDiagram.ODType#getObjectID()
	 * @see #getODType()
	 * @generated
	 */
	EAttribute getODType_ObjectID();

	/**
	 * Returns the meta object for class '{@link online.yamm.ObjectDiagram.ODReference <em>OD Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OD Reference</em>'.
	 * @see online.yamm.ObjectDiagram.ODReference
	 * @generated
	 */
	EClass getODReference();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.ObjectDiagram.ODReference#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see online.yamm.ObjectDiagram.ODReference#getName()
	 * @see #getODReference()
	 * @generated
	 */
	EAttribute getODReference_Name();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.ObjectDiagram.ODReference#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see online.yamm.ObjectDiagram.ODReference#getType()
	 * @see #getODReference()
	 * @generated
	 */
	EReference getODReference_Type();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.ObjectDiagram.ODReference#isContainment <em>Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Containment</em>'.
	 * @see online.yamm.ObjectDiagram.ODReference#isContainment()
	 * @see #getODReference()
	 * @generated
	 */
	EAttribute getODReference_Containment();

	/**
	 * Returns the meta object for the reference list '{@link online.yamm.ObjectDiagram.ODReference#getOpposites <em>Opposites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Opposites</em>'.
	 * @see online.yamm.ObjectDiagram.ODReference#getOpposites()
	 * @see #getODReference()
	 * @generated
	 */
	EReference getODReference_Opposites();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.ObjectDiagram.ODReference#getLower <em>Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower</em>'.
	 * @see online.yamm.ObjectDiagram.ODReference#getLower()
	 * @see #getODReference()
	 * @generated
	 */
	EAttribute getODReference_Lower();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.ObjectDiagram.ODReference#getUpper <em>Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper</em>'.
	 * @see online.yamm.ObjectDiagram.ODReference#getUpper()
	 * @see #getODReference()
	 * @generated
	 */
	EAttribute getODReference_Upper();

	/**
	 * Returns the meta object for the reference list '{@link online.yamm.ObjectDiagram.ODReference#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Value</em>'.
	 * @see online.yamm.ObjectDiagram.ODReference#getValue()
	 * @see #getODReference()
	 * @generated
	 */
	EReference getODReference_Value();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.ObjectDiagram.ODReference#isBidirectional <em>Bidirectional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bidirectional</em>'.
	 * @see online.yamm.ObjectDiagram.ODReference#isBidirectional()
	 * @see #getODReference()
	 * @generated
	 */
	EAttribute getODReference_Bidirectional();

	/**
	 * Returns the meta object for class '{@link online.yamm.ObjectDiagram.ODDateType <em>OD Date Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OD Date Type</em>'.
	 * @see online.yamm.ObjectDiagram.ODDateType
	 * @generated
	 */
	EClass getODDateType();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.ObjectDiagram.ODDateType#isEnum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enum</em>'.
	 * @see online.yamm.ObjectDiagram.ODDateType#isEnum()
	 * @see #getODDateType()
	 * @generated
	 */
	EAttribute getODDateType_Enum();

	/**
	 * Returns the meta object for class '{@link online.yamm.ObjectDiagram.ODAttribute <em>OD Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OD Attribute</em>'.
	 * @see online.yamm.ObjectDiagram.ODAttribute
	 * @generated
	 */
	EClass getODAttribute();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.ObjectDiagram.ODAttribute#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Type</em>'.
	 * @see online.yamm.ObjectDiagram.ODAttribute#getDataType()
	 * @see #getODAttribute()
	 * @generated
	 */
	EReference getODAttribute_DataType();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.ObjectDiagram.ODAttribute#getLower <em>Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower</em>'.
	 * @see online.yamm.ObjectDiagram.ODAttribute#getLower()
	 * @see #getODAttribute()
	 * @generated
	 */
	EAttribute getODAttribute_Lower();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.ObjectDiagram.ODAttribute#getUpper <em>Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper</em>'.
	 * @see online.yamm.ObjectDiagram.ODAttribute#getUpper()
	 * @see #getODAttribute()
	 * @generated
	 */
	EAttribute getODAttribute_Upper();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.ObjectDiagram.ODAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see online.yamm.ObjectDiagram.ODAttribute#getName()
	 * @see #getODAttribute()
	 * @generated
	 */
	EAttribute getODAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.ObjectDiagram.ODAttribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see online.yamm.ObjectDiagram.ODAttribute#getValue()
	 * @see #getODAttribute()
	 * @generated
	 */
	EAttribute getODAttribute_Value();

	/**
	 * Returns the meta object for class '{@link online.yamm.ObjectDiagram.ODStackframe <em>OD Stackframe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OD Stackframe</em>'.
	 * @see online.yamm.ObjectDiagram.ODStackframe
	 * @generated
	 */
	EClass getODStackframe();

	/**
	 * Returns the meta object for the containment reference list '{@link online.yamm.ObjectDiagram.ODStackframe#getParameterPrimitive <em>Parameter Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Primitive</em>'.
	 * @see online.yamm.ObjectDiagram.ODStackframe#getParameterPrimitive()
	 * @see #getODStackframe()
	 * @generated
	 */
	EReference getODStackframe_ParameterPrimitive();

	/**
	 * Returns the meta object for the containment reference list '{@link online.yamm.ObjectDiagram.ODStackframe#getParametersObjects <em>Parameters Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters Objects</em>'.
	 * @see online.yamm.ObjectDiagram.ODStackframe#getParametersObjects()
	 * @see #getODStackframe()
	 * @generated
	 */
	EReference getODStackframe_ParametersObjects();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.ObjectDiagram.ODStackframe#getContainingObject <em>Containing Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Containing Object</em>'.
	 * @see online.yamm.ObjectDiagram.ODStackframe#getContainingObject()
	 * @see #getODStackframe()
	 * @generated
	 */
	EReference getODStackframe_ContainingObject();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.ObjectDiagram.ODStackframe#getOperationName <em>Operation Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation Name</em>'.
	 * @see online.yamm.ObjectDiagram.ODStackframe#getOperationName()
	 * @see #getODStackframe()
	 * @generated
	 */
	EAttribute getODStackframe_OperationName();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>EString To OD Type Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EString To OD Type Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="online.yamm.ObjectDiagram.ODType" valueContainment="true"
	 * @generated
	 */
	EClass getEStringToODTypeMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getEStringToODTypeMap()
	 * @generated
	 */
	EAttribute getEStringToODTypeMap_Key();

	/**
	 * Returns the meta object for the containment reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getEStringToODTypeMap()
	 * @generated
	 */
	EReference getEStringToODTypeMap_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ObjectDiagramFactory getObjectDiagramFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link online.yamm.ObjectDiagram.impl.ObjectDiagramImpl <em>Object Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.ObjectDiagram.impl.ObjectDiagramImpl
		 * @see online.yamm.ObjectDiagram.impl.ObjectDiagramPackageImpl#getObjectDiagram()
		 * @generated
		 */
		EClass OBJECT_DIAGRAM = eINSTANCE.getObjectDiagram();

		/**
		 * The meta object literal for the '<em><b>Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_DIAGRAM__OBJECTS = eINSTANCE.getObjectDiagram_Objects();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_DIAGRAM__TYPES = eINSTANCE.getObjectDiagram_Types();

		/**
		 * The meta object literal for the '<em><b>Data Types</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_DIAGRAM__DATA_TYPES = eINSTANCE.getObjectDiagram_DataTypes();

		/**
		 * The meta object literal for the '<em><b>Stackframes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_DIAGRAM__STACKFRAMES = eINSTANCE.getObjectDiagram_Stackframes();

		/**
		 * The meta object literal for the '<em><b>Yamm Model Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_DIAGRAM__YAMM_MODEL_PATH = eINSTANCE.getObjectDiagram_YammModelPath();

		/**
		 * The meta object literal for the '<em><b>Meta Data Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_DIAGRAM__META_DATA_PACKAGE = eINSTANCE.getObjectDiagram_MetaDataPackage();

		/**
		 * The meta object literal for the '<em><b>Type Object Create</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_DIAGRAM__TYPE_OBJECT_CREATE = eINSTANCE.getObjectDiagram_TypeObjectCreate();

		/**
		 * The meta object literal for the '<em><b>Initial Model</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_DIAGRAM__INITIAL_MODEL = eINSTANCE.getObjectDiagram_InitialModel();

		/**
		 * The meta object literal for the '{@link online.yamm.ObjectDiagram.impl.ODObjectImpl <em>OD Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.ObjectDiagram.impl.ODObjectImpl
		 * @see online.yamm.ObjectDiagram.impl.ObjectDiagramPackageImpl#getODObject()
		 * @generated
		 */
		EClass OD_OBJECT = eINSTANCE.getODObject();

		/**
		 * The meta object literal for the '<em><b>Object ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OD_OBJECT__OBJECT_ID = eINSTANCE.getODObject_ObjectID();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OD_OBJECT__TYPE = eINSTANCE.getODObject_Type();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OD_OBJECT__REFERENCES = eINSTANCE.getODObject_References();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OD_OBJECT__ATTRIBUTES = eINSTANCE.getODObject_Attributes();

		/**
		 * The meta object literal for the '<em><b>Runtime Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OD_OBJECT__RUNTIME_OBJECT = eINSTANCE.getODObject_RuntimeObject();

		/**
		 * The meta object literal for the '{@link online.yamm.ObjectDiagram.impl.ODTypeImpl <em>OD Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.ObjectDiagram.impl.ODTypeImpl
		 * @see online.yamm.ObjectDiagram.impl.ObjectDiagramPackageImpl#getODType()
		 * @generated
		 */
		EClass OD_TYPE = eINSTANCE.getODType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OD_TYPE__NAME = eINSTANCE.getODType_Name();

		/**
		 * The meta object literal for the '<em><b>Qualified Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OD_TYPE__QUALIFIED_NAME = eINSTANCE.getODType_QualifiedName();

		/**
		 * The meta object literal for the '<em><b>Runtime Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OD_TYPE__RUNTIME_TYPE = eINSTANCE.getODType_RuntimeType();

		/**
		 * The meta object literal for the '<em><b>Yamm Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OD_TYPE__YAMM_TYPE = eINSTANCE.getODType_YammType();

		/**
		 * The meta object literal for the '<em><b>Object ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OD_TYPE__OBJECT_ID = eINSTANCE.getODType_ObjectID();

		/**
		 * The meta object literal for the '{@link online.yamm.ObjectDiagram.impl.ODReferenceImpl <em>OD Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.ObjectDiagram.impl.ODReferenceImpl
		 * @see online.yamm.ObjectDiagram.impl.ObjectDiagramPackageImpl#getODReference()
		 * @generated
		 */
		EClass OD_REFERENCE = eINSTANCE.getODReference();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OD_REFERENCE__NAME = eINSTANCE.getODReference_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OD_REFERENCE__TYPE = eINSTANCE.getODReference_Type();

		/**
		 * The meta object literal for the '<em><b>Containment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OD_REFERENCE__CONTAINMENT = eINSTANCE.getODReference_Containment();

		/**
		 * The meta object literal for the '<em><b>Opposites</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OD_REFERENCE__OPPOSITES = eINSTANCE.getODReference_Opposites();

		/**
		 * The meta object literal for the '<em><b>Lower</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OD_REFERENCE__LOWER = eINSTANCE.getODReference_Lower();

		/**
		 * The meta object literal for the '<em><b>Upper</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OD_REFERENCE__UPPER = eINSTANCE.getODReference_Upper();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OD_REFERENCE__VALUE = eINSTANCE.getODReference_Value();

		/**
		 * The meta object literal for the '<em><b>Bidirectional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OD_REFERENCE__BIDIRECTIONAL = eINSTANCE.getODReference_Bidirectional();

		/**
		 * The meta object literal for the '{@link online.yamm.ObjectDiagram.impl.ODDateTypeImpl <em>OD Date Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.ObjectDiagram.impl.ODDateTypeImpl
		 * @see online.yamm.ObjectDiagram.impl.ObjectDiagramPackageImpl#getODDateType()
		 * @generated
		 */
		EClass OD_DATE_TYPE = eINSTANCE.getODDateType();

		/**
		 * The meta object literal for the '<em><b>Enum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OD_DATE_TYPE__ENUM = eINSTANCE.getODDateType_Enum();

		/**
		 * The meta object literal for the '{@link online.yamm.ObjectDiagram.impl.ODAttributeImpl <em>OD Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.ObjectDiagram.impl.ODAttributeImpl
		 * @see online.yamm.ObjectDiagram.impl.ObjectDiagramPackageImpl#getODAttribute()
		 * @generated
		 */
		EClass OD_ATTRIBUTE = eINSTANCE.getODAttribute();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OD_ATTRIBUTE__DATA_TYPE = eINSTANCE.getODAttribute_DataType();

		/**
		 * The meta object literal for the '<em><b>Lower</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OD_ATTRIBUTE__LOWER = eINSTANCE.getODAttribute_Lower();

		/**
		 * The meta object literal for the '<em><b>Upper</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OD_ATTRIBUTE__UPPER = eINSTANCE.getODAttribute_Upper();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OD_ATTRIBUTE__NAME = eINSTANCE.getODAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OD_ATTRIBUTE__VALUE = eINSTANCE.getODAttribute_Value();

		/**
		 * The meta object literal for the '{@link online.yamm.ObjectDiagram.impl.ODStackframeImpl <em>OD Stackframe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.ObjectDiagram.impl.ODStackframeImpl
		 * @see online.yamm.ObjectDiagram.impl.ObjectDiagramPackageImpl#getODStackframe()
		 * @generated
		 */
		EClass OD_STACKFRAME = eINSTANCE.getODStackframe();

		/**
		 * The meta object literal for the '<em><b>Parameter Primitive</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OD_STACKFRAME__PARAMETER_PRIMITIVE = eINSTANCE.getODStackframe_ParameterPrimitive();

		/**
		 * The meta object literal for the '<em><b>Parameters Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OD_STACKFRAME__PARAMETERS_OBJECTS = eINSTANCE.getODStackframe_ParametersObjects();

		/**
		 * The meta object literal for the '<em><b>Containing Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OD_STACKFRAME__CONTAINING_OBJECT = eINSTANCE.getODStackframe_ContainingObject();

		/**
		 * The meta object literal for the '<em><b>Operation Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OD_STACKFRAME__OPERATION_NAME = eINSTANCE.getODStackframe_OperationName();

		/**
		 * The meta object literal for the '{@link online.yamm.ObjectDiagram.impl.EStringToODTypeMapImpl <em>EString To OD Type Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.ObjectDiagram.impl.EStringToODTypeMapImpl
		 * @see online.yamm.ObjectDiagram.impl.ObjectDiagramPackageImpl#getEStringToODTypeMap()
		 * @generated
		 */
		EClass ESTRING_TO_OD_TYPE_MAP = eINSTANCE.getEStringToODTypeMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTRING_TO_OD_TYPE_MAP__KEY = eINSTANCE.getEStringToODTypeMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESTRING_TO_OD_TYPE_MAP__VALUE = eINSTANCE.getEStringToODTypeMap_Value();

	}

} //ObjectDiagramPackage
