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
package dev.yamm.compile;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.JarURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.jar.JarEntry;

import javax.tools.FileObject;
import javax.tools.ForwardingJavaFileManager;
import javax.tools.JavaFileManager;
import javax.tools.JavaFileObject;
import javax.tools.JavaFileObject.Kind;
import javax.tools.SimpleJavaFileObject;
import javax.tools.StandardLocation;

/**
 * A java file manager that stores output in memory, delegating all other
 * functions to another file manager.
 * 
 * @author prunge
 */
public class MemoryOutputJavaFileManager 
extends ForwardingJavaFileManager<JavaFileManager>
{
	/**
	 * Maps class names to file objects.
	 */
	private final Map<String, MemoryOutputJavaFileObject> outputMap;

	private final List<URL> classPathUrls;

	/**
	 * Constructs a <code>MemoryOutputJavaFileManager</code>.
	 *
	 * @param fileManager the underlying file manager to use.
	 */
	public MemoryOutputJavaFileManager(final JavaFileManager fileManager)
	{
		super(fileManager);

		outputMap = new HashMap<String, MemoryOutputJavaFileObject>();
		classPathUrls = new ArrayList<URL>();
	}

	/**
	 * Adds a URL that classes may be loaded from.  All classes from this
	 * URL will be added to the classpath.
	 * 
	 * @param url the URL to add.
	 * 
	 * @throws NullPointerException if <code>url</code> is null.
	 */
	public void addClassPathUrl(final URL url)
	{
		if (url == null)
			throw new NullPointerException("url == null");

		classPathUrls.add(url);
	}

	/**
	 * Returns the base URL of the specified class.
	 * <p>
	 * 
	 * For example, if <code>java.lang.String</code> exists at 
	 * http://base.net/parent/java/lang/String.class, the base URL
	 * is http://base.net/parent/.
	 * 
	 * @param clazz the class.
	 * 
	 * @return a base URL where the class is located.
	 * 
	 * @throws IllegalArgumentException if a URL cannot be obtained.
	 */
	public static URL baseUrlOfClass(final Class<?> clazz)
	{		
		try
		{
			String name = clazz.getName();
			URL url = clazz.getResource("/" + name.replace('.', '/') + ".class");
			int curPos = 0;
			do
			{
				curPos = name.indexOf('.', curPos + 1);
				if (curPos >= 0)
					url = new URL(url, "..");
			}
			while (curPos >= 0);

			return(url);
		}
		catch (final MalformedURLException e)
		{
			throw new IllegalArgumentException("Invalid URL for class " + clazz.getName(), e);
		}
	}

	@Override
	public JavaFileObject getJavaFileForOutput(final Location location,
			final String className, final Kind kind, final FileObject sibling) 
					throws IOException
	{
		if (kind != Kind.CLASS)
			throw new IOException("Only class output supported, kind=" + kind);

		try
		{
			MemoryOutputJavaFileObject output = 
					new MemoryOutputJavaFileObject(new URI(className), kind);

			outputMap.put(className, output);

			return(output);
		}
		catch (final URISyntaxException e)
		{
			throw new IOException(e);
		}
	}

	@Override
	public JavaFileObject getJavaFileForInput(final Location location,
			final String className, 
			final Kind kind)
					throws IOException
	{
		JavaFileObject result;
		if (StandardLocation.CLASS_OUTPUT == location  && Kind.CLASS == kind)
		{
			result = outputMap.get(className);
			if (result == null)
				result = super.getJavaFileForInput(location, className, kind);
		}
		else
			result = super.getJavaFileForInput(location, className, kind);

		return(result);
	}

	@Override
	public String inferBinaryName(final Location location, 
			final JavaFileObject file)
	{
		if (file instanceof UrlJavaFileObject)
		{
			UrlJavaFileObject urlFile = (UrlJavaFileObject)file;
			return(urlFile.getBinaryName());
		} else if (file instanceof JarJavaFileObject)
		{
			JarJavaFileObject urlFile = (JarJavaFileObject)file;
			return(urlFile.getBinaryName());
		}
		else
			return(super.inferBinaryName(location, file));
	}

	@Override
	public Iterable<JavaFileObject> list(final Location location, 
			final String packageName,
			final Set<Kind> kinds, 
			final boolean recurse) 
					throws IOException
	{
		
		//https://atamur.blogspot.com/2009/10/using-built-in-javacompiler-with-custom.html
//		 if (location == StandardLocation.PLATFORM_CLASS_PATH) { // let standard manager hanfle
//			   return standardFileManager.list(location, packageName, kinds, recurse);
//			  } else if (location == StandardLocation.CLASS_PATH && kinds.contains(JavaFileObject.Kind.CLASS)) {
//			   if (packageName.startsWith("java")) { // a hack to let standard manager handle locations like "java.lang" or "java.util". Prob would make sense to join results of standard manager with those of my finder here
//			    return standardFileManager.list(location, packageName, kinds, recurse);
//			   } else { // app specific classes are here
//			    return finder.find(packageName);
//			   }
//			  }
//			  return Collections.emptyList();
		
		
		//Special handling for Privateer classes when building with Maven
		//Maven does not set the classpath but instead uses a custom
		//classloader to load test classes which means the compiler
		//tool cannot normally see standard Privateer classes so 
		//we put in a workaround here
		if (StandardLocation.CLASS_PATH == location &&
				kinds.contains(Kind.CLASS))
		{	
			List<JavaFileObject> results = new ArrayList<JavaFileObject>();
			Iterable<JavaFileObject> superResults = 
					super.list(location, packageName, kinds, recurse);
			for (final JavaFileObject superResult : superResults)
			{
				results.add(superResult);
			}

			//Now process classpath URLs
			for (final URL curClassPathUrl : classPathUrls)
			{			
				boolean jar = false;
				URL loadUrl;
				String directory = packageName.replace('.', '/') + '/';
				
				if (curClassPathUrl.toString().startsWith("jar:file")) {
					loadUrl = curClassPathUrl;
					jar = true;
				} else
					loadUrl = new URL(curClassPathUrl, directory);

				try
				{
					if (jar) {
						List<JavaFileObject> additionalClasses = 
								listClassesFromJarUrl(loadUrl, packageName);
						results.addAll(additionalClasses);
					}
					else {
					List<JavaFileObject> additionalClasses = 
							listClassesFromUrl(loadUrl, packageName);
					results.addAll(additionalClasses);
					}

				}
				catch (final IOException e)
				{
					//This happens if the file does not exist
					//Move onto next one
				}					
			}

			return(results);
		}
		else
		{
			Iterable<JavaFileObject> results = 
					super.list(location, packageName, kinds, recurse);
			return(results);
		}
	}

	/**
	 * Lists all files at a specified URL.
	 * 
	 * @param base the URL.
	 * @param packageName the package name of classes to list.
	 * 
	 * @return a list of class files.
	 * 
	 * @throws IOException if an I/O error occurs.
	 */
	protected List<JavaFileObject> listClassesFromUrl(final URL base,
			final String packageName)
					throws IOException
	{
		//TODO this will only work with file:// not jar://

		if (base == null)
			throw new NullPointerException("base == null");

		List<JavaFileObject> list = new ArrayList<JavaFileObject>();


		URLConnection connection = base.openConnection();
		connection.connect();
		String encoding = connection.getContentEncoding();
		if (encoding == null)
			encoding = "UTF-8";
		BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream(), encoding));
		try
		{
			String curLine;
			do
			{
				curLine = reader.readLine();
				if (curLine != null)
				{
					//Only class files
					if (curLine.endsWith(".class"))
					{
						URL url = new URL(base, curLine);

						try
						{							
							String curSimpleName = curLine.substring(0, curLine.length() - ".class".length());
							String binaryName;
							if (packageName == null)
								binaryName = curSimpleName;
							else								
								binaryName = packageName + "." + curSimpleName;

							UrlJavaFileObject cur =
									new UrlJavaFileObject(curLine, url, Kind.CLASS, binaryName);
							list.add(cur);
						}
						catch (final URISyntaxException e)
						{
							throw new IOException("Error parsing URL " + curLine + ".", e);
						}
					}
				}
			}
			while (curLine != null);
		}
		finally
		{
			reader.close();
		}

		return(list);
	}
	
	static boolean active = true;
	protected List<JavaFileObject> listClassesFromJarUrl(final URL packageFolderURL,
			final String packageName)
					throws IOException
	{
		//TODO this will only work with file:// not jar://

		if (packageFolderURL == null)
			throw new NullPointerException("base == null");

		List<JavaFileObject> result = new ArrayList<>();
		
		try {
			
			URL url = new URL("jar:file:R:/jars/Ext.jar!/");
			

			String jarUri = url.toExternalForm().split("!")[0];
			JarURLConnection jarConn = (JarURLConnection) url.openConnection();

			Enumeration<JarEntry> entryEnum = jarConn.getJarFile().entries();
			
			while (entryEnum.hasMoreElements()) {
				JarEntry jarEntry = entryEnum.nextElement();
				String name = jarEntry.getName();
				if (active && name.contains("ExtClass.class")) {
					URI uri = URI.create(jarUri + "!/" + name);
					String binaryName = name.replaceAll("/", ".");
					active = false;
				result.add(new JarJavaFileObject(name, uri));
				}

			}
		} catch (Exception e) {
		
		}
		return(result);
	}
		
		
		

}
