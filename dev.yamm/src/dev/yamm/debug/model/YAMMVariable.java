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

import java.util.concurrent.ConcurrentHashMap;

import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.IValue;
import org.eclipse.debug.core.model.IVariable;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

import dev.yamm.gui.ImageRegistryProvider;

/**
 * A variable in a YAMM stack frame. There can be several types of variables on different 
 * hierarchical levels (as they are shown in  the variables view). On the top level, there
 * are 'this' (as the self reference of the class owning the executed operation) and parameters.
 * On following levels there can be primitive and complex attributes, lists, maps, their elements
 * or key - value pairs.
 */
public class YAMMVariable extends YAMMDebugElement implements IVariable {

	/** A list of all existing {@code YAMMVariable} instances.  */
	public static ConcurrentHashMap <Integer, YAMMVariable> variableList = new ConcurrentHashMap <Integer, YAMMVariable> ();
	
	/**Indicates if this {@code YAMMVariable}'s {@code YAMMValue} is a complex type having Structural Features
	 * (provided that the Variable has been  opened in the Variables View).*/
	private boolean hasStructuralFeatures;
	
	/** The name of the feature to show in the VariablesView and also of the correspondent {@code YAMMVariable} instance.*/
	private String fName;
	
	/** The variable's ID.*/
	private int iD;
	
	/** The icon assigned to a certain type of variable as it is shown in the Variables View.*/
	private Image icon;

	/** The object owning this Variable */
	public EObject owningObject;
	
	/** The {@code YAMMStackFrame} this {@code YAMMVariable} is assigned to.*/
	
	private YAMMStackFrame fFrame;
	
	/** Indicates whether a Variable value has changed. If it is true, the correspondent line's
	 * background in the Variables View is yellow highlighted. */
	private boolean valueHasChanged = false;
	
	/** Indicates whether this variable i*/
	private boolean isListElement = false;

	public VariableDebugEntry debugEntry = null;
	
	private final String FIELD_PUBLIC = "icons/field_public_obj.gif";
	private final String PARAMETER = "icons/parameter.gif";
	private final String LIST_ELEMENT = "icons/collection.gif";
	private final String LIST = "icons/list.gif";
	
	/**
	 * Constructs a variable contained in the given stack frame
	 * with the given name.
	 * 
	 * @param frame owning stack frame
	 * @param id variable name
	 * @throws DebugException 
	 */
	public YAMMVariable(YAMMStackFrame frame, int id, boolean isListElement, YAMMVariableAdapter adapterOfValue) throws DebugException {
		super(frame.getYAMMDebugTarget());
		fFrame = frame;
		setId(id);
		variableList.put(id, this);
		this.isListElement = isListElement;
		setName();
		setIcon(adapterOfValue);
		
	}

