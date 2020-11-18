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
package online.yamm;

import java.util.logging.Logger;

import org.apache.log4j.Level;

import online.yamm.init.Activator;
import online.yamm.logger.YAMMLogger;
import online.yamm.preferencePage.PreferenceConstants;

/**
 * Class to configure a simulation
 *
 */
public class ConfigurationManagement {

	private static YAMMLogger logger = YAMMLogger.getYAMMLogger("YAMM Log");
	private static String savePath = "file:/home/metamodell.ecore";
	private static boolean breakpoints = true;
	private static boolean graphicalLoading = false;
	private static boolean colorOnlyOne = false;
	private static Level loggingLevel = Level.INFO;
	private static boolean coloring = true;
	private static boolean uniqueIDs = true;
	private static boolean autoupload = false;
	private static Boolean isSeparateLoggingViewsForEachLayer = null;
	private static boolean allwaysCompile = false;

	public static boolean isAllwaysCompile() {
		return allwaysCompile;
	}

	public static void setAllwaysCompile(boolean allwaysCompile) {
		ConfigurationManagement.allwaysCompile = allwaysCompile;
	}

	public ConfigurationManagement() {
		logger.setLevel(getAndSetPreferencesLoggingLevel());
	}

	public static boolean isSeparateLoggingViewsForEachLayer () {
		if (isSeparateLoggingViewsForEachLayer == null) {
			if (Activator.getDefault() != null && Activator.getActionPreferenceStore() != null) {	
				if (Boolean.parseBoolean(Activator.getActionPreferenceStore().getString(PreferenceConstants.P_SEPARATE_LOGGING_VIEWS_FOR_EACH_LAYER))) {
					isSeparateLoggingViewsForEachLayer = true;
				} else {
					isSeparateLoggingViewsForEachLayer = false;
				}
			}
		}
		return isSeparateLoggingViewsForEachLayer;
	}
	
	public static void unsetSeparateLoggingViewsForEachLayer() {
		isSeparateLoggingViewsForEachLayer = null;
	}

	/**
	 * sets the logging level form the preferences
	 * 
	 * @return log-level
	 */
	public static Level getAndSetPreferencesLoggingLevel() {
		if (Activator.getDefault() != null && Activator.getActionPreferenceStore() != null) {
			String LoggingLevelString = Activator.getActionPreferenceStore().getString(PreferenceConstants.P_DEFAULT_LOG_LEVEL);
			if (LoggingLevelString.equals("trace")) {
				loggingLevel = Level.TRACE;
			} else if (LoggingLevelString.equals("all")) {
				loggingLevel = Level.ALL;
			} else if (LoggingLevelString.equals("debug")) {
				loggingLevel = Level.DEBUG;
			} else if (LoggingLevelString.equals("info")) {
				loggingLevel = Level.INFO;
			} else if (LoggingLevelString.equals("error")) {
				loggingLevel = Level.ERROR;
			} else if (LoggingLevelString.equals("off")) {
				loggingLevel = Level.OFF;
			} else {
				System.err.println("Unknown Default Logging Level from Preferences: \"" + LoggingLevelString + "\" (re-)setting to \"all\"");
				loggingLevel = Level.ALL;
			}
		}
		return loggingLevel;
	}

	public static boolean isAutoupload() {
		return autoupload;
	}

	public static void setAutoupload(boolean newAutoupload) {
		autoupload = newAutoupload;
	}

	public static boolean isUniqueIDs() {
		return uniqueIDs;
	}

	public static boolean isColoring() {
		return coloring;
	}

	public static void setColoring(boolean newColoring) {
		coloring = newColoring;
	}

	public static boolean isColorOnlyOne() {
		return colorOnlyOne;
	}

	public static void setColorOnlyOne(boolean newColorOnlyOne) {
		colorOnlyOne = newColorOnlyOne;
	}

	public static Level getLoggingLevel() {
		return loggingLevel;
	}

	public static void setLoggingOff() {
		setLoggingLevel(Level.OFF);
	}

	public static void setLoggingOn() {
		setLoggingLevel(Level.ALL);
	}


	public static void setLoggingLevel(Level newLoggingLevel) {
		loggingLevel = newLoggingLevel;
		logger.setLevel(loggingLevel);
	}

	public static boolean isGraphicalLoading() {
		return graphicalLoading;
	}

	public static void setGraphicalLoading(boolean newGraphicalLoading) {
		graphicalLoading = newGraphicalLoading;
	}

	public static String getSavePath() {
		return savePath;
	}

	public static boolean isBreakpoints() {
		return breakpoints;
	}

	public static void setBreakpoints(boolean newBreakpoints) {
		breakpoints = newBreakpoints;
	}
}
