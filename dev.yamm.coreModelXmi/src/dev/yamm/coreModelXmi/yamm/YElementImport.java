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
 * A representation of the model object '<em><b>YElement Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YElementImport#getImportedElement <em>Imported Element</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YElementImport#getImportingNamespace <em>Importing Namespace</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YElementImport#getOwnedComment <em>Owned Comment</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YElementImport#getOwnedElement <em>Owned Element</em>}</li>
 * </ul>
 *
 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYElementImport()
 * @model
 * @generated
 */
public interface YElementImport extends YElement, YObject
{
	/**
	 * Returns the value of the '<em><b>Imported Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Element</em>' reference.
	 * @see #setImportedElement(YPackageableElement)
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYElementImport_ImportedElement()
	 * @model
	 * @generated
	 */
	YPackageableElement getImportedElement();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YElementImport#getImportedElement <em>Imported Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Element</em>' reference.
	 * @see #getImportedElement()
	 * @generated
	 */
	void setImportedElement(YPackageableElement value);

	/**
	 * Returns the value of the '<em><b>Importing Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Importing Namespace</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Importing Namespace</em>' reference.
	 * @see #setImportingNamespace(YNamespace)
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYElementImport_ImportingNamespace()
	 * @model
	 * @generated
	 */
	YNamespace getImportingNamespace();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YElementImport#getImportingNamespace <em>Importing Namespace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Importing Namespace</em>' reference.
	 * @see #getImportingNamespace()
	 * @generated
	 */
	void setImportingNamespace(YNamespace value);

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
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYElementImport_OwnedComment()
	 * @model containment="true"
	 * @generated
	 */
	YComment getOwnedComment();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YElementImport#getOwnedComment <em>Owned Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Comment</em>' containment reference.
	 * @see #getOwnedComment()
	 * @generated
	 */
	void setOwnedComment(YComment value);

	/**
	 * Returns the value of the '<em><b>Owned Element</b></em>' containment reference list.
	 * The list contents are of type {@link dev.yamm.coreModelXmi.yamm.YElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Element</em>' containment reference list.
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYElementImport_OwnedElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<YElement> getOwnedElement();

} // YElementImport
