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
package standaloneYAMM.YAMM;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.log4j.Level;

import dev.yamm.ConfigurationManagement;
import dev.yamm.ObjectManagement;
import dev.yamm.ResourceManagement;
import dev.yamm.communication.Command;
import dev.yamm.communication.MarkedPropertiesCommand;
import dev.yamm.communication.ProgressCommand;
import dev.yamm.communication.ResultQueueCommand;
import dev.yamm.communication.ResultSimObjectActiveCommand;
import dev.yamm.communication.TestCommand;

/**
 * Parameter Syntax: <loggingOn:int/String> <threads:int> <iterations:int> <workspacePath:string> <layerfile:string> <externalJarDir:string> <projectName:string>
 * 
 * Der letzte parameter ist immer notwendig und das Verzeichnis muss mindestens org.eclipse.emf.ecore_....jar enthalten.
 *
 * (alles absolute Pfade; logging: 1, ALL, INFO, ERROR, DEBUG, FATAL, OFF, WARN)
 *
 * C:/"Program Files"/Java/jdk1.8.0_211/bin/java.exe -jar StandaloneYAMM.jar INFO 1 1 R:/workspace R:\\workspace\\HelloWorld\\model.lay R:/jars/ExtJars/ HelloWorld
 *
 * C:/"Program Files"/Java/jdk1.8.0_211/bin/java.exe -jar StandaloneYAMM.jar INFO 1 1 R:/workspace R:\\workspace\\GravelShipping\\model.lay R:/jars/ExtJars/ GravelShipping
 *
 */
public class StandaloneYAMM extends Thread {

	private static int remotePort = 2048;
	private static String remoteIP = "localhost";

	private ExperimentCoordinator experimentCoordinator;
	static int totalThreadNum = 2;
	static Integer threadnum = 0;
	static int iterations = 100;
	String savePath = "/tmp/rmofdumps";
	static String compiledLayerPath = "";
	static String layerFile = "";
	static String workspace = "";
	static String projectName = "";
	static String row;

	static Boolean packagesAreRegistered = false;
	static ArrayList<ResourceManagement> resourceManagements = new ArrayList<ResourceManagement>();

	final static long hourInMs = 3600000;
	final static long minInMs = 60000;
	final static long secInMs = 1000;

	private static Map<String, String> parameter;

	public void run() 
	{
		int localthreadnum;
		long completeTimeBefore;
		ResourceManagement resourceManagement;

		synchronized (threadnum) {
			localthreadnum = threadnum++;
			resourceManagement = resourceManagements.get(localthreadnum);
		}
		long timeBefore = 0;
		long timeAfter = 0;
		completeTimeBefore = System.currentTimeMillis();

		for (int i = 0; i < iterations; i++) 
		{
			timeBefore = System.currentTimeMillis();
			resourceManagement.start(parameter);	
			timeAfter = System.currentTimeMillis();		
			System.out.println("Thread: " + localthreadnum + ", iteration: " + i + ", time: " + parseTime(timeAfter - timeBefore));
			
			try {
				ObjectManagement om = resourceManagement.reflectivStateChart.objectManagement;
				if (om.resultMarkedProperties != null)
				{
					connect(new MarkedPropertiesCommand(om.resultMarkedProperties, Integer.valueOf(row)));
				}
//				if (om.resultObserver != null)
//				{
//					connect(new TestCommand(om.resultObserver));
//				}
				if (om.resultQueue != null)
				{
					connect(new ResultQueueCommand(om.resultQueue, Integer.valueOf(row)));
				}
				if (om.resultSimObjActive.size() > 0)
				{
				connect(new ResultSimObjectActiveCommand(om.resultSimObjActive, Integer.valueOf(row)));
				}
					
				connect(new ProgressCommand(Integer.valueOf(row),i+1));
				
				resourceManagement.softReset();
				
			} catch (Exception e) {
				Path path2 = Paths.get("C:/Users/Marcel/Desktop/debug");
		        try (BufferedWriter writer = Files.newBufferedWriter(path2))  {
		        		e.printStackTrace();
		        		writer.write(e.getMessage());
		        
		        		
		        }
		        catch (Exception en) {
		            // TODO: handle exception
		        }
		        
			}
		}
		
//		resourceManagement.stop();
		
		long completeTimeAfter = System.currentTimeMillis();

		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Complete Time (Thread" + localthreadnum + ")\t" + parseTime(completeTimeAfter - completeTimeBefore) + "\t mean: " + (completeTimeAfter - completeTimeBefore) / iterations + " (ms/iteration)");
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
	}


	private static String convertTimeToString(Long time, String suffix)
	{
		String timeString = time.toString();
		if (timeString.length() == 1)
			timeString = "0".concat(timeString);
		return timeString + suffix;
	}


