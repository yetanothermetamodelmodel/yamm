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

import online.yamm.coreModelXmi.yamm.YGlobalStateMachine;
import online.yamm.coreModelXmi.yamm.YammFactory;
import online.yamm.coreModelXmi.yamm.YammPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link online.yamm.coreModelXmi.yamm.YGlobalStateMachine} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class YGlobalStateMachineItemProvider extends YObjectItemProvider
{
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YGlobalStateMachineItemProvider(AdapterFactory adapterFactory)
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

			addStateMachinesPropertyDescriptor(object);
			addStateMachineHandlersPropertyDescriptor(object);
			addStateMachineHandlerCountPropertyDescriptor(object);
			addConstraintsAllTruePropertyDescriptor(object);
			addHasReturnParamPropertyDescriptor(object);
			addParamCountPropertyDescriptor(object);
			addStateExitCountPropertyDescriptor(object);
			addStateExitNoPropertyDescriptor(object);
			addOPropertyDescriptor(object);
			addObserverActivePropertyDescriptor(object);
			addDesPhasePropertyDescriptor(object);
			addNotYetExecutedInitialActiveStatemachinesPropertyDescriptor(object);
			addDesinitStateMachinePropertyDescriptor(object);
			addExecutionPhasePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the State Machines feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStateMachinesPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YGlobalStateMachine_stateMachines_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YGlobalStateMachine_stateMachines_feature", "_UI_YGlobalStateMachine_type"),
				 YammPackage.Literals.YGLOBAL_STATE_MACHINE__STATE_MACHINES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the State Machine Handlers feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStateMachineHandlersPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YGlobalStateMachine_stateMachineHandlers_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YGlobalStateMachine_stateMachineHandlers_feature", "_UI_YGlobalStateMachine_type"),
				 YammPackage.Literals.YGLOBAL_STATE_MACHINE__STATE_MACHINE_HANDLERS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the State Machine Handler Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStateMachineHandlerCountPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YGlobalStateMachine_stateMachineHandlerCount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YGlobalStateMachine_stateMachineHandlerCount_feature", "_UI_YGlobalStateMachine_type"),
				 YammPackage.Literals.YGLOBAL_STATE_MACHINE__STATE_MACHINE_HANDLER_COUNT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constraints All True feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstraintsAllTruePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YGlobalStateMachine_constraintsAllTrue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YGlobalStateMachine_constraintsAllTrue_feature", "_UI_YGlobalStateMachine_type"),
				 YammPackage.Literals.YGLOBAL_STATE_MACHINE__CONSTRAINTS_ALL_TRUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Return Param feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasReturnParamPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YGlobalStateMachine_hasReturnParam_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YGlobalStateMachine_hasReturnParam_feature", "_UI_YGlobalStateMachine_type"),
				 YammPackage.Literals.YGLOBAL_STATE_MACHINE__HAS_RETURN_PARAM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Param Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParamCountPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YGlobalStateMachine_paramCount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YGlobalStateMachine_paramCount_feature", "_UI_YGlobalStateMachine_type"),
				 YammPackage.Literals.YGLOBAL_STATE_MACHINE__PARAM_COUNT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the State Exit Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStateExitCountPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YGlobalStateMachine_stateExitCount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YGlobalStateMachine_stateExitCount_feature", "_UI_YGlobalStateMachine_type"),
				 YammPackage.Literals.YGLOBAL_STATE_MACHINE__STATE_EXIT_COUNT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the State Exit No feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStateExitNoPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YGlobalStateMachine_stateExitNo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YGlobalStateMachine_stateExitNo_feature", "_UI_YGlobalStateMachine_type"),
				 YammPackage.Literals.YGLOBAL_STATE_MACHINE__STATE_EXIT_NO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the O feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YGlobalStateMachine_o_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YGlobalStateMachine_o_feature", "_UI_YGlobalStateMachine_type"),
				 YammPackage.Literals.YGLOBAL_STATE_MACHINE__O,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Observer Active feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addObserverActivePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YGlobalStateMachine_observerActive_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YGlobalStateMachine_observerActive_feature", "_UI_YGlobalStateMachine_type"),
				 YammPackage.Literals.YGLOBAL_STATE_MACHINE__OBSERVER_ACTIVE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Des Phase feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDesPhasePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YGlobalStateMachine_desPhase_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YGlobalStateMachine_desPhase_feature", "_UI_YGlobalStateMachine_type"),
				 YammPackage.Literals.YGLOBAL_STATE_MACHINE__DES_PHASE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Not Yet Executed Initial Active Statemachines feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNotYetExecutedInitialActiveStatemachinesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YGlobalStateMachine_notYetExecutedInitialActiveStatemachines_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YGlobalStateMachine_notYetExecutedInitialActiveStatemachines_feature", "_UI_YGlobalStateMachine_type"),
				 YammPackage.Literals.YGLOBAL_STATE_MACHINE__NOT_YET_EXECUTED_INITIAL_ACTIVE_STATEMACHINES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Desinit State Machine feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDesinitStateMachinePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YGlobalStateMachine_desinitStateMachine_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YGlobalStateMachine_desinitStateMachine_feature", "_UI_YGlobalStateMachine_type"),
				 YammPackage.Literals.YGLOBAL_STATE_MACHINE__DESINIT_STATE_MACHINE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Execution Phase feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExecutionPhasePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YGlobalStateMachine_executionPhase_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YGlobalStateMachine_executionPhase_feature", "_UI_YGlobalStateMachine_type"),
				 YammPackage.Literals.YGLOBAL_STATE_MACHINE__EXECUTION_PHASE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(YammPackage.Literals.YGLOBAL_STATE_MACHINE__INTERNAL);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns YGlobalStateMachine.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/YGlobalStateMachine"));
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
		String label = ((YGlobalStateMachine)object).getObjectID();
		return label == null || label.length() == 0 ?
			getString("_UI_YGlobalStateMachine_type") :
			getString("_UI_YGlobalStateMachine_type") + " " + label;
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

		switch (notification.getFeatureID(YGlobalStateMachine.class)) {
			case YammPackage.YGLOBAL_STATE_MACHINE__STATE_MACHINE_HANDLER_COUNT:
			case YammPackage.YGLOBAL_STATE_MACHINE__CONSTRAINTS_ALL_TRUE:
			case YammPackage.YGLOBAL_STATE_MACHINE__HAS_RETURN_PARAM:
			case YammPackage.YGLOBAL_STATE_MACHINE__PARAM_COUNT:
			case YammPackage.YGLOBAL_STATE_MACHINE__STATE_EXIT_COUNT:
			case YammPackage.YGLOBAL_STATE_MACHINE__STATE_EXIT_NO:
			case YammPackage.YGLOBAL_STATE_MACHINE__OBSERVER_ACTIVE:
			case YammPackage.YGLOBAL_STATE_MACHINE__DES_PHASE:
			case YammPackage.YGLOBAL_STATE_MACHINE__EXECUTION_PHASE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case YammPackage.YGLOBAL_STATE_MACHINE__INTERNAL:
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
				(YammPackage.Literals.YGLOBAL_STATE_MACHINE__INTERNAL,
				 YammFactory.eINSTANCE.createYInternal()));
	}

}
