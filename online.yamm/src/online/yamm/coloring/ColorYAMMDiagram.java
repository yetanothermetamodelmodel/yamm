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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.diagram.ui.tools.api.editor.DDiagramEditor;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.eclipse.swt.graphics.Color;

import online.yamm.ObjectManagement;
import online.yamm.coreModel.design.editParts.TrAttachmentDNodeListEditPart;
import online.yamm.coreModel.design.editParts.TransitionEdgeEditPart;
import online.yamm.coreModel.design.editParts.YammColorable;
import online.yamm.coreModel.design.editParts.YammColorableGuardAndEffect;
import online.yamm.coreModelDiagram.yammDiagram.YObject;
import online.yamm.coreModelDiagram.yammDiagram.YState;
import online.yamm.coreModelDiagram.yammDiagram.YStateMachine;
import online.yamm.coreModelDiagram.yammDiagram.YTrAttachment;
import online.yamm.coreModelDiagram.yammDiagram.YTransition;
//import online.yamm.coreModelXmi.yamm.YState;
//import online.yamm.coreModelXmi.yamm.YStateMachine;
//import online.yamm.coreModelXmi.yamm.YTrAttachment;
//import online.yamm.coreModelXmi.yamm.YTransition;
import online.yamm.gui.Layer;
import online.yamm.gui.LayerView;
import online.yamm.init.Activator;
import online.yamm.logger.YAMMLogger;
import online.yamm.preferencePage.PreferenceConstants;

/**
 * Opens and modifies a diagram. 
 * The coloring is done directly on the EditParts(YammColorable) of the diagram.
 * The correct EditPart is identified by The ObjectID. 
 *
 */
public class ColorYAMMDiagram 
{

	private static YAMMLogger logger = YAMMLogger.getYAMMLogger("YAMM Log");

	// for "refective" get/layerinformation
	private static ObjectManagement om;

	/** statemachineID -> {DDiagramEditor, DSemanticDiagram} */
	private static Map<String, EditorDDiagramPair> allStatemachineDiagrams = new HashMap<String, EditorDDiagramPair>();

	private static Session session = null;


	// editParts:
	private static HashMap<DDiagramEditor, HashMap<String, YammColorable>> allTransitionEditParts = 
			new HashMap<DDiagramEditor, HashMap<String, YammColorable>>();

	private static HashMap<DDiagramEditor, HashMap<String, YammColorable>> allStateEditParts = 
			new HashMap<DDiagramEditor, HashMap<String, YammColorable>>();

	private static HashMap<DDiagramEditor, HashMap<String, YammColorableGuardAndEffect>> allTrAttachmentEditParts = 
			new HashMap<DDiagramEditor, HashMap<String, YammColorableGuardAndEffect>>();


	// coloredEditparts
	private static HashMap<DDiagramEditor, List<YammColorable>> coloredTransitionsAndStates = 
			new HashMap<DDiagramEditor, List<YammColorable>>();

	private static HashMap<DDiagramEditor, Set<YammColorableGuardAndEffect>> coloredGuardsAndEffects = 
			new HashMap<DDiagramEditor, Set<YammColorableGuardAndEffect>>();

	public static void clear()
	{
		session = null;
		Set<DDiagramEditor> diagrams = new HashSet<DDiagramEditor>();
		diagrams.addAll(coloredTransitionsAndStates.keySet());
		diagrams.addAll(coloredGuardsAndEffects.keySet());
		for (DDiagramEditor diagram : diagrams)
		{
			clearDiagram(diagram);
		}
		allTransitionEditParts.clear();
		allStateEditParts.clear();
		allTrAttachmentEditParts.clear();
		coloredTransitionsAndStates.clear();
		coloredGuardsAndEffects.clear();
		allStatemachineDiagrams.clear();
	}

	/**
	 * Opens and colors a diagram of a staemachine according to the information in the ObjectToColor parameter.
	 * 
	 * @param statemachine the statemachine to show and color
	 * @param objectsToColor the information which object has to be modified
	 */
	public static void colorStatemachine(EObject statemachine, ObjectsToColor objectsToColor)
	{
		if (om == null)
			om = LayerView.yamm.reflectivStateChart.objectManagement;
		
		// get/open diagram
		DDiagramEditor diagram = getYammDiagramEditor(statemachine);

		// clear diagram
		clearDiagram(diagram);

		// get editParts
		fillTransitionAndStateEditParts(diagram);

		// color diagram
		colorDiagram(diagram, objectsToColor);
	}
	/**
	 * Opens and color a statemachine
	 * 
	 * @param smhOfSmToColor the StateMachineHandler of the statemachine
	 */
	public static void colorStatemachine(EObject smhOfSmToColor)
	{
		if (om == null)
			om = LayerView.yamm.reflectivStateChart.objectManagement;
		
		ObjectsToColor objectsToColor = (ObjectsToColor) om.get(smhOfSmToColor, "objectsToColor");
	
		EObject statemachine = (EObject) om.get(smhOfSmToColor, "stateMachine");
		
		colorStatemachine(statemachine, objectsToColor);
	}

