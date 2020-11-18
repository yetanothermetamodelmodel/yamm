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

import ca.odell.glazedlists.EventList;
import ca.odell.glazedlists.FilterList;
import ca.odell.glazedlists.GlazedLists;
import ca.odell.glazedlists.SortedList;
import ca.odell.glazedlists.TransformedList;
import online.yamm.Pair;

import java.text.DecimalFormat;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.nebula.widgets.nattable.NatTable;
import org.eclipse.nebula.widgets.nattable.columnChooser.command.DisplayColumnChooserCommandHandler;
import org.eclipse.nebula.widgets.nattable.config.AbstractRegistryConfiguration;
import org.eclipse.nebula.widgets.nattable.config.CellConfigAttributes;
import org.eclipse.nebula.widgets.nattable.config.ConfigRegistry;
import org.eclipse.nebula.widgets.nattable.config.IConfigRegistry;
import org.eclipse.nebula.widgets.nattable.data.AutomaticSpanningDataProvider;
import org.eclipse.nebula.widgets.nattable.data.ExtendedReflectiveColumnPropertyAccessor;
import org.eclipse.nebula.widgets.nattable.data.IDataProvider;
import org.eclipse.nebula.widgets.nattable.data.ListDataProvider;
import org.eclipse.nebula.widgets.nattable.extension.glazedlists.GlazedListsEventLayer;
import org.eclipse.nebula.widgets.nattable.extension.glazedlists.GlazedListsSortModel;
import org.eclipse.nebula.widgets.nattable.extension.glazedlists.filterrow.DefaultGlazedListsFilterStrategy;
import org.eclipse.nebula.widgets.nattable.filterrow.FilterRowHeaderComposite;
import org.eclipse.nebula.widgets.nattable.grid.data.DefaultCornerDataProvider;
import org.eclipse.nebula.widgets.nattable.grid.data.DefaultRowHeaderDataProvider;
import org.eclipse.nebula.widgets.nattable.grid.layer.ColumnHeaderLayer;
import org.eclipse.nebula.widgets.nattable.grid.layer.CornerLayer;
import org.eclipse.nebula.widgets.nattable.grid.layer.GridLayer;
import org.eclipse.nebula.widgets.nattable.grid.layer.RowHeaderLayer;
import org.eclipse.nebula.widgets.nattable.group.ColumnGroupExpandCollapseLayer;
import org.eclipse.nebula.widgets.nattable.group.ColumnGroupHeaderLayer;
import org.eclipse.nebula.widgets.nattable.group.ColumnGroupModel;
import org.eclipse.nebula.widgets.nattable.group.ColumnGroupModel.ColumnGroup;
import org.eclipse.nebula.widgets.nattable.group.ColumnGroupReorderLayer;
import org.eclipse.nebula.widgets.nattable.hideshow.ColumnHideShowLayer;
import org.eclipse.nebula.widgets.nattable.layer.DataLayer;
import org.eclipse.nebula.widgets.nattable.layer.ILayer;
import org.eclipse.nebula.widgets.nattable.layer.SpanningDataLayer;
import org.eclipse.nebula.widgets.nattable.layer.cell.ColumnOverrideLabelAccumulator;
import org.eclipse.nebula.widgets.nattable.painter.cell.TableCellPainter;
import org.eclipse.nebula.widgets.nattable.reorder.ColumnReorderLayer;
import org.eclipse.nebula.widgets.nattable.selection.SelectionLayer;
import org.eclipse.nebula.widgets.nattable.sort.SortConfigAttributes;
import org.eclipse.nebula.widgets.nattable.sort.SortDirectionEnum;
import org.eclipse.nebula.widgets.nattable.sort.SortHeaderLayer;
import org.eclipse.nebula.widgets.nattable.sort.config.SingleClickSortConfiguration;
import org.eclipse.nebula.widgets.nattable.style.DisplayMode;
import org.eclipse.nebula.widgets.nattable.style.HorizontalAlignmentEnum;
import org.eclipse.nebula.widgets.nattable.style.theme.DefaultNatTableThemeConfiguration;
import org.eclipse.nebula.widgets.nattable.style.theme.ModernNatTableThemeConfiguration;
import org.eclipse.nebula.widgets.nattable.ui.menu.DebugMenuConfiguration;
import org.eclipse.nebula.widgets.nattable.ui.menu.HeaderMenuConfiguration;
import org.eclipse.nebula.widgets.nattable.ui.menu.PopupMenuBuilder;
import org.eclipse.nebula.widgets.nattable.viewport.ViewportLayer;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;

