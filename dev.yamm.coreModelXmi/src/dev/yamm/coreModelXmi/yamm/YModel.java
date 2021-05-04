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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YModel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YModel#getClazz <em>Clazz</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YModel#getEnumerations <em>Enumerations</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YModel#getPackages <em>Packages</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YModel#getObjects <em>Objects</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YModel#getSharedEdges <em>Shared Edges</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YModel#getCompositeEdges <em>Composite Edges</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YModel#getPosObjectID <em>Pos Object ID</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YModel#getInsertClass <em>Insert Class</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YModel#getInsertEnum <em>Insert Enum</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YModel#getInsertPackage <em>Insert Package</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YModel#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYModel()
 * @model
 * @generated
 */
public interface YModel extends YObject
{
	/**
	 * Returns the value of the '<em><b>Clazz</b></em>' containment reference list.
	 * The list contents are of type {@link dev.yamm.coreModelXmi.yamm.YClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clazz</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clazz</em>' containment reference list.
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYModel_Clazz()
	 * @model containment="true"
	 * @generated
	 */
	EList<YClass> getClazz();

	/**
	 * Returns the value of the '<em><b>Enumerations</b></em>' containment reference list.
	 * The list contents are of type {@link dev.yamm.coreModelXmi.yamm.YEnumeration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumerations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumerations</em>' containment reference list.
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYModel_Enumerations()
	 * @model containment="true"
	 * @generated
	 */
	EList<YEnumeration> getEnumerations();

	/**
	 * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
	 * The list contents are of type {@link dev.yamm.coreModelXmi.yamm.YPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packages</em>' containment reference list.
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYModel_Packages()
	 * @model containment="true"
	 * @generated
	 */
	EList<YPackage> getPackages();

	/**
	 * Returns the value of the '<em><b>Objects</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objects</em>' containment reference list.
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYModel_Objects()
	 * @model containment="true"
	 * @generated
	 */
	EList<EObject> getObjects();

	/**
	 * Returns the value of the '<em><b>Shared Edges</b></em>' containment reference list.
	 * The list contents are of type {@link dev.yamm.coreModelXmi.yamm.YSharedEdge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shared Edges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shared Edges</em>' containment reference list.
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYModel_SharedEdges()
	 * @model containment="true"
	 * @generated
	 */
	EList<YSharedEdge> getSharedEdges();

	/**
	 * Returns the value of the '<em><b>Composite Edges</b></em>' containment reference list.
	 * The list contents are of type {@link dev.yamm.coreModelXmi.yamm.YCompositeEdge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composite Edges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composite Edges</em>' containment reference list.
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYModel_CompositeEdges()
	 * @model containment="true"
	 * @generated
	 */
	EList<YCompositeEdge> getCompositeEdges();

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
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYModel_PosObjectID()
	 * @model
	 * @generated
	 */
	SingleLinePropertyInfo getPosObjectID();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YModel#getPosObjectID <em>Pos Object ID</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos Object ID</em>' reference.
	 * @see #getPosObjectID()
	 * @generated
	 */
	void setPosObjectID(SingleLinePropertyInfo value);

	/**
	 * Returns the value of the '<em><b>Insert Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insert Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insert Class</em>' attribute.
	 * @see #setInsertClass(int)
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYModel_InsertClass()
	 * @model
	 * @generated
	 */
	int getInsertClass();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YModel#getInsertClass <em>Insert Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insert Class</em>' attribute.
	 * @see #getInsertClass()
	 * @generated
	 */
	void setInsertClass(int value);

	/**
	 * Returns the value of the '<em><b>Insert Enum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insert Enum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insert Enum</em>' attribute.
	 * @see #setInsertEnum(int)
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYModel_InsertEnum()
	 * @model
	 * @generated
	 */
	int getInsertEnum();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YModel#getInsertEnum <em>Insert Enum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insert Enum</em>' attribute.
	 * @see #getInsertEnum()
	 * @generated
	 */
	void setInsertEnum(int value);

	/**
	 * Returns the value of the '<em><b>Insert Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insert Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insert Package</em>' attribute.
	 * @see #setInsertPackage(int)
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYModel_InsertPackage()
	 * @model
	 * @generated
	 */
	int getInsertPackage();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YModel#getInsertPackage <em>Insert Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insert Package</em>' attribute.
	 * @see #getInsertPackage()
	 * @generated
	 */
	void setInsertPackage(int value);

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYModel_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<EObject> getTypes();

} // YModel
