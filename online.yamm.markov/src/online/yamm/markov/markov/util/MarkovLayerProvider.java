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
package online.yamm.markov.markov.util;

import java.util.List;

import org.eclipse.emf.ecore.EPackage;

import online.yamm.extensionPoints.ILayerEPackageProvider;
import online.yamm.markov.markov.MarkovFactory;
import online.yamm.markov.markov.impl.MarkovFactoryImpl;
import online.yamm.markov.markov.impl.MarkovPackageImpl;

public class MarkovLayerProvider implements ILayerEPackageProvider {

	public MarkovLayerProvider() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isProvider(String nsuri) {
		return MarkovPackageImpl.eNS_URI.equals(nsuri);
	}

	@Override
	public EPackage getEPackage() {
		MarkovFactory MarkovFactory = new MarkovFactoryImpl();
		// Obtain or create and register package
		MarkovPackageImpl theMarkovPackage = new MarkovPackageImpl(MarkovFactory);
		// Create package meta-data objects
		theMarkovPackage.createPackageContents();
		// Initialize created meta-data
		theMarkovPackage.initializePackageContents();
		
		return theMarkovPackage;
	}

	@Override
	public boolean isXtext() {
		return false;
	}

	@Override
	public String getExtension() {
		return "markov";
	}

	@Override
	public List<EPackage> getReferencedEPackages() {
		return null;
	}

}
