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
import online.yamm.coreModelXmi.yamm.YClass;
import online.yamm.coreModelXmi.yamm.YFeature;
import online.yamm.coreModelXmi.yamm.YNamedElement;
import online.yamm.coreModelXmi.yamm.YNamespace;
import online.yamm.coreModelXmi.yamm.YOperation;
import online.yamm.coreModelXmi.yamm.YParameter;
import online.yamm.coreModelXmi.yamm.YStateMachine;
import online.yamm.coreModelXmi.yamm.YType;
import online.yamm.coreModelXmi.yamm.YammPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YOperation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YOperationImpl#getName <em>Name</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YOperationImpl#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YOperationImpl#getOwnedParameter <em>Owned Parameter</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YOperationImpl#getStateMachine <em>State Machine</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YOperationImpl#getClazz <em>Clazz</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YOperationImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YOperationImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YOperationImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YOperationImpl#getPosObjectID <em>Pos Object ID</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YOperationImpl#getPosName <em>Pos Name</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YOperationImpl#getPosClazz <em>Pos Clazz</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YOperationImpl#getPosLower <em>Pos Lower</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YOperationImpl#getPosUpper <em>Pos Upper</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YOperationImpl#getPosStateMachine <em>Pos State Machine</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YOperationImpl#getPosReturnType <em>Pos Return Type</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YOperationImpl#getInsertLineParameter <em>Insert Line Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class YOperationImpl extends YElementImpl implements YOperation
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
	 * The cached value of the '{@link #getOwnedParameter() <em>Owned Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<YParameter> ownedParameter;

	/**
	 * The cached value of the '{@link #getStateMachine() <em>State Machine</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateMachine()
	 * @generated
	 * @ordered
	 */
	protected YStateMachine stateMachine;

	/**
	 * The cached value of the '{@link #getClazz() <em>Clazz</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClazz()
	 * @generated
	 * @ordered
	 */
	protected YClass clazz;

	/**
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected YType returnType;

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
	protected static final int UPPER_EDEFAULT = 1;

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
	 * The cached value of the '{@link #getPosClazz() <em>Pos Clazz</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosClazz()
	 * @generated
	 * @ordered
	 */
	protected SingleLinePropertyInfo posClazz;

	/**
	 * The cached value of the '{@link #getPosLower() <em>Pos Lower</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosLower()
	 * @generated
	 * @ordered
	 */
	protected SingleLinePropertyInfo posLower;

	/**
	 * The cached value of the '{@link #getPosUpper() <em>Pos Upper</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosUpper()
	 * @generated
	 * @ordered
	 */
	protected SingleLinePropertyInfo posUpper;

	/**
	 * The cached value of the '{@link #getPosStateMachine() <em>Pos State Machine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosStateMachine()
	 * @generated
	 * @ordered
	 */
	protected SingleLinePropertyInfo posStateMachine;

	/**
	 * The cached value of the '{@link #getPosReturnType() <em>Pos Return Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosReturnType()
	 * @generated
	 * @ordered
	 */
	protected SingleLinePropertyInfo posReturnType;

	/**
	 * The default value of the '{@link #getInsertLineParameter() <em>Insert Line Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsertLineParameter()
	 * @generated
	 * @ordered
	 */
	protected static final int INSERT_LINE_PARAMETER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInsertLineParameter() <em>Insert Line Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsertLineParameter()
	 * @generated
	 * @ordered
	 */
	protected int insertLineParameter = INSERT_LINE_PARAMETER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YOperationImpl()
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
		return YammPackage.Literals.YOPERATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YOPERATION__NAME, oldName, name, !oldNameESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, YammPackage.YOPERATION__NAME, oldName, NAME_EDEFAULT, oldNameESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YOPERATION__QUALIFIED_NAME, oldQualifiedName, qualifiedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YParameter> getOwnedParameter()
	{
		if (ownedParameter == null) {
			ownedParameter = new EObjectContainmentEList<YParameter>(YParameter.class, this, YammPackage.YOPERATION__OWNED_PARAMETER);
		}
		return ownedParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YStateMachine getStateMachine()
	{
		return stateMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStateMachine(YStateMachine newStateMachine, NotificationChain msgs)
	{
		YStateMachine oldStateMachine = stateMachine;
		stateMachine = newStateMachine;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, YammPackage.YOPERATION__STATE_MACHINE, oldStateMachine, newStateMachine);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateMachine(YStateMachine newStateMachine)
	{
		if (newStateMachine != stateMachine) {
			NotificationChain msgs = null;
			if (stateMachine != null)
				msgs = ((InternalEObject)stateMachine).eInverseRemove(this, YammPackage.YSTATE_MACHINE__OPERATION, YStateMachine.class, msgs);
			if (newStateMachine != null)
				msgs = ((InternalEObject)newStateMachine).eInverseAdd(this, YammPackage.YSTATE_MACHINE__OPERATION, YStateMachine.class, msgs);
			msgs = basicSetStateMachine(newStateMachine, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YOPERATION__STATE_MACHINE, newStateMachine, newStateMachine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YClass getClazz()
	{
		if (clazz != null && clazz.eIsProxy()) {
			InternalEObject oldClazz = (InternalEObject)clazz;
			clazz = (YClass)eResolveProxy(oldClazz);
			if (clazz != oldClazz) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammPackage.YOPERATION__CLAZZ, oldClazz, clazz));
			}
		}
		return clazz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YClass basicGetClazz()
	{
		return clazz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClazz(YClass newClazz)
	{
		YClass oldClazz = clazz;
		clazz = newClazz;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YOPERATION__CLAZZ, oldClazz, clazz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YType getReturnType()
	{
		if (returnType != null && returnType.eIsProxy()) {
			InternalEObject oldReturnType = (InternalEObject)returnType;
			returnType = (YType)eResolveProxy(oldReturnType);
			if (returnType != oldReturnType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammPackage.YOPERATION__RETURN_TYPE, oldReturnType, returnType));
			}
		}
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YType basicGetReturnType()
	{
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnType(YType newReturnType)
	{
		YType oldReturnType = returnType;
		returnType = newReturnType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YOPERATION__RETURN_TYPE, oldReturnType, returnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLower()
	{
		return lower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLower(int newLower)
	{
		int oldLower = lower;
		lower = newLower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YOPERATION__LOWER, oldLower, lower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUpper()
	{
		return upper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpper(int newUpper)
	{
		int oldUpper = upper;
		upper = newUpper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YOPERATION__UPPER, oldUpper, upper));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammPackage.YOPERATION__POS_OBJECT_ID, oldPosObjectID, posObjectID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YOPERATION__POS_OBJECT_ID, oldPosObjectID, posObjectID));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammPackage.YOPERATION__POS_NAME, oldPosName, posName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YOPERATION__POS_NAME, oldPosName, posName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo getPosClazz()
	{
		if (posClazz != null && posClazz.eIsProxy()) {
			InternalEObject oldPosClazz = (InternalEObject)posClazz;
			posClazz = (SingleLinePropertyInfo)eResolveProxy(oldPosClazz);
			if (posClazz != oldPosClazz) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammPackage.YOPERATION__POS_CLAZZ, oldPosClazz, posClazz));
			}
		}
		return posClazz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo basicGetPosClazz()
	{
		return posClazz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosClazz(SingleLinePropertyInfo newPosClazz)
	{
		SingleLinePropertyInfo oldPosClazz = posClazz;
		posClazz = newPosClazz;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YOPERATION__POS_CLAZZ, oldPosClazz, posClazz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo getPosLower()
	{
		if (posLower != null && posLower.eIsProxy()) {
			InternalEObject oldPosLower = (InternalEObject)posLower;
			posLower = (SingleLinePropertyInfo)eResolveProxy(oldPosLower);
			if (posLower != oldPosLower) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammPackage.YOPERATION__POS_LOWER, oldPosLower, posLower));
			}
		}
		return posLower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo basicGetPosLower()
	{
		return posLower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosLower(SingleLinePropertyInfo newPosLower)
	{
		SingleLinePropertyInfo oldPosLower = posLower;
		posLower = newPosLower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YOPERATION__POS_LOWER, oldPosLower, posLower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo getPosUpper()
	{
		if (posUpper != null && posUpper.eIsProxy()) {
			InternalEObject oldPosUpper = (InternalEObject)posUpper;
			posUpper = (SingleLinePropertyInfo)eResolveProxy(oldPosUpper);
			if (posUpper != oldPosUpper) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammPackage.YOPERATION__POS_UPPER, oldPosUpper, posUpper));
			}
		}
		return posUpper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo basicGetPosUpper()
	{
		return posUpper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosUpper(SingleLinePropertyInfo newPosUpper)
	{
		SingleLinePropertyInfo oldPosUpper = posUpper;
		posUpper = newPosUpper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YOPERATION__POS_UPPER, oldPosUpper, posUpper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo getPosStateMachine()
	{
		if (posStateMachine != null && posStateMachine.eIsProxy()) {
			InternalEObject oldPosStateMachine = (InternalEObject)posStateMachine;
			posStateMachine = (SingleLinePropertyInfo)eResolveProxy(oldPosStateMachine);
			if (posStateMachine != oldPosStateMachine) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammPackage.YOPERATION__POS_STATE_MACHINE, oldPosStateMachine, posStateMachine));
			}
		}
		return posStateMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo basicGetPosStateMachine()
	{
		return posStateMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosStateMachine(SingleLinePropertyInfo newPosStateMachine)
	{
		SingleLinePropertyInfo oldPosStateMachine = posStateMachine;
		posStateMachine = newPosStateMachine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YOPERATION__POS_STATE_MACHINE, oldPosStateMachine, posStateMachine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo getPosReturnType()
	{
		if (posReturnType != null && posReturnType.eIsProxy()) {
			InternalEObject oldPosReturnType = (InternalEObject)posReturnType;
			posReturnType = (SingleLinePropertyInfo)eResolveProxy(oldPosReturnType);
			if (posReturnType != oldPosReturnType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammPackage.YOPERATION__POS_RETURN_TYPE, oldPosReturnType, posReturnType));
			}
		}
		return posReturnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo basicGetPosReturnType()
	{
		return posReturnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosReturnType(SingleLinePropertyInfo newPosReturnType)
	{
		SingleLinePropertyInfo oldPosReturnType = posReturnType;
		posReturnType = newPosReturnType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YOPERATION__POS_RETURN_TYPE, oldPosReturnType, posReturnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInsertLineParameter()
	{
		return insertLineParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsertLineParameter(int newInsertLineParameter)
	{
		int oldInsertLineParameter = insertLineParameter;
		insertLineParameter = newInsertLineParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YOPERATION__INSERT_LINE_PARAMETER, oldInsertLineParameter, insertLineParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID) {
			case YammPackage.YOPERATION__STATE_MACHINE:
				if (stateMachine != null)
					msgs = ((InternalEObject)stateMachine).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - YammPackage.YOPERATION__STATE_MACHINE, null, msgs);
				return basicSetStateMachine((YStateMachine)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID) {
			case YammPackage.YOPERATION__OWNED_PARAMETER:
				return ((InternalEList<?>)getOwnedParameter()).basicRemove(otherEnd, msgs);
			case YammPackage.YOPERATION__STATE_MACHINE:
				return basicSetStateMachine(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case YammPackage.YOPERATION__NAME:
				return getName();
			case YammPackage.YOPERATION__QUALIFIED_NAME:
				return getQualifiedName();
			case YammPackage.YOPERATION__OWNED_PARAMETER:
				return getOwnedParameter();
			case YammPackage.YOPERATION__STATE_MACHINE:
				return getStateMachine();
			case YammPackage.YOPERATION__CLAZZ:
				if (resolve) return getClazz();
				return basicGetClazz();
			case YammPackage.YOPERATION__RETURN_TYPE:
				if (resolve) return getReturnType();
				return basicGetReturnType();
			case YammPackage.YOPERATION__LOWER:
				return getLower();
			case YammPackage.YOPERATION__UPPER:
				return getUpper();
			case YammPackage.YOPERATION__POS_OBJECT_ID:
				if (resolve) return getPosObjectID();
				return basicGetPosObjectID();
			case YammPackage.YOPERATION__POS_NAME:
				if (resolve) return getPosName();
				return basicGetPosName();
			case YammPackage.YOPERATION__POS_CLAZZ:
				if (resolve) return getPosClazz();
				return basicGetPosClazz();
			case YammPackage.YOPERATION__POS_LOWER:
				if (resolve) return getPosLower();
				return basicGetPosLower();
			case YammPackage.YOPERATION__POS_UPPER:
				if (resolve) return getPosUpper();
				return basicGetPosUpper();
			case YammPackage.YOPERATION__POS_STATE_MACHINE:
				if (resolve) return getPosStateMachine();
				return basicGetPosStateMachine();
			case YammPackage.YOPERATION__POS_RETURN_TYPE:
				if (resolve) return getPosReturnType();
				return basicGetPosReturnType();
			case YammPackage.YOPERATION__INSERT_LINE_PARAMETER:
				return getInsertLineParameter();
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
			case YammPackage.YOPERATION__NAME:
				setName((String)newValue);
				return;
			case YammPackage.YOPERATION__QUALIFIED_NAME:
				setQualifiedName((String)newValue);
				return;
			case YammPackage.YOPERATION__OWNED_PARAMETER:
				getOwnedParameter().clear();
				getOwnedParameter().addAll((Collection<? extends YParameter>)newValue);
				return;
			case YammPackage.YOPERATION__STATE_MACHINE:
				setStateMachine((YStateMachine)newValue);
				return;
			case YammPackage.YOPERATION__CLAZZ:
				setClazz((YClass)newValue);
				return;
			case YammPackage.YOPERATION__RETURN_TYPE:
				setReturnType((YType)newValue);
				return;
			case YammPackage.YOPERATION__LOWER:
				setLower((Integer)newValue);
				return;
			case YammPackage.YOPERATION__UPPER:
				setUpper((Integer)newValue);
				return;
			case YammPackage.YOPERATION__POS_OBJECT_ID:
				setPosObjectID((SingleLinePropertyInfo)newValue);
				return;
			case YammPackage.YOPERATION__POS_NAME:
				setPosName((SingleLinePropertyInfo)newValue);
				return;
			case YammPackage.YOPERATION__POS_CLAZZ:
				setPosClazz((SingleLinePropertyInfo)newValue);
				return;
			case YammPackage.YOPERATION__POS_LOWER:
				setPosLower((SingleLinePropertyInfo)newValue);
				return;
			case YammPackage.YOPERATION__POS_UPPER:
				setPosUpper((SingleLinePropertyInfo)newValue);
				return;
			case YammPackage.YOPERATION__POS_STATE_MACHINE:
				setPosStateMachine((SingleLinePropertyInfo)newValue);
				return;
			case YammPackage.YOPERATION__POS_RETURN_TYPE:
				setPosReturnType((SingleLinePropertyInfo)newValue);
				return;
			case YammPackage.YOPERATION__INSERT_LINE_PARAMETER:
				setInsertLineParameter((Integer)newValue);
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
			case YammPackage.YOPERATION__NAME:
				unsetName();
				return;
			case YammPackage.YOPERATION__QUALIFIED_NAME:
				setQualifiedName(QUALIFIED_NAME_EDEFAULT);
				return;
			case YammPackage.YOPERATION__OWNED_PARAMETER:
				getOwnedParameter().clear();
				return;
			case YammPackage.YOPERATION__STATE_MACHINE:
				setStateMachine((YStateMachine)null);
				return;
			case YammPackage.YOPERATION__CLAZZ:
				setClazz((YClass)null);
				return;
			case YammPackage.YOPERATION__RETURN_TYPE:
				setReturnType((YType)null);
				return;
			case YammPackage.YOPERATION__LOWER:
				setLower(LOWER_EDEFAULT);
				return;
			case YammPackage.YOPERATION__UPPER:
				setUpper(UPPER_EDEFAULT);
				return;
			case YammPackage.YOPERATION__POS_OBJECT_ID:
				setPosObjectID((SingleLinePropertyInfo)null);
				return;
			case YammPackage.YOPERATION__POS_NAME:
				setPosName((SingleLinePropertyInfo)null);
				return;
			case YammPackage.YOPERATION__POS_CLAZZ:
				setPosClazz((SingleLinePropertyInfo)null);
				return;
			case YammPackage.YOPERATION__POS_LOWER:
				setPosLower((SingleLinePropertyInfo)null);
				return;
			case YammPackage.YOPERATION__POS_UPPER:
				setPosUpper((SingleLinePropertyInfo)null);
				return;
			case YammPackage.YOPERATION__POS_STATE_MACHINE:
				setPosStateMachine((SingleLinePropertyInfo)null);
				return;
			case YammPackage.YOPERATION__POS_RETURN_TYPE:
				setPosReturnType((SingleLinePropertyInfo)null);
				return;
			case YammPackage.YOPERATION__INSERT_LINE_PARAMETER:
				setInsertLineParameter(INSERT_LINE_PARAMETER_EDEFAULT);
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
			case YammPackage.YOPERATION__NAME:
				return isSetName();
			case YammPackage.YOPERATION__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? qualifiedName != null : !QUALIFIED_NAME_EDEFAULT.equals(qualifiedName);
			case YammPackage.YOPERATION__OWNED_PARAMETER:
				return ownedParameter != null && !ownedParameter.isEmpty();
			case YammPackage.YOPERATION__STATE_MACHINE:
				return stateMachine != null;
			case YammPackage.YOPERATION__CLAZZ:
				return clazz != null;
			case YammPackage.YOPERATION__RETURN_TYPE:
				return returnType != null;
			case YammPackage.YOPERATION__LOWER:
				return lower != LOWER_EDEFAULT;
			case YammPackage.YOPERATION__UPPER:
				return upper != UPPER_EDEFAULT;
			case YammPackage.YOPERATION__POS_OBJECT_ID:
				return posObjectID != null;
			case YammPackage.YOPERATION__POS_NAME:
				return posName != null;
			case YammPackage.YOPERATION__POS_CLAZZ:
				return posClazz != null;
			case YammPackage.YOPERATION__POS_LOWER:
				return posLower != null;
			case YammPackage.YOPERATION__POS_UPPER:
				return posUpper != null;
			case YammPackage.YOPERATION__POS_STATE_MACHINE:
				return posStateMachine != null;
			case YammPackage.YOPERATION__POS_RETURN_TYPE:
				return posReturnType != null;
			case YammPackage.YOPERATION__INSERT_LINE_PARAMETER:
				return insertLineParameter != INSERT_LINE_PARAMETER_EDEFAULT;
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
				case YammPackage.YOPERATION__NAME: return YammPackage.YNAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == YFeature.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == YNamespace.class) {
			switch (derivedFeatureID) {
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
				case YammPackage.YNAMED_ELEMENT__NAME: return YammPackage.YOPERATION__NAME;
				default: return -1;
			}
		}
		if (baseClass == YFeature.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == YNamespace.class) {
			switch (baseFeatureID) {
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
		result.append(", lower: ");
		result.append(lower);
		result.append(", upper: ");
		result.append(upper);
		result.append(", insertLineParameter: ");
		result.append(insertLineParameter);
		result.append(')');
		return result.toString();
	}

} //YOperationImpl
