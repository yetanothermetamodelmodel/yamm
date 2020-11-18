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

import online.yamm.coreModelXmi.yamm.YSetReturnValue;
import online.yamm.coreModelXmi.yamm.YammFactory;
import online.yamm.coreModelXmi.yamm.YammPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.xtext.xbase.XbaseFactory;

/**
 * This is the item provider adapter for a {@link online.yamm.coreModelXmi.yamm.YSetReturnValue} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class YSetReturnValueItemProvider extends ItemProviderAdapter
{
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YSetReturnValueItemProvider(AdapterFactory adapterFactory)
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
			childrenFeatures.add(YammPackage.Literals.YSET_RETURN_VALUE__VALUE);
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
	 * This returns YSetReturnValue.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/YSetReturnValue"));
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
		return getString("_UI_YSetReturnValue_type");
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

		switch (notification.getFeatureID(YSetReturnValue.class)) {
			case YammPackage.YSET_RETURN_VALUE__VALUE:
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
				(YammPackage.Literals.YSET_RETURN_VALUE__VALUE,
				 YammFactory.eINSTANCE.createYCreateInstanceExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YSET_RETURN_VALUE__VALUE,
				 YammFactory.eINSTANCE.createYPrintExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YSET_RETURN_VALUE__VALUE,
				 YammFactory.eINSTANCE.createYSetReturnValue()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YSET_RETURN_VALUE__VALUE,
				 YammFactory.eINSTANCE.createYGetInstancesOfExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YSET_RETURN_VALUE__VALUE,
				 YammFactory.eINSTANCE.createYMemberFeatureCall()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YSET_RETURN_VALUE__VALUE,
				 YammFactory.eINSTANCE.createYFeatureCall()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YSET_RETURN_VALUE__VALUE,
				 YammFactory.eINSTANCE.createYGetObjectManagement()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YSET_RETURN_VALUE__VALUE,
				 YammFactory.eINSTANCE.createYGetLayerInformation()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YSET_RETURN_VALUE__VALUE,
				 YammFactory.eINSTANCE.createYColorDFAObject()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YSET_RETURN_VALUE__VALUE,
				 YammFactory.eINSTANCE.createYGetInstances()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YSET_RETURN_VALUE__VALUE,
				 YammFactory.eINSTANCE.createYCountFinalStates()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YSET_RETURN_VALUE__VALUE,
				 YammFactory.eINSTANCE.createYCountInitialStates()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YSET_RETURN_VALUE__VALUE,
				 YammFactory.eINSTANCE.createYCountStates()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YSET_RETURN_VALUE__VALUE,
				 YammFactory.eINSTANCE.createYSetAbsoluteNodePropability()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YSET_RETURN_VALUE__VALUE,
				 YammFactory.eINSTANCE.createYCountReachableStates()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YSET_RETURN_VALUE__VALUE,
				 YammFactory.eINSTANCE.createYCountInValidTransitions()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YSET_RETURN_VALUE__VALUE,
				 YammFactory.eINSTANCE.createYSetPopulationSize()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YSET_RETURN_VALUE__VALUE,
				 YammFactory.eINSTANCE.createYLoadModel()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YSET_RETURN_VALUE__VALUE,
				 YammFactory.eINSTANCE.createYTimeStep()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YSET_RETURN_VALUE__VALUE,
				 YammFactory.eINSTANCE.createYObserverAddValue()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YSET_RETURN_VALUE__VALUE,
				 XbaseFactory.eINSTANCE.createXIfExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YSET_RETURN_VALUE__VALUE,
				 XbaseFactory.eINSTANCE.createXSwitchExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YSET_RETURN_VALUE__VALUE,
				 XbaseFactory.eINSTANCE.createXBlockExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YSET_RETURN_VALUE__VALUE,
				 XbaseFactory.eINSTANCE.createXVariableDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YSET_RETURN_VALUE__VALUE,
				 XbaseFactory.eINSTANCE.createXMemberFeatureCall()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YSET_RETURN_VALUE__VALUE,
				 XbaseFactory.eINSTANCE.createXFeatureCall()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YSET_RETURN_VALUE__VALUE,
				 XbaseFactory.eINSTANCE.createXConstructorCall()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YSET_RETURN_VALUE__VALUE,
				 XbaseFactory.eINSTANCE.createXBooleanLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YSET_RETURN_VALUE__VALUE,
				 XbaseFactory.eINSTANCE.createXNullLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YSET_RETURN_VALUE__VALUE,
				 XbaseFactory.eINSTANCE.createXNumberLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YSET_RETURN_VALUE__VALUE,
				 XbaseFactory.eINSTANCE.createXStringLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YSET_RETURN_VALUE__VALUE,
				 XbaseFactory.eINSTANCE.createXListLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YSET_RETURN_VALUE__VALUE,
				 XbaseFactory.eINSTANCE.createXSetLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YSET_RETURN_VALUE__VALUE,
				 XbaseFactory.eINSTANCE.createXClosure()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YSET_RETURN_VALUE__VALUE,
				 XbaseFactory.eINSTANCE.createXCastedExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YSET_RETURN_VALUE__VALUE,
				 XbaseFactory.eINSTANCE.createXBinaryOperation()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YSET_RETURN_VALUE__VALUE,
				 XbaseFactory.eINSTANCE.createXUnaryOperation()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YSET_RETURN_VALUE__VALUE,
				 XbaseFactory.eINSTANCE.createXPostfixOperation()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YSET_RETURN_VALUE__VALUE,
				 XbaseFactory.eINSTANCE.createXForLoopExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YSET_RETURN_VALUE__VALUE,
				 XbaseFactory.eINSTANCE.createXBasicForLoopExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YSET_RETURN_VALUE__VALUE,
				 XbaseFactory.eINSTANCE.createXDoWhileExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YSET_RETURN_VALUE__VALUE,
				 XbaseFactory.eINSTANCE.createXWhileExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YSET_RETURN_VALUE__VALUE,
				 XbaseFactory.eINSTANCE.createXTypeLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YSET_RETURN_VALUE__VALUE,
				 XbaseFactory.eINSTANCE.createXInstanceOfExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YSET_RETURN_VALUE__VALUE,
				 XbaseFactory.eINSTANCE.createXThrowExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YSET_RETURN_VALUE__VALUE,
				 XbaseFactory.eINSTANCE.createXTryCatchFinallyExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YSET_RETURN_VALUE__VALUE,
				 XbaseFactory.eINSTANCE.createXAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YSET_RETURN_VALUE__VALUE,
				 XbaseFactory.eINSTANCE.createXReturnExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YSET_RETURN_VALUE__VALUE,
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
		return YammEditPlugin.INSTANCE;
	}

}
