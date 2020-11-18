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
package targetAST.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import targetAST.T_ExpLevelB;
import targetAST.TargetASTPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TExp Level B</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link targetAST.impl.T_ExpLevelBImpl#getTypeObject <em>Type Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class T_ExpLevelBImpl extends T_ExpLevelAImpl implements T_ExpLevelB {
	/**
	 * The default value of the '{@link #getTypeObject() <em>Type Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeObject()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_OBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeObject() <em>Type Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeObject()
	 * @generated
	 * @ordered
	 */
	protected String typeObject = TYPE_OBJECT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected T_ExpLevelBImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TargetASTPackage.Literals.TEXP_LEVEL_B;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeObject() {
		return typeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeObject(String newTypeObject) {
		String oldTypeObject = typeObject;
		typeObject = newTypeObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetASTPackage.TEXP_LEVEL_B__TYPE_OBJECT, oldTypeObject, typeObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TargetASTPackage.TEXP_LEVEL_B__TYPE_OBJECT:
				return getTypeObject();
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
			case TargetASTPackage.TEXP_LEVEL_B__TYPE_OBJECT:
				setTypeObject((String)newValue);
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
			case TargetASTPackage.TEXP_LEVEL_B__TYPE_OBJECT:
				setTypeObject(TYPE_OBJECT_EDEFAULT);
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
			case TargetASTPackage.TEXP_LEVEL_B__TYPE_OBJECT:
				return TYPE_OBJECT_EDEFAULT == null ? typeObject != null : !TYPE_OBJECT_EDEFAULT.equals(typeObject);
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
		result.append(" (typeObject: ");
		result.append(typeObject);
		result.append(')');
		return result.toString();
	}

} //T_ExpLevelBImpl
