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
package online.yamm.compile;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.common.types.JvmGenericArrayTypeReference;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XExpression;

import online.yamm.coreModelXmi.yamm.YFeatureCall;
import online.yamm.coreModelXmi.yamm.YMemberFeatureCall;
import online.yamm.coreModelXmi.yamm.YammFactory;

/**
 * Preprocesses extension methods.
 * Transforms them to normal method invocations.
 *
 */
public class CodegenExtensionMethods {

	public XBlockExpression preprocess(XBlockExpression blockExp) {
		if (blockExp == null)
			return null;

		TreeIterator<EObject> content = EcoreUtil.<EObject>getAllContents(blockExp, false);
		List<YMemberFeatureCall> mfcExtensions = new ArrayList<YMemberFeatureCall>();
		List<YFeatureCall> fcExtensions = new ArrayList<YFeatureCall>();

		while (content.hasNext()) {
			EObject sourceASTElement = content.next();
			if (sourceASTElement instanceof YMemberFeatureCall) {
				YMemberFeatureCall mfc = (YMemberFeatureCall) sourceASTElement;
				if (mfc.getFeature() instanceof JvmOperation) {
					JvmOperation op = (JvmOperation) mfc.getFeature();
					if (!(!op.getParameters().isEmpty() && op.getParameters().get(op.getParameters().size() - 1).getParameterType() instanceof JvmGenericArrayTypeReference))
					if (op.getParameters().size() != mfc.getMemberCallArguments().size()) {
//						List<JvmFormalParameter> parameter = ((JvmOperation) mfc.getFeature()).getParameters();
//						if (!(parameter.size() == 1 && parameter.get(0).getParameterType() instanceof JvmGenericArrayTypeReference))
							mfcExtensions.add(mfc);
					}
				}
			} else if (sourceASTElement instanceof YFeatureCall) {
				YFeatureCall fc = (YFeatureCall) sourceASTElement;
				if (fc.getFeature() instanceof JvmOperation) {
					if (fc.getImplicitFirstArgument() != null) {
						fcExtensions.add(fc);
					}
				}
			}
		}
		
		
		for (YFeatureCall fc : fcExtensions) {
			
			XExpression firstArgument = fc.getImplicitFirstArgument();		
			fc.getFeatureCallArguments().add(firstArgument);
			fc.getFeatureCallArguments().move(0, firstArgument);

		}

		for (YMemberFeatureCall mfc : mfcExtensions) {
			YFeatureCall newFc = YammFactory.eINSTANCE.createYFeatureCall();
			
			if (mfc.getInheritanceType() != null)
				newFc.setInheritanceType(mfc.getInheritanceType());
			
			newFc.setFeature(mfc.getFeature());
			
			XExpression mfct = mfc.getMemberCallTarget();
		
			newFc.getFeatureCallArguments().add(mfct);
			
			if (!mfc.getMemberCallArguments().isEmpty())
				newFc.getFeatureCallArguments().addAll(mfc.getMemberCallArguments());
			
			EObject container = mfc.eContainer();
			EStructuralFeature containingFeature = mfc.eContainingFeature();
			
			if (containingFeature.isMany()) {
				
				EList containingList = (EList) container.eGet(containingFeature);
				int indexInList = containingList.indexOf(mfc);
				containingList.add(newFc);
				containingList.move(indexInList, newFc);
				containingList.remove(mfc);
				
			} else {			
				container.eSet(containingFeature, newFc);
			}			
			
		}

		return blockExp;

	}

}
