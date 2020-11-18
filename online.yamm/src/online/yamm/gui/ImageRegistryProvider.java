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

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

/**
 * A class granting access to the Image Registry of {@link online.yamm.init.Activator}.
 * Should be used whenever an SWT Image is requested. 
 * Create Images first and stores them for every further request - prevents running out of
 * SWT Handles. 
 */
public class ImageRegistryProvider 
{	
	/**
	 * Gets the requested Image. If an Image is stored gets it - creates a 
	 * new one otherwise.
	 * 
	 * @param key :	A unique key for the Image to get
	 * @return: The requested image according to the key.
	 */
	public static Image getImage(String key) 
	{
		ImageDescriptor imageDescriptor = online.yamm.init.Activator.getImageDescriptor(key);
		ImageRegistry imageRegistry = online.yamm.init.Activator.getDefault().getImageRegistry();
		Image image = imageRegistry.get(key);
		
		if (image == null)
		{
			image = imageDescriptor.createImage();
			imageRegistry.put(key, image);
		}
		return image;
	}
}
