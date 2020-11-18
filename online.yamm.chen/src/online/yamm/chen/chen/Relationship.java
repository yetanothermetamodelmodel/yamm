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
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link online.yamm.chen.chen.Relationship#getName <em>Name</em>}</li>
 *   <li>{@link online.yamm.chen.chen.Relationship#isIndentifyingRelationship <em>Indentifying Relationship</em>}</li>
 *   <li>{@link online.yamm.chen.chen.Relationship#getConnectionsToEntities <em>Connections To Entities</em>}</li>
 *   <li>{@link online.yamm.chen.chen.Relationship#getConnectionsToAttributes <em>Connections To Attributes</em>}</li>
 * </ul>
 *
 * @see online.yamm.chen.chen.ChenPackage#getRelationship()
 * @model
 * @generated
 */
public interface Relationship extends EObject {
	/**
	 * Returns the value of the '<em><b>Connections To Entities</b></em>' reference list.
	 * The list contents are of type {@link online.yamm.chen.chen.Connection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connections To Entities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections To Entities</em>' reference list.
	 * @see online.yamm.chen.chen.ChenPackage#getRelationship_ConnectionsToEntities()
	 * @model
	 * @generated
	 */
	EList<Connection> getConnectionsToEntities();

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
	 * @see online.yamm.chen.chen.ChenPackage#getRelationship_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link online.yamm.chen.chen.Relationship#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Indentifying Relationship</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indentifying Relationship</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indentifying Relationship</em>' attribute.
	 * @see #setIndentifyingRelationship(boolean)
	 * @see online.yamm.chen.chen.ChenPackage#getRelationship_IndentifyingRelationship()
	 * @model
	 * @generated
	 */
	boolean isIndentifyingRelationship();

	/**
	 * Sets the value of the '{@link online.yamm.chen.chen.Relationship#isIndentifyingRelationship <em>Indentifying Relationship</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indentifying Relationship</em>' attribute.
	 * @see #isIndentifyingRelationship()
	 * @generated
	 */
	void setIndentifyingRelationship(boolean value);

	/**
	 * Returns the value of the '<em><b>Connections To Attributes</b></em>' reference list.
	 * The list contents are of type {@link online.yamm.chen.chen.Connection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connections To Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections To Attributes</em>' reference list.
	 * @see online.yamm.chen.chen.ChenPackage#getRelationship_ConnectionsToAttributes()
	 * @model
	 * @generated
	 */
	EList<Connection> getConnectionsToAttributes();

} // Relationship