	private static String parseTime(long timeInMS) 
	{
		Long hours = timeInMS / hourInMs;
		timeInMS %= hourInMs;

		Long minutes = timeInMS / minInMs;
		timeInMS %= minInMs;

		Long seconds = timeInMS / secInMs;
		timeInMS %= secInMs;

		return convertTimeToString(hours, "h ") + convertTimeToString(minutes, "m ") + convertTimeToString(seconds, "s ") + convertTimeToString(timeInMS, "ms");
	}


	public static void main(String[] args) {

		if (args.length == 1 && args[0].equals("-h")) {
			System.out.println("Parameter Syntax: <loggingOn:int> <threads:int> <iterations:int> <workspacePath:string> <layerfile:string> <externalJarDir:string> <projectName:string>");
		} else {
			System.out.println("Parameter Syntax: <loggingOn:int> <threads:int> <iterations:int> <workspacePath:string> <layerfile:string> <externalJarDir:string> <projectName:string>");

			for (String arg : args) {
				System.out.println(arg);
			}
			System.out.println();


			totalThreadNum 	= Integer.parseInt(args[1]);
			System.out.println("Thread number:\t\t\t" + totalThreadNum);
			iterations 	= Integer.parseInt(args[2]);
			System.out.println("Iterations:\t\t\t" + iterations);

			workspace = args[3];
			layerFile = args[4];
			projectName =  args[6];
			row = args[7];

			//		Common.checkFile(layerFilePrefix, true, true, "Layer File Prefix :");
			//		Common.checkFile(layerFile, false, true, "Layer File :");

			final long checktime  = 500;
			ArrayList<StandaloneYAMM> threads = new ArrayList<StandaloneYAMM>();
			long timeBefore = System.currentTimeMillis();

			// set loglevel
			switch (args[0]) {
			case "ALL":
				ConfigurationManagement.setLoggingLevel(Level.ALL);
				break;
			case "DEBUG":
				ConfigurationManagement.setLoggingLevel(Level.DEBUG);
				break;
			case "ERROR":
				ConfigurationManagement.setLoggingLevel(Level.ERROR);
				break;
			case "FATAL":
				ConfigurationManagement.setLoggingLevel(Level.FATAL);
				break;
			case "INFO":
				ConfigurationManagement.setLoggingLevel(Level.INFO);
				break;
			case "OFF":
				ConfigurationManagement.setLoggingLevel(Level.OFF);
				break;
			case "TRACE":
				ConfigurationManagement.setLoggingLevel(Level.TRACE);
				break;
			case "WARN":
				ConfigurationManagement.setLoggingLevel(Level.WARN);
				break;
			default:
				ConfigurationManagement.setLoggingOff();
			}

			parameter = new HashMap<>();
			
			for (int i = 8; i < args.length - 1; i++)
			{
				parameter.put(args[i], args[++i]);		
			}
			
			// init
			for (Integer i=0; i < totalThreadNum; i++) 
			{
				ResourceManagement resourceManagement = new ResourceManagement();
//				if (args.length == 7)
					resourceManagement.extJarDir = args[5];
				resourceManagement.reflectivStateChart.standalone = true;
				resourceManagement.reflectivStateChart.standaloneProjectName = projectName;
				resourceManagement.reflectivStateChart.standaloneWorkspacePath = workspace;
				
				resourceManagement.registerMetaModelPackages();
				resourceManagement.setThreadnum(i.toString());
				//test.resourceSet.getResources().clear();
				resourceManagement.setLayer(workspace, layerFile, true);
				resourceManagement.reflectivStateChart.objectManagement.setObjectCaches();
				resourceManagement.compile(i);
				resourceManagement.reflectivStateChart.simulationBeenStarted = false;	
				System.out.println("Initializing thread" + i + ":\t\tdone.");
				resourceManagements.add(resourceManagement);
			}
			System.out.println();
			
			// run
			for (int i = 0; i < totalThreadNum; i++) 
			{
				threads.add(new StandaloneYAMM());
				threads.get(i).start(); 
			}

			int countDead = 0;				
			while (countDead < totalThreadNum) 
			{
				countDead = 0;
				for (int i = 0; i < totalThreadNum; i++) 
				{
					if (!threads.get(i).isAlive()) 
						countDead++;
				}
				if (countDead < totalThreadNum) {
					try {
						sleep(checktime);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}

			long timeAfter = System.currentTimeMillis();

			System.out.println("\n======================================================================================================================================");
			System.out.println("Complete Time (startup+loading+teardown) \t" + parseTime(timeAfter-timeBefore) + "\t mean: " + (timeAfter-timeBefore) / (iterations  * totalThreadNum) + " (ms/(iteration * threads["+ totalThreadNum + "]))");
			System.out.println("======================================================================================================================================");
		}

	}	

	public static void connect(Command command) throws IOException {
		Socket server = null;

		try {
			server = new Socket(remoteIP, remotePort);

			ObjectOutputStream out = new ObjectOutputStream(server.getOutputStream());

			out.writeObject(command);

			//ObjectInputStream in = new ObjectInputStream(server.getInputStream());

		} finally {
			if (server != null) {
				server.close();
			}
		}

	}
	public class ExperimentCoordinator
	{

	}
}
