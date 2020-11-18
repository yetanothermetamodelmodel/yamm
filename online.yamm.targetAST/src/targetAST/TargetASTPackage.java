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
package targetAST;

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
 * @see targetAST.TargetASTFactory
 * @model kind="package"
 * @generated
 */
public interface TargetASTPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "targetAST";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://yamm.online/targetAST/TargetAST";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "targetAST";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TargetASTPackage eINSTANCE = targetAST.impl.TargetASTPackageImpl.init();

	/**
	 * The meta object id for the '{@link targetAST.impl.TargetASTRootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targetAST.impl.TargetASTRootImpl
	 * @see targetAST.impl.TargetASTPackageImpl#getTargetASTRoot()
	 * @generated
	 */
	int TARGET_AST_ROOT = 0;

	/**
	 * The meta object id for the '{@link targetAST.impl.T_ExpLevelAImpl <em>TExp Level A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targetAST.impl.T_ExpLevelAImpl
	 * @see targetAST.impl.TargetASTPackageImpl#getT_ExpLevelA()
	 * @generated
	 */
	int TEXP_LEVEL_A = 7;

	/**
	 * The feature id for the '<em><b>Cast To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXP_LEVEL_A__CAST_TO = 0;

	/**
	 * The feature id for the '<em><b>Cast To Primitive Method Call</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXP_LEVEL_A__CAST_TO_PRIMITIVE_METHOD_CALL = 1;

	/**
	 * The feature id for the '<em><b>Cast To Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXP_LEVEL_A__CAST_TO_PRIMITIVE = 2;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXP_LEVEL_A__OBJECT = 3;

	/**
	 * The feature id for the '<em><b>Primitive To Wrapper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXP_LEVEL_A__PRIMITIVE_TO_WRAPPER = 4;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXP_LEVEL_A__CODE = 5;

	/**
	 * The number of structural features of the '<em>TExp Level A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXP_LEVEL_A_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>TExp Level A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXP_LEVEL_A_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Cast To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_AST_ROOT__CAST_TO = TEXP_LEVEL_A__CAST_TO;

	/**
	 * The feature id for the '<em><b>Cast To Primitive Method Call</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_AST_ROOT__CAST_TO_PRIMITIVE_METHOD_CALL = TEXP_LEVEL_A__CAST_TO_PRIMITIVE_METHOD_CALL;

	/**
	 * The feature id for the '<em><b>Cast To Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_AST_ROOT__CAST_TO_PRIMITIVE = TEXP_LEVEL_A__CAST_TO_PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_AST_ROOT__OBJECT = TEXP_LEVEL_A__OBJECT;

	/**
	 * The feature id for the '<em><b>Primitive To Wrapper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_AST_ROOT__PRIMITIVE_TO_WRAPPER = TEXP_LEVEL_A__PRIMITIVE_TO_WRAPPER;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_AST_ROOT__CODE = TEXP_LEVEL_A__CODE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_AST_ROOT__EXPRESSION = TEXP_LEVEL_A_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_AST_ROOT_FEATURE_COUNT = TEXP_LEVEL_A_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_AST_ROOT_OPERATION_COUNT = TEXP_LEVEL_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targetAST.impl.T_BinaryExpImpl <em>TBinary Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targetAST.impl.T_BinaryExpImpl
	 * @see targetAST.impl.TargetASTPackageImpl#getT_BinaryExp()
	 * @generated
	 */
	int TBINARY_EXP = 1;

	/**
	 * The feature id for the '<em><b>Cast To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBINARY_EXP__CAST_TO = TEXP_LEVEL_A__CAST_TO;

	/**
	 * The feature id for the '<em><b>Cast To Primitive Method Call</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBINARY_EXP__CAST_TO_PRIMITIVE_METHOD_CALL = TEXP_LEVEL_A__CAST_TO_PRIMITIVE_METHOD_CALL;

	/**
	 * The feature id for the '<em><b>Cast To Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBINARY_EXP__CAST_TO_PRIMITIVE = TEXP_LEVEL_A__CAST_TO_PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBINARY_EXP__OBJECT = TEXP_LEVEL_A__OBJECT;

	/**
	 * The feature id for the '<em><b>Primitive To Wrapper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBINARY_EXP__PRIMITIVE_TO_WRAPPER = TEXP_LEVEL_A__PRIMITIVE_TO_WRAPPER;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBINARY_EXP__CODE = TEXP_LEVEL_A__CODE;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBINARY_EXP__LEFT_OPERAND = TEXP_LEVEL_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBINARY_EXP__RIGHT_OPERAND = TEXP_LEVEL_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBINARY_EXP__OPERATOR = TEXP_LEVEL_A_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TBinary Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBINARY_EXP_FEATURE_COUNT = TEXP_LEVEL_A_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>TBinary Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBINARY_EXP_OPERATION_COUNT = TEXP_LEVEL_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targetAST.impl.T_ExpLevelBImpl <em>TExp Level B</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targetAST.impl.T_ExpLevelBImpl
	 * @see targetAST.impl.TargetASTPackageImpl#getT_ExpLevelB()
	 * @generated
	 */
	int TEXP_LEVEL_B = 5;

	/**
	 * The feature id for the '<em><b>Cast To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXP_LEVEL_B__CAST_TO = TEXP_LEVEL_A__CAST_TO;

	/**
	 * The feature id for the '<em><b>Cast To Primitive Method Call</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXP_LEVEL_B__CAST_TO_PRIMITIVE_METHOD_CALL = TEXP_LEVEL_A__CAST_TO_PRIMITIVE_METHOD_CALL;

	/**
	 * The feature id for the '<em><b>Cast To Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXP_LEVEL_B__CAST_TO_PRIMITIVE = TEXP_LEVEL_A__CAST_TO_PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXP_LEVEL_B__OBJECT = TEXP_LEVEL_A__OBJECT;

	/**
	 * The feature id for the '<em><b>Primitive To Wrapper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXP_LEVEL_B__PRIMITIVE_TO_WRAPPER = TEXP_LEVEL_A__PRIMITIVE_TO_WRAPPER;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXP_LEVEL_B__CODE = TEXP_LEVEL_A__CODE;

	/**
	 * The feature id for the '<em><b>Type Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXP_LEVEL_B__TYPE_OBJECT = TEXP_LEVEL_A_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TExp Level B</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXP_LEVEL_B_FEATURE_COUNT = TEXP_LEVEL_A_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TExp Level B</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXP_LEVEL_B_OPERATION_COUNT = TEXP_LEVEL_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targetAST.impl.T_GetImpl <em>TGet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targetAST.impl.T_GetImpl
	 * @see targetAST.impl.TargetASTPackageImpl#getT_Get()
	 * @generated
	 */
	int TGET = 2;

	/**
	 * The feature id for the '<em><b>Cast To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGET__CAST_TO = TEXP_LEVEL_B__CAST_TO;

	/**
	 * The feature id for the '<em><b>Cast To Primitive Method Call</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGET__CAST_TO_PRIMITIVE_METHOD_CALL = TEXP_LEVEL_B__CAST_TO_PRIMITIVE_METHOD_CALL;

	/**
	 * The feature id for the '<em><b>Cast To Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGET__CAST_TO_PRIMITIVE = TEXP_LEVEL_B__CAST_TO_PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGET__OBJECT = TEXP_LEVEL_B__OBJECT;

	/**
	 * The feature id for the '<em><b>Primitive To Wrapper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGET__PRIMITIVE_TO_WRAPPER = TEXP_LEVEL_B__PRIMITIVE_TO_WRAPPER;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGET__CODE = TEXP_LEVEL_B__CODE;

	/**
	 * The feature id for the '<em><b>Type Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGET__TYPE_OBJECT = TEXP_LEVEL_B__TYPE_OBJECT;

	/**
	 * The feature id for the '<em><b>Features</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGET__FEATURES = TEXP_LEVEL_B_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Object Is Param</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGET__OBJECT_IS_PARAM = TEXP_LEVEL_B_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Postfix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGET__POSTFIX = TEXP_LEVEL_B_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TGet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGET_FEATURE_COUNT = TEXP_LEVEL_B_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>TGet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGET_OPERATION_COUNT = TEXP_LEVEL_B_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targetAST.impl.T_SetImpl <em>TSet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targetAST.impl.T_SetImpl
	 * @see targetAST.impl.TargetASTPackageImpl#getT_Set()
	 * @generated
	 */
	int TSET = 3;

	/**
	 * The feature id for the '<em><b>Cast To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSET__CAST_TO = TEXP_LEVEL_B__CAST_TO;

	/**
	 * The feature id for the '<em><b>Cast To Primitive Method Call</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSET__CAST_TO_PRIMITIVE_METHOD_CALL = TEXP_LEVEL_B__CAST_TO_PRIMITIVE_METHOD_CALL;

	/**
	 * The feature id for the '<em><b>Cast To Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSET__CAST_TO_PRIMITIVE = TEXP_LEVEL_B__CAST_TO_PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSET__OBJECT = TEXP_LEVEL_B__OBJECT;

	/**
	 * The feature id for the '<em><b>Primitive To Wrapper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSET__PRIMITIVE_TO_WRAPPER = TEXP_LEVEL_B__PRIMITIVE_TO_WRAPPER;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSET__CODE = TEXP_LEVEL_B__CODE;

	/**
	 * The feature id for the '<em><b>Type Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSET__TYPE_OBJECT = TEXP_LEVEL_B__TYPE_OBJECT;

	/**
	 * The feature id for the '<em><b>Features</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSET__FEATURES = TEXP_LEVEL_B_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Object Is Param</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSET__OBJECT_IS_PARAM = TEXP_LEVEL_B_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSET__VALUE = TEXP_LEVEL_B_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TSet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSET_FEATURE_COUNT = TEXP_LEVEL_B_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>TSet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSET_OPERATION_COUNT = TEXP_LEVEL_B_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targetAST.impl.T_ExtCallImpl <em>TExt Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targetAST.impl.T_ExtCallImpl
	 * @see targetAST.impl.TargetASTPackageImpl#getT_ExtCall()
	 * @generated
	 */
	int TEXT_CALL = 4;

	/**
	 * The feature id for the '<em><b>Cast To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CALL__CAST_TO = TEXP_LEVEL_B__CAST_TO;

	/**
	 * The feature id for the '<em><b>Cast To Primitive Method Call</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CALL__CAST_TO_PRIMITIVE_METHOD_CALL = TEXP_LEVEL_B__CAST_TO_PRIMITIVE_METHOD_CALL;

	/**
	 * The feature id for the '<em><b>Cast To Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CALL__CAST_TO_PRIMITIVE = TEXP_LEVEL_B__CAST_TO_PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CALL__OBJECT = TEXP_LEVEL_B__OBJECT;

	/**
	 * The feature id for the '<em><b>Primitive To Wrapper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CALL__PRIMITIVE_TO_WRAPPER = TEXP_LEVEL_B__PRIMITIVE_TO_WRAPPER;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CALL__CODE = TEXP_LEVEL_B__CODE;

	/**
	 * The feature id for the '<em><b>Type Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CALL__TYPE_OBJECT = TEXP_LEVEL_B__TYPE_OBJECT;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CALL__ARGUMENTS = TEXP_LEVEL_B_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CALL__METHOD_NAME = TEXP_LEVEL_B_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>String Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CALL__STRING_LITERAL = TEXP_LEVEL_B_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CALL__TYPE_ARGUMENTS = TEXP_LEVEL_B_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>TExt Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CALL_FEATURE_COUNT = TEXP_LEVEL_B_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>TExt Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CALL_OPERATION_COUNT = TEXP_LEVEL_B_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targetAST.impl.T_LiteralImpl <em>TLiteral</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targetAST.impl.T_LiteralImpl
	 * @see targetAST.impl.TargetASTPackageImpl#getT_Literal()
	 * @generated
	 */
	int TLITERAL = 6;

	/**
	 * The feature id for the '<em><b>Cast To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLITERAL__CAST_TO = TEXP_LEVEL_A__CAST_TO;

	/**
	 * The feature id for the '<em><b>Cast To Primitive Method Call</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLITERAL__CAST_TO_PRIMITIVE_METHOD_CALL = TEXP_LEVEL_A__CAST_TO_PRIMITIVE_METHOD_CALL;

	/**
	 * The feature id for the '<em><b>Cast To Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLITERAL__CAST_TO_PRIMITIVE = TEXP_LEVEL_A__CAST_TO_PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLITERAL__OBJECT = TEXP_LEVEL_A__OBJECT;

	/**
	 * The feature id for the '<em><b>Primitive To Wrapper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLITERAL__PRIMITIVE_TO_WRAPPER = TEXP_LEVEL_A__PRIMITIVE_TO_WRAPPER;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLITERAL__CODE = TEXP_LEVEL_A__CODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLITERAL__VALUE = TEXP_LEVEL_A_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TLiteral</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLITERAL_FEATURE_COUNT = TEXP_LEVEL_A_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TLiteral</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLITERAL_OPERATION_COUNT = TEXP_LEVEL_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targetAST.impl.T_InstanceOfExpImpl <em>TInstance Of Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targetAST.impl.T_InstanceOfExpImpl
	 * @see targetAST.impl.TargetASTPackageImpl#getT_InstanceOfExp()
	 * @generated
	 */
	int TINSTANCE_OF_EXP = 8;

	/**
	 * The feature id for the '<em><b>Cast To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINSTANCE_OF_EXP__CAST_TO = TEXP_LEVEL_A__CAST_TO;

	/**
	 * The feature id for the '<em><b>Cast To Primitive Method Call</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINSTANCE_OF_EXP__CAST_TO_PRIMITIVE_METHOD_CALL = TEXP_LEVEL_A__CAST_TO_PRIMITIVE_METHOD_CALL;

	/**
	 * The feature id for the '<em><b>Cast To Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINSTANCE_OF_EXP__CAST_TO_PRIMITIVE = TEXP_LEVEL_A__CAST_TO_PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINSTANCE_OF_EXP__OBJECT = TEXP_LEVEL_A__OBJECT;

	/**
	 * The feature id for the '<em><b>Primitive To Wrapper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINSTANCE_OF_EXP__PRIMITIVE_TO_WRAPPER = TEXP_LEVEL_A__PRIMITIVE_TO_WRAPPER;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINSTANCE_OF_EXP__CODE = TEXP_LEVEL_A__CODE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINSTANCE_OF_EXP__EXPRESSION = TEXP_LEVEL_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Is External</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINSTANCE_OF_EXP__TYPE_IS_EXTERNAL = TEXP_LEVEL_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINSTANCE_OF_EXP__TYPE = TEXP_LEVEL_A_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TInstance Of Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINSTANCE_OF_EXP_FEATURE_COUNT = TEXP_LEVEL_A_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>TInstance Of Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINSTANCE_OF_EXP_OPERATION_COUNT = TEXP_LEVEL_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targetAST.impl.T_UnaryExpImpl <em>TUnary Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targetAST.impl.T_UnaryExpImpl
	 * @see targetAST.impl.TargetASTPackageImpl#getT_UnaryExp()
	 * @generated
	 */
	int TUNARY_EXP = 9;

	/**
	 * The feature id for the '<em><b>Cast To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNARY_EXP__CAST_TO = TEXP_LEVEL_B__CAST_TO;

	/**
	 * The feature id for the '<em><b>Cast To Primitive Method Call</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNARY_EXP__CAST_TO_PRIMITIVE_METHOD_CALL = TEXP_LEVEL_B__CAST_TO_PRIMITIVE_METHOD_CALL;

	/**
	 * The feature id for the '<em><b>Cast To Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNARY_EXP__CAST_TO_PRIMITIVE = TEXP_LEVEL_B__CAST_TO_PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNARY_EXP__OBJECT = TEXP_LEVEL_B__OBJECT;

	/**
	 * The feature id for the '<em><b>Primitive To Wrapper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNARY_EXP__PRIMITIVE_TO_WRAPPER = TEXP_LEVEL_B__PRIMITIVE_TO_WRAPPER;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNARY_EXP__CODE = TEXP_LEVEL_B__CODE;

	/**
	 * The feature id for the '<em><b>Type Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNARY_EXP__TYPE_OBJECT = TEXP_LEVEL_B__TYPE_OBJECT;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNARY_EXP__OPERATOR = TEXP_LEVEL_B_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TUnary Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNARY_EXP_FEATURE_COUNT = TEXP_LEVEL_B_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TUnary Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNARY_EXP_OPERATION_COUNT = TEXP_LEVEL_B_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targetAST.impl.T_CreateInstanceExpImpl <em>TCreate Instance Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targetAST.impl.T_CreateInstanceExpImpl
	 * @see targetAST.impl.TargetASTPackageImpl#getT_CreateInstanceExp()
	 * @generated
	 */
	int TCREATE_INSTANCE_EXP = 10;

	/**
	 * The feature id for the '<em><b>Cast To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCREATE_INSTANCE_EXP__CAST_TO = TEXP_LEVEL_A__CAST_TO;

	/**
	 * The feature id for the '<em><b>Cast To Primitive Method Call</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCREATE_INSTANCE_EXP__CAST_TO_PRIMITIVE_METHOD_CALL = TEXP_LEVEL_A__CAST_TO_PRIMITIVE_METHOD_CALL;

	/**
	 * The feature id for the '<em><b>Cast To Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCREATE_INSTANCE_EXP__CAST_TO_PRIMITIVE = TEXP_LEVEL_A__CAST_TO_PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCREATE_INSTANCE_EXP__OBJECT = TEXP_LEVEL_A__OBJECT;

	/**
	 * The feature id for the '<em><b>Primitive To Wrapper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCREATE_INSTANCE_EXP__PRIMITIVE_TO_WRAPPER = TEXP_LEVEL_A__PRIMITIVE_TO_WRAPPER;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCREATE_INSTANCE_EXP__CODE = TEXP_LEVEL_A__CODE;

	/**
	 * The feature id for the '<em><b>Type Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCREATE_INSTANCE_EXP__TYPE_QUALIFIED_NAME = TEXP_LEVEL_A_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TCreate Instance Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCREATE_INSTANCE_EXP_FEATURE_COUNT = TEXP_LEVEL_A_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TCreate Instance Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCREATE_INSTANCE_EXP_OPERATION_COUNT = TEXP_LEVEL_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targetAST.impl.T_PrintExpImpl <em>TPrint Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targetAST.impl.T_PrintExpImpl
	 * @see targetAST.impl.TargetASTPackageImpl#getT_PrintExp()
	 * @generated
	 */
	int TPRINT_EXP = 11;

	/**
	 * The feature id for the '<em><b>Cast To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPRINT_EXP__CAST_TO = TEXP_LEVEL_A__CAST_TO;

	/**
	 * The feature id for the '<em><b>Cast To Primitive Method Call</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPRINT_EXP__CAST_TO_PRIMITIVE_METHOD_CALL = TEXP_LEVEL_A__CAST_TO_PRIMITIVE_METHOD_CALL;

	/**
	 * The feature id for the '<em><b>Cast To Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPRINT_EXP__CAST_TO_PRIMITIVE = TEXP_LEVEL_A__CAST_TO_PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPRINT_EXP__OBJECT = TEXP_LEVEL_A__OBJECT;

	/**
	 * The feature id for the '<em><b>Primitive To Wrapper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPRINT_EXP__PRIMITIVE_TO_WRAPPER = TEXP_LEVEL_A__PRIMITIVE_TO_WRAPPER;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPRINT_EXP__CODE = TEXP_LEVEL_A__CODE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPRINT_EXP__EXPRESSION = TEXP_LEVEL_A_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TPrint Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPRINT_EXP_FEATURE_COUNT = TEXP_LEVEL_A_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TPrint Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPRINT_EXP_OPERATION_COUNT = TEXP_LEVEL_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targetAST.impl.T_GetInstancesOfExpImpl <em>TGet Instances Of Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targetAST.impl.T_GetInstancesOfExpImpl
	 * @see targetAST.impl.TargetASTPackageImpl#getT_GetInstancesOfExp()
	 * @generated
	 */
	int TGET_INSTANCES_OF_EXP = 12;

	/**
	 * The feature id for the '<em><b>Cast To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGET_INSTANCES_OF_EXP__CAST_TO = TEXP_LEVEL_A__CAST_TO;

	/**
	 * The feature id for the '<em><b>Cast To Primitive Method Call</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGET_INSTANCES_OF_EXP__CAST_TO_PRIMITIVE_METHOD_CALL = TEXP_LEVEL_A__CAST_TO_PRIMITIVE_METHOD_CALL;

	/**
	 * The feature id for the '<em><b>Cast To Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGET_INSTANCES_OF_EXP__CAST_TO_PRIMITIVE = TEXP_LEVEL_A__CAST_TO_PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGET_INSTANCES_OF_EXP__OBJECT = TEXP_LEVEL_A__OBJECT;

	/**
	 * The feature id for the '<em><b>Primitive To Wrapper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGET_INSTANCES_OF_EXP__PRIMITIVE_TO_WRAPPER = TEXP_LEVEL_A__PRIMITIVE_TO_WRAPPER;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGET_INSTANCES_OF_EXP__CODE = TEXP_LEVEL_A__CODE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGET_INSTANCES_OF_EXP__EXPRESSION = TEXP_LEVEL_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGET_INSTANCES_OF_EXP__CLASS_NAME = TEXP_LEVEL_A_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TGet Instances Of Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGET_INSTANCES_OF_EXP_FEATURE_COUNT = TEXP_LEVEL_A_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TGet Instances Of Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGET_INSTANCES_OF_EXP_OPERATION_COUNT = TEXP_LEVEL_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targetAST.impl.T_SetReturnImpl <em>TSet Return</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targetAST.impl.T_SetReturnImpl
	 * @see targetAST.impl.TargetASTPackageImpl#getT_SetReturn()
	 * @generated
	 */
	int TSET_RETURN = 13;

	/**
	 * The feature id for the '<em><b>Cast To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSET_RETURN__CAST_TO = TEXP_LEVEL_A__CAST_TO;

	/**
	 * The feature id for the '<em><b>Cast To Primitive Method Call</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSET_RETURN__CAST_TO_PRIMITIVE_METHOD_CALL = TEXP_LEVEL_A__CAST_TO_PRIMITIVE_METHOD_CALL;

	/**
	 * The feature id for the '<em><b>Cast To Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSET_RETURN__CAST_TO_PRIMITIVE = TEXP_LEVEL_A__CAST_TO_PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSET_RETURN__OBJECT = TEXP_LEVEL_A__OBJECT;

	/**
	 * The feature id for the '<em><b>Primitive To Wrapper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSET_RETURN__PRIMITIVE_TO_WRAPPER = TEXP_LEVEL_A__PRIMITIVE_TO_WRAPPER;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSET_RETURN__CODE = TEXP_LEVEL_A__CODE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSET_RETURN__EXPRESSION = TEXP_LEVEL_A_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TSet Return</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSET_RETURN_FEATURE_COUNT = TEXP_LEVEL_A_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TSet Return</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSET_RETURN_OPERATION_COUNT = TEXP_LEVEL_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targetAST.impl.T_ExtConstructorImpl <em>TExt Constructor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targetAST.impl.T_ExtConstructorImpl
	 * @see targetAST.impl.TargetASTPackageImpl#getT_ExtConstructor()
	 * @generated
	 */
	int TEXT_CONSTRUCTOR = 14;

	/**
	 * The feature id for the '<em><b>Cast To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONSTRUCTOR__CAST_TO = TEXP_LEVEL_A__CAST_TO;

	/**
	 * The feature id for the '<em><b>Cast To Primitive Method Call</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONSTRUCTOR__CAST_TO_PRIMITIVE_METHOD_CALL = TEXP_LEVEL_A__CAST_TO_PRIMITIVE_METHOD_CALL;

	/**
	 * The feature id for the '<em><b>Cast To Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONSTRUCTOR__CAST_TO_PRIMITIVE = TEXP_LEVEL_A__CAST_TO_PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONSTRUCTOR__OBJECT = TEXP_LEVEL_A__OBJECT;

	/**
	 * The feature id for the '<em><b>Primitive To Wrapper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONSTRUCTOR__PRIMITIVE_TO_WRAPPER = TEXP_LEVEL_A__PRIMITIVE_TO_WRAPPER;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONSTRUCTOR__CODE = TEXP_LEVEL_A__CODE;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONSTRUCTOR__ARGUMENTS = TEXP_LEVEL_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONSTRUCTOR__TYPE_QUALIFIED_NAME = TEXP_LEVEL_A_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TExt Constructor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONSTRUCTOR_FEATURE_COUNT = TEXP_LEVEL_A_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TExt Constructor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONSTRUCTOR_OPERATION_COUNT = TEXP_LEVEL_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targetAST.impl.T_ExtTypeImpl <em>TExt Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targetAST.impl.T_ExtTypeImpl
	 * @see targetAST.impl.TargetASTPackageImpl#getT_ExtType()
	 * @generated
	 */
	int TEXT_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Cast To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__CAST_TO = TEXP_LEVEL_B__CAST_TO;

	/**
	 * The feature id for the '<em><b>Cast To Primitive Method Call</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__CAST_TO_PRIMITIVE_METHOD_CALL = TEXP_LEVEL_B__CAST_TO_PRIMITIVE_METHOD_CALL;

	/**
	 * The feature id for the '<em><b>Cast To Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__CAST_TO_PRIMITIVE = TEXP_LEVEL_B__CAST_TO_PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__OBJECT = TEXP_LEVEL_B__OBJECT;

	/**
	 * The feature id for the '<em><b>Primitive To Wrapper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__PRIMITIVE_TO_WRAPPER = TEXP_LEVEL_B__PRIMITIVE_TO_WRAPPER;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__CODE = TEXP_LEVEL_B__CODE;

	/**
	 * The feature id for the '<em><b>Type Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__TYPE_OBJECT = TEXP_LEVEL_B__TYPE_OBJECT;

	/**
	 * The feature id for the '<em><b>New Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__NEW_ATTRIBUTE = TEXP_LEVEL_B_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TExt Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE_FEATURE_COUNT = TEXP_LEVEL_B_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TExt Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE_OPERATION_COUNT = TEXP_LEVEL_B_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targetAST.impl.T_ExtAttrCallImpl <em>TExt Attr Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targetAST.impl.T_ExtAttrCallImpl
	 * @see targetAST.impl.TargetASTPackageImpl#getT_ExtAttrCall()
	 * @generated
	 */
	int TEXT_ATTR_CALL = 16;

	/**
	 * The feature id for the '<em><b>Cast To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ATTR_CALL__CAST_TO = TEXP_LEVEL_A__CAST_TO;

	/**
	 * The feature id for the '<em><b>Cast To Primitive Method Call</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ATTR_CALL__CAST_TO_PRIMITIVE_METHOD_CALL = TEXP_LEVEL_A__CAST_TO_PRIMITIVE_METHOD_CALL;

	/**
	 * The feature id for the '<em><b>Cast To Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ATTR_CALL__CAST_TO_PRIMITIVE = TEXP_LEVEL_A__CAST_TO_PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ATTR_CALL__OBJECT = TEXP_LEVEL_A__OBJECT;

	/**
	 * The feature id for the '<em><b>Primitive To Wrapper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ATTR_CALL__PRIMITIVE_TO_WRAPPER = TEXP_LEVEL_A__PRIMITIVE_TO_WRAPPER;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ATTR_CALL__CODE = TEXP_LEVEL_A__CODE;

	/**
	 * The feature id for the '<em><b>Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ATTR_CALL__ATTRIBUTE_NAME = TEXP_LEVEL_A_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TExt Attr Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ATTR_CALL_FEATURE_COUNT = TEXP_LEVEL_A_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TExt Attr Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ATTR_CALL_OPERATION_COUNT = TEXP_LEVEL_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targetAST.impl.T_OpCallImpl <em>TOp Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targetAST.impl.T_OpCallImpl
	 * @see targetAST.impl.TargetASTPackageImpl#getT_OpCall()
	 * @generated
	 */
	int TOP_CALL = 17;

	/**
	 * The feature id for the '<em><b>Cast To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_CALL__CAST_TO = TEXP_LEVEL_A__CAST_TO;

	/**
	 * The feature id for the '<em><b>Cast To Primitive Method Call</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_CALL__CAST_TO_PRIMITIVE_METHOD_CALL = TEXP_LEVEL_A__CAST_TO_PRIMITIVE_METHOD_CALL;

	/**
	 * The feature id for the '<em><b>Cast To Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_CALL__CAST_TO_PRIMITIVE = TEXP_LEVEL_A__CAST_TO_PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_CALL__OBJECT = TEXP_LEVEL_A__OBJECT;

	/**
	 * The feature id for the '<em><b>Primitive To Wrapper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_CALL__PRIMITIVE_TO_WRAPPER = TEXP_LEVEL_A__PRIMITIVE_TO_WRAPPER;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_CALL__CODE = TEXP_LEVEL_A__CODE;

	/**
	 * The feature id for the '<em><b>Var Names For Return</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_CALL__VAR_NAMES_FOR_RETURN = TEXP_LEVEL_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_CALL__OPERATION_NAME = TEXP_LEVEL_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_CALL__ARGUMENTS = TEXP_LEVEL_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Has INOUT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_CALL__HAS_INOUT = TEXP_LEVEL_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Last Features Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_CALL__LAST_FEATURES_NAME = TEXP_LEVEL_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Postfix</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_CALL__POSTFIX = TEXP_LEVEL_A_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Is INOUT</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_CALL__IS_INOUT = TEXP_LEVEL_A_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Param</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_CALL__PARAM = TEXP_LEVEL_A_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Type For Multi Inheritance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_CALL__TYPE_FOR_MULTI_INHERITANCE = TEXP_LEVEL_A_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Qualified Name Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_CALL__QUALIFIED_NAME_OPERATION = TEXP_LEVEL_A_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>TOp Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_CALL_FEATURE_COUNT = TEXP_LEVEL_A_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>TOp Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_CALL_OPERATION_COUNT = TEXP_LEVEL_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targetAST.impl.T_ColorDFAImpl <em>TColor DFA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targetAST.impl.T_ColorDFAImpl
	 * @see targetAST.impl.TargetASTPackageImpl#getT_ColorDFA()
	 * @generated
	 */
	int TCOLOR_DFA = 18;

	/**
	 * The feature id for the '<em><b>Cast To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLOR_DFA__CAST_TO = TEXP_LEVEL_A__CAST_TO;

	/**
	 * The feature id for the '<em><b>Cast To Primitive Method Call</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLOR_DFA__CAST_TO_PRIMITIVE_METHOD_CALL = TEXP_LEVEL_A__CAST_TO_PRIMITIVE_METHOD_CALL;

	/**
	 * The feature id for the '<em><b>Cast To Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLOR_DFA__CAST_TO_PRIMITIVE = TEXP_LEVEL_A__CAST_TO_PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLOR_DFA__OBJECT = TEXP_LEVEL_A__OBJECT;

	/**
	 * The feature id for the '<em><b>Primitive To Wrapper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLOR_DFA__PRIMITIVE_TO_WRAPPER = TEXP_LEVEL_A__PRIMITIVE_TO_WRAPPER;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLOR_DFA__CODE = TEXP_LEVEL_A__CODE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLOR_DFA__ID = TEXP_LEVEL_A_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TColor DFA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLOR_DFA_FEATURE_COUNT = TEXP_LEVEL_A_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TColor DFA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLOR_DFA_OPERATION_COUNT = TEXP_LEVEL_A_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link targetAST.impl.T_GetInstancesImpl <em>TGet Instances</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targetAST.impl.T_GetInstancesImpl
	 * @see targetAST.impl.TargetASTPackageImpl#getT_GetInstances()
	 * @generated
	 */
	int TGET_INSTANCES = 19;

	/**
	 * The feature id for the '<em><b>Cast To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGET_INSTANCES__CAST_TO = TEXP_LEVEL_A__CAST_TO;

	/**
	 * The feature id for the '<em><b>Cast To Primitive Method Call</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGET_INSTANCES__CAST_TO_PRIMITIVE_METHOD_CALL = TEXP_LEVEL_A__CAST_TO_PRIMITIVE_METHOD_CALL;

	/**
	 * The feature id for the '<em><b>Cast To Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGET_INSTANCES__CAST_TO_PRIMITIVE = TEXP_LEVEL_A__CAST_TO_PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGET_INSTANCES__OBJECT = TEXP_LEVEL_A__OBJECT;

	/**
	 * The feature id for the '<em><b>Primitive To Wrapper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGET_INSTANCES__PRIMITIVE_TO_WRAPPER = TEXP_LEVEL_A__PRIMITIVE_TO_WRAPPER;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGET_INSTANCES__CODE = TEXP_LEVEL_A__CODE;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGET_INSTANCES__PARAMETER = TEXP_LEVEL_A_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TGet Instances</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGET_INSTANCES_FEATURE_COUNT = TEXP_LEVEL_A_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TGet Instances</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGET_INSTANCES_OPERATION_COUNT = TEXP_LEVEL_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targetAST.impl.T_CountFinalStatesImpl <em>TCount Final States</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targetAST.impl.T_CountFinalStatesImpl
	 * @see targetAST.impl.TargetASTPackageImpl#getT_CountFinalStates()
	 * @generated
	 */
	int TCOUNT_FINAL_STATES = 20;

	/**
	 * The feature id for the '<em><b>Cast To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNT_FINAL_STATES__CAST_TO = TEXP_LEVEL_A__CAST_TO;

	/**
	 * The feature id for the '<em><b>Cast To Primitive Method Call</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNT_FINAL_STATES__CAST_TO_PRIMITIVE_METHOD_CALL = TEXP_LEVEL_A__CAST_TO_PRIMITIVE_METHOD_CALL;

	/**
	 * The feature id for the '<em><b>Cast To Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNT_FINAL_STATES__CAST_TO_PRIMITIVE = TEXP_LEVEL_A__CAST_TO_PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNT_FINAL_STATES__OBJECT = TEXP_LEVEL_A__OBJECT;

	/**
	 * The feature id for the '<em><b>Primitive To Wrapper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNT_FINAL_STATES__PRIMITIVE_TO_WRAPPER = TEXP_LEVEL_A__PRIMITIVE_TO_WRAPPER;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNT_FINAL_STATES__CODE = TEXP_LEVEL_A__CODE;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNT_FINAL_STATES__PARAMETER = TEXP_LEVEL_A_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TCount Final States</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNT_FINAL_STATES_FEATURE_COUNT = TEXP_LEVEL_A_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TCount Final States</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNT_FINAL_STATES_OPERATION_COUNT = TEXP_LEVEL_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targetAST.impl.T_CountInitialStatesImpl <em>TCount Initial States</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targetAST.impl.T_CountInitialStatesImpl
	 * @see targetAST.impl.TargetASTPackageImpl#getT_CountInitialStates()
	 * @generated
	 */
	int TCOUNT_INITIAL_STATES = 21;

	/**
	 * The feature id for the '<em><b>Cast To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNT_INITIAL_STATES__CAST_TO = TEXP_LEVEL_A__CAST_TO;

	/**
	 * The feature id for the '<em><b>Cast To Primitive Method Call</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNT_INITIAL_STATES__CAST_TO_PRIMITIVE_METHOD_CALL = TEXP_LEVEL_A__CAST_TO_PRIMITIVE_METHOD_CALL;

	/**
	 * The feature id for the '<em><b>Cast To Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNT_INITIAL_STATES__CAST_TO_PRIMITIVE = TEXP_LEVEL_A__CAST_TO_PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNT_INITIAL_STATES__OBJECT = TEXP_LEVEL_A__OBJECT;

	/**
	 * The feature id for the '<em><b>Primitive To Wrapper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNT_INITIAL_STATES__PRIMITIVE_TO_WRAPPER = TEXP_LEVEL_A__PRIMITIVE_TO_WRAPPER;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNT_INITIAL_STATES__CODE = TEXP_LEVEL_A__CODE;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNT_INITIAL_STATES__PARAMETER = TEXP_LEVEL_A_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TCount Initial States</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNT_INITIAL_STATES_FEATURE_COUNT = TEXP_LEVEL_A_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TCount Initial States</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNT_INITIAL_STATES_OPERATION_COUNT = TEXP_LEVEL_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targetAST.impl.T_CountStatesImpl <em>TCount States</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targetAST.impl.T_CountStatesImpl
	 * @see targetAST.impl.TargetASTPackageImpl#getT_CountStates()
	 * @generated
	 */
	int TCOUNT_STATES = 22;

	/**
	 * The feature id for the '<em><b>Cast To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNT_STATES__CAST_TO = TEXP_LEVEL_A__CAST_TO;

	/**
	 * The feature id for the '<em><b>Cast To Primitive Method Call</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNT_STATES__CAST_TO_PRIMITIVE_METHOD_CALL = TEXP_LEVEL_A__CAST_TO_PRIMITIVE_METHOD_CALL;

	/**
	 * The feature id for the '<em><b>Cast To Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNT_STATES__CAST_TO_PRIMITIVE = TEXP_LEVEL_A__CAST_TO_PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNT_STATES__OBJECT = TEXP_LEVEL_A__OBJECT;

	/**
	 * The feature id for the '<em><b>Primitive To Wrapper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNT_STATES__PRIMITIVE_TO_WRAPPER = TEXP_LEVEL_A__PRIMITIVE_TO_WRAPPER;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNT_STATES__CODE = TEXP_LEVEL_A__CODE;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNT_STATES__PARAMETER = TEXP_LEVEL_A_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TCount States</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNT_STATES_FEATURE_COUNT = TEXP_LEVEL_A_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TCount States</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNT_STATES_OPERATION_COUNT = TEXP_LEVEL_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targetAST.impl.T_SetAbsoluteNodePropabilityImpl <em>TSet Absolute Node Propability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targetAST.impl.T_SetAbsoluteNodePropabilityImpl
	 * @see targetAST.impl.TargetASTPackageImpl#getT_SetAbsoluteNodePropability()
	 * @generated
	 */
	int TSET_ABSOLUTE_NODE_PROPABILITY = 23;

	/**
	 * The feature id for the '<em><b>Cast To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSET_ABSOLUTE_NODE_PROPABILITY__CAST_TO = TEXP_LEVEL_A__CAST_TO;

	/**
	 * The feature id for the '<em><b>Cast To Primitive Method Call</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSET_ABSOLUTE_NODE_PROPABILITY__CAST_TO_PRIMITIVE_METHOD_CALL = TEXP_LEVEL_A__CAST_TO_PRIMITIVE_METHOD_CALL;

	/**
	 * The feature id for the '<em><b>Cast To Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSET_ABSOLUTE_NODE_PROPABILITY__CAST_TO_PRIMITIVE = TEXP_LEVEL_A__CAST_TO_PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSET_ABSOLUTE_NODE_PROPABILITY__OBJECT = TEXP_LEVEL_A__OBJECT;

	/**
	 * The feature id for the '<em><b>Primitive To Wrapper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSET_ABSOLUTE_NODE_PROPABILITY__PRIMITIVE_TO_WRAPPER = TEXP_LEVEL_A__PRIMITIVE_TO_WRAPPER;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSET_ABSOLUTE_NODE_PROPABILITY__CODE = TEXP_LEVEL_A__CODE;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSET_ABSOLUTE_NODE_PROPABILITY__PARAMETER = TEXP_LEVEL_A_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TSet Absolute Node Propability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSET_ABSOLUTE_NODE_PROPABILITY_FEATURE_COUNT = TEXP_LEVEL_A_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TSet Absolute Node Propability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSET_ABSOLUTE_NODE_PROPABILITY_OPERATION_COUNT = TEXP_LEVEL_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targetAST.impl.T_CountReachableStatesImpl <em>TCount Reachable States</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targetAST.impl.T_CountReachableStatesImpl
	 * @see targetAST.impl.TargetASTPackageImpl#getT_CountReachableStates()
	 * @generated
	 */
	int TCOUNT_REACHABLE_STATES = 24;

	/**
	 * The feature id for the '<em><b>Cast To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNT_REACHABLE_STATES__CAST_TO = TEXP_LEVEL_A__CAST_TO;

	/**
	 * The feature id for the '<em><b>Cast To Primitive Method Call</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNT_REACHABLE_STATES__CAST_TO_PRIMITIVE_METHOD_CALL = TEXP_LEVEL_A__CAST_TO_PRIMITIVE_METHOD_CALL;

	/**
	 * The feature id for the '<em><b>Cast To Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNT_REACHABLE_STATES__CAST_TO_PRIMITIVE = TEXP_LEVEL_A__CAST_TO_PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNT_REACHABLE_STATES__OBJECT = TEXP_LEVEL_A__OBJECT;

	/**
	 * The feature id for the '<em><b>Primitive To Wrapper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNT_REACHABLE_STATES__PRIMITIVE_TO_WRAPPER = TEXP_LEVEL_A__PRIMITIVE_TO_WRAPPER;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNT_REACHABLE_STATES__CODE = TEXP_LEVEL_A__CODE;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNT_REACHABLE_STATES__PARAMETER = TEXP_LEVEL_A_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TCount Reachable States</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNT_REACHABLE_STATES_FEATURE_COUNT = TEXP_LEVEL_A_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TCount Reachable States</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNT_REACHABLE_STATES_OPERATION_COUNT = TEXP_LEVEL_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targetAST.impl.T_CountInValidTransitionsImpl <em>TCount In Valid Transitions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targetAST.impl.T_CountInValidTransitionsImpl
	 * @see targetAST.impl.TargetASTPackageImpl#getT_CountInValidTransitions()
	 * @generated
	 */
	int TCOUNT_IN_VALID_TRANSITIONS = 25;

	/**
	 * The feature id for the '<em><b>Cast To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNT_IN_VALID_TRANSITIONS__CAST_TO = TEXP_LEVEL_A__CAST_TO;

	/**
	 * The feature id for the '<em><b>Cast To Primitive Method Call</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNT_IN_VALID_TRANSITIONS__CAST_TO_PRIMITIVE_METHOD_CALL = TEXP_LEVEL_A__CAST_TO_PRIMITIVE_METHOD_CALL;

	/**
	 * The feature id for the '<em><b>Cast To Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNT_IN_VALID_TRANSITIONS__CAST_TO_PRIMITIVE = TEXP_LEVEL_A__CAST_TO_PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNT_IN_VALID_TRANSITIONS__OBJECT = TEXP_LEVEL_A__OBJECT;

	/**
	 * The feature id for the '<em><b>Primitive To Wrapper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNT_IN_VALID_TRANSITIONS__PRIMITIVE_TO_WRAPPER = TEXP_LEVEL_A__PRIMITIVE_TO_WRAPPER;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNT_IN_VALID_TRANSITIONS__CODE = TEXP_LEVEL_A__CODE;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNT_IN_VALID_TRANSITIONS__PARAMETER = TEXP_LEVEL_A_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TCount In Valid Transitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNT_IN_VALID_TRANSITIONS_FEATURE_COUNT = TEXP_LEVEL_A_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TCount In Valid Transitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNT_IN_VALID_TRANSITIONS_OPERATION_COUNT = TEXP_LEVEL_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targetAST.impl.T_SetPopulationSizeImpl <em>TSet Population Size</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targetAST.impl.T_SetPopulationSizeImpl
	 * @see targetAST.impl.TargetASTPackageImpl#getT_SetPopulationSize()
	 * @generated
	 */
	int TSET_POPULATION_SIZE = 26;

	/**
	 * The feature id for the '<em><b>Cast To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSET_POPULATION_SIZE__CAST_TO = TEXP_LEVEL_A__CAST_TO;

	/**
	 * The feature id for the '<em><b>Cast To Primitive Method Call</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSET_POPULATION_SIZE__CAST_TO_PRIMITIVE_METHOD_CALL = TEXP_LEVEL_A__CAST_TO_PRIMITIVE_METHOD_CALL;

	/**
	 * The feature id for the '<em><b>Cast To Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSET_POPULATION_SIZE__CAST_TO_PRIMITIVE = TEXP_LEVEL_A__CAST_TO_PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSET_POPULATION_SIZE__OBJECT = TEXP_LEVEL_A__OBJECT;

	/**
	 * The feature id for the '<em><b>Primitive To Wrapper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSET_POPULATION_SIZE__PRIMITIVE_TO_WRAPPER = TEXP_LEVEL_A__PRIMITIVE_TO_WRAPPER;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSET_POPULATION_SIZE__CODE = TEXP_LEVEL_A__CODE;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSET_POPULATION_SIZE__PARAMETER = TEXP_LEVEL_A_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TSet Population Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSET_POPULATION_SIZE_FEATURE_COUNT = TEXP_LEVEL_A_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TSet Population Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSET_POPULATION_SIZE_OPERATION_COUNT = TEXP_LEVEL_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targetAST.impl.T_GetLayerInformationImpl <em>TGet Layer Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targetAST.impl.T_GetLayerInformationImpl
	 * @see targetAST.impl.TargetASTPackageImpl#getT_GetLayerInformation()
	 * @generated
	 */
	int TGET_LAYER_INFORMATION = 27;

	/**
	 * The feature id for the '<em><b>Cast To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGET_LAYER_INFORMATION__CAST_TO = TEXP_LEVEL_A__CAST_TO;

	/**
	 * The feature id for the '<em><b>Cast To Primitive Method Call</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGET_LAYER_INFORMATION__CAST_TO_PRIMITIVE_METHOD_CALL = TEXP_LEVEL_A__CAST_TO_PRIMITIVE_METHOD_CALL;

	/**
	 * The feature id for the '<em><b>Cast To Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGET_LAYER_INFORMATION__CAST_TO_PRIMITIVE = TEXP_LEVEL_A__CAST_TO_PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGET_LAYER_INFORMATION__OBJECT = TEXP_LEVEL_A__OBJECT;

	/**
	 * The feature id for the '<em><b>Primitive To Wrapper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGET_LAYER_INFORMATION__PRIMITIVE_TO_WRAPPER = TEXP_LEVEL_A__PRIMITIVE_TO_WRAPPER;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGET_LAYER_INFORMATION__CODE = TEXP_LEVEL_A__CODE;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGET_LAYER_INFORMATION__PARAMETER = TEXP_LEVEL_A_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TGet Layer Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGET_LAYER_INFORMATION_FEATURE_COUNT = TEXP_LEVEL_A_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TGet Layer Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGET_LAYER_INFORMATION_OPERATION_COUNT = TEXP_LEVEL_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targetAST.impl.T_GetObjectManagementImpl <em>TGet Object Management</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targetAST.impl.T_GetObjectManagementImpl
	 * @see targetAST.impl.TargetASTPackageImpl#getT_GetObjectManagement()
	 * @generated
	 */
	int TGET_OBJECT_MANAGEMENT = 28;

	/**
	 * The feature id for the '<em><b>Cast To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGET_OBJECT_MANAGEMENT__CAST_TO = TEXP_LEVEL_A__CAST_TO;

	/**
	 * The feature id for the '<em><b>Cast To Primitive Method Call</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGET_OBJECT_MANAGEMENT__CAST_TO_PRIMITIVE_METHOD_CALL = TEXP_LEVEL_A__CAST_TO_PRIMITIVE_METHOD_CALL;

	/**
	 * The feature id for the '<em><b>Cast To Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGET_OBJECT_MANAGEMENT__CAST_TO_PRIMITIVE = TEXP_LEVEL_A__CAST_TO_PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGET_OBJECT_MANAGEMENT__OBJECT = TEXP_LEVEL_A__OBJECT;

	/**
	 * The feature id for the '<em><b>Primitive To Wrapper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGET_OBJECT_MANAGEMENT__PRIMITIVE_TO_WRAPPER = TEXP_LEVEL_A__PRIMITIVE_TO_WRAPPER;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGET_OBJECT_MANAGEMENT__CODE = TEXP_LEVEL_A__CODE;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGET_OBJECT_MANAGEMENT__PARAMETER = TEXP_LEVEL_A_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TGet Object Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGET_OBJECT_MANAGEMENT_FEATURE_COUNT = TEXP_LEVEL_A_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TGet Object Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGET_OBJECT_MANAGEMENT_OPERATION_COUNT = TEXP_LEVEL_A_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link targetAST.impl.T_LoadModelImpl <em>TLoad Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targetAST.impl.T_LoadModelImpl
	 * @see targetAST.impl.TargetASTPackageImpl#getT_LoadModel()
	 * @generated
	 */
	int TLOAD_MODEL = 29;

	/**
	 * The feature id for the '<em><b>Cast To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLOAD_MODEL__CAST_TO = TEXP_LEVEL_A__CAST_TO;

	/**
	 * The feature id for the '<em><b>Cast To Primitive Method Call</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLOAD_MODEL__CAST_TO_PRIMITIVE_METHOD_CALL = TEXP_LEVEL_A__CAST_TO_PRIMITIVE_METHOD_CALL;

	/**
	 * The feature id for the '<em><b>Cast To Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLOAD_MODEL__CAST_TO_PRIMITIVE = TEXP_LEVEL_A__CAST_TO_PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLOAD_MODEL__OBJECT = TEXP_LEVEL_A__OBJECT;

	/**
	 * The feature id for the '<em><b>Primitive To Wrapper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLOAD_MODEL__PRIMITIVE_TO_WRAPPER = TEXP_LEVEL_A__PRIMITIVE_TO_WRAPPER;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLOAD_MODEL__CODE = TEXP_LEVEL_A__CODE;

	/**
	 * The feature id for the '<em><b>Rel Model Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLOAD_MODEL__REL_MODEL_PATH = TEXP_LEVEL_A_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TLoad Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLOAD_MODEL_FEATURE_COUNT = TEXP_LEVEL_A_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TLoad Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLOAD_MODEL_OPERATION_COUNT = TEXP_LEVEL_A_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link targetAST.impl.T_GetEnumLiteralImpl <em>TGet Enum Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targetAST.impl.T_GetEnumLiteralImpl
	 * @see targetAST.impl.TargetASTPackageImpl#getT_GetEnumLiteral()
	 * @generated
	 */
	int TGET_ENUM_LITERAL = 30;

	/**
	 * The feature id for the '<em><b>Cast To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGET_ENUM_LITERAL__CAST_TO = TEXP_LEVEL_A__CAST_TO;

	/**
	 * The feature id for the '<em><b>Cast To Primitive Method Call</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGET_ENUM_LITERAL__CAST_TO_PRIMITIVE_METHOD_CALL = TEXP_LEVEL_A__CAST_TO_PRIMITIVE_METHOD_CALL;

	/**
	 * The feature id for the '<em><b>Cast To Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGET_ENUM_LITERAL__CAST_TO_PRIMITIVE = TEXP_LEVEL_A__CAST_TO_PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGET_ENUM_LITERAL__OBJECT = TEXP_LEVEL_A__OBJECT;

	/**
	 * The feature id for the '<em><b>Primitive To Wrapper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGET_ENUM_LITERAL__PRIMITIVE_TO_WRAPPER = TEXP_LEVEL_A__PRIMITIVE_TO_WRAPPER;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGET_ENUM_LITERAL__CODE = TEXP_LEVEL_A__CODE;

	/**
	 * The feature id for the '<em><b>Qualified Enum Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGET_ENUM_LITERAL__QUALIFIED_ENUM_NAME = TEXP_LEVEL_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Literal Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGET_ENUM_LITERAL__LITERAL_NAME = TEXP_LEVEL_A_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TGet Enum Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGET_ENUM_LITERAL_FEATURE_COUNT = TEXP_LEVEL_A_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TGet Enum Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGET_ENUM_LITERAL_OPERATION_COUNT = TEXP_LEVEL_A_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link targetAST.impl.T_DesEventQueuePeekImpl <em>TDes Event Queue Peek</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targetAST.impl.T_DesEventQueuePeekImpl
	 * @see targetAST.impl.TargetASTPackageImpl#getT_DesEventQueuePeek()
	 * @generated
	 */
	int TDES_EVENT_QUEUE_PEEK = 31;

	/**
	 * The feature id for the '<em><b>Cast To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDES_EVENT_QUEUE_PEEK__CAST_TO = TEXP_LEVEL_A__CAST_TO;

	/**
	 * The feature id for the '<em><b>Cast To Primitive Method Call</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDES_EVENT_QUEUE_PEEK__CAST_TO_PRIMITIVE_METHOD_CALL = TEXP_LEVEL_A__CAST_TO_PRIMITIVE_METHOD_CALL;

	/**
	 * The feature id for the '<em><b>Cast To Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDES_EVENT_QUEUE_PEEK__CAST_TO_PRIMITIVE = TEXP_LEVEL_A__CAST_TO_PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDES_EVENT_QUEUE_PEEK__OBJECT = TEXP_LEVEL_A__OBJECT;

	/**
	 * The feature id for the '<em><b>Primitive To Wrapper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDES_EVENT_QUEUE_PEEK__PRIMITIVE_TO_WRAPPER = TEXP_LEVEL_A__PRIMITIVE_TO_WRAPPER;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDES_EVENT_QUEUE_PEEK__CODE = TEXP_LEVEL_A__CODE;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDES_EVENT_QUEUE_PEEK__ARGUMENTS = TEXP_LEVEL_A_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TDes Event Queue Peek</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDES_EVENT_QUEUE_PEEK_FEATURE_COUNT = TEXP_LEVEL_A_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TDes Event Queue Peek</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDES_EVENT_QUEUE_PEEK_OPERATION_COUNT = TEXP_LEVEL_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targetAST.impl.T_DesEventQueueConsumeImpl <em>TDes Event Queue Consume</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targetAST.impl.T_DesEventQueueConsumeImpl
	 * @see targetAST.impl.TargetASTPackageImpl#getT_DesEventQueueConsume()
	 * @generated
	 */
	int TDES_EVENT_QUEUE_CONSUME = 32;

	/**
	 * The feature id for the '<em><b>Cast To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDES_EVENT_QUEUE_CONSUME__CAST_TO = TEXP_LEVEL_A__CAST_TO;

	/**
	 * The feature id for the '<em><b>Cast To Primitive Method Call</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDES_EVENT_QUEUE_CONSUME__CAST_TO_PRIMITIVE_METHOD_CALL = TEXP_LEVEL_A__CAST_TO_PRIMITIVE_METHOD_CALL;

	/**
	 * The feature id for the '<em><b>Cast To Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDES_EVENT_QUEUE_CONSUME__CAST_TO_PRIMITIVE = TEXP_LEVEL_A__CAST_TO_PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDES_EVENT_QUEUE_CONSUME__OBJECT = TEXP_LEVEL_A__OBJECT;

	/**
	 * The feature id for the '<em><b>Primitive To Wrapper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDES_EVENT_QUEUE_CONSUME__PRIMITIVE_TO_WRAPPER = TEXP_LEVEL_A__PRIMITIVE_TO_WRAPPER;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDES_EVENT_QUEUE_CONSUME__CODE = TEXP_LEVEL_A__CODE;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDES_EVENT_QUEUE_CONSUME__ARGUMENTS = TEXP_LEVEL_A_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TDes Event Queue Consume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDES_EVENT_QUEUE_CONSUME_FEATURE_COUNT = TEXP_LEVEL_A_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TDes Event Queue Consume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDES_EVENT_QUEUE_CONSUME_OPERATION_COUNT = TEXP_LEVEL_A_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link targetAST.impl.T_DesQueuePeekImpl <em>TDes Queue Peek</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targetAST.impl.T_DesQueuePeekImpl
	 * @see targetAST.impl.TargetASTPackageImpl#getT_DesQueuePeek()
	 * @generated
	 */
	int TDES_QUEUE_PEEK = 33;

	/**
	 * The feature id for the '<em><b>Cast To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDES_QUEUE_PEEK__CAST_TO = TEXP_LEVEL_A__CAST_TO;

	/**
	 * The feature id for the '<em><b>Cast To Primitive Method Call</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDES_QUEUE_PEEK__CAST_TO_PRIMITIVE_METHOD_CALL = TEXP_LEVEL_A__CAST_TO_PRIMITIVE_METHOD_CALL;

	/**
	 * The feature id for the '<em><b>Cast To Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDES_QUEUE_PEEK__CAST_TO_PRIMITIVE = TEXP_LEVEL_A__CAST_TO_PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDES_QUEUE_PEEK__OBJECT = TEXP_LEVEL_A__OBJECT;

	/**
	 * The feature id for the '<em><b>Primitive To Wrapper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDES_QUEUE_PEEK__PRIMITIVE_TO_WRAPPER = TEXP_LEVEL_A__PRIMITIVE_TO_WRAPPER;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDES_QUEUE_PEEK__CODE = TEXP_LEVEL_A__CODE;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDES_QUEUE_PEEK__ARGUMENTS = TEXP_LEVEL_A_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TDes Queue Peek</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDES_QUEUE_PEEK_FEATURE_COUNT = TEXP_LEVEL_A_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TDes Queue Peek</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDES_QUEUE_PEEK_OPERATION_COUNT = TEXP_LEVEL_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targetAST.impl.T_DesQueueConsumeImpl <em>TDes Queue Consume</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targetAST.impl.T_DesQueueConsumeImpl
	 * @see targetAST.impl.TargetASTPackageImpl#getT_DesQueueConsume()
	 * @generated
	 */
	int TDES_QUEUE_CONSUME = 34;

	/**
	 * The feature id for the '<em><b>Cast To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDES_QUEUE_CONSUME__CAST_TO = TEXP_LEVEL_A__CAST_TO;

	/**
	 * The feature id for the '<em><b>Cast To Primitive Method Call</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDES_QUEUE_CONSUME__CAST_TO_PRIMITIVE_METHOD_CALL = TEXP_LEVEL_A__CAST_TO_PRIMITIVE_METHOD_CALL;

	/**
	 * The feature id for the '<em><b>Cast To Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDES_QUEUE_CONSUME__CAST_TO_PRIMITIVE = TEXP_LEVEL_A__CAST_TO_PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDES_QUEUE_CONSUME__OBJECT = TEXP_LEVEL_A__OBJECT;

	/**
	 * The feature id for the '<em><b>Primitive To Wrapper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDES_QUEUE_CONSUME__PRIMITIVE_TO_WRAPPER = TEXP_LEVEL_A__PRIMITIVE_TO_WRAPPER;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDES_QUEUE_CONSUME__CODE = TEXP_LEVEL_A__CODE;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDES_QUEUE_CONSUME__ARGUMENTS = TEXP_LEVEL_A_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TDes Queue Consume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDES_QUEUE_CONSUME_FEATURE_COUNT = TEXP_LEVEL_A_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TDes Queue Consume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDES_QUEUE_CONSUME_OPERATION_COUNT = TEXP_LEVEL_A_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link targetAST.impl.T_TypeImpl <em>TType</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targetAST.impl.T_TypeImpl
	 * @see targetAST.impl.TargetASTPackageImpl#getT_Type()
	 * @generated
	 */
	int TTYPE = 35;

	/**
	 * The feature id for the '<em><b>Cast To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTYPE__CAST_TO = TEXP_LEVEL_A__CAST_TO;

	/**
	 * The feature id for the '<em><b>Cast To Primitive Method Call</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTYPE__CAST_TO_PRIMITIVE_METHOD_CALL = TEXP_LEVEL_A__CAST_TO_PRIMITIVE_METHOD_CALL;

	/**
	 * The feature id for the '<em><b>Cast To Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTYPE__CAST_TO_PRIMITIVE = TEXP_LEVEL_A__CAST_TO_PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTYPE__OBJECT = TEXP_LEVEL_A__OBJECT;

	/**
	 * The feature id for the '<em><b>Primitive To Wrapper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTYPE__PRIMITIVE_TO_WRAPPER = TEXP_LEVEL_A__PRIMITIVE_TO_WRAPPER;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTYPE__CODE = TEXP_LEVEL_A__CODE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTYPE__TYPE = TEXP_LEVEL_A_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTYPE_FEATURE_COUNT = TEXP_LEVEL_A_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTYPE_OPERATION_COUNT = TEXP_LEVEL_A_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link targetAST.impl.T_TimeStepImpl <em>TTime Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targetAST.impl.T_TimeStepImpl
	 * @see targetAST.impl.TargetASTPackageImpl#getT_TimeStep()
	 * @generated
	 */
	int TTIME_STEP = 36;

	/**
	 * The feature id for the '<em><b>Cast To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTIME_STEP__CAST_TO = TEXP_LEVEL_A__CAST_TO;

	/**
	 * The feature id for the '<em><b>Cast To Primitive Method Call</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTIME_STEP__CAST_TO_PRIMITIVE_METHOD_CALL = TEXP_LEVEL_A__CAST_TO_PRIMITIVE_METHOD_CALL;

	/**
	 * The feature id for the '<em><b>Cast To Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTIME_STEP__CAST_TO_PRIMITIVE = TEXP_LEVEL_A__CAST_TO_PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTIME_STEP__OBJECT = TEXP_LEVEL_A__OBJECT;

	/**
	 * The feature id for the '<em><b>Primitive To Wrapper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTIME_STEP__PRIMITIVE_TO_WRAPPER = TEXP_LEVEL_A__PRIMITIVE_TO_WRAPPER;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTIME_STEP__CODE = TEXP_LEVEL_A__CODE;

	/**
	 * The number of structural features of the '<em>TTime Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTIME_STEP_FEATURE_COUNT = TEXP_LEVEL_A_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>TTime Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTIME_STEP_OPERATION_COUNT = TEXP_LEVEL_A_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link targetAST.impl.T_ObserverAddValueImpl <em>TObserver Add Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targetAST.impl.T_ObserverAddValueImpl
	 * @see targetAST.impl.TargetASTPackageImpl#getT_ObserverAddValue()
	 * @generated
	 */
	int TOBSERVER_ADD_VALUE = 37;

	/**
	 * The feature id for the '<em><b>Cast To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOBSERVER_ADD_VALUE__CAST_TO = TEXP_LEVEL_A__CAST_TO;

	/**
	 * The feature id for the '<em><b>Cast To Primitive Method Call</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOBSERVER_ADD_VALUE__CAST_TO_PRIMITIVE_METHOD_CALL = TEXP_LEVEL_A__CAST_TO_PRIMITIVE_METHOD_CALL;

	/**
	 * The feature id for the '<em><b>Cast To Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOBSERVER_ADD_VALUE__CAST_TO_PRIMITIVE = TEXP_LEVEL_A__CAST_TO_PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOBSERVER_ADD_VALUE__OBJECT = TEXP_LEVEL_A__OBJECT;

	/**
	 * The feature id for the '<em><b>Primitive To Wrapper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOBSERVER_ADD_VALUE__PRIMITIVE_TO_WRAPPER = TEXP_LEVEL_A__PRIMITIVE_TO_WRAPPER;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOBSERVER_ADD_VALUE__CODE = TEXP_LEVEL_A__CODE;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOBSERVER_ADD_VALUE__PARAMETER = TEXP_LEVEL_A_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TObserver Add Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOBSERVER_ADD_VALUE_FEATURE_COUNT = TEXP_LEVEL_A_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TObserver Add Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOBSERVER_ADD_VALUE_OPERATION_COUNT = TEXP_LEVEL_A_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link targetAST.impl.T_GetInstanceForStaticAccessImpl <em>TGet Instance For Static Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targetAST.impl.T_GetInstanceForStaticAccessImpl
	 * @see targetAST.impl.TargetASTPackageImpl#getT_GetInstanceForStaticAccess()
	 * @generated
	 */
	int TGET_INSTANCE_FOR_STATIC_ACCESS = 38;

	/**
	 * The feature id for the '<em><b>Cast To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGET_INSTANCE_FOR_STATIC_ACCESS__CAST_TO = TEXP_LEVEL_B__CAST_TO;

	/**
	 * The feature id for the '<em><b>Cast To Primitive Method Call</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGET_INSTANCE_FOR_STATIC_ACCESS__CAST_TO_PRIMITIVE_METHOD_CALL = TEXP_LEVEL_B__CAST_TO_PRIMITIVE_METHOD_CALL;

	/**
	 * The feature id for the '<em><b>Cast To Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGET_INSTANCE_FOR_STATIC_ACCESS__CAST_TO_PRIMITIVE = TEXP_LEVEL_B__CAST_TO_PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGET_INSTANCE_FOR_STATIC_ACCESS__OBJECT = TEXP_LEVEL_B__OBJECT;

	/**
	 * The feature id for the '<em><b>Primitive To Wrapper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGET_INSTANCE_FOR_STATIC_ACCESS__PRIMITIVE_TO_WRAPPER = TEXP_LEVEL_B__PRIMITIVE_TO_WRAPPER;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGET_INSTANCE_FOR_STATIC_ACCESS__CODE = TEXP_LEVEL_B__CODE;

	/**
	 * The feature id for the '<em><b>Type Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGET_INSTANCE_FOR_STATIC_ACCESS__TYPE_OBJECT = TEXP_LEVEL_B__TYPE_OBJECT;

	/**
	 * The feature id for the '<em><b>Qualified Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGET_INSTANCE_FOR_STATIC_ACCESS__QUALIFIED_CLASS_NAME = TEXP_LEVEL_B_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TGet Instance For Static Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGET_INSTANCE_FOR_STATIC_ACCESS_FEATURE_COUNT = TEXP_LEVEL_B_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TGet Instance For Static Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGET_INSTANCE_FOR_STATIC_ACCESS_OPERATION_COUNT = TEXP_LEVEL_B_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link targetAST.TargetASTRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see targetAST.TargetASTRoot
	 * @generated
	 */
	EClass getTargetASTRoot();

	/**
	 * Returns the meta object for the containment reference '{@link targetAST.TargetASTRoot#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see targetAST.TargetASTRoot#getExpression()
	 * @see #getTargetASTRoot()
	 * @generated
	 */
	EReference getTargetASTRoot_Expression();

	/**
	 * Returns the meta object for class '{@link targetAST.T_BinaryExp <em>TBinary Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TBinary Exp</em>'.
	 * @see targetAST.T_BinaryExp
	 * @generated
	 */
	EClass getT_BinaryExp();

	/**
	 * Returns the meta object for the containment reference '{@link targetAST.T_BinaryExp#getLeftOperand <em>Left Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Operand</em>'.
	 * @see targetAST.T_BinaryExp#getLeftOperand()
	 * @see #getT_BinaryExp()
	 * @generated
	 */
	EReference getT_BinaryExp_LeftOperand();

	/**
	 * Returns the meta object for the containment reference '{@link targetAST.T_BinaryExp#getRightOperand <em>Right Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Operand</em>'.
	 * @see targetAST.T_BinaryExp#getRightOperand()
	 * @see #getT_BinaryExp()
	 * @generated
	 */
	EReference getT_BinaryExp_RightOperand();

	/**
	 * Returns the meta object for the attribute '{@link targetAST.T_BinaryExp#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see targetAST.T_BinaryExp#getOperator()
	 * @see #getT_BinaryExp()
	 * @generated
	 */
	EAttribute getT_BinaryExp_Operator();

	/**
	 * Returns the meta object for class '{@link targetAST.T_Get <em>TGet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TGet</em>'.
	 * @see targetAST.T_Get
	 * @generated
	 */
	EClass getT_Get();

	/**
	 * Returns the meta object for the attribute list '{@link targetAST.T_Get#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Features</em>'.
	 * @see targetAST.T_Get#getFeatures()
	 * @see #getT_Get()
	 * @generated
	 */
	EAttribute getT_Get_Features();

	/**
	 * Returns the meta object for the attribute '{@link targetAST.T_Get#isObjectIsParam <em>Object Is Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Is Param</em>'.
	 * @see targetAST.T_Get#isObjectIsParam()
	 * @see #getT_Get()
	 * @generated
	 */
	EAttribute getT_Get_ObjectIsParam();

	/**
	 * Returns the meta object for the attribute '{@link targetAST.T_Get#getPostfix <em>Postfix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postfix</em>'.
	 * @see targetAST.T_Get#getPostfix()
	 * @see #getT_Get()
	 * @generated
	 */
	EAttribute getT_Get_Postfix();

	/**
	 * Returns the meta object for class '{@link targetAST.T_Set <em>TSet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TSet</em>'.
	 * @see targetAST.T_Set
	 * @generated
	 */
	EClass getT_Set();

	/**
	 * Returns the meta object for the attribute list '{@link targetAST.T_Set#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Features</em>'.
	 * @see targetAST.T_Set#getFeatures()
	 * @see #getT_Set()
	 * @generated
	 */
	EAttribute getT_Set_Features();

	/**
	 * Returns the meta object for the attribute '{@link targetAST.T_Set#isObjectIsParam <em>Object Is Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Is Param</em>'.
	 * @see targetAST.T_Set#isObjectIsParam()
	 * @see #getT_Set()
	 * @generated
	 */
	EAttribute getT_Set_ObjectIsParam();

	/**
	 * Returns the meta object for the containment reference '{@link targetAST.T_Set#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see targetAST.T_Set#getValue()
	 * @see #getT_Set()
	 * @generated
	 */
	EReference getT_Set_Value();

	/**
	 * Returns the meta object for class '{@link targetAST.T_ExtCall <em>TExt Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TExt Call</em>'.
	 * @see targetAST.T_ExtCall
	 * @generated
	 */
	EClass getT_ExtCall();

	/**
	 * Returns the meta object for the containment reference list '{@link targetAST.T_ExtCall#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see targetAST.T_ExtCall#getArguments()
	 * @see #getT_ExtCall()
	 * @generated
	 */
	EReference getT_ExtCall_Arguments();

	/**
	 * Returns the meta object for the attribute '{@link targetAST.T_ExtCall#getMethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Name</em>'.
	 * @see targetAST.T_ExtCall#getMethodName()
	 * @see #getT_ExtCall()
	 * @generated
	 */
	EAttribute getT_ExtCall_MethodName();

	/**
	 * Returns the meta object for the attribute '{@link targetAST.T_ExtCall#getStringLiteral <em>String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String Literal</em>'.
	 * @see targetAST.T_ExtCall#getStringLiteral()
	 * @see #getT_ExtCall()
	 * @generated
	 */
	EAttribute getT_ExtCall_StringLiteral();

	/**
	 * Returns the meta object for the attribute list '{@link targetAST.T_ExtCall#getTypeArguments <em>Type Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Type Arguments</em>'.
	 * @see targetAST.T_ExtCall#getTypeArguments()
	 * @see #getT_ExtCall()
	 * @generated
	 */
	EAttribute getT_ExtCall_TypeArguments();

	/**
	 * Returns the meta object for class '{@link targetAST.T_ExpLevelB <em>TExp Level B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TExp Level B</em>'.
	 * @see targetAST.T_ExpLevelB
	 * @generated
	 */
	EClass getT_ExpLevelB();

	/**
	 * Returns the meta object for the attribute '{@link targetAST.T_ExpLevelB#getTypeObject <em>Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Object</em>'.
	 * @see targetAST.T_ExpLevelB#getTypeObject()
	 * @see #getT_ExpLevelB()
	 * @generated
	 */
	EAttribute getT_ExpLevelB_TypeObject();

	/**
	 * Returns the meta object for class '{@link targetAST.T_Literal <em>TLiteral</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TLiteral</em>'.
	 * @see targetAST.T_Literal
	 * @generated
	 */
	EClass getT_Literal();

	/**
	 * Returns the meta object for the attribute '{@link targetAST.T_Literal#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see targetAST.T_Literal#getValue()
	 * @see #getT_Literal()
	 * @generated
	 */
	EAttribute getT_Literal_Value();

	/**
	 * Returns the meta object for class '{@link targetAST.T_ExpLevelA <em>TExp Level A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TExp Level A</em>'.
	 * @see targetAST.T_ExpLevelA
	 * @generated
	 */
	EClass getT_ExpLevelA();

	/**
	 * Returns the meta object for the attribute '{@link targetAST.T_ExpLevelA#getCastTo <em>Cast To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cast To</em>'.
	 * @see targetAST.T_ExpLevelA#getCastTo()
	 * @see #getT_ExpLevelA()
	 * @generated
	 */
	EAttribute getT_ExpLevelA_CastTo();

	/**
	 * Returns the meta object for the attribute '{@link targetAST.T_ExpLevelA#getCastToPrimitiveMethodCall <em>Cast To Primitive Method Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cast To Primitive Method Call</em>'.
	 * @see targetAST.T_ExpLevelA#getCastToPrimitiveMethodCall()
	 * @see #getT_ExpLevelA()
	 * @generated
	 */
	EAttribute getT_ExpLevelA_CastToPrimitiveMethodCall();

	/**
	 * Returns the meta object for the attribute '{@link targetAST.T_ExpLevelA#isCastToPrimitive <em>Cast To Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cast To Primitive</em>'.
	 * @see targetAST.T_ExpLevelA#isCastToPrimitive()
	 * @see #getT_ExpLevelA()
	 * @generated
	 */
	EAttribute getT_ExpLevelA_CastToPrimitive();

	/**
	 * Returns the meta object for the containment reference '{@link targetAST.T_ExpLevelA#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see targetAST.T_ExpLevelA#getObject()
	 * @see #getT_ExpLevelA()
	 * @generated
	 */
	EReference getT_ExpLevelA_Object();

	/**
	 * Returns the meta object for the attribute '{@link targetAST.T_ExpLevelA#getPrimitiveToWrapper <em>Primitive To Wrapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primitive To Wrapper</em>'.
	 * @see targetAST.T_ExpLevelA#getPrimitiveToWrapper()
	 * @see #getT_ExpLevelA()
	 * @generated
	 */
	EAttribute getT_ExpLevelA_PrimitiveToWrapper();

	/**
	 * Returns the meta object for the attribute '{@link targetAST.T_ExpLevelA#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see targetAST.T_ExpLevelA#getCode()
	 * @see #getT_ExpLevelA()
	 * @generated
	 */
	EAttribute getT_ExpLevelA_Code();

	/**
	 * Returns the meta object for class '{@link targetAST.T_InstanceOfExp <em>TInstance Of Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TInstance Of Exp</em>'.
	 * @see targetAST.T_InstanceOfExp
	 * @generated
	 */
	EClass getT_InstanceOfExp();

	/**
	 * Returns the meta object for the containment reference '{@link targetAST.T_InstanceOfExp#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see targetAST.T_InstanceOfExp#getExpression()
	 * @see #getT_InstanceOfExp()
	 * @generated
	 */
	EReference getT_InstanceOfExp_Expression();

	/**
	 * Returns the meta object for the attribute '{@link targetAST.T_InstanceOfExp#isTypeIsExternal <em>Type Is External</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Is External</em>'.
	 * @see targetAST.T_InstanceOfExp#isTypeIsExternal()
	 * @see #getT_InstanceOfExp()
	 * @generated
	 */
	EAttribute getT_InstanceOfExp_TypeIsExternal();

	/**
	 * Returns the meta object for the attribute '{@link targetAST.T_InstanceOfExp#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see targetAST.T_InstanceOfExp#getType()
	 * @see #getT_InstanceOfExp()
	 * @generated
	 */
	EAttribute getT_InstanceOfExp_Type();

	/**
	 * Returns the meta object for class '{@link targetAST.T_UnaryExp <em>TUnary Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TUnary Exp</em>'.
	 * @see targetAST.T_UnaryExp
	 * @generated
	 */
	EClass getT_UnaryExp();

	/**
	 * Returns the meta object for the attribute '{@link targetAST.T_UnaryExp#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see targetAST.T_UnaryExp#getOperator()
	 * @see #getT_UnaryExp()
	 * @generated
	 */
	EAttribute getT_UnaryExp_Operator();

	/**
	 * Returns the meta object for class '{@link targetAST.T_CreateInstanceExp <em>TCreate Instance Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCreate Instance Exp</em>'.
	 * @see targetAST.T_CreateInstanceExp
	 * @generated
	 */
	EClass getT_CreateInstanceExp();

	/**
	 * Returns the meta object for the attribute '{@link targetAST.T_CreateInstanceExp#getTypeQualifiedName <em>Type Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Qualified Name</em>'.
	 * @see targetAST.T_CreateInstanceExp#getTypeQualifiedName()
	 * @see #getT_CreateInstanceExp()
	 * @generated
	 */
	EAttribute getT_CreateInstanceExp_TypeQualifiedName();

	/**
	 * Returns the meta object for class '{@link targetAST.T_PrintExp <em>TPrint Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TPrint Exp</em>'.
	 * @see targetAST.T_PrintExp
	 * @generated
	 */
	EClass getT_PrintExp();

	/**
	 * Returns the meta object for the containment reference '{@link targetAST.T_PrintExp#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see targetAST.T_PrintExp#getExpression()
	 * @see #getT_PrintExp()
	 * @generated
	 */
	EReference getT_PrintExp_Expression();

	/**
	 * Returns the meta object for class '{@link targetAST.T_GetInstancesOfExp <em>TGet Instances Of Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TGet Instances Of Exp</em>'.
	 * @see targetAST.T_GetInstancesOfExp
	 * @generated
	 */
	EClass getT_GetInstancesOfExp();

	/**
	 * Returns the meta object for the containment reference '{@link targetAST.T_GetInstancesOfExp#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see targetAST.T_GetInstancesOfExp#getExpression()
	 * @see #getT_GetInstancesOfExp()
	 * @generated
	 */
	EReference getT_GetInstancesOfExp_Expression();

	/**
	 * Returns the meta object for the attribute '{@link targetAST.T_GetInstancesOfExp#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see targetAST.T_GetInstancesOfExp#getClassName()
	 * @see #getT_GetInstancesOfExp()
	 * @generated
	 */
	EAttribute getT_GetInstancesOfExp_ClassName();

	/**
	 * Returns the meta object for class '{@link targetAST.T_SetReturn <em>TSet Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TSet Return</em>'.
	 * @see targetAST.T_SetReturn
	 * @generated
	 */
	EClass getT_SetReturn();

	/**
	 * Returns the meta object for the containment reference '{@link targetAST.T_SetReturn#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see targetAST.T_SetReturn#getExpression()
	 * @see #getT_SetReturn()
	 * @generated
	 */
	EReference getT_SetReturn_Expression();

	/**
	 * Returns the meta object for class '{@link targetAST.T_ExtConstructor <em>TExt Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TExt Constructor</em>'.
	 * @see targetAST.T_ExtConstructor
	 * @generated
	 */
	EClass getT_ExtConstructor();

	/**
	 * Returns the meta object for the containment reference list '{@link targetAST.T_ExtConstructor#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see targetAST.T_ExtConstructor#getArguments()
	 * @see #getT_ExtConstructor()
	 * @generated
	 */
	EReference getT_ExtConstructor_Arguments();

	/**
	 * Returns the meta object for the attribute '{@link targetAST.T_ExtConstructor#getTypeQualifiedName <em>Type Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Qualified Name</em>'.
	 * @see targetAST.T_ExtConstructor#getTypeQualifiedName()
	 * @see #getT_ExtConstructor()
	 * @generated
	 */
	EAttribute getT_ExtConstructor_TypeQualifiedName();

	/**
	 * Returns the meta object for class '{@link targetAST.T_ExtType <em>TExt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TExt Type</em>'.
	 * @see targetAST.T_ExtType
	 * @generated
	 */
	EClass getT_ExtType();

	/**
	 * Returns the meta object for the attribute '{@link targetAST.T_ExtType#getNewAttribute <em>New Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Attribute</em>'.
	 * @see targetAST.T_ExtType#getNewAttribute()
	 * @see #getT_ExtType()
	 * @generated
	 */
	EAttribute getT_ExtType_NewAttribute();

	/**
	 * Returns the meta object for class '{@link targetAST.T_ExtAttrCall <em>TExt Attr Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TExt Attr Call</em>'.
	 * @see targetAST.T_ExtAttrCall
	 * @generated
	 */
	EClass getT_ExtAttrCall();

	/**
	 * Returns the meta object for the attribute '{@link targetAST.T_ExtAttrCall#getAttributeName <em>Attribute Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute Name</em>'.
	 * @see targetAST.T_ExtAttrCall#getAttributeName()
	 * @see #getT_ExtAttrCall()
	 * @generated
	 */
	EAttribute getT_ExtAttrCall_AttributeName();

	/**
	 * Returns the meta object for class '{@link targetAST.T_OpCall <em>TOp Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TOp Call</em>'.
	 * @see targetAST.T_OpCall
	 * @generated
	 */
	EClass getT_OpCall();

	/**
	 * Returns the meta object for the attribute '{@link targetAST.T_OpCall#getVarNamesForReturn <em>Var Names For Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Names For Return</em>'.
	 * @see targetAST.T_OpCall#getVarNamesForReturn()
	 * @see #getT_OpCall()
	 * @generated
	 */
	EAttribute getT_OpCall_VarNamesForReturn();

	/**
	 * Returns the meta object for the attribute '{@link targetAST.T_OpCall#getOperationName <em>Operation Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation Name</em>'.
	 * @see targetAST.T_OpCall#getOperationName()
	 * @see #getT_OpCall()
	 * @generated
	 */
	EAttribute getT_OpCall_OperationName();

	/**
	 * Returns the meta object for the containment reference list '{@link targetAST.T_OpCall#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see targetAST.T_OpCall#getArguments()
	 * @see #getT_OpCall()
	 * @generated
	 */
	EReference getT_OpCall_Arguments();

	/**
	 * Returns the meta object for the attribute '{@link targetAST.T_OpCall#isHasINOUT <em>Has INOUT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has INOUT</em>'.
	 * @see targetAST.T_OpCall#isHasINOUT()
	 * @see #getT_OpCall()
	 * @generated
	 */
	EAttribute getT_OpCall_HasINOUT();

	/**
	 * Returns the meta object for the attribute list '{@link targetAST.T_OpCall#getLastFeaturesName <em>Last Features Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Last Features Name</em>'.
	 * @see targetAST.T_OpCall#getLastFeaturesName()
	 * @see #getT_OpCall()
	 * @generated
	 */
	EAttribute getT_OpCall_LastFeaturesName();

	/**
	 * Returns the meta object for the attribute list '{@link targetAST.T_OpCall#getPostfix <em>Postfix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Postfix</em>'.
	 * @see targetAST.T_OpCall#getPostfix()
	 * @see #getT_OpCall()
	 * @generated
	 */
	EAttribute getT_OpCall_Postfix();

	/**
	 * Returns the meta object for the attribute list '{@link targetAST.T_OpCall#getIsINOUT <em>Is INOUT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Is INOUT</em>'.
	 * @see targetAST.T_OpCall#getIsINOUT()
	 * @see #getT_OpCall()
	 * @generated
	 */
	EAttribute getT_OpCall_IsINOUT();

	/**
	 * Returns the meta object for the attribute '{@link targetAST.T_OpCall#isParam <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Param</em>'.
	 * @see targetAST.T_OpCall#isParam()
	 * @see #getT_OpCall()
	 * @generated
	 */
	EAttribute getT_OpCall_Param();

	/**
	 * Returns the meta object for the attribute '{@link targetAST.T_OpCall#getTypeForMultiInheritance <em>Type For Multi Inheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type For Multi Inheritance</em>'.
	 * @see targetAST.T_OpCall#getTypeForMultiInheritance()
	 * @see #getT_OpCall()
	 * @generated
	 */
	EAttribute getT_OpCall_TypeForMultiInheritance();

	/**
	 * Returns the meta object for the attribute '{@link targetAST.T_OpCall#getQualifiedNameOperation <em>Qualified Name Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Name Operation</em>'.
	 * @see targetAST.T_OpCall#getQualifiedNameOperation()
	 * @see #getT_OpCall()
	 * @generated
	 */
	EAttribute getT_OpCall_QualifiedNameOperation();

	/**
	 * Returns the meta object for class '{@link targetAST.T_ColorDFA <em>TColor DFA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TColor DFA</em>'.
	 * @see targetAST.T_ColorDFA
	 * @generated
	 */
	EClass getT_ColorDFA();

	/**
	 * Returns the meta object for the containment reference '{@link targetAST.T_ColorDFA#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Id</em>'.
	 * @see targetAST.T_ColorDFA#getId()
	 * @see #getT_ColorDFA()
	 * @generated
	 */
	EReference getT_ColorDFA_Id();

	/**
	 * Returns the meta object for class '{@link targetAST.T_GetInstances <em>TGet Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TGet Instances</em>'.
	 * @see targetAST.T_GetInstances
	 * @generated
	 */
	EClass getT_GetInstances();

	/**
	 * Returns the meta object for the reference list '{@link targetAST.T_GetInstances#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameter</em>'.
	 * @see targetAST.T_GetInstances#getParameter()
	 * @see #getT_GetInstances()
	 * @generated
	 */
	EReference getT_GetInstances_Parameter();

	/**
	 * Returns the meta object for class '{@link targetAST.T_CountFinalStates <em>TCount Final States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCount Final States</em>'.
	 * @see targetAST.T_CountFinalStates
	 * @generated
	 */
	EClass getT_CountFinalStates();

	/**
	 * Returns the meta object for the reference list '{@link targetAST.T_CountFinalStates#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameter</em>'.
	 * @see targetAST.T_CountFinalStates#getParameter()
	 * @see #getT_CountFinalStates()
	 * @generated
	 */
	EReference getT_CountFinalStates_Parameter();

	/**
	 * Returns the meta object for class '{@link targetAST.T_CountInitialStates <em>TCount Initial States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCount Initial States</em>'.
	 * @see targetAST.T_CountInitialStates
	 * @generated
	 */
	EClass getT_CountInitialStates();

	/**
	 * Returns the meta object for the reference list '{@link targetAST.T_CountInitialStates#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameter</em>'.
	 * @see targetAST.T_CountInitialStates#getParameter()
	 * @see #getT_CountInitialStates()
	 * @generated
	 */
	EReference getT_CountInitialStates_Parameter();

	/**
	 * Returns the meta object for class '{@link targetAST.T_CountStates <em>TCount States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCount States</em>'.
	 * @see targetAST.T_CountStates
	 * @generated
	 */
	EClass getT_CountStates();

	/**
	 * Returns the meta object for the reference list '{@link targetAST.T_CountStates#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameter</em>'.
	 * @see targetAST.T_CountStates#getParameter()
	 * @see #getT_CountStates()
	 * @generated
	 */
	EReference getT_CountStates_Parameter();

	/**
	 * Returns the meta object for class '{@link targetAST.T_SetAbsoluteNodePropability <em>TSet Absolute Node Propability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TSet Absolute Node Propability</em>'.
	 * @see targetAST.T_SetAbsoluteNodePropability
	 * @generated
	 */
	EClass getT_SetAbsoluteNodePropability();

	/**
	 * Returns the meta object for the reference list '{@link targetAST.T_SetAbsoluteNodePropability#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameter</em>'.
	 * @see targetAST.T_SetAbsoluteNodePropability#getParameter()
	 * @see #getT_SetAbsoluteNodePropability()
	 * @generated
	 */
	EReference getT_SetAbsoluteNodePropability_Parameter();

	/**
	 * Returns the meta object for class '{@link targetAST.T_CountReachableStates <em>TCount Reachable States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCount Reachable States</em>'.
	 * @see targetAST.T_CountReachableStates
	 * @generated
	 */
	EClass getT_CountReachableStates();

	/**
	 * Returns the meta object for the reference list '{@link targetAST.T_CountReachableStates#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameter</em>'.
	 * @see targetAST.T_CountReachableStates#getParameter()
	 * @see #getT_CountReachableStates()
	 * @generated
	 */
	EReference getT_CountReachableStates_Parameter();

	/**
	 * Returns the meta object for class '{@link targetAST.T_CountInValidTransitions <em>TCount In Valid Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCount In Valid Transitions</em>'.
	 * @see targetAST.T_CountInValidTransitions
	 * @generated
	 */
	EClass getT_CountInValidTransitions();

	/**
	 * Returns the meta object for the reference list '{@link targetAST.T_CountInValidTransitions#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameter</em>'.
	 * @see targetAST.T_CountInValidTransitions#getParameter()
	 * @see #getT_CountInValidTransitions()
	 * @generated
	 */
	EReference getT_CountInValidTransitions_Parameter();

	/**
	 * Returns the meta object for class '{@link targetAST.T_SetPopulationSize <em>TSet Population Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TSet Population Size</em>'.
	 * @see targetAST.T_SetPopulationSize
	 * @generated
	 */
	EClass getT_SetPopulationSize();

	/**
	 * Returns the meta object for the reference list '{@link targetAST.T_SetPopulationSize#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameter</em>'.
	 * @see targetAST.T_SetPopulationSize#getParameter()
	 * @see #getT_SetPopulationSize()
	 * @generated
	 */
	EReference getT_SetPopulationSize_Parameter();

	/**
	 * Returns the meta object for class '{@link targetAST.T_GetLayerInformation <em>TGet Layer Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TGet Layer Information</em>'.
	 * @see targetAST.T_GetLayerInformation
	 * @generated
	 */
	EClass getT_GetLayerInformation();

	/**
	 * Returns the meta object for the reference list '{@link targetAST.T_GetLayerInformation#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameter</em>'.
	 * @see targetAST.T_GetLayerInformation#getParameter()
	 * @see #getT_GetLayerInformation()
	 * @generated
	 */
	EReference getT_GetLayerInformation_Parameter();

	/**
	 * Returns the meta object for class '{@link targetAST.T_GetObjectManagement <em>TGet Object Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TGet Object Management</em>'.
	 * @see targetAST.T_GetObjectManagement
	 * @generated
	 */
	EClass getT_GetObjectManagement();

	/**
	 * Returns the meta object for the reference list '{@link targetAST.T_GetObjectManagement#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameter</em>'.
	 * @see targetAST.T_GetObjectManagement#getParameter()
	 * @see #getT_GetObjectManagement()
	 * @generated
	 */
	EReference getT_GetObjectManagement_Parameter();

	/**
	 * Returns the meta object for class '{@link targetAST.T_LoadModel <em>TLoad Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TLoad Model</em>'.
	 * @see targetAST.T_LoadModel
	 * @generated
	 */
	EClass getT_LoadModel();

	/**
	 * Returns the meta object for the reference '{@link targetAST.T_LoadModel#getRelModelPath <em>Rel Model Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rel Model Path</em>'.
	 * @see targetAST.T_LoadModel#getRelModelPath()
	 * @see #getT_LoadModel()
	 * @generated
	 */
	EReference getT_LoadModel_RelModelPath();

	/**
	 * Returns the meta object for class '{@link targetAST.T_GetEnumLiteral <em>TGet Enum Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TGet Enum Literal</em>'.
	 * @see targetAST.T_GetEnumLiteral
	 * @generated
	 */
	EClass getT_GetEnumLiteral();

	/**
	 * Returns the meta object for the attribute '{@link targetAST.T_GetEnumLiteral#getQualifiedEnumName <em>Qualified Enum Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Enum Name</em>'.
	 * @see targetAST.T_GetEnumLiteral#getQualifiedEnumName()
	 * @see #getT_GetEnumLiteral()
	 * @generated
	 */
	EAttribute getT_GetEnumLiteral_QualifiedEnumName();

	/**
	 * Returns the meta object for the attribute '{@link targetAST.T_GetEnumLiteral#getLiteralName <em>Literal Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Literal Name</em>'.
	 * @see targetAST.T_GetEnumLiteral#getLiteralName()
	 * @see #getT_GetEnumLiteral()
	 * @generated
	 */
	EAttribute getT_GetEnumLiteral_LiteralName();

	/**
	 * Returns the meta object for class '{@link targetAST.T_DesEventQueuePeek <em>TDes Event Queue Peek</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TDes Event Queue Peek</em>'.
	 * @see targetAST.T_DesEventQueuePeek
	 * @generated
	 */
	EClass getT_DesEventQueuePeek();

	/**
	 * Returns the meta object for the containment reference list '{@link targetAST.T_DesEventQueuePeek#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see targetAST.T_DesEventQueuePeek#getArguments()
	 * @see #getT_DesEventQueuePeek()
	 * @generated
	 */
	EReference getT_DesEventQueuePeek_Arguments();

	/**
	 * Returns the meta object for class '{@link targetAST.T_DesEventQueueConsume <em>TDes Event Queue Consume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TDes Event Queue Consume</em>'.
	 * @see targetAST.T_DesEventQueueConsume
	 * @generated
	 */
	EClass getT_DesEventQueueConsume();

	/**
	 * Returns the meta object for the containment reference list '{@link targetAST.T_DesEventQueueConsume#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see targetAST.T_DesEventQueueConsume#getArguments()
	 * @see #getT_DesEventQueueConsume()
	 * @generated
	 */
	EReference getT_DesEventQueueConsume_Arguments();

	/**
	 * Returns the meta object for class '{@link targetAST.T_DesQueuePeek <em>TDes Queue Peek</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TDes Queue Peek</em>'.
	 * @see targetAST.T_DesQueuePeek
	 * @generated
	 */
	EClass getT_DesQueuePeek();

	/**
	 * Returns the meta object for the containment reference list '{@link targetAST.T_DesQueuePeek#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see targetAST.T_DesQueuePeek#getArguments()
	 * @see #getT_DesQueuePeek()
	 * @generated
	 */
	EReference getT_DesQueuePeek_Arguments();

	/**
	 * Returns the meta object for class '{@link targetAST.T_DesQueueConsume <em>TDes Queue Consume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TDes Queue Consume</em>'.
	 * @see targetAST.T_DesQueueConsume
	 * @generated
	 */
	EClass getT_DesQueueConsume();

	/**
	 * Returns the meta object for the containment reference list '{@link targetAST.T_DesQueueConsume#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see targetAST.T_DesQueueConsume#getArguments()
	 * @see #getT_DesQueueConsume()
	 * @generated
	 */
	EReference getT_DesQueueConsume_Arguments();

	/**
	 * Returns the meta object for class '{@link targetAST.T_Type <em>TType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TType</em>'.
	 * @see targetAST.T_Type
	 * @generated
	 */
	EClass getT_Type();

	/**
	 * Returns the meta object for the attribute '{@link targetAST.T_Type#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see targetAST.T_Type#getType()
	 * @see #getT_Type()
	 * @generated
	 */
	EAttribute getT_Type_Type();

	/**
	 * Returns the meta object for class '{@link targetAST.T_TimeStep <em>TTime Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TTime Step</em>'.
	 * @see targetAST.T_TimeStep
	 * @generated
	 */
	EClass getT_TimeStep();

	/**
	 * Returns the meta object for class '{@link targetAST.T_ObserverAddValue <em>TObserver Add Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TObserver Add Value</em>'.
	 * @see targetAST.T_ObserverAddValue
	 * @generated
	 */
	EClass getT_ObserverAddValue();

	/**
	 * Returns the meta object for the reference list '{@link targetAST.T_ObserverAddValue#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameter</em>'.
	 * @see targetAST.T_ObserverAddValue#getParameter()
	 * @see #getT_ObserverAddValue()
	 * @generated
	 */
	EReference getT_ObserverAddValue_Parameter();

	/**
	 * Returns the meta object for class '{@link targetAST.T_GetInstanceForStaticAccess <em>TGet Instance For Static Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TGet Instance For Static Access</em>'.
	 * @see targetAST.T_GetInstanceForStaticAccess
	 * @generated
	 */
	EClass getT_GetInstanceForStaticAccess();

	/**
	 * Returns the meta object for the attribute '{@link targetAST.T_GetInstanceForStaticAccess#getQualifiedClassName <em>Qualified Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Class Name</em>'.
	 * @see targetAST.T_GetInstanceForStaticAccess#getQualifiedClassName()
	 * @see #getT_GetInstanceForStaticAccess()
	 * @generated
	 */
	EAttribute getT_GetInstanceForStaticAccess_QualifiedClassName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TargetASTFactory getTargetASTFactory();

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
	interface Literals {
		/**
		 * The meta object literal for the '{@link targetAST.impl.TargetASTRootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targetAST.impl.TargetASTRootImpl
		 * @see targetAST.impl.TargetASTPackageImpl#getTargetASTRoot()
		 * @generated
		 */
		EClass TARGET_AST_ROOT = eINSTANCE.getTargetASTRoot();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_AST_ROOT__EXPRESSION = eINSTANCE.getTargetASTRoot_Expression();

		/**
		 * The meta object literal for the '{@link targetAST.impl.T_BinaryExpImpl <em>TBinary Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targetAST.impl.T_BinaryExpImpl
		 * @see targetAST.impl.TargetASTPackageImpl#getT_BinaryExp()
		 * @generated
		 */
		EClass TBINARY_EXP = eINSTANCE.getT_BinaryExp();

		/**
		 * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TBINARY_EXP__LEFT_OPERAND = eINSTANCE.getT_BinaryExp_LeftOperand();

		/**
		 * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TBINARY_EXP__RIGHT_OPERAND = eINSTANCE.getT_BinaryExp_RightOperand();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TBINARY_EXP__OPERATOR = eINSTANCE.getT_BinaryExp_Operator();

		/**
		 * The meta object literal for the '{@link targetAST.impl.T_GetImpl <em>TGet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targetAST.impl.T_GetImpl
		 * @see targetAST.impl.TargetASTPackageImpl#getT_Get()
		 * @generated
		 */
		EClass TGET = eINSTANCE.getT_Get();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TGET__FEATURES = eINSTANCE.getT_Get_Features();

		/**
		 * The meta object literal for the '<em><b>Object Is Param</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TGET__OBJECT_IS_PARAM = eINSTANCE.getT_Get_ObjectIsParam();

		/**
		 * The meta object literal for the '<em><b>Postfix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TGET__POSTFIX = eINSTANCE.getT_Get_Postfix();

		/**
		 * The meta object literal for the '{@link targetAST.impl.T_SetImpl <em>TSet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targetAST.impl.T_SetImpl
		 * @see targetAST.impl.TargetASTPackageImpl#getT_Set()
		 * @generated
		 */
		EClass TSET = eINSTANCE.getT_Set();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TSET__FEATURES = eINSTANCE.getT_Set_Features();

		/**
		 * The meta object literal for the '<em><b>Object Is Param</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TSET__OBJECT_IS_PARAM = eINSTANCE.getT_Set_ObjectIsParam();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TSET__VALUE = eINSTANCE.getT_Set_Value();

		/**
		 * The meta object literal for the '{@link targetAST.impl.T_ExtCallImpl <em>TExt Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targetAST.impl.T_ExtCallImpl
		 * @see targetAST.impl.TargetASTPackageImpl#getT_ExtCall()
		 * @generated
		 */
		EClass TEXT_CALL = eINSTANCE.getT_ExtCall();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_CALL__ARGUMENTS = eINSTANCE.getT_ExtCall_Arguments();

		/**
		 * The meta object literal for the '<em><b>Method Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_CALL__METHOD_NAME = eINSTANCE.getT_ExtCall_MethodName();

		/**
		 * The meta object literal for the '<em><b>String Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_CALL__STRING_LITERAL = eINSTANCE.getT_ExtCall_StringLiteral();

		/**
		 * The meta object literal for the '<em><b>Type Arguments</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_CALL__TYPE_ARGUMENTS = eINSTANCE.getT_ExtCall_TypeArguments();

		/**
		 * The meta object literal for the '{@link targetAST.impl.T_ExpLevelBImpl <em>TExp Level B</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targetAST.impl.T_ExpLevelBImpl
		 * @see targetAST.impl.TargetASTPackageImpl#getT_ExpLevelB()
		 * @generated
		 */
		EClass TEXP_LEVEL_B = eINSTANCE.getT_ExpLevelB();

		/**
		 * The meta object literal for the '<em><b>Type Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXP_LEVEL_B__TYPE_OBJECT = eINSTANCE.getT_ExpLevelB_TypeObject();

		/**
		 * The meta object literal for the '{@link targetAST.impl.T_LiteralImpl <em>TLiteral</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targetAST.impl.T_LiteralImpl
		 * @see targetAST.impl.TargetASTPackageImpl#getT_Literal()
		 * @generated
		 */
		EClass TLITERAL = eINSTANCE.getT_Literal();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TLITERAL__VALUE = eINSTANCE.getT_Literal_Value();

		/**
		 * The meta object literal for the '{@link targetAST.impl.T_ExpLevelAImpl <em>TExp Level A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targetAST.impl.T_ExpLevelAImpl
		 * @see targetAST.impl.TargetASTPackageImpl#getT_ExpLevelA()
		 * @generated
		 */
		EClass TEXP_LEVEL_A = eINSTANCE.getT_ExpLevelA();

		/**
		 * The meta object literal for the '<em><b>Cast To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXP_LEVEL_A__CAST_TO = eINSTANCE.getT_ExpLevelA_CastTo();

		/**
		 * The meta object literal for the '<em><b>Cast To Primitive Method Call</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXP_LEVEL_A__CAST_TO_PRIMITIVE_METHOD_CALL = eINSTANCE.getT_ExpLevelA_CastToPrimitiveMethodCall();

		/**
		 * The meta object literal for the '<em><b>Cast To Primitive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXP_LEVEL_A__CAST_TO_PRIMITIVE = eINSTANCE.getT_ExpLevelA_CastToPrimitive();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXP_LEVEL_A__OBJECT = eINSTANCE.getT_ExpLevelA_Object();

		/**
		 * The meta object literal for the '<em><b>Primitive To Wrapper</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXP_LEVEL_A__PRIMITIVE_TO_WRAPPER = eINSTANCE.getT_ExpLevelA_PrimitiveToWrapper();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXP_LEVEL_A__CODE = eINSTANCE.getT_ExpLevelA_Code();

		/**
		 * The meta object literal for the '{@link targetAST.impl.T_InstanceOfExpImpl <em>TInstance Of Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targetAST.impl.T_InstanceOfExpImpl
		 * @see targetAST.impl.TargetASTPackageImpl#getT_InstanceOfExp()
		 * @generated
		 */
		EClass TINSTANCE_OF_EXP = eINSTANCE.getT_InstanceOfExp();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TINSTANCE_OF_EXP__EXPRESSION = eINSTANCE.getT_InstanceOfExp_Expression();

		/**
		 * The meta object literal for the '<em><b>Type Is External</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TINSTANCE_OF_EXP__TYPE_IS_EXTERNAL = eINSTANCE.getT_InstanceOfExp_TypeIsExternal();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TINSTANCE_OF_EXP__TYPE = eINSTANCE.getT_InstanceOfExp_Type();

		/**
		 * The meta object literal for the '{@link targetAST.impl.T_UnaryExpImpl <em>TUnary Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targetAST.impl.T_UnaryExpImpl
		 * @see targetAST.impl.TargetASTPackageImpl#getT_UnaryExp()
		 * @generated
		 */
		EClass TUNARY_EXP = eINSTANCE.getT_UnaryExp();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUNARY_EXP__OPERATOR = eINSTANCE.getT_UnaryExp_Operator();

		/**
		 * The meta object literal for the '{@link targetAST.impl.T_CreateInstanceExpImpl <em>TCreate Instance Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targetAST.impl.T_CreateInstanceExpImpl
		 * @see targetAST.impl.TargetASTPackageImpl#getT_CreateInstanceExp()
		 * @generated
		 */
		EClass TCREATE_INSTANCE_EXP = eINSTANCE.getT_CreateInstanceExp();

		/**
		 * The meta object literal for the '<em><b>Type Qualified Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCREATE_INSTANCE_EXP__TYPE_QUALIFIED_NAME = eINSTANCE.getT_CreateInstanceExp_TypeQualifiedName();

		/**
		 * The meta object literal for the '{@link targetAST.impl.T_PrintExpImpl <em>TPrint Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targetAST.impl.T_PrintExpImpl
		 * @see targetAST.impl.TargetASTPackageImpl#getT_PrintExp()
		 * @generated
		 */
		EClass TPRINT_EXP = eINSTANCE.getT_PrintExp();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPRINT_EXP__EXPRESSION = eINSTANCE.getT_PrintExp_Expression();

		/**
		 * The meta object literal for the '{@link targetAST.impl.T_GetInstancesOfExpImpl <em>TGet Instances Of Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targetAST.impl.T_GetInstancesOfExpImpl
		 * @see targetAST.impl.TargetASTPackageImpl#getT_GetInstancesOfExp()
		 * @generated
		 */
		EClass TGET_INSTANCES_OF_EXP = eINSTANCE.getT_GetInstancesOfExp();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TGET_INSTANCES_OF_EXP__EXPRESSION = eINSTANCE.getT_GetInstancesOfExp_Expression();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TGET_INSTANCES_OF_EXP__CLASS_NAME = eINSTANCE.getT_GetInstancesOfExp_ClassName();

		/**
		 * The meta object literal for the '{@link targetAST.impl.T_SetReturnImpl <em>TSet Return</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targetAST.impl.T_SetReturnImpl
		 * @see targetAST.impl.TargetASTPackageImpl#getT_SetReturn()
		 * @generated
		 */
		EClass TSET_RETURN = eINSTANCE.getT_SetReturn();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TSET_RETURN__EXPRESSION = eINSTANCE.getT_SetReturn_Expression();

		/**
		 * The meta object literal for the '{@link targetAST.impl.T_ExtConstructorImpl <em>TExt Constructor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targetAST.impl.T_ExtConstructorImpl
		 * @see targetAST.impl.TargetASTPackageImpl#getT_ExtConstructor()
		 * @generated
		 */
		EClass TEXT_CONSTRUCTOR = eINSTANCE.getT_ExtConstructor();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_CONSTRUCTOR__ARGUMENTS = eINSTANCE.getT_ExtConstructor_Arguments();

		/**
		 * The meta object literal for the '<em><b>Type Qualified Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_CONSTRUCTOR__TYPE_QUALIFIED_NAME = eINSTANCE.getT_ExtConstructor_TypeQualifiedName();

		/**
		 * The meta object literal for the '{@link targetAST.impl.T_ExtTypeImpl <em>TExt Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targetAST.impl.T_ExtTypeImpl
		 * @see targetAST.impl.TargetASTPackageImpl#getT_ExtType()
		 * @generated
		 */
		EClass TEXT_TYPE = eINSTANCE.getT_ExtType();

		/**
		 * The meta object literal for the '<em><b>New Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_TYPE__NEW_ATTRIBUTE = eINSTANCE.getT_ExtType_NewAttribute();

		/**
		 * The meta object literal for the '{@link targetAST.impl.T_ExtAttrCallImpl <em>TExt Attr Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targetAST.impl.T_ExtAttrCallImpl
		 * @see targetAST.impl.TargetASTPackageImpl#getT_ExtAttrCall()
		 * @generated
		 */
		EClass TEXT_ATTR_CALL = eINSTANCE.getT_ExtAttrCall();

		/**
		 * The meta object literal for the '<em><b>Attribute Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_ATTR_CALL__ATTRIBUTE_NAME = eINSTANCE.getT_ExtAttrCall_AttributeName();

		/**
		 * The meta object literal for the '{@link targetAST.impl.T_OpCallImpl <em>TOp Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targetAST.impl.T_OpCallImpl
		 * @see targetAST.impl.TargetASTPackageImpl#getT_OpCall()
		 * @generated
		 */
		EClass TOP_CALL = eINSTANCE.getT_OpCall();

		/**
		 * The meta object literal for the '<em><b>Var Names For Return</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOP_CALL__VAR_NAMES_FOR_RETURN = eINSTANCE.getT_OpCall_VarNamesForReturn();

		/**
		 * The meta object literal for the '<em><b>Operation Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOP_CALL__OPERATION_NAME = eINSTANCE.getT_OpCall_OperationName();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOP_CALL__ARGUMENTS = eINSTANCE.getT_OpCall_Arguments();

		/**
		 * The meta object literal for the '<em><b>Has INOUT</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOP_CALL__HAS_INOUT = eINSTANCE.getT_OpCall_HasINOUT();

		/**
		 * The meta object literal for the '<em><b>Last Features Name</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOP_CALL__LAST_FEATURES_NAME = eINSTANCE.getT_OpCall_LastFeaturesName();

		/**
		 * The meta object literal for the '<em><b>Postfix</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOP_CALL__POSTFIX = eINSTANCE.getT_OpCall_Postfix();

		/**
		 * The meta object literal for the '<em><b>Is INOUT</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOP_CALL__IS_INOUT = eINSTANCE.getT_OpCall_IsINOUT();

		/**
		 * The meta object literal for the '<em><b>Param</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOP_CALL__PARAM = eINSTANCE.getT_OpCall_Param();

		/**
		 * The meta object literal for the '<em><b>Type For Multi Inheritance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOP_CALL__TYPE_FOR_MULTI_INHERITANCE = eINSTANCE.getT_OpCall_TypeForMultiInheritance();

		/**
		 * The meta object literal for the '<em><b>Qualified Name Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOP_CALL__QUALIFIED_NAME_OPERATION = eINSTANCE.getT_OpCall_QualifiedNameOperation();

		/**
		 * The meta object literal for the '{@link targetAST.impl.T_ColorDFAImpl <em>TColor DFA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targetAST.impl.T_ColorDFAImpl
		 * @see targetAST.impl.TargetASTPackageImpl#getT_ColorDFA()
		 * @generated
		 */
		EClass TCOLOR_DFA = eINSTANCE.getT_ColorDFA();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCOLOR_DFA__ID = eINSTANCE.getT_ColorDFA_Id();

		/**
		 * The meta object literal for the '{@link targetAST.impl.T_GetInstancesImpl <em>TGet Instances</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targetAST.impl.T_GetInstancesImpl
		 * @see targetAST.impl.TargetASTPackageImpl#getT_GetInstances()
		 * @generated
		 */
		EClass TGET_INSTANCES = eINSTANCE.getT_GetInstances();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TGET_INSTANCES__PARAMETER = eINSTANCE.getT_GetInstances_Parameter();

		/**
		 * The meta object literal for the '{@link targetAST.impl.T_CountFinalStatesImpl <em>TCount Final States</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targetAST.impl.T_CountFinalStatesImpl
		 * @see targetAST.impl.TargetASTPackageImpl#getT_CountFinalStates()
		 * @generated
		 */
		EClass TCOUNT_FINAL_STATES = eINSTANCE.getT_CountFinalStates();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCOUNT_FINAL_STATES__PARAMETER = eINSTANCE.getT_CountFinalStates_Parameter();

		/**
		 * The meta object literal for the '{@link targetAST.impl.T_CountInitialStatesImpl <em>TCount Initial States</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targetAST.impl.T_CountInitialStatesImpl
		 * @see targetAST.impl.TargetASTPackageImpl#getT_CountInitialStates()
		 * @generated
		 */
		EClass TCOUNT_INITIAL_STATES = eINSTANCE.getT_CountInitialStates();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCOUNT_INITIAL_STATES__PARAMETER = eINSTANCE.getT_CountInitialStates_Parameter();

		/**
		 * The meta object literal for the '{@link targetAST.impl.T_CountStatesImpl <em>TCount States</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targetAST.impl.T_CountStatesImpl
		 * @see targetAST.impl.TargetASTPackageImpl#getT_CountStates()
		 * @generated
		 */
		EClass TCOUNT_STATES = eINSTANCE.getT_CountStates();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCOUNT_STATES__PARAMETER = eINSTANCE.getT_CountStates_Parameter();

		/**
		 * The meta object literal for the '{@link targetAST.impl.T_SetAbsoluteNodePropabilityImpl <em>TSet Absolute Node Propability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targetAST.impl.T_SetAbsoluteNodePropabilityImpl
		 * @see targetAST.impl.TargetASTPackageImpl#getT_SetAbsoluteNodePropability()
		 * @generated
		 */
		EClass TSET_ABSOLUTE_NODE_PROPABILITY = eINSTANCE.getT_SetAbsoluteNodePropability();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TSET_ABSOLUTE_NODE_PROPABILITY__PARAMETER = eINSTANCE.getT_SetAbsoluteNodePropability_Parameter();

		/**
		 * The meta object literal for the '{@link targetAST.impl.T_CountReachableStatesImpl <em>TCount Reachable States</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targetAST.impl.T_CountReachableStatesImpl
		 * @see targetAST.impl.TargetASTPackageImpl#getT_CountReachableStates()
		 * @generated
		 */
		EClass TCOUNT_REACHABLE_STATES = eINSTANCE.getT_CountReachableStates();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCOUNT_REACHABLE_STATES__PARAMETER = eINSTANCE.getT_CountReachableStates_Parameter();

		/**
		 * The meta object literal for the '{@link targetAST.impl.T_CountInValidTransitionsImpl <em>TCount In Valid Transitions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targetAST.impl.T_CountInValidTransitionsImpl
		 * @see targetAST.impl.TargetASTPackageImpl#getT_CountInValidTransitions()
		 * @generated
		 */
		EClass TCOUNT_IN_VALID_TRANSITIONS = eINSTANCE.getT_CountInValidTransitions();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCOUNT_IN_VALID_TRANSITIONS__PARAMETER = eINSTANCE.getT_CountInValidTransitions_Parameter();

		/**
		 * The meta object literal for the '{@link targetAST.impl.T_SetPopulationSizeImpl <em>TSet Population Size</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targetAST.impl.T_SetPopulationSizeImpl
		 * @see targetAST.impl.TargetASTPackageImpl#getT_SetPopulationSize()
		 * @generated
		 */
		EClass TSET_POPULATION_SIZE = eINSTANCE.getT_SetPopulationSize();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TSET_POPULATION_SIZE__PARAMETER = eINSTANCE.getT_SetPopulationSize_Parameter();

		/**
		 * The meta object literal for the '{@link targetAST.impl.T_GetLayerInformationImpl <em>TGet Layer Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targetAST.impl.T_GetLayerInformationImpl
		 * @see targetAST.impl.TargetASTPackageImpl#getT_GetLayerInformation()
		 * @generated
		 */
		EClass TGET_LAYER_INFORMATION = eINSTANCE.getT_GetLayerInformation();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TGET_LAYER_INFORMATION__PARAMETER = eINSTANCE.getT_GetLayerInformation_Parameter();

		/**
		 * The meta object literal for the '{@link targetAST.impl.T_GetObjectManagementImpl <em>TGet Object Management</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targetAST.impl.T_GetObjectManagementImpl
		 * @see targetAST.impl.TargetASTPackageImpl#getT_GetObjectManagement()
		 * @generated
		 */
		EClass TGET_OBJECT_MANAGEMENT = eINSTANCE.getT_GetObjectManagement();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TGET_OBJECT_MANAGEMENT__PARAMETER = eINSTANCE.getT_GetObjectManagement_Parameter();

		/**
		 * The meta object literal for the '{@link targetAST.impl.T_LoadModelImpl <em>TLoad Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targetAST.impl.T_LoadModelImpl
		 * @see targetAST.impl.TargetASTPackageImpl#getT_LoadModel()
		 * @generated
		 */
		EClass TLOAD_MODEL = eINSTANCE.getT_LoadModel();

		/**
		 * The meta object literal for the '<em><b>Rel Model Path</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TLOAD_MODEL__REL_MODEL_PATH = eINSTANCE.getT_LoadModel_RelModelPath();

		/**
		 * The meta object literal for the '{@link targetAST.impl.T_GetEnumLiteralImpl <em>TGet Enum Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targetAST.impl.T_GetEnumLiteralImpl
		 * @see targetAST.impl.TargetASTPackageImpl#getT_GetEnumLiteral()
		 * @generated
		 */
		EClass TGET_ENUM_LITERAL = eINSTANCE.getT_GetEnumLiteral();

		/**
		 * The meta object literal for the '<em><b>Qualified Enum Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TGET_ENUM_LITERAL__QUALIFIED_ENUM_NAME = eINSTANCE.getT_GetEnumLiteral_QualifiedEnumName();

		/**
		 * The meta object literal for the '<em><b>Literal Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TGET_ENUM_LITERAL__LITERAL_NAME = eINSTANCE.getT_GetEnumLiteral_LiteralName();

		/**
		 * The meta object literal for the '{@link targetAST.impl.T_DesEventQueuePeekImpl <em>TDes Event Queue Peek</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targetAST.impl.T_DesEventQueuePeekImpl
		 * @see targetAST.impl.TargetASTPackageImpl#getT_DesEventQueuePeek()
		 * @generated
		 */
		EClass TDES_EVENT_QUEUE_PEEK = eINSTANCE.getT_DesEventQueuePeek();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDES_EVENT_QUEUE_PEEK__ARGUMENTS = eINSTANCE.getT_DesEventQueuePeek_Arguments();

		/**
		 * The meta object literal for the '{@link targetAST.impl.T_DesEventQueueConsumeImpl <em>TDes Event Queue Consume</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targetAST.impl.T_DesEventQueueConsumeImpl
		 * @see targetAST.impl.TargetASTPackageImpl#getT_DesEventQueueConsume()
		 * @generated
		 */
		EClass TDES_EVENT_QUEUE_CONSUME = eINSTANCE.getT_DesEventQueueConsume();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDES_EVENT_QUEUE_CONSUME__ARGUMENTS = eINSTANCE.getT_DesEventQueueConsume_Arguments();

		/**
		 * The meta object literal for the '{@link targetAST.impl.T_DesQueuePeekImpl <em>TDes Queue Peek</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targetAST.impl.T_DesQueuePeekImpl
		 * @see targetAST.impl.TargetASTPackageImpl#getT_DesQueuePeek()
		 * @generated
		 */
		EClass TDES_QUEUE_PEEK = eINSTANCE.getT_DesQueuePeek();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDES_QUEUE_PEEK__ARGUMENTS = eINSTANCE.getT_DesQueuePeek_Arguments();

		/**
		 * The meta object literal for the '{@link targetAST.impl.T_DesQueueConsumeImpl <em>TDes Queue Consume</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targetAST.impl.T_DesQueueConsumeImpl
		 * @see targetAST.impl.TargetASTPackageImpl#getT_DesQueueConsume()
		 * @generated
		 */
		EClass TDES_QUEUE_CONSUME = eINSTANCE.getT_DesQueueConsume();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDES_QUEUE_CONSUME__ARGUMENTS = eINSTANCE.getT_DesQueueConsume_Arguments();

		/**
		 * The meta object literal for the '{@link targetAST.impl.T_TypeImpl <em>TType</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targetAST.impl.T_TypeImpl
		 * @see targetAST.impl.TargetASTPackageImpl#getT_Type()
		 * @generated
		 */
		EClass TTYPE = eINSTANCE.getT_Type();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TTYPE__TYPE = eINSTANCE.getT_Type_Type();

		/**
		 * The meta object literal for the '{@link targetAST.impl.T_TimeStepImpl <em>TTime Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targetAST.impl.T_TimeStepImpl
		 * @see targetAST.impl.TargetASTPackageImpl#getT_TimeStep()
		 * @generated
		 */
		EClass TTIME_STEP = eINSTANCE.getT_TimeStep();

		/**
		 * The meta object literal for the '{@link targetAST.impl.T_ObserverAddValueImpl <em>TObserver Add Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targetAST.impl.T_ObserverAddValueImpl
		 * @see targetAST.impl.TargetASTPackageImpl#getT_ObserverAddValue()
		 * @generated
		 */
		EClass TOBSERVER_ADD_VALUE = eINSTANCE.getT_ObserverAddValue();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOBSERVER_ADD_VALUE__PARAMETER = eINSTANCE.getT_ObserverAddValue_Parameter();

		/**
		 * The meta object literal for the '{@link targetAST.impl.T_GetInstanceForStaticAccessImpl <em>TGet Instance For Static Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targetAST.impl.T_GetInstanceForStaticAccessImpl
		 * @see targetAST.impl.TargetASTPackageImpl#getT_GetInstanceForStaticAccess()
		 * @generated
		 */
		EClass TGET_INSTANCE_FOR_STATIC_ACCESS = eINSTANCE.getT_GetInstanceForStaticAccess();

		/**
		 * The meta object literal for the '<em><b>Qualified Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TGET_INSTANCE_FOR_STATIC_ACCESS__QUALIFIED_CLASS_NAME = eINSTANCE.getT_GetInstanceForStaticAccess_QualifiedClassName();

	}

} //TargetASTPackage
