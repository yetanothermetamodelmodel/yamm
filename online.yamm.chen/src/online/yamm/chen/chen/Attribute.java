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
package online.yamm.chen.chen;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link online.yamm.chen.chen.Attribute#getName <em>Name</em>}</li>
 *   <li>{@link online.yamm.chen.chen.Attribute#getType <em>Type</em>}</li>
 *   <li>{@link online.yamm.chen.chen.Attribute#isDerived <em>Derived</em>}</li>
 *   <li>{@link online.yamm.chen.chen.Attribute#isMultivalued <em>Multivalued</em>}</li>
 *   <li>{@link online.yamm.chen.chen.Attribute#getKey <em>Key</em>}</li>
 *   <li>{@link online.yamm.chen.chen.Attribute#getConnectionsToSubAttributes <em>Connections To Sub Attributes</em>}</li>
 *   <li>{@link online.yamm.chen.chen.Attribute#getConnectionsToRelationOrEntity <em>Connections To Relation Or Entity</em>}</li>
 * </ul>
 *
 * @see online.yamm.chen.chen.ChenPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derived</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derived</em>' attribute.
	 * @see #setDerived(boolean)
	 * @see online.yamm.chen.chen.ChenPackage#getAttribute_Derived()
	 * @model
	 * @generated
	 */
	boolean isDerived();

	/**
	 * Sets the value of the '{@link online.yamm.chen.chen.Attribute#isDerived <em>Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derived</em>' attribute.
	 * @see #isDerived()
	 * @generated
	 */
	void setDerived(boolean value);

	/**
	 * Returns the value of the '<em><b>Multivalued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multivalued</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multivalued</em>' attribute.
	 * @see #setMultivalued(boolean)
	 * @see online.yamm.chen.chen.ChenPackage#getAttribute_Multivalued()
	 * @model
	 * @generated
	 */
	boolean isMultivalued();

	/**
	 * Sets the value of the '{@link online.yamm.chen.chen.Attribute#isMultivalued <em>Multivalued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multivalued</em>' attribute.
	 * @see #isMultivalued()
	 * @generated
	 */
	void setMultivalued(boolean value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see online.yamm.chen.chen.ChenPackage#getAttribute_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link online.yamm.chen.chen.Attribute#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see online.yamm.chen.chen.ChenPackage#getAttribute_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link online.yamm.chen.chen.Attribute#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * The literals are from the enumeration {@link online.yamm.chen.chen.Key}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see online.yamm.chen.chen.Key
	 * @see #setKey(Key)
	 * @see online.yamm.chen.chen.ChenPackage#getAttribute_Key()
	 * @model
	 * @generated
	 */
	Key getKey();

	/**
	 * Sets the value of the '{@link online.yamm.chen.chen.Attribute#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see online.yamm.chen.chen.Key
	 * @see #getKey()
	 * @generated
	 */
	void setKey(Key value);

	/**
	 * Returns the value of the '<em><b>Connections To Sub Attributes</b></em>' reference list.
	 * The list contents are of type {@link online.yamm.chen.chen.Connection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connections To Sub Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections To Sub Attributes</em>' reference list.
	 * @see online.yamm.chen.chen.ChenPackage#getAttribute_ConnectionsToSubAttributes()
	 * @model
	 * @generated
	 */
	EList<Connection> getConnectionsToSubAttributes();

	/**
	 * Returns the value of the '<em><b>Connections To Relation Or Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connections To Relation Or Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections To Relation Or Entity</em>' reference.
	 * @see #setConnectionsToRelationOrEntity(Connection)
	 * @see online.yamm.chen.chen.ChenPackage#getAttribute_ConnectionsToRelationOrEntity()
	 * @model
	 * @generated
	 */
	Connection getConnectionsToRelationOrEntity();

	/**
	 * Sets the value of the '{@link online.yamm.chen.chen.Attribute#getConnectionsToRelationOrEntity <em>Connections To Relation Or Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connections To Relation Or Entity</em>' reference.
	 * @see #getConnectionsToRelationOrEntity()
	 * @generated
	 */
	void setConnectionsToRelationOrEntity(Connection value);

} // Attribute
