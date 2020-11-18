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

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.nebula.widgets.nattable.NatTable;
import org.eclipse.nebula.widgets.nattable.config.AbstractRegistryConfiguration;
import org.eclipse.nebula.widgets.nattable.config.CellConfigAttributes;
import org.eclipse.nebula.widgets.nattable.config.ConfigRegistry;
import org.eclipse.nebula.widgets.nattable.config.DefaultNatTableStyleConfiguration;
import org.eclipse.nebula.widgets.nattable.config.IConfigRegistry;
import org.eclipse.nebula.widgets.nattable.config.IEditableRule;
import org.eclipse.nebula.widgets.nattable.coordinate.PositionCoordinate;
import org.eclipse.nebula.widgets.nattable.data.IColumnPropertyAccessor;
import org.eclipse.nebula.widgets.nattable.data.IDataProvider;
import org.eclipse.nebula.widgets.nattable.data.IRowDataProvider;
import org.eclipse.nebula.widgets.nattable.data.ListDataProvider;
import org.eclipse.nebula.widgets.nattable.data.ReflectiveColumnPropertyAccessor;
import org.eclipse.nebula.widgets.nattable.data.convert.DefaultBooleanDisplayConverter;
import org.eclipse.nebula.widgets.nattable.edit.EditConfigAttributes;
import org.eclipse.nebula.widgets.nattable.edit.config.DefaultEditBindings;
import org.eclipse.nebula.widgets.nattable.edit.editor.CheckBoxCellEditor;
import org.eclipse.nebula.widgets.nattable.grid.GridRegion;
import org.eclipse.nebula.widgets.nattable.grid.data.DefaultColumnHeaderDataProvider;
import org.eclipse.nebula.widgets.nattable.grid.data.DefaultCornerDataProvider;
import org.eclipse.nebula.widgets.nattable.grid.data.DefaultRowHeaderDataProvider;
import org.eclipse.nebula.widgets.nattable.grid.layer.ColumnHeaderLayer;
import org.eclipse.nebula.widgets.nattable.grid.layer.CornerLayer;
import org.eclipse.nebula.widgets.nattable.grid.layer.GridLayer;
import org.eclipse.nebula.widgets.nattable.grid.layer.RowHeaderLayer;
import org.eclipse.nebula.widgets.nattable.grid.layer.config.DefaultGridLayerConfiguration;
import org.eclipse.nebula.widgets.nattable.grid.layer.config.DefaultRowStyleConfiguration;
import org.eclipse.nebula.widgets.nattable.layer.DataLayer;
import org.eclipse.nebula.widgets.nattable.layer.ILayer;
import org.eclipse.nebula.widgets.nattable.layer.ILayerListener;
import org.eclipse.nebula.widgets.nattable.layer.LabelStack;
import org.eclipse.nebula.widgets.nattable.layer.cell.ColumnOverrideLabelAccumulator;
import org.eclipse.nebula.widgets.nattable.layer.cell.IConfigLabelAccumulator;
import org.eclipse.nebula.widgets.nattable.layer.event.CellVisualChangeEvent;
import org.eclipse.nebula.widgets.nattable.layer.event.ColumnInsertEvent;
import org.eclipse.nebula.widgets.nattable.layer.event.ILayerEvent;
import org.eclipse.nebula.widgets.nattable.layer.stack.DefaultBodyLayerStack;
import org.eclipse.nebula.widgets.nattable.painter.NatTableBorderOverlayPainter;
import org.eclipse.nebula.widgets.nattable.painter.cell.CheckBoxPainter;
import org.eclipse.nebula.widgets.nattable.painter.cell.TextPainter;
import org.eclipse.nebula.widgets.nattable.painter.cell.decorator.PaddingDecorator;
import org.eclipse.nebula.widgets.nattable.selection.SelectCellCommandHandler;
import org.eclipse.nebula.widgets.nattable.selection.SelectionLayer;
import org.eclipse.nebula.widgets.nattable.selection.command.SelectCellCommand;
import org.eclipse.nebula.widgets.nattable.selection.command.SelectColumnCommand;
import org.eclipse.nebula.widgets.nattable.selection.config.DefaultSelectionStyleConfiguration;
import org.eclipse.nebula.widgets.nattable.selection.event.CellSelectionEvent;
import org.eclipse.nebula.widgets.nattable.selection.event.ColumnSelectionEvent;
import org.eclipse.nebula.widgets.nattable.sort.config.SingleClickSortConfiguration;
import org.eclipse.nebula.widgets.nattable.style.BorderStyle;
import org.eclipse.nebula.widgets.nattable.style.BorderStyle.LineStyleEnum;
import org.eclipse.nebula.widgets.nattable.style.CellStyleAttributes;
import org.eclipse.nebula.widgets.nattable.style.DisplayMode;
import org.eclipse.nebula.widgets.nattable.style.HorizontalAlignmentEnum;
import org.eclipse.nebula.widgets.nattable.style.Style;
import org.eclipse.nebula.widgets.nattable.style.VerticalAlignmentEnum;
import org.eclipse.nebula.widgets.nattable.style.theme.DarkNatTableThemeConfiguration;
import org.eclipse.nebula.widgets.nattable.style.theme.ModernNatTableThemeConfiguration;
import org.eclipse.nebula.widgets.nattable.ui.binding.UiBindingRegistry;
import org.eclipse.nebula.widgets.nattable.ui.matcher.BodyCellEditorMouseEventMatcher;
import org.eclipse.nebula.widgets.nattable.ui.matcher.CellEditorMouseEventMatcher;
import org.eclipse.nebula.widgets.nattable.ui.menu.HeaderMenuConfiguration;
import org.eclipse.nebula.widgets.nattable.util.GUIHelper;
import org.eclipse.nebula.widgets.nattable.viewport.ViewportLayer;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.diagram.ui.tools.api.editor.DDiagramEditor;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.nebula.widgets.nattable.edit.config.DefaultEditBindings;

