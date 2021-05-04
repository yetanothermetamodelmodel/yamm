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
package dev.yamm.ecj;

public class ArrayAccessPart {

	public Integer singleNumber 	= null;
	public Integer rangeStart 		= null;
	public Integer rangeEnd	 		= null;
	public Integer valuesCovered 	= null; 

	ArrayAccessPart(String unInterpreted) {
		unInterpreted = unInterpreted.replace(" ", "").replace("\t", "");
		if (unInterpreted != null) {
			int rangeDelimiterPosition = unInterpreted.indexOf('-');
			try {
				if (rangeDelimiterPosition == -1) {
					singleNumber = Integer.parseInt(unInterpreted);
					valuesCovered = 1;
				} else {
					rangeStart = Integer.parseInt(unInterpreted.substring(0, rangeDelimiterPosition));
					rangeEnd = Integer.parseInt(unInterpreted.substring(rangeDelimiterPosition+1));
					valuesCovered = rangeEnd - rangeStart > 0 ? rangeEnd - rangeStart : -1;
				}
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
			
			if (valuesCovered != null && valuesCovered == -1) {
				System.err.println("RangeEnd is larger/equals than RangeStart. Resetting values.");
				rangeStart = null;
				rangeEnd = null;
			}
		}
	}

}
