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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.common.types.JvmIdentifiableElement;

import org.eclipse.xtext.xbase.impl.XMemberFeatureCallImpl;

import dev.yamm.coreModelDiagram.yammDiagram.YMemberFeatureCall;
import dev.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YMember Feature Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YMemberFeatureCallImpl#getInheritanceType <em>Inheritance Type</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YMemberFeatureCallImpl#isExplicitInheritanceType <em>Explicit Inheritance Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class YMemberFeatureCallImpl extends XMemberFeatureCallImpl implements YMemberFeatureCall
{
	/**
	 * The cached value of the '{@link #getInheritanceType() <em>Inheritance Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritanceType()
	 * @generated
	 * @ordered
	 */
	protected JvmIdentifiableElement inheritanceType;

	/**
	 * The default value of the '{@link #isExplicitInheritanceType() <em>Explicit Inheritance Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExplicitInheritanceType()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXPLICIT_INHERITANCE_TYPE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExplicitInheritanceType() <em>Explicit Inheritance Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExplicitInheritanceType()
	 * @generated
	 * @ordered
	 */
	protected boolean explicitInheritanceType = EXPLICIT_INHERITANCE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YMemberFeatureCallImpl()
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
		return YammDiagramPackage.Literals.YMEMBER_FEATURE_CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmIdentifiableElement getInheritanceType()
	{
		if (inheritanceType != null && inheritanceType.eIsProxy()) {
			InternalEObject oldInheritanceType = (InternalEObject)inheritanceType;
			inheritanceType = (JvmIdentifiableElement)eResolveProxy(oldInheritanceType);
			if (inheritanceType != oldInheritanceType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammDiagramPackage.YMEMBER_FEATURE_CALL__INHERITANCE_TYPE, oldInheritanceType, inheritanceType));
			}
		}
		return inheritanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmIdentifiableElement basicGetInheritanceType()
	{
		return inheritanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInheritanceType(JvmIdentifiableElement newInheritanceType)
	{
		JvmIdentifiableElement oldInheritanceType = inheritanceType;
		inheritanceType = newInheritanceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YMEMBER_FEATURE_CALL__INHERITANCE_TYPE, oldInheritanceType, inheritanceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExplicitInheritanceType()
	{
		return explicitInheritanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExplicitInheritanceType(boolean newExplicitInheritanceType)
	{
		boolean oldExplicitInheritanceType = explicitInheritanceType;
		explicitInheritanceType = newExplicitInheritanceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YMEMBER_FEATURE_CALL__EXPLICIT_INHERITANCE_TYPE, oldExplicitInheritanceType, explicitInheritanceType));
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
			case YammDiagramPackage.YMEMBER_FEATURE_CALL__INHERITANCE_TYPE:
				if (resolve) return getInheritanceType();
				return basicGetInheritanceType();
			case YammDiagramPackage.YMEMBER_FEATURE_CALL__EXPLICIT_INHERITANCE_TYPE:
				return isExplicitInheritanceType();
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
			case YammDiagramPackage.YMEMBER_FEATURE_CALL__INHERITANCE_TYPE:
				setInheritanceType((JvmIdentifiableElement)newValue);
				return;
			case YammDiagramPackage.YMEMBER_FEATURE_CALL__EXPLICIT_INHERITANCE_TYPE:
				setExplicitInheritanceType((Boolean)newValue);
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
			case YammDiagramPackage.YMEMBER_FEATURE_CALL__INHERITANCE_TYPE:
				setInheritanceType((JvmIdentifiableElement)null);
				return;
			case YammDiagramPackage.YMEMBER_FEATURE_CALL__EXPLICIT_INHERITANCE_TYPE:
				setExplicitInheritanceType(EXPLICIT_INHERITANCE_TYPE_EDEFAULT);
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
			case YammDiagramPackage.YMEMBER_FEATURE_CALL__INHERITANCE_TYPE:
				return inheritanceType != null;
			case YammDiagramPackage.YMEMBER_FEATURE_CALL__EXPLICIT_INHERITANCE_TYPE:
				return explicitInheritanceType != EXPLICIT_INHERITANCE_TYPE_EDEFAULT;
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
		result.append(" (explicitInheritanceType: ");
		result.append(explicitInheritanceType);
		result.append(')');
		return result.toString();
	}

} //YMemberFeatureCallImpl
