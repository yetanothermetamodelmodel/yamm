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
/**
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

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.DEdge;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.diagram.EdgeTarget;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;

import online.yamm.coreModel.design.policies.RmofListContainerEditPolicy;
import online.yamm.coreModelDiagram.yammDiagram.YAggregationKind;
import online.yamm.coreModelDiagram.yammDiagram.YClass;
import online.yamm.coreModelDiagram.yammDiagram.YEffect;
import online.yamm.coreModelDiagram.yammDiagram.YEnumeration;
import online.yamm.coreModelDiagram.yammDiagram.YEnumerationLiteral;
import online.yamm.coreModelDiagram.yammDiagram.YModel;
import online.yamm.coreModelDiagram.yammDiagram.YNamedElement;
import online.yamm.coreModelDiagram.yammDiagram.YOperation;
import online.yamm.coreModelDiagram.yammDiagram.YPackage;
import online.yamm.coreModelDiagram.yammDiagram.YPackageableElement;
import online.yamm.coreModelDiagram.yammDiagram.YParameter;
import online.yamm.coreModelDiagram.yammDiagram.YProperty;
import online.yamm.coreModelDiagram.yammDiagram.YVisibilityKind;
import online.yamm.coreModelDiagram.yammDiagram.YammDiagramFactory;
import online.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage;
//import online.yamm.editor.design.InstanceDiagramControl;

public class ClassDiagramServices {
	public static List<String> INIT_TYPES;

	{
		INIT_TYPES = new ArrayList();
		INIT_TYPES.addAll(Arrays.asList("Integer", "Double", "Boolean", "String", "Object"));
	}

	private static boolean typesPackageExists = false;

	
	public EObject debug(EObject self)
	{
		return self;
	}
	public String getNewDefaultValue(EObject self, String newValue) {
		if ("\"\"".equals(newValue))
			return "\"\\\"\\\"\"";
		return "\"" + newValue + "\"";
	}

	public String getDefaultValueExpression(YProperty self) {
		try {
			if ("String".equals(self.getType().getName())) {
				if ("\"\\\"\\\"\"".equals(self.getDefaultValue()))
					return "\"\"";
			}
			if (self.getDefaultValue() == null)
				return "";
			return self.getDefaultValue().substring(1, self.getDefaultValue().length() - 1);
		} catch (Exception e) {
			return "";
		}
	}

	public String labelOpertation(YOperation operation) {
		YClass returnType = (YClass) operation.getReturnType();
		if (returnType != null)
			return operation.getName() + " : " + returnType.getName() + " ";
		return operation.getName() + " : void ";
	}

	public EObject setInitalActive(YOperation operation) {
		if (operation.getStateMachine().isInitialActive())
			operation.getStateMachine().setInitialActive(false);
		else
			operation.getStateMachine().setInitialActive(true);

		return operation;
	}
	
	public EObject setDesInitializer(YOperation operation) {
		if (operation.getStateMachine().isDesInitializer())
			operation.getStateMachine().setDesInitializer(false);
		else
			operation.getStateMachine().setDesInitializer(true);

		return operation;
	}

	public Boolean initialActiveOnOperationPrecondition(EObject obj) {
		return obj instanceof YOperation;
	}

	public Boolean initActiveDecorationPrecondition(YOperation operation) {
		return operation.getStateMachine().isInitialActive();
	}

	public EList<YParameter> getParameterCandidates(EObject parent) {
		EList<YParameter> candidates = ((YOperation) parent).getOwnedParameter();
		return candidates;
	}

	public EObject initProperty(YProperty property) {

		return property;
	}

	public static PasteRmofClassDiagramSwitch pasteRmofSwitch = new PasteRmofClassDiagramSwitch();
	public static boolean pasteActive = false;

	public EObject pasteOnClassDiagram(EObject container, EObject copiedElement) {
		if (!pasteActive) {
			pasteActive = true;
		}
		pasteRmofSwitch.setContainer(container);
		pasteRmofSwitch.doSwitch(copiedElement);

		return container;
	}

	public YModel getModel(EObject container) {
		while (!(container instanceof YModel)) {
			container = container.eContainer();
		}
		return (YModel) container;
	}

	public EObject createTypesPackage(EObject self) {
		YModel model = getModel(self);
		YClass stringClass = null;
		YClass objectClass = null;
		typesPackageExists = false;
		for (YPackage pack : model.getPackages()) {
			if ("Types".equals(pack.getName()) && pack.getParentElement() == null) {
				typesPackageExists = true;
				for (YPackageableElement member : pack.getOwnedMemberPackage())
				{
					if ("String".equals(member.getName()))
						stringClass = (YClass) member;
					if ("Object".equals(member.getName()))
						objectClass = (YClass) member;
				}
			}
		}

		if (!typesPackageExists) {
			YPackage typesPackage = YammDiagramFactory.eINSTANCE.createYPackage();
			typesPackage.setName("Types");
			model.getPackages().add(typesPackage);

			for (String typeName : INIT_TYPES) {
				YClass type = YammDiagramFactory.eINSTANCE.createYClass();
				type.setName(typeName);
				type.setPackage(typesPackage);
				typesPackage.getOwnedMemberPackage().add(type);
				if ("Object".equals(typeName)) {
					objectClass = type;
				} else if ("String".equals(typeName))
				{
					stringClass = type;
				}
			}
		}
		
		YClass rObject = createRObject(model);
		for (YProperty prop : rObject.getOwnedAttribute())
		{
			if ("yClass".equals(prop.getName()))
			{
				prop.setType(objectClass);
			}
			else if ("ObjectID".equals(prop.getName()))
			{
				prop.setType(stringClass);
			}
		}

		return self;
	}
	
	private YClass createRObject(YModel model)
	{
		for (YClass clazz : ((YModel) model).getClazz()) {
			if ("RObject".equals(clazz.getName()))
				return clazz;
		}
		YClass rObject = YammDiagramFactory.eINSTANCE.createYClass();
		rObject.setName("RObject");
		model.getClazz().add(rObject);
		
		YProperty containerProperty = YammDiagramFactory.eINSTANCE.createYProperty();
		containerProperty.setName("rContainer");
		containerProperty.setType(rObject);
		containerProperty.setClazz(rObject);
		rObject.getOwnedAttribute().add(containerProperty);

		YProperty metadataProperty = YammDiagramFactory.eINSTANCE.createYProperty();
		metadataProperty.setName("yClass");
		metadataProperty.setClazz(rObject);
		rObject.getOwnedAttribute().add(metadataProperty);

		YProperty objectIDProperty = YammDiagramFactory.eINSTANCE.createYProperty();
		objectIDProperty.setName("ObjectID");
		objectIDProperty.setClazz(rObject);
		rObject.getOwnedAttribute().add(objectIDProperty);
		
		return rObject;
	}

	public Boolean propertyPropertyViewPrecoditionA(YProperty property) {
		return !"container".equals(property.getName());
	}

	public Boolean propertyPropertyViewPrecoditionB(YProperty property) {
		return !"container".equals(property.getOpposite().getName());
	}

	public Boolean pasteAttribute(YProperty property, YClass container, EObject self) {
		container.getOwnedAttribute().add(property);
		property.setClazz(container);
		return false;
	}

	public Boolean preconditionProperty(YProperty property) {
		return !"this".equals(property.getName()) && property.isAssociation() == false
				&& !"container".equals(property.getName());
	}

	public EObject biAssociationLabelEditDummyService(EObject self) {
		// end/begin role label edit is done in EditableBiAssociationLabelEditProvider,
		// see: Obeo UML Designer
		return self;
	}

	public String getNameClassDiagram(YModel model) {
		String lastSegment = model.eResource().getURI().lastSegment();
		return lastSegment.substring(0, lastSegment.indexOf("."));
	}

	public EObject reconnectBiAssociationTarget(YProperty propertyA, YClass source,
			YClass target) {
		ChangeTypeOfPropertyWhichHasAnOppositeTrigger.ignoreNext = true;
		propertyA.setType(target);

		target.getOwnedAttribute().add(propertyA.getOpposite());
		propertyA.getOpposite().setClazz(target);

		return propertyA;
	}

	public EObject reconnectBiAssociationSource(YProperty propertyA, YClass source,
			YClass target) {
		ChangeTypeOfPropertyWhichHasAnOppositeTrigger.ignoreNext = true;
		propertyA.getOpposite().setType(target);

		target.getOwnedAttribute().add(propertyA);
		propertyA.setClazz(target);

		return propertyA;
	}

	public EObject reconnectAssociationSource(YProperty property, YClass targetClass) {
		targetClass.getOwnedAttribute().add(property);
		property.setClazz(targetClass);
		return property;
	}

	public Boolean isUnique(YProperty property) {
		return property.isIsUnique();
	}

	public Boolean isNotComposite(YProperty property) {
		if ("composite".equals(property.getAggregation().getLiteral()))
			return false;
		return true;
	}

	public Boolean hasNoOpposite(YProperty property) {
		if (property.getOpposite() == null)
			return true;
		return false;
	}

	public EEnumLiteral getValueAggregation(YProperty property) {
		EAttribute feature = (EAttribute) property.eClass().getEStructuralFeature("aggregation");
		return ((EEnum) feature.getEAttributeType()).getEEnumLiteral(property.getAggregation().getValue());
	}

	public EEnumLiteral getValueVisibility(YProperty property) {
		EAttribute feature = (EAttribute) property.eClass().getEStructuralFeature("visibility");
		return ((EEnum) feature.getEAttributeType()).getEEnumLiteral(property.getVisibility().getValue());
	}

	public EObject setAggregation(YProperty self, EEnumLiteral newValue) {
		// self.setAggregation(newValue);

		self.setAggregation(YAggregationKind.get(newValue.getValue()));
		return self;
	}

	public EObject setVisibility(YProperty self, EEnumLiteral newValue) {
		// self.setAggregation(newValue);

		self.setVisibility(YVisibilityKind.get(newValue.getValue()));
		return self;
	}

	public EList<EEnumLiteral> getAggregations(YProperty property) {
		EAttribute feature = (EAttribute) property.eClass().getEStructuralFeature("aggregation");
		return ((EEnum) feature.getEAttributeType()).getELiterals();
	}

	public EList<EEnumLiteral> getVisibility(YProperty property) {
		EAttribute feature = (EAttribute) property.eClass().getEStructuralFeature("visibility");
		return ((EEnum) feature.getEAttributeType()).getELiterals();
	}

	public String getValueUpper(YProperty self) {
		int upper = self.getUpper();
		if (upper == -1) {
			return "*";
		}
		return upper + "";
	}

	public EObject setUpper(YProperty self, String newValue) {
		try {
			int newInt = Integer.parseInt(newValue);
			if (newInt >= -1) {
				self.setUpper(newInt);
			}
		} catch (NumberFormatException e) {

		}
		return self;
	}

	public EObject setLower(YProperty self, String newValue) {
		try {
			int newInt = Integer.parseInt(newValue);
			if (newInt >= 0) {
				self.setLower(newInt);
			}
		} catch (NumberFormatException e) {

		}
		return self;
	}

	public EObject setOpposite(YProperty self, EObject newValue) {
		if (newValue != null)
			self.setOpposite((YProperty) newValue);
		else
			self.setOpposite(null);
		return self;
	}

	public Boolean defaultPropertiesPrecondition(EObject self) {
		if (!(self.eClass().getEPackage() instanceof YammDiagramPackage))
			return false;
		if (self instanceof YProperty || self instanceof YEffect)
			return false;
		return true;
	}

	public EObject setName(YNamedElement self, String newValue) {
		self.setName(newValue);
		return self;
	}

	public EList<YProperty> getOpposite(YProperty property) {
		YProperty opposite = property.getOpposite();
		EList<YProperty> retList = new BasicEList<>();
		if (opposite != null)
			retList.add(opposite);
		return retList;
	}

	public EObject deleteBiAssociation(YProperty propertyA) {
		YProperty propertyB = propertyA.getOpposite();
		propertyB.getClazz().getOwnedAttribute().remove(propertyB);	
		propertyA.getClazz().getOwnedAttribute().remove(propertyA);
		return propertyA;
	}

	public EObject enumerationDrop(EObject self, EObject element, EObject oldContainer, EObject newContainer) {
		if (element instanceof YEnumeration) {
			YEnumeration droppedEnumeration = (YEnumeration) element;

			if (newContainer instanceof YPackage) {

				YPackage newPackage = (YPackage) newContainer;
				droppedEnumeration.setPackage(newPackage);
				newPackage.getOwnedMemberPackage().add(droppedEnumeration);
			}

			if (newContainer instanceof YModel) {
				YModel newModel = (YModel) newContainer;
				droppedEnumeration.setPackage(null);
				newModel.getEnumerations().add(droppedEnumeration);
			}
		}
		return element;
	}

	public EList<YEnumeration> semCandiEnumeration(EObject container) {
		EList<YEnumeration> enumerations = new BasicEList<>();
		if (container instanceof YModel) {
			return ((YModel) container).getEnumerations();
		}
		if (container instanceof YPackage) {
			for (YPackageableElement packageableElement : ((YPackage) container).getOwnedMemberPackage()) {
				if (packageableElement instanceof YEnumeration) {
					enumerations.add((YEnumeration) packageableElement);
				}
			}
		}

		return enumerations;
	}

	public EObject createEnumeration(EObject container) {
		Session session = SessionManager.INSTANCE.getSession(container);
		YEnumeration enumeration = null;
		try {
			enumeration = YammDiagramFactory.eINSTANCE.createYEnumeration();
//			enumeration = (YEnumeration) session.getModelAccessor().createInstance("YEnumeration");
		} catch (Exception e) {
			e.printStackTrace();
			return container;
		}

		if (container instanceof YModel) {
			YModel rModel = (YModel) container;
			rModel.getEnumerations().add(enumeration);
		}

		if (container instanceof YPackage) {
			YPackage rPackage = (YPackage) container;
			rPackage.getOwnedMemberPackage().add(enumeration);
			enumeration.setPackage(rPackage);
		}

		return container;
	}

	public EObject createBiAssociation(EObject self, YClass source,
			YClass target) {
		YProperty firstProperty = YammDiagramFactory.eINSTANCE.createYProperty();
		firstProperty.setAssociation(true);
		firstProperty.setType(target);
		firstProperty.setClazz(source);
		source.getOwnedAttribute().add(firstProperty);

		YProperty secondProperty = YammDiagramFactory.eINSTANCE.createYProperty();
		secondProperty.setAssociation(true);
		secondProperty.setType(source);
		secondProperty.setClazz(target);
		target.getOwnedAttribute().add(secondProperty);

		firstProperty.setOpposite(secondProperty);
		// secondProperty.setOpposite(firstProperty); //will be done in
		// SetOppositeTrigger

		return self;
	}

	public EList<YProperty> getAssociations(YModel model, DSemanticDiagram diagram) {
		EList<YProperty> properties = new BasicEList<>();

		class traversePackageTree {
			public void traverse(YPackage root) {
				for (YPackageableElement subElement : root.getOwnedMemberPackage()) {
					if (subElement instanceof YPackage) {
						traverse((YPackage) subElement);
					}

					if (subElement instanceof YClass) {
						YClass rClass = (YClass) subElement;
						for (YProperty property : rClass.getOwnedAttribute()) {
							if (property.getOpposite() == null)
								properties.add(property);
						}
					}
				}
			}
		}
		// get all properties
		for (YClass rClass : model.getClazz()) {
			for (YProperty property : rClass.getOwnedAttribute()) {
				if (property.getOpposite() == null)
					properties.add(property);
				else if ("composite".equals(property.getAggregation().getName()))
					properties.add(property);
			}
		}

		traversePackageTree traverseTree = new traversePackageTree();
		for (YPackage rPackage : model.getPackages()) {
			traverseTree.traverse(rPackage);
		}

		return properties;
	}

	public EList<YProperty> getBidirectionalAssociations(YModel model, DSemanticDiagram diagram) {
		EList<YProperty> properties = new BasicEList<>();

		class traversePackageTree {
			public void traverse(YPackage root) {
				for (YPackageableElement subElement : root.getOwnedMemberPackage()) {
					if (subElement instanceof YPackage) {
						traverse((YPackage) subElement);
					}

					if (subElement instanceof YClass) {
						YClass rClass = (YClass) subElement;
						properties.addAll(rClass.getOwnedAttribute());
					}
				}
			}
		}

		// get all properties
		for (YClass rClass : model.getClazz()) {
			properties.addAll(rClass.getOwnedAttribute());
		}

		traversePackageTree traverseTree = new traversePackageTree();
		for (YPackage rPackage : model.getPackages()) {
			traverseTree.traverse(rPackage);
		}

		// filter
		List<Integer> oppositeID = new ArrayList<>();
		EList<YProperty> biDirectionalProperties = new BasicEList<>();
		for (YProperty property : properties) {
			if (property.getOpposite() != null) {
				if (!property.getAggregation().getName().equals("composite")
						&& !"container".equals(property.getName())) {
					if (!oppositeID.contains(property.hashCode())) {
						biDirectionalProperties.add(property);
						oppositeID.add(property.getOpposite().hashCode());
					}
				}
			}
		}

		return biDirectionalProperties;

	}

	public EObject setComposite(EObject self, EObject property) {
		((YProperty) property).setAggregation(YAggregationKind.get("composite"));
		return self;
	}

	public Boolean isAssociation(EObject self) {
		YAggregationKind kind = ((YProperty) self).getAggregation();
		if ("none".equals(kind.getLiteral()))
			return true;
		return false;
	}

	public Boolean isComposite(EObject self) {

		YAggregationKind kind = ((YProperty) self).getAggregation();
		if ("composite".equals(kind.getLiteral()))
			return true;
		return false;
	}

	//
	public EObject fixName(EObject self) {
		if (self instanceof DSemanticDecorator)
			self = ((DSemanticDecorator) self).getTarget();

		YNamedElement namedObject = (YNamedElement) self;

		if (namedObject.getName() != null || "".equals(namedObject.getName())) {
			namedObject.setName(namedObject.getName() + namedObject.getObjectID());
		} else {
			namedObject.setName(namedObject.eClass().getName() + namedObject.getObjectID());
		}
		return self; // semn
	}

	public String getCardinality(YProperty property) {
		if (property.getLower() <= 0 && property.getUpper() < 0)
			return "*";
		return property.getLower() + ".." + (property.getUpper() < 0 ? "*" : property.getUpper());
	}

	public EObject refreshCreatedParameter(YParameter param) {
		param.setLower(param.getLower());
		return null;
	}

	public EObject refreshCreatedAttribute(YProperty property) {
		property.setUpper(property.getUpper());
		return null;
	}

	public EObject updateReferences(EObject obj) {
		
//		TransactionalEditingDomain ted = TransactionUtil.getEditingDomain(obj);
//		ted.addResourceSetListener(new ResourceSetListenerImpl() {
//			@Override
//			public Command transactionAboutToCommit(ResourceSetChangeEvent event) throws
//			RollbackException
//			{
//
//
//				RecordingCommand cmd = new RecordingCommand(ted) {
//
//					@Override
//					protected void doExecute() {
//						
//						// just to trigger a refresh of Property
//						
////						EObjectQuery objectQuery = new EObjectQuery(obj);
////						
////						
////						Collection<EObject> operations = objectQuery
////								.getInverseReferences(YammPackage.Literals.YOPERATION__CLAZZ);
////						Collection<EObject> properties = objectQuery
////								.getInverseReferences(YammPackage.Literals.YPROPERTY__TYPE);
////						EcoreUtil.getAllContents(eObject, resolve)
//						TreeIterator<EObject> iter = obj.eResource().getAllContents();
//						while (iter.hasNext()) {
//							EObject iterElem = iter.next();
//
//							if (iterElem instanceof YProperty) {
//								YProperty property = (YProperty) iterElem;
//								YType type = property.getType();
////								if (type == obj) {
//									// set the type which is already set --> notifyChanged --> refresh
//									property.setType(type);
////								}
//								YClass clazz = property.getClazz();
////								if (clazz == obj)
////								{
//									property.setClazz(clazz);
////								}
//							}
//							else if (iterElem instanceof YClass)
//							{
//								YClass clazz = (YClass) iterElem;
////								YPackage pack = clazz.getParentElement();
////								if (clazz == obj) {
//									// set the type which is already set --> notifyChanged --> refresh
////								clazz.setParentElement(pack);
//								YNamedElement pack2 = clazz.getPackage();
//								
//								clazz.setPackage(pack2);
//								
//								List<YClass> superClasses = new ArrayList(clazz.getSuperClass());
//								clazz.getSuperClass().clear();
//								clazz.getSuperClass().addAll(superClasses);
//							}
//							else if (iterElem instanceof YPackage)
//							{
//								YPackage pack = (YPackage) iterElem;
//								YPackage parentPackage = pack.getPackage();
////								if (clazz == obj) {
//									// set the type which is already set --> notifyChanged --> refresh
//										pack.setPackage(parentPackage);
//							}
//							else if (iterElem instanceof YOperation)
//							{
//								YOperation operation = (YOperation) iterElem;
//								YClass clazz = operation.getClazz();
////								if (clazz == obj) {
//									// set the type which is already set --> notifyChanged --> refresh
//									operation.setClazz(clazz);
////								}
//							}
//							else if (iterElem instanceof YEnumeration)
//							{
//								
//							}
//							else if (iterElem instanceof YEnumerationLiteral)
//							{
//								
//							}
//							else if (iterElem instanceof YStateMachine)
//							{
//								YStateMachine sm = (YStateMachine) iterElem;
//								YOperation op = sm.getOperation();
////								if (op == obj) {
//									// set the type which is already set --> notifyChanged --> refresh
//									sm.setOperation(op);
////								}
//								// skip all statemachine content
//								iter.prune();
//							}
//						}
//						
//					}
//				};
//				ted.removeResourceSetListener(this);
//				return cmd;
//			}
//		});

		return obj;
	}

	public Boolean validateEnumName(YEnumeration enumToValidate) {
		if (enumToValidate.getName() == null || "".equals(enumToValidate.getName()))
			return false;

		EObject container = enumToValidate.eContainer();
		EList<YEnumeration> enums = new BasicEList<>();

		if (container instanceof YModel) {
			enums = ((YModel) container).getEnumerations();
		} else if (container instanceof YPackage) {
			for (YPackageableElement packageable : ((YPackage) container).getOwnedMemberPackage()) {
				if (packageable instanceof YEnumeration) {
					enums.add((YEnumeration) packageable);
				}
			}
		}

		for (YEnumeration rEnum : enums) {
			if (enumToValidate != rEnum && enumToValidate.getName().equals(rEnum.getName()))
				return false;
		}

		return true;
	}

	public Boolean validateEnumLiteralName(YEnumerationLiteral enumLiteralToValidate) {
		if (enumLiteralToValidate.getName() == null || "".equals(enumLiteralToValidate.getName()))
			return false;

		YEnumeration containerEnum = (YEnumeration) enumLiteralToValidate.eContainer();

		for (YEnumerationLiteral literal : containerEnum.getOwnedLiteral()) {
			if (literal != enumLiteralToValidate && enumLiteralToValidate.getName().equals(literal.getName())) {
				return false;
			}
		}

		return true;
	}

	public Boolean validateParameterName(YParameter parameterToValidate) {
		if (parameterToValidate.getName() == null || "".equals(parameterToValidate.getName()))
			return false;

		YOperation operation = (YOperation) parameterToValidate.eContainer();

		for (YParameter parameter : operation.getOwnedParameter()) {
			if (parameter != parameterToValidate && parameterToValidate.getName().equals(parameter.getName())) {
				return false;
			}
		}

		return true;
	}

	public Boolean validateOperationName(YOperation operationToValidate) {
		if (operationToValidate.getName() == null || "".equals(operationToValidate.getName()))
			return false;

		YClass containerClass = (YClass) operationToValidate
				.eContainer();

		for (YOperation operation : containerClass.getOwnedOperation()) {
			if (operation != operationToValidate && operationToValidate.getName().equals(operation.getName())) {
				return false;
			}
		}

		return true;
	}

	public Boolean validatePropertyName(YProperty propertyToValidate) {
		if (propertyToValidate.getName() == null || "".equals(propertyToValidate.getName()))
			return false;
		YClass rClass = (YClass) propertyToValidate.eContainer();
		for (YProperty property : rClass.getOwnedAttribute()) {
			if (property != propertyToValidate && propertyToValidate.getName().equals(property.getName()))
				return false;
		}
		return true;
	}

	public Boolean validatePackageName(YPackage packageToValidate) {
		if (packageToValidate.getName() == null || "".equals(packageToValidate.getName()))
			return false;

		EObject container = packageToValidate.eContainer();

		if (container instanceof YModel) {
			for (YPackage rPackage : ((YModel) container).getPackages()) {
				if (rPackage != packageToValidate && packageToValidate.getName().equals(rPackage.getName()))
					return false;
			}
		} else if (container instanceof YPackage) {
			for (YPackageableElement rPackage : ((YPackage) container).getOwnedMemberPackage()) {
				if (rPackage != packageToValidate && packageToValidate.getName().equals(rPackage.getName()))
					return false;
			}
		}

		return true;
	}

	public String getErrorMessageName(EObject obj) {
		YNamedElement objToValidate;

		if (obj instanceof YNamedElement) {
			objToValidate = (YNamedElement) obj;
		} else {
			objToValidate = (YNamedElement) ((DSemanticDecorator) obj).getTarget();
		}

		if (objToValidate.getName() == null || "".equals(objToValidate.getName()))
			return "no name | " + objToValidate.eClass().getName();

		return "duplicate name | " + objToValidate.eClass().getName();
	}

	public Boolean validateClassName(DSemanticDecorator dElement) {
		YClass rmofObjToValidate = (YClass) dElement.getTarget();

		if (rmofObjToValidate.getName() == null || "".equals(rmofObjToValidate.getName()))
			return false;

		EObject container = rmofObjToValidate.eContainer();

		EList<YClass> classes = new BasicEList<>();

		if (container instanceof YModel) {
			classes = ((YModel) container).getClazz();
		}

		else if (container instanceof YPackage) {
			for (YPackageableElement packageable : ((YPackage) container).getOwnedMemberPackage()) {
				if (packageable instanceof YClass) {
					classes.add((YClass) packageable);
				}
			}
		}

		for (YClass rClass : classes) {
			if (rmofObjToValidate != rClass && rmofObjToValidate.getName().equals(rClass.getName()))
				return false;
		}

		return true;
	}

	public Boolean preconditionAttributeToAssciation(EObject obj) {
		if (obj instanceof YProperty && ((YProperty) obj).isAssociation() == false)
			return true;
		return false;
	}

	public EObject attributeToAssociation(EObject obj) {
		if (obj instanceof YProperty) {
			YProperty property = (YProperty) obj;
			if (property.getType() != null) {
				((YProperty) obj).setAssociation(true);
				YClass containerClass = (YClass) property
						.eContainer();
				containerClass.getOwnedAttribute().move(containerClass.getOwnedAttribute().size() - 1, property);
			}
		}
		return null;
	}

	public Boolean preconditionAssciationToAttribute(EObject obj) {
		if (obj instanceof YProperty && ((YProperty) obj).isAssociation() == true)
			return true;
		return false;
	}

	public EObject associationToAttribute(EObject obj) {
		if (obj instanceof YProperty) {
			YProperty property = (YProperty) obj;
			property.setAssociation(false);
			YClass containerClass = (YClass) property.eContainer();
			containerClass.getOwnedAttribute().move(containerClass.getOwnedAttribute().size() - 1, property);
		}
		return null;
	}

	public EList<YClass> semCandiClassContainer(EObject container) {
		EList<YClass> rClasses = new BasicEList<>();
		if (container instanceof YModel) {
			return ((YModel) container).getClazz();
		}
		if (container instanceof YPackage) {
			for (YPackageableElement packageableElement : ((YPackage) container).getOwnedMemberPackage()) {
				if (packageableElement instanceof YClass) {
					rClasses.add((YClass) packageableElement);
				}
			}
		}

		return rClasses;
	}

	public EList<YPackage> semCandiPackageContainer(EObject container) {
		EList<YPackage> rPackages = new BasicEList<>();

		if (container instanceof YModel) {
			for(YPackage pack : ((YModel) container).getPackages())
			{
//				if (!"DES".equals(pack.getName()))
//				{
					rPackages.add(pack);
//				}
			}
			return rPackages;
		}

		if (container instanceof YPackage) {
			for (YPackageableElement packageableElement : ((YPackage) container).getOwnedMemberPackage()) {
				if (packageableElement instanceof YPackage) {
					rPackages.add((YPackage) packageableElement);
				}
			}
		}
		return rPackages;
	}

	public EObject packageDrop(EObject a, YPackage droppedPackage, EObject oldContainer, EObject newContainer) {	
		
//		if (CreateDummyJavaRepresentationForContentAssist.projectInstance.containsKey(droppedPackage.eResource()))
//		{
//			CreateDummyJavaRepresentationForContentAssist.projectInstance.get(droppedPackage.eResource()).deletePackage(droppedClass);
//			CreateDummyJavaRepresentationForContentAssist.projectInstance.get(droppedPackage.eResource()).refreshProject();
//		}
		
		if (newContainer instanceof YPackage) {
			YPackage newPackage = (YPackage) newContainer;
			droppedPackage.setPackage(newPackage);
			newPackage.getOwnedMemberPackage().add(droppedPackage);
			
		}
		if (newContainer instanceof YModel) {
			YModel newModel = (YModel) newContainer;
			droppedPackage.setPackage(null);
			newModel.getPackages().add(droppedPackage);
			
		}
		return a;
	}

	public EObject classDrop(EObject self, EObject element, EObject oldContainer, EObject newContainer) {
		
		if (element instanceof YClass) {
			YClass droppedClass = (YClass) element;

//			if (CreateDummyJavaRepresentationForContentAssist.projectInstance.containsKey(droppedClass.eResource()))
//			{
//				CreateDummyJavaRepresentationForContentAssist.projectInstance.get(droppedClass.eResource()).deleteClass(droppedClass);
//				CreateDummyJavaRepresentationForContentAssist.projectInstance.get(droppedClass.eResource()).refreshProject();
//			}
			
			if (newContainer instanceof YPackage) {

				YPackage newPackage = (YPackage) newContainer;
				droppedClass.setPackage(newPackage);
				newPackage.getOwnedMemberPackage().add(droppedClass);
			}

			if (newContainer instanceof YModel) {
				YModel newModel = (YModel) newContainer;
				droppedClass.setPackage(null);
				newModel.getClazz().add(droppedClass);
				
			}
		}
		return element;
	}

	public EObject createPackage(EObject container) {

		YPackage newPackage = null;
		try {
			newPackage = YammDiagramFactory.eINSTANCE.createYPackage();
		} catch (Exception e) {
			e.printStackTrace();
			return container;
		}

		if (container instanceof YModel) {
			((YModel) container).getPackages().add(newPackage);
			newPackage.setPackage(null);
		}

		if (container instanceof YPackage) {
			((YPackage) container).getOwnedMemberPackage().add(newPackage);
			newPackage.setPackage(((YPackage) container));
		}

		return container;
	}

	public EObject createClass(EObject container) {

		YClass rClass = null;

		rClass = YammDiagramFactory.eINSTANCE.createYClass();
		YModel model = getModel(container);
		YClass rObject = null;
		for (YClass clazz : model.getClazz()) {
			if ("RObject".equals(clazz.getName()))
				rObject = clazz;
		}
		if (rObject != null) {
			rClass.getSuperClass().add(rObject);
		}
		
		if (container instanceof YModel) {
			YModel rModel = (YModel) container;
			rModel.getClazz().add(rClass);
		}
		if (container instanceof YPackage) {
			YPackage rPackage = (YPackage) container;
			rPackage.getOwnedMemberPackage().add(rClass);
			rClass.setPackage(rPackage);
		}

		return container;
	}

	public EObject deleteGeneralization(EObject objGeneralizationEdge) {
		EdgeTarget otherEndViewElem = ((DEdge) objGeneralizationEdge).getTargetNode();

		YClass spezialisationClass = (YClass) ((DEdge) objGeneralizationEdge)
				.getTarget();
		YClass generalizationClass = (YClass) ((DSemanticDecorator) otherEndViewElem)
				.getTarget();

		spezialisationClass.getSuperClass().remove(generalizationClass);

		return objGeneralizationEdge;
	}

	public EObject reconnectGeneralizationTarget(YClass specialization,
			YClass newGeneralization, YClass oldGeneralization) {
		specialization.getSuperClass().remove(oldGeneralization);
		specialization.getSuperClass().add(newGeneralization);

		return specialization;
	}

	public EObject reconnectGeneralizationSource(YClass oldSpecialization,
			YClass newSpecialization, DEdge edgeView) {
		YClass generalization = (YClass) ((DDiagramElement) edgeView
				.getTargetNode()).getTarget();

		oldSpecialization.getSuperClass().remove(generalization);
		newSpecialization.getSuperClass().add(generalization);

		return oldSpecialization;
	}

	public EObject insertProperty(YProperty property, DDiagramElement containerView) {
		YClass rmofClass = (YClass) property.eContainer();
		if (RmofListContainerEditPolicy.index != -1)
			rmofClass.getOwnedAttribute().move(RmofListContainerEditPolicy.index, property);
		else {
			int targetIndex = rmofClass.getOwnedAttribute().size() - 2;
			for (; targetIndex >= 0
					&& rmofClass.getOwnedAttribute().get(targetIndex).isAssociation() == true; targetIndex--)
				;
			rmofClass.getOwnedAttribute().move(targetIndex + 1, property);
		}
		return null;
	}

	public EObject insertParameter(YParameter parameter) {
		YOperation operation = (YOperation) parameter.eContainer();
		operation.getOwnedParameter().move(RmofListContainerEditPolicy.index, parameter);

		return parameter;
	}
	
	public EObject createInstanceDiagram(EObject yClass, Object views)
	{
		if (yClass instanceof YClass)
		{
			String yammModelPath = yClass.eResource().getURI().toPlatformString(true);
			String workspacPath = ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString();
			Session session = SessionManager.INSTANCE.getSession(yClass);
			String sessionId = session.getID();
			String projectName = sessionId.substring(19, sessionId.indexOf("representations.aird") - 1);
//			InstanceDiagramControl.createDiagram((YClass) yClass, projectName, yammModelPath);
		}

		return yClass;
	}
	
	public Boolean createInstanceDiagramPrecondition(EObject container)
	{
		return container instanceof YClass;
	}

	public Boolean operationEventPrecondition(EObject self)
	{
		if (self instanceof YClass)
			return true;
		return false;
	}
	
	public Boolean operationSimObjPrecondition(EObject self)
	{
		if (self instanceof YClass)
			return true;
		return false;
	}
	
	public Boolean eventDecorationPrecondition(EObject self)
	{
		for (YClass superType : ((YClass) self).getSuperClass())
		{
			if ("DES.Event".equals(superType.getQualifiedName()))
				return true;
		}
		return false;
	}
	
	public Boolean queueDecorationPrecondition(EObject self)
	{
		for (YClass superType : ((YClass) self).getSuperClass())
		{
			if ("DES.Queue".equals(superType.getQualifiedName()))
				return true;
		}
		return false;
	}
	
	public Boolean simObjDecorationPrecondition(EObject self)
	{
		for (YClass superType : ((YClass) self).getSuperClass())
		{
			if ("DES.SimulationObject".equals(superType.getQualifiedName()))
				return true;
		}
		return false;
	}
	
	public String classNameLabel(YClass self)
	{
		String label = self.getName();
		if (label == null)
			label = "";
		if (eventDecorationPrecondition(self))
		{
			label += " (Event)";
		}
		else if (simObjDecorationPrecondition(self))
		{
			label += " (SimulationObject)";
		}
		else if (queueDecorationPrecondition(self))
		{
			label += " (Queue)";
		}
		return label;
	}
	
	public EObject desCreateSimObj(EObject self)
	{
		YPackage desPackage = getDESPackage(getModel(self));
		
		YClass eventClass = null, simObjClass = null, queueClass = null;
		for (YClass superClass : ((YClass) self).getSuperClass())
		{
			if ("Event".equals(superClass.getName()))
				eventClass = superClass;
			else if ("SimulationObject".equals(superClass.getName()))
				simObjClass = superClass;
			else if ("Queue".equals(superClass.getName()))
				queueClass = superClass;
		}
		
		if (queueClass != null)
			((YClass) self).getSuperClass().remove(queueClass);
		if (eventClass != null)
			((YClass) self).getSuperClass().remove(eventClass);
		if (simObjClass != null)
			((YClass) self).getSuperClass().remove(simObjClass);
		else
		{
			for (YPackageableElement element : desPackage.getOwnedMemberPackage())
			{	
				if (element.getName().equals("SimulationObject"))
				{
					((YClass) self).getSuperClass().add((YClass) element);
				}
			}
		}
	
		return self;
	}
	
	public EObject desCreateQueue(EObject self) {
		YPackage desPackage = getDESPackage(getModel(self));

		YClass eventClass = null, simObjClass = null, queueClass = null;
		for (YClass superClass : ((YClass) self).getSuperClass())
		{
			if ("Event".equals(superClass.getName()))
				eventClass = superClass;
			else if ("SimulationObject".equals(superClass.getName()))
				simObjClass = superClass;
			else if ("Queue".equals(superClass.getName()))
				queueClass = superClass;
		}

		if (eventClass != null)
			((YClass) self).getSuperClass().remove(eventClass);
		if (simObjClass != null)
			((YClass) self).getSuperClass().remove(simObjClass);
		if (queueClass != null)
			((YClass) self).getSuperClass().remove(queueClass);
		else
		{
			for (YPackageableElement element : desPackage.getOwnedMemberPackage())
			{	
				if (element.getName().equals("Queue"))
				{
					((YClass) self).getSuperClass().add((YClass) element);
				}
			}
		}

		return self;
	}
	
	public EObject desCreateEvent(EObject self)
	{
		YPackage desPackage = getDESPackage(getModel(self));
		
		YClass eventClass = null, simObjClass = null, queueClass = null;
		for (YClass superClass : ((YClass) self).getSuperClass())
		{
			if ("Event".equals(superClass.getName()))
				eventClass = superClass;
			else if ("SimulationObject".equals(superClass.getName()))
				simObjClass = superClass;
			else if ("Queue".equals(superClass.getName()))
				queueClass = superClass;
		}
		
		if (simObjClass != null)
			((YClass) self).getSuperClass().remove(simObjClass);
		if (queueClass != null)
			((YClass) self).getSuperClass().remove(queueClass);
		if (eventClass != null)
			((YClass) self).getSuperClass().remove(eventClass);
		else
		{
			for (YPackageableElement element : desPackage.getOwnedMemberPackage())
			{	
				if (element.getName().equals("Event"))
				{
					((YClass) self).getSuperClass().add((YClass) element);
				}
			}
		}
	
		return self;
	}

	private YPackage getDESPackage(YModel model)
	{
		for (YPackage pack : model.getPackages())
		{
			if ("DES".equals(pack.getName()))
				return pack;
		}
		// TODO:create DES package
		return null;
	}
	
	public Boolean importEcorePrecondition(EObject context)
	{
		if (context instanceof YPackage)
			return true;
		if (context instanceof YModel)
			return true;
		return false;	
	}
	
	public EObject convertToEcore(EObject container)
	{
//		EAnnotation annotation;
//		String pathEcoreFile = (annotation = container.eClass().getEAnnotation("path")).getDetails().get("path");
//		container.eClass().getEAnnotations().remove(annotation);
//		
//		YModel model = getModel(container);
//		YPackage typesPackage = model.getPackages().stream()
//				.filter(pack -> "Types".equals(pack.getName()))
//				.findAny()
//				.get();
//		
//		EcorePackage.eINSTANCE.eClass();
//
//		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new XMIResourceFactoryImpl());
//		ResourceSet resSet = new ResourceSetImpl();
//		Resource resource = resSet.getResource(URI.createFileURI(pathEcoreFile), true);
//
//		EPackage ePackage = (EPackage) resource.getContents().get(0);
//
//		YPackage yPackage = EcoreToYamm.getInstance().convertToYamm(ePackage, typesPackage);
//		
//		if (container instanceof YModel)
//		{
//			((YModel) container).getPackages().add(yPackage);
//		}
//		else if (container instanceof YPackage)
//		{
//			((YPackage) container).getOwnedMemberPackage().add(yPackage);
//		}
		
		return container;
	}
	
	public EObject setPath(EObject context, Object newValue)
	{
		EAnnotation annotation = context.eClass().getEAnnotation("path");
		if (annotation == null)
		{
			annotation = EcoreFactory.eINSTANCE.createEAnnotation();
			context.eClass().getEAnnotations().add(annotation);
		}
		annotation.setSource("path");
		annotation.getDetails().put("path", newValue.toString());
		return context;
	}
	
	public EObject generateJava(EObject self)
	{
		if (self instanceof YClass)
		{
			String javaCode = GenerateJavaClass.getInstance().generateJava((YClass) self);
			
			String yammModelPath = self.eResource().getURI().toPlatformString(true);
			String workspacPath = ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString();
			Session session = SessionManager.INSTANCE.getSession(self);
			String sessionId = session.getID();
			String projectName = sessionId.substring(19, sessionId.indexOf("representations.aird") - 1);
			
			String filePath = workspacPath + File.separator + projectName 
					+ File.separator + ((YClass) self).getName() + ".java";
			
			try (FileOutputStream fos = new FileOutputStream(filePath, false)) {
				byte[] b= javaCode.getBytes();
				fos.write(b);
			} catch (Exception e) {
				e.printStackTrace();
			}
			  		
		}
		return self;
	}
	
	public EObject showErrors(EObject self) 
	{
		/*
		// TODO: see Service.startValidation
		Map<String, String> errorsEffect;
		Map<String, String> errorsGuard;
		
		DslConverter dslConverter = null;
		for (Adapter adapter : self.eAdapters())
		{
			if (adapter instanceof DslConverter)
			{
				dslConverter = (DslConverter) adapter;
			}
		}
		
		Resource resource = self.eResource();
		URI uri;
		String projectName = (uri = URI.createPlatformResourceURI(resource.getURI().toPlatformString(true), false)).segments()[1];
		// create converter
		if (dslConverter == null)
		{
			dslConverter = new DslConverter();
			YModel model = (YModel) resource.getContents().get(0);
			model.eAdapters().add(dslConverter);
			dslConverter.init(model, projectName);
		}
		
		Injector injector = CoreModelDslActivator.getInstance()
				.getInjector(CoreModelDslActivator.ONLINE_YAMM_COREMODELDSL_XYAMM);
		IResourceValidator validator = injector.getInstance(IResourceValidator.class);
	
		String code = dslConverter.internalDsl.stream().collect(Collectors.joining("\n"));
		
		String tmpPath = (ResourcesPlugin.getWorkspace().getRoot().getLocation().toString()).concat("/" + projectName).concat("/" + "tmp.xyamm").replace('\\', '/');
		File xfile = new File(tmpPath);		
		try {
			FileWriter fileWriter = new FileWriter(xfile,false);
			fileWriter.write(code);
			fileWriter.close();
		} catch (IOException e) {
		        e.printStackTrace();
		} 
		
		ResourceSet rs = injector.getInstance(ResourceSet.class);

		((XtextResourceSet) rs).addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		Resource xResource;
		try {
			xResource = rs.getResource(URI.createURI(tmpPath), true);
		} catch (Exception e) {
			xResource = rs.getResource(URI.createURI(tmpPath), true);
		}
		 
		List<Issue> issues = validator.validate(xResource, CheckMode.ALL, CancelIndicator.NullImpl);
			
		errorsEffect = new HashMap<String, String>();
		errorsGuard = new HashMap<String, String>();
		IResource iResource = (IFile) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor().getEditorInput().
			    getAdapter(IFile.class);
		for (Issue issue : issues) {	
			if (issue.getSeverity() == Severity.ERROR && !issue.getMessage().endsWith(".java."))
			{
				try {
					IMarker m = iResource.createMarker(IMarker.PROBLEM);
					m.setAttribute(IMarker.MESSAGE, issue.getMessage());
					m.setAttribute(IMarker.PRIORITY, IMarker.PRIORITY_HIGH);
					m.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
				} catch (Exception e) {
					e.printStackTrace();
				}

			}

		}
		
		xfile.delete();
		
		*/
		return self;
	}
	
	
	public String biassoLabelA(YProperty property) {	
		return property.getName() + " [" + property.getLower() + ".." + (property.getUpper() == -1 ? "*" : property.getUpper()) + "]";
	}
	
	public String biassoLabelB(YProperty property) {
		YProperty opposite = property.getOpposite();
		return opposite.getName() + " [" + opposite.getLower() + ".." + (opposite.getUpper() == -1 ? "*" : opposite.getUpper()) + "]";
	}
	
}
