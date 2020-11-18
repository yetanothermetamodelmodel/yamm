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

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

import online.yamm.init.Activator;


/**
 * Class used to initialize default preference values.
 */
public class PreferenceInitializer extends AbstractPreferenceInitializer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
	 */
	@Override
	public void initializeDefaultPreferences() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		store.setDefault(PreferenceConstants.P_COMPILEDCLASSES_PATH, true);
		store.setDefault(PreferenceConstants.P_ANALYSISCORE_PATH, true);
		store.setDefault(PreferenceConstants.P_CDO_REPOSITORY_DB, true);
		store.setDefault(PreferenceConstants.P_CDO_REPOSITORY_PORT, true);
		store.setDefault(PreferenceConstants.P_COLORERROR, true);
		store.setDefault(PreferenceConstants.P_COLORINFO, true);
		store.setDefault(PreferenceConstants.P_COLORDEBUG, true);
		store.setDefault(PreferenceConstants.P_COLORTRACE, true);
		store.setDefault(PreferenceConstants.P_DEFAULT_LOG_LEVEL, true);
		store.setDefault(PreferenceConstants.P_SEPARATE_LOGGING_VIEWS_FOR_EACH_LAYER, true);
		store.setDefault(PreferenceConstants.P_COLORTRANSITION, true);
		store.setDefault(PreferenceConstants.P_COLORSTATE, true);
		store.setDefault(PreferenceConstants.P_COLORGUARD, true);
		store.setDefault(PreferenceConstants.P_COLORGUARD_ALTERNATE, true);
		store.setDefault(PreferenceConstants.P_COLOREFFECT, true);
		store.setDefault(PreferenceConstants.P_COLOREFFECT_ALTERNATE, true);
		store.setDefault(PreferenceConstants.P_GENERATEPARAMFILEPATH, true);
		store.setDefault(PreferenceConstants.P_GENERATEPARAMFILETEMPLATE, true);
		store.setDefault(PreferenceConstants.P_GENERATEPARAMINTOCONSOLE, true);
		store.setDefault(PreferenceConstants.P_GENERATETARGETFILEPREFIX, true);
	}

}
