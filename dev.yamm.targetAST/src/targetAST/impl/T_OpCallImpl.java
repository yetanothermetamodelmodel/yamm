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
package targetAST.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import targetAST.T_ExpLevelA;
import targetAST.T_OpCall;
import targetAST.TargetASTPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TOp Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link targetAST.impl.T_OpCallImpl#getVarNamesForReturn <em>Var Names For Return</em>}</li>
 *   <li>{@link targetAST.impl.T_OpCallImpl#getOperationName <em>Operation Name</em>}</li>
 *   <li>{@link targetAST.impl.T_OpCallImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link targetAST.impl.T_OpCallImpl#isHasINOUT <em>Has INOUT</em>}</li>
 *   <li>{@link targetAST.impl.T_OpCallImpl#getLastFeaturesName <em>Last Features Name</em>}</li>
 *   <li>{@link targetAST.impl.T_OpCallImpl#getPostfix <em>Postfix</em>}</li>
 *   <li>{@link targetAST.impl.T_OpCallImpl#getIsINOUT <em>Is INOUT</em>}</li>
 *   <li>{@link targetAST.impl.T_OpCallImpl#isParam <em>Param</em>}</li>
 *   <li>{@link targetAST.impl.T_OpCallImpl#getTypeForMultiInheritance <em>Type For Multi Inheritance</em>}</li>
 *   <li>{@link targetAST.impl.T_OpCallImpl#getQualifiedNameOperation <em>Qualified Name Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class T_OpCallImpl extends T_ExpLevelAImpl implements T_OpCall {
	/**
	 * The default value of the '{@link #getVarNamesForReturn() <em>Var Names For Return</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarNamesForReturn()
	 * @generated
	 * @ordered
	 */
	protected static final String VAR_NAMES_FOR_RETURN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVarNamesForReturn() <em>Var Names For Return</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarNamesForReturn()
	 * @generated
	 * @ordered
	 */
	protected String varNamesForReturn = VAR_NAMES_FOR_RETURN_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperationName() <em>Operation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationName()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperationName() <em>Operation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationName()
	 * @generated
	 * @ordered
	 */
	protected String operationName = OPERATION_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<T_ExpLevelA> arguments;

	/**
	 * The default value of the '{@link #isHasINOUT() <em>Has INOUT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasINOUT()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_INOUT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasINOUT() <em>Has INOUT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasINOUT()
	 * @generated
	 * @ordered
	 */
	protected boolean hasINOUT = HAS_INOUT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLastFeaturesName() <em>Last Features Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastFeaturesName()
	 * @generated
	 * @ordered
	 */
	protected EList<String> lastFeaturesName;

	/**
	 * The cached value of the '{@link #getPostfix() <em>Postfix</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostfix()
	 * @generated
	 * @ordered
	 */
	protected EList<String> postfix;

	/**
	 * The cached value of the '{@link #getIsINOUT() <em>Is INOUT</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsINOUT()
	 * @generated
	 * @ordered
	 */
	protected EList<Boolean> isINOUT;

	/**
	 * The default value of the '{@link #isParam() <em>Param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isParam()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PARAM_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isParam() <em>Param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isParam()
	 * @generated
	 * @ordered
	 */
	protected boolean param = PARAM_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeForMultiInheritance() <em>Type For Multi Inheritance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeForMultiInheritance()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_FOR_MULTI_INHERITANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeForMultiInheritance() <em>Type For Multi Inheritance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeForMultiInheritance()
	 * @generated
	 * @ordered
	 */
	protected String typeForMultiInheritance = TYPE_FOR_MULTI_INHERITANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getQualifiedNameOperation() <em>Qualified Name Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedNameOperation()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALIFIED_NAME_OPERATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQualifiedNameOperation() <em>Qualified Name Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedNameOperation()
	 * @generated
	 * @ordered
	 */
	protected String qualifiedNameOperation = QUALIFIED_NAME_OPERATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected T_OpCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TargetASTPackage.Literals.TOP_CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVarNamesForReturn() {
		return varNamesForReturn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVarNamesForReturn(String newVarNamesForReturn) {
		String oldVarNamesForReturn = varNamesForReturn;
		varNamesForReturn = newVarNamesForReturn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetASTPackage.TOP_CALL__VAR_NAMES_FOR_RETURN, oldVarNamesForReturn, varNamesForReturn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOperationName() {
		return operationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationName(String newOperationName) {
		String oldOperationName = operationName;
		operationName = newOperationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetASTPackage.TOP_CALL__OPERATION_NAME, oldOperationName, operationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<T_ExpLevelA> getArguments() {
		if (arguments == null) {
			arguments = new EObjectContainmentEList<T_ExpLevelA>(T_ExpLevelA.class, this, TargetASTPackage.TOP_CALL__ARGUMENTS);
		}
		return arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasINOUT() {
		return hasINOUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasINOUT(boolean newHasINOUT) {
		boolean oldHasINOUT = hasINOUT;
		hasINOUT = newHasINOUT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetASTPackage.TOP_CALL__HAS_INOUT, oldHasINOUT, hasINOUT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getLastFeaturesName() {
		if (lastFeaturesName == null) {
			lastFeaturesName = new EDataTypeEList<String>(String.class, this, TargetASTPackage.TOP_CALL__LAST_FEATURES_NAME);
		}
		return lastFeaturesName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getPostfix() {
		if (postfix == null) {
			postfix = new EDataTypeEList<String>(String.class, this, TargetASTPackage.TOP_CALL__POSTFIX);
		}
		return postfix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Boolean> getIsINOUT() {
		if (isINOUT == null) {
			isINOUT = new EDataTypeEList<Boolean>(Boolean.class, this, TargetASTPackage.TOP_CALL__IS_INOUT);
		}
		return isINOUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isParam() {
		return param;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParam(boolean newParam) {
		boolean oldParam = param;
		param = newParam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetASTPackage.TOP_CALL__PARAM, oldParam, param));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeForMultiInheritance() {
		return typeForMultiInheritance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeForMultiInheritance(String newTypeForMultiInheritance) {
		String oldTypeForMultiInheritance = typeForMultiInheritance;
		typeForMultiInheritance = newTypeForMultiInheritance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetASTPackage.TOP_CALL__TYPE_FOR_MULTI_INHERITANCE, oldTypeForMultiInheritance, typeForMultiInheritance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQualifiedNameOperation()
	{
		return qualifiedNameOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualifiedNameOperation(String newQualifiedNameOperation)
	{
		String oldQualifiedNameOperation = qualifiedNameOperation;
		qualifiedNameOperation = newQualifiedNameOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetASTPackage.TOP_CALL__QUALIFIED_NAME_OPERATION, oldQualifiedNameOperation, qualifiedNameOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TargetASTPackage.TOP_CALL__ARGUMENTS:
				return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TargetASTPackage.TOP_CALL__VAR_NAMES_FOR_RETURN:
				return getVarNamesForReturn();
			case TargetASTPackage.TOP_CALL__OPERATION_NAME:
				return getOperationName();
			case TargetASTPackage.TOP_CALL__ARGUMENTS:
				return getArguments();
			case TargetASTPackage.TOP_CALL__HAS_INOUT:
				return isHasINOUT();
			case TargetASTPackage.TOP_CALL__LAST_FEATURES_NAME:
				return getLastFeaturesName();
			case TargetASTPackage.TOP_CALL__POSTFIX:
				return getPostfix();
			case TargetASTPackage.TOP_CALL__IS_INOUT:
				return getIsINOUT();
			case TargetASTPackage.TOP_CALL__PARAM:
				return isParam();
			case TargetASTPackage.TOP_CALL__TYPE_FOR_MULTI_INHERITANCE:
				return getTypeForMultiInheritance();
			case TargetASTPackage.TOP_CALL__QUALIFIED_NAME_OPERATION:
				return getQualifiedNameOperation();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TargetASTPackage.TOP_CALL__VAR_NAMES_FOR_RETURN:
				setVarNamesForReturn((String)newValue);
				return;
			case TargetASTPackage.TOP_CALL__OPERATION_NAME:
				setOperationName((String)newValue);
				return;
			case TargetASTPackage.TOP_CALL__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends T_ExpLevelA>)newValue);
				return;
			case TargetASTPackage.TOP_CALL__HAS_INOUT:
				setHasINOUT((Boolean)newValue);
				return;
			case TargetASTPackage.TOP_CALL__LAST_FEATURES_NAME:
				getLastFeaturesName().clear();
				getLastFeaturesName().addAll((Collection<? extends String>)newValue);
				return;
			case TargetASTPackage.TOP_CALL__POSTFIX:
				getPostfix().clear();
				getPostfix().addAll((Collection<? extends String>)newValue);
				return;
			case TargetASTPackage.TOP_CALL__IS_INOUT:
				getIsINOUT().clear();
				getIsINOUT().addAll((Collection<? extends Boolean>)newValue);
				return;
			case TargetASTPackage.TOP_CALL__PARAM:
				setParam((Boolean)newValue);
				return;
			case TargetASTPackage.TOP_CALL__TYPE_FOR_MULTI_INHERITANCE:
				setTypeForMultiInheritance((String)newValue);
				return;
			case TargetASTPackage.TOP_CALL__QUALIFIED_NAME_OPERATION:
				setQualifiedNameOperation((String)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case TargetASTPackage.TOP_CALL__VAR_NAMES_FOR_RETURN:
				setVarNamesForReturn(VAR_NAMES_FOR_RETURN_EDEFAULT);
				return;
			case TargetASTPackage.TOP_CALL__OPERATION_NAME:
				setOperationName(OPERATION_NAME_EDEFAULT);
				return;
			case TargetASTPackage.TOP_CALL__ARGUMENTS:
				getArguments().clear();
				return;
			case TargetASTPackage.TOP_CALL__HAS_INOUT:
				setHasINOUT(HAS_INOUT_EDEFAULT);
				return;
			case TargetASTPackage.TOP_CALL__LAST_FEATURES_NAME:
				getLastFeaturesName().clear();
				return;
			case TargetASTPackage.TOP_CALL__POSTFIX:
				getPostfix().clear();
				return;
			case TargetASTPackage.TOP_CALL__IS_INOUT:
				getIsINOUT().clear();
				return;
			case TargetASTPackage.TOP_CALL__PARAM:
				setParam(PARAM_EDEFAULT);
				return;
			case TargetASTPackage.TOP_CALL__TYPE_FOR_MULTI_INHERITANCE:
				setTypeForMultiInheritance(TYPE_FOR_MULTI_INHERITANCE_EDEFAULT);
				return;
			case TargetASTPackage.TOP_CALL__QUALIFIED_NAME_OPERATION:
				setQualifiedNameOperation(QUALIFIED_NAME_OPERATION_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TargetASTPackage.TOP_CALL__VAR_NAMES_FOR_RETURN:
				return VAR_NAMES_FOR_RETURN_EDEFAULT == null ? varNamesForReturn != null : !VAR_NAMES_FOR_RETURN_EDEFAULT.equals(varNamesForReturn);
			case TargetASTPackage.TOP_CALL__OPERATION_NAME:
				return OPERATION_NAME_EDEFAULT == null ? operationName != null : !OPERATION_NAME_EDEFAULT.equals(operationName);
			case TargetASTPackage.TOP_CALL__ARGUMENTS:
				return arguments != null && !arguments.isEmpty();
			case TargetASTPackage.TOP_CALL__HAS_INOUT:
				return hasINOUT != HAS_INOUT_EDEFAULT;
			case TargetASTPackage.TOP_CALL__LAST_FEATURES_NAME:
				return lastFeaturesName != null && !lastFeaturesName.isEmpty();
			case TargetASTPackage.TOP_CALL__POSTFIX:
				return postfix != null && !postfix.isEmpty();
			case TargetASTPackage.TOP_CALL__IS_INOUT:
				return isINOUT != null && !isINOUT.isEmpty();
			case TargetASTPackage.TOP_CALL__PARAM:
				return param != PARAM_EDEFAULT;
			case TargetASTPackage.TOP_CALL__TYPE_FOR_MULTI_INHERITANCE:
				return TYPE_FOR_MULTI_INHERITANCE_EDEFAULT == null ? typeForMultiInheritance != null : !TYPE_FOR_MULTI_INHERITANCE_EDEFAULT.equals(typeForMultiInheritance);
			case TargetASTPackage.TOP_CALL__QUALIFIED_NAME_OPERATION:
				return QUALIFIED_NAME_OPERATION_EDEFAULT == null ? qualifiedNameOperation != null : !QUALIFIED_NAME_OPERATION_EDEFAULT.equals(qualifiedNameOperation);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (varNamesForReturn: ");
		result.append(varNamesForReturn);
		result.append(", operationName: ");
		result.append(operationName);
		result.append(", hasINOUT: ");
		result.append(hasINOUT);
		result.append(", lastFeaturesName: ");
		result.append(lastFeaturesName);
		result.append(", postfix: ");
		result.append(postfix);
		result.append(", isINOUT: ");
		result.append(isINOUT);
		result.append(", param: ");
		result.append(param);
		result.append(", typeForMultiInheritance: ");
		result.append(typeForMultiInheritance);
		result.append(", qualifiedNameOperation: ");
		result.append(qualifiedNameOperation);
		result.append(')');
		return result.toString();
	}

} //T_OpCallImpl
