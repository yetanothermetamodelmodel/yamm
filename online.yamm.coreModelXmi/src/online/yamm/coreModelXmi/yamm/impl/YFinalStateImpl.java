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

import java.util.Collection;
import online.yamm.coreModelXmi.yamm.SingleLinePropertyInfo;
import online.yamm.coreModelXmi.yamm.YFinalState;
import online.yamm.coreModelXmi.yamm.YNamedElement;
import online.yamm.coreModelXmi.yamm.YTransition;
import online.yamm.coreModelXmi.yamm.YVertex;
import online.yamm.coreModelXmi.yamm.YammPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YFinal State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YFinalStateImpl#getName <em>Name</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YFinalStateImpl#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YFinalStateImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YFinalStateImpl#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YFinalStateImpl#getPosObjectID <em>Pos Object ID</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YFinalStateImpl#getPosName <em>Pos Name</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YFinalStateImpl#getPosQualifiedName <em>Pos Qualified Name</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YFinalStateImpl#getInsertOutgoing <em>Insert Outgoing</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YFinalStateImpl#getInsertIncoming <em>Insert Incoming</em>}</li>
 * </ul>
 *
 * @generated
 */
public class YFinalStateImpl extends YElementImpl implements YFinalState
{
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
	 * This is true if the Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nameESet;

	/**
	 * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoing()
	 * @generated
	 * @ordered
	 */
	protected EList<YTransition> outgoing;

	/**
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming()
	 * @generated
	 * @ordered
	 */
	protected EList<YTransition> incoming;

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
	 * The cached value of the '{@link #getPosObjectID() <em>Pos Object ID</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosObjectID()
	 * @generated
	 * @ordered
	 */
	protected SingleLinePropertyInfo posObjectID;

	/**
	 * The cached value of the '{@link #getPosName() <em>Pos Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosName()
	 * @generated
	 * @ordered
	 */
	protected SingleLinePropertyInfo posName;

	/**
	 * The cached value of the '{@link #getPosQualifiedName() <em>Pos Qualified Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected SingleLinePropertyInfo posQualifiedName;

	/**
	 * The default value of the '{@link #getInsertOutgoing() <em>Insert Outgoing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsertOutgoing()
	 * @generated
	 * @ordered
	 */
	protected static final int INSERT_OUTGOING_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInsertOutgoing() <em>Insert Outgoing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsertOutgoing()
	 * @generated
	 * @ordered
	 */
	protected int insertOutgoing = INSERT_OUTGOING_EDEFAULT;