public class LayerViewPivotGrid {

	private ArrayList<Map> rows = new ArrayList<>();
	private ArrayList<String> columns = new ArrayList<>();
	private ColumnGroupModel columnGroupModel = new ColumnGroupModel();
	private NatTable natTable;
	private Composite body;
	private EventList<Map> eventList;
	private SortedList sortedList;
	private FilterList<Map> filterList;
	private TransformedList rowObjectsGlazedList;
	private ColumnOverrideLabelAccumulator columnLabelAccumulator;
	public static LayerViewPivotGrid instance;

	@SuppressWarnings("unchecked")
	public LayerViewPivotGrid(TabItem tabItem, TabFolder tabFolder) {

		instance = this;

		columns.add("Typ");
		columns.add("Instance");
		columns.add("Attribute");
		columns.add("Statistics");

		body = new Composite(tabFolder, SWT.NONE);
		body.setLayout(new GridLayout());
		GridDataFactory.fillDefaults().grab(true, true).applyTo(body);

		ConfigRegistry configRegistry = new ConfigRegistry();

		eventList = GlazedLists.eventList(rows);
		rowObjectsGlazedList = GlazedLists.threadSafeList(eventList);
		sortedList = new SortedList<>(rowObjectsGlazedList, null);
		filterList = new FilterList<>(sortedList);

		MyColumnPropertyAccessor columnPropertyAccessor = new MyColumnPropertyAccessor(columns);
		IDataProvider bodyDataProvider = new ListDataProvider<>(filterList, columnPropertyAccessor);

		AutomaticSpanningDataProvider spanningDataProvider = new AutomaticSpanningDataProvider(bodyDataProvider, false,
				true);
		spanningDataProvider.setAutoColumnSpan(false);
		spanningDataProvider.setAutoRowSpan(true);
		spanningDataProvider.clearAutoSpanningColumnPositions();
		spanningDataProvider.addAutoSpanningColumnPositions(0);
		spanningDataProvider.addAutoSpanningColumnPositions(1);
		SpanningDataLayer bodyDataLayer = new SpanningDataLayer(spanningDataProvider);

		GlazedListsEventLayer eventLayer = new GlazedListsEventLayer<>(bodyDataLayer, sortedList);
		ColumnReorderLayer columnReorderLayer = new ColumnReorderLayer(eventLayer);
		ColumnGroupReorderLayer columnGroupReorderLayer = new ColumnGroupReorderLayer(columnReorderLayer,
				columnGroupModel);
		ColumnHideShowLayer hideShowLayer = new ColumnHideShowLayer(columnGroupReorderLayer);
		ColumnGroupExpandCollapseLayer columnGroupExpandCollapseLayer = new ColumnGroupExpandCollapseLayer(
				hideShowLayer, columnGroupModel);

		SelectionLayer selectionLayer = new SelectionLayer(columnGroupExpandCollapseLayer);
		ViewportLayer viewportLayer = new ViewportLayer(selectionLayer);

		// create the column header layer stack
		IDataProvider columnHeaderDataProvider = new SimpleColumnHeaderDataProvider(columns);
		DataLayer columnHeaderDataLayer = new DataLayer(columnHeaderDataProvider);
		ILayer columnHeaderLayer = new ColumnHeaderLayer(columnHeaderDataLayer, viewportLayer, selectionLayer);

		// setting Column Labels
		columnLabelAccumulator = new ColumnOverrideLabelAccumulator(bodyDataLayer);
		registerColumnLabels(columnLabelAccumulator);
		bodyDataLayer.setConfigLabelAccumulator(columnLabelAccumulator);

		SortHeaderLayer sortHeaderLayer = new SortHeaderLayer<>(columnHeaderLayer,
				new GlazedListsSortModel<>(sortedList, columnPropertyAccessor, configRegistry, columnHeaderDataLayer));
		ColumnGroupHeaderLayer columnGroupHeaderLayer = new ColumnGroupHeaderLayer(sortHeaderLayer, selectionLayer,
				columnGroupModel);

		FilterRowHeaderComposite filterRowHeaderLayer = new FilterRowHeaderComposite<>(
				new DefaultGlazedListsFilterStrategy<>(filterList, columnPropertyAccessor, configRegistry),
				columnGroupHeaderLayer, columnHeaderDataLayer.getDataProvider(), configRegistry);

		// create the row header layer stack
		IDataProvider rowHeaderDataProvider = new DefaultRowHeaderDataProvider(bodyDataProvider);
		DataLayer rowHeaderDataLayer = new DataLayer(rowHeaderDataProvider);
		rowHeaderDataLayer.setDefaultColumnWidth(20);
		ILayer rowHeaderLayer = new RowHeaderLayer(rowHeaderDataLayer, viewportLayer, selectionLayer);

		// create the corner layer stack
		CornerLayer cornerLayer = new CornerLayer(
				new DataLayer(new DefaultCornerDataProvider(columnHeaderDataProvider, rowHeaderDataProvider)),
				rowHeaderLayer, filterRowHeaderLayer);
		// create the grid layer composed with the prior created layer stacks
		GridLayer gridLayer = new GridLayer(viewportLayer, filterRowHeaderLayer, rowHeaderLayer, cornerLayer);

		configNatTable(configRegistry);

		ModernNatTableThemeConfiguration modern = new ModernNatTableThemeConfiguration();
		modern.cHeaderHAlign = HorizontalAlignmentEnum.CENTER;
		modern.cGroupHeaderHAlign = HorizontalAlignmentEnum.CENTER;

		natTable = new NatTable(body, SWT.NO_BACKGROUND | SWT.H_SCROLL | SWT.V_SCROLL, gridLayer, false);
		natTable.setConfigRegistry(configRegistry);
		natTable.addConfiguration(modern);
		// natTable.addConfiguration(new SingleClickSortConfiguration());
		// natTable.addConfiguration(new PivotGridHeaderMenu(natTable));
		natTable.addConfiguration(new HeaderMenuConfiguration(natTable));
		natTable.addConfiguration(new FilterRowConfiguration());
		natTable.configure();
		GridDataFactory.fillDefaults().grab(true, true).applyTo(natTable);

		tabItem.setControl(body);
	}

