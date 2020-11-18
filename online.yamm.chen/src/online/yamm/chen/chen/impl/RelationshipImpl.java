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
import online.yamm.chen.chen.Relationship;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link online.yamm.chen.chen.impl.RelationshipImpl#getName <em>Name</em>}</li>
 *   <li>{@link online.yamm.chen.chen.impl.RelationshipImpl#isIndentifyingRelationship <em>Indentifying Relationship</em>}</li>
 *   <li>{@link online.yamm.chen.chen.impl.RelationshipImpl#getConnectionsToEntities <em>Connections To Entities</em>}</li>
 *   <li>{@link online.yamm.chen.chen.impl.RelationshipImpl#getConnectionsToAttributes <em>Connections To Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationshipImpl extends MinimalEObjectImpl.Container implements Relationship {
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
	 * The default value of the '{@link #isIndentifyingRelationship() <em>Indentifying Relationship</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIndentifyingRelationship()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INDENTIFYING_RELATIONSHIP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIndentifyingRelationship() <em>Indentifying Relationship</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIndentifyingRelationship()
	 * @generated
	 * @ordered
	 */
	protected boolean indentifyingRelationship = INDENTIFYING_RELATIONSHIP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConnectionsToEntities() <em>Connections To Entities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionsToEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> connectionsToEntities;

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
	protected RelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChenPackage.Literals.RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connection> getConnectionsToEntities() {
		if (connectionsToEntities == null) {
			connectionsToEntities = new EObjectResolvingEList<Connection>(Connection.class, this, ChenPackage.RELATIONSHIP__CONNECTIONS_TO_ENTITIES);
		}
		return connectionsToEntities;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ChenPackage.RELATIONSHIP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIndentifyingRelationship() {
		return indentifyingRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndentifyingRelationship(boolean newIndentifyingRelationship) {
		boolean oldIndentifyingRelationship = indentifyingRelationship;
		indentifyingRelationship = newIndentifyingRelationship;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChenPackage.RELATIONSHIP__INDENTIFYING_RELATIONSHIP, oldIndentifyingRelationship, indentifyingRelationship));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connection> getConnectionsToAttributes() {
		if (connectionsToAttributes == null) {
			connectionsToAttributes = new EObjectResolvingEList<Connection>(Connection.class, this, ChenPackage.RELATIONSHIP__CONNECTIONS_TO_ATTRIBUTES);
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
			case ChenPackage.RELATIONSHIP__NAME:
				return getName();
			case ChenPackage.RELATIONSHIP__INDENTIFYING_RELATIONSHIP:
				return isIndentifyingRelationship();
			case ChenPackage.RELATIONSHIP__CONNECTIONS_TO_ENTITIES:
				return getConnectionsToEntities();
			case ChenPackage.RELATIONSHIP__CONNECTIONS_TO_ATTRIBUTES:
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
			case ChenPackage.RELATIONSHIP__NAME:
				setName((String)newValue);
				return;
			case ChenPackage.RELATIONSHIP__INDENTIFYING_RELATIONSHIP:
				setIndentifyingRelationship((Boolean)newValue);
				return;
			case ChenPackage.RELATIONSHIP__CONNECTIONS_TO_ENTITIES:
				getConnectionsToEntities().clear();
				getConnectionsToEntities().addAll((Collection<? extends Connection>)newValue);
				return;
			case ChenPackage.RELATIONSHIP__CONNECTIONS_TO_ATTRIBUTES:
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
			case ChenPackage.RELATIONSHIP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ChenPackage.RELATIONSHIP__INDENTIFYING_RELATIONSHIP:
				setIndentifyingRelationship(INDENTIFYING_RELATIONSHIP_EDEFAULT);
				return;
			case ChenPackage.RELATIONSHIP__CONNECTIONS_TO_ENTITIES:
				getConnectionsToEntities().clear();
				return;
			case ChenPackage.RELATIONSHIP__CONNECTIONS_TO_ATTRIBUTES:
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
			case ChenPackage.RELATIONSHIP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ChenPackage.RELATIONSHIP__INDENTIFYING_RELATIONSHIP:
				return indentifyingRelationship != INDENTIFYING_RELATIONSHIP_EDEFAULT;
			case ChenPackage.RELATIONSHIP__CONNECTIONS_TO_ENTITIES:
				return connectionsToEntities != null && !connectionsToEntities.isEmpty();
			case ChenPackage.RELATIONSHIP__CONNECTIONS_TO_ATTRIBUTES:
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
		result.append(", indentifyingRelationship: ");
		result.append(indentifyingRelationship);
		result.append(')');
		return result.toString();
	}

} //RelationshipImpl
