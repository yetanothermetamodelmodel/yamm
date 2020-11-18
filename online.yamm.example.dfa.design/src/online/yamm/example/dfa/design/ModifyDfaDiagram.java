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
package online.yamm.example.dfa.design;

import java.util.HashMap;
import java.util.Map;

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

import online.yamm.ObjectManagement;
import online.yamm.example.dfa.design.editParts.Colorable;
import online.yamm.example.dfa.design.editParts.StateNodeEditPart;
import online.yamm.example.dfa.design.editParts.TransitionEdgeEditPart;
import online.yamm.example.dfa.dfa.DFA;
import online.yamm.example.dfa.dfa.DState;
import online.yamm.example.dfa.dfa.DTransition;
import online.yamm.example.dfa.dfa.RObject;
import online.yamm.gui.Layer;

public class ModifyDfaDiagram
{

	EditorDDiagramPair diagram = null;
	ObjectManagement om = null;
	Session session = null;
	
	Map<String, Color> colorPool = new HashMap<String, Color>();

	private Map<String, Colorable> editParts = new HashMap<String, Colorable>();

	public ModifyDfaDiagram(Object objectManagement)
	{
		om = ((ObjectManagement) objectManagement);
	}

	public void clear()
	{
		Display.getDefault().syncExec(new Runnable()
		{
			public void run()
			{
				DDiagramEditor editor = getDfaDiagramEditor();

				laodEditParts(editor);

				for (Colorable part : editParts.values())
				{
					part.deColor();
					part.refresh();
				}
			}
		});
	}
	
	public void color(String objectID, String colorRGB)
	{
		Display.getDefault().syncExec(new Runnable()
		{
			public void run()
			{
				Color color;
				if (colorPool.containsKey(colorRGB))
					color = colorPool.get(colorRGB);
				else
				{
					color = new Color(null
							, Integer.parseInt(colorRGB.substring(0, 3))
							, Integer.parseInt(colorRGB.substring(3, 6))
							, Integer.parseInt(colorRGB.substring(6, 9)));
					colorPool.put(colorRGB, color);
				}

				DDiagramEditor editor = getDfaDiagramEditor();

				laodEditParts(editor);

				if (editParts.containsKey(objectID))
				{
					editParts.get(objectID).setColor(color);
					editParts.get(objectID).refresh();
				}
			}
		});
	}

	public void decolor(String objectID)
	{
		Display.getDefault().syncExec(new Runnable()
		{
			public void run()
			{
				DDiagramEditor editor = getDfaDiagramEditor();

				laodEditParts(editor);

				if (editParts.containsKey(objectID))
				{
					editParts.get(objectID).deColor();
					editParts.get(objectID).refresh();
				}
			}
		});	
	}
	
	private DDiagramEditor getDfaDiagramEditor()
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
				else
					continue;
				if (!(diagram.getTarget() instanceof RObject))
					continue;
				RObject root = (RObject) diagram.getTarget();
				if (!(root instanceof DFA))
					continue;
				if (root.eResource() == null)
					continue;
				String objectIdOfRoot = root.getObjectID();

				DDiagramEditor editor = (DDiagramEditor) DialectUIManager.INSTANCE.openEditor(session, diagram,
						new NullProgressMonitor());
				EditorDDiagramPair editorPair = new EditorDDiagramPair();
				editorPair.dSemanticDiagram = diagram;
				editorPair.editor = editor;
				this.diagram = editorPair;

				return editor;

			}
			return null;
		}

	}

	private void laodEditParts(DDiagramEditor dfaDiagramEditor)
	{
		if (editParts.isEmpty())
		{
			for (Object editPart : ((DiagramEditor) dfaDiagramEditor).getDiagramEditPart().getPrimaryEditParts()) 
			{
				View view = (View) ((EditPart) editPart).getModel();
				if (!(view.getElement() instanceof DSemanticDecorator))
					continue;

				RObject semanticElement = (RObject) ((DSemanticDecorator) view.getElement()).getTarget();
				String id = semanticElement.getObjectID();

				if (semanticElement instanceof DState && editPart instanceof StateNodeEditPart
						|| semanticElement instanceof DTransition && editPart instanceof TransitionEdgeEditPart)
					editParts.put(id, (Colorable) editPart);
			}
		}
	}

	class EditorDDiagramPair
	{
		public DSemanticDiagram dSemanticDiagram;
		public DDiagramEditor editor;
	}
}
