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

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YEffect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YEffect#getBody <em>Body</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YEffect#isBreakpoint <em>Breakpoint</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YEffect#getEffectStringRep <em>Effect String Rep</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YEffect#getPosObjectID <em>Pos Object ID</em>}</li>
 *   <li>{@link online.yamm.coreModelXmi.yamm.YEffect#getPosBreakpoint <em>Pos Breakpoint</em>}</li>
 * </ul>
 *
 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYEffect()
 * @model
 * @generated
 */
public interface YEffect extends YObject
{
	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(XExpression)
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYEffect_Body()
	 * @model containment="true"
	 * @generated
	 */
	XExpression getBody();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelXmi.yamm.YEffect#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(XExpression value);

	/**
	 * Returns the value of the '<em><b>Breakpoint</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Breakpoint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Breakpoint</em>' attribute.
	 * @see #setBreakpoint(boolean)
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYEffect_Breakpoint()
	 * @model default="false"
	 * @generated
	 */
	boolean isBreakpoint();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelXmi.yamm.YEffect#isBreakpoint <em>Breakpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Breakpoint</em>' attribute.
	 * @see #isBreakpoint()
	 * @generated
	 */
	void setBreakpoint(boolean value);

	/**
	 * Returns the value of the '<em><b>Effect String Rep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effect String Rep</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effect String Rep</em>' attribute.
	 * @see #setEffectStringRep(String)
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYEffect_EffectStringRep()
	 * @model
	 * @generated
	 */
	String getEffectStringRep();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelXmi.yamm.YEffect#getEffectStringRep <em>Effect String Rep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effect String Rep</em>' attribute.
	 * @see #getEffectStringRep()
	 * @generated
	 */
	void setEffectStringRep(String value);

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
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYEffect_PosObjectID()
	 * @model
	 * @generated
	 */
	SingleLinePropertyInfo getPosObjectID();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelXmi.yamm.YEffect#getPosObjectID <em>Pos Object ID</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos Object ID</em>' reference.
	 * @see #getPosObjectID()
	 * @generated
	 */
	void setPosObjectID(SingleLinePropertyInfo value);

	/**
	 * Returns the value of the '<em><b>Pos Breakpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos Breakpoint</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos Breakpoint</em>' reference.
	 * @see #setPosBreakpoint(SingleLinePropertyInfo)
	 * @see online.yamm.coreModelXmi.yamm.YammPackage#getYEffect_PosBreakpoint()
	 * @model
	 * @generated
	 */
	SingleLinePropertyInfo getPosBreakpoint();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelXmi.yamm.YEffect#getPosBreakpoint <em>Pos Breakpoint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos Breakpoint</em>' reference.
	 * @see #getPosBreakpoint()
	 * @generated
	 */
	void setPosBreakpoint(SingleLinePropertyInfo value);

} // YEffect
