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
package online.yamm.coreModelDiagram.yammDiagram;

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
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.YTrAttachment#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.YTrAttachment#getTransition <em>Transition</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.YTrAttachment#getEffects <em>Effects</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.YTrAttachment#getGuard <em>Guard</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.YTrAttachment#getGuardStringRep <em>Guard String Rep</em>}</li>
 * </ul>
 *
 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYTrAttachment()
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
	 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYTrAttachment_QualifiedName()
	 * @model
	 * @generated
	 */
	String getQualifiedName();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelDiagram.yammDiagram.YTrAttachment#getQualifiedName <em>Qualified Name</em>}' attribute.
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
	 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYTrAttachment_Transition()
	 * @model
	 * @generated
	 */
	YTransition getTransition();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelDiagram.yammDiagram.YTrAttachment#getTransition <em>Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition</em>' reference.
	 * @see #getTransition()
	 * @generated
	 */
	void setTransition(YTransition value);

	/**
	 * Returns the value of the '<em><b>Effects</b></em>' containment reference list.
	 * The list contents are of type {@link online.yamm.coreModelDiagram.yammDiagram.YEffect}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effects</em>' containment reference list.
	 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYTrAttachment_Effects()
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
	 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYTrAttachment_Guard()
	 * @model containment="true"
	 * @generated
	 */
	XExpression getGuard();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelDiagram.yammDiagram.YTrAttachment#getGuard <em>Guard</em>}' containment reference.
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
	 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYTrAttachment_GuardStringRep()
	 * @model
	 * @generated
	 */
	String getGuardStringRep();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelDiagram.yammDiagram.YTrAttachment#getGuardStringRep <em>Guard String Rep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard String Rep</em>' attribute.
	 * @see #getGuardStringRep()
	 * @generated
	 */
	void setGuardStringRep(String value);

} // YTrAttachment
