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
package dev.yamm.coreModelXmi.yamm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import dev.yamm.coreModelXmi.yamm.SingleLinePropertyInfo;
import dev.yamm.coreModelXmi.yamm.YClass;
import dev.yamm.coreModelXmi.yamm.YCompositeEdge;
import dev.yamm.coreModelXmi.yamm.YEnumeration;
import dev.yamm.coreModelXmi.yamm.YModel;
import dev.yamm.coreModelXmi.yamm.YPackage;
import dev.yamm.coreModelXmi.yamm.YSharedEdge;
import dev.yamm.coreModelXmi.yamm.YammPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YModel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YModelImpl#getClazz <em>Clazz</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YModelImpl#getEnumerations <em>Enumerations</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YModelImpl#getPackages <em>Packages</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YModelImpl#getObjects <em>Objects</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YModelImpl#getSharedEdges <em>Shared Edges</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YModelImpl#getCompositeEdges <em>Composite Edges</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YModelImpl#getPosObjectID <em>Pos Object ID</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YModelImpl#getInsertClass <em>Insert Class</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YModelImpl#getInsertEnum <em>Insert Enum</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YModelImpl#getInsertPackage <em>Insert Package</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YModelImpl#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class YModelImpl extends YObjectImpl implements YModel
{
	/**
	 * The cached value of the '{@link #getClazz() <em>Clazz</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClazz()
	 * @generated
	 * @ordered
	 */
	protected EList<YClass> clazz;

	/**
	 * The cached value of the '{@link #getEnumerations() <em>Enumerations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumerations()
	 * @generated
	 * @ordered
	 */
	protected EList<YEnumeration> enumerations;

	/**
	 * The cached value of the '{@link #getPackages() <em>Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<YPackage> packages;

	/**
	 * The cached value of the '{@link #getObjects() <em>Objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> objects;

	/**
	 * The cached value of the '{@link #getSharedEdges() <em>Shared Edges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharedEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<YSharedEdge> sharedEdges;

	/**
	 * The cached value of the '{@link #getCompositeEdges() <em>Composite Edges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositeEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<YCompositeEdge> compositeEdges;

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
	 * The default value of the '{@link #getInsertClass() <em>Insert Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsertClass()
	 * @generated
	 * @ordered
	 */
	protected static final int INSERT_CLASS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInsertClass() <em>Insert Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsertClass()
	 * @generated
	 * @ordered
	 */
	protected int insertClass = INSERT_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getInsertEnum() <em>Insert Enum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsertEnum()
	 * @generated
	 * @ordered
	 */
	protected static final int INSERT_ENUM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInsertEnum() <em>Insert Enum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsertEnum()
	 * @generated
	 * @ordered
	 */
	protected int insertEnum = INSERT_ENUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getInsertPackage() <em>Insert Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsertPackage()
	 * @generated
	 * @ordered
	 */
	protected static final int INSERT_PACKAGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInsertPackage() <em>Insert Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsertPackage()
	 * @generated
	 * @ordered
	 */
	protected int insertPackage = INSERT_PACKAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> types;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YModelImpl()
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
		return YammPackage.Literals.YMODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YClass> getClazz()
	{
		if (clazz == null) {
			clazz = new EObjectContainmentEList<YClass>(YClass.class, this, YammPackage.YMODEL__CLAZZ);
		}
		return clazz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YEnumeration> getEnumerations()
	{
		if (enumerations == null) {
			enumerations = new EObjectContainmentEList<YEnumeration>(YEnumeration.class, this, YammPackage.YMODEL__ENUMERATIONS);
		}
		return enumerations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YPackage> getPackages()
	{
		if (packages == null) {
			packages = new EObjectContainmentEList<YPackage>(YPackage.class, this, YammPackage.YMODEL__PACKAGES);
		}
		return packages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getObjects()
	{
		if (objects == null) {
			objects = new EObjectContainmentEList<EObject>(EObject.class, this, YammPackage.YMODEL__OBJECTS);
		}
		return objects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YSharedEdge> getSharedEdges()
	{
		if (sharedEdges == null) {
			sharedEdges = new EObjectContainmentEList<YSharedEdge>(YSharedEdge.class, this, YammPackage.YMODEL__SHARED_EDGES);
		}
		return sharedEdges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YCompositeEdge> getCompositeEdges()
	{
		if (compositeEdges == null) {
			compositeEdges = new EObjectContainmentEList<YCompositeEdge>(YCompositeEdge.class, this, YammPackage.YMODEL__COMPOSITE_EDGES);
		}
		return compositeEdges;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammPackage.YMODEL__POS_OBJECT_ID, oldPosObjectID, posObjectID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YMODEL__POS_OBJECT_ID, oldPosObjectID, posObjectID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInsertClass()
	{
		return insertClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsertClass(int newInsertClass)
	{
		int oldInsertClass = insertClass;
		insertClass = newInsertClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YMODEL__INSERT_CLASS, oldInsertClass, insertClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInsertEnum()
	{
		return insertEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsertEnum(int newInsertEnum)
	{
		int oldInsertEnum = insertEnum;
		insertEnum = newInsertEnum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YMODEL__INSERT_ENUM, oldInsertEnum, insertEnum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInsertPackage()
	{
		return insertPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsertPackage(int newInsertPackage)
	{
		int oldInsertPackage = insertPackage;
		insertPackage = newInsertPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YMODEL__INSERT_PACKAGE, oldInsertPackage, insertPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getTypes()
	{
		if (types == null) {
			types = new EObjectContainmentEList<EObject>(EObject.class, this, YammPackage.YMODEL__TYPES);
		}
		return types;
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
			case YammPackage.YMODEL__CLAZZ:
				return ((InternalEList<?>)getClazz()).basicRemove(otherEnd, msgs);
			case YammPackage.YMODEL__ENUMERATIONS:
				return ((InternalEList<?>)getEnumerations()).basicRemove(otherEnd, msgs);
			case YammPackage.YMODEL__PACKAGES:
				return ((InternalEList<?>)getPackages()).basicRemove(otherEnd, msgs);
			case YammPackage.YMODEL__OBJECTS:
				return ((InternalEList<?>)getObjects()).basicRemove(otherEnd, msgs);
			case YammPackage.YMODEL__SHARED_EDGES:
				return ((InternalEList<?>)getSharedEdges()).basicRemove(otherEnd, msgs);
			case YammPackage.YMODEL__COMPOSITE_EDGES:
				return ((InternalEList<?>)getCompositeEdges()).basicRemove(otherEnd, msgs);
			case YammPackage.YMODEL__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
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
			case YammPackage.YMODEL__CLAZZ:
				return getClazz();
			case YammPackage.YMODEL__ENUMERATIONS:
				return getEnumerations();
			case YammPackage.YMODEL__PACKAGES:
				return getPackages();
			case YammPackage.YMODEL__OBJECTS:
				return getObjects();
			case YammPackage.YMODEL__SHARED_EDGES:
				return getSharedEdges();
			case YammPackage.YMODEL__COMPOSITE_EDGES:
				return getCompositeEdges();
			case YammPackage.YMODEL__POS_OBJECT_ID:
				if (resolve) return getPosObjectID();
				return basicGetPosObjectID();
			case YammPackage.YMODEL__INSERT_CLASS:
				return getInsertClass();
			case YammPackage.YMODEL__INSERT_ENUM:
				return getInsertEnum();
			case YammPackage.YMODEL__INSERT_PACKAGE:
				return getInsertPackage();
			case YammPackage.YMODEL__TYPES:
				return getTypes();
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
			case YammPackage.YMODEL__CLAZZ:
				getClazz().clear();
				getClazz().addAll((Collection<? extends YClass>)newValue);
				return;
			case YammPackage.YMODEL__ENUMERATIONS:
				getEnumerations().clear();
				getEnumerations().addAll((Collection<? extends YEnumeration>)newValue);
				return;
			case YammPackage.YMODEL__PACKAGES:
				getPackages().clear();
				getPackages().addAll((Collection<? extends YPackage>)newValue);
				return;
			case YammPackage.YMODEL__OBJECTS:
				getObjects().clear();
				getObjects().addAll((Collection<? extends EObject>)newValue);
				return;
			case YammPackage.YMODEL__SHARED_EDGES:
				getSharedEdges().clear();
				getSharedEdges().addAll((Collection<? extends YSharedEdge>)newValue);
				return;
			case YammPackage.YMODEL__COMPOSITE_EDGES:
				getCompositeEdges().clear();
				getCompositeEdges().addAll((Collection<? extends YCompositeEdge>)newValue);
				return;
			case YammPackage.YMODEL__POS_OBJECT_ID:
				setPosObjectID((SingleLinePropertyInfo)newValue);
				return;
			case YammPackage.YMODEL__INSERT_CLASS:
				setInsertClass((Integer)newValue);
				return;
			case YammPackage.YMODEL__INSERT_ENUM:
				setInsertEnum((Integer)newValue);
				return;
			case YammPackage.YMODEL__INSERT_PACKAGE:
				setInsertPackage((Integer)newValue);
				return;
			case YammPackage.YMODEL__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends EObject>)newValue);
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
			case YammPackage.YMODEL__CLAZZ:
				getClazz().clear();
				return;
			case YammPackage.YMODEL__ENUMERATIONS:
				getEnumerations().clear();
				return;
			case YammPackage.YMODEL__PACKAGES:
				getPackages().clear();
				return;
			case YammPackage.YMODEL__OBJECTS:
				getObjects().clear();
				return;
			case YammPackage.YMODEL__SHARED_EDGES:
				getSharedEdges().clear();
				return;
			case YammPackage.YMODEL__COMPOSITE_EDGES:
				getCompositeEdges().clear();
				return;
			case YammPackage.YMODEL__POS_OBJECT_ID:
				setPosObjectID((SingleLinePropertyInfo)null);
				return;
			case YammPackage.YMODEL__INSERT_CLASS:
				setInsertClass(INSERT_CLASS_EDEFAULT);
				return;
			case YammPackage.YMODEL__INSERT_ENUM:
				setInsertEnum(INSERT_ENUM_EDEFAULT);
				return;
			case YammPackage.YMODEL__INSERT_PACKAGE:
				setInsertPackage(INSERT_PACKAGE_EDEFAULT);
				return;
			case YammPackage.YMODEL__TYPES:
				getTypes().clear();
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
			case YammPackage.YMODEL__CLAZZ:
				return clazz != null && !clazz.isEmpty();
			case YammPackage.YMODEL__ENUMERATIONS:
				return enumerations != null && !enumerations.isEmpty();
			case YammPackage.YMODEL__PACKAGES:
				return packages != null && !packages.isEmpty();
			case YammPackage.YMODEL__OBJECTS:
				return objects != null && !objects.isEmpty();
			case YammPackage.YMODEL__SHARED_EDGES:
				return sharedEdges != null && !sharedEdges.isEmpty();
			case YammPackage.YMODEL__COMPOSITE_EDGES:
				return compositeEdges != null && !compositeEdges.isEmpty();
			case YammPackage.YMODEL__POS_OBJECT_ID:
				return posObjectID != null;
			case YammPackage.YMODEL__INSERT_CLASS:
				return insertClass != INSERT_CLASS_EDEFAULT;
			case YammPackage.YMODEL__INSERT_ENUM:
				return insertEnum != INSERT_ENUM_EDEFAULT;
			case YammPackage.YMODEL__INSERT_PACKAGE:
				return insertPackage != INSERT_PACKAGE_EDEFAULT;
			case YammPackage.YMODEL__TYPES:
				return types != null && !types.isEmpty();
		}
		return super.eIsSet(featureID);
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
		result.append(" (insertClass: ");
		result.append(insertClass);
		result.append(", insertEnum: ");
		result.append(insertEnum);
		result.append(", insertPackage: ");
		result.append(insertPackage);
		result.append(')');
		return result.toString();
	}

} //YModelImpl
