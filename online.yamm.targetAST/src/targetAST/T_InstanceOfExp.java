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
 * A representation of the model object '<em><b>TInstance Of Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targetAST.T_InstanceOfExp#getExpression <em>Expression</em>}</li>
 *   <li>{@link targetAST.T_InstanceOfExp#isTypeIsExternal <em>Type Is External</em>}</li>
 *   <li>{@link targetAST.T_InstanceOfExp#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see targetAST.TargetASTPackage#getT_InstanceOfExp()
 * @model
 * @generated
 */
public interface T_InstanceOfExp extends T_ExpLevelA {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(T_ExpLevelA)
	 * @see targetAST.TargetASTPackage#getT_InstanceOfExp_Expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	T_ExpLevelA getExpression();

	/**
	 * Sets the value of the '{@link targetAST.T_InstanceOfExp#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(T_ExpLevelA value);

	/**
	 * Returns the value of the '<em><b>Type Is External</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Is External</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Is External</em>' attribute.
	 * @see #setTypeIsExternal(boolean)
	 * @see targetAST.TargetASTPackage#getT_InstanceOfExp_TypeIsExternal()
	 * @model
	 * @generated
	 */
	boolean isTypeIsExternal();

	/**
	 * Sets the value of the '{@link targetAST.T_InstanceOfExp#isTypeIsExternal <em>Type Is External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Is External</em>' attribute.
	 * @see #isTypeIsExternal()
	 * @generated
	 */
	void setTypeIsExternal(boolean value);

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
	 * @see targetAST.TargetASTPackage#getT_InstanceOfExp_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link targetAST.T_InstanceOfExp#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // T_InstanceOfExp
