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

import online.yamm.coreModelXmi.yamm.YConstraint;
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
 * This is the item provider adapter for a {@link online.yamm.coreModelXmi.yamm.YConstraint} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class YConstraintItemProvider extends YElementItemProvider
{
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YConstraintItemProvider(AdapterFactory adapterFactory)
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
			addConstrainedElementPropertyDescriptor(object);
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
				 getString("_UI_YConstraint_qualifiedName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YConstraint_qualifiedName_feature", "_UI_YConstraint_type"),
				 YammPackage.Literals.YCONSTRAINT__QUALIFIED_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constrained Element feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstrainedElementPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YConstraint_constrainedElement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YConstraint_constrainedElement_feature", "_UI_YConstraint_type"),
				 YammPackage.Literals.YCONSTRAINT__CONSTRAINED_ELEMENT,
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
			childrenFeatures.add(YammPackage.Literals.YCONSTRAINT__OWNED_COMMENT);
			childrenFeatures.add(YammPackage.Literals.YCONSTRAINT__OWNED_ELEMENT);
			childrenFeatures.add(YammPackage.Literals.YCONSTRAINT__SPECIFICATION);
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
	 * This returns YConstraint.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/YConstraint"));
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
		String label = ((YConstraint)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_YConstraint_type") :
			getString("_UI_YConstraint_type") + " " + label;
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

		switch (notification.getFeatureID(YConstraint.class)) {
			case YammPackage.YCONSTRAINT__NAME:
			case YammPackage.YCONSTRAINT__QUALIFIED_NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case YammPackage.YCONSTRAINT__OWNED_COMMENT:
			case YammPackage.YCONSTRAINT__OWNED_ELEMENT:
			case YammPackage.YCONSTRAINT__SPECIFICATION:
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
				(YammPackage.Literals.YCONSTRAINT__OWNED_COMMENT,
				 YammFactory.eINSTANCE.createYComment()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YCONSTRAINT__OWNED_ELEMENT,
				 YammFactory.eINSTANCE.createYElement()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YCONSTRAINT__OWNED_ELEMENT,
				 YammFactory.eINSTANCE.createYClass()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YCONSTRAINT__OWNED_ELEMENT,
				 YammFactory.eINSTANCE.createYComment()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YCONSTRAINT__OWNED_ELEMENT,
				 YammFactory.eINSTANCE.createYConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YCONSTRAINT__OWNED_ELEMENT,
				 YammFactory.eINSTANCE.createYElementImport()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YCONSTRAINT__OWNED_ELEMENT,
				 YammFactory.eINSTANCE.createYEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YCONSTRAINT__OWNED_ELEMENT,
				 YammFactory.eINSTANCE.createYEnumerationLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YCONSTRAINT__OWNED_ELEMENT,
				 YammFactory.eINSTANCE.createYOperation()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YCONSTRAINT__OWNED_ELEMENT,
				 YammFactory.eINSTANCE.createYPackage()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YCONSTRAINT__OWNED_ELEMENT,
				 YammFactory.eINSTANCE.createYPackageImport()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YCONSTRAINT__OWNED_ELEMENT,
				 YammFactory.eINSTANCE.createYParameter()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YCONSTRAINT__OWNED_ELEMENT,
				 YammFactory.eINSTANCE.createYPrimitiveType()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YCONSTRAINT__OWNED_ELEMENT,
				 YammFactory.eINSTANCE.createYProperty()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YCONSTRAINT__OWNED_ELEMENT,
				 YammFactory.eINSTANCE.createYStateMachine()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YCONSTRAINT__OWNED_ELEMENT,
				 YammFactory.eINSTANCE.createYTransition()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YCONSTRAINT__OWNED_ELEMENT,
				 YammFactory.eINSTANCE.createYTrAttachment()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YCONSTRAINT__OWNED_ELEMENT,
				 YammFactory.eINSTANCE.createYPseudostate()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YCONSTRAINT__OWNED_ELEMENT,
				 YammFactory.eINSTANCE.createYFinalState()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YCONSTRAINT__OWNED_ELEMENT,
				 YammFactory.eINSTANCE.createYState()));

		newChildDescriptors.add
			(createChildParameter
				(YammPackage.Literals.YCONSTRAINT__SPECIFICATION,
				 YammFactory.eINSTANCE.createYOperation()));
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
			childFeature == YammPackage.Literals.YCONSTRAINT__OWNED_COMMENT ||
			childFeature == YammPackage.Literals.YCONSTRAINT__OWNED_ELEMENT ||
			childFeature == YammPackage.Literals.YCONSTRAINT__SPECIFICATION;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
