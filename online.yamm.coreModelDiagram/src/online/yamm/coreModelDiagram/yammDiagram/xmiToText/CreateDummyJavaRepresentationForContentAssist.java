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
package online.yamm.coreModelDiagram.yammDiagram.xmiToText;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.resource.Resource;

import online.yamm.coreModelDiagram.yammDiagram.YClass;
import online.yamm.coreModelDiagram.yammDiagram.YModel;
import online.yamm.coreModelDiagram.yammDiagram.YPackage;

public class CreateDummyJavaRepresentationForContentAssist {

	public static Map<Resource, CreateDummyJavaRepresentationForContentAssist> projectInstance = new HashMap<>();
	
	private String projectName;
	private EMap<String, String> idToName;
	private String outputDirectoryPath;
	private Map<String, String> qualifiedNameToPath = new HashMap<>();
	public boolean refresh = false;
	private Map<String, List<String>> nameToIds = new HashMap<>();
	
	public CreateDummyJavaRepresentationForContentAssist(String projectName, YModel model) {
		projectInstance.put(model.eResource(), this);
		
		this.projectName = projectName;
		idToName = new BasicEMap<String, String>();
		
		String wsPath = ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString();   
		String path = wsPath + File.separator + projectName + File.separator + ".src-gen";
		outputDirectoryPath = path;
		File outputDir = new File(outputDirectoryPath);
		if (!outputDir.exists())
			outputDir.mkdir();
		File[] allContents = outputDir.listFiles();
	    if (allContents != null) {
	        for (File file : allContents) {
	            deleteDirectory(file);
	        }
	    }
		// TODO: vorhandeen daten verwenden, .. -> existingPackageDirectories und idToName initialisieren
	}
	
	boolean deleteDirectory(File directoryToBeDeleted) {
	    File[] allContents = directoryToBeDeleted.listFiles();
	    if (allContents != null) {
	        for (File file : allContents) {
	            deleteDirectory(file);
	        }
	    }
	    return directoryToBeDeleted.delete();
	}
	
	
	
	public void createClass(YClass yClass)
	{
		idToName.put(yClass.getObjectID(), getQualifiedNameYClass(yClass));
		
		
		String classContent = "";
		
		String qualifiedClassName = getQualifiedNameYClass(yClass);
		
		if (!nameToIds.containsKey(qualifiedClassName))
			nameToIds.put(qualifiedClassName, new ArrayList<>());
		nameToIds.get(qualifiedClassName).add(yClass.getObjectID());
		
		String existingDir = outputDirectoryPath;
		
		String packageName = null;
		if (qualifiedClassName.contains("."))
		{
			packageName = qualifiedClassName.substring(0, qualifiedClassName.lastIndexOf("."));
			classContent = "package " + packageName + ";\n\n";
			Iterable<String> segments = packageName.contains(".") ? Arrays.<String>asList(packageName.split(".")) : Arrays.<String>asList(packageName);
			
			if (!qualifiedNameToPath.containsKey(packageName))
			{
				String existingPackage = null;
				for (String segment : segments)
				{
					existingPackage = existingPackage != null ? existingPackage + "." + segment : segment;
					existingDir = existingDir + File.separator + segment;
					if (!qualifiedNameToPath.containsKey(existingPackage))
					{
						File packageDir = new File(existingDir);
						packageDir.mkdir();
						qualifiedNameToPath.put(existingPackage, existingDir);
					}
				}
			}
			
			existingDir = outputDirectoryPath;
			System.out.println();
			for (String segment : segments)
				existingDir = existingDir + File.separator + segment;
		}
		
		classContent += "public class " + yClass.getName() + " {}";
		
		String fileName = yClass.getName() + ".java";
		
		String path = existingDir + File.separator + fileName;	
		qualifiedNameToPath.put(qualifiedClassName, path);
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
			    writer.write(classContent);   
		} catch (Exception e) {
			e.printStackTrace();
		}	
		
	}
	
	public void refreshProject()
	{
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		try {
			project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}
	
	public void updateClassName(YClass yClass)
	{
		String oldClassName = idToName.get(yClass.getObjectID());
		if (nameToIds.get(oldClassName).size() == 1)
			new File(qualifiedNameToPath.remove(oldClassName)).delete();
		nameToIds.get(oldClassName).remove(yClass.getObjectID());
		createClass(yClass);
		refreshProject();
	}
	
	public void deleteClass(YClass yClass) 
	{
		String path = qualifiedNameToPath.get(idToName.get(yClass.getObjectID()));
		qualifiedNameToPath.remove(path);
		
		nameToIds.get(idToName.get(yClass.getObjectID())).remove(yClass.getObjectID());
		if (nameToIds.get(idToName.get(yClass.getObjectID())).isEmpty())
		{
			File file = new File(path);
			if (path != null && file != null)
				file.delete();
			refreshProject();
		}
	}
	
	public void deletePackage(YPackage yPackage ) {
	
		yPackage.getOwnedMemberPackage().stream().forEach(member -> {
//			if (member instanceof YPackage) 
//				deletePackage((YPackage) member);
//			else
//				deleteClass((YClass) member);
		});
		
//		String path = yPackage.getName();
//
//		while ((yPackage = yPackage.getPackage()) != null)
//		{
//			path = yPackage.getName() + File.separator + path;
//		}
//		path = outputDirectoryPath + File.separator + path;
//		deleteDirectory(new File(path));

	}
	
	private String getQualifiedNameYClass(YClass yClass)
	{
		String qualifiedName = yClass.getName();
		YPackage pack = (YPackage) yClass.getPackage();

		if (pack == null)
			return qualifiedName;

		qualifiedName = pack.getName() + "." + qualifiedName;

		while ((pack = pack.getPackage()) != null)
		{
			qualifiedName = pack.getName() + "." + qualifiedName;
		}
		return qualifiedName;
	}
}
