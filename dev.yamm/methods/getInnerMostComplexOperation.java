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
	public YOperation getInnerMostComplexOperation(Object toCheck) {

		String effectToCheck = (String) toCheck;
		Vector operations = new Vector();

		//Wenn es keine Zuweisung ist, kann es keine ComplexOperation sein
		if(!effectToCheck.contains("(")) {
			logger.debug("No operation was found");
			return null;
		//Andernfalls Effect durchgehen zu dem innerstem Klammerpaar
		} else {
			String help = effectToCheck;
			
			int last = -1;
			int counter = 0;
			boolean found = false;
			
			while(help.contains("(")) {
				//collect all operations

				last = help.indexOf("(");	

				int begin=last;
				
				while(help.charAt(begin) != ' ' && begin != 0) {
					begin--;
				}
				//OpName ermitteln
				String opName = help.substring(begin, last).trim();
				
				operations.add(opName);
				
				help = help.substring(help.indexOf("(")+1);
			}
			
			for(int a=0;a<operations.size();a++) {	
				//Anschlie�end alle OperationHandler nach diesen Namen abfragen
				EList eList = null;
				EMap actLayer = (EMap) execute.maps[<%layer>];
	
				//TODO Mapping eintrag entsprechend abfragen
				for(int i=0;i<actLayer.size();i++) {
					Entry entry = (Entry) actLayer.get(i);
					if(entry.getValue() instanceof YOperation) {
						YOperation actOp = (YOperation) entry.getValue();
						if(actOp.getName() != null) {
							if(actOp.getName().equals(operations.get(a))) {
//								//Call vielleicht unn�tz
//								actOp.setCall(help.substring(last, counter));

								return actOp;
							}
						}
	
					}
				}
			}
			if(found == false) {
				logger.debug("Nothing found");
				return null;
			}

		}
		return null;
	}
