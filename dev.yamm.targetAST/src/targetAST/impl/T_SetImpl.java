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
package targetAST.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import targetAST.T_ExpLevelA;
import targetAST.T_Set;
import targetAST.TargetASTPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TSet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link targetAST.impl.T_SetImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link targetAST.impl.T_SetImpl#isObjectIsParam <em>Object Is Param</em>}</li>
 *   <li>{@link targetAST.impl.T_SetImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class T_SetImpl extends T_ExpLevelBImpl implements T_Set {
	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<String> features;

	/**
	 * The default value of the '{@link #isObjectIsParam() <em>Object Is Param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isObjectIsParam()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OBJECT_IS_PARAM_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isObjectIsParam() <em>Object Is Param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isObjectIsParam()
	 * @generated
	 * @ordered
	 */
	protected boolean objectIsParam = OBJECT_IS_PARAM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected T_ExpLevelA value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected T_SetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TargetASTPackage.Literals.TSET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getFeatures() {
		if (features == null) {
			features = new EDataTypeEList<String>(String.class, this, TargetASTPackage.TSET__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isObjectIsParam() {
		return objectIsParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectIsParam(boolean newObjectIsParam) {
		boolean oldObjectIsParam = objectIsParam;
		objectIsParam = newObjectIsParam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetASTPackage.TSET__OBJECT_IS_PARAM, oldObjectIsParam, objectIsParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T_ExpLevelA getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(T_ExpLevelA newValue, NotificationChain msgs) {
		T_ExpLevelA oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TargetASTPackage.TSET__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(T_ExpLevelA newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TargetASTPackage.TSET__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TargetASTPackage.TSET__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetASTPackage.TSET__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TargetASTPackage.TSET__VALUE:
				return basicSetValue(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TargetASTPackage.TSET__FEATURES:
				return getFeatures();
			case TargetASTPackage.TSET__OBJECT_IS_PARAM:
				return isObjectIsParam();
			case TargetASTPackage.TSET__VALUE:
				return getValue();
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
			case TargetASTPackage.TSET__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends String>)newValue);
				return;
			case TargetASTPackage.TSET__OBJECT_IS_PARAM:
				setObjectIsParam((Boolean)newValue);
				return;
			case TargetASTPackage.TSET__VALUE:
				setValue((T_ExpLevelA)newValue);
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
			case TargetASTPackage.TSET__FEATURES:
				getFeatures().clear();
				return;
			case TargetASTPackage.TSET__OBJECT_IS_PARAM:
				setObjectIsParam(OBJECT_IS_PARAM_EDEFAULT);
				return;
			case TargetASTPackage.TSET__VALUE:
				setValue((T_ExpLevelA)null);
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
			case TargetASTPackage.TSET__FEATURES:
				return features != null && !features.isEmpty();
			case TargetASTPackage.TSET__OBJECT_IS_PARAM:
				return objectIsParam != OBJECT_IS_PARAM_EDEFAULT;
			case TargetASTPackage.TSET__VALUE:
				return value != null;
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
		result.append(" (features: ");
		result.append(features);
		result.append(", objectIsParam: ");
		result.append(objectIsParam);
		result.append(')');
		return result.toString();
	}

} //T_SetImpl
