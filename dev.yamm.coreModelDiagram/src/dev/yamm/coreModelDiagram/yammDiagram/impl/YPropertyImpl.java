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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import dev.yamm.coreModelDiagram.yammDiagram.YAggregationKind;
import dev.yamm.coreModelDiagram.yammDiagram.YClass;
import dev.yamm.coreModelDiagram.yammDiagram.YComment;
import dev.yamm.coreModelDiagram.yammDiagram.YElement;
import dev.yamm.coreModelDiagram.yammDiagram.YEnumeration;
import dev.yamm.coreModelDiagram.yammDiagram.YFeature;
import dev.yamm.coreModelDiagram.yammDiagram.YNamedElement;
import dev.yamm.coreModelDiagram.yammDiagram.YProperty;
import dev.yamm.coreModelDiagram.yammDiagram.YType;
import dev.yamm.coreModelDiagram.yammDiagram.YVisibilityKind;
import dev.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YProperty</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YPropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YPropertyImpl#isIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YPropertyImpl#isIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YPropertyImpl#isIsDerivedUnion <em>Is Derived Union</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YPropertyImpl#isAssociation <em>Association</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YPropertyImpl#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YPropertyImpl#isIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YPropertyImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YPropertyImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YPropertyImpl#getAggregation <em>Aggregation</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YPropertyImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YPropertyImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YPropertyImpl#getFeaturingClassifier <em>Featuring Classifier</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YPropertyImpl#getType <em>Type</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YPropertyImpl#getSubsettedProperty <em>Subsetted Property</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YPropertyImpl#getOpposite <em>Opposite</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YPropertyImpl#getOwnedComment <em>Owned Comment</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YPropertyImpl#getOwnedElement <em>Owned Element</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YPropertyImpl#getClazz <em>Clazz</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YPropertyImpl#getSignature <em>Signature</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YPropertyImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YPropertyImpl#isObserve <em>Observe</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YPropertyImpl#getInvariant <em>Invariant</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.impl.YPropertyImpl#isStatic <em>Static</em>}</li>
 * </ul>
 *
 * @generated
 */
public class YPropertyImpl extends YElementImpl implements YProperty
{
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * This is true if the Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nameESet;

	/**
	 * The default value of the '{@link #isIsOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOrdered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ORDERED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOrdered()
	 * @generated
	 * @ordered
	 */
	protected boolean isOrdered = IS_ORDERED_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDerived()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DERIVED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDerived()
	 * @generated
	 * @ordered
	 */
	protected boolean isDerived = IS_DERIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsDerivedUnion() <em>Is Derived Union</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDerivedUnion()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DERIVED_UNION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDerivedUnion() <em>Is Derived Union</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDerivedUnion()
	 * @generated
	 * @ordered
	 */
	protected boolean isDerivedUnion = IS_DERIVED_UNION_EDEFAULT;

	/**
	 * The default value of the '{@link #isAssociation() <em>Association</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAssociation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ASSOCIATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAssociation() <em>Association</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAssociation()
	 * @generated
	 * @ordered
	 */
	protected boolean association = ASSOCIATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getQualifiedName() <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALIFIED_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQualifiedName() <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected String qualifiedName = QUALIFIED_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_UNIQUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUnique()
	 * @generated
	 * @ordered
	 */
	protected boolean isUnique = IS_UNIQUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLower() <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected static final int LOWER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLower() <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected int lower = LOWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpper() <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected static final int UPPER_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getUpper() <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected int upper = UPPER_EDEFAULT;

	/**
	 * The default value of the '{@link #getAggregation() <em>Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregation()
	 * @generated
	 * @ordered
	 */
	protected static final YAggregationKind AGGREGATION_EDEFAULT = YAggregationKind.NONE;

	/**
	 * The cached value of the '{@link #getAggregation() <em>Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregation()
	 * @generated
	 * @ordered
	 */
	protected YAggregationKind aggregation = AGGREGATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected String defaultValue = DEFAULT_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFeaturingClassifier() <em>Featuring Classifier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeaturingClassifier()
	 * @generated
	 * @ordered
	 */
	protected EList<YClass> featuringClassifier;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected YType type;

	/**
	 * The cached value of the '{@link #getSubsettedProperty() <em>Subsetted Property</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsettedProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<YProperty> subsettedProperty;

	/**
	 * The cached value of the '{@link #getOpposite() <em>Opposite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpposite()
	 * @generated
	 * @ordered
	 */
	protected YProperty opposite;

