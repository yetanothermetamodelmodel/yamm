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
package online.yamm.coreModelXmi.yamm.tests;

import java.util.Map;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import online.yamm.coreModelXmi.yamm.FeatureInfo;
import online.yamm.coreModelXmi.yamm.YammFactory;
import online.yamm.coreModelXmi.yamm.YammPackage;

import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>EStructural Feature To Feature Info Map</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EStructuralFeatureToFeatureInfoMapTest extends TestCase
{

	/**
	 * The fixture for this EStructural Feature To Feature Info Map test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map.Entry<EStructuralFeature, FeatureInfo> fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args)
	{
		TestRunner.run(EStructuralFeatureToFeatureInfoMapTest.class);
	}

	/**
	 * Constructs a new EStructural Feature To Feature Info Map test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeatureToFeatureInfoMapTest(String name)
	{
		super(name);
	}

	/**
	 * Sets the fixture for this EStructural Feature To Feature Info Map test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Map.Entry<EStructuralFeature, FeatureInfo> fixture)
	{
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this EStructural Feature To Feature Info Map test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map.Entry<EStructuralFeature, FeatureInfo> getFixture()
	{
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	protected void setUp() throws Exception
	{
		setFixture((Map.Entry<EStructuralFeature, FeatureInfo>)YammFactory.eINSTANCE.create(YammPackage.Literals.ESTRUCTURAL_FEATURE_TO_FEATURE_INFO_MAP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception
	{
		setFixture(null);
	}

} //EStructuralFeatureToFeatureInfoMapTest
