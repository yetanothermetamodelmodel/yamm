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
package online.yamm.coreModelDiagram.yammDiagram.impl;

import java.util.Collection;

import online.yamm.coreModelDiagram.yammDiagram.YComment;
import online.yamm.coreModelDiagram.yammDiagram.YElement;
import online.yamm.coreModelDiagram.yammDiagram.YElementImport;
import online.yamm.coreModelDiagram.yammDiagram.YNamespace;
import online.yamm.coreModelDiagram.yammDiagram.YPackageableElement;
import online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage;

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
 * An implementation of the model object '<em><b>YElement Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.impl.YElementImportImpl#getImportedElement <em>Imported Element</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.impl.YElementImportImpl#getImportingNamespace <em>Importing Namespace</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.impl.YElementImportImpl#getOwnedComment <em>Owned Comment</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.impl.YElementImportImpl#getOwnedElement <em>Owned Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class YElementImportImpl extends YElementImpl implements YElementImport
{
	/**
	 * The cached value of the '{@link #getImportedElement() <em>Imported Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedElement()
	 * @generated
	 * @ordered
	 */
	protected YPackageableElement importedElement;

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
	protected YElementImportImpl()
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
		return YammDiagramPackage.Literals.YELEMENT_IMPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YPackageableElement getImportedElement()
	{
		if (importedElement != null && importedElement.eIsProxy()) {
			InternalEObject oldImportedElement = (InternalEObject)importedElement;
			importedElement = (YPackageableElement)eResolveProxy(oldImportedElement);
			if (importedElement != oldImportedElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammDiagramPackage.YELEMENT_IMPORT__IMPORTED_ELEMENT, oldImportedElement, importedElement));
			}
		}
		return importedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YPackageableElement basicGetImportedElement()
	{
		return importedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportedElement(YPackageableElement newImportedElement)
	{
		YPackageableElement oldImportedElement = importedElement;
		importedElement = newImportedElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YELEMENT_IMPORT__IMPORTED_ELEMENT, oldImportedElement, importedElement));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammDiagramPackage.YELEMENT_IMPORT__IMPORTING_NAMESPACE, oldImportingNamespace, importingNamespace));
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
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YELEMENT_IMPORT__IMPORTING_NAMESPACE, oldImportingNamespace, importingNamespace));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YELEMENT_IMPORT__OWNED_COMMENT, oldOwnedComment, newOwnedComment);
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
				msgs = ((InternalEObject)ownedComment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - YammDiagramPackage.YELEMENT_IMPORT__OWNED_COMMENT, null, msgs);
			if (newOwnedComment != null)
				msgs = ((InternalEObject)newOwnedComment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - YammDiagramPackage.YELEMENT_IMPORT__OWNED_COMMENT, null, msgs);
			msgs = basicSetOwnedComment(newOwnedComment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YELEMENT_IMPORT__OWNED_COMMENT, newOwnedComment, newOwnedComment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YElement> getOwnedElement()
	{
		if (ownedElement == null) {
			ownedElement = new EObjectContainmentEList<YElement>(YElement.class, this, YammDiagramPackage.YELEMENT_IMPORT__OWNED_ELEMENT);
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
			case YammDiagramPackage.YELEMENT_IMPORT__OWNED_COMMENT:
				return basicSetOwnedComment(null, msgs);
			case YammDiagramPackage.YELEMENT_IMPORT__OWNED_ELEMENT:
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
			case YammDiagramPackage.YELEMENT_IMPORT__IMPORTED_ELEMENT:
				if (resolve) return getImportedElement();
				return basicGetImportedElement();
			case YammDiagramPackage.YELEMENT_IMPORT__IMPORTING_NAMESPACE:
				if (resolve) return getImportingNamespace();
				return basicGetImportingNamespace();
			case YammDiagramPackage.YELEMENT_IMPORT__OWNED_COMMENT:
				return getOwnedComment();
			case YammDiagramPackage.YELEMENT_IMPORT__OWNED_ELEMENT:
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
			case YammDiagramPackage.YELEMENT_IMPORT__IMPORTED_ELEMENT:
				setImportedElement((YPackageableElement)newValue);
				return;
			case YammDiagramPackage.YELEMENT_IMPORT__IMPORTING_NAMESPACE:
				setImportingNamespace((YNamespace)newValue);
				return;
			case YammDiagramPackage.YELEMENT_IMPORT__OWNED_COMMENT:
				setOwnedComment((YComment)newValue);
				return;
			case YammDiagramPackage.YELEMENT_IMPORT__OWNED_ELEMENT:
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
			case YammDiagramPackage.YELEMENT_IMPORT__IMPORTED_ELEMENT:
				setImportedElement((YPackageableElement)null);
				return;
			case YammDiagramPackage.YELEMENT_IMPORT__IMPORTING_NAMESPACE:
				setImportingNamespace((YNamespace)null);
				return;
			case YammDiagramPackage.YELEMENT_IMPORT__OWNED_COMMENT:
				setOwnedComment((YComment)null);
				return;
			case YammDiagramPackage.YELEMENT_IMPORT__OWNED_ELEMENT:
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
			case YammDiagramPackage.YELEMENT_IMPORT__IMPORTED_ELEMENT:
				return importedElement != null;
			case YammDiagramPackage.YELEMENT_IMPORT__IMPORTING_NAMESPACE:
				return importingNamespace != null;
			case YammDiagramPackage.YELEMENT_IMPORT__OWNED_COMMENT:
				return ownedComment != null;
			case YammDiagramPackage.YELEMENT_IMPORT__OWNED_ELEMENT:
				return ownedElement != null && !ownedElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //YElementImportImpl
