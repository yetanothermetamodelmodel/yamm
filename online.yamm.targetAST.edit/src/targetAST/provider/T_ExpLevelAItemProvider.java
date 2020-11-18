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
package targetAST.provider;


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

import targetAST.T_ExpLevelA;
import targetAST.TargetASTFactory;
import targetAST.TargetASTPackage;

/**
 * This is the item provider adapter for a {@link targetAST.T_ExpLevelA} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class T_ExpLevelAItemProvider 
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
	public T_ExpLevelAItemProvider(AdapterFactory adapterFactory) {
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

			addCastToPropertyDescriptor(object);
			addCastToPrimitiveMethodCallPropertyDescriptor(object);
			addCastToPrimitivePropertyDescriptor(object);
			addPrimitiveToWrapperPropertyDescriptor(object);
			addCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Cast To feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCastToPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_T_ExpLevelA_castTo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_T_ExpLevelA_castTo_feature", "_UI_T_ExpLevelA_type"),
				 TargetASTPackage.Literals.TEXP_LEVEL_A__CAST_TO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cast To Primitive Method Call feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCastToPrimitiveMethodCallPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_T_ExpLevelA_castToPrimitiveMethodCall_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_T_ExpLevelA_castToPrimitiveMethodCall_feature", "_UI_T_ExpLevelA_type"),
				 TargetASTPackage.Literals.TEXP_LEVEL_A__CAST_TO_PRIMITIVE_METHOD_CALL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cast To Primitive feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCastToPrimitivePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_T_ExpLevelA_castToPrimitive_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_T_ExpLevelA_castToPrimitive_feature", "_UI_T_ExpLevelA_type"),
				 TargetASTPackage.Literals.TEXP_LEVEL_A__CAST_TO_PRIMITIVE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Primitive To Wrapper feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrimitiveToWrapperPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_T_ExpLevelA_primitiveToWrapper_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_T_ExpLevelA_primitiveToWrapper_feature", "_UI_T_ExpLevelA_type"),
				 TargetASTPackage.Literals.TEXP_LEVEL_A__PRIMITIVE_TO_WRAPPER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Code feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_T_ExpLevelA_Code_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_T_ExpLevelA_Code_feature", "_UI_T_ExpLevelA_type"),
				 TargetASTPackage.Literals.TEXP_LEVEL_A__CODE,
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
			childrenFeatures.add(TargetASTPackage.Literals.TEXP_LEVEL_A__OBJECT);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((T_ExpLevelA)object).getCastTo();
		return label == null || label.length() == 0 ?
			getString("_UI_T_ExpLevelA_type") :
			getString("_UI_T_ExpLevelA_type") + " " + label;
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

		switch (notification.getFeatureID(T_ExpLevelA.class)) {
			case TargetASTPackage.TEXP_LEVEL_A__CAST_TO:
			case TargetASTPackage.TEXP_LEVEL_A__CAST_TO_PRIMITIVE_METHOD_CALL:
			case TargetASTPackage.TEXP_LEVEL_A__CAST_TO_PRIMITIVE:
			case TargetASTPackage.TEXP_LEVEL_A__PRIMITIVE_TO_WRAPPER:
			case TargetASTPackage.TEXP_LEVEL_A__CODE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case TargetASTPackage.TEXP_LEVEL_A__OBJECT:
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
				(TargetASTPackage.Literals.TEXP_LEVEL_A__OBJECT,
				 TargetASTFactory.eINSTANCE.createTargetASTRoot()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TEXP_LEVEL_A__OBJECT,
				 TargetASTFactory.eINSTANCE.createT_BinaryExp()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TEXP_LEVEL_A__OBJECT,
				 TargetASTFactory.eINSTANCE.createT_Get()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TEXP_LEVEL_A__OBJECT,
				 TargetASTFactory.eINSTANCE.createT_Set()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TEXP_LEVEL_A__OBJECT,
				 TargetASTFactory.eINSTANCE.createT_ExtCall()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TEXP_LEVEL_A__OBJECT,
				 TargetASTFactory.eINSTANCE.createT_Literal()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TEXP_LEVEL_A__OBJECT,
				 TargetASTFactory.eINSTANCE.createT_InstanceOfExp()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TEXP_LEVEL_A__OBJECT,
				 TargetASTFactory.eINSTANCE.createT_UnaryExp()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TEXP_LEVEL_A__OBJECT,
				 TargetASTFactory.eINSTANCE.createT_CreateInstanceExp()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TEXP_LEVEL_A__OBJECT,
				 TargetASTFactory.eINSTANCE.createT_PrintExp()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TEXP_LEVEL_A__OBJECT,
				 TargetASTFactory.eINSTANCE.createT_GetInstancesOfExp()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TEXP_LEVEL_A__OBJECT,
				 TargetASTFactory.eINSTANCE.createT_SetReturn()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TEXP_LEVEL_A__OBJECT,
				 TargetASTFactory.eINSTANCE.createT_ExtConstructor()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TEXP_LEVEL_A__OBJECT,
				 TargetASTFactory.eINSTANCE.createT_ExtType()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TEXP_LEVEL_A__OBJECT,
				 TargetASTFactory.eINSTANCE.createT_ExtAttrCall()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TEXP_LEVEL_A__OBJECT,
				 TargetASTFactory.eINSTANCE.createT_OpCall()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TEXP_LEVEL_A__OBJECT,
				 TargetASTFactory.eINSTANCE.createT_ColorDFA()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TEXP_LEVEL_A__OBJECT,
				 TargetASTFactory.eINSTANCE.createT_GetInstances()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TEXP_LEVEL_A__OBJECT,
				 TargetASTFactory.eINSTANCE.createT_CountFinalStates()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TEXP_LEVEL_A__OBJECT,
				 TargetASTFactory.eINSTANCE.createT_CountInitialStates()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TEXP_LEVEL_A__OBJECT,
				 TargetASTFactory.eINSTANCE.createT_CountStates()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TEXP_LEVEL_A__OBJECT,
				 TargetASTFactory.eINSTANCE.createT_SetAbsoluteNodePropability()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TEXP_LEVEL_A__OBJECT,
				 TargetASTFactory.eINSTANCE.createT_CountReachableStates()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TEXP_LEVEL_A__OBJECT,
				 TargetASTFactory.eINSTANCE.createT_CountInValidTransitions()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TEXP_LEVEL_A__OBJECT,
				 TargetASTFactory.eINSTANCE.createT_SetPopulationSize()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TEXP_LEVEL_A__OBJECT,
				 TargetASTFactory.eINSTANCE.createT_GetLayerInformation()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TEXP_LEVEL_A__OBJECT,
				 TargetASTFactory.eINSTANCE.createT_GetObjectManagement()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TEXP_LEVEL_A__OBJECT,
				 TargetASTFactory.eINSTANCE.createT_LoadModel()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TEXP_LEVEL_A__OBJECT,
				 TargetASTFactory.eINSTANCE.createT_GetEnumLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TEXP_LEVEL_A__OBJECT,
				 TargetASTFactory.eINSTANCE.createT_DesEventQueuePeek()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TEXP_LEVEL_A__OBJECT,
				 TargetASTFactory.eINSTANCE.createT_DesEventQueueConsume()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TEXP_LEVEL_A__OBJECT,
				 TargetASTFactory.eINSTANCE.createT_DesQueuePeek()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TEXP_LEVEL_A__OBJECT,
				 TargetASTFactory.eINSTANCE.createT_DesQueueConsume()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TEXP_LEVEL_A__OBJECT,
				 TargetASTFactory.eINSTANCE.createT_Type()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TEXP_LEVEL_A__OBJECT,
				 TargetASTFactory.eINSTANCE.createT_TimeStep()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TEXP_LEVEL_A__OBJECT,
				 TargetASTFactory.eINSTANCE.createT_ObserverAddValue()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TEXP_LEVEL_A__OBJECT,
				 TargetASTFactory.eINSTANCE.createT_GetInstanceForStaticAccess()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return TargetASTEditPlugin.INSTANCE;
	}

}
