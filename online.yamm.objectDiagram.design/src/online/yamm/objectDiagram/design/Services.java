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
package online.yamm.objectDiagram.design;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.impl.EdgeImpl;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.diagram.DEdge;
import org.eclipse.sirius.diagram.DNodeContainer;
import org.eclipse.sirius.diagram.business.internal.metamodel.spec.DEdgeSpec;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DEdgeBeginNameEditPart;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DEdgeEditPart;
import org.eclipse.sirius.ecore.extender.business.api.accessor.exception.MetaClassNotFoundException;
import org.eclipse.sirius.properties.core.api.SiriusInputDescriptor;
import org.eclipse.sirius.properties.core.internal.SiriusContext;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;

import online.yamm.ObjectDiagram.ODAttribute;
import online.yamm.ObjectDiagram.ODObject;
import online.yamm.ObjectDiagram.ODReference;
import online.yamm.ObjectDiagram.ODType;
import online.yamm.ObjectDiagram.ObjectDiagram;
import online.yamm.ObjectDiagram.ObjectDiagramFactory;

/**
 * The services class used by VSM.
 */
public class Services {

	/*
	 * See
	 * http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%
	 * 2Findex.html&cp=24 for documentation on how to write service methods.
	 */

	public EObject debug(EObject self, Object a, Object b, Object c, Object d) {
		return self;
	}

	public String getLabelForReference(ODReference reference, DEdge view) {
		int index = reference.getValue().indexOf(((DSemanticDecorator) view.getTargetNode()).getTarget());
		return reference.getName() + (reference.getUpper() != 1 ? "[" + index + "]" : "");
	}

	public String getLabelForReferenceOpposite(ODReference reference, DEdge view) {
		Object semTarget = ((DSemanticDecorator) view.getTargetNode()).getTarget();
		ODReference oppositeRef = reference.getOpposites().stream()
				.filter(opposite -> opposite.eContainer() == semTarget).findAny().get();
		int index = oppositeRef.getValue().indexOf(((DSemanticDecorator) view.getSourceNode()).getTarget());
		return oppositeRef.getName() + (oppositeRef.getUpper() != 1 ? "[" + index + "]" : "");
	}

	public EList<EObject> getReferencesWithoutBiassociations(EObject self) {
		return null;
	}

	public EObject loadYammModel(EObject objectDiagram, String projectName) {
		if (objectDiagram instanceof ObjectDiagram) {
			String workspacPath = ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString();
			String relativeYammModelPath = ((ObjectDiagram) objectDiagram).getYammModelPath();
			relativeYammModelPath.replace("\\", "/");
			String yammModelPath = workspacPath + "/" + projectName + (relativeYammModelPath.startsWith("/") ? "" : "/")
					+ relativeYammModelPath;
			EcoreModelController.createDiagram((ObjectDiagram) objectDiagram, projectName, yammModelPath);

			// create ODTypes:
			EPackage metapackage = ((ObjectDiagram) objectDiagram).getMetaDataPackage();
			createTypes((ObjectDiagram) objectDiagram, metapackage, null);
		}

		return objectDiagram;
	}

	public EObject loadYammModel(EObject objectDiagram) {

		if (objectDiagram instanceof ObjectDiagram) {
			String workspacPath = ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString();
			String relativeYammModelPath = ((ObjectDiagram) objectDiagram).getYammModelPath();
			relativeYammModelPath.replace("\\", "/");
			Session session = SessionManager.INSTANCE.getSession(objectDiagram);
			String sessionId = session.getID();
			String projectName = sessionId.substring(19, sessionId.indexOf("representations.aird") - 1);
			String yammModelPath = workspacPath + "/" + projectName + (relativeYammModelPath.startsWith("/") ? "" : "/")
					+ relativeYammModelPath;
			EcoreModelController.createDiagram((ObjectDiagram) objectDiagram, projectName, yammModelPath);

			// create ODTypes:
			EPackage metapackage = ((ObjectDiagram) objectDiagram).getMetaDataPackage();
			createTypes((ObjectDiagram) objectDiagram, metapackage, session);
		}

		return objectDiagram;
	}

