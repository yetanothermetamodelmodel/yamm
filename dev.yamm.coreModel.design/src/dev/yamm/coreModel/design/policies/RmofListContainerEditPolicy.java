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
package dev.yamm.coreModel.design.policies;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gef.requests.CreateConnectionRequest;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableEditPolicyEx;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.emf.commands.core.commands.RepositionEObjectCommand;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.DDiagramElementContainer;
import org.eclipse.sirius.diagram.description.tool.ContainerCreationDescription;
import org.eclipse.sirius.diagram.description.tool.impl.EdgeCreationDescriptionImpl;
import org.eclipse.sirius.diagram.description.tool.impl.NodeCreationDescriptionImpl;

import dev.yamm.coreModel.design.RmofDiagramHelper;
import dev.yamm.coreModel.design.commands.CompartmentRepositionEObjectCommand;
import dev.yamm.coreModelDiagram.yammDiagram.YClass;
import dev.yamm.coreModelDiagram.yammDiagram.YEffect;
import dev.yamm.coreModelDiagram.yammDiagram.YObject;
import dev.yamm.coreModelDiagram.yammDiagram.YOperation;
import dev.yamm.coreModelDiagram.yammDiagram.YParameter;
import dev.yamm.coreModelDiagram.yammDiagram.YProperty;
import dev.yamm.coreModelDiagram.yammDiagram.YTrAttachment;


/**
 * 
 * EditPolicy for reordering and creating of Properties, Parameters and Effects in list container.
 *
 *  VSM: in the begin element of the creation-Tool specification for Property, Parameter and Effect:
 * 		 - Create the domain-element with the "CreateInstance" model-operation
 * 			--> the element will be created at the end of the list
 * 		 - invoke a service which gets the static index attribute of this class
 * 		   and moves the element at this index:
 * 					public EObject insertEffect(Effect effect) {
 * 						TrAttachment attachment = (TrAttachment)effect.eContainer();
 * 						attachment.getEffects().move(RmofListContainerEditPolicy.index, effect);
 *						return effect; 		
 *					}
 *				(the creation and the call of the service is executed in one transaction -> undoable in a single step)
 *
 */
