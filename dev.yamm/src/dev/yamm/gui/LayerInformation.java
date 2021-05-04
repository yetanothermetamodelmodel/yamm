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

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Logger;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;

import dev.yamm.Common;
import dev.yamm.init.Activator;
import dev.yamm.logger.YAMMLogger;
import dev.yamm.preferencePage.PreferenceConstants;


/**
 * stores layer information parsed structure information
 */

class LayerInformations {

	class LayerInformation {
		public LayerInformation(Integer layerNumber) {
			this.layerNumber = layerNumber;
		}
		Integer layerNumber = -1; // initialize with a non-existing layer
		ArrayList<ClassInformation> classInformations = new ArrayList<ClassInformation>();
	}

	class ClassInformation {
		public ClassInformation(String name) {
			this.name = name;
		}
		String name 												= "";
		EClass eClass 												= null; 								
		ArrayList<AttributeInformation> attributesInformation 		= new ArrayList<AttributeInformation>(); 
		ArrayList<StateMachineInformation> statemachinesInformation	= new ArrayList<StateMachineInformation>();	
	}

	class MatchingInformation {
		MatchingInformation(ArrayList<String> classMatchings, ArrayList<String> attributeMatchings, ArrayList<String> allowedSubClassesMatchings) {
			this.classMatchings = classMatchings;
			this.attributeMatchings = attributeMatchings;
			this.allowedSubClassesMatchings = allowedSubClassesMatchings;
		}
		// makes sense because they might be additional classes to be matched due to an inheritance hierarchy
		ArrayList<String> classMatchings							= new ArrayList<String>();
		ArrayList<String> attributeMatchings						= new ArrayList<String>();
		ArrayList<String> allowedSubClassesMatchings				= new ArrayList<String>();
	}

	class AttributeInformation extends MatchingInformation {
		String name													= "";
		AttributeInformation(MatchingInformation matchingInformation) {
			super (matchingInformation.classMatchings, matchingInformation.attributeMatchings, matchingInformation.allowedSubClassesMatchings);
		}
		ArrayList<EStructuralFeature> eStructuralFeatures			= new ArrayList<EStructuralFeature>(); 	// all matched eStructuralFeatures e.g., all features with '*' 
	}

	class StateMachineInformation extends MatchingInformation {
		String name													= "";
		StateMachineInformation(MatchingInformation matchingInformation) {
			super (matchingInformation.classMatchings, matchingInformation.attributeMatchings, matchingInformation.allowedSubClassesMatchings);
		}
		EClass eClass												= null;
	}

	class EPackageAndClassPath {
		EPackageAndClassPath (EPackage ePackage, String absoluteClassPath) {
			this.ePackage = ePackage;
			this.absoluteClassPath = absoluteClassPath;
		}
		EPackage ePackage = null;
		String absoluteClassPath = null;
	}

	private enum parseMode { EXPECTLAYER, EXPECTCLASS, EXPECTATTRIBUTE, EXPECTSTATEMACHINE, 
		EXPECTPARAMSPATHPREFIXFILE, EXPECTPARAMSFILE, EXPECTPATHDIRECTORY, ERROR, UNKNOWN };
		public static YAMMLogger logger = YAMMLogger.getYAMMLogger("YAMM Log");

		parseMode pm 	= parseMode.UNKNOWN;
		parseMode ppm 	= parseMode.UNKNOWN;

		final String[] layerIndicators 					= {"layer=", "l="};
		final String[] classIndicators 					= {"class=", "c="};
		final String[] attributeIndicators 				= {"attribute=", "a="};
		final String[] stateMachineIndicators 			= {"statemachine", "s="};

		final String[] pathDirectoryIndicators 			= {"path=", "p="};					// absolute path where to store files
		final String[] pathParamsFileIndicators			= {"paramspath=", "pp="};			// e.g., c:\bla\test.params
		final String[] paramsPathPrefixFileIndicators 	= {"paramspathprefix=", "ppp="}; 	// used in parameters file e.g., x.y.z.FileA

		String directoryForECJFiles 					= "";
		String pathParamsTemplateFile 					= "";
		String paramsPathTypePrefixFile 				= "";	

		ArrayList<LayerInformation> layerInformations = new ArrayList<LayerInformation>();

