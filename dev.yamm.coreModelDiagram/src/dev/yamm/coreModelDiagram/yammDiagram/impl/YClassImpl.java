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
package dev.yamm.coreModelDiagram.yammDiagram.impl;

import java.util.Collection;

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

import dev.yamm.coreModelDiagram.yammDiagram.YClass;
import dev.yamm.coreModelDiagram.yammDiagram.YClassifier;
import dev.yamm.coreModelDiagram.yammDiagram.YNamedElement;
import dev.yamm.coreModelDiagram.yammDiagram.YNamespace;
import dev.yamm.coreModelDiagram.yammDiagram.YOperation;
import dev.yamm.coreModelDiagram.yammDiagram.YPackage;
import dev.yamm.coreModelDiagram.yammDiagram.YPackageableElement;
import dev.yamm.coreModelDiagram.yammDiagram.YProperty;
import dev.yamm.coreModelDiagram.yammDiagram.YType;
import dev.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YClass</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YClassImpl#getParentElement <em>Parent Element</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YClassImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YClassImpl#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YClassImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YClassImpl#getSuperClass <em>Super Class</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YClassImpl#getOwnedAttribute <em>Owned Attribute</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YClassImpl#getOwnedOperation <em>Owned Operation</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YClassImpl#isObserveQueue <em>Observe Queue</em>}</li>
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
		return YammDiagramPackage.Literals.YCLASS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YCLASS__NAME, oldName, name, !oldNameESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, YammDiagramPackage.YCLASS__NAME, oldName, NAME_EDEFAULT, oldNameESet));
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
		if (eContainerFeatureID() != YammDiagramPackage.YCLASS__PARENT_ELEMENT) return null;
		return (YPackage)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentElement(YPackage newParentElement, NotificationChain msgs)
	{
		msgs = eBasicSetContainer((InternalEObject)newParentElement, YammDiagramPackage.YCLASS__PARENT_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentElement(YPackage newParentElement)
	{
		if (newParentElement != eInternalContainer() || (eContainerFeatureID() != YammDiagramPackage.YCLASS__PARENT_ELEMENT && newParentElement != null)) {
			if (EcoreUtil.isAncestor(this, newParentElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentElement != null)
				msgs = ((InternalEObject)newParentElement).eInverseAdd(this, YammDiagramPackage.YPACKAGE__OWNED_MEMBER_PACKAGE, YPackage.class, msgs);
			msgs = basicSetParentElement(newParentElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YCLASS__PARENT_ELEMENT, newParentElement, newParentElement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YCLASS__IS_ABSTRACT, oldIsAbstract, isAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public String getQualifiedName()
	{
		String qualifiedName = getName();
		YPackage pack = (YPackage) getPackage();

		if (pack == null)
			return qualifiedName;
		
		qualifiedName = pack.getName() + "." + qualifiedName;

		while ((pack = pack.getPackage()) != null)
		{
			qualifiedName = pack.getName() + "." + qualifiedName;
		}
		return qualifiedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void setQualifiedName(String newQualifiedName)
	{
		
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammDiagramPackage.YCLASS__PACKAGE, oldPackage, package_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YCLASS__PACKAGE, oldPackage, package_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YClass> getSuperClass()
	{
		if (superClass == null) {
			superClass = new EObjectResolvingEList<YClass>(YClass.class, this, YammDiagramPackage.YCLASS__SUPER_CLASS);
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
			ownedAttribute = new EObjectContainmentEList<YProperty>(YProperty.class, this, YammDiagramPackage.YCLASS__OWNED_ATTRIBUTE);
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
			ownedOperation = new EObjectContainmentEList<YOperation>(YOperation.class, this, YammDiagramPackage.YCLASS__OWNED_OPERATION);
		}
		return ownedOperation;
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
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YCLASS__OBSERVE_QUEUE, oldObserveQueue, observeQueue));
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
			case YammDiagramPackage.YCLASS__PARENT_ELEMENT:
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
			case YammDiagramPackage.YCLASS__PARENT_ELEMENT:
				return basicSetParentElement(null, msgs);
			case YammDiagramPackage.YCLASS__OWNED_ATTRIBUTE:
				return ((InternalEList<?>)getOwnedAttribute()).basicRemove(otherEnd, msgs);
			case YammDiagramPackage.YCLASS__OWNED_OPERATION:
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
			case YammDiagramPackage.YCLASS__PARENT_ELEMENT:
				return eInternalContainer().eInverseRemove(this, YammDiagramPackage.YPACKAGE__OWNED_MEMBER_PACKAGE, YPackage.class, msgs);
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
			case YammDiagramPackage.YCLASS__NAME:
				return getName();
			case YammDiagramPackage.YCLASS__PARENT_ELEMENT:
				return getParentElement();
			case YammDiagramPackage.YCLASS__IS_ABSTRACT:
				return isIsAbstract();
			case YammDiagramPackage.YCLASS__QUALIFIED_NAME:
				return getQualifiedName();
			case YammDiagramPackage.YCLASS__PACKAGE:
				if (resolve) return getPackage();
				return basicGetPackage();
			case YammDiagramPackage.YCLASS__SUPER_CLASS:
				return getSuperClass();
			case YammDiagramPackage.YCLASS__OWNED_ATTRIBUTE:
				return getOwnedAttribute();
			case YammDiagramPackage.YCLASS__OWNED_OPERATION:
				return getOwnedOperation();
			case YammDiagramPackage.YCLASS__OBSERVE_QUEUE:
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
			case YammDiagramPackage.YCLASS__NAME:
				setName((String)newValue);
				return;
			case YammDiagramPackage.YCLASS__PARENT_ELEMENT:
				setParentElement((YPackage)newValue);
				return;
			case YammDiagramPackage.YCLASS__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
				return;
			case YammDiagramPackage.YCLASS__QUALIFIED_NAME:
				setQualifiedName((String)newValue);
				return;
			case YammDiagramPackage.YCLASS__PACKAGE:
				setPackage((YNamedElement)newValue);
				return;
			case YammDiagramPackage.YCLASS__SUPER_CLASS:
				getSuperClass().clear();
				getSuperClass().addAll((Collection<? extends YClass>)newValue);
				return;
			case YammDiagramPackage.YCLASS__OWNED_ATTRIBUTE:
				getOwnedAttribute().clear();
				getOwnedAttribute().addAll((Collection<? extends YProperty>)newValue);
				return;
			case YammDiagramPackage.YCLASS__OWNED_OPERATION:
				getOwnedOperation().clear();
				getOwnedOperation().addAll((Collection<? extends YOperation>)newValue);
				return;
			case YammDiagramPackage.YCLASS__OBSERVE_QUEUE:
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
			case YammDiagramPackage.YCLASS__NAME:
				unsetName();
				return;
			case YammDiagramPackage.YCLASS__PARENT_ELEMENT:
				setParentElement((YPackage)null);
				return;
			case YammDiagramPackage.YCLASS__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case YammDiagramPackage.YCLASS__QUALIFIED_NAME:
				setQualifiedName(QUALIFIED_NAME_EDEFAULT);
				return;
			case YammDiagramPackage.YCLASS__PACKAGE:
				setPackage((YNamedElement)null);
				return;
			case YammDiagramPackage.YCLASS__SUPER_CLASS:
				getSuperClass().clear();
				return;
			case YammDiagramPackage.YCLASS__OWNED_ATTRIBUTE:
				getOwnedAttribute().clear();
				return;
			case YammDiagramPackage.YCLASS__OWNED_OPERATION:
				getOwnedOperation().clear();
				return;
			case YammDiagramPackage.YCLASS__OBSERVE_QUEUE:
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
			case YammDiagramPackage.YCLASS__NAME:
				return isSetName();
			case YammDiagramPackage.YCLASS__PARENT_ELEMENT:
				return getParentElement() != null;
			case YammDiagramPackage.YCLASS__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
			case YammDiagramPackage.YCLASS__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? qualifiedName != null : !QUALIFIED_NAME_EDEFAULT.equals(qualifiedName);
			case YammDiagramPackage.YCLASS__PACKAGE:
				return package_ != null;
			case YammDiagramPackage.YCLASS__SUPER_CLASS:
				return superClass != null && !superClass.isEmpty();
			case YammDiagramPackage.YCLASS__OWNED_ATTRIBUTE:
				return ownedAttribute != null && !ownedAttribute.isEmpty();
			case YammDiagramPackage.YCLASS__OWNED_OPERATION:
				return ownedOperation != null && !ownedOperation.isEmpty();
			case YammDiagramPackage.YCLASS__OBSERVE_QUEUE:
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
				case YammDiagramPackage.YCLASS__NAME: return YammDiagramPackage.YNAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == YPackageableElement.class) {
			switch (derivedFeatureID) {
				case YammDiagramPackage.YCLASS__PARENT_ELEMENT: return YammDiagramPackage.YPACKAGEABLE_ELEMENT__PARENT_ELEMENT;
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
				case YammDiagramPackage.YNAMED_ELEMENT__NAME: return YammDiagramPackage.YCLASS__NAME;
				default: return -1;
			}
		}
		if (baseClass == YPackageableElement.class) {
			switch (baseFeatureID) {
				case YammDiagramPackage.YPACKAGEABLE_ELEMENT__PARENT_ELEMENT: return YammDiagramPackage.YCLASS__PARENT_ELEMENT;
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
		result.append(", observeQueue: ");
		result.append(observeQueue);
		result.append(')');
		return result.toString();
	}

} //YClassImpl
