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
package dev.yamm.init;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.NotYetConnectedException;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.HashMap;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;

import dev.yamm.debug.model.YAMMThread;
import dev.yamm.logger.YAMMLogger;
import dev.yamm.preferencePage.PreferenceConstants;

/**
 * Performs the launching of the RMOF Analysis Configuration.
 * 
 */
public class LaunchDelegateAnalysis implements ILaunchConfigurationDelegate {

	private static YAMMLogger logger = YAMMLogger.getYAMMLogger("YAMM Log");
	private static ArrayList<String> existingRMOFAnalysisLogger = new ArrayList<String>(); 

	private String layerfile;
	//private String pathToLayerFile;
	private String breedingThreads;
	private String evaluationThreads;
	private String generations;
	private String individuals;
	private static YAMMLogger analysisLog = null;

	public static IProgressMonitor analysisMonitor = null;

	private static boolean checkIfFileExists(String fileName, String errorMessage, boolean checkIfExecutable, boolean checkIfDirectory) {
		File file = new File(fileName);
		if (!file.exists() || checkIfExecutable && !file.canExecute() || checkIfDirectory && !file.isDirectory()) {
			logger.error(errorMessage);
			return false;
		}
		return true;
	}

	@Override
	public void launch(ILaunchConfiguration configuration, String mode, ILaunch launch, IProgressMonitor monitor) throws CoreException {
		YAMMLogger.reset();
		layerfile = configuration.getAttribute(AnalysisLaunchConfigurationConstants.L_ANALYSISPARAMETERPATH, "");
		//pathToLayerFile = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString();
		YAMMThread.environment = configuration.getAttribute(AnalysisLaunchConfigurationConstants.L_ENVIRONMENT, new HashMap<String, String>());
		breedingThreads = tryToParseInteger(configuration.getAttribute(AnalysisLaunchConfigurationConstants.L_BREEDINGTHREADS, "1"));
		evaluationThreads = tryToParseInteger(configuration.getAttribute(AnalysisLaunchConfigurationConstants.L_EVALUATIONTHREADS, "1"));
		generations = tryToParseInteger(configuration.getAttribute(AnalysisLaunchConfigurationConstants.L_GENERATIONS, "100"));
		Integer generationsInteger = Integer.parseInt(generations);
		individuals = tryToParseInteger(configuration.getAttribute(AnalysisLaunchConfigurationConstants.L_INDIVIDUALS, "100"));
		String bestModelPath = configuration.getAttribute(AnalysisLaunchConfigurationConstants.L_BESTMODELPATH, "");
		String bestIndividuumPath = configuration.getAttribute(AnalysisLaunchConfigurationConstants.L_BESTINDIVIDUUMPATH, "");
		//String compiledClassPath = configuration.getAttribute(AnalysisLaunchConfigurationConstants.L_ANALYSISCOMPILEDCLASSPATH, "");
		Integer networkPort = tryToParseIntegerToInteger(configuration.getAttribute(AnalysisLaunchConfigurationConstants.L_NETWORKPORT, "1000"));
		
		if (mode.equals(ILaunchManager.RUN_MODE)) {
//			if (MainTasks.executingAnalysis == null) {
//				MainTasks.init();
//			}
			String analysisName = layerfile;
			if (existingRMOFAnalysisLogger.contains(analysisName)) {
				Integer addOnNumberForAnalysisLog = 1;
				while (existingRMOFAnalysisLogger.contains(analysisName.concat("+").concat(addOnNumberForAnalysisLog.toString())) && addOnNumberForAnalysisLog > Integer.MIN_VALUE) {
					addOnNumberForAnalysisLog++;
				}
				analysisName = analysisName.concat("+").concat(addOnNumberForAnalysisLog.toString());
			}
		
			// Get Java VM path
			String javaVMHome = System.getProperty("java.home");
			String javaVMExec = javaVMHome + File.separatorChar + "bin" + File.separatorChar + "java";

//			if (!checkIfFileExists(compiledClassPath, "Compile Path " + compiledClassPath + " does not exist (as Directory) or is not executable.", true, true))
//				return;

			if (File.separatorChar == '\\') {
				javaVMExec += ".exe";
			}   
			if (!checkIfFileExists(javaVMExec, "Specified java VM executable " + javaVMExec + " does not exist or is not executable.", true, false))
				return;

			String jarFile = Activator.getActionPreferenceStore().getString(PreferenceConstants.P_ANALYSISCORE_PATH);


			if (!checkIfFileExists(jarFile, "Jar " + jarFile + " does not exist.", false, false))
				return;

			String paramsFile = layerfile; 

			if (!checkIfFileExists(jarFile, "Parameterfile " + paramsFile + " does not exist.", false, false))
				return;

			ArrayList<String> argumentList = new ArrayList<String>();
			argumentList.add(javaVMExec);
			argumentList.add("-jar");
			argumentList.add(jarFile);
			argumentList.add("-file");
			argumentList.add(paramsFile);
			argumentList.add("-p");
			argumentList.add("evalthreads=" + evaluationThreads);
			argumentList.add("-p");
			argumentList.add("breedthreads=" + breedingThreads);
			argumentList.add("-p");
			argumentList.add("generations=" + generations);
			argumentList.add("-p");
			argumentList.add("individuals=" + individuals);
			argumentList.add("-p");
			argumentList.add("eval.problem.rmof.bestModelPath=" + bestModelPath.replace('\\', '/'));
			argumentList.add("-p");
			argumentList.add("eval.problem.rmof.bestIndividuum=" + bestIndividuumPath.replace('\\', '/'));
//			argumentList.add("-p");
//			argumentList.add("eval.problem.rmof.compiledClasspath=".concat(compiledClassPath.replace('\\', '/')));

			analysisLog = YAMMLogger.getYAMMLogger(analysisName);
			analysisLog.info("", false, false, true);
			if (argumentList.size() > 0)
			{
				analysisLog.info("Core parameters : " + argumentList.get(0) + " ", true, true, false);
				for (int i=1; i<argumentList.size(); i++)
					analysisLog.info(argumentList.get(i) + " ", false, false, false);
				analysisLog.info("", false, false, true);
			}
			
			ServerSocketChannel serverSocketChannel = getServerSocketChannel(networkPort);
			if (serverSocketChannel != null) {
				analysisLog.info("Server is listening on port : " + serverSocketChannel.socket().getLocalPort());
				argumentList.add("-p");
				argumentList.add("communication.port=".concat(((Integer) serverSocketChannel.socket().getLocalPort()).toString()));
			} else {
				analysisLog.error("Could not find any free port to communicate with the analysis core!");
			}

			for (Object environmentKey : YAMMThread.environment.keySet()) {
				if (environmentKey instanceof String) {
					String environmentKeyString = (String) environmentKey;
					Object value = YAMMThread.environment.get(environmentKey);
					if (value != null && value instanceof String) {
						argumentList.add("-p");
						argumentList.add(environmentKeyString.concat("=").concat(((String) value).replace('\\', '/')));
					}
				}
			}

////			Task analysisTask = MainTasks.executingAnalysis.addChildTask(analysisName);
//			analysisTask.setTaskAttribute("Generation", "0/".concat(generations));
//			analysisTask.setTaskAttribute("Individuals", individuals);
//			analysisTask.setTaskAttribute("BreedingThreads", breedingThreads);
//			analysisTask.setTaskAttribute("EvaluationThreads", evaluationThreads);
//			analysisTask.setTaskAttribute("Best Model Storage Path", bestModelPath);
//			analysisTask.setTaskAttribute("Best Individuum Storage Path", bestIndividuumPath);
//			analysisTask.setTaskAttribute("Mean Fitness", "not computed yet");
			existingRMOFAnalysisLogger.add(analysisName);
			
			String[] argsForCalling = argumentList.toArray(new String[argumentList.size()]); 
			Runtime runtime = Runtime.getRuntime();
			try {
				Process process = runtime.exec(argsForCalling);
				InputStream inputstream = process.getInputStream();
				InputStreamReader inputstreamreader = new InputStreamReader(inputstream);
				BufferedReader bufferedReader = new BufferedReader(inputstreamreader);
				String line;
				monitor.setTaskName("Parameterfile: ".concat(analysisName));
				monitor.beginTask("Analysis : ".concat(analysisName), Integer.parseInt(generations));
				SocketChannel clientSocket = null;
				boolean clientConnected = false;
				boolean sendMessage = false;
				while ((line = bufferedReader.readLine()) != null) {
					if (serverSocketChannel != null) {
						if (!clientConnected) {
							clientSocket = serverSocketChannel.accept();
							if (clientSocket != null) {
								analysisLog.info("Client connection on port " 
										+ ((Integer) serverSocketChannel.socket().getLocalPort()).toString() + " established.");
								clientConnected = true;
							}
						} else if (clientConnected && sendMessage) {
							ByteBuffer buf = ByteBuffer.allocateDirect(1024); 
							buf.put((byte)0xFF); 
							// Prepare the buffer for reading by the socket 
							buf.flip();
							try {
								clientSocket.write(buf); 
								sendMessage = false;
							} catch (NotYetConnectedException e) {
								clientSocket.close();
							} catch (IOException e) {
								clientSocket.close();
							}
						}
					}

					if (line.contains("ERROR")) 
						analysisLog.error(line);
					else
						analysisLog.info(line);
								
					if (line.contains("Generation ")) {
						Integer generation = null;
						try {
							generation = Integer.parseInt(line.substring("Generation ".length(), line.length()));
//							analysisTask.setTaskAttribute("Generation", ((Integer) (generation+1)).toString().concat("/").concat(generations));
//							analysisTask.setPercentageDone(((Integer) (generation+1)).floatValue()/generationsInteger.floatValue()*100);
						} catch (NumberFormatException ne) {
							//logger.error("Could not parse Generation Number!");
						}
						if (generation != null) {
							monitor.worked(1);
//							if (!MainTasks.executingAnalysis.hasChildTask(analysisName)) {
//								//process.destroy();
//								sendMessage = true;
//							}
						}
					} else if (line.contains("Mean Fitness")) {
						int start = line.indexOf("Adjusted: ") + 10;
						int end = line.indexOf("Hits:");
//						if (start > 0 && end > 0) {
//							analysisTask.setTaskAttribute("Mean Fitness", line.substring(start, end));
//						}
					}
				}

//				if (MainTasks.executingAnalysis.hasChildTask(analysisName)) 
//					MainTasks.executingAnalysis.removeChildTask(analysisName);
				
				existingRMOFAnalysisLogger.remove(analysisName);
				// check for failure
				// normal exit process.waitFor() == 0 
	
//				if (analysisTask != null) 
//					MainTasks.executedAnalysis.addChildTask(analysisTask);
				
				if (serverSocketChannel != null) 
					serverSocketChannel.close();
				
				if (clientSocket != null) 
					clientSocket.close();
				
			} catch (IOException e) {
				e.printStackTrace();
				logger.error("IOException during subprocess call!");
			}
		}
	}