	private void registerColumnLabels(ColumnOverrideLabelAccumulator columnLabelAccumulator) {
		for (int i = 0; i < columns.size(); i++) {
			columnLabelAccumulator.registerColumnOverrides(i, "COLUMN");
		}
	}

	private void configNatTable(ConfigRegistry configRegistry) {
		configRegistry.registerConfigAttribute(CellConfigAttributes.CELL_PAINTER, new TableCellPainter(),
				DisplayMode.NORMAL, "COLUMN");
	}

	private double minPair(List<Pair<String>> list, String name, int row) {
		if (list.size() > 0) {
			double min = Double.valueOf(list.get(0).b);
			for (Pair<String> pair : list) {
				if (min > Double.valueOf(pair.b)) {
					min = Double.valueOf(pair.b);
				}
			}
			if (filterList.get(row).containsKey(name)) {
				ArrayList y = (ArrayList) filterList.get(row).get(name);
				min = (min + Double.valueOf((String) y.get(0))) / 2;
			}
			return min;
		}
		return 0;
	}

	private double maxPair(List<Pair<String>> list, String name, int row) {
		if (list.size() > 0) {
			double max = Double.valueOf(list.get(0).b);
			for (Pair<String> pair : list) {
				if (max < Double.valueOf(pair.b)) {
					max = Double.valueOf(pair.b);
				}
			}
			if (filterList.get(row).containsKey(name)) {
				ArrayList y = (ArrayList) filterList.get(row).get(name);
				max = (max + Double.valueOf((String) y.get(1))) / 2;
			}
			return max;
		}
		return 0;
	}

