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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dev.yamm.chen.chen.Connection#getRole <em>Role</em>}</li>
 *   <li>{@link dev.yamm.chen.chen.Connection#getKardinality <em>Kardinality</em>}</li>
 *   <li>{@link dev.yamm.chen.chen.Connection#isTotalPartizipation <em>Total Partizipation</em>}</li>
 *   <li>{@link dev.yamm.chen.chen.Connection#getSource <em>Source</em>}</li>
 *   <li>{@link dev.yamm.chen.chen.Connection#getTarget <em>Target</em>}</li>
 *   <li>{@link dev.yamm.chen.chen.Connection#isGeneralizationConnection <em>Generalization Connection</em>}</li>
 *   <li>{@link dev.yamm.chen.chen.Connection#isGeneralization <em>Generalization</em>}</li>
 *   <li>{@link dev.yamm.chen.chen.Connection#isGeneralizationOrientation <em>Generalization Orientation</em>}</li>
 * </ul>
 *
 * @see dev.yamm.chen.chen.ChenPackage#getConnection()
 * @model
 * @generated
 */
public interface Connection extends EObject {
	/**
	 * Returns the value of the '<em><b>Total Partizipation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Partizipation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Partizipation</em>' attribute.
	 * @see #setTotalPartizipation(boolean)
	 * @see dev.yamm.chen.chen.ChenPackage#getConnection_TotalPartizipation()
	 * @model
	 * @generated
	 */
	boolean isTotalPartizipation();

	/**
	 * Sets the value of the '{@link dev.yamm.chen.chen.Connection#isTotalPartizipation <em>Total Partizipation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Partizipation</em>' attribute.
	 * @see #isTotalPartizipation()
	 * @generated
	 */
	void setTotalPartizipation(boolean value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(String)
	 * @see dev.yamm.chen.chen.ChenPackage#getConnection_Role()
	 * @model
	 * @generated
	 */
	String getRole();

	/**
	 * Sets the value of the '{@link dev.yamm.chen.chen.Connection#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(EObject)
	 * @see dev.yamm.chen.chen.ChenPackage#getConnection_Source()
	 * @model
	 * @generated
	 */
	EObject getSource();

	/**
	 * Sets the value of the '{@link dev.yamm.chen.chen.Connection#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(EObject value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(EObject)
	 * @see dev.yamm.chen.chen.ChenPackage#getConnection_Target()
	 * @model
	 * @generated
	 */
	EObject getTarget();

	/**
	 * Sets the value of the '{@link dev.yamm.chen.chen.Connection#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(EObject value);

	/**
	 * Returns the value of the '<em><b>Kardinality</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kardinality</em>' attribute.
	 * @see #setKardinality(String)
	 * @see dev.yamm.chen.chen.ChenPackage#getConnection_Kardinality()
	 * @model default="1"
	 * @generated
	 */
	String getKardinality();

	/**
	 * Sets the value of the '{@link dev.yamm.chen.chen.Connection#getKardinality <em>Kardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kardinality</em>' attribute.
	 * @see #getKardinality()
	 * @generated
	 */
	void setKardinality(String value);

	/**
	 * Returns the value of the '<em><b>Generalization Connection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generalization Connection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generalization Connection</em>' attribute.
	 * @see #setGeneralizationConnection(boolean)
	 * @see dev.yamm.chen.chen.ChenPackage#getConnection_GeneralizationConnection()
	 * @model
	 * @generated
	 */
	boolean isGeneralizationConnection();

	/**
	 * Sets the value of the '{@link dev.yamm.chen.chen.Connection#isGeneralizationConnection <em>Generalization Connection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generalization Connection</em>' attribute.
	 * @see #isGeneralizationConnection()
	 * @generated
	 */
	void setGeneralizationConnection(boolean value);

	/**
	 * Returns the value of the '<em><b>Generalization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generalization</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generalization</em>' attribute.
	 * @see #setGeneralization(boolean)
	 * @see dev.yamm.chen.chen.ChenPackage#getConnection_Generalization()
	 * @model
	 * @generated
	 */
	boolean isGeneralization();

	/**
	 * Sets the value of the '{@link dev.yamm.chen.chen.Connection#isGeneralization <em>Generalization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generalization</em>' attribute.
	 * @see #isGeneralization()
	 * @generated
	 */
	void setGeneralization(boolean value);

	/**
	 * Returns the value of the '<em><b>Generalization Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generalization Orientation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generalization Orientation</em>' attribute.
	 * @see #setGeneralizationOrientation(boolean)
	 * @see dev.yamm.chen.chen.ChenPackage#getConnection_GeneralizationOrientation()
	 * @model
	 * @generated
	 */
	boolean isGeneralizationOrientation();

	/**
	 * Sets the value of the '{@link dev.yamm.chen.chen.Connection#isGeneralizationOrientation <em>Generalization Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generalization Orientation</em>' attribute.
	 * @see #isGeneralizationOrientation()
	 * @generated
	 */
	void setGeneralizationOrientation(boolean value);

} // Connection
