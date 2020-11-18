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
package online.yamm.coreModel.design.policies;

import java.beans.PropertyChangeListener;

import org.eclipse.draw2d.FigureListener;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.KeyEvent;
import org.eclipse.draw2d.KeyListener;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.requests.DirectEditRequest;
import org.eclipse.gef.tools.DirectEditManager;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.LabelDirectEditPolicy;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ICellEditorListener;

import online.yamm.coreModel.design.editParts.TrAttachmentDNodeListElementEditPart;

public class EffectEditPolicy extends LabelDirectEditPolicy
{
	@Override
	protected void showCurrentEditValue(DirectEditRequest request)
	{

		CellEditor cellEditor = request.getCellEditor();

//		DirectEditManager manager = ((TrAttachmentDNodeListElementEditPart) getHost()).getEditManager();

		IFigure figure = ((GraphicalEditPart) getHost()).getFigure();
		figure.addFigureListener(new FigureListener()
		{
			
			@Override
			public void figureMoved(IFigure source)
			{
//				System.out.println();
				
			}
		});
		figure.addKeyListener(new KeyListener()
		{
			
			@Override
			public void keyReleased(KeyEvent ke)
			{
//				System.out.println();
			}
			
			@Override
			public void keyPressed(KeyEvent ke)
			{
//				System.out.println();
			}
		});
		
		figure.addPropertyChangeListener(new PropertyChangeListener()
		{
			
			@Override
			public void propertyChange(java.beans.PropertyChangeEvent evt)
			{
//				System.out.println();
			}
		});
		
		
		cellEditor.addPropertyChangeListener(new IPropertyChangeListener()
		{

			@Override
			public void propertyChange(PropertyChangeEvent event)
			{
//				System.out.println(cellEditor.getValue());
			}
		});

		cellEditor.addListener(new ICellEditorListener()
		{

			@Override
			public void editorValueChanged(boolean oldValidState, boolean newValidState)
			{
//				System.out.println();
			}

			@Override
			public void cancelEditor()
			{
//				System.out.println();
			}

			@Override
			public void applyEditorValue()
			{
//				System.out.println();
			}
		});

		String value = (String) request.getCellEditor().getValue();
		((ITextAwareEditPart) getHost()).setLabelText(value);
	}
}
