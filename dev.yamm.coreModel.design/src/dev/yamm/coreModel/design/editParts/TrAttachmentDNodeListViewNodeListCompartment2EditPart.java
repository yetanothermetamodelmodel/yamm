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

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.impl.NodeImpl;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DNodeListViewNodeListCompartment2EditPart;

import dev.yamm.coreModel.design.policies.EffectEditPolicy;

public class TrAttachmentDNodeListViewNodeListCompartment2EditPart extends DNodeListViewNodeListCompartment2EditPart
{
	YammColorableGuardAndEffect parentWithColorInformation;

	public TrAttachmentDNodeListViewNodeListCompartment2EditPart(View view,
			YammColorableGuardAndEffect parentWithColorInformation)
	{
		super(view);
		this.parentWithColorInformation = parentWithColorInformation;
	}

	protected EditPart createChild(Object model)
	{
		if (model instanceof NodeImpl && "3010".equals(((NodeImpl) model).getType()))
		{
			TrAttachmentDNodeListElementEditPart effectEditPart = new TrAttachmentDNodeListElementEditPart((View) model,
					parentWithColorInformation);
			effectEditPart.installEditPolicy(org.eclipse.gef.RequestConstants.REQ_DIRECT_EDIT, new EffectEditPolicy());
			return effectEditPart;
		}
		return getViewer().getEditPartFactory().createEditPart(this, model);
	}
}