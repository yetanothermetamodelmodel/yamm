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
package dev.yamm.ObjectDiagram.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import dev.yamm.ObjectDiagram.ObjectDiagram;
import dev.yamm.ObjectDiagram.ObjectDiagramFactory;
import dev.yamm.ObjectDiagram.ObjectDiagramPackage;

/**
 * This is the item provider adapter for a {@link dev.yamm.ObjectDiagram.ObjectDiagram} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ObjectDiagramItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectDiagramItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addYammModelPathPropertyDescriptor(object);
			addMetaDataPackagePropertyDescriptor(object);
			addTypeObjectCreatePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Yamm Model Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addYammModelPathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ObjectDiagram_yammModelPath_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ObjectDiagram_yammModelPath_feature", "_UI_ObjectDiagram_type"),
				 ObjectDiagramPackage.Literals.OBJECT_DIAGRAM__YAMM_MODEL_PATH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Meta Data Package feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMetaDataPackagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ObjectDiagram_metaDataPackage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ObjectDiagram_metaDataPackage_feature", "_UI_ObjectDiagram_type"),
				 ObjectDiagramPackage.Literals.OBJECT_DIAGRAM__META_DATA_PACKAGE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type Object Create feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypeObjectCreatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ObjectDiagram_typeObjectCreate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ObjectDiagram_typeObjectCreate_feature", "_UI_ObjectDiagram_type"),
				 ObjectDiagramPackage.Literals.OBJECT_DIAGRAM__TYPE_OBJECT_CREATE,
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
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ObjectDiagramPackage.Literals.OBJECT_DIAGRAM__OBJECTS);
			childrenFeatures.add(ObjectDiagramPackage.Literals.OBJECT_DIAGRAM__TYPES);
			childrenFeatures.add(ObjectDiagramPackage.Literals.OBJECT_DIAGRAM__DATA_TYPES);
			childrenFeatures.add(ObjectDiagramPackage.Literals.OBJECT_DIAGRAM__STACKFRAMES);
			childrenFeatures.add(ObjectDiagramPackage.Literals.OBJECT_DIAGRAM__INITIAL_MODEL);
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
	 * This returns ObjectDiagram.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ObjectDiagram"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ObjectDiagram)object).getYammModelPath();
		return label == null || label.length() == 0 ?
			getString("_UI_ObjectDiagram_type") :
			getString("_UI_ObjectDiagram_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ObjectDiagram.class)) {
			case ObjectDiagramPackage.OBJECT_DIAGRAM__YAMM_MODEL_PATH:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ObjectDiagramPackage.OBJECT_DIAGRAM__OBJECTS:
			case ObjectDiagramPackage.OBJECT_DIAGRAM__TYPES:
			case ObjectDiagramPackage.OBJECT_DIAGRAM__DATA_TYPES:
			case ObjectDiagramPackage.OBJECT_DIAGRAM__STACKFRAMES:
			case ObjectDiagramPackage.OBJECT_DIAGRAM__INITIAL_MODEL:
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
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ObjectDiagramPackage.Literals.OBJECT_DIAGRAM__OBJECTS,
				 ObjectDiagramFactory.eINSTANCE.createODObject()));

		newChildDescriptors.add
			(createChildParameter
				(ObjectDiagramPackage.Literals.OBJECT_DIAGRAM__TYPES,
				 ObjectDiagramFactory.eINSTANCE.create(ObjectDiagramPackage.Literals.ESTRING_TO_OD_TYPE_MAP)));

		newChildDescriptors.add
			(createChildParameter
				(ObjectDiagramPackage.Literals.OBJECT_DIAGRAM__DATA_TYPES,
				 ObjectDiagramFactory.eINSTANCE.create(ObjectDiagramPackage.Literals.ESTRING_TO_OD_TYPE_MAP)));

		newChildDescriptors.add
			(createChildParameter
				(ObjectDiagramPackage.Literals.OBJECT_DIAGRAM__STACKFRAMES,
				 ObjectDiagramFactory.eINSTANCE.createODStackframe()));

		newChildDescriptors.add
			(createChildParameter
				(ObjectDiagramPackage.Literals.OBJECT_DIAGRAM__INITIAL_MODEL,
				 ObjectDiagramFactory.eINSTANCE.createODObject()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == ObjectDiagramPackage.Literals.OBJECT_DIAGRAM__OBJECTS ||
			childFeature == ObjectDiagramPackage.Literals.OBJECT_DIAGRAM__INITIAL_MODEL ||
			childFeature == ObjectDiagramPackage.Literals.OBJECT_DIAGRAM__TYPES ||
			childFeature == ObjectDiagramPackage.Literals.OBJECT_DIAGRAM__DATA_TYPES;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ObjectDiagramEditPlugin.INSTANCE;
	}

}
