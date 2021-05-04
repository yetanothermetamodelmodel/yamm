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
/**
 */
package dev.yamm.coreModelXmi.yamm.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import dev.yamm.coreModelXmi.yamm.SingleLinePropertyInfo;
import dev.yamm.coreModelXmi.yamm.YNamedElement;
import dev.yamm.coreModelXmi.yamm.YParameter;
import dev.yamm.coreModelXmi.yamm.YParameterDirectionKind;
import dev.yamm.coreModelXmi.yamm.YType;
import dev.yamm.coreModelXmi.yamm.YammPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YParameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YParameterImpl#isIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YParameterImpl#isIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YParameterImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YParameterImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YParameterImpl#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YParameterImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YParameterImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YParameterImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YParameterImpl#getType <em>Type</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YParameterImpl#getSignature <em>Signature</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YParameterImpl#isUpperboundWildcard <em>Upperbound Wildcard</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YParameterImpl#getPosObjectID <em>Pos Object ID</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YParameterImpl#getPosName <em>Pos Name</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YParameterImpl#getPosOrdered <em>Pos Ordered</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YParameterImpl#getPosUnique <em>Pos Unique</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YParameterImpl#getPosLower <em>Pos Lower</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YParameterImpl#getPosUpper <em>Pos Upper</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YParameterImpl#getPosUpperboundWildcard <em>Pos Upperbound Wildcard</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YParameterImpl#getPosDirection <em>Pos Direction</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YParameterImpl#getPosDefaultValue <em>Pos Default Value</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YParameterImpl#getPosType <em>Pos Type</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YParameterImpl#getPosQualifiedName <em>Pos Qualified Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class YParameterImpl extends YElementImpl implements YParameter
{
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * This is true if the Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nameESet;

	/**
	 * The default value of the '{@link #isIsOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOrdered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ORDERED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOrdered()
	 * @generated
	 * @ordered
	 */
	protected boolean isOrdered = IS_ORDERED_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_UNIQUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUnique()
	 * @generated
	 * @ordered
	 */
	protected boolean isUnique = IS_UNIQUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLower() <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected static final int LOWER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLower() <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected int lower = LOWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpper() <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected static final int UPPER_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getUpper() <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected int upper = UPPER_EDEFAULT;

	/**
	 * The default value of the '{@link #getQualifiedName() <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALIFIED_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQualifiedName() <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected String qualifiedName = QUALIFIED_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final YParameterDirectionKind DIRECTION_EDEFAULT = YParameterDirectionKind.IN;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected YParameterDirectionKind direction = DIRECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected String defaultValue = DEFAULT_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected YType type;

	/**
	 * The default value of the '{@link #getSignature() <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected static final String SIGNATURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSignature() <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected String signature = SIGNATURE_EDEFAULT;

	/**
	 * The default value of the '{@link #isUpperboundWildcard() <em>Upperbound Wildcard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUpperboundWildcard()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UPPERBOUND_WILDCARD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUpperboundWildcard() <em>Upperbound Wildcard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUpperboundWildcard()
	 * @generated
	 * @ordered
	 */
	protected boolean upperboundWildcard = UPPERBOUND_WILDCARD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPosObjectID() <em>Pos Object ID</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosObjectID()
	 * @generated
	 * @ordered
	 */
	protected SingleLinePropertyInfo posObjectID;

	/**
	 * The cached value of the '{@link #getPosName() <em>Pos Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosName()
	 * @generated
	 * @ordered
	 */
	protected SingleLinePropertyInfo posName;

	/**
	 * The cached value of the '{@link #getPosOrdered() <em>Pos Ordered</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosOrdered()
	 * @generated
	 * @ordered
	 */
	protected SingleLinePropertyInfo posOrdered;

	/**
	 * The cached value of the '{@link #getPosUnique() <em>Pos Unique</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosUnique()
	 * @generated
	 * @ordered
	 */
	protected SingleLinePropertyInfo posUnique;

	/**
	 * The cached value of the '{@link #getPosLower() <em>Pos Lower</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosLower()
	 * @generated
	 * @ordered
	 */
	protected SingleLinePropertyInfo posLower;

	/**
	 * The cached value of the '{@link #getPosUpper() <em>Pos Upper</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosUpper()
	 * @generated
	 * @ordered
	 */
	protected SingleLinePropertyInfo posUpper;

	/**
	 * The cached value of the '{@link #getPosUpperboundWildcard() <em>Pos Upperbound Wildcard</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosUpperboundWildcard()
	 * @generated
	 * @ordered
	 */
	protected SingleLinePropertyInfo posUpperboundWildcard;

	/**
	 * The cached value of the '{@link #getPosDirection() <em>Pos Direction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosDirection()
	 * @generated
	 * @ordered
	 */
	protected SingleLinePropertyInfo posDirection;

	/**
	 * The cached value of the '{@link #getPosDefaultValue() <em>Pos Default Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected SingleLinePropertyInfo posDefaultValue;

	/**
	 * The cached value of the '{@link #getPosType() <em>Pos Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosType()
	 * @generated
	 * @ordered
	 */
	protected SingleLinePropertyInfo posType;

	/**
	 * The cached value of the '{@link #getPosQualifiedName() <em>Pos Qualified Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected SingleLinePropertyInfo posQualifiedName;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YParameterImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return YammPackage.Literals.YPARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName)
	{
		String oldName = name;
		name = newName;
		boolean oldNameESet = nameESet;
		nameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YPARAMETER__NAME, oldName, name, !oldNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetName()
	{
		String oldName = name;
		boolean oldNameESet = nameESet;
		name = NAME_EDEFAULT;
		nameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, YammPackage.YPARAMETER__NAME, oldName, NAME_EDEFAULT, oldNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetName()
	{
		return nameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsOrdered()
	{
		return isOrdered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOrdered(boolean newIsOrdered)
	{
		boolean oldIsOrdered = isOrdered;
		isOrdered = newIsOrdered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YPARAMETER__IS_ORDERED, oldIsOrdered, isOrdered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsUnique()
	{
		return isUnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsUnique(boolean newIsUnique)
	{
		boolean oldIsUnique = isUnique;
		isUnique = newIsUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YPARAMETER__IS_UNIQUE, oldIsUnique, isUnique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLower()
	{
		return lower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLower(int newLower)
	{
		int oldLower = lower;
		lower = newLower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YPARAMETER__LOWER, oldLower, lower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUpper()
	{
		return upper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpper(int newUpper)
	{
		int oldUpper = upper;
		upper = newUpper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YPARAMETER__UPPER, oldUpper, upper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQualifiedName()
	{
		return qualifiedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualifiedName(String newQualifiedName)
	{
		String oldQualifiedName = qualifiedName;
		qualifiedName = newQualifiedName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YPARAMETER__QUALIFIED_NAME, oldQualifiedName, qualifiedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YParameterDirectionKind getDirection()
	{
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(YParameterDirectionKind newDirection)
	{
		YParameterDirectionKind oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YPARAMETER__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultValue()
	{
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(String newDefaultValue)
	{
		String oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YPARAMETER__DEFAULT_VALUE, oldDefaultValue, defaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription()
	{
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription)
	{
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YPARAMETER__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YType getType()
	{
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (YType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammPackage.YPARAMETER__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YType basicGetType()
	{
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(YType newType)
	{
		YType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YPARAMETER__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public String getSignature() {
		String signature = "no name ";
		if (getName() != null) {
			if (!getName().equals("")) {
				signature = getName() + " ";
			}
		}
		switch (getDirection().getValue()) {
		case 0:
			signature = "<i> " + signature;
			break;
		case 1:
			signature = "<io> " + signature;
			break;
		case 2:
			signature = "<o> " + signature;
			break;
		case 3:
			signature = "<r> " + signature;
			break;
		}
		if (getDescription() != null) {
			if (!getDescription().equals("")) {
				signature += "(" + getDescription() + ") ";
			}
		}
		if (getUpper() != 1 || getLower() != 1) {
			if(getUpper() == -1) {
				signature += "[" + getLower() + "..*] ";
			} else {
				signature += "[" + getLower() + ".." + getUpper() + "] ";
			}
		}
		if (isIsOrdered()) {
			signature += "{";
			if (isIsOrdered()) {
				if (isIsUnique() && getUpper() > 1) {
					signature += "ordered";
				} else {
					if(!isIsUnique()) {
						signature += "ordered, not unique";
					} else {
						signature += "ordered";
					}
					
				}
			}
			signature += "} ";
		} else if(!isIsUnique()) {
			signature += "{not unique}";
		}
		if (getType() != null) {
				signature += ": " + getType().getName() + " ";
		}
		if (getDefaultValue() != null) {
			if (!getDefaultValue().equals("")) {
				signature += "= " + getDefaultValue();
			}
		}
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void setSignature(String newSignature) {
		signature = newSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUpperboundWildcard()
	{
		return upperboundWildcard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperboundWildcard(boolean newUpperboundWildcard)
	{
		boolean oldUpperboundWildcard = upperboundWildcard;
		upperboundWildcard = newUpperboundWildcard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YPARAMETER__UPPERBOUND_WILDCARD, oldUpperboundWildcard, upperboundWildcard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo getPosObjectID()
	{
		if (posObjectID != null && posObjectID.eIsProxy()) {
			InternalEObject oldPosObjectID = (InternalEObject)posObjectID;
			posObjectID = (SingleLinePropertyInfo)eResolveProxy(oldPosObjectID);
			if (posObjectID != oldPosObjectID) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammPackage.YPARAMETER__POS_OBJECT_ID, oldPosObjectID, posObjectID));
			}
		}
		return posObjectID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo basicGetPosObjectID()
	{
		return posObjectID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosObjectID(SingleLinePropertyInfo newPosObjectID)
	{
		SingleLinePropertyInfo oldPosObjectID = posObjectID;
		posObjectID = newPosObjectID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YPARAMETER__POS_OBJECT_ID, oldPosObjectID, posObjectID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo getPosName()
	{
		if (posName != null && posName.eIsProxy()) {
			InternalEObject oldPosName = (InternalEObject)posName;
			posName = (SingleLinePropertyInfo)eResolveProxy(oldPosName);
			if (posName != oldPosName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammPackage.YPARAMETER__POS_NAME, oldPosName, posName));
			}
		}
		return posName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo basicGetPosName()
	{
		return posName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosName(SingleLinePropertyInfo newPosName)
	{
		SingleLinePropertyInfo oldPosName = posName;
		posName = newPosName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YPARAMETER__POS_NAME, oldPosName, posName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo getPosOrdered()
	{
		if (posOrdered != null && posOrdered.eIsProxy()) {
			InternalEObject oldPosOrdered = (InternalEObject)posOrdered;
			posOrdered = (SingleLinePropertyInfo)eResolveProxy(oldPosOrdered);
			if (posOrdered != oldPosOrdered) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammPackage.YPARAMETER__POS_ORDERED, oldPosOrdered, posOrdered));
			}
		}
		return posOrdered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo basicGetPosOrdered()
	{
		return posOrdered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosOrdered(SingleLinePropertyInfo newPosOrdered)
	{
		SingleLinePropertyInfo oldPosOrdered = posOrdered;
		posOrdered = newPosOrdered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YPARAMETER__POS_ORDERED, oldPosOrdered, posOrdered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo getPosUnique()
	{
		if (posUnique != null && posUnique.eIsProxy()) {
			InternalEObject oldPosUnique = (InternalEObject)posUnique;
			posUnique = (SingleLinePropertyInfo)eResolveProxy(oldPosUnique);
			if (posUnique != oldPosUnique) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammPackage.YPARAMETER__POS_UNIQUE, oldPosUnique, posUnique));
			}
		}
		return posUnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo basicGetPosUnique()
	{
		return posUnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosUnique(SingleLinePropertyInfo newPosUnique)
	{
		SingleLinePropertyInfo oldPosUnique = posUnique;
		posUnique = newPosUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YPARAMETER__POS_UNIQUE, oldPosUnique, posUnique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo getPosLower()
	{
		if (posLower != null && posLower.eIsProxy()) {
			InternalEObject oldPosLower = (InternalEObject)posLower;
			posLower = (SingleLinePropertyInfo)eResolveProxy(oldPosLower);
			if (posLower != oldPosLower) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammPackage.YPARAMETER__POS_LOWER, oldPosLower, posLower));
			}
		}
		return posLower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo basicGetPosLower()
	{
		return posLower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosLower(SingleLinePropertyInfo newPosLower)
	{
		SingleLinePropertyInfo oldPosLower = posLower;
		posLower = newPosLower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YPARAMETER__POS_LOWER, oldPosLower, posLower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo getPosUpper()
	{
		if (posUpper != null && posUpper.eIsProxy()) {
			InternalEObject oldPosUpper = (InternalEObject)posUpper;
			posUpper = (SingleLinePropertyInfo)eResolveProxy(oldPosUpper);
			if (posUpper != oldPosUpper) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammPackage.YPARAMETER__POS_UPPER, oldPosUpper, posUpper));
			}
		}
		return posUpper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo basicGetPosUpper()
	{
		return posUpper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosUpper(SingleLinePropertyInfo newPosUpper)
	{
		SingleLinePropertyInfo oldPosUpper = posUpper;
		posUpper = newPosUpper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YPARAMETER__POS_UPPER, oldPosUpper, posUpper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo getPosUpperboundWildcard()
	{
		if (posUpperboundWildcard != null && posUpperboundWildcard.eIsProxy()) {
			InternalEObject oldPosUpperboundWildcard = (InternalEObject)posUpperboundWildcard;
			posUpperboundWildcard = (SingleLinePropertyInfo)eResolveProxy(oldPosUpperboundWildcard);
			if (posUpperboundWildcard != oldPosUpperboundWildcard) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammPackage.YPARAMETER__POS_UPPERBOUND_WILDCARD, oldPosUpperboundWildcard, posUpperboundWildcard));
			}
		}
		return posUpperboundWildcard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo basicGetPosUpperboundWildcard()
	{
		return posUpperboundWildcard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosUpperboundWildcard(SingleLinePropertyInfo newPosUpperboundWildcard)
	{
		SingleLinePropertyInfo oldPosUpperboundWildcard = posUpperboundWildcard;
		posUpperboundWildcard = newPosUpperboundWildcard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YPARAMETER__POS_UPPERBOUND_WILDCARD, oldPosUpperboundWildcard, posUpperboundWildcard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo getPosDirection()
	{
		if (posDirection != null && posDirection.eIsProxy()) {
			InternalEObject oldPosDirection = (InternalEObject)posDirection;
			posDirection = (SingleLinePropertyInfo)eResolveProxy(oldPosDirection);
			if (posDirection != oldPosDirection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammPackage.YPARAMETER__POS_DIRECTION, oldPosDirection, posDirection));
			}
		}
		return posDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo basicGetPosDirection()
	{
		return posDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosDirection(SingleLinePropertyInfo newPosDirection)
	{
		SingleLinePropertyInfo oldPosDirection = posDirection;
		posDirection = newPosDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YPARAMETER__POS_DIRECTION, oldPosDirection, posDirection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo getPosDefaultValue()
	{
		if (posDefaultValue != null && posDefaultValue.eIsProxy()) {
			InternalEObject oldPosDefaultValue = (InternalEObject)posDefaultValue;
			posDefaultValue = (SingleLinePropertyInfo)eResolveProxy(oldPosDefaultValue);
			if (posDefaultValue != oldPosDefaultValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammPackage.YPARAMETER__POS_DEFAULT_VALUE, oldPosDefaultValue, posDefaultValue));
			}
		}
		return posDefaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo basicGetPosDefaultValue()
	{
		return posDefaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosDefaultValue(SingleLinePropertyInfo newPosDefaultValue)
	{
		SingleLinePropertyInfo oldPosDefaultValue = posDefaultValue;
		posDefaultValue = newPosDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YPARAMETER__POS_DEFAULT_VALUE, oldPosDefaultValue, posDefaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo getPosType()
	{
		if (posType != null && posType.eIsProxy()) {
			InternalEObject oldPosType = (InternalEObject)posType;
			posType = (SingleLinePropertyInfo)eResolveProxy(oldPosType);
			if (posType != oldPosType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammPackage.YPARAMETER__POS_TYPE, oldPosType, posType));
			}
		}
		return posType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo basicGetPosType()
	{
		return posType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosType(SingleLinePropertyInfo newPosType)
	{
		SingleLinePropertyInfo oldPosType = posType;
		posType = newPosType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YPARAMETER__POS_TYPE, oldPosType, posType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo getPosQualifiedName()
	{
		if (posQualifiedName != null && posQualifiedName.eIsProxy()) {
			InternalEObject oldPosQualifiedName = (InternalEObject)posQualifiedName;
			posQualifiedName = (SingleLinePropertyInfo)eResolveProxy(oldPosQualifiedName);
			if (posQualifiedName != oldPosQualifiedName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammPackage.YPARAMETER__POS_QUALIFIED_NAME, oldPosQualifiedName, posQualifiedName));
			}
		}
		return posQualifiedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo basicGetPosQualifiedName()
	{
		return posQualifiedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosQualifiedName(SingleLinePropertyInfo newPosQualifiedName)
	{
		SingleLinePropertyInfo oldPosQualifiedName = posQualifiedName;
		posQualifiedName = newPosQualifiedName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YPARAMETER__POS_QUALIFIED_NAME, oldPosQualifiedName, posQualifiedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID) {
			case YammPackage.YPARAMETER__NAME:
				return getName();
			case YammPackage.YPARAMETER__IS_ORDERED:
				return isIsOrdered();
			case YammPackage.YPARAMETER__IS_UNIQUE:
				return isIsUnique();
			case YammPackage.YPARAMETER__LOWER:
				return getLower();
			case YammPackage.YPARAMETER__UPPER:
				return getUpper();
			case YammPackage.YPARAMETER__QUALIFIED_NAME:
				return getQualifiedName();
			case YammPackage.YPARAMETER__DIRECTION:
				return getDirection();
			case YammPackage.YPARAMETER__DEFAULT_VALUE:
				return getDefaultValue();
			case YammPackage.YPARAMETER__DESCRIPTION:
				return getDescription();
			case YammPackage.YPARAMETER__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case YammPackage.YPARAMETER__SIGNATURE:
				return getSignature();
			case YammPackage.YPARAMETER__UPPERBOUND_WILDCARD:
				return isUpperboundWildcard();
			case YammPackage.YPARAMETER__POS_OBJECT_ID:
				if (resolve) return getPosObjectID();
				return basicGetPosObjectID();
			case YammPackage.YPARAMETER__POS_NAME:
				if (resolve) return getPosName();
				return basicGetPosName();
			case YammPackage.YPARAMETER__POS_ORDERED:
				if (resolve) return getPosOrdered();
				return basicGetPosOrdered();
			case YammPackage.YPARAMETER__POS_UNIQUE:
				if (resolve) return getPosUnique();
				return basicGetPosUnique();
			case YammPackage.YPARAMETER__POS_LOWER:
				if (resolve) return getPosLower();
				return basicGetPosLower();
			case YammPackage.YPARAMETER__POS_UPPER:
				if (resolve) return getPosUpper();
				return basicGetPosUpper();
			case YammPackage.YPARAMETER__POS_UPPERBOUND_WILDCARD:
				if (resolve) return getPosUpperboundWildcard();
				return basicGetPosUpperboundWildcard();
			case YammPackage.YPARAMETER__POS_DIRECTION:
				if (resolve) return getPosDirection();
				return basicGetPosDirection();
			case YammPackage.YPARAMETER__POS_DEFAULT_VALUE:
				if (resolve) return getPosDefaultValue();
				return basicGetPosDefaultValue();
			case YammPackage.YPARAMETER__POS_TYPE:
				if (resolve) return getPosType();
				return basicGetPosType();
			case YammPackage.YPARAMETER__POS_QUALIFIED_NAME:
				if (resolve) return getPosQualifiedName();
				return basicGetPosQualifiedName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID) {
			case YammPackage.YPARAMETER__NAME:
				setName((String)newValue);
				return;
			case YammPackage.YPARAMETER__IS_ORDERED:
				setIsOrdered((Boolean)newValue);
				return;
			case YammPackage.YPARAMETER__IS_UNIQUE:
				setIsUnique((Boolean)newValue);
				return;
			case YammPackage.YPARAMETER__LOWER:
				setLower((Integer)newValue);
				return;
			case YammPackage.YPARAMETER__UPPER:
				setUpper((Integer)newValue);
				return;
			case YammPackage.YPARAMETER__QUALIFIED_NAME:
				setQualifiedName((String)newValue);
				return;
			case YammPackage.YPARAMETER__DIRECTION:
				setDirection((YParameterDirectionKind)newValue);
				return;
			case YammPackage.YPARAMETER__DEFAULT_VALUE:
				setDefaultValue((String)newValue);
				return;
			case YammPackage.YPARAMETER__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case YammPackage.YPARAMETER__TYPE:
				setType((YType)newValue);
				return;
			case YammPackage.YPARAMETER__SIGNATURE:
				setSignature((String)newValue);
				return;
			case YammPackage.YPARAMETER__UPPERBOUND_WILDCARD:
				setUpperboundWildcard((Boolean)newValue);
				return;
			case YammPackage.YPARAMETER__POS_OBJECT_ID:
				setPosObjectID((SingleLinePropertyInfo)newValue);
				return;
			case YammPackage.YPARAMETER__POS_NAME:
				setPosName((SingleLinePropertyInfo)newValue);
				return;
			case YammPackage.YPARAMETER__POS_ORDERED:
				setPosOrdered((SingleLinePropertyInfo)newValue);
				return;
			case YammPackage.YPARAMETER__POS_UNIQUE:
				setPosUnique((SingleLinePropertyInfo)newValue);
				return;
			case YammPackage.YPARAMETER__POS_LOWER:
				setPosLower((SingleLinePropertyInfo)newValue);
				return;
			case YammPackage.YPARAMETER__POS_UPPER:
				setPosUpper((SingleLinePropertyInfo)newValue);
				return;
			case YammPackage.YPARAMETER__POS_UPPERBOUND_WILDCARD:
				setPosUpperboundWildcard((SingleLinePropertyInfo)newValue);
				return;
			case YammPackage.YPARAMETER__POS_DIRECTION:
				setPosDirection((SingleLinePropertyInfo)newValue);
				return;
			case YammPackage.YPARAMETER__POS_DEFAULT_VALUE:
				setPosDefaultValue((SingleLinePropertyInfo)newValue);
				return;
			case YammPackage.YPARAMETER__POS_TYPE:
				setPosType((SingleLinePropertyInfo)newValue);
				return;
			case YammPackage.YPARAMETER__POS_QUALIFIED_NAME:
				setPosQualifiedName((SingleLinePropertyInfo)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID) {
			case YammPackage.YPARAMETER__NAME:
				unsetName();
				return;
			case YammPackage.YPARAMETER__IS_ORDERED:
				setIsOrdered(IS_ORDERED_EDEFAULT);
				return;
			case YammPackage.YPARAMETER__IS_UNIQUE:
				setIsUnique(IS_UNIQUE_EDEFAULT);
				return;
			case YammPackage.YPARAMETER__LOWER:
				setLower(LOWER_EDEFAULT);
				return;
			case YammPackage.YPARAMETER__UPPER:
				setUpper(UPPER_EDEFAULT);
				return;
			case YammPackage.YPARAMETER__QUALIFIED_NAME:
				setQualifiedName(QUALIFIED_NAME_EDEFAULT);
				return;
			case YammPackage.YPARAMETER__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
				return;
			case YammPackage.YPARAMETER__DEFAULT_VALUE:
				setDefaultValue(DEFAULT_VALUE_EDEFAULT);
				return;
			case YammPackage.YPARAMETER__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case YammPackage.YPARAMETER__TYPE:
				setType((YType)null);
				return;
			case YammPackage.YPARAMETER__SIGNATURE:
				setSignature(SIGNATURE_EDEFAULT);
				return;
			case YammPackage.YPARAMETER__UPPERBOUND_WILDCARD:
				setUpperboundWildcard(UPPERBOUND_WILDCARD_EDEFAULT);
				return;
			case YammPackage.YPARAMETER__POS_OBJECT_ID:
				setPosObjectID((SingleLinePropertyInfo)null);
				return;
			case YammPackage.YPARAMETER__POS_NAME:
				setPosName((SingleLinePropertyInfo)null);
				return;
			case YammPackage.YPARAMETER__POS_ORDERED:
				setPosOrdered((SingleLinePropertyInfo)null);
				return;
			case YammPackage.YPARAMETER__POS_UNIQUE:
				setPosUnique((SingleLinePropertyInfo)null);
				return;
			case YammPackage.YPARAMETER__POS_LOWER:
				setPosLower((SingleLinePropertyInfo)null);
				return;
			case YammPackage.YPARAMETER__POS_UPPER:
				setPosUpper((SingleLinePropertyInfo)null);
				return;
			case YammPackage.YPARAMETER__POS_UPPERBOUND_WILDCARD:
				setPosUpperboundWildcard((SingleLinePropertyInfo)null);
				return;
			case YammPackage.YPARAMETER__POS_DIRECTION:
				setPosDirection((SingleLinePropertyInfo)null);
				return;
			case YammPackage.YPARAMETER__POS_DEFAULT_VALUE:
				setPosDefaultValue((SingleLinePropertyInfo)null);
				return;
			case YammPackage.YPARAMETER__POS_TYPE:
				setPosType((SingleLinePropertyInfo)null);
				return;
			case YammPackage.YPARAMETER__POS_QUALIFIED_NAME:
				setPosQualifiedName((SingleLinePropertyInfo)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID) {
			case YammPackage.YPARAMETER__NAME:
				return isSetName();
			case YammPackage.YPARAMETER__IS_ORDERED:
				return isOrdered != IS_ORDERED_EDEFAULT;
			case YammPackage.YPARAMETER__IS_UNIQUE:
				return isUnique != IS_UNIQUE_EDEFAULT;
			case YammPackage.YPARAMETER__LOWER:
				return lower != LOWER_EDEFAULT;
			case YammPackage.YPARAMETER__UPPER:
				return upper != UPPER_EDEFAULT;
			case YammPackage.YPARAMETER__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? qualifiedName != null : !QUALIFIED_NAME_EDEFAULT.equals(qualifiedName);
			case YammPackage.YPARAMETER__DIRECTION:
				return direction != DIRECTION_EDEFAULT;
			case YammPackage.YPARAMETER__DEFAULT_VALUE:
				return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
			case YammPackage.YPARAMETER__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case YammPackage.YPARAMETER__TYPE:
				return type != null;
			case YammPackage.YPARAMETER__SIGNATURE:
				return SIGNATURE_EDEFAULT == null ? signature != null : !SIGNATURE_EDEFAULT.equals(signature);
			case YammPackage.YPARAMETER__UPPERBOUND_WILDCARD:
				return upperboundWildcard != UPPERBOUND_WILDCARD_EDEFAULT;
			case YammPackage.YPARAMETER__POS_OBJECT_ID:
				return posObjectID != null;
			case YammPackage.YPARAMETER__POS_NAME:
				return posName != null;
			case YammPackage.YPARAMETER__POS_ORDERED:
				return posOrdered != null;
			case YammPackage.YPARAMETER__POS_UNIQUE:
				return posUnique != null;
			case YammPackage.YPARAMETER__POS_LOWER:
				return posLower != null;
			case YammPackage.YPARAMETER__POS_UPPER:
				return posUpper != null;
			case YammPackage.YPARAMETER__POS_UPPERBOUND_WILDCARD:
				return posUpperboundWildcard != null;
			case YammPackage.YPARAMETER__POS_DIRECTION:
				return posDirection != null;
			case YammPackage.YPARAMETER__POS_DEFAULT_VALUE:
				return posDefaultValue != null;
			case YammPackage.YPARAMETER__POS_TYPE:
				return posType != null;
			case YammPackage.YPARAMETER__POS_QUALIFIED_NAME:
				return posQualifiedName != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
	{
		if (baseClass == YNamedElement.class) {
			switch (derivedFeatureID) {
				case YammPackage.YPARAMETER__NAME: return YammPackage.YNAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
	{
		if (baseClass == YNamedElement.class) {
			switch (baseFeatureID) {
				case YammPackage.YNAMED_ELEMENT__NAME: return YammPackage.YPARAMETER__NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		if (nameESet) result.append(name); else result.append("<unset>");
		result.append(", isOrdered: ");
		result.append(isOrdered);
		result.append(", isUnique: ");
		result.append(isUnique);
		result.append(", lower: ");
		result.append(lower);
		result.append(", upper: ");
		result.append(upper);
		result.append(", qualifiedName: ");
		result.append(qualifiedName);
		result.append(", direction: ");
		result.append(direction);
		result.append(", defaultValue: ");
		result.append(defaultValue);
		result.append(", description: ");
		result.append(description);
		result.append(", signature: ");
		result.append(signature);
		result.append(", upperboundWildcard: ");
		result.append(upperboundWildcard);
		result.append(')');
		return result.toString();
	}

} //YParameterImpl
