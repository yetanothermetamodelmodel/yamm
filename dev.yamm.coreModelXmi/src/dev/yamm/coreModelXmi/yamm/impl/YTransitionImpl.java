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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import dev.yamm.coreModelXmi.yamm.SingleLinePropertyInfo;
import dev.yamm.coreModelXmi.yamm.YComment;
import dev.yamm.coreModelXmi.yamm.YElement;
import dev.yamm.coreModelXmi.yamm.YNamedElement;
import dev.yamm.coreModelXmi.yamm.YTrAttachment;
import dev.yamm.coreModelXmi.yamm.YTransition;
import dev.yamm.coreModelXmi.yamm.YVertex;
import dev.yamm.coreModelXmi.yamm.YammPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YTransition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YTransitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YTransitionImpl#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YTransitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YTransitionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YTransitionImpl#getAttachment <em>Attachment</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YTransitionImpl#getOwnedComment <em>Owned Comment</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YTransitionImpl#getOwnedElement <em>Owned Element</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YTransitionImpl#getPosObjectID <em>Pos Object ID</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YTransitionImpl#getPosName <em>Pos Name</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YTransitionImpl#getPosQualifiedName <em>Pos Qualified Name</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YTransitionImpl#getPosSource <em>Pos Source</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YTransitionImpl#getPosTarget <em>Pos Target</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.impl.YTransitionImpl#getPosAttachment <em>Pos Attachment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class YTransitionImpl extends YElementImpl implements YTransition
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
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected YVertex source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected YVertex target;

	/**
	 * The cached value of the '{@link #getAttachment() <em>Attachment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachment()
	 * @generated
	 * @ordered
	 */
	protected YTrAttachment attachment;

	/**
	 * The cached value of the '{@link #getOwnedComment() <em>Owned Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedComment()
	 * @generated
	 * @ordered
	 */
	protected YComment ownedComment;

	/**
	 * The cached value of the '{@link #getOwnedElement() <em>Owned Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElement()
	 * @generated
	 * @ordered
	 */
	protected EList<YElement> ownedElement;

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
	 * The cached value of the '{@link #getPosQualifiedName() <em>Pos Qualified Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected SingleLinePropertyInfo posQualifiedName;

	/**
	 * The cached value of the '{@link #getPosSource() <em>Pos Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosSource()
	 * @generated
	 * @ordered
	 */
	protected SingleLinePropertyInfo posSource;

	/**
	 * The cached value of the '{@link #getPosTarget() <em>Pos Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosTarget()
	 * @generated
	 * @ordered
	 */
	protected SingleLinePropertyInfo posTarget;

	/**
	 * The cached value of the '{@link #getPosAttachment() <em>Pos Attachment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosAttachment()
	 * @generated
	 * @ordered
	 */
	protected SingleLinePropertyInfo posAttachment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YTransitionImpl()
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
		return YammPackage.Literals.YTRANSITION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YTRANSITION__NAME, oldName, name, !oldNameESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, YammPackage.YTRANSITION__NAME, oldName, NAME_EDEFAULT, oldNameESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YTRANSITION__QUALIFIED_NAME, oldQualifiedName, qualifiedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YVertex getSource()
	{
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (YVertex)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammPackage.YTRANSITION__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YVertex basicGetSource()
	{
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(YVertex newSource)
	{
		YVertex oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YTRANSITION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YVertex getTarget()
	{
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (YVertex)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammPackage.YTRANSITION__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YVertex basicGetTarget()
	{
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(YVertex newTarget)
	{
		YVertex oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YTRANSITION__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YTrAttachment getAttachment()
	{
		if (attachment != null && attachment.eIsProxy()) {
			InternalEObject oldAttachment = (InternalEObject)attachment;
			attachment = (YTrAttachment)eResolveProxy(oldAttachment);
			if (attachment != oldAttachment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammPackage.YTRANSITION__ATTACHMENT, oldAttachment, attachment));
			}
		}
		return attachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YTrAttachment basicGetAttachment()
	{
		return attachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachment(YTrAttachment newAttachment)
	{
		YTrAttachment oldAttachment = attachment;
		attachment = newAttachment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YTRANSITION__ATTACHMENT, oldAttachment, attachment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YComment getOwnedComment()
	{
		return ownedComment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedComment(YComment newOwnedComment, NotificationChain msgs)
	{
		YComment oldOwnedComment = ownedComment;
		ownedComment = newOwnedComment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, YammPackage.YTRANSITION__OWNED_COMMENT, oldOwnedComment, newOwnedComment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedComment(YComment newOwnedComment)
	{
		if (newOwnedComment != ownedComment) {
			NotificationChain msgs = null;
			if (ownedComment != null)
				msgs = ((InternalEObject)ownedComment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - YammPackage.YTRANSITION__OWNED_COMMENT, null, msgs);
			if (newOwnedComment != null)
				msgs = ((InternalEObject)newOwnedComment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - YammPackage.YTRANSITION__OWNED_COMMENT, null, msgs);
			msgs = basicSetOwnedComment(newOwnedComment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YTRANSITION__OWNED_COMMENT, newOwnedComment, newOwnedComment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YElement> getOwnedElement()
	{
		if (ownedElement == null) {
			ownedElement = new EObjectContainmentEList<YElement>(YElement.class, this, YammPackage.YTRANSITION__OWNED_ELEMENT);
		}
		return ownedElement;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammPackage.YTRANSITION__POS_OBJECT_ID, oldPosObjectID, posObjectID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YTRANSITION__POS_OBJECT_ID, oldPosObjectID, posObjectID));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammPackage.YTRANSITION__POS_NAME, oldPosName, posName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YTRANSITION__POS_NAME, oldPosName, posName));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammPackage.YTRANSITION__POS_QUALIFIED_NAME, oldPosQualifiedName, posQualifiedName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YTRANSITION__POS_QUALIFIED_NAME, oldPosQualifiedName, posQualifiedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo getPosSource()
	{
		if (posSource != null && posSource.eIsProxy()) {
			InternalEObject oldPosSource = (InternalEObject)posSource;
			posSource = (SingleLinePropertyInfo)eResolveProxy(oldPosSource);
			if (posSource != oldPosSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammPackage.YTRANSITION__POS_SOURCE, oldPosSource, posSource));
			}
		}
		return posSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo basicGetPosSource()
	{
		return posSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosSource(SingleLinePropertyInfo newPosSource)
	{
		SingleLinePropertyInfo oldPosSource = posSource;
		posSource = newPosSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YTRANSITION__POS_SOURCE, oldPosSource, posSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo getPosTarget()
	{
		if (posTarget != null && posTarget.eIsProxy()) {
			InternalEObject oldPosTarget = (InternalEObject)posTarget;
			posTarget = (SingleLinePropertyInfo)eResolveProxy(oldPosTarget);
			if (posTarget != oldPosTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammPackage.YTRANSITION__POS_TARGET, oldPosTarget, posTarget));
			}
		}
		return posTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo basicGetPosTarget()
	{
		return posTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosTarget(SingleLinePropertyInfo newPosTarget)
	{
		SingleLinePropertyInfo oldPosTarget = posTarget;
		posTarget = newPosTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YTRANSITION__POS_TARGET, oldPosTarget, posTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo getPosAttachment()
	{
		if (posAttachment != null && posAttachment.eIsProxy()) {
			InternalEObject oldPosAttachment = (InternalEObject)posAttachment;
			posAttachment = (SingleLinePropertyInfo)eResolveProxy(oldPosAttachment);
			if (posAttachment != oldPosAttachment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammPackage.YTRANSITION__POS_ATTACHMENT, oldPosAttachment, posAttachment));
			}
		}
		return posAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo basicGetPosAttachment()
	{
		return posAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosAttachment(SingleLinePropertyInfo newPosAttachment)
	{
		SingleLinePropertyInfo oldPosAttachment = posAttachment;
		posAttachment = newPosAttachment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YTRANSITION__POS_ATTACHMENT, oldPosAttachment, posAttachment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID) {
			case YammPackage.YTRANSITION__OWNED_COMMENT:
				return basicSetOwnedComment(null, msgs);
			case YammPackage.YTRANSITION__OWNED_ELEMENT:
				return ((InternalEList<?>)getOwnedElement()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case YammPackage.YTRANSITION__NAME:
				return getName();
			case YammPackage.YTRANSITION__QUALIFIED_NAME:
				return getQualifiedName();
			case YammPackage.YTRANSITION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case YammPackage.YTRANSITION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case YammPackage.YTRANSITION__ATTACHMENT:
				if (resolve) return getAttachment();
				return basicGetAttachment();
			case YammPackage.YTRANSITION__OWNED_COMMENT:
				return getOwnedComment();
			case YammPackage.YTRANSITION__OWNED_ELEMENT:
				return getOwnedElement();
			case YammPackage.YTRANSITION__POS_OBJECT_ID:
				if (resolve) return getPosObjectID();
				return basicGetPosObjectID();
			case YammPackage.YTRANSITION__POS_NAME:
				if (resolve) return getPosName();
				return basicGetPosName();
			case YammPackage.YTRANSITION__POS_QUALIFIED_NAME:
				if (resolve) return getPosQualifiedName();
				return basicGetPosQualifiedName();
			case YammPackage.YTRANSITION__POS_SOURCE:
				if (resolve) return getPosSource();
				return basicGetPosSource();
			case YammPackage.YTRANSITION__POS_TARGET:
				if (resolve) return getPosTarget();
				return basicGetPosTarget();
			case YammPackage.YTRANSITION__POS_ATTACHMENT:
				if (resolve) return getPosAttachment();
				return basicGetPosAttachment();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID) {
			case YammPackage.YTRANSITION__NAME:
				setName((String)newValue);
				return;
			case YammPackage.YTRANSITION__QUALIFIED_NAME:
				setQualifiedName((String)newValue);
				return;
			case YammPackage.YTRANSITION__SOURCE:
				setSource((YVertex)newValue);
				return;
			case YammPackage.YTRANSITION__TARGET:
				setTarget((YVertex)newValue);
				return;
			case YammPackage.YTRANSITION__ATTACHMENT:
				setAttachment((YTrAttachment)newValue);
				return;
			case YammPackage.YTRANSITION__OWNED_COMMENT:
				setOwnedComment((YComment)newValue);
				return;
			case YammPackage.YTRANSITION__OWNED_ELEMENT:
				getOwnedElement().clear();
				getOwnedElement().addAll((Collection<? extends YElement>)newValue);
				return;
			case YammPackage.YTRANSITION__POS_OBJECT_ID:
				setPosObjectID((SingleLinePropertyInfo)newValue);
				return;
			case YammPackage.YTRANSITION__POS_NAME:
				setPosName((SingleLinePropertyInfo)newValue);
				return;
			case YammPackage.YTRANSITION__POS_QUALIFIED_NAME:
				setPosQualifiedName((SingleLinePropertyInfo)newValue);
				return;
			case YammPackage.YTRANSITION__POS_SOURCE:
				setPosSource((SingleLinePropertyInfo)newValue);
				return;
			case YammPackage.YTRANSITION__POS_TARGET:
				setPosTarget((SingleLinePropertyInfo)newValue);
				return;
			case YammPackage.YTRANSITION__POS_ATTACHMENT:
				setPosAttachment((SingleLinePropertyInfo)newValue);
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
			case YammPackage.YTRANSITION__NAME:
				unsetName();
				return;
			case YammPackage.YTRANSITION__QUALIFIED_NAME:
				setQualifiedName(QUALIFIED_NAME_EDEFAULT);
				return;
			case YammPackage.YTRANSITION__SOURCE:
				setSource((YVertex)null);
				return;
			case YammPackage.YTRANSITION__TARGET:
				setTarget((YVertex)null);
				return;
			case YammPackage.YTRANSITION__ATTACHMENT:
				setAttachment((YTrAttachment)null);
				return;
			case YammPackage.YTRANSITION__OWNED_COMMENT:
				setOwnedComment((YComment)null);
				return;
			case YammPackage.YTRANSITION__OWNED_ELEMENT:
				getOwnedElement().clear();
				return;
			case YammPackage.YTRANSITION__POS_OBJECT_ID:
				setPosObjectID((SingleLinePropertyInfo)null);
				return;
			case YammPackage.YTRANSITION__POS_NAME:
				setPosName((SingleLinePropertyInfo)null);
				return;
			case YammPackage.YTRANSITION__POS_QUALIFIED_NAME:
				setPosQualifiedName((SingleLinePropertyInfo)null);
				return;
			case YammPackage.YTRANSITION__POS_SOURCE:
				setPosSource((SingleLinePropertyInfo)null);
				return;
			case YammPackage.YTRANSITION__POS_TARGET:
				setPosTarget((SingleLinePropertyInfo)null);
				return;
			case YammPackage.YTRANSITION__POS_ATTACHMENT:
				setPosAttachment((SingleLinePropertyInfo)null);
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
			case YammPackage.YTRANSITION__NAME:
				return isSetName();
			case YammPackage.YTRANSITION__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? qualifiedName != null : !QUALIFIED_NAME_EDEFAULT.equals(qualifiedName);
			case YammPackage.YTRANSITION__SOURCE:
				return source != null;
			case YammPackage.YTRANSITION__TARGET:
				return target != null;
			case YammPackage.YTRANSITION__ATTACHMENT:
				return attachment != null;
			case YammPackage.YTRANSITION__OWNED_COMMENT:
				return ownedComment != null;
			case YammPackage.YTRANSITION__OWNED_ELEMENT:
				return ownedElement != null && !ownedElement.isEmpty();
			case YammPackage.YTRANSITION__POS_OBJECT_ID:
				return posObjectID != null;
			case YammPackage.YTRANSITION__POS_NAME:
				return posName != null;
			case YammPackage.YTRANSITION__POS_QUALIFIED_NAME:
				return posQualifiedName != null;
			case YammPackage.YTRANSITION__POS_SOURCE:
				return posSource != null;
			case YammPackage.YTRANSITION__POS_TARGET:
				return posTarget != null;
			case YammPackage.YTRANSITION__POS_ATTACHMENT:
				return posAttachment != null;
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
				case YammPackage.YTRANSITION__NAME: return YammPackage.YNAMED_ELEMENT__NAME;
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
				case YammPackage.YNAMED_ELEMENT__NAME: return YammPackage.YTRANSITION__NAME;
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
		result.append(", qualifiedName: ");
		result.append(qualifiedName);
		result.append(')');
		return result.toString();
	}

} //YTransitionImpl
