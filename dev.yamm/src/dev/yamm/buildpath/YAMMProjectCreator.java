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
package dev.yamm.buildpath;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.dialect.command.CreateRepresentationCommand;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.tools.api.command.semantic.AddSemanticResourceCommand;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.ui.business.api.session.UserSession;
import org.eclipse.sirius.ui.tools.api.project.ModelingProjectManager;
import org.eclipse.sirius.viewpoint.DAnalysis;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DView;
import org.eclipse.sirius.viewpoint.description.RepresentationDescription;
import org.eclipse.ui.IEditorPart;
import org.eclipse.xtend.ide.buildpath.XtendLibClasspathAdder;

/**
 * 
 * Creates a new YAMM Project: A Sirius Modeling Project with yamm - specific configurations and
 * a *.yamm file.
 */
@SuppressWarnings({ "restriction", "unused" })
public class YAMMProjectCreator 
{

	/** Diagram File*/
	private File yammDiagramFile;

	/** The location of the Project. */
	private String projectLocation;

	/** An empty YAMM file for the later model's textual representation. */
	private File xYammFile;

	/** The name of the modeling project**/
	private String modelingProjectName;

	/** The {@code IProject} to be created.*/
	public IProject project;

	/** The Java Project, necessary to access buildpath.*/
	private IJavaProject javaProject;

	private IProjectDescription projDesc;
	Session session = null;

	/**
	 * Creates a YAMM project by creating a project, adding YAMM related stuff and converting it to
	 * a modeling project.
	 * 
	 * <li> creates an IProject
	 * <li> converts IProject to Modeling Project and creates the class diagram {@link #createDiagram(IJavaProject, NullProgressMonitor)}
	 * 
	 * @param projectName	: name of the project
	 * @param yammFileName	: name of the *.yamm file (the textual representation)
	 * @param isExampleModel: indicates whether an example has to be loaded or a new empty *.yamm file has to be created
	 * 
	 * @throws CoreException
	 */
	public void createYAMMProject(String projectName, String yammFileName, boolean isExampleModel) throws CoreException {
		modelingProjectName = projectName;
		NullProgressMonitor monitor = new NullProgressMonitor();
		createIProject(monitor, yammFileName, isExampleModel);
//		createDiagram(monitor); // model class diagram
		try
		{
			ModelingProjectManager.INSTANCE.convertToModelingProject(project, monitor);
		} 
		catch (CoreException e) {
			e.printStackTrace();
		}
		
		project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
	}

