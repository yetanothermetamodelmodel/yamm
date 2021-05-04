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
package dev.yamm.chen.chen;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see dev.yamm.chen.chen.ChenFactory
 * @model kind="package"
 * @generated
 */
public interface ChenPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "chen";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.yamm.onlne/chen/Chen";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "chen";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ChenPackage eINSTANCE = dev.yamm.chen.chen.impl.ChenPackageImpl.init();

	/**
	 * The meta object id for the '{@link dev.yamm.chen.chen.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dev.yamm.chen.chen.impl.EntityImpl
	 * @see dev.yamm.chen.chen.impl.ChenPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Weak Entity Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__WEAK_ENTITY_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Connections To Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__CONNECTIONS_TO_RELATIONS = 2;

	/**
	 * The feature id for the '<em><b>Connections To Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__CONNECTIONS_TO_ATTRIBUTES = 3;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dev.yamm.chen.chen.impl.RelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dev.yamm.chen.chen.impl.RelationshipImpl
	 * @see dev.yamm.chen.chen.impl.ChenPackageImpl#getRelationship()
	 * @generated
	 */
	int RELATIONSHIP = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Indentifying Relationship</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__INDENTIFYING_RELATIONSHIP = 1;

	/**
	 * The feature id for the '<em><b>Connections To Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__CONNECTIONS_TO_ENTITIES = 2;

	/**
	 * The feature id for the '<em><b>Connections To Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__CONNECTIONS_TO_ATTRIBUTES = 3;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dev.yamm.chen.chen.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dev.yamm.chen.chen.impl.AttributeImpl
	 * @see dev.yamm.chen.chen.impl.ChenPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DERIVED = 2;

	/**
	 * The feature id for the '<em><b>Multivalued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__MULTIVALUED = 3;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__KEY = 4;

	/**
	 * The feature id for the '<em><b>Connections To Sub Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__CONNECTIONS_TO_SUB_ATTRIBUTES = 5;

	/**
	 * The feature id for the '<em><b>Connections To Relation Or Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__CONNECTIONS_TO_RELATION_OR_ENTITY = 6;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dev.yamm.chen.chen.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dev.yamm.chen.chen.impl.ConnectionImpl
	 * @see dev.yamm.chen.chen.impl.ChenPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 3;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__ROLE = 0;

	/**
	 * The feature id for the '<em><b>Kardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__KARDINALITY = 1;

	/**
	 * The feature id for the '<em><b>Total Partizipation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__TOTAL_PARTIZIPATION = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__SOURCE = 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__TARGET = 4;

	/**
	 * The feature id for the '<em><b>Generalization Connection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__GENERALIZATION_CONNECTION = 5;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__GENERALIZATION = 6;

	/**
	 * The feature id for the '<em><b>Generalization Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__GENERALIZATION_ORIENTATION = 7;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dev.yamm.chen.chen.impl.ChenImpl <em>Chen</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dev.yamm.chen.chen.impl.ChenImpl
	 * @see dev.yamm.chen.chen.impl.ChenPackageImpl#getChen()
	 * @generated
	 */
	int CHEN = 4;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEN__ENTITIES = 0;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEN__CONNECTIONS = 1;

	/**
	 * The feature id for the '<em><b>Realtionships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEN__REALTIONSHIPS = 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEN__ATTRIBUTES = 3;

	/**
	 * The feature id for the '<em><b>Generalizations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEN__GENERALIZATIONS = 4;

	/**
	 * The number of structural features of the '<em>Chen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEN_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Chen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEN_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link dev.yamm.chen.chen.impl.GeneralizationImpl <em>Generalization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dev.yamm.chen.chen.impl.GeneralizationImpl
	 * @see dev.yamm.chen.chen.impl.ChenPackageImpl#getGeneralization()
	 * @generated
	 */
	int GENERALIZATION = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Generalization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Generalization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dev.yamm.chen.chen.Key <em>Key</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dev.yamm.chen.chen.Key
	 * @see dev.yamm.chen.chen.impl.ChenPackageImpl#getKey()
	 * @generated
	 */
	int KEY = 6;


	/**
	 * The meta object id for the '{@link dev.yamm.chen.chen.Type <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dev.yamm.chen.chen.Type
	 * @see dev.yamm.chen.chen.impl.ChenPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 7;


	/**
	 * Returns the meta object for class '{@link dev.yamm.chen.chen.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see dev.yamm.chen.chen.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the reference list '{@link dev.yamm.chen.chen.Entity#getConnectionsToRelations <em>Connections To Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connections To Relations</em>'.
	 * @see dev.yamm.chen.chen.Entity#getConnectionsToRelations()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_ConnectionsToRelations();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.chen.chen.Entity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dev.yamm.chen.chen.Entity#getName()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Name();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.chen.chen.Entity#isWeakEntityType <em>Weak Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weak Entity Type</em>'.
	 * @see dev.yamm.chen.chen.Entity#isWeakEntityType()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_WeakEntityType();

	/**
	 * Returns the meta object for the reference list '{@link dev.yamm.chen.chen.Entity#getConnectionsToAttributes <em>Connections To Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connections To Attributes</em>'.
	 * @see dev.yamm.chen.chen.Entity#getConnectionsToAttributes()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_ConnectionsToAttributes();

	/**
	 * Returns the meta object for class '{@link dev.yamm.chen.chen.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see dev.yamm.chen.chen.Relationship
	 * @generated
	 */
	EClass getRelationship();

	/**
	 * Returns the meta object for the reference list '{@link dev.yamm.chen.chen.Relationship#getConnectionsToEntities <em>Connections To Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connections To Entities</em>'.
	 * @see dev.yamm.chen.chen.Relationship#getConnectionsToEntities()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_ConnectionsToEntities();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.chen.chen.Relationship#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dev.yamm.chen.chen.Relationship#getName()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_Name();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.chen.chen.Relationship#isIndentifyingRelationship <em>Indentifying Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indentifying Relationship</em>'.
	 * @see dev.yamm.chen.chen.Relationship#isIndentifyingRelationship()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_IndentifyingRelationship();

	/**
	 * Returns the meta object for the reference list '{@link dev.yamm.chen.chen.Relationship#getConnectionsToAttributes <em>Connections To Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connections To Attributes</em>'.
	 * @see dev.yamm.chen.chen.Relationship#getConnectionsToAttributes()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_ConnectionsToAttributes();

	/**
	 * Returns the meta object for class '{@link dev.yamm.chen.chen.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see dev.yamm.chen.chen.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.chen.chen.Attribute#isDerived <em>Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Derived</em>'.
	 * @see dev.yamm.chen.chen.Attribute#isDerived()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Derived();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.chen.chen.Attribute#isMultivalued <em>Multivalued</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multivalued</em>'.
	 * @see dev.yamm.chen.chen.Attribute#isMultivalued()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Multivalued();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.chen.chen.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dev.yamm.chen.chen.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.chen.chen.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see dev.yamm.chen.chen.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Type();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.chen.chen.Attribute#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see dev.yamm.chen.chen.Attribute#getKey()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Key();

	/**
	 * Returns the meta object for the reference list '{@link dev.yamm.chen.chen.Attribute#getConnectionsToSubAttributes <em>Connections To Sub Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connections To Sub Attributes</em>'.
	 * @see dev.yamm.chen.chen.Attribute#getConnectionsToSubAttributes()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_ConnectionsToSubAttributes();

	/**
	 * Returns the meta object for the reference '{@link dev.yamm.chen.chen.Attribute#getConnectionsToRelationOrEntity <em>Connections To Relation Or Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connections To Relation Or Entity</em>'.
	 * @see dev.yamm.chen.chen.Attribute#getConnectionsToRelationOrEntity()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_ConnectionsToRelationOrEntity();

	/**
	 * Returns the meta object for class '{@link dev.yamm.chen.chen.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see dev.yamm.chen.chen.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.chen.chen.Connection#isTotalPartizipation <em>Total Partizipation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Partizipation</em>'.
	 * @see dev.yamm.chen.chen.Connection#isTotalPartizipation()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_TotalPartizipation();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.chen.chen.Connection#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see dev.yamm.chen.chen.Connection#getRole()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Role();

	/**
	 * Returns the meta object for the reference '{@link dev.yamm.chen.chen.Connection#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see dev.yamm.chen.chen.Connection#getSource()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Source();

	/**
	 * Returns the meta object for the reference '{@link dev.yamm.chen.chen.Connection#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see dev.yamm.chen.chen.Connection#getTarget()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Target();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.chen.chen.Connection#getKardinality <em>Kardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kardinality</em>'.
	 * @see dev.yamm.chen.chen.Connection#getKardinality()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Kardinality();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.chen.chen.Connection#isGeneralizationConnection <em>Generalization Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generalization Connection</em>'.
	 * @see dev.yamm.chen.chen.Connection#isGeneralizationConnection()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_GeneralizationConnection();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.chen.chen.Connection#isGeneralization <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generalization</em>'.
	 * @see dev.yamm.chen.chen.Connection#isGeneralization()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Generalization();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.chen.chen.Connection#isGeneralizationOrientation <em>Generalization Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generalization Orientation</em>'.
	 * @see dev.yamm.chen.chen.Connection#isGeneralizationOrientation()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_GeneralizationOrientation();

	/**
	 * Returns the meta object for class '{@link dev.yamm.chen.chen.Chen <em>Chen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chen</em>'.
	 * @see dev.yamm.chen.chen.Chen
	 * @generated
	 */
	EClass getChen();

	/**
	 * Returns the meta object for the containment reference list '{@link dev.yamm.chen.chen.Chen#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entities</em>'.
	 * @see dev.yamm.chen.chen.Chen#getEntities()
	 * @see #getChen()
	 * @generated
	 */
	EReference getChen_Entities();

	/**
	 * Returns the meta object for the containment reference list '{@link dev.yamm.chen.chen.Chen#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connections</em>'.
	 * @see dev.yamm.chen.chen.Chen#getConnections()
	 * @see #getChen()
	 * @generated
	 */
	EReference getChen_Connections();

	/**
	 * Returns the meta object for the containment reference list '{@link dev.yamm.chen.chen.Chen#getRealtionships <em>Realtionships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realtionships</em>'.
	 * @see dev.yamm.chen.chen.Chen#getRealtionships()
	 * @see #getChen()
	 * @generated
	 */
	EReference getChen_Realtionships();

	/**
	 * Returns the meta object for the containment reference list '{@link dev.yamm.chen.chen.Chen#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see dev.yamm.chen.chen.Chen#getAttributes()
	 * @see #getChen()
	 * @generated
	 */
	EReference getChen_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link dev.yamm.chen.chen.Chen#getGeneralizations <em>Generalizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generalizations</em>'.
	 * @see dev.yamm.chen.chen.Chen#getGeneralizations()
	 * @see #getChen()
	 * @generated
	 */
	EReference getChen_Generalizations();

	/**
	 * Returns the meta object for class '{@link dev.yamm.chen.chen.Generalization <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generalization</em>'.
	 * @see dev.yamm.chen.chen.Generalization
	 * @generated
	 */
	EClass getGeneralization();

	/**
	 * Returns the meta object for the attribute '{@link dev.yamm.chen.chen.Generalization#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see dev.yamm.chen.chen.Generalization#getType()
	 * @see #getGeneralization()
	 * @generated
	 */
	EAttribute getGeneralization_Type();

	/**
	 * Returns the meta object for enum '{@link dev.yamm.chen.chen.Key <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Key</em>'.
	 * @see dev.yamm.chen.chen.Key
	 * @generated
	 */
	EEnum getKey();

	/**
	 * Returns the meta object for enum '{@link dev.yamm.chen.chen.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see dev.yamm.chen.chen.Type
	 * @generated
	 */
	EEnum getType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ChenFactory getChenFactory();

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
		 * The meta object literal for the '{@link dev.yamm.chen.chen.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dev.yamm.chen.chen.impl.EntityImpl
		 * @see dev.yamm.chen.chen.impl.ChenPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Connections To Relations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__CONNECTIONS_TO_RELATIONS = eINSTANCE.getEntity_ConnectionsToRelations();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

		/**
		 * The meta object literal for the '<em><b>Weak Entity Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__WEAK_ENTITY_TYPE = eINSTANCE.getEntity_WeakEntityType();

		/**
		 * The meta object literal for the '<em><b>Connections To Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__CONNECTIONS_TO_ATTRIBUTES = eINSTANCE.getEntity_ConnectionsToAttributes();

		/**
		 * The meta object literal for the '{@link dev.yamm.chen.chen.impl.RelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dev.yamm.chen.chen.impl.RelationshipImpl
		 * @see dev.yamm.chen.chen.impl.ChenPackageImpl#getRelationship()
		 * @generated
		 */
		EClass RELATIONSHIP = eINSTANCE.getRelationship();

		/**
		 * The meta object literal for the '<em><b>Connections To Entities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__CONNECTIONS_TO_ENTITIES = eINSTANCE.getRelationship_ConnectionsToEntities();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__NAME = eINSTANCE.getRelationship_Name();

		/**
		 * The meta object literal for the '<em><b>Indentifying Relationship</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__INDENTIFYING_RELATIONSHIP = eINSTANCE.getRelationship_IndentifyingRelationship();

		/**
		 * The meta object literal for the '<em><b>Connections To Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__CONNECTIONS_TO_ATTRIBUTES = eINSTANCE.getRelationship_ConnectionsToAttributes();

		/**
		 * The meta object literal for the '{@link dev.yamm.chen.chen.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dev.yamm.chen.chen.impl.AttributeImpl
		 * @see dev.yamm.chen.chen.impl.ChenPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Derived</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__DERIVED = eINSTANCE.getAttribute_Derived();

		/**
		 * The meta object literal for the '<em><b>Multivalued</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__MULTIVALUED = eINSTANCE.getAttribute_Multivalued();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__KEY = eINSTANCE.getAttribute_Key();

		/**
		 * The meta object literal for the '<em><b>Connections To Sub Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__CONNECTIONS_TO_SUB_ATTRIBUTES = eINSTANCE.getAttribute_ConnectionsToSubAttributes();

		/**
		 * The meta object literal for the '<em><b>Connections To Relation Or Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__CONNECTIONS_TO_RELATION_OR_ENTITY = eINSTANCE.getAttribute_ConnectionsToRelationOrEntity();

		/**
		 * The meta object literal for the '{@link dev.yamm.chen.chen.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dev.yamm.chen.chen.impl.ConnectionImpl
		 * @see dev.yamm.chen.chen.impl.ChenPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Total Partizipation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__TOTAL_PARTIZIPATION = eINSTANCE.getConnection_TotalPartizipation();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__ROLE = eINSTANCE.getConnection_Role();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__SOURCE = eINSTANCE.getConnection_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__TARGET = eINSTANCE.getConnection_Target();

		/**
		 * The meta object literal for the '<em><b>Kardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__KARDINALITY = eINSTANCE.getConnection_Kardinality();

		/**
		 * The meta object literal for the '<em><b>Generalization Connection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__GENERALIZATION_CONNECTION = eINSTANCE.getConnection_GeneralizationConnection();

		/**
		 * The meta object literal for the '<em><b>Generalization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__GENERALIZATION = eINSTANCE.getConnection_Generalization();

		/**
		 * The meta object literal for the '<em><b>Generalization Orientation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__GENERALIZATION_ORIENTATION = eINSTANCE.getConnection_GeneralizationOrientation();

		/**
		 * The meta object literal for the '{@link dev.yamm.chen.chen.impl.ChenImpl <em>Chen</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dev.yamm.chen.chen.impl.ChenImpl
		 * @see dev.yamm.chen.chen.impl.ChenPackageImpl#getChen()
		 * @generated
		 */
		EClass CHEN = eINSTANCE.getChen();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHEN__ENTITIES = eINSTANCE.getChen_Entities();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHEN__CONNECTIONS = eINSTANCE.getChen_Connections();

		/**
		 * The meta object literal for the '<em><b>Realtionships</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHEN__REALTIONSHIPS = eINSTANCE.getChen_Realtionships();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHEN__ATTRIBUTES = eINSTANCE.getChen_Attributes();

		/**
		 * The meta object literal for the '<em><b>Generalizations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHEN__GENERALIZATIONS = eINSTANCE.getChen_Generalizations();

		/**
		 * The meta object literal for the '{@link dev.yamm.chen.chen.impl.GeneralizationImpl <em>Generalization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dev.yamm.chen.chen.impl.GeneralizationImpl
		 * @see dev.yamm.chen.chen.impl.ChenPackageImpl#getGeneralization()
		 * @generated
		 */
		EClass GENERALIZATION = eINSTANCE.getGeneralization();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERALIZATION__TYPE = eINSTANCE.getGeneralization_Type();

		/**
		 * The meta object literal for the '{@link dev.yamm.chen.chen.Key <em>Key</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dev.yamm.chen.chen.Key
		 * @see dev.yamm.chen.chen.impl.ChenPackageImpl#getKey()
		 * @generated
		 */
		EEnum KEY = eINSTANCE.getKey();

		/**
		 * The meta object literal for the '{@link dev.yamm.chen.chen.Type <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dev.yamm.chen.chen.Type
		 * @see dev.yamm.chen.chen.impl.ChenPackageImpl#getType()
		 * @generated
		 */
		EEnum TYPE = eINSTANCE.getType();

	}

} //ChenPackage
