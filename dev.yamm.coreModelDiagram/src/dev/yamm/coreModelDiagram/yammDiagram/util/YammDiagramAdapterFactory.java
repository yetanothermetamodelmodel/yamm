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
package dev.yamm.coreModelDiagram.yammDiagram.util;

import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.XMemberFeatureCall;

import dev.yamm.coreModelDiagram.yammDiagram.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see dev.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage
 * @generated
 */
public class YammDiagramAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static YammDiagramPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YammDiagramAdapterFactory()
	{
		if (modelPackage == null) {
			modelPackage = YammDiagramPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object)
	{
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YammDiagramSwitch<Adapter> modelSwitch =
		new YammDiagramSwitch<Adapter>() {
			@Override
			public Adapter caseYClass(YClass object) {
				return createYClassAdapter();
			}
			@Override
			public Adapter caseYClassifier(YClassifier object) {
				return createYClassifierAdapter();
			}
			@Override
			public Adapter caseYComment(YComment object) {
				return createYCommentAdapter();
			}
			@Override
			public Adapter caseYConstraint(YConstraint object) {
				return createYConstraintAdapter();
			}
			@Override
			public Adapter caseYDataType(YDataType object) {
				return createYDataTypeAdapter();
			}
			@Override
			public Adapter caseYElement(YElement object) {
				return createYElementAdapter();
			}
			@Override
			public Adapter caseYElementImport(YElementImport object) {
				return createYElementImportAdapter();
			}
			@Override
			public Adapter caseYEnumeration(YEnumeration object) {
				return createYEnumerationAdapter();
			}
			@Override
			public Adapter caseYEnumerationLiteral(YEnumerationLiteral object) {
				return createYEnumerationLiteralAdapter();
			}
			@Override
			public Adapter caseYFeature(YFeature object) {
				return createYFeatureAdapter();
			}
			@Override
			public Adapter caseYNamedElement(YNamedElement object) {
				return createYNamedElementAdapter();
			}
			@Override
			public Adapter caseYNamespace(YNamespace object) {
				return createYNamespaceAdapter();
			}
			@Override
			public Adapter caseYOperation(YOperation object) {
				return createYOperationAdapter();
			}
			@Override
			public Adapter caseYPackage(YPackage object) {
				return createYPackageAdapter();
			}
			@Override
			public Adapter caseYPackageableElement(YPackageableElement object) {
				return createYPackageableElementAdapter();
			}
			@Override
			public Adapter caseYPackageImport(YPackageImport object) {
				return createYPackageImportAdapter();
			}
			@Override
			public Adapter caseYParameter(YParameter object) {
				return createYParameterAdapter();
			}
			@Override
			public Adapter caseYPrimitiveType(YPrimitiveType object) {
				return createYPrimitiveTypeAdapter();
			}
			@Override
			public Adapter caseYProperty(YProperty object) {
				return createYPropertyAdapter();
			}
			@Override
			public Adapter caseYType(YType object) {
				return createYTypeAdapter();
			}
			@Override
			public Adapter caseYStateMachine(YStateMachine object) {
				return createYStateMachineAdapter();
			}
			@Override
			public Adapter caseYTransition(YTransition object) {
				return createYTransitionAdapter();
			}
			@Override
			public Adapter caseYTrAttachment(YTrAttachment object) {
				return createYTrAttachmentAdapter();
			}
			@Override
			public Adapter caseYEffect(YEffect object) {
				return createYEffectAdapter();
			}
			@Override
			public Adapter caseYVertex(YVertex object) {
				return createYVertexAdapter();
			}
			@Override
			public Adapter caseYPseudostate(YPseudostate object) {
				return createYPseudostateAdapter();
			}
			@Override
			public Adapter caseYFinalState(YFinalState object) {
				return createYFinalStateAdapter();
			}
			@Override
			public Adapter caseYState(YState object) {
				return createYStateAdapter();
			}
			@Override
			public Adapter caseYModel(YModel object) {
				return createYModelAdapter();
			}
			@Override
			public Adapter caseYSharedEdge(YSharedEdge object) {
				return createYSharedEdgeAdapter();
			}
			@Override
			public Adapter caseYCompositeEdge(YCompositeEdge object) {
				return createYCompositeEdgeAdapter();
			}
			@Override
			public Adapter caseYObject(YObject object) {
				return createYObjectAdapter();
			}
			@Override
			public Adapter caseYStateMachineHandler(YStateMachineHandler object) {
				return createYStateMachineHandlerAdapter();
			}
			@Override
			public Adapter caseYGlobalStateMachine(YGlobalStateMachine object) {
				return createYGlobalStateMachineAdapter();
			}
			@Override
			public Adapter caseYCreateInstanceExpression(YCreateInstanceExpression object) {
				return createYCreateInstanceExpressionAdapter();
			}
			@Override
			public Adapter caseYPrintExpression(YPrintExpression object) {
				return createYPrintExpressionAdapter();
			}
			@Override
			public Adapter caseYSetReturnValue(YSetReturnValue object) {
				return createYSetReturnValueAdapter();
			}
			@Override
			public Adapter caseYGetInstancesOfExpression(YGetInstancesOfExpression object) {
				return createYGetInstancesOfExpressionAdapter();
			}
			@Override
			public Adapter caseYMemberFeatureCall(YMemberFeatureCall object) {
				return createYMemberFeatureCallAdapter();
			}
			@Override
			public Adapter caseYFeatureCall(YFeatureCall object) {
				return createYFeatureCallAdapter();
			}
			@Override
			public Adapter caseYGetObjectManagement(YGetObjectManagement object) {
				return createYGetObjectManagementAdapter();
			}
			@Override
			public Adapter caseYGetLayerInformation(YGetLayerInformation object) {
				return createYGetLayerInformationAdapter();
			}
			@Override
			public Adapter caseYColorDFAObject(YColorDFAObject object) {
				return createYColorDFAObjectAdapter();
			}
			@Override
			public Adapter caseYGetInstances(YGetInstances object) {
				return createYGetInstancesAdapter();
			}
			@Override
			public Adapter caseYCountFinalStates(YCountFinalStates object) {
				return createYCountFinalStatesAdapter();
			}
			@Override
			public Adapter caseYCountInitialStates(YCountInitialStates object) {
				return createYCountInitialStatesAdapter();
			}
			@Override
			public Adapter caseYCountStates(YCountStates object) {
				return createYCountStatesAdapter();
			}
			@Override
			public Adapter caseYSetAbsoluteNodePropability(YSetAbsoluteNodePropability object) {
				return createYSetAbsoluteNodePropabilityAdapter();
			}
			@Override
			public Adapter caseYCountReachableStates(YCountReachableStates object) {
				return createYCountReachableStatesAdapter();
			}
			@Override
			public Adapter caseYCountInValidTransitions(YCountInValidTransitions object) {
				return createYCountInValidTransitionsAdapter();
			}
			@Override
			public Adapter caseYSetPopulationSize(YSetPopulationSize object) {
				return createYSetPopulationSizeAdapter();
			}
			@Override
			public Adapter caseYLoadModel(YLoadModel object) {
				return createYLoadModelAdapter();
			}
			@Override
			public Adapter caseDslInfo(DslInfo object) {
				return createDslInfoAdapter();
			}
			@Override
			public Adapter caseFeatureInfo(FeatureInfo object) {
				return createFeatureInfoAdapter();
			}
			@Override
			public Adapter caseSingleLinePropertyInfo(SingleLinePropertyInfo object) {
				return createSingleLinePropertyInfoAdapter();
			}
			@Override
			public Adapter caseGuardInfo(GuardInfo object) {
				return createGuardInfoAdapter();
			}
			@Override
			public Adapter caseEffectInfo(EffectInfo object) {
				return createEffectInfoAdapter();
			}
			@Override
			public Adapter caseContainmentInfo(ContainmentInfo object) {
				return createContainmentInfoAdapter();
			}
			@Override
			public Adapter caseEStructuralFeatureToFeatureInfoMap(Map.Entry<EStructuralFeature, FeatureInfo> object) {
				return createEStructuralFeatureToFeatureInfoMapAdapter();
			}
			@Override
			public Adapter caseLine(Line object) {
				return createLineAdapter();
			}
			@Override
			public Adapter caseYStructure(YStructure object) {
				return createYStructureAdapter();
			}
			@Override
			public Adapter caseYObserverAddValue(YObserverAddValue object) {
				return createYObserverAddValueAdapter();
			}
			@Override
			public Adapter caseXExpression(XExpression object) {
				return createXExpressionAdapter();
			}
			@Override
			public Adapter caseXAbstractFeatureCall(XAbstractFeatureCall object) {
				return createXAbstractFeatureCallAdapter();
			}
			@Override
			public Adapter caseXMemberFeatureCall(XMemberFeatureCall object) {
				return createXMemberFeatureCallAdapter();
			}
			@Override
			public Adapter caseXFeatureCall(XFeatureCall object) {
				return createXFeatureCallAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target)
	{
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link dev.yamm.coreModelDiagram.yammDiagram.YClass <em>YClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YClass
	 * @generated
	 */
	public Adapter createYClassAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dev.yamm.coreModelDiagram.yammDiagram.YClassifier <em>YClassifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YClassifier
	 * @generated
	 */
	public Adapter createYClassifierAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dev.yamm.coreModelDiagram.yammDiagram.YComment <em>YComment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YComment
	 * @generated
	 */
	public Adapter createYCommentAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dev.yamm.coreModelDiagram.yammDiagram.YConstraint <em>YConstraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YConstraint
	 * @generated
	 */
	public Adapter createYConstraintAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dev.yamm.coreModelDiagram.yammDiagram.YDataType <em>YData Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YDataType
	 * @generated
	 */
	public Adapter createYDataTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dev.yamm.coreModelDiagram.yammDiagram.YElement <em>YElement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YElement
	 * @generated
	 */
	public Adapter createYElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dev.yamm.coreModelDiagram.yammDiagram.YElementImport <em>YElement Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YElementImport
	 * @generated
	 */
	public Adapter createYElementImportAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dev.yamm.coreModelDiagram.yammDiagram.YEnumeration <em>YEnumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YEnumeration
	 * @generated
	 */
	public Adapter createYEnumerationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dev.yamm.coreModelDiagram.yammDiagram.YEnumerationLiteral <em>YEnumeration Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YEnumerationLiteral
	 * @generated
	 */
	public Adapter createYEnumerationLiteralAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dev.yamm.coreModelDiagram.yammDiagram.YFeature <em>YFeature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YFeature
	 * @generated
	 */
	public Adapter createYFeatureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dev.yamm.coreModelDiagram.yammDiagram.YNamedElement <em>YNamed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YNamedElement
	 * @generated
	 */
	public Adapter createYNamedElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dev.yamm.coreModelDiagram.yammDiagram.YNamespace <em>YNamespace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YNamespace
	 * @generated
	 */
	public Adapter createYNamespaceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dev.yamm.coreModelDiagram.yammDiagram.YOperation <em>YOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YOperation
	 * @generated
	 */
	public Adapter createYOperationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dev.yamm.coreModelDiagram.yammDiagram.YPackage <em>YPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YPackage
	 * @generated
	 */
	public Adapter createYPackageAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dev.yamm.coreModelDiagram.yammDiagram.YPackageableElement <em>YPackageable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YPackageableElement
	 * @generated
	 */
	public Adapter createYPackageableElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dev.yamm.coreModelDiagram.yammDiagram.YPackageImport <em>YPackage Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YPackageImport
	 * @generated
	 */
	public Adapter createYPackageImportAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dev.yamm.coreModelDiagram.yammDiagram.YParameter <em>YParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YParameter
	 * @generated
	 */
	public Adapter createYParameterAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dev.yamm.coreModelDiagram.yammDiagram.YPrimitiveType <em>YPrimitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YPrimitiveType
	 * @generated
	 */
	public Adapter createYPrimitiveTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dev.yamm.coreModelDiagram.yammDiagram.YProperty <em>YProperty</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YProperty
	 * @generated
	 */
	public Adapter createYPropertyAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dev.yamm.coreModelDiagram.yammDiagram.YType <em>YType</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YType
	 * @generated
	 */
	public Adapter createYTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dev.yamm.coreModelDiagram.yammDiagram.YStateMachine <em>YState Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YStateMachine
	 * @generated
	 */
	public Adapter createYStateMachineAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dev.yamm.coreModelDiagram.yammDiagram.YTransition <em>YTransition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YTransition
	 * @generated
	 */
	public Adapter createYTransitionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dev.yamm.coreModelDiagram.yammDiagram.YTrAttachment <em>YTr Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YTrAttachment
	 * @generated
	 */
	public Adapter createYTrAttachmentAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dev.yamm.coreModelDiagram.yammDiagram.YEffect <em>YEffect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YEffect
	 * @generated
	 */
	public Adapter createYEffectAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dev.yamm.coreModelDiagram.yammDiagram.YVertex <em>YVertex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YVertex
	 * @generated
	 */
	public Adapter createYVertexAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dev.yamm.coreModelDiagram.yammDiagram.YPseudostate <em>YPseudostate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YPseudostate
	 * @generated
	 */
	public Adapter createYPseudostateAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dev.yamm.coreModelDiagram.yammDiagram.YFinalState <em>YFinal State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YFinalState
	 * @generated
	 */
	public Adapter createYFinalStateAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dev.yamm.coreModelDiagram.yammDiagram.YState <em>YState</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YState
	 * @generated
	 */
	public Adapter createYStateAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dev.yamm.coreModelDiagram.yammDiagram.YModel <em>YModel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YModel
	 * @generated
	 */
	public Adapter createYModelAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dev.yamm.coreModelDiagram.yammDiagram.YSharedEdge <em>YShared Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YSharedEdge
	 * @generated
	 */
	public Adapter createYSharedEdgeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dev.yamm.coreModelDiagram.yammDiagram.YCompositeEdge <em>YComposite Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YCompositeEdge
	 * @generated
	 */
	public Adapter createYCompositeEdgeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dev.yamm.coreModelDiagram.yammDiagram.YObject <em>YObject</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YObject
	 * @generated
	 */
	public Adapter createYObjectAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dev.yamm.coreModelDiagram.yammDiagram.YStateMachineHandler <em>YState Machine Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YStateMachineHandler
	 * @generated
	 */
	public Adapter createYStateMachineHandlerAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dev.yamm.coreModelDiagram.yammDiagram.YGlobalStateMachine <em>YGlobal State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YGlobalStateMachine
	 * @generated
	 */
	public Adapter createYGlobalStateMachineAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dev.yamm.coreModelDiagram.yammDiagram.YCreateInstanceExpression <em>YCreate Instance Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YCreateInstanceExpression
	 * @generated
	 */
	public Adapter createYCreateInstanceExpressionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dev.yamm.coreModelDiagram.yammDiagram.YPrintExpression <em>YPrint Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YPrintExpression
	 * @generated
	 */
	public Adapter createYPrintExpressionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dev.yamm.coreModelDiagram.yammDiagram.YSetReturnValue <em>YSet Return Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YSetReturnValue
	 * @generated
	 */
	public Adapter createYSetReturnValueAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dev.yamm.coreModelDiagram.yammDiagram.YGetInstancesOfExpression <em>YGet Instances Of Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YGetInstancesOfExpression
	 * @generated
	 */
	public Adapter createYGetInstancesOfExpressionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dev.yamm.coreModelDiagram.yammDiagram.YMemberFeatureCall <em>YMember Feature Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YMemberFeatureCall
	 * @generated
	 */
	public Adapter createYMemberFeatureCallAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dev.yamm.coreModelDiagram.yammDiagram.YFeatureCall <em>YFeature Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YFeatureCall
	 * @generated
	 */
	public Adapter createYFeatureCallAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dev.yamm.coreModelDiagram.yammDiagram.YGetObjectManagement <em>YGet Object Management</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YGetObjectManagement
	 * @generated
	 */
	public Adapter createYGetObjectManagementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dev.yamm.coreModelDiagram.yammDiagram.YGetLayerInformation <em>YGet Layer Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YGetLayerInformation
	 * @generated
	 */
	public Adapter createYGetLayerInformationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dev.yamm.coreModelDiagram.yammDiagram.YColorDFAObject <em>YColor DFA Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YColorDFAObject
	 * @generated
	 */
	public Adapter createYColorDFAObjectAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dev.yamm.coreModelDiagram.yammDiagram.YGetInstances <em>YGet Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YGetInstances
	 * @generated
	 */
	public Adapter createYGetInstancesAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dev.yamm.coreModelDiagram.yammDiagram.YCountFinalStates <em>YCount Final States</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YCountFinalStates
	 * @generated
	 */
	public Adapter createYCountFinalStatesAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dev.yamm.coreModelDiagram.yammDiagram.YCountInitialStates <em>YCount Initial States</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YCountInitialStates
	 * @generated
	 */
	public Adapter createYCountInitialStatesAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dev.yamm.coreModelDiagram.yammDiagram.YCountStates <em>YCount States</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YCountStates
	 * @generated
	 */
	public Adapter createYCountStatesAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dev.yamm.coreModelDiagram.yammDiagram.YSetAbsoluteNodePropability <em>YSet Absolute Node Propability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YSetAbsoluteNodePropability
	 * @generated
	 */
	public Adapter createYSetAbsoluteNodePropabilityAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dev.yamm.coreModelDiagram.yammDiagram.YCountReachableStates <em>YCount Reachable States</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YCountReachableStates
	 * @generated
	 */
	public Adapter createYCountReachableStatesAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dev.yamm.coreModelDiagram.yammDiagram.YCountInValidTransitions <em>YCount In Valid Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YCountInValidTransitions
	 * @generated
	 */
	public Adapter createYCountInValidTransitionsAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dev.yamm.coreModelDiagram.yammDiagram.YSetPopulationSize <em>YSet Population Size</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YSetPopulationSize
	 * @generated
	 */
	public Adapter createYSetPopulationSizeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dev.yamm.coreModelDiagram.yammDiagram.YLoadModel <em>YLoad Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YLoadModel
	 * @generated
	 */
	public Adapter createYLoadModelAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dev.yamm.coreModelDiagram.yammDiagram.DslInfo <em>Dsl Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.DslInfo
	 * @generated
	 */
	public Adapter createDslInfoAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dev.yamm.coreModelDiagram.yammDiagram.FeatureInfo <em>Feature Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.FeatureInfo
	 * @generated
	 */
	public Adapter createFeatureInfoAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dev.yamm.coreModelDiagram.yammDiagram.SingleLinePropertyInfo <em>Single Line Property Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.SingleLinePropertyInfo
	 * @generated
	 */
	public Adapter createSingleLinePropertyInfoAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dev.yamm.coreModelDiagram.yammDiagram.GuardInfo <em>Guard Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.GuardInfo
	 * @generated
	 */
	public Adapter createGuardInfoAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dev.yamm.coreModelDiagram.yammDiagram.EffectInfo <em>Effect Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.EffectInfo
	 * @generated
	 */
	public Adapter createEffectInfoAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dev.yamm.coreModelDiagram.yammDiagram.ContainmentInfo <em>Containment Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.ContainmentInfo
	 * @generated
	 */
	public Adapter createContainmentInfoAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>EStructural Feature To Feature Info Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createEStructuralFeatureToFeatureInfoMapAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dev.yamm.coreModelDiagram.yammDiagram.Line <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.Line
	 * @generated
	 */
	public Adapter createLineAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dev.yamm.coreModelDiagram.yammDiagram.YStructure <em>YStructure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YStructure
	 * @generated
	 */
	public Adapter createYStructureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dev.yamm.coreModelDiagram.yammDiagram.YObserverAddValue <em>YObserver Add Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YObserverAddValue
	 * @generated
	 */
	public Adapter createYObserverAddValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.xbase.XExpression <em>XExpression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.xbase.XExpression
	 * @since 2.7
	 * @generated
	 */
	public Adapter createXExpressionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.xbase.XAbstractFeatureCall <em>XAbstract Feature Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.xbase.XAbstractFeatureCall
	 * @since 2.7
	 * @generated
	 */
	public Adapter createXAbstractFeatureCallAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.xbase.XMemberFeatureCall <em>XMember Feature Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.xbase.XMemberFeatureCall
	 * @since 2.7
	 * @generated
	 */
	public Adapter createXMemberFeatureCallAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.xbase.XFeatureCall <em>XFeature Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.xbase.XFeatureCall
	 * @since 2.7
	 * @generated
	 */
	public Adapter createXFeatureCallAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter()
	{
		return null;
	}

} //YammDiagramAdapterFactory
