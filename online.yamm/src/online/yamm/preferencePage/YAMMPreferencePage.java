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
package online.yamm.preferencePage;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.DirectoryFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.FileFieldEditor;
import org.eclipse.jface.preference.IntegerFieldEditor;
import org.eclipse.jface.preference.RadioGroupFieldEditor;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import online.yamm.init.Activator;


public class YAMMPreferencePage
extends FieldEditorPreferencePage
implements IWorkbenchPreferencePage {

	public YAMMPreferencePage() {
		super(GRID);
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
	}

	/**
	 * Creates the field editors. Field editors are abstractions of
	 * the common GUI blocks needed to manipulate various types
	 * of preferences. Each field editor knows how to save and
	 * restore itself.
	 */
	@Override
	public void createFieldEditors() {
		addField(new BooleanFieldEditor(PreferenceConstants.P_OBJECTDIAGRAM, "activate Objectdiagram", getFieldEditorParent()));
		addField(new IntegerFieldEditor(PreferenceConstants.P_SEED_GUARD, "Guard check seq.-order seed", getFieldEditorParent()));
		addField(new DirectoryFieldEditor(PreferenceConstants.P_COMPILEDCLASSES_PATH, "&Compiled Classes Directory:", getFieldEditorParent()));
		addField(new FileFieldEditor(PreferenceConstants.P_ANALYSISCORE_PATH, "Analysis Core (Jar) File:" , getFieldEditorParent()));
		addField(new StringFieldEditor(PreferenceConstants.P_CDO_REPOSITORY_DB, "CDO Repository &DB:", getFieldEditorParent()));
		addField(new IntegerFieldEditor(PreferenceConstants.P_CDO_REPOSITORY_PORT, "CDO Repository &Port:", getFieldEditorParent()));
		addField(new RadioGroupFieldEditor(PreferenceConstants.P_DEFAULT_LOG_LEVEL, "Default Log Level:" , 6,
				new String[][] {
				{"All", "All"},
				{"Trace", "Trace"},
				{"Debug", "Debug"},
				{"Info", "Info"},
				{"Error", "Error"},
				{"Off", "Off"}
		},getFieldEditorParent()));			
		addField(new BooleanFieldEditor(PreferenceConstants.P_SEPARATE_LOGGING_VIEWS_FOR_EACH_LAYER, "&Seperate Logging Views for each Layer", getFieldEditorParent()));
		addField(new DirectoryFieldEditor(PreferenceConstants.P_GENERATEPARAMFILEPATH, "&Generate Params File Path:", getFieldEditorParent()));
		addField(new StringFieldEditor(PreferenceConstants.P_GENERATETARGETFILEPREFIX, "Generate T&arget File Prefix:", getFieldEditorParent()));
		addField(new FileFieldEditor(PreferenceConstants.P_GENERATEPARAMFILETEMPLATE, "Generate Params &Template:" , getFieldEditorParent()));
		addField(new StringFieldEditor(PreferenceConstants.P_GENERATEPARAMTYPEPREFIX, "Generate Params &Type Prefix:", getFieldEditorParent()));
		addField(new StringFieldEditor(PreferenceConstants.P_GENERATEBESTMODELPATH, "&Best Model Path:", getFieldEditorParent()));
		addField(new StringFieldEditor(PreferenceConstants.P_GENERATEBESTINDIVIDUUMPATH, "&Best Individuum Path:", getFieldEditorParent()));
		addField(new BooleanFieldEditor(PreferenceConstants.P_GENERATEPARAMINTOCONSOLE, "Display generated Params in (Params-) &Console", getFieldEditorParent()));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
	}

}
