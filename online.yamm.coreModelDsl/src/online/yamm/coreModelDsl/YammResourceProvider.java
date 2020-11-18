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
package online.yamm.coreModelDsl;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.resource.FileExtensionProvider;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.editor.embedded.IEditedResourceProvider;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;

import com.google.inject.Inject;

public class YammResourceProvider implements IEditedResourceProvider {

	@Inject
	private IResourceSetProvider reSetPro;

	@Inject
	private FileExtensionProvider ext;

	@Inject
	private XtextResourceSet resSet;

	@Inject
	private IResourceFactory resFac;

	private String projectName;
	
	private URI modelUri;
	
	private XtextResource resource = null;
	
	public URI uri;
	@Override
	public XtextResource createResource() {
		
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot root = workspace.getRoot();
		IProject project = root.getProject(projectName);

		ResourceSet resourceSet = reSetPro.get(project);
		
		resource = (XtextResource) resSet.createResource(modelUri); //getResource(uri, true); //	

		resourceSet.getResources().add(resource);
		return resource;

	}
	
	public XtextResource getResource()
	{
		return resource;
	}
	
	public void setProjetName(String projectName) {
		this.projectName = projectName;
	}

	public void setModelUri(URI modelUri) {
		this.modelUri = modelUri;
	}

}
