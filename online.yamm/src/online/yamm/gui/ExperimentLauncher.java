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
package online.yamm.gui;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.stream.Collectors;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.ICoreRunnable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.osgi.framework.Bundle;

import online.yamm.communication.MulServer;
import online.yamm.init.Activator;

public class ExperimentLauncher {

	public void startExperiment(String layFilePath, Map<String, String> parameters, Properties prop, int row) {
		try {
			
			MulServer server = new MulServer();
			Thread experimentServerThread = new Thread() {
				 public void run(){
					 server.startServer();
				 }
			};
			experimentServerThread.start();	

			
			String workspace = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString();
			
			String projectPath = LayerView.yamm.reflectivStateChart.objectManagement.getViewLayers().get(0).getPath();
			projectPath = projectPath.replace("/", File.separator); projectPath = projectPath.replace("\\", File.separator);	
			projectPath = projectPath.substring(1, projectPath.length());
			projectPath = projectPath.substring(0, projectPath.indexOf(File.separator));
			String project = projectPath;
			
			int threads = prop != null && prop.contains("threads") ? (Integer) prop.get("threads") : 1;
			int iterations = prop != null && prop.contains("iterations") ? (Integer) prop.get("iterations") : 3;
			String jdkPath2 = System.getProperty("java.home");
			String jdkPath = "";
			if (System.getProperty("os.name").toLowerCase().contains("windows"))
			{
				jdkPath = jdkPath2.substring(0, jdkPath2.lastIndexOf("jre")) + "bin" + File.separator + "java.exe";
			}
			else
			{
				jdkPath = jdkPath2 + File.separator + "bin" +File.separator + "java";
			}
			String jdkPathFinal = jdkPath;
			String[] jars = { "yammUtil.jar", "online.yamm.jar"};
			List<String> paths = new ArrayList<>();

			for (String jar : jars) {
				Bundle bundle = Activator.getDefault().getBundle();
				IPath path = new Path(jar);
				URL setupUrl = FileLocator.find(bundle, path, Collections.EMPTY_MAP);
				try {
					File setupFile = new File(FileLocator.toFileURL(setupUrl).getPath());
					if (setupFile.exists()) {
						paths.add(setupFile.getAbsolutePath());
					}
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
					
			String pathStandalone = null;
			Bundle bundle = Platform.getBundle("online.yamm.util");
			IPath path = new Path("standaloneYAMM.jar");
			URL setupUrl = FileLocator.find(bundle, path, Collections.EMPTY_MAP);
			try {
				File setupFile = new File(FileLocator.toFileURL(setupUrl).getPath());
				if (setupFile.exists()) {
					pathStandalone = setupFile.getAbsolutePath();
				}
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
			String standaloneJar = pathStandalone.replace(File.separator, "/");
			String paramterArgs = parameters.entrySet().stream().map(entry -> entry.getKey() + " " + entry.getValue())
					.collect(Collectors.joining(" "));
			
			String extJarDirectory = paths.get(0).substring(0, paths.get(0).lastIndexOf(File.separator)).replace(File.separator, "/") + "/";//"R:/new/ExtJars/";

			Job experimentJob = Job.create("Experiment", (ICoreRunnable) monitor -> {		
				try {
					
				
					Process proc = Runtime.getRuntime()
							.exec(jdkPathFinal + " -jar " + standaloneJar + " OFF " + threads + " " + iterations + " " + workspace + " "
									+ layFilePath + " " + extJarDirectory + " " + project + " " + row + " " + paramterArgs);		

					new Thread() {
						public void run(){
							while (proc.isAlive())
							{
								if (monitor.isCanceled())
								{
									proc.destroy();
								}
								try {
									sleep(2000);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
							}
						}
					}.run();		

					proc.waitFor();

					monitor.done();
					
					Display.getDefault().asyncExec(new Runnable() {
						public void run() {
						}
					});
					
					server.stopServer();				
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			});

			experimentJob.schedule();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
