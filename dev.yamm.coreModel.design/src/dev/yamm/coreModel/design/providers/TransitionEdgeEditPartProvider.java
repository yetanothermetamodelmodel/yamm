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
package dev.yamm.coreModel.design.providers;

import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.services.editpart.AbstractEditPartProvider;
import org.eclipse.gmf.runtime.diagram.ui.services.editpart.CreateGraphicEditPartOperation;
import org.eclipse.gmf.runtime.diagram.ui.services.editpart.IEditPartOperation;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.diagram.DEdge;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;

import dev.yamm.coreModel.design.editParts.TransitionEdgeEditPart;
import dev.yamm.coreModelDiagram.yammDiagram.YTransition;

public class TransitionEdgeEditPartProvider extends AbstractEditPartProvider
{

	@Override
	public boolean provides(IOperation operation) {
		if (operation instanceof CreateGraphicEditPartOperation) {
			final View view = ((IEditPartOperation)operation).getView();
			Object dElement = view.getElement();
			if (dElement instanceof DEdge)
			{
				if (((DEdge) dElement).getSourceNode() instanceof DEdge)
					return false;
			}
			if (dElement instanceof DSemanticDecorator) {
				Object target = ((DSemanticDecorator)dElement).getTarget();
				if (target instanceof YTransition && view.getType().equals("4001")) {
					return true;
				}
			}
		}
		return false;
	}
	
	@Override
	public IGraphicalEditPart createGraphicEditPart(View view) {
		return new TransitionEdgeEditPart(view);
	}
	
}