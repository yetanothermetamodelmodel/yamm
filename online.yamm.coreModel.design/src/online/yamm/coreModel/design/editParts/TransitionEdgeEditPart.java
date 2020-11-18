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
package online.yamm.coreModel.design.editParts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.GraphicalFilter;
import org.eclipse.sirius.diagram.ui.edit.api.part.AbstractDiagramEdgeEditPart;
import org.eclipse.sirius.diagram.ui.edit.api.part.AbstractDiagramEdgeEditPart.ViewEdgeFigure;
import org.eclipse.sirius.diagram.ui.edit.internal.part.DiagramEdgeEditPartOperation;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DEdgeEditPart;
import org.eclipse.swt.graphics.Color;

public class TransitionEdgeEditPart extends DEdgeEditPart implements YammColorable
{
	private Color color;

	public TransitionEdgeEditPart(View view) 
	{
		super(view);
	}

	@Override
	public void refreshVisuals() {
		super.refreshVisuals();

		if (color != null)
		{
			ViewEdgeFigure primShape = getPrimaryShape();
			primShape.setForegroundColor(color);
			primShape.setLineWidth(5);
			PolylineDecoration  arrow = (PolylineDecoration)primShape.getTargetDecoration();
			arrow.setLineWidth(5);
		}
	}

	@Override
	public void setColor(Color color) {
		this.color = color;

	}

	@Override
	public void deColor() {
		color = null;
	}

	@Override
	protected Connection createConnectionFigure() {
		return new RmofViewEdgeFigure();
	}

	@Override
	public void refreshTargetDecoration() {
		getPolylineConnectionFigure().setTargetDecoration(new RmofPolylineDecoration());
	}
	
	public class RmofViewEdgeFigure extends ViewEdgeFigure
	{
		@Override
		public void setForegroundColor(Color fg) {
			if (color != null)
			{
				super.setForegroundColor(color);
			}
			else
				super.setForegroundColor(fg);
		}

		@Override
		public void setLineWidth(int w) {
			if (color != null)
			{
				super.setLineWidth(5);
			}
			else	
				super.setLineWidth(w);
		}

	}

	public class RmofPolylineDecoration extends PolylineDecoration
	{
		public RmofPolylineDecoration() {
			setLineWidth(getLineWidth());
		}
		
		@Override
		public void setLineWidth(int w) {
			if (color != null)
			{
				super.setLineWidth(5);
			}
			else	
				super.setLineWidth(w);
		}
	}
}
