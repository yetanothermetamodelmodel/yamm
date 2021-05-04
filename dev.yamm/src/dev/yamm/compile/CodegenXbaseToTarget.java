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
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmConstructor;
import org.eclipse.xtext.common.types.JvmEnumerationLiteral;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmPrimitiveType;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeConstraint;
import org.eclipse.xtext.common.types.JvmTypeParameter;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmUpperBound;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.eclipse.xtext.xbase.XAssignment;
import org.eclipse.xtext.xbase.XBinaryOperation;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XBooleanLiteral;
import org.eclipse.xtext.xbase.XCastedExpression;
import org.eclipse.xtext.xbase.XConstructorCall;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.XInstanceOfExpression;
import org.eclipse.xtext.xbase.XMemberFeatureCall;
import org.eclipse.xtext.xbase.XNullLiteral;
import org.eclipse.xtext.xbase.XNumberLiteral;
import org.eclipse.xtext.xbase.XPostfixOperation;
import org.eclipse.xtext.xbase.XStringLiteral;
import org.eclipse.xtext.xbase.XUnaryOperation;
import org.eclipse.xtext.xbase.XbasePackage;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;
import org.eclipse.xtext.xbase.util.XbaseSwitch;

import com.google.common.collect.Lists;

import dev.yamm.ChartManagement;
import dev.yamm.coreModelXmi.yamm.YClass;
import dev.yamm.coreModelXmi.yamm.YColorDFAObject;
import dev.yamm.coreModelXmi.yamm.YCountFinalStates;
import dev.yamm.coreModelXmi.yamm.YCountInValidTransitions;
import dev.yamm.coreModelXmi.yamm.YCountInitialStates;
import dev.yamm.coreModelXmi.yamm.YCountReachableStates;
import dev.yamm.coreModelXmi.yamm.YCountStates;
import dev.yamm.coreModelXmi.yamm.YFeatureCall;
import dev.yamm.coreModelXmi.yamm.YGetInstances;
import dev.yamm.coreModelXmi.yamm.YGetInstancesOfExpression;
import dev.yamm.coreModelXmi.yamm.YGetLayerInformation;
import dev.yamm.coreModelXmi.yamm.YGetObjectManagement;
import dev.yamm.coreModelXmi.yamm.YLoadModel;
import dev.yamm.coreModelXmi.yamm.YMemberFeatureCall;
import dev.yamm.coreModelXmi.yamm.YObject;
import dev.yamm.coreModelXmi.yamm.YObserverAddValue;
import dev.yamm.coreModelXmi.yamm.YOperation;
import dev.yamm.coreModelXmi.yamm.YPackage;
import dev.yamm.coreModelXmi.yamm.YParameter;
import dev.yamm.coreModelXmi.yamm.YParameterDirectionKind;
import dev.yamm.coreModelXmi.yamm.YPrintExpression;
import dev.yamm.coreModelXmi.yamm.YSetAbsoluteNodePropability;
import dev.yamm.coreModelXmi.yamm.YSetPopulationSize;
import dev.yamm.coreModelXmi.yamm.YSetReturnValue;
import dev.yamm.coreModelXmi.yamm.YTimeStep;
import dev.yamm.coreModelXmi.yamm.util.YammSwitch;
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
import targetAST.T_ExpLevelB;
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
import targetAST.TargetASTFactory;
import targetAST.TargetASTRoot;


public class CodegenXbaseToTarget extends YammSwitch {
	
	public ChartManagement chartManagement;

	private TargetASTFactory targetFactory = TargetASTFactory.eINSTANCE;

	private TargetASTRoot targetRoot;

	private Stack<StateMemberCall> stateMemberCallStack;

	private T_OpCall opACallWithAssignment;
	private YOperation constCallOperationWithAssignmet;

	public IJvmModelAssociations jvmModelAssociations;

	public IQualifiedNameProvider qualifiedNameProvider;

	private int tmpVariableCnt;

	private boolean simpleFC = false;
	
	private boolean isDesEventQueue;
	
	public CodegenXbaseToTarget(ChartManagement chartManagement) {
		this.chartManagement = chartManagement;
	}

	public TargetASTRoot generateRoot(XExpression exp) {

		tmpVariableCnt = 0;
		stateMemberCallStack = new Stack<StateMemberCall>();

		if (jvmModelAssociations == null || qualifiedNameProvider == null) {
			jvmModelAssociations = chartManagement.resourceManagement.jvmModelAssociations;
			qualifiedNameProvider = chartManagement.resourceManagement.qualifiedNameProvider;
		}

		targetRoot = targetFactory.createTargetASTRoot();
		try {
			targetRoot.setExpression((T_ExpLevelA) doSwitch(exp));
		} catch (Exception e) {
			e.printStackTrace();
		}

		return targetRoot;
	}

	XbaseSwitchHelper xbaseSwitchHelper = new XbaseSwitchHelper();

	class XbaseSwitchHelper extends XbaseSwitch {

		@Override
		public Object caseXBinaryOperation(XBinaryOperation exp) {

			T_BinaryExp tBinary = targetFactory.createT_BinaryExp();

			int begin = exp.toString().indexOf(">");
			int end = exp.toString().lastIndexOf("<");
			tBinary.setOperator(exp.toString().substring(begin + 1, end).trim());

			tBinary.setLeftOperand((T_ExpLevelA) CodegenXbaseToTarget.this.doSwitch(exp.getLeftOperand()));
			tBinary.setRightOperand((T_ExpLevelA) CodegenXbaseToTarget.this.doSwitch(exp.getRightOperand()));

			setExplicitCast(tBinary, exp);
			return tBinary;
		}

		@Override
		public Object caseXAssignment(XAssignment exp) {

			T_Set tSet = targetFactory.createT_Set();

			// opCall?
			Object opCallFeatureCall = getOpCallFeatureCall(exp.getValue());

			if (opCallFeatureCall == null) { // kein opCall

				if (exp.getAssignable() != null)
					tSet.setObject((T_ExpLevelB) CodegenXbaseToTarget.this.doSwitch(exp.getAssignable()));
				tSet.setValue((T_ExpLevelA) CodegenXbaseToTarget.this.doSwitch(exp.getValue()));
				tSet.getFeatures().add(exp.getFeature().getSimpleName());

				if (exp.getFeature() instanceof JvmFormalParameter)
					tSet.setObjectIsParam(true);

				return tSet;

			}
			else 
			{ // OpCall mit Zuweisung
				// varNames zusammensatzen:
				T_OpCall tOpCall = (opACallWithAssignment = targetFactory.createT_OpCall());
				List<String> VarNamesAssign = new ArrayList<String>();
				XExpression assignable;

				if ((assignable = exp.getAssignable()) != null) {

					VarNamesAssign.add(exp.getFeature().getSimpleName());

					while (assignable instanceof XMemberFeatureCall) {

						VarNamesAssign.add(((XMemberFeatureCall) assignable).getFeature().getSimpleName());

						assignable = ((XMemberFeatureCall) assignable).getMemberCallTarget();
						while (assignable instanceof XCastedExpression)
							assignable = ((XCastedExpression) assignable).getTarget();

					}
					if (!"this".contentEquals(assignable.toString()))
						VarNamesAssign.add(((XFeatureCall) assignable).getFeature().getSimpleName());

					if (!(((XFeatureCall) assignable).getFeature() instanceof JvmFormalParameter))
						VarNamesAssign.add("itsRmofClass");

				} else {

					VarNamesAssign.add(exp.getFeature().getSimpleName());
					if (!(exp.getFeature() instanceof JvmFormalParameter))
						VarNamesAssign.add("itsRmofClass");

				}

				Collections.reverse(VarNamesAssign);
				String varNamesForReturn = "";
				for (Iterator<String> iter = VarNamesAssign.iterator(); iter.hasNext();) {
					varNamesForReturn += iter.next();
					if (iter.hasNext())
						varNamesForReturn += ".";
				}
				opACallWithAssignment.setVarNamesForReturn(varNamesForReturn);

				if (opCallFeatureCall instanceof YOperation)
					constCallOperationWithAssignmet = (YOperation) opCallFeatureCall;
				else
					constCallOperationWithAssignmet = null;
				// value auswerten

				CodegenXbaseToTarget.this.doSwitch(exp.getValue());

				opACallWithAssignment = null;
				return tOpCall;
			}
		}

