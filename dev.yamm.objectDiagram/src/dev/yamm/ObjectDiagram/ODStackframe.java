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
 * A representation of the model object '<em><b>OD Stackframe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dev.yamm.ObjectDiagram.ODStackframe#getParameterPrimitive <em>Parameter Primitive</em>}</li>
 *   <li>{@link dev.yamm.ObjectDiagram.ODStackframe#getParametersObjects <em>Parameters Objects</em>}</li>
 *   <li>{@link dev.yamm.ObjectDiagram.ODStackframe#getContainingObject <em>Containing Object</em>}</li>
 *   <li>{@link dev.yamm.ObjectDiagram.ODStackframe#getOperationName <em>Operation Name</em>}</li>
 * </ul>
 *
 * @see dev.yamm.ObjectDiagram.ObjectDiagramPackage#getODStackframe()
 * @model
 * @generated
 */
public interface ODStackframe extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameter Primitive</b></em>' containment reference list.
	 * The list contents are of type {@link dev.yamm.ObjectDiagram.ODAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Primitive</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Primitive</em>' containment reference list.
	 * @see dev.yamm.ObjectDiagram.ObjectDiagramPackage#getODStackframe_ParameterPrimitive()
	 * @model containment="true"
	 * @generated
	 */
	EList<ODAttribute> getParameterPrimitive();

	/**
	 * Returns the value of the '<em><b>Parameters Objects</b></em>' containment reference list.
	 * The list contents are of type {@link dev.yamm.ObjectDiagram.ODReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters Objects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters Objects</em>' containment reference list.
	 * @see dev.yamm.ObjectDiagram.ObjectDiagramPackage#getODStackframe_ParametersObjects()
	 * @model containment="true"
	 * @generated
	 */
	EList<ODReference> getParametersObjects();

	/**
	 * Returns the value of the '<em><b>Containing Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containing Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containing Object</em>' reference.
	 * @see #setContainingObject(ODObject)
	 * @see dev.yamm.ObjectDiagram.ObjectDiagramPackage#getODStackframe_ContainingObject()
	 * @model
	 * @generated
	 */
	ODObject getContainingObject();

	/**
	 * Sets the value of the '{@link dev.yamm.ObjectDiagram.ODStackframe#getContainingObject <em>Containing Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containing Object</em>' reference.
	 * @see #getContainingObject()
	 * @generated
	 */
	void setContainingObject(ODObject value);

	/**
	 * Returns the value of the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Name</em>' attribute.
	 * @see #setOperationName(String)
	 * @see dev.yamm.ObjectDiagram.ObjectDiagramPackage#getODStackframe_OperationName()
	 * @model
	 * @generated
	 */
	String getOperationName();

	/**
	 * Sets the value of the '{@link dev.yamm.ObjectDiagram.ODStackframe#getOperationName <em>Operation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Name</em>' attribute.
	 * @see #getOperationName()
	 * @generated
	 */
	void setOperationName(String value);

} // ODStackframe
