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
package dev.yamm.buildpath;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.ClasspathContainerInitializer;
import org.eclipse.jdt.core.IClasspathContainer;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;

/**
 * Creates an instance of {@link YAMMClasspathContainer} and invokes 
 * {@link JavaCore #setClasspathContainer(IPath, IJavaProject[], IClasspathContainer[], org.eclipse.core.runtime.IProgressMonitor)}.
 */
public class YAMMClasspathContainerInitializer extends ClasspathContainerInitializer {

	public static final Path YAMM_LIBRARY_PATH = new Path("dev.yamm.buildpath.YAMM_CONTAINER");
	
	@Override
	public void initialize(IPath containerPath, IJavaProject project) throws CoreException 
	{
		IClasspathContainer container = new YAMMClasspathContainer();
		JavaCore.setClasspathContainer(containerPath, new IJavaProject[] { project },
				new IClasspathContainer[] { container }, null);
	}

}
