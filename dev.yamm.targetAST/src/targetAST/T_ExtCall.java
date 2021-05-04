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
package targetAST;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TExt Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targetAST.T_ExtCall#getArguments <em>Arguments</em>}</li>
 *   <li>{@link targetAST.T_ExtCall#getMethodName <em>Method Name</em>}</li>
 *   <li>{@link targetAST.T_ExtCall#getStringLiteral <em>String Literal</em>}</li>
 *   <li>{@link targetAST.T_ExtCall#getTypeArguments <em>Type Arguments</em>}</li>
 * </ul>
 *
 * @see targetAST.TargetASTPackage#getT_ExtCall()
 * @model
 * @generated
 */
public interface T_ExtCall extends T_ExpLevelB {
	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link targetAST.T_ExpLevelA}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see targetAST.TargetASTPackage#getT_ExtCall_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<T_ExpLevelA> getArguments();

	/**
	 * Returns the value of the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Name</em>' attribute.
	 * @see #setMethodName(String)
	 * @see targetAST.TargetASTPackage#getT_ExtCall_MethodName()
	 * @model required="true"
	 * @generated
	 */
	String getMethodName();

	/**
	 * Sets the value of the '{@link targetAST.T_ExtCall#getMethodName <em>Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Name</em>' attribute.
	 * @see #getMethodName()
	 * @generated
	 */
	void setMethodName(String value);

	/**
	 * Returns the value of the '<em><b>String Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String Literal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Literal</em>' attribute.
	 * @see #setStringLiteral(String)
	 * @see targetAST.TargetASTPackage#getT_ExtCall_StringLiteral()
	 * @model
	 * @generated
	 */
	String getStringLiteral();

	/**
	 * Sets the value of the '{@link targetAST.T_ExtCall#getStringLiteral <em>String Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String Literal</em>' attribute.
	 * @see #getStringLiteral()
	 * @generated
	 */
	void setStringLiteral(String value);

	/**
	 * Returns the value of the '<em><b>Type Arguments</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Arguments</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Arguments</em>' attribute list.
	 * @see targetAST.TargetASTPackage#getT_ExtCall_TypeArguments()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	EList<String> getTypeArguments();

} // T_ExtCall
