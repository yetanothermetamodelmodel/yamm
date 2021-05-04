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
package dev.yamm.ecj;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import dev.yamm.ObjectManagement;
import dev.yamm.logger.YAMMLogger;

public class ParameterManagement {

	public static YAMMLogger logger = YAMMLogger.getYAMMLogger("YAMM Log");

	// parsing
	public boolean parseSuccess = false;						// indicates if the last parsing was a (complete) success
	public ArrayList<Parameter> parameters = null;				// parsed parameters, each with exist, assign and generate part
	private Parameter parameter = null;							// 
	public String givenParameterString = null;					// the complete (given) parameter string

	public HashMap<Integer, ArrayList<Integer>> evaluateParameterTogether = new HashMap<Integer, ArrayList<Integer>>();

	public final static String sepValue 	= ",";
	public final static String sepElement 	= ";";

	public final static String initialWordCharacter = 				"[a-zA-Z]";
	public final static String seperateTreeInitialWordCharacter = 	"[a-zA-Z\\^]";
	public final static String additionalWordCharacter =			"[a-zA-Z0-9]";
	public final static String word = 								"(" + initialWordCharacter + "(" + additionalWordCharacter + ")*)";
	public final static String seperateTreeWord = 					"(" + seperateTreeInitialWordCharacter + "(" + additionalWordCharacter + ")*)";
	public final static String singleNumber = 						"([0-9])+";
	public final static String rangeOfNumbers = 					singleNumber + "\\s*-\\s*" + singleNumber;
	public final static String arrayAccess = 						"(\\[(" + mult("(" + singleNumber + "|" + rangeOfNumbers + ")", sepValue) + ")\\])?";
	public final static String reference = 							"(/" + word + ")?";
	public final static String attribute = 							"\\s*(" + word + arrayAccess + "(\\." + word + arrayAccess + ")*)" + reference + "\\s*";
	public final static String seperateTreeAttribute = 				"\\s*(" + seperateTreeWord + arrayAccess + "(\\." + word + arrayAccess + ")*)" + reference + "\\s*";

	public final static String integer =							"[1-9][0-9]*";
	public final static String integerList = 						"\\{" + mult(integer, sepValue) + "\\}";
	public final static String floatingPoint = 						"(" + integer + ")?\\." + integer;
	public final static String floatingPointList = 					"\\{" + mult(floatingPoint, sepValue) + "\\}";
	public final static String string	= 							"\"[^\"]+\"";
	public final static String stringList = 						"\\{" + mult(string, sepValue) + "\\}";
	public final static String subclass =							"(" + word + ")";
	public final static String subclassList = 						"\\{" + mult(subclass, sepValue) + "\\}";

	public final static String valueWithOutSubClass = 				"\\s*(" + floatingPoint + "|" + floatingPointList + 
	"|" + integer + "|" + integerList + 
	"|" + string + "|" + stringList +
	"|" + reference + ")\\s*";
	public final static String values = 							"\\s*(" + mult(floatingPoint, sepValue) + "|" + mult(floatingPointList, sepValue) +
	"|" + mult(integer, sepValue) + "|" + mult(integerList, sepValue) +
	"|" + mult(subclass, sepValue) + "|" + mult(subclassList, sepValue) + 
	"|" + mult(string, sepValue) +  "|" + mult(stringList, sepValue) +
	"|" + mult(reference, sepValue) + ")\\s*" ;
	
	public final static String functionCalls = 						"connectAllLooseEnds|compile";

	public final static String existAssignment = 					attribute + "(\\s*=\\s*" + values + ")?";
	public final static String assignAssignment = 					"\\s*(" + functionCalls + "|" + "\\s*" + attribute + "(\\s*=\\s*" + valueWithOutSubClass + "))";
	public final static String generateAssignment = 				seperateTreeAttribute + "(\\s*=\\s*" + values + ")?";

	public final static String existPart =							singleNumber + "\\?" + mult(subclass, sepElement) + "(\\{" + optmult(existAssignment, sepElement) + "\\})?"; 
	