	/**
	 * The cached value of the '{@link #getOwnedComment() <em>Owned Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedComment()
	 * @generated
	 * @ordered
	 */
	protected YComment ownedComment;

	/**
	 * The cached value of the '{@link #getOwnedElement() <em>Owned Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElement()
	 * @generated
	 * @ordered
	 */
	protected EList<YElement> ownedElement;

	/**
	 * The cached value of the '{@link #getClazz() <em>Clazz</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClazz()
	 * @generated
	 * @ordered
	 */
	protected YClass clazz;

	/**
	 * The default value of the '{@link #getSignature() <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected static final String SIGNATURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSignature() <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected String signature = SIGNATURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final YVisibilityKind VISIBILITY_EDEFAULT = YVisibilityKind.PUBLIC;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected YVisibilityKind visibility = VISIBILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isObserve() <em>Observe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isObserve()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OBSERVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isObserve() <em>Observe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isObserve()
	 * @generated
	 * @ordered
	 */
	protected boolean observe = OBSERVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInvariant() <em>Invariant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvariant()
	 * @generated
	 * @ordered
	 */
	protected static final String INVARIANT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInvariant() <em>Invariant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvariant()
	 * @generated
	 * @ordered
	 */
	protected String invariant = INVARIANT_EDEFAULT;

