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

import org.eclipse.osgi.util.NLS;

/**
 * This class provides national language support by externalizing UI Strings from {@link LayerView}
 * and link them to language specific properties page.
 */
public class Messages extends NLS {
	private static final String BUNDLE_NAME = "dev.yamm.gui.messages_en"; //$NON-NLS-1$
	public static String columnBreaks;
	public static String columnColor;
	public static String columnLayerfile;
	public static String columnLogLayer;
	public static String columnNsURI;
	public static String columnStep_wait;
	public static String columnWait;
	public static String contextMenuAdd;
	public static String contextMenuDelete;
	public static String contextMenuEdit;
	public static String contextMenuGenerateEcore;
	public static String dialogInformationMessageRemoveBottomLayer;
	public static String dialogInformationMessageUniqueIDTrue;
	public static String dialogInformationTitleSampleView;
	public static String dropDownAll;
	public static String dropDownDebug;
	public static String dropDownError;
	public static String dropDownFatal;
	public static String dropDownInfo;
	public static String dropDownLogLevel;
	public static String dropDownOff;
	public static String dropDownTrace;
	public static String dropDownWarn;
	public static String toolbarTooltipAutoupload;
	public static String toolbarTooltipDownload;
	public static String toolbarTooltipLoad;
	public static String toolbarTooltipResetSimulationAnalysis;
	public static String toolbarTooltipSave;
	public static String toolbarTooltipSaveAs;
	public static String toolbarTooltipSetLogLevel;
	public static String toolbarTooltipSimulationRun;
	public static String toolbarTooltipStepInto;
	public static String toolbarTooltipStepOver;
	public static String toolbarTooltipStepReturn;
	public static String toolbarTooltipUpload;
	public static String dialogInformationNoLayerAttached;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
