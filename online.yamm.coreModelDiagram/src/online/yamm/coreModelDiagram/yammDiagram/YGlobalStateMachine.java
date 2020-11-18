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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YGlobal State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.YGlobalStateMachine#getStateMachines <em>State Machines</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.YGlobalStateMachine#getStateMachineHandlers <em>State Machine Handlers</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.YGlobalStateMachine#getStateMachineHandlerCount <em>State Machine Handler Count</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.YGlobalStateMachine#isConstraintsAllTrue <em>Constraints All True</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.YGlobalStateMachine#isHasReturnParam <em>Has Return Param</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.YGlobalStateMachine#getParamCount <em>Param Count</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.YGlobalStateMachine#getStateExitCount <em>State Exit Count</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.YGlobalStateMachine#getStateExitNo <em>State Exit No</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.YGlobalStateMachine#getO <em>O</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.YGlobalStateMachine#isObserverActive <em>Observer Active</em>}</li>
 * </ul>
 *
 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYGlobalStateMachine()
 * @model
 * @generated
 */
public interface YGlobalStateMachine extends YObject
{
	/**
	 * Returns the value of the '<em><b>State Machines</b></em>' reference list.
	 * The list contents are of type {@link online.yamm.coreModelDiagram.yammDiagram.YStateMachine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Machines</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Machines</em>' reference list.
	 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYGlobalStateMachine_StateMachines()
	 * @model
	 * @generated
	 */
	EList<YStateMachine> getStateMachines();

	/**
	 * Returns the value of the '<em><b>State Machine Handlers</b></em>' reference list.
	 * The list contents are of type {@link online.yamm.coreModelDiagram.yammDiagram.YStateMachineHandler}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Machine Handlers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Machine Handlers</em>' reference list.
	 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYGlobalStateMachine_StateMachineHandlers()
	 * @model
	 * @generated
	 */
	EList<YStateMachineHandler> getStateMachineHandlers();

	/**
	 * Returns the value of the '<em><b>State Machine Handler Count</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Machine Handler Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Machine Handler Count</em>' attribute.
	 * @see #setStateMachineHandlerCount(int)
	 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYGlobalStateMachine_StateMachineHandlerCount()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getStateMachineHandlerCount();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelDiagram.yammDiagram.YGlobalStateMachine#getStateMachineHandlerCount <em>State Machine Handler Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Machine Handler Count</em>' attribute.
	 * @see #getStateMachineHandlerCount()
	 * @generated
	 */
	void setStateMachineHandlerCount(int value);

	/**
	 * Returns the value of the '<em><b>Constraints All True</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints All True</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints All True</em>' attribute.
	 * @see #setConstraintsAllTrue(boolean)
	 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYGlobalStateMachine_ConstraintsAllTrue()
	 * @model required="true"
	 * @generated
	 */
	boolean isConstraintsAllTrue();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelDiagram.yammDiagram.YGlobalStateMachine#isConstraintsAllTrue <em>Constraints All True</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraints All True</em>' attribute.
	 * @see #isConstraintsAllTrue()
	 * @generated
	 */
	void setConstraintsAllTrue(boolean value);

	/**
	 * Returns the value of the '<em><b>Has Return Param</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Return Param</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Return Param</em>' attribute.
	 * @see #setHasReturnParam(boolean)
	 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYGlobalStateMachine_HasReturnParam()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isHasReturnParam();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelDiagram.yammDiagram.YGlobalStateMachine#isHasReturnParam <em>Has Return Param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Return Param</em>' attribute.
	 * @see #isHasReturnParam()
	 * @generated
	 */
	void setHasReturnParam(boolean value);

	/**
	 * Returns the value of the '<em><b>Param Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param Count</em>' attribute.
	 * @see #setParamCount(int)
	 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYGlobalStateMachine_ParamCount()
	 * @model required="true"
	 * @generated
	 */
	int getParamCount();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelDiagram.yammDiagram.YGlobalStateMachine#getParamCount <em>Param Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param Count</em>' attribute.
	 * @see #getParamCount()
	 * @generated
	 */
	void setParamCount(int value);

	/**
	 * Returns the value of the '<em><b>State Exit Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Exit Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Exit Count</em>' attribute.
	 * @see #setStateExitCount(int)
	 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYGlobalStateMachine_StateExitCount()
	 * @model required="true"
	 * @generated
	 */
	int getStateExitCount();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelDiagram.yammDiagram.YGlobalStateMachine#getStateExitCount <em>State Exit Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Exit Count</em>' attribute.
	 * @see #getStateExitCount()
	 * @generated
	 */
	void setStateExitCount(int value);

	/**
	 * Returns the value of the '<em><b>State Exit No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Exit No</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Exit No</em>' attribute.
	 * @see #setStateExitNo(int)
	 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYGlobalStateMachine_StateExitNo()
	 * @model required="true"
	 * @generated
	 */
	int getStateExitNo();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelDiagram.yammDiagram.YGlobalStateMachine#getStateExitNo <em>State Exit No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Exit No</em>' attribute.
	 * @see #getStateExitNo()
	 * @generated
	 */
	void setStateExitNo(int value);

	/**
	 * Returns the value of the '<em><b>O</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>O</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>O</em>' reference.
	 * @see #setO(YOperation)
	 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYGlobalStateMachine_O()
	 * @model
	 * @generated
	 */
	YOperation getO();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelDiagram.yammDiagram.YGlobalStateMachine#getO <em>O</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>O</em>' reference.
	 * @see #getO()
	 * @generated
	 */
	void setO(YOperation value);

	/**
	 * Returns the value of the '<em><b>Observer Active</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Observer Active</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observer Active</em>' attribute.
	 * @see #setObserverActive(boolean)
	 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYGlobalStateMachine_ObserverActive()
	 * @model default="false"
	 * @generated
	 */
	boolean isObserverActive();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelDiagram.yammDiagram.YGlobalStateMachine#isObserverActive <em>Observer Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observer Active</em>' attribute.
	 * @see #isObserverActive()
	 * @generated
	 */
	void setObserverActive(boolean value);

} // YGlobalStateMachine
