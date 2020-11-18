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

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.eclipse.emf.ecore.EStructuralFeature;

import online.yamm.Common;

public class AttributePart {

	public String name 									= null;
	public ArrayList<ArrayAccessPart> arrayAccessParts 	= null;
	public Integer valuesCoveredByArray 				= null;
	public Boolean arrayAccess							= null;

	AttributePart(String namePart, String arrayAccessPartString) {
		this.name = namePart;
		arrayAccess = false;
		if (arrayAccessPartString != null && !arrayAccessPartString.isEmpty()) {
			// e.g. [5,6,7-8]			
			Pattern pattern = Pattern.compile(ParameterManagement.rangeOfNumbers + "|" + ParameterManagement.singleNumber);
			Matcher matcher = pattern.matcher(arrayAccessPartString);
			if (matcher.find()) {
				arrayAccessParts = Common.resetCollection(arrayAccessParts);
				matcher.reset();
				ArrayAccessPart arrayAccessPart = null;
				valuesCoveredByArray = 0;
				int matches = 0;
				while (matcher.find()) {	
					arrayAccessPart = new ArrayAccessPart(matcher.group());
					if (arrayAccessPart.rangeEnd != null && arrayAccessPart.rangeStart != null || matches > 1)
						arrayAccess = true;
					arrayAccessParts.add(arrayAccessPart);
					if (arrayAccessPart.valuesCovered != null) {
						valuesCoveredByArray += arrayAccessPart.valuesCovered;
					}
					matches++;
				}
			}
		}
	}

}
