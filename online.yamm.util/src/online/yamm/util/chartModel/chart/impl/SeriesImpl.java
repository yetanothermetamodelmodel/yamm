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
package online.yamm.util.chartModel.chart.impl;

import java.util.Collection;

import online.yamm.util.chartModel.chart.ChartPackage;
import online.yamm.util.chartModel.chart.Series;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Series</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link online.yamm.util.chartModel.chart.impl.SeriesImpl#getXValues <em>XValues</em>}</li>
 *   <li>{@link online.yamm.util.chartModel.chart.impl.SeriesImpl#getYValues <em>YValues</em>}</li>
 *   <li>{@link online.yamm.util.chartModel.chart.impl.SeriesImpl#getSeriesId <em>Series Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SeriesImpl extends MinimalEObjectImpl.Container implements Series
{
	/**
	 * The cached value of the '{@link #getXValues() <em>XValues</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXValues()
	 * @generated
	 * @ordered
	 */
	protected EList<Double> xValues;

	/**
	 * The cached value of the '{@link #getYValues() <em>YValues</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYValues()
	 * @generated
	 * @ordered
	 */
	protected EList<Double> yValues;

	/**
	 * The default value of the '{@link #getSeriesId() <em>Series Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeriesId()
	 * @generated
	 * @ordered
	 */
	protected static final String SERIES_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSeriesId() <em>Series Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeriesId()
	 * @generated
	 * @ordered
	 */
	protected String seriesId = SERIES_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SeriesImpl()
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
		return ChartPackage.Literals.SERIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Double> getXValues()
	{
		if (xValues == null)
		{
			xValues = new EDataTypeEList<Double>(Double.class, this, ChartPackage.SERIES__XVALUES);
		}
		return xValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Double> getYValues()
	{
		if (yValues == null)
		{
			yValues = new EDataTypeEList<Double>(Double.class, this, ChartPackage.SERIES__YVALUES);
		}
		return yValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSeriesId()
	{
		return seriesId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeriesId(String newSeriesId)
	{
		String oldSeriesId = seriesId;
		seriesId = newSeriesId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.SERIES__SERIES_ID, oldSeriesId, seriesId));
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
			case ChartPackage.SERIES__XVALUES:
				return getXValues();
			case ChartPackage.SERIES__YVALUES:
				return getYValues();
			case ChartPackage.SERIES__SERIES_ID:
				return getSeriesId();
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
			case ChartPackage.SERIES__XVALUES:
				getXValues().clear();
				getXValues().addAll((Collection<? extends Double>)newValue);
				return;
			case ChartPackage.SERIES__YVALUES:
				getYValues().clear();
				getYValues().addAll((Collection<? extends Double>)newValue);
				return;
			case ChartPackage.SERIES__SERIES_ID:
				setSeriesId((String)newValue);
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
			case ChartPackage.SERIES__XVALUES:
				getXValues().clear();
				return;
			case ChartPackage.SERIES__YVALUES:
				getYValues().clear();
				return;
			case ChartPackage.SERIES__SERIES_ID:
				setSeriesId(SERIES_ID_EDEFAULT);
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
			case ChartPackage.SERIES__XVALUES:
				return xValues != null && !xValues.isEmpty();
			case ChartPackage.SERIES__YVALUES:
				return yValues != null && !yValues.isEmpty();
			case ChartPackage.SERIES__SERIES_ID:
				return SERIES_ID_EDEFAULT == null ? seriesId != null : !SERIES_ID_EDEFAULT.equals(seriesId);
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
		result.append(" (xValues: ");
		result.append(xValues);
		result.append(", yValues: ");
		result.append(yValues);
		result.append(", seriesId: ");
		result.append(seriesId);
		result.append(')');
		return result.toString();
	}

} //SeriesImpl
