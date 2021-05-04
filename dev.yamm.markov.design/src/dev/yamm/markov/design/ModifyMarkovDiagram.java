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
package dev.yamm.markov.design;

import java.util.HashMap;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.diagram.ui.tools.api.editor.DDiagramEditor;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;

import dev.yamm.ObjectManagement;
import dev.yamm.gui.Layer;
import dev.yamm.markov.markov.Diagram;
import dev.yamm.markov.markov.RObject;
import dev.yamm.markov.markov.State;
import dev.yamm.markov.markov.Transition;

public class ModifyMarkovDiagram
{

	EditorDDiagramPair diagram = null;
	ObjectManagement om = null;
	Session session = null;

	private HashMap<String, Colorable> allTransitionEditParts = new HashMap<>();

	private HashMap<String, Colorable> allStateEditParts = new HashMap<>();

	public ModifyMarkovDiagram(Object objectManagement)
	{
		om = ((ObjectManagement) objectManagement);
	}

	public void color(String objectID)
	{
		Display.getDefault().syncExec(new Runnable()
		{
			public void run()
			{
				Color myColor = new Color(null, 0, 255, 0);

				DDiagramEditor editor = getMarkovDiagramEditor();

				fillTransitionAndStateEditParts(editor);

				if (allTransitionEditParts.containsKey(objectID))
				{
					allTransitionEditParts.get(objectID).setColor(myColor);
					allTransitionEditParts.get(objectID).refresh();
				}
				else if (allStateEditParts.containsKey(objectID))
				{
					allStateEditParts.get(objectID).setColor(myColor);
					allStateEditParts.get(objectID).refresh();
				}
			}
		});
	}

	public void deColor(String objectID)
	{

	}

	private DDiagramEditor getMarkovDiagramEditor()
	{

		if (diagram != null)
		{
			Session session = diagram.editor.getSession();
			DialectUIManager.INSTANCE.openEditor(session, diagram.dSemanticDiagram, new NullProgressMonitor());
			return diagram.editor;
		}
		else
		{
			Layer layer = om.getViewLayers().get(0);
			URI resourceURI = URI.createPlatformResourceURI(layer.getPath().replace("__TMP__.xyamm", ".yammdiagram"));
			for (Session sess : SessionManager.INSTANCE.getSessions())
			{
				for (Resource resource : sess.getSemanticResources())
				{
					if (resourceURI.equals(resource.getURI()))
					{
						session = sess;
					}
				}
			}

			if (session == null)
			{
				return null;
			}

			Resource sessionRes = session.getSessionResource();
			EList<EObject> content = sessionRes.getContents();
			for (int i = 1; i < content.size(); i++)
			{
				DSemanticDiagram diagram = null;
				if (content.get(i) instanceof DSemanticDiagram)
					diagram = (DSemanticDiagram) content.get(i);
				else // not a diagram, maybe a Table
					continue;
				if (!(diagram.getTarget() instanceof RObject))
					continue;
				RObject root = (RObject) diagram.getTarget();
				if (!(root instanceof Diagram))
					continue; // it's a classdiagram
				if (root.eResource() == null)
					continue; // a statemachine diagram which statemachine is deleted(in the classdiagram)
				String objectIdOfRoot = root.getObjectID();

				DDiagramEditor editor = (DDiagramEditor) DialectUIManager.INSTANCE.openEditor(session, diagram,
						new NullProgressMonitor());
				EditorDDiagramPair editorPair = new EditorDDiagramPair();
				editorPair.dSemanticDiagram = diagram;
				editorPair.editor = editor;
				this.diagram = editorPair;

				return editor;

			}
			// TODO: Eigenen Logger einbauen
			return null;
		}

	}

	private void fillTransitionAndStateEditParts(DDiagramEditor yammDiagramEditor)
	{
		if (allStateEditParts.isEmpty() && allTransitionEditParts.isEmpty())
		{

			for (Object editPart : ((DiagramEditor) yammDiagramEditor).getDiagramEditPart().getPrimaryEditParts())
			{
				if (editPart instanceof Colorable)
				{
					View view = (View) ((EditPart) editPart).getModel();
					RObject semanticElement = null;
					String id = null;
					if (view.getElement() instanceof DSemanticDecorator)
					{
						semanticElement = (RObject) ((DSemanticDecorator) view.getElement()).getTarget();
						id = semanticElement.getObjectID();
					}
					else
						continue;

					if (semanticElement instanceof State)
					{
						allStateEditParts.put(id, (Colorable) editPart);
					}

					else if (semanticElement instanceof Transition)
					{
						allTransitionEditParts.put(id, (Colorable) editPart);
					}
				}
			}
		}
	}

	class EditorDDiagramPair
	{
		public DSemanticDiagram dSemanticDiagram;
		public DDiagramEditor editor;
	}
}
