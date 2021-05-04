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
package dev.yamm.init;

import java.util.ArrayList;
import java.util.HashMap;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

import dev.yamm.ConfigurationManagement;
import dev.yamm.debug.model.YAMMDebugTarget;
import dev.yamm.debug.model.YAMMThread;
import dev.yamm.gui.LayerView;
import dev.yamm.gui.SimulationState;
import dev.yamm.logger.YAMMLogger;

/**
 * Performs the launching of the YAMM Layer Configuration
 * when a Simulation has been started by the launch configuration 
 * type "YAMM Layer Configuration" and not by loading a Layer File
 * in the Layer View.
 * Launching is possible in Mode "Run" (corresponds to "Resume") or "Debug".
 */
public class LaunchDelegate implements ILaunchConfigurationDelegate {
	
	/**Prints simulation - related information in the console.*/
	private static YAMMLogger logger = YAMMLogger.getYAMMLogger("YAMM Log");


	/** The first part of the path to the *.lay file. */
	private static String pathToLayerFile;
	
	/** The second part of the path to the *.lay file. */
	private static String layerfile;
	
	private static boolean autoupload;
	
	/** Is true if running in debug mode - means that the {@link dev.yamm.Zerochart}
	 * as the interpreter has to keep the Debug Model up to date. */
	public static boolean debugMode;
	
	/** Contains the current active ILaunch object.*/
	ArrayList<ILaunch> launches = new ArrayList();
	
	/** The ID of Layer View as an extension of org.eclipse.ui.views. */
	private final String LAYER_VIEW_ID = "dev.yamm.LayerView";

	/**
	 * Launches the given configuration either as a Run Configuration 
	 * ({@link dev.yamm.gui.SimulationState #run()} will be called) 
	 * or as a Debug Configuration: {@link dev.yamm.gui.SimulationState #stepInto(boolean)}
	 * will be called).
	 * 
	 * @param configuration	:	the YAMM Layer Configuration instance
	 * @param mode			: 	run / debug
	 * @param launch		: 	ILaunch instance
	 * @param monitor		: 	IProgressMonitor instance
	 */
	@Override
	public void launch(ILaunchConfiguration configuration, String mode, 
			ILaunch launch, IProgressMonitor monitor) throws CoreException 
	{
		layerfile = configuration.getAttribute(LaunchConfigurationConstants.L_PATH, ""); 
		autoupload = configuration.getAttribute(LaunchConfigurationConstants.L_AUTOMATIC_UPDATES, false);
		pathToLayerFile = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString();
		YAMMThread.environment = configuration.getAttribute(LaunchConfigurationConstants.L_ENVIRONMENT, new HashMap<String, String>());
		
		if (mode.equals(ILaunchManager.RUN_MODE)) 
		{	
			checkIfLaunched(launch);
			PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable()
			{
				public void run()
				{
					IWorkbenchWindow dwindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
					IWorkbenchPage page = dwindow.getActivePage();
					if (page != null) 
					{
						LayerView layerview = (LayerView) page.findView(LAYER_VIEW_ID);
							if (layerview == null)
						{
							try {
								layerview = (LayerView) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView("dev.yamm.LayerView");
							} catch (PartInitException e) {
								e.printStackTrace();
							}
						}
						if (layerview != null) 
						{
							layerview.loadLayers(pathToLayerFile + layerfile);
							layerview.setLayPath(pathToLayerFile + layerfile);
							ConfigurationManagement.setAutoupload(autoupload);
							if (autoupload)
								layerview.getAuto_upload().setImageDescriptor(dev.yamm.init.Activator.getImageDescriptor("icons/refresh.gif"));	
							else 
								layerview.getAuto_upload().setImageDescriptor(dev.yamm.init.Activator.getImageDescriptor("icons/refresh_off.gif"));
							layerview.updateView();
							LayerView.getSimulationState().run();
						} 
						else
						{
							logger.error("Could not connect to Layer View - Aborting ...");
						}
					}
				}
			});
		} 
		else if (mode.equals(ILaunchManager.DEBUG_MODE))
		{
			checkIfLaunched(launch);
			PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable()
			{
				public void run() 
				{
					IWorkbenchWindow dwindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
					IWorkbenchPage page = dwindow.getActivePage();
					if (page != null)
					{
						LayerView layerview = (LayerView) page.findView(LAYER_VIEW_ID);
							if (layerview == null)
						{
							try {
								layerview = (LayerView) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView("dev.yamm.LayerView");
							} catch (PartInitException e) {
								e.printStackTrace();
							}
						}
						if (layerview != null)
						{
							layerview.loadLayers(pathToLayerFile + layerfile);
							layerview.setLayPath(pathToLayerFile + layerfile);
							ConfigurationManagement.setAutoupload(autoupload);
							if (autoupload)
								layerview.getAuto_upload().setImageDescriptor(dev.yamm.init.Activator.getImageDescriptor("icons/refresh.gif"));	
							else 
								layerview.getAuto_upload().setImageDescriptor(dev.yamm.init.Activator.getImageDescriptor("icons/refresh_off.gif"));
							layerview.updateView();
						} 
						else 
						{
							logger.error("Could not connect to Layer View - Aborting ...");
						}
					}
				}
			});
				IDebugTarget target = new YAMMDebugTarget(launch);
				launch.addDebugTarget(target);
		}
	}


	/**
	 * Takes care that there wont be more than one debug target in the
	 * debug view (avoids NullPointerEceptoins in Zerochart). 
	 * If the user presses the debug button although a session has already been started,
	 * the first session has to be terminated first before the new one is started.
	 * 
	 * @param launch - the current ILaunch object
	 */
	private void checkIfLaunched(ILaunch launch) 
	{
		if (!launches.isEmpty())
		{
			ILaunch oldLaunch = launches.get(0);
			launches.clear();
			DebugPlugin.getDefault().getLaunchManager().removeLaunch(oldLaunch);
			YAMMDebugTarget target = (YAMMDebugTarget) oldLaunch.getDebugTarget();
			if  (target != null)
			{
				try 
				{
					target.terminate();
				} 
				catch (DebugException e) 
				{
					e.printStackTrace();
				}
			}
			SimulationState.compileError = false;
		}
		launches.add(launch);
	}

	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.LaunchConfigurationDelegate#buildForLaunch(org.eclipse.debug.core.ILaunchConfiguration, java.lang.String, org.eclipse.core.runtime.IProgressMonitor)
	 */
	public boolean buildForLaunch(ILaunchConfiguration configuration, String mode, IProgressMonitor monitor) throws CoreException {
		return false;
	}	
	
}
