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

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabFolder2Adapter;
import org.eclipse.swt.custom.CTabFolderEvent;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swtchart.Chart;
import org.eclipse.swtchart.IAxis;
import org.eclipse.swtchart.IAxisSet;
import org.eclipse.swtchart.ISeries;
import org.eclipse.swtchart.ISeries.SeriesType;
import org.eclipse.swtchart.extensions.charts.InteractiveChart;
import org.eclipse.swtchart.internal.series.LineSeries;
import org.eclipse.ui.part.ViewPart;

import dev.yamm.ChartManagement;
import dev.yamm.gui.LayerView;
import dev.yamm.util.chartModel.chart.ChartModel;

public class ChartView extends ViewPart
{
	private String internalViewId;

	private Composite parent;
	private CTabFolder tabFolder;
	private Map<String, Group> idsToTabGroup;
	private Map<String, CTabItem> idsToTabItem;
	private Map<String, Map<String, Chart>> idsToCharts;
	private Map<String, Map<String, Map<String, ISeries>>> idsToSeries;
	private Map<String, Map<String, IAxisSet>> idsToAxisSet;
	
	private Map<CTabItem, String> tabItemToTabId;
	
	private Color black;

	@Override
	public void createPartControl(Composite parent)
	{
		this.parent = parent;
		black = new Color(Display.getDefault(), 0, 0, 0);
		init();

		internalViewId = getViewSite().getSecondaryId();
		setPartName("Chart " + internalViewId.substring(internalViewId.lastIndexOf("\\") + 1, internalViewId.lastIndexOf(".")));
		dev.yamm.util.chart.ChartControl control = dev.yamm.util.chart.ChartControl.getControl(internalViewId);
		if (control == null) // eclipse startup
		{
			control = dev.yamm.util.chart.ChartControl.createControl(internalViewId);

			String wsPath = ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString();
			ChartModel model = ChartViewLauncher.loadModel(wsPath + File.separator + internalViewId);

			if (model != null)
			{
				control.setView(this);
				control.setModel(model);
				control.initViewAll();
			}
		}
		else // doubleclick, showCharts()
		{
			control.setView(this);
		}
	}

	@Override
	public void dispose()
	{
		ChartControl control = dev.yamm.util.chart.ChartControl.getControl(internalViewId);
		control.save();
		control.setView(null);

		if (LayerView.yamm != null)
		{
			if (!LayerView.yamm.reflectivStateChart.simulationIsRunning)
			{
				ChartControl.deleteControl(internalViewId);
			}
			else
			{
				LayerView.yamm.reflectivStateChart.simulationIsRunningListener
						.add(new ChartManagement.SimulationIsRunningListener()
						{
							@Override
							public void changed(boolean isRunning)
							{
								if (!isRunning)
								{
									if (control.getView() == null)
									{
										ChartControl.deleteControl(internalViewId);
									}
									LayerView.yamm.reflectivStateChart.simulationIsRunningListener.remove(this);
								}
							}
						});
			}
		}
		else
		{
			ChartControl.deleteControl(internalViewId);
		}
	}

	public void init()
	{
		idsToTabGroup = new HashMap<>();
		idsToCharts = new HashMap<>();
		idsToSeries = new HashMap<>();
		idsToAxisSet = new HashMap<>();
		idsToTabItem = new HashMap<>();
		tabItemToTabId = new HashMap<>();

		parent.setLayout(new GridLayout(1, true));

		Composite composite = new Composite(parent, SWT.V_SCROLL);
		composite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		composite.setLayout(new RowLayout());
		createHeader(composite);

		tabFolder = new CTabFolder(parent, SWT.CLOSE);
		tabFolder.setLayoutData(new GridData(GridData.FILL_BOTH));
		tabFolder.addCTabFolder2Listener(new CTabFolder2Adapter()
		{
			@Override
			public void close(CTabFolderEvent event)
			{
				CTabItem tabToDelete = (CTabItem) event.item;
				String tabId = tabItemToTabId.get(tabToDelete);
				
				tabToDelete.dispose();
				idsToAxisSet.remove(tabId);
				idsToCharts.remove(tabId);
				idsToSeries.remove(tabId);
				idsToTabGroup.remove(tabId);
				idsToTabItem.remove(tabId);
				
				dev.yamm.util.chart.ChartControl.getControl(internalViewId).deleteTab(tabId);
			}
		});
		

	}

