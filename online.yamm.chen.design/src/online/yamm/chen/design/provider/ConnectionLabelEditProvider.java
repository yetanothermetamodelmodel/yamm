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
package online.yamm.chen.design.provider;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.LabelDirectEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.services.editpart.AbstractEditPartProvider;
import org.eclipse.gmf.runtime.diagram.ui.services.editpart.CreateGraphicEditPartOperation;
import org.eclipse.gmf.runtime.diagram.ui.services.editpart.IEditPartOperation;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.diagram.DEdge;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DEdgeBeginNameEditPart;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DEdgeEndNameEditPart;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DEdgeNameEditPart;
import org.eclipse.sirius.diagram.ui.part.SiriusVisualIDRegistry;
import org.eclipse.sirius.diagram.ui.tools.api.command.GMFCommandWrapper;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;

import online.yamm.chen.chen.Attribute;
import online.yamm.chen.chen.Connection;
import online.yamm.chen.chen.Relationship;

public class ConnectionLabelEditProvider  extends AbstractEditPartProvider 
{

	class BiAssociationDirectEditForBeginRole extends LabelDirectEditPolicy {

		@Override
		protected org.eclipse.gef.commands.Command getDirectEditCommand(org.eclipse.gef.requests.DirectEditRequest edit) 
		{
			final EObject element = ((org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart)getHost())
					.resolveSemanticElement();
			final TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(element);
			final String labelText = (String)edit.getCellEditor().getValue();
			final RecordingCommand cmd = new RecordingCommand(domain) {

				@Override
				protected void doExecute() {
					Connection connection = (Connection) ((DEdge) element).getTarget();
					connection.setKardinality(labelText);
				}
			};
			return new ICommandProxy(new GMFCommandWrapper(domain, cmd));

		}

	}

	class BiAssociationDirectEditForEndRole extends LabelDirectEditPolicy {

		@Override
		protected org.eclipse.gef.commands.Command getDirectEditCommand(
				org.eclipse.gef.requests.DirectEditRequest edit) {
			final EObject element = ((org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart)getHost())
					.resolveSemanticElement();
			final TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(element);
			final String labelText = (String)edit.getCellEditor().getValue();
			final RecordingCommand cmd = new RecordingCommand(domain) {

				@Override
				protected void doExecute() {
					Connection connection = (Connection) ((DEdge) element).getTarget();
					connection.setKardinality(labelText);
				}
			};
			return new ICommandProxy(new GMFCommandWrapper(domain, cmd));

		}

	}

	class BiAssociationDirectEditForLabel extends LabelDirectEditPolicy {

		@Override
		protected org.eclipse.gef.commands.Command getDirectEditCommand(
				org.eclipse.gef.requests.DirectEditRequest edit) {
			final EObject element = ((org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart)getHost())
					.resolveSemanticElement();
			final TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(element);
			final String labelText = (String)edit.getCellEditor().getValue();
			final RecordingCommand cmd = new RecordingCommand(domain) {

				@Override
				protected void doExecute() {
					Connection connection = (Connection) ((DEdge) element).getTarget();
					connection.setRole(labelText);
				}
			};
			return new ICommandProxy(new GMFCommandWrapper(domain, cmd));

		}
	}
	
	
	@Override
	public synchronized IGraphicalEditPart createGraphicEditPart(View view) {
		switch (SiriusVisualIDRegistry.getVisualID(view)) {

			case DEdgeBeginNameEditPart.VISUAL_ID:
				final DEdgeBeginNameEditPart dEdgeBeginPart = new DEdgeBeginNameEditPart(view) {

					@Override
					protected boolean isDirectEditEnabled() {
						return true;
					}

				};
				dEdgeBeginPart.installEditPolicy(org.eclipse.gef.RequestConstants.REQ_DIRECT_EDIT,
						new BiAssociationDirectEditForBeginRole());
				return dEdgeBeginPart;

			case DEdgeEndNameEditPart.VISUAL_ID:
				final DEdgeEndNameEditPart dEdgeEndPart = new DEdgeEndNameEditPart(view) {
					@Override
					protected boolean isDirectEditEnabled() {
						return true;
					}

				};
				dEdgeEndPart.installEditPolicy(org.eclipse.gef.RequestConstants.REQ_DIRECT_EDIT,
						new BiAssociationDirectEditForEndRole());
				return dEdgeEndPart;

			case DEdgeNameEditPart.VISUAL_ID:
				final DEdgeNameEditPart dEdgePart = new DEdgeNameEditPart(view) {
					@Override
					protected boolean isDirectEditEnabled() {
						return true;
					}

				};
				dEdgePart.installEditPolicy(org.eclipse.gef.RequestConstants.REQ_DIRECT_EDIT,
						new BiAssociationDirectEditForLabel());
				return dEdgePart;
			default:
				break;
		}
		return null;
	}
	
	
	@Override
	public boolean provides(IOperation operation) {
		if (operation instanceof CreateGraphicEditPartOperation) {
			final View view = ((IEditPartOperation)operation).getView();
			if (view.getElement() instanceof DSemanticDecorator) {
				if (((DSemanticDecorator)view.getElement()).getTarget() instanceof Connection) {
					Connection connection = (Connection)((DSemanticDecorator)view.getElement()).getTarget();
					if (!(connection.isGeneralizationConnection() || connection.getSource() instanceof Attribute || connection.getTarget() instanceof Attribute))
					{
						if (connection.getTarget() instanceof Relationship)
						{
							switch (SiriusVisualIDRegistry.getVisualID(view)) {

							case DEdgeBeginNameEditPart.VISUAL_ID:
								return true;

							case DEdgeEndNameEditPart.VISUAL_ID:
								return true;

							case DEdgeNameEditPart.VISUAL_ID:
								return true;
							default:
								break;
							}
						}
						else
						{
							switch (SiriusVisualIDRegistry.getVisualID(view)) {

							case DEdgeBeginNameEditPart.VISUAL_ID:
								return true;

							case DEdgeEndNameEditPart.VISUAL_ID:
								return true;

							case DEdgeNameEditPart.VISUAL_ID:
								return true;
							default:
								break;
							}
						}
						
					}
				}
			}

		}
		return false;
	}
}
