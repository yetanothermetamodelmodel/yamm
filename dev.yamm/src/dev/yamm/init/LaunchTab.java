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
package dev.yamm.init;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.internal.ui.SWTFactory;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.eclipse.ui.views.navigator.ResourceComparator;

import dev.yamm.ObjectDiagram.ObjectDiagram;
import dev.yamm.ObjectDiagram.ObjectDiagramFactory;
import dev.yamm.gui.ImageRegistryProvider;

/**
 * This class represents the launch configuration tab "YAMM Layer Configuration" which is shown in 
 * the configuration dialog. 
 * It implements functions needed for loading or creating YAMM Layer files for running/ debugging purposes. 
 * Layer Files give mainly access to a specified *.yamm model and contain information about simulation processes. 
 */
@SuppressWarnings("restriction")
public class LaunchTab extends AbstractLaunchConfigurationTab 
{
	/** The text control of the layer file.*/
	private Text layerText;
	
	/** The text field where the user can specify the path  to the *.rmof model*/
	private Text yammPath;
	
	/** The path to the *.yammdiagram model specified by the user and persisted in the *.lay file. */
	private String yammPathString;
	
	/** Receives the value a user wants to persist nsURI in layer file. Is initialized with a default value.*/
	private String nsURI = "http://www.yamm.dev/coreModelXmi/Yamm";
	
	/** Receives the value of the user un- /checking "Enable Breakpoints" (consider breakpoints during simulation process)
	 * first and persists it in *.lay file.*/
	private boolean breakpointEnabled;
	
	/**  Receives the waittime a user set in {@code Spinner} (waittime is set during simulation process)
	 * first and persists it in *.lay file.*/
	public int waittime;
	
	/** The PushButton to be pressed for selecting a YAMM Layer File out of the workspace.*/
	private Button fWorkspaceBrowse;
	
	/** A CheckButton for selecting automatic upload.*/
	private Button fAutomaticUpload;
	
	/** Composite containing controls for getting a given *.lay file.*/
	private Composite getLayerFile = null;
	
