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

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;



/**
 * Represents a variable and its value in the Variables View: 
 * Stores the Data needed for updating the value of a {@code YAMMVariable} instance
 * and also for the creation of the IVariables of {@code YAMMValue} (in case a variable
 * itself has attributes).
 */
public class VariableDebugEntry {
	
	/**The EStructural Feature (Meta Object) as the content of a State Machine*/
	public EObject objectReference;
	
	/** The EStructuralFeature's or EList entrie's  name - equal to the correspondent {@code YAMMVariable} name.*/
	public String variableName;
	
	/** The kind of EStructuralFeature as String. Can be an EReferenceImpl, an EClassImpl or an EAttributeImpl.*/
	public String variableType;
	
	/** The id of an {@code YAMMVariable} object and the key to {@link YAMMThread#objectReferences} either.*/
	public int yammVariableId;
	
	/** The value of the EStructuralFeature.*/
	private Object value;
	
	/** The ID  of the variable as it is shown in the Variable View.*/
	public int id = 0;
	
	/** Maps a complexe type's {@link #id} to itself. */
	public static ConcurrentHashMap <Object, Integer> allReferenceIDs = new ConcurrentHashMap <Object, Integer> ();
	
	/** As key: {@link #value}, as value: {@link #objectReference}*/ 
	public static ConcurrentHashMap <Object, EObject> allDynamicObjectsAndMetaInfo = 
			new ConcurrentHashMap <Object, EObject>();
	
	/** Increases with every new created VariableDebugEntry object*/
	public static int variableCounter = 0;
	
	/**
	 * The constructor. An instance of this class is created when {@link YAMMThread #getStackFrames()} is called.
	 * 
	 * @param newObject		:	initializes {@link #objectReference}
	 * @param variableName	:	initializes {@link #variableName}
	 * @param variableType	:	initializes {@link #variableType}
	 * @param value			:	initializes {@link #value}
	 * @param id			: 	initializes {@link #id}
	 * @param yammVariableId:	initializes {@link #yammVariableId}
	 */
	VariableDebugEntry(EObject newObject, String variableName, String variableType, Object value, int yammVariableId) {
		
		objectReference 	= newObject;
		this.variableName 	= variableName;
		this.variableType 	= variableType;
		this.yammVariableId = yammVariableId;
		setValue(value);	
	}


	/**
	 * Checks if it's a reference type with a need of an own ID.
	 * 
	 * @return	true : reference type <br>
	 * 			false: primitive type, EList or external type
	 */
	private boolean isReferenceType()
	{
		return (value != null)
				&& !YAMMValue.isPrimitiveType(value)
				&& !(value instanceof EList)
				&& !(value instanceof HashMap)
				&& !(value instanceof java.util.AbstractCollection) 
				&& !(variableType == "java.util.HashMap$Node");
	}

	/**
	 * Increases {@link #variableCounter} and sets
	 * {@link #id).
	 */
	private void increaseVariableCounterAndSetId() {
		{
			id = variableCounter++;
			allReferenceIDs.put(value, id);
		}
			
	}
	
	/**
	 * Sets {@link #value}.
	 * 
	 * @param newValue : initializes {@link #value}
	 */
	public void setValue(Object newValue)
	{
		value = newValue;
		if (isReferenceType()
			    && !(allDynamicObjectsAndMetaInfo.containsKey(value)))
		{
			allDynamicObjectsAndMetaInfo.put(value, objectReference);
			increaseVariableCounterAndSetId();
		}
	}
	
	/**
	 * Gets {@link #value}.
	 * 
	 * @return	{@link #value}
	 */
	public Object getValue()
	{
		return value;
	}
	
}
