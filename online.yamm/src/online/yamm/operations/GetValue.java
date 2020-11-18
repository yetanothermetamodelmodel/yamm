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

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;

import online.yamm.EvalGuardOrEffect;
import online.yamm.init.LaunchTabGroupAnalysis;
import online.yamm.logger.YAMMLogger;

public class GetValue {
	
	private static YAMMLogger logger = YAMMLogger.getYAMMLogger("YAMM Log");

	static final String regex_braces = "((?<=\\().*(?=\\)))";
	static final String regex_variable = ".*(?= :)";
	static final String regex_expression = "(?<=:= ).*";
	static final String regex_split_old = "(\\w*\\[.*\\]|\\w*)";
	static final String regex_split = "([\\w#%]*\\[(.)[^\\]]*\\]|[\\w#%]*)";
	public final static String regex_brackets = "(?<=\\[).*(?=\\])";
	public final static String regex_cutBrackets ="\\w*(?=\\[)|\\w*";
	static final String regex_spaces = ".*?(?= )";
	static final String regex_getInstancesOf_className = "(?<=\\().*(?=,\\{)";
	static final String regex_getInstancesOf_condition = "(?<=\\{\\().*(?=\\)})";
	static final String regex_getInstancesOf_condition_first = ".*(?=,)|.*";
	static final String regex_getInstancesOf_condition_second = "(?<=,).*";
	static final String regex_getInstancesOf_nr = "(?<=\\)\\[).*(?=\\])";
	static final String regex_guard_first_firstrang = "[^\\s]*((?= <)|(?= <=)|(?= >)|(?= >=))";
	static final String regex_guard_second_firstrang = "((?<=< )|(?<=<= )|(?<=> )|(?<=>= ))[^\\s]*";
	static final String regex_guard_first_secondrang = "[^\\s]*((?= ==)|(?= !=))";
	static final String regex_guard_second_secondrang = "((?<=== )|(?<=!= ))[^\\s]*";
	static final String regex_guard_first_thirdrang = "((?<=&& )|(?<=\\|\\| ))[^\\s]*";
	static final String regex_guard_second_thirdrang = "[^\\s]*((?= &&)|(?= \\|\\|))";
	static final String regex_guard_condition_split = ".*?((?= >=)|(?= <=)|(?= <)|(?= >)|(?= ==)|(?= !=)|(?= &&)|(?= \\|\\|))";
	static final String regex_guard_isInstancesOf = "(!isInstanceOf|isInstanceOf)\\([^\\(^\\)]*\\)";
	static final String regex_guard_condition_braces = "!?\\([^\\)]*\\)";
	static final String regex_guard_isInstancesOf_operandA = "(?<=\\{).*(?=})";
	static final String regex_guard_isInstancesOf_operandB = "(?<=,).*(?=\\))";

	public HashMap<String,Object> valueMap = new HashMap<String,Object>();
	public HashMap<String, String> regexMap = new HashMap<String, String>();
	int counterValues = 0;

	EObject getValue_curObj;
	EClass getValue_curClass;
	EStructuralFeature getValue_feature;
	
	int getValue_nr;
	String getValue_completeVariable;

	int counterBraces = 0;
	String result = "";
	
	EvalGuardOrEffect execute;
	
	public GetValue(EvalGuardOrEffect execute) {
		this.execute = execute;
	}
	