		/**
		 * @param arguments
		 * @return
		 */
		public Boolean parseIntoLayerInformationsSuccessfull(ArrayList<String> arguments) {

			directoryForECJFiles 		= Common.convertWindowsPath(Activator.getActionPreferenceStore().getString(PreferenceConstants.P_GENERATEPARAMFILEPATH));
			pathParamsTemplateFile 		= Common.convertWindowsPath(Activator.getActionPreferenceStore().getString(PreferenceConstants.P_GENERATEPARAMFILETEMPLATE));
			paramsPathTypePrefixFile 	= Common.convertWindowsPath(Activator.getActionPreferenceStore().getString(PreferenceConstants.P_GENERATEPARAMTYPEPREFIX));	

			Integer layerNumber = -1; // stores the parsed layer number
			pm = parseMode.EXPECTLAYER; 	
			String argument = null;
			String subargument = null;
			int matchPositionStart = 0;
			LayerInformation lastLayerInformation = null;
			ClassInformation lastClassInformation = null;
			// one layer, one class, arbitrary attributes
			for (int i = 0; i < arguments.size(); i++) {
				argument = Common.rmWSAQM(arguments.get(i)); 
				switch (preParseArgument(argument)) {
				case EXPECTLAYER :
					if (ppm == parseMode.UNKNOWN || ppm == parseMode.EXPECTPATHDIRECTORY || ppm == parseMode.EXPECTPARAMSPATHPREFIXFILE || ppm == parseMode.EXPECTPARAMSFILE) {
						try {
							layerNumber = Integer.parseInt(getArgument(layerIndicators, argument));
							lastLayerInformation = new LayerInformation(layerNumber);
							layerInformations.add(lastLayerInformation);
						} catch (NumberFormatException numberFormatException) {
							logger.error("Error: Could not parse layer number of substring \"".concat(argument).concat("\"."));
							return false;
						}
					} else {
						logger.error(TextInputField.SYNTAX_SEARCH_AND_EXECUTE);
						return false;
					}
					ppm = parseMode.EXPECTLAYER;
					break;
				case EXPECTCLASS :
					if (ppm == parseMode.EXPECTLAYER || ppm == parseMode.EXPECTATTRIBUTE || ppm == parseMode.EXPECTSTATEMACHINE) {
						lastClassInformation = new ClassInformation(getArgument(classIndicators, argument));
						lastLayerInformation.classInformations.add(lastClassInformation);
					} else {
						logger.error(TextInputField.SYNTAX_SEARCH_AND_EXECUTE);
						return false;
					}
					ppm = parseMode.EXPECTCLASS;
					break;
				case EXPECTATTRIBUTE :
					subargument = getArgument(attributeIndicators, argument);
					matchPositionStart = subargument.indexOf('+');
					if (matchPositionStart != -1 && (ppm == parseMode.EXPECTCLASS || ppm == parseMode.EXPECTATTRIBUTE || ppm == parseMode.EXPECTSTATEMACHINE)) {	
						AttributeInformation attributeInformation = (AttributeInformation) parseMatchingInformation(subargument);
						attributeInformation.name = subargument.substring(0, matchPositionStart);
						lastClassInformation.attributesInformation.add(attributeInformation);
					} else {
						logger.error(TextInputField.SYNTAX_SEARCH_AND_EXECUTE);
						return false;
					}
					ppm = parseMode.EXPECTATTRIBUTE;
					break;
				case EXPECTSTATEMACHINE :
					subargument = getArgument(attributeIndicators, argument);
					matchPositionStart = subargument.indexOf('+');
					if (matchPositionStart != -1 && (ppm == parseMode.EXPECTCLASS || ppm == parseMode.EXPECTATTRIBUTE || ppm == parseMode.EXPECTSTATEMACHINE)) {
						StateMachineInformation stateMachineInformation = new StateMachineInformation(parseMatchingInformation(subargument));
						stateMachineInformation.name = subargument.substring(2, matchPositionStart);
						lastClassInformation.statemachinesInformation.add(stateMachineInformation);
					} else {
						logger.error(TextInputField.SYNTAX_SEARCH_AND_EXECUTE);
						return false;
					}
					ppm = parseMode.EXPECTSTATEMACHINE;
					break;
				case EXPECTPATHDIRECTORY :
					directoryForECJFiles = getArgument(pathDirectoryIndicators, argument);
					ppm = parseMode.EXPECTPATHDIRECTORY;
					break;
				case EXPECTPARAMSPATHPREFIXFILE :
					paramsPathTypePrefixFile =  getArgument(paramsPathPrefixFileIndicators, argument);
					pm = parseMode.EXPECTPARAMSPATHPREFIXFILE;
					break;
				case EXPECTPARAMSFILE :
					pathParamsTemplateFile =  getArgument (pathParamsFileIndicators, argument);
					pm = parseMode.EXPECTPARAMSFILE;	
					break;
				case ERROR : 
					logger.error(TextInputField.SYNTAX_SEARCH_AND_EXECUTE);
					return false;
				}
			}
			return true;
		}

