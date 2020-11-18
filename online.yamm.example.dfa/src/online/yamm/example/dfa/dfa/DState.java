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
package online.yamm.example.dfa.dfa;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DState</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link online.yamm.example.dfa.dfa.DState#getStateName <em>State Name</em>}</li>
 *   <li>{@link online.yamm.example.dfa.dfa.DState#getDIn <em>DIn</em>}</li>
 *   <li>{@link online.yamm.example.dfa.dfa.DState#getDOut <em>DOut</em>}</li>
 * </ul>
 *
 * @see online.yamm.example.dfa.dfa.DfaPackage#getDState()
 * @model
 * @generated
 */
public interface DState extends RObject {
	/**
	 * Returns the value of the '<em><b>State Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Name</em>' attribute.
	 * @see #setStateName(String)
	 * @see online.yamm.example.dfa.dfa.DfaPackage#getDState_StateName()
	 * @model
	 * @generated
	 */
	String getStateName();

	/**
	 * Sets the value of the '{@link online.yamm.example.dfa.dfa.DState#getStateName <em>State Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Name</em>' attribute.
	 * @see #getStateName()
	 * @generated
	 */
	void setStateName(String value);

	/**
	 * Returns the value of the '<em><b>DIn</b></em>' reference list.
	 * The list contents are of type {@link online.yamm.example.dfa.dfa.DTransition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DIn</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DIn</em>' reference list.
	 * @see online.yamm.example.dfa.dfa.DfaPackage#getDState_DIn()
	 * @model
	 * @generated
	 */
	EList<DTransition> getDIn();

	/**
	 * Returns the value of the '<em><b>DOut</b></em>' reference list.
	 * The list contents are of type {@link online.yamm.example.dfa.dfa.DTransition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DOut</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DOut</em>' reference list.
	 * @see online.yamm.example.dfa.dfa.DfaPackage#getDState_DOut()
	 * @model
	 * @generated
	 */
	EList<DTransition> getDOut();

} // DState
