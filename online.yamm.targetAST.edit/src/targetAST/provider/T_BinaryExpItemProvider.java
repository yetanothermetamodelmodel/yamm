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

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import targetAST.T_BinaryExp;
import targetAST.TargetASTFactory;
import targetAST.TargetASTPackage;

/**
 * This is the item provider adapter for a {@link targetAST.T_BinaryExp} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class T_BinaryExpItemProvider extends T_ExpLevelAItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T_BinaryExpItemProvider(AdapterFactory adapterFactory) {
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

			addOperatorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Operator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOperatorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_T_BinaryExp_operator_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_T_BinaryExp_operator_feature", "_UI_T_BinaryExp_type"),
				 TargetASTPackage.Literals.TBINARY_EXP__OPERATOR,
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
			childrenFeatures.add(TargetASTPackage.Literals.TBINARY_EXP__LEFT_OPERAND);
			childrenFeatures.add(TargetASTPackage.Literals.TBINARY_EXP__RIGHT_OPERAND);
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
	 * This returns T_BinaryExp.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/T_BinaryExp"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((T_BinaryExp)object).getCastTo();
		return label == null || label.length() == 0 ?
			getString("_UI_T_BinaryExp_type") :
			getString("_UI_T_BinaryExp_type") + " " + label;
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

		switch (notification.getFeatureID(T_BinaryExp.class)) {
			case TargetASTPackage.TBINARY_EXP__OPERATOR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case TargetASTPackage.TBINARY_EXP__LEFT_OPERAND:
			case TargetASTPackage.TBINARY_EXP__RIGHT_OPERAND:
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
				(TargetASTPackage.Literals.TBINARY_EXP__LEFT_OPERAND,
				 TargetASTFactory.eINSTANCE.createTargetASTRoot()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TBINARY_EXP__LEFT_OPERAND,
				 TargetASTFactory.eINSTANCE.createT_BinaryExp()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TBINARY_EXP__LEFT_OPERAND,
				 TargetASTFactory.eINSTANCE.createT_Get()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TBINARY_EXP__LEFT_OPERAND,
				 TargetASTFactory.eINSTANCE.createT_Set()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TBINARY_EXP__LEFT_OPERAND,
				 TargetASTFactory.eINSTANCE.createT_ExtCall()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TBINARY_EXP__LEFT_OPERAND,
				 TargetASTFactory.eINSTANCE.createT_Literal()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TBINARY_EXP__LEFT_OPERAND,
				 TargetASTFactory.eINSTANCE.createT_InstanceOfExp()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TBINARY_EXP__LEFT_OPERAND,
				 TargetASTFactory.eINSTANCE.createT_UnaryExp()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TBINARY_EXP__LEFT_OPERAND,
				 TargetASTFactory.eINSTANCE.createT_CreateInstanceExp()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TBINARY_EXP__LEFT_OPERAND,
				 TargetASTFactory.eINSTANCE.createT_PrintExp()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TBINARY_EXP__LEFT_OPERAND,
				 TargetASTFactory.eINSTANCE.createT_GetInstancesOfExp()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TBINARY_EXP__LEFT_OPERAND,
				 TargetASTFactory.eINSTANCE.createT_SetReturn()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TBINARY_EXP__LEFT_OPERAND,
				 TargetASTFactory.eINSTANCE.createT_ExtConstructor()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TBINARY_EXP__LEFT_OPERAND,
				 TargetASTFactory.eINSTANCE.createT_ExtType()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TBINARY_EXP__LEFT_OPERAND,
				 TargetASTFactory.eINSTANCE.createT_ExtAttrCall()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TBINARY_EXP__LEFT_OPERAND,
				 TargetASTFactory.eINSTANCE.createT_OpCall()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TBINARY_EXP__LEFT_OPERAND,
				 TargetASTFactory.eINSTANCE.createT_ColorDFA()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TBINARY_EXP__LEFT_OPERAND,
				 TargetASTFactory.eINSTANCE.createT_GetInstances()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TBINARY_EXP__LEFT_OPERAND,
				 TargetASTFactory.eINSTANCE.createT_CountFinalStates()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TBINARY_EXP__LEFT_OPERAND,
				 TargetASTFactory.eINSTANCE.createT_CountInitialStates()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TBINARY_EXP__LEFT_OPERAND,
				 TargetASTFactory.eINSTANCE.createT_CountStates()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TBINARY_EXP__LEFT_OPERAND,
				 TargetASTFactory.eINSTANCE.createT_SetAbsoluteNodePropability()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TBINARY_EXP__LEFT_OPERAND,
				 TargetASTFactory.eINSTANCE.createT_CountReachableStates()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TBINARY_EXP__LEFT_OPERAND,
				 TargetASTFactory.eINSTANCE.createT_CountInValidTransitions()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TBINARY_EXP__LEFT_OPERAND,
				 TargetASTFactory.eINSTANCE.createT_SetPopulationSize()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TBINARY_EXP__LEFT_OPERAND,
				 TargetASTFactory.eINSTANCE.createT_GetLayerInformation()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TBINARY_EXP__LEFT_OPERAND,
				 TargetASTFactory.eINSTANCE.createT_GetObjectManagement()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TBINARY_EXP__LEFT_OPERAND,
				 TargetASTFactory.eINSTANCE.createT_LoadModel()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TBINARY_EXP__LEFT_OPERAND,
				 TargetASTFactory.eINSTANCE.createT_GetEnumLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TBINARY_EXP__LEFT_OPERAND,
				 TargetASTFactory.eINSTANCE.createT_DesEventQueuePeek()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TBINARY_EXP__LEFT_OPERAND,
				 TargetASTFactory.eINSTANCE.createT_DesEventQueueConsume()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TBINARY_EXP__LEFT_OPERAND,
				 TargetASTFactory.eINSTANCE.createT_DesQueuePeek()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TBINARY_EXP__LEFT_OPERAND,
				 TargetASTFactory.eINSTANCE.createT_DesQueueConsume()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TBINARY_EXP__LEFT_OPERAND,
				 TargetASTFactory.eINSTANCE.createT_Type()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TBINARY_EXP__LEFT_OPERAND,
				 TargetASTFactory.eINSTANCE.createT_TimeStep()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TBINARY_EXP__LEFT_OPERAND,
				 TargetASTFactory.eINSTANCE.createT_ObserverAddValue()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TBINARY_EXP__LEFT_OPERAND,
				 TargetASTFactory.eINSTANCE.createT_GetInstanceForStaticAccess()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TBINARY_EXP__RIGHT_OPERAND,
				 TargetASTFactory.eINSTANCE.createTargetASTRoot()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TBINARY_EXP__RIGHT_OPERAND,
				 TargetASTFactory.eINSTANCE.createT_BinaryExp()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TBINARY_EXP__RIGHT_OPERAND,
				 TargetASTFactory.eINSTANCE.createT_Get()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TBINARY_EXP__RIGHT_OPERAND,
				 TargetASTFactory.eINSTANCE.createT_Set()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TBINARY_EXP__RIGHT_OPERAND,
				 TargetASTFactory.eINSTANCE.createT_ExtCall()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TBINARY_EXP__RIGHT_OPERAND,
				 TargetASTFactory.eINSTANCE.createT_Literal()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TBINARY_EXP__RIGHT_OPERAND,
				 TargetASTFactory.eINSTANCE.createT_InstanceOfExp()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TBINARY_EXP__RIGHT_OPERAND,
				 TargetASTFactory.eINSTANCE.createT_UnaryExp()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TBINARY_EXP__RIGHT_OPERAND,
				 TargetASTFactory.eINSTANCE.createT_CreateInstanceExp()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TBINARY_EXP__RIGHT_OPERAND,
				 TargetASTFactory.eINSTANCE.createT_PrintExp()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TBINARY_EXP__RIGHT_OPERAND,
				 TargetASTFactory.eINSTANCE.createT_GetInstancesOfExp()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TBINARY_EXP__RIGHT_OPERAND,
				 TargetASTFactory.eINSTANCE.createT_SetReturn()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TBINARY_EXP__RIGHT_OPERAND,
				 TargetASTFactory.eINSTANCE.createT_ExtConstructor()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TBINARY_EXP__RIGHT_OPERAND,
				 TargetASTFactory.eINSTANCE.createT_ExtType()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TBINARY_EXP__RIGHT_OPERAND,
				 TargetASTFactory.eINSTANCE.createT_ExtAttrCall()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TBINARY_EXP__RIGHT_OPERAND,
				 TargetASTFactory.eINSTANCE.createT_OpCall()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TBINARY_EXP__RIGHT_OPERAND,
				 TargetASTFactory.eINSTANCE.createT_ColorDFA()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TBINARY_EXP__RIGHT_OPERAND,
				 TargetASTFactory.eINSTANCE.createT_GetInstances()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TBINARY_EXP__RIGHT_OPERAND,
				 TargetASTFactory.eINSTANCE.createT_CountFinalStates()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TBINARY_EXP__RIGHT_OPERAND,
				 TargetASTFactory.eINSTANCE.createT_CountInitialStates()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TBINARY_EXP__RIGHT_OPERAND,
				 TargetASTFactory.eINSTANCE.createT_CountStates()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TBINARY_EXP__RIGHT_OPERAND,
				 TargetASTFactory.eINSTANCE.createT_SetAbsoluteNodePropability()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TBINARY_EXP__RIGHT_OPERAND,
				 TargetASTFactory.eINSTANCE.createT_CountReachableStates()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TBINARY_EXP__RIGHT_OPERAND,
				 TargetASTFactory.eINSTANCE.createT_CountInValidTransitions()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TBINARY_EXP__RIGHT_OPERAND,
				 TargetASTFactory.eINSTANCE.createT_SetPopulationSize()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TBINARY_EXP__RIGHT_OPERAND,
				 TargetASTFactory.eINSTANCE.createT_GetLayerInformation()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TBINARY_EXP__RIGHT_OPERAND,
				 TargetASTFactory.eINSTANCE.createT_GetObjectManagement()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TBINARY_EXP__RIGHT_OPERAND,
				 TargetASTFactory.eINSTANCE.createT_LoadModel()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TBINARY_EXP__RIGHT_OPERAND,
				 TargetASTFactory.eINSTANCE.createT_GetEnumLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TBINARY_EXP__RIGHT_OPERAND,
				 TargetASTFactory.eINSTANCE.createT_DesEventQueuePeek()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TBINARY_EXP__RIGHT_OPERAND,
				 TargetASTFactory.eINSTANCE.createT_DesEventQueueConsume()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TBINARY_EXP__RIGHT_OPERAND,
				 TargetASTFactory.eINSTANCE.createT_DesQueuePeek()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TBINARY_EXP__RIGHT_OPERAND,
				 TargetASTFactory.eINSTANCE.createT_DesQueueConsume()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TBINARY_EXP__RIGHT_OPERAND,
				 TargetASTFactory.eINSTANCE.createT_Type()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TBINARY_EXP__RIGHT_OPERAND,
				 TargetASTFactory.eINSTANCE.createT_TimeStep()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TBINARY_EXP__RIGHT_OPERAND,
				 TargetASTFactory.eINSTANCE.createT_ObserverAddValue()));

		newChildDescriptors.add
			(createChildParameter
				(TargetASTPackage.Literals.TBINARY_EXP__RIGHT_OPERAND,
				 TargetASTFactory.eINSTANCE.createT_GetInstanceForStaticAccess()));
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
			childFeature == TargetASTPackage.Literals.TEXP_LEVEL_A__OBJECT ||
			childFeature == TargetASTPackage.Literals.TBINARY_EXP__LEFT_OPERAND ||
			childFeature == TargetASTPackage.Literals.TBINARY_EXP__RIGHT_OPERAND;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
