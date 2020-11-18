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
package online.yamm.compile;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import javax.tools.JavaFileManager;
import javax.tools.JavaFileObject;
import javax.tools.JavaFileObject.Kind;
import javax.tools.StandardLocation;

/**
 * A class loader that loads classes generated from a Java file manager.
 * This can be used in conjunction with the compiler API to compile and run
 * classes on the fly.
 * 
 * @author prunge
 */
public class JavaFileManagerClassLoader extends ClassLoader
{
	private final JavaFileManager fileManager;
	
	public URLClassLoader urlClassloader;

	/**
	 * Constructs a <code>ClassDataClassLoader</code>.
	 * 
	 * @param fileManager the file manager to read classes from.
	 * 
	 * @throws NullPointerException if <code>fileManager</code>
	 * 			is null.
	 */
	public JavaFileManagerClassLoader(final JavaFileManager fileManager)
	{
		super();
		
		if (fileManager == null)
			throw new NullPointerException("fileManager == null");
		
		this.fileManager = fileManager;
	}

	/**
	 * Constructs a <code>ClassDataClassLoader</code>.
	 *
	 * @param fileManager the file manager to read classes from.
	 * @param parent the parent classloader to delegate to if a class
	 * 			is not found in the file manager.
	 * 
	 * @throws NullPointerException if <code>fileManager</code>
	 * 			is null.
	 */
	public JavaFileManagerClassLoader(URL projBinURL, final JavaFileManager fileManager, 
			final ClassLoader parent)
	{
		super(parent);
		
		if (fileManager == null)
			throw new NullPointerException("fileManager == null");
		
		this.fileManager = fileManager;
		
		urlClassloader = new URLClassLoader(new URL[] {projBinURL});
	}

	@Override
	protected Class<?> findClass(final String name) 
	throws ClassNotFoundException
	{
		try
		{
			JavaFileObject classFile = 
				fileManager.getJavaFileForInput(StandardLocation.CLASS_OUTPUT, name, Kind.CLASS);
		
			if (classFile != null)
			{
				byte[] classData = readClassData(classFile);
				Class<?> clazz = 
					defineClass(name, classData, 0, classData.length);
				
				return(clazz);
			}
			else
			{
				try {
					return super.findClass(name);
				} catch (Exception e) {					
					return urlClassloader.loadClass(name);
				}
			}
		}
		catch (final IOException e)
		{
			throw new ClassNotFoundException(name, e);
		}
	}
	
	/**
	 * Reads all class file data into a byte array from the given file
	 * object.
	 * 
	 * @param classFile the class file to read.
	 * 
	 * @return the class data.
	 * 
	 * @throws IOException if an I/O error occurs.
	 */
	private byte[] readClassData(final JavaFileObject classFile)
	throws IOException
	{
		InputStream classStream = classFile.openInputStream();
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		int n;
		byte[] buf = new byte[4096];
		do
		{
			n = classStream.read(buf);
			if (n >= 0)
				bos.write(buf, 0, n);
		}
		while (n > 0);

		return(bos.toByteArray());
	}

	
}
