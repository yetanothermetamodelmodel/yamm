/*
 * generated by Xtext 2.25.0
 */
package dev.yamm.coreModelDsl.ui;

import com.google.inject.Injector;
import dev.yamm.coreModelDsl.ui.internal.CoreModelDslActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class XYammExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(CoreModelDslActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		CoreModelDslActivator activator = CoreModelDslActivator.getInstance();
		return activator != null ? activator.getInjector(CoreModelDslActivator.DEV_YAMM_COREMODELDSL_XYAMM) : null;
	}

}