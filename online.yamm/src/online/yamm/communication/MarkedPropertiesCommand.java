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
package online.yamm.communication;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import online.yamm.Pair;


public class MarkedPropertiesCommand implements Command, Serializable {
	
	private Entry<Map<String, Pair<String>>,Map<String, List<Pair<String>>>> resultMarkedProperties;
	private int row;
	
	public MarkedPropertiesCommand(Entry<Map<String, Pair<String>>,Map<String, List<Pair<String>>>> resultMarkedProperties, int row) {
		this.resultMarkedProperties = resultMarkedProperties;
		this.row = row;
	}

	@Override
	public void execute(ServerReciever reciever) {
		reciever.setMarkedProperties(resultMarkedProperties, row);
	}
	
	
}
