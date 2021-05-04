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
package dev.yamm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import dev.yamm.coreModelXmi.yamm.YClass;
import dev.yamm.coreModelXmi.yamm.YElement;
import dev.yamm.coreModelXmi.yamm.YNamedElement;
import dev.yamm.coreModelXmi.yamm.YObject;
import dev.yamm.coreModelXmi.yamm.YPackage;
import dev.yamm.init.Activator;
import dev.yamm.logger.YAMMLogger;

/**
 * @author lobe
 *
 */

public class Common 
{

	public static YAMMLogger logger = YAMMLogger.getYAMMLogger("YAMM Log");

	private static HashMap<String, HashMap<String, HashMap<ArrayList<String>,ArrayList<EClass>>>> subClassesCache = new HashMap<String, HashMap<String, HashMap<ArrayList<String>,ArrayList<EClass>>>>();

	private static Long UUID = null;
	private static long firstUUID;
	private static Boolean semaphore = new Boolean(true);

	public static void uuid(long targetUUID)
	{
		synchronized (semaphore) 
		{
			if (UUID == null)
			{
				UUID = new Long(0);
				firstUUID = System.currentTimeMillis();
				System.out.println("UUID : " + UUID);
			}
			else if (UUID >= targetUUID)
			{
				System.out.println("UUID : " + ++UUID);
			}
			else
				System.out.println("UUID : " + ++UUID); 
//						+ TrackingCache.printTime(", time required so far : ", System.currentTimeMillis() - firstUUID)
//						+ TrackingCache.printTime(", time required for target UUID : " + targetUUID + " -> ", (long) ((float) (System.currentTimeMillis() - firstUUID) / UUID) * (targetUUID - UUID)));
		}
	}

	public static long getUUID()
	{
		synchronized (semaphore) 
		{
			if (UUID == null)
				UUID = new Long(0);
			return UUID;
		}
	}

	public static String convertWindowsPath(String path) 
	{
		if (path == null || path.isEmpty()) 
			return path;

		// something like C: ?
		if (path.length() > 1 && path.charAt(1) == ':') 
			path = path.substring(2);

		return path.replace('\\', '/');
	}


	public static boolean checkFile(String fileName, boolean checkAsDirectory, boolean checkIsWriteAble, String errorPrefix) {
		String errorMessage = null;

		if (fileName == null || fileName.isEmpty()) 
		{
			errorMessage = "file name is null or empty";
		} else {
			File file = new File(fileName);
			fileName = "\"" + fileName + "\"";
			if (errorMessage == null && file.exists()) {
				if (checkAsDirectory) {
					if (!file.isDirectory()) 
						errorMessage = fileName + " is not a directory!";
				} else {
					if (!file.isFile()) 
						errorMessage = fileName + " is not a file!";
				}
				if (checkIsWriteAble && !file.canWrite()) 
					errorMessage = fileName + " is not writeable!";
			} else {
				errorMessage = fileName + " does not exist!";
			}
		}

		if (errorMessage != null) {
			printMessage(errorPrefix + " " + errorMessage, DUMPMESSAGETO.ERROR);
			return false;
		} else {
			return true;
		}

	}


	public static void printMessage(String message, DUMPMESSAGETO dumpErrorTo) {
		if (message != null) {
			switch (dumpErrorTo) {
			case INFO:
				logger.info(message, false, false, false);
				break;
			case ERROR:
				logger.error(message, false, false, false);
				break;
			}
		}
	}

	public static void printlnMessage(String message, DUMPMESSAGETO dumpErrorTo) {
		printlnMessage(message, dumpErrorTo, false, false);
	}

	public static void printlnMessage(String message, DUMPMESSAGETO logLevel, boolean printNumber, boolean printTime) {
		if (message != null) {
			switch (logLevel) {
			case INFO:
				logger.info(message, printNumber, printTime, true);
				break;
			case ERROR:
				logger.error(message, printNumber, printTime, true);
				break;
			}
		}
	}

	public static File getFile(String fileName) {
		File file = new File(fileName);
		if (file.exists()) {
			return file;
		}
		return null;
	}