	/**
	 * colors a diagram
	 * 
	 * @param diagram the diagram to modify 
	 * @param objectsToColor the information which object has to be modified
	 */
	public static void colorDiagram(DDiagramEditor diagram, ObjectsToColor objectsToColor) 
	{
		colorTransitions(diagram, objectsToColor.getTransitions());
		colorGuards(diagram, objectsToColor.getGuards());
		colorEffects(diagram, objectsToColor.getEffects());
		colorStates(diagram, objectsToColor.getStates());

	}

	/**
	 * colors a transition
	 * 
	 * @param diagram
	 * @param transitions
	 */
	public static void colorTransitions(DDiagramEditor diagram, Map<String, Integer> transitions) 
	{
		for (Entry<String, Integer> transitionEntry : transitions.entrySet())
		{
			String objectID = transitionEntry.getKey();
			int colorCode = transitionEntry.getValue();

			YammColorable transitionColorable = null;
			if ((transitionColorable = allTransitionEditParts.get(diagram).get(objectID)) != null)
			{
				transitionColorable.setColor(getColor("Transition", colorCode));
				transitionColorable.refresh();
				coloredTransitionsAndStates.get(diagram).add(transitionColorable);
			}
		}

	}

	/**
	 * color guards
	 * 
	 * @param diagram
	 * @param guards
	 */
	private static void colorGuards(DDiagramEditor diagram, Map<String, Integer> guards) 
	{
		for (Entry<String, Integer> guardEntry : guards.entrySet())
		{
			String attachmentID = guardEntry.getKey();
			int colorCode = guardEntry.getValue();

			YammColorableGuardAndEffect trAttachmentColorable = null;
			if ((trAttachmentColorable = allTrAttachmentEditParts.get(diagram).get(attachmentID)) != null)
			{
				trAttachmentColorable.setColorGuard(getColor("Guard", colorCode));
				trAttachmentColorable.refresh();
				coloredGuardsAndEffects.get(diagram).add(trAttachmentColorable);
			}
		}
	}

	/**
	 * colors effects
	 * 
	 * @param diagram
	 * @param effects
	 */
	private static void colorEffects(DDiagramEditor diagram, Map<AttachmentIdAndEffectId, Integer> effects) 
	{
		for (Entry<AttachmentIdAndEffectId, Integer> effectEntry : effects.entrySet())
		{
			AttachmentIdAndEffectId attachmentAndEffectId = effectEntry.getKey();
			String attachmentId = attachmentAndEffectId.attachmentId;
			String effectId = attachmentAndEffectId.effectId;
			int colorCode = effectEntry.getValue();

			// get effect number in attachment
			int effectNumber = 0;
			YammColorableGuardAndEffect trAttachmentColorable = null;
			if ((trAttachmentColorable = allTrAttachmentEditParts.get(diagram).get(attachmentId)) != null)
			{
				EObject attachment = ((DSemanticDecorator) ((View) ((GraphicalEditPart) trAttachmentColorable).getModel()).getElement()).getTarget();
				
				EList<EObject> effectsInAttachment = (EList<EObject>) om.get(attachment, "effects");
				for (;; effectNumber++)
				{
					EObject effect = effectsInAttachment.get(effectNumber);
					if(effectId.equals(om.get(effect, "ObjectID")))
						break;
				}
				// color effect
				trAttachmentColorable.setColorEffect(getColor("Effect", colorCode), effectNumber);
				trAttachmentColorable.refresh();
				coloredGuardsAndEffects.get(diagram).add(trAttachmentColorable);
			}
		}
	}

	/**
	 * colors states
	 * 
	 * @param diagram
	 * @param states
	 */
	private static void colorStates(DDiagramEditor diagram, Map<String, Integer> states) 
	{
		for (Entry<String, Integer> stateEntry : states.entrySet())
		{
			String stateID = stateEntry.getKey();
			int colorCode = stateEntry.getValue();
			
			YammColorable stateColorable = null;
			if ((stateColorable = allStateEditParts.get(diagram).get(stateID)) != null)
			{
				stateColorable.setColor(getColor("State", colorCode));
				stateColorable.refresh();
				coloredTransitionsAndStates.get(diagram).add(stateColorable);
			}
		}		
	}
	
