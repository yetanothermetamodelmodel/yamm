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
import online.yamm.coreModelXmi.yamm.YClassifier;
import online.yamm.coreModelXmi.yamm.YNamedElement;
import online.yamm.coreModelXmi.yamm.YNamespace;
import online.yamm.coreModelXmi.yamm.YOperation;
import online.yamm.coreModelXmi.yamm.YPackage;
import online.yamm.coreModelXmi.yamm.YPackageableElement;
import online.yamm.coreModelXmi.yamm.YProperty;
import online.yamm.coreModelXmi.yamm.YType;
import online.yamm.coreModelXmi.yamm.YammPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YClass</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YClassImpl#getParentElement <em>Parent Element</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YClassImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YClassImpl#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YClassImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YClassImpl#getSuperClass <em>Super Class</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YClassImpl#getOwnedAttribute <em>Owned Attribute</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YClassImpl#getOwnedOperation <em>Owned Operation</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YClassImpl#getInsertLineSuperClass <em>Insert Line Super Class</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YClassImpl#getInsertLineAttribute <em>Insert Line Attribute</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YClassImpl#getInsertLineOperation <em>Insert Line Operation</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YClassImpl#getPosObjectID <em>Pos Object ID</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YClassImpl#getPosIsAbstract <em>Pos Is Abstract</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YClassImpl#getPosName <em>Pos Name</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YClassImpl#getPosQualifiedName <em>Pos Qualified Name</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YClassImpl#getPosPackage <em>Pos Package</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YClassImpl#isObserveQueue <em>Observe Queue</em>}</li>
 * </ul>
 *
 * @generated
 */
