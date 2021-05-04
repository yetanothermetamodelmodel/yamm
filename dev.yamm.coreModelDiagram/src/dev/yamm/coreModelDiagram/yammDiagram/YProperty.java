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
package dev.yamm.coreModelDiagram.yammDiagram;

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
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.YProperty#isIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.YProperty#isIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.YProperty#isIsDerivedUnion <em>Is Derived Union</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.YProperty#isAssociation <em>Association</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.YProperty#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.YProperty#isIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.YProperty#getLower <em>Lower</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.YProperty#getUpper <em>Upper</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.YProperty#getAggregation <em>Aggregation</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.YProperty#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.YProperty#getDescription <em>Description</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.YProperty#getFeaturingClassifier <em>Featuring Classifier</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.YProperty#getType <em>Type</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.YProperty#getSubsettedProperty <em>Subsetted Property</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.YProperty#getOpposite <em>Opposite</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.YProperty#getOwnedComment <em>Owned Comment</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.YProperty#getOwnedElement <em>Owned Element</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.YProperty#getClazz <em>Clazz</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.YProperty#getSignature <em>Signature</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.YProperty#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.YProperty#isObserve <em>Observe</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.YProperty#getInvariant <em>Invariant</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.YProperty#isStatic <em>Static</em>}</li>
 * </ul>
 *
 * @see dev.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYProperty()
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
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYProperty_IsOrdered()
	 * @model
	 * @generated
	 */
	boolean isIsOrdered();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelDiagram.yammDiagram.YProperty#isIsOrdered <em>Is Ordered</em>}' attribute.
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
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYProperty_IsDerived()
	 * @model
	 * @generated
	 */
	boolean isIsDerived();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelDiagram.yammDiagram.YProperty#isIsDerived <em>Is Derived</em>}' attribute.
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
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYProperty_IsDerivedUnion()
	 * @model
	 * @generated
	 */
	boolean isIsDerivedUnion();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelDiagram.yammDiagram.YProperty#isIsDerivedUnion <em>Is Derived Union</em>}' attribute.
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
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYProperty_Association()
	 * @model default="false"
	 * @generated
	 */
	boolean isAssociation();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelDiagram.yammDiagram.YProperty#isAssociation <em>Association</em>}' attribute.
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
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYProperty_QualifiedName()
	 * @model
	 * @generated
	 */
	String getQualifiedName();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelDiagram.yammDiagram.YProperty#getQualifiedName <em>Qualified Name</em>}' attribute.
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
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYProperty_IsUnique()
	 * @model
	 * @generated
	 */
	boolean isIsUnique();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelDiagram.yammDiagram.YProperty#isIsUnique <em>Is Unique</em>}' attribute.
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
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYProperty_Lower()
	 * @model
	 * @generated
	 */
	int getLower();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelDiagram.yammDiagram.YProperty#getLower <em>Lower</em>}' attribute.
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
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYProperty_Upper()
	 * @model default="1"
	 * @generated
	 */
	int getUpper();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelDiagram.yammDiagram.YProperty#getUpper <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper</em>' attribute.
	 * @see #getUpper()
	 * @generated
	 */
	void setUpper(int value);

	/**
	 * Returns the value of the '<em><b>Aggregation</b></em>' attribute.
	 * The literals are from the enumeration {@link dev.yamm.coreModelDiagram.yammDiagram.YAggregationKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregation</em>' attribute.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YAggregationKind
	 * @see #setAggregation(YAggregationKind)
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYProperty_Aggregation()
	 * @model
	 * @generated
	 */
	YAggregationKind getAggregation();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelDiagram.yammDiagram.YProperty#getAggregation <em>Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregation</em>' attribute.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YAggregationKind
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
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYProperty_DefaultValue()
	 * @model
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelDiagram.yammDiagram.YProperty#getDefaultValue <em>Default Value</em>}' attribute.
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
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYProperty_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelDiagram.yammDiagram.YProperty#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Featuring Classifier</b></em>' reference list.
	 * The list contents are of type {@link dev.yamm.coreModelDiagram.yammDiagram.YClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Featuring Classifier</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Featuring Classifier</em>' reference list.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYProperty_FeaturingClassifier()
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
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYProperty_Type()
	 * @model
	 * @generated
	 */
	YType getType();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelDiagram.yammDiagram.YProperty#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(YType value);

	/**
	 * Returns the value of the '<em><b>Subsetted Property</b></em>' reference list.
	 * The list contents are of type {@link dev.yamm.coreModelDiagram.yammDiagram.YProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subsetted Property</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subsetted Property</em>' reference list.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYProperty_SubsettedProperty()
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
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYProperty_Opposite()
	 * @model
	 * @generated
	 */
	YProperty getOpposite();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelDiagram.yammDiagram.YProperty#getOpposite <em>Opposite</em>}' reference.
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
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYProperty_OwnedComment()
	 * @model containment="true"
	 * @generated
	 */
	YComment getOwnedComment();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelDiagram.yammDiagram.YProperty#getOwnedComment <em>Owned Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Comment</em>' containment reference.
	 * @see #getOwnedComment()
	 * @generated
	 */
	void setOwnedComment(YComment value);

	/**
	 * Returns the value of the '<em><b>Owned Element</b></em>' containment reference list.
	 * The list contents are of type {@link dev.yamm.coreModelDiagram.yammDiagram.YElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Element</em>' containment reference list.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYProperty_OwnedElement()
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
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYProperty_Clazz()
	 * @model
	 * @generated
	 */
	YClass getClazz();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelDiagram.yammDiagram.YProperty#getClazz <em>Clazz</em>}' reference.
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
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYProperty_Signature()
	 * @model transient="true"
	 * @generated
	 */
	String getSignature();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelDiagram.yammDiagram.YProperty#getSignature <em>Signature</em>}' attribute.
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
	 * The literals are from the enumeration {@link dev.yamm.coreModelDiagram.yammDiagram.YVisibilityKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YVisibilityKind
	 * @see #setVisibility(YVisibilityKind)
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYProperty_Visibility()
	 * @model default="public"
	 * @generated
	 */
	YVisibilityKind getVisibility();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelDiagram.yammDiagram.YProperty#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YVisibilityKind
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(YVisibilityKind value);

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
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYProperty_Observe()
	 * @model
	 * @generated
	 */
	boolean isObserve();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelDiagram.yammDiagram.YProperty#isObserve <em>Observe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observe</em>' attribute.
	 * @see #isObserve()
	 * @generated
	 */
	void setObserve(boolean value);

	/**
	 * Returns the value of the '<em><b>Invariant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invariant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invariant</em>' attribute.
	 * @see #setInvariant(String)
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYProperty_Invariant()
	 * @model
	 * @generated
	 */
	String getInvariant();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelDiagram.yammDiagram.YProperty#getInvariant <em>Invariant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invariant</em>' attribute.
	 * @see #getInvariant()
	 * @generated
	 */
	void setInvariant(String value);

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
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYProperty_Static()
	 * @model
	 * @generated
	 */
	boolean isStatic();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelDiagram.yammDiagram.YProperty#isStatic <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static</em>' attribute.
	 * @see #isStatic()
	 * @generated
	 */
	void setStatic(boolean value);

} // YProperty
