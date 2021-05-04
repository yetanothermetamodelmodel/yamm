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
package dev.yamm.tracing;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.Semaphore;

public class Tracing {

	static Semaphore semaphore = new Semaphore(1);
	
	synchronized public static void saveTraceLine(String fileName, String line)
	{
		try {
		    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName, true)));
		    out.println(line);
		    out.close();
		} catch (IOException e) {
		    e.printStackTrace();
		}
	}
	
	synchronized public static boolean checkIfTraceLineExists(String fileName, String lineToCheck)
	{
		BufferedReader br = null;
	    try {
			br = new BufferedReader(new FileReader(fileName));

	        while (true)
	        {
		        String line = br.readLine();
		        if (line == null)
		        	break;
		        
		        if (line.equals(lineToCheck))
		        {
		        	br.close();
		        	return true;
		        }
	        } 
	        
	        br.close();
	        
	    } catch (Exception e) {
	        try {
				br.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	    }
	    return false;
	}
	
	synchronized public static void deleteTraceFile(String fileName)
	{
		try {
			new File(fileName).delete();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
