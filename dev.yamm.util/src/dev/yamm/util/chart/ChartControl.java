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
package dev.yamm.util.chart;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

import dev.yamm.gui.LayerView;
import dev.yamm.util.ValueObserver;
import dev.yamm.util.chartModel.chart.ChartFactory;
import dev.yamm.util.chartModel.chart.ChartModel;
import dev.yamm.util.chartModel.chart.Series;
import dev.yamm.util.chartModel.chart.Tab;

public class ChartControl
{
	private ChartView view;
	private Tab simulationTab;
	private String internalViewId;
	private ChartModel chartModel;
	private int chartId;
	private ValueObserver valueObserver;
	private boolean listenerActive;

	private Map<String, List<Series>> xfeatureIdToSeriesToUpdateOnChange;
	private Map<String, List<Series>> yfeatureIdToSeriesToUpdateOnChange;

	private static Map<String, ChartControl> internalViewIdToControl = new HashMap<>();

	public static ChartControl getControl(String internalViewId)
	{
		return internalViewIdToControl.get(internalViewId);
	}

	public static ChartControl createControl(String internalViewId)
	{
		ChartControl newControl = new ChartControl(internalViewId);
		internalViewIdToControl.put(internalViewId, newControl);
		return newControl;
	}

	public static void deleteControl(String internalViewId)
	{
		internalViewIdToControl.remove(internalViewId);
	}

	private ChartControl(String internalViewId)
	{
		xfeatureIdToSeriesToUpdateOnChange = new HashMap<>();
		yfeatureIdToSeriesToUpdateOnChange = new HashMap<>();
		listenerActive = false;
		this.internalViewId = internalViewId;
		chartId = 1;
		valueObserver = new ValueObserver();
		valueObserver.addListener(new ValueObserver.Listener()
		{

			@Override
			public void valueChanged(String featureId, Number newValue)
			{
				if (listenerActive)
				{
					if (xfeatureIdToSeriesToUpdateOnChange.containsKey(featureId))
						for (Series seriesToUpdate : xfeatureIdToSeriesToUpdateOnChange.get(featureId))
						{
//							Double lastXValue = seriesToUpdate.getXValues().get(seriesToUpdate.getYValues().size() - 1);

							seriesToUpdate.getXValues().add(newValue.doubleValue());

							Double lastYValue = seriesToUpdate.getYValues().get(seriesToUpdate.getYValues().size() - 1);
							seriesToUpdate.getYValues().add(lastYValue);
							;

							if (view != null)
							{
								view.setValues(simulationTab.getTabId(),
										((dev.yamm.util.chartModel.chart.Chart) seriesToUpdate.eContainer())
												.getChartId(),
										seriesToUpdate.getSeriesId(), seriesToUpdate.getXValues(),
										seriesToUpdate.getYValues());
							}
						}

					if (yfeatureIdToSeriesToUpdateOnChange.containsKey(featureId))
						for (Series seriesToUpdate : yfeatureIdToSeriesToUpdateOnChange.get(featureId))
						{
							seriesToUpdate.getYValues().add(newValue.doubleValue());
							Double lastValue = seriesToUpdate.getXValues().get(seriesToUpdate.getXValues().size() - 1);
							seriesToUpdate.getXValues().add(lastValue);
							;
							if (view != null)
								view.setValues(simulationTab.getTabId(),
										((dev.yamm.util.chartModel.chart.Chart) seriesToUpdate.eContainer())
												.getChartId(),
										seriesToUpdate.getSeriesId(), seriesToUpdate.getXValues(),
										seriesToUpdate.getYValues());
						}
				}
			}
		});
	}

	public void initViewAll()
	{
		if (view != null && chartModel != null)
		{
			for (Tab tab : chartModel.getTabs())
			{
				String tabId = tab.getTabId();

				view.addTab(tabId, tab.getName() != null ? tab.getName() : tabId);

				for (dev.yamm.util.chartModel.chart.Chart chart : tab.getCharts())
				{
					view.addChart(tabId, chart.getChartId(), chart.getXTitle(), chart.getYTitle());

					for (Series series : chart.getSeries())
					{
						view.addSeries(tabId, chart.getChartId(), series.getSeriesId());
						view.setValues(tabId, chart.getChartId(), series.getSeriesId(), series.getXValues(),
								series.getYValues());
					}
				}
			}
		}
	}

