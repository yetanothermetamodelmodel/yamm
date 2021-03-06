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
package dev.yamm.shortcutCommands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;

import dev.yamm.gui.LayerView;
import dev.yamm.gui.SimulationState;
import dev.yamm.logger.YAMMLogger;


public class StepReturnHandler extends AbstractHandler implements IHandler {
	private static YAMMLogger logger = YAMMLogger.getYAMMLogger("YAMM Log");
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		if (LayerView.returnEnabled)
		{
			SimulationState state = LayerView.getSimulationState();
			state.stepReturn(true);
		}
		else
		{
			logger.error("Step Return is not enabled yet!");
		}
		return null;
	}

}