	public static void setAnalysisMonitorProgress(int value) {
		if (Activator.getDefault() != null) {
			analysisMonitor.worked(value);
		}
	}

	String tryToParseInteger(String somePotentialNumber) {
		Integer someNumber = null;
		try {
			someNumber = Integer.parseInt(somePotentialNumber);
		} catch (NumberFormatException e){
			somePotentialNumber = "1";
		}
		if (someNumber != null && someNumber < 1) {
			somePotentialNumber = "1";
		}
		return somePotentialNumber;
	}

	Integer tryToParseIntegerToInteger(String somePotentialNumber) {
		Integer someNumber = 1;
		try {
			someNumber = Integer.parseInt(somePotentialNumber);
		} catch (NumberFormatException e){
			somePotentialNumber = "1";
		}
		if (someNumber != null && someNumber < 1) {
			somePotentialNumber = "1";
		}
		return someNumber;
	}


//	/**
//	 * Throws an exception with a new status containing the given
//	 * message and optional exception.
//	 * 
//	 * @param message error message
//	 * @param e underlying exception
//	 * @throws CoreException
//	 */
//	@SuppressWarnings({ "unused", "deprecation" })
//	private void abort(String message, Throwable e) throws CoreException {
//		throw new CoreException(new Status(IStatus.ERROR, dev.yamm.debug.model.DebugCorePlugin.getDefault().getDescriptor().getUniqueIdentifier(), 0, message, e));
//	}

