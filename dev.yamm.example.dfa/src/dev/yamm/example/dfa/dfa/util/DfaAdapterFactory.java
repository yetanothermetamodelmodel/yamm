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
package dev.yamm.example.dfa.dfa.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import dev.yamm.example.dfa.dfa.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see dev.yamm.example.dfa.dfa.DfaPackage
 * @generated
 */
public class DfaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DfaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DfaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DfaPackage.eINSTANCE;
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
	public boolean isFactoryForType(Object object) {
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
	protected DfaSwitch<Adapter> modelSwitch =
		new DfaSwitch<Adapter>() {
			@Override
			public Adapter caseDFA(DFA object) {
				return createDFAAdapter();
			}
			@Override
			public Adapter caseRObject(RObject object) {
				return createRObjectAdapter();
			}
			@Override
			public Adapter caseDState(DState object) {
				return createDStateAdapter();
			}
			@Override
			public Adapter caseDFinalState(DFinalState object) {
				return createDFinalStateAdapter();
			}
			@Override
			public Adapter caseDInitialState(DInitialState object) {
				return createDInitialStateAdapter();
			}
			@Override
			public Adapter caseDInitialFinalState(DInitialFinalState object) {
				return createDInitialFinalStateAdapter();
			}
			@Override
			public Adapter caseDTransition(DTransition object) {
				return createDTransitionAdapter();
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
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link dev.yamm.example.dfa.dfa.DFA <em>DFA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dev.yamm.example.dfa.dfa.DFA
	 * @generated
	 */
	public Adapter createDFAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dev.yamm.example.dfa.dfa.RObject <em>RObject</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dev.yamm.example.dfa.dfa.RObject
	 * @generated
	 */
	public Adapter createRObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dev.yamm.example.dfa.dfa.DState <em>DState</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dev.yamm.example.dfa.dfa.DState
	 * @generated
	 */
	public Adapter createDStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dev.yamm.example.dfa.dfa.DFinalState <em>DFinal State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dev.yamm.example.dfa.dfa.DFinalState
	 * @generated
	 */
	public Adapter createDFinalStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dev.yamm.example.dfa.dfa.DInitialState <em>DInitial State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dev.yamm.example.dfa.dfa.DInitialState
	 * @generated
	 */
	public Adapter createDInitialStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dev.yamm.example.dfa.dfa.DInitialFinalState <em>DInitial Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dev.yamm.example.dfa.dfa.DInitialFinalState
	 * @generated
	 */
	public Adapter createDInitialFinalStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dev.yamm.example.dfa.dfa.DTransition <em>DTransition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dev.yamm.example.dfa.dfa.DTransition
	 * @generated
	 */
	public Adapter createDTransitionAdapter() {
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
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DfaAdapterFactory
