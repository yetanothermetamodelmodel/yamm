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
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.EDataTypeImpl;

import dev.yamm.Common;

public class Assignment {

	public String attributeName 								= null;
	public ArrayList<AttributePart> attributeParts  			= null;
	public String referenceName									= null;
	public ArrayList<Object> values				 				= null;
	public Integer valuesCoveredByArray							= null;
	public String functionCall									= null;

	public Integer restrictedValuesCounter						= null;
	public Integer restrictedValues								= null;

	// yamm/ecj related
	public EStructuralFeature eStructuralFeature 				= null;
	public EClassifier eStructuralFeatureType					= null;

	private HashMap<String, ArrayList<String>> constraintSubClasses = new HashMap<String, ArrayList<String>>();

	Assignment (String functionCall) {
		this.functionCall = functionCall;
	}

	Assignment (String attributeName, String referenceName, ArrayList<String> stringsOfValues) {
		this.attributeName = attributeName;
		this.referenceName = referenceName;
		if (stringsOfValues != null) {
			this.values = new ArrayList<Object>();
			for (String value : stringsOfValues) {
				this.values.add(Common.determineObjectOfString(value));
			}
		}	
		Pattern pattern = Pattern.compile(ParameterManagement.word + ParameterManagement.arrayAccess + "()");
		Matcher matcher = pattern.matcher(attributeName);
		if (matcher.find()) {
			//System.out.println(matcher.group());
			valuesCoveredByArray = 0;
			attributeParts = Common.resetCollection(attributeParts);
			//ParameterManagement.printMatches(matcher, ">attributePart>");
			matcher.reset();
			AttributePart attributePart = null;
			while (matcher.find()) {
				attributePart = new AttributePart(matcher.group(1), matcher.group(4));
				attributeParts.add(attributePart);
				if (attributePart.valuesCoveredByArray != null) {
					valuesCoveredByArray += attributePart.valuesCoveredByArray;
				}
			}
		}
	}

	private void setSubClassInformation(SubParameter subParameter, EClassifier eStructuralFeatureType) {
		if (!subParameter.subClassesMap.containsKey(eStructuralFeatureType.getName())) {

			EClass eStructuralFeatureEClass = null;
			ArrayList<EClass> subClasses = null;
			ArrayList<String> allowedSubClasses = new ArrayList<String>();

			if ((!(eStructuralFeature instanceof EReference) || (eStructuralFeature instanceof EReference) && ((EReference) eStructuralFeature).isContainment())) 
			{
				eStructuralFeatureEClass = (EClass) eStructuralFeatureType;			
				if (values != null) 
				{
					for (Object o : values) 
					{
						if (o instanceof String) 
							allowedSubClasses.add((String) o);
					}
				}

				subClasses = Common.determineSubClasses(eStructuralFeatureEClass, new ArrayList<EClass>(), allowedSubClasses);
				if (subClasses.size() > 0)
					subParameter.subClassesMap.put(eStructuralFeatureType.getName(), subClasses);
			}	

		}
	}