	/**
	 * The default value of the '{@link #isStatic() <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STATIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStatic() <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatic()
	 * @generated
	 * @ordered
	 */
	protected boolean static_ = STATIC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YPropertyImpl()
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
		return YammDiagramPackage.Literals.YPROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName)
	{
		String oldName = name;
		name = newName;
		boolean oldNameESet = nameESet;
		nameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YPROPERTY__NAME, oldName, name, !oldNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetName()
	{
		String oldName = name;
		boolean oldNameESet = nameESet;
		name = NAME_EDEFAULT;
		nameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, YammDiagramPackage.YPROPERTY__NAME, oldName, NAME_EDEFAULT, oldNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetName()
	{
		return nameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsOrdered()
	{
		return isOrdered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOrdered(boolean newIsOrdered)
	{
		boolean oldIsOrdered = isOrdered;
		isOrdered = newIsOrdered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YPROPERTY__IS_ORDERED, oldIsOrdered, isOrdered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDerived()
	{
		return isDerived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDerived(boolean newIsDerived)
	{
		boolean oldIsDerived = isDerived;
		isDerived = newIsDerived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YPROPERTY__IS_DERIVED, oldIsDerived, isDerived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDerivedUnion()
	{
		return isDerivedUnion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDerivedUnion(boolean newIsDerivedUnion)
	{
		boolean oldIsDerivedUnion = isDerivedUnion;
		isDerivedUnion = newIsDerivedUnion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YPROPERTY__IS_DERIVED_UNION, oldIsDerivedUnion, isDerivedUnion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAssociation()
	{
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociation(boolean newAssociation)
	{
		boolean oldAssociation = association;
		association = newAssociation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YPROPERTY__ASSOCIATION, oldAssociation, association));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQualifiedName()
	{
		return qualifiedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualifiedName(String newQualifiedName)
	{
		String oldQualifiedName = qualifiedName;
		qualifiedName = newQualifiedName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YPROPERTY__QUALIFIED_NAME, oldQualifiedName, qualifiedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsUnique()
	{
		return isUnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsUnique(boolean newIsUnique)
	{
		boolean oldIsUnique = isUnique;
		isUnique = newIsUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YPROPERTY__IS_UNIQUE, oldIsUnique, isUnique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLower()
	{
		return lower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLower(int newLower)
	{
		int oldLower = lower;
		lower = newLower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YPROPERTY__LOWER, oldLower, lower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUpper()
	{
		return upper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpper(int newUpper)
	{
		int oldUpper = upper;
		upper = newUpper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YPROPERTY__UPPER, oldUpper, upper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YAggregationKind getAggregation()
	{
		return aggregation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAggregation(YAggregationKind newAggregation)
	{
		YAggregationKind oldAggregation = aggregation;
		aggregation = newAggregation == null ? AGGREGATION_EDEFAULT : newAggregation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YPROPERTY__AGGREGATION, oldAggregation, aggregation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultValue()
	{
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(String newDefaultValue)
	{
		String oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YPROPERTY__DEFAULT_VALUE, oldDefaultValue, defaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription()
	{
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription)
	{
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YPROPERTY__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YClass> getFeaturingClassifier()
	{
		if (featuringClassifier == null) {
			featuringClassifier = new EObjectResolvingEList<YClass>(YClass.class, this, YammDiagramPackage.YPROPERTY__FEATURING_CLASSIFIER);
		}
		return featuringClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YType getType()
	{
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (YType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammDiagramPackage.YPROPERTY__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YType basicGetType()
	{
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(YType newType)
	{
		YType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YPROPERTY__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YProperty> getSubsettedProperty()
	{
		if (subsettedProperty == null) {
			subsettedProperty = new EObjectResolvingEList<YProperty>(YProperty.class, this, YammDiagramPackage.YPROPERTY__SUBSETTED_PROPERTY);
		}
		return subsettedProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YProperty getOpposite()
	{
		if (opposite != null && opposite.eIsProxy()) {
			InternalEObject oldOpposite = (InternalEObject)opposite;
			opposite = (YProperty)eResolveProxy(oldOpposite);
			if (opposite != oldOpposite) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammDiagramPackage.YPROPERTY__OPPOSITE, oldOpposite, opposite));
			}
		}
		return opposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YProperty basicGetOpposite()
	{
		return opposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpposite(YProperty newOpposite)
	{
		YProperty oldOpposite = opposite;
		opposite = newOpposite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YPROPERTY__OPPOSITE, oldOpposite, opposite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YComment getOwnedComment()
	{
		return ownedComment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedComment(YComment newOwnedComment, NotificationChain msgs)
	{
		YComment oldOwnedComment = ownedComment;
		ownedComment = newOwnedComment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YPROPERTY__OWNED_COMMENT, oldOwnedComment, newOwnedComment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedComment(YComment newOwnedComment)
	{
		if (newOwnedComment != ownedComment) {
			NotificationChain msgs = null;
			if (ownedComment != null)
				msgs = ((InternalEObject)ownedComment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - YammDiagramPackage.YPROPERTY__OWNED_COMMENT, null, msgs);
			if (newOwnedComment != null)
				msgs = ((InternalEObject)newOwnedComment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - YammDiagramPackage.YPROPERTY__OWNED_COMMENT, null, msgs);
			msgs = basicSetOwnedComment(newOwnedComment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YPROPERTY__OWNED_COMMENT, newOwnedComment, newOwnedComment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YElement> getOwnedElement()
	{
		if (ownedElement == null) {
			ownedElement = new EObjectContainmentEList<YElement>(YElement.class, this, YammDiagramPackage.YPROPERTY__OWNED_ELEMENT);
		}
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YClass getClazz()
	{
		if (clazz != null && clazz.eIsProxy()) {
			InternalEObject oldClazz = (InternalEObject)clazz;
			clazz = (YClass)eResolveProxy(oldClazz);
			if (clazz != oldClazz) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammDiagramPackage.YPROPERTY__CLAZZ, oldClazz, clazz));
			}
		}
		return clazz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YClass basicGetClazz()
	{
		return clazz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClazz(YClass newClazz)
	{
		YClass oldClazz = clazz;
		clazz = newClazz;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YPROPERTY__CLAZZ, oldClazz, clazz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public String getSignature() {
		String signature = "no name ";
		if (getName() != null) {
			if (!getName().equals("")) {
				signature = getName() + " ";
			}
		}
		if (getDescription() != null) {
			if (!getDescription().equals("")) {
				signature += "(" + getDescription() + ") ";
			}
		}
		if (getUpper() != 1 || getLower() != 1) {
			if(getUpper() == -1) {
				signature += "[" + getLower() + "..*] ";
			} else {
				signature += "[" + getLower() + ".." + getUpper() + "] ";
			}
		}
		if (isIsDerived() == true) {
			if (getAggregation().getName().equals("shared")) {
				if(isIsDerivedUnion()) {
					signature = "/\\<s> " + signature;					
				} else {
					signature = "/<s> " + signature;
				}
			} else {
				if(isIsDerivedUnion()) {
					signature = "/\\ " + signature;					
				} else {
					signature = "/ " + signature;
				}
			}
		} else {
			if (getAggregation().getName().equals("shared")) {
				signature = "<s> " + signature;
			}
		}
		int subsetted = 0;
		if (getSubsettedProperty() != null) {
			subsetted = getSubsettedProperty().size();
		}
		if (isIsOrdered() || (isIsUnique() && getUpper() > 1) || subsetted > 0) {
			signature += "{";
			if (isIsOrdered()) {
				if (isIsUnique() && getUpper() > 1) {
					signature += "ordered, unique";
				} else {
					if(!isIsUnique()) {
						signature += "ordered, not unique";
					} else {
						signature += "ordered";
					}
					
				}
			} else if (isIsUnique() && getUpper() > 1) {
				signature += "unique";
			}
			if (subsetted > 0) {
				if (isIsOrdered() || (isIsUnique() && getUpper() > 1)) {
					signature += ", subsetted = ";
				} else {
					signature += "subsetted = ";
				}
				for (int i = 0; i < subsetted; i++) {
					if (i != subsetted - 1) {
						signature += getSubsettedProperty().get(i).getName()
								+ ", ";
					} else {
						signature += getSubsettedProperty().get(i).getName()
								+ "} ";
					}
				}
			} else {
				signature += "} ";
			}
		} else if(!isIsUnique() && getUpper() != 1) {
			signature += "{not unique}";
		}
		if (getType() != null) {
			if (getType() instanceof YClass) {
				String t = ((YClass) getType()).getQualifiedName();
				if (t.startsWith("Types."))
					t = t.substring(6);
				signature += ": " + t + " ";
			}	
			else if (getType() instanceof YEnumeration)
				signature += ": " + ((YEnumeration) getType()).getQualifiedName() + " ";
			else
				signature += ": " + getType().getName() + " ";
		}
		if (getInvariant() != null && !getInvariant().isEmpty())
		{
			signature += "{" + getInvariant() + "} ";
		}
		if (getDefaultValue() != null && !getDefaultValue().equals("\"\"")) {
			if (!getDefaultValue().equals("")) {
				if (getDefaultValue().equals("\"\\\"\\\"\""))
					signature += "= \"\"";
				else {
					if (getType() != null) {
						String typeName = getType().getName();
						if ("String".equals(typeName)) {
							signature += "= " + getDefaultValue();
						} else {
							signature += "= " + getDefaultValue().substring(1, getDefaultValue().length() - 1);
						}
					} else
						signature += "= " + getDefaultValue();
				}
			}
		}
		
		if (getVisibility() == YVisibilityKind.PRIVATE)
			signature = "- " + signature;
		else if (getVisibility() == YVisibilityKind.PUBLIC)
			signature = "+ " + signature;
		else if (getVisibility() == YVisibilityKind.PACKAGE)
			signature = "~ " + signature;
		else if (getVisibility() == YVisibilityKind.PROTECTED)
			signature = "# " + signature;
		
		
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void setSignature(String newSignature) {
		signature = newSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YVisibilityKind getVisibility()
	{
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(YVisibilityKind newVisibility)
	{
		YVisibilityKind oldVisibility = visibility;
		visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YPROPERTY__VISIBILITY, oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isObserve() {
		return observe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObserve(boolean newObserve) {
		boolean oldObserve = observe;
		observe = newObserve;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YPROPERTY__OBSERVE, oldObserve, observe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInvariant() {
		return invariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvariant(String newInvariant) {
		String oldInvariant = invariant;
		invariant = newInvariant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YPROPERTY__INVARIANT, oldInvariant, invariant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStatic() {
		return static_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatic(boolean newStatic) {
		boolean oldStatic = static_;
		static_ = newStatic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YPROPERTY__STATIC, oldStatic, static_));
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
			case YammDiagramPackage.YPROPERTY__OWNED_COMMENT:
				return basicSetOwnedComment(null, msgs);
			case YammDiagramPackage.YPROPERTY__OWNED_ELEMENT:
				return ((InternalEList<?>)getOwnedElement()).basicRemove(otherEnd, msgs);
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
			case YammDiagramPackage.YPROPERTY__NAME:
				return getName();
			case YammDiagramPackage.YPROPERTY__IS_ORDERED:
				return isIsOrdered();
			case YammDiagramPackage.YPROPERTY__IS_DERIVED:
				return isIsDerived();
			case YammDiagramPackage.YPROPERTY__IS_DERIVED_UNION:
				return isIsDerivedUnion();
			case YammDiagramPackage.YPROPERTY__ASSOCIATION:
				return isAssociation();
			case YammDiagramPackage.YPROPERTY__QUALIFIED_NAME:
				return getQualifiedName();
			case YammDiagramPackage.YPROPERTY__IS_UNIQUE:
				return isIsUnique();
			case YammDiagramPackage.YPROPERTY__LOWER:
				return getLower();
			case YammDiagramPackage.YPROPERTY__UPPER:
				return getUpper();
			case YammDiagramPackage.YPROPERTY__AGGREGATION:
				return getAggregation();
			case YammDiagramPackage.YPROPERTY__DEFAULT_VALUE:
				return getDefaultValue();
			case YammDiagramPackage.YPROPERTY__DESCRIPTION:
				return getDescription();
			case YammDiagramPackage.YPROPERTY__FEATURING_CLASSIFIER:
				return getFeaturingClassifier();
			case YammDiagramPackage.YPROPERTY__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case YammDiagramPackage.YPROPERTY__SUBSETTED_PROPERTY:
				return getSubsettedProperty();
			case YammDiagramPackage.YPROPERTY__OPPOSITE:
				if (resolve) return getOpposite();
				return basicGetOpposite();
			case YammDiagramPackage.YPROPERTY__OWNED_COMMENT:
				return getOwnedComment();
			case YammDiagramPackage.YPROPERTY__OWNED_ELEMENT:
				return getOwnedElement();
			case YammDiagramPackage.YPROPERTY__CLAZZ:
				if (resolve) return getClazz();
				return basicGetClazz();
			case YammDiagramPackage.YPROPERTY__SIGNATURE:
				return getSignature();
			case YammDiagramPackage.YPROPERTY__VISIBILITY:
				return getVisibility();
			case YammDiagramPackage.YPROPERTY__OBSERVE:
				return isObserve();
			case YammDiagramPackage.YPROPERTY__INVARIANT:
				return getInvariant();
			case YammDiagramPackage.YPROPERTY__STATIC:
				return isStatic();
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
			case YammDiagramPackage.YPROPERTY__NAME:
				setName((String)newValue);
				return;
			case YammDiagramPackage.YPROPERTY__IS_ORDERED:
				setIsOrdered((Boolean)newValue);
				return;
			case YammDiagramPackage.YPROPERTY__IS_DERIVED:
				setIsDerived((Boolean)newValue);
				return;
			case YammDiagramPackage.YPROPERTY__IS_DERIVED_UNION:
				setIsDerivedUnion((Boolean)newValue);
				return;
			case YammDiagramPackage.YPROPERTY__ASSOCIATION:
				setAssociation((Boolean)newValue);
				return;
			case YammDiagramPackage.YPROPERTY__QUALIFIED_NAME:
				setQualifiedName((String)newValue);
				return;
			case YammDiagramPackage.YPROPERTY__IS_UNIQUE:
				setIsUnique((Boolean)newValue);
				return;
			case YammDiagramPackage.YPROPERTY__LOWER:
				setLower((Integer)newValue);
				return;
			case YammDiagramPackage.YPROPERTY__UPPER:
				setUpper((Integer)newValue);
				return;
			case YammDiagramPackage.YPROPERTY__AGGREGATION:
				setAggregation((YAggregationKind)newValue);
				return;
			case YammDiagramPackage.YPROPERTY__DEFAULT_VALUE:
				setDefaultValue((String)newValue);
				return;
			case YammDiagramPackage.YPROPERTY__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case YammDiagramPackage.YPROPERTY__FEATURING_CLASSIFIER:
				getFeaturingClassifier().clear();
				getFeaturingClassifier().addAll((Collection<? extends YClass>)newValue);
				return;
			case YammDiagramPackage.YPROPERTY__TYPE:
				setType((YType)newValue);
				return;
			case YammDiagramPackage.YPROPERTY__SUBSETTED_PROPERTY:
				getSubsettedProperty().clear();
				getSubsettedProperty().addAll((Collection<? extends YProperty>)newValue);
				return;
			case YammDiagramPackage.YPROPERTY__OPPOSITE:
				setOpposite((YProperty)newValue);
				return;
			case YammDiagramPackage.YPROPERTY__OWNED_COMMENT:
				setOwnedComment((YComment)newValue);
				return;
			case YammDiagramPackage.YPROPERTY__OWNED_ELEMENT:
				getOwnedElement().clear();
				getOwnedElement().addAll((Collection<? extends YElement>)newValue);
				return;
			case YammDiagramPackage.YPROPERTY__CLAZZ:
				setClazz((YClass)newValue);
				return;
			case YammDiagramPackage.YPROPERTY__SIGNATURE:
				setSignature((String)newValue);
				return;
			case YammDiagramPackage.YPROPERTY__VISIBILITY:
				setVisibility((YVisibilityKind)newValue);
				return;
			case YammDiagramPackage.YPROPERTY__OBSERVE:
				setObserve((Boolean)newValue);
				return;
			case YammDiagramPackage.YPROPERTY__INVARIANT:
				setInvariant((String)newValue);
				return;
			case YammDiagramPackage.YPROPERTY__STATIC:
				setStatic((Boolean)newValue);
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
			case YammDiagramPackage.YPROPERTY__NAME:
				unsetName();
				return;
			case YammDiagramPackage.YPROPERTY__IS_ORDERED:
				setIsOrdered(IS_ORDERED_EDEFAULT);
				return;
			case YammDiagramPackage.YPROPERTY__IS_DERIVED:
				setIsDerived(IS_DERIVED_EDEFAULT);
				return;
			case YammDiagramPackage.YPROPERTY__IS_DERIVED_UNION:
				setIsDerivedUnion(IS_DERIVED_UNION_EDEFAULT);
				return;
			case YammDiagramPackage.YPROPERTY__ASSOCIATION:
				setAssociation(ASSOCIATION_EDEFAULT);
				return;
			case YammDiagramPackage.YPROPERTY__QUALIFIED_NAME:
				setQualifiedName(QUALIFIED_NAME_EDEFAULT);
				return;
			case YammDiagramPackage.YPROPERTY__IS_UNIQUE:
				setIsUnique(IS_UNIQUE_EDEFAULT);
				return;
			case YammDiagramPackage.YPROPERTY__LOWER:
				setLower(LOWER_EDEFAULT);
				return;
			case YammDiagramPackage.YPROPERTY__UPPER:
				setUpper(UPPER_EDEFAULT);
				return;
			case YammDiagramPackage.YPROPERTY__AGGREGATION:
				setAggregation(AGGREGATION_EDEFAULT);
				return;
			case YammDiagramPackage.YPROPERTY__DEFAULT_VALUE:
				setDefaultValue(DEFAULT_VALUE_EDEFAULT);
				return;
			case YammDiagramPackage.YPROPERTY__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case YammDiagramPackage.YPROPERTY__FEATURING_CLASSIFIER:
				getFeaturingClassifier().clear();
				return;
			case YammDiagramPackage.YPROPERTY__TYPE:
				setType((YType)null);
				return;
			case YammDiagramPackage.YPROPERTY__SUBSETTED_PROPERTY:
				getSubsettedProperty().clear();
				return;
			case YammDiagramPackage.YPROPERTY__OPPOSITE:
				setOpposite((YProperty)null);
				return;
			case YammDiagramPackage.YPROPERTY__OWNED_COMMENT:
				setOwnedComment((YComment)null);
				return;
			case YammDiagramPackage.YPROPERTY__OWNED_ELEMENT:
				getOwnedElement().clear();
				return;
			case YammDiagramPackage.YPROPERTY__CLAZZ:
				setClazz((YClass)null);
				return;
			case YammDiagramPackage.YPROPERTY__SIGNATURE:
				setSignature(SIGNATURE_EDEFAULT);
				return;
			case YammDiagramPackage.YPROPERTY__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case YammDiagramPackage.YPROPERTY__OBSERVE:
				setObserve(OBSERVE_EDEFAULT);
				return;
			case YammDiagramPackage.YPROPERTY__INVARIANT:
				setInvariant(INVARIANT_EDEFAULT);
				return;
			case YammDiagramPackage.YPROPERTY__STATIC:
				setStatic(STATIC_EDEFAULT);
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
			case YammDiagramPackage.YPROPERTY__NAME:
				return isSetName();
			case YammDiagramPackage.YPROPERTY__IS_ORDERED:
				return isOrdered != IS_ORDERED_EDEFAULT;
			case YammDiagramPackage.YPROPERTY__IS_DERIVED:
				return isDerived != IS_DERIVED_EDEFAULT;
			case YammDiagramPackage.YPROPERTY__IS_DERIVED_UNION:
				return isDerivedUnion != IS_DERIVED_UNION_EDEFAULT;
			case YammDiagramPackage.YPROPERTY__ASSOCIATION:
				return association != ASSOCIATION_EDEFAULT;
			case YammDiagramPackage.YPROPERTY__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? qualifiedName != null : !QUALIFIED_NAME_EDEFAULT.equals(qualifiedName);
			case YammDiagramPackage.YPROPERTY__IS_UNIQUE:
				return isUnique != IS_UNIQUE_EDEFAULT;
			case YammDiagramPackage.YPROPERTY__LOWER:
				return lower != LOWER_EDEFAULT;
			case YammDiagramPackage.YPROPERTY__UPPER:
				return upper != UPPER_EDEFAULT;
			case YammDiagramPackage.YPROPERTY__AGGREGATION:
				return aggregation != AGGREGATION_EDEFAULT;
			case YammDiagramPackage.YPROPERTY__DEFAULT_VALUE:
				return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
			case YammDiagramPackage.YPROPERTY__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case YammDiagramPackage.YPROPERTY__FEATURING_CLASSIFIER:
				return featuringClassifier != null && !featuringClassifier.isEmpty();
			case YammDiagramPackage.YPROPERTY__TYPE:
				return type != null;
			case YammDiagramPackage.YPROPERTY__SUBSETTED_PROPERTY:
				return subsettedProperty != null && !subsettedProperty.isEmpty();
			case YammDiagramPackage.YPROPERTY__OPPOSITE:
				return opposite != null;
			case YammDiagramPackage.YPROPERTY__OWNED_COMMENT:
				return ownedComment != null;
			case YammDiagramPackage.YPROPERTY__OWNED_ELEMENT:
				return ownedElement != null && !ownedElement.isEmpty();
			case YammDiagramPackage.YPROPERTY__CLAZZ:
				return clazz != null;
			case YammDiagramPackage.YPROPERTY__SIGNATURE:
				return SIGNATURE_EDEFAULT == null ? signature != null : !SIGNATURE_EDEFAULT.equals(signature);
			case YammDiagramPackage.YPROPERTY__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case YammDiagramPackage.YPROPERTY__OBSERVE:
				return observe != OBSERVE_EDEFAULT;
			case YammDiagramPackage.YPROPERTY__INVARIANT:
				return INVARIANT_EDEFAULT == null ? invariant != null : !INVARIANT_EDEFAULT.equals(invariant);
			case YammDiagramPackage.YPROPERTY__STATIC:
				return static_ != STATIC_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
	{
		if (baseClass == YNamedElement.class) {
			switch (derivedFeatureID) {
				case YammDiagramPackage.YPROPERTY__NAME: return YammDiagramPackage.YNAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == YFeature.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
	{
		if (baseClass == YNamedElement.class) {
			switch (baseFeatureID) {
				case YammDiagramPackage.YNAMED_ELEMENT__NAME: return YammDiagramPackage.YPROPERTY__NAME;
				default: return -1;
			}
		}
		if (baseClass == YFeature.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (name: ");
		if (nameESet) result.append(name); else result.append("<unset>");
		result.append(", isOrdered: ");
		result.append(isOrdered);
		result.append(", isDerived: ");
		result.append(isDerived);
		result.append(", isDerivedUnion: ");
		result.append(isDerivedUnion);
		result.append(", association: ");
		result.append(association);
		result.append(", qualifiedName: ");
		result.append(qualifiedName);
		result.append(", isUnique: ");
		result.append(isUnique);
		result.append(", lower: ");
		result.append(lower);
		result.append(", upper: ");
		result.append(upper);
		result.append(", aggregation: ");
		result.append(aggregation);
		result.append(", defaultValue: ");
		result.append(defaultValue);
		result.append(", description: ");
		result.append(description);
		result.append(", signature: ");
		result.append(signature);
		result.append(", visibility: ");
		result.append(visibility);
		result.append(", observe: ");
		result.append(observe);
		result.append(", invariant: ");
		result.append(invariant);
		result.append(", static: ");
		result.append(static_);
		result.append(')');
		return result.toString();
	}

} //YPropertyImpl
