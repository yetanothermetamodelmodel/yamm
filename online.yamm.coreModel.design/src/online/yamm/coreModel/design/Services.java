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
package online.yamm.coreModel.design;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gef.EditDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Tool;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.DNodeList;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.diagram.GraphicalFilter;
import org.eclipse.sirius.diagram.business.api.query.DDiagramElementQuery;
import org.eclipse.sirius.diagram.description.CustomLayoutConfiguration;
import org.eclipse.sirius.diagram.ui.business.api.view.SiriusLayoutDataManager;
import org.eclipse.sirius.diagram.ui.business.internal.view.RootLayoutData;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DNodeContainerEditPart;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DNodeEditPart;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DNodeListEditPart;
import org.eclipse.sirius.diagram.ui.tools.internal.part.SiriusDiagramGraphicalViewer;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;

import com.google.inject.Injector;

import RmofDiagramExtension.CollapseTrAttachment;
import RmofDiagramExtension.RmofDiagramExtensionFactory;
import online.yamm.coreModel.design.policies.RmofListContainerEditPolicy;
import online.yamm.coreModel.design.views.EffectView;
import online.yamm.coreModelDiagram.yammDiagram.DslInfo;
import online.yamm.coreModelDiagram.yammDiagram.EffectInfo;
import online.yamm.coreModelDiagram.yammDiagram.GuardInfo;
import online.yamm.coreModelDiagram.yammDiagram.YClass;
import online.yamm.coreModelDiagram.yammDiagram.YEffect;
import online.yamm.coreModelDiagram.yammDiagram.YModel;
import online.yamm.coreModelDiagram.yammDiagram.YStateMachine;
import online.yamm.coreModelDiagram.yammDiagram.YTrAttachment;
import online.yamm.coreModelDiagram.yammDiagram.YTransition;
import online.yamm.coreModelDiagram.yammDiagram.YVertex;
import online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage;
import online.yamm.coreModelDiagram.yammDiagram.xmiToText.DslConverter;
import online.yamm.coreModelDsl.ui.internal.CoreModelDslActivator;

/**
 * The services class used by VSM.
 */
public class Services
{

	/**
	 * See
	 * http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24
	 * for documentation on how to write service methods.
	 */
	public EObject myService(EObject self, String arg)
	{
		// TODO Auto-generated code
		return self;
	}

	public EObject test(EObject a, Object container)
	{
		return a;
	}
	
	
	private static Map<String, String> errorsEffect;
	private static Map<String, String> errorsGuard;
	