		@Override
		public Object caseXBooleanLiteral(XBooleanLiteral exp) {
			T_Literal tLiteral = targetFactory.createT_Literal();
			tLiteral.setValue(((XBooleanLiteral) exp).isIsTrue() ? "true" : "false");
			return tLiteral;
		}

		@Override
		public Object caseXCastedExpression(XCastedExpression exp) {
			return CodegenXbaseToTarget.this.doSwitch(exp.getTarget());
		}

		@Override
		public Object caseXConstructorCall(XConstructorCall exp) {

			if (null != jvmModelAssociations.getPrimarySourceElement(exp.getConstructor().eContainer())) 
			{	
				EObject yClassOrOperation = null;
				if (null != (yClassOrOperation = jvmModelAssociations.getPrimarySourceElement((exp).getConstructor())))
				{
					if (yClassOrOperation instanceof YOperation)
					{
						if (ignoreCast(exp.eContainer()) instanceof XAssignment)
						{
							T_OpCall tOpCall = opACallWithAssignment;
							initializeOpCallConstructor(exp, tOpCall, yClassOrOperation);
							String qualifiedName = getQualifiedNameYClass((YClass) ((YOperation) yClassOrOperation).eContainer());
							tOpCall.setQualifiedNameOperation(qualifiedName);
							return tOpCall;
						}
						else
						{
							T_OpCall tOpCall = targetFactory.createT_OpCall();							
							initializeOpCallConstructor(exp, tOpCall, yClassOrOperation);
							String qualifiedName = getQualifiedNameYClass((YClass) ((YOperation) yClassOrOperation).eContainer());
							tOpCall.setQualifiedNameOperation(qualifiedName);
							return tOpCall;
						}
					}
				}
				
				T_CreateInstanceExp tCreate = targetFactory.createT_CreateInstanceExp();
				tCreate.setTypeQualifiedName(exp.getConstructor().getQualifiedName());
				setExplicitCast(tCreate, exp);
				return tCreate;

			} else {

				T_ExtConstructor tCreate = targetFactory.createT_ExtConstructor();
				tCreate.setTypeQualifiedName(exp.getConstructor().getQualifiedName());

				for (XExpression ArgXExp : exp.getArguments()) {
					tCreate.getArguments().add((T_ExpLevelA) CodegenXbaseToTarget.this.doSwitch(ArgXExp));
				}

				if (!exp.getArguments().isEmpty())
					castArgumentsExtConstuctorCall(tCreate, exp);

				setExplicitCast(tCreate, exp);
				return tCreate;
			}

		}

		@Override
		public Object caseXUnaryOperation(XUnaryOperation exp) {

			T_UnaryExp tUnary = targetFactory.createT_UnaryExp();

			tUnary.setOperator(exp.toString().substring(0, exp.toString().indexOf("<")).trim());

			tUnary.setObject((T_ExpLevelA) CodegenXbaseToTarget.this.doSwitch(exp.getOperand()));

			if (tUnary.getObject() instanceof T_Get || tUnary.getObject() instanceof T_Set
					|| tUnary.getObject() instanceof T_ExtCall ) {

				if (!"!".equals(tUnary.getOperator())) {

					tUnary.getObject().setCastTo("java.lang.Number");
					tUnary.getObject().setCastToPrimitiveMethodCall("intValue()");
					tUnary.getObject().setCastToPrimitive(true);

				} else {

					tUnary.getObject().setCastTo("java.lang.Boolean");
					tUnary.getObject().setCastToPrimitiveMethodCall("booleanValue()");
					tUnary.getObject().setCastToPrimitive(true);

				}
			}

			return tUnary;
		}

		@Override
		public Object caseXNumberLiteral(XNumberLiteral exp) {
			T_Literal tLiteral = targetFactory.createT_Literal();
			tLiteral.setValue(exp.getValue());
			setExplicitCast(tLiteral, exp);
			return tLiteral;
		}

		@Override
		public Object caseXInstanceOfExpression(XInstanceOfExpression exp) {

			T_InstanceOfExp tInstanceof = targetFactory.createT_InstanceOfExp();
			tInstanceof.setExpression((T_ExpLevelA) CodegenXbaseToTarget.this.doSwitch(exp.getExpression()));
			tInstanceof.setType(exp.getType().getIdentifier());
			
			if (null == jvmModelAssociations.getPrimarySourceElement(exp.getType().getType())) {
					tInstanceof.setTypeIsExternal(true);
					return tInstanceof;
			}

			tInstanceof.setTypeIsExternal(false);
			return tInstanceof;
		}

		@Override
		public Object caseXNullLiteral(XNullLiteral object) {
			T_Literal tLiteral = targetFactory.createT_Literal();
			tLiteral.setValue("null");
			return tLiteral;
		}

		@Override
		public Object caseXStringLiteral(XStringLiteral exp) {
			T_Literal tLiteral = targetFactory.createT_Literal();
			tLiteral.setValue("\"" + exp.getValue() + "\"");
			return tLiteral;
		}

		@Override
		public Object caseXPostfixOperation(XPostfixOperation exp) {
			return CodegenXbaseToTarget.this.doSwitch(exp.getOperand());
		}

		@Override
		public Object defaultCase(EObject object) {
			return super.defaultCase(object);
		}

	}

	public T_ExtCall creatTExtCall(XAbstractFeatureCall exp) {

		T_ExtCall tExtCall = targetFactory.createT_ExtCall();
		
		tExtCall.setMethodName(exp.getFeature().getSimpleName());

		List<XExpression> arguments;
		if (exp instanceof YMemberFeatureCall)
			arguments = ((YMemberFeatureCall) exp).getMemberCallArguments();
		else
			arguments = exp.getActualArguments();
		for (XExpression ArgXExp : arguments) {
			tExtCall.getArguments().add((T_ExpLevelA) CodegenXbaseToTarget.this.doSwitch(ArgXExp));
		}

		if (!arguments.isEmpty())
			castArgumentsExtCall(tExtCall, exp);

		return tExtCall;
	}

