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
package online.yamm.ObjectDiagram.impl;

import online.yamm.ObjectDiagram.ODType;
import online.yamm.ObjectDiagram.ObjectDiagramPackage;

import online.yamm.coreModelXmi.yamm.YClass;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OD Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link online.yamm.ObjectDiagram.impl.ODTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link online.yamm.ObjectDiagram.impl.ODTypeImpl#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link online.yamm.ObjectDiagram.impl.ODTypeImpl#getRuntimeType <em>Runtime Type</em>}</li>
 *   <li>{@link online.yamm.ObjectDiagram.impl.ODTypeImpl#getYammType <em>Yamm Type</em>}</li>
 *   <li>{@link online.yamm.ObjectDiagram.impl.ODTypeImpl#getObjectID <em>Object ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ODTypeImpl extends MinimalEObjectImpl.Container implements ODType {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getQualifiedName() <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALIFIED_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQualifiedName() <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected String qualifiedName = QUALIFIED_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRuntimeType() <em>Runtime Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntimeType()
	 * @generated
	 * @ordered
	 */
	protected EClassifier runtimeType;

	/**
	 * The cached value of the '{@link #getYammType() <em>Yamm Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYammType()
	 * @generated
	 * @ordered
	 */
	protected YClass yammType;

	/**
	 * The default value of the '{@link #getObjectID() <em>Object ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectID()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJECT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObjectID() <em>Object ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectID()
	 * @generated
	 * @ordered
	 */
	protected String objectID = OBJECT_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ODTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ObjectDiagramPackage.Literals.OD_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObjectDiagramPackage.OD_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQualifiedName() {
		return qualifiedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualifiedName(String newQualifiedName) {
		String oldQualifiedName = qualifiedName;
		qualifiedName = newQualifiedName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObjectDiagramPackage.OD_TYPE__QUALIFIED_NAME, oldQualifiedName, qualifiedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClassifier getRuntimeType() {
		if (runtimeType != null && runtimeType.eIsProxy()) {
			InternalEObject oldRuntimeType = (InternalEObject)runtimeType;
			runtimeType = (EClassifier)eResolveProxy(oldRuntimeType);
			if (runtimeType != oldRuntimeType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ObjectDiagramPackage.OD_TYPE__RUNTIME_TYPE, oldRuntimeType, runtimeType));
			}
		}
		return runtimeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClassifier basicGetRuntimeType() {
		return runtimeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuntimeType(EClassifier newRuntimeType) {
		EClassifier oldRuntimeType = runtimeType;
		runtimeType = newRuntimeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObjectDiagramPackage.OD_TYPE__RUNTIME_TYPE, oldRuntimeType, runtimeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YClass getYammType() {
		if (yammType != null && yammType.eIsProxy()) {
			InternalEObject oldYammType = (InternalEObject)yammType;
			yammType = (YClass)eResolveProxy(oldYammType);
			if (yammType != oldYammType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ObjectDiagramPackage.OD_TYPE__YAMM_TYPE, oldYammType, yammType));
			}
		}
		return yammType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YClass basicGetYammType() {
		return yammType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYammType(YClass newYammType) {
		YClass oldYammType = yammType;
		yammType = newYammType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObjectDiagramPackage.OD_TYPE__YAMM_TYPE, oldYammType, yammType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObjectID() {
		return objectID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectID(String newObjectID) {
		String oldObjectID = objectID;
		objectID = newObjectID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObjectDiagramPackage.OD_TYPE__OBJECT_ID, oldObjectID, objectID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ObjectDiagramPackage.OD_TYPE__NAME:
				return getName();
			case ObjectDiagramPackage.OD_TYPE__QUALIFIED_NAME:
				return getQualifiedName();
			case ObjectDiagramPackage.OD_TYPE__RUNTIME_TYPE:
				if (resolve) return getRuntimeType();
				return basicGetRuntimeType();
			case ObjectDiagramPackage.OD_TYPE__YAMM_TYPE:
				if (resolve) return getYammType();
				return basicGetYammType();
			case ObjectDiagramPackage.OD_TYPE__OBJECT_ID:
				return getObjectID();
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
			case ObjectDiagramPackage.OD_TYPE__NAME:
				setName((String)newValue);
				return;
			case ObjectDiagramPackage.OD_TYPE__QUALIFIED_NAME:
				setQualifiedName((String)newValue);
				return;
			case ObjectDiagramPackage.OD_TYPE__RUNTIME_TYPE:
				setRuntimeType((EClassifier)newValue);
				return;
			case ObjectDiagramPackage.OD_TYPE__YAMM_TYPE:
				setYammType((YClass)newValue);
				return;
			case ObjectDiagramPackage.OD_TYPE__OBJECT_ID:
				setObjectID((String)newValue);
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
			case ObjectDiagramPackage.OD_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ObjectDiagramPackage.OD_TYPE__QUALIFIED_NAME:
				setQualifiedName(QUALIFIED_NAME_EDEFAULT);
				return;
			case ObjectDiagramPackage.OD_TYPE__RUNTIME_TYPE:
				setRuntimeType((EClassifier)null);
				return;
			case ObjectDiagramPackage.OD_TYPE__YAMM_TYPE:
				setYammType((YClass)null);
				return;
			case ObjectDiagramPackage.OD_TYPE__OBJECT_ID:
				setObjectID(OBJECT_ID_EDEFAULT);
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
			case ObjectDiagramPackage.OD_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ObjectDiagramPackage.OD_TYPE__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? qualifiedName != null : !QUALIFIED_NAME_EDEFAULT.equals(qualifiedName);
			case ObjectDiagramPackage.OD_TYPE__RUNTIME_TYPE:
				return runtimeType != null;
			case ObjectDiagramPackage.OD_TYPE__YAMM_TYPE:
				return yammType != null;
			case ObjectDiagramPackage.OD_TYPE__OBJECT_ID:
				return OBJECT_ID_EDEFAULT == null ? objectID != null : !OBJECT_ID_EDEFAULT.equals(objectID);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", qualifiedName: ");
		result.append(qualifiedName);
		result.append(", ObjectID: ");
		result.append(objectID);
		result.append(')');
		return result.toString();
	}

} //ODTypeImpl
