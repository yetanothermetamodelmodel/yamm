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
package dev.yamm.util.tableModel.table.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import dev.yamm.util.tableModel.table.Tab;
import dev.yamm.util.tableModel.table.TableModel;
import dev.yamm.util.tableModel.table.TablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dev.yamm.util.tableModel.table.impl.TableModelImpl#getTabs <em>Tabs</em>}</li>
 *   <li>{@link dev.yamm.util.tableModel.table.impl.TableModelImpl#getViewId <em>View Id</em>}</li>
 *   <li>{@link dev.yamm.util.tableModel.table.impl.TableModelImpl#getViewInternalId <em>View Internal Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableModelImpl extends MinimalEObjectImpl.Container implements TableModel
{
	/**
	 * The cached value of the '{@link #getTabs() <em>Tabs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTabs()
	 * @generated
	 * @ordered
	 */
	protected EList<Tab> tabs;

	/**
	 * The default value of the '{@link #getViewId() <em>View Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewId()
	 * @generated
	 * @ordered
	 */
	protected static final String VIEW_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getViewId() <em>View Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewId()
	 * @generated
	 * @ordered
	 */
	protected String viewId = VIEW_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getViewInternalId() <em>View Internal Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewInternalId()
	 * @generated
	 * @ordered
	 */
	protected static final String VIEW_INTERNAL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getViewInternalId() <em>View Internal Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewInternalId()
	 * @generated
	 * @ordered
	 */
	protected String viewInternalId = VIEW_INTERNAL_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableModelImpl()
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
		return TablePackage.Literals.TABLE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tab> getTabs()
	{
		if (tabs == null)
		{
			tabs = new EObjectContainmentEList<Tab>(Tab.class, this, TablePackage.TABLE_MODEL__TABS);
		}
		return tabs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getViewId()
	{
		return viewId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewId(String newViewId)
	{
		String oldViewId = viewId;
		viewId = newViewId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_MODEL__VIEW_ID, oldViewId, viewId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getViewInternalId()
	{
		return viewInternalId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewInternalId(String newViewInternalId)
	{
		String oldViewInternalId = viewInternalId;
		viewInternalId = newViewInternalId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_MODEL__VIEW_INTERNAL_ID, oldViewInternalId, viewInternalId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case TablePackage.TABLE_MODEL__TABS:
				return ((InternalEList<?>)getTabs()).basicRemove(otherEnd, msgs);
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
		switch (featureID)
		{
			case TablePackage.TABLE_MODEL__TABS:
				return getTabs();
			case TablePackage.TABLE_MODEL__VIEW_ID:
				return getViewId();
			case TablePackage.TABLE_MODEL__VIEW_INTERNAL_ID:
				return getViewInternalId();
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
		switch (featureID)
		{
			case TablePackage.TABLE_MODEL__TABS:
				getTabs().clear();
				getTabs().addAll((Collection<? extends Tab>)newValue);
				return;
			case TablePackage.TABLE_MODEL__VIEW_ID:
				setViewId((String)newValue);
				return;
			case TablePackage.TABLE_MODEL__VIEW_INTERNAL_ID:
				setViewInternalId((String)newValue);
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
		switch (featureID)
		{
			case TablePackage.TABLE_MODEL__TABS:
				getTabs().clear();
				return;
			case TablePackage.TABLE_MODEL__VIEW_ID:
				setViewId(VIEW_ID_EDEFAULT);
				return;
			case TablePackage.TABLE_MODEL__VIEW_INTERNAL_ID:
				setViewInternalId(VIEW_INTERNAL_ID_EDEFAULT);
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
		switch (featureID)
		{
			case TablePackage.TABLE_MODEL__TABS:
				return tabs != null && !tabs.isEmpty();
			case TablePackage.TABLE_MODEL__VIEW_ID:
				return VIEW_ID_EDEFAULT == null ? viewId != null : !VIEW_ID_EDEFAULT.equals(viewId);
			case TablePackage.TABLE_MODEL__VIEW_INTERNAL_ID:
				return VIEW_INTERNAL_ID_EDEFAULT == null ? viewInternalId != null : !VIEW_INTERNAL_ID_EDEFAULT.equals(viewInternalId);
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
		result.append(" (viewId: ");
		result.append(viewId);
		result.append(", viewInternalId: ");
		result.append(viewInternalId);
		result.append(')');
		return result.toString();
	}

} //TableModelImpl
