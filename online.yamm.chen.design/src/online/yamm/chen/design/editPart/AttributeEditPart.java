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
package online.yamm.chen.design.editPart;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DNodeEditPart;
import org.eclipse.sirius.diagram.ui.tools.api.figure.SiriusWrapLabel;
import org.eclipse.sirius.diagram.ui.tools.internal.figure.ViewNodeFigure;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;

import online.yamm.chen.chen.Attribute;
import online.yamm.chen.chen.ChenPackage;

public class AttributeEditPart extends  DNodeEditPart  {

	public AttributeEditPart(View view) {
		super(view);
	} 

	@Override
	public void refreshVisuals() {
		super.refreshVisuals();
	}

	@Override
	 protected IFigure createNodeShape() {
        final Figure figure = new ViewNodeFigureCustom();
        return primaryShape = figure;
    }

	class ViewNodeFigureCustom extends ViewNodeFigure {
	    private final SiriusWrapLabel nodeLabelCustom = new SiriusWrapLabel() {
	    	
	    	@Override
	    	public void paintFigure(Graphics graphics) {
	    		super.paintFigure(graphics);

	    		Attribute attribute = (Attribute) ((DSemanticDecorator) ((View) AttributeEditPart.this.getModel()).getElement()).getTarget();
	    		Rectangle rect = this.getTextBounds();
	    		if (attribute.getKey().getValue() == 1)
	    			graphics.drawLine(rect.getBottomLeft(), rect.getBottomRight());
	    		else if (attribute.getKey().getValue() == 2)
	    		{
	    			int leftX = rect.getBottomLeft().x;
	    			int rightX = rect.getBottomRight().x;
	    			int y = rect.getBottomLeft().y;
	    			int x = rect.getBottomLeft().x;
	    			int noDashes = (rightX - leftX) / 3;
	    			for (int i = 0; i < noDashes; i += 2)
	    			{
	    				graphics.drawLine(x + i*3, y, x + (i + 1) * 3, y);
	    			}
	    		}
	    			
	    	}
	    };

		 /**
	     * Create a new figure.
	     */
	    public ViewNodeFigureCustom() {
	        final FlowLayout layoutThis = new FlowLayout();
	        layoutThis.setStretchMinorAxis(false);
	        layoutThis.setMinorAlignment(FlowLayout.ALIGN_TOPLEFT);

	        layoutThis.setMajorAlignment(FlowLayout.ALIGN_TOPLEFT);
	        layoutThis.setMajorSpacing(5);
	        layoutThis.setMinorSpacing(5);
	        layoutThis.setHorizontal(true);

	        this.setLayoutManager(layoutThis);

	        this.setFill(false);
	        this.setOutline(false);
	        this.setLineWidth(0);

	        nodeLabelCustom.setTextWrap(true);
	        nodeLabelCustom.setTextAlignment(PositionConstants.CENTER);
	        nodeLabelCustom.setTextWrapAlignment(PositionConstants.CENTER);
	        nodeLabelCustom.setLabelAlignment(PositionConstants.CENTER);
	        nodeLabelCustom.setForegroundColor(ColorConstants.black);
	    }

	    /**
	     * Return the figure for this node's label.
	     * 
	     * @return the figure for this node's label.
	     */
	    public SiriusWrapLabel getNodeLabel() {
	        return this.nodeLabelCustom;
	    }
	}
}