	public void addRMOFInformation(ParameterManagement parameterManagement, SubParameter subParameter, EClass currentEClass, boolean write) throws Exception {

		if (functionCall == null) 
		{
			Boolean featureIsMany 								= null;
			Boolean featureIsContainment 						= null;
			Integer numberOfSubClasses 							= 0;
			boolean isManyHasBeenSeen							= false;	// indicates if a container has been seen since the last base class reset, e.g., a.b.c and b is a container
			// then is c (the last attributepart) treated as if it is a container

			EClass rootEClass 									= null;		// the root class for all EStructuralFeatures ... if intermediate classes are not created this class will be used 
			EStructuralFeature attributePartEStructuralFeature 	= null;
			EClass previousEClass								= null;
			//EStructuralFeature eStructuralFeature 			= null;

			String featureNamePrefix 							= "";
			AttributePart attributePart							= null;

			if (currentEClass != null ) 
			{
				rootEClass = currentEClass;
				addAtomicSetInformationOfComplexClass(subParameter, rootEClass, false, true, false, false); 

				for (Integer attributePartIndex = 0; attributePartIndex < attributeParts.size(); attributePartIndex++) 
				{
					attributePart = attributeParts.get(attributePartIndex);
					attributePartEStructuralFeature = currentEClass.getEStructuralFeature(attributePart.name);
					if (attributePartEStructuralFeature == null) 
					{
						// maybe it's only a structural feature in a sub class
						// throw new Exception("Could not find eStructuralFeature " + attributePart.name + " in class " + currentEClass.getName());
						
						for (EClassifier potentialSubClassifier : currentEClass.getEPackage().getEClassifiers())
						{
							boolean leave = false;
							if (potentialSubClassifier instanceof EClass)
							{
								EClass potentialSubClass = (EClass) potentialSubClassifier;

								for (EClass superClasses : potentialSubClass.getEAllSuperTypes())
								{
									if (superClasses.getName().equals(currentEClass.getName()))
									{
										attributePartEStructuralFeature = potentialSubClass.getEStructuralFeature(attributePart.name);
										if (attributePartEStructuralFeature != null)
										{
											leave = true;
											break;
										}
									}
								}
							}
							if (leave)
								break;
						}
					}

					featureIsMany = attributePartEStructuralFeature.isMany() ? true : false;
					if (featureIsMany)
						isManyHasBeenSeen = true;
					
					featureIsContainment = !(attributePartEStructuralFeature instanceof EReference) || ((EReference) attributePartEStructuralFeature).isContainment() ? true : false;					
					featureNamePrefix += attributePart.name + "."; // rebuild the attribute prefix e.g., prefix(a.b.c) = a.b.

					// "complex" class?
					if (attributePartEStructuralFeature.getEType() instanceof EClass) 
					{
						// change currentEClass reference	
						previousEClass = currentEClass;	
						currentEClass = (EClass) attributePartEStructuralFeature.getEType();
						String structuralFeatureTypeName = buildStructuralFeatureTypeName(currentEClass, featureIsMany, featureIsContainment, attributePartEStructuralFeature.isRequired(), numberOfSubClasses);
						
						// last attributePart e.g., c in a.b.c ? --> introduce it as type
						if (attributePartIndex == attributeParts.size()-1) 
						{
							Common.addUniqueElementToList(subParameter.eClassesYAMMInformationAlreadyGenerated, structuralFeatureTypeName);
						} 
						else if (subParameter.eClassesYAMMInformationAlreadyGenerated.contains(structuralFeatureTypeName)) 
						{
							// relocating base class
							featureNamePrefix = "";
							setSubClassInformation(subParameter, currentEClass);
							numberOfSubClasses = addAtomicSetInformationOfComplexClass(subParameter, currentEClass, featureIsMany, featureIsContainment, attributePartEStructuralFeature.isRequired(), true); 
							addConstraintInformation(subParameter, previousEClass, attributePartEStructuralFeature, featureIsMany, featureIsContainment, attributePartEStructuralFeature.isRequired(), numberOfSubClasses, featureNamePrefix);
							rootEClass = currentEClass;		// relocate base class
							isManyHasBeenSeen = false; 		// reset 
						}
					}
				} 

				if (attributePartEStructuralFeature.getEType() instanceof EDataTypeImpl) 
				{
					if (values != null && values.size() > 0) 
					{
						restrictedValuesCounter = parameterManagement.restrictedSimpleTypesCounter++;
						restrictedValues = values.size();
					}
				}

				if (write) 
				{		
					// add atomic/set information
					if (attributePartEStructuralFeature.getEType() instanceof EClass) 
					{
						setSubClassInformation(subParameter, attributePartEStructuralFeature.getEType());
						numberOfSubClasses = addAtomicSetInformationOfComplexClass(subParameter, (EClass) attributePartEStructuralFeature.getEType(), isManyHasBeenSeen, featureIsContainment, attributePartEStructuralFeature.isRequired(), false); 
					} 
					else if (attributePartEStructuralFeature.getEType() instanceof EDataTypeImpl) 
					{
						//System.out.println(attributePartEStructuralFeature.getName() + ":" + attributePartEStructuralFeature.getEType().getName() + " = " + values);
						String typeName = restrictedValuesCounter != null && restrictedValues > 0 
						? "RestrictedSimpleType-" + restrictedValuesCounter + "-" + restrictedValues : attributePartEStructuralFeature.getEType().getName();
						Common.addUniqueElementToList(subParameter.atomicTypesList, typeName);
						if (featureIsMany) 
							Common.addUniqueElementToList(subParameter.setTypesList, new SetType(previousEClass.getName() + ParameterManagement.containerSuffix, SetTypeType.IS_MANY));
						else if (isManyHasBeenSeen)
							Common.addUniqueElementToList(subParameter.setTypesList, new SetType(typeName + ParameterManagement.containerSuffix, SetTypeType.IS_MANY));
					}

					featureNamePrefix = Common.cutStringNChars(featureNamePrefix, '.', 2, true, ".");
					addConstraintInformation(subParameter, rootEClass, attributePartEStructuralFeature, isManyHasBeenSeen, featureIsContainment, attributePartEStructuralFeature.isRequired(), numberOfSubClasses, featureNamePrefix);
				}
			}

			this.eStructuralFeature = attributePartEStructuralFeature;
			this.eStructuralFeatureType = attributePartEStructuralFeature.getEType();

		}
	}


