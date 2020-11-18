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

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import online.yamm.Common;
import online.yamm.EvalGuardOrEffect;
import online.yamm.logger.YAMMLogger;

public class GetSet {

	private static YAMMLogger logger = YAMMLogger.getYAMMLogger("YAMM Log");
	EvalGuardOrEffect execute;

	public GetSet(EvalGuardOrEffect execute) {
		this.execute = execute;
	}

	public void setReturnValue(Object returnValue)
	{
		EObject smh = execute.reflectivStateChart.zerochart.activeStateMachineHandler;
		execute.reflectivStateChart.objectManagement.set(smh, returnValue, "returnVar");
	}
	
	public Object get(EObject eObject, String name) {
		return execute.reflectivStateChart.objectManagement.get(eObject, name);
	}

	@SuppressWarnings("unchecked")
	public void set(Object obj, String name, Object newValue) 
	{

		if(newValue == execute.reflectivStateChart.objectManagement.get((EObject) obj, name))
			return;

		try {
			execute.reflectivStateChart.objectManagement.set((EObject) obj, newValue, name);

		} catch (Exception e) {
			logger.error("(GetSet)Type Error. Tried to set feature \""+name+"\" of class \""+((EObject)obj).eClass().getName()+"\" on value \""+newValue+"\".");
		e.printStackTrace();
		}
	}
}
