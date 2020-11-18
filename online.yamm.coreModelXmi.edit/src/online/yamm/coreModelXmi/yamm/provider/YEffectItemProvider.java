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

import online.yamm.coreModelXmi.yamm.YEffect;
import online.yamm.coreModelXmi.yamm.YammFactory;
import online.yamm.coreModelXmi.yamm.YammPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.xtext.xbase.XbaseFactory;

/**
 * This is the item provider adapter for a {@link online.yamm.coreModelXmi.yamm.YEffect} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class YEffectItemProvider extends YObjectItemProvider
{
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YEffectItemProvider(AdapterFactory adapterFactory)
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

			addBreakpointPropertyDescriptor(object);
			addEffectStringRepPropertyDescriptor(object);
			addPosObjectIDPropertyDescriptor(object);
			addPosBreakpointPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Breakpoint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBreakpointPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YEffect_breakpoint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YEffect_breakpoint_feature", "_UI_YEffect_type"),
				 YammPackage.Literals.YEFFECT__BREAKPOINT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Effect String Rep feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEffectStringRepPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YEffect_effectStringRep_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YEffect_effectStringRep_feature", "_UI_YEffect_type"),
				 YammPackage.Literals.YEFFECT__EFFECT_STRING_REP,
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
				 getString("_UI_YEffect_posObjectID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YEffect_posObjectID_feature", "_UI_YEffect_type"),
				 YammPackage.Literals.YEFFECT__POS_OBJECT_ID,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pos Breakpoint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPosBreakpointPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YEffect_posBreakpoint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YEffect_posBreakpoint_feature", "_UI_YEffect_type"),
				 YammPackage.Literals.YEFFECT__POS_BREAKPOINT,
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
			childrenFeatures.add(YammPackage.Literals.YEFFECT__BODY);
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
	 * This returns YEffect.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/YEffect"));
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
		String label = ((YEffect)object).getObjectID();
		return label == null || label.length() == 0 ?
			getString("_UI_YEffect_type") :
			getString("_UI_YEffect_type") + " " + label;
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

		switch (notification.getFeatureID(YEffect.class)) {
			case YammPackage.YEFFECT__BREAKPOINT:
			case YammPackage.YEFFECT__EFFECT_STRING_REP:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case YammPackage.YEFFECT__BODY:
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
				(YammPackage.Literals.YEFFECT__BODY,
				 YammFactory.eINSTANCE.createYCreateInstanceExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YEFFECT__BODY,
				 YammFactory.eINSTANCE.createYPrintExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YEFFECT__BODY,
				 YammFactory.eINSTANCE.createYSetReturnValue()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YEFFECT__BODY,
				 YammFactory.eINSTANCE.createYGetInstancesOfExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YEFFECT__BODY,
				 YammFactory.eINSTANCE.createYMemberFeatureCall()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YEFFECT__BODY,
				 YammFactory.eINSTANCE.createYFeatureCall()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YEFFECT__BODY,
				 YammFactory.eINSTANCE.createYGetObjectManagement()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YEFFECT__BODY,
				 YammFactory.eINSTANCE.createYGetLayerInformation()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YEFFECT__BODY,
				 YammFactory.eINSTANCE.createYColorDFAObject()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YEFFECT__BODY,
				 YammFactory.eINSTANCE.createYGetInstances()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YEFFECT__BODY,
				 YammFactory.eINSTANCE.createYCountFinalStates()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YEFFECT__BODY,
				 YammFactory.eINSTANCE.createYCountInitialStates()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YEFFECT__BODY,
				 YammFactory.eINSTANCE.createYCountStates()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YEFFECT__BODY,
				 YammFactory.eINSTANCE.createYSetAbsoluteNodePropability()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YEFFECT__BODY,
				 YammFactory.eINSTANCE.createYCountReachableStates()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YEFFECT__BODY,
				 YammFactory.eINSTANCE.createYCountInValidTransitions()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YEFFECT__BODY,
				 YammFactory.eINSTANCE.createYSetPopulationSize()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YEFFECT__BODY,
				 YammFactory.eINSTANCE.createYLoadModel()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YEFFECT__BODY,
				 YammFactory.eINSTANCE.createYTimeStep()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YEFFECT__BODY,
				 YammFactory.eINSTANCE.createYObserverAddValue()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YEFFECT__BODY,
				 XbaseFactory.eINSTANCE.createXIfExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YEFFECT__BODY,
				 XbaseFactory.eINSTANCE.createXSwitchExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YEFFECT__BODY,
				 XbaseFactory.eINSTANCE.createXBlockExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YEFFECT__BODY,
				 XbaseFactory.eINSTANCE.createXVariableDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YEFFECT__BODY,
				 XbaseFactory.eINSTANCE.createXMemberFeatureCall()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YEFFECT__BODY,
				 XbaseFactory.eINSTANCE.createXFeatureCall()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YEFFECT__BODY,
				 XbaseFactory.eINSTANCE.createXConstructorCall()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YEFFECT__BODY,
				 XbaseFactory.eINSTANCE.createXBooleanLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YEFFECT__BODY,
				 XbaseFactory.eINSTANCE.createXNullLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YEFFECT__BODY,
				 XbaseFactory.eINSTANCE.createXNumberLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YEFFECT__BODY,
				 XbaseFactory.eINSTANCE.createXStringLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YEFFECT__BODY,
				 XbaseFactory.eINSTANCE.createXListLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YEFFECT__BODY,
				 XbaseFactory.eINSTANCE.createXSetLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YEFFECT__BODY,
				 XbaseFactory.eINSTANCE.createXClosure()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YEFFECT__BODY,
				 XbaseFactory.eINSTANCE.createXCastedExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YEFFECT__BODY,
				 XbaseFactory.eINSTANCE.createXBinaryOperation()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YEFFECT__BODY,
				 XbaseFactory.eINSTANCE.createXUnaryOperation()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YEFFECT__BODY,
				 XbaseFactory.eINSTANCE.createXPostfixOperation()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YEFFECT__BODY,
				 XbaseFactory.eINSTANCE.createXForLoopExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YEFFECT__BODY,
				 XbaseFactory.eINSTANCE.createXBasicForLoopExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YEFFECT__BODY,
				 XbaseFactory.eINSTANCE.createXDoWhileExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YEFFECT__BODY,
				 XbaseFactory.eINSTANCE.createXWhileExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YEFFECT__BODY,
				 XbaseFactory.eINSTANCE.createXTypeLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YEFFECT__BODY,
				 XbaseFactory.eINSTANCE.createXInstanceOfExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YEFFECT__BODY,
				 XbaseFactory.eINSTANCE.createXThrowExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YEFFECT__BODY,
				 XbaseFactory.eINSTANCE.createXTryCatchFinallyExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YEFFECT__BODY,
				 XbaseFactory.eINSTANCE.createXAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YEFFECT__BODY,
				 XbaseFactory.eINSTANCE.createXReturnExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YEFFECT__BODY,
				 XbaseFactory.eINSTANCE.createXSynchronizedExpression()));
	}

}
