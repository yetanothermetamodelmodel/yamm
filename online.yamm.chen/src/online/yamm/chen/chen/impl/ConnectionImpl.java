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
package online.yamm.chen.chen.impl;

import online.yamm.chen.chen.ChenPackage;
import online.yamm.chen.chen.Connection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link online.yamm.chen.chen.impl.ConnectionImpl#getRole <em>Role</em>}</li>
 *   <li>{@link online.yamm.chen.chen.impl.ConnectionImpl#getKardinality <em>Kardinality</em>}</li>
 *   <li>{@link online.yamm.chen.chen.impl.ConnectionImpl#isTotalPartizipation <em>Total Partizipation</em>}</li>
 *   <li>{@link online.yamm.chen.chen.impl.ConnectionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link online.yamm.chen.chen.impl.ConnectionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link online.yamm.chen.chen.impl.ConnectionImpl#isGeneralizationConnection <em>Generalization Connection</em>}</li>
 *   <li>{@link online.yamm.chen.chen.impl.ConnectionImpl#isGeneralization <em>Generalization</em>}</li>
 *   <li>{@link online.yamm.chen.chen.impl.ConnectionImpl#isGeneralizationOrientation <em>Generalization Orientation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionImpl extends MinimalEObjectImpl.Container implements Connection {
	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected String role = ROLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getKardinality() <em>Kardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKardinality()
	 * @generated
	 * @ordered
	 */
	protected static final String KARDINALITY_EDEFAULT = "1";

	/**
	 * The cached value of the '{@link #getKardinality() <em>Kardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKardinality()
	 * @generated
	 * @ordered
	 */
	protected String kardinality = KARDINALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isTotalPartizipation() <em>Total Partizipation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTotalPartizipation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TOTAL_PARTIZIPATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTotalPartizipation() <em>Total Partizipation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTotalPartizipation()
	 * @generated
	 * @ordered
	 */
	protected boolean totalPartizipation = TOTAL_PARTIZIPATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EObject source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EObject target;

	/**
	 * The default value of the '{@link #isGeneralizationConnection() <em>Generalization Connection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGeneralizationConnection()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERALIZATION_CONNECTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGeneralizationConnection() <em>Generalization Connection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGeneralizationConnection()
	 * @generated
	 * @ordered
	 */
	protected boolean generalizationConnection = GENERALIZATION_CONNECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isGeneralization() <em>Generalization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGeneralization()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERALIZATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGeneralization() <em>Generalization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGeneralization()
	 * @generated
	 * @ordered
	 */
	protected boolean generalization = GENERALIZATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isGeneralizationOrientation() <em>Generalization Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGeneralizationOrientation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERALIZATION_ORIENTATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGeneralizationOrientation() <em>Generalization Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGeneralizationOrientation()
	 * @generated
	 * @ordered
	 */
	protected boolean generalizationOrientation = GENERALIZATION_ORIENTATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChenPackage.Literals.CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTotalPartizipation() {
		return totalPartizipation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalPartizipation(boolean newTotalPartizipation) {
		boolean oldTotalPartizipation = totalPartizipation;
		totalPartizipation = newTotalPartizipation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChenPackage.CONNECTION__TOTAL_PARTIZIPATION, oldTotalPartizipation, totalPartizipation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(String newRole) {
		String oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChenPackage.CONNECTION__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ChenPackage.CONNECTION__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(EObject newSource) {
		EObject oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChenPackage.CONNECTION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ChenPackage.CONNECTION__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(EObject newTarget) {
		EObject oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChenPackage.CONNECTION__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKardinality() {
		return kardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKardinality(String newKardinality) {
		String oldKardinality = kardinality;
		kardinality = newKardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChenPackage.CONNECTION__KARDINALITY, oldKardinality, kardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGeneralizationConnection() {
		return generalizationConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneralizationConnection(boolean newGeneralizationConnection) {
		boolean oldGeneralizationConnection = generalizationConnection;
		generalizationConnection = newGeneralizationConnection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChenPackage.CONNECTION__GENERALIZATION_CONNECTION, oldGeneralizationConnection, generalizationConnection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGeneralization() {
		return generalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneralization(boolean newGeneralization) {
		boolean oldGeneralization = generalization;
		generalization = newGeneralization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChenPackage.CONNECTION__GENERALIZATION, oldGeneralization, generalization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGeneralizationOrientation() {
		return generalizationOrientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneralizationOrientation(boolean newGeneralizationOrientation) {
		boolean oldGeneralizationOrientation = generalizationOrientation;
		generalizationOrientation = newGeneralizationOrientation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChenPackage.CONNECTION__GENERALIZATION_ORIENTATION, oldGeneralizationOrientation, generalizationOrientation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ChenPackage.CONNECTION__ROLE:
				return getRole();
			case ChenPackage.CONNECTION__KARDINALITY:
				return getKardinality();
			case ChenPackage.CONNECTION__TOTAL_PARTIZIPATION:
				return isTotalPartizipation();
			case ChenPackage.CONNECTION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case ChenPackage.CONNECTION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case ChenPackage.CONNECTION__GENERALIZATION_CONNECTION:
				return isGeneralizationConnection();
			case ChenPackage.CONNECTION__GENERALIZATION:
				return isGeneralization();
			case ChenPackage.CONNECTION__GENERALIZATION_ORIENTATION:
				return isGeneralizationOrientation();
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
			case ChenPackage.CONNECTION__ROLE:
				setRole((String)newValue);
				return;
			case ChenPackage.CONNECTION__KARDINALITY:
				setKardinality((String)newValue);
				return;
			case ChenPackage.CONNECTION__TOTAL_PARTIZIPATION:
				setTotalPartizipation((Boolean)newValue);
				return;
			case ChenPackage.CONNECTION__SOURCE:
				setSource((EObject)newValue);
				return;
			case ChenPackage.CONNECTION__TARGET:
				setTarget((EObject)newValue);
				return;
			case ChenPackage.CONNECTION__GENERALIZATION_CONNECTION:
				setGeneralizationConnection((Boolean)newValue);
				return;
			case ChenPackage.CONNECTION__GENERALIZATION:
				setGeneralization((Boolean)newValue);
				return;
			case ChenPackage.CONNECTION__GENERALIZATION_ORIENTATION:
				setGeneralizationOrientation((Boolean)newValue);
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
			case ChenPackage.CONNECTION__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case ChenPackage.CONNECTION__KARDINALITY:
				setKardinality(KARDINALITY_EDEFAULT);
				return;
			case ChenPackage.CONNECTION__TOTAL_PARTIZIPATION:
				setTotalPartizipation(TOTAL_PARTIZIPATION_EDEFAULT);
				return;
			case ChenPackage.CONNECTION__SOURCE:
				setSource((EObject)null);
				return;
			case ChenPackage.CONNECTION__TARGET:
				setTarget((EObject)null);
				return;
			case ChenPackage.CONNECTION__GENERALIZATION_CONNECTION:
				setGeneralizationConnection(GENERALIZATION_CONNECTION_EDEFAULT);
				return;
			case ChenPackage.CONNECTION__GENERALIZATION:
				setGeneralization(GENERALIZATION_EDEFAULT);
				return;
			case ChenPackage.CONNECTION__GENERALIZATION_ORIENTATION:
				setGeneralizationOrientation(GENERALIZATION_ORIENTATION_EDEFAULT);
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
			case ChenPackage.CONNECTION__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case ChenPackage.CONNECTION__KARDINALITY:
				return KARDINALITY_EDEFAULT == null ? kardinality != null : !KARDINALITY_EDEFAULT.equals(kardinality);
			case ChenPackage.CONNECTION__TOTAL_PARTIZIPATION:
				return totalPartizipation != TOTAL_PARTIZIPATION_EDEFAULT;
			case ChenPackage.CONNECTION__SOURCE:
				return source != null;
			case ChenPackage.CONNECTION__TARGET:
				return target != null;
			case ChenPackage.CONNECTION__GENERALIZATION_CONNECTION:
				return generalizationConnection != GENERALIZATION_CONNECTION_EDEFAULT;
			case ChenPackage.CONNECTION__GENERALIZATION:
				return generalization != GENERALIZATION_EDEFAULT;
			case ChenPackage.CONNECTION__GENERALIZATION_ORIENTATION:
				return generalizationOrientation != GENERALIZATION_ORIENTATION_EDEFAULT;
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
		result.append(" (role: ");
		result.append(role);
		result.append(", kardinality: ");
		result.append(kardinality);
		result.append(", totalPartizipation: ");
		result.append(totalPartizipation);
		result.append(", generalizationConnection: ");
		result.append(generalizationConnection);
		result.append(", generalization: ");
		result.append(generalization);
		result.append(", generalizationOrientation: ");
		result.append(generalizationOrientation);
		result.append(')');
		return result.toString();
	}

} //ConnectionImpl
