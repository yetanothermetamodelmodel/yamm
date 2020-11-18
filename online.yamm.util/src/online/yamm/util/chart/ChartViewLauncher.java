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
package online.yamm.util.chart;

import java.io.File;
import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.ui.IEditorLauncher;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;

import online.yamm.util.chartModel.chart.ChartModel;
import online.yamm.util.chartModel.chart.ChartPackage;

public class ChartViewLauncher implements IEditorLauncher
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
				PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView("online.yamm.util.Chart",
						internalViewId, IWorkbenchPage.VIEW_VISIBLE);
			}
			else
			{
				ChartControl control = ChartControl.getControl(internalViewId);	
				if (control == null)
				{
					ChartModel model = loadModel(modelPath);
					control = ChartControl.createControl(internalViewId);
					control.setModel(model);	
				}

				PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView("online.yamm.util.Chart",
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
				.findViewReference("online.yamm.util.Chart", viewInternalId) == null ? false : true;
	}

	public static ChartModel loadModel(String path)
	{
		// Initialize the model
		ChartPackage.eINSTANCE.eClass();

		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("chart", new XMIResourceFactoryImpl());
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(URI.createFileURI(path), true);

		return (ChartModel) resource.getContents().get(0);
	}

	public static void saveModel(ChartModel model, String path)
	{
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("chart", new XMIResourceFactoryImpl());
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
