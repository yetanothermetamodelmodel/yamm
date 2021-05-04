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
package dev.yamm.logger;

import java.util.HashMap;

import org.apache.log4j.Logger;
import org.apache.log4j.Level;
import org.apache.log4j.Priority;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;

import dev.yamm.ConfigurationManagement;
import dev.yamm.init.Activator;
import dev.yamm.preferencePage.PreferenceConstants;


/**
 * @author Ralf Buschermoehle
 *
 */
public class YAMMLogger extends Logger {

	private static YAMMLoggerFactory YAMMFactory = null;
	private MessageConsole yammConsole = null;
	private static Long logEntryList = null;
	private Long logEntryListLocal = null;
	private static Long timeOffsetInMs = null;
	private static Long time = null;
	private static HashMap<org.apache.log4j.Level, Color> logLevelToColor = new HashMap<org.apache.log4j.Level, Color>();

	/**
	 * A getter for a {@code #MessageConsole} object.
	 * 
	 * @return yammConsole - the MessageConsole object.
	 */
	public MessageConsole getYAMMConsole() {
		return yammConsole;
	}

	
	public static void reset() {
		logEntryList = 0L;
		timeOffsetInMs = new Long(System.currentTimeMillis());
		logLevelToColor.clear(); // TODO warum clear()?
		ConfigurationManagement.unsetSeparateLoggingViewsForEachLayer();
	}

	public void resetLocal() {
		logEntryListLocal = 0L;
	}

	public YAMMLogger(String name) {
		super(name);
		checkNulls();
		ConsolePlugin plugin = ConsolePlugin.getDefault();
		if (plugin != null) {
			IConsoleManager consoleManager = plugin.getConsoleManager();
			IConsole[] existingConsoles = consoleManager.getConsoles();
			for (IConsole console : existingConsoles) {
				if (name.equals(console.getName())) {
					yammConsole = (MessageConsole) console;
				}
			}
			if (yammConsole == null) {
				yammConsole = new MessageConsole(name, null);
				consoleManager.addConsoles(new IConsole[]{yammConsole});
			}
		}
		logEntryListLocal = 0L;
	}

	private static void checkNulls() {
		if (YAMMFactory == null) 
			YAMMFactory = new YAMMLoggerFactory();
		if (logEntryList == null)
			logEntryList = new Long(0L);
		if (timeOffsetInMs == null)
			timeOffsetInMs = new Long(System.currentTimeMillis());
		if (time == null) 
			time = new Long(0L);
	}

	public static YAMMLogger getYAMMLogger(String name) {
		checkNulls();
		return (YAMMLogger) Logger.getLogger(name, YAMMFactory);
	}

	/**
	 * Gets the color for the log message to print (depending on the defined log level).
	 * If there is no color specified in {@link #logLevelToColor}, it gets default
	 * color values: This can be a default value defined by the user (color preferences)
	 * or (if there is no definition) the standard default value.
	 * 
	 * @param level	:	the log level
	 * @return	the color associated with the level
	 */
	private Color getPrefColor(org.apache.log4j.Level level) 
	{

		if (logLevelToColor.containsKey(level)) 
		{
			return logLevelToColor.get(level);
		}

		Color defaultColor = setDefaultColor(level);
		String prefColorString = null;
		if (Activator.getActionPreferenceStore() != null) 
		{
			if (level == Level.INFO) 
			{
				prefColorString = new String(PreferenceConstants.P_COLORINFO);
			}
			else if (level == Level.ERROR)
			{
				prefColorString = new String(PreferenceConstants.P_COLORERROR);
			} 
			else if (level == Level.DEBUG)
			{
				prefColorString = new String(PreferenceConstants.P_COLORDEBUG);
			} 
			else if (level == Level.TRACE) 
			{
				prefColorString = new String(PreferenceConstants.P_COLORTRACE);
			} 
			else
			{
				System.err.println("Unknown Log Level -> Coloring for Level: " + level);
				return new Color(null, 0, 0, 0);
			}

			String colorString = Activator.getActionPreferenceStore().getString(prefColorString);
			
			if (colorString.isEmpty()) 
			{
				logLevelToColor.put(level, defaultColor);
				return defaultColor;
			}
			Color color = parseColorStringToIntValue(colorString, defaultColor, 
					"\"-> Setting Default Color for Level: ".concat(level.toString()));
			logLevelToColor.put(level, color);
			return color;
		} 
		else 
		{
			logLevelToColor.put(level, defaultColor);
			return defaultColor;
		}
	}

