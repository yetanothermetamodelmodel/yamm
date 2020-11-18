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
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import javax.tools.Diagnostic;
import javax.tools.DiagnosticCollector;
import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.JavaFileObject;
import javax.tools.SimpleJavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

import online.yamm.ChartManagement;
import online.yamm.Common;
import online.yamm.ConfigurationManagement;
import online.yamm.DUMPMESSAGETO;
import online.yamm.GlobalLogger;
import online.yamm.ObjectManagement;
import online.yamm.coreModelXmi.yamm.YClass;
import online.yamm.coreModelXmi.yamm.YEffect;
import online.yamm.coreModelXmi.yamm.YOperation;
import online.yamm.coreModelXmi.yamm.YPackage;
import online.yamm.coreModelXmi.yamm.YammFactory;
import online.yamm.logger.YAMMLogger;
import targetAST.TargetASTRoot;

/**
 * A class for creating and compiling the source code for the guards and effects of the model.
 *
 */
public class Compilation {
	
	private static YAMMLogger logger = YAMMLogger.getYAMMLogger("YAMM Log");

	private String pathSeparator = File.pathSeparator;
	
	private String separator = File.separator;
	
	ObjectManagement om;
	
	/**
	 * the names of the generated classes
	 */
	Map<String, String> compileNames;
	
	/**
	 * one compilationUnit for every generated class
	 */
	List<JavaSourceFromString> compilationUnits;
	
	MemoryOutputJavaFileManager fileManagerMemory;
	
	private StandardJavaFileManager fileManager;
	
	/**
	 * the name of the project for accessing the classpath
	 */
	public String projectName;
	
	private URL projURL;
	
	private URL projBinURL; 
	
	public Session session;
	
	public ChartManagement chartManagement;

	/**
	 * the object for generating the target-AST form the model
	 */
	public CodegenXbaseToTarget codegenXbaseToTarget;
	
	/**
	 * the object for generating the code from the taget-AST 
	 */
	public CodegenTargetToCodeOriginal codegenTargetToCode;
	
	public CodegenExtensionMethods codegenExtensionMethods = new CodegenExtensionMethods();
	
	public CodegenPropAccess codegenPropAccess = new CodegenPropAccess();
	
	private static String emfPath = EcoreFactory.class.getProtectionDomain().getCodeSource().getLocation().getFile();
	private static String emfCommonPath = Notifier.class.getProtectionDomain().getCodeSource().getLocation().getFile();
	private static String log4jPath = Logger.class.getProtectionDomain().getCodeSource().getLocation().getFile();
	private static String yammPath = YammFactory.class.getProtectionDomain().getCodeSource().getLocation().getFile();
	private static String actionPath = ChartManagement.class.getProtectionDomain().getCodeSource().getLocation().getFile();
	private static boolean calledAsJAR = false;

	/**The Java programming language compiler provided with this platform. */
	private JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();

	HashMap<String, String> writersCache = new HashMap<String, String>();
	StringWriter javaSourceFileWriter = null;

	/**
	 * A hash map containing {@code JavaFileManager}.
	 * As key: the name of the class to compile concatenated with the layer number;
	 * as value: {@code MemoryOutputJavaFileManager} objects.
	 * */
	HashMap<String, MemoryOutputJavaFileManager> memoryOutputJavaFileManagerCache = new HashMap<String, MemoryOutputJavaFileManager>();

	/**Indicates whether a diagnostic reported a problem during compiling process or not.*/
	public boolean compileErrors = false;

	/**Indicates whether a model file has been changed or not. */
	public boolean modelChangesInFileSystem = false;

	/**Indicates whether a layer file has been changed or not. */
	public static boolean layerFileChanged = true;

	YClass clazz = null;
	EClass eclass = null;
	String nsURI = null;
	String filePath;

	/** A list of URLs.*/
	List<URL> urls = null;
	String classPathesString = null;

	EList<EStructuralFeature> itsRmofClassFeatures = null;
	HashMap<String,EStructuralFeature> featureNames = new HashMap<String,EStructuralFeature>();
	int debugCounter = 0;

	
	private List<List<String>> layerClassIds;

	public void setDynamicCompiledClassPath(String newPath) {
		//dynamicCompiledClassesPath = (newPath != null && !newPath.isEmpty()) ? newPath : dynamicCompiledClassesPath;
	}

	public void setCalledAsJAR() {
		calledAsJAR = true;
	}


	public Compilation(ChartManagement reflectivStateChart) {

		this.chartManagement = reflectivStateChart;

		// adopt path entries if required
		if(!yammPath.contains("bin") && !yammPath.contains("jar") && !calledAsJAR) {
			yammPath = yammPath.concat("bin");
			actionPath = actionPath.concat("bin");	
		}
	}

	private static List<String> getQualifiedPackageNamew(YClass yClass) 
	{
		List<String> result = new LinkedList<>();
		YPackage yPackage = yClass.getParentElement();
		result.add(yPackage.getName());
		yPackage = yPackage.getParentElement();

		while (yPackage != null) {
			result.add(0, yPackage.getName());
			yPackage = yPackage.getParentElement();
		}

		return result;
	}
	/**
	 * Does some preparatory works for the subsequent compiling: 
	 * Iterates over the layers and their classes (including the classes of possible subpackages)
	 * and figures out, if they own operations. If they do, compiling process carries on. 
	 * Checks if model files changed, initializes and clears some maps. 
	 * 
	 * @param threadNumber
	 * @param resetCaches
	 * @param checkModelFileChanges	: indicates whether the model files have been changed or not
	 */
	public void prepareForCompile(Integer threadNumber, boolean resetCaches, boolean checkModelFileChanges) 
	{
	
		
		
		om = chartManagement.objectManagement;
		compileErrors = false;
		
		layerClassIds = new ArrayList<>();
		om.getLayerClassObjects().clear();
		
		//process all operations of all layers
		for (int layer = 0; layer < om.getObjectCachesSize(); layer++) 
		{
			if (checkModelFileChanges) 
			{
				checkModelFileChanges(layer);
			}

			om.initializeMethodMap(layer);
			if (layerFileChanged || modelChangesInFileSystem || compileErrors)
			{
				if (chartManagement.execute.guardCache.get(layer) != null)
					chartManagement.execute.guardCache.get(layer).clear();
				if (chartManagement.execute.effectCache.get(layer) != null)
					chartManagement.execute.effectCache.get(layer).clear();
			}
			
			layerClassIds.add(new ArrayList<>());
			om.getLayerClassObjects().add(new HashMap<>());

//			if (layerFileChanged || modelChangesInFileSystem || compileErrors || threadNumber != null) 
			if(layer == 0)
			{
				
				Vector<String> packageNames;
				List<YOperation> operations;

				initCompileResources();
				
				compilationUnits = new ArrayList<JavaSourceFromString>();
				compileNames = new HashMap<String, String>();
				
//				if (!chartManagement.standalone) 
					getExtApiDependencies();

				for (EObject clazz : om.getEObjects(layer, "YClass")) {
					
					operations = (List<YOperation>) om.get(clazz, "ownedOperation");
					if (!operations.isEmpty()) 
					{
						nsURI = om.getNsURI(layer + 1);
						EPackage ePackage = chartManagement.resourceManagement.resourceSet.getPackageRegistry()
								.getEPackage(nsURI);
						
						eclass = (EClass) ePackage.getEClassifier((String) om.get(clazz, "name"));

						if (eclass == null) {
							
							EPackage containingPackage = ePackage;
							for (String packageName : getQualifiedPackageNamew((YClass)clazz)) {
								for(EPackage subPackage : containingPackage.getESubpackages())
								{
									if (subPackage.getName().equals(packageName))
									{
										containingPackage = subPackage;
										break;
									}
								}
							}
							eclass = (EClass) containingPackage.getEClassifier((String) om.get(clazz, "name"));
	
						}
						
						if (eclass == null) 
						{
							logger.error("compiler error: class not found " + getQualifiedPackageNamew((YClass)clazz));
						}
						
						createSource(clazz, layer);
					}
				}

				
				
			}
			else if (false) //layer < om.getObjectCachesSize() - 1)
			{
				//TODO: f�r mehrere registrieter provider asuwahl
				
//				ILayerSourceProvider sourceProvider = chartManagement.resourceManagement.getExtension(ILayerSourceProvider.class, "online.yamm.layerSourceProvider");
//				Layer LayerObj = chartManagement.objectManagement.getViewLayers().get(layer);
//				String extension = null;
//				if (LayerObj != null) {
//					String path = chartManagement.objectManagement.getViewLayers().get(layer).getPath();
//					extension = path.substring(path.lastIndexOf(".") + 1, path.length());	
//				}
//				
//				final int layerFinal = layer;
//				if (sourceProvider != null && extension != null && sourceProvider.isProvider(extension)) 
//				{
//					for (Entry<String, String> idAndSource : sourceProvider
//							.getSource(new IInternalModelAccess() {
//								public List<EObject> getObjectsOfType(String qualifiedTypeName) 
//								{
//									return om.getEObjects(layerFinal, qualifiedTypeName);
//								}
//							}, projURL).entrySet())
//					{
//						prepareCompilationUnitLayer(idAndSource.getKey(), idAndSource.getValue(), layer);
//					}			
//					
//				}

			}
			layerFileChanged = false;
		}	
		
		
		
		
	////compile
	compile();
	
	}
	
