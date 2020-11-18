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

import online.yamm.coreModelDiagram.yammDiagram.DslInfo;
import online.yamm.coreModelDiagram.yammDiagram.FeatureInfo;
import online.yamm.coreModelDiagram.yammDiagram.Line;
import online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dsl Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.impl.DslInfoImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.impl.DslInfoImpl#getFirstLine <em>First Line</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.impl.DslInfoImpl#getLastLine <em>Last Line</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DslInfoImpl extends MinimalEObjectImpl.Container implements DslInfo
{
	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EMap<EStructuralFeature, FeatureInfo> features;

	/**
	 * The cached value of the '{@link #getFirstLine() <em>First Line</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstLine()
	 * @generated
	 * @ordered
	 */
	protected Line firstLine;

	/**
	 * The cached value of the '{@link #getLastLine() <em>Last Line</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastLine()
	 * @generated
	 * @ordered
	 */
	protected Line lastLine;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DslInfoImpl()
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
		return YammDiagramPackage.Literals.DSL_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<EStructuralFeature, FeatureInfo> getFeatures()
	{
		if (features == null) {
			features = new EcoreEMap<EStructuralFeature,FeatureInfo>(YammDiagramPackage.Literals.ESTRUCTURAL_FEATURE_TO_FEATURE_INFO_MAP, EStructuralFeatureToFeatureInfoMapImpl.class, this, YammDiagramPackage.DSL_INFO__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Line getFirstLine()
	{
		if (firstLine != null && firstLine.eIsProxy()) {
			InternalEObject oldFirstLine = (InternalEObject)firstLine;
			firstLine = (Line)eResolveProxy(oldFirstLine);
			if (firstLine != oldFirstLine) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammDiagramPackage.DSL_INFO__FIRST_LINE, oldFirstLine, firstLine));
			}
		}
		return firstLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Line basicGetFirstLine()
	{
		return firstLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstLine(Line newFirstLine)
	{
		Line oldFirstLine = firstLine;
		firstLine = newFirstLine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.DSL_INFO__FIRST_LINE, oldFirstLine, firstLine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Line getLastLine()
	{
		if (lastLine != null && lastLine.eIsProxy()) {
			InternalEObject oldLastLine = (InternalEObject)lastLine;
			lastLine = (Line)eResolveProxy(oldLastLine);
			if (lastLine != oldLastLine) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammDiagramPackage.DSL_INFO__LAST_LINE, oldLastLine, lastLine));
			}
		}
		return lastLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Line basicGetLastLine()
	{
		return lastLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastLine(Line newLastLine)
	{
		Line oldLastLine = lastLine;
		lastLine = newLastLine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.DSL_INFO__LAST_LINE, oldLastLine, lastLine));
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
			case YammDiagramPackage.DSL_INFO__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
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
			case YammDiagramPackage.DSL_INFO__FEATURES:
				if (coreType) return getFeatures();
				else return getFeatures().map();
			case YammDiagramPackage.DSL_INFO__FIRST_LINE:
				if (resolve) return getFirstLine();
				return basicGetFirstLine();
			case YammDiagramPackage.DSL_INFO__LAST_LINE:
				if (resolve) return getLastLine();
				return basicGetLastLine();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID) {
			case YammDiagramPackage.DSL_INFO__FEATURES:
				((EStructuralFeature.Setting)getFeatures()).set(newValue);
				return;
			case YammDiagramPackage.DSL_INFO__FIRST_LINE:
				setFirstLine((Line)newValue);
				return;
			case YammDiagramPackage.DSL_INFO__LAST_LINE:
				setLastLine((Line)newValue);
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
			case YammDiagramPackage.DSL_INFO__FEATURES:
				getFeatures().clear();
				return;
			case YammDiagramPackage.DSL_INFO__FIRST_LINE:
				setFirstLine((Line)null);
				return;
			case YammDiagramPackage.DSL_INFO__LAST_LINE:
				setLastLine((Line)null);
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
			case YammDiagramPackage.DSL_INFO__FEATURES:
				return features != null && !features.isEmpty();
			case YammDiagramPackage.DSL_INFO__FIRST_LINE:
				return firstLine != null;
			case YammDiagramPackage.DSL_INFO__LAST_LINE:
				return lastLine != null;
		}
		return super.eIsSet(featureID);
	}

} //DslInfoImpl
