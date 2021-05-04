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
package dev.yamm.coreModelXmi.yamm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YClass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YClass#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YClass#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YClass#getPackage <em>Package</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YClass#getSuperClass <em>Super Class</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YClass#getOwnedAttribute <em>Owned Attribute</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YClass#getOwnedOperation <em>Owned Operation</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YClass#getInsertLineSuperClass <em>Insert Line Super Class</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YClass#getInsertLineAttribute <em>Insert Line Attribute</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YClass#getInsertLineOperation <em>Insert Line Operation</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YClass#getPosObjectID <em>Pos Object ID</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YClass#getPosIsAbstract <em>Pos Is Abstract</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YClass#getPosName <em>Pos Name</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YClass#getPosQualifiedName <em>Pos Qualified Name</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YClass#getPosPackage <em>Pos Package</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YClass#isObserveQueue <em>Observe Queue</em>}</li>
 * </ul>
 *
 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYClass()
 * @model
 * @generated
 */
public interface YClass extends YElement, YNamedElement, YPackageableElement, YClassifier, YType, YNamespace, YObject
{
	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(boolean)
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYClass_IsAbstract()
	 * @model
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YClass#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #isIsAbstract()
	 * @generated
	 */
	void setIsAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualified Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualified Name</em>' attribute.
	 * @see #setQualifiedName(String)
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYClass_QualifiedName()
	 * @model
	 * @generated
	 */
	String getQualifiedName();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YClass#getQualifiedName <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualified Name</em>' attribute.
	 * @see #getQualifiedName()
	 * @generated
	 */
	void setQualifiedName(String value);

	/**
	 * Returns the value of the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' reference.
	 * @see #setPackage(YNamedElement)
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYClass_Package()
	 * @model
	 * @generated
	 */
	YNamedElement getPackage();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YClass#getPackage <em>Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(YNamedElement value);

	/**
	 * Returns the value of the '<em><b>Super Class</b></em>' reference list.
	 * The list contents are of type {@link dev.yamm.coreModelXmi.yamm.YClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Class</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Class</em>' reference list.
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYClass_SuperClass()
	 * @model
	 * @generated
	 */
	EList<YClass> getSuperClass();

	/**
	 * Returns the value of the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link dev.yamm.coreModelXmi.yamm.YProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Attribute</em>' containment reference list.
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYClass_OwnedAttribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<YProperty> getOwnedAttribute();

	/**
	 * Returns the value of the '<em><b>Owned Operation</b></em>' containment reference list.
	 * The list contents are of type {@link dev.yamm.coreModelXmi.yamm.YOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Operation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Operation</em>' containment reference list.
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYClass_OwnedOperation()
	 * @model containment="true"
	 * @generated
	 */
	EList<YOperation> getOwnedOperation();

	/**
	 * Returns the value of the '<em><b>Insert Line Super Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insert Line Super Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insert Line Super Class</em>' attribute.
	 * @see #setInsertLineSuperClass(int)
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYClass_InsertLineSuperClass()
	 * @model
	 * @generated
	 */
	int getInsertLineSuperClass();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YClass#getInsertLineSuperClass <em>Insert Line Super Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insert Line Super Class</em>' attribute.
	 * @see #getInsertLineSuperClass()
	 * @generated
	 */
	void setInsertLineSuperClass(int value);

	/**
	 * Returns the value of the '<em><b>Insert Line Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insert Line Attribute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insert Line Attribute</em>' attribute.
	 * @see #setInsertLineAttribute(int)
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYClass_InsertLineAttribute()
	 * @model
	 * @generated
	 */
	int getInsertLineAttribute();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YClass#getInsertLineAttribute <em>Insert Line Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insert Line Attribute</em>' attribute.
	 * @see #getInsertLineAttribute()
	 * @generated
	 */
	void setInsertLineAttribute(int value);

	/**
	 * Returns the value of the '<em><b>Insert Line Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insert Line Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insert Line Operation</em>' attribute.
	 * @see #setInsertLineOperation(int)
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYClass_InsertLineOperation()
	 * @model
	 * @generated
	 */
	int getInsertLineOperation();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YClass#getInsertLineOperation <em>Insert Line Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insert Line Operation</em>' attribute.
	 * @see #getInsertLineOperation()
	 * @generated
	 */
	void setInsertLineOperation(int value);

	/**
	 * Returns the value of the '<em><b>Pos Object ID</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos Object ID</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos Object ID</em>' reference.
	 * @see #setPosObjectID(SingleLinePropertyInfo)
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYClass_PosObjectID()
	 * @model
	 * @generated
	 */
	SingleLinePropertyInfo getPosObjectID();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YClass#getPosObjectID <em>Pos Object ID</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos Object ID</em>' reference.
	 * @see #getPosObjectID()
	 * @generated
	 */
	void setPosObjectID(SingleLinePropertyInfo value);

	/**
	 * Returns the value of the '<em><b>Pos Is Abstract</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos Is Abstract</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos Is Abstract</em>' reference.
	 * @see #setPosIsAbstract(SingleLinePropertyInfo)
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYClass_PosIsAbstract()
	 * @model
	 * @generated
	 */
	SingleLinePropertyInfo getPosIsAbstract();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YClass#getPosIsAbstract <em>Pos Is Abstract</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos Is Abstract</em>' reference.
	 * @see #getPosIsAbstract()
	 * @generated
	 */
	void setPosIsAbstract(SingleLinePropertyInfo value);

	/**
	 * Returns the value of the '<em><b>Pos Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos Name</em>' reference.
	 * @see #setPosName(SingleLinePropertyInfo)
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYClass_PosName()
	 * @model
	 * @generated
	 */
	SingleLinePropertyInfo getPosName();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YClass#getPosName <em>Pos Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos Name</em>' reference.
	 * @see #getPosName()
	 * @generated
	 */
	void setPosName(SingleLinePropertyInfo value);

	/**
	 * Returns the value of the '<em><b>Pos Qualified Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos Qualified Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos Qualified Name</em>' reference.
	 * @see #setPosQualifiedName(SingleLinePropertyInfo)
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYClass_PosQualifiedName()
	 * @model
	 * @generated
	 */
	SingleLinePropertyInfo getPosQualifiedName();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YClass#getPosQualifiedName <em>Pos Qualified Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos Qualified Name</em>' reference.
	 * @see #getPosQualifiedName()
	 * @generated
	 */
	void setPosQualifiedName(SingleLinePropertyInfo value);

	/**
	 * Returns the value of the '<em><b>Pos Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos Package</em>' reference.
	 * @see #setPosPackage(SingleLinePropertyInfo)
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYClass_PosPackage()
	 * @model
	 * @generated
	 */
	SingleLinePropertyInfo getPosPackage();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YClass#getPosPackage <em>Pos Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos Package</em>' reference.
	 * @see #getPosPackage()
	 * @generated
	 */
	void setPosPackage(SingleLinePropertyInfo value);

	/**
	 * Returns the value of the '<em><b>Observe Queue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Observe Queue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observe Queue</em>' attribute.
	 * @see #setObserveQueue(boolean)
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYClass_ObserveQueue()
	 * @model
	 * @generated
	 */
	boolean isObserveQueue();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YClass#isObserveQueue <em>Observe Queue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observe Queue</em>' attribute.
	 * @see #isObserveQueue()
	 * @generated
	 */
	void setObserveQueue(boolean value);

} // YClass