public class YClassImpl extends YElementImpl implements YClass
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
	 * The default value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean isAbstract = IS_ABSTRACT_EDEFAULT;

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
	 * The cached value of the '{@link #getPackage() <em>Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected YNamedElement package_;

	/**
	 * The cached value of the '{@link #getSuperClass() <em>Super Class</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperClass()
	 * @generated
	 * @ordered
	 */
	protected EList<YClass> superClass;

	/**
	 * The cached value of the '{@link #getOwnedAttribute() <em>Owned Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<YProperty> ownedAttribute;

	/**
	 * The cached value of the '{@link #getOwnedOperation() <em>Owned Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<YOperation> ownedOperation;

	/**
	 * The default value of the '{@link #getInsertLineSuperClass() <em>Insert Line Super Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsertLineSuperClass()
	 * @generated
	 * @ordered
	 */
	protected static final int INSERT_LINE_SUPER_CLASS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInsertLineSuperClass() <em>Insert Line Super Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsertLineSuperClass()
	 * @generated
	 * @ordered
	 */
	protected int insertLineSuperClass = INSERT_LINE_SUPER_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getInsertLineAttribute() <em>Insert Line Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsertLineAttribute()
	 * @generated
	 * @ordered
	 */
	protected static final int INSERT_LINE_ATTRIBUTE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInsertLineAttribute() <em>Insert Line Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsertLineAttribute()
	 * @generated
	 * @ordered
	 */
	protected int insertLineAttribute = INSERT_LINE_ATTRIBUTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInsertLineOperation() <em>Insert Line Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsertLineOperation()
	 * @generated
	 * @ordered
	 */
	protected static final int INSERT_LINE_OPERATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInsertLineOperation() <em>Insert Line Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsertLineOperation()
	 * @generated
	 * @ordered
	 */
	protected int insertLineOperation = INSERT_LINE_OPERATION_EDEFAULT;

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
	 * The cached value of the '{@link #getPosIsAbstract() <em>Pos Is Abstract</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected SingleLinePropertyInfo posIsAbstract;

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
	 * The cached value of the '{@link #getPosPackage() <em>Pos Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosPackage()
	 * @generated
	 * @ordered
	 */
	protected SingleLinePropertyInfo posPackage;

	/**
	 * The default value of the '{@link #isObserveQueue() <em>Observe Queue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isObserveQueue()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OBSERVE_QUEUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isObserveQueue() <em>Observe Queue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isObserveQueue()
	 * @generated
	 * @ordered
	 */
	protected boolean observeQueue = OBSERVE_QUEUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YClassImpl()
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
		return YammPackage.Literals.YCLASS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YCLASS__NAME, oldName, name, !oldNameESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, YammPackage.YCLASS__NAME, oldName, NAME_EDEFAULT, oldNameESet));
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
	public YPackage getParentElement()
	{
		if (eContainerFeatureID() != YammPackage.YCLASS__PARENT_ELEMENT) return null;
		return (YPackage)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentElement(YPackage newParentElement, NotificationChain msgs)
	{
		msgs = eBasicSetContainer((InternalEObject)newParentElement, YammPackage.YCLASS__PARENT_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentElement(YPackage newParentElement)
	{
		if (newParentElement != eInternalContainer() || (eContainerFeatureID() != YammPackage.YCLASS__PARENT_ELEMENT && newParentElement != null)) {
			if (EcoreUtil.isAncestor(this, newParentElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentElement != null)
				msgs = ((InternalEObject)newParentElement).eInverseAdd(this, YammPackage.YPACKAGE__OWNED_MEMBER_PACKAGE, YPackage.class, msgs);
			msgs = basicSetParentElement(newParentElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YCLASS__PARENT_ELEMENT, newParentElement, newParentElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAbstract()
	{
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbstract(boolean newIsAbstract)
	{
		boolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YCLASS__IS_ABSTRACT, oldIsAbstract, isAbstract));
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
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YCLASS__QUALIFIED_NAME, oldQualifiedName, qualifiedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YNamedElement getPackage()
	{
		if (package_ != null && package_.eIsProxy()) {
			InternalEObject oldPackage = (InternalEObject)package_;
			package_ = (YNamedElement)eResolveProxy(oldPackage);
			if (package_ != oldPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammPackage.YCLASS__PACKAGE, oldPackage, package_));
			}
		}
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YNamedElement basicGetPackage()
	{
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(YNamedElement newPackage)
	{
		YNamedElement oldPackage = package_;
		package_ = newPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YCLASS__PACKAGE, oldPackage, package_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YClass> getSuperClass()
	{
		if (superClass == null) {
			superClass = new EObjectResolvingEList<YClass>(YClass.class, this, YammPackage.YCLASS__SUPER_CLASS);
		}
		return superClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YProperty> getOwnedAttribute()
	{
		if (ownedAttribute == null) {
			ownedAttribute = new EObjectContainmentEList<YProperty>(YProperty.class, this, YammPackage.YCLASS__OWNED_ATTRIBUTE);
		}
		return ownedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YOperation> getOwnedOperation()
	{
		if (ownedOperation == null) {
			ownedOperation = new EObjectContainmentEList<YOperation>(YOperation.class, this, YammPackage.YCLASS__OWNED_OPERATION);
		}
		return ownedOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInsertLineSuperClass()
	{
		return insertLineSuperClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsertLineSuperClass(int newInsertLineSuperClass)
	{
		int oldInsertLineSuperClass = insertLineSuperClass;
		insertLineSuperClass = newInsertLineSuperClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YCLASS__INSERT_LINE_SUPER_CLASS, oldInsertLineSuperClass, insertLineSuperClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInsertLineAttribute()
	{
		return insertLineAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsertLineAttribute(int newInsertLineAttribute)
	{
		int oldInsertLineAttribute = insertLineAttribute;
		insertLineAttribute = newInsertLineAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YCLASS__INSERT_LINE_ATTRIBUTE, oldInsertLineAttribute, insertLineAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInsertLineOperation()
	{
		return insertLineOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsertLineOperation(int newInsertLineOperation)
	{
		int oldInsertLineOperation = insertLineOperation;
		insertLineOperation = newInsertLineOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YCLASS__INSERT_LINE_OPERATION, oldInsertLineOperation, insertLineOperation));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammPackage.YCLASS__POS_OBJECT_ID, oldPosObjectID, posObjectID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YCLASS__POS_OBJECT_ID, oldPosObjectID, posObjectID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo getPosIsAbstract()
	{
		if (posIsAbstract != null && posIsAbstract.eIsProxy()) {
			InternalEObject oldPosIsAbstract = (InternalEObject)posIsAbstract;
			posIsAbstract = (SingleLinePropertyInfo)eResolveProxy(oldPosIsAbstract);
			if (posIsAbstract != oldPosIsAbstract) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammPackage.YCLASS__POS_IS_ABSTRACT, oldPosIsAbstract, posIsAbstract));
			}
		}
		return posIsAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo basicGetPosIsAbstract()
	{
		return posIsAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosIsAbstract(SingleLinePropertyInfo newPosIsAbstract)
	{
		SingleLinePropertyInfo oldPosIsAbstract = posIsAbstract;
		posIsAbstract = newPosIsAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YCLASS__POS_IS_ABSTRACT, oldPosIsAbstract, posIsAbstract));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammPackage.YCLASS__POS_NAME, oldPosName, posName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YCLASS__POS_NAME, oldPosName, posName));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammPackage.YCLASS__POS_QUALIFIED_NAME, oldPosQualifiedName, posQualifiedName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YCLASS__POS_QUALIFIED_NAME, oldPosQualifiedName, posQualifiedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo getPosPackage()
	{
		if (posPackage != null && posPackage.eIsProxy()) {
			InternalEObject oldPosPackage = (InternalEObject)posPackage;
			posPackage = (SingleLinePropertyInfo)eResolveProxy(oldPosPackage);
			if (posPackage != oldPosPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammPackage.YCLASS__POS_PACKAGE, oldPosPackage, posPackage));
			}
		}
		return posPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo basicGetPosPackage()
	{
		return posPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosPackage(SingleLinePropertyInfo newPosPackage)
	{
		SingleLinePropertyInfo oldPosPackage = posPackage;
		posPackage = newPosPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YCLASS__POS_PACKAGE, oldPosPackage, posPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isObserveQueue() {
		return observeQueue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObserveQueue(boolean newObserveQueue) {
		boolean oldObserveQueue = observeQueue;
		observeQueue = newObserveQueue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YCLASS__OBSERVE_QUEUE, oldObserveQueue, observeQueue));
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
			case YammPackage.YCLASS__PARENT_ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentElement((YPackage)otherEnd, msgs);
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
			case YammPackage.YCLASS__PARENT_ELEMENT:
				return basicSetParentElement(null, msgs);
			case YammPackage.YCLASS__OWNED_ATTRIBUTE:
				return ((InternalEList<?>)getOwnedAttribute()).basicRemove(otherEnd, msgs);
			case YammPackage.YCLASS__OWNED_OPERATION:
				return ((InternalEList<?>)getOwnedOperation()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
	{
		switch (eContainerFeatureID()) {
			case YammPackage.YCLASS__PARENT_ELEMENT:
				return eInternalContainer().eInverseRemove(this, YammPackage.YPACKAGE__OWNED_MEMBER_PACKAGE, YPackage.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
			case YammPackage.YCLASS__NAME:
				return getName();
			case YammPackage.YCLASS__PARENT_ELEMENT:
				return getParentElement();
			case YammPackage.YCLASS__IS_ABSTRACT:
				return isIsAbstract();
			case YammPackage.YCLASS__QUALIFIED_NAME:
				return getQualifiedName();
			case YammPackage.YCLASS__PACKAGE:
				if (resolve) return getPackage();
				return basicGetPackage();
			case YammPackage.YCLASS__SUPER_CLASS:
				return getSuperClass();
			case YammPackage.YCLASS__OWNED_ATTRIBUTE:
				return getOwnedAttribute();
			case YammPackage.YCLASS__OWNED_OPERATION:
				return getOwnedOperation();
			case YammPackage.YCLASS__INSERT_LINE_SUPER_CLASS:
				return getInsertLineSuperClass();
			case YammPackage.YCLASS__INSERT_LINE_ATTRIBUTE:
				return getInsertLineAttribute();
			case YammPackage.YCLASS__INSERT_LINE_OPERATION:
				return getInsertLineOperation();
			case YammPackage.YCLASS__POS_OBJECT_ID:
				if (resolve) return getPosObjectID();
				return basicGetPosObjectID();
			case YammPackage.YCLASS__POS_IS_ABSTRACT:
				if (resolve) return getPosIsAbstract();
				return basicGetPosIsAbstract();
			case YammPackage.YCLASS__POS_NAME:
				if (resolve) return getPosName();
				return basicGetPosName();
			case YammPackage.YCLASS__POS_QUALIFIED_NAME:
				if (resolve) return getPosQualifiedName();
				return basicGetPosQualifiedName();
			case YammPackage.YCLASS__POS_PACKAGE:
				if (resolve) return getPosPackage();
				return basicGetPosPackage();
			case YammPackage.YCLASS__OBSERVE_QUEUE:
				return isObserveQueue();
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
			case YammPackage.YCLASS__NAME:
				setName((String)newValue);
				return;
			case YammPackage.YCLASS__PARENT_ELEMENT:
				setParentElement((YPackage)newValue);
				return;
			case YammPackage.YCLASS__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
				return;
			case YammPackage.YCLASS__QUALIFIED_NAME:
				setQualifiedName((String)newValue);
				return;
			case YammPackage.YCLASS__PACKAGE:
				setPackage((YNamedElement)newValue);
				return;
			case YammPackage.YCLASS__SUPER_CLASS:
				getSuperClass().clear();
				getSuperClass().addAll((Collection<? extends YClass>)newValue);
				return;
			case YammPackage.YCLASS__OWNED_ATTRIBUTE:
				getOwnedAttribute().clear();
				getOwnedAttribute().addAll((Collection<? extends YProperty>)newValue);
				return;
			case YammPackage.YCLASS__OWNED_OPERATION:
				getOwnedOperation().clear();
				getOwnedOperation().addAll((Collection<? extends YOperation>)newValue);
				return;
			case YammPackage.YCLASS__INSERT_LINE_SUPER_CLASS:
				setInsertLineSuperClass((Integer)newValue);
				return;
			case YammPackage.YCLASS__INSERT_LINE_ATTRIBUTE:
				setInsertLineAttribute((Integer)newValue);
				return;
			case YammPackage.YCLASS__INSERT_LINE_OPERATION:
				setInsertLineOperation((Integer)newValue);
				return;
			case YammPackage.YCLASS__POS_OBJECT_ID:
				setPosObjectID((SingleLinePropertyInfo)newValue);
				return;
			case YammPackage.YCLASS__POS_IS_ABSTRACT:
				setPosIsAbstract((SingleLinePropertyInfo)newValue);
				return;
			case YammPackage.YCLASS__POS_NAME:
				setPosName((SingleLinePropertyInfo)newValue);
				return;
			case YammPackage.YCLASS__POS_QUALIFIED_NAME:
				setPosQualifiedName((SingleLinePropertyInfo)newValue);
				return;
			case YammPackage.YCLASS__POS_PACKAGE:
				setPosPackage((SingleLinePropertyInfo)newValue);
				return;
			case YammPackage.YCLASS__OBSERVE_QUEUE:
				setObserveQueue((Boolean)newValue);
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
			case YammPackage.YCLASS__NAME:
				unsetName();
				return;
			case YammPackage.YCLASS__PARENT_ELEMENT:
				setParentElement((YPackage)null);
				return;
			case YammPackage.YCLASS__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case YammPackage.YCLASS__QUALIFIED_NAME:
				setQualifiedName(QUALIFIED_NAME_EDEFAULT);
				return;
			case YammPackage.YCLASS__PACKAGE:
				setPackage((YNamedElement)null);
				return;
			case YammPackage.YCLASS__SUPER_CLASS:
				getSuperClass().clear();
				return;
			case YammPackage.YCLASS__OWNED_ATTRIBUTE:
				getOwnedAttribute().clear();
				return;
			case YammPackage.YCLASS__OWNED_OPERATION:
				getOwnedOperation().clear();
				return;
			case YammPackage.YCLASS__INSERT_LINE_SUPER_CLASS:
				setInsertLineSuperClass(INSERT_LINE_SUPER_CLASS_EDEFAULT);
				return;
			case YammPackage.YCLASS__INSERT_LINE_ATTRIBUTE:
				setInsertLineAttribute(INSERT_LINE_ATTRIBUTE_EDEFAULT);
				return;
			case YammPackage.YCLASS__INSERT_LINE_OPERATION:
				setInsertLineOperation(INSERT_LINE_OPERATION_EDEFAULT);
				return;
			case YammPackage.YCLASS__POS_OBJECT_ID:
				setPosObjectID((SingleLinePropertyInfo)null);
				return;
			case YammPackage.YCLASS__POS_IS_ABSTRACT:
				setPosIsAbstract((SingleLinePropertyInfo)null);
				return;
			case YammPackage.YCLASS__POS_NAME:
				setPosName((SingleLinePropertyInfo)null);
				return;
			case YammPackage.YCLASS__POS_QUALIFIED_NAME:
				setPosQualifiedName((SingleLinePropertyInfo)null);
				return;
			case YammPackage.YCLASS__POS_PACKAGE:
				setPosPackage((SingleLinePropertyInfo)null);
				return;
			case YammPackage.YCLASS__OBSERVE_QUEUE:
				setObserveQueue(OBSERVE_QUEUE_EDEFAULT);
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
			case YammPackage.YCLASS__NAME:
				return isSetName();
			case YammPackage.YCLASS__PARENT_ELEMENT:
				return getParentElement() != null;
			case YammPackage.YCLASS__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
			case YammPackage.YCLASS__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? qualifiedName != null : !QUALIFIED_NAME_EDEFAULT.equals(qualifiedName);
			case YammPackage.YCLASS__PACKAGE:
				return package_ != null;
			case YammPackage.YCLASS__SUPER_CLASS:
				return superClass != null && !superClass.isEmpty();
			case YammPackage.YCLASS__OWNED_ATTRIBUTE:
				return ownedAttribute != null && !ownedAttribute.isEmpty();
			case YammPackage.YCLASS__OWNED_OPERATION:
				return ownedOperation != null && !ownedOperation.isEmpty();
			case YammPackage.YCLASS__INSERT_LINE_SUPER_CLASS:
				return insertLineSuperClass != INSERT_LINE_SUPER_CLASS_EDEFAULT;
			case YammPackage.YCLASS__INSERT_LINE_ATTRIBUTE:
				return insertLineAttribute != INSERT_LINE_ATTRIBUTE_EDEFAULT;
			case YammPackage.YCLASS__INSERT_LINE_OPERATION:
				return insertLineOperation != INSERT_LINE_OPERATION_EDEFAULT;
			case YammPackage.YCLASS__POS_OBJECT_ID:
				return posObjectID != null;
			case YammPackage.YCLASS__POS_IS_ABSTRACT:
				return posIsAbstract != null;
			case YammPackage.YCLASS__POS_NAME:
				return posName != null;
			case YammPackage.YCLASS__POS_QUALIFIED_NAME:
				return posQualifiedName != null;
			case YammPackage.YCLASS__POS_PACKAGE:
				return posPackage != null;
			case YammPackage.YCLASS__OBSERVE_QUEUE:
				return observeQueue != OBSERVE_QUEUE_EDEFAULT;
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
				case YammPackage.YCLASS__NAME: return YammPackage.YNAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == YPackageableElement.class) {
			switch (derivedFeatureID) {
				case YammPackage.YCLASS__PARENT_ELEMENT: return YammPackage.YPACKAGEABLE_ELEMENT__PARENT_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == YClassifier.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == YType.class) {
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
				case YammPackage.YNAMED_ELEMENT__NAME: return YammPackage.YCLASS__NAME;
				default: return -1;
			}
		}
		if (baseClass == YPackageableElement.class) {
			switch (baseFeatureID) {
				case YammPackage.YPACKAGEABLE_ELEMENT__PARENT_ELEMENT: return YammPackage.YCLASS__PARENT_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == YClassifier.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == YType.class) {
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
		result.append(", isAbstract: ");
		result.append(isAbstract);
		result.append(", qualifiedName: ");
		result.append(qualifiedName);
		result.append(", insertLineSuperClass: ");
		result.append(insertLineSuperClass);
		result.append(", insertLineAttribute: ");
		result.append(insertLineAttribute);
		result.append(", insertLineOperation: ");
		result.append(insertLineOperation);
		result.append(", observeQueue: ");
		result.append(observeQueue);
		result.append(')');
		return result.toString();
	}

} //YClassImpl
