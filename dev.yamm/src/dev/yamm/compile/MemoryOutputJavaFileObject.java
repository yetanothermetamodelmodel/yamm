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
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.util.logging.Logger;

import javax.tools.SimpleJavaFileObject;

import dev.yamm.Zerochart;

/**
 * A file object that retains contents in memory and does not write
 * out to disk.
 * 
 * @author prunge
 */
public class MemoryOutputJavaFileObject extends SimpleJavaFileObject
{
	private ByteArrayOutputStream outputStream;

	/**
	 * Constructs a <code>MemoryOutputJavaFileObject</code>.
	 *
	 * @param uri the URI of the output file.
	 * @param kind the file type.
	 */
	public MemoryOutputJavaFileObject(final URI uri, final Kind kind)
	{
		super(uri, kind);
	}

	/**
	 * Opens an output stream to write to the file.  This writes to 
	 * memory.  This clears any existing output in the file.
	 * 
	 * @return an output stream.
	 * 
	 * @throws IOException if an I/O error occurs.
	 */
	@Override
	public OutputStream openOutputStream() 
	throws IOException
	{
		outputStream = new ByteArrayOutputStream();
		return(outputStream);
	}

	/**
	 * Opens an input stream to the file data.  If the file has never
	 * been written the input stream will contain no data (i.e. length=0).
	 * 
	 * @return an input stream.
	 * 
	 * @throws IOException if an I/O error occurs.
	 */
	@Override
	public InputStream openInputStream() throws IOException
	{
		if (outputStream != null)
			return(new ByteArrayInputStream(outputStream.toByteArray()));
		else
			return(new ByteArrayInputStream(new byte[0]));
	}
}
