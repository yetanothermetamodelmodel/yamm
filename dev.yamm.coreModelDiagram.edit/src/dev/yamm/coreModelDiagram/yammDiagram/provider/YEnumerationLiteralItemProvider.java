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

import dev.yamm.coreModelDiagram.yammDiagram.YEnumerationLiteral;
import dev.yamm.coreModelDiagram.yammDiagram.YammDiagramFactory;
import dev.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage;

/**
 * This is the item provider adapter for a {@link dev.yamm.coreModelDiagram.yammDiagram.YEnumerationLiteral} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class YEnumerationLiteralItemProvider extends YElementItemProvider
{
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YEnumerationLiteralItemProvider(AdapterFactory adapterFactory)
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
				 getString("_UI_YEnumerationLiteral_qualifiedName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YEnumerationLiteral_qualifiedName_feature", "_UI_YEnumerationLiteral_type"),
				 YammDiagramPackage.Literals.YENUMERATION_LITERAL__QUALIFIED_NAME,
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
			childrenFeatures.add(YammDiagramPackage.Literals.YENUMERATION_LITERAL__OWNED_COMMENT);
			childrenFeatures.add(YammDiagramPackage.Literals.YENUMERATION_LITERAL__OWNED_ELEMENT);
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
	 * This returns YEnumerationLiteral.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/YEnumerationLiteral"));
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
		String label = ((YEnumerationLiteral)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_YEnumerationLiteral_type") :
			getString("_UI_YEnumerationLiteral_type") + " " + label;
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

		switch (notification.getFeatureID(YEnumerationLiteral.class)) {
			case YammDiagramPackage.YENUMERATION_LITERAL__NAME:
			case YammDiagramPackage.YENUMERATION_LITERAL__QUALIFIED_NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case YammDiagramPackage.YENUMERATION_LITERAL__OWNED_COMMENT:
			case YammDiagramPackage.YENUMERATION_LITERAL__OWNED_ELEMENT:
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
				(YammDiagramPackage.Literals.YENUMERATION_LITERAL__OWNED_COMMENT,
				 YammDiagramFactory.eINSTANCE.createYComment()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YENUMERATION_LITERAL__OWNED_ELEMENT,
				 YammDiagramFactory.eINSTANCE.createYElement()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YENUMERATION_LITERAL__OWNED_ELEMENT,
				 YammDiagramFactory.eINSTANCE.createYClass()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YENUMERATION_LITERAL__OWNED_ELEMENT,
				 YammDiagramFactory.eINSTANCE.createYComment()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YENUMERATION_LITERAL__OWNED_ELEMENT,
				 YammDiagramFactory.eINSTANCE.createYConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YENUMERATION_LITERAL__OWNED_ELEMENT,
				 YammDiagramFactory.eINSTANCE.createYElementImport()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YENUMERATION_LITERAL__OWNED_ELEMENT,
				 YammDiagramFactory.eINSTANCE.createYEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YENUMERATION_LITERAL__OWNED_ELEMENT,
				 YammDiagramFactory.eINSTANCE.createYEnumerationLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YENUMERATION_LITERAL__OWNED_ELEMENT,
				 YammDiagramFactory.eINSTANCE.createYOperation()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YENUMERATION_LITERAL__OWNED_ELEMENT,
				 YammDiagramFactory.eINSTANCE.createYPackage()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YENUMERATION_LITERAL__OWNED_ELEMENT,
				 YammDiagramFactory.eINSTANCE.createYPackageImport()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YENUMERATION_LITERAL__OWNED_ELEMENT,
				 YammDiagramFactory.eINSTANCE.createYParameter()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YENUMERATION_LITERAL__OWNED_ELEMENT,
				 YammDiagramFactory.eINSTANCE.createYPrimitiveType()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YENUMERATION_LITERAL__OWNED_ELEMENT,
				 YammDiagramFactory.eINSTANCE.createYProperty()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YENUMERATION_LITERAL__OWNED_ELEMENT,
				 YammDiagramFactory.eINSTANCE.createYStateMachine()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YENUMERATION_LITERAL__OWNED_ELEMENT,
				 YammDiagramFactory.eINSTANCE.createYTransition()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YENUMERATION_LITERAL__OWNED_ELEMENT,
				 YammDiagramFactory.eINSTANCE.createYTrAttachment()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YENUMERATION_LITERAL__OWNED_ELEMENT,
				 YammDiagramFactory.eINSTANCE.createYPseudostate()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YENUMERATION_LITERAL__OWNED_ELEMENT,
				 YammDiagramFactory.eINSTANCE.createYFinalState()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YENUMERATION_LITERAL__OWNED_ELEMENT,
				 YammDiagramFactory.eINSTANCE.createYState()));
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
			childFeature == YammDiagramPackage.Literals.YENUMERATION_LITERAL__OWNED_COMMENT ||
			childFeature == YammDiagramPackage.Literals.YENUMERATION_LITERAL__OWNED_ELEMENT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}