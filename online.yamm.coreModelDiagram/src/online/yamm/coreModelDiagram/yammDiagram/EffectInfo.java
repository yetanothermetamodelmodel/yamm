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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Effect Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.EffectInfo#getFirstLineEffect <em>First Line Effect</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.EffectInfo#getLastLineEffect <em>Last Line Effect</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.EffectInfo#isIgnoreNotification <em>Ignore Notification</em>}</li>
 * </ul>
 *
 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getEffectInfo()
 * @model
 * @generated
 */
public interface EffectInfo extends FeatureInfo
{
	/**
	 * Returns the value of the '<em><b>First Line Effect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Line Effect</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Line Effect</em>' reference.
	 * @see #setFirstLineEffect(Line)
	 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getEffectInfo_FirstLineEffect()
	 * @model
	 * @generated
	 */
	Line getFirstLineEffect();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelDiagram.yammDiagram.EffectInfo#getFirstLineEffect <em>First Line Effect</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Line Effect</em>' reference.
	 * @see #getFirstLineEffect()
	 * @generated
	 */
	void setFirstLineEffect(Line value);

	/**
	 * Returns the value of the '<em><b>Last Line Effect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Line Effect</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Line Effect</em>' reference.
	 * @see #setLastLineEffect(Line)
	 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getEffectInfo_LastLineEffect()
	 * @model
	 * @generated
	 */
	Line getLastLineEffect();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelDiagram.yammDiagram.EffectInfo#getLastLineEffect <em>Last Line Effect</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Line Effect</em>' reference.
	 * @see #getLastLineEffect()
	 * @generated
	 */
	void setLastLineEffect(Line value);

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
	 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getEffectInfo_IgnoreNotification()
	 * @model
	 * @generated
	 */
	boolean isIgnoreNotification();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelDiagram.yammDiagram.EffectInfo#isIgnoreNotification <em>Ignore Notification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore Notification</em>' attribute.
	 * @see #isIgnoreNotification()
	 * @generated
	 */
	void setIgnoreNotification(boolean value);

} // EffectInfo
