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
package dev.yamm.coreModelDiagram.yammDiagram.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import dev.yamm.coreModelDiagram.yammDiagram.YStateMachine;
import dev.yamm.coreModelDiagram.yammDiagram.YStateMachineHandler;
import dev.yamm.coreModelDiagram.yammDiagram.YTransition;
import dev.yamm.coreModelDiagram.yammDiagram.YVertex;
import dev.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YState Machine Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YStateMachineHandlerImpl#getState <em>State</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YStateMachineHandlerImpl#getTransition <em>Transition</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YStateMachineHandlerImpl#isIsSuspended <em>Is Suspended</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YStateMachineHandlerImpl#getEffectCount <em>Effect Count</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YStateMachineHandlerImpl#getEffectNo <em>Effect No</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YStateMachineHandlerImpl#getStateMachine <em>State Machine</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YStateMachineHandlerImpl#getEffect <em>Effect</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YStateMachineHandlerImpl#getCalledFrom <em>Called From</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YStateMachineHandlerImpl#getItsClassID <em>Its Class ID</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YStateMachineHandlerImpl#getOperationInstance <em>Operation Instance</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YStateMachineHandlerImpl#getEffectsProcessed <em>Effects Processed</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YStateMachineHandlerImpl#getMaxEffectsToBeProcessed <em>Max Effects To Be Processed</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YStateMachineHandlerImpl#getInAdapters <em>In Adapters</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YStateMachineHandlerImpl#getObjectsBindedWithInoutParameters <em>Objects Binded With Inout Parameters</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YStateMachineHandlerImpl#getReturnVar <em>Return Var</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YStateMachineHandlerImpl#getNameOfRetunVar <em>Name Of Retun Var</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YStateMachineHandlerImpl#getObjectsToColor <em>Objects To Color</em>}</li>
 * </ul>
 *
 * @generated
 */
public class YStateMachineHandlerImpl extends YObjectImpl implements YStateMachineHandler
{
	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected YVertex state;

	/**
	 * The cached value of the '{@link #getTransition() <em>Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransition()
	 * @generated
	 * @ordered
	 */
	protected YTransition transition;

	/**
	 * The default value of the '{@link #isIsSuspended() <em>Is Suspended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSuspended()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SUSPENDED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsSuspended() <em>Is Suspended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSuspended()
	 * @generated
	 * @ordered
	 */
	protected boolean isSuspended = IS_SUSPENDED_EDEFAULT;

	/**
	 * The default value of the '{@link #getEffectCount() <em>Effect Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectCount()
	 * @generated
	 * @ordered
	 */
	protected static final int EFFECT_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEffectCount() <em>Effect Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectCount()
	 * @generated
	 * @ordered
	 */
	protected int effectCount = EFFECT_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getEffectNo() <em>Effect No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectNo()
	 * @generated
	 * @ordered
	 */
	protected static final int EFFECT_NO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEffectNo() <em>Effect No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectNo()
	 * @generated
	 * @ordered
	 */
	protected int effectNo = EFFECT_NO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStateMachine() <em>State Machine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateMachine()
	 * @generated
	 * @ordered
	 */
	protected YStateMachine stateMachine;

	/**
	 * The default value of the '{@link #getEffect() <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffect()
	 * @generated
	 * @ordered
	 */
	protected static final String EFFECT_EDEFAULT = "\"\"";

	/**
	 * The cached value of the '{@link #getEffect() <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffect()
	 * @generated
	 * @ordered
	 */
	protected String effect = EFFECT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCalledFrom() <em>Called From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalledFrom()
	 * @generated
	 * @ordered
	 */
	protected YStateMachineHandler calledFrom;

	/**
	 * The default value of the '{@link #getItsClassID() <em>Its Class ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItsClassID()
	 * @generated
	 * @ordered
	 */
	protected static final String ITS_CLASS_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getItsClassID() <em>Its Class ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItsClassID()
	 * @generated
	 * @ordered
	 */
	protected String itsClassID = ITS_CLASS_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOperationInstance() <em>Operation Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationInstance()
	 * @generated
	 * @ordered
	 */
	protected EObject operationInstance;

