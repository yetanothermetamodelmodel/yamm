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
package dev.yamm.objDiagram;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.diagram.business.internal.metamodel.spec.DSemanticDiagramSpec;
import org.eclipse.sirius.ui.business.api.session.SessionEditorInput;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IStartup;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.EditorReference;

import dev.yamm.ChartManagement;
import dev.yamm.Common;
import dev.yamm.ObjectManagement;
import dev.yamm.ObjectDiagram.ODAttribute;
import dev.yamm.ObjectDiagram.ODObject;
import dev.yamm.ObjectDiagram.ODReference;
import dev.yamm.ObjectDiagram.ODType;
import dev.yamm.ObjectDiagram.ObjectDiagram;
import dev.yamm.ObjectDiagram.ObjectDiagramFactory;
import dev.yamm.logger.YAMMLogger;

public class ModelSynchronizer {

	private static YAMMLogger logger = YAMMLogger.getYAMMLogger("YAMM Log");

	public ChartManagement reflectivStateChart;
	private ObjectManagement om;
	private ObjectDiagram objectDiagram;
	private DSemanticDiagram diagram;
	private Map<ODObject, EObject> odToRuntime = new HashMap<ODObject, EObject>();
	private Map<EObject, ODObject> runtimeToOd = new HashMap<EObject, ODObject>();
	public String diagramID;
	
	public ModelSynchronizer(ChartManagement reflectivStateChart) {
		this.reflectivStateChart = reflectivStateChart;
		om = reflectivStateChart.objectManagement;
	}

