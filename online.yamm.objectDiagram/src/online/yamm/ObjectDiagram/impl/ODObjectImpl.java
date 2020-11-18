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

import java.util.Collection;

import online.yamm.ObjectDiagram.ODAttribute;
import online.yamm.ObjectDiagram.ODObject;
import online.yamm.ObjectDiagram.ODReference;
import online.yamm.ObjectDiagram.ODType;
import online.yamm.ObjectDiagram.ObjectDiagramPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OD Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link online.yamm.ObjectDiagram.impl.ODObjectImpl#getObjectID <em>Object ID</em>}</li>
 *   <li>{@link online.yamm.ObjectDiagram.impl.ODObjectImpl#getType <em>Type</em>}</li>
 *   <li>{@link online.yamm.ObjectDiagram.impl.ODObjectImpl#getReferences <em>References</em>}</li>
 *   <li>{@link online.yamm.ObjectDiagram.impl.ODObjectImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link online.yamm.ObjectDiagram.impl.ODObjectImpl#getRuntimeObject <em>Runtime Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ODObjectImpl extends MinimalEObjectImpl.Container implements ODObject {
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
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ODType type;

	/**
	 * The cached value of the '{@link #getReferences() <em>References</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<ODReference> references;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<ODAttribute> attributes;

	/**
	 * The cached value of the '{@link #getRuntimeObject() <em>Runtime Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntimeObject()
	 * @generated
	 * @ordered
	 */
	protected EObject runtimeObject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ODObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ObjectDiagramPackage.Literals.OD_OBJECT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ObjectDiagramPackage.OD_OBJECT__OBJECT_ID, oldObjectID, objectID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ODType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (ODType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ObjectDiagramPackage.OD_OBJECT__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ODType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ODType newType) {
		ODType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObjectDiagramPackage.OD_OBJECT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ODReference> getReferences() {
		if (references == null) {
			references = new EObjectContainmentEList<ODReference>(ODReference.class, this, ObjectDiagramPackage.OD_OBJECT__REFERENCES);
		}
		return references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ODAttribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<ODAttribute>(ODAttribute.class, this, ObjectDiagramPackage.OD_OBJECT__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getRuntimeObject() {
		if (runtimeObject != null && runtimeObject.eIsProxy()) {
			InternalEObject oldRuntimeObject = (InternalEObject)runtimeObject;
			runtimeObject = eResolveProxy(oldRuntimeObject);
			if (runtimeObject != oldRuntimeObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ObjectDiagramPackage.OD_OBJECT__RUNTIME_OBJECT, oldRuntimeObject, runtimeObject));
			}
		}
		return runtimeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetRuntimeObject() {
		return runtimeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuntimeObject(EObject newRuntimeObject) {
		EObject oldRuntimeObject = runtimeObject;
		runtimeObject = newRuntimeObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObjectDiagramPackage.OD_OBJECT__RUNTIME_OBJECT, oldRuntimeObject, runtimeObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ObjectDiagramPackage.OD_OBJECT__REFERENCES:
				return ((InternalEList<?>)getReferences()).basicRemove(otherEnd, msgs);
			case ObjectDiagramPackage.OD_OBJECT__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
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
			case ObjectDiagramPackage.OD_OBJECT__OBJECT_ID:
				return getObjectID();
			case ObjectDiagramPackage.OD_OBJECT__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case ObjectDiagramPackage.OD_OBJECT__REFERENCES:
				return getReferences();
			case ObjectDiagramPackage.OD_OBJECT__ATTRIBUTES:
				return getAttributes();
			case ObjectDiagramPackage.OD_OBJECT__RUNTIME_OBJECT:
				if (resolve) return getRuntimeObject();
				return basicGetRuntimeObject();
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
			case ObjectDiagramPackage.OD_OBJECT__OBJECT_ID:
				setObjectID((String)newValue);
				return;
			case ObjectDiagramPackage.OD_OBJECT__TYPE:
				setType((ODType)newValue);
				return;
			case ObjectDiagramPackage.OD_OBJECT__REFERENCES:
				getReferences().clear();
				getReferences().addAll((Collection<? extends ODReference>)newValue);
				return;
			case ObjectDiagramPackage.OD_OBJECT__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends ODAttribute>)newValue);
				return;
			case ObjectDiagramPackage.OD_OBJECT__RUNTIME_OBJECT:
				setRuntimeObject((EObject)newValue);
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
			case ObjectDiagramPackage.OD_OBJECT__OBJECT_ID:
				setObjectID(OBJECT_ID_EDEFAULT);
				return;
			case ObjectDiagramPackage.OD_OBJECT__TYPE:
				setType((ODType)null);
				return;
			case ObjectDiagramPackage.OD_OBJECT__REFERENCES:
				getReferences().clear();
				return;
			case ObjectDiagramPackage.OD_OBJECT__ATTRIBUTES:
				getAttributes().clear();
				return;
			case ObjectDiagramPackage.OD_OBJECT__RUNTIME_OBJECT:
				setRuntimeObject((EObject)null);
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
			case ObjectDiagramPackage.OD_OBJECT__OBJECT_ID:
				return OBJECT_ID_EDEFAULT == null ? objectID != null : !OBJECT_ID_EDEFAULT.equals(objectID);
			case ObjectDiagramPackage.OD_OBJECT__TYPE:
				return type != null;
			case ObjectDiagramPackage.OD_OBJECT__REFERENCES:
				return references != null && !references.isEmpty();
			case ObjectDiagramPackage.OD_OBJECT__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case ObjectDiagramPackage.OD_OBJECT__RUNTIME_OBJECT:
				return runtimeObject != null;
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
		result.append(" (ObjectID: ");
		result.append(objectID);
		result.append(')');
		return result.toString();
	}

} //ODObjectImpl
