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
package online.yamm.compile;

import java.util.Iterator;

import targetAST.T_BinaryExp;
import targetAST.T_ColorDFA;
import targetAST.T_CountFinalStates;
import targetAST.T_CountInValidTransitions;
import targetAST.T_CountInitialStates;
import targetAST.T_CountReachableStates;
import targetAST.T_CountStates;
import targetAST.T_CreateInstanceExp;
import targetAST.T_DesEventQueueConsume;
import targetAST.T_DesEventQueuePeek;
import targetAST.T_DesQueueConsume;
import targetAST.T_DesQueuePeek;
import targetAST.T_ExpLevelA;
import targetAST.T_ExtAttrCall;
import targetAST.T_ExtCall;
import targetAST.T_ExtConstructor;
import targetAST.T_ExtType;
import targetAST.T_Get;
import targetAST.T_GetEnumLiteral;
import targetAST.T_GetInstanceForStaticAccess;
import targetAST.T_GetInstances;
import targetAST.T_GetInstancesOfExp;
import targetAST.T_GetLayerInformation;
import targetAST.T_GetObjectManagement;
import targetAST.T_InstanceOfExp;
import targetAST.T_Literal;
import targetAST.T_LoadModel;
import targetAST.T_ObserverAddValue;
import targetAST.T_OpCall;
import targetAST.T_PrintExp;
import targetAST.T_Set;
import targetAST.T_SetAbsoluteNodePropability;
import targetAST.T_SetPopulationSize;
import targetAST.T_SetReturn;
import targetAST.T_TimeStep;
import targetAST.T_Type;
import targetAST.T_UnaryExp;
import targetAST.TargetASTRoot;
import targetAST.util.TargetASTSwitch;

public class CodegenTargetToCodeOriginal extends TargetASTSwitch<T_ExpLevelA> {
	
		private String generatedCode;

		public String generate(TargetASTRoot root) {

			generatedCode = "";

			doSwitch(root.getExpression());

			generatedCode += ";";

			return generatedCode;
		}

		@Override
		public T_ExpLevelA caseT_Get(T_Get exp) {

			String toWrapper = null;
			if (null != (toWrapper = exp.getPrimitiveToWrapper()))
				generatedCode += toWrapper + ".valueOf(";
			
			if (exp.getCastTo() != null) {
//				if (exp.isCastToPrimitive() && !"Boolean".equals(exp.getCastTo())) 	
//					generatedCode += "((java.lang.Number)";
//				else
				generatedCode += "((" + exp.getCastTo() + ")";
			}

			generatedCode += "get(";

			if (!"".equals(exp.getPostfix()))
				generatedCode += "\"" + exp.getPostfix() + "\", ";
			else
				generatedCode += "\"\", ";

			if (exp.getObject() != null)
				doSwitch(exp.getObject());
			else
				generatedCode += "obj";

			if (!exp.isObjectIsParam() && exp.getObject() == null) {
				generatedCode += ", \"itsRmofClass\"";
			}

			for (String feature : exp.getFeatures()) {
				generatedCode += ", \"" + feature + "\"";
			}

			generatedCode += ")";
			if (exp.getCastTo() != null) {
				generatedCode += ")";
			}

			if (exp.isCastToPrimitive() && exp.getCastToPrimitiveMethodCall() != null) {
				generatedCode += "." + exp.getCastToPrimitiveMethodCall();
			}
			if (null != toWrapper)
				generatedCode += ")";
			return exp;
		}

		@Override
		public T_ExpLevelA caseT_Set(T_Set exp) {

			String toWrapper = null;
			if (null != (toWrapper = exp.getPrimitiveToWrapper()))
				generatedCode += toWrapper + ".valueOf(";
			
			if (exp.getCastToPrimitiveMethodCall() != null) {
				generatedCode += "(";
			}

			if (exp.getCastTo() != null) {
//				if (exp.isCastToPrimitive() && !"Boolean".equals(exp.getCastTo())) 	
//					generatedCode += "(java.lang.Number)";
//				else
				generatedCode += "(" + exp.getCastTo() + ")";
			}

			generatedCode += "set(";

			if (exp.getObject() != null)
				doSwitch(exp.getObject());
			else
				generatedCode += "obj";

			generatedCode += ", ";

			exp.getValue().setCastToPrimitive(false);
			exp.getValue().setCastTo(null);
			exp.getValue().setCastToPrimitiveMethodCall(null);
			doSwitch(exp.getValue());

			if (!exp.isObjectIsParam() && exp.getObject() == null) {
				generatedCode += ", \"itsRmofClass\"";
			}

			for (String feature : exp.getFeatures()) {
				generatedCode += ", \"" + feature + "\"";
			}

			generatedCode += ")";
			if (exp.getCastTo() != null) {
				generatedCode += ")";
			}
			if (exp.getCastToPrimitiveMethodCall() != null) {
				generatedCode += "." + exp.getCastToPrimitiveMethodCall();
			}
			if (null != toWrapper)
				generatedCode += ")";
			return exp;
		}

