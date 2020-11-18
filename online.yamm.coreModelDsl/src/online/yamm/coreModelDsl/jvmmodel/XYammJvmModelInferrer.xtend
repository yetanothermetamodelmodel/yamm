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
package online.yamm.coreModelDsl.jvmmodel

import com.google.inject.Inject
import java.util.HashMap
import java.util.Map
import online.yamm.coreModelXmi.yamm.YClass
import online.yamm.coreModelXmi.yamm.YEnumeration
import online.yamm.coreModelXmi.yamm.YNamedElement
import online.yamm.coreModelXmi.yamm.YOperation
import online.yamm.coreModelXmi.yamm.YPackageableElement
import online.yamm.coreModelXmi.yamm.YParameter
import online.yamm.coreModelXmi.yamm.YProperty
import online.yamm.coreModelXmi.yamm.YType
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.common.types.JvmField
import org.eclipse.xtext.common.types.JvmFormalParameter
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.JvmType
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.common.types.TypesFactory
import org.eclipse.xtext.common.types.access.IJvmTypeProvider
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations
import org.eclipse.xtext.xbase.jvmmodel.JvmTypeReferenceBuilder
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder

/**
 * <p>Infers a JVM model from the source model.</p> 
 * 
 * <p>The JVM model should contain all elements that would appear in the Java code 
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>     
 */
class XYammJvmModelInferrer extends AbstractModelInferrer {

	/**
	 * convenience API to build and initialize JVM types and their members.
	 */
	@Inject extension JvmTypesBuilder

	@Inject extension IQualifiedNameProvider

	@Inject ResourceDescriptionsProvider resourceDescriptionsProvider

	@Inject IJvmTypeProvider.Factory jdtTypesProviderFactory

	@Inject JvmTypeReferenceBuilder.Factory jvmTypeReferenceBuilderFactory

	IJvmTypeProvider typeProvider