	private void createHeader(Composite composite)
	{
		Button button = new Button(composite, SWT.PUSH);
		button.setText("Export CSV");
		button.addSelectionListener(new SelectionAdapter()
		{
			public void widgetSelected(SelectionEvent event)
			{
				CTabItem selected = tabFolder.getSelection();
				if (selected != null)
				{
					String tabID = tabItemToTabId.get(selected);
					Map<String, Chart> charts = idsToCharts.get(tabID);
					Map<Integer, List<ValuePair>> data = new HashMap<>();
					Map<Integer, Pair<String>> chartIdToTitle = new HashMap<>();
					int id = 0;
					for (Entry<String, Chart> entry : charts.entrySet())
					{
						
						Chart chart = entry.getValue();
						String xTitle = chart.getAxisSet().getXAxes()[0].getTitle().getText();
						String yTitle = chart.getAxisSet().getYAxes()[0].getTitle().getText();
						ISeries series = chart.getSeriesSet().getSeries()[0];
						double[] xValues = series.getXSeries();
						double[] yValues = series.getYSeries();
						
						List<ValuePair> values = new ArrayList<>(xValues.length);
						data.put(id, values);
						chartIdToTitle.put(id, new Pair<String>(xTitle, yTitle));
						for (int index = 0; index < xValues.length; index++)
						{
							values.add(new ValuePair(xValues[index], yValues[index]));
						}
						id++;
					}
					
					List<List<String>> output = new ArrayList<>();
					output.add(filledList(data.size() * 2));
					
					for(Entry<Integer, List<ValuePair>> entrySet : data.entrySet())
					{
						int chartId = entrySet.getKey();
						Pair<String> title = chartIdToTitle.get(chartId);
						output.get(0).set(chartId * 2, chartId + "_" + title.x);
						output.get(0).set(chartId * 2 + 1, chartId + "_" + title.y);
						int i = 1;
						for (ValuePair entry : entrySet.getValue())
						{
							if (output.size() <= i)
								output.add(filledList(data.size() * 2));
							output.get(i).set(chartId * 2, (entry.x + "").replace(".", ","));
							output.get(i).set(chartId * 2 + 1, (entry.y + "").replace(".", ","));
							i++;
						}
					}
					
					String outputStr = "";
					for (List<String> line : output)
					{
						for (Iterator<String> iter = line.iterator(); iter.hasNext();)
						{
							outputStr += iter.next() + (iter.hasNext() ? ";" : "");	
						}
						outputStr += "\n";
					}
					
					String wsPath = ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString();   
					String name = internalViewId.substring(internalViewId.lastIndexOf(File.separator) + 1, internalViewId.lastIndexOf("."));
					String path = wsPath + File.separator
						+ internalViewId.substring(0, internalViewId.indexOf(File.separator)) + File.separator + "output";
					
					String outputDirectoryPath = path;
					path += File.separator + File.separator + tabID + "_chart_" + name + ".csv";	
					
					File outputDir = new File(outputDirectoryPath);
					if (!outputDir.exists())
						outputDir.mkdir();
					
					try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
						    writer.write(outputStr);   
					} catch (Exception e) {
						e.printStackTrace();
					}					
					
				}
			}
		});
	}
	private List<String> filledList(int size)
	{
		List<String> list = new ArrayList<String>(size);
		for (int i = 0; i < size; i++)
		{
			list.add("");
		}
		return list;
	}
	private static class Pair<T> 
	{
		public T x;
		public T y;
		public Pair(T x, T y) 
		{
			this.x = x;
			this.y = y;
		}
	}
	private static class ValuePair 
	{
		public double x;
		public double y;
		
		public ValuePair(double x, double y) 
		{
			this.x = x;
			this.y = y;
		}
	}

	public void addTab(String simualtionTimestamp)
	{
		addTab(simualtionTimestamp, simualtionTimestamp);
	}

	public void addTab(String tabId, String name)
	{
		addTab(tabId, name, -1);
	}

	public void addTab(String tabId, String name, int insertPos)
	{
		CTabItem tab;
		if (insertPos >= 0)
			tab = new CTabItem(tabFolder, SWT.NONE, insertPos);
		else
			tab = new CTabItem(tabFolder, SWT.NONE);
		tab.setText(tabId);

		Group group = new Group(tabFolder, SWT.NONE);
		FillLayout fillLayout = new FillLayout();
		fillLayout.type = SWT.VERTICAL;
		group.setLayout(fillLayout);
		tab.setControl(group);
		
		idsToTabGroup.put(tabId, group);
		idsToTabItem.put(tabId, tab);
		idsToCharts.put(tabId, new HashMap<>());
		idsToSeries.put(tabId, new HashMap<>());
		idsToAxisSet.put(tabId, new HashMap<>());
		tabItemToTabId.put(tab, tabId);
	}

	public void addChart(String tabId, String chartId, String xTitle, String yTitle)
	{
		Composite tab = idsToTabGroup.get(tabId);
		InteractiveChart chart = new InteractiveChart(tab, SWT.NONE);

		IAxisSet axisSet = chart.getAxisSet();
		IAxis xAxis = axisSet.getXAxis(0);
		IAxis yAxis = axisSet.getYAxis(0);

		Font font = new Font(Display.getDefault(), "Tahoma", 10, SWT.NONE);

		xAxis.getTitle().setText(xTitle);
		xAxis.getTitle().setForeground(black);
		xAxis.getTitle().setFont(font);

		yAxis.getTitle().setText(yTitle);
		yAxis.getTitle().setForeground(black);
		yAxis.getTitle().setFont(font);

		chart.getTitle().setVisible(false);

		xAxis.getTick().setForeground(black);
		yAxis.getTick().setForeground(black);

		chart.getLegend().setVisible(false);

		idsToCharts.get(tabId).put(chartId, chart);
		idsToSeries.get(tabId).put(chartId, new HashMap<>());
		idsToAxisSet.get(tabId).put(chartId, axisSet);
	}

	public void addSeries(String tabId, String chartId, String seriesId)
	{
		Chart chart = idsToCharts.get(tabId).get(chartId);
		LineSeries series = (LineSeries) chart.getSeriesSet().createSeries(SeriesType.LINE, seriesId);
		series.setSymbolSize(2);
		series.setLineColor(black);

		idsToSeries.get(tabId).get(chartId).put(seriesId, series);
	}

	public void setValues(String tabId, String chartId, String seriesId, List<? extends Number> xValues,
			List<? extends Number> yValues)
	{
		double[] xValuesArray = xValues.stream().mapToDouble(x -> ((Number) x).doubleValue()).toArray();
		double[] yValuesArray = yValues.stream().mapToDouble(y -> ((Number) y).doubleValue()).toArray();
		setValues(tabId, chartId, seriesId, xValuesArray, yValuesArray);
	}

	public void setValues(String tabId, String chartId, String seriesId, double[] xValues, double[] yValues)
	{
		ISeries series = idsToSeries.get(tabId).get(chartId).get(seriesId);
		series.setXSeries(xValues);
		series.setYSeries(yValues);

		idsToAxisSet.get(tabId).get(chartId).adjustRange();
		idsToCharts.get(tabId).get(chartId).redraw();
	}

	public double[] getXValues(String tabId, String chartId, String seriesId)
	{
		return idsToSeries.get(tabId).get(chartId).get(seriesId).getXSeries();
	}

	public double[] getYValues(String tabId, String chartId, String seriesId)
	{
		return idsToSeries.get(tabId).get(chartId).get(seriesId).getYSeries();
	}

	@Override
	public void setFocus()
	{

	}

	public boolean tabIsActive(String tabId)
	{
		return idsToTabGroup.get(tabId) == null ? false : true;
	}

	public void setSelection(String tabId)
	{
		tabFolder.setSelection(idsToTabItem.get(tabId));
	}

}