	public void updateObjectDiagram() {
		if (objectDiagram == null)
			return;
		TransactionalEditingDomain ted = TransactionUtil.getEditingDomain(objectDiagram);
		ted.getCommandStack().execute(new RecordingCommand(ted) {
			@Override
			protected void doExecute() {

				// transform all runtime objects if they are not in runtimeToOd (with(and
				// update) attributes)
				// get all objects
				EMap<String, EObject> allRuntimeObjects = reflectivStateChart.objectManagement.getObjectCache(1);
				if (allRuntimeObjects == null)
					return;
				for (Entry<String, EObject> runtimeobject : allRuntimeObjects.entrySet()) {
					if (!runtimeToOd.containsKey(runtimeobject.getValue())) {
						// create ODObject
						EClass runtimeEClass = runtimeobject.getValue().eClass();
						String qualifiedTypeName = Common.getQualifiedNameEObject(runtimeEClass);
						ODType odType = objectDiagram.getTypes().get(qualifiedTypeName);
						if (odType == null)
							continue;
						ODObject odObject = ObjectDiagramFactory.eINSTANCE.createODObject();
						odObject.setType(odType);
						odObject.setObjectID(om.getGen(runtimeobject.getValue(), "ObjectID"));
						runtimeToOd.put(runtimeobject.getValue(), odObject);
						odToRuntime.put(odObject, runtimeobject.getValue());
						for (EAttribute eAttribute : runtimeobject.getValue().eClass().getEAllAttributes()) {
							if (eAttribute.getName().equals("yClass") || eAttribute.getName().equals("ObjectID"))
								continue;
							ODAttribute odAttribute = ObjectDiagramFactory.eINSTANCE.createODAttribute();
							odAttribute.setName(eAttribute.getName());
							odAttribute.setLower(eAttribute.getLowerBound());
							odAttribute.setUpper(eAttribute.getUpperBound());
							String valuesString = "";
							if (eAttribute.getUpperBound() != 1) {
								List<Object> values = (List<Object>) runtimeobject.getValue().eGet(eAttribute);
								valuesString = values.stream().map(value -> value.toString())
										.collect(Collectors.joining(" ,"));
							} else
							{
								Object value = runtimeobject.getValue().eGet(eAttribute);
								if (value != null)
									valuesString = value.toString();
							}
								
							odAttribute.setValue(valuesString);

							ODType attributeType;
							if (eAttribute.getEType() instanceof EEnum) {
								String typeName = Common.getQualifiedNameEObject(eAttribute.getEType());
								attributeType = objectDiagram.getTypes().get(typeName);
							} else {
								String typeName = eAttribute.getEType().getName();
								if ("EInt".equals(typeName))
									typeName = "EInteger";
								else if ("EJavaObject".equals(typeName))
									typeName = "EObject";
								attributeType = objectDiagram.getTypes().get("Types." + typeName.substring(1));
							}
							odAttribute.setDataType(attributeType);
							odObject.getAttributes().add(odAttribute);

						}
						objectDiagram.getObjects().add(odObject);
					} else {
						// update attributes
						ODObject odObject = runtimeToOd.get(runtimeobject.getValue());
						for (ODAttribute odAttribute : odObject.getAttributes()) {
							EClass runtimeEClass = runtimeobject.getValue().eClass();
							EAttribute eAttribute = (EAttribute) runtimeEClass
									.getEStructuralFeature(odAttribute.getName());
							String valuesString = "";
							if (eAttribute.getUpperBound() != 1) {
								List<Object> values = (List<Object>) runtimeobject.getValue().eGet(eAttribute);
								valuesString = values.stream().map(value -> value.toString())
										.collect(Collectors.joining(" ,"));
							} else
							{
								Object value = runtimeobject.getValue().eGet(eAttribute);
								if (value != null)
									valuesString = value.toString();
							}
							odAttribute.setValue(valuesString);
						}
					}
				}
				// set and update References
				for (Entry<EObject, ODObject> runtimeAndOd : runtimeToOd.entrySet()) {
					EObject runtime = runtimeAndOd.getKey();
					ODObject od = runtimeAndOd.getValue();

					for (EReference eReference : runtime.eClass().getEAllReferences()) {
						if (eReference.getName().equals("this"))
							continue;
						Object runtimeValue = runtime.eGet(eReference);
						Optional<ODReference> optionalODRef = od.getReferences().stream()
								.filter(odRef -> odRef.getName().equals(eReference.getName())).findAny();
						if (optionalODRef.isPresent()) {
							// TODO: opposite ????
							// update
							ODReference odReference = optionalODRef.get();
							odReference.getOpposites().clear();
							if (eReference.getUpperBound() == 1) {
								ODObject value = runtimeToOd.get(runtimeValue);
								odReference.getValue().clear();
								if (value != null)
									odReference.getValue().add(value);
							} else {
								odReference.getValue().clear();
								for (EObject runtimeValueElement : (List<EObject>) runtimeValue) {
									ODObject value = runtimeToOd.get(runtimeValueElement);
									if (value != null)
										odReference.getValue().add(value);
								}
							}
						} else if (runtimeValue != null) {
							// TODO: opposite....
							// create
							ODReference odReference = ObjectDiagramFactory.eINSTANCE.createODReference();
							odReference.setName(eReference.getName());
							odReference.setLower(eReference.getLowerBound());
							odReference.setUpper(eReference.getUpperBound());
							if (eReference.getEOpposite() != null) {
								odReference.setBidirectional(true);
							}

							if (eReference.getUpperBound() == 1) {
								ODObject value = runtimeToOd.get(runtimeValue);
								if (value != null)
									odReference.getValue().add(value);
							} else {
								for (EObject runtimeValueElement : (List<EObject>) runtimeValue) {
									ODObject value = runtimeToOd.get(runtimeValueElement);
									if (value != null)
										odReference.getValue().add(value);
								}
							}
							od.getReferences().add(odReference);
						}
					}
				}
				
				// set opposite
				for (Entry<EObject, ODObject> runtimeAndOd : runtimeToOd.entrySet()) {
					EObject runtime = runtimeAndOd.getKey();
					ODObject od = runtimeAndOd.getValue();
					for (EReference eReference : runtime.eClass().getEAllReferences()) 
					{
						if (eReference.getEOpposite() != null)
						{
							EReference runtimeOppositeMetadata = eReference.getEOpposite();
							Optional<ODReference> optionalODRef = od.getReferences().stream().filter(ref -> ref.getName().equals(eReference.getName())).findAny();
							if (optionalODRef.isPresent())
							{
								ODReference odRef = optionalODRef.get();
								for (ODObject odValue : odRef.getValue())
								{
									Optional<ODReference> optionalRef = odValue.getReferences().stream()
											.filter(ref -> ref.getName().equals(runtimeOppositeMetadata.getName())).findAny();
									if (optionalRef.isPresent())
									{
										ODReference oppositeOdRef = optionalRef.get();
										odRef.getOpposites().add(oppositeOdRef);
									}
								}
							}
						}
					}
				}
				
//				DialectManager.INSTANCE.refresh(diagram, new NullProgressMonitor());
			}
		});
	}

