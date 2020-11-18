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
package online.yamm.operations;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class InoutAdapterMany extends InoutAdapter {

	@SuppressWarnings("all")
	@Override
	public void notifyChanged(Notification msg) {
		EObject notifier = (EObject) msg.getNotifier();
		Object changedFeature = msg.getFeature();
		if (!(changedFeature instanceof EStructuralFeature))
			return;
		String featureName = ((EStructuralFeature) changedFeature).getName();

		if ((notifier == objWithProperty && featureName.equals(propertyName))
				|| (notifier == stackFrame && featureName.equals(parameterName))) {

			if (active) {
				active = false;

				EObject objToNotify;
				if (notifier == stackFrame) {
					objToNotify = objWithProperty;
					featureName = propertyName;
				} else {
					objToNotify = stackFrame;
					featureName = parameterName;
				}

				EList list = (EList) om.get(objToNotify, featureName);
				int pos = msg.getPosition();
				
				switch (msg.getEventType()) {
				case Notification.SET:
//					om.set(objToNotify, msg.getNewValue(), featureName);
					break;
				case Notification.UNSET:
					;
					break;
				case Notification.ADD: // add(obj), add(pos, obj)
					if (list.size() == pos)
						list.add(msg.getNewValue());
					else
						list.add(pos, msg.getNewValue());
					break;
				case Notification.REMOVE:
					list.remove(pos);
					break;
				case Notification.ADD_MANY:
					List newValue = (List) msg.getNewValue();
					if (newValue == list)
						newValue = new ArrayList(newValue);
					if (list.size() == pos)
						list.addAll((Collection) msg.getNewValue());
					else 
						list.addAll(pos, newValue);					
					
					break;
				case Notification.REMOVE_MANY:
					if (msg.getNewValue() == null)
						list.clear();
					else {
						List removeThis = new ArrayList();
						for (int index : (int[])msg.getNewValue()) {
							removeThis.add(list.get(index));
						}
						list.removeAll(removeThis);
					}
					break;
				case Notification.MOVE:
					list.move(pos, msg.getNewValue());
					break;
				default:
					break;
				}

			} else {
				active = true;
			}
		}
	}
}
