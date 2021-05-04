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
package dev.yamm.coreModel.design.views;

import javax.inject.Inject;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.text.IDocument;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.xtext.ui.editor.XtextSourceViewer;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditor;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorFactory;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorModelAccess;
import org.eclipse.xtext.validation.IResourceValidator;

import com.google.inject.Injector;

import dev.yamm.coreModelDiagram.yammDiagram.xmiToText.DslConverter;
import dev.yamm.coreModelDsl.YammResourceProvider;
import dev.yamm.coreModelDsl.ui.internal.CoreModelDslActivator;

public class EffectView extends ViewPart {

	public static final String ID = "dev.yamm.ui.effectView";

	
	@Inject
	IWorkbench workbench;

	private DslConverter conv;
	
	public Composite parent;
	
	public Composite view;
	public IDocument document;
	public XtextSourceViewer viewer;
	
	public boolean showsEffect;
	public boolean showsGuard;
	public String effectOrGuradID;

	
	private Injector injector;
	private String projectName;
	private URI uri;
	private int length;

	private int offset;

//	private FeatureInfo info;
	
	public YammResourceProvider sourceProvider;
	
	public IResourceValidator resourceValidator;
	
	private EmbeddedEditorModelAccess partialEditorModelAccess;
	
	private EmbeddedEditorFactory factory;
	
	private Resource resource;
	private Resource resourceEmbedded;
	
	private static Color grey;
	private static Color white;
	
