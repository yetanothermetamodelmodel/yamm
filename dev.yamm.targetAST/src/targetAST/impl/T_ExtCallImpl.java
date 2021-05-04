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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import targetAST.T_ExpLevelA;
import targetAST.T_ExtCall;
import targetAST.TargetASTPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TExt Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link targetAST.impl.T_ExtCallImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link targetAST.impl.T_ExtCallImpl#getMethodName <em>Method Name</em>}</li>
 *   <li>{@link targetAST.impl.T_ExtCallImpl#getStringLiteral <em>String Literal</em>}</li>
 *   <li>{@link targetAST.impl.T_ExtCallImpl#getTypeArguments <em>Type Arguments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class T_ExtCallImpl extends T_ExpLevelBImpl implements T_ExtCall {
	/**
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<T_ExpLevelA> arguments;

	/**
	 * The default value of the '{@link #getMethodName() <em>Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodName()
	 * @generated
	 * @ordered
	 */
	protected static final String METHOD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMethodName() <em>Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodName()
	 * @generated
	 * @ordered
	 */
	protected String methodName = METHOD_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getStringLiteral() <em>String Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringLiteral()
	 * @generated
	 * @ordered
	 */
	protected static final String STRING_LITERAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStringLiteral() <em>String Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringLiteral()
	 * @generated
	 * @ordered
	 */
	protected String stringLiteral = STRING_LITERAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTypeArguments() <em>Type Arguments</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<String> typeArguments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected T_ExtCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TargetASTPackage.Literals.TEXT_CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<T_ExpLevelA> getArguments() {
		if (arguments == null) {
			arguments = new EObjectContainmentEList<T_ExpLevelA>(T_ExpLevelA.class, this, TargetASTPackage.TEXT_CALL__ARGUMENTS);
		}
		return arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMethodName() {
		return methodName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodName(String newMethodName) {
		String oldMethodName = methodName;
		methodName = newMethodName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetASTPackage.TEXT_CALL__METHOD_NAME, oldMethodName, methodName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStringLiteral() {
		return stringLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStringLiteral(String newStringLiteral) {
		String oldStringLiteral = stringLiteral;
		stringLiteral = newStringLiteral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetASTPackage.TEXT_CALL__STRING_LITERAL, oldStringLiteral, stringLiteral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getTypeArguments() {
		if (typeArguments == null) {
			typeArguments = new EDataTypeEList<String>(String.class, this, TargetASTPackage.TEXT_CALL__TYPE_ARGUMENTS);
		}
		return typeArguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TargetASTPackage.TEXT_CALL__ARGUMENTS:
				return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
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
			case TargetASTPackage.TEXT_CALL__ARGUMENTS:
				return getArguments();
			case TargetASTPackage.TEXT_CALL__METHOD_NAME:
				return getMethodName();
			case TargetASTPackage.TEXT_CALL__STRING_LITERAL:
				return getStringLiteral();
			case TargetASTPackage.TEXT_CALL__TYPE_ARGUMENTS:
				return getTypeArguments();
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
			case TargetASTPackage.TEXT_CALL__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends T_ExpLevelA>)newValue);
				return;
			case TargetASTPackage.TEXT_CALL__METHOD_NAME:
				setMethodName((String)newValue);
				return;
			case TargetASTPackage.TEXT_CALL__STRING_LITERAL:
				setStringLiteral((String)newValue);
				return;
			case TargetASTPackage.TEXT_CALL__TYPE_ARGUMENTS:
				getTypeArguments().clear();
				getTypeArguments().addAll((Collection<? extends String>)newValue);
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
			case TargetASTPackage.TEXT_CALL__ARGUMENTS:
				getArguments().clear();
				return;
			case TargetASTPackage.TEXT_CALL__METHOD_NAME:
				setMethodName(METHOD_NAME_EDEFAULT);
				return;
			case TargetASTPackage.TEXT_CALL__STRING_LITERAL:
				setStringLiteral(STRING_LITERAL_EDEFAULT);
				return;
			case TargetASTPackage.TEXT_CALL__TYPE_ARGUMENTS:
				getTypeArguments().clear();
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
			case TargetASTPackage.TEXT_CALL__ARGUMENTS:
				return arguments != null && !arguments.isEmpty();
			case TargetASTPackage.TEXT_CALL__METHOD_NAME:
				return METHOD_NAME_EDEFAULT == null ? methodName != null : !METHOD_NAME_EDEFAULT.equals(methodName);
			case TargetASTPackage.TEXT_CALL__STRING_LITERAL:
				return STRING_LITERAL_EDEFAULT == null ? stringLiteral != null : !STRING_LITERAL_EDEFAULT.equals(stringLiteral);
			case TargetASTPackage.TEXT_CALL__TYPE_ARGUMENTS:
				return typeArguments != null && !typeArguments.isEmpty();
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
		result.append(" (methodName: ");
		result.append(methodName);
		result.append(", stringLiteral: ");
		result.append(stringLiteral);
		result.append(", typeArguments: ");
		result.append(typeArguments);
		result.append(')');
		return result.toString();
	}

} //T_ExtCallImpl
