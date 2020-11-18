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
import online.yamm.chen.chen.Attribute;
import online.yamm.chen.chen.ChenPackage;

import online.yamm.chen.chen.Connection;
import online.yamm.chen.chen.Key;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link online.yamm.chen.chen.impl.AttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link online.yamm.chen.chen.impl.AttributeImpl#getType <em>Type</em>}</li>
 *   <li>{@link online.yamm.chen.chen.impl.AttributeImpl#isDerived <em>Derived</em>}</li>
 *   <li>{@link online.yamm.chen.chen.impl.AttributeImpl#isMultivalued <em>Multivalued</em>}</li>
 *   <li>{@link online.yamm.chen.chen.impl.AttributeImpl#getKey <em>Key</em>}</li>
 *   <li>{@link online.yamm.chen.chen.impl.AttributeImpl#getConnectionsToSubAttributes <em>Connections To Sub Attributes</em>}</li>
 *   <li>{@link online.yamm.chen.chen.impl.AttributeImpl#getConnectionsToRelationOrEntity <em>Connections To Relation Or Entity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeImpl extends MinimalEObjectImpl.Container implements Attribute {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isDerived() <em>Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDerived()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DERIVED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDerived() <em>Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDerived()
	 * @generated
	 * @ordered
	 */
	protected boolean derived = DERIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #isMultivalued() <em>Multivalued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultivalued()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MULTIVALUED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMultivalued() <em>Multivalued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultivalued()
	 * @generated
	 * @ordered
	 */
	protected boolean multivalued = MULTIVALUED_EDEFAULT;

	/**
	 * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected static final Key KEY_EDEFAULT = Key.NONE;

	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected Key key = KEY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConnectionsToSubAttributes() <em>Connections To Sub Attributes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionsToSubAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> connectionsToSubAttributes;

	/**
	 * The cached value of the '{@link #getConnectionsToRelationOrEntity() <em>Connections To Relation Or Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionsToRelationOrEntity()
	 * @generated
	 * @ordered
	 */
	protected Connection connectionsToRelationOrEntity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChenPackage.Literals.ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDerived() {
		return derived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDerived(boolean newDerived) {
		boolean oldDerived = derived;
		derived = newDerived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChenPackage.ATTRIBUTE__DERIVED, oldDerived, derived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMultivalued() {
		return multivalued;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultivalued(boolean newMultivalued) {
		boolean oldMultivalued = multivalued;
		multivalued = newMultivalued;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChenPackage.ATTRIBUTE__MULTIVALUED, oldMultivalued, multivalued));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ChenPackage.ATTRIBUTE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChenPackage.ATTRIBUTE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Key getKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey(Key newKey) {
		Key oldKey = key;
		key = newKey == null ? KEY_EDEFAULT : newKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChenPackage.ATTRIBUTE__KEY, oldKey, key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connection> getConnectionsToSubAttributes() {
		if (connectionsToSubAttributes == null) {
			connectionsToSubAttributes = new EObjectResolvingEList<Connection>(Connection.class, this, ChenPackage.ATTRIBUTE__CONNECTIONS_TO_SUB_ATTRIBUTES);
		}
		return connectionsToSubAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection getConnectionsToRelationOrEntity() {
		if (connectionsToRelationOrEntity != null && connectionsToRelationOrEntity.eIsProxy()) {
			InternalEObject oldConnectionsToRelationOrEntity = (InternalEObject)connectionsToRelationOrEntity;
			connectionsToRelationOrEntity = (Connection)eResolveProxy(oldConnectionsToRelationOrEntity);
			if (connectionsToRelationOrEntity != oldConnectionsToRelationOrEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ChenPackage.ATTRIBUTE__CONNECTIONS_TO_RELATION_OR_ENTITY, oldConnectionsToRelationOrEntity, connectionsToRelationOrEntity));
			}
		}
		return connectionsToRelationOrEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection basicGetConnectionsToRelationOrEntity() {
		return connectionsToRelationOrEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionsToRelationOrEntity(Connection newConnectionsToRelationOrEntity) {
		Connection oldConnectionsToRelationOrEntity = connectionsToRelationOrEntity;
		connectionsToRelationOrEntity = newConnectionsToRelationOrEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChenPackage.ATTRIBUTE__CONNECTIONS_TO_RELATION_OR_ENTITY, oldConnectionsToRelationOrEntity, connectionsToRelationOrEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ChenPackage.ATTRIBUTE__NAME:
				return getName();
			case ChenPackage.ATTRIBUTE__TYPE:
				return getType();
			case ChenPackage.ATTRIBUTE__DERIVED:
				return isDerived();
			case ChenPackage.ATTRIBUTE__MULTIVALUED:
				return isMultivalued();
			case ChenPackage.ATTRIBUTE__KEY:
				return getKey();
			case ChenPackage.ATTRIBUTE__CONNECTIONS_TO_SUB_ATTRIBUTES:
				return getConnectionsToSubAttributes();
			case ChenPackage.ATTRIBUTE__CONNECTIONS_TO_RELATION_OR_ENTITY:
				if (resolve) return getConnectionsToRelationOrEntity();
				return basicGetConnectionsToRelationOrEntity();
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
			case ChenPackage.ATTRIBUTE__NAME:
				setName((String)newValue);
				return;
			case ChenPackage.ATTRIBUTE__TYPE:
				setType((String)newValue);
				return;
			case ChenPackage.ATTRIBUTE__DERIVED:
				setDerived((Boolean)newValue);
				return;
			case ChenPackage.ATTRIBUTE__MULTIVALUED:
				setMultivalued((Boolean)newValue);
				return;
			case ChenPackage.ATTRIBUTE__KEY:
				setKey((Key)newValue);
				return;
			case ChenPackage.ATTRIBUTE__CONNECTIONS_TO_SUB_ATTRIBUTES:
				getConnectionsToSubAttributes().clear();
				getConnectionsToSubAttributes().addAll((Collection<? extends Connection>)newValue);
				return;
			case ChenPackage.ATTRIBUTE__CONNECTIONS_TO_RELATION_OR_ENTITY:
				setConnectionsToRelationOrEntity((Connection)newValue);
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
			case ChenPackage.ATTRIBUTE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ChenPackage.ATTRIBUTE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case ChenPackage.ATTRIBUTE__DERIVED:
				setDerived(DERIVED_EDEFAULT);
				return;
			case ChenPackage.ATTRIBUTE__MULTIVALUED:
				setMultivalued(MULTIVALUED_EDEFAULT);
				return;
			case ChenPackage.ATTRIBUTE__KEY:
				setKey(KEY_EDEFAULT);
				return;
			case ChenPackage.ATTRIBUTE__CONNECTIONS_TO_SUB_ATTRIBUTES:
				getConnectionsToSubAttributes().clear();
				return;
			case ChenPackage.ATTRIBUTE__CONNECTIONS_TO_RELATION_OR_ENTITY:
				setConnectionsToRelationOrEntity((Connection)null);
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
			case ChenPackage.ATTRIBUTE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ChenPackage.ATTRIBUTE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case ChenPackage.ATTRIBUTE__DERIVED:
				return derived != DERIVED_EDEFAULT;
			case ChenPackage.ATTRIBUTE__MULTIVALUED:
				return multivalued != MULTIVALUED_EDEFAULT;
			case ChenPackage.ATTRIBUTE__KEY:
				return key != KEY_EDEFAULT;
			case ChenPackage.ATTRIBUTE__CONNECTIONS_TO_SUB_ATTRIBUTES:
				return connectionsToSubAttributes != null && !connectionsToSubAttributes.isEmpty();
			case ChenPackage.ATTRIBUTE__CONNECTIONS_TO_RELATION_OR_ENTITY:
				return connectionsToRelationOrEntity != null;
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
		result.append(", type: ");
		result.append(type);
		result.append(", derived: ");
		result.append(derived);
		result.append(", multivalued: ");
		result.append(multivalued);
		result.append(", key: ");
		result.append(key);
		result.append(')');
		return result.toString();
	}

} //AttributeImpl
