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
 * Copyright [yyyy] [name of copyright owner]
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
 * see LICENSE
 */
package targetAST;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TGet Enum Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targetAST.T_GetEnumLiteral#getQualifiedEnumName <em>Qualified Enum Name</em>}</li>
 *   <li>{@link targetAST.T_GetEnumLiteral#getLiteralName <em>Literal Name</em>}</li>
 * </ul>
 *
 * @see targetAST.TargetASTPackage#getT_GetEnumLiteral()
 * @model
 * @generated
 */
public interface T_GetEnumLiteral extends T_ExpLevelA
{
	/**
	 * Returns the value of the '<em><b>Qualified Enum Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualified Enum Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualified Enum Name</em>' attribute.
	 * @see #setQualifiedEnumName(String)
	 * @see targetAST.TargetASTPackage#getT_GetEnumLiteral_QualifiedEnumName()
	 * @model
	 * @generated
	 */
	String getQualifiedEnumName();

	/**
	 * Sets the value of the '{@link targetAST.T_GetEnumLiteral#getQualifiedEnumName <em>Qualified Enum Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualified Enum Name</em>' attribute.
	 * @see #getQualifiedEnumName()
	 * @generated
	 */
	void setQualifiedEnumName(String value);

	/**
	 * Returns the value of the '<em><b>Literal Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literal Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal Name</em>' attribute.
	 * @see #setLiteralName(String)
	 * @see targetAST.TargetASTPackage#getT_GetEnumLiteral_LiteralName()
	 * @model
	 * @generated
	 */
	String getLiteralName();

	/**
	 * Sets the value of the '{@link targetAST.T_GetEnumLiteral#getLiteralName <em>Literal Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Literal Name</em>' attribute.
	 * @see #getLiteralName()
	 * @generated
	 */
	void setLiteralName(String value);

} // T_GetEnumLiteral
