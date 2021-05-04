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
package dev.yamm.coreModelDiagram.yammDiagram.xmiToText;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.business.api.query.EObjectQuery;
import org.eclipse.ui.IEditorPart;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.lib.StringExtensions;

import com.google.common.collect.MapMaker;

import dev.yamm.coreModelDiagram.yammDiagram.ContainmentInfo;
import dev.yamm.coreModelDiagram.yammDiagram.DslInfo;
import dev.yamm.coreModelDiagram.yammDiagram.EffectInfo;
import dev.yamm.coreModelDiagram.yammDiagram.FeatureInfo;
import dev.yamm.coreModelDiagram.yammDiagram.GuardInfo;
import dev.yamm.coreModelDiagram.yammDiagram.Line;
import dev.yamm.coreModelDiagram.yammDiagram.SingleLinePropertyInfo;
import dev.yamm.coreModelDiagram.yammDiagram.YClass;
import dev.yamm.coreModelDiagram.yammDiagram.YEffect;
import dev.yamm.coreModelDiagram.yammDiagram.YEnumeration;
import dev.yamm.coreModelDiagram.yammDiagram.YEnumerationLiteral;
import dev.yamm.coreModelDiagram.yammDiagram.YFinalState;
import dev.yamm.coreModelDiagram.yammDiagram.YModel;
import dev.yamm.coreModelDiagram.yammDiagram.YNamedElement;
import dev.yamm.coreModelDiagram.yammDiagram.YObject;
import dev.yamm.coreModelDiagram.yammDiagram.YOperation;
import dev.yamm.coreModelDiagram.yammDiagram.YPackage;
import dev.yamm.coreModelDiagram.yammDiagram.YParameter;
import dev.yamm.coreModelDiagram.yammDiagram.YProperty;
import dev.yamm.coreModelDiagram.yammDiagram.YPseudostate;
import dev.yamm.coreModelDiagram.yammDiagram.YState;
import dev.yamm.coreModelDiagram.yammDiagram.YStateMachine;
import dev.yamm.coreModelDiagram.yammDiagram.YTrAttachment;
import dev.yamm.coreModelDiagram.yammDiagram.YTransition;
import dev.yamm.coreModelDiagram.yammDiagram.YType;
import dev.yamm.coreModelDiagram.yammDiagram.YVertex;
import dev.yamm.coreModelDiagram.yammDiagram.YammDiagramFactory;
import dev.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage;
import dev.yamm.coreModelDiagram.yammDiagram.util.YammDiagramSwitch;

public class DslConverter extends EContentAdapter
{
	private YammDiagramFactory factory = YammDiagramFactory.eINSTANCE;
	private Stack<Notification> notification = new Stack<>();
	private Stack<EStructuralFeature> feature = new Stack<>();
	private Stack<Integer> eventType = new Stack<>();
	private Stack<Object> newValue = new Stack<>();
	private Object oldValue;
	
	private Boolean create = false;
	private Boolean init = false;
	Boolean updateWorkspace = false;
	private boolean reload = false;
	
	private CreateDummyJavaRepresentationForContentAssist javaRepAdapter;

	private boolean nameDirectEdit;

	private YammDiagramSwitch<EObject> yammSwitch;
	private YammInit yamminitDsl = new YammInit();
	private YammQualifiedNamesProvider nameProvider = new YammQualifiedNamesProvider();

	public Map<String, YEffect> objectIDToEffect;
	public Map<String, YTrAttachment> objectIDToGuard;

	public ObservableList<String> internalDsl;
//	public ObservableList<String> internalDslWithoutStatemachineConent;

	public LanguageConnector langConnector;

	private Map<Integer, Command> lineIndex = new HashMap<>();

	IEditorPart xYammEditor;

	private List<Offset> offsets = new ArrayList<>();

	private Set<EObject> containmentList;

	class Offset
	{
		public int pos;
		public int lines;
	}

	private Command setIndexCmd = (EObject object, EStructuralFeature feature, int newValue) -> object.eSet(feature,
			newValue);

	interface Command
	{
		void execute(EObject object, EStructuralFeature feature, int newValue);
	}

	public LanguageConnector getLangConnector()
	{
		return langConnector;
	}

	private boolean createFullDsl;

	public List<String> createFullDsl(YModel model)
	{
		internalDsl = new ObservableList<>();
		yammSwitch = new DslYammSwich();
		objectIDToEffect = new MapMaker().weakValues().makeMap();
		objectIDToGuard = new MapMaker().weakValues().makeMap();
		createFullDsl = true;

		containmentList = null;
		offsets = new ArrayList<>();
		internalDsl.clear();
		model.setDslInfo(factory.createDslInfo());
		insertLine = 0;
		processed = -1;
		yamminitDsl.doSwitch(model);

		for (EStructuralFeature modelFeature : model.eClass().getEAllStructuralFeatures())
		{
			if (modelFeature.getName().equals("dslInfo"))
				continue;

			feature.push(modelFeature);
			eventType.push(modelFeature.isMany() ? Notification.ADD_MANY : Notification.ADD);
			newValue.push(model.eGet(modelFeature));

			yammSwitch.doSwitch(model);

			feature.pop();
			eventType.pop();
			newValue.pop();
		}
		createFullDsl = false;
		return internalDsl;
	}

	public void init(EObject target, String projectName)
	{
		objectIDToEffect = new MapMaker().weakValues().makeMap();
		objectIDToGuard = new MapMaker().weakValues().makeMap();
		createFullDsl = false;
		yammSwitch = new DslYammSwich();
		internalDsl = new ObservableList<>();
	
		init = true;
//		langConnector.useAddBuffer();
		containmentList = null;
		if (target instanceof YModel)
		{
			offsets = new ArrayList<>();
			YModel model = (YModel) target;
			javaRepAdapter = new CreateDummyJavaRepresentationForContentAssist(projectName, model);
			internalDsl.clear();
			model.setDslInfo(factory.createDslInfo());
			insertLine = 0;
			processed = -1;
			yamminitDsl.doSwitch(model);
		
			for (EStructuralFeature modelFeature : model.eClass().getEAllStructuralFeatures())
			{
				if (modelFeature.getName().equals("dslInfo"))
					continue;

				feature.push(modelFeature);
				eventType.push(modelFeature.isMany() ? Notification.ADD_MANY : Notification.ADD);
				newValue.push(model.eGet(modelFeature));

				yammSwitch.doSwitch(model);

				feature.pop();
				eventType.pop();
				newValue.pop();
			}
		}
		init = false;

		javaRepAdapter.refreshProject();
	}

