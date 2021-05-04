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
package dev.yamm.coreModelXmi.yamm.impl;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import dev.yamm.coreModelXmi.yamm.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class YammFactoryImpl extends EFactoryImpl implements YammFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static YammFactory init() {
		try {
			YammFactory theYammFactory = (YammFactory)EPackage.Registry.INSTANCE.getEFactory(YammPackage.eNS_URI);
			if (theYammFactory != null) {
				return theYammFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new YammFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YammFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID())
		{
			case YammPackage.YCLASS: return createYClass();
			case YammPackage.YCLASSIFIER: return createYClassifier();
			case YammPackage.YCOMMENT: return createYComment();
			case YammPackage.YCONSTRAINT: return createYConstraint();
			case YammPackage.YDATA_TYPE: return createYDataType();
			case YammPackage.YELEMENT: return createYElement();
			case YammPackage.YELEMENT_IMPORT: return createYElementImport();
			case YammPackage.YENUMERATION: return createYEnumeration();
			case YammPackage.YENUMERATION_LITERAL: return createYEnumerationLiteral();
			case YammPackage.YFEATURE: return createYFeature();
			case YammPackage.YNAMED_ELEMENT: return createYNamedElement();
			case YammPackage.YNAMESPACE: return createYNamespace();
			case YammPackage.YOPERATION: return createYOperation();
			case YammPackage.YPACKAGE: return createYPackage();
			case YammPackage.YPACKAGEABLE_ELEMENT: return createYPackageableElement();
			case YammPackage.YPACKAGE_IMPORT: return createYPackageImport();
			case YammPackage.YPARAMETER: return createYParameter();
			case YammPackage.YPRIMITIVE_TYPE: return createYPrimitiveType();
			case YammPackage.YPROPERTY: return createYProperty();
			case YammPackage.YTYPE: return createYType();
			case YammPackage.YSTATE_MACHINE: return createYStateMachine();
			case YammPackage.YTRANSITION: return createYTransition();
			case YammPackage.YTR_ATTACHMENT: return createYTrAttachment();
			case YammPackage.YEFFECT: return createYEffect();
			case YammPackage.YVERTEX: return createYVertex();
			case YammPackage.YPSEUDOSTATE: return createYPseudostate();
			case YammPackage.YFINAL_STATE: return createYFinalState();
			case YammPackage.YSTATE: return createYState();
			case YammPackage.YMODEL: return createYModel();
			case YammPackage.YSHARED_EDGE: return createYSharedEdge();
			case YammPackage.YCOMPOSITE_EDGE: return createYCompositeEdge();
			case YammPackage.YOBJECT: return createYObject();
			case YammPackage.YSTATE_MACHINE_HANDLER: return createYStateMachineHandler();
			case YammPackage.YGLOBAL_STATE_MACHINE: return createYGlobalStateMachine();
			case YammPackage.YCREATE_INSTANCE_EXPRESSION: return createYCreateInstanceExpression();
			case YammPackage.YPRINT_EXPRESSION: return createYPrintExpression();
			case YammPackage.YSET_RETURN_VALUE: return createYSetReturnValue();
			case YammPackage.YGET_INSTANCES_OF_EXPRESSION: return createYGetInstancesOfExpression();
			case YammPackage.YMEMBER_FEATURE_CALL: return createYMemberFeatureCall();
			case YammPackage.YFEATURE_CALL: return createYFeatureCall();
			case YammPackage.YGET_OBJECT_MANAGEMENT: return createYGetObjectManagement();
			case YammPackage.YGET_LAYER_INFORMATION: return createYGetLayerInformation();
			case YammPackage.YCOLOR_DFA_OBJECT: return createYColorDFAObject();
			case YammPackage.YGET_INSTANCES: return createYGetInstances();
			case YammPackage.YCOUNT_FINAL_STATES: return createYCountFinalStates();
			case YammPackage.YCOUNT_INITIAL_STATES: return createYCountInitialStates();
			case YammPackage.YCOUNT_STATES: return createYCountStates();
			case YammPackage.YSET_ABSOLUTE_NODE_PROPABILITY: return createYSetAbsoluteNodePropability();
			case YammPackage.YCOUNT_REACHABLE_STATES: return createYCountReachableStates();
			case YammPackage.YCOUNT_IN_VALID_TRANSITIONS: return createYCountInValidTransitions();
			case YammPackage.YSET_POPULATION_SIZE: return createYSetPopulationSize();
			case YammPackage.YLOAD_MODEL: return createYLoadModel();
			case YammPackage.DSL_INFO: return createDslInfo();
			case YammPackage.FEATURE_INFO: return createFeatureInfo();
			case YammPackage.SINGLE_LINE_PROPERTY_INFO: return createSingleLinePropertyInfo();
			case YammPackage.GUARD_INFO: return createGuardInfo();
			case YammPackage.EFFECT_INFO: return createEffectInfo();
			case YammPackage.CONTAINMENT_INFO: return createContainmentInfo();
			case YammPackage.ESTRUCTURAL_FEATURE_TO_FEATURE_INFO_MAP: return (EObject)createEStructuralFeatureToFeatureInfoMap();
			case YammPackage.LINE: return createLine();
			case YammPackage.YSTRUCTURE: return createYStructure();
			case YammPackage.YINTERNAL: return createYInternal();
			case YammPackage.YTIME_STEP: return createYTimeStep();
			case YammPackage.YOBSERVER_ADD_VALUE: return createYObserverAddValue();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case YammPackage.YAGGREGATION_KIND:
				return createYAggregationKindFromString(eDataType, initialValue);
			case YammPackage.YPARAMETER_DIRECTION_KIND:
				return createYParameterDirectionKindFromString(eDataType, initialValue);
			case YammPackage.YRUN_TO_COMPLETION:
				return createYRunToCompletionFromString(eDataType, initialValue);
			case YammPackage.EXECUTION_PHASE:
				return createExecutionPhaseFromString(eDataType, initialValue);
			case YammPackage.YVISIBILITY_KIND:
				return createYVisibilityKindFromString(eDataType, initialValue);
			case YammPackage.ESTRING2:
				return createEString2FromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case YammPackage.YAGGREGATION_KIND:
				return convertYAggregationKindToString(eDataType, instanceValue);
			case YammPackage.YPARAMETER_DIRECTION_KIND:
				return convertYParameterDirectionKindToString(eDataType, instanceValue);
			case YammPackage.YRUN_TO_COMPLETION:
				return convertYRunToCompletionToString(eDataType, instanceValue);
			case YammPackage.EXECUTION_PHASE:
				return convertExecutionPhaseToString(eDataType, instanceValue);
			case YammPackage.YVISIBILITY_KIND:
				return convertYVisibilityKindToString(eDataType, instanceValue);
			case YammPackage.ESTRING2:
				return convertEString2ToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public YClass createYClass() {
		YClassImpl yClass = new YClassImpl();
		setObjectIdAndName(yClass);
		return yClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YClassifier createYClassifier() {
		YClassifierImpl yClassifier = new YClassifierImpl();
		return yClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YComment createYComment() {
		YCommentImpl yComment = new YCommentImpl();
		return yComment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YConstraint createYConstraint() {
		YConstraintImpl yConstraint = new YConstraintImpl();
		return yConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YDataType createYDataType() {
		YDataTypeImpl yDataType = new YDataTypeImpl();
		return yDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YElement createYElement() {
		YElementImpl yElement = new YElementImpl();
		return yElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YElementImport createYElementImport() {
		YElementImportImpl yElementImport = new YElementImportImpl();
		return yElementImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public YEnumeration createYEnumeration() {
		YEnumerationImpl yEnumeration = new YEnumerationImpl();
		setObjectIdAndName(yEnumeration);
		return yEnumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public YEnumerationLiteral createYEnumerationLiteral() {
		YEnumerationLiteralImpl yEnumerationLiteral = new YEnumerationLiteralImpl();
		setObjectIdAndName(yEnumerationLiteral);
		return yEnumerationLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YFeature createYFeature() {
		YFeatureImpl yFeature = new YFeatureImpl();
		return yFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YNamedElement createYNamedElement() {
		YNamedElementImpl yNamedElement = new YNamedElementImpl();
		return yNamedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YNamespace createYNamespace() {
		YNamespaceImpl yNamespace = new YNamespaceImpl();
		return yNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public YOperation createYOperation() {
		YOperationImpl yOperation = new YOperationImpl();
		setObjectIdAndName(yOperation);
		return yOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public YPackage createYPackage() {
		YPackageImpl yPackage = new YPackageImpl();
		setObjectIdAndName(yPackage);
		return yPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YPackageableElement createYPackageableElement() {
		YPackageableElementImpl yPackageableElement = new YPackageableElementImpl();
		return yPackageableElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YPackageImport createYPackageImport() {
		YPackageImportImpl yPackageImport = new YPackageImportImpl();
		return yPackageImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public YParameter createYParameter() {
		YParameterImpl yParameter = new YParameterImpl();
		setObjectIdAndName(yParameter);
		yParameter.eAdapters().add(new AdapterImpl() {
			public void notifyChanged(Notification notification) {

				YParameterImpl pi = (YParameterImpl) ((EObject) notification.getNotifier());
				if (notification.getFeature() != null) {
					String n = ((EStructuralFeature) notification.getFeature()).getName();
					// EClass c = ((EStructuralFeature)notification.getFeature()).getEContainingClass();
					// System.out.println("Attribute " + n + " of class " + c.getInstanceClassName() + " touched.");
					if (n == "name" || n == "lower" || n == "upper"
							|| n == "direction" || n == "type" || n == "isUnique"
							|| n == "isOrdered" || n == "defaultValue" ) {
						pi.setSignature("");
					}
				}
			}
		});
		return yParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YPrimitiveType createYPrimitiveType() {
		YPrimitiveTypeImpl yPrimitiveType = new YPrimitiveTypeImpl();
		return yPrimitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public YProperty createYProperty() {
		YPropertyImpl yProperty = new YPropertyImpl();
		setObjectIdAndName(yProperty);
		yProperty.eAdapters().add(new AdapterImpl() {
			public void notifyChanged(Notification notification) {

				YPropertyImpl pi = (YPropertyImpl) ((EObject) notification.getNotifier());
				if(notification.getFeature() == null) {
					return;
				}
				String n = ((EStructuralFeature) notification.getFeature()).getName();
				// EClass c = ((EStructuralFeature)notification.getFeature()).getEContainingClass();
				// System.out.println("Attribute " + n + " of class " + c.getInstanceClassName() + " touched.");
				if (n == "name" || n == "lower" || n == "upper"
						|| n == "aggregation" || n == "type" || n == "isUnique"
						|| n == "isOrdered" || n == "description"
						|| n == "isDerived" || n == "isDerivedUnion" 
						|| n == "defaultValue") {
					pi.setSignature("");
				}
			}
		});
		return yProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YType createYType() {
		YTypeImpl yType = new YTypeImpl();
		return yType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public YStateMachine createYStateMachine() {
		YStateMachineImpl yStateMachine = new YStateMachineImpl();
		setObjectIdAndName(yStateMachine);
		return yStateMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public YTransition createYTransition() {
		YTransitionImpl yTransition = new YTransitionImpl();
		setObjectIdAndName(yTransition);
		return yTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public YTrAttachment createYTrAttachment() {
		YTrAttachmentImpl yTrAttachment = new YTrAttachmentImpl();
		setObjectIdAndName(yTrAttachment);
		return yTrAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public YEffect createYEffect() {
		YEffectImpl yEffect = new YEffectImpl();
		int hashCode = yEffect.hashCode();
		hashCode -= (hashCode % 16);
		yEffect.setObjectID("f" + Integer.toHexString(hashCode/ (16*16)));
		return yEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YVertex createYVertex() {
		YVertexImpl yVertex = new YVertexImpl();
		return yVertex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public YPseudostate createYPseudostate() {
		YPseudostateImpl yPseudostate = new YPseudostateImpl();
		setObjectIdAndName(yPseudostate);
		return yPseudostate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public YFinalState createYFinalState() {
		YFinalStateImpl yFinalState = new YFinalStateImpl();
		setObjectIdAndName(yFinalState);
		return yFinalState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public YState createYState() {
		YStateImpl yState = new YStateImpl();
		setObjectIdAndName(yState);
		return yState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YModel createYModel() {
		YModelImpl yModel = new YModelImpl();
		return yModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YSharedEdge createYSharedEdge() {
		YSharedEdgeImpl ySharedEdge = new YSharedEdgeImpl();
		return ySharedEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YCompositeEdge createYCompositeEdge() {
		YCompositeEdgeImpl yCompositeEdge = new YCompositeEdgeImpl();
		return yCompositeEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YObject createYObject() {
		YObjectImpl yObject = new YObjectImpl();
		return yObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YStateMachineHandler createYStateMachineHandler() {
		YStateMachineHandlerImpl yStateMachineHandler = new YStateMachineHandlerImpl();
		return yStateMachineHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YGlobalStateMachine createYGlobalStateMachine() {
		YGlobalStateMachineImpl yGlobalStateMachine = new YGlobalStateMachineImpl();
		return yGlobalStateMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YCreateInstanceExpression createYCreateInstanceExpression() {
		YCreateInstanceExpressionImpl yCreateInstanceExpression = new YCreateInstanceExpressionImpl();
		return yCreateInstanceExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YPrintExpression createYPrintExpression() {
		YPrintExpressionImpl yPrintExpression = new YPrintExpressionImpl();
		return yPrintExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YSetReturnValue createYSetReturnValue() {
		YSetReturnValueImpl ySetReturnValue = new YSetReturnValueImpl();
		return ySetReturnValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YGetInstancesOfExpression createYGetInstancesOfExpression() {
		YGetInstancesOfExpressionImpl yGetInstancesOfExpression = new YGetInstancesOfExpressionImpl();
		return yGetInstancesOfExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YMemberFeatureCall createYMemberFeatureCall()
	{
		YMemberFeatureCallImpl yMemberFeatureCall = new YMemberFeatureCallImpl();
		return yMemberFeatureCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YFeatureCall createYFeatureCall()
	{
		YFeatureCallImpl yFeatureCall = new YFeatureCallImpl();
		return yFeatureCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YGetObjectManagement createYGetObjectManagement() {
		YGetObjectManagementImpl yGetObjectManagement = new YGetObjectManagementImpl();
		return yGetObjectManagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YColorDFAObject createYColorDFAObject() {
		YColorDFAObjectImpl yColorDFAObject = new YColorDFAObjectImpl();
		return yColorDFAObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YGetInstances createYGetInstances() {
		YGetInstancesImpl yGetInstances = new YGetInstancesImpl();
		return yGetInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YCountFinalStates createYCountFinalStates()
	{
		YCountFinalStatesImpl yCountFinalStates = new YCountFinalStatesImpl();
		return yCountFinalStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YCountInitialStates createYCountInitialStates()
	{
		YCountInitialStatesImpl yCountInitialStates = new YCountInitialStatesImpl();
		return yCountInitialStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YCountStates createYCountStates()
	{
		YCountStatesImpl yCountStates = new YCountStatesImpl();
		return yCountStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YSetAbsoluteNodePropability createYSetAbsoluteNodePropability()
	{
		YSetAbsoluteNodePropabilityImpl ySetAbsoluteNodePropability = new YSetAbsoluteNodePropabilityImpl();
		return ySetAbsoluteNodePropability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YCountReachableStates createYCountReachableStates()
	{
		YCountReachableStatesImpl yCountReachableStates = new YCountReachableStatesImpl();
		return yCountReachableStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YCountInValidTransitions createYCountInValidTransitions()
	{
		YCountInValidTransitionsImpl yCountInValidTransitions = new YCountInValidTransitionsImpl();
		return yCountInValidTransitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YSetPopulationSize createYSetPopulationSize() {
		YSetPopulationSizeImpl ySetPopulationSize = new YSetPopulationSizeImpl();
		return ySetPopulationSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YLoadModel createYLoadModel()
	{
		YLoadModelImpl yLoadModel = new YLoadModelImpl();
		return yLoadModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DslInfo createDslInfo()
	{
		DslInfoImpl dslInfo = new DslInfoImpl();
		return dslInfo;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureInfo createFeatureInfo()
	{
		FeatureInfoImpl featureInfo = new FeatureInfoImpl();
		return featureInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo createSingleLinePropertyInfo()
	{
		SingleLinePropertyInfoImpl singleLinePropertyInfo = new SingleLinePropertyInfoImpl();
		return singleLinePropertyInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuardInfo createGuardInfo()
	{
		GuardInfoImpl guardInfo = new GuardInfoImpl();
		return guardInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EffectInfo createEffectInfo()
	{
		EffectInfoImpl effectInfo = new EffectInfoImpl();
		return effectInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainmentInfo createContainmentInfo()
	{
		ContainmentInfoImpl containmentInfo = new ContainmentInfoImpl();
		return containmentInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<EStructuralFeature, FeatureInfo> createEStructuralFeatureToFeatureInfoMap()
	{
		EStructuralFeatureToFeatureInfoMapImpl eStructuralFeatureToFeatureInfoMap = new EStructuralFeatureToFeatureInfoMapImpl();
		return eStructuralFeatureToFeatureInfoMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Line createLine()
	{
		LineImpl line = new LineImpl();
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YStructure createYStructure()
	{
		YStructureImpl yStructure = new YStructureImpl();
		return yStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YInternal createYInternal() {
		YInternalImpl yInternal = new YInternalImpl();
		return yInternal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YTimeStep createYTimeStep() {
		YTimeStepImpl yTimeStep = new YTimeStepImpl();
		return yTimeStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YObserverAddValue createYObserverAddValue() {
		YObserverAddValueImpl yObserverAddValue = new YObserverAddValueImpl();
		return yObserverAddValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YGetLayerInformation createYGetLayerInformation() {
		YGetLayerInformationImpl yGetLayerInformation = new YGetLayerInformationImpl();
		return yGetLayerInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YAggregationKind createYAggregationKindFromString(EDataType eDataType, String initialValue) {
		YAggregationKind result = YAggregationKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertYAggregationKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YParameterDirectionKind createYParameterDirectionKindFromString(EDataType eDataType, String initialValue) {
		YParameterDirectionKind result = YParameterDirectionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertYParameterDirectionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YRunToCompletion createYRunToCompletionFromString(EDataType eDataType, String initialValue) {
		YRunToCompletion result = YRunToCompletion.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertYRunToCompletionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionPhase createExecutionPhaseFromString(EDataType eDataType, String initialValue) {
		ExecutionPhase result = ExecutionPhase.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExecutionPhaseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YVisibilityKind createYVisibilityKindFromString(EDataType eDataType, String initialValue) {
		YVisibilityKind result = YVisibilityKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertYVisibilityKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createEString2FromString(EDataType eDataType, String initialValue) {
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEString2ToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YammPackage getYammPackage() {
		return (YammPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static YammPackage getPackage() {
		return YammPackage.eINSTANCE;
	}
	
	private void setObjectIdAndName(YNamedElement element)
	{
		int hashCode = element.hashCode();
		hashCode -= (hashCode % 16);
		element.setObjectID("f" + Integer.toHexString(hashCode / (16*16)));
		element.setName(element.eClass().getName() + element.getObjectID());
		
	}
	


} //YammFactoryImpl
