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
/**
 */
package online.yamm.coreModelDiagram.yammDiagram.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import online.yamm.coreModelDiagram.yammDiagram.YClass;
import online.yamm.coreModelDiagram.yammDiagram.YEnumeration;
import online.yamm.coreModelDiagram.yammDiagram.YNamedElement;
import online.yamm.coreModelDiagram.yammDiagram.YParameter;
import online.yamm.coreModelDiagram.yammDiagram.YParameterDirectionKind;
import online.yamm.coreModelDiagram.yammDiagram.YType;
import online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YParameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.impl.YParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.impl.YParameterImpl#isIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.impl.YParameterImpl#isIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.impl.YParameterImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.impl.YParameterImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.impl.YParameterImpl#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.impl.YParameterImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.impl.YParameterImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.impl.YParameterImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.impl.YParameterImpl#getType <em>Type</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.impl.YParameterImpl#getSignature <em>Signature</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.impl.YParameterImpl#isUpperboundWildcard <em>Upperbound Wildcard</em>}</li>
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
		return YammDiagramPackage.Literals.YPARAMETER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YPARAMETER__NAME, oldName, name, !oldNameESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, YammDiagramPackage.YPARAMETER__NAME, oldName, NAME_EDEFAULT, oldNameESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YPARAMETER__IS_ORDERED, oldIsOrdered, isOrdered));
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
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YPARAMETER__IS_UNIQUE, oldIsUnique, isUnique));
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
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YPARAMETER__LOWER, oldLower, lower));
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
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YPARAMETER__UPPER, oldUpper, upper));
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
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YPARAMETER__QUALIFIED_NAME, oldQualifiedName, qualifiedName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YPARAMETER__DIRECTION, oldDirection, direction));
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
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YPARAMETER__DEFAULT_VALUE, oldDefaultValue, defaultValue));
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
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YPARAMETER__DESCRIPTION, oldDescription, description));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammDiagramPackage.YPARAMETER__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YPARAMETER__TYPE, oldType, type));
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
		} else if(!isIsUnique() && getUpper() != 1) {
			signature += "{not unique}";
		}
		if (getType() != null) {
			if (getType() instanceof YClass)
			{
				String t = ((YClass) getType()).getQualifiedName();
				if (t.startsWith("Types."))
					t = t.substring(6);
				signature += ": " + t + " ";
			}
			else if (getType() instanceof YEnumeration)
				signature += ": " + ((YEnumeration) getType()).getQualifiedName() + " ";
			else
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
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YPARAMETER__UPPERBOUND_WILDCARD, oldUpperboundWildcard, upperboundWildcard));
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
			case YammDiagramPackage.YPARAMETER__NAME:
				return getName();
			case YammDiagramPackage.YPARAMETER__IS_ORDERED:
				return isIsOrdered();
			case YammDiagramPackage.YPARAMETER__IS_UNIQUE:
				return isIsUnique();
			case YammDiagramPackage.YPARAMETER__LOWER:
				return getLower();
			case YammDiagramPackage.YPARAMETER__UPPER:
				return getUpper();
			case YammDiagramPackage.YPARAMETER__QUALIFIED_NAME:
				return getQualifiedName();
			case YammDiagramPackage.YPARAMETER__DIRECTION:
				return getDirection();
			case YammDiagramPackage.YPARAMETER__DEFAULT_VALUE:
				return getDefaultValue();
			case YammDiagramPackage.YPARAMETER__DESCRIPTION:
				return getDescription();
			case YammDiagramPackage.YPARAMETER__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case YammDiagramPackage.YPARAMETER__SIGNATURE:
				return getSignature();
			case YammDiagramPackage.YPARAMETER__UPPERBOUND_WILDCARD:
				return isUpperboundWildcard();
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
			case YammDiagramPackage.YPARAMETER__NAME:
				setName((String)newValue);
				return;
			case YammDiagramPackage.YPARAMETER__IS_ORDERED:
				setIsOrdered((Boolean)newValue);
				return;
			case YammDiagramPackage.YPARAMETER__IS_UNIQUE:
				setIsUnique((Boolean)newValue);
				return;
			case YammDiagramPackage.YPARAMETER__LOWER:
				setLower((Integer)newValue);
				return;
			case YammDiagramPackage.YPARAMETER__UPPER:
				setUpper((Integer)newValue);
				return;
			case YammDiagramPackage.YPARAMETER__QUALIFIED_NAME:
				setQualifiedName((String)newValue);
				return;
			case YammDiagramPackage.YPARAMETER__DIRECTION:
				setDirection((YParameterDirectionKind)newValue);
				return;
			case YammDiagramPackage.YPARAMETER__DEFAULT_VALUE:
				setDefaultValue((String)newValue);
				return;
			case YammDiagramPackage.YPARAMETER__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case YammDiagramPackage.YPARAMETER__TYPE:
				setType((YType)newValue);
				return;
			case YammDiagramPackage.YPARAMETER__SIGNATURE:
				setSignature((String)newValue);
				return;
			case YammDiagramPackage.YPARAMETER__UPPERBOUND_WILDCARD:
				setUpperboundWildcard((Boolean)newValue);
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
			case YammDiagramPackage.YPARAMETER__NAME:
				unsetName();
				return;
			case YammDiagramPackage.YPARAMETER__IS_ORDERED:
				setIsOrdered(IS_ORDERED_EDEFAULT);
				return;
			case YammDiagramPackage.YPARAMETER__IS_UNIQUE:
				setIsUnique(IS_UNIQUE_EDEFAULT);
				return;
			case YammDiagramPackage.YPARAMETER__LOWER:
				setLower(LOWER_EDEFAULT);
				return;
			case YammDiagramPackage.YPARAMETER__UPPER:
				setUpper(UPPER_EDEFAULT);
				return;
			case YammDiagramPackage.YPARAMETER__QUALIFIED_NAME:
				setQualifiedName(QUALIFIED_NAME_EDEFAULT);
				return;
			case YammDiagramPackage.YPARAMETER__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
				return;
			case YammDiagramPackage.YPARAMETER__DEFAULT_VALUE:
				setDefaultValue(DEFAULT_VALUE_EDEFAULT);
				return;
			case YammDiagramPackage.YPARAMETER__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case YammDiagramPackage.YPARAMETER__TYPE:
				setType((YType)null);
				return;
			case YammDiagramPackage.YPARAMETER__SIGNATURE:
				setSignature(SIGNATURE_EDEFAULT);
				return;
			case YammDiagramPackage.YPARAMETER__UPPERBOUND_WILDCARD:
				setUpperboundWildcard(UPPERBOUND_WILDCARD_EDEFAULT);
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
			case YammDiagramPackage.YPARAMETER__NAME:
				return isSetName();
			case YammDiagramPackage.YPARAMETER__IS_ORDERED:
				return isOrdered != IS_ORDERED_EDEFAULT;
			case YammDiagramPackage.YPARAMETER__IS_UNIQUE:
				return isUnique != IS_UNIQUE_EDEFAULT;
			case YammDiagramPackage.YPARAMETER__LOWER:
				return lower != LOWER_EDEFAULT;
			case YammDiagramPackage.YPARAMETER__UPPER:
				return upper != UPPER_EDEFAULT;
			case YammDiagramPackage.YPARAMETER__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? qualifiedName != null : !QUALIFIED_NAME_EDEFAULT.equals(qualifiedName);
			case YammDiagramPackage.YPARAMETER__DIRECTION:
				return direction != DIRECTION_EDEFAULT;
			case YammDiagramPackage.YPARAMETER__DEFAULT_VALUE:
				return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
			case YammDiagramPackage.YPARAMETER__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case YammDiagramPackage.YPARAMETER__TYPE:
				return type != null;
			case YammDiagramPackage.YPARAMETER__SIGNATURE:
				return SIGNATURE_EDEFAULT == null ? signature != null : !SIGNATURE_EDEFAULT.equals(signature);
			case YammDiagramPackage.YPARAMETER__UPPERBOUND_WILDCARD:
				return upperboundWildcard != UPPERBOUND_WILDCARD_EDEFAULT;
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
				case YammDiagramPackage.YPARAMETER__NAME: return YammDiagramPackage.YNAMED_ELEMENT__NAME;
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
				case YammDiagramPackage.YNAMED_ELEMENT__NAME: return YammDiagramPackage.YPARAMETER__NAME;
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
