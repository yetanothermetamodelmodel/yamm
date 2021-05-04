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
package dev.yamm.coreModel.design.preferences;


import org.eclipse.jface.preference.ColorFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IntegerFieldEditor;
import org.eclipse.jface.preference.RadioGroupFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import dev.yamm.coreModel.design.Activator;



public class EditorPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage{

	public EditorPreferencePage() {
		super(GRID);
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
	}
	
	@Override
	public void init(IWorkbench workbench) {
	}

	@Override
	protected void createFieldEditors() {
		
		addField(new ColorFieldEditor(PreferenceConstants.EDITOR_COLORTRATTACHMENTBORDER, "Transition-Attachment Bordercolor", getFieldEditorParent()));
		addField(new RadioGroupFieldEditor(PreferenceConstants.EDITOR_BORDERSTYLETRATTACHMENT, "Transition-Attachment Bordestyle:" , 4,
				new String[][] {
				{"Solid", "SOLID"},
				{"Dash", "DASH"},
				{"Dot", "DOT"},
				{"Dash-Dot", "DASH-DOT"}
		}, getFieldEditorParent()));
		addField(new IntegerFieldEditor(PreferenceConstants.EDITOR_STATECORNERRADIUS, "State Cornerradius:", getFieldEditorParent()));
		
	}

}
