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
 * Copyright [yyyy] [name of copyright owner]
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
 * see LICENSE
 */
package targetAST.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import targetAST.T_GetEnumLiteral;
import targetAST.TargetASTPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TGet Enum Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link targetAST.impl.T_GetEnumLiteralImpl#getQualifiedEnumName <em>Qualified Enum Name</em>}</li>
 *   <li>{@link targetAST.impl.T_GetEnumLiteralImpl#getLiteralName <em>Literal Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class T_GetEnumLiteralImpl extends T_ExpLevelAImpl implements T_GetEnumLiteral
{
	/**
	 * The default value of the '{@link #getQualifiedEnumName() <em>Qualified Enum Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedEnumName()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALIFIED_ENUM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQualifiedEnumName() <em>Qualified Enum Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedEnumName()
	 * @generated
	 * @ordered
	 */
	protected String qualifiedEnumName = QUALIFIED_ENUM_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLiteralName() <em>Literal Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiteralName()
	 * @generated
	 * @ordered
	 */
	protected static final String LITERAL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLiteralName() <em>Literal Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiteralName()
	 * @generated
	 * @ordered
	 */
	protected String literalName = LITERAL_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected T_GetEnumLiteralImpl()
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
		return TargetASTPackage.Literals.TGET_ENUM_LITERAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQualifiedEnumName()
	{
		return qualifiedEnumName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualifiedEnumName(String newQualifiedEnumName)
	{
		String oldQualifiedEnumName = qualifiedEnumName;
		qualifiedEnumName = newQualifiedEnumName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetASTPackage.TGET_ENUM_LITERAL__QUALIFIED_ENUM_NAME, oldQualifiedEnumName, qualifiedEnumName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteralName()
	{
		return literalName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLiteralName(String newLiteralName)
	{
		String oldLiteralName = literalName;
		literalName = newLiteralName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetASTPackage.TGET_ENUM_LITERAL__LITERAL_NAME, oldLiteralName, literalName));
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
			case TargetASTPackage.TGET_ENUM_LITERAL__QUALIFIED_ENUM_NAME:
				return getQualifiedEnumName();
			case TargetASTPackage.TGET_ENUM_LITERAL__LITERAL_NAME:
				return getLiteralName();
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
			case TargetASTPackage.TGET_ENUM_LITERAL__QUALIFIED_ENUM_NAME:
				setQualifiedEnumName((String)newValue);
				return;
			case TargetASTPackage.TGET_ENUM_LITERAL__LITERAL_NAME:
				setLiteralName((String)newValue);
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
			case TargetASTPackage.TGET_ENUM_LITERAL__QUALIFIED_ENUM_NAME:
				setQualifiedEnumName(QUALIFIED_ENUM_NAME_EDEFAULT);
				return;
			case TargetASTPackage.TGET_ENUM_LITERAL__LITERAL_NAME:
				setLiteralName(LITERAL_NAME_EDEFAULT);
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
			case TargetASTPackage.TGET_ENUM_LITERAL__QUALIFIED_ENUM_NAME:
				return QUALIFIED_ENUM_NAME_EDEFAULT == null ? qualifiedEnumName != null : !QUALIFIED_ENUM_NAME_EDEFAULT.equals(qualifiedEnumName);
			case TargetASTPackage.TGET_ENUM_LITERAL__LITERAL_NAME:
				return LITERAL_NAME_EDEFAULT == null ? literalName != null : !LITERAL_NAME_EDEFAULT.equals(literalName);
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
		result.append(" (qualifiedEnumName: ");
		result.append(qualifiedEnumName);
		result.append(", literalName: ");
		result.append(literalName);
		result.append(')');
		return result.toString();
	}

} //T_GetEnumLiteralImpl
