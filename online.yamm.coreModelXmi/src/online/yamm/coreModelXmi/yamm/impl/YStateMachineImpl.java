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
package online.yamm.coreModelXmi.yamm.impl;

import java.util.Collection;
import online.yamm.coreModelXmi.yamm.SingleLinePropertyInfo;
import online.yamm.coreModelXmi.yamm.YComment;
import online.yamm.coreModelXmi.yamm.YElement;
import online.yamm.coreModelXmi.yamm.YNamedElement;
import online.yamm.coreModelXmi.yamm.YOperation;
import online.yamm.coreModelXmi.yamm.YRunToCompletion;
import online.yamm.coreModelXmi.yamm.YStateMachine;
import online.yamm.coreModelXmi.yamm.YTrAttachment;
import online.yamm.coreModelXmi.yamm.YTransition;
import online.yamm.coreModelXmi.yamm.YVertex;
import online.yamm.coreModelXmi.yamm.YammPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YState Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YStateMachineImpl#getName <em>Name</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YStateMachineImpl#isInitialActive <em>Initial Active</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YStateMachineImpl#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YStateMachineImpl#getRtc <em>Rtc</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YStateMachineImpl#getMaxEffectsToBeProcessed <em>Max Effects To Be Processed</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YStateMachineImpl#getCalledOperation <em>Called Operation</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YStateMachineImpl#getOwnedComment <em>Owned Comment</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YStateMachineImpl#getOwnedElement <em>Owned Element</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YStateMachineImpl#getTransition <em>Transition</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YStateMachineImpl#getSubvertex <em>Subvertex</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YStateMachineImpl#getTrAttach <em>Tr Attach</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YStateMachineImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YStateMachineImpl#getPosObjectID <em>Pos Object ID</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YStateMachineImpl#getPosName <em>Pos Name</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YStateMachineImpl#getPosQualifiedName <em>Pos Qualified Name</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YStateMachineImpl#getPosInitialActive <em>Pos Initial Active</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YStateMachineImpl#getPosRtc <em>Pos Rtc</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YStateMachineImpl#getPosMaxEffectsToBeProcessed <em>Pos Max Effects To Be Processed</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YStateMachineImpl#getInsertLineTransition <em>Insert Line Transition</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YStateMachineImpl#getInsertLineVertex <em>Insert Line Vertex</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YStateMachineImpl#getInsertLineAttachment <em>Insert Line Attachment</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YStateMachineImpl#isDesInitializer <em>Des Initializer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class YStateMachineImpl extends YElementImpl implements YStateMachine
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
	 * The default value of the '{@link #isInitialActive() <em>Initial Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitialActive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INITIAL_ACTIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInitialActive() <em>Initial Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitialActive()
	 * @generated
	 * @ordered
	 */
	protected boolean initialActive = INITIAL_ACTIVE_EDEFAULT;

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
	 * The default value of the '{@link #getRtc() <em>Rtc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRtc()
	 * @generated
	 * @ordered
	 */
	protected static final YRunToCompletion RTC_EDEFAULT = YRunToCompletion.EFFECT;

	/**
	 * The cached value of the '{@link #getRtc() <em>Rtc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRtc()
	 * @generated
	 * @ordered
	 */
	protected YRunToCompletion rtc = RTC_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxEffectsToBeProcessed() <em>Max Effects To Be Processed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxEffectsToBeProcessed()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_EFFECTS_TO_BE_PROCESSED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxEffectsToBeProcessed() <em>Max Effects To Be Processed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxEffectsToBeProcessed()
	 * @generated
	 * @ordered
	 */
	protected int maxEffectsToBeProcessed = MAX_EFFECTS_TO_BE_PROCESSED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCalledOperation() <em>Called Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalledOperation()
	 * @generated
	 * @ordered
	 */
	protected YOperation calledOperation;

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
	 * The cached value of the '{@link #getTransition() <em>Transition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<YTransition> transition;

	/**
	 * The cached value of the '{@link #getSubvertex() <em>Subvertex</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubvertex()
	 * @generated
	 * @ordered
	 */
	protected EList<YVertex> subvertex;

	/**
	 * The cached value of the '{@link #getTrAttach() <em>Tr Attach</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrAttach()
	 * @generated
	 * @ordered
	 */
	protected EList<YTrAttachment> trAttach;

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
	 * The cached value of the '{@link #getPosInitialActive() <em>Pos Initial Active</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosInitialActive()
	 * @generated
	 * @ordered
	 */
	protected SingleLinePropertyInfo posInitialActive;

	/**
	 * The cached value of the '{@link #getPosRtc() <em>Pos Rtc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosRtc()
	 * @generated
	 * @ordered
	 */
	protected SingleLinePropertyInfo posRtc;

	/**
	 * The cached value of the '{@link #getPosMaxEffectsToBeProcessed() <em>Pos Max Effects To Be Processed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosMaxEffectsToBeProcessed()
	 * @generated
	 * @ordered
	 */
	protected SingleLinePropertyInfo posMaxEffectsToBeProcessed;

	/**
	 * The default value of the '{@link #getInsertLineTransition() <em>Insert Line Transition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsertLineTransition()
	 * @generated
	 * @ordered
	 */
	protected static final int INSERT_LINE_TRANSITION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInsertLineTransition() <em>Insert Line Transition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsertLineTransition()
	 * @generated
	 * @ordered
	 */
	protected int insertLineTransition = INSERT_LINE_TRANSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getInsertLineVertex() <em>Insert Line Vertex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsertLineVertex()
	 * @generated
	 * @ordered
	 */
	protected static final int INSERT_LINE_VERTEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInsertLineVertex() <em>Insert Line Vertex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsertLineVertex()
	 * @generated
	 * @ordered
	 */
	protected int insertLineVertex = INSERT_LINE_VERTEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getInsertLineAttachment() <em>Insert Line Attachment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsertLineAttachment()
	 * @generated
	 * @ordered
	 */
	protected static final int INSERT_LINE_ATTACHMENT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInsertLineAttachment() <em>Insert Line Attachment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsertLineAttachment()
	 * @generated
	 * @ordered
	 */
	protected int insertLineAttachment = INSERT_LINE_ATTACHMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isDesInitializer() <em>Des Initializer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDesInitializer()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DES_INITIALIZER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDesInitializer() <em>Des Initializer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDesInitializer()
	 * @generated
	 * @ordered
	 */
	protected boolean desInitializer = DES_INITIALIZER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YStateMachineImpl()
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
		return YammPackage.Literals.YSTATE_MACHINE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YSTATE_MACHINE__NAME, oldName, name, !oldNameESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, YammPackage.YSTATE_MACHINE__NAME, oldName, NAME_EDEFAULT, oldNameESet));
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
	public boolean isInitialActive()
	{
		return initialActive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialActive(boolean newInitialActive)
	{
		boolean oldInitialActive = initialActive;
		initialActive = newInitialActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YSTATE_MACHINE__INITIAL_ACTIVE, oldInitialActive, initialActive));
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
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YSTATE_MACHINE__QUALIFIED_NAME, oldQualifiedName, qualifiedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YRunToCompletion getRtc()
	{
		return rtc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRtc(YRunToCompletion newRtc)
	{
		YRunToCompletion oldRtc = rtc;
		rtc = newRtc == null ? RTC_EDEFAULT : newRtc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YSTATE_MACHINE__RTC, oldRtc, rtc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxEffectsToBeProcessed()
	{
		return maxEffectsToBeProcessed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxEffectsToBeProcessed(int newMaxEffectsToBeProcessed)
	{
		int oldMaxEffectsToBeProcessed = maxEffectsToBeProcessed;
		maxEffectsToBeProcessed = newMaxEffectsToBeProcessed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YSTATE_MACHINE__MAX_EFFECTS_TO_BE_PROCESSED, oldMaxEffectsToBeProcessed, maxEffectsToBeProcessed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YOperation getCalledOperation()
	{
		if (calledOperation != null && calledOperation.eIsProxy()) {
			InternalEObject oldCalledOperation = (InternalEObject)calledOperation;
			calledOperation = (YOperation)eResolveProxy(oldCalledOperation);
			if (calledOperation != oldCalledOperation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammPackage.YSTATE_MACHINE__CALLED_OPERATION, oldCalledOperation, calledOperation));
			}
		}
		return calledOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YOperation basicGetCalledOperation()
	{
		return calledOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalledOperation(YOperation newCalledOperation)
	{
		YOperation oldCalledOperation = calledOperation;
		calledOperation = newCalledOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YSTATE_MACHINE__CALLED_OPERATION, oldCalledOperation, calledOperation));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, YammPackage.YSTATE_MACHINE__OWNED_COMMENT, oldOwnedComment, newOwnedComment);
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
				msgs = ((InternalEObject)ownedComment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - YammPackage.YSTATE_MACHINE__OWNED_COMMENT, null, msgs);
			if (newOwnedComment != null)
				msgs = ((InternalEObject)newOwnedComment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - YammPackage.YSTATE_MACHINE__OWNED_COMMENT, null, msgs);
			msgs = basicSetOwnedComment(newOwnedComment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YSTATE_MACHINE__OWNED_COMMENT, newOwnedComment, newOwnedComment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YElement> getOwnedElement()
	{
		if (ownedElement == null) {
			ownedElement = new EObjectContainmentEList<YElement>(YElement.class, this, YammPackage.YSTATE_MACHINE__OWNED_ELEMENT);
		}
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YTransition> getTransition()
	{
		if (transition == null) {
			transition = new EObjectContainmentEList<YTransition>(YTransition.class, this, YammPackage.YSTATE_MACHINE__TRANSITION);
		}
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YVertex> getSubvertex()
	{
		if (subvertex == null) {
			subvertex = new EObjectContainmentEList<YVertex>(YVertex.class, this, YammPackage.YSTATE_MACHINE__SUBVERTEX);
		}
		return subvertex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YTrAttachment> getTrAttach()
	{
		if (trAttach == null) {
			trAttach = new EObjectContainmentEList<YTrAttachment>(YTrAttachment.class, this, YammPackage.YSTATE_MACHINE__TR_ATTACH);
		}
		return trAttach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YOperation getOperation()
	{
		if (eContainerFeatureID() != YammPackage.YSTATE_MACHINE__OPERATION) return null;
		return (YOperation)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperation(YOperation newOperation, NotificationChain msgs)
	{
		msgs = eBasicSetContainer((InternalEObject)newOperation, YammPackage.YSTATE_MACHINE__OPERATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperation(YOperation newOperation)
	{
		if (newOperation != eInternalContainer() || (eContainerFeatureID() != YammPackage.YSTATE_MACHINE__OPERATION && newOperation != null)) {
			if (EcoreUtil.isAncestor(this, newOperation))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOperation != null)
				msgs = ((InternalEObject)newOperation).eInverseAdd(this, YammPackage.YOPERATION__STATE_MACHINE, YOperation.class, msgs);
			msgs = basicSetOperation(newOperation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YSTATE_MACHINE__OPERATION, newOperation, newOperation));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammPackage.YSTATE_MACHINE__POS_OBJECT_ID, oldPosObjectID, posObjectID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YSTATE_MACHINE__POS_OBJECT_ID, oldPosObjectID, posObjectID));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammPackage.YSTATE_MACHINE__POS_NAME, oldPosName, posName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YSTATE_MACHINE__POS_NAME, oldPosName, posName));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammPackage.YSTATE_MACHINE__POS_QUALIFIED_NAME, oldPosQualifiedName, posQualifiedName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YSTATE_MACHINE__POS_QUALIFIED_NAME, oldPosQualifiedName, posQualifiedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo getPosInitialActive()
	{
		if (posInitialActive != null && posInitialActive.eIsProxy()) {
			InternalEObject oldPosInitialActive = (InternalEObject)posInitialActive;
			posInitialActive = (SingleLinePropertyInfo)eResolveProxy(oldPosInitialActive);
			if (posInitialActive != oldPosInitialActive) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammPackage.YSTATE_MACHINE__POS_INITIAL_ACTIVE, oldPosInitialActive, posInitialActive));
			}
		}
		return posInitialActive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo basicGetPosInitialActive()
	{
		return posInitialActive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosInitialActive(SingleLinePropertyInfo newPosInitialActive)
	{
		SingleLinePropertyInfo oldPosInitialActive = posInitialActive;
		posInitialActive = newPosInitialActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YSTATE_MACHINE__POS_INITIAL_ACTIVE, oldPosInitialActive, posInitialActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo getPosRtc()
	{
		if (posRtc != null && posRtc.eIsProxy()) {
			InternalEObject oldPosRtc = (InternalEObject)posRtc;
			posRtc = (SingleLinePropertyInfo)eResolveProxy(oldPosRtc);
			if (posRtc != oldPosRtc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammPackage.YSTATE_MACHINE__POS_RTC, oldPosRtc, posRtc));
			}
		}
		return posRtc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo basicGetPosRtc()
	{
		return posRtc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosRtc(SingleLinePropertyInfo newPosRtc)
	{
		SingleLinePropertyInfo oldPosRtc = posRtc;
		posRtc = newPosRtc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YSTATE_MACHINE__POS_RTC, oldPosRtc, posRtc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo getPosMaxEffectsToBeProcessed()
	{
		if (posMaxEffectsToBeProcessed != null && posMaxEffectsToBeProcessed.eIsProxy()) {
			InternalEObject oldPosMaxEffectsToBeProcessed = (InternalEObject)posMaxEffectsToBeProcessed;
			posMaxEffectsToBeProcessed = (SingleLinePropertyInfo)eResolveProxy(oldPosMaxEffectsToBeProcessed);
			if (posMaxEffectsToBeProcessed != oldPosMaxEffectsToBeProcessed) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammPackage.YSTATE_MACHINE__POS_MAX_EFFECTS_TO_BE_PROCESSED, oldPosMaxEffectsToBeProcessed, posMaxEffectsToBeProcessed));
			}
		}
		return posMaxEffectsToBeProcessed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLinePropertyInfo basicGetPosMaxEffectsToBeProcessed()
	{
		return posMaxEffectsToBeProcessed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosMaxEffectsToBeProcessed(SingleLinePropertyInfo newPosMaxEffectsToBeProcessed)
	{
		SingleLinePropertyInfo oldPosMaxEffectsToBeProcessed = posMaxEffectsToBeProcessed;
		posMaxEffectsToBeProcessed = newPosMaxEffectsToBeProcessed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YSTATE_MACHINE__POS_MAX_EFFECTS_TO_BE_PROCESSED, oldPosMaxEffectsToBeProcessed, posMaxEffectsToBeProcessed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInsertLineTransition()
	{
		return insertLineTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsertLineTransition(int newInsertLineTransition)
	{
		int oldInsertLineTransition = insertLineTransition;
		insertLineTransition = newInsertLineTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YSTATE_MACHINE__INSERT_LINE_TRANSITION, oldInsertLineTransition, insertLineTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInsertLineVertex()
	{
		return insertLineVertex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsertLineVertex(int newInsertLineVertex)
	{
		int oldInsertLineVertex = insertLineVertex;
		insertLineVertex = newInsertLineVertex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YSTATE_MACHINE__INSERT_LINE_VERTEX, oldInsertLineVertex, insertLineVertex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInsertLineAttachment()
	{
		return insertLineAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsertLineAttachment(int newInsertLineAttachment)
	{
		int oldInsertLineAttachment = insertLineAttachment;
		insertLineAttachment = newInsertLineAttachment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YSTATE_MACHINE__INSERT_LINE_ATTACHMENT, oldInsertLineAttachment, insertLineAttachment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDesInitializer()
	{
		return desInitializer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesInitializer(boolean newDesInitializer)
	{
		boolean oldDesInitializer = desInitializer;
		desInitializer = newDesInitializer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YSTATE_MACHINE__DES_INITIALIZER, oldDesInitializer, desInitializer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID) {
			case YammPackage.YSTATE_MACHINE__OPERATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOperation((YOperation)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
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
			case YammPackage.YSTATE_MACHINE__OWNED_COMMENT:
				return basicSetOwnedComment(null, msgs);
			case YammPackage.YSTATE_MACHINE__OWNED_ELEMENT:
				return ((InternalEList<?>)getOwnedElement()).basicRemove(otherEnd, msgs);
			case YammPackage.YSTATE_MACHINE__TRANSITION:
				return ((InternalEList<?>)getTransition()).basicRemove(otherEnd, msgs);
			case YammPackage.YSTATE_MACHINE__SUBVERTEX:
				return ((InternalEList<?>)getSubvertex()).basicRemove(otherEnd, msgs);
			case YammPackage.YSTATE_MACHINE__TR_ATTACH:
				return ((InternalEList<?>)getTrAttach()).basicRemove(otherEnd, msgs);
			case YammPackage.YSTATE_MACHINE__OPERATION:
				return basicSetOperation(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
	{
		switch (eContainerFeatureID()) {
			case YammPackage.YSTATE_MACHINE__OPERATION:
				return eInternalContainer().eInverseRemove(this, YammPackage.YOPERATION__STATE_MACHINE, YOperation.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
			case YammPackage.YSTATE_MACHINE__NAME:
				return getName();
			case YammPackage.YSTATE_MACHINE__INITIAL_ACTIVE:
				return isInitialActive();
			case YammPackage.YSTATE_MACHINE__QUALIFIED_NAME:
				return getQualifiedName();
			case YammPackage.YSTATE_MACHINE__RTC:
				return getRtc();
			case YammPackage.YSTATE_MACHINE__MAX_EFFECTS_TO_BE_PROCESSED:
				return getMaxEffectsToBeProcessed();
			case YammPackage.YSTATE_MACHINE__CALLED_OPERATION:
				if (resolve) return getCalledOperation();
				return basicGetCalledOperation();
			case YammPackage.YSTATE_MACHINE__OWNED_COMMENT:
				return getOwnedComment();
			case YammPackage.YSTATE_MACHINE__OWNED_ELEMENT:
				return getOwnedElement();
			case YammPackage.YSTATE_MACHINE__TRANSITION:
				return getTransition();
			case YammPackage.YSTATE_MACHINE__SUBVERTEX:
				return getSubvertex();
			case YammPackage.YSTATE_MACHINE__TR_ATTACH:
				return getTrAttach();
			case YammPackage.YSTATE_MACHINE__OPERATION:
				return getOperation();
			case YammPackage.YSTATE_MACHINE__POS_OBJECT_ID:
				if (resolve) return getPosObjectID();
				return basicGetPosObjectID();
			case YammPackage.YSTATE_MACHINE__POS_NAME:
				if (resolve) return getPosName();
				return basicGetPosName();
			case YammPackage.YSTATE_MACHINE__POS_QUALIFIED_NAME:
				if (resolve) return getPosQualifiedName();
				return basicGetPosQualifiedName();
			case YammPackage.YSTATE_MACHINE__POS_INITIAL_ACTIVE:
				if (resolve) return getPosInitialActive();
				return basicGetPosInitialActive();
			case YammPackage.YSTATE_MACHINE__POS_RTC:
				if (resolve) return getPosRtc();
				return basicGetPosRtc();
			case YammPackage.YSTATE_MACHINE__POS_MAX_EFFECTS_TO_BE_PROCESSED:
				if (resolve) return getPosMaxEffectsToBeProcessed();
				return basicGetPosMaxEffectsToBeProcessed();
			case YammPackage.YSTATE_MACHINE__INSERT_LINE_TRANSITION:
				return getInsertLineTransition();
			case YammPackage.YSTATE_MACHINE__INSERT_LINE_VERTEX:
				return getInsertLineVertex();
			case YammPackage.YSTATE_MACHINE__INSERT_LINE_ATTACHMENT:
				return getInsertLineAttachment();
			case YammPackage.YSTATE_MACHINE__DES_INITIALIZER:
				return isDesInitializer();
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
			case YammPackage.YSTATE_MACHINE__NAME:
				setName((String)newValue);
				return;
			case YammPackage.YSTATE_MACHINE__INITIAL_ACTIVE:
				setInitialActive((Boolean)newValue);
				return;
			case YammPackage.YSTATE_MACHINE__QUALIFIED_NAME:
				setQualifiedName((String)newValue);
				return;
			case YammPackage.YSTATE_MACHINE__RTC:
				setRtc((YRunToCompletion)newValue);
				return;
			case YammPackage.YSTATE_MACHINE__MAX_EFFECTS_TO_BE_PROCESSED:
				setMaxEffectsToBeProcessed((Integer)newValue);
				return;
			case YammPackage.YSTATE_MACHINE__CALLED_OPERATION:
				setCalledOperation((YOperation)newValue);
				return;
			case YammPackage.YSTATE_MACHINE__OWNED_COMMENT:
				setOwnedComment((YComment)newValue);
				return;
			case YammPackage.YSTATE_MACHINE__OWNED_ELEMENT:
				getOwnedElement().clear();
				getOwnedElement().addAll((Collection<? extends YElement>)newValue);
				return;
			case YammPackage.YSTATE_MACHINE__TRANSITION:
				getTransition().clear();
				getTransition().addAll((Collection<? extends YTransition>)newValue);
				return;
			case YammPackage.YSTATE_MACHINE__SUBVERTEX:
				getSubvertex().clear();
				getSubvertex().addAll((Collection<? extends YVertex>)newValue);
				return;
			case YammPackage.YSTATE_MACHINE__TR_ATTACH:
				getTrAttach().clear();
				getTrAttach().addAll((Collection<? extends YTrAttachment>)newValue);
				return;
			case YammPackage.YSTATE_MACHINE__OPERATION:
				setOperation((YOperation)newValue);
				return;
			case YammPackage.YSTATE_MACHINE__POS_OBJECT_ID:
				setPosObjectID((SingleLinePropertyInfo)newValue);
				return;
			case YammPackage.YSTATE_MACHINE__POS_NAME:
				setPosName((SingleLinePropertyInfo)newValue);
				return;
			case YammPackage.YSTATE_MACHINE__POS_QUALIFIED_NAME:
				setPosQualifiedName((SingleLinePropertyInfo)newValue);
				return;
			case YammPackage.YSTATE_MACHINE__POS_INITIAL_ACTIVE:
				setPosInitialActive((SingleLinePropertyInfo)newValue);
				return;
			case YammPackage.YSTATE_MACHINE__POS_RTC:
				setPosRtc((SingleLinePropertyInfo)newValue);
				return;
			case YammPackage.YSTATE_MACHINE__POS_MAX_EFFECTS_TO_BE_PROCESSED:
				setPosMaxEffectsToBeProcessed((SingleLinePropertyInfo)newValue);
				return;
			case YammPackage.YSTATE_MACHINE__INSERT_LINE_TRANSITION:
				setInsertLineTransition((Integer)newValue);
				return;
			case YammPackage.YSTATE_MACHINE__INSERT_LINE_VERTEX:
				setInsertLineVertex((Integer)newValue);
				return;
			case YammPackage.YSTATE_MACHINE__INSERT_LINE_ATTACHMENT:
				setInsertLineAttachment((Integer)newValue);
				return;
			case YammPackage.YSTATE_MACHINE__DES_INITIALIZER:
				setDesInitializer((Boolean)newValue);
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
			case YammPackage.YSTATE_MACHINE__NAME:
				unsetName();
				return;
			case YammPackage.YSTATE_MACHINE__INITIAL_ACTIVE:
				setInitialActive(INITIAL_ACTIVE_EDEFAULT);
				return;
			case YammPackage.YSTATE_MACHINE__QUALIFIED_NAME:
				setQualifiedName(QUALIFIED_NAME_EDEFAULT);
				return;
			case YammPackage.YSTATE_MACHINE__RTC:
				setRtc(RTC_EDEFAULT);
				return;
			case YammPackage.YSTATE_MACHINE__MAX_EFFECTS_TO_BE_PROCESSED:
				setMaxEffectsToBeProcessed(MAX_EFFECTS_TO_BE_PROCESSED_EDEFAULT);
				return;
			case YammPackage.YSTATE_MACHINE__CALLED_OPERATION:
				setCalledOperation((YOperation)null);
				return;
			case YammPackage.YSTATE_MACHINE__OWNED_COMMENT:
				setOwnedComment((YComment)null);
				return;
			case YammPackage.YSTATE_MACHINE__OWNED_ELEMENT:
				getOwnedElement().clear();
				return;
			case YammPackage.YSTATE_MACHINE__TRANSITION:
				getTransition().clear();
				return;
			case YammPackage.YSTATE_MACHINE__SUBVERTEX:
				getSubvertex().clear();
				return;
			case YammPackage.YSTATE_MACHINE__TR_ATTACH:
				getTrAttach().clear();
				return;
			case YammPackage.YSTATE_MACHINE__OPERATION:
				setOperation((YOperation)null);
				return;
			case YammPackage.YSTATE_MACHINE__POS_OBJECT_ID:
				setPosObjectID((SingleLinePropertyInfo)null);
				return;
			case YammPackage.YSTATE_MACHINE__POS_NAME:
				setPosName((SingleLinePropertyInfo)null);
				return;
			case YammPackage.YSTATE_MACHINE__POS_QUALIFIED_NAME:
				setPosQualifiedName((SingleLinePropertyInfo)null);
				return;
			case YammPackage.YSTATE_MACHINE__POS_INITIAL_ACTIVE:
				setPosInitialActive((SingleLinePropertyInfo)null);
				return;
			case YammPackage.YSTATE_MACHINE__POS_RTC:
				setPosRtc((SingleLinePropertyInfo)null);
				return;
			case YammPackage.YSTATE_MACHINE__POS_MAX_EFFECTS_TO_BE_PROCESSED:
				setPosMaxEffectsToBeProcessed((SingleLinePropertyInfo)null);
				return;
			case YammPackage.YSTATE_MACHINE__INSERT_LINE_TRANSITION:
				setInsertLineTransition(INSERT_LINE_TRANSITION_EDEFAULT);
				return;
			case YammPackage.YSTATE_MACHINE__INSERT_LINE_VERTEX:
				setInsertLineVertex(INSERT_LINE_VERTEX_EDEFAULT);
				return;
			case YammPackage.YSTATE_MACHINE__INSERT_LINE_ATTACHMENT:
				setInsertLineAttachment(INSERT_LINE_ATTACHMENT_EDEFAULT);
				return;
			case YammPackage.YSTATE_MACHINE__DES_INITIALIZER:
				setDesInitializer(DES_INITIALIZER_EDEFAULT);
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
			case YammPackage.YSTATE_MACHINE__NAME:
				return isSetName();
			case YammPackage.YSTATE_MACHINE__INITIAL_ACTIVE:
				return initialActive != INITIAL_ACTIVE_EDEFAULT;
			case YammPackage.YSTATE_MACHINE__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? qualifiedName != null : !QUALIFIED_NAME_EDEFAULT.equals(qualifiedName);
			case YammPackage.YSTATE_MACHINE__RTC:
				return rtc != RTC_EDEFAULT;
			case YammPackage.YSTATE_MACHINE__MAX_EFFECTS_TO_BE_PROCESSED:
				return maxEffectsToBeProcessed != MAX_EFFECTS_TO_BE_PROCESSED_EDEFAULT;
			case YammPackage.YSTATE_MACHINE__CALLED_OPERATION:
				return calledOperation != null;
			case YammPackage.YSTATE_MACHINE__OWNED_COMMENT:
				return ownedComment != null;
			case YammPackage.YSTATE_MACHINE__OWNED_ELEMENT:
				return ownedElement != null && !ownedElement.isEmpty();
			case YammPackage.YSTATE_MACHINE__TRANSITION:
				return transition != null && !transition.isEmpty();
			case YammPackage.YSTATE_MACHINE__SUBVERTEX:
				return subvertex != null && !subvertex.isEmpty();
			case YammPackage.YSTATE_MACHINE__TR_ATTACH:
				return trAttach != null && !trAttach.isEmpty();
			case YammPackage.YSTATE_MACHINE__OPERATION:
				return getOperation() != null;
			case YammPackage.YSTATE_MACHINE__POS_OBJECT_ID:
				return posObjectID != null;
			case YammPackage.YSTATE_MACHINE__POS_NAME:
				return posName != null;
			case YammPackage.YSTATE_MACHINE__POS_QUALIFIED_NAME:
				return posQualifiedName != null;
			case YammPackage.YSTATE_MACHINE__POS_INITIAL_ACTIVE:
				return posInitialActive != null;
			case YammPackage.YSTATE_MACHINE__POS_RTC:
				return posRtc != null;
			case YammPackage.YSTATE_MACHINE__POS_MAX_EFFECTS_TO_BE_PROCESSED:
				return posMaxEffectsToBeProcessed != null;
			case YammPackage.YSTATE_MACHINE__INSERT_LINE_TRANSITION:
				return insertLineTransition != INSERT_LINE_TRANSITION_EDEFAULT;
			case YammPackage.YSTATE_MACHINE__INSERT_LINE_VERTEX:
				return insertLineVertex != INSERT_LINE_VERTEX_EDEFAULT;
			case YammPackage.YSTATE_MACHINE__INSERT_LINE_ATTACHMENT:
				return insertLineAttachment != INSERT_LINE_ATTACHMENT_EDEFAULT;
			case YammPackage.YSTATE_MACHINE__DES_INITIALIZER:
				return desInitializer != DES_INITIALIZER_EDEFAULT;
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
				case YammPackage.YSTATE_MACHINE__NAME: return YammPackage.YNAMED_ELEMENT__NAME;
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
				case YammPackage.YNAMED_ELEMENT__NAME: return YammPackage.YSTATE_MACHINE__NAME;
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
		result.append(", initialActive: ");
		result.append(initialActive);
		result.append(", qualifiedName: ");
		result.append(qualifiedName);
		result.append(", rtc: ");
		result.append(rtc);
		result.append(", maxEffectsToBeProcessed: ");
		result.append(maxEffectsToBeProcessed);
		result.append(", insertLineTransition: ");
		result.append(insertLineTransition);
		result.append(", insertLineVertex: ");
		result.append(insertLineVertex);
		result.append(", insertLineAttachment: ");
		result.append(insertLineAttachment);
		result.append(", desInitializer: ");
		result.append(desInitializer);
		result.append(')');
		return result.toString();
	}

} //YStateMachineImpl
