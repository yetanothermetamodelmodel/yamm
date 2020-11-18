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
package online.yamm.coreModelDiagram.yammDiagram.impl;

import java.util.Map;
import online.yamm.coreModelDiagram.yammDiagram.*;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import online.yamm.coreModelDiagram.yammDiagram.ContainmentInfo;
import online.yamm.coreModelDiagram.yammDiagram.DslInfo;
import online.yamm.coreModelDiagram.yammDiagram.EffectInfo;
import online.yamm.coreModelDiagram.yammDiagram.FeatureInfo;
import online.yamm.coreModelDiagram.yammDiagram.GuardInfo;
import online.yamm.coreModelDiagram.yammDiagram.Line;
import online.yamm.coreModelDiagram.yammDiagram.SingleLinePropertyInfo;
import online.yamm.coreModelDiagram.yammDiagram.YAggregationKind;
import online.yamm.coreModelDiagram.yammDiagram.YClass;
import online.yamm.coreModelDiagram.yammDiagram.YClassifier;
import online.yamm.coreModelDiagram.yammDiagram.YColorDFAObject;
import online.yamm.coreModelDiagram.yammDiagram.YComment;
import online.yamm.coreModelDiagram.yammDiagram.YCompositeEdge;
import online.yamm.coreModelDiagram.yammDiagram.YConstraint;
import online.yamm.coreModelDiagram.yammDiagram.YCountFinalStates;
import online.yamm.coreModelDiagram.yammDiagram.YCountInValidTransitions;
import online.yamm.coreModelDiagram.yammDiagram.YCountInitialStates;
import online.yamm.coreModelDiagram.yammDiagram.YCountReachableStates;
import online.yamm.coreModelDiagram.yammDiagram.YCountStates;
import online.yamm.coreModelDiagram.yammDiagram.YCreateInstanceExpression;
import online.yamm.coreModelDiagram.yammDiagram.YDataType;
import online.yamm.coreModelDiagram.yammDiagram.YEffect;
import online.yamm.coreModelDiagram.yammDiagram.YElement;
import online.yamm.coreModelDiagram.yammDiagram.YElementImport;
import online.yamm.coreModelDiagram.yammDiagram.YEnumeration;
import online.yamm.coreModelDiagram.yammDiagram.YEnumerationLiteral;
import online.yamm.coreModelDiagram.yammDiagram.YFeature;
import online.yamm.coreModelDiagram.yammDiagram.YFeatureCall;
import online.yamm.coreModelDiagram.yammDiagram.YFinalState;
import online.yamm.coreModelDiagram.yammDiagram.YGetInstances;
import online.yamm.coreModelDiagram.yammDiagram.YGetInstancesOfExpression;
import online.yamm.coreModelDiagram.yammDiagram.YGetLayerInformation;
import online.yamm.coreModelDiagram.yammDiagram.YGetObjectManagement;
import online.yamm.coreModelDiagram.yammDiagram.YGlobalStateMachine;
import online.yamm.coreModelDiagram.yammDiagram.YLoadModel;
import online.yamm.coreModelDiagram.yammDiagram.YMemberFeatureCall;
import online.yamm.coreModelDiagram.yammDiagram.YModel;
import online.yamm.coreModelDiagram.yammDiagram.YNamedElement;
import online.yamm.coreModelDiagram.yammDiagram.YNamespace;
import online.yamm.coreModelDiagram.yammDiagram.YObject;
import online.yamm.coreModelDiagram.yammDiagram.YOperation;
import online.yamm.coreModelDiagram.yammDiagram.YPackage;
import online.yamm.coreModelDiagram.yammDiagram.YPackageImport;
import online.yamm.coreModelDiagram.yammDiagram.YPackageableElement;
import online.yamm.coreModelDiagram.yammDiagram.YParameter;
import online.yamm.coreModelDiagram.yammDiagram.YParameterDirectionKind;
import online.yamm.coreModelDiagram.yammDiagram.YPrimitiveType;
import online.yamm.coreModelDiagram.yammDiagram.YPrintExpression;
import online.yamm.coreModelDiagram.yammDiagram.YProperty;
import online.yamm.coreModelDiagram.yammDiagram.YPseudostate;
import online.yamm.coreModelDiagram.yammDiagram.YRunToCompletion;
import online.yamm.coreModelDiagram.yammDiagram.YSetAbsoluteNodePropability;
import online.yamm.coreModelDiagram.yammDiagram.YSetPopulationSize;
import online.yamm.coreModelDiagram.yammDiagram.YSetReturnValue;
import online.yamm.coreModelDiagram.yammDiagram.YSharedEdge;
import online.yamm.coreModelDiagram.yammDiagram.YState;
import online.yamm.coreModelDiagram.yammDiagram.YStateMachine;
import online.yamm.coreModelDiagram.yammDiagram.YStateMachineHandler;
import online.yamm.coreModelDiagram.yammDiagram.YStructure;
import online.yamm.coreModelDiagram.yammDiagram.YTrAttachment;
import online.yamm.coreModelDiagram.yammDiagram.YTransition;
import online.yamm.coreModelDiagram.yammDiagram.YType;
import online.yamm.coreModelDiagram.yammDiagram.YVertex;
import online.yamm.coreModelDiagram.yammDiagram.YVisibilityKind;
import online.yamm.coreModelDiagram.yammDiagram.YammDiagramFactory;
import online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class YammDiagramFactoryImpl extends EFactoryImpl implements YammDiagramFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static YammDiagramFactory init()
	{
		try {
			YammDiagramFactory theYammDiagramFactory = (YammDiagramFactory)EPackage.Registry.INSTANCE.getEFactory(YammDiagramPackage.eNS_URI);
			if (theYammDiagramFactory != null) {
				return theYammDiagramFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new YammDiagramFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YammDiagramFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID()) {
			case YammDiagramPackage.YCLASS: return createYClass();
			case YammDiagramPackage.YCLASSIFIER: return createYClassifier();
			case YammDiagramPackage.YCOMMENT: return createYComment();
			case YammDiagramPackage.YCONSTRAINT: return createYConstraint();
			case YammDiagramPackage.YDATA_TYPE: return createYDataType();
			case YammDiagramPackage.YELEMENT: return createYElement();
			case YammDiagramPackage.YELEMENT_IMPORT: return createYElementImport();
			case YammDiagramPackage.YENUMERATION: return createYEnumeration();
			case YammDiagramPackage.YENUMERATION_LITERAL: return createYEnumerationLiteral();
			case YammDiagramPackage.YFEATURE: return createYFeature();
			case YammDiagramPackage.YNAMED_ELEMENT: return createYNamedElement();
			case YammDiagramPackage.YNAMESPACE: return createYNamespace();
			case YammDiagramPackage.YOPERATION: return createYOperation();
			case YammDiagramPackage.YPACKAGE: return createYPackage();
			case YammDiagramPackage.YPACKAGEABLE_ELEMENT: return createYPackageableElement();
			case YammDiagramPackage.YPACKAGE_IMPORT: return createYPackageImport();
			case YammDiagramPackage.YPARAMETER: return createYParameter();
			case YammDiagramPackage.YPRIMITIVE_TYPE: return createYPrimitiveType();
			case YammDiagramPackage.YPROPERTY: return createYProperty();
			case YammDiagramPackage.YTYPE: return createYType();
			case YammDiagramPackage.YSTATE_MACHINE: return createYStateMachine();
			case YammDiagramPackage.YTRANSITION: return createYTransition();
			case YammDiagramPackage.YTR_ATTACHMENT: return createYTrAttachment();
			case YammDiagramPackage.YEFFECT: return createYEffect();
			case YammDiagramPackage.YVERTEX: return createYVertex();
			case YammDiagramPackage.YPSEUDOSTATE: return createYPseudostate();
			case YammDiagramPackage.YFINAL_STATE: return createYFinalState();
			case YammDiagramPackage.YSTATE: return createYState();
			case YammDiagramPackage.YMODEL: return createYModel();
			case YammDiagramPackage.YSHARED_EDGE: return createYSharedEdge();
			case YammDiagramPackage.YCOMPOSITE_EDGE: return createYCompositeEdge();
			case YammDiagramPackage.YOBJECT: return createYObject();
			case YammDiagramPackage.YSTATE_MACHINE_HANDLER: return createYStateMachineHandler();
			case YammDiagramPackage.YGLOBAL_STATE_MACHINE: return createYGlobalStateMachine();
			case YammDiagramPackage.YCREATE_INSTANCE_EXPRESSION: return createYCreateInstanceExpression();
			case YammDiagramPackage.YPRINT_EXPRESSION: return createYPrintExpression();
			case YammDiagramPackage.YSET_RETURN_VALUE: return createYSetReturnValue();
			case YammDiagramPackage.YGET_INSTANCES_OF_EXPRESSION: return createYGetInstancesOfExpression();
			case YammDiagramPackage.YMEMBER_FEATURE_CALL: return createYMemberFeatureCall();
			case YammDiagramPackage.YFEATURE_CALL: return createYFeatureCall();
			case YammDiagramPackage.YGET_OBJECT_MANAGEMENT: return createYGetObjectManagement();
			case YammDiagramPackage.YGET_LAYER_INFORMATION: return createYGetLayerInformation();
			case YammDiagramPackage.YCOLOR_DFA_OBJECT: return createYColorDFAObject();
			case YammDiagramPackage.YGET_INSTANCES: return createYGetInstances();
			case YammDiagramPackage.YCOUNT_FINAL_STATES: return createYCountFinalStates();
			case YammDiagramPackage.YCOUNT_INITIAL_STATES: return createYCountInitialStates();
			case YammDiagramPackage.YCOUNT_STATES: return createYCountStates();
			case YammDiagramPackage.YSET_ABSOLUTE_NODE_PROPABILITY: return createYSetAbsoluteNodePropability();
			case YammDiagramPackage.YCOUNT_REACHABLE_STATES: return createYCountReachableStates();
			case YammDiagramPackage.YCOUNT_IN_VALID_TRANSITIONS: return createYCountInValidTransitions();
			case YammDiagramPackage.YSET_POPULATION_SIZE: return createYSetPopulationSize();
			case YammDiagramPackage.YLOAD_MODEL: return createYLoadModel();
			case YammDiagramPackage.DSL_INFO: return createDslInfo();
			case YammDiagramPackage.FEATURE_INFO: return createFeatureInfo();
			case YammDiagramPackage.SINGLE_LINE_PROPERTY_INFO: return createSingleLinePropertyInfo();
			case YammDiagramPackage.GUARD_INFO: return createGuardInfo();
			case YammDiagramPackage.EFFECT_INFO: return createEffectInfo();
			case YammDiagramPackage.CONTAINMENT_INFO: return createContainmentInfo();
			case YammDiagramPackage.ESTRUCTURAL_FEATURE_TO_FEATURE_INFO_MAP: return (EObject)createEStructuralFeatureToFeatureInfoMap();
			case YammDiagramPackage.LINE: return createLine();
			case YammDiagramPackage.YSTRUCTURE: return createYStructure();
			case YammDiagramPackage.YOBSERVER_ADD_VALUE: return createYObserverAddValue();
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
	public Object createFromString(EDataType eDataType, String initialValue)
	{
		switch (eDataType.getClassifierID()) {
			case YammDiagramPackage.YAGGREGATION_KIND:
				return createYAggregationKindFromString(eDataType, initialValue);
			case YammDiagramPackage.YPARAMETER_DIRECTION_KIND:
				return createYParameterDirectionKindFromString(eDataType, initialValue);
			case YammDiagramPackage.YRUN_TO_COMPLETION:
				return createYRunToCompletionFromString(eDataType, initialValue);
			case YammDiagramPackage.YVISIBILITY_KIND:
				return createYVisibilityKindFromString(eDataType, initialValue);
			case YammDiagramPackage.ESTRING2:
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
	public String convertToString(EDataType eDataType, Object instanceValue)
	{
		switch (eDataType.getClassifierID()) {
			case YammDiagramPackage.YAGGREGATION_KIND:
				return convertYAggregationKindToString(eDataType, instanceValue);
			case YammDiagramPackage.YPARAMETER_DIRECTION_KIND:
				return convertYParameterDirectionKindToString(eDataType, instanceValue);
			case YammDiagramPackage.YRUN_TO_COMPLETION:
				return convertYRunToCompletionToString(eDataType, instanceValue);
			case YammDiagramPackage.YVISIBILITY_KIND:
				return convertYVisibilityKindToString(eDataType, instanceValue);
			case YammDiagramPackage.ESTRING2:
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
	 * @generated not
	 */
	public YObject createYObject() {
		YObjectImpl yObject = new YObjectImpl();
		yObject.setObjectID("f" + Integer.toHexString(yObject.hashCode()));
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
	public YammDiagramPackage getYammDiagramPackage()
	{
		return (YammDiagramPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static YammDiagramPackage getPackage()
	{
		return YammDiagramPackage.eINSTANCE;
	}
	
	private void setObjectIdAndName(YNamedElement element)
	{
		int hashCode = element.hashCode();
		hashCode -= (hashCode % 16);
		element.setObjectID("f" + Integer.toHexString(hashCode / (16*16)));
		element.setName(element.eClass().getName() + element.getObjectID());
		
	}

} //YammDiagramFactoryImpl
