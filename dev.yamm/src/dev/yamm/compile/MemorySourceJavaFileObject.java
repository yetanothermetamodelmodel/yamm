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
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Logger;

import javax.tools.SimpleJavaFileObject;

import dev.yamm.Zerochart;

/**
 * A Java source file that exists in memory.
 * 
 * @author prunge
 */
public class MemorySourceJavaFileObject
extends SimpleJavaFileObject
{

	private final String code;
	
	/**
	 * Constructs a <code>MemoryJavaFileObject</code>.
	 * 
	 * @param name the name of the source file.
	 * @param code the source code.
	 * 
	 * @throws IllegalArgumentException if <code>name</code> is not valid.
	 * @throws NullPointerException if any parameter is null.
	 */
	public MemorySourceJavaFileObject(final String name, final String code)
	{
		super(createUriFromName(name), Kind.SOURCE);
		
		if (code == null)
			throw new NullPointerException("code == null");
		
		this.code = code;
	}

	/**
	 * Creates a URI from a source file name.
	 * 
	 * @param name the source file name.
	 * 
	 * @return the URI.
	 * 
	 * @throws NullPointerException if <code>name</code>
	 * 			is null.
	 * @throws IllegalArgumentException if <code>name</code>
	 * 			is invalid.
	 */
	private static URI createUriFromName(final String name)
	{
		if (name == null)
			throw new NullPointerException("name == null");
		
		try
		{
			return(new URI(name));
		}
		catch (final URISyntaxException e)
		{
			throw new IllegalArgumentException("Invalid name: " + name, e);
		}
	}

	@Override
	public CharSequence getCharContent(boolean ignoreEncodingErrors)
	throws IOException
	{
		return(code);
	}
}
