/*
 * generated by Xtext 2.23.0
 */
package online.yamm.coreModelDsl.ui;

import com.google.inject.Injector;
import online.yamm.coreModelDsl.ui.internal.CoreModelDslActivator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class XYammExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(CoreModelDslActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		CoreModelDslActivator activator = CoreModelDslActivator.getInstance();
		return activator != null ? activator.getInjector(CoreModelDslActivator.ONLINE_YAMM_COREMODELDSL_XYAMM) : null;
	}

}
