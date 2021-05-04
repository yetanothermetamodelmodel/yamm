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
package dev.yamm.util.chartModel.chart.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import dev.yamm.util.chartModel.chart.Chart;
import dev.yamm.util.chartModel.chart.ChartPackage;
import dev.yamm.util.chartModel.chart.Series;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chart</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dev.yamm.util.chartModel.chart.impl.ChartImpl#getSeries <em>Series</em>}</li>
 *   <li>{@link dev.yamm.util.chartModel.chart.impl.ChartImpl#getYTitle <em>YTitle</em>}</li>
 *   <li>{@link dev.yamm.util.chartModel.chart.impl.ChartImpl#getXTitle <em>XTitle</em>}</li>
 *   <li>{@link dev.yamm.util.chartModel.chart.impl.ChartImpl#getChartId <em>Chart Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChartImpl extends MinimalEObjectImpl.Container implements Chart
{
	/**
	 * The cached value of the '{@link #getSeries() <em>Series</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeries()
	 * @generated
	 * @ordered
	 */
	protected EList<Series> series;

	/**
	 * The default value of the '{@link #getYTitle() <em>YTitle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String YTITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYTitle() <em>YTitle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYTitle()
	 * @generated
	 * @ordered
	 */
	protected String yTitle = YTITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getXTitle() <em>XTitle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String XTITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXTitle() <em>XTitle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXTitle()
	 * @generated
	 * @ordered
	 */
	protected String xTitle = XTITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getChartId() <em>Chart Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChartId()
	 * @generated
	 * @ordered
	 */
	protected static final String CHART_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChartId() <em>Chart Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChartId()
	 * @generated
	 * @ordered
	 */
	protected String chartId = CHART_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChartImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return ChartPackage.Literals.CHART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Series> getSeries()
	{
		if (series == null)
		{
			series = new EObjectContainmentEList<Series>(Series.class, this, ChartPackage.CHART__SERIES);
		}
		return series;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getYTitle()
	{
		return yTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYTitle(String newYTitle)
	{
		String oldYTitle = yTitle;
		yTitle = newYTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.CHART__YTITLE, oldYTitle, yTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXTitle()
	{
		return xTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXTitle(String newXTitle)
	{
		String oldXTitle = xTitle;
		xTitle = newXTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.CHART__XTITLE, oldXTitle, xTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getChartId()
	{
		return chartId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChartId(String newChartId)
	{
		String oldChartId = chartId;
		chartId = newChartId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.CHART__CHART_ID, oldChartId, chartId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case ChartPackage.CHART__SERIES:
				return ((InternalEList<?>)getSeries()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case ChartPackage.CHART__SERIES:
				return getSeries();
			case ChartPackage.CHART__YTITLE:
				return getYTitle();
			case ChartPackage.CHART__XTITLE:
				return getXTitle();
			case ChartPackage.CHART__CHART_ID:
				return getChartId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case ChartPackage.CHART__SERIES:
				getSeries().clear();
				getSeries().addAll((Collection<? extends Series>)newValue);
				return;
			case ChartPackage.CHART__YTITLE:
				setYTitle((String)newValue);
				return;
			case ChartPackage.CHART__XTITLE:
				setXTitle((String)newValue);
				return;
			case ChartPackage.CHART__CHART_ID:
				setChartId((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case ChartPackage.CHART__SERIES:
				getSeries().clear();
				return;
			case ChartPackage.CHART__YTITLE:
				setYTitle(YTITLE_EDEFAULT);
				return;
			case ChartPackage.CHART__XTITLE:
				setXTitle(XTITLE_EDEFAULT);
				return;
			case ChartPackage.CHART__CHART_ID:
				setChartId(CHART_ID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case ChartPackage.CHART__SERIES:
				return series != null && !series.isEmpty();
			case ChartPackage.CHART__YTITLE:
				return YTITLE_EDEFAULT == null ? yTitle != null : !YTITLE_EDEFAULT.equals(yTitle);
			case ChartPackage.CHART__XTITLE:
				return XTITLE_EDEFAULT == null ? xTitle != null : !XTITLE_EDEFAULT.equals(xTitle);
			case ChartPackage.CHART__CHART_ID:
				return CHART_ID_EDEFAULT == null ? chartId != null : !CHART_ID_EDEFAULT.equals(chartId);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (yTitle: ");
		result.append(yTitle);
		result.append(", xTitle: ");
		result.append(xTitle);
		result.append(", chartId: ");
		result.append(chartId);
		result.append(')');
		return result.toString();
	}

} //ChartImpl