	/**
	 * colors can be set in windows--Preferences--YammDiagram 
	 * 
	 * @param objectType
	 * @param colorCode
	 * @return
	 */
	private static Color getColor(String objectType, int colorCode) {
		if ("Effect".equals(objectType))
		{
			if (colorCode == 1)
			{
				return getColor2(PreferenceConstants.P_COLOREFFECT, new Color(null, 255, 0, 0), "Effect"); //red
			}
			else if (colorCode == 2)
			{
				return getColor2(PreferenceConstants.P_COLOREFFECT_ALTERNATE, new Color(null, 255, 0, 255), "Effect"); //pink
			}
			else if (colorCode == 3)
			{
				return new Color(null, 0, 0, 180);
			}
		}
		else if ("Guard".equals(objectType))
		{
			if (colorCode == 1)
			{
				return new Color(null, 255, 0, 0);
//				return getColor2(PreferenceConstants.P_COLORGUARD, new Color(null, 255, 0, 0), "Guard");
			}
			else if (colorCode == 2) 
			{
				return new Color(null, 0, 255, 0); //green
//				return getColor2(PreferenceConstants.P_COLORGUARD_ALTERNATE, new Color(null, 255, 0, 255), "Guard");
			}
			else if (colorCode == 3)
			{
				return new Color(null, 0, 0, 255);
			}
		}
		else if ("State".equals(objectType))
		{
			if (colorCode == 1)
			{
				return getColor2(PreferenceConstants.P_COLORSTATE, new Color(null, 0, 255, 0), "State"); //green
			}
			else if (colorCode == 2)
			{
				
			}
		}
		else if ("Transition".equals(objectType))
		{
			if (colorCode == 1)
			{
				return getColor2(PreferenceConstants.P_COLORTRANSITION, new Color(null, 255, 0, 0), "Transition"); //red
			}
			else if (colorCode == 2)
			{
				return new Color(null, 255, 255, 0); //yellow
			}
			else if (colorCode == 3)
			{
				return new Color(null, 0, 0, 255); //blue
			}
		}
		// return default color, red
		return new Color(null, 255, 0, 0);
	}
	
	/**
	 * laods the colors from the preferences
	 * 
	 * @param preferenceColorString
	 * @param defaultColor
	 * @param contextString
	 * @return
	 */
	private static Color getColor2(String preferenceColorString, Color defaultColor, String contextString) {
		if (Activator.getActionPreferenceStore() != null) {
			String colorString = Activator.getActionPreferenceStore().getString(preferenceColorString);
			if (colorString.isEmpty())
				return defaultColor;
			return YAMMLogger.parseColorStringToIntValue(colorString, defaultColor, 
					"-> Setting Default Color for ".concat(contextString));	
		}
		return defaultColor;
	}

	/**
	 * undo all modifications
	 * 
	 * @param diagram
	 */
	public static void clearDiagram(DDiagramEditor diagram)
	{
		try {
		if (coloredTransitionsAndStates.containsKey(diagram))
		{
			for (YammColorable coloredObj : coloredTransitionsAndStates.get(diagram))
			{
				coloredObj.deColor();
				coloredObj.refresh();
			}
			coloredTransitionsAndStates.get(diagram).clear();
		}

		if (coloredGuardsAndEffects.containsKey(diagram))
		{
			for (YammColorableGuardAndEffect coloredObj : coloredGuardsAndEffects.get(diagram))
			{
				coloredObj.deColorAllEffect();
				coloredObj.deColorGuard();
				coloredObj.refresh();
			}
			coloredGuardsAndEffects.get(diagram).clear();
		}
		} catch (Exception e) {
			
		}
	}

