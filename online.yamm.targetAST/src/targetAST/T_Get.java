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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TGet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targetAST.T_Get#getFeatures <em>Features</em>}</li>
 *   <li>{@link targetAST.T_Get#isObjectIsParam <em>Object Is Param</em>}</li>
 *   <li>{@link targetAST.T_Get#getPostfix <em>Postfix</em>}</li>
 * </ul>
 *
 * @see targetAST.TargetASTPackage#getT_Get()
 * @model
 * @generated
 */
public interface T_Get extends T_ExpLevelB {
	/**
	 * Returns the value of the '<em><b>Features</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' attribute list.
	 * @see targetAST.TargetASTPackage#getT_Get_Features()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	EList<String> getFeatures();

	/**
	 * Returns the value of the '<em><b>Object Is Param</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Is Param</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Is Param</em>' attribute.
	 * @see #setObjectIsParam(boolean)
	 * @see targetAST.TargetASTPackage#getT_Get_ObjectIsParam()
	 * @model
	 * @generated
	 */
	boolean isObjectIsParam();

	/**
	 * Sets the value of the '{@link targetAST.T_Get#isObjectIsParam <em>Object Is Param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Is Param</em>' attribute.
	 * @see #isObjectIsParam()
	 * @generated
	 */
	void setObjectIsParam(boolean value);

	/**
	 * Returns the value of the '<em><b>Postfix</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postfix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postfix</em>' attribute.
	 * @see #setPostfix(String)
	 * @see targetAST.TargetASTPackage#getT_Get_Postfix()
	 * @model default=""
	 * @generated
	 */
	String getPostfix();

	/**
	 * Sets the value of the '{@link targetAST.T_Get#getPostfix <em>Postfix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postfix</em>' attribute.
	 * @see #getPostfix()
	 * @generated
	 */
	void setPostfix(String value);

} // T_Get
