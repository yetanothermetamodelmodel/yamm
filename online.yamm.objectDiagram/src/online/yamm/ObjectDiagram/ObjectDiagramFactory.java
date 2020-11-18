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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see online.yamm.ObjectDiagram.ObjectDiagramPackage
 * @generated
 */
public interface ObjectDiagramFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ObjectDiagramFactory eINSTANCE = online.yamm.ObjectDiagram.impl.ObjectDiagramFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Object Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Diagram</em>'.
	 * @generated
	 */
	ObjectDiagram createObjectDiagram();

	/**
	 * Returns a new object of class '<em>OD Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OD Object</em>'.
	 * @generated
	 */
	ODObject createODObject();

	/**
	 * Returns a new object of class '<em>OD Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OD Type</em>'.
	 * @generated
	 */
	ODType createODType();

	/**
	 * Returns a new object of class '<em>OD Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OD Reference</em>'.
	 * @generated
	 */
	ODReference createODReference();

	/**
	 * Returns a new object of class '<em>OD Date Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OD Date Type</em>'.
	 * @generated
	 */
	ODDateType createODDateType();

	/**
	 * Returns a new object of class '<em>OD Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OD Attribute</em>'.
	 * @generated
	 */
	ODAttribute createODAttribute();

	/**
	 * Returns a new object of class '<em>OD Stackframe</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OD Stackframe</em>'.
	 * @generated
	 */
	ODStackframe createODStackframe();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ObjectDiagramPackage getObjectDiagramPackage();

} //ObjectDiagramFactory
