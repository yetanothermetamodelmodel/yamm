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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.nebula.widgets.nattable.NatTable;
import org.eclipse.nebula.widgets.nattable.data.IDataProvider;
import org.eclipse.nebula.widgets.nattable.extension.glazedlists.GlazedListsEventLayer;
import org.eclipse.nebula.widgets.nattable.grid.GridRegion;
import org.eclipse.nebula.widgets.nattable.grid.data.DefaultColumnHeaderDataProvider;
import org.eclipse.nebula.widgets.nattable.grid.layer.ColumnHeaderLayer;
import org.eclipse.nebula.widgets.nattable.layer.CompositeLayer;
import org.eclipse.nebula.widgets.nattable.layer.DataLayer;
import org.eclipse.nebula.widgets.nattable.layer.ILayer;
import org.eclipse.nebula.widgets.nattable.selection.SelectionLayer;
import org.eclipse.nebula.widgets.nattable.viewport.ViewportLayer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabFolder2Adapter;
import org.eclipse.swt.custom.CTabFolderEvent;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.ui.part.ViewPart;

import online.yamm.ChartManagement;
import online.yamm.gui.LayerView;
import online.yamm.util.tableModel.table.Column;
import online.yamm.util.tableModel.table.TableModel;

public class Table extends ViewPart
{
	private String internalViewId;

	private Composite parent;
	private CTabFolder tabFolder;
	private Map<String, Group> idsToTabGroup;
	private Map<String, CTabItem> idsToTabItem;

	private Map<CTabItem, String> tabItemToTabId;

	private Color black;