	/**
	 * loads and opens the correct diagram
	 * 
	 * @param stateMachine
	 * @return
	 */
	public static DDiagramEditor getYammDiagramEditor(EObject stateMachine) 
	{
		String statemachineId = (String) om.get(stateMachine, "ObjectID");

		if (allStatemachineDiagrams.containsKey(statemachineId))
		{
			EditorDDiagramPair editorPair = allStatemachineDiagrams.get(statemachineId);
			Session session = editorPair.editor.getSession();
			DialectUIManager.INSTANCE.openEditor(session, editorPair.dSemanticDiagram, new NullProgressMonitor());
			return editorPair.editor;
		}
		else
		{		
			Layer layer = om.getViewLayers().get(0);
			URI resourceURI = URI.createPlatformResourceURI(layer.getPath().replace("__TMP__.xyamm", ".yammdiagram"));	
			for (Session sess : SessionManager.INSTANCE.getSessions()) 
			{
				for (Resource resource : sess.getSemanticResources()) 
				{
					if (resourceURI.equals(resource.getURI())) 
					{
						session = sess;
					}
				}
			}

			if (session == null)
			{
				logger.error("no session found");
				return null;
			}

			Resource sessionRes = session.getSessionResource();
			EList<EObject> content = sessionRes.getContents();
			for (int i = 1; i < content.size(); i++)
			{
				DSemanticDiagram diagram = null;
				if (content.get(i) instanceof DSemanticDiagram)
					diagram = (DSemanticDiagram)content.get(i);
				else	// not a diagram, maybe a Table
					continue; 
				if (!(diagram.getTarget() instanceof YObject))
					continue;
				YObject root = (YObject)diagram.getTarget();
				if (!(root instanceof YStateMachine)) 
					continue;	// it's a classdiagram
				if (root.eResource() == null) 
					continue;	// a statemachine diagram which statemachine is deleted(in the classdiagram)
				String objectIdOfRoot = root.getObjectID(); 
				if (objectIdOfRoot != null && objectIdOfRoot.equals(statemachineId))
				{
					DDiagramEditor editor = (DDiagramEditor)DialectUIManager.INSTANCE.openEditor(session, diagram, new NullProgressMonitor());
					EditorDDiagramPair editorPair = new EditorDDiagramPair();
					editorPair.dSemanticDiagram = diagram;
					editorPair.editor = editor;
					allStatemachineDiagrams.put(statemachineId, editorPair);
					return editor;
				}
			}
			logger.error("no diagram -> open diagram for Operation: " + (String) om.get(stateMachine, "operation", "clazz", "name") + "." + (String) om.get(stateMachine, "operation", "name"));
			return null;
		}

	}
	
	/**
	 * gets the EditpArts of the diagram and maps them to the ObjectIDs
	 * 
	 * @param yammDiagramEditor
	 */
	private static void fillTransitionAndStateEditParts(DDiagramEditor yammDiagramEditor) {
		if (!allStateEditParts.containsKey(yammDiagramEditor) ||
				!allTransitionEditParts.containsKey(yammDiagramEditor) ||
				!allTrAttachmentEditParts.containsKey(yammDiagramEditor)) {

			
			coloredTransitionsAndStates.put(yammDiagramEditor, new ArrayList<YammColorable>());
			
			coloredGuardsAndEffects.put(yammDiagramEditor, new HashSet<YammColorableGuardAndEffect>());
			
			HashMap<String, YammColorable> stateEditParts = new HashMap<String, YammColorable>();

			HashMap<String, YammColorable> transitionEditParts = new HashMap<String, YammColorable>(); 

			HashMap<String, YammColorableGuardAndEffect> trAttachmentEditParts = new HashMap<String, YammColorableGuardAndEffect>();

			for (Object editPart : ((DiagramEditor)yammDiagramEditor).getDiagramEditPart().getPrimaryEditParts()) 
			{
				View view = (View) ((EditPart) editPart).getModel();
				YObject semanticElement = null;
				String id = null;
				if (view.getElement() instanceof DSemanticDecorator)
				{
					semanticElement = (YObject) ((DSemanticDecorator) view.getElement()).getTarget();
					id = semanticElement.getObjectID();
				}
				else
					continue;

				if (semanticElement instanceof YState)
				{
					stateEditParts.put(id, (YammColorable) editPart);
				}

				else if (semanticElement instanceof YTransition)
				{
					if (editPart instanceof TransitionEdgeEditPart)
					{
						transitionEditParts.put(id, (YammColorable) editPart);
					}
				}

				else if (semanticElement instanceof YTrAttachment)
				{
					if (editPart instanceof TrAttachmentDNodeListEditPart)
					{
						YTransition transition = ((YTrAttachment) semanticElement).getTransition();
						if (transition != null)
						{
							id = transition.getAttachment().getObjectID();
							trAttachmentEditParts.put(id, (YammColorableGuardAndEffect) editPart);
						}
					}
				}

			}

			if (!allStateEditParts.containsKey(yammDiagramEditor)) 
				allStateEditParts.put(yammDiagramEditor, stateEditParts);

			if (!allTransitionEditParts.containsKey(yammDiagramEditor)) 
				allTransitionEditParts.put(yammDiagramEditor, transitionEditParts);

			if (!allTrAttachmentEditParts.containsKey(yammDiagramEditor)) 
				allTrAttachmentEditParts.put(yammDiagramEditor, trAttachmentEditParts);

		}
	}
}

class EditorDDiagramPair
{
	public DSemanticDiagram dSemanticDiagram;
	public DDiagramEditor editor;
}