	public Object getOpCallFeatureCall(XExpression value) {

		while (value instanceof XCastedExpression)
			value = ((XCastedExpression) value).getTarget();

		EObject yConstrutorOperatrion;
		if (value instanceof XConstructorCall 
				&& null != (yConstrutorOperatrion = jvmModelAssociations.getPrimarySourceElement(((XConstructorCall) value).getConstructor())))
		{
			if (yConstrutorOperatrion instanceof YOperation)
				return yConstrutorOperatrion;
			return null;
		}
		
		if (!(value instanceof XFeatureCall || value instanceof XMemberFeatureCall))
			return null;

		JvmIdentifiableElement feature = ((XAbstractFeatureCall) value).getFeature();

		if (!(feature instanceof JvmOperation))
			return null;

		EObject sourceElement = jvmModelAssociations.getPrimarySourceElement(feature);

		if (sourceElement == null
				|| ("DES.EventQueue.consume(int,boolean,YClass,RObject,YClass)".equals(feature.getIdentifier()))
				|| ("DES.EventQueue.peek(int,boolean,YClass,RObject,YClass)".equals(feature.getIdentifier()))
				
				|| ("DES.Queue.consume(java.lang.Object)".equals(feature.getIdentifier()))
				|| ("DES.Queue.peek(java.lang.Object)".equals(feature.getIdentifier()))) 
		{		
				return null; // externer Methodenaufruf
		}


		// es ist ein opCall

		return (XAbstractFeatureCall) value;
	}

	private void castArgumentsExtCall(T_ExtCall tExtCall, XAbstractFeatureCall exp) {

		castArguments(tExtCall.getArguments(), ((JvmOperation) exp.getFeature()).getParameters());

	}

	private void castArgumentsExtConstuctorCall(T_ExtConstructor tExtConstructorCall, XConstructorCall exp) {

		castArguments(tExtConstructorCall.getArguments(), exp.getConstructor().getParameters());

	}

