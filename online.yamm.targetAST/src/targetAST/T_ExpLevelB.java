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
package targetAST;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TExp Level B</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targetAST.T_ExpLevelB#getTypeObject <em>Type Object</em>}</li>
 * </ul>
 *
 * @see targetAST.TargetASTPackage#getT_ExpLevelB()
 * @model abstract="true"
 * @generated
 */
public interface T_ExpLevelB extends T_ExpLevelA {
	/**
	 * Returns the value of the '<em><b>Type Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Object</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Object</em>' attribute.
	 * @see #setTypeObject(String)
	 * @see targetAST.TargetASTPackage#getT_ExpLevelB_TypeObject()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getTypeObject();

	/**
	 * Sets the value of the '{@link targetAST.T_ExpLevelB#getTypeObject <em>Type Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Object</em>' attribute.
	 * @see #getTypeObject()
	 * @generated
	 */
	void setTypeObject(String value);

} // T_ExpLevelB
