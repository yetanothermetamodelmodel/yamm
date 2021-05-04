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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import targetAST.T_ExpLevelA;
import targetAST.TargetASTPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TExp Level A</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link targetAST.impl.T_ExpLevelAImpl#getCastTo <em>Cast To</em>}</li>
 *   <li>{@link targetAST.impl.T_ExpLevelAImpl#getCastToPrimitiveMethodCall <em>Cast To Primitive Method Call</em>}</li>
 *   <li>{@link targetAST.impl.T_ExpLevelAImpl#isCastToPrimitive <em>Cast To Primitive</em>}</li>
 *   <li>{@link targetAST.impl.T_ExpLevelAImpl#getObject <em>Object</em>}</li>
 *   <li>{@link targetAST.impl.T_ExpLevelAImpl#getPrimitiveToWrapper <em>Primitive To Wrapper</em>}</li>
 *   <li>{@link targetAST.impl.T_ExpLevelAImpl#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class T_ExpLevelAImpl extends MinimalEObjectImpl.Container implements T_ExpLevelA {
	/**
	 * The default value of the '{@link #getCastTo() <em>Cast To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCastTo()
	 * @generated
	 * @ordered
	 */
	protected static final String CAST_TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCastTo() <em>Cast To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCastTo()
	 * @generated
	 * @ordered
	 */
	protected String castTo = CAST_TO_EDEFAULT;

	/**
	 * The default value of the '{@link #getCastToPrimitiveMethodCall() <em>Cast To Primitive Method Call</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCastToPrimitiveMethodCall()
	 * @generated
	 * @ordered
	 */
	protected static final String CAST_TO_PRIMITIVE_METHOD_CALL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCastToPrimitiveMethodCall() <em>Cast To Primitive Method Call</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCastToPrimitiveMethodCall()
	 * @generated
	 * @ordered
	 */
	protected String castToPrimitiveMethodCall = CAST_TO_PRIMITIVE_METHOD_CALL_EDEFAULT;

	/**
	 * The default value of the '{@link #isCastToPrimitive() <em>Cast To Primitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCastToPrimitive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CAST_TO_PRIMITIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCastToPrimitive() <em>Cast To Primitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCastToPrimitive()
	 * @generated
	 * @ordered
	 */
	protected boolean castToPrimitive = CAST_TO_PRIMITIVE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getObject() <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected T_ExpLevelA object;

	/**
	 * The default value of the '{@link #getPrimitiveToWrapper() <em>Primitive To Wrapper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimitiveToWrapper()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIMITIVE_TO_WRAPPER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrimitiveToWrapper() <em>Primitive To Wrapper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimitiveToWrapper()
	 * @generated
	 * @ordered
	 */
	protected String primitiveToWrapper = PRIMITIVE_TO_WRAPPER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected T_ExpLevelAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TargetASTPackage.Literals.TEXP_LEVEL_A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCastTo() {
		return castTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void setCastTo(String newCastTo) {
		if ("java.lang.Enum".equals(newCastTo))
			newCastTo = "EEnumLiteralAdapter";
		String oldCastTo = castTo;
		castTo = newCastTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetASTPackage.TEXP_LEVEL_A__CAST_TO, oldCastTo, castTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCastToPrimitiveMethodCall() {
		return castToPrimitiveMethodCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCastToPrimitiveMethodCall(String newCastToPrimitiveMethodCall) {
		String oldCastToPrimitiveMethodCall = castToPrimitiveMethodCall;
		castToPrimitiveMethodCall = newCastToPrimitiveMethodCall;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetASTPackage.TEXP_LEVEL_A__CAST_TO_PRIMITIVE_METHOD_CALL, oldCastToPrimitiveMethodCall, castToPrimitiveMethodCall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCastToPrimitive() {
		return castToPrimitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCastToPrimitive(boolean newCastToPrimitive) {
		boolean oldCastToPrimitive = castToPrimitive;
		castToPrimitive = newCastToPrimitive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetASTPackage.TEXP_LEVEL_A__CAST_TO_PRIMITIVE, oldCastToPrimitive, castToPrimitive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T_ExpLevelA getObject() {
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObject(T_ExpLevelA newObject, NotificationChain msgs) {
		T_ExpLevelA oldObject = object;
		object = newObject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TargetASTPackage.TEXP_LEVEL_A__OBJECT, oldObject, newObject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObject(T_ExpLevelA newObject) {
		if (newObject != object) {
			NotificationChain msgs = null;
			if (object != null)
				msgs = ((InternalEObject)object).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TargetASTPackage.TEXP_LEVEL_A__OBJECT, null, msgs);
			if (newObject != null)
				msgs = ((InternalEObject)newObject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TargetASTPackage.TEXP_LEVEL_A__OBJECT, null, msgs);
			msgs = basicSetObject(newObject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetASTPackage.TEXP_LEVEL_A__OBJECT, newObject, newObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrimitiveToWrapper() {
		return primitiveToWrapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimitiveToWrapper(String newPrimitiveToWrapper) {
		String oldPrimitiveToWrapper = primitiveToWrapper;
		primitiveToWrapper = newPrimitiveToWrapper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetASTPackage.TEXP_LEVEL_A__PRIMITIVE_TO_WRAPPER, oldPrimitiveToWrapper, primitiveToWrapper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetASTPackage.TEXP_LEVEL_A__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TargetASTPackage.TEXP_LEVEL_A__OBJECT:
				return basicSetObject(null, msgs);
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
			case TargetASTPackage.TEXP_LEVEL_A__CAST_TO:
				return getCastTo();
			case TargetASTPackage.TEXP_LEVEL_A__CAST_TO_PRIMITIVE_METHOD_CALL:
				return getCastToPrimitiveMethodCall();
			case TargetASTPackage.TEXP_LEVEL_A__CAST_TO_PRIMITIVE:
				return isCastToPrimitive();
			case TargetASTPackage.TEXP_LEVEL_A__OBJECT:
				return getObject();
			case TargetASTPackage.TEXP_LEVEL_A__PRIMITIVE_TO_WRAPPER:
				return getPrimitiveToWrapper();
			case TargetASTPackage.TEXP_LEVEL_A__CODE:
				return getCode();
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
			case TargetASTPackage.TEXP_LEVEL_A__CAST_TO:
				setCastTo((String)newValue);
				return;
			case TargetASTPackage.TEXP_LEVEL_A__CAST_TO_PRIMITIVE_METHOD_CALL:
				setCastToPrimitiveMethodCall((String)newValue);
				return;
			case TargetASTPackage.TEXP_LEVEL_A__CAST_TO_PRIMITIVE:
				setCastToPrimitive((Boolean)newValue);
				return;
			case TargetASTPackage.TEXP_LEVEL_A__OBJECT:
				setObject((T_ExpLevelA)newValue);
				return;
			case TargetASTPackage.TEXP_LEVEL_A__PRIMITIVE_TO_WRAPPER:
				setPrimitiveToWrapper((String)newValue);
				return;
			case TargetASTPackage.TEXP_LEVEL_A__CODE:
				setCode((String)newValue);
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
			case TargetASTPackage.TEXP_LEVEL_A__CAST_TO:
				setCastTo(CAST_TO_EDEFAULT);
				return;
			case TargetASTPackage.TEXP_LEVEL_A__CAST_TO_PRIMITIVE_METHOD_CALL:
				setCastToPrimitiveMethodCall(CAST_TO_PRIMITIVE_METHOD_CALL_EDEFAULT);
				return;
			case TargetASTPackage.TEXP_LEVEL_A__CAST_TO_PRIMITIVE:
				setCastToPrimitive(CAST_TO_PRIMITIVE_EDEFAULT);
				return;
			case TargetASTPackage.TEXP_LEVEL_A__OBJECT:
				setObject((T_ExpLevelA)null);
				return;
			case TargetASTPackage.TEXP_LEVEL_A__PRIMITIVE_TO_WRAPPER:
				setPrimitiveToWrapper(PRIMITIVE_TO_WRAPPER_EDEFAULT);
				return;
			case TargetASTPackage.TEXP_LEVEL_A__CODE:
				setCode(CODE_EDEFAULT);
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
			case TargetASTPackage.TEXP_LEVEL_A__CAST_TO:
				return CAST_TO_EDEFAULT == null ? castTo != null : !CAST_TO_EDEFAULT.equals(castTo);
			case TargetASTPackage.TEXP_LEVEL_A__CAST_TO_PRIMITIVE_METHOD_CALL:
				return CAST_TO_PRIMITIVE_METHOD_CALL_EDEFAULT == null ? castToPrimitiveMethodCall != null : !CAST_TO_PRIMITIVE_METHOD_CALL_EDEFAULT.equals(castToPrimitiveMethodCall);
			case TargetASTPackage.TEXP_LEVEL_A__CAST_TO_PRIMITIVE:
				return castToPrimitive != CAST_TO_PRIMITIVE_EDEFAULT;
			case TargetASTPackage.TEXP_LEVEL_A__OBJECT:
				return object != null;
			case TargetASTPackage.TEXP_LEVEL_A__PRIMITIVE_TO_WRAPPER:
				return PRIMITIVE_TO_WRAPPER_EDEFAULT == null ? primitiveToWrapper != null : !PRIMITIVE_TO_WRAPPER_EDEFAULT.equals(primitiveToWrapper);
			case TargetASTPackage.TEXP_LEVEL_A__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
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
		result.append(" (castTo: ");
		result.append(castTo);
		result.append(", castToPrimitiveMethodCall: ");
		result.append(castToPrimitiveMethodCall);
		result.append(", castToPrimitive: ");
		result.append(castToPrimitive);
		result.append(", primitiveToWrapper: ");
		result.append(primitiveToWrapper);
		result.append(", Code: ");
		result.append(code);
		result.append(')');
		return result.toString();
	}

} //T_ExpLevelAImpl
