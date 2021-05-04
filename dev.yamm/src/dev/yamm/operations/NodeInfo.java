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

import dev.yamm.EvalGuardOrEffect;
import dev.yamm.init.LaunchTabGroupAnalysis;
import dev.yamm.logger.YAMMLogger;

public class NodeInfo {
	
	EvalGuardOrEffect execute;

	public NodeInfo(EvalGuardOrEffect execute) {
		this.execute = execute;
	}

	private static HashMap<String, Float> nodeProbabilities = new HashMap<String, Float>();

	public synchronized HashMap<String, Float> getNodeInfo() {
		return nodeProbabilities;
	}

	private static Integer populationSize = null;

	private static YAMMLogger logger = YAMMLogger.getYAMMLogger("YAMM Log");

	public synchronized void setPopulationSize(Integer newPopulationSize) {
		populationSize = newPopulationSize;
	}

	public synchronized void setAbsoluteNodePropability(String nodeName, Float absoluteProbability) {
		if (nodeName != null && absoluteProbability != null && !(absoluteProbability < 0) && !nodeProbabilities.containsKey(nodeName)) {
			nodeProbabilities.put(nodeName, absoluteProbability);
		}
	}

	public synchronized void setRelativeNodePropability(String nodeName, Float relativeProbability) {
		Float storedProbability = nodeProbabilities.get(nodeName);
		if (relativeProbability != storedProbability && Math.abs(storedProbability - relativeProbability) > 0.000001) {
			//System.out.println(nodeName + " " + nodeProbabilities.get(nodeName) + " / " + relativeProbability);
			if (populationSize != null && populationSize > 0) {
				Float absoluteNodePropability = nodeProbabilities.get(nodeName);
				if (absoluteNodePropability != null) {
					if (relativeProbability > 100.0f) {
						relativeProbability = 100.0f;
					} else if (relativeProbability < 0.0f) {
						relativeProbability = 0.0f;
					}
					Float computedProbability = absoluteNodePropability - absoluteNodePropability / populationSize + relativeProbability / populationSize;
					if (!computedProbability.equals(storedProbability)) {			
						nodeProbabilities.put(nodeName, computedProbability);
					} else {
						// increase precision
						int factor = 1;
						String storedProbabilityString = storedProbability.toString();
						int seperator = storedProbabilityString.indexOf('.');
						if (seperator != -1 && seperator < storedProbabilityString.length()) {
							int length = storedProbabilityString.substring(seperator+1, storedProbabilityString.length()).length();
							String computedProbabilityString = computedProbability.toString();
							seperator = computedProbabilityString.indexOf('.');
							if (seperator != -1 && seperator < computedProbabilityString.length()) {
								length = Math.max(length, storedProbabilityString.substring(seperator+1, storedProbabilityString.length()).length());
							}
							for (int i=0; i < length; i++) {
								factor *= 10;
							}
						}
						computedProbability = (absoluteNodePropability * factor - absoluteNodePropability * factor / populationSize + relativeProbability * factor / populationSize) / factor;
						nodeProbabilities.put(nodeName, computedProbability);
					}
					//System.out.println("New : " + computedProbability);
				} else {
					logger.error("Absolute node propability for \"".concat(nodeName).concat("\" not found."));
				}
			} else {
				logger.error("Populationsize is not set ... can't set relative node probability");
			}
		}
	}

	public synchronized Float getAbsoluteNodePropability(String nodeName) {
		return nodeProbabilities.get(nodeName);
	}

}
