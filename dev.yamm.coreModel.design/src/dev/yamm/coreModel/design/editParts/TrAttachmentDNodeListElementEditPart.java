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
package dev.yamm.coreModel.design.editParts;

import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.tools.DirectEditManager;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DNodeListElementEditPart;
import org.eclipse.sirius.diagram.ui.tools.api.requests.RequestConstants;
import org.eclipse.swt.graphics.Color;


public class TrAttachmentDNodeListElementEditPart 
extends DNodeListElementEditPart
{
	YammColorableGuardAndEffect parentWithColorInformation;
	
	public TrAttachmentDNodeListElementEditPart(View view, YammColorableGuardAndEffect parentWithColorInformation) 
	{
		super(view);
		this.parentWithColorInformation = parentWithColorInformation;
	}
	
	@Override
    protected void setLabelTextHelper(final IFigure figure, final String text) {
		super.setLabelTextHelper(figure, text);
	}

    
    /**
     * @was-generated
     */
    protected void performDirectEdit() {
		super.performDirectEdit();
    }
    
    @Override
    public void performRequest(final Request request) {
        if (RequestConstants.REQ_DIRECT_EDIT.equals(request.getType())) {
        	DirectEditManager editManager = getManager();
        } 
        super.performRequest(request);
    }
	@Override
	protected void refreshVisuals() 
	{
		super.refreshVisuals();
		Color colorEffect = null;
		int indexOFThisEffect = 0;
		List<EditPart> allEffectEditParts = getParent().getChildren();
		for (;indexOFThisEffect < allEffectEditParts.size(); indexOFThisEffect++)
		{
			if (allEffectEditParts.get(indexOFThisEffect) == this)
				break;
		}
		if ((colorEffect = parentWithColorInformation.getColorColoredEffects(indexOFThisEffect)) != null)
		{
			getFigure().setForegroundColor(colorEffect);
		}
	}
	
}