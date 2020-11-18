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

import java.util.Collection;
import online.yamm.coreModelDiagram.yammDiagram.YComment;
import online.yamm.coreModelDiagram.yammDiagram.YElement;
import online.yamm.coreModelDiagram.yammDiagram.YNamedElement;
import online.yamm.coreModelDiagram.yammDiagram.YOperation;
import online.yamm.coreModelDiagram.yammDiagram.YRunToCompletion;
import online.yamm.coreModelDiagram.yammDiagram.YStateMachine;
import online.yamm.coreModelDiagram.yammDiagram.YTrAttachment;
import online.yamm.coreModelDiagram.yammDiagram.YTransition;
import online.yamm.coreModelDiagram.yammDiagram.YVertex;
import online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage;

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
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.impl.YStateMachineImpl#getName <em>Name</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.impl.YStateMachineImpl#isInitialActive <em>Initial Active</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.impl.YStateMachineImpl#isDesInitializer <em>Des Initializer</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.impl.YStateMachineImpl#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.impl.YStateMachineImpl#getRtc <em>Rtc</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.impl.YStateMachineImpl#getMaxEffectsToBeProcessed <em>Max Effects To Be Processed</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.impl.YStateMachineImpl#getCalledOperation <em>Called Operation</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.impl.YStateMachineImpl#getOwnedComment <em>Owned Comment</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.impl.YStateMachineImpl#getOwnedElement <em>Owned Element</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.impl.YStateMachineImpl#getTransition <em>Transition</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.impl.YStateMachineImpl#getSubvertex <em>Subvertex</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.impl.YStateMachineImpl#getTrAttach <em>Tr Attach</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.impl.YStateMachineImpl#getOperation <em>Operation</em>}</li>
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
		return YammDiagramPackage.Literals.YSTATE_MACHINE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YSTATE_MACHINE__NAME, oldName, name, !oldNameESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, YammDiagramPackage.YSTATE_MACHINE__NAME, oldName, NAME_EDEFAULT, oldNameESet));
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
	 * @generated not
	 */
	public void setInitialActive(boolean newInitialActive)
	{
		if (newInitialActive)
			setDesInitializer(false);
		boolean oldInitialActive = initialActive;
		initialActive = newInitialActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YSTATE_MACHINE__INITIAL_ACTIVE, oldInitialActive, initialActive));
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
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YSTATE_MACHINE__QUALIFIED_NAME, oldQualifiedName, qualifiedName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YSTATE_MACHINE__RTC, oldRtc, rtc));
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
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YSTATE_MACHINE__MAX_EFFECTS_TO_BE_PROCESSED, oldMaxEffectsToBeProcessed, maxEffectsToBeProcessed));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammDiagramPackage.YSTATE_MACHINE__CALLED_OPERATION, oldCalledOperation, calledOperation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YSTATE_MACHINE__CALLED_OPERATION, oldCalledOperation, calledOperation));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YSTATE_MACHINE__OWNED_COMMENT, oldOwnedComment, newOwnedComment);
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
				msgs = ((InternalEObject)ownedComment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - YammDiagramPackage.YSTATE_MACHINE__OWNED_COMMENT, null, msgs);
			if (newOwnedComment != null)
				msgs = ((InternalEObject)newOwnedComment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - YammDiagramPackage.YSTATE_MACHINE__OWNED_COMMENT, null, msgs);
			msgs = basicSetOwnedComment(newOwnedComment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YSTATE_MACHINE__OWNED_COMMENT, newOwnedComment, newOwnedComment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YElement> getOwnedElement()
	{
		if (ownedElement == null) {
			ownedElement = new EObjectContainmentEList<YElement>(YElement.class, this, YammDiagramPackage.YSTATE_MACHINE__OWNED_ELEMENT);
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
			transition = new EObjectContainmentEList<YTransition>(YTransition.class, this, YammDiagramPackage.YSTATE_MACHINE__TRANSITION);
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
			subvertex = new EObjectContainmentEList<YVertex>(YVertex.class, this, YammDiagramPackage.YSTATE_MACHINE__SUBVERTEX);
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
			trAttach = new EObjectContainmentEList<YTrAttachment>(YTrAttachment.class, this, YammDiagramPackage.YSTATE_MACHINE__TR_ATTACH);
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
		if (eContainerFeatureID() != YammDiagramPackage.YSTATE_MACHINE__OPERATION) return null;
		return (YOperation)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperation(YOperation newOperation, NotificationChain msgs)
	{
		msgs = eBasicSetContainer((InternalEObject)newOperation, YammDiagramPackage.YSTATE_MACHINE__OPERATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperation(YOperation newOperation)
	{
		if (newOperation != eInternalContainer() || (eContainerFeatureID() != YammDiagramPackage.YSTATE_MACHINE__OPERATION && newOperation != null)) {
			if (EcoreUtil.isAncestor(this, newOperation))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOperation != null)
				msgs = ((InternalEObject)newOperation).eInverseAdd(this, YammDiagramPackage.YOPERATION__STATE_MACHINE, YOperation.class, msgs);
			msgs = basicSetOperation(newOperation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YSTATE_MACHINE__OPERATION, newOperation, newOperation));
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
	 * @generated not
	 */
	public void setDesInitializer(boolean newDesInitializer)
	{
		if (newDesInitializer)
			setInitialActive(false);
		boolean oldDesInitializer = desInitializer;
		desInitializer = newDesInitializer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammDiagramPackage.YSTATE_MACHINE__DES_INITIALIZER, oldDesInitializer, desInitializer));
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
			case YammDiagramPackage.YSTATE_MACHINE__OPERATION:
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
			case YammDiagramPackage.YSTATE_MACHINE__OWNED_COMMENT:
				return basicSetOwnedComment(null, msgs);
			case YammDiagramPackage.YSTATE_MACHINE__OWNED_ELEMENT:
				return ((InternalEList<?>)getOwnedElement()).basicRemove(otherEnd, msgs);
			case YammDiagramPackage.YSTATE_MACHINE__TRANSITION:
				return ((InternalEList<?>)getTransition()).basicRemove(otherEnd, msgs);
			case YammDiagramPackage.YSTATE_MACHINE__SUBVERTEX:
				return ((InternalEList<?>)getSubvertex()).basicRemove(otherEnd, msgs);
			case YammDiagramPackage.YSTATE_MACHINE__TR_ATTACH:
				return ((InternalEList<?>)getTrAttach()).basicRemove(otherEnd, msgs);
			case YammDiagramPackage.YSTATE_MACHINE__OPERATION:
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
			case YammDiagramPackage.YSTATE_MACHINE__OPERATION:
				return eInternalContainer().eInverseRemove(this, YammDiagramPackage.YOPERATION__STATE_MACHINE, YOperation.class, msgs);
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
			case YammDiagramPackage.YSTATE_MACHINE__NAME:
				return getName();
			case YammDiagramPackage.YSTATE_MACHINE__INITIAL_ACTIVE:
				return isInitialActive();
			case YammDiagramPackage.YSTATE_MACHINE__DES_INITIALIZER:
				return isDesInitializer();
			case YammDiagramPackage.YSTATE_MACHINE__QUALIFIED_NAME:
				return getQualifiedName();
			case YammDiagramPackage.YSTATE_MACHINE__RTC:
				return getRtc();
			case YammDiagramPackage.YSTATE_MACHINE__MAX_EFFECTS_TO_BE_PROCESSED:
				return getMaxEffectsToBeProcessed();
			case YammDiagramPackage.YSTATE_MACHINE__CALLED_OPERATION:
				if (resolve) return getCalledOperation();
				return basicGetCalledOperation();
			case YammDiagramPackage.YSTATE_MACHINE__OWNED_COMMENT:
				return getOwnedComment();
			case YammDiagramPackage.YSTATE_MACHINE__OWNED_ELEMENT:
				return getOwnedElement();
			case YammDiagramPackage.YSTATE_MACHINE__TRANSITION:
				return getTransition();
			case YammDiagramPackage.YSTATE_MACHINE__SUBVERTEX:
				return getSubvertex();
			case YammDiagramPackage.YSTATE_MACHINE__TR_ATTACH:
				return getTrAttach();
			case YammDiagramPackage.YSTATE_MACHINE__OPERATION:
				return getOperation();
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
			case YammDiagramPackage.YSTATE_MACHINE__NAME:
				setName((String)newValue);
				return;
			case YammDiagramPackage.YSTATE_MACHINE__INITIAL_ACTIVE:
				setInitialActive((Boolean)newValue);
				return;
			case YammDiagramPackage.YSTATE_MACHINE__DES_INITIALIZER:
				setDesInitializer((Boolean)newValue);
				return;
			case YammDiagramPackage.YSTATE_MACHINE__QUALIFIED_NAME:
				setQualifiedName((String)newValue);
				return;
			case YammDiagramPackage.YSTATE_MACHINE__RTC:
				setRtc((YRunToCompletion)newValue);
				return;
			case YammDiagramPackage.YSTATE_MACHINE__MAX_EFFECTS_TO_BE_PROCESSED:
				setMaxEffectsToBeProcessed((Integer)newValue);
				return;
			case YammDiagramPackage.YSTATE_MACHINE__CALLED_OPERATION:
				setCalledOperation((YOperation)newValue);
				return;
			case YammDiagramPackage.YSTATE_MACHINE__OWNED_COMMENT:
				setOwnedComment((YComment)newValue);
				return;
			case YammDiagramPackage.YSTATE_MACHINE__OWNED_ELEMENT:
				getOwnedElement().clear();
				getOwnedElement().addAll((Collection<? extends YElement>)newValue);
				return;
			case YammDiagramPackage.YSTATE_MACHINE__TRANSITION:
				getTransition().clear();
				getTransition().addAll((Collection<? extends YTransition>)newValue);
				return;
			case YammDiagramPackage.YSTATE_MACHINE__SUBVERTEX:
				getSubvertex().clear();
				getSubvertex().addAll((Collection<? extends YVertex>)newValue);
				return;
			case YammDiagramPackage.YSTATE_MACHINE__TR_ATTACH:
				getTrAttach().clear();
				getTrAttach().addAll((Collection<? extends YTrAttachment>)newValue);
				return;
			case YammDiagramPackage.YSTATE_MACHINE__OPERATION:
				setOperation((YOperation)newValue);
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
			case YammDiagramPackage.YSTATE_MACHINE__NAME:
				unsetName();
				return;
			case YammDiagramPackage.YSTATE_MACHINE__INITIAL_ACTIVE:
				setInitialActive(INITIAL_ACTIVE_EDEFAULT);
				return;
			case YammDiagramPackage.YSTATE_MACHINE__DES_INITIALIZER:
				setDesInitializer(DES_INITIALIZER_EDEFAULT);
				return;
			case YammDiagramPackage.YSTATE_MACHINE__QUALIFIED_NAME:
				setQualifiedName(QUALIFIED_NAME_EDEFAULT);
				return;
			case YammDiagramPackage.YSTATE_MACHINE__RTC:
				setRtc(RTC_EDEFAULT);
				return;
			case YammDiagramPackage.YSTATE_MACHINE__MAX_EFFECTS_TO_BE_PROCESSED:
				setMaxEffectsToBeProcessed(MAX_EFFECTS_TO_BE_PROCESSED_EDEFAULT);
				return;
			case YammDiagramPackage.YSTATE_MACHINE__CALLED_OPERATION:
				setCalledOperation((YOperation)null);
				return;
			case YammDiagramPackage.YSTATE_MACHINE__OWNED_COMMENT:
				setOwnedComment((YComment)null);
				return;
			case YammDiagramPackage.YSTATE_MACHINE__OWNED_ELEMENT:
				getOwnedElement().clear();
				return;
			case YammDiagramPackage.YSTATE_MACHINE__TRANSITION:
				getTransition().clear();
				return;
			case YammDiagramPackage.YSTATE_MACHINE__SUBVERTEX:
				getSubvertex().clear();
				return;
			case YammDiagramPackage.YSTATE_MACHINE__TR_ATTACH:
				getTrAttach().clear();
				return;
			case YammDiagramPackage.YSTATE_MACHINE__OPERATION:
				setOperation((YOperation)null);
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
			case YammDiagramPackage.YSTATE_MACHINE__NAME:
				return isSetName();
			case YammDiagramPackage.YSTATE_MACHINE__INITIAL_ACTIVE:
				return initialActive != INITIAL_ACTIVE_EDEFAULT;
			case YammDiagramPackage.YSTATE_MACHINE__DES_INITIALIZER:
				return desInitializer != DES_INITIALIZER_EDEFAULT;
			case YammDiagramPackage.YSTATE_MACHINE__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? qualifiedName != null : !QUALIFIED_NAME_EDEFAULT.equals(qualifiedName);
			case YammDiagramPackage.YSTATE_MACHINE__RTC:
				return rtc != RTC_EDEFAULT;
			case YammDiagramPackage.YSTATE_MACHINE__MAX_EFFECTS_TO_BE_PROCESSED:
				return maxEffectsToBeProcessed != MAX_EFFECTS_TO_BE_PROCESSED_EDEFAULT;
			case YammDiagramPackage.YSTATE_MACHINE__CALLED_OPERATION:
				return calledOperation != null;
			case YammDiagramPackage.YSTATE_MACHINE__OWNED_COMMENT:
				return ownedComment != null;
			case YammDiagramPackage.YSTATE_MACHINE__OWNED_ELEMENT:
				return ownedElement != null && !ownedElement.isEmpty();
			case YammDiagramPackage.YSTATE_MACHINE__TRANSITION:
				return transition != null && !transition.isEmpty();
			case YammDiagramPackage.YSTATE_MACHINE__SUBVERTEX:
				return subvertex != null && !subvertex.isEmpty();
			case YammDiagramPackage.YSTATE_MACHINE__TR_ATTACH:
				return trAttach != null && !trAttach.isEmpty();
			case YammDiagramPackage.YSTATE_MACHINE__OPERATION:
				return getOperation() != null;
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
				case YammDiagramPackage.YSTATE_MACHINE__NAME: return YammDiagramPackage.YNAMED_ELEMENT__NAME;
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
				case YammDiagramPackage.YNAMED_ELEMENT__NAME: return YammDiagramPackage.YSTATE_MACHINE__NAME;
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
		result.append(", desInitializer: ");
		result.append(desInitializer);
		result.append(", qualifiedName: ");
		result.append(qualifiedName);
		result.append(", rtc: ");
		result.append(rtc);
		result.append(", maxEffectsToBeProcessed: ");
		result.append(maxEffectsToBeProcessed);
		result.append(')');
		return result.toString();
	}

} //YStateMachineImpl
