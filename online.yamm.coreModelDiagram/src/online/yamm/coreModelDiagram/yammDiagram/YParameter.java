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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YParameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.YParameter#isIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.YParameter#isIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.YParameter#getLower <em>Lower</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.YParameter#getUpper <em>Upper</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.YParameter#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.YParameter#getDirection <em>Direction</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.YParameter#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.YParameter#getDescription <em>Description</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.YParameter#getType <em>Type</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.YParameter#getSignature <em>Signature</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.YParameter#isUpperboundWildcard <em>Upperbound Wildcard</em>}</li>
 * </ul>
 *
 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYParameter()
 * @model
 * @generated
 */
public interface YParameter extends YElement, YNamedElement, YObject
{
	/**
	 * Returns the value of the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Ordered</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Ordered</em>' attribute.
	 * @see #setIsOrdered(boolean)
	 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYParameter_IsOrdered()
	 * @model
	 * @generated
	 */
	boolean isIsOrdered();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelDiagram.yammDiagram.YParameter#isIsOrdered <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Ordered</em>' attribute.
	 * @see #isIsOrdered()
	 * @generated
	 */
	void setIsOrdered(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Unique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Unique</em>' attribute.
	 * @see #setIsUnique(boolean)
	 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYParameter_IsUnique()
	 * @model
	 * @generated
	 */
	boolean isIsUnique();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelDiagram.yammDiagram.YParameter#isIsUnique <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Unique</em>' attribute.
	 * @see #isIsUnique()
	 * @generated
	 */
	void setIsUnique(boolean value);

	/**
	 * Returns the value of the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower</em>' attribute.
	 * @see #setLower(int)
	 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYParameter_Lower()
	 * @model
	 * @generated
	 */
	int getLower();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelDiagram.yammDiagram.YParameter#getLower <em>Lower</em>}' attribute.
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
	 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYParameter_Upper()
	 * @model default="1"
	 * @generated
	 */
	int getUpper();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelDiagram.yammDiagram.YParameter#getUpper <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper</em>' attribute.
	 * @see #getUpper()
	 * @generated
	 */
	void setUpper(int value);

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
	 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYParameter_QualifiedName()
	 * @model
	 * @generated
	 */
	String getQualifiedName();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelDiagram.yammDiagram.YParameter#getQualifiedName <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualified Name</em>' attribute.
	 * @see #getQualifiedName()
	 * @generated
	 */
	void setQualifiedName(String value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link online.yamm.coreModelDiagram.yammDiagram.YParameterDirectionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see online.yamm.coreModelDiagram.yammDiagram.YParameterDirectionKind
	 * @see #setDirection(YParameterDirectionKind)
	 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYParameter_Direction()
	 * @model
	 * @generated
	 */
	YParameterDirectionKind getDirection();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelDiagram.yammDiagram.YParameter#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see online.yamm.coreModelDiagram.yammDiagram.YParameterDirectionKind
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(YParameterDirectionKind value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(String)
	 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYParameter_DefaultValue()
	 * @model
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelDiagram.yammDiagram.YParameter#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYParameter_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelDiagram.yammDiagram.YParameter#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(YType)
	 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYParameter_Type()
	 * @model
	 * @generated
	 */
	YType getType();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelDiagram.yammDiagram.YParameter#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(YType value);

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
	 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYParameter_Signature()
	 * @model transient="true"
	 * @generated
	 */
	String getSignature();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelDiagram.yammDiagram.YParameter#getSignature <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' attribute.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(String value);

	/**
	 * Returns the value of the '<em><b>Upperbound Wildcard</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upperbound Wildcard</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upperbound Wildcard</em>' attribute.
	 * @see #setUpperboundWildcard(boolean)
	 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYParameter_UpperboundWildcard()
	 * @model default="false"
	 * @generated
	 */
	boolean isUpperboundWildcard();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelDiagram.yammDiagram.YParameter#isUpperboundWildcard <em>Upperbound Wildcard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upperbound Wildcard</em>' attribute.
	 * @see #isUpperboundWildcard()
	 * @generated
	 */
	void setUpperboundWildcard(boolean value);

} // YParameter