		@Override
		public T_ExpLevelA caseT_ExtCall(T_ExtCall exp) {

			String toWrapper = null;
			if (null != (toWrapper = exp.getPrimitiveToWrapper()))
				generatedCode += toWrapper + ".valueOf(";
			
			if (exp.getCastTo() != null) {
//				if (exp.isCastToPrimitive() && !"Boolean".equals(exp.getCastTo())) 	
//					generatedCode += "((java.lang.Number)";
//				else
				generatedCode += "((" + exp.getCastTo() + ")";
			}
			if (exp.getObject() != null)
				doSwitch(exp.getObject());

			generatedCode += "." + exp.getMethodName() + "(";

			for (Iterator<T_ExpLevelA> iter = exp.getArguments().iterator(); iter.hasNext();) {
				doSwitch(iter.next());
				if (iter.hasNext())
					generatedCode += ", ";
			}
			if (exp.getCastTo() != null)
				generatedCode += ")";

			generatedCode += ")";

			if (exp.isCastToPrimitive() && !"Boolean".equals(exp.getCastTo()))
				generatedCode += "." + exp.getCastToPrimitiveMethodCall();
			if (null != toWrapper)
				generatedCode += ")";
			return exp;
		}

		@Override
		public T_ExpLevelA caseT_Literal(T_Literal exp) {
			
			String toWrapper = null;
			if (null != (toWrapper = exp.getPrimitiveToWrapper()))
				generatedCode += toWrapper + ".valueOf(";
			
			if (exp.getCastTo() != null && !"null".equals(exp.getValue()) && !"true".equals(exp.getValue())
					&& !"false".equals(exp.getValue()) && !exp.getValue().contains("\"")) {
				generatedCode += "((" + exp.getCastTo() + ")";
			}

			generatedCode += exp.getValue();

			if (exp.getCastTo() != null && !"null".equals(exp.getValue()) && !"true".equals(exp.getValue())
					&& !"false".equals(exp.getValue()) && !exp.getValue().contains("\"")) {
				generatedCode += ")";
			}
			
			if (null != toWrapper)
				generatedCode += ")";
			
			return exp;
		}

		@Override
		public T_ExpLevelA caseT_BinaryExp(T_BinaryExp exp) {

			String toWrapper = null;
			if (null != (toWrapper = exp.getPrimitiveToWrapper()))
				generatedCode += toWrapper + ".valueOf(";
				
			generatedCode += "(";

			doSwitch(exp.getLeftOperand());

			generatedCode += " " + exp.getOperator() + " ";

			doSwitch(exp.getRightOperand());

			generatedCode += ")";

			if (null != toWrapper)
				generatedCode += ")";
			
			return exp;
		}

		@Override
		public T_ExpLevelA caseT_InstanceOfExp(T_InstanceOfExp exp) {

			if (exp.isTypeIsExternal()) {

				doSwitch(exp.getExpression());
				generatedCode += " instanceof " + exp.getType();

			} else {

				generatedCode += "getPackageName(";
				doSwitch(exp.getExpression());
				generatedCode += ").equals(\"" + exp.getType() + "\")";

			}

			return exp;
		}

		@Override
		public T_ExpLevelA caseT_UnaryExp(T_UnaryExp exp) {

			String toWrapper = null;
			if (null != (toWrapper = exp.getPrimitiveToWrapper()))
				generatedCode += toWrapper + ".valueOf(";
			
			if (exp.getCastTo() != null) {
//				if (exp.isCastToPrimitive() && !"Boolean".equals(exp.getCastTo())) 	
//					generatedCode += "((java.lang.Number)";
//				else
				generatedCode += "((" + exp.getCastTo() + ")";
			}

			generatedCode += "(";

			generatedCode += exp.getOperator();

			doSwitch(exp.getObject());

			generatedCode += ")";

			if (exp.getCastTo() != null)
				generatedCode += ")";

			if (exp.isCastToPrimitive() && !"Boolean".equals(exp.getCastTo()))
				generatedCode += "." + exp.getCastToPrimitiveMethodCall();
			if (null != toWrapper)
				generatedCode += ")";
			return exp;
		}

