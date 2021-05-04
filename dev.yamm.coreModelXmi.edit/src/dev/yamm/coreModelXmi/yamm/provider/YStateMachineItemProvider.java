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

import dev.yamm.coreModelXmi.yamm.YStateMachine;
import dev.yamm.coreModelXmi.yamm.YammFactory;
import dev.yamm.coreModelXmi.yamm.YammPackage;

/**
 * This is the item provider adapter for a {@link dev.yamm.coreModelXmi.yamm.YStateMachine} object.
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
			addQualifiedNamePropertyDescriptor(object);
			addRtcPropertyDescriptor(object);
			addMaxEffectsToBeProcessedPropertyDescriptor(object);
			addCalledOperationPropertyDescriptor(object);
			addPosObjectIDPropertyDescriptor(object);
			addPosNamePropertyDescriptor(object);
			addPosQualifiedNamePropertyDescriptor(object);
			addPosInitialActivePropertyDescriptor(object);
			addPosRtcPropertyDescriptor(object);
			addPosMaxEffectsToBeProcessedPropertyDescriptor(object);
			addInsertLineTransitionPropertyDescriptor(object);
			addInsertLineVertexPropertyDescriptor(object);
			addInsertLineAttachmentPropertyDescriptor(object);
			addDesInitializerPropertyDescriptor(object);
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
				 YammPackage.Literals.YSTATE_MACHINE__INITIAL_ACTIVE,
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
				 YammPackage.Literals.YSTATE_MACHINE__QUALIFIED_NAME,
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
				 YammPackage.Literals.YSTATE_MACHINE__RTC,
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
				 YammPackage.Literals.YSTATE_MACHINE__MAX_EFFECTS_TO_BE_PROCESSED,
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
				 YammPackage.Literals.YSTATE_MACHINE__CALLED_OPERATION,
				 true,
				 false,
				 true,
				 null,
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
				 getString("_UI_YStateMachine_posObjectID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YStateMachine_posObjectID_feature", "_UI_YStateMachine_type"),
				 YammPackage.Literals.YSTATE_MACHINE__POS_OBJECT_ID,
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
				 getString("_UI_YStateMachine_posName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YStateMachine_posName_feature", "_UI_YStateMachine_type"),
				 YammPackage.Literals.YSTATE_MACHINE__POS_NAME,
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
				 getString("_UI_YStateMachine_posQualifiedName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YStateMachine_posQualifiedName_feature", "_UI_YStateMachine_type"),
				 YammPackage.Literals.YSTATE_MACHINE__POS_QUALIFIED_NAME,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pos Initial Active feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPosInitialActivePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YStateMachine_posInitialActive_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YStateMachine_posInitialActive_feature", "_UI_YStateMachine_type"),
				 YammPackage.Literals.YSTATE_MACHINE__POS_INITIAL_ACTIVE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pos Rtc feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPosRtcPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YStateMachine_posRtc_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YStateMachine_posRtc_feature", "_UI_YStateMachine_type"),
				 YammPackage.Literals.YSTATE_MACHINE__POS_RTC,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pos Max Effects To Be Processed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPosMaxEffectsToBeProcessedPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YStateMachine_posMaxEffectsToBeProcessed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YStateMachine_posMaxEffectsToBeProcessed_feature", "_UI_YStateMachine_type"),
				 YammPackage.Literals.YSTATE_MACHINE__POS_MAX_EFFECTS_TO_BE_PROCESSED,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Insert Line Transition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInsertLineTransitionPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YStateMachine_insertLineTransition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YStateMachine_insertLineTransition_feature", "_UI_YStateMachine_type"),
				 YammPackage.Literals.YSTATE_MACHINE__INSERT_LINE_TRANSITION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Insert Line Vertex feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInsertLineVertexPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YStateMachine_insertLineVertex_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YStateMachine_insertLineVertex_feature", "_UI_YStateMachine_type"),
				 YammPackage.Literals.YSTATE_MACHINE__INSERT_LINE_VERTEX,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Insert Line Attachment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInsertLineAttachmentPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YStateMachine_insertLineAttachment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YStateMachine_insertLineAttachment_feature", "_UI_YStateMachine_type"),
				 YammPackage.Literals.YSTATE_MACHINE__INSERT_LINE_ATTACHMENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
				 YammPackage.Literals.YSTATE_MACHINE__DES_INITIALIZER,
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
			childrenFeatures.add(YammPackage.Literals.YSTATE_MACHINE__OWNED_COMMENT);
			childrenFeatures.add(YammPackage.Literals.YSTATE_MACHINE__OWNED_ELEMENT);
			childrenFeatures.add(YammPackage.Literals.YSTATE_MACHINE__TRANSITION);
			childrenFeatures.add(YammPackage.Literals.YSTATE_MACHINE__SUBVERTEX);
			childrenFeatures.add(YammPackage.Literals.YSTATE_MACHINE__TR_ATTACH);
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
			case YammPackage.YSTATE_MACHINE__NAME:
			case YammPackage.YSTATE_MACHINE__INITIAL_ACTIVE:
			case YammPackage.YSTATE_MACHINE__QUALIFIED_NAME:
			case YammPackage.YSTATE_MACHINE__RTC:
			case YammPackage.YSTATE_MACHINE__MAX_EFFECTS_TO_BE_PROCESSED:
			case YammPackage.YSTATE_MACHINE__INSERT_LINE_TRANSITION:
			case YammPackage.YSTATE_MACHINE__INSERT_LINE_VERTEX:
			case YammPackage.YSTATE_MACHINE__INSERT_LINE_ATTACHMENT:
			case YammPackage.YSTATE_MACHINE__DES_INITIALIZER:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case YammPackage.YSTATE_MACHINE__OWNED_COMMENT:
			case YammPackage.YSTATE_MACHINE__OWNED_ELEMENT:
			case YammPackage.YSTATE_MACHINE__TRANSITION:
			case YammPackage.YSTATE_MACHINE__SUBVERTEX:
			case YammPackage.YSTATE_MACHINE__TR_ATTACH:
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
				(YammPackage.Literals.YSTATE_MACHINE__OWNED_COMMENT,
				 YammFactory.eINSTANCE.createYComment()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YSTATE_MACHINE__OWNED_ELEMENT,
				 YammFactory.eINSTANCE.createYElement()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YSTATE_MACHINE__OWNED_ELEMENT,
				 YammFactory.eINSTANCE.createYClass()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YSTATE_MACHINE__OWNED_ELEMENT,
				 YammFactory.eINSTANCE.createYComment()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YSTATE_MACHINE__OWNED_ELEMENT,
				 YammFactory.eINSTANCE.createYConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YSTATE_MACHINE__OWNED_ELEMENT,
				 YammFactory.eINSTANCE.createYElementImport()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YSTATE_MACHINE__OWNED_ELEMENT,
				 YammFactory.eINSTANCE.createYEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YSTATE_MACHINE__OWNED_ELEMENT,
				 YammFactory.eINSTANCE.createYEnumerationLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YSTATE_MACHINE__OWNED_ELEMENT,
				 YammFactory.eINSTANCE.createYOperation()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YSTATE_MACHINE__OWNED_ELEMENT,
				 YammFactory.eINSTANCE.createYPackage()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YSTATE_MACHINE__OWNED_ELEMENT,
				 YammFactory.eINSTANCE.createYPackageImport()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YSTATE_MACHINE__OWNED_ELEMENT,
				 YammFactory.eINSTANCE.createYParameter()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YSTATE_MACHINE__OWNED_ELEMENT,
				 YammFactory.eINSTANCE.createYPrimitiveType()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YSTATE_MACHINE__OWNED_ELEMENT,
				 YammFactory.eINSTANCE.createYProperty()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YSTATE_MACHINE__OWNED_ELEMENT,
				 YammFactory.eINSTANCE.createYStateMachine()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YSTATE_MACHINE__OWNED_ELEMENT,
				 YammFactory.eINSTANCE.createYTransition()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YSTATE_MACHINE__OWNED_ELEMENT,
				 YammFactory.eINSTANCE.createYTrAttachment()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YSTATE_MACHINE__OWNED_ELEMENT,
				 YammFactory.eINSTANCE.createYPseudostate()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YSTATE_MACHINE__OWNED_ELEMENT,
				 YammFactory.eINSTANCE.createYFinalState()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YSTATE_MACHINE__OWNED_ELEMENT,
				 YammFactory.eINSTANCE.createYState()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YSTATE_MACHINE__TRANSITION,
				 YammFactory.eINSTANCE.createYTransition()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YSTATE_MACHINE__SUBVERTEX,
				 YammFactory.eINSTANCE.createYVertex()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YSTATE_MACHINE__SUBVERTEX,
				 YammFactory.eINSTANCE.createYPseudostate()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YSTATE_MACHINE__SUBVERTEX,
				 YammFactory.eINSTANCE.createYFinalState()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YSTATE_MACHINE__SUBVERTEX,
				 YammFactory.eINSTANCE.createYState()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YSTATE_MACHINE__TR_ATTACH,
				 YammFactory.eINSTANCE.createYTrAttachment()));
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
			childFeature == YammPackage.Literals.YSTATE_MACHINE__OWNED_COMMENT ||
			childFeature == YammPackage.Literals.YSTATE_MACHINE__OWNED_ELEMENT ||
			childFeature == YammPackage.Literals.YSTATE_MACHINE__TRANSITION ||
			childFeature == YammPackage.Literals.YSTATE_MACHINE__TR_ATTACH ||
			childFeature == YammPackage.Literals.YSTATE_MACHINE__SUBVERTEX;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
