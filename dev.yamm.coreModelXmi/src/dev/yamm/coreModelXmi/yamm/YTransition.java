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
 * A representation of the model object '<em><b>YTransition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YTransition#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YTransition#getSource <em>Source</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YTransition#getTarget <em>Target</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YTransition#getAttachment <em>Attachment</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YTransition#getOwnedComment <em>Owned Comment</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YTransition#getOwnedElement <em>Owned Element</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YTransition#getPosObjectID <em>Pos Object ID</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YTransition#getPosName <em>Pos Name</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YTransition#getPosQualifiedName <em>Pos Qualified Name</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YTransition#getPosSource <em>Pos Source</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YTransition#getPosTarget <em>Pos Target</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YTransition#getPosAttachment <em>Pos Attachment</em>}</li>
 * </ul>
 *
 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYTransition()
 * @model
 * @generated
 */
public interface YTransition extends YElement, YNamedElement, YObject
{
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
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYTransition_QualifiedName()
	 * @model
	 * @generated
	 */
	String getQualifiedName();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YTransition#getQualifiedName <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualified Name</em>' attribute.
	 * @see #getQualifiedName()
	 * @generated
	 */
	void setQualifiedName(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(YVertex)
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYTransition_Source()
	 * @model
	 * @generated
	 */
	YVertex getSource();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YTransition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(YVertex value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(YVertex)
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYTransition_Target()
	 * @model
	 * @generated
	 */
	YVertex getTarget();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YTransition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(YVertex value);

	/**
	 * Returns the value of the '<em><b>Attachment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachment</em>' reference.
	 * @see #setAttachment(YTrAttachment)
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYTransition_Attachment()
	 * @model
	 * @generated
	 */
	YTrAttachment getAttachment();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YTransition#getAttachment <em>Attachment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachment</em>' reference.
	 * @see #getAttachment()
	 * @generated
	 */
	void setAttachment(YTrAttachment value);

	/**
	 * Returns the value of the '<em><b>Owned Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Comment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Comment</em>' containment reference.
	 * @see #setOwnedComment(YComment)
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYTransition_OwnedComment()
	 * @model containment="true"
	 * @generated
	 */
	YComment getOwnedComment();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YTransition#getOwnedComment <em>Owned Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Comment</em>' containment reference.
	 * @see #getOwnedComment()
	 * @generated
	 */
	void setOwnedComment(YComment value);

	/**
	 * Returns the value of the '<em><b>Owned Element</b></em>' containment reference list.
	 * The list contents are of type {@link dev.yamm.coreModelXmi.yamm.YElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Element</em>' containment reference list.
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYTransition_OwnedElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<YElement> getOwnedElement();

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
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYTransition_PosObjectID()
	 * @model
	 * @generated
	 */
	SingleLinePropertyInfo getPosObjectID();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YTransition#getPosObjectID <em>Pos Object ID</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos Object ID</em>' reference.
	 * @see #getPosObjectID()
	 * @generated
	 */
	void setPosObjectID(SingleLinePropertyInfo value);

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
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYTransition_PosName()
	 * @model
	 * @generated
	 */
	SingleLinePropertyInfo getPosName();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YTransition#getPosName <em>Pos Name</em>}' reference.
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
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYTransition_PosQualifiedName()
	 * @model
	 * @generated
	 */
	SingleLinePropertyInfo getPosQualifiedName();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YTransition#getPosQualifiedName <em>Pos Qualified Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos Qualified Name</em>' reference.
	 * @see #getPosQualifiedName()
	 * @generated
	 */
	void setPosQualifiedName(SingleLinePropertyInfo value);

	/**
	 * Returns the value of the '<em><b>Pos Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos Source</em>' reference.
	 * @see #setPosSource(SingleLinePropertyInfo)
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYTransition_PosSource()
	 * @model
	 * @generated
	 */
	SingleLinePropertyInfo getPosSource();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YTransition#getPosSource <em>Pos Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos Source</em>' reference.
	 * @see #getPosSource()
	 * @generated
	 */
	void setPosSource(SingleLinePropertyInfo value);

	/**
	 * Returns the value of the '<em><b>Pos Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos Target</em>' reference.
	 * @see #setPosTarget(SingleLinePropertyInfo)
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYTransition_PosTarget()
	 * @model
	 * @generated
	 */
	SingleLinePropertyInfo getPosTarget();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YTransition#getPosTarget <em>Pos Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos Target</em>' reference.
	 * @see #getPosTarget()
	 * @generated
	 */
	void setPosTarget(SingleLinePropertyInfo value);

	/**
	 * Returns the value of the '<em><b>Pos Attachment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos Attachment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos Attachment</em>' reference.
	 * @see #setPosAttachment(SingleLinePropertyInfo)
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYTransition_PosAttachment()
	 * @model
	 * @generated
	 */
	SingleLinePropertyInfo getPosAttachment();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YTransition#getPosAttachment <em>Pos Attachment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos Attachment</em>' reference.
	 * @see #getPosAttachment()
	 * @generated
	 */
	void setPosAttachment(SingleLinePropertyInfo value);

} // YTransition
