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
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.logging.Logger;

import javax.tools.SimpleJavaFileObject;

import online.yamm.Zerochart;

/**
 * A Java file object that reads from a URL.
 * 
 * @author prunge
 */
public class UrlJavaFileObject extends SimpleJavaFileObject
{

	private final URL url;
	private final String binaryName;
	
	/**
	 * Constructs a <code>URLJavaFileObject</code>.
	 *
	 * @param name the file name.
	 * @param url the URL of the file.
	 * @param kind the kind of file.
	 * @param binaryName the binary name of the file.
	 * 
	 * @throws URISyntaxException if an error occurs converting <code>name</code>
	 * 			to a URI.
	 */
	public UrlJavaFileObject(final String name, final URL url,
			final Kind kind, final String binaryName)
	throws URISyntaxException
	{
		super(new URI(name), kind);
		
		this.url = url;
		this.binaryName = binaryName;
	}

	@Override
	public InputStream openInputStream() throws IOException
	{
		return(url.openStream());
	}
	
	public String getBinaryName()
	{
		return(binaryName);
	}
}