	private void castArguments(List<T_ExpLevelA> tArguments, List<JvmFormalParameter> jvmParameters) {

		java.util.Iterator<T_ExpLevelA> tArgIter = tArguments.iterator();
		java.util.Iterator<JvmFormalParameter> xArgIter = jvmParameters.iterator();

		while (tArgIter.hasNext()) {
			T_ExpLevelA tArg = tArgIter.next();
			JvmFormalParameter xArg = null;
			try
			{
				xArg = xArgIter.next();
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
			

			if (tArg.getCastTo() == null && !(tArg instanceof T_BinaryExp) && !(tArg instanceof T_UnaryExp)) {
				EObject type = xArg.getParameterType().getType();
				if (type instanceof JvmTypeParameter) {
					EList<JvmTypeConstraint> constraints = ((JvmTypeParameter) type).getConstraints();
					JvmUpperBound upper = null;
					for (JvmTypeConstraint constraint : constraints) {
						if (constraint instanceof JvmUpperBound)
							upper = (JvmUpperBound) constraint;
					}
					if (upper != null) {
						type = upper.getTypeReference().getType();
					} else {
						return;
					}
				}
				if (type instanceof JvmGenericType) {
					String typeName = ((JvmGenericType) type).getIdentifier();
					if (!"java.lang.Object".equals(typeName))
						tArg.setCastTo(typeName);
				}
			}

		}

	}

	public T_Get createTGet(XAbstractFeatureCall exp, List<String> features, XExpression xExpLastFeature) {

		T_Get tGet = targetFactory.createT_Get();

		tGet.getFeatures().addAll(features);

		if (jvmModelAssociations.getSourceElements(exp.getFeature()) instanceof YParameter)
			tGet.setObjectIsParam(true);
		else
			tGet.setObjectIsParam(false);

		// cast
		EObject castExp = xExpLastFeature;
		while (castExp.eContainer() != null && castExp.eContainer() instanceof XCastedExpression) {
			castExp = castExp.eContainer();
		}
		if (castExp != xExpLastFeature) {
			// zu wrapper oder zu primitv casten
			String castIdentifier = ((XCastedExpression) castExp).getType().getType().getIdentifier();
			if ("java.lang.Integer".equals(castIdentifier) || "java.lang.Double".equals(castIdentifier)
					|| "java.lang.Boolean".equals(castIdentifier)) {
				tGet.setCastTo(castIdentifier);
			} else if ("int".equals(castIdentifier)) {
				tGet.setCastTo("java.lang.Number");
				tGet.setCastToPrimitive(true);
				tGet.setCastToPrimitiveMethodCall("intValue()");
			} else if ("double".equals(castIdentifier)) {
				tGet.setCastTo("java.lang.Number");
				tGet.setCastToPrimitive(true);
				tGet.setCastToPrimitiveMethodCall("doubleValue()");
			} else if ("boolean".equals(castIdentifier)) {
				tGet.setCastTo("java.lang.Boolean");
				tGet.setCastToPrimitive(true);
				tGet.setCastToPrimitiveMethodCall("booleanValue()");
			} else {
				setExplicitCast(tGet, exp);
			}
		} else {
			// immer zu primitiv casten wenn lastFeature primitiv ist
			if (((XAbstractFeatureCall) xExpLastFeature).getFeature() instanceof JvmField
					|| ((XAbstractFeatureCall) xExpLastFeature).getFeature() instanceof JvmFormalParameter) {
				JvmType jvmTypeLastFeature = null;
				if (((XAbstractFeatureCall) xExpLastFeature).getFeature() instanceof JvmField) {
					jvmTypeLastFeature = ((JvmField) ((XAbstractFeatureCall) xExpLastFeature).getFeature()).getType()
							.getType();
				} else {
					jvmTypeLastFeature = ((JvmFormalParameter) ((XAbstractFeatureCall) xExpLastFeature).getFeature())
							.getParameterType().getType();
				}
				if (jvmTypeLastFeature instanceof JvmPrimitiveType) {
					if ("int".equals(jvmTypeLastFeature.getSimpleName()) ||
							"double".equals(jvmTypeLastFeature.getSimpleName()) ||
							"boolean".equals(jvmTypeLastFeature.getSimpleName())) 
					{
						tGet.setCastTo("boolean".equals(jvmTypeLastFeature.getSimpleName()) ? "java.lang.Boolean" : "java.lang.Number");
						tGet.setCastToPrimitive(true);
						tGet.setCastToPrimitiveMethodCall(jvmTypeLastFeature.getSimpleName() + "Value()");
					}
				}
			}
		}

		if (xExpLastFeature.eContainer() instanceof XPostfixOperation) {
			String simpleName = ((XPostfixOperation) xExpLastFeature.eContainer()).getFeature().getSimpleName();
			if ("operator_plusPlus".equals(simpleName))
				tGet.setPostfix("++");
			else
				tGet.setPostfix("--");
		}

		return tGet;
	}

	public T_Get createTGet(XFeatureCall exp, String... features) {
		return createTGet(exp, Arrays.asList(features), exp);
	}

	private boolean setExplicitCast(T_ExpLevelA targetObj, EObject exp) {

		if (exp.eContainer() instanceof XCastedExpression) {

			while (exp.eContainer() != null && exp.eContainer() instanceof XCastedExpression) {
				exp = exp.eContainer();
			}
			
			JvmTypeReference typeRef = ((XCastedExpression) exp).getType();
			if("java.util.List".equals(typeRef.getType().getIdentifier())
					&& typeRef instanceof JvmParameterizedTypeReference) {
				for(JvmTypeReference o : ((JvmParameterizedTypeReference) typeRef).getArguments()) {
					if (null != jvmModelAssociations.getPrimarySourceElement(o.getType())) {
						return false;
//						TODO: zu externetypen casten!
					}
				}
			}
			if (null != jvmModelAssociations.getPrimarySourceElement(typeRef.getType())) {
				return false;
//				TODO: zu externetypen casten!
			}

			boolean targetIsCasted = targetObj.getCastTo() != null ? true : false;
			boolean targetIsCastedToPrimitive = targetObj.isCastToPrimitive() == true ? true : false;
			boolean targetIsLiteral = targetObj instanceof T_Literal ? true : false;
			boolean targetIsBinary = targetObj instanceof T_BinaryExp ? true : false; // gibt immer primitiv zur�ck

			String castIdentifier = ((XCastedExpression) exp).getType().getIdentifier();
			

			if ("double".equals(castIdentifier) ||
					"int".equals(castIdentifier) ||
					"float".equals(castIdentifier) ||
					"long".equals(castIdentifier) ||
					"boolean".equals(castIdentifier))
			{
				if (targetIsBinary || targetIsLiteral || targetIsCastedToPrimitive)
					targetObj.setCastTo(castIdentifier);
				else {
					targetObj.setCastToPrimitive(true);
					targetObj.setCastTo("java.lang.Number");
					targetObj.setCastToPrimitiveMethodCall(castIdentifier + "Value()");
				}	
			}
			else if ("java.lang.Double".equals(castIdentifier) ||
					"java.lang.Float".equals(castIdentifier) ||
					"java.lang.Long".equals(castIdentifier) ||
					"java.lang.Boolean".equals(castIdentifier)) {
				if (targetIsBinary || targetIsLiteral || targetIsCastedToPrimitive)
					targetObj.setPrimitiveToWrapper(castIdentifier);
//				else 
//					TODO
			} 
			else if ("java.lang.Integer".equals(castIdentifier)) 
			{
				if (targetIsBinary || targetIsLiteral || targetIsCastedToPrimitive)
					targetObj.setPrimitiveToWrapper("java.lang.Integer");
//				else 
//					TODO
			} 
			else 
			{
				targetObj.setCastTo(castIdentifier);
			}

			return true;
		}
		return false;
	}

	private EObject ignoreCast(EObject exp) {

		while (exp.eContainer() != null && exp.eContainer() instanceof XCastedExpression) {
			exp = exp.eContainer();
		}

		return exp;
	}

	@Override
	public Object caseYGetLayerInformation(YGetLayerInformation exp) {
		T_GetLayerInformation tGetLayerInformation = targetFactory.createT_GetLayerInformation();

		for (XExpression paramExp : exp.getParameter()) {
			tGetLayerInformation.getParameter().add((T_ExpLevelA) doSwitch(paramExp));
		}
		return tGetLayerInformation;
	}
	
	@Override
	public Object caseYLoadModel(YLoadModel exp)
	{
		T_LoadModel tLoadModel = targetFactory.createT_LoadModel();
		tLoadModel.setRelModelPath((T_ExpLevelA) doSwitch(exp.getRelModelPath()));
		return tLoadModel;
	}
	
	@Override
	public Object caseYGetObjectManagement(YGetObjectManagement exp) {
		T_GetObjectManagement tGetObjectManagement = targetFactory.createT_GetObjectManagement();

		for (XExpression paramExp : exp.getParameter()) {
			tGetObjectManagement.getParameter().add((T_ExpLevelA) doSwitch(paramExp));
		}
		return tGetObjectManagement;
	}
	
	@Override
	public Object caseYPrintExpression(YPrintExpression exp) {
		T_PrintExp tPrint = targetFactory.createT_PrintExp();
		tPrint.setExpression((T_ExpLevelA) doSwitch(exp.getExpression()));
		return tPrint;
	}
	
	@Override
	public Object caseYColorDFAObject(YColorDFAObject exp) {
		T_ColorDFA tColorDFA = targetFactory.createT_ColorDFA();
		tColorDFA.setId((T_ExpLevelA) doSwitch(exp.getId()));
		return tColorDFA;
	}

	@Override
	public Object caseYGetInstances(YGetInstances exp) {
		T_GetInstances tGetInstances = targetFactory.createT_GetInstances();

		for (XExpression paramExp : exp.getParameter()) {
			tGetInstances.getParameter().add((T_ExpLevelA) doSwitch(paramExp));
		}
		return tGetInstances;
	}
	
	@Override
	public Object caseYGetInstancesOfExpression(YGetInstancesOfExpression exp) {
		T_GetInstancesOfExp tGetInstOf = targetFactory.createT_GetInstancesOfExp();
		tGetInstOf.setClassName("\"" + qualifiedNameProvider.getFullyQualifiedName(exp.getClazz()) + "\"");
		return tGetInstOf;
	}
	
	@Override
	public Object caseYCountFinalStates(YCountFinalStates exp) {
		T_CountFinalStates tGetInstances = targetFactory.createT_CountFinalStates();

		for (XExpression paramExp : exp.getParameter()) {
			tGetInstances.getParameter().add((T_ExpLevelA) doSwitch(paramExp));
		}
		return tGetInstances;
	}

	@Override
	public Object caseYCountInitialStates(YCountInitialStates exp) {
		T_CountInitialStates tCountInitalStates = targetFactory.createT_CountInitialStates();

		for (XExpression paramExp : exp.getParameter()) {
			tCountInitalStates.getParameter().add((T_ExpLevelA) doSwitch(paramExp));
		}
		return tCountInitalStates;
	}
	
	@Override
	public Object caseYCountInValidTransitions(YCountInValidTransitions exp) {
		T_CountInValidTransitions tCountInValidTransitions = targetFactory.createT_CountInValidTransitions();

		for (XExpression paramExp : exp.getParameter()) {
			tCountInValidTransitions.getParameter().add((T_ExpLevelA) doSwitch(paramExp));
		}
		return tCountInValidTransitions;
	}
	
	@Override
	public Object caseYCountReachableStates(YCountReachableStates exp) {
		T_CountReachableStates tCountReachableStates = targetFactory.createT_CountReachableStates();

		for (XExpression paramExp : exp.getParameter()) {
			tCountReachableStates.getParameter().add((T_ExpLevelA) doSwitch(paramExp));
		}
		return tCountReachableStates;
	}

	@Override
	public Object caseYCountStates(YCountStates exp) {
		T_CountStates tCountStates = targetFactory.createT_CountStates();

		for (XExpression paramExp : exp.getParameter()) {
			tCountStates.getParameter().add((T_ExpLevelA) doSwitch(paramExp));
		}
		return tCountStates;
	}
	
	@Override
	public Object caseYSetAbsoluteNodePropability(YSetAbsoluteNodePropability exp) {
		T_SetAbsoluteNodePropability tSetAbsoluteNodePropability = targetFactory.createT_SetAbsoluteNodePropability();

		for (XExpression paramExp : exp.getParameter()) {
			tSetAbsoluteNodePropability.getParameter().add((T_ExpLevelA) doSwitch(paramExp));
		}
		return tSetAbsoluteNodePropability;
	}

	@Override
	public Object caseYObserverAddValue(YObserverAddValue exp) {
		T_ObserverAddValue tObserverAddValue = targetFactory.createT_ObserverAddValue();
		for (XExpression paramExp : exp.getParameter()) {
			tObserverAddValue.getParameter().add((T_ExpLevelA) doSwitch(paramExp));
		}
		return tObserverAddValue;
	}
	
	@Override
	public Object caseYSetPopulationSize(YSetPopulationSize exp) {
		T_SetPopulationSize tSetPopulationSize = targetFactory.createT_SetPopulationSize();

		for (XExpression paramExp : exp.getParameter()) {
			tSetPopulationSize.getParameter().add((T_ExpLevelA) doSwitch(paramExp));
		}
		return tSetPopulationSize;
	}
	
	@Override
	public Object caseYTimeStep(YTimeStep exp) 
	{
		T_TimeStep tTimeStep = targetFactory.createT_TimeStep();	
		return tTimeStep;
	}

	@Override
	public Object caseYSetReturnValue(YSetReturnValue exp) {
		T_SetReturn tSetReturn = targetFactory.createT_SetReturn();
		tSetReturn.setExpression((T_ExpLevelA) doSwitch(exp.getValue()));
		return tSetReturn;
	}

	@Override
	public Object defaultCase(EObject object) {
		return xbaseSwitchHelper.doSwitch(object);
	}
	
	@Override
	public Object caseYMemberFeatureCall(YMemberFeatureCall exp) {
		XExpression memberCallTarget = exp.getMemberCallTarget();
		boolean evalMemberCallTarget = true;
		T_ExpLevelA ret = null;

		T_Get tGet = null;
		T_ExtCall tExtCall = null;
		T_OpCall tOpCall = null;

		if (ignoreCast(exp).eContainer() instanceof XAssignment
				|| ignoreCast(exp).eContainer() instanceof XBlockExpression
				|| ignoreCast(exp).eContainer() instanceof XBinaryOperation
				|| ignoreCast(exp).eContainer() instanceof YPrintExpression
				|| ignoreCast(exp).eContainer() instanceof XInstanceOfExpression
				|| ignoreCast(exp).eContainer() instanceof YSetReturnValue
				|| exp.eContainer() instanceof XPostfixOperation
				|| ignoreCast(exp).eContainer() instanceof XUnaryOperation
				|| ignoreCast(exp)
						.eContainingFeature() == XbasePackage.Literals.XMEMBER_FEATURE_CALL__MEMBER_CALL_ARGUMENTS
				|| ignoreCast(exp).eContainingFeature() == XbasePackage.Literals.XCONSTRUCTOR_CALL__ARGUMENTS
				|| ignoreCast(exp).eContainingFeature() == XbasePackage.Literals.XFEATURE_CALL__FEATURE_CALL_ARGUMENTS
				|| ignoreCast(exp).eContainer() instanceof YColorDFAObject) {

			stateMemberCallStack.push(new StateMemberCall());

		}


		if (exp.getFeature() instanceof JvmEnumerationLiteral)
		{
			evalMemberCallTarget = false;
			String enumQualifiedName = ((XAbstractFeatureCall) exp.getMemberCallTarget()).getFeature().getIdentifier();
			String literalName = exp.getFeature().getSimpleName();
			
			T_GetEnumLiteral t_getEnumLiteral = targetFactory.createT_GetEnumLiteral();
			t_getEnumLiteral.setQualifiedEnumName(enumQualifiedName);
			t_getEnumLiteral.setLiteralName(literalName);
			ret = t_getEnumLiteral;
		}
		else if (exp.getFeature() instanceof JvmField) {

			stateMemberCallStack.peek().featureNames.add(exp.getFeature().getSimpleName());
			if (stateMemberCallStack.peek().xExpLastFeature == null)
				stateMemberCallStack.peek().xExpLastFeature = exp;

		} else if (exp.getFeature() instanceof JvmOperation) {

			EObject yammSourceOperation;
			if (null != (yammSourceOperation = jvmModelAssociations.getPrimarySourceElement(exp.getFeature()))) {
				if ("DES.EventQueue.consume(int,boolean,YClass,RObject,YClass)".equals(exp.getFeature().getIdentifier()))
				{
					T_DesEventQueueConsume tDesEQConsume = targetFactory.createT_DesEventQueueConsume();
					for (XExpression xArg : exp.getMemberCallArguments())
					{
						tDesEQConsume.getArguments().add((T_ExpLevelA) doSwitch(xArg));
					}
					evalMemberCallTarget = false;
					ret = tDesEQConsume;
					if (!stateMemberCallStack.peek().featureNames.isEmpty()) {

						tGet = createTGet(exp, Lists.reverse(stateMemberCallStack.peek().featureNames),
								stateMemberCallStack.peek().xExpLastFeature);

						tGet.setObject(tDesEQConsume);
						stateMemberCallStack.peek().featureNames.clear();
						stateMemberCallStack.peek().xExpLastFeature = null;

					}
				}
				else if ("DES.EventQueue.peek(int,boolean,YClass,RObject,YClass)".equals(exp.getFeature().getIdentifier()))
				{
					T_DesEventQueuePeek tDesEQPeek = targetFactory.createT_DesEventQueuePeek();
					for (XExpression xArg : exp.getMemberCallArguments())
					{
						tDesEQPeek.getArguments().add((T_ExpLevelA) doSwitch(xArg));
					}
					evalMemberCallTarget = false;
					ret = tDesEQPeek;
					if (!stateMemberCallStack.peek().featureNames.isEmpty()) {

						tGet = createTGet(exp, Lists.reverse(stateMemberCallStack.peek().featureNames),
								stateMemberCallStack.peek().xExpLastFeature);

						tGet.setObject(tDesEQPeek);
						stateMemberCallStack.peek().featureNames.clear();
						stateMemberCallStack.peek().xExpLastFeature = null;

					}
				}
				else if ("DES.Queue.consume(java.lang.Object)".equals(exp.getFeature().getIdentifier()))
				{
					T_DesQueueConsume tDesQConsume = targetFactory.createT_DesQueueConsume();
					for (XExpression xArg : exp.getMemberCallArguments())
					{
						tDesQConsume.getArguments().add((T_ExpLevelA) doSwitch(xArg));
					}
					evalMemberCallTarget = false;
					ret = tDesQConsume;
					
					tDesQConsume.getArguments().add((T_ExpLevelA) doSwitch(exp.getMemberCallTarget()));
				}
				else if ("DES.Queue.peek(java.lang.Object)".equals(exp.getFeature().getIdentifier()))
				{
					T_DesQueuePeek tDesQPeek = targetFactory.createT_DesQueuePeek();
					for (XExpression xArg : exp.getMemberCallArguments())
					{
						tDesQPeek.getArguments().add((T_ExpLevelA) doSwitch(xArg));
					}
					evalMemberCallTarget = false;
					ret = tDesQPeek;

					tDesQPeek.getArguments().add((T_ExpLevelA) doSwitch(exp.getMemberCallTarget()));
				}
				else
				{
					// opCall,; kein MFC/FC folgt
					if (opACallWithAssignment != null) {
						// mit Assignment
						tOpCall = opACallWithAssignment;
					} else {
						// ohne Assigment
						tOpCall = targetFactory.createT_OpCall();
					}

					initializeOpCall(exp, tOpCall, yammSourceOperation);
				}
			} else {
				tExtCall = creatTExtCall(exp);

				if (!stateMemberCallStack.peek().featureNames.isEmpty()) {

					tGet = createTGet(exp, Lists.reverse(stateMemberCallStack.peek().featureNames),
							stateMemberCallStack.peek().xExpLastFeature);

					tGet.setObject(tExtCall);
					stateMemberCallStack.peek().featureNames.clear();
					stateMemberCallStack.peek().xExpLastFeature = null;

				}
			}

		} else if (exp.getFeature() instanceof JvmGenericType
				&& null == jvmModelAssociations.getPrimarySourceElement(exp.getFeature())) {

			// ext static
			while (memberCallTarget instanceof XAbstractFeatureCall
					&& ((XAbstractFeatureCall) memberCallTarget).getFeature() == exp.getFeature()) {
				if (memberCallTarget instanceof XMemberFeatureCall) {
					memberCallTarget = ((XMemberFeatureCall) memberCallTarget).getMemberCallTarget();
				} else if (memberCallTarget instanceof XFeatureCall) {
					evalMemberCallTarget = false;
					if (!stateMemberCallStack.peek().featureNames.isEmpty()) {
						T_ExtAttrCall tExtAtr = targetFactory.createT_ExtAttrCall();
						tExtAtr.setAttributeName(stateMemberCallStack.peek().featureNames
								.get(stateMemberCallStack.peek().featureNames.size() - 1));
						stateMemberCallStack.peek().featureNames.clear();
						stateMemberCallStack.peek().xExpLastFeature = null;
						T_ExtType tExtType = targetFactory.createT_ExtType();
						tExtType.setNewAttribute(exp.getFeature().getIdentifier());
						tExtAtr.setObject(tExtType);
						ret = tExtAtr;
					} else {
						T_ExtType tExtType = targetFactory.createT_ExtType();
						tExtType.setNewAttribute(exp.getFeature().getIdentifier());
						ret = tExtType;
					}
					break;
				} else {
					// TODO:
//					System.err.println("ERROR1");
				}
			}

		} else {
			// TODO:
//			System.err.println("ERROR2");
		}

		if (evalMemberCallTarget) {

			ret = (T_ExpLevelA) CodegenXbaseToTarget.this.doSwitch(memberCallTarget);

			if (tExtCall != null) {

				String type = ((JvmGenericType) exp.getFeature().eContainer()).getIdentifier();
				ret.setCastTo(type);
				if ("java.util.List".equals(type) && exp.eContainer() instanceof XBinaryOperation)
				{
					boolean castToGenericType = true;
					if (exp.getFeature() instanceof JvmOperation
							&& ((JvmOperation) exp.getFeature()).getReturnType() instanceof JvmParameterizedTypeReference)
					{
						JvmParameterizedTypeReference typeRef = (JvmParameterizedTypeReference) ((JvmOperation) exp.getFeature()).getReturnType();					
						String returnTypeSimpleName = typeRef.getSimpleName();
						if (!"E".equals(returnTypeSimpleName))
						{
							castToGenericType = false;						
						}
					}
					
					if (castToGenericType) // only primitve types: Integer, Double, Float
					if (exp.getMemberCallTarget()  instanceof XAbstractFeatureCall) {
						JvmIdentifiableElement jvmElement = ((XAbstractFeatureCall) exp.getMemberCallTarget()).getFeature();;
						if (jvmElement instanceof JvmField) {
							if (((JvmField) jvmElement).getType() instanceof JvmParameterizedTypeReference)
							{
								if (!((JvmParameterizedTypeReference) ((JvmField) jvmElement).getType()).getArguments().isEmpty())
								{
									JvmTypeReference genericType = ((JvmParameterizedTypeReference) ((JvmField) jvmElement).getType()).getArguments().get(0);
									if ("java.lang.Integer".equals(genericType.getIdentifier()))
									{
										tExtCall.setCastTo("java.lang.Number");
										tExtCall.setCastToPrimitive(true);
										tExtCall.setCastToPrimitiveMethodCall("int"  + "Value()");
									}
									else if ("java.lang.Double".equals(genericType.getIdentifier()))
									{
										tExtCall.setCastTo("java.lang.Number");
										tExtCall.setCastToPrimitive(true);
										tExtCall.setCastToPrimitiveMethodCall("double"  + "Value()");
									}
									else if ("java.lang.Float".equals(genericType.getIdentifier()))
									{
										tExtCall.setCastTo("java.lang.Number");
										tExtCall.setCastToPrimitive(true);
										tExtCall.setCastToPrimitiveMethodCall("float"  + "Value()");
									}	
								}
							}			
						}			
					}

				}
				tExtCall.setObject(ret);
				if (tExtCall.eContainer() != null) {
					return tGet;
				}
				// tExtCall.setCastTo(((JvmGenericType)
				// exp.getFeature().eContainer()).getIdentifier());
				setExplicitCast(tExtCall, exp);
				return tExtCall;

			} else if (tOpCall != null) {
				tOpCall.setObject(ret);
				return tOpCall;
			}

			return ret;

		} else {
			return ret;
		}
	}

	@Override
	public Object caseYFeatureCall(YFeatureCall exp) {
		T_ExpLevelA targetObj = null;

		if (simpleFC == false && ignoreCast(exp).eContainer() instanceof XMemberFeatureCall && ignoreCast(exp)
				.eContainingFeature() == XbasePackage.Literals.XMEMBER_FEATURE_CALL__MEMBER_CALL_TARGET) {
			// a.b.c --> ende einer reihe von XMFCs + XFC, exp bezieht sich auf a

			if (exp.getFeature() instanceof JvmField) {

				stateMemberCallStack.peek().featureNames.add(exp.getFeature().getSimpleName());
				if (stateMemberCallStack.peek().xExpLastFeature == null)
					stateMemberCallStack.peek().xExpLastFeature = exp;
				targetObj = createTGet(exp, Lists.reverse(stateMemberCallStack.peek().featureNames),
						stateMemberCallStack.peek().xExpLastFeature);

			} else if (exp.getFeature() instanceof JvmOperation) {
				// TODO: OpCall, erst m�glich wenn man den r�ckgabewert direkt verwenden kann...
				T_ExtCall tExtCall = creatTExtCall(exp);
				tExtCall.setObject(createTGet(exp));
				setExplicitCast(tExtCall, exp);
				targetObj = tExtCall;

			} else if (exp.getFeature() instanceof JvmFormalParameter) {

				stateMemberCallStack.peek().featureNames.add(exp.getFeature().getSimpleName());
				if (stateMemberCallStack.peek().xExpLastFeature == null)
					stateMemberCallStack.peek().xExpLastFeature = exp;
				targetObj = createTGet(exp, Lists.reverse(stateMemberCallStack.peek().featureNames),
						stateMemberCallStack.peek().xExpLastFeature);
				((T_Get) targetObj).setObjectIsParam(true);

			} else if (null == jvmModelAssociations.getPrimarySourceElement(exp.getFeature())) { // static external

				T_ExtType tExtType = targetFactory.createT_ExtType();
				tExtType.setNewAttribute(exp.getFeature().getSimpleName());
				targetObj = tExtType;

			}
			else if (exp.toString().startsWith("this ")) 
			{
				// this
				if (stateMemberCallStack.peek().featureNames.isEmpty())
					targetObj = createTGet(exp);
				else
					targetObj = createTGet(exp, Lists.reverse(stateMemberCallStack.peek().featureNames),
							stateMemberCallStack.peek().xExpLastFeature);				
			}
			else if (!stateMemberCallStack.peek().featureNames.isEmpty() 
					&& "yClass".equals(stateMemberCallStack.peek().featureNames.get(stateMemberCallStack.peek().featureNames.size() - 1))) {
				T_Type tType = targetFactory.createT_Type();
				tType.setType(exp.getFeature().getIdentifier());
				targetObj = tType;
			}
			else if (exp.getFeature() instanceof JvmGenericType)
			{
				// static
				stateMemberCallStack.peek().featureNames.add(exp.getFeature().getSimpleName());
				if (stateMemberCallStack.peek().xExpLastFeature == null)
					stateMemberCallStack.peek().xExpLastFeature = exp;
				List<String> features = Lists.reverse(stateMemberCallStack.peek().featureNames);
				features.remove(0);
				targetObj = createTGet(exp, features,
						stateMemberCallStack.peek().xExpLastFeature);
				
				T_GetInstanceForStaticAccess tGetInstance = targetFactory.createT_GetInstanceForStaticAccess();
				tGetInstance.setQualifiedClassName(exp.getFeature().getIdentifier());
				targetObj.setObject(tGetInstance);
			}
			else
			{
				// error
				System.err.println("error");
				if (stateMemberCallStack.peek().featureNames.isEmpty())
					targetObj = createTGet(exp);
				else
					targetObj = createTGet(exp, Lists.reverse(stateMemberCallStack.peek().featureNames),
							stateMemberCallStack.peek().xExpLastFeature);		
			}
			stateMemberCallStack.pop();

		} else {

			if (simpleFC == true)
				simpleFC = false;

			if (exp.getFeature() instanceof JvmField) {
				// zb. guard {bool;}

				targetObj = createTGet(exp, exp.getFeature().getSimpleName());

			} else if (exp.getFeature() instanceof JvmOperation) {

				if (null != jvmModelAssociations.getPrimarySourceElement(exp.getFeature())) {
					T_OpCall tOpCall;
					// opCall
					if (opACallWithAssignment != null) {
						// mit Assignment
						tOpCall = opACallWithAssignment;
					} else {
						// ohne Assigment
						tOpCall = targetFactory.createT_OpCall();
					}

					initializeOpCall(exp, tOpCall, jvmModelAssociations.getPrimarySourceElement(exp.getFeature()));
//					tOpCall.setOperationName(exp.getFeature().getSimpleName());
//					for (XExpression xArg : exp.getFeatureCallArguments()) {
//						tOpCall.getArguments().add((T_ExpLevelA) CodegenXbaseToTarget.this.doSwitch(xArg));
//					}
					tOpCall.setObject(createTGet(exp));
					targetObj = tOpCall;

				} else if (exp.getImplicitReceiver() != null) {
					T_ExtCall tExtCall = creatTExtCall(exp);
					tExtCall.setObject(createTGet(exp));
					targetObj = tExtCall;
					setExplicitCast(tExtCall, exp);
				} else {
					T_ExtCall tExtCall = creatTExtCall(exp);
					T_ExtType tExtType = targetFactory.createT_ExtType();
					tExtType.setNewAttribute(((JvmGenericType) exp.getFeature().eContainer()).getIdentifier());
					tExtCall.setObject(tExtType);
					targetObj = tExtCall;
					setExplicitCast(tExtCall, exp);
				}

			} 
			else if (exp.toString().startsWith("this "))
			{
				targetObj = createTGet(exp);
			}
			else if (exp.getFeature() instanceof JvmGenericType)
			{
				// static
				T_GetInstanceForStaticAccess tGetInstance = targetFactory.createT_GetInstanceForStaticAccess();
				tGetInstance.setQualifiedClassName(exp.getFeature().getIdentifier());
				targetObj = tGetInstance;
			}
			else if (exp.getFeature() instanceof JvmFormalParameter) { // TODO: Parameter

				targetObj = createTGet(exp, exp.getFeature().getSimpleName());
				((T_Get) targetObj).setObjectIsParam(true);

			} else { // error

				System.out.println("error");
				targetObj = createTGet(exp);

			}

		}

		return targetObj;
	}
	
	
	private void initializeOpCall(XAbstractFeatureCall exp, T_OpCall tOpCall, EObject yammSourceOperation) {
		tOpCall.setOperationName(exp.getFeature().getSimpleName());

		Iterator<YParameter> rParamIter = ((YOperation) yammSourceOperation).getOwnedParameter().iterator();
		Iterator<XExpression> xParamIter;
		if (exp instanceof XMemberFeatureCall)
			xParamIter = ((XMemberFeatureCall) exp).getMemberCallArguments().iterator();
		else
			xParamIter = ((XFeatureCall) exp).getFeatureCallArguments().iterator();

		for (YParameter rParam : ((YOperation) yammSourceOperation).getOwnedParameter()) {
			if (rParam.getDirection().equals(YParameterDirectionKind.INOUT))
				tOpCall.setHasINOUT(true);
		}
		
		if (exp instanceof YMemberFeatureCall) {
			if (((YMemberFeatureCall) exp).getInheritanceType() != null) {
				tOpCall.setTypeForMultiInheritance(((YMemberFeatureCall) exp).getInheritanceType().getIdentifier());
			}
		} else if (exp instanceof YFeatureCall) {
			if (((YFeatureCall) exp).getInheritanceType() != null) {
				tOpCall.setTypeForMultiInheritance(((YFeatureCall) exp).getInheritanceType().getIdentifier());
			}
		}
		if (tOpCall.isHasINOUT()) {
			while (xParamIter.hasNext()) {
				XExpression xParam = xParamIter.next();
				YParameter rParam = rParamIter.next();
				if (rParam.getDirection().equals(YParameterDirectionKind.INOUT)) {
					tOpCall.getIsINOUT().add(true);
					// TODO: typ herausfinden(explizite cast und typ der varable) und in tOpCall
					// speichern f�r Operationsauswahle zur compilezeit
					while (xParam instanceof XCastedExpression)
						xParam = ((XCastedExpression) xParam).getTarget();

					if (xParam instanceof XPostfixOperation) {
						if ("operator_plusPlus".equals(((XPostfixOperation) xParam).getFeature().getSimpleName()))
							tOpCall.getPostfix().add("++");
						else
							tOpCall.getPostfix().add("--");
						xParam = ((XPostfixOperation) xParam).getOperand();
					} else {
						tOpCall.getPostfix().add("");
					}

					if (xParam instanceof XMemberFeatureCall
							&& ((XMemberFeatureCall) xParam).getFeature() instanceof JvmField
							&& null != jvmModelAssociations
									.getPrimarySourceElement(((XMemberFeatureCall) xParam).getFeature())) {

						tOpCall.getLastFeaturesName()
								.add(((JvmField) ((XMemberFeatureCall) xParam).getFeature()).getSimpleName());

						
						XExpression callTarget = ((XMemberFeatureCall) xParam).getMemberCallTarget();
						while (callTarget instanceof XCastedExpression)
							callTarget = ((XCastedExpression) callTarget).getTarget();

						if (callTarget instanceof XMemberFeatureCall) {

							stateMemberCallStack.push(new StateMemberCall());
							tOpCall.getArguments().add((T_ExpLevelA) CodegenXbaseToTarget.this.doSwitch(callTarget));
							stateMemberCallStack.peek().featureNames.clear();
							stateMemberCallStack.peek().xExpLastFeature = null;

						} else if (callTarget instanceof XFeatureCall) {

							simpleFC = true;
							tOpCall.getArguments().add((T_ExpLevelA) CodegenXbaseToTarget.this.doSwitch(callTarget));

						} else {
							// TODO: assigment (a = b).c
//							System.err.println("ERROR8");
						}

					} else if (xParam instanceof XFeatureCall
							&& (((XFeatureCall) xParam).getFeature() instanceof JvmField
									|| ((XFeatureCall) xParam).getFeature() instanceof JvmFormalParameter)
							&& null != jvmModelAssociations
									.getPrimarySourceElement(((XFeatureCall) xParam).getFeature())) {
						tOpCall.getLastFeaturesName().add(((XFeatureCall) xParam).getFeature().getSimpleName());
						if (((XFeatureCall) xParam).getFeature() instanceof JvmFormalParameter) {
							tOpCall.setParam(true);
							T_Get tGetForParamAsParam = targetFactory.createT_Get();
							tGetForParamAsParam.setObjectIsParam(true);
							tOpCall.getArguments().add(tGetForParamAsParam);
						} else {
							tOpCall.getArguments().add((T_ExpLevelA) createTGet(
									(XFeatureCall) ((XFeatureCall) xParam).getImplicitReceiver()));
						}

					} else {
						System.err.println("ERROR - wrong INOUT param");
					}

				} else {
					tOpCall.getIsINOUT().add(false);
					tOpCall.getPostfix().add("");
					tOpCall.getLastFeaturesName().add("");
					tOpCall.getArguments().add((T_ExpLevelA) CodegenXbaseToTarget.this.doSwitch(xParam));
				}
//							tOpCall.getArguments().add((T_ExpLevelA) CodegenXbaseToTarget.this.doSwitch(xParam));
			}
		} else {
			while (xParamIter.hasNext()) {
				XExpression xParam = xParamIter.next();
				tOpCall.getArguments().add((T_ExpLevelA) CodegenXbaseToTarget.this.doSwitch(xParam));
			}
		}
	}
	
	private void initializeOpCallConstructor(XConstructorCall exp, T_OpCall tOpCall, EObject yammSourceOperation) {
		JvmConstructor jvmConst = exp.getConstructor();
		tOpCall.setOperationName(jvmConst.getSimpleName());

		Iterator<YParameter> rParamIter = ((YOperation) yammSourceOperation).getOwnedParameter().iterator();
		Iterator<XExpression> xParamIter = exp.getArguments().iterator();

		for (YParameter rParam : ((YOperation) yammSourceOperation).getOwnedParameter()) {
			if (rParam.getDirection().equals(YParameterDirectionKind.INOUT))
				tOpCall.setHasINOUT(true);
		}
		
		if (tOpCall.isHasINOUT()) {
			while (xParamIter.hasNext()) {
				XExpression xParam = xParamIter.next();
				YParameter rParam = rParamIter.next();
				if (rParam.getDirection().equals(YParameterDirectionKind.INOUT)) {
					tOpCall.getIsINOUT().add(true);
					// TODO: typ herausfinden(explizite cast und typ der varable) und in tOpCall
					// speichern f�r Operationsauswahle zur compilezeit
					while (xParam instanceof XCastedExpression)
						xParam = ((XCastedExpression) xParam).getTarget();

					if (xParam instanceof XPostfixOperation) {
						if ("operator_plusPlus".equals(((XPostfixOperation) xParam).getFeature().getSimpleName()))
							tOpCall.getPostfix().add("++");
						else
							tOpCall.getPostfix().add("--");
						xParam = ((XPostfixOperation) xParam).getOperand();
					} else {
						tOpCall.getPostfix().add("");
					}

					if (xParam instanceof XMemberFeatureCall
							&& ((XMemberFeatureCall) xParam).getFeature() instanceof JvmField
							&& null != jvmModelAssociations
									.getPrimarySourceElement(((XMemberFeatureCall) xParam).getFeature())) {

						tOpCall.getLastFeaturesName()
								.add(((JvmField) ((XMemberFeatureCall) xParam).getFeature()).getSimpleName());

						
						XExpression callTarget = ((XMemberFeatureCall) xParam).getMemberCallTarget();
						while (callTarget instanceof XCastedExpression)
							callTarget = ((XCastedExpression) callTarget).getTarget();

						if (callTarget instanceof XMemberFeatureCall) {

							stateMemberCallStack.push(new StateMemberCall());
							tOpCall.getArguments().add((T_ExpLevelA) CodegenXbaseToTarget.this.doSwitch(callTarget));
							stateMemberCallStack.peek().featureNames.clear();
							stateMemberCallStack.peek().xExpLastFeature = null;

						} else if (callTarget instanceof XFeatureCall) {

							simpleFC = true;
							tOpCall.getArguments().add((T_ExpLevelA) CodegenXbaseToTarget.this.doSwitch(callTarget));

						} else {
							// TODO: assigment (a = b).c
//							System.err.println("ERROR8");
						}

					} else if (xParam instanceof XFeatureCall
							&& (((XFeatureCall) xParam).getFeature() instanceof JvmField
									|| ((XFeatureCall) xParam).getFeature() instanceof JvmFormalParameter)
							&& null != jvmModelAssociations
									.getPrimarySourceElement(((XFeatureCall) xParam).getFeature())) {
						tOpCall.getLastFeaturesName().add(((XFeatureCall) xParam).getFeature().getSimpleName());
						if (((XFeatureCall) xParam).getFeature() instanceof JvmFormalParameter) {
							tOpCall.setParam(true);
							T_Get tGetForParamAsParam = targetFactory.createT_Get();
							tGetForParamAsParam.setObjectIsParam(true);
							tOpCall.getArguments().add(tGetForParamAsParam);
						} else {
							tOpCall.getArguments().add((T_ExpLevelA) createTGet(
									(XFeatureCall) ((XFeatureCall) xParam).getImplicitReceiver()));
						}

					} else {
						System.err.println("ERROR - wrong INOUT param");
					}

				} else {
					tOpCall.getIsINOUT().add(false);
					tOpCall.getPostfix().add("");
					tOpCall.getLastFeaturesName().add("");
					tOpCall.getArguments().add((T_ExpLevelA) CodegenXbaseToTarget.this.doSwitch(xParam));
				}
//							tOpCall.getArguments().add((T_ExpLevelA) CodegenXbaseToTarget.this.doSwitch(xParam));
			}
		} else {
			while (xParamIter.hasNext()) {
				XExpression xParam = xParamIter.next();
				tOpCall.getArguments().add((T_ExpLevelA) CodegenXbaseToTarget.this.doSwitch(xParam));
			}
		}
		
	}
	
	private String getQualifiedNameYClass(YClass yClass)
	{
		String qualifiedName = yClass.getName();
		YPackage pack = (YPackage) yClass.getPackage();
		
		while (pack != null)
		{
			qualifiedName = pack.getName() + "." + qualifiedName;
			pack = (YPackage) pack.getPackage();
		}
		return qualifiedName;
	}

	class StateMemberCall {

		public List<JvmIdentifiableElement> features = new ArrayList<JvmIdentifiableElement>();
		public List<XExpression> xExpressions = new ArrayList<XExpression>();
		public List<String> featureNames = new ArrayList<String>();
		public XExpression xExpLastFeature;

	}

}
