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
package online.yamm.objDiagram;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.sirius.diagram.business.internal.metamodel.spec.DSemanticDiagramSpec;
import org.eclipse.sirius.ui.business.api.session.SessionEditorInput;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IStartup;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.EditorReference;

import online.yamm.Zerochart;
import online.yamm.ObjectDiagram.ObjectDiagram;
import online.yamm.gui.LayerView;

public class ObjectDiagramManager implements IStartup {

	public static Set<String> openObjectDiagrams = new HashSet<>();

	@Override
	public void earlyStartup() {
		// IWorkbenchWindow window =
		// PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		IWorkbenchWindow window = PlatformUI.getWorkbench().getWorkbenchWindows()[0];

		for (IEditorReference editorRef : window.getActivePage().getEditorReferences()) {
			String diagramID = getObjectDiagramID(editorRef);
			if (diagramID != null)
				openObjectDiagrams.add(diagramID);
		}

		if (window != null) {
			IWorkbenchPage[] pages = window.getPages();
			for (int i = 0; i < pages.length; i++) {
				IWorkbenchPage p = pages[i];
				p.addPartListener(new IPartListener2() {

					@Override
					public void partVisible(IWorkbenchPartReference partRef) {
						// TODO Auto-generated method stub

					}

					@Override
					public void partOpened(IWorkbenchPartReference partRef) {
						String diagramID = getObjectDiagramID(partRef);
						if (diagramID != null) {
							openObjectDiagrams.add(diagramID);
							// simulation is running?
							if (LayerView.yamm != null && LayerView.yamm.reflectivStateChart.simulationIsRunning) {
								// simulation uses this diagram?
								if (diagramID.equals(Zerochart.modelSynchronizer.diagramID)) {
									// update object diagram:
									Zerochart.modelSynchronizer.updateObjectDiagram();
								}
							}
						}
					}

					@Override
					public void partInputChanged(IWorkbenchPartReference partRef) {
						// TODO Auto-generated method stub

					}

					@Override
					public void partHidden(IWorkbenchPartReference partRef) {
						// TODO Auto-generated method stub

					}

					@Override
					public void partDeactivated(IWorkbenchPartReference partRef) {
						// TODO Auto-generated method stub

					}

					@Override
					public void partClosed(IWorkbenchPartReference partRef) {
						String diagramID = getObjectDiagramID(partRef);
						if (diagramID != null)
							openObjectDiagrams.remove(diagramID);
					}

					@Override
					public void partBroughtToTop(IWorkbenchPartReference partRef) {
						// TODO Auto-generated method stub

					}

					@Override
					public void partActivated(IWorkbenchPartReference partRef) {
						// TODO Auto-generated method stub

					}
				});
			}
		}
	}

	private String getObjectDiagramID(IWorkbenchPartReference partRef) {
		try {
			if (partRef instanceof EditorReference) {
				EditorReference editorRef = (EditorReference) partRef;
				if (editorRef.getEditorInput() instanceof SessionEditorInput) {
					SessionEditorInput sessionEditorInput = (SessionEditorInput) editorRef.getEditorInput();
					EObject input = sessionEditorInput.getInput();
					if (input instanceof Diagram) {
						EObject element = ((Diagram) input).getElement();
						if (element instanceof DSemanticDiagramSpec) {
							EObject target = ((DSemanticDiagramSpec) element).getTarget();
							if (target instanceof ObjectDiagram) {
								ObjectDiagram objectDiagram = (ObjectDiagram) target;
								URI uri = objectDiagram.eResource().getURI();
								String digramID = "/" + uri.segment(1);
								for (int i = 2; i < uri.segmentCount(); i++) {
									digramID += "/" + uri.segment(i);
								}
								return digramID;
							}
						}
					}
				}
			}
			return null;
		} catch (Exception e) {
			return null;
		}
	}

}