	public void updateRuntimeModel() {
		if (objectDiagram == null)
			return;
		int layer = 1;

		for (ODObject odObjects : objectDiagram.getObjects()) {
			
			if (!odToRuntime.containsKey(odObjects))
			{
				String className = odObjects.getType().getQualifiedName();
				EClass eclass = (EClass) reflectivStateChart.objectManagement.getEClassifier(className, layer);
				EObject runtimeObject = eclass.getEPackage().getEFactoryInstance().create(eclass);
				if (runtimeObject instanceof EObjectImpl)
					((EObjectImpl) runtimeObject).eSetClass(eclass);
				odToRuntime.put(odObjects, runtimeObject);
				runtimeToOd.put(runtimeObject, odObjects);

				String objectID = odObjects.getObjectID() != null && !odObjects.getObjectID().equals("")
						? odObjects.getObjectID()
						: Integer.toHexString(runtimeObject.hashCode());
				reflectivStateChart.execute.maps[layer].put(objectID, runtimeObject);
				reflectivStateChart.execute.reflectivStateChart.objectManagement.introduceEObjectToLayerInformation(layer,
						runtimeObject);

				// objectID
				if (runtimeObject.eClass().getEStructuralFeature("ObjectID") != null)
					reflectivStateChart.execute.reflectivStateChart.objectManagement.set(runtimeObject, objectID,
							"ObjectID");

				// initialize this:
				if (runtimeObject.eClass().getEStructuralFeature("this") != null)
					reflectivStateChart.execute.reflectivStateChart.objectManagement.set(runtimeObject, runtimeObject,
							"this");

				// initialize yClass:
				if (runtimeObject.eClass().getEStructuralFeature("yClass") != null) {
					EObject metadata = reflectivStateChart.execute.reflectivStateChart.objectManagement.eClassifierToYClassifierTransformed
							.get(runtimeObject.eClass());
					reflectivStateChart.execute.reflectivStateChart.objectManagement.set(runtimeObject, metadata, "yClass");
				}
//						reflectivStateChart.execute.reflectivStateChart.objectManagement.set(runtimeObject, reflectivStateChart.execute.reflectivStateChart.objectManagement.eClassifierToYClassifier.get(eclass), "yClass");			

				// initialize internal:
				EStructuralFeature internal = runtimeObject.eClass().getEStructuralFeature("yammInternal");
				if (internal != null && runtimeObject.eGet(internal) == null) {
					runtimeObject.eSet(internal, reflectivStateChart.execute.reflectivStateChart.internal);
				}

				String name = "";
				if (!reflectivStateChart.execute.reflectivStateChart.objectManagement.qualifiedTypeNameToNextDefaultNameNumber
						.containsKey(className))
					reflectivStateChart.execute.reflectivStateChart.objectManagement.qualifiedTypeNameToNextDefaultNameNumber
							.put(className, 1);
				int number = reflectivStateChart.execute.reflectivStateChart.objectManagement.qualifiedTypeNameToNextDefaultNameNumber
						.get(className);
				reflectivStateChart.execute.reflectivStateChart.objectManagement.qualifiedTypeNameToNextDefaultNameNumber
						.put(className, number + 1);
				reflectivStateChart.execute.reflectivStateChart.objectManagement.objectIdToName.get(layer).put(objectID,
						className + number);

				EClassifier simObj = reflectivStateChart.execute.reflectivStateChart.objectManagement
						.getEClassifier("DES.SimulationObject", layer);
				if (simObj != null && aIsB(eclass, (EClass) simObj)) {
					runtimeObject.eSet(runtimeObject.eClass().getEStructuralFeature("name"), name);
					reflectivStateChart.execute.reflectivStateChart.objectManagement.addSimObject(layer, runtimeObject);
				}
				EClassifier event = reflectivStateChart.execute.reflectivStateChart.objectManagement
						.getEClassifier("DES.Event", layer);
				if (event != null && aIsB(eclass, (EClass) event)) {
					reflectivStateChart.execute.reflectivStateChart.objectManagement.addEvent(runtimeObject, layer);
				}

//					EObject yammInstance = reflectivStateChart.execute.reflectivStateChart.objectManagement.qualifiedNameToYClassifier.get(layer).get(className);
				EClassifier queue = reflectivStateChart.execute.reflectivStateChart.objectManagement
						.getEClassifier("DES.Queue", layer);

				if (queue != null && aIsB(eclass, (EClass) queue)) {
					reflectivStateChart.execute.reflectivStateChart.objectManagement.addQueue(runtimeObject, layer);
					reflectivStateChart.execute.reflectivStateChart.objectManagement.addDelayQueue(runtimeObject, layer);
				}
				if (reflectivStateChart.execute.reflectivStateChart.objectManagement.observedValues
						.containsKey(className)) {
					reflectivStateChart.execute.reflectivStateChart.objectManagement.propertyObserver.addObserver(
							runtimeObject,
							reflectivStateChart.execute.reflectivStateChart.objectManagement.observedValues.get(className),
							layer);
				}
			}
			
		}

		// attributes/references:
		for (Entry<ODObject, EObject> diagramToRuntimeEntry : odToRuntime.entrySet()) {
			ODObject odObject = diagramToRuntimeEntry.getKey();
			EObject runtimeObject = diagramToRuntimeEntry.getValue();
			EClass eClassRuntime = runtimeObject.eClass();

			for (ODAttribute odAttribute : odObject.getAttributes()) {
				EAttribute runtimeAttribute = (EAttribute) eClassRuntime.getEStructuralFeature(odAttribute.getName());
				try {
					odAttribute.getDataType().getName();
				} catch (Exception e) {
					e.printStackTrace();				}
				switch (odAttribute.getDataType().getName()) {
				case "Integer": {
					if (odAttribute.getUpper() == 1) {
						runtimeObject.eSet(runtimeAttribute, Integer.parseInt(odAttribute.getValue().trim().equals("") ? "0" : odAttribute.getValue().trim()));
					} else {
						runtimeObject.eSet(runtimeAttribute, Arrays.asList(odAttribute.getValue().split(","))
								.stream().map(value -> Integer.parseInt(value.trim())).collect(Collectors.toList()));
					}
				}
					break;
				case "Double": {
					if (odAttribute.getUpper() == 1) {
						runtimeObject.eSet(runtimeAttribute, Double.parseDouble(odAttribute.getValue().trim().equals("") ? "0.0" : odAttribute.getValue().trim()));
					} else {
						runtimeObject.eSet(runtimeAttribute, Arrays.asList(odAttribute.getValue().split(","))
								.stream().map(value -> Double.parseDouble(value.trim())).collect(Collectors.toList()));
					}
				}
					break;
				case "String": {
					if (odAttribute.getUpper() == 1) {
						runtimeObject.eSet(runtimeAttribute, odAttribute.getValue());
					} else {
						runtimeObject.eSet(runtimeAttribute, Arrays.asList(odAttribute.getValue().split(" ,")));
					}
				}
					break;
				case "Boolean": {
					if (odAttribute.getUpper() == 1) {
						runtimeObject.eSet(runtimeAttribute, Boolean.parseBoolean(odAttribute.getValue().trim()));
					} else {
						runtimeObject.eSet(runtimeAttribute,
								Arrays.asList(odAttribute.getValue().split(",")).stream()
										.map(value -> Boolean.parseBoolean(value.trim())).collect(Collectors.toList()));
					}
				}
					break;
				default:
					break;
				}
			}

			for (ODReference odReference : odObject.getReferences()) {
				if ("this".equals(odReference.getName()))
					continue;
				EReference runtimeRef = (EReference) eClassRuntime.getEStructuralFeature(odReference.getName());

				if (odReference.getUpper() == 1) {
					if (odReference.getValue() != null)
					{
						EObject runtimeValue = odToRuntime.get(odReference.getValue().get(0));
						runtimeObject.eSet(runtimeRef, runtimeValue);
					}
					else
						runtimeObject.eSet(runtimeRef, null);
				} else {
					List<EObject> runtimeValues = new ArrayList<>();
					for (ODObject odValue : odReference.getValue()) {
						if (odValue != null)
							runtimeValues.add(odToRuntime.get(odValue));
					}
					runtimeObject.eSet(runtimeRef, runtimeValues);
				}
			}
		}
	}

