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

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dsl Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.DslInfo#getFeatures <em>Features</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.DslInfo#getFirstLine <em>First Line</em>}</li>
 *   <li>{@link online.yamm.coreModelDiagram.yammDiagram.DslInfo#getLastLine <em>Last Line</em>}</li>
 * </ul>
 *
 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getDslInfo()
 * @model
 * @generated
 */
public interface DslInfo extends EObject
{
	/**
	 * Returns the value of the '<em><b>Features</b></em>' map.
	 * The key is of type {@link org.eclipse.emf.ecore.EStructuralFeature},
	 * and the value is of type {@link online.yamm.coreModelDiagram.yammDiagram.FeatureInfo},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' map.
	 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getDslInfo_Features()
	 * @model mapType="online.yamm.coreModelDiagram.yammDiagram.EStructuralFeatureToFeatureInfoMap&lt;org.eclipse.emf.ecore.EStructuralFeature, online.yamm.coreModelDiagram.yammDiagram.FeatureInfo&gt;"
	 * @generated
	 */
	EMap<EStructuralFeature, FeatureInfo> getFeatures();

	/**
	 * Returns the value of the '<em><b>First Line</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Line</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Line</em>' reference.
	 * @see #setFirstLine(Line)
	 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getDslInfo_FirstLine()
	 * @model
	 * @generated
	 */
	Line getFirstLine();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelDiagram.yammDiagram.DslInfo#getFirstLine <em>First Line</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Line</em>' reference.
	 * @see #getFirstLine()
	 * @generated
	 */
	void setFirstLine(Line value);

	/**
	 * Returns the value of the '<em><b>Last Line</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Line</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Line</em>' reference.
	 * @see #setLastLine(Line)
	 * @see online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage#getDslInfo_LastLine()
	 * @model
	 * @generated
	 */
	Line getLastLine();

	/**
	 * Sets the value of the '{@link online.yamm.coreModelDiagram.yammDiagram.DslInfo#getLastLine <em>Last Line</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Line</em>' reference.
	 * @see #getLastLine()
	 * @generated
	 */
	void setLastLine(Line value);

} // DslInfo
