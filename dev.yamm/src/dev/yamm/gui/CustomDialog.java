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
package dev.yamm.gui;

import java.io.IOException;
import java.lang.reflect.Field;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.SWTError;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.*;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.generator.InMemoryFileSystemAccess;
import org.eclipse.xtext.ui.editor.XtextSourceViewer;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditor;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorFactory;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorModelAccess;
import org.eclipse.xtext.ui.editor.model.XtextDocument;

import com.google.inject.Injector;

import dev.yamm.util.evalGrammar.EvalResourceProvider;
import dev.yamm.util.evalGrammar.ui.internal.EvalGrammarActivator;



public class CustomDialog extends Dialog {
	private Shell shell;
	private String nameOfColumn;
	private String xTextCode;
	private String javaCode;

	public CustomDialog(Shell parent) {
		// Pass the default styles here
		this(parent, SWT.DIALOG_TRIM | SWT.APPLICATION_MODAL);
		shell = parent;
	}
	
	public CustomDialog(Shell parent, String nameOfColumn, String xTextCode) {
		this(parent, SWT.DIALOG_TRIM | SWT.APPLICATION_MODAL);
		shell = parent;
		this.nameOfColumn = nameOfColumn;
		this.xTextCode = xTextCode;
		
	}

	public CustomDialog(Shell parent, int style) {
		// Let users override the default styles
		super(parent, style);
		shell = parent;
	}

	public void open() {
		shell.setText(getText());
		createContents(shell);
		shell.pack();
		shell.open();
		Display display = getParent().getDisplay();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Creates the dialog's contents
	 * 
	 * @param shell the dialog window
	 */
	@SuppressWarnings("restriction")
	private void createContents(final Shell shell) {
		shell.setLayout(new GridLayout());
		
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		layout.horizontalSpacing = 0;
		
		Composite top = new Composite(shell, SWT.NONE);
		top.setLayout(layout);

		Label nameOfColumnLabel = new Label(top, SWT.NONE);
		nameOfColumnLabel.setText("Name of the column: ");
		
		GridData columnNameInputGridData = new GridData();
		columnNameInputGridData.heightHint = 20;
		columnNameInputGridData.widthHint = 400;
				
		Text nameOfColumnText = new Text(top, SWT.NONE);
		nameOfColumnText.setToolTipText("Please enter a column name");
		nameOfColumnText.setLayoutData(columnNameInputGridData);

//---------------------------------------------------Editor---------------------------------------------------------------------        
		ScrolledComposite mid = new ScrolledComposite(shell, SWT.H_SCROLL | SWT.V_SCROLL);
		mid.setExpandHorizontal(true);
		mid.setExpandVertical(true);
		mid.setLayout(new GridLayout());
		GridDataFactory.fillDefaults().grab(true, true).applyTo(mid);

		Group view = new Group(mid, SWT.NULL);
		mid.setContent(view);
		view.setText("Queues");
		GridLayout gridLayout = new GridLayout();
		view.setLayout(gridLayout);
		GridData gridData = new GridData(GridData.HORIZONTAL_ALIGN_FILL);
		view.setLayoutData(gridData);

		Injector injector = EvalGrammarActivator.getInstance()
				.getInjector(EvalGrammarActivator.DEV_YAMM_UTIL_EVALGRAMMAR_EVAL);
		EvalResourceProvider resourceProvider = injector.getInstance(EvalResourceProvider.class);
		EmbeddedEditorFactory factory = injector.getInstance(EmbeddedEditorFactory.class);
		EmbeddedEditor embeddedEditor = factory.newEditor(resourceProvider).showErrorAndWarningAnnotations()
				.withParent(view);
		EmbeddedEditorModelAccess partialEditorModelAccess = embeddedEditor.createPartialEditor("{", " ", "}", true);
		XtextSourceViewer viewer = embeddedEditor.getViewer();
		StyledText text = viewer.getTextWidget();
		if(xTextCode != null) {
			text.setText(xTextCode);
		}
		try {
			Font font = text.getFont();
			if (null != font) {
				// TODO preliminary, use editor configuration instead
				FontData[] fontData = font.getFontData();
				if (null != fontData && fontData.length > 0) {
					text.setFont(
							new Font(font.getDevice(), "Consolas", fontData[0].getHeight(), fontData[0].getStyle()));
				}
			}
		} catch (SWTError e) {
			// no font, ignore

		}

//----------------------------------------Buttons--------------------------------------------------------

		Composite bottom = new Composite(shell, SWT.NONE);
		bottom.setLayout(new GridLayout(2, false));

		Button save = new Button(bottom, SWT.PUSH);
		save.setText("save");
		save.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				if (!nameOfColumnText.getText().isEmpty()) {
					nameOfColumn = nameOfColumnText.getText();
					xTextCode = text.getText();
					XtextDocument doc = embeddedEditor.getDocument();
					Field field;
					try {
						field = doc.getClass().getDeclaredField("resource");
						field.setAccessible(true);
						Resource resource = (Resource) field.get(doc);
						
						IGenerator generator = injector.getInstance(IGenerator.class);
						InMemoryFileSystemAccess fsa = injector.getInstance(InMemoryFileSystemAccess.class);
						generator.doGenerate(resource, fsa);
						javaCode = fsa.getTextFiles().values().iterator().next().toString();
						javaCode = javaCode.replaceAll("_Ouput_Eval", "_Ouput_Eval_" + nameOfColumn);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					shell.close();
				} else {
					MessageDialog.openError(shell, "Empty name", "Please enter a name for the new column");
				}
			}
		});

		Button cancel = new Button(bottom, SWT.PUSH);
		cancel.setText("cancel");
		cancel.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				shell.close();
			}
		});
	}
	
	
	
	public String getNameOfColumn() {
		return nameOfColumn;
	}

	public void setNameOfColumn(String nameOfColumn) {
		this.nameOfColumn = nameOfColumn;
	}

	public String getxTextCode() {
		return xTextCode;
	}

	public void setxTextCode(String xTextCode) {
		this.xTextCode = xTextCode;
	}

	public String getJavaCode() {
		return javaCode;
	}
	

}
