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
package dev.yamm.objectDiagram.design;

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

import dev.yamm.coreModelDsl.ui.internal.CoreModelDslActivator;
import dev.yamm.coreModelXmi.yamm.YClass;
import dev.yamm.coreModelXmi.yamm.YammFactory;
import dev.yamm.coreModelXmi.yamm.YammPackage;
import dev.yamm.coreModelXmi.yamm.impl.YammFactoryImpl;
import dev.yamm.coreModelXmi.yamm.impl.YammPackageImpl;
//import dev.yamm.compile.CodegenXbaseToTarget;
import dev.yamm.coreModelDsl.XYammRuntimeModule;
import dev.yamm.coreModelDsl.XYammStandaloneSetup;

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

	/** The central resourceSet used to load models */
	@Inject
	public XtextResourceSet resourceSet = null;

	public static Boolean semaphore = new Boolean(false);

	public String threadnum = "";

	public boolean threads = false;

	/** Creates a YAMMPackageImpl. */
	public YammFactory yammFactory;

	public Map<String, Boolean> extensionIsXtext;


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

	/**
	 * Creates a new ResourceSetImpl object with an own (local) package registry for
	 * registering a newly created {@code YammPackage} or an {@code UmaPackageImpl}.
	 */
	public void registerMetaModelPackages() {
		
		IResourceFactory resourceFactory = null;
				
		Injector injector = CoreModelDslActivator.getInstance()
				.getInjector(CoreModelDslActivator.DEV_YAMM_COREMODELDSL_XYAMM);
		injector.injectMembers(this);
		injector2 = Guice.createInjector((Module) new XYammRuntimeModule());
		resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.setPackageRegistry(new EPackageRegistryImpl());
		resourceFactory = injector2.getInstance(IResourceFactory.class);
		jvmModelAssociations = injector.getInstance(IJvmModelAssociations.class);
		qualifiedNameProvider = injector.getInstance(IQualifiedNameProvider.class);

		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xyamm", resourceFactory);

		resourceSet.getPackageRegistry().put(YammPackage.eNS_URI, createYammPackage());

	}

}
