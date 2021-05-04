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

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import dev.yamm.ObjectDiagram.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ObjectDiagramFactoryImpl extends EFactoryImpl implements ObjectDiagramFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ObjectDiagramFactory init() {
		try {
			ObjectDiagramFactory theObjectDiagramFactory = (ObjectDiagramFactory)EPackage.Registry.INSTANCE.getEFactory(ObjectDiagramPackage.eNS_URI);
			if (theObjectDiagramFactory != null) {
				return theObjectDiagramFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ObjectDiagramFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectDiagramFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ObjectDiagramPackage.OBJECT_DIAGRAM: return createObjectDiagram();
			case ObjectDiagramPackage.OD_OBJECT: return createODObject();
			case ObjectDiagramPackage.OD_TYPE: return createODType();
			case ObjectDiagramPackage.OD_REFERENCE: return createODReference();
			case ObjectDiagramPackage.OD_DATE_TYPE: return createODDateType();
			case ObjectDiagramPackage.OD_ATTRIBUTE: return createODAttribute();
			case ObjectDiagramPackage.OD_STACKFRAME: return createODStackframe();
			case ObjectDiagramPackage.ESTRING_TO_OD_TYPE_MAP: return (EObject)createEStringToODTypeMap();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectDiagram createObjectDiagram() {
		ObjectDiagramImpl objectDiagram = new ObjectDiagramImpl();
		return objectDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ODObject createODObject() {
		ODObjectImpl odObject = new ODObjectImpl();
		return odObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ODType createODType() {
		ODTypeImpl odType = new ODTypeImpl();
		return odType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ODReference createODReference() {
		ODReferenceImpl odReference = new ODReferenceImpl();
		return odReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ODDateType createODDateType() {
		ODDateTypeImpl odDateType = new ODDateTypeImpl();
		return odDateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ODAttribute createODAttribute() {
		ODAttributeImpl odAttribute = new ODAttributeImpl();
		return odAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ODStackframe createODStackframe() {
		ODStackframeImpl odStackframe = new ODStackframeImpl();
		return odStackframe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, ODType> createEStringToODTypeMap() {
		EStringToODTypeMapImpl eStringToODTypeMap = new EStringToODTypeMapImpl();
		return eStringToODTypeMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectDiagramPackage getObjectDiagramPackage() {
		return (ObjectDiagramPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ObjectDiagramPackage getPackage() {
		return ObjectDiagramPackage.eINSTANCE;
	}

} //ObjectDiagramFactoryImpl
