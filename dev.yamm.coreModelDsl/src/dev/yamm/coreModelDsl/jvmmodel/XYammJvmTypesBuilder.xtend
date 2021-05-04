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
package dev.yamm.coreModelDsl.jvmmodel

import com.google.inject.Inject
import dev.yamm.coreModelXmi.yamm.YProperty
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.common.types.JvmField
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.common.types.TypesFactory
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class XYammJvmTypesBuilder extends JvmTypesBuilder {
	@Inject TypesFactory typesFactory;
	@Inject IQualifiedNameProvider nameProvider

	override JvmField toField(EObject sourceElement, String name, JvmTypeReference typeRef,
		Procedure1<? super JvmField> initializer) {
			
		if (sourceElement == null || name == null)
			return null;
		var JvmField result = typesFactory.createJvmField()
		result.setSimpleName(name)

		if ((sourceElement as YProperty).visibility.value == 0)
			result.setVisibility(JvmVisibility.PUBLIC)
		else
			result.setVisibility(JvmVisibility.PRIVATE)
		result.setType(cloneWithProxies(typeRef))
		associate(sourceElement, result)
		return initializeSafely(result, initializer)
	}


}
