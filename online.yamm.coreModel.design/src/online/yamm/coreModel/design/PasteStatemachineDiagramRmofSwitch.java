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

import org.eclipse.emf.ecore.EObject;

import online.yamm.coreModelDiagram.yammDiagram.YEffect;
import online.yamm.coreModelDiagram.yammDiagram.YNamedElement;
import online.yamm.coreModelDiagram.yammDiagram.YObject;
import online.yamm.coreModelDiagram.yammDiagram.YStateMachine;
import online.yamm.coreModelDiagram.yammDiagram.YTrAttachment;
import online.yamm.coreModelDiagram.yammDiagram.YTransition;
import online.yamm.coreModelDiagram.yammDiagram.YVertex;
import online.yamm.coreModelDiagram.yammDiagram.util.YammDiagramSwitch;

public class PasteStatemachineDiagramRmofSwitch extends YammDiagramSwitch<YObject>
{
	private EObject container;

	private List<YObject> copiedElements = new ArrayList<>();
	
	public void setContainer(EObject container) 
	{
		this.container = container;
	}
	
	public void customizeCopiedElements()
	{
		
		List<YTransition> copiedTransitions = copiedElements.stream()
				.filter(elem -> elem instanceof YTransition)
				.map(trans -> (YTransition)trans)
				.collect(Collectors.toList());
		
		List<YVertex> copiedVertices = copiedElements.stream()
				.filter(elem -> elem instanceof YVertex)
				.map(vertex -> (YVertex)vertex)
				.collect(Collectors.toList());
		
		List<YTrAttachment> copiedTrAttachments = copiedElements.stream()
				.filter(elem -> elem instanceof YTrAttachment)
				.map(attachment -> (YTrAttachment)attachment)
				.collect(Collectors.toList());
		
		for (YVertex vertex : copiedVertices)
		{
			List<YTransition> incomingDeleteList = new ArrayList<>();
			vertex.getIncoming().forEach(
					trans -> {if (!copiedTransitions.contains(trans)) incomingDeleteList.add(trans);});
			vertex.getIncoming().removeAll(incomingDeleteList);
			
			List<YTransition> outgoingDeleteList = new ArrayList<>();
			vertex.getOutgoing().forEach(
					trans -> {if (!copiedTransitions.contains(trans)) outgoingDeleteList.add(trans);});
			vertex.getOutgoing().removeAll(outgoingDeleteList);
		}
		
		for (YTransition transition : copiedTransitions)
		{
			if (transition.getAttachment() != null && !copiedTrAttachments.contains(transition.getAttachment()))
			{
				transition.setAttachment(null);
			}
		}
		
		
		
		copiedTransitions.forEach(trans -> trans.setName(trans.getObjectID()));
		
		copiedElements.clear();
	}

	@Override
	public YObject caseYTrAttachment(YTrAttachment newTrAttachment) 
	{
		if (container instanceof YStateMachine)
		{
			((YStateMachine) container).getTrAttach().add(newTrAttachment);
			copiedElements.add(newTrAttachment);
			setObjectID(newTrAttachment);
			newTrAttachment.setName("TrAttachment" + newTrAttachment.getObjectID());
			for (YEffect effect : newTrAttachment.getEffects()) {
				setObjectID(effect);
			}
			if (newTrAttachment.getTransition() != null)
			{
				YTransition transition = newTrAttachment.getTransition();
				if (transition.getAttachment() != newTrAttachment)
				{
					newTrAttachment.setTransition(null);
				}
			}
		}
		return newTrAttachment;
	}

	@Override
	public YObject caseYVertex(YVertex newVertex) 
	{
		if (container instanceof YStateMachine)
		{	
			((YStateMachine) container).getSubvertex().add(newVertex);
			copiedElements.add(newVertex);
			setObjectID(newVertex);
			((YNamedElement)newVertex).setName("State" + newVertex.getObjectID());
			
		}

		return newVertex;
	}

	@Override
	public YObject caseYTransition(YTransition newTransition) 
	{
		if (container instanceof YStateMachine)
		{
			((YStateMachine) container).getTransition().add(newTransition);
			copiedElements.add(newTransition);
			setObjectID(newTransition);
			newTransition.setName("Transition" + newTransition.getObjectID());
			
		}
		return newTransition;
	}
	
	@Override
	public YObject caseYEffect(YEffect newEffect) 
	{
		if (container instanceof YTrAttachment)
		{
			((YTrAttachment) container).getEffects().add(newEffect);
			copiedElements.add(newEffect);
			setObjectID(newEffect);
		}
		return newEffect;
	}
	
	private void setObjectID(YObject newObject) 
	{
		int hashCode = newObject.hashCode();
		hashCode -= (hashCode % 16);
		ForbidModifcationOfObjectID.ignoreNext = true;
		newObject.setObjectID("f" + Integer.toHexString(hashCode / (16*16)));	
	}


}
