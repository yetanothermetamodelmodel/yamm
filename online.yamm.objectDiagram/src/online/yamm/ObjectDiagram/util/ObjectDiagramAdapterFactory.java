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
package online.yamm.ObjectDiagram.util;

import java.util.Map;
import online.yamm.ObjectDiagram.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see online.yamm.ObjectDiagram.ObjectDiagramPackage
 * @generated
 */
public class ObjectDiagramAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ObjectDiagramPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectDiagramAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ObjectDiagramPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectDiagramSwitch<Adapter> modelSwitch =
		new ObjectDiagramSwitch<Adapter>() {
			@Override
			public Adapter caseObjectDiagram(ObjectDiagram object) {
				return createObjectDiagramAdapter();
			}
			@Override
			public Adapter caseODObject(ODObject object) {
				return createODObjectAdapter();
			}
			@Override
			public Adapter caseODType(ODType object) {
				return createODTypeAdapter();
			}
			@Override
			public Adapter caseODReference(ODReference object) {
				return createODReferenceAdapter();
			}
			@Override
			public Adapter caseODDateType(ODDateType object) {
				return createODDateTypeAdapter();
			}
			@Override
			public Adapter caseODAttribute(ODAttribute object) {
				return createODAttributeAdapter();
			}
			@Override
			public Adapter caseODStackframe(ODStackframe object) {
				return createODStackframeAdapter();
			}
			@Override
			public Adapter caseEStringToODTypeMap(Map.Entry<String, ODType> object) {
				return createEStringToODTypeMapAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link online.yamm.ObjectDiagram.ObjectDiagram <em>Object Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see online.yamm.ObjectDiagram.ObjectDiagram
	 * @generated
	 */
	public Adapter createObjectDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link online.yamm.ObjectDiagram.ODObject <em>OD Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see online.yamm.ObjectDiagram.ODObject
	 * @generated
	 */
	public Adapter createODObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link online.yamm.ObjectDiagram.ODType <em>OD Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see online.yamm.ObjectDiagram.ODType
	 * @generated
	 */
	public Adapter createODTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link online.yamm.ObjectDiagram.ODReference <em>OD Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see online.yamm.ObjectDiagram.ODReference
	 * @generated
	 */
	public Adapter createODReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link online.yamm.ObjectDiagram.ODDateType <em>OD Date Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see online.yamm.ObjectDiagram.ODDateType
	 * @generated
	 */
	public Adapter createODDateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link online.yamm.ObjectDiagram.ODAttribute <em>OD Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see online.yamm.ObjectDiagram.ODAttribute
	 * @generated
	 */
	public Adapter createODAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link online.yamm.ObjectDiagram.ODStackframe <em>OD Stackframe</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see online.yamm.ObjectDiagram.ODStackframe
	 * @generated
	 */
	public Adapter createODStackframeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>EString To OD Type Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createEStringToODTypeMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ObjectDiagramAdapterFactory
