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
package online.yamm.coreModelXmi.yamm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YTr Attachment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YTrAttachment#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YTrAttachment#getTransition <em>Transition</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YTrAttachment#getEffects <em>Effects</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YTrAttachment#getGuard <em>Guard</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YTrAttachment#getGuardStringRep <em>Guard String Rep</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YTrAttachment#getPosTransition <em>Pos Transition</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YTrAttachment#getPosObjectID <em>Pos Object ID</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YTrAttachment#getPosName <em>Pos Name</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YTrAttachment#getPosQualifiedName <em>Pos Qualified Name</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YTrAttachment#getInsertEffect <em>Insert Effect</em>}</li>
 * </ul>
 *
 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYTrAttachment()
 * @model
 * @generated
 */
public interface YTrAttachment extends YElement, YNamedElement, YObject
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
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYTrAttachment_QualifiedName()
	 * @model
	 * @generated
	 */
	String getQualifiedName();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelXmi.yamm.YTrAttachment#getQualifiedName <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualified Name</em>' attribute.
	 * @see #getQualifiedName()
	 * @generated
	 */
	void setQualifiedName(String value);

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' reference.
	 * @see #setTransition(YTransition)
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYTrAttachment_Transition()
	 * @model
	 * @generated
	 */
	YTransition getTransition();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelXmi.yamm.YTrAttachment#getTransition <em>Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition</em>' reference.
	 * @see #getTransition()
	 * @generated
	 */
	void setTransition(YTransition value);

	/**
	 * Returns the value of the '<em><b>Effects</b></em>' containment reference list.
	 * The list contents are of type {@link online.yamm.coreModelXmi.yamm.YEffect}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effects</em>' containment reference list.
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYTrAttachment_Effects()
	 * @model containment="true"
	 * @generated
	 */
	EList<YEffect> getEffects();

	/**
	 * Returns the value of the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard</em>' containment reference.
	 * @see #setGuard(XExpression)
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYTrAttachment_Guard()
	 * @model containment="true"
	 * @generated
	 */
	XExpression getGuard();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelXmi.yamm.YTrAttachment#getGuard <em>Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' containment reference.
	 * @see #getGuard()
	 * @generated
	 */
	void setGuard(XExpression value);

	/**
	 * Returns the value of the '<em><b>Guard String Rep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard String Rep</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard String Rep</em>' attribute.
	 * @see #setGuardStringRep(String)
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYTrAttachment_GuardStringRep()
	 * @model
	 * @generated
	 */
	String getGuardStringRep();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelXmi.yamm.YTrAttachment#getGuardStringRep <em>Guard String Rep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard String Rep</em>' attribute.
	 * @see #getGuardStringRep()
	 * @generated
	 */
	void setGuardStringRep(String value);

	/**
	 * Returns the value of the '<em><b>Pos Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos Transition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos Transition</em>' reference.
	 * @see #setPosTransition(SingleLinePropertyInfo)
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYTrAttachment_PosTransition()
	 * @model
	 * @generated
	 */
	SingleLinePropertyInfo getPosTransition();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelXmi.yamm.YTrAttachment#getPosTransition <em>Pos Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos Transition</em>' reference.
	 * @see #getPosTransition()
	 * @generated
	 */
	void setPosTransition(SingleLinePropertyInfo value);

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
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYTrAttachment_PosObjectID()
	 * @model
	 * @generated
	 */
	SingleLinePropertyInfo getPosObjectID();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelXmi.yamm.YTrAttachment#getPosObjectID <em>Pos Object ID</em>}' reference.
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
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYTrAttachment_PosName()
	 * @model
	 * @generated
	 */
	SingleLinePropertyInfo getPosName();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelXmi.yamm.YTrAttachment#getPosName <em>Pos Name</em>}' reference.
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
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYTrAttachment_PosQualifiedName()
	 * @model
	 * @generated
	 */
	SingleLinePropertyInfo getPosQualifiedName();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelXmi.yamm.YTrAttachment#getPosQualifiedName <em>Pos Qualified Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos Qualified Name</em>' reference.
	 * @see #getPosQualifiedName()
	 * @generated
	 */
	void setPosQualifiedName(SingleLinePropertyInfo value);

	/**
	 * Returns the value of the '<em><b>Insert Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insert Effect</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insert Effect</em>' attribute.
	 * @see #setInsertEffect(int)
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYTrAttachment_InsertEffect()
	 * @model
	 * @generated
	 */
	int getInsertEffect();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelXmi.yamm.YTrAttachment#getInsertEffect <em>Insert Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insert Effect</em>' attribute.
	 * @see #getInsertEffect()
	 * @generated
	 */
	void setInsertEffect(int value);

} // YTrAttachment
