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
package online.yamm.objectDiagram.design;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import online.yamm.ObjectDiagram.ObjectDiagram;
import online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage;
import online.yamm.coreModelDiagram.yammDiagram.xmiToText.DslConverter;


public class EcoreModelController {

	
	public static void createDiagram(ObjectDiagram objectDiagram, String projectName, String yammModelPath)
	{
		if (yammModelPath.contains("/"))
			yammModelPath = yammModelPath.replace("/", File.separator);
		else
			yammModelPath = yammModelPath.replace("\\", File.separator);
		String modelName = yammModelPath.substring(yammModelPath.lastIndexOf(File.separator) + 1,
				yammModelPath.lastIndexOf("."));
		String nsuri = projectName + "/." + modelName + ".ecore";
		String workspacePath = ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString();
		EPackage ecoreModel = createEcoreModel(nsuri, workspacePath, yammModelPath);
		EPackage.Registry.INSTANCE.put(nsuri, ecoreModel);
		ecoreModel.setName(modelName);
		ecoreModel.setNsPrefix(modelName);
		String modelPath = workspacePath + File.separator + projectName + File.separator + "." + modelName + ".ecore";
		objectDiagram.setMetaDataPackage(ecoreModel);
		saveModel(ecoreModel, modelPath);

//		YDiagram yDiagram = YDiagramFactory.eINSTANCE.createYDiagram();
//		EClassifier rootClassifier = ecoreModel.getEClassifier(getQualifiedName(yClass));
//		EObject rootInstance = ecoreModel.getEFactoryInstance().create((EClass) rootClassifier);
//		String hashCode = "f" + Integer.toHexString(rootInstance.hashCode() / (16*16));
//		rootInstance.eSet(rootInstance
//				.eClass().getEStructuralFeature("ObjectID"), hashCode);
//		yDiagram.setSemanticRootElement(rootInstance);
//		yDiagram.setInternalModelNsuri(nsuri);
//		// save
//		String yDiagramPath = workspacePath + File.separator + projectName + File.separator + yClass.getName()
//				+ ".ydiagram";
//		saveModel(yDiagram, yDiagramPath);


	}
	
	
	private static EPackage createEcoreModel(String nsuri, String workspacePath, String yammModelPath)
	{
		
		YammDiagramPackage.eINSTANCE.eClass();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("yammdiagram", new XMIResourceFactoryImpl());
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(URI.createFileURI(yammModelPath), true);

		DslConverter dslConverter = new DslConverter();
		List<String> dslCode = dslConverter.createFullDsl((online.yamm.coreModelDiagram.yammDiagram.YModel) resource.getContents().get(0));		
		String source = "";
		for (String line : dslCode)
			source += line + " \n";
		File xfile = new File(yammModelPath = yammModelPath.replace(".yammdiagram", "__TMP__.xyamm"));		
		try {
			FileWriter fileWriter = new FileWriter(xfile,false);
			fileWriter.write(source);
			fileWriter.close();
		} catch (IOException e) {
		        e.printStackTrace();
		} 
		
		
		GenerateEcore generateEcore = new GenerateEcore();
		generateEcore.laodModelForObjectDiagram = true;
		EPackage internalPackage = generateEcore
				.generateEPackage(0, yammModelPath, nsuri);
//				.generateEPackageWithoutOperations(0, path, nsuri);

		xfile.delete();
		for (EObject element : internalPackage.eContents())
		{
			if (element instanceof EClass)
			{
				EAttribute objectIdFeature = EcoreFactory.eINSTANCE.createEAttribute();
				objectIdFeature.setEType(EcorePackage.Literals.ESTRING);
				objectIdFeature.setName("ObjectID");
				((EClass) element).getEStructuralFeatures().add(objectIdFeature);
			}
		}

		return internalPackage;
	}

	private static void saveModel(EObject model, String modelPath)
	{
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.createResource(URI.createFileURI(modelPath));
		resource.getContents().add(model);
		try
		{
			resource.save(Collections.EMPTY_MAP);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	private static EPackage loadModel(String path)
	{
		// Initialize the model
		EcorePackage.eINSTANCE.eClass();

		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(URI.createFileURI(path), true);

		return (EPackage) resource.getContents().get(0);
	}

	
}
