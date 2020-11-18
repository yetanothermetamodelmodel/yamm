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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.nebula.widgets.nattable.data.IDataProvider;

import ca.odell.glazedlists.EventList;
import ca.odell.glazedlists.GlazedLists;
import online.yamm.util.ValueObserver;

public class DataProvider implements IDataProvider
{
	private EObject dataObject;
	
	private EventList<List<Object>> data;
	private ValueObserver valueObserver;
	public boolean listenerActive = false;
	Map<String, String> propertyToLabelMap;
	List<String> propertyNames;
	
	public DataProvider(EObject dataObject)
	{
		propertyNames = new ArrayList<>();
		propertyToLabelMap = new HashMap<>();
		data = GlazedLists.eventList(new ArrayList<>());
		data.add(new ArrayList<>());
		this.dataObject = dataObject;
		valueObserver = new ValueObserver();
		valueObserver.addListener(new ValueObserver.Listener()
		{	
			@Override
			public void valueChanged(String featureId, Number newValue)
			{		
				if (listenerActive)
					data.add(new ArrayList<>(valueObserver.getData().values()));
			}
		});
	}
	
	public void addFeature(EObject object, String featureName, String labelName) {
		EStructuralFeature feature = dataObject.eClass().getEStructuralFeature(featureName);
		data.get(0).add(dataObject.eGet(feature));
		valueObserver.addFeature(object, featureName, labelName);
		propertyToLabelMap.put(featureName, labelName);
		propertyNames.add(featureName);
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

}
