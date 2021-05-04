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
package dev.yamm.operations;

import java.util.HashMap;
import java.util.Vector;

import org.eclipse.emf.ecore.EObject;

import dev.yamm.EvalGuardOrEffect;
import dev.yamm.Zerochart;


public class Lifeness {

	EvalGuardOrEffect execute;
	
	HashMap<String,Object> checkMap = new HashMap<String,Object>();
	
	HashMap<Integer,Vector<CompareValue>> compareMap = new HashMap<Integer,Vector<CompareValue>>();
	
	public Lifeness(EvalGuardOrEffect execute) {
		this.execute = execute;
	}

	public void check(String effect, int layer) {
		String value = effect.substring(effect.indexOf("lifeness(")+9, effect.length()-1);
		String key = value+layer;
		Object compare = execute.getValue.getValue(value, layer);
		if(checkMap.containsKey(key)) {
			if(checkMap.get(key).equals(compare)) {
				//means no changes --> Abort
				execute.reflectivStateChart.stateNR = Zerochart.finalstate;
			} else {
				checkMap.put(key, compare);
			}
		} else {
			checkMap.put(key, compare);
		}
		
	}

	public void reset() {
		checkMap.clear();
		compareMap.clear();
	}

	public void setAlive(String effect, int layer) {
		String variable = effect.substring(9, effect.length()-1);
		CompareValue actCompare = new CompareValue();
		String[] variables = execute.getValue.getVariables(variable, layer);
		actCompare.variable = execute.getValue.getVariable(variable, layer);
		actCompare.attribute = variables[variables.length-1];
		
		//EClass curClass = ((EObject)actCompare.variable).eClass();
		try {
			//EStructuralFeature feature = curClass.getEStructuralFeature(actCompare.attribute);
			//actCompare.value = ((EObject)actCompare.variable).eGet(feature);
			actCompare.value = execute.reflectivStateChart.objectManagement.get((EObject)actCompare.variable, actCompare.attribute);
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		
		Vector<CompareValue> actVector = null;
		if(compareMap.containsKey(layer)) {
			actVector = compareMap.get(layer);
		} else {
			actVector = new Vector<CompareValue>();
		}
		actVector.add(actCompare);
		compareMap.put(layer, actVector);
	}
	
	public void setAliveForInvoke(String effect, int layer) {
		String variable = effect;
		CompareValue actCompare = new CompareValue();
		String[] variables = execute.getValue.getVariables(variable, layer);
		actCompare.variable = execute.getValue.getVariable(variable, layer);
		actCompare.attribute = variables[variables.length-1];
		
		//EClass curClass = ((EObject)actCompare.variable).eClass();
		try {
			//EStructuralFeature feature = curClass.getEStructuralFeature(actCompare.attribute);
			//actCompare.value = ((EObject)actCompare.variable).eGet(feature);
			actCompare.value = execute.reflectivStateChart.objectManagement.get((EObject)actCompare.variable, actCompare.attribute);
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		
		Vector<CompareValue> actVector = null;
		if(compareMap.containsKey(layer)) {
			actVector = compareMap.get(layer);
		} else {
			actVector = new Vector<CompareValue>();
		}
		actVector.add(actCompare);
		compareMap.put(layer, actVector);
	}

	public void isAlive(String effect, int layer) {
		Vector<CompareValue> actVector = null;
		if(compareMap.containsKey(layer)) {
			actVector = compareMap.get(layer);
		} else {
			return;
		}
		boolean changed = false;
		for(CompareValue actCompare : actVector) {
			//EClass curClass = ((EObject)actCompare.variable).eClass();
			Object value = null;
			try {
				//EStructuralFeature feature = curClass.getEStructuralFeature(actCompare.attribute);
				//value = ((EObject)actCompare.variable).eGet(feature);
				value = execute.reflectivStateChart.objectManagement.get((EObject)actCompare.variable, actCompare.attribute);
			} catch (NullPointerException e) {
				e.printStackTrace();
			}
			if(!actCompare.value.equals(value)) {
				actCompare.value = value;
				changed = true;
			}
		}
		if(!changed) {
			//means no changes --> Abort
			System.err.println("Layer: "+layer+" Lifeness-Error: Endlosschleife im Chart");
			execute.reflectivStateChart.stateNR = Zerochart.finalstate;
		}
	}
	
	class CompareValue {
		Object variable;
		String attribute;
		Object value;
	}
}
