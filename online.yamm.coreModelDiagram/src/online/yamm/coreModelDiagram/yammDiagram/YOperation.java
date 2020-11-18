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
package online.yamm.coreModelDiagram.yammDiagram;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YOperation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.YOperation#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.YOperation#getOwnedParameter <em>Owned Parameter</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.YOperation#getStateMachine <em>State Machine</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.YOperation#getClazz <em>Clazz</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.YOperation#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.YOperation#getLower <em>Lower</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.YOperation#getUpper <em>Upper</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.YOperation#getSignature <em>Signature</em>}</li>
 * </ul>
 *
 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYOperation()
 * @model
 * @generated
 */
public interface YOperation extends YElement, YNamedElement, YFeature, YNamespace, YObject
{
	/**
	 * Returns the value of the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualified Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualified Name</em>' attribute.
	 * @see #setQualifiedName(String)
	 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYOperation_QualifiedName()
	 * @model
	 * @generated
	 */
	String getQualifiedName();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelDiagram.yammDiagram.YOperation#getQualifiedName <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualified Name</em>' attribute.
	 * @see #getQualifiedName()
	 * @generated
	 */
	void setQualifiedName(String value);

	/**
	 * Returns the value of the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link online.yamm.coreModelDiagram.yammDiagram.YParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Parameter</em>' containment reference list.
	 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYOperation_OwnedParameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<YParameter> getOwnedParameter();

	/**
	 * Returns the value of the '<em><b>State Machine</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link online.yamm.coreModelDiagram.yammDiagram.YStateMachine#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Machine</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Machine</em>' containment reference.
	 * @see #setStateMachine(YStateMachine)
	 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYOperation_StateMachine()
	 * @see online.yamm.coreModelDiagram.yammDiagram.YStateMachine#getOperation
	 * @model opposite="operation" containment="true"
	 * @generated
	 */
	YStateMachine getStateMachine();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelDiagram.yammDiagram.YOperation#getStateMachine <em>State Machine</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Machine</em>' containment reference.
	 * @see #getStateMachine()
	 * @generated
	 */
	void setStateMachine(YStateMachine value);

	/**
	 * Returns the value of the '<em><b>Clazz</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clazz</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clazz</em>' reference.
	 * @see #setClazz(YClass)
	 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYOperation_Clazz()
	 * @model
	 * @generated
	 */
	YClass getClazz();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelDiagram.yammDiagram.YOperation#getClazz <em>Clazz</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clazz</em>' reference.
	 * @see #getClazz()
	 * @generated
	 */
	void setClazz(YClass value);

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' reference.
	 * @see #setReturnType(YType)
	 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYOperation_ReturnType()
	 * @model
	 * @generated
	 */
	YType getReturnType();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelDiagram.yammDiagram.YOperation#getReturnType <em>Return Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(YType value);

	/**
	 * Returns the value of the '<em><b>Lower</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower</em>' attribute.
	 * @see #setLower(int)
	 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYOperation_Lower()
	 * @model default="0"
	 * @generated
	 */
	int getLower();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelDiagram.yammDiagram.YOperation#getLower <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower</em>' attribute.
	 * @see #getLower()
	 * @generated
	 */
	void setLower(int value);

	/**
	 * Returns the value of the '<em><b>Upper</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper</em>' attribute.
	 * @see #setUpper(int)
	 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYOperation_Upper()
	 * @model default="1"
	 * @generated
	 */
	int getUpper();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelDiagram.yammDiagram.YOperation#getUpper <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper</em>' attribute.
	 * @see #getUpper()
	 * @generated
	 */
	void setUpper(int value);

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature</em>' attribute.
	 * @see #setSignature(String)
	 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYOperation_Signature()
	 * @model transient="true"
	 * @generated
	 */
	String getSignature();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelDiagram.yammDiagram.YOperation#getSignature <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' attribute.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(String value);

} // YOperation
