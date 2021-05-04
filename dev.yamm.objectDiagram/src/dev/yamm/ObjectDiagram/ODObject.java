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
package dev.yamm.ObjectDiagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OD Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dev.yamm.ObjectDiagram.ODObject#getObjectID <em>Object ID</em>}</li>
 *   <li>{@link dev.yamm.ObjectDiagram.ODObject#getType <em>Type</em>}</li>
 *   <li>{@link dev.yamm.ObjectDiagram.ODObject#getReferences <em>References</em>}</li>
 *   <li>{@link dev.yamm.ObjectDiagram.ODObject#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link dev.yamm.ObjectDiagram.ODObject#getRuntimeObject <em>Runtime Object</em>}</li>
 * </ul>
 *
 * @see dev.yamm.ObjectDiagram.ObjectDiagramPackage#getODObject()
 * @model
 * @generated
 */
public interface ODObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Object ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object ID</em>' attribute.
	 * @see #setObjectID(String)
	 * @see dev.yamm.ObjectDiagram.ObjectDiagramPackage#getODObject_ObjectID()
	 * @model
	 * @generated
	 */
	String getObjectID();

	/**
	 * Sets the value of the '{@link dev.yamm.ObjectDiagram.ODObject#getObjectID <em>Object ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object ID</em>' attribute.
	 * @see #getObjectID()
	 * @generated
	 */
	void setObjectID(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(ODType)
	 * @see dev.yamm.ObjectDiagram.ObjectDiagramPackage#getODObject_Type()
	 * @model
	 * @generated
	 */
	ODType getType();

	/**
	 * Sets the value of the '{@link dev.yamm.ObjectDiagram.ODObject#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ODType value);

	/**
	 * Returns the value of the '<em><b>References</b></em>' containment reference list.
	 * The list contents are of type {@link dev.yamm.ObjectDiagram.ODReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' containment reference list.
	 * @see dev.yamm.ObjectDiagram.ObjectDiagramPackage#getODObject_References()
	 * @model containment="true"
	 * @generated
	 */
	EList<ODReference> getReferences();

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link dev.yamm.ObjectDiagram.ODAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see dev.yamm.ObjectDiagram.ObjectDiagramPackage#getODObject_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ODAttribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Runtime Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runtime Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtime Object</em>' reference.
	 * @see #setRuntimeObject(EObject)
	 * @see dev.yamm.ObjectDiagram.ObjectDiagramPackage#getODObject_RuntimeObject()
	 * @model
	 * @generated
	 */
	EObject getRuntimeObject();

	/**
	 * Sets the value of the '{@link dev.yamm.ObjectDiagram.ODObject#getRuntimeObject <em>Runtime Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runtime Object</em>' reference.
	 * @see #getRuntimeObject()
	 * @generated
	 */
	void setRuntimeObject(EObject value);

} // ODObject
