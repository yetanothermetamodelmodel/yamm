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
/*******************************************************************************
/**
 * Copyright (C) 2019 yamm.online, Ralf Buscherm�hle
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
package online.yamm.debug.breakpoints;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.core.model.LineBreakpoint;

import online.yamm.debug.model.DebugCorePlugin;
import online.yamm.debug.model.YAMMDebugTarget;

/**
 *YAMM line breakpoint - org.eclipse.debug.core.model.ILineBreakpoint is not realized by now!! Instead one can
 * toggle breakpoints in the graphical editor directly.
 */
public class YAMMLineBreakpoint extends LineBreakpoint {
	
	// target currently installed in
	private YAMMDebugTarget fTarget;
	
	/**
	 * Default constructor is required for the breakpoint manager
	 * to re-create persisted breakpoints. After instantiating a breakpoint,
	 * the <code>setMarker(...)</code> method is called to restore
	 * this breakpoint's attributes.
	 */
	public YAMMLineBreakpoint() {
	}
	
	/**
	 * Constructs a line breakpoint on the given resource at the given
	 * line number. The line number is 1-based (i.e. the first line of a
	 * file is line number 1). TheYAMM VM uses 0-based line numbers,
	 * so this line number translation is done at breakpoint install time.
	 * 
	 * @param resource file on which to set the breakpoint
	 * @param lineNumber 1-based line number of the breakpoint
	 * @throws CoreException if unable to create the breakpoint
	 */
	public YAMMLineBreakpoint(final IResource resource, final int lineNumber) throws CoreException {
		IWorkspaceRunnable runnable = new IWorkspaceRunnable() {
			public void run(IProgressMonitor monitor) throws CoreException {
				IMarker marker = resource.createMarker("org.eclipse.debug.examples.core.YAMM.markerType.lineBreakpoint");
				setMarker(marker);
				marker.setAttribute(IBreakpoint.ENABLED, Boolean.TRUE);
				marker.setAttribute(IMarker.LINE_NUMBER, lineNumber);
				marker.setAttribute(IBreakpoint.ID, getModelIdentifier());
				marker.setAttribute(IMarker.MESSAGE, "Line Breakpoint: " + resource.getName() + " [line: " + lineNumber + "]");
			}
		};
		run(getMarkerRule(resource), runnable);
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IBreakpoint#getModelIdentifier()
	 */
	public String getModelIdentifier() {
		return DebugCorePlugin.ID_YAMM_DEBUG_MODEL;
	}
	
	/**
	 * Returns whether this breakpoint is a run-to-line breakpoint
	 * 
	 * @return whether this breakpoint is a run-to-line breakpoint
	 */
	public boolean isRunToLineBreakpoint() {
		return false;
	}
    
    /**
     * Installs this breakpoint in the given interprettor.
     * Registeres this breakpoint as an event listener in the
     * given target and creates the breakpoint specific request.
     * 
     * @param targetYAMM interprettor
     * @throws CoreException if installation fails
     */
    public void install(YAMMDebugTarget target) throws CoreException {
    	fTarget = target;
    	createRequest(target);
    }
    
    /**
     * Create the breakpoint specific request in the target. Subclasses
     * should override.
     * 
     * @param targetYAMM interprettor
     * @throws CoreException if request creation fails
     */
    protected void createRequest(YAMMDebugTarget target) throws CoreException {
    }
    
    /**
     * Removes this breakpoint's event request from the target. Subclasses
     * should override.
     * 
     * @param targetYAMM interprettor
     * @throws CoreException if clearing the request fails
     */
    protected void clearRequest(YAMMDebugTarget target) throws CoreException {
    }
    
    /**
     * Removes this breakpoint from the given interprettor.
     * Removes this breakpoint as an event listener and clears
     * the request for the interprettor.
     * 
     * @param targetYAMM interprettor
     * @throws CoreException if removal fails
     */
    public void remove(YAMMDebugTarget target) throws CoreException {
    	clearRequest(target);
    	fTarget = null;
    	
    }
    
    /**
     * Returns the target this breakpoint is installed in or <code>null</code>.
     * 
     * @return the target this breakpoint is installed in or <code>null</code>
     */
    protected YAMMDebugTarget getDebugTarget() {
    	return fTarget;
    }
    
    /**
     * Notify's theYAMM interprettor that this breakpoint has been hit.
     */
    protected void notifyThread(int threadId) {
    }

	/* (non-Javadoc)
	 * 
	 * Subclasses should override to handle their breakpoint specific event.
	 * 
	 * 
	 */
	public void handleEvent() {
	}
    
	/**
     * Determines if this breakpoint was hit and notifies the thread.
     * 
     * @param event breakpoint event
     */
    private void handleHit() {
    }		
}
