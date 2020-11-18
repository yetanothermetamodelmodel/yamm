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

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;

import online.yamm.Common;
import online.yamm.ObjectManagement;
import online.yamm.gui.LayerView;
import online.yamm.logger.YAMMLogger;
import online.yamm.preferencePage.PreferenceConstants;

public class Parameter {

	public ExistSubParameter 		existSubParameter 		= null;
	public AssignmentSubParameter	assignmentSubParameter 	= null;
	public GenerateSubParameter 	generateSubParameter 	= null;

	Integer subPopulation 													= null;	

	public final static String populationSuffix = 	"_";
	public final static String longParamsSep = 		"# ====================================================================================================================";
	public final static String shortParamsSep = 	"# ---------------------------------------------";
	private static String printPrefix =				"";

	// where to print stuff
	private static boolean printToConsole = 		false;
	private static PrintStream printStream = 		null;

	private static YAMMLogger paramsLogger = 		YAMMLogger.getYAMMLogger("Parameter Log");
	private static YAMMLogger logger = 				YAMMLogger.getYAMMLogger("YAMM Log");

	Parameter(ExistSubParameter existSubParameter, AssignmentSubParameter assignmentSubParameter, GenerateSubParameter generateSubParameter) {
		this.existSubParameter = existSubParameter;
		this.assignmentSubParameter = assignmentSubParameter;
		this.generateSubParameter = generateSubParameter;
	}

	public void addRMOFInformation(ParameterManagement parameterManagement, ObjectManagement objectManagement, int subPopulation) throws Exception {
		
		if (existSubParameter != null && existSubParameter.layer != null) 
		{
			this.subPopulation = subPopulation;
			existSubParameter.ePackage = objectManagement.getEPackage(existSubParameter.layer);

			// adding eclasses ... there should be only one due to previous operations
			if (existSubParameter.ePackage != null) {
				for (SubClass subClass : existSubParameter.subClasses) {
					EClassifier eClassifier = existSubParameter.ePackage.getEClassifier(subClass.className);
					if (eClassifier == null && !(eClassifier instanceof EClass)) 
						throw new Exception("Could not find EClassifier for class name " + subClass.className);
					subClass.eClass = (EClass) eClassifier;
				}
			}		

			// just checking ... not necessary ... since only the generated information is written
			existSubParameter.addYAMMInformation(parameterManagement, existSubParameter.subClasses.get(0).eClass, false);
			assignmentSubParameter.addYAMMInformation(parameterManagement, existSubParameter.subClasses.get(0).eClass, false);
			// ecj information is only required in this case
			generateSubParameter.addYAMMInformation(parameterManagement, existSubParameter.subClasses.get(0).eClass, true);

		}
	}
	
