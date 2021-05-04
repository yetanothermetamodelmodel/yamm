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
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.xtext.common.types.TypesFactory;

import org.eclipse.xtext.xbase.XbaseFactory;

import dev.yamm.coreModelXmi.yamm.YModel;
import dev.yamm.coreModelXmi.yamm.YammFactory;
import dev.yamm.coreModelXmi.yamm.YammPackage;

/**
 * This is the item provider adapter for a {@link dev.yamm.coreModelXmi.yamm.YModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class YModelItemProvider extends YObjectItemProvider
{
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YModelItemProvider(AdapterFactory adapterFactory)
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

			addPosObjectIDPropertyDescriptor(object);
			addInsertClassPropertyDescriptor(object);
			addInsertEnumPropertyDescriptor(object);
			addInsertPackagePropertyDescriptor(object);
			addTypesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_YModel_posObjectID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YModel_posObjectID_feature", "_UI_YModel_type"),
				 YammPackage.Literals.YMODEL__POS_OBJECT_ID,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Insert Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInsertClassPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YModel_insertClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YModel_insertClass_feature", "_UI_YModel_type"),
				 YammPackage.Literals.YMODEL__INSERT_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Insert Enum feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInsertEnumPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YModel_insertEnum_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YModel_insertEnum_feature", "_UI_YModel_type"),
				 YammPackage.Literals.YMODEL__INSERT_ENUM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Insert Package feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInsertPackagePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YModel_insertPackage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YModel_insertPackage_feature", "_UI_YModel_type"),
				 YammPackage.Literals.YMODEL__INSERT_PACKAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Types feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypesPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YModel_types_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YModel_types_feature", "_UI_YModel_type"),
				 YammPackage.Literals.YMODEL__TYPES,
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(YammPackage.Literals.YMODEL__CLAZZ);
			childrenFeatures.add(YammPackage.Literals.YMODEL__ENUMERATIONS);
			childrenFeatures.add(YammPackage.Literals.YMODEL__PACKAGES);
			childrenFeatures.add(YammPackage.Literals.YMODEL__OBJECTS);
			childrenFeatures.add(YammPackage.Literals.YMODEL__SHARED_EDGES);
			childrenFeatures.add(YammPackage.Literals.YMODEL__COMPOSITE_EDGES);
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
	 * This returns YModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/YModel"));
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
		String label = ((YModel)object).getObjectID();
		return label == null || label.length() == 0 ?
			getString("_UI_YModel_type") :
			getString("_UI_YModel_type") + " " + label;
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

		switch (notification.getFeatureID(YModel.class)) {
			case YammPackage.YMODEL__INSERT_CLASS:
			case YammPackage.YMODEL__INSERT_ENUM:
			case YammPackage.YMODEL__INSERT_PACKAGE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case YammPackage.YMODEL__CLAZZ:
			case YammPackage.YMODEL__ENUMERATIONS:
			case YammPackage.YMODEL__PACKAGES:
			case YammPackage.YMODEL__OBJECTS:
			case YammPackage.YMODEL__SHARED_EDGES:
			case YammPackage.YMODEL__COMPOSITE_EDGES:
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
				(YammPackage.Literals.YMODEL__CLAZZ,
				 YammFactory.eINSTANCE.createYClass()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__ENUMERATIONS,
				 YammFactory.eINSTANCE.createYEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__PACKAGES,
				 YammFactory.eINSTANCE.createYPackage()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 YammFactory.eINSTANCE.createYObject()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 YammFactory.eINSTANCE.createYElement()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 YammFactory.eINSTANCE.createYClass()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 YammFactory.eINSTANCE.createYClassifier()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 YammFactory.eINSTANCE.createYComment()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 YammFactory.eINSTANCE.createYConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 YammFactory.eINSTANCE.createYDataType()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 YammFactory.eINSTANCE.createYElementImport()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 YammFactory.eINSTANCE.createYEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 YammFactory.eINSTANCE.createYEnumerationLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 YammFactory.eINSTANCE.createYFeature()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 YammFactory.eINSTANCE.createYNamedElement()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 YammFactory.eINSTANCE.createYNamespace()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 YammFactory.eINSTANCE.createYOperation()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 YammFactory.eINSTANCE.createYPackage()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 YammFactory.eINSTANCE.createYPackageableElement()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 YammFactory.eINSTANCE.createYPackageImport()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 YammFactory.eINSTANCE.createYParameter()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 YammFactory.eINSTANCE.createYPrimitiveType()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 YammFactory.eINSTANCE.createYProperty()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 YammFactory.eINSTANCE.createYType()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 YammFactory.eINSTANCE.createYStateMachine()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 YammFactory.eINSTANCE.createYTransition()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 YammFactory.eINSTANCE.createYTrAttachment()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 YammFactory.eINSTANCE.createYEffect()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 YammFactory.eINSTANCE.createYVertex()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 YammFactory.eINSTANCE.createYPseudostate()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 YammFactory.eINSTANCE.createYFinalState()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 YammFactory.eINSTANCE.createYState()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 YammFactory.eINSTANCE.createYModel()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 YammFactory.eINSTANCE.createYSharedEdge()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 YammFactory.eINSTANCE.createYCompositeEdge()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 YammFactory.eINSTANCE.createYStateMachineHandler()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 YammFactory.eINSTANCE.createYGlobalStateMachine()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 YammFactory.eINSTANCE.createYCreateInstanceExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 YammFactory.eINSTANCE.createYPrintExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 YammFactory.eINSTANCE.createYSetReturnValue()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 YammFactory.eINSTANCE.createYGetInstancesOfExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 YammFactory.eINSTANCE.createYMemberFeatureCall()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 YammFactory.eINSTANCE.createYFeatureCall()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 YammFactory.eINSTANCE.createYGetObjectManagement()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 YammFactory.eINSTANCE.createYGetLayerInformation()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 YammFactory.eINSTANCE.createYColorDFAObject()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 YammFactory.eINSTANCE.createYGetInstances()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 YammFactory.eINSTANCE.createYCountFinalStates()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 YammFactory.eINSTANCE.createYCountInitialStates()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 YammFactory.eINSTANCE.createYCountStates()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 YammFactory.eINSTANCE.createYSetAbsoluteNodePropability()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 YammFactory.eINSTANCE.createYCountReachableStates()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 YammFactory.eINSTANCE.createYCountInValidTransitions()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 YammFactory.eINSTANCE.createYSetPopulationSize()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 YammFactory.eINSTANCE.createYLoadModel()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 YammFactory.eINSTANCE.createDslInfo()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 YammFactory.eINSTANCE.createFeatureInfo()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 YammFactory.eINSTANCE.createSingleLinePropertyInfo()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 YammFactory.eINSTANCE.createGuardInfo()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 YammFactory.eINSTANCE.createEffectInfo()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 YammFactory.eINSTANCE.createContainmentInfo()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 YammFactory.eINSTANCE.create(YammPackage.Literals.ESTRUCTURAL_FEATURE_TO_FEATURE_INFO_MAP)));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 YammFactory.eINSTANCE.createLine()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 YammFactory.eINSTANCE.createYStructure()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 YammFactory.eINSTANCE.createYInternal()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 YammFactory.eINSTANCE.createYTimeStep()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 YammFactory.eINSTANCE.createYObserverAddValue()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 EcoreFactory.eINSTANCE.createEAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 EcoreFactory.eINSTANCE.createEAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 EcoreFactory.eINSTANCE.createEClass()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 EcoreFactory.eINSTANCE.createEDataType()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 EcoreFactory.eINSTANCE.createEEnum()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 EcoreFactory.eINSTANCE.createEEnumLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 EcoreFactory.eINSTANCE.createEFactory()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 EcoreFactory.eINSTANCE.createEObject()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 EcoreFactory.eINSTANCE.createEOperation()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 EcoreFactory.eINSTANCE.createEPackage()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 EcoreFactory.eINSTANCE.createEParameter()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 EcoreFactory.eINSTANCE.createEReference()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 EcoreFactory.eINSTANCE.create(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY)));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 EcoreFactory.eINSTANCE.createEGenericType()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 EcoreFactory.eINSTANCE.createETypeParameter()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 TypesFactory.eINSTANCE.createJvmVoid()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 TypesFactory.eINSTANCE.createJvmPrimitiveType()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 TypesFactory.eINSTANCE.createJvmArrayType()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 TypesFactory.eINSTANCE.createJvmTypeParameter()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 TypesFactory.eINSTANCE.createJvmUpperBound()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 TypesFactory.eINSTANCE.createJvmLowerBound()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 TypesFactory.eINSTANCE.createJvmAnnotationType()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 TypesFactory.eINSTANCE.createJvmEnumerationType()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 TypesFactory.eINSTANCE.createJvmField()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 TypesFactory.eINSTANCE.createJvmEnumerationLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 TypesFactory.eINSTANCE.createJvmGenericType()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 TypesFactory.eINSTANCE.createJvmParameterizedTypeReference()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 TypesFactory.eINSTANCE.createJvmGenericArrayTypeReference()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 TypesFactory.eINSTANCE.createJvmWildcardTypeReference()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 TypesFactory.eINSTANCE.createJvmAnyTypeReference()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 TypesFactory.eINSTANCE.createJvmMultiTypeReference()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 TypesFactory.eINSTANCE.createJvmConstructor()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 TypesFactory.eINSTANCE.createJvmOperation()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 TypesFactory.eINSTANCE.createJvmFormalParameter()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 TypesFactory.eINSTANCE.createJvmAnnotationReference()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 TypesFactory.eINSTANCE.createJvmIntAnnotationValue()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 TypesFactory.eINSTANCE.createJvmBooleanAnnotationValue()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 TypesFactory.eINSTANCE.createJvmByteAnnotationValue()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 TypesFactory.eINSTANCE.createJvmShortAnnotationValue()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 TypesFactory.eINSTANCE.createJvmLongAnnotationValue()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 TypesFactory.eINSTANCE.createJvmDoubleAnnotationValue()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 TypesFactory.eINSTANCE.createJvmFloatAnnotationValue()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 TypesFactory.eINSTANCE.createJvmCharAnnotationValue()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 TypesFactory.eINSTANCE.createJvmStringAnnotationValue()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 TypesFactory.eINSTANCE.createJvmTypeAnnotationValue()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 TypesFactory.eINSTANCE.createJvmAnnotationAnnotationValue()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 TypesFactory.eINSTANCE.createJvmEnumAnnotationValue()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 TypesFactory.eINSTANCE.createJvmDelegateTypeReference()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 TypesFactory.eINSTANCE.createJvmSynonymTypeReference()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 TypesFactory.eINSTANCE.createJvmUnknownTypeReference()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 TypesFactory.eINSTANCE.createJvmCustomAnnotationValue()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 TypesFactory.eINSTANCE.createJvmInnerTypeReference()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 XbaseFactory.eINSTANCE.createXIfExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 XbaseFactory.eINSTANCE.createXSwitchExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 XbaseFactory.eINSTANCE.createXCasePart()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 XbaseFactory.eINSTANCE.createXBlockExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 XbaseFactory.eINSTANCE.createXVariableDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 XbaseFactory.eINSTANCE.createXMemberFeatureCall()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 XbaseFactory.eINSTANCE.createXFeatureCall()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 XbaseFactory.eINSTANCE.createXConstructorCall()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 XbaseFactory.eINSTANCE.createXBooleanLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 XbaseFactory.eINSTANCE.createXNullLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 XbaseFactory.eINSTANCE.createXNumberLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 XbaseFactory.eINSTANCE.createXStringLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 XbaseFactory.eINSTANCE.createXListLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 XbaseFactory.eINSTANCE.createXSetLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 XbaseFactory.eINSTANCE.createXClosure()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 XbaseFactory.eINSTANCE.createXCastedExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 XbaseFactory.eINSTANCE.createXBinaryOperation()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 XbaseFactory.eINSTANCE.createXUnaryOperation()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 XbaseFactory.eINSTANCE.createXPostfixOperation()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 XbaseFactory.eINSTANCE.createXForLoopExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 XbaseFactory.eINSTANCE.createXBasicForLoopExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 XbaseFactory.eINSTANCE.createXDoWhileExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 XbaseFactory.eINSTANCE.createXWhileExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 XbaseFactory.eINSTANCE.createXTypeLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 XbaseFactory.eINSTANCE.createXInstanceOfExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 XbaseFactory.eINSTANCE.createXThrowExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 XbaseFactory.eINSTANCE.createXTryCatchFinallyExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 XbaseFactory.eINSTANCE.createXCatchClause()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 XbaseFactory.eINSTANCE.createXAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 XbaseFactory.eINSTANCE.createXReturnExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__OBJECTS,
				 XbaseFactory.eINSTANCE.createXSynchronizedExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__SHARED_EDGES,
				 YammFactory.eINSTANCE.createYSharedEdge()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YMODEL__COMPOSITE_EDGES,
				 YammFactory.eINSTANCE.createYCompositeEdge()));
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
			childFeature == YammPackage.Literals.YMODEL__CLAZZ ||
			childFeature == YammPackage.Literals.YMODEL__OBJECTS ||
			childFeature == YammPackage.Literals.YMODEL__ENUMERATIONS ||
			childFeature == YammPackage.Literals.YMODEL__PACKAGES ||
			childFeature == YammPackage.Literals.YMODEL__SHARED_EDGES ||
			childFeature == YammPackage.Literals.YMODEL__COMPOSITE_EDGES;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
