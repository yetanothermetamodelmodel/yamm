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

import online.yamm.coreModelDiagram.yammDiagram.GuardInfo;
import online.yamm.coreModelDiagram.yammDiagram.Line;
import online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Guard Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.impl.GuardInfoImpl#getFirstLineGuard <em>First Line Guard</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.impl.GuardInfoImpl#getLastLineGuard <em>Last Line Guard</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.impl.GuardInfoImpl#isIgnoreNotification <em>Ignore Notification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GuardInfoImpl extends FeatureInfoImpl implements GuardInfo
{
	/**
	 * The cached value of the '{@link #getFirstLineGuard() <em>First Line Guard</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstLineGuard()
	 * @generated
	 * @ordered
	 */
	protected Line firstLineGuard;

	/**
	 * The cached value of the '{@link #getLastLineGuard() <em>Last Line Guard</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastLineGuard()
	 * @generated
	 * @ordered
	 */
	protected Line lastLineGuard;

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
	protected GuardInfoImpl()
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
		return YammDiagramPackage.Literals.GUARD_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Line getFirstLineGuard()
	{
		if (firstLineGuard != null && firstLineGuard.eIsProxy()) {
			InternalEObject oldFirstLineGuard = (InternalEObject)firstLineGuard;
			firstLineGuard = (Line)eResolveProxy(oldFirstLineGuard);
			if (firstLineGuard != oldFirstLineGuard) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammDiagramPackage.GUARD_INFO__FIRST_LINE_GUARD, oldFirstLineGuard, firstLineGuard));
			}
		}
		return firstLineGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Line basicGetFirstLineGuard()
	{
		return firstLineGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstLineGuard(Line newFirstLineGuard)
	{
		Line oldFirstLineGuard = firstLineGuard;
		firstLineGuard = newFirstLineGuard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.GUARD_INFO__FIRST_LINE_GUARD, oldFirstLineGuard, firstLineGuard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Line getLastLineGuard()
	{
		if (lastLineGuard != null && lastLineGuard.eIsProxy()) {
			InternalEObject oldLastLineGuard = (InternalEObject)lastLineGuard;
			lastLineGuard = (Line)eResolveProxy(oldLastLineGuard);
			if (lastLineGuard != oldLastLineGuard) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammDiagramPackage.GUARD_INFO__LAST_LINE_GUARD, oldLastLineGuard, lastLineGuard));
			}
		}
		return lastLineGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Line basicGetLastLineGuard()
	{
		return lastLineGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastLineGuard(Line newLastLineGuard)
	{
		Line oldLastLineGuard = lastLineGuard;
		lastLineGuard = newLastLineGuard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.GUARD_INFO__LAST_LINE_GUARD, oldLastLineGuard, lastLineGuard));
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
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.GUARD_INFO__IGNORE_NOTIFICATION, oldIgnoreNotification, ignoreNotification));
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
			case YammDiagramPackage.GUARD_INFO__FIRST_LINE_GUARD:
				if (resolve) return getFirstLineGuard();
				return basicGetFirstLineGuard();
			case YammDiagramPackage.GUARD_INFO__LAST_LINE_GUARD:
				if (resolve) return getLastLineGuard();
				return basicGetLastLineGuard();
			case YammDiagramPackage.GUARD_INFO__IGNORE_NOTIFICATION:
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
			case YammDiagramPackage.GUARD_INFO__FIRST_LINE_GUARD:
				setFirstLineGuard((Line)newValue);
				return;
			case YammDiagramPackage.GUARD_INFO__LAST_LINE_GUARD:
				setLastLineGuard((Line)newValue);
				return;
			case YammDiagramPackage.GUARD_INFO__IGNORE_NOTIFICATION:
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
			case YammDiagramPackage.GUARD_INFO__FIRST_LINE_GUARD:
				setFirstLineGuard((Line)null);
				return;
			case YammDiagramPackage.GUARD_INFO__LAST_LINE_GUARD:
				setLastLineGuard((Line)null);
				return;
			case YammDiagramPackage.GUARD_INFO__IGNORE_NOTIFICATION:
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
			case YammDiagramPackage.GUARD_INFO__FIRST_LINE_GUARD:
				return firstLineGuard != null;
			case YammDiagramPackage.GUARD_INFO__LAST_LINE_GUARD:
				return lastLineGuard != null;
			case YammDiagramPackage.GUARD_INFO__IGNORE_NOTIFICATION:
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

} //GuardInfoImpl