	private void createTypes(ObjectDiagram od, EPackage metapackage, Session session) {
		for (EClassifier classifier : metapackage.getEClassifiers()) {
			if (classifier instanceof EClass) {
				String qualifiedName = getQualifiedName((EClass) classifier);
				ODType type = null;
				try {
					if (session != null)
						type = (ODType) session.getModelAccessor().createInstance("ODType");
					else
						type = ObjectDiagramFactory.eINSTANCE.createODType();
				} catch (MetaClassNotFoundException e) {
					e.printStackTrace();
				}
				if (type != null) {
					if (classifier.getEAnnotation("stackframeMetadata") == null) {
						type.setName(classifier.getName());
						type.setQualifiedName(qualifiedName);
						String objectId = classifier.getEAnnotation("ObjectID").getDetails().get("value");
						type.setObjectID(objectId);
						type.setRuntimeType((EClass) classifier);
						// TODO: type.setYammType(...);
						((ObjectDiagram) od).getTypes().put(qualifiedName, type);
					}
				}
			} else if (classifier instanceof EEnum) {
				String qualifiedName = getQualifiedName(classifier);
				ODType type = null;
				try {
					if (session != null)
						type = (ODType) session.getModelAccessor().createInstance("ODType");
					else
						type = ObjectDiagramFactory.eINSTANCE.createODType();
				} catch (MetaClassNotFoundException e) {
					e.printStackTrace();
				}
				if (type != null) {
					type.setName(classifier.getName());
					type.setQualifiedName(qualifiedName);
//    				String objectId = classifier.getEAnnotation("ObjectID").getDetails().get("value");
//    				type.setObjectID(objectId);
					type.setRuntimeType(classifier);
					// TODO: type.setYammType(...);
					((ObjectDiagram) od).getTypes().put(qualifiedName, type);
				}
			}
		}
		for (EPackage subpackage : metapackage.getESubpackages()) {
			createTypes(od, subpackage, session);
		}
	}

	public EObject createObject(EObject self, Object container) {

		if (self instanceof EClass) {
			Session session = SessionManager.INSTANCE.getSession(getObjectDiagram((EObject) container));
			ODObject newObject = null;
			try {
				newObject = (ODObject) session.getModelAccessor().createInstance("ODObject");
			} catch (MetaClassNotFoundException e) {
				e.printStackTrace();
			}

			if (newObject != null) {
				newObject.setObjectID(Integer.toHexString(newObject.hashCode()));

				String qualifiedNameMetaData = getQualifiedName((EClass) self);
				ObjectDiagram objectDiagram = getObjectDiagram((EObject) container);

				ODType type = objectDiagram.getTypes().get(qualifiedNameMetaData);
				newObject.setType(type);

				// EObject runtimeInstance = ((EClass)
				// self).getEPackage().getEFactoryInstance().create(((EClass) self));
				// newObject.setRuntimeObject(runtimeInstance);

				for (EAttribute attributeRuntimeMetaData : ((EClass) type.getRuntimeType()).getEAllAttributes()) {
					String attributeName = attributeRuntimeMetaData.getName();
					if ("yClass".equals(attributeName) || "ObjectID".equals(attributeName))
						continue;
					ODAttribute newAttribute = null;
					try {
						newAttribute = (ODAttribute) session.getModelAccessor().createInstance("ODAttribute");
					} catch (MetaClassNotFoundException e) {
						e.printStackTrace();
					}
					if (newAttribute != null) {
						newAttribute.setName(attributeName);
						newAttribute.setValue("");
						newAttribute.setLower(attributeRuntimeMetaData.getLowerBound());
						newAttribute.setUpper(attributeRuntimeMetaData.getUpperBound());

						ODType attributeType;
						if (attributeRuntimeMetaData.getEType() instanceof EEnum) {
							String typeName = getQualifiedName(attributeRuntimeMetaData.getEType());
							attributeType = objectDiagram.getTypes().get(typeName);
						} else {
							String typeName = attributeRuntimeMetaData.getEType().getName();
							if ("EInt".equals(typeName))
								typeName = "EInteger";
							attributeType = objectDiagram.getTypes().get("Types." + typeName.substring(1));
						}
						newAttribute.setDataType(attributeType);
						newObject.getAttributes().add(newAttribute);
					}
				}

				objectDiagram.getObjects().add(newObject);
			}
		}
		return self;
	}

	private ObjectDiagram getObjectDiagram(EObject self) {
		EObject od = self;
		while (!(od instanceof ObjectDiagram))
			od = od.eContainer();
		return (ObjectDiagram) od;
	}

