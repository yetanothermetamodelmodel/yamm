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

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.eclipse.emf.ecore.EPackage;

import dev.yamm.Common;

public class ExistSubParameter extends SubParameter {

	public Integer layer 					= null;
	public EPackage ePackage				= null;
	public ArrayList<SubClass> subClasses 	= null;
	
	
	public ExistSubParameter(Integer layer, SubClass subClass, ArrayList<Assignment> assignments) {
		this.layer = layer;
		subClasses = Common.resetCollection(subClasses);
		subClasses.add(subClass);
		this.assignments = assignments;
	}
	
	/** additionally parsing layerString and subClasses
	 * @param layerString
	 * @param subClassesString
	 * @param assignmentsString
	 */
	public ExistSubParameter(String layerString, String subClassesString, String assignmentsString) {
		super(assignmentsString, ParameterManagement.existAssignment);
		try {
			layer = Integer.parseInt(layerString);
		} catch (NumberFormatException e) {
			return;
		}
		if (subClassesString != null) {
			Pattern pattern = Pattern.compile(ParameterManagement.subclass + "()");
			Matcher matcher = pattern.matcher(subClassesString);
			if (matcher.groupCount() > 0) {
				subClasses = Common.resetCollection(subClasses);
				while (matcher.find()) {
					subClasses.add(new SubClass(matcher.group()));
				}
			}
		}
	}	
	
	public ArrayList<String> getAllESubClasses() {
		ArrayList<String> returnEClasses = new ArrayList<String>();
		if (subClasses != null) {
			for (SubClass subClass : subClasses) {
				returnEClasses.add(subClass.className);
			}
		}
		return returnEClasses;
	}
	
}
