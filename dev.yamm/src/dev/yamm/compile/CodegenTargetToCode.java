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
package dev.yamm.compile;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

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
import targetAST.T_Type;
import targetAST.T_UnaryExp;
import targetAST.TargetASTRoot;

public class CodegenTargetToCode extends ModifiedTargetSwitch {

	private String generatedCode;

	public String generate(TargetASTRoot root) {

		return doSwitch(root.getExpression()).getCode() + ";";

	}

	
	@Override
	public T_ExpLevelA caseT_ExpLevelA(T_ExpLevelA object) {

		String code = "";

		String toWrapper = null;
		if (null != (toWrapper = object.getPrimitiveToWrapper()))
			code += toWrapper + ".valueOf(";

		if (object.getCastTo() != null) {
//			if (exp.isCastToPrimitive() && !"Boolean".equals(exp.getCastTo())) 	
//				code += "((java.lang.Number)";
//			else
			code += "((" + object.getCastTo() + ")";
		}

		code += object.getCode();
		
		if (object.getCastTo() != null) {
			code += ")";
		}
		
		if (object.isCastToPrimitive() && object.getCastToPrimitiveMethodCall() != null) {
			code += "." + object.getCastToPrimitiveMethodCall();
		}
		if (null != toWrapper)
			code += ")";

		object.setCode(code);

		return object;
	}

	@Override
	public T_ExpLevelA caseT_ExpLevelB(T_ExpLevelA object) {
		return object;
	}

	@Override
	public T_ExpLevelA caseT_Get(T_ExpLevelA exp) {

		T_Get t_Get = (T_Get) exp;
		String code = "";

		code += "get(";

		if (!"".equals(t_Get.getPostfix()))
			code += "\"" + t_Get.getPostfix() + "\", ";
		else
			code += "\"\", ";

		if (t_Get.getObject() != null)
			code += doSwitch(t_Get.getObject()).getCode();
		else
			code += "obj";

		if (!t_Get.isObjectIsParam() && t_Get.getObject() == null) {
			code += ", \"itsRmofClass\"";
		}

		for (String feature : t_Get.getFeatures()) {
			code += ", \"" + feature + "\"";
		}

		code += ")";

		exp.setCode(code);

		return exp;
	}

	@Override
	public T_ExpLevelA caseT_Set(T_ExpLevelA exp) {

		T_Set set = (T_Set) exp;
		String code = "";

		code += "set(";

		if (set.getObject() != null)
			doSwitch(exp.getObject());
		else
			code += "obj";

		code += ", ";

		set.getValue().setCastToPrimitive(false);
		set.getValue().setCastTo(null);
		set.getValue().setCastToPrimitiveMethodCall(null);
		code += doSwitch(set.getValue()).getCode();

		if (!set.isObjectIsParam() && set.getObject() == null) {
			code += ", \"itsRmofClass\"";
		}

		for (String feature : set.getFeatures()) {
			code += ", \"" + feature + "\"";
		}

		code += ")";

		exp.setCode(code);

		return exp;
	}

	@Override
	public T_ExpLevelA caseT_ExtCall(T_ExpLevelA exp) {

		T_ExtCall extCall = (T_ExtCall) exp;
		List<String> code = new ArrayList<>();

		if (extCall.getObject() != null)
			code.add(doSwitch(extCall.getObject()).getCode());

		code.add("." + extCall.getMethodName() + "(");

		extCall.getArguments().stream().map(arg -> {
			code.add(doSwitch(arg).getCode());
			return arg.getCode();
		}).collect(Collectors.joining(", "));

		code.add(")");

		exp.setCode(String.join("", code));

		return exp;
	}

	@Override
	public T_ExpLevelA caseT_Literal(T_ExpLevelA exp) {

		T_Literal literal = (T_Literal) exp;
		String code = "";

		code += literal.getValue();

		exp.setCode(code);
		
		return exp;
	}

