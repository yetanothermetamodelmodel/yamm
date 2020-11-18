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
package online.yamm.coloring;

import java.util.HashMap;
import java.util.Map;

/**
 * Every StaeMachineHandler(Stackframe) has one ObjectsToColor object to store the colored elements.
 * This objects are passed to ColorYAMMDiagram.colorStatemachine(..).
 */
public class ObjectsToColor 
{

	// Effects, id -> color(1,2,3,...alternatives)
	private Map<AttachmentIdAndEffectId, Integer> effectsToColor = new HashMap<AttachmentIdAndEffectId, Integer>();

	// Transitions, id -> color(1,2,3,...alternatives)
	private Map<String , Integer> transitionsToColor = new HashMap<String, Integer>();

	// Guards, id -> color(1,2,3,...alternatives)
	private Map<String , Integer> guardsToColor = new HashMap<String, Integer>();

	// States, id -> color(1,2,3,...alternatives)
	private Map<String , Integer> stateToColor = new HashMap<String, Integer>();

	// effects
	public void setEffect(AttachmentIdAndEffectId attachmentIdAndeffectId, int color)
	{
		effectsToColor.clear();
		effectsToColor.put(attachmentIdAndeffectId, color);
	}

	public void addEffect(AttachmentIdAndEffectId attachmentIdAndeffectId, int color)
	{
		effectsToColor.put(attachmentIdAndeffectId, color);
	}	

	public void clearEffects()
	{
		effectsToColor.clear();
	}

	public Map<AttachmentIdAndEffectId, Integer> getEffects()
	{
		return effectsToColor;
	}

	// transitions
	public void setTransition(String transitionId, int color)
	{
		transitionsToColor.clear();
		transitionsToColor.put(transitionId, color);
	}

	public void addTransition(String transitionId, int color)
	{
		transitionsToColor.put(transitionId, color);
	}	

	public void clearTransitions()
	{
		transitionsToColor.clear();
	}

	public Map<String, Integer> getTransitions()
	{
		return transitionsToColor;
	}

	// guards
	public void setGuard(String attachmentId, int color)
	{
		guardsToColor.clear();
		guardsToColor.put(attachmentId, color);
	}

	public void addGuard(String attachmentId, int color)
	{
		guardsToColor.put(attachmentId, color);
	}	

	public void clearGuards()
	{
		guardsToColor.clear();
	}

	public Map<String, Integer> getGuards()
	{
		return guardsToColor;
	}

	// states
	public void setState(String stateId, int color)
	{
		stateToColor.clear();
		stateToColor.put(stateId, color);
	}

	public void addState(String stateId, int color)
	{
		stateToColor.put(stateId, color);
	}	

	public void clearStates()
	{
		stateToColor.clear();
	}

	public Map<String, Integer> getStates()
	{
		return stateToColor;
	}

}

