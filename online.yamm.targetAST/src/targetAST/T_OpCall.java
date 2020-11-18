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
 * A representation of the model object '<em><b>TOp Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targetAST.T_OpCall#getVarNamesForReturn <em>Var Names For Return</em>}</li>
 *   <li>{@link targetAST.T_OpCall#getOperationName <em>Operation Name</em>}</li>
 *   <li>{@link targetAST.T_OpCall#getArguments <em>Arguments</em>}</li>
 *   <li>{@link targetAST.T_OpCall#isHasINOUT <em>Has INOUT</em>}</li>
 *   <li>{@link targetAST.T_OpCall#getLastFeaturesName <em>Last Features Name</em>}</li>
 *   <li>{@link targetAST.T_OpCall#getPostfix <em>Postfix</em>}</li>
 *   <li>{@link targetAST.T_OpCall#getIsINOUT <em>Is INOUT</em>}</li>
 *   <li>{@link targetAST.T_OpCall#isParam <em>Param</em>}</li>
 *   <li>{@link targetAST.T_OpCall#getTypeForMultiInheritance <em>Type For Multi Inheritance</em>}</li>
 *   <li>{@link targetAST.T_OpCall#getQualifiedNameOperation <em>Qualified Name Operation</em>}</li>
 * </ul>
 *
 * @see targetAST.TargetASTPackage#getT_OpCall()
 * @model
 * @generated
 */
public interface T_OpCall extends T_ExpLevelA {
	/**
	 * Returns the value of the '<em><b>Var Names For Return</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Var Names For Return</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Names For Return</em>' attribute.
	 * @see #setVarNamesForReturn(String)
	 * @see targetAST.TargetASTPackage#getT_OpCall_VarNamesForReturn()
	 * @model
	 * @generated
	 */
	String getVarNamesForReturn();

	/**
	 * Sets the value of the '{@link targetAST.T_OpCall#getVarNamesForReturn <em>Var Names For Return</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var Names For Return</em>' attribute.
	 * @see #getVarNamesForReturn()
	 * @generated
	 */
	void setVarNamesForReturn(String value);

	/**
	 * Returns the value of the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Name</em>' attribute.
	 * @see #setOperationName(String)
	 * @see targetAST.TargetASTPackage#getT_OpCall_OperationName()
	 * @model
	 * @generated
	 */
	String getOperationName();

	/**
	 * Sets the value of the '{@link targetAST.T_OpCall#getOperationName <em>Operation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Name</em>' attribute.
	 * @see #getOperationName()
	 * @generated
	 */
	void setOperationName(String value);

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
	 * @see targetAST.TargetASTPackage#getT_OpCall_Arguments()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<T_ExpLevelA> getArguments();

	/**
	 * Returns the value of the '<em><b>Has INOUT</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has INOUT</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has INOUT</em>' attribute.
	 * @see #setHasINOUT(boolean)
	 * @see targetAST.TargetASTPackage#getT_OpCall_HasINOUT()
	 * @model default="false"
	 * @generated
	 */
	boolean isHasINOUT();

	/**
	 * Sets the value of the '{@link targetAST.T_OpCall#isHasINOUT <em>Has INOUT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has INOUT</em>' attribute.
	 * @see #isHasINOUT()
	 * @generated
	 */
	void setHasINOUT(boolean value);

	/**
	 * Returns the value of the '<em><b>Last Features Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Features Name</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Features Name</em>' attribute list.
	 * @see targetAST.TargetASTPackage#getT_OpCall_LastFeaturesName()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	EList<String> getLastFeaturesName();

	/**
	 * Returns the value of the '<em><b>Postfix</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postfix</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postfix</em>' attribute list.
	 * @see targetAST.TargetASTPackage#getT_OpCall_Postfix()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	EList<String> getPostfix();

	/**
	 * Returns the value of the '<em><b>Is INOUT</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is INOUT</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is INOUT</em>' attribute list.
	 * @see targetAST.TargetASTPackage#getT_OpCall_IsINOUT()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	EList<Boolean> getIsINOUT();

	/**
	 * Returns the value of the '<em><b>Param</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param</em>' attribute.
	 * @see #setParam(boolean)
	 * @see targetAST.TargetASTPackage#getT_OpCall_Param()
	 * @model default="false"
	 * @generated
	 */
	boolean isParam();

	/**
	 * Sets the value of the '{@link targetAST.T_OpCall#isParam <em>Param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param</em>' attribute.
	 * @see #isParam()
	 * @generated
	 */
	void setParam(boolean value);

	/**
	 * Returns the value of the '<em><b>Type For Multi Inheritance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type For Multi Inheritance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type For Multi Inheritance</em>' attribute.
	 * @see #setTypeForMultiInheritance(String)
	 * @see targetAST.TargetASTPackage#getT_OpCall_TypeForMultiInheritance()
	 * @model
	 * @generated
	 */
	String getTypeForMultiInheritance();

	/**
	 * Sets the value of the '{@link targetAST.T_OpCall#getTypeForMultiInheritance <em>Type For Multi Inheritance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type For Multi Inheritance</em>' attribute.
	 * @see #getTypeForMultiInheritance()
	 * @generated
	 */
	void setTypeForMultiInheritance(String value);

	/**
	 * Returns the value of the '<em><b>Qualified Name Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualified Name Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualified Name Operation</em>' attribute.
	 * @see #setQualifiedNameOperation(String)
	 * @see targetAST.TargetASTPackage#getT_OpCall_QualifiedNameOperation()
	 * @model
	 * @generated
	 */
	String getQualifiedNameOperation();

	/**
	 * Sets the value of the '{@link targetAST.T_OpCall#getQualifiedNameOperation <em>Qualified Name Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualified Name Operation</em>' attribute.
	 * @see #getQualifiedNameOperation()
	 * @generated
	 */
	void setQualifiedNameOperation(String value);

} // T_OpCall