	public List<? extends EObject> getTypes(EObject self) {
		ObjectDiagram objectDiagram = getObjectDiagram(self);

		EPackage metadataPackage = objectDiagram.getMetaDataPackage();

		this.types.clear();
		List<EClass> types = new ArrayList<>();
		for (EClassifier classifier : metadataPackage.getEClassifiers()) {
			if (classifier instanceof EClass && classifier.getEAnnotation("stackframeMetadata") == null) {
				this.types.put(getQualifiedNameObjectCandidate(null, classifier), classifier);
				types.add((EClass) classifier);
			}

		}
		return types;
	}

	public String getQualifiedNameObjectCandidate(EObject self, Object candidate) {
		if (candidate instanceof EClass) {
			return getQualifiedName((EClass) candidate);
		}
		return "--error--";
	}

	private String getQualifiedName(EClassifier type) {
		String qualifiedName = type.getName();
		EPackage superPackage = type.getEPackage();
		while (superPackage.getESuperPackage() != null) {
			qualifiedName = superPackage.getName() + "." + qualifiedName;
			superPackage = superPackage.getESuperPackage();
		}
		return qualifiedName;
	}

	private static Map<String, Object> types = new HashMap<>();

	public Object getSelectedType(EObject self) {
		return getObjectDiagram(self).getTypeObjectCreate();
	}

	public Object getSelectedReference(EObject self, Object reference, Object _target) {
		if (reference instanceof ODReference && self instanceof ODObject && _target instanceof ODObject) {
			ODObject target = (ODObject) _target;
			ODObject source = (ODObject) self;
			if (((ODReference) reference).getName() == null || "".equals(((ODReference) reference).getName())) {
				List<EReference> references = ((EClass) source.getType().getRuntimeType()).getEAllReferences().stream()
						.filter(ref -> ref.getEType() == target.getType().getRuntimeType()
								&& !"this".equals(ref.getName()))
						.collect(Collectors.toList());

				if (!references.isEmpty()) {
					createReference((ODReference) reference, references.get(0), target);
					return references.get(0);
				} else
					return null;
			} else {
				return ((EClass) source.getType().getRuntimeType())
						.getEStructuralFeature(((ODReference) reference).getName());
			}
		}

		return null;
	}

	public List<? extends EObject> getReferences(EObject self, Object _source, Object _target) {
		if (_source instanceof ODObject && _target instanceof ODObject) {
			ODObject source = (ODObject) _source;
			ODObject target = (ODObject) _target;

			return ((EClass) source.getType().getRuntimeType()).getEAllReferences().stream()
					.filter(reference -> reference.getEType() == target.getType().getRuntimeType()
							&& !"this".equals(reference.getName()) 
							&& !"yClass".equals(reference.getName())
							&& !"ObjectID".equals(reference.getName()))
					.collect(Collectors.toList());
		}
		return null;
	}

	public String getNameReferenceCandidate(EObject self, Object candidate) {
		return ((EReference) candidate).getName();
	}

	public EObject createReference(ODReference odRef, EReference runtimeRef, ODObject target) {
		odRef.setName(runtimeRef.getName());
		odRef.setLower(runtimeRef.getLowerBound());
		odRef.setUpper(runtimeRef.getUpperBound());
		if (runtimeRef.getEOpposite() != null) {
			odRef.setBidirectional(true);
			odRef.getOpposites().clear();
		}
		return odRef;
	}

