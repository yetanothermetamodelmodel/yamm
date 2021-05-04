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
package dev.yamm.coreModelXmi.yamm.impl;

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

import dev.yamm.coreModelXmi.yamm.SingleLinePropertyInfo;
import dev.yamm.coreModelXmi.yamm.YAggregationKind;
import dev.yamm.coreModelXmi.yamm.YClass;
import dev.yamm.coreModelXmi.yamm.YComment;
import dev.yamm.coreModelXmi.yamm.YElement;
import dev.yamm.coreModelXmi.yamm.YFeature;
import dev.yamm.coreModelXmi.yamm.YNamedElement;
import dev.yamm.coreModelXmi.yamm.YProperty;
import dev.yamm.coreModelXmi.yamm.YType;
import dev.yamm.coreModelXmi.yamm.YVisibilityKind;
import dev.yamm.coreModelXmi.yamm.YammPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YProperty</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YPropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YPropertyImpl#isIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YPropertyImpl#isIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YPropertyImpl#isIsDerivedUnion <em>Is Derived Union</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YPropertyImpl#isAssociation <em>Association</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YPropertyImpl#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YPropertyImpl#isIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YPropertyImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YPropertyImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YPropertyImpl#getAggregation <em>Aggregation</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YPropertyImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YPropertyImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YPropertyImpl#getFeaturingClassifier <em>Featuring Classifier</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YPropertyImpl#getType <em>Type</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YPropertyImpl#getSubsettedProperty <em>Subsetted Property</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YPropertyImpl#getOpposite <em>Opposite</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YPropertyImpl#getOwnedComment <em>Owned Comment</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YPropertyImpl#getOwnedElement <em>Owned Element</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YPropertyImpl#getClazz <em>Clazz</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YPropertyImpl#getSignature <em>Signature</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YPropertyImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YPropertyImpl#getPosObjectID <em>Pos Object ID</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YPropertyImpl#getPosName <em>Pos Name</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YPropertyImpl#getPosOrdered <em>Pos Ordered</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YPropertyImpl#getPosUnique <em>Pos Unique</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YPropertyImpl#getPosLower <em>Pos Lower</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YPropertyImpl#getPosUpper <em>Pos Upper</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YPropertyImpl#getPosDefaultValue <em>Pos Default Value</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YPropertyImpl#getPosType <em>Pos Type</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YPropertyImpl#getPosClazz <em>Pos Clazz</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YPropertyImpl#getPosDerived <em>Pos Derived</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YPropertyImpl#getPosDerivedUnion <em>Pos Derived Union</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YPropertyImpl#getPosAssociation <em>Pos Association</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YPropertyImpl#getPosVisibility <em>Pos Visibility</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YPropertyImpl#getPosOpposite <em>Pos Opposite</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YPropertyImpl#getPosAggregation <em>Pos Aggregation</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YPropertyImpl#getPosQualifiedName <em>Pos Qualified Name</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YPropertyImpl#isObserve <em>Observe</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YPropertyImpl#getInvarinat <em>Invarinat</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YPropertyImpl#isStatic <em>Static</em>}</li>
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
	 * The cached value of the '{@link #getPosObjectID() <em>Pos Object ID</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosObjectID()
	 * @generated
	 * @ordered
	 */
	protected SingleLinePropertyInfo posObjectID;

	/**
	 * The cached value of the '{@link #getPosName() <em>Pos Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosName()
	 * @generated
	 * @ordered
	 */
	protected SingleLinePropertyInfo posName;

	/**
	 * The cached value of the '{@link #getPosOrdered() <em>Pos Ordered</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosOrdered()
	 * @generated
	 * @ordered
	 */
	protected SingleLinePropertyInfo posOrdered;

	/**
	 * The cached value of the '{@link #getPosUnique() <em>Pos Unique</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosUnique()
	 * @generated
	 * @ordered
	 */
	protected SingleLinePropertyInfo posUnique;

	/**
	 * The cached value of the '{@link #getPosLower() <em>Pos Lower</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosLower()
	 * @generated
	 * @ordered
	 */
	protected SingleLinePropertyInfo posLower;

	/**
	 * The cached value of the '{@link #getPosUpper() <em>Pos Upper</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosUpper()
	 * @generated
	 * @ordered
	 */
	protected SingleLinePropertyInfo posUpper;

	/**
	 * The cached value of the '{@link #getPosDefaultValue() <em>Pos Default Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected SingleLinePropertyInfo posDefaultValue;

	/**
	 * The cached value of the '{@link #getPosType() <em>Pos Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosType()
	 * @generated
	 * @ordered
	 */
	protected SingleLinePropertyInfo posType;

	/**
	 * The cached value of the '{@link #getPosClazz() <em>Pos Clazz</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosClazz()
	 * @generated
	 * @ordered
	 */
	protected SingleLinePropertyInfo posClazz;

	/**
	 * The cached value of the '{@link #getPosDerived() <em>Pos Derived</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosDerived()
	 * @generated
	 * @ordered
	 */
	protected SingleLinePropertyInfo posDerived;

	/**
	 * The cached value of the '{@link #getPosDerivedUnion() <em>Pos Derived Union</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosDerivedUnion()
	 * @generated
	 * @ordered
	 */
	protected SingleLinePropertyInfo posDerivedUnion;

	/**
	 * The cached value of the '{@link #getPosAssociation() <em>Pos Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosAssociation()
	 * @generated
	 * @ordered
	 */
	protected SingleLinePropertyInfo posAssociation;

	/**
	 * The cached value of the '{@link #getPosVisibility() <em>Pos Visibility</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosVisibility()
	 * @generated
	 * @ordered
	 */
	protected SingleLinePropertyInfo posVisibility;

	/**
	 * The cached value of the '{@link #getPosOpposite() <em>Pos Opposite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosOpposite()
	 * @generated
	 * @ordered
	 */
	protected SingleLinePropertyInfo posOpposite;

	/**
	 * The cached value of the '{@link #getPosAggregation() <em>Pos Aggregation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosAggregation()
	 * @generated
	 * @ordered
	 */
	protected SingleLinePropertyInfo posAggregation;

	/**
	 * The cached value of the '{@link #getPosQualifiedName() <em>Pos Qualified Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected SingleLinePropertyInfo posQualifiedName;

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
	 * The default value of the '{@link #getInvarinat() <em>Invarinat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvarinat()
	 * @generated
	 * @ordered
	 */
	protected static final String INVARINAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInvarinat() <em>Invarinat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvarinat()
	 * @generated
	 * @ordered
	 */
	protected String invarinat = INVARINAT_EDEFAULT;

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
		return YammPackage.Literals.YPROPERTY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YPROPERTY__NAME, oldName, name, !oldNameESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, YammPackage.YPROPERTY__NAME, oldName, NAME_EDEFAULT, oldNameESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YPROPERTY__IS_ORDERED, oldIsOrdered, isOrdered));
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
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YPROPERTY__IS_DERIVED, oldIsDerived, isDerived));
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
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YPROPERTY__IS_DERIVED_UNION, oldIsDerivedUnion, isDerivedUnion));
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
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YPROPERTY__ASSOCIATION, oldAssociation, association));
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
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YPROPERTY__QUALIFIED_NAME, oldQualifiedName, qualifiedName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YPROPERTY__IS_UNIQUE, oldIsUnique, isUnique));
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
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YPROPERTY__LOWER, oldLower, lower));
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
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YPROPERTY__UPPER, oldUpper, upper));
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
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YPROPERTY__AGGREGATION, oldAggregation, aggregation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YPROPERTY__DEFAULT_VALUE, oldDefaultValue, defaultValue));
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
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YPROPERTY__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YClass> getFeaturingClassifier()
	{
		if (featuringClassifier == null) {
			featuringClassifier = new EObjectResolvingEList<YClass>(YClass.class, this, YammPackage.YPROPERTY__FEATURING_CLASSIFIER);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammPackage.YPROPERTY__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YPROPERTY__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YProperty> getSubsettedProperty()
	{
		if (subsettedProperty == null) {
			subsettedProperty = new EObjectResolvingEList<YProperty>(YProperty.class, this, YammPackage.YPROPERTY__SUBSETTED_PROPERTY);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammPackage.YPROPERTY__OPPOSITE, oldOpposite, opposite));
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
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YPROPERTY__OPPOSITE, oldOpposite, opposite));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, YammPackage.YPROPERTY__OWNED_COMMENT, oldOwnedComment, newOwnedComment);
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
				msgs = ((InternalEObject)ownedComment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - YammPackage.YPROPERTY__OWNED_COMMENT, null, msgs);
			if (newOwnedComment != null)
				msgs = ((InternalEObject)newOwnedComment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - YammPackage.YPROPERTY__OWNED_COMMENT, null, msgs);
			msgs = basicSetOwnedComment(newOwnedComment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YPROPERTY__OWNED_COMMENT, newOwnedComment, newOwnedComment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YElement> getOwnedElement()
	{
		if (ownedElement == null) {
			ownedElement = new EObjectContainmentEList<YElement>(YElement.class, this, YammPackage.YPROPERTY__OWNED_ELEMENT);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammPackage.YPROPERTY__CLAZZ, oldClazz, clazz));
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
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YPROPERTY__CLAZZ, oldClazz, clazz));
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
		} else if(!isIsUnique()) {
			signature += "{not unique}";
		}
		if (getType() != null) {
			signature += ": " + getType().getName() + " ";
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
							if (getDefaultValue().indexOf("") == 0 && getDefaultValue().lastIndexOf("") == getDefaultValue().length() - 1)
								signature += "= " + getDefaultValue().substring(1, getDefaultValue().length() - 1);
							else 
								signature += "= " + getDefaultValue();
						}
					} else
						signature += "= " + getDefaultValue();
				}
			}
		}
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
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YPROPERTY__VISIBILITY, oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo getPosObjectID()
	{
		if (posObjectID != null && posObjectID.eIsProxy()) {
			InternalEObject oldPosObjectID = (InternalEObject)posObjectID;
			posObjectID = (SingleLinePropertyInfo)eResolveProxy(oldPosObjectID);
			if (posObjectID != oldPosObjectID) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammPackage.YPROPERTY__POS_OBJECT_ID, oldPosObjectID, posObjectID));
			}
		}
		return posObjectID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo basicGetPosObjectID()
	{
		return posObjectID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosObjectID(SingleLinePropertyInfo newPosObjectID)
	{
		SingleLinePropertyInfo oldPosObjectID = posObjectID;
		posObjectID = newPosObjectID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YPROPERTY__POS_OBJECT_ID, oldPosObjectID, posObjectID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo getPosName()
	{
		if (posName != null && posName.eIsProxy()) {
			InternalEObject oldPosName = (InternalEObject)posName;
			posName = (SingleLinePropertyInfo)eResolveProxy(oldPosName);
			if (posName != oldPosName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammPackage.YPROPERTY__POS_NAME, oldPosName, posName));
			}
		}
		return posName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo basicGetPosName()
	{
		return posName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosName(SingleLinePropertyInfo newPosName)
	{
		SingleLinePropertyInfo oldPosName = posName;
		posName = newPosName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YPROPERTY__POS_NAME, oldPosName, posName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo getPosOrdered()
	{
		if (posOrdered != null && posOrdered.eIsProxy()) {
			InternalEObject oldPosOrdered = (InternalEObject)posOrdered;
			posOrdered = (SingleLinePropertyInfo)eResolveProxy(oldPosOrdered);
			if (posOrdered != oldPosOrdered) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammPackage.YPROPERTY__POS_ORDERED, oldPosOrdered, posOrdered));
			}
		}
		return posOrdered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo basicGetPosOrdered()
	{
		return posOrdered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosOrdered(SingleLinePropertyInfo newPosOrdered)
	{
		SingleLinePropertyInfo oldPosOrdered = posOrdered;
		posOrdered = newPosOrdered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YPROPERTY__POS_ORDERED, oldPosOrdered, posOrdered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo getPosUnique()
	{
		if (posUnique != null && posUnique.eIsProxy()) {
			InternalEObject oldPosUnique = (InternalEObject)posUnique;
			posUnique = (SingleLinePropertyInfo)eResolveProxy(oldPosUnique);
			if (posUnique != oldPosUnique) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammPackage.YPROPERTY__POS_UNIQUE, oldPosUnique, posUnique));
			}
		}
		return posUnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo basicGetPosUnique()
	{
		return posUnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosUnique(SingleLinePropertyInfo newPosUnique)
	{
		SingleLinePropertyInfo oldPosUnique = posUnique;
		posUnique = newPosUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YPROPERTY__POS_UNIQUE, oldPosUnique, posUnique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo getPosLower()
	{
		if (posLower != null && posLower.eIsProxy()) {
			InternalEObject oldPosLower = (InternalEObject)posLower;
			posLower = (SingleLinePropertyInfo)eResolveProxy(oldPosLower);
			if (posLower != oldPosLower) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammPackage.YPROPERTY__POS_LOWER, oldPosLower, posLower));
			}
		}
		return posLower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo basicGetPosLower()
	{
		return posLower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosLower(SingleLinePropertyInfo newPosLower)
	{
		SingleLinePropertyInfo oldPosLower = posLower;
		posLower = newPosLower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YPROPERTY__POS_LOWER, oldPosLower, posLower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo getPosUpper()
	{
		if (posUpper != null && posUpper.eIsProxy()) {
			InternalEObject oldPosUpper = (InternalEObject)posUpper;
			posUpper = (SingleLinePropertyInfo)eResolveProxy(oldPosUpper);
			if (posUpper != oldPosUpper) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammPackage.YPROPERTY__POS_UPPER, oldPosUpper, posUpper));
			}
		}
		return posUpper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo basicGetPosUpper()
	{
		return posUpper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosUpper(SingleLinePropertyInfo newPosUpper)
	{
		SingleLinePropertyInfo oldPosUpper = posUpper;
		posUpper = newPosUpper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YPROPERTY__POS_UPPER, oldPosUpper, posUpper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo getPosDefaultValue()
	{
		if (posDefaultValue != null && posDefaultValue.eIsProxy()) {
			InternalEObject oldPosDefaultValue = (InternalEObject)posDefaultValue;
			posDefaultValue = (SingleLinePropertyInfo)eResolveProxy(oldPosDefaultValue);
			if (posDefaultValue != oldPosDefaultValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammPackage.YPROPERTY__POS_DEFAULT_VALUE, oldPosDefaultValue, posDefaultValue));
			}
		}
		return posDefaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo basicGetPosDefaultValue()
	{
		return posDefaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosDefaultValue(SingleLinePropertyInfo newPosDefaultValue)
	{
		SingleLinePropertyInfo oldPosDefaultValue = posDefaultValue;
		posDefaultValue = newPosDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YPROPERTY__POS_DEFAULT_VALUE, oldPosDefaultValue, posDefaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo getPosType()
	{
		if (posType != null && posType.eIsProxy()) {
			InternalEObject oldPosType = (InternalEObject)posType;
			posType = (SingleLinePropertyInfo)eResolveProxy(oldPosType);
			if (posType != oldPosType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammPackage.YPROPERTY__POS_TYPE, oldPosType, posType));
			}
		}
		return posType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo basicGetPosType()
	{
		return posType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosType(SingleLinePropertyInfo newPosType)
	{
		SingleLinePropertyInfo oldPosType = posType;
		posType = newPosType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YPROPERTY__POS_TYPE, oldPosType, posType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo getPosClazz()
	{
		if (posClazz != null && posClazz.eIsProxy()) {
			InternalEObject oldPosClazz = (InternalEObject)posClazz;
			posClazz = (SingleLinePropertyInfo)eResolveProxy(oldPosClazz);
			if (posClazz != oldPosClazz) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammPackage.YPROPERTY__POS_CLAZZ, oldPosClazz, posClazz));
			}
		}
		return posClazz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo basicGetPosClazz()
	{
		return posClazz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosClazz(SingleLinePropertyInfo newPosClazz)
	{
		SingleLinePropertyInfo oldPosClazz = posClazz;
		posClazz = newPosClazz;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YPROPERTY__POS_CLAZZ, oldPosClazz, posClazz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo getPosDerived()
	{
		if (posDerived != null && posDerived.eIsProxy()) {
			InternalEObject oldPosDerived = (InternalEObject)posDerived;
			posDerived = (SingleLinePropertyInfo)eResolveProxy(oldPosDerived);
			if (posDerived != oldPosDerived) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammPackage.YPROPERTY__POS_DERIVED, oldPosDerived, posDerived));
			}
		}
		return posDerived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo basicGetPosDerived()
	{
		return posDerived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosDerived(SingleLinePropertyInfo newPosDerived)
	{
		SingleLinePropertyInfo oldPosDerived = posDerived;
		posDerived = newPosDerived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YPROPERTY__POS_DERIVED, oldPosDerived, posDerived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo getPosDerivedUnion()
	{
		if (posDerivedUnion != null && posDerivedUnion.eIsProxy()) {
			InternalEObject oldPosDerivedUnion = (InternalEObject)posDerivedUnion;
			posDerivedUnion = (SingleLinePropertyInfo)eResolveProxy(oldPosDerivedUnion);
			if (posDerivedUnion != oldPosDerivedUnion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammPackage.YPROPERTY__POS_DERIVED_UNION, oldPosDerivedUnion, posDerivedUnion));
			}
		}
		return posDerivedUnion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo basicGetPosDerivedUnion()
	{
		return posDerivedUnion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosDerivedUnion(SingleLinePropertyInfo newPosDerivedUnion)
	{
		SingleLinePropertyInfo oldPosDerivedUnion = posDerivedUnion;
		posDerivedUnion = newPosDerivedUnion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YPROPERTY__POS_DERIVED_UNION, oldPosDerivedUnion, posDerivedUnion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo getPosAssociation()
	{
		if (posAssociation != null && posAssociation.eIsProxy()) {
			InternalEObject oldPosAssociation = (InternalEObject)posAssociation;
			posAssociation = (SingleLinePropertyInfo)eResolveProxy(oldPosAssociation);
			if (posAssociation != oldPosAssociation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammPackage.YPROPERTY__POS_ASSOCIATION, oldPosAssociation, posAssociation));
			}
		}
		return posAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo basicGetPosAssociation()
	{
		return posAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosAssociation(SingleLinePropertyInfo newPosAssociation)
	{
		SingleLinePropertyInfo oldPosAssociation = posAssociation;
		posAssociation = newPosAssociation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YPROPERTY__POS_ASSOCIATION, oldPosAssociation, posAssociation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo getPosVisibility()
	{
		if (posVisibility != null && posVisibility.eIsProxy()) {
			InternalEObject oldPosVisibility = (InternalEObject)posVisibility;
			posVisibility = (SingleLinePropertyInfo)eResolveProxy(oldPosVisibility);
			if (posVisibility != oldPosVisibility) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammPackage.YPROPERTY__POS_VISIBILITY, oldPosVisibility, posVisibility));
			}
		}
		return posVisibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo basicGetPosVisibility()
	{
		return posVisibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosVisibility(SingleLinePropertyInfo newPosVisibility)
	{
		SingleLinePropertyInfo oldPosVisibility = posVisibility;
		posVisibility = newPosVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YPROPERTY__POS_VISIBILITY, oldPosVisibility, posVisibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo getPosOpposite()
	{
		if (posOpposite != null && posOpposite.eIsProxy()) {
			InternalEObject oldPosOpposite = (InternalEObject)posOpposite;
			posOpposite = (SingleLinePropertyInfo)eResolveProxy(oldPosOpposite);
			if (posOpposite != oldPosOpposite) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammPackage.YPROPERTY__POS_OPPOSITE, oldPosOpposite, posOpposite));
			}
		}
		return posOpposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo basicGetPosOpposite()
	{
		return posOpposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosOpposite(SingleLinePropertyInfo newPosOpposite)
	{
		SingleLinePropertyInfo oldPosOpposite = posOpposite;
		posOpposite = newPosOpposite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YPROPERTY__POS_OPPOSITE, oldPosOpposite, posOpposite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo getPosAggregation()
	{
		if (posAggregation != null && posAggregation.eIsProxy()) {
			InternalEObject oldPosAggregation = (InternalEObject)posAggregation;
			posAggregation = (SingleLinePropertyInfo)eResolveProxy(oldPosAggregation);
			if (posAggregation != oldPosAggregation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammPackage.YPROPERTY__POS_AGGREGATION, oldPosAggregation, posAggregation));
			}
		}
		return posAggregation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo basicGetPosAggregation()
	{
		return posAggregation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosAggregation(SingleLinePropertyInfo newPosAggregation)
	{
		SingleLinePropertyInfo oldPosAggregation = posAggregation;
		posAggregation = newPosAggregation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YPROPERTY__POS_AGGREGATION, oldPosAggregation, posAggregation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo getPosQualifiedName()
	{
		if (posQualifiedName != null && posQualifiedName.eIsProxy()) {
			InternalEObject oldPosQualifiedName = (InternalEObject)posQualifiedName;
			posQualifiedName = (SingleLinePropertyInfo)eResolveProxy(oldPosQualifiedName);
			if (posQualifiedName != oldPosQualifiedName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammPackage.YPROPERTY__POS_QUALIFIED_NAME, oldPosQualifiedName, posQualifiedName));
			}
		}
		return posQualifiedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo basicGetPosQualifiedName()
	{
		return posQualifiedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosQualifiedName(SingleLinePropertyInfo newPosQualifiedName)
	{
		SingleLinePropertyInfo oldPosQualifiedName = posQualifiedName;
		posQualifiedName = newPosQualifiedName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YPROPERTY__POS_QUALIFIED_NAME, oldPosQualifiedName, posQualifiedName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YPROPERTY__OBSERVE, oldObserve, observe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInvarinat() {
		return invarinat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvarinat(String newInvarinat) {
		String oldInvarinat = invarinat;
		invarinat = newInvarinat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YPROPERTY__INVARINAT, oldInvarinat, invarinat));
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
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YPROPERTY__STATIC, oldStatic, static_));
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
			case YammPackage.YPROPERTY__OWNED_COMMENT:
				return basicSetOwnedComment(null, msgs);
			case YammPackage.YPROPERTY__OWNED_ELEMENT:
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
			case YammPackage.YPROPERTY__NAME:
				return getName();
			case YammPackage.YPROPERTY__IS_ORDERED:
				return isIsOrdered();
			case YammPackage.YPROPERTY__IS_DERIVED:
				return isIsDerived();
			case YammPackage.YPROPERTY__IS_DERIVED_UNION:
				return isIsDerivedUnion();
			case YammPackage.YPROPERTY__ASSOCIATION:
				return isAssociation();
			case YammPackage.YPROPERTY__QUALIFIED_NAME:
				return getQualifiedName();
			case YammPackage.YPROPERTY__IS_UNIQUE:
				return isIsUnique();
			case YammPackage.YPROPERTY__LOWER:
				return getLower();
			case YammPackage.YPROPERTY__UPPER:
				return getUpper();
			case YammPackage.YPROPERTY__AGGREGATION:
				return getAggregation();
			case YammPackage.YPROPERTY__DEFAULT_VALUE:
				return getDefaultValue();
			case YammPackage.YPROPERTY__DESCRIPTION:
				return getDescription();
			case YammPackage.YPROPERTY__FEATURING_CLASSIFIER:
				return getFeaturingClassifier();
			case YammPackage.YPROPERTY__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case YammPackage.YPROPERTY__SUBSETTED_PROPERTY:
				return getSubsettedProperty();
			case YammPackage.YPROPERTY__OPPOSITE:
				if (resolve) return getOpposite();
				return basicGetOpposite();
			case YammPackage.YPROPERTY__OWNED_COMMENT:
				return getOwnedComment();
			case YammPackage.YPROPERTY__OWNED_ELEMENT:
				return getOwnedElement();
			case YammPackage.YPROPERTY__CLAZZ:
				if (resolve) return getClazz();
				return basicGetClazz();
			case YammPackage.YPROPERTY__SIGNATURE:
				return getSignature();
			case YammPackage.YPROPERTY__VISIBILITY:
				return getVisibility();
			case YammPackage.YPROPERTY__POS_OBJECT_ID:
				if (resolve) return getPosObjectID();
				return basicGetPosObjectID();
			case YammPackage.YPROPERTY__POS_NAME:
				if (resolve) return getPosName();
				return basicGetPosName();
			case YammPackage.YPROPERTY__POS_ORDERED:
				if (resolve) return getPosOrdered();
				return basicGetPosOrdered();
			case YammPackage.YPROPERTY__POS_UNIQUE:
				if (resolve) return getPosUnique();
				return basicGetPosUnique();
			case YammPackage.YPROPERTY__POS_LOWER:
				if (resolve) return getPosLower();
				return basicGetPosLower();
			case YammPackage.YPROPERTY__POS_UPPER:
				if (resolve) return getPosUpper();
				return basicGetPosUpper();
			case YammPackage.YPROPERTY__POS_DEFAULT_VALUE:
				if (resolve) return getPosDefaultValue();
				return basicGetPosDefaultValue();
			case YammPackage.YPROPERTY__POS_TYPE:
				if (resolve) return getPosType();
				return basicGetPosType();
			case YammPackage.YPROPERTY__POS_CLAZZ:
				if (resolve) return getPosClazz();
				return basicGetPosClazz();
			case YammPackage.YPROPERTY__POS_DERIVED:
				if (resolve) return getPosDerived();
				return basicGetPosDerived();
			case YammPackage.YPROPERTY__POS_DERIVED_UNION:
				if (resolve) return getPosDerivedUnion();
				return basicGetPosDerivedUnion();
			case YammPackage.YPROPERTY__POS_ASSOCIATION:
				if (resolve) return getPosAssociation();
				return basicGetPosAssociation();
			case YammPackage.YPROPERTY__POS_VISIBILITY:
				if (resolve) return getPosVisibility();
				return basicGetPosVisibility();
			case YammPackage.YPROPERTY__POS_OPPOSITE:
				if (resolve) return getPosOpposite();
				return basicGetPosOpposite();
			case YammPackage.YPROPERTY__POS_AGGREGATION:
				if (resolve) return getPosAggregation();
				return basicGetPosAggregation();
			case YammPackage.YPROPERTY__POS_QUALIFIED_NAME:
				if (resolve) return getPosQualifiedName();
				return basicGetPosQualifiedName();
			case YammPackage.YPROPERTY__OBSERVE:
				return isObserve();
			case YammPackage.YPROPERTY__INVARINAT:
				return getInvarinat();
			case YammPackage.YPROPERTY__STATIC:
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
			case YammPackage.YPROPERTY__NAME:
				setName((String)newValue);
				return;
			case YammPackage.YPROPERTY__IS_ORDERED:
				setIsOrdered((Boolean)newValue);
				return;
			case YammPackage.YPROPERTY__IS_DERIVED:
				setIsDerived((Boolean)newValue);
				return;
			case YammPackage.YPROPERTY__IS_DERIVED_UNION:
				setIsDerivedUnion((Boolean)newValue);
				return;
			case YammPackage.YPROPERTY__ASSOCIATION:
				setAssociation((Boolean)newValue);
				return;
			case YammPackage.YPROPERTY__QUALIFIED_NAME:
				setQualifiedName((String)newValue);
				return;
			case YammPackage.YPROPERTY__IS_UNIQUE:
				setIsUnique((Boolean)newValue);
				return;
			case YammPackage.YPROPERTY__LOWER:
				setLower((Integer)newValue);
				return;
			case YammPackage.YPROPERTY__UPPER:
				setUpper((Integer)newValue);
				return;
			case YammPackage.YPROPERTY__AGGREGATION:
				setAggregation((YAggregationKind)newValue);
				return;
			case YammPackage.YPROPERTY__DEFAULT_VALUE:
				setDefaultValue((String)newValue);
				return;
			case YammPackage.YPROPERTY__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case YammPackage.YPROPERTY__FEATURING_CLASSIFIER:
				getFeaturingClassifier().clear();
				getFeaturingClassifier().addAll((Collection<? extends YClass>)newValue);
				return;
			case YammPackage.YPROPERTY__TYPE:
				setType((YType)newValue);
				return;
			case YammPackage.YPROPERTY__SUBSETTED_PROPERTY:
				getSubsettedProperty().clear();
				getSubsettedProperty().addAll((Collection<? extends YProperty>)newValue);
				return;
			case YammPackage.YPROPERTY__OPPOSITE:
				setOpposite((YProperty)newValue);
				return;
			case YammPackage.YPROPERTY__OWNED_COMMENT:
				setOwnedComment((YComment)newValue);
				return;
			case YammPackage.YPROPERTY__OWNED_ELEMENT:
				getOwnedElement().clear();
				getOwnedElement().addAll((Collection<? extends YElement>)newValue);
				return;
			case YammPackage.YPROPERTY__CLAZZ:
				setClazz((YClass)newValue);
				return;
			case YammPackage.YPROPERTY__SIGNATURE:
				setSignature((String)newValue);
				return;
			case YammPackage.YPROPERTY__VISIBILITY:
				setVisibility((YVisibilityKind)newValue);
				return;
			case YammPackage.YPROPERTY__POS_OBJECT_ID:
				setPosObjectID((SingleLinePropertyInfo)newValue);
				return;
			case YammPackage.YPROPERTY__POS_NAME:
				setPosName((SingleLinePropertyInfo)newValue);
				return;
			case YammPackage.YPROPERTY__POS_ORDERED:
				setPosOrdered((SingleLinePropertyInfo)newValue);
				return;
			case YammPackage.YPROPERTY__POS_UNIQUE:
				setPosUnique((SingleLinePropertyInfo)newValue);
				return;
			case YammPackage.YPROPERTY__POS_LOWER:
				setPosLower((SingleLinePropertyInfo)newValue);
				return;
			case YammPackage.YPROPERTY__POS_UPPER:
				setPosUpper((SingleLinePropertyInfo)newValue);
				return;
			case YammPackage.YPROPERTY__POS_DEFAULT_VALUE:
				setPosDefaultValue((SingleLinePropertyInfo)newValue);
				return;
			case YammPackage.YPROPERTY__POS_TYPE:
				setPosType((SingleLinePropertyInfo)newValue);
				return;
			case YammPackage.YPROPERTY__POS_CLAZZ:
				setPosClazz((SingleLinePropertyInfo)newValue);
				return;
			case YammPackage.YPROPERTY__POS_DERIVED:
				setPosDerived((SingleLinePropertyInfo)newValue);
				return;
			case YammPackage.YPROPERTY__POS_DERIVED_UNION:
				setPosDerivedUnion((SingleLinePropertyInfo)newValue);
				return;
			case YammPackage.YPROPERTY__POS_ASSOCIATION:
				setPosAssociation((SingleLinePropertyInfo)newValue);
				return;
			case YammPackage.YPROPERTY__POS_VISIBILITY:
				setPosVisibility((SingleLinePropertyInfo)newValue);
				return;
			case YammPackage.YPROPERTY__POS_OPPOSITE:
				setPosOpposite((SingleLinePropertyInfo)newValue);
				return;
			case YammPackage.YPROPERTY__POS_AGGREGATION:
				setPosAggregation((SingleLinePropertyInfo)newValue);
				return;
			case YammPackage.YPROPERTY__POS_QUALIFIED_NAME:
				setPosQualifiedName((SingleLinePropertyInfo)newValue);
				return;
			case YammPackage.YPROPERTY__OBSERVE:
				setObserve((Boolean)newValue);
				return;
			case YammPackage.YPROPERTY__INVARINAT:
				setInvarinat((String)newValue);
				return;
			case YammPackage.YPROPERTY__STATIC:
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
			case YammPackage.YPROPERTY__NAME:
				unsetName();
				return;
			case YammPackage.YPROPERTY__IS_ORDERED:
				setIsOrdered(IS_ORDERED_EDEFAULT);
				return;
			case YammPackage.YPROPERTY__IS_DERIVED:
				setIsDerived(IS_DERIVED_EDEFAULT);
				return;
			case YammPackage.YPROPERTY__IS_DERIVED_UNION:
				setIsDerivedUnion(IS_DERIVED_UNION_EDEFAULT);
				return;
			case YammPackage.YPROPERTY__ASSOCIATION:
				setAssociation(ASSOCIATION_EDEFAULT);
				return;
			case YammPackage.YPROPERTY__QUALIFIED_NAME:
				setQualifiedName(QUALIFIED_NAME_EDEFAULT);
				return;
			case YammPackage.YPROPERTY__IS_UNIQUE:
				setIsUnique(IS_UNIQUE_EDEFAULT);
				return;
			case YammPackage.YPROPERTY__LOWER:
				setLower(LOWER_EDEFAULT);
				return;
			case YammPackage.YPROPERTY__UPPER:
				setUpper(UPPER_EDEFAULT);
				return;
			case YammPackage.YPROPERTY__AGGREGATION:
				setAggregation(AGGREGATION_EDEFAULT);
				return;
			case YammPackage.YPROPERTY__DEFAULT_VALUE:
				setDefaultValue(DEFAULT_VALUE_EDEFAULT);
				return;
			case YammPackage.YPROPERTY__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case YammPackage.YPROPERTY__FEATURING_CLASSIFIER:
				getFeaturingClassifier().clear();
				return;
			case YammPackage.YPROPERTY__TYPE:
				setType((YType)null);
				return;
			case YammPackage.YPROPERTY__SUBSETTED_PROPERTY:
				getSubsettedProperty().clear();
				return;
			case YammPackage.YPROPERTY__OPPOSITE:
				setOpposite((YProperty)null);
				return;
			case YammPackage.YPROPERTY__OWNED_COMMENT:
				setOwnedComment((YComment)null);
				return;
			case YammPackage.YPROPERTY__OWNED_ELEMENT:
				getOwnedElement().clear();
				return;
			case YammPackage.YPROPERTY__CLAZZ:
				setClazz((YClass)null);
				return;
			case YammPackage.YPROPERTY__SIGNATURE:
				setSignature(SIGNATURE_EDEFAULT);
				return;
			case YammPackage.YPROPERTY__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case YammPackage.YPROPERTY__POS_OBJECT_ID:
				setPosObjectID((SingleLinePropertyInfo)null);
				return;
			case YammPackage.YPROPERTY__POS_NAME:
				setPosName((SingleLinePropertyInfo)null);
				return;
			case YammPackage.YPROPERTY__POS_ORDERED:
				setPosOrdered((SingleLinePropertyInfo)null);
				return;
			case YammPackage.YPROPERTY__POS_UNIQUE:
				setPosUnique((SingleLinePropertyInfo)null);
				return;
			case YammPackage.YPROPERTY__POS_LOWER:
				setPosLower((SingleLinePropertyInfo)null);
				return;
			case YammPackage.YPROPERTY__POS_UPPER:
				setPosUpper((SingleLinePropertyInfo)null);
				return;
			case YammPackage.YPROPERTY__POS_DEFAULT_VALUE:
				setPosDefaultValue((SingleLinePropertyInfo)null);
				return;
			case YammPackage.YPROPERTY__POS_TYPE:
				setPosType((SingleLinePropertyInfo)null);
				return;
			case YammPackage.YPROPERTY__POS_CLAZZ:
				setPosClazz((SingleLinePropertyInfo)null);
				return;
			case YammPackage.YPROPERTY__POS_DERIVED:
				setPosDerived((SingleLinePropertyInfo)null);
				return;
			case YammPackage.YPROPERTY__POS_DERIVED_UNION:
				setPosDerivedUnion((SingleLinePropertyInfo)null);
				return;
			case YammPackage.YPROPERTY__POS_ASSOCIATION:
				setPosAssociation((SingleLinePropertyInfo)null);
				return;
			case YammPackage.YPROPERTY__POS_VISIBILITY:
				setPosVisibility((SingleLinePropertyInfo)null);
				return;
			case YammPackage.YPROPERTY__POS_OPPOSITE:
				setPosOpposite((SingleLinePropertyInfo)null);
				return;
			case YammPackage.YPROPERTY__POS_AGGREGATION:
				setPosAggregation((SingleLinePropertyInfo)null);
				return;
			case YammPackage.YPROPERTY__POS_QUALIFIED_NAME:
				setPosQualifiedName((SingleLinePropertyInfo)null);
				return;
			case YammPackage.YPROPERTY__OBSERVE:
				setObserve(OBSERVE_EDEFAULT);
				return;
			case YammPackage.YPROPERTY__INVARINAT:
				setInvarinat(INVARINAT_EDEFAULT);
				return;
			case YammPackage.YPROPERTY__STATIC:
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
			case YammPackage.YPROPERTY__NAME:
				return isSetName();
			case YammPackage.YPROPERTY__IS_ORDERED:
				return isOrdered != IS_ORDERED_EDEFAULT;
			case YammPackage.YPROPERTY__IS_DERIVED:
				return isDerived != IS_DERIVED_EDEFAULT;
			case YammPackage.YPROPERTY__IS_DERIVED_UNION:
				return isDerivedUnion != IS_DERIVED_UNION_EDEFAULT;
			case YammPackage.YPROPERTY__ASSOCIATION:
				return association != ASSOCIATION_EDEFAULT;
			case YammPackage.YPROPERTY__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? qualifiedName != null : !QUALIFIED_NAME_EDEFAULT.equals(qualifiedName);
			case YammPackage.YPROPERTY__IS_UNIQUE:
				return isUnique != IS_UNIQUE_EDEFAULT;
			case YammPackage.YPROPERTY__LOWER:
				return lower != LOWER_EDEFAULT;
			case YammPackage.YPROPERTY__UPPER:
				return upper != UPPER_EDEFAULT;
			case YammPackage.YPROPERTY__AGGREGATION:
				return aggregation != AGGREGATION_EDEFAULT;
			case YammPackage.YPROPERTY__DEFAULT_VALUE:
				return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
			case YammPackage.YPROPERTY__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case YammPackage.YPROPERTY__FEATURING_CLASSIFIER:
				return featuringClassifier != null && !featuringClassifier.isEmpty();
			case YammPackage.YPROPERTY__TYPE:
				return type != null;
			case YammPackage.YPROPERTY__SUBSETTED_PROPERTY:
				return subsettedProperty != null && !subsettedProperty.isEmpty();
			case YammPackage.YPROPERTY__OPPOSITE:
				return opposite != null;
			case YammPackage.YPROPERTY__OWNED_COMMENT:
				return ownedComment != null;
			case YammPackage.YPROPERTY__OWNED_ELEMENT:
				return ownedElement != null && !ownedElement.isEmpty();
			case YammPackage.YPROPERTY__CLAZZ:
				return clazz != null;
			case YammPackage.YPROPERTY__SIGNATURE:
				return SIGNATURE_EDEFAULT == null ? signature != null : !SIGNATURE_EDEFAULT.equals(signature);
			case YammPackage.YPROPERTY__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case YammPackage.YPROPERTY__POS_OBJECT_ID:
				return posObjectID != null;
			case YammPackage.YPROPERTY__POS_NAME:
				return posName != null;
			case YammPackage.YPROPERTY__POS_ORDERED:
				return posOrdered != null;
			case YammPackage.YPROPERTY__POS_UNIQUE:
				return posUnique != null;
			case YammPackage.YPROPERTY__POS_LOWER:
				return posLower != null;
			case YammPackage.YPROPERTY__POS_UPPER:
				return posUpper != null;
			case YammPackage.YPROPERTY__POS_DEFAULT_VALUE:
				return posDefaultValue != null;
			case YammPackage.YPROPERTY__POS_TYPE:
				return posType != null;
			case YammPackage.YPROPERTY__POS_CLAZZ:
				return posClazz != null;
			case YammPackage.YPROPERTY__POS_DERIVED:
				return posDerived != null;
			case YammPackage.YPROPERTY__POS_DERIVED_UNION:
				return posDerivedUnion != null;
			case YammPackage.YPROPERTY__POS_ASSOCIATION:
				return posAssociation != null;
			case YammPackage.YPROPERTY__POS_VISIBILITY:
				return posVisibility != null;
			case YammPackage.YPROPERTY__POS_OPPOSITE:
				return posOpposite != null;
			case YammPackage.YPROPERTY__POS_AGGREGATION:
				return posAggregation != null;
			case YammPackage.YPROPERTY__POS_QUALIFIED_NAME:
				return posQualifiedName != null;
			case YammPackage.YPROPERTY__OBSERVE:
				return observe != OBSERVE_EDEFAULT;
			case YammPackage.YPROPERTY__INVARINAT:
				return INVARINAT_EDEFAULT == null ? invarinat != null : !INVARINAT_EDEFAULT.equals(invarinat);
			case YammPackage.YPROPERTY__STATIC:
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
				case YammPackage.YPROPERTY__NAME: return YammPackage.YNAMED_ELEMENT__NAME;
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
				case YammPackage.YNAMED_ELEMENT__NAME: return YammPackage.YPROPERTY__NAME;
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
		result.append(", invarinat: ");
		result.append(invarinat);
		result.append(", static: ");
		result.append(static_);
		result.append(')');
		return result.toString();
	}

} //YPropertyImpl
