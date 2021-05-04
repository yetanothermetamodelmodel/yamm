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

import org.eclipse.xtext.common.types.JvmIdentifiableElement;

import org.eclipse.xtext.xbase.XFeatureCall;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YFeature Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.YFeatureCall#isExplicitInheritanceType <em>Explicit Inheritance Type</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.YFeatureCall#getInheritanceType <em>Inheritance Type</em>}</li>
 * </ul>
 *
 * @see dev.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYFeatureCall()
 * @model
 * @generated
 */
public interface YFeatureCall extends XFeatureCall
{
	/**
	 * Returns the value of the '<em><b>Explicit Inheritance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Explicit Inheritance Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Explicit Inheritance Type</em>' attribute.
	 * @see #setExplicitInheritanceType(boolean)
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYFeatureCall_ExplicitInheritanceType()
	 * @model
	 * @generated
	 */
	boolean isExplicitInheritanceType();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelDiagram.yammDiagram.YFeatureCall#isExplicitInheritanceType <em>Explicit Inheritance Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Explicit Inheritance Type</em>' attribute.
	 * @see #isExplicitInheritanceType()
	 * @generated
	 */
	void setExplicitInheritanceType(boolean value);

	/**
	 * Returns the value of the '<em><b>Inheritance Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inheritance Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inheritance Type</em>' reference.
	 * @see #setInheritanceType(JvmIdentifiableElement)
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYFeatureCall_InheritanceType()
	 * @model
	 * @generated
	 */
	JvmIdentifiableElement getInheritanceType();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelDiagram.yammDiagram.YFeatureCall#getInheritanceType <em>Inheritance Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inheritance Type</em>' reference.
	 * @see #getInheritanceType()
	 * @generated
	 */
	void setInheritanceType(JvmIdentifiableElement value);

} // YFeatureCall
