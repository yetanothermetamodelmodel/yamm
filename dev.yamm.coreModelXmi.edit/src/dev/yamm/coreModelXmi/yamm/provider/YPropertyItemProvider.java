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
package dev.yamm.coreModelXmi.yamm.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import dev.yamm.coreModelXmi.yamm.YProperty;
import dev.yamm.coreModelXmi.yamm.YammFactory;
import dev.yamm.coreModelXmi.yamm.YammPackage;

/**
 * This is the item provider adapter for a {@link dev.yamm.coreModelXmi.yamm.YProperty} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class YPropertyItemProvider extends YElementItemProvider
{
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YPropertyItemProvider(AdapterFactory adapterFactory)
	{
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object)
	{
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addIsOrderedPropertyDescriptor(object);
			addIsDerivedPropertyDescriptor(object);
			addIsDerivedUnionPropertyDescriptor(object);
			addAssociationPropertyDescriptor(object);
			addQualifiedNamePropertyDescriptor(object);
			addIsUniquePropertyDescriptor(object);
			addLowerPropertyDescriptor(object);
			addUpperPropertyDescriptor(object);
			addAggregationPropertyDescriptor(object);
			addDefaultValuePropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addFeaturingClassifierPropertyDescriptor(object);
			addTypePropertyDescriptor(object);
			addSubsettedPropertyPropertyDescriptor(object);
			addOppositePropertyDescriptor(object);
			addClazzPropertyDescriptor(object);
			addSignaturePropertyDescriptor(object);
			addVisibilityPropertyDescriptor(object);
			addPosObjectIDPropertyDescriptor(object);
			addPosNamePropertyDescriptor(object);
			addPosOrderedPropertyDescriptor(object);
			addPosUniquePropertyDescriptor(object);
			addPosLowerPropertyDescriptor(object);
			addPosUpperPropertyDescriptor(object);
			addPosDefaultValuePropertyDescriptor(object);
			addPosTypePropertyDescriptor(object);
			addPosClazzPropertyDescriptor(object);
			addPosDerivedPropertyDescriptor(object);
			addPosDerivedUnionPropertyDescriptor(object);
			addPosAssociationPropertyDescriptor(object);
			addPosVisibilityPropertyDescriptor(object);
			addPosOppositePropertyDescriptor(object);
			addPosAggregationPropertyDescriptor(object);
			addPosQualifiedNamePropertyDescriptor(object);
			addObservePropertyDescriptor(object);
			addInvarinatPropertyDescriptor(object);
			addStaticPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YNamedElement_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YNamedElement_name_feature", "_UI_YNamedElement_type"),
				 YammPackage.Literals.YNAMED_ELEMENT__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Ordered feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsOrderedPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YProperty_isOrdered_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YProperty_isOrdered_feature", "_UI_YProperty_type"),
				 YammPackage.Literals.YPROPERTY__IS_ORDERED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Derived feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsDerivedPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YProperty_isDerived_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YProperty_isDerived_feature", "_UI_YProperty_type"),
				 YammPackage.Literals.YPROPERTY__IS_DERIVED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Derived Union feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsDerivedUnionPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YProperty_isDerivedUnion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YProperty_isDerivedUnion_feature", "_UI_YProperty_type"),
				 YammPackage.Literals.YPROPERTY__IS_DERIVED_UNION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Association feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAssociationPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YProperty_association_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YProperty_association_feature", "_UI_YProperty_type"),
				 YammPackage.Literals.YPROPERTY__ASSOCIATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Qualified Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addQualifiedNamePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YProperty_qualifiedName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YProperty_qualifiedName_feature", "_UI_YProperty_type"),
				 YammPackage.Literals.YPROPERTY__QUALIFIED_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Unique feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsUniquePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YProperty_isUnique_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YProperty_isUnique_feature", "_UI_YProperty_type"),
				 YammPackage.Literals.YPROPERTY__IS_UNIQUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Lower feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLowerPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YProperty_lower_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YProperty_lower_feature", "_UI_YProperty_type"),
				 YammPackage.Literals.YPROPERTY__LOWER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Upper feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUpperPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YProperty_upper_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YProperty_upper_feature", "_UI_YProperty_type"),
				 YammPackage.Literals.YPROPERTY__UPPER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Aggregation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAggregationPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YProperty_aggregation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YProperty_aggregation_feature", "_UI_YProperty_type"),
				 YammPackage.Literals.YPROPERTY__AGGREGATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultValuePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YProperty_defaultValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YProperty_defaultValue_feature", "_UI_YProperty_type"),
				 YammPackage.Literals.YPROPERTY__DEFAULT_VALUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YProperty_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YProperty_description_feature", "_UI_YProperty_type"),
				 YammPackage.Literals.YPROPERTY__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Featuring Classifier feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFeaturingClassifierPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YProperty_featuringClassifier_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YProperty_featuringClassifier_feature", "_UI_YProperty_type"),
				 YammPackage.Literals.YPROPERTY__FEATURING_CLASSIFIER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YProperty_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YProperty_type_feature", "_UI_YProperty_type"),
				 YammPackage.Literals.YPROPERTY__TYPE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Subsetted Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubsettedPropertyPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YProperty_subsettedProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YProperty_subsettedProperty_feature", "_UI_YProperty_type"),
				 YammPackage.Literals.YPROPERTY__SUBSETTED_PROPERTY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Opposite feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOppositePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YProperty_opposite_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YProperty_opposite_feature", "_UI_YProperty_type"),
				 YammPackage.Literals.YPROPERTY__OPPOSITE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Clazz feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClazzPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YProperty_clazz_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YProperty_clazz_feature", "_UI_YProperty_type"),
				 YammPackage.Literals.YPROPERTY__CLAZZ,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Signature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSignaturePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YProperty_signature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YProperty_signature_feature", "_UI_YProperty_type"),
				 YammPackage.Literals.YPROPERTY__SIGNATURE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Visibility feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVisibilityPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YProperty_visibility_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YProperty_visibility_feature", "_UI_YProperty_type"),
				 YammPackage.Literals.YPROPERTY__VISIBILITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pos Object ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPosObjectIDPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YProperty_posObjectID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YProperty_posObjectID_feature", "_UI_YProperty_type"),
				 YammPackage.Literals.YPROPERTY__POS_OBJECT_ID,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pos Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPosNamePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YProperty_posName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YProperty_posName_feature", "_UI_YProperty_type"),
				 YammPackage.Literals.YPROPERTY__POS_NAME,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pos Ordered feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPosOrderedPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YProperty_posOrdered_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YProperty_posOrdered_feature", "_UI_YProperty_type"),
				 YammPackage.Literals.YPROPERTY__POS_ORDERED,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pos Unique feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPosUniquePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YProperty_posUnique_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YProperty_posUnique_feature", "_UI_YProperty_type"),
				 YammPackage.Literals.YPROPERTY__POS_UNIQUE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pos Lower feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPosLowerPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YProperty_posLower_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YProperty_posLower_feature", "_UI_YProperty_type"),
				 YammPackage.Literals.YPROPERTY__POS_LOWER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pos Upper feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPosUpperPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YProperty_posUpper_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YProperty_posUpper_feature", "_UI_YProperty_type"),
				 YammPackage.Literals.YPROPERTY__POS_UPPER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pos Default Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPosDefaultValuePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YProperty_posDefaultValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YProperty_posDefaultValue_feature", "_UI_YProperty_type"),
				 YammPackage.Literals.YPROPERTY__POS_DEFAULT_VALUE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pos Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPosTypePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YProperty_posType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YProperty_posType_feature", "_UI_YProperty_type"),
				 YammPackage.Literals.YPROPERTY__POS_TYPE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pos Clazz feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPosClazzPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YProperty_posClazz_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YProperty_posClazz_feature", "_UI_YProperty_type"),
				 YammPackage.Literals.YPROPERTY__POS_CLAZZ,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pos Derived feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPosDerivedPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YProperty_posDerived_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YProperty_posDerived_feature", "_UI_YProperty_type"),
				 YammPackage.Literals.YPROPERTY__POS_DERIVED,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pos Derived Union feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPosDerivedUnionPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YProperty_posDerivedUnion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YProperty_posDerivedUnion_feature", "_UI_YProperty_type"),
				 YammPackage.Literals.YPROPERTY__POS_DERIVED_UNION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pos Association feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPosAssociationPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YProperty_posAssociation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YProperty_posAssociation_feature", "_UI_YProperty_type"),
				 YammPackage.Literals.YPROPERTY__POS_ASSOCIATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pos Visibility feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPosVisibilityPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YProperty_posVisibility_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YProperty_posVisibility_feature", "_UI_YProperty_type"),
				 YammPackage.Literals.YPROPERTY__POS_VISIBILITY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pos Opposite feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPosOppositePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YProperty_posOpposite_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YProperty_posOpposite_feature", "_UI_YProperty_type"),
				 YammPackage.Literals.YPROPERTY__POS_OPPOSITE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pos Aggregation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPosAggregationPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YProperty_posAggregation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YProperty_posAggregation_feature", "_UI_YProperty_type"),
				 YammPackage.Literals.YPROPERTY__POS_AGGREGATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pos Qualified Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPosQualifiedNamePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YProperty_posQualifiedName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YProperty_posQualifiedName_feature", "_UI_YProperty_type"),
				 YammPackage.Literals.YPROPERTY__POS_QUALIFIED_NAME,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Observe feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addObservePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YProperty_observe_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YProperty_observe_feature", "_UI_YProperty_type"),
				 YammPackage.Literals.YPROPERTY__OBSERVE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Invarinat feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInvarinatPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YProperty_invarinat_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YProperty_invarinat_feature", "_UI_YProperty_type"),
				 YammPackage.Literals.YPROPERTY__INVARINAT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Static feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStaticPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YProperty_static_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YProperty_static_feature", "_UI_YProperty_type"),
				 YammPackage.Literals.YPROPERTY__STATIC,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object)
	{
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(YammPackage.Literals.YPROPERTY__OWNED_COMMENT);
			childrenFeatures.add(YammPackage.Literals.YPROPERTY__OWNED_ELEMENT);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child)
	{
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns YProperty.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/YProperty"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object)
	{
		String label = ((YProperty)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_YProperty_type") :
			getString("_UI_YProperty_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification)
	{
		updateChildren(notification);

		switch (notification.getFeatureID(YProperty.class)) {
			case YammPackage.YPROPERTY__NAME:
			case YammPackage.YPROPERTY__IS_ORDERED:
			case YammPackage.YPROPERTY__IS_DERIVED:
			case YammPackage.YPROPERTY__IS_DERIVED_UNION:
			case YammPackage.YPROPERTY__ASSOCIATION:
			case YammPackage.YPROPERTY__QUALIFIED_NAME:
			case YammPackage.YPROPERTY__IS_UNIQUE:
			case YammPackage.YPROPERTY__LOWER:
			case YammPackage.YPROPERTY__UPPER:
			case YammPackage.YPROPERTY__AGGREGATION:
			case YammPackage.YPROPERTY__DEFAULT_VALUE:
			case YammPackage.YPROPERTY__DESCRIPTION:
			case YammPackage.YPROPERTY__SIGNATURE:
			case YammPackage.YPROPERTY__VISIBILITY:
			case YammPackage.YPROPERTY__OBSERVE:
			case YammPackage.YPROPERTY__INVARINAT:
			case YammPackage.YPROPERTY__STATIC:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case YammPackage.YPROPERTY__OWNED_COMMENT:
			case YammPackage.YPROPERTY__OWNED_ELEMENT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
	{
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YPROPERTY__OWNED_COMMENT,
				 YammFactory.eINSTANCE.createYComment()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YPROPERTY__OWNED_ELEMENT,
				 YammFactory.eINSTANCE.createYElement()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YPROPERTY__OWNED_ELEMENT,
				 YammFactory.eINSTANCE.createYClass()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YPROPERTY__OWNED_ELEMENT,
				 YammFactory.eINSTANCE.createYComment()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YPROPERTY__OWNED_ELEMENT,
				 YammFactory.eINSTANCE.createYConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YPROPERTY__OWNED_ELEMENT,
				 YammFactory.eINSTANCE.createYElementImport()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YPROPERTY__OWNED_ELEMENT,
				 YammFactory.eINSTANCE.createYEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YPROPERTY__OWNED_ELEMENT,
				 YammFactory.eINSTANCE.createYEnumerationLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YPROPERTY__OWNED_ELEMENT,
				 YammFactory.eINSTANCE.createYOperation()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YPROPERTY__OWNED_ELEMENT,
				 YammFactory.eINSTANCE.createYPackage()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YPROPERTY__OWNED_ELEMENT,
				 YammFactory.eINSTANCE.createYPackageImport()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YPROPERTY__OWNED_ELEMENT,
				 YammFactory.eINSTANCE.createYParameter()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YPROPERTY__OWNED_ELEMENT,
				 YammFactory.eINSTANCE.createYPrimitiveType()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YPROPERTY__OWNED_ELEMENT,
				 YammFactory.eINSTANCE.createYProperty()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YPROPERTY__OWNED_ELEMENT,
				 YammFactory.eINSTANCE.createYStateMachine()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YPROPERTY__OWNED_ELEMENT,
				 YammFactory.eINSTANCE.createYTransition()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YPROPERTY__OWNED_ELEMENT,
				 YammFactory.eINSTANCE.createYTrAttachment()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YPROPERTY__OWNED_ELEMENT,
				 YammFactory.eINSTANCE.createYPseudostate()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YPROPERTY__OWNED_ELEMENT,
				 YammFactory.eINSTANCE.createYFinalState()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YPROPERTY__OWNED_ELEMENT,
				 YammFactory.eINSTANCE.createYState()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection)
	{
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == YammPackage.Literals.YPROPERTY__OWNED_COMMENT ||
			childFeature == YammPackage.Literals.YPROPERTY__OWNED_ELEMENT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