	public void init(DslConverter converter, String projectName, Resource resource, int fistLine, int lastLine, boolean isEffect) {
		if (view != null
				&& this.resource != resource)
		{
			view.dispose();
			parent.layout();
			view = null;
		}
		if (view == null || (sourceProvider != null && sourceProvider.getResource() != resourceEmbedded))
		{
			if (view != null)
			{
				view.dispose();
				parent.layout();
				view = null;
//				sourceProvider = injector.getInstance(YammResourceProvider.class);
			}
			injector = CoreModelDslActivator.getInstance()
					.getInjector(CoreModelDslActivator.DEV_YAMM_COREMODELDSL_XYAMM);	
			sourceProvider = injector.getInstance(YammResourceProvider.class);	
			factory = injector.getInstance(EmbeddedEditorFactory.class);
			this.resource = resource;
			view = createView(parent);
		
			uri = URI.createPlatformResourceURI(resource.getURI().toPlatformString(true).replace(".yammdiagram", ".xyamm"), false);
			projectName = uri.segments()[1];
			
			sourceProvider.setModelUri(uri);
			sourceProvider.setProjetName(projectName);
			
			EmbeddedEditorFactory.Builder builder;
			
			EmbeddedEditor embeddedEditor = (builder = factory.newEditor(sourceProvider)).showErrorAndWarningAnnotations()//.showLineNumbers()
					.withParent(view);

			String[] code = generateCode(converter, fistLine, lastLine, isEffect);
			
			partialEditorModelAccess = embeddedEditor.createPartialEditor(code[0], code[1], code[2], true);
			viewer = embeddedEditor.getViewer();
			resourceEmbedded = sourceProvider.getResource();
			document = embeddedEditor.getDocument();
			parent.layout();
			try {
				viewer.getTextWidget().setText(viewer.getTextWidget().getText());
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		else
		{	
			String[] code = generateCode(converter, fistLine, lastLine, isEffect);
			partialEditorModelAccess.updateModel(code[0], code[1], code[2]);
			viewer.getTextWidget().setBackground(white);
			viewer.getTextWidget().setEditable(true);
			try {
				viewer.getTextWidget().setText(viewer.getTextWidget().getText());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	private String[] generateCode(DslConverter converter, int fistLine, int lastLine, boolean isEffect)
	{
		String prefix = "";
		String code = "";
		String suffix = "";
		boolean prefixPhase = true;
		for (int index = 0; index < converter.internalDsl.size();)
		{
			String line = converter.internalDsl.get(index);
			if ("yStateMachine".equals(line))
			{
				int statemachineindex;
				for (statemachineindex = index++; !"yStateMachineEnd".equals(converter.internalDsl.get(statemachineindex)); statemachineindex++);
				
				if (prefixPhase && fistLine > index && fistLine < statemachineindex)
				{
					prefixPhase = false;
					prefix += line + " yStateMachine ";
					prefix += "f1234";
					prefix += "{";
					prefix += "yRtc yEffect ";
					prefix += "yTransition";
					prefix += "{";	
					prefix += "}";
					prefix += "ySubvertex";
					prefix += "{";	
					prefix += "}";
					prefix += "yTrAttach";
					prefix += "{";	
					prefix += ", yTrAttachment ";
					prefix += "f12345";
					prefix += "{";
					if (isEffect)
					{
						prefix += "yGuard" + 
								"{" + 
								"true;" + 
								"}";
						prefix += "yEffects";
						prefix += "{";
						prefix += ", yEffect ";
						prefix += "f343";
						prefix += "{{\n";
						for (int i = fistLine; i <= lastLine ; i++) {
							code += converter.internalDsl.get(i) + "\n";
						}
					}
					else
					{
						prefix += "yGuard {\n";
						for (int i = fistLine; i <= lastLine ; i++) {
							code += converter.internalDsl.get(i) + "\n";
						}
						suffix +=		"}";
						suffix += "yEffects";
						suffix += "{";
						suffix += ", yEffect ";
						suffix += "f343";
						suffix += "{{";
					}
					
					suffix += "}}";
					
					suffix += "}";
					
					suffix += "}";
					
					suffix += "}";
					
					suffix += "}";
					suffix += "yStateMachineEnd ";
					
					index = statemachineindex + 1;
				}
				else
				{
					index = statemachineindex;
				}
				
			}
			else {
				if (prefixPhase)
					prefix += line + " ";
				else
					suffix += line + " ";
				index++;
			}
		}
		String[] result = {prefix, code, suffix};
		return result;
	}
	@Override
	public void createPartControl(Composite parent) {
		this.parent = parent;
		if (grey == null || white == null)
		{
			grey = new Color(Display.getCurrent(), 240, 240, 240);
			white = new Color(Display.getCurrent(), 255, 255, 255);
		}
//		injector = CoreModelDslActivator.getInstance()
//				.getInjector(CoreModelDslActivator.DEV_YAMM_COREMODELDSL_XYAMM);	
//		sourceProvider = injector.getInstance(YammResourceProvider.class);	
//		factory = injector.getInstance(EmbeddedEditorFactory.class);
	}

	private Composite createView(Composite parent) {
		Canvas can = new Canvas(parent, SWT.NULL);
		GridLayout gridLayout = new GridLayout();
		can.setLayout(gridLayout);
		GridData gridData = new GridData(GridData.HORIZONTAL_ALIGN_FILL);
		can.setLayoutData(gridData);
		return can;
	}

	@Override
	public void setFocus() {
	}
	
	public void goTo(int start, int length, boolean isEffect, boolean isGuard, String id, Object info)
	{
//		this.info = info;
		showsEffect = isEffect;
		showsGuard = isGuard;
		effectOrGuradID = id;
		
		offset = start;
		this.length = length;
		
		viewer.setVisibleRegion(start, length);		
		viewer.getTextWidget().setEditable(true);
	}
	
	public void doNotShowCode()
	{
		viewer.setVisibleRegion(0, 0);	
		viewer.getTextWidget().setEditable(false);
	}

	
	
	public void clear() 
	{
		if (partialEditorModelAccess != null)
		{
			partialEditorModelAccess.updateModel("yModel e {}");
			viewer.setVisibleRegion(0, 0);
			viewer.getTextWidget().setEditable(false);
			viewer.getTextWidget().setBackground(grey);
		}
	}
	
}
