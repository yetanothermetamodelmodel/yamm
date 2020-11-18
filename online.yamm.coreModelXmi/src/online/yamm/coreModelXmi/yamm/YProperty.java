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
package online.yamm.coreModelXmi.yamm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YProperty</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YProperty#isIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YProperty#isIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YProperty#isIsDerivedUnion <em>Is Derived Union</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YProperty#isAssociation <em>Association</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YProperty#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YProperty#isIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YProperty#getLower <em>Lower</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YProperty#getUpper <em>Upper</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YProperty#getAggregation <em>Aggregation</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YProperty#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YProperty#getDescription <em>Description</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YProperty#getFeaturingClassifier <em>Featuring Classifier</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YProperty#getType <em>Type</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YProperty#getSubsettedProperty <em>Subsetted Property</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YProperty#getOpposite <em>Opposite</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YProperty#getOwnedComment <em>Owned Comment</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YProperty#getOwnedElement <em>Owned Element</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YProperty#getClazz <em>Clazz</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YProperty#getSignature <em>Signature</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YProperty#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YProperty#getPosObjectID <em>Pos Object ID</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YProperty#getPosName <em>Pos Name</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YProperty#getPosOrdered <em>Pos Ordered</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YProperty#getPosUnique <em>Pos Unique</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YProperty#getPosLower <em>Pos Lower</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YProperty#getPosUpper <em>Pos Upper</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YProperty#getPosDefaultValue <em>Pos Default Value</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YProperty#getPosType <em>Pos Type</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YProperty#getPosClazz <em>Pos Clazz</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YProperty#getPosDerived <em>Pos Derived</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YProperty#getPosDerivedUnion <em>Pos Derived Union</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YProperty#getPosAssociation <em>Pos Association</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YProperty#getPosVisibility <em>Pos Visibility</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YProperty#getPosOpposite <em>Pos Opposite</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YProperty#getPosAggregation <em>Pos Aggregation</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YProperty#getPosQualifiedName <em>Pos Qualified Name</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YProperty#isObserve <em>Observe</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YProperty#getInvarinat <em>Invarinat</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YProperty#isStatic <em>Static</em>}</li>
 * </ul>
 *
 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYProperty()
 * @model
 * @generated
 */
