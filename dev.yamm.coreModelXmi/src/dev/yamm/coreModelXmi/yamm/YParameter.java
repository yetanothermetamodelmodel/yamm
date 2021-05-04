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
 */
package dev.yamm.coreModelXmi.yamm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YParameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YParameter#isIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YParameter#isIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YParameter#getLower <em>Lower</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YParameter#getUpper <em>Upper</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YParameter#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YParameter#getDirection <em>Direction</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YParameter#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YParameter#getDescription <em>Description</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YParameter#getType <em>Type</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YParameter#getSignature <em>Signature</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YParameter#isUpperboundWildcard <em>Upperbound Wildcard</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YParameter#getPosObjectID <em>Pos Object ID</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YParameter#getPosName <em>Pos Name</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YParameter#getPosOrdered <em>Pos Ordered</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YParameter#getPosUnique <em>Pos Unique</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YParameter#getPosLower <em>Pos Lower</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YParameter#getPosUpper <em>Pos Upper</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YParameter#getPosUpperboundWildcard <em>Pos Upperbound Wildcard</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YParameter#getPosDirection <em>Pos Direction</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YParameter#getPosDefaultValue <em>Pos Default Value</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YParameter#getPosType <em>Pos Type</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YParameter#getPosQualifiedName <em>Pos Qualified Name</em>}</li>
 * </ul>
 *
 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYParameter()
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
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYParameter_IsOrdered()
	 * @model
	 * @generated
	 */
	boolean isIsOrdered();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YParameter#isIsOrdered <em>Is Ordered</em>}' attribute.
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
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYParameter_IsUnique()
	 * @model
	 * @generated
	 */
	boolean isIsUnique();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YParameter#isIsUnique <em>Is Unique</em>}' attribute.
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
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYParameter_Lower()
	 * @model
	 * @generated
	 */
	int getLower();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YParameter#getLower <em>Lower</em>}' attribute.
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
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYParameter_Upper()
	 * @model default="1"
	 * @generated
	 */
	int getUpper();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YParameter#getUpper <em>Upper</em>}' attribute.
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
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYParameter_QualifiedName()
	 * @model
	 * @generated
	 */
	String getQualifiedName();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YParameter#getQualifiedName <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualified Name</em>' attribute.
	 * @see #getQualifiedName()
	 * @generated
	 */
	void setQualifiedName(String value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link dev.yamm.coreModelXmi.yamm.YParameterDirectionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see dev.yamm.coreModelXmi.yamm.YParameterDirectionKind
	 * @see #setDirection(YParameterDirectionKind)
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYParameter_Direction()
	 * @model
	 * @generated
	 */
	YParameterDirectionKind getDirection();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YParameter#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see dev.yamm.coreModelXmi.yamm.YParameterDirectionKind
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
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYParameter_DefaultValue()
	 * @model
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YParameter#getDefaultValue <em>Default Value</em>}' attribute.
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
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYParameter_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YParameter#getDescription <em>Description</em>}' attribute.
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
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYParameter_Type()
	 * @model
	 * @generated
	 */
	YType getType();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YParameter#getType <em>Type</em>}' reference.
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
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYParameter_Signature()
	 * @model transient="true"
	 * @generated
	 */
	String getSignature();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YParameter#getSignature <em>Signature</em>}' attribute.
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
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYParameter_UpperboundWildcard()
	 * @model default="false"
	 * @generated
	 */
	boolean isUpperboundWildcard();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YParameter#isUpperboundWildcard <em>Upperbound Wildcard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upperbound Wildcard</em>' attribute.
	 * @see #isUpperboundWildcard()
	 * @generated
	 */
	void setUpperboundWildcard(boolean value);

	/**
	 * Returns the value of the '<em><b>Pos Object ID</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos Object ID</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos Object ID</em>' reference.
	 * @see #setPosObjectID(SingleLinePropertyInfo)
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYParameter_PosObjectID()
	 * @model
	 * @generated
	 */
	SingleLinePropertyInfo getPosObjectID();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YParameter#getPosObjectID <em>Pos Object ID</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos Object ID</em>' reference.
	 * @see #getPosObjectID()
	 * @generated
	 */
	void setPosObjectID(SingleLinePropertyInfo value);

	/**
	 * Returns the value of the '<em><b>Pos Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos Name</em>' reference.
	 * @see #setPosName(SingleLinePropertyInfo)
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYParameter_PosName()
	 * @model
	 * @generated
	 */
	SingleLinePropertyInfo getPosName();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YParameter#getPosName <em>Pos Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos Name</em>' reference.
	 * @see #getPosName()
	 * @generated
	 */
	void setPosName(SingleLinePropertyInfo value);

	/**
	 * Returns the value of the '<em><b>Pos Ordered</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos Ordered</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos Ordered</em>' reference.
	 * @see #setPosOrdered(SingleLinePropertyInfo)
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYParameter_PosOrdered()
	 * @model
	 * @generated
	 */
	SingleLinePropertyInfo getPosOrdered();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YParameter#getPosOrdered <em>Pos Ordered</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos Ordered</em>' reference.
	 * @see #getPosOrdered()
	 * @generated
	 */
	void setPosOrdered(SingleLinePropertyInfo value);

	/**
	 * Returns the value of the '<em><b>Pos Unique</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos Unique</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos Unique</em>' reference.
	 * @see #setPosUnique(SingleLinePropertyInfo)
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYParameter_PosUnique()
	 * @model
	 * @generated
	 */
	SingleLinePropertyInfo getPosUnique();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YParameter#getPosUnique <em>Pos Unique</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos Unique</em>' reference.
	 * @see #getPosUnique()
	 * @generated
	 */
	void setPosUnique(SingleLinePropertyInfo value);

	/**
	 * Returns the value of the '<em><b>Pos Lower</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos Lower</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos Lower</em>' reference.
	 * @see #setPosLower(SingleLinePropertyInfo)
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYParameter_PosLower()
	 * @model
	 * @generated
	 */
	SingleLinePropertyInfo getPosLower();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YParameter#getPosLower <em>Pos Lower</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos Lower</em>' reference.
	 * @see #getPosLower()
	 * @generated
	 */
	void setPosLower(SingleLinePropertyInfo value);

	/**
	 * Returns the value of the '<em><b>Pos Upper</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos Upper</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos Upper</em>' reference.
	 * @see #setPosUpper(SingleLinePropertyInfo)
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYParameter_PosUpper()
	 * @model
	 * @generated
	 */
	SingleLinePropertyInfo getPosUpper();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YParameter#getPosUpper <em>Pos Upper</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos Upper</em>' reference.
	 * @see #getPosUpper()
	 * @generated
	 */
	void setPosUpper(SingleLinePropertyInfo value);

	/**
	 * Returns the value of the '<em><b>Pos Upperbound Wildcard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos Upperbound Wildcard</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos Upperbound Wildcard</em>' reference.
	 * @see #setPosUpperboundWildcard(SingleLinePropertyInfo)
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYParameter_PosUpperboundWildcard()
	 * @model
	 * @generated
	 */
	SingleLinePropertyInfo getPosUpperboundWildcard();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YParameter#getPosUpperboundWildcard <em>Pos Upperbound Wildcard</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos Upperbound Wildcard</em>' reference.
	 * @see #getPosUpperboundWildcard()
	 * @generated
	 */
	void setPosUpperboundWildcard(SingleLinePropertyInfo value);

	/**
	 * Returns the value of the '<em><b>Pos Direction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos Direction</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos Direction</em>' reference.
	 * @see #setPosDirection(SingleLinePropertyInfo)
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYParameter_PosDirection()
	 * @model
	 * @generated
	 */
	SingleLinePropertyInfo getPosDirection();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YParameter#getPosDirection <em>Pos Direction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos Direction</em>' reference.
	 * @see #getPosDirection()
	 * @generated
	 */
	void setPosDirection(SingleLinePropertyInfo value);

	/**
	 * Returns the value of the '<em><b>Pos Default Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos Default Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos Default Value</em>' reference.
	 * @see #setPosDefaultValue(SingleLinePropertyInfo)
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYParameter_PosDefaultValue()
	 * @model
	 * @generated
	 */
	SingleLinePropertyInfo getPosDefaultValue();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YParameter#getPosDefaultValue <em>Pos Default Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos Default Value</em>' reference.
	 * @see #getPosDefaultValue()
	 * @generated
	 */
	void setPosDefaultValue(SingleLinePropertyInfo value);

	/**
	 * Returns the value of the '<em><b>Pos Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos Type</em>' reference.
	 * @see #setPosType(SingleLinePropertyInfo)
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYParameter_PosType()
	 * @model
	 * @generated
	 */
	SingleLinePropertyInfo getPosType();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YParameter#getPosType <em>Pos Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos Type</em>' reference.
	 * @see #getPosType()
	 * @generated
	 */
	void setPosType(SingleLinePropertyInfo value);

	/**
	 * Returns the value of the '<em><b>Pos Qualified Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos Qualified Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos Qualified Name</em>' reference.
	 * @see #setPosQualifiedName(SingleLinePropertyInfo)
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYParameter_PosQualifiedName()
	 * @model
	 * @generated
	 */
	SingleLinePropertyInfo getPosQualifiedName();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YParameter#getPosQualifiedName <em>Pos Qualified Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos Qualified Name</em>' reference.
	 * @see #getPosQualifiedName()
	 * @generated
	 */
	void setPosQualifiedName(SingleLinePropertyInfo value);

} // YParameter
