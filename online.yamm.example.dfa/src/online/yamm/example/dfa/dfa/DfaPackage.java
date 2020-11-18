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
package online.yamm.example.dfa.dfa;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see online.yamm.example.dfa.dfa.DfaFactory
 * @model kind="package"
 * @generated
 */
public interface DfaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dfa";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.yamm.online/example/Dfa";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dfa";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DfaPackage eINSTANCE = online.yamm.example.dfa.dfa.impl.DfaPackageImpl.init();

	/**
	 * The meta object id for the '{@link online.yamm.example.dfa.dfa.impl.RObjectImpl <em>RObject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.example.dfa.dfa.impl.RObjectImpl
	 * @see online.yamm.example.dfa.dfa.impl.DfaPackageImpl#getRObject()
	 * @generated
	 */
	int ROBJECT = 1;

	/**
	 * The feature id for the '<em><b>Object ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBJECT__OBJECT_ID = 0;

	/**
	 * The number of structural features of the '<em>RObject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBJECT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>RObject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link online.yamm.example.dfa.dfa.impl.DFAImpl <em>DFA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.example.dfa.dfa.impl.DFAImpl
	 * @see online.yamm.example.dfa.dfa.impl.DfaPackageImpl#getDFA()
	 * @generated
	 */
	int DFA = 0;

	/**
	 * The feature id for the '<em><b>Object ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFA__OBJECT_ID = ROBJECT__OBJECT_ID;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFA__TRANSITIONS = ROBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFA__STATES = ROBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFA__INITIAL_STATE = ROBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>DFA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFA_FEATURE_COUNT = ROBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>DFA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFA_OPERATION_COUNT = ROBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link online.yamm.example.dfa.dfa.impl.DStateImpl <em>DState</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.example.dfa.dfa.impl.DStateImpl
	 * @see online.yamm.example.dfa.dfa.impl.DfaPackageImpl#getDState()
	 * @generated
	 */
	int DSTATE = 2;

	/**
	 * The feature id for the '<em><b>Object ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSTATE__OBJECT_ID = ROBJECT__OBJECT_ID;

	/**
	 * The feature id for the '<em><b>State Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSTATE__STATE_NAME = ROBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>DIn</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSTATE__DIN = ROBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>DOut</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSTATE__DOUT = ROBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>DState</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSTATE_FEATURE_COUNT = ROBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>DState</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSTATE_OPERATION_COUNT = ROBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link online.yamm.example.dfa.dfa.impl.DFinalStateImpl <em>DFinal State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.example.dfa.dfa.impl.DFinalStateImpl
	 * @see online.yamm.example.dfa.dfa.impl.DfaPackageImpl#getDFinalState()
	 * @generated
	 */
	int DFINAL_STATE = 3;

	/**
	 * The feature id for the '<em><b>Object ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFINAL_STATE__OBJECT_ID = DSTATE__OBJECT_ID;

	/**
	 * The feature id for the '<em><b>State Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFINAL_STATE__STATE_NAME = DSTATE__STATE_NAME;

	/**
	 * The feature id for the '<em><b>DIn</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFINAL_STATE__DIN = DSTATE__DIN;

	/**
	 * The feature id for the '<em><b>DOut</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFINAL_STATE__DOUT = DSTATE__DOUT;

	/**
	 * The number of structural features of the '<em>DFinal State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFINAL_STATE_FEATURE_COUNT = DSTATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>DFinal State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFINAL_STATE_OPERATION_COUNT = DSTATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link online.yamm.example.dfa.dfa.impl.DInitialStateImpl <em>DInitial State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.example.dfa.dfa.impl.DInitialStateImpl
	 * @see online.yamm.example.dfa.dfa.impl.DfaPackageImpl#getDInitialState()
	 * @generated
	 */
	int DINITIAL_STATE = 4;

	/**
	 * The feature id for the '<em><b>Object ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINITIAL_STATE__OBJECT_ID = DSTATE__OBJECT_ID;

	/**
	 * The feature id for the '<em><b>State Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINITIAL_STATE__STATE_NAME = DSTATE__STATE_NAME;

	/**
	 * The feature id for the '<em><b>DIn</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINITIAL_STATE__DIN = DSTATE__DIN;

	/**
	 * The feature id for the '<em><b>DOut</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINITIAL_STATE__DOUT = DSTATE__DOUT;

	/**
	 * The number of structural features of the '<em>DInitial State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINITIAL_STATE_FEATURE_COUNT = DSTATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>DInitial State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINITIAL_STATE_OPERATION_COUNT = DSTATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link online.yamm.example.dfa.dfa.impl.DInitialFinalStateImpl <em>DInitial Final State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.example.dfa.dfa.impl.DInitialFinalStateImpl
	 * @see online.yamm.example.dfa.dfa.impl.DfaPackageImpl#getDInitialFinalState()
	 * @generated
	 */
	int DINITIAL_FINAL_STATE = 5;

	/**
	 * The feature id for the '<em><b>Object ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINITIAL_FINAL_STATE__OBJECT_ID = DFINAL_STATE__OBJECT_ID;

	/**
	 * The feature id for the '<em><b>State Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINITIAL_FINAL_STATE__STATE_NAME = DFINAL_STATE__STATE_NAME;

	/**
	 * The feature id for the '<em><b>DIn</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINITIAL_FINAL_STATE__DIN = DFINAL_STATE__DIN;

	/**
	 * The feature id for the '<em><b>DOut</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINITIAL_FINAL_STATE__DOUT = DFINAL_STATE__DOUT;

	/**
	 * The number of structural features of the '<em>DInitial Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINITIAL_FINAL_STATE_FEATURE_COUNT = DFINAL_STATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>DInitial Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINITIAL_FINAL_STATE_OPERATION_COUNT = DFINAL_STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link online.yamm.example.dfa.dfa.impl.DTransitionImpl <em>DTransition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.example.dfa.dfa.impl.DTransitionImpl
	 * @see online.yamm.example.dfa.dfa.impl.DfaPackageImpl#getDTransition()
	 * @generated
	 */
	int DTRANSITION = 6;

	/**
	 * The feature id for the '<em><b>Object ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTRANSITION__OBJECT_ID = ROBJECT__OBJECT_ID;

	/**
	 * The feature id for the '<em><b>DTarget</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTRANSITION__DTARGET = ROBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>DSource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTRANSITION__DSOURCE = ROBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transition Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTRANSITION__TRANSITION_NAME = ROBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>DTransition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTRANSITION_FEATURE_COUNT = ROBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>DTransition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTRANSITION_OPERATION_COUNT = ROBJECT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link online.yamm.example.dfa.dfa.DFA <em>DFA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DFA</em>'.
	 * @see online.yamm.example.dfa.dfa.DFA
	 * @generated
	 */
	EClass getDFA();

	/**
	 * Returns the meta object for the containment reference list '{@link online.yamm.example.dfa.dfa.DFA#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see online.yamm.example.dfa.dfa.DFA#getTransitions()
	 * @see #getDFA()
	 * @generated
	 */
	EReference getDFA_Transitions();

	/**
	 * Returns the meta object for the containment reference list '{@link online.yamm.example.dfa.dfa.DFA#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see online.yamm.example.dfa.dfa.DFA#getStates()
	 * @see #getDFA()
	 * @generated
	 */
	EReference getDFA_States();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.example.dfa.dfa.DFA#getInitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initial State</em>'.
	 * @see online.yamm.example.dfa.dfa.DFA#getInitialState()
	 * @see #getDFA()
	 * @generated
	 */
	EReference getDFA_InitialState();

	/**
	 * Returns the meta object for class '{@link online.yamm.example.dfa.dfa.RObject <em>RObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RObject</em>'.
	 * @see online.yamm.example.dfa.dfa.RObject
	 * @generated
	 */
	EClass getRObject();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.example.dfa.dfa.RObject#getObjectID <em>Object ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object ID</em>'.
	 * @see online.yamm.example.dfa.dfa.RObject#getObjectID()
	 * @see #getRObject()
	 * @generated
	 */
	EAttribute getRObject_ObjectID();

	/**
	 * Returns the meta object for class '{@link online.yamm.example.dfa.dfa.DState <em>DState</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DState</em>'.
	 * @see online.yamm.example.dfa.dfa.DState
	 * @generated
	 */
	EClass getDState();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.example.dfa.dfa.DState#getStateName <em>State Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State Name</em>'.
	 * @see online.yamm.example.dfa.dfa.DState#getStateName()
	 * @see #getDState()
	 * @generated
	 */
	EAttribute getDState_StateName();

	/**
	 * Returns the meta object for the reference list '{@link online.yamm.example.dfa.dfa.DState#getDIn <em>DIn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>DIn</em>'.
	 * @see online.yamm.example.dfa.dfa.DState#getDIn()
	 * @see #getDState()
	 * @generated
	 */
	EReference getDState_DIn();

	/**
	 * Returns the meta object for the reference list '{@link online.yamm.example.dfa.dfa.DState#getDOut <em>DOut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>DOut</em>'.
	 * @see online.yamm.example.dfa.dfa.DState#getDOut()
	 * @see #getDState()
	 * @generated
	 */
	EReference getDState_DOut();

	/**
	 * Returns the meta object for class '{@link online.yamm.example.dfa.dfa.DFinalState <em>DFinal State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DFinal State</em>'.
	 * @see online.yamm.example.dfa.dfa.DFinalState
	 * @generated
	 */
	EClass getDFinalState();

	/**
	 * Returns the meta object for class '{@link online.yamm.example.dfa.dfa.DInitialState <em>DInitial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DInitial State</em>'.
	 * @see online.yamm.example.dfa.dfa.DInitialState
	 * @generated
	 */
	EClass getDInitialState();

	/**
	 * Returns the meta object for class '{@link online.yamm.example.dfa.dfa.DInitialFinalState <em>DInitial Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DInitial Final State</em>'.
	 * @see online.yamm.example.dfa.dfa.DInitialFinalState
	 * @generated
	 */
	EClass getDInitialFinalState();

	/**
	 * Returns the meta object for class '{@link online.yamm.example.dfa.dfa.DTransition <em>DTransition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DTransition</em>'.
	 * @see online.yamm.example.dfa.dfa.DTransition
	 * @generated
	 */
	EClass getDTransition();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.example.dfa.dfa.DTransition#getDTarget <em>DTarget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>DTarget</em>'.
	 * @see online.yamm.example.dfa.dfa.DTransition#getDTarget()
	 * @see #getDTransition()
	 * @generated
	 */
	EReference getDTransition_DTarget();

	/**
	 * Returns the meta object for the reference '{@link online.yamm.example.dfa.dfa.DTransition#getDSource <em>DSource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>DSource</em>'.
	 * @see online.yamm.example.dfa.dfa.DTransition#getDSource()
	 * @see #getDTransition()
	 * @generated
	 */
	EReference getDTransition_DSource();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.example.dfa.dfa.DTransition#getTransitionName <em>Transition Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transition Name</em>'.
	 * @see online.yamm.example.dfa.dfa.DTransition#getTransitionName()
	 * @see #getDTransition()
	 * @generated
	 */
	EAttribute getDTransition_TransitionName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DfaFactory getDfaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link online.yamm.example.dfa.dfa.impl.DFAImpl <em>DFA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.example.dfa.dfa.impl.DFAImpl
		 * @see online.yamm.example.dfa.dfa.impl.DfaPackageImpl#getDFA()
		 * @generated
		 */
		EClass DFA = eINSTANCE.getDFA();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DFA__TRANSITIONS = eINSTANCE.getDFA_Transitions();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DFA__STATES = eINSTANCE.getDFA_States();

		/**
		 * The meta object literal for the '<em><b>Initial State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DFA__INITIAL_STATE = eINSTANCE.getDFA_InitialState();

		/**
		 * The meta object literal for the '{@link online.yamm.example.dfa.dfa.impl.RObjectImpl <em>RObject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.example.dfa.dfa.impl.RObjectImpl
		 * @see online.yamm.example.dfa.dfa.impl.DfaPackageImpl#getRObject()
		 * @generated
		 */
		EClass ROBJECT = eINSTANCE.getRObject();

		/**
		 * The meta object literal for the '<em><b>Object ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBJECT__OBJECT_ID = eINSTANCE.getRObject_ObjectID();

		/**
		 * The meta object literal for the '{@link online.yamm.example.dfa.dfa.impl.DStateImpl <em>DState</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.example.dfa.dfa.impl.DStateImpl
		 * @see online.yamm.example.dfa.dfa.impl.DfaPackageImpl#getDState()
		 * @generated
		 */
		EClass DSTATE = eINSTANCE.getDState();

		/**
		 * The meta object literal for the '<em><b>State Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSTATE__STATE_NAME = eINSTANCE.getDState_StateName();

		/**
		 * The meta object literal for the '<em><b>DIn</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSTATE__DIN = eINSTANCE.getDState_DIn();

		/**
		 * The meta object literal for the '<em><b>DOut</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSTATE__DOUT = eINSTANCE.getDState_DOut();

		/**
		 * The meta object literal for the '{@link online.yamm.example.dfa.dfa.impl.DFinalStateImpl <em>DFinal State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.example.dfa.dfa.impl.DFinalStateImpl
		 * @see online.yamm.example.dfa.dfa.impl.DfaPackageImpl#getDFinalState()
		 * @generated
		 */
		EClass DFINAL_STATE = eINSTANCE.getDFinalState();

		/**
		 * The meta object literal for the '{@link online.yamm.example.dfa.dfa.impl.DInitialStateImpl <em>DInitial State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.example.dfa.dfa.impl.DInitialStateImpl
		 * @see online.yamm.example.dfa.dfa.impl.DfaPackageImpl#getDInitialState()
		 * @generated
		 */
		EClass DINITIAL_STATE = eINSTANCE.getDInitialState();

		/**
		 * The meta object literal for the '{@link online.yamm.example.dfa.dfa.impl.DInitialFinalStateImpl <em>DInitial Final State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.example.dfa.dfa.impl.DInitialFinalStateImpl
		 * @see online.yamm.example.dfa.dfa.impl.DfaPackageImpl#getDInitialFinalState()
		 * @generated
		 */
		EClass DINITIAL_FINAL_STATE = eINSTANCE.getDInitialFinalState();

		/**
		 * The meta object literal for the '{@link online.yamm.example.dfa.dfa.impl.DTransitionImpl <em>DTransition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.example.dfa.dfa.impl.DTransitionImpl
		 * @see online.yamm.example.dfa.dfa.impl.DfaPackageImpl#getDTransition()
		 * @generated
		 */
		EClass DTRANSITION = eINSTANCE.getDTransition();

		/**
		 * The meta object literal for the '<em><b>DTarget</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DTRANSITION__DTARGET = eINSTANCE.getDTransition_DTarget();

		/**
		 * The meta object literal for the '<em><b>DSource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DTRANSITION__DSOURCE = eINSTANCE.getDTransition_DSource();

		/**
		 * The meta object literal for the '<em><b>Transition Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DTRANSITION__TRANSITION_NAME = eINSTANCE.getDTransition_TransitionName();

	}

} //DfaPackage
