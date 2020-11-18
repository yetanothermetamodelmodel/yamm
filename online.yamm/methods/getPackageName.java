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

public String getPackageName(Object object) {
		return object instanceof EObject ? getPackageName(((EObject)object).eClass()) : "";
	}


	public String getPackageName(EClass eclass) {
		List<String> packageNames = new ArrayList<String>();
		EObject context = eclass;

		while ((context = context.eContainer()) != null
				&& context instanceof EPackage) {
			packageNames.add(((ENamedElement) context).getName());
		}

		String ret = "";

		for (int i = packageNames.size() - 1; i >= 0; i--) {
			ret += packageNames.get(i);

			if (i > 0) {
				ret += ".";
			}
		}
		if (!ret.contains("."))
			return eclass.getName();
		ret = ret.substring(5, ret.length()); // delete yamm.
		ret += "." + eclass.getName();
		return ret.length() == 0 ? null : ret.toString();
	}
