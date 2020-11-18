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
package online.yamm.coreModelDiagram.yammDiagram.impl;

import java.util.Collection;

import online.yamm.coreModelDiagram.yammDiagram.YGlobalStateMachine;
import online.yamm.coreModelDiagram.yammDiagram.YOperation;
import online.yamm.coreModelDiagram.yammDiagram.YStateMachine;
import online.yamm.coreModelDiagram.yammDiagram.YStateMachineHandler;
import online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YGlobal State Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.impl.YGlobalStateMachineImpl#getStateMachines <em>State Machines</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.impl.YGlobalStateMachineImpl#getStateMachineHandlers <em>State Machine Handlers</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.impl.YGlobalStateMachineImpl#getStateMachineHandlerCount <em>State Machine Handler Count</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.impl.YGlobalStateMachineImpl#isConstraintsAllTrue <em>Constraints All True</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.impl.YGlobalStateMachineImpl#isHasReturnParam <em>Has Return Param</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.impl.YGlobalStateMachineImpl#getParamCount <em>Param Count</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.impl.YGlobalStateMachineImpl#getStateExitCount <em>State Exit Count</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.impl.YGlobalStateMachineImpl#getStateExitNo <em>State Exit No</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.impl.YGlobalStateMachineImpl#getO <em>O</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.impl.YGlobalStateMachineImpl#isObserverActive <em>Observer Active</em>}</li>
 * </ul>
 *
 * @generated
 */
public class YGlobalStateMachineImpl extends YObjectImpl implements YGlobalStateMachine
{
	/**
	 * The cached value of the '{@link #getStateMachines() <em>State Machines</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateMachines()
	 * @generated
	 * @ordered
	 */
	protected EList<YStateMachine> stateMachines;

	/**
	 * The cached value of the '{@link #getStateMachineHandlers() <em>State Machine Handlers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateMachineHandlers()
	 * @generated
	 * @ordered
	 */
	protected EList<YStateMachineHandler> stateMachineHandlers;

	/**
	 * The default value of the '{@link #getStateMachineHandlerCount() <em>State Machine Handler Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateMachineHandlerCount()
	 * @generated
	 * @ordered
	 */
	protected static final int STATE_MACHINE_HANDLER_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStateMachineHandlerCount() <em>State Machine Handler Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateMachineHandlerCount()
	 * @generated
	 * @ordered
	 */
	protected int stateMachineHandlerCount = STATE_MACHINE_HANDLER_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #isConstraintsAllTrue() <em>Constraints All True</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConstraintsAllTrue()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONSTRAINTS_ALL_TRUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isConstraintsAllTrue() <em>Constraints All True</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConstraintsAllTrue()
	 * @generated
	 * @ordered
	 */
	protected boolean constraintsAllTrue = CONSTRAINTS_ALL_TRUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isHasReturnParam() <em>Has Return Param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasReturnParam()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_RETURN_PARAM_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasReturnParam() <em>Has Return Param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasReturnParam()
	 * @generated
	 * @ordered
	 */
	protected boolean hasReturnParam = HAS_RETURN_PARAM_EDEFAULT;

	/**
	 * The default value of the '{@link #getParamCount() <em>Param Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParamCount()
	 * @generated
	 * @ordered
	 */
	protected static final int PARAM_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getParamCount() <em>Param Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParamCount()
	 * @generated
	 * @ordered
	 */
	protected int paramCount = PARAM_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getStateExitCount() <em>State Exit Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateExitCount()
	 * @generated
	 * @ordered
	 */
	protected static final int STATE_EXIT_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStateExitCount() <em>State Exit Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateExitCount()
	 * @generated
	 * @ordered
	 */
	protected int stateExitCount = STATE_EXIT_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getStateExitNo() <em>State Exit No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateExitNo()
	 * @generated
	 * @ordered
	 */
	protected static final int STATE_EXIT_NO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStateExitNo() <em>State Exit No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateExitNo()
	 * @generated
	 * @ordered
	 */
	protected int stateExitNo = STATE_EXIT_NO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getO() <em>O</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getO()
	 * @generated
	 * @ordered
	 */
	protected YOperation o;

