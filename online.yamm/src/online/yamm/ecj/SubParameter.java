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
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.eclipse.emf.ecore.EClass;

import online.yamm.Common;

public class SubParameter {

	public ArrayList<Assignment> assignments 								= null;
	final int attributePosition 											= 1;
	final int referencePosition 											= 31;
	final int valuesPosition 												= 35;

	// managing rmof/ecj relevant information
	public HashMap<String, ArrayList<EClass>> subClassesMap 				= new HashMap<String, ArrayList<EClass>>(); 			// eclassifier(.name), subtyping eclassifiers

	public ArrayList<String> atomicTypesList  								= new ArrayList<String>();
	public ArrayList<SetType> setTypesList 									= new ArrayList<SetType>();
	public HashMap<String, ArrayList<ConstraintChild>> constraintsList      = new HashMap<String, ArrayList<ConstraintChild>>();

	public ArrayList<String> eClassesYAMMInformationAlreadyGenerated 		= new ArrayList<String>(); 

	public SubParameter() {}


	public SubParameter(SubParameter subParameterSource) {
		assignments = subParameterSource.assignments;
	}


	public SubParameter(String assignmentsString, String assignmentPatternString) {
		if (assignmentsString != null) {
			Pattern pattern = Pattern.compile(assignmentPatternString + "()");
			Matcher matcher = pattern.matcher(assignmentsString);
			assignments = Common.resetCollection(assignments);
			while (matcher.find()) {
//								ParameterManagement.printMatches(matcher, ">assignment>");
//								System.out.println("Assignment-attribute (" + attributePosition + ") : " + matcher.group(attributePosition));
//								System.out.println("Assignment-reference (" + referencePosition + ") : " + matcher.group(referencePosition));
//								System.out.println("Assignment-values 	 (" + valuesPosition + ") : " + matcher.group(valuesPosition));
				if (matcher.group(valuesPosition) != null) {
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
				} else {
					assignments.add(new Assignment(matcher.group(attributePosition), matcher.group(referencePosition), null));
				}
			}
		}
	}

	public boolean addYAMMInformation(ParameterManagement parameterManagement, EClass eClass, boolean write) throws Exception 
	{
		if (eClass != null && assignments != null) {
			for (Assignment assignment : assignments) {
				assignment.addRMOFInformation(parameterManagement, this, eClass, write); 
			}
		}
		return true;
	}


	public ArrayList<EClass> getSubClassInformation(EClass eClass) {
		return subClassesMap.containsKey(eClass.getName()) ? subClassesMap.get(eClass.getName()) : new ArrayList<EClass>();
	}

	
	/** adds elements to the constraint list <ClassX><typesUsedInClassX> e.g., StateMachine{EString, Vertex_Container}
	 * @param parent
	 * @param child
	 */
	public void addConstraint(String parent, ConstraintChild child) 
	{
		ArrayList<ConstraintChild> constraintChildren = constraintsList.containsKey(parent) ? constraintsList.get(parent) : new ArrayList<ConstraintChild>();

		if (child != null) 
		{			
			for (ConstraintChild ecjConstraintChild : constraintChildren) // child exists already
				if (ecjConstraintChild.attributeName.equals(child.attributeName)) 
					return;
			
			constraintChildren.add(child);
		}

		if (!constraintsList.containsKey(parent) || constraintsList.get(parent).size() > 0 && child != null) 
		{ 
			// verbose
			// System.out.println("Constraint added, parent " + parent + ", child " + (child != null ? child.attributeName : "null") + ", type " + (child != null ? child.typeName : "null"));
			constraintsList.put(parent, constraintChildren);
		}
	}


	public int writeAtomicParameters(int offset, int subPopIndex) 
	{
		int i = 0;
		for (; i < atomicTypesList.size(); i++) 
			Parameter.writeln((offset+i) + ".name = " + atomicTypesList.get(i) + Parameter.populationSuffix + subPopIndex);
		
		return offset+i;
	}


