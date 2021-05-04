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
 * A representation of the model object '<em><b>YEnumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.YEnumeration#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.YEnumeration#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.YEnumeration#getMember <em>Member</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.YEnumeration#getElementImport <em>Element Import</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.YEnumeration#getImportedMember <em>Imported Member</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.YEnumeration#getPackageImport <em>Package Import</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.YEnumeration#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.YEnumeration#getFeature <em>Feature</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.YEnumeration#getGeneral <em>General</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.YEnumeration#getInheritedMember <em>Inherited Member</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.YEnumeration#getPackage <em>Package</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.YEnumeration#getOwnedComment <em>Owned Comment</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.YEnumeration#getOwnedElement <em>Owned Element</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.YEnumeration#getOwnedMember <em>Owned Member</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.YEnumeration#getOwnedRule <em>Owned Rule</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.YEnumeration#getOwnedLiteral <em>Owned Literal</em>}</li>
 * </ul>
 *
 * @see dev.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYEnumeration()
 * @model
 * @generated
 */
public interface YEnumeration extends YElement, YNamedElement, YPackageableElement, YClassifier, YType, YNamespace, YObject
{
	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(boolean)
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYEnumeration_IsAbstract()
	 * @model
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelDiagram.yammDiagram.YEnumeration#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #isIsAbstract()
	 * @generated
	 */
	void setIsAbstract(boolean value);

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
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYEnumeration_QualifiedName()
	 * @model
	 * @generated
	 */
	String getQualifiedName();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelDiagram.yammDiagram.YEnumeration#getQualifiedName <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualified Name</em>' attribute.
	 * @see #getQualifiedName()
	 * @generated
	 */
	void setQualifiedName(String value);

	/**
	 * Returns the value of the '<em><b>Member</b></em>' reference list.
	 * The list contents are of type {@link dev.yamm.coreModelDiagram.yammDiagram.YNamedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member</em>' reference list.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYEnumeration_Member()
	 * @model
	 * @generated
	 */
	EList<YNamedElement> getMember();

	/**
	 * Returns the value of the '<em><b>Element Import</b></em>' reference list.
	 * The list contents are of type {@link dev.yamm.coreModelDiagram.yammDiagram.YPackageableElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Import</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Import</em>' reference list.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYEnumeration_ElementImport()
	 * @model
	 * @generated
	 */
	EList<YPackageableElement> getElementImport();

	/**
	 * Returns the value of the '<em><b>Imported Member</b></em>' reference list.
	 * The list contents are of type {@link dev.yamm.coreModelDiagram.yammDiagram.YPackageableElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Member</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Member</em>' reference list.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYEnumeration_ImportedMember()
	 * @model
	 * @generated
	 */
	EList<YPackageableElement> getImportedMember();

	/**
	 * Returns the value of the '<em><b>Package Import</b></em>' reference list.
	 * The list contents are of type {@link dev.yamm.coreModelDiagram.yammDiagram.YPackageableElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Import</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Import</em>' reference list.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYEnumeration_PackageImport()
	 * @model
	 * @generated
	 */
	EList<YPackageableElement> getPackageImport();

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference list.
	 * The list contents are of type {@link dev.yamm.coreModelDiagram.yammDiagram.YProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference list.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYEnumeration_Attribute()
	 * @model
	 * @generated
	 */
	EList<YProperty> getAttribute();

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference list.
	 * The list contents are of type {@link dev.yamm.coreModelDiagram.yammDiagram.YFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference list.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYEnumeration_Feature()
	 * @model
	 * @generated
	 */
	EList<YFeature> getFeature();

	/**
	 * Returns the value of the '<em><b>General</b></em>' reference list.
	 * The list contents are of type {@link dev.yamm.coreModelDiagram.yammDiagram.YClassifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>General</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General</em>' reference list.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYEnumeration_General()
	 * @model
	 * @generated
	 */
	EList<YClassifier> getGeneral();

	/**
	 * Returns the value of the '<em><b>Inherited Member</b></em>' reference list.
	 * The list contents are of type {@link dev.yamm.coreModelDiagram.yammDiagram.YNamedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inherited Member</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inherited Member</em>' reference list.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYEnumeration_InheritedMember()
	 * @model
	 * @generated
	 */
	EList<YNamedElement> getInheritedMember();

	/**
	 * Returns the value of the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' reference.
	 * @see #setPackage(YNamedElement)
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYEnumeration_Package()
	 * @model
	 * @generated
	 */
	YNamedElement getPackage();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelDiagram.yammDiagram.YEnumeration#getPackage <em>Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(YNamedElement value);

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
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYEnumeration_OwnedComment()
	 * @model containment="true"
	 * @generated
	 */
	YComment getOwnedComment();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelDiagram.yammDiagram.YEnumeration#getOwnedComment <em>Owned Comment</em>}' containment reference.
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
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYEnumeration_OwnedElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<YElement> getOwnedElement();

	/**
	 * Returns the value of the '<em><b>Owned Member</b></em>' containment reference list.
	 * The list contents are of type {@link dev.yamm.coreModelDiagram.yammDiagram.YNamedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Member</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Member</em>' containment reference list.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYEnumeration_OwnedMember()
	 * @model containment="true"
	 * @generated
	 */
	EList<YNamedElement> getOwnedMember();

	/**
	 * Returns the value of the '<em><b>Owned Rule</b></em>' containment reference list.
	 * The list contents are of type {@link dev.yamm.coreModelDiagram.yammDiagram.YConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Rule</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Rule</em>' containment reference list.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYEnumeration_OwnedRule()
	 * @model containment="true"
	 * @generated
	 */
	EList<YConstraint> getOwnedRule();

	/**
	 * Returns the value of the '<em><b>Owned Literal</b></em>' containment reference list.
	 * The list contents are of type {@link dev.yamm.coreModelDiagram.yammDiagram.YEnumerationLiteral}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Literal</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Literal</em>' containment reference list.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYEnumeration_OwnedLiteral()
	 * @model containment="true"
	 * @generated
	 */
	EList<YEnumerationLiteral> getOwnedLiteral();

} // YEnumeration
