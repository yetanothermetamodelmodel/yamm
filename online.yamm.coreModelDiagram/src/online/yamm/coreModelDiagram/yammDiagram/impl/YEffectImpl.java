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

import online.yamm.coreModelDiagram.yammDiagram.YEffect;
import online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage;

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
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.impl.YEffectImpl#getBody <em>Body</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.impl.YEffectImpl#isBreakpoint <em>Breakpoint</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.impl.YEffectImpl#getEffectStringRep <em>Effect String Rep</em>}</li>
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
		return YammDiagramPackage.Literals.YEFFECT;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YEFFECT__BODY, oldBody, newBody);
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
				msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - YammDiagramPackage.YEFFECT__BODY, null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - YammDiagramPackage.YEFFECT__BODY, null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YEFFECT__BODY, newBody, newBody));
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
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YEFFECT__BREAKPOINT, oldBreakpoint, breakpoint));
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
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YEFFECT__EFFECT_STRING_REP, oldEffectStringRep, effectStringRep));
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
			case YammDiagramPackage.YEFFECT__BODY:
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
			case YammDiagramPackage.YEFFECT__BODY:
				return getBody();
			case YammDiagramPackage.YEFFECT__BREAKPOINT:
				return isBreakpoint();
			case YammDiagramPackage.YEFFECT__EFFECT_STRING_REP:
				return getEffectStringRep();
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
			case YammDiagramPackage.YEFFECT__BODY:
				setBody((XExpression)newValue);
				return;
			case YammDiagramPackage.YEFFECT__BREAKPOINT:
				setBreakpoint((Boolean)newValue);
				return;
			case YammDiagramPackage.YEFFECT__EFFECT_STRING_REP:
				setEffectStringRep((String)newValue);
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
			case YammDiagramPackage.YEFFECT__BODY:
				setBody((XExpression)null);
				return;
			case YammDiagramPackage.YEFFECT__BREAKPOINT:
				setBreakpoint(BREAKPOINT_EDEFAULT);
				return;
			case YammDiagramPackage.YEFFECT__EFFECT_STRING_REP:
				setEffectStringRep(EFFECT_STRING_REP_EDEFAULT);
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
			case YammDiagramPackage.YEFFECT__BODY:
				return body != null;
			case YammDiagramPackage.YEFFECT__BREAKPOINT:
				return breakpoint != BREAKPOINT_EDEFAULT;
			case YammDiagramPackage.YEFFECT__EFFECT_STRING_REP:
				return EFFECT_STRING_REP_EDEFAULT == null ? effectStringRep != null : !EFFECT_STRING_REP_EDEFAULT.equals(effectStringRep);
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
