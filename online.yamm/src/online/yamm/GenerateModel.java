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
package online.yamm;

import java.util.List;
import java.util.Properties;
import java.util.Random;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.xbase.XAssignment;
import org.eclipse.xtext.xbase.XbasePackage;

import online.yamm.coreModelXmi.yamm.YammPackage;

public class GenerateModel 
{
	public static final String metamodelEPackage = "metamodelEPackage", seed = "seed", rootEClass = "rootEClass", maxdepth = "depth";
	
	private EFactory factory;
	
	private EPackage metamodel;
	
	private Random random;
	
	private int depth;
	
	private EObject generate(Properties prop) 
	{
		random = new Random(prop.containsKey(seed) ? (int) prop.get(seed) : 1);
		
		metamodel = prop.containsKey(metamodelEPackage) ? (EPackage) prop.get(metamodelEPackage) 
				: YammPackage.eINSTANCE;
		
		factory = metamodel.getEFactoryInstance();
		
		depth = prop.containsKey(maxdepth) ? (int) prop.get(maxdepth) : 10;
		
		EClass rootClass = prop.containsKey(rootEClass) ? (EClass) prop.get(rootEClass) : YammPackage.Literals.YMODEL;
	
		EObject rootElement = factory.create(rootClass);
		
		createChildren(rootElement, 0);
		
		createCrossReferences(rootElement);
		
		return rootElement;
	}

	private void createCrossReferences(EObject rootElement) {
		TreeIterator<EObject> treeIter = rootElement.eAllContents();
		while (treeIter.hasNext())
		{
			EObject element = treeIter.next();
			// find all not contaiment references....
		}
	}

	private EObject createChildren(EObject rootElement, int currentDepth) {
		List<EReference> containmentFeatures = rootElement.eClass().getEAllContainments();
		
		for (EReference containmentFeature : containmentFeatures)
		{
			EClassifier type = containmentFeature.getEType();
			if (containmentFeature.isMany())
			{
				if (type instanceof EClass)
				{
					List<EObject> newElements = new BasicEList<>();
					EObject newElement = null;

					if (!((EClass) type).isAbstract())
					{
						newElement = type.getEPackage().getEFactoryInstance().create((EClass) type);
						// TODO: or other implementation of type
						if (currentDepth < depth)
							newElement = createChildren(newElement, currentDepth + 1);
						newElements.add(newElement);		
					}
					else
					{
						// TODO: find implementation

					}


					if (!((EClass) type).isAbstract())
					{
						newElement = type.getEPackage().getEFactoryInstance().create((EClass) type);
						// TODO: or other implementation of type
						if (currentDepth < depth)
							newElement = createChildren(newElement, currentDepth + 1);
						newElements.add(newElement);
					}
					else
					{
						// TODO: find implementation  
						
					}

					rootElement.eSet(containmentFeature, newElements);			
				}
				else
				{
					// TODO: enum
				}
			}
			else
			{
				if (type instanceof EClass)
				{
					if (!((EClass) type).isAbstract())
					{
					EObject newElement = type.getEPackage().getEFactoryInstance().create((EClass) type);
					// TODO: or other implementation of type
					if (currentDepth < depth)
						newElement = createChildren(newElement, currentDepth + 1);
					rootElement.eSet(containmentFeature, newElement);
					}
				}
				else
				{
					// TODO: enum
				}
			}
		}
		return rootElement;
	}
	

	public static void main(String[] args) 
	{
		GenerateModel generateModel = new GenerateModel();
		
		Properties prop = new Properties();
		prop.put(seed, 1);
//		prop.put(metamodelEPackage, XbasePackage.eINSTANCE);
//		prop.put(rootEClass, XbasePackage.Literals.XASSIGNMENT);
//		prop.put(maxdepth, 5);
		EObject generatedElement = generateModel.generate(prop); 
	}
}
