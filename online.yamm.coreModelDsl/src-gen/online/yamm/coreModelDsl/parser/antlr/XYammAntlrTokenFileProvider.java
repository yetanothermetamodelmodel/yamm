/*
 * generated by Xtext 2.23.0
 */
package online.yamm.coreModelDsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class XYammAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("online/yamm/coreModelDsl/parser/antlr/internal/InternalXYamm.tokens");
	}
}
