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

import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.IDebugElement;
import org.eclipse.debug.core.model.IVariable;
import org.eclipse.debug.core.model.IWatchExpressionDelegate;
import org.eclipse.debug.core.model.IWatchExpressionListener;

/**
 * A Class for computing values for a given watch expression. Extends 
 * org.eclipse.debug.core.watchExpressionDelegates. 
 * Must implement org.eclipse.debug.core.model.IWatchExpressionDelegate.
 */
public class WatchExpressionDelegate implements IWatchExpressionDelegate {

	@Override
	public void evaluateExpression(String expression, IDebugElement context,
			IWatchExpressionListener listener) 
	{
		YAMMVariable yammVariable = null;

		if (context instanceof YAMMStackFrame) 
		{
			YAMMStackFrame yammStackFrame = (YAMMStackFrame) context;
			try {
				IVariable[] iVariables = yammStackFrame.getVariables();
				for (IVariable iVariable : iVariables) 
				{
					String topVarName = iVariable.getName();
					if (iVariable instanceof YAMMVariable)
					{
						if  (topVarName != null)
						{
							if (topVarName.equals(expression)) 
							{						
								yammVariable = (YAMMVariable) iVariable; // expression is top - level variable
							}
							else if (topVarName.equals("this")) //expression is attribute of top - level variable
							{						
 								yammVariable = getVariablesOfTopLevelVariables(expression, yammVariable, iVariable);
 								
								if (yammVariable != null)
									break;
							}
						}
					}
				}
			} catch (DebugException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (yammVariable != null) {
			WatchExpressionResult result = new WatchExpressionResult(yammVariable);
			listener.watchEvaluationFinished(result);
		}
	}

	/**
	 * Gets the specified {@code YAMMVariable} if the sought after expression is an attribute of 
	 * the top -level variable 'this'. 
	 * 
	 * @param expression	:	the sought after {@code YAMMVariable}
	 * @param yammVariable	:	the appropriate YAMMVariable  
	 * @param iVariable		:	the top - level variable ('this')
	 * @return					the appropriate YAMMVariable
	 * @throws DebugException
	 */
	private YAMMVariable getVariablesOfTopLevelVariables(String expression, YAMMVariable yammVariable,
			IVariable iVariable) throws DebugException
	{
		YAMMVariable thisVariable = (YAMMVariable) iVariable;
		YAMMValue value = (YAMMValue) thisVariable.getValue(); //get Value of this
		if (value != null && value.hasVariables())
		{
			IVariable[] variablesOfThis = value.getVariables();			// get Variables of value of this
			for (IVariable var: variablesOfThis)
			{
				String varName = var.getName();

				if (varName != null)
				{
					if (varName.equals(expression))
					{
						yammVariable = (YAMMVariable) var;
						break;
					}
				}
			}
		}
		return yammVariable;
	}

}
