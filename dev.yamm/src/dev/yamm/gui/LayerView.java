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



import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Level;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuCreator;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.CheckboxCellEditor;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.events.VerifyListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IPerspectiveDescriptor;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PerspectiveAdapter;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.ViewPart;

import dev.yamm.ConfigurationManagement;
import dev.yamm.ResourceManagement;
import dev.yamm.coreModelDiagram.yammDiagram.YClass;
import dev.yamm.coreModelDiagram.yammDiagram.YModel;
import dev.yamm.coreModelDiagram.yammDiagram.YOperation;
import dev.yamm.coreModelDiagram.yammDiagram.YPackage;
import dev.yamm.coreModelDiagram.yammDiagram.YPackageableElement;
import dev.yamm.coreModelDiagram.yammDiagram.YParameter;
import dev.yamm.init.Activator;
import dev.yamm.logger.YAMMLogger;
import dev.yamm.preferencePage.PreferenceConstants;


public class LayerView extends ViewPart 
{
	private static final String ICONS_TERMINATE_AND_DONE_CHART_GIF = "icons/terminateAndDone_Chart.gif"; //$NON-NLS-1$
	private static final String ICONS_SUSPEND_CHART_GIF = "icons/suspend_Chart.gif"; //$NON-NLS-1$
	private static final String ICONS_STEPRETURN_CHART_GIF = "icons/stepreturn_Chart.gif"; //$NON-NLS-1$
	private static final String ICONS_STEPOVER_CHART_GIF = "icons/stepover_Chart.gif"; //$NON-NLS-1$
	private static final String ICONS_STEPINTO_CHART_GIF = "icons/stepinto_Chart.gif"; //$NON-NLS-1$
	private static final String ICONS_TERMINATE_CHART_GIF = "icons/terminate_Chart.gif"; //$NON-NLS-1$
	private static final String ICONS_RUN_CHART_GIF = "icons/run_Chart.gif"; //$NON-NLS-1$
	private static final String ICONS_SAVEAS_EDIT_GIF = "icons/saveas_edit.gif"; //$NON-NLS-1$
	private static final String ICONS_SAVE_EDIT_GIF = "icons/save_edit.gif"; //$NON-NLS-1$
	private static final String ICONS_SAVE_EDIT_DISABLED_GIF = "icons/save_edit_disabled.gif"; //$NON-NLS-1$
	private static final String ICONS_DOWNLOAD_CDO_GIF = "icons/download_CDO.gif"; //$NON-NLS-1$
	private static final String ICONS_UPLOAD_CDO_GIF = "icons/upload_CDO.gif"; //$NON-NLS-1$
	private static final String ICONS_REFRESH_BID_GIF = "icons/refresh_bid.gif"; //$NON-NLS-1$
	private static final String ICONS_REFRESH_OFF_GIF = "icons/refresh_off.gif"; //$NON-NLS-1$

	public static YAMMLogger logger = YAMMLogger.getYAMMLogger("YAMM Log"); //$NON-NLS-1$
	private TableViewer viewer;
	public static LayerView instance;
	private static Action actionStart; 
	private static Action actionStop;
	private static Action actionStepInto;
	private static Action actionStepOver;
	private static Action actionStepReturn;
	private Action generateEcore;
	private Action add;
	private Action delete;
	private Action edit;
	private static Action CDO_upload;
	private Action auto_upload;
	private static Action CDO_download;
	private static Action load;
	private Action save;
	private Action save_as;
	
	/**The layer file name (according to the path to the .lay file).*/
	private static String layerFileName = ""; //$NON-NLS-1$
	private String openedFile = ""; //$NON-NLS-1$
	private String keyPrefix = "Ctrl+Alt+"; //$NON-NLS-1$
	
	// log level related
	private SelectionListener secListener;
	private DropDownAction logMenu;
	private String layFilePath;

	// current simulation state
	/**Indicates whether a Simulation is running or not.*/
	public static boolean run;
	/**Indicates if {@link Layer # Simulation as running.*/
	public static boolean runWaitTime;
	/** Indicates if a return action is possible - true when a state machine has been called by another one*/
	public static boolean returnEnabled = false;
	/**Communicates with YammDebugModel: Only if step is true - a YAMMThread is suspended!*/
	public static boolean step = false;
	/** Indicates if the simulation pauses (when {@link dev.yamm.operations.ChartOperation #breakpoint()} has been called}.*/
	public static boolean breakActive;
	/**Marks a simulation as running (true) or pausing (false).*/
	public static boolean runWaitTimeStop = false;
	/** Indicates if a Simulation reached its final state*/
	public static boolean blueStop = false; 
	
	/**The implementation of the TextFields controller part. */
	private static TextInputField textInputField;
	
	/**The current state object of the Simulation. Sets the default state of {@link #simulationState}.*/ 
	private static SimulationState simulationState = SimulationNotYetStarted.getInstance();
	
	/** */
	public static ResourceManagement yamm = new ResourceManagement();
	
	/** Top level window of workbench */
	static IWorkbenchWindow myWorkBenchWindow = null;
    
	/** Indicates if a breakpointIsHit. */
	public static boolean breakpointIsHit = false;
	
	public boolean useParameter = false;

