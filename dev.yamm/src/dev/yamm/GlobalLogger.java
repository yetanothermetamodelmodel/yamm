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
package dev.yamm;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;

public class GlobalLogger 
{

	private static boolean active = false;
	
	private static Map<Object, Map<String, Object>> objectToListOfNoneStaticFields = new HashMap<Object, Map<String, Object>>();

	private static Map<Class<?>, Map<String, Object>> classToListOfStaticFields = new HashMap<Class<?>, Map<String, Object>>();


	public static void setActive(boolean active) {
		GlobalLogger.active = active;
	}


	public static void addNoneStaticField(Object containingObject, Object field, String name) 
	{
		if (!active)
			return;
		
		Map<String, Object> MapOfNoneStaticFields = objectToListOfNoneStaticFields.get(containingObject);
		if (MapOfNoneStaticFields == null) 
		{
			MapOfNoneStaticFields = new HashMap<String, Object>();
			objectToListOfNoneStaticFields.put(containingObject, MapOfNoneStaticFields);
		}
		if (!MapOfNoneStaticFields.keySet().contains(name))
			MapOfNoneStaticFields.put(name, field);
	}


	public static void addStaticField(Class<?> classContainingObject, Object field, String name) 
	{
		if (!active)
			return;
		
		Map<String, Object> MapOfStaticFields = classToListOfStaticFields.get(classContainingObject);
		if (MapOfStaticFields == null) 
		{
			MapOfStaticFields = new HashMap<String, Object>();
			classToListOfStaticFields.put(classContainingObject, MapOfStaticFields);
		}
		if (!MapOfStaticFields.keySet().contains(name))
			MapOfStaticFields.put(name, field);
	}


	public static void print(String name) 
	{
		if (!active)
			return;
		
		
		
		PrintWriter writer = null;
		
		try 
		{
			DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
			Date date = new Date();			
			String fileName = "log__" + dateFormat.format(date) + "__" +  name + "__" + ".txt"; 
			System.out.println("GlobalLogger__print__" + fileName);
			
			writer = new PrintWriter(fileName+ ".txt", "UTF-8");
			
			for (Object keyObject : objectToListOfNoneStaticFields.keySet()) 
			{
				Map<String, Object> noneStaticfieldsOfOneObject = objectToListOfNoneStaticFields.get(keyObject);
				Map<String, Object> staticfieldsOfOneObject = classToListOfStaticFields.get(keyObject.getClass());

				writer.println(); writer.println();
				writer.println(keyObject);

				if (staticfieldsOfOneObject != null) 
				{
					for (String nameOfField : staticfieldsOfOneObject.keySet()) 
					{
						Object field = staticfieldsOfOneObject.get(nameOfField);

						writer.println();
						writer.println("\t static " + nameOfField + ": " + field);
					}
				}

				if (noneStaticfieldsOfOneObject != null)
				{	
					for (String nameOfField : noneStaticfieldsOfOneObject.keySet()) 
					{
						Object field = noneStaticfieldsOfOneObject.get(nameOfField);

						writer.println();
						writer.println("\t" + nameOfField + ": " + field);
					}
				}
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			try {
				if (writer != null)
					writer.close();
			}
			catch(Exception e) { 
				e.printStackTrace(); 
			}
		}
	}

	public static void printSource(String source, String name)
	{
//		if (!active)
//		return;
		
		try {
			PrintWriter writer = new PrintWriter(name);
			writer.print(source);
			System.out.println("GlobalLogger__printSource__" + name);
			writer.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	public static void printEPackage(EPackage ePackage, String msg, String type)
	{
		if (!active)
			return;
		
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
		Date date = new Date();	
		String fileName = "/aiTEST/" + msg + "___" + dateFormat.format(date) + "__" + ePackage.getName() + "." + type;

		
		ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap()
			.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMLResourceFactoryImpl());
		URI uri = URI.createPlatformResourceURI(fileName, true);
		Resource resource = rs.createResource(uri);
		
		resource.getContents().add(ePackage);
		
		System.out.println("GlobalLogger__printEPackage__" + uri);
		try {
			resource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}


}

