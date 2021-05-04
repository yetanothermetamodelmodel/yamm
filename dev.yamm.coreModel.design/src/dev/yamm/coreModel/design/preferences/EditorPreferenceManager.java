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
package dev.yamm.coreModel.design.preferences;

import java.util.Map;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.resource.StringConverter;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.business.api.session.SessionManagerListener;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.LineStyle;
import org.eclipse.sirius.diagram.description.ContainerMapping;
import org.eclipse.sirius.diagram.description.DiagramDescription;
import org.eclipse.sirius.diagram.ui.tools.api.editor.DDiagramEditor;
import org.eclipse.sirius.diagram.ui.tools.internal.editor.DDiagramEditorImpl;
import org.eclipse.sirius.diagram.ui.tools.internal.part.SiriusDiagramGraphicalViewer;
import org.eclipse.sirius.viewpoint.DAnalysis;
import org.eclipse.sirius.viewpoint.description.ColorDescription;
import org.eclipse.sirius.viewpoint.description.DModelElement;
import org.eclipse.sirius.viewpoint.description.RepresentationDescription;
import org.eclipse.sirius.viewpoint.description.UserFixedColor;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.PlatformUI;

import dev.yamm.coreModel.design.Activator;

public class EditorPreferenceManager 
{

	IPropertyChangeListener preferenceChangeListener;

	SessionManagerListener viewpointSelectedListener;

	public EditorPreferenceManager() 
	{
		preferenceChangeListener = new RmofPreferenceChangeListener();
		viewpointSelectedListener = new ViewpointSelectedListener();	
	}

	public IPropertyChangeListener getPreferenceChangeListener()
	{
		return preferenceChangeListener;
	}

	public SessionManagerListener getViewpointSelectedListener()
	{
		return viewpointSelectedListener;
	}

	private void updateViewpoint(Viewpoint vp)
	{
		if ("rmofCoreViewpoint".equals(vp.getName()))
		{
			for (RepresentationDescription repesentationDescription : vp.getOwnedRepresentations())
			{
				if (repesentationDescription.getName().contains("Statemachine"))
				{
					updateRmofStateMachineDiagramDescription((DiagramDescription)repesentationDescription);
				}
			}
		}
	}
	private void updateRmofStateMachineDiagramDescription(DiagramDescription repDescription)
	{
		for (ContainerMapping containerMapping : repDescription.getContainerMappings())
		{
			if (containerMapping.getDomainClass().contains("TrAttachment"))
			{
				String lineStyleFromPreference = Activator.getActionPreferenceStore().getString("styleTrAttachmentBorder");
				LineStyle newLineStyle = containerMapping.getStyle().getBorderLineStyle();
				if ("DOT".equals(lineStyleFromPreference))
					newLineStyle = LineStyle.DOT_LITERAL;
				else if ("DASH".equals(lineStyleFromPreference))
					newLineStyle = LineStyle.DASH_LITERAL;
				else if ("DASH-DOT".equals(lineStyleFromPreference))
					newLineStyle = LineStyle.DASH_DOT_LITERAL;
				else if ("SOLID".equals(lineStyleFromPreference))
					newLineStyle = LineStyle.SOLID_LITERAL;

				final LineStyle newLineStyleFinal = newLineStyle;


				final RGB borderColor = StringConverter.asRGB(Activator.getActionPreferenceStore().getString("colorTrAttachmentBorder"));
				UserFixedColor colorDescription = org.eclipse.sirius.viewpoint.description.impl.DescriptionFactoryImpl.eINSTANCE.createUserFixedColor();
				colorDescription.setBlue(borderColor.blue);
				colorDescription.setGreen(borderColor.green);
				colorDescription.setRed(borderColor.red);

				final ColorDescription borderColorFinal = colorDescription;

				TransactionalEditingDomain ted = TransactionUtil.getEditingDomain(containerMapping);
				if (ted != null)
				{
					CommandStack stack = ted.getCommandStack();
					RecordingCommand cmd = new RecordingCommand(ted) {
						@Override
						protected void doExecute() {
							containerMapping.getStyle().setBorderLineStyle(newLineStyleFinal);	
							containerMapping.getStyle().setBorderColor(borderColorFinal);
						}
					};
					stack.execute(cmd);
				}
			}
		}
	}

	private void refreshAllOpenEditors()
	{
		for (IEditorReference editorReference : PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getEditorReferences())
		{
			IEditorPart editor = editorReference.getEditor(false);

			if (editor instanceof DDiagramEditor)
			{
				DDiagramEditor dDiagramEditor = (DDiagramEditor)editor;
				DDiagram dDiagram = (DDiagram)dDiagramEditor.getRepresentation();

				TransactionalEditingDomain ted = TransactionUtil.getEditingDomain(dDiagram);
				CommandStack stack = ted.getCommandStack();
				RecordingCommand cmd = new RecordingCommand(ted) {
					@Override
					protected void doExecute() {
						DialectManager.INSTANCE.refresh(dDiagram, new NullProgressMonitor());
					}
				};
				stack.execute(cmd);
			}
		}
	}

	private class RmofPreferenceChangeListener implements IPropertyChangeListener 
	{
		@Override
		public void propertyChange(PropertyChangeEvent event) 
		{	

			if (event.getProperty().equals(PreferenceConstants.EDITOR_BORDERSTYLETRATTACHMENT)
					|| event.getProperty().equals(PreferenceConstants.EDITOR_COLORTRATTACHMENTBORDER))
			{
				for (Session session : SessionManager.INSTANCE.getSessions())
				{
					DAnalysis dAnalysis = (DAnalysis)session.getSessionResource().getContents().get(0);
					for (Object vp : session.getSelectedViewpoints(false))
					{
						updateViewpoint((Viewpoint)vp);
					}				
				}	
				refreshAllOpenEditors();
			}
			if (event.getProperty().equals(PreferenceConstants.EDITOR_STATECORNERRADIUS))
			{
				IEditorReference[] editorReferences = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getEditorReferences();
				for (int index = 0; index < editorReferences.length; index++)
				{
					try
					{
						IEditorReference editorReference = editorReferences[index];
						IEditorPart editor = editorReference.getEditor(false);
						if (editor instanceof DDiagramEditor)
						{
							Diagram diagram = ((DDiagramEditorImpl) editor).getDiagram();
							DDiagram dDiagram = ((DDiagram) diagram.getElement());
							DiagramDescription description = dDiagram.getDescription();

							if (description.getName().contains("Statemachine"))
							{
								SiriusDiagramGraphicalViewer siriusEditor = (SiriusDiagramGraphicalViewer) ((DiagramEditor)editor).getDiagramGraphicalViewer();
								Map editPartRegistry = siriusEditor.getEditPartRegistry();
								for (Object value : editPartRegistry.values())
								{
//									if (value instanceof SquareWithRoundedCornersEditPart)
//									{
//										((EditPart) value).refresh();
//									}
								}
							}
						}
					}
					catch (Exception e)
					{
						e.printStackTrace();
					}
				}
			}

		}
	}


	private class ViewpointSelectedListener extends SessionManagerListener.Stub 
	{
		@Override
		public void viewpointSelected(Viewpoint selectedSirius) {
			updateViewpoint(selectedSirius);
		}		
	}

}
