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
package dev.yamm.gui;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;
import java.util.logging.Logger;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import dev.yamm.Common;
import dev.yamm.gui.LayerInformations.AttributeInformation;
import dev.yamm.gui.LayerInformations.ClassInformation;
import dev.yamm.gui.LayerInformations.LayerInformation;
import dev.yamm.gui.LayerInformations.StateMachineInformation;
import dev.yamm.init.Activator;
import dev.yamm.logger.YAMMLogger;
import dev.yamm.preferencePage.PreferenceConstants;

/**
 * @author lobe
 * manages ecj (<-yamm) types
 */
class ECJTypes {

	class ECJType {
		Boolean isComplexType					= false;	// !complex = boolean, integer, string, ...
		Boolean isContainment					= false;	// has references or objects
		Boolean isContainer						= false;	// has multiple values
		Boolean isAbstract 						= false;
		String ecjTypeName						= "";
		String yammTypeName						= "";
		String attributeName				 	= "";
		EClass eClass							= null;
		ArrayList<ECJType> containedECJTypes 	= new ArrayList<ECJType>(); 
		ArrayList<ECJType> subECJTypes			= new ArrayList<ECJType>();
		ArrayList<String> classTypeMatchings 	= new ArrayList<String>();
		ArrayList<String> attributeNameMatchings = new ArrayList<String>();

	}

	final String[] atomicHeader 		= {"# atomic & set types", "# ===================\n", "# atomic types", "# ==================="};
	final String[] prefixSetTypes 		= {"\n# set types", "# ===================\n"};
	final String[] constraintsHeader 	= {"# GPNodeConstraints", "# ===================", "\n# Tree Constraints", "gp.tc.size =\t\t1", "gp.tc.0 =\t\t\tec.gp.GPTreeConstraints",
			"gp.tc.0.name =\t\ttc0", "gp.tc.0.fset =\t\tf0", "gp.tc.0.returns =\tRoot", "\n# nil", "gp.nc.0 =\t\t\tec.gp.GPNodeConstraints", "gp.nc.0.name =\t\tncNIL",
			"gp.nc.0.returns =\tNIL", "gp.nc.0.size =\t\t0", "\n# root", "gp.nc.1 =\t\t\tec.gp.GPNodeConstraints", "gp.nc.1.name =\t\tncRoot", "gp.nc.1.returns =\tRoot"};

	final String[] functionsHeader 		= {"\n\n# Defining function set", "# ===================",
			"gp.fs.size = \t\t\t1",
			"gp.fs.0.size = \t\t\t1", "gp.fs.0 = \t\t\t\tec.gp.GPFunctionSet", 
			"gp.fs.0.name = \t\t\tf0", "gp.fs.0.info = \t\t\tec.gp.GPFuncInfo"};

	public HashMap<String,ECJType> ecjTypesIndex = new HashMap<String,ECJType>(); // all defined ecjTypes
	private int ecjTypesIndexHasBeenSorted = -1;
	ArrayList<String> ecjTypesIndexSortedKeys = null;
	ArrayList<String> atomicTypeNames = null;
	static PrintStream printStream = null;
	static boolean printToConsole = false;
	boolean writeToConsole = true;
	public static YAMMLogger paramsLogger = YAMMLogger.getYAMMLogger("Parameter Log");

