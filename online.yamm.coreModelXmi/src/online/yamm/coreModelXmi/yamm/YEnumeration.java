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
 * A representation of the model object '<em><b>YEnumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YEnumeration#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YEnumeration#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YEnumeration#getMember <em>Member</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YEnumeration#getElementImport <em>Element Import</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YEnumeration#getImportedMember <em>Imported Member</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YEnumeration#getPackageImport <em>Package Import</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YEnumeration#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YEnumeration#getFeature <em>Feature</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YEnumeration#getGeneral <em>General</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YEnumeration#getInheritedMember <em>Inherited Member</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YEnumeration#getPackage <em>Package</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YEnumeration#getOwnedComment <em>Owned Comment</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YEnumeration#getOwnedElement <em>Owned Element</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YEnumeration#getOwnedMember <em>Owned Member</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YEnumeration#getOwnedRule <em>Owned Rule</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YEnumeration#getOwnedLiteral <em>Owned Literal</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YEnumeration#getPosObjectID <em>Pos Object ID</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YEnumeration#getPosIsAbstract <em>Pos Is Abstract</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YEnumeration#getPosName <em>Pos Name</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YEnumeration#getPosQualifiedName <em>Pos Qualified Name</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YEnumeration#getPosPackage <em>Pos Package</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YEnumeration#getInsertLineLiteral <em>Insert Line Literal</em>}</li>
 * </ul>
 *
 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYEnumeration()
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
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYEnumeration_IsAbstract()
	 * @model
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelXmi.yamm.YEnumeration#isIsAbstract <em>Is Abstract</em>}' attribute.
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
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYEnumeration_QualifiedName()
	 * @model
	 * @generated
	 */
	String getQualifiedName();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelXmi.yamm.YEnumeration#getQualifiedName <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualified Name</em>' attribute.
	 * @see #getQualifiedName()
	 * @generated
	 */
	void setQualifiedName(String value);

	/**
	 * Returns the value of the '<em><b>Member</b></em>' reference list.
	 * The list contents are of type {@link online.yamm.coreModelXmi.yamm.YNamedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member</em>' reference list.
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYEnumeration_Member()
	 * @model
	 * @generated
	 */
	EList<YNamedElement> getMember();

	/**
	 * Returns the value of the '<em><b>Element Import</b></em>' reference list.
	 * The list contents are of type {@link online.yamm.coreModelXmi.yamm.YPackageableElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Import</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Import</em>' reference list.
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYEnumeration_ElementImport()
	 * @model
	 * @generated
	 */
	EList<YPackageableElement> getElementImport();

	/**
	 * Returns the value of the '<em><b>Imported Member</b></em>' reference list.
	 * The list contents are of type {@link online.yamm.coreModelXmi.yamm.YPackageableElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Member</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Member</em>' reference list.
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYEnumeration_ImportedMember()
	 * @model
	 * @generated
	 */
	EList<YPackageableElement> getImportedMember();

	/**
	 * Returns the value of the '<em><b>Package Import</b></em>' reference list.
	 * The list contents are of type {@link online.yamm.coreModelXmi.yamm.YPackageableElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Import</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Import</em>' reference list.
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYEnumeration_PackageImport()
	 * @model
	 * @generated
	 */
	EList<YPackageableElement> getPackageImport();

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference list.
	 * The list contents are of type {@link online.yamm.coreModelXmi.yamm.YProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference list.
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYEnumeration_Attribute()
	 * @model
	 * @generated
	 */
	EList<YProperty> getAttribute();

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference list.
	 * The list contents are of type {@link online.yamm.coreModelXmi.yamm.YFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference list.
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYEnumeration_Feature()
	 * @model
	 * @generated
	 */
	EList<YFeature> getFeature();

	/**
	 * Returns the value of the '<em><b>General</b></em>' reference list.
	 * The list contents are of type {@link online.yamm.coreModelXmi.yamm.YClassifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>General</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General</em>' reference list.
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYEnumeration_General()
	 * @model
	 * @generated
	 */
	EList<YClassifier> getGeneral();

	/**
	 * Returns the value of the '<em><b>Inherited Member</b></em>' reference list.
	 * The list contents are of type {@link online.yamm.coreModelXmi.yamm.YNamedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inherited Member</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inherited Member</em>' reference list.
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYEnumeration_InheritedMember()
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
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYEnumeration_Package()
	 * @model
	 * @generated
	 */
	YNamedElement getPackage();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelXmi.yamm.YEnumeration#getPackage <em>Package</em>}' reference.
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
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYEnumeration_OwnedComment()
	 * @model containment="true"
	 * @generated
	 */
	YComment getOwnedComment();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelXmi.yamm.YEnumeration#getOwnedComment <em>Owned Comment</em>}' containment reference.
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
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYEnumeration_OwnedElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<YElement> getOwnedElement();

	/**
	 * Returns the value of the '<em><b>Owned Member</b></em>' containment reference list.
	 * The list contents are of type {@link online.yamm.coreModelXmi.yamm.YNamedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Member</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Member</em>' containment reference list.
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYEnumeration_OwnedMember()
	 * @model containment="true"
	 * @generated
	 */
	EList<YNamedElement> getOwnedMember();

	/**
	 * Returns the value of the '<em><b>Owned Rule</b></em>' containment reference list.
	 * The list contents are of type {@link online.yamm.coreModelXmi.yamm.YConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Rule</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Rule</em>' containment reference list.
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYEnumeration_OwnedRule()
	 * @model containment="true"
	 * @generated
	 */
	EList<YConstraint> getOwnedRule();

	/**
	 * Returns the value of the '<em><b>Owned Literal</b></em>' containment reference list.
	 * The list contents are of type {@link online.yamm.coreModelXmi.yamm.YEnumerationLiteral}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Literal</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Literal</em>' containment reference list.
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYEnumeration_OwnedLiteral()
	 * @model containment="true"
	 * @generated
	 */
	EList<YEnumerationLiteral> getOwnedLiteral();

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
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYEnumeration_PosObjectID()
	 * @model
	 * @generated
	 */
	SingleLinePropertyInfo getPosObjectID();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelXmi.yamm.YEnumeration#getPosObjectID <em>Pos Object ID</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos Object ID</em>' reference.
	 * @see #getPosObjectID()
	 * @generated
	 */
	void setPosObjectID(SingleLinePropertyInfo value);

	/**
	 * Returns the value of the '<em><b>Pos Is Abstract</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos Is Abstract</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos Is Abstract</em>' reference.
	 * @see #setPosIsAbstract(SingleLinePropertyInfo)
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYEnumeration_PosIsAbstract()
	 * @model
	 * @generated
	 */
	SingleLinePropertyInfo getPosIsAbstract();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelXmi.yamm.YEnumeration#getPosIsAbstract <em>Pos Is Abstract</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos Is Abstract</em>' reference.
	 * @see #getPosIsAbstract()
	 * @generated
	 */
	void setPosIsAbstract(SingleLinePropertyInfo value);

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
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYEnumeration_PosName()
	 * @model
	 * @generated
	 */
	SingleLinePropertyInfo getPosName();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelXmi.yamm.YEnumeration#getPosName <em>Pos Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos Name</em>' reference.
	 * @see #getPosName()
	 * @generated
	 */
	void setPosName(SingleLinePropertyInfo value);

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
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYEnumeration_PosQualifiedName()
	 * @model
	 * @generated
	 */
	SingleLinePropertyInfo getPosQualifiedName();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelXmi.yamm.YEnumeration#getPosQualifiedName <em>Pos Qualified Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos Qualified Name</em>' reference.
	 * @see #getPosQualifiedName()
	 * @generated
	 */
	void setPosQualifiedName(SingleLinePropertyInfo value);

	/**
	 * Returns the value of the '<em><b>Pos Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos Package</em>' reference.
	 * @see #setPosPackage(SingleLinePropertyInfo)
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYEnumeration_PosPackage()
	 * @model
	 * @generated
	 */
	SingleLinePropertyInfo getPosPackage();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelXmi.yamm.YEnumeration#getPosPackage <em>Pos Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos Package</em>' reference.
	 * @see #getPosPackage()
	 * @generated
	 */
	void setPosPackage(SingleLinePropertyInfo value);

	/**
	 * Returns the value of the '<em><b>Insert Line Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insert Line Literal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insert Line Literal</em>' attribute.
	 * @see #setInsertLineLiteral(int)
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYEnumeration_InsertLineLiteral()
	 * @model
	 * @generated
	 */
	int getInsertLineLiteral();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelXmi.yamm.YEnumeration#getInsertLineLiteral <em>Insert Line Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insert Line Literal</em>' attribute.
	 * @see #getInsertLineLiteral()
	 * @generated
	 */
	void setInsertLineLiteral(int value);

} // YEnumeration
