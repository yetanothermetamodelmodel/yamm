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

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

import dev.yamm.coreModelXmi.yamm.YClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OD Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dev.yamm.ObjectDiagram.ODType#getName <em>Name</em>}</li>
 *   <li>{@link dev.yamm.ObjectDiagram.ODType#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link dev.yamm.ObjectDiagram.ODType#getRuntimeType <em>Runtime Type</em>}</li>
 *   <li>{@link dev.yamm.ObjectDiagram.ODType#getYammType <em>Yamm Type</em>}</li>
 *   <li>{@link dev.yamm.ObjectDiagram.ODType#getObjectID <em>Object ID</em>}</li>
 * </ul>
 *
 * @see dev.yamm.ObjectDiagram.ObjectDiagramPackage#getODType()
 * @model
 * @generated
 */
public interface ODType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see dev.yamm.ObjectDiagram.ObjectDiagramPackage#getODType_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dev.yamm.ObjectDiagram.ODType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see dev.yamm.ObjectDiagram.ObjectDiagramPackage#getODType_QualifiedName()
	 * @model
	 * @generated
	 */
	String getQualifiedName();

	/**
	 * Sets the value of the '{@link dev.yamm.ObjectDiagram.ODType#getQualifiedName <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualified Name</em>' attribute.
	 * @see #getQualifiedName()
	 * @generated
	 */
	void setQualifiedName(String value);

	/**
	 * Returns the value of the '<em><b>Runtime Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runtime Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtime Type</em>' reference.
	 * @see #setRuntimeType(EClassifier)
	 * @see dev.yamm.ObjectDiagram.ObjectDiagramPackage#getODType_RuntimeType()
	 * @model
	 * @generated
	 */
	EClassifier getRuntimeType();

	/**
	 * Sets the value of the '{@link dev.yamm.ObjectDiagram.ODType#getRuntimeType <em>Runtime Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runtime Type</em>' reference.
	 * @see #getRuntimeType()
	 * @generated
	 */
	void setRuntimeType(EClassifier value);

	/**
	 * Returns the value of the '<em><b>Yamm Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Yamm Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Yamm Type</em>' reference.
	 * @see #setYammType(YClass)
	 * @see dev.yamm.ObjectDiagram.ObjectDiagramPackage#getODType_YammType()
	 * @model
	 * @generated
	 */
	YClass getYammType();

	/**
	 * Sets the value of the '{@link dev.yamm.ObjectDiagram.ODType#getYammType <em>Yamm Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Yamm Type</em>' reference.
	 * @see #getYammType()
	 * @generated
	 */
	void setYammType(YClass value);

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
	 * @see dev.yamm.ObjectDiagram.ObjectDiagramPackage#getODType_ObjectID()
	 * @model
	 * @generated
	 */
	String getObjectID();

	/**
	 * Sets the value of the '{@link dev.yamm.ObjectDiagram.ODType#getObjectID <em>Object ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object ID</em>' attribute.
	 * @see #getObjectID()
	 * @generated
	 */
	void setObjectID(String value);

} // ODType
