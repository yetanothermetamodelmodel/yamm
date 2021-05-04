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
package dev.yamm.ObjectDiagram.util;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import dev.yamm.ObjectDiagram.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see dev.yamm.ObjectDiagram.ObjectDiagramPackage
 * @generated
 */
public class ObjectDiagramSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ObjectDiagramPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectDiagramSwitch() {
		if (modelPackage == null) {
			modelPackage = ObjectDiagramPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ObjectDiagramPackage.OBJECT_DIAGRAM: {
				ObjectDiagram objectDiagram = (ObjectDiagram)theEObject;
				T result = caseObjectDiagram(objectDiagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ObjectDiagramPackage.OD_OBJECT: {
				ODObject odObject = (ODObject)theEObject;
				T result = caseODObject(odObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ObjectDiagramPackage.OD_TYPE: {
				ODType odType = (ODType)theEObject;
				T result = caseODType(odType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ObjectDiagramPackage.OD_REFERENCE: {
				ODReference odReference = (ODReference)theEObject;
				T result = caseODReference(odReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ObjectDiagramPackage.OD_DATE_TYPE: {
				ODDateType odDateType = (ODDateType)theEObject;
				T result = caseODDateType(odDateType);
				if (result == null) result = caseODType(odDateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ObjectDiagramPackage.OD_ATTRIBUTE: {
				ODAttribute odAttribute = (ODAttribute)theEObject;
				T result = caseODAttribute(odAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ObjectDiagramPackage.OD_STACKFRAME: {
				ODStackframe odStackframe = (ODStackframe)theEObject;
				T result = caseODStackframe(odStackframe);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ObjectDiagramPackage.ESTRING_TO_OD_TYPE_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, ODType> eStringToODTypeMap = (Map.Entry<String, ODType>)theEObject;
				T result = caseEStringToODTypeMap(eStringToODTypeMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectDiagram(ObjectDiagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OD Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OD Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseODObject(ODObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OD Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OD Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseODType(ODType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OD Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OD Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseODReference(ODReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OD Date Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OD Date Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseODDateType(ODDateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OD Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OD Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseODAttribute(ODAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OD Stackframe</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OD Stackframe</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseODStackframe(ODStackframe object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EString To OD Type Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EString To OD Type Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEStringToODTypeMap(Map.Entry<String, ODType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ObjectDiagramSwitch
