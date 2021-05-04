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
package dev.yamm.util.tableModel.table;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dev.yamm.util.tableModel.table.TableModel#getTabs <em>Tabs</em>}</li>
 *   <li>{@link dev.yamm.util.tableModel.table.TableModel#getViewId <em>View Id</em>}</li>
 *   <li>{@link dev.yamm.util.tableModel.table.TableModel#getViewInternalId <em>View Internal Id</em>}</li>
 * </ul>
 *
 * @see dev.yamm.util.tableModel.table.TablePackage#getTableModel()
 * @model
 * @generated
 */
public interface TableModel extends EObject
{
	/**
	 * Returns the value of the '<em><b>Tabs</b></em>' containment reference list.
	 * The list contents are of type {@link dev.yamm.util.tableModel.table.Tab}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tabs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tabs</em>' containment reference list.
	 * @see dev.yamm.util.tableModel.table.TablePackage#getTableModel_Tabs()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Tab> getTabs();

	/**
	 * Returns the value of the '<em><b>View Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Id</em>' attribute.
	 * @see #setViewId(String)
	 * @see dev.yamm.util.tableModel.table.TablePackage#getTableModel_ViewId()
	 * @model
	 * @generated
	 */
	String getViewId();

	/**
	 * Sets the value of the '{@link dev.yamm.util.tableModel.table.TableModel#getViewId <em>View Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Id</em>' attribute.
	 * @see #getViewId()
	 * @generated
	 */
	void setViewId(String value);

	/**
	 * Returns the value of the '<em><b>View Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Internal Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Internal Id</em>' attribute.
	 * @see #setViewInternalId(String)
	 * @see dev.yamm.util.tableModel.table.TablePackage#getTableModel_ViewInternalId()
	 * @model
	 * @generated
	 */
	String getViewInternalId();

	/**
	 * Sets the value of the '{@link dev.yamm.util.tableModel.table.TableModel#getViewInternalId <em>View Internal Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Internal Id</em>' attribute.
	 * @see #getViewInternalId()
	 * @generated
	 */
	void setViewInternalId(String value);

} // TableModel
