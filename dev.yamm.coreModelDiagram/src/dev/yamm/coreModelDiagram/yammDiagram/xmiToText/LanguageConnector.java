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
package dev.yamm.coreModelDiagram.yammDiagram.xmiToText;

import java.util.Collection;
import java.util.List;

import dev.yamm.coreModelDiagram.yammDiagram.FeatureInfo;

public class LanguageConnector
{
	protected ObservableList<String> internalDsl;

	public void setInternalRep(ObservableList<String> internalDsl)
	{
		this.internalDsl = internalDsl;
		internalDsl.addListener(new ObservableList.ListListener<String>()
		{
			@Override
			public void listChanged(ObservableList.ListEvent<String> listEvent)
			{
				try
				{
					int index = listEvent.getIndex();
					String newValue = listEvent.getNewValue();
					switch (listEvent.getType())
					{
						case ObservableList.ListEvent.ADD:
							add(index, newValue);
							break;
						case ObservableList.ListEvent.UPDATE:
							update(index, newValue);
							break;
						case ObservableList.ListEvent.REMOVE:
							remove(index);
							break;
						case ObservableList.ListEvent.REMOVEALL:
							removeAll(index, listEvent.getLines());
							break;
						case ObservableList.ListEvent.ADDALL:
							addAll(index, listEvent.getLines(), listEvent.getNewValues());
							break;
						default:
							break;
					}
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
		
			}
		});
	}


	protected void update(int index, String newValue) throws Exception
	{
	}
	
	protected void add(int index, String newValue) throws Exception
	{
	}

	protected void remove(int index) throws Exception
	{		
	}
	
	protected void removeAll(int index, int lines) throws Exception
	{		
	}
	
	protected void addAll(int index, int lines, Collection<? extends String> values) throws Exception
	{		
	}
	
	public void initEffectStub(int position)
	{
	}
	
	public void deleteEffectStub(int position)
	{
	}
	
	public List<String> insertEffectAndReturnProposals(int position, String newValue)
	{
		return null;
	}


	public void useAddBuffer()
	{
	}


	public void writeAddBuffer()
	{	
	}
	
	public void goToPosition(int startLine, int endLine) {	
	}
	
	public void goToGuard(int startLine, int endLine, String id, FeatureInfo info) {}
	
	public void goToEffect(int startLine, int endLine, String id, FeatureInfo info) {}
}