	public static interface IInternalModelAccess {
		List<EObject> getObjectsOfType(String typeName);
	}

	private void compile() {
	
		if (compiler == null) {
			Common.printlnMessage("Could not initialize the Java 6 compiler API. No JDK installed/used? Breaking up ... ", DUMPMESSAGETO.ERROR);
			return;
		}
		List<String> optionList = new ArrayList<String>();
		
		if (chartManagement.standalone) {
			String classPathSeperator = System.getProperty("os.name").contains("Windows") ? ";" : ":";
			for (String jarPath : chartManagement.resourceManagement.jarPaths) {
				classPathesString += classPathSeperator + jarPath;
			}
			optionList.addAll(Arrays.asList("-classpath", classPathesString));
			optionList.add("-proc:none");
		}
			
		else
			optionList.addAll(Arrays.asList("-classpath", classPathesString));

		if (!chartManagement.standalone)
		for (final URL url : urls) {
			fileManagerMemory.addClassPathUrl(url);
		}


		DiagnosticCollector<JavaFileObject> diagnostics = new DiagnosticCollector<JavaFileObject>();
		CompilationTask task = compiler.getTask(null, fileManagerMemory, diagnostics, optionList, null, compilationUnits);


	if (!task.call()) {
		handleDiagnostics(diagnostics);
	}

		
	
		for (Entry<String,String> entry : compileNames.entrySet()) {
			fillMethodMap(0, entry.getKey(), entry.getValue());
		}
		int i = 0;
		for (List<String> _layer : layerClassIds) {
			for (String _classId : _layer) {
				fillMethodMapLayer(i, _classId);
			}			
			i++;
		}
	}
	
	
	
	
	private void fillMethodMapLayer(Integer layer, String classId) 
	{

		Class<?> actClass = null;
		try
		{
			ClassLoader classLoader = new JavaFileManagerClassLoader(projBinURL, memoryOutputJavaFileManagerCache.get(classId), getDefaultClassLoader());	
			om.getLayerClassObjects().get(layer).put(classId, classLoader.loadClass(classId));
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		} 
		

	}
	

	/**
	 * @author
	 *      Kohsuke Kawaguchi (kk@kohsuke.org)
	 */
    /**
     * Reads a ".classpath" file and turns it into a string
     * formatted to fit the CLASSPATH variable.
     */
	  private static final String KIND_VAR = "var";
	  static Set kinds = new HashSet(Arrays.asList(new String[]{"lib", "output", "src", KIND_VAR}));
    public static void parseDotClasspath( File dotClasspath, final ClasspathBuilder builder ) throws IOException,SAXException,ParserConfigurationException {
        // all entries in .classpath are relative to this directory.
        final File baseDir = dotClasspath.getParentFile().getAbsoluteFile();

//        XMLReader parser = XMLReaderFactory.createXMLReader();
        SAXParserFactory spf =SAXParserFactory.newInstance();
        spf.setNamespaceAware(true);
        XMLReader parser = spf.newSAXParser().getXMLReader();
        parser.setContentHandler(new DefaultHandler() {
            public void startElement(String uri,String localName,String qname,Attributes atts) {
                if( !localName.equals("classpathentry") )
                    return; // unknown

                String kind = atts.getValue("kind");
                if (kind != null && kinds.contains(kind)) {
                    String path = atts.getValue("path");
                    if (kind.equals(KIND_VAR)) {
                        int i = path.indexOf('/');
                        String dir = System.getProperty(path.substring(0, i));
                        path = dir + '/' + path.substring(i + 1);
                    }
                    if (path.endsWith(".jar"))
                    builder.add(absolutize(baseDir, path));
                }

                String output = atts.getValue("output");
                
               
                if(output!=null) {
                	 if (output.endsWith(".jar"))
                    builder.add(absolutize(baseDir,output));
                }
            }
        });
        parser.parse(dotClasspath.toURL().toString());
    }
    private static File absolutize( File base, String path ) {
        path = path.replace('/',File.separatorChar);
        File child = new File(path);
        if(child.isAbsolute())
            return child;
        else
            return new File(base,path);
    }
    
  

    /**
     * Builds a CLASSPATH string from {@link File}s.
     * 
     * @author
     *      Kohsuke Kawaguchi (kk@kohsuke.org)
     */
   class ClasspathBuilder {
        /**
         * Path separator.
         * The default value is platform-dependent.
         */
        private String separator = File.pathSeparator;
        
        private final StringBuffer buf = new StringBuffer();
        
        /**
         * Overrides the platform-default separator string.
         */
        public void setSeparator( String sep ) {
            this.separator = sep;
        }
        
        public void reset() {
            buf.setLength(0);
        }
        
        /**
         * Adds a new entry
         */
        public void add( File f ) {
            if( buf.length()!=0 )
                buf.append(separator);
            buf.append(f.toString());
        }
        
