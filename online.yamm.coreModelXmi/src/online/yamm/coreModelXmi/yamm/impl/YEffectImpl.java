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

import online.yamm.coreModelXmi.yamm.SingleLinePropertyInfo;
import online.yamm.coreModelXmi.yamm.YEffect;
import online.yamm.coreModelXmi.yamm.YammPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YEffect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YEffectImpl#getBody <em>Body</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YEffectImpl#isBreakpoint <em>Breakpoint</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YEffectImpl#getEffectStringRep <em>Effect String Rep</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YEffectImpl#getPosObjectID <em>Pos Object ID</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YEffectImpl#getPosBreakpoint <em>Pos Breakpoint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class YEffectImpl extends YObjectImpl implements YEffect
{
	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected XExpression body;

	/**
	 * The default value of the '{@link #isBreakpoint() <em>Breakpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBreakpoint()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BREAKPOINT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBreakpoint() <em>Breakpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBreakpoint()
	 * @generated
	 * @ordered
	 */
	protected boolean breakpoint = BREAKPOINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getEffectStringRep() <em>Effect String Rep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectStringRep()
	 * @generated
	 * @ordered
	 */
	protected static final String EFFECT_STRING_REP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEffectStringRep() <em>Effect String Rep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectStringRep()
	 * @generated
	 * @ordered
	 */
	protected String effectStringRep = EFFECT_STRING_REP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPosObjectID() <em>Pos Object ID</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosObjectID()
	 * @generated
	 * @ordered
	 */
	protected SingleLinePropertyInfo posObjectID;

	/**
	 * The cached value of the '{@link #getPosBreakpoint() <em>Pos Breakpoint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosBreakpoint()
	 * @generated
	 * @ordered
	 */
	protected SingleLinePropertyInfo posBreakpoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YEffectImpl()
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
		return YammPackage.Literals.YEFFECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XExpression getBody()
	{
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(XExpression newBody, NotificationChain msgs)
	{
		XExpression oldBody = body;
		body = newBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, YammPackage.YEFFECT__BODY, oldBody, newBody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(XExpression newBody)
	{
		if (newBody != body) {
			NotificationChain msgs = null;
			if (body != null)
				msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - YammPackage.YEFFECT__BODY, null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - YammPackage.YEFFECT__BODY, null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YEFFECT__BODY, newBody, newBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBreakpoint()
	{
		return breakpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBreakpoint(boolean newBreakpoint)
	{
		boolean oldBreakpoint = breakpoint;
		breakpoint = newBreakpoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YEFFECT__BREAKPOINT, oldBreakpoint, breakpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEffectStringRep()
	{
		return effectStringRep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffectStringRep(String newEffectStringRep)
	{
		String oldEffectStringRep = effectStringRep;
		effectStringRep = newEffectStringRep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YEFFECT__EFFECT_STRING_REP, oldEffectStringRep, effectStringRep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo getPosObjectID()
	{
		if (posObjectID != null && posObjectID.eIsProxy()) {
			InternalEObject oldPosObjectID = (InternalEObject)posObjectID;
			posObjectID = (SingleLinePropertyInfo)eResolveProxy(oldPosObjectID);
			if (posObjectID != oldPosObjectID) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammPackage.YEFFECT__POS_OBJECT_ID, oldPosObjectID, posObjectID));
			}
		}
		return posObjectID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo basicGetPosObjectID()
	{
		return posObjectID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosObjectID(SingleLinePropertyInfo newPosObjectID)
	{
		SingleLinePropertyInfo oldPosObjectID = posObjectID;
		posObjectID = newPosObjectID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YEFFECT__POS_OBJECT_ID, oldPosObjectID, posObjectID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo getPosBreakpoint()
	{
		if (posBreakpoint != null && posBreakpoint.eIsProxy()) {
			InternalEObject oldPosBreakpoint = (InternalEObject)posBreakpoint;
			posBreakpoint = (SingleLinePropertyInfo)eResolveProxy(oldPosBreakpoint);
			if (posBreakpoint != oldPosBreakpoint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammPackage.YEFFECT__POS_BREAKPOINT, oldPosBreakpoint, posBreakpoint));
			}
		}
		return posBreakpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo basicGetPosBreakpoint()
	{
		return posBreakpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosBreakpoint(SingleLinePropertyInfo newPosBreakpoint)
	{
		SingleLinePropertyInfo oldPosBreakpoint = posBreakpoint;
		posBreakpoint = newPosBreakpoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YEFFECT__POS_BREAKPOINT, oldPosBreakpoint, posBreakpoint));
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
			case YammPackage.YEFFECT__BODY:
				return basicSetBody(null, msgs);
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
			case YammPackage.YEFFECT__BODY:
				return getBody();
			case YammPackage.YEFFECT__BREAKPOINT:
				return isBreakpoint();
			case YammPackage.YEFFECT__EFFECT_STRING_REP:
				return getEffectStringRep();
			case YammPackage.YEFFECT__POS_OBJECT_ID:
				if (resolve) return getPosObjectID();
				return basicGetPosObjectID();
			case YammPackage.YEFFECT__POS_BREAKPOINT:
				if (resolve) return getPosBreakpoint();
				return basicGetPosBreakpoint();
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
			case YammPackage.YEFFECT__BODY:
				setBody((XExpression)newValue);
				return;
			case YammPackage.YEFFECT__BREAKPOINT:
				setBreakpoint((Boolean)newValue);
				return;
			case YammPackage.YEFFECT__EFFECT_STRING_REP:
				setEffectStringRep((String)newValue);
				return;
			case YammPackage.YEFFECT__POS_OBJECT_ID:
				setPosObjectID((SingleLinePropertyInfo)newValue);
				return;
			case YammPackage.YEFFECT__POS_BREAKPOINT:
				setPosBreakpoint((SingleLinePropertyInfo)newValue);
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
			case YammPackage.YEFFECT__BODY:
				setBody((XExpression)null);
				return;
			case YammPackage.YEFFECT__BREAKPOINT:
				setBreakpoint(BREAKPOINT_EDEFAULT);
				return;
			case YammPackage.YEFFECT__EFFECT_STRING_REP:
				setEffectStringRep(EFFECT_STRING_REP_EDEFAULT);
				return;
			case YammPackage.YEFFECT__POS_OBJECT_ID:
				setPosObjectID((SingleLinePropertyInfo)null);
				return;
			case YammPackage.YEFFECT__POS_BREAKPOINT:
				setPosBreakpoint((SingleLinePropertyInfo)null);
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
			case YammPackage.YEFFECT__BODY:
				return body != null;
			case YammPackage.YEFFECT__BREAKPOINT:
				return breakpoint != BREAKPOINT_EDEFAULT;
			case YammPackage.YEFFECT__EFFECT_STRING_REP:
				return EFFECT_STRING_REP_EDEFAULT == null ? effectStringRep != null : !EFFECT_STRING_REP_EDEFAULT.equals(effectStringRep);
			case YammPackage.YEFFECT__POS_OBJECT_ID:
				return posObjectID != null;
			case YammPackage.YEFFECT__POS_BREAKPOINT:
				return posBreakpoint != null;
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
		result.append(" (breakpoint: ");
		result.append(breakpoint);
		result.append(", effectStringRep: ");
		result.append(effectStringRep);
		result.append(')');
		return result.toString();
	}

} //YEffectImpl
