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
package online.yamm.gui;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IWorkbench;

import online.yamm.buildpath.YAMMProjectCreator;

/**
 * A wizard for creating a new YAMM Project via standard dialog for new projects:
 * <p>right click Project Explorer > new > Project > other > YAMM Project<p>
 */
public class YAMMWizard extends Wizard implements org.eclipse.ui.IWorkbenchWizard
{

	/** Creates the project.*/
	public YAMMProjectCreator projectCreator;
	
    protected YAMMWizardPage yammWizardPage;

    /**
     * Standard constructor.
     */
    public YAMMWizard() 
    {
        super();
        setNeedsProgressMonitor(true);
    }

    @Override
    public String getWindowTitle() 
    {
        return "YAMM";
    }

    @Override
    public void addPages() 
    {
        yammWizardPage = new YAMMWizardPage("First Page");
        addPage(yammWizardPage);
    }

    @Override
    public boolean performFinish() 
    {
        String filePath = "/home/ai/arbeit/log/wizard.txt";
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath));) {
       	 bufferedWriter.append("start" + "\n");
        } catch (Exception e) {
       	 
        }
    	projectCreator = new YAMMProjectCreator();
    	IRunnableWithProgress runnableWithProgress = new IRunnableWithProgress()
    	{
			@Override
			public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
            	try 
        		{
        			projectCreator.createYAMMProject(yammWizardPage.projectName.getText(), yammWizardPage.yammFileName, yammWizardPage.isExampleModel);
        		} catch (CoreException e1) 
        		{
        			e1.printStackTrace();
        		}
			}
    };
    try {
		getContainer().run(false, false, runnableWithProgress);
	} catch (InvocationTargetException | InterruptedException e) {
		e.printStackTrace();
	}
    try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath));) {
      	 bufferedWriter.append("finish" + "\n");
       } catch (Exception e) {
      	 
       }
        return true;
    }

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// TODO Auto-generated method stub
		
	}

}