	@Override
	public T_ExpLevelA caseT_BinaryExp(T_ExpLevelA exp) {

		String code = "";

		code += "(";

		code += doSwitch(((T_BinaryExp) exp).getLeftOperand()).getCode();

		code += " " + ((T_BinaryExp) exp).getOperator() + " ";

		code += doSwitch(((T_BinaryExp) exp).getRightOperand()).getCode();

		code += ")";

		exp.setCode(code);

		return exp;
	}

	@Override
	public T_ExpLevelA caseT_InstanceOfExp(T_ExpLevelA exp) {

		T_InstanceOfExp instanceOfExp = (T_InstanceOfExp) exp;

		String code = "";

		if (instanceOfExp.isTypeIsExternal()) {

			doSwitch(instanceOfExp.getExpression());
			code += " instanceof " + instanceOfExp.getType();

		} else {

			code += "getPackageName(";
			doSwitch(instanceOfExp.getExpression());
			code += ").equals(\"" + instanceOfExp.getType() + "\")";

		}

		exp.setCode(code);

		return exp;
	}

	@Override
	public T_ExpLevelA caseT_UnaryExp(T_ExpLevelA exp) {

		T_UnaryExp unaryExp = (T_UnaryExp) exp;

		exp.setCode("(" + unaryExp.getOperator() + doSwitch(exp.getObject()).getCode() + ")");

		return exp;
	}

	@Override
	public T_ExpLevelA caseT_CreateInstanceExp(T_ExpLevelA exp) {

		T_CreateInstanceExp createInstanceExp = (T_CreateInstanceExp) exp;

		exp.setCode("createInstance(\"" + createInstanceExp.getTypeQualifiedName() + "\")");

		return exp;
	}

	@Override
	public T_ExpLevelA caseT_ExtAttrCall(T_ExpLevelA exp) {

		exp.setCode(doSwitch(exp.getObject()).getCode() + "." + ((T_ExtAttrCall) exp).getAttributeName());

		return exp;
	}

	@Override
	public T_ExpLevelA caseT_GetInstancesOfExp(T_ExpLevelA exp) {

		exp.setCode("getInstancesOf(" + ((T_GetInstancesOfExp) exp).getClassName() + ")");

		return exp;
	}

	@Override
	public T_ExpLevelA caseT_GetInstances(T_ExpLevelA exp) {

		String code = "getInstances(";

		for (Iterator iter = ((T_GetInstances) exp).getParameter().iterator(); iter.hasNext();) {

			code += doSwitch((T_ExpLevelA) iter.next()).getCode();

			if (iter.hasNext())
				code += ", ";
		}

		code += ")";

		exp.setCode(code);
		
		return exp;
	}

	@Override
	public T_ExpLevelA caseT_GetLayerInformation(T_ExpLevelA exp) {
		
		T_GetLayerInformation getLayerInformation = (T_GetLayerInformation) exp;
		List<String> code = new ArrayList<>();
		
		code.add("getLayerInformation(");
		
		getLayerInformation.getParameter().stream().map(param -> {
			code.add(doSwitch(param).getCode());
			return param.getCode();
		}).collect(Collectors.joining(", "));

		code.add(")");
		
		exp.setCode(String.join("", code));

		return exp;
	}

	@Override
	public T_ExpLevelA caseT_CountFinalStates(T_ExpLevelA exp) {
		
		T_CountFinalStates countFinalStates = (T_CountFinalStates) exp;
		List<String> code = new ArrayList<>();
		
		code.add("countFinalStates(");
		
		countFinalStates.getParameter().stream().map(param -> {
			code.add(doSwitch(param).getCode());
			return param.getCode();
		}).collect(Collectors.joining(", "));

		code.add(")");
		
		exp.setCode(String.join("", code));

		return exp;
	}

	@Override
	public T_ExpLevelA caseT_CountInitialStates(T_ExpLevelA exp) {
		
		T_CountInitialStates countInitialStates = (T_CountInitialStates) exp;
		List<String> code = new ArrayList<>();
		
		code.add("countInitialStates(");
		
		countInitialStates.getParameter().stream().map(param -> {
			code.add(doSwitch(param).getCode());
			return param.getCode();
		}).collect(Collectors.joining(", "));

		code.add(")");
		
		exp.setCode(String.join("", code));

		return exp;
	}

