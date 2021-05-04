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
package dev.yamm.util;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.swt.widgets.Display;

import dev.yamm.coreModelXmi.yamm.YProperty;

public class ValueObserver
{
	private List<ValueObserver.Listener> listener = new LinkedList<>();
	private Map<String, Adapter> featureIdToInternalAdaper = new HashMap<>();
	private Map<String, Number> data = new HashMap<>();

	public void addFeature(EObject containingObject, String featureName, String featureId)
	{
		addFeature(containingObject, containingObject.eClass().getEStructuralFeature(featureName), featureId);
	}

	public void addFeature(EObject containingObject, YProperty property, String featureId)
	{
		addFeature(containingObject, property.getName(), featureId);
	}

	public void addFeature(final EObject containingObject, final EStructuralFeature feature, final String featureId)
	{
		if (!data.keySet().contains(featureId))
		{
			if (feature == null
					)
				System.out.println();
			boolean isMany = feature.isMany();

			if (isMany)
				data.put(featureId, (Number) ((EList) containingObject.eGet(feature)).size());
			else
				data.put(featureId, (Number) containingObject.eGet(feature));

			containingObject.eAdapters().add(new AdapterImpl()
			{
				@Override
				public void notifyChanged(Notification msg)
				{
					if (msg.getFeature() == feature)
					{
						final Number newValue;

						if (isMany)
							newValue = (Number) ((EList) containingObject.eGet(feature)).size();
						else
							newValue = (Number) containingObject.eGet(feature);

						if (!newValue.equals(data.get(featureId)))
						{
							Display.getDefault().syncExec(new Runnable() {
								public void run() {
									listener.forEach(listener -> listener.valueChanged(featureId, newValue));
								}
							});
							
							data.put(featureId, newValue);
						}
					}
				}
			});
		}
	}

	public Map<String, Number> getData()
	{
		return data;
	}

	public static interface Listener
	{
		void valueChanged(String featureId, Number newValue);
	}

	public void addListener(ValueObserver.Listener listener)
	{
		this.listener.add(listener);
	}

	public void removeListener(ValueObserver.Listener listener)
	{
		this.listener.remove(listener);
	}
}
