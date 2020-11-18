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

import online.yamm.ObjectDiagram.ODObject;
import online.yamm.ObjectDiagram.ODReference;
import online.yamm.ObjectDiagram.ODType;
import online.yamm.ObjectDiagram.ObjectDiagramPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OD Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link online.yamm.ObjectDiagram.impl.ODReferenceImpl#getName <em>Name</em>}</li>
 *   <li>{@link online.yamm.ObjectDiagram.impl.ODReferenceImpl#getType <em>Type</em>}</li>
 *   <li>{@link online.yamm.ObjectDiagram.impl.ODReferenceImpl#isContainment <em>Containment</em>}</li>
 *   <li>{@link online.yamm.ObjectDiagram.impl.ODReferenceImpl#getOpposites <em>Opposites</em>}</li>
 *   <li>{@link online.yamm.ObjectDiagram.impl.ODReferenceImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link online.yamm.ObjectDiagram.impl.ODReferenceImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link online.yamm.ObjectDiagram.impl.ODReferenceImpl#getValue <em>Value</em>}</li>
 *   <li>{@link online.yamm.ObjectDiagram.impl.ODReferenceImpl#isBidirectional <em>Bidirectional</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ODReferenceImpl extends MinimalEObjectImpl.Container implements ODReference {
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
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ODType type;

	/**
	 * The default value of the '{@link #isContainment() <em>Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContainment()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONTAINMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isContainment() <em>Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContainment()
	 * @generated
	 * @ordered
	 */
	protected boolean containment = CONTAINMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOpposites() <em>Opposites</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpposites()
	 * @generated
	 * @ordered
	 */
	protected EList<ODReference> opposites;

	/**
	 * The default value of the '{@link #getLower() <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected static final int LOWER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLower() <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected int lower = LOWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpper() <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected static final int UPPER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUpper() <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected int upper = UPPER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected EList<ODObject> value;

	/**
	 * The default value of the '{@link #isBidirectional() <em>Bidirectional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBidirectional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BIDIRECTIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBidirectional() <em>Bidirectional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBidirectional()
	 * @generated
	 * @ordered
	 */
	protected boolean bidirectional = BIDIRECTIONAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ODReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ObjectDiagramPackage.Literals.OD_REFERENCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ObjectDiagramPackage.OD_REFERENCE__NAME, oldName, name));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ObjectDiagramPackage.OD_REFERENCE__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ObjectDiagramPackage.OD_REFERENCE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isContainment() {
		return containment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainment(boolean newContainment) {
		boolean oldContainment = containment;
		containment = newContainment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObjectDiagramPackage.OD_REFERENCE__CONTAINMENT, oldContainment, containment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ODReference> getOpposites() {
		if (opposites == null) {
			opposites = new EObjectResolvingEList<ODReference>(ODReference.class, this, ObjectDiagramPackage.OD_REFERENCE__OPPOSITES);
		}
		return opposites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLower() {
		return lower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLower(int newLower) {
		int oldLower = lower;
		lower = newLower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObjectDiagramPackage.OD_REFERENCE__LOWER, oldLower, lower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUpper() {
		return upper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpper(int newUpper) {
		int oldUpper = upper;
		upper = newUpper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObjectDiagramPackage.OD_REFERENCE__UPPER, oldUpper, upper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public EList<ODObject> getValue() {
		if (value == null) {
			value = new EObjectResolvingEList<ODObject>(ODObject.class, this, ObjectDiagramPackage.OD_REFERENCE__VALUE) /*{
				@Override
				protected boolean isUnique() {
					return false;
				}
			}*/;
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBidirectional() {
		return bidirectional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBidirectional(boolean newBidirectional) {
		boolean oldBidirectional = bidirectional;
		bidirectional = newBidirectional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObjectDiagramPackage.OD_REFERENCE__BIDIRECTIONAL, oldBidirectional, bidirectional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ObjectDiagramPackage.OD_REFERENCE__NAME:
				return getName();
			case ObjectDiagramPackage.OD_REFERENCE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case ObjectDiagramPackage.OD_REFERENCE__CONTAINMENT:
				return isContainment();
			case ObjectDiagramPackage.OD_REFERENCE__OPPOSITES:
				return getOpposites();
			case ObjectDiagramPackage.OD_REFERENCE__LOWER:
				return getLower();
			case ObjectDiagramPackage.OD_REFERENCE__UPPER:
				return getUpper();
			case ObjectDiagramPackage.OD_REFERENCE__VALUE:
				return getValue();
			case ObjectDiagramPackage.OD_REFERENCE__BIDIRECTIONAL:
				return isBidirectional();
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
			case ObjectDiagramPackage.OD_REFERENCE__NAME:
				setName((String)newValue);
				return;
			case ObjectDiagramPackage.OD_REFERENCE__TYPE:
				setType((ODType)newValue);
				return;
			case ObjectDiagramPackage.OD_REFERENCE__CONTAINMENT:
				setContainment((Boolean)newValue);
				return;
			case ObjectDiagramPackage.OD_REFERENCE__OPPOSITES:
				getOpposites().clear();
				getOpposites().addAll((Collection<? extends ODReference>)newValue);
				return;
			case ObjectDiagramPackage.OD_REFERENCE__LOWER:
				setLower((Integer)newValue);
				return;
			case ObjectDiagramPackage.OD_REFERENCE__UPPER:
				setUpper((Integer)newValue);
				return;
			case ObjectDiagramPackage.OD_REFERENCE__VALUE:
				getValue().clear();
				getValue().addAll((Collection<? extends ODObject>)newValue);
				return;
			case ObjectDiagramPackage.OD_REFERENCE__BIDIRECTIONAL:
				setBidirectional((Boolean)newValue);
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
			case ObjectDiagramPackage.OD_REFERENCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ObjectDiagramPackage.OD_REFERENCE__TYPE:
				setType((ODType)null);
				return;
			case ObjectDiagramPackage.OD_REFERENCE__CONTAINMENT:
				setContainment(CONTAINMENT_EDEFAULT);
				return;
			case ObjectDiagramPackage.OD_REFERENCE__OPPOSITES:
				getOpposites().clear();
				return;
			case ObjectDiagramPackage.OD_REFERENCE__LOWER:
				setLower(LOWER_EDEFAULT);
				return;
			case ObjectDiagramPackage.OD_REFERENCE__UPPER:
				setUpper(UPPER_EDEFAULT);
				return;
			case ObjectDiagramPackage.OD_REFERENCE__VALUE:
				getValue().clear();
				return;
			case ObjectDiagramPackage.OD_REFERENCE__BIDIRECTIONAL:
				setBidirectional(BIDIRECTIONAL_EDEFAULT);
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
			case ObjectDiagramPackage.OD_REFERENCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ObjectDiagramPackage.OD_REFERENCE__TYPE:
				return type != null;
			case ObjectDiagramPackage.OD_REFERENCE__CONTAINMENT:
				return containment != CONTAINMENT_EDEFAULT;
			case ObjectDiagramPackage.OD_REFERENCE__OPPOSITES:
				return opposites != null && !opposites.isEmpty();
			case ObjectDiagramPackage.OD_REFERENCE__LOWER:
				return lower != LOWER_EDEFAULT;
			case ObjectDiagramPackage.OD_REFERENCE__UPPER:
				return upper != UPPER_EDEFAULT;
			case ObjectDiagramPackage.OD_REFERENCE__VALUE:
				return value != null && !value.isEmpty();
			case ObjectDiagramPackage.OD_REFERENCE__BIDIRECTIONAL:
				return bidirectional != BIDIRECTIONAL_EDEFAULT;
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
		result.append(", containment: ");
		result.append(containment);
		result.append(", lower: ");
		result.append(lower);
		result.append(", upper: ");
		result.append(upper);
		result.append(", bidirectional: ");
		result.append(bidirectional);
		result.append(')');
		return result.toString();
	}

} //ODReferenceImpl
