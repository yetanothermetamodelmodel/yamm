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

import java.util.Vector;

import dev.yamm.EvalGuardOrEffect;
import dev.yamm.init.LaunchTabGroupAnalysis;


public class CalculateSubEffects {

	EvalGuardOrEffect execute;

	public CalculateSubEffects(EvalGuardOrEffect execute) {
		this.execute = execute;
	}

	public int calculate(String calculation, int layer) {
		int result = 0;

		Vector<String> calcParts = new Vector<String>();
		while(calculation.contains("+") || calculation.contains("-")) {
			int indexA = 0;
			int indexS = 0;
			int indexP = 0;
			if(calculation.indexOf("+") != -1) {
				indexA = calculation.indexOf("+");
			}
			if(calculation.indexOf("-") != -1) {
				indexS = calculation.indexOf("-");
			}
			if(indexS < indexA || indexA == 0) {
				calcParts.add(calculation.substring(0, calculation.indexOf("-")).trim());
				indexP = indexS;
			} else {
				calcParts.add(calculation.substring(0, calculation.indexOf("+")).trim());
				indexP = indexA;
			}
			calcParts.add(""+calculation.charAt(indexP));
			calculation = calculation.substring(indexP+1, calculation.length());
		}
		calcParts.add(calculation.trim());

		boolean addition = true;
		for(int a=0;a<calcParts.size();a++) {
			int second = 0;
			if(calcParts.get(a).equals("+")) {
				addition = true;
			} else if(calcParts.get(a).equals("-")) {
				addition = false;
			} else {
				if(containsOnlyNumbers(calcParts.get(a)))
					second = Integer.parseInt(calcParts.get(a));
				else 
					second = execute.getValue.getValue(calcParts.get(a), layer);
			}
			if(addition) result += second;
			else result -= second;	
		}

		return result;
	}

	public boolean containsOnlyNumbers(String str) {  
		//It can't contain only numbers if it's null or empty...
		if (str == null || str.length() == 0)
			return false;

		for (int i = 0; i < str.length(); i++) {

			//If we find a non-digit character we return false.
			if (!Character.isDigit(str.charAt(i)))
				return false;
		}

		return true;
	}

	public void calc(String[] variables, String expression, int layer) {
		//Check if extended calc is needed
		String help = "";
		if(expression.contains("+")) {
			help = expression.substring(expression.indexOf("+")+1, expression.length());
		} else if(expression.contains("-")) {
			help = expression.substring(expression.indexOf("-")+1, expression.length());
		} else if(expression.contains("*")) {
			help = expression.substring(expression.indexOf("*")+1, expression.length());
		} else if(expression.contains("/")) {
			help = expression.substring(expression.indexOf("/")+1, expression.length());
		}
		if(help.contains("+")
				|| help.contains("-")
				|| help.contains("/")
				|| help.contains("*")) {
			extendedCalc(variables, expression, layer);
		}
		//Simple math(only one +/-)
		Object variableToSet = execute.getValue.getValue(variables, null, layer);
		String variableLeft = expression.substring(0,expression.indexOf("+")-1); 
		variableLeft = variableLeft.trim();
		String variableRight = expression.substring(expression.indexOf("+")+1, expression.length());
		variableRight = variableRight.trim();
		if(variableToSet instanceof Integer) {
			Integer valueLeft = new Integer(0);
			Integer valueRight = new Integer(0);
			try {
				valueLeft = Integer.parseInt(variableLeft);
			} catch (NumberFormatException e) {
				valueLeft = execute.getValue.getValue(variableLeft, layer);
			}
			try {
				valueRight = Integer.parseInt(variableRight);
			} catch (NumberFormatException e) {
				valueRight = execute.getValue.getValue(variableRight, layer);
			}
			if (expression.contains("+")) 
				execute.getValue.setValue(variables, null, valueLeft+valueRight, layer);
			else if (expression.contains("-"))
				execute.getValue.setValue(variables, null, valueLeft-valueRight, layer);
		} else if(variableToSet instanceof Double) {
			Double valueLeft = new Double(0);
			Double valueRight = new Double(0);
			try {
				valueLeft = Double.parseDouble(variableLeft);
			} catch (NumberFormatException e) {
				valueLeft = execute.getValue.getValue(variableLeft, layer);
			}
			try {
				valueRight = Double.parseDouble(variableRight);
			} catch (NumberFormatException e) {
				valueRight = execute.getValue.getValue(variableRight, layer);
			}
			if (expression.contains("+")) 
				execute.getValue.setValue(variables, null, valueLeft+valueRight, layer);
			else if (expression.contains("-"))
				execute.getValue.setValue(variables, null, valueLeft-valueRight, layer);
		} else if(variableToSet instanceof Float) {
			Float valueLeft = new Float(0);
			Float valueRight = new Float(0);
			try {
				valueLeft = Float.parseFloat(variableLeft);
			} catch (NumberFormatException e) {
				valueLeft = execute.getValue.getValue(variableLeft, layer);
			}
			try {
				valueRight = Float.parseFloat(variableRight);
			} catch (NumberFormatException e) {
				valueRight = execute.getValue.getValue(variableRight, layer);
			}
			if (expression.contains("+")) 
				execute.getValue.setValue(variables, null, valueLeft+valueRight, layer);
			else if (expression.contains("-"))
				execute.getValue.setValue(variables, null, valueLeft-valueRight, layer);
		}
	}

	private void extendedCalc(String[] variables, String expression, int layer) {
		//extendend calc / problem a[c+1]+b
		while(expression.contains("[")) {
			int begin = 0;			
			begin = expression.indexOf("[");
			int index = begin;
			while (expression.charAt(index) != ']') {
				if(expression.charAt(index) == '[') {
					begin = index;
				}
				index++;
			}
			begin--;
			char c = expression.charAt(begin);
			while('a'<=c && c<='z' || 'A'<=c && c<='Z' || '0'<=c && c<='9' || c=='.') {
				begin--;
				c = expression.charAt(begin);
			}
			String value = execute.getValue.getValue(expression.substring(begin, index+1), layer).toString();
			expression.replace(expression.substring(begin, index+1), value);
		}
		for(int i=0;i<expression.length();i++) {
			char c = expression.charAt(i);
			if('a'<=c && c<='z' || 'A'<=c && c<='Z') {
				for(int a=i;a<expression.length();a++) {
					if('a'<=c && c<='z' || 'A'<=c && c<='Z' || '0'<=c && c<='9' || c=='.') {
						continue;
					} else {
						String value = execute.getValue.getValue(expression.substring(i, a+1), layer).toString();
						expression.replace(expression.substring(i, a+1), value);
					}
				}
			} else {
				continue;
			}		
		}	
	}
}