		@Override
		public T_ExpLevelA caseT_CreateInstanceExp(T_CreateInstanceExp exp) {
			String toWrapper = null;
			if (null != (toWrapper = exp.getPrimitiveToWrapper()))
				generatedCode += toWrapper + ".valueOf(";
			
			generatedCode += "createInstance(\"" + exp.getTypeQualifiedName() + "\")";
			if (null != toWrapper)
				generatedCode += ")";
			return exp;
		}

		@Override
		public T_ExpLevelA caseT_ExtAttrCall(T_ExtAttrCall exp) {
			String toWrapper = null;
			if (null != (toWrapper = exp.getPrimitiveToWrapper()))
				generatedCode += toWrapper + ".valueOf(";
			
			if (exp.getCastTo() != null) {
//				if (exp.isCastToPrimitive() && !"Boolean".equals(exp.getCastTo())) 	
//					generatedCode += "((java.lang.Number)";
//				else
				generatedCode += "((" + exp.getCastTo() + ")";
			}
			doSwitch(exp.getObject());
			generatedCode += "." + exp.getAttributeName();
			if (exp.getCastTo() != null)
				generatedCode += ")";
			if (null != toWrapper)
				generatedCode += ")";
			return exp;
		}

		@Override
		public T_ExpLevelA caseT_GetInstancesOfExp(T_GetInstancesOfExp exp) {
			
			String toWrapper = null;
			if (null != (toWrapper = exp.getPrimitiveToWrapper()))
				generatedCode += toWrapper + ".valueOf(";

			generatedCode += "getInstancesOf(";

			generatedCode += exp.getClassName();

			generatedCode += ")";
			if (null != toWrapper)
				generatedCode += ")";

			return exp;
		}
		
		@Override
		public T_ExpLevelA caseT_GetInstances(T_GetInstances exp) {
			

			generatedCode += "getInstances(";

			for (Iterator iter = exp.getParameter().iterator();iter.hasNext();) {
				
				doSwitch((T_ExpLevelA)iter.next());
				
				if (iter.hasNext())
					generatedCode += ", ";
			}

			generatedCode += ")";


			return exp;
		}
		
		
		@Override
		public T_ExpLevelA caseT_CountFinalStates(T_CountFinalStates exp) {
			generatedCode += "countFinalStates(";
			for (Iterator iter = exp.getParameter().iterator();iter.hasNext();) {
				doSwitch((T_ExpLevelA)iter.next());
				if (iter.hasNext())
					generatedCode += ", ";
			}
			generatedCode += ")";
			return exp;
		}

		@Override
		public T_ExpLevelA caseT_CountInitialStates(T_CountInitialStates exp) {
			generatedCode += "countInitialStates(";
			for (Iterator iter = exp.getParameter().iterator();iter.hasNext();) {			
				doSwitch((T_ExpLevelA)iter.next());		
				if (iter.hasNext())
					generatedCode += ", ";
			}
			generatedCode += ")";
			return exp;
		}
		
		@Override
		public T_ExpLevelA caseT_CountInValidTransitions(T_CountInValidTransitions exp) {
			generatedCode += "countInValidTransitions(";
			for (Iterator iter = exp.getParameter().iterator();iter.hasNext();) {			
				doSwitch((T_ExpLevelA)iter.next());		
				if (iter.hasNext())
					generatedCode += ", ";
			}
			generatedCode += ")";
			return exp;
		}
		
		@Override
		public T_ExpLevelA caseT_CountReachableStates(T_CountReachableStates exp) {
			generatedCode += "countReachableStates(";
			for (Iterator iter = exp.getParameter().iterator();iter.hasNext();) {			
				doSwitch((T_ExpLevelA)iter.next());		
				if (iter.hasNext())
					generatedCode += ", ";
			}
			generatedCode += ")";
			return exp;
		}
		
		@Override
		public T_ExpLevelA caseT_CountStates(T_CountStates exp) {
			generatedCode += "countStates(";
			for (Iterator iter = exp.getParameter().iterator();iter.hasNext();) {			
				doSwitch((T_ExpLevelA)iter.next());		
				if (iter.hasNext())
					generatedCode += ", ";
			}
			generatedCode += ")";
			return exp;
		}
		
