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
package online.yamm.coreModelDsl.validation

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.xtext.common.types.JvmConstructor
import org.eclipse.xtext.common.types.JvmField
import org.eclipse.xtext.common.types.JvmFormalParameter
import org.eclipse.xtext.common.types.JvmIdentifiableElement
import org.eclipse.xtext.validation.ValidationMessageAcceptor
import org.eclipse.xtext.xbase.XAbstractFeatureCall
import org.eclipse.xtext.xbase.XBinaryOperation
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.XNullLiteral
import org.eclipse.xtext.xbase.XVariableDeclaration
import org.eclipse.xtext.xbase.XbasePackage
import org.eclipse.xtext.xbase.scoping.featurecalls.OperatorMapping
import org.eclipse.xtext.xbase.typesystem.references.LightweightTypeReference

import static org.eclipse.xtext.xbase.validation.IssueCodes.ASSIGNMENT_TO_FINAL
import static org.eclipse.xtext.xbase.validation.IssueCodes.ASSIGNMENT_TO_NO_VARIABLE
import static org.eclipse.xtext.xbase.validation.IssueCodes.PRIMITIVE_COMPARED_TO_NULL
import org.eclipse.xtext.xbase.XBlockExpression
import online.yamm.coreModelXmi.yamm.YPrintExpression
import online.yamm.coreModelXmi.yamm.YSetReturnValue

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class XYammValidator extends AbstractXYammValidator {
	
//	public static val INVALID_NAME = 'invalidName'
//
//	@Check
//	def checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital', 
//					YammPackage.Literals.GREETING__NAME,
//					INVALID_NAME)
//		}
//	}

	override protected void mustBeJavaStatementExpression(XExpression expr) {
		var EObject container = expr.eContainer;
		while (!(container instanceof XBlockExpression))
		{
			if (container instanceof YPrintExpression || container instanceof YSetReturnValue)
				return;
			container = container.eContainer;
		}
		super.mustBeJavaStatementExpression(expr);
	}

override protected void checkAssignment(XExpression expression, EStructuralFeature feature, boolean simpleAssignment) {
		if (!(expression instanceof XAbstractFeatureCall)) {
			error("The left-hand side of an assignment must be a variable", expression, null,
					ValidationMessageAcceptor.INSIGNIFICANT_INDEX, ASSIGNMENT_TO_NO_VARIABLE);
			return;
		}
		var XAbstractFeatureCall assignment =  expression as XAbstractFeatureCall;
		var JvmIdentifiableElement assignmentFeature = assignment.getFeature();
		if (assignmentFeature instanceof XVariableDeclaration) {
			var XVariableDeclaration variableDeclaration =  assignmentFeature as XVariableDeclaration;
			if (variableDeclaration.isWriteable()) {
				return;
			}
			error("Assignment to final variable", expression, feature,
				ValidationMessageAcceptor.INSIGNIFICANT_INDEX, ASSIGNMENT_TO_FINAL);
		} else if (assignmentFeature instanceof JvmFormalParameter) {
			// we don't want final parameter!
//			error("Assignment to final parameter", expression, feature,
//					ValidationMessageAcceptor.INSIGNIFICANT_INDEX, ASSIGNMENT_TO_FINAL);
		} else if (assignmentFeature instanceof JvmField) {
			var JvmField field = assignmentFeature as JvmField;
			if (!field.isFinal()) {
				return;
			}
			if (simpleAssignment) {
				var JvmIdentifiableElement container = logicalContainerProvider.getNearestLogicalContainer(assignment);
				
				// don't issue an error if it's an assignment of a local final field within a constructor.
				if (container != null && container instanceof JvmConstructor) {
					var JvmConstructor constructor = container as JvmConstructor;
					if (field.getDeclaringType() == constructor.getDeclaringType())
						return;
				}
			}
			error("Assignment to final field", expression, feature,
					ValidationMessageAcceptor.INSIGNIFICANT_INDEX, ASSIGNMENT_TO_FINAL);
		} else if (!simpleAssignment) {
			error("The left-hand side of an assignment must be a variable", expression, null,
					ValidationMessageAcceptor.INSIGNIFICANT_INDEX, ASSIGNMENT_TO_NO_VARIABLE);
		}
	}

override public void checkPrimitiveComparedToNull(XBinaryOperation binaryOperation) {
		var String operatorSymbol = binaryOperation.getConcreteSyntaxFeatureName();
		var XExpression left = binaryOperation.getLeftOperand();
		var XExpression right = binaryOperation.getRightOperand();
		if (right != null && right.eClass() == XbasePackage.Literals.XNULL_LITERAL || left != null && left.eClass() == XbasePackage.Literals.XNULL_LITERAL) {
			var boolean equalsComparison = expressionHelper.isOperatorFromExtension(binaryOperation, operatorSymbol, OperatorMapping.EQUALS, ObjectExtensions)
					|| expressionHelper.isOperatorFromExtension(binaryOperation, operatorSymbol, OperatorMapping.NOT_EQUALS, ObjectExtensions);
			if(equalsComparison
					|| expressionHelper.isOperatorFromExtension(binaryOperation, operatorSymbol, OperatorMapping.TRIPLE_NOT_EQUALS, ObjectExtensions)
					|| expressionHelper.isOperatorFromExtension(binaryOperation, operatorSymbol, OperatorMapping.TRIPLE_EQUALS, ObjectExtensions)) {
				if(right instanceof XNullLiteral) {
					var LightweightTypeReference leftType = getActualType(left);
					if(leftType != null) {
						if (leftType.isPrimitive()) { 
							error("The operator '" + operatorSymbol + "' is undefined for the argument types " + leftType.getHumanReadableName() + " and null", binaryOperation, null, PRIMITIVE_COMPARED_TO_NULL);
						} else if (equalsComparison) {
//							addIssue("The operator '" + operatorSymbol + "' should be replaced by '" + operatorSymbol + "=' when null is one of the arguments.", binaryOperation, XbasePackage.eINSTANCE.getXAbstractFeatureCall_Feature(), EQUALS_WITH_NULL, operatorSymbol);
						}
					}
				}
				if(left instanceof XNullLiteral) {
					var LightweightTypeReference rightType = getActualType(right);
					if(rightType != null) {
						if (rightType.isPrimitive()) { 
							error("The operator '" + operatorSymbol + "' is undefined for the argument types null and " + rightType.getHumanReadableName(), binaryOperation, null, PRIMITIVE_COMPARED_TO_NULL);
						} else if (equalsComparison && !(right instanceof XNullLiteral)) {
//							addIssue("The operator '" + operatorSymbol + "' should be replaced by '" + operatorSymbol + "=' when null is one of the arguments.", binaryOperation, XbasePackage.eINSTANCE.getXAbstractFeatureCall_Feature(), EQUALS_WITH_NULL, operatorSymbol);
						}
					}
				}
			} else if(expressionHelper.isOperatorFromExtension(binaryOperation, operatorSymbol, OperatorMapping.ELVIS, ObjectExtensions)) {
				var LightweightTypeReference leftType = getActualType(left);
				if(leftType.isPrimitive()) 
					error("The operator '" + operatorSymbol + "' is undefined for arguments of type " + leftType.getHumanReadableName(), binaryOperation, null, PRIMITIVE_COMPARED_TO_NULL);
			}
		} else if(expressionHelper.isOperatorFromExtension(binaryOperation, operatorSymbol, OperatorMapping.ELVIS, ObjectExtensions)) {
			var LightweightTypeReference leftType = getActualType(left);
			if(leftType.isPrimitive()) 
				error("The operator '" + operatorSymbol + "' is undefined for arguments of type " + leftType.getHumanReadableName(), binaryOperation, null, PRIMITIVE_COMPARED_TO_NULL);
		}
	}
	
}
