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

import online.yamm.coreModelXmi.yamm.YColorDFAObject;
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
 * This is the item provider adapter for a {@link online.yamm.coreModelXmi.yamm.YColorDFAObject} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class YColorDFAObjectItemProvider extends ItemProviderAdapter
{
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YColorDFAObjectItemProvider(AdapterFactory adapterFactory)
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
			childrenFeatures.add(YammPackage.Literals.YCOLOR_DFA_OBJECT__ID);
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
	 * This returns YColorDFAObject.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/YColorDFAObject"));
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
		return getString("_UI_YColorDFAObject_type");
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

		switch (notification.getFeatureID(YColorDFAObject.class)) {
			case YammPackage.YCOLOR_DFA_OBJECT__ID:
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
				(YammPackage.Literals.YCOLOR_DFA_OBJECT__ID,
				 YammFactory.eINSTANCE.createYCreateInstanceExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YCOLOR_DFA_OBJECT__ID,
				 YammFactory.eINSTANCE.createYPrintExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YCOLOR_DFA_OBJECT__ID,
				 YammFactory.eINSTANCE.createYSetReturnValue()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YCOLOR_DFA_OBJECT__ID,
				 YammFactory.eINSTANCE.createYGetInstancesOfExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YCOLOR_DFA_OBJECT__ID,
				 YammFactory.eINSTANCE.createYMemberFeatureCall()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YCOLOR_DFA_OBJECT__ID,
				 YammFactory.eINSTANCE.createYFeatureCall()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YCOLOR_DFA_OBJECT__ID,
				 YammFactory.eINSTANCE.createYGetObjectManagement()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YCOLOR_DFA_OBJECT__ID,
				 YammFactory.eINSTANCE.createYGetLayerInformation()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YCOLOR_DFA_OBJECT__ID,
				 YammFactory.eINSTANCE.createYColorDFAObject()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YCOLOR_DFA_OBJECT__ID,
				 YammFactory.eINSTANCE.createYGetInstances()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YCOLOR_DFA_OBJECT__ID,
				 YammFactory.eINSTANCE.createYCountFinalStates()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YCOLOR_DFA_OBJECT__ID,
				 YammFactory.eINSTANCE.createYCountInitialStates()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YCOLOR_DFA_OBJECT__ID,
				 YammFactory.eINSTANCE.createYCountStates()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YCOLOR_DFA_OBJECT__ID,
				 YammFactory.eINSTANCE.createYSetAbsoluteNodePropability()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YCOLOR_DFA_OBJECT__ID,
				 YammFactory.eINSTANCE.createYCountReachableStates()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YCOLOR_DFA_OBJECT__ID,
				 YammFactory.eINSTANCE.createYCountInValidTransitions()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YCOLOR_DFA_OBJECT__ID,
				 YammFactory.eINSTANCE.createYSetPopulationSize()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YCOLOR_DFA_OBJECT__ID,
				 YammFactory.eINSTANCE.createYLoadModel()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YCOLOR_DFA_OBJECT__ID,
				 YammFactory.eINSTANCE.createYTimeStep()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YCOLOR_DFA_OBJECT__ID,
				 YammFactory.eINSTANCE.createYObserverAddValue()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YCOLOR_DFA_OBJECT__ID,
				 XbaseFactory.eINSTANCE.createXIfExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YCOLOR_DFA_OBJECT__ID,
				 XbaseFactory.eINSTANCE.createXSwitchExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YCOLOR_DFA_OBJECT__ID,
				 XbaseFactory.eINSTANCE.createXBlockExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YCOLOR_DFA_OBJECT__ID,
				 XbaseFactory.eINSTANCE.createXVariableDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YCOLOR_DFA_OBJECT__ID,
				 XbaseFactory.eINSTANCE.createXMemberFeatureCall()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YCOLOR_DFA_OBJECT__ID,
				 XbaseFactory.eINSTANCE.createXFeatureCall()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YCOLOR_DFA_OBJECT__ID,
				 XbaseFactory.eINSTANCE.createXConstructorCall()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YCOLOR_DFA_OBJECT__ID,
				 XbaseFactory.eINSTANCE.createXBooleanLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YCOLOR_DFA_OBJECT__ID,
				 XbaseFactory.eINSTANCE.createXNullLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YCOLOR_DFA_OBJECT__ID,
				 XbaseFactory.eINSTANCE.createXNumberLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YCOLOR_DFA_OBJECT__ID,
				 XbaseFactory.eINSTANCE.createXStringLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YCOLOR_DFA_OBJECT__ID,
				 XbaseFactory.eINSTANCE.createXListLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YCOLOR_DFA_OBJECT__ID,
				 XbaseFactory.eINSTANCE.createXSetLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YCOLOR_DFA_OBJECT__ID,
				 XbaseFactory.eINSTANCE.createXClosure()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YCOLOR_DFA_OBJECT__ID,
				 XbaseFactory.eINSTANCE.createXCastedExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YCOLOR_DFA_OBJECT__ID,
				 XbaseFactory.eINSTANCE.createXBinaryOperation()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YCOLOR_DFA_OBJECT__ID,
				 XbaseFactory.eINSTANCE.createXUnaryOperation()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YCOLOR_DFA_OBJECT__ID,
				 XbaseFactory.eINSTANCE.createXPostfixOperation()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YCOLOR_DFA_OBJECT__ID,
				 XbaseFactory.eINSTANCE.createXForLoopExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YCOLOR_DFA_OBJECT__ID,
				 XbaseFactory.eINSTANCE.createXBasicForLoopExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YCOLOR_DFA_OBJECT__ID,
				 XbaseFactory.eINSTANCE.createXDoWhileExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YCOLOR_DFA_OBJECT__ID,
				 XbaseFactory.eINSTANCE.createXWhileExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YCOLOR_DFA_OBJECT__ID,
				 XbaseFactory.eINSTANCE.createXTypeLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YCOLOR_DFA_OBJECT__ID,
				 XbaseFactory.eINSTANCE.createXInstanceOfExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YCOLOR_DFA_OBJECT__ID,
				 XbaseFactory.eINSTANCE.createXThrowExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YCOLOR_DFA_OBJECT__ID,
				 XbaseFactory.eINSTANCE.createXTryCatchFinallyExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YCOLOR_DFA_OBJECT__ID,
				 XbaseFactory.eINSTANCE.createXAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YCOLOR_DFA_OBJECT__ID,
				 XbaseFactory.eINSTANCE.createXReturnExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YCOLOR_DFA_OBJECT__ID,
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
