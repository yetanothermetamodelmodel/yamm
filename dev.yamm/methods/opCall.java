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
//	private Object opCall(String opName, Object...args) {
//		return execute.opCall.activateOperation(null, opName, <%layer>, args);
//	}
	private Object opCall(Object eObject, String typeForMultiInheritance, String opName, Object inAdapterList, org.eclipse.emf.common.util.EList listOfClassesToAttachTheInAdapter, String returnVarName,  Object...args) {
		return execute.opCall.activateOperation(eObject, typeForMultiInheritance, opName, <%layer>, (org.eclipse.emf.common.util.EList<dev.yamm.operations.InoutAdapter>)inAdapterList, listOfClassesToAttachTheInAdapter, returnVarName, args);
	}
	private Object opStatic(String className, String opName, Object...args) {
		return execute.opCall.activateStaticOperation(className, opName, <%layer>, args);
	}