	public final static String assignPart = 						"\\!(\\{" + optmult(assignAssignment, sepElement) + "\\})";
	public final static String generatePart = 						"\\+(\\{" + mult(generateAssignment, sepElement) + "\\})";					
	public final static String parameterPart = 						"\\s*(" + existPart + "\\s*" + "(" + assignPart + ")?" + "\\s*" + "(" + generatePart + ")?)+";
	public final static String evaluateTogether	=					mult(singleNumber, sepValue);					
	public final static String windowsfilePath	= 					"([a-zA-Z]:)?(\\\\[a-zA-Z0-9_.-]+)+\\\\?";
	public final static String optParamsPath =						"(\\s*pp\\s*=\\s*" + windowsfilePath + ")?";
	public final static String complete =							mult(parameterPart, "") + optmult(evaluateTogether, sepElement) + optParamsPath;

	public final static String containerSuffix = 					"_Container";
	public final static String setSuffix = 							"_Set";
	public final static String referenceSuffix =					"_Reference";

	public boolean rmofInformationAdded = 							false;	// indicates if the RMOF information have already been added 
	
	public int restrictedSimpleTypesCounter = 						0;


	/** builds a new regular expression of multiple single instances with separators in between
	 * @param element 
	 * @param separator
	 * @return
	 */
	public static String mult(final String element, final String separator) {
		return "(" + element + "\\s*(" + separator + "\\s*" + element + "\\s*)*" + ")" ;
	}


	/** see mult
	 * @param element 
	 * @param separator
	 * @return
	 */
	public static String optmult(final String element, final String separator) {
		return "(" + element + ")?\\s*(" + separator + "\\s*" + element + "\\s*)*";
	}


	/** prints all groups of a matcher that matched
	 * @param matcher
	 * @param prefix - for each printing
	 */
	public static void printMatches (Matcher matcher, String prefix) 
	{
		for (Integer i = 0; i < matcher.groupCount(); i++) 
		{
			if (matcher.group(i) != null) 
				System.out.println(prefix + i + ". " + matcher.group(i));
		}
	}