	public void setView(ChartView chartView)
	{
		view = chartView;
	}

	public void save()
	{
		String wsPath = ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString();
		ChartViewLauncher.saveModel(chartModel, wsPath + File.separator + internalViewId);
	}

	public void setModel(ChartModel model)
	{
		chartModel = model;
	}

	public void showView()
	{
		try
		{
			listenerActive = true;
			boolean wasOpen = ChartViewLauncher.viewIsOpen(internalViewId);

			PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView("dev.yamm.util.Chart",
					internalViewId, IWorkbenchPage.VIEW_VISIBLE);
			if (wasOpen)
			{
				if (!view.tabIsActive(simulationTab.getTabId()))
				{
					String tabId = simulationTab.getTabId();
					view.addTab(tabId, simulationTab.getName() != null ? simulationTab.getName() : tabId, 0);

					for (dev.yamm.util.chartModel.chart.Chart chart : simulationTab.getCharts())
					{
						view.addChart(tabId, chart.getChartId(), chart.getXTitle(), chart.getYTitle());

						for (Series series : chart.getSeries())
						{
							view.addSeries(tabId, chart.getChartId(), series.getSeriesId());
							view.setValues(tabId, chart.getChartId(), series.getSeriesId(), series.getXValues(),
									series.getYValues());
						}
					}
				}
			}
			else
				initViewAll();

			view.setSelection(simulationTab.getTabId());
		}
		catch (PartInitException e)
		{
			e.printStackTrace();
		}
	}

	public ChartModel getModel()
	{
		return chartModel;
	}

	public void addChart(EObject xAxisContainingOject, String xAxisFeatureName, String xTitle,
			EObject yAxisContainingOject, String yAxisFeatureName, String yTitle)
	{
		dev.yamm.util.chartModel.chart.Chart chart = ChartFactory.eINSTANCE.createChart();
		simulationTab.getCharts().add(chart);
		chart.setChartId(chartId++ + "");
		chart.setXTitle(xTitle);
		chart.setYTitle(yTitle);

		Series series = ChartFactory.eINSTANCE.createSeries();
		series.setSeriesId(chart.getChartId());
		chart.getSeries().add(series);

		String featureId = Integer.toHexString(xAxisContainingOject.hashCode()) + xAxisFeatureName;
		valueObserver.addFeature(xAxisContainingOject, xAxisFeatureName, featureId);
		series.getXValues().add(valueObserver.getData().get(featureId).doubleValue());
		List<Series> seriesToUpdate;
		if (null == (seriesToUpdate = xfeatureIdToSeriesToUpdateOnChange.get(featureId)))
		{
			xfeatureIdToSeriesToUpdateOnChange.put(featureId, seriesToUpdate = new ArrayList<>());
		}
		seriesToUpdate.add(series);

		featureId = Integer.toHexString(yAxisContainingOject.hashCode()) + yAxisFeatureName;
		valueObserver.addFeature(yAxisContainingOject, yAxisFeatureName, featureId);
		series.getYValues().add(valueObserver.getData().get(featureId).doubleValue());
		if (null == (seriesToUpdate = yfeatureIdToSeriesToUpdateOnChange.get(featureId)))
		{
			yfeatureIdToSeriesToUpdateOnChange.put(featureId, seriesToUpdate = new ArrayList<>());
		}
		seriesToUpdate.add(series);
	}

	public void addTab()
	{
		ChartModel model = getModel();
		simulationTab = ChartFactory.eINSTANCE.createTab();
		String timeStamp = LayerView.yamm.reflectivStateChart.simualtionTimeStamp;
		simulationTab.setTabId(timeStamp);
		simulationTab.setName(timeStamp);
		model.getTabs().add(0, simulationTab);
	}

	public ChartView getView()
	{
		return view;
	}

	public void deleteTab(String tabId)
	{
		for (int i = 0; i < chartModel.getTabs().size(); i++)
		{
			Tab tab = chartModel.getTabs().get(i);
			if (tab.getTabId().equals(tabId))
			{
				chartModel.getTabs().remove(tab);
				break;
			}
		}
		if (tabId.equals(simulationTab))
		{
			listenerActive = false;
		}
	}

}