	/**
	 * prepare printing of parameters to file, console
	 */
	public static void preparePrinting(String ECJParamFilePath) 
	{
		printToConsole = Common.getPreferenceBoolean(PreferenceConstants.P_GENERATEPARAMINTOCONSOLE, true);

		File targetFile = null;
		if (ECJParamFilePath != null)
			targetFile = new File(Common.convertWindowsPath(ECJParamFilePath.substring(3)));
		else
		{
			String targetFilePrefix = Common.getPreferenceString(PreferenceConstants.P_GENERATETARGETFILEPREFIX);
			String directoryForECJFiles = Common.convertWindowsPath(Common.getPreferenceString(PreferenceConstants.P_GENERATEPARAMFILEPATH));	
			targetFile = Common.findNotExistingFile(directoryForECJFiles, targetFilePrefix, ".params");
		}

		if (targetFile != null)
		{
			String pathParamsTemplateFile = Common.convertWindowsPath(Common.getPreferenceString(PreferenceConstants.P_GENERATEPARAMFILETEMPLATE));
			File sourceFile = Common.getFile(pathParamsTemplateFile);
			if (Common.copyFileChar(sourceFile, targetFile)) {
				try {
					printStream = new PrintStream(new FileOutputStream(targetFile.getAbsolutePath(), true));
				} catch (FileNotFoundException e) {
					logger.error("Could not write parameterfile \"" + pathParamsTemplateFile + "\".");
					return;
				}
				logger.info("Parameterfile template successfully copied to file " + targetFile.getAbsolutePath() + ".");
			} else {
				printStream = System.err;
			}
		} else {
			printStream = System.out;
		}
}

	
	/** writes the subpopulation(s)
	 * @param writeHeader 			: if header should be written
	 * @param totalPopulationSize	: ...
	 * @param subPopIndex 			: current population index
	 * @param offset				: offset for the current element index
	 * @param writeAppendix			: if appendix should be written
	 * @return						: offset + local index
	 */
	public Integer writeSubPopulation(boolean writeHeader, int totalPopulationSize, int subPopIndex, Integer offset, boolean writeAppendix) 
	{
		if (writeHeader) 
			writeln("\n\n", longParamsSep + "\n# Subpopulations\n" + longParamsSep + "\npop.subpops = " + totalPopulationSize);
		
		writeln("", "\n# ec.subpopulation " + subPopIndex + "\n" + shortParamsSep);
		writeln("pop.subpop." + subPopIndex, " = ec.Subpopulation");
		writeln("pop.subpop." + subPopIndex + ".", "size = 100");
		writeln("duplicate-retries = 5");
		writeln("species = ec.gp.GPSpecies");
		writeln("species.fitness = ec.gp.koza.RMOFKozaFitness");
		writeln("species.ind = ec.gp.GPIndividual");
		writeln("species.pipe = ec.breed.MultiBreedingPipeline");
		writeln("species.pipe.generate-max = false");
		
		writeln("", "\n# ec.subpopulation.gptree");
		writeln("pop.subpop." + subPopIndex + ".species.ind.", "numtrees = 1");
		writeln("tree.0 = ec.gp.GPTree");
		writeln("tree.0.tc = tc" + populationSuffix + subPopIndex);
		
		writeln("", "\n# subsidiary pipelines");
		writeln("pop.subpop." + subPopIndex + ".species.pipe.", "num-sources = 2");
		writeln("pop.subpop."  + subPopIndex + ".species.pipe.source.", "0 = ec.gp.koza.CrossoverPipeline");
		writeln("0.prob = 0.5");
		writeln("1 = ec.gp.breed.MutateOneNodePipeline");
		writeln("1.prob = 0.5");
		writeln("1.source.0 = ec.select.TournamentSelection");
		writeln("1.ns.0 = ec.gp.koza.KozaNodeSelector");
		return offset;
	}

	
	/** writes the atomic types
	 * @param writeHeader 			: if header should be written
	 * @param totalPopulationSize	: ...
	 * @param subPopIndex 			: current population index
	 * @param offset				: offset for the current element index
	 * @param writeAppendix			: if appendix should be written
	 * @return						: offset + local index
	 */
	public Integer writeAtomicParameters(boolean writeHeader,  int totalPopulationSize, int subPopIndex, Integer offset, boolean writeAppendix) 
	{
		if (writeHeader) 
			writeln("\n\n", longParamsSep + "\n# Types\n" + longParamsSep);

		writeln("", "\n# atomic types subpopulation " + subPopIndex);

		writeln("gp.type.a.", offset++ + ".name = NIL" + populationSuffix + subPopIndex);
		writeln(offset++ + ".name = ROOT" + populationSuffix + subPopIndex);
		
		offset = generateSubParameter.writeAtomicParameters(offset, subPopIndex);
		
		if (writeAppendix)
			writeln("gp.type.a.", "size = " + offset);

		return offset;
	}
	