	/** parses a given argument for all patterns, creates rmof/ecj information and writes everything to console/file
	 * @param argument	- to be parsed
	 * @param objectManagement - rmof/ecj related information source
	 * @param layerFileName	
	 * @param modelCompilePath
	 * @param bestModelPath
	 */
	public ParameterManagement(String argument, ObjectManagement objectManagement) {	
		Pattern completePattern = Pattern.compile(complete + "()");
		givenParameterString = argument.replace("\\s*?","").replace("\r","").replace("\n", "");
		Matcher completeMatcher = completePattern.matcher(givenParameterString);
//		while (completeMatcher.find()) {
//			// VERBOSE 
//			printMatches (completeMatcher, ">");
//		}
		
		// parse it ...
		if (completeMatcher.matches()) 
		{
			parameters = new ArrayList<Parameter>();
			//process every match sequence
			Pattern singlePattern = Pattern.compile(parameterPart + "()");
			Matcher singleMatcher = singlePattern.matcher(completeMatcher.group(0));
			while (singleMatcher.find()) 
			{
				// VERBOSE 
				// printMatches (singleMatcher, ">");
				parameter = new Parameter(new ExistSubParameter(singleMatcher.group(2), singleMatcher.group(3), singleMatcher.group(11)),
						new AssignmentSubParameter(singleMatcher.group(213)), new GenerateSubParameter(singleMatcher.group(313)));
				if (parameter.existSubParameter != null) {
					if (parameter.existSubParameter.subClasses != null && parameter.existSubParameter.subClasses.size() > 1) {
						for (SubClass subClass : parameter.existSubParameter.subClasses) {
							parameters.add(new Parameter(new ExistSubParameter(parameter.existSubParameter.layer, subClass, parameter.existSubParameter.assignments),
									new AssignmentSubParameter(parameter.assignmentSubParameter), new GenerateSubParameter(parameter.generateSubParameter)));
						}
					} else {
						parameters.add(parameter);
					}
				}
			}
			if (completeMatcher.group(1029) != null) {
				singlePattern = Pattern.compile(evaluateTogether + "()");
				singleMatcher = singlePattern.matcher(completeMatcher.group(1029));
				Integer firstNumber = null;
				while (singleMatcher.find()) {
					Pattern singlePatternNumber = Pattern.compile(singleNumber + "()");
					Matcher singleMatcherNumber = singlePatternNumber.matcher(singleMatcher.group(0));
					while (singleMatcherNumber.find()) {
						if (firstNumber == null) {
							firstNumber = Integer.parseInt(singleMatcherNumber.group(0));
							evaluateParameterTogether.put(firstNumber, new ArrayList<Integer>());
						} else {
							ArrayList<Integer> precedingNumbers = evaluateParameterTogether.get(firstNumber);
							precedingNumbers.add(Integer.parseInt(singleMatcherNumber.group(0)));
						}
					}
				}
			}
			
			// add ecj information & "print" the parameter file 
			if (objectManagement != null && parameters != null) 
			{				
				addRMOFInformation(objectManagement);
				Parameter.preparePrinting(completeMatcher.group(1039));
				Parameter parameter;
				Integer offset = 0;
				boolean writeHeader = false;
				boolean writeAppendix = false;
				String[] methodNames = {"writeSubPopulation", "writeAtomicParameters", "writeSetParameters", "writeConstraints" , "writeFunctionSets"};
				Class<?>[] parameterClasses = {boolean.class, int.class, int.class, Integer.class, boolean.class};
				Method method = null;

				for (String methodName : methodNames) {
					for (int parameterIndex = 0; parameterIndex < parameters.size(); parameterIndex++) {
						parameter = parameters.get(parameterIndex);
						if (parameterIndex == 0) 
						{
							writeHeader = true;
							offset = 0;
						}
						else 
							writeHeader = false;
						
						writeAppendix = parameterIndex == parameters.size() - 1 ? true : false;
						try 
						{
							method = Parameter.class.getDeclaredMethod(methodName, parameterClasses);
							offset = (Integer) method.invoke(parameter, writeHeader, parameters.size(), parameterIndex, offset, writeAppendix);
						} 
						catch (Exception e) 
						{
							e.printStackTrace();
						}
					}
				}

				// 3rd parameter ... bestModelPath
				
				if (parameters.size() > 0)
					parameters.get(0).writeYAMMAppendix(null, null, null, null, givenParameterString);
			}	
			parseSuccess = true;
		}
	}


	public void addRMOFInformation(ObjectManagement objectManagement) {
		Parameter parameter;
		try {
			if (!rmofInformationAdded) 
			{
				for (int i = 0; i < parameters.size(); i++) 
				{
					parameter = parameters.get(i);
					parameter.addRMOFInformation(this, objectManagement, i);
				}
				rmofInformationAdded = true;
			} 
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}


	public static boolean matchPattern(String patternString, String stringToBeMatched) {
		Pattern pattern = Pattern.compile(patternString + "()");
		Matcher matcher = pattern.matcher(stringToBeMatched);
		if (matcher.matches()) 
			return true;
		else 
			return false;
	}


	public static String determinePatternType(String stringToBeMatched) {
		if (matchPattern(mult(integerList, sepValue), stringToBeMatched)) {
			return integerList;
		}
		if (matchPattern(mult(integer, sepValue), stringToBeMatched)) {
			return integer;
		}
		if (matchPattern(mult(floatingPointList, sepValue), stringToBeMatched)) {
			return floatingPointList;
		}
		if (matchPattern(mult(floatingPoint, sepValue), stringToBeMatched)) {
			return floatingPoint;
		}
		if (matchPattern(mult(stringList, sepValue), stringToBeMatched)) {
			return stringList;
		}
		if (matchPattern(mult(string, sepValue), stringToBeMatched)) {
			return string;
		}
		if (matchPattern(mult(reference, sepValue), stringToBeMatched)) {
			return reference;
		}
		if (matchPattern(mult(subclassList, sepValue), stringToBeMatched)) {
			return subclassList;
		}
		if (matchPattern(mult(subclass, sepValue), stringToBeMatched)) {
			return subclass;
		}
		return null;
	}


}