	@Override
	public T_ExpLevelA caseT_CountInValidTransitions(T_ExpLevelA exp) {
		
		T_CountInValidTransitions countInValidTransitions = (T_CountInValidTransitions) exp;
		List<String> code = new ArrayList<>();
		
		code.add("countInValidTransitions(");
		
		countInValidTransitions.getParameter().stream().map(param -> {
			code.add(doSwitch(param).getCode());
			return param.getCode();
		}).collect(Collectors.joining(", "));

		code.add(")");
		
		exp.setCode(String.join("", code));
		
		return exp;
	}

	@Override
	public T_ExpLevelA caseT_CountReachableStates(T_ExpLevelA exp) {
		
		T_CountReachableStates countReachableStates = (T_CountReachableStates) exp;
		List<String> code = new ArrayList<>();
		
		code.add("countReachableStates(");
		
		countReachableStates.getParameter().stream().map(param -> {
			code.add(doSwitch(param).getCode());
			return param.getCode();
		}).collect(Collectors.joining(", "));

		code.add(")");
		
		exp.setCode(String.join("", code));
		
		return exp;
	}

	@Override
	public T_ExpLevelA caseT_CountStates(T_ExpLevelA exp) {
		
		T_CountStates countStates = (T_CountStates) exp;
		List<String> code = new ArrayList<>();
		
		code.add("countStates(");
		
		countStates.getParameter().stream().map(param -> {
			code.add(doSwitch(param).getCode());
			return param.getCode();
		}).collect(Collectors.joining(", "));

		code.add(")");
		
		exp.setCode(String.join("", code));
		
		return exp;
	}

	@Override
	public T_ExpLevelA caseT_SetAbsoluteNodePropability(T_ExpLevelA exp) {
		
		T_SetAbsoluteNodePropability setAbsoluteNodePropability = (T_SetAbsoluteNodePropability) exp;
		List<String> code = new ArrayList<>();
		
		code.add("setAbsoluteNodePropability(");
		
		setAbsoluteNodePropability.getParameter().stream().map(param -> {
			code.add(doSwitch(param).getCode());
			return param.getCode();
		}).collect(Collectors.joining(", "));

		code.add(")");
		
		exp.setCode(String.join("", code));
		
		return exp;
	}

	@Override
	public T_ExpLevelA caseT_SetPopulationSize(T_ExpLevelA exp) {
		
		T_SetPopulationSize setPopulationSize = (T_SetPopulationSize) exp;
		List<String> code = new ArrayList<>();
		
		code.add("setPopulationSize(");
		
		setPopulationSize.getParameter().stream().map(param -> {
			code.add(doSwitch(param).getCode());
			return param.getCode();
		}).collect(Collectors.joining(", "));

		code.add(")");
		
		exp.setCode(String.join("", code));
		
		return exp;
	}

	@Override
	public T_ExpLevelA caseT_GetObjectManagement(T_ExpLevelA exp) {
		
		T_GetObjectManagement getObjectManagement = (T_GetObjectManagement) exp;
		List<String> code = new ArrayList<>();
		
		code.add("getObjectManagement(");
		
		getObjectManagement.getParameter().stream().map(param -> {
			code.add(doSwitch(param).getCode());
			return param.getCode();
		}).collect(Collectors.joining(", "));

		code.add(")");
		
		exp.setCode(String.join("", code));
		
		return exp;
	}

	@Override
	public T_ExpLevelA caseT_LoadModel(T_ExpLevelA exp) {
		
		List<String> code = new ArrayList<>();
		
		code.add("loadModel(" + doSwitch(((T_LoadModel) exp).getRelModelPath()).getCode() + ")");

		exp.setCode(String.join("", code));
		
		return exp;
	}

	@Override
	public T_ExpLevelA caseT_SetReturn(T_ExpLevelA exp) {
	
		List<String> code = new ArrayList<>();
		
		code.add("setReturnValue(" + doSwitch(((T_SetReturn) exp).getExpression()).getCode() + ")");

		exp.setCode(String.join("", code));
		
		return exp;
	}

