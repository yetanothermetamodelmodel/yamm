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
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.xtext.common.types.TypesFactory;

import org.eclipse.xtext.xbase.XbaseFactory;

import dev.yamm.coreModelDiagram.yammDiagram.YModel;
import dev.yamm.coreModelDiagram.yammDiagram.YammDiagramFactory;
import dev.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage;

/**
 * This is the item provider adapter for a {@link dev.yamm.coreModelDiagram.yammDiagram.YModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class YModelItemProvider extends YObjectItemProvider
{
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YModelItemProvider(AdapterFactory adapterFactory)
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
			childrenFeatures.add(YammDiagramPackage.Literals.YMODEL__CLAZZ);
			childrenFeatures.add(YammDiagramPackage.Literals.YMODEL__ENUMERATIONS);
			childrenFeatures.add(YammDiagramPackage.Literals.YMODEL__PACKAGES);
			childrenFeatures.add(YammDiagramPackage.Literals.YMODEL__OBJECTS);
			childrenFeatures.add(YammDiagramPackage.Literals.YMODEL__SHARED_EDGES);
			childrenFeatures.add(YammDiagramPackage.Literals.YMODEL__COMPOSITE_EDGES);
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
	 * This returns YModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/YModel"));
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
		String label = ((YModel)object).getObjectID();
		return label == null || label.length() == 0 ?
			getString("_UI_YModel_type") :
			getString("_UI_YModel_type") + " " + label;
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

		switch (notification.getFeatureID(YModel.class)) {
			case YammDiagramPackage.YMODEL__CLAZZ:
			case YammDiagramPackage.YMODEL__ENUMERATIONS:
			case YammDiagramPackage.YMODEL__PACKAGES:
			case YammDiagramPackage.YMODEL__OBJECTS:
			case YammDiagramPackage.YMODEL__SHARED_EDGES:
			case YammDiagramPackage.YMODEL__COMPOSITE_EDGES:
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
				(YammDiagramPackage.Literals.YMODEL__CLAZZ,
				 YammDiagramFactory.eINSTANCE.createYClass()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__ENUMERATIONS,
				 YammDiagramFactory.eINSTANCE.createYEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__PACKAGES,
				 YammDiagramFactory.eINSTANCE.createYPackage()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 YammDiagramFactory.eINSTANCE.createYObject()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 YammDiagramFactory.eINSTANCE.createYElement()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 YammDiagramFactory.eINSTANCE.createYClass()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 YammDiagramFactory.eINSTANCE.createYClassifier()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 YammDiagramFactory.eINSTANCE.createYComment()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 YammDiagramFactory.eINSTANCE.createYConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 YammDiagramFactory.eINSTANCE.createYDataType()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 YammDiagramFactory.eINSTANCE.createYElementImport()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 YammDiagramFactory.eINSTANCE.createYEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 YammDiagramFactory.eINSTANCE.createYEnumerationLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 YammDiagramFactory.eINSTANCE.createYFeature()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 YammDiagramFactory.eINSTANCE.createYNamedElement()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 YammDiagramFactory.eINSTANCE.createYNamespace()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 YammDiagramFactory.eINSTANCE.createYOperation()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 YammDiagramFactory.eINSTANCE.createYPackage()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 YammDiagramFactory.eINSTANCE.createYPackageableElement()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 YammDiagramFactory.eINSTANCE.createYPackageImport()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 YammDiagramFactory.eINSTANCE.createYParameter()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 YammDiagramFactory.eINSTANCE.createYPrimitiveType()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 YammDiagramFactory.eINSTANCE.createYProperty()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 YammDiagramFactory.eINSTANCE.createYType()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 YammDiagramFactory.eINSTANCE.createYStateMachine()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 YammDiagramFactory.eINSTANCE.createYTransition()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 YammDiagramFactory.eINSTANCE.createYTrAttachment()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 YammDiagramFactory.eINSTANCE.createYEffect()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 YammDiagramFactory.eINSTANCE.createYVertex()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 YammDiagramFactory.eINSTANCE.createYPseudostate()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 YammDiagramFactory.eINSTANCE.createYFinalState()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 YammDiagramFactory.eINSTANCE.createYState()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 YammDiagramFactory.eINSTANCE.createYModel()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 YammDiagramFactory.eINSTANCE.createYSharedEdge()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 YammDiagramFactory.eINSTANCE.createYCompositeEdge()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 YammDiagramFactory.eINSTANCE.createYStateMachineHandler()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 YammDiagramFactory.eINSTANCE.createYGlobalStateMachine()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 YammDiagramFactory.eINSTANCE.createYCreateInstanceExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 YammDiagramFactory.eINSTANCE.createYPrintExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 YammDiagramFactory.eINSTANCE.createYSetReturnValue()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 YammDiagramFactory.eINSTANCE.createYGetInstancesOfExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 YammDiagramFactory.eINSTANCE.createYMemberFeatureCall()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 YammDiagramFactory.eINSTANCE.createYFeatureCall()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 YammDiagramFactory.eINSTANCE.createYGetObjectManagement()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 YammDiagramFactory.eINSTANCE.createYGetLayerInformation()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 YammDiagramFactory.eINSTANCE.createYColorDFAObject()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 YammDiagramFactory.eINSTANCE.createYGetInstances()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 YammDiagramFactory.eINSTANCE.createYCountFinalStates()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 YammDiagramFactory.eINSTANCE.createYCountInitialStates()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 YammDiagramFactory.eINSTANCE.createYCountStates()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 YammDiagramFactory.eINSTANCE.createYSetAbsoluteNodePropability()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 YammDiagramFactory.eINSTANCE.createYCountReachableStates()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 YammDiagramFactory.eINSTANCE.createYCountInValidTransitions()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 YammDiagramFactory.eINSTANCE.createYSetPopulationSize()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 YammDiagramFactory.eINSTANCE.createYLoadModel()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 YammDiagramFactory.eINSTANCE.createDslInfo()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 YammDiagramFactory.eINSTANCE.createFeatureInfo()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 YammDiagramFactory.eINSTANCE.createSingleLinePropertyInfo()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 YammDiagramFactory.eINSTANCE.createGuardInfo()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 YammDiagramFactory.eINSTANCE.createEffectInfo()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 YammDiagramFactory.eINSTANCE.createContainmentInfo()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 YammDiagramFactory.eINSTANCE.create(YammDiagramPackage.Literals.ESTRUCTURAL_FEATURE_TO_FEATURE_INFO_MAP)));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 YammDiagramFactory.eINSTANCE.createLine()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 YammDiagramFactory.eINSTANCE.createYStructure()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 YammDiagramFactory.eINSTANCE.createYObserverAddValue()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 EcoreFactory.eINSTANCE.createEAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 EcoreFactory.eINSTANCE.createEAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 EcoreFactory.eINSTANCE.createEClass()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 EcoreFactory.eINSTANCE.createEDataType()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 EcoreFactory.eINSTANCE.createEEnum()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 EcoreFactory.eINSTANCE.createEEnumLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 EcoreFactory.eINSTANCE.createEFactory()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 EcoreFactory.eINSTANCE.createEObject()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 EcoreFactory.eINSTANCE.createEOperation()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 EcoreFactory.eINSTANCE.createEPackage()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 EcoreFactory.eINSTANCE.createEParameter()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 EcoreFactory.eINSTANCE.createEReference()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 EcoreFactory.eINSTANCE.create(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY)));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 EcoreFactory.eINSTANCE.createEGenericType()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 EcoreFactory.eINSTANCE.createETypeParameter()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 TypesFactory.eINSTANCE.createJvmVoid()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 TypesFactory.eINSTANCE.createJvmPrimitiveType()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 TypesFactory.eINSTANCE.createJvmArrayType()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 TypesFactory.eINSTANCE.createJvmTypeParameter()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 TypesFactory.eINSTANCE.createJvmUpperBound()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 TypesFactory.eINSTANCE.createJvmLowerBound()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 TypesFactory.eINSTANCE.createJvmAnnotationType()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 TypesFactory.eINSTANCE.createJvmEnumerationType()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 TypesFactory.eINSTANCE.createJvmField()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 TypesFactory.eINSTANCE.createJvmEnumerationLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 TypesFactory.eINSTANCE.createJvmGenericType()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 TypesFactory.eINSTANCE.createJvmParameterizedTypeReference()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 TypesFactory.eINSTANCE.createJvmGenericArrayTypeReference()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 TypesFactory.eINSTANCE.createJvmWildcardTypeReference()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 TypesFactory.eINSTANCE.createJvmAnyTypeReference()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 TypesFactory.eINSTANCE.createJvmMultiTypeReference()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 TypesFactory.eINSTANCE.createJvmConstructor()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 TypesFactory.eINSTANCE.createJvmOperation()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 TypesFactory.eINSTANCE.createJvmFormalParameter()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 TypesFactory.eINSTANCE.createJvmAnnotationReference()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 TypesFactory.eINSTANCE.createJvmIntAnnotationValue()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 TypesFactory.eINSTANCE.createJvmBooleanAnnotationValue()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 TypesFactory.eINSTANCE.createJvmByteAnnotationValue()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 TypesFactory.eINSTANCE.createJvmShortAnnotationValue()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 TypesFactory.eINSTANCE.createJvmLongAnnotationValue()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 TypesFactory.eINSTANCE.createJvmDoubleAnnotationValue()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 TypesFactory.eINSTANCE.createJvmFloatAnnotationValue()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 TypesFactory.eINSTANCE.createJvmCharAnnotationValue()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 TypesFactory.eINSTANCE.createJvmStringAnnotationValue()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 TypesFactory.eINSTANCE.createJvmTypeAnnotationValue()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 TypesFactory.eINSTANCE.createJvmAnnotationAnnotationValue()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 TypesFactory.eINSTANCE.createJvmEnumAnnotationValue()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 TypesFactory.eINSTANCE.createJvmDelegateTypeReference()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 TypesFactory.eINSTANCE.createJvmSynonymTypeReference()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 TypesFactory.eINSTANCE.createJvmUnknownTypeReference()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 TypesFactory.eINSTANCE.createJvmCustomAnnotationValue()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 TypesFactory.eINSTANCE.createJvmInnerTypeReference()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 XbaseFactory.eINSTANCE.createXIfExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 XbaseFactory.eINSTANCE.createXSwitchExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 XbaseFactory.eINSTANCE.createXCasePart()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 XbaseFactory.eINSTANCE.createXBlockExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 XbaseFactory.eINSTANCE.createXVariableDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 XbaseFactory.eINSTANCE.createXMemberFeatureCall()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 XbaseFactory.eINSTANCE.createXFeatureCall()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 XbaseFactory.eINSTANCE.createXConstructorCall()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 XbaseFactory.eINSTANCE.createXBooleanLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 XbaseFactory.eINSTANCE.createXNullLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 XbaseFactory.eINSTANCE.createXNumberLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 XbaseFactory.eINSTANCE.createXStringLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 XbaseFactory.eINSTANCE.createXListLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 XbaseFactory.eINSTANCE.createXSetLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 XbaseFactory.eINSTANCE.createXClosure()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 XbaseFactory.eINSTANCE.createXCastedExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 XbaseFactory.eINSTANCE.createXBinaryOperation()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 XbaseFactory.eINSTANCE.createXUnaryOperation()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 XbaseFactory.eINSTANCE.createXPostfixOperation()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 XbaseFactory.eINSTANCE.createXForLoopExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 XbaseFactory.eINSTANCE.createXBasicForLoopExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 XbaseFactory.eINSTANCE.createXDoWhileExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 XbaseFactory.eINSTANCE.createXWhileExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 XbaseFactory.eINSTANCE.createXTypeLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 XbaseFactory.eINSTANCE.createXInstanceOfExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 XbaseFactory.eINSTANCE.createXThrowExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 XbaseFactory.eINSTANCE.createXTryCatchFinallyExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 XbaseFactory.eINSTANCE.createXCatchClause()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 XbaseFactory.eINSTANCE.createXAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 XbaseFactory.eINSTANCE.createXReturnExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__OBJECTS,
				 XbaseFactory.eINSTANCE.createXSynchronizedExpression()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__SHARED_EDGES,
				 YammDiagramFactory.eINSTANCE.createYSharedEdge()));

		newChildDescriptors.add
			(createChildParameter
				(YammDiagramPackage.Literals.YMODEL__COMPOSITE_EDGES,
				 YammDiagramFactory.eINSTANCE.createYCompositeEdge()));
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
			childFeature == YammDiagramPackage.Literals.YMODEL__CLAZZ ||
			childFeature == YammDiagramPackage.Literals.YMODEL__OBJECTS ||
			childFeature == YammDiagramPackage.Literals.YMODEL__ENUMERATIONS ||
			childFeature == YammDiagramPackage.Literals.YMODEL__PACKAGES ||
			childFeature == YammDiagramPackage.Literals.YMODEL__SHARED_EDGES ||
			childFeature == YammDiagramPackage.Literals.YMODEL__COMPOSITE_EDGES;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
