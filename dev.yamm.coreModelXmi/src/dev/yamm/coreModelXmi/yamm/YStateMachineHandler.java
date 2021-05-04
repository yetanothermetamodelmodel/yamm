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
 * A representation of the model object '<em><b>YState Machine Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YStateMachineHandler#getState <em>State</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YStateMachineHandler#getTransition <em>Transition</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YStateMachineHandler#isIsSuspended <em>Is Suspended</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YStateMachineHandler#getEffectCount <em>Effect Count</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YStateMachineHandler#getEffectNo <em>Effect No</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YStateMachineHandler#getStateMachine <em>State Machine</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YStateMachineHandler#getEffect <em>Effect</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YStateMachineHandler#getCalledFrom <em>Called From</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YStateMachineHandler#getItsClassID <em>Its Class ID</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YStateMachineHandler#getOperationInstance <em>Operation Instance</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YStateMachineHandler#getEffectsProcessed <em>Effects Processed</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YStateMachineHandler#getMaxEffectsToBeProcessed <em>Max Effects To Be Processed</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YStateMachineHandler#getInAdapters <em>In Adapters</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YStateMachineHandler#getObjectsBindedWithInoutParameters <em>Objects Binded With Inout Parameters</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YStateMachineHandler#getReturnVar <em>Return Var</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YStateMachineHandler#getNameOfRetunVar <em>Name Of Retun Var</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YStateMachineHandler#getObjectsToColor <em>Objects To Color</em>}</li>
 * </ul>
 *
 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYStateMachineHandler()
 * @model
 * @generated
 */
public interface YStateMachineHandler extends YObject
{
	/**
	 * Returns the value of the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' reference.
	 * @see #setState(YVertex)
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYStateMachineHandler_State()
	 * @model required="true"
	 * @generated
	 */
	YVertex getState();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YStateMachineHandler#getState <em>State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(YVertex value);

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' reference.
	 * @see #setTransition(YTransition)
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYStateMachineHandler_Transition()
	 * @model required="true"
	 * @generated
	 */
	YTransition getTransition();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YStateMachineHandler#getTransition <em>Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition</em>' reference.
	 * @see #getTransition()
	 * @generated
	 */
	void setTransition(YTransition value);

	/**
	 * Returns the value of the '<em><b>Is Suspended</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Suspended</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Suspended</em>' attribute.
	 * @see #setIsSuspended(boolean)
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYStateMachineHandler_IsSuspended()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsSuspended();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YStateMachineHandler#isIsSuspended <em>Is Suspended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Suspended</em>' attribute.
	 * @see #isIsSuspended()
	 * @generated
	 */
	void setIsSuspended(boolean value);

	/**
	 * Returns the value of the '<em><b>Effect Count</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effect Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effect Count</em>' attribute.
	 * @see #setEffectCount(int)
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYStateMachineHandler_EffectCount()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getEffectCount();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YStateMachineHandler#getEffectCount <em>Effect Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effect Count</em>' attribute.
	 * @see #getEffectCount()
	 * @generated
	 */
	void setEffectCount(int value);

	/**
	 * Returns the value of the '<em><b>Effect No</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effect No</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effect No</em>' attribute.
	 * @see #setEffectNo(int)
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYStateMachineHandler_EffectNo()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getEffectNo();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YStateMachineHandler#getEffectNo <em>Effect No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effect No</em>' attribute.
	 * @see #getEffectNo()
	 * @generated
	 */
	void setEffectNo(int value);

	/**
	 * Returns the value of the '<em><b>State Machine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Machine</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Machine</em>' reference.
	 * @see #setStateMachine(YStateMachine)
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYStateMachineHandler_StateMachine()
	 * @model required="true"
	 * @generated
	 */
	YStateMachine getStateMachine();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YStateMachineHandler#getStateMachine <em>State Machine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Machine</em>' reference.
	 * @see #getStateMachine()
	 * @generated
	 */
	void setStateMachine(YStateMachine value);

	/**
	 * Returns the value of the '<em><b>Effect</b></em>' attribute.
	 * The default value is <code>"\"\""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effect</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effect</em>' attribute.
	 * @see #setEffect(String)
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYStateMachineHandler_Effect()
	 * @model default="\"\"" required="true"
	 * @generated
	 */
	String getEffect();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YStateMachineHandler#getEffect <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effect</em>' attribute.
	 * @see #getEffect()
	 * @generated
	 */
	void setEffect(String value);

	/**
	 * Returns the value of the '<em><b>Called From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Called From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Called From</em>' reference.
	 * @see #setCalledFrom(YStateMachineHandler)
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYStateMachineHandler_CalledFrom()
	 * @model
	 * @generated
	 */
	YStateMachineHandler getCalledFrom();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YStateMachineHandler#getCalledFrom <em>Called From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Called From</em>' reference.
	 * @see #getCalledFrom()
	 * @generated
	 */
	void setCalledFrom(YStateMachineHandler value);

