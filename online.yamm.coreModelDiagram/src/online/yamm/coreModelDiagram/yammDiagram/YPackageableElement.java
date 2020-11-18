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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YPackageable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.YPackageableElement#getParentElement <em>Parent Element</em>}</li>
 * </ul>
 *
 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYPackageableElement()
 * @model
 * @generated
 */
public interface YPackageableElement extends YObject, YNamedElement
{
	/**
	 * Returns the value of the '<em><b>Parent Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link online.yamm.coreModelDiagram.yammDiagram.YPackage#getOwnedMemberPackage <em>Owned Member Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Element</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Element</em>' container reference.
	 * @see #setParentElement(YPackage)
	 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYPackageableElement_ParentElement()
	 * @see online.yamm.coreModelDiagram.yammDiagram.YPackage#getOwnedMemberPackage
	 * @model opposite="ownedMemberPackage" transient="false"
	 * @generated
	 */
	YPackage getParentElement();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelDiagram.yammDiagram.YPackageableElement#getParentElement <em>Parent Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Element</em>' container reference.
	 * @see #getParentElement()
	 * @generated
	 */
	void setParentElement(YPackage value);

} // YPackageableElement
