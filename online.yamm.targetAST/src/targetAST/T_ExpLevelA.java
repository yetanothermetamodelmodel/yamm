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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TExp Level A</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targetAST.T_ExpLevelA#getCastTo <em>Cast To</em>}</li>
 *   <li>{@link targetAST.T_ExpLevelA#getCastToPrimitiveMethodCall <em>Cast To Primitive Method Call</em>}</li>
 *   <li>{@link targetAST.T_ExpLevelA#isCastToPrimitive <em>Cast To Primitive</em>}</li>
 *   <li>{@link targetAST.T_ExpLevelA#getObject <em>Object</em>}</li>
 *   <li>{@link targetAST.T_ExpLevelA#getPrimitiveToWrapper <em>Primitive To Wrapper</em>}</li>
 *   <li>{@link targetAST.T_ExpLevelA#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @see targetAST.TargetASTPackage#getT_ExpLevelA()
 * @model abstract="true"
 * @generated
 */
public interface T_ExpLevelA extends EObject {
	/**
	 * Returns the value of the '<em><b>Cast To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cast To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cast To</em>' attribute.
	 * @see #setCastTo(String)
	 * @see targetAST.TargetASTPackage#getT_ExpLevelA_CastTo()
	 * @model
	 * @generated
	 */
	String getCastTo();

	/**
	 * Sets the value of the '{@link targetAST.T_ExpLevelA#getCastTo <em>Cast To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cast To</em>' attribute.
	 * @see #getCastTo()
	 * @generated
	 */
	void setCastTo(String value);

	/**
	 * Returns the value of the '<em><b>Cast To Primitive Method Call</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cast To Primitive Method Call</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cast To Primitive Method Call</em>' attribute.
	 * @see #setCastToPrimitiveMethodCall(String)
	 * @see targetAST.TargetASTPackage#getT_ExpLevelA_CastToPrimitiveMethodCall()
	 * @model
	 * @generated
	 */
	String getCastToPrimitiveMethodCall();

	/**
	 * Sets the value of the '{@link targetAST.T_ExpLevelA#getCastToPrimitiveMethodCall <em>Cast To Primitive Method Call</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cast To Primitive Method Call</em>' attribute.
	 * @see #getCastToPrimitiveMethodCall()
	 * @generated
	 */
	void setCastToPrimitiveMethodCall(String value);

	/**
	 * Returns the value of the '<em><b>Cast To Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cast To Primitive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cast To Primitive</em>' attribute.
	 * @see #setCastToPrimitive(boolean)
	 * @see targetAST.TargetASTPackage#getT_ExpLevelA_CastToPrimitive()
	 * @model
	 * @generated
	 */
	boolean isCastToPrimitive();

	/**
	 * Sets the value of the '{@link targetAST.T_ExpLevelA#isCastToPrimitive <em>Cast To Primitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cast To Primitive</em>' attribute.
	 * @see #isCastToPrimitive()
	 * @generated
	 */
	void setCastToPrimitive(boolean value);

	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' containment reference.
	 * @see #setObject(T_ExpLevelA)
	 * @see targetAST.TargetASTPackage#getT_ExpLevelA_Object()
	 * @model containment="true"
	 * @generated
	 */
	T_ExpLevelA getObject();

	/**
	 * Sets the value of the '{@link targetAST.T_ExpLevelA#getObject <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' containment reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(T_ExpLevelA value);

	/**
	 * Returns the value of the '<em><b>Primitive To Wrapper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primitive To Wrapper</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitive To Wrapper</em>' attribute.
	 * @see #setPrimitiveToWrapper(String)
	 * @see targetAST.TargetASTPackage#getT_ExpLevelA_PrimitiveToWrapper()
	 * @model
	 * @generated
	 */
	String getPrimitiveToWrapper();

	/**
	 * Sets the value of the '{@link targetAST.T_ExpLevelA#getPrimitiveToWrapper <em>Primitive To Wrapper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primitive To Wrapper</em>' attribute.
	 * @see #getPrimitiveToWrapper()
	 * @generated
	 */
	void setPrimitiveToWrapper(String value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see targetAST.TargetASTPackage#getT_ExpLevelA_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link targetAST.T_ExpLevelA#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

} // T_ExpLevelA
