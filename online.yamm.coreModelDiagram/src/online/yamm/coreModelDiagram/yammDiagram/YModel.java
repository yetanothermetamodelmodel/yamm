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
package online.yamm.coreModelDiagram.yammDiagram;

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
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.YModel#getClazz <em>Clazz</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.YModel#getEnumerations <em>Enumerations</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.YModel#getPackages <em>Packages</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.YModel#getObjects <em>Objects</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.YModel#getSharedEdges <em>Shared Edges</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.YModel#getCompositeEdges <em>Composite Edges</em>}</li>
 * </ul>
 *
 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYModel()
 * @model
 * @generated
 */
public interface YModel extends YObject
{
	/**
	 * Returns the value of the '<em><b>Clazz</b></em>' containment reference list.
	 * The list contents are of type {@link online.yamm.coreModelDiagram.yammDiagram.YClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clazz</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clazz</em>' containment reference list.
	 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYModel_Clazz()
	 * @model containment="true"
	 * @generated
	 */
	EList<YClass> getClazz();

	/**
	 * Returns the value of the '<em><b>Enumerations</b></em>' containment reference list.
	 * The list contents are of type {@link online.yamm.coreModelDiagram.yammDiagram.YEnumeration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumerations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumerations</em>' containment reference list.
	 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYModel_Enumerations()
	 * @model containment="true"
	 * @generated
	 */
	EList<YEnumeration> getEnumerations();

	/**
	 * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
	 * The list contents are of type {@link online.yamm.coreModelDiagram.yammDiagram.YPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packages</em>' containment reference list.
	 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYModel_Packages()
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
	 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYModel_Objects()
	 * @model containment="true"
	 * @generated
	 */
	EList<EObject> getObjects();

	/**
	 * Returns the value of the '<em><b>Shared Edges</b></em>' containment reference list.
	 * The list contents are of type {@link online.yamm.coreModelDiagram.yammDiagram.YSharedEdge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shared Edges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shared Edges</em>' containment reference list.
	 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYModel_SharedEdges()
	 * @model containment="true"
	 * @generated
	 */
	EList<YSharedEdge> getSharedEdges();

	/**
	 * Returns the value of the '<em><b>Composite Edges</b></em>' containment reference list.
	 * The list contents are of type {@link online.yamm.coreModelDiagram.yammDiagram.YCompositeEdge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composite Edges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composite Edges</em>' containment reference list.
	 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYModel_CompositeEdges()
	 * @model containment="true"
	 * @generated
	 */
	EList<YCompositeEdge> getCompositeEdges();

} // YModel