		@Override
		public T_ExpLevelA caseT_SetAbsoluteNodePropability(T_SetAbsoluteNodePropability exp) {
			generatedCode += "setAbsoluteNodePropability(";
			for (Iterator iter = exp.getParameter().iterator();iter.hasNext();) {			
				doSwitch((T_ExpLevelA)iter.next());		
				if (iter.hasNext())
					generatedCode += ", ";
			}
			generatedCode += ")";
			return exp;
		}
		
		@Override
		public T_ExpLevelA caseT_SetPopulationSize(T_SetPopulationSize exp) {
			generatedCode += "setPopulationSize(";
			for (Iterator iter = exp.getParameter().iterator();iter.hasNext();) {			
				doSwitch((T_ExpLevelA)iter.next());		
				if (iter.hasNext())
					generatedCode += ", ";
			}
			generatedCode += ")";
			return exp;
		}
		
		@Override
		public T_ExpLevelA caseT_GetLayerInformation(T_GetLayerInformation exp) {
			generatedCode += "getLayerInformation(";
			for (Iterator iter = exp.getParameter().iterator();iter.hasNext();) {			
				doSwitch((T_ExpLevelA)iter.next());		
				if (iter.hasNext())
					generatedCode += ", ";
			}
			generatedCode += ")";
			return exp;
		}
		
		@Override
		public T_ExpLevelA caseT_GetObjectManagement(T_GetObjectManagement exp) {
			generatedCode += "getObjectManagement(";
			for (Iterator iter = exp.getParameter().iterator();iter.hasNext();) {			
				doSwitch((T_ExpLevelA)iter.next());		
				if (iter.hasNext())
					generatedCode += ", ";
			}
			generatedCode += ")";
			return exp;
		}
		
		@Override
		public T_ExpLevelA caseT_LoadModel(T_LoadModel exp)
		{
			String toWrapper = null;
			if (null != (toWrapper = exp.getPrimitiveToWrapper()))
				generatedCode += toWrapper + ".valueOf(";
			
			generatedCode += "loadModel(";
			
			doSwitch(exp.getRelModelPath());
			
			generatedCode += ")";
			
			if (null != toWrapper)
				generatedCode += ")";

			return exp;
		}

		@Override
		public T_ExpLevelA caseT_SetReturn(T_SetReturn exp) {
			
			String toWrapper = null;
			if (null != (toWrapper = exp.getPrimitiveToWrapper()))
				generatedCode += toWrapper + ".valueOf(";

			generatedCode += "setReturnValue(";

			doSwitch(exp.getExpression());

			generatedCode += ")";
			if (null != toWrapper)
				generatedCode += ")";

			return exp;
		}

		@Override
		public T_ExpLevelA caseT_PrintExp(T_PrintExp exp) {
			
			String toWrapper = null;
			if (null != (toWrapper = exp.getPrimitiveToWrapper()))
				generatedCode += toWrapper + ".valueOf(";

			generatedCode += "print(";

			doSwitch(exp.getExpression());

			generatedCode += ")";
			if (null != toWrapper)
				generatedCode += ")";

			return exp;
		}

		@Override
		public T_ExpLevelA caseT_ExtConstructor(T_ExtConstructor exp) {
			
			String toWrapper = null;
			if (null != (toWrapper = exp.getPrimitiveToWrapper()))
				generatedCode += toWrapper + ".valueOf(";

			if (exp.getCastTo() != null) {
//				if (exp.isCastToPrimitive() && !"Boolean".equals(exp.getCastTo())) 	
//					generatedCode += "((java.lang.Number)";
//				else
				generatedCode += "((" + exp.getCastTo() + ")";
			}

			generatedCode += "new " + exp.getTypeQualifiedName() + "(";

			for (Iterator<T_ExpLevelA> iter = exp.getArguments().iterator(); iter.hasNext();) {
				doSwitch(iter.next());
				if (iter.hasNext())
					generatedCode += ", ";
			}

			generatedCode += ")";

			if (exp.getCastTo() != null)
				generatedCode += ")";

			if (exp.isCastToPrimitive() && !"Boolean".equals(exp.getCastTo()))
				generatedCode += "." + exp.getCastToPrimitiveMethodCall();
			if (null != toWrapper)
				generatedCode += ")";

			return exp;
		}

