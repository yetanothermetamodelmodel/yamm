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
package online.yamm.ecj;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import online.yamm.Common;

public class AssignmentSubParameter extends SubParameter {

	final int functionCallPosition											= 1;
	final int attributePosition 											= 2;
	final int referencePosition 											= 32;
	final int valuesPosition 												= 36;
	
	public AssignmentSubParameter(AssignmentSubParameter assignmentSubParameter) {
		super(assignmentSubParameter);
	}
	
//	public AssignmentSubParameter(String assignmentsString) {	
//		super(assignmentsString, ParameterManagement.functionCallsOrAssignAssignments);
//	}

	public AssignmentSubParameter(String assignmentsString) {
		String assignmentPatternString = ParameterManagement.assignAssignment;
		
		if (assignmentsString != null) {
			Pattern pattern = Pattern.compile(assignmentPatternString + "()");
			Matcher matcher = pattern.matcher(assignmentsString);
			assignments = Common.resetCollection(assignments);
			while (matcher.find()) {
//								ParameterManagement.printMatches(matcher, ">assignment>");
//								System.out.println("Assignment-function call (" + functionCallPosition + ") : " + matcher.group(functionCallPosition));
//								System.out.println("Assignment-attribute (" + attributePosition + ") : " + matcher.group(attributePosition));
//								System.out.println("Assignment-reference (" + referencePosition + ") : " + matcher.group(referencePosition));
//								System.out.println("Assignment-values 	 (" + valuesPosition + ") : " + matcher.group(valuesPosition));
				
				if (matcher.group(attributePosition) != null && matcher.group(valuesPosition) != null) {
					ArrayList<String> values = new ArrayList<String>();
					String assignmentValuesType = ParameterManagement.determinePatternType(matcher.group(valuesPosition));
					Pattern subPattern = Pattern.compile(assignmentValuesType + "()");
					Matcher subMatcher = subPattern.matcher(matcher.group(valuesPosition));
					while (subMatcher.find()) {
						if (!subMatcher.group().isEmpty()) {
							values.add(subMatcher.group().replace(" ", "").replace("/t", ""));
							//System.out.println("Value added " + subMatcher.group().replace(" ", "").replace("/t", ""));
						}
					}
					assignments.add(new Assignment(matcher.group(attributePosition), matcher.group(referencePosition), values));
				} else if (matcher.group(attributePosition) != null) {
					assignments.add(new Assignment(matcher.group(attributePosition), matcher.group(referencePosition), null));
				} else if (matcher.group(functionCallPosition) != null) {
					assignments.add(new Assignment(matcher.group(functionCallPosition)));
				}
			}
		}
	}
}