	/** builds the set of atomicSimpleTypeNames
	 * @param ePackages
	 * @param eClass
	 * @param eStructuralFeature
	 * @param classMatchings
	 * @param attributeMatchings
	 * @param layerNumber
	 * @param ecjTypeContainer
	 */
	public void collectTypeInformation(Vector<EPackage> ePackages, EClass eClass, 
			EStructuralFeature eStructuralFeature, ArrayList<String> classMatchings, 
			ArrayList<String> attributeMatchings, ArrayList<String> allowedSubClasses, Integer layerNumber, ECJType ecjTypeContainer) {

		ECJType ecjType = buildECJType(eClass, eStructuralFeature);
		//System.out.println(ecjType.ecjTypeName);
		if (ecjTypesIndex.containsKey(ecjType.ecjTypeName)) {
			return;
		}
		//System.out.println(ecjType.ecjTypeName);
		if (ecjType.isContainment) {
			for (EClass subEClass : determineSubClasses(eClass, eStructuralFeature, null)) {
				if (allowedSubClasses.isEmpty() || allowedSubClasses.contains(subEClass.getName())) {
					collectTypeInformation(ePackages, subEClass, null, classMatchings, attributeMatchings, allowedSubClasses, layerNumber, ecjTypeContainer);
				}
			}
		}
		//System.out.println("Adding : " + ecjType.ecjTypeName);
		ecjTypesIndex.put(ecjType.ecjTypeName, ecjType);
		if (ecjType.isContainment && ecjType.isComplexType && ecjType.isContainer && !ecjTypesIndex.containsKey(ecjType.yammTypeName)) {
			ecjType = buildECJType(eClass, eStructuralFeature);
			ecjType.ecjTypeName = ecjType.yammTypeName;
			ecjType.isContainer = false;
			ecjTypesIndex.put(ecjType.ecjTypeName, ecjType);
		}
		ecjType.classTypeMatchings = classMatchings;
		ecjType.attributeNameMatchings = attributeMatchings;
		if (ecjType.isComplexType && ecjType.isContainment) {
			EClass complexType = findEClass(ePackages.get(layerNumber), ecjType.yammTypeName, layerNumber);
			for (EStructuralFeature eChildStructuralFeature : complexType.getEAllStructuralFeatures()) {
				ECJType ecjChildType = buildECJType(complexType, eChildStructuralFeature);
				ecjChildType.classTypeMatchings = classMatchings;
				ecjChildType.attributeNameMatchings = attributeMatchings;
				ecjType.containedECJTypes.add(ecjChildType);
				if (isAMatch(classMatchings, complexType.getName()) && isAMatch(attributeMatchings, eChildStructuralFeature.getName())) {
					collectTypeInformation(ePackages, complexType, eChildStructuralFeature, classMatchings, attributeMatchings, allowedSubClasses, layerNumber, ecjChildType);
				}
			}
			// collect type information of all children ... die muessen allerdings auf derselben ebene stehen!
		}
	}

	private ArrayList<EClass> determineSubClasses(EClass eClass, 
			EStructuralFeature eStructuralFeature, ArrayList<EClass> subClasses) {
		if (subClasses == null) subClasses = new ArrayList<EClass>();
		EClass superClass = eStructuralFeature == null ? eClass : (EClass) eStructuralFeature.getEType();
		for (EClassifier eSubClassifier : superClass.getEPackage().getEClassifiers()) {
			if (eSubClassifier instanceof EClass) { 
				EClass eSubClass = (EClass) eSubClassifier;
				//System.out.println("Checking " + superClass.getName() + " has subclass " + eSubClass.getName());
				if (eSubClass.getESuperTypes().contains(superClass)) {
					//System.out.println(eSubClass.getName());
					subClasses.add(eSubClass);
					subClasses = determineSubClasses(eSubClass, null, subClasses);
				}
			}

		}
		return subClasses;
	}