		@Override
		public T_ExpLevelA caseT_ExtType(T_ExtType exp) {
			String toWrapper = null;
			if (null != (toWrapper = exp.getPrimitiveToWrapper()))
				generatedCode += toWrapper + ".valueOf(";
			generatedCode += exp.getNewAttribute();
			if (null != toWrapper)
				generatedCode += ")";
			return exp;
		}

		@Override
		public T_ExpLevelA caseT_OpCall(T_OpCall exp) {

			if (exp.isHasINOUT()) {

				generatedCode += "{\n";
				generatedCode += "EList<InoutAdapter> inAdapters = new BasicEList<InoutAdapter>();\n";

				for (int argCnt = 0; argCnt < exp.getArguments().size(); argCnt++) {
					generatedCode += "Object argTmp" + argCnt
							+ " = inoutHelper(\"" + exp.getLastFeaturesName().get(argCnt) + "\", \"" + exp.getPostfix().get(argCnt) + "\"," + exp.getIsINOUT().get(argCnt) + ", inAdapters, new Function<Object, Object>() {\n";
					generatedCode += "\tpublic Object apply(Object notUsed) {\n";
					generatedCode += "\t\t return ";
					doSwitch(exp.getArguments().get(argCnt));
					generatedCode += ";\n\t}\n}, " + exp.isParam() + ");\n";
				}

				generatedCode += "opCall(";

				doSwitch(exp.getObject());
				
				if (exp.getTypeForMultiInheritance() != null)
					generatedCode += ", \"" + exp.getTypeForMultiInheritance() + "\"";
				else 
					generatedCode += ", null";

				generatedCode += ", \"" + exp.getOperationName() + "\"";

				generatedCode += ", inAdapters, null,";
				
				if (exp.getVarNamesForReturn() != null)
					generatedCode += "\"" + exp.getVarNamesForReturn() + "\"";
				else
					generatedCode += "null";
				
				for (int argCn = 0; argCn < exp.getArguments().size(); argCn++) {
					generatedCode += ", argTmp" + argCn; 
				}

				generatedCode += ");\n}";

			} else {

				generatedCode += "opCall(";

				if (exp.getObject() == null)
					generatedCode += "\"" + exp.getQualifiedNameOperation() + "\"";
				else
					doSwitch(exp.getObject());
					
				if (exp.getTypeForMultiInheritance() != null)
					generatedCode += ", \"" + exp.getTypeForMultiInheritance() + "\"";
				else 
					generatedCode += ", null";
				
				generatedCode += ", \"" + exp.getOperationName() + "\"";

				generatedCode += ", new BasicEList<InoutAdapter>(), null, ";

				if (exp.getVarNamesForReturn() != null)
					generatedCode += "\"" + exp.getVarNamesForReturn() + "\"";
				else
					generatedCode += "null";

				for (T_ExpLevelA arg : exp.getArguments()) {
					generatedCode += ", ";
					doSwitch(arg);
				}
				
				generatedCode += ")";

			}
			int index = 0;
			if (-1 != (index = generatedCode.indexOf("(java.util.List<util.Compareable>)"))) {
				generatedCode = generatedCode.substring(0, index) + generatedCode.substring(index + "(java.util.List<util.Compareable>)".length(), generatedCode.length());
			}
			return exp;
		}
		
		@Override
		public T_ExpLevelA caseT_GetEnumLiteral(T_GetEnumLiteral exp)
		{
			generatedCode += "getEnumLiteral(\"" + exp.getQualifiedEnumName() + "\", \"" + exp.getLiteralName() + "\")";

			return exp;
		}
		
		@Override
		public T_ExpLevelA caseT_ColorDFA(T_ColorDFA exp) {
			
			generatedCode += "colorDFA(";
			doSwitch(exp.getId());
			generatedCode += ".toString()" + ")";

			return exp;
		}
		
		@Override
		public T_ExpLevelA caseT_DesEventQueueConsume(T_DesEventQueueConsume exp)
		{
			generatedCode += "eventQueueConsume(";
			for (Iterator<T_ExpLevelA> iter = exp.getArguments().iterator(); iter.hasNext();) {
				doSwitch(iter.next());
				if (iter.hasNext())
					generatedCode += ", ";
			}
			generatedCode += ")";
			return exp;
		}
		
