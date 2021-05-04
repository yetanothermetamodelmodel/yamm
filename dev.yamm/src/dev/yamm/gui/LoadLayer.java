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
package dev.yamm.gui;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import dev.yamm.ObjectManagement;

public class LoadLayer {
	
	/**
	 * Loads the layer file and creates a new Layer instances. Initializes the attributes of the Layer instances
	 * with corresponding values readout of the loaded file line by line. Adds the {@code Layer} to
	 * {@code ObjectManagement.viewLayers}.
	 * 
	 * @param prefix 	:	the prefix of the path to the corresponding file if method is (indirectly) called by
	 * 						PTASimulation.main(...), StandaloneYAMM.main(...), YAMMInterface(...) /
	 * 						 is {@code null} if it is called by {@code LayerView}.
	 * @param fullPath	:	the path to the layer file
	 */
	public List<Layer> loadLayers(String prefix, String fullPath, Logger logger) 
	{
		List<Layer> layer = new ArrayList<>();
		BufferedReader in = null;
		String t;
		Layer actLayer = null;
		int lineNR = 0;
		int maxLines = 6;
		int nextLayer = 0;
		
		if ((new File(fullPath)).exists()) 
		{
			try 
			{
				in = new BufferedReader(
						new InputStreamReader(
								new FileInputStream( fullPath ) ) );
				while ( null != (t = in.readLine()) )
				{
					switch (lineNR) 
					{
					case 0: 
					{
						actLayer = new Layer();
//						if (objectManagement.getViewLayers().size()==0) 
//						{
//							actLayer.setStepWait(true);
//						}
						if (prefix == null) 
						{
							actLayer.setPath(t);
						}
						else
						{
							if (t.trim().contains(" "))
							{
								actLayer.setPath(prefix + t);
							}
							else
							{
								String[] paths = t.trim().split(" ");
								actLayer.setPath(prefix + paths[0]);
								
								for (int i = 1; i < paths.length; i++)
								{
									actLayer.addExtYammLayerPath(paths[i]);
								}
							}
						}
						break;
					}
					case 1: 
					{
						actLayer.setNsURI(t);
						break;
					}
					case 2: 
					{
						if (t.equals("true")) actLayer.setBreakpoint(true); 
						if (t.equals("false")) actLayer.setBreakpoint(false);
						break;
					}
					case 3: 
					{
						long waittime = Long.valueOf(t).longValue();
						actLayer.setWaittime(waittime);
						break;
					}
					case 4: 
					{
						if(t.equals("true")) actLayer.setColorLayer(true);
						if(t.equals("false")) actLayer.setColorLayer(false);
						break;
					}
					case 5:
					{
						if(t.equals("true")) actLayer.setColorLayer(true);
						if(t.equals("false")) actLayer.setColorLayer(false);
						layer.add(actLayer);
						break;
					}
					case 6:
					{
						if (!"".equals(t))
							actLayer.setObjectDiagramPath(t);
						break;
					}
					}
					lineNR++;
					if (lineNR > maxLines) 
					{
						lineNR = nextLayer;
					}
				}
				in.close();
			} 
			catch (FileNotFoundException e) 
			{
				logger.error(e);
				return null;
			} 
			catch (IOException e) 
			{
				logger.error(e);
				return null;
			}
		} 
		else
		{
			logger.error("Can't find the file");
			return null;
		}	
		return layer;
	}
	
}
