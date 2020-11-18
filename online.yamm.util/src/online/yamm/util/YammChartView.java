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
package online.yamm.util;

import java.io.File;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.widgets.Display;

import online.yamm.gui.LayerView;
import online.yamm.util.chart.ChartControl;
import online.yamm.util.chart.ChartViewLauncher;
import online.yamm.util.chartModel.chart.ChartFactory;
import online.yamm.util.chartModel.chart.ChartModel;
import online.yamm.util.chartModel.chart.Tab;

public class YammChartView
{
	private String internalViewId;
	private ChartControl control;
	private Tab tab;

	public YammChartView(String viewId)
	{
		String internalViewId = LayerView.yamm.reflectivStateChart.compilation.projectName + File.separator + "output" + File.separator + viewId + ".chart";

		control = ChartControl.getControl(internalViewId);
		if (control == null) // no control, no view, maybe File in output folder
		{
			control = ChartControl.createControl(internalViewId);
			String wsPath = ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString();
			String modelPath = wsPath + File.separator + internalViewId;
			File outputFile = new File(modelPath);
			if (outputFile.exists())
			{
				control.setModel(ChartViewLauncher.loadModel(modelPath));
			}
			else
			{
				control.setModel(ChartFactory.eINSTANCE.createChartModel());
			}
		} 
		control.addTab();
	}

	public void addChart(EObject XAxisContainingOject, String xAxisFeatureName, String xTitle, 
			EObject YAxisContainingOject, String yAxisFeatureName, String yTitle)
	{
		if (XAxisContainingOject != null && YAxisContainingOject != null)
		control.addChart(XAxisContainingOject, xAxisFeatureName, xTitle, YAxisContainingOject,
				yAxisFeatureName, yTitle);		
	}

	public void showCharts()
	{
		Display.getDefault().syncExec(new Runnable() {
			public void run() {
				control.showView();
			}
		});
		
	}

}
