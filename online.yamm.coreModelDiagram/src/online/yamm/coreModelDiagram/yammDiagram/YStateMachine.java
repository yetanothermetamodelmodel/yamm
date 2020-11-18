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
 * A representation of the model object '<em><b>YState Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.YStateMachine#isInitialActive <em>Initial Active</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.YStateMachine#isDesInitializer <em>Des Initializer</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.YStateMachine#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.YStateMachine#getRtc <em>Rtc</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.YStateMachine#getMaxEffectsToBeProcessed <em>Max Effects To Be Processed</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.YStateMachine#getCalledOperation <em>Called Operation</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.YStateMachine#getOwnedComment <em>Owned Comment</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.YStateMachine#getOwnedElement <em>Owned Element</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.YStateMachine#getTransition <em>Transition</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.YStateMachine#getSubvertex <em>Subvertex</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.YStateMachine#getTrAttach <em>Tr Attach</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.YStateMachine#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYStateMachine()
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
	 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYStateMachine_InitialActive()
	 * @model
	 * @generated
	 */
	boolean isInitialActive();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelDiagram.yammDiagram.YStateMachine#isInitialActive <em>Initial Active</em>}' attribute.
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
	 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYStateMachine_QualifiedName()
	 * @model
	 * @generated
	 */
	String getQualifiedName();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelDiagram.yammDiagram.YStateMachine#getQualifiedName <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualified Name</em>' attribute.
	 * @see #getQualifiedName()
	 * @generated
	 */
	void setQualifiedName(String value);

	/**
	 * Returns the value of the '<em><b>Rtc</b></em>' attribute.
	 * The literals are from the enumeration {@link online.yamm.coreModelDiagram.yammDiagram.YRunToCompletion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rtc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rtc</em>' attribute.
	 * @see online.yamm.coreModelDiagram.yammDiagram.YRunToCompletion
	 * @see #setRtc(YRunToCompletion)
	 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYStateMachine_Rtc()
	 * @model
	 * @generated
	 */
	YRunToCompletion getRtc();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelDiagram.yammDiagram.YStateMachine#getRtc <em>Rtc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rtc</em>' attribute.
	 * @see online.yamm.coreModelDiagram.yammDiagram.YRunToCompletion
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
	 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYStateMachine_MaxEffectsToBeProcessed()
	 * @model
	 * @generated
	 */
	int getMaxEffectsToBeProcessed();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelDiagram.yammDiagram.YStateMachine#getMaxEffectsToBeProcessed <em>Max Effects To Be Processed</em>}' attribute.
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
	 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYStateMachine_CalledOperation()
	 * @model
	 * @generated
	 */
	YOperation getCalledOperation();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelDiagram.yammDiagram.YStateMachine#getCalledOperation <em>Called Operation</em>}' reference.
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
	 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYStateMachine_OwnedComment()
	 * @model containment="true"
	 * @generated
	 */
	YComment getOwnedComment();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelDiagram.yammDiagram.YStateMachine#getOwnedComment <em>Owned Comment</em>}' containment reference.
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
	 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYStateMachine_OwnedElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<YElement> getOwnedElement();

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' containment reference list.
	 * The list contents are of type {@link online.yamm.coreModelDiagram.yammDiagram.YTransition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' containment reference list.
	 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYStateMachine_Transition()
	 * @model containment="true"
	 * @generated
	 */
	EList<YTransition> getTransition();

	/**
	 * Returns the value of the '<em><b>Subvertex</b></em>' containment reference list.
	 * The list contents are of type {@link online.yamm.coreModelDiagram.yammDiagram.YVertex}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subvertex</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subvertex</em>' containment reference list.
	 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYStateMachine_Subvertex()
	 * @model containment="true"
	 * @generated
	 */
	EList<YVertex> getSubvertex();

	/**
	 * Returns the value of the '<em><b>Tr Attach</b></em>' containment reference list.
	 * The list contents are of type {@link online.yamm.coreModelDiagram.yammDiagram.YTrAttachment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tr Attach</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tr Attach</em>' containment reference list.
	 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYStateMachine_TrAttach()
	 * @model containment="true"
	 * @generated
	 */
	EList<YTrAttachment> getTrAttach();

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link online.yamm.coreModelDiagram.yammDiagram.YOperation#getStateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' container reference.
	 * @see #setOperation(YOperation)
	 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYStateMachine_Operation()
	 * @see online.yamm.coreModelDiagram.yammDiagram.YOperation#getStateMachine
	 * @model opposite="stateMachine" required="true" transient="false"
	 * @generated
	 */
	YOperation getOperation();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelDiagram.yammDiagram.YStateMachine#getOperation <em>Operation</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' container reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(YOperation value);

	/**
	 * Returns the value of the '<em><b>Des Initializer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Des Initializer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Des Initializer</em>' attribute.
	 * @see #setDesInitializer(boolean)
	 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getYStateMachine_DesInitializer()
	 * @model
	 * @generated
	 */
	boolean isDesInitializer();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelDiagram.yammDiagram.YStateMachine#isDesInitializer <em>Des Initializer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Des Initializer</em>' attribute.
	 * @see #isDesInitializer()
	 * @generated
	 */
	void setDesInitializer(boolean value);

} // YStateMachine
