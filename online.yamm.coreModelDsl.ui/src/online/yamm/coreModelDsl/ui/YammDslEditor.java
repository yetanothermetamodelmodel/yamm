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
package online.yamm.coreModelDsl.ui;

import org.eclipse.jface.text.IDocument;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.xtext.ui.editor.XtextSourceViewer;

import com.google.inject.Inject;

import online.yamm.coreModelDiagram.yammDiagram.xmiToText.DslConverter;
import online.yamm.coreModelDsl.ui.editor.XYammEditor;

public class YammDslEditor extends XYammEditor
{

	private online.yamm.coreModelDiagram.yammDiagram.YModel yModelDiagram;
	private DslConverter conv;

	@Inject
	private XtextSourceViewer.Factory sourceViewerFactory;
	
	public YammDslEditor()
	{
		
	}

//	@Override
//	public boolean isEditable()
//	{
//		IFile file = ((FileEditorInput) getEditorInput()).getFile();
//		String projectName = file.getFullPath().segment(0);
//		String fileName = file.getFullPath().lastSegment();
//		String modelName = fileName.substring(0, fileName.lastIndexOf("."));
//		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
//		for (IEditorReference editorReference : page.getEditorReferences())
//		{
//			if ("org.eclipse.sirius.diagram.ui.part.SiriusDiagramEditorID"
//					.equals(((EditorReference) editorReference).getDescriptor().getId()))
//			{
//				try
//				{
//					SessionEditorInput input = (SessionEditorInput) ((EditorReference) editorReference)
//							.getEditorInput();
//					String[] uriSegments = input.getURI().toString().split("/");
//					if (projectName.equals(uriSegments[2]))
//					{
//						for (Resource semRes : input.getSession().getSemanticResources())
//						{
//							if ((modelName + ".yammdiagram").equals(semRes.getURI().lastSegment()))
//							{
//								return true;
//							}
//						}
//					}
//				}
//				catch (PartInitException e)
//				{
//					e.printStackTrace();
//				}
//			}
//		}
//		return false;
//	}

