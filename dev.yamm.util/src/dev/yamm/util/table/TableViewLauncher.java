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
package dev.yamm.util.table;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.ui.IEditorLauncher;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;

import dev.yamm.util.chartModel.chart.ChartModel;
import dev.yamm.util.tableModel.table.TableModel;
import dev.yamm.util.tableModel.table.TablePackage;

public class TableViewLauncher implements IEditorLauncher
{

	@Override
	public void open(IPath file)
	{
		try
		{
			String modelPath = file.toFile().getAbsolutePath();	
			String wsPath = ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString();				
			String internalViewId = modelPath.substring(wsPath.length() + 1, modelPath.length());

			if (viewIsOpen(internalViewId)) // bring to Front
			{
				PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView("dev.yamm.util.Table",
						internalViewId, IWorkbenchPage.VIEW_VISIBLE);
			}
			else
			{
				TableControl control = TableControl.getControl(internalViewId);	
				if (control == null)
				{
					TableModel model = loadModel(modelPath);
					control = TableControl.createControl(internalViewId);
					control.setModel(model);	
				}

				PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView("dev.yamm.util.Table",
						internalViewId, IWorkbenchPage.VIEW_VISIBLE);
				
				control.initViewAll();
			}

		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public static boolean viewIsOpen(String viewInternalId)
	{
		return PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
				.findViewReference("dev.yamm.util.Table", viewInternalId) == null ? false : true;
	}

	public static TableModel loadModel(String path)
	{
		// Initialize the model
		TablePackage.eINSTANCE.eClass();

		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("table", new XMIResourceFactoryImpl());
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(URI.createFileURI(path), true);

		return (TableModel) resource.getContents().get(0);
	}

	public static void saveModel(TableModel model, String path)
	{
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("table", new XMIResourceFactoryImpl());
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.createResource(URI.createFileURI(path));
		resource.getContents().add(model);
		try
		{
			resource.save(Collections.EMPTY_MAP);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
