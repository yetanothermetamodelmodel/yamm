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
import java.util.List;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;

import online.yamm.ObjectManagement;

public abstract class InoutAdapter extends AdapterImpl {

	protected ObjectManagement om;
	protected List<Notifier> targets = new ArrayList<Notifier>();

	protected EObject objWithProperty;
	protected String propertyName;

	protected EObject stackFrame;
	protected String parameterName;

	protected boolean active = true;

	protected String paramNameForInit; // when an inout-Parameter is handed over to an Operation again as inout-Parameter
	
	@Override
	public void setTarget(Notifier newTarget) {
		targets.add(newTarget);
	}

	public List<Notifier> getTargets() {
		return targets;
	}

	@Override
	public void unsetTarget(Notifier oldTarget) {
		targets.remove(oldTarget);
	}

	public ObjectManagement getOm() {
		return om;
	}

	public void setOm(ObjectManagement om) {
		this.om = om;
	}

	public EObject getObjWithProperty() {
		return objWithProperty;
	}

	public void setObjWithProperty(EObject objWithProperty) {
		this.objWithProperty = objWithProperty;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public EObject getStackFrame() {
		return stackFrame;
	}

	public void setStackFrame(EObject stackFrame) {
		this.stackFrame = stackFrame;
	}

	public String getParameterName() {
		return parameterName;
	}

	public void setParameterName(String parameterName) {
		this.parameterName = parameterName;
	}

	public String getParamNameForInit() {
		return paramNameForInit;
	}

	public void setParamNameForInit(String paramNameForInit) {
		this.paramNameForInit = paramNameForInit;
	}
}
