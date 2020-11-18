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

import org.eclipse.jface.preference.ColorFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import online.yamm.init.Activator;


public class YAMMSimulationColors extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

public YAMMSimulationColors() {
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
	addField(new ColorFieldEditor(PreferenceConstants.P_COLORINFO, "Color &Info Log Entries:", getFieldEditorParent()));
	addField(new ColorFieldEditor(PreferenceConstants.P_COLORERROR, "Color &Error Log Entries:", getFieldEditorParent()));
	addField(new ColorFieldEditor(PreferenceConstants.P_COLORTRACE, "Color &Trace Log Entries:", getFieldEditorParent()));
	addField(new ColorFieldEditor(PreferenceConstants.P_COLORDEBUG, "Color &Debug Log Entries:", getFieldEditorParent()));
	addField(new ColorFieldEditor(PreferenceConstants.P_COLORTRANSITION, "Color Simulation Current T&ransition:", getFieldEditorParent()));
	addField(new ColorFieldEditor(PreferenceConstants.P_COLORSTATE, "Color Simulation Current &State:", getFieldEditorParent()));
	addField(new ColorFieldEditor(PreferenceConstants.P_COLORGUARD, "Color Simulation Current &Guard :", getFieldEditorParent()));
	addField(new ColorFieldEditor(PreferenceConstants.P_COLORGUARD_ALTERNATE, "Alternate Color Simulation Current &Guard :", getFieldEditorParent()));
	addField(new ColorFieldEditor(PreferenceConstants.P_COLOREFFECT, "Color Simulation Current &Effect :", getFieldEditorParent()));
	addField(new ColorFieldEditor(PreferenceConstants.P_COLOREFFECT_ALTERNATE, "Alternate Color Simulation Current &Effect :", getFieldEditorParent()));		
}

/* (non-Javadoc)
 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
 */
public void init(IWorkbench workbench) {
}

}
