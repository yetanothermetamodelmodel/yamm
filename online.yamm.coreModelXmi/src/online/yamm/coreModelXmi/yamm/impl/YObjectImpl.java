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

import online.yamm.coreModelXmi.yamm.DslInfo;
import online.yamm.coreModelXmi.yamm.YObject;
import online.yamm.coreModelXmi.yamm.YammPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YObject</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YObjectImpl#getObjectID <em>Object ID</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YObjectImpl#getDslInfo <em>Dsl Info</em>}</li>
 * </ul>
 *
 * @generated
 */
public class YObjectImpl extends MinimalEObjectImpl.Container implements YObject
{
	/**
	 * The default value of the '{@link #getObjectID() <em>Object ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectID()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJECT_ID_EDEFAULT = "e";

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
	 * This is true if the Object ID attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean objectIDESet;

	/**
	 * The cached value of the '{@link #getDslInfo() <em>Dsl Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDslInfo()
	 * @generated
	 * @ordered
	 */
	protected DslInfo dslInfo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YObjectImpl()
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
		return YammPackage.Literals.YOBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObjectID()
	{
		return objectID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectID(String newObjectID)
	{
		String oldObjectID = objectID;
		objectID = newObjectID;
		boolean oldObjectIDESet = objectIDESet;
		objectIDESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YOBJECT__OBJECT_ID, oldObjectID, objectID, !oldObjectIDESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetObjectID()
	{
		String oldObjectID = objectID;
		boolean oldObjectIDESet = objectIDESet;
		objectID = OBJECT_ID_EDEFAULT;
		objectIDESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, YammPackage.YOBJECT__OBJECT_ID, oldObjectID, OBJECT_ID_EDEFAULT, oldObjectIDESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetObjectID()
	{
		return objectIDESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DslInfo getDslInfo()
	{
		if (dslInfo != null && dslInfo.eIsProxy()) {
			InternalEObject oldDslInfo = (InternalEObject)dslInfo;
			dslInfo = (DslInfo)eResolveProxy(oldDslInfo);
			if (dslInfo != oldDslInfo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammPackage.YOBJECT__DSL_INFO, oldDslInfo, dslInfo));
			}
		}
		return dslInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DslInfo basicGetDslInfo()
	{
		return dslInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void setDslInfo(DslInfo newDslInfo)
	{
		DslInfo oldDslInfo = dslInfo;
		dslInfo = newDslInfo;
//		if (eNotificationRequired())
//			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YOBJECT__DSL_INFO, oldDslInfo, dslInfo));
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
			case YammPackage.YOBJECT__OBJECT_ID:
				return getObjectID();
			case YammPackage.YOBJECT__DSL_INFO:
				if (resolve) return getDslInfo();
				return basicGetDslInfo();
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
			case YammPackage.YOBJECT__OBJECT_ID:
				setObjectID((String)newValue);
				return;
			case YammPackage.YOBJECT__DSL_INFO:
				setDslInfo((DslInfo)newValue);
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
			case YammPackage.YOBJECT__OBJECT_ID:
				unsetObjectID();
				return;
			case YammPackage.YOBJECT__DSL_INFO:
				setDslInfo((DslInfo)null);
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
			case YammPackage.YOBJECT__OBJECT_ID:
				return isSetObjectID();
			case YammPackage.YOBJECT__DSL_INFO:
				return dslInfo != null;
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
		result.append(" (ObjectID: ");
		if (objectIDESet) result.append(objectID); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //YObjectImpl