	public Map<String, Text> parameterTextLabels = null;
	/**
	 * Creates the controls for the Layer View. The created view consists
	 * of an upper part (a text input field) and the lower part. The lower part has 
	 * a table where the layer(s) to be loaded can be specified
	 * and several modes can be chosen too.
	 */
	@Override
	public void createPartControl(Composite parent)
	{
		TabFolder tabFolder = new TabFolder(parent, SWT.BORDER);
		TabItem tabItemDebug = new TabItem(tabFolder, SWT.NONE);
		tabItemDebug.setText("Debug");
		
		TabItem tabItemLaboratory = new TabItem(tabFolder, SWT.NONE);  
		tabItemLaboratory.setText("Laboratory");
		
		TabItem tabItemResult = new TabItem(tabFolder, SWT.NONE);  
		tabItemResult.setText("Result");
		
		LayerViewLaboratory laboratory = new LayerViewLaboratory(tabItemLaboratory, tabFolder);
		LayerViewPivotGrid pivotGrid = new LayerViewPivotGrid(tabItemResult, tabFolder);
		
		instance = this;
		setIWorkBenchWindow();
		if (yamm == null)
			yamm = new ResourceManagement();

		//reset
		yamm.reflectivStateChart.objectManagement.getViewLayers().clear();
/*	
		tabFolder = new CTabFolder(parent, SWT.NONE);
		CTabItem tab = new CTabItem(tabFolder, SWT.NONE);
		tab.setText("tab1");
*/
		SashForm form = new SashForm(tabFolder,SWT.VERTICAL);
		form.setLayout(new FillLayout());
		tabItemDebug.setControl(form);
		
		Composite top = new Composite(form, SWT.NONE);
		top.setLayout(new GridLayout(1,false));
		top.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, true)); 
		createSearchAndExecuteField(top);

		Composite bottom = new Composite(form, SWT.NONE);
		bottom.setLayout(new GridLayout(1,false));
		bottom.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, true));

		viewer = new TableViewer(bottom, SWT.BORDER | SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION);
		viewer.setUseHashlookup(true);
		viewer.setContentProvider(new ViewContentProvider());
		ViewLabelProvider labelProv = new ViewLabelProvider();
		viewer.setLabelProvider(labelProv);
		viewer.setInput(yamm.reflectivStateChart.objectManagement.getViewLayers());

		Table table = viewer.getTable();
		table.setHeaderVisible(true);
		table.setLayout(new GridLayout(1,false));
		table.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, true));

		//Create columns
		TableColumn column = new TableColumn(table, SWT.LEFT, 0);
		column.setText(Messages.columnLayerfile);
		column.setWidth(250);
		column = new TableColumn(table, SWT.LEFT, 1);
		column.setText(Messages.columnNsURI);
		column.setWidth(250);
		column = new TableColumn(table, SWT.LEFT, 2);
		column.setText(Messages.columnBreaks);
		column.setWidth(80);
		column = new TableColumn(table, SWT.LEFT, 3);
		column.setText(Messages.columnWait);
		column.setWidth(80);
		column = new TableColumn(table, SWT.LEFT, 4);
		column.setText(Messages.columnColor);
		column.setWidth(80);
		column = new TableColumn(table, SWT.LEFT, 5);
		column.setText(Messages.columnLogLayer);
		column.setWidth(80);
		column = new TableColumn(table, SWT.LEFT, 6);
		column.setText(Messages.columnStep_wait);
		column.setWidth(80);

		String[] columnNames = new String[7];
		columnNames[0] = Messages.columnLayerfile;
		columnNames[1] = Messages.columnNsURI;
		columnNames[2] = Messages.columnBreaks;
		columnNames[3] = Messages.columnWait;
		columnNames[4] = Messages.columnColor;
		columnNames[5] = Messages.columnLogLayer;
		columnNames[6] = Messages.columnStep_wait;
		viewer.setColumnProperties(columnNames);

		// Create the cell editors
		CellEditor[] editors = new CellEditor[7];

		editors[0] = null;
		// Column 1 : nsURIs
		TextCellEditor textEditorURI = new TextCellEditor(table);
		editors[1] = textEditorURI;
		// Column 2 : Breaks(Checkbox
		editors[2] = new CheckboxCellEditor(table);
		// Column 3 : Wait (Digits)
		TextCellEditor textEditor = new TextCellEditor(table);
		((Text) textEditor.getControl()).addVerifyListener(			
				new VerifyListener() {
					public void verifyText(VerifyEvent e) {
						e.doit = "0123456789".indexOf(e.text) >= 0;   //$NON-NLS-1$
					}
				});
		editors[3] = textEditor;
		// Column 4 : Should be colored
		editors[4] = new CheckboxCellEditor(table);
		// Column 5 : log this layer
		editors[5] = new CheckboxCellEditor(table);
		// Column 6 : Step/Wait Checkbox
		editors[6] = new CheckboxCellEditor(table);

		// Assign the cell editors to the viewer 
		viewer.setCellEditors(editors);
		// Set the cell modifier for the viewer
		viewer.setCellModifier(new LayerCellModifier(columnNames, this));    

		form.setWeights(new int[] {10,40});

		
		makeActions();
		makeListener();
		//*****************LayerView controls deactivated
		//contributeToActionBars();
		//***********************************************
		hookItemContextMenu();
		hookCloseListener();
		hookDoubleClickListener();
			
		
