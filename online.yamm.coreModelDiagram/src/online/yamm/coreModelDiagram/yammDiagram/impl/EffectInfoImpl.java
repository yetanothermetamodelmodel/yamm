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

import online.yamm.coreModelDiagram.yammDiagram.EffectInfo;
import online.yamm.coreModelDiagram.yammDiagram.Line;
import online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Effect Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.impl.EffectInfoImpl#getFirstLineEffect <em>First Line Effect</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.impl.EffectInfoImpl#getLastLineEffect <em>Last Line Effect</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.impl.EffectInfoImpl#isIgnoreNotification <em>Ignore Notification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EffectInfoImpl extends FeatureInfoImpl implements EffectInfo
{
	/**
	 * The cached value of the '{@link #getFirstLineEffect() <em>First Line Effect</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstLineEffect()
	 * @generated
	 * @ordered
	 */
	protected Line firstLineEffect;

	/**
	 * The cached value of the '{@link #getLastLineEffect() <em>Last Line Effect</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastLineEffect()
	 * @generated
	 * @ordered
	 */
	protected Line lastLineEffect;

	/**
	 * The default value of the '{@link #isIgnoreNotification() <em>Ignore Notification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIgnoreNotification()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IGNORE_NOTIFICATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIgnoreNotification() <em>Ignore Notification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIgnoreNotification()
	 * @generated
	 * @ordered
	 */
	protected boolean ignoreNotification = IGNORE_NOTIFICATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EffectInfoImpl()
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
		return YammDiagramPackage.Literals.EFFECT_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Line getFirstLineEffect()
	{
		if (firstLineEffect != null && firstLineEffect.eIsProxy()) {
			InternalEObject oldFirstLineEffect = (InternalEObject)firstLineEffect;
			firstLineEffect = (Line)eResolveProxy(oldFirstLineEffect);
			if (firstLineEffect != oldFirstLineEffect) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammDiagramPackage.EFFECT_INFO__FIRST_LINE_EFFECT, oldFirstLineEffect, firstLineEffect));
			}
		}
		return firstLineEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Line basicGetFirstLineEffect()
	{
		return firstLineEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstLineEffect(Line newFirstLineEffect)
	{
		Line oldFirstLineEffect = firstLineEffect;
		firstLineEffect = newFirstLineEffect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.EFFECT_INFO__FIRST_LINE_EFFECT, oldFirstLineEffect, firstLineEffect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Line getLastLineEffect()
	{
		if (lastLineEffect != null && lastLineEffect.eIsProxy()) {
			InternalEObject oldLastLineEffect = (InternalEObject)lastLineEffect;
			lastLineEffect = (Line)eResolveProxy(oldLastLineEffect);
			if (lastLineEffect != oldLastLineEffect) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammDiagramPackage.EFFECT_INFO__LAST_LINE_EFFECT, oldLastLineEffect, lastLineEffect));
			}
		}
		return lastLineEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Line basicGetLastLineEffect()
	{
		return lastLineEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastLineEffect(Line newLastLineEffect)
	{
		Line oldLastLineEffect = lastLineEffect;
		lastLineEffect = newLastLineEffect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.EFFECT_INFO__LAST_LINE_EFFECT, oldLastLineEffect, lastLineEffect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIgnoreNotification()
	{
		return ignoreNotification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIgnoreNotification(boolean newIgnoreNotification)
	{
		boolean oldIgnoreNotification = ignoreNotification;
		ignoreNotification = newIgnoreNotification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.EFFECT_INFO__IGNORE_NOTIFICATION, oldIgnoreNotification, ignoreNotification));
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
			case YammDiagramPackage.EFFECT_INFO__FIRST_LINE_EFFECT:
				if (resolve) return getFirstLineEffect();
				return basicGetFirstLineEffect();
			case YammDiagramPackage.EFFECT_INFO__LAST_LINE_EFFECT:
				if (resolve) return getLastLineEffect();
				return basicGetLastLineEffect();
			case YammDiagramPackage.EFFECT_INFO__IGNORE_NOTIFICATION:
				return isIgnoreNotification();
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
			case YammDiagramPackage.EFFECT_INFO__FIRST_LINE_EFFECT:
				setFirstLineEffect((Line)newValue);
				return;
			case YammDiagramPackage.EFFECT_INFO__LAST_LINE_EFFECT:
				setLastLineEffect((Line)newValue);
				return;
			case YammDiagramPackage.EFFECT_INFO__IGNORE_NOTIFICATION:
				setIgnoreNotification((Boolean)newValue);
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
			case YammDiagramPackage.EFFECT_INFO__FIRST_LINE_EFFECT:
				setFirstLineEffect((Line)null);
				return;
			case YammDiagramPackage.EFFECT_INFO__LAST_LINE_EFFECT:
				setLastLineEffect((Line)null);
				return;
			case YammDiagramPackage.EFFECT_INFO__IGNORE_NOTIFICATION:
				setIgnoreNotification(IGNORE_NOTIFICATION_EDEFAULT);
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
			case YammDiagramPackage.EFFECT_INFO__FIRST_LINE_EFFECT:
				return firstLineEffect != null;
			case YammDiagramPackage.EFFECT_INFO__LAST_LINE_EFFECT:
				return lastLineEffect != null;
			case YammDiagramPackage.EFFECT_INFO__IGNORE_NOTIFICATION:
				return ignoreNotification != IGNORE_NOTIFICATION_EDEFAULT;
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
		result.append(" (ignoreNotification: ");
		result.append(ignoreNotification);
		result.append(')');
		return result.toString();
	}

} //EffectInfoImpl