	private double averagePair(List<Pair<String>> list, String name, int row) {
		if (list.size() > 0) {
			double average = 0;
			for (Pair<String> pair : list) {
				average += Double.valueOf(pair.b);
			}
			average = average / list.size();
			if (filterList.get(row).containsKey(name)) {
				ArrayList y = (ArrayList) filterList.get(row).get(name);
				average = (average + Double.valueOf((String) y.get(2))) / 2;
			}
			average = average * 100;
			average = Math.round(average);
			average = average / 100;
			return average;
		}
		return 0;
	}

	private double medianPair(List<Pair<String>> list, String name, int row) {

		ArrayList<Double> sortedList;
		double median;

		sortedList = sortPairList(list);

		if (list.size() > 0) {
			if (sortedList.size() % 2 == 0)
				median = (sortedList.get(sortedList.size() / 2) + sortedList.get(sortedList.size() / 2 - 1)) / 2;
			else
				median = sortedList.get(sortedList.size() / 2);

			if (filterList.get(row).containsKey(name)) {
				ArrayList y = (ArrayList) filterList.get(row).get(name);
				median = (median + Double.valueOf((String) y.get(3))) / 2;
			}

			median = median * 100;
			median = Math.round(median);
			median = median / 100;

			return median;
		}
		return 0;
	}

	private ArrayList<Double> sortPairList(List<Pair<String>> list) {

		ArrayList<Double> sortList = new ArrayList<>();

		for (Pair<String> pair : list) {
			sortList.add(Double.valueOf(pair.b));
		}

		Collections.sort(sortList);

		return sortList;

	}

	private double min(List<Entry<Integer, Integer>> list, String name, int row) {
		if (list.size() > 0) {
			double min = (double) (list.get(0).getValue());
			for (Entry<Integer, Integer> entry : list) {
				if (min > (double) entry.getValue()) {
					min = (double) entry.getValue();
				}
			}
			if (filterList.get(row).containsKey(name)) {
				ArrayList<String> y = (ArrayList) filterList.get(row).get(name);
				min = (min + Double.valueOf(y.get(0))) / 2;
			}
			return min;
		}
		return 0;
	}

	private double max(List<Entry<Integer, Integer>> list, String name, int row) {
		if (list.size() > 0) {
			double max = (double) list.get(0).getValue();
			for (Entry<Integer, Integer> entry : list) {
				if (max < (double) entry.getValue()) {
					max = (double) entry.getValue();
				}
			}
			if (filterList.get(row).containsKey(name)) {
				ArrayList<String> y = (ArrayList) filterList.get(row).get(name);
				max = (max + Double.valueOf(y.get(1))) / 2;
			}
			return max;
		}
		return 0;
	}

	private double average(List<Entry<Integer, Integer>> list, String name, int row) {
		if (list.size() > 0) {
			double average = 0;
			for (Entry<Integer, Integer> entry : list) {
				average += (double) entry.getValue();
			}
			average = average / list.size();
			if (filterList.get(row).containsKey(name)) {
				ArrayList<String> y = (ArrayList) filterList.get(row).get(name);
				average = (average + Double.valueOf(y.get(2))) / 2;
			}
			average = average * 100;
			average = Math.round(average);
			average = average / 100;
			return average;
		}
		return 0;
	}

