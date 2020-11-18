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
package online.yamm.example.dfa.dfa.util;

import java.util.List;

import org.eclipse.emf.ecore.EPackage;

import online.yamm.example.dfa.dfa.DfaFactory;
import online.yamm.example.dfa.dfa.impl.DfaFactoryImpl;
import online.yamm.example.dfa.dfa.impl.DfaPackageImpl;
import online.yamm.extensionPoints.ILayerEPackageProvider;

public class DfaLayerProvider implements ILayerEPackageProvider {
	
	@Override
	public boolean isProvider(String nsuri) {
		return DfaPackageImpl.eNS_URI.equals(nsuri);
	}

	@Override
	public EPackage getEPackage() {
		DfaFactory dfaFactory = new DfaFactoryImpl();
		// Obtain or create and register package
		DfaPackageImpl dfaPackage = new DfaPackageImpl(dfaFactory);
		// Create package meta-data objects
		dfaPackage.createPackageContents();
		// Initialize created meta-data
		dfaPackage.initializePackageContents();
		
		return dfaPackage;
	}

	@Override
	public boolean isXtext() {
		return false;
	}

	@Override
	public String getExtension() {
		return "dfa";
	}

	@Override
	public List<EPackage> getReferencedEPackages() {
		return null;
	}

}
