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

import java.util.ArrayList;

import org.eclipse.nebula.widgets.nattable.data.IColumnPropertyAccessor;
import org.eclipse.nebula.widgets.nattable.data.IDataProvider;
import org.eclipse.nebula.widgets.nattable.data.IRowDataProvider;

public class YammDataProvider implements IRowDataProvider{
	
	protected ArrayList<ArrayList<Object>> data;
	protected IColumnPropertyAccessor columnPropertyAccessor;

    public YammDataProvider(ArrayList<ArrayList<Object>> data, IColumnPropertyAccessor myColumnPropertyAccessor) {
        this.data = data;
        this.columnPropertyAccessor = myColumnPropertyAccessor;
    }

    @Override
    public Object getDataValue(int columnIndex, int rowIndex) {
    		return this.data.get(rowIndex).get(columnIndex);
    }

    @Override
    public void setDataValue(int columnIndex, int rowIndex, Object newValue) {
    	this.data.get(rowIndex).set(columnIndex, newValue);
    }

    @Override
    public int getColumnCount() {
    	return this.columnPropertyAccessor.getColumnCount();
    }

    @Override
    public int getRowCount() {
        return this.data.size();
    }

	@Override
	public Object getRowObject(int rowIndex) {
		return this.data.get(rowIndex);
	}

	@Override
	public int indexOfRowObject(Object rowObject) {
		return this.data.indexOf(rowObject);
	}
}
