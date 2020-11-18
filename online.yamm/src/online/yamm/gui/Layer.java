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
package online.yamm.gui;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;

/**
 * Represents a layer file that can be loaded during a simulation.
 * Contains information about the specific model and the way its simulation
 * has to be done.  
 */
public class Layer {

	/** Path to the model file.*/
	private String path = "";
	
	/** Indicates if a Simulation (begun with the Run button) either stops if a breakpoint() is set
	 *  or if breakpoint() is to be ignored.*/
	private boolean breakpoint = false;
	
	/** The waittime can be set by the user in the Layer View and gives the possibility
	 * to pause a Simulation begun with the Run button.*/
	private long waittime = 0;
	
	/** The layer�s nsURI. Determines the type of the later sourcePackage. 
	 * {@link online.yamm.InitializeLayer#mergePackages(EPackage, EPackage)} */
	private String nsURI = "";
	
	/** Indicates whether the diagram should be colored or not.*/
	private boolean colorLayer = true;
	
	/** Indicates if a message should be printed in the console for this specific layer. */
	private boolean logLayer = true;
	
	/** Indicates the Layer File to run (if more than one layer has been loaded)*/
	private boolean stepWait = false;

	private List<String> extYammLayerPath = new ArrayList<>();

	private String objectDiagramPath;
	/**
	 * constructor.
	 */
	public Layer() {

	}
	
	/**
	 * Constructor.
	 * @param path		the path to the model file.
	 * @param nsURI		the nsURI.
	 */
	public Layer(String path, String nsURI) {
		super();
		this.path = path;
		this.nsURI = nsURI;
	}

	
	/**
	 * Getter for {@code logLayer}.
	 * 
	 * @return {@link #logLayer}
	 */
	public boolean isLogLayer() {
		return logLayer;
		
		
	}
	/**
	 * Setter for {@link #logLayer}.
	 */
	public void setLogLayer(boolean logLayer) {
		this.logLayer = logLayer;
	}
	
	/**
	 * Getter for {@code stepWait}.
	 * 
	 * @return {@link #stepWait}
	 */
	public boolean isStepWait() {
		return stepWait;
	}
	
	
	/**
	 * Setter for {@link #stepWait}.
	 */
	public void setStepWait(boolean stepWait) {
		this.stepWait = stepWait;
	}

	
	/**
	 * Getter for {@code colorLayer}.
	 * 
	 * @return {@link #colorLayer}
	 */
	public boolean getColorLayer() {
		return colorLayer;
	}
	
	
	/**
	 * Setter for {@link #colorLayer}.
	 */
	public void setColorLayer(boolean debugFilter) {
		this.colorLayer = debugFilter;
	}
	
	/**
	 * Getter for {@code path}.
	 * 
	 * @return {@link #path}
	 */
	public String getPath() {
		return path;
	}
	
	/**
	 * Setter for {@link #path}.
	 */
	public void setPath(String path) {
		this.path = path;
	}
	
	/**
	 * Getter for {@code breakpoint}.
	 * 
	 * @return {@link #breakpoint}
	 */
	public boolean isBreakpoint() {
		return breakpoint;
	}
	
	/**
	 * Setter for {@link #breakpoint}.
	 */
	public void setBreakpoint(boolean breakpoint) {
		this.breakpoint = breakpoint;
	}
	
	/**
	 * Getter for {@code waittime}.
	 * 
	 * @return {@link #waittime}
	 */
	public long getWaittime() {
		return waittime;
	}
	
	/**
	 * Setter for {@link #waittime}.
	 */
	public void setWaittime(long waittime) {
		this.waittime = waittime;
	}
	
	/**
	 * Getter for {@code nsURI}.
	 * 
	 * @return {@link #nsURI}
	 */
	public String getNsURI() {
		return nsURI;
	}
	
	/**
	 * Setter for {@link #nsURI}.
	 */
	public void setNsURI(String nsURI) {
		this.nsURI = nsURI;
	}

	public void addExtYammLayerPath(String path) {
		extYammLayerPath.add(path);	
	}

	public String getExtLayerPath(int layer) {
		if (extYammLayerPath.size() > layer)
			return extYammLayerPath.get(layer);
		return null;
	}
	
	public List<String> getExtLayerPaths()
	{
		return extYammLayerPath;
	}

	public void setObjectDiagramPath(String path) {
		objectDiagramPath = path;
		
	}
	
	public String getObjectDiagramPath() {
		return objectDiagramPath;
	}


}