import online.yamm.communication.MulServer;
import online.yamm.coreModelDiagram.yammDiagram.YClass;
import online.yamm.coreModelDiagram.yammDiagram.YModel;
import online.yamm.coreModelDiagram.yammDiagram.YOperation;
import online.yamm.coreModelDiagram.yammDiagram.YPackage;
import online.yamm.coreModelDiagram.yammDiagram.YPackageableElement;
import online.yamm.coreModelDiagram.yammDiagram.YParameter;

public class LayerViewLaboratory {

	private ArrayList<ArrayList<String>> columns = new ArrayList<>();
	private ArrayList<ArrayList<String>> regrowColumns;
	private ArrayList<ArrayList<Object>> rows = new ArrayList<>();
	private boolean isSingle = false;
	private ColumnOverrideLabelAccumulator columnLabelAccumulator;
	private int runNumber;
	private NatTable natTable;
	private DataLayer bodyDataLayer;
	private SelectCellCommand selcetCellCommand;
	private Composite bottom;
	private HashMap<String, String> paraMap;
	private Composite form;
	private String filename = ".laboratoryTable.save";
	private ViewportLayer viewportLayer;
	public Text fileNameInput;
	private ILayer cornerLayer;
	private int outputCount;
	public static LayerViewLaboratory instance;
	public boolean useParameter;

	public LayerViewLaboratory(TabItem tabItem, TabFolder tabFolder) {

		useParameter = false;
		instance = this;

		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		layout.horizontalSpacing = 0;

		form = new Composite(tabFolder, SWT.NONE);
		form.setLayout(new GridLayout());
		GridDataFactory.fillDefaults().grab(true, true).applyTo(form);

		/*
		 * Composite top1 = new Composite(form, SWT.NONE); top1.setLayout(layout);
		 */
		Composite top2 = new Composite(form, SWT.NONE);
		top2.setLayout(new GridLayout(3, false));

		bottom = new Composite(form, SWT.NONE);
		bottom.setLayout(layout);
		GridDataFactory.fillDefaults().grab(true, true).applyTo(bottom);

// --------------------------------------------top part-----------------------------------------------------------------------------
		tabItem.setControl(form);

		/*
		 * Label comboLabel = new Label(top1,SWT.NONE); comboLabel.setText("model: ");
		 * Combo combo = new Combo(top1,SWT.NONE);
		 */

		GridData buttonLoadGridData = new GridData();
		buttonLoadGridData.heightHint = 20;
		buttonLoadGridData.widthHint = 80;

		Button buttonLoad = new Button(top2, SWT.NONE);
		buttonLoad.setText("load");
		buttonLoad.setLayoutData(buttonLoadGridData);
		buttonLoad.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				refreshParameter();
				fileNameInput.setText(getFileName());
				buttonLoad.setText("reload");
			}
		});
		
		
		Button buttonSave = new Button(top2, SWT.NONE);
		buttonSave.setText("save");
		buttonSave.setLayoutData(buttonLoadGridData);
		buttonSave.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				save();
			}
		});

		Composite fileBox = new Composite(top2, SWT.NONE);
		fileBox.setLayout(layout);

		Label fileNameLabel = new Label(fileBox, SWT.NONE);
		fileNameLabel.setText("result file: ");

		GridData fileNameInputGridData = new GridData();
		fileNameInputGridData.heightHint = 20;
		fileNameInputGridData.widthHint = 800;

		fileNameInput = new Text(fileBox, SWT.BORDER);
		fileNameInput.setText(getFileName());
		fileNameInput.setLayoutData(fileNameInputGridData);
	}

