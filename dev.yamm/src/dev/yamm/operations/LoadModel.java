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

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Map;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import dev.yamm.Common;
import dev.yamm.EvalGuardOrEffect;
import dev.yamm.coreModelXmi.yamm.YClass;
import dev.yamm.logger.YAMMLogger;

public class LoadModel
{
	EvalGuardOrEffect execute;
	private static YAMMLogger logger = YAMMLogger.getYAMMLogger("YAMM Log");

	public LoadModel(EvalGuardOrEffect execute)
	{
		this.execute = execute;
	}

	public EObject loadModel(String relModelPath, int layer)
	{
		relModelPath.replace("/", File.separator);
		relModelPath.replace("\\", File.separator);
		String projectName = execute.reflectivStateChart.compilation.projectName;
		String wsPath = null;
		if (!execute.reflectivStateChart.standalone)
			wsPath = ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString();
		else
			wsPath = execute.reflectivStateChart.standaloneWorkspacePath;
		String fullPath = wsPath + File.separator + projectName;
		if (relModelPath.startsWith(File.separator))
			fullPath += relModelPath;
		else
			fullPath += File.separator + relModelPath;

		String nsuri = getNsuri(fullPath);
		
		EPackage originalPackage = (EPackage) EPackage.Registry.INSTANCE.get(nsuri);
		EPackage runtimePackage = execute.reflectivStateChart.objectManagement.getEPackage(1);
		EPackage.Registry.INSTANCE.put(nsuri, runtimePackage);

//		YDiagramPackage.eINSTANCE.eClass();
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("ydiagram", new XMIResourceFactoryImpl());
		ResourceSet resSet = new ResourceSetImpl();
		URI fileURI = URI.createFileURI((new File(fullPath)).getAbsolutePath());
		Resource resource = resSet.getResource(fileURI, true);
//		EcoreUtil.resolveAll(resource);
		EObject diagramRootElement = resource.getContents().get(0);

		if (originalPackage != null)
		EPackage.Registry.INSTANCE.put(nsuri, originalPackage);
		else
			EPackage.Registry.INSTANCE.remove(nsuri);
		
		EStructuralFeature semanticRootElementFeature = diagramRootElement.eClass().getEStructuralFeature("semanticRootElement");
		EObject semRoot = (EObject) diagramRootElement.eGet(semanticRootElementFeature);

		TreeIterator<EObject> iter = EcoreUtil.getAllContents(semRoot, true);
		
		TreeIterator<EObject> iter2 = new TreeIterator<EObject>(){
			private boolean firstNext = true;
			@Override
			public boolean hasNext()
			{
				if (firstNext)
					return true;
				return iter.hasNext();
			}
			@Override
			public EObject next()
			{
				if (firstNext) {
					firstNext = false;
					return semRoot;
				}
				return iter.next();
			}

			@Override
			public void prune()
			{
				if (!firstNext)
					iter.prune();			
			}
			
		};
		
		while (iter2.hasNext())
		{
			EObject objToPut = iter2.next();
			for (EReference feature : objToPut.eClass().getEAllReferences())
			{
				if (objToPut.eGet(feature) instanceof YClass)
				{
					String qualifiedName = ((YClass) objToPut.eGet(feature)).getQualifiedName();
//					EObject internalYClass = execute.reflectivStateChart.objectManagement.qualifiedNameToYClassifier.get(qualifiedName);
//					objToPut.eSet(feature, internalYClass);
				}
			}
			
			// initialize this:
			EStructuralFeature thisFeature = objToPut.eClass().getEStructuralFeature("this");
			if (thisFeature != null && objToPut.eGet(thisFeature) == null)
			{
				objToPut.eSet(thisFeature, objToPut);
			}
			// initialize yClass:
			EStructuralFeature yClassFeature = objToPut.eClass().getEStructuralFeature("yClass");
			if (yClassFeature != null && objToPut.eGet(yClassFeature) == null)
			{
				objToPut.eSet(yClassFeature,
						execute.reflectivStateChart.objectManagement.eClassifierToYClassifier.get(objToPut.eClass()));
			}
			
			//initialize internal:
			EStructuralFeature internal = objToPut.eClass().getEStructuralFeature("yammInternal");
			if (internal != null && objToPut.eGet(internal) == null) {	
				objToPut.eSet(internal, execute.reflectivStateChart.internal);
			}
			execute.reflectivStateChart.objectManagement.introduceObjectToObjectCache(1, objToPut);
			
			EClassifier simObj = execute.reflectivStateChart.objectManagement.getEClassifier("DES.SimulationObject", layer);
			if(simObj != null && aIsB(objToPut.eClass(), (EClass) simObj))
			{
				execute.reflectivStateChart.objectManagement.addSimObject(layer, objToPut);
			}
			EClassifier event = execute.reflectivStateChart.objectManagement.getEClassifier("DES.Event", layer);
			if(event != null && aIsB(objToPut.eClass(), (EClass) event))
			{
				execute.reflectivStateChart.objectManagement.addEvent(objToPut, layer);
			}
//			EObject yammInstance = execute.reflectivStateChart.objectManagement.qualifiedNameToYClassifier.get(Common.getQualifiedNameEObject(objToPut));
			EClassifier queue = execute.reflectivStateChart.objectManagement.getEClassifier("DES.Queue", layer);
			if(queue != null && aIsB(objToPut.eClass(), (EClass) queue))
			{
				execute.reflectivStateChart.objectManagement.addQueue(objToPut, layer);
				execute.reflectivStateChart.objectManagement.addDelayQueue(objToPut, layer);
			}
//			if (execute.reflectivStateChart.objectManagement.observedValues.containsKey(className))
//			{
//				execute.reflectivStateChart.objectManagement.propertyObserver
//					.addObserver(addingObject, execute.reflectivStateChart.objectManagement.observedValues.get(className));
//			}	
		}

		return semRoot;
	}
	
	private boolean aIsB(EClass a, EClass b) {
		if (a.getEAllSuperTypes().contains(b))
			return true;
		else {
			for (EClass superType : a.getEAllSuperTypes()) {
				if (aIsB(superType, b)) {
					return true;
				}
			}
			return false;
		}
	}

	private String getNsuri(String fullPath)
	{
		String xmiSource = "";
		try
		{
			BufferedReader reader = new BufferedReader(new FileReader(fullPath));
			reader.readLine();
			xmiSource = reader.readLine();
			reader.close();
		}
		catch (Exception e)
		{
		}
		int nsuriIndex = xmiSource.indexOf("internalModelNsuri");
		xmiSource = xmiSource.substring(nsuriIndex + 19, xmiSource.length());
		return xmiSource.substring(1, xmiSource.indexOf("ecore\"") + 5);
	}
}
