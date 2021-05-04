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
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.xbase.XbasePackage;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;
import org.eclipse.xtext.xbase.ui.internal.XbaseActivator;
import org.eclipse.xtext.xtype.XtypePackage;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;

import dev.yamm.compile.CodegenXbaseToTarget;
import dev.yamm.extensionPoints.ILayerEPackageProvider;
import dev.yamm.coreModelDsl.XYammRuntimeModule;
import dev.yamm.coreModelDsl.XYammStandaloneSetup;
import dev.yamm.coreModelDsl.ui.internal.CoreModelDslActivator;
import dev.yamm.coreModelXmi.yamm.YClass;
import dev.yamm.coreModelXmi.yamm.YammFactory;
import dev.yamm.coreModelXmi.yamm.YammPackage;
import dev.yamm.coreModelXmi.yamm.impl.YammFactoryImpl;
import dev.yamm.coreModelXmi.yamm.impl.YammPackageImpl;

/**
 * A class that manages the creating and registering of the model packages
 * ({@code UmaPackageImpl}, {@code YAMMPackageImpl}). Manages also the access to
 * methods of class {@code ChartManagement}.
 */
public class ResourceManagement {
	
	
	/**
	 * injector for accessing the yamm-xtext runtime(parser, name provider, ...) 
	 */
	public Injector injector2;

	/**
	 * service to get the inferred element(xbase Java-model) of a yamm element.
	 * used in {@link CodegenXbaseToTarget}.
	 */
	public IJvmModelAssociations jvmModelAssociations;

	/**
	 * service to obtain the qualified name of a yamm object.
	 */
	public IQualifiedNameProvider qualifiedNameProvider;
	
	/** The ChartManagement object allowing the access to its methods. */
	public ChartManagement reflectivStateChart = new ChartManagement(this);

	/** The central resourceSet used to load models */
	@Inject
	public XtextResourceSet resourceSet = null;

	public static Boolean semaphore = new Boolean(false);

	public String threadnum = "";

	public boolean threads = false;

	/** Creates a YAMMPackageImpl. */
	public YammFactory yammFactory;

	public Map<String, Boolean> extensionIsXtext;

//	/** Creates a DFAPackageImpl. */
//	public DFAFactory dfaFactory;

	public List<String> jarPaths;
	
	public String extJarDir; 
	
	/**
	 * only called from(indirect): YAMMInterface..., StandaloneYAMM...
	 * 
	 * @param threadnum : the threadnum to set
	 */
	public void setThreadnum(String threadnum) {
		this.threadnum = threadnum;
	}