	/**
	 * Returns the value of the '<em><b>Its Class ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Its Class ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its Class ID</em>' attribute.
	 * @see #setItsClassID(String)
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYStateMachineHandler_ItsClassID()
	 * @model
	 * @generated
	 */
	String getItsClassID();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YStateMachineHandler#getItsClassID <em>Its Class ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Its Class ID</em>' attribute.
	 * @see #getItsClassID()
	 * @generated
	 */
	void setItsClassID(String value);

	/**
	 * Returns the value of the '<em><b>Operation Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Instance</em>' reference.
	 * @see #setOperationInstance(EObject)
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYStateMachineHandler_OperationInstance()
	 * @model
	 * @generated
	 */
	EObject getOperationInstance();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YStateMachineHandler#getOperationInstance <em>Operation Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Instance</em>' reference.
	 * @see #getOperationInstance()
	 * @generated
	 */
	void setOperationInstance(EObject value);

	/**
	 * Returns the value of the '<em><b>Effects Processed</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effects Processed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effects Processed</em>' attribute.
	 * @see #setEffectsProcessed(int)
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYStateMachineHandler_EffectsProcessed()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getEffectsProcessed();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YStateMachineHandler#getEffectsProcessed <em>Effects Processed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effects Processed</em>' attribute.
	 * @see #getEffectsProcessed()
	 * @generated
	 */
	void setEffectsProcessed(int value);

	/**
	 * Returns the value of the '<em><b>Max Effects To Be Processed</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Effects To Be Processed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Effects To Be Processed</em>' attribute.
	 * @see #setMaxEffectsToBeProcessed(int)
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYStateMachineHandler_MaxEffectsToBeProcessed()
	 * @model default="-1" required="true"
	 * @generated
	 */
	int getMaxEffectsToBeProcessed();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YStateMachineHandler#getMaxEffectsToBeProcessed <em>Max Effects To Be Processed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Effects To Be Processed</em>' attribute.
	 * @see #getMaxEffectsToBeProcessed()
	 * @generated
	 */
	void setMaxEffectsToBeProcessed(int value);

	/**
	 * Returns the value of the '<em><b>In Adapters</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Adapters</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Adapters</em>' attribute list.
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYStateMachineHandler_InAdapters()
	 * @model
	 * @generated
	 */
	EList<Object> getInAdapters();

	/**
	 * Returns the value of the '<em><b>Objects Binded With Inout Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objects Binded With Inout Parameters</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objects Binded With Inout Parameters</em>' attribute.
	 * @see #setObjectsBindedWithInoutParameters(Object)
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYStateMachineHandler_ObjectsBindedWithInoutParameters()
	 * @model
	 * @generated
	 */
	Object getObjectsBindedWithInoutParameters();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YStateMachineHandler#getObjectsBindedWithInoutParameters <em>Objects Binded With Inout Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objects Binded With Inout Parameters</em>' attribute.
	 * @see #getObjectsBindedWithInoutParameters()
	 * @generated
	 */
	void setObjectsBindedWithInoutParameters(Object value);

	/**
	 * Returns the value of the '<em><b>Return Var</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Var</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Var</em>' attribute.
	 * @see #setReturnVar(Object)
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYStateMachineHandler_ReturnVar()
	 * @model
	 * @generated
	 */
	Object getReturnVar();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YStateMachineHandler#getReturnVar <em>Return Var</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Var</em>' attribute.
	 * @see #getReturnVar()
	 * @generated
	 */
	void setReturnVar(Object value);

	/**
	 * Returns the value of the '<em><b>Name Of Retun Var</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Of Retun Var</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Of Retun Var</em>' attribute.
	 * @see #setNameOfRetunVar(String)
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYStateMachineHandler_NameOfRetunVar()
	 * @model
	 * @generated
	 */
	String getNameOfRetunVar();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YStateMachineHandler#getNameOfRetunVar <em>Name Of Retun Var</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Of Retun Var</em>' attribute.
	 * @see #getNameOfRetunVar()
	 * @generated
	 */
	void setNameOfRetunVar(String value);

	/**
	 * Returns the value of the '<em><b>Objects To Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objects To Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objects To Color</em>' attribute.
	 * @see #setObjectsToColor(Object)
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYStateMachineHandler_ObjectsToColor()
	 * @model
	 * @generated
	 */
	Object getObjectsToColor();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YStateMachineHandler#getObjectsToColor <em>Objects To Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objects To Color</em>' attribute.
	 * @see #getObjectsToColor()
	 * @generated
	 */
	void setObjectsToColor(Object value);

} // YStateMachineHandler