	private double median(List<Entry<Integer, Integer>> list, String name, int row) {

		ArrayList<Integer> sortedList;
		double median;
		if (list.size() > 0) {
			sortedList = sortList(list);

			if (sortedList.size() % 2 == 0)
				median = (sortedList.get(sortedList.size() / 2) + sortedList.get(sortedList.size() / 2 - 1)) / 2;
			else
				median = sortedList.get(sortedList.size() / 2);

			if (filterList.get(row).containsKey(name)) {
				ArrayList<String> y = (ArrayList) filterList.get(row).get(name);
				median = (median + Double.valueOf(y.get(3))) / 2;
			}

			median = median * 100;
			median = Math.round(median);
			median = median / 100;

			return median;
		}
		return 0;

	}

	private ArrayList<Integer> sortList(List<Entry<Integer, Integer>> list) {

		ArrayList<Integer> sortList = new ArrayList<>();

		for (Entry<Integer, Integer> entry : list) {
			sortList.add(entry.getValue());
		}

		Collections.sort(sortList);

		return sortList;

	}

	private void createValueRow(String classname, String instance, String attribute) {
		Map<String, Object> row = new HashMap<>();
		row.put(columns.get(0), classname);
		row.put(columns.get(1), instance);
		row.put(columns.get(2), attribute);
		ArrayList<String> list = new ArrayList<>();
		list.add("min:");
		list.add("max:");
		list.add("average:");
		list.add("median:");
		row.put(columns.get(3), list);
		filterList.add(row);
		
	}

	private int getRowNumber(String classname, String instance, String attribute) {
		for (Map<String, Object> map : filterList) {
			if (map.containsValue(classname) && map.containsValue(instance) && map.containsValue(attribute)) {

				return filterList.indexOf(map);
			}
		}
		return -1;
	}

	private void addValues(String name, ArrayList<String> values, int row) {

		filterList.get(row).put(name, values);
		
		natTable.refresh();
	}

	private void addScenario(String name) {
		if (!columns.contains(name)) {
			columns.add(name);
			registerColumnLabels(columnLabelAccumulator);
			natTable.refresh();
		}
	}

	public void resetPivotGrid() {
		filterList.clear();
		for (int i = 4; i < columns.size(); i++) {
			columns.remove(i);
		}
	}

	private ArrayList<ArrayList<Entry<Integer, Integer>>> reform(List<Entry<Integer, Boolean>> list) {

		ArrayList<Entry<Integer, Integer>> trueValues = new ArrayList<>();
		ArrayList<Entry<Integer, Integer>> falseValues = new ArrayList<>();

		for (int i = 0; i < list.size() - 1; i++) {

			if (list.get(i).getValue()) {
				trueValues.add(new AbstractMap.SimpleEntry<>(list.get(i).getKey(),
						list.get(i + 1).getKey() - list.get(i).getKey()));
			} else {
				falseValues.add(new AbstractMap.SimpleEntry<>(list.get(i).getKey(),
						list.get(i + 1).getKey() - list.get(i).getKey()));
			}
		}

		ArrayList<ArrayList<Entry<Integer, Integer>>> returnList = new ArrayList<>();

		returnList.add(trueValues);
		returnList.add(falseValues);

		return returnList;
	}

	public void porpertyObserver(Map<String, Pair<String>> title, Map<String, List<Pair<String>>> data, int rowNumber) {
		// Map<String, Map<String, List<String>>> classAndObject = new HashMap<>();
		String scenarion = "Scenario" + rowNumber;
		addScenario(scenarion);

		for (String key : title.keySet()) {

			String[] id = title.get(key).b.split("__");
			String[] classAndProperty = id[1].split(":");
			String[] instance = id[0].split("_");

			if (getRowNumber(classAndProperty[0],instance[0], classAndProperty[1]) == -1) {
				createValueRow(classAndProperty[0], instance[0], classAndProperty[1]);
			}
			int row = getRowNumber(classAndProperty[0], instance[0], classAndProperty[1]);

			ArrayList<String> list = new ArrayList<>();
			list.add(String.valueOf(minPair(data.get(key), scenarion, row)));
			list.add(String.valueOf(maxPair(data.get(key), scenarion, row)));
			list.add(String.valueOf(averagePair(data.get(key), scenarion, row)));
			list.add(String.valueOf(medianPair(data.get(key), scenarion, row)));

			addValues(scenarion, list, row);
		}
	}