	IDocument document;
	@Override
	public void createPartControl(Composite parent)
	{
		super.createPartControl(parent);

//		XtextSourceViewer viewer = null;
//		IDocumentProvider dp = this.getDocumentProvider();
//		document = dp.getDocument(this.getEditorInput());
//		try
//		{
//			Field field = AbstractTextEditor.class.getDeclaredField("fSourceViewer");
//			field.setAccessible(true);
//			viewer = (XtextSourceViewer) field.get(this);
//			document.replace(0, document.getLength(), ""); // delete content
//		}
//		catch (Exception e)
//		{
//			e.printStackTrace();
//		}
//
//		// diagram is open?
//		IFile file = ((FileEditorInput) getEditorInput()).getFile();
//		IPath projectRelatedPathXyamm = file.getProjectRelativePath();
//		String projectName = file.getFullPath().segment(0);
//		String fileName = file.getFullPath().lastSegment();
//		String modelName = fileName.substring(0, fileName.lastIndexOf("."));
//
//		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
//		yModelDiagram = null;
//		for (IEditorReference editorReference : page.getEditorReferences())
//		{
//			if ("org.eclipse.sirius.diagram.ui.part.SiriusDiagramEditorID"
//					.equals(((EditorReference) editorReference).getDescriptor().getId()))
//			{
//				try
//				{
//					SessionEditorInput input = (SessionEditorInput) ((EditorReference) editorReference)
//							.getEditorInput();
//					
//					String[] uriSegments = input.getURI().toString().split("/");
//					if (projectName.equals(uriSegments[2]))
//					{
//						for (Resource semRes : input.getSession().getSemanticResources())
//						{
//							if ((modelName + ".yammdiagram").equals(semRes.getURI().lastSegment()))
//							{
//								yModelDiagram = (online.yamm.coreModelDiagram.yammDiagram.YModel) semRes.getContents()
//										.get(0);
//							}
//						}
//					}
//				}
//				catch (PartInitException e)
//				{
//					e.printStackTrace();
//				}
//			}
//		}
//
//		if (yModelDiagram == null) // --> open diagram
//		{
//			Resource sessionRes = null;
//			Session session = null;
//			for (Session sess : SessionManager.INSTANCE.getSessions())
//			{
//				if (sess.getID().contains("platform:/resource/" + projectName + "/"))
//				{
//					session = sess;
//					sessionRes = sess.getSessionResource();
//					break;
//				}
//			}
//			if (sessionRes != null)
//			{
//				EList<EObject> content = sessionRes.getContents();
//				for (int i = 1; i < content.size(); i++)
//				{
//					if (content.get(i) instanceof DSemanticDiagram)
//					{
//						final DSemanticDiagram diagram = (DSemanticDiagram) content.get(i);
//						if (diagram.getTarget() instanceof online.yamm.coreModelDiagram.yammDiagram.YModel)
//						{
//							DialectUIManager.INSTANCE.openEditor(session, diagram, new NullProgressMonitor());
//							yModelDiagram = (online.yamm.coreModelDiagram.yammDiagram.YModel) diagram.getTarget();
//							break;
//						}
//					}
//				}
//			}
//			else
//			{
//				this.close(false);
//			}
//			if (yModelDiagram == null)
//			{
//				this.close(false);
//			}
//		}

//		if (yModelDiagram != null)
//		{
//			initContent();
//		}

//		viewer.setEventConsumer(new IEventConsumer()
//		{
//
//			@Override
//			public void processEvent(VerifyEvent event)
//			{
//				try
//				{
//					event.doit = false;
//					if ("\n".equals(event.text))
//						return;
//					int lineStart = document.getLineOfOffset(event.start);
//					int lineEnd = document.getLineOfOffset(event.end);
//					if (lineEnd != lineStart)
//						return;
//					if ("yGuard".equals(document.get(document.getLineOffset(lineStart - 2), 6)))
//					{
//						event.doit = true;
//					}
//					else if (", yEffect".equals(document.get(document.getLineOffset(lineStart - 4), 9)))
//					{
//						event.doit = true;
//					}
//				}
//				catch (Exception e)
//				{
//					e.printStackTrace();
//				}
//			}
//		});
	}
//
//	public void initContent()
//	{
//		conv = new DslConverter();
//		yModelDiagram.eAdapters().add(conv);
//		conv.init(yModelDiagram);
//	}
//
//	public void deregisterAdapter()
//	{
//		if (yModelDiagram != null)
//		{
//			List<Adapter> adapters = yModelDiagram.eAdapters();
//			for (int i = 0; i < adapters.size();)
//			{
//				if (adapters.get(i) instanceof DslConverter)
//				{
//					adapters.remove(i);
//				}
//				else
//				{
//					i++;
//				}
//			}
//		}
//	}

//	@Override
//	public void doSave(IProgressMonitor progressMonitor)
//	{
//		((DslEditorConnector) conv.getLangConnector()).writeToDiagram();
//		IFile file = ((FileEditorInput) getEditorInput()).getFile();
//		String projectName = file.getFullPath().segment(0);
//		String fileName = file.getFullPath().lastSegment();
//		String modelName = fileName.substring(0, fileName.lastIndexOf("."));
//		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
//		for (IEditorReference editorReference : page.getEditorReferences())
//		{
//			if ("org.eclipse.sirius.diagram.ui.part.SiriusDiagramEditorID"
//					.equals(((EditorReference) editorReference).getDescriptor().getId()))
//			{
//				try
//				{
//					SessionEditorInput input = (SessionEditorInput) ((EditorReference) editorReference)
//							.getEditorInput();
//					String[] uriSegments = input.getURI().toString().split("/");
//					if (projectName.equals(uriSegments[2]))
//					{
//						for (Resource semRes : input.getSession().getSemanticResources())
//						{
//							if ((modelName + ".yammdiagram").equals(semRes.getURI().lastSegment()))
//							{
//								editorReference.getEditor(true).doSave(new NullProgressMonitor());
//								return;
//							}
//						}
//					}
//				}
//				catch (PartInitException e)
//				{
//					e.printStackTrace();
//				}
//			}
//		}
//	}
	
//	@Override
//	protected ISourceViewer createSourceViewer(Composite parent, IVerticalRuler ruler, int styles) 
//	{
//		fAnnotationAccess = createAnnotationAccess();
//		fOverviewRuler = createOverviewRuler(getSharedColors());
//		ISourceViewer projectionViewer = sourceViewerFactory.createSourceViewer(parent, ruler, getOverviewRuler(),
//				isOverviewRulerVisible(), styles);
//		getSourceViewerDecorationSupport(projectionViewer);
//		
//		
////		class XTextSourceViewerDecorator extends XtextSourceViewer
////		{
////			
////		}
////		XtextSourceViewer viewer = new XtextSourceViewer() {
////			
////		}
//		
//		projectionViewer.setEventConsumer(new IEventConsumer()
//		{
//
//			@Override
//			public void processEvent(VerifyEvent event)
//			{
//				try
//				{
//					event.doit = false;
//					if ("\n".equals(event.text))
//						return;
//					int lineStart = document.getLineOfOffset(event.start);
//					int lineEnd = document.getLineOfOffset(event.end);
//					if (lineEnd != lineStart)
//						return;
//					if ("yGuard".equals(document.get(document.getLineOffset(lineStart - 2), 6)))
//					{
//						event.doit = true;
//					}
//					else if (", yEffect".equals(document.get(document.getLineOffset(lineStart - 4), 9)))
//					{
//						event.doit = true;
//					}
//				}
//				catch (Exception e)
//				{
//					e.printStackTrace();
//				}
//			}
//		});
//		
//		
//		return projectionViewer;
//	}

}
