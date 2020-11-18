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
package online.yamm.util.chartModel.chart;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chart</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link online.yamm.util.chartModel.chart.Chart#getSeries <em>Series</em>}</li>
 *   <li>{@link online.yamm.util.chartModel.chart.Chart#getYTitle <em>YTitle</em>}</li>
 *   <li>{@link online.yamm.util.chartModel.chart.Chart#getXTitle <em>XTitle</em>}</li>
 *   <li>{@link online.yamm.util.chartModel.chart.Chart#getChartId <em>Chart Id</em>}</li>
 * </ul>
 *
 * @see online.yamm.util.chartModel.chart.ChartPackage#getChart()
 * @model
 * @generated
 */
public interface Chart extends EObject
{
	/**
	 * Returns the value of the '<em><b>Series</b></em>' containment reference list.
	 * The list contents are of type {@link online.yamm.util.chartModel.chart.Series}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Series</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Series</em>' containment reference list.
	 * @see online.yamm.util.chartModel.chart.ChartPackage#getChart_Series()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Series> getSeries();

	/**
	 * Returns the value of the '<em><b>YTitle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YTitle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YTitle</em>' attribute.
	 * @see #setYTitle(String)
	 * @see online.yamm.util.chartModel.chart.ChartPackage#getChart_YTitle()
	 * @model
	 * @generated
	 */
	String getYTitle();

	/**
	 * Sets the value of the '{@link online.yamm.util.chartModel.chart.Chart#getYTitle <em>YTitle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YTitle</em>' attribute.
	 * @see #getYTitle()
	 * @generated
	 */
	void setYTitle(String value);

	/**
	 * Returns the value of the '<em><b>XTitle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XTitle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XTitle</em>' attribute.
	 * @see #setXTitle(String)
	 * @see online.yamm.util.chartModel.chart.ChartPackage#getChart_XTitle()
	 * @model
	 * @generated
	 */
	String getXTitle();

	/**
	 * Sets the value of the '{@link online.yamm.util.chartModel.chart.Chart#getXTitle <em>XTitle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XTitle</em>' attribute.
	 * @see #getXTitle()
	 * @generated
	 */
	void setXTitle(String value);

	/**
	 * Returns the value of the '<em><b>Chart Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chart Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chart Id</em>' attribute.
	 * @see #setChartId(String)
	 * @see online.yamm.util.chartModel.chart.ChartPackage#getChart_ChartId()
	 * @model
	 * @generated
	 */
	String getChartId();

	/**
	 * Sets the value of the '{@link online.yamm.util.chartModel.chart.Chart#getChartId <em>Chart Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chart Id</em>' attribute.
	 * @see #getChartId()
	 * @generated
	 */
	void setChartId(String value);

} // Chart