	private boolean isAMatch(ArrayList<String> Matchings, String name) {
		for (String match : Matchings) {
			if (match.equals(name)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * @param eStructuralFeature
	 * @param ecjType
	 * @param eStructuralFeatureTypeName
	 */
	private ECJType buildECJType(EClass eClass, EStructuralFeature eStructuralFeature) {
		ECJType ecjType = new ECJType();
		if (eStructuralFeature != null) {
			String eStructuralFeatureTypeName = eStructuralFeature.getEType().getName();
			ecjType.yammTypeName = eStructuralFeatureTypeName.equals("String") ? "EString" : eStructuralFeatureTypeName;
			ecjType.ecjTypeName = ecjType.yammTypeName;
			ecjType.attributeName = eStructuralFeature.getName();
			EClassifier eStructuralFeatureClassifier = eClass.getEPackage().getEClassifier(eStructuralFeatureTypeName);
			if (eStructuralFeatureClassifier instanceof EClass) {
				ecjType.isAbstract = ((EClass) eStructuralFeatureClassifier).isAbstract();
				ecjType.eClass = (EClass) eStructuralFeatureClassifier;
			} else if (isSimpleType(eStructuralFeatureTypeName)) {
				ecjType.isAbstract = eClass.isAbstract();
			}
			if (isSimpleType(ecjType.yammTypeName)) {
				ecjType.isComplexType = false;
			} else {
				ecjType.isComplexType = true;
			}
			if (eStructuralFeature instanceof EReference) {
				EReference eReference = (EReference) eStructuralFeature;
				if (eReference.isContainment()) {
					ecjType.isContainment = true;
				} else {
					ecjType.isContainment = false;
					ecjType.ecjTypeName += "_Reference";
				}
			}
			if (eStructuralFeature.getUpperBound() == -1 
					|| eStructuralFeature.getUpperBound() - eStructuralFeature.getLowerBound() > 1) {
				ecjType.ecjTypeName += "_Container";
				ecjType.isContainer = true;
			} else {
				ecjType.isContainer = false;
			}
		} else {	
			ecjType.yammTypeName 	= eClass.getName();
			ecjType.ecjTypeName 	= ecjType.yammTypeName;		
			ecjType.isAbstract		= eClass.isAbstract();
			ecjType.eClass			= eClass;
			ecjType.isComplexType 	= true;
			ecjType.isContainment 	= true;
			ecjType.isContainer 	= false;
		} 
		return ecjType;
	}

	private ArrayList<String> getECJTypesIndex() {
		if (ecjTypesIndexHasBeenSorted != ecjTypesIndex.keySet().hashCode() || ecjTypesIndexSortedKeys == null) {
			ecjTypesIndexHasBeenSorted = ecjTypesIndex.keySet().hashCode();
			ecjTypesIndexSortedKeys = new ArrayList<String>(ecjTypesIndex.keySet());
			// assuming not a good idea
			// Collections.sort(ecjTypesIndexSortedKeys);
		}
		return ecjTypesIndexSortedKeys;
	}

	/**
	 * @param ecjType
	 * @param ecoreType
	 */
	private boolean isSimpleType(String ecoreType) {
		if (ecoreType.equals("EBoolean") || ecoreType.equals("EInt") 
				|| ecoreType.equals("EDouble") || ecoreType.equals("EFloat") 
				|| ecoreType.equals("String") || ecoreType.equals("EString")) {
			return true;
		} else {
			return false;
		}
	}

	/** finds an eClass in a Package (and sub-Packages)
	 * @param ePackage
	 * @param className
	 * @param layerNumber
	 * @return
	 */
	private EClass findEClass(EPackage ePackage, String className, Integer layerNumber) {
		EClassifier eClassifier = ePackage.getEClassifier(className);
		if ((!(eClassifier instanceof EClass) || eClassifier == null)) {
			if (ePackage.getESubpackages().size() > 0) {
				for (EPackage subEPackage : ePackage.getESubpackages()) {
					return findEClass(subEPackage, className, layerNumber);
				}
			} else {
				return null;
			}
		} 
		return (EClass) eClassifier;
	}

	public static void setPrintStream(PrintStream newPrintStream, boolean newPrintToConsole) {
		printStream = newPrintStream;
		printToConsole = newPrintToConsole;
	}

	private void writeln() {
		writeln("");
	}

	private void writeln(String message) {
		if (printToConsole == true) {
			paramsLogger.info(message, false, false, true);
		} 
		if (printStream != null) {
			printStream.println(message);
		}
	}

	private void write(String message) {
		if (printToConsole == true) {
			paramsLogger.info(message, false, false, false);
		} 
		if (printStream != null) {
			printStream.print(message);
		}
	}

	/** writes atomic SimpleTypeNames in form of ECJ constraints
	 * @param stream
	 * @param ecjTypes - hierarchical structure
	 */
	public void writeAtomicTypes() {
		final String printPrefix = "gp.type.a.";

		for (String headerPart : atomicHeader) {
			writeln(headerPart);
		}
		writeln(printPrefix.concat("0.name = \tNIL"));
		writeln(printPrefix.concat("1.name = \tRoot"));
		Integer printOffset = 2;
		ArrayList<String> ecjTypeNames = new ArrayList<String>(getECJTypesIndex());
		atomicTypeNames = new ArrayList<String>();		
		for (Integer ecjTypeCounter=printOffset; ecjTypeCounter < ecjTypeNames.size()+printOffset; ecjTypeCounter++ ) {
			ECJType ecjType = ecjTypesIndex.get(ecjTypeNames.get(ecjTypeCounter-printOffset));
			// TODO: isContainer was removed to include references
			if (!atomicTypeNames.contains(ecjType.ecjTypeName) || ecjType.isAbstract && !ecjType.isContainer) {		
				atomicTypeNames.add(ecjType.ecjTypeName);
			}
		}
		//Collections.sort(atomicTypeNames);
		Integer declarationSize = 0;
		for (declarationSize = 0; declarationSize < atomicTypeNames.size(); declarationSize++) {
			writeln(printPrefix.concat(((Integer) (declarationSize+2)).toString()).concat(".name =\t").concat(atomicTypeNames.get(declarationSize)));
		}
		writeln();
		writeln(printPrefix.concat("size =\t".concat(((Integer) (declarationSize+2)).toString())));
	}

	/** writes set SimpleTypeNames in form of ECJ constraints
	 * @param stream
	 */
	public void writeSetTypes() {
		final String printPrefix = "gp.type.s.";

		// base level of ecj /ecore types
		for (String prefixPart : prefixSetTypes) {
			writeln(prefixPart);
		}

		// determine complex types
		ArrayList<String> setTypeNames = new ArrayList<String>();
		for (String ecjTypeName : getECJTypesIndex()) {
			ECJType ecjType = ecjTypesIndex.get(ecjTypeName);
			if (ecjType.isAbstract && ecjType.isContainment || ecjType.isComplexType && ecjType.isContainment && ecjType.isContainer) {
				setTypeNames.add(ecjTypeName);
			}
		}

		//Collections.sort(setTypeNames);
		ArrayList<String> setTypeNamesWritten = new ArrayList<String>();

		Integer declarationSize;
		Integer declarationSizeCorrection = 0;
		for (declarationSize = 0; declarationSize < setTypeNames.size(); declarationSize++) {
			ECJType ecjType = ecjTypesIndex.get(setTypeNames.get(declarationSize));
			String setTypeName = ecjType.ecjTypeName;
			if (setTypeNamesWritten.contains(setTypeName)) {
				declarationSizeCorrection++;
				continue;
			}
			setTypeNamesWritten.add(setTypeName);
			String printPrefix2 = printPrefix.concat(((Integer) (declarationSize - declarationSizeCorrection)).toString());
			writeln("# ".concat(setTypeName));
			writeln(printPrefix2.concat(".name =\t\t").concat(setTypeName).concat("Set"));
			if (ecjType.isContainer) {
				// its a container
				writeln(printPrefix2.concat(".size =\t\t").concat("2"));
				writeln(printPrefix2.concat(".member.0 =\t").concat(setTypeName));
				writeln(printPrefix2.concat(".member.1 =\t").concat("NIL"));
			} else {
				ArrayList<EClass> filteredSubClasses = filterSubClasses(determineSubClasses(ecjType.eClass, null, null));
				writeln(printPrefix2.concat(".size =\t\t").concat(((Integer) filteredSubClasses.size()).toString()));
				for (Integer subClassCounter = 0; subClassCounter < filteredSubClasses.size(); subClassCounter++) {
					EClass subClass = filteredSubClasses.get(subClassCounter);
					writeln(printPrefix2.concat(".member.".concat(subClassCounter.toString()).concat(" =\t\t").concat(subClass.getName())));
				}
			}
			writeln();
		}

		writeln(printPrefix.concat("size =\t".concat(declarationSize.toString())));
		writeln();
	}

	private ArrayList<EClass> filterSubClasses(ArrayList<EClass> subClasses) {
		ArrayList<EClass> filteredSubClasses = new ArrayList<EClass>();
		for (EClass subClass : subClasses) {
			if (atomicTypeNames.contains(subClass.getName())) {
				filteredSubClasses.add(subClass);
			}
		}
		return filteredSubClasses;
	}

	public ArrayList<String> writeConstraints(ArrayList<LayerInformation> layerInformations) {
		ArrayList<String> constraintsAlreadyWritten = new ArrayList<String>();
		constraintsAlreadyWritten.add("NIL");
		constraintsAlreadyWritten.add("Root");
		for (String headerPart : constraintsHeader) {
			writeln(headerPart);
		}
		for (LayerInformation layerInformation : layerInformations) {
			for (ClassInformation classInformation : layerInformation.classInformations) {
				Integer childConstraintCounter = 0;
				for (AttributeInformation attributeInformation : classInformation.attributesInformation) {
					for (EStructuralFeature eStructuralFeature : attributeInformation.eStructuralFeatures) {
						ECJType ecjType = ecjTypesIndex.get(eStructuralFeature.getEType().getName().replace("?", ""));
						if (isAMatch(ecjType.classTypeMatchings, ecjType.yammTypeName) && isAMatch(ecjType.attributeNameMatchings, eStructuralFeature.getName())) {
							writeln("gp.nc.1.child.".concat(childConstraintCounter.toString()).concat(" =\t").concat(eStructuralFeature.getName()));
							childConstraintCounter++;
							if (ecjType.containedECJTypes.size() > 0) {
								constraintsAlreadyWritten = traverseChildConstraints(ecjType, constraintsAlreadyWritten);
							}
						}
					}
				}
				for (StateMachineInformation stateMachineInformation : classInformation.statemachinesInformation) {
					EClass stateMachineEClass = stateMachineInformation.eClass;
					ECJType ecjType = ecjTypesIndex.get(stateMachineEClass.getName());
					writeln("gp.nc.1.child.".concat(childConstraintCounter.toString()).concat(" =\t").concat(ecjType.ecjTypeName));
					childConstraintCounter++;
					writeln("gp.nc.1.size =\t\t".concat(childConstraintCounter.toString()));
					if (ecjType.containedECJTypes.size() > 0) {
						constraintsAlreadyWritten = traverseChildConstraints(ecjType, constraintsAlreadyWritten);
					}
				}
			}
		}
		writeln("\ngp.nc.size =\t\t".concat(((Integer) constraintsAlreadyWritten.size()).toString()));
		return constraintsAlreadyWritten;
	}


	private ArrayList<String> traverseChildConstraints(ECJType ecjType, ArrayList<String> constraintsAlreadyWritten) {
		//		System.out.print(ecjType.classTypeMatchings + " : ");
		//		System.err.println(ecjType.yammTypeName);
		// TODO
		if (constraintsAlreadyWritten.contains(ecjType.ecjTypeName) || !isAMatch(ecjType.classTypeMatchings, ecjType.yammTypeName) || !isAMatch(atomicTypeNames, ecjType.ecjTypeName)) {
			return constraintsAlreadyWritten;
		}
		printConstraint(ecjType, constraintsAlreadyWritten.size());
		constraintsAlreadyWritten.add(ecjType.ecjTypeName);
		// write subClasses
		for (EClass subClass : filterSubClasses(determineSubClasses(ecjType.eClass, null, null))) {
			ECJType ecjSubClass = buildECJType(subClass, null);
			if (!constraintsAlreadyWritten.contains(ecjSubClass.ecjTypeName)) {
				printConstraint(ecjSubClass, constraintsAlreadyWritten.size());
				constraintsAlreadyWritten.add(ecjSubClass.ecjTypeName);
			}
		}
		if (ecjType.isContainer) {
			ECJType nonContainerPendant = ecjTypesIndex.get(ecjType.yammTypeName);
			constraintsAlreadyWritten = traverseChildConstraints(nonContainerPendant, constraintsAlreadyWritten);
		}
		for (ECJType ecjChildType : ecjType.containedECJTypes) {
			//System.out.println(ecjChildType.ecjTypeName);
			constraintsAlreadyWritten = traverseChildConstraints(ecjChildType, constraintsAlreadyWritten);
		}
		return constraintsAlreadyWritten;
	}

	/**
	 * @param stream
	 * @param ecjType
	 * @param constraintCounter
	 * @param childConstraintCounter
	 */
	private Integer printConstraint(ECJType ecjType, Integer constraintCounter) {
		writeln("\n# ".concat(ecjType.ecjTypeName));
		writeln("gp.nc.".concat(((Integer) constraintCounter).toString()).concat(" =\t\t\tec.gp.GPNodeConstraints"));
		writeln("gp.nc.".concat(((Integer) constraintCounter).toString()).concat(".name = \t\tnc").concat(ecjType.ecjTypeName));
		writeln("gp.nc.".concat(((Integer) constraintCounter).toString()).concat(".returns = \t").concat(ecjType.ecjTypeName));
		Integer childConstraintCounter = 0;
		for (ECJType ecjChildType : ecjType.containedECJTypes) {
			if (isAMatch(ecjChildType.attributeNameMatchings, ecjChildType.attributeName)) {
				writeln("gp.nc.".concat(((Integer) constraintCounter).toString()).concat(".child.").concat(childConstraintCounter.toString()).concat(" =\t").concat(ecjChildType.ecjTypeName));
				childConstraintCounter++;
			}
		}
		if (ecjType.isContainer) {
			writeln("gp.nc.".concat(((Integer) constraintCounter).toString()).concat(".size =\t\t").concat(((Integer) (childConstraintCounter+2)).toString()));
			String childName = ecjType.isAbstract ? ecjTypesIndex.get(ecjType.yammTypeName).ecjTypeName.concat("Set") : ecjTypesIndex.get(ecjType.yammTypeName).ecjTypeName; 
			writeln("gp.nc.".concat(((Integer) constraintCounter).toString()).concat(".child.").concat(childConstraintCounter.toString())
					.concat(" =\t").concat(childName));
			childConstraintCounter++;
			writeln("gp.nc.".concat(((Integer) constraintCounter).toString()).concat(".child.").concat(childConstraintCounter.toString())
					.concat(" =\t").concat(ecjType.ecjTypeName).concat("Set"));
		} else {
			writeln("gp.nc.".concat(((Integer) constraintCounter).toString()).concat(".size =\t\t").concat(childConstraintCounter.toString()));
		}
		return childConstraintCounter;
	}

	public void writeFunctionSets(ArrayList<String> constraintsWritten, String paramsPathPrefixFile) {
		final String printPrefix 	= "gp.fs.0.func.";

		for (String headerPart : functionsHeader) {
			writeln(headerPart);
		}
		writeln("\n# NIL");
		writeln("gp.fs.0.func.0 =\t\t".concat(paramsPathPrefixFile).concat("NIL"));
		writeln("gp.fs.0.func.0.nc =\t\tncNIL");
		writeln("\n# Root");
		writeln("gp.fs.0.func.1 =\t\t".concat(paramsPathPrefixFile).concat("Root"));
		writeln("gp.fs.0.func.1.nc =\t\tncRoot\n");
		writeln("#other objects");
		Integer functionSize = 2;

		for (String constraintType : constraintsWritten) {
			if (constraintType.equals("NIL") || constraintType.equals("Root")) {
				continue;
			}
			ECJType ecjType = ecjTypesIndex.get(constraintType);
			String fileName;
			write(printPrefix.concat(functionSize.toString()).concat(" =\t\t"));
			if (ecjType.isContainer) {
				fileName = "Container";
			} else {
				if (ecjType.isComplexType) {
					if (ecjType.isContainment) {
						fileName = "Instance";
					} else {
						fileName = "InstanceReference";
					}
				} else {
					fileName = ecjType.yammTypeName;
				}
			}
			writeln(paramsPathPrefixFile.concat(fileName));
			write(printPrefix.concat(functionSize.toString()).concat(".nc =\t"));
			if (functionSize < 10) {
				write("\t");
			}
			writeln(("nc").concat(ecjType.ecjTypeName));
			functionSize++;
		}
		writeln("\ngp.fs.0.size =\t".concat(functionSize.toString()));
	}

	/**
	 * @param printStream
	 */
	public void writeYAMMECJAppendix(ArrayList<LayerInformation> layerInformations) {
		String layerFileName = LayerView.getLayerFileName();
		String printedLayerFileName = "";
		writeln("\n# RMOF Parameters");
		writeln("# ===================");
		if (layerFileName.charAt(1) == ':' && layerFileName.length() > 2) {
			printedLayerFileName = layerFileName.substring(2);
		}
		printedLayerFileName = printedLayerFileName.replace('\\', '/');
		writeln("eval.problem.rmof.layers.file =\t\t\t\t\t\t" + printedLayerFileName);
		int lastSeperator = printedLayerFileName.lastIndexOf('/');
		if (lastSeperator > -1 && lastSeperator < printedLayerFileName.length()) {
			lastSeperator = printedLayerFileName.substring(0,lastSeperator).lastIndexOf('/');
			if (lastSeperator > -1 && lastSeperator < printedLayerFileName.length()) {	
				writeln("eval.problem.rmof.model.path =\t\t\t\t\t\t" + printedLayerFileName.subSequence(0, lastSeperator));
			}
		}
		if (Activator.getActionPreferenceStore() != null) {
			String prefPathString = new String(PreferenceConstants.P_COMPILEDCLASSES_PATH);
			String dynamicCompiledClassesPath = Activator.getActionPreferenceStore().getString(prefPathString);
			if (dynamicCompiledClassesPath.charAt(1) == ':' && dynamicCompiledClassesPath.length() > 2) {
				dynamicCompiledClassesPath = dynamicCompiledClassesPath.substring(2);
			}
			writeln("eval.problem.action.dynamic.compiled.class.path =\t" + dynamicCompiledClassesPath.replace('\\', '/'));
		}

		// adding root GP information where to attach/instantiate the generated information
		final String layerPrefix = "rmof.rootGPNode.layer.";
		// determine filled layers ... to be printed
		ArrayList<Integer> filledLayers = new ArrayList<Integer>();
		ArrayList<Integer> filledClassInformation = new ArrayList<Integer>();
		ArrayList<Integer> filledStateMachineInformation = new ArrayList<Integer>();
		boolean somethingisfilled;

		for (Integer layerNumber = 0; layerNumber < layerInformations.size(); layerNumber++) {
			LayerInformation layerInformation = layerInformations.get(layerNumber);
			for (ClassInformation classInformation : layerInformation.classInformations) {
				somethingisfilled = false;
				if (classInformation.attributesInformation.size() > 0) {
					filledClassInformation.add(layerNumber);
					somethingisfilled = true;
				}
				if (classInformation.statemachinesInformation.size() > 0) {
					filledStateMachineInformation.add(layerNumber);
					somethingisfilled = true;
				}
				if (somethingisfilled) {
					filledLayers.add(layerNumber);
					somethingisfilled = false;
				}
			}
		}

		writeln(layerPrefix.concat("size =\t\t\t\t\t\t").concat(((Integer) (filledLayers.size())).toString()));
		Integer stateMachineOffset = 0;

		for (Integer layerCounter = 0; layerCounter < filledLayers.size(); layerCounter++) {
			LayerInformation layerInformation = layerInformations.get(filledLayers.get(layerCounter));
			if (filledClassInformation.contains(layerCounter)) {
				String layerHeader = layerPrefix.concat(layerCounter.toString());
				writeln(layerHeader.concat(".name = \t\t\t\t\t\t").concat(layerInformation.layerNumber.toString()));
				writeln(layerHeader.concat(".class.size =\t\t\t\t").concat(((Integer)layerInformation.classInformations.size()).toString()));
				for (Integer classCounter = 0; classCounter < layerInformation.classInformations.size(); classCounter++) {
					ClassInformation classInformation = layerInformation.classInformations.get(classCounter);
					String classHeader = layerHeader.concat(".class.").concat(classCounter.toString());
					writeln(classHeader.concat(".name =\t\t\t\t").concat(classInformation.name));
					writeln(classHeader.concat(".eclass =\t\t\t\t").concat(classInformation.eClass.getName().replace("?", "")));
					writeln(classHeader.concat(".attribute.size =\t").concat(((Integer) classInformation.attributesInformation.size()).toString()));
					for (Integer attributeCounter = 0; attributeCounter < classInformation.attributesInformation.size(); attributeCounter++) {
						AttributeInformation attributeInformation = classInformation.attributesInformation.get(attributeCounter);
						writeln(classHeader.concat(".attribute.").concat(attributeCounter.toString()).concat(".name =\t").concat(attributeInformation.name));	
						writeln(classHeader.concat(".attribute.").concat(attributeCounter.toString()).concat(".eclass =\t")
								.concat(attributeInformation.eStructuralFeatures.get(attributeCounter).getEType().getName().replace("?", "")));

						writeln(classHeader.concat(".classMatch.size = \t").concat(((Integer) attributeInformation.classMatchings.size()).toString()));
						for (Integer classNumber = 0; classNumber < attributeInformation.classMatchings.size(); classNumber++) {
							writeln(classHeader.concat(".classMatch.").concat(classNumber.toString()).concat(" = \t").concat(attributeInformation.classMatchings.get(classNumber)));
						}

						writeln(classHeader.concat(".attributeMatch.size = \t").concat(((Integer) attributeInformation.attributeMatchings.size()).toString()));
						for (Integer attributeNumber = 0; attributeNumber < attributeInformation.attributeMatchings.size(); attributeNumber++) {
							writeln(classHeader.concat(".attributeMatch.").concat(attributeNumber.toString()).concat(" = \t").concat(attributeInformation.attributeMatchings.get(attributeNumber)));
						}

					}
				}
				stateMachineOffset++;
			}
			if (filledStateMachineInformation.contains(layerCounter)) {
				String layerHeader = layerPrefix.concat(((Integer) (stateMachineOffset + layerCounter)).toString());
				writeln(layerHeader.concat(".name = \t\t\t\t\t\t").concat(Integer.toString(layerInformation.layerNumber-1)));
				Integer numberOfStateMachineLayersOfClass = 0;
				for (ClassInformation classInformation : layerInformation.classInformations) {
					if (classInformation.statemachinesInformation.size() > 0) {
						numberOfStateMachineLayersOfClass++;
					}
				}
				writeln(layerHeader.concat(".class.size =\t\t\t\t").concat(((Integer)numberOfStateMachineLayersOfClass).toString()));
				Integer counterOfStateMachineLayersOfClass = 0;
				for (ClassInformation classInformation : layerInformation.classInformations) {
					if (classInformation.statemachinesInformation.size() > 0) {
						String classHeader = layerHeader.concat(".class.").concat(counterOfStateMachineLayersOfClass.toString());
						writeln(classHeader.concat(".name =\t\t\t\t").concat(classInformation.name));
						writeln(classHeader.concat(".statemachine.size =\t").concat(((Integer) classInformation.statemachinesInformation.size()).toString()));
						for (Integer stateMachineCounter = 0; stateMachineCounter < classInformation.statemachinesInformation.size(); stateMachineCounter++) {
							StateMachineInformation stateMachineInformation = classInformation.statemachinesInformation.get(stateMachineCounter);
							String classHeader2 = classHeader.concat(".statemachine.").concat(stateMachineCounter.toString());
							writeln(classHeader2.concat(".name =\t").concat(stateMachineInformation.name));
							writeln(classHeader2.concat(".eclass =\t").concat(classInformation.statemachinesInformation.get(stateMachineCounter).eClass.getName()));

							writeln(classHeader2.concat(".classMatch.size = \t").concat(((Integer) stateMachineInformation.classMatchings.size()).toString()));
							Integer classNumber = 0;
							for (; classNumber < stateMachineInformation.classMatchings.size(); classNumber++) {
								writeln(classHeader2.concat(".classMatch.").concat(classNumber.toString()).concat(" = \t").concat(stateMachineInformation.classMatchings.get(classNumber)));
							}

							writeln(classHeader2.concat(".attributeMatch.size = \t").concat(((Integer) stateMachineInformation.attributeMatchings.size()).toString()));
							Integer attributeNumber = 0;
							for (; attributeNumber < stateMachineInformation.attributeMatchings.size(); attributeNumber++) {
								writeln(classHeader2.concat(".attributeMatch.").concat(attributeNumber.toString()).concat(" = \t").
										concat(stateMachineInformation.attributeMatchings.get(attributeNumber)));
							}

						}
						counterOfStateMachineLayersOfClass++;
					}
				}
			}
		}
	}

}
