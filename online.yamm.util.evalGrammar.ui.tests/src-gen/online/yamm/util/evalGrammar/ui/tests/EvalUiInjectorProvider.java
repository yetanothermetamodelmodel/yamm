/*
 * generated by Xtext 2.24.0.M1
 */
package online.yamm.util.evalGrammar.ui.tests;

import com.google.inject.Injector;
import online.yamm.util.evalGrammar.ui.internal.EvalGrammarActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class EvalUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return EvalGrammarActivator.getInstance().getInjector("online.yamm.util.evalGrammar.Eval");
	}

}
