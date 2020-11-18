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
	public String substituteEffect(Object objOP, Object effect) {
		YOperation actOp = (YOperation) objOP;
		String modifiedEffect = (String) effect;
		String returnName = "";
		for(int i=0;i<actOp.getOwnedParameter().size();i++) {
			YParameter actPara = actOp.getOwnedParameter().get(i);
			if(actPara.getDirection().getName().equals("return")) {
				returnName = actPara.getName();
			}
		}
		if(returnName.equals("")) {
			System.err.println("Kein Returnparameter in "+actOp+" vorhanden");
		}
		int begin = modifiedEffect.indexOf(actOp.getName());
		int last = begin;
		while(modifiedEffect.charAt(last) != ')') {
			last++;
		}
		logger.debug(modifiedEffect.substring(0, begin));
		logger.debug(modifiedEffect.substring(last+1, modifiedEffect.length()));
		logger.debug(modifiedEffect.substring(begin, last+1));
		String operationCall = modifiedEffect.substring(begin, last+1);
		String returnCall = "read("+Integer.toHexString(actOp.hashCode())+", "+returnName+")";
		modifiedEffect = modifiedEffect.replace(operationCall, returnCall);
		
		return modifiedEffect;
	}
