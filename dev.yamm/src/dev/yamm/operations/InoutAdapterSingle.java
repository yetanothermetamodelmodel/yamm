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
package dev.yamm.operations;


import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import dev.yamm.ObjectManagement;

public class InoutAdapterSingle extends InoutAdapter {

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

				switch (msg.getEventType()) {
				case Notification.SET:
					om.set(objToNotify, msg.getNewValue(), featureName);
					break;
				case Notification.UNSET:
					;
					break;
				case Notification.ADD:
					;
					break;
				case Notification.REMOVE:
					;
					break;
				case Notification.ADD_MANY:
					;
					break;
				case Notification.REMOVE_MANY:
					;
					break;
				case Notification.MOVE:
					;
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
