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
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import dev.yamm.coreModelXmi.yamm.YComment;
import dev.yamm.coreModelXmi.yamm.YElement;
import dev.yamm.coreModelXmi.yamm.YNamespace;
import dev.yamm.coreModelXmi.yamm.YPackage;
import dev.yamm.coreModelXmi.yamm.YPackageImport;
import dev.yamm.coreModelXmi.yamm.YammPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YPackage Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YPackageImportImpl#getImportedPackage <em>Imported Package</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YPackageImportImpl#getImportingNamespace <em>Importing Namespace</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YPackageImportImpl#getOwnedComment <em>Owned Comment</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YPackageImportImpl#getOwnedElement <em>Owned Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class YPackageImportImpl extends YElementImpl implements YPackageImport
{
	/**
	 * The cached value of the '{@link #getImportedPackage() <em>Imported Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedPackage()
	 * @generated
	 * @ordered
	 */
	protected YPackage importedPackage;

	/**
	 * The cached value of the '{@link #getImportingNamespace() <em>Importing Namespace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportingNamespace()
	 * @generated
	 * @ordered
	 */
	protected YNamespace importingNamespace;

	/**
	 * The cached value of the '{@link #getOwnedComment() <em>Owned Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedComment()
	 * @generated
	 * @ordered
	 */
	protected YComment ownedComment;

	/**
	 * The cached value of the '{@link #getOwnedElement() <em>Owned Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElement()
	 * @generated
	 * @ordered
	 */
	protected EList<YElement> ownedElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YPackageImportImpl()
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
		return YammPackage.Literals.YPACKAGE_IMPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YPackage getImportedPackage()
	{
		if (importedPackage != null && importedPackage.eIsProxy()) {
			InternalEObject oldImportedPackage = (InternalEObject)importedPackage;
			importedPackage = (YPackage)eResolveProxy(oldImportedPackage);
			if (importedPackage != oldImportedPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammPackage.YPACKAGE_IMPORT__IMPORTED_PACKAGE, oldImportedPackage, importedPackage));
			}
		}
		return importedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YPackage basicGetImportedPackage()
	{
		return importedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportedPackage(YPackage newImportedPackage)
	{
		YPackage oldImportedPackage = importedPackage;
		importedPackage = newImportedPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YPACKAGE_IMPORT__IMPORTED_PACKAGE, oldImportedPackage, importedPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YNamespace getImportingNamespace()
	{
		if (importingNamespace != null && importingNamespace.eIsProxy()) {
			InternalEObject oldImportingNamespace = (InternalEObject)importingNamespace;
			importingNamespace = (YNamespace)eResolveProxy(oldImportingNamespace);
			if (importingNamespace != oldImportingNamespace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammPackage.YPACKAGE_IMPORT__IMPORTING_NAMESPACE, oldImportingNamespace, importingNamespace));
			}
		}
		return importingNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YNamespace basicGetImportingNamespace()
	{
		return importingNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportingNamespace(YNamespace newImportingNamespace)
	{
		YNamespace oldImportingNamespace = importingNamespace;
		importingNamespace = newImportingNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YPACKAGE_IMPORT__IMPORTING_NAMESPACE, oldImportingNamespace, importingNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YComment getOwnedComment()
	{
		return ownedComment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedComment(YComment newOwnedComment, NotificationChain msgs)
	{
		YComment oldOwnedComment = ownedComment;
		ownedComment = newOwnedComment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, YammPackage.YPACKAGE_IMPORT__OWNED_COMMENT, oldOwnedComment, newOwnedComment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedComment(YComment newOwnedComment)
	{
		if (newOwnedComment != ownedComment) {
			NotificationChain msgs = null;
			if (ownedComment != null)
				msgs = ((InternalEObject)ownedComment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - YammPackage.YPACKAGE_IMPORT__OWNED_COMMENT, null, msgs);
			if (newOwnedComment != null)
				msgs = ((InternalEObject)newOwnedComment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - YammPackage.YPACKAGE_IMPORT__OWNED_COMMENT, null, msgs);
			msgs = basicSetOwnedComment(newOwnedComment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YPACKAGE_IMPORT__OWNED_COMMENT, newOwnedComment, newOwnedComment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YElement> getOwnedElement()
	{
		if (ownedElement == null) {
			ownedElement = new EObjectContainmentEList<YElement>(YElement.class, this, YammPackage.YPACKAGE_IMPORT__OWNED_ELEMENT);
		}
		return ownedElement;
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
			case YammPackage.YPACKAGE_IMPORT__OWNED_COMMENT:
				return basicSetOwnedComment(null, msgs);
			case YammPackage.YPACKAGE_IMPORT__OWNED_ELEMENT:
				return ((InternalEList<?>)getOwnedElement()).basicRemove(otherEnd, msgs);
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
			case YammPackage.YPACKAGE_IMPORT__IMPORTED_PACKAGE:
				if (resolve) return getImportedPackage();
				return basicGetImportedPackage();
			case YammPackage.YPACKAGE_IMPORT__IMPORTING_NAMESPACE:
				if (resolve) return getImportingNamespace();
				return basicGetImportingNamespace();
			case YammPackage.YPACKAGE_IMPORT__OWNED_COMMENT:
				return getOwnedComment();
			case YammPackage.YPACKAGE_IMPORT__OWNED_ELEMENT:
				return getOwnedElement();
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
			case YammPackage.YPACKAGE_IMPORT__IMPORTED_PACKAGE:
				setImportedPackage((YPackage)newValue);
				return;
			case YammPackage.YPACKAGE_IMPORT__IMPORTING_NAMESPACE:
				setImportingNamespace((YNamespace)newValue);
				return;
			case YammPackage.YPACKAGE_IMPORT__OWNED_COMMENT:
				setOwnedComment((YComment)newValue);
				return;
			case YammPackage.YPACKAGE_IMPORT__OWNED_ELEMENT:
				getOwnedElement().clear();
				getOwnedElement().addAll((Collection<? extends YElement>)newValue);
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
			case YammPackage.YPACKAGE_IMPORT__IMPORTED_PACKAGE:
				setImportedPackage((YPackage)null);
				return;
			case YammPackage.YPACKAGE_IMPORT__IMPORTING_NAMESPACE:
				setImportingNamespace((YNamespace)null);
				return;
			case YammPackage.YPACKAGE_IMPORT__OWNED_COMMENT:
				setOwnedComment((YComment)null);
				return;
			case YammPackage.YPACKAGE_IMPORT__OWNED_ELEMENT:
				getOwnedElement().clear();
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
			case YammPackage.YPACKAGE_IMPORT__IMPORTED_PACKAGE:
				return importedPackage != null;
			case YammPackage.YPACKAGE_IMPORT__IMPORTING_NAMESPACE:
				return importingNamespace != null;
			case YammPackage.YPACKAGE_IMPORT__OWNED_COMMENT:
				return ownedComment != null;
			case YammPackage.YPACKAGE_IMPORT__OWNED_ELEMENT:
				return ownedElement != null && !ownedElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //YPackageImportImpl
