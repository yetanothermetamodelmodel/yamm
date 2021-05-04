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
package dev.yamm;


import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.inject.Inject;

import java.util.Vector;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;

import dev.yamm.coreModelDsl.ui.internal.CoreModelDslActivator;
import dev.yamm.coreModelXmi.yamm.YClass;
import dev.yamm.coreModelXmi.yamm.YEnumeration;
import dev.yamm.coreModelXmi.yamm.YPackage;
import dev.yamm.coreModelXmi.yamm.YProperty;
import dev.yamm.coreModelXmi.yamm.YammPackage;
import dev.yamm.coreModelXmi.yamm.impl.YammFactoryImpl;
import dev.yamm.coreModelXmi.yamm.impl.YammPackageImpl;
import dev.yamm.gui.Layer;
import dev.yamm.gui.LayerView;
import dev.yamm.logger.YAMMLogger;
import dev.yamm.coreModelDsl.XYammRuntimeModule;


/**
 * This class generates he runtime model. 
 * The structural part of a yamm model is transformed to an ecore model.
 * 
 * Creates an EClass(Operation-Class/Object, stackframe) for every YOperation 
 * to hold the parameter and for accessing the runtime instances from within the generated code of an effect.  
 * 
 */
public class GenerateEcore {

	public static YAMMLogger logger = YAMMLogger.getYAMMLogger("YAMM Log");

	/**  the EcoreFacory to create runtime model elements */
	private static EcoreFactory ecoreFactory = EcoreFactory.eINSTANCE;

	/** Contains YClass/ YEnumeration/ YPackage as keys and their ecore counterparts (EClasses/ EEnums/ EPackages)
	 *  as values. */
	private EMap<EObject, EObject> yammObjectsToEcoreObjectsMap = new BasicEMap<EObject, EObject>();

	/** operation-classes */
	private EMap<EObject, EClass> yammClassToOperationClasses = new BasicEMap<>();

	/** all YClass in the model */
	private Vector<EObject> yammClasses = new Vector<>();

	/** all YPackage in the model */
	private Vector<EObject> yammPackages = new Vector<>();

	/** Contains each object of the Yamm model. */
	private Vector<Object> yammObjects = new Vector<Object>();

	private Map<EObject, EReference> yPropertyToEReference = new HashMap<>();

	/** the new constructed EPackage*/
	private EPackage ecorePackage;

	/**  reference to the InitializeLayer Object */
	InitializeLayer loading;
	
	ObjectManagement om;

	public boolean laodModelForObjectDiagram = false;
	
	public GenerateEcore(InitializeLayer loading) {
		this.loading = loading;
	}

	
	
