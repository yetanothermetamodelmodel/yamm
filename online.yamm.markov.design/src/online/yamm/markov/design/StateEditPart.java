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
package online.yamm.markov.design;

import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DNodeContainerEditPart;
import org.eclipse.sirius.diagram.ui.tools.api.figure.GradientRoundedRectangle;
import org.eclipse.sirius.ext.gmf.runtime.gef.ui.figures.SiriusDefaultSizeNodeFigure;
import org.eclipse.swt.graphics.Color;

public class StateEditPart extends DNodeContainerEditPart implements Colorable{
	private Color color;

	private Color originalColor;

	public StateEditPart(View view) {
	    super(view);
	}


	public Color getColor()
	{
	    return color;
	}

	@Override
	public void setColor(Color color) {
	    this.color = color;        
	}

	@Override
	public void deColor() {
	    color = null;
	}

	public void refresh() {
	    super.refresh();
	}


	@Override
	protected void refreshVisuals() {
	    super.refreshVisuals();
	    
	    IFigure contentPane = (IFigure) getFigure();
	    List<IFigure> figures = contentPane.getChildren();
	    GradientRoundedRectangle roundedRectangle =
	            ((GradientRoundedRectangle) ((SiriusDefaultSizeNodeFigure) figures.get(0)).getChildren().get(0));
	    
	    if (getColor() != null)
	    {
	        if (originalColor == null)
	            originalColor = roundedRectangle.getForegroundColor();
	        roundedRectangle.setLineWidth(4);
	        roundedRectangle.setForegroundColor(color);
	    } else {
	        if (originalColor != null)
	            roundedRectangle.setForegroundColor(originalColor);
	    }
	}

	}
