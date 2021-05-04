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
package dev.yamm.operations;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;

import dev.yamm.EvalGuardOrEffect;
import dev.yamm.gui.Layer;


public class ManageTraces {

	EvalGuardOrEffect execute;
	
	public ManageTraces(EvalGuardOrEffect execute) {
		this.execute = execute;
	}
	
	public void saveTrace(Object obj, String fileName, int layer) {
		Layer actLayer = (Layer) execute.reflectivStateChart.objectManagement.getViewLayers().get(layer);
		String path = actLayer.getPath();
		path = path.substring(0, path.lastIndexOf("\\")+1);
		path = path+fileName;
		
		URI fileURI = URI.createURI(path);
		
		Resource resource = new XMLResourceImpl(fileURI);
		resource = new XMLResourceImpl(fileURI);
		
		resource.getContents().add((EObject) obj);
        
		try {
			resource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