		/** retrieves all matching information from a subargument
		 * @param subargument
		 * @return
		 */
		private MatchingInformation parseMatchingInformation(String subargument) {
			int matchPositionStart = subargument.indexOf('+');
			MatchingInformation matchInformation = new MatchingInformation(new ArrayList<String>(), new ArrayList<String>(), new ArrayList<String>());
			int matchClassAttributeDelimiterPosition = subargument.indexOf(':', matchPositionStart+1);
			int matchPositionEnd = subargument.indexOf('+', matchPositionStart+1);
			if (matchPositionEnd == -1) {
				matchPositionEnd = subargument.length();
			}
			String classMatching = null;
			String attributeMatching = null;
			while (matchPositionStart < matchClassAttributeDelimiterPosition && matchClassAttributeDelimiterPosition < matchPositionEnd) {
				classMatching = subargument.substring(matchPositionStart + 1, matchClassAttributeDelimiterPosition);
				if (!matchInformation.classMatchings.contains(classMatching))
					matchInformation.classMatchings.add(classMatching);
				attributeMatching = subargument.substring(matchClassAttributeDelimiterPosition+1, matchPositionEnd);
				int matchPositionAllowedSubClassesStart = attributeMatching.indexOf('[');
				if (matchPositionAllowedSubClassesStart != -1) {
					int matchPositionAllowedSubClassesEnd = attributeMatching.indexOf(']');
					if (matchPositionAllowedSubClassesEnd != -1) {
						String allowedSubClass = null;
						int matchPositionAllowedSubClassesSeperator = attributeMatching.
								substring(matchPositionAllowedSubClassesStart, matchPositionAllowedSubClassesEnd).indexOf(',');
						while (matchPositionAllowedSubClassesSeperator != -1) {
							allowedSubClass = attributeMatching.substring(matchPositionAllowedSubClassesStart+1, matchPositionAllowedSubClassesSeperator);
							if (!matchInformation.allowedSubClassesMatchings.contains(allowedSubClass)) {
								matchInformation.allowedSubClassesMatchings.add(allowedSubClass);
							}
							matchPositionAllowedSubClassesStart = matchPositionAllowedSubClassesSeperator+1;
							matchPositionAllowedSubClassesSeperator = attributeMatching.
									substring(matchPositionAllowedSubClassesStart, matchPositionAllowedSubClassesEnd).indexOf(',');
						}
						allowedSubClass = attributeMatching.substring(matchPositionAllowedSubClassesStart+1, matchPositionAllowedSubClassesEnd);
						if (!matchInformation.allowedSubClassesMatchings.contains(allowedSubClass)) {
							matchInformation.allowedSubClassesMatchings.add(allowedSubClass);
						}
						attributeMatching = attributeMatching.substring(0, attributeMatching.indexOf('['));
					}
				}
				if (!matchInformation.attributeMatchings.contains(attributeMatching)) {
					matchInformation.attributeMatchings.add(attributeMatching);
				}
				matchPositionStart = subargument.indexOf('+', matchPositionStart+1);
				if (matchPositionStart == -1) {
					break;
				}
				matchClassAttributeDelimiterPosition = subargument.indexOf(':', matchPositionStart+1);
				matchPositionEnd = subargument.indexOf('+', matchPositionStart+1);
				if (matchPositionEnd == -1) {
					matchPositionEnd = subargument.length();
				}
			}
			return matchInformation;
		}

