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
package dev.yamm.debug.model;

import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.IValue;
import org.eclipse.debug.core.model.IWatchExpressionResult;

/**
 * Reports the result (the variables value).
 */
public class WatchExpressionResult implements IWatchExpressionResult {

	String expression = null;
	YAMMVariable yammVariable;
	
	public WatchExpressionResult(YAMMVariable yammVariable) {
		this.yammVariable = yammVariable;
	}
	
	@Override
	public String[] getErrorMessages() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DebugException getException() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getExpressionText() {
		String result = null;
		try {
			String varName = yammVariable.getName();
			if (varName != null)
			{	
				result = varName;
			}
		} catch (DebugException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public IValue getValue() {
		YAMMValue yammValue = null;
		try {
			yammValue = (YAMMValue) yammVariable.getValue();
		} catch (DebugException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return yammValue;
	}

	@Override
	public boolean hasErrors() {
		// TODO Auto-generated method stub
		return false;
	}

}
