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


import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.debug.internal.ui.SWTFactory;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Text;

/**
 * A page of Wizard {@link YAMMWizard} for creating a new YAMM Project.
 */
@SuppressWarnings("restriction")
public class YAMMWizardPage extends WizardPage 
{
	/** The name of the project. */
	public Text projectName;
	
	/** The name of the yamm file.*/
	public String yammFileName;
	
	/** the text holding the name of the yamm file as it is chosen by the user.*/
	private Text textYammName;
	
	/** Indicates whether it is a example model to load or if a new (empty) *.yamm file is to be created.*/ 
	public boolean isExampleModel;
	
	private boolean nameIsValid;
	
	private boolean diagramNameIsSet;
	
	public YAMMWizardPage(String pageName)
	{
		super(pageName, "Create a new empty YAMM Project or YAMM Example Project!", dev.yamm.init.Activator.getImageDescriptor("/icons/logoYammKlein.png"));
		setMessage("Enter name of the new project!" );
		setDescription("");
	}

	@Override
	public void createControl(Composite parent) 
	{
		Composite topLevelComp = new Composite(parent, SWT.NONE);
		setControl(topLevelComp);
		topLevelComp.setLayout(new GridLayout(1, true));
		topLevelComp.setFont(parent.getFont());

		// Create Modeling Group ************************************
		Group createSiriusGroup = SWTFactory.createGroup(topLevelComp, "Modeling Project", 2, 2, GridData.FILL_HORIZONTAL);
		
		Composite createProjectComposite = new Composite(createSiriusGroup, SWT.NONE);
		createProjectComposite = SWTFactory.createComposite(createSiriusGroup, parent.getFont(), 2, 1, GridData.FILL_HORIZONTAL, 0, 0);
		
		projectName = new Text(createProjectComposite, SWT.BORDER | SWT.SINGLE);
		projectName.setText("");
		projectName.setMessage("Enter new Project's name");
		GridData gd1 = new GridData(GridData.FILL_HORIZONTAL);
		projectName.setLayoutData(gd1);
		projectName.setVisible(true);
		
		// Create or load YAMM File Group***************************
		Group yammGroup = SWTFactory.createGroup(topLevelComp, "YAMM", 4, 2, GridData.FILL_HORIZONTAL);
		yammGroup.setVisible(false);
		
		//Case1:  New empty YAMM Project
		Button radioNewYAMM = new Button(yammGroup, SWT.RADIO);
		radioNewYAMM.setText("Create empty YAMM Project");
		
		Composite projectNameComp = new Composite(yammGroup, SWT.NONE);
		projectNameComp = SWTFactory.createComposite(yammGroup, parent.getFont(), 2, 2, GridData.FILL_HORIZONTAL, 0,0);

		textYammName = new Text(projectNameComp, SWT.BORDER | SWT.SINGLE);
		textYammName.setText("");
		textYammName.setMessage("Enter name of YAMM file");
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		textYammName.setLayoutData(gd);
		textYammName.setVisible(false);
		
		Button okButtonProjectName = new Button(projectNameComp, SWT.PUSH);
		okButtonProjectName.setText("OK");
		okButtonProjectName.setVisible(false);
		okButtonProjectName.setEnabled(false);
		
		//Case2: Load Example YAMM Project
		Button radioExampleYAMM = new Button(yammGroup, SWT.RADIO);
		radioExampleYAMM.setText("Load Example YAMM Project");
		final List list = new List (yammGroup, SWT.BORDER | SWT.SINGLE | SWT.V_SCROLL);
		list.setVisible(false);
		list.add("HelloWorld (einfach)");
		list.add("TagungsPlanung (einfach)");
		list.add("ZahlenSortieren (einfach)");
		list.add("ZeichenkettenSortieren (einfach)");
		list.add("ObjekteSortieren (fortgeschritten)");
		list.add("Geldautomat (fortgeschritten)");
		list.add("DESGeldautomat (fortgeschritten)");
		list.add("DESsortieren (fortgeschritten)");
		list.add("DESGravelShipping (fortgeschritten)");
		
		Button loadExampleButton = new Button(yammGroup, SWT.PUSH);
		loadExampleButton.setText("Load Example");
		loadExampleButton.setVisible(false);
		
		// Listener***********************************************
		textYammName.addKeyListener(new KeyListener() 
		{
			@Override
			public void keyPressed(KeyEvent e)
			{
			}

			@Override
			public void keyReleased(KeyEvent e) 
			{
				if  (!textYammName.getText().isEmpty())
				{
					okButtonProjectName.setEnabled(true);
				}
				else
				{
					okButtonProjectName.setEnabled(false);
				}
			}
		});
		
		projectName.addKeyListener(new KeyListener() 
		{
			@Override
			public void keyPressed(KeyEvent e)
			{
			}

			@Override
			public void keyReleased(KeyEvent e) 
			{
				if  (!projectName.getText().isEmpty())
				{
					if(validateName(projectName.getText()))
					{
						setErrorMessage(null);
						setMessage("Enter name of the new project!");
						yammGroup.setVisible(true);
						
						if (diagramNameIsSet)
						{
							setPageComplete(true);
						}
					}
					else
					{
						setErrorMessage("A project with that name already exists!");
						yammGroup.setVisible(false);
						setPageComplete(false);
					}
							
				}
				else
				{
					setPageComplete(false);
				}
			}
			/**
			 * Checks if a project with specified name already exists.
			 * 
			 * @param text: specified name
			 * @return true: name is valid, false: otherwise
			 */
			private boolean validateName(String text) 
			{
				IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(text);
				if (!project.exists()) 
				{
					nameIsValid = true;
					return nameIsValid;
				}
				else
				{
					nameIsValid = false;
					return false;
				}
			}
		});
		
		radioNewYAMM.addSelectionListener(new SelectionListener() 
		{
			@Override
			public void widgetSelected(SelectionEvent e) 
			{
				textYammName.setEnabled(true);
				textYammName.setVisible(true);
				textYammName.setText("");
				okButtonProjectName.setVisible(true);
				list.setVisible(false);
				loadExampleButton.setVisible(false);
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
		
		radioExampleYAMM.addSelectionListener(new SelectionListener() 
		{
			@Override
			public void widgetSelected(SelectionEvent e) 
			{
				textYammName.setVisible(false);
				textYammName.clearSelection();
				okButtonProjectName.setEnabled(false);
				okButtonProjectName.setVisible(false);
				list.setVisible(true);
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});


		list.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) 
			{
				loadExampleButton.setVisible(true);
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
		
		loadExampleButton.addSelectionListener(new SelectionListener()
		{
			@Override
			public void widgetSelected(SelectionEvent e) 
			{
				isExampleModel = true;
				yammFileName = list.getItem(list.getSelectionIndex());
				radioNewYAMM.setEnabled(false);
				list.setEnabled(false);
				loadExampleButton.setEnabled(false);
				radioExampleYAMM.setEnabled(false);
				diagramNameIsSet = true;
				if (!projectName.getText().isEmpty()
						&& nameIsValid)
					{
					setPageComplete(true);
					}
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		
		okButtonProjectName.addSelectionListener(new SelectionListener() 
		{
			
			@Override
			public void widgetSelected(SelectionEvent e)
			{
				isExampleModel = false;
				textYammName.setEnabled(false);
				okButtonProjectName.setEnabled(false);
				radioNewYAMM.setEnabled(false);
				list.setEnabled(false);
				loadExampleButton.setEnabled(false);
				radioExampleYAMM.setEnabled(false);
				yammFileName = textYammName.getText();
				diagramNameIsSet = true;
				
				if (!projectName.getText().isEmpty()
					&& nameIsValid)
				{
				setPageComplete(true);
				}
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		setPageComplete(false);

	}
}
