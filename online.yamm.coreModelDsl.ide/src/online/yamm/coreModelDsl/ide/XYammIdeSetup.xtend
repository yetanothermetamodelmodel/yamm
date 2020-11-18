/*
 * generated by Xtext 2.14.0
 */
package online.yamm.coreModelDsl.ide

import com.google.inject.Guice
import online.yamm.coreModelDsl.XYammRuntimeModule
import online.yamm.coreModelDsl.XYammStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class XYammIdeSetup extends XYammStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new XYammRuntimeModule, new XYammIdeModule))
	}
	
}
