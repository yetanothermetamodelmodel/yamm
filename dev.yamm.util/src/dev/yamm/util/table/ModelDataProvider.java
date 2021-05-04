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
package dev.yamm.util.table;

import org.eclipse.nebula.widgets.nattable.data.IDataProvider;

import dev.yamm.util.tableModel.table.Column;

public class ModelDataProvider implements IDataProvider
{

	private dev.yamm.util.tableModel.table.Tab tabModel;
	
	public dev.yamm.util.tableModel.table.Tab getTabModel()
	{
		return tabModel;
	}
	
	public ModelDataProvider(dev.yamm.util.tableModel.table.Tab tabModel)
	{
		this.tabModel = tabModel;
	}
	
	@Override
	public Object getDataValue(int columnIndex, int rowIndex)
	{
		return tabModel.getColumns().get(columnIndex).getValues().get(rowIndex);
	}

	@Override
	public void setDataValue(int columnIndex, int rowIndex, Object newValue)
	{
	}

	@Override
	public int getColumnCount()
	{
		return tabModel.getColumns().size();
	}

	@Override
	public int getRowCount()
	{
		Column column = tabModel.getColumns().get(0);
		if (column == null)
			return 0;
		return column.getValues().size();
	}

}
