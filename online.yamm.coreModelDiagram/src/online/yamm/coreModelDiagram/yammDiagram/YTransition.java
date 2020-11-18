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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YTransition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.YTransition#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.YTransition#getSource <em>Source</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.YTransition#getTarget <em>Target</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.YTransition#getAttachment <em>Attachment</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.YTransition#getOwnedComment <em>Owned Comment</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.YTransition#getOwnedElement <em>Owned Element</em>}</li>
 * </ul>
 *
 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYTransition()
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
	 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYTransition_QualifiedName()
	 * @model
	 * @generated
	 */
	String getQualifiedName();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelDiagram.yammDiagram.YTransition#getQualifiedName <em>Qualified Name</em>}' attribute.
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
	 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYTransition_Source()
	 * @model
	 * @generated
	 */
	YVertex getSource();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelDiagram.yammDiagram.YTransition#getSource <em>Source</em>}' reference.
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
	 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYTransition_Target()
	 * @model
	 * @generated
	 */
	YVertex getTarget();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelDiagram.yammDiagram.YTransition#getTarget <em>Target</em>}' reference.
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
	 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYTransition_Attachment()
	 * @model
	 * @generated
	 */
	YTrAttachment getAttachment();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelDiagram.yammDiagram.YTransition#getAttachment <em>Attachment</em>}' reference.
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
	 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYTransition_OwnedComment()
	 * @model containment="true"
	 * @generated
	 */
	YComment getOwnedComment();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelDiagram.yammDiagram.YTransition#getOwnedComment <em>Owned Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Comment</em>' containment reference.
	 * @see #getOwnedComment()
	 * @generated
	 */
	void setOwnedComment(YComment value);

	/**
	 * Returns the value of the '<em><b>Owned Element</b></em>' containment reference list.
	 * The list contents are of type {@link online.yamm.coreModelDiagram.yammDiagram.YElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Element</em>' containment reference list.
	 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYTransition_OwnedElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<YElement> getOwnedElement();

} // YTransition