	/**
	 * Substrings and parses a String object into Integer objects, so that it can be processed 
	 * as RGB values by a new generated {@code Color} object. 
	 * If there is no appropriate String object a default Color object will be returned.
	 * 
	 * @param colorString	:	the String specifying the RGB values
	 * @param defaultColor	:	the color to use in case of an empty {@code colorString}
	 * @param logEntry		: 	a log message to print
	 * @return {@code Color} - the Color object (if {@code colorString} is not an empty String) /
	 * 			{@code defaultColor} otherwise
	 */
	public static Color parseColorStringToIntValue(String colorString, Color defaultColor, String logEntry) {
		String colorStringComplete = new String(colorString);
		int comma = 0;
		Integer[] RGB = new Integer[3];

		for (int i = 0; i < 3 ; i++) {
			comma = (i < 2) ? colorString.indexOf(",") : colorString.length();
			if (comma == -1) { 
				System.err.println("Color Parsing Error \"".concat(colorStringComplete).concat(logEntry));
				return defaultColor;
			}	
			try {
				RGB[i] = (i < 2) ? Integer.parseInt(colorString.substring(0, comma)) : Integer.parseInt(colorString);
			} catch (NumberFormatException e) {
				System.err.println("Color Parsing Error \"".concat(colorStringComplete).concat(logEntry));
				e.printStackTrace();
				return defaultColor;
			}
			if (i < 2)
				colorString = colorString.substring(comma+1,colorString.length());				
		}
		return new Color(null, RGB[0], RGB[1], RGB [2] );
	}

	/**
	 * Sets the associated default color for the logging level.
	 * 
	 * @param level	:	The specified log level
	 * @return Color - the color object.
	 */
	private Color setDefaultColor(org.apache.log4j.Level level) {
		if (level == Level.INFO) {
			return new Color(null, 0, 255, 0);
		} else if (level == Level.ERROR) {
			return new Color(null, 255, 0, 100);				
		} else if (level == Level.TRACE) {
			return new Color(null, 0, 0, 255);				
		} else if (level == Level.DEBUG) {
			return new Color(null, 255, 0, 0);				
		} else {
			System.err.println("Unknown Log Level -> Coloring for Level: " + level);
			return new Color(null, 0, 0, 0);
		}
	}

	/**
	 * Invokes {@link #trace(Object, boolean, boolean)}.
	 */
	@Override
	public void trace(Object message) {
		trace(message, true, true);
	}

	/**
	 * Prepares log message printing for logging level TRACE: checks whether a 
	 * {@code MessageConsole} object is available.
	 * Sets the color of the message and calls  {@link #printlnMessage(String, Object,
	 * MessageConsoleStream, Color, boolean, boolean, boolean)}.
	 * 
	 * @param message		:	the message to print
	 * @param printLogNumber:	print log number?
	 * @param printLogTime	:	print log time?
	 */
	public void trace(Object message, final boolean printLogNumber, final boolean printLogTime) {  		
		if (yammConsole == null) {
			if (repository.isDisabled(Level.TRACE_INT))
				return;
			if (Level.TRACE.isGreaterOrEqual(this.getEffectiveLevel())) {
				forcedLog(Level.class.getName(), Level.TRACE, message, null);
			}
		} else {
			if (Level.TRACE.isGreaterOrEqual(this.getEffectiveLevel())) {
				printlnMessage("trace ",message, yammConsole.newMessageStream(), getPrefColor(Level.TRACE), printLogNumber, printLogTime, true);
			}
		}
	}