	@Override
	public T_ExpLevelA caseT_PrintExp(T_ExpLevelA exp) {

		List<String> code = new ArrayList<>();
		
		code.add("setReturnValue(" + doSwitch(((T_PrintExp) exp).getExpression()).getCode() + ")");

		exp.setCode(String.join("", code));
		
		return exp;
	}

	@Override
	public T_ExpLevelA caseT_ExtConstructor(T_ExpLevelA exp) {

		T_ExtConstructor extConstructor = (T_ExtConstructor) exp;
		List<String> code = new ArrayList<>();
		
		code.add("new " + extConstructor.getTypeQualifiedName() + "(");
		
		extConstructor.getArguments().stream().map(arg -> {
			code.add(doSwitch(arg).getCode());
			return arg.getCode();
		}).collect(Collectors.joining(", "));

		code.add(")");
		
		exp.setCode(String.join("", code));

		return exp;
	}

	@Override
	public T_ExpLevelA caseT_ExtType(T_ExpLevelA exp) {

		exp.setCode(((T_ExtType) exp).getNewAttribute());

		return exp;
	}

	@Override
	public T_ExpLevelA caseT_OpCall(T_ExpLevelA exp) {
		T_OpCall opCall = (T_OpCall) exp;
		List<String> code = new ArrayList<>();
		
		if (opCall.isHasINOUT()) {

			code.add("{\n");
			code.add("EList<InoutAdapter> inAdapters = new BasicEList<InoutAdapter>();\n");

			for (int argCnt = 0; argCnt < opCall.getArguments().size(); argCnt++) {
				code.add("Object argTmp" + argCnt + " = inoutHelper(\"" + opCall.getLastFeaturesName().get(argCnt)
						+ "\", \"" + opCall.getPostfix().get(argCnt) + "\"," + opCall.getIsINOUT().get(argCnt)
						+ ", inAdapters, new Function<Object, Object>() {\n");
				code.add("\tpublic Object apply(Object notUsed) {\n");
				code.add("\t\t return ");
				doSwitch(opCall.getArguments().get(argCnt));
				code.add(";\n\t}\n}, " + opCall.isParam() + ");\n");
			}

			code.add("opCall(");

			doSwitch(opCall.getObject());

			if (opCall.getTypeForMultiInheritance() != null)
				code.add(", \"" + opCall.getTypeForMultiInheritance() + "\"");
			else
				code.add(", null");

			code.add(", \"" + opCall.getOperationName() + "\"");

			code.add(", inAdapters, null,");

			if (opCall.getVarNamesForReturn() != null)
				code.add("\"" + opCall.getVarNamesForReturn() + "\"");
			else
				code.add("null");

			for (int argCn = 0; argCn < opCall.getArguments().size(); argCn++) {
				code.add(", argTmp" + argCn);
			}

			code.add(");\n}");

		} else {

			code.add("opCall(");

			if (opCall.getObject() == null)
				code.add("\"" + opCall.getQualifiedNameOperation() + "\"");
			else
				doSwitch(opCall.getObject());

			if (opCall.getTypeForMultiInheritance() != null)
				code.add(", \"" + opCall.getTypeForMultiInheritance() + "\"");
			else
				code.add(", null");

			code.add(", \"" + opCall.getOperationName() + "\"");

			code.add(", new BasicEList<InoutAdapter>(), null, ");

			if (opCall.getVarNamesForReturn() != null)
				code.add("\"" + opCall.getVarNamesForReturn() + "\"");
			else
				code.add("null");

			for (T_ExpLevelA arg : opCall.getArguments()) {
				code.add(", ");
				doSwitch(arg);
			}

			code.add(")");

		}
		
		String codeString = String.join("", code);
		int index = 0;
		if (-1 != (index = codeString.indexOf("(java.util.List<util.Compareable>)"))) {
			codeString = codeString.substring(0, index) + generatedCode
					.substring(index + "(java.util.List<util.Compareable>)".length(), generatedCode.length());
		}
		
		exp.setCode(codeString);
		
		return exp;
	}