public interface YProperty extends YElement, YNamedElement, YFeature, YObject
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
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYProperty_IsOrdered()
	 * @model
	 * @generated
	 */
	boolean isIsOrdered();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelXmi.yamm.YProperty#isIsOrdered <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Ordered</em>' attribute.
	 * @see #isIsOrdered()
	 * @generated
	 */
	void setIsOrdered(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Derived</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Derived</em>' attribute.
	 * @see #setIsDerived(boolean)
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYProperty_IsDerived()
	 * @model
	 * @generated
	 */
	boolean isIsDerived();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelXmi.yamm.YProperty#isIsDerived <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Derived</em>' attribute.
	 * @see #isIsDerived()
	 * @generated
	 */
	void setIsDerived(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Derived Union</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Derived Union</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Derived Union</em>' attribute.
	 * @see #setIsDerivedUnion(boolean)
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYProperty_IsDerivedUnion()
	 * @model
	 * @generated
	 */
	boolean isIsDerivedUnion();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelXmi.yamm.YProperty#isIsDerivedUnion <em>Is Derived Union</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Derived Union</em>' attribute.
	 * @see #isIsDerivedUnion()
	 * @generated
	 */
	void setIsDerivedUnion(boolean value);

	/**
	 * Returns the value of the '<em><b>Association</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association</em>' attribute.
	 * @see #setAssociation(boolean)
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYProperty_Association()
	 * @model default="false"
	 * @generated
	 */
	boolean isAssociation();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelXmi.yamm.YProperty#isAssociation <em>Association</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association</em>' attribute.
	 * @see #isAssociation()
	 * @generated
	 */
	void setAssociation(boolean value);

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
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYProperty_QualifiedName()
	 * @model
	 * @generated
	 */
	String getQualifiedName();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelXmi.yamm.YProperty#getQualifiedName <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualified Name</em>' attribute.
	 * @see #getQualifiedName()
	 * @generated
	 */
	void setQualifiedName(String value);

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
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYProperty_IsUnique()
	 * @model
	 * @generated
	 */
	boolean isIsUnique();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelXmi.yamm.YProperty#isIsUnique <em>Is Unique</em>}' attribute.
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
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYProperty_Lower()
	 * @model
	 * @generated
	 */
	int getLower();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelXmi.yamm.YProperty#getLower <em>Lower</em>}' attribute.
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
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYProperty_Upper()
	 * @model default="1"
	 * @generated
	 */
	int getUpper();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelXmi.yamm.YProperty#getUpper <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper</em>' attribute.
	 * @see #getUpper()
	 * @generated
	 */
	void setUpper(int value);

	/**
	 * Returns the value of the '<em><b>Aggregation</b></em>' attribute.
	 * The literals are from the enumeration {@link online.yamm.coreModelXmi.yamm.YAggregationKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregation</em>' attribute.
	 * @see online.yamm.coreModelXmi.yamm.YAggregationKind
	 * @see #setAggregation(YAggregationKind)
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYProperty_Aggregation()
	 * @model
	 * @generated
	 */
	YAggregationKind getAggregation();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelXmi.yamm.YProperty#getAggregation <em>Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregation</em>' attribute.
	 * @see online.yamm.coreModelXmi.yamm.YAggregationKind
	 * @see #getAggregation()
	 * @generated
	 */
	void setAggregation(YAggregationKind value);

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
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYProperty_DefaultValue()
	 * @model
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelXmi.yamm.YProperty#getDefaultValue <em>Default Value</em>}' attribute.
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
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYProperty_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelXmi.yamm.YProperty#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Featuring Classifier</b></em>' reference list.
	 * The list contents are of type {@link online.yamm.coreModelXmi.yamm.YClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Featuring Classifier</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Featuring Classifier</em>' reference list.
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYProperty_FeaturingClassifier()
	 * @model
	 * @generated
	 */
	EList<YClass> getFeaturingClassifier();

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
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYProperty_Type()
	 * @model
	 * @generated
	 */
	YType getType();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelXmi.yamm.YProperty#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(YType value);

	/**
	 * Returns the value of the '<em><b>Subsetted Property</b></em>' reference list.
	 * The list contents are of type {@link online.yamm.coreModelXmi.yamm.YProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subsetted Property</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subsetted Property</em>' reference list.
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYProperty_SubsettedProperty()
	 * @model
	 * @generated
	 */
	EList<YProperty> getSubsettedProperty();

	/**
	 * Returns the value of the '<em><b>Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opposite</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opposite</em>' reference.
	 * @see #setOpposite(YProperty)
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYProperty_Opposite()
	 * @model
	 * @generated
	 */
	YProperty getOpposite();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelXmi.yamm.YProperty#getOpposite <em>Opposite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opposite</em>' reference.
	 * @see #getOpposite()
	 * @generated
	 */
	void setOpposite(YProperty value);

	/**
	 * Returns the value of the '<em><b>Owned Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Comment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Comment</em>' containment reference.
	 * @see #setOwnedComment(YComment)
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYProperty_OwnedComment()
	 * @model containment="true"
	 * @generated
	 */
	YComment getOwnedComment();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelXmi.yamm.YProperty#getOwnedComment <em>Owned Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Comment</em>' containment reference.
	 * @see #getOwnedComment()
	 * @generated
	 */
	void setOwnedComment(YComment value);

	/**
	 * Returns the value of the '<em><b>Owned Element</b></em>' containment reference list.
	 * The list contents are of type {@link online.yamm.coreModelXmi.yamm.YElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Element</em>' containment reference list.
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYProperty_OwnedElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<YElement> getOwnedElement();

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
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYProperty_Clazz()
	 * @model
	 * @generated
	 */
	YClass getClazz();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelXmi.yamm.YProperty#getClazz <em>Clazz</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clazz</em>' reference.
	 * @see #getClazz()
	 * @generated
	 */
	void setClazz(YClass value);

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
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYProperty_Signature()
	 * @model transient="true"
	 * @generated
	 */
	String getSignature();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelXmi.yamm.YProperty#getSignature <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' attribute.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(String value);

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The default value is <code>"public"</code>.
	 * The literals are from the enumeration {@link online.yamm.coreModelXmi.yamm.YVisibilityKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see online.yamm.coreModelXmi.yamm.YVisibilityKind
	 * @see #setVisibility(YVisibilityKind)
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYProperty_Visibility()
	 * @model default="public"
	 * @generated
	 */
	YVisibilityKind getVisibility();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelXmi.yamm.YProperty#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see online.yamm.coreModelXmi.yamm.YVisibilityKind
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(YVisibilityKind value);

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
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYProperty_PosObjectID()
	 * @model
	 * @generated
	 */
	SingleLinePropertyInfo getPosObjectID();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelXmi.yamm.YProperty#getPosObjectID <em>Pos Object ID</em>}' reference.
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
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYProperty_PosName()
	 * @model
	 * @generated
	 */
	SingleLinePropertyInfo getPosName();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelXmi.yamm.YProperty#getPosName <em>Pos Name</em>}' reference.
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
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYProperty_PosOrdered()
	 * @model
	 * @generated
	 */
	SingleLinePropertyInfo getPosOrdered();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelXmi.yamm.YProperty#getPosOrdered <em>Pos Ordered</em>}' reference.
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
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYProperty_PosUnique()
	 * @model
	 * @generated
	 */
	SingleLinePropertyInfo getPosUnique();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelXmi.yamm.YProperty#getPosUnique <em>Pos Unique</em>}' reference.
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
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYProperty_PosLower()
	 * @model
	 * @generated
	 */
	SingleLinePropertyInfo getPosLower();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelXmi.yamm.YProperty#getPosLower <em>Pos Lower</em>}' reference.
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
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYProperty_PosUpper()
	 * @model
	 * @generated
	 */
	SingleLinePropertyInfo getPosUpper();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelXmi.yamm.YProperty#getPosUpper <em>Pos Upper</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos Upper</em>' reference.
	 * @see #getPosUpper()
	 * @generated
	 */
	void setPosUpper(SingleLinePropertyInfo value);

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
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYProperty_PosDefaultValue()
	 * @model
	 * @generated
	 */
	SingleLinePropertyInfo getPosDefaultValue();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelXmi.yamm.YProperty#getPosDefaultValue <em>Pos Default Value</em>}' reference.
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
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYProperty_PosType()
	 * @model
	 * @generated
	 */
	SingleLinePropertyInfo getPosType();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelXmi.yamm.YProperty#getPosType <em>Pos Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos Type</em>' reference.
	 * @see #getPosType()
	 * @generated
	 */
	void setPosType(SingleLinePropertyInfo value);

	/**
	 * Returns the value of the '<em><b>Pos Clazz</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos Clazz</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos Clazz</em>' reference.
	 * @see #setPosClazz(SingleLinePropertyInfo)
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYProperty_PosClazz()
	 * @model
	 * @generated
	 */
	SingleLinePropertyInfo getPosClazz();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelXmi.yamm.YProperty#getPosClazz <em>Pos Clazz</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos Clazz</em>' reference.
	 * @see #getPosClazz()
	 * @generated
	 */
	void setPosClazz(SingleLinePropertyInfo value);

	/**
	 * Returns the value of the '<em><b>Pos Derived</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos Derived</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos Derived</em>' reference.
	 * @see #setPosDerived(SingleLinePropertyInfo)
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYProperty_PosDerived()
	 * @model
	 * @generated
	 */
	SingleLinePropertyInfo getPosDerived();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelXmi.yamm.YProperty#getPosDerived <em>Pos Derived</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos Derived</em>' reference.
	 * @see #getPosDerived()
	 * @generated
	 */
	void setPosDerived(SingleLinePropertyInfo value);

	/**
	 * Returns the value of the '<em><b>Pos Derived Union</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos Derived Union</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos Derived Union</em>' reference.
	 * @see #setPosDerivedUnion(SingleLinePropertyInfo)
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYProperty_PosDerivedUnion()
	 * @model
	 * @generated
	 */
	SingleLinePropertyInfo getPosDerivedUnion();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelXmi.yamm.YProperty#getPosDerivedUnion <em>Pos Derived Union</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos Derived Union</em>' reference.
	 * @see #getPosDerivedUnion()
	 * @generated
	 */
	void setPosDerivedUnion(SingleLinePropertyInfo value);

	/**
	 * Returns the value of the '<em><b>Pos Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos Association</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos Association</em>' reference.
	 * @see #setPosAssociation(SingleLinePropertyInfo)
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYProperty_PosAssociation()
	 * @model
	 * @generated
	 */
	SingleLinePropertyInfo getPosAssociation();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelXmi.yamm.YProperty#getPosAssociation <em>Pos Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos Association</em>' reference.
	 * @see #getPosAssociation()
	 * @generated
	 */
	void setPosAssociation(SingleLinePropertyInfo value);

	/**
	 * Returns the value of the '<em><b>Pos Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos Visibility</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos Visibility</em>' reference.
	 * @see #setPosVisibility(SingleLinePropertyInfo)
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYProperty_PosVisibility()
	 * @model
	 * @generated
	 */
	SingleLinePropertyInfo getPosVisibility();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelXmi.yamm.YProperty#getPosVisibility <em>Pos Visibility</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos Visibility</em>' reference.
	 * @see #getPosVisibility()
	 * @generated
	 */
	void setPosVisibility(SingleLinePropertyInfo value);

	/**
	 * Returns the value of the '<em><b>Pos Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos Opposite</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos Opposite</em>' reference.
	 * @see #setPosOpposite(SingleLinePropertyInfo)
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYProperty_PosOpposite()
	 * @model
	 * @generated
	 */
	SingleLinePropertyInfo getPosOpposite();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelXmi.yamm.YProperty#getPosOpposite <em>Pos Opposite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos Opposite</em>' reference.
	 * @see #getPosOpposite()
	 * @generated
	 */
	void setPosOpposite(SingleLinePropertyInfo value);

	/**
	 * Returns the value of the '<em><b>Pos Aggregation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos Aggregation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos Aggregation</em>' reference.
	 * @see #setPosAggregation(SingleLinePropertyInfo)
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYProperty_PosAggregation()
	 * @model
	 * @generated
	 */
	SingleLinePropertyInfo getPosAggregation();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelXmi.yamm.YProperty#getPosAggregation <em>Pos Aggregation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos Aggregation</em>' reference.
	 * @see #getPosAggregation()
	 * @generated
	 */
	void setPosAggregation(SingleLinePropertyInfo value);

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
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYProperty_PosQualifiedName()
	 * @model
	 * @generated
	 */
	SingleLinePropertyInfo getPosQualifiedName();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelXmi.yamm.YProperty#getPosQualifiedName <em>Pos Qualified Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos Qualified Name</em>' reference.
	 * @see #getPosQualifiedName()
	 * @generated
	 */
	void setPosQualifiedName(SingleLinePropertyInfo value);

	/**
	 * Returns the value of the '<em><b>Observe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Observe</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observe</em>' attribute.
	 * @see #setObserve(boolean)
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYProperty_Observe()
	 * @model
	 * @generated
	 */
	boolean isObserve();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelXmi.yamm.YProperty#isObserve <em>Observe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observe</em>' attribute.
	 * @see #isObserve()
	 * @generated
	 */
	void setObserve(boolean value);

	/**
	 * Returns the value of the '<em><b>Invarinat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invarinat</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invarinat</em>' attribute.
	 * @see #setInvarinat(String)
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYProperty_Invarinat()
	 * @model
	 * @generated
	 */
	String getInvarinat();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelXmi.yamm.YProperty#getInvarinat <em>Invarinat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invarinat</em>' attribute.
	 * @see #getInvarinat()
	 * @generated
	 */
	void setInvarinat(String value);

	/**
	 * Returns the value of the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static</em>' attribute.
	 * @see #setStatic(boolean)
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYProperty_Static()
	 * @model
	 * @generated
	 */
	boolean isStatic();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelXmi.yamm.YProperty#isStatic <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static</em>' attribute.
	 * @see #isStatic()
	 * @generated
	 */
	void setStatic(boolean value);

} // YProperty