	private int addAtomicSetInformationOfComplexClass(SubParameter subParameter, EClass eClass, Boolean isMany, Boolean isContainment, Boolean isRequired, boolean writeConstraintClasses) 
	{
		if (isContainment) 	// no reference
		{
			ArrayList<EClass> subClasses = subParameter.getSubClassInformation(eClass);
			if (!eClass.isAbstract() && subClasses.size() == 0)
			{
				Common.addUniqueElementToList(subParameter.atomicTypesList, eClass.getName());
			}

			if (subClasses.size() > 0) 
			{
				for (EClass subClass : subClasses) 
				{
					Common.addUniqueElementToList(subParameter.atomicTypesList, subClass.getName());
				}
				Common.addUniqueElementToList(subParameter.setTypesList, new SetType(eClass.getName() + ParameterManagement.setSuffix, SetTypeType.IS_NOT_MANY_AND_NOT_CONDITIONAL));
			}

			if (isMany) 	
			{
				Common.addUniqueElementToList(subParameter.atomicTypesList, eClass.getName() + ParameterManagement.containerSuffix);
				Common.addUniqueElementToList(subParameter.setTypesList, new SetType(eClass.getName() + ParameterManagement.containerSuffix + ParameterManagement.setSuffix, SetTypeType.IS_MANY));
			}

			return subClasses.size();
		} 
		else 				// reference
		{
			Common.addUniqueElementToList(subParameter.atomicTypesList, eClass.getName() + ParameterManagement.referenceSuffix);
			if (isMany) 
			{
				Common.addUniqueElementToList(subParameter.atomicTypesList, eClass.getName() + ParameterManagement.containerSuffix + ParameterManagement.referenceSuffix);
				Common.addUniqueElementToList(subParameter.setTypesList, new SetType(eClass.getName() + ParameterManagement.containerSuffix + ParameterManagement.referenceSuffix + ParameterManagement.setSuffix, SetTypeType.IS_MANY));
			}
			else if (!isRequired)
			{
				Common.addUniqueElementToList(subParameter.setTypesList, new SetType(eClass.getName() + ParameterManagement.referenceSuffix + ParameterManagement.setSuffix, SetTypeType.IS_CONDITIONAL));
			}
			return 0;
		}
	}


