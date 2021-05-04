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
package dev.yamm.util.chartModel.chart;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Series</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dev.yamm.util.chartModel.chart.Series#getXValues <em>XValues</em>}</li>
 *   <li>{@link dev.yamm.util.chartModel.chart.Series#getYValues <em>YValues</em>}</li>
 *   <li>{@link dev.yamm.util.chartModel.chart.Series#getSeriesId <em>Series Id</em>}</li>
 * </ul>
 *
 * @see dev.yamm.util.chartModel.chart.ChartPackage#getSeries()
 * @model
 * @generated
 */
public interface Series extends EObject
{
	/**
	 * Returns the value of the '<em><b>XValues</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XValues</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XValues</em>' attribute list.
	 * @see dev.yamm.util.chartModel.chart.ChartPackage#getSeries_XValues()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	EList<Double> getXValues();

	/**
	 * Returns the value of the '<em><b>YValues</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YValues</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YValues</em>' attribute list.
	 * @see dev.yamm.util.chartModel.chart.ChartPackage#getSeries_YValues()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	EList<Double> getYValues();

	/**
	 * Returns the value of the '<em><b>Series Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Series Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Series Id</em>' attribute.
	 * @see #setSeriesId(String)
	 * @see dev.yamm.util.chartModel.chart.ChartPackage#getSeries_SeriesId()
	 * @model
	 * @generated
	 */
	String getSeriesId();

	/**
	 * Sets the value of the '{@link dev.yamm.util.chartModel.chart.Series#getSeriesId <em>Series Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Series Id</em>' attribute.
	 * @see #getSeriesId()
	 * @generated
	 */
	void setSeriesId(String value);

} // Series
