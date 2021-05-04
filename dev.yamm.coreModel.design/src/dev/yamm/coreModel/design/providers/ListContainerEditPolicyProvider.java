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

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ListCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.ui.internal.edit.policies.AbstractCreateEditPolicyProvider;

import dev.yamm.coreModel.design.policies.ListContainerRmofOperationCreationEditPolicy;
import dev.yamm.coreModel.design.policies.RmofListContainerEditPolicy;
import dev.yamm.coreModelDiagram.yammDiagram.YClass;
import dev.yamm.coreModelDiagram.yammDiagram.YOperation;
import dev.yamm.coreModelDiagram.yammDiagram.YTrAttachment;
import dev.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage;

public class ListContainerEditPolicyProvider extends AbstractCreateEditPolicyProvider {

	private EStructuralFeature feature;

	@Override
	public void createEditPolicies(EditPart editPart) 
	{	
		editPart.installEditPolicy(EditPolicy.LAYOUT_ROLE, new RmofListContainerEditPolicy(feature));
		editPart.removeEditPolicy(EditPolicyRoles.CREATION_ROLE);
		editPart.installEditPolicy(EditPolicyRoles.CREATION_ROLE, new ListContainerRmofOperationCreationEditPolicy());
	}

	@Override
	protected boolean isValidEditPart(EditPart editPart)
	{		
		if (editPart instanceof ListCompartmentEditPart) 
		{	
			DDiagramElement nodeList = (DDiagramElement)((View)editPart.getModel()).getElement();

			if(nodeList.getTarget() instanceof YTrAttachment) 
			{
				feature = YammDiagramPackage.eINSTANCE.getYTrAttachment_Effects();
				return true;
			}
			else if(nodeList.getTarget() instanceof YOperation)
			{
				feature = YammDiagramPackage.eINSTANCE.getYOperation_OwnedParameter();
				return true;
			}
			else if(nodeList.getTarget() instanceof YClass) 
			{
				feature = YammDiagramPackage.eINSTANCE.getYClass_OwnedAttribute();
				return true;		
			}
		}
		return false;
	}


}

