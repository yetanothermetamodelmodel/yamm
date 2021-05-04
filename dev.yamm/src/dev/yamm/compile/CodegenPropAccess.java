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
package dev.yamm.compile;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.eclipse.xtext.xbase.XAssignment;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.XMemberFeatureCall;

import dev.yamm.coreModelXmi.yamm.YammFactory;

/**
 * Preprocesses xbase property access statements.
 * Transforms them to normal getter/setter calls.
 */
public class CodegenPropAccess {

	public XBlockExpression preprocess(XBlockExpression blockExp) {
		if (blockExp == null)
			return null;

		TreeIterator<EObject> content = EcoreUtil.<EObject>getAllContents(blockExp, false);
		List<XAssignment> propertyAccessAssignments = new ArrayList<XAssignment>();

		while (content.hasNext()) {
			EObject sourceASTElement = content.next();
			if (sourceASTElement instanceof XAssignment) {
				XAssignment xAssign = (XAssignment) sourceASTElement;
				if (xAssign.getFeature() instanceof JvmOperation) {
					propertyAccessAssignments.add(xAssign);
				}
			}
		}

		for (XAssignment xAssign : propertyAccessAssignments) {
			XAbstractFeatureCall newAfc;
			
			if (xAssign.getAssignable() != null) {
				XMemberFeatureCall newMfc = YammFactory.eINSTANCE.createYMemberFeatureCall();
				newMfc.setFeature(xAssign.getFeature());
				newMfc.getMemberCallArguments().add(xAssign.getValue());
				newMfc.setMemberCallTarget(xAssign.getAssignable());	
				newAfc = newMfc;
			} else {
				XFeatureCall newFc = YammFactory.eINSTANCE.createYFeatureCall();
				newFc.getFeatureCallArguments().add(xAssign.getValue());
				newFc.setFeature(xAssign.getFeature());
				newAfc = newFc;
			}
			
			EObject container = xAssign.eContainer();
			EStructuralFeature containingFeature = xAssign.eContainingFeature();
			if (containingFeature.isMany()) {
				EList containingList = (EList) container.eGet(containingFeature);
				int indexInList = containingList.indexOf(xAssign);
				containingList.add(newAfc);
				containingList.move(indexInList, newAfc);
				containingList.remove(xAssign);
			} else {
				container.eSet(containingFeature, newAfc);
			}
		}


		return blockExp;

	}

}
