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
package online.yamm.coreModel.design;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import online.yamm.coreModelDiagram.yammDiagram.YClass;
import online.yamm.coreModelDiagram.yammDiagram.YFinalState;
import online.yamm.coreModelDiagram.yammDiagram.YOperation;
import online.yamm.coreModelDiagram.yammDiagram.YProperty;
import online.yamm.coreModelDiagram.yammDiagram.YPseudostate;
import online.yamm.coreModelDiagram.yammDiagram.YState;
import online.yamm.coreModelDiagram.yammDiagram.YStateMachine;
import online.yamm.coreModelDiagram.yammDiagram.YVertex;

public class GenerateJavaClass 
{

	public static GenerateJavaClass instance = null;
	
	public static GenerateJavaClass getInstance()
	{
		if (instance == null)
		{
			instance = new GenerateJavaClass();
		}
		return instance;
	}
	
	public String generateJava(YClass yClass) 
	{
		String code = createHeader(yClass);

		code += yClass.getOwnedAttribute().stream()
				.map(property -> createAttribute(property))
				.collect(Collectors.joining("\n"));

		code += yClass.getOwnedOperation().stream()
				.map(operation -> createOperation(operation))
				.collect(Collectors.joining("\n"));

		code += helperMethods();
		
		return code + "}\n";
	}

	private String createHeader(YClass yClass)
	{
		String header = "public class " + yClass.getName();
		
//		header += " extends " + yClass.getSuperClass().stream()
//			.map(superClass -> superClass.getName())
//			.collect(Collectors.joining(", "));
		
		header += " {\n";
		
		return header;
	}

	private String createAttribute(YProperty property) 
	{
		String attribute = property.getVisibility().getLiteral() + " "; 
		if (property.getUpper() == -1)
		{
			attribute += "List<" + property.getType().getName() + "> ";
		}
		else
			attribute += property.getType().getName() + " ";
		attribute += property.getName();
		if (property.getDefaultValue() != null)
		{
			if ("String".equals(property.getType().getName()))
				attribute += " = " + property.getDefaultValue(); 
			else
				attribute += " = " + property.getDefaultValue().substring(1, property.getDefaultValue().length() - 1); 
		}	
		attribute += ";";
		return attribute;
	}
	
	private String createOperation(YOperation operation) 
	{
		String opCode = "";
		Counter stateCount = new Counter();
		
		opCode = "public " + (operation.getReturnType() == null ? "void" : operation.getReturnType().getName());
		
		opCode += " " + operation.getName();
				
		opCode += "(";
		
		opCode += operation.getOwnedParameter().stream()
				.map(parameter -> parameter.getType().getName() + " " + parameter.getName())
				.collect(Collectors.joining(", "));
				
		opCode += ") {\n";
				
		YStateMachine statemachine = operation.getStateMachine();
		
		
		String namePseudostate = ((YPseudostate) statemachine.getSubvertex().stream()
				.filter(vertex -> vertex instanceof YPseudostate)
				.findAny().get()).getName();
		
		opCode += "final int " + namePseudostate + " = " + stateCount.getCountAndIncrement() + ";\n";
		
		opCode += statemachine.getSubvertex().stream()
				.filter(vertex -> !(vertex instanceof YPseudostate) && !(vertex instanceof YFinalState))
				.map(state -> "final int " + ((YState) state).getName() + " = " + stateCount.getCountAndIncrement() + ";")
				.collect(Collectors.joining("\n"));

		String nameFinalState = ((YFinalState) statemachine.getSubvertex().stream()
				.filter(vertex -> vertex instanceof YFinalState)
				.findAny().get()).getName();
		
		opCode += "\n\tfinal int " + nameFinalState + " = " + stateCount.getCountAndIncrement() + ";\n";
		
		opCode += "\tint activeState = " + namePseudostate + "\n";
		
		opCode += "\twhile(activeState != " + nameFinalState + "  ) { ";
		
		opCode += "\t\tswitch(activeState) {";
		
		opCode += statemachine.getSubvertex().stream()
				.filter(vertex -> !(vertex instanceof YFinalState))
				.map(state -> {
					String body = "\t\tcase ";
					if (state instanceof YState)
						body += ((YState) state).getName();
					else
						body += ((YPseudostate) state).getName();
					body += " : {\n";
					
					body += state.getOutgoing().stream().map(transition -> {
						if (transition.getAttachment() == null)
						{
							YVertex target = transition.getTarget();
							if (target instanceof YState)
								return "activeState = " + ((YState) target).getName() + ";\nbreak;";
							if (target instanceof YFinalState)
								return "activeState = " + ((YFinalState) target).getName() + ";\nbreak;";
							if (target instanceof YPseudostate)
								return "activeState = " + ((YPseudostate) target).getName() + ";\nbreak;";
							return "";
						}
						else
						{
							String guard = transition.getAttachment().getGuardStringRep();
							String transitionBody = "";
							transitionBody += "if (" + guard + ") {\n";
							YVertex target = transition.getTarget();
							
							transitionBody += transition.getAttachment().getEffects().stream()
								.map(effect -> effect.getEffectStringRep())
								.collect(Collectors.joining("\n"));
							
							if (target instanceof YState)
								transitionBody +=  "activeState = " + ((YState) target).getName() + ";\nbreak;";
							if (target instanceof YFinalState)
								transitionBody +=  "activeState = " + ((YFinalState) target).getName() + ";\nbreak;";
							if (target instanceof YPseudostate)
								transitionBody +=  "activeState = " + ((YPseudostate) target).getName() + ";\nbreak;";
							transitionBody += "}";
							return transitionBody;
						}
					}).collect(Collectors.joining("\n"));
					
					body += "}\n";
					return body;
				})
				.collect(Collectors.joining("\n"));
		
		opCode += "\t}\n";
		
		opCode += "}";
		
		return opCode;
	}

	private String helperMethods() 
	{
		// TODO
		return "";
	}

}

class Counter {
	private int count = 0;
	
	public int getCountAndIncrement() {
		return count++;
	}
}
