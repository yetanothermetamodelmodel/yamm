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
package online.yamm.example.dfa.dfa.impl;

import online.yamm.example.dfa.dfa.DFinalState;
import online.yamm.example.dfa.dfa.DInitialFinalState;
import online.yamm.example.dfa.dfa.DInitialState;
import online.yamm.example.dfa.dfa.DState;
import online.yamm.example.dfa.dfa.DTransition;
import online.yamm.example.dfa.dfa.DfaFactory;
import online.yamm.example.dfa.dfa.DfaPackage;
import online.yamm.example.dfa.dfa.RObject;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DfaPackageImpl extends EPackageImpl implements DfaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dfaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dFinalStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dInitialStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dInitialFinalStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dTransitionEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see online.yamm.example.dfa.dfa.DfaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DfaPackageImpl() {
		super(eNS_URI, DfaFactory.eINSTANCE);
	}


	public DfaPackageImpl(EFactory e) {
		super(e);
	}

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link DfaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DfaPackage init() {
		if (isInited) return (DfaPackage)EPackage.Registry.INSTANCE.getEPackage(DfaPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDfaPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DfaPackageImpl theDfaPackage = registeredDfaPackage instanceof DfaPackageImpl ? (DfaPackageImpl)registeredDfaPackage : new DfaPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theDfaPackage.createPackageContents();

		// Initialize created meta-data
		theDfaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDfaPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DfaPackage.eNS_URI, theDfaPackage);
		return theDfaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDFA() {
		return dfaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDFA_Transitions() {
		return (EReference)dfaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDFA_States() {
		return (EReference)dfaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDFA_InitialState() {
		return (EReference)dfaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRObject() {
		return rObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRObject_ObjectID() {
		return (EAttribute)rObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDState() {
		return dStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDState_StateName() {
		return (EAttribute)dStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDState_DIn() {
		return (EReference)dStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDState_DOut() {
		return (EReference)dStateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDFinalState() {
		return dFinalStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDInitialState() {
		return dInitialStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDInitialFinalState() {
		return dInitialFinalStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDTransition() {
		return dTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDTransition_DTarget() {
		return (EReference)dTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDTransition_DSource() {
		return (EReference)dTransitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDTransition_TransitionName() {
		return (EAttribute)dTransitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DfaFactory getDfaFactory() {
		return (DfaFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		dfaEClass = createEClass(DFA);
		createEReference(dfaEClass, DFA__TRANSITIONS);
		createEReference(dfaEClass, DFA__STATES);
		createEReference(dfaEClass, DFA__INITIAL_STATE);

		rObjectEClass = createEClass(ROBJECT);
		createEAttribute(rObjectEClass, ROBJECT__OBJECT_ID);

		dStateEClass = createEClass(DSTATE);
		createEAttribute(dStateEClass, DSTATE__STATE_NAME);
		createEReference(dStateEClass, DSTATE__DIN);
		createEReference(dStateEClass, DSTATE__DOUT);

		dFinalStateEClass = createEClass(DFINAL_STATE);

		dInitialStateEClass = createEClass(DINITIAL_STATE);

		dInitialFinalStateEClass = createEClass(DINITIAL_FINAL_STATE);

		dTransitionEClass = createEClass(DTRANSITION);
		createEReference(dTransitionEClass, DTRANSITION__DTARGET);
		createEReference(dTransitionEClass, DTRANSITION__DSOURCE);
		createEAttribute(dTransitionEClass, DTRANSITION__TRANSITION_NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dfaEClass.getESuperTypes().add(this.getRObject());
		dStateEClass.getESuperTypes().add(this.getRObject());
		dFinalStateEClass.getESuperTypes().add(this.getDState());
		dInitialStateEClass.getESuperTypes().add(this.getDState());
		dInitialFinalStateEClass.getESuperTypes().add(this.getDFinalState());
		dInitialFinalStateEClass.getESuperTypes().add(this.getDInitialState());
		dTransitionEClass.getESuperTypes().add(this.getRObject());

		// Initialize classes, features, and operations; add parameters
		initEClass(dfaEClass, online.yamm.example.dfa.dfa.DFA.class, "DFA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDFA_Transitions(), this.getDTransition(), null, "transitions", null, 1, -1, online.yamm.example.dfa.dfa.DFA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDFA_States(), this.getDState(), null, "states", null, 1, -1, online.yamm.example.dfa.dfa.DFA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDFA_InitialState(), this.getDInitialState(), null, "initialState", null, 1, 1, online.yamm.example.dfa.dfa.DFA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rObjectEClass, RObject.class, "RObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRObject_ObjectID(), ecorePackage.getEString(), "ObjectID", null, 0, 1, RObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dStateEClass, DState.class, "DState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDState_StateName(), ecorePackage.getEString(), "stateName", null, 0, 1, DState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDState_DIn(), this.getDTransition(), null, "dIn", null, 0, -1, DState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDState_DOut(), this.getDTransition(), null, "dOut", null, 0, -1, DState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dFinalStateEClass, DFinalState.class, "DFinalState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dInitialStateEClass, DInitialState.class, "DInitialState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dInitialFinalStateEClass, DInitialFinalState.class, "DInitialFinalState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dTransitionEClass, DTransition.class, "DTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDTransition_DTarget(), this.getDState(), null, "dTarget", null, 1, 1, DTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDTransition_DSource(), this.getDState(), null, "dSource", null, 1, 1, DTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDTransition_TransitionName(), ecorePackage.getEString(), "transitionName", null, 0, 1, DTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //DfaPackageImpl
