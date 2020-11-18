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


import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.swt.widgets.TableItem;

import online.yamm.Common;

/**
 * A class that allows modifying the values of the some {@link LayerView} controls.
 * It gives access to class {@link Layer} (as the  data model). It allows changing 
 * the simulation's conditions dynamically by editing values of {@link Layer}'s variables.
 */
public class LayerCellModifier implements ICellModifier 
{
	/** A list holding the names of the columns. */
	static List<String> columnNames;
	
	/** The {@code ViewPart} implementation holding the controls.*/
	private LayerView layerView;

	/**
	 * Constructor accepting a String array that represents the column names of the
	 * {@code LayerView}'s cell editor and the specific LayerView instance itself.
	 * 
	 * @param columnNames	:	the cell editor�s column names appropriate to the {@code Layer}
	 * 							attributes. 
	 * @param layerView		:	the current LayerView instance
	 */
	public LayerCellModifier(String[] columnNames, LayerView layerView) 
	{
		super();
		LayerCellModifier.columnNames = Arrays.asList(columnNames);
		this.layerView = layerView;
	}

	/**
	 * Checks if the given property can be changed - always true.
	 * 	  
	 * @param arg0	:	the data model {@code Layer}. 
	 * @param arg1	:	the {@link Layer}'s property that is to be changed
	 */
	@Override
	public boolean canModify(Object arg0, String arg1) 
	{
		return true;
	}

	/**
	 * Accesses the {@link Layer}'s  attributes.
	 * 
	 * @param element	:	the data model {@link Layer}. 
	 * @param property	:	the {@link Layer}'s  attibute that is to be get
	 */
	@Override
	public Object getValue(Object element, String property) 
	{
		int columnIndex = columnNames.indexOf(property);

		Object result = null;
		Layer actLayer = (Layer) element;

		switch (columnIndex) 
		{
		case 0: result = actLayer.getPath();break;
		case 1: result = actLayer.getNsURI(); break;
		case 2: result = actLayer.isBreakpoint();break;
		case 3: result = ""+actLayer.getWaittime();break;
		case 4: result = actLayer.getColorLayer();break;
		case 5: result = actLayer.isLogLayer();break;
		case 6: result = actLayer.isStepWait();break;
		}
		return result;
	}

	/**
	 * Modifies the {@code Layer}�s attributes.
	 * 
	 * @param element	:	the TableItem representing the {@code Layer}�s data (the property to be 
	 * 						changed)
	 * @param property	:	the {@code Layer}�s attibute that is to be get
	 * @param value		:	the new value of the property
	 */
	@Override
	public void modify(Object element, String property, Object value) 
	{
		int columnIndex = columnNames.indexOf(property);
		TableItem item = (TableItem) element;
		Layer actLayer = (Layer) item.getData();

		switch (columnIndex) 
		{
		case 0: break;
		case 1: actLayer.setNsURI(((String) value).trim()); break;
		case 2: actLayer.setBreakpoint(((Boolean) value).booleanValue());break;
		case 3: {
			if(((String) value).trim().equals("")) 
			{
				actLayer.setWaittime(0);
			} 
			else 
			{
				actLayer.setWaittime(Long.valueOf(((String) value).trim()).longValue());
			}
			break;
		}
		case 4: actLayer.setColorLayer(((Boolean) value).booleanValue()); break;
		case 5: actLayer.setLogLayer(((Boolean) value).booleanValue()); break;
		case 6: {
			if(((Boolean) value).booleanValue()) 
			{
				setStepWait();
				actLayer.setStepWait(true);
			}
			break;
		}
		}
		layerView.updateView();
	}

	/**
	 * Radio button Step/Wait can be true for only one layer. If it is changed by the user in the 
	 * view, each {@code Layer}�s attribute {@code stepWait} has to be set as false in a first step
	 * while the chosen Layer�s attribute is set true again in a second step
	 * in {@link #modify(Object, String, Object)}.
	 */
	private void setStepWait() 
	{
		for (int i = 0; i < LayerView.yamm.reflectivStateChart.objectManagement.getViewLayers().size(); i++) 
		{
			Layer layer = (Layer) LayerView.yamm.reflectivStateChart.objectManagement.getViewLayers().get(i);
			layer.setStepWait(false);
		}
	}

}