	/**
	 * Sets {@link #fName}.
	 */
	private void setName() 
	{
		debugEntry = YAMMThread.objectReferences.get(iD);
		if (debugEntry == null)
		{
			try {
				Thread.currentThread().sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		fName = debugEntry.variableName;
	}
	
	public void setFrame(YAMMStackFrame frame)
	{
		fFrame = frame;
	}
	

	/**
	 * Returns the stack frame owning this variable.
	 * 
	 * @return the stack frame owning this variable
	 */
	public YAMMStackFrame getStackFrame() {
		return fFrame;
	}
	
	/**
	 * A getter for Image {@link #icon}.
	 * 
	 * @return {@code icon}
	 */
	public Image getIcon() {
		return icon;
	}

	/**
	 * A setter for Image {@link #icon}. TODO
	 */
	public void setIcon(YAMMVariableAdapter adapterOfValue) {
		ImageDescriptor imageDescriptor = null;
		String key = null;
		switch (determineIconType(adapterOfValue))
		{
		case FIELD_PUBLIC:
			key = FIELD_PUBLIC;
			break;
		case PARAMETER:
			key = PARAMETER;
			break;
		case LIST_ELEMENT:
			key = LIST_ELEMENT;
			break;
		case LIST:
			key = LIST;
		}
		this.icon = ImageRegistryProvider.getImage(key);
	}
	
	/**
	 * To avoid running out of SWT handles, an ImageRegistry is used.
	 * 
	 * @param key : type of variable
	 * @param descriptor : ImageDescriptor of image
	 * @return Image image
	 */
	private Image getImage(String key, ImageDescriptor descriptor)
	{
		ImageRegistry imageRegistry = dev.yamm.init.Activator.getDefault().getImageRegistry();
		Image image = imageRegistry.get(key);
		
		if (image == null)
		{
			image = descriptor.createImage();
			imageRegistry.put(key, image);
		}
		return image;
	}

	
	/**
	 * Determines the type of the icon assigned to a variable in the Variables View - depending on type and 
	 * access modifier of the variable to be shown.
	 * @param adapterOfValue 
	 * @return 
	 */
	private String determineIconType(YAMMVariableAdapter adapterOfValue) {
		YAMMVariableAdapter activeAdapter = null;
		if (adapterOfValue == null)
			activeAdapter = YAMMVariableAdapter.getAdapterOfActiveSM();
		else 
			activeAdapter = adapterOfValue;
		if (activeAdapter.operationClass.eClass().getEStructuralFeatures() != null)
		{
			for (EStructuralFeature feature : activeAdapter.operationClass.eClass().getEStructuralFeatures())
			{
				if(!"itsRmofClass".equals(feature.getName())
						&& (fName.equals(feature.getName())))
				{
					return PARAMETER;
				}
			}
		}
		if (isListElement)
			return LIST_ELEMENT;
		if (isEList())
			return LIST;
		return FIELD_PUBLIC;
	}

	/**
	 * Checks if this variable is an EList.
	 * 
	 * @return	:	true - it is an EList
	 * 				false- otherwise
	 */
	private boolean isEList()
	{
		VariableDebugEntry variableEntry = YAMMThread.objectReferences.get(this.getiD());
		if (variableEntry != null && variableEntry.getValue() != null)
		{
			if (variableEntry.getValue() instanceof EList) 
				return true;
		}
		return false;
	}
	public Object getKey() throws DebugException {
		Object key = null;
		if (YAMMThread.objectReferences.containsKey(this.getName().hashCode())) {
			key = this.getName().hashCode();
		} else if (YAMMThread.objectReferences.containsKey(this.getiD())) {
			key = this.getiD();
		}
		return key;
	}
	

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IVariable#getValue()
	 */
	@SuppressWarnings("unchecked")
	public IValue getValue() throws DebugException {
		if (debugEntry != null && debugEntry .getValue() != null)
		{
			if (YAMMValue.isPrimitiveType(debugEntry.getValue())) 
				return new YAMMValue(this, debugEntry.getValue().toString());
			
			if (debugEntry.getValue() instanceof EList) 
				return new YAMMValue(this, debugEntry.getValue().getClass().getName());
			
			if (debugEntry.getValue() instanceof EObject)
			{
				EObject valueAsEObj = (EObject) debugEntry.getValue();
				return new YAMMValue(this, valueAsEObj.eClass().getName() + " (id: " + debugEntry.allReferenceIDs.get(debugEntry.getValue()) +")");
			}
			
			if (debugEntry.getValue() instanceof java.util.HashMap)
			{
				return new YAMMValue(this, debugEntry.getValue().getClass().getName());
			}
			
			if (debugEntry.variableType == "java.util.HashMap$Node")
			{
				debugEntry = (MapDebugEntry) debugEntry;
				return new YAMMValue(this, debugEntry.variableType);
			}
			
			if (debugEntry.getValue() instanceof java.util.AbstractCollection)
				return new YAMMValue(this, debugEntry.getValue().getClass().getName());
			else
			{
				return new YAMMValue(this, debugEntry.getValue().getClass().getName() + " | " + debugEntry.getValue().toString());
			}
		}
		else 
			return new YAMMValue(this, "null");
	}


	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IVariable#getName()
	 */
	public String getName() throws DebugException {
		return fName;
	}
	
	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IVariable#getReferenceTypeName()
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

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IVariable#hasValueChanged()
	 */
	public boolean hasValueChanged() throws DebugException {
		return valueHasChanged;
	}
	
	public void setHasValueChanged(boolean hasChanged)
	{
		valueHasChanged = hasChanged;
	}
	
	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IValueModification#setValue(java.lang.String)
	 */
	public void setValue(String expression) throws DebugException {
		//fireChangeEvent(DebugEvent.CONTENT);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IValueModification#supportsValueModification()
	 */
	public boolean supportsValueModification() {
		return true;
	}
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IValueModification#verifyValue(java.lang.String)
	 */
	public boolean verifyValue(String expression) throws DebugException {
		return true;
	}
	

	
// *********************************************************Following operations are currently not used
	private String checkPreviousValue(String newValue) {
		return newValue;
	}
	
	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IValueModification#verifyValue(org.eclipse.debug.core.model.IValue)
	 */
	public boolean verifyValue(IValue value) throws DebugException {
		return false;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IValueModification#setValue(org.eclipse.debug.core.model.IValue)
	 */
	public void setValue(IValue value) throws DebugException {
	}

	/**
	 * Gets the variable's ID .
	 * @return {@link #iD}
	 */
	public int getiD()
	{
		return iD;
	}

	/**
	 * Sets {@link #iD}.
	 */
	public void setId(int id) 
	{	
		this.iD = id;
	}

	/**
	 * Is true if {@code YAMMVariable}'s {@code RYAMMValue} is a complex type and
	 * has Structural Features (provided that the Variable has been  opened in the 
	 * Variables View).
	 * @return {@link #hasStructuralFeatures}
	 */
	public boolean hasStructuralFeatures() {
		return hasStructuralFeatures;
	}

	/**
	 * Sets {@link #hasStructuralFeatures}.
	 * @param hasStructuralFeatures
	 */
	public void setHasStructuralFeatures(boolean hasStructuralFeatures) {
		this.hasStructuralFeatures = hasStructuralFeatures;
	}
}