	/** writes the set types
	 * @param writeHeader 			: if header should be written
	 * @param totalPopulationSize	: ...
	 * @param subPopIndex 			: current population index
	 * @param offset				: offset for the current element index
	 * @param writeAppendix			: if appendix should be written
	 * @return						: offset + local index
	 */
	public Integer writeSetParameters(boolean writeHeader, int totalPopulationSize, int subPopIndex, Integer offset, boolean writeAppendix) {	
		writeln("", "\n# set types subpopulation " + subPopIndex);
		
		offset = generateSubParameter.writeSetParameters(offset, subPopIndex);
		
		if (writeAppendix)
			writeln("gp.type.s.", "size = " + offset);
		
		return offset;
	}
	
	
	/** writes the constraints
	 * @param writeHeader 			: if header should be written
	 * @param totalPopulationSize	: ...
	 * @param subPopIndex 			: current population index
	 * @param offset				: offset for the current element index
	 * @param writeAppendix			: if appendix should be written
	 * @return						: offset + local index
	 */
	public int writeConstraints(boolean writeHeader, int totalPopulationSize, int subPopIndex, Integer offset, boolean writeAppendix) 
	{
		final String popAppendix = populationSuffix + subPopIndex;
		
		if (writeHeader) 
		{
			writeln("", "\n\n-\ngp.tc.size = " + totalPopulationSize);
			writeln("", longParamsSep + "\n# Constraints\n" + longParamsSep);
		}
		
		writeln("", "\n# constraints subpopulation " + subPopIndex + "\n" + shortParamsSep + "\n");
		writeln("gp.tc." + subPopIndex, " = ec.gp.GPTreeConstraints");
		
		writeln(".name = tc" + popAppendix);
		writeln(".init = ec.gp.koza.HalfBuilder");
		writeln(".fset = f" + popAppendix);
		writeln(".returns = ROOT" + popAppendix + "\n");
		writeln("", "# NIL" + popAppendix);
		writeln("gp.nc." + offset++, " = ec.gp.GPNodeConstraints");
		writeln(".name = ncNIL" + popAppendix);
		writeln(".returns = NIL" + popAppendix);
		writeln(".size = 0\n");
		
		writeln("", "# ROOT" + popAppendix);
		writeln("gp.nc." + offset++," = ec.gp.GPNodeConstraints");
		writeln(".name = ncROOT" + popAppendix);
		writeln(".returns = ROOT" + popAppendix);
		writeln(".size = 1");
		writeln(".child.0 = " + existSubParameter.subClasses.get(0).className + popAppendix);

		offset = generateSubParameter.writeConstraints(offset, subPopIndex);
		
		if (writeAppendix)
			writeln("", "gp.nc.size = " + offset);
		
		return offset;
	}

	
	/** writes the function sets
	 * @param writeHeader 			: if header should be written
	 * @param totalPopulationSize	: ...
	 * @param subPopIndex 			: current population index
	 * @param offset				: offset for the current element index
	 * @param writeAppendix			: if appendix should be written
	 * @return						: offset + local index
	 */
	public int writeFunctionSets(boolean writeHeader, int totalPopulationSize, int subPopIndex, Integer offset, boolean writeAppendix) {
		
		final String popAppendix = populationSuffix + subPopIndex;
		final String typePrefix = " = ec.rmof.analysis.";
		
		if (writeHeader) {
			writeln("", "\n\n-\ngp.fs.size = " + totalPopulationSize);
			writeln("", longParamsSep + "\n# Functions\n" + longParamsSep);
		}
		
		writeln("", "\n# functions subpopulation " + subPopIndex + "\n" + shortParamsSep);
		writeln("gp.fs." + subPopIndex, " = ec.gp.GPFunctionSet");
		writeln(".name = f" + popAppendix);
		writeln(".info = ec.gp.GPFuncInfo");
		writeln("", "\n# NIL");
		writeln("gp.fs." + subPopIndex + ".func." + (offset++), typePrefix + "NIL");
		writeln(".nc = ncNIL" + popAppendix);
		writeln("", "\n# ROOT");
		writeln("gp.fs." + subPopIndex + ".func." + (offset++), typePrefix + "ROOT");
		writeln(".nc = ncROOT" + popAppendix);

		writeln("", "\n# Instances Function Sets");
		offset = generateSubParameter.writeFunctionSets(offset, subPopIndex, typePrefix);
		
		writeln("", "\n# Container Function Sets");

		offset = generateSubParameter.writeContainerFunctionSets(offset, subPopIndex, typePrefix);
		
		writeln("", "gp.fs." + subPopIndex + ".size = " + offset);
		
		return 0;
	}
	
	
	/** writes YAMM Appendix ... see below
	 * @param layerFileName 
	 * @param modelCompilePath
	 * @param bestModelPath
	 * @param givenParameterString
	 */
	public void writeYAMMAppendix(String layerFileName, String modelCompilePath, String bestModelPath, String bestIndividuumPath, String givenParameterString) {
		if (layerFileName == null) 
			layerFileName = Common.convertWindowsPath(LayerView.getLayerFileName());
		
		writeln("","\n\n" + longParamsSep + "\n# YAMM Parameters\n" + longParamsSep);
		writeln("eval.problem.rmof.", "layersFile =" + layerFileName);
		int lastSeperator = layerFileName.lastIndexOf('/');
		if (lastSeperator > -1 && lastSeperator < layerFileName.length()) 
		{
			lastSeperator = layerFileName.substring(0,lastSeperator).lastIndexOf('/');
			if (lastSeperator > -1 && lastSeperator < layerFileName.length()) 	
				writeln("modelpath = " + layerFileName.subSequence(0, lastSeperator));
		}
		
		if (modelCompilePath == null) 
			modelCompilePath = Common.convertWindowsPath(Common.getPreferenceString(PreferenceConstants.P_COMPILEDCLASSES_PATH));
		writeln("compiledClasspath = " + Common.convertWindowsPath(modelCompilePath));
		
		if (bestModelPath == null)
			bestModelPath = Common.convertWindowsPath(Common.getPreferenceString(PreferenceConstants.P_GENERATEBESTMODELPATH));
		writeln("bestModelPath = " + bestModelPath);
		
		if (bestIndividuumPath == null)
			bestIndividuumPath = Common.convertWindowsPath(Common.getPreferenceString(PreferenceConstants.P_GENERATEBESTINDIVIDUUMPATH));
		writeln("bestIndividuum = " + bestIndividuumPath);
		
		// remove the paramspath parameter
		givenParameterString = givenParameterString.replaceAll(ParameterManagement.optParamsPath, "");
		
		writeln("parameter = " + givenParameterString);
	}

	
	public static void writeln(String prefix, String message) {
		printPrefix = prefix;
		writeln(message);
	}
	

	public static void writeln(String message) {
		if (printToConsole == true) {
			if (message != null)
				paramsLogger.info(printPrefix + message, false, false, true);
			else 
				paramsLogger.info("", false, false, true);
		} 
		if (printStream != null) {
			if (message != null)
				printStream.println(printPrefix + message);
			else
				printStream.println();
		}
	}

}
