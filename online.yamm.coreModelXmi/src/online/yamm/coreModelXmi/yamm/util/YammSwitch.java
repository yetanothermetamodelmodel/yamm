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
package online.yamm.coreModelXmi.yamm.util;

import java.util.Map;
import online.yamm.coreModelXmi.yamm.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.XMemberFeatureCall;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see online.yamm.coreModelXmi.yamm.YammPackage
 * @generated
 */
public class YammSwitch<T> extends Switch<T>
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static YammPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YammSwitch()
	{
		if (modelPackage == null) {
			modelPackage = YammPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage)
	{
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject)
	{
		switch (classifierID) {
			case YammPackage.YCLASS: {
				YClass yClass = (YClass)theEObject;
				T result = caseYClass(yClass);
				if (result == null) result = caseYElement(yClass);
				if (result == null) result = caseYPackageableElement(yClass);
				if (result == null) result = caseYClassifier(yClass);
				if (result == null) result = caseYType(yClass);
				if (result == null) result = caseYNamespace(yClass);
				if (result == null) result = caseYObject(yClass);
				if (result == null) result = caseYNamedElement(yClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YammPackage.YCLASSIFIER: {
				YClassifier yClassifier = (YClassifier)theEObject;
				T result = caseYClassifier(yClassifier);
				if (result == null) result = caseYObject(yClassifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YammPackage.YCOMMENT: {
				YComment yComment = (YComment)theEObject;
				T result = caseYComment(yComment);
				if (result == null) result = caseYElement(yComment);
				if (result == null) result = caseYObject(yComment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YammPackage.YCONSTRAINT: {
				YConstraint yConstraint = (YConstraint)theEObject;
				T result = caseYConstraint(yConstraint);
				if (result == null) result = caseYElement(yConstraint);
				if (result == null) result = caseYPackageableElement(yConstraint);
				if (result == null) result = caseYObject(yConstraint);
				if (result == null) result = caseYNamedElement(yConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YammPackage.YDATA_TYPE: {
				YDataType yDataType = (YDataType)theEObject;
				T result = caseYDataType(yDataType);
				if (result == null) result = caseYObject(yDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YammPackage.YELEMENT: {
				YElement yElement = (YElement)theEObject;
				T result = caseYElement(yElement);
				if (result == null) result = caseYObject(yElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YammPackage.YELEMENT_IMPORT: {
				YElementImport yElementImport = (YElementImport)theEObject;
				T result = caseYElementImport(yElementImport);
				if (result == null) result = caseYElement(yElementImport);
				if (result == null) result = caseYObject(yElementImport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YammPackage.YENUMERATION: {
				YEnumeration yEnumeration = (YEnumeration)theEObject;
				T result = caseYEnumeration(yEnumeration);
				if (result == null) result = caseYElement(yEnumeration);
				if (result == null) result = caseYPackageableElement(yEnumeration);
				if (result == null) result = caseYClassifier(yEnumeration);
				if (result == null) result = caseYType(yEnumeration);
				if (result == null) result = caseYNamespace(yEnumeration);
				if (result == null) result = caseYObject(yEnumeration);
				if (result == null) result = caseYNamedElement(yEnumeration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YammPackage.YENUMERATION_LITERAL: {
				YEnumerationLiteral yEnumerationLiteral = (YEnumerationLiteral)theEObject;
				T result = caseYEnumerationLiteral(yEnumerationLiteral);
				if (result == null) result = caseYElement(yEnumerationLiteral);
				if (result == null) result = caseYPackageableElement(yEnumerationLiteral);
				if (result == null) result = caseYObject(yEnumerationLiteral);
				if (result == null) result = caseYNamedElement(yEnumerationLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YammPackage.YFEATURE: {
				YFeature yFeature = (YFeature)theEObject;
				T result = caseYFeature(yFeature);
				if (result == null) result = caseYObject(yFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YammPackage.YNAMED_ELEMENT: {
				YNamedElement yNamedElement = (YNamedElement)theEObject;
				T result = caseYNamedElement(yNamedElement);
				if (result == null) result = caseYObject(yNamedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YammPackage.YNAMESPACE: {
				YNamespace yNamespace = (YNamespace)theEObject;
				T result = caseYNamespace(yNamespace);
				if (result == null) result = caseYObject(yNamespace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YammPackage.YOPERATION: {
				YOperation yOperation = (YOperation)theEObject;
				T result = caseYOperation(yOperation);
				if (result == null) result = caseYElement(yOperation);
				if (result == null) result = caseYNamedElement(yOperation);
				if (result == null) result = caseYFeature(yOperation);
				if (result == null) result = caseYNamespace(yOperation);
				if (result == null) result = caseYObject(yOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YammPackage.YPACKAGE: {
				YPackage yPackage = (YPackage)theEObject;
				T result = caseYPackage(yPackage);
				if (result == null) result = caseYElement(yPackage);
				if (result == null) result = caseYPackageableElement(yPackage);
				if (result == null) result = caseYNamespace(yPackage);
				if (result == null) result = caseYObject(yPackage);
				if (result == null) result = caseYNamedElement(yPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YammPackage.YPACKAGEABLE_ELEMENT: {
				YPackageableElement yPackageableElement = (YPackageableElement)theEObject;
				T result = caseYPackageableElement(yPackageableElement);
				if (result == null) result = caseYNamedElement(yPackageableElement);
				if (result == null) result = caseYObject(yPackageableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YammPackage.YPACKAGE_IMPORT: {
				YPackageImport yPackageImport = (YPackageImport)theEObject;
				T result = caseYPackageImport(yPackageImport);
				if (result == null) result = caseYElement(yPackageImport);
				if (result == null) result = caseYObject(yPackageImport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YammPackage.YPARAMETER: {
				YParameter yParameter = (YParameter)theEObject;
				T result = caseYParameter(yParameter);
				if (result == null) result = caseYElement(yParameter);
				if (result == null) result = caseYNamedElement(yParameter);
				if (result == null) result = caseYObject(yParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YammPackage.YPRIMITIVE_TYPE: {
				YPrimitiveType yPrimitiveType = (YPrimitiveType)theEObject;
				T result = caseYPrimitiveType(yPrimitiveType);
				if (result == null) result = caseYElement(yPrimitiveType);
				if (result == null) result = caseYPackageableElement(yPrimitiveType);
				if (result == null) result = caseYClassifier(yPrimitiveType);
				if (result == null) result = caseYType(yPrimitiveType);
				if (result == null) result = caseYNamespace(yPrimitiveType);
				if (result == null) result = caseYObject(yPrimitiveType);
				if (result == null) result = caseYNamedElement(yPrimitiveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YammPackage.YPROPERTY: {
				YProperty yProperty = (YProperty)theEObject;
				T result = caseYProperty(yProperty);
				if (result == null) result = caseYElement(yProperty);
				if (result == null) result = caseYNamedElement(yProperty);
				if (result == null) result = caseYFeature(yProperty);
				if (result == null) result = caseYObject(yProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YammPackage.YTYPE: {
				YType yType = (YType)theEObject;
				T result = caseYType(yType);
				if (result == null) result = caseYNamedElement(yType);
				if (result == null) result = caseYObject(yType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YammPackage.YSTATE_MACHINE: {
				YStateMachine yStateMachine = (YStateMachine)theEObject;
				T result = caseYStateMachine(yStateMachine);
				if (result == null) result = caseYElement(yStateMachine);
				if (result == null) result = caseYNamedElement(yStateMachine);
				if (result == null) result = caseYObject(yStateMachine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YammPackage.YTRANSITION: {
				YTransition yTransition = (YTransition)theEObject;
				T result = caseYTransition(yTransition);
				if (result == null) result = caseYElement(yTransition);
				if (result == null) result = caseYNamedElement(yTransition);
				if (result == null) result = caseYObject(yTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YammPackage.YTR_ATTACHMENT: {
				YTrAttachment yTrAttachment = (YTrAttachment)theEObject;
				T result = caseYTrAttachment(yTrAttachment);
				if (result == null) result = caseYElement(yTrAttachment);
				if (result == null) result = caseYNamedElement(yTrAttachment);
				if (result == null) result = caseYObject(yTrAttachment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YammPackage.YEFFECT: {
				YEffect yEffect = (YEffect)theEObject;
				T result = caseYEffect(yEffect);
				if (result == null) result = caseYObject(yEffect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YammPackage.YVERTEX: {
				YVertex yVertex = (YVertex)theEObject;
				T result = caseYVertex(yVertex);
				if (result == null) result = caseYObject(yVertex);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YammPackage.YPSEUDOSTATE: {
				YPseudostate yPseudostate = (YPseudostate)theEObject;
				T result = caseYPseudostate(yPseudostate);
				if (result == null) result = caseYElement(yPseudostate);
				if (result == null) result = caseYNamedElement(yPseudostate);
				if (result == null) result = caseYVertex(yPseudostate);
				if (result == null) result = caseYObject(yPseudostate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YammPackage.YFINAL_STATE: {
				YFinalState yFinalState = (YFinalState)theEObject;
				T result = caseYFinalState(yFinalState);
				if (result == null) result = caseYElement(yFinalState);
				if (result == null) result = caseYNamedElement(yFinalState);
				if (result == null) result = caseYVertex(yFinalState);
				if (result == null) result = caseYObject(yFinalState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YammPackage.YSTATE: {
				YState yState = (YState)theEObject;
				T result = caseYState(yState);
				if (result == null) result = caseYElement(yState);
				if (result == null) result = caseYNamedElement(yState);
				if (result == null) result = caseYNamespace(yState);
				if (result == null) result = caseYVertex(yState);
				if (result == null) result = caseYObject(yState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YammPackage.YMODEL: {
				YModel yModel = (YModel)theEObject;
				T result = caseYModel(yModel);
				if (result == null) result = caseYObject(yModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YammPackage.YSHARED_EDGE: {
				YSharedEdge ySharedEdge = (YSharedEdge)theEObject;
				T result = caseYSharedEdge(ySharedEdge);
				if (result == null) result = caseYObject(ySharedEdge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YammPackage.YCOMPOSITE_EDGE: {
				YCompositeEdge yCompositeEdge = (YCompositeEdge)theEObject;
				T result = caseYCompositeEdge(yCompositeEdge);
				if (result == null) result = caseYObject(yCompositeEdge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YammPackage.YOBJECT: {
				YObject yObject = (YObject)theEObject;
				T result = caseYObject(yObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YammPackage.YSTATE_MACHINE_HANDLER: {
				YStateMachineHandler yStateMachineHandler = (YStateMachineHandler)theEObject;
				T result = caseYStateMachineHandler(yStateMachineHandler);
				if (result == null) result = caseYObject(yStateMachineHandler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YammPackage.YGLOBAL_STATE_MACHINE: {
				YGlobalStateMachine yGlobalStateMachine = (YGlobalStateMachine)theEObject;
				T result = caseYGlobalStateMachine(yGlobalStateMachine);
				if (result == null) result = caseYObject(yGlobalStateMachine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YammPackage.YCREATE_INSTANCE_EXPRESSION: {
				YCreateInstanceExpression yCreateInstanceExpression = (YCreateInstanceExpression)theEObject;
				T result = caseYCreateInstanceExpression(yCreateInstanceExpression);
				if (result == null) result = caseXExpression(yCreateInstanceExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YammPackage.YPRINT_EXPRESSION: {
				YPrintExpression yPrintExpression = (YPrintExpression)theEObject;
				T result = caseYPrintExpression(yPrintExpression);
				if (result == null) result = caseXExpression(yPrintExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YammPackage.YSET_RETURN_VALUE: {
				YSetReturnValue ySetReturnValue = (YSetReturnValue)theEObject;
				T result = caseYSetReturnValue(ySetReturnValue);
				if (result == null) result = caseXExpression(ySetReturnValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YammPackage.YGET_INSTANCES_OF_EXPRESSION: {
				YGetInstancesOfExpression yGetInstancesOfExpression = (YGetInstancesOfExpression)theEObject;
				T result = caseYGetInstancesOfExpression(yGetInstancesOfExpression);
				if (result == null) result = caseXExpression(yGetInstancesOfExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YammPackage.YMEMBER_FEATURE_CALL: {
				YMemberFeatureCall yMemberFeatureCall = (YMemberFeatureCall)theEObject;
				T result = caseYMemberFeatureCall(yMemberFeatureCall);
				if (result == null) result = caseXMemberFeatureCall(yMemberFeatureCall);
				if (result == null) result = caseXAbstractFeatureCall(yMemberFeatureCall);
				if (result == null) result = caseXExpression(yMemberFeatureCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YammPackage.YFEATURE_CALL: {
				YFeatureCall yFeatureCall = (YFeatureCall)theEObject;
				T result = caseYFeatureCall(yFeatureCall);
				if (result == null) result = caseXFeatureCall(yFeatureCall);
				if (result == null) result = caseXAbstractFeatureCall(yFeatureCall);
				if (result == null) result = caseXExpression(yFeatureCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YammPackage.YGET_OBJECT_MANAGEMENT: {
				YGetObjectManagement yGetObjectManagement = (YGetObjectManagement)theEObject;
				T result = caseYGetObjectManagement(yGetObjectManagement);
				if (result == null) result = caseXExpression(yGetObjectManagement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YammPackage.YGET_LAYER_INFORMATION: {
				YGetLayerInformation yGetLayerInformation = (YGetLayerInformation)theEObject;
				T result = caseYGetLayerInformation(yGetLayerInformation);
				if (result == null) result = caseXExpression(yGetLayerInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YammPackage.YCOLOR_DFA_OBJECT: {
				YColorDFAObject yColorDFAObject = (YColorDFAObject)theEObject;
				T result = caseYColorDFAObject(yColorDFAObject);
				if (result == null) result = caseXExpression(yColorDFAObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YammPackage.YGET_INSTANCES: {
				YGetInstances yGetInstances = (YGetInstances)theEObject;
				T result = caseYGetInstances(yGetInstances);
				if (result == null) result = caseXExpression(yGetInstances);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YammPackage.YCOUNT_FINAL_STATES: {
				YCountFinalStates yCountFinalStates = (YCountFinalStates)theEObject;
				T result = caseYCountFinalStates(yCountFinalStates);
				if (result == null) result = caseXExpression(yCountFinalStates);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YammPackage.YCOUNT_INITIAL_STATES: {
				YCountInitialStates yCountInitialStates = (YCountInitialStates)theEObject;
				T result = caseYCountInitialStates(yCountInitialStates);
				if (result == null) result = caseXExpression(yCountInitialStates);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YammPackage.YCOUNT_STATES: {
				YCountStates yCountStates = (YCountStates)theEObject;
				T result = caseYCountStates(yCountStates);
				if (result == null) result = caseXExpression(yCountStates);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YammPackage.YSET_ABSOLUTE_NODE_PROPABILITY: {
				YSetAbsoluteNodePropability ySetAbsoluteNodePropability = (YSetAbsoluteNodePropability)theEObject;
				T result = caseYSetAbsoluteNodePropability(ySetAbsoluteNodePropability);
				if (result == null) result = caseXExpression(ySetAbsoluteNodePropability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YammPackage.YCOUNT_REACHABLE_STATES: {
				YCountReachableStates yCountReachableStates = (YCountReachableStates)theEObject;
				T result = caseYCountReachableStates(yCountReachableStates);
				if (result == null) result = caseXExpression(yCountReachableStates);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YammPackage.YCOUNT_IN_VALID_TRANSITIONS: {
				YCountInValidTransitions yCountInValidTransitions = (YCountInValidTransitions)theEObject;
				T result = caseYCountInValidTransitions(yCountInValidTransitions);
				if (result == null) result = caseXExpression(yCountInValidTransitions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YammPackage.YSET_POPULATION_SIZE: {
				YSetPopulationSize ySetPopulationSize = (YSetPopulationSize)theEObject;
				T result = caseYSetPopulationSize(ySetPopulationSize);
				if (result == null) result = caseXExpression(ySetPopulationSize);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YammPackage.YLOAD_MODEL: {
				YLoadModel yLoadModel = (YLoadModel)theEObject;
				T result = caseYLoadModel(yLoadModel);
				if (result == null) result = caseXExpression(yLoadModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YammPackage.DSL_INFO: {
				DslInfo dslInfo = (DslInfo)theEObject;
				T result = caseDslInfo(dslInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YammPackage.FEATURE_INFO: {
				FeatureInfo featureInfo = (FeatureInfo)theEObject;
				T result = caseFeatureInfo(featureInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YammPackage.SINGLE_LINE_PROPERTY_INFO: {
				SingleLinePropertyInfo singleLinePropertyInfo = (SingleLinePropertyInfo)theEObject;
				T result = caseSingleLinePropertyInfo(singleLinePropertyInfo);
				if (result == null) result = caseFeatureInfo(singleLinePropertyInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YammPackage.GUARD_INFO: {
				GuardInfo guardInfo = (GuardInfo)theEObject;
				T result = caseGuardInfo(guardInfo);
				if (result == null) result = caseFeatureInfo(guardInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YammPackage.EFFECT_INFO: {
				EffectInfo effectInfo = (EffectInfo)theEObject;
				T result = caseEffectInfo(effectInfo);
				if (result == null) result = caseFeatureInfo(effectInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YammPackage.CONTAINMENT_INFO: {
				ContainmentInfo containmentInfo = (ContainmentInfo)theEObject;
				T result = caseContainmentInfo(containmentInfo);
				if (result == null) result = caseFeatureInfo(containmentInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YammPackage.ESTRUCTURAL_FEATURE_TO_FEATURE_INFO_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<EStructuralFeature, FeatureInfo> eStructuralFeatureToFeatureInfoMap = (Map.Entry<EStructuralFeature, FeatureInfo>)theEObject;
				T result = caseEStructuralFeatureToFeatureInfoMap(eStructuralFeatureToFeatureInfoMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YammPackage.LINE: {
				Line line = (Line)theEObject;
				T result = caseLine(line);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YammPackage.YSTRUCTURE: {
				YStructure yStructure = (YStructure)theEObject;
				T result = caseYStructure(yStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YammPackage.YINTERNAL: {
				YInternal yInternal = (YInternal)theEObject;
				T result = caseYInternal(yInternal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YammPackage.YTIME_STEP: {
				YTimeStep yTimeStep = (YTimeStep)theEObject;
				T result = caseYTimeStep(yTimeStep);
				if (result == null) result = caseXExpression(yTimeStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YammPackage.YOBSERVER_ADD_VALUE: {
				YObserverAddValue yObserverAddValue = (YObserverAddValue)theEObject;
				T result = caseYObserverAddValue(yObserverAddValue);
				if (result == null) result = caseXExpression(yObserverAddValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYClass(YClass object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YClassifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YClassifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYClassifier(YClassifier object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YComment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YComment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYComment(YComment object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YConstraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YConstraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYConstraint(YConstraint object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YData Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YData Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYDataType(YDataType object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YElement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YElement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYElement(YElement object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YElement Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YElement Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYElementImport(YElementImport object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YEnumeration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YEnumeration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYEnumeration(YEnumeration object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YEnumeration Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YEnumeration Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYEnumerationLiteral(YEnumerationLiteral object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YFeature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YFeature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYFeature(YFeature object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YNamed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YNamed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYNamedElement(YNamedElement object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YNamespace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YNamespace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYNamespace(YNamespace object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YOperation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YOperation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYOperation(YOperation object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YPackage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YPackage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYPackage(YPackage object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YPackageable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YPackageable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYPackageableElement(YPackageableElement object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YPackage Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YPackage Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYPackageImport(YPackageImport object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YParameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YParameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYParameter(YParameter object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YPrimitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YPrimitive Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYPrimitiveType(YPrimitiveType object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YProperty</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YProperty</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYProperty(YProperty object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YType</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YType</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYType(YType object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YState Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YState Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYStateMachine(YStateMachine object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YTransition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YTransition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYTransition(YTransition object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YTr Attachment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YTr Attachment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYTrAttachment(YTrAttachment object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YEffect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YEffect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYEffect(YEffect object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YVertex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YVertex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYVertex(YVertex object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YPseudostate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YPseudostate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYPseudostate(YPseudostate object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YFinal State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YFinal State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYFinalState(YFinalState object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YState</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YState</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYState(YState object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YModel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YModel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYModel(YModel object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YShared Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YShared Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYSharedEdge(YSharedEdge object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YComposite Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YComposite Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYCompositeEdge(YCompositeEdge object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYObject(YObject object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YState Machine Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YState Machine Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYStateMachineHandler(YStateMachineHandler object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YGlobal State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YGlobal State Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYGlobalStateMachine(YGlobalStateMachine object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YCreate Instance Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YCreate Instance Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYCreateInstanceExpression(YCreateInstanceExpression object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YPrint Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YPrint Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYPrintExpression(YPrintExpression object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YSet Return Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YSet Return Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYSetReturnValue(YSetReturnValue object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YGet Instances Of Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YGet Instances Of Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYGetInstancesOfExpression(YGetInstancesOfExpression object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YMember Feature Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YMember Feature Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYMemberFeatureCall(YMemberFeatureCall object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YFeature Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YFeature Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYFeatureCall(YFeatureCall object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YGet Object Management</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YGet Object Management</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYGetObjectManagement(YGetObjectManagement object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YGet Layer Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YGet Layer Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYGetLayerInformation(YGetLayerInformation object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YColor DFA Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YColor DFA Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYColorDFAObject(YColorDFAObject object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YGet Instances</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YGet Instances</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYGetInstances(YGetInstances object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YCount Final States</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YCount Final States</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYCountFinalStates(YCountFinalStates object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YCount Initial States</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YCount Initial States</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYCountInitialStates(YCountInitialStates object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YCount States</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YCount States</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYCountStates(YCountStates object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YSet Absolute Node Propability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YSet Absolute Node Propability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYSetAbsoluteNodePropability(YSetAbsoluteNodePropability object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YCount Reachable States</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YCount Reachable States</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYCountReachableStates(YCountReachableStates object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YCount In Valid Transitions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YCount In Valid Transitions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYCountInValidTransitions(YCountInValidTransitions object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YSet Population Size</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YSet Population Size</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYSetPopulationSize(YSetPopulationSize object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YLoad Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YLoad Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYLoadModel(YLoadModel object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dsl Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dsl Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDslInfo(DslInfo object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureInfo(FeatureInfo object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Line Property Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Line Property Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleLinePropertyInfo(SingleLinePropertyInfo object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Guard Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guard Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuardInfo(GuardInfo object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Effect Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Effect Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEffectInfo(EffectInfo object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Containment Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Containment Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainmentInfo(ContainmentInfo object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EStructural Feature To Feature Info Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EStructural Feature To Feature Info Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEStructuralFeatureToFeatureInfoMap(Map.Entry<EStructuralFeature, FeatureInfo> object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLine(Line object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YStructure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YStructure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYStructure(YStructure object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YInternal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YInternal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYInternal(YInternal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YTime Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YTime Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYTimeStep(YTimeStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YObserver Add Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YObserver Add Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYObserverAddValue(YObserverAddValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XExpression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XExpression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @since 2.7
	 * @generated
	 */
	public T caseXExpression(XExpression object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XAbstract Feature Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XAbstract Feature Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @since 2.7
	 * @generated
	 */
	public T caseXAbstractFeatureCall(XAbstractFeatureCall object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XMember Feature Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XMember Feature Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @since 2.7
	 * @generated
	 */
	public T caseXMemberFeatureCall(XMemberFeatureCall object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XFeature Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XFeature Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @since 2.7
	 * @generated
	 */
	public T caseXFeatureCall(XFeatureCall object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object)
	{
		return null;
	}

} //YammSwitch