	/**
	 * Nearly identical to {@link #trace(Object, boolean, boolean)} with the exception that it accepts
	 * a fourth parameter {@code println} in case the log message shall not terminate with a new line 
	 * automatically.  
	 * 
	 * @param message		:	the message to print
	 * @param printLogNumber:	print log number?
	 * @param printLogTime	:	print log time?
	 * @param println		:	terminate with new line?
	 */
	public void trace(Object message, final boolean printLogNumber, final boolean printLogTime, boolean println) {  		
		if (yammConsole == null) {
			if (repository.isDisabled(Level.TRACE_INT))
				return;
			if (Level.TRACE.isGreaterOrEqual(this.getEffectiveLevel())) {
				forcedLog(Level.class.getName(), Level.TRACE, message, null);
			}
		} else {
			if (Level.TRACE.isGreaterOrEqual(this.getEffectiveLevel())) {
				printlnMessage("trace ",message, yammConsole.newMessageStream(), getPrefColor(Level.TRACE), printLogNumber, printLogTime, println);
			}
		}
	}

	/**
	 * Invokes {@link #info(Object, boolean, boolean)}.
	 */
	@Override
	public void info(Object message) {
		info(message, true, true);
	}

	/**
	 * Prepares log message printing for logging level INFO: checks whether
	 * a {@code MessageConsole} object is available.
	 * Sets the color of the message and calls  {@link #printlnMessage(String, Object,
	 * MessageConsoleStream, Color, boolean, boolean, boolean)}.
	 * 
	 * @param message		:	the message to print
	 * @param printLogNumber:	print log number?
	 * @param printLogTime	:	print log time?
	 */
	public void info(Object message, final boolean printLogNumber, final boolean printLogTime) {  		
		if (yammConsole == null) {
			if (repository.isDisabled(Priority.INFO_INT))
				return;
			if (Level.INFO.isGreaterOrEqual(this.getEffectiveLevel())) {
				System.out.println(message);
				//forcedLog(Level.class.getName(), Level.INFO, message, null);
			}
		} else {
			if (Level.INFO.isGreaterOrEqual(this.getEffectiveLevel())) {
				printlnMessage("info ",message, yammConsole.newMessageStream(), getPrefColor(Level.INFO), printLogNumber, printLogTime, true);
			}
		}
	}

	/**
	 * Nearly identical to {@link #info(Object, boolean, boolean)} with the exception that it accepts
	 * a fourth parameter {@code println} in case the log message shall not terminate with a new line 
	 * automatically.  
	 * 
	 * @param message		:	the message to print
	 * @param printLogNumber:	print log number?
	 * @param printLogTime	:	print log time?
	 * @param println		:	terminate with new line?
	 */
	public void info(Object message, final boolean printLogNumber, final boolean printLogTime, boolean println) {  		
		if (yammConsole == null) {
			if (repository.isDisabled(Priority.INFO_INT))
				return;
			if (Level.INFO.isGreaterOrEqual(this.getEffectiveLevel())) {
				System.out.println(message);
				//forcedLog(Level.class.getName(), Level.INFO, message, null);
			}
		} else {
			if (Level.INFO.isGreaterOrEqual(this.getEffectiveLevel())) {
				printlnMessage("info ",message, yammConsole.newMessageStream(), getPrefColor(Level.INFO), printLogNumber, printLogTime, println);
			}
		}
	}

	/**
	 * Invokes {@link #debug(Object, boolean, boolean)}.
	 */
	@Override
	public void debug(Object message) {
		debug(message, true, true);
	}

	/**
	 * Prepares log message printing for logging level DEBUG: checks whether
	 * a {@code MessageConsole} object is available.
	 * Sets the color of the message and calls  {@link #printlnMessage(String, Object,
	 * MessageConsoleStream, Color, boolean, boolean, boolean)}.
	 * 
	 * @param message		:	the message to print
	 * @param printLogNumber:	print log number?
	 * @param printLogTime	:	print log time?
	 */
	public void debug(Object message, final boolean printLogNumber, final boolean printLogTime) {  		
		if (yammConsole == null) {
			if (repository.isDisabled(Priority.DEBUG_INT))
				return;
			if (Level.DEBUG.isGreaterOrEqual(this.getEffectiveLevel())) {
				System.out.println(message);
				//forcedLog(Level.class.getName(), Level.DEBUG, message, null);
			}
		} else {
			if (Level.DEBUG.isGreaterOrEqual(this.getEffectiveLevel())) {
				printlnMessage("debug ",message, yammConsole.newMessageStream(), getPrefColor(Level.DEBUG), printLogNumber, printLogTime, true);
			}
		}
	}

