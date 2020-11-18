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

import java.util.ArrayList;

import org.eclipse.nebula.widgets.nattable.data.IDataProvider;

public class YammColumnHeaderDataProvider implements IDataProvider{
	
	protected ArrayList<ArrayList<String>> column;
	protected ArrayList<ArrayList<Object>> rows;
	
	public YammColumnHeaderDataProvider(ArrayList<ArrayList<String>> column, ArrayList<ArrayList<Object>> rows) {
		this.column = column;
		this.rows = rows;
	}
	
	@Override
	public Object getDataValue(int columnIndex, int rowIndex) {
		return this.column.get(columnIndex).get(0);
	}

	@Override
	public void setDataValue(int columnIndex, int rowIndex, Object newValue) {
		this.column.get(columnIndex).set(0, newValue.toString());		
	}

	@Override
	public int getColumnCount() {
		return this.column.size();
	}

	@Override
	public int getRowCount() {
		return 1;
	}

}