	/**
	 * Instantiates {@link #yammFactory} and creates a new {@code YAMMPackageImpl}
	 * object.
	 * 
	 * @return yammPackage - the yamm package
	 */
	public YammPackage createYammPackage() {
		// create yamm package
		yammFactory = new YammFactoryImpl();
		// System.out.println("New Created UMA Factory (eInstance) : " +
		// YammFactory.eINSTANCE);

		// Obtain or create and register package
		YammPackageImpl yammPackage = new YammPackageImpl(yammFactory);
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


//	/**
//	 * Instantiates {@link #dfaFactory} and creates a new {@code DFAPackageImpl}
//	 * object.
//	 * 
//	 * @return theDFAPackage - the dfa package
//	 */
//	public DFAPackage createDFAPackage() {
//		dfaFactory = new DFAFactoryImpl();
//		// Obtain or create and register package
//		DFAPackageImpl theDFAPackage = new DFAPackageImpl(dfaFactory);
//		// Create package meta-data objects
//		theDFAPackage.createPackageContents();
//		// Initialize created meta-data
//		theDFAPackage.initializePackageContents();
//		return theDFAPackage;
//	}

	/**
	 * Creates a new ResourceSetImpl object with an own (local) package registry for
	 * registering a newly created {@code YammPackage} or an {@code UmaPackageImpl}.
	 */
	public void registerMetaModelPackages() {
		
		IResourceFactory resourceFactory = null;
		
		jarPaths = new ArrayList<>();
		
		if (reflectivStateChart.standalone) {

			// do this only once per application
			ISetup  iSetup = new XYammStandaloneSetup();
			Injector injector = iSetup.createInjectorAndDoEMFRegistration();

			// obtain a resourceset from the injector
			resourceSet = injector.getInstance(XtextResourceSet.class);
			resourceFactory = injector.getInstance(IResourceFactory.class);
			jvmModelAssociations = injector.getInstance(IJvmModelAssociations.class);
			qualifiedNameProvider = injector.getInstance(IQualifiedNameProvider.class);
			resourceSet.setPackageRegistry(new EPackageRegistryImpl());
			
			if (extJarDir != null) {
				File folder = new File(extJarDir);
				File[] listOfFiles = folder.listFiles();

				for (File file : listOfFiles) {
					String fileName;
					if ((fileName = file.getName()).endsWith(".jar")) {
						try {
							URLClassLoader sysloader = (URLClassLoader)ClassLoader.getSystemClassLoader();
							Class<?> sysclass = URLClassLoader.class;

							Method method = sysclass.getDeclaredMethod("addURL",new Class[]{URL.class});
							method.setAccessible(true);
							String absJarPath = extJarDir + "/" + fileName;
							jarPaths.add(absJarPath);
							File jarFile = new File(absJarPath);
							URL url = jarFile.toURI().toURL();
							method.invoke(sysloader,new Object[]{ url }); 
						} catch (Throwable t) {
							t.printStackTrace();
							System.out.println("Error, could not add URL to system classloader");
						}
					}

				}
			}
		} else {			
				
		

			Injector injector = CoreModelDslActivator.getInstance().getInjector(CoreModelDslActivator.DEV_YAMM_COREMODELDSL_XYAMM);
			injector.injectMembers(this);
			injector2 = Guice.createInjector((Module) new XYammRuntimeModule());
			resourceSet = injector.getInstance(XtextResourceSet.class);
			resourceSet.setPackageRegistry(new EPackageRegistryImpl());
			resourceFactory = injector2.getInstance(IResourceFactory.class);
			jvmModelAssociations = injector.getInstance(IJvmModelAssociations.class);
			qualifiedNameProvider = injector.getInstance(IQualifiedNameProvider.class);		
			 
		}

		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xyamm", resourceFactory);
		Common.printlnMessage("Registration new YAMM Package.", DUMPMESSAGETO.INFO, true, true);
		resourceSet.getPackageRegistry().put(YammPackage.eNS_URI, createYammPackage());

		
		// xbase for layer > 1
//		Injector injector = XbaseActivator.getInstance().getInjector(XbaseActivator.ORG_ECLIPSE_XTEXT_XBASE_XBASE);
//		IResourceFactory xbaseResourceFactory = injector.getInstance(IResourceFactory.class);
//		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xbase", xbaseResourceFactory);
//		Common.printlnMessage("Registration new Xbase Package.", DUMPMESSAGETO.INFO, true, true);
//		resourceSet.getPackageRegistry().put(XbasePackage.eNS_URI, XbasePackage.eINSTANCE);
		
//		injector = XbaseActivator.getInstance().getInjector(XbaseActivator.ORG_ECLIPSE_XTEXT_XBASE_XTYPE);
//		IResourceFactory xTypeResourceFactory = injector.getInstance(IResourceFactory.class);
//		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xtype", xTypeResourceFactory);
//		Common.printlnMessage("Registration new XType Package.", DUMPMESSAGETO.INFO, true, true);
//		resourceSet.getPackageRegistry().put(XtypePackage.eNS_URI, XtypePackage.eINSTANCE);
		
		if (!reflectivStateChart.standalone)
			loadExternalResources();

	}
	

	public Map<YClass, List<EObject>> loadExternalModel(EPackage modelPackage, String model_ProjectPath, int layer) {

		Map<YClass, List<EObject>> modelElements = new HashMap<YClass, List<EObject>>();
		
		
		URI modifiedFileURI = prepareModelForDynamicLoading(model_ProjectPath, modelPackage);
		
		// load (Workaround TODO)
		Resource resource;		
		try
		{
			 resource = reflectivStateChart.resourceManagement.resourceSet.getResource(modifiedFileURI, true);
		}
		catch (Exception e)
		{
			resource = reflectivStateChart.resourceManagement.resourceSet.getResource(modifiedFileURI, true);
		}

		EcoreUtil.resolveAll(resource);
		
		// add objects to internal storage
		TreeIterator<EObject> tree = resource.getAllContents();
		EObject objToPut;					
		
		while (tree.hasNext())
		{
			objToPut = tree.next();
			
			//initialize this:
			EStructuralFeature thisFeature = objToPut.eClass().getEStructuralFeature("this");
			if (thisFeature != null && objToPut.eGet(thisFeature) == null) {
				objToPut.eSet(thisFeature, objToPut);
			}
			//initialize yClass:
			EStructuralFeature yClassFeature = objToPut.eClass().getEStructuralFeature("yClass");
			YClass yClass = (YClass) reflectivStateChart.objectManagement.eClassifierToYClassifier.get(objToPut.eClass());
			if (yClassFeature != null && objToPut.eGet(yClassFeature) == null) {	
				objToPut.eSet(yClassFeature, yClass);
			}
			
			reflectivStateChart.execute.maps[layer].put(Integer.toHexString(objToPut.hashCode()), objToPut);
			reflectivStateChart.execute.reflectivStateChart.objectManagement.introduceEObjectToLayerInformation(layer, objToPut);

			if (!modelElements.containsKey(yClass)) {
				modelElements.put(yClass, new ArrayList<>());
			}
			modelElements.get(yClass).add(objToPut);
			
		}
		
		return modelElements;	
	}

	private URI prepareModelForDynamicLoading(String modelPath, EPackage ePackage)
	{
		String nsUri = ePackage.getNsURI();
		
		String modelName =  modelPath.substring(modelPath.lastIndexOf("/") + 1, modelPath.lastIndexOf("."));
		String originalExtension = modelPath.substring(modelPath.lastIndexOf(".") + 1, modelPath.length());
		
		String projectPath = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString() + "/" + reflectivStateChart.compilation.projectName;	
		String pathOriginalModel = projectPath + modelPath;
		
		String tmpExtensionForDynamicLoading = "TEMP_" + originalExtension;
		
		String pathTmpModel = projectPath + "/" + modelName + "." + tmpExtensionForDynamicLoading;
		
		
		Common.printlnMessage("Registration Package." + ePackage.getNsURI(), DUMPMESSAGETO.INFO, true, true);
		resourceSet.getPackageRegistry().put(nsUri, ePackage);
		
		EPackage internalPackage = reflectivStateChart.objectManagement.getEPackage(1);
		internalPackage.setNsURI(nsUri + "/layer");
		resourceSet.getPackageRegistry().put(internalPackage.getNsURI(), internalPackage);
		
		reflectivStateChart.resourceManagement.resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()	
			.put(tmpExtensionForDynamicLoading, new XMIResourceFactoryImpl());

		try
		{
			Common.copyAndParseModelFile(Common.getFile(pathOriginalModel), new File(pathTmpModel), nsUri, nsUri + "/layer", false, originalExtension);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return URI.createFileURI((new File(pathTmpModel)).getAbsolutePath());
	}
	
	
	
	

	public  <T> List<T> getExtensions(Class<T> clientType, String extensionPointId) {
		
		List<T> extensions = new ArrayList<>();
		
		IConfigurationElement[] config =
				Platform.getExtensionRegistry().getConfigurationElementsFor(extensionPointId);
		try {
			for (IConfigurationElement e : config) 
			{
				final Object o = e.createExecutableExtension("class");
				
				if (clientType.isAssignableFrom(o.getClass())) 
				{
					extensions.add((T) o);
				}
			}
		} 
		catch (CoreException ex) 
		{
			ex.printStackTrace();
			return extensions;
		}
		return extensions;
	}

	public  ILayerEPackageProvider getEPackageExtensionForNsuri(String nsuri) 
	{
		List<ILayerEPackageProvider> extensions = getExtensions(ILayerEPackageProvider.class, PACKAGE_PROVIDER_ID);
		for (ILayerEPackageProvider extension : extensions)
		{
			if (extension.isProvider(nsuri))
				return extension;
		}

		return null;
	}



	private final String PACKAGE_PROVIDER_ID = "dev.yamm.layerEPackageProvider";

	private void loadExternalResources()
	{
		//TODO: f�r mehr als einen layer; und auswahl bei mehrerr registrierten extensions

		List<ILayerEPackageProvider> extensions = getExtensions(ILayerEPackageProvider.class, PACKAGE_PROVIDER_ID);
		if (extensions == null) {
			
		} 
		else
		{
			extensionIsXtext = new HashMap<String, Boolean>();
			for (ILayerEPackageProvider extension : extensions)
			{
				EPackage packageLayer1 = extension.getEPackage();

				Common.printlnMessage("Registration Package." + packageLayer1.getNsURI(), DUMPMESSAGETO.INFO, true, true);
				resourceSet.getPackageRegistry().put(packageLayer1.getNsURI(), packageLayer1);

				
				extensionIsXtext.put(extension.getExtension(), extension.isXtext());
			}
		}
		
	}

	/**
	 * only called from(indirect): YAMMInterface..., StandaloneYAMM...
	 * 
	 * @return the central ObjectManagement
	 */
	public ObjectManagement getOverAll() {
		return reflectivStateChart.objectManagement;
	}

	/**
	 * delegates to ObjectManagment.softReset()
	 * 
	 * only called from(indirect): YAMMInterface..., StandaloneYAMM...
	 */
	public void softReset() {
		reflectivStateChart.objectManagement.softReset();
	}

	/**
	 * delegates to ChartManagement.setLayer()
	 * 
	 * only called from(indirect): YAMMInterface..., StandaloneYAMM...
	 */
	public void setLayer(String prefix, String path, boolean overwriteExistingLayerFiles) {
		threads = true;
		
//		synchronized (semaphore) {
			reflectivStateChart.setLayer(prefix, path);
//		}
	}

	/**
	 * delegates to ChartManagement.startSimulation()
	 * 
	 * only called from(indirect): YAMMInterface..., StandaloneYAMM...
	 */
	public void start(Map<String, String> parameterMap) {
		reflectivStateChart.startSimulation(parameterMap);
	}

	/**
	 * delegates to ChartManagement.compile()
	 * 
	 * only called from(indirect): YAMMInterface..., StandaloneYAMM...
	 */
	public void compile(Integer threadNumber) {
		reflectivStateChart.compile(threadNumber, false);
	}

	/**
	 * delegates to ChartManagement.stopSimulation()
	 * 
	 * only called from(indirect): YAMMInterface..., StandaloneYAMM...,
	 * TextInputField...
	 */
	public void stop() {
		reflectivStateChart.stopSimulation();
	}

	/**
	 * Appends the current layer to the corresponding EPackages nsURI.
	 * 
	 * @param modified : the merged target EPackage
	 * @param layer    : the current layer
	 */
	public void appendLayerToNsURI(EPackage modified, Integer layer) {
		String modLayerAppendix = "/layer" + layer.toString();
		if (modified.getNsURI().endsWith(modLayerAppendix))
			return;

		reflectivStateChart.objectManagement.changeNSURI(layer, modified.getNsURI(),
				modified.getNsURI() + modLayerAppendix);
		modified.setNsURI(modified.getNsURI() + modLayerAppendix);
		registerModifiedEPackage(modified);

	}

	/**
	 * Signs in the target package to the ResourceSets PackageRegistry.
	 * 
	 * @param modified : the merged target EPackage
	 */
	private void registerModifiedEPackage(EPackage modified) {
		resourceSet.getPackageRegistry().put(modified.getNsURI(), modified);
	}
}