	public <K> void setValue(String[] variables, String expression, K givenValue, int layer) {
		String completeVariable = "";
		boolean put = false;
		if(variables.length == 2 && !(variables[1].contains("#"))) {
			put = true;
			for(int i=0;i<variables.length;i++) {
				completeVariable += variables[i];
			}
		}


		Object value;
		boolean directValue = false;
		boolean traceValue = false;
		boolean bothTraceValue = false;
		//remove Quotas '
		if(expression != null) {
			if(expression.contains("\'")) {
				directValue = true;
				expression = expression.substring(1, expression.length()-1);
			}
			if(expression.equals("false")) {
				value = false;
			} else if(expression.equals("true")) {
				value = true;
			} else if(expression.contains("\"")) {
				value = ""+expression.subSequence(1, expression.length()-1);
			} else {
				if(directValue || Character.isDigit(expression.charAt(0)))
					value = Integer.parseInt(expression);
				else {
					value = getValue(expression, layer);
				}
			}
		} else {
			value = givenValue;
			if(variables[0].charAt(0) == '%') {
				logger.error("altes konstrukt '%'");
				return;
			}
		}

		Object variable = null;
		String variableWithoutBrackets = regex_result(variables[variables.length-1], regex_cutBrackets);
		EMap<String, EObject> actEmap = execute.reflectivStateChart.objectManagement.getObjectCache(layer);
		if(actEmap.containsKey(variables[0]) && variables.length != 1) {
			variable = getVariable(variables, layer);
		} else if(variables.length == 1) {
			//logger.error("Putaufruf in setValue");
		}

		if(variables[variables.length-1].contains("[") && variables.length != 1) {
			int nr = getValue(regex_result(variables[1], regex_brackets), layer);

			try {
				Method[] methods = variable.getClass().getMethods();
				for(int i=0;i<methods.length;i++) {
					if(methods[i].getName().equals("set") && methods[i].getParameterTypes().length == 2) {
						if (expression == null) {
							if(traceValue && value instanceof EObject) {
								if(bothTraceValue) {
									methods[i].invoke(variable, nr, value);
								} else {
									methods[i].invoke(variable, nr, EcoreUtil.copy((EObject) value));
								}
							} else {
								methods[i].invoke(variable, nr, value);
							}
						} else {
							if(traceValue) {
								if(bothTraceValue) {
									methods[i].invoke(variable, nr, getValue(expression, layer));
								} else {
									methods[i].invoke(variable, nr, EcoreUtil.copy((EObject) getValue(expression, layer)));
								}

							} else {
								methods[i].invoke(variable, nr, getValue(expression, layer));
							}
						}
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if(variables.length != 1){		
			EObject obj = (EObject) variable;
			EClass curClass = obj.eClass();
			EStructuralFeature feature = curClass.getEStructuralFeature(variableWithoutBrackets);
			if(feature == null) {

				logger.error("Feature not found: "+variableWithoutBrackets+" on layer "+layer+" in Class: "+obj);
			} else {
				if(traceValue && value instanceof EObject) {
					if(bothTraceValue) {
						if(put) {
							valueMap.put(completeVariable+layer, value);
							put = false;
						}
						execute.reflectivStateChart.objectManagement.set(obj, value, variableWithoutBrackets);
					} else {
						execute.reflectivStateChart.objectManagement.set(obj, EcoreUtil.copy((EObject) value), variableWithoutBrackets);
					}
				} else {
					if(put) {

						valueMap.put(completeVariable+layer, value);
						put = false;
					}
					execute.reflectivStateChart.objectManagement.set(obj, value, variableWithoutBrackets);
				}

			}
		}
	}

	public <K> void setValue(String variable, String expression, K givenValue, int layer) {
		setValue(getVariables(variable, layer), expression, givenValue, layer);
	}

	public String[] getVariables(String variable, int layer) {
		if(layer != 0) {
			boolean trace = false;
			if(variable.contains("::")) {
				String help = "";
				help = variable.substring(0, variable.indexOf("::"));
				if(!help.contains(".")) {
					trace = true;
				}
			}
			if(trace) {
				String traceName = variable.substring(0, variable.indexOf("::"));
				variable = variable.substring(variable.indexOf("::")+2);
				variable = traceName+"."+variable;
			} else if(variable.charAt(0) == '#') {
				variable = variable.substring(1);
				variable = "#"+execute.ID+"."+variable;
			} else if(variable.charAt(0) == '\'' || variable.equals("null") || variable.equals("true") || variable.equals("false") 
					|| Character.isDigit(variable.charAt(0))) {
				String[] variables = new String[1];
				variables[0] = variable;
				return variables;
			} else if(containsOnlyNumbers(variable)) {
				String[] variables = new String[1];
				variables[0] = variable;
				return variables;
			} else {
				variable = execute.ID+"."+variable;
			}					
		} else {
			if(variable.charAt(0) == '#') {
				variable = variable.substring(1);
				variable = "#"+execute.ID_0+"."+variable;
			} else if(variable.charAt(0) == '\'' || variable.equals("null") || variable.equals("true") || variable.equals("false")) {
				String[] variables = new String[1];
				variables[0] = variable;
				return variables;
			} else {
				variable = execute.ID_0+"."+variable.trim();
			}			
		}


		//Special case: Bsp. : 'none' oder "text"
		if(variable.charAt(0) == '\'' || variable.charAt(0) == '\"') {
			String[] variables = new String[1];
			variables[0] = variable;
			return variables;
		}
		int partCounter = 0;
		String help = "";
		String help2 = variable;
		while(!help2.equals("")) {
			help = variable_part(help2);
			if(help.length()!= help2.length())
				help2 = help2.substring(help2.indexOf(help)+help.length()+1, help2.length());
			else help2 = "";
			partCounter++;
		}
		String[] variables = new String[partCounter];
		for (int i=0;!variable.equals("");i++) {
			if(i < partCounter-1) {
				variables[i] = variable_part(variable);
				variable = variable.substring(variable.indexOf(variables[i])+variables[i].length()+1, variable.length());
			} else {
				variables[i] = variable;
				variable = "";
			}
		}
		return variables;
	}

	public <T> T getVariable(String variables, int Layer) {
		return getVariable(getVariables(variables, Layer), Layer);
	}

	@SuppressWarnings("unchecked")
	private <T> T getVariable(String[] variables, int Layer) {
		EMap<String, EObject> emap = execute.reflectivStateChart.objectManagement.getObjectCache(Layer);
		EObject tmp = null;
		Object variable = null;
		if (emap.containsKey(variables[0])) {
			tmp = (EObject) emap.get(variables[0]);
			variable = tmp;
		} else {
			logger.error("Variable doesn't exist: "+variables[0]);
		}
		if(variables.length==2 && !variables[1].contains("[")) {
			return (T) variable;
		}
		if(variables[variables.length-1].contains("[")) {
			for(int i=1;i<variables.length;i++) {
				//EClass curClass = curObj.eClass();
				//EStructuralFeature feature = curClass.getEStructuralFeature(variableWithoutBrackets);
				//variable = curObj.eGet(feature);
				variable = execute.reflectivStateChart.objectManagement.get((EObject) variable, regex_result(variables[i], regex_cutBrackets));
				
				if(variables[i].contains("[") && i != variables.length-1) {

					int nr = 0;
					String bracketContent = regex_result(variables[i], regex_brackets);
					if(bracketContent.contains("'")) {
						nr = Integer.parseInt(bracketContent.substring(1, bracketContent.length()-1));
					} else if(!bracketContent.contains("+") || !bracketContent.contains("-")){
						nr = getValue(bracketContent, Layer);
					} else {
						nr = execute.calculateOperation.calculate(bracketContent, Layer);
					}


					try {
						boolean found = false;
						Method[] methods = variable.getClass().getMethods();
						for(int a=0;a<methods.length;a++) {
							if(methods[a].getName().equals("get")) {
								if(methods[a].getParameterTypes()[0].toString().equals("int")) {
									variable = methods[a].invoke(variable, nr);
									found = true;
								}
							}
						}
						if (!found) {
							logger.error("Getmethod not found for: "+variables[0]);
						}
					} catch (IllegalArgumentException e) {
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						e.printStackTrace();
					} catch (InvocationTargetException e) {
						e.printStackTrace();
					}
					catch (SecurityException e1) {
						e1.printStackTrace();
					}
				}
			}
			return (T) variable;
		}


		for(int i=1;i<variables.length-1;i++) {
			//EObject curObj = (EObject) variable;
			//EClass curClass = curObj.eClass();
			//EStructuralFeature feature = curClass.getEStructuralFeature(variableWithoutBrackets);
			//variable = curObj.eGet(feature);
			variable = execute.reflectivStateChart.objectManagement.get((EObject) variable, regex_result(variables[i], regex_cutBrackets));
			if(variables[i].contains("[")) {
				String bracketContent = regex_result(variables[i], regex_brackets);
				int nr;

				//Example itsClass.AllSC[0] or itsClass.AllSC[itsClass.AllSCCou]
				if(containsOnlyNumbers(bracketContent)) {
					nr = Integer.parseInt(bracketContent);
				} else if(bracketContent.contains("'")) {
					nr = Integer.parseInt(bracketContent.substring(1, bracketContent.length()-1));
				} else if(!bracketContent.contains("+") && !bracketContent.contains("-")){
					nr = getValue(bracketContent, Layer);
				} else {
					nr = execute.calculateOperation.calculate(bracketContent, Layer);
				}
				try {
					boolean found = false;
					Method[] methods = variable.getClass().getMethods();
					for(int a=0;a<methods.length;a++) {
						if(methods[a].getName().equals("get")) {
							if(methods[a].getParameterTypes()[0].toString().equals("int")) {
								variable = methods[a].invoke(variable, nr);
								found = true;
							}
						}
					}
					if (!found) {
						logger.error("Getmethod not found for: "+variables[0]);
					}
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				}
				catch (SecurityException e1) {
					e1.printStackTrace();
				}
			}
		}
		return (T) variable;	
	}

	@SuppressWarnings("unchecked")
	public <T> T getValue(String[] variables, String complVariables, int Layer) {
		if(variables.length == 2 && !(variables[1].contains("#"))) {
			getValue_completeVariable = "";
			if(complVariables != null) {
				getValue_completeVariable = complVariables;
			} else {
				for(int i=0;i<variables.length;i++) {
					getValue_completeVariable += variables[i];
				}
			}
			if(valueMap.containsKey(getValue_completeVariable+Layer)) {
				return (T) valueMap.get(getValue_completeVariable+Layer);
			}
		}
		Object getValue_variable = null;
		boolean getCount = false;
		if(variables[0].charAt(0) == '#') {
			getCount = true;
			variables[0] = variables[0].substring(1);
		}

		if (execute.maps[Layer].containsKey(variables[0])) {
			getValue_variable = execute.maps[Layer].get(variables[0]);
		} else {
			logger.error("Variable doesn't exist: "+variables[0]);
			return null;
		}
		
		String variableWithoutBrackets;
		for(int i=0;++i<variables.length;) {
			variableWithoutBrackets = regex_result(variables[i], regex_cutBrackets);
			getValue_curObj = (EObject) getValue_variable;
			getValue_curClass = getValue_curObj.eClass();
			try {
//				getValue_feature = getValue_curClass.getEStructuralFeature(variableWithoutBrackets);
//				if (getValue_feature == null) {
//					return null;
//				}
				getValue_variable = execute.reflectivStateChart.objectManagement.get(getValue_curObj, variableWithoutBrackets);
			} catch (NullPointerException e) {
				e.printStackTrace();
			}
			if(variables[i].contains("[")) {
				String bracketContent = regex_result(variables[i], regex_brackets);
				if(bracketContent.contains("'")) {
					getValue_nr = Integer.parseInt(bracketContent.substring(1, bracketContent.length()-1));
				} else if (containsOnlyNumbers(bracketContent)) {
					getValue_nr = Integer.parseInt(bracketContent);	
				} else if(!bracketContent.contains("+") || !bracketContent.contains("-")){
					getValue_nr = getValue(bracketContent, Layer);
				} else {
					getValue_nr = execute.calculateOperation.calculate(bracketContent, Layer);
				}
				getValue_variable = ((EList)getValue_variable).get(getValue_nr);
			}
			if (getValue_variable == null) {
				break;
			}
		}
		if(getCount) {
			if(getValue_variable instanceof EList) {
				getValue_variable = ((EList<Object>) getValue_variable).size();
				return (T) getValue_variable;
			} else {
				logger.error("Varible ist not an EList: "+getValue_variable);
				return null;
			}
		}	
		return (T) getValue_variable;	
	}

	public <T> T getValue(String variable2, int Layer) {
		String[] variables = getVariables(variable2, Layer);
		return getValue(variables, variable2, Layer);	
	}

	private String variable_part(String variable) {
		String check = regex_result(variable, regex_split);
		int counterBrackets = 0;
		if(check.contains("[")) {
			if(!check_brackets(check, counterBrackets)) {
				check = getBrackets(variable);
			}
		}
		return check;
	}

	private boolean check_brackets(String part, int counterBrackets) {
		String copyPart = part;
		while(copyPart.contains("[")) {
			copyPart = copyPart.substring(copyPart.indexOf("[")+1);
			counterBrackets++;
		}
		while(part.contains("]")) {
			part = part.substring(part.indexOf("]")+1);
			counterBrackets--;
		}
		if(counterBrackets!=0) {
			return false;
		} else {
			return true;
		}
	}

	public String getBraces(String condition) {
		counterBraces = 0;
		result = "";
		return getBrace(condition);
	}

	private String getBrace(String condition) {
		if (condition.charAt(counterBraces) == '(') {
			result = result+condition.charAt(counterBraces);
			counterBraces++;
			getB(condition);
		} else if (condition.charAt(counterBraces) == '!') {
			result = result+condition.charAt(counterBraces);
			counterBraces++;
			if (condition.charAt(counterBraces) == '(') {
				result = result+condition.charAt(counterBraces);
				counterBraces++;
				getB(condition);
			}
		}
		result = result+condition.charAt(counterBraces);
		String help = result;
		result = "";
		counterBraces = 0;
		return help;
	}

	private void getB(String condition) {
		while(condition.charAt(counterBraces)!=')') {
			if (condition.charAt(counterBraces) == '(') {				
				result = result+condition.charAt(counterBraces);
				counterBraces++;
				getB(condition);
			}
			result = result+condition.charAt(counterBraces);
			counterBraces++;
		}
	}

	private String getBrackets(String variable) {
		result = variable.substring(0, variable.indexOf("["));
		counterBraces = variable.indexOf("[");
		return getBracket(variable);
	}

	private String getBracket(String condition) {
		if (condition.charAt(counterBraces) == '[') {
			result = result+condition.charAt(counterBraces);
			counterBraces++;
			getBr(condition);
		}
		result = result+condition.charAt(counterBraces);
		String help = result;
		result = "";
		counterBraces = 0;
		return help;
	}

	private void getBr(String condition) {
		while(condition.charAt(counterBraces)!=']') {
			if (condition.charAt(counterBraces) == '[') {				
				result = result+condition.charAt(counterBraces);
				counterBraces++;
				getBr(condition);
			}
			result = result+condition.charAt(counterBraces);
			counterBraces++;
		}
	}

	public String regex_result(String string, String regex) {
		String key = string.concat(regex);
		if(regexMap.containsKey(key)) {
			return regexMap.get(key);
		}
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(string);
		String result = "";
		if (m.find())
			result = string.substring(m.start(), m.end());
		regexMap.put(string+regex, result);
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
}