		@Override
		public T_ExpLevelA caseT_DesEventQueuePeek(T_DesEventQueuePeek exp)
		{
			generatedCode += "eventQueuePeek(";
			for (Iterator<T_ExpLevelA> iter = exp.getArguments().iterator(); iter.hasNext();) {
				doSwitch(iter.next());
				if (iter.hasNext())
					generatedCode += ", ";
			}
			generatedCode += ")";
			return exp;
		}
		
		@Override
		public T_ExpLevelA caseT_DesQueueConsume(T_DesQueueConsume exp)
		{
			generatedCode += "queueConsume(";
			for (Iterator<T_ExpLevelA> iter = exp.getArguments().iterator(); iter.hasNext();) {
				doSwitch(iter.next());
				if (iter.hasNext())
					generatedCode += ", ";
			}
			generatedCode += ")";
			return exp;
		}
		
		@Override
		public T_ExpLevelA caseT_DesQueuePeek(T_DesQueuePeek exp)
		{
			generatedCode += "queuePeek(";
			for (Iterator<T_ExpLevelA> iter = exp.getArguments().iterator(); iter.hasNext();) {
				doSwitch(iter.next());
				if (iter.hasNext())
					generatedCode += ", ";
			}
			generatedCode += ")";
			return exp;
		}
		
		@Override
		public T_ExpLevelA caseT_Type(T_Type exp) {
			String toWrapper = null;
			if (null != (toWrapper = exp.getPrimitiveToWrapper()))
				generatedCode += toWrapper + ".valueOf(";

			if (exp.getCastTo() != null) {
//				if (exp.isCastToPrimitive() && !"Boolean".equals(exp.getCastTo())) 	
//					generatedCode += "((java.lang.Number)";
//				else
				generatedCode += "((" + exp.getCastTo() + ")";
			}

			generatedCode += "getYClass(\"" + exp.getType() + "\")";


			if (exp.getCastTo() != null)
				generatedCode += ")";

			if (exp.isCastToPrimitive() && !"Boolean".equals(exp.getCastTo()))
				generatedCode += "." + exp.getCastToPrimitiveMethodCall();
			if (null != toWrapper)
				generatedCode += ")";

			return exp;
		}
		
		@Override
		public T_ExpLevelA caseT_GetInstanceForStaticAccess(T_GetInstanceForStaticAccess exp) {
			generatedCode += "getInstanceForStaticFeatureAccess(\"" + exp.getQualifiedClassName() + "\")";
			return exp;
		}

		@Override
		public T_ExpLevelA caseT_TimeStep(T_TimeStep exp) {
			String toWrapper = null;
			if (null != (toWrapper = exp.getPrimitiveToWrapper()))
				generatedCode += toWrapper + ".valueOf(";

			if (exp.getCastTo() != null) {
//				if (exp.isCastToPrimitive() && !"Boolean".equals(exp.getCastTo())) 	
//					generatedCode += "((java.lang.Number)";
//				else
				generatedCode += "((" + exp.getCastTo() + ")";
			}

			generatedCode += "timeStep()";

			if (exp.getCastTo() != null)
				generatedCode += ")";

			if (exp.isCastToPrimitive() && !"Boolean".equals(exp.getCastTo()))
				generatedCode += "." + exp.getCastToPrimitiveMethodCall();
			if (null != toWrapper)
				generatedCode += ")";

			return exp;
		}
		
		@Override
		public T_ExpLevelA caseT_ObserverAddValue(T_ObserverAddValue exp) {
			String toWrapper = null;
			if (null != (toWrapper = exp.getPrimitiveToWrapper()))
				generatedCode += toWrapper + ".valueOf(";

			if (exp.getCastTo() != null) {
//				if (exp.isCastToPrimitive() && !"Boolean".equals(exp.getCastTo())) 	
//					generatedCode += "((java.lang.Number)";
//				else
				generatedCode += "((" + exp.getCastTo() + ")";
			}
			generatedCode += "ObserverAddValue(";
			for (Iterator<T_ExpLevelA> iter = exp.getParameter().iterator(); iter.hasNext();) {
				doSwitch(iter.next());
				if (iter.hasNext())
					generatedCode += ", ";
			}
			generatedCode += ")";
			if (exp.getCastTo() != null)
				generatedCode += ")";

			if (exp.isCastToPrimitive() && !"Boolean".equals(exp.getCastTo()))
				generatedCode += "." + exp.getCastToPrimitiveMethodCall();
			if (null != toWrapper)
				generatedCode += ")";

			return exp;
		}
	}



