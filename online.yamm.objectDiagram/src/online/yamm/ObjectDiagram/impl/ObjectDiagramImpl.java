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
package online.yamm.ObjectDiagram.impl;

import java.util.Collection;
import online.yamm.ObjectDiagram.ODObject;
import online.yamm.ObjectDiagram.ODStackframe;
import online.yamm.ObjectDiagram.ODType;
import online.yamm.ObjectDiagram.ObjectDiagram;
import online.yamm.ObjectDiagram.ObjectDiagramPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link online.yamm.ObjectDiagram.impl.ObjectDiagramImpl#getObjects <em>Objects</em>}</li>
 *   <li>{@link online.yamm.ObjectDiagram.impl.ObjectDiagramImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link online.yamm.ObjectDiagram.impl.ObjectDiagramImpl#getDataTypes <em>Data Types</em>}</li>
 *   <li>{@link online.yamm.ObjectDiagram.impl.ObjectDiagramImpl#getStackframes <em>Stackframes</em>}</li>
 *   <li>{@link online.yamm.ObjectDiagram.impl.ObjectDiagramImpl#getYammModelPath <em>Yamm Model Path</em>}</li>
 *   <li>{@link online.yamm.ObjectDiagram.impl.ObjectDiagramImpl#getMetaDataPackage <em>Meta Data Package</em>}</li>
 *   <li>{@link online.yamm.ObjectDiagram.impl.ObjectDiagramImpl#getTypeObjectCreate <em>Type Object Create</em>}</li>
 *   <li>{@link online.yamm.ObjectDiagram.impl.ObjectDiagramImpl#getInitialModel <em>Initial Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectDiagramImpl extends MinimalEObjectImpl.Container implements ObjectDiagram {
	/**
	 * The cached value of the '{@link #getObjects() <em>Objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<ODObject> objects;

	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, ODType> types;

	/**
	 * The cached value of the '{@link #getDataTypes() <em>Data Types</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataTypes()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, ODType> dataTypes;

	/**
	 * The cached value of the '{@link #getStackframes() <em>Stackframes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStackframes()
	 * @generated
	 * @ordered
	 */
	protected EList<ODStackframe> stackframes;

	/**
	 * The default value of the '{@link #getYammModelPath() <em>Yamm Model Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYammModelPath()
	 * @generated
	 * @ordered
	 */
	protected static final String YAMM_MODEL_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYammModelPath() <em>Yamm Model Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYammModelPath()
	 * @generated
	 * @ordered
	 */
	protected String yammModelPath = YAMM_MODEL_PATH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMetaDataPackage() <em>Meta Data Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaDataPackage()
	 * @generated
	 * @ordered
	 */
	protected EPackage metaDataPackage;

	/**
	 * The cached value of the '{@link #getTypeObjectCreate() <em>Type Object Create</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeObjectCreate()
	 * @generated
	 * @ordered
	 */
	protected EClass typeObjectCreate;

	/**
	 * The cached value of the '{@link #getInitialModel() <em>Initial Model</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialModel()
	 * @generated
	 * @ordered
	 */
	protected EList<ODObject> initialModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ObjectDiagramPackage.Literals.OBJECT_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ODObject> getObjects() {
		if (objects == null) {
			objects = new EObjectContainmentEList<ODObject>(ODObject.class, this, ObjectDiagramPackage.OBJECT_DIAGRAM__OBJECTS);
		}
		return objects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, ODType> getTypes() {
		if (types == null) {
			types = new EcoreEMap<String,ODType>(ObjectDiagramPackage.Literals.ESTRING_TO_OD_TYPE_MAP, EStringToODTypeMapImpl.class, this, ObjectDiagramPackage.OBJECT_DIAGRAM__TYPES);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, ODType> getDataTypes() {
		if (dataTypes == null) {
			dataTypes = new EcoreEMap<String,ODType>(ObjectDiagramPackage.Literals.ESTRING_TO_OD_TYPE_MAP, EStringToODTypeMapImpl.class, this, ObjectDiagramPackage.OBJECT_DIAGRAM__DATA_TYPES);
		}
		return dataTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ODStackframe> getStackframes() {
		if (stackframes == null) {
			stackframes = new EObjectContainmentEList<ODStackframe>(ODStackframe.class, this, ObjectDiagramPackage.OBJECT_DIAGRAM__STACKFRAMES);
		}
		return stackframes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getYammModelPath() {
		return yammModelPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYammModelPath(String newYammModelPath) {
		String oldYammModelPath = yammModelPath;
		yammModelPath = newYammModelPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObjectDiagramPackage.OBJECT_DIAGRAM__YAMM_MODEL_PATH, oldYammModelPath, yammModelPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPackage getMetaDataPackage() {
		if (metaDataPackage != null && metaDataPackage.eIsProxy()) {
			InternalEObject oldMetaDataPackage = (InternalEObject)metaDataPackage;
			metaDataPackage = (EPackage)eResolveProxy(oldMetaDataPackage);
			if (metaDataPackage != oldMetaDataPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ObjectDiagramPackage.OBJECT_DIAGRAM__META_DATA_PACKAGE, oldMetaDataPackage, metaDataPackage));
			}
		}
		return metaDataPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPackage basicGetMetaDataPackage() {
		return metaDataPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetaDataPackage(EPackage newMetaDataPackage) {
		EPackage oldMetaDataPackage = metaDataPackage;
		metaDataPackage = newMetaDataPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObjectDiagramPackage.OBJECT_DIAGRAM__META_DATA_PACKAGE, oldMetaDataPackage, metaDataPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeObjectCreate() {
		if (typeObjectCreate != null && typeObjectCreate.eIsProxy()) {
			InternalEObject oldTypeObjectCreate = (InternalEObject)typeObjectCreate;
			typeObjectCreate = (EClass)eResolveProxy(oldTypeObjectCreate);
			if (typeObjectCreate != oldTypeObjectCreate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ObjectDiagramPackage.OBJECT_DIAGRAM__TYPE_OBJECT_CREATE, oldTypeObjectCreate, typeObjectCreate));
			}
		}
		return typeObjectCreate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetTypeObjectCreate() {
		return typeObjectCreate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeObjectCreate(EClass newTypeObjectCreate) {
		EClass oldTypeObjectCreate = typeObjectCreate;
		typeObjectCreate = newTypeObjectCreate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObjectDiagramPackage.OBJECT_DIAGRAM__TYPE_OBJECT_CREATE, oldTypeObjectCreate, typeObjectCreate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ODObject> getInitialModel() {
		if (initialModel == null) {
			initialModel = new EObjectContainmentEList<ODObject>(ODObject.class, this, ObjectDiagramPackage.OBJECT_DIAGRAM__INITIAL_MODEL);
		}
		return initialModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ObjectDiagramPackage.OBJECT_DIAGRAM__OBJECTS:
				return ((InternalEList<?>)getObjects()).basicRemove(otherEnd, msgs);
			case ObjectDiagramPackage.OBJECT_DIAGRAM__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
			case ObjectDiagramPackage.OBJECT_DIAGRAM__DATA_TYPES:
				return ((InternalEList<?>)getDataTypes()).basicRemove(otherEnd, msgs);
			case ObjectDiagramPackage.OBJECT_DIAGRAM__STACKFRAMES:
				return ((InternalEList<?>)getStackframes()).basicRemove(otherEnd, msgs);
			case ObjectDiagramPackage.OBJECT_DIAGRAM__INITIAL_MODEL:
				return ((InternalEList<?>)getInitialModel()).basicRemove(otherEnd, msgs);
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
			case ObjectDiagramPackage.OBJECT_DIAGRAM__OBJECTS:
				return getObjects();
			case ObjectDiagramPackage.OBJECT_DIAGRAM__TYPES:
				if (coreType) return getTypes();
				else return getTypes().map();
			case ObjectDiagramPackage.OBJECT_DIAGRAM__DATA_TYPES:
				if (coreType) return getDataTypes();
				else return getDataTypes().map();
			case ObjectDiagramPackage.OBJECT_DIAGRAM__STACKFRAMES:
				return getStackframes();
			case ObjectDiagramPackage.OBJECT_DIAGRAM__YAMM_MODEL_PATH:
				return getYammModelPath();
			case ObjectDiagramPackage.OBJECT_DIAGRAM__META_DATA_PACKAGE:
				if (resolve) return getMetaDataPackage();
				return basicGetMetaDataPackage();
			case ObjectDiagramPackage.OBJECT_DIAGRAM__TYPE_OBJECT_CREATE:
				if (resolve) return getTypeObjectCreate();
				return basicGetTypeObjectCreate();
			case ObjectDiagramPackage.OBJECT_DIAGRAM__INITIAL_MODEL:
				return getInitialModel();
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
			case ObjectDiagramPackage.OBJECT_DIAGRAM__OBJECTS:
				getObjects().clear();
				getObjects().addAll((Collection<? extends ODObject>)newValue);
				return;
			case ObjectDiagramPackage.OBJECT_DIAGRAM__TYPES:
				((EStructuralFeature.Setting)getTypes()).set(newValue);
				return;
			case ObjectDiagramPackage.OBJECT_DIAGRAM__DATA_TYPES:
				((EStructuralFeature.Setting)getDataTypes()).set(newValue);
				return;
			case ObjectDiagramPackage.OBJECT_DIAGRAM__STACKFRAMES:
				getStackframes().clear();
				getStackframes().addAll((Collection<? extends ODStackframe>)newValue);
				return;
			case ObjectDiagramPackage.OBJECT_DIAGRAM__YAMM_MODEL_PATH:
				setYammModelPath((String)newValue);
				return;
			case ObjectDiagramPackage.OBJECT_DIAGRAM__META_DATA_PACKAGE:
				setMetaDataPackage((EPackage)newValue);
				return;
			case ObjectDiagramPackage.OBJECT_DIAGRAM__TYPE_OBJECT_CREATE:
				setTypeObjectCreate((EClass)newValue);
				return;
			case ObjectDiagramPackage.OBJECT_DIAGRAM__INITIAL_MODEL:
				getInitialModel().clear();
				getInitialModel().addAll((Collection<? extends ODObject>)newValue);
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
			case ObjectDiagramPackage.OBJECT_DIAGRAM__OBJECTS:
				getObjects().clear();
				return;
			case ObjectDiagramPackage.OBJECT_DIAGRAM__TYPES:
				getTypes().clear();
				return;
			case ObjectDiagramPackage.OBJECT_DIAGRAM__DATA_TYPES:
				getDataTypes().clear();
				return;
			case ObjectDiagramPackage.OBJECT_DIAGRAM__STACKFRAMES:
				getStackframes().clear();
				return;
			case ObjectDiagramPackage.OBJECT_DIAGRAM__YAMM_MODEL_PATH:
				setYammModelPath(YAMM_MODEL_PATH_EDEFAULT);
				return;
			case ObjectDiagramPackage.OBJECT_DIAGRAM__META_DATA_PACKAGE:
				setMetaDataPackage((EPackage)null);
				return;
			case ObjectDiagramPackage.OBJECT_DIAGRAM__TYPE_OBJECT_CREATE:
				setTypeObjectCreate((EClass)null);
				return;
			case ObjectDiagramPackage.OBJECT_DIAGRAM__INITIAL_MODEL:
				getInitialModel().clear();
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
			case ObjectDiagramPackage.OBJECT_DIAGRAM__OBJECTS:
				return objects != null && !objects.isEmpty();
			case ObjectDiagramPackage.OBJECT_DIAGRAM__TYPES:
				return types != null && !types.isEmpty();
			case ObjectDiagramPackage.OBJECT_DIAGRAM__DATA_TYPES:
				return dataTypes != null && !dataTypes.isEmpty();
			case ObjectDiagramPackage.OBJECT_DIAGRAM__STACKFRAMES:
				return stackframes != null && !stackframes.isEmpty();
			case ObjectDiagramPackage.OBJECT_DIAGRAM__YAMM_MODEL_PATH:
				return YAMM_MODEL_PATH_EDEFAULT == null ? yammModelPath != null : !YAMM_MODEL_PATH_EDEFAULT.equals(yammModelPath);
			case ObjectDiagramPackage.OBJECT_DIAGRAM__META_DATA_PACKAGE:
				return metaDataPackage != null;
			case ObjectDiagramPackage.OBJECT_DIAGRAM__TYPE_OBJECT_CREATE:
				return typeObjectCreate != null;
			case ObjectDiagramPackage.OBJECT_DIAGRAM__INITIAL_MODEL:
				return initialModel != null && !initialModel.isEmpty();
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
		result.append(" (yammModelPath: ");
		result.append(yammModelPath);
		result.append(')');
		return result.toString();
	}

} //ObjectDiagramImpl