	/**
	 * Nearly identical to {@link #debug(Object, boolean, boolean)} with the exception that it accepts
	 * a fourth parameter {@code println} in case the log message shall not terminate with a new line 
	 * automatically.  
	 * 
	 * @param message		:	the message to print
	 * @param printLogNumber:	print log number?
	 * @param printLogTime	:	print log time?
	 * @param println		:	terminate with new line?
	 */
	public void debug(Object message, final boolean printLogNumber, final boolean printLogTime, boolean println) {  		
		if (yammConsole == null) {
			if (repository.isDisabled(Priority.DEBUG_INT))
				return;
			if (Level.DEBUG.isGreaterOrEqual(this.getEffectiveLevel())) {
				System.out.println(message);
				//forcedLog(Level.class.getName(), Level.DEBUG, message, null);
			}
		} else {
			if (Level.DEBUG.isGreaterOrEqual(this.getEffectiveLevel())) {
				printlnMessage("debug ",message, yammConsole.newMessageStream(), getPrefColor(Level.DEBUG), printLogNumber, printLogTime, println);
			}
		}
	}

	/**
	 * Invokes {@link #error(Object, boolean, boolean)}.
	 */
	@Override
	public void error(Object message) {
		error(message, true, true);
	}

	/**
	 * Prepares log message printing for logging level ERROR: checks whether
	 * a {@code MessageConsole} object is available.
	 * Sets the color of the message and calls  {@link #printlnMessage(String, Object,
	 * MessageConsoleStream, Color, boolean, boolean, boolean)}.
	 * 
	 * @param message		:	the message to print
	 * @param printLogNumber:	print log number?
	 * @param printLogTime	:	print log time?
	 */
	public void error(Object message, final boolean printLogNumber, final boolean printLogTime) {  		
		if (yammConsole == null) {
			if (repository.isDisabled(Priority.ERROR_INT))
				return;
			if (Level.ERROR.isGreaterOrEqual(this.getEffectiveLevel())) {
				//forcedLog(Level.class.getName(), Level.ERROR, message, null);
				System.err.println(message);
			}
		} else {
			if (Level.ERROR.isGreaterOrEqual(this.getEffectiveLevel())) {
				printlnMessage("error ",message, yammConsole.newMessageStream(), getPrefColor(Level.ERROR), printLogNumber, printLogTime, true);
			}
		}
	}

	
	/**
	 * Nearly identical to {@link #error(Object, boolean, boolean)} with the exception that it accepts
	 * a fourth parameter {@code println} in case the log message shall not terminate with a new line 
	 * automatically.  
	 * 
	 * @param message		:	the message to print
	 * @param printLogNumber:	print log number?
	 * @param printLogTime	:	print log time?
	 * @param println		:	terminate with new line?
	 */
	public void error(Object message, final boolean printLogNumber, final boolean printLogTime, boolean println) {  		
		if (yammConsole == null) {
			if (repository.isDisabled(Priority.ERROR_INT))
				return;
			if (Level.ERROR.isGreaterOrEqual(this.getEffectiveLevel())) {
				System.err.println(message);
				//forcedLog(Level.class.getName(), Level.ERROR, message, null);
			}
		} else {
			if (Level.ERROR.isGreaterOrEqual(this.getEffectiveLevel())) {
				printlnMessage("error ",message, yammConsole.newMessageStream(), getPrefColor(Level.ERROR), printLogNumber, printLogTime, println);
			}
		}
	}

