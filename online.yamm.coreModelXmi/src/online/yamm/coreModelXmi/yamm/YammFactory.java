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
package online.yamm.coreModelXmi.yamm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see online.yamm.coreModelXmi.yamm.YammPackage
 * @generated
 */
public interface YammFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	YammFactory eINSTANCE = online.yamm.coreModelXmi.yamm.impl.YammFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>YClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YClass</em>'.
	 * @generated
	 */
	YClass createYClass();

	/**
	 * Returns a new object of class '<em>YClassifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YClassifier</em>'.
	 * @generated
	 */
	YClassifier createYClassifier();

	/**
	 * Returns a new object of class '<em>YComment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YComment</em>'.
	 * @generated
	 */
	YComment createYComment();

	/**
	 * Returns a new object of class '<em>YConstraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YConstraint</em>'.
	 * @generated
	 */
	YConstraint createYConstraint();

	/**
	 * Returns a new object of class '<em>YData Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YData Type</em>'.
	 * @generated
	 */
	YDataType createYDataType();

	/**
	 * Returns a new object of class '<em>YElement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YElement</em>'.
	 * @generated
	 */
	YElement createYElement();

	/**
	 * Returns a new object of class '<em>YElement Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YElement Import</em>'.
	 * @generated
	 */
	YElementImport createYElementImport();

	/**
	 * Returns a new object of class '<em>YEnumeration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YEnumeration</em>'.
	 * @generated
	 */
	YEnumeration createYEnumeration();

	/**
	 * Returns a new object of class '<em>YEnumeration Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YEnumeration Literal</em>'.
	 * @generated
	 */
	YEnumerationLiteral createYEnumerationLiteral();

	/**
	 * Returns a new object of class '<em>YFeature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YFeature</em>'.
	 * @generated
	 */
	YFeature createYFeature();

	/**
	 * Returns a new object of class '<em>YNamed Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YNamed Element</em>'.
	 * @generated
	 */
	YNamedElement createYNamedElement();

	/**
	 * Returns a new object of class '<em>YNamespace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YNamespace</em>'.
	 * @generated
	 */
	YNamespace createYNamespace();

	/**
	 * Returns a new object of class '<em>YOperation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YOperation</em>'.
	 * @generated
	 */
	YOperation createYOperation();

	/**
	 * Returns a new object of class '<em>YPackage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YPackage</em>'.
	 * @generated
	 */
	YPackage createYPackage();

	/**
	 * Returns a new object of class '<em>YPackageable Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YPackageable Element</em>'.
	 * @generated
	 */
	YPackageableElement createYPackageableElement();

	/**
	 * Returns a new object of class '<em>YPackage Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YPackage Import</em>'.
	 * @generated
	 */
	YPackageImport createYPackageImport();

	/**
	 * Returns a new object of class '<em>YParameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YParameter</em>'.
	 * @generated
	 */
	YParameter createYParameter();

	/**
	 * Returns a new object of class '<em>YPrimitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YPrimitive Type</em>'.
	 * @generated
	 */
	YPrimitiveType createYPrimitiveType();

	/**
	 * Returns a new object of class '<em>YProperty</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YProperty</em>'.
	 * @generated
	 */
	YProperty createYProperty();

	/**
	 * Returns a new object of class '<em>YType</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YType</em>'.
	 * @generated
	 */
	YType createYType();

	/**
	 * Returns a new object of class '<em>YState Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YState Machine</em>'.
	 * @generated
	 */
	YStateMachine createYStateMachine();

	/**
	 * Returns a new object of class '<em>YTransition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YTransition</em>'.
	 * @generated
	 */
	YTransition createYTransition();

	/**
	 * Returns a new object of class '<em>YTr Attachment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YTr Attachment</em>'.
	 * @generated
	 */
	YTrAttachment createYTrAttachment();

	/**
	 * Returns a new object of class '<em>YEffect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YEffect</em>'.
	 * @generated
	 */
	YEffect createYEffect();

	/**
	 * Returns a new object of class '<em>YVertex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YVertex</em>'.
	 * @generated
	 */
	YVertex createYVertex();

	/**
	 * Returns a new object of class '<em>YPseudostate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YPseudostate</em>'.
	 * @generated
	 */
	YPseudostate createYPseudostate();

	/**
	 * Returns a new object of class '<em>YFinal State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YFinal State</em>'.
	 * @generated
	 */
	YFinalState createYFinalState();

	/**
	 * Returns a new object of class '<em>YState</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YState</em>'.
	 * @generated
	 */
	YState createYState();

	/**
	 * Returns a new object of class '<em>YModel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YModel</em>'.
	 * @generated
	 */
	YModel createYModel();

	/**
	 * Returns a new object of class '<em>YShared Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YShared Edge</em>'.
	 * @generated
	 */
	YSharedEdge createYSharedEdge();

	/**
	 * Returns a new object of class '<em>YComposite Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YComposite Edge</em>'.
	 * @generated
	 */
	YCompositeEdge createYCompositeEdge();

	/**
	 * Returns a new object of class '<em>YObject</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YObject</em>'.
	 * @generated
	 */
	YObject createYObject();

	/**
	 * Returns a new object of class '<em>YState Machine Handler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YState Machine Handler</em>'.
	 * @generated
	 */
	YStateMachineHandler createYStateMachineHandler();

	/**
	 * Returns a new object of class '<em>YGlobal State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YGlobal State Machine</em>'.
	 * @generated
	 */
	YGlobalStateMachine createYGlobalStateMachine();

	/**
	 * Returns a new object of class '<em>YCreate Instance Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YCreate Instance Expression</em>'.
	 * @generated
	 */
	YCreateInstanceExpression createYCreateInstanceExpression();

	/**
	 * Returns a new object of class '<em>YPrint Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YPrint Expression</em>'.
	 * @generated
	 */
	YPrintExpression createYPrintExpression();

	/**
	 * Returns a new object of class '<em>YSet Return Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YSet Return Value</em>'.
	 * @generated
	 */
	YSetReturnValue createYSetReturnValue();

	/**
	 * Returns a new object of class '<em>YGet Instances Of Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YGet Instances Of Expression</em>'.
	 * @generated
	 */
	YGetInstancesOfExpression createYGetInstancesOfExpression();

	/**
	 * Returns a new object of class '<em>YMember Feature Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YMember Feature Call</em>'.
	 * @generated
	 */
	YMemberFeatureCall createYMemberFeatureCall();

	/**
	 * Returns a new object of class '<em>YFeature Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YFeature Call</em>'.
	 * @generated
	 */
	YFeatureCall createYFeatureCall();

	/**
	 * Returns a new object of class '<em>YGet Object Management</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YGet Object Management</em>'.
	 * @generated
	 */
	YGetObjectManagement createYGetObjectManagement();

	/**
	 * Returns a new object of class '<em>YGet Layer Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YGet Layer Information</em>'.
	 * @generated
	 */
	YGetLayerInformation createYGetLayerInformation();

	/**
	 * Returns a new object of class '<em>YColor DFA Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YColor DFA Object</em>'.
	 * @generated
	 */
	YColorDFAObject createYColorDFAObject();

	/**
	 * Returns a new object of class '<em>YGet Instances</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YGet Instances</em>'.
	 * @generated
	 */
	YGetInstances createYGetInstances();

	/**
	 * Returns a new object of class '<em>YCount Final States</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YCount Final States</em>'.
	 * @generated
	 */
	YCountFinalStates createYCountFinalStates();

	/**
	 * Returns a new object of class '<em>YCount Initial States</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YCount Initial States</em>'.
	 * @generated
	 */
	YCountInitialStates createYCountInitialStates();

	/**
	 * Returns a new object of class '<em>YCount States</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YCount States</em>'.
	 * @generated
	 */
	YCountStates createYCountStates();

	/**
	 * Returns a new object of class '<em>YSet Absolute Node Propability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YSet Absolute Node Propability</em>'.
	 * @generated
	 */
	YSetAbsoluteNodePropability createYSetAbsoluteNodePropability();

	/**
	 * Returns a new object of class '<em>YCount Reachable States</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YCount Reachable States</em>'.
	 * @generated
	 */
	YCountReachableStates createYCountReachableStates();

	/**
	 * Returns a new object of class '<em>YCount In Valid Transitions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YCount In Valid Transitions</em>'.
	 * @generated
	 */
	YCountInValidTransitions createYCountInValidTransitions();

	/**
	 * Returns a new object of class '<em>YSet Population Size</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YSet Population Size</em>'.
	 * @generated
	 */
	YSetPopulationSize createYSetPopulationSize();

	/**
	 * Returns a new object of class '<em>YLoad Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YLoad Model</em>'.
	 * @generated
	 */
	YLoadModel createYLoadModel();

	/**
	 * Returns a new object of class '<em>Dsl Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dsl Info</em>'.
	 * @generated
	 */
	DslInfo createDslInfo();

	/**
	 * Returns a new object of class '<em>Feature Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Info</em>'.
	 * @generated
	 */
	FeatureInfo createFeatureInfo();

	/**
	 * Returns a new object of class '<em>Single Line Property Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Line Property Info</em>'.
	 * @generated
	 */
	SingleLinePropertyInfo createSingleLinePropertyInfo();

	/**
	 * Returns a new object of class '<em>Guard Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Guard Info</em>'.
	 * @generated
	 */
	GuardInfo createGuardInfo();

	/**
	 * Returns a new object of class '<em>Effect Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Effect Info</em>'.
	 * @generated
	 */
	EffectInfo createEffectInfo();

	/**
	 * Returns a new object of class '<em>Containment Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Containment Info</em>'.
	 * @generated
	 */
	ContainmentInfo createContainmentInfo();

	/**
	 * Returns a new object of class '<em>Line</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Line</em>'.
	 * @generated
	 */
	Line createLine();

	/**
	 * Returns a new object of class '<em>YStructure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YStructure</em>'.
	 * @generated
	 */
	YStructure createYStructure();

	/**
	 * Returns a new object of class '<em>YInternal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YInternal</em>'.
	 * @generated
	 */
	YInternal createYInternal();

	/**
	 * Returns a new object of class '<em>YTime Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YTime Step</em>'.
	 * @generated
	 */
	YTimeStep createYTimeStep();

	/**
	 * Returns a new object of class '<em>YObserver Add Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YObserver Add Value</em>'.
	 * @generated
	 */
	YObserverAddValue createYObserverAddValue();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	YammPackage getYammPackage();

} //YammFactory
