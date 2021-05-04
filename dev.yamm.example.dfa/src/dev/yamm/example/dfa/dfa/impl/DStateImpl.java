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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import dev.yamm.example.dfa.dfa.DState;
import dev.yamm.example.dfa.dfa.DTransition;
import dev.yamm.example.dfa.dfa.DfaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DState</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dev.yamm.example.dfa.dfa.impl.DStateImpl#getStateName <em>State Name</em>}</li>
 *   <li>{@link dev.yamm.example.dfa.dfa.impl.DStateImpl#getDIn <em>DIn</em>}</li>
 *   <li>{@link dev.yamm.example.dfa.dfa.impl.DStateImpl#getDOut <em>DOut</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DStateImpl extends RObjectImpl implements DState {
	/**
	 * The default value of the '{@link #getStateName() <em>State Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateName()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStateName() <em>State Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateName()
	 * @generated
	 * @ordered
	 */
	protected String stateName = STATE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDIn() <em>DIn</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDIn()
	 * @generated
	 * @ordered
	 */
	protected EList<DTransition> dIn;

	/**
	 * The cached value of the '{@link #getDOut() <em>DOut</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDOut()
	 * @generated
	 * @ordered
	 */
	protected EList<DTransition> dOut;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DfaPackage.Literals.DSTATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStateName() {
		return stateName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateName(String newStateName) {
		String oldStateName = stateName;
		stateName = newStateName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DfaPackage.DSTATE__STATE_NAME, oldStateName, stateName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DTransition> getDIn() {
		if (dIn == null) {
			dIn = new EObjectResolvingEList<DTransition>(DTransition.class, this, DfaPackage.DSTATE__DIN);
		}
		return dIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DTransition> getDOut() {
		if (dOut == null) {
			dOut = new EObjectResolvingEList<DTransition>(DTransition.class, this, DfaPackage.DSTATE__DOUT);
		}
		return dOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DfaPackage.DSTATE__STATE_NAME:
				return getStateName();
			case DfaPackage.DSTATE__DIN:
				return getDIn();
			case DfaPackage.DSTATE__DOUT:
				return getDOut();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DfaPackage.DSTATE__STATE_NAME:
				setStateName((String)newValue);
				return;
			case DfaPackage.DSTATE__DIN:
				getDIn().clear();
				getDIn().addAll((Collection<? extends DTransition>)newValue);
				return;
			case DfaPackage.DSTATE__DOUT:
				getDOut().clear();
				getDOut().addAll((Collection<? extends DTransition>)newValue);
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
			case DfaPackage.DSTATE__STATE_NAME:
				setStateName(STATE_NAME_EDEFAULT);
				return;
			case DfaPackage.DSTATE__DIN:
				getDIn().clear();
				return;
			case DfaPackage.DSTATE__DOUT:
				getDOut().clear();
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
			case DfaPackage.DSTATE__STATE_NAME:
				return STATE_NAME_EDEFAULT == null ? stateName != null : !STATE_NAME_EDEFAULT.equals(stateName);
			case DfaPackage.DSTATE__DIN:
				return dIn != null && !dIn.isEmpty();
			case DfaPackage.DSTATE__DOUT:
				return dOut != null && !dOut.isEmpty();
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
		result.append(" (stateName: ");
		result.append(stateName);
		result.append(')');
		return result.toString();
	}

} //DStateImpl
