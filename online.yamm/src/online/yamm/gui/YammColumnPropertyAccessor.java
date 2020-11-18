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

import org.eclipse.nebula.widgets.nattable.data.IColumnPropertyAccessor;

public class YammColumnPropertyAccessor implements IColumnPropertyAccessor<ArrayList<String>> {
	
	protected ArrayList<ArrayList<String>> data = new ArrayList<>();
	
	public YammColumnPropertyAccessor(ArrayList<ArrayList<String>> data) {
		this.data = data;
	}
	
	
	@Override
	public Object getDataValue(ArrayList<String> rowObject, int columnIndex) {
		return rowObject.get(columnIndex);
	}

	@Override
	public void setDataValue(ArrayList<String> rowObject, int columnIndex, Object newValue) {
		rowObject.add(columnIndex, (String) newValue);
		
	}

	@Override
	public int getColumnCount() {
		return this.data.size();
	}

	@Override
	public String getColumnProperty(int columnIndex) {
		return data.get(columnIndex).get(0);
	}

	@Override
	public int getColumnIndex(String propertyName) {
		return data.indexOf(propertyName);
	}

	

	
}