// -------------------------------------------Methods-----------------------------------------------------------------------------	
	class EditorConfiguration extends AbstractRegistryConfiguration {

		@Override
		public void configureRegistry(IConfigRegistry configRegistry) {
			configRegistry.registerConfigAttribute(EditConfigAttributes.CELL_EDITABLE_RULE,
					IEditableRule.ALWAYS_EDITABLE);

			registerColumns(configRegistry);
			addInputColor(configRegistry);
			addOutputColor(configRegistry);
		}
	}

	public ArrayList<ArrayList<String>> getColumns() {
		return columns;
	}

	private void addOutputColumn(String newColumnName, String xTextCode, String javaCode) {
		outputCount++;
		ArrayList<String> newColumn = new ArrayList<>();
		newColumn.add(newColumnName);
		newColumn.add(xTextCode);
		newColumn.add(javaCode);
;		columns.add(newColumn);
		for (int i = 0; i < rows.size(); i++) {
			rows.get(i).add(new String(""));
		}
		registerColumnLabels(columnLabelAccumulator);
		resize();
	}

	private void removeOutputColumn(int toRemove) {
		columns.remove(toRemove);
		outputCount--;
		natTable.refresh();
	}

	private void clearColumns() {
		regrowColumns = new ArrayList<>();
		for (int i = columns.size(); i > (columns.size() - outputCount); i--) {
			regrowColumns.add(columns.get(i));
		}
		columns.clear();
	}

	private void registerColumnLabels(ColumnOverrideLabelAccumulator columnLabelAccumulator) {
		columnLabelAccumulator.registerColumnOverrides(0, "CHECKBOX");
		columnLabelAccumulator.registerColumnOverrides(2, "LOADING");
		for (int i = 3; i < columns.size(); i++) {
			if(columns.get(i).size() == 1) {
			columnLabelAccumulator.registerColumnOverrides(i, "INPUT");
			}
			else {
				columnLabelAccumulator.registerColumnOverrides(i, "OUTPUT");
			}
		}
	}

	private void addRow() {

		ArrayList<Object> row = new ArrayList<>();
		row.add(new Boolean(false));
		row.add(new String("0"));
		row.add(new Double(0.0));
		for (int i = 2; i < columns.size(); i++) {
			row.add(new String(""));
		}
		rows.add(row);

		resize();
	}

	private void run(PositionCoordinate position) {
		paraMap = new HashMap<>();
		for (int i = 2; i < (columns.size() - outputCount); i++) {
			paraMap.put(columns.get(i).get(0), rows.get(position.getRowPosition()).get(i).toString());

		}
		resetProgress(position.getRowPosition());
		useParameter = true;
		runNumber = position.getRowPosition();
		//LayerView.getSimulationState().run();
		ExperimentLauncher experimentLauncher = new ExperimentLauncher();
		
		LayerViewPivotGrid.instance.resetPivotGrid();
		
		Properties startProperties = new Properties();
		startProperties.put("iterations", rows.get(position.rowPosition).get(2));
		
		experimentLauncher.startExperiment(LayerView.instance.getLayFilePath(), paraMap, startProperties, position.getRowPosition());
	}

	private void deleteRow(PositionCoordinate position) {
		rows.remove(selcetCellCommand.getRowPosition());
		resize();
		natTable.refresh();
		bottom.layout();

	}

	private void result() {
		String birdString = "jdbc:relique:csv:";
		String output = ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString();
		output += File.separator + getProjectName() + File.separator + "output" + File.separator + getFileName();
		birdString += output;
		StringSelection stringSelection = new StringSelection(birdString);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
	}

	private String getFileName() {
		String fileName = "";

		for (int i = 0; i < columns.size(); i++) {
			fileName += columns.get(i).get(0);
		}

		return fileName;
	}

	public HashMap<String, String> getparaMap() {
		return this.paraMap;
	}

	public void refreshParameter() {
		boolean useParameter = false;
		EObject model = null;
		try {
		String path = LayerView.yamm.reflectivStateChart.objectManagement.getViewLayers().get(0).getPath();
		path = path.replace("__TMP__.xyamm", ".yammdiagram");
		path = path.replace("/", File.separator);
		path = path.replace("\\", File.separator);
		path = path.replace(File.separator, "/");
		
		for (Session session : SessionManager.INSTANCE.getSessions()) {
			for (Resource resource : session.getSemanticResources()) {
				if (resource.getURI().toString().contains(path)) {
					model = resource.getContents().get(0);
					IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
					for (IEditorPart dirtyEditor : page.getDirtyEditors()) {
						if (dirtyEditor instanceof DDiagramEditor) {
							DRepresentation rep = ((DDiagramEditor) dirtyEditor).getRepresentation();
							if (rep instanceof DSemanticDiagram) {
								EObject semRootElem = ((DSemanticDiagram) rep).getTarget();
								String uri = semRootElem.eResource().getURI().toString();
								if (uri.contains(path)) {
									// TODO: alert
									// logger.error("save diagram!");
									MessageDialog.openError(new Shell(), "Error", "Save diagram first!");
									System.out.println("save diagram!");
									return;
								}
							}
						}
					}
				}
			}
		}
		if (model == null) {
			// TODO: alert
			MessageDialog.openError(new Shell(), "Error", "Open diagram first!");
			System.out.println("open diagram!");
			return;
		}

		if (model instanceof YModel) {
			YModel ymodel = (YModel) model;
			List<YParameter> parameters = findInitParameter(ymodel);
			if (parameters.isEmpty())
				return;
			if (natTable == null) {
				if (checkFile()) {
					load();
				}
				createTable();
				if (rows.size() == 0) {
					addRow();
				} else {
					resize();
				}
			} else {
				clearColumns();
				
				ArrayList<String> newColumn = new ArrayList<>();
				newColumn.add(new String(""));
				columns.add(newColumn);
				newColumn = new ArrayList<>();
				newColumn.add(new String("Replicaion"));
				columns.add(newColumn);
				newColumn = new ArrayList<>();
				newColumn.add(new String("Progress"));
				columns.add(newColumn);
				for (YParameter parameter : parameters) {
					newColumn = new ArrayList<>();
					newColumn.add(parameter.getName());
					columns.add(newColumn);
				}

				if (regrowColumns != null) {
					columns.addAll(regrowColumns);
					regrowColumns = null;
				}
				if (rows.get(0).size() != columns.size()) {
					int rowSize = rows.size();
					rows.clear();
					for (int i = 0; i < rowSize; i++) {
						addRow();
					}
				}

			}
		}
		}
		catch (Exception e){
			e.printStackTrace();
			MessageDialog.openError(new Shell(), "Error", "Please load the .lay file first!");
		}
	}

	private List<YParameter> findInitParameter(YModel ymodel) {
		for (YClass yclass : ymodel.getClazz()) {
			for (YOperation yoperation : yclass.getOwnedOperation()) {
				if (yoperation.getStateMachine().isDesInitializer()) {
					return yoperation.getOwnedParameter();
				}
			}
		}
		for (YPackage pack : ymodel.getPackages()) {
			return findInitParameterRecusive(pack);
		}

		return new ArrayList<>();
	}

	private List<YParameter> findInitParameterRecusive(YPackage ypackage)

	{
		for (YPackageableElement element : ypackage.getOwnedMemberPackage()) {
			if (element instanceof YPackage) {
				List<YParameter> ret = findInitParameterRecusive((YPackage) element);
				if (!ret.isEmpty())
					return ret;
			} else if (element instanceof YClass) {
				for (YOperation yoperation : ((YClass) element).getOwnedOperation()) {
					if (yoperation.getStateMachine().isDesInitializer()) {
						return yoperation.getOwnedParameter();
					}
				}
			}
		}

		return new ArrayList<>();
	}

	private void registerColumns(IConfigRegistry configRegistry) {
		// register a CheckBoxCellEditor for the column checkBox
		configRegistry.registerConfigAttribute(EditConfigAttributes.CELL_EDITOR, new CheckBoxCellEditor(),
				DisplayMode.EDIT, "CHECKBOX");

		// checkbox in your NatTable
		configRegistry.registerConfigAttribute(CellConfigAttributes.CELL_PAINTER, new CheckBoxPainter(),
				DisplayMode.NORMAL, "CHECKBOX");

		// using a CheckBoxCellEditor also needs a Boolean conversion to
		// work correctly
		configRegistry.registerConfigAttribute(CellConfigAttributes.DISPLAY_CONVERTER,
				new DefaultBooleanDisplayConverter(), DisplayMode.NORMAL, "CHECKBOX");

	}
	
	  private void addInputColor(IConfigRegistry configRegistry) {
	        Style style = new Style();
	        style.setAttributeValue(
	                CellStyleAttributes.FOREGROUND_COLOR,
	                GUIHelper.getColor(new RGB(000,100,000)));
	 
	        configRegistry.registerConfigAttribute(
	                CellConfigAttributes.CELL_STYLE, // attribute to apply
	                style, // value of the attribute
	                DisplayMode.NORMAL, "INPUT");
	    }
	  
	  private void addOutputColor(IConfigRegistry configRegistry) {
	        Style style = new Style();
	        style.setAttributeValue(
	                CellStyleAttributes.FOREGROUND_COLOR,
	                GUIHelper.getColor(new RGB(178,034,034)));
	 
	        configRegistry.registerConfigAttribute(
	                CellConfigAttributes.CELL_STYLE, // attribute to apply
	                style, // value of the attribute
	                DisplayMode.NORMAL, "OUTPUT");
	    }
	 

	private void resize() {

		Point point = bottom.getSize();

		int newWitdh = ((point.x - cornerLayer.getWidth() - 10) / columns.size());

		if (bodyDataLayer.getDefaultColumnWidth() != newWitdh) {
			if (newWitdh < 100) {
				bodyDataLayer.setDefaultColumnWidth(100);
			}
			bodyDataLayer.setDefaultColumnWidth(newWitdh);
		}

		natTable.refresh();
		bottom.layout();
	}

	private String getProjectName() {
		String path = LayerView.yamm.reflectivStateChart.objectManagement.getViewLayers().get(0).getPath();

		String[] splitstrings = path.split("/");
		return splitstrings[1];
	}

	public void setProgress(int row, int iteration) {
		
		double progress;
		
		progress = iteration / Integer.valueOf((String) rows.get(row).get(1)); 
		
		rows.get(row).set(2, progress);
		bodyDataLayer.fireLayerEvent(new CellVisualChangeEvent(viewportLayer, 2, row));
	}
	
	private void resetProgress(int row) {
		rows.get(row).set(2, 0.0);
		bodyDataLayer.fireLayerEvent(new CellVisualChangeEvent(viewportLayer, 2, row));
	}

	private void save() {
		FileWriter writer;
		File file = new File(ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString() + File.separator
				+ getProjectName() + File.separator + "output" + File.separator + filename);
		try {
			writer = new FileWriter(file);
			for (int i = 0; i < columns.size(); i++) {
				boolean hasTwo = true;
				for(int j = 0; j < columns.get(i).size();j++) {
					writer.write(columns.get(i).get(j));
					if(columns.get(i).size() == 2 && hasTwo) {
						writer.write("$");
						hasTwo = false;
					}
					else {
						writer.write(";");
					}
				}
			}
			writer.write("\n");
			for (int i = 0; i < rows.size(); i++) {
				for (int j = 0; j < rows.get(i).size(); j++) {
					writer.write(rows.get(i).get(j).toString() + ";");
				}
				writer.write("\n");
			}
			writer.flush();
			writer.close();
			MessageDialog.openConfirm(new Shell(), "Save complete", "Table is saved!");
		} catch (IOException e) {
			MessageDialog.openError(new Shell(), "Save failed", e.getMessage());
			e.printStackTrace();
		}
	}

	private void load() {
		try {
			FileReader fileReader = new FileReader(ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString()
					+ File.separator + getProjectName() + File.separator + "output" + File.separator + filename);
			BufferedReader br = new BufferedReader(fileReader);

			String zeile;

			if ((zeile = br.readLine()) != null) {
				String[] loadColumn = zeile.split(";");

				for (int i = 0; i < (loadColumn.length); i++) {
					ArrayList<String> newColumn = new ArrayList<>();
					if (loadColumn[i].contains("$")) {
						String[] columnParts = loadColumn[i].split("$");
						for (int j = 0; j < columnParts.length; j++) {
							newColumn.add(columnParts[j]);
						}
					} 
					else {
						newColumn.add(loadColumn[i]);
					}
					columns.add(newColumn);
				}

				while ((zeile = br.readLine()) != null) {
					String[] loadRow = zeile.split(";");
					ArrayList<Object> newRow = new ArrayList<>();
					newRow.add(Boolean.valueOf(loadRow[0]));
					newRow.add(loadRow[1]);
					newRow.add(Double.valueOf(loadRow[2]));
					for (int i = 3; i < (loadRow.length); i++) {
						newRow.add(loadRow[i]);
					}
					rows.add(newRow);
				}
			}

			br.close();
		} catch (IOException e) {
			e.printStackTrace();
			MessageDialog.openError(new Shell(), "Load failed", e.getMessage());
		}
	}

	private boolean checkFile() {
		File file = new File(ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString() + File.separator
				+ getProjectName() + File.separator + "output" + File.separator + filename);
		return file.exists();
	}
	
	public int getRunNumber() {
		return runNumber;
	}
	
	public void setOutputValue(Object value, String column, int row) {
		int columnNumber = -1;
		for(int i = 0; i < columns.size(); i++) {
			if(columns.get(i).get(0).equals(column)) {
				columnNumber = i;
			}
		}
		rows.get(row).set(columnNumber, value);
		//natTable.refresh();
	}
	
	//-----------------------------------------------------NatTable---------------------------------------------------------------	
	private void createTable() {

		ConfigRegistry configRegistry = new ConfigRegistry();

		// create the body layer stack
		// IRowDataProvider bodyDataProvider = new ListDataProvider<>(rows,
		// columnPropertyAccessor);
		IDataProvider bodyDataProvider = new YammDataProvider(this.rows, new YammColumnPropertyAccessor(this.columns));
		bodyDataLayer = new DataLayer(bodyDataProvider);
		SelectionLayer selectionLayer = new SelectionLayer(bodyDataLayer);
		selectionLayer.registerCommandHandler(new SelectCellCommandHandler(selectionLayer) {

			@Override
			public boolean doCommand(ILayer targetLayer, SelectCellCommand command) {
				selcetCellCommand = command;
				return super.doCommand(targetLayer, command);
			}
		});
		viewportLayer = new ViewportLayer(selectionLayer);

		// create the column header layer stack
		IDataProvider columnHeaderDataProvider = new YammColumnHeaderDataProvider(this.columns, this.rows);
		DataLayer columnHeaderDataLayer = new DataLayer(columnHeaderDataProvider);
		columnHeaderDataLayer.setDefaultRowHeight(27);
		ILayer columnHeaderLayer = new ColumnHeaderLayer(columnHeaderDataLayer, viewportLayer, selectionLayer);

		// create the row header layer stack
		IDataProvider rowHeaderDataProvider = new DefaultRowHeaderDataProvider(bodyDataProvider);
		DataLayer rowHeaderDataLayer = new DataLayer(rowHeaderDataProvider);
		ILayer rowHeaderLayer = new RowHeaderLayer(rowHeaderDataLayer, viewportLayer, selectionLayer);

		// create the corner layer stack
		cornerLayer = new CornerLayer(
				new DataLayer(new DefaultCornerDataProvider(columnHeaderDataProvider, rowHeaderDataProvider)),
				rowHeaderLayer, columnHeaderLayer);
		// create the grid layer composed with the prior created layer stacks
		GridLayer gridLayer = new GridLayer(viewportLayer, columnHeaderLayer, rowHeaderLayer, cornerLayer, true);
		// gridLayer.addConfiguration(new YammGridLayerConfiguration());

		columnLabelAccumulator = new ColumnOverrideLabelAccumulator(bodyDataLayer);
		registerColumnLabels(columnLabelAccumulator);
		bodyDataLayer.setConfigLabelAccumulator(columnLabelAccumulator);
		
		ModernNatTableThemeConfiguration modern = new ModernNatTableThemeConfiguration();
		modern.cHeaderHAlign = HorizontalAlignmentEnum.CENTER;
		
		natTable = new NatTable(bottom, SWT.NO_BACKGROUND | SWT.H_SCROLL | SWT.V_SCROLL, gridLayer, false);
		natTable.setConfigRegistry(configRegistry);
		natTable.addConfiguration(modern);
		natTable.addConfiguration(new HeaderMenuConfiguration(natTable));
		natTable.addConfiguration(new EditorConfiguration());
		natTable.addConfiguration(new LoadingbarLayerViewLaboratory());
		natTable.addOverlayPainter(new NatTableBorderOverlayPainter(natTable.getConfigRegistry()));
		natTable.configure();
		GridDataFactory.fillDefaults().grab(true, true).applyTo(natTable);

// --------------------------------------------right click menu-----------------------------------------------------------------------------
		Menu menu = new Menu(natTable);

		MenuItem itemRun = new MenuItem(menu, SWT.PUSH);
		itemRun.setText("run");
		itemRun.addSelectionListener(new SelectionAdapter() {
			@Override
			// TODO change to cell
			public void widgetSelected(SelectionEvent e) {
				PositionCoordinate position = selectionLayer.getSelectionAnchor();
				run(position);
			}
		});
		
		MenuItem itemPlaceholder1 = new MenuItem(menu, SWT.SEPARATOR);
		
		MenuItem itemAddRow = new MenuItem(menu, SWT.PUSH);
		itemAddRow.setText("add row");
		itemAddRow.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				addRow();
			}
		});

		MenuItem itemRemoveRow = new MenuItem(menu, SWT.PUSH);
		itemRemoveRow.setText("remove row");
		itemRemoveRow.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO change to cell
				PositionCoordinate position = selectionLayer.getSelectionAnchor();
				deleteRow(position);
			}
		});
		
		MenuItem itemPlaceholder2 = new MenuItem(menu, SWT.SEPARATOR);
		
		MenuItem itemAddColumn = new MenuItem(menu, SWT.PUSH);
		itemAddColumn.setText("add output column");
		itemAddColumn.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				CustomDialog dialog = new CustomDialog(new Shell());
				dialog.open();
				if (!dialog.getNameOfColumn().isEmpty()) {
				
					addOutputColumn(dialog.getNameOfColumn(), dialog.getxTextCode(), dialog.getJavaCode());
				}
			}
		});
		
		MenuItem itemEditColumn = new MenuItem(menu, SWT.PUSH);
		itemEditColumn.setText("edit output column");
		itemEditColumn.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(columns.get(selcetCellCommand.getColumnPosition()).size() > 1);
				CustomDialog dialog = new CustomDialog(new Shell(), columns.get(selcetCellCommand.getColumnPosition()).get(0),columns.get(selcetCellCommand.getColumnPosition()).get(1));
				dialog.open();
				columns.get(selcetCellCommand.getColumnPosition()).set(0, dialog.getNameOfColumn());
				columns.get(selcetCellCommand.getColumnPosition()).set(1, dialog.getxTextCode());
				columns.get(selcetCellCommand.getColumnPosition()).set(2, dialog.getJavaCode());
			}
		});

		MenuItem itemRemoveColumn = new MenuItem(menu, SWT.PUSH);
		itemRemoveColumn.setText("remove output column");
		itemRemoveColumn.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				removeOutputColumn(selcetCellCommand.getColumnPosition());
			}
		});
		
		MenuItem itemPlaceholder3 = new MenuItem(menu, SWT.SEPARATOR);
		
		MenuItem itemCopytoClipboard = new MenuItem(menu, SWT.PUSH);
		itemCopytoClipboard.setText("copy result to clipboard");
		itemCopytoClipboard.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				result();
			}
		});
		
		natTable.setMenu(menu);
		natTable.refresh();
	}
}