	public int writeSetParameters(int offset, int subPopIndex) 
	{
		int i = 0;
		for (; i < setTypesList.size(); i++) 
		{
			SetType setType = setTypesList.get(i);
			Parameter.writeln("gp.type.s.", (offset+i) + ".name = " + setType.name + Parameter.populationSuffix + subPopIndex);
			
			if (setType.type == SetTypeType.IS_NOT_MANY_AND_NOT_CONDITIONAL) 
			{
				ArrayList<EClass> localSubTypes = subClassesMap.get(setType.name.replace(ParameterManagement.setSuffix, ""));
				if (localSubTypes != null) 
				{
					Parameter.writeln((offset+i) + ".size = " + localSubTypes.size());
					for (Integer subClassIndex = 0; subClassIndex < localSubTypes.size(); subClassIndex++) 
					{
						Parameter.writeln((offset+i) + ".member." + subClassIndex + " = " 
								+ localSubTypes.get(subClassIndex).getName() + Parameter.populationSuffix + subPopIndex); 
					}
				} 
				else 
				{
					Parameter.writeln((offset+i) + ".size = 0");
				}
			} 
			else 
			{
				Parameter.writeln((offset+i) + ".size = 2");
				Parameter.writeln((offset+i) + ".member.0 = " + setType.name.replace(ParameterManagement.setSuffix, "") + Parameter.populationSuffix + subPopIndex);
				Parameter.writeln((offset+i) + ".member.1 = NIL" + Parameter.populationSuffix + subPopIndex);
			}
		}
		return offset+i;
	}


	public int writeConstraints(int offset, int subPopIndex) 
	{
		final String popAppendix = Parameter.populationSuffix + subPopIndex;

		for (String key : constraintsList.keySet()) 
		{
			Parameter.writeln("", "\n# " + key + popAppendix);
			Parameter.writeln("gp.nc." + (offset++)," = ec.gp.GPNodeConstraints");
			Parameter.writeln(".name = nc" + key + popAppendix);
			Parameter.writeln(".returns = " + key + popAppendix);
			ArrayList<ConstraintChild> ecjConstraintChildren = constraintsList.get(key);
			Parameter.writeln(".size = " + ecjConstraintChildren.size());
			for (Integer i2 = 0; i2 < ecjConstraintChildren.size(); i2++) 
			{
				Parameter.writeln(".child." + i2 + " = " + ecjConstraintChildren.get(i2).typeName + popAppendix);
			}
		}

		return offset;
	}


	public int writeFunctionSets(int offset, int subPopIndex, String typePrefix) {
		for (String atomicType : atomicTypesList) {
			if (!atomicType.contains("_Container")) {
				String prefix = "gp.fs." + subPopIndex + ".func." + (offset++);
				if (!Common.isSimpleEType(atomicType)) {
					if (atomicType.contains(ParameterManagement.referenceSuffix))
						Parameter.writeln(prefix, typePrefix + "InstanceReference");
					else if (atomicType.contains("RestrictedSimpleType"))
						Parameter.writeln(prefix, typePrefix + "RestrictedSimpleType");
					else
						Parameter.writeln(prefix, typePrefix + "Instance");
				} else 
					Parameter.writeln(prefix, typePrefix + atomicType);
				Parameter.writeln(".nc = nc" + atomicType + Parameter.populationSuffix + subPopIndex);
			}
		}
		return offset;
	}


	public int writeContainerFunctionSets(int offset, int subPopIndex, String typePrefix) {
		for (SetType setType : setTypesList) 
		{
			if (setType.type == SetTypeType.IS_MANY) {
				Parameter.writeln("gp.fs." + subPopIndex + ".func." + (offset++), typePrefix + "Container");
				Parameter.writeln(".nc = nc" + setType.name.replace("_Set", "") + Parameter.populationSuffix + subPopIndex);
			}	
		}
		return offset;
	}

}
