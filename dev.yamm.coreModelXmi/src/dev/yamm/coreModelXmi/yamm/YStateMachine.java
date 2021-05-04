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
 * A representation of the model object '<em><b>YState Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YStateMachine#isInitialActive <em>Initial Active</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YStateMachine#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YStateMachine#getRtc <em>Rtc</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YStateMachine#getMaxEffectsToBeProcessed <em>Max Effects To Be Processed</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YStateMachine#getCalledOperation <em>Called Operation</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YStateMachine#getOwnedComment <em>Owned Comment</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YStateMachine#getOwnedElement <em>Owned Element</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YStateMachine#getTransition <em>Transition</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YStateMachine#getSubvertex <em>Subvertex</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YStateMachine#getTrAttach <em>Tr Attach</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YStateMachine#getOperation <em>Operation</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YStateMachine#getPosObjectID <em>Pos Object ID</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YStateMachine#getPosName <em>Pos Name</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YStateMachine#getPosQualifiedName <em>Pos Qualified Name</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YStateMachine#getPosInitialActive <em>Pos Initial Active</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YStateMachine#getPosRtc <em>Pos Rtc</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YStateMachine#getPosMaxEffectsToBeProcessed <em>Pos Max Effects To Be Processed</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YStateMachine#getInsertLineTransition <em>Insert Line Transition</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YStateMachine#getInsertLineVertex <em>Insert Line Vertex</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YStateMachine#getInsertLineAttachment <em>Insert Line Attachment</em>}</li>
 *   <li>{@link dev.yamm.coreModelXmi.yamm.YStateMachine#isDesInitializer <em>Des Initializer</em>}</li>
 * </ul>
 *
 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYStateMachine()
 * @model
 * @generated
 */
public interface YStateMachine extends YElement, YNamedElement, YObject
{
	/**
	 * Returns the value of the '<em><b>Initial Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Active</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Active</em>' attribute.
	 * @see #setInitialActive(boolean)
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYStateMachine_InitialActive()
	 * @model
	 * @generated
	 */
	boolean isInitialActive();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YStateMachine#isInitialActive <em>Initial Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Active</em>' attribute.
	 * @see #isInitialActive()
	 * @generated
	 */
	void setInitialActive(boolean value);

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
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYStateMachine_QualifiedName()
	 * @model
	 * @generated
	 */
	String getQualifiedName();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YStateMachine#getQualifiedName <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualified Name</em>' attribute.
	 * @see #getQualifiedName()
	 * @generated
	 */
	void setQualifiedName(String value);

	/**
	 * Returns the value of the '<em><b>Rtc</b></em>' attribute.
	 * The literals are from the enumeration {@link dev.yamm.coreModelXmi.yamm.YRunToCompletion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rtc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rtc</em>' attribute.
	 * @see dev.yamm.coreModelXmi.yamm.YRunToCompletion
	 * @see #setRtc(YRunToCompletion)
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYStateMachine_Rtc()
	 * @model
	 * @generated
	 */
	YRunToCompletion getRtc();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YStateMachine#getRtc <em>Rtc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rtc</em>' attribute.
	 * @see dev.yamm.coreModelXmi.yamm.YRunToCompletion
	 * @see #getRtc()
	 * @generated
	 */
	void setRtc(YRunToCompletion value);

	/**
	 * Returns the value of the '<em><b>Max Effects To Be Processed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Effects To Be Processed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Effects To Be Processed</em>' attribute.
	 * @see #setMaxEffectsToBeProcessed(int)
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYStateMachine_MaxEffectsToBeProcessed()
	 * @model
	 * @generated
	 */
	int getMaxEffectsToBeProcessed();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YStateMachine#getMaxEffectsToBeProcessed <em>Max Effects To Be Processed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Effects To Be Processed</em>' attribute.
	 * @see #getMaxEffectsToBeProcessed()
	 * @generated
	 */
	void setMaxEffectsToBeProcessed(int value);

	/**
	 * Returns the value of the '<em><b>Called Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Called Operation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Called Operation</em>' reference.
	 * @see #setCalledOperation(YOperation)
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYStateMachine_CalledOperation()
	 * @model
	 * @generated
	 */
	YOperation getCalledOperation();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YStateMachine#getCalledOperation <em>Called Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Called Operation</em>' reference.
	 * @see #getCalledOperation()
	 * @generated
	 */
	void setCalledOperation(YOperation value);

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
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYStateMachine_OwnedComment()
	 * @model containment="true"
	 * @generated
	 */
	YComment getOwnedComment();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YStateMachine#getOwnedComment <em>Owned Comment</em>}' containment reference.
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
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYStateMachine_OwnedElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<YElement> getOwnedElement();

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' containment reference list.
	 * The list contents are of type {@link dev.yamm.coreModelXmi.yamm.YTransition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' containment reference list.
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYStateMachine_Transition()
	 * @model containment="true"
	 * @generated
	 */
	EList<YTransition> getTransition();

	/**
	 * Returns the value of the '<em><b>Subvertex</b></em>' containment reference list.
	 * The list contents are of type {@link dev.yamm.coreModelXmi.yamm.YVertex}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subvertex</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subvertex</em>' containment reference list.
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYStateMachine_Subvertex()
	 * @model containment="true"
	 * @generated
	 */
	EList<YVertex> getSubvertex();

	/**
	 * Returns the value of the '<em><b>Tr Attach</b></em>' containment reference list.
	 * The list contents are of type {@link dev.yamm.coreModelXmi.yamm.YTrAttachment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tr Attach</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tr Attach</em>' containment reference list.
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYStateMachine_TrAttach()
	 * @model containment="true"
	 * @generated
	 */
	EList<YTrAttachment> getTrAttach();

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link dev.yamm.coreModelXmi.yamm.YOperation#getStateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' container reference.
	 * @see #setOperation(YOperation)
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYStateMachine_Operation()
	 * @see dev.yamm.coreModelXmi.yamm.YOperation#getStateMachine
	 * @model opposite="stateMachine" required="true" transient="false"
	 * @generated
	 */
	YOperation getOperation();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YStateMachine#getOperation <em>Operation</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' container reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(YOperation value);

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
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYStateMachine_PosObjectID()
	 * @model
	 * @generated
	 */
	SingleLinePropertyInfo getPosObjectID();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YStateMachine#getPosObjectID <em>Pos Object ID</em>}' reference.
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
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYStateMachine_PosName()
	 * @model
	 * @generated
	 */
	SingleLinePropertyInfo getPosName();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YStateMachine#getPosName <em>Pos Name</em>}' reference.
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
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYStateMachine_PosQualifiedName()
	 * @model
	 * @generated
	 */
	SingleLinePropertyInfo getPosQualifiedName();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YStateMachine#getPosQualifiedName <em>Pos Qualified Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos Qualified Name</em>' reference.
	 * @see #getPosQualifiedName()
	 * @generated
	 */
	void setPosQualifiedName(SingleLinePropertyInfo value);

	/**
	 * Returns the value of the '<em><b>Pos Initial Active</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos Initial Active</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos Initial Active</em>' reference.
	 * @see #setPosInitialActive(SingleLinePropertyInfo)
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYStateMachine_PosInitialActive()
	 * @model
	 * @generated
	 */
	SingleLinePropertyInfo getPosInitialActive();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YStateMachine#getPosInitialActive <em>Pos Initial Active</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos Initial Active</em>' reference.
	 * @see #getPosInitialActive()
	 * @generated
	 */
	void setPosInitialActive(SingleLinePropertyInfo value);

	/**
	 * Returns the value of the '<em><b>Pos Rtc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos Rtc</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos Rtc</em>' reference.
	 * @see #setPosRtc(SingleLinePropertyInfo)
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYStateMachine_PosRtc()
	 * @model
	 * @generated
	 */
	SingleLinePropertyInfo getPosRtc();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YStateMachine#getPosRtc <em>Pos Rtc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos Rtc</em>' reference.
	 * @see #getPosRtc()
	 * @generated
	 */
	void setPosRtc(SingleLinePropertyInfo value);

	/**
	 * Returns the value of the '<em><b>Pos Max Effects To Be Processed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos Max Effects To Be Processed</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos Max Effects To Be Processed</em>' reference.
	 * @see #setPosMaxEffectsToBeProcessed(SingleLinePropertyInfo)
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYStateMachine_PosMaxEffectsToBeProcessed()
	 * @model
	 * @generated
	 */
	SingleLinePropertyInfo getPosMaxEffectsToBeProcessed();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YStateMachine#getPosMaxEffectsToBeProcessed <em>Pos Max Effects To Be Processed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos Max Effects To Be Processed</em>' reference.
	 * @see #getPosMaxEffectsToBeProcessed()
	 * @generated
	 */
	void setPosMaxEffectsToBeProcessed(SingleLinePropertyInfo value);

	/**
	 * Returns the value of the '<em><b>Insert Line Transition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insert Line Transition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insert Line Transition</em>' attribute.
	 * @see #setInsertLineTransition(int)
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYStateMachine_InsertLineTransition()
	 * @model
	 * @generated
	 */
	int getInsertLineTransition();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YStateMachine#getInsertLineTransition <em>Insert Line Transition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insert Line Transition</em>' attribute.
	 * @see #getInsertLineTransition()
	 * @generated
	 */
	void setInsertLineTransition(int value);

	/**
	 * Returns the value of the '<em><b>Insert Line Vertex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insert Line Vertex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insert Line Vertex</em>' attribute.
	 * @see #setInsertLineVertex(int)
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYStateMachine_InsertLineVertex()
	 * @model
	 * @generated
	 */
	int getInsertLineVertex();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YStateMachine#getInsertLineVertex <em>Insert Line Vertex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insert Line Vertex</em>' attribute.
	 * @see #getInsertLineVertex()
	 * @generated
	 */
	void setInsertLineVertex(int value);

	/**
	 * Returns the value of the '<em><b>Insert Line Attachment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insert Line Attachment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insert Line Attachment</em>' attribute.
	 * @see #setInsertLineAttachment(int)
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYStateMachine_InsertLineAttachment()
	 * @model
	 * @generated
	 */
	int getInsertLineAttachment();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YStateMachine#getInsertLineAttachment <em>Insert Line Attachment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insert Line Attachment</em>' attribute.
	 * @see #getInsertLineAttachment()
	 * @generated
	 */
	void setInsertLineAttachment(int value);

	/**
	 * Returns the value of the '<em><b>Des Initializer</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Des Initializer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Des Initializer</em>' attribute.
	 * @see #setDesInitializer(boolean)
	 * @see dev.yamm.coreModelXmi.yamm.YammPackage#getYStateMachine_DesInitializer()
	 * @model default="false"
	 * @generated
	 */
	boolean isDesInitializer();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelXmi.yamm.YStateMachine#isDesInitializer <em>Des Initializer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Des Initializer</em>' attribute.
	 * @see #isDesInitializer()
	 * @generated
	 */
	void setDesInitializer(boolean value);

} // YStateMachine
