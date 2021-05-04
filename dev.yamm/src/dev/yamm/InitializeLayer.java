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

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import dev.yamm.coreModelDiagram.yammDiagram.YammDiagramPackage;
import dev.yamm.coreModelDiagram.yammDiagram.xmiToText.DslConverter;
import dev.yamm.coreModelXmi.yamm.YClass;
import dev.yamm.coreModelXmi.yamm.YOperation;
import dev.yamm.coreModelXmi.yamm.YProperty;
import dev.yamm.coreModelXmi.yamm.YammPackage;
import dev.yamm.gui.Layer;
import dev.yamm.logger.YAMMLogger;

/**
 * loads the yamm-model and initializes the runtime model.
 * loads external models with the runtime model
 * invokes the compiler for the actionlanguage
 */
public class InitializeLayer {
		
	/**The logger*/
	private static YAMMLogger logger = YAMMLogger.getYAMMLogger("YAMM Log");
	
	/** the (source - ) EPackage of the current layer*/
	EPackage originalEPackage = null;
	
	/** A common map for EClassifiers of all layers (identical EClassifer will not be duplicated)
	 *  As key: the source EClassifier, as value: the target EClassifier. */
	EMap<EClassifier, EClassifier> classMap = new BasicEMap<EClassifier, EClassifier>();
	
	/** Contains the newly added EClassifier within one (the current) layer. */
	EList<EClassifier> addedClassifier = new BasicEList<EClassifier>();
	
	/** Contains the newly added EStructuralFeatures, i.e. EReferences/ EAttributes
	 *  within one (the current) layer. */
	EList<EStructuralFeature> addedStructuralFeature = new BasicEList<EStructuralFeature>();
	
	/** Each entry represents one layer. As key: the layer - specific nsURI, as the assigned value: a list of
	 * the EClassifier added to the target package.*/
	EMap<String, EList<EClassifier>> classifiers = new BasicEMap<String, EList<EClassifier>>();
	
	/** Each entry represents one layer. As key: the layer - specific nsURI, as the assigned value: a list of
	 * the EStructuralFeature added to the target package.*/
	EMap<String, EList<EStructuralFeature>> structuralFeatures = new BasicEMap<String, EList<EStructuralFeature>>();
	
	/** A list containing EReferences owning an EOpposite (cleared after {@link #setEReferences(EPackage) is done}.*/
	ArrayList<EReference> references = new ArrayList<EReference>();
	
	/** the ChartManagement instance*/
	public ChartManagement reflectivStateChart;
	
	/** the GenerateEcore instance*/
	public GenerateEcore generateEcore = new GenerateEcore(this);

	/**
	 * The constructor, accepting a ChartManagement object as parameter.
	 * 
	 * @param reflectivStateChart	:	a ChartManagement object
	 */
	public InitializeLayer(ChartManagement reflectivStateChart) 
	{
		this.reflectivStateChart = reflectivStateChart;
	}

	/**
	 * Gets the current layers nsURI attribute.
	 * Fills the nsURI in the Vector ObjectManagement.nsURIs {@link #addNSURI(nsURI)}.
	 */
	private void fillNSURIsFromViewLayers()
	{
		for (Layer layer : reflectivStateChart.objectManagement.getViewLayers())
		{
			String nsURI = layer.getNsURI();
			if (nsURI == null || nsURI.equals("")) {
				nsURI = getNsURI(layer.getPath());
			}
			reflectivStateChart.objectManagement.addNSURI(nsURI);
		}
	}