	Map<YType, JvmDeclaredType> inferredTypes = new HashMap
	@Inject IJvmModelAssociations jvmModelAssociation
	/**
	 * The dispatch method {@code infer} is called for each instance of the
	 * given element's type that is contained in a resource.
	 * 
	 * @param element
	 *            the model to create one or more
	 *            {@link JvmDeclaredType declared
	 *            types} from.
	 * @param acceptor
	 *            each created
	 *            {@link JvmDeclaredType type}
	 *            without a container should be passed to the acceptor in order
	 *            get attached to the current resource. The acceptor's
	 *            {@link IJvmDeclaredTypeAcceptor#accept(org.eclipse.xtext.common.types.JvmDeclaredType)
	 *            accept(..)} method takes the constructed empty type for the
	 *            pre-indexing phase. This one is further initialized in the
	 *            indexing phase using the lambda you pass as the last argument.
	 * @param isPreIndexingPhase
	 *            whether the method is called in a pre-indexing phase, i.e.
	 *            when the global index is not yet fully updated. You must not
	 *            rely on linking using the index if isPreIndexingPhase is
	 *            <code>true</code>.
	 */
	def dispatch void infer(YClass clazz, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {

		val JvmGenericType newJvmClass = clazz.toClass(clazz.fullyQualifiedName)
		

		try {
			typeProvider = jdtTypesProviderFactory.findOrCreateTypeProvider(clazz.eResource().getResourceSet())
		} catch (Exception exception) {
			println()
		}

	
		inferredTypes.put(clazz, newJvmClass)

		var boolean eventQueueValue;
		if (clazz.fullyQualifiedName.toString == "DES.EventQueue")
			eventQueueValue = true
		else
			eventQueueValue = false
		val eventQueue = eventQueueValue;

		acceptor.accept(newJvmClass) [

			if (clazz.fullyQualifiedName.toString.equals("RObject")) {
				var typeRef = TypesFactory.eINSTANCE.createJvmParameterizedTypeReference()
				var jvmType = jdtTypesProviderFactory.findOrCreateTypeProvider(clazz.eResource().getResourceSet()).
					findTypeByName("org.eclipse.emf.ecore.EObject")
				typeRef.type = jvmType
				superTypes += typeRef
			}

			for (superClass : clazz.superClass) {
				var typeRef = TypesFactory.eINSTANCE.createJvmParameterizedTypeReference();
				typeRef.type = inferredTypes.get(superClass) as JvmGenericType
				superTypes += typeRef
			}

			for (property : clazz.ownedAttribute) {
				if (isTypeSet(property)) {
					var JvmField field
					if (property.name == "yClass" && clazz.fullyQualifiedName.toString == "RObject") {
						field = property.toField(property.name, getJvmTypeRef(property))
						field.static = true
					} else {
						field = property.toField(property.name, getJvmTypeRef(property))
						if (property.static)
							field.static = true;
					}
					members += field
				}
			}

			for (operation : clazz.ownedOperation) {
				if (operation.name == clazz.name) {
					var jvmConstructor = operation.toConstructor [
						for (parameter : operation.ownedParameter) {
							if (isTypeSet(parameter)) {
								var JvmFormalParameter param = parameter.toParameter(parameter.name,
									getJvmTypeRef(parameter))
								parameters += param
							}
						}
					]
					members += jvmConstructor
				} else {
					if (operation.returnType == null) {
						var jvmOperation = operation.toMethod(operation.name, typeRef(Void.TYPE)) [
							for (parameter : operation.ownedParameter) {
								if (isTypeSet(parameter)) {
									var JvmFormalParameter param = parameter.toParameter(parameter.name,
										getJvmTypeRef(parameter))
									parameters += param
								}
							}
						]
						if (eventQueue)
							jvmOperation.static = true
						members += jvmOperation
					} else {
						var jvmOperation = operation.toMethod(operation.name, getJvmTypeRef(operation)) [
							for (parameter : operation.ownedParameter) {
								if (isTypeSet(parameter)) {
									var JvmFormalParameter param = parameter.toParameter(parameter.name,
										getJvmTypeRef(parameter))
									parameters += param
								}
							}
						]
						if (eventQueue)
							jvmOperation.static = true
						members += jvmOperation
					}
				}

				var statemachine = operation.stateMachine
				if (statemachine != null)
					for (attachment : statemachine.trAttach) {
						var name = attachment.name;
						if (attachment.transition != null) {
							name = attachment.transition.name
						}
						members += attachment.toMethod("guardTransition" + name, typeRef(Boolean)) [
							for (parameter : operation.ownedParameter) {
								if (isTypeSet(parameter)) {
									var JvmFormalParameter param = parameter.toParameter(parameter.name,
										getJvmTypeRef(parameter))
									parameters += param
								}
							}
							body = attachment.guard
						]
						var effectCount = 0;
						for (effect : attachment.effects) {
							members +=
								effect.toMethod("effectTransition" + name + "_" + effectCount++, typeRef(Void.TYPE)) [
									for (parameter : operation.ownedParameter) {
										if (isTypeSet(parameter)) {
											var JvmFormalParameter param = parameter.toParameter(parameter.name,
												getJvmTypeRef(parameter))
											parameters += param
										}
									}
									body = effect.body
								]
						}
					}

			}
		]
	}

	def dispatch void infer(YEnumeration enumeration, IJvmDeclaredTypeAcceptor acceptor, boolean isPrelinkingPhase) {

		var JvmDeclaredType enumJvmType = enumeration.toEnumerationType(enumeration.fullyQualifiedName.toString)
		inferredTypes.put(enumeration, enumJvmType)

		acceptor.accept(enumJvmType as JvmDeclaredType) [

			var typesFactory = jdtTypesProviderFactory.findOrCreateTypeProvider(
				enumeration.eResource().getResourceSet());
			val enumTypeReference = TypesFactory.eINSTANCE.createJvmParameterizedTypeReference
			enumTypeReference.type = typesFactory.findTypeByName("java.lang.Enum")
			superTypes += enumTypeReference
			for (literal : enumeration.ownedLiteral) {
				members += literal.toEnumerationLiteral(literal.name)
			}
		]
	}

	protected def boolean isTypeSet(Object obj) {
		switch (obj) {
			YParameter case obj.type == null: return false
			YProperty case obj.type == null: return false
			YOperation case obj.returnType == null: return false
		}
		return true
	}

	def JvmTypeReference getJvmTypeRef(Object yammType) {

		var typeRef = TypesFactory.eINSTANCE.createJvmParameterizedTypeReference();

		switch (yammType) {
			YParameter: {
				if (yammType.upper == -1) {
					typeRef.type = jdtTypesProviderFactory.findOrCreateTypeProvider(
						yammType.eResource().getResourceSet()).findTypeByName("java.util.List");
					var typeParameter = TypesFactory.eINSTANCE.createJvmParameterizedTypeReference();
					typeParameter.type = getJvmType(yammType.type, true)
					if (yammType.isUpperboundWildcard) {
						typeRef.arguments.add(
							jvmTypeReferenceBuilderFactory.create(yammType.eResource.resourceSet).
								wildcardExtends(typeParameter))
					} else {
						typeRef.arguments.add(typeParameter)
					}

				} else {
					typeRef.type = getJvmType(yammType.type, false)
				}

			}
			YProperty: {
				if (yammType.upper == -1) {
					typeRef.type = jdtTypesProviderFactory.findOrCreateTypeProvider(
						yammType.eResource().getResourceSet()).findTypeByName("java.util.List");
					var typeParameter = TypesFactory.eINSTANCE.createJvmParameterizedTypeReference();
					typeParameter.type = getJvmType(yammType.type, true)
					typeRef.arguments.add(typeParameter)
				} else {
					typeRef.type = getJvmType(yammType.type, false)
				}
			}
			YOperation: {
				if (yammType.upper == -1) {
					typeRef.type = jdtTypesProviderFactory.findOrCreateTypeProvider(
						yammType.eResource().getResourceSet()).findTypeByName("java.util.List");
					var typeParameter = TypesFactory.eINSTANCE.createJvmParameterizedTypeReference();
					typeParameter.type = getJvmType(yammType.returnType, true)
					typeRef.arguments.add(typeParameter)
				} else {
					typeRef.type = getJvmType(yammType.returnType, false)
				}
			}
		}
		return typeRef
	}

	def JvmType getJvmType(YType yammType, boolean many) {
//		var IJvmTypeProvider typeProvider
//		
//		try {
//			typeProvider = jdtTypesProviderFactory.findOrCreateTypeProvider(yammType.eResource().getResourceSet())
//		} catch (Exception exception) {
//			println()
//		}
		

		switch (getQualifiedName(yammType)) {
			case "Integer": {
				if (many) {
					return typeProvider.findTypeByName("java.lang.Integer");
				} else {
					return typeProvider.findTypeByName("int");
				}
			}
			case "Double": {
				if (many) {
					return typeProvider.findTypeByName("java.lang.Double");
				} else {
					return typeProvider.findTypeByName("double");
				}
			}
			case "String": {
				return typeProvider.findTypeByName("java.lang.String");
			}
			case "Object": {
				return typeProvider.findTypeByName("java.lang.Object");
			}
			case "Boolean": {
				if (many) {
					return typeProvider.findTypeByName("java.lang.Boolean");
				} else {
					return typeProvider.findTypeByName("boolean");
				}
			}
			default: {
				return jvmModelAssociation.getPrimaryJvmElement(yammType) as JvmType
//				return inferredTypes.get(yammType)
			}
		}
	}

	def String getQualifiedName(YNamedElement object) {
		if (object instanceof YPackageableElement) {
			var YPackageableElement object2 = object
			var String quailfiedName = object2.name;
			if ("Integer".equals(quailfiedName) || "Double".equals(quailfiedName) || "Boolean".equals(quailfiedName) ||
				"String".equals(quailfiedName) || "Object".equals(quailfiedName))
				return quailfiedName
			while ((object2 = object2.parentElement) != null) {
				quailfiedName = object2.name + "." + quailfiedName
			}
			return quailfiedName
		}
		try {
			return object.name
		} catch (Exception exception) {
		}
		return ""
	}

}
