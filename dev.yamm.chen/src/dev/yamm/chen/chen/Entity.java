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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dev.yamm.chen.chen.Entity#getName <em>Name</em>}</li>
 *   <li>{@link dev.yamm.chen.chen.Entity#isWeakEntityType <em>Weak Entity Type</em>}</li>
 *   <li>{@link dev.yamm.chen.chen.Entity#getConnectionsToRelations <em>Connections To Relations</em>}</li>
 *   <li>{@link dev.yamm.chen.chen.Entity#getConnectionsToAttributes <em>Connections To Attributes</em>}</li>
 * </ul>
 *
 * @see dev.yamm.chen.chen.ChenPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends EObject {
	/**
	 * Returns the value of the '<em><b>Connections To Relations</b></em>' reference list.
	 * The list contents are of type {@link dev.yamm.chen.chen.Connection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connections To Relations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections To Relations</em>' reference list.
	 * @see dev.yamm.chen.chen.ChenPackage#getEntity_ConnectionsToRelations()
	 * @model
	 * @generated
	 */
	EList<Connection> getConnectionsToRelations();

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
	 * @see dev.yamm.chen.chen.ChenPackage#getEntity_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dev.yamm.chen.chen.Entity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Weak Entity Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weak Entity Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weak Entity Type</em>' attribute.
	 * @see #setWeakEntityType(boolean)
	 * @see dev.yamm.chen.chen.ChenPackage#getEntity_WeakEntityType()
	 * @model
	 * @generated
	 */
	boolean isWeakEntityType();

	/**
	 * Sets the value of the '{@link dev.yamm.chen.chen.Entity#isWeakEntityType <em>Weak Entity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weak Entity Type</em>' attribute.
	 * @see #isWeakEntityType()
	 * @generated
	 */
	void setWeakEntityType(boolean value);

	/**
	 * Returns the value of the '<em><b>Connections To Attributes</b></em>' reference list.
	 * The list contents are of type {@link dev.yamm.chen.chen.Connection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connections To Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections To Attributes</em>' reference list.
	 * @see dev.yamm.chen.chen.ChenPackage#getEntity_ConnectionsToAttributes()
	 * @model
	 * @generated
	 */
	EList<Connection> getConnectionsToAttributes();

} // Entity
