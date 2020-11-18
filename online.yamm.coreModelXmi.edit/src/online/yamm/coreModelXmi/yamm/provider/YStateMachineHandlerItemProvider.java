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
package online.yamm.coreModelXmi.yamm.provider;


import java.util.Collection;
import java.util.List;

import online.yamm.coreModelXmi.yamm.YStateMachineHandler;
import online.yamm.coreModelXmi.yamm.YammPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link online.yamm.coreModelXmi.yamm.YStateMachineHandler} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class YStateMachineHandlerItemProvider extends YObjectItemProvider
{
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YStateMachineHandlerItemProvider(AdapterFactory adapterFactory)
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

			addStatePropertyDescriptor(object);
			addTransitionPropertyDescriptor(object);
			addIsSuspendedPropertyDescriptor(object);
			addEffectCountPropertyDescriptor(object);
			addEffectNoPropertyDescriptor(object);
			addStateMachinePropertyDescriptor(object);
			addEffectPropertyDescriptor(object);
			addCalledFromPropertyDescriptor(object);
			addItsClassIDPropertyDescriptor(object);
			addOperationInstancePropertyDescriptor(object);
			addEffectsProcessedPropertyDescriptor(object);
			addMaxEffectsToBeProcessedPropertyDescriptor(object);
			addInAdaptersPropertyDescriptor(object);
			addObjectsBindedWithInoutParametersPropertyDescriptor(object);
			addReturnVarPropertyDescriptor(object);
			addNameOfRetunVarPropertyDescriptor(object);
			addObjectsToColorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStatePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YStateMachineHandler_state_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YStateMachineHandler_state_feature", "_UI_YStateMachineHandler_type"),
				 YammPackage.Literals.YSTATE_MACHINE_HANDLER__STATE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Transition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransitionPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YStateMachineHandler_transition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YStateMachineHandler_transition_feature", "_UI_YStateMachineHandler_type"),
				 YammPackage.Literals.YSTATE_MACHINE_HANDLER__TRANSITION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Suspended feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsSuspendedPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YStateMachineHandler_isSuspended_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YStateMachineHandler_isSuspended_feature", "_UI_YStateMachineHandler_type"),
				 YammPackage.Literals.YSTATE_MACHINE_HANDLER__IS_SUSPENDED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Effect Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEffectCountPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YStateMachineHandler_effectCount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YStateMachineHandler_effectCount_feature", "_UI_YStateMachineHandler_type"),
				 YammPackage.Literals.YSTATE_MACHINE_HANDLER__EFFECT_COUNT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Effect No feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEffectNoPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YStateMachineHandler_effectNo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YStateMachineHandler_effectNo_feature", "_UI_YStateMachineHandler_type"),
				 YammPackage.Literals.YSTATE_MACHINE_HANDLER__EFFECT_NO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the State Machine feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStateMachinePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YStateMachineHandler_stateMachine_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YStateMachineHandler_stateMachine_feature", "_UI_YStateMachineHandler_type"),
				 YammPackage.Literals.YSTATE_MACHINE_HANDLER__STATE_MACHINE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Effect feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEffectPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YStateMachineHandler_effect_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YStateMachineHandler_effect_feature", "_UI_YStateMachineHandler_type"),
				 YammPackage.Literals.YSTATE_MACHINE_HANDLER__EFFECT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Called From feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCalledFromPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YStateMachineHandler_calledFrom_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YStateMachineHandler_calledFrom_feature", "_UI_YStateMachineHandler_type"),
				 YammPackage.Literals.YSTATE_MACHINE_HANDLER__CALLED_FROM,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Its Class ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addItsClassIDPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YStateMachineHandler_itsClassID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YStateMachineHandler_itsClassID_feature", "_UI_YStateMachineHandler_type"),
				 YammPackage.Literals.YSTATE_MACHINE_HANDLER__ITS_CLASS_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Operation Instance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOperationInstancePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YStateMachineHandler_operationInstance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YStateMachineHandler_operationInstance_feature", "_UI_YStateMachineHandler_type"),
				 YammPackage.Literals.YSTATE_MACHINE_HANDLER__OPERATION_INSTANCE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Effects Processed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEffectsProcessedPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YStateMachineHandler_effectsProcessed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YStateMachineHandler_effectsProcessed_feature", "_UI_YStateMachineHandler_type"),
				 YammPackage.Literals.YSTATE_MACHINE_HANDLER__EFFECTS_PROCESSED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
				 getString("_UI_YStateMachineHandler_maxEffectsToBeProcessed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YStateMachineHandler_maxEffectsToBeProcessed_feature", "_UI_YStateMachineHandler_type"),
				 YammPackage.Literals.YSTATE_MACHINE_HANDLER__MAX_EFFECTS_TO_BE_PROCESSED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the In Adapters feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInAdaptersPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YStateMachineHandler_inAdapters_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YStateMachineHandler_inAdapters_feature", "_UI_YStateMachineHandler_type"),
				 YammPackage.Literals.YSTATE_MACHINE_HANDLER__IN_ADAPTERS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Objects Binded With Inout Parameters feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addObjectsBindedWithInoutParametersPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YStateMachineHandler_objectsBindedWithInoutParameters_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YStateMachineHandler_objectsBindedWithInoutParameters_feature", "_UI_YStateMachineHandler_type"),
				 YammPackage.Literals.YSTATE_MACHINE_HANDLER__OBJECTS_BINDED_WITH_INOUT_PARAMETERS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Return Var feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReturnVarPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YStateMachineHandler_returnVar_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YStateMachineHandler_returnVar_feature", "_UI_YStateMachineHandler_type"),
				 YammPackage.Literals.YSTATE_MACHINE_HANDLER__RETURN_VAR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name Of Retun Var feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNameOfRetunVarPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YStateMachineHandler_nameOfRetunVar_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YStateMachineHandler_nameOfRetunVar_feature", "_UI_YStateMachineHandler_type"),
				 YammPackage.Literals.YSTATE_MACHINE_HANDLER__NAME_OF_RETUN_VAR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Objects To Color feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addObjectsToColorPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YStateMachineHandler_objectsToColor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YStateMachineHandler_objectsToColor_feature", "_UI_YStateMachineHandler_type"),
				 YammPackage.Literals.YSTATE_MACHINE_HANDLER__OBJECTS_TO_COLOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns YStateMachineHandler.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/YStateMachineHandler"));
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
		String label = ((YStateMachineHandler)object).getNameOfRetunVar();
		return label == null || label.length() == 0 ?
			getString("_UI_YStateMachineHandler_type") :
			getString("_UI_YStateMachineHandler_type") + " " + label;
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

		switch (notification.getFeatureID(YStateMachineHandler.class)) {
			case YammPackage.YSTATE_MACHINE_HANDLER__IS_SUSPENDED:
			case YammPackage.YSTATE_MACHINE_HANDLER__EFFECT_COUNT:
			case YammPackage.YSTATE_MACHINE_HANDLER__EFFECT_NO:
			case YammPackage.YSTATE_MACHINE_HANDLER__EFFECT:
			case YammPackage.YSTATE_MACHINE_HANDLER__ITS_CLASS_ID:
			case YammPackage.YSTATE_MACHINE_HANDLER__EFFECTS_PROCESSED:
			case YammPackage.YSTATE_MACHINE_HANDLER__MAX_EFFECTS_TO_BE_PROCESSED:
			case YammPackage.YSTATE_MACHINE_HANDLER__IN_ADAPTERS:
			case YammPackage.YSTATE_MACHINE_HANDLER__OBJECTS_BINDED_WITH_INOUT_PARAMETERS:
			case YammPackage.YSTATE_MACHINE_HANDLER__RETURN_VAR:
			case YammPackage.YSTATE_MACHINE_HANDLER__NAME_OF_RETUN_VAR:
			case YammPackage.YSTATE_MACHINE_HANDLER__OBJECTS_TO_COLOR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

}
