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
package online.yamm.chen.chen.impl;

import java.util.Collection;

import online.yamm.chen.chen.ChenPackage;
import online.yamm.chen.chen.Connection;
import online.yamm.chen.chen.Entity;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link online.yamm.chen.chen.impl.EntityImpl#getName <em>Name</em>}</li>
 *   <li>{@link online.yamm.chen.chen.impl.EntityImpl#isWeakEntityType <em>Weak Entity Type</em>}</li>
 *   <li>{@link online.yamm.chen.chen.impl.EntityImpl#getConnectionsToRelations <em>Connections To Relations</em>}</li>
 *   <li>{@link online.yamm.chen.chen.impl.EntityImpl#getConnectionsToAttributes <em>Connections To Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityImpl extends MinimalEObjectImpl.Container implements Entity {
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
	 * The default value of the '{@link #isWeakEntityType() <em>Weak Entity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWeakEntityType()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WEAK_ENTITY_TYPE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isWeakEntityType() <em>Weak Entity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWeakEntityType()
	 * @generated
	 * @ordered
	 */
	protected boolean weakEntityType = WEAK_ENTITY_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConnectionsToRelations() <em>Connections To Relations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionsToRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> connectionsToRelations;

	/**
	 * The cached value of the '{@link #getConnectionsToAttributes() <em>Connections To Attributes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionsToAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> connectionsToAttributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChenPackage.Literals.ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connection> getConnectionsToRelations() {
		if (connectionsToRelations == null) {
			connectionsToRelations = new EObjectResolvingEList<Connection>(Connection.class, this, ChenPackage.ENTITY__CONNECTIONS_TO_RELATIONS);
		}
		return connectionsToRelations;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ChenPackage.ENTITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isWeakEntityType() {
		return weakEntityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeakEntityType(boolean newWeakEntityType) {
		boolean oldWeakEntityType = weakEntityType;
		weakEntityType = newWeakEntityType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChenPackage.ENTITY__WEAK_ENTITY_TYPE, oldWeakEntityType, weakEntityType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connection> getConnectionsToAttributes() {
		if (connectionsToAttributes == null) {
			connectionsToAttributes = new EObjectResolvingEList<Connection>(Connection.class, this, ChenPackage.ENTITY__CONNECTIONS_TO_ATTRIBUTES);
		}
		return connectionsToAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ChenPackage.ENTITY__NAME:
				return getName();
			case ChenPackage.ENTITY__WEAK_ENTITY_TYPE:
				return isWeakEntityType();
			case ChenPackage.ENTITY__CONNECTIONS_TO_RELATIONS:
				return getConnectionsToRelations();
			case ChenPackage.ENTITY__CONNECTIONS_TO_ATTRIBUTES:
				return getConnectionsToAttributes();
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
			case ChenPackage.ENTITY__NAME:
				setName((String)newValue);
				return;
			case ChenPackage.ENTITY__WEAK_ENTITY_TYPE:
				setWeakEntityType((Boolean)newValue);
				return;
			case ChenPackage.ENTITY__CONNECTIONS_TO_RELATIONS:
				getConnectionsToRelations().clear();
				getConnectionsToRelations().addAll((Collection<? extends Connection>)newValue);
				return;
			case ChenPackage.ENTITY__CONNECTIONS_TO_ATTRIBUTES:
				getConnectionsToAttributes().clear();
				getConnectionsToAttributes().addAll((Collection<? extends Connection>)newValue);
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
			case ChenPackage.ENTITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ChenPackage.ENTITY__WEAK_ENTITY_TYPE:
				setWeakEntityType(WEAK_ENTITY_TYPE_EDEFAULT);
				return;
			case ChenPackage.ENTITY__CONNECTIONS_TO_RELATIONS:
				getConnectionsToRelations().clear();
				return;
			case ChenPackage.ENTITY__CONNECTIONS_TO_ATTRIBUTES:
				getConnectionsToAttributes().clear();
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
			case ChenPackage.ENTITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ChenPackage.ENTITY__WEAK_ENTITY_TYPE:
				return weakEntityType != WEAK_ENTITY_TYPE_EDEFAULT;
			case ChenPackage.ENTITY__CONNECTIONS_TO_RELATIONS:
				return connectionsToRelations != null && !connectionsToRelations.isEmpty();
			case ChenPackage.ENTITY__CONNECTIONS_TO_ATTRIBUTES:
				return connectionsToAttributes != null && !connectionsToAttributes.isEmpty();
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
		result.append(", weakEntityType: ");
		result.append(weakEntityType);
		result.append(')');
		return result.toString();
	}

} //EntityImpl