	/**
	 * The default value of the '{@link #isObserverActive() <em>Observer Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isObserverActive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OBSERVER_ACTIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isObserverActive() <em>Observer Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isObserverActive()
	 * @generated
	 * @ordered
	 */
	protected boolean observerActive = OBSERVER_ACTIVE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YGlobalStateMachineImpl()
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
		return YammDiagramPackage.Literals.YGLOBAL_STATE_MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YStateMachine> getStateMachines()
	{
		if (stateMachines == null) {
			stateMachines = new EObjectResolvingEList<YStateMachine>(YStateMachine.class, this, YammDiagramPackage.YGLOBAL_STATE_MACHINE__STATE_MACHINES);
		}
		return stateMachines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YStateMachineHandler> getStateMachineHandlers()
	{
		if (stateMachineHandlers == null) {
			stateMachineHandlers = new EObjectResolvingEList<YStateMachineHandler>(YStateMachineHandler.class, this, YammDiagramPackage.YGLOBAL_STATE_MACHINE__STATE_MACHINE_HANDLERS);
		}
		return stateMachineHandlers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStateMachineHandlerCount()
	{
		return stateMachineHandlerCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateMachineHandlerCount(int newStateMachineHandlerCount)
	{
		int oldStateMachineHandlerCount = stateMachineHandlerCount;
		stateMachineHandlerCount = newStateMachineHandlerCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YGLOBAL_STATE_MACHINE__STATE_MACHINE_HANDLER_COUNT, oldStateMachineHandlerCount, stateMachineHandlerCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConstraintsAllTrue()
	{
		return constraintsAllTrue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraintsAllTrue(boolean newConstraintsAllTrue)
	{
		boolean oldConstraintsAllTrue = constraintsAllTrue;
		constraintsAllTrue = newConstraintsAllTrue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YGLOBAL_STATE_MACHINE__CONSTRAINTS_ALL_TRUE, oldConstraintsAllTrue, constraintsAllTrue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasReturnParam()
	{
		return hasReturnParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasReturnParam(boolean newHasReturnParam)
	{
		boolean oldHasReturnParam = hasReturnParam;
		hasReturnParam = newHasReturnParam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YGLOBAL_STATE_MACHINE__HAS_RETURN_PARAM, oldHasReturnParam, hasReturnParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getParamCount()
	{
		return paramCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParamCount(int newParamCount)
	{
		int oldParamCount = paramCount;
		paramCount = newParamCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YGLOBAL_STATE_MACHINE__PARAM_COUNT, oldParamCount, paramCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStateExitCount()
	{
		return stateExitCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateExitCount(int newStateExitCount)
	{
		int oldStateExitCount = stateExitCount;
		stateExitCount = newStateExitCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YGLOBAL_STATE_MACHINE__STATE_EXIT_COUNT, oldStateExitCount, stateExitCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStateExitNo()
	{
		return stateExitNo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateExitNo(int newStateExitNo)
	{
		int oldStateExitNo = stateExitNo;
		stateExitNo = newStateExitNo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YGLOBAL_STATE_MACHINE__STATE_EXIT_NO, oldStateExitNo, stateExitNo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YOperation getO()
	{
		if (o != null && o.eIsProxy()) {
			InternalEObject oldO = (InternalEObject)o;
			o = (YOperation)eResolveProxy(oldO);
			if (o != oldO) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammDiagramPackage.YGLOBAL_STATE_MACHINE__O, oldO, o));
			}
		}
		return o;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YOperation basicGetO()
	{
		return o;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setO(YOperation newO)
	{
		YOperation oldO = o;
		o = newO;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YGLOBAL_STATE_MACHINE__O, oldO, o));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isObserverActive()
	{
		return observerActive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObserverActive(boolean newObserverActive)
	{
		boolean oldObserverActive = observerActive;
		observerActive = newObserverActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YGLOBAL_STATE_MACHINE__OBSERVER_ACTIVE, oldObserverActive, observerActive));
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
			case YammDiagramPackage.YGLOBAL_STATE_MACHINE__STATE_MACHINES:
				return getStateMachines();
			case YammDiagramPackage.YGLOBAL_STATE_MACHINE__STATE_MACHINE_HANDLERS:
				return getStateMachineHandlers();
			case YammDiagramPackage.YGLOBAL_STATE_MACHINE__STATE_MACHINE_HANDLER_COUNT:
				return getStateMachineHandlerCount();
			case YammDiagramPackage.YGLOBAL_STATE_MACHINE__CONSTRAINTS_ALL_TRUE:
				return isConstraintsAllTrue();
			case YammDiagramPackage.YGLOBAL_STATE_MACHINE__HAS_RETURN_PARAM:
				return isHasReturnParam();
			case YammDiagramPackage.YGLOBAL_STATE_MACHINE__PARAM_COUNT:
				return getParamCount();
			case YammDiagramPackage.YGLOBAL_STATE_MACHINE__STATE_EXIT_COUNT:
				return getStateExitCount();
			case YammDiagramPackage.YGLOBAL_STATE_MACHINE__STATE_EXIT_NO:
				return getStateExitNo();
			case YammDiagramPackage.YGLOBAL_STATE_MACHINE__O:
				if (resolve) return getO();
				return basicGetO();
			case YammDiagramPackage.YGLOBAL_STATE_MACHINE__OBSERVER_ACTIVE:
				return isObserverActive();
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
			case YammDiagramPackage.YGLOBAL_STATE_MACHINE__STATE_MACHINES:
				getStateMachines().clear();
				getStateMachines().addAll((Collection<? extends YStateMachine>)newValue);
				return;
			case YammDiagramPackage.YGLOBAL_STATE_MACHINE__STATE_MACHINE_HANDLERS:
				getStateMachineHandlers().clear();
				getStateMachineHandlers().addAll((Collection<? extends YStateMachineHandler>)newValue);
				return;
			case YammDiagramPackage.YGLOBAL_STATE_MACHINE__STATE_MACHINE_HANDLER_COUNT:
				setStateMachineHandlerCount((Integer)newValue);
				return;
			case YammDiagramPackage.YGLOBAL_STATE_MACHINE__CONSTRAINTS_ALL_TRUE:
				setConstraintsAllTrue((Boolean)newValue);
				return;
			case YammDiagramPackage.YGLOBAL_STATE_MACHINE__HAS_RETURN_PARAM:
				setHasReturnParam((Boolean)newValue);
				return;
			case YammDiagramPackage.YGLOBAL_STATE_MACHINE__PARAM_COUNT:
				setParamCount((Integer)newValue);
				return;
			case YammDiagramPackage.YGLOBAL_STATE_MACHINE__STATE_EXIT_COUNT:
				setStateExitCount((Integer)newValue);
				return;
			case YammDiagramPackage.YGLOBAL_STATE_MACHINE__STATE_EXIT_NO:
				setStateExitNo((Integer)newValue);
				return;
			case YammDiagramPackage.YGLOBAL_STATE_MACHINE__O:
				setO((YOperation)newValue);
				return;
			case YammDiagramPackage.YGLOBAL_STATE_MACHINE__OBSERVER_ACTIVE:
				setObserverActive((Boolean)newValue);
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
			case YammDiagramPackage.YGLOBAL_STATE_MACHINE__STATE_MACHINES:
				getStateMachines().clear();
				return;
			case YammDiagramPackage.YGLOBAL_STATE_MACHINE__STATE_MACHINE_HANDLERS:
				getStateMachineHandlers().clear();
				return;
			case YammDiagramPackage.YGLOBAL_STATE_MACHINE__STATE_MACHINE_HANDLER_COUNT:
				setStateMachineHandlerCount(STATE_MACHINE_HANDLER_COUNT_EDEFAULT);
				return;
			case YammDiagramPackage.YGLOBAL_STATE_MACHINE__CONSTRAINTS_ALL_TRUE:
				setConstraintsAllTrue(CONSTRAINTS_ALL_TRUE_EDEFAULT);
				return;
			case YammDiagramPackage.YGLOBAL_STATE_MACHINE__HAS_RETURN_PARAM:
				setHasReturnParam(HAS_RETURN_PARAM_EDEFAULT);
				return;
			case YammDiagramPackage.YGLOBAL_STATE_MACHINE__PARAM_COUNT:
				setParamCount(PARAM_COUNT_EDEFAULT);
				return;
			case YammDiagramPackage.YGLOBAL_STATE_MACHINE__STATE_EXIT_COUNT:
				setStateExitCount(STATE_EXIT_COUNT_EDEFAULT);
				return;
			case YammDiagramPackage.YGLOBAL_STATE_MACHINE__STATE_EXIT_NO:
				setStateExitNo(STATE_EXIT_NO_EDEFAULT);
				return;
			case YammDiagramPackage.YGLOBAL_STATE_MACHINE__O:
				setO((YOperation)null);
				return;
			case YammDiagramPackage.YGLOBAL_STATE_MACHINE__OBSERVER_ACTIVE:
				setObserverActive(OBSERVER_ACTIVE_EDEFAULT);
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
			case YammDiagramPackage.YGLOBAL_STATE_MACHINE__STATE_MACHINES:
				return stateMachines != null && !stateMachines.isEmpty();
			case YammDiagramPackage.YGLOBAL_STATE_MACHINE__STATE_MACHINE_HANDLERS:
				return stateMachineHandlers != null && !stateMachineHandlers.isEmpty();
			case YammDiagramPackage.YGLOBAL_STATE_MACHINE__STATE_MACHINE_HANDLER_COUNT:
				return stateMachineHandlerCount != STATE_MACHINE_HANDLER_COUNT_EDEFAULT;
			case YammDiagramPackage.YGLOBAL_STATE_MACHINE__CONSTRAINTS_ALL_TRUE:
				return constraintsAllTrue != CONSTRAINTS_ALL_TRUE_EDEFAULT;
			case YammDiagramPackage.YGLOBAL_STATE_MACHINE__HAS_RETURN_PARAM:
				return hasReturnParam != HAS_RETURN_PARAM_EDEFAULT;
			case YammDiagramPackage.YGLOBAL_STATE_MACHINE__PARAM_COUNT:
				return paramCount != PARAM_COUNT_EDEFAULT;
			case YammDiagramPackage.YGLOBAL_STATE_MACHINE__STATE_EXIT_COUNT:
				return stateExitCount != STATE_EXIT_COUNT_EDEFAULT;
			case YammDiagramPackage.YGLOBAL_STATE_MACHINE__STATE_EXIT_NO:
				return stateExitNo != STATE_EXIT_NO_EDEFAULT;
			case YammDiagramPackage.YGLOBAL_STATE_MACHINE__O:
				return o != null;
			case YammDiagramPackage.YGLOBAL_STATE_MACHINE__OBSERVER_ACTIVE:
				return observerActive != OBSERVER_ACTIVE_EDEFAULT;
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
		result.append(" (stateMachineHandlerCount: ");
		result.append(stateMachineHandlerCount);
		result.append(", constraintsAllTrue: ");
		result.append(constraintsAllTrue);
		result.append(", hasReturnParam: ");
		result.append(hasReturnParam);
		result.append(", paramCount: ");
		result.append(paramCount);
		result.append(", stateExitCount: ");
		result.append(stateExitCount);
		result.append(", stateExitNo: ");
		result.append(stateExitNo);
		result.append(", observerActive: ");
		result.append(observerActive);
		result.append(')');
		return result.toString();
	}

} //YGlobalStateMachineImpl
