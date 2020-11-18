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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YFinal State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YFinalState#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YFinalState#getPosObjectID <em>Pos Object ID</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YFinalState#getPosName <em>Pos Name</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YFinalState#getPosQualifiedName <em>Pos Qualified Name</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YFinalState#getInsertOutgoing <em>Insert Outgoing</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YFinalState#getInsertIncoming <em>Insert Incoming</em>}</li>
 * </ul>
 *
 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYFinalState()
 * @model
 * @generated
 */
public interface YFinalState extends YElement, YNamedElement, YVertex, YObject
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
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYFinalState_QualifiedName()
	 * @model
	 * @generated
	 */
	String getQualifiedName();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelXmi.yamm.YFinalState#getQualifiedName <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualified Name</em>' attribute.
	 * @see #getQualifiedName()
	 * @generated
	 */
	void setQualifiedName(String value);

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
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYFinalState_PosObjectID()
	 * @model
	 * @generated
	 */
	SingleLinePropertyInfo getPosObjectID();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelXmi.yamm.YFinalState#getPosObjectID <em>Pos Object ID</em>}' reference.
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
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYFinalState_PosName()
	 * @model
	 * @generated
	 */
	SingleLinePropertyInfo getPosName();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelXmi.yamm.YFinalState#getPosName <em>Pos Name</em>}' reference.
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
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYFinalState_PosQualifiedName()
	 * @model
	 * @generated
	 */
	SingleLinePropertyInfo getPosQualifiedName();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelXmi.yamm.YFinalState#getPosQualifiedName <em>Pos Qualified Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos Qualified Name</em>' reference.
	 * @see #getPosQualifiedName()
	 * @generated
	 */
	void setPosQualifiedName(SingleLinePropertyInfo value);

	/**
	 * Returns the value of the '<em><b>Insert Outgoing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insert Outgoing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insert Outgoing</em>' attribute.
	 * @see #setInsertOutgoing(int)
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYFinalState_InsertOutgoing()
	 * @model
	 * @generated
	 */
	int getInsertOutgoing();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelXmi.yamm.YFinalState#getInsertOutgoing <em>Insert Outgoing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insert Outgoing</em>' attribute.
	 * @see #getInsertOutgoing()
	 * @generated
	 */
	void setInsertOutgoing(int value);

	/**
	 * Returns the value of the '<em><b>Insert Incoming</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insert Incoming</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insert Incoming</em>' attribute.
	 * @see #setInsertIncoming(int)
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYFinalState_InsertIncoming()
	 * @model
	 * @generated
	 */
	int getInsertIncoming();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelXmi.yamm.YFinalState#getInsertIncoming <em>Insert Incoming</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insert Incoming</em>' attribute.
	 * @see #getInsertIncoming()
	 * @generated
	 */
	void setInsertIncoming(int value);

} // YFinalState