	/**
	 * <li> creates an IProject
	 * <li> adds project natures {@link #addProjectNatures(IProject project) }
	 * <li> creates Java Project needed for following step
	 * <li> configures Java Build Path {@link #addLibrariesAndJarsToClasspath(IProject)}
	 * <li> creates xyamm file: {@link #createXYAMMFile(String, boolean)}
	 * <li> creates yammdiagram file: {@link #createYammDiagramFile(String)}
	 * 
	 * @param monitor : does not show any progress.
	 * @throws CoreException
	 */
	private void createIProject(NullProgressMonitor monitor, String name, boolean isExampleModel) throws CoreException {

		final IWorkspaceRunnable create = new IWorkspaceRunnable() {
			@Override
			public void run(final IProgressMonitor monitor) throws CoreException {
				project = ResourcesPlugin.getWorkspace().getRoot().getProject(modelingProjectName);
				projectLocation = project.getFullPath().toString();
				if (!project.exists()) 
				{
					projDesc = ResourcesPlugin.getWorkspace().newProjectDescription(modelingProjectName);

					addProjectNatures(); //add Java and Xtext natures first create java project then

					project.create(projDesc, monitor);

					project.open(monitor);

					if (project.exists())
					{
						project.setDescription(projDesc, new NullProgressMonitor());
					}
					javaProject = JavaCore.create(project);
				}
				try {
					addLibrariesAndJarsToClasspath(monitor); //YAMM Library, Xtend Library, JRE System Library
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
//				createXYAMMFile(name); //textual representation of the model
				createYammDiagramFile(name, isExampleModel);
			}};
			ResourcesPlugin.getWorkspace().run(create, monitor);
	}
	
	/**
	 * Creates a YAMM example, e.g. a simple 'Hello World' model.
	 * 
	 * @param selectedModelExample : the selected example
	 * @throws UnsupportedEncodingException 
	 * @throws FileNotFoundException 
	 */
	private void createExample(String selectedModelExample) throws FileNotFoundException, UnsupportedEncodingException 
	{
		final String HELLO_WORLD = "HelloWorld.yammdiagram";
		final String DES_GRAVEL_SHIPPING = "DESGravelShipping.yammdiagram";
		final String ZAHLEN_SORTIEREN = "ZahlenSortieren.yammdiagram";
		final String ZEICHENKETTEN_SORTIEREN = "ZeichenkettenSortieren.yammdiagram";
		final String OBJEKTE_SORTIEREN = "ObjekteSortieren.yammdiagram";
		final String DES_SORTIEREN = "DESsortieren.yammdiagram";
		final String DES_GELDAUTOMAT= "DESGeldautomat.yammdiagram";
		final String GELDAUTOMAT = "Geldautomat.yammdiagram";
		final String EMPTY_PROJECT = "empty";
		final String TAGUNGSPLANUNG = "TagungsPlanung.yammdiagram";
		
		String yammFileContent = "";

		switch(selectedModelExample)
		{
		case EMPTY_PROJECT:
			yammFileContent = YAMMExampleProjectStore.emptyProject();
			break;
		case HELLO_WORLD:
			yammFileContent = YAMMExampleProjectStore.helloWorldExample();
			break;
		case DES_GRAVEL_SHIPPING:
			yammFileContent = YAMMExampleProjectStore.desGravelShippingExample();
			break;
		case ZAHLEN_SORTIEREN:
			yammFileContent = YAMMExampleProjectStore.zahlenSortierenExample();
			break;
		case ZEICHENKETTEN_SORTIEREN:
			yammFileContent = YAMMExampleProjectStore.zeichenkettenSortierenExample();
			break;
		case OBJEKTE_SORTIEREN:
			yammFileContent = YAMMExampleProjectStore.objekteSortierenExample();
			break;
		case DES_SORTIEREN:
			yammFileContent = YAMMExampleProjectStore.desSortierenExample();
			break;
		case DES_GELDAUTOMAT:
			yammFileContent = YAMMExampleProjectStore.desGeldautomatExample();
			break;
		case GELDAUTOMAT:
			yammFileContent = YAMMExampleProjectStore.geldautomatExample();
			break;
		case TAGUNGSPLANUNG:
			yammFileContent = YAMMExampleProjectStore.tagungsplanung();
			break;
		}
		PrintWriter writer = new PrintWriter(yammDiagramFile, "UTF-8");
		writer.print(yammFileContent);
		writer.flush();
		writer.close();
	}

	/**
	 * Converts the created IProject to a modeling project and creates the Sirius Diagram.
	 * 
	 * @throws CoreException 
	 */
	private void createDiagram(NullProgressMonitor monitor) throws CoreException 
	{
		try
		{
			ModelingProjectManager.INSTANCE.convertToModelingProject(project, monitor);
		} 
		catch (CoreException e) {
			e.printStackTrace();
		}

		IFile airdFile = project.getFile("representations.aird");

		if (airdFile.exists()) // Modeling Project has successfully been created
		{
			final org.eclipse.emf.common.util.URI yammFileEmfURI = org.eclipse.emf.common.util.URI.createURI(yammDiagramFile.toURI().toString());
			final org.eclipse.emf.common.util.URI emfURI = org.eclipse.emf.common.util.URI.createURI(airdFile.getLocationURI().toString());
			session = SessionManager.INSTANCE.getSession(emfURI, monitor);
			session.open(monitor); //initializes session

			//add new semantic resource to the session
			if (yammDiagramFile.exists())
			{
				AddSemanticResourceCommand addCommandToSession = new AddSemanticResourceCommand(session, yammFileEmfURI, monitor);
				session.getTransactionalEditingDomain().getCommandStack().execute(addCommandToSession);
				session.save(monitor);
			}

			//otherwise there would be no DView
			final UserSession userSession = new UserSession(session);
			userSession.selectOnlyViewpoint("yammViewpoint");

			//get needed parameters for createRepresentation (EObject semantic, RepresentationDescription)
			//...maybe there is a more direct way for doing this
			DAnalysis root = (DAnalysis) session.getSessionResource().getContents().get(0);
			EList<EObject> models = root.getModels(); //Check	
			EObject model = null;
			for (int i = 0; i < models.size(); i++)
			{
				if (models.get(i) instanceof dev.yamm.coreModelDiagram.yammDiagram.impl.YModelImpl)
				{
					model = models.get(i);
					break;
				}
			}

			EList<DView> views = root.getOwnedViews();
			DView view = null;

			for (int i = 0; i < views.size(); i++)
			{
				if (views.get(i).getViewpoint().getModelFileExtension() != null
						&& views.get(i).getViewpoint().getModelFileExtension().equals("yammdiagram"))
				{
					view = views.get(i);
					break;
				}
			}

			//get the Class Diagram Description 
			EList<RepresentationDescription> reprs = view.getViewpoint().getOwnedRepresentations();
			RepresentationDescription aDiagramDescription = null; 		
			if (!reprs.isEmpty())
			{
				for (int i = 0; i < reprs.size(); i++)
				{
					if (reprs.get(i).getName().equals("Yamm Class Diagram"))
					{
						aDiagramDescription = reprs.get(i);
						break;
					}
				}
			}
			//now create representation (diagram) and open its editor
			final EObject semantic = model;
			final RepresentationDescription classDiagramDescription = aDiagramDescription; 
			final IRunnableWithProgress runnable = new IRunnableWithProgress()
			{
				@Override
				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {

					TransactionalEditingDomain ted = session.getTransactionalEditingDomain();
					ted.getCommandStack().execute(new CreateRepresentationCommand(session, classDiagramDescription, semantic, modelingProjectName, monitor));
					SessionManager.INSTANCE.notifyRepresentationCreated(session); 
				}};
				try {
					runnable.run(monitor);
				} catch (InvocationTargetException | InterruptedException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				Collection<DRepresentation> repr = DialectManager.INSTANCE.getRepresentations(classDiagramDescription, session);
				IEditorPart part = DialectUIManager.INSTANCE.openEditor(session, repr.iterator().next(), monitor);
				DialectUIManager.INSTANCE.closeEditor(part, false);

				//silly but important workaround for opening right Class Diagram***************************

				final IWorkspaceRunnable create = new IWorkspaceRunnable() {
					@Override
					public void run(final IProgressMonitor monitor) throws CoreException {

						if (project.isOpen())
						{
							try 
							{
								project.close(monitor);
								project.open(monitor);
							} catch (CoreException e) {
								e.printStackTrace();
							}
							//						try {
							//							project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
							//						} catch (CoreException e1) {
							//							// TODO Auto-generated catch block
							//							e1.printStackTrace();
							//						}
						}
					}};
					create.run(monitor);
					userSession.openRepresentation(modelingProjectName);
					session.save(monitor);
					try {
						project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
					} catch (CoreException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
		}
	}



	/**
	 * Adds the Java and Xtext Project nature to the newly created Modeling Project.
	 * @param project 
	 * @throws CoreException 
	 */
	private void addProjectNatures() throws CoreException 
	{
		//add some more natures (Java Nature, Xtext Nature) - Modeling Nature already has been set!
		//		if (project.exists())
		//		{
		int numberOfNewNatures = 2;
		final String XTEXT_NATURE = "org.eclipse.xtext.ui.shared.xtextNature";
		String[] prevNatures = projDesc.getNatureIds(); 
		String[] newNatures = new String[prevNatures.length + numberOfNewNatures];

		System.arraycopy(prevNatures, 0, newNatures, 0, prevNatures.length);
		newNatures[newNatures.length - 1] = XTEXT_NATURE;
		newNatures[newNatures.length - numberOfNewNatures] = JavaCore.NATURE_ID;
		projDesc.setNatureIds(newNatures);
		//project.setDescription(projDesc, new NullProgressMonitor());
		//		}
	}
	/**
	 * Adds Libraries and src folder to Classpath of YAMM Project.
	 * @param monitor 
	 * 
	 * @param project
	 * @return 
	 * @throws CoreException 
	 * @throws FileNotFoundException 
	 */
	private void addLibrariesAndJarsToClasspath(IProgressMonitor monitor) throws CoreException, FileNotFoundException
	{		
		//add bin folder
		IFolder binFolder = javaProject.getProject().getFolder("bin");
		if (!binFolder.exists())
		{
			binFolder.create(false, true, null);
		}
		javaProject.setOutputLocation(binFolder.getFullPath(), null);

		// add JRE System Library to classpath
		IClasspathEntry[] jcp = org.eclipse.jdt.ui.PreferenceConstants.getDefaultJRELibrary();
		setClasspath(jcp);	 

		//add Xtend Library to classpath
		XtendLibClasspathAdder xLibAdder = new XtendLibClasspathAdder();
		xLibAdder.addLibsToClasspath(javaProject, new NullProgressMonitor());

		// add YAMM Library
		IClasspathEntry[] yammClasspathEntry = new IClasspathEntry[]{JavaCore.newContainerEntry(YAMMClasspathContainerInitializer.YAMM_LIBRARY_PATH)};
		setClasspath(yammClasspathEntry);	

		//add .src-gen folder to classpath
		addSrcGenFolder();
		
		//add src folder to class path
		addSrcFolder();
	}

	/**
	 * Adds the .src-gen folder to classpath.
	 * 
	 * @throws CoreException
	 */
	private void addSrcGenFolder() throws CoreException 
	{
		IFolder sourceFolder = project.getFolder(".src-gen");
		if(!sourceFolder.exists())
		{
			sourceFolder.create(false, true, null);
			IPackageFragmentRoot root = javaProject.getPackageFragmentRoot(sourceFolder);
			IClasspathEntry[] oldEntries = javaProject.getRawClasspath();
			IClasspathEntry[] newEntries = null;
			IClasspathEntry[] oldEntryWithoutSrc = new IClasspathEntry[oldEntries.length-1];
			boolean srcRemoved = false;
			for (int i = 0; i < oldEntries.length; i++) 
			{
				if (oldEntries[i].getPath().equals(javaProject.getPath()))
				{
					List <IClasspathEntry> entryList = new ArrayList <IClasspathEntry> (Arrays.asList(oldEntries));
					entryList.remove(i);
					entryList.toArray(oldEntryWithoutSrc);
					newEntries = new IClasspathEntry[oldEntries.length];
					System.arraycopy(oldEntryWithoutSrc, 0, newEntries, 0, oldEntryWithoutSrc.length);
					newEntries[oldEntryWithoutSrc.length] = JavaCore.newSourceEntry(root.getPath());
					srcRemoved = true;
					break;
				}
			}
			if (!srcRemoved)
			{
				newEntries = new IClasspathEntry[oldEntries.length + 1];
				System.arraycopy(oldEntries, 0, newEntries, 0, oldEntries.length);
				newEntries[oldEntries.length] = JavaCore.newSourceEntry(root.getPath());
			}

			javaProject.setRawClasspath(newEntries, null);
		}
	}

	/**
	 * Adds the source folder to classpath.
	 * 
	 * @throws CoreException
	 */
	private void addSrcFolder() throws CoreException
	{
		IFolder sourceFolder = project.getFolder("src");
		if(!sourceFolder.exists())
		{
			sourceFolder.create(false, true, null);
			IPackageFragmentRoot root = javaProject.getPackageFragmentRoot(sourceFolder);
			IClasspathEntry[] oldEntries = javaProject.getRawClasspath();
			IClasspathEntry[] newEntries = null;
			IClasspathEntry[] oldEntryWithoutSrc = new IClasspathEntry[oldEntries.length-1];
			boolean srcRemoved = false;
			for (int i = 0; i < oldEntries.length; i++) 
			{
				if (oldEntries[i].getPath().equals(javaProject.getPath()))
				{
					List <IClasspathEntry> entryList = new ArrayList <IClasspathEntry> (Arrays.asList(oldEntries));
					entryList.remove(i);
					entryList.toArray(oldEntryWithoutSrc);
					newEntries = new IClasspathEntry[oldEntries.length];
					System.arraycopy(oldEntryWithoutSrc, 0, newEntries, 0, oldEntryWithoutSrc.length);
					newEntries[oldEntryWithoutSrc.length] = JavaCore.newSourceEntry(root.getPath());
					srcRemoved = true;
					break;
				}
			}
			if (!srcRemoved)
			{
				newEntries = new IClasspathEntry[oldEntries.length + 1];
				System.arraycopy(oldEntries, 0, newEntries, 0, oldEntries.length);
				newEntries[oldEntries.length] = JavaCore.newSourceEntry(root.getPath());
			}

			javaProject.setRawClasspath(newEntries, null);
		}
	}


	public void closeSession()
	{
		session.close(new NullProgressMonitor());
	}

	/**
	 * Sets the Classpath of YAMM Project.
	 * 
	 * @param jProject
	 * @param entry
	 * @throws JavaModelException
	 */
	private void setClasspath(IClasspathEntry[] entry) throws JavaModelException {
		// add the new classpath entry to the project's existing entries
		IClasspathEntry[] oldEntries = javaProject.getRawClasspath();

		//check if an equal entry already exists
		for (int i = 0; i < oldEntries.length; i++)
		{
			if (oldEntries[i].equals(entry[0]))
			{
				return;
			}
		}


		IClasspathEntry[] newEntries = new IClasspathEntry[oldEntries.length + entry.length];
		System.arraycopy(oldEntries, 0, newEntries, 0, oldEntries.length);
		for (int i = 0; i < entry.length; i++)
		{
			newEntries[oldEntries.length + i] = entry[i];
		}
		javaProject.setRawClasspath(newEntries, null);
	}



	/**
	 * Creates an empty {@link #xYammFile} for the model's later textual representation. 
	 */
	private boolean createXYAMMFile(String yammFileName) {
		String pathToProject = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString() + projectLocation;

		if (yammFileName != null)
		{
			if (!yammFileName.endsWith(".xyamm"))
			{
				yammFileName = yammFileName + ".xyamm";
			}
			if (new File(pathToProject).exists())
			{
				xYammFile = new File(pathToProject + File.separator + yammFileName );
				try 
				{
					xYammFile.createNewFile();	
					project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
				} 
				catch (IOException | CoreException e) 
				{
					e.printStackTrace();
				}
				return true;
			}
		}
		return false;
	}

	private void createYammDiagramFile(String yammFileName, boolean isExampleModel)
	{
		final String EMPTY_PROJECT = "empty";
		String pathToProject = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString() + projectLocation;

		if (yammFileName != null)
		{
			if (yammFileName.endsWith(".yammdiagram"))
			{
				yammFileName= yammFileName.substring(0, yammFileName.lastIndexOf("."));
			}
			
			
			yammFileName = yammFileName.split(" ")[0];
			
			yammFileName = yammFileName + ".yammdiagram";
			
			if (new File(pathToProject).exists())
			{
				yammDiagramFile = new File(pathToProject + File.separator + yammFileName );
				try 
				{
					yammDiagramFile.createNewFile();	
					ResourcesPlugin.getWorkspace().getRoot().refreshLocal(0, null);
					
			        String filePath = "/home/ai/arbeit/log/wizard.txt";
			        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath));) {
			       	 bufferedWriter.append("createNewFile" + yammDiagramFile + "\n");
			        } catch (Exception e) {}

					//create a project example
					if (isExampleModel)
					{
						createExample(yammFileName);
						project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
					}
					else
						createExample(EMPTY_PROJECT);
				} 
				catch (IOException | CoreException e) 
				{
					e.printStackTrace();
				}
			}
		}
	}

}
