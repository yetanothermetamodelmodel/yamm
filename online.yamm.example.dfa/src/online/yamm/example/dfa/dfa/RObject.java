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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RObject</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link online.yamm.example.dfa.dfa.RObject#getObjectID <em>Object ID</em>}</li>
 * </ul>
 *
 * @see online.yamm.example.dfa.dfa.DfaPackage#getRObject()
 * @model
 * @generated
 */
public interface RObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Object ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object ID</em>' attribute.
	 * @see #isSetObjectID()
	 * @see #unsetObjectID()
	 * @see #setObjectID(String)
	 * @see online.yamm.example.dfa.dfa.DfaPackage#getRObject_ObjectID()
	 * @model unsettable="true" id="true"
	 * @generated
	 */
	String getObjectID();

	/**
	 * Sets the value of the '{@link online.yamm.example.dfa.dfa.RObject#getObjectID <em>Object ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object ID</em>' attribute.
	 * @see #isSetObjectID()
	 * @see #unsetObjectID()
	 * @see #getObjectID()
	 * @generated
	 */
	void setObjectID(String value);

	/**
	 * Unsets the value of the '{@link online.yamm.example.dfa.dfa.RObject#getObjectID <em>Object ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetObjectID()
	 * @see #getObjectID()
	 * @see #setObjectID(String)
	 * @generated
	 */
	void unsetObjectID();

	/**
	 * Returns whether the value of the '{@link online.yamm.example.dfa.dfa.RObject#getObjectID <em>Object ID</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Object ID</em>' attribute is set.
	 * @see #unsetObjectID()
	 * @see #getObjectID()
	 * @see #setObjectID(String)
	 * @generated
	 */
	boolean isSetObjectID();

} // RObject
