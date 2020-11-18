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
package online.yamm.coreModelDiagram.yammDiagram.provider;


import java.util.Collection;
import java.util.List;

import online.yamm.coreModelDiagram.yammDiagram.YTrAttachment;
import online.yamm.coreModelDiagram.yammDiagram.YammDiagramFactory;
import online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.xtext.xbase.XbaseFactory;

/**
 * This is the item provider adapter for a {@link online.yamm.coreModelDiagram.yammDiagram.YTrAttachment} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class YTrAttachmentItemProvider extends YElementItemProvider
{
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YTrAttachmentItemProvider(AdapterFactory adapterFactory)
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
			addQualifiedNamePropertyDescriptor(object);
			addTransitionPropertyDescriptor(object);
			addGuardStringRepPropertyDescriptor(object);
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
				 getString("_UI_YTrAttachment_qualifiedName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YTrAttachment_qualifiedName_feature", "_UI_YTrAttachment_type"),
				 YammDiagramPackage.Literals.YTR_ATTACHMENT__QUALIFIED_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_YTrAttachment_transition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YTrAttachment_transition_feature", "_UI_YTrAttachment_type"),
				 YammDiagramPackage.Literals.YTR_ATTACHMENT__TRANSITION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Guard String Rep feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGuardStringRepPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YTrAttachment_guardStringRep_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YTrAttachment_guardStringRep_feature", "_UI_YTrAttachment_type"),
				 YammDiagramPackage.Literals.YTR_ATTACHMENT__GUARD_STRING_REP,
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
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object)
	{
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(YammDiagramPackage.Literals.YTR_ATTACHMENT__EFFECTS);
			childrenFeatures.add(YammDiagramPackage.Literals.YTR_ATTACHMENT__GUARD);
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
	 * This returns YTrAttachment.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/YTrAttachment"));
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
		String label = ((YTrAttachment)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_YTrAttachment_type") :
			getString("_UI_YTrAttachment_type") + " " + label;
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

		switch (notification.getFeatureID(YTrAttachment.class)) {
			case YammDiagramPackage.YTR_ATTACHMENT__NAME:
			case YammDiagramPackage.YTR_ATTACHMENT__QUALIFIED_NAME:
			case YammDiagramPackage.YTR_ATTACHMENT__GUARD_STRING_REP:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case YammDiagramPackage.YTR_ATTACHMENT__EFFECTS:
			case YammDiagramPackage.YTR_ATTACHMENT__GUARD:
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
				(YammDiagramPackage.Literals.YTR_ATTACHMENT__EFFECTS,
				 YammDiagramFactory.eINSTANCE.createYEffect()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YTR_ATTACHMENT__GUARD,
				 YammDiagramFactory.eINSTANCE.createYCreateInstanceExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YTR_ATTACHMENT__GUARD,
				 YammDiagramFactory.eINSTANCE.createYPrintExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YTR_ATTACHMENT__GUARD,
				 YammDiagramFactory.eINSTANCE.createYSetReturnValue()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YTR_ATTACHMENT__GUARD,
				 YammDiagramFactory.eINSTANCE.createYGetInstancesOfExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YTR_ATTACHMENT__GUARD,
				 YammDiagramFactory.eINSTANCE.createYMemberFeatureCall()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YTR_ATTACHMENT__GUARD,
				 YammDiagramFactory.eINSTANCE.createYFeatureCall()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YTR_ATTACHMENT__GUARD,
				 YammDiagramFactory.eINSTANCE.createYGetObjectManagement()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YTR_ATTACHMENT__GUARD,
				 YammDiagramFactory.eINSTANCE.createYGetLayerInformation()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YTR_ATTACHMENT__GUARD,
				 YammDiagramFactory.eINSTANCE.createYColorDFAObject()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YTR_ATTACHMENT__GUARD,
				 YammDiagramFactory.eINSTANCE.createYGetInstances()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YTR_ATTACHMENT__GUARD,
				 YammDiagramFactory.eINSTANCE.createYCountFinalStates()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YTR_ATTACHMENT__GUARD,
				 YammDiagramFactory.eINSTANCE.createYCountInitialStates()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YTR_ATTACHMENT__GUARD,
				 YammDiagramFactory.eINSTANCE.createYCountStates()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YTR_ATTACHMENT__GUARD,
				 YammDiagramFactory.eINSTANCE.createYSetAbsoluteNodePropability()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YTR_ATTACHMENT__GUARD,
				 YammDiagramFactory.eINSTANCE.createYCountReachableStates()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YTR_ATTACHMENT__GUARD,
				 YammDiagramFactory.eINSTANCE.createYCountInValidTransitions()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YTR_ATTACHMENT__GUARD,
				 YammDiagramFactory.eINSTANCE.createYSetPopulationSize()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YTR_ATTACHMENT__GUARD,
				 YammDiagramFactory.eINSTANCE.createYLoadModel()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YTR_ATTACHMENT__GUARD,
				 YammDiagramFactory.eINSTANCE.createYObserverAddValue()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YTR_ATTACHMENT__GUARD,
				 XbaseFactory.eINSTANCE.createXIfExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YTR_ATTACHMENT__GUARD,
				 XbaseFactory.eINSTANCE.createXSwitchExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YTR_ATTACHMENT__GUARD,
				 XbaseFactory.eINSTANCE.createXBlockExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YTR_ATTACHMENT__GUARD,
				 XbaseFactory.eINSTANCE.createXVariableDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YTR_ATTACHMENT__GUARD,
				 XbaseFactory.eINSTANCE.createXMemberFeatureCall()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YTR_ATTACHMENT__GUARD,
				 XbaseFactory.eINSTANCE.createXFeatureCall()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YTR_ATTACHMENT__GUARD,
				 XbaseFactory.eINSTANCE.createXConstructorCall()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YTR_ATTACHMENT__GUARD,
				 XbaseFactory.eINSTANCE.createXBooleanLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YTR_ATTACHMENT__GUARD,
				 XbaseFactory.eINSTANCE.createXNullLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YTR_ATTACHMENT__GUARD,
				 XbaseFactory.eINSTANCE.createXNumberLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YTR_ATTACHMENT__GUARD,
				 XbaseFactory.eINSTANCE.createXStringLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YTR_ATTACHMENT__GUARD,
				 XbaseFactory.eINSTANCE.createXListLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YTR_ATTACHMENT__GUARD,
				 XbaseFactory.eINSTANCE.createXSetLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YTR_ATTACHMENT__GUARD,
				 XbaseFactory.eINSTANCE.createXClosure()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YTR_ATTACHMENT__GUARD,
				 XbaseFactory.eINSTANCE.createXCastedExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YTR_ATTACHMENT__GUARD,
				 XbaseFactory.eINSTANCE.createXBinaryOperation()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YTR_ATTACHMENT__GUARD,
				 XbaseFactory.eINSTANCE.createXUnaryOperation()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YTR_ATTACHMENT__GUARD,
				 XbaseFactory.eINSTANCE.createXPostfixOperation()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YTR_ATTACHMENT__GUARD,
				 XbaseFactory.eINSTANCE.createXForLoopExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YTR_ATTACHMENT__GUARD,
				 XbaseFactory.eINSTANCE.createXBasicForLoopExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YTR_ATTACHMENT__GUARD,
				 XbaseFactory.eINSTANCE.createXDoWhileExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YTR_ATTACHMENT__GUARD,
				 XbaseFactory.eINSTANCE.createXWhileExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YTR_ATTACHMENT__GUARD,
				 XbaseFactory.eINSTANCE.createXTypeLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YTR_ATTACHMENT__GUARD,
				 XbaseFactory.eINSTANCE.createXInstanceOfExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YTR_ATTACHMENT__GUARD,
				 XbaseFactory.eINSTANCE.createXThrowExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YTR_ATTACHMENT__GUARD,
				 XbaseFactory.eINSTANCE.createXTryCatchFinallyExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YTR_ATTACHMENT__GUARD,
				 XbaseFactory.eINSTANCE.createXAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YTR_ATTACHMENT__GUARD,
				 XbaseFactory.eINSTANCE.createXReturnExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YTR_ATTACHMENT__GUARD,
				 XbaseFactory.eINSTANCE.createXSynchronizedExpression()));
	}

}
