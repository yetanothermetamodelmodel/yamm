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
import online.yamm.util.table.TableControl;
import online.yamm.util.table.TableViewLauncher;
import online.yamm.util.tableModel.table.TableFactory;

public class YammTableView
{

	TableControl control;

	public YammTableView(EObject object, String viewId)
	{
		String internalViewId = LayerView.yamm.reflectivStateChart.compilation.projectName + File.separator + "output"
				+ File.separator + viewId + ".table";

		control = TableControl.getControl(internalViewId);
		if (control == null) // no control, no view, maybe File in output folder
		{
			control = TableControl.createControl(internalViewId);
			String wsPath = ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString();
			String modelPath = wsPath + File.separator + internalViewId;
			File outputFile = new File(modelPath);
			if (outputFile.exists())
			{
				control.setModel(TableViewLauncher.loadModel(modelPath));
			}
			else
			{
				control.setModel(TableFactory.eINSTANCE.createTableModel());
			}
		}
		control.addTab();
		control.setDataObject(object);
	}

	public void addFeature(EObject object, String featureName, String labelName)
	{
		control.addFeature(object, featureName, labelName);
	}

	public void showTable()
	{
		Display.getDefault().syncExec(new Runnable()
		{
			public void run()
			{
				control.showView();
			}
		});

	}
}
