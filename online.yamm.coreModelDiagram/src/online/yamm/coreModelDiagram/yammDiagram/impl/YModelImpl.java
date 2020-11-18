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

import java.util.Collection;
import online.yamm.coreModelDiagram.yammDiagram.YClass;
import online.yamm.coreModelDiagram.yammDiagram.YCompositeEdge;
import online.yamm.coreModelDiagram.yammDiagram.YEnumeration;
import online.yamm.coreModelDiagram.yammDiagram.YModel;
import online.yamm.coreModelDiagram.yammDiagram.YPackage;
import online.yamm.coreModelDiagram.yammDiagram.YSharedEdge;
import online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YModel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.impl.YModelImpl#getClazz <em>Clazz</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.impl.YModelImpl#getEnumerations <em>Enumerations</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.impl.YModelImpl#getPackages <em>Packages</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.impl.YModelImpl#getObjects <em>Objects</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.impl.YModelImpl#getSharedEdges <em>Shared Edges</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.impl.YModelImpl#getCompositeEdges <em>Composite Edges</em>}</li>
 * </ul>
 *
 * @generated
 */
public class YModelImpl extends YObjectImpl implements YModel
{
	/**
	 * The cached value of the '{@link #getClazz() <em>Clazz</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClazz()
	 * @generated
	 * @ordered
	 */
	protected EList<YClass> clazz;

	/**
	 * The cached value of the '{@link #getEnumerations() <em>Enumerations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumerations()
	 * @generated
	 * @ordered
	 */
	protected EList<YEnumeration> enumerations;

	/**
	 * The cached value of the '{@link #getPackages() <em>Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<YPackage> packages;

	/**
	 * The cached value of the '{@link #getObjects() <em>Objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> objects;

	/**
	 * The cached value of the '{@link #getSharedEdges() <em>Shared Edges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharedEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<YSharedEdge> sharedEdges;

	/**
	 * The cached value of the '{@link #getCompositeEdges() <em>Composite Edges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositeEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<YCompositeEdge> compositeEdges;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YModelImpl()
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
		return YammDiagramPackage.Literals.YMODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YClass> getClazz()
	{
		if (clazz == null) {
			clazz = new EObjectContainmentEList<YClass>(YClass.class, this, YammDiagramPackage.YMODEL__CLAZZ);
		}
		return clazz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YEnumeration> getEnumerations()
	{
		if (enumerations == null) {
			enumerations = new EObjectContainmentEList<YEnumeration>(YEnumeration.class, this, YammDiagramPackage.YMODEL__ENUMERATIONS);
		}
		return enumerations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YPackage> getPackages()
	{
		if (packages == null) {
			packages = new EObjectContainmentEList<YPackage>(YPackage.class, this, YammDiagramPackage.YMODEL__PACKAGES);
		}
		return packages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getObjects()
	{
		if (objects == null) {
			objects = new EObjectContainmentEList<EObject>(EObject.class, this, YammDiagramPackage.YMODEL__OBJECTS);
		}
		return objects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YSharedEdge> getSharedEdges()
	{
		if (sharedEdges == null) {
			sharedEdges = new EObjectContainmentEList<YSharedEdge>(YSharedEdge.class, this, YammDiagramPackage.YMODEL__SHARED_EDGES);
		}
		return sharedEdges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YCompositeEdge> getCompositeEdges()
	{
		if (compositeEdges == null) {
			compositeEdges = new EObjectContainmentEList<YCompositeEdge>(YCompositeEdge.class, this, YammDiagramPackage.YMODEL__COMPOSITE_EDGES);
		}
		return compositeEdges;
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
			case YammDiagramPackage.YMODEL__CLAZZ:
				return ((InternalEList<?>)getClazz()).basicRemove(otherEnd, msgs);
			case YammDiagramPackage.YMODEL__ENUMERATIONS:
				return ((InternalEList<?>)getEnumerations()).basicRemove(otherEnd, msgs);
			case YammDiagramPackage.YMODEL__PACKAGES:
				return ((InternalEList<?>)getPackages()).basicRemove(otherEnd, msgs);
			case YammDiagramPackage.YMODEL__OBJECTS:
				return ((InternalEList<?>)getObjects()).basicRemove(otherEnd, msgs);
			case YammDiagramPackage.YMODEL__SHARED_EDGES:
				return ((InternalEList<?>)getSharedEdges()).basicRemove(otherEnd, msgs);
			case YammDiagramPackage.YMODEL__COMPOSITE_EDGES:
				return ((InternalEList<?>)getCompositeEdges()).basicRemove(otherEnd, msgs);
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
			case YammDiagramPackage.YMODEL__CLAZZ:
				return getClazz();
			case YammDiagramPackage.YMODEL__ENUMERATIONS:
				return getEnumerations();
			case YammDiagramPackage.YMODEL__PACKAGES:
				return getPackages();
			case YammDiagramPackage.YMODEL__OBJECTS:
				return getObjects();
			case YammDiagramPackage.YMODEL__SHARED_EDGES:
				return getSharedEdges();
			case YammDiagramPackage.YMODEL__COMPOSITE_EDGES:
				return getCompositeEdges();
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
		switch (featureID) {
			case YammDiagramPackage.YMODEL__CLAZZ:
				getClazz().clear();
				getClazz().addAll((Collection<? extends YClass>)newValue);
				return;
			case YammDiagramPackage.YMODEL__ENUMERATIONS:
				getEnumerations().clear();
				getEnumerations().addAll((Collection<? extends YEnumeration>)newValue);
				return;
			case YammDiagramPackage.YMODEL__PACKAGES:
				getPackages().clear();
				getPackages().addAll((Collection<? extends YPackage>)newValue);
				return;
			case YammDiagramPackage.YMODEL__OBJECTS:
				getObjects().clear();
				getObjects().addAll((Collection<? extends EObject>)newValue);
				return;
			case YammDiagramPackage.YMODEL__SHARED_EDGES:
				getSharedEdges().clear();
				getSharedEdges().addAll((Collection<? extends YSharedEdge>)newValue);
				return;
			case YammDiagramPackage.YMODEL__COMPOSITE_EDGES:
				getCompositeEdges().clear();
				getCompositeEdges().addAll((Collection<? extends YCompositeEdge>)newValue);
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
			case YammDiagramPackage.YMODEL__CLAZZ:
				getClazz().clear();
				return;
			case YammDiagramPackage.YMODEL__ENUMERATIONS:
				getEnumerations().clear();
				return;
			case YammDiagramPackage.YMODEL__PACKAGES:
				getPackages().clear();
				return;
			case YammDiagramPackage.YMODEL__OBJECTS:
				getObjects().clear();
				return;
			case YammDiagramPackage.YMODEL__SHARED_EDGES:
				getSharedEdges().clear();
				return;
			case YammDiagramPackage.YMODEL__COMPOSITE_EDGES:
				getCompositeEdges().clear();
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
			case YammDiagramPackage.YMODEL__CLAZZ:
				return clazz != null && !clazz.isEmpty();
			case YammDiagramPackage.YMODEL__ENUMERATIONS:
				return enumerations != null && !enumerations.isEmpty();
			case YammDiagramPackage.YMODEL__PACKAGES:
				return packages != null && !packages.isEmpty();
			case YammDiagramPackage.YMODEL__OBJECTS:
				return objects != null && !objects.isEmpty();
			case YammDiagramPackage.YMODEL__SHARED_EDGES:
				return sharedEdges != null && !sharedEdges.isEmpty();
			case YammDiagramPackage.YMODEL__COMPOSITE_EDGES:
				return compositeEdges != null && !compositeEdges.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //YModelImpl
