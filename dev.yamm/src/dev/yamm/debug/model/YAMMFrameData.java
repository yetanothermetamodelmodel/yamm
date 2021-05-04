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
package dev.yamm.debug.model;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;


/**
 * Object representing a frame.
 */

public class YAMMFrameData 
{
    /** stack frames name.*/
    final public String functionName;
    
    /**An Array storing the IDs of top - level variables ('this', parameters) as they are generated in
     * {@link YAMMValue #generateVariableId(org.eclipse.emf.ecore.EObject, Object, YAMMVariableAdapter)}.*/
    final public Integer[] topVariablesIds;
    
    /**
     * Constructor accepting a String containing information about a stack frames name and its variables.
     * 
     * @param frameString: Stores frame specific information (name, variable IDs)
     */
    public YAMMFrameData(String frameString) {
        StringTokenizer st = new StringTokenizer(frameString, "|");
        functionName = st.nextToken();
        
        List<Integer> variablesList = new ArrayList<Integer>();
        while (st.hasMoreTokens()) {
            variablesList.add(Integer.parseInt(st.nextToken()));
        }
       topVariablesIds = (Integer[]) variablesList.toArray(new Integer[variablesList.size()]);
    }
}
