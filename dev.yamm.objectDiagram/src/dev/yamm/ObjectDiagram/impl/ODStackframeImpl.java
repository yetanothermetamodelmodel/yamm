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
package dev.yamm.ObjectDiagram.impl;

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

import dev.yamm.ObjectDiagram.ODAttribute;
import dev.yamm.ObjectDiagram.ODObject;
import dev.yamm.ObjectDiagram.ODReference;
import dev.yamm.ObjectDiagram.ODStackframe;
import dev.yamm.ObjectDiagram.ObjectDiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OD Stackframe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dev.yamm.ObjectDiagram.impl.ODStackframeImpl#getParameterPrimitive <em>Parameter Primitive</em>}</li>
 *   <li>{@link dev.yamm.ObjectDiagram.impl.ODStackframeImpl#getParametersObjects <em>Parameters Objects</em>}</li>
 *   <li>{@link dev.yamm.ObjectDiagram.impl.ODStackframeImpl#getContainingObject <em>Containing Object</em>}</li>
 *   <li>{@link dev.yamm.ObjectDiagram.impl.ODStackframeImpl#getOperationName <em>Operation Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ODStackframeImpl extends MinimalEObjectImpl.Container implements ODStackframe {
	/**
	 * The cached value of the '{@link #getParameterPrimitive() <em>Parameter Primitive</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterPrimitive()
	 * @generated
	 * @ordered
	 */
	protected EList<ODAttribute> parameterPrimitive;

	/**
	 * The cached value of the '{@link #getParametersObjects() <em>Parameters Objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParametersObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<ODReference> parametersObjects;

	/**
	 * The cached value of the '{@link #getContainingObject() <em>Containing Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainingObject()
	 * @generated
	 * @ordered
	 */
	protected ODObject containingObject;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ODStackframeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ObjectDiagramPackage.Literals.OD_STACKFRAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ODAttribute> getParameterPrimitive() {
		if (parameterPrimitive == null) {
			parameterPrimitive = new EObjectContainmentEList<ODAttribute>(ODAttribute.class, this, ObjectDiagramPackage.OD_STACKFRAME__PARAMETER_PRIMITIVE);
		}
		return parameterPrimitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ODReference> getParametersObjects() {
		if (parametersObjects == null) {
			parametersObjects = new EObjectContainmentEList<ODReference>(ODReference.class, this, ObjectDiagramPackage.OD_STACKFRAME__PARAMETERS_OBJECTS);
		}
		return parametersObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ODObject getContainingObject() {
		if (containingObject != null && containingObject.eIsProxy()) {
			InternalEObject oldContainingObject = (InternalEObject)containingObject;
			containingObject = (ODObject)eResolveProxy(oldContainingObject);
			if (containingObject != oldContainingObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ObjectDiagramPackage.OD_STACKFRAME__CONTAINING_OBJECT, oldContainingObject, containingObject));
			}
		}
		return containingObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ODObject basicGetContainingObject() {
		return containingObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainingObject(ODObject newContainingObject) {
		ODObject oldContainingObject = containingObject;
		containingObject = newContainingObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObjectDiagramPackage.OD_STACKFRAME__CONTAINING_OBJECT, oldContainingObject, containingObject));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ObjectDiagramPackage.OD_STACKFRAME__OPERATION_NAME, oldOperationName, operationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ObjectDiagramPackage.OD_STACKFRAME__PARAMETER_PRIMITIVE:
				return ((InternalEList<?>)getParameterPrimitive()).basicRemove(otherEnd, msgs);
			case ObjectDiagramPackage.OD_STACKFRAME__PARAMETERS_OBJECTS:
				return ((InternalEList<?>)getParametersObjects()).basicRemove(otherEnd, msgs);
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
			case ObjectDiagramPackage.OD_STACKFRAME__PARAMETER_PRIMITIVE:
				return getParameterPrimitive();
			case ObjectDiagramPackage.OD_STACKFRAME__PARAMETERS_OBJECTS:
				return getParametersObjects();
			case ObjectDiagramPackage.OD_STACKFRAME__CONTAINING_OBJECT:
				if (resolve) return getContainingObject();
				return basicGetContainingObject();
			case ObjectDiagramPackage.OD_STACKFRAME__OPERATION_NAME:
				return getOperationName();
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
			case ObjectDiagramPackage.OD_STACKFRAME__PARAMETER_PRIMITIVE:
				getParameterPrimitive().clear();
				getParameterPrimitive().addAll((Collection<? extends ODAttribute>)newValue);
				return;
			case ObjectDiagramPackage.OD_STACKFRAME__PARAMETERS_OBJECTS:
				getParametersObjects().clear();
				getParametersObjects().addAll((Collection<? extends ODReference>)newValue);
				return;
			case ObjectDiagramPackage.OD_STACKFRAME__CONTAINING_OBJECT:
				setContainingObject((ODObject)newValue);
				return;
			case ObjectDiagramPackage.OD_STACKFRAME__OPERATION_NAME:
				setOperationName((String)newValue);
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
			case ObjectDiagramPackage.OD_STACKFRAME__PARAMETER_PRIMITIVE:
				getParameterPrimitive().clear();
				return;
			case ObjectDiagramPackage.OD_STACKFRAME__PARAMETERS_OBJECTS:
				getParametersObjects().clear();
				return;
			case ObjectDiagramPackage.OD_STACKFRAME__CONTAINING_OBJECT:
				setContainingObject((ODObject)null);
				return;
			case ObjectDiagramPackage.OD_STACKFRAME__OPERATION_NAME:
				setOperationName(OPERATION_NAME_EDEFAULT);
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
			case ObjectDiagramPackage.OD_STACKFRAME__PARAMETER_PRIMITIVE:
				return parameterPrimitive != null && !parameterPrimitive.isEmpty();
			case ObjectDiagramPackage.OD_STACKFRAME__PARAMETERS_OBJECTS:
				return parametersObjects != null && !parametersObjects.isEmpty();
			case ObjectDiagramPackage.OD_STACKFRAME__CONTAINING_OBJECT:
				return containingObject != null;
			case ObjectDiagramPackage.OD_STACKFRAME__OPERATION_NAME:
				return OPERATION_NAME_EDEFAULT == null ? operationName != null : !OPERATION_NAME_EDEFAULT.equals(operationName);
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
		result.append(" (operationName: ");
		result.append(operationName);
		result.append(')');
		return result.toString();
	}

} //ODStackframeImpl