	/**
	 * Returns a free port number on localhost, or -1 if unable to find a free port.
	 * 
	 * @return a free port number on localhost, or -1 if unable to find a free port
	 */
	public static ServerSocketChannel getServerSocketChannel(int portNumber) {
		ServerSocketChannel serverSocketChannel = null;
		try {
			serverSocketChannel = ServerSocketChannel.open();
			serverSocketChannel.configureBlocking(false);
			serverSocketChannel.socket().bind(new InetSocketAddress(portNumber));
			return serverSocketChannel;
		} catch (IOException e) { 
			if (serverSocketChannel != null) {
				try {
					// try to bind ANY free port
					serverSocketChannel.socket().bind(null);
					if (analysisLog != null) {
						analysisLog.info("Could not bind " + portNumber + " for network communication ... switched to " + serverSocketChannel.socket().getLocalPort() + "."); 
					}
					return serverSocketChannel;
				} catch (IOException e1) {
					try {
						serverSocketChannel.close();						
					} catch (IOException e2) {
						e2.printStackTrace();
						serverSocketChannel = null;
					}
					
				}
			}
		}
		return null;		
	}	

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.LaunchConfigurationDelegate#buildForLaunch(org.eclipse.debug.core.ILaunchConfiguration, java.lang.String, org.eclipse.core.runtime.IProgressMonitor)
	 */
	public boolean buildForLaunch(ILaunchConfiguration configuration, String mode, IProgressMonitor monitor) throws CoreException {
		return false;
	}	

}
