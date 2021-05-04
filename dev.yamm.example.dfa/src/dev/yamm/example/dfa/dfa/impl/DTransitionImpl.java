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
package dev.yamm.example.dfa.dfa.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import dev.yamm.example.dfa.dfa.DState;
import dev.yamm.example.dfa.dfa.DTransition;
import dev.yamm.example.dfa.dfa.DfaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DTransition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dev.yamm.example.dfa.dfa.impl.DTransitionImpl#getDTarget <em>DTarget</em>}</li>
 *   <li>{@link dev.yamm.example.dfa.dfa.impl.DTransitionImpl#getDSource <em>DSource</em>}</li>
 *   <li>{@link dev.yamm.example.dfa.dfa.impl.DTransitionImpl#getTransitionName <em>Transition Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DTransitionImpl extends RObjectImpl implements DTransition {
	/**
	 * The cached value of the '{@link #getDTarget() <em>DTarget</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDTarget()
	 * @generated
	 * @ordered
	 */
	protected DState dTarget;

	/**
	 * The cached value of the '{@link #getDSource() <em>DSource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDSource()
	 * @generated
	 * @ordered
	 */
	protected DState dSource;

	/**
	 * The default value of the '{@link #getTransitionName() <em>Transition Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionName()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSITION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransitionName() <em>Transition Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionName()
	 * @generated
	 * @ordered
	 */
	protected String transitionName = TRANSITION_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DfaPackage.Literals.DTRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DState getDTarget() {
		if (dTarget != null && dTarget.eIsProxy()) {
			InternalEObject oldDTarget = (InternalEObject)dTarget;
			dTarget = (DState)eResolveProxy(oldDTarget);
			if (dTarget != oldDTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DfaPackage.DTRANSITION__DTARGET, oldDTarget, dTarget));
			}
		}
		return dTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DState basicGetDTarget() {
		return dTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDTarget(DState newDTarget) {
		DState oldDTarget = dTarget;
		dTarget = newDTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DfaPackage.DTRANSITION__DTARGET, oldDTarget, dTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DState getDSource() {
		if (dSource != null && dSource.eIsProxy()) {
			InternalEObject oldDSource = (InternalEObject)dSource;
			dSource = (DState)eResolveProxy(oldDSource);
			if (dSource != oldDSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DfaPackage.DTRANSITION__DSOURCE, oldDSource, dSource));
			}
		}
		return dSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DState basicGetDSource() {
		return dSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDSource(DState newDSource) {
		DState oldDSource = dSource;
		dSource = newDSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DfaPackage.DTRANSITION__DSOURCE, oldDSource, dSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransitionName() {
		return transitionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransitionName(String newTransitionName) {
		String oldTransitionName = transitionName;
		transitionName = newTransitionName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DfaPackage.DTRANSITION__TRANSITION_NAME, oldTransitionName, transitionName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DfaPackage.DTRANSITION__DTARGET:
				if (resolve) return getDTarget();
				return basicGetDTarget();
			case DfaPackage.DTRANSITION__DSOURCE:
				if (resolve) return getDSource();
				return basicGetDSource();
			case DfaPackage.DTRANSITION__TRANSITION_NAME:
				return getTransitionName();
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
			case DfaPackage.DTRANSITION__DTARGET:
				setDTarget((DState)newValue);
				return;
			case DfaPackage.DTRANSITION__DSOURCE:
				setDSource((DState)newValue);
				return;
			case DfaPackage.DTRANSITION__TRANSITION_NAME:
				setTransitionName((String)newValue);
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
			case DfaPackage.DTRANSITION__DTARGET:
				setDTarget((DState)null);
				return;
			case DfaPackage.DTRANSITION__DSOURCE:
				setDSource((DState)null);
				return;
			case DfaPackage.DTRANSITION__TRANSITION_NAME:
				setTransitionName(TRANSITION_NAME_EDEFAULT);
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
			case DfaPackage.DTRANSITION__DTARGET:
				return dTarget != null;
			case DfaPackage.DTRANSITION__DSOURCE:
				return dSource != null;
			case DfaPackage.DTRANSITION__TRANSITION_NAME:
				return TRANSITION_NAME_EDEFAULT == null ? transitionName != null : !TRANSITION_NAME_EDEFAULT.equals(transitionName);
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
		result.append(" (transitionName: ");
		result.append(transitionName);
		result.append(')');
		return result.toString();
	}

} //DTransitionImpl