	/**
	 * The default value of the '{@link #getEffectsProcessed() <em>Effects Processed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectsProcessed()
	 * @generated
	 * @ordered
	 */
	protected static final int EFFECTS_PROCESSED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEffectsProcessed() <em>Effects Processed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectsProcessed()
	 * @generated
	 * @ordered
	 */
	protected int effectsProcessed = EFFECTS_PROCESSED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxEffectsToBeProcessed() <em>Max Effects To Be Processed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxEffectsToBeProcessed()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_EFFECTS_TO_BE_PROCESSED_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getMaxEffectsToBeProcessed() <em>Max Effects To Be Processed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxEffectsToBeProcessed()
	 * @generated
	 * @ordered
	 */
	protected int maxEffectsToBeProcessed = MAX_EFFECTS_TO_BE_PROCESSED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInAdapters() <em>In Adapters</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInAdapters()
	 * @generated
	 * @ordered
	 */
	protected EList<Object> inAdapters;

	/**
	 * The default value of the '{@link #getObjectsBindedWithInoutParameters() <em>Objects Binded With Inout Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectsBindedWithInoutParameters()
	 * @generated
	 * @ordered
	 */
	protected static final Object OBJECTS_BINDED_WITH_INOUT_PARAMETERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObjectsBindedWithInoutParameters() <em>Objects Binded With Inout Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectsBindedWithInoutParameters()
	 * @generated
	 * @ordered
	 */
	protected Object objectsBindedWithInoutParameters = OBJECTS_BINDED_WITH_INOUT_PARAMETERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getReturnVar() <em>Return Var</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnVar()
	 * @generated
	 * @ordered
	 */
	protected static final Object RETURN_VAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReturnVar() <em>Return Var</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnVar()
	 * @generated
	 * @ordered
	 */
	protected Object returnVar = RETURN_VAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getNameOfRetunVar() <em>Name Of Retun Var</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameOfRetunVar()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_OF_RETUN_VAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameOfRetunVar() <em>Name Of Retun Var</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameOfRetunVar()
	 * @generated
	 * @ordered
	 */
	protected String nameOfRetunVar = NAME_OF_RETUN_VAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getObjectsToColor() <em>Objects To Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectsToColor()
	 * @generated
	 * @ordered
	 */
	protected static final Object OBJECTS_TO_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObjectsToColor() <em>Objects To Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectsToColor()
	 * @generated
	 * @ordered
	 */
	protected Object objectsToColor = OBJECTS_TO_COLOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YStateMachineHandlerImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return YammDiagramPackage.Literals.YSTATE_MACHINE_HANDLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YVertex getState()
	{
		if (state != null && state.eIsProxy()) {
			InternalEObject oldState = (InternalEObject)state;
			state = (YVertex)eResolveProxy(oldState);
			if (state != oldState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammDiagramPackage.YSTATE_MACHINE_HANDLER__STATE, oldState, state));
			}
		}
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YVertex basicGetState()
	{
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(YVertex newState)
	{
		YVertex oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YSTATE_MACHINE_HANDLER__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YTransition getTransition()
	{
		if (transition != null && transition.eIsProxy()) {
			InternalEObject oldTransition = (InternalEObject)transition;
			transition = (YTransition)eResolveProxy(oldTransition);
			if (transition != oldTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammDiagramPackage.YSTATE_MACHINE_HANDLER__TRANSITION, oldTransition, transition));
			}
		}
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YTransition basicGetTransition()
	{
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransition(YTransition newTransition)
	{
		YTransition oldTransition = transition;
		transition = newTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YSTATE_MACHINE_HANDLER__TRANSITION, oldTransition, transition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsSuspended()
	{
		return isSuspended;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSuspended(boolean newIsSuspended)
	{
		boolean oldIsSuspended = isSuspended;
		isSuspended = newIsSuspended;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YSTATE_MACHINE_HANDLER__IS_SUSPENDED, oldIsSuspended, isSuspended));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEffectCount()
	{
		return effectCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffectCount(int newEffectCount)
	{
		int oldEffectCount = effectCount;
		effectCount = newEffectCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YSTATE_MACHINE_HANDLER__EFFECT_COUNT, oldEffectCount, effectCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEffectNo()
	{
		return effectNo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffectNo(int newEffectNo)
	{
		int oldEffectNo = effectNo;
		effectNo = newEffectNo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YSTATE_MACHINE_HANDLER__EFFECT_NO, oldEffectNo, effectNo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YStateMachine getStateMachine()
	{
		if (stateMachine != null && stateMachine.eIsProxy()) {
			InternalEObject oldStateMachine = (InternalEObject)stateMachine;
			stateMachine = (YStateMachine)eResolveProxy(oldStateMachine);
			if (stateMachine != oldStateMachine) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammDiagramPackage.YSTATE_MACHINE_HANDLER__STATE_MACHINE, oldStateMachine, stateMachine));
			}
		}
		return stateMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YStateMachine basicGetStateMachine()
	{
		return stateMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateMachine(YStateMachine newStateMachine)
	{
		YStateMachine oldStateMachine = stateMachine;
		stateMachine = newStateMachine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YSTATE_MACHINE_HANDLER__STATE_MACHINE, oldStateMachine, stateMachine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEffect()
	{
		return effect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffect(String newEffect)
	{
		String oldEffect = effect;
		effect = newEffect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YSTATE_MACHINE_HANDLER__EFFECT, oldEffect, effect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YStateMachineHandler getCalledFrom()
	{
		if (calledFrom != null && calledFrom.eIsProxy()) {
			InternalEObject oldCalledFrom = (InternalEObject)calledFrom;
			calledFrom = (YStateMachineHandler)eResolveProxy(oldCalledFrom);
			if (calledFrom != oldCalledFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammDiagramPackage.YSTATE_MACHINE_HANDLER__CALLED_FROM, oldCalledFrom, calledFrom));
			}
		}
		return calledFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YStateMachineHandler basicGetCalledFrom()
	{
		return calledFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalledFrom(YStateMachineHandler newCalledFrom)
	{
		YStateMachineHandler oldCalledFrom = calledFrom;
		calledFrom = newCalledFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YSTATE_MACHINE_HANDLER__CALLED_FROM, oldCalledFrom, calledFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getItsClassID()
	{
		return itsClassID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItsClassID(String newItsClassID)
	{
		String oldItsClassID = itsClassID;
		itsClassID = newItsClassID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YSTATE_MACHINE_HANDLER__ITS_CLASS_ID, oldItsClassID, itsClassID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getOperationInstance()
	{
		if (operationInstance != null && operationInstance.eIsProxy()) {
			InternalEObject oldOperationInstance = (InternalEObject)operationInstance;
			operationInstance = eResolveProxy(oldOperationInstance);
			if (operationInstance != oldOperationInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammDiagramPackage.YSTATE_MACHINE_HANDLER__OPERATION_INSTANCE, oldOperationInstance, operationInstance));
			}
		}
		return operationInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetOperationInstance()
	{
		return operationInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationInstance(EObject newOperationInstance)
	{
		EObject oldOperationInstance = operationInstance;
		operationInstance = newOperationInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YSTATE_MACHINE_HANDLER__OPERATION_INSTANCE, oldOperationInstance, operationInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEffectsProcessed()
	{
		return effectsProcessed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffectsProcessed(int newEffectsProcessed)
	{
		int oldEffectsProcessed = effectsProcessed;
		effectsProcessed = newEffectsProcessed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YSTATE_MACHINE_HANDLER__EFFECTS_PROCESSED, oldEffectsProcessed, effectsProcessed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxEffectsToBeProcessed()
	{
		return maxEffectsToBeProcessed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxEffectsToBeProcessed(int newMaxEffectsToBeProcessed)
	{
		int oldMaxEffectsToBeProcessed = maxEffectsToBeProcessed;
		maxEffectsToBeProcessed = newMaxEffectsToBeProcessed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YSTATE_MACHINE_HANDLER__MAX_EFFECTS_TO_BE_PROCESSED, oldMaxEffectsToBeProcessed, maxEffectsToBeProcessed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Object> getInAdapters()
	{
		if (inAdapters == null) {
			inAdapters = new EDataTypeUniqueEList<Object>(Object.class, this, YammDiagramPackage.YSTATE_MACHINE_HANDLER__IN_ADAPTERS);
		}
		return inAdapters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getObjectsBindedWithInoutParameters()
	{
		return objectsBindedWithInoutParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectsBindedWithInoutParameters(Object newObjectsBindedWithInoutParameters)
	{
		Object oldObjectsBindedWithInoutParameters = objectsBindedWithInoutParameters;
		objectsBindedWithInoutParameters = newObjectsBindedWithInoutParameters;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YSTATE_MACHINE_HANDLER__OBJECTS_BINDED_WITH_INOUT_PARAMETERS, oldObjectsBindedWithInoutParameters, objectsBindedWithInoutParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getReturnVar()
	{
		return returnVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnVar(Object newReturnVar)
	{
		Object oldReturnVar = returnVar;
		returnVar = newReturnVar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YSTATE_MACHINE_HANDLER__RETURN_VAR, oldReturnVar, returnVar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameOfRetunVar()
	{
		return nameOfRetunVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameOfRetunVar(String newNameOfRetunVar)
	{
		String oldNameOfRetunVar = nameOfRetunVar;
		nameOfRetunVar = newNameOfRetunVar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YSTATE_MACHINE_HANDLER__NAME_OF_RETUN_VAR, oldNameOfRetunVar, nameOfRetunVar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getObjectsToColor()
	{
		return objectsToColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectsToColor(Object newObjectsToColor)
	{
		Object oldObjectsToColor = objectsToColor;
		objectsToColor = newObjectsToColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YSTATE_MACHINE_HANDLER__OBJECTS_TO_COLOR, oldObjectsToColor, objectsToColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID) {
			case YammDiagramPackage.YSTATE_MACHINE_HANDLER__STATE:
				if (resolve) return getState();
				return basicGetState();
			case YammDiagramPackage.YSTATE_MACHINE_HANDLER__TRANSITION:
				if (resolve) return getTransition();
				return basicGetTransition();
			case YammDiagramPackage.YSTATE_MACHINE_HANDLER__IS_SUSPENDED:
				return isIsSuspended();
			case YammDiagramPackage.YSTATE_MACHINE_HANDLER__EFFECT_COUNT:
				return getEffectCount();
			case YammDiagramPackage.YSTATE_MACHINE_HANDLER__EFFECT_NO:
				return getEffectNo();
			case YammDiagramPackage.YSTATE_MACHINE_HANDLER__STATE_MACHINE:
				if (resolve) return getStateMachine();
				return basicGetStateMachine();
			case YammDiagramPackage.YSTATE_MACHINE_HANDLER__EFFECT:
				return getEffect();
			case YammDiagramPackage.YSTATE_MACHINE_HANDLER__CALLED_FROM:
				if (resolve) return getCalledFrom();
				return basicGetCalledFrom();
			case YammDiagramPackage.YSTATE_MACHINE_HANDLER__ITS_CLASS_ID:
				return getItsClassID();
			case YammDiagramPackage.YSTATE_MACHINE_HANDLER__OPERATION_INSTANCE:
				if (resolve) return getOperationInstance();
				return basicGetOperationInstance();
			case YammDiagramPackage.YSTATE_MACHINE_HANDLER__EFFECTS_PROCESSED:
				return getEffectsProcessed();
			case YammDiagramPackage.YSTATE_MACHINE_HANDLER__MAX_EFFECTS_TO_BE_PROCESSED:
				return getMaxEffectsToBeProcessed();
			case YammDiagramPackage.YSTATE_MACHINE_HANDLER__IN_ADAPTERS:
				return getInAdapters();
			case YammDiagramPackage.YSTATE_MACHINE_HANDLER__OBJECTS_BINDED_WITH_INOUT_PARAMETERS:
				return getObjectsBindedWithInoutParameters();
			case YammDiagramPackage.YSTATE_MACHINE_HANDLER__RETURN_VAR:
				return getReturnVar();
			case YammDiagramPackage.YSTATE_MACHINE_HANDLER__NAME_OF_RETUN_VAR:
				return getNameOfRetunVar();
			case YammDiagramPackage.YSTATE_MACHINE_HANDLER__OBJECTS_TO_COLOR:
				return getObjectsToColor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID) {
			case YammDiagramPackage.YSTATE_MACHINE_HANDLER__STATE:
				setState((YVertex)newValue);
				return;
			case YammDiagramPackage.YSTATE_MACHINE_HANDLER__TRANSITION:
				setTransition((YTransition)newValue);
				return;
			case YammDiagramPackage.YSTATE_MACHINE_HANDLER__IS_SUSPENDED:
				setIsSuspended((Boolean)newValue);
				return;
			case YammDiagramPackage.YSTATE_MACHINE_HANDLER__EFFECT_COUNT:
				setEffectCount((Integer)newValue);
				return;
			case YammDiagramPackage.YSTATE_MACHINE_HANDLER__EFFECT_NO:
				setEffectNo((Integer)newValue);
				return;
			case YammDiagramPackage.YSTATE_MACHINE_HANDLER__STATE_MACHINE:
				setStateMachine((YStateMachine)newValue);
				return;
			case YammDiagramPackage.YSTATE_MACHINE_HANDLER__EFFECT:
				setEffect((String)newValue);
				return;
			case YammDiagramPackage.YSTATE_MACHINE_HANDLER__CALLED_FROM:
				setCalledFrom((YStateMachineHandler)newValue);
				return;
			case YammDiagramPackage.YSTATE_MACHINE_HANDLER__ITS_CLASS_ID:
				setItsClassID((String)newValue);
				return;
			case YammDiagramPackage.YSTATE_MACHINE_HANDLER__OPERATION_INSTANCE:
				setOperationInstance((EObject)newValue);
				return;
			case YammDiagramPackage.YSTATE_MACHINE_HANDLER__EFFECTS_PROCESSED:
				setEffectsProcessed((Integer)newValue);
				return;
			case YammDiagramPackage.YSTATE_MACHINE_HANDLER__MAX_EFFECTS_TO_BE_PROCESSED:
				setMaxEffectsToBeProcessed((Integer)newValue);
				return;
			case YammDiagramPackage.YSTATE_MACHINE_HANDLER__IN_ADAPTERS:
				getInAdapters().clear();
				getInAdapters().addAll((Collection<? extends Object>)newValue);
				return;
			case YammDiagramPackage.YSTATE_MACHINE_HANDLER__OBJECTS_BINDED_WITH_INOUT_PARAMETERS:
				setObjectsBindedWithInoutParameters(newValue);
				return;
			case YammDiagramPackage.YSTATE_MACHINE_HANDLER__RETURN_VAR:
				setReturnVar(newValue);
				return;
			case YammDiagramPackage.YSTATE_MACHINE_HANDLER__NAME_OF_RETUN_VAR:
				setNameOfRetunVar((String)newValue);
				return;
			case YammDiagramPackage.YSTATE_MACHINE_HANDLER__OBJECTS_TO_COLOR:
				setObjectsToColor(newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID) {
			case YammDiagramPackage.YSTATE_MACHINE_HANDLER__STATE:
				setState((YVertex)null);
				return;
			case YammDiagramPackage.YSTATE_MACHINE_HANDLER__TRANSITION:
				setTransition((YTransition)null);
				return;
			case YammDiagramPackage.YSTATE_MACHINE_HANDLER__IS_SUSPENDED:
				setIsSuspended(IS_SUSPENDED_EDEFAULT);
				return;
			case YammDiagramPackage.YSTATE_MACHINE_HANDLER__EFFECT_COUNT:
				setEffectCount(EFFECT_COUNT_EDEFAULT);
				return;
			case YammDiagramPackage.YSTATE_MACHINE_HANDLER__EFFECT_NO:
				setEffectNo(EFFECT_NO_EDEFAULT);
				return;
			case YammDiagramPackage.YSTATE_MACHINE_HANDLER__STATE_MACHINE:
				setStateMachine((YStateMachine)null);
				return;
			case YammDiagramPackage.YSTATE_MACHINE_HANDLER__EFFECT:
				setEffect(EFFECT_EDEFAULT);
				return;
			case YammDiagramPackage.YSTATE_MACHINE_HANDLER__CALLED_FROM:
				setCalledFrom((YStateMachineHandler)null);
				return;
			case YammDiagramPackage.YSTATE_MACHINE_HANDLER__ITS_CLASS_ID:
				setItsClassID(ITS_CLASS_ID_EDEFAULT);
				return;
			case YammDiagramPackage.YSTATE_MACHINE_HANDLER__OPERATION_INSTANCE:
				setOperationInstance((EObject)null);
				return;
			case YammDiagramPackage.YSTATE_MACHINE_HANDLER__EFFECTS_PROCESSED:
				setEffectsProcessed(EFFECTS_PROCESSED_EDEFAULT);
				return;
			case YammDiagramPackage.YSTATE_MACHINE_HANDLER__MAX_EFFECTS_TO_BE_PROCESSED:
				setMaxEffectsToBeProcessed(MAX_EFFECTS_TO_BE_PROCESSED_EDEFAULT);
				return;
			case YammDiagramPackage.YSTATE_MACHINE_HANDLER__IN_ADAPTERS:
				getInAdapters().clear();
				return;
			case YammDiagramPackage.YSTATE_MACHINE_HANDLER__OBJECTS_BINDED_WITH_INOUT_PARAMETERS:
				setObjectsBindedWithInoutParameters(OBJECTS_BINDED_WITH_INOUT_PARAMETERS_EDEFAULT);
				return;
			case YammDiagramPackage.YSTATE_MACHINE_HANDLER__RETURN_VAR:
				setReturnVar(RETURN_VAR_EDEFAULT);
				return;
			case YammDiagramPackage.YSTATE_MACHINE_HANDLER__NAME_OF_RETUN_VAR:
				setNameOfRetunVar(NAME_OF_RETUN_VAR_EDEFAULT);
				return;
			case YammDiagramPackage.YSTATE_MACHINE_HANDLER__OBJECTS_TO_COLOR:
				setObjectsToColor(OBJECTS_TO_COLOR_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID) {
			case YammDiagramPackage.YSTATE_MACHINE_HANDLER__STATE:
				return state != null;
			case YammDiagramPackage.YSTATE_MACHINE_HANDLER__TRANSITION:
				return transition != null;
			case YammDiagramPackage.YSTATE_MACHINE_HANDLER__IS_SUSPENDED:
				return isSuspended != IS_SUSPENDED_EDEFAULT;
			case YammDiagramPackage.YSTATE_MACHINE_HANDLER__EFFECT_COUNT:
				return effectCount != EFFECT_COUNT_EDEFAULT;
			case YammDiagramPackage.YSTATE_MACHINE_HANDLER__EFFECT_NO:
				return effectNo != EFFECT_NO_EDEFAULT;
			case YammDiagramPackage.YSTATE_MACHINE_HANDLER__STATE_MACHINE:
				return stateMachine != null;
			case YammDiagramPackage.YSTATE_MACHINE_HANDLER__EFFECT:
				return EFFECT_EDEFAULT == null ? effect != null : !EFFECT_EDEFAULT.equals(effect);
			case YammDiagramPackage.YSTATE_MACHINE_HANDLER__CALLED_FROM:
				return calledFrom != null;
			case YammDiagramPackage.YSTATE_MACHINE_HANDLER__ITS_CLASS_ID:
				return ITS_CLASS_ID_EDEFAULT == null ? itsClassID != null : !ITS_CLASS_ID_EDEFAULT.equals(itsClassID);
			case YammDiagramPackage.YSTATE_MACHINE_HANDLER__OPERATION_INSTANCE:
				return operationInstance != null;
			case YammDiagramPackage.YSTATE_MACHINE_HANDLER__EFFECTS_PROCESSED:
				return effectsProcessed != EFFECTS_PROCESSED_EDEFAULT;
			case YammDiagramPackage.YSTATE_MACHINE_HANDLER__MAX_EFFECTS_TO_BE_PROCESSED:
				return maxEffectsToBeProcessed != MAX_EFFECTS_TO_BE_PROCESSED_EDEFAULT;
			case YammDiagramPackage.YSTATE_MACHINE_HANDLER__IN_ADAPTERS:
				return inAdapters != null && !inAdapters.isEmpty();
			case YammDiagramPackage.YSTATE_MACHINE_HANDLER__OBJECTS_BINDED_WITH_INOUT_PARAMETERS:
				return OBJECTS_BINDED_WITH_INOUT_PARAMETERS_EDEFAULT == null ? objectsBindedWithInoutParameters != null : !OBJECTS_BINDED_WITH_INOUT_PARAMETERS_EDEFAULT.equals(objectsBindedWithInoutParameters);
			case YammDiagramPackage.YSTATE_MACHINE_HANDLER__RETURN_VAR:
				return RETURN_VAR_EDEFAULT == null ? returnVar != null : !RETURN_VAR_EDEFAULT.equals(returnVar);
			case YammDiagramPackage.YSTATE_MACHINE_HANDLER__NAME_OF_RETUN_VAR:
				return NAME_OF_RETUN_VAR_EDEFAULT == null ? nameOfRetunVar != null : !NAME_OF_RETUN_VAR_EDEFAULT.equals(nameOfRetunVar);
			case YammDiagramPackage.YSTATE_MACHINE_HANDLER__OBJECTS_TO_COLOR:
				return OBJECTS_TO_COLOR_EDEFAULT == null ? objectsToColor != null : !OBJECTS_TO_COLOR_EDEFAULT.equals(objectsToColor);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (isSuspended: ");
		result.append(isSuspended);
		result.append(", effectCount: ");
		result.append(effectCount);
		result.append(", effectNo: ");
		result.append(effectNo);
		result.append(", effect: ");
		result.append(effect);
		result.append(", itsClassID: ");
		result.append(itsClassID);
		result.append(", effectsProcessed: ");
		result.append(effectsProcessed);
		result.append(", maxEffectsToBeProcessed: ");
		result.append(maxEffectsToBeProcessed);
		result.append(", inAdapters: ");
		result.append(inAdapters);
		result.append(", objectsBindedWithInoutParameters: ");
		result.append(objectsBindedWithInoutParameters);
		result.append(", returnVar: ");
		result.append(returnVar);
		result.append(", nameOfRetunVar: ");
		result.append(nameOfRetunVar);
		result.append(", objectsToColor: ");
		result.append(objectsToColor);
		result.append(')');
		return result.toString();
	}

} //YStateMachineHandlerImpl
