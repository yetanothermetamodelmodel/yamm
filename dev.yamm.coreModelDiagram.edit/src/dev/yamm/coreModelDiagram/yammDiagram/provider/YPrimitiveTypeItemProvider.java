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

import dev.yamm.coreModelDiagram.yammDiagram.YPrimitiveType;
import dev.yamm.coreModelDiagram.yammDiagram.YammDiagramFactory;
import dev.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage;

/**
 * This is the item provider adapter for a {@link dev.yamm.coreModelDiagram.yammDiagram.YPrimitiveType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class YPrimitiveTypeItemProvider extends YElementItemProvider
{
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YPrimitiveTypeItemProvider(AdapterFactory adapterFactory)
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
			addIsAbstractPropertyDescriptor(object);
			addQualifiedNamePropertyDescriptor(object);
			addMemberPropertyDescriptor(object);
			addElementImportPropertyDescriptor(object);
			addImportedMemberPropertyDescriptor(object);
			addPackageImportPropertyDescriptor(object);
			addAttributePropertyDescriptor(object);
			addFeaturePropertyDescriptor(object);
			addGeneralPropertyDescriptor(object);
			addInheritedMemberPropertyDescriptor(object);
			addPackagePropertyDescriptor(object);
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
	 * This adds a property descriptor for the Is Abstract feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsAbstractPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YPrimitiveType_isAbstract_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YPrimitiveType_isAbstract_feature", "_UI_YPrimitiveType_type"),
				 YammDiagramPackage.Literals.YPRIMITIVE_TYPE__IS_ABSTRACT,
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
				 getString("_UI_YPrimitiveType_qualifiedName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YPrimitiveType_qualifiedName_feature", "_UI_YPrimitiveType_type"),
				 YammDiagramPackage.Literals.YPRIMITIVE_TYPE__QUALIFIED_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Member feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMemberPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YPrimitiveType_member_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YPrimitiveType_member_feature", "_UI_YPrimitiveType_type"),
				 YammDiagramPackage.Literals.YPRIMITIVE_TYPE__MEMBER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Element Import feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addElementImportPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YPrimitiveType_elementImport_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YPrimitiveType_elementImport_feature", "_UI_YPrimitiveType_type"),
				 YammDiagramPackage.Literals.YPRIMITIVE_TYPE__ELEMENT_IMPORT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Imported Member feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImportedMemberPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YPrimitiveType_importedMember_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YPrimitiveType_importedMember_feature", "_UI_YPrimitiveType_type"),
				 YammDiagramPackage.Literals.YPRIMITIVE_TYPE__IMPORTED_MEMBER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Package Import feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPackageImportPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YPrimitiveType_packageImport_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YPrimitiveType_packageImport_feature", "_UI_YPrimitiveType_type"),
				 YammDiagramPackage.Literals.YPRIMITIVE_TYPE__PACKAGE_IMPORT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Attribute feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAttributePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YPrimitiveType_attribute_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YPrimitiveType_attribute_feature", "_UI_YPrimitiveType_type"),
				 YammDiagramPackage.Literals.YPRIMITIVE_TYPE__ATTRIBUTE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFeaturePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YPrimitiveType_feature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YPrimitiveType_feature_feature", "_UI_YPrimitiveType_type"),
				 YammDiagramPackage.Literals.YPRIMITIVE_TYPE__FEATURE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the General feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGeneralPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YPrimitiveType_general_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YPrimitiveType_general_feature", "_UI_YPrimitiveType_type"),
				 YammDiagramPackage.Literals.YPRIMITIVE_TYPE__GENERAL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Inherited Member feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInheritedMemberPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YPrimitiveType_inheritedMember_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YPrimitiveType_inheritedMember_feature", "_UI_YPrimitiveType_type"),
				 YammDiagramPackage.Literals.YPRIMITIVE_TYPE__INHERITED_MEMBER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Package feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPackagePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_YPrimitiveType_package_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_YPrimitiveType_package_feature", "_UI_YPrimitiveType_type"),
				 YammDiagramPackage.Literals.YPRIMITIVE_TYPE__PACKAGE,
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
			childrenFeatures.add(YammDiagramPackage.Literals.YPRIMITIVE_TYPE__OWNED_COMMENT);
			childrenFeatures.add(YammDiagramPackage.Literals.YPRIMITIVE_TYPE__OWNED_ELEMENT);
			childrenFeatures.add(YammDiagramPackage.Literals.YPRIMITIVE_TYPE__OWNED_MEMBER);
			childrenFeatures.add(YammDiagramPackage.Literals.YPRIMITIVE_TYPE__OWNED_RULE);
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
	 * This returns YPrimitiveType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/YPrimitiveType"));
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
		String label = ((YPrimitiveType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_YPrimitiveType_type") :
			getString("_UI_YPrimitiveType_type") + " " + label;
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

		switch (notification.getFeatureID(YPrimitiveType.class)) {
			case YammDiagramPackage.YPRIMITIVE_TYPE__NAME:
			case YammDiagramPackage.YPRIMITIVE_TYPE__IS_ABSTRACT:
			case YammDiagramPackage.YPRIMITIVE_TYPE__QUALIFIED_NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case YammDiagramPackage.YPRIMITIVE_TYPE__OWNED_COMMENT:
			case YammDiagramPackage.YPRIMITIVE_TYPE__OWNED_ELEMENT:
			case YammDiagramPackage.YPRIMITIVE_TYPE__OWNED_MEMBER:
			case YammDiagramPackage.YPRIMITIVE_TYPE__OWNED_RULE:
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
				(YammDiagramPackage.Literals.YPRIMITIVE_TYPE__OWNED_COMMENT,
				 YammDiagramFactory.eINSTANCE.createYComment()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YPRIMITIVE_TYPE__OWNED_ELEMENT,
				 YammDiagramFactory.eINSTANCE.createYElement()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YPRIMITIVE_TYPE__OWNED_ELEMENT,
				 YammDiagramFactory.eINSTANCE.createYClass()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YPRIMITIVE_TYPE__OWNED_ELEMENT,
				 YammDiagramFactory.eINSTANCE.createYComment()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YPRIMITIVE_TYPE__OWNED_ELEMENT,
				 YammDiagramFactory.eINSTANCE.createYConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YPRIMITIVE_TYPE__OWNED_ELEMENT,
				 YammDiagramFactory.eINSTANCE.createYElementImport()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YPRIMITIVE_TYPE__OWNED_ELEMENT,
				 YammDiagramFactory.eINSTANCE.createYEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YPRIMITIVE_TYPE__OWNED_ELEMENT,
				 YammDiagramFactory.eINSTANCE.createYEnumerationLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YPRIMITIVE_TYPE__OWNED_ELEMENT,
				 YammDiagramFactory.eINSTANCE.createYOperation()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YPRIMITIVE_TYPE__OWNED_ELEMENT,
				 YammDiagramFactory.eINSTANCE.createYPackage()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YPRIMITIVE_TYPE__OWNED_ELEMENT,
				 YammDiagramFactory.eINSTANCE.createYPackageImport()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YPRIMITIVE_TYPE__OWNED_ELEMENT,
				 YammDiagramFactory.eINSTANCE.createYParameter()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YPRIMITIVE_TYPE__OWNED_ELEMENT,
				 YammDiagramFactory.eINSTANCE.createYPrimitiveType()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YPRIMITIVE_TYPE__OWNED_ELEMENT,
				 YammDiagramFactory.eINSTANCE.createYProperty()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YPRIMITIVE_TYPE__OWNED_ELEMENT,
				 YammDiagramFactory.eINSTANCE.createYStateMachine()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YPRIMITIVE_TYPE__OWNED_ELEMENT,
				 YammDiagramFactory.eINSTANCE.createYTransition()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YPRIMITIVE_TYPE__OWNED_ELEMENT,
				 YammDiagramFactory.eINSTANCE.createYTrAttachment()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YPRIMITIVE_TYPE__OWNED_ELEMENT,
				 YammDiagramFactory.eINSTANCE.createYPseudostate()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YPRIMITIVE_TYPE__OWNED_ELEMENT,
				 YammDiagramFactory.eINSTANCE.createYFinalState()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YPRIMITIVE_TYPE__OWNED_ELEMENT,
				 YammDiagramFactory.eINSTANCE.createYState()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YPRIMITIVE_TYPE__OWNED_MEMBER,
				 YammDiagramFactory.eINSTANCE.createYClass()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YPRIMITIVE_TYPE__OWNED_MEMBER,
				 YammDiagramFactory.eINSTANCE.createYConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YPRIMITIVE_TYPE__OWNED_MEMBER,
				 YammDiagramFactory.eINSTANCE.createYEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YPRIMITIVE_TYPE__OWNED_MEMBER,
				 YammDiagramFactory.eINSTANCE.createYEnumerationLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YPRIMITIVE_TYPE__OWNED_MEMBER,
				 YammDiagramFactory.eINSTANCE.createYNamedElement()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YPRIMITIVE_TYPE__OWNED_MEMBER,
				 YammDiagramFactory.eINSTANCE.createYOperation()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YPRIMITIVE_TYPE__OWNED_MEMBER,
				 YammDiagramFactory.eINSTANCE.createYPackage()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YPRIMITIVE_TYPE__OWNED_MEMBER,
				 YammDiagramFactory.eINSTANCE.createYPackageableElement()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YPRIMITIVE_TYPE__OWNED_MEMBER,
				 YammDiagramFactory.eINSTANCE.createYParameter()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YPRIMITIVE_TYPE__OWNED_MEMBER,
				 YammDiagramFactory.eINSTANCE.createYPrimitiveType()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YPRIMITIVE_TYPE__OWNED_MEMBER,
				 YammDiagramFactory.eINSTANCE.createYProperty()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YPRIMITIVE_TYPE__OWNED_MEMBER,
				 YammDiagramFactory.eINSTANCE.createYType()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YPRIMITIVE_TYPE__OWNED_MEMBER,
				 YammDiagramFactory.eINSTANCE.createYStateMachine()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YPRIMITIVE_TYPE__OWNED_MEMBER,
				 YammDiagramFactory.eINSTANCE.createYTransition()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YPRIMITIVE_TYPE__OWNED_MEMBER,
				 YammDiagramFactory.eINSTANCE.createYTrAttachment()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YPRIMITIVE_TYPE__OWNED_MEMBER,
				 YammDiagramFactory.eINSTANCE.createYPseudostate()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YPRIMITIVE_TYPE__OWNED_MEMBER,
				 YammDiagramFactory.eINSTANCE.createYFinalState()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YPRIMITIVE_TYPE__OWNED_MEMBER,
				 YammDiagramFactory.eINSTANCE.createYState()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YPRIMITIVE_TYPE__OWNED_RULE,
				 YammDiagramFactory.eINSTANCE.createYConstraint()));
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
			childFeature == YammDiagramPackage.Literals.YPRIMITIVE_TYPE__OWNED_COMMENT ||
			childFeature == YammDiagramPackage.Literals.YPRIMITIVE_TYPE__OWNED_ELEMENT ||
			childFeature == YammDiagramPackage.Literals.YPRIMITIVE_TYPE__OWNED_MEMBER ||
			childFeature == YammDiagramPackage.Literals.YPRIMITIVE_TYPE__OWNED_RULE;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
