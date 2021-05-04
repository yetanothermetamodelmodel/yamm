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
package dev.yamm.example.dfa.dfa;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DTransition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dev.yamm.example.dfa.dfa.DTransition#getDTarget <em>DTarget</em>}</li>
 *   <li>{@link dev.yamm.example.dfa.dfa.DTransition#getDSource <em>DSource</em>}</li>
 *   <li>{@link dev.yamm.example.dfa.dfa.DTransition#getTransitionName <em>Transition Name</em>}</li>
 * </ul>
 *
 * @see dev.yamm.example.dfa.dfa.DfaPackage#getDTransition()
 * @model
 * @generated
 */
public interface DTransition extends RObject {
	/**
	 * Returns the value of the '<em><b>DTarget</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DTarget</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DTarget</em>' reference.
	 * @see #setDTarget(DState)
	 * @see dev.yamm.example.dfa.dfa.DfaPackage#getDTransition_DTarget()
	 * @model required="true"
	 * @generated
	 */
	DState getDTarget();

	/**
	 * Sets the value of the '{@link dev.yamm.example.dfa.dfa.DTransition#getDTarget <em>DTarget</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DTarget</em>' reference.
	 * @see #getDTarget()
	 * @generated
	 */
	void setDTarget(DState value);

	/**
	 * Returns the value of the '<em><b>DSource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DSource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DSource</em>' reference.
	 * @see #setDSource(DState)
	 * @see dev.yamm.example.dfa.dfa.DfaPackage#getDTransition_DSource()
	 * @model required="true"
	 * @generated
	 */
	DState getDSource();

	/**
	 * Sets the value of the '{@link dev.yamm.example.dfa.dfa.DTransition#getDSource <em>DSource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DSource</em>' reference.
	 * @see #getDSource()
	 * @generated
	 */
	void setDSource(DState value);

	/**
	 * Returns the value of the '<em><b>Transition Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition Name</em>' attribute.
	 * @see #setTransitionName(String)
	 * @see dev.yamm.example.dfa.dfa.DfaPackage#getDTransition_TransitionName()
	 * @model
	 * @generated
	 */
	String getTransitionName();

	/**
	 * Sets the value of the '{@link dev.yamm.example.dfa.dfa.DTransition#getTransitionName <em>Transition Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition Name</em>' attribute.
	 * @see #getTransitionName()
	 * @generated
	 */
	void setTransitionName(String value);

} // DTransition
