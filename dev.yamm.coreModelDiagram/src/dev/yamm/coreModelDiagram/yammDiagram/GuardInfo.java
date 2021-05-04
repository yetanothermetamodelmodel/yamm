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
package dev.yamm.coreModelDiagram.yammDiagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guard Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.GuardInfo#getFirstLineGuard <em>First Line Guard</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.GuardInfo#getLastLineGuard <em>Last Line Guard</em>}</li>
 *   <li>{@link dev.yamm.coreModelDiagram.yammDiagram.GuardInfo#isIgnoreNotification <em>Ignore Notification</em>}</li>
 * </ul>
 *
 * @see dev.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getGuardInfo()
 * @model
 * @generated
 */
public interface GuardInfo extends FeatureInfo
{
	/**
	 * Returns the value of the '<em><b>First Line Guard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Line Guard</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Line Guard</em>' reference.
	 * @see #setFirstLineGuard(Line)
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getGuardInfo_FirstLineGuard()
	 * @model
	 * @generated
	 */
	Line getFirstLineGuard();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelDiagram.yammDiagram.GuardInfo#getFirstLineGuard <em>First Line Guard</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Line Guard</em>' reference.
	 * @see #getFirstLineGuard()
	 * @generated
	 */
	void setFirstLineGuard(Line value);

	/**
	 * Returns the value of the '<em><b>Last Line Guard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Line Guard</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Line Guard</em>' reference.
	 * @see #setLastLineGuard(Line)
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getGuardInfo_LastLineGuard()
	 * @model
	 * @generated
	 */
	Line getLastLineGuard();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelDiagram.yammDiagram.GuardInfo#getLastLineGuard <em>Last Line Guard</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Line Guard</em>' reference.
	 * @see #getLastLineGuard()
	 * @generated
	 */
	void setLastLineGuard(Line value);

	/**
	 * Returns the value of the '<em><b>Ignore Notification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ignore Notification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ignore Notification</em>' attribute.
	 * @see #setIgnoreNotification(boolean)
	 * @see dev.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getGuardInfo_IgnoreNotification()
	 * @model
	 * @generated
	 */
	boolean isIgnoreNotification();

	/**
	 * Sets the value of the '{@link dev.yamm.coreModelDiagram.yammDiagram.GuardInfo#isIgnoreNotification <em>Ignore Notification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore Notification</em>' attribute.
	 * @see #isIgnoreNotification()
	 * @generated
	 */
	void setIgnoreNotification(boolean value);

} // GuardInfo
