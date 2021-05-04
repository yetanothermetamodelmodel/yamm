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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YPackage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YPackage#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YPackage#getPackage <em>Package</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YPackage#getOwnedMemberPackage <em>Owned Member Package</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YPackage#getPosObjectID <em>Pos Object ID</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YPackage#getPosName <em>Pos Name</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YPackage#getPosQualifiedName <em>Pos Qualified Name</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YPackage#getPosPackage <em>Pos Package</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YPackage#getInsertLineMember <em>Insert Line Member</em>}</li>
 * </ul>
 *
 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYPackage()
 * @model
 * @generated
 */
public interface YPackage extends YElement, YNamedElement, YPackageableElement, YNamespace, YObject
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
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYPackage_QualifiedName()
	 * @model
	 * @generated
	 */
	String getQualifiedName();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YPackage#getQualifiedName <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualified Name</em>' attribute.
	 * @see #getQualifiedName()
	 * @generated
	 */
	void setQualifiedName(String value);

	/**
	 * Returns the value of the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' reference.
	 * @see #setPackage(YPackage)
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYPackage_Package()
	 * @model
	 * @generated
	 */
	YPackage getPackage();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YPackage#getPackage <em>Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(YPackage value);

	/**
	 * Returns the value of the '<em><b>Owned Member Package</b></em>' containment reference list.
	 * The list contents are of type {@link dev.yamm.coreModelXmi.yamm.YPackageableElement}.
	 * It is bidirectional and its opposite is '{@link dev.yamm.coreModelXmi.yamm.YPackageableElement#getParentElement <em>Parent Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Member Package</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Member Package</em>' containment reference list.
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYPackage_OwnedMemberPackage()
	 * @see dev.yamm.coreModelXmi.yamm.YPackageableElement#getParentElement
	 * @model opposite="parentElement" containment="true"
	 * @generated
	 */
	EList<YPackageableElement> getOwnedMemberPackage();

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
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYPackage_PosObjectID()
	 * @model
	 * @generated
	 */
	SingleLinePropertyInfo getPosObjectID();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YPackage#getPosObjectID <em>Pos Object ID</em>}' reference.
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
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYPackage_PosName()
	 * @model
	 * @generated
	 */
	SingleLinePropertyInfo getPosName();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YPackage#getPosName <em>Pos Name</em>}' reference.
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
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYPackage_PosQualifiedName()
	 * @model
	 * @generated
	 */
	SingleLinePropertyInfo getPosQualifiedName();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YPackage#getPosQualifiedName <em>Pos Qualified Name</em>}' reference.
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
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYPackage_PosPackage()
	 * @model
	 * @generated
	 */
	SingleLinePropertyInfo getPosPackage();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YPackage#getPosPackage <em>Pos Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos Package</em>' reference.
	 * @see #getPosPackage()
	 * @generated
	 */
	void setPosPackage(SingleLinePropertyInfo value);

	/**
	 * Returns the value of the '<em><b>Insert Line Member</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insert Line Member</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insert Line Member</em>' attribute.
	 * @see #setInsertLineMember(int)
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYPackage_InsertLineMember()
	 * @model
	 * @generated
	 */
	int getInsertLineMember();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YPackage#getInsertLineMember <em>Insert Line Member</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insert Line Member</em>' attribute.
	 * @see #getInsertLineMember()
	 * @generated
	 */
	void setInsertLineMember(int value);

} // YPackage