	public void resultQueue(Map<String, List<Entry<Integer, Integer>>> resultQueue, int rowNumber) {
		String scenarion = "Scenario" + rowNumber;
		addScenario(scenarion);
		System.out.println(resultQueue.size());
		for (String key : resultQueue.keySet()) {

			String[] typAndid = key.split(" ");

			if (getRowNumber(typAndid[0], typAndid[1], "size") == -1) {
				createValueRow(typAndid[0], typAndid[1], "size");
			}

			int row = getRowNumber(typAndid[0], typAndid[1], "size");

			ArrayList<String> list = new ArrayList<>();
			list.add(String.valueOf(min(resultQueue.get(key), scenarion, row)));
			list.add(String.valueOf(max(resultQueue.get(key), scenarion, row)));
			list.add(String.valueOf(average(resultQueue.get(key), scenarion, row)));
			list.add(String.valueOf(median(resultQueue.get(key), scenarion, row)));

			addValues(scenarion, list, row);
		}
	}

	public void resultObjectActivity(Map<String, List<Entry<Integer, Boolean>>> resultSimObjActive, int rowNumber) {

		String scenarion = "Scenario" + rowNumber;
		addScenario(scenarion);
		System.out.println(resultSimObjActive.size());

		for (String key : resultSimObjActive.keySet()) {
			String[] typAndid = key.split(" ");
			
			int rowActive;
			int rowInActive;
			
			if (typAndid.length == 3) {
				if (getRowNumber(typAndid[0], typAndid[2], "active") == -1
						&& getRowNumber(typAndid[0], typAndid[2], "inactive") == -1) {
					createValueRow(typAndid[0], typAndid[2], "active");
					createValueRow(typAndid[0], typAndid[2], "inactive");
				}
				
				rowActive = getRowNumber(typAndid[0], typAndid[2], "active");
				rowInActive = getRowNumber(typAndid[0], typAndid[2], "inactive");
				
			} 
			else {
				if (getRowNumber(typAndid[0], typAndid[0] + "1", "active") == -1
						&& getRowNumber(typAndid[0], typAndid[0] + "1", "inactive") == -1) {
					createValueRow(typAndid[0], typAndid[0] + "1", "active");
					createValueRow(typAndid[0], typAndid[0] + "1", "inactive");
				}
				
				rowActive = getRowNumber(typAndid[0], typAndid[0] + "1", "active");
				rowInActive = getRowNumber(typAndid[0], typAndid[0] + "1", "inactive");
			}
			
			ArrayList<ArrayList<Entry<Integer, Integer>>> list = reform(resultSimObjActive.get(key));

			ArrayList<String> y = new ArrayList<>();
			y.add(String.valueOf(min(list.get(0), scenarion, rowActive)));
			y.add(String.valueOf(max(list.get(0), scenarion, rowActive)));
			y.add(String.valueOf(average(list.get(0), scenarion, rowActive)));
			y.add(String.valueOf(median(list.get(0), scenarion, rowActive)));

			addValues(scenarion, y, rowActive);

			y = new ArrayList<>();
			y.add(String.valueOf(min(list.get(1), scenarion, rowInActive)));
			y.add(String.valueOf(max(list.get(1), scenarion, rowInActive)));
			y.add(String.valueOf(average(list.get(1), scenarion, rowInActive)));
			y.add(String.valueOf(median(list.get(1), scenarion, rowInActive)));

			addValues(scenarion, y, rowInActive);
		}

	}
}
