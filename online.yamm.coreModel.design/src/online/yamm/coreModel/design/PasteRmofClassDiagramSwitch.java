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
package online.yamm.coreModel.design;



import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;

import online.yamm.coreModelDiagram.yammDiagram.YAggregationKind;
import online.yamm.coreModelDiagram.yammDiagram.YClass;
import online.yamm.coreModelDiagram.yammDiagram.YEnumeration;
import online.yamm.coreModelDiagram.yammDiagram.YEnumerationLiteral;
import online.yamm.coreModelDiagram.yammDiagram.YModel;
import online.yamm.coreModelDiagram.yammDiagram.YObject;
import online.yamm.coreModelDiagram.yammDiagram.YOperation;
import online.yamm.coreModelDiagram.yammDiagram.YPackage;
import online.yamm.coreModelDiagram.yammDiagram.YPackageableElement;
import online.yamm.coreModelDiagram.yammDiagram.YParameter;
import online.yamm.coreModelDiagram.yammDiagram.YProperty;
import online.yamm.coreModelDiagram.yammDiagram.YStateMachine;



public class PasteRmofClassDiagramSwitch extends online.yamm.coreModelDiagram.yammDiagram.util.YammDiagramSwitch<YObject>
{
	private EObject container;

	private List<YObject> copiedElements = new ArrayList<>();

	private YPackage typesPackage; 
	private YClass rObjectClass;
	private YClass booleanClass;
	private YClass stringClass;
	private YClass doubleClass;
	private YClass integerClass;

	private Resource resource;

	public void setContainer(EObject container) {
		this.container = container;
	}