        /**
         * Returns the string formatted for the CLASSPATH variable.
         */
        public String getResult() {
            return buf.toString();
        }
    }
	private void getExtApiDependencies() {
		String classPathSeperator = System.getProperty("os.name").contains("Windows") ? ";" : ":";
		ClasspathBuilder classpathBuider = new ClasspathBuilder();
		
		String workspacePath = null;
		if (!chartManagement.standalone)
			workspacePath = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString();	
		else
			workspacePath = chartManagement.standaloneWorkspacePath;
		try
		{
			parseDotClasspath(new File(workspacePath + separator + projectName + separator + ".classpath"), classpathBuider);
		}
		catch (IOException | SAXException | ParserConfigurationException e2)
		{
			logger.error("Could not load " + workspacePath + separator + projectName + separator + ".classpath");
			e2.printStackTrace();
		}
		setClassPathString();
		Set<URL> urls2 = new HashSet();
		urls =  getClassPathUrls();
		for (String jarPath : classpathBuider.getResult().split(pathSeparator)) {
			try {
				urls.add(new File(jarPath).toURI().toURL());
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
			classPathesString += classPathSeperator + jarPath;
		}
			
		
		if (!chartManagement.standalone) {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		 IWorkspaceRoot root = workspace.getRoot();
		 IProject[] projects = root.getProjects();
		 IProject project = null;
		 for (IProject proj : projects) {
			 if (proj.getName().equals(projectName))
				 project = proj;
		 }
		

		
		try {
			IJavaProject jp = JavaCore.create(project);
			IClasspathEntry[] classpath = jp.getResolvedClasspath(true);

			for (int i = 0; i < classpath.length; i++) {
				final IClasspathEntry entry = classpath[i];
				if (entry.getEntryKind() == IClasspathEntry.CPE_SOURCE) {
					IPath outputLocation = entry.getOutputLocation();
					if (outputLocation == null) {
						outputLocation = jp.getOutputLocation();
					}
					IFolder folder = root.getFolder(outputLocation);
					if (folder.exists()) {
						urls2.add(new URL(folder.getRawLocationURI() + "/"));
//								urls2.add(entry.getPath().toFile().toURI().toURL());
					}
				} else if (entry.getEntryKind() == IClasspathEntry.CPE_PROJECT) {
					IPath outputLocation = entry.getOutputLocation();
					if (outputLocation == null) {
						IProject project2 = (IProject) root.getProject(entry.getPath().toString());
						IJavaProject javaProject = JavaCore.create(project2);
						if (javaProject != null)
							outputLocation = javaProject.getOutputLocation();
					}
					if (outputLocation != null) {
						IFolder folder = root.getFolder(outputLocation);
						if (folder.exists()) {
							urls2.add(new URL(folder.getRawLocationURI().toASCIIString() + "/"));
						}
					} else {
						urls2.add(entry.getPath().toFile().toURI().toURL());
					}
				} else if (entry.getEntryKind() == IClasspathEntry.CPE_LIBRARY) {
						urls2.add(entry.getPath().toFile().toURI().toURL());
				} else {

				}
			}
		} catch (Exception e) {
			logger.error("cant find project");
		}

		
//		urls.addAll(urls2);
//		final String classPathSeperator = System.getProperty("os.name").contains("Windows") ? ";" : ":";
		for (URL url : urls2) {
			
			classPathesString += classPathSeperator + url.getFile();
		}
		} 
		
		fileManager = compiler.getStandardFileManager(null, null, null);
		fileManagerMemory = new MemoryOutputJavaFileManager(fileManager);
		fileManagerMemory.active = true;
	}


//	private void resolveRefToWSClass(EObject model) {
//		
//		Resource runtimeRes = getRuntimeResource();
//		
//		org.eclipse.emf.common.util.TreeIterator<EObject> allContent = model.eResource().getAllContents();
//		
//		
//		while (allContent.hasNext()) {
//			EObject content = allContent.next();	
//			
//			if (content instanceof XConstructorCall) {
//				
//				JvmConstructor constructor;
//				if ((constructor = ((XConstructorCall) content).getConstructor()).eIsProxy()) {
//
//						JvmConstructor constructorInSemRes = (JvmConstructor) runtimeRes.getEObject(EcoreUtil.getURI(constructor).fragment());
//						JvmType type = (JvmType) constructorInSemRes.eContainer();
//						JvmType newType = (JvmType) EcoreUtil.copy(constructorInSemRes.eContainer());
//								
//						EStructuralFeature declaredConstFeature = constructorInSemRes.eContainingFeature();
//						EList constructors = (EList<JvmConstructor>)constructorInSemRes.eContainer().eGet(declaredConstFeature);
//						int index = constructors.indexOf(constructorInSemRes);
//
//						EList<JvmConstructor> newConstructors = (EList<JvmConstructor>)newType.eGet(newType.eClass().getEStructuralFeature(declaredConstFeature.getName()));
//
//						((XConstructorCall) content).setConstructor(newConstructors.get(index));
//
//				}
//				
//				
//			} else if (content instanceof org.eclipse.xtext.xbase.XCastedExpression) {
//				
//	
//				JvmTypeReference typeRef = ((org.eclipse.xtext.xbase.XCastedExpression) content).getType();
//				
//				if (typeRef.getType().eIsProxy()) {
//
//					JvmType typeInDiagramRes = (JvmType) runtimeRes.getEObject(EcoreUtil.getURI(typeRef.getType()).fragment());		
//					((JvmParameterizedTypeReference) typeRef).setType((JvmType) EcoreUtil.copy(typeInDiagramRes));
//				}
//				
//				
//			} else if (content instanceof XAbstractFeatureCall) {
//				
//				EObject feature = ((XAbstractFeatureCall) content).getFeature();
//				String fragment = EcoreUtil.getURI(feature).fragment();
//				
//				if (feature instanceof JvmVoid) { // == feature is proxy
//					
//					EObject featureinDiagramRes = runtimeRes.getEObject(fragment);
//					JvmType typeDiaramRes = (JvmType) featureinDiagramRes.eContainer();
//										
//					if (featureinDiagramRes instanceof JvmOperation) {
//								
//							JvmType typeCopy =  (JvmType) EcoreUtil.copy(typeDiaramRes);
//		
//							EStructuralFeature declaredOpertions = featureinDiagramRes.eContainingFeature();
//							EList<JvmOperation> operations = (EList<JvmOperation>)featureinDiagramRes.eContainer().eGet(declaredOpertions);
//							int index = operations.indexOf(featureinDiagramRes);
//
//							EList<JvmOperation> featureCopy = (EList<JvmOperation>)typeCopy.eGet(typeCopy.eClass().getEStructuralFeature(declaredOpertions.getName()));
//							JvmOperation operationCopy = featureCopy.get(index);	
//							
//							((XAbstractFeatureCall) content).setFeature(operationCopy);
//					
//							
//					} else if (featureinDiagramRes instanceof JvmField) {
//				
//							JvmType typeCopy = (JvmType) EcoreUtil.copy(typeDiaramRes);
//						
//							EStructuralFeature declaredFields = featureinDiagramRes.eContainingFeature();
//							EList<JvmOperation> operations = (EList<JvmOperation>)featureinDiagramRes.eContainer().eGet(declaredFields);
//							int index = operations.indexOf(featureinDiagramRes);
//
//							EList<JvmField> featureCopy = (EList<JvmField>)typeCopy.eGet(typeCopy.eClass().getEStructuralFeature(declaredFields.getName()));
//							JvmField fieldCopy = featureCopy.get(index);	
//							
//							((XAbstractFeatureCall) content).setFeature(fieldCopy);
//					
//					} else if (featureinDiagramRes instanceof JvmFormalParameter) {
//						//TODO: error..?
//					} else {
//						//TODO: error..?
//					}
//					
//
//				}
//				
//			} else if (content instanceof XInstanceOfExpression) {
//				
//				String fragment = EcoreUtil.getURI(((XInstanceOfExpression) content).getType().getType()).fragment();
//				
//				JvmType typeInDiagramRes = (JvmType) runtimeRes.getEObject(fragment);			
//				
//				JvmType typeCopy = (JvmType) EcoreUtil.copy(typeInDiagramRes);
//				
//				((JvmParameterizedTypeReference) ((XInstanceOfExpression) content).getType()).setType(typeCopy);
//			}
//
//		}
//		
//
//		
//	}

//	private Resource getRuntimeResource() {
//		String modelPath = LayerView.yamm.reflectivStateChart.objectManagement.getViewLayers().get(0).getPath();
//		
//		for(Resource semRes : session.getSemanticResources()) {
//			
//			String pathA = "";
//			String pathB = "";
//			
//			String[] segments = semRes.getURI().segments();
//			for (int i = 1; i < segments.length ; i++) {
//				pathA += "/" + segments[i];
//				pathB += "\\" + segments[i];
//			}
//			
//			if (pathA.equals(modelPath) || pathB.equals(modelPath))
//				return semRes;
//			
//		}
//		
//		return null;
//	}

	private void initCompileResources() {
		
		// 
//		if (codegenXbaseToTarget == null)
			codegenXbaseToTarget = new CodegenXbaseToTarget(chartManagement); 
//		if (codegenTargetToCode == null)
			codegenTargetToCode = new CodegenTargetToCodeOriginal();
		
		String osFileSeparator = System.getProperty("file.separator");
		String pathToModel = chartManagement.objectManagement.getViewLayers().get(0).getPath();	
		if (!chartManagement.standalone)
		{	
			if (pathToModel.contains("/"))
				projectName = pathToModel.substring(1, pathToModel.indexOf("/", 1));
			else
				projectName = pathToModel.substring(1, pathToModel.indexOf("\\", 1));
		}
		else
		{
			projectName = chartManagement.standaloneProjectName;
		}
		String workspacePath = null;
		if (!chartManagement.standalone) {
			workspacePath = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString();	

			String path = "";
			try {
				path = "file:" + osFileSeparator 
						+ workspacePath + osFileSeparator
						+ projectName;
				projURL = new URL(path);		
				projBinURL = new URL(path + osFileSeparator + "bin" + osFileSeparator);
			} catch (MalformedURLException e) {
				//TODO: log
				e.printStackTrace();
			}

			
			org.eclipse.emf.common.util.URI sessionResourceURI = org.eclipse.emf.common.util.URI.createPlatformResourceURI(projectName + "/representations.aird");
			session = SessionManager.INSTANCE.getSession(sessionResourceURI, new NullProgressMonitor());
			if (session == null)
				logger.error("session not found");
		}

	}

	/**
	 * Checks whether a model file has been changed. If changes are found, 
	 * value of {link {@link #modelChangesInFileSystem} is set true.
	 * 
	 * @param layer	:	the current layer
	 */
	private void checkModelFileChanges(int layer) 
	{
		modelChangesInFileSystem = false;
		if (!ConfigurationManagement.isAllwaysCompile()) 
		{
			if (layer < om.getViewLayers().size()) 
			{
				filePath = om.getViewLayers().get(layer).getPath();
				if (chartManagement.resourceManagement.threadnum.equals("")) 
				{
					filePath = (ResourcesPlugin.getWorkspace().getRoot().getLocation().toString()).concat(filePath);
				}
				long lastModified = new File(filePath).lastModified();
				if (!om.getFiles().containsKey(filePath) 
						|| !om.getFiles().get(filePath).equals(lastModified))
				{
					modelChangesInFileSystem = true;
					om.getFiles().put(filePath, lastModified);
				}
			}
		}
	}



	/**
	 * Iterates over every single operation of one class of one layer and create its source code:
	 * Gets the operations state machine and its transitions and creates their guards and effects.
	 * Considers the methods of the online.yamm/methods - folder by invoking 
	 * {@link #attachJavaSourceFile(Integer, InputStreamReader, PrintWriter)}
	 * Finally calls {@link #compileClassAndHandleDiagnostics(Integer, StringWriter, String)}.
	 * 
	 * @param clazz	:	the class owning the operations
	 * @param layer	:	the given layer
	 */
	private void createSource(EObject clazz, int layer) 
	{

		itsRmofClassFeatures = null;
		featureNames.clear();
		String className;
		String opName;
		EList<EStructuralFeature> features = eclass.getEAllStructuralFeatures();
		EObject actOp;
		boolean somethingChanged;
		StringWriter writer;
		PrintWriter out;
		String compileName;
		EList<EObject> operations = ((EList<EObject>) om.get(clazz, "ownedOperation"));

		for (int i = 0; i < operations.size(); i++) 
		{
			actOp = operations.get(i);
			className = (String) om.get(clazz, "name");
			opName = (String) om.get(actOp, "name");
			compileName = className.concat(opName).concat((String) om.get(actOp, "ObjectID")).concat("Compile");

			className = className.concat(opName).concat((String) om.get(actOp, "ObjectID"));
			eclass = (EClass) chartManagement.resourceManagement.resourceSet.getPackageRegistry()
					.getEPackage(om.getNsURI(layer + 1)).getEClassifier(className);
			features = eclass.getEAllStructuralFeatures();

			writer = new StringWriter();
			out = new PrintWriter(writer);
			addingImports(out);
			out.println("public class ".concat(compileName).concat(" {"));
			out.println("  private static YAMMLogger logger = YAMMLogger.getYAMMLogger(\"YAMM Log\");");
			// adding constructor
			out.println("  EvalGuardOrEffect execute;");
			out.println("  ObjectManagement om;");
			out.println("  public ".concat(compileName).concat("(EvalGuardOrEffect execute) {"));
			out.println("    this.execute = execute;");
			out.println("    this.om = execute.reflectivStateChart.objectManagement;");
			out.println("  }");
			
			// process transitions
			EObject stateMachine = (EObject) om.get(actOp, "stateMachine"); 
			somethingChanged = false;
			EList<EObject> transitions = (EList<EObject>) om.get(stateMachine, "transition");
			for (EObject transition : transitions) 
			{
				createEffects(layer, eclass, opName, className, transition, out, (YClass)clazz);
				createGuard(layer, transition, out, opName, className, features, eclass, (YClass)clazz);

			}
			
			attachJavaSourceFiles(layer, out);
			out.println("}");
			out.close();
		
			prepareCompilationCore(layer, className, opName, writer, compileName);
		}
	}

	private void prepareCompilationCore(int layer, String className, String opName, StringWriter writer,
			String compileName) {

		String sourcecode = writer.toString();
		GlobalLogger.printSource(sourcecode, "R:/log/" + compileName + j++);
		compilationUnits.add(new JavaSourceFromString(compileName, sourcecode));

		memoryOutputJavaFileManagerCache.put(compileName.concat(Integer.valueOf(layer).toString()), fileManagerMemory);
		
		compileNames.put(compileName, compileName.substring(0, compileName.lastIndexOf("Compile")).concat(opName));
	}
	
	private void prepareCompilationUnitLayer(String classId, String sourcecode, int layer) 
	{	
		GlobalLogger.printSource(sourcecode, "R:/log/" +layer + "_" + classId + "_" + j++);
		
		compilationUnits.add(new JavaSourceFromString(classId, sourcecode));

		memoryOutputJavaFileManagerCache.put(classId, fileManagerMemory);
		
		layerClassIds.get(layer).add(classId);

	}
	



static int j = 0;

	public boolean createGuard(Integer layer, EObject transition, PrintWriter out, 
			String contextName, String className, EList<EStructuralFeature> features, EClass eclass, YClass clazz) 
	{
		EObject attachment = (EObject) om.get(transition, "attachment");
		if (attachment == null)
			return false;

		XExpression guard =  (XExpression) om.get(attachment, "guard");

		if (guard == null) // || guard.isEmpty())
			return false;


			
		HashMap<Integer, HashMap<String, HashMap<String, String>>> guardCache = chartManagement.execute.guardCache;
		HashMap<String, HashMap<String, String>> guardCacheClassContext;
		HashMap<String, String> guardsCached;

		if (guardCache.containsKey(layer)) 
		{
			guardCacheClassContext = guardCache.get(layer);
		} 
		else
		{
			guardCacheClassContext = new HashMap<String, HashMap<String, String>>();
			guardCache.put(layer, guardCacheClassContext);
		}

		if (guardCacheClassContext.containsKey(contextName))
		{
			guardsCached = guardCacheClassContext.get(contextName);
		}
		else
		{
			guardsCached = new HashMap<String, String>();
			guardCacheClassContext.put(contextName, guardsCached);
		}


		String transitionName = (String) om.get(transition, "name");

		String methodName = (transitionName != null && !transitionName.isEmpty()) ? "guard"
				.concat(transitionName) :
					"guard".concat((String) om.get(transition, "ObjectID"));

		XBlockExpression guardExps = (XBlockExpression) om.get(transition, "attachment", "guard");

		guardExps = codegenPropAccess.preprocess(codegenExtensionMethods.preprocess(guardExps));

		String method = "public boolean " + methodName + "(EObject obj) throws Exception {\r\n";

		for (Iterator<XExpression> expIter = guardExps.getExpressions().iterator(); expIter.hasNext();) {
			XExpression exp = expIter.next();
			if (expIter.hasNext())
				method += codegenTargetToCode.generate(codegenXbaseToTarget.generateRoot(exp)) + "\n";
			else
				method += "return " + codegenTargetToCode.generate(codegenXbaseToTarget.generateRoot(exp)) + "\n";
		}		
		method += "}";

		out.println(method);

		String key = (String) om.get(attachment, "ObjectID"); 
		guardsCached.put(key, className.concat(contextName).concat(methodName)); 
				return true;
	}

	private int createEffects(Integer layer, EClass eclass, String contextName, String className, EObject transition, PrintWriter out, YClass clazz) {	
		EObject attachment = (EObject) om.get(transition, "attachment");
		if (attachment == null)  
			return 0;

		EList<EObject> effects = (EList<EObject>) om.get(attachment, "effects");
		if (effects.size() == 0) 
			return 0;
		

		Integer ie = 0;
		String transitionName;
		
		HashMap<String, String> effectsCached;
		HashMap<String, HashMap<String, String>> effectCacheL2;

		if (chartManagement.execute.effectCache.containsKey(layer))
		{
			effectCacheL2 = chartManagement.execute.effectCache.get(layer);
		} 
		else
		{
			effectCacheL2 = new HashMap<String, HashMap<String, String>>();
			chartManagement.execute.effectCache.put(layer, effectCacheL2);
		}

		if (effectCacheL2.containsKey(className)) 
		{
			effectsCached = effectCacheL2.get(className);
		}
		else
		{ 
			effectsCached = new HashMap<String, String>();
			effectCacheL2.put(className, effectsCached);
		}

		for (Integer i = 0; i < effects.size(); i++)
		{


			ie++;
			transitionName = (String) om.get(transition, "name");
			String methodName = (transitionName != null && !transitionName.isEmpty()) ? "effect"
					.concat(transitionName).concat("_").concat(i.toString()) :
						"effect".concat((String) om.get(transition, "ObjectID")).concat("_").concat(i.toString());

			String sourceCode = "public void " + methodName + "(EObject obj) throws Exception{\r\n";
			
			TargetASTRoot targetModel = null;
			
			if (((YEffect) effects.get(i)).getBody() != null) {
				XBlockExpression expOneEffect = codegenPropAccess.preprocess(codegenExtensionMethods.preprocess((XBlockExpression)((YEffect) effects.get(i)).getBody()));
				for (XExpression exp : expOneEffect.getExpressions()) {
					
					targetModel = codegenXbaseToTarget.generateRoot(exp);
					sourceCode += codegenTargetToCode.generate(targetModel) + "\n";

				}
			}
			sourceCode += "}";
			
			out.println(sourceCode);
			

			String key = (String) om.get(effects.get(i), "ObjectID"); 
					
			effectsCached.put(key, className.concat(contextName).concat(methodName));
		}
		// class compile only if i > 0
		return ie;
	}


	/**
	 * Adds import statements to the PrintWriter object.
	 * 
	 * @param importPrinter		:	the PrintWriter.
	 */
	void addingImports(PrintWriter importPrinter) {
		importPrinter.println("import java.util.ArrayList;\r\n" + 
				"import org.eclipse.emf.common.util.BasicEList;\r\n"); 
		importPrinter.println("import online.yamm.ObjectManagement;");
		importPrinter.println("import online.yamm.operations.InoutAdapterSingle;");
		importPrinter.println("import online.yamm.operations.InoutAdapterMany;");
		importPrinter.println("import online.yamm.operations.InoutAdapter;");
		importPrinter.println("import java.util.function.*;");
		importPrinter.println("import online.yamm.coreModelXmi.yamm.YTransition;");
		importPrinter.println("import online.yamm.coreModelXmi.yamm.YStateMachineHandler;");
		importPrinter.println("import online.yamm.coreModelXmi.yamm.YFinalState;");
		importPrinter.println("import online.yamm.coreModelXmi.yamm.YState;");
		importPrinter.println("import online.yamm.coreModelXmi.yamm.YVertex;");
		importPrinter.println("import online.yamm.coreModelXmi.yamm.YOperation;");
		importPrinter.println("import online.yamm.coreModelXmi.yamm.YParameter;");
		importPrinter.println("import online.yamm.coreModelXmi.yamm.YStateMachine;");
		importPrinter.println("import online.yamm.coreModelXmi.yamm.YRunToCompletion;");
		importPrinter.println("import java.util.HashMap;");
		importPrinter.println("import java.util.Iterator;");
		importPrinter.println("import java.util.Vector;");
		importPrinter.println("import java.util.Map.Entry;");
		importPrinter.println("import java.util.Random;");
		importPrinter.println("import java.util.List;");
		importPrinter.println("import java.util.Collections;");
		importPrinter.println("import org.eclipse.emf.common.util.BasicEList;");
		importPrinter.println("import java.lang.reflect.Method;");
		importPrinter.println("import java.lang.reflect.InvocationTargetException;");
		importPrinter.println("import org.eclipse.emf.common.util.EMap;");
		importPrinter.println("import org.eclipse.emf.common.util.EList;");
		importPrinter.println("import org.eclipse.emf.ecore.EClass;");
		importPrinter.println("import org.eclipse.emf.ecore.EObject;");
		importPrinter.println("import org.eclipse.emf.ecore.EEnum;");
		importPrinter.println("import org.eclipse.emf.ecore.EEnumLiteral;");
		importPrinter.println("import org.eclipse.emf.ecore.ENamedElement;");
		importPrinter.println("import org.apache.log4j.Logger;");
		importPrinter.println("import org.apache.log4j.Level;");
		importPrinter.println("import online.yamm.logger.YAMMLogger;");
		importPrinter.println("import online.yamm.gui.Layer;");
		importPrinter.println("import org.eclipse.emf.ecore.EPackage;");
		importPrinter.println("import online.yamm.EvalGuardOrEffect;");
		importPrinter.println("import online.yamm.ConfigurationManagement;");
		importPrinter.println("import online.yamm.EEnumLiteralAdapter;");

	}


	/** copies all *.java files in 
	 *  from the workspace of the action plugin + methods directory
	 *  or from the jar file -> the "method" folder is copied into the jar  
	 * @param out - output stream to copy the java files to
	 */
	public void attachJavaSourceFiles(Integer layer, PrintWriter out) {

		javaSourceFileWriter = new StringWriter();
		PrintWriter javaSourceFilesOut = new PrintWriter(javaSourceFileWriter);

		String methodPath = ChartManagement.class.getProtectionDomain().getCodeSource().getLocation().getPath();		
		if (chartManagement.standalone)
			out.println(
"	public void breakpoint() {\n" + 
"		if (((Layer)execute.reflectivStateChart.objectManagement.getViewLayers().get(1-1)).isBreakpoint()) {\n" + 
"			execute.chartOperation.breakpoint();\n" + 
"		}\n" + 
"	}\n" + 
"	\n" + 
"	\n" + 
"	\n" + 
"		private void color(Object obj, Object secondObj) {\n" + 
"		execute.coloring.color(obj, secondObj, 1);\n" + 
"	}\n" + 
"	private void colorEffect(Object obj, Object secondObj, Object thirdObj ) {\n" + 
"		execute.coloring.color(obj, secondObj, thirdObj, 1);\n" + 
"	}\n" + 
"	private void color(Object obj, Object secondObj, Object thirdObj ) {\n" + 
"		execute.coloring.color(obj, secondObj, thirdObj, 1);\n" + 
"	}\n" + 
"	private void color(Object obj, Object secondObj, Object red, Object green, Object blue ) {\n" + 
"		execute.coloring.color(obj, secondObj, red, green, blue, 1);\n" + 
"	}\n" + 
"	private void deColor(Object obj) {\n" + 
"		execute.coloring.deColor(obj, 1);\n" + 
"	}\n" + 
"	\n" + 
"	private void colorDFA(String id) {\n" + 
"	execute.coloring.colorDFA(id);\n" + 
"}\n" + 
"\n" + 
"	public EList getContext(String contextName) {\n" + 
"		return execute.context.getContext(contextName, 1);\n" + 
"	}\n" + 
"	public void createContext(String contextName) {\n" + 
"		execute.context.createContext(contextName, 1);\n" + 
"	}\n" + 
"	public void removeContext(String contextName) {\n" + 
"		execute.context.removeContext(contextName, 1);\n" + 
"	}\n" + 
"	public EList getInstancesOfContext(String contextName, String instanceName) {\n" + 
"		return execute.context.getInstancesOfContext(contextName, instanceName, 1);\n" + 
"	}\n" + 
"	\n" + 
"		public EObject createInstance(String className) {\n" + 
"		return execute.createInstance.createInstance(className, 1);\n" + 
"	}\n" + 
"	\n" + 
"	\n" + 
"public String getPackageName(Object object) {\n" + 
"		return object instanceof EObject ? getPackageName(((EObject)object).eClass()) : \"\";\n" + 
"	}\n" + 
"\n" + 
"\n" + 
"	public String getPackageName(EClass eclass) {\n" + 
"		List<String> packageNames = new ArrayList<String>();\n" + 
"		EObject context = eclass;\n" + 
"\n" + 
"		while ((context = context.eContainer()) != null\n" + 
"				&& context instanceof EPackage) {\n" + 
"			packageNames.add(((ENamedElement) context).getName());\n" + 
"		}\n" + 
"\n" + 
"		String ret = \"\";\n" + 
"\n" + 
"		for (int i = packageNames.size() - 1; i >= 0; i--) {\n" + 
"			ret += packageNames.get(i);\n" + 
"\n" + 
"			if (i > 0) {\n" + 
"				ret += \".\";\n" + 
"			}\n" + 
"		}\n" + 
"		if (!ret.contains(\".\"))\n" + 
"			return eclass.getName();\n" + 
"		ret = ret.substring(5, ret.length()); // delete yamm.\n" + 
"		ret += \".\" + eclass.getName();\n" + 
"		return ret.length() == 0 ? null : ret.toString();\n" + 
"	}\n" + 
"	\n" + 
"		public void eval(Object objectID, Object objTransition,\n" + 
"			int effectCount) {\n" + 
"		execute.evalEffect((String) objectID, objTransition, effectCount, 1);\n" + 
"	}\n" + 
"	\n" + 
"	  public boolean evalGuard(Object idObj, Object t) {\n" + 
"	  return execute.evalGuard(idObj, t, 1);\n" + 
"  }\n" + 
"  \n" + 
"    public void failed(Object message) {\n" + 
"	  execute.testUtil.failed((String) message, 1);\n" + 
"  }\n" + 
"  \n" + 
"  	public String getHash(Object actObject) {\n" + 
"		return Integer.toHexString(actObject.hashCode());\n" + 
"	}\n" + 
"	\n" + 
"		public String getID(Object actObject) {\n" + 
"		return execute.getID.getID(actObject, 1);\n" + 
"	}\n" + 
"	\n" + 
"		public YOperation getInnerMostComplexOperation(Object toCheck) {\n" + 
"\n" + 
"		String effectToCheck = (String) toCheck;\n" + 
"		Vector operations = new Vector();\n" + 
"\n" + 
"		//Wenn es keine Zuweisung ist, kann es keine ComplexOperation sein\n" + 
"		if(!effectToCheck.contains(\"(\")) {\n" + 
"			logger.debug(\"No operation was found\");\n" + 
"			return null;\n" + 
"		//Andernfalls Effect durchgehen zu dem innerstem Klammerpaar\n" + 
"		} else {\n" + 
"			String help = effectToCheck;\n" + 
"			\n" + 
"			int last = -1;\n" + 
"			int counter = 0;\n" + 
"			boolean found = false;\n" + 
"			\n" + 
"			while(help.contains(\"(\")) {\n" + 
"				//collect all operations\n" + 
"\n" + 
"				last = help.indexOf(\"(\");	\n" + 
"\n" + 
"				int begin=last;\n" + 
"				\n" + 
"				while(help.charAt(begin) != ' ' && begin != 0) {\n" + 
"					begin--;\n" + 
"				}\n" + 
"				//OpName ermitteln\n" + 
"				String opName = help.substring(begin, last).trim();\n" + 
"				\n" + 
"				operations.add(opName);\n" + 
"				\n" + 
"				help = help.substring(help.indexOf(\"(\")+1);\n" + 
"			}\n" + 
"			\n" + 
"			for(int a=0;a<operations.size();a++) {	\n" + 
"				//Anschlie�end alle OperationHandler nach diesen Namen abfragen\n" + 
"				EList eList = null;\n" + 
"				EMap actLayer = (EMap) execute.maps[1];\n" + 
"	\n" + 
"				//TODO Mapping eintrag entsprechend abfragen\n" + 
"				for(int i=0;i<actLayer.size();i++) {\n" + 
"					Entry entry = (Entry) actLayer.get(i);\n" + 
"					if(entry.getValue() instanceof YOperation) {\n" + 
"						YOperation actOp = (YOperation) entry.getValue();\n" + 
"						if(actOp.getName() != null) {\n" + 
"							if(actOp.getName().equals(operations.get(a))) {\n" + 
"//								//Call vielleicht unn�tz\n" + 
"//								actOp.setCall(help.substring(last, counter));\n" + 
"\n" + 
"								return actOp;\n" + 
"							}\n" + 
"						}\n" + 
"	\n" + 
"					}\n" + 
"				}\n" + 
"			}\n" + 
"			if(found == false) {\n" + 
"				logger.debug(\"Nothing found\");\n" + 
"				return null;\n" + 
"			}\n" + 
"\n" + 
"		}\n" + 
"		return null;\n" + 
"	}\n" + 
"	\n" + 
"		public EList getInstances(Integer layer, String className, Object... args) {\n" + 
"		return execute.getInstances.getInstances(layer, className, args);\n" + 
"	}\n" + 
"	\n" + 
"	\n" + 
"		public EList getInstancesOf(String className) {\n" + 
"		return getInstancesOf(className, null, null);\n" + 
"	}	\n" + 
"	public EList getInstancesOf(String className, String operandA) {\n" + 
"		return getInstancesOf(className, null, null);\n" + 
"	}\n" + 
"	public EList getInstancesOf(String className, String operandA, Object operandB, Object... args) {\n" + 
"		return execute.getInstancesOf.getInstancesOf(className, operandA, operandB, 1, args);\n" + 
"	}\n" + 
"	public EList getInstancesOfLayer(Integer layer, String className, String operandA, Object operandB, Object... args) {\n" + 
"		return execute.getInstancesOf.getInstancesOfLayer(layer, className, operandA, operandB, args);\n" + 
"	}\n" + 
"	\n" + 
"	\n" + 
"		public String getParam(Object actOp) {\n" + 
"		//TODO\n" + 
"		return null;\n" + 
"	}\n" + 
"	\n" + 
"	\n" + 
"	\n" + 
"	private Object get(String postfix, Object obj, String ... propNames) {\n" + 
"\n" + 
"		if (obj instanceof EObject)\n" + 
"			return om.get(postfix, (EObject)obj, propNames);\n" + 
"		return null;\n" + 
"\n" + 
"	}\n" + 
"	\n" + 
"	private Object set(Object obj, Object value, String ... propNames) {\n" + 
"		return om.set(obj, value, propNames);\n" + 
"	}\n" + 
"	\n" + 
"	\n" + 
"	\n" + 
"	\n" + 
"private Object inoutHelper(String lastFeatureName, String postfix\n" + 
"			, boolean isINOUT, EList<InoutAdapter> inAdapters, Function<Object, Object> exp, boolean isParam) {\n" + 
"			\n" + 
"		if (isINOUT) {\n" + 
"			InoutAdapter inAdapter;\n" + 
"			\n" + 
"			EObject containingClass = (EObject) exp.apply(null); // --> Stackframe if isParam == true\n" + 
"			\n" + 
"			if (containingClass.eClass().getEStructuralFeature(lastFeatureName).isMany())\n" + 
"				inAdapter = new InoutAdapterMany();\n" + 
"			else\n" + 
"				inAdapter = new InoutAdapterSingle();\n" + 
"			\n" + 
"			inAdapters.add(inAdapter);\n" + 
"			\n" + 
"			Object arg = get(postfix, containingClass, lastFeatureName);\n" + 
"			\n" + 
"			if (isParam) {\n" + 
"				inAdapter.setParamNameForInit(lastFeatureName);\n" + 
"			} else {\n" + 
"				inAdapter.setPropertyName(lastFeatureName);\n" + 
"				inAdapter.setObjWithProperty(containingClass);\n" + 
"			}\n" + 
"\n" + 
"			return arg;\n" + 
"		} else {\n" + 
"			return exp.apply(null);\n" + 
"		}\n" + 
"	\n" + 
"	}\n" + 
"	\n" + 
"	public boolean instanceOf(Object obj, String typeName) {\n" + 
"	return om.instanceOf(obj, typeName);\n" + 
"}\n" + 
"\n" + 
"public boolean isInstanceOf(String className, Object cmpObj) {\n" + 
"	return execute.isInstanceOf.isInstanceOf(className, cmpObj, 1);\n" + 
"}\n" + 
"\n" + 
"private void setPopulationSize(Integer populationSize) {\n" + 
"	execute.nodeInfo.setPopulationSize(populationSize);\n" + 
"}\n" + 
"\n" + 
"private void setRelativeNodePropability(String nodeName, Float relativeProbability) {\n" + 
"	execute.nodeInfo.setRelativeNodePropability(nodeName, relativeProbability);\n" + 
"}\n" + 
"\n" + 
"private Float getAbsoluteNodePropability(String nodeName) {\n" + 
"	return execute.nodeInfo.getAbsoluteNodePropability(nodeName);\n" + 
"}\n" + 
"\n" + 
"private void setAbsoluteNodePropability(String nodeName, Float absolutePropability) {\n" + 
"	execute.nodeInfo.setAbsoluteNodePropability(nodeName, absolutePropability);\n" + 
"}\n" + 
"\n" + 
"\n" + 
"//	private Object opCall(String opName, Object...args) {\n" + 
"//		return execute.opCall.activateOperation(null, opName, 1, args);\n" + 
"//	}\n" + 
"	private Object opCall(Object eObject, String typeForMultiInheritance, String opName, Object inAdapterList, org.eclipse.emf.common.util.EList listOfClassesToAttachTheInAdapter, String returnVarName,  Object...args) {\n" + 
"		return execute.opCall.activateOperation(eObject, typeForMultiInheritance, opName, 1, (org.eclipse.emf.common.util.EList<online.yamm.operations.InoutAdapter>)inAdapterList, listOfClassesToAttachTheInAdapter, returnVarName, args);\n" + 
"	}\n" + 
"	private Object opStatic(String className, String opName, Object...args) {\n" + 
"		return execute.opCall.activateStaticOperation(className, opName, 1, args);\n" + 
"	}\n" + 
"	\n" + 
"	  public void passed(Object message) {\n" + 
"	  execute.testUtil.passed((String) message, 1);\n" + 
"  }\n" + 
"  \n" + 
"  	private void print(Object obj) {\n" + 
"		logger.info(\"Print (layer 1): \\\"\"+obj+\"\\\"\");\n" + 
"	}\n" + 
"	\n" + 
"		public Double generateRandomDouble(Double offset, Double range) {\n" + 
"		Random generator = new Random();\n" + 
"		return offset + generator.nextDouble() * range;\n" + 
"	}\n" + 
"	\n" + 
"		public Integer generateRandomInteger(Integer offset, Integer range) {\n" + 
"		Random generator = new Random();\n" + 
"		return offset + generator.nextInt(range);\n" + 
"	}\n" + 
"	\n" + 
"	  private void saveTrace(Object obj, String fileName) {\n" + 
"	execute.traceOperations.saveTrace(obj, fileName, 1);\n" + 
"  }\n" + 
"  \n" + 
"  	/*\n" + 
"	public void setAlive(String classID, String effect) {\n" + 
"		execute.lifeness.setAliveForInvoke(effect, 1);\n" + 
"	}\n" + 
"	*/\n" + 
"	\n" + 
"	public void setAlive(Object classID, String effect) {\n" + 
"		execute.lifeness.setAliveForInvoke(effect, 1);\n" + 
"	}\n" + 
"	\n" + 
"	public void isAlive() {\n" + 
"		execute.lifeness.isAlive(\"\", 1);\n" + 
"	}\n" + 
"	\n" + 
"	\n" + 
"	private void setReturnValue(Object returnValue) {\n" + 
"		execute.getSet.setReturnValue(returnValue);\n" + 
"	}\n" + 
"	private void setReturnValue(int returnValue) {\n" + 
"		execute.getSet.setReturnValue(Integer.valueOf(returnValue));\n" + 
"	}\n" + 
"	private void setReturnValue(double returnValue) {\n" + 
"		execute.getSet.setReturnValue(Double.valueOf(returnValue));\n" + 
"	}\n" + 
"	private void setReturnValue(boolean returnValue) {\n" + 
"		execute.getSet.setReturnValue(Boolean.valueOf(returnValue));\n" + 
"	}\n" + 
"	\n" + 
"	\n" + 
"		public String substituteEffect(Object objOP, Object effect) {\n" + 
"		YOperation actOp = (YOperation) objOP;\n" + 
"		String modifiedEffect = (String) effect;\n" + 
"		String returnName = \"\";\n" + 
"		for(int i=0;i<actOp.getOwnedParameter().size();i++) {\n" + 
"			YParameter actPara = actOp.getOwnedParameter().get(i);\n" + 
"			if(actPara.getDirection().getName().equals(\"return\")) {\n" + 
"				returnName = actPara.getName();\n" + 
"			}\n" + 
"		}\n" + 
"		if(returnName.equals(\"\")) {\n" + 
"			System.err.println(\"Kein Returnparameter in \"+actOp+\" vorhanden\");\n" + 
"		}\n" + 
"		int begin = modifiedEffect.indexOf(actOp.getName());\n" + 
"		int last = begin;\n" + 
"		while(modifiedEffect.charAt(last) != ')') {\n" + 
"			last++;\n" + 
"		}\n" + 
"		logger.debug(modifiedEffect.substring(0, begin));\n" + 
"		logger.debug(modifiedEffect.substring(last+1, modifiedEffect.length()));\n" + 
"		logger.debug(modifiedEffect.substring(begin, last+1));\n" + 
"		String operationCall = modifiedEffect.substring(begin, last+1);\n" + 
"		String returnCall = \"read(\"+Integer.toHexString(actOp.hashCode())+\", \"+returnName+\")\";\n" + 
"		modifiedEffect = modifiedEffect.replace(operationCall, returnCall);\n" + 
"		\n" + 
"		return modifiedEffect;\n" + 
"	}\n" + 
"	\n" + 
"		private Object timerStart(String name) {\n" + 
"		return execute.util.timerStart(name, 1);\n" + 
"	}\n" + 
"	\n" + 
"		private Double timerStop(Object timerObj) {\n" + 
"		return execute.util.timerStop(timerObj, 1);\n" + 
"	}\n" + 
"	\n" + 
"	private void waiting() {\n" + 
"		if(1==0) {\n" + 
"		} else {\n" + 
"			long waittime = ((Layer)execute.reflectivStateChart.objectManagement.getViewLayers().get(1)).getWaittime();\n" + 
"			execute.pauseExecution.pause(waittime, 1, null);\n" + 
"		}	\n" + 
"	}\n" + 
"	public Object getLayerInformation() {\n" + 
"		return execute.getLayerInformation.getLayerInformation();\n" + 
"	}" +
"	"
+ "	public Object getObjectManagement() {\n" + 
"		return execute.reflectivStateChart.objectManagement;\n" + 
"	}\n"
+ "public EObject loadModel(String relModelPath) {\n" + 
"	return execute.loadModel.loadModel(relModelPath, 1);\n" + 
"}"
+ 
"\r\n" + 
"	public EObject eventQueueConsume(Integer timeStep, Boolean past, Object eventType, Object receiver, Object receiverType) {\r\n" + 
"		return execute.des.eventQueueConsume(timeStep, past, eventType, receiver, receiverType, 1);\r\n" + 
"	}\r\n" + 
"	\r\n" + 
"	public EObject eventQueuePeek(Integer timeStep, Boolean past, Object eventType, Object receiver, Object receiverType) {\r\n" + 
"		return execute.des.eventQueuePeek(timeStep, past, eventType, receiver, receiverType, 1);\r\n" + 
"	}\r\n" + 
"	\r\n" + 
"	\r\n" + 
"	public EObject queueConsume(Object filterMap, Object queue) {\r\n" + 
"		return execute.des.queueConsume(filterMap, (EObject) queue, 1);\r\n" + 
"	}\r\n" + 
"	\r\n" + 
"	public EObject queuePeek(Object filterMap, Object queue) {\r\n" + 
"		return execute.des.queuePeek(filterMap, (EObject) queue, 1);\r\n" + 
"	}\r\n" + 
"	\r\n" + 
"	"

+ "	private Object getYClass(String type) {\r\n" + 
"		return execute.util.getYClass(type, 1);\r\n" + 
"	}"

					+"\r\n" + 
					"public void ObserverAddValue(String id, Double value) {\r\n" + 
					"	execute.util.observerAddValue(id, value, 1);\r\n" + 
					"}\r\n" + 
					"\r\n" + 
					"public void ObserverAddValue(String id, int value) {\r\n" + 
					"	execute.util.observerAddValue(id, (double) value, 1);\r\n" + 
					"}\r\n" + 
					"\r\n" + 
					"public void ObserverAddValue(String id, Object value) {\r\n" + 
					"	if (value instanceof java.lang.Number)\r\n" + 
					"		execute.util.observerAddValue(id, ((java.lang.Number) value).doubleValue(), 1);\r\n" + 
					"}"+
					"	private void getInstanceForStaticFeatureAccess(String qualifiedClassName) {\r\n" + 
					"		execute.accessStaticFeaturesFormClassLiterals.getInstanceForStaticFeatureAccess(qualifiedClassName, <%layer>);\r\n" + 
					"	}");
		if (!chartManagement.standalone)
		{
		if (methodPath.endsWith("bin/")) {
			methodPath = methodPath.substring(0, methodPath.length()-4);
		}
		if (methodPath.contains(".jar")) {
			JarFile jar = null;
			try
			{
				jar = new JarFile(methodPath);
//				System.out.println("jar" + jar);
			}
			catch (IOException e)
			{
				logger.error("Unable to open jarfile ".concat(methodPath).concat(" ... breaking up!"));
				e.printStackTrace();
				return;
			}
			Enumeration<JarEntry> jarEntries = jar.entries();
			while (jarEntries.hasMoreElements())
			{
				
				JarEntry jarEntry = jarEntries.nextElement();
				
				if (jarEntry.getName().contains("methods/") && jarEntry.getName().contains(".java")) 
				{
					System.out.println("Java Source found : " + jarEntry.getName());
					logger.debug("Java Source found : " + jarEntry.getName());
					try 
					{
						attachJavaSourceFile(layer, new InputStreamReader(jar.getInputStream(jarEntry)), javaSourceFilesOut);
					} 
					catch (IOException e)
					{
						e.printStackTrace();
					}
				}
			}
		} 
		else 
		{
			if (chartManagement.resourceManagement.threads && methodPath.endsWith(".jar")) 
			{
				methodPath = methodPath.substring(0, methodPath.length() - 4);
			}
			methodPath = methodPath.concat("methods");
			File myDir = new File(methodPath);
			if (myDir.exists() && myDir.isDirectory())
			{
				File[] files = myDir.listFiles();
				for (int i = 0; i < files.length; i++)
				{
					if (files[i].getName().contains(".java")) 
					{					
						try
						{
							attachJavaSourceFile(layer, new InputStreamReader(new FileInputStream(files[i])), javaSourceFilesOut);
						} 
						catch (FileNotFoundException e1) 
						{
							e1.printStackTrace();
						}					
					}
				}
			}
		}
		}
		out.append(javaSourceFileWriter.toString());
	}


	/** copies a single .java file to the output stream (with modifications to the layer information)
	 * @param inputStreamReader - input reader for the java file to be copied
	 * @param out - output stream to copy the java file to
	 */
	private void attachJavaSourceFile(Integer layer, InputStreamReader inputStreamReader, PrintWriter out) {
		BufferedReader bufferedReader = null;
		String line = "";
		bufferedReader = new BufferedReader(inputStreamReader);
		try
		{
			while (null != (line = bufferedReader.readLine()) )
			{
				line = line.replace("<%layer>", new Integer(layer + 1).toString());
				out.println(line);
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	protected ClassLoader getDefaultClassLoader()
	{
		ClassLoader parent = Thread.currentThread().getContextClassLoader();
		if (parent == null)
			parent = getClass().getClassLoader();

		return parent;
	}

	private void fillMethodMap(Integer layer, String compileName, String key) 
	{

		Class<?> actClass = null;
		try
		{
//			ClassLoader classLoader = new URLClassLoader(new URL[] { projBinURL}, Thread.currentThread().getContextClassLoader());
			ClassLoader classLoader = new JavaFileManagerClassLoader(projBinURL, memoryOutputJavaFileManagerCache.get(compileName.concat(layer.toString())), getDefaultClassLoader());//Thread.currentThread().getContextClassLoader());
			
			actClass = classLoader.loadClass(compileName);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		} 
		HashMap<String, Object> methodMap = om.getMethodMap(layer);
		try
		{
			methodMap.put(key, actClass.getConstructors()[0].newInstance(chartManagement.execute));
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		} 

		for (Method method : actClass.getDeclaredMethods()) 
		{
			methodMap.put(key.concat(method.getName()), method);
			//System.out.println(layer+1 + " -> " + key.concat(method.getName()));
		}

	}
	
	/**
	 * shows error when compilation fails
	 * 
	 * @param diagnostics null when no compilation errors occurs
	 */
	private void handleDiagnostics(DiagnosticCollector<JavaFileObject> diagnostics) {
		int layer = 1;
		if (diagnostics != null)
		{
			for (Diagnostic<? extends JavaFileObject> diagnostic : diagnostics.getDiagnostics()) 
			{
				if (chartManagement.standalone)
				{
					System.out.println("Compile error on layer "+ layer +": "+diagnostic.getMessage(null));
					System.out.println("Code:\t\t" + diagnostic.getCode());
					System.out.println("Kind:\t\t" + diagnostic.getKind());
					System.out.println("Source:\t\t" + diagnostic.getSource());
				}
				else
				{
					logger.error("Compile error on layer "+ layer +": "+diagnostic.getMessage(null));
					logger.error("Code:\t\t" + diagnostic.getCode());
					logger.error("Kind:\t\t" + diagnostic.getKind());
					logger.error("Source:\t\t" + diagnostic.getSource());
				}
				int start = diagnostic.getMessage(null).indexOf(".java:", 0) + 6;
				int end = diagnostic.getMessage(null).indexOf(":", start + 1);
				if (end <= start || end < 0 || start < 6) 
				{
					continue;
				}
				String actLineNumber = diagnostic.getMessage(null).substring(start, end);
				if (start > 0 && hasDigits(actLineNumber))
				{
					Integer lineNumber = Integer.parseInt(diagnostic.getMessage(null).substring(start, end));
					logger.error("Identified Line Number: " + lineNumber);
					StringTokenizer st = new StringTokenizer("\n");
					Integer lineCounter = 1;

					while (lineCounter < lineNumber && st.hasMoreTokens())
					{
						String subString = st.nextToken();
						// print context
						if (lineNumber - lineCounter < 10)
						{
							logger.error(lineCounter.toString().concat(" ").concat(subString));
						}
						lineCounter++;
					}

					String finalLine = st.nextToken();
					logger.error(lineCounter + finalLine);
					lineCounter++;

					Integer lineCounter2 = 0;
					while (lineCounter2 < 10 && st.hasMoreTokens())
					{
						String subString = st.nextToken();
						logger.debug(lineCounter.toString().concat(" ").concat(subString));
						lineCounter++;
						lineCounter2++;
					}

				}
			} 
			compileErrors = true;
			//reset modify time
			om.getFiles().put(filePath,0L);
		}
	}



	private void setClassPathString() {
		final String classPathSeperator = System.getProperty("os.name").contains("Windows") ? ";" : ":";
		classPathesString = emfPath + classPathSeperator
				+ emfCommonPath + classPathSeperator
				+ yammPath + classPathSeperator
				+ actionPath + classPathSeperator
				+ log4jPath;
	}

	/**
	 * Transforms a files path into a URL and adds it to ArrayList {@link #urls}.
	 * 
	 * @return urls - {@link #urls}
	 */
	protected List<URL> getClassPathUrls()
	{
		if (urls == null) {
			urls = new ArrayList<URL>();
			try {
				//urls.add(new File(actLayerPath).toURI().toURL());
				urls.add(new File(emfPath).toURI().toURL());
				urls.add(new File(emfCommonPath).toURI().toURL());
				urls.add(new File(yammPath).toURI().toURL());
				urls.add(new File(actionPath).toURI().toURL());
				urls.add(new File(log4jPath).toURI().toURL());
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		}
		return urls;
	}

	
	private boolean hasDigits(String actLineNumber) {
		try {
			Integer.parseInt(actLineNumber);
		} catch (Exception e) {
			return false;
		}
		return true;
	}


	static String findLocation( Class<?> clazz ) { 
		ClassLoader loader = clazz.getClassLoader(); 
		if ( loader == null ) 
			return null; 
		URL url = loader.getResource( clazz.getName().replace('.', '/' ) + ".class" ); 
		return ( url != null ) ? url.toString() : null; 
	}

}

/**
 * An implementation of javax.tools Interface {@code JavaFileObject} serving as a file abstraction for the 
 * javax.tools. The file object represents a compilation unit.
 */
class JavaSourceFromString extends SimpleJavaFileObject {
	final String code;

	JavaSourceFromString(String name, String code) {
		super(URI.create("string:///" + name.replace('.','/') + Kind.SOURCE.extension),Kind.SOURCE);
		this.code = code;
	}

	@Override
	public CharSequence getCharContent(boolean ignoreEncodingErrors) {
		return code;
	}
}
