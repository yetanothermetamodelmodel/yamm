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
package online.yamm.operations;

import org.apache.log4j.Level;
import org.eclipse.emf.ecore.EObject;

import online.yamm.Common;
import online.yamm.ConfigurationManagement;
import online.yamm.EvalGuardOrEffect;
import online.yamm.gui.Layer;
import online.yamm.logger.YAMMLogger;

public class ColorObjects {

	EvalGuardOrEffect execute;
	private static YAMMLogger logger = YAMMLogger.getYAMMLogger("YAMM Log");

	public ColorObjects(EvalGuardOrEffect execute) {
		this.execute = execute;
	}

	public void color(Object obj, Object objToColor, int layer) {
		if(ConfigurationManagement.isColoring()) {
			if(obj instanceof EObject) {
				// Sirius
//				ModifyRMOFDiagram.cacheColor((EObject) obj, (EObject) objToColor, null, layer);
				if(logger.isEnabledFor( Level.DEBUG )) {
					Common.printDebugLogEntryWithObjectAndContainingObject(logger, "Colored", objToColor, obj, "on layer ".concat(((Integer) layer).toString()));
				}
			}
		}
	}

	public void color(Object obj, Object secondObj, Object thirdObj, int layer) {
		if(ConfigurationManagement.isColoring()) {
			if(obj instanceof EObject) {
				EObject eObject = (EObject) obj;
				if (eObject.eClass().getEPackage().getName().equals("rmof")) {
					if((!execute.reflectivStateChart.simulationInStepMode && !execute.reflectivStateChart.breakpoint) 
							&& !((Layer)execute.reflectivStateChart.objectManagement.getViewLayers().get(layer)).isStepWait()) {
						return;
					}
					// Sirius
//					ModifyRMOFDiagram.cacheColor(eObject, (EObject) secondObj, (String) thirdObj, layer);
					if(logger.isEnabledFor( Level.DEBUG )) {
						Common.printDebugLogEntryWithObjectAndContainingObject(logger, "Colored", thirdObj, obj, "on layer ".concat(((Integer) layer).toString()));
					}
				} else if (obj == null || eObject.eClass().getEPackage().getName().equals("uma")) {
					String containingElementObjectID = obj != null ? (String) execute.reflectivStateChart.objectManagement.get(eObject, "ObjectID") : null;
					String toBeColoredElementObjectID = secondObj != null ? (String) execute.reflectivStateChart.objectManagement.get((EObject) secondObj, "ObjectID") : null;
					// Sirius
//					ModifyUMADiagram.cacheColor(containingElementObjectID, toBeColoredElementObjectID, (String) thirdObj, layer);
					if(logger.isEnabledFor( Level.DEBUG )) {
						Common.printDebugLogEntryWithObjectAndContainingObject(logger, "Colored", secondObj, obj, "on layer ".concat(((Integer) layer).toString()));
					}
				}
			}
		}
	}

	public void deColor(Object obj, int layer) {
		if (obj instanceof EObject) {
			// Sirius
//			ModifyUMADiagram.cacheDeColor(obj != null ? (String) execute.reflectivStateChart.objectManagement.get((EObject) obj, "ObjectID") : null, layer);
		}
	}

	public void color(Object obj, Object secondObj, Object red, Object green, Object blue, int layer) {
		if (obj == null || obj instanceof EObject) {
			EObject eObject = (EObject) obj;
			String containingElementObjectID = obj != null ? (String) execute.reflectivStateChart.objectManagement.get(eObject, "ObjectID") : null;
			String toBeColoredElementObjectID = secondObj != null ? (String) execute.reflectivStateChart.objectManagement.get((EObject) secondObj, "ObjectID") : null;
			Integer integerRed = null;
			if (red instanceof Integer) {
				integerRed = (Integer) red;
			} else {
				logger.error("Color value for red \"" + red + "\" is not an Integer!");
				return;
			}
			Integer integerGreen = null;
			if (green instanceof Integer) {
				integerGreen = (Integer) green;
			} else {
				logger.error("Color value for green \"" + green + "\" is not an Integer!");
				return;
			}
			Integer integerBlue = null;
			if (blue instanceof Integer) {
				integerBlue = (Integer) blue;
			} else {
				logger.error("Color value for blue \"" + blue + "\" is not an Integer.");
				return;
			}
			// Sirius
//			ModifyUMADiagram.cacheColor(containingElementObjectID, toBeColoredElementObjectID, integerRed, integerGreen, integerBlue, layer);
			if(logger.isEnabledFor( Level.DEBUG )) {
				Common.printDebugLogEntryWithObjectAndContainingObject(logger, "Colored", secondObj, obj, "on layer ".concat(((Integer) layer).toString()));
			}
		}
	}

	public void colorDFA(String objectId) {
//		Display.getDefault().syncExec(new Runnable() {
//			@Override
//			public void run() {
//				ColorDFADiagram.modifyDiagram(objectId);
//			}
//		});
	}
}