	/**
	 * The default value of the '{@link #getInsertIncoming() <em>Insert Incoming</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsertIncoming()
	 * @generated
	 * @ordered
	 */
	protected static final int INSERT_INCOMING_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInsertIncoming() <em>Insert Incoming</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsertIncoming()
	 * @generated
	 * @ordered
	 */
	protected int insertIncoming = INSERT_INCOMING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YFinalStateImpl()
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
		return YammPackage.Literals.YFINAL_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName)
	{
		String oldName = name;
		name = newName;
		boolean oldNameESet = nameESet;
		nameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YFINAL_STATE__NAME, oldName, name, !oldNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetName()
	{
		String oldName = name;
		boolean oldNameESet = nameESet;
		name = NAME_EDEFAULT;
		nameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, YammPackage.YFINAL_STATE__NAME, oldName, NAME_EDEFAULT, oldNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetName()
	{
		return nameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YTransition> getOutgoing()
	{
		if (outgoing == null) {
			outgoing = new EObjectResolvingEList<YTransition>(YTransition.class, this, YammPackage.YFINAL_STATE__OUTGOING);
		}
		return outgoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YTransition> getIncoming()
	{
		if (incoming == null) {
			incoming = new EObjectResolvingEList<YTransition>(YTransition.class, this, YammPackage.YFINAL_STATE__INCOMING);
		}
		return incoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQualifiedName()
	{
		return qualifiedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualifiedName(String newQualifiedName)
	{
		String oldQualifiedName = qualifiedName;
		qualifiedName = newQualifiedName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YFINAL_STATE__QUALIFIED_NAME, oldQualifiedName, qualifiedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo getPosObjectID()
	{
		if (posObjectID != null && posObjectID.eIsProxy()) {
			InternalEObject oldPosObjectID = (InternalEObject)posObjectID;
			posObjectID = (SingleLinePropertyInfo)eResolveProxy(oldPosObjectID);
			if (posObjectID != oldPosObjectID) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammPackage.YFINAL_STATE__POS_OBJECT_ID, oldPosObjectID, posObjectID));
			}
		}
		return posObjectID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo basicGetPosObjectID()
	{
		return posObjectID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosObjectID(SingleLinePropertyInfo newPosObjectID)
	{
		SingleLinePropertyInfo oldPosObjectID = posObjectID;
		posObjectID = newPosObjectID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YFINAL_STATE__POS_OBJECT_ID, oldPosObjectID, posObjectID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo getPosName()
	{
		if (posName != null && posName.eIsProxy()) {
			InternalEObject oldPosName = (InternalEObject)posName;
			posName = (SingleLinePropertyInfo)eResolveProxy(oldPosName);
			if (posName != oldPosName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammPackage.YFINAL_STATE__POS_NAME, oldPosName, posName));
			}
		}
		return posName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo basicGetPosName()
	{
		return posName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosName(SingleLinePropertyInfo newPosName)
	{
		SingleLinePropertyInfo oldPosName = posName;
		posName = newPosName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YFINAL_STATE__POS_NAME, oldPosName, posName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo getPosQualifiedName()
	{
		if (posQualifiedName != null && posQualifiedName.eIsProxy()) {
			InternalEObject oldPosQualifiedName = (InternalEObject)posQualifiedName;
			posQualifiedName = (SingleLinePropertyInfo)eResolveProxy(oldPosQualifiedName);
			if (posQualifiedName != oldPosQualifiedName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammPackage.YFINAL_STATE__POS_QUALIFIED_NAME, oldPosQualifiedName, posQualifiedName));
			}
		}
		return posQualifiedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo basicGetPosQualifiedName()
	{
		return posQualifiedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosQualifiedName(SingleLinePropertyInfo newPosQualifiedName)
	{
		SingleLinePropertyInfo oldPosQualifiedName = posQualifiedName;
		posQualifiedName = newPosQualifiedName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YFINAL_STATE__POS_QUALIFIED_NAME, oldPosQualifiedName, posQualifiedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInsertOutgoing()
	{
		return insertOutgoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsertOutgoing(int newInsertOutgoing)
	{
		int oldInsertOutgoing = insertOutgoing;
		insertOutgoing = newInsertOutgoing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YFINAL_STATE__INSERT_OUTGOING, oldInsertOutgoing, insertOutgoing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInsertIncoming()
	{
		return insertIncoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsertIncoming(int newInsertIncoming)
	{
		int oldInsertIncoming = insertIncoming;
		insertIncoming = newInsertIncoming;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YFINAL_STATE__INSERT_INCOMING, oldInsertIncoming, insertIncoming));
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
			case YammPackage.YFINAL_STATE__NAME:
				return getName();
			case YammPackage.YFINAL_STATE__OUTGOING:
				return getOutgoing();
			case YammPackage.YFINAL_STATE__INCOMING:
				return getIncoming();
			case YammPackage.YFINAL_STATE__QUALIFIED_NAME:
				return getQualifiedName();
			case YammPackage.YFINAL_STATE__POS_OBJECT_ID:
				if (resolve) return getPosObjectID();
				return basicGetPosObjectID();
			case YammPackage.YFINAL_STATE__POS_NAME:
				if (resolve) return getPosName();
				return basicGetPosName();
			case YammPackage.YFINAL_STATE__POS_QUALIFIED_NAME:
				if (resolve) return getPosQualifiedName();
				return basicGetPosQualifiedName();
			case YammPackage.YFINAL_STATE__INSERT_OUTGOING:
				return getInsertOutgoing();
			case YammPackage.YFINAL_STATE__INSERT_INCOMING:
				return getInsertIncoming();
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
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID) {
			case YammPackage.YFINAL_STATE__NAME:
				setName((String)newValue);
				return;
			case YammPackage.YFINAL_STATE__OUTGOING:
				getOutgoing().clear();
				getOutgoing().addAll((Collection<? extends YTransition>)newValue);
				return;
			case YammPackage.YFINAL_STATE__INCOMING:
				getIncoming().clear();
				getIncoming().addAll((Collection<? extends YTransition>)newValue);
				return;
			case YammPackage.YFINAL_STATE__QUALIFIED_NAME:
				setQualifiedName((String)newValue);
				return;
			case YammPackage.YFINAL_STATE__POS_OBJECT_ID:
				setPosObjectID((SingleLinePropertyInfo)newValue);
				return;
			case YammPackage.YFINAL_STATE__POS_NAME:
				setPosName((SingleLinePropertyInfo)newValue);
				return;
			case YammPackage.YFINAL_STATE__POS_QUALIFIED_NAME:
				setPosQualifiedName((SingleLinePropertyInfo)newValue);
				return;
			case YammPackage.YFINAL_STATE__INSERT_OUTGOING:
				setInsertOutgoing((Integer)newValue);
				return;
			case YammPackage.YFINAL_STATE__INSERT_INCOMING:
				setInsertIncoming((Integer)newValue);
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
			case YammPackage.YFINAL_STATE__NAME:
				unsetName();
				return;
			case YammPackage.YFINAL_STATE__OUTGOING:
				getOutgoing().clear();
				return;
			case YammPackage.YFINAL_STATE__INCOMING:
				getIncoming().clear();
				return;
			case YammPackage.YFINAL_STATE__QUALIFIED_NAME:
				setQualifiedName(QUALIFIED_NAME_EDEFAULT);
				return;
			case YammPackage.YFINAL_STATE__POS_OBJECT_ID:
				setPosObjectID((SingleLinePropertyInfo)null);
				return;
			case YammPackage.YFINAL_STATE__POS_NAME:
				setPosName((SingleLinePropertyInfo)null);
				return;
			case YammPackage.YFINAL_STATE__POS_QUALIFIED_NAME:
				setPosQualifiedName((SingleLinePropertyInfo)null);
				return;
			case YammPackage.YFINAL_STATE__INSERT_OUTGOING:
				setInsertOutgoing(INSERT_OUTGOING_EDEFAULT);
				return;
			case YammPackage.YFINAL_STATE__INSERT_INCOMING:
				setInsertIncoming(INSERT_INCOMING_EDEFAULT);
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
			case YammPackage.YFINAL_STATE__NAME:
				return isSetName();
			case YammPackage.YFINAL_STATE__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
			case YammPackage.YFINAL_STATE__INCOMING:
				return incoming != null && !incoming.isEmpty();
			case YammPackage.YFINAL_STATE__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? qualifiedName != null : !QUALIFIED_NAME_EDEFAULT.equals(qualifiedName);
			case YammPackage.YFINAL_STATE__POS_OBJECT_ID:
				return posObjectID != null;
			case YammPackage.YFINAL_STATE__POS_NAME:
				return posName != null;
			case YammPackage.YFINAL_STATE__POS_QUALIFIED_NAME:
				return posQualifiedName != null;
			case YammPackage.YFINAL_STATE__INSERT_OUTGOING:
				return insertOutgoing != INSERT_OUTGOING_EDEFAULT;
			case YammPackage.YFINAL_STATE__INSERT_INCOMING:
				return insertIncoming != INSERT_INCOMING_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
	{
		if (baseClass == YNamedElement.class) {
			switch (derivedFeatureID) {
				case YammPackage.YFINAL_STATE__NAME: return YammPackage.YNAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == YVertex.class) {
			switch (derivedFeatureID) {
				case YammPackage.YFINAL_STATE__OUTGOING: return YammPackage.YVERTEX__OUTGOING;
				case YammPackage.YFINAL_STATE__INCOMING: return YammPackage.YVERTEX__INCOMING;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
	{
		if (baseClass == YNamedElement.class) {
			switch (baseFeatureID) {
				case YammPackage.YNAMED_ELEMENT__NAME: return YammPackage.YFINAL_STATE__NAME;
				default: return -1;
			}
		}
		if (baseClass == YVertex.class) {
			switch (baseFeatureID) {
				case YammPackage.YVERTEX__OUTGOING: return YammPackage.YFINAL_STATE__OUTGOING;
				case YammPackage.YVERTEX__INCOMING: return YammPackage.YFINAL_STATE__INCOMING;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (name: ");
		if (nameESet) result.append(name); else result.append("<unset>");
		result.append(", qualifiedName: ");
		result.append(qualifiedName);
		result.append(", insertOutgoing: ");
		result.append(insertOutgoing);
		result.append(", insertIncoming: ");
		result.append(insertIncoming);
		result.append(')');
		return result.toString();
	}

} //YFinalStateImpl
