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
 * A representation of the model object '<em><b>YClass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.YClass#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.YClass#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.YClass#getPackage <em>Package</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.YClass#getSuperClass <em>Super Class</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.YClass#getOwnedAttribute <em>Owned Attribute</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.YClass#getOwnedOperation <em>Owned Operation</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.YClass#isObserveQueue <em>Observe Queue</em>}</li>
 * </ul>
 *
 * @see dev.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYClass()
 * @model
 * @generated
 */
public interface YClass extends YElement, YNamedElement, YPackageableElement, YClassifier, YType, YNamespace, YObject
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
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYClass_IsAbstract()
	 * @model
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelDiagram.yammDiagram.YClass#isIsAbstract <em>Is Abstract</em>}' attribute.
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
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYClass_QualifiedName()
	 * @model
	 * @generated
	 */
	String getQualifiedName();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelDiagram.yammDiagram.YClass#getQualifiedName <em>Qualified Name</em>}' attribute.
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
	 * @see #setPackage(YNamedElement)
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYClass_Package()
	 * @model
	 * @generated
	 */
	YNamedElement getPackage();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelDiagram.yammDiagram.YClass#getPackage <em>Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(YNamedElement value);

	/**
	 * Returns the value of the '<em><b>Super Class</b></em>' reference list.
	 * The list contents are of type {@link dev.yamm.coreModelDiagram.yammDiagram.YClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Class</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Class</em>' reference list.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYClass_SuperClass()
	 * @model
	 * @generated
	 */
	EList<YClass> getSuperClass();

	/**
	 * Returns the value of the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link dev.yamm.coreModelDiagram.yammDiagram.YProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Attribute</em>' containment reference list.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYClass_OwnedAttribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<YProperty> getOwnedAttribute();

	/**
	 * Returns the value of the '<em><b>Owned Operation</b></em>' containment reference list.
	 * The list contents are of type {@link dev.yamm.coreModelDiagram.yammDiagram.YOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Operation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Operation</em>' containment reference list.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYClass_OwnedOperation()
	 * @model containment="true"
	 * @generated
	 */
	EList<YOperation> getOwnedOperation();

	/**
	 * Returns the value of the '<em><b>Observe Queue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Observe Queue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observe Queue</em>' attribute.
	 * @see #setObserveQueue(boolean)
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYClass_ObserveQueue()
	 * @model
	 * @generated
	 */
	boolean isObserveQueue();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelDiagram.yammDiagram.YClass#isObserveQueue <em>Observe Queue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observe Queue</em>' attribute.
	 * @see #isObserveQueue()
	 * @generated
	 */
	void setObserveQueue(boolean value);

} // YClass