	/**
	 * Prints a log message into the console. If indicated, the log time and number are considered.
	 *  
	 * @param logClass		:	the defined log level
	 * @param message		:	message to print	
	 * @param out			:	{@code #MessageConsoleStream} object
	 * @param color			:	color of the message
	 * @param printLogNumber:	print log number?
	 * @param printLogTime	:	print log time?
	 * @param println		: 	terminate with new line?
	 */
	private void printlnMessage(final String logClass, final Object message, 
			final MessageConsoleStream out, final Color color, final boolean printLogNumber, 
			final boolean printLogTime, final boolean println) {
		if (message != null) {
			final IWorkbench workbench = PlatformUI.getWorkbench();
			final Display display = workbench != null ? workbench.getDisplay() : null;
			if (display != null) {
				if (display.getThread() != Thread.currentThread() ) {
					workbench.getDisplay().asyncExec(new Runnable() {
						public void run() {
							out.setColor(color);
							if (printLogNumber) {
								if (ConfigurationManagement.isSeparateLoggingViewsForEachLayer()) {
									out.print(logEntryList.toString().concat(":").concat(logEntryListLocal.toString().concat(". ")));
								} else {
									out.print(logEntryList.toString().concat(". "));	
								}
								logEntryListLocal++;
								logEntryList++;
							} 
							if (printLogTime) {
								time = (System.currentTimeMillis() - timeOffsetInMs);
								out.print("(".concat(logClass.concat(time.toString()).concat("ms) ")));
							}
							if (println) {
								out.println(message.toString());
							} else {
								out.print(message.toString());
							}
							yammConsole.activate();
							workbench.getActiveWorkbenchWindow().getShell().layout();				
							while (workbench.getDisplay().readAndDispatch());
						}
					});
				} else {
					workbench.getDisplay().syncExec(new Runnable() {
						public void run() {
							out.setColor(color);
							if (printLogNumber) {
								if (ConfigurationManagement.isSeparateLoggingViewsForEachLayer()) {
									out.print(logEntryList.toString().concat(":").concat(logEntryListLocal.toString().concat(". ")));
								} else {
									out.print(logEntryList.toString().concat(". "));	
								}
								logEntryListLocal++;
								logEntryList++;
							} 
							if (printLogTime) {
								//time = (System.currentTimeMillis() - timeOffsetInMs);
								out.print("(".concat(logClass.concat(computeTimeString()).concat(") ")));
							}
							if (println) {
								out.println(message.toString());
							} else {
								out.print(message.toString());
							}
							yammConsole.activate();
							workbench.getActiveWorkbenchWindow().getShell().layout();				
							while (workbench.getDisplay().readAndDispatch());
						}
					});
				}
			}
		}
	}

	/**
	 * Creates a String to show the required computing time of a process. 
	 * 
	 * @return timeString - the required time.
	 */
	private String computeTimeString() {
		time = (System.currentTimeMillis() - timeOffsetInMs);
		Integer ms = (int)(time % 1000);
		Integer seconds = (int)(time / 1000 % 60);
		Integer minutes = (int)(time / (1000 * 60) % 60);
		Integer hours = (int)(time / (1000 * 60 * 60));
		Integer days = (int)(time / (1000 * 60 * 60 * 24));
		String timeString = "";
		if (days > 0) {
			timeString = "d".concat(days.toString());
		} if (hours > 0 || timeString.length() > 0) {
			if (timeString.length() > 0) {
				timeString = timeString.concat(",h".concat(hours.toString()));
			} else {
				timeString = "h".concat(hours.toString());
			}
		} if (minutes > 0 || timeString.length() > 0) {
			if (timeString.length() > 0) {
				timeString = timeString.concat(",m".concat(minutes.toString()));
			} else {
				timeString = "m".concat(minutes.toString());
			}
		} if (seconds > 0 || timeString.length() > 0) {
			if (timeString.length() > 0) {
				timeString = timeString.concat(",s".concat(seconds.toString()));
			} else {
				timeString = "s".concat(seconds.toString());
			}
		} if (ms > 0 || timeString.length() > 0) {
			if (timeString.length() > 0) {
				timeString = timeString.concat(",ms".concat(ms.toString()));
			} else {
				timeString = "ms".concat(ms.toString());
			}
		}
		return timeString;
	}
}
