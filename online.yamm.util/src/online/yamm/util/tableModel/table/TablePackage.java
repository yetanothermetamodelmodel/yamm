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
package online.yamm.util.tableModel.table;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see online.yamm.util.tableModel.table.TableFactory
 * @model kind="package"
 * @generated
 */
public interface TablePackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "table";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.yamm.online/util/Table";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "table";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TablePackage eINSTANCE = online.yamm.util.tableModel.table.impl.TablePackageImpl.init();

	/**
	 * The meta object id for the '{@link online.yamm.util.tableModel.table.impl.TableModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.util.tableModel.table.impl.TableModelImpl
	 * @see online.yamm.util.tableModel.table.impl.TablePackageImpl#getTableModel()
	 * @generated
	 */
	int TABLE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Tabs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_MODEL__TABS = 0;

	/**
	 * The feature id for the '<em><b>View Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_MODEL__VIEW_ID = 1;

	/**
	 * The feature id for the '<em><b>View Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_MODEL__VIEW_INTERNAL_ID = 2;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link online.yamm.util.tableModel.table.impl.TabImpl <em>Tab</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.util.tableModel.table.impl.TabImpl
	 * @see online.yamm.util.tableModel.table.impl.TablePackageImpl#getTab()
	 * @generated
	 */
	int TAB = 1;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB__COLUMNS = 0;

	/**
	 * The feature id for the '<em><b>Tab Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB__TAB_ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB__NAME = 2;

	/**
	 * The number of structural features of the '<em>Tab</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Tab</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link online.yamm.util.tableModel.table.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see online.yamm.util.tableModel.table.impl.ColumnImpl
	 * @see online.yamm.util.tableModel.table.impl.TablePackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 2;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__HEADER = 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__VALUES = 1;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link online.yamm.util.tableModel.table.TableModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see online.yamm.util.tableModel.table.TableModel
	 * @generated
	 */
	EClass getTableModel();

	/**
	 * Returns the meta object for the containment reference list '{@link online.yamm.util.tableModel.table.TableModel#getTabs <em>Tabs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tabs</em>'.
	 * @see online.yamm.util.tableModel.table.TableModel#getTabs()
	 * @see #getTableModel()
	 * @generated
	 */
	EReference getTableModel_Tabs();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.util.tableModel.table.TableModel#getViewId <em>View Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Id</em>'.
	 * @see online.yamm.util.tableModel.table.TableModel#getViewId()
	 * @see #getTableModel()
	 * @generated
	 */
	EAttribute getTableModel_ViewId();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.util.tableModel.table.TableModel#getViewInternalId <em>View Internal Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Internal Id</em>'.
	 * @see online.yamm.util.tableModel.table.TableModel#getViewInternalId()
	 * @see #getTableModel()
	 * @generated
	 */
	EAttribute getTableModel_ViewInternalId();

	/**
	 * Returns the meta object for class '{@link online.yamm.util.tableModel.table.Tab <em>Tab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tab</em>'.
	 * @see online.yamm.util.tableModel.table.Tab
	 * @generated
	 */
	EClass getTab();

	/**
	 * Returns the meta object for the containment reference list '{@link online.yamm.util.tableModel.table.Tab#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see online.yamm.util.tableModel.table.Tab#getColumns()
	 * @see #getTab()
	 * @generated
	 */
	EReference getTab_Columns();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.util.tableModel.table.Tab#getTabId <em>Tab Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tab Id</em>'.
	 * @see online.yamm.util.tableModel.table.Tab#getTabId()
	 * @see #getTab()
	 * @generated
	 */
	EAttribute getTab_TabId();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.util.tableModel.table.Tab#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see online.yamm.util.tableModel.table.Tab#getName()
	 * @see #getTab()
	 * @generated
	 */
	EAttribute getTab_Name();

	/**
	 * Returns the meta object for class '{@link online.yamm.util.tableModel.table.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see online.yamm.util.tableModel.table.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the attribute '{@link online.yamm.util.tableModel.table.Column#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header</em>'.
	 * @see online.yamm.util.tableModel.table.Column#getHeader()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Header();

	/**
	 * Returns the meta object for the attribute list '{@link online.yamm.util.tableModel.table.Column#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see online.yamm.util.tableModel.table.Column#getValues()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Values();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TableFactory getTableFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link online.yamm.util.tableModel.table.impl.TableModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.util.tableModel.table.impl.TableModelImpl
		 * @see online.yamm.util.tableModel.table.impl.TablePackageImpl#getTableModel()
		 * @generated
		 */
		EClass TABLE_MODEL = eINSTANCE.getTableModel();

		/**
		 * The meta object literal for the '<em><b>Tabs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_MODEL__TABS = eINSTANCE.getTableModel_Tabs();

		/**
		 * The meta object literal for the '<em><b>View Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_MODEL__VIEW_ID = eINSTANCE.getTableModel_ViewId();

		/**
		 * The meta object literal for the '<em><b>View Internal Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_MODEL__VIEW_INTERNAL_ID = eINSTANCE.getTableModel_ViewInternalId();

		/**
		 * The meta object literal for the '{@link online.yamm.util.tableModel.table.impl.TabImpl <em>Tab</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.util.tableModel.table.impl.TabImpl
		 * @see online.yamm.util.tableModel.table.impl.TablePackageImpl#getTab()
		 * @generated
		 */
		EClass TAB = eINSTANCE.getTab();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAB__COLUMNS = eINSTANCE.getTab_Columns();

		/**
		 * The meta object literal for the '<em><b>Tab Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAB__TAB_ID = eINSTANCE.getTab_TabId();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAB__NAME = eINSTANCE.getTab_Name();

		/**
		 * The meta object literal for the '{@link online.yamm.util.tableModel.table.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see online.yamm.util.tableModel.table.impl.ColumnImpl
		 * @see online.yamm.util.tableModel.table.impl.TablePackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__HEADER = eINSTANCE.getColumn_Header();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__VALUES = eINSTANCE.getColumn_Values();

	}

} //TablePackage
