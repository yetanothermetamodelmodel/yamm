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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YInternal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YInternal#getSimulationTime <em>Simulation Time</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YInternal#getGlobalStateMachine <em>Global State Machine</em>}</li>
 * </ul>
 *
 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYInternal()
 * @model
 * @generated
 */
public interface YInternal extends EObject {
	/**
	 * Returns the value of the '<em><b>Simulation Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simulation Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simulation Time</em>' attribute.
	 * @see #setSimulationTime(int)
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYInternal_SimulationTime()
	 * @model
	 * @generated
	 */
	int getSimulationTime();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YInternal#getSimulationTime <em>Simulation Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simulation Time</em>' attribute.
	 * @see #getSimulationTime()
	 * @generated
	 */
	void setSimulationTime(int value);

	/**
	 * Returns the value of the '<em><b>Global State Machine</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link dev.yamm.coreModelXmi.yamm.YGlobalStateMachine#getInternal <em>Internal</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global State Machine</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global State Machine</em>' container reference.
	 * @see #setGlobalStateMachine(YGlobalStateMachine)
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYInternal_GlobalStateMachine()
	 * @see dev.yamm.coreModelXmi.yamm.YGlobalStateMachine#getInternal
	 * @model opposite="internal" transient="false"
	 * @generated
	 */
	YGlobalStateMachine getGlobalStateMachine();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YInternal#getGlobalStateMachine <em>Global State Machine</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global State Machine</em>' container reference.
	 * @see #getGlobalStateMachine()
	 * @generated
	 */
	void setGlobalStateMachine(YGlobalStateMachine value);

} // YInternal
