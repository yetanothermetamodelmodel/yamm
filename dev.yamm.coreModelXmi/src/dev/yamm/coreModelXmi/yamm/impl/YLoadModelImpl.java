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
package dev.yamm.coreModelXmi.yamm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.xbase.XExpression;

import org.eclipse.xtext.xbase.impl.XExpressionImpl;

import dev.yamm.coreModelXmi.yamm.YLoadModel;
import dev.yamm.coreModelXmi.yamm.YammPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YLoad Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YLoadModelImpl#getRelModelPath <em>Rel Model Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class YLoadModelImpl extends XExpressionImpl implements YLoadModel
{
	/**
	 * The cached value of the '{@link #getRelModelPath() <em>Rel Model Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelModelPath()
	 * @generated
	 * @ordered
	 */
	protected XExpression relModelPath;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YLoadModelImpl()
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
		return YammPackage.Literals.YLOAD_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XExpression getRelModelPath()
	{
		return relModelPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelModelPath(XExpression newRelModelPath, NotificationChain msgs)
	{
		XExpression oldRelModelPath = relModelPath;
		relModelPath = newRelModelPath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, YammPackage.YLOAD_MODEL__REL_MODEL_PATH, oldRelModelPath, newRelModelPath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelModelPath(XExpression newRelModelPath)
	{
		if (newRelModelPath != relModelPath) {
			NotificationChain msgs = null;
			if (relModelPath != null)
				msgs = ((InternalEObject)relModelPath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - YammPackage.YLOAD_MODEL__REL_MODEL_PATH, null, msgs);
			if (newRelModelPath != null)
				msgs = ((InternalEObject)newRelModelPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - YammPackage.YLOAD_MODEL__REL_MODEL_PATH, null, msgs);
			msgs = basicSetRelModelPath(newRelModelPath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YLOAD_MODEL__REL_MODEL_PATH, newRelModelPath, newRelModelPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID) {
			case YammPackage.YLOAD_MODEL__REL_MODEL_PATH:
				return basicSetRelModelPath(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case YammPackage.YLOAD_MODEL__REL_MODEL_PATH:
				return getRelModelPath();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID) {
			case YammPackage.YLOAD_MODEL__REL_MODEL_PATH:
				setRelModelPath((XExpression)newValue);
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
			case YammPackage.YLOAD_MODEL__REL_MODEL_PATH:
				setRelModelPath((XExpression)null);
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
			case YammPackage.YLOAD_MODEL__REL_MODEL_PATH:
				return relModelPath != null;
		}
		return super.eIsSet(featureID);
	}

} //YLoadModelImpl