		/** complements parsed command line information with the corresponding ecore information, this means in particular
		 * \forall attributenames the corresponding eStructuralfeatures are added (e.g., all when attributename = "*")
		 * the corresponding eClasses are determined
		 * @param ePackages
		 * @return true if no error was found, else false
		 */
		public boolean complementWithEcoreInformation(Vector<EPackage> ePackages) {	
			for (LayerInformation layerInformation : layerInformations) {
				if (layerInformation.layerNumber > 0 && layerInformation.layerNumber < ePackages.size()) {
					EPackage ePackage = ePackages.get(layerInformation.layerNumber);
					for (ClassInformation classInformation : layerInformation.classInformations) {
						EPackageAndClassPath ePackageAndClassPath = determinePackage(new EPackageAndClassPath(ePackage, classInformation.name));
						EClassifier eClassifier = ePackageAndClassPath.ePackage.getEClassifier(ePackageAndClassPath.absoluteClassPath);
						if (eClassifier != null && eClassifier instanceof EClass) {
							classInformation.eClass = (EClass) eClassifier;
							for (AttributeInformation attributeInformation : classInformation.attributesInformation) {
								if (attributeInformation.name.equals("*")) {
									for (EStructuralFeature eStructuralFeature : classInformation.eClass.getEAllStructuralFeatures()) {
										attributeInformation.eStructuralFeatures.add(eStructuralFeature);
										if (!attributeInformation.classMatchings.contains(eStructuralFeature.eClass().getName())) {
											attributeInformation.classMatchings.add(eStructuralFeature.eClass().getName());
										}
									}
								} else {
									EStructuralFeature eStructuralFeature = classInformation.eClass.getEStructuralFeature(attributeInformation.name);
									if (eStructuralFeature != null) {
										attributeInformation.eStructuralFeatures.add(eStructuralFeature);
										attributeInformation.classMatchings.add(eStructuralFeature.eClass().getName());
									} else {
										logger.error("Error: Could not find structural feature \"".concat(attributeInformation.name)
												.concat("\" in class \"").concat(ePackageAndClassPath.absoluteClassPath).concat("\"."));
										return false;
									}
								}
							}
							if (classInformation.statemachinesInformation.size() > 0 && layerInformation.layerNumber > 0) {
								EPackage surroundingPackage = ePackages.get(layerInformation.layerNumber - 1);
								for (StateMachineInformation stateMachineInformation : classInformation.statemachinesInformation) {
									ArrayList<String> classMatchingsToBeAdded = new ArrayList<String>();
									for (String classMatch : stateMachineInformation.classMatchings) {
										EClassifier stateMachineEClassifier = surroundingPackage.getEClassifier(classMatch);
										if (stateMachineEClassifier != null && stateMachineEClassifier instanceof EClass) {		
											stateMachineInformation.eClass = stateMachineInformation.eClass == null ? (EClass) stateMachineEClassifier : stateMachineInformation.eClass ;
											for (String attributeName : stateMachineInformation.attributeMatchings) {
												EStructuralFeature eStructuralFeature = stateMachineInformation.eClass.getEStructuralFeature(attributeName);
												if (eStructuralFeature != null) { 
													if (!stateMachineInformation.classMatchings.contains(eStructuralFeature.getEType().getName())) {
														classMatchingsToBeAdded.add(eStructuralFeature.getEType().getName());
													}
													if (!stateMachineInformation.allowedSubClassesMatchings.contains(eStructuralFeature.getEType().getName())) {
														stateMachineInformation.allowedSubClassesMatchings.add(eStructuralFeature.getEType().getName());
													}
												}
											}
										}
									}
									stateMachineInformation.classMatchings.addAll(classMatchingsToBeAdded);
								} 
							}
							break; // classifier was found
						} else {
							logger.error("Error: Could not find classifier \"".concat(ePackageAndClassPath.absoluteClassPath).concat("\"."));
							return false;							
						}
					}
				} else {
					logger.error("Error: Could not find layer number \"".concat(layerInformation.layerNumber.toString()).concat("\"."));
					return false;
				}
			}
			return true;			
		}

		/** searches the ePackage of a given (absolute) class Path
		 * @param ePackageAndClassPath
		 * @return ePackageAndClassPath of the latest ePackages found in ePackage and absoluteClassPath
		 */
		private EPackageAndClassPath determinePackage(EPackageAndClassPath ePackageAndClassPath) {
			Integer packageFirstDotPosition = ePackageAndClassPath.absoluteClassPath.indexOf('.');
			if (packageFirstDotPosition == -1) {
				return ePackageAndClassPath;				
			} else {
				for (EPackage subPackage : ePackageAndClassPath.ePackage.getESubpackages()) {
					if (subPackage.getName().equals(ePackageAndClassPath.absoluteClassPath.substring(0, packageFirstDotPosition))) {
						ePackageAndClassPath.ePackage = subPackage;
						ePackageAndClassPath.absoluteClassPath = ePackageAndClassPath.absoluteClassPath.substring(packageFirstDotPosition + 1, 
								ePackageAndClassPath.absoluteClassPath.length());
						return determinePackage(ePackageAndClassPath);
					}
				}
			}
			return null;
		}

