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
package standaloneYAMM.YAMM;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage;
import online.yamm.coreModelDiagram.yammDiagram.xmiToText.DslConverter;
import online.yamm.coreModelDsl.XYammStandaloneSetup;
import online.yamm.coreModelXmi.yamm.YModel;

public class XMIConverter
{
    /**
     * java -jar XMIConverter.jar R:\HelloWorld.yammdiagram R:\HelloWorldXmi.yamm //(-> output)
     * 
     */
	public static void main(String[] args)
	{	
		String path = args[0];
		YammDiagramPackage.eINSTANCE.eClass();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("yammdiagram", new XMIResourceFactoryImpl());
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(URI.createFileURI(path), true);
		
		DslConverter dslConverter = new DslConverter();
		List<String> dslCode = dslConverter.createFullDsl((online.yamm.coreModelDiagram.yammDiagram.YModel) resource.getContents().get(0));		
		String source = "";
		for (String line : dslCode)
			source += line + " \n";
		File xfile = new File(path = path.replace(".yammdiagram", "__TMP__.xyamm"));		
		try {
			FileWriter fileWriter = new FileWriter(xfile,false);
			fileWriter.write(source);
			fileWriter.close();
		} catch (IOException e) {
		        e.printStackTrace();
		} 
		
		// inject language
		Injector injector = new XYammStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);

		// load model
		resource = resourceSet.getResource(URI.createFileURI(path), true);
		EcoreUtil.resolveAll(resource);
		if (resource.getContents().size() == 0 || !(resource.getContents().get(0) instanceof YModel))
		{
			System.out.println("no YModel found");
		}
		else
		{
			// save as xmi
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("yamm", new XMIResourceFactoryImpl());
			resSet = new ResourceSetImpl();
			Resource resource2 = resSet.createResource(URI.createFileURI(args[1]));
			resource2.getContents().addAll(resource.getContents());
			
			YModel yModel = (YModel) resource2.getContents().get(0);		
			List<EObject> types = new ArrayList<EObject>(resource2.getContents());
			for (int i = 1; i < types.size(); i++)
			{
				yModel.getTypes().add(types.get(i));
			}
			
			try
			{
				resource2.save(Collections.EMPTY_MAP);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
}
