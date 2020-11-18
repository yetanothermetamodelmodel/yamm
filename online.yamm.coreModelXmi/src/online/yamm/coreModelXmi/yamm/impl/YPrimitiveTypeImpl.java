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

import online.yamm.coreModelXmi.yamm.YClassifier;
import online.yamm.coreModelXmi.yamm.YComment;
import online.yamm.coreModelXmi.yamm.YConstraint;
import online.yamm.coreModelXmi.yamm.YElement;
import online.yamm.coreModelXmi.yamm.YFeature;
import online.yamm.coreModelXmi.yamm.YNamedElement;
import online.yamm.coreModelXmi.yamm.YNamespace;
import online.yamm.coreModelXmi.yamm.YPackage;
import online.yamm.coreModelXmi.yamm.YPackageableElement;
import online.yamm.coreModelXmi.yamm.YPrimitiveType;
import online.yamm.coreModelXmi.yamm.YProperty;
import online.yamm.coreModelXmi.yamm.YType;
import online.yamm.coreModelXmi.yamm.YammPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YPrimitive Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YPrimitiveTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YPrimitiveTypeImpl#getParentElement <em>Parent Element</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YPrimitiveTypeImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YPrimitiveTypeImpl#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YPrimitiveTypeImpl#getMember <em>Member</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YPrimitiveTypeImpl#getElementImport <em>Element Import</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YPrimitiveTypeImpl#getImportedMember <em>Imported Member</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YPrimitiveTypeImpl#getPackageImport <em>Package Import</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YPrimitiveTypeImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YPrimitiveTypeImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YPrimitiveTypeImpl#getGeneral <em>General</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YPrimitiveTypeImpl#getInheritedMember <em>Inherited Member</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YPrimitiveTypeImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YPrimitiveTypeImpl#getOwnedComment <em>Owned Comment</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YPrimitiveTypeImpl#getOwnedElement <em>Owned Element</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YPrimitiveTypeImpl#getOwnedMember <em>Owned Member</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.impl.YPrimitiveTypeImpl#getOwnedRule <em>Owned Rule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class YPrimitiveTypeImpl extends YElementImpl implements YPrimitiveType
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
	 * The default value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean isAbstract = IS_ABSTRACT_EDEFAULT;

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
	 * The cached value of the '{@link #getMember() <em>Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMember()
	 * @generated
	 * @ordered
	 */
	protected EList<YNamedElement> member;

	/**
	 * The cached value of the '{@link #getElementImport() <em>Element Import</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementImport()
	 * @generated
	 * @ordered
	 */
	protected EList<YPackageableElement> elementImport;

	/**
	 * The cached value of the '{@link #getImportedMember() <em>Imported Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedMember()
	 * @generated
	 * @ordered
	 */
	protected EList<YPackageableElement> importedMember;

	/**
	 * The cached value of the '{@link #getPackageImport() <em>Package Import</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageImport()
	 * @generated
	 * @ordered
	 */
	protected EList<YPackageableElement> packageImport;

	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<YProperty> attribute;

	/**
	 * The cached value of the '{@link #getFeature() <em>Feature</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected EList<YFeature> feature;

	/**
	 * The cached value of the '{@link #getGeneral() <em>General</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneral()
	 * @generated
	 * @ordered
	 */
	protected EList<YClassifier> general;

	/**
	 * The cached value of the '{@link #getInheritedMember() <em>Inherited Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritedMember()
	 * @generated
	 * @ordered
	 */
	protected EList<YNamedElement> inheritedMember;

	/**
	 * The cached value of the '{@link #getPackage() <em>Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected YNamedElement package_;

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
	 * The cached value of the '{@link #getOwnedMember() <em>Owned Member</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMember()
	 * @generated
	 * @ordered
	 */
	protected EList<YNamedElement> ownedMember;

	/**
	 * The cached value of the '{@link #getOwnedRule() <em>Owned Rule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRule()
	 * @generated
	 * @ordered
	 */
	protected EList<YConstraint> ownedRule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YPrimitiveTypeImpl()
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
		return YammPackage.Literals.YPRIMITIVE_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YPRIMITIVE_TYPE__NAME, oldName, name, !oldNameESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, YammPackage.YPRIMITIVE_TYPE__NAME, oldName, NAME_EDEFAULT, oldNameESet));
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
	public YPackage getParentElement()
	{
		if (eContainerFeatureID() != YammPackage.YPRIMITIVE_TYPE__PARENT_ELEMENT) return null;
		return (YPackage)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentElement(YPackage newParentElement, NotificationChain msgs)
	{
		msgs = eBasicSetContainer((InternalEObject)newParentElement, YammPackage.YPRIMITIVE_TYPE__PARENT_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentElement(YPackage newParentElement)
	{
		if (newParentElement != eInternalContainer() || (eContainerFeatureID() != YammPackage.YPRIMITIVE_TYPE__PARENT_ELEMENT && newParentElement != null)) {
			if (EcoreUtil.isAncestor(this, newParentElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentElement != null)
				msgs = ((InternalEObject)newParentElement).eInverseAdd(this, YammPackage.YPACKAGE__OWNED_MEMBER_PACKAGE, YPackage.class, msgs);
			msgs = basicSetParentElement(newParentElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YPRIMITIVE_TYPE__PARENT_ELEMENT, newParentElement, newParentElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAbstract()
	{
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbstract(boolean newIsAbstract)
	{
		boolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YPRIMITIVE_TYPE__IS_ABSTRACT, oldIsAbstract, isAbstract));
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
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YPRIMITIVE_TYPE__QUALIFIED_NAME, oldQualifiedName, qualifiedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YNamedElement> getMember()
	{
		if (member == null) {
			member = new EObjectResolvingEList<YNamedElement>(YNamedElement.class, this, YammPackage.YPRIMITIVE_TYPE__MEMBER);
		}
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YPackageableElement> getElementImport()
	{
		if (elementImport == null) {
			elementImport = new EObjectResolvingEList<YPackageableElement>(YPackageableElement.class, this, YammPackage.YPRIMITIVE_TYPE__ELEMENT_IMPORT);
		}
		return elementImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YPackageableElement> getImportedMember()
	{
		if (importedMember == null) {
			importedMember = new EObjectResolvingEList<YPackageableElement>(YPackageableElement.class, this, YammPackage.YPRIMITIVE_TYPE__IMPORTED_MEMBER);
		}
		return importedMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YPackageableElement> getPackageImport()
	{
		if (packageImport == null) {
			packageImport = new EObjectResolvingEList<YPackageableElement>(YPackageableElement.class, this, YammPackage.YPRIMITIVE_TYPE__PACKAGE_IMPORT);
		}
		return packageImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YProperty> getAttribute()
	{
		if (attribute == null) {
			attribute = new EObjectResolvingEList<YProperty>(YProperty.class, this, YammPackage.YPRIMITIVE_TYPE__ATTRIBUTE);
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YFeature> getFeature()
	{
		if (feature == null) {
			feature = new EObjectResolvingEList<YFeature>(YFeature.class, this, YammPackage.YPRIMITIVE_TYPE__FEATURE);
		}
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YClassifier> getGeneral()
	{
		if (general == null) {
			general = new EObjectResolvingEList<YClassifier>(YClassifier.class, this, YammPackage.YPRIMITIVE_TYPE__GENERAL);
		}
		return general;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YNamedElement> getInheritedMember()
	{
		if (inheritedMember == null) {
			inheritedMember = new EObjectResolvingEList<YNamedElement>(YNamedElement.class, this, YammPackage.YPRIMITIVE_TYPE__INHERITED_MEMBER);
		}
		return inheritedMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YNamedElement getPackage()
	{
		if (package_ != null && package_.eIsProxy()) {
			InternalEObject oldPackage = (InternalEObject)package_;
			package_ = (YNamedElement)eResolveProxy(oldPackage);
			if (package_ != oldPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YammPackage.YPRIMITIVE_TYPE__PACKAGE, oldPackage, package_));
			}
		}
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YNamedElement basicGetPackage()
	{
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(YNamedElement newPackage)
	{
		YNamedElement oldPackage = package_;
		package_ = newPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YPRIMITIVE_TYPE__PACKAGE, oldPackage, package_));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, YammPackage.YPRIMITIVE_TYPE__OWNED_COMMENT, oldOwnedComment, newOwnedComment);
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
				msgs = ((InternalEObject)ownedComment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - YammPackage.YPRIMITIVE_TYPE__OWNED_COMMENT, null, msgs);
			if (newOwnedComment != null)
				msgs = ((InternalEObject)newOwnedComment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - YammPackage.YPRIMITIVE_TYPE__OWNED_COMMENT, null, msgs);
			msgs = basicSetOwnedComment(newOwnedComment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YammPackage.YPRIMITIVE_TYPE__OWNED_COMMENT, newOwnedComment, newOwnedComment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YElement> getOwnedElement()
	{
		if (ownedElement == null) {
			ownedElement = new EObjectContainmentEList<YElement>(YElement.class, this, YammPackage.YPRIMITIVE_TYPE__OWNED_ELEMENT);
		}
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YNamedElement> getOwnedMember()
	{
		if (ownedMember == null) {
			ownedMember = new EObjectContainmentEList<YNamedElement>(YNamedElement.class, this, YammPackage.YPRIMITIVE_TYPE__OWNED_MEMBER);
		}
		return ownedMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YConstraint> getOwnedRule()
	{
		if (ownedRule == null) {
			ownedRule = new EObjectContainmentEList<YConstraint>(YConstraint.class, this, YammPackage.YPRIMITIVE_TYPE__OWNED_RULE);
		}
		return ownedRule;
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
			case YammPackage.YPRIMITIVE_TYPE__PARENT_ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentElement((YPackage)otherEnd, msgs);
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
			case YammPackage.YPRIMITIVE_TYPE__PARENT_ELEMENT:
				return basicSetParentElement(null, msgs);
			case YammPackage.YPRIMITIVE_TYPE__OWNED_COMMENT:
				return basicSetOwnedComment(null, msgs);
			case YammPackage.YPRIMITIVE_TYPE__OWNED_ELEMENT:
				return ((InternalEList<?>)getOwnedElement()).basicRemove(otherEnd, msgs);
			case YammPackage.YPRIMITIVE_TYPE__OWNED_MEMBER:
				return ((InternalEList<?>)getOwnedMember()).basicRemove(otherEnd, msgs);
			case YammPackage.YPRIMITIVE_TYPE__OWNED_RULE:
				return ((InternalEList<?>)getOwnedRule()).basicRemove(otherEnd, msgs);
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
			case YammPackage.YPRIMITIVE_TYPE__PARENT_ELEMENT:
				return eInternalContainer().eInverseRemove(this, YammPackage.YPACKAGE__OWNED_MEMBER_PACKAGE, YPackage.class, msgs);
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
			case YammPackage.YPRIMITIVE_TYPE__NAME:
				return getName();
			case YammPackage.YPRIMITIVE_TYPE__PARENT_ELEMENT:
				return getParentElement();
			case YammPackage.YPRIMITIVE_TYPE__IS_ABSTRACT:
				return isIsAbstract();
			case YammPackage.YPRIMITIVE_TYPE__QUALIFIED_NAME:
				return getQualifiedName();
			case YammPackage.YPRIMITIVE_TYPE__MEMBER:
				return getMember();
			case YammPackage.YPRIMITIVE_TYPE__ELEMENT_IMPORT:
				return getElementImport();
			case YammPackage.YPRIMITIVE_TYPE__IMPORTED_MEMBER:
				return getImportedMember();
			case YammPackage.YPRIMITIVE_TYPE__PACKAGE_IMPORT:
				return getPackageImport();
			case YammPackage.YPRIMITIVE_TYPE__ATTRIBUTE:
				return getAttribute();
			case YammPackage.YPRIMITIVE_TYPE__FEATURE:
				return getFeature();
			case YammPackage.YPRIMITIVE_TYPE__GENERAL:
				return getGeneral();
			case YammPackage.YPRIMITIVE_TYPE__INHERITED_MEMBER:
				return getInheritedMember();
			case YammPackage.YPRIMITIVE_TYPE__PACKAGE:
				if (resolve) return getPackage();
				return basicGetPackage();
			case YammPackage.YPRIMITIVE_TYPE__OWNED_COMMENT:
				return getOwnedComment();
			case YammPackage.YPRIMITIVE_TYPE__OWNED_ELEMENT:
				return getOwnedElement();
			case YammPackage.YPRIMITIVE_TYPE__OWNED_MEMBER:
				return getOwnedMember();
			case YammPackage.YPRIMITIVE_TYPE__OWNED_RULE:
				return getOwnedRule();
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
			case YammPackage.YPRIMITIVE_TYPE__NAME:
				setName((String)newValue);
				return;
			case YammPackage.YPRIMITIVE_TYPE__PARENT_ELEMENT:
				setParentElement((YPackage)newValue);
				return;
			case YammPackage.YPRIMITIVE_TYPE__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
				return;
			case YammPackage.YPRIMITIVE_TYPE__QUALIFIED_NAME:
				setQualifiedName((String)newValue);
				return;
			case YammPackage.YPRIMITIVE_TYPE__MEMBER:
				getMember().clear();
				getMember().addAll((Collection<? extends YNamedElement>)newValue);
				return;
			case YammPackage.YPRIMITIVE_TYPE__ELEMENT_IMPORT:
				getElementImport().clear();
				getElementImport().addAll((Collection<? extends YPackageableElement>)newValue);
				return;
			case YammPackage.YPRIMITIVE_TYPE__IMPORTED_MEMBER:
				getImportedMember().clear();
				getImportedMember().addAll((Collection<? extends YPackageableElement>)newValue);
				return;
			case YammPackage.YPRIMITIVE_TYPE__PACKAGE_IMPORT:
				getPackageImport().clear();
				getPackageImport().addAll((Collection<? extends YPackageableElement>)newValue);
				return;
			case YammPackage.YPRIMITIVE_TYPE__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection<? extends YProperty>)newValue);
				return;
			case YammPackage.YPRIMITIVE_TYPE__FEATURE:
				getFeature().clear();
				getFeature().addAll((Collection<? extends YFeature>)newValue);
				return;
			case YammPackage.YPRIMITIVE_TYPE__GENERAL:
				getGeneral().clear();
				getGeneral().addAll((Collection<? extends YClassifier>)newValue);
				return;
			case YammPackage.YPRIMITIVE_TYPE__INHERITED_MEMBER:
				getInheritedMember().clear();
				getInheritedMember().addAll((Collection<? extends YNamedElement>)newValue);
				return;
			case YammPackage.YPRIMITIVE_TYPE__PACKAGE:
				setPackage((YNamedElement)newValue);
				return;
			case YammPackage.YPRIMITIVE_TYPE__OWNED_COMMENT:
				setOwnedComment((YComment)newValue);
				return;
			case YammPackage.YPRIMITIVE_TYPE__OWNED_ELEMENT:
				getOwnedElement().clear();
				getOwnedElement().addAll((Collection<? extends YElement>)newValue);
				return;
			case YammPackage.YPRIMITIVE_TYPE__OWNED_MEMBER:
				getOwnedMember().clear();
				getOwnedMember().addAll((Collection<? extends YNamedElement>)newValue);
				return;
			case YammPackage.YPRIMITIVE_TYPE__OWNED_RULE:
				getOwnedRule().clear();
				getOwnedRule().addAll((Collection<? extends YConstraint>)newValue);
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
			case YammPackage.YPRIMITIVE_TYPE__NAME:
				unsetName();
				return;
			case YammPackage.YPRIMITIVE_TYPE__PARENT_ELEMENT:
				setParentElement((YPackage)null);
				return;
			case YammPackage.YPRIMITIVE_TYPE__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case YammPackage.YPRIMITIVE_TYPE__QUALIFIED_NAME:
				setQualifiedName(QUALIFIED_NAME_EDEFAULT);
				return;
			case YammPackage.YPRIMITIVE_TYPE__MEMBER:
				getMember().clear();
				return;
			case YammPackage.YPRIMITIVE_TYPE__ELEMENT_IMPORT:
				getElementImport().clear();
				return;
			case YammPackage.YPRIMITIVE_TYPE__IMPORTED_MEMBER:
				getImportedMember().clear();
				return;
			case YammPackage.YPRIMITIVE_TYPE__PACKAGE_IMPORT:
				getPackageImport().clear();
				return;
			case YammPackage.YPRIMITIVE_TYPE__ATTRIBUTE:
				getAttribute().clear();
				return;
			case YammPackage.YPRIMITIVE_TYPE__FEATURE:
				getFeature().clear();
				return;
			case YammPackage.YPRIMITIVE_TYPE__GENERAL:
				getGeneral().clear();
				return;
			case YammPackage.YPRIMITIVE_TYPE__INHERITED_MEMBER:
				getInheritedMember().clear();
				return;
			case YammPackage.YPRIMITIVE_TYPE__PACKAGE:
				setPackage((YNamedElement)null);
				return;
			case YammPackage.YPRIMITIVE_TYPE__OWNED_COMMENT:
				setOwnedComment((YComment)null);
				return;
			case YammPackage.YPRIMITIVE_TYPE__OWNED_ELEMENT:
				getOwnedElement().clear();
				return;
			case YammPackage.YPRIMITIVE_TYPE__OWNED_MEMBER:
				getOwnedMember().clear();
				return;
			case YammPackage.YPRIMITIVE_TYPE__OWNED_RULE:
				getOwnedRule().clear();
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
			case YammPackage.YPRIMITIVE_TYPE__NAME:
				return isSetName();
			case YammPackage.YPRIMITIVE_TYPE__PARENT_ELEMENT:
				return getParentElement() != null;
			case YammPackage.YPRIMITIVE_TYPE__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
			case YammPackage.YPRIMITIVE_TYPE__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? qualifiedName != null : !QUALIFIED_NAME_EDEFAULT.equals(qualifiedName);
			case YammPackage.YPRIMITIVE_TYPE__MEMBER:
				return member != null && !member.isEmpty();
			case YammPackage.YPRIMITIVE_TYPE__ELEMENT_IMPORT:
				return elementImport != null && !elementImport.isEmpty();
			case YammPackage.YPRIMITIVE_TYPE__IMPORTED_MEMBER:
				return importedMember != null && !importedMember.isEmpty();
			case YammPackage.YPRIMITIVE_TYPE__PACKAGE_IMPORT:
				return packageImport != null && !packageImport.isEmpty();
			case YammPackage.YPRIMITIVE_TYPE__ATTRIBUTE:
				return attribute != null && !attribute.isEmpty();
			case YammPackage.YPRIMITIVE_TYPE__FEATURE:
				return feature != null && !feature.isEmpty();
			case YammPackage.YPRIMITIVE_TYPE__GENERAL:
				return general != null && !general.isEmpty();
			case YammPackage.YPRIMITIVE_TYPE__INHERITED_MEMBER:
				return inheritedMember != null && !inheritedMember.isEmpty();
			case YammPackage.YPRIMITIVE_TYPE__PACKAGE:
				return package_ != null;
			case YammPackage.YPRIMITIVE_TYPE__OWNED_COMMENT:
				return ownedComment != null;
			case YammPackage.YPRIMITIVE_TYPE__OWNED_ELEMENT:
				return ownedElement != null && !ownedElement.isEmpty();
			case YammPackage.YPRIMITIVE_TYPE__OWNED_MEMBER:
				return ownedMember != null && !ownedMember.isEmpty();
			case YammPackage.YPRIMITIVE_TYPE__OWNED_RULE:
				return ownedRule != null && !ownedRule.isEmpty();
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
				case YammPackage.YPRIMITIVE_TYPE__NAME: return YammPackage.YNAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == YPackageableElement.class) {
			switch (derivedFeatureID) {
				case YammPackage.YPRIMITIVE_TYPE__PARENT_ELEMENT: return YammPackage.YPACKAGEABLE_ELEMENT__PARENT_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == YClassifier.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == YType.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == YNamespace.class) {
			switch (derivedFeatureID) {
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
				case YammPackage.YNAMED_ELEMENT__NAME: return YammPackage.YPRIMITIVE_TYPE__NAME;
				default: return -1;
			}
		}
		if (baseClass == YPackageableElement.class) {
			switch (baseFeatureID) {
				case YammPackage.YPACKAGEABLE_ELEMENT__PARENT_ELEMENT: return YammPackage.YPRIMITIVE_TYPE__PARENT_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == YClassifier.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == YType.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == YNamespace.class) {
			switch (baseFeatureID) {
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
		result.append(", isAbstract: ");
		result.append(isAbstract);
		result.append(", qualifiedName: ");
		result.append(qualifiedName);
		result.append(')');
		return result.toString();
	}

} //YPrimitiveTypeImpl