	@Override
	public void notifyChanged(Notification msg)
	{
		super.notifyChanged(msg);

	try {
		
	
		reload = false;
		updateWorkspace = false;
		
		if (msg.getFeature() == null || ((EStructuralFeature) msg.getFeature()).getName().equals("dslInfo"))
			return;
		createFullDsl = false;
		notification.push(msg);
		feature.push((EStructuralFeature) msg.getFeature());
		eventType.push(msg.getEventType());
		newValue.push(msg.getNewValue());
		oldValue = msg.getOldValue();

		if (msg.getFeature() != null && msg.getFeature() instanceof EStructuralFeature
				&& "name".equals(((EStructuralFeature) msg.getFeature()).getName()))
			nameDirectEdit = true;
		else
			nameDirectEdit = false;

		containmentList = null;
		if (msg.getEventType() == Notification.ADD || msg.getEventType() == Notification.ADD_MANY)
		{
			if (feature.peek() instanceof EReference && ((EReference) feature.peek()).isContainment())
			{
//				langConnector.useAddBuffer();
				containmentList = new HashSet<>();
				TreeIterator<EObject> iter;
				if (newValue.peek() instanceof Collection)
					iter = EcoreUtil.getAllContents((Collection<EObject>) newValue.peek());
				else
					iter = EcoreUtil.getAllContents((EObject) newValue.peek(), true);

				while (iter.hasNext())
				{
					EObject child = iter.next();
					if (child instanceof YStateMachine)
						iter.prune();
					containmentList.add(child);
				}
			}
		}

//		((DslViewConnector) langConnector).documentListenerActive = false;
		try
		{
			yammSwitch.doSwitch((EObject) msg.getNotifier());
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

		if (msg.getEventType() == Notification.ADD || msg.getEventType() == Notification.ADD_MANY)
		{
			if (feature.peek() instanceof EReference && ((EReference) feature.peek()).isContainment())
			{
//				langConnector.writeAddBuffer();
			}
		}
//		((DslViewConnector) langConnector).documentListenerActive = true;
		
		
//		if (javaRepAdapter.refresh)
//		{
//			javaRepAdapter.refreshProject();
//			javaRepAdapter.refresh = false;
//		}
		
//		if (updateWorkspace)
//		{
			javaRepAdapter.refreshProject();
//		}
		if (reload)
		{
//			((DslViewConnector) langConnector).view.reload();
		}

		
	} catch (Exception e) {
		e.printStackTrace();
	}
	}

	public int get(Line line)
	{
		int lastPos = 0;

			lastPos = line.getPos();
			int countPrcessed = 0;
			for (int index = line.getProcessedOffsets() == -1 ? 0 : line.getProcessedOffsets() + 1; index < offsets
					.size(); index++)
			{
				if (lastPos >= offsets.get(index).pos)
				{
					lastPos += offsets.get(index).lines;
				}
				countPrcessed++;
			}
			line.setPos(lastPos);
			int processedLast = line.getProcessedOffsets();
			line.setProcessedOffsets(processedLast == -1 ? countPrcessed : processedLast + countPrcessed);


		return lastPos;
	}

	private void set(Line line)
	{

	}

	public void addOffset(int posFirstLine, int lines)
	{
		Offset offset = new Offset();
		offset.pos = posFirstLine;
		offset.lines = lines;
		offsets.add(offset);

//		if (offsets.size() > x)
//		{
//			// TODO: foreach all Line(-> GlobalListOfAllLines!): get(line); line.setPocessed(-1); offsets.clear(); 
//		}
	}

	class DslYammSwich extends YammDiagramSwitch<EObject>
	{
		@Override
		public EObject caseYObject(YObject yObject)
		{
			if ((!createFullDsl && (newValue.peek() instanceof XExpression || newValue.peek() instanceof YTransition
					|| yObject instanceof YTransition || oldValue instanceof YTransition
					|| newValue.peek() instanceof YVertex || yObject instanceof YVertex || oldValue instanceof YVertex))

					|| (createFullDsl && newValue.peek() instanceof XExpression))
				return yObject;

			DslInfo yClassInfo = yObject.getDslInfo();
			FeatureInfo featureInfo = yClassInfo.getFeatures().get(feature.peek());

			if (featureInfo instanceof SingleLinePropertyInfo)
			{
				
				SingleLinePropertyInfo info = (SingleLinePropertyInfo) featureInfo;
				int lineToReplace = get(info.getLine());
				String newLine = "";
				boolean isBoolean = feature.peek().getEType() == EcorePackage.Literals.EBOOLEAN;
				boolean isObjectID = feature.peek().getName().equals("ObjectID");
				boolean isString = feature.peek().getEType() == EcorePackage.Literals.ESTRING;
				boolean isEnum = feature.peek().getEType() instanceof EEnum;
				boolean isGuard = isString && feature.peek().getName().equals("guardStringRep");
				boolean isEffect = isString && feature.peek().getName().equals("effectStringRep");
				boolean isDefaultValue = feature.peek().getName().equals("defaultValue");
				if (isEffect)
					System.out.println();
				if (!(isBoolean || isObjectID || isGuard || isEffect))
					newLine += "y" + StringExtensions.toFirstUpper(feature.peek().getName()) + " ";
				if (feature.peek().isMany())
				{
					List<Object> content = (List<Object>) yObject.eGet(feature.peek());
					if (feature.peek() instanceof EAttribute)
					{
						for (Iterator<Object> iter = content.iterator(); iter.hasNext();)
						{
							newLine += iter.next();
							if (iter.hasNext())
								newLine += ", ";
						}
					}
					else // EReference
					{
						newLine += "( ";
						for (Iterator<Object> iter = content.iterator(); iter.hasNext();)
						{
							EObject eObj = (EObject) iter.next();
							newLine += nameProvider.getDslRefName(eObj, yObject, feature.peek());
							if (iter.hasNext())
								newLine += ", ";
						}
						newLine += ")";
					}
				}
				else
				{
					if (feature.peek() instanceof EAttribute)
					{
						if (isBoolean)
							if (newValue.peek().toString().equals("true"))
								newLine += "y" + StringExtensions.toFirstUpper(feature.peek().getName());
							else
								newLine = "";
						else if (isObjectID)
						{
							newLine += newValue.peek();
							if (yObject instanceof YEffect)
							{
								if (!objectIDToEffect.containsKey((String) newValue.peek()))
									objectIDToEffect.put((String) newValue.peek(), (YEffect) yObject);
							}
							else if (yObject instanceof YTrAttachment)
							{
								if (!objectIDToGuard.containsKey((String) newValue.peek()))
									objectIDToGuard.put((String) newValue.peek(), (YTrAttachment) yObject);
							}
						}
						else if (isEnum)
							newLine += "y" + StringExtensions.toFirstUpper(newValue.peek().toString());
						else if (isDefaultValue)
						{
							if (newValue.peek() == null || "".equals(newValue.peek()) || "\"\"".equals(newValue.peek()))
								newLine = "";
							else
								newLine += " " + newValue.peek();
						}
						else if (isString)
						{
							if ("name".equals(feature.peek().getName()))
							{
								if (nameDirectEdit)
								{
									updateReferences(yObject, yObject);
								}
								
								if (yObject.eClass() == YammDiagramPackage.Literals.YCLASS
										&& create == false)
								{
									if (!createFullDsl)
										javaRepAdapter.updateClassName((YClass) yObject);
									updateWorkspace = true;
									reload = true;
								}
//								else if (yObject.eClass() == YammDiagramPackage.Literals.YENUMERATION
////										&& create == false){
////									asdasdasdTODO
////									public enum EnumA
////									{
////									 literalA
////									}
//								}
							}

							if (newValue.peek() == null || newValue.peek().equals(""))
								newLine = "";
							else
								newLine += newValue.peek();
						}
						else
							
							newLine += newValue.peek();
					}
					else
					{
						EObject content = (EObject) yObject.eGet(feature.peek());
						if (content != null)
						{
							newLine += nameProvider.getDslRefName(content, yObject, feature.peek());
						}
						else
						{
							newLine = "";
						}
					}
				}
				internalDsl.set(lineToReplace, newLine);
			}
			else if (featureInfo instanceof ContainmentInfo)
			{
				ContainmentInfo info = (ContainmentInfo) featureInfo;
				if (newValue.peek() != null
						&& (eventType.peek() == Notification.ADD || eventType.peek() == Notification.SET))
				{
					if (containmentList != null)
					{
						if (newValue.peek() instanceof YType)
						{
							YType yClass = (YType) newValue.peek();
							EObjectQuery objectQuery = new EObjectQuery(yClass);

							Collection<EObject> properties = objectQuery
									.getInverseReferences(YammDiagramPackage.Literals.YPROPERTY__TYPE);
							Collection<EObject> superClasses = objectQuery
									.getInverseReferences(YammDiagramPackage.Literals.YCLASS__SUPER_CLASS);
							Collection<EObject> opReturnType = objectQuery
									.getInverseReferences(YammDiagramPackage.Literals.YOPERATION__RETURN_TYPE);
							Collection<EObject> parameter = objectQuery
									.getInverseReferences(YammDiagramPackage.Literals.YPARAMETER__TYPE);
//							Collection<EObject> opposites = new ArrayList<>();
							if (yClass instanceof YClass)
							{
							for (YProperty property : ((YClass) yClass).getOwnedAttribute())
							{
								EObjectQuery oppositeQuery = new EObjectQuery(property);
								Collection<EObject> opposites = oppositeQuery
										.getInverseReferences(YammDiagramPackage.Literals.YPROPERTY__OPPOSITE);

								for (EObject opposite : opposites)
								{
									if (!containmentList.contains(opposite))
									{
										String newLine = "yOpposite ";
										newLine += nameProvider.getDslRefName(property, opposite,
												YammDiagramPackage.Literals.YPROPERTY__OPPOSITE);

										FeatureInfo propFeatureInfo = ((YProperty) opposite).getDslInfo().getFeatures()
												.get(YammDiagramPackage.Literals.YPROPERTY__OPPOSITE);
//										((DslViewConnector) langConnector).addBufferUpdate = true;
										internalDsl.set(get(((SingleLinePropertyInfo) propFeatureInfo).getLine()),
												newLine);
//										((DslViewConnector) langConnector).addBufferUpdate = false;
									}
								}
							}
							}
							for (EObject property : properties)
							{
								if (!containmentList.contains(property))
								{
									String newLine = "yType ";
									newLine += nameProvider.getDslRefName(yClass, property,
											YammDiagramPackage.Literals.YPROPERTY__TYPE);

									FeatureInfo propFeatureInfo = ((YProperty) property).getDslInfo().getFeatures()
											.get(YammDiagramPackage.Literals.YPROPERTY__TYPE);
//									((DslViewConnector) langConnector).addBufferUpdate = true;
									internalDsl.set(get(((SingleLinePropertyInfo) propFeatureInfo).getLine()), newLine);
//									((DslViewConnector) langConnector).addBufferUpdate = false;

								}
							}
							for (EObject clazz : superClasses)
							{
								if (!containmentList.contains(clazz))
								{
									String newLine = "ySuperClass ( ";
									for (Iterator<YClass> iter = ((YClass) clazz).getSuperClass().iterator(); iter
											.hasNext();)
									{
										newLine += nameProvider.getDslRefName(iter.next(), clazz,
												YammDiagramPackage.Literals.YCLASS__SUPER_CLASS);
										if (iter.hasNext())
											newLine += ", ";
									}
									newLine += ")";

									FeatureInfo clazzFeatureInfo = ((YClass) clazz).getDslInfo().getFeatures()
											.get(YammDiagramPackage.Literals.YCLASS__SUPER_CLASS);
//									((DslViewConnector) langConnector).addBufferUpdate = true;
									internalDsl.set(get(((SingleLinePropertyInfo) clazzFeatureInfo).getLine()),
											newLine);
//									((DslViewConnector) langConnector).addBufferUpdate = false;
								}
							}
							for (EObject operation : opReturnType)
							{
								if (!containmentList.contains(operation))
								{
									String newLine = "yReturnType ";
									newLine += nameProvider.getDslRefName(yClass, operation,
											YammDiagramPackage.Literals.YOPERATION__RETURN_TYPE);

									FeatureInfo propFeatureInfo = ((YOperation) operation).getDslInfo().getFeatures()
											.get(YammDiagramPackage.Literals.YOPERATION__RETURN_TYPE);
//									((DslViewConnector) langConnector).addBufferUpdate = true;
									internalDsl.set(get(((SingleLinePropertyInfo) propFeatureInfo).getLine()), newLine);
//									((DslViewConnector) langConnector).addBufferUpdate = false;

								}
							}
							for (EObject param : parameter)
							{
								if (!containmentList.contains(param))
								{
									String newLine = "yType ";
									newLine += nameProvider.getDslRefName(yClass, param,
											YammDiagramPackage.Literals.YPARAMETER__TYPE);

									FeatureInfo propFeatureInfo = ((YParameter) param).getDslInfo().getFeatures()
											.get(YammDiagramPackage.Literals.YPARAMETER__TYPE);
//									((DslViewConnector) langConnector).addBufferUpdate = true;
									internalDsl.set(get(((SingleLinePropertyInfo) propFeatureInfo).getLine()), newLine);
//									((DslViewConnector) langConnector).addBufferUpdate = false;

								}
							}
						}
					}

					((YObject) newValue.peek()).setDslInfo(factory.createDslInfo());

					insertLine = get(info.getInsertionLine());
					processed = info.getInsertionLine().getProcessedOffsets();
					yamminitDsl.doSwitch((EObject) newValue.peek());
					if (newValue.peek() instanceof YClass) {
						create = true;
						
						YClass newYClass = (YClass) newValue.peek();
						try {
							if (!createFullDsl)
								javaRepAdapter.createClass(newYClass);	
							if (!init)
								if (!createFullDsl)
									javaRepAdapter.refreshProject();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
					for (EStructuralFeature featureInClass : ((EObject) newValue.peek()).eClass()
							.getEAllStructuralFeatures())
					{
						if (featureInClass.getName().equals("dslInfo"))
							continue;
						EObject container = (EObject) newValue.peek();
						if (container.eGet(featureInClass) == null)
							continue;
						feature.push(featureInClass);
						eventType.push(featureInClass.isMany() ? Notification.ADD_MANY : Notification.ADD);
						newValue.push(container.eGet(featureInClass));

						yammSwitch.doSwitch(container);

						feature.pop();
						eventType.pop();
						newValue.pop();
					}
					
					if (newValue.peek() instanceof YClass) {		
						create = false;						
					}

				}
				else if (newValue.peek() == null && eventType.peek() == Notification.SET)
				{
					eventType.pop();
					eventType.push(Notification.REMOVE);
					doSwitch(yObject);
				}
				else if (eventType.peek() == Notification.ADD_MANY)
				{
					List list = (List<EObject>) newValue.peek();
					for (EObject value : (List<EObject>) newValue.peek())
					{
						eventType.pop();
						eventType.push(Notification.ADD);
						newValue.pop();
						newValue.push(value);
						doSwitch(yObject);
					}
				}
				else if (eventType.peek() == Notification.REMOVE)
				{
					if (oldValue instanceof YClass)
					{
						if (!createFullDsl)
						javaRepAdapter.deleteClass((YClass) oldValue);
						updateWorkspace = true;
						reload = true;
					}
					else if (oldValue instanceof YPackage)
					{
						if (!createFullDsl)
						javaRepAdapter.deletePackage((YPackage) oldValue);
						updateWorkspace = true;
					}
					DslInfo infoObjectToRemove = ((YObject) oldValue).getDslInfo();
					int firstLine = get(infoObjectToRemove.getFirstLine());
					int lastLine = get(infoObjectToRemove.getLastLine());
					internalDsl.removeRange(firstLine, lastLine);
//					objectList.remove(oldValue);
					((YObject) oldValue).setDslInfo(null);

					addOffset(lastLine, firstLine - lastLine - 1);
				}
				else if (eventType.peek() == Notification.REMOVE_MANY)
				{
					// TODO not used?????
//					for (EObject value : (List<EObject>) newValue.peek())
//					{
//						eventType.pop();
//						eventType.push(Notification.REMOVE);
//						newValue.pop();
//						newValue.push(value);
//						doSwitch(yObject);
//					}
				}
//				else
//					System.err.println("ERROR");

			}
			else if (featureInfo instanceof EffectInfo)
			{
				EffectInfo effectInfo = (EffectInfo) featureInfo;

				if (effectInfo.isIgnoreNotification())
				{
					effectInfo.setIgnoreNotification(false);
				}
				else
				{
					int fistLine = get(effectInfo.getFirstLineEffect());
					int lastLine = get(effectInfo.getLastLineEffect());			
					int lineCount = lastLine - fistLine + 1;
					
					String newEffect = (String) newValue.peek();
					String[] newEffectLines = (newEffect != null ? newEffect : "").split("\r\n|\r|\n");
					int newLineCount = newEffectLines.length; 
					if (newLineCount == 0) // new Effect and nothing in EffectView
						newLineCount = 1;
					
					if (lineCount != newLineCount)
					{
						if (newLineCount > lineCount)
						{
							for (int i = lastLine + 1, j = 0; i <= fistLine + newLineCount - 1; i++, j++)
								internalDsl.add(i, "");								
						}
						if (newLineCount < lineCount)
						{
							
							for (int i = lastLine; i > fistLine + newLineCount - 1; i--)
								internalDsl.remove(i);
						}
						
						effectInfo.getLastLineEffect().setPos(lastLine + newLineCount - lineCount);
						effectInfo.getLastLineEffect().setProcessedOffsets(effectInfo.getLastLineEffect().getProcessedOffsets() + 1);
						addOffset(lastLine + 1, newLineCount - lineCount);
					}
					
					int lineNumer = fistLine;
					for (String line : newEffectLines)
						internalDsl.set(lineNumer++, line);
				}

			}
			else if (featureInfo instanceof GuardInfo)
			{
				GuardInfo guardInfo = (GuardInfo) featureInfo;

				if (guardInfo.isIgnoreNotification())
				{
					guardInfo.setIgnoreNotification(false);
				}
				else
				{
					
					int fistLine = get(guardInfo.getFirstLineGuard());
					int lastLine = get(guardInfo.getLastLineGuard());			
					int lineCount = lastLine - fistLine + 1;
					
					String newGuard = (String) newValue.peek();
					String[] newEffectLines = (newGuard != null ? newGuard : "").split("\r\n|\r|\n");
					int newLineCount = newEffectLines.length; 
					
					if (lineCount != newLineCount)
					{
						if (newLineCount > lineCount)
						{
							for (int i = lastLine + 1, j = 0; i <= fistLine + newLineCount - 1; i++, j++)
								internalDsl.add(i, "");								
						}
						if (newLineCount < lineCount)
						{
							for (int i = lastLine; i >= fistLine + newLineCount; i--)
								internalDsl.remove(i);
						}
						
						guardInfo.getLastLineGuard().setPos(lastLine + newLineCount - lineCount);
						guardInfo.getLastLineGuard().setProcessedOffsets(guardInfo.getLastLineGuard().getProcessedOffsets() + 1);
						addOffset(lastLine + 1, newLineCount - lineCount);	
					}
					
					int lineNumer = fistLine;
					for (String line : newEffectLines)
						internalDsl.set(lineNumer++, line);
					
				}
			}

			return yObject;
		}

	}

	private int insertLine;
	private int processed;

	class YammInit extends YammDiagramSwitch<EObject>
	{
		@Override
		public EObject caseYModel(YModel model)
		{
			DslInfo info = model.getDslInfo();

			List<Line> lines = new ArrayList<>();
			int posFirstLine = insertLine;

			int processedOffsets = processed + 1;
			info.setFirstLine(createLine(processedOffsets, insertLine, lines));

			EMap<EStructuralFeature, FeatureInfo> featureToInfoMap = info.getFeatures();

			internalDsl.add(insertLine++, "yModel");

			List<String> simpleFeatures = Arrays.asList("ObjectID");
			initSimpleFeature(model, featureToInfoMap, simpleFeatures, insertLine, processedOffsets, lines);
			insertLine += simpleFeatures.size();

			internalDsl.add(insertLine++, "{");

			internalDsl.add(insertLine++, "yClazz");
			internalDsl.add(insertLine++, "{");
			ContainmentInfo containmentFeature = factory.createContainmentInfo();
			containmentFeature.setInsertionLine(createLine(processedOffsets, insertLine, lines));
			featureToInfoMap.put(model.eClass().getEStructuralFeature("clazz"), containmentFeature);
			internalDsl.add(insertLine++, "}");

			internalDsl.add(insertLine++, "yEnumerations");
			internalDsl.add(insertLine++, "{");
			containmentFeature = factory.createContainmentInfo();
			containmentFeature.setInsertionLine(createLine(processedOffsets, insertLine, lines));
			featureToInfoMap.put(model.eClass().getEStructuralFeature("enumerations"), containmentFeature);
			internalDsl.add(insertLine++, "}");

			internalDsl.add(insertLine++, "yPackages");
			internalDsl.add(insertLine++, "{");
			containmentFeature = factory.createContainmentInfo();
			containmentFeature.setInsertionLine(createLine(processedOffsets, insertLine, lines));
			featureToInfoMap.put(model.eClass().getEStructuralFeature("packages"), containmentFeature);
			internalDsl.add(insertLine++, "}");

			internalDsl.add(insertLine++, "}");

			info.setLastLine(createLine(processedOffsets, insertLine - 1, lines));
			addOffset(posFirstLine, insertLine - posFirstLine);

			return model;
		}

		@Override
		public EObject caseYParameter(YParameter parameter)
		{
			DslInfo info = parameter.getDslInfo();

			List<Line> lines = new ArrayList<>();
			int posFirstLine = insertLine;

			int processedOffsets = processed + 1;
			info.setFirstLine(createLine(processedOffsets, insertLine, lines));

			EMap<EStructuralFeature, FeatureInfo> featureToInfoMap = info.getFeatures();

			internalDsl.add(insertLine++, ",");

			List<String> simpleFeatures = Arrays.asList("isOrdered", "isUnique", "upperboundWildcard");
			initSimpleFeature(parameter, featureToInfoMap, simpleFeatures, insertLine, processedOffsets, lines);
			insertLine += simpleFeatures.size();

			internalDsl.add(insertLine++, "yParameter");

			simpleFeatures = Arrays.asList("ObjectID");
			initSimpleFeature(parameter, featureToInfoMap, simpleFeatures, insertLine, processedOffsets, lines);
			insertLine += simpleFeatures.size();

			internalDsl.add(insertLine++, "{");

			simpleFeatures = Arrays.asList("lower", "upper", "name", "qualifiedName", "direction", "defaultValue",
					"description", "type");
			initSimpleFeature(parameter, featureToInfoMap, simpleFeatures, insertLine, processedOffsets, lines);
			insertLine += simpleFeatures.size();

			internalDsl.add(insertLine++, "}");

			info.setLastLine(createLine(processedOffsets, insertLine - 1, lines));
			addOffset(posFirstLine, insertLine - posFirstLine);

			return parameter;
		}

		@Override
		public EObject caseYProperty(YProperty property)
		{
			DslInfo info = property.getDslInfo();

			List<Line> lines = new ArrayList<>();
			int posFirstLine = insertLine;

			int processedOffsets = processed + 1;
			info.setFirstLine(createLine(processedOffsets, insertLine, lines));

			EMap<EStructuralFeature, FeatureInfo> featureToInfoMap = info.getFeatures();

			internalDsl.add(insertLine++, ",");

			List<String> simpleFeatures = Arrays.asList("isOrdered", "isDerived", "isDerivedUnion", "association",
					"isUnique");
			initSimpleFeature(property, featureToInfoMap, simpleFeatures, insertLine, processedOffsets, lines);
			insertLine += simpleFeatures.size();

			internalDsl.add(insertLine++, "yProperty");

			simpleFeatures = Arrays.asList("ObjectID");
			initSimpleFeature(property, featureToInfoMap, simpleFeatures, insertLine, processedOffsets, lines);
			insertLine += simpleFeatures.size();

			internalDsl.add(insertLine++, "{");

			simpleFeatures = Arrays.asList("clazz", "visibility", "name", "qualifiedName", "static", "lower", "upper",
					"aggregation", "defaultValue", "type", "opposite", "observe");
			initSimpleFeature(property, featureToInfoMap, simpleFeatures, insertLine, processedOffsets, lines);
			insertLine += simpleFeatures.size();

			internalDsl.add(insertLine++, "}");

			info.setLastLine(createLine(processedOffsets, insertLine - 1, lines));
			addOffset(posFirstLine, insertLine - posFirstLine);

			return property;
		}

		@Override
		public EObject caseYOperation(YOperation operation)
		{
			DslInfo info = operation.getDslInfo();

			List<Line> lines = new ArrayList<>();
			int posFirstLine = insertLine;

			int processedOffsets = processed + 1;
			info.setFirstLine(createLine(processedOffsets, insertLine, lines));

			EMap<EStructuralFeature, FeatureInfo> featureToInfoMap = info.getFeatures();

			internalDsl.add(insertLine++, ", yOperation");

			List<String> simpleFeatures = Arrays.asList("ObjectID");
			initSimpleFeature(operation, featureToInfoMap, simpleFeatures, insertLine, processedOffsets, lines);
			insertLine += simpleFeatures.size();

			internalDsl.add(insertLine++, "{");

			simpleFeatures = Arrays.asList("name", "clazz", "returnType", "lower", "upper");
			initSimpleFeature(operation, featureToInfoMap, simpleFeatures, insertLine, processedOffsets, lines);
			insertLine += simpleFeatures.size();

			internalDsl.add(insertLine++, "yOwnedParameter");
			internalDsl.add(insertLine++, "{");
			ContainmentInfo containmentFeature = factory.createContainmentInfo();
			containmentFeature.setInsertionLine(createLine(processedOffsets, insertLine, lines));
			featureToInfoMap.put(operation.eClass().getEStructuralFeature("ownedParameter"), containmentFeature);
			internalDsl.add(insertLine++, "}");

			internalDsl.add(insertLine++, "yStateMachine");
			containmentFeature = factory.createContainmentInfo();
			containmentFeature.setInsertionLine(createLine(processedOffsets, insertLine, lines));
			featureToInfoMap.put(operation.eClass().getEStructuralFeature("stateMachine"), containmentFeature);
			internalDsl.add(insertLine++, "yStateMachineEnd");
			
			internalDsl.add(insertLine++, "}");

			info.setLastLine(createLine(processedOffsets, insertLine - 1, lines));
			addOffset(posFirstLine, insertLine - posFirstLine);

			return operation;
		}

		@Override
		public EObject caseYClass(YClass yClass)
		{
			DslInfo info = yClass.getDslInfo();

			List<Line> lines = new ArrayList<>();
			int posFirstLine = insertLine;

			int processedOffsets = processed + 1;
			info.setFirstLine(createLine(processedOffsets, insertLine, lines));

			EMap<EStructuralFeature, FeatureInfo> featureToInfoMap = info.getFeatures();

			internalDsl.add(insertLine++, ", ");
//			internalDslWithoutStatemachineConent.add(insertLine++, ", ");

			List<String> simpleFeatures = Arrays.asList("isAbstract");
			initSimpleFeature(yClass, featureToInfoMap, simpleFeatures, insertLine, processedOffsets, lines);
			insertLine += simpleFeatures.size();

			internalDsl.add(insertLine++, "yClass");
//			internalDslWithoutStatemachineConent.add(insertLine++, "yClass");

			simpleFeatures = Arrays.asList("ObjectID");
			initSimpleFeature(yClass, featureToInfoMap, simpleFeatures, insertLine, processedOffsets, lines);
			insertLine += simpleFeatures.size();

			internalDsl.add(insertLine++, "{");
//			internalDslWithoutStatemachineConent.add(insertLine++, "{");

			simpleFeatures = Arrays.asList("name", "qualifiedName", "observeQueue", "package", "superClass");
			initSimpleFeature(yClass, featureToInfoMap, simpleFeatures, insertLine, processedOffsets, lines);
			insertLine += simpleFeatures.size();

			internalDsl.add(insertLine++, "yOwnedAttribute");
//			internalDslWithoutStatemachineConent.add(insertLine++, "yOwnedAttribute");
			internalDsl.add(insertLine++, "{");
//			internalDslWithoutStatemachineConent.add(insertLine++, "{");
			ContainmentInfo containmentFeature = factory.createContainmentInfo();
			containmentFeature.setInsertionLine(createLine(processedOffsets, insertLine, lines));
			featureToInfoMap.put(yClass.eClass().getEStructuralFeature("ownedAttribute"), containmentFeature);
			internalDsl.add(insertLine++, "}");
//			internalDslWithoutStatemachineConent.add(insertLine++, "}");

			internalDsl.add(insertLine++, "yOwnedOperation");
			internalDsl.add(insertLine++, "{");
			containmentFeature = factory.createContainmentInfo();
			containmentFeature.setInsertionLine(createLine(processedOffsets, insertLine, lines));
			featureToInfoMap.put(yClass.eClass().getEStructuralFeature("ownedOperation"), containmentFeature);
			internalDsl.add(insertLine++, "}");

			internalDsl.add(insertLine++, "}");

			info.setLastLine(createLine(processedOffsets, insertLine - 1, lines));
			addOffset(posFirstLine, insertLine - posFirstLine);

			return yClass;
		}

		@Override
		public EObject caseYStateMachine(YStateMachine statemachine)
		{
			DslInfo info = statemachine.getDslInfo();

			List<Line> lines = new ArrayList<>();
			int posFirstLine = insertLine;

			int processedOffsets = processed + 1;
			info.setFirstLine(createLine(processedOffsets, insertLine, lines));

			EMap<EStructuralFeature, FeatureInfo> featureToInfoMap = info.getFeatures();

			internalDsl.add(insertLine++, "yStateMachine");

			List<String> simpleFeatures = Arrays.asList("ObjectID");
			initSimpleFeature(statemachine, featureToInfoMap, simpleFeatures, insertLine, processedOffsets, lines);
			insertLine += simpleFeatures.size();

			internalDsl.add(insertLine++, "{");

			simpleFeatures = Arrays.asList("desInitializer", "initialActive", "name", "qualifiedName", "rtc", "maxEffectsToBeProcessed",
					"calledOperation");
			initSimpleFeature(statemachine, featureToInfoMap, simpleFeatures, insertLine, processedOffsets, lines);
			insertLine += simpleFeatures.size();

			internalDsl.add(insertLine++, "yTransition");
			internalDsl.add(insertLine++, "{");
			ContainmentInfo containmentFeature = factory.createContainmentInfo();
			containmentFeature.setInsertionLine(createLine(processedOffsets, insertLine, lines));
			featureToInfoMap.put(statemachine.eClass().getEStructuralFeature("transition"), containmentFeature);
			internalDsl.add(insertLine++, "}");

			internalDsl.add(insertLine++, "ySubvertex");
			internalDsl.add(insertLine++, "{");
			containmentFeature = factory.createContainmentInfo();
			containmentFeature.setInsertionLine(createLine(processedOffsets, insertLine, lines));
			featureToInfoMap.put(statemachine.eClass().getEStructuralFeature("subvertex"), containmentFeature);
			internalDsl.add(insertLine++, "}");

			internalDsl.add(insertLine++, "yTrAttach");
			internalDsl.add(insertLine++, "{");
			containmentFeature = factory.createContainmentInfo();
			containmentFeature.setInsertionLine(createLine(processedOffsets, insertLine, lines));
			featureToInfoMap.put(statemachine.eClass().getEStructuralFeature("trAttach"), containmentFeature);
			internalDsl.add(insertLine++, "}");

			internalDsl.add(insertLine++, "}");

			info.setLastLine(createLine(processedOffsets, insertLine - 1, lines));
			addOffset(posFirstLine, insertLine - posFirstLine);

			return statemachine;
		}

		@Override
		public EObject caseYPackage(YPackage yPackage)
		{
			DslInfo info = yPackage.getDslInfo();

			List<Line> lines = new ArrayList<>();
			int posFirstLine = insertLine;

			int processedOffsets = processed + 1;
			info.setFirstLine(createLine(processedOffsets, insertLine, lines));

			EMap<EStructuralFeature, FeatureInfo> featureToInfoMap = info.getFeatures();

			internalDsl.add(insertLine++, ", yPackage");

			List<String> simpleFeatures = Arrays.asList("ObjectID");
			initSimpleFeature(yPackage, featureToInfoMap, simpleFeatures, insertLine, processedOffsets, lines);
			insertLine += simpleFeatures.size();

			internalDsl.add(insertLine++, "{");

			simpleFeatures = Arrays.asList("name", "qualifiedName", "package");
			initSimpleFeature(yPackage, featureToInfoMap, simpleFeatures, insertLine, processedOffsets, lines);
			insertLine += simpleFeatures.size();

			internalDsl.add(insertLine++, "yOwnedMemberPackage");
			internalDsl.add(insertLine++, "{");
			ContainmentInfo containmentFeature = factory.createContainmentInfo();
			containmentFeature.setInsertionLine(createLine(processedOffsets, insertLine, lines));
			featureToInfoMap.put(yPackage.eClass().getEStructuralFeature("ownedMemberPackage"), containmentFeature);
			internalDsl.add(insertLine++, "}");

			internalDsl.add(insertLine++, "}");

			info.setLastLine(createLine(processedOffsets, insertLine - 1, lines));
			addOffset(posFirstLine, insertLine - posFirstLine);

			return yPackage;
		}

		@Override
		public EObject caseYEnumeration(YEnumeration yEnumeration)
		{
			DslInfo info = yEnumeration.getDslInfo();

			List<Line> lines = new ArrayList<>();
			int posFirstLine = insertLine;

			int processedOffsets = processed + 1;
			info.setFirstLine(createLine(processedOffsets, insertLine, lines));

			EMap<EStructuralFeature, FeatureInfo> featureToInfoMap = info.getFeatures();

			internalDsl.add(insertLine++, ", yEnumeration");

			List<String> simpleFeatures = Arrays.asList("ObjectID");
			initSimpleFeature(yEnumeration, featureToInfoMap, simpleFeatures, insertLine, processedOffsets, lines);
			insertLine += simpleFeatures.size();

			internalDsl.add(insertLine++, "{");

			simpleFeatures = Arrays.asList("name", "qualifiedName", "package");
			initSimpleFeature(yEnumeration, featureToInfoMap, simpleFeatures, insertLine, processedOffsets, lines);
			insertLine += simpleFeatures.size();

			internalDsl.add(insertLine++, "yOwnedLiteral");
			internalDsl.add(insertLine++, "{");
			ContainmentInfo containmentFeature = factory.createContainmentInfo();
			containmentFeature.setInsertionLine(createLine(processedOffsets, insertLine, lines));
			featureToInfoMap.put(yEnumeration.eClass().getEStructuralFeature("ownedLiteral"), containmentFeature);
			internalDsl.add(insertLine++, "}");

			internalDsl.add(insertLine++, "}");

			info.setLastLine(createLine(processedOffsets, insertLine - 1, lines));
			addOffset(posFirstLine, insertLine - posFirstLine);

			return yEnumeration;
		}

		@Override
		public EObject caseYEnumerationLiteral(YEnumerationLiteral yEnumLiteral)
		{
			DslInfo info = yEnumLiteral.getDslInfo();

			List<Line> lines = new ArrayList<>();
			int posFirstLine = insertLine;

			int processedOffsets = processed + 1;
			info.setFirstLine(createLine(processedOffsets, insertLine, lines));

			EMap<EStructuralFeature, FeatureInfo> featureToInfoMap = info.getFeatures();

			internalDsl.add(insertLine++, ", yEnumerationLiteral");

			List<String> simpleFeatures = Arrays.asList("ObjectID");
			initSimpleFeature(yEnumLiteral, featureToInfoMap, simpleFeatures, insertLine, processedOffsets, lines);
			insertLine += simpleFeatures.size();

			internalDsl.add(insertLine++, "{");

			simpleFeatures = Arrays.asList("name", "qualifiedName");
			initSimpleFeature(yEnumLiteral, featureToInfoMap, simpleFeatures, insertLine, processedOffsets, lines);
			insertLine += simpleFeatures.size();

			internalDsl.add(insertLine++, "}");

			info.setLastLine(createLine(processedOffsets, insertLine - 1, lines));
			addOffset(posFirstLine, insertLine - posFirstLine);

			return yEnumLiteral;
		}

		@Override
		public EObject caseYTrAttachment(YTrAttachment attachment)
		{
			if (!objectIDToGuard.containsKey(attachment.getObjectID()))
				objectIDToGuard.put(attachment.getObjectID(), attachment);

			DslInfo info = attachment.getDslInfo();

			List<Line> lines = new ArrayList<>();
			int posFirstLine = insertLine;

			int processedOffsets = processed + 1;
			info.setFirstLine(createLine(processedOffsets, insertLine, lines));

			EMap<EStructuralFeature, FeatureInfo> featureToInfoMap = info.getFeatures();

			internalDsl.add(insertLine++, ", yTrAttachment");

			List<String> simpleFeatures = Arrays.asList("ObjectID");
			initSimpleFeature(attachment, featureToInfoMap, simpleFeatures, insertLine, processedOffsets, lines);
			insertLine += simpleFeatures.size();

			internalDsl.add(insertLine++, "{");

			simpleFeatures = Arrays.asList("name", "qualifiedName");
			initSimpleFeature(attachment, featureToInfoMap, simpleFeatures, insertLine, processedOffsets, lines);
			insertLine += simpleFeatures.size();

			internalDsl.add(insertLine++, "yGuard");
			internalDsl.add(insertLine++, "{");
			GuardInfo effectGuard = factory.createGuardInfo();
			Line line = factory.createLine();
			line.setPos(insertLine);
			line.setProcessedOffsets(processedOffsets);
			effectGuard.setFirstLineGuard(line);
			
//			String[] guardLines = (attachment.getGuardStringRep() != null ? attachment.getGuardStringRep() : "").split("\r\n|\r|\n");
//					
//			line = factory.createLine();
//			line.setPos(insertLine + guardLines.length - 1);
//			line.setProcessedOffsets(processedOffsets);
//			effectGuard.setLastLineGuard(line);
//			
//			for (String oneLine : guardLines)
//			{
//				internalDsl.add(insertLine++, oneLine);
//			}
			line = factory.createLine();
			line.setPos(insertLine);
			line.setProcessedOffsets(processedOffsets);
			effectGuard.setLastLineGuard(line);
			internalDsl.add(insertLine++, "");
			
			
			

			featureToInfoMap.put(attachment.eClass().getEStructuralFeature("guardStringRep"), effectGuard);
			internalDsl.add(insertLine++, "}");

			if (createFullDsl)
			{
				simpleFeatures = Arrays.asList("transition");
				initSimpleFeature(attachment, featureToInfoMap, simpleFeatures, insertLine, processedOffsets, lines);
				insertLine += simpleFeatures.size();
			}

			internalDsl.add(insertLine++, "yEffects");
			internalDsl.add(insertLine++, "{");
			ContainmentInfo containmentFeature = factory.createContainmentInfo();
			containmentFeature.setInsertionLine(createLine(processedOffsets, insertLine, lines));
			featureToInfoMap.put(attachment.eClass().getEStructuralFeature("effects"), containmentFeature);
			internalDsl.add(insertLine++, "}");

			internalDsl.add(insertLine++, "}");

			info.setLastLine(createLine(processedOffsets, insertLine - 1, lines));
			addOffset(posFirstLine, insertLine - posFirstLine);

			return attachment;
		}

		@Override
		public EObject caseYEffect(YEffect effect)
		{
			if (!objectIDToEffect.containsKey(effect.getObjectID()))
				objectIDToEffect.put(effect.getObjectID(), effect);

			DslInfo info = effect.getDslInfo();

			List<Line> lines = new ArrayList<>();
			int posFirstLine = insertLine;

			int processedOffsets = processed + 1;
			info.setFirstLine(createLine(processedOffsets, insertLine, lines));

			EMap<EStructuralFeature, FeatureInfo> featureToInfoMap = info.getFeatures();

			internalDsl.add(insertLine++, ", yEffect");

			List<String> simpleFeatures = Arrays.asList("breakpoint", "ObjectID");
			initSimpleFeature(effect, featureToInfoMap, simpleFeatures, insertLine, processedOffsets, lines);
			insertLine += simpleFeatures.size();

			internalDsl.add(insertLine++, "{{");

			EffectInfo effectInfo = factory.createEffectInfo();
			Line line = factory.createLine();
			line.setPos(insertLine);
			line.setProcessedOffsets(processedOffsets);
			effectInfo.setFirstLineEffect(line);
			
//			String[] effectLines = (effect.getEffectStringRep() != null ? effect.getEffectStringRep() : "").split("\r\n|\r|\n");
//			
//			line = factory.createLine();
//			line.setPos(insertLine + effectLines.length - 1);
//			line.setProcessedOffsets(processedOffsets);
//			effectInfo.setLastLineEffect(line);	
//			
//			for (String oneLine : effectLines)
//			{
//				internalDsl.add(insertLine++, oneLine);
//			}
			line = factory.createLine();
			line.setPos(insertLine);
			line.setProcessedOffsets(processedOffsets);
			effectInfo.setLastLineEffect(line);	
			internalDsl.add(insertLine++, "");
			
			
			
				
			
			internalDsl.add(insertLine++, "}}");
			featureToInfoMap.put(effect.eClass().getEStructuralFeature("effectStringRep"), effectInfo);

			info.setLastLine(createLine(processedOffsets, insertLine - 1, lines));
			addOffset(posFirstLine, insertLine - posFirstLine);

			return effect;
		}

		@Override
		public EObject caseYState(YState state)
		{
			DslInfo info = state.getDslInfo();

			List<Line> lines = new ArrayList<>();
			int posFirstLine = insertLine;

			int processedOffsets = processed + 1;
			info.setFirstLine(createLine(processedOffsets, insertLine, lines));

			EMap<EStructuralFeature, FeatureInfo> featureToInfoMap = info.getFeatures();

			if (((YStateMachine) state.eContainer()).getSubvertex().isEmpty())
				internalDsl.add(insertLine++, "yState");
			else
				internalDsl.add(insertLine++, ", yState");

			List<String> simpleFeatures = Arrays.asList("ObjectID");
			initSimpleFeature(state, featureToInfoMap, simpleFeatures, insertLine, processedOffsets, lines);
			insertLine += simpleFeatures.size();

			internalDsl.add(insertLine++, "{");

			simpleFeatures = Arrays.asList("name", "qualifiedName", "outgoing", "incoming");
			initSimpleFeature(state, featureToInfoMap, simpleFeatures, insertLine, processedOffsets, lines);
			insertLine += simpleFeatures.size();

			internalDsl.add(insertLine++, "}");

			info.setLastLine(createLine(processedOffsets, insertLine - 1, lines));
			addOffset(posFirstLine, insertLine - posFirstLine);

			return state;
		}

		@Override
		public EObject caseYPseudostate(YPseudostate pseudoState)
		{
			DslInfo info = pseudoState.getDslInfo();

			List<Line> lines = new ArrayList<>();
			int posFirstLine = insertLine;

			int processedOffsets = processed + 1;
			info.setFirstLine(createLine(processedOffsets, insertLine, lines));

			EMap<EStructuralFeature, FeatureInfo> featureToInfoMap = info.getFeatures();

			if (((YStateMachine) pseudoState.eContainer()).getSubvertex().isEmpty())
				internalDsl.add(insertLine++, "yPseudostate");
			else
				internalDsl.add(insertLine++, ", yPseudostate");

			List<String> simpleFeatures = Arrays.asList("ObjectID");
			initSimpleFeature(pseudoState, featureToInfoMap, simpleFeatures, insertLine, processedOffsets, lines);
			insertLine += simpleFeatures.size();

			internalDsl.add(insertLine++, "{");

			simpleFeatures = Arrays.asList("name", "qualifiedName", "outgoing", "incoming");
			initSimpleFeature(pseudoState, featureToInfoMap, simpleFeatures, insertLine, processedOffsets, lines);
			insertLine += simpleFeatures.size();

			internalDsl.add(insertLine++, "}");

			info.setLastLine(createLine(processedOffsets, insertLine - 1, lines));
			addOffset(posFirstLine, insertLine - posFirstLine);

			return pseudoState;
		}

		@Override
		public EObject caseYFinalState(YFinalState finalState)
		{
			DslInfo info = finalState.getDslInfo();

			List<Line> lines = new ArrayList<>();
			int posFirstLine = insertLine;

			int processedOffsets = processed + 1;
			info.setFirstLine(createLine(processedOffsets, insertLine, lines));

			EMap<EStructuralFeature, FeatureInfo> featureToInfoMap = info.getFeatures();

			if (((YStateMachine) finalState.eContainer()).getSubvertex().isEmpty())
				internalDsl.add(insertLine++, "yFinalState");
			else
				internalDsl.add(insertLine++, ", yFinalState");

			List<String> simpleFeatures = Arrays.asList("ObjectID");
			initSimpleFeature(finalState, featureToInfoMap, simpleFeatures, insertLine, processedOffsets, lines);
			insertLine += simpleFeatures.size();

			internalDsl.add(insertLine++, "{");

			simpleFeatures = Arrays.asList("name", "qualifiedName", "outgoing", "incoming");
			initSimpleFeature(finalState, featureToInfoMap, simpleFeatures, insertLine, processedOffsets, lines);
			insertLine += simpleFeatures.size();

			internalDsl.add(insertLine++, "}");

			info.setLastLine(createLine(processedOffsets, insertLine - 1, lines));
			addOffset(posFirstLine, insertLine - posFirstLine);

			return finalState;
		}

		@Override
		public EObject caseYTransition(YTransition transition)
		{
			DslInfo info = transition.getDslInfo();

			List<Line> lines = new ArrayList<>();
			int posFirstLine = insertLine;

			int processedOffsets = processed + 1;
			info.setFirstLine(createLine(processedOffsets, insertLine, lines));

			EMap<EStructuralFeature, FeatureInfo> featureToInfoMap = info.getFeatures();

			if (((YStateMachine) transition.eContainer()).getTransition().isEmpty())
				internalDsl.add(insertLine++, "yTransition");
			else
				internalDsl.add(insertLine++, ", yTransition");

			List<String> simpleFeatures = Arrays.asList("ObjectID");
			initSimpleFeature(transition, featureToInfoMap, simpleFeatures, insertLine, processedOffsets, lines);
			insertLine += simpleFeatures.size();

			internalDsl.add(insertLine++, "{");

			simpleFeatures = Arrays.asList("name", "qualifiedName", "source", "target", "attachment");
			initSimpleFeature(transition, featureToInfoMap, simpleFeatures, insertLine, processedOffsets, lines);
			insertLine += simpleFeatures.size();

			internalDsl.add(insertLine++, "}");

			info.setLastLine(createLine(processedOffsets, insertLine - 1, lines));
			addOffset(posFirstLine, insertLine - posFirstLine);

			return transition;
		}
		

		private void initSimpleFeature(EObject object, EMap<EStructuralFeature, FeatureInfo> featureToInfoMap,
				List<String> simpleFeatures, int start, int processedOffsets, List<Line> lines)
		{
			for (String simpleFeature : simpleFeatures)
			{
				SingleLinePropertyInfo simpleInfo = factory.createSingleLinePropertyInfo();
				Line line = factory.createLine();
				line.setPos(start++);
				line.setProcessedOffsets(processedOffsets);
				set(line);
				lines.add(line);
				simpleInfo.setLine(line);
				featureToInfoMap.put(object.eClass().getEStructuralFeature(simpleFeature), simpleInfo);
				internalDsl.add(start - 1, "");
			}
		}

		private Line createLine(int processedOffsets, int insertLine, List<Line> lines)
		{
			Line line = factory.createLine();
			line.setPos(insertLine);
			line.setProcessedOffsets(processedOffsets);
			set(line);
			lines.add(line);
			return line;
		}

	}

	class YammQualifiedNamesProvider
	{
		public String getDslRefName(EObject content, EObject featureContainingObj, EStructuralFeature feature)
		{
			if (featureContainingObj instanceof YClass)
			{
				if (feature == YammDiagramPackage.Literals.YCLASS__PACKAGE)
				{
					return getQualifiedPackageName((YPackage) ((YClass) featureContainingObj).getPackage());
				}
				else if (feature == YammDiagramPackage.Literals.YCLASS__SUPER_CLASS)
				{
					YNamedElement pack = ((YClass) content).getPackage();
					if (pack == null || pack == ((YClass) featureContainingObj).getPackage())
					{
						return ((YClass) content).getName();
					}
					else
					{
						return qualifiedClassOrEnumName((YClass) content);
					}
				}
			}
			else if (featureContainingObj instanceof YEnumeration)
			{
				if (feature == YammDiagramPackage.Literals.YENUMERATION__PACKAGE)
				{
					return getQualifiedPackageName((YPackage) ((YEnumeration) featureContainingObj).getPackage());
				}
			}
			else if (featureContainingObj instanceof YOperation)
			{
				if (feature == YammDiagramPackage.Literals.YOPERATION__CLAZZ)
				{
					return ((YClass) content).getName();
				}
				else if (feature == YammDiagramPackage.Literals.YOPERATION__RETURN_TYPE)
				{
					YNamedElement packContain = ((YOperation) featureContainingObj).getClazz().getPackage();
					YNamedElement packContent = ((YClass) content).getPackage();

					if (packContent == null || packContain == packContent)
					{
						return ((YClass) content).getName();
					}
					else
					{
						return qualifiedClassOrEnumName((YClass) content);
					}
				}
			}
			else if (featureContainingObj instanceof YPackage)
			{
				if (feature == YammDiagramPackage.Literals.YPACKAGE__PACKAGE)
				{
					return getQualifiedPackageName(((YPackage) featureContainingObj).getPackage());
				}
			}
			else if (featureContainingObj instanceof YParameter)
			{
				if (feature == YammDiagramPackage.Literals.YPARAMETER__TYPE)
				{
					YNamedElement packContain = ((YClass) ((YParameter) featureContainingObj).eContainer().eContainer())
							.getPackage();
					YNamedElement packContent = content instanceof YClass 
							? ((YClass) content).getPackage() 
							: ((YEnumeration) content).getPackage();

					if (packContent == null || packContain == packContent)
					{
						return ((YType) content).getName();
					}
					else
					{
						return qualifiedClassOrEnumName((YType) content);
					}
				}
			}
			else if (featureContainingObj instanceof YProperty)
			{
				if (feature == YammDiagramPackage.Literals.YPROPERTY__CLAZZ)
				{
					return ((YClass) content).getName();
				}
				else if (feature == YammDiagramPackage.Literals.YPROPERTY__TYPE)
				{
					YNamedElement packContain = null;
					try
					{
						packContain = ((YClass) featureContainingObj.eContainer()).getPackage();
					}
					catch (Exception e)
					{
						e.printStackTrace();
					}

					YNamedElement packContent = null;
					if (content instanceof YClass)
						packContent = ((YClass) content).getPackage();
					else if (content instanceof YEnumeration)
						packContent = ((YEnumeration) content).getPackage();

					if (packContent == null || packContain == packContent)
					{
						return ((YType) content).getName();
					}
					else
					{
						return qualifiedClassOrEnumName((YType) content);
					}
				}
				else if (feature == YammDiagramPackage.Literals.YPROPERTY__OPPOSITE)
				{

					String qualifiedName = ((YClass) ((YProperty) content).eContainer()).getName() + "."
							+ ((YProperty) content).getName();
					YNamedElement classPackage = ((YClass) ((YProperty) content).eContainer()).getPackage();
					if (classPackage == null)
						return qualifiedName;
					return getQualifiedPackageName((YPackage) classPackage) + "." + qualifiedName;

				}
			}
			else if (featureContainingObj instanceof YStateMachine)
			{
				if (feature == YammDiagramPackage.Literals.YSTATE_MACHINE__OPERATION)
				{
					return ((YOperation) content).getName();
				}
			}
			else if (featureContainingObj instanceof YVertex)
			{
				if (feature == YammDiagramPackage.Literals.YVERTEX__INCOMING
						|| feature == YammDiagramPackage.Literals.YVERTEX__OUTGOING)
				{
					return ((YTransition) content).getName();
				}
			}
			else if (featureContainingObj instanceof YTransition)
			{
				if (feature == YammDiagramPackage.Literals.YTRANSITION__ATTACHMENT)
				{
					return ((YTrAttachment) content).getName();
				}
				else if (feature == YammDiagramPackage.Literals.YTRANSITION__SOURCE
						|| feature == YammDiagramPackage.Literals.YTRANSITION__TARGET)
				{
					return ((YNamedElement) content).getName();
				}
			}
			else if (featureContainingObj instanceof YTrAttachment)
			{
				if (feature == YammDiagramPackage.Literals.YTR_ATTACHMENT__TRANSITION)
				{
					return ((YTransition) content).getName();
				}
			}

			return "";
		}

		public String qualifiedClassOrEnumName(YType yType)
		{
			String qualifiedName = yType.getName();

			YNamedElement pack = null;
			if (yType instanceof YClass)
				pack = ((YClass) yType).getPackage();
			else if (yType instanceof YEnumeration)
				pack = ((YEnumeration) yType).getPackage();
		
			if (pack != null)
			{
				qualifiedName = pack.getName() + "." + qualifiedName;
				YPackage yPack = (YPackage) pack;
				while (yPack.getParentElement() != null)
				{
					qualifiedName = yPack.getParentElement().getName() + "." + qualifiedName;
					yPack = yPack.getParentElement();
				}
			}

			return qualifiedName;
		}

		public String getQualifiedPackageName(YPackage yPackage)
		{
			String qualifiedName = yPackage.getName();
			while (yPackage.getParentElement() != null)
			{
				qualifiedName = yPackage.getParentElement().getName() + "." + qualifiedName;
				yPackage = yPackage.getParentElement();
			}
			return qualifiedName;
		}

	}

	private void updateReferences(EObject yObject, EObject referencesElement)
	{
		if (yObject instanceof YClass)
		{
			YClass yClass = (YClass) yObject;
			for (YOperation operation : yClass.getOwnedOperation())
			{
				String newLine2 = "yClazz ";
				newLine2 += nameProvider.getDslRefName(referencesElement, operation,
						YammDiagramPackage.Literals.YOPERATION__CLAZZ);
				FeatureInfo propFeatureInfo = operation.getDslInfo().getFeatures()
						.get(YammDiagramPackage.Literals.YOPERATION__CLAZZ);
				internalDsl.set(get(((SingleLinePropertyInfo) propFeatureInfo).getLine()), newLine2);
			}
			for (YProperty property : yClass.getOwnedAttribute())
			{
				String newLine2 = "yClazz ";
				newLine2 += nameProvider.getDslRefName(referencesElement, property,
						YammDiagramPackage.Literals.YPROPERTY__CLAZZ);
				FeatureInfo propFeatureInfo = property.getDslInfo().getFeatures()
						.get(YammDiagramPackage.Literals.YPROPERTY__CLAZZ);
				internalDsl.set(get(((SingleLinePropertyInfo) propFeatureInfo).getLine()), newLine2);
				updateReferences(property, referencesElement);
			}
			EObjectQuery objectQuery = new EObjectQuery(yClass);
			for (EObject property : objectQuery.getInverseReferences(YammDiagramPackage.Literals.YPROPERTY__TYPE))
			{

				String newLine2 = "yType ";
				newLine2 += nameProvider.getDslRefName(referencesElement, property,
						YammDiagramPackage.Literals.YPROPERTY__TYPE);
				FeatureInfo propFeatureInfo = ((YProperty) property).getDslInfo().getFeatures()
						.get(YammDiagramPackage.Literals.YPROPERTY__TYPE);
				internalDsl.set(get(((SingleLinePropertyInfo) propFeatureInfo).getLine()), newLine2);
			}
			for (EObject subClass : objectQuery.getInverseReferences(YammDiagramPackage.Literals.YCLASS__SUPER_CLASS))
			{
				String newLine2 = "ySuperClass ( ";
				for (Iterator<YClass> iter = ((YClass) subClass).getSuperClass().iterator(); iter.hasNext();)
				{
					newLine2 += nameProvider.getDslRefName(iter.next(), subClass,
							YammDiagramPackage.Literals.YCLASS__SUPER_CLASS);
					if (iter.hasNext())
						newLine2 += ", ";
				}
				newLine2 += ")";

				FeatureInfo clazzFeatureInfo = ((YClass) subClass).getDslInfo().getFeatures()
						.get(YammDiagramPackage.Literals.YCLASS__SUPER_CLASS);
				internalDsl.set(get(((SingleLinePropertyInfo) clazzFeatureInfo).getLine()), newLine2);
			}
		}
		else if (yObject instanceof YPackage)
		{
			YPackage yPackage = (YPackage) yObject;
			for (YObject member : yPackage.getOwnedMemberPackage())
			{
				if (member instanceof YPackage)
				{
					String newLine2 = "yPackage ";
					newLine2 += nameProvider.getDslRefName(referencesElement, member,
							YammDiagramPackage.Literals.YPACKAGE__PACKAGE);
					FeatureInfo propFeatureInfo = member.getDslInfo().getFeatures()
							.get(YammDiagramPackage.Literals.YPACKAGE__PACKAGE);
					internalDsl.set(get(((SingleLinePropertyInfo) propFeatureInfo).getLine()), newLine2);
					updateReferences(member, referencesElement);
				}
				else if (member instanceof YClass)
				{
					String newLine2 = "yPackage ";
					newLine2 += nameProvider.getDslRefName(referencesElement, ((YClass) member),
							YammDiagramPackage.Literals.YCLASS__PACKAGE);
					FeatureInfo propFeatureInfo = member.getDslInfo().getFeatures()
							.get(YammDiagramPackage.Literals.YCLASS__PACKAGE);
					internalDsl.set(get(((SingleLinePropertyInfo) propFeatureInfo).getLine()), newLine2);
					updateReferences(member, referencesElement);
				}
				else if (member instanceof YEnumeration)
				{
					String newLine2 = "yPackage ";
					newLine2 += nameProvider.getDslRefName(referencesElement, ((YEnumeration) member),
							YammDiagramPackage.Literals.YENUMERATION__PACKAGE);
					FeatureInfo propFeatureInfo = member.getDslInfo().getFeatures()
							.get(YammDiagramPackage.Literals.YENUMERATION__PACKAGE);
					internalDsl.set(get(((SingleLinePropertyInfo) propFeatureInfo).getLine()), newLine2);
					updateReferences(member, referencesElement);
				}
			}
		}
		else if (yObject instanceof YProperty)
		{
			EObjectQuery oppositeQuery = new EObjectQuery(yObject);
			Collection<EObject> opposites = oppositeQuery
					.getInverseReferences(YammDiagramPackage.Literals.YPROPERTY__OPPOSITE);
			for (EObject opposite : opposites)
			{
				String newLine2 = "yOpposite ";
				newLine2 += nameProvider.getDslRefName(yObject, opposite,
						YammDiagramPackage.Literals.YPROPERTY__OPPOSITE);
				FeatureInfo propFeatureInfo = ((YProperty) opposite).getDslInfo().getFeatures()
						.get(YammDiagramPackage.Literals.YPROPERTY__OPPOSITE);
				internalDsl.set(get(((SingleLinePropertyInfo) propFeatureInfo).getLine()), newLine2);
			}
		}
		else if (yObject instanceof YEnumeration)
		{
			EObjectQuery objectQuery = new EObjectQuery(yObject);
			for (EObject property : objectQuery.getInverseReferences(YammDiagramPackage.Literals.YPROPERTY__TYPE))
			{
				String newLine2 = "yType ";
				newLine2 += nameProvider.getDslRefName(yObject, property,
						YammDiagramPackage.Literals.YPROPERTY__TYPE);
				FeatureInfo propFeatureInfo = ((YProperty) property).getDslInfo().getFeatures()
						.get(YammDiagramPackage.Literals.YPROPERTY__TYPE);
				internalDsl.set(get(((SingleLinePropertyInfo) propFeatureInfo).getLine()), newLine2);
			}
		}
	}
}
