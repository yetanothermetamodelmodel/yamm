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
package dev.yamm.coreModelDiagram.yammDiagram.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import dev.yamm.coreModelDiagram.yammDiagram.YStateMachine;
import dev.yamm.coreModelDiagram.yammDiagram.YammDiagramFactory;
import dev.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage;

/**
 * This is the item provider adapter for a {@link dev.yamm.coreModelDiagram.yammDiagram.YStateMachine} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class YStateMachineItemProvider extends YElementItemProvider
{
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YStateMachineItemProvider(AdapterFactory adapterFactory)
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
			addInitialActivePropertyDescriptor(object);
			addDesInitializerPropertyDescriptor(object);
			addQualifiedNamePropertyDescriptor(object);
			addRtcPropertyDescriptor(object);
			addMaxEffectsToBeProcessedPropertyDescriptor(object);
			addCalledOperationPropertyDescriptor(object);
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
				 YammDiagramPackage.Literals.YNAMED_ELEMENT__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Initial Active feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInitialActivePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YStateMachine_initialActive_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YStateMachine_initialActive_feature", "_UI_YStateMachine_type"),
				 YammDiagramPackage.Literals.YSTATE_MACHINE__INITIAL_ACTIVE,
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
				 getString("_UI_YStateMachine_qualifiedName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YStateMachine_qualifiedName_feature", "_UI_YStateMachine_type"),
				 YammDiagramPackage.Literals.YSTATE_MACHINE__QUALIFIED_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rtc feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRtcPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YStateMachine_rtc_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YStateMachine_rtc_feature", "_UI_YStateMachine_type"),
				 YammDiagramPackage.Literals.YSTATE_MACHINE__RTC,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Effects To Be Processed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxEffectsToBeProcessedPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YStateMachine_maxEffectsToBeProcessed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YStateMachine_maxEffectsToBeProcessed_feature", "_UI_YStateMachine_type"),
				 YammDiagramPackage.Literals.YSTATE_MACHINE__MAX_EFFECTS_TO_BE_PROCESSED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Called Operation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCalledOperationPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YStateMachine_calledOperation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YStateMachine_calledOperation_feature", "_UI_YStateMachine_type"),
				 YammDiagramPackage.Literals.YSTATE_MACHINE__CALLED_OPERATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Des Initializer feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDesInitializerPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YStateMachine_desInitializer_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YStateMachine_desInitializer_feature", "_UI_YStateMachine_type"),
				 YammDiagramPackage.Literals.YSTATE_MACHINE__DES_INITIALIZER,
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
			childrenFeatures.add(YammDiagramPackage.Literals.YSTATE_MACHINE__OWNED_COMMENT);
			childrenFeatures.add(YammDiagramPackage.Literals.YSTATE_MACHINE__OWNED_ELEMENT);
			childrenFeatures.add(YammDiagramPackage.Literals.YSTATE_MACHINE__TRANSITION);
			childrenFeatures.add(YammDiagramPackage.Literals.YSTATE_MACHINE__SUBVERTEX);
			childrenFeatures.add(YammDiagramPackage.Literals.YSTATE_MACHINE__TR_ATTACH);
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
	 * This returns YStateMachine.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/YStateMachine"));
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
		String label = ((YStateMachine)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_YStateMachine_type") :
			getString("_UI_YStateMachine_type") + " " + label;
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

		switch (notification.getFeatureID(YStateMachine.class)) {
			case YammDiagramPackage.YSTATE_MACHINE__NAME:
			case YammDiagramPackage.YSTATE_MACHINE__INITIAL_ACTIVE:
			case YammDiagramPackage.YSTATE_MACHINE__DES_INITIALIZER:
			case YammDiagramPackage.YSTATE_MACHINE__QUALIFIED_NAME:
			case YammDiagramPackage.YSTATE_MACHINE__RTC:
			case YammDiagramPackage.YSTATE_MACHINE__MAX_EFFECTS_TO_BE_PROCESSED:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case YammDiagramPackage.YSTATE_MACHINE__OWNED_COMMENT:
			case YammDiagramPackage.YSTATE_MACHINE__OWNED_ELEMENT:
			case YammDiagramPackage.YSTATE_MACHINE__TRANSITION:
			case YammDiagramPackage.YSTATE_MACHINE__SUBVERTEX:
			case YammDiagramPackage.YSTATE_MACHINE__TR_ATTACH:
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
				(YammDiagramPackage.Literals.YSTATE_MACHINE__OWNED_COMMENT,
				 YammDiagramFactory.eINSTANCE.createYComment()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YSTATE_MACHINE__OWNED_ELEMENT,
				 YammDiagramFactory.eINSTANCE.createYElement()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YSTATE_MACHINE__OWNED_ELEMENT,
				 YammDiagramFactory.eINSTANCE.createYClass()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YSTATE_MACHINE__OWNED_ELEMENT,
				 YammDiagramFactory.eINSTANCE.createYComment()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YSTATE_MACHINE__OWNED_ELEMENT,
				 YammDiagramFactory.eINSTANCE.createYConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YSTATE_MACHINE__OWNED_ELEMENT,
				 YammDiagramFactory.eINSTANCE.createYElementImport()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YSTATE_MACHINE__OWNED_ELEMENT,
				 YammDiagramFactory.eINSTANCE.createYEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YSTATE_MACHINE__OWNED_ELEMENT,
				 YammDiagramFactory.eINSTANCE.createYEnumerationLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YSTATE_MACHINE__OWNED_ELEMENT,
				 YammDiagramFactory.eINSTANCE.createYOperation()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YSTATE_MACHINE__OWNED_ELEMENT,
				 YammDiagramFactory.eINSTANCE.createYPackage()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YSTATE_MACHINE__OWNED_ELEMENT,
				 YammDiagramFactory.eINSTANCE.createYPackageImport()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YSTATE_MACHINE__OWNED_ELEMENT,
				 YammDiagramFactory.eINSTANCE.createYParameter()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YSTATE_MACHINE__OWNED_ELEMENT,
				 YammDiagramFactory.eINSTANCE.createYPrimitiveType()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YSTATE_MACHINE__OWNED_ELEMENT,
				 YammDiagramFactory.eINSTANCE.createYProperty()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YSTATE_MACHINE__OWNED_ELEMENT,
				 YammDiagramFactory.eINSTANCE.createYStateMachine()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YSTATE_MACHINE__OWNED_ELEMENT,
				 YammDiagramFactory.eINSTANCE.createYTransition()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YSTATE_MACHINE__OWNED_ELEMENT,
				 YammDiagramFactory.eINSTANCE.createYTrAttachment()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YSTATE_MACHINE__OWNED_ELEMENT,
				 YammDiagramFactory.eINSTANCE.createYPseudostate()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YSTATE_MACHINE__OWNED_ELEMENT,
				 YammDiagramFactory.eINSTANCE.createYFinalState()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YSTATE_MACHINE__OWNED_ELEMENT,
				 YammDiagramFactory.eINSTANCE.createYState()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YSTATE_MACHINE__TRANSITION,
				 YammDiagramFactory.eINSTANCE.createYTransition()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YSTATE_MACHINE__SUBVERTEX,
				 YammDiagramFactory.eINSTANCE.createYVertex()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YSTATE_MACHINE__SUBVERTEX,
				 YammDiagramFactory.eINSTANCE.createYPseudostate()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YSTATE_MACHINE__SUBVERTEX,
				 YammDiagramFactory.eINSTANCE.createYFinalState()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YSTATE_MACHINE__SUBVERTEX,
				 YammDiagramFactory.eINSTANCE.createYState()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YSTATE_MACHINE__TR_ATTACH,
				 YammDiagramFactory.eINSTANCE.createYTrAttachment()));
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
			childFeature == YammDiagramPackage.Literals.YSTATE_MACHINE__OWNED_COMMENT ||
			childFeature == YammDiagramPackage.Literals.YSTATE_MACHINE__OWNED_ELEMENT ||
			childFeature == YammDiagramPackage.Literals.YSTATE_MACHINE__TRANSITION ||
			childFeature == YammDiagramPackage.Literals.YSTATE_MACHINE__TR_ATTACH ||
			childFeature == YammDiagramPackage.Literals.YSTATE_MACHINE__SUBVERTEX;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