	/**
	 * Generates the runtime model from the yamm-model and merges it with an external model (optional).
	 * the new EPackage is registered to load instances of external models with the new generated EPackage
	 * 
	 * @param nsURIs	:	the nsURIs
	 * @param modelFiles:	the modelFiles
	 */
	public boolean loadAllInstances(ArrayList<String> nsURIs, ArrayList<String> modelFiles)
	{
		
		
			
			
		
			

				
	
		prepareForLoadAllInstances(nsURIs);
		
		List<File> xFiles = new ArrayList<File>();

		
		reflectivStateChart.objectManagement.eClassifierToYClassifier.clear();
		reflectivStateChart.objectManagement.eClassifierToYClassifierTransformed.clear();
		reflectivStateChart.objectManagement.qualifiedNameToYClassifier = new HashMap<>();
		reflectivStateChart.objectManagement.objectIdToName.add(new HashMap<>());
		for (int layerNumber = 0; layerNumber < reflectivStateChart.objectManagement.nsURISize() - 1; layerNumber++) 
		{
			reflectivStateChart.objectManagement.objectIdToName.add(new HashMap<>());
			
			reflectivStateChart.objectManagement.staticValues.put(layerNumber + 1, new HashMap<>());
			reflectivStateChart.objectManagement.oneInstanceForEveryClassJustForAccessOfStaticFeatures.put(layerNumber + 1, new HashMap<>());
			reflectivStateChart.objectManagement.simulationObjectInsances.put(layerNumber + 1, new ArrayList<>());
			reflectivStateChart.objectManagement.eventQueue.put(layerNumber + 1, new ArrayList<>());
			reflectivStateChart.objectManagement.consumedEvents.put(layerNumber + 1, new ArrayList<>());
			reflectivStateChart.objectManagement.queues.put(layerNumber + 1, new HashMap<>());
			reflectivStateChart.objectManagement.delayQueues.put(layerNumber + 1, new HashMap<>());
			reflectivStateChart.objectManagement.qualifiedNameToYClassifier.put(layerNumber + 1, new HashMap<>());
			Layer layer = (Layer)reflectivStateChart.objectManagement.getViewLayers().get(layerNumber);
			if (layerNumber == 0 || "http://www.yamm.dev/coreModelXmi/Yamm".equals(layer.getNsURI()))
			{
//				generateDsl();
				String pathDiagram = layer.getPath();
				if (pathDiagram.endsWith("__TMP__.xyamm"))
				{
					pathDiagram = pathDiagram.replace("__TMP__.xyamm", ".yammdiagram");
				}
				String fullPath = null;
				if (reflectivStateChart.standalone)
				{
					fullPath = pathDiagram;
				}
				else
					fullPath = (ResourcesPlugin.getWorkspace().getRoot().getLocation().toString()).concat(pathDiagram).replace('\\', '/');
				layer.setPath(pathDiagram.replace(".yammdiagram", "__TMP__.xyamm"));
				
				YammDiagramPackage.eINSTANCE.eClass();
				Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("yammdiagram", new XMIResourceFactoryImpl());
				ResourceSet resSet = new ResourceSetImpl();
				Resource resource = resSet.getResource(URI.createFileURI(fullPath), true);

				DslConverter dslConverter = new DslConverter();
				List<String> dslCode = dslConverter.createFullDsl((dev.yamm.coreModelDiagram.yammDiagram.YModel) resource.getContents().get(0));		
				String source = "";
				for (String line : dslCode)
					source += line + " \n";
				File xfile = new File(fullPath.replace(".yammdiagram", "__TMP__.xyamm"));		
				try {
					FileWriter fileWriter = new FileWriter(xfile,false);
					fileWriter.write(source);
					fileWriter.close();
				} catch (IOException e) {
				        e.printStackTrace();
				} 
				xFiles.add(xfile);
			}
			
			//add hashmap for static objects
			EMap<String, EObject> statics = new BasicEMap<String, EObject>();
			reflectivStateChart.objectManagement.getStatics().add(statics);
			addedClassifier.clear();
			addedStructuralFeature.clear();
			String nsURI = reflectivStateChart.objectManagement.getNsURI(layerNumber + 1);
			logger.info("Generating and merging packages of layer " + (layerNumber + 1) + " with nsURI " + nsURI + ".");
			originalEPackage = reflectivStateChart.resourceManagement.resourceSet.getPackageRegistry().getEPackage(nsURI);

			EPackage modifiedEPackage = null;
			
			String nsuriYamm = reflectivStateChart.objectManagement.getNsURI(0);
			EPackage yammEPackage = reflectivStateChart.resourceManagement.resourceSet.getPackageRegistry().getEPackage("http://www.yamm.dev/coreModelXmi/Yamm");
			String path = modelFiles != null && modelFiles.get(layerNumber) != null ? modelFiles.get(layerNumber) : null;
			
			modifiedEPackage = mergePackages(generateEcore.generateEPackage(layerNumber, path, originalEPackage.getNsURI()), yammEPackage);

			EClassifier layer0YClass = yammEPackage.getEClassifier("YClass");
			EClass originalYClass = YammPackage.Literals.YCLASS;
//			replace(modifiedEPackage, modifiedEPackage.getEClassifier("YClass"), layer0YClass);
			
//			if (layerNumber == 0)
//			generateMataData(modifiedEPackage, layerNumber);
			
//			if (layerNumber == 0)
//			{	
//				
//				EClass yclass = null;
//				EClass statemachine = null;
//				for (TreeIterator<EObject> iter = modifiedEPackage.eAllContents(); iter.hasNext();)
//				{
//					EObject obj = iter.next();
//					
//					if (obj instanceof EClass) {
//						EClass objEClass = (EClass) obj;
//						String name = objEClass.getName();
//						if ("YClass".equals(name))
//						{
//							yclass = objEClass;
//						}
//						else if ("Statemachine".equals(name))
//						{
//							statemachine = objEClass;
//						}
//					}
//					
//				}
//			}
			reflectivStateChart.resourceManagement.appendLayerToNsURI(modifiedEPackage, layerNumber + 1);
			reflectivStateChart.objectManagement.setEPackage(layerNumber + 1, modifiedEPackage);

			if (classifiers.containsKey(nsURI))
			{
				EList<EClassifier> classes = classifiers.get(nsURI);
				classes.addAll(addedClassifier);
				EList<EStructuralFeature> attributes = structuralFeatures.get(nsURI);
				attributes.addAll(addedStructuralFeature);
			}
			else 
			{
				classifiers.put(nsURI, addedClassifier);
				structuralFeatures.put(nsURI, addedStructuralFeature);
			}
//			// <name>_<layer>.xyamm	
//			String extLayerPath = ((Layer) reflectivStateChart.objectManagement.getViewLayers().get(layerNumber)).getExtLayerPath(layerNumber);
//			if (extLayerPath != null)
//			{
//				
//				if (extLayerPath.endsWith("__TMP__.xyamm"))
//				{
//					extLayerPath = extLayerPath.replace("__TMP__.xyamm", ".yammdiagram");
//				}
//				String fullPath = null;
//				if (reflectivStateChart.standalone)
//				{
//					fullPath = extLayerPath;
//				}
//				else
//					fullPath = (ResourcesPlugin.getWorkspace().getRoot().getLocation().toString()).concat(extLayerPath).replace('\\', '/');
//				layer.getExtLayerPaths().set(layerNumber, extLayerPath = extLayerPath.replace(".yammdiagram", "__TMP__.xyamm"));
//
//				YammDiagramPackage.eINSTANCE.eClass();
//				Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("yammdiagram", new XMIResourceFactoryImpl());
//				ResourceSet resSet = new ResourceSetImpl();
//				Resource resource = resSet.getResource(URI.createFileURI(fullPath), true);
//
//				DslConverter dslConverter = new DslConverter();
//				List<String> dslCode = dslConverter.createFullDsl((dev.yamm.coreModelDiagram.yammDiagram.YModel) resource.getContents().get(0));		
//				String source = "";
//				for (String line : dslCode)
//					source += line + " \n";
//				File xfile = new File(fullPath.replace(".yammdiagram", "__TMP__.xyamm"));		
//				try (FileWriter fileWriter = new FileWriter(xfile,false)) {
//					fileWriter.write(source);
//				} catch (IOException e) {
//				        e.printStackTrace();
//				} 
//				xFiles.add(xfile);
//				
//				String yammNsURI = reflectivStateChart.objectManagement.getNsURI(0);		
//				EPackage originalEPackageExtLayer = reflectivStateChart.resourceManagement.resourceSet
//						.getPackageRegistry().getEPackage(yammNsURI);
//				
//				EPackage modifiedEPackageExtLayer = mergePackages(
//						generateEcore.generateEPackage(layerNumber, extLayerPath, originalEPackageExtLayer.getNsURI()),
//						originalEPackageExtLayer);
//
//
//			}
		

		}
		logger.info("Merging of all packages (successfully) done.");
		reflectivStateChart.objectManagement.loadClassifiers(reflectivStateChart.resourceManagement.resourceSet.getPackageRegistry());
		ConfigurationManagement.setGraphicalLoading(false);
		return loadFromXMI(nsURIs, modelFiles, xFiles);
	}

	
	private void generateMataData(EPackage modifiedEPackage, int layer) {
		try {
			
		
		EClass yClassMetaData = (EClass) modifiedEPackage.getEClassifier("YClass");
		EClass yPropertyMetaData = (EClass) modifiedEPackage.getEClassifier("YProperty");
		EClass yOperationMetaData = (EClass) modifiedEPackage.getEClassifier("YOperation");
		EFactory factory = modifiedEPackage.getEFactoryInstance();
		ObjectManagement om = reflectivStateChart.objectManagement;
		List<EObject> yClasses = new ArrayList<>();
		EPackage types = null;
		try {
			types = modifiedEPackage.getESubpackages().stream().filter(pack-> "Types".equals(pack.getName())).collect(Collectors.toList()).get(0);
		} catch (Exception e) {
			types = modifiedEPackage;
		}
		
		
		
		EClass Integer = (EClass) types.getEClassifier("Integer"); 
		EClass Boolean = (EClass) types.getEClassifier("Boolean");
		EClass String = (EClass) types.getEClassifier("String"); 
//		EClass Float = (EClass) types.getEClassifier("Float"); 
		EClass Double = (EClass) types.getEClassifier("Double");	
//		EClass LargeInteger = (EClass) types.getEClassifier("LargeInteger"); 
//		EClass Rational = (EClass) types.getEClassifier("Rational"); 
//		EClass Real = (EClass) types.getEClassifier("Real");
		EClass Object = (EClass) types.getEClassifier("Object");
		
		// create yClasses
		for (TreeIterator<EObject> iter = modifiedEPackage.eAllContents(); iter.hasNext();)
		{
			EObject element = iter.next();
			if (element instanceof EClass) {	
				iter.prune();
				EClass eclass = (EClass) element;
				YClass yClassGenerated = (YClass) om.eClassifierToYClassifier.get(eclass);
				 if (yClassGenerated == null)
					 continue;
				 EObject yClass = factory.create(yClassMetaData);
				yClasses.add(yClass);
				
				om.eClassifierToYClassifierTransformed.put(eclass, yClass);
				om.qualifiedNameToYClassifier.get(layer + 1).put(Common.getQualifiedNameEObject(eclass), yClass);
				
				om.set(yClass, yClassGenerated.getName(), "name");	
				om.set(yClass, yClassGenerated.isObserveQueue(), "observeQueue");

				//set primitive properties
				List<YProperty> attributesGen = yClassGenerated.getOwnedAttribute().stream()
						.filter(prop -> isPrimitiveOrExt(prop, om)).collect(Collectors.toList());
				
				for (YProperty attributeGen : attributesGen)
				{
					EObject yProperty = factory.create(yPropertyMetaData);				
					om.set(yProperty, attributeGen.getName(), "name");				
					om.set(yProperty, attributeGen.getDefaultValue(), "defaultValue");
				
//					om.set(yProperty, attributeGen.get, "defaultValue");
//					om.set(yProperty, attributeGen.getDefaultValue(), "defaultValue");
//					om.set(yProperty, attributeGen.getDefaultValue(), "defaultValue");
//					om.set(yProperty, attributeGen.getDefaultValue(), "defaultValue");
//					om.set(yProperty, attributeGen.getDefaultValue(), "defaultValue");
//					
								
					String typeName = attributeGen.getType().getName();
					switch (typeName) {
					case "Integer":
						try {
							om.set(yProperty, Integer, "type");
						} catch (Exception e) {
							e.printStackTrace();
						}
						om.set(yProperty, Integer, "type");
						break;
					case "Boolean":
						try {
							om.set(yProperty, Boolean, "type");
						} catch (Exception e) {
							e.printStackTrace();
						}
						om.set(yProperty, Boolean, "type");
						break;
					case "String":
						try {
							om.set(yProperty, String, "type");
						} catch (Exception e) {
							e.printStackTrace();
						}
						om.set(yProperty, String, "type");
						break;
//					case "Float":
//						om.set(yProperty, Float, "type");
//						break;
					case "Double":
						try {
							om.set(yProperty, Double, "type");
						} catch (Exception e) {
							e.printStackTrace();
						}
						break;
//					case "LargeInteger":
//						om.set(yProperty, LargeInteger, "type");
//						break;
//					case "Rational":
//						om.set(yProperty, Rational, "type");
//						break;
//					case "Real":
//						om.set(yProperty, Real, "type");
//						break;
					case "Object":
						try {
							om.set(yProperty, Object, "type");
						} catch (Exception e) {
							e.printStackTrace();
						}
						
						break;
					default:
						break;
					}	
					try {
						om.set(yClass, yProperty, "ownedAttribute");
					} catch (Exception e) {
						e.printStackTrace();
					}
					
				}
				
				for (YOperation attributeGen : yClassGenerated.getOwnedOperation())
				{
					EObject yOperation = factory.create(yOperationMetaData);
				}
				
			}
		}
		} catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		}
		