	public static File findNotExistingFile(String directoryForECJFiles, String targetFilePrefix, String targetFileSuffix) {
		Integer fileCounter = 0;
		if (checkFile(directoryForECJFiles, true, true, "")) {
			File file = new File(directoryForECJFiles + File.separatorChar + targetFilePrefix + targetFileSuffix);
			while (file.exists() && fileCounter < 1000) {
				file = new File(directoryForECJFiles + File.separatorChar + targetFilePrefix + fileCounter.toString() + targetFileSuffix);
				fileCounter++;
			}
			if (fileCounter < 1000) {
				return file;
			}
		}
		return null;
	}

	public static boolean copyFileChar(File source, File target) {
		FileReader in;
		try {
			in = new FileReader(source);
		} catch (FileNotFoundException e1) {
			return false;
		}
		FileWriter out;
		int character;
		try {
			out = new FileWriter(target);
			while ((character = in.read()) != -1)
				out.write(character);
			in.close();
			out.close();
		} catch (IOException e) {
			return false;
		}
		return true;
	}

	public static boolean copyFileStream(File source, File target)
	{
		InputStream inStream = null;
		OutputStream outStream = null;

		try
		{
			inStream = new FileInputStream(source);
			outStream = new FileOutputStream(target);
			byte[] buffer = new byte[1024];
			int length;

			//copy the file content in bytes 
			while ((length = inStream.read(buffer)) > 0)
				outStream.write(buffer, 0, length);

			inStream.close();
			outStream.close();

			return true;
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

		return false;
	}


	public static void copyAndParseModelFile(File source, File target, String previousNSURI, String newNSURI, boolean umaFile, String extension) throws Exception
	{
		if (target.exists())
			target.delete();//return;
		
		System.out.println("Model file " + target + " created.");

		Scanner lineReader = new Scanner(source);
		FileWriter out = new FileWriter(target);	

		boolean nsURIChanged = false;
		String line;
		int position;

		while (lineReader.hasNextLine())
		{
			line=lineReader.nextLine();
			line = line.replace("yammDiagram:", extension + ":");
			if (!nsURIChanged) 
			{
				if (line.contains(previousNSURI)) 
				{
					line = line.replace(previousNSURI, newNSURI);
					nsURIChanged = true;
				}
			} 
			else if (umaFile) 
			{
				position = line.indexOf('<');
				if (position > -1) 
				{
					if (position + 1 < line.length() && line.charAt(position + 1) == '/')
						position++;
					
					line = line.substring(0, position + 1)
							+ line.substring(position + 1, position + 2).toLowerCase() 
							+ line.substring(position + 2, line.length());
				} 
			}

			out.write(line + "\n");
		}	
		out.close();
	}
	
	public static void copyAndParseModelFileXTEXT(File file, String previousNSURI, String newNSURI, boolean umaFile) throws Exception
	{
		
		BufferedReader reader = new BufferedReader(new FileReader(file));
		boolean nsURIChanged = false;
		String line;
		int position;

		String output = ""; 
		while ((line = reader.readLine()) != null)
		{
			
			if (!nsURIChanged) 
			{
				if (line.contains(previousNSURI)) 
				{
					line = line.replace(previousNSURI, newNSURI);
					nsURIChanged = true;
					output += line + "\n";
				}
				else 
					output += line + "\n";
			} else
				output += line + "\n";
		}	
        
        FileWriter writer = new FileWriter(file.getAbsoluteFile());
        writer.write(output);writer.close();
	}

	public static String rmWSAQM(String input) {
		return rmChars(input, new char[] {'\r', '\n', '\t'});
	}

	/**
	 * removes white spaces (before, after, more than two), question marks (if no '=' has been seen before), carriage returns or line feeds and tabs
	 * @param input - string to be modified
	 * @return modified string
	 */
	public static String rmChars(String input, char[] characterToBeRemoved) {
		//System.out.println("\nInput : " + input);
		if (input != null && input.length() > 0) {
			char[] inputInChars = input.toCharArray();
			String outputString = "";
			int inputIndex = 0;
			boolean previousCharacterWasAWhiteSpace = false;
			boolean equalsSeen = false;
			// remove prefixed whitespaces
			while (inputInChars[inputIndex] == ' ') {
				inputIndex++;
				previousCharacterWasAWhiteSpace = true;
				if (inputIndex >= inputInChars.length) {
					return "";
				}
			}
			while (inputIndex < inputInChars.length) {
				// copy the middle part - if not return, tabbing or two whitespaces
				if (!compare(inputInChars[inputIndex], characterToBeRemoved)
						|| previousCharacterWasAWhiteSpace && inputInChars[inputIndex] != ' ') {
					if (inputInChars[inputIndex] == ' ') {
						previousCharacterWasAWhiteSpace = true;
					} else if (inputInChars[inputIndex] == '=') {
						equalsSeen = true;
					} else if (inputInChars[inputIndex] == '?' && !equalsSeen) {
						inputIndex++;
						continue;
					} else if (inputInChars[inputIndex] == ';') {
						equalsSeen = false;
					}
					previousCharacterWasAWhiteSpace = false;
					outputString += inputInChars[inputIndex];
				}
				inputIndex++;
			}
			// remove suffix whitespace
			if (previousCharacterWasAWhiteSpace) {
				return outputString.substring(0, outputString.length()-1);
			} 
			//System.out.println("Output : " + outputString + "\n");
			return outputString;

		}
		return "";
	}

	private static boolean compare(char c, char[] charactersToCompare) {
		for (char cc : charactersToCompare) {
			if (c == cc) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Checks if method name is valid
	 * @param methodName
	 * @return valid method name
	 */
	public static String validMethodName(String methodName) {
		final int methodLength = methodName.length();
		assert methodName != null && methodLength != 0 : "MethodName is null or empty!";
		for(int i = 0; i < methodLength; i++) {
			char toBeChecked = methodName.charAt(i);
			if(i==0) {
				assert validCharacterOfClassElement(true, toBeChecked) : "Character in methodName is invalid : " + toBeChecked;
			} else {
				assert validCharacterOfClassElement(false, toBeChecked) : "Character in methodName is invalid : " + toBeChecked;
			}
		}
		return methodName;
	}


	public static boolean isNumber(char[] number) {
		if (number.length == 0)
			return false;

		boolean dotSeen = false;
		int i;

		if (number[0] == '0') {
			if (number.length > 2 && number[1] == '.') {
				dotSeen = true;
				i = 2;
			} else {
				return false;
			}
		} else 
			i = 0;

		for (;i<number.length;i++) {
			if (number[i] < '0' || number[i] > '9') {
				if (!dotSeen && number[i]=='.') 
					dotSeen = true;
				else 
					return false;
			}
		}

		return true;
	}


	/**
	 * Checks if a character of a class element is valid
	 * class element, can be variable, method name, class name,...  
	 * @param isInitialCharacter
	 * @param toBeChecked
	 * @return
	 */
	public static boolean validCharacterOfClassElement(boolean isInitialCharacter, char toBeChecked) {
		if (toBeChecked >= 'A' && toBeChecked <= 'Z' 
				|| toBeChecked >= 'a' && toBeChecked <= 'z') {
			return true;
		}
		if(!isInitialCharacter && ((toBeChecked >= '0' && toBeChecked <= '9') || toBeChecked == '_')) {
			return true;
		}
		return false;
	}

	/**
	 * prints (on debug level) two objects, preceded with a message
	 * @param message (preceding)
	 * @param object
	 * @param containingObject
	 */
	public static void printDebugLogEntryWithObjectAndContainingObject(YAMMLogger logger, String preMessage, Object object, Object containingObject, String postMessage) {

		String message = object != null ? object.toString().replace("?","") : "";

		if (preMessage != null) {
			message = preMessage.concat(" ").concat(message);
		} 

		if (object != null) {
			if (object instanceof YNamedElement) {
				message = message.concat(" \"").concat(rmWSAQM(((YNamedElement) object).getName())).concat("\"");
			}
			if (object instanceof YObject) {
				message = message.concat(" (ObjectID: ").concat(rmWSAQM(((YObject) object).getObjectID()).concat(")"));
			}
			if (object instanceof YNamedElement || object instanceof YObject) {
				message = message.concat(" in ");
			}
		}

		if (containingObject != null) {
			message = message.concat(Common.rmWSAQM(containingObject.toString()));
			if (containingObject instanceof YNamedElement) {
				message = message.concat(" \"").concat(rmWSAQM(((YNamedElement) containingObject).getName()).concat("\""));
			}
			if (containingObject instanceof YElement) {
				message = message.concat(" (ObjectID: ").concat(rmWSAQM(((YObject) containingObject).getObjectID()).concat(")"));
			}
		}

		if (preMessage != null) {
			message = message.concat(" ").concat(postMessage).concat(".");
		}

		logger.debug(message);
	}

	public static String mapSimpleType(String simpleType, boolean returnGivenTypeWhenNotMapped) {
		if (simpleType != null) {
			if (simpleType.equals("EBoolean") || simpleType.equals("boolean") 
					|| simpleType.equals("Boolean") || simpleType.equals("java.lang.Boolean")) {
				return "Boolean";
			} else if (simpleType.equals("EInt") || simpleType.equals("int") 
					|| simpleType.equals("Integer") || simpleType.equals("java.lang.Integer")) {
				return "Integer";
			} else if (simpleType.equals("EFloat") || simpleType.equals("float") 
					|| simpleType.equals("Float") || simpleType.equals("java.lang.Float")) {
				return "Float";
			} else if (simpleType.equals("EDouble") || simpleType.equals("double") 
					|| simpleType.equals("Double") || simpleType.equals("java.lang.Double")) {
				return "Double";
			} else if (simpleType.equals("ELong") || simpleType.equals("long") 
					|| simpleType.equals("Long") || simpleType.equals("java.lang.Long")) {
				return "Long";
			} else if (simpleType.equals("LargeInteger") || simpleType.equals("Rational") 
					|| simpleType.equals("Real")){
				return simpleType;
			} else if (simpleType.equals("EString") || simpleType.equals("string") 
					|| simpleType.equals("String") || simpleType.equals("java.lang.String")) {
				return "String";
			} else if (simpleType.equals("Object") || simpleType.equals("java.lang.Object")) {
				return "Object";
			} 
		}
		if (returnGivenTypeWhenNotMapped)
			return simpleType;
		else 
			return null;
	}

	public static Class mapSimpleTypeToClass(String simpleType) {
		if (simpleType != null) {
			if (simpleType.equals("EBoolean") || simpleType.equals("boolean") 
					|| simpleType.equals("Boolean") || simpleType.equals("java.lang.Boolean")) {
				return boolean.class;	
			} else if (simpleType.equals("EByte") || simpleType.equals("byte") 
					|| simpleType.equals("Byte") || simpleType.equals("java.lang.Byte")) {
				return byte.class;
			} else if (simpleType.equals("EShort") || simpleType.equals("short") 
					|| simpleType.equals("Short") || simpleType.equals("java.lang.Short")) {
				return short.class;
			} else if (simpleType.equals("EInt") || simpleType.equals("int") 
					|| simpleType.equals("Integer") || simpleType.equals("java.lang.Integer")) {
				return int.class;
			} else if (simpleType.equals("ELong") || simpleType.equals("long") 
					|| simpleType.equals("Long") || simpleType.equals("java.lang.Long")) {
				return long.class;
			} else if (simpleType.equals("EFloat") || simpleType.equals("float") 
					|| simpleType.equals("Float") || simpleType.equals("java.lang.Float")) {
				return float.class;
			} else if (simpleType.equals("EDouble") || simpleType.equals("double") 
					|| simpleType.equals("Double") || simpleType.equals("java.lang.Double")) {
				return double.class;
			} else if (simpleType.equals("ELong") || simpleType.equals("long") 
					|| simpleType.equals("Long") || simpleType.equals("java.lang.Long")) {
				return long.class;
			} else if (simpleType.equals("LargeInteger") || simpleType.equals("Rational") || simpleType.equals("Real")) {
				return null;
			} else if (simpleType.equals("EString") || simpleType.equals("string") 
					|| simpleType.equals("String") || simpleType.equals("java.lang.String")) {
				return String.class;
			} else if (simpleType.equals("Object") || simpleType.equals("java.lang.Object")) {
				return null;
			} 
		}
		return null;
	}

	public static <T> ArrayList<T> resetCollection(ArrayList<T> c) {
		if (c == null) 
			c = new ArrayList<T>();
		else
			c.clear();
		return c;
	}

	/** avoid list redundancies 
	 * @param 	list
	 * @param 	newElement
	 * @return 	true - if the element is new (and introduced), false else
	 */
	public static <T> boolean addUniqueElementToList(ArrayList<T> list, T newElement) 
	{
		if (!list.contains(newElement)) { 
			list.add(newElement);
			return true;
		}
		return false;
	}

	

	public static <T> void addUniqueElementsToList(ArrayList<T> list, ArrayList<T> newElements) {
		for (T newElement : newElements) {
			addUniqueElementToList(list, newElement);
		}
	}

	public static String cutStringNChars(String input, char character, int times, boolean onFailClearOutput, String onSuccessAppend) {
		int charIndex;
		String output = input;

		for (int i = 0; i < times; i++) {
			charIndex = output.lastIndexOf(character);
			if (charIndex > -1) {
				output = output.substring(0, charIndex);
			} else {
				if (onFailClearOutput)
					return "";
				else
					return input;
			}
		}

		return output + onSuccessAppend;
	}

	public static ArrayList<EClass> determineSubClasses(EClass eClass, ArrayList<EClass> subEClasses, ArrayList<String> allowedSubClasses) {
		//		System.out.println(eClass);
		//		System.out.println(eClass.getEPackage().getNsURI());

		// use cache if possible		
		HashMap<String, HashMap<ArrayList<String>, ArrayList<EClass>>> classCache = subClassesCache.get(eClass.getEPackage().getNsURI());
		HashMap<ArrayList<String>, ArrayList<EClass>> allowedSubClassesCache = null;

		if (classCache != null) {
			allowedSubClassesCache = classCache.get(eClass.getName());
			if (allowedSubClassesCache != null) {
				subEClasses = allowedSubClassesCache.get(allowedSubClasses);
				if (subEClasses != null) {
					return subEClasses;
				} else {
					subEClasses = determineSubClasses2(eClass, new ArrayList<EClass>(), allowedSubClasses);
					allowedSubClassesCache.put(allowedSubClasses, subEClasses);
				}
			} else {
				allowedSubClassesCache = new HashMap<ArrayList<String>, ArrayList<EClass>>();
				subEClasses = determineSubClasses2(eClass, subEClasses, allowedSubClasses);
				allowedSubClassesCache.put(allowedSubClasses, subEClasses);
				classCache.put(eClass.getName(), allowedSubClassesCache);
			}
		} else {
			classCache = new HashMap<String, HashMap<ArrayList<String>, ArrayList<EClass>>>();
			allowedSubClassesCache = new HashMap<ArrayList<String>, ArrayList<EClass>>();
			subEClasses = determineSubClasses2(eClass, subEClasses, allowedSubClasses);
			allowedSubClassesCache.put(allowedSubClasses, subEClasses);
			classCache.put(eClass.getName(), allowedSubClassesCache);
			subClassesCache.put(eClass.getEPackage().getNsURI(), classCache);
		}
		if (subEClasses == null)
			System.out.println("HUCH");

		return subEClasses;
	}


	/**
	 * @param eClass
	 * @param subEClasses
	 * @param allowedSubClasses
	 * @return
	 */
	private static ArrayList<EClass> determineSubClasses2(EClass eClass, ArrayList<EClass> subEClasses, ArrayList<String> allowedSubClasses) {
		EClass potentialSubEClass = null;
		for (EClassifier potentialSubEClassifier : eClass.getEPackage().getEClassifiers()) {
			if (potentialSubEClassifier instanceof EClass) {
				potentialSubEClass = (EClass) potentialSubEClassifier;
				if (potentialSubEClass.getESuperTypes().contains(eClass)) {
					if (!potentialSubEClass.isAbstract() && allowedSubClasses.size() == 0 || allowedSubClasses.contains(potentialSubEClass.getName())) {
						subEClasses.add(potentialSubEClass);
					}
					subEClasses = determineSubClasses2(potentialSubEClass, subEClasses, allowedSubClasses);
				}
			}
		}
		return subEClasses;
	}

	public static String getPreferenceString(String key) {
		if (Activator.getActionPreferenceStore() != null) {
			return Activator.getActionPreferenceStore().getString(key);
		}
		return null;
	}

	public static Boolean getPreferenceBoolean(String key) {
		try {
			return Boolean.parseBoolean(getPreferenceString(key));
		} catch (NumberFormatException e) {
			return null;
		}
	}

	public static Boolean getPreferenceBoolean(String key, boolean defaultValue) {
		Boolean returnValue = getPreferenceBoolean(key);
		if (returnValue == null) 
			return defaultValue;
		else
			return returnValue;
	}

	public static boolean isSimpleEType(String ecoreType) 
	{		
		if ( ecoreType.equals("EBoolean") 
				|| ecoreType.equals("EByte")
				|| ecoreType.equals("EShort") 
				|| ecoreType.equals("EInt") 
				|| ecoreType.equals("ELong") 
				|| ecoreType.equals("EFloat") 
				|| ecoreType.equals("EDouble") 
				|| ecoreType.equals("String") || ecoreType.equals("EString")) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean determineTypeOfCollection(Class a, List c) {
		if (c.size() > 0 && a.isInstance(c.get(0))) 
			return true;
		return false;
	}

	public static Object determineObjectOfString(String value) {
		try {
			return new Integer(Integer.parseInt(value)); 
		} catch (NumberFormatException e) {	}
		try {
			return new Float(Float.parseFloat(value)); 
		} catch (NumberFormatException e) {	}
		try {
			return new Double(Double.parseDouble(value)); 
		} catch (NumberFormatException e) {	}
		if (value.equals("true") || value.equals("TRUE"))
			return new Boolean(true);
		if (value.equals("false") || value.equals("FALSE"))
			return new Boolean(false);
		if (value.startsWith("\"") && value.endsWith("\"")) {
			return value.substring(1, value.length()-1);
		}

		return value;
	}

	public static void protocol(String fileName, String data)
	{	
		BufferedWriter out = null;
		try {
			out = new BufferedWriter(new FileWriter(fileName, false));
			out.write(data);
			out.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	public static String getQualifiedNameYClass(YClass yClass)
	{
		String qualifiedName = yClass.getName();
		YPackage pack = (YPackage) yClass.getPackage();

		if (pack == null)
			return qualifiedName;

		qualifiedName = pack.getName() + "." + qualifiedName;

		while ((pack = pack.getPackage()) != null)
		{
			qualifiedName = pack.getName() + "." + qualifiedName;
		}
		return qualifiedName;
	}
	
	public static String getQualifiedName(EObject yClass)
	{
		String qualifiedName = (String) yClass.eGet(yClass.eClass().getEStructuralFeature("name"));
		EObject container = yClass;
		while ((container = container.eContainer()).eContainer() != null)
		{
			qualifiedName = container.eGet(container.eClass().getEStructuralFeature("name")) + "." + qualifiedName;
		}
		return qualifiedName;
	}
		
	public static String getQualifiedNameEObject(EObject object)
	{
		String qualifiedName = object.eClass().getName();
		EPackage pack = object.eClass().getEPackage();

		while (pack.getESuperPackage() != null) {
			qualifiedName = pack.getName() + "." + qualifiedName;
			pack = pack.getESuperPackage();
		}
		return qualifiedName;
	}
	
	public static String getQualifiedNameEObject(EClassifier eclass)
	{
		String qualifiedName = eclass.getName();
		EPackage pack = eclass.getEPackage();

		while (pack.getESuperPackage() != null) {
			qualifiedName = pack.getName() + "." + qualifiedName;
			pack = pack.getESuperPackage();
		}
		return qualifiedName;
	}

}
