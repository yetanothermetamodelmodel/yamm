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
package online.yamm.ObjectDiagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link online.yamm.ObjectDiagram.ObjectDiagram#getObjects <em>Objects</em>}</li>
 *   <li>{@link online.yamm.ObjectDiagram.ObjectDiagram#getTypes <em>Types</em>}</li>
 *   <li>{@link online.yamm.ObjectDiagram.ObjectDiagram#getDataTypes <em>Data Types</em>}</li>
 *   <li>{@link online.yamm.ObjectDiagram.ObjectDiagram#getStackframes <em>Stackframes</em>}</li>
 *   <li>{@link online.yamm.ObjectDiagram.ObjectDiagram#getYammModelPath <em>Yamm Model Path</em>}</li>
 *   <li>{@link online.yamm.ObjectDiagram.ObjectDiagram#getMetaDataPackage <em>Meta Data Package</em>}</li>
 *   <li>{@link online.yamm.ObjectDiagram.ObjectDiagram#getTypeObjectCreate <em>Type Object Create</em>}</li>
 *   <li>{@link online.yamm.ObjectDiagram.ObjectDiagram#getInitialModel <em>Initial Model</em>}</li>
 * </ul>
 *
 * @see online.yamm.ObjectDiagram.ObjectDiagramPackage#getObjectDiagram()
 * @model
 * @generated
 */
public interface ObjectDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Objects</b></em>' containment reference list.
	 * The list contents are of type {@link online.yamm.ObjectDiagram.ODObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objects</em>' containment reference list.
	 * @see online.yamm.ObjectDiagram.ObjectDiagramPackage#getObjectDiagram_Objects()
	 * @model containment="true"
	 * @generated
	 */
	EList<ODObject> getObjects();

	/**
	 * Returns the value of the '<em><b>Types</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link online.yamm.ObjectDiagram.ODType},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' map.
	 * @see online.yamm.ObjectDiagram.ObjectDiagramPackage#getObjectDiagram_Types()
	 * @model mapType="online.yamm.ObjectDiagram.EStringToODTypeMap&lt;org.eclipse.emf.ecore.EString, online.yamm.ObjectDiagram.ODType&gt;"
	 * @generated
	 */
	EMap<String, ODType> getTypes();

	/**
	 * Returns the value of the '<em><b>Data Types</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link online.yamm.ObjectDiagram.ODType},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Types</em>' map.
	 * @see online.yamm.ObjectDiagram.ObjectDiagramPackage#getObjectDiagram_DataTypes()
	 * @model mapType="online.yamm.ObjectDiagram.EStringToODTypeMap&lt;org.eclipse.emf.ecore.EString, online.yamm.ObjectDiagram.ODType&gt;"
	 * @generated
	 */
	EMap<String, ODType> getDataTypes();

	/**
	 * Returns the value of the '<em><b>Stackframes</b></em>' containment reference list.
	 * The list contents are of type {@link online.yamm.ObjectDiagram.ODStackframe}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stackframes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stackframes</em>' containment reference list.
	 * @see online.yamm.ObjectDiagram.ObjectDiagramPackage#getObjectDiagram_Stackframes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ODStackframe> getStackframes();

	/**
	 * Returns the value of the '<em><b>Yamm Model Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Yamm Model Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Yamm Model Path</em>' attribute.
	 * @see #setYammModelPath(String)
	 * @see online.yamm.ObjectDiagram.ObjectDiagramPackage#getObjectDiagram_YammModelPath()
	 * @model
	 * @generated
	 */
	String getYammModelPath();

	/**
	 * Sets the value of the '{@link online.yamm.ObjectDiagram.ObjectDiagram#getYammModelPath <em>Yamm Model Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Yamm Model Path</em>' attribute.
	 * @see #getYammModelPath()
	 * @generated
	 */
	void setYammModelPath(String value);

	/**
	 * Returns the value of the '<em><b>Meta Data Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Data Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Data Package</em>' reference.
	 * @see #setMetaDataPackage(EPackage)
	 * @see online.yamm.ObjectDiagram.ObjectDiagramPackage#getObjectDiagram_MetaDataPackage()
	 * @model
	 * @generated
	 */
	EPackage getMetaDataPackage();

	/**
	 * Sets the value of the '{@link online.yamm.ObjectDiagram.ObjectDiagram#getMetaDataPackage <em>Meta Data Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Data Package</em>' reference.
	 * @see #getMetaDataPackage()
	 * @generated
	 */
	void setMetaDataPackage(EPackage value);

	/**
	 * Returns the value of the '<em><b>Type Object Create</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Object Create</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Object Create</em>' reference.
	 * @see #setTypeObjectCreate(EClass)
	 * @see online.yamm.ObjectDiagram.ObjectDiagramPackage#getObjectDiagram_TypeObjectCreate()
	 * @model
	 * @generated
	 */
	EClass getTypeObjectCreate();

	/**
	 * Sets the value of the '{@link online.yamm.ObjectDiagram.ObjectDiagram#getTypeObjectCreate <em>Type Object Create</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Object Create</em>' reference.
	 * @see #getTypeObjectCreate()
	 * @generated
	 */
	void setTypeObjectCreate(EClass value);

	/**
	 * Returns the value of the '<em><b>Initial Model</b></em>' containment reference list.
	 * The list contents are of type {@link online.yamm.ObjectDiagram.ODObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Model</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Model</em>' containment reference list.
	 * @see online.yamm.ObjectDiagram.ObjectDiagramPackage#getObjectDiagram_InitialModel()
	 * @model containment="true"
	 * @generated
	 */
	EList<ODObject> getInitialModel();

} // ObjectDiagram