		//set supertypes
		
		//set references
	}

	private boolean isPrimitiveOrExt(YProperty prop, ObjectManagement om)
	{
		return    om.<String>getGen(prop, "name").equals("Integer") 
				|| om.<String>getGen(prop, "name").equals("Boolean")
				|| om.<String>getGen(prop, "name").equals("String") 
				|| om.<String>getGen(prop, "name").equals("Float") 
				|| om.<String>getGen(prop, "name").equals("Double")	
				|| om.<String>getGen(prop, "name").equals("LargeInteger") 
				|| om.<String>getGen(prop, "name").equals("Rational") 
				|| om.<String>getGen(prop, "name").equals("Real")
				|| om.<String>getGen(prop, "name").equals("Object");
		
	}
	
	private void replace(EPackage epackage, EClassifier replace, EClassifier withThis) {
		for (int i = 0; i < epackage.getEClassifiers().size(); i++)
		{
			EClassifier classifier = epackage.getEClassifiers().get(i);
			if (classifier == replace)
			{
				epackage.getEClassifiers().set(i, withThis);
				continue;
			}
			if (classifier instanceof EClass) {
				EClass eclass = (EClass) classifier;
				int indexEClass;
				if ((indexEClass = eclass.getESuperTypes().indexOf(replace)) != -1)
				{
					eclass.getESuperTypes().set(indexEClass, (EClass) withThis);
				}
			}
			
			for (TreeIterator<EObject> iter = classifier.eAllContents(); iter.hasNext();)
			{
				EObject  content = iter.next();
				if (content instanceof EPackage) {
					iter.prune();
					replace((EPackage) content, replace, withThis);			
				}
				if (content instanceof EReference) {
					EReference reference = (EReference) content;
					if (reference.getEType() == replace)
					{
						reference.setEType(withThis);
					}
				}
			}
		}
	}

	/**
	 * Clears/ initializes some maps and gets adds the nsURI to {@link ObjectManagement #nsURIs}. 
	 * Is called before all layers are merged {@link #loadAllInstances(ArrayList, ArrayList)}.
	 * 
	 * @param nsURIs	:	the nsURI
	 */
	private void prepareForLoadAllInstances(ArrayList<String> nsURIs) {
		
		classifiers.clear();
		structuralFeatures.clear();
		reflectivStateChart.objectManagement.reset();
		//logger.info("Merging and loading Model Layers.");
		if (nsURIs == null) 
		{ 
			fillNSURIsFromViewLayers();
		}
		else 
		{
			for (Integer layer = 0; layer < nsURIs.size(); layer++) 
			{
				reflectivStateChart.objectManagement.addNSURI(nsURIs.get(layer));
			}
		}
		//add static hashmap for zero layer
		EMap<String, EObject> zero = new BasicEMap<String, EObject>();
		reflectivStateChart.objectManagement.getStatics().add(zero);
	}
	

	/**
	 * Merges two packages.
	 * 
	 * @param targetPackage 	: the package, that is merged into
	 * @param sourcePackage 	: the package, that is merged from
	 */
	public EPackage mergePackages(EPackage targetPackage, EPackage sourcePackage) 
	{	
		//end

		if (sourcePackage == null)
			return targetPackage;
		if (targetPackage == null)
			return sourcePackage;

		if (targetPackage.getName() == null || targetPackage.getName().isEmpty()) 
		{
			if (sourcePackage != null && sourcePackage.getName() != null && !sourcePackage.getName().isEmpty())
				targetPackage.setName(sourcePackage.getName());
			else
				targetPackage.setName("targetPackage");
		}
	
		if (sourcePackage.getName() == null || sourcePackage.getName().isEmpty())
			sourcePackage.setName("sourcePackage");

		// introducing new classes first - works ONLY the first time the runtime environment is started - the merged classes are still available when (only) resetting (e.g., 2nd simulation run)
		for (EClassifier sourceEClassifier : sourcePackage.getEClassifiers()) 
		{
			introduceClassifier(targetPackage, sourceEClassifier);
		}
		for (EPackage sourceESubPackage : sourcePackage.getESubpackages()) 
		{
			introduceSubPackage(targetPackage, sourceESubPackage);
		}
		
		// merge existing classes
		EClassifier targetEClassifier;
		for (EClassifier sourceEClassifier : sourcePackage.getEClassifiers()) 
		{	
			targetEClassifier = targetPackage.getEClassifier(sourceEClassifier.getName());
			mergeClass(targetPackage, targetEClassifier, sourceEClassifier);
			
			if (targetEClassifier instanceof EClass && sourceEClassifier instanceof EClass) 
			{
				introduceGeneralizations(targetPackage, (EClass) targetEClassifier, (EClass) sourceEClassifier);					
			}
		}
		// merge Classes 
		for (EPackage sourceSubEPackage : sourcePackage.getESubpackages()) 
		{
			mergeClasses(targetPackage, sourceSubEPackage);
		}

		setEReferences(targetPackage);

		//end
		return targetPackage;

	}

	/**
	 * Sets the EOpposite of the the target EPackages EReferences.
	 * 
	 * @param targetPackage		:	the target EPackage
	 */
	private void setEReferences(EPackage targetPackage) 
	{
		EClassifier containingEClassifier;
		EClassifier oppositeEClassifier;
		EClass containingEClass;
		EClass oppositeEClass;
		EStructuralFeature containingEStructuralFeature;
		EStructuralFeature oppositeEStructuralFeature;

		for (EReference reference : references)
		{
			containingEClassifier = targetPackage.getEClassifier(reference.getEContainingClass().getName());
			oppositeEClassifier = targetPackage.getEClassifier(reference.getEOpposite().getEContainingClass().getName());

			if (containingEClassifier != null && containingEClassifier instanceof EClass &&
					oppositeEClassifier != null && oppositeEClassifier instanceof EClass)
			{

				containingEClass = (EClass) containingEClassifier;
				oppositeEClass = (EClass) oppositeEClassifier;
				containingEStructuralFeature = containingEClass.getEStructuralFeature(reference.getName());
				oppositeEStructuralFeature = oppositeEClass.getEStructuralFeature(reference.getEOpposite().getName());

				if (containingEStructuralFeature != null && containingEStructuralFeature instanceof EReference 
						&& oppositeEStructuralFeature != null && oppositeEStructuralFeature instanceof EReference)
				{

					((EReference) containingEStructuralFeature).setEOpposite((EReference) oppositeEStructuralFeature);
					((EReference) oppositeEStructuralFeature).setEOpposite((EReference) containingEStructuralFeature);

				} 
				else
				{
					System.err.println("Could not find (containing) EStructuralFeature " 
							+ reference.getName() + " of " + reference.getEContainingClass().getName());
					System.err.println("OR Could not (opposite) find EStructuralFeature " 
							+ reference.getEOpposite().getName() + " of " 
							+ reference.getEOpposite().getEContainingClass().getName());
				}
			}
			else 
			{
				System.err.println("Could not find (containing) EClassifier "
						+ reference.getEContainingClass().getName());
				System.err.println("Could not find (opposite) EClassifier " 
						+ reference.getEOpposite().getEContainingClass().getName());
			}
		}
		references.clear();

	}

	/**
	 * Merges the classes of two EPackages.
	 * 
	 * @param targetEPackage	: 	the targetEPackage 
	 * @param sourceEPackage	: 	the sourceEPackage (can be YPackage or uma.Package)
	 */
	private void mergeClasses(EPackage targetEPackage, EPackage sourceEPackage) 
	{
		String packageName  = sourceEPackage.getName();
		EPackage subPackage = null;
		
		for(EPackage oriPackage : targetEPackage.getESubpackages()) 
		{
			if(oriPackage.getName().equals(packageName)) 
			{
				subPackage = oriPackage;
			}
		}
		
		if(subPackage == null) 
		{
			System.err.println("Could not find subpackage");
		} 
		else 
		{
			String classifierName;
			EClassifier originalEClassifier;
			EClassifier modifiedEClassifier;

			for (EClassifier currentEClassifier : sourceEPackage.getEClassifiers()) 
			{
				classifierName = currentEClassifier.getName();
				originalEClassifier = subPackage.getEClassifier(classifierName);
				modifiedEClassifier = sourceEPackage.getEClassifier(classifierName);
				mergeClass(subPackage, originalEClassifier, modifiedEClassifier);
				if (originalEClassifier instanceof EClass && modifiedEClassifier instanceof EClass) {
					introduceGeneralizations(subPackage, (EClass) originalEClassifier, (EClass) modifiedEClassifier);					
				}
			}
		}
		// recursive merge packages
		for(EPackage subSubPackage : sourceEPackage.getESubpackages()) {
			mergeClasses(subPackage, subSubPackage);
		}
	}

	/**
	 * Merges two Subpackages.
	 * 
	 * @param originalPackage	:	the target package
	 * @param modifiedSubPackage: 	the sourceEPackage (can be YPackage or uma.Package)
	 */
	private void introduceSubPackage(EPackage originalPackage, EPackage modifiedSubPackage) 
	{
		String packageName = modifiedSubPackage.getName();
		EPackage subPackage = null;
		
		for(EPackage oriPackage : originalPackage.getESubpackages())
		{
			if(oriPackage.getName().equals(packageName)) 
			{
				subPackage = oriPackage;
			}
		}
		if(subPackage == null)
		{
			subPackage = EcoreFactory.eINSTANCE.createEPackage();
			subPackage.setName(packageName);
			originalPackage.getESubpackages().add(subPackage);
		}
		for (EClassifier currentEClassifier : modifiedSubPackage.getEClassifiers()) 
		{
			introduceClassifier(subPackage, currentEClassifier);
		}
		// recursive merge packages
		for(EPackage subSubPackage : modifiedSubPackage.getESubpackages())
		{
			introduceSubPackage(subPackage, subSubPackage);
		}
	}

	/**
	 * Finds out if a targetEClasses ESuperType is already been set. If not, adds the source classes 
	 * ESuperType to {@code targetEClass}. 
	 * .
	 * @param targetEPackage	:	the target package
	 * @param targetEClass		:	the target class
	 * @param sourceEClass		:	the source class
	 */
	private void introduceGeneralizations(EPackage targetEPackage, EClass targetEClass, EClass sourceEClass) 
	{
		boolean generalizationFound;

		for (EClass sourceESuperClass : sourceEClass.getESuperTypes())
		{
			generalizationFound = false;
			for (EClass targetESuperClass : targetEClass.getESuperTypes())
			{
				if (classMap.get(sourceESuperClass) != null)
				{
					if(classMap.get(sourceESuperClass).equals(targetESuperClass))
					{
						generalizationFound = true;
						break;
					}
				}
				else if ("YObject".equals(sourceESuperClass.getName()))
				{
					classMap.put(sourceESuperClass, targetESuperClass);
					generalizationFound = true;
					break;
				}
			}

			// find same superclass in original package and introduce it as superclass
			if (!generalizationFound)
			{
				if (classMap.get(sourceESuperClass) != null) 
				{
					targetEClass.getESuperTypes().add((EClass) classMap.get(sourceESuperClass));
					logger.debug("Added generalization from \"" + sourceESuperClass.getName() + "\" to (inheriting) \""
					+ targetEClass.getName() + "\" in package " + targetEPackage.getName() + ".");
				} 
				else 
				{
//					logger.error("Super Class " + sourceESuperClass.getName()
//					+ " not found in generalization hierarchy of target Package " + targetEPackage.getName() + ".");
				}
			}
		}	
	}

	/**
	 * Introduces a classifier in a package.
	 * 
	 * @param targetEPackage 	:	the package, that is merged into (EAttribute, EReference)
	 * @param sourceEClassifier	: 	the classifier, that is introduced (if there is an originalClassifier)
	 * 								/copied from (EAttribute, EReference)
	 */
	private void introduceClassifier(EPackage targetEPackage, EClassifier sourceEClassifier) 
	{
		String sourceEClassifierName = sourceEClassifier.getName();
		
		if (targetEPackage.getEClassifier(sourceEClassifierName) == null)
		{
			if (sourceEClassifier instanceof EClass) 
			{
				// don't add primitive data types
				if (isPrimitiveDataTypeName(sourceEClassifierName))
				{
					logger.debug("EClass \"".concat(sourceEClassifierName).concat("\" avoided in package \""
							.concat(targetEPackage.getName()).concat("\" merge because it refers to a primitive data type")));
					return;
				}
				
				EClass newClass = EcoreFactory.eINSTANCE.createEClass();
				addedClassifier.add(newClass);
				newClass.setName(sourceEClassifierName);
				targetEPackage.getEClassifiers().add(newClass);
				logger.debug("Introduced EClass \"".concat(sourceEClassifierName).concat("\" in package \""
						.concat(targetEPackage.getName()).concat("\".")));
				classMap.put(sourceEClassifier, newClass);
				
//				addedClassifier<EClassififer>[EClass(name: Class), EClass(name: Classifier), EClass(name: Comment), ...]
//				classMap<EClassififer,EClassififer>	[EClass(name: Class, ...), EClass(name: Class)]
//							source		new			[EClass(name: Classifier, ...), EClass(name: Classifier)]
//													...				

			} 
			else if (sourceEClassifier instanceof EEnum) 
			{
				EEnum newEnum = EcoreFactory.eINSTANCE.createEEnum();
				addedClassifier.add(newEnum);
				newEnum.setName(sourceEClassifierName);
				targetEPackage.getEClassifiers().add(newEnum);	
				logger.debug("Introduced EEnumeration \"".concat(sourceEClassifierName).concat("\"")
						.concat("\" in package \"".concat(targetEPackage.getName()).concat("\".")));
				classMap.put(sourceEClassifier, newEnum);

			}
			else if (sourceEClassifier instanceof EDataType)
			{
				EDataType newEDataType = EcoreFactory.eINSTANCE.createEDataType();
				addedClassifier.add(newEDataType);
				newEDataType.setName(sourceEClassifierName);
				targetEPackage.getEClassifiers().add(newEDataType);
				logger.debug("Introduced EDataType \"".concat(sourceEClassifierName).concat("\"")
						.concat("\" in package \"".concat(targetEPackage.getName()).concat("\".")));
				classMap.put(sourceEClassifier, newEDataType);

			}
			else
			{
				logger.error(sourceEClassifierName.concat(" is not instance of EClass OR EEnum and not considered during package \""
						.concat(targetEPackage.getName()).concat("\" merge!")));
				return;
			}
		} 
		else
		{
			logger.debug(sourceEClassifierName.concat(" is already available in package \""
					.concat(targetEPackage.getName())).concat("\" and was skipped (during introduction)."));
		}
		classMap.put(sourceEClassifier, targetEPackage.getEClassifier(sourceEClassifierName));	
	}

	/**
	 * Checks if the name corresponds to a simple data type name.
	 * 
	 * @param dataTypeName	:	the name of the data type
	 * @return true/false
	 */
	private boolean isPrimitiveDataTypeName(String dataTypeName) {		
		if (dataTypeName.equals("EBoolean") || dataTypeName.equals("Boolean") 
				|| dataTypeName.equals("EByte") || dataTypeName.equals("Byte")
				|| dataTypeName.equals("EShort") || dataTypeName.equals("Short")
				|| dataTypeName.equals("EInt") || dataTypeName.equals("Integer")
				|| dataTypeName.equals("EFloat") || dataTypeName.equals("Float") 
				|| dataTypeName.equals("ELong") || dataTypeName.equals("Long") 
				|| dataTypeName.equals("EDouble") || dataTypeName.equals("Double") 
				|| dataTypeName.equals("EString") || dataTypeName.equals("String") 
				|| dataTypeName.equals("LargeInteger") 
				|| dataTypeName.equals("Rational") 
				|| dataTypeName.equals("Real")
				|| dataTypeName.equals("EObject")) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
	}

	/**
	 * 
	 * Merges two classes (can be EClasses or Eenums): Assigns the EStructuralFeatures (EAttributes
	 * and EReferences) or ELiterals of the sourceEPackages EClassifiers to the targetEPackages
	 * EClassifiers.
	 * 
	 * @param targetPackage 		: package, that is merged into
	 * @param targetEClassifier		: classifier, that is merged into
	 * @param sourceEClassifier		: classifier, that is merged from
	 */
	private void mergeClass(EPackage targetPackage, EClassifier targetEClassifier, EClassifier sourceEClassifier) {
		EcoreFactory ecoreFactory 							= EcoreFactory.eINSTANCE;  // used to create Ecore classes etc.
		
		// all (possible) sources (=modified) and targets (=original, existing thus modified or built from scratch)  
		EClass sourceClass 									= null;		 
		EClass targetClass 									= null; 
		EEnum sourceEnum									= null;
		EEnum targetEnum									= null;
		EStructuralFeature targetFeature					= null;		// feature as abstraction for {attribute, reference}
		EAttribute targetAttribute 							= null;	
		EReference targetReference 							= null;

		boolean featureHasChanged 							= false;
		boolean featureExisted								= false;
		String changedFromLogEntry							= null;
		String sourceClassName								= "";

		if (sourceEClassifier instanceof EClass) 
		{
			sourceClass = (EClass) sourceEClassifier;
			sourceClassName = sourceClass.getName();
			
			if (isPrimitiveDataTypeName(sourceClassName)) // don't add primitive data types
			{
				logger.debug("Class \"" + sourceClassName + "\" avoided in package merge because it refers to a primitive data type.");
				return;
			}
			if (targetEClassifier == null) 
			{
				System.err.println("Merge: Classifier == null. check introduceClassifier");
				targetClass = ecoreFactory.createEClass();
				targetClass.setName(sourceEClassifier.getName());
				logger.debug("Added EClass \"" + targetClass.getName() + "\"");
			} 
			else 
			{
				targetClass = (EClass) targetEClassifier;
			}
			if (sourceClass.isAbstract())
				targetClass.setAbstract(true);
		} 
		else if (sourceEClassifier instanceof EEnum) 
		{
			sourceEnum = (EEnum) sourceEClassifier;
			
			if (targetEClassifier == null) {
				targetEnum = ecoreFactory.createEEnum();
				targetEnum.setName(sourceEClassifier.getName());
				logger.debug("Added EEnumeration \"" + targetEnum.getName() + "\"");
			} 
			else 
			{
				targetEnum = (EEnum) targetEClassifier;
			}
			if (targetEnum.getInstanceClassName() == null)
				targetEnum.setInstanceTypeName(sourceEnum.getInstanceTypeName());
			if (targetEnum.getInstanceTypeName() == null)
				targetEnum.setInstanceClassName(sourceEnum.getInstanceClassName());
		} 
		else
		{
			if (sourceEClassifier instanceof EDataType) {
				logger.debug(sourceEClassifier.getName() + " is an instance of EDataType and not considered during merge class operations!");
			}
			else 
			{
				logger.error(sourceEClassifier.getName() + " is not instance of EClass OR EEnum OR EDataType and not considered during package merge!");
			}
			return;
		}
		if (targetClass != null) // it's an EClass!
		{
			boolean sourceOrTargetContainsThis = false;
			
			// merge attributes and references
			for (EStructuralFeature sourceFeature : sourceClass.getEStructuralFeatures()) 
			{
				// is there already a targetStructuralFeature with the name of the sourceStructuralFeature? No? then this equals null
				targetFeature = targetClass.getEStructuralFeature(sourceFeature.getName());

				if (targetFeature != null && "this".equals(targetFeature.getName())
						|| "this".equals(sourceFeature.getName()))
					sourceOrTargetContainsThis = true;
				
				// create targets (if they don't exist) or refer to them 
				if (sourceFeature instanceof EAttribute) 
				{
					if (targetEClassifier == null || targetFeature == null) 
					{
						targetAttribute = ecoreFactory.createEAttribute();
						addedStructuralFeature.add(targetAttribute);
						targetFeature = targetAttribute;
						featureExisted = false;
						if (sourceFeature.getName().equals("ObjectID")) 
						{
							targetAttribute.setID(true);
						}
						if (targetEClassifier instanceof EClass) 
						{
							targetClass.getEStructuralFeatures().add(targetAttribute);
						}
					} else {
						targetAttribute = (EAttribute) targetFeature;
						featureExisted = true;
					}
				} 
				else if (sourceFeature instanceof EReference)
				{	
					if (targetEClassifier == null || targetFeature == null) 
					{
						targetReference = ecoreFactory.createEReference();
						addedStructuralFeature.add(targetReference);
						targetFeature = targetReference;
						if (targetEClassifier instanceof EClass) 
						{
							targetClass.getEStructuralFeatures().add(targetReference);
						}
						featureExisted = false;
					}
					else 
					{
						targetReference = (EReference) targetFeature;
						featureExisted = true;
					}				
					if (((EReference) sourceFeature).getEOpposite() != null) 
					{
//						System.err.println(sourceClass.getName() + "." + ((EReference) sourceFeature).getName());
						references.add((EReference) sourceFeature);
					}
				} 
				else
				{
					logger.error("\"" + sourceFeature.getName() 
					+ "\" is not instance of EAttribute OR EReference OR EEnum and not considered during package merge!");
					return;
				}
				// setting the name of the target feature 
				targetFeature.setName(sourceFeature.getName());
				String typeName = sourceFeature.getEType().getName();
				featureHasChanged = false;
				
				// typeName is not existing in originalPackage when it was a mapped to a primitive type e.g., "Integer" is now "EInt"
				// ... or when it is a not existing complex type
				if (checkETypeAndProperties(typeName, targetPackage, targetFeature, sourceFeature))	//complex and 
				{
					changedFromLogEntry = "changed from \t\"" + sourceClass.getName() + "." + targetFeature.getName() 
							+ "\" (type: " + targetFeature.getEType() + ", lower : " + targetFeature.getLowerBound()
							+ ", upper : " + targetFeature.getUpperBound() + ", defaultValueLiteral: " 
							+ targetFeature.getDefaultValueLiteral();

					if (sourceFeature instanceof EAttribute) 
					{
						changedFromLogEntry = "EAttribute ".concat(changedFromLogEntry).concat(")");
					}
					else if (sourceFeature instanceof EReference)
					{
						changedFromLogEntry = "EReference ".concat(changedFromLogEntry) 
						+ ", isContainment " + ((EReference) sourceFeature).isContainment() + ")";
					}

					// complex types are linked to target package complex types - if available
					if (targetPackage.getEClassifier(typeName) != null) 
					{
						targetFeature.setEType((EClassifier) classMap.get(sourceFeature.getEType()));
					} 
					else
					{
						// ... or remain complex types of the modified package
						targetFeature.setEType(sourceFeature.getEType());
						featureHasChanged = true;
					}

					if (targetFeature.getLowerBound() != sourceFeature.getLowerBound()) 
					{
						targetFeature.setLowerBound(sourceFeature.getLowerBound());
						featureHasChanged = true;
					}
					if (targetFeature.getUpperBound() != sourceFeature.getUpperBound()) 
					{
						targetFeature.setUpperBound(sourceFeature.getUpperBound());
						featureHasChanged = true;
					}
					if ((targetFeature.getDefaultValueLiteral() != null && sourceFeature.getDefaultValueLiteral() != null 
							&& !targetFeature.getDefaultValueLiteral().equals(sourceFeature.getDefaultValueLiteral()))) 
					{
						targetFeature.setDefaultValueLiteral(sourceFeature.getDefaultValueLiteral());
						featureHasChanged = true;
					} 
					else if (sourceFeature.getDefaultValueLiteral() != null 
							&& targetFeature.getDefaultValueLiteral() == null)
					{
						targetFeature.setDefaultValueLiteral(sourceFeature.getDefaultValueLiteral());
						featureHasChanged = true;
					}
					if (targetFeature.isOrdered() != sourceFeature.isOrdered())
					{
						targetFeature.setOrdered(sourceFeature.isOrdered());
						featureHasChanged = true;
					}
					if (targetFeature.isUnique() != sourceFeature.isUnique()) 
					{
						targetFeature.setUnique(sourceFeature.isUnique());
						featureHasChanged = true;
					}
					if (targetFeature instanceof EReference && sourceFeature instanceof EReference)
					{
						EReference sourceReference = (EReference) sourceFeature;

						if (targetReference.isContainment() != sourceReference.isContainment())
						{
							targetReference.setContainment(sourceReference.isContainment());
							featureHasChanged = true;
						}

						//						 ((EReference) targetFeature).isContainment() != ((EReference) sourceFeature ).isContainment()) {
						//						((EReference) targetFeature).setContainment(((EReference) sourceFeature ).isContainment());
						//						(.getEContainingClass()

					}
				} 
				else // simple types are directly bound to eDatatypes ... but should not be necessary - because already done during epackage generation
				{
					if (typeName != null && !typeName.isEmpty()) 
					{
						featureHasChanged = setTargetFeaturesPrimitiveDataType(targetFeature, featureHasChanged, sourceFeature, typeName); 
					} 
					else // no simple type and not found???
					{
						logger.error("Type of feature \"" + sourceFeature.getName() + "\" refering to (a) type \"" + typeName
								+ "\" is unknown (not mapped to a primitive type OR in the original package.");
						logger.error("It'll better be in the modifiedPackage!");
					}
				}
				if (!featureExisted) // if it does not exist ... add it
				{
					addEStructuralFeatureToTargetClass(targetClass, targetAttribute, targetReference, sourceFeature);
				}
				else if (featureHasChanged) 
				{
					String logEntry = "";
					if (sourceFeature instanceof EAttribute )
					{
						logEntry = logEntry.concat("EAttribute");	
					}
					else if (sourceFeature instanceof EReference)
					{
						logEntry = logEntry.concat("EReference");
					}
					logger.debug(changedFromLogEntry);
					logger.debug(logEntry + " changed to \t" + targetClass.getName() + "." + sourceFeature.getName() 
							+ " (type: " + targetFeature.getEType() + ", lower : " + targetFeature.getLowerBound() + ", upper : " + targetFeature.getUpperBound() 
							+ ", defaultValueLiteral: " + targetFeature.getDefaultValueLiteral() + ")");
				}
			}
			if (!sourceOrTargetContainsThis && targetEClassifier instanceof EClass) {
				EReference targetThisReference = ecoreFactory.createEReference();
				targetThisReference.setName("this");
				targetThisReference.setEType(targetClass);	
				addedStructuralFeature.add(targetThisReference);
				targetClass.getEStructuralFeatures().add(targetThisReference);
				
			}
		}
		else // it's an EEnum!
		{
			mergeEenumLiterals(targetEClassifier, sourceEnum, targetEnum);
		}

		if (!featureExisted) // if there was no original classifier ... add it completely
		{
			if (targetEnum == null)
			{
				targetPackage.getEClassifiers().add(targetClass);
			} 
			else 
			{
				targetPackage.getEClassifiers().add(targetEnum);
			}
		}
	}
	/**
	 * 
	 * Checks whether the EType of the current EStructuralFeature is not a primitive Type, 
	 * if its EClassifier is available at all and if at least one of its EStructuralFeatures 
	 * other properties (the EMF - properties) needs to be modified.
	 * 
	 * @param typeName			:	the name of the EStructuralFeatures EType
	 * @param targetPackage		: 	the target Package
	 * @param targetFeature		: 	the EStructuralFeature contained by the targetPackage
	 * @param sourceFeature		: 	the EStructuralFeature contained by the sourcePackage
	 * @return - true if there is an EMF-property to be set / false otherwise
	 */
	private boolean checkETypeAndProperties(String typeName, EPackage targetPackage, EStructuralFeature targetFeature, EStructuralFeature sourceFeature) {
		  return (!isPrimitiveDataTypeName(typeName) 
				  && ((targetPackage.getEClassifier(typeName) != null || classMap.containsKey(sourceFeature.getEType()))
					|| targetFeature.getLowerBound() != sourceFeature.getLowerBound()
					|| targetFeature.getUpperBound() != sourceFeature.getUpperBound() 
					|| (targetFeature.getDefaultValueLiteral() != null 
						&& sourceFeature.getDefaultValueLiteral() != null 
						&& !targetFeature.getDefaultValueLiteral().equals(sourceFeature.getDefaultValueLiteral()))
					|| ((sourceFeature instanceof EReference 
						&& targetFeature instanceof EReference)
						&& ((EReference) sourceFeature).isContainment() != ((EReference) targetFeature).isContainment()) )); 
	}

	/**
	 * 
	 * Sets the EType of the current target EStructuralFeature if it is a primitive DataType.
	 * 
	 * @param targetFeature		:	the EStructuralFeature which is to be modified
	 * @param featureHasChanged	: 	true, if the target feature has been manipulated.
	 * @param sourceFeature		:	the source feature
	 * @param typeName			: 	the name of the source features EType.
	 * @return true - if the features has changed / false otherwise.
	 */
	private boolean setTargetFeaturesPrimitiveDataType(EStructuralFeature targetFeature, boolean featureHasChanged,
			EStructuralFeature sourceFeature, String typeName) 
	{
		
		YammPackage yammPackage = YammPackage.eINSTANCE;
		
		if (typeName.equals("Boolean") || typeName.equals("EBoolean")) 
			targetFeature.setEType(EcorePackage.Literals.EBOOLEAN);
		else if (typeName.equals("Byte") || typeName.equals("EByte")) 
			targetFeature.setEType(EcorePackage.Literals.EBYTE);
		else if (typeName.equals("Short") || typeName.equals("EShort")) 
			targetFeature.setEType(EcorePackage.Literals.ESHORT);						
		else if (typeName.equals("Integer") || typeName.equals("EInt")) 
			targetFeature.setEType(EcorePackage.Literals.EINT);
		else if (typeName.equals("ELong")) 
			targetFeature.setEType(EcorePackage.Literals.ELONG);
		else if (typeName.equals("Float") || typeName.equals("EFloat")) 
			targetFeature.setEType(EcorePackage.Literals.EFLOAT);
		else if (typeName.equals("Double") || typeName.equals("EDouble")) 
			targetFeature.setEType(EcorePackage.Literals.EDOUBLE);		
		else if (typeName.equals("EChar")) 
			targetFeature.setEType(EcorePackage.Literals.ECHAR);
		else if (typeName.equals("String") || typeName.equals("EString")) 
			targetFeature.setEType(EcorePackage.Literals.ESTRING);
		else if (typeName.equals("EDate") || typeName.equals("DateTime")) 
			targetFeature.setEType(EcorePackage.Literals.EDATE);
		else if (typeName.equals("EJavaObject")) 
			targetFeature.setEType(EcorePackage.Literals.EJAVA_OBJECT);
		else if (typeName.equals("Object") || typeName.equals("EObject")) 
			targetFeature.setEType(EcorePackage.Literals.EOBJECT);
//		else 
//			logger.error("Unknown Type for feature \"" + sourceFeature.getName() + "\" with type : " + typeName);
		
		if (targetFeature.isUnique() != sourceFeature.isUnique()) 
		{
			targetFeature.setUnique(sourceFeature.isUnique());
			featureHasChanged = true;
		}
		if (targetFeature.getLowerBound() != sourceFeature.getLowerBound()) 
		{
			targetFeature.setLowerBound(sourceFeature.getLowerBound());
			featureHasChanged = true;
		}
		if (targetFeature.getUpperBound() != sourceFeature.getUpperBound()) {
			targetFeature.setUpperBound(sourceFeature.getUpperBound());
			featureHasChanged = true;
		}
		return featureHasChanged;
	}

	/**
	 * 
	 * Adds the current EStructuralFeature to the target Class
	 *  (after the properties have been set).
	 *  
	 * @param targetClass		:	the targetClass
	 * @param targetAttribute	: 	the target attribute (can be null)
	 * @param targetReference	:	the target reference (can be null)
	 * @param sourceFeature		: 	the sourceClassifiers sourceFeature
	 */
	private void addEStructuralFeatureToTargetClass (EClass targetClass, EAttribute targetAttribute,
			EReference targetReference, EStructuralFeature sourceFeature) 
	{
		String logEntry = "Introduced ";
		
		if (sourceFeature instanceof EAttribute)
		{
			targetClass.getEStructuralFeatures().add(targetAttribute);
			logEntry = logEntry.concat("EAttribute");
		} 
		else if (sourceFeature instanceof EReference)
		{
			targetClass.getEStructuralFeatures().add(targetReference);
			
			if (targetReference.getName().equals("PlacePetriNetTransitions"))
			{
				System.out.println(((EReference) targetReference).isContainment());
			}
			logEntry = logEntry.concat("EReference");
		}
		logger.debug(logEntry + " \"" + targetClass.getName() + "."  + sourceFeature.getName()
		+ "\" (type: " + sourceFeature.getEType().getName() + ").");
	}

	/**
	 * 
	 * Merges the EEnums Literals.
	 * 
	 * @param targetEClassifier :	the current target EClassifier
	 * @param sourceEnum		:	the source EEnum, that is merged from.
	 * @param targetEnum		:	the target EEnum, that is merged into.
	 */
	private void mergeEenumLiterals(EClassifier targetEClassifier, EEnum sourceEnum, EEnum targetEnum)
	{
		EcoreFactory ecoreFactory 				= EcoreFactory.eINSTANCE;
		EEnumLiteral sourceEnumLiteral          = null;
		EEnumLiteral targetEnumLiteral			= null;
		boolean enumerationLiteralExisted   	= false;
		boolean featureHasChanged				= false;
		String changedFromLogEntry				= null;

		for (EEnumLiteral currentSourceEnumerationLiteral : sourceEnum.getELiterals()) 
		{
			targetEnumLiteral = targetEnum.getEEnumLiteral(currentSourceEnumerationLiteral.getName());
			sourceEnumLiteral = (EEnumLiteral) currentSourceEnumerationLiteral;
			String logEntry = "";
			
			if (targetEClassifier == null || (targetEClassifier != null && targetEnumLiteral == null )) 
			{
				targetEnumLiteral = ecoreFactory.createEEnumLiteral();
				targetEnum.getELiterals().add(targetEnumLiteral);
				enumerationLiteralExisted = false;
				logEntry = logEntry.concat("Introduced ");
			}
			else
			{
				targetEnumLiteral = (EEnumLiteral) targetEnumLiteral;
				featureHasChanged = false;
				enumerationLiteralExisted = true;
				changedFromLogEntry = "EEnumLiteral changed from\t\"" + targetEnumLiteral.getName() + "\" (value: " 
				+ targetEnumLiteral.getValue() + ") " + "from enumeration " + targetEnum.getName() + ".";
				logEntry = logEntry.concat("EEnumLiteral changed to\t");
			}		
			// change enumeration literals ... if required
			if (targetEnumLiteral.getName() == null || !targetEnumLiteral.getName().equals(sourceEnumLiteral.getName())) {
				targetEnumLiteral.setName(sourceEnumLiteral.getName());
				featureHasChanged = true;
			}
			if (targetEnumLiteral.getValue() != sourceEnumLiteral.getValue()) {
				targetEnumLiteral.setValue(sourceEnumLiteral.getValue());
				featureHasChanged = true;
			}
			if (targetEnumLiteral.getLiteral() != sourceEnumLiteral.getLiteral()) {
				targetEnumLiteral.setLiteral(sourceEnumLiteral.getLiteral());
				featureHasChanged = true;
			}
			if (!enumerationLiteralExisted || featureHasChanged) {
				logger.debug(changedFromLogEntry);
				logger.debug(logEntry + "\"" + sourceEnumLiteral.getName() + "\" (value: " + sourceEnumLiteral.getValue() + ") " + "to enumeration " + targetEnum.getName() + ".");
			}
		}
	}

	/**
	 * Loads the yamm-Model with the YammPackage and instances from external models with the 
	 * generated(runtime) EPackage(--> GenerateEcore) into the global object store(objectCaches/EvalGuardOrEffect.maps)
	 * 
	 * @param nsURIs	:	the nsURIs
	 * @param modelFiles:	the modelFiles
	 * @return	true - the model files have been successfully loaded/ false - could not load files
	 */
	private boolean loadFromXMI(ArrayList<String> nsURIs, ArrayList<String> modelFiles, List<File> xfiles) 
	{
		String nsURI = "";
		reflectivStateChart.objectManagement.clearObjectCaches();
		String extension = null;

		for (int layer = 0; layer < reflectivStateChart.objectManagement.getViewLayers().size(); layer++) 
		{
			Layer actLayer = nsURIs == null || modelFiles == null ? (Layer) reflectivStateChart.objectManagement.getViewLayers().get(layer) : new Layer(nsURIs.get(layer), modelFiles.get(layer));

			reflectivStateChart.objectManagement.addObjectCache();
			String path = actLayer.getPath();
			String previousPath = path;
			boolean isXtext = false;

			if (layer > 0) 
			{
				if("http://www.yamm.dev/coreModelXmi/Yamm".equals(actLayer.getNsURI()))
				{
					extension = "xyamm";
					isXtext = true;
				}
				else
				{
				extension = path.substring(path.lastIndexOf(".") + 1, path.length());		
				isXtext = reflectivStateChart.resourceManagement.extensionIsXtext.get(extension);
				}
//				if (!isXtext) {
					String tmpExtensionForDynamicLoading = "TEMP_" + layer + "_" + extension;
					int index = path.lastIndexOf("." + extension);
					path = path.substring(0, index) + "." + tmpExtensionForDynamicLoading;
//					path = path.replace("." + extension,  "." + tmpExtensionForDynamicLoading);
				if (!isXtext) {
					reflectivStateChart.resourceManagement.resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()	
						.put(tmpExtensionForDynamicLoading, new XMIResourceFactoryImpl());
				}
				
			}

			if (!((new File(previousPath)).exists())) 
			{
				// try to look in the current workspace
				if (dev.yamm.init.Activator.getDefault() != null) 
				{
					path = (ResourcesPlugin.getWorkspace().getRoot().getLocation().toString()).concat(path);
					previousPath = (ResourcesPlugin.getWorkspace().getRoot().getLocation().toString()).concat(previousPath).replace('\\', '/');
					if (!((new File(previousPath)).exists())) 
					{
						logger.error("File \"" + previousPath + "\" does not exist!");
						return false;
					}
				} 
				else 
				{
					return false;
				}
			} 
			else if (!((new File(previousPath)).canRead())) 
			{
				logger.error("Can't read file \"" + path + "\"!");
				return false;
			}

			URI fileURI;

			if (layer > 0) 
			{
				try {
					if (!isXtext)
						Common.copyAndParseModelFile(Common.getFile(previousPath), new File(path), actLayer.getNsURI(), actLayer.getNsURI() + "/layer" + layer, previousPath.endsWith(".uma"), extension);
				}
				catch (Exception e)
				{
					
				}
				fileURI = URI.createFileURI((new File(path)).getAbsolutePath());
			}
			else
			{
				fileURI = URI.createFileURI((new File(previousPath )).getAbsolutePath());
			}
			// refer http://www.w3.org/TR/2004/PER-xmlschema-0-20040318/#ipo.xml

//			Resource resource = reflectivStateChart.resourceManagement.resourceSet.createResource(fileURI);
			Resource resource = null;
			
			
			if (layer > 0 && isXtext) { 

				ResourceSet resourceSet =reflectivStateChart.resourceManagement.resourceSet;

				URI uri = URI.createFileURI((new File(previousPath)).getAbsolutePath());

				Resource xtextResource = resourceSet.getResource(uri, true);
				try {
					xtextResource.load(null);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				EcoreUtil.resolveAll(xtextResource);
				File file;

				ResourceSet resSet= new ResourceSetImpl();

				Resource xmiResource = resSet
						.createResource(URI.createFileURI((file = new File(path)).getAbsolutePath()));

//				xmiResource.getContents().addAll(xtextResource.getContents());
				xmiResource.getContents().add(xtextResource.getContents().get(0));
				try {
					xmiResource.save(null);
				} catch (IOException e) {
					e.printStackTrace();
				}
				try
				{
					Common.copyAndParseModelFileXTEXT(file, actLayer.getNsURI(), actLayer.getNsURI() + "/layer" + layer, previousPath.endsWith(".uma"));
				}
				catch (Exception e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			try
			{
				 resource = reflectivStateChart.resourceManagement.resourceSet.getResource(fileURI, true);
			}
			catch (Exception e)
			{
				resource = reflectivStateChart.resourceManagement.resourceSet.getResource(fileURI, true);
			}
			
			logger.debug("URI " + fileURI);
			logger.debug(reflectivStateChart.resourceManagement.resourceSet);

//			EcoreUtil.resolveAll(resource);
			
			TreeIterator<EObject> tree = resource.getAllContents();
			int countKeys = 0;
			EObject objToPut;						

			
			for (; tree.hasNext(); )
			{
				try
				{
					objToPut = tree.next();
					if (layer > 0) {
						//initialize this:
						EStructuralFeature thisFeature = objToPut.eClass().getEStructuralFeature("this");
						if (thisFeature != null && objToPut.eGet(thisFeature) == null) {
							objToPut.eSet(thisFeature, objToPut);
						}
						//initialize yClass:
						EStructuralFeature yClassFeature = objToPut.eClass().getEStructuralFeature("yClass");
						if (yClassFeature != null && objToPut.eGet(yClassFeature) == null) {	
							
							EObject metadata = reflectivStateChart.objectManagement.eClassifierToYClassifierTransformed.get(objToPut.eClass());
//											(EClass) execute.reflectivStateChart.objectManagement.getEClassifier("YClass", layer));
			
							objToPut.eSet(yClassFeature, metadata);
//							objToPut.eSet(yClassFeature, reflectivStateChart.objectManagement.eClassifierToYClassifier.get(objToPut.eClass()));
						}
						
						//initialize internal:
						EStructuralFeature internal = objToPut.eClass().getEStructuralFeature("yammInternal");
						if (internal != null && objToPut.eGet(internal) == null) {	
							objToPut.eSet(internal, reflectivStateChart.internal);
						}
						
						EClass eclass = objToPut.eClass();
						EClassifier simObj = reflectivStateChart.objectManagement.getEClassifier("DES.SimulationObject", layer);
						if(simObj != null && aIsB(eclass, (EClass) simObj))
						{
							reflectivStateChart.objectManagement.addSimObject(layer, objToPut);
						}
						EClassifier event = reflectivStateChart.objectManagement.getEClassifier("DES.Event", layer);
						if(event != null && aIsB(eclass, (EClass) event))
						{
							reflectivStateChart.objectManagement.addEvent(objToPut, layer);
						}
						
						EObject yammInstance = reflectivStateChart.objectManagement.qualifiedNameToYClassifier.get(layer).get(Common.getQualifiedNameEObject(objToPut));
						EClassifier queue = reflectivStateChart.objectManagement.getEClassifier("DES.Queue", layer);
						try {
							if(queue != null && aIsB(eclass, (EClass) queue))
							{
								reflectivStateChart.objectManagement.addQueue(objToPut, layer);
								reflectivStateChart.objectManagement.addDelayQueue(objToPut, layer);
							}
						} catch (Exception e) {

						}
						

					}
					reflectivStateChart.objectManagement.introduceObjectToObjectCache(layer, objToPut);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
				
				countKeys++;
			}

			logger.info("Successfully loaded " + countKeys + " objects into object cache on layer " + layer + " of file \"" + path + "\".");
			nsURI = reflectivStateChart.objectManagement.getNsURI(layer);
			String packageName = reflectivStateChart.resourceManagement.resourceSet.getPackageRegistry().getEPackage(nsURI).toString();
			packageName = packageName.substring(0, packageName.indexOf(".impl"));
			reflectivStateChart.objectManagement.addPackageName(packageName);
		}

		//Adding the last layer
		reflectivStateChart.objectManagement.addObjectCache();
		String packageName = null;
		if (!reflectivStateChart.objectManagement.getNsURI(reflectivStateChart.objectManagement.getViewLayers().size()).isEmpty())
		{
			packageName = reflectivStateChart.resourceManagement.resourceSet.getPackageRegistry().
					getEPackage(reflectivStateChart.objectManagement.getNsURI(reflectivStateChart.objectManagement.getViewLayers().size())).getName(); 
		}
		else 
		{
			packageName = "onlyModifiedPackage";
		}
		reflectivStateChart.objectManagement.addPackageName(packageName);
		logger.debug(reflectivStateChart.objectManagement.getPackageNames());
		
		xfiles.forEach(file -> file.delete());
		return true;
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

	/**
	 * 
	 * loads a model and returns the nsuri.
	 *
	 * @param path the path to the model.
	 * @return the models nsURI
	 */
	public String getNsURI(String path) {
		File file = new File(path);
		URI fileURI = URI.createFileURI(path);
		
		if (!file.exists()) {
			// look in workspace
			String workspacePath = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString();
			fileURI = URI.createFileURI(workspacePath + path);
		}
		Resource resource = reflectivStateChart.resourceManagement.resourceSet.getResource(fileURI, true);		
		try
		{
			resource.load(null);
		}
		catch (IOException e) 
		{
			logger.error(e.getMessage(), e);
		}
		EObject model = resource.getContents().get(0);
		String nsURI = model.eClass().getEPackage().getNsURI(); 

		return nsURI;
	}

}
