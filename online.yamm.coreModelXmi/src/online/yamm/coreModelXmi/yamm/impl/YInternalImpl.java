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
package online.yamm.coreModelXmi.yamm.impl;

import online.yamm.coreModelXmi.yamm.YGlobalStateMachine;
import online.yamm.coreModelXmi.yamm.YInternal;
import online.yamm.coreModelXmi.yamm.YammPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YInternal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YInternalImpl#getSimulationTime <em>Simulation Time</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YInternalImpl#getGlobalStateMachine <em>Global State Machine</em>}</li>
 * </ul>
 *
 * @generated
 */
public class YInternalImpl extends MinimalEObjectImpl.Container implements YInternal {
	/**
	 * The default value of the '{@link #getSimulationTime() <em>Simulation Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimulationTime()
	 * @generated
	 * @ordered
	 */
	protected static final int SIMULATION_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSimulationTime() <em>Simulation Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimulationTime()
	 * @generated
	 * @ordered
	 */
	protected int simulationTime = SIMULATION_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YInternalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return YammPackage.Literals.YINTERNAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSimulationTime() {
		return simulationTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimulationTime(int newSimulationTime) {
		int oldSimulationTime = simulationTime;
		simulationTime = newSimulationTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YINTERNAL__SIMULATION_TIME, oldSimulationTime, simulationTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YGlobalStateMachine getGlobalStateMachine() {
		if (eContainerFeatureID() != YammPackage.YINTERNAL__GLOBAL_STATE_MACHINE) return null;
		return (YGlobalStateMachine)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlobalStateMachine(YGlobalStateMachine newGlobalStateMachine, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGlobalStateMachine, YammPackage.YINTERNAL__GLOBAL_STATE_MACHINE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobalStateMachine(YGlobalStateMachine newGlobalStateMachine) {
		if (newGlobalStateMachine != eInternalContainer() || (eContainerFeatureID() != YammPackage.YINTERNAL__GLOBAL_STATE_MACHINE && newGlobalStateMachine != null)) {
			if (EcoreUtil.isAncestor(this, newGlobalStateMachine))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGlobalStateMachine != null)
				msgs = ((InternalEObject)newGlobalStateMachine).eInverseAdd(this, YammPackage.YGLOBAL_STATE_MACHINE__INTERNAL, YGlobalStateMachine.class, msgs);
			msgs = basicSetGlobalStateMachine(newGlobalStateMachine, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YINTERNAL__GLOBAL_STATE_MACHINE, newGlobalStateMachine, newGlobalStateMachine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case YammPackage.YINTERNAL__GLOBAL_STATE_MACHINE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGlobalStateMachine((YGlobalStateMachine)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case YammPackage.YINTERNAL__GLOBAL_STATE_MACHINE:
				return basicSetGlobalStateMachine(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case YammPackage.YINTERNAL__GLOBAL_STATE_MACHINE:
				return eInternalContainer().eInverseRemove(this, YammPackage.YGLOBAL_STATE_MACHINE__INTERNAL, YGlobalStateMachine.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case YammPackage.YINTERNAL__SIMULATION_TIME:
				return getSimulationTime();
			case YammPackage.YINTERNAL__GLOBAL_STATE_MACHINE:
				return getGlobalStateMachine();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case YammPackage.YINTERNAL__SIMULATION_TIME:
				setSimulationTime((Integer)newValue);
				return;
			case YammPackage.YINTERNAL__GLOBAL_STATE_MACHINE:
				setGlobalStateMachine((YGlobalStateMachine)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case YammPackage.YINTERNAL__SIMULATION_TIME:
				setSimulationTime(SIMULATION_TIME_EDEFAULT);
				return;
			case YammPackage.YINTERNAL__GLOBAL_STATE_MACHINE:
				setGlobalStateMachine((YGlobalStateMachine)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case YammPackage.YINTERNAL__SIMULATION_TIME:
				return simulationTime != SIMULATION_TIME_EDEFAULT;
			case YammPackage.YINTERNAL__GLOBAL_STATE_MACHINE:
				return getGlobalStateMachine() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (simulationTime: ");
		result.append(simulationTime);
		result.append(')');
		return result.toString();
	}

} //YInternalImpl
