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
/**
 */
package dev.yamm.chen.chen.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import dev.yamm.chen.chen.Attribute;
import dev.yamm.chen.chen.Chen;
import dev.yamm.chen.chen.ChenPackage;
import dev.yamm.chen.chen.Connection;
import dev.yamm.chen.chen.Entity;
import dev.yamm.chen.chen.Generalization;
import dev.yamm.chen.chen.Relationship;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chen</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dev.yamm.chen.chen.impl.ChenImpl#getEntities <em>Entities</em>}</li>
 *   <li>{@link dev.yamm.chen.chen.impl.ChenImpl#getConnections <em>Connections</em>}</li>
 *   <li>{@link dev.yamm.chen.chen.impl.ChenImpl#getRealtionships <em>Realtionships</em>}</li>
 *   <li>{@link dev.yamm.chen.chen.impl.ChenImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link dev.yamm.chen.chen.impl.ChenImpl#getGeneralizations <em>Generalizations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChenImpl extends MinimalEObjectImpl.Container implements Chen {
	/**
	 * The cached value of the '{@link #getEntities() <em>Entities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> entities;

	/**
	 * The cached value of the '{@link #getConnections() <em>Connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> connections;

	/**
	 * The cached value of the '{@link #getRealtionships() <em>Realtionships</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealtionships()
	 * @generated
	 * @ordered
	 */
	protected EList<Relationship> realtionships;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributes;

	/**
	 * The cached value of the '{@link #getGeneralizations() <em>Generalizations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralizations()
	 * @generated
	 * @ordered
	 */
	protected EList<Generalization> generalizations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChenPackage.Literals.CHEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getEntities() {
		if (entities == null) {
			entities = new EObjectContainmentEList<Entity>(Entity.class, this, ChenPackage.CHEN__ENTITIES);
		}
		return entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connection> getConnections() {
		if (connections == null) {
			connections = new EObjectContainmentEList<Connection>(Connection.class, this, ChenPackage.CHEN__CONNECTIONS);
		}
		return connections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relationship> getRealtionships() {
		if (realtionships == null) {
			realtionships = new EObjectContainmentEList<Relationship>(Relationship.class, this, ChenPackage.CHEN__REALTIONSHIPS);
		}
		return realtionships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, ChenPackage.CHEN__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Generalization> getGeneralizations() {
		if (generalizations == null) {
			generalizations = new EObjectContainmentEList<Generalization>(Generalization.class, this, ChenPackage.CHEN__GENERALIZATIONS);
		}
		return generalizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ChenPackage.CHEN__ENTITIES:
				return ((InternalEList<?>)getEntities()).basicRemove(otherEnd, msgs);
			case ChenPackage.CHEN__CONNECTIONS:
				return ((InternalEList<?>)getConnections()).basicRemove(otherEnd, msgs);
			case ChenPackage.CHEN__REALTIONSHIPS:
				return ((InternalEList<?>)getRealtionships()).basicRemove(otherEnd, msgs);
			case ChenPackage.CHEN__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case ChenPackage.CHEN__GENERALIZATIONS:
				return ((InternalEList<?>)getGeneralizations()).basicRemove(otherEnd, msgs);
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
			case ChenPackage.CHEN__ENTITIES:
				return getEntities();
			case ChenPackage.CHEN__CONNECTIONS:
				return getConnections();
			case ChenPackage.CHEN__REALTIONSHIPS:
				return getRealtionships();
			case ChenPackage.CHEN__ATTRIBUTES:
				return getAttributes();
			case ChenPackage.CHEN__GENERALIZATIONS:
				return getGeneralizations();
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
			case ChenPackage.CHEN__ENTITIES:
				getEntities().clear();
				getEntities().addAll((Collection<? extends Entity>)newValue);
				return;
			case ChenPackage.CHEN__CONNECTIONS:
				getConnections().clear();
				getConnections().addAll((Collection<? extends Connection>)newValue);
				return;
			case ChenPackage.CHEN__REALTIONSHIPS:
				getRealtionships().clear();
				getRealtionships().addAll((Collection<? extends Relationship>)newValue);
				return;
			case ChenPackage.CHEN__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attribute>)newValue);
				return;
			case ChenPackage.CHEN__GENERALIZATIONS:
				getGeneralizations().clear();
				getGeneralizations().addAll((Collection<? extends Generalization>)newValue);
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
			case ChenPackage.CHEN__ENTITIES:
				getEntities().clear();
				return;
			case ChenPackage.CHEN__CONNECTIONS:
				getConnections().clear();
				return;
			case ChenPackage.CHEN__REALTIONSHIPS:
				getRealtionships().clear();
				return;
			case ChenPackage.CHEN__ATTRIBUTES:
				getAttributes().clear();
				return;
			case ChenPackage.CHEN__GENERALIZATIONS:
				getGeneralizations().clear();
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
			case ChenPackage.CHEN__ENTITIES:
				return entities != null && !entities.isEmpty();
			case ChenPackage.CHEN__CONNECTIONS:
				return connections != null && !connections.isEmpty();
			case ChenPackage.CHEN__REALTIONSHIPS:
				return realtionships != null && !realtionships.isEmpty();
			case ChenPackage.CHEN__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case ChenPackage.CHEN__GENERALIZATIONS:
				return generalizations != null && !generalizations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ChenImpl