	private String buildStructuralFeatureTypeName(EClassifier featureEClassifier, boolean isContainer, boolean isContainment, Boolean isRequired, int numberOfSubClasses) {
		String featureTypeName;
		if (featureEClassifier instanceof EDataTypeImpl && restrictedValuesCounter != null && restrictedValues > 0) 
		{
			featureTypeName = "RestrictedSimpleType-" + restrictedValuesCounter + "-" + restrictedValues;
		} 
		else 
		{
			featureTypeName = featureEClassifier.getName();
			
			if (isContainer)
				featureTypeName += ParameterManagement.containerSuffix;
			
			if (!isContainment)
			{
				featureTypeName += ParameterManagement.referenceSuffix;

				// TODO: Special rule ...
				if (isContainer && numberOfSubClasses > 0 || !isRequired)
					featureTypeName += ParameterManagement.setSuffix;
			}
			else if (numberOfSubClasses > 0)
				featureTypeName += ParameterManagement.setSuffix;
			
		}
		return featureTypeName;
	}

	/**
	 * @param eStructuralFeature
	 * @param isContainer
	 * @param isContainment
	 * @param numberOfSubClasses
	 * @param parameterManagement
	 * @param eStructuralFeatureType
	 * @param eStructuralFeatureTypeName
	 * @param baseClassName
	 */
	private void addConstraintInformation(SubParameter subParameter, EClass eClass, EStructuralFeature eStructuralFeature, Boolean isContainer, Boolean isContainment, Boolean isRequired, Integer numberOfSubClasses, String childPrefix) 
	{
		EClassifier eStructuralFeatureEClassifier = eStructuralFeature.getEType();
		
		if (eStructuralFeatureEClassifier == null)
			System.out.println(eStructuralFeature.getName());
		
		String attributeName = childPrefix + eStructuralFeature.getName();
		String typeName = buildStructuralFeatureTypeName(eStructuralFeatureEClassifier, isContainer, isContainment, isRequired, 0);
		
		// base class if not abstract
		if (!eClass.isAbstract())
			subParameter.addConstraint(eClass.getName(), new ConstraintChild(attributeName, typeName));
		
		// allowed subclasses 
		for (EClass subClass : subParameter.getSubClassInformation(eClass)) 
		{
			if (!constraintSubClasses.containsKey(eClass.getName()) 
					|| constraintSubClasses.containsKey(eClass.getName()) && constraintSubClasses.get(eClass.getName()).contains(subClass.getName())) 
			{
				// wenn es ein abgeleitetes komplexes feature ist dann baue es direkt in die subklasse ein und nicht in eine eigene typhierarchie
				if (!isContainer && eClass.getEStructuralFeatures().contains(eStructuralFeature))
					subParameter.addConstraint(subClass.getName(), new ConstraintChild(attributeName, typeName));
				else	
					subParameter.addConstraint(buildStructuralFeatureTypeName(subClass, isContainer, false, isRequired, 0), new ConstraintChild(attributeName, typeName));
			}
		}

		if (isContainer) 
		{			
			String typeNameContainer = buildStructuralFeatureTypeName(eStructuralFeatureEClassifier, false, isContainment, isRequired, numberOfSubClasses);
			String typeNameContainer2 = buildStructuralFeatureTypeName(eStructuralFeatureEClassifier, true, isContainment, isRequired, 1);

			subParameter.addConstraint(typeName, new ConstraintChild(typeNameContainer, typeNameContainer));
			subParameter.addConstraint(typeName, new ConstraintChild(typeNameContainer2, typeNameContainer2));
			subParameter.addConstraint(typeNameContainer, null);
		} 
		else 
		{
			numberOfSubClasses = eStructuralFeatureEClassifier instanceof EClass ? Common.determineSubClasses((EClass) eStructuralFeatureEClassifier, new ArrayList<EClass>(), new ArrayList<String>()).size() : 0;
			subParameter.addConstraint(buildStructuralFeatureTypeName(eStructuralFeatureEClassifier, isContainer, isContainment, true, numberOfSubClasses), null);
		}

		if (numberOfSubClasses > 0) 
		{
			ArrayList<EClass> subEClasses = subParameter.subClassesMap.get(eStructuralFeatureEClassifier.getName());
			if (subEClasses != null) 
			{
				for (EClass subEClass : subEClasses) 
				{
					subParameter.addConstraint(subEClass.getName(), null); // e.g.  ncFinalState
				}
			}
		}

	}

}
