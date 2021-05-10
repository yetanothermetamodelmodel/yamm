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

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.xtext.xbase.XbaseFactory;

import dev.yamm.coreModelDiagram.yammDiagram.YGetInstances;
import dev.yamm.coreModelDiagram.yammDiagram.YammDiagramFactory;
import dev.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage;

/**
 * This is the item provider adapter for a {@link dev.yamm.coreModelDiagram.yammDiagram.YGetInstances} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class YGetInstancesItemProvider extends ItemProviderAdapter
{
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YGetInstancesItemProvider(AdapterFactory adapterFactory)
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(YammDiagramPackage.Literals.YGET_INSTANCES__PARAMETER);
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
	 * This returns YGetInstances.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/YGetInstances"));
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
		return getString("_UI_YGetInstances_type");
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

		switch (notification.getFeatureID(YGetInstances.class)) {
			case YammDiagramPackage.YGET_INSTANCES__PARAMETER:
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
				(YammDiagramPackage.Literals.YGET_INSTANCES__PARAMETER,
				 YammDiagramFactory.eINSTANCE.createYCreateInstanceExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YGET_INSTANCES__PARAMETER,
				 YammDiagramFactory.eINSTANCE.createYPrintExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YGET_INSTANCES__PARAMETER,
				 YammDiagramFactory.eINSTANCE.createYSetReturnValue()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YGET_INSTANCES__PARAMETER,
				 YammDiagramFactory.eINSTANCE.createYGetInstancesOfExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YGET_INSTANCES__PARAMETER,
				 YammDiagramFactory.eINSTANCE.createYMemberFeatureCall()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YGET_INSTANCES__PARAMETER,
				 YammDiagramFactory.eINSTANCE.createYFeatureCall()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YGET_INSTANCES__PARAMETER,
				 YammDiagramFactory.eINSTANCE.createYGetObjectManagement()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YGET_INSTANCES__PARAMETER,
				 YammDiagramFactory.eINSTANCE.createYGetLayerInformation()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YGET_INSTANCES__PARAMETER,
				 YammDiagramFactory.eINSTANCE.createYColorDFAObject()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YGET_INSTANCES__PARAMETER,
				 YammDiagramFactory.eINSTANCE.createYGetInstances()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YGET_INSTANCES__PARAMETER,
				 YammDiagramFactory.eINSTANCE.createYCountFinalStates()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YGET_INSTANCES__PARAMETER,
				 YammDiagramFactory.eINSTANCE.createYCountInitialStates()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YGET_INSTANCES__PARAMETER,
				 YammDiagramFactory.eINSTANCE.createYCountStates()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YGET_INSTANCES__PARAMETER,
				 YammDiagramFactory.eINSTANCE.createYSetAbsoluteNodePropability()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YGET_INSTANCES__PARAMETER,
				 YammDiagramFactory.eINSTANCE.createYCountReachableStates()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YGET_INSTANCES__PARAMETER,
				 YammDiagramFactory.eINSTANCE.createYCountInValidTransitions()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YGET_INSTANCES__PARAMETER,
				 YammDiagramFactory.eINSTANCE.createYSetPopulationSize()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YGET_INSTANCES__PARAMETER,
				 YammDiagramFactory.eINSTANCE.createYLoadModel()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YGET_INSTANCES__PARAMETER,
				 YammDiagramFactory.eINSTANCE.createYObserverAddValue()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YGET_INSTANCES__PARAMETER,
				 XbaseFactory.eINSTANCE.createXIfExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YGET_INSTANCES__PARAMETER,
				 XbaseFactory.eINSTANCE.createXSwitchExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YGET_INSTANCES__PARAMETER,
				 XbaseFactory.eINSTANCE.createXBlockExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YGET_INSTANCES__PARAMETER,
				 XbaseFactory.eINSTANCE.createXVariableDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YGET_INSTANCES__PARAMETER,
				 XbaseFactory.eINSTANCE.createXMemberFeatureCall()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YGET_INSTANCES__PARAMETER,
				 XbaseFactory.eINSTANCE.createXFeatureCall()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YGET_INSTANCES__PARAMETER,
				 XbaseFactory.eINSTANCE.createXConstructorCall()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YGET_INSTANCES__PARAMETER,
				 XbaseFactory.eINSTANCE.createXBooleanLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YGET_INSTANCES__PARAMETER,
				 XbaseFactory.eINSTANCE.createXNullLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YGET_INSTANCES__PARAMETER,
				 XbaseFactory.eINSTANCE.createXNumberLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YGET_INSTANCES__PARAMETER,
				 XbaseFactory.eINSTANCE.createXStringLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YGET_INSTANCES__PARAMETER,
				 XbaseFactory.eINSTANCE.createXListLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YGET_INSTANCES__PARAMETER,
				 XbaseFactory.eINSTANCE.createXSetLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YGET_INSTANCES__PARAMETER,
				 XbaseFactory.eINSTANCE.createXClosure()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YGET_INSTANCES__PARAMETER,
				 XbaseFactory.eINSTANCE.createXCastedExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YGET_INSTANCES__PARAMETER,
				 XbaseFactory.eINSTANCE.createXBinaryOperation()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YGET_INSTANCES__PARAMETER,
				 XbaseFactory.eINSTANCE.createXUnaryOperation()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YGET_INSTANCES__PARAMETER,
				 XbaseFactory.eINSTANCE.createXPostfixOperation()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YGET_INSTANCES__PARAMETER,
				 XbaseFactory.eINSTANCE.createXForLoopExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YGET_INSTANCES__PARAMETER,
				 XbaseFactory.eINSTANCE.createXBasicForLoopExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YGET_INSTANCES__PARAMETER,
				 XbaseFactory.eINSTANCE.createXDoWhileExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YGET_INSTANCES__PARAMETER,
				 XbaseFactory.eINSTANCE.createXWhileExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YGET_INSTANCES__PARAMETER,
				 XbaseFactory.eINSTANCE.createXTypeLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YGET_INSTANCES__PARAMETER,
				 XbaseFactory.eINSTANCE.createXInstanceOfExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YGET_INSTANCES__PARAMETER,
				 XbaseFactory.eINSTANCE.createXThrowExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YGET_INSTANCES__PARAMETER,
				 XbaseFactory.eINSTANCE.createXTryCatchFinallyExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YGET_INSTANCES__PARAMETER,
				 XbaseFactory.eINSTANCE.createXAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YGET_INSTANCES__PARAMETER,
				 XbaseFactory.eINSTANCE.createXReturnExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YGET_INSTANCES__PARAMETER,
				 XbaseFactory.eINSTANCE.createXSynchronizedExpression()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator()
	{
		return YammDiagramEditPlugin.INSTANCE;
	}

}