	public Table()
	{
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(Composite parent)
	{
		this.parent = parent;
		black = new Color(Display.getDefault(), 0, 0, 0);
		init();

		internalViewId = getViewSite().getSecondaryId();
		setPartName("Table " + internalViewId.substring(internalViewId.lastIndexOf("\\") + 1, internalViewId.lastIndexOf(".")));
		online.yamm.util.table.TableControl control = online.yamm.util.table.TableControl.getControl(internalViewId);
		if (control == null) // eclipse startup
		{
			control = online.yamm.util.table.TableControl.createControl(internalViewId);

			String wsPath = ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString();
			TableModel model = TableViewLauncher.loadModel(wsPath + File.separator + internalViewId);

			if (model != null)
			{
				control.setView(this);
				control.setModel(model);
				control.initViewAll();
			}
		}
		else // doubleclick, showCharts()
		{
			control.setView(this);
		}
	}

	private void init()
	{
		idsToTabGroup = new HashMap<>();
		idsToTabItem = new HashMap<>();
		tabItemToTabId = new HashMap<>();

		parent.setLayout(new GridLayout(1, true));
		Composite composite = new Composite(parent, SWT.V_SCROLL);
		composite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		composite.setLayout(new RowLayout());

		tabFolder = new CTabFolder(parent, SWT.CLOSE);
		tabFolder.setLayoutData(new GridData(GridData.FILL_BOTH));
		tabFolder.addCTabFolder2Listener(new CTabFolder2Adapter()
		{
			@Override
			public void close(CTabFolderEvent event)
			{
				CTabItem tabToDelete = (CTabItem) event.item;
				String tabId = tabItemToTabId.get(tabToDelete);

				tabToDelete.dispose();
				idsToTabGroup.remove(tabId);
				idsToTabItem.remove(tabId);

				online.yamm.util.table.TableControl.getControl(internalViewId).deleteTab(tabId);
			}
		});

	}

	@Override
	public void setFocus()
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose()
	{
		TableControl control = online.yamm.util.table.TableControl.getControl(internalViewId);
		control.save();
		control.setView(null);

		if (LayerView.yamm != null)
		{
			if (!LayerView.yamm.reflectivStateChart.simulationIsRunning)
			{
				TableControl.deleteControl(internalViewId);
			}
			else
			{
				LayerView.yamm.reflectivStateChart.simulationIsRunningListener
						.add(new ChartManagement.SimulationIsRunningListener()
						{
							@Override
							public void changed(boolean isRunning)
							{
								if (!isRunning)
								{
									if (control.getView() == null)
									{
										TableControl.deleteControl(internalViewId);
									}
									LayerView.yamm.reflectivStateChart.simulationIsRunningListener.remove(this);
								}
							}
						});
			}
		}
		else
		{
			TableControl.deleteControl(internalViewId);
		}
	}

	public void setSelection(String tabId)
	{
		tabFolder.setSelection(idsToTabItem.get(tabId));
	}

	public void addTab(String tabId, String name, IDataProvider dataProvider, boolean active)
	{
		addTab(tabId, name, dataProvider, -1, active);
	}

	public void addTab(String tabId, String name, IDataProvider dataProvider, int insertPos, boolean active)
	{
		CTabItem tab;
		if (insertPos >= 0)
			tab = new CTabItem(tabFolder, SWT.NONE, insertPos);
		else
			tab = new CTabItem(tabFolder, SWT.NONE);
		tab.setText(tabId);

		Group group = new Group(tabFolder, SWT.NONE);
		group.setLayout(new GridLayout());
		tab.setControl(group);

		// natTable
		if (active)
		{
			DataLayer bodyDataLayer = new DataLayer(dataProvider);
			GlazedListsEventLayer<List<Object>> glazedListsEventLayer = new GlazedListsEventLayer<>(bodyDataLayer,
					((TableControl) dataProvider).getData());

			SelectionLayer selectionLayer = new SelectionLayer(glazedListsEventLayer);
			ViewportLayer viewportLayer = new ViewportLayer(selectionLayer);

			// column header layer stack
			IDataProvider headerDataProvider = new DefaultColumnHeaderDataProvider(
					((TableControl) dataProvider).getPropertyNames(),
					((TableControl) dataProvider).getPropertyToLabelMap());
			DataLayer headerDataLayer = new DataLayer(headerDataProvider);
			ILayer columnHeaderLayer = new ColumnHeaderLayer(headerDataLayer, viewportLayer, selectionLayer);

			// create the composition
			CompositeLayer compositeLayer = new CompositeLayer(1, 2);
			compositeLayer.setChildLayer(GridRegion.COLUMN_HEADER, columnHeaderLayer, 0, 0);
			compositeLayer.setChildLayer(GridRegion.BODY, viewportLayer, 0, 1);

			NatTable natTable = new NatTable(group, compositeLayer);
			GridDataFactory.fillDefaults().grab(true, true).applyTo(natTable);
		}
		else
		{
			ModelDataProvider provider = (ModelDataProvider) dataProvider;
			List<String> labels = new ArrayList<>();
			for (Column column : provider.getTabModel().getColumns())
			{
				labels.add(column.getHeader());
			}
			String[] propertyNames = labels.toArray(new String[labels.size()]);

			Map<String, String> propertyToLabelMap = new HashMap<>();
			
			for (String propName : propertyNames)
			{
				propertyToLabelMap.put(propName, propName);
			}
			
			DataLayer dataLayer = new DataLayer(dataProvider);
			SelectionLayer selectionLayer = new SelectionLayer(dataLayer);
			ViewportLayer viewportLayer = new ViewportLayer(selectionLayer);
			
			// column header layer stack
			IDataProvider headerDataProvider = new DefaultColumnHeaderDataProvider(
					propertyNames,
					propertyToLabelMap);
			DataLayer headerDataLayer = new DataLayer(headerDataProvider);
			ILayer columnHeaderLayer = new ColumnHeaderLayer(headerDataLayer, viewportLayer, selectionLayer);

			// create the composition
			CompositeLayer compositeLayer = new CompositeLayer(1, 2);
			compositeLayer.setChildLayer(GridRegion.COLUMN_HEADER, columnHeaderLayer, 0, 0);
			compositeLayer.setChildLayer(GridRegion.BODY, viewportLayer, 0, 1);

			NatTable natTable = new NatTable(group, compositeLayer);
			GridDataFactory.fillDefaults().grab(true, true).applyTo(natTable);	
		}

		idsToTabGroup.put(tabId, group);
		idsToTabItem.put(tabId, tab);
		tabItemToTabId.put(tab, tabId);
	}

	public boolean tabIsActive(String tabId)
	{
		return idsToTabGroup.get(tabId) == null ? false : true;
	}
}