	@Override
	public T_ExpLevelA caseT_GetEnumLiteral(T_ExpLevelA exp) {

		T_GetEnumLiteral getEnumLiteral = (T_GetEnumLiteral) exp;
		List<String> code = new ArrayList<>();
		
		code.add("getEnumLiteral(\"" + getEnumLiteral.getQualifiedEnumName() + "\", \"" + getEnumLiteral.getLiteralName() + "\")");

		exp.setCode(String.join("", code));
		
		return exp;
	}

	@Override
	public T_ExpLevelA caseT_ColorDFA(T_ExpLevelA exp) {

		List<String> code = new ArrayList<>();
		
		code.add("colorDFA(" + doSwitch(((T_ColorDFA) exp).getId()).getCode() + ".toString()" + ")");
		
		exp.setCode(String.join("", code));
		
		return exp;
	}

	@Override
	public T_ExpLevelA caseT_DesEventQueueConsume(T_ExpLevelA exp) {
		
		T_DesEventQueueConsume desEventQueueConsume = (T_DesEventQueueConsume) exp;
		List<String> code = new ArrayList<>();
		
		code.add("eventQueueConsume(");
		
		desEventQueueConsume.getArguments().stream().map(arg -> {
			code.add(doSwitch(arg).getCode());
			return arg.getCode();
		}).collect(Collectors.joining(", "));

		code.add(")");
		
		exp.setCode(String.join("", code));
		
		return exp;
		
	}

	@Override
	public T_ExpLevelA caseT_DesEventQueuePeek(T_ExpLevelA exp) {
		
		T_DesEventQueuePeek desEventQueuePeek = (T_DesEventQueuePeek) exp;
		List<String> code = new ArrayList<>();
		
		code.add("eventQueuePeek(");
		
		desEventQueuePeek.getArguments().stream().map(arg -> {
			code.add(doSwitch(arg).getCode());
			return arg.getCode();
		}).collect(Collectors.joining(", "));

		code.add(")");
		
		exp.setCode(String.join("", code));
		
		return exp;
	}

	@Override
	public T_ExpLevelA caseT_DesQueueConsume(T_ExpLevelA exp) {
		
		T_DesQueueConsume desQueueConsume = (T_DesQueueConsume) exp;
		List<String> code = new ArrayList<>();
		
		code.add("queueConsume(");
		
		desQueueConsume.getArguments().stream().map(arg -> {
			code.add(doSwitch(arg).getCode());
			return arg.getCode();
		}).collect(Collectors.joining(", "));

		code.add(")");
		
		exp.setCode(String.join("", code));
		
		return exp;
	}

	@Override
	public T_ExpLevelA caseT_DesQueuePeek(T_ExpLevelA exp) {
		
		T_DesQueuePeek desQueuePeek = (T_DesQueuePeek) exp;
		List<String> code = new ArrayList<>();
		
		code.add("queuePeek(");
		
		desQueuePeek.getArguments().stream().map(arg -> {
			code.add(doSwitch(arg).getCode());
			return arg.getCode();
		}).collect(Collectors.joining(", "));

		code.add(")");
		
		exp.setCode(String.join("", code));
		
		return exp;
	}

	@Override
	public T_ExpLevelA caseT_Type(T_ExpLevelA exp) {

		exp.setCode("getYClass(\"" + ((T_Type) exp).getType() + "\")");

		return exp;
	}

	@Override
	public T_ExpLevelA caseT_TimeStep(T_ExpLevelA exp) {
		
		exp.setCode("timeStep()");

		return exp;
	}

	@Override
	public T_ExpLevelA caseT_ObserverAddValue(T_ExpLevelA exp) {

		
		T_ObserverAddValue observerAddValue = (T_ObserverAddValue) exp;
		List<String> code = new ArrayList<>();
		
		code.add("ObserverAddValue(");
		
		code.add(observerAddValue.getParameter().stream().map(param -> {
			doSwitch(param).getCode();
			return param.getCode();
		}).collect(Collectors.joining(", ")));

		
		code.add(")");
		
		exp.setCode(String.join("", code));

		return exp;
	}
}

