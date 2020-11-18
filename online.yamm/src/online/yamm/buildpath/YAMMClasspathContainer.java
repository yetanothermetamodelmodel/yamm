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
package online.yamm.buildpath;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collections;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jdt.core.IAccessRule;
import org.eclipse.jdt.core.IClasspathAttribute;
import org.eclipse.jdt.core.IClasspathContainer;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.JavaCore;
import org.osgi.framework.Bundle;

import online.yamm.init.Activator;

/**
 * A YAMM Library container managing YAMM specific dependencies.
 */
@SuppressWarnings("restriction")
public class YAMMClasspathContainer implements IClasspathContainer {

	private static final String EMF_ECORE = "org.eclipse.emf.ecore";
	private static final String YAMM_UTIL = "yammUtil.jar";
	private static final String YAMM_PLUGIN = "online.yamm.jar";
	
	@Override
	public IClasspathEntry[] getClasspathEntries() 
	{
		String absoluteYammUtilPath = null;
		String absoluteOnlineYammPath = null;
		IClasspathEntry[] yammLibEntry = null;
		
		//get org.eclipse.emf.ecore Bundle
		Bundle emfEcoreBundle = Platform.getBundle(EMF_ECORE);
		
		//find Path to yammUtil.jar as it is located in online.yamm Project
		Bundle bundle = Activator.getDefault().getBundle();
		IPath path = new Path(YAMM_UTIL);
		URL setupUrl = FileLocator.find(bundle, path, Collections.EMPTY_MAP);
		try 
		{
			File setupFile = new File(FileLocator.toFileURL(setupUrl).getPath());
			if (setupFile.exists())
			{
				absoluteYammUtilPath = setupFile.getAbsolutePath();
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		//find Path to online.yamm.util in online.yamm project
		path = new Path(YAMM_PLUGIN);
		setupUrl = FileLocator.find(bundle, path, Collections.EMPTY_MAP);
		try 
		{
			File setupFile = new File(FileLocator.toFileURL(setupUrl).getPath());
			if (setupFile.exists())
			{
				absoluteOnlineYammPath = setupFile.getAbsolutePath();
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		if (emfEcoreBundle != null
				&& absoluteYammUtilPath != null
				&& absoluteOnlineYammPath != null)
		{
			IPath pathToEmfEcoreBundle = null;
			IPath pathToYammBundle = null;
			IPath pathToOnlineYammBundle = null;
			try 
			{
				pathToEmfEcoreBundle = new Path(FileLocator.getBundleFile(emfEcoreBundle).getAbsolutePath());
				pathToYammBundle = new Path(absoluteYammUtilPath);
				pathToOnlineYammBundle = new Path(absoluteOnlineYammPath);
			} 
			catch (IOException e)
			{
				e.printStackTrace();
			}
			
			yammLibEntry = new IClasspathEntry[] {
					(JavaCore.newLibraryEntry(pathToEmfEcoreBundle, null, null, new IAccessRule[] {}, new IClasspathAttribute[]{}, false)),
					(JavaCore.newLibraryEntry(pathToYammBundle, null, null, new IAccessRule[] {}, new IClasspathAttribute[]{}, false)),
					(JavaCore.newLibraryEntry(pathToOnlineYammBundle, null, null, new IAccessRule[] {}, new IClasspathAttribute[]{}, false))
					};

		}
		if (yammLibEntry != null)
			return yammLibEntry;
		else
			return new IClasspathEntry[] {};
	}

	@Override
	public String getDescription() 
	{
		return "YAMM Library";
	}

	@Override
	public int getKind() 
	{
		return K_APPLICATION; 
	}

	@Override
	public IPath getPath() 
	{
		return YAMMClasspathContainerInitializer.YAMM_LIBRARY_PATH;
	}



}