	public EObject initReference(EObject self, ODReference newValue, ODObject source, ODObject target) {
		if (newValue.getName() == null) {
			source.getReferences().remove(newValue);
			return self;
		}
		List<ODReference> existingRef = source.getReferences().stream()
				.filter(ref -> ref.getName() != null && ref.getName().equals(newValue.getName()) && ref != newValue)
				.collect(Collectors.toList());

		ODReference usedRef;
		if (existingRef.isEmpty()) {
			newValue.getValue().add(target);
			usedRef = newValue;
		} else {
			if (newValue.getUpper() != 1) {
				source.getReferences().remove(newValue);
				existingRef.get(0).getValue().add(target);
				usedRef = existingRef.get(0);
			} else {
				source.getReferences().remove(existingRef.get(0));
				if (newValue.isBidirectional()) {
					existingRef.get(0).getOpposites().get(0).getValue().remove(newValue.eContainer());
				}
				newValue.getValue().add(target);
				usedRef = newValue;
			}
		}

		if (usedRef.isBidirectional()) {
			EReference runtimeRef = (EReference) ((EClass) source.getType().getRuntimeType())
					.getEStructuralFeature(usedRef.getName());
			String nameOppositeRef = runtimeRef.getEOpposite().getName();
			Optional<ODReference> optionalOppositeODReference = target.getReferences().stream()
					.filter(ref -> nameOppositeRef.equals(ref.getName())).findAny();
			ODReference oppositeODReference;
			if (optionalOppositeODReference.isPresent()) {
				oppositeODReference = optionalOppositeODReference.get();
			} else {
				ODReference newReference = null;
				try {
					Session session = SessionManager.INSTANCE.getSession(target);
					newReference = (ODReference) session.getModelAccessor().createInstance("ODReference");
				} catch (MetaClassNotFoundException e) {
					e.printStackTrace();
				}
				target.getReferences().add(newReference);
				oppositeODReference = newReference;
				EReference runtimeRefOpposite = (EReference) ((EClass) target.getType().getRuntimeType())
						.getEStructuralFeature(nameOppositeRef);
				newReference.setName(runtimeRefOpposite.getName());
				newReference.setLower(runtimeRefOpposite.getLowerBound());
				newReference.setUpper(runtimeRefOpposite.getUpperBound());
				newReference.setBidirectional(true);
			}
			usedRef.getOpposites().add(oppositeODReference);
			oppositeODReference.getOpposites().add(usedRef);
			oppositeODReference.getValue().add((ODObject) usedRef.eContainer());

			if (newValue == usedRef) {
				usedRef.getOpposites().stream().filter(ref -> ref.eContainer() == target).findAny().get().getValue()
						.add(source);
			} else {
				ODReference oppositeRef = newValue.getOpposites().stream().filter(ref -> ref.eContainer() == target)
						.findAny().get();
				oppositeRef.getValue().add(source);
				usedRef.getOpposites().add(oppositeRef);
				oppositeRef.getOpposites().remove(newValue);
				oppositeRef.getOpposites().add(usedRef);
			}
		}

		return self;
	}

	public List<? extends EObject> candidatesReferenceBiassoziation(EObject self) {
		if (self instanceof ObjectDiagram) {
			List<? extends ODReference> result = ((ObjectDiagram) self).getObjects().parallelStream()
					.<ODReference>flatMap(object -> object.getReferences().stream())
					.filter(ref -> ref.isBidirectional()).collect(Collectors.toList());
			for (int index = 0; index < result.size(); index++) {
				result.removeAll(result.get(index).getOpposites());
			}
			return result;
		}
		return null;
	}

	public List<? extends EObject> candidatesReference(EObject self) {
		if (self instanceof ObjectDiagram) {
			return ((ObjectDiagram) self).getObjects().parallelStream()
					.flatMap(object -> object.getReferences().stream()).filter(ref -> !ref.isBidirectional())
					.collect(Collectors.toList());
		}
		return null;
	}

	public EObject deleteBiassoziation(ODReference refToDelete, Object view) {

		if (refToDelete.getUpper() == 1) {
			((ODObject) refToDelete.eContainer()).getReferences().remove(refToDelete);
			if (refToDelete.getOpposites().get(0).getUpper() == 1) {
				refToDelete.getValue().get(0).getReferences().remove(refToDelete.getOpposites().get(0));
			} else {
				refToDelete.getOpposites().get(0).getValue().remove(refToDelete.eContainer());
			}
		} else // refToDelete.getUpper() != 1
		{
			ODObject target = (ODObject) ((DSemanticDecorator) ((DEdge) view).getTargetNode()).getTarget();
			ODReference oppositeRef = refToDelete.getOpposites().stream().filter(ref -> ref.eContainer() == target)
					.findAny().get();
			if (oppositeRef.getUpper() == 1) {
				refToDelete.getValue().remove(oppositeRef.eContainer());
				((ODObject) oppositeRef.eContainer()).getReferences().remove(oppositeRef);
			} else {
				oppositeRef.getValue().remove(refToDelete.eContainer());
				refToDelete.getValue().remove(oppositeRef.eContainer());
			}
		}

		return refToDelete;
	}

	public EObject saveAsInitialModel(EObject self) {
		ObjectDiagram od = getObjectDiagram(self);

		Collection<ODObject> copy = copy(od.getObjects());

		od.getInitialModel().clear();
		od.getInitialModel().addAll(copy);

		return self;
	}

