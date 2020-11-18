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
package online.yamm.util.table;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.nebula.widgets.nattable.data.IDataProvider;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

import ca.odell.glazedlists.EventList;
import ca.odell.glazedlists.GlazedLists;
import online.yamm.gui.LayerView;
import online.yamm.util.ValueObserver;
import online.yamm.util.tableModel.table.Column;
import online.yamm.util.tableModel.table.Tab;
import online.yamm.util.tableModel.table.TableFactory;
import online.yamm.util.tableModel.table.TableModel;

public class TableControl implements IDataProvider
{
	private Table view;
	private String internalViewId;
	private TableModel tableModel;
	private Tab simulationTab;
	private EventList<List<Object>> data;
	private ValueObserver valueObserver;
	public boolean listenerActive = false;
	Map<String, String> propertyToLabelMap;
	List<String> propertyNames;
	private EObject dataObject;
	
	private static Map<String, TableControl> internalViewIdToControl = new HashMap<>();

	public static TableControl getControl(String internalViewId)
	{
		return internalViewIdToControl.get(internalViewId);
	}

	public static TableControl createControl(String internalViewId)
	{
		TableControl newControl = new TableControl(internalViewId);
		internalViewIdToControl.put(internalViewId, newControl);
		return newControl;
	}

	public static void deleteControl(String internalViewId)
	{
		internalViewIdToControl.remove(internalViewId);
	}

	public TableControl(String internalViewId)
	{
		this.internalViewId = internalViewId;
		propertyNames = new ArrayList<>();
		propertyToLabelMap = new HashMap<>();
		data = GlazedLists.eventList(new ArrayList<>());
		data.add(new ArrayList<>());	
		valueObserver = new ValueObserver();
		valueObserver.addListener(new ValueObserver.Listener()
		{	
			@Override
			public void valueChanged(String featureId, Number newValue)
			{		
				if (listenerActive)
				{
					List<Object> newDataSet = new ArrayList<>(propertyNames.size());
					for (String propName : propertyNames) 
					{
						String propLabel = propertyToLabelMap.get(propName);
						newDataSet.add(valueObserver.getData().get(propLabel));
					}
					data.add(newDataSet);
				}
			}
		});
	}
	
	public void setDataObject(EObject dataObject)
	{
		this.dataObject = dataObject;
	}
	
	public Table getView()
	{
		return view;
	}

	public void setView(Table view)
	{
		this.view = view;
	}

	public void initViewAll()
	{
		if (view != null && tableModel != null) 
		{
			for (Tab tab : tableModel.getTabs())
			{
				if (tab != simulationTab)
				{
					String tabId = tab.getTabId();				
					ModelDataProvider dataProvider = new ModelDataProvider(tab);			
					view.addTab(tabId, tab.getName() != null ? tab.getName() : tabId, dataProvider, false);
				}
				else // simulationTab
				{
					String tabId = tab.getTabId();				
					view.addTab(tabId, tab.getName() != null ? tab.getName() : tabId, this, true);
				}
			}
		}
	}

	public void addFeature(EObject object, String featureName, String labelName) {
		EStructuralFeature feature = dataObject.eClass().getEStructuralFeature(featureName);
		data.get(0).add(dataObject.eGet(feature));
		valueObserver.addFeature(object, featureName, labelName);
		propertyToLabelMap.put(featureName, labelName);
		propertyNames.add(featureName);
		
		online.yamm.util.tableModel.table.Column column = TableFactory.eINSTANCE.createColumn();
		simulationTab.getColumns().add(column);
		column.setHeader(labelName);
	}
	
	public Map<String, String> getPropertyToLabelMap()
	{
		return propertyToLabelMap;
	}

	@Override
	public Object getDataValue(int columnIndex, int rowIndex)
	{
		return data.get(rowIndex).get(columnIndex);
	}

	@Override
	public void setDataValue(int columnIndex, int rowIndex, Object newValue)
	{
		data.get(columnIndex).set(rowIndex, newValue);	
	}

	@Override
	public int getColumnCount()
	{
		if (data.isEmpty())
			return 0;
		return data.get(0).size();
	}

	@Override
	public int getRowCount()
	{
		return data.size();
	}
	
	public EventList<List<Object>> getData()
	{
		return data;
	}

	public String[] getPropertyNames()
	{
		return propertyNames.toArray(new String[propertyNames.size()]);
	}

	public void addTab()
	{
		TableModel model = getModel();
		simulationTab = TableFactory.eINSTANCE.createTab();
		String timeStamp = LayerView.yamm.reflectivStateChart.simualtionTimeStamp;
		simulationTab.setTabId(timeStamp);
		simulationTab.setName(timeStamp);
		model.getTabs().add(0, simulationTab);
	}

	public TableModel getModel()
	{
		return tableModel;
	}
	
	public void setModel(TableModel model)
	{
		tableModel = model;
	}
	
	public void deleteTab(String tabId)
	{
		for (int i = 0; i < tableModel.getTabs().size(); i++)
		{
			Tab tab = tableModel.getTabs().get(i);
			if (tab.getTabId().equals(tabId))
			{
				tableModel.getTabs().remove(tab);
				break;
			}
		}
		if (tabId.equals(simulationTab))
		{
			listenerActive = false;
		}
	}
	
	
	
	public void showView()
	{
		try
		{
			listenerActive = true;
			boolean wasOpen = TableViewLauncher.viewIsOpen(internalViewId);

			PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView("online.yamm.util.Table",
					internalViewId, IWorkbenchPage.VIEW_VISIBLE);
			if (wasOpen)
			{
				if (!view.tabIsActive(simulationTab.getTabId()))
				{
					String tabId = simulationTab.getTabId();
					view.addTab(tabId, simulationTab.getName() != null ? simulationTab.getName() : tabId, this, 0, true);
				}
			}
			else
				initViewAll();

			view.setSelection(simulationTab.getTabId());
		}
		catch (PartInitException e)
		{
			e.printStackTrace();
		}
	}

	public void save()
	{
		String wsPath = ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString();
		if (simulationTab != null)
		{
			List<List<Object>> columns = new ArrayList<>(simulationTab.getColumns().size());
			for (Column column : simulationTab.getColumns())
			{
				columns.add(new ArrayList<>(data.size()));
			}
			
			for (List<Object> row : data) 
			{
				for (int index = 0; index < row.size(); index++)
				{
					columns.get(index).add(row.get(index));
				}
			}
				
			for (int index = 0; index < columns.size(); index++)
			{
				Column column = simulationTab.getColumns().get(index);
				List<Object> columnData = columns.get(index);
				List<String> columDataAsStrings = new ArrayList(columnData.size());
				for (Object value : columnData)
				{
					columDataAsStrings.add(value.toString());
				}
				column.getValues().clear();
				column.getValues().addAll(columDataAsStrings);
			}
		}
		TableViewLauncher.saveModel(tableModel, wsPath + File.separator + internalViewId);
	}


}
