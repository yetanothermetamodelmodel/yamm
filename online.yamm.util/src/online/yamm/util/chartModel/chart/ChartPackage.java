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
 * @see online.yamm.util.chartModel.chart.ChartFactory
 * @model kind="package"
 * @generated
 */
public interface ChartPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "chart";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.yamm.online/util/Chart";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "chart";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ChartPackage eINSTANCE = online.yamm.util.chartModel.chart.impl.ChartPackageImpl.init();

	/**
	 * The meta object id for the '{@link online.yamm.util.chartModel.chart.impl.ChartModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.util.chartModel.chart.impl.ChartModelImpl
	 * @see online.yamm.util.chartModel.chart.impl.ChartPackageImpl#getChartModel()
	 * @generated
	 */
	int CHART_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Tabs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_MODEL__TABS = 0;

	/**
	 * The feature id for the '<em><b>View Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_MODEL__VIEW_ID = 1;

	/**
	 * The feature id for the '<em><b>View Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_MODEL__VIEW_INTERNAL_ID = 2;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link online.yamm.util.chartModel.chart.impl.TabImpl <em>Tab</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.util.chartModel.chart.impl.TabImpl
	 * @see online.yamm.util.chartModel.chart.impl.ChartPackageImpl#getTab()
	 * @generated
	 */
	int TAB = 1;

	/**
	 * The feature id for the '<em><b>Charts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB__CHARTS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB__NAME = 1;

	/**
	 * The feature id for the '<em><b>Tab Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB__TAB_ID = 2;

	/**
	 * The number of structural features of the '<em>Tab</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Tab</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link online.yamm.util.chartModel.chart.impl.ChartImpl <em>Chart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.util.chartModel.chart.impl.ChartImpl
	 * @see online.yamm.util.chartModel.chart.impl.ChartPackageImpl#getChart()
	 * @generated
	 */
	int CHART = 2;

	/**
	 * The feature id for the '<em><b>Series</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__SERIES = 0;

	/**
	 * The feature id for the '<em><b>YTitle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__YTITLE = 1;

	/**
	 * The feature id for the '<em><b>XTitle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__XTITLE = 2;

	/**
	 * The feature id for the '<em><b>Chart Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__CHART_ID = 3;

	/**
	 * The number of structural features of the '<em>Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link online.yamm.util.chartModel.chart.impl.SeriesImpl <em>Series</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.util.chartModel.chart.impl.SeriesImpl
	 * @see online.yamm.util.chartModel.chart.impl.ChartPackageImpl#getSeries()
	 * @generated
	 */
	int SERIES = 3;

	/**
	 * The feature id for the '<em><b>XValues</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES__XVALUES = 0;

	/**
	 * The feature id for the '<em><b>YValues</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES__YVALUES = 1;

	/**
	 * The feature id for the '<em><b>Series Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES__SERIES_ID = 2;

	/**
	 * The number of structural features of the '<em>Series</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Series</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link online.yamm.util.chartModel.chart.ChartModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see online.yamm.util.chartModel.chart.ChartModel
	 * @generated
	 */
	EClass getChartModel();

	/**
	 * Returns the meta object for the containment reference list '{@link online.yamm.util.chartModel.chart.ChartModel#getTabs <em>Tabs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tabs</em>'.
	 * @see online.yamm.util.chartModel.chart.ChartModel#getTabs()
	 * @see #getChartModel()
	 * @generated
	 */
	EReference getChartModel_Tabs();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.util.chartModel.chart.ChartModel#getViewId <em>View Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Id</em>'.
	 * @see online.yamm.util.chartModel.chart.ChartModel#getViewId()
	 * @see #getChartModel()
	 * @generated
	 */
	EAttribute getChartModel_ViewId();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.util.chartModel.chart.ChartModel#getViewInternalId <em>View Internal Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Internal Id</em>'.
	 * @see online.yamm.util.chartModel.chart.ChartModel#getViewInternalId()
	 * @see #getChartModel()
	 * @generated
	 */
	EAttribute getChartModel_ViewInternalId();

	/**
	 * Returns the meta object for class '{@link online.yamm.util.chartModel.chart.Tab <em>Tab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tab</em>'.
	 * @see online.yamm.util.chartModel.chart.Tab
	 * @generated
	 */
	EClass getTab();

	/**
	 * Returns the meta object for the containment reference list '{@link online.yamm.util.chartModel.chart.Tab#getCharts <em>Charts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Charts</em>'.
	 * @see online.yamm.util.chartModel.chart.Tab#getCharts()
	 * @see #getTab()
	 * @generated
	 */
	EReference getTab_Charts();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.util.chartModel.chart.Tab#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see online.yamm.util.chartModel.chart.Tab#getName()
	 * @see #getTab()
	 * @generated
	 */
	EAttribute getTab_Name();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.util.chartModel.chart.Tab#getTabId <em>Tab Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tab Id</em>'.
	 * @see online.yamm.util.chartModel.chart.Tab#getTabId()
	 * @see #getTab()
	 * @generated
	 */
	EAttribute getTab_TabId();

	/**
	 * Returns the meta object for class '{@link online.yamm.util.chartModel.chart.Chart <em>Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chart</em>'.
	 * @see online.yamm.util.chartModel.chart.Chart
	 * @generated
	 */
	EClass getChart();

	/**
	 * Returns the meta object for the containment reference list '{@link online.yamm.util.chartModel.chart.Chart#getSeries <em>Series</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Series</em>'.
	 * @see online.yamm.util.chartModel.chart.Chart#getSeries()
	 * @see #getChart()
	 * @generated
	 */
	EReference getChart_Series();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.util.chartModel.chart.Chart#getYTitle <em>YTitle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YTitle</em>'.
	 * @see online.yamm.util.chartModel.chart.Chart#getYTitle()
	 * @see #getChart()
	 * @generated
	 */
	EAttribute getChart_YTitle();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.util.chartModel.chart.Chart#getXTitle <em>XTitle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XTitle</em>'.
	 * @see online.yamm.util.chartModel.chart.Chart#getXTitle()
	 * @see #getChart()
	 * @generated
	 */
	EAttribute getChart_XTitle();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.util.chartModel.chart.Chart#getChartId <em>Chart Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Chart Id</em>'.
	 * @see online.yamm.util.chartModel.chart.Chart#getChartId()
	 * @see #getChart()
	 * @generated
	 */
	EAttribute getChart_ChartId();

	/**
	 * Returns the meta object for class '{@link online.yamm.util.chartModel.chart.Series <em>Series</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Series</em>'.
	 * @see online.yamm.util.chartModel.chart.Series
	 * @generated
	 */
	EClass getSeries();

	/**
	 * Returns the meta object for the attribute list '{@link online.yamm.util.chartModel.chart.Series#getXValues <em>XValues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>XValues</em>'.
	 * @see online.yamm.util.chartModel.chart.Series#getXValues()
	 * @see #getSeries()
	 * @generated
	 */
	EAttribute getSeries_XValues();

	/**
	 * Returns the meta object for the attribute list '{@link online.yamm.util.chartModel.chart.Series#getYValues <em>YValues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>YValues</em>'.
	 * @see online.yamm.util.chartModel.chart.Series#getYValues()
	 * @see #getSeries()
	 * @generated
	 */
	EAttribute getSeries_YValues();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.util.chartModel.chart.Series#getSeriesId <em>Series Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Series Id</em>'.
	 * @see online.yamm.util.chartModel.chart.Series#getSeriesId()
	 * @see #getSeries()
	 * @generated
	 */
	EAttribute getSeries_SeriesId();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ChartFactory getChartFactory();

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
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link online.yamm.util.chartModel.chart.impl.ChartModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.util.chartModel.chart.impl.ChartModelImpl
		 * @see online.yamm.util.chartModel.chart.impl.ChartPackageImpl#getChartModel()
		 * @generated
		 */
		EClass CHART_MODEL = eINSTANCE.getChartModel();

		/**
		 * The meta object literal for the '<em><b>Tabs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHART_MODEL__TABS = eINSTANCE.getChartModel_Tabs();

		/**
		 * The meta object literal for the '<em><b>View Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHART_MODEL__VIEW_ID = eINSTANCE.getChartModel_ViewId();

		/**
		 * The meta object literal for the '<em><b>View Internal Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHART_MODEL__VIEW_INTERNAL_ID = eINSTANCE.getChartModel_ViewInternalId();

		/**
		 * The meta object literal for the '{@link online.yamm.util.chartModel.chart.impl.TabImpl <em>Tab</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.util.chartModel.chart.impl.TabImpl
		 * @see online.yamm.util.chartModel.chart.impl.ChartPackageImpl#getTab()
		 * @generated
		 */
		EClass TAB = eINSTANCE.getTab();

		/**
		 * The meta object literal for the '<em><b>Charts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAB__CHARTS = eINSTANCE.getTab_Charts();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAB__NAME = eINSTANCE.getTab_Name();

		/**
		 * The meta object literal for the '<em><b>Tab Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAB__TAB_ID = eINSTANCE.getTab_TabId();

		/**
		 * The meta object literal for the '{@link online.yamm.util.chartModel.chart.impl.ChartImpl <em>Chart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.util.chartModel.chart.impl.ChartImpl
		 * @see online.yamm.util.chartModel.chart.impl.ChartPackageImpl#getChart()
		 * @generated
		 */
		EClass CHART = eINSTANCE.getChart();

		/**
		 * The meta object literal for the '<em><b>Series</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHART__SERIES = eINSTANCE.getChart_Series();

		/**
		 * The meta object literal for the '<em><b>YTitle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHART__YTITLE = eINSTANCE.getChart_YTitle();

		/**
		 * The meta object literal for the '<em><b>XTitle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHART__XTITLE = eINSTANCE.getChart_XTitle();

		/**
		 * The meta object literal for the '<em><b>Chart Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHART__CHART_ID = eINSTANCE.getChart_ChartId();

		/**
		 * The meta object literal for the '{@link online.yamm.util.chartModel.chart.impl.SeriesImpl <em>Series</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.util.chartModel.chart.impl.SeriesImpl
		 * @see online.yamm.util.chartModel.chart.impl.ChartPackageImpl#getSeries()
		 * @generated
		 */
		EClass SERIES = eINSTANCE.getSeries();

		/**
		 * The meta object literal for the '<em><b>XValues</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERIES__XVALUES = eINSTANCE.getSeries_XValues();

		/**
		 * The meta object literal for the '<em><b>YValues</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERIES__YVALUES = eINSTANCE.getSeries_YValues();

		/**
		 * The meta object literal for the '<em><b>Series Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERIES__SERIES_ID = eINSTANCE.getSeries_SeriesId();

	}

} //ChartPackage
