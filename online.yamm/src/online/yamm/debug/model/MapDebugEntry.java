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
package online.yamm.debug.model;

import java.util.HashMap;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EObject;

/**
 * Represents a single Entry of a java.util.HashMap as a Key- Value pair.
 */
public class MapDebugEntry extends VariableDebugEntry {

	/**Key of a HashMap entry. */
	private Object entryKey;
	/**Value of a HasMap entry.*/
	private Object entryValue;
	/**The HashMap of the entry.*/
	private HashMap map;
	
	/**
	 * Constructor accepting an entry object of a HashMap.
	 */
	MapDebugEntry(HashMap map, Entry e, String variableName, String variableType, Object value, int yammVariableId) 
	{
		super(null, variableName, variableType, value, yammVariableId);
		this.map = map;
		entryKey = e.getKey();
		entryValue = e.getValue();
	}

	/**
	 * Getter for {@link #map}.
	 * 
	 * @return HashMap map
	 */
	public HashMap getMap() {
		return map;
	}

	/**
	 * Setter for {@link #map}.
	 * @param map : the HashMap 
	 */
	public void setMap(HashMap map) {
		this.map = map;
	}

	/**
	 * Getter for {@link #entryKey}.
	 * @return entryKey
	 */
	public Object getEntryKey() {
		return entryKey;
	}

	/**
	 * Setter for {@link #entryKey}.
	 * @param entryKey
	 */
	public void setEntryKey(Object entryKey) {
		this.entryKey = entryKey;
	}

	/**
	 * Getter for {@link #entryValue}.
	 * @return entryValue
	 */
	public Object getEntryValue() {
		return entryValue;
	}

	/**
	 * Setter for {@link #entryValue}.
	 * @param entryValue
	 */
	public void setEntryValue(Object entryValue) {
		this.entryValue = entryValue;
	}

}