	public Boolean startValidation(YStateMachine self) 
	{	
		DslConverter dslConverter = null;
		for (Adapter adapter : self.eAdapters())
		{
			if (adapter instanceof DslConverter)
			{
				dslConverter = (DslConverter) adapter;
			}
		}
		
		Resource resource = self.eResource();
		URI uri;
		String projectName = (uri = URI.createPlatformResourceURI(resource.getURI().toPlatformString(true), false)).segments()[1];
		// create converter
		if (dslConverter == null)
		{
			dslConverter = new DslConverter();
			YModel model = (YModel) resource.getContents().get(0);
			model.eAdapters().add(dslConverter);
			dslConverter.init(model, projectName);
		}
		
		Injector injector = CoreModelDslActivator.getInstance()
				.getInjector(CoreModelDslActivator.ONLINE_YAMM_COREMODELDSL_XYAMM);
		IResourceValidator validator = injector.getInstance(IResourceValidator.class);
	
		String code = dslConverter.internalDsl.stream().collect(Collectors.joining("\n"));
		
		ParseHelper<YModel> parseHelper = injector.getInstance(ParseHelper.class);
		IResourceSetProvider reSetPro = injector.getInstance(IResourceSetProvider.class);
		
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot root = workspace.getRoot();
		IProject project = root.getProject(projectName);
		ResourceSet resourceSetToUse = reSetPro.get(project);
		Resource xResource = null;
		try { 
			Object resss = parseHelper.parse(code, resourceSetToUse);
			xResource = ((EObject) resss).eResource();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		List<Issue> issues = validator.validate(xResource, CheckMode.ALL, CancelIndicator.NullImpl);
			
		errorsEffect = new HashMap<String, String>();
		errorsGuard = new HashMap<String, String>();
		for (Issue issue : issues) {	
			if (true)//(issue.isSyntaxError())
			{
				for (YTrAttachment attach : self.getTrAttach())
				{
					DslInfo info = attach.getDslInfo();
					GuardInfo guardInfo = (GuardInfo) info.getFeatures().get(YammDiagramPackage.Literals.YTR_ATTACHMENT__GUARD_STRING_REP);
					int fistLine = dslConverter.get(guardInfo.getFirstLineGuard());
					int lastLine = dslConverter.get(guardInfo.getLastLineGuard());	
					if (issue.getLineNumber() >= fistLine && issue.getLineNumber() <= lastLine + 1)
					{
						errorsGuard.put(attach.getObjectID(), issue.getMessage());
					}
					
					for (YEffect effect : attach.getEffects())
					{
						info = effect.getDslInfo();
						EffectInfo effectInfo = (EffectInfo) info.getFeatures().get(YammDiagramPackage.Literals.YEFFECT__EFFECT_STRING_REP);
						fistLine = dslConverter.get(effectInfo.getFirstLineEffect());
						lastLine = dslConverter.get(effectInfo.getLastLineEffect());	
						if (issue.getLineNumber() >= fistLine && issue.getLineNumber() <= lastLine + 3)
						{
							errorsEffect.put(effect.getObjectID(), issue.getMessage());
						}
					}
				}			
			}
		}
		
		return true;
	}
	
	public Boolean validateEffect(YEffect effect) {	
		if (errorsEffect.containsKey(effect.getObjectID()))
			return false;
		return true;
	}

	
	public String getErrorMessageEffect(YEffect effect) {
		return errorsEffect.get(effect.getObjectID());
	}
	
	public Boolean validateGuard(YTrAttachment attach) {	
		if (errorsGuard.containsKey(attach.getObjectID()))
			return false;
		return true;
	}

	
	public String getErrorMessageGuard(YTrAttachment attach) {
		return errorsGuard.get(attach.getObjectID());
	}
	
	public static PasteStatemachineDiagramRmofSwitch pasteRmofSwitch = new PasteStatemachineDiagramRmofSwitch();

	public static boolean pasteActive = false;

	public EObject pasteOnStatemachineDiagram(EObject container, EObject copiedElement)
	{
		if (!pasteActive)
		{
			pasteActive = true;
		}

		pasteRmofSwitch.setContainer(container);
		pasteRmofSwitch.doSwitch(copiedElement);

		return container;
	}

	public EObject openStateMachineDiagram(EObject self)
	{
		return self;
	}
	
	public EObject initGuard(YTrAttachment attachment)
	{
		attachment.setGuardStringRep("true;");
		return attachment;
	}

	public String getEffectText(YEffect effect)
	{
		return "";
//		ICompositeNode node = NodeModelUtils.findActualNodeFor(effect.getBody());
//		if (node == null)
//			return "-----------------";
//		else
//		{
//			String text = node.getText();
//			text = text.substring(text.indexOf("{") + 1, text.lastIndexOf("}")).trim();
//			String[] lines = text.split("\n");
//			for (int i = 0; i < lines.length; i++)
//			{
//				lines[i] = lines[i].trim();
//			}
//			text = "";
//			for (int i = 0; i < lines.length; i++)
//			{
//				text += lines[i];
//				if (i != lines.length - 1)
//					text += "\n";
//			}
//			return text;
//		}
	}

	public String getGuardText(YTrAttachment attachment)
	{
//		ICompositeNode node = NodeModelUtils.findActualNodeFor(attachment.getGuard());
//		if (node == null)
//			return "----";
//		else
//		{
//			String text = node.getText();
//			text = text.substring(text.indexOf("{") + 1, text.lastIndexOf("}")).trim();
//			String[] lines = text.split("\n");
//			for (int i = 0; i < lines.length; i++)
//			{
//				lines[i] = lines[i].trim();
//			}
//			text = "";
//			for (int i = 0; i < lines.length; i++)
//			{
//				text += lines[i];
//				if (i != lines.length - 1)
//					text += "\n";
//			}
//			return "[" + text + "]";
//		}
		return "";
	}

	
	public EObject openTextEditor(EObject self)
	{
		boolean isEffect = self instanceof YEffect ? true : false;

		DslConverter dslConverter = null;
		for (Adapter adapter : self.eAdapters())
		{
			if (adapter instanceof DslConverter)
			{
				dslConverter = (DslConverter) adapter;
			}
		}
		Resource resource = self.eResource();
		String projectName = URI.createPlatformResourceURI(resource.getURI().toPlatformString(true), false).segments()[1];
		// create converter
		if (dslConverter == null)
		{
			dslConverter = new DslConverter();
			YModel model = (YModel) resource.getContents().get(0);
			model.eAdapters().add(dslConverter);
			dslConverter.init(model, projectName);
		}
		DslConverter dslConverterFinal = dslConverter;
		// open/update View
		try {
			int fistLine;
			int lastLine;
			if (isEffect)
			{
				DslInfo info = ((YEffect) self).getDslInfo();
				EffectInfo effectInfo = (EffectInfo) info.getFeatures().get(self.eClass().getEStructuralFeature("effectStringRep"));

				fistLine = dslConverter.get(effectInfo.getFirstLineEffect());
				lastLine = dslConverter.get(effectInfo.getLastLineEffect());
			}
			else
			{
				DslInfo info = ((YTrAttachment) self).getDslInfo();
				GuardInfo guardInfo = (GuardInfo) info.getFeatures().get(self.eClass().getEStructuralFeature("guardStringRep"));
				
				fistLine = dslConverter.get(guardInfo.getFirstLineGuard());
				lastLine = dslConverter.get(guardInfo.getLastLineGuard());
			}
			
			EffectView view = (EffectView) PlatformUI.getWorkbench().getActiveWorkbenchWindow()
					.getActivePage().showView("online.yamm.ui.effectView");//, null, IWorkbenchPage.VIEW_VISIBLE);
			view.init(dslConverter, projectName, resource, fistLine, lastLine, isEffect);
			
			((IWorkbenchPart) view).getSite().getPage().addPartListener(new IPartListener2()
			{
				@Override
				public void partDeactivated(IWorkbenchPartReference partRef) 
				{
					
					String newEffectOrGuardCode = view.viewer.getTextWidget().getText();
					String oldText;
					
					view.clear();
					((IWorkbenchPart) view).getSite().getPage().removePartListener(this);
					
					if (isEffect)
					{
						oldText = ((YEffect) self).getEffectStringRep();
					}
					else // is guard 
					{
						oldText = ((YTrAttachment) self).getGuardStringRep();
					}
					
					if (oldText == null && newEffectOrGuardCode == null)
						return;
					if (oldText != null && oldText.equals(newEffectOrGuardCode))
						return;
					if (newEffectOrGuardCode != null && newEffectOrGuardCode.equals(oldText))
						return;
					TransactionalEditingDomain ted = TransactionUtil.getEditingDomain(self);
					ted.getCommandStack().execute(new RecordingCommand(ted)
					{
						@Override
						protected void doExecute()
						{	
							if (isEffect)
							{
								((YEffect) self).setEffectStringRep(newEffectOrGuardCode);
							}
							else // is guard 
							{
								((YTrAttachment) self).setGuardStringRep(newEffectOrGuardCode);
							}	
						}
					});	
					
				}
				@Override
				public void partVisible(IWorkbenchPartReference partRef) {}
				@Override
				public void partOpened(IWorkbenchPartReference partRef) {}
				@Override
				public void partInputChanged(IWorkbenchPartReference partRef) {}
				@Override
				public void partHidden(IWorkbenchPartReference partRef) {}
				@Override
				public void partClosed(IWorkbenchPartReference partRef) {}
				@Override
				public void partBroughtToTop(IWorkbenchPartReference partRef) {}
				@Override
				public void partActivated(IWorkbenchPartReference partRef) {}
			});
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return self;
	}

	public String getNameStateMachineDiagram(YStateMachine statemachine)
	{
		String operationName = statemachine.getOperation().getName();
		String className = statemachine.getOperation().getClazz().getName();
		String name = (operationName != null ? operationName : "") + (className != null ? "_" + className : "");
		return name.isEmpty() ? "Statemachine Diagram" : name;
	}


	private boolean isPrimitive(YClass type)
	{
		return false;
	}

	private static YStateMachine sm;

	public EObject getStatemachine(EObject self)
	{
		return sm;
	}

	public EObject deleteState(EObject self)
	{
		YVertex vertex = (YVertex) self;
		YTrAttachment attachment;
		for (YTransition transition : vertex.getIncoming())
		{
			transition.getSource().getOutgoing().remove(transition);
			if ((attachment = transition.getAttachment()) != null)
			{
				// this wouldn't happen without this explicit deletion tool
				attachment.setTransition(null);
			}
		}
		for (YTransition transition : vertex.getOutgoing())
		{
			transition.getTarget().getIncoming().remove(transition);
			if ((attachment = transition.getAttachment()) != null)
			{
				// this wouldn't happen without this explicit deletion tool
				attachment.setTransition(null);
			}
		}
		YStateMachine sm = (YStateMachine) vertex.eContainer();
		sm.getTransition().removeAll(vertex.getIncoming());
		sm.getTransition().removeAll(vertex.getOutgoing());
		sm.getSubvertex().remove(vertex);

		return null;
	}

	public DSemanticDecorator getContainerView(EObject self, EObject sourceView)
	{
		Object obj = sourceView.eContainer();
		DSemanticDecorator sem = (DSemanticDecorator) obj;
		return (DSemanticDecorator) obj;
	}

//	public EObject setPosTrAttachment(DNodeList dElement, DNode sourceView, DNode targetView)
	public EObject setPosTrAttachment(EObject dElement, EObject sourceView, EObject targetView)
	{

		DiagramEditor editor = (DiagramEditor) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
				.getActiveEditor();
		SiriusDiagramGraphicalViewer viewer = (SiriusDiagramGraphicalViewer) editor.getDiagramGraphicalViewer();

		Point sourceLocation = null;
		Point targetLocation = null;
		Point attachmentLocation = null;

		List<DNodeContainerEditPart> sourceEditPartList = viewer
				.findEditPartsForElement(((DSemanticDecorator) sourceView).getTarget(), DNodeContainerEditPart.class);
		if (sourceEditPartList.isEmpty())
		{
			List<DNodeEditPart> soudrceEditPartList = viewer
					.findEditPartsForElement(((DSemanticDecorator) sourceView).getTarget(), DNodeEditPart.class);
			if (!soudrceEditPartList.isEmpty())
			{
				sourceLocation = soudrceEditPartList.get(0).getLocation();
			}
		}
		if (!sourceEditPartList.isEmpty())
		{
			sourceLocation = sourceEditPartList.get(0).getLocation();
		}

		List<DNodeContainerEditPart> targetEditPartList = viewer
				.findEditPartsForElement(((DSemanticDecorator) targetView).getTarget(), DNodeContainerEditPart.class);
		if (targetEditPartList.isEmpty())
		{
			List<DNodeEditPart> soudrceEditPartList = viewer
					.findEditPartsForElement(((DSemanticDecorator) targetView).getTarget(), DNodeEditPart.class);
			if (!soudrceEditPartList.isEmpty())
			{
				targetLocation = soudrceEditPartList.get(0).getLocation();
			}
		}
		if (!targetEditPartList.isEmpty())
		{
			targetLocation = targetEditPartList.get(0).getLocation();
		}

		if (sourceLocation != null && targetLocation != null)
		{
			int distance = 120;
			if (!sourceLocation.equals(targetLocation))
			{
				Point diffVector = new Point(sourceLocation.preciseX() - targetLocation.preciseX(),
						sourceLocation.preciseY() - targetLocation.preciseY());
				Point midpoint = new Point(targetLocation.preciseX() + diffVector.preciseX() / 2,
						targetLocation.preciseY() + diffVector.preciseY() / 2);
				Point n_orthogonalDiffVector = new Point(diffVector.preciseY(), -diffVector.preciseX());
				double lengthN = Math.sqrt(Math.pow(diffVector.preciseX(), 2) + Math.pow(diffVector.preciseY(), 2));
				double n_normalizedX = n_orthogonalDiffVector.preciseX() / lengthN;
				double n_normalizedY = n_orthogonalDiffVector.preciseY() / lengthN;
				attachmentLocation = new Point(midpoint.preciseX() + distance * n_normalizedX,
						midpoint.preciseY() + distance * n_normalizedY);
			}
			else
			{
				attachmentLocation = new Point(targetLocation.preciseX() + distance / Math.sqrt(2),
						targetLocation.preciseY() + distance / Math.sqrt(2));

			}

		}

		SiriusLayoutDataManager.INSTANCE.addData(new RootLayoutData(dElement, attachmentLocation, null));

		return dElement;
	}

	public EObject deactivateToolReactivation(EObject self)
	{
		DiagramEditor editor = (DiagramEditor) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
				.getActiveEditor();
		SiriusDiagramGraphicalViewer viewer = (SiriusDiagramGraphicalViewer) editor.getDiagramGraphicalViewer();
		EditDomain ed = viewer.getEditDomain();
		if (ed instanceof StatemachineDiagramEditDomain)
		{
			((StatemachineDiagramEditDomain) ed).setReactivateMode(false);
		}
		return self;
	}

	// doesn't work for node/container creation tools
	public EObject reactivateTool(EObject self)
	{
		DiagramEditor editor = (DiagramEditor) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
				.getActiveEditor();
		SiriusDiagramGraphicalViewer viewer = (SiriusDiagramGraphicalViewer) editor.getDiagramGraphicalViewer();

		// TransactionalEditingDomain ted = TransactionUtil.getEditingDomain(self);
		// ted.addResourceSetListener(new ResourceSetListenerImpl() {
		// @Override
		// public Command transactionAboutToCommit(ResourceSetChangeEvent event) throws
		// RollbackException
		// {
		// RecordingCommand cmd = new RecordingCommand(ted) {
		//
		// @Override
		// protected void doExecute() {
		Tool tool = viewer.getEditDomain().getActiveTool();
		tool.activate();
		EditDomain ed = viewer.getEditDomain();

		if (!(ed instanceof StatemachineDiagramEditDomain))
		{
			EditDomain newEd = new StatemachineDiagramEditDomain(editor);
			newEd.setCommandStack(ed.getCommandStack());
			newEd.setPaletteRoot(ed.getPaletteViewer().getPaletteRoot());
			newEd.setPaletteViewer(ed.getPaletteViewer());
			viewer.setEditDomain(newEd);
			ed = newEd;
		}
		((StatemachineDiagramEditDomain) ed).setReactivateMode(true);
		ed.setDefaultTool(tool);

		// }
		// };
		// ted.removeResourceSetListener(this);
		// return cmd;
		// }
		// });
		return self;
	}


	public EList<EObject> getTransitionAndAttachment(YTransition transition)
	{
		EList<EObject> returnList = new BasicEList<>();
		returnList.add(transition.getAttachment());
		returnList.add(transition);
		return returnList;
	}

	public Boolean linkCreationStartPrecondition(EObject self)
	{
		if (self instanceof YTransition)
			if (((YTransition) self).getAttachment() == null)
				return true;
		return false;
	}

	public Boolean linkCreationCompletePrecondition(EObject self, EObject trAttach)
	{
		if (trAttach instanceof YTrAttachment)
			if (((YTrAttachment) trAttach).getTransition() == null)
				return true;
		return false;
	}

	public EObject deleteLinkTrAttachment(YTransition transition)
	{
		transition.getAttachment().setTransition(null);
		transition.setAttachment(null);
		return transition;
	}

	public Boolean reconnectLinkTrTargetPrecondition(EObject self, EObject targetView)
	{
		YTrAttachment targetTrAttachment = (YTrAttachment) ((DSemanticDecorator) targetView).getTarget();

		if (targetTrAttachment.getTransition() == null)
			return true;
		return false;
	}

	public Boolean reconnectLinkTrSourcePrecondition(EObject self, EObject targetView)
	{
		YTransition targetTransition = (YTransition) ((DSemanticDecorator) targetView).getTarget();

		if (targetTransition.getAttachment() == null)
			return true;
		return false;
	}

	public EObject hideSelectedTrAttachments(EObject self)
	{
		DiagramEditor editor = (DiagramEditor) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
				.getActiveEditor();
		SiriusDiagramGraphicalViewer siriusEditor = (SiriusDiagramGraphicalViewer) editor.getDiagramGraphicalViewer();

		Stream selectedDNodeListEditParts = siriusEditor.getSelectedEditParts().parallelStream()
				.filter(selectedEditPart -> {
					if (selectedEditPart instanceof DNodeListEditPart)
					{
						View view = (View) ((EditPart) selectedEditPart).getModel();
						DDiagramElement dElement = (DDiagramElement) view.getElement();
						if (dElement instanceof DNodeList && dElement.getTarget() instanceof YTrAttachment)
							if (!isTrAttachmentCollapsed((DNodeList) dElement))
								return true;
					}
					return false;
				});

		EditPart editPart = null;
		for (Object obj : selectedDNodeListEditParts.toArray())
		{
			View view = (View) ((EditPart) obj).getModel();
			DNodeList nodeList = (DNodeList) view.getElement();
			nodeList.getGraphicalFilters().add(RmofDiagramExtensionFactory.eINSTANCE.createCollapseTrAttachment());
		}

		return null;
	}

	public EObject revealSelectedTrAttachments(EObject self)
	{
		DiagramEditor editor = (DiagramEditor) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
				.getActiveEditor();
		SiriusDiagramGraphicalViewer siriusEditor = (SiriusDiagramGraphicalViewer) ((DiagramEditor) editor)
				.getDiagramGraphicalViewer();

		Stream selectedDNodeListEditParts = siriusEditor.getSelectedEditParts().parallelStream()
				.filter(selectedEditPart -> {
					if (selectedEditPart instanceof DNodeListEditPart)
						return true;
					return false;
				});
		for (Object obj : selectedDNodeListEditParts.toArray())
		{
			View view = (View) ((EditPart) obj).getModel();
			DDiagramElement dElement = (DDiagramElement) view.getElement();
			if (dElement instanceof DNodeList && dElement.getTarget() instanceof YTrAttachment)
			{
				DNodeList nodeList = (DNodeList) dElement;
				if (isTrAttachmentCollapsed(nodeList))
				{
					for (int i = 0;; i++)
					{
						if (nodeList.getGraphicalFilters().get(i) instanceof CollapseTrAttachment)
						{
							nodeList.getGraphicalFilters().remove(i);
							break;
						}
					}
				}
			}
		}

		return null;
	}

	private boolean isTrAttachmentCollapsed(DNodeList dNodeList)
	{
		for (GraphicalFilter gf : dNodeList.getGraphicalFilters())
		{
			if (gf instanceof CollapseTrAttachment)
			{
				return true;
			}
		}
		return false;
	}

	public EObject collapseDecollapseTrAttachment(DNodeList dNodeList)
	{
		boolean wasCollapsed = false;
		GraphicalFilter gfTrAttach = null;

		for (GraphicalFilter gf : dNodeList.getGraphicalFilters())
		{
			if (gf instanceof CollapseTrAttachment)
			{
				wasCollapsed = true;
				gfTrAttach = gf;
			}
		}

		if (!wasCollapsed)
		{
			dNodeList.getGraphicalFilters().add(RmofDiagramExtensionFactory.eINSTANCE.createCollapseTrAttachment());
		}
		else
		{
			dNodeList.getGraphicalFilters().remove(gfTrAttach);
		}

		return null;

	}

	public Boolean isLabelHidden(EObject self, EObject diagramElement)
	{
		return new DDiagramElementQuery((DDiagramElement) diagramElement).isLabelHidden();
	}

	public EObject insertEffect(YEffect effect)
	{
		YTrAttachment attachment = (YTrAttachment) effect.eContainer();
		attachment.getEffects().move(RmofListContainerEditPolicy.index, effect);
		return effect;
	}

	public EObject layoutMrTree(EObject objDiagram)
	{
		DSemanticDiagram diagram = (DSemanticDiagram) objDiagram;
		CustomLayoutConfiguration layout = (CustomLayoutConfiguration) diagram.getDescription().getLayout();

		layout.setId("org.eclipse.elk.mrtree");
		layout.setLabel("ELK Mr. Tree");

		return diagram;
	}

	public EObject layoutStress(EObject objDiagram)
	{
		DSemanticDiagram diagram = (DSemanticDiagram) objDiagram;
		CustomLayoutConfiguration layout = (CustomLayoutConfiguration) diagram.getDescription().getLayout();

		layout.setId("org.eclipse.elk.stress");
		layout.setLabel("ELK Stress");

		return diagram;
	}

	public EObject layoutDisCo(EObject objDiagram)
	{
		DSemanticDiagram diagram = (DSemanticDiagram) objDiagram;
		CustomLayoutConfiguration layout = (CustomLayoutConfiguration) diagram.getDescription().getLayout();

		layout.setId("org.eclipse.elk.disco");
		layout.setLabel("ELK DisCo");

		return diagram;
	}

	public EObject layoutForce(EObject objDiagram)
	{
		DSemanticDiagram diagram = (DSemanticDiagram) objDiagram;
		CustomLayoutConfiguration layout = (CustomLayoutConfiguration) diagram.getDescription().getLayout();

		layout.setId("org.eclipse.elk.force");
		layout.setLabel("ELK Force");

		return diagram;
	}

	public EObject layoutLayered(EObject objDiagram)
	{
		DSemanticDiagram diagram = (DSemanticDiagram) objDiagram;
		CustomLayoutConfiguration layout = (CustomLayoutConfiguration) diagram.getDescription().getLayout();

		layout.setId("org.eclipse.elk.layered");
		layout.setLabel("ELK Layered");

		return diagram;
	}

	public EObject reconnectLinkSource(YTransition targetTran, YTransition sourceTran)
	{

		YTrAttachment attachment = sourceTran.getAttachment();

		attachment.setTransition(targetTran);
		targetTran.setAttachment(attachment);
		sourceTran.setAttachment(null);

		return targetTran;
	}
	
	public EObject reconnectLinkTarget(YTrAttachment target, YTrAttachment source)
	{
		YTransition transition = source.getTransition();
		target.setTransition(transition);
		transition.setAttachment(target);
		source.setTransition(null);
		return target;
	}
	
	public Boolean showProperty(EObject self, Object _eStructuralFeature)
	{

		EStructuralFeature eStructuralFeature = (EStructuralFeature) _eStructuralFeature;

		if ("qualifiedName".equals(eStructuralFeature.getName()))
			return false;

		if (YammDiagramPackage.Literals.YTR_ATTACHMENT == self.eClass())
		{
			if (YammDiagramPackage.Literals.YTR_ATTACHMENT__GUARD_STRING_REP == eStructuralFeature
					|| YammDiagramPackage.Literals.YTR_ATTACHMENT__QUALIFIED_NAME == eStructuralFeature
					|| YammDiagramPackage.Literals.YTR_ATTACHMENT__TRANSITION == eStructuralFeature
					|| YammDiagramPackage.Literals.YNAMED_ELEMENT__NAME == eStructuralFeature)
				return false;
		}
		else if (YammDiagramPackage.Literals.YSTATE_MACHINE == self.eClass())
		{
			if (YammDiagramPackage.Literals.YSTATE_MACHINE__CALLED_OPERATION == eStructuralFeature
					|| YammDiagramPackage.Literals.YSTATE_MACHINE__MAX_EFFECTS_TO_BE_PROCESSED == eStructuralFeature
					|| YammDiagramPackage.Literals.YSTATE_MACHINE__QUALIFIED_NAME == eStructuralFeature
					|| YammDiagramPackage.Literals.YSTATE_MACHINE__OPERATION == eStructuralFeature)
				return false;
		}
		else if (YammDiagramPackage.Literals.YTRANSITION == self.eClass())
		{
			if (YammDiagramPackage.Literals.YTRANSITION__ATTACHMENT == eStructuralFeature
					|| YammDiagramPackage.Literals.YTRANSITION__SOURCE == eStructuralFeature
					|| YammDiagramPackage.Literals.YTRANSITION__TARGET == eStructuralFeature)
				return false;
		}
		else if (YammDiagramPackage.Literals.YSTATE == self.eClass())
		{
			if (YammDiagramPackage.Literals.YVERTEX__INCOMING == eStructuralFeature
					|| YammDiagramPackage.Literals.YVERTEX__OUTGOING == eStructuralFeature
					|| YammDiagramPackage.Literals.YNAMED_ELEMENT__NAME == eStructuralFeature)
				return false;
		}
		else if (YammDiagramPackage.Literals.YPSEUDOSTATE == self.eClass())
		{
			if (YammDiagramPackage.Literals.YVERTEX__INCOMING == eStructuralFeature
					|| YammDiagramPackage.Literals.YVERTEX__OUTGOING == eStructuralFeature)
				return false;
		}
		else if (YammDiagramPackage.Literals.YFINAL_STATE == self.eClass())
		{
			if (YammDiagramPackage.Literals.YVERTEX__INCOMING == eStructuralFeature
					|| YammDiagramPackage.Literals.YVERTEX__OUTGOING == eStructuralFeature)
				return false;
		}
		else if (YammDiagramPackage.Literals.YOPERATION == self.eClass())
		{
			if (YammDiagramPackage.Literals.YOPERATION__QUALIFIED_NAME == eStructuralFeature
					|| YammDiagramPackage.Literals.YOPERATION__CLAZZ == eStructuralFeature)
				return false;
		}
		else if (YammDiagramPackage.Literals.YCLASS == self.eClass())
		{
			if (YammDiagramPackage.Literals.YCLASS__QUALIFIED_NAME == eStructuralFeature
					|| YammDiagramPackage.Literals.YCLASS__PACKAGE == eStructuralFeature
					|| YammDiagramPackage.Literals.YPACKAGEABLE_ELEMENT__PARENT_ELEMENT == eStructuralFeature
					|| YammDiagramPackage.Literals.YCLASS__OBSERVE_QUEUE == eStructuralFeature)
				return false;
		}
		else if (YammDiagramPackage.Literals.YPACKAGE == self.eClass())
		{
			if (YammDiagramPackage.Literals.YPACKAGE__QUALIFIED_NAME == eStructuralFeature
					|| YammDiagramPackage.Literals.YPACKAGE__PACKAGE == eStructuralFeature
					|| YammDiagramPackage.Literals.YPACKAGEABLE_ELEMENT__PARENT_ELEMENT == eStructuralFeature)
				return false;
		}
		else if (YammDiagramPackage.Literals.YENUMERATION == self.eClass())
		{
			if (YammDiagramPackage.Literals.YENUMERATION__MEMBER == eStructuralFeature
					|| YammDiagramPackage.Literals.YPACKAGEABLE_ELEMENT__PARENT_ELEMENT == eStructuralFeature
					|| YammDiagramPackage.Literals.YENUMERATION__ELEMENT_IMPORT == eStructuralFeature
					|| YammDiagramPackage.Literals.YENUMERATION__IMPORTED_MEMBER == eStructuralFeature
					|| YammDiagramPackage.Literals.YENUMERATION__PACKAGE_IMPORT == eStructuralFeature
					|| YammDiagramPackage.Literals.YENUMERATION__ATTRIBUTE == eStructuralFeature
					|| YammDiagramPackage.Literals.YENUMERATION__FEATURE == eStructuralFeature
					|| YammDiagramPackage.Literals.YENUMERATION__GENERAL == eStructuralFeature
					|| YammDiagramPackage.Literals.YENUMERATION__INHERITED_MEMBER == eStructuralFeature
					|| YammDiagramPackage.Literals.YENUMERATION__PACKAGE == eStructuralFeature
					|| YammDiagramPackage.Literals.YENUMERATION__IS_ABSTRACT == eStructuralFeature		
					)
				return false;
		}
		else if (YammDiagramPackage.Literals.YENUMERATION_LITERAL == self.eClass())
		{
			if (YammDiagramPackage.Literals.YPACKAGEABLE_ELEMENT__PARENT_ELEMENT == eStructuralFeature)
				return false;
		}
		else if (YammDiagramPackage.Literals.YPARAMETER == self.eClass())
		{
			if (YammDiagramPackage.Literals.YPARAMETER__DEFAULT_VALUE == eStructuralFeature
					|| YammDiagramPackage.Literals.YPARAMETER__DESCRIPTION == eStructuralFeature)
				return false;
		}

		return true;	
	}

}