//---------------------------------------------------------------------------------------------------
/*		
		
		parameterTab = new CTabItem(tabFolder, SWT.NONE);
		parameterTab.setText("tab2");
		
		SashForm form2 = new SashForm(tabFolder,SWT.HORIZONTAL);
		form2.setLayout(new FillLayout());
		parameterTab.setControl(form2);
		
		useParameter = false;
		
		Button button = new Button(form2, SWT.NONE);
		button.setText("load");
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				refreshParameter();
			}
		});
	*/			
		viewer.refresh();	
	}


	/*public void refreshParameter()
	{
		useParameter = false;
		EObject model = null;
		
		String path = yamm.reflectivStateChart.objectManagement.getViewLayers().get(0).getPath();
		path = path.replace("__TMP__.xyamm", ".yammdiagram");
		path = path.replace("/", File.separator); path = path.replace("\\", File.separator);
		path = path.replace(File.separator, "/");
		
		for (Session session : SessionManager.INSTANCE.getSessions())
		{
			for(Resource resource : session.getSemanticResources())
			{
				if (resource.getURI().toString().contains(path))
				{
					model = resource.getContents().get(0);
					IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
					for (IEditorPart dirtyEditor : page.getDirtyEditors())
					{
						if (dirtyEditor instanceof DDiagramEditor)
						{
							DRepresentation rep = ((DDiagramEditor) dirtyEditor).getRepresentation();
							if (rep instanceof DSemanticDiagram)
							{
								EObject semRootElem = ((DSemanticDiagram) rep).getTarget();
								String uri = semRootElem.eResource().getURI().toString();
								if (uri.contains(path))
								{
									// TODO: alert
									logger.error("save diagram!");
									return;
								}
							}
						}
					}
				}
			}
		}
		if (model == null)
		{
			// TODO: alert
			logger.error("open diagram!");
			return;
		}
		/*
		SashForm form2 = new SashForm(tabFolder,SWT.HORIZONTAL);
		form2.setLayout(new FillLayout());
		
		Button button = new Button(form2, SWT.NONE);
		button.setText("reload");
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				refreshParameter();
			}
		});
		
		if (model instanceof YModel)
		{
			YModel ymodel = (YModel) model;
			List<YParameter> parameters = findInitParameter(ymodel);
			if (parameters.isEmpty())
				return;	
			
			parameterTextLabels = new HashMap<>();
			for (YParameter parameter : parameters)
			{
				parameter.getName();
				Label label = new Label(form2, SWT.BORDER);
				label.setText(parameter.getName());
				Text text = new Text(form2, SWT.BORDER);
				parameterTextLabels.put(parameter.getName(), text);
			}
			
			(button = new Button(form2, SWT.CHECK);
			button.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					if(((Button) e.getSource()).getSelection())
						useParameter = true;
					else
						useParameter = false;
				}
			});	
		}
		parameterTab.setControl(form2);
	}
	*/
	private List<YParameter> findInitParameter(YModel ymodel)
	{
		for (YClass yclass : ymodel.getClazz())
		{
			for (YOperation yoperation : yclass.getOwnedOperation())
			{
				if (yoperation.getStateMachine().isDesInitializer())
				{
					return yoperation.getOwnedParameter();
				}
			}
		}
		for (YPackage pack : ymodel.getPackages())
		{
			return findInitParameterRecusive(pack);
		}
		
		return new ArrayList<>();
	}
	
	private List<YParameter> findInitParameterRecusive(YPackage ypackage)
	{
		for (YPackageableElement element : ypackage.getOwnedMemberPackage())
		{
			if (element instanceof YPackage)
			{
				List<YParameter> ret = findInitParameterRecusive((YPackage) element);
				if (!ret.isEmpty())
					return ret;
			}
			else if (element instanceof YClass)
			{
				for (YOperation yoperation : ((YClass) element).getOwnedOperation())
				{
					if (yoperation.getStateMachine().isDesInitializer())
					{
						return yoperation.getOwnedParameter();
					}
				}
			}
		}
		
		return new ArrayList<>();
	}

	/**
	 * Creates a new {@code TextInputField} object, as the implementation of the 
	 * text fieldÂ´s controller part.
	 * 
	 * @param top	: 	the text input field
	 */
	private void createSearchAndExecuteField(Composite top) 
	{
		textInputField = new TextInputField(top, yamm); 	
	}

	/**
	 * Adds a {@link #PerspectiveListener}. 
	 */
	private void hookCloseListener() {
		addListenerObject(new PerspectiveListener());
	}


	/**
	 * Notifies when a perspective is closed and informs {@link #dev.yamm.CDO.Management}
	 * to close CDO.
	 */
	public class PerspectiveListener extends PerspectiveAdapter
	{
		public PerspectiveListener() 
		{
			super();
		}

		public void perspectiveChanged(IWorkbenchPage changedPage,
				IPerspectiveDescriptor perspective, String changeId) 
		{
			if(changeId.equals("viewHide")) //$NON-NLS-1$
			{
//				cdo_Operations.close_connection();
			}
		}
	}

	/**
	 * Adds a {@code DoubleClickListener} to the {@code TableViewer} of the {@code LayerView} :
	 * So that a double-clicked Layer file will open in the editor above (but only if it is been
	 * loaded into the Layer View before).
	 */
	private void hookDoubleClickListener()
	{
		viewer.addDoubleClickListener(new IDoubleClickListener() 
		{
			@Override
			public void doubleClick(DoubleClickEvent event) 
			{
				int line = viewer.getTable().getSelectionIndex();

				if (line < yamm.reflectivStateChart.objectManagement.getViewLayers().size())
				{
					String path = (String) ((Layer)yamm.reflectivStateChart.objectManagement.getViewLayers()
							.get(line)).getPath();
					IPath iPath = new Path(path);
					IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(iPath);
					FileEditorInput input = new FileEditorInput(file);
					String editorID = PlatformUI.getWorkbench().getEditorRegistry().getDefaultEditor(
							file.getName()).getId();
					try
					{
						PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().openEditor(
								input, editorID);
					} 
					catch (PartInitException e)
					{
						e.printStackTrace();
					}
				}
			}});
	}
	
	/**
	 * Adds a context menu to the layer file added to the view: right click on the file will
	 * show several options like adding/ deleting /editing it or generate an ecore model from it.
	 */
	private void hookItemContextMenu()
	{
		final MenuManager menuMgr = new MenuManager("#PopupMenu"); //$NON-NLS-1$
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() 
		{
			public void menuAboutToShow(IMenuManager manager) 
			{
				IStructuredSelection selection = (IStructuredSelection) viewer.getSelection();
				add.setText(Messages.contextMenuAdd);
				menuMgr.add(add);
				if(!selection.isEmpty())
				{
					Layer actLayer = (Layer) selection.getFirstElement();
					delete.setText(Messages.contextMenuDelete + actLayer.getPath());
					edit.setText(Messages.contextMenuEdit + actLayer.getPath());
					generateEcore.setText(Messages.contextMenuGenerateEcore);
					menuMgr.add(delete);
					menuMgr.add(edit);
					menuMgr.add(generateEcore);
				}	
			}
		});
		Menu menu = menuMgr.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
	}

	/**
	 * Gets the {@code ToolBarManager} of the action bars of LayerView for adding
	 * new actions in the following step {@link #fillLocalToolBar(IToolBarManager)}.
	 */
	private void contributeToActionBars() 
	{
		IActionBars bars = getViewSite().getActionBars();
		IToolBarManager toolBarManager = bars.getToolBarManager();
		fillLocalToolBar(toolBarManager);
		toolBarManager.update(true);
	}
	
	/**
	 * Updates the {@link #logMenu} {@code ToolBarManager} after changes are made (e.g. choosing
	 * another log level).
	 */
	private void updateToolBar()
	{
		IActionBars bars = getViewSite().getActionBars();
		IToolBarManager toolBarManager = bars.getToolBarManager();
		toolBarManager.update(true);
	}

	/**
	 * Adds some actions to the tool bar after they have been defined in {@link #makeActions()}.
	 * 
	 * @param manager	:	manager for  realizing the items in the tool bar control.
	 */
	private void fillLocalToolBar(IToolBarManager manager) 
	{
		manager.add(actionStop);
		manager.add(actionStart);
		manager.add(new Separator());
		manager.add(actionStepInto);
		manager.add(actionStepOver);
		manager.add(actionStepReturn);
		manager.add(new Separator());
		manager.add(CDO_upload);
		manager.add(CDO_download);
		manager.add(auto_upload);
		manager.add(new Separator());
		manager.add(save);
		manager.add(save_as);
		manager.add(load);
		manager.add(new Separator());
		manager.add(logMenu);
	}

	/**
	 * Connects the items with the functionality.
	 */
	private void makeListener() 
	{
		secListener = new SelectionListener() 
		{
			@Override
			public void widgetDefaultSelected(SelectionEvent arg0)
			{
			}

			@Override
			public void widgetSelected(SelectionEvent arg0)
			{
				if (arg0.getSource() instanceof MenuItem) 
				{
					MenuItem item = (MenuItem) arg0.getSource();
					if (item.getText().equals(Messages.dropDownAll ))
					{
						logMenu.setText(Messages.dropDownLogLevel + Messages.dropDownAll);
						ConfigurationManagement.setLoggingLevel(Level.ALL);
					} 
					else if (item.getText().equals(Messages.dropDownTrace))
					{
						logMenu.setText(Messages.dropDownLogLevel + Messages.dropDownTrace);
						ConfigurationManagement.setLoggingLevel(Level.TRACE);
					}
					else if (item.getText().equals(Messages.dropDownDebug))
					{
						logMenu.setText(Messages.dropDownLogLevel + Messages.dropDownDebug);
						ConfigurationManagement.setLoggingLevel(Level.DEBUG);
					} 
					else if (item.getText().equals(Messages.dropDownInfo))
					{
						logMenu.setText(Messages.dropDownLogLevel+ Messages.dropDownInfo);
						ConfigurationManagement.setLoggingLevel(Level.INFO);
					} 
					else if(item.getText().equals(Messages.dropDownWarn))
					{
						logMenu.setText(Messages.dropDownLogLevel + Messages.dropDownWarn); //TODO wird nicht verwendet?
						ConfigurationManagement.setLoggingLevel(Level.WARN);
					} 
					else if(item.getText().equals(Messages.dropDownError))
					{
						logMenu.setText(Messages.dropDownLogLevel + Messages.dropDownError);
						ConfigurationManagement.setLoggingLevel(Level.ERROR);
					}
					else if (item.getText().equals(Messages.dropDownFatal)) //TODO Noch nicht verwendet?
					{
						logMenu.setText(Messages.dropDownLogLevel + Messages.dropDownFatal);
						ConfigurationManagement.setLoggingLevel(Level.FATAL);
					} 
					else if(item.getText().equals(Messages.dropDownOff))
					{
						logMenu.setText(Messages.dropDownLogLevel + Messages.dropDownOff);
						ConfigurationManagement.setLoggingLevel(Level.OFF);
					}
					updateToolBar();
				}
			}
		};
	}

	/**
	 * Creates the actions of the toolbar (including the drop-down action), sets their icons and implements 
	 * their functionalities. 
	 * Creates also the actions of the context menu.
	 */
	private void makeActions() 
	{
		actionStop = new Action() 
		{
			public void run() {
				simulationState.stop(true);
			}
		};
		actionStop.setEnabled(false);
		actionStop.setText(Messages.toolbarTooltipResetSimulationAnalysis);
		actionStop.setToolTipText(Messages.toolbarTooltipResetSimulationAnalysis + "("+keyPrefix+"F2)");		 //$NON-NLS-1$ 
		actionStop.setImageDescriptor(dev.yamm.init.Activator.getImageDescriptor(ICONS_TERMINATE_CHART_GIF));
		
		actionStart = new Action() 
		{
			public void run() {
				simulationState.run();
			}
		};
		actionStart.setText(Messages.toolbarTooltipSimulationRun);
		actionStart.setToolTipText(Messages.toolbarTooltipSimulationRun + "("+keyPrefix+"TODO)"); //TODO  //$NON-NLS-1$ 
		actionStart.setImageDescriptor(dev.yamm.init.Activator.getImageDescriptor(ICONS_RUN_CHART_GIF));
		
		actionStepInto = new Action() {
			public void run() {
				simulationState.stepInto(true);
			}
		};
		actionStepInto.setText(Messages.toolbarTooltipStepInto);
		actionStepInto.setToolTipText(Messages.toolbarTooltipStepInto + "("+keyPrefix+"F3)"); //$NON-NLS-1$ 
		actionStepInto.setImageDescriptor(dev.yamm.init.Activator.getImageDescriptor(ICONS_STEPINTO_CHART_GIF));
		
		actionStepOver = new Action() {
			public void run() {
				simulationState.stepOver(true);
			}
		};
		actionStepOver.setText(Messages.toolbarTooltipStepOver);
		actionStepOver.setToolTipText(Messages.toolbarTooltipStepOver + "("+keyPrefix+"F5)"); //$NON-NLS-1$ 
		actionStepOver.setImageDescriptor(dev.yamm.init.Activator.getImageDescriptor(ICONS_STEPRETURN_CHART_GIF));
		
		actionStepReturn = new Action() 
		{
			public void run() 
			{
				simulationState.stepReturn(true);
			}
		};
		actionStepReturn.setText(Messages.toolbarTooltipStepReturn);
		actionStepReturn.setToolTipText(Messages.toolbarTooltipStepReturn + "("+keyPrefix+"F6)");//$NON-NLS-1$ 
		actionStepReturn.setImageDescriptor(dev.yamm.init.Activator.getImageDescriptor(ICONS_STEPOVER_CHART_GIF));
		actionStepReturn.setEnabled(false);

		CDO_upload = new Action() 
		{
			public void run() 
			{
				if(ConfigurationManagement.isUniqueIDs()) 
				{
//					cdo_Operations.upload();   
				} 
				else
				{
					MessageDialog.openInformation(
							viewer.getControl().getShell(),
							Messages.dialogInformationTitleSampleView,
							Messages.dialogInformationMessageUniqueIDTrue);
				}
			}			
		};
		CDO_upload.setToolTipText(Messages.toolbarTooltipUpload);	
		CDO_upload.setImageDescriptor(dev.yamm.init.Activator.getImageDescriptor(ICONS_UPLOAD_CDO_GIF));
		
		CDO_download = new Action() 
		{
			public void run()
			{
//				cdo_Operations.download();
			}			
		};
		CDO_download.setImageDescriptor(dev.yamm.init.Activator.getImageDescriptor(ICONS_DOWNLOAD_CDO_GIF));
		CDO_download.setToolTipText(Messages.toolbarTooltipDownload);	
		
		auto_upload = new Action() 
		{
			public void run() 
			{
				if (ConfigurationManagement.isAutoupload()) 
				{
					ConfigurationManagement.setAutoupload(false);
					auto_upload.setImageDescriptor(dev.yamm.init.Activator
							.getImageDescriptor(ICONS_REFRESH_OFF_GIF));
				} 
				else
				{
					ConfigurationManagement.setAutoupload(true);
					auto_upload.setImageDescriptor(dev.yamm.init.Activator
							.getImageDescriptor(ICONS_REFRESH_BID_GIF));
				}
			}			
		};
		auto_upload.setToolTipText(Messages.toolbarTooltipAutoupload);	
		auto_upload.setImageDescriptor(dev.yamm.init.Activator
				.getImageDescriptor(ICONS_REFRESH_OFF_GIF));
		
		save = new Action() 
		{
			public void run() 
			{
				if(!openedFile.isEmpty()) 
				{
					saveLayers(openedFile);
				}   
			}			
		};
		save.setDisabledImageDescriptor(dev.yamm.init.Activator.getImageDescriptor(ICONS_SAVE_EDIT_DISABLED_GIF));
		save.setImageDescriptor(dev.yamm.init.Activator.getImageDescriptor(ICONS_SAVE_EDIT_GIF));
		save.setToolTipText(Messages.toolbarTooltipSave);
		if(openedFile.equals("")) //$NON-NLS-1$
		{ 
			save.setEnabled(false);
		} 
		else
		{
			save.setEnabled(true);
		}
		save_as = new Action() 
		{
			public void run() 
			{
				FileDialog fd = new FileDialog(getViewSite().getShell(), SWT.SAVE);
				fd.setText("Save"); //$NON-NLS-1$
				fd.setFilterPath(Platform.getLocation().toOSString());
				String[] filterExt = { "*.lay" }; //$NON-NLS-1$
				fd.setFilterExtensions(filterExt);
				String selected =  fd.open();
				if(!selected.isEmpty()) 
				{
					openedFile = selected;
					saveLayers(selected);
					save.setEnabled(true);
					layerFileName = selected;
				}   
			}			
		};
		save_as.setImageDescriptor(dev.yamm.init.Activator.getImageDescriptor(ICONS_SAVEAS_EDIT_GIF));
		save_as.setToolTipText(Messages.toolbarTooltipSaveAs);
		
		load = new Action() 
		{
			public void run() 
			{
				IFile[] files = WorkspaceResourceDialog.openFileSelection(getViewSite().getShell(), null, null, false, null, null);
				if (files.length > 0) 
				{
					loadLayers(layerFileName);
					updateView();
					yamm.reflectivStateChart.objectManagement.setInvalidStructureInformationForAllLayers();
				}
			}
		};
		load.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
				getImageDescriptor(ISharedImages.IMG_OBJ_FOLDER));
		load.setToolTipText(Messages.toolbarTooltipLoad);
		
		logMenu = new DropDownAction();
		
		add = new Action()
		{
			public void run() 
			{
				IFile[] files = WorkspaceResourceDialog.openFileSelection(getViewSite()
						.getShell(), null, null, false, null, null);
				if (files.length > 0)
				{
					Layer actLayer = new Layer();
					actLayer.setPath(files[0].getFullPath().toOSString());
					if (yamm.reflectivStateChart.objectManagement.getViewLayers().size() == 0) 
					{
						actLayer.setStepWait(true);
					}
					yamm.reflectivStateChart.objectManagement.getViewLayers().add(actLayer);
					if (yamm.reflectivStateChart.objectManagement.getViewLayers().size() > 1)
					{
						Layer upperLayer = (Layer) yamm.reflectivStateChart.objectManagement
								.getViewLayers().get(yamm.reflectivStateChart.objectManagement
										.getViewLayers().size()-2);
						upperLayer.setNsURI(yamm.reflectivStateChart.loading.getNsURI(actLayer.getPath()));
					}
					updateView();
				}
			}
		};		
		delete = new Action() 
		{
			public void run() 
			{
				int line = viewer.getTable().getSelectionIndex();

				if(!(line + 1 == yamm.reflectivStateChart.objectManagement.getViewLayers().size())) 
				{
					MessageDialog.openInformation(
							viewer.getControl().getShell(),
							Messages.dialogInformationTitleSampleView,
							Messages.dialogInformationMessageRemoveBottomLayer);
				} 
				else
				{
					yamm.reflectivStateChart.objectManagement.getViewLayers().remove(line);
				}
				updateView();
			}
		};
		generateEcore = new Action() 
		{
			public void run() 
			{
				int line = viewer.getTable().getSelectionIndex();
				Layer actLayer = (Layer) yamm.reflectivStateChart.objectManagement.getViewLayers().get(line);
				yamm.reflectivStateChart.loading.generateEcore.generateEcore(actLayer.getPath(), getViewSite().getShell(), line);
			}
		};
		edit = new Action() 
		{
			public void run()
			{
				int line = viewer.getTable().getSelectionIndex();

				IFile[] files = WorkspaceResourceDialog.openFileSelection(getViewSite().getShell(), null, null, false, null, null);

				if(files[0]!= null) 
				{
					Layer actLayer = (Layer) yamm.reflectivStateChart.objectManagement.getViewLayers().get(line);
					actLayer.setPath(files[0].getFullPath().toOSString());
					updateView();
				}
			}
		};
	}

	

	/**
	 * Sets the current state of the Simulation.
	 * 
	 * @param currentState	:	a concrete Object of {@code SimulationState}
	 */
	public static void setSimulationState(SimulationState currentState)//TODO neu
	{
		simulationState = currentState;
	}
	
	/**
	 * Gets the current state of the Simulation.
	 */
	public static SimulationState getSimulationState()
	{
		return simulationState;
	}
	
	/**
	 * A getter for Action {@link #auto_upload}.
	 * 
	 * @return {@code auto_upload}
	 */
	public Action getAuto_upload() 
	{
		return auto_upload;
	}

	/**
	 * A getter for String {@link #layerFileName}.
	 * 
	 * @return {@code LayerFileName}
	 */
	public static String getLayerFileName() 
	{
		return layerFileName;
	}


	/**
	 * Sets {@link #myWorkBenchWindow} with the workbench.
	 */
	public static void setIWorkBenchWindow() 
	{
		final IWorkbench workbench = PlatformUI.getWorkbench();
		final Display display = workbench != null ? workbench.getDisplay() : null;
		if (display != null)
		{
			final IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
			if (workbenchWindow != null)
			{
				myWorkBenchWindow = workbenchWindow;
			}
		}
	}

	/**
	 * A getter for {@link #myWorkBenchWindow}.
	 * 
	 * @return {@code myWorkbenchWindow}
	 */
	public static IWorkbenchWindow getIWorkBenchWindow() 
	{
		return myWorkBenchWindow;
	}


	/**
	 * A getter for actionStart.
	 * @return	actionStart
	 */
	public static Action getActionStart()
	{
		return actionStart;
	}
	
	/**
	 * A getter for actionStop.
	 * @return	actionStop
	 */
	public static Action getActionStop()
	{
		return actionStop;
	}
	
	/**
	 * A getter for actionStepReturn.
	 * @return	actionStepReturn
	 */
	public static Action getActionStepReturn()
	{
		return actionStepReturn;
	}
	
	/**
	 * A getter for ICONS_RUN_CHART_GIF.
	 * @return	path to icon run_Chart.gif
	 */
	public static String getRunChartGif()
	{
	return ICONS_RUN_CHART_GIF;
	}
	
	/**
	 * A getter for ICONS_RUN_CHART_GIF.
	 * @return	path to icon run_Chart.gif
	 */
	public static String getTerminateChartGif()
	{
	return ICONS_TERMINATE_CHART_GIF;
	}
	
	
	@Override
	public void setFocus() 
	{
		viewer.getControl().setFocus();	
	}

	/**
	 * Updates the LayerView (the bottom part) when changes are made 
	 * (e.g. adding a new layer file, modifying a layerÂ´s properties). 
	 */
	public void updateView() 
	{
		if(openedFile.equals(""))  //$NON-NLS-1$
		{
			save.setEnabled(false);
		} 
		else 
		{
			save.setEnabled(true);
		}
		viewer.setContentProvider(new ViewContentProvider());
		viewer.refresh();
	}

	/**
	 * Saves the Layer File under the given directory.
	 * 
	 * @param fullPath	:	the path to the directory where the .lay file shall be saved.
	 */
	private void saveLayers(String fullPath) 
	{
		BufferedWriter out = null;
		try {
			out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream( fullPath )));
			for (Object layerObject : yamm.reflectivStateChart.objectManagement.getViewLayers()) 
			{
				Layer layer = (Layer) layerObject;
				out.write(layer.getPath().replace('\\', '/'));
				out.newLine();
				out.write(layer.getNsURI());
				out.newLine();
				if (layer.isBreakpoint())
					out.write("true"); //$NON-NLS-1$
				else 
					out.write("false"); //$NON-NLS-1$
				out.newLine();
				out.write("" + layer.getWaittime()); //$NON-NLS-1$
				out.newLine();
				if (layer.isLogLayer()) 
					out.write("true"); //$NON-NLS-1$
				else 
					out.write("false"); //$NON-NLS-1$
				out.newLine();
				if (layer.getColorLayer()) 
					out.write("true"); //$NON-NLS-1$
				else 
					out.write("false"); //$NON-NLS-1$
				out.newLine();
			}
			out.close();
		} 
		catch (FileNotFoundException e)
		{	
		} 
		catch (IOException e)
		{
			logger.error(e);
		}
	}
	
	/**
	 * Loads the layer file and creates a new Layer instance by
	 * invoking {@link dev.yamm.ChartManagement #loadViewLayers}
	 * Initializes {@link #layerFileName} with {@code fullPath}.
	 * 
	 * @param fullPath	:	the path to the layer file
	 */
	public void loadLayers(String fullPath) 
	{
		layerFileName = fullPath;
		yamm.reflectivStateChart.loadViewLayers(null, fullPath);
	}

	/**
	 * A class for managing (displaying) the Layer objects in the Layer View.
	 */
	class ViewContentProvider implements IStructuredContentProvider 
	{

		@Override
		public Object[] getElements(Object inputElement) {		
			return yamm.reflectivStateChart.objectManagement.getViewLayers().toArray();
		}

		@Override
		public void dispose() {
		}

		@Override
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {

		}

	}

	/**
	 * A Class for the managing the cells(Number, Name,..).
	 */
	class ViewLabelProvider extends LabelProvider implements ITableLabelProvider 
	{

		// Names of images used to represent checkboxes
		public static final String CHECKED_IMAGE 	= "checked"; //$NON-NLS-1$
		public static final String UNCHECKED_IMAGE  = "unchecked"; //$NON-NLS-1$
		public static final String RADIO_CHECKED_IMAGE  = "radiobuttonChecked"; //$NON-NLS-1$
		public static final String RADIO_UNCHECKED_IMAGE  = "radiobuttonUnchecked"; //$NON-NLS-1$

		/**
		 * Returns the image with the given key, or <code>null</code> if not found.
		 */
		private Image getImage(boolean isSelected) 
		{
			String iconPath = "/icons/";  //$NON-NLS-1$
			if(isSelected) {
				return ImageRegistryProvider.getImage(iconPath + CHECKED_IMAGE + ".gif");
			}
			return ImageRegistryProvider.getImage(iconPath + UNCHECKED_IMAGE + ".gif");
		}

		private Image getRadioImage(boolean isSelected) 
		{
			String iconPath = "/icons/";  //$NON-NLS-1$
			if(isSelected) {
				return ImageRegistryProvider.getImage(iconPath + RADIO_CHECKED_IMAGE + ".gif" );
			}
			return ImageRegistryProvider.getImage(iconPath + RADIO_UNCHECKED_IMAGE + ".gif");
		}


		@Override
		public Image getColumnImage(Object element, int columnIndex) 
		{
			Layer actLayer = (Layer) element;
			if (columnIndex == 2)
			{
				return getImage(actLayer.isBreakpoint());
			} else if (columnIndex == 4) {
				return getImage(actLayer.getColorLayer());	
			} else if (columnIndex == 5) {
				return getImage(actLayer.isLogLayer());	
			}
			else if (columnIndex == 6) {
				return getRadioImage(actLayer.isStepWait());
			}
			else return null;
		}

		@Override
		public String getColumnText(Object element, int columnIndex) 
		{
			Layer actLayer = (Layer) element;
			String result = ""; //$NON-NLS-1$
			switch (columnIndex) 
			{
			case 0: result = actLayer.getPath();break;
			case 1: 
			{
				result = actLayer.getNsURI();
				break;
			}
			case 2:
			{ break; 
			}
			case 3:
			{
				result = ""+actLayer.getWaittime();break; //$NON-NLS-1$
			}
			case 4:
			{
				break;
			}
			case 5: 
			{
				break;
			}
			case 6: 
			{
				break;
			}
			}

			return result;
		}
	}

	/**
	 * Sets {@link #breakActive} when {@link dev.yamm.ChartManagement #setBreakpoint(boolean)}
	 * is is to be called (e.g. when {@link Layer #setStepWait(boolean)} is true).
	 * 
	 * @param isActive	:	true if the simulation pauses / 
	 * 						false otherwise
	 */
	public static void setBreakActive(boolean isActive)
	{
		breakActive = isActive;	
	}
	
	/**
	 * Initializes {@link #runWaitTime} with the value of {@code waiting}.
	 * When the simulation can be paused (e.g. after method is called out of 
	 * {@link dev.yamm.operations.PauseExecution #waiting()}) all buttons are to be 
	 * disabled except the start button marked with a pause symbol. This happens
	 * when the waittime is set in the view and affects only a Simulation when it has been
	 * started by the Run button.
	 * Stops a simulation pause when {@code waiting} is false so that the other buttons
	 * are available. 
	 * 
	 * @param waiting	:	true if Simulation can be paused/
	 * 						false otherwise
	 */
	public static void setRunWaitTime(boolean waiting)
	{
		runWaitTime = waiting;
		if(runWaitTime) 
		{
			actionStart.setEnabled(true);
			actionStepInto.setEnabled(false);
			actionStepOver.setEnabled(false);
			actionStepReturn.setEnabled(false);
			actionStart.setImageDescriptor(dev.yamm.init.Activator.getImageDescriptor(ICONS_SUSPEND_CHART_GIF));
		}
		else
		{
			actionStart.setEnabled(true);
			actionStepInto.setEnabled(true);
			actionStepOver.setEnabled(true);
			if (returnEnabled) 
			{
				actionStepReturn.setEnabled(true);
			}
			actionStart.setImageDescriptor(dev.yamm.init.Activator.getImageDescriptor(ICONS_RUN_CHART_GIF));
		}
	}

	/**
	 * Sets {@link #blueStop} true when the Simulation has finished. Though the simulation has stopped
	 * the results are still shown in the console - to end the current simulation and reset values 
	 * 'stop' button again. 
	 */
	public static void blueStop() 
	{
		if (actionStop != null)
		{
			actionStop.setImageDescriptor(dev.yamm.init.Activator.getImageDescriptor(ICONS_TERMINATE_AND_DONE_CHART_GIF));
			blueStop = true;
		}
	}

	/**
	 * Creates the the drop-down menu Action in the tool bar where the Log Level 
	 * can be chosen.  Adds its items to the SelectionListener.
	 */
	class DropDownAction extends Action 
	{
		public DropDownAction() 
		{
			super("Def.LogLevel: " + Activator.getActionPreferenceStore().getString(PreferenceConstants
					.P_DEFAULT_LOG_LEVEL) + "  ", Action.AS_DROP_DOWN_MENU); //$NON-NLS-1$ 

			setMenuCreator(new IMenuCreator() 
			{
				public Menu getMenu(Control parent) 
				{
					Menu menu = new Menu(parent);
					MenuItem item = new MenuItem(menu, SWT.NONE);
					item.setText(Messages.dropDownAll);
					item.addSelectionListener(secListener);
					item = new MenuItem(menu, SWT.NONE);
					item.setText(Messages.dropDownTrace);
					item.addSelectionListener(secListener);
					item = new MenuItem(menu, SWT.NONE);
					item.setText(Messages.dropDownDebug);
					item.addSelectionListener(secListener);
					item = new MenuItem(menu, SWT.NONE);
					item.setText(Messages.dropDownInfo);
					item.addSelectionListener(secListener);
					item = new MenuItem(menu, SWT.NONE);
					item.setText(Messages.dropDownError);
					item.addSelectionListener(secListener);
					item = new MenuItem(menu, SWT.NONE);
					item.setText(Messages.dropDownOff);
					item.addSelectionListener(secListener);
//					item = new MenuItem(menu, SWT.NONE); //TODO  Auskommentiert bis yammLogger ueberarbeitet
//					item.setText(Messages.dropDownFatal);
//					item.addSelectionListener(secListener);
//					item = new MenuItem(menu, SWT.NONE);
//					item.setText(Messages.dropDownWarn);
//					item.addSelectionListener(secListener);
					return menu;
				}
				public Menu getMenu(Menu parent) {
					return null;
				}
				public void dispose() {
				}
			});
			this.setToolTipText(Messages.toolbarTooltipSetLogLevel + ConfigurationManagement.getLoggingLevel().toString() + ")");	 //$NON-NLS-1$
		}
		public void run() {
		}
	}

	/**
	 * Modifies the state of the tool barÂ´s action controls to active/ inactive depending
	 * on the currently active mode.
	 * 
	 * @param state					:	the state to be changed to of the other actions
	 * @param actionStopButtonState	:	the state of {@link  #actionStop}
	 */
	public static void setStartButtonsEnabledState(boolean state, Boolean actionStopButtonState)
	{
		if (Activator.getDefault() != null) 
		{
			actionStepInto.setEnabled(state);
			actionStepOver.setEnabled(state);
			if (returnEnabled)
			{
				actionStepReturn.setEnabled(state);
			}
			actionStart.setEnabled(state);
			CDO_download.setEnabled(state);
			CDO_upload.setEnabled(state);
			load.setEnabled(state);
			if (actionStopButtonState != null) 
			{
				actionStop.setEnabled(actionStopButtonState);
			}
		}
	}
	
	/**
	 * Marks the simulation as "breakpointIsHit".
	 * @return the breakpointIsHit
	 */
	public static boolean isBreakpointIsHit() {
		return breakpointIsHit;
	}


	/**
	 * @param breakpointIsHit the breakpointIsHit to set
	 */
	public static void setBreakpointIsHit(boolean breakpointIsHit) {
		LayerView.breakpointIsHit = breakpointIsHit;
	}
	
	/**
	 * Indicates if waittime is set in the Layer View. If it is set, it means that the simulation 
	 * @return
	 */
	public static boolean isWaitTimeSet()
	{
		long numberMillis = 0;
		int layerSize = yamm.reflectivStateChart.objectManagement.getViewLayers().size();
		if(0 < layerSize && ((Layer)yamm.reflectivStateChart.objectManagement.getViewLayers().get(0)).isStepWait()) {
			numberMillis = ((Layer)yamm.reflectivStateChart.objectManagement.getViewLayers().get(0)).getWaittime();
			if(numberMillis != 0) 
				return true;
		}
		return false;
	}

	/**
	 * Communicates with YammDebugModel.
	 * A YammThread only is suspended when step is true. Step is set true when 
	 * the simulation is not begun or continued by pressing 'run' Button but step into/over/return.
	 * Step also is true, when a breakpoint has been hit or simulation is running with waittime set
	 * so that all YammThreads and YammStackFrames are
	 * shown in the Debug View.
	 * 
	 * @return the step
	 */
	public static boolean isStep() {
		return step;
	}


	/**
	 * @param step the step to set
	 */
	public static void setStep(boolean step) {
		LayerView.step = step;
	}
	
	/**
	 * A setter for {@link #returnEnabled}.
	 */
	public static void setReturnEnabled(boolean isEnabled)
	{
		returnEnabled = isEnabled;
		
	}
	
	@Override
	public void dispose()
	{
		yamm.reflectivStateChart.setSimulationIsRunning(false);
		yamm = null;
	}


	public void setLayPath(String layFilePath) {
		this.layFilePath = layFilePath;
		
	}


	public String getLayFilePath() {
		return layFilePath;
	}
	
	
}
