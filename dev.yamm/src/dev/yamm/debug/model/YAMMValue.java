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

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.UUID;

import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.IValue;
import org.eclipse.debug.core.model.IVariable;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import dev.yamm.logger.YAMMLogger;

/**
 * Represents the value of a {@link YAMMVariable} in the variables view.
 * Implements {@link org.eclipse.debug.core.model.IValue}.
 * 
 * A value itself can have variables. This can be the case, if the variable
 * is a complex typed one and have attributes or if the Value is a Map or Collection.
 */
public class YAMMValue extends YAMMDebugElement implements IValue {

	private static YAMMLogger logger = YAMMLogger.getYAMMLogger("YAMM Log");
	
	/** The YAMMVariable Object where {@link #fValue} is been created. */
	final private YAMMVariable fVariable;
	
	/** The value of an variable as it is shown in the Variables.*/
	final private String fValue;
	
	/** The adapter that has been active before the adapter assinged to this YAMMValue has been activated.*/
	private YAMMVariableAdapter adapterBefore;
	
	/** The adapter assigned to this value. */
	private YAMMVariableAdapter assignedAdapter;


	/**
	 * The Constructor where the value of a variable is initialized.
	 * 
	 * @param variable	:	initializes {@link #fVariable}.
	 * @param value		:	initializes {@link #fValue}.
	 */
	public YAMMValue(YAMMVariable variable, String value) {
		super(variable.getStackFrame().getYAMMDebugTarget());
		fVariable = variable;
		fValue = value;
	}

	
	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IValue#getValueString()
	 */
	public String getValueString() throws DebugException {
		return fValue;
	}
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IValue#isAllocated()
	 */
	public boolean isAllocated() throws DebugException {
		return true;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IValue#getVariables()
	 */
	public IVariable[] getVariables() throws DebugException { //only complex types

		YAMMStackFrame frame = fVariable.getStackFrame();
		setAssignedAdapterActive(); 
		Object key = getKey();
		IVariable[] children = null;
		if (key != null)
		{
			VariableDebugEntry debugEntryOfEReference = YAMMThread.objectReferences.get(key);
			Object value = debugEntryOfEReference.getValue();
			if (value != null)
			{
				if ((debugEntryOfEReference.variableType.equals("org.eclipse.emf.ecore.impl.EReferenceImpl")
						|| debugEntryOfEReference.variableType.equals("org.eclipse.emf.ecore.impl.EClassImpl")
						|| debugEntryOfEReference.variableType.equals("org.eclipse.emf.ecore.impl.DynamicEObjectImpl"))
						&& !(value instanceof EList))
				{
					EList<EStructuralFeature> variableList = getEStructuralFeaturesOfEReference(value);

					if ((listContainsThis(variableList) && variableList.size() > 1) 
							|| (!listContainsThis(variableList) && !variableList.isEmpty()))
					{
						fVariable.setHasStructuralFeatures(true);

						if (listContainsThis(variableList))
							children = new IVariable[variableList.size() - 1];
						else
							children = new IVariable[variableList.size()];	

						if (debugEntryOfEReference.variableName.equals("this"))
						{
							if (YAMMVariableAdapter.thisAndAdapter.containsKey(debugEntryOfEReference.getValue()))
							{
								YAMMVariableAdapter adapterOfThis = YAMMVariableAdapter.thisAndAdapter.get(debugEntryOfEReference.getValue());
								getYAMMVariablesOfCurrentThis(frame, variableList, children, debugEntryOfEReference, adapterOfThis, true);
							}
						}
						else
						{
							createOrGetYAMMVariablesOfEReference(frame, variableList, children, debugEntryOfEReference, true);
						}
					}	
				}
				if (value instanceof EList)
				{
					EList list = (EList) value;
					children = new IVariable[list.size()];
					children = createYAMMVariablesOfEList(frame, children, debugEntryOfEReference, list);
				}

				if (value instanceof java.util.AbstractCollection)
				{
					java.util.AbstractCollection collection = (java.util.AbstractCollection) value;
					children = new IVariable[collection.size()];
					createYAMMVariablesOfCollection(frame, children, debugEntryOfEReference, collection);
				}

				if (value instanceof java.util.HashMap)
				{
					HashMap map = (HashMap) value;
					if (!map.isEmpty())
					{
						children = new IVariable[map.size()];
						createYAMMVariablesOfMapNodes(frame, map, debugEntryOfEReference, children);
					}
				}

				if ((debugEntryOfEReference instanceof MapDebugEntry)
						&& (fValue == "java.util.HashMap$Node"))
				{
					children = new IVariable[2];
					createYAMMVariablesForKeyValuePair(frame, (MapDebugEntry) debugEntryOfEReference, children);
				}
			}
		}
		if (children == null)
			children = new IVariable[0];
		assignedAdapter = null;
		children = deleteNullVariables(children);
		return children;
	}



	/**
	 * Creates  {@code YAMMVariable} objects for each element of a {@code java.util.AbstractCollection}.
	 * 
	 * @param frame					: the associated {@code YAMMStackFrame}
	 * @param children				: an Array of the {@code YAMMVariable}s to be created
	 * @param debugEntryOfEReference: the {@code VariableDebugEntry} object of the collection object
	 * @param collection			: the collection object
	 */
	private  void createYAMMVariablesOfCollection(YAMMStackFrame frame, IVariable[] children,
			VariableDebugEntry debugEntryOfEReference, AbstractCollection collection)
	{
		{
			IVariable var = null;
			int countVars = 0;
			int objectKey = 0;
			if (!collection.isEmpty())
			{
				for (Object element:  collection)
				{
					objectKey = createDebugEntryOfCollectionElements(collection, element, countVars);
					try 
					{
						var = new YAMMVariable(frame, objectKey, true, assignedAdapter);

					} 
					catch (DebugException e) 
					{
						e.printStackTrace();
					}
					children[countVars] = var;
					countVars++;
				}
			}
		}
	}



	private int createDebugEntryOfCollectionElements(AbstractCollection collection, Object element, int countVars)
	{
		String variableName;
		variableName = "[" + countVars + "]";
		int objectKey = createUniqueIDForPrimitiveTypes();

		YAMMThread.objectReferences.put(objectKey, new VariableDebugEntry(null,  
				variableName, element.getClass().getName(), 
				element, objectKey));
		return objectKey;
		
	}



	/**
	 * Creates {@code YAMMVariable} objects for each HashMap Node's key and value.
	 * 
	 * @param frame				: the associated {@code YAMMStackFrame}
	 * @param debugEntryOfMap	: the {@code MapDebugEntry} object of the specified Map Node
	 * @param children			: an Array of the {@code YAMMVariable}s to be created
	 */
	private void createYAMMVariablesForKeyValuePair(YAMMStackFrame frame, MapDebugEntry debugEntryOfMap,
			IVariable[] children) 
	{
		int objectKey = 0;
		IVariable keyVar = null;
		IVariable valueVar = null;
		Object key = debugEntryOfMap.getEntryKey();
		Object value = debugEntryOfMap.getEntryValue();
		
		objectKey = createDebugEntryOfMapKey(key, debugEntryOfMap.getMap());
		try 
		{
			keyVar = new YAMMVariable(frame, objectKey, false, assignedAdapter);
		} 
		catch (DebugException e) 
		{
			e.printStackTrace();
		}
		
		objectKey = createDebugEntryOfMapValue(value, debugEntryOfMap.getMap());
		try 
		{
			valueVar = new YAMMVariable(frame, objectKey, false, assignedAdapter);
		} 
		catch (DebugException e)
		{
			e.printStackTrace();
		}
		children[0] = keyVar;
		children[1] = valueVar;
	}



	/**
	 * Creates a {@code VariableDebugEntry} for the value of a specified HashMap's Node.
	 *  
	 * @param key	: the value of a HashMap.Node
	 * @param map	: the map 
	 * @return		: the {@code YAMMVariable}'s ID
	 */
	private int createDebugEntryOfMapValue(Object value, HashMap map) 
	{
		int objectKey = createUniqueIDForPrimitiveTypes();

		YAMMThread.objectReferences.put(objectKey, new VariableDebugEntry(null,  
				"value" , value.getClass().getName(), 
				value, objectKey));
		return objectKey;
	}



	/**
	 * Deletes "null - Variables" caused by "this" of the Superclasses.
	 * @param children
	 * @return children
	 */
	private IVariable[] deleteNullVariables(IVariable[] children)
	{
		for (IVariable variable : children)
		{
			if (variable == null)
			{
				List <IVariable>  temp = new ArrayList <IVariable> (Arrays.asList(children));
				temp.remove(variable);
				 children = temp.toArray(new IVariable[0]);
			}
		}
		return children;
	}
	/**
	 * Sets the YAMMVariableAdapter instance assigned to this value, active.
	 */
	private void setAssignedAdapterActive() 
	{
		YAMMStackFrame frame = fVariable.getStackFrame();
		YAMMThread thread = (YAMMThread) frame.getThread();	
		try 
		{
			if (YAMMVariableAdapter.getVariableAdapterByName(frame.getName()) != null)
				assignedAdapter = YAMMVariableAdapter.getVariableAdapterByName(frame.getName());
		}
		catch (DebugException e)
		{
			e.printStackTrace();
		}
	}



	private boolean listContainsThis(EList<EStructuralFeature> variableList) 
	{
		for (EStructuralFeature feature : variableList)
		{
			if (feature.getName().equals("this"))
				return true;
		}
		return false;
	}



	/**
	 * Gets the the variables of the value of variable {@code this}. But only if this belongs to 
	 * the currently active stack frame / YAMMVariableAdapter.
	 * 
	 * @param variableList
	 * @param children
	 * @param debugEntryOfEReference
	 * @param adapterOfThis
	 */
	private void getYAMMVariablesOfCurrentThis(YAMMStackFrame frame, EList<EStructuralFeature> variableList, IVariable[] children, 
			VariableDebugEntry debugEntryOfEReference, YAMMVariableAdapter adapterOfThis, boolean variableIsSubordinated) 
	{
		EObject itsRmofClassValue = adapterOfThis.getItsRmofClassValue();
		int countVars = 0;
		int variableId = 0;
		int potentialOldId = 0;
		Object value = null;
		YAMMThread yammThread = (YAMMThread) fVariable.getStackFrame().getThread();

		for (EStructuralFeature featureOfEReference : variableList)
		{
			if (!(variableIsSubordinated && featureOfEReference.getName().equals("this"))) //don�t show "this" of subordinated Variables
			{
				if (featureOfEReference.getName().equals("rContainer")) //get value of eContainer
				{
					EObject obj  = (EObject)debugEntryOfEReference.getValue();
					value = obj.eContainer();
				}
				else //get Value of other EStructuralFeatures
					value = itsRmofClassValue.eGet(featureOfEReference);

				potentialOldId = generateVariableId(featureOfEReference, null, adapterOfThis);
				variableId = generateVariableId(featureOfEReference, value, adapterOfThis);

				if (!YAMMThread.objectReferences.containsKey(variableId)
						&& !YAMMThread.objectReferences.containsKey(potentialOldId))
				{
					YAMMThread.objectReferences.put(variableId, new VariableDebugEntry(featureOfEReference,  
							featureOfEReference.getName(), featureOfEReference.getClass().getName(), value, variableId));
				}
				else if (YAMMThread.objectReferences.containsKey(potentialOldId)
						&& value != null)
				{
					VariableDebugEntry debugEntry = YAMMThread.objectReferences.get(potentialOldId);		
					yammThread.checkValueOfVariable(potentialOldId, featureOfEReference, value, debugEntry, true, assignedAdapter);
				}
				else
				{
					VariableDebugEntry debugEntry = YAMMThread.objectReferences.get(variableId);		
					yammThread.checkValueOfVariable(variableId, featureOfEReference, value, debugEntry, true, assignedAdapter);
				}
				if (YAMMVariable.variableList.get(variableId) != null)
					children[countVars] = YAMMVariable.variableList.get(variableId);
				else
				{
					try 
					{
						children[countVars] = new YAMMVariable(frame, variableId, false, assignedAdapter);
					} catch (DebugException e) 
					{
						e.printStackTrace();
					}
				}
				countVars++;
			}
		}
	}



	/**
	 * Gets the EstructuralFeatures of a complex type. 
	 * 
	 * @param debugEntryOfEReference: The {@code VariableDebugEntry} instance of the EReference, holding 
	 * 								  the complex type in {@link VariableDebugEntry #value}.
	 * @return variableList			: An EList with the complex type's EStructuralFeatures
	 */
	public static EList<EStructuralFeature> getEStructuralFeaturesOfEReference(Object value) {
		EList<EStructuralFeature> variableList;
		if (value instanceof EList)
		{
			variableList = (EList<EStructuralFeature>) value;
		}
		else
		{
			EObject obj = (EObject) value;
			variableList = obj.eClass().getEAllStructuralFeatures();
		}
		return variableList;
	}
	
	/**
	 * Inhibits that a Variable representing keyword {@code this} refers to
	 * it self - so that there will not be an infinite loop in the 
	 * Variables View.
	 * 
	 * @param variableList	:	the list of variables assigned to a hierarchically
	 * 							higher-level variable
	 */
	private static void inhibitThisRefersToThis(EList<EStructuralFeature> variableList) 
	{
		for (EStructuralFeature potentialThis : variableList)
		{
			if (potentialThis.getName().equals("this"))
			{
				variableList.remove(potentialThis);
				break;
			}
		}
	}

	/**
	 * Checks if the value of an already existing variable has changed and registers the potential changes
	 * in the assigned {@code VariableDebugEntry} object. If the variable's value is a complex type having 
	 * EStructuralFeatures itself, changes their values either.
	 * 
	 * @param variableId		: {@link YAMMVariable #iD}
	 * @param featureAndValue	: the EStructuralFeature and it's value as an Entry of
	 * 							  {@link YAMMVariableAdapter #thisAndParamsOfSMs}
	 * @param debugEntry		: a {@code VariableDebugEntry} object - stores the data of 
	 * 							  a Variable
	 */
	public void checkValueOfVariable(int variableId, EObject newFeature, Object newValue, 
			VariableDebugEntry debugEntry, boolean isSubordinated) 
	{
		Object value = debugEntry.getValue();
		
		if (YAMMVariable.variableList.get(variableId) != null)
		{
			YAMMVariable currentVar = YAMMVariable.variableList.get(variableId);
			if (YAMMThread.valueOfFeatureHasChanged(newValue, debugEntry))
			{ 
				currentVar.setHasValueChanged(true);

				if (value == null)
				{
					YAMMThread.calculateNewVariableIdForNewValue(newFeature, newValue, debugEntry, assignedAdapter);
				}
				debugEntry.setValue(newValue);
			}
			if (currentVar.hasStructuralFeatures() && value != null)
			{

				EList<EStructuralFeature> allFeatures = YAMMValue.getEStructuralFeaturesOfEReference(value);
				IVariable[] children = new IVariable[allFeatures.size()];
				createOrGetYAMMVariablesOfEReference(currentVar.getStackFrame(), allFeatures, children, debugEntry, isSubordinated);
			}
		}
	}

	/**
	 * Checks if a {@code VariableDebugEntry} instance assigned to this complex type already exists. 
	 * If it does, gets the correspondent  {@code YAMMVariable} instance and refreshes its value.
	 * If it does not already exist, creates a new one (and also completes {@link YAMMThread #objectReferences} and
	 * {@code VariableDebugEntry}).
	 * 
	 * @param frame					: current {@code YAMMStackFrame}
	 * @param variableList			: List of Variables associated with a complex type
	 * @param debugEntryOfEReference: the assigned {@code VariableDebugEntry} object 
	 */
	public void createOrGetYAMMVariablesOfEReference(YAMMStackFrame frame, EList<EStructuralFeature> variableList, 
			IVariable[] children, VariableDebugEntry debugEntryOfEReference, boolean variableIsSubordinated) 
	{
		IVariable var = null;
		int countVars = 0;
		int objectKey = 0;
		Object value = null;
		EObject obj = (EObject) debugEntryOfEReference.getValue();

		for (EStructuralFeature featureOfEReference : variableList)
		{
			if (!(variableIsSubordinated && featureOfEReference.getName().equals("this")))
			{
				if (featureOfEReference.getName().equals("rContainer")) //get value of eContainer
				{
					EObject c = (EObject)debugEntryOfEReference.getValue();
					value =  c.eContainer();
				}
				else //get Value of other EStructuralFeatures
					value = obj.eGet(featureOfEReference);
				
				if (assignedAdapter == null)
					objectKey = generateVariableId(featureOfEReference, value, YAMMVariableAdapter.getAdapterOfActiveSM()); 
				else
					objectKey = generateVariableId(featureOfEReference, value, assignedAdapter);

				YAMMThread.objectReferences.put(objectKey, new VariableDebugEntry(featureOfEReference,  
						featureOfEReference.getName(), featureOfEReference.getClass().getName(), 
						value, objectKey));
				try 
				{
					var = new YAMMVariable(frame, objectKey, false, assignedAdapter); 
				} 
				catch (DebugException e) 
				{
					e.printStackTrace();
				}
				children[countVars] = var;
				countVars++;
			}
		}
	}

	/**
	 * Creates new {@code YAMMVariable}s when this YAMMValue object represents 
	 * an EList.
	 * 
	 * @param frame					:	the top stack frame in the Debug View
	 * @param children				:	an Array with right size for the created YAMMVariables
	 * @param debugEntryOfEReference:	the VariableDebugEntry of the EList
	 * @param list					:	the EList
	 * 
	 * @return						: 	children
	 */
	public IVariable[] createYAMMVariablesOfEList(YAMMStackFrame frame, 
			IVariable[] children, VariableDebugEntry debugEntryOfEReference, EList list)
	{
		IVariable var = null;
		int countVars = 0;
		int objectKey = 0;
		if (!list.isEmpty())
		{
			if (isPrimitiveType(list.get(0))
					|| (!(list.get(0) instanceof EObject)))
			{
				for (Object listElement :  list)
				{
					objectKey = createDebugEntryOfPrimitiveVarOfEList(list, listElement, countVars);
					try 
					{
						var = new YAMMVariable(frame, objectKey, true, assignedAdapter);
						
					} 
					catch (DebugException e) 
					{
						e.printStackTrace();
					}
					children[countVars] = var;
					countVars++;
				}
			}
			else
			{
				EList<EStructuralFeature> complexListElements = YAMMValue.getEStructuralFeaturesOfEReference(debugEntryOfEReference.getValue());
				children = new IVariable[complexListElements.size()];
				children = createReferenceTypedVarOfEList(frame, complexListElements, children, debugEntryOfEReference);
			}	
		}
		return children;
	}
 
	/**
	 * Creates an YAMMVariable for each Node of a HashMap (but not for key and value pair).
	 * 
	 * @param frame					: the associated {@code YAMMStackFrame object}
	 * @param map					: the HashMap
	 * @param debugEntryOfEReference: the {@code VariableDebugEntry} of the HashMap
	 * @param children				: an Array of the {@code YAMMVariable}s to be created
	 * @return						: children
	 */
	private IVariable[] createYAMMVariablesOfMapNodes(YAMMStackFrame frame, HashMap map, 
			 VariableDebugEntry debugEntryOfEReference, IVariable[] children)
	{
		IVariable var = null;
		int countVars = 0;
		int objectKey = 0;
		
		for (Object e : map.entrySet())
		{
			Entry entry = (Entry) e;
			int hashCodeForMapNode = entry.hashCode() + "java.util.HashMap$Node".hashCode(); // must not be the same as for HashMap
			
			if (assignedAdapter == null)
				objectKey = generateVariableId(debugEntryOfEReference.objectReference, hashCodeForMapNode, YAMMVariableAdapter.getAdapterOfActiveSM());
			else 
				objectKey = generateVariableId(debugEntryOfEReference.objectReference, hashCodeForMapNode, assignedAdapter);
			
			YAMMThread.objectReferences.put(objectKey, new MapDebugEntry(map, entry, "[" + (countVars) + "]", e.getClass().getTypeName(), 
						e.getClass(), objectKey));
				try 
				{
					var = new YAMMVariable(frame, objectKey, true, assignedAdapter); 
				} 
				catch (DebugException e1) 
				{
					e1.printStackTrace();
				}
			children[countVars] = var;
			countVars++;
		}
		return children;
	}
	
	/**
	 * Creates  new {@code YAMMVariable}s when this YAMMValue object represents 
	 * an EList holding reference typed elements.
	 * 
	 * @param frame					:	the top stack frame in the Debug View
	 * @param children				:	an Array with right size for the created YAMMVariables
	 * @param debugEntryOfEReference:	the VariableDebugEntry of the EList
	 * @param list					:	the EList
	 * 
	 * @return						: 	children
	 */
	private IVariable[] createReferenceTypedVarOfEList(YAMMStackFrame frame,
			EList<EStructuralFeature> complexListElements, IVariable[] children,
			VariableDebugEntry debugEntryOfEReference) 
	{
		IVariable var = null;
		int countVars = 0;
		int objectKey = 0;
		
		for (EObject featureOfEReference : complexListElements)
		{
			if (assignedAdapter == null)
				objectKey = generateVariableId(debugEntryOfEReference.objectReference,featureOfEReference, YAMMVariableAdapter.getAdapterOfActiveSM());
			else 
				objectKey = generateVariableId(debugEntryOfEReference.objectReference,featureOfEReference, assignedAdapter);
			
			YAMMThread.objectReferences.put(objectKey, new VariableDebugEntry(featureOfEReference,  
						"[" + (countVars) + "]", featureOfEReference.eClass().getClass().getTypeName(), 
						featureOfEReference, objectKey));
				try 
				{
					var = new YAMMVariable(frame, objectKey, true, assignedAdapter); 
				} 
				catch (DebugException e) 
				{
					e.printStackTrace();
				}
			children[countVars] = var;
			countVars++;
		}
		return children;
	}


	/**
	 * Creates a unique id for variables. Differentiates between simple and complex types and ELists. Differentiates
	 * also between several instances of one meta class by using the features value. 
	 * If an EReference has no value yet, uses a dummy until the EReference receives its value.
	 * @param metaObject	: the meta class
	 * @param objectValue	: value of {@code metaObject}
	 * @return
	 */
    public synchronized static int generateVariableId(EObject metaObject, Object objectValue, YAMMVariableAdapter adapter)
    {
    	int id = 0;
 
    	if (isPrimitiveType(objectValue))
    	{
    		UUID idOne = UUID.randomUUID();
			String str = "" + idOne;        
			int uid = str.hashCode();
			String filterStr = "" + uid;
			str = filterStr.replaceAll("-", "");
			id = Integer.parseInt(str);
			YAMMThread.listOfPrimitives.add(id);
    	}
    	else if (objectValue != null
    			||(objectValue instanceof EList)) 
    	{
    		id = metaObject.hashCode() 
    				+ objectValue.hashCode();
    	}
    	else
    	{
    		String differentiateComplexTypes = "differentiateComplexTypes";
    		id = metaObject.hashCode() 
    				+  adapter.getAdapterId() 
    				+ differentiateComplexTypes.hashCode();
    	}
    	return id;
    }


	/**
	 * Checks whether the specified element  is simple typed.
	 * 
	 * @param objectToCheck	:	the specified EList element
	 * @return				:	true - simple type
	 * 							false- complex type			 
	 */
	public synchronized static boolean isPrimitiveType(Object objectToCheck) 
	{
		if (objectToCheck != null)
		{
		return     objectToCheck.getClass().getName().equals("java.lang.Integer")
				|| objectToCheck.getClass().getName().equals("java.lang.Boolean") 
				|| objectToCheck.getClass().getName().equals("java.lang.String") 
				|| objectToCheck.getClass().getName().equals("java.lang.Float") 
				|| objectToCheck.getClass().getName().equals("java.lang.Double");
		}
		return false;
	}

	/**
	 * Creates a {@code VariableDebugEntry} for the key of a specified HashMap's Node.
	 *  
	 * @param key	: the key of a HashMap.Node
	 * @param map	: the map 
	 * @return		: the {@code YAMMVariable}'s ID
	 */
	private synchronized int createDebugEntryOfMapKey(Object key, HashMap map)
	{
		int objectKey = createUniqueIDForPrimitiveTypes();

		YAMMThread.objectReferences.put(objectKey, new VariableDebugEntry(null,  
				"key" , key.getClass().getName(), 
				key, objectKey));
		return objectKey;
	}
	
	/**
	 * Creates  new {@code YAMMVariable}s when this YAMMValue object represents 
	 * an EList holding elements of primitive type.
	 * 
	 * @param list			:	EList
	 * @param listElement	:	current element of the list
	 * @param index			:	current element's index
	 * 
	 * @return
	 */
	private synchronized int createDebugEntryOfPrimitiveVarOfEList(EList list, Object listElement, int index) {
		String variableName;
		variableName = "[" + index + "]";
		int objectKey = createUniqueIDForPrimitiveTypes();

		YAMMThread.objectReferences.put(objectKey, new VariableDebugEntry(null,  
				variableName, listElement.getClass().getName(), 
				listElement, objectKey));
		return objectKey;
	}

	private int createUniqueIDForPrimitiveTypes() 
	{
		UUID idOne = UUID.randomUUID();
		String str = "" + idOne;        
		int uid = str.hashCode();
		String filterStr = "" + uid;
		str = filterStr.replaceAll("-", "");
		int id = Integer.parseInt(str);
		YAMMThread.listOfPrimitives.add(id);
		return id;
	}



	/**
	 * Gets the key to the {@code YAMMDebugEntry} instance of {@link #fVariable}
	 * as the place where the Data of this variable is stored (in {@link YAMMThread #objectReferences}).
	 * 
	 * @return key	:	the key to {@code YAMMDebugEntry} 
	 * @throws DebugException
	 */
	private Object getKey() throws DebugException {
		Object key = null;
		if (YAMMThread.objectReferences.containsKey(fVariable.getName().hashCode())) {
			key = fVariable.getName().hashCode();
		} else if (YAMMThread.objectReferences.containsKey(fVariable.getiD())) {
			key = fVariable.getiD();
		}
		return key;
	}



	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IValue#hasVariables()
	 */
	public boolean hasVariables() throws DebugException {
		try 
		{
			EList<EStructuralFeature> variableList = null;
			VariableDebugEntry debugEntryOfEReferenceOrEList = fVariable.debugEntry;
			if (debugEntryOfEReferenceOrEList != null && debugEntryOfEReferenceOrEList.getValue() != null)
			{
				Object value = debugEntryOfEReferenceOrEList.getValue();
				
				if ((debugEntryOfEReferenceOrEList.variableType.equals("org.eclipse.emf.ecore.impl.EReferenceImpl")
						|| debugEntryOfEReferenceOrEList.variableType.equals("org.eclipse.emf.ecore.impl.EClassImpl")
						|| debugEntryOfEReferenceOrEList.variableType.equals("org.eclipse.emf.ecore.impl.DynamicEObjectImpl"))
						&& !(value instanceof EList))
				{
					variableList = getEStructuralFeaturesOfEReference(value);

					if (listContainsThis(variableList) && variableList.size() > 1)
						return true;
					if (!listContainsThis(variableList) && !variableList.isEmpty())
						return true;
				}
				if (value instanceof EList) 
				{
					EList list = (EList) value;
					if (!list.isEmpty())
					{
						return true;
					}
				}
				if (value instanceof java.util.HashMap) 
				{
					HashMap map = (HashMap) value;
					if (!map.isEmpty())
						return true;
				}
				if (debugEntryOfEReferenceOrEList instanceof MapDebugEntry)
				{
					return true;
				}
				if (value instanceof java.util.AbstractCollection)
				{
					java.util.AbstractCollection col = (java.util.AbstractCollection) value;
					if (!col.isEmpty())
					return true;
				}
			}
		} 
		catch (NullPointerException e)
		{
			
		}
		return false;

	}
	/*
	 *  (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		return obj instanceof YAMMValue && ((YAMMValue)obj).fValue.equals(fValue);
	}
	/*
	 *  (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return fValue.hashCode();
	}

	/**
	 * Returns the variable that this value was created for.
	 * 
	 * @return The variable that this value was created for.
	 * 
	 * @since 3.5
	 */
	public YAMMVariable getVariable() {
		return fVariable;
	}

	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IValue#getReferenceTypeName()
	 */
	public String getReferenceTypeName() throws DebugException { //TODO 

		Object key = getKey();
		if (key == null) {
			return "Unknown";
		}
		String eType = (YAMMThread.objectReferences.get(key)).variableName;
		String jType = (YAMMThread.objectReferences.get(key)).variableType;
		if ( eType.equals("unknown e-type" ) && !jType.equals("unknown type") ) {
			Integer lastChar = jType.lastIndexOf('$');
			if ( lastChar > 0 )
				return jType.substring(lastChar+1, jType.length());
			lastChar = jType.lastIndexOf('.');
			if ( lastChar > 0 )
				return jType.substring(lastChar+1, jType.length());
			return jType;
		}
		return eType;
	}
	
//	/** *************************************************Currently not used*********************************************


//	private VariableDebugEntry buildVariableDebugEntry(Object object, Object classObject) {
//		String eObjectType = "unknown e-type";
//		String objectType = "unknown type";
//		if (object != null) {
//			if (object instanceof EObject) {
//				eObjectType = ((EObject) object).eClass().getName();
//			} else if (object instanceof Object) {
//				objectType = object.getClass().toString();
//			}
//		} else {
//			if (classObject != null) {
//				if (classObject instanceof EClass) {
//					return new VariableDebugEntry(object, ((EClass) classObject).getName(), objectType);
//				} 
//				if (classObject instanceof EDataType) {			
//					return new VariableDebugEntry(object, eObjectType, ((EDataType) classObject).getName());
//				}
//				return new VariableDebugEntry(object, eObjectType, classObject.toString());
//			} else {
//				logger.error("object for building variable debug entry is null");
//			}
//		}
//		return new VariableDebugEntry(object, eObjectType, objectType);	
//	}
}
