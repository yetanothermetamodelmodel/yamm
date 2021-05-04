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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import dev.yamm.ChartManagement;
import dev.yamm.EvalGuardOrEffect;
import dev.yamm.logger.YAMMLogger;

public class Util 
{
	EvalGuardOrEffect execute;
	private static YAMMLogger logger = YAMMLogger.getYAMMLogger("YAMM Log");

	public Util(EvalGuardOrEffect execute) {
		this.execute = execute;
	}

	private static int timerCnt = 1;

	public Object timerStart(String timerName, int layer)
	{
		TimerObject timerObj = new TimerObject();
		timerObj.startTime = System.currentTimeMillis();
		timerObj.number = timerCnt;
		timerObj.timerName = timerName;
		
		logger.info("(Message) [layer "+layer+"] timer start: name: " + timerName + "/ " + timerCnt);
		
		timerCnt++;
		
		return timerObj;
	}
	
	public double timerStop(Object obj, int layer)
	{
		if (false == obj instanceof TimerObject)
		{
			logger.error("(Message) [layer "+layer+"] timerStop: parameter is not a Timer");
			return 0;
		}
		
		TimerObject timerObj= (TimerObject) obj;
		long elapsedTime = System.currentTimeMillis() - timerObj.startTime;
		
		float elapsedTimeSec = elapsedTime/1000F;
		
		logger.info("(Message) [layer "+layer+"] timer: " + timerObj.timerName + 
				"/ "+ timerObj.number + ", elapsedTime: " + elapsedTimeSec + " seconds");

		return elapsedTimeSec;
	}
	
	public Object getYClass(String type, int layer)
	{
		return execute.reflectivStateChart.objectManagement.qualifiedNameToYClassifier.get(layer).get(type);
	}
	
	private Map<String, List<TimeAndValue>> data;
	private ChartManagement.SimulationIsRunningListener simListener = null;
	public void observerAddValue(String id, Double value, int layer) 
	{
		if (simListener == null)
		{
			data = new HashMap<>();
			execute.reflectivStateChart.simulationIsRunningListener.add(simListener = isRunning -> {
				if (!isRunning)
				{
					List<List<String>> output = new ArrayList<>();
					output.add(filledList(data.size() * 2));
					
					int countSet = 0;
					for(Entry<String, List<TimeAndValue>> entrySet : data.entrySet())
					{
						String id2 = entrySet.getKey();
						output.get(0).set(countSet * 2, "timeStep_" + id2);
						output.get(0).set(countSet * 2 + 1, id2);
						int i = 1;
						for (TimeAndValue entry : entrySet.getValue())
						{
							if (output.size() <= i)
								output.add(filledList(data.size() * 2));
							output.get(i).set(countSet * 2, (entry.timeStep + "").replace(".", ","));
							output.get(i).set(countSet * 2 + 1, (entry.value + "").replace(".", ","));
							i++;
						}
						countSet++;
					}
					if (execute.reflectivStateChart.standalone)
					{
						execute.reflectivStateChart.objectManagement.setResultObserver(output);
					}
					else
					{
						execute.reflectivStateChart.objectManagement.setResultObserver(output);
//						saveObserverValue(output); 
					}			
					execute.reflectivStateChart.simulationIsRunningListener.remove(simListener);
					simListener = null;
				}
			});	
		}
		if (!data.containsKey(id))
			data.put(id, new ArrayList<>());
		data.get(id).add(new TimeAndValue(execute.reflectivStateChart.getTimeStep(), value));
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
	private void saveObserverValue(List<List<String>> output) {

		
		String outputStr = "";
		for (List<String> line : output)
		{
			for (Iterator<String> iter = line.iterator(); iter.hasNext();)
			{
				outputStr += iter.next() + (iter.hasNext() ? ";" : "");	
			}
			outputStr += "\n";
		}
		
		String fileName = execute.reflectivStateChart.simualtionTimeStamp + "_Observer.csv";
		String wsPath = ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString();   
		String path = wsPath + File.separator + execute.reflectivStateChart.compilation.projectName + File.separator + "output";
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
}

class TimeAndValue 
{
	public int timeStep;
	public double value;
	
	public TimeAndValue(int timeStep, double value) 
	{
		this.timeStep = timeStep;
		this.value = value;
	}
}

class TimerObject extends EObjectImpl 
{
	int number;
	long startTime;
	long timeSpend;
	String timerName;
}
