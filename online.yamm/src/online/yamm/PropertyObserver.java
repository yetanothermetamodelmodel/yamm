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

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class PropertyObserver {

	private ObjectManagement om;
	
	private Map<String, List<Pair<String>>> data = null;
	private ChartManagement.SimulationIsRunningListener isRunningListener = null;
	private Map<String, Integer> featureCount;
	private Map<String, Pair<String>> title;
	private int count;
	
	public PropertyObserver(ObjectManagement objectManagement) {
		om = objectManagement;
	}

	public void addObserver(EObject target, List<EObject> list, int layer) {

		EClass targetEClass = target.eClass();
		List<EStructuralFeature> features = new ArrayList<>(list.size());
		
		Adapter adapter = new AdapterImpl() {
			@Override
			public void notifyChanged(Notification msg) {
				if (msg.getFeature() instanceof EStructuralFeature 
						&& features.contains(msg.getFeature()))
				{
					String objectId = (String) om.get((EObject) msg.getNotifier(), "ObjectID");
					String targetId = om.objectIdToName.get(layer).get(objectId);
					targetId += "_" + ((EStructuralFeature) msg.getFeature()).getFeatureID();
					Object newValue = msg.getNewValue();
					if (newValue instanceof Number)
					{
						data.get(targetId).add(
								new Pair<String>(
										om.reflectivStateChart.getTimeStep() + ""
										, ((Number) newValue).doubleValue() + ""));
					}
				}
			}
		};
		
		target.eAdapters().add(adapter);
		
		if (isRunningListener == null)
		{
			data = new HashMap<>();
			featureCount = new HashMap<>();
			count = 0;
			title = new HashMap<>();
			isRunningListener = (isRunning) -> {
				if (!isRunning)
				{

					if (om.reflectivStateChart.standalone)
					{
						om.reflectivStateChart.objectManagement.setResultMarkedProperties(title,data);
					}
					else {
						om.reflectivStateChart.objectManagement.setResultMarkedProperties(title,data);
						save();
					}
					om.reflectivStateChart.simulationIsRunningListener.remove(isRunningListener);
					isRunningListener = null;
					target.eAdapters().remove(adapter);
				}
			};
			om.reflectivStateChart.simulationIsRunningListener.add(isRunningListener);
		}
		
		String objectId = (String) om.get(target, "ObjectID");
		String targetId = om.objectIdToName.get(layer).get(objectId);
		
		for (EObject property: list)
		{
			EStructuralFeature feature = targetEClass.getEStructuralFeature((String) om.get(property, "name"));
			String id = targetId + "_" + feature.getFeatureID();
			features.add(feature);
			featureCount.put(id, count++);
			String qualifiedClassName = Common.getQualifiedNameEObject((EClass) feature.eContainer());
			String propertyName = feature.getName();
			title.put(id, new Pair<String>(id + "__timeStep", id + "__" + qualifiedClassName + ":" + propertyName));
			data.put(id, new ArrayList<>());
		}
	
	}

	private void save() {
		
		List<List<String>> output = new ArrayList<>();
		output.add(filledList(data.size() * 2));
		
		int countSet = 0;
		for(Entry<String, List<Pair<String>>> entrySet : data.entrySet())
		{
			String id = entrySet.getKey();
			int pos = featureCount.get(id);
			output.get(0).set(countSet * 2, title.get(id).a); //TODO
			output.get(0).set(countSet * 2 + 1, title.get(id).b); //TODO
			int i = 1;
			for (Pair<String> entry : entrySet.getValue())
			{
				if (output.size() <= i)
					output.add(filledList(data.size() * 2));
				output.get(i).set(countSet * 2, entry.a.replace(".", ","));
				output.get(i).set(countSet * 2 + 1, entry.b.replace(".", ","));
				i++;
			}
			countSet++;
		}
		
		
		String outputStr = "";
		for (List<String> line : output)
		{
			for (Iterator<String> iter = line.iterator(); iter.hasNext();)
			{
				outputStr += iter.next() + (iter.hasNext() ? ";" : "");	
			}
			outputStr += "\n";
		}
		
		String fileName = om.reflectivStateChart.simualtionTimeStamp + ".csv";
		String wsPath = ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString();   
		String path = wsPath + File.separator + om.reflectivStateChart.compilation.projectName + File.separator + "output";
			
		String outputDirectoryPath = path;
		path += File.separator + fileName;	
		
		File outputDir = new File(outputDirectoryPath);
		if (!outputDir.exists())
			outputDir.mkdir();
		
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
			    writer.write(outputStr);   
		} catch (Exception e) {
			e.printStackTrace();
		}					
	}
	
	private List<String> filledList(int size)
	{
		List<String> list = new ArrayList<String>(size);
		for (int i = 0; i < size; i++)
		{
			list.add("");
		}
		return list;
	}

}