	/** Composite containing controls for creating a .*lay file.*/
	private Composite createLayerFile = null;

	
	/**
	 * Creates the controls for the YAMM Layer Configuration tab for either creating
	 * a *.lay file or loading a given .*lay file.
	 * 
	 * @param parent the top level control
	 */
	@Override
	public void createControl(Composite parent)
	{
		Composite compOverall = new Composite(parent, SWT.NONE);
		setControl(compOverall);
		compOverall.setLayout(new GridLayout(1, true));
		compOverall.setFont(parent.getFont());
		
		Composite compLayerFile = new Composite(compOverall, SWT.NONE);
		compLayerFile.setLayout(new GridLayout(1, true));
		compLayerFile.setFont(compOverall.getFont());	
		Group groupLayerFile = SWTFactory.createGroup(compOverall, "YAMM Layer File", 1, 2, GridData.FILL_HORIZONTAL);
		compLayerFile = SWTFactory.createComposite(groupLayerFile, parent.getFont(), 3, 3, GridData.FILL_HORIZONTAL, 0, 0);
		
		// Create Layer File
		Button buttonCreateLayerFile = new Button(groupLayerFile, SWT.RADIO);
		buttonCreateLayerFile.setText("Create/ Modify Layer File");
		buttonCreateLayerFile.setSelection(true);
		
		createLayerFile = new Composite(compOverall, SWT.NONE);
		createLayerFile = SWTFactory.createComposite(groupLayerFile, parent.getFont(), 3, 3, GridData.FILL_HORIZONTAL, 50, 10);
		
		yammPath = SWTFactory.createSingleText(createLayerFile, 4);
		yammPath.setToolTipText("Specify path to .yammdiagram file");
		yammPath.setMessage("\\ModelProject\\model.yammdiagram");
		yammPath.addListener(SWT.KeyUp, new Listener()
		{
			@Override
			public void handleEvent(Event event) 
			{
				updateLaunchConfigurationDialog();	
				yammPathString = yammPath.getMessage();
			}
		});
		
		Button browseRmofPath = createPushButton(createLayerFile, "Browse", null); 
        browseRmofPath.addSelectionListener(new SelectionAdapter() 
        {
            @Override
			public void widgetSelected(SelectionEvent e) 
            {
                ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(getShell(), new WorkbenchLabelProvider(), 
                		new WorkbenchContentProvider());
                dialog.setTitle("Workspace"); 
                dialog.setMessage("Select a *.yammdiagram file ..."); 
                dialog.setInput(ResourcesPlugin.getWorkspace().getRoot()); 
                dialog.setComparator(new ResourceComparator(ResourceComparator.NAME));
                if (dialog.open() == IDialogConstants.OK_ID) 
                {
                    IResource resource = (IResource) dialog.getFirstResult();
                    String fullPath = resource.getFullPath().toString();
                    yammPath.setText(fullPath);
                }
                updateLaunchConfigurationDialog();
            }
        });
        
        final Text nsURIText = SWTFactory.createSingleText(createLayerFile, 4);
        nsURIText.setText(nsURI);
        nsURIText.setToolTipText("http://www.yamm.dev/coreModelXmi/Yamm");
        nsURIText.addListener(SWT.KeyUp, new Listener()
		{
			@Override
			public void handleEvent(Event event) 
			{
				updateLaunchConfigurationDialog();		
				nsURI = nsURIText.getText();
			}
		});
        
        Button buttonBreakpoints = new Button(createLayerFile, SWT.CHECK);
        buttonBreakpoints.setText("Enable Breakpoints");
        buttonBreakpoints.addSelectionListener(new SelectionAdapter() 
        {
        	@Override
        	public void widgetSelected(SelectionEvent e) 
        	{
        		Button source = (Button) e.getSource();
				if (source.getSelection())
				{
					breakpointEnabled = true;
				}
        	}
		});
		
        
        Spinner waittimeSpinner = new Spinner(createLayerFile, 0);
        waittimeSpinner.setMinimum(0);
        waittimeSpinner.setMaximum(10000);
        waittimeSpinner.setSelection(0);
        waittimeSpinner.addSelectionListener(new SelectionAdapter()
        {
        	@Override
        	public void widgetSelected(SelectionEvent e) 
        	{
        		Spinner spinner = (Spinner) e.getSource();
        		waittime = spinner.getSelection();
        	}
		});
        Label labelSpinner = new Label(createLayerFile, SWT.NONE);
        labelSpinner.setText("Set Waittime (ms)");
        
		recursiveEnableComposite(createLayerFile, true);
		
		buttonCreateLayerFile.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) 
			{
				Button source = (Button) e.getSource();
				if(source.getSelection())
				{
					recursiveEnableComposite(createLayerFile, true);
					recursiveEnableComposite(getLayerFile, false);
				}
			}
		});
		Button buttonLayerCreated = createPushButton(createLayerFile, "Create Layer File", ImageRegistryProvider.getImage("icons/cakeSmall.png"));
		buttonLayerCreated.addSelectionListener(new SelectionAdapter()
		{
			@Override
			public void widgetSelected(SelectionEvent e) 
			{
				createNewLayerFile(e);
			}
		});
		
		//get a given Layer File
		Button buttonGetLayerFile = new Button(groupLayerFile, SWT.RADIO);
		buttonGetLayerFile.setText("Get Layer File");
		
		getLayerFile = new Composite(compOverall, SWT.NONE);
		getLayerFile = SWTFactory.createComposite(groupLayerFile, parent.getFont(), 3, 3, GridData.FILL_HORIZONTAL, 50, 10);
		layerText = SWTFactory.createSingleText(getLayerFile, 4);
		layerText.setToolTipText("Set the YAMM Layer Configuration File (relative to workspace)");
		
		buttonGetLayerFile.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) 
			{
				Button source = (Button) e.getSource();
				if(source.getSelection())
				{
					recursiveEnableComposite(getLayerFile, true);
					recursiveEnableComposite(createLayerFile, false);
				}
			}
		});
		layerText.addListener(SWT.KeyUp, new Listener()
		{
			@Override
			public void handleEvent(Event event) 
			{
				updateLaunchConfigurationDialog();		
			}
		});
		fWorkspaceBrowse = createPushButton(getLayerFile, "Browse", null); 
		recursiveEnableComposite(getLayerFile, false);
        fWorkspaceBrowse.addSelectionListener(new SelectionAdapter() 
        {
            @Override
			public void widgetSelected(SelectionEvent e) 
            {
                ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(getShell(), new WorkbenchLabelProvider(), 
                		new WorkbenchContentProvider());
                dialog.setTitle("Workspace"); 
                dialog.setMessage("Select a YAMM Layer File ..."); 
                dialog.setInput(ResourcesPlugin.getWorkspace().getRoot()); 
                dialog.setComparator(new ResourceComparator(ResourceComparator.NAME));
                if (dialog.open() == IDialogConstants.OK_ID) 
                {
                    IResource resource = (IResource) dialog.getFirstResult();
                    String fullPath = resource.getFullPath().toString();
                    //String fileLoc = Activator.getDefault().getStringVariableManager().generateVariableExpression("workspace_loc", arg); //$NON-NLS-1$
                    layerText.setText(fullPath);
                }
                updateLaunchConfigurationDialog();
            }
        });
        
        Composite compAutomaticUpload = new Composite(compOverall, SWT.NONE);
		compAutomaticUpload.setLayout(new GridLayout(1, true));
		compAutomaticUpload.setFont(parent.getFont());		
        Group groupAutomaticUpload = SWTFactory.createGroup(compAutomaticUpload, "Connected Data Objects",
        		1, 2, GridData.FILL_HORIZONTAL);
        compAutomaticUpload = SWTFactory.createComposite(groupAutomaticUpload, parent.getFont(), 3, 3, GridData.FILL_BOTH, 0, 0);
        fAutomaticUpload = createCheckButton(compAutomaticUpload, "Automatic Upload");
        fAutomaticUpload.addSelectionListener(new SelectionAdapter()
        {
            @Override
			public void widgetSelected(SelectionEvent e)
            {
                updateLaunchConfigurationDialog();
            }
        });
	}
	

	/**
	 * Creates a new .lay file according to file path and operation system.
	 * 
	 * @param e : "Create Layer File" button has been pressed
	 */
	protected void createNewLayerFile(SelectionEvent e) 
	{
		MessageBox dialog = new MessageBox(getShell(), SWT.ICON_QUESTION | SWT.OK| SWT.CANCEL);
		yammPathString = yammPath.getText();
		if (yammPathString != null
				&& nsURI != null)
		{
			if (new File(ResourcesPlugin.getWorkspace().getRoot().getLocation().toString() + yammPathString).exists()
					&& yammPathString.endsWith("yammdiagram"))
			{
				
				File parent = new File(ResourcesPlugin.getWorkspace().getRoot().getLocation().toString() + yammPathString).getParentFile();
				File layFile = new File(parent.getAbsolutePath().toString() + File.separator + "model.lay");
				java.net.URI uriParent = parent.toURI();
				String path = uriParent.getPath();
				String[] segments = path.split("/");
				String layPath = segments[segments.length-1];
				
				String yammModelName = yammPathString.substring(yammPathString.lastIndexOf("/") + 1, yammPathString.lastIndexOf("."));
				File objectdiagramFile = new File(parent.getAbsolutePath().toString() + File.separator + yammModelName + ".objectdiagram");
				
				List<String> lines = Arrays.asList(yammPathString
						, nsURI
						, String.valueOf(breakpointEnabled)
						, String.valueOf(waittime)
						, "true"
						, "true"
						, "/" + layPath + "/" + yammModelName + ".objectdiagram");
				
				if (!objectdiagramFile.exists())
				{

					ObjectDiagram od = ObjectDiagramFactory.eINSTANCE.createObjectDiagram();

					Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("objectdiagram", new XMIResourceFactoryImpl());
					ResourceSet resSet = new ResourceSetImpl();
					Resource resource = resSet.createResource(URI.createFileURI(path + File.separator + yammModelName + ".objectdiagram"));

					resource.getContents().add(od);
					try
					{
						resource.save(Collections.EMPTY_MAP);
					}
					catch (IOException e3)
					{
						e3.printStackTrace();
					}



					dev.yamm.objectDiagram.design.Services objectDiagramServices = new dev.yamm.objectDiagram.design.Services();
					String relativePath = yammPathString.substring(1);
					relativePath = relativePath.substring(relativePath.indexOf("/") + 1);
					od.setYammModelPath(relativePath);
					objectDiagramServices.loadYammModel(od, layPath);

					try
					{
						resource.save(Collections.EMPTY_MAP);
					}
					catch (IOException e3)
					{
						e3.printStackTrace();
					}



				}
				
				try
				{	
					PrintWriter writer = new PrintWriter(layFile, "UTF-8");
					for(String s:lines)
					{
						writer.println(s);
					}
					writer.flush();
					try 
					{
						ResourcesPlugin.getWorkspace().getRoot().refreshLocal(0, null);
					} 
					catch (CoreException e1)
					{
						e1.printStackTrace();
					}
					
					layerText.setText("/"+layPath+"/model.lay");
					updateLaunchConfigurationDialog();
				}
				catch (FileNotFoundException | UnsupportedEncodingException e1) 
				{
					e1.printStackTrace();
				}
				
				IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(layPath);
				try {
					project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
				} catch (CoreException e2) {
					e2.printStackTrace();
				}
			}
			else
			{
				dialog.setText("File ' " + yammPathString + " ' does not exist or is not a *.yammdiagram File!");
				dialog.open();
			}
		}
		else
		{
			dialog.setText("Path to *.yammdiagram File and nsURI is not defined!");
			dialog.open();
		}
			
	}


	/**
	 * Disables the layer composites  at the beginning.
	 * Enables the specific composite depending on which one
	 * has been chosen via the layer buttons in the launch configuration.
	 * 
	 * @param enabled
	 */
	private void recursiveEnableComposite(Control c, boolean enabled)
	{
		if (c instanceof Composite)
		{
			Composite composite = (Composite) c;
			for (Control control : composite.getChildren())
			{
				recursiveEnableComposite(control, enabled);
			}
		}
		else
			c.setEnabled(enabled);
	}
	
	
	/**
	 * Returns the name of this tab.
	 * 
	 * @return the name of this launch configuration tab
	 */
	@Override
	public String getName()
	{
		return "YAMM Layer Configuration"; 
	}
	
	/**
	 * The place where the controls of the launch configuration are initialized with values. 
	 * The method is called when a launch configuration is selected to be displayed. 
	 * 
	 * @param configuration	: the specific launch configuration.
	 */
	@Override
	public void initializeFrom(ILaunchConfiguration configuration) 
	{ 
		String layerfile = null;
		Boolean automaticUpload = null;
		try
		{
			layerfile = configuration.getAttribute(LaunchConfigurationConstants.L_PATH, "");
			automaticUpload = configuration.getAttribute(LaunchConfigurationConstants.L_AUTOMATIC_UPDATES, false); 
		} 
		catch (CoreException e) 
		{
		}
		layerText.setText(layerfile);
		fAutomaticUpload.setSelection(automaticUpload); 
	}
	
	/**
	 * Puts the values of tab "YAMM Launch Configuration" into the current launch configuration.
	 * 
	 * @param configuration	: the specific launch configuration.
	 */
	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) 
	{
		configuration.setAttribute(LaunchConfigurationConstants.L_PATH, layerText.getText());
		configuration.setAttribute(LaunchConfigurationConstants.L_AUTOMATIC_UPDATES, fAutomaticUpload.getSelection());
	}

	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration)
	{
		//System.out.println("TestsetDefaults");
	}

}
