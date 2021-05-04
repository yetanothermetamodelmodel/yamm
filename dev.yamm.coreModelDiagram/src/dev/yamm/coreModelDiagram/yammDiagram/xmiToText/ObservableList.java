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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class ObservableList<T> extends LinkedList<T>
{
	private List<ListListener<T>> listener = new LinkedList<>();

	public void addListener(ListListener<T> listener)
	{
		this.listener.add(listener);
	}

	@Override
	public void add(int index, T newValue)
	{
		notify(new ListEvent<T>(ListEvent.ADD, index, newValue, 0, null));
		super.add(index, newValue);
	}

	@Override
	public T set(int index, T newValue)
	{
		notify(new ListEvent<T>(ListEvent.UPDATE, index, newValue, 1, null));
		return super.set(index, newValue);
	}

	@Override
	public T remove(int index)
	{
		notify(new ListEvent<T>(ListEvent.REMOVE, index, null, 1, null));
		return super.remove(index);
	}
	
	@Override
	protected void removeRange(int fromIndex, int toIndex)
	{
		notify(new ListEvent<T>(ListEvent.REMOVEALL, fromIndex, null, toIndex - fromIndex + 1, null));
		super.removeRange(fromIndex, toIndex + 1);
	}
	
//	public boolean addAllString() {
//		
//	}
	
	@Override
	public boolean addAll(int index, Collection<? extends T> c)
	{
		notify(new ListEvent<T>(ListEvent.ADDALL, index, null, c.size(), c));
		return super.addAll(index, c);
	}
	
	

	private void notify(ListEvent<T> event) 
	{
		listener.forEach(l -> l.listChanged(event));
	}
	
	public static class ListListener<T>
	{

		public void listChanged(ListEvent<T> listEvent)
		{
		}

	}

	public static class ListEvent<T>
	{
		public static final int ADD = 2;
		public static final int UPDATE = 3;
		public static final int REMOVE = 4;
		public static final int REMOVEALL = 5;
		public static final int ADDALL = 6;
		
		private int type;
		private int index;
		private T newValue;
		private int lines;
		private Collection<? extends T> newValues;
		
		public ListEvent(int type, int index, T newValue, int lines, Collection<? extends T> newValues)
		{
			this.type = type;
			this.index = index;
			this.newValue = newValue;
			this.lines = lines;
			this.newValues = newValues;
		}
		
		public Collection<? extends T> getNewValues()
		{
			return newValues;
		}

		public int getLines()
		{
			return lines;
		}
		
		public int getIndex()
		{
			return index;
		}

		public T getNewValue()
		{
			return newValue;
		}

		public int getType()
		{
			return type;
		}

	}
}