	/**
	 * Does the same as generateEPackage, but persist the generated package in an .ecore file.
	 * 
	 * @param path the path to the yamm model
	 * @param shell shell(top-level window) for the FileDialog...
	 * @param line used for the nsURI, name and prefix of the generated package
	 */
	public void generateEcore(String path, Shell shell, int line) {
		resetStatus();

		//Instantiate ResourceManagement when it is not already done
		ResourceManagement yamm = LayerView.yamm;

		loadYammObjects(path, 0);

		createEClassEEnumEPackage();	

		for (EObject yammClass : yammClasses)
		{
			createThis(yammClass);
			setESuperTypes(yammClass);
			createAndSetEAttributesAndEReferences(yammClass, null);
			createAndSetOperations(yammClass);
		}

		ecorePackage.setNsURI("current");
		ecorePackage.setName("yammLayer"+line);
		ecorePackage.setNsPrefix("yammLayer"+line);
		ecorePackage.setNsURI("http:///yammLayer"+line);

		for (Entry rPropERefEntry : yPropertyToEReference.entrySet())
		{
			EReference oppositeEReference = yPropertyToEReference.get(((YProperty) rPropERefEntry.getKey()).getOpposite());
			((EReference) rPropERefEntry.getValue()).setEOpposite(oppositeEReference);
		}

		FileDialog fd = new FileDialog(shell, SWT.SAVE);
		fd.setText("save ecorefile");
		fd.setFilterPath(Platform.getLocation().toOSString());
		String[] filterExt = { "*.ecore" };
		fd.setFilterExtensions(filterExt);
		String selected =  fd.open();
		if(!selected.isEmpty()) {
			logger.debug("Save ecorefile");
			selected = selected.replace("\\", "/");
			URI fileURI = URI.createFileURI(selected);
			Resource resource = new XMIResourceImpl(fileURI);
			resource = new XMIResourceImpl(fileURI);

			resource.getContents().add(ecorePackage);

			try {
				resource.save(null);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}   

	}

	private void resetStatus() {
		ecorePackage = ecoreFactory.createEPackage();
		yammObjects.clear();
		yammObjectsToEcoreObjectsMap.clear();
		yammClassToOperationClasses.clear();
		yammClasses.clear();
		yammPackages.clear();
		yPropertyToEReference.clear();
		if (!laodModelForObjectDiagram)
			om = loading.reflectivStateChart.objectManagement;
		else
			om = new ObjectManagement();
	}

	
	/**
	 * Loads all content form model-file into Vector layerObjects.
	 * 
	 * @param path the path where to find the model-file
	 * @return returns false when its unable to load the model-file
	 */
	private boolean loadYammObjects(String path, int layer)  {

	if (!laodModelForObjectDiagram)
	{
		if (!((new File(path)).exists())) {
			// try to look in the current workspace
			if (dev.yamm.init.Activator.getDefault() != null) {
				path = (ResourcesPlugin.getWorkspace().getRoot().getLocation().toString()).concat(path).replace('\\', '/');
				if (!((new File(path)).exists())) {
					logger.error("File \"" + path + "\" does not exist!");
					return false;
				}
			} else {
				return false;
			}
		}
		if (!((new File(path)).canRead())) {
			logger.error("Can't read file \"" + path + "\"!");
			return false;
		}
		URI fileURI = URI.createFileURI((new File(path)).getAbsolutePath());
		Resource resource = null;
		
		if (loading.reflectivStateChart.resourceManagement.resourceSet == null) {
			// init Metadata
			loading.reflectivStateChart.resourceManagement.registerMetaModelPackages();
		}
		// TODO: warum?
		loading.reflectivStateChart.resourceManagement.resourceSet.getURIResourceMap().clear();
		loading.reflectivStateChart.resourceManagement.resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		resource = loading.reflectivStateChart.resourceManagement.resourceSet.getResource(fileURI, true);
		EcoreUtil.resolveAll(resource);			
		
		/*else
		{
			MetamodelPackage.eINSTANCE.eClass();

			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("metamodel", new XMIResourceFactoryImpl());
			ResourceSet resSet = new ResourceSetImpl();
			resource = resSet.getResource(fileURI, true);
			
		}
*/
		
		
		int countKeys = 0;
	
		TreeIterator<EObject> tree = resource.getAllContents();

		for (; tree.hasNext(); countKeys++) {
			Object objToAdd = tree.next();
			yammObjects.add(objToAdd);
		}
		logger.info("Successfully loaded " + countKeys + " objects for package generation and merge of file \"" + path + "\".");
		return true;
	}
	else
	{
		Injector injector2 = Guice.createInjector((Module) new XYammRuntimeModule());
		IResourceFactory resourceFactory = null;
		Injector injector = CoreModelDslActivator.getInstance().getInjector(CoreModelDslActivator.DEV_YAMM_COREMODELDSL_XYAMM);
		injector.injectMembers(this);
		injector2 = Guice.createInjector((Module) new XYammRuntimeModule());
		resourceSet.setPackageRegistry(new EPackageRegistryImpl());
		resourceFactory = injector2.getInstance(IResourceFactory.class);
	
		 
	

	resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xyamm", resourceFactory);
	resourceSet.getPackageRegistry().put(YammPackage.eNS_URI, createYammPackage());
	
	
		if (!((new File(path)).exists())) {
			// try to look in the current workspace
			
				path = (ResourcesPlugin.getWorkspace().getRoot().getLocation().toString()).concat(path).replace('\\', '/');

		}


		URI fileURI = URI.createFileURI((new File(path)).getAbsolutePath());
		

		resourceSet.getURIResourceMap().clear();

		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		Resource resource = resourceSet.getResource(fileURI, true);
		EcoreUtil.resolveAll(resource);
		int countKeys = 0;
		TreeIterator<EObject> tree = resource.getAllContents();

		for (; tree.hasNext(); countKeys++) {
			Object objToAdd = tree.next();
			yammObjects.add(objToAdd);
		}
				
		return true;
	}
	}
	
	@Inject
	public XtextResourceSet resourceSet = null;
	
	public YammPackage createYammPackage() {
		// create yamm package
//		yammFactory = new YammFactoryImpl();
		// System.out.println("New Created UMA Factory (eInstance) : " +
		// YammFactory.eINSTANCE);

		// Obtain or create and register package
		YammPackageImpl yammPackage = new YammPackageImpl(new YammFactoryImpl());
		// System.out.println("New Created UMA Package (eInstance) : " +
		// YammPackageImpl.eINSTANCE);

		// Create package meta-data objects
		yammPackage.createPackageContents();

		// Initialize created meta-data
		yammPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		// yammPackage.freeze();
		return yammPackage;
	}

	private int layer;
	/**
	 * 
	 * Loads the yamm model and transform it into an ecore model(--> EPackage).
	 * When no path is specified the parameter actLayer is used to
	 * obtain the path to the yamm model from the viewLayers 
	 * attribute of the class ObjectManagement.
	 * 
	 * @param actLayer the layer(element in ObjectManagement.viewLayers); 
	 * 				   only used when path != null
	 * @param path	the path to the yamm model
	 * @param nsURI	the nsURI of the new package
	 * @return layer - the new created (ecore-) package (null when the loading of the
	 * model files failed)
	 */
	public EPackage generateEPackage(int actLayer, String path, String nsURI)
	{
		layer = actLayer;
		resetStatus();

		if (path == null)
			path = ((Layer)loading.reflectivStateChart.objectManagement.getViewLayers().get(actLayer)).getPath();

		if (loadYammObjects(path, actLayer)) 
		{

			try {
				createEClassEEnumEPackage();
			} catch (Exception e) {
				e.printStackTrace();
			}
				

			for (EObject yammClass : yammClasses)
			{
//				if ("YClass".equals(om.<String>getGen(yammClass, "name"))
//						|| "YProperty".equals(om.<String>getGen(yammClass, "name")))
//					continue;
				createThis(yammClass);
				setESuperTypes(yammClass);
				createAndSetEAttributesAndEReferences(yammClass, actLayer);
				createAndSetOperations(yammClass);
			}

			ecorePackage.setNsURI(nsURI);

			for (Entry rPropERefEntry : yPropertyToEReference.entrySet())
			{
				EReference oppositeEReference = yPropertyToEReference.get(((YProperty) rPropERefEntry.getKey()).getOpposite());
				((EReference) rPropERefEntry.getValue()).setEOpposite(oppositeEReference);
			}

			return ecorePackage; 
		} 
		else 
		{
			return null;
		}
	}
	
	public EPackage generateEPackageWithoutOperations(int actLayer, String path, String nsURI)
	{

		resetStatus();

		if (path == null)
			path = ((Layer)loading.reflectivStateChart.objectManagement.getViewLayers().get(actLayer)).getPath();

		if (loadYammObjects(path, actLayer)) 
		{

			createEClassEEnumEPackage();	

			for (EObject yammClass : yammClasses)
			{
				
//				if ("YClass".equals(yammClass.getName())
//						|| "YProperty".equals(yammClass.getName()))
//					continue;
				createThis(yammClass);
				setESuperTypes(yammClass);
				createAndSetEAttributesAndEReferences(yammClass, null);
//				createAndSetOperations(yammClass);
			}

			ecorePackage.setNsURI(nsURI);

			for (Entry rPropERefEntry : yPropertyToEReference.entrySet())
			{
				EReference oppositeEReference = yPropertyToEReference.get(((YProperty) rPropERefEntry.getKey()).getOpposite());
				((EReference) rPropERefEntry.getValue()).setEOpposite(oppositeEReference);
			}

			return ecorePackage; 
		} 
		else 
		{
			return null;
		}
	}

	/**
	 * adds the this reference to a new created EClass
	 * @param yammClass
	 */
	private void createThis(EObject yammClass) {
		EClass ecoreClass = (EClass) yammObjectsToEcoreObjectsMap.get(yammClass);
		EReference ecoreReference = ecoreFactory.createEReference();
		ecoreReference.setName("this");
		ecoreReference.setEType((EClassifier) yammObjectsToEcoreObjectsMap.get(yammClass));	
		ecoreClass.getEStructuralFeatures().add(ecoreReference);
	}

	/**
	 * Transforms every a YOperation of a YClass.
	 * A new EClass is created for Operations with a different name as the containing YClass.
	 * the name of this class consists of the name of the YClass, the name of the Operation 
	 * and the ObjectID of the Operation. The EClass is then added to the ecorePackage.
	 * 
	 * @param yammClass		:	the YClass owning the operation
	 */
	private void createAndSetOperations(EObject yammClass) {
		for (EObject yammOperation : om.<List<EObject>>getGen(yammClass, "ownedOperation")) 
		{
			EClass ecoreClass = null;

			ecoreClass = ecoreFactory.createEClass();
			ecoreClass.setName(om.<String>getGen(yammClass, "name") 
					+ om.<String>getGen(yammOperation, "name")
					+ om.<String>getGen(yammOperation, "ObjectID"));
			ecorePackage.getEClassifiers().add(ecoreClass);
			yammClassToOperationClasses.put(yammClass, ecoreClass);

			if (laodModelForObjectDiagram)
			{
				EAnnotation annotation = EcoreFactory.eINSTANCE.createEAnnotation();
				annotation.setSource("stackframeMetadata");
				EMap<String, String> details = annotation.getDetails();
				ecoreClass.getEAnnotations().add(annotation);
			}
			createEcoreParameterForYammOperation(yammOperation, yammClass);	

			createEReferenceForYammOperation(yammClass, ecoreClass);
		}
	}

	/**
	 * 
	 * Creates an EReference for the EClass representing a YOperation.
	 * 
	 * @param yammClass		:	the YClass owning the operation
	 * @param ecoreClass	:	EClass representing a YOperation
	 */
	private void createEReferenceForYammOperation(EObject yammClass, EClass ecoreClass) 
	{
		EReference ecoreReference = ecoreFactory.createEReference();
		ecoreReference.setName("itsRmofClass");	
		ecoreReference.setEType((EClassifier) yammObjectsToEcoreObjectsMap.get(yammClass));
		ecoreReference.setUpperBound(1);
		ecoreReference.setLowerBound(1);
		ecoreClass.getEStructuralFeatures().add(ecoreReference);
	}

	/**
	 * Transforms the YParameter of a YOperation of the YClass yammClass into EAttributes or EReferences
	 * @param yammOperation a YOperation of yammClass 
	 * @param yammClass the YClass from the *.yamm model
	 */
	private void createEcoreParameterForYammOperation(EObject yammOperation, EObject yammClass) {
		for (EObject yammParameter : om.<List<EObject>>getGen(yammOperation, "ownedParameter"))
		{
			if ("YClass".equals(om.<EObject>getGen(yammParameter, "type").eClass().getName()))
			{
				EObject typeOfYammParameter = om.<EObject>getGen(yammParameter, "type");

				if (isPrimitiveType(typeOfYammParameter))
				{
					EAttribute ecoreAttribute = ecoreFactory.createEAttribute();
					ecoreAttribute.setName(om.<String>getGen(yammParameter, "name"));
					YammPackage yammPackage = YammPackage.eINSTANCE;
					String yammClassName = om.<String>getGen(typeOfYammParameter, "name");

					if (yammClassName.equals("Integer")) 
						ecoreAttribute.setEType(EcorePackage.Literals.EINT);
					else if (yammClassName.equals("Boolean")) 	
						ecoreAttribute.setEType(EcorePackage.Literals.EBOOLEAN);
					else if (yammClassName.equals("String")) 
						ecoreAttribute.setEType(EcorePackage.Literals.ESTRING);
					else if (yammClassName.equals("Float")) 
						ecoreAttribute.setEType(EcorePackage.Literals.EFLOAT);
					else if (yammClassName.equals("Double"))
						ecoreAttribute.setEType(EcorePackage.Literals.EDOUBLE);
					else if (yammClassName.equals("Object"))
						ecoreAttribute.setEType(EcorePackage.Literals.EJAVA_OBJECT);	
					else
						logger.error("Unknown Type: ".concat(yammClassName));

					ecoreAttribute.setLowerBound(om.<Integer>getGen(yammParameter, "lower"));
					ecoreAttribute.setUpperBound(om.<Integer>getGen(yammParameter, "upper"));
					ecoreAttribute.setUnique(om.<Boolean>getGen(yammParameter, "isUnique"));

					EClass ecoreClass = yammClassToOperationClasses.get(yammClass);
					ecoreClass.getEStructuralFeatures().add(ecoreAttribute);


				} 
				else // not primitive:
				{
					EReference ecoreReference = ecoreFactory.createEReference();
					ecoreReference.setName(om.<String>getGen(yammParameter, "name"));	
					ecoreReference.setEType((EClassifier) yammObjectsToEcoreObjectsMap.get(typeOfYammParameter));
					ecoreReference.setUpperBound(om.<Integer>getGen(yammParameter, "upper"));
					ecoreReference.setLowerBound(om.<Integer>getGen(yammParameter, "lower"));
					ecoreReference.setUnique(om.<Boolean>getGen(yammParameter, "isUnique"));

					EClass ecoreClass = yammClassToOperationClasses.get(yammClass);
					ecoreClass.getEStructuralFeatures().add(ecoreReference);
				}
			}
			else if("YEnumeration".equals(om.<EObject>getGen(yammParameter, "type").eClass().getName()))
			{
				EObject yammEnum = om.<EObject>getGen(yammParameter, "type");
				EAttribute ecoreAttribute = ecoreFactory.createEAttribute();
				ecoreAttribute.setName(om.<String>getGen(yammParameter, "name"));
				ecoreAttribute.setEType((EClassifier) yammObjectsToEcoreObjectsMap.get(yammEnum));
				EClass ecoreClass = (EClass) yammClassToOperationClasses.get(yammClass);
				ecoreClass.getEStructuralFeatures().add(ecoreAttribute);
			}

		}
	}

	/**
	 * Check's if the given YClass is a primitive type
	 * 
	 * @param yammClass the YClass to check
	 * @return true when yammClass is a primitive type
	 */
	private boolean isPrimitiveType(EObject yammClass) {
		return    om.<String>getGen(yammClass, "name").equals("Integer") 
				|| om.<String>getGen(yammClass, "name").equals("Boolean") 
				|| om.<String>getGen(yammClass, "name").equals("String") 
				|| om.<String>getGen(yammClass, "name").equals("Float") 
				|| om.<String>getGen(yammClass, "name").equals("Double")	
				|| om.<String>getGen(yammClass, "name").equals("LargeInteger") 
				|| om.<String>getGen(yammClass, "name").equals("Rational") 
				|| om.<String>getGen(yammClass, "name").equals("Real")
				|| om.<String>getGen(yammClass, "name").equals("Object");
	}

	/**
	 * Transforms the YProperties of the YClass yammClass into EAttributes or EReferences and
	 * merge them into the EClass associated with yammClass.
	 * 
	 * @param yammClass the YClass from the *.yamm model
	 */
	private void createAndSetEAttributesAndEReferences(EObject yammClass, Integer layer) 
	{
		if (layer != null)
			layer = layer + 1;
		for (EObject yammProperty : om.<List<EObject>>getGen(yammClass, "ownedAttribute")) 
		{
			EClass ecoreClass = (EClass) yammObjectsToEcoreObjectsMap.get(yammClass);
			try {
				"YClass".equals(om.<EObject>getGen(yammProperty, "type").eClass().getName());
			} catch (Exception e) {
				e.printStackTrace();
			}
			if ("YClass".equals(om.<EObject>getGen(yammProperty, "type").eClass().getName())) 
			{
				EStructuralFeature feature;
				if (om.<String>getGen(om.<EObject>getGen(yammProperty, "type"), "name").equals("Object"))
				{
					String yammPropertyTypeName = om.<String>getGen(yammProperty, "type", "name");
					ecoreClass.getEStructuralFeatures().add(feature = createAndCopyEAttribute(yammProperty, EcorePackage.Literals.EJAVA_OBJECT));				
				}
				else if (isPrimitiveType(om.<EObject>getGen(yammProperty, "type")))
				{
					ecoreClass.getEStructuralFeatures().add(feature = createAndCopyEAttribute(yammProperty));
				} 
				else 
				{ 				
					ecoreClass.getEStructuralFeatures().add(feature = createEReference(yammProperty));
				}
				// static feature?
				if (layer != null && om.<Boolean>getGen(yammProperty, "static"))
				{
					String qualifiedClassName = Common.getQualifiedName(yammClass);
					if(!om.staticValues.get(layer).containsKey(qualifiedClassName))
						om.staticValues.get(layer).put(qualifiedClassName, new HashMap<>());
					Map<EStructuralFeature, Object> featureMap;
					(featureMap = om.staticValues.get(layer).get(qualifiedClassName)).put(feature, null);
					
					// Annotation
					EAnnotation annotation = EcoreFactory.eINSTANCE.createEAnnotation();
					annotation.setSource("staticFeature");
					EMap<String, String> details = annotation.getDetails();
					details.put("layer", layer + "");
					details.put("qualifiedClassName", qualifiedClassName);	
					feature.getEAnnotations().add(annotation);
						
					// default value		
					if (feature.getEType() instanceof EDataType)
					{
						EDataType dataType = (EDataType) feature.getEType();
						String defaultValue = om.<String>getGen(yammProperty, "defaultValue");
						if ("EString".equals(dataType.getName())) {
							if ("\"\\\"\\\"\"".equals(defaultValue))
								featureMap.put(feature, "");
							else if ("\"\"".equals(defaultValue))
								featureMap.put(feature, null);
							else if (defaultValue == null)
								featureMap.put(feature, null);
							else
								featureMap.put(feature, defaultValue);
						} else if ("EInt".equals(dataType.getName())){
							if ("\"\"".equals(defaultValue))
								featureMap.put(feature, Integer.valueOf(0));
							else if (defaultValue == null)
								featureMap.put(feature, Integer.valueOf(0));
							else
								featureMap.put(feature, Integer.valueOf(defaultValue));
						} else if ("EDouble".equals(dataType.getName())){
							if ("\"\"".equals(defaultValue))
								featureMap.put(feature, Double.valueOf(0));
							else if (defaultValue == null)
								featureMap.put(feature, Double.valueOf(0));
							else
								featureMap.put(feature, Double.valueOf(defaultValue));
						} else if ("EBoolean".equals(dataType.getName())){
							if ("\"\"".equals(defaultValue))
								featureMap.put(feature, Boolean.valueOf("false"));
							else if (defaultValue == null)
								featureMap.put(feature, Boolean.valueOf("false"));
							else
								featureMap.put(feature, Boolean.valueOf(defaultValue));
						} else if ("EFloat".equals(dataType.getName())){
							if ("\"\"".equals(defaultValue))
								featureMap.put(feature, Float.valueOf(0));
							else if (defaultValue == null)
								featureMap.put(feature, Float.valueOf(0));
							else
								featureMap.put(feature, Float.valueOf(defaultValue));
						}
					}
				}
			} 
			else if("YEnumeration".equals(om.<EObject>getGen(yammProperty, "type").eClass().getName()))
			{
				EObject yammEnum = om.<EObject>getGen(yammProperty, "type");
				EAttribute ecoreAttribute = ecoreFactory.createEAttribute();
				ecoreAttribute.setName(om.<String>getGen(yammProperty, "name"));
				ecoreAttribute.setEType((EClassifier) yammObjectsToEcoreObjectsMap.get(yammEnum));

				ecoreClass.getEStructuralFeatures().add(ecoreAttribute);
			}
		}
	}

	/**
	 * creates an EReference for YProperties which does not references a primitive Type
	 * 
	 * @param yammProperty
	 * @return the ecore counterpart
	 */
	private EReference createEReference(EObject yammProperty) 
	{
		EReference ecoreReference = ecoreFactory.createEReference();

		ecoreReference.setName(om.<String>getGen(yammProperty, "name"));
		ecoreReference.setContainment(om.<Enumerator>getGen(yammProperty, "aggregation").getLiteral().equals("composite"));
		ecoreReference.setEType((EClassifier) yammObjectsToEcoreObjectsMap.get(om.<EObject>getGen(yammProperty, "type")));
		ecoreReference.setUpperBound(om.<Integer>getGen(yammProperty, "upper"));
		ecoreReference.setLowerBound(om.<Integer>getGen(yammProperty, "lower"));
		ecoreReference.setUnique(om.<Boolean>getGen(yammProperty, "isUnique"));

		yPropertyToEReference.put(yammProperty, ecoreReference);

		return ecoreReference;
	}

	/**
	 * creates an EAttribut for YProperties which references a primitive Type
	 * 
	 * @param yammProperty
	 * @return the ecore counterpart
	 */
	private EStructuralFeature createAndCopyEAttribute(EObject yammProperty) 
	{

		String yammPropertyTypeName = om.<String>getGen(yammProperty, "type", "name");

		EStructuralFeature ecoreAttribute = null;

		if (yammPropertyTypeName.equals("Integer")) {
			ecoreAttribute = createAndCopyEAttribute(yammProperty, EcorePackage.Literals.EINT);	
		} else if (yammPropertyTypeName.equals("Boolean")) {
			ecoreAttribute = createAndCopyEAttribute(yammProperty, EcorePackage.Literals.EBOOLEAN);	
		} else if (yammPropertyTypeName.equals("String")) {
			ecoreAttribute = createAndCopyEAttribute(yammProperty, EcorePackage.Literals.ESTRING);	
		} else if (yammPropertyTypeName.equals("Float")) {
			ecoreAttribute = createAndCopyEAttribute(yammProperty, EcorePackage.Literals.EFLOAT);	
		} else if (yammPropertyTypeName.equals("Double")) {
			ecoreAttribute = createAndCopyEAttribute(yammProperty, EcorePackage.Literals.EDOUBLE);	
		} else if (yammPropertyTypeName.equals("Object")) {
			ecoreAttribute = createAndCopyEAttribute(yammProperty, EcorePackage.Literals.EJAVA_OBJECT);	
		}
		return ecoreAttribute;
	}

	
	/**
	 * Sets the supertypes of the EClass associated with the YClass yammClass.
	 * 
	 * @param yammClass the YClass from the *.yamm model
	 */
	private void setESuperTypes(EObject yammClass) {
		for (EObject yammSuperType : om.<List<EObject>>getGen(yammClass, "superClass"))
		{
			EClass ecoreClass = (EClass) yammObjectsToEcoreObjectsMap.get(yammClass);
			EClass ecoreSuperClass = (EClass) yammObjectsToEcoreObjectsMap.get(yammSuperType);
			ecoreClass.getESuperTypes().add(ecoreSuperClass);
		}
	}

	
	/**
	 * This method creates an EClassImpl for each YClass(Impl),
	 * an EEnumImpl for each YEnumeration(Impl) and EPackageImpl for each YPackage(Impl)
	 * in layerObjects.
	 *
	 * Does not set the EStructuralFeatures and ESuperTypes(-->
	 * 		{@link #setESuperTypes(Class)} {@link #createAndSetEAttributesAndEReferences(Class)}...)
	 * Create EEnums and EEnumLiterals
	 * Create EPackages
	 * @param ecorePackage
	 */
	private void createEClassEEnumEPackage() {
		EPackage yammEPackage;
		if (!laodModelForObjectDiagram)
			yammEPackage = loading.reflectivStateChart.resourceManagement.resourceSet.getPackageRegistry().getEPackage("http://www.yamm.dev/coreModelXmi/Yamm");
		for (Object yammObjectInLayer : yammObjects)
		{		
			EObject eObjectYammObject = (EObject) yammObjectInLayer;
			EClass eClass  = eObjectYammObject.eClass();
			List<EClass> types = new ArrayList<>();
			types.add(eClass);
			types.addAll(eClass.getEAllSuperTypes());
			
			boolean isYClass = false;
			for (EClass type : types)
			{
				if ("YClass".equals(type.getName()))
					isYClass = true;
			}
			
			if (isYClass) {
				switch(((YClass) yammObjectInLayer).getName()) {
//				case "YClass" : 
////					loading.reflectivStateChart.objectManagement.eClassifierToYClassifier.put(YammPackage.Literals.YCLASS, (YClass) yammObjectInLayer);
//					yammObjectsToEcoreObjectsMap.put(((YClass) yammObjectInLayer), YammPackage.Literals.YCLASS);	
//					ecorePackage.getEClassifiers().add(YammPackage.Literals.YCLASS);
//					break;
//				case "YProperty" : 
//					loading.reflectivStateChart.objectManagement.eClassifierToYClassifier.put(YammPackage.Literals.YPROPERTY, ((YClass) yammObjectInLayer));
//					yammObjectsToEcoreObjectsMap.put(((YClass) yammObjectInLayer), YammPackage.Literals.YPROPERTY);
//					break;
//				case "YOperation" : 
//					loading.reflectivStateChart.objectManagement.eClassifierToYClassifier.put(YammPackage.Literals.YOPERATION, ((YClass) yammObjectInLayer));
//					yammObjectsToEcoreObjectsMap.put(((YClass) yammObjectInLayer), YammPackage.Literals.YOPERATION);
//					break;
//				case "YStateMachine" : 
//					loading.reflectivStateChart.objectManagement.eClassifierToYClassifier.put(YammPackage.Literals.YSTATE_MACHINE, ((YClass) yammObjectInLayer));
//					yammObjectsToEcoreObjectsMap.put(((YClass) yammObjectInLayer), YammPackage.Literals.YSTATE_MACHINE);
//					break;
//				case "YGlobalStateMachine" : 
//					loading.reflectivStateChart.objectManagement.eClassifierToYClassifier.put(YammPackage.Literals.YGLOBAL_STATE_MACHINE, ((YClass) yammObjectInLayer));
//					yammObjectsToEcoreObjectsMap.put(((YClass) yammObjectInLayer), YammPackage.Literals.YGLOBAL_STATE_MACHINE);
//					break;
//				case "YStateMachineHandler" : 
//					loading.reflectivStateChart.objectManagement.eClassifierToYClassifier.put(YammPackage.Literals.YSTATE_MACHINE_HANDLER, ((YClass) yammObjectInLayer));
//					yammObjectsToEcoreObjectsMap.put(((YClass) yammObjectInLayer), YammPackage.Literals.YSTATE_MACHINE_HANDLER);
//					break;
				default:
					createEcoreClassAndSetName(eObjectYammObject);

				}

			}
			else if ("YEnumeration".equals(eClass.getName()))
				createEcoreEnum((YEnumeration)yammObjectInLayer);

			else if("YPackage".equals(eClass.getName())) 
				createEPackage((YPackage)yammObjectInLayer);
		}
	}	


	/**
	 * Creates an EPackage for every YPackage in the model.
	 * 
	 * @param yammPackage the YPackage from the *.yamm model
	 */
	private void createEPackage(EObject yammPackage) {
		yammPackages.add(yammPackage);
		EPackage subPackage = ecoreFactory.createEPackage();
		subPackage.setName(om.<String>getGen(yammPackage, "name"));
		yammObjectsToEcoreObjectsMap.put(yammPackage, subPackage);
		if(om.<Object>getGen(yammPackage, "parentElement") == null) {
			ecorePackage.getESubpackages().add(subPackage);
		} else {
			if(yammObjectsToEcoreObjectsMap.get(om.<Object>getGen(yammPackage, "parentElement")) != null) {
				EPackage parentPackage = 
						(EPackage) yammObjectsToEcoreObjectsMap.get(om.<Object>getGen(yammPackage, "parentElement"));
				parentPackage.getESubpackages().add(subPackage);
			} else {
				System.err.println("Parent package not found");
			}
		}
	}

	/**
	 * Transforms a YEnumeration into an EEnum.
	 * 
	 * @param yammEnum the YEnumeration from the *.yamm model
	 */
	private void createEcoreEnum(EObject yammEnum) {
		String enumTypeName = om.<String>getGen(yammEnum, "name");
		enumTypeName = enumTypeName.substring(0, 1).toUpperCase() + enumTypeName.substring(1, enumTypeName.length());
		EEnum ecoreEnum = ecoreFactory.createEEnum();
		ecoreEnum.setName(enumTypeName);
		ecoreEnum.setInstanceTypeName(enumTypeName);
		ecoreEnum.setInstanceClassName(enumTypeName);

		if(om.<Object>getGen(yammEnum, "parentElement") == null) 
			ecorePackage.getEClassifiers().add(ecoreEnum);
		else 
		{
			if(yammObjectsToEcoreObjectsMap.get(om.<Object>getGen(yammEnum, "parentElement")) != null ) 
			{
				EPackage parentPackage = 
						(EPackage) yammObjectsToEcoreObjectsMap.get(om.<Object>getGen(yammEnum, "parentElement"));
				parentPackage.getEClassifiers().add(ecoreEnum);
			} 
			else 
				System.err.println("Parent package not found");
		}

		yammObjectsToEcoreObjectsMap.put(yammEnum, ecoreEnum);

		int value = 0;
		for (EObject yammEnumLiteral : om.<List<EObject>>getGen(yammEnum, "ownedLiteral")) 
		{		
			EEnumLiteral ecoreEnumLiteral = new EEnumLiteralAdapter();
			ecoreEnumLiteral.setName(om.<String>getGen(yammEnumLiteral, "name"));
			ecoreEnumLiteral.setValue(value++);
			ecoreEnumLiteral.setLiteral(om.<String>getGen(yammEnumLiteral, "name"));
			ecoreEnum.getELiterals().add(ecoreEnumLiteral);
		}
		if (!laodModelForObjectDiagram)
		loading.reflectivStateChart.objectManagement.eClassifierToYClassifier.put(ecoreEnum, yammEnum);
	}

	/**
	 * Creates an ECLass, gives it the same name as yammCLass and add it to the new generates EPackage.
	 * It adds the EClass to the yammClasses Vector and put it with the the yammClass into the map 
	 * yammObjectsToEcoreObjectsMap.
	 * 
	 * @param yammClass the YClass from the *.yamm model
	 */
	private void createEcoreClassAndSetName(EObject yammClass) 
	{
		yammClasses.add(yammClass);
		EClass ecoreClass = ecoreFactory.createEClass();
		ecoreClass.setName(om.<String>getGen(yammClass, "name"));

		yammObjectsToEcoreObjectsMap.put(yammClass, ecoreClass);

		if(om.<Object>getGen(yammClass, "parentElement") == null)
			ecorePackage.getEClassifiers().add(ecoreClass);
		else
		{
			if(yammObjectsToEcoreObjectsMap.get(om.<Object>getGen(yammClass, "parentElement")) != null )
			{
				EPackage parentPackage = 
						(EPackage) yammObjectsToEcoreObjectsMap.get(om.<Object>getGen(yammClass, "parentElement"));
				parentPackage.getEClassifiers().add(ecoreClass);
			} 
			else 
				System.err.println("Parent package not found");
		}
		if (laodModelForObjectDiagram)
		{
			EAnnotation annotation = EcoreFactory.eINSTANCE.createEAnnotation();
			annotation.setSource("ObjectID");
			EMap<String, String> details = annotation.getDetails();
			details.put("value", om.<String>getGen(yammClass, "ObjectID"));
			ecoreClass.getEAnnotations().add(annotation);
		}
		
		if (!laodModelForObjectDiagram)
		{	
		loading.reflectivStateChart.objectManagement.eClassifierToYClassifier.put(ecoreClass, yammClass);
//		loading.reflectivStateChart.objectManagement.qualifiedNameToYClassifier.get(layer + 1).put(getQualifiedName(yammClass), yammClass);
		}
	}

	/**
	 * Transforms an YProperty into an EAttribute with the given EType
	 * 
	 * @param yammProperty the YProperty to transform
	 * @param datatype the EDataType of the Property
	 * @return the yammProperty parameter transformed into an EAttribute
	 */
	private EAttribute createAndCopyEAttribute(EObject yammProperty, EDataType datatype) {
		EAttribute ecoreAttribute = ecoreFactory.createEAttribute();

		ecoreAttribute.setEType(datatype);
		ecoreAttribute.setName(om.<String>getGen(yammProperty, "name"));
		if (om.<Integer>getGen(yammProperty, "upper") == 1)
		{
			String defaultValue = om.<String>getGen(yammProperty, "defaultValue");
			if ("EString".equals(datatype.getName())) {
				if ("\"\\\"\\\"\"".equals(defaultValue))
					ecoreAttribute.setDefaultValueLiteral("");
				else if ("\"\"".equals(defaultValue))
					ecoreAttribute.setDefaultValueLiteral(null);
				else if (defaultValue == null)
					ecoreAttribute.setDefaultValueLiteral(null);
				else
					ecoreAttribute.setDefaultValueLiteral(defaultValue);
			} else {
				if ("\"\"".equals(defaultValue))
					ecoreAttribute.setDefaultValueLiteral(null);
				else if (defaultValue == null)
					ecoreAttribute.setDefaultValueLiteral(defaultValue);
				else
					ecoreAttribute.setDefaultValueLiteral(defaultValue);

			}
		}
		ecoreAttribute.setLowerBound(om.<Integer>getGen(yammProperty, "lower"));
		ecoreAttribute.setUpperBound(om.<Integer>getGen(yammProperty, "upper"));
		ecoreAttribute.setUnique(om.<Boolean>getGen(yammProperty, "isUnique"));
		if (om.<String>getGen(yammProperty, "name").equals("ObjectID")) {
			ecoreAttribute.setID(true);
		} else {
			ecoreAttribute.setID(false);
		}

		return ecoreAttribute;
	}
	
	public String getQualifiedName(EObject yClass)
	{
		String qualifiedName = om.<String>getGen(yClass, "name");
		EObject pack = om.<YPackage>getGen(yClass, "package");

		if (pack == null)
			return qualifiedName;

		qualifiedName = om.<String>getGen(pack, "name") + "." + qualifiedName;

		while ((pack = om.<EObject>getGen(pack, "package")) != null)
		{
			qualifiedName = om.<String>getGen(pack, "name") + "." + qualifiedName;
		}
		return qualifiedName;
	}

}