	public void customizeCopiedElements()
	{//copiedElements.clear();
		try {
			typesPackage = null;
			if (!copiedElements.isEmpty())
			{
				YObject elem = copiedElements.get(0);
				while (!(elem instanceof YModel))
					elem = (YObject)elem.eContainer();

				rObjectClass = ((YModel) elem).getClazz().stream().filter(clazz -> "RObject".equals(clazz.getName())).findAny().get();

				for (YPackage pack : ((YModel) elem).getPackages())
				{
					//TOD: die Typen �berall suchen(wenn kein Types Package....)
					resource = pack.eResource();
					if ("Types".equals(pack.getName()))
					{
						typesPackage = pack;
						for (YPackageableElement elemInTypesPackage : typesPackage.getOwnedMemberPackage())
						{
							if (elemInTypesPackage instanceof YClass)
							{
								YClass clazz = (YClass) elemInTypesPackage;

								if ("Integer".equals(clazz.getName()))
									integerClass = clazz;
								else if ("Double".equals(clazz.getName()))
									doubleClass = clazz;
								else if ("String".equals(clazz.getName()))
									stringClass = clazz;
								else if ("Boolean".equals(clazz.getName()))
									booleanClass = clazz;
							}
						}
					}
				}
				if (typesPackage != null)
				{
					for (YObject copiedElement : copiedElements)
					{
						changePrimitiveType(copiedElement);
					}
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			copiedElements.clear();
		}	
	}

	@Override
	public YObject caseYProperty(YProperty newProperty) 
	{
		YClass containerClass = null;

		if (container instanceof YClass) 
		{
			containerClass = (YClass) container;
		}
		else if (container instanceof YProperty) 
		{
			containerClass = (YClass) container.eContainer();
		}
		else if (container instanceof YOperation) 
		{
			containerClass = (YClass) container.eContainer();
		}
		else if (container instanceof YParameter)
		{
			containerClass = (YClass) container.eContainer().eContainer();
		}

		if (containerClass != null)
		{
			copiedElements.add(newProperty);
			newProperty.setAssociation(false);
			newProperty.setOpposite(null);
			newProperty.setAggregation(YAggregationKind.get("none"));
			containerClass.getOwnedAttribute().add(newProperty);
			changeObjectIdOfAllChildren(newProperty);
//			setObjectID(newProperty);
//			newProperty.setName(newProperty.getName() + "_" + newProperty.getObjectID());
		}

		return newProperty;
	}



	@Override
	public YObject caseYClass(YClass newClass)
	{
		for (YProperty property : newClass.getOwnedAttribute())
		{
			property.setOpposite(null);
		}
		
		if (container instanceof YModel)
		{
			YModel containerModel = (YModel) container;
			containerModel.getClazz().add(newClass);
			newClass.setPackage(null);		
			copiedElements.add(newClass);
			changeObjectIdOfAllChildren(newClass);
			
		}
		
		else if (container instanceof YPackage) 
		{
			YPackage containerPackage = (YPackage) container;
			containerPackage.getOwnedMemberPackage().add(newClass);
			newClass.setPackage(containerPackage);	
			copiedElements.add(newClass);
			changeObjectIdOfAllChildren(newClass);
		}
		newClass.eContainer();

		return newClass;
	}

	@Override
	public YObject caseYOperation(YOperation newOperation) 
	{
		YClass containerClass = null;

		if (container instanceof YClass)
		{
			containerClass = (YClass) container;
		}
		else if (container instanceof YProperty)
		{
			containerClass = (YClass) container.eContainer();
		}
		else if (container instanceof YOperation)
		{
			containerClass = (YClass) container.eContainer();
		}
		else if (container instanceof YParameter)
		{
			containerClass = (YClass) container.eContainer().eContainer();
		}

		if (containerClass != null)
		{
			copiedElements.add(newOperation);
			containerClass.getOwnedOperation().add(newOperation);
			newOperation.setClazz(containerClass);
			changeObjectIdOfAllChildren(newOperation);
//			setObjectID(newOperation);
		}
		return newOperation;
	}

	
	@Override
	public YObject caseYParameter(YParameter newParameter) 
	{
		YOperation containerOperation = null;

		if (container instanceof YOperation)
		{
			containerOperation = (YOperation) container;
		}
		else if (container instanceof YParameter)
		{
			containerOperation = (YOperation) container.eContainer();
		}

		if (containerOperation != null)
		{
			copiedElements.add(newParameter);
			containerOperation.getOwnedParameter().add(newParameter);
			changeObjectIdOfAllChildren(newParameter);
//			setObjectID(newParameter);
//			newParameter.setName(newParameter.getName() + "_" + newParameter.getObjectID());
		}

		return newParameter;
	}

	@Override
	public YObject caseYPackage(YPackage newPackage) 
	{
		if (container instanceof YModel)
		{
			YModel containerModel = (YModel) container;
			containerModel.getPackages().add(newPackage);
			newPackage.setPackage(null);	
			copiedElements.add(newPackage);
			changeObjectIdOfAllChildren(newPackage);
//			setObjectID(newPackage);
//			newPackage.setName("Package" + newPackage.getObjectID());
		}
		else if (container instanceof YPackage) 
		{
			YPackage containerPackage = (YPackage) container;
			containerPackage.getOwnedMemberPackage().add(newPackage);
			newPackage.setPackage(containerPackage);
			copiedElements.add(newPackage);
			changeObjectIdOfAllChildren(newPackage);
//			setObjectID(newPackage);
//			newPackage.setName("Package" + newPackage.getObjectID());
		}

		return newPackage;
	}

	@Override
	public YObject caseYEnumeration(YEnumeration newEnumeration) 
	{
		if (container instanceof YModel)
		{
			YModel containerModel = (YModel) container;
			containerModel.getEnumerations().add(newEnumeration);
			newEnumeration.setPackage(null);
			changeObjectIdOfAllChildren(newEnumeration);
//			copiedElements.add(newEnumeration);
//			setObjectID(newEnumeration);
		}
		else if (container instanceof YPackage) 
		{
			YPackage containerPackage = (YPackage) container;
			containerPackage.getOwnedMemberPackage().add(newEnumeration);
			newEnumeration.setPackage(containerPackage);
			changeObjectIdOfAllChildren(newEnumeration);
//			copiedElements.add(newEnumeration);
//			setObjectID(newEnumeration);
		}
		return newEnumeration;
	}

	@Override
	public YObject caseYEnumerationLiteral(YEnumerationLiteral newEnumLiteral) 
	{
		YEnumeration containerEnumeration = null;

		if (container instanceof YEnumeration)
		{
			containerEnumeration = (YEnumeration) container;
		}
		else if (container instanceof YEnumerationLiteral)
		{
			containerEnumeration = (YEnumeration) container.eContainer();
		}

		if (containerEnumeration != null)
		{
			copiedElements.add(newEnumLiteral);
			containerEnumeration.getOwnedLiteral().add(newEnumLiteral);
			changeObjectIdOfAllChildren(newEnumLiteral);
//			setObjectID(newEnumLiteral);
		}

		return newEnumLiteral;
	}



	private void changePrimitiveType(YObject newObject) 
	{
		if (newObject instanceof YProperty)
		{
			YProperty newProperty = (YProperty) newObject;
			if (newProperty.getType() == null)
				return;
			String typeName = newProperty.getType().getName();
			if ("RObject".equals(typeName))
			{
				newProperty.setType(rObjectClass);
			}
			else if ("Boolean".equals(typeName))
			{
				newProperty.setType(booleanClass);
			}
			else if ("String".equals(typeName))
			{
				newProperty.setType(stringClass);
			}
			else if ("Integer".equals(typeName))
			{
				newProperty.setType(integerClass);
			}
			else if ("Double".equals(typeName))
			{
				newProperty.setType(doubleClass);
			}
			else if (newProperty.getType().eResource() != resource)
			{
				newProperty.setType(null);
				if (newProperty instanceof YProperty)
				{
					((YProperty) newProperty).setAssociation(false);
				}
			}
		}
		else if (newObject instanceof YParameter)
		{
			YParameter newParameter = (YParameter) newObject;
			if (newParameter.getType() == null)
				return;
			String typeName = newParameter.getType().getName();
			if ("RObject".equals(typeName))
			{
				newParameter.setType(rObjectClass);
			}
			else if ("Boolean".equals(typeName))
			{
				newParameter.setType(booleanClass);
			}
			else if ("String".equals(typeName))
			{
				newParameter.setType(stringClass);
			}
			else if ("Integer".equals(typeName))
			{
				newParameter.setType(integerClass);
			}
			else if ("Double".equals(typeName))
			{
				newParameter.setType(doubleClass);
			}
			else if (newParameter.getType().eResource() != resource)
			{
				newParameter.setType(null);
				if (newParameter instanceof YProperty)
				{
					((YProperty) newParameter).setAssociation(false);
				}
			}
		}
		else if (newObject instanceof YClass)
		{
			((YClass) newObject).getOwnedAttribute().forEach(this::changePrimitiveType);
			
			if (!(((YClass) newObject).getSuperClass().isEmpty()))
			{
				YClass oldRObject = null;
				List<EObject> superClassesInOtherResource = new ArrayList<>();
				for (YClass superClass : ((YClass) newObject).getSuperClass())
				{
					if ("RObject".equals(superClass.getName()))
					{
						oldRObject = superClass;
					}
					else if (superClass.eResource() != resource)
					{
						superClassesInOtherResource.add(superClass);
					}
				}
				((YClass) newObject).getSuperClass().removeAll(superClassesInOtherResource);
				if (oldRObject != null)
				{
					((YClass) newObject).getSuperClass().remove(oldRObject);
					((YClass) newObject).getSuperClass().add(rObjectClass);
				}
			}
		}
		else if (newObject instanceof YPackage)
		{
			((YPackage) newObject).getOwnedMemberPackage().forEach(this::changePrimitiveType);
		}

	}
	
	
	private void changeObjectIdOfAllChildren(EObject root)
	{
		if (root == null)
			return;
		for (EReference containmentReference : root.eClass().getEAllContainments())
		{
			if (containmentReference.isMany())
			{
				EList list = (EList) root.eGet(containmentReference);
				for (Object object : list)
				{
					changeObjectIdOfAllChildren((EObject) object);
				}
			}
			else
			{
				EObject object = (EObject) root.eGet(containmentReference);
				changeObjectIdOfAllChildren(object);
			}
			
		}
		if (root instanceof YObject)
		{
			YObject root_ = (YObject) root;
			int hashCode = root_.hashCode();
			hashCode -= (hashCode % 16);
			ForbidModifcationOfObjectID.ignoreNext = true;
			root_.setObjectID("f" + Integer.toHexString(hashCode / (16*16)));	
			if (root_ instanceof YStateMachine) {
				((YStateMachine)root_).setName(root_.eClass().getName() + root_.getObjectID());
			}
			
		}
	}


}