public class RmofListContainerEditPolicy
extends org.eclipse.gef.editpolicies.FlowLayoutEditPolicy
{

	public static int index = 0;
	private EStructuralFeature feature = null;
	private boolean targetFeedbackActive = false;

	protected int getFeedbackIndexFor(Request request) 
	{
		index = super.getFeedbackIndexFor(request);
		return index;
	}

	protected void showLayoutTargetFeedback(Request request)
	{
		targetFeedbackActive = true;
		super.showLayoutTargetFeedback(request);
	}

	protected void eraseLayoutTargetFeedback(Request request) 
	{
		targetFeedbackActive = false;
		super.eraseLayoutTargetFeedback(request);
	}

	protected Command createAddCommand(EditPart child, EditPart after) 
	{
		return null;
	}

	protected EditPolicy createChildEditPolicy(EditPart child) 
	{
		ResizableEditPolicyEx policy = new ResizableEditPolicyEx() 
		{		
			@Override
			public EditPart getTargetEditPart(Request request) 
			{
				if (request instanceof CreateRequest)
				{
					Object newObject = ((CreateRequest)request).getNewObject();
					if (newObject instanceof NodeCreationDescriptionImpl)
					{
						String name = ((NodeCreationDescriptionImpl)newObject).getName();
						YObject semanticElement = RmofDiagramHelper.getDomainElementFromEditPolicy(this);
						if ("createEffect".equals(name) && semanticElement instanceof YEffect)
						{
							return this.getHost().getParent();
						}
						if ("createProperty".equals(name) && semanticElement instanceof YProperty)
						{
							return  this.getHost().getParent();
						}
						if ("createParameter".equals(name) && semanticElement instanceof YParameter)
						{
							return  this.getHost().getParent();
						}
						
					}
					if (newObject instanceof ContainerCreationDescription)
					{
						String name = ((ContainerCreationDescription)newObject).getName();
						YObject semanticElement = RmofDiagramHelper.getDomainElementFromEditPolicy(this);
						if ("createOperation".equals(name) && semanticElement instanceof YParameter)
						{
							return  this.getHost().getParent().getParent().getParent().getParent();
						}
						if ("createOperation".equals(name) && semanticElement instanceof YProperty)
						{
							return  this.getHost().getParent().getParent().getParent().getParent();
						}
					}
				}
				if (RequestConstants.REQ_MOVE.equals(request.getType()))
				{
					return this.getHost().getParent();
				}
				if (request instanceof CreateConnectionRequest)
				{
					Object newObject = ((CreateConnectionRequest)request).getNewObject();
					if (newObject instanceof EdgeCreationDescriptionImpl)
					{
						String name = ((EdgeCreationDescriptionImpl) newObject).getName();
						if ("createGeneralization".equals(name) || "createAssociationEdge".equals(name))
						{
							return this.getHost().getParent().getParent().getParent().getParent();
						}
					}
				}
				return super.getTargetEditPart(request);
			}

		};
		policy.setResizeDirections(0);
		return policy;
	}

	protected Command createMoveChildCommand(EditPart child, EditPart after) 
	{		
		if (targetFeedbackActive)
		{
			int newIndex;
			int displacement;

			int childIndex = getHost().getChildren().indexOf(child);
			int	afterIndex = getHost().getChildren().indexOf(after);	

			if(afterIndex == -1) {
				newIndex = getHost().getChildren().size()-1;			
				displacement = newIndex - childIndex;
			} else {		
				newIndex = afterIndex;
				displacement = afterIndex - childIndex;
				if (childIndex <= afterIndex) {
					newIndex--;
					displacement--;			
				}
			}

			TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();

			View gmfConainer = (View) child.getParent().getModel();
			DDiagramElementContainer siriusContainer = (DDiagramElementContainer) gmfConainer.getElement();
			YObject rmofContainer = (YObject) siriusContainer.getTarget();

			View gmfListElement = (View) child.getModel();
			DDiagramElement siriusListElement = (DDiagramElement) gmfListElement.getElement();
			YObject rmofListElement = (YObject) siriusListElement.getTarget();

			RepositionEObjectCommand command = new CompartmentRepositionEObjectCommand(child, editingDomain, "", 
					(EList)rmofContainer.eGet(feature), 
					rmofListElement, 
					displacement, newIndex);	

			return new ICommandProxy(command);
		}
		else
		{
			return null;
		}
	}

	protected Command getCreateCommand(CreateRequest request) {
		return null;
	}

	protected Command getDeleteDependantCommand(Request request) {
		return null;
	}

	protected Command getOrphanChildrenCommand(Request request) {
		return null;
	}

	/**
	 * @param feature has to be an EList
	 */
	public RmofListContainerEditPolicy(EStructuralFeature feature) {
		super();
		this.feature = feature;
	}

	@Override
	public void eraseTargetFeedback(Request request) {
		super.eraseTargetFeedback(request);
		if (RequestConstants.REQ_DROP.equals(request.getType()))
		{
			eraseLayoutTargetFeedback(request);
		}
	}

	public void showTargetFeedback(Request request) 
	{
		if (request instanceof CreateRequest)
		{
			Object newObject = ((CreateRequest)request).getNewObject();
			if (newObject instanceof NodeCreationDescriptionImpl)
			{
				String name = ((NodeCreationDescriptionImpl)newObject).getName();
				YObject semanticElement = RmofDiagramHelper.getDomainElementFromEditPolicy(this);
				if ("createEffect".equals(name) && semanticElement instanceof YTrAttachment)
				{
					super.showTargetFeedback(request);
				}
				if ("createProperty".equals(name) && semanticElement instanceof YClass)
				{
					super.showTargetFeedback(request);
				}
				if ("createParameter".equals(name) && semanticElement instanceof YOperation)
				{
					super.showTargetFeedback(request);
				}
			}
		}

		if (RequestConstants.REQ_MOVE.equals(request.getType()))
		{
			if (request instanceof ChangeBoundsRequest)
			{
				List<EditPart> childrenEditParts = this.getHost().getChildren();
				if(childrenEditParts.contains(((ChangeBoundsRequest)request).getEditParts().get(0)))
				{
					super.showTargetFeedback(request);
				}
			}
		}
	}
}
