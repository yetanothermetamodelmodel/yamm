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
package online.yamm.debug.model;

import org.eclipse.debug.core.model.IStackFrame;
import org.eclipse.debug.core.model.IThread;
import org.eclipse.debug.core.model.IValue;
import org.eclipse.debug.ui.IDebugEditorPresentation;
import org.eclipse.debug.ui.IDebugModelPresentation;
import org.eclipse.debug.ui.IValueDetailListener;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;

public class YAMMDebugModelPresentation implements IDebugModelPresentation, IDebugEditorPresentation {

	@Override
	public void addListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isLabelProperty(Object element, String property) {
		return false;
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getEditorId(IEditorInput arg0, Object arg1) {
		return null;
	}

	@Override
	public IEditorInput getEditorInput(Object arg0) {
		return null;
	}

	@Override
	public void computeDetail(IValue arg0, IValueDetailListener arg1) {
		
	}

	@Override
	public Image getImage(Object element) 
	{
		if (element instanceof YAMMVariable)
		{
			YAMMVariable var = (YAMMVariable) element;
			return var.getIcon();
		}
		return null;
	}

	@Override
	public String getText(Object element) 
	{
		if (element instanceof YAMMThread)
		{
			return getThreadText((YAMMThread)element);
		}
		return null;
	}

	/**
	 * Assigns a name to the specific YAMMThread representation in the Debug View.
	 * 
	 * @param yammThread	:	the current YAMMThread instance
	 * @return threadText	:	the name of the YAMMThread
	 */
	private String getThreadText(YAMMThread yammThread) {
		String threadText = "Thread";
		int threadId = yammThread.getIdentifier();
		
		if (threadId == 0)
			threadText = threadText + " [start]";
		else 
			threadText = threadText + " [Thread-" + threadId + "]";
		return threadText;
	}

	@Override
	public void setAttribute(String arg0, Object arg1) {
	}
//*********************IDebugEditorPresentation
	@Override
	public boolean addAnnotations(IEditorPart arg0, IStackFrame arg1) {
		return true;
	}

	@Override
	public void removeAnnotations(IEditorPart arg0, IThread arg1) {
		// TODO Auto-generated method stub
		
	}



}