		/**
		 * @param ePackages
		 */
		public void generateECJParameterFile(Vector<EPackage> ePackages) {
			ECJTypes ecjTypes = new ECJTypes();
			for (LayerInformation layerInformation : layerInformations) {
				for (ClassInformation classInformation : layerInformation.classInformations) {
					for (AttributeInformation attributeInformation : classInformation.attributesInformation) {
						EStructuralFeature eStructuralFeature = classInformation.eClass.getEStructuralFeature(attributeInformation.name);
						ecjTypes.collectTypeInformation(ePackages, classInformation.eClass, eStructuralFeature, 
								attributeInformation.classMatchings, attributeInformation.attributeMatchings, 
								attributeInformation.allowedSubClassesMatchings, layerInformation.layerNumber, null);
					}
					for (StateMachineInformation stateMachineInformation : classInformation.statemachinesInformation) {
						ecjTypes.collectTypeInformation(ePackages, stateMachineInformation.eClass, null, 
								stateMachineInformation.classMatchings, stateMachineInformation.attributeMatchings, 
								stateMachineInformation.allowedSubClassesMatchings, layerInformation.layerNumber, null);
					}
				}
			}

			boolean printToConsole = Boolean.parseBoolean(Activator.getActionPreferenceStore().getString(PreferenceConstants.P_GENERATEPARAMINTOCONSOLE));
			String targetFilePrefix = Activator.getActionPreferenceStore().getString(PreferenceConstants.P_GENERATETARGETFILEPREFIX);

			if (!targetFilePrefix.isEmpty() && Common.checkFile(directoryForECJFiles, true, true, "Directory for ECJ Files:")) {
				File targetFile = Common.findNotExistingFile(directoryForECJFiles, targetFilePrefix, ".params");
				File sourceFile = Common.getFile(pathParamsTemplateFile);
				if (Common.copyFileStream(sourceFile, targetFile)) {
					try {
						ECJTypes.setPrintStream(new PrintStream(new FileOutputStream(targetFile.getAbsolutePath(), true)), printToConsole);
					} catch (FileNotFoundException e) {
						logger.error("Could not write parameterfile \"" + pathParamsTemplateFile + "\".");
						return;
					}
				} else {
					ECJTypes.setPrintStream(null, printToConsole);
				}
			} else {
				ECJTypes.setPrintStream(null, printToConsole);
			}

			ecjTypes.writeAtomicTypes();
			ecjTypes.writeSetTypes();
			ArrayList<String> constraintsWritten = ecjTypes.writeConstraints(layerInformations);		
			ecjTypes.writeFunctionSets(constraintsWritten, paramsPathTypePrefixFile);
			ecjTypes.writeYAMMECJAppendix(layerInformations);
		}

		/** 
		 * @param argument
		 * @return
		 */
		private parseMode preParseArgument (String argument) {
			for (String indicator : layerIndicators) {
				if (argument.startsWith(indicator)) {
					return parseMode.EXPECTLAYER;		
				} 
			}
			for (String indicator : classIndicators) {
				if (argument.startsWith(indicator)) {
					return parseMode.EXPECTCLASS;		
				} 
			}
			for (String indicator : attributeIndicators) {
				if (argument.startsWith(indicator)) {
					return parseMode.EXPECTATTRIBUTE;		
				} 
			}
			for (String indicator : stateMachineIndicators) {
				if (argument.startsWith(indicator)) {
					return parseMode.EXPECTSTATEMACHINE;		
				} 
			}
			for (String indicator : pathDirectoryIndicators) {
				if (argument.startsWith(indicator)) {
					return parseMode.EXPECTPATHDIRECTORY;		
				} 
			}
			for (String indicator : pathParamsFileIndicators) {
				if (argument.startsWith(indicator)) {
					return parseMode.EXPECTPARAMSFILE;		
				} 
			}
			for (String indicator : paramsPathPrefixFileIndicators) {
				if (argument.startsWith(indicator)) {
					return parseMode.EXPECTPARAMSPATHPREFIXFILE;		
				} 
			}
			return parseMode.ERROR;
		}

		/** finds the variable e.g., "layer1" in a given argument e.g., "layer=layer1"
		 * @param indicators e.g., "layer=" or "l=" indicating a parameter
		 * @param argument - search (argument) currently processed e.g., "layer=layer1"
		 * @return
		 */
		private String getArgument (String[] indicators, String argument) {
			for (String indicator : indicators) {
				if (argument.startsWith(indicator)) {
					return (argument.substring(indicator.length()));		
				} 
			}
			pm = parseMode.ERROR;
			return argument;
		}
}