	public void loadFromObjectDiagram() {
		for (int layer = 1; layer <= reflectivStateChart.objectManagement.getViewLayers().size(); layer++) {
			String objectDiagramPath = reflectivStateChart.objectManagement.getViewLayers().get(layer - 1)
					.getObjectDiagramPath();
			String relativeObjectDiagramPath = objectDiagramPath;
			if (objectDiagramPath == null || "".equals(objectDiagramPath))
				return;
			diagramID = objectDiagramPath;
			String projectName = objectDiagramPath.substring(1, objectDiagramPath.substring(1).indexOf("/") + 1);
			if (objectDiagramPath != null && !objectDiagramPath.isEmpty()) {
				String path;
				if (!((new File(objectDiagramPath)).exists())) {
					// try to look in the current workspace
					if (dev.yamm.init.Activator.getDefault() != null) {
						objectDiagramPath = (ResourcesPlugin.getWorkspace().getRoot().getLocation().toString())
								.concat(objectDiagramPath).replace('\\', '/');
						if (!((new File(objectDiagramPath)).exists())) {
							logger.error("File \"" + objectDiagramPath + "\" does not exist!");
							return;
						}
					} else {
						return;
					}
				} else if (!((new File(objectDiagramPath)).canRead())) {
					logger.error("Can't read file \"" + objectDiagramPath + "\"!");
					return;
				}

				// load:
				Session session = null;
				for (Session s : SessionManager.INSTANCE.getSessions()) {
					if (s.getID().contains("platform:/resource/" + projectName)) {
						session = s;
						break;
					}
				}

				if (session == null)
					return;

				for (Resource res : session.getSemanticResources()) {
					if (res.getURI().toString().endsWith(relativeObjectDiagramPath)) {
						objectDiagram = (ObjectDiagram) res.getContents().get(0);
						break;
					}
				}

				Resource sessionRes = session.getSessionResource();
				EList<EObject> content = sessionRes.getContents();
				for (int i = 1; i < content.size(); i++) {
					if (content.get(i) instanceof DSemanticDiagram) {
						diagram = (DSemanticDiagram) content.get(i);
					}
				}

				// TODO: standalone
//			ObjectDiagramPackage.eINSTANCE.eClass();
//			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("objectdiagram", new XMIResourceFactoryImpl());
//			ResourceSet resSet = new ResourceSetImpl();
//			Resource resource = resSet.getResource(URI.createFileURI(objectDiagramPath), true);
//			objectDiagram = (ObjectDiagram) resource.getContents().get(0);

				for (ODObject odObjects : objectDiagram.getObjects()) {
					String className = odObjects.getType().getQualifiedName();
					EClass eclass = (EClass) reflectivStateChart.objectManagement.getEClassifier(className, layer);
					EObject runtimeObject = eclass.getEPackage().getEFactoryInstance().create(eclass);
					if (runtimeObject instanceof EObjectImpl)
						((EObjectImpl) runtimeObject).eSetClass(eclass);
					odToRuntime.put(odObjects, runtimeObject);
					runtimeToOd.put(runtimeObject, odObjects);

					String objectID = odObjects.getObjectID() != null && !odObjects.getObjectID().equals("")
							? odObjects.getObjectID()
							: Integer.toHexString(runtimeObject.hashCode());
					reflectivStateChart.execute.maps[layer].put(objectID, runtimeObject);
					reflectivStateChart.execute.reflectivStateChart.objectManagement
							.introduceEObjectToLayerInformation(layer, runtimeObject);

					// objectID
					if (runtimeObject.eClass().getEStructuralFeature("ObjectID") != null)
						reflectivStateChart.execute.reflectivStateChart.objectManagement.set(runtimeObject, objectID,
								"ObjectID");

					// initialize this:
					if (runtimeObject.eClass().getEStructuralFeature("this") != null)
						reflectivStateChart.execute.reflectivStateChart.objectManagement.set(runtimeObject,
								runtimeObject, "this");

					// initialize yClass:
					if (runtimeObject.eClass().getEStructuralFeature("yClass") != null) {
						EObject metadata = reflectivStateChart.execute.reflectivStateChart.objectManagement.eClassifierToYClassifierTransformed
								.get(runtimeObject.eClass());
						reflectivStateChart.execute.reflectivStateChart.objectManagement.set(runtimeObject, metadata,
								"yClass");
					}
//					reflectivStateChart.execute.reflectivStateChart.objectManagement.set(runtimeObject, reflectivStateChart.execute.reflectivStateChart.objectManagement.eClassifierToYClassifier.get(eclass), "yClass");			

					// initialize internal:
					EStructuralFeature internal = runtimeObject.eClass().getEStructuralFeature("yammInternal");
					if (internal != null && runtimeObject.eGet(internal) == null) {
						runtimeObject.eSet(internal, reflectivStateChart.execute.reflectivStateChart.internal);
					}

					String name = "";
					if (!reflectivStateChart.execute.reflectivStateChart.objectManagement.qualifiedTypeNameToNextDefaultNameNumber
							.containsKey(className))
						reflectivStateChart.execute.reflectivStateChart.objectManagement.qualifiedTypeNameToNextDefaultNameNumber
								.put(className, 1);
					int number = reflectivStateChart.execute.reflectivStateChart.objectManagement.qualifiedTypeNameToNextDefaultNameNumber
							.get(className);
					reflectivStateChart.execute.reflectivStateChart.objectManagement.qualifiedTypeNameToNextDefaultNameNumber
							.put(className, number + 1);
					reflectivStateChart.execute.reflectivStateChart.objectManagement.objectIdToName.get(layer)
							.put(objectID, className + number);

					EClassifier simObj = reflectivStateChart.execute.reflectivStateChart.objectManagement
							.getEClassifier("DES.SimulationObject", layer);
					if (simObj != null && aIsB(eclass, (EClass) simObj)) {
						runtimeObject.eSet(runtimeObject.eClass().getEStructuralFeature("name"), name);
						reflectivStateChart.execute.reflectivStateChart.objectManagement.addSimObject(layer,
								runtimeObject);
					}
					EClassifier event = reflectivStateChart.execute.reflectivStateChart.objectManagement
							.getEClassifier("DES.Event", layer);
					if (event != null && aIsB(eclass, (EClass) event)) {
						reflectivStateChart.execute.reflectivStateChart.objectManagement.addEvent(runtimeObject, layer);
					}

//				EObject yammInstance = reflectivStateChart.execute.reflectivStateChart.objectManagement.qualifiedNameToYClassifier.get(layer).get(className);
					EClassifier queue = reflectivStateChart.execute.reflectivStateChart.objectManagement
							.getEClassifier("DES.Queue", layer);

					if (queue != null && aIsB(eclass, (EClass) queue)) {
						reflectivStateChart.execute.reflectivStateChart.objectManagement.addQueue(runtimeObject, layer);
						reflectivStateChart.execute.reflectivStateChart.objectManagement.addDelayQueue(runtimeObject,
								layer);
					}
					if (reflectivStateChart.execute.reflectivStateChart.objectManagement.observedValues
							.containsKey(className)) {
						reflectivStateChart.execute.reflectivStateChart.objectManagement.propertyObserver.addObserver(
								runtimeObject,
								reflectivStateChart.execute.reflectivStateChart.objectManagement.observedValues
										.get(className),
								layer);
					}
				}

				// references:
				for (Entry<ODObject, EObject> diagramToRuntimeEntry : odToRuntime.entrySet()) {
					ODObject odObject = diagramToRuntimeEntry.getKey();
					EObject runtimeObject = diagramToRuntimeEntry.getValue();
					EClass eClassRuntime = runtimeObject.eClass();

					for (ODAttribute odAttribute : odObject.getAttributes()) {
						EAttribute runtimeAttribute = (EAttribute) eClassRuntime
								.getEStructuralFeature(odAttribute.getName());
						switch (odAttribute.getDataType().getName()) {
						case "Integer": {
							if (odAttribute.getUpper() == 1) {
								runtimeObject.eSet(runtimeAttribute,
										Integer.parseInt(odAttribute.getValue().trim().equals("") ? "0" : odAttribute.getValue().trim()));
							} else {
								runtimeObject.eSet(runtimeAttribute,
										Arrays.asList(odAttribute.getValue().split(",")).stream()
												.map(value -> Integer.parseInt(value.trim()))
												.collect(Collectors.toList()));
							}
						}
							break;
						case "Double": {
							if (odAttribute.getUpper() == 1) {
								runtimeObject.eSet(runtimeAttribute,
										Double.parseDouble(odAttribute.getValue().trim().equals("") ? "0.0" : odAttribute.getValue().trim()));
							} else {
								runtimeObject.eSet(runtimeAttribute,
										Arrays.asList(odAttribute.getValue().split(",")).stream()
												.map(value -> Double.parseDouble(value.trim()))
												.collect(Collectors.toList()));
							}
						}
							break;
						case "String": {
							if (odAttribute.getUpper() == 1) {
								runtimeObject.eSet(runtimeAttribute, odAttribute.getValue());
							} else {
								runtimeObject.eSet(runtimeAttribute,
										Arrays.asList(odAttribute.getValue().split(" ,")));
							}
						}
							break;
						case "Boolean": {
							if (odAttribute.getUpper() == 1) {
								runtimeObject.eSet(runtimeAttribute,
										Boolean.parseBoolean(odAttribute.getValue().trim()));
							} else {
								runtimeObject.eSet(runtimeAttribute,
										Arrays.asList(odAttribute.getValue().split(",")).stream()
												.map(value -> Boolean.parseBoolean(value.trim()))
												.collect(Collectors.toList()));
							}
						}
							break;
						default:
							break;
						}
					}

					for (ODReference odReference : odObject.getReferences()) {
						if ("this".equals(odReference.getName()))
							continue;
						EReference runtimeRef = (EReference) eClassRuntime.getEStructuralFeature(odReference.getName());

						if (odReference.getUpper() == 1) {
							EObject runtimeValue = odToRuntime.get(odReference.getValue().get(0));
							runtimeObject.eSet(runtimeRef, runtimeValue);
						} else {
							List<EObject> runtimeValues = new ArrayList<>();
							for (ODObject odValue : odReference.getValue()) {
								runtimeValues.add(odToRuntime.get(odValue));
							}
							runtimeObject.eSet(runtimeRef, runtimeValues);
						}
					}
				}
			}
		}
	}

	private boolean aIsB(EClass a, EClass b) {
		if (a.getEAllSuperTypes().contains(b))
			return true;
		else {
			for (EClass superType : a.getEAllSuperTypes()) {
				if (aIsB(superType, b)) {
					return true;
				}
			}
			return false;
		}
	}
}
