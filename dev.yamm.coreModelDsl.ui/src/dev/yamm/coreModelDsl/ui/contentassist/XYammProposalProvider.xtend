/*
 * generated by Xtext 2.14.0
 */
package dev.yamm.coreModelDsl.ui.contentassist

import java.lang.reflect.Field
import java.util.ArrayList
import java.util.Set
import org.eclipse.xtext.ui.editor.contentassist.CompletionProposalComputer
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
class XYammProposalProvider extends AbstractXYammProposalProvider {

	override void createProposals(ContentAssistContext context, ICompletionProposalAcceptor acceptor) {

		super.createProposals(context, acceptor)

		var Set<ConfigurableCompletionProposal> proposals

		var Field f = CompletionProposalComputer.getDeclaredField("proposals");
		f.setAccessible(true);
		var iWantThis = f.get(acceptor);
		if (iWantThis instanceof Set) {
			proposals = iWantThis
		}

		if (proposals != null) {
			var notValidProposals = new ArrayList
			for (proposal : proposals) {
				if (proposal.toString.contains("effectTransition") ||
					proposal.toString.contains("guardTransition"))
					notValidProposals.add(proposal);
			}
			proposals.removeAll(notValidProposals)

		}

	}

}