	public EObject loadInitialModel(EObject self) {
		ObjectDiagram od = getObjectDiagram(self);

		Collection<ODObject> copy = copy(od.getInitialModel());

		od.getObjects().clear();
		od.getObjects().addAll(copy);

		return self;
	}

	private Collection<ODObject> copy(List<ODObject> original) {
		EcoreUtil.Copier copier = new EcoreUtil.Copier();
		Collection<ODObject> copy = copier.copyAll(original);

		Map<String, ODObject> idToOriginal = new HashMap<String, ODObject>();
		Map<String, ODObject> idToCopy = new HashMap<String, ODObject>();
		for (ODObject odCopy : copy) {
			idToCopy.put(odCopy.getObjectID(), odCopy);
		}
		for (ODObject odOriginal : original) {
			idToOriginal.put(odOriginal.getObjectID(), odOriginal);
		}

		for (ODObject odOriginal : original) {
			ODObject odCopy = idToCopy.get(odOriginal.getObjectID());

			odCopy.setType(odOriginal.getType());

			for (ODReference refOriginal : odOriginal.getReferences()) {
				Optional<ODReference> refCopyOptinal = odCopy.getReferences().stream()
						.filter(ref -> ref.getName().equals(refOriginal.getName())).findAny();
				assert (refCopyOptinal.isPresent());
				ODReference refCopy = refCopyOptinal.get();
				for (ODObject value : refOriginal.getValue()) {
					ODObject valueCopy = idToCopy.get(value.getObjectID());
					refCopy.getValue().add(valueCopy);
				}
				for (ODReference oppositeOriginal : refOriginal.getOpposites()) {
					String nameOpposite = oppositeOriginal.getName();
					String objectID = ((ODObject) oppositeOriginal.eContainer()).getObjectID();
					ODReference oppositeCopy = idToCopy.get(objectID).getReferences().stream()
							.filter(ref -> ref.getName().equals(nameOpposite)).findAny().get();
					refCopy.getOpposites().add(oppositeCopy);
				}
			}
			for (ODAttribute atrOriginal : odOriginal.getAttributes()) {
				Optional<ODAttribute> atrCopyOptional = odCopy.getAttributes().stream()
						.filter(ref -> ref.getName().equals(atrOriginal.getName())).findAny();
				assert (atrCopyOptional.isPresent());
				ODAttribute atrCopy = atrCopyOptional.get();
				atrCopy.setDataType(atrOriginal.getDataType());
			}
		}
		return copy;
	}

	public List<? extends EObject> getOppositeRef(EObject self, Object _input) {
		List<ODReference> result = new BasicEList<>();
		if (!((ODReference) self).getOpposites().isEmpty()) {
			SiriusInputDescriptor input = (SiriusInputDescriptor) _input;
			SiriusContext context = input.getFullContext();
			Object editPart = context.getInput();
			DEdgeEditPart edgeEditPart;
			if (!(editPart instanceof DEdgeEditPart))
				edgeEditPart = (DEdgeEditPart) ((EditPart) editPart).getParent();
			else
				edgeEditPart = (DEdgeEditPart) editPart;
			DEdgeSpec dEdge = (DEdgeSpec) ((EdgeImpl) edgeEditPart.getModel()).getElement();
			DNodeContainer sourceDNode = (DNodeContainer) dEdge.getSourceNode();
			DNodeContainer targetDNode = (DNodeContainer) dEdge.getTargetNode();
			String nameOppositeRef = ((ODReference) self).getOpposites().get(0).getName();
			Optional<ODReference> optionalOppositeRef = ((ODObject) targetDNode.getTarget()).getReferences().stream()
					.filter(ref -> ref.getName().equals(nameOppositeRef)).findAny();
			if (optionalOppositeRef.isPresent()) {
				ODReference oppositeRef = optionalOppositeRef.get();
				result.add(oppositeRef);
			}
		}
		return result;
	}
	
	public String getAttributeType(EObject self)
	{
		String typeName = ((ODAttribute) self).getDataType().getQualifiedName();
		if (typeName.startsWith("Types."))
			return ((ODAttribute) self).getDataType().getName();
		return typeName;
	}
	
	
	
//
//	public String getIndex(EObject self)
//	{
//		return "-----";
//	}
//	
//	public Boolean hasIndex(EObject self)
//	{
//		return ((ODReference) self).getUpper() > 1 ? true : false;
//	}
	
}
