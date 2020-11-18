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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YObject</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.YObject#getObjectID <em>Object ID</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.YObject#getDslInfo <em>Dsl Info</em>}</li>
 * </ul>
 *
 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYObject()
 * @model
 * @generated
 */
public interface YObject extends EObject
{
	/**
	 * Returns the value of the '<em><b>Object ID</b></em>' attribute.
	 * The default value is <code>"e"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object ID</em>' attribute.
	 * @see #isSetObjectID()
	 * @see #unsetObjectID()
	 * @see #setObjectID(String)
	 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYObject_ObjectID()
	 * @model default="e" unsettable="true"
	 * @generated
	 */
	String getObjectID();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelDiagram.yammDiagram.YObject#getObjectID <em>Object ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object ID</em>' attribute.
	 * @see #isSetObjectID()
	 * @see #unsetObjectID()
	 * @see #getObjectID()
	 * @generated
	 */
	void setObjectID(String value);

	/**
	 * Unsets the value of the '{@link online.yamm.coreModelDiagram.yammDiagram.YObject#getObjectID <em>Object ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetObjectID()
	 * @see #getObjectID()
	 * @see #setObjectID(String)
	 * @generated
	 */
	void unsetObjectID();

	/**
	 * Returns whether the value of the '{@link online.yamm.coreModelDiagram.yammDiagram.YObject#getObjectID <em>Object ID</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Object ID</em>' attribute is set.
	 * @see #unsetObjectID()
	 * @see #getObjectID()
	 * @see #setObjectID(String)
	 * @generated
	 */
	boolean isSetObjectID();

	/**
	 * Returns the value of the '<em><b>Dsl Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dsl Info</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dsl Info</em>' reference.
	 * @see #setDslInfo(DslInfo)
	 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYObject_DslInfo()
	 * @model transient="true"
	 * @generated
	 */
	DslInfo getDslInfo();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelDiagram.yammDiagram.YObject#getDslInfo <em>Dsl Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dsl Info</em>' reference.
	 * @see #getDslInfo()
	 * @generated
	 */
	void setDslInfo(DslInfo value);

} // YObject
