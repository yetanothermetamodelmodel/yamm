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
package online.yamm.buildpath;

/**
 * Stores YAMM model examples. <br>
 * When a new YAMM example project has been created by means of the {@link online.yamm.gui.YAMMWizard}
 * the specified model is loaded as a String into the *.yamm file created in 
 * {@link YAMMProjectCreator #createYammProject(String, String)}.
 */
public class YAMMExampleProjectStore 
{
	public static String geldautomatExample() {
		return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n" + 
				"<yammDiagram:YModel xmi:version=\"2.0\" xmlns:xmi=\"http://www.omg.org/XMI\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:yammDiagram=\"http://www.yamm.online/coreModelDiagram/YammDiagram\">\r\n" + 
				"  <clazz ObjectID=\"f5e24a2\" name=\"RObject\">\r\n" + 
				"    <ownedAttribute ObjectID=\"f2bd771\" name=\"rContainer\" type=\"//@clazz.0\" clazz=\"//@clazz.0\" />\r\n" + 
				"    <ownedAttribute ObjectID=\"f55ebef\" name=\"yClass\" type=\"//@packages.0/@ownedMemberPackage.4\" clazz=\"//@clazz.0\" />\r\n" + 
				"    <ownedAttribute ObjectID=\"fbb4ab\" name=\"ObjectID\" type=\"//@packages.0/@ownedMemberPackage.3\" clazz=\"//@clazz.0\" />\r\n" + 
				"  </clazz>\r\n" + 
				"  <clazz ObjectID=\"f4cc70d\" name=\"YClass\" superClass=\"//@clazz.0\"/>\r\n" + 
				"  <clazz ObjectID=\"f5ef7f2\" name=\"Geldautomat\" superClass=\"//@clazz.0\">\r\n" + 
				"    <ownedAttribute ObjectID=\"f10f2da\" name=\"geheimzahl\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@clazz.2\" />\r\n" + 
				"    <ownedAttribute ObjectID=\"f3cca8e\" name=\"betrag\" type=\"//@packages.0/@ownedMemberPackage.1\" clazz=\"//@clazz.2\" />\r\n" + 
				"    <ownedAttribute ObjectID=\"f7be745\" name=\"kunde\" association=\"true\" type=\"//@clazz.3\" opposite=\"//@clazz.3/@ownedAttribute.0\" clazz=\"//@clazz.2\" />\r\n" + 
				"    <ownedAttribute ObjectID=\"f48748f\" name=\"karte\" association=\"true\" type=\"//@clazz.4\" clazz=\"//@clazz.2\" />\r\n" + 
				"    <ownedAttribute ObjectID=\"f1258b3\" name=\"event\" association=\"true\" type=\"//@clazz.5\" clazz=\"//@clazz.2\" />\r\n" + 
				"    <ownedOperation ObjectID=\"f22a851\" name=\"run\" clazz=\"//@clazz.2\">\r\n" + 
				"      <stateMachine ObjectID=\"f76b935\" name=\"YStateMachinef76b935\" rtc=\"statemachine\">\r\n" + 
				"        <transition ObjectID=\"f2422d4\" name=\"YTransitionf2422d4\" source=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.2\" target=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@clazz.2/@ownedOperation.0/@stateMachine/@trAttach.0\"/>\r\n" + 
				"        <transition ObjectID=\"f1626b3\" name=\"YTransitionf1626b3\" source=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.8\" attachment=\"//@clazz.2/@ownedOperation.0/@stateMachine/@trAttach.1\"/>\r\n" + 
				"        <transition ObjectID=\"f4a6996\" name=\"YTransitionf4a6996\" source=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.3\" target=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.2\" attachment=\"//@clazz.2/@ownedOperation.0/@stateMachine/@trAttach.2\"/>\r\n" + 
				"        <transition ObjectID=\"f2f5237\" name=\"YTransitionf2f5237\" source=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.3\" target=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.4\" attachment=\"//@clazz.2/@ownedOperation.0/@stateMachine/@trAttach.3\"/>\r\n" + 
				"        <transition ObjectID=\"f37e9d7\" name=\"YTransitionf37e9d7\" source=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.4\" target=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.5\" attachment=\"//@clazz.2/@ownedOperation.0/@stateMachine/@trAttach.4\"/>\r\n" + 
				"        <transition ObjectID=\"f131789\" name=\"YTransitionf131789\" source=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.5\" target=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.6\" attachment=\"//@clazz.2/@ownedOperation.0/@stateMachine/@trAttach.5\"/>\r\n" + 
				"        <transition ObjectID=\"f1b8ba6\" name=\"YTransitionf1b8ba6\" source=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.6\" target=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.7\" attachment=\"//@clazz.2/@ownedOperation.0/@stateMachine/@trAttach.6\"/>\r\n" + 
				"        <transition ObjectID=\"f33997e\" name=\"YTransitionf33997e\" source=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.7\" target=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.2\" attachment=\"//@clazz.2/@ownedOperation.0/@stateMachine/@trAttach.7\"/>\r\n" + 
				"        <transition ObjectID=\"f23d2d0\" name=\"YTransitionf23d2d0\" source=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.5\" target=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.4\" attachment=\"//@clazz.2/@ownedOperation.0/@stateMachine/@trAttach.8\"/>\r\n" + 
				"        <transition ObjectID=\"f3dbccb\" name=\"YTransitionf3dbccb\" source=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.7\" target=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.6\" attachment=\"//@clazz.2/@ownedOperation.0/@stateMachine/@trAttach.9\"/>\r\n" + 
				"        <transition ObjectID=\"f247e9\" name=\"YTransitionf247e9\" source=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.5\" target=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.2\" attachment=\"//@clazz.2/@ownedOperation.0/@stateMachine/@trAttach.10\"/>\r\n" + 
				"        <transition ObjectID=\"f385560\" name=\"YTransitionf385560\" source=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.2\" target=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.3\" attachment=\"//@clazz.2/@ownedOperation.0/@stateMachine/@trAttach.11\"/>\r\n" + 
				"        <transition ObjectID=\"f4c34b3\" name=\"YTransitionf4c34b3\" source=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.8\" target=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.2\" attachment=\"//@clazz.2/@ownedOperation.0/@stateMachine/@trAttach.12\"/>\r\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f3f9d44\" name=\"YPseudostatef3f9d44\" outgoing=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.1\"/>\r\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f73af7b\" name=\"YFinalStatef73af7b\" incoming=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.0\"/>\r\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f676118\" name=\"YStatef676118\" outgoing=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.0 //@clazz.2/@ownedOperation.0/@stateMachine/@transition.11\" incoming=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.7 //@clazz.2/@ownedOperation.0/@stateMachine/@transition.10 //@clazz.2/@ownedOperation.0/@stateMachine/@transition.12 //@clazz.2/@ownedOperation.0/@stateMachine/@transition.2\"/>\r\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f65a9db\" name=\"YStatef65a9db\" outgoing=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.3 //@clazz.2/@ownedOperation.0/@stateMachine/@transition.2\" incoming=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.11\"/>\r\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f617ed6\" name=\"YStatef617ed6\" outgoing=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.4\" incoming=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.3 //@clazz.2/@ownedOperation.0/@stateMachine/@transition.8\"/>\r\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f3d9b5b\" name=\"YStatef3d9b5b\" outgoing=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.5 //@clazz.2/@ownedOperation.0/@stateMachine/@transition.8 //@clazz.2/@ownedOperation.0/@stateMachine/@transition.10\" incoming=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.4\"/>\r\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f2ceeb5\" name=\"YStatef2ceeb5\" outgoing=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.6\" incoming=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.5 //@clazz.2/@ownedOperation.0/@stateMachine/@transition.9\"/>\r\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f46c73c\" name=\"YStatef46c73c\" outgoing=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.7 //@clazz.2/@ownedOperation.0/@stateMachine/@transition.9\" incoming=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.6\"/>\r\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f7ef010\" name=\"YStatef7ef010\" outgoing=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.12\" incoming=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.1\"/>\r\n" + 
				"        <trAttach ObjectID=\"f49a043\" name=\"YTrAttachmentf49a043\" transition=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.0\" guardStringRep=\"kunde == null;&#xA;\"/>\r\n" + 
				"        <trAttach ObjectID=\"f43b7d9\" name=\"YTrAttachmentf43b7d9\" transition=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.1\" guardStringRep=\"kunde != null;&#xA;\"/>\r\n" + 
				"        <trAttach ObjectID=\"f77a009\" name=\"YTrAttachmentf77a009\" transition=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.2\" guardStringRep=\"karte.fehlversuche >= 3;&#xA;\">\r\n" + 
				"          <effects ObjectID=\"f4333af\" effectStringRep=\"event.event = Events.fuer_kunde_bereit;&#xA;\"/>\r\n" + 
				"        </trAttach>\r\n" + 
				"        <trAttach ObjectID=\"faf677\" name=\"YTrAttachmentfaf677\" transition=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.3\" guardStringRep=\"karte.fehlversuche &lt; 3;&#xA;\">\r\n" + 
				"          <effects ObjectID=\"f79185\" effectStringRep=\"event.event =  Events.fuer_kunde_wartenAufGeheimzahl;&#xA;\"/>\r\n" + 
				"        </trAttach>\r\n" + 
				"        <trAttach ObjectID=\"f5b5efc\" name=\"YTrAttachmentf5b5efc\" transition=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.4\" guardStringRep=\"event.event == Events.fuer_automat_geheimzahlEingetippt;&#xA;\">\r\n" + 
				"          <effects ObjectID=\"fd2e6a\" effectStringRep=\"event.event = null;&#xA;\"/>\r\n" + 
				"        </trAttach>\r\n" + 
				"        <trAttach ObjectID=\"f7e03f\" name=\"YTrAttachmentf7e03f\" transition=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.5\" guardStringRep=\"geheimzahl == karte.geheimzahl;&#xA;\">\r\n" + 
				"          <effects ObjectID=\"f3bb254\" effectStringRep=\"event.event = Events.fuer_kunde_wartenAufBetrag;&#xA;\"/>\r\n" + 
				"        </trAttach>\r\n" + 
				"        <trAttach ObjectID=\"f49d89\" name=\"YTrAttachmentf49d89\" transition=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.6\" guardStringRep=\"event.event == Events.fuer_automat_betragEingetippt;&#xA;\">\r\n" + 
				"          <effects ObjectID=\"f3b85bc\" effectStringRep=\"event.event = null;&#xA;\"/>\r\n" + 
				"        </trAttach>\r\n" + 
				"        <trAttach ObjectID=\"f49760a\" name=\"YTrAttachmentf49760a\" transition=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.7\" guardStringRep=\"betrag &lt;= karte.saldo;&#xA;\">\r\n" + 
				"          <effects ObjectID=\"f2a3c22\" effectStringRep=\"karte.saldo = karte.saldo - betrag;&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f1ec140\" effectStringRep=\"event.event = Events.fuer_kunde_bereit;&#xA;\"/>\r\n" + 
				"        </trAttach>\r\n" + 
				"        <trAttach ObjectID=\"f4e3e30\" name=\"YTrAttachmentf4e3e30\" transition=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.8\" guardStringRep=\"geheimzahl != karte.geheimzahl &amp;&amp; karte.fehlversuche &lt; 3;&#xA;\">\r\n" + 
				"          <effects ObjectID=\"f44d4bc\" effectStringRep=\"karte.fehlversuche++;&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f795299\" effectStringRep=\"event.event = Events.fuer_kunde_wartenAufGeheimzahl;&#xA;\"/>\r\n" + 
				"        </trAttach>\r\n" + 
				"        <trAttach ObjectID=\"f36685a\" name=\"YTrAttachmentf36685a\" transition=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.9\" guardStringRep=\"betrag > karte.saldo;&#xA;\">\r\n" + 
				"          <effects ObjectID=\"f1d8983\" effectStringRep=\"event.event = Events.fuer_kunde_wartenAufBetrag;&#xA;\"/>\r\n" + 
				"        </trAttach>\r\n" + 
				"        <trAttach ObjectID=\"f5dbec8\" name=\"YTrAttachmentf5dbec8\" transition=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.10\" guardStringRep=\"geheimzahl != karte.geheimzahl &amp;&amp; karte.fehlversuche >= 3;&#xA;\">\r\n" + 
				"          <effects ObjectID=\"f58edce\" effectStringRep=\"event.event = Events.fuer_kunde_bereit;&#xA;\"/>\r\n" + 
				"        </trAttach>\r\n" + 
				"        <trAttach ObjectID=\"f387dfa\" name=\"YTrAttachmentf387dfa\" transition=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.11\" guardStringRep=\"event.event == Events.fuer_automat_karteEingefuegt;&#xA;\">\r\n" + 
				"          <effects ObjectID=\"f37ce6a\" effectStringRep=\"event.event = null;&#xA;\"/>\r\n" + 
				"        </trAttach>\r\n" + 
				"        <trAttach ObjectID=\"f6b7371\" name=\"YTrAttachmentf6b7371\" transition=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.12\" guardStringRep=\"true;\">\r\n" + 
				"          <effects ObjectID=\"f6e8c0b\" effectStringRep=\"event.event = Events.fuer_kunde_bereit;&#xA;\"/>\r\n" + 
				"        </trAttach>\r\n" + 
				"      </stateMachine>\r\n" + 
				"    </ownedOperation>\r\n" + 
				"  </clazz>\r\n" + 
				"  <clazz ObjectID=\"f6f61bc\" name=\"Kunde\" superClass=\"//@clazz.0\">\r\n" + 
				"    <ownedAttribute ObjectID=\"f320919\" name=\"automat\" association=\"true\" type=\"//@clazz.2\" opposite=\"//@clazz.2/@ownedAttribute.2\" clazz=\"//@clazz.3\" />\r\n" + 
				"    <ownedAttribute ObjectID=\"fa47d8\" name=\"karte\" association=\"true\" type=\"//@clazz.4\" clazz=\"//@clazz.3\" />\r\n" + 
				"    <ownedAttribute ObjectID=\"f162e93\" name=\"karteEinlegen\" type=\"//@packages.0/@ownedMemberPackage.2\" clazz=\"//@clazz.3\" visibility=\"private\" />\r\n" + 
				"    <ownedAttribute ObjectID=\"f4b2aea\" name=\"event\" association=\"true\" type=\"//@clazz.5\" clazz=\"//@clazz.3\" />\r\n" + 
				"    <ownedOperation ObjectID=\"f755543\" name=\"run\" clazz=\"//@clazz.3\">\r\n" + 
				"      <stateMachine ObjectID=\"f1418b3\" name=\"YStateMachinef1418b3\" rtc=\"statemachine\">\r\n" + 
				"        <transition ObjectID=\"f723ae2\" name=\"YTransitionf723ae2\" source=\"//@clazz.3/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@clazz.3/@ownedOperation.0/@stateMachine/@subvertex.2\" attachment=\"//@clazz.3/@ownedOperation.0/@stateMachine/@trAttach.0\"/>\r\n" + 
				"        <transition ObjectID=\"f33b2a4\" name=\"YTransitionf33b2a4\" source=\"//@clazz.3/@ownedOperation.0/@stateMachine/@subvertex.2\" target=\"//@clazz.3/@ownedOperation.0/@stateMachine/@subvertex.3\" attachment=\"//@clazz.3/@ownedOperation.0/@stateMachine/@trAttach.1\"/>\r\n" + 
				"        <transition ObjectID=\"f2eb476\" name=\"YTransitionf2eb476\" source=\"//@clazz.3/@ownedOperation.0/@stateMachine/@subvertex.3\" target=\"//@clazz.3/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@clazz.3/@ownedOperation.0/@stateMachine/@trAttach.2\"/>\r\n" + 
				"        <transition ObjectID=\"f6e0569\" name=\"YTransitionf6e0569\" source=\"//@clazz.3/@ownedOperation.0/@stateMachine/@subvertex.3\" target=\"//@clazz.3/@ownedOperation.0/@stateMachine/@subvertex.4\" attachment=\"//@clazz.3/@ownedOperation.0/@stateMachine/@trAttach.3\"/>\r\n" + 
				"        <transition ObjectID=\"f264ccc\" name=\"YTransitionf264ccc\" source=\"//@clazz.3/@ownedOperation.0/@stateMachine/@subvertex.4\" target=\"//@clazz.3/@ownedOperation.0/@stateMachine/@subvertex.5\" attachment=\"//@clazz.3/@ownedOperation.0/@stateMachine/@trAttach.4\"/>\r\n" + 
				"        <transition ObjectID=\"f1d4547\" name=\"YTransitionf1d4547\" source=\"//@clazz.3/@ownedOperation.0/@stateMachine/@subvertex.5\" target=\"//@clazz.3/@ownedOperation.0/@stateMachine/@subvertex.6\" attachment=\"//@clazz.3/@ownedOperation.0/@stateMachine/@trAttach.5\"/>\r\n" + 
				"        <transition ObjectID=\"f456505\" name=\"YTransitionf456505\" source=\"//@clazz.3/@ownedOperation.0/@stateMachine/@subvertex.6\" target=\"//@clazz.3/@ownedOperation.0/@stateMachine/@subvertex.5\" attachment=\"//@clazz.3/@ownedOperation.0/@stateMachine/@trAttach.6\"/>\r\n" + 
				"        <transition ObjectID=\"f1ad8cf\" name=\"YTransitionf1ad8cf\" source=\"//@clazz.3/@ownedOperation.0/@stateMachine/@subvertex.5\" target=\"//@clazz.3/@ownedOperation.0/@stateMachine/@subvertex.4\" attachment=\"//@clazz.3/@ownedOperation.0/@stateMachine/@trAttach.7\"/>\r\n" + 
				"        <transition ObjectID=\"f2e26de\" name=\"YTransitionf2e26de\" source=\"//@clazz.3/@ownedOperation.0/@stateMachine/@subvertex.4\" target=\"//@clazz.3/@ownedOperation.0/@stateMachine/@subvertex.2\" attachment=\"//@clazz.3/@ownedOperation.0/@stateMachine/@trAttach.8\"/>\r\n" + 
				"        <transition ObjectID=\"f7a91b8\" name=\"YTransitionf7a91b8\" source=\"//@clazz.3/@ownedOperation.0/@stateMachine/@subvertex.5\" target=\"//@clazz.3/@ownedOperation.0/@stateMachine/@subvertex.2\" attachment=\"//@clazz.3/@ownedOperation.0/@stateMachine/@trAttach.9\"/>\r\n" + 
				"        <transition ObjectID=\"f213a9a\" name=\"YTransitionf213a9a\" source=\"//@clazz.3/@ownedOperation.0/@stateMachine/@subvertex.6\" target=\"//@clazz.3/@ownedOperation.0/@stateMachine/@subvertex.2\" attachment=\"//@clazz.3/@ownedOperation.0/@stateMachine/@trAttach.10\"/>\r\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f137349\" name=\"YPseudostatef137349\" outgoing=\"//@clazz.3/@ownedOperation.0/@stateMachine/@transition.0\"/>\r\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f34fb79\" name=\"YFinalStatef34fb79\" incoming=\"//@clazz.3/@ownedOperation.0/@stateMachine/@transition.2\"/>\r\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f7bf539\" name=\"YStatef7bf539\" outgoing=\"//@clazz.3/@ownedOperation.0/@stateMachine/@transition.1\" incoming=\"//@clazz.3/@ownedOperation.0/@stateMachine/@transition.0 //@clazz.3/@ownedOperation.0/@stateMachine/@transition.8 //@clazz.3/@ownedOperation.0/@stateMachine/@transition.10 //@clazz.3/@ownedOperation.0/@stateMachine/@transition.9\"/>\r\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"fa79b2\" name=\"YStatefa79b2\" outgoing=\"//@clazz.3/@ownedOperation.0/@stateMachine/@transition.2 //@clazz.3/@ownedOperation.0/@stateMachine/@transition.3\" incoming=\"//@clazz.3/@ownedOperation.0/@stateMachine/@transition.1\"/>\r\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f46d329\" name=\"YStatef46d329\" outgoing=\"//@clazz.3/@ownedOperation.0/@stateMachine/@transition.4 //@clazz.3/@ownedOperation.0/@stateMachine/@transition.8\" incoming=\"//@clazz.3/@ownedOperation.0/@stateMachine/@transition.3 //@clazz.3/@ownedOperation.0/@stateMachine/@transition.7\"/>\r\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f484b12\" name=\"YStatef484b12\" outgoing=\"//@clazz.3/@ownedOperation.0/@stateMachine/@transition.5 //@clazz.3/@ownedOperation.0/@stateMachine/@transition.7 //@clazz.3/@ownedOperation.0/@stateMachine/@transition.9\" incoming=\"//@clazz.3/@ownedOperation.0/@stateMachine/@transition.4 //@clazz.3/@ownedOperation.0/@stateMachine/@transition.6\"/>\r\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"ff5622\" name=\"YStateff5622\" outgoing=\"//@clazz.3/@ownedOperation.0/@stateMachine/@transition.6 //@clazz.3/@ownedOperation.0/@stateMachine/@transition.10\" incoming=\"//@clazz.3/@ownedOperation.0/@stateMachine/@transition.5\"/>\r\n" + 
				"        <trAttach ObjectID=\"fcf91a\" name=\"YTrAttachmentfcf91a\" transition=\"//@clazz.3/@ownedOperation.0/@stateMachine/@transition.0\" guardStringRep=\"event.event == Events.fuer_kunde_bereit;&#xA;\">\r\n" + 
				"          <effects ObjectID=\"fb2561\" effectStringRep=\"event.event = null;&#xA;\"/>\r\n" + 
				"        </trAttach>\r\n" + 
				"        <trAttach ObjectID=\"f46e8fa\" name=\"YTrAttachmentf46e8fa\" transition=\"//@clazz.3/@ownedOperation.0/@stateMachine/@transition.1\" guardStringRep=\"true;\">\r\n" + 
				"          <effects ObjectID=\"f72cc30\" effectStringRep=\"karteEinlegen = YammInput.booleanDialog(&quot;karte Einlegen?&quot;);&#xA;\"/>\r\n" + 
				"        </trAttach>\r\n" + 
				"        <trAttach ObjectID=\"f82029\" name=\"YTrAttachmentf82029\" transition=\"//@clazz.3/@ownedOperation.0/@stateMachine/@transition.2\" guardStringRep=\"karteEinlegen == false;&#xA;\">\r\n" + 
				"          <effects ObjectID=\"f4becdd\" effectStringRep=\"automat.kunde = null;&#xA;\"/>\r\n" + 
				"        </trAttach>\r\n" + 
				"        <trAttach ObjectID=\"f613741\" name=\"YTrAttachmentf613741\" transition=\"//@clazz.3/@ownedOperation.0/@stateMachine/@transition.3\" guardStringRep=\"karteEinlegen == true;&#xA;\">\r\n" + 
				"          <effects ObjectID=\"f4aa220\" effectStringRep=\"automat.karte = karte;&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f425398\" effectStringRep=\"event.event = Events.fuer_automat_karteEingefuegt;&#xA;\"/>\r\n" + 
				"        </trAttach>\r\n" + 
				"        <trAttach ObjectID=\"fc6323\" name=\"YTrAttachmentfc6323\" transition=\"//@clazz.3/@ownedOperation.0/@stateMachine/@transition.4\" guardStringRep=\"event.event == Events.fuer_kunde_wartenAufGeheimzahl;&#xA;\">\r\n" + 
				"          <effects ObjectID=\"f73a81a\" effectStringRep=\"event.event = null;&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f6fd025\" effectStringRep=\"automat.geheimzahl = YammInput.integerDialog(&quot;Geheimzahl&quot;);&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f232622\" effectStringRep=\"event.event = Events.fuer_automat_geheimzahlEingetippt;&#xA;\"/>\r\n" + 
				"        </trAttach>\r\n" + 
				"        <trAttach ObjectID=\"f78ddaf\" name=\"YTrAttachmentf78ddaf\" transition=\"//@clazz.3/@ownedOperation.0/@stateMachine/@transition.5\" guardStringRep=\"event.event == Events.fuer_kunde_wartenAufBetrag;&#xA;\">\r\n" + 
				"          <effects ObjectID=\"f91a2a\" effectStringRep=\"event.event = null;&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f78270a\" effectStringRep=\"automat.betrag = YammInput.doubleDialog(&quot;Betrag&quot;);&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f5d66f9\" effectStringRep=\"event.event = Events.fuer_automat_betragEingetippt;&#xA;\"/>\r\n" + 
				"        </trAttach>\r\n" + 
				"        <trAttach ObjectID=\"f11e0a4\" name=\"YTrAttachmentf11e0a4\" transition=\"//@clazz.3/@ownedOperation.0/@stateMachine/@transition.6\" guardStringRep=\"event.event == Events.fuer_kunde_wartenAufBetrag;&#xA;\"/>\r\n" + 
				"        <trAttach ObjectID=\"f2969e0\" name=\"YTrAttachmentf2969e0\" transition=\"//@clazz.3/@ownedOperation.0/@stateMachine/@transition.7\" guardStringRep=\"event.event == Events.fuer_kunde_wartenAufGeheimzahl;&#xA;\"/>\r\n" + 
				"        <trAttach ObjectID=\"f20f37\" name=\"YTrAttachmentf20f37\" transition=\"//@clazz.3/@ownedOperation.0/@stateMachine/@transition.8\" guardStringRep=\"event.event == Events.fuer_kunde_bereit;&#xA;\">\r\n" + 
				"          <effects ObjectID=\"f550a1c\" effectStringRep=\"event.event = null;&#xA;\"/>\r\n" + 
				"        </trAttach>\r\n" + 
				"        <trAttach ObjectID=\"f759fe3\" name=\"YTrAttachmentf759fe3\" transition=\"//@clazz.3/@ownedOperation.0/@stateMachine/@transition.9\" guardStringRep=\"event.event == Events.fuer_kunde_bereit;&#xA;\">\r\n" + 
				"          <effects ObjectID=\"f29e326\" effectStringRep=\"event.event = null;&#xA;\"/>\r\n" + 
				"        </trAttach>\r\n" + 
				"        <trAttach ObjectID=\"f78a9b4\" name=\"YTrAttachmentf78a9b4\" transition=\"//@clazz.3/@ownedOperation.0/@stateMachine/@transition.10\" guardStringRep=\"event.event == Events.fuer_kunde_bereit;&#xA;\">\r\n" + 
				"          <effects ObjectID=\"f425f36\" effectStringRep=\"event.event = null;&#xA;\"/>\r\n" + 
				"        </trAttach>\r\n" + 
				"      </stateMachine>\r\n" + 
				"    </ownedOperation>\r\n" + 
				"  </clazz>\r\n" + 
				"  <clazz ObjectID=\"f529cb7\" name=\"Geldkarte\" superClass=\"//@clazz.0\">\r\n" + 
				"    <ownedAttribute ObjectID=\"f1586a4\" name=\"fehlversuche\" defaultValue=\"&quot;0&quot;\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@clazz.4\" />\r\n" + 
				"    <ownedAttribute ObjectID=\"f64553d\" name=\"geheimzahl\" defaultValue=\"&quot;1234&quot;\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@clazz.4\" />\r\n" + 
				"    <ownedAttribute ObjectID=\"feccb9\" name=\"saldo\" defaultValue=\"&quot;1000&quot;\" type=\"//@packages.0/@ownedMemberPackage.1\" clazz=\"//@clazz.4\" />\r\n" + 
				"  </clazz>\r\n" + 
				"  <clazz ObjectID=\"f3ed2b5\" name=\"NaechsterEvent\" superClass=\"//@clazz.0\">\r\n" + 
				"    <ownedAttribute ObjectID=\"f13d9db\" name=\"event\" type=\"//@enumerations.0\" clazz=\"//@clazz.5\" />\r\n" + 
				"  </clazz>\r\n" + 
				"  <clazz ObjectID=\"f5daf9\" name=\"StartAutomatThread\" superClass=\"//@clazz.0\">\r\n" + 
				"    <ownedAttribute ObjectID=\"f5f3c5c\" name=\"kunde\" type=\"//@clazz.3\" clazz=\"//@clazz.6\" />\r\n" + 
				"    <ownedAttribute ObjectID=\"f5ebe32\" name=\"automat\" type=\"//@clazz.2\" clazz=\"//@clazz.6\" />\r\n" + 
				"    <ownedOperation ObjectID=\"f72298f\" name=\"start\" clazz=\"//@clazz.6\">\r\n" + 
				"      <stateMachine ObjectID=\"f76002\" name=\"YStateMachinef76002\" initialActive=\"true\" rtc=\"statemachine\">\r\n" + 
				"        <transition ObjectID=\"f21da52\" name=\"YTransitionf21da52\" source=\"//@clazz.6/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@clazz.6/@ownedOperation.0/@stateMachine/@subvertex.2\" attachment=\"//@clazz.6/@ownedOperation.0/@stateMachine/@trAttach.0\"/>\r\n" + 
				"        <transition ObjectID=\"f14315d\" name=\"YTransitionf14315d\" source=\"//@clazz.6/@ownedOperation.0/@stateMachine/@subvertex.2\" target=\"//@clazz.6/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@clazz.6/@ownedOperation.0/@stateMachine/@trAttach.1\"/>\r\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f57e241\" name=\"YPseudostatef57e241\" outgoing=\"//@clazz.6/@ownedOperation.0/@stateMachine/@transition.0\"/>\r\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f2e72e0\" name=\"YFinalStatef2e72e0\" incoming=\"//@clazz.6/@ownedOperation.0/@stateMachine/@transition.1\"/>\r\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f4549df\" name=\"YStatef4549df\" outgoing=\"//@clazz.6/@ownedOperation.0/@stateMachine/@transition.1\" incoming=\"//@clazz.6/@ownedOperation.0/@stateMachine/@transition.0\"/>\r\n" + 
				"        <trAttach ObjectID=\"f127d38\" name=\"YTrAttachmentf127d38\" transition=\"//@clazz.6/@ownedOperation.0/@stateMachine/@transition.0\" guardStringRep=\"true;\">\r\n" + 
				"          <effects ObjectID=\"f59262a\" effectStringRep=\"automat = new Geldautomat;&#xA;\"/>\r\n" + 
				"        </trAttach>\r\n" + 
				"        <trAttach ObjectID=\"f5920fa\" name=\"YTrAttachmentf5920fa\" transition=\"//@clazz.6/@ownedOperation.0/@stateMachine/@transition.1\" guardStringRep=\"!(getInstances(1, &quot;Kunde&quot;) as java.util.List&lt;Kunde>).empty;&#xA;\">\r\n" + 
				"          <effects ObjectID=\"f3bd2b4\" effectStringRep=\"kunde = (getInstances(1, &quot;Kunde&quot;) as java.util.List&lt;Kunde>).get(0);&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f5bbf54\" effectStringRep=\"automat.kunde = kunde;&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f61d51e\" effectStringRep=\"automat.event = new NaechsterEvent;&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f71d51e\" effectStringRep=\"kunde.event = automat.event;&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f7817e9\" effectStringRep=\"automat.run;&#xA;\"/>\r\n" + 
				"        </trAttach>\r\n" + 
				"      </stateMachine>\r\n" + 
				"    </ownedOperation>\r\n" + 
				"  </clazz>\r\n" + 
				"  <clazz ObjectID=\"f138f37\" name=\"StartKundeThread\" superClass=\"//@clazz.0\">\r\n" + 
				"    <ownedAttribute ObjectID=\"f40d707\" name=\"automat\" type=\"//@clazz.2\" clazz=\"//@clazz.6\" />\r\n" + 
				"    <ownedAttribute ObjectID=\"f4813b7\" name=\"kunde\" type=\"//@clazz.3\" clazz=\"//@clazz.6\" />\r\n" + 
				"    <ownedOperation ObjectID=\"f460185\" name=\"start\" clazz=\"//@clazz.7\">\r\n" + 
				"      <stateMachine ObjectID=\"f52a94a\" name=\"YStateMachinef52a94a\" initialActive=\"true\" rtc=\"statemachine\">\r\n" + 
				"        <transition ObjectID=\"f368dd8\" name=\"YTransitionf368dd8\" source=\"//@clazz.7/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@clazz.7/@ownedOperation.0/@stateMachine/@subvertex.2\" attachment=\"//@clazz.7/@ownedOperation.0/@stateMachine/@trAttach.0\"/>\r\n" + 
				"        <transition ObjectID=\"f232554\" name=\"YTransitionf232554\" source=\"//@clazz.7/@ownedOperation.0/@stateMachine/@subvertex.2\" target=\"//@clazz.7/@ownedOperation.0/@stateMachine/@subvertex.3\" attachment=\"//@clazz.7/@ownedOperation.0/@stateMachine/@trAttach.1\"/>\r\n" + 
				"        <transition ObjectID=\"f5975e6\" name=\"YTransitionf5975e6\" source=\"//@clazz.7/@ownedOperation.0/@stateMachine/@subvertex.3\" target=\"//@clazz.7/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@clazz.7/@ownedOperation.0/@stateMachine/@trAttach.2\"/>\r\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f90976\" name=\"YPseudostatef90976\" outgoing=\"//@clazz.7/@ownedOperation.0/@stateMachine/@transition.0\"/>\r\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f7aab9\" name=\"YFinalStatef7aab9\" incoming=\"//@clazz.7/@ownedOperation.0/@stateMachine/@transition.2\"/>\r\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f6a1b23\" name=\"YStatef6a1b23\" outgoing=\"//@clazz.7/@ownedOperation.0/@stateMachine/@transition.1\" incoming=\"//@clazz.7/@ownedOperation.0/@stateMachine/@transition.0\"/>\r\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f35000b\" name=\"YStatef35000b\" outgoing=\"//@clazz.7/@ownedOperation.0/@stateMachine/@transition.2\" incoming=\"//@clazz.7/@ownedOperation.0/@stateMachine/@transition.1\"/>\r\n" + 
				"        <trAttach ObjectID=\"f477739\" name=\"YTrAttachmentf477739\" transition=\"//@clazz.7/@ownedOperation.0/@stateMachine/@transition.0\" guardStringRep=\"true;\">\r\n" + 
				"          <effects ObjectID=\"f642862\" effectStringRep=\"kunde = new Kunde;&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f305391\" effectStringRep=\"kunde.karte = new Geldkarte;&#xA;\"/>\r\n" + 
				"        </trAttach>\r\n" + 
				"        <trAttach ObjectID=\"f27c4ed\" name=\"YTrAttachmentf27c4ed\" transition=\"//@clazz.7/@ownedOperation.0/@stateMachine/@transition.1\" guardStringRep=\"!(getInstances(1, &quot;Geldautomat&quot;) as java.util.List&lt;Geldautomat>).isEmpty;&#xA;\"/>\r\n" + 
				"        <trAttach ObjectID=\"f446fb4\" name=\"YTrAttachmentf446fb4\" transition=\"//@clazz.7/@ownedOperation.0/@stateMachine/@transition.2\" guardStringRep=\"automat = (getInstances(1, &quot;Geldautomat&quot;) as java.util.List&lt;Geldautomat>).get(0);&#xA;&#xA;automat.kunde !=null &amp;&amp; automat.event != null &amp;&amp; kunde.event != null;&#xA;\">\r\n" + 
				"          <effects ObjectID=\"f21467d\" effectStringRep=\"kunde.run;&#xA;\"/>\r\n" + 
				"        </trAttach>\r\n" + 
				"      </stateMachine>\r\n" + 
				"    </ownedOperation>\r\n" + 
				"  </clazz>\r\n" + 
				"  <enumerations ObjectID=\"f19d410\" name=\"Events\">\r\n" + 
				"    <ownedLiteral ObjectID=\"f36431c\" name=\"fuer_kunde_wartenAufGeheimzahl\"/>\r\n" + 
				"    <ownedLiteral ObjectID=\"f38d4d1\" name=\"fuer_kunde_wartenAufBetrag\"/>\r\n" + 
				"    <ownedLiteral ObjectID=\"f5f284\" name=\"fuer_kunde_bereit\"/>\r\n" + 
				"    <ownedLiteral ObjectID=\"f6202c0\" name=\"fuer_automat_karteEingefuegt\"/>\r\n" + 
				"    <ownedLiteral ObjectID=\"f433f71\" name=\"fuer_automat_geheimzahlEingetippt\"/>\r\n" + 
				"    <ownedLiteral ObjectID=\"f4a731c\" name=\"fuer_automat_betragEingetippt\"/>\r\n" + 
				"  </enumerations>\r\n" + 
				"  <packages ObjectID=\"f186d36\" name=\"Types\">\r\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f21f575\" name=\"Integer\" package=\"//@packages.0\"/>\r\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f6ff69c\" name=\"Double\" package=\"//@packages.0\"/>\r\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f143957\" name=\"Boolean\" package=\"//@packages.0\"/>\r\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f4f4a1\" name=\"String\" package=\"//@packages.0\"/>\r\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"fea65c\" name=\"Object\" package=\"//@packages.0\"/>\r\n" + 
				"  </packages>\r\n" + 
				"  <packages ObjectID=\"f2bcfa4\" name=\"DES\">\r\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f6f1844\" name=\"EventQueue\" package=\"//@packages.1\" superClass=\"//@clazz.0\">\r\n" + 
				"      <ownedOperation ObjectID=\"f78653a\" name=\"consume\" clazz=\"//@packages.1/@ownedMemberPackage.0\" returnType=\"//@packages.1/@ownedMemberPackage.3\">\r\n" + 
				"        <ownedParameter ObjectID=\"f741ee8\" name=\"timeStep\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\" />\r\n" + 
				"        <ownedParameter ObjectID=\"f325830\" name=\"past\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.2\" />\r\n" + 
				"        <ownedParameter ObjectID=\"f1385ca\" name=\"eventType\" isUnique=\"true\" type=\"//@clazz.1\" />\r\n" + 
				"        <ownedParameter ObjectID=\"f334831\" name=\"receiver\" isUnique=\"true\" type=\"//@clazz.0\" />\r\n" + 
				"        <ownedParameter ObjectID=\"f4cda47\" name=\"receiverType\" isUnique=\"true\" type=\"//@clazz.1\" />\r\n" + 
				"        <stateMachine ObjectID=\"f2a9bdf\" name=\"YStateMachinef2a9bdf\"/>\r\n" + 
				"      </ownedOperation>\r\n" + 
				"      <ownedOperation ObjectID=\"f60b252\" name=\"peek\" clazz=\"//@packages.1/@ownedMemberPackage.0\" returnType=\"//@packages.1/@ownedMemberPackage.3\">\r\n" + 
				"        <ownedParameter ObjectID=\"f465861\" name=\"timeStep\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\" />\r\n" + 
				"        <ownedParameter ObjectID=\"f4b5255\" name=\"past\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.2\" />\r\n" + 
				"        <ownedParameter ObjectID=\"f7afd77\" name=\"eventType\" isUnique=\"true\" type=\"//@clazz.1\" />\r\n" + 
				"        <ownedParameter ObjectID=\"f82b36\" name=\"receiver\" isUnique=\"true\" type=\"//@clazz.0\" />\r\n" + 
				"        <ownedParameter ObjectID=\"fd7951\" name=\"receiverType\" isUnique=\"true\" type=\"//@clazz.1\" />\r\n" + 
				"        <stateMachine ObjectID=\"f545e73\" name=\"YStateMachinef545e73\"/>\r\n" + 
				"      </ownedOperation>\r\n" + 
				"    </ownedMemberPackage>\r\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f7b30f\" name=\"Queue\" package=\"//@packages.1\" superClass=\"//@clazz.0 //@packages.1/@ownedMemberPackage.2\">\r\n" + 
				"      <ownedAttribute ObjectID=\"f9f8bb\" name=\"queue\" association=\"true\" upper=\"-1\" aggregation=\"composite\" type=\"//@packages.1/@ownedMemberPackage.2\" clazz=\"//@packages.1/@ownedMemberPackage.1\" />\r\n" + 
				"      <ownedAttribute ObjectID=\"f386ee1\" name=\"delayed\" association=\"true\" upper=\"-1\" aggregation=\"composite\" type=\"//@packages.1/@ownedMemberPackage.2\" clazz=\"//@packages.1/@ownedMemberPackage.1\" />\r\n" + 
				"      <ownedAttribute ObjectID=\"f2f987a\" name=\"event\" isUnique=\"true\" type=\"//@packages.1/@ownedMemberPackage.3\" clazz=\"//@packages.1/@ownedMemberPackage.1\" />\r\n" + 
				"      <ownedAttribute ObjectID=\"f660fa1\" name=\"var_objectManagment\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.4\" clazz=\"//@packages.1/@ownedMemberPackage.1\" />\r\n" + 
				"      <ownedOperation ObjectID=\"f20be76\" name=\"add\" clazz=\"//@packages.1/@ownedMemberPackage.1\">\r\n" + 
				"        <ownedParameter ObjectID=\"f4f4254\" name=\"object\" isUnique=\"true\" type=\"//@packages.1/@ownedMemberPackage.2\" />\r\n" + 
				"        <stateMachine ObjectID=\"f4abe3c\" name=\"YStateMachinef4abe3c\">\r\n" + 
				"          <transition ObjectID=\"f5e9a9b\" name=\"YTransitionf5e9a9b\" source=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.0/@stateMachine/@trAttach.0\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f38ff8d\" name=\"YPseudostatef38ff8d\" outgoing=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.0/@stateMachine/@transition.0\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f22957b\" name=\"YFinalStatef22957b\" incoming=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.0/@stateMachine/@transition.0\"/>\r\n" + 
				"          <trAttach ObjectID=\"f529472\" name=\"YTrAttachmentf529472\" transition=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.0/@stateMachine/@transition.0\" guardStringRep=\"true;\">\r\n" + 
				"            <effects ObjectID=\"f3d0304\" effectStringRep=\"queue.add(object);\"/>\r\n" + 
				"            <effects ObjectID=\"f160b70\" effectStringRep=\"var_objectManagment = getObjectManagement();\"/>\r\n" + 
				"            <effects ObjectID=\"f6420ae\" effectStringRep=\"(var_objectManagment as online.yamm.ObjectManagement).addQueueElement(this, object, 1);\"/>\r\n" + 
				"          </trAttach>\r\n" + 
				"        </stateMachine>\r\n" + 
				"      </ownedOperation>\r\n" + 
				"      <ownedOperation ObjectID=\"f68084f\" name=\"consume\" clazz=\"//@packages.1/@ownedMemberPackage.1\" returnType=\"//@packages.1/@ownedMemberPackage.2\">\r\n" + 
				"        <ownedParameter ObjectID=\"f34e890\" name=\"filterMap\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.4\" />\r\n" + 
				"        <stateMachine ObjectID=\"f467557\" name=\"YStateMachinef467557\"/>\r\n" + 
				"      </ownedOperation>\r\n" + 
				"      <ownedOperation ObjectID=\"f7b77c9\" name=\"peek\" clazz=\"//@packages.1/@ownedMemberPackage.1\" returnType=\"//@packages.1/@ownedMemberPackage.2\">\r\n" + 
				"        <ownedParameter ObjectID=\"f310db4\" name=\"filterMap\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.4\" />\r\n" + 
				"        <stateMachine ObjectID=\"f549a88\" name=\"YStateMachinef549a88\"/>\r\n" + 
				"      </ownedOperation>\r\n" + 
				"      <ownedOperation ObjectID=\"f275fe\" name=\"addWithDelay\" clazz=\"//@packages.1/@ownedMemberPackage.1\">\r\n" + 
				"        <ownedParameter ObjectID=\"f2f3872\" name=\"object\" isUnique=\"true\" type=\"//@packages.1/@ownedMemberPackage.2\" />\r\n" + 
				"        <ownedParameter ObjectID=\"f8dd49\" name=\"delay\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\" />\r\n" + 
				"        <ownedParameter ObjectID=\"f468ab9\" name=\"timeStep\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\" />\r\n" + 
				"        <stateMachine ObjectID=\"f48a287\" name=\"YStateMachinef48a287\">\r\n" + 
				"          <transition ObjectID=\"f58fd62\" name=\"YTransitionf58fd62\" source=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.3/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.3/@stateMachine/@subvertex.1\" attachment=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.3/@stateMachine/@trAttach.0\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f4b5238\" name=\"YPseudostatef4b5238\" outgoing=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.3/@stateMachine/@transition.0\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f5e46aa\" name=\"YFinalStatef5e46aa\" incoming=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.3/@stateMachine/@transition.0\"/>\r\n" + 
				"          <trAttach ObjectID=\"f459b0\" name=\"YTrAttachmentf459b0\" transition=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.3/@stateMachine/@transition.0\" guardStringRep=\"true;\">\r\n" + 
				"            <effects ObjectID=\"f3af920\" effectStringRep=\"var_objectManagment = getObjectManagement();\"/>\r\n" + 
				"            <effects ObjectID=\"f3726ea\" effectStringRep=\"(var_objectManagment as online.yamm.ObjectManagement).addDelayedQueueElement(this, object, 1);\"/>\r\n" + 
				"            <effects ObjectID=\"f59be5a\" effectStringRep=\"delayed.add(object);\"/>\r\n" + 
				"            <effects ObjectID=\"f6f18ad\" effectStringRep=\"event = new Delay;\"/>\r\n" + 
				"            <effects ObjectID=\"f28d54b\" effectStringRep=\"event.timeStep = timeStep + delay;\"/>\r\n" + 
				"            <effects ObjectID=\"f3ae638\" effectStringRep=\"event.objectAttached = object;\"/>\r\n" + 
				"            <effects ObjectID=\"f5109cb\" effectStringRep=\"event.receivingObject = this;\"/>\r\n" + 
				"          </trAttach>\r\n" + 
				"        </stateMachine>\r\n" + 
				"      </ownedOperation>\r\n" + 
				"      <ownedOperation ObjectID=\"f764840\" name=\"simulate\" clazz=\"//@packages.1/@ownedMemberPackage.1\" returnType=\"//@packages.0/@ownedMemberPackage.2\">\r\n" + 
				"        <ownedParameter ObjectID=\"f68416a\" name=\"timeStep\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\" />\r\n" + 
				"        <stateMachine ObjectID=\"f7e7e66\" name=\"YStateMachinef7e7e66\">\r\n" + 
				"          <transition ObjectID=\"f2b7fa1\" name=\"YTransitionf2b7fa1\" source=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.2\" target=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.0\" attachment=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@trAttach.0\"/>\r\n" + 
				"          <transition ObjectID=\"f4bfb83\" name=\"YTransitionf4bfb83\" source=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.1\" attachment=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@trAttach.1\"/>\r\n" + 
				"          <transition ObjectID=\"f78cae7\" name=\"YTransitionf78cae7\" source=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.1\" target=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.3\" attachment=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@trAttach.2\"/>\r\n" + 
				"          <transition ObjectID=\"f3b1426\" name=\"YTransitionf3b1426\" source=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.1\" target=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.3\" attachment=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@trAttach.3\"/>\r\n" + 
				"          <transition ObjectID=\"f411019\" name=\"YTransitionf411019\" source=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.3\" attachment=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@trAttach.4\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"fe5506\" name=\"YStatefe5506\" outgoing=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.1 //@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.4\" incoming=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.0\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f4cf3d0\" name=\"YStatef4cf3d0\" outgoing=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.2 //@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.3\" incoming=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.1\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f384d51\" name=\"YPseudostatef384d51\" outgoing=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.0\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f2e7b01\" name=\"YFinalStatef2e7b01\" incoming=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.2 //@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.3 //@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.4\"/>\r\n" + 
				"          <trAttach ObjectID=\"f14e78f\" name=\"YTrAttachmentf14e78f\" transition=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.0\" guardStringRep=\"true;\">\r\n" + 
				"            <effects ObjectID=\"f48c6c2\" effectStringRep=\"event = DES.EventQueue.peek(timeStep, true, null, this, null);\"/>\r\n" + 
				"          </trAttach>\r\n" + 
				"          <trAttach ObjectID=\"f1e9b4e\" name=\"YTrAttachmentf1e9b4e\" transition=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.1\" guardStringRep=\"event != null;\"/>\r\n" + 
				"          <trAttach ObjectID=\"f5eb936\" name=\"YTrAttachmentf5eb936\" transition=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.2\" guardStringRep=\"event instanceof Delay;\">\r\n" + 
				"            <effects ObjectID=\"f2c724a\" effectStringRep=\"DES.EventQueue.consume(timeStep, true, null, this, null);\"/>\r\n" + 
				"            <effects ObjectID=\"fe6655\" effectStringRep=\"(var_objectManagment as online.yamm.ObjectManagement).removeDelayedQueueElement(this, event.objectAttached, 1);\"/>\r\n" + 
				"            <effects ObjectID=\"fb8378\" effectStringRep=\"add(event.objectAttached);\"/>\r\n" + 
				"            <effects ObjectID=\"f271ec5\" effectStringRep=\"setReturnValue(true);\"/>\r\n" + 
				"          </trAttach>\r\n" + 
				"          <trAttach ObjectID=\"f3696b8\" name=\"YTrAttachmentf3696b8\" transition=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.3\" guardStringRep=\"!(event instanceof Delay);\">\r\n" + 
				"            <effects ObjectID=\"f430192\" effectStringRep=\"setReturnValue(false);\"/>\r\n" + 
				"          </trAttach>\r\n" + 
				"          <trAttach ObjectID=\"f11f883\" name=\"YTrAttachmentf11f883\" transition=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.4\" guardStringRep=\"event == null;\">\r\n" + 
				"            <effects ObjectID=\"f41db92\" effectStringRep=\"setReturnValue(false);\"/>\r\n" + 
				"          </trAttach>\r\n" + 
				"        </stateMachine>\r\n" + 
				"      </ownedOperation>\r\n" + 
				"    </ownedMemberPackage>\r\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f40b04f\" name=\"SimulationObject\" package=\"//@packages.1\" superClass=\"//@clazz.0\">\r\n" + 
				"      <ownedAttribute ObjectID=\"f555e10\" name=\"name\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.3\" clazz=\"//@packages.1/@ownedMemberPackage.2\" />\r\n" + 
				"      <ownedOperation ObjectID=\"f10ddfa\" name=\"simulate\" clazz=\"//@packages.1/@ownedMemberPackage.2\" returnType=\"//@packages.0/@ownedMemberPackage.2\">\r\n" + 
				"        <ownedParameter ObjectID=\"f7873fc\" name=\"timeStep\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\" />\r\n" + 
				"        <stateMachine ObjectID=\"f2ac9f0\" name=\"YStateMachinef2ac9f0\">\r\n" + 
				"          <transition ObjectID=\"f79f4b8\" name=\"YTransitionf79f4b8\" source=\"//@packages.1/@ownedMemberPackage.2/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.2/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@packages.1/@ownedMemberPackage.2/@ownedOperation.0/@stateMachine/@trAttach.0\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f68bf82\" name=\"YPseudostatef68bf82\" outgoing=\"//@packages.1/@ownedMemberPackage.2/@ownedOperation.0/@stateMachine/@transition.0\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f68c2fb\" name=\"YFinalStatef68c2fb\" incoming=\"//@packages.1/@ownedMemberPackage.2/@ownedOperation.0/@stateMachine/@transition.0\"/>\r\n" + 
				"          <trAttach ObjectID=\"f352f8d\" name=\"YTrAttachmentf352f8d\" transition=\"//@packages.1/@ownedMemberPackage.2/@ownedOperation.0/@stateMachine/@transition.0\" guardStringRep=\"true;\">\r\n" + 
				"            <effects ObjectID=\"f284471\" effectStringRep=\"setReturnValue(false);\"/>\r\n" + 
				"          </trAttach>\r\n" + 
				"        </stateMachine>\r\n" + 
				"      </ownedOperation>\r\n" + 
				"    </ownedMemberPackage>\r\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f2a26c9\" name=\"Event\" package=\"//@packages.1\" superClass=\"//@clazz.0\">\r\n" + 
				"      <ownedAttribute ObjectID=\"f3128f5\" name=\"timeStep\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@packages.1/@ownedMemberPackage.3\" />\r\n" + 
				"      <ownedAttribute ObjectID=\"f4063c7\" name=\"receivingType\" isUnique=\"true\" type=\"//@clazz.1\" clazz=\"//@packages.1/@ownedMemberPackage.3\" />\r\n" + 
				"      <ownedAttribute ObjectID=\"f197074\" name=\"description\" type=\"//@packages.0/@ownedMemberPackage.3\" clazz=\"//@packages.1/@ownedMemberPackage.3\" />\r\n" + 
				"      <ownedAttribute ObjectID=\"f94f5c\" name=\"receivingObject\" association=\"true\" isUnique=\"true\" type=\"//@packages.1/@ownedMemberPackage.2\" clazz=\"//@packages.1/@ownedMemberPackage.3\" >\r\n" + 
				"        <ownedElement xsi:type=\"yammDiagram:YParameter\" ObjectID=\"f465861\" name=\"timeStep\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\" />\r\n" + 
				"      </ownedAttribute>\r\n" + 
				"      <ownedAttribute ObjectID=\"f210054\" name=\"objectAttached\" association=\"true\" isUnique=\"true\" type=\"//@packages.1/@ownedMemberPackage.2\" clazz=\"//@packages.1/@ownedMemberPackage.3\" />\r\n" + 
				"      <ownedOperation ObjectID=\"f6b9c0b\" name=\"toString\" clazz=\"//@packages.1/@ownedMemberPackage.3\" returnType=\"//@packages.0/@ownedMemberPackage.3\">\r\n" + 
				"        <stateMachine ObjectID=\"f694554\" name=\"YStateMachinef694554\">\r\n" + 
				"          <transition ObjectID=\"f76f663\" name=\"YTransitionf76f663\" source=\"//@packages.1/@ownedMemberPackage.3/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.3/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@packages.1/@ownedMemberPackage.3/@ownedOperation.0/@stateMachine/@trAttach.0\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f759d05\" name=\"YPseudostatef759d05\" outgoing=\"//@packages.1/@ownedMemberPackage.3/@ownedOperation.0/@stateMachine/@transition.0\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f190b71\" name=\"YFinalStatef190b71\" incoming=\"//@packages.1/@ownedMemberPackage.3/@ownedOperation.0/@stateMachine/@transition.0\"/>\r\n" + 
				"          <trAttach ObjectID=\"f776ef5\" name=\"YTrAttachmentf776ef5\" transition=\"//@packages.1/@ownedMemberPackage.3/@ownedOperation.0/@stateMachine/@transition.0\" guardStringRep=\"true;\">\r\n" + 
				"            <effects ObjectID=\"f1ac343\" effectStringRep=\"setReturnValue(&quot;TODO: Event.toString()&quot;);\"/>\r\n" + 
				"          </trAttach>\r\n" + 
				"        </stateMachine>\r\n" + 
				"      </ownedOperation>\r\n" + 
				"    </ownedMemberPackage>\r\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f5961ed\" name=\"Randomizer\" package=\"//@packages.1\" superClass=\"//@clazz.0\">\r\n" + 
				"      <ownedAttribute ObjectID=\"f49b547\" name=\"random\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.4\" />\r\n" + 
				"      <ownedAttribute ObjectID=\"f13e889\" name=\"USE_GAUSSIAN\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.2\" clazz=\"//@packages.1/@ownedMemberPackage.4\" />\r\n" + 
				"      <ownedAttribute ObjectID=\"f66b9ac\" name=\"i\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@packages.1/@ownedMemberPackage.4\" />\r\n" + 
				"      <ownedAttribute ObjectID=\"f19d97b\" name=\"prob2Int\" association=\"true\" upper=\"-1\" aggregation=\"composite\" type=\"//@packages.1/@ownedMemberPackage.5\" clazz=\"//@packages.1/@ownedMemberPackage.4\" />\r\n" + 
				"      <ownedAttribute ObjectID=\"f41fa4e\" name=\"entry\" association=\"true\" isUnique=\"true\" type=\"//@packages.1/@ownedMemberPackage.5\" clazz=\"//@packages.1/@ownedMemberPackage.4\" />\r\n" + 
				"      <ownedAttribute ObjectID=\"f7d11a1\" name=\"r\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.1\" clazz=\"//@packages.1/@ownedMemberPackage.4\" />\r\n" + 
				"      <ownedAttribute ObjectID=\"f672a3d\" name=\"x\" isUnique=\"true\" defaultValue=\"&quot;0&quot;\" type=\"//@packages.0/@ownedMemberPackage.1\" clazz=\"//@packages.1/@ownedMemberPackage.4\" />\r\n" + 
				"      <ownedAttribute ObjectID=\"f64dcec\" name=\"sumAllProp\" isUnique=\"true\" defaultValue=\"&quot;0&quot;\" type=\"//@packages.0/@ownedMemberPackage.1\" clazz=\"//@packages.1/@ownedMemberPackage.4\" />\r\n" + 
				"      <ownedOperation ObjectID=\"f27d00b\" name=\"addProbInt\" clazz=\"//@packages.1/@ownedMemberPackage.4\">\r\n" + 
				"        <ownedParameter ObjectID=\"f46955f\" name=\"to\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.1\" />\r\n" + 
				"        <ownedParameter ObjectID=\"f547076\" name=\"value\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\" />\r\n" + 
				"        <stateMachine ObjectID=\"f7f9230\" name=\"YStateMachinef7f9230\">\r\n" + 
				"          <transition ObjectID=\"f16bfc2\" name=\"YTransitionf16bfc2\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.0/@stateMachine/@trAttach.0\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f5ef90\" name=\"YPseudostatef5ef90\" outgoing=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.0/@stateMachine/@transition.0\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f3b08da\" name=\"YFinalStatef3b08da\" incoming=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.0/@stateMachine/@transition.0\"/>\r\n" + 
				"          <trAttach ObjectID=\"f4c947d\" name=\"YTrAttachmentf4c947d\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.0/@stateMachine/@transition.0\" guardStringRep=\"true;\">\r\n" + 
				"            <effects ObjectID=\"f46566a\" effectStringRep=\"sumAllProp = sumAllProp + to;\"/>\r\n" + 
				"            <effects ObjectID=\"f4dc7ba\" effectStringRep=\"prob2Int.add(new Probability2Value);\"/>\r\n" + 
				"            <effects ObjectID=\"f20b257\" effectStringRep=\"prob2Int.get(prob2Int.size - 1).probabilityUpperLimit = to;\"/>\r\n" + 
				"            <effects ObjectID=\"f5793d3\" effectStringRep=\"prob2Int.get(prob2Int.size - 1).value = value;\"/>\r\n" + 
				"          </trAttach>\r\n" + 
				"        </stateMachine>\r\n" + 
				"      </ownedOperation>\r\n" + 
				"      <ownedOperation ObjectID=\"f66c63\" name=\"nextInt\" clazz=\"//@packages.1/@ownedMemberPackage.4\" returnType=\"//@packages.0/@ownedMemberPackage.0\">\r\n" + 
				"        <stateMachine ObjectID=\"f30aac5\" name=\"YStateMachinef30aac5\">\r\n" + 
				"          <transition ObjectID=\"f5626fe\" name=\"YTransitionf5626fe\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.2\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@trAttach.0\"/>\r\n" + 
				"          <transition ObjectID=\"f43cf6d\" name=\"YTransitionf43cf6d\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.2\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@trAttach.1\"/>\r\n" + 
				"          <transition ObjectID=\"f532d9a\" name=\"YTransitionf532d9a\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.5\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.3\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@trAttach.2\"/>\r\n" + 
				"          <transition ObjectID=\"f1d935c\" name=\"YTransitionf1d935c\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.4\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.3\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@trAttach.3\"/>\r\n" + 
				"          <transition ObjectID=\"f7c9630\" name=\"YTransitionf7c9630\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.3\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.4\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@trAttach.4\"/>\r\n" + 
				"          <transition ObjectID=\"f146bd8\" name=\"YTransitionf146bd8\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.3\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.1\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@trAttach.5\"/>\r\n" + 
				"          <transition ObjectID=\"f19a4e3\" name=\"YTransitionf19a4e3\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.4\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.1\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@trAttach.6\"/>\r\n" + 
				"          <transition ObjectID=\"f1440f2\" name=\"YTransitionf1440f2\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.2\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.5\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@trAttach.7\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f311e7\" name=\"YPseudostatef311e7\" outgoing=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.0 //@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.1\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f4ede39\" name=\"YFinalStatef4ede39\" incoming=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.5 //@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.6\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f1c1425\" name=\"YStatef1c1425\" outgoing=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.7\" incoming=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.0 //@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.1\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f6c9142\" name=\"YStatef6c9142\" outgoing=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.4 //@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.5\" incoming=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.2 //@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.3\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f6995d3\" name=\"YStatef6995d3\" outgoing=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.3 //@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.6\" incoming=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.4\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f577f47\" name=\"YStatef577f47\" outgoing=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.2\" incoming=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.7\"/>\r\n" + 
				"          <trAttach ObjectID=\"f59536\" name=\"YTrAttachmentf59536\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.0\" guardStringRep=\"USE_GAUSSIAN;\">\r\n" + 
				"            <effects ObjectID=\"f6de5ab\" effectStringRep=\"r = (random as java.util.Random).nextGaussian;\"/>\r\n" + 
				"          </trAttach>\r\n" + 
				"          <trAttach ObjectID=\"f70685\" name=\"YTrAttachmentf70685\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.1\" guardStringRep=\"!USE_GAUSSIAN;\">\r\n" + 
				"            <effects ObjectID=\"f325de1\" effectStringRep=\"r = (random as java.util.Random).nextDouble;\"/>\r\n" + 
				"          </trAttach>\r\n" + 
				"          <trAttach ObjectID=\"f2dd09a\" name=\"YTrAttachmentf2dd09a\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.2\" guardStringRep=\"true;\">\r\n" + 
				"            <effects ObjectID=\"f2050fd\" effectStringRep=\"x = 0;\"/>\r\n" + 
				"            <effects ObjectID=\"f728e4a\" effectStringRep=\"i = 0;\"/>\r\n" + 
				"          </trAttach>\r\n" + 
				"          <trAttach ObjectID=\"f654c2c\" name=\"YTrAttachmentf654c2c\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.3\" guardStringRep=\"r > entry.probabilityUpperLimit + x;\"/>\r\n" + 
				"          <trAttach ObjectID=\"f177a55\" name=\"YTrAttachmentf177a55\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.4\" guardStringRep=\"i &lt; prob2Int.size;\">\r\n" + 
				"            <effects ObjectID=\"f2bde0d\" effectStringRep=\"entry = prob2Int.get(i++);\"/>\r\n" + 
				"            <effects ObjectID=\"f4be425\" effectStringRep=\"x = x + entry.probabilityUpperLimit;\"/>\r\n" + 
				"          </trAttach>\r\n" + 
				"          <trAttach ObjectID=\"f34e904\" name=\"YTrAttachmentf34e904\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.5\" guardStringRep=\"i >= prob2Int.size;\">\r\n" + 
				"            <effects ObjectID=\"f1b61b9\" effectStringRep=\"setReturnValue(0);\"/>\r\n" + 
				"          </trAttach>\r\n" + 
				"          <trAttach ObjectID=\"f6e4855\" name=\"YTrAttachmentf6e4855\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.6\" guardStringRep=\"r &lt;= entry.probabilityUpperLimit + x;\">\r\n" + 
				"            <effects ObjectID=\"f7a9b6f\" effectStringRep=\"setReturnValue(entry.value);\"/>\r\n" + 
				"          </trAttach>\r\n" + 
				"          <trAttach ObjectID=\"f7758dd\" name=\"YTrAttachmentf7758dd\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.7\" guardStringRep=\"true;\">\r\n" + 
				"            <effects ObjectID=\"f5dc2c3\" effectStringRep=\"r = r * sumAllProp;\"/>\r\n" + 
				"          </trAttach>\r\n" + 
				"        </stateMachine>\r\n" + 
				"      </ownedOperation>\r\n" + 
				"    </ownedMemberPackage>\r\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f6019cc\" name=\"Probability2Value\" package=\"//@packages.1\" superClass=\"//@clazz.0\">\r\n" + 
				"      <ownedAttribute ObjectID=\"f5512dc\" name=\"probabilityUpperLimit\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.1\" clazz=\"//@packages.1/@ownedMemberPackage.5\" />\r\n" + 
				"      <ownedAttribute ObjectID=\"f6e635c\" name=\"value\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@packages.1/@ownedMemberPackage.5\" />\r\n" + 
				"    </ownedMemberPackage>\r\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f67d23f\" name=\"Delay\" package=\"//@packages.1\" superClass=\"//@clazz.0 //@packages.1/@ownedMemberPackage.3\"/>\r\n" + 
				"  </packages>\r\n" + 
				"</yammDiagram:YModel>\r\n" + 
				"";

	}
	public String tagungsplanung() {
		return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n" + 
				"<yammDiagram:YModel xmi:version=\"2.0\" xmlns:xmi=\"http://www.omg.org/XMI\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:yammDiagram=\"http://www.yamm.online/coreModelDiagram/YammDiagram\">\r\n" + 
				"  <clazz ObjectID=\"f5e24a2\" name=\"RObject\">\r\n" + 
				"    <ownedAttribute ObjectID=\"f2bd771\" name=\"rContainer\" type=\"//@clazz.0\" clazz=\"//@clazz.0\" />\r\n" + 
				"    <ownedAttribute ObjectID=\"f55ebef\" name=\"yClass\" type=\"//@packages.0/@ownedMemberPackage.4\" clazz=\"//@clazz.0\" />\r\n" + 
				"    <ownedAttribute ObjectID=\"fbb4ab\" name=\"ObjectID\" type=\"//@packages.0/@ownedMemberPackage.3\" clazz=\"//@clazz.0\" />\r\n" + 
				"  </clazz>\r\n" + 
				"  <clazz ObjectID=\"f4cc70d\" name=\"YClass\" superClass=\"//@clazz.0\"/>\r\n" + 
				"  <clazz ObjectID=\"f2bc81f\" name=\"Teilnehmer\" superClass=\"//@clazz.0\">\r\n" + 
				"    <ownedAttribute ObjectID=\"f46e925\" name=\"name\" type=\"//@packages.0/@ownedMemberPackage.3\" clazz=\"//@clazz.2\" visibility=\"private\" />\r\n" + 
				"    <ownedAttribute ObjectID=\"feba65\" name=\"adresse\" type=\"//@clazz.6\" clazz=\"//@clazz.2\" visibility=\"private\" />\r\n" + 
				"    <ownedAttribute ObjectID=\"f28967b\" name=\"status\" type=\"//@enumerations.0\" clazz=\"//@clazz.2\" visibility=\"private\" />\r\n" + 
				"    <ownedAttribute ObjectID=\"f597276\" name=\"tutorien\" association=\"true\" upper=\"-1\" type=\"//@clazz.3\" opposite=\"//@clazz.3/@ownedAttribute.0\" clazz=\"//@clazz.2\" />\r\n" + 
				"    <ownedAttribute ObjectID=\"f1b29d7\" name=\"programm\" association=\"true\" type=\"//@clazz.4\" opposite=\"//@clazz.4/@ownedAttribute.1\" clazz=\"//@clazz.2\" />\r\n" + 
				"    <ownedOperation ObjectID=\"f218072\" name=\"Teilnehmer\" clazz=\"//@clazz.2\">\r\n" + 
				"      <ownedParameter ObjectID=\"f41629d\" name=\"name\" type=\"//@packages.0/@ownedMemberPackage.3\" />\r\n" + 
				"      <ownedParameter ObjectID=\"ffb5d3\" name=\"adresse\" type=\"//@clazz.6\" />\r\n" + 
				"      <ownedParameter ObjectID=\"f320bc\" name=\"status\" type=\"//@enumerations.0\" />\r\n" + 
				"      <stateMachine ObjectID=\"f1c5334\" name=\"YStateMachinef1c5334\">\r\n" + 
				"        <transition ObjectID=\"f7ae423\" name=\"YTransitionf7ae423\" source=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@clazz.2/@ownedOperation.0/@stateMachine/@trAttach.0\"/>\r\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"fec742\" name=\"YPseudostatefec742\" outgoing=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.0\"/>\r\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f585305\" name=\"YFinalStatef585305\" incoming=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.0\"/>\r\n" + 
				"        <trAttach ObjectID=\"f2fff8d\" name=\"YTrAttachmentf2fff8d\" transition=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.0\" guardStringRep=\"true;\">\r\n" + 
				"          <effects ObjectID=\"f265064\" effectStringRep=\"this.name =name;&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f28332e\" effectStringRep=\"this.adresse =adresse;&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f44c916\" effectStringRep=\"this.status = status;&#xA;\"/>\r\n" + 
				"        </trAttach>\r\n" + 
				"      </stateMachine>\r\n" + 
				"    </ownedOperation>\r\n" + 
				"  </clazz>\r\n" + 
				"  <clazz ObjectID=\"f345a83\" name=\"Tutorium\" superClass=\"//@clazz.0\">\r\n" + 
				"    <ownedAttribute ObjectID=\"f2064bb\" name=\"zuhoehrer\" association=\"true\" upper=\"-1\" type=\"//@clazz.2\" opposite=\"//@clazz.2/@ownedAttribute.3\" clazz=\"//@clazz.3\" />\r\n" + 
				"    <ownedAttribute ObjectID=\"f59b3ae\" name=\"gesamtzahlTutorien\" defaultValue=\"&quot;0&quot;\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@clazz.3\" visibility=\"private\" />\r\n" + 
				"    <ownedAttribute ObjectID=\"f6f38c7\" name=\"nummer\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@clazz.3\" visibility=\"private\" invariant=\">0\" />\r\n" + 
				"    <ownedAttribute ObjectID=\"f43f6b1\" name=\"bezeichnung\" type=\"//@packages.0/@ownedMemberPackage.3\" clazz=\"//@clazz.3\" visibility=\"private\" />\r\n" + 
				"    <ownedAttribute ObjectID=\"f3c3c8e\" name=\"vortragende\" association=\"true\" lower=\"1\" upper=\"-1\" type=\"//@clazz.5\" opposite=\"//@clazz.5/@ownedAttribute.1\" clazz=\"//@clazz.3\" />\r\n" + 
				"    <ownedAttribute ObjectID=\"f667e7a\" name=\"datumUndZeit\" type=\"//@clazz.7\" clazz=\"//@clazz.3\" visibility=\"private\" />\r\n" + 
				"    <ownedAttribute ObjectID=\"f7191a0\" name=\"raum\" type=\"//@enumerations.1\" clazz=\"//@clazz.3\" visibility=\"private\" />\r\n" + 
				"    <ownedAttribute ObjectID=\"f3748cb\" name=\"kosten\" defaultValue=\"&quot;20.1&quot;\" type=\"//@packages.0/@ownedMemberPackage.1\" clazz=\"//@clazz.3\" visibility=\"private\" invariant=\">=0\" />\r\n" + 
				"    <ownedOperation ObjectID=\"f6d12a6\" name=\"Tutorium\" clazz=\"//@clazz.3\">\r\n" + 
				"      <ownedParameter ObjectID=\"f1a78a3\" name=\"bezeichnung\" type=\"//@packages.0/@ownedMemberPackage.3\" />\r\n" + 
				"      <ownedParameter ObjectID=\"f238382\" name=\"datumUndZeit\" type=\"//@clazz.7\" />\r\n" + 
				"      <ownedParameter ObjectID=\"f3ae932\" name=\"raum\" type=\"//@enumerations.1\" />\r\n" + 
				"      <ownedParameter ObjectID=\"f4bd06e\" name=\"referent\" type=\"//@clazz.5\" />\r\n" + 
				"      <stateMachine ObjectID=\"f7bd4dc\" name=\"YStateMachinef7bd4dc\">\r\n" + 
				"        <transition ObjectID=\"f4f773c\" name=\"YTransitionf4f773c\" source=\"//@clazz.3/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@clazz.3/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@clazz.3/@ownedOperation.0/@stateMachine/@trAttach.0\"/>\r\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f597be0\" name=\"YPseudostatef597be0\" outgoing=\"//@clazz.3/@ownedOperation.0/@stateMachine/@transition.0\"/>\r\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f28da83\" name=\"YFinalStatef28da83\" incoming=\"//@clazz.3/@ownedOperation.0/@stateMachine/@transition.0\"/>\r\n" + 
				"        <trAttach ObjectID=\"f49f6f7\" name=\"YTrAttachmentf49f6f7\" transition=\"//@clazz.3/@ownedOperation.0/@stateMachine/@transition.0\" guardStringRep=\"true;\">\r\n" + 
				"          <effects ObjectID=\"f273f4f\" effectStringRep=\"this.bezeichnung = bezeichnung;&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f20b702\" effectStringRep=\"&#xA;this.datumUndZeit = datumUndZeit;\"/>\r\n" + 
				"          <effects ObjectID=\"f38af22\" effectStringRep=\"this.raum = raum;&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f3ff04c\" effectStringRep=\"vortragende.add(referent);&#xA;\"/>\r\n" + 
				"        </trAttach>\r\n" + 
				"      </stateMachine>\r\n" + 
				"    </ownedOperation>\r\n" + 
				"    <ownedOperation ObjectID=\"f23f390\" name=\"anmelden\" clazz=\"//@clazz.3\">\r\n" + 
				"      <ownedParameter ObjectID=\"f7bee7f\" name=\"teilnehmer\" type=\"//@clazz.2\" />\r\n" + 
				"      <stateMachine ObjectID=\"f5f86cb\" name=\"YStateMachinef5f86cb\">\r\n" + 
				"        <transition ObjectID=\"f4a2423\" name=\"YTransitionf4a2423\" source=\"//@clazz.3/@ownedOperation.1/@stateMachine/@subvertex.0\" target=\"//@clazz.3/@ownedOperation.1/@stateMachine/@subvertex.1\" attachment=\"//@clazz.3/@ownedOperation.1/@stateMachine/@trAttach.0\"/>\r\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f57214a\" name=\"YPseudostatef57214a\" outgoing=\"//@clazz.3/@ownedOperation.1/@stateMachine/@transition.0\"/>\r\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f62869a\" name=\"YFinalStatef62869a\" incoming=\"//@clazz.3/@ownedOperation.1/@stateMachine/@transition.0\"/>\r\n" + 
				"        <trAttach ObjectID=\"f5634a8\" name=\"YTrAttachmentf5634a8\" transition=\"//@clazz.3/@ownedOperation.1/@stateMachine/@transition.0\" guardStringRep=\"true;\">\r\n" + 
				"          <effects ObjectID=\"f5ae8f2\" effectStringRep=\"zuhoehrer.add(teilnehmer);&#xA;\"/>\r\n" + 
				"        </trAttach>\r\n" + 
				"      </stateMachine>\r\n" + 
				"    </ownedOperation>\r\n" + 
				"    <ownedOperation ObjectID=\"f7a1c70\" name=\"finde_statt\" clazz=\"//@clazz.3\" returnType=\"//@packages.0/@ownedMemberPackage.2\">\r\n" + 
				"      <stateMachine ObjectID=\"fb2d10\" name=\"YStateMachinefb2d10\">\r\n" + 
				"        <transition ObjectID=\"fa9f48\" name=\"YTransitionfa9f48\" source=\"//@clazz.3/@ownedOperation.2/@stateMachine/@subvertex.0\" target=\"//@clazz.3/@ownedOperation.2/@stateMachine/@subvertex.1\" attachment=\"//@clazz.3/@ownedOperation.2/@stateMachine/@trAttach.0\"/>\r\n" + 
				"        <transition ObjectID=\"f630995\" name=\"YTransitionf630995\" source=\"//@clazz.3/@ownedOperation.2/@stateMachine/@subvertex.0\" target=\"//@clazz.3/@ownedOperation.2/@stateMachine/@subvertex.1\" attachment=\"//@clazz.3/@ownedOperation.2/@stateMachine/@trAttach.1\"/>\r\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f31f6f9\" name=\"YPseudostatef31f6f9\" outgoing=\"//@clazz.3/@ownedOperation.2/@stateMachine/@transition.0 //@clazz.3/@ownedOperation.2/@stateMachine/@transition.1\"/>\r\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f2c8a52\" name=\"YFinalStatef2c8a52\" incoming=\"//@clazz.3/@ownedOperation.2/@stateMachine/@transition.0 //@clazz.3/@ownedOperation.2/@stateMachine/@transition.1\"/>\r\n" + 
				"        <trAttach ObjectID=\"f488681\" name=\"YTrAttachmentf488681\" transition=\"//@clazz.3/@ownedOperation.2/@stateMachine/@transition.0\" guardStringRep=\"datumUndZeit == null;&#xA;\">\r\n" + 
				"          <effects ObjectID=\"f11eb56\" effectStringRep=\"setReturnValue(false);&#xA;\"/>\r\n" + 
				"        </trAttach>\r\n" + 
				"        <trAttach ObjectID=\"f562f3d\" name=\"YTrAttachmentf562f3d\" transition=\"//@clazz.3/@ownedOperation.2/@stateMachine/@transition.1\" guardStringRep=\"datumUndZeit != null;&#xA;\">\r\n" + 
				"          <effects ObjectID=\"f6945c2\" effectStringRep=\"setReturnValue(true);&#xA;\"/>\r\n" + 
				"        </trAttach>\r\n" + 
				"      </stateMachine>\r\n" + 
				"    </ownedOperation>\r\n" + 
				"  </clazz>\r\n" + 
				"  <clazz ObjectID=\"f477764\" name=\"Rahmenprogramm\" superClass=\"//@clazz.0\">\r\n" + 
				"    <ownedAttribute ObjectID=\"f69ac10\" name=\"referenten\" association=\"true\" upper=\"-1\" type=\"//@clazz.5\" opposite=\"//@clazz.5/@ownedAttribute.2\" clazz=\"//@clazz.4\" />\r\n" + 
				"    <ownedAttribute ObjectID=\"f3ba151\" name=\"teinehmer\" association=\"true\" upper=\"-1\" type=\"//@clazz.2\" opposite=\"//@clazz.2/@ownedAttribute.4\" clazz=\"//@clazz.4\" />\r\n" + 
				"    <ownedAttribute ObjectID=\"f3d6c33\" name=\"bezeichnung\" type=\"//@packages.0/@ownedMemberPackage.3\" clazz=\"//@clazz.2\" visibility=\"private\" />\r\n" + 
				"    <ownedAttribute ObjectID=\"f6e9060\" name=\"datumUndZeit\" type=\"//@clazz.7\" clazz=\"//@clazz.4\" visibility=\"private\" />\r\n" + 
				"    <ownedAttribute ObjectID=\"f694b6f\" name=\"raum\" type=\"//@enumerations.1\" clazz=\"//@clazz.4\" visibility=\"private\" />\r\n" + 
				"    <ownedOperation ObjectID=\"f3c009a\" name=\"Rahmenprogramm\" clazz=\"//@clazz.4\">\r\n" + 
				"      <ownedParameter ObjectID=\"f65a85f\" name=\"bezeichnung\" type=\"//@packages.0/@ownedMemberPackage.3\" />\r\n" + 
				"      <ownedParameter ObjectID=\"f59f763\" name=\"datumUndZeit\" type=\"//@clazz.7\" />\r\n" + 
				"      <ownedParameter ObjectID=\"f52ad4b\" name=\"raum\" type=\"//@enumerations.1\" />\r\n" + 
				"      <stateMachine ObjectID=\"f26f1fd\" name=\"YStateMachinef26f1fd\">\r\n" + 
				"        <transition ObjectID=\"f76e4c2\" name=\"YTransitionf76e4c2\" source=\"//@clazz.4/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@clazz.4/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@clazz.4/@ownedOperation.0/@stateMachine/@trAttach.0\"/>\r\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f585f4d\" name=\"YPseudostatef585f4d\" outgoing=\"//@clazz.4/@ownedOperation.0/@stateMachine/@transition.0\"/>\r\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f46575f\" name=\"YFinalStatef46575f\" incoming=\"//@clazz.4/@ownedOperation.0/@stateMachine/@transition.0\"/>\r\n" + 
				"        <trAttach ObjectID=\"f10003a\" name=\"YTrAttachmentf10003a\" transition=\"//@clazz.4/@ownedOperation.0/@stateMachine/@transition.0\" guardStringRep=\"true;\">\r\n" + 
				"          <effects ObjectID=\"f37039b\" effectStringRep=\"&#xA;this.bezeichnung = bezeichnung;\"/>\r\n" + 
				"          <effects ObjectID=\"f2676df\" effectStringRep=\"this.raum = raum;&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f56097b\" effectStringRep=\"this.datumUndZeit = datumUndZeit;&#xA;\"/>\r\n" + 
				"        </trAttach>\r\n" + 
				"      </stateMachine>\r\n" + 
				"    </ownedOperation>\r\n" + 
				"    <ownedOperation ObjectID=\"f3931a7\" name=\"anmelden\" clazz=\"//@clazz.4\">\r\n" + 
				"      <ownedParameter ObjectID=\"f9ca99\" name=\"teilnehmer\" type=\"//@clazz.2\" />\r\n" + 
				"      <stateMachine ObjectID=\"f70124e\" name=\"YStateMachinef70124e\">\r\n" + 
				"        <transition ObjectID=\"f8b704\" name=\"YTransitionf8b704\" source=\"//@clazz.4/@ownedOperation.1/@stateMachine/@subvertex.0\" target=\"//@clazz.4/@ownedOperation.1/@stateMachine/@subvertex.1\" attachment=\"//@clazz.4/@ownedOperation.1/@stateMachine/@trAttach.0\"/>\r\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f67abbd\" name=\"YPseudostatef67abbd\" outgoing=\"//@clazz.4/@ownedOperation.1/@stateMachine/@transition.0\"/>\r\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f698424\" name=\"YFinalStatef698424\" incoming=\"//@clazz.4/@ownedOperation.1/@stateMachine/@transition.0\"/>\r\n" + 
				"        <trAttach ObjectID=\"f3a6832\" name=\"YTrAttachmentf3a6832\" transition=\"//@clazz.4/@ownedOperation.1/@stateMachine/@transition.0\" guardStringRep=\"true;\">\r\n" + 
				"          <effects ObjectID=\"f7f5f30\" effectStringRep=\"teinehmer.add(teilnehmer);&#xA;\"/>\r\n" + 
				"        </trAttach>\r\n" + 
				"      </stateMachine>\r\n" + 
				"    </ownedOperation>\r\n" + 
				"  </clazz>\r\n" + 
				"  <clazz ObjectID=\"f487ba6\" name=\"Referent\" superClass=\"//@clazz.0\">\r\n" + 
				"    <ownedAttribute ObjectID=\"f659951\" name=\"firma\" type=\"//@packages.0/@ownedMemberPackage.3\" clazz=\"//@clazz.5\" visibility=\"private\" />\r\n" + 
				"    <ownedAttribute ObjectID=\"f216c70\" name=\"tutorien\" association=\"true\" upper=\"-1\" type=\"//@clazz.3\" opposite=\"//@clazz.3/@ownedAttribute.4\" clazz=\"//@clazz.5\" />\r\n" + 
				"    <ownedAttribute ObjectID=\"f55f20\" name=\"programm\" association=\"true\" type=\"//@clazz.4\" opposite=\"//@clazz.4/@ownedAttribute.0\" clazz=\"//@clazz.5\" />\r\n" + 
				"    <ownedAttribute ObjectID=\"f35e740\" name=\"status\" type=\"//@enumerations.0\" clazz=\"//@clazz.2\" visibility=\"private\" />\r\n" + 
				"    <ownedAttribute ObjectID=\"f728862\" name=\"name\" type=\"//@packages.0/@ownedMemberPackage.3\" clazz=\"//@clazz.2\" visibility=\"private\" />\r\n" + 
				"    <ownedAttribute ObjectID=\"f180441\" name=\"adresse\" type=\"//@clazz.6\" clazz=\"//@clazz.2\" visibility=\"private\" />\r\n" + 
				"    <ownedOperation ObjectID=\"f1693c\" name=\"Referent\" clazz=\"//@clazz.5\">\r\n" + 
				"      <ownedParameter ObjectID=\"f3338fb\" name=\"name\" type=\"//@packages.0/@ownedMemberPackage.3\" />\r\n" + 
				"      <ownedParameter ObjectID=\"f314a99\" name=\"adresse\" type=\"//@clazz.6\" />\r\n" + 
				"      <ownedParameter ObjectID=\"f4424df\" name=\"status\" type=\"//@enumerations.0\" />\r\n" + 
				"      <ownedParameter ObjectID=\"f3908a2\" name=\"firma\" type=\"//@packages.0/@ownedMemberPackage.3\" />\r\n" + 
				"      <stateMachine ObjectID=\"f45e9f4\" name=\"YStateMachinef45e9f4\">\r\n" + 
				"        <transition ObjectID=\"f287092\" name=\"YTransitionf287092\" source=\"//@clazz.5/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@clazz.5/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@clazz.5/@ownedOperation.0/@stateMachine/@trAttach.0\"/>\r\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f2b5a3\" name=\"YPseudostatef2b5a3\" outgoing=\"//@clazz.5/@ownedOperation.0/@stateMachine/@transition.0\"/>\r\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f75cdce\" name=\"YFinalStatef75cdce\" incoming=\"//@clazz.5/@ownedOperation.0/@stateMachine/@transition.0\"/>\r\n" + 
				"        <trAttach ObjectID=\"f1d5f4d\" name=\"YTrAttachmentf1d5f4d\" transition=\"//@clazz.5/@ownedOperation.0/@stateMachine/@transition.0\" guardStringRep=\"true;\">\r\n" + 
				"          <effects ObjectID=\"f67f22d\" effectStringRep=\"this.name = name;&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f789a81\" effectStringRep=\"this.adresse = adresse;&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f47db76\" effectStringRep=\"this.firma = firma;&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f27e528\" effectStringRep=\"&#xA;this.status = status;\"/>\r\n" + 
				"        </trAttach>\r\n" + 
				"      </stateMachine>\r\n" + 
				"    </ownedOperation>\r\n" + 
				"  </clazz>\r\n" + 
				"  <clazz ObjectID=\"f621d94\" name=\"Adresse\" superClass=\"//@clazz.0\">\r\n" + 
				"    <ownedAttribute ObjectID=\"f225d6\" name=\"strasse\" type=\"//@packages.0/@ownedMemberPackage.3\" clazz=\"//@clazz.6\" />\r\n" + 
				"    <ownedAttribute ObjectID=\"f74048e\" name=\"hausnummer\" defaultValue=\"&quot;1&quot;\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@clazz.6\" invariant=\">0\" />\r\n" + 
				"    <ownedAttribute ObjectID=\"f374419\" name=\"ort\" type=\"//@packages.0/@ownedMemberPackage.3\" clazz=\"//@clazz.6\" />\r\n" + 
				"    <ownedAttribute ObjectID=\"f5e84a2\" name=\"plz\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@clazz.6\" invariant=\">0\" />\r\n" + 
				"  </clazz>\r\n" + 
				"  <clazz ObjectID=\"f36f615\" name=\"DatumUndZeit\" superClass=\"//@clazz.0\">\r\n" + 
				"    <ownedAttribute ObjectID=\"f465b3f\" name=\"monat\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@clazz.7\" invariant=\"&lt;=31, >=1\" />\r\n" + 
				"    <ownedAttribute ObjectID=\"f70591c\" name=\"tag\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@clazz.7\" invariant=\"&lt;=12, >=1\" />\r\n" + 
				"    <ownedAttribute ObjectID=\"f4de638\" name=\"jahr\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@clazz.7\" invariant=\">=0\" />\r\n" + 
				"    <ownedAttribute ObjectID=\"f54a5b5\" name=\"stunde\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@clazz.7\" invariant=\">=0, &lt;=23\" />\r\n" + 
				"    <ownedAttribute ObjectID=\"f235db0\" name=\"minute\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@clazz.7\" invariant=\">=0, &lt;=59\" />\r\n" + 
				"    <ownedAttribute ObjectID=\"f244800\" name=\"dauerInMin\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@clazz.7\" invariant=\">=0\" />\r\n" + 
				"  </clazz>\r\n" + 
				"  <enumerations ObjectID=\"f75fdda\" name=\"Status\">\r\n" + 
				"    <ownedLiteral ObjectID=\"f6612c9\" name=\"Student\"/>\r\n" + 
				"    <ownedLiteral ObjectID=\"f35bc57\" name=\"Mitglied\"/>\r\n" + 
				"    <ownedLiteral ObjectID=\"f4b8625\" name=\"NichtMitglied\"/>\r\n" + 
				"  </enumerations>\r\n" + 
				"  <enumerations ObjectID=\"f649930\" name=\"Raum\">\r\n" + 
				"    <ownedLiteral ObjectID=\"f1d3a5f\" name=\"Raum1\"/>\r\n" + 
				"    <ownedLiteral ObjectID=\"f7080be\" name=\"Raum2\"/>\r\n" + 
				"    <ownedLiteral ObjectID=\"f6bb147\" name=\"Raum3\"/>\r\n" + 
				"    <ownedLiteral ObjectID=\"f22228a\" name=\"Raum4\"/>\r\n" + 
				"  </enumerations>\r\n" + 
				"  <packages ObjectID=\"f186d36\" name=\"Types\">\r\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f21f575\" name=\"Integer\" package=\"//@packages.0\"/>\r\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f6ff69c\" name=\"Double\" package=\"//@packages.0\"/>\r\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f143957\" name=\"Boolean\" package=\"//@packages.0\"/>\r\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f4f4a1\" name=\"String\" package=\"//@packages.0\"/>\r\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"fea65c\" name=\"Object\" package=\"//@packages.0\"/>\r\n" + 
				"  </packages>\r\n" + 
				"  <packages ObjectID=\"f2bcfa4\" name=\"DES\">\r\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f6f1844\" name=\"EventQueue\" package=\"//@packages.1\" superClass=\"//@clazz.0\">\r\n" + 
				"      <ownedOperation ObjectID=\"f78653a\" name=\"consume\" clazz=\"//@packages.1/@ownedMemberPackage.0\" returnType=\"//@packages.1/@ownedMemberPackage.3\">\r\n" + 
				"        <ownedParameter ObjectID=\"f741ee8\" name=\"timeStep\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\" />\r\n" + 
				"        <ownedParameter ObjectID=\"f325830\" name=\"past\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.2\" />\r\n" + 
				"        <ownedParameter ObjectID=\"f1385ca\" name=\"eventType\" isUnique=\"true\" type=\"//@clazz.1\" />\r\n" + 
				"        <ownedParameter ObjectID=\"f334831\" name=\"receiver\" isUnique=\"true\" type=\"//@clazz.0\" />\r\n" + 
				"        <ownedParameter ObjectID=\"f4cda47\" name=\"receiverType\" isUnique=\"true\" type=\"//@clazz.1\" />\r\n" + 
				"        <stateMachine ObjectID=\"f2a9bdf\" name=\"YStateMachinef2a9bdf\"/>\r\n" + 
				"      </ownedOperation>\r\n" + 
				"      <ownedOperation ObjectID=\"f60b252\" name=\"peek\" clazz=\"//@packages.1/@ownedMemberPackage.0\" returnType=\"//@packages.1/@ownedMemberPackage.3\">\r\n" + 
				"        <ownedParameter ObjectID=\"f465861\" name=\"timeStep\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\" />\r\n" + 
				"        <ownedParameter ObjectID=\"f4b5255\" name=\"past\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.2\" />\r\n" + 
				"        <ownedParameter ObjectID=\"f7afd77\" name=\"eventType\" isUnique=\"true\" type=\"//@clazz.1\" />\r\n" + 
				"        <ownedParameter ObjectID=\"f82b36\" name=\"receiver\" isUnique=\"true\" type=\"//@clazz.0\" />\r\n" + 
				"        <ownedParameter ObjectID=\"fd7951\" name=\"receiverType\" isUnique=\"true\" type=\"//@clazz.1\" />\r\n" + 
				"        <stateMachine ObjectID=\"f545e73\" name=\"YStateMachinef545e73\"/>\r\n" + 
				"      </ownedOperation>\r\n" + 
				"    </ownedMemberPackage>\r\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f7b30f\" name=\"Queue\" package=\"//@packages.1\" superClass=\"//@clazz.0 //@packages.1/@ownedMemberPackage.2\">\r\n" + 
				"      <ownedAttribute ObjectID=\"f9f8bb\" name=\"queue\" association=\"true\" upper=\"-1\" aggregation=\"composite\" type=\"//@packages.1/@ownedMemberPackage.2\" clazz=\"//@packages.1/@ownedMemberPackage.1\" />\r\n" + 
				"      <ownedAttribute ObjectID=\"f386ee1\" name=\"delayed\" association=\"true\" upper=\"-1\" aggregation=\"composite\" type=\"//@packages.1/@ownedMemberPackage.2\" clazz=\"//@packages.1/@ownedMemberPackage.1\" />\r\n" + 
				"      <ownedAttribute ObjectID=\"f2f987a\" name=\"event\" isUnique=\"true\" type=\"//@packages.1/@ownedMemberPackage.3\" clazz=\"//@packages.1/@ownedMemberPackage.1\" />\r\n" + 
				"      <ownedAttribute ObjectID=\"f660fa1\" name=\"var_objectManagment\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.4\" clazz=\"//@packages.1/@ownedMemberPackage.1\" />\r\n" + 
				"      <ownedOperation ObjectID=\"f20be76\" name=\"add\" clazz=\"//@packages.1/@ownedMemberPackage.1\">\r\n" + 
				"        <ownedParameter ObjectID=\"f4f4254\" name=\"object\" isUnique=\"true\" type=\"//@packages.1/@ownedMemberPackage.2\" />\r\n" + 
				"        <stateMachine ObjectID=\"f4abe3c\" name=\"YStateMachinef4abe3c\">\r\n" + 
				"          <transition ObjectID=\"f5e9a9b\" name=\"YTransitionf5e9a9b\" source=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.0/@stateMachine/@trAttach.0\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f38ff8d\" name=\"YPseudostatef38ff8d\" outgoing=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.0/@stateMachine/@transition.0\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f22957b\" name=\"YFinalStatef22957b\" incoming=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.0/@stateMachine/@transition.0\"/>\r\n" + 
				"          <trAttach ObjectID=\"f529472\" name=\"YTrAttachmentf529472\" transition=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.0/@stateMachine/@transition.0\" guardStringRep=\"true;\">\r\n" + 
				"            <effects ObjectID=\"f3d0304\" effectStringRep=\"queue.add(object);\"/>\r\n" + 
				"            <effects ObjectID=\"f160b70\" effectStringRep=\"var_objectManagment = getObjectManagement();\"/>\r\n" + 
				"            <effects ObjectID=\"f6420ae\" effectStringRep=\"(var_objectManagment as online.yamm.ObjectManagement).addQueueElement(this, object, 1);\"/>\r\n" + 
				"          </trAttach>\r\n" + 
				"        </stateMachine>\r\n" + 
				"      </ownedOperation>\r\n" + 
				"      <ownedOperation ObjectID=\"f68084f\" name=\"consume\" clazz=\"//@packages.1/@ownedMemberPackage.1\" returnType=\"//@packages.1/@ownedMemberPackage.2\">\r\n" + 
				"        <ownedParameter ObjectID=\"f34e890\" name=\"filterMap\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.4\" />\r\n" + 
				"        <stateMachine ObjectID=\"f467557\" name=\"YStateMachinef467557\"/>\r\n" + 
				"      </ownedOperation>\r\n" + 
				"      <ownedOperation ObjectID=\"f7b77c9\" name=\"peek\" clazz=\"//@packages.1/@ownedMemberPackage.1\" returnType=\"//@packages.1/@ownedMemberPackage.2\">\r\n" + 
				"        <ownedParameter ObjectID=\"f310db4\" name=\"filterMap\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.4\" />\r\n" + 
				"        <stateMachine ObjectID=\"f549a88\" name=\"YStateMachinef549a88\"/>\r\n" + 
				"      </ownedOperation>\r\n" + 
				"      <ownedOperation ObjectID=\"f275fe\" name=\"addWithDelay\" clazz=\"//@packages.1/@ownedMemberPackage.1\">\r\n" + 
				"        <ownedParameter ObjectID=\"f2f3872\" name=\"object\" isUnique=\"true\" type=\"//@packages.1/@ownedMemberPackage.2\" />\r\n" + 
				"        <ownedParameter ObjectID=\"f8dd49\" name=\"delay\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\" />\r\n" + 
				"        <ownedParameter ObjectID=\"f468ab9\" name=\"timeStep\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\" />\r\n" + 
				"        <stateMachine ObjectID=\"f48a287\" name=\"YStateMachinef48a287\">\r\n" + 
				"          <transition ObjectID=\"f58fd62\" name=\"YTransitionf58fd62\" source=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.3/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.3/@stateMachine/@subvertex.1\" attachment=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.3/@stateMachine/@trAttach.0\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f4b5238\" name=\"YPseudostatef4b5238\" outgoing=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.3/@stateMachine/@transition.0\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f5e46aa\" name=\"YFinalStatef5e46aa\" incoming=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.3/@stateMachine/@transition.0\"/>\r\n" + 
				"          <trAttach ObjectID=\"f459b0\" name=\"YTrAttachmentf459b0\" transition=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.3/@stateMachine/@transition.0\" guardStringRep=\"true;\">\r\n" + 
				"            <effects ObjectID=\"f3af920\" effectStringRep=\"var_objectManagment = getObjectManagement();\"/>\r\n" + 
				"            <effects ObjectID=\"f3726ea\" effectStringRep=\"(var_objectManagment as online.yamm.ObjectManagement).addDelayedQueueElement(this, object, 1);\"/>\r\n" + 
				"            <effects ObjectID=\"f59be5a\" effectStringRep=\"delayed.add(object);\"/>\r\n" + 
				"            <effects ObjectID=\"f6f18ad\" effectStringRep=\"event = new Delay;\"/>\r\n" + 
				"            <effects ObjectID=\"f28d54b\" effectStringRep=\"event.timeStep = timeStep + delay;\"/>\r\n" + 
				"            <effects ObjectID=\"f3ae638\" effectStringRep=\"event.objectAttached = object;\"/>\r\n" + 
				"            <effects ObjectID=\"f5109cb\" effectStringRep=\"event.receivingObject = this;\"/>\r\n" + 
				"          </trAttach>\r\n" + 
				"        </stateMachine>\r\n" + 
				"      </ownedOperation>\r\n" + 
				"      <ownedOperation ObjectID=\"f764840\" name=\"simulate\" clazz=\"//@packages.1/@ownedMemberPackage.1\" returnType=\"//@packages.0/@ownedMemberPackage.2\">\r\n" + 
				"        <ownedParameter ObjectID=\"f68416a\" name=\"timeStep\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\" />\r\n" + 
				"        <stateMachine ObjectID=\"f7e7e66\" name=\"YStateMachinef7e7e66\">\r\n" + 
				"          <transition ObjectID=\"f2b7fa1\" name=\"YTransitionf2b7fa1\" source=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.2\" target=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.0\" attachment=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@trAttach.0\"/>\r\n" + 
				"          <transition ObjectID=\"f4bfb83\" name=\"YTransitionf4bfb83\" source=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.1\" attachment=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@trAttach.1\"/>\r\n" + 
				"          <transition ObjectID=\"f78cae7\" name=\"YTransitionf78cae7\" source=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.1\" target=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.3\" attachment=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@trAttach.2\"/>\r\n" + 
				"          <transition ObjectID=\"f3b1426\" name=\"YTransitionf3b1426\" source=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.1\" target=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.3\" attachment=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@trAttach.3\"/>\r\n" + 
				"          <transition ObjectID=\"f411019\" name=\"YTransitionf411019\" source=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.3\" attachment=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@trAttach.4\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"fe5506\" name=\"YStatefe5506\" outgoing=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.1 //@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.4\" incoming=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.0\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f4cf3d0\" name=\"YStatef4cf3d0\" outgoing=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.2 //@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.3\" incoming=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.1\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f384d51\" name=\"YPseudostatef384d51\" outgoing=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.0\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f2e7b01\" name=\"YFinalStatef2e7b01\" incoming=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.2 //@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.3 //@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.4\"/>\r\n" + 
				"          <trAttach ObjectID=\"f14e78f\" name=\"YTrAttachmentf14e78f\" transition=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.0\" guardStringRep=\"true;\">\r\n" + 
				"            <effects ObjectID=\"f48c6c2\" effectStringRep=\"event = DES.EventQueue.peek(timeStep, true, null, this, null);\"/>\r\n" + 
				"          </trAttach>\r\n" + 
				"          <trAttach ObjectID=\"f1e9b4e\" name=\"YTrAttachmentf1e9b4e\" transition=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.1\" guardStringRep=\"event != null;\"/>\r\n" + 
				"          <trAttach ObjectID=\"f5eb936\" name=\"YTrAttachmentf5eb936\" transition=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.2\" guardStringRep=\"event instanceof Delay;\">\r\n" + 
				"            <effects ObjectID=\"f2c724a\" effectStringRep=\"DES.EventQueue.consume(timeStep, true, null, this, null);\"/>\r\n" + 
				"            <effects ObjectID=\"fe6655\" effectStringRep=\"(var_objectManagment as online.yamm.ObjectManagement).removeDelayedQueueElement(this, event.objectAttached, 1);\"/>\r\n" + 
				"            <effects ObjectID=\"fb8378\" effectStringRep=\"add(event.objectAttached);\"/>\r\n" + 
				"            <effects ObjectID=\"f271ec5\" effectStringRep=\"setReturnValue(true);\"/>\r\n" + 
				"          </trAttach>\r\n" + 
				"          <trAttach ObjectID=\"f3696b8\" name=\"YTrAttachmentf3696b8\" transition=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.3\" guardStringRep=\"!(event instanceof Delay);\">\r\n" + 
				"            <effects ObjectID=\"f430192\" effectStringRep=\"setReturnValue(false);\"/>\r\n" + 
				"          </trAttach>\r\n" + 
				"          <trAttach ObjectID=\"f11f883\" name=\"YTrAttachmentf11f883\" transition=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.4\" guardStringRep=\"event == null;\">\r\n" + 
				"            <effects ObjectID=\"f41db92\" effectStringRep=\"setReturnValue(false);\"/>\r\n" + 
				"          </trAttach>\r\n" + 
				"        </stateMachine>\r\n" + 
				"      </ownedOperation>\r\n" + 
				"    </ownedMemberPackage>\r\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f40b04f\" name=\"SimulationObject\" package=\"//@packages.1\" superClass=\"//@clazz.0\">\r\n" + 
				"      <ownedAttribute ObjectID=\"f555e10\" name=\"name\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.3\" clazz=\"//@packages.1/@ownedMemberPackage.2\" />\r\n" + 
				"      <ownedOperation ObjectID=\"f10ddfa\" name=\"simulate\" clazz=\"//@packages.1/@ownedMemberPackage.2\" returnType=\"//@packages.0/@ownedMemberPackage.2\">\r\n" + 
				"        <ownedParameter ObjectID=\"f7873fc\" name=\"timeStep\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\" />\r\n" + 
				"        <stateMachine ObjectID=\"f2ac9f0\" name=\"YStateMachinef2ac9f0\">\r\n" + 
				"          <transition ObjectID=\"f79f4b8\" name=\"YTransitionf79f4b8\" source=\"//@packages.1/@ownedMemberPackage.2/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.2/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@packages.1/@ownedMemberPackage.2/@ownedOperation.0/@stateMachine/@trAttach.0\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f68bf82\" name=\"YPseudostatef68bf82\" outgoing=\"//@packages.1/@ownedMemberPackage.2/@ownedOperation.0/@stateMachine/@transition.0\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f68c2fb\" name=\"YFinalStatef68c2fb\" incoming=\"//@packages.1/@ownedMemberPackage.2/@ownedOperation.0/@stateMachine/@transition.0\"/>\r\n" + 
				"          <trAttach ObjectID=\"f352f8d\" name=\"YTrAttachmentf352f8d\" transition=\"//@packages.1/@ownedMemberPackage.2/@ownedOperation.0/@stateMachine/@transition.0\" guardStringRep=\"true;\">\r\n" + 
				"            <effects ObjectID=\"f284471\" effectStringRep=\"setReturnValue(false);\"/>\r\n" + 
				"          </trAttach>\r\n" + 
				"        </stateMachine>\r\n" + 
				"      </ownedOperation>\r\n" + 
				"    </ownedMemberPackage>\r\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f2a26c9\" name=\"Event\" package=\"//@packages.1\" superClass=\"//@clazz.0\">\r\n" + 
				"      <ownedAttribute ObjectID=\"f3128f5\" name=\"timeStep\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@packages.1/@ownedMemberPackage.3\" />\r\n" + 
				"      <ownedAttribute ObjectID=\"f4063c7\" name=\"receivingType\" isUnique=\"true\" type=\"//@clazz.1\" clazz=\"//@packages.1/@ownedMemberPackage.3\" />\r\n" + 
				"      <ownedAttribute ObjectID=\"f197074\" name=\"description\" type=\"//@packages.0/@ownedMemberPackage.3\" clazz=\"//@packages.1/@ownedMemberPackage.3\" />\r\n" + 
				"      <ownedAttribute ObjectID=\"f94f5c\" name=\"receivingObject\" association=\"true\" isUnique=\"true\" type=\"//@packages.1/@ownedMemberPackage.2\" clazz=\"//@packages.1/@ownedMemberPackage.3\" >\r\n" + 
				"        <ownedElement xsi:type=\"yammDiagram:YParameter\" ObjectID=\"f465861\" name=\"timeStep\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\" />\r\n" + 
				"      </ownedAttribute>\r\n" + 
				"      <ownedAttribute ObjectID=\"f210054\" name=\"objectAttached\" association=\"true\" isUnique=\"true\" type=\"//@packages.1/@ownedMemberPackage.2\" clazz=\"//@packages.1/@ownedMemberPackage.3\" />\r\n" + 
				"      <ownedOperation ObjectID=\"f6b9c0b\" name=\"toString\" clazz=\"//@packages.1/@ownedMemberPackage.3\" returnType=\"//@packages.0/@ownedMemberPackage.3\">\r\n" + 
				"        <stateMachine ObjectID=\"f694554\" name=\"YStateMachinef694554\">\r\n" + 
				"          <transition ObjectID=\"f76f663\" name=\"YTransitionf76f663\" source=\"//@packages.1/@ownedMemberPackage.3/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.3/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@packages.1/@ownedMemberPackage.3/@ownedOperation.0/@stateMachine/@trAttach.0\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f759d05\" name=\"YPseudostatef759d05\" outgoing=\"//@packages.1/@ownedMemberPackage.3/@ownedOperation.0/@stateMachine/@transition.0\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f190b71\" name=\"YFinalStatef190b71\" incoming=\"//@packages.1/@ownedMemberPackage.3/@ownedOperation.0/@stateMachine/@transition.0\"/>\r\n" + 
				"          <trAttach ObjectID=\"f776ef5\" name=\"YTrAttachmentf776ef5\" transition=\"//@packages.1/@ownedMemberPackage.3/@ownedOperation.0/@stateMachine/@transition.0\" guardStringRep=\"true;\">\r\n" + 
				"            <effects ObjectID=\"f1ac343\" effectStringRep=\"setReturnValue(&quot;TODO: Event.toString()&quot;);\"/>\r\n" + 
				"          </trAttach>\r\n" + 
				"        </stateMachine>\r\n" + 
				"      </ownedOperation>\r\n" + 
				"    </ownedMemberPackage>\r\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f5961ed\" name=\"Randomizer\" package=\"//@packages.1\" superClass=\"//@clazz.0\">\r\n" + 
				"      <ownedAttribute ObjectID=\"f49b547\" name=\"random\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.4\" />\r\n" + 
				"      <ownedAttribute ObjectID=\"f13e889\" name=\"USE_GAUSSIAN\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.2\" clazz=\"//@packages.1/@ownedMemberPackage.4\" />\r\n" + 
				"      <ownedAttribute ObjectID=\"f66b9ac\" name=\"i\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@packages.1/@ownedMemberPackage.4\" />\r\n" + 
				"      <ownedAttribute ObjectID=\"f19d97b\" name=\"prob2Int\" association=\"true\" upper=\"-1\" aggregation=\"composite\" type=\"//@packages.1/@ownedMemberPackage.5\" clazz=\"//@packages.1/@ownedMemberPackage.4\" />\r\n" + 
				"      <ownedAttribute ObjectID=\"f41fa4e\" name=\"entry\" association=\"true\" isUnique=\"true\" type=\"//@packages.1/@ownedMemberPackage.5\" clazz=\"//@packages.1/@ownedMemberPackage.4\" />\r\n" + 
				"      <ownedAttribute ObjectID=\"f7d11a1\" name=\"r\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.1\" clazz=\"//@packages.1/@ownedMemberPackage.4\" />\r\n" + 
				"      <ownedAttribute ObjectID=\"f672a3d\" name=\"x\" isUnique=\"true\" defaultValue=\"&quot;0&quot;\" type=\"//@packages.0/@ownedMemberPackage.1\" clazz=\"//@packages.1/@ownedMemberPackage.4\" />\r\n" + 
				"      <ownedAttribute ObjectID=\"f64dcec\" name=\"sumAllProp\" isUnique=\"true\" defaultValue=\"&quot;0&quot;\" type=\"//@packages.0/@ownedMemberPackage.1\" clazz=\"//@packages.1/@ownedMemberPackage.4\" />\r\n" + 
				"      <ownedOperation ObjectID=\"f27d00b\" name=\"addProbInt\" clazz=\"//@packages.1/@ownedMemberPackage.4\">\r\n" + 
				"        <ownedParameter ObjectID=\"f46955f\" name=\"to\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.1\" />\r\n" + 
				"        <ownedParameter ObjectID=\"f547076\" name=\"value\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\" />\r\n" + 
				"        <stateMachine ObjectID=\"f7f9230\" name=\"YStateMachinef7f9230\">\r\n" + 
				"          <transition ObjectID=\"f16bfc2\" name=\"YTransitionf16bfc2\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.0/@stateMachine/@trAttach.0\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f5ef90\" name=\"YPseudostatef5ef90\" outgoing=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.0/@stateMachine/@transition.0\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f3b08da\" name=\"YFinalStatef3b08da\" incoming=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.0/@stateMachine/@transition.0\"/>\r\n" + 
				"          <trAttach ObjectID=\"f4c947d\" name=\"YTrAttachmentf4c947d\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.0/@stateMachine/@transition.0\" guardStringRep=\"true;\">\r\n" + 
				"            <effects ObjectID=\"f46566a\" effectStringRep=\"sumAllProp = sumAllProp + to;\"/>\r\n" + 
				"            <effects ObjectID=\"f4dc7ba\" effectStringRep=\"prob2Int.add(new Probability2Value);\"/>\r\n" + 
				"            <effects ObjectID=\"f20b257\" effectStringRep=\"prob2Int.get(prob2Int.size - 1).probabilityUpperLimit = to;\"/>\r\n" + 
				"            <effects ObjectID=\"f5793d3\" effectStringRep=\"prob2Int.get(prob2Int.size - 1).value = value;\"/>\r\n" + 
				"          </trAttach>\r\n" + 
				"        </stateMachine>\r\n" + 
				"      </ownedOperation>\r\n" + 
				"      <ownedOperation ObjectID=\"f66c63\" name=\"nextInt\" clazz=\"//@packages.1/@ownedMemberPackage.4\" returnType=\"//@packages.0/@ownedMemberPackage.0\">\r\n" + 
				"        <stateMachine ObjectID=\"f30aac5\" name=\"YStateMachinef30aac5\">\r\n" + 
				"          <transition ObjectID=\"f5626fe\" name=\"YTransitionf5626fe\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.2\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@trAttach.0\"/>\r\n" + 
				"          <transition ObjectID=\"f43cf6d\" name=\"YTransitionf43cf6d\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.2\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@trAttach.1\"/>\r\n" + 
				"          <transition ObjectID=\"f532d9a\" name=\"YTransitionf532d9a\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.5\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.3\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@trAttach.2\"/>\r\n" + 
				"          <transition ObjectID=\"f1d935c\" name=\"YTransitionf1d935c\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.4\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.3\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@trAttach.3\"/>\r\n" + 
				"          <transition ObjectID=\"f7c9630\" name=\"YTransitionf7c9630\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.3\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.4\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@trAttach.4\"/>\r\n" + 
				"          <transition ObjectID=\"f146bd8\" name=\"YTransitionf146bd8\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.3\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.1\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@trAttach.5\"/>\r\n" + 
				"          <transition ObjectID=\"f19a4e3\" name=\"YTransitionf19a4e3\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.4\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.1\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@trAttach.6\"/>\r\n" + 
				"          <transition ObjectID=\"f1440f2\" name=\"YTransitionf1440f2\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.2\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.5\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@trAttach.7\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f311e7\" name=\"YPseudostatef311e7\" outgoing=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.0 //@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.1\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f4ede39\" name=\"YFinalStatef4ede39\" incoming=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.5 //@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.6\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f1c1425\" name=\"YStatef1c1425\" outgoing=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.7\" incoming=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.0 //@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.1\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f6c9142\" name=\"YStatef6c9142\" outgoing=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.4 //@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.5\" incoming=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.2 //@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.3\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f6995d3\" name=\"YStatef6995d3\" outgoing=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.3 //@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.6\" incoming=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.4\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f577f47\" name=\"YStatef577f47\" outgoing=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.2\" incoming=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.7\"/>\r\n" + 
				"          <trAttach ObjectID=\"f59536\" name=\"YTrAttachmentf59536\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.0\" guardStringRep=\"USE_GAUSSIAN;\">\r\n" + 
				"            <effects ObjectID=\"f6de5ab\" effectStringRep=\"r = (random as java.util.Random).nextGaussian;\"/>\r\n" + 
				"          </trAttach>\r\n" + 
				"          <trAttach ObjectID=\"f70685\" name=\"YTrAttachmentf70685\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.1\" guardStringRep=\"!USE_GAUSSIAN;\">\r\n" + 
				"            <effects ObjectID=\"f325de1\" effectStringRep=\"r = (random as java.util.Random).nextDouble;\"/>\r\n" + 
				"          </trAttach>\r\n" + 
				"          <trAttach ObjectID=\"f2dd09a\" name=\"YTrAttachmentf2dd09a\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.2\" guardStringRep=\"true;\">\r\n" + 
				"            <effects ObjectID=\"f2050fd\" effectStringRep=\"x = 0;\"/>\r\n" + 
				"            <effects ObjectID=\"f728e4a\" effectStringRep=\"i = 0;\"/>\r\n" + 
				"          </trAttach>\r\n" + 
				"          <trAttach ObjectID=\"f654c2c\" name=\"YTrAttachmentf654c2c\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.3\" guardStringRep=\"r > entry.probabilityUpperLimit + x;\"/>\r\n" + 
				"          <trAttach ObjectID=\"f177a55\" name=\"YTrAttachmentf177a55\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.4\" guardStringRep=\"i &lt; prob2Int.size;\">\r\n" + 
				"            <effects ObjectID=\"f2bde0d\" effectStringRep=\"entry = prob2Int.get(i++);\"/>\r\n" + 
				"            <effects ObjectID=\"f4be425\" effectStringRep=\"x = x + entry.probabilityUpperLimit;\"/>\r\n" + 
				"          </trAttach>\r\n" + 
				"          <trAttach ObjectID=\"f34e904\" name=\"YTrAttachmentf34e904\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.5\" guardStringRep=\"i >= prob2Int.size;\">\r\n" + 
				"            <effects ObjectID=\"f1b61b9\" effectStringRep=\"setReturnValue(0);\"/>\r\n" + 
				"          </trAttach>\r\n" + 
				"          <trAttach ObjectID=\"f6e4855\" name=\"YTrAttachmentf6e4855\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.6\" guardStringRep=\"r &lt;= entry.probabilityUpperLimit + x;\">\r\n" + 
				"            <effects ObjectID=\"f7a9b6f\" effectStringRep=\"setReturnValue(entry.value);\"/>\r\n" + 
				"          </trAttach>\r\n" + 
				"          <trAttach ObjectID=\"f7758dd\" name=\"YTrAttachmentf7758dd\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.7\" guardStringRep=\"true;\">\r\n" + 
				"            <effects ObjectID=\"f5dc2c3\" effectStringRep=\"r = r * sumAllProp;\"/>\r\n" + 
				"          </trAttach>\r\n" + 
				"        </stateMachine>\r\n" + 
				"      </ownedOperation>\r\n" + 
				"    </ownedMemberPackage>\r\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f6019cc\" name=\"Probability2Value\" package=\"//@packages.1\" superClass=\"//@clazz.0\">\r\n" + 
				"      <ownedAttribute ObjectID=\"f5512dc\" name=\"probabilityUpperLimit\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.1\" clazz=\"//@packages.1/@ownedMemberPackage.5\" />\r\n" + 
				"      <ownedAttribute ObjectID=\"f6e635c\" name=\"value\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@packages.1/@ownedMemberPackage.5\" />\r\n" + 
				"    </ownedMemberPackage>\r\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f67d23f\" name=\"Delay\" package=\"//@packages.1\" superClass=\"//@clazz.0 //@packages.1/@ownedMemberPackage.3\"/>\r\n" + 
				"  </packages>\r\n" + 
				"</yammDiagram:YModel>\r\n" + 
				"";
	}
	public static String desGeldautomatExample() {
		return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n" + 
				"<yammDiagram:YModel xmi:version=\"2.0\" xmlns:xmi=\"http://www.omg.org/XMI\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:yammDiagram=\"http://www.yamm.online/coreModelDiagram/YammDiagram\">\r\n" + 
				"  <clazz ObjectID=\"f5e24a2\" name=\"RObject\">\r\n" + 
				"    <ownedAttribute ObjectID=\"f2bd771\" name=\"rContainer\" type=\"//@clazz.0\" clazz=\"//@clazz.0\"/>\r\n" + 
				"    <ownedAttribute ObjectID=\"f55ebef\" name=\"yClass\" type=\"//@packages.0/@ownedMemberPackage.4\" clazz=\"//@clazz.0\"/>\r\n" + 
				"    <ownedAttribute ObjectID=\"fbb4ab\" name=\"ObjectID\" type=\"//@packages.0/@ownedMemberPackage.3\" clazz=\"//@clazz.0\"/>\r\n" + 
				"  </clazz>\r\n" + 
				"  <clazz ObjectID=\"f4cc70d\" name=\"YClass\" superClass=\"//@clazz.0\"/>\r\n" + 
				"  <clazz ObjectID=\"f7bf7f7\" name=\"Geldautomat\" superClass=\"//@clazz.0 //@packages.1/@ownedMemberPackage.2\">\r\n" + 
				"    <ownedAttribute ObjectID=\"f10b420\" name=\"aufEventWartendeZustaend\" isUnique=\"true\" type=\"//@enumerations.0\" clazz=\"//@clazz.2\"/>\r\n" + 
				"    <ownedAttribute ObjectID=\"f3a5139\" name=\"event\" isUnique=\"true\" type=\"//@packages.1/@ownedMemberPackage.3\" clazz=\"//@clazz.2\"/>\r\n" + 
				"    <ownedAttribute ObjectID=\"f3aa10d\" name=\"geldkarte\" association=\"true\" type=\"//@clazz.4\" clazz=\"//@clazz.2\"/>\r\n" + 
				"    <ownedAttribute ObjectID=\"f7f7449\" name=\"eingetippteGeheimzahl\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@clazz.2\"/>\r\n" + 
				"    <ownedAttribute ObjectID=\"f554533\" name=\"eingetippteBetrag\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@clazz.2\"/>\r\n" + 
				"    <ownedAttribute ObjectID=\"f181cef\" name=\"anzahlBetragEingabe\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@clazz.2\"/>\r\n" + 
				"    <ownedOperation ObjectID=\"f132669\" name=\"Geldautomat\" clazz=\"//@clazz.2\">\r\n" + 
				"      <stateMachine ObjectID=\"f3d42e8\" name=\"YStateMachinef3d42e8\">\r\n" + 
				"        <transition ObjectID=\"f672783\" name=\"YTransitionf672783\" source=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@clazz.2/@ownedOperation.0/@stateMachine/@trAttach.0\"/>\r\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f183a5d\" name=\"YPseudostatef183a5d\" outgoing=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.0\"/>\r\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f353b1a\" name=\"YFinalStatef353b1a\" incoming=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.0\"/>\r\n" + 
				"        <trAttach ObjectID=\"f3dd163\" name=\"YTrAttachmentf3dd163\" transition=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.0\" guardStringRep=\"true;\">\r\n" + 
				"          <effects ObjectID=\"f1b79a\" effectStringRep=\"aufEventWartendeZustaend = AufEventWartendeZustaendeGeldautomat.bereit;&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f738bbd\" effectStringRep=\"event = new WarteAufKarte;&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f1cf8c1\" effectStringRep=\"event.timeStep = 0;&#xA;\"/>\r\n" + 
				"        </trAttach>\r\n" + 
				"      </stateMachine>\r\n" + 
				"    </ownedOperation>\r\n" + 
				"    <ownedOperation ObjectID=\"f640783\" name=\"simulate\" clazz=\"//@clazz.2\" returnType=\"//@packages.0/@ownedMemberPackage.2\">\r\n" + 
				"      <ownedParameter ObjectID=\"f54b869\" name=\"timeStep\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\r\n" + 
				"      <stateMachine ObjectID=\"f56d821\" name=\"YStateMachinef56d821\">\r\n" + 
				"        <transition ObjectID=\"f219bcf\" name=\"YTransitionf219bcf\" source=\"//@clazz.2/@ownedOperation.1/@stateMachine/@subvertex.0\" target=\"//@clazz.2/@ownedOperation.1/@stateMachine/@subvertex.2\" attachment=\"//@clazz.2/@ownedOperation.1/@stateMachine/@trAttach.0\"/>\r\n" + 
				"        <transition ObjectID=\"f3abe95\" name=\"YTransitionf3abe95\" source=\"//@clazz.2/@ownedOperation.1/@stateMachine/@subvertex.2\" target=\"//@clazz.2/@ownedOperation.1/@stateMachine/@subvertex.1\" attachment=\"//@clazz.2/@ownedOperation.1/@stateMachine/@trAttach.1\"/>\r\n" + 
				"        <transition ObjectID=\"f2589eb\" name=\"YTransitionf2589eb\" source=\"//@clazz.2/@ownedOperation.1/@stateMachine/@subvertex.2\" target=\"//@clazz.2/@ownedOperation.1/@stateMachine/@subvertex.1\" attachment=\"//@clazz.2/@ownedOperation.1/@stateMachine/@trAttach.2\"/>\r\n" + 
				"        <transition ObjectID=\"f1de8c4\" name=\"YTransitionf1de8c4\" source=\"//@clazz.2/@ownedOperation.1/@stateMachine/@subvertex.4\" target=\"//@clazz.2/@ownedOperation.1/@stateMachine/@subvertex.3\" attachment=\"//@clazz.2/@ownedOperation.1/@stateMachine/@trAttach.3\"/>\r\n" + 
				"        <transition ObjectID=\"f81df5\" name=\"YTransitionf81df5\" source=\"//@clazz.2/@ownedOperation.1/@stateMachine/@subvertex.0\" target=\"//@clazz.2/@ownedOperation.1/@stateMachine/@subvertex.4\" attachment=\"//@clazz.2/@ownedOperation.1/@stateMachine/@trAttach.4\"/>\r\n" + 
				"        <transition ObjectID=\"f691a06\" name=\"YTransitionf691a06\" source=\"//@clazz.2/@ownedOperation.1/@stateMachine/@subvertex.0\" target=\"//@clazz.2/@ownedOperation.1/@stateMachine/@subvertex.5\" attachment=\"//@clazz.2/@ownedOperation.1/@stateMachine/@trAttach.5\"/>\r\n" + 
				"        <transition ObjectID=\"f1cf96d\" name=\"YTransitionf1cf96d\" source=\"//@clazz.2/@ownedOperation.1/@stateMachine/@subvertex.0\" target=\"//@clazz.2/@ownedOperation.1/@stateMachine/@subvertex.1\" attachment=\"//@clazz.2/@ownedOperation.1/@stateMachine/@trAttach.6\"/>\r\n" + 
				"        <transition ObjectID=\"f307695\" name=\"YTransitionf307695\" source=\"//@clazz.2/@ownedOperation.1/@stateMachine/@subvertex.4\" target=\"//@clazz.2/@ownedOperation.1/@stateMachine/@subvertex.1\" attachment=\"//@clazz.2/@ownedOperation.1/@stateMachine/@trAttach.7\"/>\r\n" + 
				"        <transition ObjectID=\"f6be8ff\" name=\"YTransitionf6be8ff\" source=\"//@clazz.2/@ownedOperation.1/@stateMachine/@subvertex.3\" target=\"//@clazz.2/@ownedOperation.1/@stateMachine/@subvertex.1\" attachment=\"//@clazz.2/@ownedOperation.1/@stateMachine/@trAttach.8\"/>\r\n" + 
				"        <transition ObjectID=\"f59d710\" name=\"YTransitionf59d710\" source=\"//@clazz.2/@ownedOperation.1/@stateMachine/@subvertex.3\" target=\"//@clazz.2/@ownedOperation.1/@stateMachine/@subvertex.1\" attachment=\"//@clazz.2/@ownedOperation.1/@stateMachine/@trAttach.9\"/>\r\n" + 
				"        <transition ObjectID=\"f3c4e41\" name=\"YTransitionf3c4e41\" source=\"//@clazz.2/@ownedOperation.1/@stateMachine/@subvertex.5\" target=\"//@clazz.2/@ownedOperation.1/@stateMachine/@subvertex.1\" attachment=\"//@clazz.2/@ownedOperation.1/@stateMachine/@trAttach.10\"/>\r\n" + 
				"        <transition ObjectID=\"f4c8fd7\" name=\"YTransitionf4c8fd7\" source=\"//@clazz.2/@ownedOperation.1/@stateMachine/@subvertex.5\" target=\"//@clazz.2/@ownedOperation.1/@stateMachine/@subvertex.6\" attachment=\"//@clazz.2/@ownedOperation.1/@stateMachine/@trAttach.11\"/>\r\n" + 
				"        <transition ObjectID=\"f62d9ed\" name=\"YTransitionf62d9ed\" source=\"//@clazz.2/@ownedOperation.1/@stateMachine/@subvertex.6\" target=\"//@clazz.2/@ownedOperation.1/@stateMachine/@subvertex.1\" attachment=\"//@clazz.2/@ownedOperation.1/@stateMachine/@trAttach.12\"/>\r\n" + 
				"        <transition ObjectID=\"f68c913\" name=\"YTransitionf68c913\" source=\"//@clazz.2/@ownedOperation.1/@stateMachine/@subvertex.6\" target=\"//@clazz.2/@ownedOperation.1/@stateMachine/@subvertex.1\" attachment=\"//@clazz.2/@ownedOperation.1/@stateMachine/@trAttach.13\"/>\r\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f174077\" name=\"YPseudostatef174077\" outgoing=\"//@clazz.2/@ownedOperation.1/@stateMachine/@transition.0 //@clazz.2/@ownedOperation.1/@stateMachine/@transition.4 //@clazz.2/@ownedOperation.1/@stateMachine/@transition.5 //@clazz.2/@ownedOperation.1/@stateMachine/@transition.6\"/>\r\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f74e1c\" name=\"YFinalStatef74e1c\" incoming=\"//@clazz.2/@ownedOperation.1/@stateMachine/@transition.6 //@clazz.2/@ownedOperation.1/@stateMachine/@transition.2 //@clazz.2/@ownedOperation.1/@stateMachine/@transition.1 //@clazz.2/@ownedOperation.1/@stateMachine/@transition.7 //@clazz.2/@ownedOperation.1/@stateMachine/@transition.8 //@clazz.2/@ownedOperation.1/@stateMachine/@transition.9 //@clazz.2/@ownedOperation.1/@stateMachine/@transition.10 //@clazz.2/@ownedOperation.1/@stateMachine/@transition.12 //@clazz.2/@ownedOperation.1/@stateMachine/@transition.13\"/>\r\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f6c5152\" name=\"YStatef6c5152\" outgoing=\"//@clazz.2/@ownedOperation.1/@stateMachine/@transition.1 //@clazz.2/@ownedOperation.1/@stateMachine/@transition.2\" incoming=\"//@clazz.2/@ownedOperation.1/@stateMachine/@transition.0\"/>\r\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f764b21\" name=\"YStatef764b21\" outgoing=\"//@clazz.2/@ownedOperation.1/@stateMachine/@transition.8 //@clazz.2/@ownedOperation.1/@stateMachine/@transition.9\" incoming=\"//@clazz.2/@ownedOperation.1/@stateMachine/@transition.3\"/>\r\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f7decfc\" name=\"YStatef7decfc\" outgoing=\"//@clazz.2/@ownedOperation.1/@stateMachine/@transition.7 //@clazz.2/@ownedOperation.1/@stateMachine/@transition.3\" incoming=\"//@clazz.2/@ownedOperation.1/@stateMachine/@transition.4\"/>\r\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f1fe771\" name=\"YStatef1fe771\" outgoing=\"//@clazz.2/@ownedOperation.1/@stateMachine/@transition.10 //@clazz.2/@ownedOperation.1/@stateMachine/@transition.11\" incoming=\"//@clazz.2/@ownedOperation.1/@stateMachine/@transition.5\"/>\r\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f73c6fd\" name=\"YStatef73c6fd\" outgoing=\"//@clazz.2/@ownedOperation.1/@stateMachine/@transition.12 //@clazz.2/@ownedOperation.1/@stateMachine/@transition.13\" incoming=\"//@clazz.2/@ownedOperation.1/@stateMachine/@transition.11\"/>\r\n" + 
				"        <trAttach ObjectID=\"f727ec9\" name=\"YTrAttachmentf727ec9\" transition=\"//@clazz.2/@ownedOperation.1/@stateMachine/@transition.0\" guardStringRep=\"DES.EventQueue.peek(timeStep, true, KarteEingefuegt.yClass as YClass, null, null) != null&#xA;&amp;&amp; aufEventWartendeZustaend == AufEventWartendeZustaendeGeldautomat.bereit;&#xA;\">\r\n" + 
				"          <effects ObjectID=\"f366ae6\" breakpoint=\"true\" effectStringRep=\"event = DES.EventQueue.consume(timeStep, true, KarteEingefuegt.yClass as YClass, null, null);\"/>\r\n" + 
				"          <effects ObjectID=\"f5d89f4\" effectStringRep=\"geldkarte = (event as KarteEingefuegt).geldkarte;&#xA;&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f636139\" effectStringRep=\"Print(&quot;Karte eingegeben&quot;);&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f2aa068\" effectStringRep=\"Print(&quot;prüfe Karte&quot;);&#xA;\"/>\r\n" + 
				"        </trAttach>\r\n" + 
				"        <trAttach ObjectID=\"f5799ff\" name=\"YTrAttachmentf5799ff\" transition=\"//@clazz.2/@ownedOperation.1/@stateMachine/@transition.1\" guardStringRep=\"geldkarte.fehlversuche >= 3;&#xA;\">\r\n" + 
				"          <effects ObjectID=\"f68168\" effectStringRep=\"Print(&quot;Prüfung nicht erfolgreich, keine Fehlversuche mehr übrig, Karte ausgegeben, warte auf Karte&quot;);&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f1b9098\" effectStringRep=\"aufEventWartendeZustaend = AufEventWartendeZustaendeGeldautomat.bereit;&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f7560a7\" effectStringRep=\"event = new WarteAufKarte;&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f60e454\" effectStringRep=\"event.timeStep = timeStep;&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f39af66\" effectStringRep=\"geldkarte = null; // auswerfen der Karte&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f7b9aec\" effectStringRep=\"&#xA;setReturnValue(true);\"/>\r\n" + 
				"        </trAttach>\r\n" + 
				"        <trAttach ObjectID=\"f24a74b\" name=\"YTrAttachmentf24a74b\" transition=\"//@clazz.2/@ownedOperation.1/@stateMachine/@transition.2\" guardStringRep=\"geldkarte.fehlversuche &lt; 3;&#xA;\">\r\n" + 
				"          <effects ObjectID=\"f6d738a\" effectStringRep=\"Print(&quot;Prüfung erfolgreich, warten auf Geheimzahl&quot;);&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f11b633\" effectStringRep=\"aufEventWartendeZustaend = AufEventWartendeZustaendeGeldautomat.wartenAufGeheimzahl;&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f6ec6bb\" effectStringRep=\"event = new WarteAufGeheimzahl;&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f29109b\" effectStringRep=\"event.timeStep = timeStep;&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f673380\" effectStringRep=\"&#xA;setReturnValue(true);\"/>\r\n" + 
				"        </trAttach>\r\n" + 
				"        <trAttach ObjectID=\"f42a3cb\" name=\"YTrAttachmentf42a3cb\" transition=\"//@clazz.2/@ownedOperation.1/@stateMachine/@transition.3\" guardStringRep=\"geldkarte.geheimzahl != eingetippteGeheimzahl;\">\r\n" + 
				"          <effects ObjectID=\"f873cd\" effectStringRep=\"Print(&quot;Geheimzahl falsch&quot;);&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f3b28f7\" effectStringRep=\"geldkarte.fehlversuche++;&#xA;\"/>\r\n" + 
				"        </trAttach>\r\n" + 
				"        <trAttach ObjectID=\"f4e4fbd\" name=\"YTrAttachmentf4e4fbd\" transition=\"//@clazz.2/@ownedOperation.1/@stateMachine/@transition.4\" guardStringRep=\"DES.EventQueue.peek(timeStep, true, GeheimzahlEingetippt.yClass as YClass, null, null) != null&#xA;&amp;&amp; aufEventWartendeZustaend == AufEventWartendeZustaendeGeldautomat.wartenAufGeheimzahl;&#xA;\">\r\n" + 
				"          <effects ObjectID=\"f16f445\" effectStringRep=\"event = DES.EventQueue.consume(timeStep, true, GeheimzahlEingetippt.yClass as YClass, null, null);&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f3b32b8\" effectStringRep=\"eingetippteGeheimzahl = (event as GeheimzahlEingetippt).geheimzahl;&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f159ed5\" effectStringRep=\"Print(&quot;geheimzahl eingeben: &quot; + eingetippteGeheimzahl);&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f751db9\" effectStringRep=\"Print(&quot;prüfe geheimzahl&quot;);&#xA;\"/>\r\n" + 
				"        </trAttach>\r\n" + 
				"        <trAttach ObjectID=\"f3c2f82\" name=\"YTrAttachmentf3c2f82\" transition=\"//@clazz.2/@ownedOperation.1/@stateMachine/@transition.5\" guardStringRep=\"DES.EventQueue.peek(timeStep, true, BetragEingetippt.yClass as YClass, null, null) != null&#xA;&amp;&amp; aufEventWartendeZustaend == AufEventWartendeZustaendeGeldautomat.wartenAufBetrag;&#xA;\">\r\n" + 
				"          <effects ObjectID=\"f35687\" effectStringRep=\"event = DES.EventQueue.consume(timeStep, true, BetragEingetippt.yClass as YClass, null, null);&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f7c348f\" effectStringRep=\"eingetippteBetrag =(event as BetragEingetippt).betrag;&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f43a36e\" effectStringRep=\"Print(&quot;betrag eingeben: &quot; + eingetippteBetrag);&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f5aba5a\" effectStringRep=\"Print(&quot;prüfe Deckung&quot;);&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f368ed3\" effectStringRep=\"anzahlBetragEingabe++;&#xA;\"/>\r\n" + 
				"        </trAttach>\r\n" + 
				"        <trAttach ObjectID=\"f6a4fdc\" name=\"YTrAttachmentf6a4fdc\" transition=\"//@clazz.2/@ownedOperation.1/@stateMachine/@transition.6\" guardStringRep=\"DES.EventQueue.peek(timeStep, true, KarteEingefuegt.yClass as YClass, null, null) == null&#xA;&amp;&amp; DES.EventQueue.peek(timeStep, true, GeheimzahlEingetippt.yClass as YClass, null, null) == null&#xA;&amp;&amp; DES.EventQueue.peek(timeStep, true, BetragEingetippt.yClass as YClass, null, null) == null;&#xA;\">\r\n" + 
				"          <effects ObjectID=\"f3a10\" effectStringRep=\"setReturnValue(false);&#xA;\"/>\r\n" + 
				"        </trAttach>\r\n" + 
				"        <trAttach ObjectID=\"f56a4b\" name=\"YTrAttachmentf56a4b\" transition=\"//@clazz.2/@ownedOperation.1/@stateMachine/@transition.7\" guardStringRep=\"geldkarte.geheimzahl == eingetippteGeheimzahl;&#xA;\">\r\n" + 
				"          <effects ObjectID=\"f682d68\" effectStringRep=\"Print(&quot;Geheimzahl richtig, warten auf Betrag&quot;);&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f1eed6b\" effectStringRep=\"aufEventWartendeZustaend = AufEventWartendeZustaendeGeldautomat.wartenAufBetrag;&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"fc38af\" effectStringRep=\"event = new WarteAufBetrag;&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f36cedf\" effectStringRep=\"event.timeStep = timeStep;&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f5eaa60\" effectStringRep=\"anzahlBetragEingabe = 0;&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f5345c3\" effectStringRep=\"&#xA;setReturnValue(true);\"/>\r\n" + 
				"        </trAttach>\r\n" + 
				"        <trAttach ObjectID=\"f172696\" name=\"YTrAttachmentf172696\" transition=\"//@clazz.2/@ownedOperation.1/@stateMachine/@transition.8\" guardStringRep=\"geldkarte.fehlversuche >= 3;&#xA;\">\r\n" + 
				"          <effects ObjectID=\"f133231\" effectStringRep=\"Print(&quot;keine Fehlversuche mehr übrig; Karte ausgegeben; warten auf Karte&quot;);&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f189dd2\" effectStringRep=\"aufEventWartendeZustaend = AufEventWartendeZustaendeGeldautomat.bereit;&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f305c7e\" effectStringRep=\"event = new WarteAufKarte;&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f23609d\" effectStringRep=\"event.timeStep = timeStep;&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f82bce\" effectStringRep=\"geldkarte = null; // auswerfen der Karte&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f3d72d2\" effectStringRep=\"&#xA;setReturnValue(true);\"/>\r\n" + 
				"        </trAttach>\r\n" + 
				"        <trAttach ObjectID=\"f2382b9\" name=\"YTrAttachmentf2382b9\" transition=\"//@clazz.2/@ownedOperation.1/@stateMachine/@transition.9\" guardStringRep=\"geldkarte.fehlversuche &lt; 3;&#xA;\">\r\n" + 
				"          <effects ObjectID=\"f220abb\" effectStringRep=\"Print(&quot;noch Fehlversuche übrig, warten auf Geheimzahl&quot;);&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f21c98\" effectStringRep=\"aufEventWartendeZustaend = AufEventWartendeZustaendeGeldautomat.wartenAufGeheimzahl;&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f6e67a5\" effectStringRep=\"event = new WarteAufGeheimzahl;&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f4dd7c1\" effectStringRep=\"event.timeStep = timeStep;&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f7b2306\" effectStringRep=\"&#xA;setReturnValue(true);\"/>\r\n" + 
				"        </trAttach>\r\n" + 
				"        <trAttach ObjectID=\"f71cbab\" name=\"YTrAttachmentf71cbab\" transition=\"//@clazz.2/@ownedOperation.1/@stateMachine/@transition.10\" guardStringRep=\"geldkarte.saldo >= eingetippteBetrag;&#xA;\">\r\n" + 
				"          <effects ObjectID=\"f521a02\" effectStringRep=\"geldkarte.saldo = geldkarte.saldo - eingetippteBetrag;&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f4ec4e1\" effectStringRep=\"Print(&quot;Betrag gedeckt; Geld ausgezahlt; Karte ausgegeben; warte auf Karte &quot;);&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f2ffe9f\" effectStringRep=\"aufEventWartendeZustaend = AufEventWartendeZustaendeGeldautomat.bereit;&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f5cfe2d\" effectStringRep=\"event = new WarteAufKarte;&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f1c02b0\" effectStringRep=\"event.timeStep = timeStep;&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f2b96d6\" effectStringRep=\"&#xA;setReturnValue(true);\"/>\r\n" + 
				"          <effects ObjectID=\"f585ff1\" effectStringRep=\"geldkarte = null; // auswerfen der Karte&#xA;\"/>\r\n" + 
				"        </trAttach>\r\n" + 
				"        <trAttach ObjectID=\"f2b7192\" name=\"YTrAttachmentf2b7192\" transition=\"//@clazz.2/@ownedOperation.1/@stateMachine/@transition.11\" guardStringRep=\"geldkarte.saldo &lt; eingetippteBetrag;&#xA;\">\r\n" + 
				"          <effects ObjectID=\"f6a7400\" effectStringRep=\"Print(&quot;Betrag nicht gedeckt&quot;);&#xA;\"/>\r\n" + 
				"        </trAttach>\r\n" + 
				"        <trAttach ObjectID=\"f690275\" name=\"YTrAttachmentf690275\" transition=\"//@clazz.2/@ownedOperation.1/@stateMachine/@transition.12\" guardStringRep=\"anzahlBetragEingabe &lt; 3&#xA;\">\r\n" + 
				"          <effects ObjectID=\"f679ecb\" effectStringRep=\"Print(&quot;warten auf neuen Betrag&quot;);&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f50dce2\" effectStringRep=\"aufEventWartendeZustaend = AufEventWartendeZustaendeGeldautomat.wartenAufBetrag;&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f282ea8\" effectStringRep=\"event = new WarteAufBetrag;&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f557d0\" effectStringRep=\"event.timeStep = timeStep;&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f6011fd\" effectStringRep=\"&#xA;setReturnValue(true);\"/>\r\n" + 
				"        </trAttach>\r\n" + 
				"        <trAttach ObjectID=\"f2def54\" name=\"YTrAttachmentf2def54\" transition=\"//@clazz.2/@ownedOperation.1/@stateMachine/@transition.13\" guardStringRep=\"anzahlBetragEingabe >= 3;\">\r\n" + 
				"          <effects ObjectID=\"f405c60\" effectStringRep=\"Print(&quot;drei mal nicht passeneden Betrag eingeben; karte ausgegeben,; warten auf Karte&quot;);&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"fe64cf\" effectStringRep=\"aufEventWartendeZustaend = AufEventWartendeZustaendeGeldautomat.bereit;&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f28e24a\" effectStringRep=\"event = new WarteAufKarte;&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f77b1ed\" effectStringRep=\"event.timeStep = timeStep;&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f62f67a\" effectStringRep=\"geldkarte = null; // auswerfen der Karte&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f563ee3\" effectStringRep=\"&#xA;setReturnValue(true);\"/>\r\n" + 
				"        </trAttach>\r\n" + 
				"      </stateMachine>\r\n" + 
				"    </ownedOperation>\r\n" + 
				"  </clazz>\r\n" + 
				"  <clazz ObjectID=\"f5a78ba\" name=\"Start\" superClass=\"//@clazz.0\">\r\n" + 
				"    <ownedAttribute ObjectID=\"f9d17d\" name=\"geldautomat\" association=\"true\" type=\"//@clazz.2\" clazz=\"//@clazz.3\"/>\r\n" + 
				"    <ownedAttribute ObjectID=\"f24d8ad\" name=\"kunde\" association=\"true\" type=\"//@clazz.5\" clazz=\"//@clazz.3\"/>\r\n" + 
				"    <ownedOperation ObjectID=\"f428afd\" name=\"initializer\" clazz=\"//@clazz.3\">\r\n" + 
				"      <stateMachine ObjectID=\"f20c332\" name=\"YStateMachinef20c332\" desInitializer=\"true\">\r\n" + 
				"        <transition ObjectID=\"f5ecb91\" name=\"YTransitionf5ecb91\" source=\"//@clazz.3/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@clazz.3/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@clazz.3/@ownedOperation.0/@stateMachine/@trAttach.0\"/>\r\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f466ed4\" name=\"YPseudostatef466ed4\" outgoing=\"//@clazz.3/@ownedOperation.0/@stateMachine/@transition.0\"/>\r\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f147566\" name=\"YFinalStatef147566\" incoming=\"//@clazz.3/@ownedOperation.0/@stateMachine/@transition.0\"/>\r\n" + 
				"        <trAttach ObjectID=\"f6d970b\" name=\"YTrAttachmentf6d970b\" transition=\"//@clazz.3/@ownedOperation.0/@stateMachine/@transition.0\" guardStringRep=\"true;\">\r\n" + 
				"          <effects ObjectID=\"f76cb2\" effectStringRep=\"geldautomat = new Geldautomat;&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f60a756\" effectStringRep=\"kunde = new Kunde;&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f25a4ec\" effectStringRep=\"kunde.geheimzahlen.add(1111);&#xA;&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f74e917\" effectStringRep=\"kunde.geheimzahlen.add(1234);&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"ff4c0b\" effectStringRep=\"kunde.geheimzahlen.add(1234);&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f784794\" effectStringRep=\"kunde.geheimzahlen.add(1234);&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f518b30\" effectStringRep=\"kunde.geheimzahlen.add(1234);&#xA;\"/>\r\n" + 
				"        </trAttach>\r\n" + 
				"      </stateMachine>\r\n" + 
				"    </ownedOperation>\r\n" + 
				"  </clazz>\r\n" + 
				"  <clazz ObjectID=\"f27cc36\" name=\"Geldkarte\" superClass=\"//@clazz.0\">\r\n" + 
				"    <ownedAttribute ObjectID=\"f5e71be\" name=\"geheimzahl\" isUnique=\"true\" defaultValue=\"&quot;1234&quot;\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@clazz.4\"/>\r\n" + 
				"    <ownedAttribute ObjectID=\"f1d3e92\" name=\"saldo\" isUnique=\"true\" defaultValue=\"&quot;400&quot;\" type=\"//@packages.0/@ownedMemberPackage.1\" clazz=\"//@clazz.4\"/>\r\n" + 
				"    <ownedAttribute ObjectID=\"f4e6568\" name=\"fehlversuche\" isUnique=\"true\" defaultValue=\"&quot;0&quot;\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@clazz.4\"/>\r\n" + 
				"  </clazz>\r\n" + 
				"  <clazz ObjectID=\"f20ea99\" name=\"Kunde\" superClass=\"//@clazz.0 //@packages.1/@ownedMemberPackage.2\">\r\n" + 
				"    <ownedAttribute ObjectID=\"f18e515\" name=\"geldkarte\" association=\"true\" type=\"//@clazz.4\" clazz=\"//@clazz.5\"/>\r\n" + 
				"    <ownedAttribute ObjectID=\"f1aebcf\" name=\"geheimzahlen\" upper=\"-1\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@clazz.5\"/>\r\n" + 
				"    <ownedAttribute ObjectID=\"f267911\" name=\"event\" isUnique=\"true\" type=\"//@packages.1/@ownedMemberPackage.3\" clazz=\"//@clazz.2\"/>\r\n" + 
				"    <ownedAttribute ObjectID=\"f3a95c6\" name=\"cntGeheimzahlen\" isUnique=\"true\" defaultValue=\"&quot;0&quot;\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@clazz.5\"/>\r\n" + 
				"    <ownedAttribute ObjectID=\"f17bbf2\" name=\"anzKarteeingeben\" isUnique=\"true\" defaultValue=\"&quot;6&quot;\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@clazz.5\"/>\r\n" + 
				"    <ownedOperation ObjectID=\"f69c82c\" name=\"simulate\" clazz=\"//@clazz.5\" returnType=\"//@packages.0/@ownedMemberPackage.2\">\r\n" + 
				"      <ownedParameter ObjectID=\"f5886c7\" name=\"timeStep\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\r\n" + 
				"      <stateMachine ObjectID=\"f701626\" name=\"YStateMachinef701626\">\r\n" + 
				"        <transition ObjectID=\"f567c55\" name=\"YTransitionf567c55\" source=\"//@clazz.5/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@clazz.5/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@clazz.5/@ownedOperation.0/@stateMachine/@trAttach.0\"/>\r\n" + 
				"        <transition ObjectID=\"f4d0028\" name=\"YTransitionf4d0028\" source=\"//@clazz.5/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@clazz.5/@ownedOperation.0/@stateMachine/@subvertex.2\" attachment=\"//@clazz.5/@ownedOperation.0/@stateMachine/@trAttach.1\"/>\r\n" + 
				"        <transition ObjectID=\"f6afe48\" name=\"YTransitionf6afe48\" source=\"//@clazz.5/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@clazz.5/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@clazz.5/@ownedOperation.0/@stateMachine/@trAttach.2\"/>\r\n" + 
				"        <transition ObjectID=\"f228fb5\" name=\"YTransitionf228fb5\" source=\"//@clazz.5/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@clazz.5/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@clazz.5/@ownedOperation.0/@stateMachine/@trAttach.3\"/>\r\n" + 
				"        <transition ObjectID=\"f4e58e3\" name=\"YTransitionf4e58e3\" source=\"//@clazz.5/@ownedOperation.0/@stateMachine/@subvertex.2\" target=\"//@clazz.5/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@clazz.5/@ownedOperation.0/@stateMachine/@trAttach.4\"/>\r\n" + 
				"        <transition ObjectID=\"f4528fd\" name=\"YTransitionf4528fd\" source=\"//@clazz.5/@ownedOperation.0/@stateMachine/@subvertex.2\" target=\"//@clazz.5/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@clazz.5/@ownedOperation.0/@stateMachine/@trAttach.5\"/>\r\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f30b537\" name=\"YPseudostatef30b537\" outgoing=\"//@clazz.5/@ownedOperation.0/@stateMachine/@transition.0 //@clazz.5/@ownedOperation.0/@stateMachine/@transition.2 //@clazz.5/@ownedOperation.0/@stateMachine/@transition.1 //@clazz.5/@ownedOperation.0/@stateMachine/@transition.3\"/>\r\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f761171\" name=\"YFinalStatef761171\" incoming=\"//@clazz.5/@ownedOperation.0/@stateMachine/@transition.0 //@clazz.5/@ownedOperation.0/@stateMachine/@transition.3 //@clazz.5/@ownedOperation.0/@stateMachine/@transition.2 //@clazz.5/@ownedOperation.0/@stateMachine/@transition.4 //@clazz.5/@ownedOperation.0/@stateMachine/@transition.5\"/>\r\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f6ea65\" name=\"YStatef6ea65\" outgoing=\"//@clazz.5/@ownedOperation.0/@stateMachine/@transition.4 //@clazz.5/@ownedOperation.0/@stateMachine/@transition.5\" incoming=\"//@clazz.5/@ownedOperation.0/@stateMachine/@transition.1\"/>\r\n" + 
				"        <trAttach ObjectID=\"f4c55ea\" name=\"YTrAttachmentf4c55ea\" transition=\"//@clazz.5/@ownedOperation.0/@stateMachine/@transition.0\" guardStringRep=\"DES.EventQueue.peek(timeStep, true, WarteAufBetrag.yClass as YClass, null, null) == null&#xA;&amp;&amp; DES.EventQueue.peek(timeStep, true, WarteAufKarte.yClass as YClass, null, null) == null&#xA;&amp;&amp; DES.EventQueue.peek(timeStep, true, WarteAufGeheimzahl.yClass as YClass, null, null) == null;&#xA;\">\r\n" + 
				"          <effects ObjectID=\"f56de3e\" effectStringRep=\"setReturnValue(false);&#xA;\"/>\r\n" + 
				"        </trAttach>\r\n" + 
				"        <trAttach ObjectID=\"f6f6ede\" name=\"YTrAttachmentf6f6ede\" transition=\"//@clazz.5/@ownedOperation.0/@stateMachine/@transition.1\" guardStringRep=\"DES.EventQueue.peek(timeStep, true, WarteAufKarte.yClass as YClass, null, null) != null;&#xA;\"/>\r\n" + 
				"        <trAttach ObjectID=\"f705763\" name=\"YTrAttachmentf705763\" transition=\"//@clazz.5/@ownedOperation.0/@stateMachine/@transition.2\" guardStringRep=\"DES.EventQueue.peek(timeStep, true, WarteAufBetrag.yClass as YClass, null, null) != null;&#xA;\">\r\n" + 
				"          <effects ObjectID=\"f641f3f\" effectStringRep=\"DES.EventQueue.consume(timeStep, true, WarteAufBetrag.yClass as YClass, null, null);&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f4ff545\" effectStringRep=\"event = new BetragEingetippt;&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f181985\" effectStringRep=\"(event as BetragEingetippt).betrag = 100;&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f7ed838\" effectStringRep=\"event.timeStep = timeStep + 1;&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f53bed5\" effectStringRep=\"setReturnValue(true);&#xA;\"/>\r\n" + 
				"        </trAttach>\r\n" + 
				"        <trAttach ObjectID=\"f2998f5\" name=\"YTrAttachmentf2998f5\" transition=\"//@clazz.5/@ownedOperation.0/@stateMachine/@transition.3\" guardStringRep=\"DES.EventQueue.peek(timeStep, true, WarteAufGeheimzahl.yClass as YClass, null, null) != null;&#xA;&#xA;\">\r\n" + 
				"          <effects ObjectID=\"f78e294\" effectStringRep=\"DES.EventQueue.consume(timeStep, true, WarteAufGeheimzahl.yClass as YClass, null, null);&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f1ae52a\" effectStringRep=\"event = new GeheimzahlEingetippt;&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f6ff028\" effectStringRep=\"(event as GeheimzahlEingetippt).geheimzahl = geheimzahlen.get(cntGeheimzahlen % geheimzahlen.size);&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f1b5d75\" effectStringRep=\"cntGeheimzahlen++;&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f250b6f\" effectStringRep=\"event.timeStep = timeStep + 1;&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f2d36fb\" effectStringRep=\"setReturnValue(true);&#xA;\"/>\r\n" + 
				"        </trAttach>\r\n" + 
				"        <trAttach ObjectID=\"f45a9c5\" name=\"YTrAttachmentf45a9c5\" transition=\"//@clazz.5/@ownedOperation.0/@stateMachine/@transition.4\" guardStringRep=\"anzKarteeingeben > 0;&#xA;\">\r\n" + 
				"          <effects ObjectID=\"f17add6\" effectStringRep=\"DES.EventQueue.consume(timeStep, true, WarteAufKarte.yClass as YClass, null, null);&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f6abaec\" effectStringRep=\"anzKarteeingeben--;&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f1f8ea1\" effectStringRep=\"event = new KarteEingefuegt;&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f4ab0a3\" effectStringRep=\"(event as KarteEingefuegt).geldkarte = geldkarte;&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f25bf1f\" effectStringRep=\"event.timeStep = timeStep + 1;&#xA;\"/>\r\n" + 
				"          <effects ObjectID=\"f4af71\" effectStringRep=\"setReturnValue(true);&#xA;\"/>\r\n" + 
				"        </trAttach>\r\n" + 
				"        <trAttach ObjectID=\"f24f1e2\" name=\"YTrAttachmentf24f1e2\" transition=\"//@clazz.5/@ownedOperation.0/@stateMachine/@transition.5\" guardStringRep=\"anzKarteeingeben &lt;= 0;&#xA;\">\r\n" + 
				"          <effects ObjectID=\"f522a85\" effectStringRep=\"&#xA;setReturnValue(false);\"/>\r\n" + 
				"        </trAttach>\r\n" + 
				"      </stateMachine>\r\n" + 
				"    </ownedOperation>\r\n" + 
				"    <ownedOperation ObjectID=\"f4ee48a\" name=\"Kunde\" clazz=\"//@clazz.5\">\r\n" + 
				"      <stateMachine ObjectID=\"f31c7db\" name=\"YStateMachinef31c7db\">\r\n" + 
				"        <transition ObjectID=\"f4abe58\" name=\"YTransitionf4abe58\" source=\"//@clazz.5/@ownedOperation.1/@stateMachine/@subvertex.0\" target=\"//@clazz.5/@ownedOperation.1/@stateMachine/@subvertex.1\" attachment=\"//@clazz.5/@ownedOperation.1/@stateMachine/@trAttach.0\"/>\r\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f47e4a1\" name=\"YPseudostatef47e4a1\" outgoing=\"//@clazz.5/@ownedOperation.1/@stateMachine/@transition.0\"/>\r\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f46f689\" name=\"YFinalStatef46f689\" incoming=\"//@clazz.5/@ownedOperation.1/@stateMachine/@transition.0\"/>\r\n" + 
				"        <trAttach ObjectID=\"f550195\" name=\"YTrAttachmentf550195\" transition=\"//@clazz.5/@ownedOperation.1/@stateMachine/@transition.0\" guardStringRep=\"true;\">\r\n" + 
				"          <effects ObjectID=\"f21518c\" effectStringRep=\"geldkarte = new Geldkarte;&#xA;\"/>\r\n" + 
				"        </trAttach>\r\n" + 
				"      </stateMachine>\r\n" + 
				"    </ownedOperation>\r\n" + 
				"  </clazz>\r\n" + 
				"  <clazz ObjectID=\"f316c5c\" name=\"KarteEingefuegt\" superClass=\"//@clazz.0 //@packages.1/@ownedMemberPackage.3\">\r\n" + 
				"    <ownedAttribute ObjectID=\"f25662b\" name=\"geldkarte\" association=\"true\" type=\"//@clazz.4\" clazz=\"//@clazz.6\"/>\r\n" + 
				"  </clazz>\r\n" + 
				"  <clazz ObjectID=\"f6610cc\" name=\"GeheimzahlEingetippt\" superClass=\"//@clazz.0 //@packages.1/@ownedMemberPackage.3\">\r\n" + 
				"    <ownedAttribute ObjectID=\"f78e55f\" name=\"geheimzahl\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@clazz.7\"/>\r\n" + 
				"  </clazz>\r\n" + 
				"  <clazz ObjectID=\"f3f04b5\" name=\"BetragEingetippt\" superClass=\"//@clazz.0 //@packages.1/@ownedMemberPackage.3\">\r\n" + 
				"    <ownedAttribute ObjectID=\"f78b609\" name=\"betrag\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@clazz.8\"/>\r\n" + 
				"  </clazz>\r\n" + 
				"  <clazz ObjectID=\"f3f9de9\" name=\"WarteAufKarte\" superClass=\"//@clazz.0 //@packages.1/@ownedMemberPackage.3\"/>\r\n" + 
				"  <clazz ObjectID=\"fdfbf0\" name=\"WarteAufGeheimzahl\" superClass=\"//@clazz.0 //@packages.1/@ownedMemberPackage.3\"/>\r\n" + 
				"  <clazz ObjectID=\"f780d5e\" name=\"WarteAufBetrag\" superClass=\"//@clazz.0 //@packages.1/@ownedMemberPackage.3\"/>\r\n" + 
				"  <clazz ObjectID=\"f181bd5\" name=\"DummyObserver\" superClass=\"//@clazz.0\">\r\n" + 
				"    <ownedOperation ObjectID=\"f4f3580\" name=\"oberver\" clazz=\"//@clazz.12\">\r\n" + 
				"      <stateMachine ObjectID=\"f25cf7c\" name=\"YStateMachinef25cf7c\" initialActive=\"true\" rtc=\"observer\">\r\n" + 
				"        <transition ObjectID=\"f32bebb\" name=\"YTransitionf32bebb\" source=\"//@clazz.12/@ownedOperation.0/@stateMachine/@subvertex.2\" target=\"//@clazz.12/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@clazz.12/@ownedOperation.0/@stateMachine/@trAttach.0\"/>\r\n" + 
				"        <transition ObjectID=\"f4724a2\" name=\"YTransitionf4724a2\" source=\"//@clazz.12/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@clazz.12/@ownedOperation.0/@stateMachine/@subvertex.2\" attachment=\"//@clazz.12/@ownedOperation.0/@stateMachine/@trAttach.1\"/>\r\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f7b54f4\" name=\"YPseudostatef7b54f4\" outgoing=\"//@clazz.12/@ownedOperation.0/@stateMachine/@transition.1\"/>\r\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f3be8c0\" name=\"YFinalStatef3be8c0\" incoming=\"//@clazz.12/@ownedOperation.0/@stateMachine/@transition.0\"/>\r\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f2a90c6\" name=\"YStatef2a90c6\" outgoing=\"//@clazz.12/@ownedOperation.0/@stateMachine/@transition.0\" incoming=\"//@clazz.12/@ownedOperation.0/@stateMachine/@transition.1\"/>\r\n" + 
				"        <trAttach ObjectID=\"f43986c\" name=\"YTrAttachmentf43986c\" transition=\"//@clazz.12/@ownedOperation.0/@stateMachine/@transition.0\" guardStringRep=\"false;&#xA;\"/>\r\n" + 
				"        <trAttach ObjectID=\"f6b8ce7\" name=\"YTrAttachmentf6b8ce7\" transition=\"//@clazz.12/@ownedOperation.0/@stateMachine/@transition.1\" guardStringRep=\"true;\"/>\r\n" + 
				"      </stateMachine>\r\n" + 
				"    </ownedOperation>\r\n" + 
				"  </clazz>\r\n" + 
				"  <enumerations ObjectID=\"f611440\" name=\"AufEventWartendeZustaendeGeldautomat\">\r\n" + 
				"    <ownedLiteral ObjectID=\"f7baf79\" name=\"bereit\"/>\r\n" + 
				"    <ownedLiteral ObjectID=\"f222751\" name=\"wartenAufGeheimzahl\"/>\r\n" + 
				"    <ownedLiteral ObjectID=\"f5e2c2a\" name=\"wartenAufBetrag\"/>\r\n" + 
				"  </enumerations>\r\n" + 
				"  <packages ObjectID=\"f186d36\" name=\"Types\">\r\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f21f575\" name=\"Integer\" package=\"//@packages.0\"/>\r\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f6ff69c\" name=\"Double\" package=\"//@packages.0\"/>\r\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f143957\" name=\"Boolean\" package=\"//@packages.0\"/>\r\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f4f4a1\" name=\"String\" package=\"//@packages.0\"/>\r\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"fea65c\" name=\"Object\" package=\"//@packages.0\"/>\r\n" + 
				"  </packages>\r\n" + 
				"  <packages ObjectID=\"f2bcfa4\" name=\"DES\">\r\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f6f1844\" name=\"EventQueue\" package=\"//@packages.1\" superClass=\"//@clazz.0\">\r\n" + 
				"      <ownedOperation ObjectID=\"f78653a\" name=\"consume\" clazz=\"//@packages.1/@ownedMemberPackage.0\" returnType=\"//@packages.1/@ownedMemberPackage.3\">\r\n" + 
				"        <ownedParameter ObjectID=\"f741ee8\" name=\"timeStep\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\r\n" + 
				"        <ownedParameter ObjectID=\"f325830\" name=\"past\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.2\"/>\r\n" + 
				"        <ownedParameter ObjectID=\"f1385ca\" name=\"eventType\" isUnique=\"true\" type=\"//@clazz.1\"/>\r\n" + 
				"        <ownedParameter ObjectID=\"f334831\" name=\"receiver\" isUnique=\"true\" type=\"//@clazz.0\"/>\r\n" + 
				"        <ownedParameter ObjectID=\"f4cda47\" name=\"receiverType\" isUnique=\"true\" type=\"//@clazz.1\"/>\r\n" + 
				"        <stateMachine ObjectID=\"f2a9bdf\" name=\"YStateMachinef2a9bdf\"/>\r\n" + 
				"      </ownedOperation>\r\n" + 
				"      <ownedOperation ObjectID=\"f60b252\" name=\"peek\" clazz=\"//@packages.1/@ownedMemberPackage.0\" returnType=\"//@packages.1/@ownedMemberPackage.3\">\r\n" + 
				"        <ownedParameter ObjectID=\"f465861\" name=\"timeStep\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\r\n" + 
				"        <ownedParameter ObjectID=\"f4b5255\" name=\"past\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.2\"/>\r\n" + 
				"        <ownedParameter ObjectID=\"f7afd77\" name=\"eventType\" isUnique=\"true\" type=\"//@clazz.1\"/>\r\n" + 
				"        <ownedParameter ObjectID=\"f82b36\" name=\"receiver\" isUnique=\"true\" type=\"//@clazz.0\"/>\r\n" + 
				"        <ownedParameter ObjectID=\"fd7951\" name=\"receiverType\" isUnique=\"true\" type=\"//@clazz.1\"/>\r\n" + 
				"        <stateMachine ObjectID=\"f545e73\" name=\"YStateMachinef545e73\"/>\r\n" + 
				"      </ownedOperation>\r\n" + 
				"    </ownedMemberPackage>\r\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f7b30f\" name=\"Queue\" package=\"//@packages.1\" superClass=\"//@clazz.0 //@packages.1/@ownedMemberPackage.2\">\r\n" + 
				"      <ownedAttribute ObjectID=\"f9f8bb\" name=\"queue\" association=\"true\" upper=\"-1\" aggregation=\"composite\" type=\"//@packages.1/@ownedMemberPackage.2\" clazz=\"//@packages.1/@ownedMemberPackage.1\"/>\r\n" + 
				"      <ownedAttribute ObjectID=\"f386ee1\" name=\"delayed\" association=\"true\" upper=\"-1\" aggregation=\"composite\" type=\"//@packages.1/@ownedMemberPackage.2\" clazz=\"//@packages.1/@ownedMemberPackage.1\"/>\r\n" + 
				"      <ownedAttribute ObjectID=\"f2f987a\" name=\"event\" isUnique=\"true\" type=\"//@packages.1/@ownedMemberPackage.3\" clazz=\"//@packages.1/@ownedMemberPackage.1\"/>\r\n" + 
				"      <ownedAttribute ObjectID=\"f660fa1\" name=\"var_objectManagment\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.4\" clazz=\"//@packages.1/@ownedMemberPackage.1\"/>\r\n" + 
				"      <ownedOperation ObjectID=\"f20be76\" name=\"add\" clazz=\"//@packages.1/@ownedMemberPackage.1\">\r\n" + 
				"        <ownedParameter ObjectID=\"f4f4254\" name=\"object\" isUnique=\"true\" type=\"//@packages.1/@ownedMemberPackage.2\"/>\r\n" + 
				"        <stateMachine ObjectID=\"f4abe3c\" name=\"YStateMachinef4abe3c\">\r\n" + 
				"          <transition ObjectID=\"f5e9a9b\" name=\"YTransitionf5e9a9b\" source=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.0/@stateMachine/@trAttach.0\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f38ff8d\" name=\"YPseudostatef38ff8d\" outgoing=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.0/@stateMachine/@transition.0\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f22957b\" name=\"YFinalStatef22957b\" incoming=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.0/@stateMachine/@transition.0\"/>\r\n" + 
				"          <trAttach ObjectID=\"f529472\" name=\"YTrAttachmentf529472\" transition=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.0/@stateMachine/@transition.0\" guardStringRep=\"true;\">\r\n" + 
				"            <effects ObjectID=\"f3d0304\" effectStringRep=\"queue.add(object);\"/>\r\n" + 
				"            <effects ObjectID=\"f160b70\" effectStringRep=\"var_objectManagment = getObjectManagement();\"/>\r\n" + 
				"            <effects ObjectID=\"f6420ae\" effectStringRep=\"(var_objectManagment as online.yamm.ObjectManagement).addQueueElement(this, object, 1);\"/>\r\n" + 
				"          </trAttach>\r\n" + 
				"        </stateMachine>\r\n" + 
				"      </ownedOperation>\r\n" + 
				"      <ownedOperation ObjectID=\"f68084f\" name=\"consume\" clazz=\"//@packages.1/@ownedMemberPackage.1\" returnType=\"//@packages.1/@ownedMemberPackage.2\">\r\n" + 
				"        <ownedParameter ObjectID=\"f34e890\" name=\"filterMap\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.4\"/>\r\n" + 
				"        <stateMachine ObjectID=\"f467557\" name=\"YStateMachinef467557\"/>\r\n" + 
				"      </ownedOperation>\r\n" + 
				"      <ownedOperation ObjectID=\"f7b77c9\" name=\"peek\" clazz=\"//@packages.1/@ownedMemberPackage.1\" returnType=\"//@packages.1/@ownedMemberPackage.2\">\r\n" + 
				"        <ownedParameter ObjectID=\"f310db4\" name=\"filterMap\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.4\"/>\r\n" + 
				"        <stateMachine ObjectID=\"f549a88\" name=\"YStateMachinef549a88\"/>\r\n" + 
				"      </ownedOperation>\r\n" + 
				"      <ownedOperation ObjectID=\"f275fe\" name=\"addWithDelay\" clazz=\"//@packages.1/@ownedMemberPackage.1\">\r\n" + 
				"        <ownedParameter ObjectID=\"f2f3872\" name=\"object\" isUnique=\"true\" type=\"//@packages.1/@ownedMemberPackage.2\"/>\r\n" + 
				"        <ownedParameter ObjectID=\"f8dd49\" name=\"delay\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\r\n" + 
				"        <ownedParameter ObjectID=\"f468ab9\" name=\"timeStep\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\r\n" + 
				"        <stateMachine ObjectID=\"f48a287\" name=\"YStateMachinef48a287\">\r\n" + 
				"          <transition ObjectID=\"f58fd62\" name=\"YTransitionf58fd62\" source=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.3/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.3/@stateMachine/@subvertex.1\" attachment=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.3/@stateMachine/@trAttach.0\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f4b5238\" name=\"YPseudostatef4b5238\" outgoing=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.3/@stateMachine/@transition.0\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f5e46aa\" name=\"YFinalStatef5e46aa\" incoming=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.3/@stateMachine/@transition.0\"/>\r\n" + 
				"          <trAttach ObjectID=\"f459b0\" name=\"YTrAttachmentf459b0\" transition=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.3/@stateMachine/@transition.0\" guardStringRep=\"true;\">\r\n" + 
				"            <effects ObjectID=\"f3af920\" effectStringRep=\"var_objectManagment = getObjectManagement();\"/>\r\n" + 
				"            <effects ObjectID=\"f3726ea\" effectStringRep=\"(var_objectManagment as online.yamm.ObjectManagement).addDelayedQueueElement(this, object, 1);\"/>\r\n" + 
				"            <effects ObjectID=\"f59be5a\" effectStringRep=\"delayed.add(object);\"/>\r\n" + 
				"            <effects ObjectID=\"f6f18ad\" effectStringRep=\"event = new Delay;\"/>\r\n" + 
				"            <effects ObjectID=\"f28d54b\" effectStringRep=\"event.timeStep = timeStep + delay;\"/>\r\n" + 
				"            <effects ObjectID=\"f3ae638\" effectStringRep=\"event.objectAttached = object;\"/>\r\n" + 
				"            <effects ObjectID=\"f5109cb\" effectStringRep=\"event.receivingObject = this;\"/>\r\n" + 
				"          </trAttach>\r\n" + 
				"        </stateMachine>\r\n" + 
				"      </ownedOperation>\r\n" + 
				"      <ownedOperation ObjectID=\"f764840\" name=\"simulate\" clazz=\"//@packages.1/@ownedMemberPackage.1\" returnType=\"//@packages.0/@ownedMemberPackage.2\">\r\n" + 
				"        <ownedParameter ObjectID=\"f68416a\" name=\"timeStep\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\r\n" + 
				"        <stateMachine ObjectID=\"f7e7e66\" name=\"YStateMachinef7e7e66\">\r\n" + 
				"          <transition ObjectID=\"f2b7fa1\" name=\"YTransitionf2b7fa1\" source=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.2\" target=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.0\" attachment=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@trAttach.0\"/>\r\n" + 
				"          <transition ObjectID=\"f4bfb83\" name=\"YTransitionf4bfb83\" source=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.1\" attachment=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@trAttach.1\"/>\r\n" + 
				"          <transition ObjectID=\"f78cae7\" name=\"YTransitionf78cae7\" source=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.1\" target=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.3\" attachment=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@trAttach.2\"/>\r\n" + 
				"          <transition ObjectID=\"f3b1426\" name=\"YTransitionf3b1426\" source=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.1\" target=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.3\" attachment=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@trAttach.3\"/>\r\n" + 
				"          <transition ObjectID=\"f411019\" name=\"YTransitionf411019\" source=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.3\" attachment=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@trAttach.4\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"fe5506\" name=\"YStatefe5506\" outgoing=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.1 //@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.4\" incoming=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.0\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f4cf3d0\" name=\"YStatef4cf3d0\" outgoing=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.2 //@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.3\" incoming=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.1\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f384d51\" name=\"YPseudostatef384d51\" outgoing=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.0\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f2e7b01\" name=\"YFinalStatef2e7b01\" incoming=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.2 //@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.3 //@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.4\"/>\r\n" + 
				"          <trAttach ObjectID=\"f14e78f\" name=\"YTrAttachmentf14e78f\" transition=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.0\" guardStringRep=\"true;\">\r\n" + 
				"            <effects ObjectID=\"f48c6c2\" effectStringRep=\"event = DES.EventQueue.peek(timeStep, true, null, this, null);\"/>\r\n" + 
				"          </trAttach>\r\n" + 
				"          <trAttach ObjectID=\"f1e9b4e\" name=\"YTrAttachmentf1e9b4e\" transition=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.1\" guardStringRep=\"event != null;\"/>\r\n" + 
				"          <trAttach ObjectID=\"f5eb936\" name=\"YTrAttachmentf5eb936\" transition=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.2\" guardStringRep=\"event instanceof Delay;\">\r\n" + 
				"            <effects ObjectID=\"f2c724a\" effectStringRep=\"DES.EventQueue.consume(timeStep, true, null, this, null);\"/>\r\n" + 
				"            <effects ObjectID=\"fe6655\" effectStringRep=\"(var_objectManagment as online.yamm.ObjectManagement).removeDelayedQueueElement(this, event.objectAttached, 1);\"/>\r\n" + 
				"            <effects ObjectID=\"fb8378\" effectStringRep=\"add(event.objectAttached);\"/>\r\n" + 
				"            <effects ObjectID=\"f271ec5\" effectStringRep=\"setReturnValue(true);\"/>\r\n" + 
				"          </trAttach>\r\n" + 
				"          <trAttach ObjectID=\"f3696b8\" name=\"YTrAttachmentf3696b8\" transition=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.3\" guardStringRep=\"!(event instanceof Delay);\">\r\n" + 
				"            <effects ObjectID=\"f430192\" effectStringRep=\"setReturnValue(false);\"/>\r\n" + 
				"          </trAttach>\r\n" + 
				"          <trAttach ObjectID=\"f11f883\" name=\"YTrAttachmentf11f883\" transition=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.4\" guardStringRep=\"event == null;\">\r\n" + 
				"            <effects ObjectID=\"f41db92\" effectStringRep=\"setReturnValue(false);\"/>\r\n" + 
				"          </trAttach>\r\n" + 
				"        </stateMachine>\r\n" + 
				"      </ownedOperation>\r\n" + 
				"    </ownedMemberPackage>\r\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f40b04f\" name=\"SimulationObject\" package=\"//@packages.1\" superClass=\"//@clazz.0\">\r\n" + 
				"      <ownedAttribute ObjectID=\"f555e10\" name=\"name\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.3\" clazz=\"//@packages.1/@ownedMemberPackage.2\"/>\r\n" + 
				"      <ownedOperation ObjectID=\"f10ddfa\" name=\"simulate\" clazz=\"//@packages.1/@ownedMemberPackage.2\" returnType=\"//@packages.0/@ownedMemberPackage.2\">\r\n" + 
				"        <ownedParameter ObjectID=\"f7873fc\" name=\"timeStep\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\r\n" + 
				"        <stateMachine ObjectID=\"f2ac9f0\" name=\"YStateMachinef2ac9f0\">\r\n" + 
				"          <transition ObjectID=\"f79f4b8\" name=\"YTransitionf79f4b8\" source=\"//@packages.1/@ownedMemberPackage.2/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.2/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@packages.1/@ownedMemberPackage.2/@ownedOperation.0/@stateMachine/@trAttach.0\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f68bf82\" name=\"YPseudostatef68bf82\" outgoing=\"//@packages.1/@ownedMemberPackage.2/@ownedOperation.0/@stateMachine/@transition.0\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f68c2fb\" name=\"YFinalStatef68c2fb\" incoming=\"//@packages.1/@ownedMemberPackage.2/@ownedOperation.0/@stateMachine/@transition.0\"/>\r\n" + 
				"          <trAttach ObjectID=\"f352f8d\" name=\"YTrAttachmentf352f8d\" transition=\"//@packages.1/@ownedMemberPackage.2/@ownedOperation.0/@stateMachine/@transition.0\" guardStringRep=\"true;\">\r\n" + 
				"            <effects ObjectID=\"f284471\" effectStringRep=\"setReturnValue(false);\"/>\r\n" + 
				"          </trAttach>\r\n" + 
				"        </stateMachine>\r\n" + 
				"      </ownedOperation>\r\n" + 
				"    </ownedMemberPackage>\r\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f2a26c9\" name=\"Event\" package=\"//@packages.1\" superClass=\"//@clazz.0\">\r\n" + 
				"      <ownedAttribute ObjectID=\"f3128f5\" name=\"timeStep\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@packages.1/@ownedMemberPackage.3\"/>\r\n" + 
				"      <ownedAttribute ObjectID=\"f4063c7\" name=\"receivingType\" isUnique=\"true\" type=\"//@clazz.1\" clazz=\"//@packages.1/@ownedMemberPackage.3\"/>\r\n" + 
				"      <ownedAttribute ObjectID=\"f197074\" name=\"description\" type=\"//@packages.0/@ownedMemberPackage.3\" clazz=\"//@packages.1/@ownedMemberPackage.3\"/>\r\n" + 
				"      <ownedAttribute ObjectID=\"f94f5c\" name=\"receivingObject\" association=\"true\" isUnique=\"true\" type=\"//@packages.1/@ownedMemberPackage.2\" clazz=\"//@packages.1/@ownedMemberPackage.3\">\r\n" + 
				"        <ownedElement xsi:type=\"yammDiagram:YParameter\" ObjectID=\"f465861\" name=\"timeStep\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\r\n" + 
				"      </ownedAttribute>\r\n" + 
				"      <ownedAttribute ObjectID=\"f210054\" name=\"objectAttached\" association=\"true\" isUnique=\"true\" type=\"//@packages.1/@ownedMemberPackage.2\" clazz=\"//@packages.1/@ownedMemberPackage.3\"/>\r\n" + 
				"      <ownedOperation ObjectID=\"f6b9c0b\" name=\"toString\" clazz=\"//@packages.1/@ownedMemberPackage.3\" returnType=\"//@packages.0/@ownedMemberPackage.3\">\r\n" + 
				"        <stateMachine ObjectID=\"f694554\" name=\"YStateMachinef694554\">\r\n" + 
				"          <transition ObjectID=\"f76f663\" name=\"YTransitionf76f663\" source=\"//@packages.1/@ownedMemberPackage.3/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.3/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@packages.1/@ownedMemberPackage.3/@ownedOperation.0/@stateMachine/@trAttach.0\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f759d05\" name=\"YPseudostatef759d05\" outgoing=\"//@packages.1/@ownedMemberPackage.3/@ownedOperation.0/@stateMachine/@transition.0\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f190b71\" name=\"YFinalStatef190b71\" incoming=\"//@packages.1/@ownedMemberPackage.3/@ownedOperation.0/@stateMachine/@transition.0\"/>\r\n" + 
				"          <trAttach ObjectID=\"f776ef5\" name=\"YTrAttachmentf776ef5\" transition=\"//@packages.1/@ownedMemberPackage.3/@ownedOperation.0/@stateMachine/@transition.0\" guardStringRep=\"true;\">\r\n" + 
				"            <effects ObjectID=\"f1ac343\" effectStringRep=\"setReturnValue(&quot;TODO: Event.toString()&quot;);&#xA;\"/>\r\n" + 
				"          </trAttach>\r\n" + 
				"        </stateMachine>\r\n" + 
				"      </ownedOperation>\r\n" + 
				"    </ownedMemberPackage>\r\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f5961ed\" name=\"Randomizer\" package=\"//@packages.1\" superClass=\"//@clazz.0\">\r\n" + 
				"      <ownedAttribute ObjectID=\"f49b547\" name=\"random\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.4\"/>\r\n" + 
				"      <ownedAttribute ObjectID=\"f13e889\" name=\"USE_GAUSSIAN\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.2\" clazz=\"//@packages.1/@ownedMemberPackage.4\"/>\r\n" + 
				"      <ownedAttribute ObjectID=\"f66b9ac\" name=\"i\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@packages.1/@ownedMemberPackage.4\"/>\r\n" + 
				"      <ownedAttribute ObjectID=\"f19d97b\" name=\"prob2Int\" association=\"true\" upper=\"-1\" aggregation=\"composite\" type=\"//@packages.1/@ownedMemberPackage.5\" clazz=\"//@packages.1/@ownedMemberPackage.4\"/>\r\n" + 
				"      <ownedAttribute ObjectID=\"f41fa4e\" name=\"entry\" association=\"true\" isUnique=\"true\" type=\"//@packages.1/@ownedMemberPackage.5\" clazz=\"//@packages.1/@ownedMemberPackage.4\"/>\r\n" + 
				"      <ownedAttribute ObjectID=\"f7d11a1\" name=\"r\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.1\" clazz=\"//@packages.1/@ownedMemberPackage.4\"/>\r\n" + 
				"      <ownedAttribute ObjectID=\"f672a3d\" name=\"x\" isUnique=\"true\" defaultValue=\"&quot;0&quot;\" type=\"//@packages.0/@ownedMemberPackage.1\" clazz=\"//@packages.1/@ownedMemberPackage.4\"/>\r\n" + 
				"      <ownedAttribute ObjectID=\"f64dcec\" name=\"sumAllProp\" isUnique=\"true\" defaultValue=\"&quot;0&quot;\" type=\"//@packages.0/@ownedMemberPackage.1\" clazz=\"//@packages.1/@ownedMemberPackage.4\"/>\r\n" + 
				"      <ownedOperation ObjectID=\"f27d00b\" name=\"addProbInt\" clazz=\"//@packages.1/@ownedMemberPackage.4\">\r\n" + 
				"        <ownedParameter ObjectID=\"f46955f\" name=\"to\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.1\"/>\r\n" + 
				"        <ownedParameter ObjectID=\"f547076\" name=\"value\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\r\n" + 
				"        <stateMachine ObjectID=\"f7f9230\" name=\"YStateMachinef7f9230\">\r\n" + 
				"          <transition ObjectID=\"f16bfc2\" name=\"YTransitionf16bfc2\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.0/@stateMachine/@trAttach.0\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f5ef90\" name=\"YPseudostatef5ef90\" outgoing=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.0/@stateMachine/@transition.0\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f3b08da\" name=\"YFinalStatef3b08da\" incoming=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.0/@stateMachine/@transition.0\"/>\r\n" + 
				"          <trAttach ObjectID=\"f4c947d\" name=\"YTrAttachmentf4c947d\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.0/@stateMachine/@transition.0\" guardStringRep=\"true;\">\r\n" + 
				"            <effects ObjectID=\"f46566a\" effectStringRep=\"sumAllProp = sumAllProp + to;\"/>\r\n" + 
				"            <effects ObjectID=\"f4dc7ba\" effectStringRep=\"prob2Int.add(new Probability2Value);\"/>\r\n" + 
				"            <effects ObjectID=\"f20b257\" effectStringRep=\"prob2Int.get(prob2Int.size - 1).probabilityUpperLimit = to;\"/>\r\n" + 
				"            <effects ObjectID=\"f5793d3\" effectStringRep=\"prob2Int.get(prob2Int.size - 1).value = value;\"/>\r\n" + 
				"          </trAttach>\r\n" + 
				"        </stateMachine>\r\n" + 
				"      </ownedOperation>\r\n" + 
				"      <ownedOperation ObjectID=\"f66c63\" name=\"nextInt\" clazz=\"//@packages.1/@ownedMemberPackage.4\" returnType=\"//@packages.0/@ownedMemberPackage.0\">\r\n" + 
				"        <stateMachine ObjectID=\"f30aac5\" name=\"YStateMachinef30aac5\">\r\n" + 
				"          <transition ObjectID=\"f5626fe\" name=\"YTransitionf5626fe\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.2\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@trAttach.0\"/>\r\n" + 
				"          <transition ObjectID=\"f43cf6d\" name=\"YTransitionf43cf6d\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.2\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@trAttach.1\"/>\r\n" + 
				"          <transition ObjectID=\"f532d9a\" name=\"YTransitionf532d9a\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.5\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.3\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@trAttach.2\"/>\r\n" + 
				"          <transition ObjectID=\"f1d935c\" name=\"YTransitionf1d935c\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.4\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.3\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@trAttach.3\"/>\r\n" + 
				"          <transition ObjectID=\"f7c9630\" name=\"YTransitionf7c9630\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.3\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.4\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@trAttach.4\"/>\r\n" + 
				"          <transition ObjectID=\"f146bd8\" name=\"YTransitionf146bd8\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.3\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.1\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@trAttach.5\"/>\r\n" + 
				"          <transition ObjectID=\"f19a4e3\" name=\"YTransitionf19a4e3\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.4\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.1\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@trAttach.6\"/>\r\n" + 
				"          <transition ObjectID=\"f1440f2\" name=\"YTransitionf1440f2\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.2\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.5\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@trAttach.7\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f311e7\" name=\"YPseudostatef311e7\" outgoing=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.0 //@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.1\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f4ede39\" name=\"YFinalStatef4ede39\" incoming=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.5 //@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.6\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f1c1425\" name=\"YStatef1c1425\" outgoing=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.7\" incoming=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.0 //@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.1\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f6c9142\" name=\"YStatef6c9142\" outgoing=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.4 //@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.5\" incoming=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.2 //@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.3\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f6995d3\" name=\"YStatef6995d3\" outgoing=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.3 //@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.6\" incoming=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.4\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f577f47\" name=\"YStatef577f47\" outgoing=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.2\" incoming=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.7\"/>\r\n" + 
				"          <trAttach ObjectID=\"f59536\" name=\"YTrAttachmentf59536\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.0\" guardStringRep=\"USE_GAUSSIAN;\">\r\n" + 
				"            <effects ObjectID=\"f6de5ab\" effectStringRep=\"r = (random as java.util.Random).nextGaussian;\"/>\r\n" + 
				"          </trAttach>\r\n" + 
				"          <trAttach ObjectID=\"f70685\" name=\"YTrAttachmentf70685\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.1\" guardStringRep=\"!USE_GAUSSIAN;\">\r\n" + 
				"            <effects ObjectID=\"f325de1\" effectStringRep=\"r = (random as java.util.Random).nextDouble;\"/>\r\n" + 
				"          </trAttach>\r\n" + 
				"          <trAttach ObjectID=\"f2dd09a\" name=\"YTrAttachmentf2dd09a\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.2\" guardStringRep=\"true;\">\r\n" + 
				"            <effects ObjectID=\"f2050fd\" effectStringRep=\"x = 0;\"/>\r\n" + 
				"            <effects ObjectID=\"f728e4a\" effectStringRep=\"i = 0;\"/>\r\n" + 
				"          </trAttach>\r\n" + 
				"          <trAttach ObjectID=\"f654c2c\" name=\"YTrAttachmentf654c2c\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.3\" guardStringRep=\"r > entry.probabilityUpperLimit + x;\"/>\r\n" + 
				"          <trAttach ObjectID=\"f177a55\" name=\"YTrAttachmentf177a55\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.4\" guardStringRep=\"i &lt; prob2Int.size;\">\r\n" + 
				"            <effects ObjectID=\"f2bde0d\" effectStringRep=\"entry = prob2Int.get(i++);\"/>\r\n" + 
				"            <effects ObjectID=\"f4be425\" effectStringRep=\"x = x + entry.probabilityUpperLimit;\"/>\r\n" + 
				"          </trAttach>\r\n" + 
				"          <trAttach ObjectID=\"f34e904\" name=\"YTrAttachmentf34e904\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.5\" guardStringRep=\"i >= prob2Int.size;\">\r\n" + 
				"            <effects ObjectID=\"f1b61b9\" effectStringRep=\"setReturnValue(0);\"/>\r\n" + 
				"          </trAttach>\r\n" + 
				"          <trAttach ObjectID=\"f6e4855\" name=\"YTrAttachmentf6e4855\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.6\" guardStringRep=\"r &lt;= entry.probabilityUpperLimit + x;\">\r\n" + 
				"            <effects ObjectID=\"f7a9b6f\" effectStringRep=\"setReturnValue(entry.value);\"/>\r\n" + 
				"          </trAttach>\r\n" + 
				"          <trAttach ObjectID=\"f7758dd\" name=\"YTrAttachmentf7758dd\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.7\" guardStringRep=\"true;\">\r\n" + 
				"            <effects ObjectID=\"f5dc2c3\" effectStringRep=\"r = r * sumAllProp;\"/>\r\n" + 
				"          </trAttach>\r\n" + 
				"        </stateMachine>\r\n" + 
				"      </ownedOperation>\r\n" + 
				"    </ownedMemberPackage>\r\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f6019cc\" name=\"Probability2Value\" package=\"//@packages.1\" superClass=\"//@clazz.0\">\r\n" + 
				"      <ownedAttribute ObjectID=\"f5512dc\" name=\"probabilityUpperLimit\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.1\" clazz=\"//@packages.1/@ownedMemberPackage.5\"/>\r\n" + 
				"      <ownedAttribute ObjectID=\"f6e635c\" name=\"value\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@packages.1/@ownedMemberPackage.5\"/>\r\n" + 
				"    </ownedMemberPackage>\r\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f67d23f\" name=\"Delay\" package=\"//@packages.1\" superClass=\"//@clazz.0 //@packages.1/@ownedMemberPackage.3\"/>\r\n" + 
				"  </packages>\r\n" + 
				"</yammDiagram:YModel>\r\n" + 
				"";
	}
	
	/**
	 * Returns the content for an empty *.yammdiagram file.
	 * 
	 * @return {@code EMPTY_PROJECT}
	 */
	public static String emptyProject()
	{
		final String EMPTY_PROJECT = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n" + 
				"<yammDiagram:YModel xmi:version=\"2.0\" xmlns:xmi=\"http://www.omg.org/XMI\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:yammDiagram=\"http://www.yamm.online/coreModelDiagram/YammDiagram\">\r\n" + 
				"  <clazz ObjectID=\"f5e24a2\" name=\"RObject\">\r\n" + 
				"    <ownedAttribute ObjectID=\"f2bd771\" name=\"rContainer\" type=\"//@clazz.0\" clazz=\"//@clazz.0\"/>\r\n" + 
				"    <ownedAttribute ObjectID=\"f55ebef\" name=\"yClass\" type=\"//@packages.0/@ownedMemberPackage.4\" clazz=\"//@clazz.0\"/>\r\n" + 
				"    <ownedAttribute ObjectID=\"fbb4ab\" name=\"ObjectID\" type=\"//@packages.0/@ownedMemberPackage.3\" clazz=\"//@clazz.0\"/>\r\n" + 
				"  </clazz>\r\n" + 
				"  <clazz ObjectID=\"f4cc70d\" name=\"YClass\" superClass=\"//@clazz.0\"/>\r\n" + 
				"  <packages ObjectID=\"f186d36\" name=\"Types\">\r\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f21f575\" name=\"Integer\" package=\"//@packages.0\"/>\r\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f6ff69c\" name=\"Double\" package=\"//@packages.0\"/>\r\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f143957\" name=\"Boolean\" package=\"//@packages.0\"/>\r\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f4f4a1\" name=\"String\" package=\"//@packages.0\"/>\r\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"fea65c\" name=\"Object\" package=\"//@packages.0\"/>\r\n" + 
				"  </packages>\r\n" + 
				"  <packages ObjectID=\"f2bcfa4\" name=\"DES\">\r\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f6f1844\" name=\"EventQueue\" package=\"//@packages.1\" superClass=\"//@clazz.0\">\r\n" + 
				"      <ownedOperation ObjectID=\"f78653a\" name=\"consume\" clazz=\"//@packages.1/@ownedMemberPackage.0\" returnType=\"//@packages.1/@ownedMemberPackage.3\">\r\n" + 
				"        <ownedParameter ObjectID=\"f741ee8\" name=\"timeStep\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\r\n" + 
				"        <ownedParameter ObjectID=\"f325830\" name=\"past\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.2\"/>\r\n" + 
				"        <ownedParameter ObjectID=\"f1385ca\" name=\"eventType\" isUnique=\"true\" type=\"//@clazz.1\"/>\r\n" + 
				"        <ownedParameter ObjectID=\"f334831\" name=\"receiver\" isUnique=\"true\" type=\"//@clazz.0\"/>\r\n" + 
				"        <ownedParameter ObjectID=\"f4cda47\" name=\"receiverType\" isUnique=\"true\" type=\"//@clazz.1\"/>\r\n" + 
				"        <stateMachine ObjectID=\"f2a9bdf\" name=\"YStateMachinef2a9bdf\"/>\r\n" + 
				"      </ownedOperation>\r\n" + 
				"      <ownedOperation ObjectID=\"f60b252\" name=\"peek\" clazz=\"//@packages.1/@ownedMemberPackage.0\" returnType=\"//@packages.1/@ownedMemberPackage.3\">\r\n" + 
				"        <ownedParameter ObjectID=\"f465861\" name=\"timeStep\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\r\n" + 
				"        <ownedParameter ObjectID=\"f4b5255\" name=\"past\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.2\"/>\r\n" + 
				"        <ownedParameter ObjectID=\"f7afd77\" name=\"eventType\" isUnique=\"true\" type=\"//@clazz.1\"/>\r\n" + 
				"        <ownedParameter ObjectID=\"f82b36\" name=\"receiver\" isUnique=\"true\" type=\"//@clazz.0\"/>\r\n" + 
				"        <ownedParameter ObjectID=\"fd7951\" name=\"receiverType\" isUnique=\"true\" type=\"//@clazz.1\"/>\r\n" + 
				"        <stateMachine ObjectID=\"f545e73\" name=\"YStateMachinef545e73\"/>\r\n" + 
				"      </ownedOperation>\r\n" + 
				"    </ownedMemberPackage>\r\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f7b30f\" name=\"Queue\" package=\"//@packages.1\" superClass=\"//@clazz.0 //@packages.1/@ownedMemberPackage.2\">\r\n" + 
				"      <ownedAttribute ObjectID=\"f9f8bb\" name=\"queue\" association=\"true\" upper=\"-1\" aggregation=\"composite\" type=\"//@packages.1/@ownedMemberPackage.2\" clazz=\"//@packages.1/@ownedMemberPackage.1\"/>\r\n" + 
				"      <ownedAttribute ObjectID=\"f386ee1\" name=\"delayed\" association=\"true\" upper=\"-1\" aggregation=\"composite\" type=\"//@packages.1/@ownedMemberPackage.2\" clazz=\"//@packages.1/@ownedMemberPackage.1\"/>\r\n" + 
				"      <ownedAttribute ObjectID=\"f2f987a\" name=\"event\" isUnique=\"true\" type=\"//@packages.1/@ownedMemberPackage.3\" clazz=\"//@packages.1/@ownedMemberPackage.1\"/>\r\n" + 
				"      <ownedAttribute ObjectID=\"f660fa1\" name=\"var_objectManagment\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.4\" clazz=\"//@packages.1/@ownedMemberPackage.1\"/>\r\n" + 
				"      <ownedOperation ObjectID=\"f20be76\" name=\"add\" clazz=\"//@packages.1/@ownedMemberPackage.1\">\r\n" + 
				"        <ownedParameter ObjectID=\"f4f4254\" name=\"object\" isUnique=\"true\" type=\"//@packages.1/@ownedMemberPackage.2\"/>\r\n" + 
				"        <stateMachine ObjectID=\"f4abe3c\" name=\"YStateMachinef4abe3c\">\r\n" + 
				"          <transition ObjectID=\"f5e9a9b\" name=\"YTransitionf5e9a9b\" source=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.0/@stateMachine/@trAttach.0\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f38ff8d\" name=\"YPseudostatef38ff8d\" outgoing=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.0/@stateMachine/@transition.0\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f22957b\" name=\"YFinalStatef22957b\" incoming=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.0/@stateMachine/@transition.0\"/>\r\n" + 
				"          <trAttach ObjectID=\"f529472\" name=\"YTrAttachmentf529472\" transition=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.0/@stateMachine/@transition.0\" guardStringRep=\"true;\">\r\n" + 
				"            <effects ObjectID=\"f3d0304\" effectStringRep=\"queue.add(object);\"/>\r\n" + 
				"            <effects ObjectID=\"f160b70\" effectStringRep=\"var_objectManagment = getObjectManagement();\"/>\r\n" + 
				"            <effects ObjectID=\"f6420ae\" effectStringRep=\"(var_objectManagment as online.yamm.ObjectManagement).addQueueElement(this, object, 1);\"/>\r\n" + 
				"          </trAttach>\r\n" + 
				"        </stateMachine>\r\n" + 
				"      </ownedOperation>\r\n" + 
				"      <ownedOperation ObjectID=\"f68084f\" name=\"consume\" clazz=\"//@packages.1/@ownedMemberPackage.1\" returnType=\"//@packages.1/@ownedMemberPackage.2\">\r\n" + 
				"        <ownedParameter ObjectID=\"f34e890\" name=\"filterMap\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.4\"/>\r\n" + 
				"        <stateMachine ObjectID=\"f467557\" name=\"YStateMachinef467557\"/>\r\n" + 
				"      </ownedOperation>\r\n" + 
				"      <ownedOperation ObjectID=\"f7b77c9\" name=\"peek\" clazz=\"//@packages.1/@ownedMemberPackage.1\" returnType=\"//@packages.1/@ownedMemberPackage.2\">\r\n" + 
				"        <ownedParameter ObjectID=\"f310db4\" name=\"filterMap\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.4\"/>\r\n" + 
				"        <stateMachine ObjectID=\"f549a88\" name=\"YStateMachinef549a88\"/>\r\n" + 
				"      </ownedOperation>\r\n" + 
				"      <ownedOperation ObjectID=\"f275fe\" name=\"addWithDelay\" clazz=\"//@packages.1/@ownedMemberPackage.1\">\r\n" + 
				"        <ownedParameter ObjectID=\"f2f3872\" name=\"object\" isUnique=\"true\" type=\"//@packages.1/@ownedMemberPackage.2\"/>\r\n" + 
				"        <ownedParameter ObjectID=\"f8dd49\" name=\"delay\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\r\n" + 
				"        <ownedParameter ObjectID=\"f468ab9\" name=\"timeStep\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\r\n" + 
				"        <stateMachine ObjectID=\"f48a287\" name=\"YStateMachinef48a287\">\r\n" + 
				"          <transition ObjectID=\"f58fd62\" name=\"YTransitionf58fd62\" source=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.3/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.3/@stateMachine/@subvertex.1\" attachment=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.3/@stateMachine/@trAttach.0\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f4b5238\" name=\"YPseudostatef4b5238\" outgoing=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.3/@stateMachine/@transition.0\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f5e46aa\" name=\"YFinalStatef5e46aa\" incoming=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.3/@stateMachine/@transition.0\"/>\r\n" + 
				"          <trAttach ObjectID=\"f459b0\" name=\"YTrAttachmentf459b0\" transition=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.3/@stateMachine/@transition.0\" guardStringRep=\"true;\">\r\n" + 
				"            <effects ObjectID=\"f3af920\" effectStringRep=\"var_objectManagment = getObjectManagement();\"/>\r\n" + 
				"            <effects ObjectID=\"f3726ea\" effectStringRep=\"(var_objectManagment as online.yamm.ObjectManagement).addDelayedQueueElement(this, object, 1);\"/>\r\n" + 
				"            <effects ObjectID=\"f59be5a\" effectStringRep=\"delayed.add(object);\"/>\r\n" + 
				"            <effects ObjectID=\"f6f18ad\" effectStringRep=\"event = new Delay;\"/>\r\n" + 
				"            <effects ObjectID=\"f28d54b\" effectStringRep=\"event.timeStep = timeStep + delay;\"/>\r\n" + 
				"            <effects ObjectID=\"f3ae638\" effectStringRep=\"event.objectAttached = object;\"/>\r\n" + 
				"            <effects ObjectID=\"f5109cb\" effectStringRep=\"event.receivingObject = this;\"/>\r\n" + 
				"          </trAttach>\r\n" + 
				"        </stateMachine>\r\n" + 
				"      </ownedOperation>\r\n" + 
				"      <ownedOperation ObjectID=\"f764840\" name=\"simulate\" clazz=\"//@packages.1/@ownedMemberPackage.1\" returnType=\"//@packages.0/@ownedMemberPackage.2\">\r\n" + 
				"        <ownedParameter ObjectID=\"f68416a\" name=\"timeStep\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\r\n" + 
				"        <stateMachine ObjectID=\"f7e7e66\" name=\"YStateMachinef7e7e66\">\r\n" + 
				"          <transition ObjectID=\"f2b7fa1\" name=\"YTransitionf2b7fa1\" source=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.2\" target=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.0\" attachment=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@trAttach.0\"/>\r\n" + 
				"          <transition ObjectID=\"f4bfb83\" name=\"YTransitionf4bfb83\" source=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.1\" attachment=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@trAttach.1\"/>\r\n" + 
				"          <transition ObjectID=\"f78cae7\" name=\"YTransitionf78cae7\" source=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.1\" target=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.3\" attachment=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@trAttach.2\"/>\r\n" + 
				"          <transition ObjectID=\"f3b1426\" name=\"YTransitionf3b1426\" source=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.1\" target=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.3\" attachment=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@trAttach.3\"/>\r\n" + 
				"          <transition ObjectID=\"f411019\" name=\"YTransitionf411019\" source=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.3\" attachment=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@trAttach.4\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"fe5506\" name=\"YStatefe5506\" outgoing=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.1 //@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.4\" incoming=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.0\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f4cf3d0\" name=\"YStatef4cf3d0\" outgoing=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.2 //@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.3\" incoming=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.1\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f384d51\" name=\"YPseudostatef384d51\" outgoing=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.0\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f2e7b01\" name=\"YFinalStatef2e7b01\" incoming=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.2 //@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.3 //@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.4\"/>\r\n" + 
				"          <trAttach ObjectID=\"f14e78f\" name=\"YTrAttachmentf14e78f\" transition=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.0\" guardStringRep=\"true;\">\r\n" + 
				"            <effects ObjectID=\"f48c6c2\" effectStringRep=\"event = DES.EventQueue.peek(timeStep, true, null, this, null);\"/>\r\n" + 
				"          </trAttach>\r\n" + 
				"          <trAttach ObjectID=\"f1e9b4e\" name=\"YTrAttachmentf1e9b4e\" transition=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.1\" guardStringRep=\"event != null;\"/>\r\n" + 
				"          <trAttach ObjectID=\"f5eb936\" name=\"YTrAttachmentf5eb936\" transition=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.2\" guardStringRep=\"event instanceof Delay;\">\r\n" + 
				"            <effects ObjectID=\"f2c724a\" effectStringRep=\"DES.EventQueue.consume(timeStep, true, null, this, null);\"/>\r\n" + 
				"            <effects ObjectID=\"fe6655\" effectStringRep=\"(var_objectManagment as online.yamm.ObjectManagement).removeDelayedQueueElement(this, event.objectAttached, 1);\"/>\r\n" + 
				"            <effects ObjectID=\"fb8378\" effectStringRep=\"add(event.objectAttached);\"/>\r\n" + 
				"            <effects ObjectID=\"f271ec5\" effectStringRep=\"setReturnValue(true);\"/>\r\n" + 
				"          </trAttach>\r\n" + 
				"          <trAttach ObjectID=\"f3696b8\" name=\"YTrAttachmentf3696b8\" transition=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.3\" guardStringRep=\"!(event instanceof Delay);\">\r\n" + 
				"            <effects ObjectID=\"f430192\" effectStringRep=\"setReturnValue(false);\"/>\r\n" + 
				"          </trAttach>\r\n" + 
				"          <trAttach ObjectID=\"f11f883\" name=\"YTrAttachmentf11f883\" transition=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.4\" guardStringRep=\"event == null;\">\r\n" + 
				"            <effects ObjectID=\"f41db92\" effectStringRep=\"setReturnValue(false);\"/>\r\n" + 
				"          </trAttach>\r\n" + 
				"        </stateMachine>\r\n" + 
				"      </ownedOperation>\r\n" + 
				"    </ownedMemberPackage>\r\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f40b04f\" name=\"SimulationObject\" package=\"//@packages.1\" superClass=\"//@clazz.0\">\r\n" + 
				"      <ownedAttribute ObjectID=\"f555e10\" name=\"name\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.3\" clazz=\"//@packages.1/@ownedMemberPackage.2\"/>\r\n" + 
				"      <ownedOperation ObjectID=\"f10ddfa\" name=\"simulate\" clazz=\"//@packages.1/@ownedMemberPackage.2\" returnType=\"//@packages.0/@ownedMemberPackage.2\">\r\n" + 
				"        <ownedParameter ObjectID=\"f7873fc\" name=\"timeStep\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\r\n" + 
				"        <stateMachine ObjectID=\"f2ac9f0\" name=\"YStateMachinef2ac9f0\">\r\n" + 
				"          <transition ObjectID=\"f79f4b8\" name=\"YTransitionf79f4b8\" source=\"//@packages.1/@ownedMemberPackage.2/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.2/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@packages.1/@ownedMemberPackage.2/@ownedOperation.0/@stateMachine/@trAttach.0\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f68bf82\" name=\"YPseudostatef68bf82\" outgoing=\"//@packages.1/@ownedMemberPackage.2/@ownedOperation.0/@stateMachine/@transition.0\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f68c2fb\" name=\"YFinalStatef68c2fb\" incoming=\"//@packages.1/@ownedMemberPackage.2/@ownedOperation.0/@stateMachine/@transition.0\"/>\r\n" + 
				"          <trAttach ObjectID=\"f352f8d\" name=\"YTrAttachmentf352f8d\" transition=\"//@packages.1/@ownedMemberPackage.2/@ownedOperation.0/@stateMachine/@transition.0\" guardStringRep=\"true;\">\r\n" + 
				"            <effects ObjectID=\"f284471\" effectStringRep=\"setReturnValue(false);\"/>\r\n" + 
				"          </trAttach>\r\n" + 
				"        </stateMachine>\r\n" + 
				"      </ownedOperation>\r\n" + 
				"    </ownedMemberPackage>\r\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f2a26c9\" name=\"Event\" package=\"//@packages.1\" superClass=\"//@clazz.0\">\r\n" + 
				"      <ownedAttribute ObjectID=\"f3128f5\" name=\"timeStep\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@packages.1/@ownedMemberPackage.3\"/>\r\n" + 
				"      <ownedAttribute ObjectID=\"f4063c7\" name=\"receivingType\" isUnique=\"true\" type=\"//@clazz.1\" clazz=\"//@packages.1/@ownedMemberPackage.3\"/>\r\n" + 
				"      <ownedAttribute ObjectID=\"f197074\" name=\"description\" type=\"//@packages.0/@ownedMemberPackage.3\" clazz=\"//@packages.1/@ownedMemberPackage.3\"/>\r\n" + 
				"      <ownedAttribute ObjectID=\"f94f5c\" name=\"receivingObject\" association=\"true\" isUnique=\"true\" type=\"//@packages.1/@ownedMemberPackage.2\" clazz=\"//@packages.1/@ownedMemberPackage.3\">\r\n" + 
				"        <ownedElement xsi:type=\"yammDiagram:YParameter\" ObjectID=\"f465861\" name=\"timeStep\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\r\n" + 
				"      </ownedAttribute>\r\n" + 
				"      <ownedAttribute ObjectID=\"f210054\" name=\"objectAttached\" association=\"true\" isUnique=\"true\" type=\"//@packages.1/@ownedMemberPackage.2\" clazz=\"//@packages.1/@ownedMemberPackage.3\"/>\r\n" + 
				"      <ownedOperation ObjectID=\"f6b9c0b\" name=\"toString\" clazz=\"//@packages.1/@ownedMemberPackage.3\" returnType=\"//@packages.0/@ownedMemberPackage.3\">\r\n" + 
				"        <stateMachine ObjectID=\"f694554\" name=\"YStateMachinef694554\">\r\n" + 
				"          <transition ObjectID=\"f76f663\" name=\"YTransitionf76f663\" source=\"//@packages.1/@ownedMemberPackage.3/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.3/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@packages.1/@ownedMemberPackage.3/@ownedOperation.0/@stateMachine/@trAttach.0\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f759d05\" name=\"YPseudostatef759d05\" outgoing=\"//@packages.1/@ownedMemberPackage.3/@ownedOperation.0/@stateMachine/@transition.0\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f190b71\" name=\"YFinalStatef190b71\" incoming=\"//@packages.1/@ownedMemberPackage.3/@ownedOperation.0/@stateMachine/@transition.0\"/>\r\n" + 
				"          <trAttach ObjectID=\"f776ef5\" name=\"YTrAttachmentf776ef5\" transition=\"//@packages.1/@ownedMemberPackage.3/@ownedOperation.0/@stateMachine/@transition.0\" guardStringRep=\"true;\">\r\n" + 
				"            <effects ObjectID=\"f1ac343\" effectStringRep=\"setReturnValue(&quot;TODO: Event.toString()&quot;);\"/>\r\n" + 
				"          </trAttach>\r\n" + 
				"        </stateMachine>\r\n" + 
				"      </ownedOperation>\r\n" + 
				"    </ownedMemberPackage>\r\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f5961ed\" name=\"Randomizer\" package=\"//@packages.1\" superClass=\"//@clazz.0\">\r\n" + 
				"      <ownedAttribute ObjectID=\"f49b547\" name=\"random\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.4\"/>\r\n" + 
				"      <ownedAttribute ObjectID=\"f13e889\" name=\"USE_GAUSSIAN\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.2\" clazz=\"//@packages.1/@ownedMemberPackage.4\"/>\r\n" + 
				"      <ownedAttribute ObjectID=\"f66b9ac\" name=\"i\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@packages.1/@ownedMemberPackage.4\"/>\r\n" + 
				"      <ownedAttribute ObjectID=\"f19d97b\" name=\"prob2Int\" association=\"true\" upper=\"-1\" aggregation=\"composite\" type=\"//@packages.1/@ownedMemberPackage.5\" clazz=\"//@packages.1/@ownedMemberPackage.4\"/>\r\n" + 
				"      <ownedAttribute ObjectID=\"f41fa4e\" name=\"entry\" association=\"true\" isUnique=\"true\" type=\"//@packages.1/@ownedMemberPackage.5\" clazz=\"//@packages.1/@ownedMemberPackage.4\"/>\r\n" + 
				"      <ownedAttribute ObjectID=\"f7d11a1\" name=\"r\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.1\" clazz=\"//@packages.1/@ownedMemberPackage.4\"/>\r\n" + 
				"      <ownedAttribute ObjectID=\"f672a3d\" name=\"x\" isUnique=\"true\" defaultValue=\"&quot;0&quot;\" type=\"//@packages.0/@ownedMemberPackage.1\" clazz=\"//@packages.1/@ownedMemberPackage.4\"/>\r\n" + 
				"      <ownedAttribute ObjectID=\"f64dcec\" name=\"sumAllProp\" isUnique=\"true\" defaultValue=\"&quot;0&quot;\" type=\"//@packages.0/@ownedMemberPackage.1\" clazz=\"//@packages.1/@ownedMemberPackage.4\"/>\r\n" + 
				"      <ownedOperation ObjectID=\"f27d00b\" name=\"addProbInt\" clazz=\"//@packages.1/@ownedMemberPackage.4\">\r\n" + 
				"        <ownedParameter ObjectID=\"f46955f\" name=\"to\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.1\"/>\r\n" + 
				"        <ownedParameter ObjectID=\"f547076\" name=\"value\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\r\n" + 
				"        <stateMachine ObjectID=\"f7f9230\" name=\"YStateMachinef7f9230\">\r\n" + 
				"          <transition ObjectID=\"f16bfc2\" name=\"YTransitionf16bfc2\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.0/@stateMachine/@trAttach.0\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f5ef90\" name=\"YPseudostatef5ef90\" outgoing=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.0/@stateMachine/@transition.0\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f3b08da\" name=\"YFinalStatef3b08da\" incoming=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.0/@stateMachine/@transition.0\"/>\r\n" + 
				"          <trAttach ObjectID=\"f4c947d\" name=\"YTrAttachmentf4c947d\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.0/@stateMachine/@transition.0\" guardStringRep=\"true;\">\r\n" + 
				"            <effects ObjectID=\"f46566a\" effectStringRep=\"sumAllProp = sumAllProp + to;\"/>\r\n" + 
				"            <effects ObjectID=\"f4dc7ba\" effectStringRep=\"prob2Int.add(new Probability2Value);\"/>\r\n" + 
				"            <effects ObjectID=\"f20b257\" effectStringRep=\"prob2Int.get(prob2Int.size - 1).probabilityUpperLimit = to;\"/>\r\n" + 
				"            <effects ObjectID=\"f5793d3\" effectStringRep=\"prob2Int.get(prob2Int.size - 1).value = value;\"/>\r\n" + 
				"          </trAttach>\r\n" + 
				"        </stateMachine>\r\n" + 
				"      </ownedOperation>\r\n" + 
				"      <ownedOperation ObjectID=\"f66c63\" name=\"nextInt\" clazz=\"//@packages.1/@ownedMemberPackage.4\" returnType=\"//@packages.0/@ownedMemberPackage.0\">\r\n" + 
				"        <stateMachine ObjectID=\"f30aac5\" name=\"YStateMachinef30aac5\">\r\n" + 
				"          <transition ObjectID=\"f5626fe\" name=\"YTransitionf5626fe\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.2\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@trAttach.0\"/>\r\n" + 
				"          <transition ObjectID=\"f43cf6d\" name=\"YTransitionf43cf6d\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.2\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@trAttach.1\"/>\r\n" + 
				"          <transition ObjectID=\"f532d9a\" name=\"YTransitionf532d9a\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.5\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.3\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@trAttach.2\"/>\r\n" + 
				"          <transition ObjectID=\"f1d935c\" name=\"YTransitionf1d935c\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.4\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.3\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@trAttach.3\"/>\r\n" + 
				"          <transition ObjectID=\"f7c9630\" name=\"YTransitionf7c9630\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.3\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.4\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@trAttach.4\"/>\r\n" + 
				"          <transition ObjectID=\"f146bd8\" name=\"YTransitionf146bd8\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.3\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.1\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@trAttach.5\"/>\r\n" + 
				"          <transition ObjectID=\"f19a4e3\" name=\"YTransitionf19a4e3\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.4\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.1\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@trAttach.6\"/>\r\n" + 
				"          <transition ObjectID=\"f1440f2\" name=\"YTransitionf1440f2\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.2\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.5\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@trAttach.7\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f311e7\" name=\"YPseudostatef311e7\" outgoing=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.0 //@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.1\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f4ede39\" name=\"YFinalStatef4ede39\" incoming=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.5 //@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.6\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f1c1425\" name=\"YStatef1c1425\" outgoing=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.7\" incoming=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.0 //@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.1\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f6c9142\" name=\"YStatef6c9142\" outgoing=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.4 //@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.5\" incoming=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.2 //@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.3\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f6995d3\" name=\"YStatef6995d3\" outgoing=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.3 //@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.6\" incoming=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.4\"/>\r\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f577f47\" name=\"YStatef577f47\" outgoing=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.2\" incoming=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.7\"/>\r\n" + 
				"          <trAttach ObjectID=\"f59536\" name=\"YTrAttachmentf59536\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.0\" guardStringRep=\"USE_GAUSSIAN;\">\r\n" + 
				"            <effects ObjectID=\"f6de5ab\" effectStringRep=\"r = (random as java.util.Random).nextGaussian;\"/>\r\n" + 
				"          </trAttach>\r\n" + 
				"          <trAttach ObjectID=\"f70685\" name=\"YTrAttachmentf70685\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.1\" guardStringRep=\"!USE_GAUSSIAN;\">\r\n" + 
				"            <effects ObjectID=\"f325de1\" effectStringRep=\"r = (random as java.util.Random).nextDouble;\"/>\r\n" + 
				"          </trAttach>\r\n" + 
				"          <trAttach ObjectID=\"f2dd09a\" name=\"YTrAttachmentf2dd09a\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.2\" guardStringRep=\"true;\">\r\n" + 
				"            <effects ObjectID=\"f2050fd\" effectStringRep=\"x = 0;\"/>\r\n" + 
				"            <effects ObjectID=\"f728e4a\" effectStringRep=\"i = 0;\"/>\r\n" + 
				"          </trAttach>\r\n" + 
				"          <trAttach ObjectID=\"f654c2c\" name=\"YTrAttachmentf654c2c\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.3\" guardStringRep=\"r > entry.probabilityUpperLimit + x;\"/>\r\n" + 
				"          <trAttach ObjectID=\"f177a55\" name=\"YTrAttachmentf177a55\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.4\" guardStringRep=\"i &lt; prob2Int.size;\">\r\n" + 
				"            <effects ObjectID=\"f2bde0d\" effectStringRep=\"entry = prob2Int.get(i++);\"/>\r\n" + 
				"            <effects ObjectID=\"f4be425\" effectStringRep=\"x = x + entry.probabilityUpperLimit;\"/>\r\n" + 
				"          </trAttach>\r\n" + 
				"          <trAttach ObjectID=\"f34e904\" name=\"YTrAttachmentf34e904\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.5\" guardStringRep=\"i >= prob2Int.size;\">\r\n" + 
				"            <effects ObjectID=\"f1b61b9\" effectStringRep=\"setReturnValue(0);\"/>\r\n" + 
				"          </trAttach>\r\n" + 
				"          <trAttach ObjectID=\"f6e4855\" name=\"YTrAttachmentf6e4855\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.6\" guardStringRep=\"r &lt;= entry.probabilityUpperLimit + x;\">\r\n" + 
				"            <effects ObjectID=\"f7a9b6f\" effectStringRep=\"setReturnValue(entry.value);\"/>\r\n" + 
				"          </trAttach>\r\n" + 
				"          <trAttach ObjectID=\"f7758dd\" name=\"YTrAttachmentf7758dd\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.7\" guardStringRep=\"true;\">\r\n" + 
				"            <effects ObjectID=\"f5dc2c3\" effectStringRep=\"r = r * sumAllProp;\"/>\r\n" + 
				"          </trAttach>\r\n" + 
				"        </stateMachine>\r\n" + 
				"      </ownedOperation>\r\n" + 
				"    </ownedMemberPackage>\r\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f6019cc\" name=\"Probability2Value\" package=\"//@packages.1\" superClass=\"//@clazz.0\">\r\n" + 
				"      <ownedAttribute ObjectID=\"f5512dc\" name=\"probabilityUpperLimit\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.1\" clazz=\"//@packages.1/@ownedMemberPackage.5\"/>\r\n" + 
				"      <ownedAttribute ObjectID=\"f6e635c\" name=\"value\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@packages.1/@ownedMemberPackage.5\"/>\r\n" + 
				"    </ownedMemberPackage>\r\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f67d23f\" name=\"Delay\" package=\"//@packages.1\" superClass=\"//@clazz.0 //@packages.1/@ownedMemberPackage.3\"/>\r\n" + 
				"  </packages>\r\n" + 
				"</yammDiagram:YModel>\r\n" + 
				"";

		return EMPTY_PROJECT;
	}
	/**
	 * Returns the content for the *.yammdiagram file representing a simple 'Hello World' model.
	 * 
	 * @return	{@code HELLO_WORLD}
	 */
	public static String helloWorldExample()
	{
		final String HELLO_WORLD = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" + 
				"<yammDiagram:YModel xmi:version=\"2.0\" xmlns:xmi=\"http://www.omg.org/XMI\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:yammDiagram=\"http://www.yamm.online/coreModelDiagram/YammDiagram\">\n" + 
				"  <clazz ObjectID=\"f5e24a2\" name=\"RObject\">\n" + 
				"    <ownedAttribute ObjectID=\"f2bd771\" name=\"rContainer\" type=\"//@clazz.0\" clazz=\"//@clazz.0\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f55ebef\" name=\"yClass\" type=\"//@packages.0/@ownedMemberPackage.4\" clazz=\"//@clazz.0\"/>\n" + 
				"    <ownedAttribute ObjectID=\"fbb4ab\" name=\"ObjectID\" type=\"//@packages.0/@ownedMemberPackage.3\" clazz=\"//@clazz.0\"/>\n" + 
				"  </clazz>\n" + 
				"  <clazz ObjectID=\"f4cc70d\" name=\"YClass\" superClass=\"//@clazz.0\"/>\n" + 
				"  <clazz ObjectID=\"f22b043\" name=\"ClassA\" superClass=\"//@clazz.0\">\n" + 
				"    <ownedAttribute ObjectID=\"f4ff98\" name=\"index\" association=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@clazz.2\"/>\n" + 
				"    <ownedOperation ObjectID=\"f6b0287\" name=\"operationA\" clazz=\"//@clazz.2\">\n" + 
				"      <stateMachine ObjectID=\"f70717e\" name=\"YStateMachinef70717e\" initialActive=\"true\">\n" + 
				"        <transition ObjectID=\"f674d5c\" name=\"YTransitionf674d5c\" source=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.2\" target=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.2\" attachment=\"//@clazz.2/@ownedOperation.0/@stateMachine/@trAttach.0\"/>\n" + 
				"        <transition ObjectID=\"f426f89\" name=\"YTransitionf426f89\" source=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.2\" attachment=\"//@clazz.2/@ownedOperation.0/@stateMachine/@trAttach.1\"/>\n" + 
				"        <transition ObjectID=\"f5e3494\" name=\"YTransitionf5e3494\" source=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.2\" target=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@clazz.2/@ownedOperation.0/@stateMachine/@trAttach.2\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f5f4ff9\" name=\"YPseudostatef5f4ff9\" outgoing=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.1\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f105780\" name=\"YFinalStatef105780\" incoming=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.2\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f40c65d\" name=\"YStatef40c65d\" outgoing=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.0 //@clazz.2/@ownedOperation.0/@stateMachine/@transition.2\" incoming=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.0 //@clazz.2/@ownedOperation.0/@stateMachine/@transition.1\"/>\n" + 
				"        <trAttach ObjectID=\"f1b2c29\" name=\"YTrAttachmentf1b2c29\" transition=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.0\" guardStringRep=\"index &lt; 5;&#xA;\">\n" + 
				"          <effects ObjectID=\"f2d3344\" effectStringRep=\"&#xA;index++;\"/>\n" + 
				"          <effects ObjectID=\"f24564b\" effectStringRep=\"&#xA;Print(&quot;hello world&quot;);&#xA;\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f56507f\" name=\"YTrAttachmentf56507f\" transition=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.1\" guardStringRep=\"true;\">\n" + 
				"          <effects ObjectID=\"fe5ff6\" effectStringRep=\"index = 0;&#xA;\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f6cc524\" name=\"YTrAttachmentf6cc524\" transition=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.2\" guardStringRep=\"index == 5;&#xA;\"/>\n" + 
				"      </stateMachine>\n" + 
				"    </ownedOperation>\n" + 
				"  </clazz>\n" + 
				"  <packages ObjectID=\"f186d36\" name=\"Types\">\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f21f575\" name=\"Integer\" package=\"//@packages.0\"/>\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f6ff69c\" name=\"Double\" package=\"//@packages.0\"/>\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f143957\" name=\"Boolean\" package=\"//@packages.0\"/>\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f4f4a1\" name=\"String\" package=\"//@packages.0\"/>\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"fea65c\" name=\"Object\" package=\"//@packages.0\"/>\n" + 
				"  </packages>\n" + 
				"  <packages ObjectID=\"f2bcfa4\" name=\"DES\">\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f6f1844\" name=\"EventQueue\" package=\"//@packages.1\" superClass=\"//@clazz.0\">\n" + 
				"      <ownedOperation ObjectID=\"f78653a\" name=\"consume\" clazz=\"//@packages.1/@ownedMemberPackage.0\" returnType=\"//@packages.1/@ownedMemberPackage.3\">\n" + 
				"        <ownedParameter ObjectID=\"f741ee8\" name=\"timeStep\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\n" + 
				"        <ownedParameter ObjectID=\"f325830\" name=\"past\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.2\"/>\n" + 
				"        <ownedParameter ObjectID=\"f1385ca\" name=\"eventType\" isUnique=\"true\" type=\"//@clazz.1\"/>\n" + 
				"        <ownedParameter ObjectID=\"f334831\" name=\"receiver\" isUnique=\"true\" type=\"//@clazz.0\"/>\n" + 
				"        <ownedParameter ObjectID=\"f4cda47\" name=\"receiverType\" isUnique=\"true\" type=\"//@clazz.1\"/>\n" + 
				"        <stateMachine ObjectID=\"f2a9bdf\" name=\"YStateMachinef2a9bdf\"/>\n" + 
				"      </ownedOperation>\n" + 
				"      <ownedOperation ObjectID=\"f60b252\" name=\"peek\" clazz=\"//@packages.1/@ownedMemberPackage.0\" returnType=\"//@packages.1/@ownedMemberPackage.3\">\n" + 
				"        <ownedParameter ObjectID=\"f465861\" name=\"timeStep\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\n" + 
				"        <ownedParameter ObjectID=\"f4b5255\" name=\"past\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.2\"/>\n" + 
				"        <ownedParameter ObjectID=\"f7afd77\" name=\"eventType\" isUnique=\"true\" type=\"//@clazz.1\"/>\n" + 
				"        <ownedParameter ObjectID=\"f82b36\" name=\"receiver\" isUnique=\"true\" type=\"//@clazz.0\"/>\n" + 
				"        <ownedParameter ObjectID=\"fd7951\" name=\"receiverType\" isUnique=\"true\" type=\"//@clazz.1\"/>\n" + 
				"        <stateMachine ObjectID=\"f545e73\" name=\"YStateMachinef545e73\"/>\n" + 
				"      </ownedOperation>\n" + 
				"    </ownedMemberPackage>\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f7b30f\" name=\"Queue\" package=\"//@packages.1\" superClass=\"//@clazz.0 //@packages.1/@ownedMemberPackage.2\">\n" + 
				"      <ownedAttribute ObjectID=\"f9f8bb\" name=\"queue\" association=\"true\" upper=\"-1\" aggregation=\"composite\" type=\"//@packages.1/@ownedMemberPackage.2\" clazz=\"//@packages.1/@ownedMemberPackage.1\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f386ee1\" name=\"delayed\" association=\"true\" upper=\"-1\" aggregation=\"composite\" type=\"//@packages.1/@ownedMemberPackage.2\" clazz=\"//@packages.1/@ownedMemberPackage.1\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f2f987a\" name=\"event\" isUnique=\"true\" type=\"//@packages.1/@ownedMemberPackage.3\" clazz=\"//@packages.1/@ownedMemberPackage.1\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f660fa1\" name=\"var_objectManagment\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.4\" clazz=\"//@packages.1/@ownedMemberPackage.1\"/>\n" + 
				"      <ownedOperation ObjectID=\"f20be76\" name=\"add\" clazz=\"//@packages.1/@ownedMemberPackage.1\">\n" + 
				"        <ownedParameter ObjectID=\"f4f4254\" name=\"object\" isUnique=\"true\" type=\"//@packages.1/@ownedMemberPackage.2\"/>\n" + 
				"        <stateMachine ObjectID=\"f4abe3c\" name=\"YStateMachinef4abe3c\">\n" + 
				"          <transition ObjectID=\"f5e9a9b\" name=\"YTransitionf5e9a9b\" source=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.0/@stateMachine/@trAttach.0\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f38ff8d\" name=\"YPseudostatef38ff8d\" outgoing=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.0/@stateMachine/@transition.0\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f22957b\" name=\"YFinalStatef22957b\" incoming=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.0/@stateMachine/@transition.0\"/>\n" + 
				"          <trAttach ObjectID=\"f529472\" name=\"YTrAttachmentf529472\" transition=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.0/@stateMachine/@transition.0\" guardStringRep=\"true;\">\n" + 
				"            <effects ObjectID=\"f3d0304\" effectStringRep=\"queue.add(object);\"/>\n" + 
				"            <effects ObjectID=\"f160b70\" effectStringRep=\"var_objectManagment = getObjectManagement();\"/>\n" + 
				"            <effects ObjectID=\"f6420ae\" effectStringRep=\"(var_objectManagment as online.yamm.ObjectManagement).addQueueElement(this, object, 1);\"/>\n" + 
				"          </trAttach>\n" + 
				"        </stateMachine>\n" + 
				"      </ownedOperation>\n" + 
				"      <ownedOperation ObjectID=\"f68084f\" name=\"consume\" clazz=\"//@packages.1/@ownedMemberPackage.1\" returnType=\"//@packages.1/@ownedMemberPackage.2\">\n" + 
				"        <ownedParameter ObjectID=\"f34e890\" name=\"filterMap\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.4\"/>\n" + 
				"        <stateMachine ObjectID=\"f467557\" name=\"YStateMachinef467557\"/>\n" + 
				"      </ownedOperation>\n" + 
				"      <ownedOperation ObjectID=\"f7b77c9\" name=\"peek\" clazz=\"//@packages.1/@ownedMemberPackage.1\" returnType=\"//@packages.1/@ownedMemberPackage.2\">\n" + 
				"        <ownedParameter ObjectID=\"f310db4\" name=\"filterMap\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.4\"/>\n" + 
				"        <stateMachine ObjectID=\"f549a88\" name=\"YStateMachinef549a88\"/>\n" + 
				"      </ownedOperation>\n" + 
				"      <ownedOperation ObjectID=\"f275fe\" name=\"addWithDelay\" clazz=\"//@packages.1/@ownedMemberPackage.1\">\n" + 
				"        <ownedParameter ObjectID=\"f2f3872\" name=\"object\" isUnique=\"true\" type=\"//@packages.1/@ownedMemberPackage.2\"/>\n" + 
				"        <ownedParameter ObjectID=\"f8dd49\" name=\"delay\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\n" + 
				"        <ownedParameter ObjectID=\"f468ab9\" name=\"timeStep\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\n" + 
				"        <stateMachine ObjectID=\"f48a287\" name=\"YStateMachinef48a287\">\n" + 
				"          <transition ObjectID=\"f58fd62\" name=\"YTransitionf58fd62\" source=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.3/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.3/@stateMachine/@subvertex.1\" attachment=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.3/@stateMachine/@trAttach.0\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f4b5238\" name=\"YPseudostatef4b5238\" outgoing=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.3/@stateMachine/@transition.0\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f5e46aa\" name=\"YFinalStatef5e46aa\" incoming=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.3/@stateMachine/@transition.0\"/>\n" + 
				"          <trAttach ObjectID=\"f459b0\" name=\"YTrAttachmentf459b0\" transition=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.3/@stateMachine/@transition.0\" guardStringRep=\"true;\">\n" + 
				"            <effects ObjectID=\"f3af920\" effectStringRep=\"var_objectManagment = getObjectManagement();\"/>\n" + 
				"            <effects ObjectID=\"f3726ea\" effectStringRep=\"(var_objectManagment as online.yamm.ObjectManagement).addDelayedQueueElement(this, object, 1);\"/>\n" + 
				"            <effects ObjectID=\"f59be5a\" effectStringRep=\"delayed.add(object);\"/>\n" + 
				"            <effects ObjectID=\"f6f18ad\" effectStringRep=\"event = new Delay;\"/>\n" + 
				"            <effects ObjectID=\"f28d54b\" effectStringRep=\"event.timeStep = timeStep + delay;\"/>\n" + 
				"            <effects ObjectID=\"f3ae638\" effectStringRep=\"event.objectAttached = object;\"/>\n" + 
				"            <effects ObjectID=\"f5109cb\" effectStringRep=\"event.receivingObject = this;\"/>\n" + 
				"          </trAttach>\n" + 
				"        </stateMachine>\n" + 
				"      </ownedOperation>\n" + 
				"      <ownedOperation ObjectID=\"f764840\" name=\"simulate\" clazz=\"//@packages.1/@ownedMemberPackage.1\" returnType=\"//@packages.0/@ownedMemberPackage.2\">\n" + 
				"        <ownedParameter ObjectID=\"f68416a\" name=\"timeStep\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\n" + 
				"        <stateMachine ObjectID=\"f7e7e66\" name=\"YStateMachinef7e7e66\">\n" + 
				"          <transition ObjectID=\"f2b7fa1\" name=\"YTransitionf2b7fa1\" source=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.2\" target=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.0\" attachment=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@trAttach.0\"/>\n" + 
				"          <transition ObjectID=\"f4bfb83\" name=\"YTransitionf4bfb83\" source=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.1\" attachment=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@trAttach.1\"/>\n" + 
				"          <transition ObjectID=\"f78cae7\" name=\"YTransitionf78cae7\" source=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.1\" target=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.3\" attachment=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@trAttach.2\"/>\n" + 
				"          <transition ObjectID=\"f3b1426\" name=\"YTransitionf3b1426\" source=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.1\" target=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.3\" attachment=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@trAttach.3\"/>\n" + 
				"          <transition ObjectID=\"f411019\" name=\"YTransitionf411019\" source=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.3\" attachment=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@trAttach.4\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"fe5506\" name=\"YStatefe5506\" outgoing=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.1 //@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.4\" incoming=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.0\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f4cf3d0\" name=\"YStatef4cf3d0\" outgoing=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.2 //@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.3\" incoming=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.1\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f384d51\" name=\"YPseudostatef384d51\" outgoing=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.0\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f2e7b01\" name=\"YFinalStatef2e7b01\" incoming=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.2 //@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.3 //@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.4\"/>\n" + 
				"          <trAttach ObjectID=\"f14e78f\" name=\"YTrAttachmentf14e78f\" transition=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.0\" guardStringRep=\"true;\">\n" + 
				"            <effects ObjectID=\"f48c6c2\" effectStringRep=\"event = DES.EventQueue.peek(timeStep, true, null, this, null);\"/>\n" + 
				"          </trAttach>\n" + 
				"          <trAttach ObjectID=\"f1e9b4e\" name=\"YTrAttachmentf1e9b4e\" transition=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.1\" guardStringRep=\"event != null;\"/>\n" + 
				"          <trAttach ObjectID=\"f5eb936\" name=\"YTrAttachmentf5eb936\" transition=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.2\" guardStringRep=\"event instanceof Delay;\">\n" + 
				"            <effects ObjectID=\"f2c724a\" effectStringRep=\"DES.EventQueue.consume(timeStep, true, null, this, null);\"/>\n" + 
				"            <effects ObjectID=\"fe6655\" effectStringRep=\"(var_objectManagment as online.yamm.ObjectManagement).removeDelayedQueueElement(this, event.objectAttached, 1);\"/>\n" + 
				"            <effects ObjectID=\"fb8378\" effectStringRep=\"add(event.objectAttached);\"/>\n" + 
				"            <effects ObjectID=\"f271ec5\" effectStringRep=\"setReturnValue(true);\"/>\n" + 
				"          </trAttach>\n" + 
				"          <trAttach ObjectID=\"f3696b8\" name=\"YTrAttachmentf3696b8\" transition=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.3\" guardStringRep=\"!(event instanceof Delay);\">\n" + 
				"            <effects ObjectID=\"f430192\" effectStringRep=\"setReturnValue(false);\"/>\n" + 
				"          </trAttach>\n" + 
				"          <trAttach ObjectID=\"f11f883\" name=\"YTrAttachmentf11f883\" transition=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.4\" guardStringRep=\"event == null;\">\n" + 
				"            <effects ObjectID=\"f41db92\" effectStringRep=\"setReturnValue(false);\"/>\n" + 
				"          </trAttach>\n" + 
				"        </stateMachine>\n" + 
				"      </ownedOperation>\n" + 
				"    </ownedMemberPackage>\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f40b04f\" name=\"SimulationObject\" package=\"//@packages.1\" superClass=\"//@clazz.0\">\n" + 
				"      <ownedAttribute ObjectID=\"f555e10\" name=\"name\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.3\" clazz=\"//@packages.1/@ownedMemberPackage.2\"/>\n" + 
				"      <ownedOperation ObjectID=\"f10ddfa\" name=\"simulate\" clazz=\"//@packages.1/@ownedMemberPackage.2\" returnType=\"//@packages.0/@ownedMemberPackage.2\">\n" + 
				"        <ownedParameter ObjectID=\"f7873fc\" name=\"timeStep\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\n" + 
				"        <stateMachine ObjectID=\"f2ac9f0\" name=\"YStateMachinef2ac9f0\">\n" + 
				"          <transition ObjectID=\"f79f4b8\" name=\"YTransitionf79f4b8\" source=\"//@packages.1/@ownedMemberPackage.2/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.2/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@packages.1/@ownedMemberPackage.2/@ownedOperation.0/@stateMachine/@trAttach.0\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f68bf82\" name=\"YPseudostatef68bf82\" outgoing=\"//@packages.1/@ownedMemberPackage.2/@ownedOperation.0/@stateMachine/@transition.0\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f68c2fb\" name=\"YFinalStatef68c2fb\" incoming=\"//@packages.1/@ownedMemberPackage.2/@ownedOperation.0/@stateMachine/@transition.0\"/>\n" + 
				"          <trAttach ObjectID=\"f352f8d\" name=\"YTrAttachmentf352f8d\" transition=\"//@packages.1/@ownedMemberPackage.2/@ownedOperation.0/@stateMachine/@transition.0\" guardStringRep=\"true;\">\n" + 
				"            <effects ObjectID=\"f284471\" effectStringRep=\"setReturnValue(false);\"/>\n" + 
				"          </trAttach>\n" + 
				"        </stateMachine>\n" + 
				"      </ownedOperation>\n" + 
				"    </ownedMemberPackage>\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f2a26c9\" name=\"Event\" package=\"//@packages.1\" superClass=\"//@clazz.0\">\n" + 
				"      <ownedAttribute ObjectID=\"f3128f5\" name=\"timeStep\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@packages.1/@ownedMemberPackage.3\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f4063c7\" name=\"receivingType\" isUnique=\"true\" type=\"//@clazz.1\" clazz=\"//@packages.1/@ownedMemberPackage.3\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f197074\" name=\"description\" type=\"//@packages.0/@ownedMemberPackage.3\" clazz=\"//@packages.1/@ownedMemberPackage.3\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f94f5c\" name=\"receivingObject\" association=\"true\" isUnique=\"true\" type=\"//@packages.1/@ownedMemberPackage.2\" clazz=\"//@packages.1/@ownedMemberPackage.3\">\n" + 
				"        <ownedElement xsi:type=\"yammDiagram:YParameter\" ObjectID=\"f465861\" name=\"timeStep\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\n" + 
				"      </ownedAttribute>\n" + 
				"      <ownedAttribute ObjectID=\"f210054\" name=\"objectAttached\" association=\"true\" isUnique=\"true\" type=\"//@packages.1/@ownedMemberPackage.2\" clazz=\"//@packages.1/@ownedMemberPackage.3\"/>\n" + 
				"      <ownedOperation ObjectID=\"f6b9c0b\" name=\"toString\" clazz=\"//@packages.1/@ownedMemberPackage.3\" returnType=\"//@packages.0/@ownedMemberPackage.3\">\n" + 
				"        <stateMachine ObjectID=\"f694554\" name=\"YStateMachinef694554\">\n" + 
				"          <transition ObjectID=\"f76f663\" name=\"YTransitionf76f663\" source=\"//@packages.1/@ownedMemberPackage.3/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.3/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@packages.1/@ownedMemberPackage.3/@ownedOperation.0/@stateMachine/@trAttach.0\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f759d05\" name=\"YPseudostatef759d05\" outgoing=\"//@packages.1/@ownedMemberPackage.3/@ownedOperation.0/@stateMachine/@transition.0\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f190b71\" name=\"YFinalStatef190b71\" incoming=\"//@packages.1/@ownedMemberPackage.3/@ownedOperation.0/@stateMachine/@transition.0\"/>\n" + 
				"          <trAttach ObjectID=\"f776ef5\" name=\"YTrAttachmentf776ef5\" transition=\"//@packages.1/@ownedMemberPackage.3/@ownedOperation.0/@stateMachine/@transition.0\" guardStringRep=\"true;\">\n" + 
				"            <effects ObjectID=\"f1ac343\" effectStringRep=\"setReturnValue(&quot;TODO: Event.toString()&quot;);\"/>\n" + 
				"          </trAttach>\n" + 
				"        </stateMachine>\n" + 
				"      </ownedOperation>\n" + 
				"    </ownedMemberPackage>\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f5961ed\" name=\"Randomizer\" package=\"//@packages.1\" superClass=\"//@clazz.0\">\n" + 
				"      <ownedAttribute ObjectID=\"f49b547\" name=\"random\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.4\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f13e889\" name=\"USE_GAUSSIAN\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.2\" clazz=\"//@packages.1/@ownedMemberPackage.4\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f66b9ac\" name=\"i\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@packages.1/@ownedMemberPackage.4\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f19d97b\" name=\"prob2Int\" association=\"true\" upper=\"-1\" aggregation=\"composite\" type=\"//@packages.1/@ownedMemberPackage.5\" clazz=\"//@packages.1/@ownedMemberPackage.4\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f41fa4e\" name=\"entry\" association=\"true\" isUnique=\"true\" type=\"//@packages.1/@ownedMemberPackage.5\" clazz=\"//@packages.1/@ownedMemberPackage.4\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f7d11a1\" name=\"r\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.1\" clazz=\"//@packages.1/@ownedMemberPackage.4\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f672a3d\" name=\"x\" isUnique=\"true\" defaultValue=\"&quot;0&quot;\" type=\"//@packages.0/@ownedMemberPackage.1\" clazz=\"//@packages.1/@ownedMemberPackage.4\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f64dcec\" name=\"sumAllProp\" isUnique=\"true\" defaultValue=\"&quot;0&quot;\" type=\"//@packages.0/@ownedMemberPackage.1\" clazz=\"//@packages.1/@ownedMemberPackage.4\"/>\n" + 
				"      <ownedOperation ObjectID=\"f27d00b\" name=\"addProbInt\" clazz=\"//@packages.1/@ownedMemberPackage.4\">\n" + 
				"        <ownedParameter ObjectID=\"f46955f\" name=\"to\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.1\"/>\n" + 
				"        <ownedParameter ObjectID=\"f547076\" name=\"value\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\n" + 
				"        <stateMachine ObjectID=\"f7f9230\" name=\"YStateMachinef7f9230\">\n" + 
				"          <transition ObjectID=\"f16bfc2\" name=\"YTransitionf16bfc2\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.0/@stateMachine/@trAttach.0\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f5ef90\" name=\"YPseudostatef5ef90\" outgoing=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.0/@stateMachine/@transition.0\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f3b08da\" name=\"YFinalStatef3b08da\" incoming=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.0/@stateMachine/@transition.0\"/>\n" + 
				"          <trAttach ObjectID=\"f4c947d\" name=\"YTrAttachmentf4c947d\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.0/@stateMachine/@transition.0\" guardStringRep=\"true;\">\n" + 
				"            <effects ObjectID=\"f46566a\" effectStringRep=\"sumAllProp = sumAllProp + to;\"/>\n" + 
				"            <effects ObjectID=\"f4dc7ba\" effectStringRep=\"prob2Int.add(new Probability2Value);\"/>\n" + 
				"            <effects ObjectID=\"f20b257\" effectStringRep=\"prob2Int.get(prob2Int.size - 1).probabilityUpperLimit = to;\"/>\n" + 
				"            <effects ObjectID=\"f5793d3\" effectStringRep=\"prob2Int.get(prob2Int.size - 1).value = value;\"/>\n" + 
				"          </trAttach>\n" + 
				"        </stateMachine>\n" + 
				"      </ownedOperation>\n" + 
				"      <ownedOperation ObjectID=\"f66c63\" name=\"nextInt\" clazz=\"//@packages.1/@ownedMemberPackage.4\" returnType=\"//@packages.0/@ownedMemberPackage.0\">\n" + 
				"        <stateMachine ObjectID=\"f30aac5\" name=\"YStateMachinef30aac5\">\n" + 
				"          <transition ObjectID=\"f5626fe\" name=\"YTransitionf5626fe\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.2\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@trAttach.0\"/>\n" + 
				"          <transition ObjectID=\"f43cf6d\" name=\"YTransitionf43cf6d\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.2\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@trAttach.1\"/>\n" + 
				"          <transition ObjectID=\"f532d9a\" name=\"YTransitionf532d9a\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.5\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.3\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@trAttach.2\"/>\n" + 
				"          <transition ObjectID=\"f1d935c\" name=\"YTransitionf1d935c\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.4\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.3\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@trAttach.3\"/>\n" + 
				"          <transition ObjectID=\"f7c9630\" name=\"YTransitionf7c9630\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.3\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.4\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@trAttach.4\"/>\n" + 
				"          <transition ObjectID=\"f146bd8\" name=\"YTransitionf146bd8\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.3\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.1\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@trAttach.5\"/>\n" + 
				"          <transition ObjectID=\"f19a4e3\" name=\"YTransitionf19a4e3\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.4\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.1\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@trAttach.6\"/>\n" + 
				"          <transition ObjectID=\"f1440f2\" name=\"YTransitionf1440f2\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.2\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.5\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@trAttach.7\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f311e7\" name=\"YPseudostatef311e7\" outgoing=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.0 //@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.1\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f4ede39\" name=\"YFinalStatef4ede39\" incoming=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.5 //@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.6\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f1c1425\" name=\"YStatef1c1425\" outgoing=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.7\" incoming=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.0 //@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.1\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f6c9142\" name=\"YStatef6c9142\" outgoing=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.4 //@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.5\" incoming=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.2 //@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.3\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f6995d3\" name=\"YStatef6995d3\" outgoing=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.3 //@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.6\" incoming=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.4\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f577f47\" name=\"YStatef577f47\" outgoing=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.2\" incoming=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.7\"/>\n" + 
				"          <trAttach ObjectID=\"f59536\" name=\"YTrAttachmentf59536\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.0\" guardStringRep=\"USE_GAUSSIAN;\">\n" + 
				"            <effects ObjectID=\"f6de5ab\" effectStringRep=\"r = (random as java.util.Random).nextGaussian;\"/>\n" + 
				"          </trAttach>\n" + 
				"          <trAttach ObjectID=\"f70685\" name=\"YTrAttachmentf70685\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.1\" guardStringRep=\"!USE_GAUSSIAN;\">\n" + 
				"            <effects ObjectID=\"f325de1\" effectStringRep=\"r = (random as java.util.Random).nextDouble;\"/>\n" + 
				"          </trAttach>\n" + 
				"          <trAttach ObjectID=\"f2dd09a\" name=\"YTrAttachmentf2dd09a\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.2\" guardStringRep=\"true;\">\n" + 
				"            <effects ObjectID=\"f2050fd\" effectStringRep=\"x = 0;\"/>\n" + 
				"            <effects ObjectID=\"f728e4a\" effectStringRep=\"i = 0;\"/>\n" + 
				"          </trAttach>\n" + 
				"          <trAttach ObjectID=\"f654c2c\" name=\"YTrAttachmentf654c2c\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.3\" guardStringRep=\"r > entry.probabilityUpperLimit + x;\"/>\n" + 
				"          <trAttach ObjectID=\"f177a55\" name=\"YTrAttachmentf177a55\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.4\" guardStringRep=\"i &lt; prob2Int.size;\">\n" + 
				"            <effects ObjectID=\"f2bde0d\" effectStringRep=\"entry = prob2Int.get(i++);\"/>\n" + 
				"            <effects ObjectID=\"f4be425\" effectStringRep=\"x = x + entry.probabilityUpperLimit;\"/>\n" + 
				"          </trAttach>\n" + 
				"          <trAttach ObjectID=\"f34e904\" name=\"YTrAttachmentf34e904\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.5\" guardStringRep=\"i >= prob2Int.size;\">\n" + 
				"            <effects ObjectID=\"f1b61b9\" effectStringRep=\"setReturnValue(0);\"/>\n" + 
				"          </trAttach>\n" + 
				"          <trAttach ObjectID=\"f6e4855\" name=\"YTrAttachmentf6e4855\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.6\" guardStringRep=\"r &lt;= entry.probabilityUpperLimit + x;\">\n" + 
				"            <effects ObjectID=\"f7a9b6f\" effectStringRep=\"setReturnValue(entry.value);\"/>\n" + 
				"          </trAttach>\n" + 
				"          <trAttach ObjectID=\"f7758dd\" name=\"YTrAttachmentf7758dd\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.7\" guardStringRep=\"true;\">\n" + 
				"            <effects ObjectID=\"f5dc2c3\" effectStringRep=\"r = r * sumAllProp;\"/>\n" + 
				"          </trAttach>\n" + 
				"        </stateMachine>\n" + 
				"      </ownedOperation>\n" + 
				"    </ownedMemberPackage>\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f6019cc\" name=\"Probability2Value\" package=\"//@packages.1\" superClass=\"//@clazz.0\">\n" + 
				"      <ownedAttribute ObjectID=\"f5512dc\" name=\"probabilityUpperLimit\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.1\" clazz=\"//@packages.1/@ownedMemberPackage.5\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f6e635c\" name=\"value\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@packages.1/@ownedMemberPackage.5\"/>\n" + 
				"    </ownedMemberPackage>\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f67d23f\" name=\"Delay\" package=\"//@packages.1\" superClass=\"//@clazz.0 //@packages.1/@ownedMemberPackage.3\"/>\n" + 
				"  </packages>\n" + 
				"</yammDiagram:YModel>\n" + 
				"";
				return HELLO_WORLD;
	}
	
	public static String zeichenkettenSortierenExample()
	{
		return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" + 
				"<yammDiagram:YModel xmi:version=\"2.0\" xmlns:xmi=\"http://www.omg.org/XMI\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:yammDiagram=\"http://www.yamm.online/coreModelDiagram/YammDiagram\">\n" + 
				"  <clazz ObjectID=\"f5e24a2\" name=\"RObject\">\n" + 
				"    <ownedAttribute ObjectID=\"f2bd771\" name=\"rContainer\" type=\"//@clazz.0\" clazz=\"//@clazz.0\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f55ebef\" name=\"yClass\" type=\"//@packages.0/@ownedMemberPackage.4\" clazz=\"//@clazz.0\"/>\n" + 
				"    <ownedAttribute ObjectID=\"fbb4ab\" name=\"ObjectID\" type=\"//@packages.0/@ownedMemberPackage.3\" clazz=\"//@clazz.0\"/>\n" + 
				"  </clazz>\n" + 
				"  <clazz ObjectID=\"f4cc70d\" name=\"YClass\" superClass=\"//@clazz.0\"/>\n" + 
				"  <clazz ObjectID=\"f7df537\" name=\"Sortieren\" superClass=\"//@clazz.0\">\n" + 
				"    <ownedAttribute ObjectID=\"fcb759\" name=\"strings\" upper=\"-1\" type=\"//@packages.0/@ownedMemberPackage.3\" clazz=\"//@clazz.2\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f4e1b74\" name=\"index\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@clazz.2\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f25da91\" name=\"helper\" type=\"//@packages.0/@ownedMemberPackage.3\" clazz=\"//@clazz.2\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f7142b6\" name=\"einPaarNichtRichtigSortier\" type=\"//@packages.0/@ownedMemberPackage.2\" clazz=\"//@clazz.2\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f4c459\" name=\"returnValueComparable\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@clazz.2\"/>\n" + 
				"    <ownedOperation ObjectID=\"f478b1e\" name=\"start\" clazz=\"//@clazz.2\">\n" + 
				"      <stateMachine ObjectID=\"f52a2ce\" name=\"YStateMachinef52a2ce\" initialActive=\"true\">\n" + 
				"        <transition ObjectID=\"f2306d0\" name=\"YTransitionf18a2fe\" source=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.2\" attachment=\"//@clazz.2/@ownedOperation.0/@stateMachine/@trAttach.0\"/>\n" + 
				"        <transition ObjectID=\"f4710a8\" name=\"YTransitionf7adcf3\" source=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.2\" target=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.3\" attachment=\"//@clazz.2/@ownedOperation.0/@stateMachine/@trAttach.1\"/>\n" + 
				"        <transition ObjectID=\"f587372\" name=\"YTransitionf626838\" source=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.3\" target=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.4\" attachment=\"//@clazz.2/@ownedOperation.0/@stateMachine/@trAttach.2\"/>\n" + 
				"        <transition ObjectID=\"f1c6169\" name=\"YTransitionf5e9478\" source=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.10\" target=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.5\" attachment=\"//@clazz.2/@ownedOperation.0/@stateMachine/@trAttach.3\"/>\n" + 
				"        <transition ObjectID=\"f9f1cf\" name=\"YTransitionf49c810\" source=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.5\" target=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.7\"/>\n" + 
				"        <transition ObjectID=\"f4be78a\" name=\"YTransitionf8edd2\" source=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.10\" target=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.6\" attachment=\"//@clazz.2/@ownedOperation.0/@stateMachine/@trAttach.4\"/>\n" + 
				"        <transition ObjectID=\"f846eb\" name=\"YTransitionf77f300\" source=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.6\" target=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.7\"/>\n" + 
				"        <transition ObjectID=\"f1f7b89\" name=\"YTransitionf149e6f\" source=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.7\" target=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.8\" attachment=\"//@clazz.2/@ownedOperation.0/@stateMachine/@trAttach.5\"/>\n" + 
				"        <transition ObjectID=\"f187079\" name=\"YTransitionf134780\" source=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.8\" target=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.4\" attachment=\"//@clazz.2/@ownedOperation.0/@stateMachine/@trAttach.9\"/>\n" + 
				"        <transition ObjectID=\"f6fb02f\" name=\"YTransitionf39c903\" source=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.8\" target=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.9\" attachment=\"//@clazz.2/@ownedOperation.0/@stateMachine/@trAttach.6\"/>\n" + 
				"        <transition ObjectID=\"f5097f1\" name=\"YTransitionf5b17d3\" source=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.9\" target=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@clazz.2/@ownedOperation.0/@stateMachine/@trAttach.7\"/>\n" + 
				"        <transition ObjectID=\"f13604e\" name=\"YTransitionf465048\" source=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.9\" target=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.3\" attachment=\"//@clazz.2/@ownedOperation.0/@stateMachine/@trAttach.8\"/>\n" + 
				"        <transition ObjectID=\"f7b7260\" name=\"YTransitionf7b7260\" source=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.4\" target=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.10\" attachment=\"//@clazz.2/@ownedOperation.0/@stateMachine/@trAttach.10\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f8c5a3\" name=\"YPseudostatef45d6a8\" outgoing=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.0\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f6662f4\" name=\"YFinalStatef71f8de\" incoming=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.10\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f914f8\" name=\"YStatef2aa7a9\" outgoing=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.1\" incoming=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.0\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f18104a\" name=\"YStatef684f3d\" outgoing=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.2\" incoming=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.1 //@clazz.2/@ownedOperation.0/@stateMachine/@transition.11\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f3dea1d\" name=\"YStatef1051a4\" outgoing=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.12\" incoming=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.8 //@clazz.2/@ownedOperation.0/@stateMachine/@transition.2\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f4c5e8b\" name=\"YStatef1ecb03\" outgoing=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.4\" incoming=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.3\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f622349\" name=\"YStatef596424\" outgoing=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.6\" incoming=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.5\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f78ff71\" name=\"YStatef136a75\" outgoing=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.7\" incoming=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.4 //@clazz.2/@ownedOperation.0/@stateMachine/@transition.6\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f159029\" name=\"YStatef30789c\" outgoing=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.8 //@clazz.2/@ownedOperation.0/@stateMachine/@transition.9\" incoming=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.7\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f2d2e06\" name=\"YStatef7994d2\" outgoing=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.10 //@clazz.2/@ownedOperation.0/@stateMachine/@transition.11\" incoming=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.9\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f452b9d\" name=\"YStatef452b9d\" outgoing=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.5 //@clazz.2/@ownedOperation.0/@stateMachine/@transition.3\" incoming=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.12\"/>\n" + 
				"        <trAttach ObjectID=\"f55beea\" name=\"YTrAttachmentf7fbf22\" transition=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.0\" guardStringRep=\"true;\">\n" + 
				"          <effects ObjectID=\"f564e22\" effectStringRep=\"strings.add(&quot;cb&quot;);&#xA;\"/>\n" + 
				"          <effects ObjectID=\"f420417\" effectStringRep=\"strings.add(&quot;ab&quot;);&#xA;\"/>\n" + 
				"          <effects ObjectID=\"f1fc5b5\" effectStringRep=\"strings.add(&quot;aa&quot;);&#xA;\"/>\n" + 
				"          <effects ObjectID=\"f3d896a\" effectStringRep=\"strings.add(&quot;bc&quot;);&#xA;\"/>\n" + 
				"          <effects ObjectID=\"f1a742d\" effectStringRep=\"strings.add(&quot;aab&quot;);&#xA;\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f78a9b6\" name=\"YTrAttachmentf6b2581\" transition=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.1\" guardStringRep=\"true;\">\n" + 
				"          <effects ObjectID=\"f4a7057\" effectStringRep=\"Print(strings);&#xA;\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f3cdfd5\" name=\"YTrAttachmentf3f20df\" transition=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.2\" guardStringRep=\"true;\">\n" + 
				"          <effects ObjectID=\"f7f9ba\" effectStringRep=\"index = 0;\"/>\n" + 
				"          <effects ObjectID=\"f3254a4\" effectStringRep=\"einPaarNichtRichtigSortier = false;\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f7a57be\" name=\"YTrAttachmentffdad9\" transition=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.3\" guardStringRep=\"returnValueComparable > 0&#xA;\">\n" + 
				"          <effects ObjectID=\"f38e158\" effectStringRep=\"einPaarNichtRichtigSortier = true;\"/>\n" + 
				"          <effects ObjectID=\"f7207b9\" effectStringRep=\"helper = strings.get(index + 1);&#xA;\"/>\n" + 
				"          <effects ObjectID=\"f65677c\" effectStringRep=\"strings.set(index + 1, strings.get(index));&#xA;\"/>\n" + 
				"          <effects ObjectID=\"f22038d\" effectStringRep=\"strings.set(index, helper);&#xA;\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f1091f1\" name=\"YTrAttachmentf1926ab\" transition=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.5\" guardStringRep=\"returnValueComparable &lt;= 0&#xA;\"/>\n" + 
				"        <trAttach ObjectID=\"f5f13c7\" name=\"YTrAttachmentf6e5796\" transition=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.7\" guardStringRep=\"true;\">\n" + 
				"          <effects ObjectID=\"f1cc89\" effectStringRep=\"index++;\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f3f1ca2\" name=\"YTrAttachmentf3aeaa5\" transition=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.9\" guardStringRep=\"index == strings.size() - 1;&#xA;\"/>\n" + 
				"        <trAttach ObjectID=\"f209ec1\" name=\"YTrAttachmentf650ba5\" transition=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.10\" guardStringRep=\"einPaarNichtRichtigSortier == false;\">\n" + 
				"          <effects ObjectID=\"f6175a8\" effectStringRep=\"Print(strings);&#xA;\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f492b7\" name=\"TrAttachmentf4b7bd4\" transition=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.11\" guardStringRep=\"einPaarNichtRichtigSortier == true;\">\n" + 
				"          <effects ObjectID=\"f5ec429\" effectStringRep=\"index = 0;\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f8848d\" name=\"TrAttachmentf73518b\" transition=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.8\" guardStringRep=\"index &lt; strings.size() - 1;&#xA;\"/>\n" + 
				"        <trAttach ObjectID=\"f1e5100\" name=\"YTrAttachmentf1e5100\" transition=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.12\" guardStringRep=\"true;&#xA;\">\n" + 
				"          <effects ObjectID=\"f5b5686\" effectStringRep=\"returnValueComparable = strings.get(index).compareTo(strings.get(index + 1)) ;&#xA;\"/>\n" + 
				"        </trAttach>\n" + 
				"      </stateMachine>\n" + 
				"    </ownedOperation>\n" + 
				"  </clazz>\n" + 
				"  <packages ObjectID=\"f186d36\" name=\"Types\">\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f21f575\" name=\"Integer\" package=\"//@packages.0\"/>\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f6ff69c\" name=\"Double\" package=\"//@packages.0\"/>\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f143957\" name=\"Boolean\" package=\"//@packages.0\"/>\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f4f4a1\" name=\"String\" package=\"//@packages.0\"/>\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"fea65c\" name=\"Object\" package=\"//@packages.0\"/>\n" + 
				"  </packages>\n" + 
				"  <packages ObjectID=\"f2bcfa4\" name=\"DES\">\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f6f1844\" name=\"EventQueue\" package=\"//@packages.1\" superClass=\"//@clazz.0\">\n" + 
				"      <ownedOperation ObjectID=\"f78653a\" name=\"consume\" clazz=\"//@packages.1/@ownedMemberPackage.0\" returnType=\"//@packages.1/@ownedMemberPackage.3\">\n" + 
				"        <ownedParameter ObjectID=\"f741ee8\" name=\"timeStep\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\n" + 
				"        <ownedParameter ObjectID=\"f325830\" name=\"past\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.2\"/>\n" + 
				"        <ownedParameter ObjectID=\"f1385ca\" name=\"eventType\" isUnique=\"true\" type=\"//@clazz.1\"/>\n" + 
				"        <ownedParameter ObjectID=\"f334831\" name=\"receiver\" isUnique=\"true\" type=\"//@clazz.0\"/>\n" + 
				"        <ownedParameter ObjectID=\"f4cda47\" name=\"receiverType\" isUnique=\"true\" type=\"//@clazz.1\"/>\n" + 
				"        <stateMachine ObjectID=\"f2a9bdf\" name=\"YStateMachinef2a9bdf\"/>\n" + 
				"      </ownedOperation>\n" + 
				"      <ownedOperation ObjectID=\"f60b252\" name=\"peek\" clazz=\"//@packages.1/@ownedMemberPackage.0\" returnType=\"//@packages.1/@ownedMemberPackage.3\">\n" + 
				"        <ownedParameter ObjectID=\"f465861\" name=\"timeStep\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\n" + 
				"        <ownedParameter ObjectID=\"f4b5255\" name=\"past\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.2\"/>\n" + 
				"        <ownedParameter ObjectID=\"f7afd77\" name=\"eventType\" isUnique=\"true\" type=\"//@clazz.1\"/>\n" + 
				"        <ownedParameter ObjectID=\"f82b36\" name=\"receiver\" isUnique=\"true\" type=\"//@clazz.0\"/>\n" + 
				"        <ownedParameter ObjectID=\"fd7951\" name=\"receiverType\" isUnique=\"true\" type=\"//@clazz.1\"/>\n" + 
				"        <stateMachine ObjectID=\"f545e73\" name=\"YStateMachinef545e73\"/>\n" + 
				"      </ownedOperation>\n" + 
				"    </ownedMemberPackage>\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f7b30f\" name=\"Queue\" package=\"//@packages.1\" superClass=\"//@clazz.0 //@packages.1/@ownedMemberPackage.2\">\n" + 
				"      <ownedAttribute ObjectID=\"f9f8bb\" name=\"queue\" association=\"true\" upper=\"-1\" aggregation=\"composite\" type=\"//@packages.1/@ownedMemberPackage.2\" clazz=\"//@packages.1/@ownedMemberPackage.1\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f386ee1\" name=\"delayed\" association=\"true\" upper=\"-1\" aggregation=\"composite\" type=\"//@packages.1/@ownedMemberPackage.2\" clazz=\"//@packages.1/@ownedMemberPackage.1\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f2f987a\" name=\"event\" isUnique=\"true\" type=\"//@packages.1/@ownedMemberPackage.3\" clazz=\"//@packages.1/@ownedMemberPackage.1\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f660fa1\" name=\"var_objectManagment\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.4\" clazz=\"//@packages.1/@ownedMemberPackage.1\"/>\n" + 
				"      <ownedOperation ObjectID=\"f20be76\" name=\"add\" clazz=\"//@packages.1/@ownedMemberPackage.1\">\n" + 
				"        <ownedParameter ObjectID=\"f4f4254\" name=\"object\" isUnique=\"true\" type=\"//@packages.1/@ownedMemberPackage.2\"/>\n" + 
				"        <stateMachine ObjectID=\"f4abe3c\" name=\"YStateMachinef4abe3c\">\n" + 
				"          <transition ObjectID=\"f5e9a9b\" name=\"YTransitionf5e9a9b\" source=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.0/@stateMachine/@trAttach.0\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f38ff8d\" name=\"YPseudostatef38ff8d\" outgoing=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.0/@stateMachine/@transition.0\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f22957b\" name=\"YFinalStatef22957b\" incoming=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.0/@stateMachine/@transition.0\"/>\n" + 
				"          <trAttach ObjectID=\"f529472\" name=\"YTrAttachmentf529472\" transition=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.0/@stateMachine/@transition.0\" guardStringRep=\"true;\">\n" + 
				"            <effects ObjectID=\"f3d0304\" effectStringRep=\"queue.add(object);\"/>\n" + 
				"            <effects ObjectID=\"f160b70\" effectStringRep=\"var_objectManagment = getObjectManagement();\"/>\n" + 
				"            <effects ObjectID=\"f6420ae\" effectStringRep=\"(var_objectManagment as online.yamm.ObjectManagement).addQueueElement(this, object, 1);\"/>\n" + 
				"          </trAttach>\n" + 
				"        </stateMachine>\n" + 
				"      </ownedOperation>\n" + 
				"      <ownedOperation ObjectID=\"f68084f\" name=\"consume\" clazz=\"//@packages.1/@ownedMemberPackage.1\" returnType=\"//@packages.1/@ownedMemberPackage.2\">\n" + 
				"        <ownedParameter ObjectID=\"f34e890\" name=\"filterMap\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.4\"/>\n" + 
				"        <stateMachine ObjectID=\"f467557\" name=\"YStateMachinef467557\"/>\n" + 
				"      </ownedOperation>\n" + 
				"      <ownedOperation ObjectID=\"f7b77c9\" name=\"peek\" clazz=\"//@packages.1/@ownedMemberPackage.1\" returnType=\"//@packages.1/@ownedMemberPackage.2\">\n" + 
				"        <ownedParameter ObjectID=\"f310db4\" name=\"filterMap\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.4\"/>\n" + 
				"        <stateMachine ObjectID=\"f549a88\" name=\"YStateMachinef549a88\"/>\n" + 
				"      </ownedOperation>\n" + 
				"      <ownedOperation ObjectID=\"f275fe\" name=\"addWithDelay\" clazz=\"//@packages.1/@ownedMemberPackage.1\">\n" + 
				"        <ownedParameter ObjectID=\"f2f3872\" name=\"object\" isUnique=\"true\" type=\"//@packages.1/@ownedMemberPackage.2\"/>\n" + 
				"        <ownedParameter ObjectID=\"f8dd49\" name=\"delay\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\n" + 
				"        <ownedParameter ObjectID=\"f468ab9\" name=\"timeStep\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\n" + 
				"        <stateMachine ObjectID=\"f48a287\" name=\"YStateMachinef48a287\">\n" + 
				"          <transition ObjectID=\"f58fd62\" name=\"YTransitionf58fd62\" source=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.3/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.3/@stateMachine/@subvertex.1\" attachment=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.3/@stateMachine/@trAttach.0\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f4b5238\" name=\"YPseudostatef4b5238\" outgoing=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.3/@stateMachine/@transition.0\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f5e46aa\" name=\"YFinalStatef5e46aa\" incoming=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.3/@stateMachine/@transition.0\"/>\n" + 
				"          <trAttach ObjectID=\"f459b0\" name=\"YTrAttachmentf459b0\" transition=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.3/@stateMachine/@transition.0\" guardStringRep=\"true;\">\n" + 
				"            <effects ObjectID=\"f3af920\" effectStringRep=\"var_objectManagment = getObjectManagement();\"/>\n" + 
				"            <effects ObjectID=\"f3726ea\" effectStringRep=\"(var_objectManagment as online.yamm.ObjectManagement).addDelayedQueueElement(this, object, 1);\"/>\n" + 
				"            <effects ObjectID=\"f59be5a\" effectStringRep=\"delayed.add(object);\"/>\n" + 
				"            <effects ObjectID=\"f6f18ad\" effectStringRep=\"event = new Delay;\"/>\n" + 
				"            <effects ObjectID=\"f28d54b\" effectStringRep=\"event.timeStep = timeStep + delay;\"/>\n" + 
				"            <effects ObjectID=\"f3ae638\" effectStringRep=\"event.objectAttached = object;\"/>\n" + 
				"            <effects ObjectID=\"f5109cb\" effectStringRep=\"event.receivingObject = this;\"/>\n" + 
				"          </trAttach>\n" + 
				"        </stateMachine>\n" + 
				"      </ownedOperation>\n" + 
				"      <ownedOperation ObjectID=\"f764840\" name=\"simulate\" clazz=\"//@packages.1/@ownedMemberPackage.1\" returnType=\"//@packages.0/@ownedMemberPackage.2\">\n" + 
				"        <ownedParameter ObjectID=\"f68416a\" name=\"timeStep\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\n" + 
				"        <stateMachine ObjectID=\"f7e7e66\" name=\"YStateMachinef7e7e66\">\n" + 
				"          <transition ObjectID=\"f2b7fa1\" name=\"YTransitionf2b7fa1\" source=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.2\" target=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.0\" attachment=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@trAttach.0\"/>\n" + 
				"          <transition ObjectID=\"f4bfb83\" name=\"YTransitionf4bfb83\" source=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.1\" attachment=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@trAttach.1\"/>\n" + 
				"          <transition ObjectID=\"f78cae7\" name=\"YTransitionf78cae7\" source=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.1\" target=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.3\" attachment=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@trAttach.2\"/>\n" + 
				"          <transition ObjectID=\"f3b1426\" name=\"YTransitionf3b1426\" source=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.1\" target=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.3\" attachment=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@trAttach.3\"/>\n" + 
				"          <transition ObjectID=\"f411019\" name=\"YTransitionf411019\" source=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.3\" attachment=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@trAttach.4\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"fe5506\" name=\"YStatefe5506\" outgoing=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.1 //@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.4\" incoming=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.0\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f4cf3d0\" name=\"YStatef4cf3d0\" outgoing=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.2 //@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.3\" incoming=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.1\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f384d51\" name=\"YPseudostatef384d51\" outgoing=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.0\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f2e7b01\" name=\"YFinalStatef2e7b01\" incoming=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.2 //@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.3 //@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.4\"/>\n" + 
				"          <trAttach ObjectID=\"f14e78f\" name=\"YTrAttachmentf14e78f\" transition=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.0\" guardStringRep=\"true;\">\n" + 
				"            <effects ObjectID=\"f48c6c2\" effectStringRep=\"event = DES.EventQueue.peek(timeStep, true, null, this, null);\"/>\n" + 
				"          </trAttach>\n" + 
				"          <trAttach ObjectID=\"f1e9b4e\" name=\"YTrAttachmentf1e9b4e\" transition=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.1\" guardStringRep=\"event != null;\"/>\n" + 
				"          <trAttach ObjectID=\"f5eb936\" name=\"YTrAttachmentf5eb936\" transition=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.2\" guardStringRep=\"event instanceof Delay;\">\n" + 
				"            <effects ObjectID=\"f2c724a\" effectStringRep=\"DES.EventQueue.consume(timeStep, true, null, this, null);\"/>\n" + 
				"            <effects ObjectID=\"fe6655\" effectStringRep=\"(var_objectManagment as online.yamm.ObjectManagement).removeDelayedQueueElement(this, event.objectAttached, 1);\"/>\n" + 
				"            <effects ObjectID=\"fb8378\" effectStringRep=\"add(event.objectAttached);\"/>\n" + 
				"            <effects ObjectID=\"f271ec5\" effectStringRep=\"setReturnValue(true);\"/>\n" + 
				"          </trAttach>\n" + 
				"          <trAttach ObjectID=\"f3696b8\" name=\"YTrAttachmentf3696b8\" transition=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.3\" guardStringRep=\"!(event instanceof Delay);\">\n" + 
				"            <effects ObjectID=\"f430192\" effectStringRep=\"setReturnValue(false);\"/>\n" + 
				"          </trAttach>\n" + 
				"          <trAttach ObjectID=\"f11f883\" name=\"YTrAttachmentf11f883\" transition=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.4\" guardStringRep=\"event == null;\">\n" + 
				"            <effects ObjectID=\"f41db92\" effectStringRep=\"setReturnValue(false);\"/>\n" + 
				"          </trAttach>\n" + 
				"        </stateMachine>\n" + 
				"      </ownedOperation>\n" + 
				"    </ownedMemberPackage>\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f40b04f\" name=\"SimulationObject\" package=\"//@packages.1\" superClass=\"//@clazz.0\">\n" + 
				"      <ownedAttribute ObjectID=\"f555e10\" name=\"name\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.3\" clazz=\"//@packages.1/@ownedMemberPackage.2\"/>\n" + 
				"      <ownedOperation ObjectID=\"f10ddfa\" name=\"simulate\" clazz=\"//@packages.1/@ownedMemberPackage.2\" returnType=\"//@packages.0/@ownedMemberPackage.2\">\n" + 
				"        <ownedParameter ObjectID=\"f7873fc\" name=\"timeStep\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\n" + 
				"        <stateMachine ObjectID=\"f2ac9f0\" name=\"YStateMachinef2ac9f0\">\n" + 
				"          <transition ObjectID=\"f79f4b8\" name=\"YTransitionf79f4b8\" source=\"//@packages.1/@ownedMemberPackage.2/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.2/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@packages.1/@ownedMemberPackage.2/@ownedOperation.0/@stateMachine/@trAttach.0\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f68bf82\" name=\"YPseudostatef68bf82\" outgoing=\"//@packages.1/@ownedMemberPackage.2/@ownedOperation.0/@stateMachine/@transition.0\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f68c2fb\" name=\"YFinalStatef68c2fb\" incoming=\"//@packages.1/@ownedMemberPackage.2/@ownedOperation.0/@stateMachine/@transition.0\"/>\n" + 
				"          <trAttach ObjectID=\"f352f8d\" name=\"YTrAttachmentf352f8d\" transition=\"//@packages.1/@ownedMemberPackage.2/@ownedOperation.0/@stateMachine/@transition.0\" guardStringRep=\"true;\">\n" + 
				"            <effects ObjectID=\"f284471\" effectStringRep=\"setReturnValue(false);\"/>\n" + 
				"          </trAttach>\n" + 
				"        </stateMachine>\n" + 
				"      </ownedOperation>\n" + 
				"    </ownedMemberPackage>\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f2a26c9\" name=\"Event\" package=\"//@packages.1\" superClass=\"//@clazz.0\">\n" + 
				"      <ownedAttribute ObjectID=\"f3128f5\" name=\"timeStep\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@packages.1/@ownedMemberPackage.3\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f4063c7\" name=\"receivingType\" isUnique=\"true\" type=\"//@clazz.1\" clazz=\"//@packages.1/@ownedMemberPackage.3\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f197074\" name=\"description\" type=\"//@packages.0/@ownedMemberPackage.3\" clazz=\"//@packages.1/@ownedMemberPackage.3\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f94f5c\" name=\"receivingObject\" association=\"true\" isUnique=\"true\" type=\"//@packages.1/@ownedMemberPackage.2\" clazz=\"//@packages.1/@ownedMemberPackage.3\">\n" + 
				"        <ownedElement xsi:type=\"yammDiagram:YParameter\" ObjectID=\"f465861\" name=\"timeStep\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\n" + 
				"      </ownedAttribute>\n" + 
				"      <ownedAttribute ObjectID=\"f210054\" name=\"objectAttached\" association=\"true\" isUnique=\"true\" type=\"//@packages.1/@ownedMemberPackage.2\" clazz=\"//@packages.1/@ownedMemberPackage.3\"/>\n" + 
				"      <ownedOperation ObjectID=\"f6b9c0b\" name=\"toString\" clazz=\"//@packages.1/@ownedMemberPackage.3\" returnType=\"//@packages.0/@ownedMemberPackage.3\">\n" + 
				"        <stateMachine ObjectID=\"f694554\" name=\"YStateMachinef694554\">\n" + 
				"          <transition ObjectID=\"f76f663\" name=\"YTransitionf76f663\" source=\"//@packages.1/@ownedMemberPackage.3/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.3/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@packages.1/@ownedMemberPackage.3/@ownedOperation.0/@stateMachine/@trAttach.0\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f759d05\" name=\"YPseudostatef759d05\" outgoing=\"//@packages.1/@ownedMemberPackage.3/@ownedOperation.0/@stateMachine/@transition.0\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f190b71\" name=\"YFinalStatef190b71\" incoming=\"//@packages.1/@ownedMemberPackage.3/@ownedOperation.0/@stateMachine/@transition.0\"/>\n" + 
				"          <trAttach ObjectID=\"f776ef5\" name=\"YTrAttachmentf776ef5\" transition=\"//@packages.1/@ownedMemberPackage.3/@ownedOperation.0/@stateMachine/@transition.0\" guardStringRep=\"true;\">\n" + 
				"            <effects ObjectID=\"f1ac343\" effectStringRep=\"setReturnValue(&quot;TODO: Event.toString()&quot;);\"/>\n" + 
				"          </trAttach>\n" + 
				"        </stateMachine>\n" + 
				"      </ownedOperation>\n" + 
				"    </ownedMemberPackage>\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f5961ed\" name=\"Randomizer\" package=\"//@packages.1\" superClass=\"//@clazz.0\">\n" + 
				"      <ownedAttribute ObjectID=\"f49b547\" name=\"random\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.4\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f13e889\" name=\"USE_GAUSSIAN\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.2\" clazz=\"//@packages.1/@ownedMemberPackage.4\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f66b9ac\" name=\"i\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@packages.1/@ownedMemberPackage.4\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f19d97b\" name=\"prob2Int\" association=\"true\" upper=\"-1\" aggregation=\"composite\" type=\"//@packages.1/@ownedMemberPackage.5\" clazz=\"//@packages.1/@ownedMemberPackage.4\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f41fa4e\" name=\"entry\" association=\"true\" isUnique=\"true\" type=\"//@packages.1/@ownedMemberPackage.5\" clazz=\"//@packages.1/@ownedMemberPackage.4\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f7d11a1\" name=\"r\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.1\" clazz=\"//@packages.1/@ownedMemberPackage.4\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f672a3d\" name=\"x\" isUnique=\"true\" defaultValue=\"&quot;0&quot;\" type=\"//@packages.0/@ownedMemberPackage.1\" clazz=\"//@packages.1/@ownedMemberPackage.4\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f64dcec\" name=\"sumAllProp\" isUnique=\"true\" defaultValue=\"&quot;0&quot;\" type=\"//@packages.0/@ownedMemberPackage.1\" clazz=\"//@packages.1/@ownedMemberPackage.4\"/>\n" + 
				"      <ownedOperation ObjectID=\"f27d00b\" name=\"addProbInt\" clazz=\"//@packages.1/@ownedMemberPackage.4\">\n" + 
				"        <ownedParameter ObjectID=\"f46955f\" name=\"to\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.1\"/>\n" + 
				"        <ownedParameter ObjectID=\"f547076\" name=\"value\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\n" + 
				"        <stateMachine ObjectID=\"f7f9230\" name=\"YStateMachinef7f9230\">\n" + 
				"          <transition ObjectID=\"f16bfc2\" name=\"YTransitionf16bfc2\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.0/@stateMachine/@trAttach.0\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f5ef90\" name=\"YPseudostatef5ef90\" outgoing=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.0/@stateMachine/@transition.0\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f3b08da\" name=\"YFinalStatef3b08da\" incoming=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.0/@stateMachine/@transition.0\"/>\n" + 
				"          <trAttach ObjectID=\"f4c947d\" name=\"YTrAttachmentf4c947d\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.0/@stateMachine/@transition.0\" guardStringRep=\"true;\">\n" + 
				"            <effects ObjectID=\"f46566a\" effectStringRep=\"sumAllProp = sumAllProp + to;\"/>\n" + 
				"            <effects ObjectID=\"f4dc7ba\" effectStringRep=\"prob2Int.add(new Probability2Value);\"/>\n" + 
				"            <effects ObjectID=\"f20b257\" effectStringRep=\"prob2Int.get(prob2Int.size - 1).probabilityUpperLimit = to;\"/>\n" + 
				"            <effects ObjectID=\"f5793d3\" effectStringRep=\"prob2Int.get(prob2Int.size - 1).value = value;\"/>\n" + 
				"          </trAttach>\n" + 
				"        </stateMachine>\n" + 
				"      </ownedOperation>\n" + 
				"      <ownedOperation ObjectID=\"f66c63\" name=\"nextInt\" clazz=\"//@packages.1/@ownedMemberPackage.4\" returnType=\"//@packages.0/@ownedMemberPackage.0\">\n" + 
				"        <stateMachine ObjectID=\"f30aac5\" name=\"YStateMachinef30aac5\">\n" + 
				"          <transition ObjectID=\"f5626fe\" name=\"YTransitionf5626fe\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.2\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@trAttach.0\"/>\n" + 
				"          <transition ObjectID=\"f43cf6d\" name=\"YTransitionf43cf6d\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.2\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@trAttach.1\"/>\n" + 
				"          <transition ObjectID=\"f532d9a\" name=\"YTransitionf532d9a\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.5\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.3\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@trAttach.2\"/>\n" + 
				"          <transition ObjectID=\"f1d935c\" name=\"YTransitionf1d935c\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.4\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.3\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@trAttach.3\"/>\n" + 
				"          <transition ObjectID=\"f7c9630\" name=\"YTransitionf7c9630\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.3\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.4\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@trAttach.4\"/>\n" + 
				"          <transition ObjectID=\"f146bd8\" name=\"YTransitionf146bd8\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.3\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.1\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@trAttach.5\"/>\n" + 
				"          <transition ObjectID=\"f19a4e3\" name=\"YTransitionf19a4e3\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.4\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.1\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@trAttach.6\"/>\n" + 
				"          <transition ObjectID=\"f1440f2\" name=\"YTransitionf1440f2\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.2\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.5\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@trAttach.7\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f311e7\" name=\"YPseudostatef311e7\" outgoing=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.0 //@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.1\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f4ede39\" name=\"YFinalStatef4ede39\" incoming=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.5 //@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.6\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f1c1425\" name=\"YStatef1c1425\" outgoing=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.7\" incoming=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.0 //@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.1\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f6c9142\" name=\"YStatef6c9142\" outgoing=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.4 //@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.5\" incoming=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.2 //@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.3\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f6995d3\" name=\"YStatef6995d3\" outgoing=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.3 //@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.6\" incoming=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.4\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f577f47\" name=\"YStatef577f47\" outgoing=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.2\" incoming=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.7\"/>\n" + 
				"          <trAttach ObjectID=\"f59536\" name=\"YTrAttachmentf59536\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.0\" guardStringRep=\"USE_GAUSSIAN;\">\n" + 
				"            <effects ObjectID=\"f6de5ab\" effectStringRep=\"r = (random as java.util.Random).nextGaussian;\"/>\n" + 
				"          </trAttach>\n" + 
				"          <trAttach ObjectID=\"f70685\" name=\"YTrAttachmentf70685\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.1\" guardStringRep=\"!USE_GAUSSIAN;\">\n" + 
				"            <effects ObjectID=\"f325de1\" effectStringRep=\"r = (random as java.util.Random).nextDouble;\"/>\n" + 
				"          </trAttach>\n" + 
				"          <trAttach ObjectID=\"f2dd09a\" name=\"YTrAttachmentf2dd09a\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.2\" guardStringRep=\"true;\">\n" + 
				"            <effects ObjectID=\"f2050fd\" effectStringRep=\"x = 0;\"/>\n" + 
				"            <effects ObjectID=\"f728e4a\" effectStringRep=\"i = 0;\"/>\n" + 
				"          </trAttach>\n" + 
				"          <trAttach ObjectID=\"f654c2c\" name=\"YTrAttachmentf654c2c\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.3\" guardStringRep=\"r > entry.probabilityUpperLimit + x;\"/>\n" + 
				"          <trAttach ObjectID=\"f177a55\" name=\"YTrAttachmentf177a55\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.4\" guardStringRep=\"i &lt; prob2Int.size;\">\n" + 
				"            <effects ObjectID=\"f2bde0d\" effectStringRep=\"entry = prob2Int.get(i++);\"/>\n" + 
				"            <effects ObjectID=\"f4be425\" effectStringRep=\"x = x + entry.probabilityUpperLimit;\"/>\n" + 
				"          </trAttach>\n" + 
				"          <trAttach ObjectID=\"f34e904\" name=\"YTrAttachmentf34e904\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.5\" guardStringRep=\"i >= prob2Int.size;\">\n" + 
				"            <effects ObjectID=\"f1b61b9\" effectStringRep=\"setReturnValue(0);\"/>\n" + 
				"          </trAttach>\n" + 
				"          <trAttach ObjectID=\"f6e4855\" name=\"YTrAttachmentf6e4855\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.6\" guardStringRep=\"r &lt;= entry.probabilityUpperLimit + x;\">\n" + 
				"            <effects ObjectID=\"f7a9b6f\" effectStringRep=\"setReturnValue(entry.value);\"/>\n" + 
				"          </trAttach>\n" + 
				"          <trAttach ObjectID=\"f7758dd\" name=\"YTrAttachmentf7758dd\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.7\" guardStringRep=\"true;\">\n" + 
				"            <effects ObjectID=\"f5dc2c3\" effectStringRep=\"r = r * sumAllProp;\"/>\n" + 
				"          </trAttach>\n" + 
				"        </stateMachine>\n" + 
				"      </ownedOperation>\n" + 
				"    </ownedMemberPackage>\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f6019cc\" name=\"Probability2Value\" package=\"//@packages.1\" superClass=\"//@clazz.0\">\n" + 
				"      <ownedAttribute ObjectID=\"f5512dc\" name=\"probabilityUpperLimit\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.1\" clazz=\"//@packages.1/@ownedMemberPackage.5\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f6e635c\" name=\"value\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@packages.1/@ownedMemberPackage.5\"/>\n" + 
				"    </ownedMemberPackage>\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f67d23f\" name=\"Delay\" package=\"//@packages.1\" superClass=\"//@clazz.0 //@packages.1/@ownedMemberPackage.3\"/>\n" + 
				"  </packages>\n" + 
				"</yammDiagram:YModel>\n" + 
				"";
	}
	
	public static String objekteSortierenExample()
	{
		return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" + 
				"<yammDiagram:YModel xmi:version=\"2.0\" xmlns:xmi=\"http://www.omg.org/XMI\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:yammDiagram=\"http://www.yamm.online/coreModelDiagram/YammDiagram\">\n" + 
				"  <clazz ObjectID=\"f5e24a2\" name=\"RObject\">\n" + 
				"    <ownedAttribute ObjectID=\"f2bd771\" name=\"rContainer\" type=\"//@clazz.0\" clazz=\"//@clazz.0\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f55ebef\" name=\"yClass\" type=\"//@packages.0/@ownedMemberPackage.4\" clazz=\"//@clazz.0\"/>\n" + 
				"    <ownedAttribute ObjectID=\"fbb4ab\" name=\"ObjectID\" type=\"//@packages.0/@ownedMemberPackage.3\" clazz=\"//@clazz.0\"/>\n" + 
				"  </clazz>\n" + 
				"  <clazz ObjectID=\"f4cc70d\" name=\"YClass\" superClass=\"//@clazz.0\"/>\n" + 
				"  <clazz ObjectID=\"f41825e\" name=\"ClassA\" superClass=\"//@clazz.0 //@packages.1/@ownedMemberPackage.1\">\n" + 
				"    <ownedAttribute ObjectID=\"f4efed5\" name=\"valueA\" type=\"//@packages.0/@ownedMemberPackage.2\" clazz=\"//@clazz.2\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f367b3b\" name=\"valueB\" type=\"//@packages.0/@ownedMemberPackage.3\" clazz=\"//@clazz.2\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f147d2a\" name=\"valueC\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@clazz.2\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f7a15b1\" name=\"state\" type=\"//@enumerations.0\" clazz=\"//@clazz.2\"/>\n" + 
				"    <ownedOperation ObjectID=\"f634ab5\" name=\"ClassA\" clazz=\"//@clazz.2\">\n" + 
				"      <ownedParameter ObjectID=\"fbe814\" name=\"valueA\" type=\"//@packages.0/@ownedMemberPackage.2\"/>\n" + 
				"      <ownedParameter ObjectID=\"f1bcbea\" name=\"valueB\" type=\"//@packages.0/@ownedMemberPackage.3\"/>\n" + 
				"      <ownedParameter ObjectID=\"f268e01\" name=\"valueC\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\n" + 
				"      <ownedParameter ObjectID=\"f6c44da\" name=\"state\" type=\"//@enumerations.0\"/>\n" + 
				"      <stateMachine ObjectID=\"f391422\" name=\"YStateMachinef391422\">\n" + 
				"        <transition ObjectID=\"f3824cb\" name=\"YTransitionf3824cb\" source=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@clazz.2/@ownedOperation.0/@stateMachine/@trAttach.0\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f7f6d71\" name=\"YPseudostatef7f6d71\" outgoing=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.0\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f42dae6\" name=\"YFinalStatef42dae6\" incoming=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.0\"/>\n" + 
				"        <trAttach ObjectID=\"f27570c\" name=\"YTrAttachmentf27570c\" transition=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.0\" guardStringRep=\"true;&#xA;\">\n" + 
				"          <effects ObjectID=\"f3a6414\" effectStringRep=\"this.valueA = valueA;&#xA;\"/>\n" + 
				"          <effects ObjectID=\"f56b4ef\" effectStringRep=\"this.state = state;&#xA;\"/>\n" + 
				"          <effects ObjectID=\"f24b1ac\" effectStringRep=\"this.valueB = valueB;&#xA;\"/>\n" + 
				"          <effects ObjectID=\"f47d18b\" effectStringRep=\"this.valueC = valueC;&#xA;\"/>\n" + 
				"        </trAttach>\n" + 
				"      </stateMachine>\n" + 
				"    </ownedOperation>\n" + 
				"    <ownedOperation ObjectID=\"f770f1a\" name=\"toString\" clazz=\"//@clazz.2\" returnType=\"//@packages.0/@ownedMemberPackage.3\">\n" + 
				"      <stateMachine ObjectID=\"f4e6075\" name=\"YStateMachinef4e6075\">\n" + 
				"        <transition ObjectID=\"f3f2f1d\" name=\"YTransitionf3f2f1d\" source=\"//@clazz.2/@ownedOperation.1/@stateMachine/@subvertex.0\" target=\"//@clazz.2/@ownedOperation.1/@stateMachine/@subvertex.1\" attachment=\"//@clazz.2/@ownedOperation.1/@stateMachine/@trAttach.0\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f4874d8\" name=\"YPseudostatef4874d8\" outgoing=\"//@clazz.2/@ownedOperation.1/@stateMachine/@transition.0\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f2d0501\" name=\"YFinalStatef2d0501\" incoming=\"//@clazz.2/@ownedOperation.1/@stateMachine/@transition.0\"/>\n" + 
				"        <trAttach ObjectID=\"f1ea709\" name=\"YTrAttachmentf1ea709\" transition=\"//@clazz.2/@ownedOperation.1/@stateMachine/@transition.0\" guardStringRep=\"true;\">\n" + 
				"          <effects ObjectID=\"f7e0b94\" effectStringRep=\"setReturnValue(&quot;[&quot; + state + &quot; &quot; + valueA + &quot; &quot; + valueB + &quot; &quot; + valueC + &quot;]&quot;);&#xA;\"/>\n" + 
				"        </trAttach>\n" + 
				"      </stateMachine>\n" + 
				"    </ownedOperation>\n" + 
				"    <ownedOperation ObjectID=\"f382c17\" name=\"compareTo\" clazz=\"//@clazz.2\" returnType=\"//@packages.0/@ownedMemberPackage.0\">\n" + 
				"      <ownedParameter ObjectID=\"f28571e\" name=\"otherObj\" type=\"//@packages.1/@ownedMemberPackage.1\"/>\n" + 
				"      <stateMachine ObjectID=\"f7ea921\" name=\"YStateMachinef7ea921\">\n" + 
				"        <transition ObjectID=\"f77f8be\" name=\"YTransitionf77f8be\" source=\"//@clazz.2/@ownedOperation.2/@stateMachine/@subvertex.5\" target=\"//@clazz.2/@ownedOperation.2/@stateMachine/@subvertex.2\" attachment=\"//@clazz.2/@ownedOperation.2/@stateMachine/@trAttach.0\"/>\n" + 
				"        <transition ObjectID=\"f6fbdcb\" name=\"YTransitionf6fbdcb\" source=\"//@clazz.2/@ownedOperation.2/@stateMachine/@subvertex.3\" target=\"//@clazz.2/@ownedOperation.2/@stateMachine/@subvertex.1\" attachment=\"//@clazz.2/@ownedOperation.2/@stateMachine/@trAttach.1\"/>\n" + 
				"        <transition ObjectID=\"f5c03bb\" name=\"YTransitionf5c03bb\" source=\"//@clazz.2/@ownedOperation.2/@stateMachine/@subvertex.2\" target=\"//@clazz.2/@ownedOperation.2/@stateMachine/@subvertex.3\" attachment=\"//@clazz.2/@ownedOperation.2/@stateMachine/@trAttach.2\"/>\n" + 
				"        <transition ObjectID=\"f4ceb2f\" name=\"YTransitionf4ceb2f\" source=\"//@clazz.2/@ownedOperation.2/@stateMachine/@subvertex.5\" target=\"//@clazz.2/@ownedOperation.2/@stateMachine/@subvertex.4\" attachment=\"//@clazz.2/@ownedOperation.2/@stateMachine/@trAttach.3\"/>\n" + 
				"        <transition ObjectID=\"f4c80b1\" name=\"YTransitionf4c80b1\" source=\"//@clazz.2/@ownedOperation.2/@stateMachine/@subvertex.4\" target=\"//@clazz.2/@ownedOperation.2/@stateMachine/@subvertex.1\" attachment=\"//@clazz.2/@ownedOperation.2/@stateMachine/@trAttach.4\"/>\n" + 
				"        <transition ObjectID=\"f2aad15\" name=\"YTransitionf2aad15\" source=\"//@clazz.2/@ownedOperation.2/@stateMachine/@subvertex.4\" target=\"//@clazz.2/@ownedOperation.2/@stateMachine/@subvertex.1\" attachment=\"//@clazz.2/@ownedOperation.2/@stateMachine/@trAttach.5\"/>\n" + 
				"        <transition ObjectID=\"f2d444c\" name=\"YTransitionf2d444c\" source=\"//@clazz.2/@ownedOperation.2/@stateMachine/@subvertex.2\" target=\"//@clazz.2/@ownedOperation.2/@stateMachine/@subvertex.1\" attachment=\"//@clazz.2/@ownedOperation.2/@stateMachine/@trAttach.6\"/>\n" + 
				"        <transition ObjectID=\"f513f8e\" name=\"YTransitionf513f8e\" source=\"//@clazz.2/@ownedOperation.2/@stateMachine/@subvertex.2\" target=\"//@clazz.2/@ownedOperation.2/@stateMachine/@subvertex.1\" attachment=\"//@clazz.2/@ownedOperation.2/@stateMachine/@trAttach.7\"/>\n" + 
				"        <transition ObjectID=\"f1b2923\" name=\"YTransitionf1b2923\" source=\"//@clazz.2/@ownedOperation.2/@stateMachine/@subvertex.3\" target=\"//@clazz.2/@ownedOperation.2/@stateMachine/@subvertex.1\" attachment=\"//@clazz.2/@ownedOperation.2/@stateMachine/@trAttach.8\"/>\n" + 
				"        <transition ObjectID=\"f3d1c9c\" name=\"YTransitionf3d1c9c\" source=\"//@clazz.2/@ownedOperation.2/@stateMachine/@subvertex.3\" target=\"//@clazz.2/@ownedOperation.2/@stateMachine/@subvertex.1\" attachment=\"//@clazz.2/@ownedOperation.2/@stateMachine/@trAttach.9\"/>\n" + 
				"        <transition ObjectID=\"f6a4b5b\" name=\"YTransitionf6a4b5b\" source=\"//@clazz.2/@ownedOperation.2/@stateMachine/@subvertex.0\" target=\"//@clazz.2/@ownedOperation.2/@stateMachine/@subvertex.5\" attachment=\"//@clazz.2/@ownedOperation.2/@stateMachine/@trAttach.10\"/>\n" + 
				"        <transition ObjectID=\"f6560bf\" name=\"YTransitionf6560bf\" source=\"//@clazz.2/@ownedOperation.2/@stateMachine/@subvertex.6\" target=\"//@clazz.2/@ownedOperation.2/@stateMachine/@subvertex.1\" attachment=\"//@clazz.2/@ownedOperation.2/@stateMachine/@trAttach.11\"/>\n" + 
				"        <transition ObjectID=\"f6d3ccf\" name=\"YTransitionf6d3ccf\" source=\"//@clazz.2/@ownedOperation.2/@stateMachine/@subvertex.6\" target=\"//@clazz.2/@ownedOperation.2/@stateMachine/@subvertex.1\" attachment=\"//@clazz.2/@ownedOperation.2/@stateMachine/@trAttach.12\"/>\n" + 
				"        <transition ObjectID=\"f20aa89\" name=\"YTransitionf20aa89\" source=\"//@clazz.2/@ownedOperation.2/@stateMachine/@subvertex.0\" target=\"//@clazz.2/@ownedOperation.2/@stateMachine/@subvertex.6\" attachment=\"//@clazz.2/@ownedOperation.2/@stateMachine/@trAttach.13\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f443bd0\" name=\"YPseudostatef443bd0\" outgoing=\"//@clazz.2/@ownedOperation.2/@stateMachine/@transition.10 //@clazz.2/@ownedOperation.2/@stateMachine/@transition.13\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f5f00bb\" name=\"YFinalStatef5f00bb\" incoming=\"//@clazz.2/@ownedOperation.2/@stateMachine/@transition.5 //@clazz.2/@ownedOperation.2/@stateMachine/@transition.4 //@clazz.2/@ownedOperation.2/@stateMachine/@transition.6 //@clazz.2/@ownedOperation.2/@stateMachine/@transition.7 //@clazz.2/@ownedOperation.2/@stateMachine/@transition.1 //@clazz.2/@ownedOperation.2/@stateMachine/@transition.8 //@clazz.2/@ownedOperation.2/@stateMachine/@transition.9 //@clazz.2/@ownedOperation.2/@stateMachine/@transition.11 //@clazz.2/@ownedOperation.2/@stateMachine/@transition.12\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f1d572b\" name=\"YStatef1d572b\" outgoing=\"//@clazz.2/@ownedOperation.2/@stateMachine/@transition.2 //@clazz.2/@ownedOperation.2/@stateMachine/@transition.6 //@clazz.2/@ownedOperation.2/@stateMachine/@transition.7\" incoming=\"//@clazz.2/@ownedOperation.2/@stateMachine/@transition.0\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f517494\" name=\"YStatef517494\" outgoing=\"//@clazz.2/@ownedOperation.2/@stateMachine/@transition.1 //@clazz.2/@ownedOperation.2/@stateMachine/@transition.8 //@clazz.2/@ownedOperation.2/@stateMachine/@transition.9\" incoming=\"//@clazz.2/@ownedOperation.2/@stateMachine/@transition.2\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f601a6b\" name=\"YStatef601a6b\" outgoing=\"//@clazz.2/@ownedOperation.2/@stateMachine/@transition.4 //@clazz.2/@ownedOperation.2/@stateMachine/@transition.5\" incoming=\"//@clazz.2/@ownedOperation.2/@stateMachine/@transition.3\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f55fb27\" name=\"YStatef55fb27\" outgoing=\"//@clazz.2/@ownedOperation.2/@stateMachine/@transition.3 //@clazz.2/@ownedOperation.2/@stateMachine/@transition.0\" incoming=\"//@clazz.2/@ownedOperation.2/@stateMachine/@transition.10\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f304045\" name=\"YStatef304045\" outgoing=\"//@clazz.2/@ownedOperation.2/@stateMachine/@transition.12 //@clazz.2/@ownedOperation.2/@stateMachine/@transition.11\" incoming=\"//@clazz.2/@ownedOperation.2/@stateMachine/@transition.13\"/>\n" + 
				"        <trAttach ObjectID=\"f5872b6\" name=\"YTrAttachmentf5872b6\" transition=\"//@clazz.2/@ownedOperation.2/@stateMachine/@transition.0\" guardStringRep=\"(otherObj as ClassA).valueA == valueA;&#xA;\"/>\n" + 
				"        <trAttach ObjectID=\"f63ddc6\" name=\"YTrAttachmentf63ddc6\" transition=\"//@clazz.2/@ownedOperation.2/@stateMachine/@transition.1\" guardStringRep=\"(otherObj as ClassA).valueC == valueC;&#xA;\">\n" + 
				"          <effects ObjectID=\"f1136a0\" effectStringRep=\"setReturnValue(0);&#xA;\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f703e70\" name=\"YTrAttachmentf703e70\" transition=\"//@clazz.2/@ownedOperation.2/@stateMachine/@transition.2\" guardStringRep=\"(otherObj as ClassA).valueB.compareTo(valueB) == 0\"/>\n" + 
				"        <trAttach ObjectID=\"f282dd5\" name=\"YTrAttachmentf282dd5\" transition=\"//@clazz.2/@ownedOperation.2/@stateMachine/@transition.3\" guardStringRep=\"(otherObj as ClassA).valueA != valueA;&#xA;\"/>\n" + 
				"        <trAttach ObjectID=\"f76aca3\" name=\"YTrAttachmentf76aca3\" transition=\"//@clazz.2/@ownedOperation.2/@stateMachine/@transition.4\" guardStringRep=\"valueA == false;&#xA;\">\n" + 
				"          <effects ObjectID=\"f1b62a9\" effectStringRep=\"setReturnValue(-1);&#xA;\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f61abb6\" name=\"YTrAttachmentf61abb6\" transition=\"//@clazz.2/@ownedOperation.2/@stateMachine/@transition.5\" guardStringRep=\"valueA == true;\">\n" + 
				"          <effects ObjectID=\"f4140bd\" effectStringRep=\"setReturnValue(1);&#xA;\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f374e79\" name=\"YTrAttachmentf374e79\" transition=\"//@clazz.2/@ownedOperation.2/@stateMachine/@transition.6\" guardStringRep=\"(otherObj as ClassA).valueB.compareTo(valueB) &lt; 0&#xA;\">\n" + 
				"          <effects ObjectID=\"f5cfb28\" effectStringRep=\"setReturnValue(1);&#xA;\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f61d1b\" name=\"YTrAttachmentf61d1b\" transition=\"//@clazz.2/@ownedOperation.2/@stateMachine/@transition.7\" guardStringRep=\"(otherObj as ClassA).valueB.compareTo(valueB) > 0&#xA;\">\n" + 
				"          <effects ObjectID=\"f76cc66\" effectStringRep=\"setReturnValue(-1);&#xA;\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f363466\" name=\"YTrAttachmentf363466\" transition=\"//@clazz.2/@ownedOperation.2/@stateMachine/@transition.8\" guardStringRep=\"(otherObj as ClassA).valueC > valueC;&#xA;\">\n" + 
				"          <effects ObjectID=\"f2c2909\" effectStringRep=\"setReturnValue(-1);&#xA;\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f6800b4\" name=\"YTrAttachmentf6800b4\" transition=\"//@clazz.2/@ownedOperation.2/@stateMachine/@transition.9\" guardStringRep=\"(otherObj as ClassA).valueC &lt; valueC;&#xA;\">\n" + 
				"          <effects ObjectID=\"f3be694\" effectStringRep=\"setReturnValue(1);&#xA;\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f77db26\" name=\"YTrAttachmentf77db26\" transition=\"//@clazz.2/@ownedOperation.2/@stateMachine/@transition.10\" guardStringRep=\"(otherObj as ClassA).state == state;&#xA;\"/>\n" + 
				"        <trAttach ObjectID=\"f23e62f\" name=\"YTrAttachmentf23e62f\" transition=\"//@clazz.2/@ownedOperation.2/@stateMachine/@transition.11\" guardStringRep=\"(otherObj as ClassA).state == State.stateB;&#xA;&#xA;\">\n" + 
				"          <effects ObjectID=\"f452f88\" effectStringRep=\"setReturnValue(-1);&#xA;\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f4c1218\" name=\"YTrAttachmentf4c1218\" transition=\"//@clazz.2/@ownedOperation.2/@stateMachine/@transition.12\" guardStringRep=\"(otherObj as ClassA).state == State.stateA;&#xA;&#xA;\">\n" + 
				"          <effects ObjectID=\"f71533a\" effectStringRep=\"setReturnValue(1);&#xA;\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f428251\" name=\"YTrAttachmentf428251\" transition=\"//@clazz.2/@ownedOperation.2/@stateMachine/@transition.13\" guardStringRep=\"(otherObj as ClassA).state != state;&#xA;\"/>\n" + 
				"      </stateMachine>\n" + 
				"    </ownedOperation>\n" + 
				"  </clazz>\n" + 
				"  <clazz ObjectID=\"f5dd6a1\" name=\"Main\" superClass=\"//@clazz.0\">\n" + 
				"    <ownedAttribute ObjectID=\"f432c5f\" name=\"objectsToSort\" association=\"true\" upper=\"-1\" type=\"//@clazz.2\" clazz=\"//@clazz.3\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f656143\" name=\"classA\" type=\"//@clazz.2\" clazz=\"//@clazz.3\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f3ee26c\" name=\"index\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@clazz.3\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f31d891\" name=\"str\" type=\"//@packages.0/@ownedMemberPackage.3\" clazz=\"//@clazz.3\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f5cc331\" name=\"sort\" association=\"true\" type=\"//@packages.1/@ownedMemberPackage.0\" clazz=\"//@clazz.3\"/>\n" + 
				"    <ownedOperation ObjectID=\"f5165e5\" name=\"mainOperation\" clazz=\"//@clazz.3\">\n" + 
				"      <stateMachine ObjectID=\"f29dc1b\" name=\"YStateMachinef29dc1b\" initialActive=\"true\">\n" + 
				"        <transition ObjectID=\"f23bf6a\" name=\"YTransitionf23bf6a\" source=\"//@clazz.3/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@clazz.3/@ownedOperation.0/@stateMachine/@subvertex.2\" attachment=\"//@clazz.3/@ownedOperation.0/@stateMachine/@trAttach.0\"/>\n" + 
				"        <transition ObjectID=\"f6ebd67\" name=\"YTransitionf6ebd67\" source=\"//@clazz.3/@ownedOperation.0/@stateMachine/@subvertex.2\" target=\"//@clazz.3/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@clazz.3/@ownedOperation.0/@stateMachine/@trAttach.1\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f7055c5\" name=\"YPseudostatef7055c5\" outgoing=\"//@clazz.3/@ownedOperation.0/@stateMachine/@transition.0\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f158965\" name=\"YFinalStatef158965\" incoming=\"//@clazz.3/@ownedOperation.0/@stateMachine/@transition.1\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f329d2c\" name=\"YStatef329d2c\" outgoing=\"//@clazz.3/@ownedOperation.0/@stateMachine/@transition.1\" incoming=\"//@clazz.3/@ownedOperation.0/@stateMachine/@transition.0\"/>\n" + 
				"        <trAttach ObjectID=\"f12d9a6\" name=\"YTrAttachmentf12d9a6\" transition=\"//@clazz.3/@ownedOperation.0/@stateMachine/@transition.0\" guardStringRep=\"true;&#xA;\">\n" + 
				"          <effects ObjectID=\"f3d0d26\" effectStringRep=\"classA = new ClassA(false, &quot;ab&quot;, 1, State.stateA);&#xA;\"/>\n" + 
				"          <effects ObjectID=\"f718d00\" effectStringRep=\"objectsToSort.add(classA);&#xA;\"/>\n" + 
				"          <effects ObjectID=\"f174250\" effectStringRep=\"classA = new ClassA(false, &quot;ac&quot;, 1, State.stateB);&#xA;\"/>\n" + 
				"          <effects ObjectID=\"f68b9a0\" effectStringRep=\"objectsToSort.add(classA);&#xA;\"/>\n" + 
				"          <effects ObjectID=\"f7097db\" effectStringRep=\"classA = new ClassA(true, &quot;ab&quot;, 1, State.stateB);&#xA;\"/>\n" + 
				"          <effects ObjectID=\"f4bc377\" effectStringRep=\"objectsToSort.add(classA);&#xA;\"/>\n" + 
				"          <effects ObjectID=\"f6a4bf6\" effectStringRep=\"classA = new ClassA(true, &quot;ab&quot;, 3, State.stateB);&#xA;\"/>\n" + 
				"          <effects ObjectID=\"f48264f\" effectStringRep=\"objectsToSort.add(classA);&#xA;\"/>\n" + 
				"          <effects ObjectID=\"f5e9b48\" effectStringRep=\"classA = new ClassA(false, &quot;ab&quot;, 3, State.stateA);&#xA;\"/>\n" + 
				"          <effects ObjectID=\"f3bb958\" effectStringRep=\"objectsToSort.add(classA);&#xA;\"/>\n" + 
				"          <effects ObjectID=\"f485ee1\" effectStringRep=\"classA = new ClassA(false, &quot;ab&quot;, 2, State.stateA);&#xA;\"/>\n" + 
				"          <effects ObjectID=\"f6f9320\" effectStringRep=\"objectsToSort.add(classA);&#xA;\"/>\n" + 
				"          <effects ObjectID=\"f5965ea\" effectStringRep=\"classA = new ClassA(true, &quot;ab&quot;, 2, State.stateA);&#xA;\"/>\n" + 
				"          <effects ObjectID=\"f7efbfb\" effectStringRep=\"objectsToSort.add(classA);&#xA;\"/>\n" + 
				"          <effects ObjectID=\"f3268a6\" effectStringRep=\"classA = new ClassA(true, &quot;aa&quot;, 2, State.stateB);&#xA;\"/>\n" + 
				"          <effects ObjectID=\"f44abb6\" effectStringRep=\"objectsToSort.add(classA);&#xA;\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f34eb91\" name=\"YTrAttachmentf34eb91\" transition=\"//@clazz.3/@ownedOperation.0/@stateMachine/@transition.1\" guardStringRep=\"true;&#xA;\">\n" + 
				"          <effects ObjectID=\"f4a887c\" effectStringRep=\"sort = new util.Sort();\"/>\n" + 
				"          <effects ObjectID=\"f2fe95e\" breakpoint=\"true\" effectStringRep=\"printObjs();&#xA;\"/>\n" + 
				"          <effects ObjectID=\"f2a7ec7\" effectStringRep=\"objectsToSort = sort.sort(objectsToSort as java.util.List&lt;util.Comparable>) as java.util.List&lt;ClassA>;&#xA;\"/>\n" + 
				"          <effects ObjectID=\"f57c25d\" effectStringRep=\"Print(&quot;---------------------------------------&quot;);&#xA;Print(&quot;---------------------------------------&quot;);\"/>\n" + 
				"          <effects ObjectID=\"f5c13e2\" effectStringRep=\"printObjs();&#xA;\"/>\n" + 
				"        </trAttach>\n" + 
				"      </stateMachine>\n" + 
				"    </ownedOperation>\n" + 
				"    <ownedOperation ObjectID=\"f5958b2\" name=\"printObjs\" clazz=\"//@clazz.3\">\n" + 
				"      <stateMachine ObjectID=\"f5cd450\" name=\"YStateMachinef5cd450\">\n" + 
				"        <transition ObjectID=\"f7ce103\" name=\"f7ce103\" source=\"//@clazz.3/@ownedOperation.1/@stateMachine/@subvertex.0\" target=\"//@clazz.3/@ownedOperation.1/@stateMachine/@subvertex.1\" attachment=\"//@clazz.3/@ownedOperation.1/@stateMachine/@trAttach.2\"/>\n" + 
				"        <transition ObjectID=\"f59a692\" name=\"f59a692\" source=\"//@clazz.3/@ownedOperation.1/@stateMachine/@subvertex.2\" target=\"//@clazz.3/@ownedOperation.1/@stateMachine/@subvertex.0\" attachment=\"//@clazz.3/@ownedOperation.1/@stateMachine/@trAttach.0\"/>\n" + 
				"        <transition ObjectID=\"f43ec41\" name=\"f43ec41\" source=\"//@clazz.3/@ownedOperation.1/@stateMachine/@subvertex.0\" target=\"//@clazz.3/@ownedOperation.1/@stateMachine/@subvertex.0\" attachment=\"//@clazz.3/@ownedOperation.1/@stateMachine/@trAttach.1\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f6aa818\" name=\"Statef6aa818\" outgoing=\"//@clazz.3/@ownedOperation.1/@stateMachine/@transition.0 //@clazz.3/@ownedOperation.1/@stateMachine/@transition.2\" incoming=\"//@clazz.3/@ownedOperation.1/@stateMachine/@transition.1 //@clazz.3/@ownedOperation.1/@stateMachine/@transition.2\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f2466e\" name=\"Statef2466e\" incoming=\"//@clazz.3/@ownedOperation.1/@stateMachine/@transition.0\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f17bda6\" name=\"YPseudostatef17bda6\" outgoing=\"//@clazz.3/@ownedOperation.1/@stateMachine/@transition.1\"/>\n" + 
				"        <trAttach ObjectID=\"f6c146\" name=\"TrAttachmentf6c146\" transition=\"//@clazz.3/@ownedOperation.1/@stateMachine/@transition.1\" guardStringRep=\"true;&#xA;\">\n" + 
				"          <effects ObjectID=\"f6334b6\" effectStringRep=\"index = 0;&#xA;\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f63c089\" name=\"TrAttachmentf63c089\" transition=\"//@clazz.3/@ownedOperation.1/@stateMachine/@transition.2\" guardStringRep=\"index &lt; objectsToSort.size;&#xA;\">\n" + 
				"          <effects ObjectID=\"f25066b\" effectStringRep=\"str = objectsToSort.get(index).toString;&#xA;\"/>\n" + 
				"          <effects ObjectID=\"f29e83d\" effectStringRep=\"Print(str);&#xA;\"/>\n" + 
				"          <effects ObjectID=\"f1b0b4c\" effectStringRep=\"index++;&#xA;\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f6fbbad\" name=\"TrAttachmentf6fbbad\" transition=\"//@clazz.3/@ownedOperation.1/@stateMachine/@transition.0\" guardStringRep=\"index == objectsToSort.size;&#xA;\"/>\n" + 
				"      </stateMachine>\n" + 
				"    </ownedOperation>\n" + 
				"  </clazz>\n" + 
				"  <enumerations ObjectID=\"f7b05e\" name=\"State\">\n" + 
				"    <ownedLiteral ObjectID=\"f9c556\" name=\"stateA\"/>\n" + 
				"    <ownedLiteral ObjectID=\"f188bb6\" name=\"stateB\"/>\n" + 
				"  </enumerations>\n" + 
				"  <packages ObjectID=\"f186d36\" name=\"Types\">\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f21f575\" name=\"Integer\" package=\"//@packages.0\"/>\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f6ff69c\" name=\"Double\" package=\"//@packages.0\"/>\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f143957\" name=\"Boolean\" package=\"//@packages.0\"/>\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f4f4a1\" name=\"String\" package=\"//@packages.0\"/>\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"fea65c\" name=\"Object\" package=\"//@packages.0\"/>\n" + 
				"  </packages>\n" + 
				"  <packages ObjectID=\"fc8b71\" name=\"util\">\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f3fb7df\" name=\"Sort\" package=\"//@packages.1\" superClass=\"//@clazz.0\">\n" + 
				"      <ownedAttribute ObjectID=\"f9dbce\" name=\"einPaarNichtRichtigSortier\" type=\"//@packages.0/@ownedMemberPackage.2\" clazz=\"//@packages.1/@ownedMemberPackage.0\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f7a4ee9\" name=\"helper\" type=\"//@packages.1/@ownedMemberPackage.1\" clazz=\"//@packages.1/@ownedMemberPackage.0\"/>\n" + 
				"      <ownedAttribute ObjectID=\"ffb349\" name=\"returnValueComparable\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@packages.1/@ownedMemberPackage.0\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f496104\" name=\"index\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@packages.1/@ownedMemberPackage.0\"/>\n" + 
				"      <ownedOperation ObjectID=\"f101bd0\" name=\"sort\" clazz=\"//@packages.1/@ownedMemberPackage.0\" returnType=\"//@packages.1/@ownedMemberPackage.1\" upper=\"-1\">\n" + 
				"        <ownedParameter ObjectID=\"f54e659\" name=\"objectsToSort\" upper=\"-1\" type=\"//@packages.1/@ownedMemberPackage.1\"/>\n" + 
				"        <stateMachine ObjectID=\"f41213d\" name=\"YStateMachinef41213d\">\n" + 
				"          <transition ObjectID=\"f153a29\" name=\"f153a29\" source=\"//@packages.1/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@subvertex.1\" target=\"//@packages.1/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@subvertex.6\" attachment=\"//@packages.1/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@trAttach.8\"/>\n" + 
				"          <transition ObjectID=\"f74d5c7\" name=\"f74d5c7\" source=\"//@packages.1/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@subvertex.4\" target=\"//@packages.1/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@packages.1/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@trAttach.2\"/>\n" + 
				"          <transition ObjectID=\"f467b9a\" name=\"f467b9a\" source=\"//@packages.1/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@subvertex.4\" attachment=\"//@packages.1/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@trAttach.7\"/>\n" + 
				"          <transition ObjectID=\"f34b783\" name=\"f34b783\" source=\"//@packages.1/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@subvertex.1\" target=\"//@packages.1/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@subvertex.8\" attachment=\"//@packages.1/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@trAttach.4\"/>\n" + 
				"          <transition ObjectID=\"f6e89f4\" name=\"f6e89f4\" source=\"//@packages.1/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@subvertex.3\" attachment=\"//@packages.1/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@trAttach.3\"/>\n" + 
				"          <transition ObjectID=\"f411d13\" name=\"f411d13\" source=\"//@packages.1/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@subvertex.3\" target=\"//@packages.1/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@subvertex.2\" attachment=\"//@packages.1/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@trAttach.1\"/>\n" + 
				"          <transition ObjectID=\"f4cadfb\" name=\"f4cadfb\" source=\"//@packages.1/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@subvertex.7\" target=\"//@packages.1/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@subvertex.0\" attachment=\"//@packages.1/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@trAttach.5\"/>\n" + 
				"          <transition ObjectID=\"f472208\" name=\"f472208\" source=\"//@packages.1/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@subvertex.3\" target=\"//@packages.1/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@subvertex.9\" attachment=\"//@packages.1/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@trAttach.6\"/>\n" + 
				"          <transition ObjectID=\"f747bb\" name=\"f747bb\" source=\"//@packages.1/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@subvertex.6\" target=\"//@packages.1/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@subvertex.7\"/>\n" + 
				"          <transition ObjectID=\"f565cb4\" name=\"f565cb4\" source=\"//@packages.1/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@subvertex.9\" target=\"//@packages.1/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@subvertex.4\" attachment=\"//@packages.1/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@trAttach.0\"/>\n" + 
				"          <transition ObjectID=\"f26cc11\" name=\"f26cc11\" source=\"//@packages.1/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@subvertex.8\" target=\"//@packages.1/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@subvertex.7\"/>\n" + 
				"          <transition ObjectID=\"f7e0747\" name=\"f7e0747\" source=\"//@packages.1/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@subvertex.5\" target=\"//@packages.1/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@subvertex.9\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f6257bf\" name=\"Statef6257bf\" outgoing=\"//@packages.1/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@transition.2 //@packages.1/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@transition.4\" incoming=\"//@packages.1/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@transition.6\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f4e2387\" name=\"Statef4e2387\" outgoing=\"//@packages.1/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@transition.0 //@packages.1/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@transition.3\" incoming=\"//@packages.1/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@transition.1\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f2cc9d3\" name=\"Statef2cc9d3\" incoming=\"//@packages.1/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@transition.5\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f324a4d\" name=\"Statef324a4d\" outgoing=\"//@packages.1/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@transition.5 //@packages.1/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@transition.7\" incoming=\"//@packages.1/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@transition.4\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f60b6d5\" name=\"Statef60b6d5\" outgoing=\"//@packages.1/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@transition.1\" incoming=\"//@packages.1/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@transition.2 //@packages.1/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@transition.9\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"ff587\" name=\"Stateff587\" outgoing=\"//@packages.1/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@transition.11\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f6cfa49\" name=\"Statef6cfa49\" outgoing=\"//@packages.1/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@transition.8\" incoming=\"//@packages.1/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@transition.0\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f62859b\" name=\"Statef62859b\" outgoing=\"//@packages.1/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@transition.6\" incoming=\"//@packages.1/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@transition.10 //@packages.1/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@transition.8\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f503f1d\" name=\"Statef503f1d\" outgoing=\"//@packages.1/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@transition.10\" incoming=\"//@packages.1/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@transition.3\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f49f482\" name=\"Statef49f482\" outgoing=\"//@packages.1/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@transition.9\" incoming=\"//@packages.1/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@transition.7 //@packages.1/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@transition.11\"/>\n" + 
				"          <trAttach ObjectID=\"f68de8a\" name=\"TrAttachmentf68de8a\" transition=\"//@packages.1/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@transition.9\" guardStringRep=\"true;\">\n" + 
				"            <effects ObjectID=\"f432f6d\" effectStringRep=\"index = 0;\"/>\n" + 
				"            <effects ObjectID=\"f16bcab\" effectStringRep=\"einPaarNichtRichtigSortier = false;\"/>\n" + 
				"          </trAttach>\n" + 
				"          <trAttach ObjectID=\"f2f3d0c\" name=\"TrAttachmentf2f3d0c\" transition=\"//@packages.1/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@transition.5\" guardStringRep=\"einPaarNichtRichtigSortier == false;&#xA;\">\n" + 
				"            <effects ObjectID=\"fc324f\" effectStringRep=\"setReturnValue(objectsToSort);&#xA;\"/>\n" + 
				"          </trAttach>\n" + 
				"          <trAttach ObjectID=\"f1a448e\" name=\"TrAttachmentf1a448e\" transition=\"//@packages.1/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@transition.1\" guardStringRep=\"true;&#xA;\">\n" + 
				"            <effects ObjectID=\"f17d552\" effectStringRep=\"returnValueComparable = objectsToSort.get(index).compareTo(objectsToSort.get(index + 1)) ;&#xA;\"/>\n" + 
				"          </trAttach>\n" + 
				"          <trAttach ObjectID=\"f674d52\" name=\"TrAttachmentf674d52\" transition=\"//@packages.1/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@transition.4\" guardStringRep=\"index == objectsToSort.size() - 1;&#xA;\"/>\n" + 
				"          <trAttach ObjectID=\"f23784e\" name=\"TrAttachmentf23784e\" transition=\"//@packages.1/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@transition.3\" guardStringRep=\"returnValueComparable > 0&#xA;\">\n" + 
				"            <effects ObjectID=\"f2b58d1\" effectStringRep=\"einPaarNichtRichtigSortier = true;\"/>\n" + 
				"            <effects ObjectID=\"f63d529\" effectStringRep=\"helper = objectsToSort.get(index + 1);&#xA;\"/>\n" + 
				"            <effects ObjectID=\"f6e06b1\" effectStringRep=\"objectsToSort.set(index + 1, objectsToSort.get(index));&#xA;\"/>\n" + 
				"            <effects ObjectID=\"ffebee\" effectStringRep=\"objectsToSort.set(index, helper);&#xA;\"/>\n" + 
				"          </trAttach>\n" + 
				"          <trAttach ObjectID=\"f7d6c7e\" name=\"TrAttachmentf7d6c7e\" transition=\"//@packages.1/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@transition.6\" guardStringRep=\"true;\">\n" + 
				"            <effects ObjectID=\"f4366f4\" effectStringRep=\"index++;\"/>\n" + 
				"          </trAttach>\n" + 
				"          <trAttach ObjectID=\"f6d7ea3\" name=\"TrAttachmentf6d7ea3\" transition=\"//@packages.1/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@transition.7\" guardStringRep=\"einPaarNichtRichtigSortier == true;\">\n" + 
				"            <effects ObjectID=\"f53732b\" effectStringRep=\"index = 0;\"/>\n" + 
				"          </trAttach>\n" + 
				"          <trAttach ObjectID=\"f2be2d7\" name=\"TrAttachmentf2be2d7\" transition=\"//@packages.1/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@transition.2\" guardStringRep=\"index &lt; objectsToSort.size() - 1;&#xA;\"/>\n" + 
				"          <trAttach ObjectID=\"f281e3\" name=\"TrAttachmentf281e3\" transition=\"//@packages.1/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@transition.0\" guardStringRep=\"returnValueComparable &lt;= 0&#xA;\"/>\n" + 
				"        </stateMachine>\n" + 
				"      </ownedOperation>\n" + 
				"    </ownedMemberPackage>\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f73fed0\" name=\"Comparable\" package=\"//@packages.1\" superClass=\"//@clazz.0\">\n" + 
				"      <ownedOperation ObjectID=\"f2e41cf\" name=\"compareTo\" clazz=\"//@packages.1/@ownedMemberPackage.1\" returnType=\"//@packages.0/@ownedMemberPackage.0\">\n" + 
				"        <ownedParameter ObjectID=\"f3a9c27\" name=\"otherObj\" type=\"//@packages.1/@ownedMemberPackage.1\"/>\n" + 
				"        <stateMachine ObjectID=\"f9a3f\" name=\"YStateMachinef9a3f\"/>\n" + 
				"      </ownedOperation>\n" + 
				"    </ownedMemberPackage>\n" + 
				"  </packages>\n" + 
				"</yammDiagram:YModel>\n" + 
				"";
	}
	
	public static String zahlenSortierenExample()
	{
		return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" + 
				"<yammDiagram:YModel xmi:version=\"2.0\" xmlns:xmi=\"http://www.omg.org/XMI\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:yammDiagram=\"http://www.yamm.online/coreModelDiagram/YammDiagram\">\n" + 
				"  <clazz ObjectID=\"f5e24a2\" name=\"RObject\">\n" + 
				"    <ownedAttribute ObjectID=\"f2bd771\" name=\"rContainer\" type=\"//@clazz.0\" clazz=\"//@clazz.0\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f55ebef\" name=\"yClass\" type=\"//@packages.0/@ownedMemberPackage.4\" clazz=\"//@clazz.0\"/>\n" + 
				"    <ownedAttribute ObjectID=\"fbb4ab\" name=\"ObjectID\" type=\"//@packages.0/@ownedMemberPackage.3\" clazz=\"//@clazz.0\"/>\n" + 
				"  </clazz>\n" + 
				"  <clazz ObjectID=\"f4cc70d\" name=\"YClass\" superClass=\"//@clazz.0\"/>\n" + 
				"  <clazz ObjectID=\"f7d3a04\" name=\"Sortieren\" superClass=\"//@clazz.0\">\n" + 
				"    <ownedAttribute ObjectID=\"f692796\" name=\"zahlen\" upper=\"-1\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@clazz.2\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f763e12\" name=\"index\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@clazz.2\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f581e11\" name=\"helper\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@clazz.2\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f75ae03\" name=\"einPaarNichtRichtigSortier\" type=\"//@packages.0/@ownedMemberPackage.2\" clazz=\"//@clazz.2\"/>\n" + 
				"    <ownedOperation ObjectID=\"f20eccc\" name=\"start\" clazz=\"//@clazz.2\">\n" + 
				"      <stateMachine ObjectID=\"f26c0a0\" name=\"YStateMachinef26c0a0\" initialActive=\"true\">\n" + 
				"        <transition ObjectID=\"fe7fca\" name=\"YTransitionf18a2fe\" source=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.2\" attachment=\"//@clazz.2/@ownedOperation.0/@stateMachine/@trAttach.0\"/>\n" + 
				"        <transition ObjectID=\"fbca38\" name=\"YTransitionf7adcf3\" source=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.2\" target=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.3\" attachment=\"//@clazz.2/@ownedOperation.0/@stateMachine/@trAttach.1\"/>\n" + 
				"        <transition ObjectID=\"f4d81e0\" name=\"YTransitionf626838\" source=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.3\" target=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.4\" attachment=\"//@clazz.2/@ownedOperation.0/@stateMachine/@trAttach.2\"/>\n" + 
				"        <transition ObjectID=\"f6e61ba\" name=\"YTransitionf5e9478\" source=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.4\" target=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.5\" attachment=\"//@clazz.2/@ownedOperation.0/@stateMachine/@trAttach.3\"/>\n" + 
				"        <transition ObjectID=\"f1ebd81\" name=\"YTransitionf49c810\" source=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.5\" target=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.7\"/>\n" + 
				"        <transition ObjectID=\"f44ec51\" name=\"YTransitionf8edd2\" source=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.4\" target=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.6\" attachment=\"//@clazz.2/@ownedOperation.0/@stateMachine/@trAttach.4\"/>\n" + 
				"        <transition ObjectID=\"f6ae29\" name=\"YTransitionf77f300\" source=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.6\" target=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.7\"/>\n" + 
				"        <transition ObjectID=\"f65ff81\" name=\"YTransitionf149e6f\" source=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.7\" target=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.8\" attachment=\"//@clazz.2/@ownedOperation.0/@stateMachine/@trAttach.5\"/>\n" + 
				"        <transition ObjectID=\"f17beff\" name=\"YTransitionf134780\" source=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.8\" target=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.4\" attachment=\"//@clazz.2/@ownedOperation.0/@stateMachine/@trAttach.9\"/>\n" + 
				"        <transition ObjectID=\"f31fb07\" name=\"YTransitionf39c903\" source=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.8\" target=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.9\" attachment=\"//@clazz.2/@ownedOperation.0/@stateMachine/@trAttach.6\"/>\n" + 
				"        <transition ObjectID=\"f46ef7b\" name=\"YTransitionf5b17d3\" source=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.9\" target=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@clazz.2/@ownedOperation.0/@stateMachine/@trAttach.7\"/>\n" + 
				"        <transition ObjectID=\"f5f81ed\" name=\"YTransitionf465048\" source=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.9\" target=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.3\" attachment=\"//@clazz.2/@ownedOperation.0/@stateMachine/@trAttach.8\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f3fa212\" name=\"YPseudostatef45d6a8\" outgoing=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.0\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f5609b0\" name=\"YFinalStatef71f8de\" incoming=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.10\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f6b0287\" name=\"YStatef2aa7a9\" outgoing=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.1\" incoming=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.0\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f3b3fb2\" name=\"YStatef684f3d\" outgoing=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.2\" incoming=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.1 //@clazz.2/@ownedOperation.0/@stateMachine/@transition.11\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f14a15e\" name=\"YStatef1051a4\" outgoing=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.3 //@clazz.2/@ownedOperation.0/@stateMachine/@transition.5\" incoming=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.8 //@clazz.2/@ownedOperation.0/@stateMachine/@transition.2\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"ffb5d3\" name=\"YStatef1ecb03\" outgoing=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.4\" incoming=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.3\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f70717e\" name=\"YStatef596424\" outgoing=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.6\" incoming=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.5\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f36186d\" name=\"YStatef136a75\" outgoing=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.7\" incoming=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.4 //@clazz.2/@ownedOperation.0/@stateMachine/@transition.6\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f28d152\" name=\"YStatef30789c\" outgoing=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.8 //@clazz.2/@ownedOperation.0/@stateMachine/@transition.9\" incoming=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.7\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f9590d\" name=\"YStatef7994d2\" outgoing=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.10 //@clazz.2/@ownedOperation.0/@stateMachine/@transition.11\" incoming=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.9\"/>\n" + 
				"        <trAttach ObjectID=\"f72a55d\" name=\"YTrAttachmentf7fbf22\" transition=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.0\" guardStringRep=\"true;\">\n" + 
				"          <effects ObjectID=\"f72395\" effectStringRep=\"zahlen.add(4);&#xA;\"/>\n" + 
				"          <effects ObjectID=\"f254016\" effectStringRep=\"zahlen.add(3);&#xA;\"/>\n" + 
				"          <effects ObjectID=\"f64b7c1\" effectStringRep=\"zahlen.add(-4);\"/>\n" + 
				"          <effects ObjectID=\"f3ca463\" effectStringRep=\"zahlen.add(10);\"/>\n" + 
				"          <effects ObjectID=\"f27b610\" effectStringRep=\"zahlen.add(4);\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f2e0b9\" name=\"YTrAttachmentf6b2581\" transition=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.1\" guardStringRep=\"true;\">\n" + 
				"          <effects ObjectID=\"f588389\" effectStringRep=\"Print(zahlen);\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f472326\" name=\"YTrAttachmentf3f20df\" transition=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.2\" guardStringRep=\"true;\">\n" + 
				"          <effects ObjectID=\"f500052\" effectStringRep=\"index = 0;\"/>\n" + 
				"          <effects ObjectID=\"f572b0d\" effectStringRep=\"einPaarNichtRichtigSortier = false;\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f132061\" name=\"YTrAttachmentffdad9\" transition=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.3\" guardStringRep=\"zahlen.get(index) > zahlen.get(index + 1);\">\n" + 
				"          <effects ObjectID=\"f4dead1\" effectStringRep=\"einPaarNichtRichtigSortier = true;\"/>\n" + 
				"          <effects ObjectID=\"f1fa822\" effectStringRep=\"helper = zahlen.get(index + 1);\"/>\n" + 
				"          <effects ObjectID=\"f1063d8\" effectStringRep=\"zahlen.set(index + 1, zahlen.get(index));\"/>\n" + 
				"          <effects ObjectID=\"f5ae2\" effectStringRep=\"zahlen.set(index, helper);\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f1ba3b1\" name=\"YTrAttachmentf1926ab\" transition=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.5\" guardStringRep=\"zahlen.get(index) &lt;= zahlen.get(index + 1);\"/>\n" + 
				"        <trAttach ObjectID=\"f4543ce\" name=\"YTrAttachmentf6e5796\" transition=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.7\" guardStringRep=\"true;\">\n" + 
				"          <effects ObjectID=\"f4b6dae\" effectStringRep=\"index++;\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f1c7205\" name=\"YTrAttachmentf3aeaa5\" transition=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.9\" guardStringRep=\"index == zahlen.size() - 1;\"/>\n" + 
				"        <trAttach ObjectID=\"f1a5c37\" name=\"YTrAttachmentf650ba5\" transition=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.10\" guardStringRep=\"einPaarNichtRichtigSortier == false;\">\n" + 
				"          <effects ObjectID=\"f413431\" effectStringRep=\"Print(zahlen);\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f678f62\" name=\"TrAttachmentf4b7bd4\" transition=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.11\" guardStringRep=\"einPaarNichtRichtigSortier == true;\">\n" + 
				"          <effects ObjectID=\"f6bdf6f\" effectStringRep=\"index = 0;\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f104168\" name=\"TrAttachmentf73518b\" transition=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.8\" guardStringRep=\"index &lt; zahlen.size() - 1;\"/>\n" + 
				"      </stateMachine>\n" + 
				"    </ownedOperation>\n" + 
				"  </clazz>\n" + 
				"  <packages ObjectID=\"f186d36\" name=\"Types\">\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f21f575\" name=\"Integer\" package=\"//@packages.0\"/>\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f6ff69c\" name=\"Double\" package=\"//@packages.0\"/>\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f143957\" name=\"Boolean\" package=\"//@packages.0\"/>\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f4f4a1\" name=\"String\" package=\"//@packages.0\"/>\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"fea65c\" name=\"Object\" package=\"//@packages.0\"/>\n" + 
				"  </packages>\n" + 
				"  <packages ObjectID=\"f2bcfa4\" name=\"DES\">\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f6f1844\" name=\"EventQueue\" package=\"//@packages.1\" superClass=\"//@clazz.0\">\n" + 
				"      <ownedOperation ObjectID=\"f78653a\" name=\"consume\" clazz=\"//@packages.1/@ownedMemberPackage.0\" returnType=\"//@packages.1/@ownedMemberPackage.3\">\n" + 
				"        <ownedParameter ObjectID=\"f741ee8\" name=\"timeStep\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\n" + 
				"        <ownedParameter ObjectID=\"f325830\" name=\"past\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.2\"/>\n" + 
				"        <ownedParameter ObjectID=\"f1385ca\" name=\"eventType\" isUnique=\"true\" type=\"//@clazz.1\"/>\n" + 
				"        <ownedParameter ObjectID=\"f334831\" name=\"receiver\" isUnique=\"true\" type=\"//@clazz.0\"/>\n" + 
				"        <ownedParameter ObjectID=\"f4cda47\" name=\"receiverType\" isUnique=\"true\" type=\"//@clazz.1\"/>\n" + 
				"        <stateMachine ObjectID=\"f2a9bdf\" name=\"YStateMachinef2a9bdf\"/>\n" + 
				"      </ownedOperation>\n" + 
				"      <ownedOperation ObjectID=\"f60b252\" name=\"peek\" clazz=\"//@packages.1/@ownedMemberPackage.0\" returnType=\"//@packages.1/@ownedMemberPackage.3\">\n" + 
				"        <ownedParameter ObjectID=\"f465861\" name=\"timeStep\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\n" + 
				"        <ownedParameter ObjectID=\"f4b5255\" name=\"past\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.2\"/>\n" + 
				"        <ownedParameter ObjectID=\"f7afd77\" name=\"eventType\" isUnique=\"true\" type=\"//@clazz.1\"/>\n" + 
				"        <ownedParameter ObjectID=\"f82b36\" name=\"receiver\" isUnique=\"true\" type=\"//@clazz.0\"/>\n" + 
				"        <ownedParameter ObjectID=\"fd7951\" name=\"receiverType\" isUnique=\"true\" type=\"//@clazz.1\"/>\n" + 
				"        <stateMachine ObjectID=\"f545e73\" name=\"YStateMachinef545e73\"/>\n" + 
				"      </ownedOperation>\n" + 
				"    </ownedMemberPackage>\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f7b30f\" name=\"Queue\" package=\"//@packages.1\" superClass=\"//@clazz.0 //@packages.1/@ownedMemberPackage.2\">\n" + 
				"      <ownedAttribute ObjectID=\"f9f8bb\" name=\"queue\" association=\"true\" upper=\"-1\" aggregation=\"composite\" type=\"//@packages.1/@ownedMemberPackage.2\" clazz=\"//@packages.1/@ownedMemberPackage.1\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f386ee1\" name=\"delayed\" association=\"true\" upper=\"-1\" aggregation=\"composite\" type=\"//@packages.1/@ownedMemberPackage.2\" clazz=\"//@packages.1/@ownedMemberPackage.1\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f2f987a\" name=\"event\" isUnique=\"true\" type=\"//@packages.1/@ownedMemberPackage.3\" clazz=\"//@packages.1/@ownedMemberPackage.1\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f660fa1\" name=\"var_objectManagment\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.4\" clazz=\"//@packages.1/@ownedMemberPackage.1\"/>\n" + 
				"      <ownedOperation ObjectID=\"f20be76\" name=\"add\" clazz=\"//@packages.1/@ownedMemberPackage.1\">\n" + 
				"        <ownedParameter ObjectID=\"f4f4254\" name=\"object\" isUnique=\"true\" type=\"//@packages.1/@ownedMemberPackage.2\"/>\n" + 
				"        <stateMachine ObjectID=\"f4abe3c\" name=\"YStateMachinef4abe3c\">\n" + 
				"          <transition ObjectID=\"f5e9a9b\" name=\"YTransitionf5e9a9b\" source=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.0/@stateMachine/@trAttach.0\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f38ff8d\" name=\"YPseudostatef38ff8d\" outgoing=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.0/@stateMachine/@transition.0\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f22957b\" name=\"YFinalStatef22957b\" incoming=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.0/@stateMachine/@transition.0\"/>\n" + 
				"          <trAttach ObjectID=\"f529472\" name=\"YTrAttachmentf529472\" transition=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.0/@stateMachine/@transition.0\" guardStringRep=\"true;\">\n" + 
				"            <effects ObjectID=\"f3d0304\" effectStringRep=\"queue.add(object);\"/>\n" + 
				"            <effects ObjectID=\"f160b70\" effectStringRep=\"var_objectManagment = getObjectManagement();\"/>\n" + 
				"            <effects ObjectID=\"f6420ae\" effectStringRep=\"(var_objectManagment as online.yamm.ObjectManagement).addQueueElement(this, object, 1);\"/>\n" + 
				"          </trAttach>\n" + 
				"        </stateMachine>\n" + 
				"      </ownedOperation>\n" + 
				"      <ownedOperation ObjectID=\"f68084f\" name=\"consume\" clazz=\"//@packages.1/@ownedMemberPackage.1\" returnType=\"//@packages.1/@ownedMemberPackage.2\">\n" + 
				"        <ownedParameter ObjectID=\"f34e890\" name=\"filterMap\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.4\"/>\n" + 
				"        <stateMachine ObjectID=\"f467557\" name=\"YStateMachinef467557\"/>\n" + 
				"      </ownedOperation>\n" + 
				"      <ownedOperation ObjectID=\"f7b77c9\" name=\"peek\" clazz=\"//@packages.1/@ownedMemberPackage.1\" returnType=\"//@packages.1/@ownedMemberPackage.2\">\n" + 
				"        <ownedParameter ObjectID=\"f310db4\" name=\"filterMap\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.4\"/>\n" + 
				"        <stateMachine ObjectID=\"f549a88\" name=\"YStateMachinef549a88\"/>\n" + 
				"      </ownedOperation>\n" + 
				"      <ownedOperation ObjectID=\"f275fe\" name=\"addWithDelay\" clazz=\"//@packages.1/@ownedMemberPackage.1\">\n" + 
				"        <ownedParameter ObjectID=\"f2f3872\" name=\"object\" isUnique=\"true\" type=\"//@packages.1/@ownedMemberPackage.2\"/>\n" + 
				"        <ownedParameter ObjectID=\"f8dd49\" name=\"delay\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\n" + 
				"        <ownedParameter ObjectID=\"f468ab9\" name=\"timeStep\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\n" + 
				"        <stateMachine ObjectID=\"f48a287\" name=\"YStateMachinef48a287\">\n" + 
				"          <transition ObjectID=\"f58fd62\" name=\"YTransitionf58fd62\" source=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.3/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.3/@stateMachine/@subvertex.1\" attachment=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.3/@stateMachine/@trAttach.0\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f4b5238\" name=\"YPseudostatef4b5238\" outgoing=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.3/@stateMachine/@transition.0\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f5e46aa\" name=\"YFinalStatef5e46aa\" incoming=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.3/@stateMachine/@transition.0\"/>\n" + 
				"          <trAttach ObjectID=\"f459b0\" name=\"YTrAttachmentf459b0\" transition=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.3/@stateMachine/@transition.0\" guardStringRep=\"true;\">\n" + 
				"            <effects ObjectID=\"f3af920\" effectStringRep=\"var_objectManagment = getObjectManagement();\"/>\n" + 
				"            <effects ObjectID=\"f3726ea\" effectStringRep=\"(var_objectManagment as online.yamm.ObjectManagement).addDelayedQueueElement(this, object, 1);\"/>\n" + 
				"            <effects ObjectID=\"f59be5a\" effectStringRep=\"delayed.add(object);\"/>\n" + 
				"            <effects ObjectID=\"f6f18ad\" effectStringRep=\"event = new Delay;\"/>\n" + 
				"            <effects ObjectID=\"f28d54b\" effectStringRep=\"event.timeStep = timeStep + delay;\"/>\n" + 
				"            <effects ObjectID=\"f3ae638\" effectStringRep=\"event.objectAttached = object;\"/>\n" + 
				"            <effects ObjectID=\"f5109cb\" effectStringRep=\"event.receivingObject = this;\"/>\n" + 
				"          </trAttach>\n" + 
				"        </stateMachine>\n" + 
				"      </ownedOperation>\n" + 
				"      <ownedOperation ObjectID=\"f764840\" name=\"simulate\" clazz=\"//@packages.1/@ownedMemberPackage.1\" returnType=\"//@packages.0/@ownedMemberPackage.2\">\n" + 
				"        <ownedParameter ObjectID=\"f68416a\" name=\"timeStep\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\n" + 
				"        <stateMachine ObjectID=\"f7e7e66\" name=\"YStateMachinef7e7e66\">\n" + 
				"          <transition ObjectID=\"f2b7fa1\" name=\"YTransitionf2b7fa1\" source=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.2\" target=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.0\" attachment=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@trAttach.0\"/>\n" + 
				"          <transition ObjectID=\"f4bfb83\" name=\"YTransitionf4bfb83\" source=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.1\" attachment=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@trAttach.1\"/>\n" + 
				"          <transition ObjectID=\"f78cae7\" name=\"YTransitionf78cae7\" source=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.1\" target=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.3\" attachment=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@trAttach.2\"/>\n" + 
				"          <transition ObjectID=\"f3b1426\" name=\"YTransitionf3b1426\" source=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.1\" target=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.3\" attachment=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@trAttach.3\"/>\n" + 
				"          <transition ObjectID=\"f411019\" name=\"YTransitionf411019\" source=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.3\" attachment=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@trAttach.4\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"fe5506\" name=\"YStatefe5506\" outgoing=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.1 //@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.4\" incoming=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.0\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f4cf3d0\" name=\"YStatef4cf3d0\" outgoing=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.2 //@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.3\" incoming=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.1\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f384d51\" name=\"YPseudostatef384d51\" outgoing=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.0\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f2e7b01\" name=\"YFinalStatef2e7b01\" incoming=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.2 //@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.3 //@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.4\"/>\n" + 
				"          <trAttach ObjectID=\"f14e78f\" name=\"YTrAttachmentf14e78f\" transition=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.0\" guardStringRep=\"true;\">\n" + 
				"            <effects ObjectID=\"f48c6c2\" effectStringRep=\"event = DES.EventQueue.peek(timeStep, true, null, this, null);\"/>\n" + 
				"          </trAttach>\n" + 
				"          <trAttach ObjectID=\"f1e9b4e\" name=\"YTrAttachmentf1e9b4e\" transition=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.1\" guardStringRep=\"event != null;\"/>\n" + 
				"          <trAttach ObjectID=\"f5eb936\" name=\"YTrAttachmentf5eb936\" transition=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.2\" guardStringRep=\"event instanceof Delay;\">\n" + 
				"            <effects ObjectID=\"f2c724a\" effectStringRep=\"DES.EventQueue.consume(timeStep, true, null, this, null);\"/>\n" + 
				"            <effects ObjectID=\"fe6655\" effectStringRep=\"(var_objectManagment as online.yamm.ObjectManagement).removeDelayedQueueElement(this, event.objectAttached, 1);\"/>\n" + 
				"            <effects ObjectID=\"fb8378\" effectStringRep=\"add(event.objectAttached);\"/>\n" + 
				"            <effects ObjectID=\"f271ec5\" effectStringRep=\"setReturnValue(true);\"/>\n" + 
				"          </trAttach>\n" + 
				"          <trAttach ObjectID=\"f3696b8\" name=\"YTrAttachmentf3696b8\" transition=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.3\" guardStringRep=\"!(event instanceof Delay);\">\n" + 
				"            <effects ObjectID=\"f430192\" effectStringRep=\"setReturnValue(false);\"/>\n" + 
				"          </trAttach>\n" + 
				"          <trAttach ObjectID=\"f11f883\" name=\"YTrAttachmentf11f883\" transition=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.4\" guardStringRep=\"event == null;\">\n" + 
				"            <effects ObjectID=\"f41db92\" effectStringRep=\"setReturnValue(false);\"/>\n" + 
				"          </trAttach>\n" + 
				"        </stateMachine>\n" + 
				"      </ownedOperation>\n" + 
				"    </ownedMemberPackage>\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f40b04f\" name=\"SimulationObject\" package=\"//@packages.1\" superClass=\"//@clazz.0\">\n" + 
				"      <ownedAttribute ObjectID=\"f555e10\" name=\"name\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.3\" clazz=\"//@packages.1/@ownedMemberPackage.2\"/>\n" + 
				"      <ownedOperation ObjectID=\"f10ddfa\" name=\"simulate\" clazz=\"//@packages.1/@ownedMemberPackage.2\" returnType=\"//@packages.0/@ownedMemberPackage.2\">\n" + 
				"        <ownedParameter ObjectID=\"f7873fc\" name=\"timeStep\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\n" + 
				"        <stateMachine ObjectID=\"f2ac9f0\" name=\"YStateMachinef2ac9f0\">\n" + 
				"          <transition ObjectID=\"f79f4b8\" name=\"YTransitionf79f4b8\" source=\"//@packages.1/@ownedMemberPackage.2/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.2/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@packages.1/@ownedMemberPackage.2/@ownedOperation.0/@stateMachine/@trAttach.0\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f68bf82\" name=\"YPseudostatef68bf82\" outgoing=\"//@packages.1/@ownedMemberPackage.2/@ownedOperation.0/@stateMachine/@transition.0\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f68c2fb\" name=\"YFinalStatef68c2fb\" incoming=\"//@packages.1/@ownedMemberPackage.2/@ownedOperation.0/@stateMachine/@transition.0\"/>\n" + 
				"          <trAttach ObjectID=\"f352f8d\" name=\"YTrAttachmentf352f8d\" transition=\"//@packages.1/@ownedMemberPackage.2/@ownedOperation.0/@stateMachine/@transition.0\" guardStringRep=\"true;\">\n" + 
				"            <effects ObjectID=\"f284471\" effectStringRep=\"setReturnValue(false);\"/>\n" + 
				"          </trAttach>\n" + 
				"        </stateMachine>\n" + 
				"      </ownedOperation>\n" + 
				"    </ownedMemberPackage>\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f2a26c9\" name=\"Event\" package=\"//@packages.1\" superClass=\"//@clazz.0\">\n" + 
				"      <ownedAttribute ObjectID=\"f3128f5\" name=\"timeStep\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@packages.1/@ownedMemberPackage.3\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f4063c7\" name=\"receivingType\" isUnique=\"true\" type=\"//@clazz.1\" clazz=\"//@packages.1/@ownedMemberPackage.3\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f197074\" name=\"description\" type=\"//@packages.0/@ownedMemberPackage.3\" clazz=\"//@packages.1/@ownedMemberPackage.3\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f94f5c\" name=\"receivingObject\" association=\"true\" isUnique=\"true\" type=\"//@packages.1/@ownedMemberPackage.2\" clazz=\"//@packages.1/@ownedMemberPackage.3\">\n" + 
				"        <ownedElement xsi:type=\"yammDiagram:YParameter\" ObjectID=\"f465861\" name=\"timeStep\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\n" + 
				"      </ownedAttribute>\n" + 
				"      <ownedAttribute ObjectID=\"f210054\" name=\"objectAttached\" association=\"true\" isUnique=\"true\" type=\"//@packages.1/@ownedMemberPackage.2\" clazz=\"//@packages.1/@ownedMemberPackage.3\"/>\n" + 
				"      <ownedOperation ObjectID=\"f6b9c0b\" name=\"toString\" clazz=\"//@packages.1/@ownedMemberPackage.3\" returnType=\"//@packages.0/@ownedMemberPackage.3\">\n" + 
				"        <stateMachine ObjectID=\"f694554\" name=\"YStateMachinef694554\">\n" + 
				"          <transition ObjectID=\"f76f663\" name=\"YTransitionf76f663\" source=\"//@packages.1/@ownedMemberPackage.3/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.3/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@packages.1/@ownedMemberPackage.3/@ownedOperation.0/@stateMachine/@trAttach.0\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f759d05\" name=\"YPseudostatef759d05\" outgoing=\"//@packages.1/@ownedMemberPackage.3/@ownedOperation.0/@stateMachine/@transition.0\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f190b71\" name=\"YFinalStatef190b71\" incoming=\"//@packages.1/@ownedMemberPackage.3/@ownedOperation.0/@stateMachine/@transition.0\"/>\n" + 
				"          <trAttach ObjectID=\"f776ef5\" name=\"YTrAttachmentf776ef5\" transition=\"//@packages.1/@ownedMemberPackage.3/@ownedOperation.0/@stateMachine/@transition.0\" guardStringRep=\"true;\">\n" + 
				"            <effects ObjectID=\"f1ac343\" effectStringRep=\"setReturnValue(&quot;TODO: Event.toString()&quot;);\"/>\n" + 
				"          </trAttach>\n" + 
				"        </stateMachine>\n" + 
				"      </ownedOperation>\n" + 
				"    </ownedMemberPackage>\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f5961ed\" name=\"Randomizer\" package=\"//@packages.1\" superClass=\"//@clazz.0\">\n" + 
				"      <ownedAttribute ObjectID=\"f49b547\" name=\"random\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.4\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f13e889\" name=\"USE_GAUSSIAN\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.2\" clazz=\"//@packages.1/@ownedMemberPackage.4\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f66b9ac\" name=\"i\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@packages.1/@ownedMemberPackage.4\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f19d97b\" name=\"prob2Int\" association=\"true\" upper=\"-1\" aggregation=\"composite\" type=\"//@packages.1/@ownedMemberPackage.5\" clazz=\"//@packages.1/@ownedMemberPackage.4\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f41fa4e\" name=\"entry\" association=\"true\" isUnique=\"true\" type=\"//@packages.1/@ownedMemberPackage.5\" clazz=\"//@packages.1/@ownedMemberPackage.4\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f7d11a1\" name=\"r\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.1\" clazz=\"//@packages.1/@ownedMemberPackage.4\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f672a3d\" name=\"x\" isUnique=\"true\" defaultValue=\"&quot;0&quot;\" type=\"//@packages.0/@ownedMemberPackage.1\" clazz=\"//@packages.1/@ownedMemberPackage.4\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f64dcec\" name=\"sumAllProp\" isUnique=\"true\" defaultValue=\"&quot;0&quot;\" type=\"//@packages.0/@ownedMemberPackage.1\" clazz=\"//@packages.1/@ownedMemberPackage.4\"/>\n" + 
				"      <ownedOperation ObjectID=\"f27d00b\" name=\"addProbInt\" clazz=\"//@packages.1/@ownedMemberPackage.4\">\n" + 
				"        <ownedParameter ObjectID=\"f46955f\" name=\"to\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.1\"/>\n" + 
				"        <ownedParameter ObjectID=\"f547076\" name=\"value\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\n" + 
				"        <stateMachine ObjectID=\"f7f9230\" name=\"YStateMachinef7f9230\">\n" + 
				"          <transition ObjectID=\"f16bfc2\" name=\"YTransitionf16bfc2\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.0/@stateMachine/@trAttach.0\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f5ef90\" name=\"YPseudostatef5ef90\" outgoing=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.0/@stateMachine/@transition.0\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f3b08da\" name=\"YFinalStatef3b08da\" incoming=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.0/@stateMachine/@transition.0\"/>\n" + 
				"          <trAttach ObjectID=\"f4c947d\" name=\"YTrAttachmentf4c947d\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.0/@stateMachine/@transition.0\" guardStringRep=\"true;\">\n" + 
				"            <effects ObjectID=\"f46566a\" effectStringRep=\"sumAllProp = sumAllProp + to;\"/>\n" + 
				"            <effects ObjectID=\"f4dc7ba\" effectStringRep=\"prob2Int.add(new Probability2Value);\"/>\n" + 
				"            <effects ObjectID=\"f20b257\" effectStringRep=\"prob2Int.get(prob2Int.size - 1).probabilityUpperLimit = to;\"/>\n" + 
				"            <effects ObjectID=\"f5793d3\" effectStringRep=\"prob2Int.get(prob2Int.size - 1).value = value;\"/>\n" + 
				"          </trAttach>\n" + 
				"        </stateMachine>\n" + 
				"      </ownedOperation>\n" + 
				"      <ownedOperation ObjectID=\"f66c63\" name=\"nextInt\" clazz=\"//@packages.1/@ownedMemberPackage.4\" returnType=\"//@packages.0/@ownedMemberPackage.0\">\n" + 
				"        <stateMachine ObjectID=\"f30aac5\" name=\"YStateMachinef30aac5\">\n" + 
				"          <transition ObjectID=\"f5626fe\" name=\"YTransitionf5626fe\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.2\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@trAttach.0\"/>\n" + 
				"          <transition ObjectID=\"f43cf6d\" name=\"YTransitionf43cf6d\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.2\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@trAttach.1\"/>\n" + 
				"          <transition ObjectID=\"f532d9a\" name=\"YTransitionf532d9a\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.5\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.3\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@trAttach.2\"/>\n" + 
				"          <transition ObjectID=\"f1d935c\" name=\"YTransitionf1d935c\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.4\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.3\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@trAttach.3\"/>\n" + 
				"          <transition ObjectID=\"f7c9630\" name=\"YTransitionf7c9630\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.3\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.4\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@trAttach.4\"/>\n" + 
				"          <transition ObjectID=\"f146bd8\" name=\"YTransitionf146bd8\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.3\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.1\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@trAttach.5\"/>\n" + 
				"          <transition ObjectID=\"f19a4e3\" name=\"YTransitionf19a4e3\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.4\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.1\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@trAttach.6\"/>\n" + 
				"          <transition ObjectID=\"f1440f2\" name=\"YTransitionf1440f2\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.2\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.5\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@trAttach.7\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f311e7\" name=\"YPseudostatef311e7\" outgoing=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.0 //@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.1\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f4ede39\" name=\"YFinalStatef4ede39\" incoming=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.5 //@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.6\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f1c1425\" name=\"YStatef1c1425\" outgoing=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.7\" incoming=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.0 //@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.1\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f6c9142\" name=\"YStatef6c9142\" outgoing=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.4 //@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.5\" incoming=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.2 //@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.3\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f6995d3\" name=\"YStatef6995d3\" outgoing=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.3 //@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.6\" incoming=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.4\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f577f47\" name=\"YStatef577f47\" outgoing=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.2\" incoming=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.7\"/>\n" + 
				"          <trAttach ObjectID=\"f59536\" name=\"YTrAttachmentf59536\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.0\" guardStringRep=\"USE_GAUSSIAN;\">\n" + 
				"            <effects ObjectID=\"f6de5ab\" effectStringRep=\"r = (random as java.util.Random).nextGaussian;\"/>\n" + 
				"          </trAttach>\n" + 
				"          <trAttach ObjectID=\"f70685\" name=\"YTrAttachmentf70685\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.1\" guardStringRep=\"!USE_GAUSSIAN;\">\n" + 
				"            <effects ObjectID=\"f325de1\" effectStringRep=\"r = (random as java.util.Random).nextDouble;\"/>\n" + 
				"          </trAttach>\n" + 
				"          <trAttach ObjectID=\"f2dd09a\" name=\"YTrAttachmentf2dd09a\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.2\" guardStringRep=\"true;\">\n" + 
				"            <effects ObjectID=\"f2050fd\" effectStringRep=\"x = 0;\"/>\n" + 
				"            <effects ObjectID=\"f728e4a\" effectStringRep=\"i = 0;\"/>\n" + 
				"          </trAttach>\n" + 
				"          <trAttach ObjectID=\"f654c2c\" name=\"YTrAttachmentf654c2c\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.3\" guardStringRep=\"r > entry.probabilityUpperLimit + x;\"/>\n" + 
				"          <trAttach ObjectID=\"f177a55\" name=\"YTrAttachmentf177a55\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.4\" guardStringRep=\"i &lt; prob2Int.size;\">\n" + 
				"            <effects ObjectID=\"f2bde0d\" effectStringRep=\"entry = prob2Int.get(i++);\"/>\n" + 
				"            <effects ObjectID=\"f4be425\" effectStringRep=\"x = x + entry.probabilityUpperLimit;\"/>\n" + 
				"          </trAttach>\n" + 
				"          <trAttach ObjectID=\"f34e904\" name=\"YTrAttachmentf34e904\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.5\" guardStringRep=\"i >= prob2Int.size;\">\n" + 
				"            <effects ObjectID=\"f1b61b9\" effectStringRep=\"setReturnValue(0);\"/>\n" + 
				"          </trAttach>\n" + 
				"          <trAttach ObjectID=\"f6e4855\" name=\"YTrAttachmentf6e4855\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.6\" guardStringRep=\"r &lt;= entry.probabilityUpperLimit + x;\">\n" + 
				"            <effects ObjectID=\"f7a9b6f\" effectStringRep=\"setReturnValue(entry.value);\"/>\n" + 
				"          </trAttach>\n" + 
				"          <trAttach ObjectID=\"f7758dd\" name=\"YTrAttachmentf7758dd\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.7\" guardStringRep=\"true;\">\n" + 
				"            <effects ObjectID=\"f5dc2c3\" effectStringRep=\"r = r * sumAllProp;\"/>\n" + 
				"          </trAttach>\n" + 
				"        </stateMachine>\n" + 
				"      </ownedOperation>\n" + 
				"    </ownedMemberPackage>\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f6019cc\" name=\"Probability2Value\" package=\"//@packages.1\" superClass=\"//@clazz.0\">\n" + 
				"      <ownedAttribute ObjectID=\"f5512dc\" name=\"probabilityUpperLimit\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.1\" clazz=\"//@packages.1/@ownedMemberPackage.5\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f6e635c\" name=\"value\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@packages.1/@ownedMemberPackage.5\"/>\n" + 
				"    </ownedMemberPackage>\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f67d23f\" name=\"Delay\" package=\"//@packages.1\" superClass=\"//@clazz.0 //@packages.1/@ownedMemberPackage.3\"/>\n" + 
				"  </packages>\n" + 
				"</yammDiagram:YModel>\n" + 
				"";
	}
	
	
	public static String desSortierenExample() {
		return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" + 
				"<yammDiagram:YModel xmi:version=\"2.0\" xmlns:xmi=\"http://www.omg.org/XMI\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:yammDiagram=\"http://www.yamm.online/coreModelDiagram/YammDiagram\">\n" + 
				"  <clazz ObjectID=\"f5e24a2\" name=\"RObject\">\n" + 
				"    <ownedAttribute ObjectID=\"f2bd771\" name=\"rContainer\" type=\"//@clazz.0\" clazz=\"//@clazz.0\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f55ebef\" name=\"yClass\" type=\"//@packages.0/@ownedMemberPackage.4\" clazz=\"//@clazz.0\"/>\n" + 
				"    <ownedAttribute ObjectID=\"fbb4ab\" name=\"ObjectID\" type=\"//@packages.0/@ownedMemberPackage.3\" clazz=\"//@clazz.0\"/>\n" + 
				"  </clazz>\n" + 
				"  <clazz ObjectID=\"f4cc70d\" name=\"YClass\" superClass=\"//@clazz.0\"/>\n" + 
				"  <clazz ObjectID=\"f24eb2c\" name=\"Sort\" superClass=\"//@clazz.0\">\n" + 
				"    <ownedAttribute ObjectID=\"f4f307f\" name=\"stationA\" association=\"true\" type=\"//@clazz.3\" clazz=\"//@clazz.2\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f6a0603\" name=\"stationB\" association=\"true\" type=\"//@clazz.4\" clazz=\"//@clazz.2\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f1dd6cd\" name=\"queue\" association=\"true\" type=\"//@clazz.5\" clazz=\"//@clazz.2\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f562598\" name=\"part\" association=\"true\" type=\"//@clazz.6\" clazz=\"//@clazz.2\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f12f619\" name=\"partGenerator\" association=\"true\" type=\"//@clazz.7\" clazz=\"//@clazz.2\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f6f0ee1\" name=\"random\" type=\"//@packages.0/@ownedMemberPackage.4\" clazz=\"//@clazz.7\"/>\n" + 
				"    <ownedOperation ObjectID=\"f606af4\" name=\"start\" clazz=\"//@clazz.2\">\n" + 
				"      <stateMachine ObjectID=\"f712206\" name=\"YStateMachinef712206\" desInitializer=\"true\">\n" + 
				"        <transition ObjectID=\"f2422c4\" name=\"YTransitionf2422c4\" source=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.2\" attachment=\"//@clazz.2/@ownedOperation.0/@stateMachine/@trAttach.0\"/>\n" + 
				"        <transition ObjectID=\"f3f092a\" name=\"YTransitionf3f092a\" source=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.2\" target=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@clazz.2/@ownedOperation.0/@stateMachine/@trAttach.1\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f221b10\" name=\"YPseudostatef221b10\" outgoing=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.0\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f1773ab\" name=\"YFinalStatef1773ab\" incoming=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.1\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f59420f\" name=\"YStatef59420f\" outgoing=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.1\" incoming=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.0\"/>\n" + 
				"        <trAttach ObjectID=\"f61701b\" name=\"YTrAttachmentf61701b\" transition=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.0\" guardStringRep=\"true;\">\n" + 
				"          <effects ObjectID=\"f65d348\" effectStringRep=\"random = new java.util.Random(1);\"/>\n" + 
				"          <effects ObjectID=\"ffec6c\" effectStringRep=\"queue = new Queue;&#xA;\"/>\n" + 
				"          <effects ObjectID=\"fe1521\" effectStringRep=\"partGenerator = new PartGenerator(10, random);&#xA;\"/>\n" + 
				"          <effects ObjectID=\"f12b81e\" effectStringRep=\"partGenerator.queue = queue;&#xA;\"/>\n" + 
				"          <effects ObjectID=\"f76e107\" effectStringRep=\"stationA = new StationA;&#xA;\"/>\n" + 
				"          <effects ObjectID=\"f64ff76\" effectStringRep=\"stationA.queue = queue;&#xA;\"/>\n" + 
				"          <effects ObjectID=\"f65289a\" effectStringRep=\"stationB = new StationB;&#xA;\"/>\n" + 
				"          <effects ObjectID=\"f32ab64\" effectStringRep=\"stationB.queue = queue;&#xA;\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f87967\" name=\"YTrAttachmentf87967\" transition=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.1\" guardStringRep=\"true;\"/>\n" + 
				"      </stateMachine>\n" + 
				"    </ownedOperation>\n" + 
				"  </clazz>\n" + 
				"  <clazz ObjectID=\"f73345\" name=\"StationA\" superClass=\"//@clazz.0 //@packages.1/@ownedMemberPackage.2\">\n" + 
				"    <ownedAttribute ObjectID=\"f1145f5\" name=\"queue\" association=\"true\" type=\"//@clazz.5\" clazz=\"//@clazz.3\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f75e305\" name=\"filter\" type=\"//@packages.0/@ownedMemberPackage.4\" clazz=\"//@clazz.6\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f355a78\" name=\"part\" type=\"//@clazz.6\" clazz=\"//@clazz.3\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f5afb0e\" name=\"parts\" association=\"true\" upper=\"-1\" type=\"//@clazz.6\" clazz=\"//@clazz.3\"/>\n" + 
				"    <ownedOperation ObjectID=\"fd64b\" name=\"simulate\" clazz=\"//@clazz.3\" returnType=\"//@packages.0/@ownedMemberPackage.2\">\n" + 
				"      <ownedParameter ObjectID=\"f3c8deb\" name=\"timeStep\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\n" + 
				"      <stateMachine ObjectID=\"f17937f\" name=\"YStateMachinef17937f\">\n" + 
				"        <transition ObjectID=\"f50a008\" name=\"YTransitionf50a008\" source=\"//@clazz.3/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@clazz.3/@ownedOperation.0/@stateMachine/@subvertex.2\" attachment=\"//@clazz.3/@ownedOperation.0/@stateMachine/@trAttach.0\"/>\n" + 
				"        <transition ObjectID=\"f61a8b0\" name=\"YTransitionf61a8b0\" source=\"//@clazz.3/@ownedOperation.0/@stateMachine/@subvertex.2\" target=\"//@clazz.3/@ownedOperation.0/@stateMachine/@subvertex.3\" attachment=\"//@clazz.3/@ownedOperation.0/@stateMachine/@trAttach.1\"/>\n" + 
				"        <transition ObjectID=\"f168dbf\" name=\"YTransitionf168dbf\" source=\"//@clazz.3/@ownedOperation.0/@stateMachine/@subvertex.2\" target=\"//@clazz.3/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@clazz.3/@ownedOperation.0/@stateMachine/@trAttach.2\"/>\n" + 
				"        <transition ObjectID=\"ffbf86\" name=\"YTransitionffbf86\" source=\"//@clazz.3/@ownedOperation.0/@stateMachine/@subvertex.3\" target=\"//@clazz.3/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@clazz.3/@ownedOperation.0/@stateMachine/@trAttach.3\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f749535\" name=\"Statef749535\" outgoing=\"//@clazz.3/@ownedOperation.0/@stateMachine/@transition.0\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f601821\" name=\"Statef601821\" incoming=\"//@clazz.3/@ownedOperation.0/@stateMachine/@transition.2 //@clazz.3/@ownedOperation.0/@stateMachine/@transition.3\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f6afab4\" name=\"YStatef6afab4\" outgoing=\"//@clazz.3/@ownedOperation.0/@stateMachine/@transition.1 //@clazz.3/@ownedOperation.0/@stateMachine/@transition.2\" incoming=\"//@clazz.3/@ownedOperation.0/@stateMachine/@transition.0\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f7c3b01\" name=\"YStatef7c3b01\" outgoing=\"//@clazz.3/@ownedOperation.0/@stateMachine/@transition.3\" incoming=\"//@clazz.3/@ownedOperation.0/@stateMachine/@transition.1\"/>\n" + 
				"        <trAttach ObjectID=\"f38a45d\" name=\"YTrAttachmentf38a45d\" transition=\"//@clazz.3/@ownedOperation.0/@stateMachine/@transition.0\" guardStringRep=\"true;\">\n" + 
				"          <effects ObjectID=\"f562cf1\" effectStringRep=\"filter = new java.util.HashMap&lt;String, Object>;&#xA;\"/>\n" + 
				"          <effects ObjectID=\"f40f74f\" effectStringRep=\"(filter as java.util.Map).put(&quot;type&quot;, PartType.typeA);&#xA;\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f6bf4ae\" name=\"YTrAttachmentf6bf4ae\" transition=\"//@clazz.3/@ownedOperation.0/@stateMachine/@transition.1\" guardStringRep=\"queue.peek(filter) != null;&#xA;\">\n" + 
				"          <effects ObjectID=\"f186dc\" effectStringRep=\"part = queue.peek(filter) as Part;&#xA;\"/>\n" + 
				"          <effects ObjectID=\"f241ba6\" effectStringRep=\"parts.add(part);&#xA;\"/>\n" + 
				"          <effects ObjectID=\"f5d54\" effectStringRep=\"queue.consume(filter);&#xA;\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f2acec7\" name=\"YTrAttachmentf2acec7\" transition=\"//@clazz.3/@ownedOperation.0/@stateMachine/@transition.2\" guardStringRep=\"queue.peek(filter) == null;&#xA;\">\n" + 
				"          <effects ObjectID=\"f4f605e\" effectStringRep=\"setReturnValue(false);&#xA;\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f31ccf6\" name=\"YTrAttachmentf31ccf6\" transition=\"//@clazz.3/@ownedOperation.0/@stateMachine/@transition.3\" guardStringRep=\"true;\">\n" + 
				"          <effects ObjectID=\"f2591d7\" effectStringRep=\"setReturnValue(true);&#xA;\"/>\n" + 
				"        </trAttach>\n" + 
				"      </stateMachine>\n" + 
				"    </ownedOperation>\n" + 
				"  </clazz>\n" + 
				"  <clazz ObjectID=\"f92fb9\" name=\"StationB\" superClass=\"//@clazz.0 //@packages.1/@ownedMemberPackage.2\">\n" + 
				"    <ownedAttribute ObjectID=\"f3c2cc2\" name=\"queue\" association=\"true\" type=\"//@clazz.5\" clazz=\"//@clazz.4\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f5cbd01\" name=\"filter\" type=\"//@packages.0/@ownedMemberPackage.4\" clazz=\"//@clazz.6\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f25651c\" name=\"part\" type=\"//@clazz.6\" clazz=\"//@clazz.4\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f2dcf4a\" name=\"parts\" association=\"true\" upper=\"-1\" type=\"//@clazz.6\" clazz=\"//@clazz.4\"/>\n" + 
				"    <ownedOperation ObjectID=\"f6740bf\" name=\"simulate\" clazz=\"//@clazz.4\" returnType=\"//@packages.0/@ownedMemberPackage.2\">\n" + 
				"      <ownedParameter ObjectID=\"f22d2e1\" name=\"timeStep\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\n" + 
				"      <stateMachine ObjectID=\"f322f1f\" name=\"YStateMachinef322f1f\">\n" + 
				"        <transition ObjectID=\"f291383\" name=\"f291383\" source=\"//@clazz.4/@ownedOperation.0/@stateMachine/@subvertex.1\" target=\"//@clazz.4/@ownedOperation.0/@stateMachine/@subvertex.0\" attachment=\"//@clazz.4/@ownedOperation.0/@stateMachine/@trAttach.2\"/>\n" + 
				"        <transition ObjectID=\"f799c89\" name=\"f799c89\" source=\"//@clazz.4/@ownedOperation.0/@stateMachine/@subvertex.3\" target=\"//@clazz.4/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@clazz.4/@ownedOperation.0/@stateMachine/@trAttach.1\"/>\n" + 
				"        <transition ObjectID=\"f28c248\" name=\"f28c248\" source=\"//@clazz.4/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@clazz.4/@ownedOperation.0/@stateMachine/@subvertex.2\" attachment=\"//@clazz.4/@ownedOperation.0/@stateMachine/@trAttach.0\"/>\n" + 
				"        <transition ObjectID=\"f338c6a\" name=\"f338c6a\" source=\"//@clazz.4/@ownedOperation.0/@stateMachine/@subvertex.1\" target=\"//@clazz.4/@ownedOperation.0/@stateMachine/@subvertex.2\" attachment=\"//@clazz.4/@ownedOperation.0/@stateMachine/@trAttach.3\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f73e212\" name=\"Statef73e212\" outgoing=\"//@clazz.4/@ownedOperation.0/@stateMachine/@transition.2\" incoming=\"//@clazz.4/@ownedOperation.0/@stateMachine/@transition.0\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f1a09f6\" name=\"Statef1a09f6\" outgoing=\"//@clazz.4/@ownedOperation.0/@stateMachine/@transition.0 //@clazz.4/@ownedOperation.0/@stateMachine/@transition.3\" incoming=\"//@clazz.4/@ownedOperation.0/@stateMachine/@transition.1\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f4b33b2\" name=\"Statef4b33b2\" incoming=\"//@clazz.4/@ownedOperation.0/@stateMachine/@transition.3 //@clazz.4/@ownedOperation.0/@stateMachine/@transition.2\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f5b8b21\" name=\"Statef5b8b21\" outgoing=\"//@clazz.4/@ownedOperation.0/@stateMachine/@transition.1\"/>\n" + 
				"        <trAttach ObjectID=\"f6e3463\" name=\"TrAttachmentf6e3463\" transition=\"//@clazz.4/@ownedOperation.0/@stateMachine/@transition.2\" guardStringRep=\"true;\">\n" + 
				"          <effects ObjectID=\"f46c320\" effectStringRep=\"setReturnValue(true);&#xA;\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f26f3c7\" name=\"TrAttachmentf26f3c7\" transition=\"//@clazz.4/@ownedOperation.0/@stateMachine/@transition.1\" guardStringRep=\"true;\">\n" + 
				"          <effects ObjectID=\"f76c9a7\" effectStringRep=\"filter = new java.util.HashMap&lt;String, Object>;&#xA;\"/>\n" + 
				"          <effects ObjectID=\"f262cd0\" effectStringRep=\"(filter as java.util.Map).put(&quot;type&quot;, PartType.typeB);&#xA;\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f13a8ff\" name=\"TrAttachmentf13a8ff\" transition=\"//@clazz.4/@ownedOperation.0/@stateMachine/@transition.0\" guardStringRep=\"queue.peek(filter) != null;&#xA;\">\n" + 
				"          <effects ObjectID=\"f468b1c\" effectStringRep=\"part = queue.peek(filter) as Part;&#xA;\"/>\n" + 
				"          <effects ObjectID=\"f32e836\" effectStringRep=\"parts.add(part);&#xA;\"/>\n" + 
				"          <effects ObjectID=\"f46c759\" effectStringRep=\"queue.consume(filter);&#xA;\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f70dd71\" name=\"TrAttachmentf70dd71\" transition=\"//@clazz.4/@ownedOperation.0/@stateMachine/@transition.3\" guardStringRep=\"queue.peek(filter) == null;&#xA;\">\n" + 
				"          <effects ObjectID=\"f482f4a\" effectStringRep=\"setReturnValue(false);&#xA;\"/>\n" + 
				"        </trAttach>\n" + 
				"      </stateMachine>\n" + 
				"    </ownedOperation>\n" + 
				"  </clazz>\n" + 
				"  <clazz ObjectID=\"fffc43\" name=\"Queue\" superClass=\"//@clazz.0 //@packages.1/@ownedMemberPackage.1\">\n" + 
				"    <ownedAttribute ObjectID=\"f56353a\" name=\"type\" type=\"//@clazz.6\" clazz=\"//@clazz.5\"/>\n" + 
				"  </clazz>\n" + 
				"  <clazz ObjectID=\"f13e788\" name=\"Part\" superClass=\"//@clazz.0 //@packages.1/@ownedMemberPackage.2\">\n" + 
				"    <ownedAttribute ObjectID=\"f7e65fc\" name=\"type\" association=\"true\" type=\"//@enumerations.0\" clazz=\"//@clazz.6\"/>\n" + 
				"    <ownedOperation ObjectID=\"f610b2e\" name=\"Part\" clazz=\"//@clazz.6\">\n" + 
				"      <ownedParameter ObjectID=\"f550a7f\" name=\"type\" type=\"//@enumerations.0\"/>\n" + 
				"      <stateMachine ObjectID=\"f4d9df3\" name=\"YStateMachinef4d9df3\">\n" + 
				"        <transition ObjectID=\"f3528b7\" name=\"YTransitionf3528b7\" source=\"//@clazz.6/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@clazz.6/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@clazz.6/@ownedOperation.0/@stateMachine/@trAttach.0\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f6d4403\" name=\"YPseudostatef6d4403\" outgoing=\"//@clazz.6/@ownedOperation.0/@stateMachine/@transition.0\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f20aa90\" name=\"YFinalStatef20aa90\" incoming=\"//@clazz.6/@ownedOperation.0/@stateMachine/@transition.0\"/>\n" + 
				"        <trAttach ObjectID=\"f14a7ed\" name=\"YTrAttachmentf14a7ed\" transition=\"//@clazz.6/@ownedOperation.0/@stateMachine/@transition.0\" guardStringRep=\"true;\">\n" + 
				"          <effects ObjectID=\"f515289\" effectStringRep=\"this.type = type;&#xA;\"/>\n" + 
				"        </trAttach>\n" + 
				"      </stateMachine>\n" + 
				"    </ownedOperation>\n" + 
				"    <ownedOperation ObjectID=\"f6dc86a\" name=\"simulate\" clazz=\"//@clazz.6\" returnType=\"//@packages.0/@ownedMemberPackage.2\">\n" + 
				"      <ownedParameter ObjectID=\"fc4df5\" name=\"timeStep\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\n" + 
				"      <stateMachine ObjectID=\"f19ce43\" name=\"YStateMachinef19ce43\">\n" + 
				"        <transition ObjectID=\"f331699\" name=\"f3d7e8b\" source=\"//@clazz.6/@ownedOperation.1/@stateMachine/@subvertex.0\" target=\"//@clazz.6/@ownedOperation.1/@stateMachine/@subvertex.1\" attachment=\"//@clazz.6/@ownedOperation.1/@stateMachine/@trAttach.0\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f1d24e1\" name=\"Statef749535\" outgoing=\"//@clazz.6/@ownedOperation.1/@stateMachine/@transition.0\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f7ea3b3\" name=\"Statef601821\" incoming=\"//@clazz.6/@ownedOperation.1/@stateMachine/@transition.0\"/>\n" + 
				"        <trAttach ObjectID=\"f151fb0\" name=\"TrAttachmentfd6d0\" transition=\"//@clazz.6/@ownedOperation.1/@stateMachine/@transition.0\" guardStringRep=\"true;&#xA;\">\n" + 
				"          <effects ObjectID=\"f12c576\" effectStringRep=\"setReturnValue(false);&#xA;\"/>\n" + 
				"        </trAttach>\n" + 
				"      </stateMachine>\n" + 
				"    </ownedOperation>\n" + 
				"  </clazz>\n" + 
				"  <clazz ObjectID=\"f551b12\" name=\"PartGenerator\" superClass=\"//@clazz.0 //@packages.1/@ownedMemberPackage.2\">\n" + 
				"    <ownedAttribute ObjectID=\"f4b1e88\" name=\"partNumber\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@clazz.7\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f27c228\" name=\"event\" type=\"//@packages.1/@ownedMemberPackage.3\" clazz=\"//@clazz.7\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f408752\" name=\"queue\" association=\"true\" type=\"//@clazz.5\" clazz=\"//@clazz.7\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f656d8f\" name=\"typeRandomizer\" type=\"//@packages.1/@ownedMemberPackage.4\" clazz=\"//@clazz.7\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f1f68b9\" name=\"typeRand\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@clazz.7\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f5af22e\" name=\"part\" type=\"//@clazz.6\" clazz=\"//@clazz.7\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f3b5218\" name=\"partsCount\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@clazz.7\"/>\n" + 
				"    <ownedOperation ObjectID=\"f1e9892\" name=\"simulate\" clazz=\"//@clazz.7\" returnType=\"//@packages.0/@ownedMemberPackage.2\">\n" + 
				"      <ownedParameter ObjectID=\"f30207d\" name=\"timeStep\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\n" + 
				"      <stateMachine ObjectID=\"f19ba07\" name=\"YStateMachinef19ba07\">\n" + 
				"        <transition ObjectID=\"f1015dd\" name=\"YTransitionf1015dd\" source=\"//@clazz.7/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@clazz.7/@ownedOperation.0/@stateMachine/@subvertex.4\" attachment=\"//@clazz.7/@ownedOperation.0/@stateMachine/@trAttach.0\"/>\n" + 
				"        <transition ObjectID=\"f199836\" name=\"YTransitionf199836\" source=\"//@clazz.7/@ownedOperation.0/@stateMachine/@subvertex.5\" target=\"//@clazz.7/@ownedOperation.0/@stateMachine/@subvertex.3\" attachment=\"//@clazz.7/@ownedOperation.0/@stateMachine/@trAttach.1\"/>\n" + 
				"        <transition ObjectID=\"ffc629\" name=\"YTransitionffc629\" source=\"//@clazz.7/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@clazz.7/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@clazz.7/@ownedOperation.0/@stateMachine/@trAttach.2\"/>\n" + 
				"        <transition ObjectID=\"f5efde9\" name=\"YTransitionf5efde9\" source=\"//@clazz.7/@ownedOperation.0/@stateMachine/@subvertex.3\" target=\"//@clazz.7/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@clazz.7/@ownedOperation.0/@stateMachine/@trAttach.3\"/>\n" + 
				"        <transition ObjectID=\"f6604b9\" name=\"YTransitionf6604b9\" source=\"//@clazz.7/@ownedOperation.0/@stateMachine/@subvertex.5\" target=\"//@clazz.7/@ownedOperation.0/@stateMachine/@subvertex.3\" attachment=\"//@clazz.7/@ownedOperation.0/@stateMachine/@trAttach.4\"/>\n" + 
				"        <transition ObjectID=\"f2cf174\" name=\"YTransitionf2cf174\" source=\"//@clazz.7/@ownedOperation.0/@stateMachine/@subvertex.4\" target=\"//@clazz.7/@ownedOperation.0/@stateMachine/@subvertex.2\" attachment=\"//@clazz.7/@ownedOperation.0/@stateMachine/@trAttach.5\"/>\n" + 
				"        <transition ObjectID=\"f4cdb86\" name=\"YTransitionf4cdb86\" source=\"//@clazz.7/@ownedOperation.0/@stateMachine/@subvertex.4\" target=\"//@clazz.7/@ownedOperation.0/@stateMachine/@subvertex.2\" attachment=\"//@clazz.7/@ownedOperation.0/@stateMachine/@trAttach.6\"/>\n" + 
				"        <transition ObjectID=\"f281bc0\" name=\"YTransitionf281bc0\" source=\"//@clazz.7/@ownedOperation.0/@stateMachine/@subvertex.2\" target=\"//@clazz.7/@ownedOperation.0/@stateMachine/@subvertex.5\" attachment=\"//@clazz.7/@ownedOperation.0/@stateMachine/@trAttach.7\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f2dfb6d\" name=\"YPseudostatef2dfb6d\" outgoing=\"//@clazz.7/@ownedOperation.0/@stateMachine/@transition.0 //@clazz.7/@ownedOperation.0/@stateMachine/@transition.2\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f5477ce\" name=\"YFinalStatef5477ce\" incoming=\"//@clazz.7/@ownedOperation.0/@stateMachine/@transition.2 //@clazz.7/@ownedOperation.0/@stateMachine/@transition.3\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f561490\" name=\"YStatef561490\" outgoing=\"//@clazz.7/@ownedOperation.0/@stateMachine/@transition.7\" incoming=\"//@clazz.7/@ownedOperation.0/@stateMachine/@transition.5 //@clazz.7/@ownedOperation.0/@stateMachine/@transition.6\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f4da426\" name=\"YStatef4da426\" outgoing=\"//@clazz.7/@ownedOperation.0/@stateMachine/@transition.3\" incoming=\"//@clazz.7/@ownedOperation.0/@stateMachine/@transition.1 //@clazz.7/@ownedOperation.0/@stateMachine/@transition.4\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f61f8c7\" name=\"YStatef61f8c7\" outgoing=\"//@clazz.7/@ownedOperation.0/@stateMachine/@transition.5 //@clazz.7/@ownedOperation.0/@stateMachine/@transition.6\" incoming=\"//@clazz.7/@ownedOperation.0/@stateMachine/@transition.0\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f68e77\" name=\"YStatef68e77\" outgoing=\"//@clazz.7/@ownedOperation.0/@stateMachine/@transition.4 //@clazz.7/@ownedOperation.0/@stateMachine/@transition.1\" incoming=\"//@clazz.7/@ownedOperation.0/@stateMachine/@transition.7\"/>\n" + 
				"        <trAttach ObjectID=\"f1ed5e\" name=\"YTrAttachmentf1ed5e\" transition=\"//@clazz.7/@ownedOperation.0/@stateMachine/@transition.0\" guardStringRep=\"DES.EventQueue.peek(timeStep, true, GeneratePartEvent.yClass as YClass, this, null) != null;&#xA;\">\n" + 
				"          <effects ObjectID=\"f5a6f94\" effectStringRep=\"DES.EventQueue.consume(timeStep, true, GeneratePartEvent.yClass as YClass, this, null);&#xA;\"/>\n" + 
				"          <effects ObjectID=\"f766b6a\" effectStringRep=\"typeRand = typeRandomizer.nextInt;&#xA;\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f6c7f1e\" name=\"YTrAttachmentf6c7f1e\" transition=\"//@clazz.7/@ownedOperation.0/@stateMachine/@transition.1\" guardStringRep=\"partsCount &lt; partNumber;&#xA;\">\n" + 
				"          <effects ObjectID=\"f5f61f1\" effectStringRep=\"event = new GeneratePartEvent;&#xA;\"/>\n" + 
				"          <effects ObjectID=\"f52cc6e\" effectStringRep=\"event.timeStep = timeStep + 10;&#xA;\"/>\n" + 
				"          <effects ObjectID=\"f91bb0\" effectStringRep=\"event.receivingObject = this;&#xA;\"/>\n" + 
				"          <effects ObjectID=\"f593fee\" effectStringRep=\"partsCount++;&#xA;\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f3fe76c\" name=\"YTrAttachmentf3fe76c\" transition=\"//@clazz.7/@ownedOperation.0/@stateMachine/@transition.2\" guardStringRep=\"DES.EventQueue.peek(timeStep, true, GeneratePartEvent.yClass as YClass, this, null) == null;&#xA;\">\n" + 
				"          <effects ObjectID=\"f48c697\" effectStringRep=\"setReturnValue(false);&#xA;\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f5ccd28\" name=\"YTrAttachmentf5ccd28\" transition=\"//@clazz.7/@ownedOperation.0/@stateMachine/@transition.3\" guardStringRep=\"true;\">\n" + 
				"          <effects ObjectID=\"f366e72\" effectStringRep=\"setReturnValue(true);&#xA;\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f796c6\" name=\"YTrAttachmentf796c6\" transition=\"//@clazz.7/@ownedOperation.0/@stateMachine/@transition.4\" guardStringRep=\"partsCount >= partNumber;&#xA;\"/>\n" + 
				"        <trAttach ObjectID=\"f4d0204\" name=\"YTrAttachmentf4d0204\" transition=\"//@clazz.7/@ownedOperation.0/@stateMachine/@transition.5\" guardStringRep=\"typeRand == 0;&#xA;\">\n" + 
				"          <effects ObjectID=\"f587ad3\" effectStringRep=\"part = new Part(PartType.typeA);&#xA;\"/>\n" + 
				"          <effects ObjectID=\"f66764d\" effectStringRep=\"part.name = &quot;partA&quot; + partsCount;&#xA;\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f36421d\" name=\"YTrAttachmentf36421d\" transition=\"//@clazz.7/@ownedOperation.0/@stateMachine/@transition.6\" guardStringRep=\"typeRand == 1;&#xA;\">\n" + 
				"          <effects ObjectID=\"f1e0a2f\" effectStringRep=\"part = new Part(PartType.typeB);&#xA;\"/>\n" + 
				"          <effects ObjectID=\"f51f632\" effectStringRep=\"part.name = &quot;partB&quot; + partsCount;&#xA;\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f477e54\" name=\"YTrAttachmentf477e54\" transition=\"//@clazz.7/@ownedOperation.0/@stateMachine/@transition.7\" guardStringRep=\"true;\">\n" + 
				"          <effects ObjectID=\"f13f1ee\" effectStringRep=\"queue.add(part);&#xA;\"/>\n" + 
				"        </trAttach>\n" + 
				"      </stateMachine>\n" + 
				"    </ownedOperation>\n" + 
				"    <ownedOperation ObjectID=\"f4de70e\" name=\"PartGenerator\" clazz=\"//@clazz.7\">\n" + 
				"      <ownedParameter ObjectID=\"f20eb35\" name=\"number\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\n" + 
				"      <ownedParameter ObjectID=\"f42adc8\" name=\"random\" type=\"//@packages.0/@ownedMemberPackage.4\"/>\n" + 
				"      <stateMachine ObjectID=\"f2cdf4e\" name=\"YStateMachinef2cdf4e\">\n" + 
				"        <transition ObjectID=\"fc878c\" name=\"YTransitionfc878c\" source=\"//@clazz.7/@ownedOperation.1/@stateMachine/@subvertex.0\" target=\"//@clazz.7/@ownedOperation.1/@stateMachine/@subvertex.1\" attachment=\"//@clazz.7/@ownedOperation.1/@stateMachine/@trAttach.0\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f5e5b7f\" name=\"YPseudostatef5e5b7f\" outgoing=\"//@clazz.7/@ownedOperation.1/@stateMachine/@transition.0\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f1e6a9d\" name=\"YFinalStatef1e6a9d\" incoming=\"//@clazz.7/@ownedOperation.1/@stateMachine/@transition.0\"/>\n" + 
				"        <trAttach ObjectID=\"f163b4b\" name=\"YTrAttachmentf163b4b\" transition=\"//@clazz.7/@ownedOperation.1/@stateMachine/@transition.0\" guardStringRep=\"true;\">\n" + 
				"          <effects ObjectID=\"f25ff3\" effectStringRep=\"typeRandomizer = new DES.Randomizer;&#xA;\"/>\n" + 
				"          <effects ObjectID=\"f7d5ea7\" effectStringRep=\"typeRandomizer.random = random;&#xA;\"/>\n" + 
				"          <effects ObjectID=\"f1c72fd\" effectStringRep=\"typeRandomizer.addProbInt(1.0, 1);&#xA;\"/>\n" + 
				"          <effects ObjectID=\"f1ad78\" effectStringRep=\"typeRandomizer.addProbInt(2, 0);&#xA;\"/>\n" + 
				"          <effects ObjectID=\"f3d501b\"/>\n" + 
				"          <effects ObjectID=\"f52e469\" effectStringRep=\"partNumber = number;&#xA;\"/>\n" + 
				"          <effects ObjectID=\"f1d30ce\" effectStringRep=\"partsCount = 1;&#xA;\"/>\n" + 
				"          <effects ObjectID=\"f5ab60e\" effectStringRep=\"event = new GeneratePartEvent;&#xA;\"/>\n" + 
				"          <effects ObjectID=\"f5508c3\" effectStringRep=\"event.receivingObject = this;&#xA;\"/>\n" + 
				"          <effects ObjectID=\"f15ad71\" effectStringRep=\"event.timeStep = 0;&#xA;\"/>\n" + 
				"        </trAttach>\n" + 
				"      </stateMachine>\n" + 
				"    </ownedOperation>\n" + 
				"  </clazz>\n" + 
				"  <clazz ObjectID=\"f56aa1b\" name=\"GeneratePartEvent\" superClass=\"//@clazz.0 //@packages.1/@ownedMemberPackage.3\"/>\n" + 
				"  <clazz ObjectID=\"f5f2bb6\" name=\"CompletionObserver\" superClass=\"//@clazz.0\">\n" + 
				"    <ownedAttribute ObjectID=\"f15fb33\" name=\"active\" defaultValue=\"&quot;true&quot;\" type=\"//@packages.0/@ownedMemberPackage.2\" clazz=\"//@clazz.9\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f4a6211\" name=\"stationB\" type=\"//@clazz.4\" clazz=\"//@clazz.9\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f6e06d8\" name=\"generator\" type=\"//@clazz.7\" clazz=\"//@clazz.9\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f2c3096\" name=\"stationA\" type=\"//@clazz.3\" clazz=\"//@clazz.9\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f1b9d51\" name=\"i\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@clazz.9\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f783788\" name=\"partToString\" type=\"//@packages.0/@ownedMemberPackage.3\" clazz=\"//@clazz.9\"/>\n" + 
				"    <ownedOperation ObjectID=\"f67b9aa\" name=\"oberver\" clazz=\"//@clazz.9\">\n" + 
				"      <stateMachine ObjectID=\"f5e5800\" name=\"YStateMachinef5e5800\" initialActive=\"true\" rtc=\"observer\">\n" + 
				"        <transition ObjectID=\"f59fb24\" name=\"YTransitionf59fb24\" source=\"//@clazz.9/@ownedOperation.0/@stateMachine/@subvertex.1\" target=\"//@clazz.9/@ownedOperation.0/@stateMachine/@subvertex.5\" attachment=\"//@clazz.9/@ownedOperation.0/@stateMachine/@trAttach.0\"/>\n" + 
				"        <transition ObjectID=\"f4bc9f3\" name=\"YTransitionf4bc9f3\" source=\"//@clazz.9/@ownedOperation.0/@stateMachine/@subvertex.2\" target=\"//@clazz.9/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@clazz.9/@ownedOperation.0/@stateMachine/@trAttach.1\"/>\n" + 
				"        <transition ObjectID=\"f6f37b7\" name=\"YTransitionf6f37b7\" source=\"//@clazz.9/@ownedOperation.0/@stateMachine/@subvertex.8\" target=\"//@clazz.9/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@clazz.9/@ownedOperation.0/@stateMachine/@trAttach.2\"/>\n" + 
				"        <transition ObjectID=\"f291891\" name=\"YTransitionf291891\" source=\"//@clazz.9/@ownedOperation.0/@stateMachine/@subvertex.8\" target=\"//@clazz.9/@ownedOperation.0/@stateMachine/@subvertex.2\" attachment=\"//@clazz.9/@ownedOperation.0/@stateMachine/@trAttach.3\"/>\n" + 
				"        <transition ObjectID=\"f415fb0\" name=\"f415fb0\" source=\"//@clazz.9/@ownedOperation.0/@stateMachine/@subvertex.5\" target=\"//@clazz.9/@ownedOperation.0/@stateMachine/@subvertex.3\" attachment=\"//@clazz.9/@ownedOperation.0/@stateMachine/@trAttach.6\"/>\n" + 
				"        <transition ObjectID=\"f312367\" name=\"f312367\" source=\"//@clazz.9/@ownedOperation.0/@stateMachine/@subvertex.3\" target=\"//@clazz.9/@ownedOperation.0/@stateMachine/@subvertex.6\" attachment=\"//@clazz.9/@ownedOperation.0/@stateMachine/@trAttach.4\"/>\n" + 
				"        <transition ObjectID=\"f7a59cd\" name=\"f7a59cd\" source=\"//@clazz.9/@ownedOperation.0/@stateMachine/@subvertex.3\" target=\"//@clazz.9/@ownedOperation.0/@stateMachine/@subvertex.3\" attachment=\"//@clazz.9/@ownedOperation.0/@stateMachine/@trAttach.5\"/>\n" + 
				"        <transition ObjectID=\"f5d847e\" name=\"YTransitionf5d847e\" source=\"//@clazz.9/@ownedOperation.0/@stateMachine/@subvertex.6\" target=\"//@clazz.9/@ownedOperation.0/@stateMachine/@subvertex.7\" attachment=\"//@clazz.9/@ownedOperation.0/@stateMachine/@trAttach.7\"/>\n" + 
				"        <transition ObjectID=\"f19468\" name=\"YTransitionf19468\" source=\"//@clazz.9/@ownedOperation.0/@stateMachine/@subvertex.7\" target=\"//@clazz.9/@ownedOperation.0/@stateMachine/@subvertex.7\" attachment=\"//@clazz.9/@ownedOperation.0/@stateMachine/@trAttach.8\"/>\n" + 
				"        <transition ObjectID=\"f278b31\" name=\"YTransitionf278b31\" source=\"//@clazz.9/@ownedOperation.0/@stateMachine/@subvertex.7\" target=\"//@clazz.9/@ownedOperation.0/@stateMachine/@subvertex.4\" attachment=\"//@clazz.9/@ownedOperation.0/@stateMachine/@trAttach.9\"/>\n" + 
				"        <transition ObjectID=\"f42d9f8\" name=\"YTransitionf42d9f8\" source=\"//@clazz.9/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@clazz.9/@ownedOperation.0/@stateMachine/@subvertex.8\" attachment=\"//@clazz.9/@ownedOperation.0/@stateMachine/@trAttach.10\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f634b40\" name=\"YPseudostatef634b40\" outgoing=\"//@clazz.9/@ownedOperation.0/@stateMachine/@transition.10\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f38f43e\" name=\"YStatef38f43e\" outgoing=\"//@clazz.9/@ownedOperation.0/@stateMachine/@transition.0\" incoming=\"//@clazz.9/@ownedOperation.0/@stateMachine/@transition.1 //@clazz.9/@ownedOperation.0/@stateMachine/@transition.2\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f357cf\" name=\"YStatef357cf\" outgoing=\"//@clazz.9/@ownedOperation.0/@stateMachine/@transition.1\" incoming=\"//@clazz.9/@ownedOperation.0/@stateMachine/@transition.3\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f42786e\" name=\"Statef42786e\" outgoing=\"//@clazz.9/@ownedOperation.0/@stateMachine/@transition.6 //@clazz.9/@ownedOperation.0/@stateMachine/@transition.5\" incoming=\"//@clazz.9/@ownedOperation.0/@stateMachine/@transition.4 //@clazz.9/@ownedOperation.0/@stateMachine/@transition.6\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f853df\" name=\"Statef853df\" incoming=\"//@clazz.9/@ownedOperation.0/@stateMachine/@transition.9\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f60404f\" name=\"YStatef60404f\" outgoing=\"//@clazz.9/@ownedOperation.0/@stateMachine/@transition.4\" incoming=\"//@clazz.9/@ownedOperation.0/@stateMachine/@transition.0\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f52f34d\" name=\"YStatef52f34d\" outgoing=\"//@clazz.9/@ownedOperation.0/@stateMachine/@transition.7\" incoming=\"//@clazz.9/@ownedOperation.0/@stateMachine/@transition.5\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f1f5b4f\" name=\"YStatef1f5b4f\" outgoing=\"//@clazz.9/@ownedOperation.0/@stateMachine/@transition.8 //@clazz.9/@ownedOperation.0/@stateMachine/@transition.9\" incoming=\"//@clazz.9/@ownedOperation.0/@stateMachine/@transition.7 //@clazz.9/@ownedOperation.0/@stateMachine/@transition.8\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f2ce201\" name=\"YStatef2ce201\" outgoing=\"//@clazz.9/@ownedOperation.0/@stateMachine/@transition.3 //@clazz.9/@ownedOperation.0/@stateMachine/@transition.2\" incoming=\"//@clazz.9/@ownedOperation.0/@stateMachine/@transition.10\"/>\n" + 
				"        <trAttach ObjectID=\"f1f3b22\" name=\"YTrAttachmentf1f3b22\" transition=\"//@clazz.9/@ownedOperation.0/@stateMachine/@transition.0\" guardStringRep=\"generator.partsCount >= generator.partNumber; \">\n" + 
				"          <effects ObjectID=\"f236aab\" effectStringRep=\"active = false;&#xA;\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f79a9e9\" name=\"YTrAttachmentf79a9e9\" transition=\"//@clazz.9/@ownedOperation.0/@stateMachine/@transition.1\" guardStringRep=\"generator != null&#xA;&amp;&amp; stationA != null&#xA;&amp;&amp; stationB != null;&#xA;&#xA;\"/>\n" + 
				"        <trAttach ObjectID=\"f3dc32\" name=\"YTrAttachmentf3dc32\" transition=\"//@clazz.9/@ownedOperation.0/@stateMachine/@transition.2\" guardStringRep=\"generator != null&#xA;&amp;&amp; stationA != null&#xA;&amp;&amp; stationB != null;&#xA;\"/>\n" + 
				"        <trAttach ObjectID=\"f4dcb7d\" name=\"YTrAttachmentf4dcb7d\" transition=\"//@clazz.9/@ownedOperation.0/@stateMachine/@transition.3\" guardStringRep=\"generator == null&#xA;|| stationA == null&#xA;|| stationB == null;&#xA;\">\n" + 
				"          <effects ObjectID=\"f23926c\" effectStringRep=\"generator = (getInstances(1, &quot;PartGenerator&quot;) as java.util.List&lt;PartGenerator>).get(0); &#xA;\"/>\n" + 
				"          <effects ObjectID=\"f4d84b5\" effectStringRep=\"stationA = (getInstances(1, &quot;StationA&quot;) as java.util.List&lt;StationA>).get(0); &#xA;\"/>\n" + 
				"          <effects ObjectID=\"f3aac4d\" effectStringRep=\"stationB = (getInstances(1, &quot;StationB&quot;) as java.util.List&lt;StationB>).get(0); &#xA;\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f551cab\" name=\"TrAttachmentf551cab\" transition=\"//@clazz.9/@ownedOperation.0/@stateMachine/@transition.5\" guardStringRep=\"i >= stationA.parts.size;&#xA;\">\n" + 
				"          <effects ObjectID=\"f54cf64\" effectStringRep=\"Print(partToString);&#xA;\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f59e563\" name=\"TrAttachmentf59e563\" transition=\"//@clazz.9/@ownedOperation.0/@stateMachine/@transition.6\" guardStringRep=\"i &lt; stationA.parts.size;&#xA;\">\n" + 
				"          <effects ObjectID=\"f5899be\" effectStringRep=\"partToString = partToString + &quot;, &quot; + stationA.parts.get(i).name;&#xA;\"/>\n" + 
				"          <effects ObjectID=\"f34323c\" effectStringRep=\"i++;&#xA;\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f6fa6d6\" name=\"TrAttachmentf6fa6d6\" transition=\"//@clazz.9/@ownedOperation.0/@stateMachine/@transition.4\" guardStringRep=\"true;\">\n" + 
				"          <effects ObjectID=\"f4a55d1\" effectStringRep=\"i = 0;&#xA;\"/>\n" + 
				"          <effects ObjectID=\"f5c6ba7\" effectStringRep=\"partToString = &quot;TYPEA: &quot;;&#xA;\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f3cefd4\" name=\"YTrAttachmentf3cefd4\" transition=\"//@clazz.9/@ownedOperation.0/@stateMachine/@transition.7\" guardStringRep=\"true;\">\n" + 
				"          <effects ObjectID=\"f79c33b\" effectStringRep=\"i = 0;&#xA;\"/>\n" + 
				"          <effects ObjectID=\"f70efb9\" effectStringRep=\"partToString = &quot;TYPEB: &quot;;&#xA;\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f5d0008\" name=\"YTrAttachmentf5d0008\" transition=\"//@clazz.9/@ownedOperation.0/@stateMachine/@transition.8\" guardStringRep=\"i &lt; stationB.parts.size;\">\n" + 
				"          <effects ObjectID=\"f387fcb\" effectStringRep=\"partToString = partToString + &quot;, &quot; + stationB.parts.get(i).name;&#xA;\"/>\n" + 
				"          <effects ObjectID=\"f77bbb\" effectStringRep=\"i++;&#xA;\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f7cefe9\" name=\"YTrAttachmentf7cefe9\" transition=\"//@clazz.9/@ownedOperation.0/@stateMachine/@transition.9\" guardStringRep=\"i >= stationB.parts.size;&#xA;\">\n" + 
				"          <effects ObjectID=\"f7330d6\" effectStringRep=\"Print(partToString);&#xA;\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f6e7389\" name=\"YTrAttachmentf6e7389\" transition=\"//@clazz.9/@ownedOperation.0/@stateMachine/@transition.10\" guardStringRep=\"active;&#xA;\"/>\n" + 
				"      </stateMachine>\n" + 
				"    </ownedOperation>\n" + 
				"  </clazz>\n" + 
				"  <enumerations ObjectID=\"f266aa7\" name=\"PartType\">\n" + 
				"    <ownedLiteral ObjectID=\"f5b9146\" name=\"typeA\"/>\n" + 
				"    <ownedLiteral ObjectID=\"f35716d\" name=\"typeB\"/>\n" + 
				"  </enumerations>\n" + 
				"  <packages ObjectID=\"f186d36\" name=\"Types\">\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f21f575\" name=\"Integer\" package=\"//@packages.0\"/>\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f6ff69c\" name=\"Double\" package=\"//@packages.0\"/>\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f143957\" name=\"Boolean\" package=\"//@packages.0\"/>\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f4f4a1\" name=\"String\" package=\"//@packages.0\"/>\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"fea65c\" name=\"Object\" package=\"//@packages.0\"/>\n" + 
				"  </packages>\n" + 
				"  <packages ObjectID=\"f2bcfa4\" name=\"DES\">\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f6f1844\" name=\"EventQueue\" package=\"//@packages.1\" superClass=\"//@clazz.0\">\n" + 
				"      <ownedOperation ObjectID=\"f78653a\" name=\"consume\" clazz=\"//@packages.1/@ownedMemberPackage.0\" returnType=\"//@packages.1/@ownedMemberPackage.3\">\n" + 
				"        <ownedParameter ObjectID=\"f741ee8\" name=\"timeStep\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\n" + 
				"        <ownedParameter ObjectID=\"f325830\" name=\"past\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.2\"/>\n" + 
				"        <ownedParameter ObjectID=\"f1385ca\" name=\"eventType\" isUnique=\"true\" type=\"//@clazz.1\"/>\n" + 
				"        <ownedParameter ObjectID=\"f334831\" name=\"receiver\" isUnique=\"true\" type=\"//@clazz.0\"/>\n" + 
				"        <ownedParameter ObjectID=\"f4cda47\" name=\"receiverType\" isUnique=\"true\" type=\"//@clazz.1\"/>\n" + 
				"        <stateMachine ObjectID=\"f2a9bdf\" name=\"YStateMachinef2a9bdf\"/>\n" + 
				"      </ownedOperation>\n" + 
				"      <ownedOperation ObjectID=\"f60b252\" name=\"peek\" clazz=\"//@packages.1/@ownedMemberPackage.0\" returnType=\"//@packages.1/@ownedMemberPackage.3\">\n" + 
				"        <ownedParameter ObjectID=\"f465861\" name=\"timeStep\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\n" + 
				"        <ownedParameter ObjectID=\"f4b5255\" name=\"past\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.2\"/>\n" + 
				"        <ownedParameter ObjectID=\"f7afd77\" name=\"eventType\" isUnique=\"true\" type=\"//@clazz.1\"/>\n" + 
				"        <ownedParameter ObjectID=\"f82b36\" name=\"receiver\" isUnique=\"true\" type=\"//@clazz.0\"/>\n" + 
				"        <ownedParameter ObjectID=\"fd7951\" name=\"receiverType\" isUnique=\"true\" type=\"//@clazz.1\"/>\n" + 
				"        <stateMachine ObjectID=\"f545e73\" name=\"YStateMachinef545e73\"/>\n" + 
				"      </ownedOperation>\n" + 
				"    </ownedMemberPackage>\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f7b30f\" name=\"Queue\" package=\"//@packages.1\" superClass=\"//@clazz.0 //@packages.1/@ownedMemberPackage.2\">\n" + 
				"      <ownedAttribute ObjectID=\"f9f8bb\" name=\"queue\" association=\"true\" upper=\"-1\" aggregation=\"composite\" type=\"//@packages.1/@ownedMemberPackage.2\" clazz=\"//@packages.1/@ownedMemberPackage.1\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f386ee1\" name=\"delayed\" association=\"true\" upper=\"-1\" aggregation=\"composite\" type=\"//@packages.1/@ownedMemberPackage.2\" clazz=\"//@packages.1/@ownedMemberPackage.1\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f2f987a\" name=\"event\" isUnique=\"true\" type=\"//@packages.1/@ownedMemberPackage.3\" clazz=\"//@packages.1/@ownedMemberPackage.1\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f660fa1\" name=\"var_objectManagment\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.4\" clazz=\"//@packages.1/@ownedMemberPackage.1\"/>\n" + 
				"      <ownedOperation ObjectID=\"f20be76\" name=\"add\" clazz=\"//@packages.1/@ownedMemberPackage.1\">\n" + 
				"        <ownedParameter ObjectID=\"f4f4254\" name=\"object\" isUnique=\"true\" type=\"//@packages.1/@ownedMemberPackage.2\"/>\n" + 
				"        <stateMachine ObjectID=\"f4abe3c\" name=\"YStateMachinef4abe3c\">\n" + 
				"          <transition ObjectID=\"f5e9a9b\" name=\"YTransitionf5e9a9b\" source=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.0/@stateMachine/@trAttach.0\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f38ff8d\" name=\"YPseudostatef38ff8d\" outgoing=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.0/@stateMachine/@transition.0\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f22957b\" name=\"YFinalStatef22957b\" incoming=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.0/@stateMachine/@transition.0\"/>\n" + 
				"          <trAttach ObjectID=\"f529472\" name=\"YTrAttachmentf529472\" transition=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.0/@stateMachine/@transition.0\" guardStringRep=\"true;\">\n" + 
				"            <effects ObjectID=\"f3d0304\" effectStringRep=\"queue.add(object);\"/>\n" + 
				"            <effects ObjectID=\"f160b70\" effectStringRep=\"var_objectManagment = getObjectManagement();\"/>\n" + 
				"            <effects ObjectID=\"f6420ae\" effectStringRep=\"(var_objectManagment as online.yamm.ObjectManagement).addQueueElement(this, object, 1);\"/>\n" + 
				"          </trAttach>\n" + 
				"        </stateMachine>\n" + 
				"      </ownedOperation>\n" + 
				"      <ownedOperation ObjectID=\"f68084f\" name=\"consume\" clazz=\"//@packages.1/@ownedMemberPackage.1\" returnType=\"//@packages.1/@ownedMemberPackage.2\">\n" + 
				"        <ownedParameter ObjectID=\"f34e890\" name=\"filterMap\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.4\"/>\n" + 
				"        <stateMachine ObjectID=\"f467557\" name=\"YStateMachinef467557\"/>\n" + 
				"      </ownedOperation>\n" + 
				"      <ownedOperation ObjectID=\"f7b77c9\" name=\"peek\" clazz=\"//@packages.1/@ownedMemberPackage.1\" returnType=\"//@packages.1/@ownedMemberPackage.2\">\n" + 
				"        <ownedParameter ObjectID=\"f310db4\" name=\"filterMap\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.4\"/>\n" + 
				"        <stateMachine ObjectID=\"f549a88\" name=\"YStateMachinef549a88\"/>\n" + 
				"      </ownedOperation>\n" + 
				"      <ownedOperation ObjectID=\"f275fe\" name=\"addWithDelay\" clazz=\"//@packages.1/@ownedMemberPackage.1\">\n" + 
				"        <ownedParameter ObjectID=\"f2f3872\" name=\"object\" isUnique=\"true\" type=\"//@packages.1/@ownedMemberPackage.2\"/>\n" + 
				"        <ownedParameter ObjectID=\"f8dd49\" name=\"delay\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\n" + 
				"        <ownedParameter ObjectID=\"f468ab9\" name=\"timeStep\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\n" + 
				"        <stateMachine ObjectID=\"f48a287\" name=\"YStateMachinef48a287\">\n" + 
				"          <transition ObjectID=\"f58fd62\" name=\"YTransitionf58fd62\" source=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.3/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.3/@stateMachine/@subvertex.1\" attachment=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.3/@stateMachine/@trAttach.0\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f4b5238\" name=\"YPseudostatef4b5238\" outgoing=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.3/@stateMachine/@transition.0\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f5e46aa\" name=\"YFinalStatef5e46aa\" incoming=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.3/@stateMachine/@transition.0\"/>\n" + 
				"          <trAttach ObjectID=\"f459b0\" name=\"YTrAttachmentf459b0\" transition=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.3/@stateMachine/@transition.0\" guardStringRep=\"true;\">\n" + 
				"            <effects ObjectID=\"f3af920\" effectStringRep=\"var_objectManagment = getObjectManagement();\"/>\n" + 
				"            <effects ObjectID=\"f3726ea\" effectStringRep=\"(var_objectManagment as online.yamm.ObjectManagement).addDelayedQueueElement(this, object, 1);\"/>\n" + 
				"            <effects ObjectID=\"f59be5a\" effectStringRep=\"delayed.add(object);\"/>\n" + 
				"            <effects ObjectID=\"f6f18ad\" effectStringRep=\"event = new Delay;\"/>\n" + 
				"            <effects ObjectID=\"f28d54b\" effectStringRep=\"event.timeStep = timeStep + delay;\"/>\n" + 
				"            <effects ObjectID=\"f3ae638\" effectStringRep=\"event.objectAttached = object;\"/>\n" + 
				"            <effects ObjectID=\"f5109cb\" effectStringRep=\"event.receivingObject = this;\"/>\n" + 
				"          </trAttach>\n" + 
				"        </stateMachine>\n" + 
				"      </ownedOperation>\n" + 
				"      <ownedOperation ObjectID=\"f764840\" name=\"simulate\" clazz=\"//@packages.1/@ownedMemberPackage.1\" returnType=\"//@packages.0/@ownedMemberPackage.2\">\n" + 
				"        <ownedParameter ObjectID=\"f68416a\" name=\"timeStep\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\n" + 
				"        <stateMachine ObjectID=\"f7e7e66\" name=\"YStateMachinef7e7e66\">\n" + 
				"          <transition ObjectID=\"f2b7fa1\" name=\"YTransitionf2b7fa1\" source=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.2\" target=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.0\" attachment=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@trAttach.0\"/>\n" + 
				"          <transition ObjectID=\"f4bfb83\" name=\"YTransitionf4bfb83\" source=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.1\" attachment=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@trAttach.1\"/>\n" + 
				"          <transition ObjectID=\"f78cae7\" name=\"YTransitionf78cae7\" source=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.1\" target=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.3\" attachment=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@trAttach.2\"/>\n" + 
				"          <transition ObjectID=\"f3b1426\" name=\"YTransitionf3b1426\" source=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.1\" target=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.3\" attachment=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@trAttach.3\"/>\n" + 
				"          <transition ObjectID=\"f411019\" name=\"YTransitionf411019\" source=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.3\" attachment=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@trAttach.4\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"fe5506\" name=\"YStatefe5506\" outgoing=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.1 //@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.4\" incoming=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.0\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f4cf3d0\" name=\"YStatef4cf3d0\" outgoing=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.2 //@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.3\" incoming=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.1\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f384d51\" name=\"YPseudostatef384d51\" outgoing=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.0\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f2e7b01\" name=\"YFinalStatef2e7b01\" incoming=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.2 //@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.3 //@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.4\"/>\n" + 
				"          <trAttach ObjectID=\"f14e78f\" name=\"YTrAttachmentf14e78f\" transition=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.0\" guardStringRep=\"true;\">\n" + 
				"            <effects ObjectID=\"f48c6c2\" effectStringRep=\"event = DES.EventQueue.peek(timeStep, true, null, this, null);\"/>\n" + 
				"          </trAttach>\n" + 
				"          <trAttach ObjectID=\"f1e9b4e\" name=\"YTrAttachmentf1e9b4e\" transition=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.1\" guardStringRep=\"event != null;\"/>\n" + 
				"          <trAttach ObjectID=\"f5eb936\" name=\"YTrAttachmentf5eb936\" transition=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.2\" guardStringRep=\"event instanceof Delay;\">\n" + 
				"            <effects ObjectID=\"f2c724a\" effectStringRep=\"DES.EventQueue.consume(timeStep, true, null, this, null);\"/>\n" + 
				"            <effects ObjectID=\"fe6655\" effectStringRep=\"(var_objectManagment as online.yamm.ObjectManagement).removeDelayedQueueElement(this, event.objectAttached, 1);\"/>\n" + 
				"            <effects ObjectID=\"fb8378\" effectStringRep=\"add(event.objectAttached);\"/>\n" + 
				"            <effects ObjectID=\"f271ec5\" effectStringRep=\"setReturnValue(true);\"/>\n" + 
				"          </trAttach>\n" + 
				"          <trAttach ObjectID=\"f3696b8\" name=\"YTrAttachmentf3696b8\" transition=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.3\" guardStringRep=\"!(event instanceof Delay);\">\n" + 
				"            <effects ObjectID=\"f430192\" effectStringRep=\"setReturnValue(false);\"/>\n" + 
				"          </trAttach>\n" + 
				"          <trAttach ObjectID=\"f11f883\" name=\"YTrAttachmentf11f883\" transition=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.4\" guardStringRep=\"event == null;\">\n" + 
				"            <effects ObjectID=\"f41db92\" effectStringRep=\"setReturnValue(false);\"/>\n" + 
				"          </trAttach>\n" + 
				"        </stateMachine>\n" + 
				"      </ownedOperation>\n" + 
				"    </ownedMemberPackage>\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f40b04f\" name=\"SimulationObject\" package=\"//@packages.1\" superClass=\"//@clazz.0\">\n" + 
				"      <ownedAttribute ObjectID=\"f555e10\" name=\"name\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.3\" clazz=\"//@packages.1/@ownedMemberPackage.2\"/>\n" + 
				"      <ownedOperation ObjectID=\"f10ddfa\" name=\"simulate\" clazz=\"//@packages.1/@ownedMemberPackage.2\" returnType=\"//@packages.0/@ownedMemberPackage.2\">\n" + 
				"        <ownedParameter ObjectID=\"f7873fc\" name=\"timeStep\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\n" + 
				"        <stateMachine ObjectID=\"f2ac9f0\" name=\"YStateMachinef2ac9f0\">\n" + 
				"          <transition ObjectID=\"f79f4b8\" name=\"YTransitionf79f4b8\" source=\"//@packages.1/@ownedMemberPackage.2/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.2/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@packages.1/@ownedMemberPackage.2/@ownedOperation.0/@stateMachine/@trAttach.0\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f68bf82\" name=\"YPseudostatef68bf82\" outgoing=\"//@packages.1/@ownedMemberPackage.2/@ownedOperation.0/@stateMachine/@transition.0\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f68c2fb\" name=\"YFinalStatef68c2fb\" incoming=\"//@packages.1/@ownedMemberPackage.2/@ownedOperation.0/@stateMachine/@transition.0\"/>\n" + 
				"          <trAttach ObjectID=\"f352f8d\" name=\"YTrAttachmentf352f8d\" transition=\"//@packages.1/@ownedMemberPackage.2/@ownedOperation.0/@stateMachine/@transition.0\" guardStringRep=\"true;\">\n" + 
				"            <effects ObjectID=\"f284471\" effectStringRep=\"setReturnValue(false);\"/>\n" + 
				"          </trAttach>\n" + 
				"        </stateMachine>\n" + 
				"      </ownedOperation>\n" + 
				"    </ownedMemberPackage>\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f2a26c9\" name=\"Event\" package=\"//@packages.1\" superClass=\"//@clazz.0\">\n" + 
				"      <ownedAttribute ObjectID=\"f3128f5\" name=\"timeStep\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@packages.1/@ownedMemberPackage.3\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f4063c7\" name=\"receivingType\" isUnique=\"true\" type=\"//@clazz.1\" clazz=\"//@packages.1/@ownedMemberPackage.3\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f197074\" name=\"description\" type=\"//@packages.0/@ownedMemberPackage.3\" clazz=\"//@packages.1/@ownedMemberPackage.3\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f94f5c\" name=\"receivingObject\" association=\"true\" isUnique=\"true\" type=\"//@packages.1/@ownedMemberPackage.2\" clazz=\"//@packages.1/@ownedMemberPackage.3\">\n" + 
				"        <ownedElement xsi:type=\"yammDiagram:YParameter\" ObjectID=\"f465861\" name=\"timeStep\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\n" + 
				"      </ownedAttribute>\n" + 
				"      <ownedAttribute ObjectID=\"f210054\" name=\"objectAttached\" association=\"true\" isUnique=\"true\" type=\"//@packages.1/@ownedMemberPackage.2\" clazz=\"//@packages.1/@ownedMemberPackage.3\"/>\n" + 
				"      <ownedOperation ObjectID=\"f6b9c0b\" name=\"toString\" clazz=\"//@packages.1/@ownedMemberPackage.3\" returnType=\"//@packages.0/@ownedMemberPackage.3\">\n" + 
				"        <stateMachine ObjectID=\"f694554\" name=\"YStateMachinef694554\">\n" + 
				"          <transition ObjectID=\"f76f663\" name=\"YTransitionf76f663\" source=\"//@packages.1/@ownedMemberPackage.3/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.3/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@packages.1/@ownedMemberPackage.3/@ownedOperation.0/@stateMachine/@trAttach.0\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f759d05\" name=\"YPseudostatef759d05\" outgoing=\"//@packages.1/@ownedMemberPackage.3/@ownedOperation.0/@stateMachine/@transition.0\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f190b71\" name=\"YFinalStatef190b71\" incoming=\"//@packages.1/@ownedMemberPackage.3/@ownedOperation.0/@stateMachine/@transition.0\"/>\n" + 
				"          <trAttach ObjectID=\"f776ef5\" name=\"YTrAttachmentf776ef5\" transition=\"//@packages.1/@ownedMemberPackage.3/@ownedOperation.0/@stateMachine/@transition.0\" guardStringRep=\"true;\">\n" + 
				"            <effects ObjectID=\"f1ac343\" effectStringRep=\"setReturnValue(&quot;TODO: Event.toString()&quot;);\"/>\n" + 
				"          </trAttach>\n" + 
				"        </stateMachine>\n" + 
				"      </ownedOperation>\n" + 
				"    </ownedMemberPackage>\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f5961ed\" name=\"Randomizer\" package=\"//@packages.1\" superClass=\"//@clazz.0\">\n" + 
				"      <ownedAttribute ObjectID=\"f49b547\" name=\"random\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.4\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f13e889\" name=\"USE_GAUSSIAN\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.2\" clazz=\"//@packages.1/@ownedMemberPackage.4\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f66b9ac\" name=\"i\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@packages.1/@ownedMemberPackage.4\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f19d97b\" name=\"prob2Int\" association=\"true\" upper=\"-1\" aggregation=\"composite\" type=\"//@packages.1/@ownedMemberPackage.5\" clazz=\"//@packages.1/@ownedMemberPackage.4\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f41fa4e\" name=\"entry\" association=\"true\" isUnique=\"true\" type=\"//@packages.1/@ownedMemberPackage.5\" clazz=\"//@packages.1/@ownedMemberPackage.4\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f7d11a1\" name=\"r\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.1\" clazz=\"//@packages.1/@ownedMemberPackage.4\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f672a3d\" name=\"x\" isUnique=\"true\" defaultValue=\"&quot;0&quot;\" type=\"//@packages.0/@ownedMemberPackage.1\" clazz=\"//@packages.1/@ownedMemberPackage.4\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f64dcec\" name=\"sumAllProp\" isUnique=\"true\" defaultValue=\"&quot;0&quot;\" type=\"//@packages.0/@ownedMemberPackage.1\" clazz=\"//@packages.1/@ownedMemberPackage.4\"/>\n" + 
				"      <ownedOperation ObjectID=\"f27d00b\" name=\"addProbInt\" clazz=\"//@packages.1/@ownedMemberPackage.4\">\n" + 
				"        <ownedParameter ObjectID=\"f46955f\" name=\"to\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.1\"/>\n" + 
				"        <ownedParameter ObjectID=\"f547076\" name=\"value\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\n" + 
				"        <stateMachine ObjectID=\"f7f9230\" name=\"YStateMachinef7f9230\">\n" + 
				"          <transition ObjectID=\"f16bfc2\" name=\"YTransitionf16bfc2\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.0/@stateMachine/@trAttach.0\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f5ef90\" name=\"YPseudostatef5ef90\" outgoing=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.0/@stateMachine/@transition.0\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f3b08da\" name=\"YFinalStatef3b08da\" incoming=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.0/@stateMachine/@transition.0\"/>\n" + 
				"          <trAttach ObjectID=\"f4c947d\" name=\"YTrAttachmentf4c947d\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.0/@stateMachine/@transition.0\" guardStringRep=\"true;\">\n" + 
				"            <effects ObjectID=\"f46566a\" effectStringRep=\"sumAllProp = sumAllProp + to;\"/>\n" + 
				"            <effects ObjectID=\"f4dc7ba\" effectStringRep=\"prob2Int.add(new Probability2Value);\"/>\n" + 
				"            <effects ObjectID=\"f20b257\" effectStringRep=\"prob2Int.get(prob2Int.size - 1).probabilityUpperLimit = to;\"/>\n" + 
				"            <effects ObjectID=\"f5793d3\" effectStringRep=\"prob2Int.get(prob2Int.size - 1).value = value;\"/>\n" + 
				"          </trAttach>\n" + 
				"        </stateMachine>\n" + 
				"      </ownedOperation>\n" + 
				"      <ownedOperation ObjectID=\"f66c63\" name=\"nextInt\" clazz=\"//@packages.1/@ownedMemberPackage.4\" returnType=\"//@packages.0/@ownedMemberPackage.0\">\n" + 
				"        <stateMachine ObjectID=\"f30aac5\" name=\"YStateMachinef30aac5\">\n" + 
				"          <transition ObjectID=\"f5626fe\" name=\"YTransitionf5626fe\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.2\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@trAttach.0\"/>\n" + 
				"          <transition ObjectID=\"f43cf6d\" name=\"YTransitionf43cf6d\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.2\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@trAttach.1\"/>\n" + 
				"          <transition ObjectID=\"f532d9a\" name=\"YTransitionf532d9a\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.5\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.3\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@trAttach.2\"/>\n" + 
				"          <transition ObjectID=\"f1d935c\" name=\"YTransitionf1d935c\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.4\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.3\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@trAttach.3\"/>\n" + 
				"          <transition ObjectID=\"f7c9630\" name=\"YTransitionf7c9630\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.3\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.4\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@trAttach.4\"/>\n" + 
				"          <transition ObjectID=\"f146bd8\" name=\"YTransitionf146bd8\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.3\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.1\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@trAttach.5\"/>\n" + 
				"          <transition ObjectID=\"f19a4e3\" name=\"YTransitionf19a4e3\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.4\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.1\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@trAttach.6\"/>\n" + 
				"          <transition ObjectID=\"f1440f2\" name=\"YTransitionf1440f2\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.2\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.5\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@trAttach.7\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f311e7\" name=\"YPseudostatef311e7\" outgoing=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.0 //@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.1\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f4ede39\" name=\"YFinalStatef4ede39\" incoming=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.5 //@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.6\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f1c1425\" name=\"YStatef1c1425\" outgoing=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.7\" incoming=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.0 //@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.1\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f6c9142\" name=\"YStatef6c9142\" outgoing=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.4 //@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.5\" incoming=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.2 //@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.3\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f6995d3\" name=\"YStatef6995d3\" outgoing=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.3 //@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.6\" incoming=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.4\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f577f47\" name=\"YStatef577f47\" outgoing=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.2\" incoming=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.7\"/>\n" + 
				"          <trAttach ObjectID=\"f59536\" name=\"YTrAttachmentf59536\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.0\" guardStringRep=\"USE_GAUSSIAN;\">\n" + 
				"            <effects ObjectID=\"f6de5ab\" effectStringRep=\"r = (random as java.util.Random).nextGaussian;\"/>\n" + 
				"          </trAttach>\n" + 
				"          <trAttach ObjectID=\"f70685\" name=\"YTrAttachmentf70685\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.1\" guardStringRep=\"!USE_GAUSSIAN;\">\n" + 
				"            <effects ObjectID=\"f325de1\" effectStringRep=\"r = (random as java.util.Random).nextDouble;\"/>\n" + 
				"          </trAttach>\n" + 
				"          <trAttach ObjectID=\"f2dd09a\" name=\"YTrAttachmentf2dd09a\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.2\" guardStringRep=\"true;\">\n" + 
				"            <effects ObjectID=\"f2050fd\" effectStringRep=\"x = 0;\"/>\n" + 
				"            <effects ObjectID=\"f728e4a\" effectStringRep=\"i = 0;\"/>\n" + 
				"          </trAttach>\n" + 
				"          <trAttach ObjectID=\"f654c2c\" name=\"YTrAttachmentf654c2c\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.3\" guardStringRep=\"r > entry.probabilityUpperLimit + x;\"/>\n" + 
				"          <trAttach ObjectID=\"f177a55\" name=\"YTrAttachmentf177a55\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.4\" guardStringRep=\"i &lt; prob2Int.size;\">\n" + 
				"            <effects ObjectID=\"f2bde0d\" effectStringRep=\"entry = prob2Int.get(i++);\"/>\n" + 
				"            <effects ObjectID=\"f4be425\" effectStringRep=\"x = x + entry.probabilityUpperLimit;\"/>\n" + 
				"          </trAttach>\n" + 
				"          <trAttach ObjectID=\"f34e904\" name=\"YTrAttachmentf34e904\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.5\" guardStringRep=\"i >= prob2Int.size;\">\n" + 
				"            <effects ObjectID=\"f1b61b9\" effectStringRep=\"setReturnValue(0);\"/>\n" + 
				"          </trAttach>\n" + 
				"          <trAttach ObjectID=\"f6e4855\" name=\"YTrAttachmentf6e4855\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.6\" guardStringRep=\"r &lt;= entry.probabilityUpperLimit + x;\">\n" + 
				"            <effects ObjectID=\"f7a9b6f\" effectStringRep=\"setReturnValue(entry.value);\"/>\n" + 
				"          </trAttach>\n" + 
				"          <trAttach ObjectID=\"f7758dd\" name=\"YTrAttachmentf7758dd\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.7\" guardStringRep=\"true;\">\n" + 
				"            <effects ObjectID=\"f5dc2c3\" effectStringRep=\"r = r * sumAllProp;\"/>\n" + 
				"          </trAttach>\n" + 
				"        </stateMachine>\n" + 
				"      </ownedOperation>\n" + 
				"    </ownedMemberPackage>\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f6019cc\" name=\"Probability2Value\" package=\"//@packages.1\" superClass=\"//@clazz.0\">\n" + 
				"      <ownedAttribute ObjectID=\"f5512dc\" name=\"probabilityUpperLimit\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.1\" clazz=\"//@packages.1/@ownedMemberPackage.5\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f6e635c\" name=\"value\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@packages.1/@ownedMemberPackage.5\"/>\n" + 
				"    </ownedMemberPackage>\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f67d23f\" name=\"Delay\" package=\"//@packages.1\" superClass=\"//@clazz.0 //@packages.1/@ownedMemberPackage.3\"/>\n" + 
				"  </packages>\n" + 
				"</yammDiagram:YModel>\n" + 
				"";
	}
	/**
	 * Returns *.yammdiagram content: a Gravel Shipping model.
	 * @return the model as a string.
	 */
	public static String desGravelShippingExample()
	{
		final String GRAVEL_SHIPPING = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" + 
				"<yammDiagram:YModel xmi:version=\"2.0\" xmlns:xmi=\"http://www.omg.org/XMI\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:yammDiagram=\"http://www.yamm.online/coreModelDiagram/YammDiagram\">\n" + 
				"  <clazz ObjectID=\"f5e24a2\" name=\"RObject\">\n" + 
				"    <ownedAttribute ObjectID=\"f2bd771\" name=\"rContainer\" type=\"//@clazz.0\" clazz=\"//@clazz.0\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f55ebef\" name=\"yClass\" type=\"//@packages.0/@ownedMemberPackage.4\" clazz=\"//@clazz.0\"/>\n" + 
				"    <ownedAttribute ObjectID=\"fbb4ab\" name=\"ObjectID\" type=\"//@packages.0/@ownedMemberPackage.3\" clazz=\"//@clazz.0\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f2dc78d\" name=\"filter\" type=\"//@packages.0/@ownedMemberPackage.4\" clazz=\"//@clazz.0\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f5c38a7\" name=\"yammInternal\" type=\"//@packages.0/@ownedMemberPackage.4\" clazz=\"//@clazz.0\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f24f0ed\" name=\"chartView\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.4\" clazz=\"//@clazz.0\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f7f0444\" name=\"tmp\" type=\"//@clazz.0\" clazz=\"//@clazz.0\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f100397\" name=\"var_i\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@clazz.0\"/>\n" + 
				"  </clazz>\n" + 
				"  <clazz ObjectID=\"f4cc70d\" name=\"YClass\" superClass=\"//@clazz.0\"/>\n" + 
				"  <clazz ObjectID=\"f7a6aa2\" name=\"LoadingDock\" superClass=\"//@clazz.0 //@packages.1/@ownedMemberPackage.2\">\n" + 
				"    <ownedAttribute ObjectID=\"f1fa391\" name=\"truckCurrentlyLoaded\" association=\"true\" aggregation=\"composite\" type=\"//@clazz.3\" clazz=\"//@clazz.2\">\n" + 
				"      <ownedElement xsi:type=\"yammDiagram:YParameter\" ObjectID=\"f465861\" name=\"timeStep\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\n" + 
				"    </ownedAttribute>\n" + 
				"    <ownedAttribute ObjectID=\"f6385b0\" name=\"queueLD\" association=\"true\" type=\"//@clazz.14\" clazz=\"//@clazz.2\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f13b814\" name=\"queueWS\" association=\"true\" type=\"//@clazz.5\" clazz=\"//@clazz.2\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f1700ff\" name=\"event\" isUnique=\"true\" type=\"//@packages.1/@ownedMemberPackage.3\" clazz=\"//@clazz.2\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f82aae\" name=\"gravelShipping\" association=\"true\" type=\"//@clazz.12\" clazz=\"//@clazz.2\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f13c7ac\" name=\"loadingTime\" isUnique=\"true\" type=\"//@packages.1/@ownedMemberPackage.4\" clazz=\"//@clazz.2\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f633c1e\" name=\"drivingToWeightStation\" isUnique=\"true\" type=\"//@packages.1/@ownedMemberPackage.4\" clazz=\"//@clazz.2\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f382758\" name=\"loadingWeight\" isUnique=\"true\" type=\"//@packages.1/@ownedMemberPackage.4\" clazz=\"//@clazz.2\"/>\n" + 
				"    <ownedOperation ObjectID=\"f4bd866\" name=\"simulate\" clazz=\"//@clazz.2\" returnType=\"//@packages.0/@ownedMemberPackage.2\">\n" + 
				"      <ownedParameter ObjectID=\"f4779e6\" name=\"timeStep\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\n" + 
				"      <stateMachine ObjectID=\"f5e4242\" name=\"YStateMachinef5e4242\">\n" + 
				"        <transition ObjectID=\"f46769e\" name=\"YTransitionf46769e\" source=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.7\" target=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.0\" attachment=\"//@clazz.2/@ownedOperation.0/@stateMachine/@trAttach.0\"/>\n" + 
				"        <transition ObjectID=\"f7bedb3\" name=\"YTransitionf7bedb3\" source=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@clazz.2/@ownedOperation.0/@stateMachine/@trAttach.1\"/>\n" + 
				"        <transition ObjectID=\"f1ed1a\" name=\"YTransitionf1ed1a\" source=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.1\" target=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.3\" attachment=\"//@clazz.2/@ownedOperation.0/@stateMachine/@trAttach.2\"/>\n" + 
				"        <transition ObjectID=\"f6419b3\" name=\"YTransitionf6419b3\" source=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.7\" target=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.4\" attachment=\"//@clazz.2/@ownedOperation.0/@stateMachine/@trAttach.3\"/>\n" + 
				"        <transition ObjectID=\"f64c486\" name=\"YTransitionf64c486\" source=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.8\" target=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.5\" attachment=\"//@clazz.2/@ownedOperation.0/@stateMachine/@trAttach.4\"/>\n" + 
				"        <transition ObjectID=\"f3c0e8a\" name=\"YTransitionf3c0e8a\" source=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.8\" target=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.3\" attachment=\"//@clazz.2/@ownedOperation.0/@stateMachine/@trAttach.5\"/>\n" + 
				"        <transition ObjectID=\"f16606e\" name=\"YTransitionf16606e\" source=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.4\" attachment=\"//@clazz.2/@ownedOperation.0/@stateMachine/@trAttach.6\"/>\n" + 
				"        <transition ObjectID=\"f40afbb\" name=\"YTransitionf40afbb\" source=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.1\" target=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.5\" attachment=\"//@clazz.2/@ownedOperation.0/@stateMachine/@trAttach.7\"/>\n" + 
				"        <transition ObjectID=\"f50954\" name=\"YTransitionf50954\" source=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.6\" target=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.3\" attachment=\"//@clazz.2/@ownedOperation.0/@stateMachine/@trAttach.8\"/>\n" + 
				"        <transition ObjectID=\"f307286\" name=\"YTransitionf307286\" source=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.5\" target=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.6\" attachment=\"//@clazz.2/@ownedOperation.0/@stateMachine/@trAttach.9\"/>\n" + 
				"        <transition ObjectID=\"f15b739\" name=\"YTransitionf15b739\" source=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.6\" target=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.3\" attachment=\"//@clazz.2/@ownedOperation.0/@stateMachine/@trAttach.10\"/>\n" + 
				"        <transition ObjectID=\"f67d41b\" name=\"YTransitionf67d41b\" source=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.4\" target=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.8\" attachment=\"//@clazz.2/@ownedOperation.0/@stateMachine/@trAttach.11\"/>\n" + 
				"        <transition ObjectID=\"f106128\" name=\"YTransitionf106128\" source=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.4\" target=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.3\" attachment=\"//@clazz.2/@ownedOperation.0/@stateMachine/@trAttach.12\"/>\n" + 
				"        <transition ObjectID=\"f215638\" name=\"YTransitionf215638\" source=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.2\" target=\"//@clazz.2/@ownedOperation.0/@stateMachine/@subvertex.7\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f245daf\" name=\"YStatef245daf\" outgoing=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.1 //@clazz.2/@ownedOperation.0/@stateMachine/@transition.6\" incoming=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.0\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f57dee0\" name=\"YStatef57dee0\" outgoing=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.2 //@clazz.2/@ownedOperation.0/@stateMachine/@transition.7\" incoming=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.1\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f5aa854\" name=\"YPseudostatef5aa854\" outgoing=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.13\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f5763e0\" name=\"YFinalStatef5763e0\" incoming=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.5 //@clazz.2/@ownedOperation.0/@stateMachine/@transition.2 //@clazz.2/@ownedOperation.0/@stateMachine/@transition.10 //@clazz.2/@ownedOperation.0/@stateMachine/@transition.8 //@clazz.2/@ownedOperation.0/@stateMachine/@transition.12\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f40ce60\" name=\"YStatef40ce60\" outgoing=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.11 //@clazz.2/@ownedOperation.0/@stateMachine/@transition.12\" incoming=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.3 //@clazz.2/@ownedOperation.0/@stateMachine/@transition.6\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f44dbe7\" name=\"YStatef44dbe7\" outgoing=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.9\" incoming=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.4 //@clazz.2/@ownedOperation.0/@stateMachine/@transition.7\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f3d8ca9\" name=\"YStatef3d8ca9\" outgoing=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.8 //@clazz.2/@ownedOperation.0/@stateMachine/@transition.10\" incoming=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.9\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f189cbb\" name=\"YStatef189cbb\" outgoing=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.0 //@clazz.2/@ownedOperation.0/@stateMachine/@transition.3\" incoming=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.13\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f1a5dd2\" name=\"YStatef1a5dd2\" outgoing=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.5 //@clazz.2/@ownedOperation.0/@stateMachine/@transition.4\" incoming=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.11\"/>\n" + 
				"        <trAttach ObjectID=\"f740c18\" name=\"YTrAttachmentf740c18\" transition=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.0\" guardStringRep=\"event = DES.EventQueue.peek(timeStep, true, null, this, null); event != null;\"/>\n" + 
				"        <trAttach ObjectID=\"f19bc22\" name=\"YTrAttachmentf19bc22\" transition=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.1\" guardStringRep=\"event instanceof LoadingDone;\"/>\n" + 
				"        <trAttach ObjectID=\"f70b1e2\" name=\"YTrAttachmentf70b1e2\" transition=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.2\" guardStringRep=\"truckCurrentlyLoaded != null;\">\n" + 
				"          <effects ObjectID=\"f176164\" effectStringRep=\"var_i = drivingToWeightStation.nextInt;\"/>\n" + 
				"          <effects ObjectID=\"f54bd7b\" effectStringRep=\"queueWS.addWithDelay(truckCurrentlyLoaded, var_i, timeStep);\"/>\n" + 
				"          <effects ObjectID=\"f344431\" effectStringRep=\"active = false;\"/>\n" + 
				"          <effects ObjectID=\"f7b52a5\" effectStringRep=\"DES.EventQueue.consume(timeStep, true, null, this, null);\"/>\n" + 
				"          <effects ObjectID=\"f3e5c98\" effectStringRep=\"//Print(timeStep + &quot;loading done | &quot; + name);\"/>\n" + 
				"          <effects ObjectID=\"f7a8af3\" effectStringRep=\"setReturnValue(true);\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f5307e9\" name=\"YTrAttachmentf5307e9\" transition=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.3\" guardStringRep=\"DES.EventQueue.peek(timeStep, true, null, this, null) == null;\"/>\n" + 
				"        <trAttach ObjectID=\"f6a7c8e\" name=\"YTrAttachmentf6a7c8e\" transition=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.4\" guardStringRep=\"truckCurrentlyLoaded == null;\"/>\n" + 
				"        <trAttach ObjectID=\"f2457fc\" name=\"YTrAttachmentf2457fc\" transition=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.5\" guardStringRep=\"truckCurrentlyLoaded != null;\">\n" + 
				"          <effects ObjectID=\"f3256d2\" effectStringRep=\"setReturnValue(false);\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f5589a8\" name=\"YTrAttachmentf5589a8\" transition=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.6\" guardStringRep=\"!(event instanceof LoadingDone);\">\n" + 
				"          <effects ObjectID=\"f22871d\" effectStringRep=\"setReturnValue(false);\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f1da764\" name=\"YTrAttachmentf1da764\" transition=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.7\" guardStringRep=\"truckCurrentlyLoaded == null;\"/>\n" + 
				"        <trAttach ObjectID=\"f576ac0\" name=\"YTrAttachmentf576ac0\" transition=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.8\" guardStringRep=\"tmp != null;\">\n" + 
				"          <effects ObjectID=\"f40b34c\" effectStringRep=\"queueLD.consume(filter);\"/>\n" + 
				"          <effects ObjectID=\"f57c36e\" effectStringRep=\"truckCurrentlyLoaded = tmp as Truck;\"/>\n" + 
				"          <effects ObjectID=\"f19d048\" effectStringRep=\"active = true;\"/>\n" + 
				"          <effects ObjectID=\"f2727c4\" effectStringRep=\"var_i = loadingWeight.nextInt;\"/>\n" + 
				"          <effects ObjectID=\"f14979f\" effectStringRep=\"var_i = Math.min(var_i, gravelShipping._gravelToShip);\"/>\n" + 
				"          <effects ObjectID=\"f5449dd\" effectStringRep=\"truckCurrentlyLoaded.load(var_i);\"/>\n" + 
				"          <effects ObjectID=\"f1454f3\" effectStringRep=\"gravelShipping._gravelToShip = gravelShipping._gravelToShip - truckCurrentlyLoaded.loadedWithTons;\"/>\n" + 
				"          <effects ObjectID=\"f5758ff\" effectStringRep=\"//Print(timeStep + &quot;loading | &quot; + name);\"/>\n" + 
				"          <effects ObjectID=\"f26bda9\" effectStringRep=\"event = new LoadingDone;\"/>\n" + 
				"          <effects ObjectID=\"f62fb4a\" effectStringRep=\"var_i = loadingTime.nextInt;\"/>\n" + 
				"          <effects ObjectID=\"f66c878\" effectStringRep=\"event.timeStep = timeStep + var_i;\"/>\n" + 
				"          <effects ObjectID=\"f8e13a\" effectStringRep=\"event.receivingObject = this;\"/>\n" + 
				"          <effects ObjectID=\"f78a26c\" effectStringRep=\"setReturnValue(true);\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f65f226\" name=\"YTrAttachmentf65f226\" transition=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.9\" guardStringRep=\"true;\">\n" + 
				"          <effects ObjectID=\"f9d690\" effectStringRep=\"filter = new java.util.HashMap&lt;String, Object>;\"/>\n" + 
				"          <effects ObjectID=\"f550b59\" effectStringRep=\"(filter as java.util.Map).put(&quot;truckActive&quot;, true);\"/>\n" + 
				"          <effects ObjectID=\"f44667\" effectStringRep=\"tmp = queueLD.peek(filter) as Truck;\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f2240d4\" name=\"YTrAttachmentf2240d4\" transition=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.10\" guardStringRep=\"tmp == null;\">\n" + 
				"          <effects ObjectID=\"f534032\" effectStringRep=\"setReturnValue(false);\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f2f5a6f\" name=\"YTrAttachmentf2f5a6f\" transition=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.11\" guardStringRep=\"gravelShipping._gravelToShip > 0;\">\n" + 
				"          <effects ObjectID=\"f3000c\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f353006\" name=\"YTrAttachmentf353006\" transition=\"//@clazz.2/@ownedOperation.0/@stateMachine/@transition.12\" guardStringRep=\"gravelShipping._gravelToShip &lt;= 0;\">\n" + 
				"          <effects ObjectID=\"f49511a\" effectStringRep=\"setReturnValue(false);\"/>\n" + 
				"        </trAttach>\n" + 
				"      </stateMachine>\n" + 
				"    </ownedOperation>\n" + 
				"    <ownedOperation ObjectID=\"f723ef1\" name=\"LoadingDock\" clazz=\"//@clazz.2\">\n" + 
				"      <ownedParameter ObjectID=\"f610b02\" name=\"random\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.4\"/>\n" + 
				"      <ownedParameter ObjectID=\"f7a3405\" name=\"_name\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.3\"/>\n" + 
				"      <stateMachine ObjectID=\"fa7779\" name=\"YStateMachinefa7779\">\n" + 
				"        <transition ObjectID=\"f6d9c55\" name=\"YTransitionf6d9c55\" source=\"//@clazz.2/@ownedOperation.1/@stateMachine/@subvertex.0\" target=\"//@clazz.2/@ownedOperation.1/@stateMachine/@subvertex.1\" attachment=\"//@clazz.2/@ownedOperation.1/@stateMachine/@trAttach.0\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f679b22\" name=\"YPseudostatef679b22\" outgoing=\"//@clazz.2/@ownedOperation.1/@stateMachine/@transition.0\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"ffc3\" name=\"YFinalStateffc3\" incoming=\"//@clazz.2/@ownedOperation.1/@stateMachine/@transition.0\"/>\n" + 
				"        <trAttach ObjectID=\"f53a54d\" name=\"YTrAttachmentf53a54d\" transition=\"//@clazz.2/@ownedOperation.1/@stateMachine/@transition.0\" guardStringRep=\"true;\">\n" + 
				"          <effects ObjectID=\"f32acb5\" effectStringRep=\"\"/>\n" + 
				"          <effects ObjectID=\"f4f2167\" effectStringRep=\"name = _name;\"/>\n" + 
				"          <effects ObjectID=\"f2d62f\" effectStringRep=\"loadingWeight = new DES.Randomizer;\"/>\n" + 
				"          <effects ObjectID=\"f188834\" effectStringRep=\"loadingWeight.random = random;\"/>\n" + 
				"          <effects ObjectID=\"f3b827e\" effectStringRep=\"loadingWeight.addProbInt(0.3, 40);\"/>\n" + 
				"          <effects ObjectID=\"f643418\" effectStringRep=\"loadingWeight.addProbInt(0.6, 50);\"/>\n" + 
				"          <effects ObjectID=\"f654b24\" effectStringRep=\"loadingWeight.addProbInt(1.0, 60);\"/>\n" + 
				"          <effects ObjectID=\"ffedeb\" effectStringRep=\"loadingTime = new DES.Randomizer;\"/>\n" + 
				"          <effects ObjectID=\"f7441d7\" effectStringRep=\"loadingTime.random = random;\"/>\n" + 
				"          <effects ObjectID=\"f24b9ed\" effectStringRep=\"loadingTime.addProbInt(1.0, 60);\"/>\n" + 
				"          <effects ObjectID=\"f775da6\" effectStringRep=\"loadingTime.addProbInt(1.0, 10);\"/>\n" + 
				"          <effects ObjectID=\"f36b5a6\" effectStringRep=\"loadingTime.addProbInt(1.0, 40);\"/>\n" + 
				"          <effects ObjectID=\"f100878\" effectStringRep=\"loadingTime.addProbInt(1.0, 100);\"/>\n" + 
				"          <effects ObjectID=\"f9ceac\" effectStringRep=\"loadingTime.addProbInt(1.0, 140);\"/>\n" + 
				"          <effects ObjectID=\"f59ee7a\" effectStringRep=\"loadingTime.addProbInt(1.0, 180);\"/>\n" + 
				"          <effects ObjectID=\"f6a2fc4\" effectStringRep=\"drivingToWeightStation = new DES.Randomizer;\"/>\n" + 
				"          <effects ObjectID=\"f26a6d2\" effectStringRep=\"drivingToWeightStation.random = random;\"/>\n" + 
				"          <effects ObjectID=\"f7222c\" effectStringRep=\"drivingToWeightStation.addProbInt(0.5, 30);\"/>\n" + 
				"          <effects ObjectID=\"f43f5df\" effectStringRep=\"drivingToWeightStation.addProbInt(0.78, 45);\"/>\n" + 
				"          <effects ObjectID=\"f55753f\" effectStringRep=\"drivingToWeightStation.addProbInt(1.0, 60);\"/>\n" + 
				"        </trAttach>\n" + 
				"      </stateMachine>\n" + 
				"    </ownedOperation>\n" + 
				"  </clazz>\n" + 
				"  <clazz ObjectID=\"f1d4f09\" name=\"Truck\" superClass=\"//@clazz.0 //@packages.1/@ownedMemberPackage.2\">\n" + 
				"    <ownedAttribute ObjectID=\"f75186f\" name=\"loadedWithTons\" isUnique=\"true\" defaultValue=\"&quot;0&quot;\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@clazz.3\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f2079c5\" name=\"truckActive\" isUnique=\"true\" defaultValue=\"&quot;true&quot;\" type=\"//@packages.0/@ownedMemberPackage.2\" clazz=\"//@clazz.3\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f17dd31\" name=\"reactivationTime\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@clazz.3\"/>\n" + 
				"    <ownedAttribute ObjectID=\"fa2967\" name=\"event\" isUnique=\"true\" type=\"//@packages.1/@ownedMemberPackage.3\" clazz=\"//@clazz.3\"/>\n" + 
				"    <ownedAttribute ObjectID=\"fbed9f\" name=\"repairServiceCalled\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.2\" clazz=\"//@clazz.3\"/>\n" + 
				"    <ownedOperation ObjectID=\"f1232b0\" name=\"simulate\" clazz=\"//@clazz.3\" returnType=\"//@packages.0/@ownedMemberPackage.2\">\n" + 
				"      <ownedParameter ObjectID=\"f772978\" name=\"timeStep\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\n" + 
				"      <stateMachine ObjectID=\"f6850cf\" name=\"YStateMachinef6850cf\">\n" + 
				"        <transition ObjectID=\"f76e692\" name=\"YTransitionf76e692\" source=\"//@clazz.3/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@clazz.3/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@clazz.3/@ownedOperation.0/@stateMachine/@trAttach.0\"/>\n" + 
				"        <transition ObjectID=\"f72b18\" name=\"YTransitionf72b18\" source=\"//@clazz.3/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@clazz.3/@ownedOperation.0/@stateMachine/@subvertex.2\" attachment=\"//@clazz.3/@ownedOperation.0/@stateMachine/@trAttach.1\"/>\n" + 
				"        <transition ObjectID=\"f71240c\" name=\"YTransitionf71240c\" source=\"//@clazz.3/@ownedOperation.0/@stateMachine/@subvertex.2\" target=\"//@clazz.3/@ownedOperation.0/@stateMachine/@subvertex.3\" attachment=\"//@clazz.3/@ownedOperation.0/@stateMachine/@trAttach.2\"/>\n" + 
				"        <transition ObjectID=\"f721135\" name=\"YTransitionf721135\" source=\"//@clazz.3/@ownedOperation.0/@stateMachine/@subvertex.2\" target=\"//@clazz.3/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@clazz.3/@ownedOperation.0/@stateMachine/@trAttach.3\"/>\n" + 
				"        <transition ObjectID=\"f19ee07\" name=\"YTransitionf19ee07\" source=\"//@clazz.3/@ownedOperation.0/@stateMachine/@subvertex.2\" target=\"//@clazz.3/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@clazz.3/@ownedOperation.0/@stateMachine/@trAttach.4\"/>\n" + 
				"        <transition ObjectID=\"f52582e\" name=\"YTransitionf52582e\" source=\"//@clazz.3/@ownedOperation.0/@stateMachine/@subvertex.3\" target=\"//@clazz.3/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@clazz.3/@ownedOperation.0/@stateMachine/@trAttach.5\"/>\n" + 
				"        <transition ObjectID=\"f6bac85\" name=\"YTransitionf6bac85\" source=\"//@clazz.3/@ownedOperation.0/@stateMachine/@subvertex.3\" target=\"//@clazz.3/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@clazz.3/@ownedOperation.0/@stateMachine/@trAttach.6\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f1741d6\" name=\"YPseudostatef1741d6\" outgoing=\"//@clazz.3/@ownedOperation.0/@stateMachine/@transition.0 //@clazz.3/@ownedOperation.0/@stateMachine/@transition.1\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f350bc9\" name=\"YFinalStatef350bc9\" incoming=\"//@clazz.3/@ownedOperation.0/@stateMachine/@transition.0 //@clazz.3/@ownedOperation.0/@stateMachine/@transition.4 //@clazz.3/@ownedOperation.0/@stateMachine/@transition.3 //@clazz.3/@ownedOperation.0/@stateMachine/@transition.6 //@clazz.3/@ownedOperation.0/@stateMachine/@transition.5\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f613a2a\" name=\"YStatef613a2a\" outgoing=\"//@clazz.3/@ownedOperation.0/@stateMachine/@transition.2 //@clazz.3/@ownedOperation.0/@stateMachine/@transition.3 //@clazz.3/@ownedOperation.0/@stateMachine/@transition.4\" incoming=\"//@clazz.3/@ownedOperation.0/@stateMachine/@transition.1\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f4e0cb1\" name=\"YStatef4e0cb1\" outgoing=\"//@clazz.3/@ownedOperation.0/@stateMachine/@transition.5 //@clazz.3/@ownedOperation.0/@stateMachine/@transition.6\" incoming=\"//@clazz.3/@ownedOperation.0/@stateMachine/@transition.2\"/>\n" + 
				"        <trAttach ObjectID=\"f6d2dd6\" name=\"TrAttachmentf6d2dd6\" transition=\"//@clazz.3/@ownedOperation.0/@stateMachine/@transition.0\" guardStringRep=\"DES.EventQueue.peek(timeStep, true, null, this, null) == null;\">\n" + 
				"          <effects ObjectID=\"f29a661\" effectStringRep=\"setReturnValue(false);\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f564bc1\" name=\"YTrAttachmentf564bc1\" transition=\"//@clazz.3/@ownedOperation.0/@stateMachine/@transition.1\" guardStringRep=\"DES.EventQueue.peek(timeStep, true, null, this, null) != null;\">\n" + 
				"          <effects ObjectID=\"f16b344\" effectStringRep=\"event = DES.EventQueue.peek(timeStep, true, null, this, null);\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f3849c5\" name=\"YTrAttachmentf3849c5\" transition=\"//@clazz.3/@ownedOperation.0/@stateMachine/@transition.2\" guardStringRep=\"event instanceof DeactivateTruck;\">\n" + 
				"          <effects ObjectID=\"f1f1fa2\" effectStringRep=\"truckActive = false;\"/>\n" + 
				"          <effects ObjectID=\"fe6220\" effectStringRep=\"DES.EventQueue.consume(timeStep, true, null, this, null);\"/>\n" + 
				"          <effects ObjectID=\"f48540a\" effectStringRep=\"setReturnValue(true);\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f5f0188\" name=\"YTrAttachmentf5f0188\" transition=\"//@clazz.3/@ownedOperation.0/@stateMachine/@transition.3\" guardStringRep=\"event instanceof ActivateTruck;\">\n" + 
				"          <effects ObjectID=\"f45962e\" effectStringRep=\"truckActive = true;\"/>\n" + 
				"          <effects ObjectID=\"f6c60b9\" effectStringRep=\"DES.EventQueue.consume(timeStep, true, null, this, null);\"/>\n" + 
				"          <effects ObjectID=\"f2ec388\" effectStringRep=\"repairServiceCalled = false;\"/>\n" + 
				"          <effects ObjectID=\"fd87dd\" effectStringRep=\"setReturnValue(true);\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f4ffe9e\" name=\"YTrAttachmentf4ffe9e\" transition=\"//@clazz.3/@ownedOperation.0/@stateMachine/@transition.4\" guardStringRep=\"!(event instanceof ActivateTruck || event instanceof DeactivateTruck);\">\n" + 
				"          <effects ObjectID=\"f37b68d\" effectStringRep=\"setReturnValue(false);\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f3f34a8\" name=\"YTrAttachmentf3f34a8\" transition=\"//@clazz.3/@ownedOperation.0/@stateMachine/@transition.5\" guardStringRep=\"repairServiceCalled;\"/>\n" + 
				"        <trAttach ObjectID=\"f19e899\" name=\"YTrAttachmentf19e899\" transition=\"//@clazz.3/@ownedOperation.0/@stateMachine/@transition.6\" guardStringRep=\"!repairServiceCalled;\">\n" + 
				"          <effects ObjectID=\"fd7803\" effectStringRep=\"event = new RequireRepairService;\"/>\n" + 
				"          <effects ObjectID=\"f3b16a7\" effectStringRep=\"event.objectAttached = this;\"/>\n" + 
				"          <effects ObjectID=\"f18d5b8\" effectStringRep=\"event.timeStep = timeStep + 5;\"/>\n" + 
				"          <effects ObjectID=\"f460bf9\" effectStringRep=\"event.receivingType = Service.yClass as YClass;\"/>\n" + 
				"          <effects ObjectID=\"f142f55\" effectStringRep=\"repairServiceCalled = true;\"/>\n" + 
				"        </trAttach>\n" + 
				"      </stateMachine>\n" + 
				"    </ownedOperation>\n" + 
				"    <ownedOperation ObjectID=\"f69f581\" name=\"load\" clazz=\"//@clazz.3\">\n" + 
				"      <ownedParameter ObjectID=\"f79df89\" name=\"gravelToLoad\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\n" + 
				"      <stateMachine ObjectID=\"fb5dc4\" name=\"YStateMachinefb5dc4\">\n" + 
				"        <transition ObjectID=\"f2dd4d4\" name=\"YTransitionf2dd4d4\" source=\"//@clazz.3/@ownedOperation.1/@stateMachine/@subvertex.0\" target=\"//@clazz.3/@ownedOperation.1/@stateMachine/@subvertex.1\" attachment=\"//@clazz.3/@ownedOperation.1/@stateMachine/@trAttach.0\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f2d3725\" name=\"YPseudostatef2d3725\" outgoing=\"//@clazz.3/@ownedOperation.1/@stateMachine/@transition.0\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f66ec54\" name=\"YFinalStatef66ec54\" incoming=\"//@clazz.3/@ownedOperation.1/@stateMachine/@transition.0\"/>\n" + 
				"        <trAttach ObjectID=\"f447c5e\" name=\"YTrAttachmentf447c5e\" transition=\"//@clazz.3/@ownedOperation.1/@stateMachine/@transition.0\" guardStringRep=\"true;\">\n" + 
				"          <effects ObjectID=\"fe019b\" effectStringRep=\"loadedWithTons = gravelToLoad;\"/>\n" + 
				"        </trAttach>\n" + 
				"      </stateMachine>\n" + 
				"    </ownedOperation>\n" + 
				"  </clazz>\n" + 
				"  <clazz ObjectID=\"f4bda1a\" name=\"DeactivateTruck\" superClass=\"//@clazz.0 //@packages.1/@ownedMemberPackage.3\"/>\n" + 
				"  <clazz ObjectID=\"f4d09ab\" name=\"WeighingStationQueue\" superClass=\"//@clazz.0 //@packages.1/@ownedMemberPackage.1\" observeQueue=\"true\">\n" + 
				"    <ownedAttribute ObjectID=\"f6a1d0c\" name=\"type\" isUnique=\"true\" type=\"//@clazz.3\" clazz=\"//@clazz.5\"/>\n" + 
				"    <ownedOperation ObjectID=\"f75d782\" name=\"WeighingStationQueue\" clazz=\"//@clazz.5\">\n" + 
				"      <stateMachine ObjectID=\"f6bc09b\" name=\"YStateMachinef6bc09b\">\n" + 
				"        <transition ObjectID=\"f90f29\" name=\"YTransitionfc448c\" source=\"//@clazz.5/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@clazz.5/@ownedOperation.0/@stateMachine/@subvertex.1\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f756e1a\" name=\"YPseudostatef28bab9\" outgoing=\"//@clazz.5/@ownedOperation.0/@stateMachine/@transition.0\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f3c64e5\" name=\"YFinalStatef2d52ea\" incoming=\"//@clazz.5/@ownedOperation.0/@stateMachine/@transition.0\"/>\n" + 
				"        <trAttach ObjectID=\"f5310d2\" name=\"YTrAttachmentf609325\" guardStringRep=\"true;\">\n" + 
				"          <effects ObjectID=\"f23277e\" effectStringRep=\"chartView = new online.yamm.util.YammChartView(&quot;QueueWeighingStation&quot;);\"/>\n" + 
				"          <effects ObjectID=\"f261d9f\" effectStringRep=\"(chartView as online.yamm.util.YammChartView).addChart(yammInternal as org.eclipse.emf.ecore.EObject, &quot;simulationTime&quot;, &quot;time&quot;, this, &quot;queue&quot;, &quot;queueWS&quot;);\"/>\n" + 
				"          <effects ObjectID=\"f1ee59c\" effectStringRep=\"(chartView as online.yamm.util.YammChartView).addChart(yammInternal as org.eclipse.emf.ecore.EObject, &quot;simulationTime&quot;, &quot;time&quot;, this, &quot;delayed&quot;, &quot;delayed&quot;);\"/>\n" + 
				"          <effects ObjectID=\"f3d4bbb\" effectStringRep=\"(chartView as online.yamm.util.YammChartView).showCharts;\"/>\n" + 
				"        </trAttach>\n" + 
				"      </stateMachine>\n" + 
				"    </ownedOperation>\n" + 
				"  </clazz>\n" + 
				"  <clazz ObjectID=\"f799f86\" name=\"ActivateTruck\" superClass=\"//@clazz.0 //@packages.1/@ownedMemberPackage.3\"/>\n" + 
				"  <clazz ObjectID=\"f75d544\" name=\"RequireRepairService\" superClass=\"//@clazz.0 //@packages.1/@ownedMemberPackage.3\"/>\n" + 
				"  <clazz ObjectID=\"f423975\" name=\"Service\" superClass=\"//@clazz.0 //@packages.1/@ownedMemberPackage.2\">\n" + 
				"    <ownedAttribute ObjectID=\"fcf456\" name=\"event\" isUnique=\"true\" type=\"//@packages.1/@ownedMemberPackage.3\" clazz=\"//@clazz.8\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f4acffe\" name=\"newEvent\" isUnique=\"true\" type=\"//@packages.1/@ownedMemberPackage.3\" clazz=\"//@clazz.8\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f4729a6\" name=\"repairTime\" isUnique=\"true\" defaultValue=\"&quot;10&quot;\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@clazz.8\"/>\n" + 
				"    <ownedOperation ObjectID=\"f1855c7\" name=\"simulate\" clazz=\"//@clazz.8\" returnType=\"//@packages.0/@ownedMemberPackage.2\">\n" + 
				"      <ownedParameter ObjectID=\"f160012\" name=\"timeStep\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\n" + 
				"      <stateMachine ObjectID=\"f57f0d2\" name=\"YStateMachinef57f0d2\">\n" + 
				"        <transition ObjectID=\"f778069\" name=\"YTransitionf778069\" source=\"//@clazz.8/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@clazz.8/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@clazz.8/@ownedOperation.0/@stateMachine/@trAttach.0\"/>\n" + 
				"        <transition ObjectID=\"f73c4c\" name=\"YTransitionf73c4c\" source=\"//@clazz.8/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@clazz.8/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@clazz.8/@ownedOperation.0/@stateMachine/@trAttach.1\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f201e75\" name=\"YPseudostatef201e75\" outgoing=\"//@clazz.8/@ownedOperation.0/@stateMachine/@transition.0 //@clazz.8/@ownedOperation.0/@stateMachine/@transition.1\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"fc0fb2\" name=\"YFinalStatefc0fb2\" incoming=\"//@clazz.8/@ownedOperation.0/@stateMachine/@transition.1 //@clazz.8/@ownedOperation.0/@stateMachine/@transition.0\"/>\n" + 
				"        <trAttach ObjectID=\"fe37c4\" name=\"YTrAttachmentfe37c4\" transition=\"//@clazz.8/@ownedOperation.0/@stateMachine/@transition.0\" guardStringRep=\"DES.EventQueue.peek(timeStep, true, RequireRepairService.yClass as YClass, null, Service.yClass as YClass) != null;\">\n" + 
				"          <effects ObjectID=\"f6190b4\" effectStringRep=\"event = DES.EventQueue.consume(timeStep, true, RequireRepairService.yClass as YClass, null, Service.yClass as YClass);\"/>\n" + 
				"          <effects ObjectID=\"fec81b\" effectStringRep=\"newEvent = new ActivateTruck;\"/>\n" + 
				"          <effects ObjectID=\"f4afe6d\" effectStringRep=\"newEvent.receivingObject = event.objectAttached; \"/>\n" + 
				"          <effects ObjectID=\"f1bf0a9\" effectStringRep=\"newEvent.receivingType = Truck.yClass as YClass;\"/>\n" + 
				"          <effects ObjectID=\"f3e914e\" effectStringRep=\"newEvent.timeStep = timeStep + repairTime;\"/>\n" + 
				"          <effects ObjectID=\"f3c599a\" effectStringRep=\"setReturnValue(true);\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f2f54ca\" name=\"YTrAttachmentf2f54ca\" transition=\"//@clazz.8/@ownedOperation.0/@stateMachine/@transition.1\" guardStringRep=\"DES.EventQueue.peek(timeStep, true, RequireRepairService.yClass as YClass, null, Service.yClass as YClass) == null;\">\n" + 
				"          <effects ObjectID=\"f263c9a\" effectStringRep=\"setReturnValue(false);\"/>\n" + 
				"        </trAttach>\n" + 
				"      </stateMachine>\n" + 
				"    </ownedOperation>\n" + 
				"  </clazz>\n" + 
				"  <clazz ObjectID=\"f642b36\" name=\"LoadingDone\" superClass=\"//@clazz.0 //@packages.1/@ownedMemberPackage.3\"/>\n" + 
				"  <clazz ObjectID=\"f31253\" name=\"WeighingStation\" superClass=\"//@clazz.0 //@packages.1/@ownedMemberPackage.2\">\n" + 
				"    <ownedAttribute ObjectID=\"f7428ba\" name=\"truckCurrentlyWeighed\" association=\"true\" isUnique=\"true\" aggregation=\"composite\" type=\"//@clazz.3\" clazz=\"//@clazz.10\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f717202\" name=\"event\" isUnique=\"true\" type=\"//@packages.1/@ownedMemberPackage.3\" clazz=\"//@clazz.10\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f702a03\" name=\"queueWS\" association=\"true\" isUnique=\"true\" type=\"//@clazz.5\" clazz=\"//@clazz.10\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f68b2e6\" name=\"queueLD\" association=\"true\" isUnique=\"true\" type=\"//@clazz.14\" clazz=\"//@clazz.10\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f640b0c\" name=\"gravelShipping\" association=\"true\" type=\"//@clazz.12\" clazz=\"//@clazz.10\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f45e98e\" name=\"drivingToUnloadDock\" isUnique=\"true\" type=\"//@packages.1/@ownedMemberPackage.4\" clazz=\"//@clazz.10\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f2a583b\" name=\"drivingToLoadingDock\" isUnique=\"true\" type=\"//@packages.1/@ownedMemberPackage.4\" clazz=\"//@clazz.10\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f203df2\" name=\"MAX_LOAD\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@clazz.10\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f2caf9e\" name=\"weighingTime\" isUnique=\"true\" type=\"//@packages.1/@ownedMemberPackage.4\" clazz=\"//@clazz.10\"/>\n" + 
				"    <ownedOperation ObjectID=\"fa20ed\" name=\"simulate\" clazz=\"//@clazz.10\" returnType=\"//@packages.0/@ownedMemberPackage.2\">\n" + 
				"      <ownedParameter ObjectID=\"f31ca67\" name=\"timeStep\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\n" + 
				"      <stateMachine ObjectID=\"f27ad63\" name=\"YStateMachinef27ad63\">\n" + 
				"        <transition ObjectID=\"f59ee79\" name=\"YTransitionf46769e\" source=\"//@clazz.10/@ownedOperation.0/@stateMachine/@subvertex.2\" target=\"//@clazz.10/@ownedOperation.0/@stateMachine/@subvertex.0\" attachment=\"//@clazz.10/@ownedOperation.0/@stateMachine/@trAttach.0\"/>\n" + 
				"        <transition ObjectID=\"f54af63\" name=\"YTransitionf7bedb3\" source=\"//@clazz.10/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@clazz.10/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@clazz.10/@ownedOperation.0/@stateMachine/@trAttach.1\"/>\n" + 
				"        <transition ObjectID=\"f363bd8\" name=\"YTransitionf1ed1a\" source=\"//@clazz.10/@ownedOperation.0/@stateMachine/@subvertex.1\" target=\"//@clazz.10/@ownedOperation.0/@stateMachine/@subvertex.3\" attachment=\"//@clazz.10/@ownedOperation.0/@stateMachine/@trAttach.2\"/>\n" + 
				"        <transition ObjectID=\"f7ac604\" name=\"YTransitionf6419b3\" source=\"//@clazz.10/@ownedOperation.0/@stateMachine/@subvertex.2\" target=\"//@clazz.10/@ownedOperation.0/@stateMachine/@subvertex.4\" attachment=\"//@clazz.10/@ownedOperation.0/@stateMachine/@trAttach.3\"/>\n" + 
				"        <transition ObjectID=\"f50cfa9\" name=\"YTransitionf64c486\" source=\"//@clazz.10/@ownedOperation.0/@stateMachine/@subvertex.4\" target=\"//@clazz.10/@ownedOperation.0/@stateMachine/@subvertex.5\" attachment=\"//@clazz.10/@ownedOperation.0/@stateMachine/@trAttach.4\"/>\n" + 
				"        <transition ObjectID=\"f7f553d\" name=\"YTransitionf3c0e8a\" source=\"//@clazz.10/@ownedOperation.0/@stateMachine/@subvertex.4\" target=\"//@clazz.10/@ownedOperation.0/@stateMachine/@subvertex.3\" attachment=\"//@clazz.10/@ownedOperation.0/@stateMachine/@trAttach.5\"/>\n" + 
				"        <transition ObjectID=\"f1746e9\" name=\"YTransitionf16606e\" source=\"//@clazz.10/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@clazz.10/@ownedOperation.0/@stateMachine/@subvertex.4\" attachment=\"//@clazz.10/@ownedOperation.0/@stateMachine/@trAttach.6\"/>\n" + 
				"        <transition ObjectID=\"f5deb88\" name=\"YTransitionf40afbb\" source=\"//@clazz.10/@ownedOperation.0/@stateMachine/@subvertex.1\" target=\"//@clazz.10/@ownedOperation.0/@stateMachine/@subvertex.5\" attachment=\"//@clazz.10/@ownedOperation.0/@stateMachine/@trAttach.7\"/>\n" + 
				"        <transition ObjectID=\"f70431f\" name=\"YTransitionf50954\" source=\"//@clazz.10/@ownedOperation.0/@stateMachine/@subvertex.6\" target=\"//@clazz.10/@ownedOperation.0/@stateMachine/@subvertex.3\" attachment=\"//@clazz.10/@ownedOperation.0/@stateMachine/@trAttach.8\"/>\n" + 
				"        <transition ObjectID=\"f2629f8\" name=\"YTransitionf307286\" source=\"//@clazz.10/@ownedOperation.0/@stateMachine/@subvertex.5\" target=\"//@clazz.10/@ownedOperation.0/@stateMachine/@subvertex.6\" attachment=\"//@clazz.10/@ownedOperation.0/@stateMachine/@trAttach.9\"/>\n" + 
				"        <transition ObjectID=\"f680cc\" name=\"YTransitionf15b739\" source=\"//@clazz.10/@ownedOperation.0/@stateMachine/@subvertex.6\" target=\"//@clazz.10/@ownedOperation.0/@stateMachine/@subvertex.3\" attachment=\"//@clazz.10/@ownedOperation.0/@stateMachine/@trAttach.10\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f7af5a\" name=\"YStatef245daf\" outgoing=\"//@clazz.10/@ownedOperation.0/@stateMachine/@transition.1 //@clazz.10/@ownedOperation.0/@stateMachine/@transition.6\" incoming=\"//@clazz.10/@ownedOperation.0/@stateMachine/@transition.0\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f6ffe5c\" name=\"YStatef57dee0\" outgoing=\"//@clazz.10/@ownedOperation.0/@stateMachine/@transition.2 //@clazz.10/@ownedOperation.0/@stateMachine/@transition.7\" incoming=\"//@clazz.10/@ownedOperation.0/@stateMachine/@transition.1\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f67fe1\" name=\"YPseudostatef5aa854\" outgoing=\"//@clazz.10/@ownedOperation.0/@stateMachine/@transition.3 //@clazz.10/@ownedOperation.0/@stateMachine/@transition.0\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f61e5c\" name=\"YFinalStatef5763e0\" incoming=\"//@clazz.10/@ownedOperation.0/@stateMachine/@transition.5 //@clazz.10/@ownedOperation.0/@stateMachine/@transition.2 //@clazz.10/@ownedOperation.0/@stateMachine/@transition.10 //@clazz.10/@ownedOperation.0/@stateMachine/@transition.8\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f7b1f9a\" name=\"YStatef40ce60\" outgoing=\"//@clazz.10/@ownedOperation.0/@stateMachine/@transition.4 //@clazz.10/@ownedOperation.0/@stateMachine/@transition.5\" incoming=\"//@clazz.10/@ownedOperation.0/@stateMachine/@transition.3 //@clazz.10/@ownedOperation.0/@stateMachine/@transition.6\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f661fc4\" name=\"YStatef44dbe7\" outgoing=\"//@clazz.10/@ownedOperation.0/@stateMachine/@transition.9\" incoming=\"//@clazz.10/@ownedOperation.0/@stateMachine/@transition.4 //@clazz.10/@ownedOperation.0/@stateMachine/@transition.7\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f1f1641\" name=\"YStatef3d8ca9\" outgoing=\"//@clazz.10/@ownedOperation.0/@stateMachine/@transition.8 //@clazz.10/@ownedOperation.0/@stateMachine/@transition.10\" incoming=\"//@clazz.10/@ownedOperation.0/@stateMachine/@transition.9\"/>\n" + 
				"        <trAttach ObjectID=\"f6b1e62\" name=\"YTrAttachmentf740c18\" transition=\"//@clazz.10/@ownedOperation.0/@stateMachine/@transition.0\" guardStringRep=\"event = DES.EventQueue.peek(timeStep, true, null, this, null); event != null;\"/>\n" + 
				"        <trAttach ObjectID=\"f6c5480\" name=\"YTrAttachmentf19bc22\" transition=\"//@clazz.10/@ownedOperation.0/@stateMachine/@transition.1\" guardStringRep=\"event instanceof WeighingDone;\"/>\n" + 
				"        <trAttach ObjectID=\"f74f3b6\" name=\"YTrAttachmentf70b1e2\" transition=\"//@clazz.10/@ownedOperation.0/@stateMachine/@transition.2\" guardStringRep=\"truckCurrentlyWeighed != null;\">\n" + 
				"          <effects ObjectID=\"f7c5e0e\" effectStringRep=\"truckCurrentlyWeighed.loadedWithTons = 0;\"/>\n" + 
				"          <effects ObjectID=\"f589f3b\" effectStringRep=\"var_i = drivingToLoadingDock.nextInt;\"/>\n" + 
				"          <effects ObjectID=\"f5946f9\" effectStringRep=\"queueLD.addWithDelay(truckCurrentlyWeighed, var_i, timeStep);\"/>\n" + 
				"          <effects ObjectID=\"f242248\" effectStringRep=\"//Print(timeStep + &quot;weighing done | &quot; + name);\"/>\n" + 
				"          <effects ObjectID=\"f4155e3\" effectStringRep=\"DES.EventQueue.consume(timeStep, true, null, this, null);\"/>\n" + 
				"          <effects ObjectID=\"f4dabb3\" effectStringRep=\"active = false;\"/>\n" + 
				"          <effects ObjectID=\"f9cc62\" effectStringRep=\"setReturnValue(true);\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f60e76f\" name=\"YTrAttachmentf5307e9\" transition=\"//@clazz.10/@ownedOperation.0/@stateMachine/@transition.3\" guardStringRep=\"DES.EventQueue.peek(timeStep, true, null, this, null) == null;\"/>\n" + 
				"        <trAttach ObjectID=\"fe065d\" name=\"YTrAttachmentf6a7c8e\" transition=\"//@clazz.10/@ownedOperation.0/@stateMachine/@transition.4\" guardStringRep=\"truckCurrentlyWeighed == null;\"/>\n" + 
				"        <trAttach ObjectID=\"f60a057\" name=\"YTrAttachmentf2457fc\" transition=\"//@clazz.10/@ownedOperation.0/@stateMachine/@transition.5\" guardStringRep=\"truckCurrentlyWeighed != null;\">\n" + 
				"          <effects ObjectID=\"fa919a\" effectStringRep=\"setReturnValue(false);\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f51d0d6\" name=\"YTrAttachmentf5589a8\" transition=\"//@clazz.10/@ownedOperation.0/@stateMachine/@transition.6\" guardStringRep=\"!(event instanceof WeighingDone);\">\n" + 
				"          <effects ObjectID=\"f6d8376\" effectStringRep=\"setReturnValue(false);\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"fff914\" name=\"YTrAttachmentf1da764\" transition=\"//@clazz.10/@ownedOperation.0/@stateMachine/@transition.7\" guardStringRep=\"truckCurrentlyWeighed == null;\"/>\n" + 
				"        <trAttach ObjectID=\"f9b9e1\" name=\"YTrAttachmentf576ac0\" transition=\"//@clazz.10/@ownedOperation.0/@stateMachine/@transition.8\" guardStringRep=\"tmp != null;\">\n" + 
				"          <effects ObjectID=\"f56e8b7\" effectStringRep=\"queueWS.consume(filter);\"/>\n" + 
				"          <effects ObjectID=\"f4a1344\" effectStringRep=\"truckCurrentlyWeighed = tmp as Truck;\"/>\n" + 
				"          <effects ObjectID=\"fc3aff\" effectStringRep=\"active = true;\"/>\n" + 
				"          <effects ObjectID=\"f2138e6\" effectStringRep=\"//Print(timeStep + &quot;weighing | &quot; + name);\"/>\n" + 
				"          <effects ObjectID=\"f5e0878\" effectStringRep=\"event = new WeighingDone;\"/>\n" + 
				"          <effects ObjectID=\"f380a3a\" effectStringRep=\"var_i = weighingTime.nextInt;\"/>\n" + 
				"          <effects ObjectID=\"f28c9ea\" effectStringRep=\"event.timeStep = timeStep + var_i;\"/>\n" + 
				"          <effects ObjectID=\"f6fd5e0\" effectStringRep=\"event.receivingObject = this;\"/>\n" + 
				"          <effects ObjectID=\"f29252a\" effectStringRep=\"setReturnValue(true);\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f34f7f8\" name=\"YTrAttachmentf65f226\" transition=\"//@clazz.10/@ownedOperation.0/@stateMachine/@transition.9\" guardStringRep=\"true;\">\n" + 
				"          <effects ObjectID=\"f53894d\" effectStringRep=\"filter = new java.util.HashMap&lt;String, Object>;\"/>\n" + 
				"          <effects ObjectID=\"f131c1a\" effectStringRep=\"(filter as java.util.Map).put(&quot;truckActive&quot;, true);\"/>\n" + 
				"          <effects ObjectID=\"f13ea74\" effectStringRep=\"tmp = queueWS.peek(filter) as Truck;\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f18d38c\" name=\"YTrAttachmentf2240d4\" transition=\"//@clazz.10/@ownedOperation.0/@stateMachine/@transition.10\" guardStringRep=\"tmp == null;\">\n" + 
				"          <effects ObjectID=\"f12be3\" effectStringRep=\"setReturnValue(false);\"/>\n" + 
				"        </trAttach>\n" + 
				"      </stateMachine>\n" + 
				"    </ownedOperation>\n" + 
				"    <ownedOperation ObjectID=\"f224902\" name=\"WeighingStation\" clazz=\"//@clazz.10\">\n" + 
				"      <ownedParameter ObjectID=\"f1c4d08\" name=\"random\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.4\"/>\n" + 
				"      <ownedParameter ObjectID=\"f362f4a\" name=\"_name\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.3\"/>\n" + 
				"      <ownedParameter ObjectID=\"f26173d\" name=\"_MAX_LOAD\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\n" + 
				"      <stateMachine ObjectID=\"fa138b\" name=\"YStateMachinefa138b\">\n" + 
				"        <transition ObjectID=\"f1855f7\" name=\"YTransitionf1855f7\" source=\"//@clazz.10/@ownedOperation.1/@stateMachine/@subvertex.0\" target=\"//@clazz.10/@ownedOperation.1/@stateMachine/@subvertex.1\" attachment=\"//@clazz.10/@ownedOperation.1/@stateMachine/@trAttach.0\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f1dd4a6\" name=\"YPseudostatef1dd4a6\" outgoing=\"//@clazz.10/@ownedOperation.1/@stateMachine/@transition.0\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f7b85d1\" name=\"YFinalStatef7b85d1\" incoming=\"//@clazz.10/@ownedOperation.1/@stateMachine/@transition.0\"/>\n" + 
				"        <trAttach ObjectID=\"f236ecd\" name=\"YTrAttachmentf236ecd\" transition=\"//@clazz.10/@ownedOperation.1/@stateMachine/@transition.0\" guardStringRep=\"true;\">\n" + 
				"          <effects ObjectID=\"f3ae649\" effectStringRep=\"MAX_LOAD =_MAX_LOAD;\"/>\n" + 
				"          <effects ObjectID=\"f731376\" effectStringRep=\"name = _name;\"/>\n" + 
				"          <effects ObjectID=\"f4c3495\" effectStringRep=\"drivingToUnloadDock = new DES.Randomizer();\"/>\n" + 
				"          <effects ObjectID=\"f5acf62\" effectStringRep=\"drivingToUnloadDock.random = random;\"/>\n" + 
				"          <effects ObjectID=\"f4597ab\" effectStringRep=\"drivingToUnloadDock.addProbInt(0.5, 120);\"/>\n" + 
				"          <effects ObjectID=\"f3a667\" effectStringRep=\"drivingToUnloadDock.addProbInt(0.8, 150);\"/>\n" + 
				"          <effects ObjectID=\"f66e8d7\" effectStringRep=\"drivingToUnloadDock.addProbInt(1.0, 180);\"/>\n" + 
				"          <effects ObjectID=\"f5962fd\" effectStringRep=\"drivingToLoadingDock = new DES.Randomizer();\"/>\n" + 
				"          <effects ObjectID=\"f52706e\" effectStringRep=\"drivingToLoadingDock.random = random;\"/>\n" + 
				"          <effects ObjectID=\"f3e2456\" effectStringRep=\"drivingToLoadingDock.addProbInt(0.5, 30);\"/>\n" + 
				"          <effects ObjectID=\"f2dbaa5\" effectStringRep=\"drivingToLoadingDock.addProbInt(1.0, 45);\"/>\n" + 
				"          <effects ObjectID=\"f33a5f2\" effectStringRep=\"weighingTime = new DES.Randomizer();\"/>\n" + 
				"          <effects ObjectID=\"f6e00be\" effectStringRep=\"weighingTime.random = random;\"/>\n" + 
				"          <effects ObjectID=\"f1838f7\" effectStringRep=\"weighingTime.addProbInt(0.5, 10);\"/>\n" + 
				"          <effects ObjectID=\"f4fd7e2\" effectStringRep=\"weighingTime.addProbInt(0.5, 30);\"/>\n" + 
				"          <effects ObjectID=\"f364833\" effectStringRep=\"weighingTime.addProbInt(0.5, 20);\"/>\n" + 
				"        </trAttach>\n" + 
				"      </stateMachine>\n" + 
				"    </ownedOperation>\n" + 
				"  </clazz>\n" + 
				"  <clazz ObjectID=\"f3548a3\" name=\"WeighingDone\" superClass=\"//@clazz.0 //@packages.1/@ownedMemberPackage.3\"/>\n" + 
				"  <clazz ObjectID=\"f77d288\" name=\"GravelShipping\" superClass=\"//@clazz.0\">\n" + 
				"    <ownedAttribute ObjectID=\"f7a450e\" name=\"weighingStations\" association=\"true\" upper=\"-1\" aggregation=\"composite\" type=\"//@clazz.10\" clazz=\"//@clazz.12\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f325015\" name=\"loadingDocks\" association=\"true\" upper=\"-1\" aggregation=\"composite\" type=\"//@clazz.2\" clazz=\"//@clazz.12\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f749668\" name=\"weighingStationQueues\" association=\"true\" upper=\"-1\" aggregation=\"composite\" type=\"//@clazz.5\" clazz=\"//@clazz.12\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f6aa7e2\" name=\"trucks\" association=\"true\" upper=\"-1\" type=\"//@clazz.3\" clazz=\"//@clazz.12\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f547732\" name=\"loadingDockQueue\" association=\"true\" upper=\"-1\" aggregation=\"composite\" type=\"//@clazz.14\" clazz=\"//@clazz.12\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f306170\" name=\"_seed\" isUnique=\"true\" defaultValue=\"&quot;&quot;\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@clazz.12\" observe=\"true\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f6740d3\" name=\"_gravelToShip\" isUnique=\"true\" defaultValue=\"&quot;&quot;\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@clazz.12\" observe=\"true\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f18d080\" name=\"_loadingDockNumber\" isUnique=\"true\" defaultValue=\"&quot;&quot;\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@clazz.12\" observe=\"true\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f133037\" name=\"_weighingStationDockNumber\" isUnique=\"true\" defaultValue=\"&quot;&quot;\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@clazz.12\" observe=\"true\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f342404\" name=\"_truckNumber\" isUnique=\"true\" defaultValue=\"&quot;&quot;\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@clazz.12\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f536649\" name=\"var_event\" isUnique=\"true\" type=\"//@packages.1/@ownedMemberPackage.3\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f310fc3\" name=\"var_truck\" isUnique=\"true\" type=\"//@clazz.3\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f3139a2\" name=\"var_service\" isUnique=\"true\" type=\"//@clazz.8\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f40b9e6\" name=\"var_loadingDock\" isUnique=\"true\" type=\"//@clazz.2\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f2f0c4e\" name=\"var_weighingStation\" isUnique=\"true\" type=\"//@clazz.10\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f3e011f\" name=\"services\" association=\"true\" upper=\"-1\" aggregation=\"composite\" type=\"//@clazz.8\" clazz=\"//@clazz.12\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f7ff9d1\" name=\"var_weighingStationQueue\" isUnique=\"true\" type=\"//@clazz.5\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f69467\" name=\"var_index\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f544d50\" name=\"random\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.4\" clazz=\"//@clazz.12\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f3eb8cc\" name=\"var_randomizer\" isUnique=\"true\" type=\"//@packages.1/@ownedMemberPackage.4\" clazz=\"//@clazz.12\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f669ec5\" name=\"deactivateTruckGenerator\" association=\"true\" aggregation=\"composite\" type=\"//@clazz.13\" clazz=\"//@clazz.12\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f77a678\" name=\"gravelShipped\" isUnique=\"true\" defaultValue=\"&quot;0&quot;\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@clazz.12\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f648aff\" name=\"successfullLoadings\" isUnique=\"true\" defaultValue=\"&quot;0&quot;\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@clazz.12\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f3fc311\" name=\"successfullLoadingSizes\" isUnique=\"true\" defaultValue=\"&quot;0&quot;\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@clazz.12\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f36e620\" name=\"unsuccessfullLoadings\" isUnique=\"true\" defaultValue=\"&quot;0&quot;\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@clazz.12\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f68166\" name=\"unsuccessfullLoadingSizes\" isUnique=\"true\" defaultValue=\"&quot;0&quot;\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@clazz.12\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f3bf7b8\" name=\"MAX_LOAD\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@clazz.12\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f1059b4\" name=\"var_loadingDockQueue\" isUnique=\"true\" type=\"//@clazz.14\" clazz=\"//@clazz.12\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f5afdf8\" name=\"obj\" association=\"true\" type=\"//@packages.0/@ownedMemberPackage.4\" clazz=\"//@clazz.12\"/>\n" + 
				"    <ownedOperation ObjectID=\"f6e6d96\" name=\"start\" clazz=\"//@clazz.12\">\n" + 
				"      <ownedParameter ObjectID=\"f58745b\" name=\"gravelToShip\" isUnique=\"true\" defaultValue=\"\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\n" + 
				"      <ownedParameter ObjectID=\"f3b41db\" name=\"trucks\" isUnique=\"true\" defaultValue=\"\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\n" + 
				"      <ownedParameter ObjectID=\"f4ef56e\" name=\"loadingDockNumber\" isUnique=\"true\" defaultValue=\"\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\n" + 
				"      <ownedParameter ObjectID=\"f7effd8\" name=\"weighingStationNumber\" isUnique=\"true\" defaultValue=\"\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\n" + 
				"      <ownedParameter ObjectID=\"f3b8876\" name=\"seed\" isUnique=\"true\" defaultValue=\"\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\n" + 
				"      <ownedParameter ObjectID=\"f42a0ac\" name=\"MAX_LOAD\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\n" + 
				"      <stateMachine ObjectID=\"f7c22ce\" name=\"YStateMachinef7c22ce\" desInitializer=\"true\">\n" + 
				"        <transition ObjectID=\"f282fd8\" name=\"YTransitionf282fd8\" qualifiedName=\"\" source=\"//@clazz.12/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@clazz.12/@ownedOperation.0/@stateMachine/@subvertex.8\" attachment=\"//@clazz.12/@ownedOperation.0/@stateMachine/@trAttach.11\"/>\n" + 
				"        <transition ObjectID=\"f3caf9e\" name=\"YTransitionf3caf9e\" source=\"//@clazz.12/@ownedOperation.0/@stateMachine/@subvertex.1\" target=\"//@clazz.12/@ownedOperation.0/@stateMachine/@subvertex.2\" attachment=\"//@clazz.12/@ownedOperation.0/@stateMachine/@trAttach.1\"/>\n" + 
				"        <transition ObjectID=\"f4b4a1c\" name=\"YTransitionf4b4a1c\" source=\"//@clazz.12/@ownedOperation.0/@stateMachine/@subvertex.2\" target=\"//@clazz.12/@ownedOperation.0/@stateMachine/@subvertex.2\" attachment=\"//@clazz.12/@ownedOperation.0/@stateMachine/@trAttach.2\"/>\n" + 
				"        <transition ObjectID=\"f1040a8\" name=\"YTransitionf1040a8\" source=\"//@clazz.12/@ownedOperation.0/@stateMachine/@subvertex.2\" target=\"//@clazz.12/@ownedOperation.0/@stateMachine/@subvertex.3\" attachment=\"//@clazz.12/@ownedOperation.0/@stateMachine/@trAttach.3\"/>\n" + 
				"        <transition ObjectID=\"f2bec3\" name=\"YTransitionf2bec3\" source=\"//@clazz.12/@ownedOperation.0/@stateMachine/@subvertex.3\" target=\"//@clazz.12/@ownedOperation.0/@stateMachine/@subvertex.3\" attachment=\"//@clazz.12/@ownedOperation.0/@stateMachine/@trAttach.4\"/>\n" + 
				"        <transition ObjectID=\"f24152b\" name=\"YTransitionf24152b\" source=\"//@clazz.12/@ownedOperation.0/@stateMachine/@subvertex.3\" target=\"//@clazz.12/@ownedOperation.0/@stateMachine/@subvertex.4\" attachment=\"//@clazz.12/@ownedOperation.0/@stateMachine/@trAttach.5\"/>\n" + 
				"        <transition ObjectID=\"f5d7248\" name=\"YTransitionf5d7248\" source=\"//@clazz.12/@ownedOperation.0/@stateMachine/@subvertex.4\" target=\"//@clazz.12/@ownedOperation.0/@stateMachine/@subvertex.5\" attachment=\"//@clazz.12/@ownedOperation.0/@stateMachine/@trAttach.6\"/>\n" + 
				"        <transition ObjectID=\"f70fa3\" name=\"YTransitionf70fa3\" source=\"//@clazz.12/@ownedOperation.0/@stateMachine/@subvertex.4\" target=\"//@clazz.12/@ownedOperation.0/@stateMachine/@subvertex.4\" attachment=\"//@clazz.12/@ownedOperation.0/@stateMachine/@trAttach.7\"/>\n" + 
				"        <transition ObjectID=\"f4ae76a\" name=\"YTransitionf4ae76a\" source=\"//@clazz.12/@ownedOperation.0/@stateMachine/@subvertex.7\" target=\"//@clazz.12/@ownedOperation.0/@stateMachine/@subvertex.6\" attachment=\"//@clazz.12/@ownedOperation.0/@stateMachine/@trAttach.8\"/>\n" + 
				"        <transition ObjectID=\"f224cb9\" name=\"YTransitionf224cb9\" source=\"//@clazz.12/@ownedOperation.0/@stateMachine/@subvertex.5\" target=\"//@clazz.12/@ownedOperation.0/@stateMachine/@subvertex.7\" attachment=\"//@clazz.12/@ownedOperation.0/@stateMachine/@trAttach.9\"/>\n" + 
				"        <transition ObjectID=\"f7e77bc\" name=\"YTransitionf7e77bc\" source=\"//@clazz.12/@ownedOperation.0/@stateMachine/@subvertex.8\" target=\"//@clazz.12/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@clazz.12/@ownedOperation.0/@stateMachine/@trAttach.10\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f7c5386\" name=\"YPseudostatef7c5386\" outgoing=\"//@clazz.12/@ownedOperation.0/@stateMachine/@transition.0\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f6b5451\" name=\"YStatef6b5451\" outgoing=\"//@clazz.12/@ownedOperation.0/@stateMachine/@transition.1\" incoming=\"//@clazz.12/@ownedOperation.0/@stateMachine/@transition.10\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f357d4d\" name=\"YStatef357d4d\" outgoing=\"//@clazz.12/@ownedOperation.0/@stateMachine/@transition.2 //@clazz.12/@ownedOperation.0/@stateMachine/@transition.3\" incoming=\"//@clazz.12/@ownedOperation.0/@stateMachine/@transition.1 //@clazz.12/@ownedOperation.0/@stateMachine/@transition.2\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f20d3c0\" name=\"YStatef20d3c0\" outgoing=\"//@clazz.12/@ownedOperation.0/@stateMachine/@transition.4 //@clazz.12/@ownedOperation.0/@stateMachine/@transition.5\" incoming=\"//@clazz.12/@ownedOperation.0/@stateMachine/@transition.3 //@clazz.12/@ownedOperation.0/@stateMachine/@transition.4\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f77a10a\" name=\"YStatef77a10a\" outgoing=\"//@clazz.12/@ownedOperation.0/@stateMachine/@transition.6 //@clazz.12/@ownedOperation.0/@stateMachine/@transition.7\" incoming=\"//@clazz.12/@ownedOperation.0/@stateMachine/@transition.5 //@clazz.12/@ownedOperation.0/@stateMachine/@transition.7\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f38297e\" name=\"YStatef38297e\" outgoing=\"//@clazz.12/@ownedOperation.0/@stateMachine/@transition.9\" incoming=\"//@clazz.12/@ownedOperation.0/@stateMachine/@transition.6\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f1f078d\" name=\"YFinalStatef1f078d\" incoming=\"//@clazz.12/@ownedOperation.0/@stateMachine/@transition.8\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f7a71b\" name=\"YStatef7a71b\" outgoing=\"//@clazz.12/@ownedOperation.0/@stateMachine/@transition.8\" incoming=\"//@clazz.12/@ownedOperation.0/@stateMachine/@transition.9\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f5ec988\" name=\"YStatef5ec988\" outgoing=\"//@clazz.12/@ownedOperation.0/@stateMachine/@transition.10\" incoming=\"//@clazz.12/@ownedOperation.0/@stateMachine/@transition.0\"/>\n" + 
				"        <trAttach ObjectID=\"f3890ef\" name=\"YTrAttachmentf3890ef\" guardStringRep=\"true;\">\n" + 
				"          <effects ObjectID=\"f299f51\" effectStringRep=\"_loadingDockNumber = loadingDockNumber;\"/>\n" + 
				"          <effects ObjectID=\"f7ab8de\" effectStringRep=\"_weighingStationDockNumber = weighingStationNumber;\"/>\n" + 
				"          <effects ObjectID=\"f47c55b\" effectStringRep=\"_truckNumber = trucks;\"/>\n" + 
				"          <effects ObjectID=\"f1b2615\" breakpoint=\"true\" effectStringRep=\"_gravelToShip = gravelToShip;\"/>\n" + 
				"          <effects ObjectID=\"f446cc3\" effectStringRep=\"var_index = 1;\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f65bbbb\" name=\"YTrAttachmentf65bbbb\" transition=\"//@clazz.12/@ownedOperation.0/@stateMachine/@transition.1\" guardStringRep=\"true;\">\n" + 
				"          <effects ObjectID=\"f78707b\" effectStringRep=\"random = new java.util.Random(_seed);\"/>\n" + 
				"          <effects ObjectID=\"f247843\" effectStringRep=\"var_service = new Service;\"/>\n" + 
				"          <effects ObjectID=\"f5e1add\" effectStringRep=\"var_loadingDockQueue = new LoadingDockQueue;\"/>\n" + 
				"          <effects ObjectID=\"f2023b\" effectStringRep=\"var_loadingDockQueue.name = &quot;queueLD&quot;;&#xA;\"/>\n" + 
				"          <effects ObjectID=\"f5d85fb\" effectStringRep=\"loadingDockQueue.add(var_loadingDockQueue);\"/>\n" + 
				"          <effects ObjectID=\"f16efb1\" effectStringRep=\"var_weighingStationQueue = new WeighingStationQueue;\"/>\n" + 
				"          <effects ObjectID=\"ff8f8f\" effectStringRep=\"var_weighingStationQueue.name = &quot;queueWS&quot;;&#xA;\"/>\n" + 
				"          <effects ObjectID=\"f3ac3ff\" effectStringRep=\"weighingStationQueues.add(var_weighingStationQueue);\"/>\n" + 
				"          <effects ObjectID=\"f21f4eb\" effectStringRep=\"var_index = 1;&#xA;\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f534204\" name=\"YTrAttachmentf534204\" transition=\"//@clazz.12/@ownedOperation.0/@stateMachine/@transition.2\" guardStringRep=\"var_index &lt;= _loadingDockNumber;\">\n" + 
				"          <effects ObjectID=\"f3906d6\" effectStringRep=\"var_loadingDock = new LoadingDock(random, &quot;LD_&quot; + var_index);\"/>\n" + 
				"          <effects ObjectID=\"f2f598d\" effectStringRep=\"var_loadingDock.gravelShipping = this;\"/>\n" + 
				"          <effects ObjectID=\"f480e49\" effectStringRep=\"var_loadingDock.queueLD = var_loadingDockQueue;\"/>\n" + 
				"          <effects ObjectID=\"f15fcef\" effectStringRep=\"var_loadingDock.queueWS = var_weighingStationQueue;&#xA;\"/>\n" + 
				"          <effects ObjectID=\"f4cbb14\" effectStringRep=\"loadingDocks.add(var_loadingDock);\"/>\n" + 
				"          <effects ObjectID=\"f63ec68\" effectStringRep=\"var_index++;\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f30eada\" name=\"YTrAttachmentf30eada\" transition=\"//@clazz.12/@ownedOperation.0/@stateMachine/@transition.3\" guardStringRep=\"var_index > _loadingDockNumber;\">\n" + 
				"          <effects ObjectID=\"f16798e\" effectStringRep=\"var_index = 1;\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f6ee7d\" name=\"TrAttachmentf6ee7d\" transition=\"//@clazz.12/@ownedOperation.0/@stateMachine/@transition.4\" guardStringRep=\"var_index &lt;= _weighingStationDockNumber;\">\n" + 
				"          <effects ObjectID=\"f4a0fa7\" effectStringRep=\"var_weighingStation = new WeighingStation(random, &quot;WS_&quot; + var_index, MAX_LOAD);\"/>\n" + 
				"          <effects ObjectID=\"fc03b0\" effectStringRep=\"var_weighingStation.gravelShipping = this;\"/>\n" + 
				"          <effects ObjectID=\"fbc1ab\" effectStringRep=\"var_weighingStation.queueLD = var_loadingDockQueue;\"/>\n" + 
				"          <effects ObjectID=\"f2b586\" effectStringRep=\"var_weighingStation.queueWS = var_weighingStationQueue;\"/>\n" + 
				"          <effects ObjectID=\"f6fb4f7\" effectStringRep=\"weighingStations.add(var_weighingStation);\"/>\n" + 
				"          <effects ObjectID=\"f40c30e\" effectStringRep=\"var_index++;\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f70574e\" name=\"TrAttachmentf70574e\" transition=\"//@clazz.12/@ownedOperation.0/@stateMachine/@transition.5\" guardStringRep=\"var_index > _weighingStationDockNumber;\">\n" + 
				"          <effects ObjectID=\"f3f3254\" effectStringRep=\"var_index = 1;\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f39fe15\" name=\"YTrAttachmentf39fe15\" transition=\"//@clazz.12/@ownedOperation.0/@stateMachine/@transition.6\" guardStringRep=\"var_index > _truckNumber;\"/>\n" + 
				"        <trAttach ObjectID=\"f8386c\" name=\"YTrAttachmentf8386c\" transition=\"//@clazz.12/@ownedOperation.0/@stateMachine/@transition.7\" guardStringRep=\"var_index &lt;= _truckNumber;\">\n" + 
				"          <effects ObjectID=\"f109a58\" effectStringRep=\"var_truck = new Truck;sad\"/>\n" + 
				"          <effects ObjectID=\"f180168\" effectStringRep=\"var_truck.name = &quot;Truck_&quot; + var_index; \"/>\n" + 
				"          <effects ObjectID=\"f32b68e\" effectStringRep=\"var_loadingDockQueue.add(var_truck);\"/>\n" + 
				"          <effects ObjectID=\"f435fef\" effectStringRep=\"var_index++;\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f755a45\" name=\"YTrAttachmentf755a45\" transition=\"//@clazz.12/@ownedOperation.0/@stateMachine/@transition.8\" guardStringRep=\"true;\">\n" + 
				"          <effects ObjectID=\"f2da436\" breakpoint=\"true\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f614fc8\" name=\"YTrAttachmentf614fc8\" transition=\"//@clazz.12/@ownedOperation.0/@stateMachine/@transition.9\" guardStringRep=\"true;\">\n" + 
				"          <effects ObjectID=\"f3eeb85\" effectStringRep=\"var_randomizer = new DES.Randomizer();\"/>\n" + 
				"          <effects ObjectID=\"f2fe4ae\" effectStringRep=\"var_randomizer.random = random;\"/>\n" + 
				"          <effects ObjectID=\"f402469\" effectStringRep=\"var_randomizer.addProbInt(0.3, 20);\"/>\n" + 
				"          <effects ObjectID=\"f332ab2\" effectStringRep=\"var_randomizer.addProbInt(0.35, 40);\"/>\n" + 
				"          <effects ObjectID=\"f6bc27b\" effectStringRep=\"var_randomizer.addProbInt(0.35, 100x);\"/>\n" + 
				"          <effects ObjectID=\"f46ffcb\" effectStringRep=\"deactivateTruckGenerator = new DeactivateTruckGenerator(0, var_randomizer);\"/>\n" + 
				"          <effects ObjectID=\"f312ccd\" effectStringRep=\"deactivateTruckGenerator.gravelShipping = this;\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f19f3e4\" name=\"YTrAttachmentf19f3e4\" transition=\"//@clazz.12/@ownedOperation.0/@stateMachine/@transition.10\" guardStringRep=\"true;\">\n" + 
				"          <effects ObjectID=\"f599212\" effectStringRep=\"chartView = new online.yamm.util.YammChartView(&quot;GravelToShip&quot;);\"/>\n" + 
				"          <effects ObjectID=\"f7a5c95\" effectStringRep=\"(chartView as online.yamm.util.YammChartView).addChart(yammInternal as org.eclipse.emf.ecore.EObject, &quot;simulationTime&quot;, &quot;time&quot;, this, &quot;_gravelToShip&quot;, &quot;gravelToShip&quot;);\"/>\n" + 
				"          <effects ObjectID=\"f4dd3cc\" effectStringRep=\"(chartView as online.yamm.util.YammChartView).showCharts;&#xA;\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f17382a\" name=\"TrAttachmentf17382a\" transition=\"//@clazz.12/@ownedOperation.0/@stateMachine/@transition.0\" guardStringRep=\"true;\">\n" + 
				"          <effects ObjectID=\"f4ad109\" effectStringRep=\"_loadingDockNumber = 6;&#xA;\"/>\n" + 
				"          <effects ObjectID=\"f4364a9\" effectStringRep=\"_weighingStationDockNumber = 4;\"/>\n" + 
				"          <effects ObjectID=\"f6e2404\" effectStringRep=\"_truckNumber = 15;&#xA;\"/>\n" + 
				"          <effects ObjectID=\"f381fbe\" breakpoint=\"true\" effectStringRep=\"_gravelToShip = 2000;&#xA;\"/>\n" + 
				"          <effects ObjectID=\"f2e8bf2\" effectStringRep=\"MAX_LOAD = 40;\"/>\n" + 
				"          <effects ObjectID=\"f7a4782\" effectStringRep=\"var_index = 1;\"/>\n" + 
				"        </trAttach>\n" + 
				"      </stateMachine>\n" + 
				"    </ownedOperation>\n" + 
				"  </clazz>\n" + 
				"  <clazz ObjectID=\"f6a71bb\" name=\"DeactivateTruckGenerator\" superClass=\"//@clazz.0 //@packages.1/@ownedMemberPackage.2\">\n" + 
				"    <ownedAttribute ObjectID=\"f76963f\" name=\"event\" isUnique=\"true\" type=\"//@packages.1/@ownedMemberPackage.3\" clazz=\"//@clazz.13\"/>\n" + 
				"    <ownedAttribute ObjectID=\"fbaadc\" name=\"_rate\" isUnique=\"true\" type=\"//@packages.1/@ownedMemberPackage.4\" clazz=\"//@clazz.13\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f497026\" name=\"var_time\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@clazz.13\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f23cb54\" name=\"var_trucks\" upper=\"-1\" type=\"//@clazz.3\" clazz=\"//@clazz.13\"/>\n" + 
				"    <ownedAttribute ObjectID=\"f14ea2f\" name=\"gravelShipping\" association=\"true\" type=\"//@clazz.12\" clazz=\"//@clazz.13\"/>\n" + 
				"    <ownedOperation ObjectID=\"f50c0c4\" name=\"DeactivateTruckGenerator\" clazz=\"//@clazz.13\">\n" + 
				"      <ownedParameter ObjectID=\"f351378\" name=\"timeStep\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\n" + 
				"      <ownedParameter ObjectID=\"f3f12c6\" name=\"rate\" isUnique=\"true\" type=\"//@packages.1/@ownedMemberPackage.4\"/>\n" + 
				"      <stateMachine ObjectID=\"f2667e3\" name=\"YStateMachinef2667e3\">\n" + 
				"        <transition ObjectID=\"fad8e1\" name=\"YTransitionfad8e1\" source=\"//@clazz.13/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@clazz.13/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@clazz.13/@ownedOperation.0/@stateMachine/@trAttach.0\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f52b7ee\" name=\"YPseudostatef52b7ee\" outgoing=\"//@clazz.13/@ownedOperation.0/@stateMachine/@transition.0\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f79d96e\" name=\"YFinalStatef79d96e\" incoming=\"//@clazz.13/@ownedOperation.0/@stateMachine/@transition.0\"/>\n" + 
				"        <trAttach ObjectID=\"f519a45\" name=\"YTrAttachmentf519a45\" transition=\"//@clazz.13/@ownedOperation.0/@stateMachine/@transition.0\" guardStringRep=\"true;\">\n" + 
				"          <effects ObjectID=\"f31c2d2\" effectStringRep=\"_rate = rate;\"/>\n" + 
				"          <effects ObjectID=\"f79f8c2\" effectStringRep=\"event = new DES.Delay;\"/>\n" + 
				"          <effects ObjectID=\"f48634b\" effectStringRep=\"event.receivingObject = this;\"/>\n" + 
				"          <effects ObjectID=\"f20444b\" effectStringRep=\"var_time = _rate.nextInt;\"/>\n" + 
				"          <effects ObjectID=\"f16c754\" effectStringRep=\"event.timeStep = timeStep + var_time;\"/>\n" + 
				"        </trAttach>\n" + 
				"      </stateMachine>\n" + 
				"    </ownedOperation>\n" + 
				"    <ownedOperation ObjectID=\"f463799\" name=\"simulate\" clazz=\"//@clazz.13\" returnType=\"//@packages.0/@ownedMemberPackage.2\">\n" + 
				"      <ownedParameter ObjectID=\"f44c075\" name=\"timeStep\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\n" + 
				"      <stateMachine ObjectID=\"f2a96c1\" name=\"YStateMachinef2a96c1\">\n" + 
				"        <transition ObjectID=\"f769f8b\" name=\"YTransitionf769f8b\" source=\"//@clazz.13/@ownedOperation.1/@stateMachine/@subvertex.0\" target=\"//@clazz.13/@ownedOperation.1/@stateMachine/@subvertex.2\" attachment=\"//@clazz.13/@ownedOperation.1/@stateMachine/@trAttach.0\"/>\n" + 
				"        <transition ObjectID=\"f33c794\" name=\"YTransitionf33c794\" source=\"//@clazz.13/@ownedOperation.1/@stateMachine/@subvertex.2\" target=\"//@clazz.13/@ownedOperation.1/@stateMachine/@subvertex.3\" attachment=\"//@clazz.13/@ownedOperation.1/@stateMachine/@trAttach.1\"/>\n" + 
				"        <transition ObjectID=\"f5c7e77\" name=\"YTransitionf5c7e77\" source=\"//@clazz.13/@ownedOperation.1/@stateMachine/@subvertex.2\" target=\"//@clazz.13/@ownedOperation.1/@stateMachine/@subvertex.1\" attachment=\"//@clazz.13/@ownedOperation.1/@stateMachine/@trAttach.2\"/>\n" + 
				"        <transition ObjectID=\"fe3931\" name=\"YTransitionfe3931\" source=\"//@clazz.13/@ownedOperation.1/@stateMachine/@subvertex.3\" target=\"//@clazz.13/@ownedOperation.1/@stateMachine/@subvertex.4\" attachment=\"//@clazz.13/@ownedOperation.1/@stateMachine/@trAttach.3\"/>\n" + 
				"        <transition ObjectID=\"f4cdaf1\" name=\"YTransitionf4cdaf1\" source=\"//@clazz.13/@ownedOperation.1/@stateMachine/@subvertex.4\" target=\"//@clazz.13/@ownedOperation.1/@stateMachine/@subvertex.1\" attachment=\"//@clazz.13/@ownedOperation.1/@stateMachine/@trAttach.4\"/>\n" + 
				"        <transition ObjectID=\"f3358f9\" name=\"YTransitionf3358f9\" source=\"//@clazz.13/@ownedOperation.1/@stateMachine/@subvertex.3\" target=\"//@clazz.13/@ownedOperation.1/@stateMachine/@subvertex.1\" attachment=\"//@clazz.13/@ownedOperation.1/@stateMachine/@trAttach.5\"/>\n" + 
				"        <transition ObjectID=\"f6bd297\" name=\"YTransitionf6bd297\" source=\"//@clazz.13/@ownedOperation.1/@stateMachine/@subvertex.4\" target=\"//@clazz.13/@ownedOperation.1/@stateMachine/@subvertex.1\" attachment=\"//@clazz.13/@ownedOperation.1/@stateMachine/@trAttach.6\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f42bb2d\" name=\"YPseudostatef42bb2d\" outgoing=\"//@clazz.13/@ownedOperation.1/@stateMachine/@transition.0\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f4171b5\" name=\"YFinalStatef4171b5\" incoming=\"//@clazz.13/@ownedOperation.1/@stateMachine/@transition.4 //@clazz.13/@ownedOperation.1/@stateMachine/@transition.5 //@clazz.13/@ownedOperation.1/@stateMachine/@transition.2 //@clazz.13/@ownedOperation.1/@stateMachine/@transition.6\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f12e90\" name=\"YStatef12e90\" outgoing=\"//@clazz.13/@ownedOperation.1/@stateMachine/@transition.1 //@clazz.13/@ownedOperation.1/@stateMachine/@transition.2\" incoming=\"//@clazz.13/@ownedOperation.1/@stateMachine/@transition.0\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f5437ef\" name=\"YStatef5437ef\" outgoing=\"//@clazz.13/@ownedOperation.1/@stateMachine/@transition.3 //@clazz.13/@ownedOperation.1/@stateMachine/@transition.5\" incoming=\"//@clazz.13/@ownedOperation.1/@stateMachine/@transition.1\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f50f322\" name=\"YStatef50f322\" outgoing=\"//@clazz.13/@ownedOperation.1/@stateMachine/@transition.4 //@clazz.13/@ownedOperation.1/@stateMachine/@transition.6\" incoming=\"//@clazz.13/@ownedOperation.1/@stateMachine/@transition.3\"/>\n" + 
				"        <trAttach ObjectID=\"f229177\" name=\"YTrAttachmentf229177\" transition=\"//@clazz.13/@ownedOperation.1/@stateMachine/@transition.0\" guardStringRep=\"true;\">\n" + 
				"          <effects ObjectID=\"f5d957c\" effectStringRep=\"event = DES.EventQueue.peek(timeStep, true, null, this, null);\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f3e4687\" name=\"YTrAttachmentf3e4687\" transition=\"//@clazz.13/@ownedOperation.1/@stateMachine/@transition.1\" guardStringRep=\"event != null;\"/>\n" + 
				"        <trAttach ObjectID=\"f3ace8e\" name=\"YTrAttachmentf3ace8e\" transition=\"//@clazz.13/@ownedOperation.1/@stateMachine/@transition.2\" guardStringRep=\"event == null;\">\n" + 
				"          <effects ObjectID=\"f4bf675\"/>\n" + 
				"          <effects ObjectID=\"f109808\" effectStringRep=\"setReturnValue(false);\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f4ae2e3\" name=\"YTrAttachmentf4ae2e3\" transition=\"//@clazz.13/@ownedOperation.1/@stateMachine/@transition.3\" guardStringRep=\"event instanceof DES.Delay;\">\n" + 
				"          <effects ObjectID=\"f1af408\" effectStringRep=\"DES.EventQueue.consume(timeStep, true, null, this, null);\"/>\n" + 
				"          <effects ObjectID=\"f642fea\" effectStringRep=\"event = new DeactivateTruck;\"/>\n" + 
				"          <effects ObjectID=\"f76c93f\" effectStringRep=\"var_trucks = getInstances(1, &quot;Truck&quot;) as java.util.List&lt;Truck>;\"/>\n" + 
				"          <effects ObjectID=\"f3084e0\" effectStringRep=\"event.receivingObject = var_trucks.get((_rate.random as java.util.Random).nextInt(var_trucks.size));\"/>\n" + 
				"          <effects ObjectID=\"f159ca6\" effectStringRep=\"event.timeStep = timeStep;\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f60a9ae\" name=\"YTrAttachmentf60a9ae\" transition=\"//@clazz.13/@ownedOperation.1/@stateMachine/@transition.4\" guardStringRep=\"gravelShipping._gravelToShip > 0;\">\n" + 
				"          <effects ObjectID=\"f34b4b4\" effectStringRep=\"event = new DES.Delay;\"/>\n" + 
				"          <effects ObjectID=\"f37a258\" effectStringRep=\"event.receivingObject = this;\"/>\n" + 
				"          <effects ObjectID=\"f6e83e2\" effectStringRep=\"var_time = _rate.nextInt;\"/>\n" + 
				"          <effects ObjectID=\"f303109\" effectStringRep=\"event.timeStep = timeStep + var_time + 1;\"/>\n" + 
				"          <effects ObjectID=\"f46c992\" effectStringRep=\"setReturnValue(true);\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f2022a6\" name=\"YTrAttachmentf2022a6\" transition=\"//@clazz.13/@ownedOperation.1/@stateMachine/@transition.5\" guardStringRep=\"!(event instanceof DES.Delay);\">\n" + 
				"          <effects ObjectID=\"f1297b8\" effectStringRep=\"setReturnValue(false);\"/>\n" + 
				"        </trAttach>\n" + 
				"        <trAttach ObjectID=\"f154924\" name=\"YTrAttachmentf154924\" transition=\"//@clazz.13/@ownedOperation.1/@stateMachine/@transition.6\" guardStringRep=\"gravelShipping._gravelToShip &lt;= 0;\">\n" + 
				"          <effects ObjectID=\"f3dd133\" effectStringRep=\"setReturnValue(false);\"/>\n" + 
				"        </trAttach>\n" + 
				"      </stateMachine>\n" + 
				"    </ownedOperation>\n" + 
				"  </clazz>\n" + 
				"  <clazz ObjectID=\"f13d62d\" name=\"LoadingDockQueue\" superClass=\"//@clazz.0 //@packages.1/@ownedMemberPackage.1\" observeQueue=\"true\">\n" + 
				"    <ownedAttribute ObjectID=\"f76086b\" name=\"type\" isUnique=\"true\" type=\"//@clazz.3\" clazz=\"//@clazz.14\"/>\n" + 
				"    <ownedOperation ObjectID=\"f7f5a62\" name=\"LoadingDockQueue\" clazz=\"//@clazz.14\">\n" + 
				"      <stateMachine ObjectID=\"f3a7933\" name=\"YStateMachinef3a7933\">\n" + 
				"        <transition ObjectID=\"fc448c\" name=\"YTransitionfc448c\" source=\"//@clazz.14/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@clazz.14/@ownedOperation.0/@stateMachine/@subvertex.1\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f28bab9\" name=\"YPseudostatef28bab9\" outgoing=\"//@clazz.14/@ownedOperation.0/@stateMachine/@transition.0\"/>\n" + 
				"        <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f2d52ea\" name=\"YFinalStatef2d52ea\" incoming=\"//@clazz.14/@ownedOperation.0/@stateMachine/@transition.0\"/>\n" + 
				"        <trAttach ObjectID=\"f609325\" name=\"YTrAttachmentf609325\" guardStringRep=\"true;\">\n" + 
				"          <effects ObjectID=\"f72077c\" effectStringRep=\"Print(&quot;------------------------------------------------------&quot;);\"/>\n" + 
				"          <effects ObjectID=\"f7675a9\" effectStringRep=\"chartView = new online.yamm.util.YammChartView(&quot;QueueLoadingDock&quot;);\"/>\n" + 
				"          <effects ObjectID=\"f69a05e\" effectStringRep=\"(chartView as online.yamm.util.YammChartView).addChart(yammInternal as org.eclipse.emf.ecore.EObject, &quot;simulationTime&quot;, &quot;time&quot;, this, &quot;queue&quot;, &quot;queueLD&quot;);\"/>\n" + 
				"          <effects ObjectID=\"f45f43d\" effectStringRep=\"(chartView as online.yamm.util.YammChartView).addChart(yammInternal as org.eclipse.emf.ecore.EObject, &quot;simulationTime&quot;, &quot;time&quot;, this, &quot;delayed&quot;, &quot;delayed&quot;);\"/>\n" + 
				"          <effects ObjectID=\"f1cbeb7\" effectStringRep=\"(chartView as online.yamm.util.YammChartView).showCharts;\"/>\n" + 
				"        </trAttach>\n" + 
				"      </stateMachine>\n" + 
				"    </ownedOperation>\n" + 
				"  </clazz>\n" + 
				"  <clazz ObjectID=\"f1417cc\" name=\"ClassA\" superClass=\"//@clazz.0\"/>\n" + 
				"  <packages ObjectID=\"f186d36\" name=\"Types\">\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f21f575\" name=\"Integer\" package=\"//@packages.0\"/>\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f6ff69c\" name=\"Double\" package=\"//@packages.0\"/>\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f143957\" name=\"Boolean\" package=\"//@packages.0\"/>\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f4f4a1\" name=\"String\" package=\"//@packages.0\"/>\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"fea65c\" name=\"Object\" package=\"//@packages.0\"/>\n" + 
				"  </packages>\n" + 
				"  <packages ObjectID=\"f2bcfa4\" name=\"DES\">\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f6f1844\" name=\"EventQueue\" package=\"//@packages.1\" superClass=\"//@clazz.0\">\n" + 
				"      <ownedOperation ObjectID=\"f78653a\" name=\"consume\" clazz=\"//@packages.1/@ownedMemberPackage.0\" returnType=\"//@packages.1/@ownedMemberPackage.3\">\n" + 
				"        <ownedParameter ObjectID=\"f741ee8\" name=\"timeStep\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\n" + 
				"        <ownedParameter ObjectID=\"f325830\" name=\"past\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.2\"/>\n" + 
				"        <ownedParameter ObjectID=\"f1385ca\" name=\"eventType\" isUnique=\"true\" type=\"//@clazz.1\"/>\n" + 
				"        <ownedParameter ObjectID=\"f334831\" name=\"receiver\" isUnique=\"true\" type=\"//@clazz.0\"/>\n" + 
				"        <ownedParameter ObjectID=\"f4cda47\" name=\"receiverType\" isUnique=\"true\" type=\"//@clazz.1\"/>\n" + 
				"        <stateMachine ObjectID=\"f2a9bdf\" name=\"YStateMachinef2a9bdf\"/>\n" + 
				"      </ownedOperation>\n" + 
				"      <ownedOperation ObjectID=\"f60b252\" name=\"peek\" clazz=\"//@packages.1/@ownedMemberPackage.0\" returnType=\"//@packages.1/@ownedMemberPackage.3\">\n" + 
				"        <ownedParameter ObjectID=\"f465861\" name=\"timeStep\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\n" + 
				"        <ownedParameter ObjectID=\"f4b5255\" name=\"past\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.2\"/>\n" + 
				"        <ownedParameter ObjectID=\"f7afd77\" name=\"eventType\" isUnique=\"true\" type=\"//@clazz.1\"/>\n" + 
				"        <ownedParameter ObjectID=\"f82b36\" name=\"receiver\" isUnique=\"true\" type=\"//@clazz.0\"/>\n" + 
				"        <ownedParameter ObjectID=\"fd7951\" name=\"receiverType\" isUnique=\"true\" type=\"//@clazz.1\"/>\n" + 
				"        <stateMachine ObjectID=\"f545e73\" name=\"YStateMachinef545e73\"/>\n" + 
				"      </ownedOperation>\n" + 
				"    </ownedMemberPackage>\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f7b30f\" name=\"Queue\" package=\"//@packages.1\" superClass=\"//@clazz.0 //@packages.1/@ownedMemberPackage.2\">\n" + 
				"      <ownedAttribute ObjectID=\"f9f8bb\" name=\"queue\" association=\"true\" upper=\"-1\" aggregation=\"composite\" type=\"//@packages.1/@ownedMemberPackage.2\" clazz=\"//@packages.1/@ownedMemberPackage.1\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f386ee1\" name=\"delayed\" association=\"true\" upper=\"-1\" aggregation=\"composite\" type=\"//@packages.1/@ownedMemberPackage.2\" clazz=\"//@packages.1/@ownedMemberPackage.1\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f2f987a\" name=\"event\" isUnique=\"true\" type=\"//@packages.1/@ownedMemberPackage.3\" clazz=\"//@packages.1/@ownedMemberPackage.1\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f660fa1\" name=\"var_objectManagment\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.4\" clazz=\"//@packages.1/@ownedMemberPackage.1\"/>\n" + 
				"      <ownedOperation ObjectID=\"f20be76\" name=\"add\" clazz=\"//@packages.1/@ownedMemberPackage.1\">\n" + 
				"        <ownedParameter ObjectID=\"f4f4254\" name=\"object\" isUnique=\"true\" type=\"//@packages.1/@ownedMemberPackage.2\"/>\n" + 
				"        <stateMachine ObjectID=\"f4abe3c\" name=\"YStateMachinef4abe3c\">\n" + 
				"          <transition ObjectID=\"f5e9a9b\" name=\"YTransitionf5e9a9b\" source=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.0/@stateMachine/@trAttach.0\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f38ff8d\" name=\"YPseudostatef38ff8d\" outgoing=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.0/@stateMachine/@transition.0\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f22957b\" name=\"YFinalStatef22957b\" incoming=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.0/@stateMachine/@transition.0\"/>\n" + 
				"          <trAttach ObjectID=\"f529472\" name=\"YTrAttachmentf529472\" transition=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.0/@stateMachine/@transition.0\" guardStringRep=\"true;\">\n" + 
				"            <effects ObjectID=\"f3d0304\" effectStringRep=\"queue.add(object);\"/>\n" + 
				"            <effects ObjectID=\"f160b70\" effectStringRep=\"var_objectManagment = getObjectManagement();\"/>\n" + 
				"            <effects ObjectID=\"f6420ae\" effectStringRep=\"(var_objectManagment as online.yamm.ObjectManagement).addQueueElement(this, object, 1);\"/>\n" + 
				"          </trAttach>\n" + 
				"        </stateMachine>\n" + 
				"      </ownedOperation>\n" + 
				"      <ownedOperation ObjectID=\"f68084f\" name=\"consume\" clazz=\"//@packages.1/@ownedMemberPackage.1\" returnType=\"//@packages.1/@ownedMemberPackage.2\">\n" + 
				"        <ownedParameter ObjectID=\"f34e890\" name=\"filterMap\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.4\"/>\n" + 
				"        <stateMachine ObjectID=\"f467557\" name=\"YStateMachinef467557\"/>\n" + 
				"      </ownedOperation>\n" + 
				"      <ownedOperation ObjectID=\"f7b77c9\" name=\"peek\" clazz=\"//@packages.1/@ownedMemberPackage.1\" returnType=\"//@packages.1/@ownedMemberPackage.2\">\n" + 
				"        <ownedParameter ObjectID=\"f310db4\" name=\"filterMap\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.4\"/>\n" + 
				"        <stateMachine ObjectID=\"f549a88\" name=\"YStateMachinef549a88\"/>\n" + 
				"      </ownedOperation>\n" + 
				"      <ownedOperation ObjectID=\"f275fe\" name=\"addWithDelay\" clazz=\"//@packages.1/@ownedMemberPackage.1\">\n" + 
				"        <ownedParameter ObjectID=\"f2f3872\" name=\"object\" isUnique=\"true\" type=\"//@packages.1/@ownedMemberPackage.2\"/>\n" + 
				"        <ownedParameter ObjectID=\"f8dd49\" name=\"delay\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\n" + 
				"        <ownedParameter ObjectID=\"f468ab9\" name=\"timeStep\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\n" + 
				"        <stateMachine ObjectID=\"f48a287\" name=\"YStateMachinef48a287\">\n" + 
				"          <transition ObjectID=\"f58fd62\" name=\"YTransitionf58fd62\" source=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.3/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.3/@stateMachine/@subvertex.1\" attachment=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.3/@stateMachine/@trAttach.0\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f4b5238\" name=\"YPseudostatef4b5238\" outgoing=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.3/@stateMachine/@transition.0\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f5e46aa\" name=\"YFinalStatef5e46aa\" incoming=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.3/@stateMachine/@transition.0\"/>\n" + 
				"          <trAttach ObjectID=\"f459b0\" name=\"YTrAttachmentf459b0\" transition=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.3/@stateMachine/@transition.0\" guardStringRep=\"true;\">\n" + 
				"            <effects ObjectID=\"f3af920\" effectStringRep=\"var_objectManagment = getObjectManagement();\"/>\n" + 
				"            <effects ObjectID=\"f3726ea\" effectStringRep=\"(var_objectManagment as online.yamm.ObjectManagement).addDelayedQueueElement(this, object, 1);\"/>\n" + 
				"            <effects ObjectID=\"f59be5a\" effectStringRep=\"delayed.add(object);\"/>\n" + 
				"            <effects ObjectID=\"f6f18ad\" effectStringRep=\"event = new Delay;\"/>\n" + 
				"            <effects ObjectID=\"f28d54b\" effectStringRep=\"event.timeStep = timeStep + delay;\"/>\n" + 
				"            <effects ObjectID=\"f3ae638\" effectStringRep=\"event.objectAttached = object;\"/>\n" + 
				"            <effects ObjectID=\"f5109cb\" effectStringRep=\"event.receivingObject = this;\"/>\n" + 
				"          </trAttach>\n" + 
				"        </stateMachine>\n" + 
				"      </ownedOperation>\n" + 
				"      <ownedOperation ObjectID=\"f764840\" name=\"simulate\" clazz=\"//@packages.1/@ownedMemberPackage.1\" returnType=\"//@packages.0/@ownedMemberPackage.2\">\n" + 
				"        <ownedParameter ObjectID=\"f68416a\" name=\"timeStep\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\n" + 
				"        <stateMachine ObjectID=\"f7e7e66\" name=\"YStateMachinef7e7e66\">\n" + 
				"          <transition ObjectID=\"f2b7fa1\" name=\"YTransitionf2b7fa1\" source=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.2\" target=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.0\" attachment=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@trAttach.0\"/>\n" + 
				"          <transition ObjectID=\"f4bfb83\" name=\"YTransitionf4bfb83\" source=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.1\" attachment=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@trAttach.1\"/>\n" + 
				"          <transition ObjectID=\"f78cae7\" name=\"YTransitionf78cae7\" source=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.1\" target=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.3\" attachment=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@trAttach.2\"/>\n" + 
				"          <transition ObjectID=\"f3b1426\" name=\"YTransitionf3b1426\" source=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.1\" target=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.3\" attachment=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@trAttach.3\"/>\n" + 
				"          <transition ObjectID=\"f411019\" name=\"YTransitionf411019\" source=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@subvertex.3\" attachment=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@trAttach.4\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"fe5506\" name=\"YStatefe5506\" outgoing=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.1 //@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.4\" incoming=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.0\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f4cf3d0\" name=\"YStatef4cf3d0\" outgoing=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.2 //@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.3\" incoming=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.1\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f384d51\" name=\"YPseudostatef384d51\" outgoing=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.0\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f2e7b01\" name=\"YFinalStatef2e7b01\" incoming=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.2 //@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.3 //@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.4\"/>\n" + 
				"          <trAttach ObjectID=\"f14e78f\" name=\"YTrAttachmentf14e78f\" transition=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.0\" guardStringRep=\"true;\">\n" + 
				"            <effects ObjectID=\"f48c6c2\" effectStringRep=\"event = DES.EventQueue.peek(timeStep, true, null, this, null);\"/>\n" + 
				"          </trAttach>\n" + 
				"          <trAttach ObjectID=\"f1e9b4e\" name=\"YTrAttachmentf1e9b4e\" transition=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.1\" guardStringRep=\"event != null;\"/>\n" + 
				"          <trAttach ObjectID=\"f5eb936\" name=\"YTrAttachmentf5eb936\" transition=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.2\" guardStringRep=\"event instanceof Delay;\">\n" + 
				"            <effects ObjectID=\"f2c724a\" effectStringRep=\"DES.EventQueue.consume(timeStep, true, null, this, null);\"/>\n" + 
				"            <effects ObjectID=\"fe6655\" effectStringRep=\"(var_objectManagment as online.yamm.ObjectManagement).removeDelayedQueueElement(this, event.objectAttached, 1);\"/>\n" + 
				"            <effects ObjectID=\"fb8378\" effectStringRep=\"add(event.objectAttached);\"/>\n" + 
				"            <effects ObjectID=\"f271ec5\" effectStringRep=\"setReturnValue(true);\"/>\n" + 
				"          </trAttach>\n" + 
				"          <trAttach ObjectID=\"f3696b8\" name=\"YTrAttachmentf3696b8\" transition=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.3\" guardStringRep=\"!(event instanceof Delay);\">\n" + 
				"            <effects ObjectID=\"f430192\" effectStringRep=\"setReturnValue(false);\"/>\n" + 
				"          </trAttach>\n" + 
				"          <trAttach ObjectID=\"f11f883\" name=\"YTrAttachmentf11f883\" transition=\"//@packages.1/@ownedMemberPackage.1/@ownedOperation.4/@stateMachine/@transition.4\" guardStringRep=\"event == null;\">\n" + 
				"            <effects ObjectID=\"f41db92\" effectStringRep=\"setReturnValue(false);\"/>\n" + 
				"          </trAttach>\n" + 
				"        </stateMachine>\n" + 
				"      </ownedOperation>\n" + 
				"    </ownedMemberPackage>\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f40b04f\" name=\"SimulationObject\" package=\"//@packages.1\" superClass=\"//@clazz.0\">\n" + 
				"      <ownedAttribute ObjectID=\"f555e10\" name=\"name\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.3\" clazz=\"//@packages.1/@ownedMemberPackage.2\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f4ab302\" name=\"active\" type=\"//@packages.0/@ownedMemberPackage.2\" clazz=\"//@packages.1/@ownedMemberPackage.2\"/>\n" + 
				"      <ownedOperation ObjectID=\"f10ddfa\" name=\"simulate\" clazz=\"//@packages.1/@ownedMemberPackage.2\" returnType=\"//@packages.0/@ownedMemberPackage.2\">\n" + 
				"        <ownedParameter ObjectID=\"f7873fc\" name=\"timeStep\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\n" + 
				"        <stateMachine ObjectID=\"f2ac9f0\" name=\"YStateMachinef2ac9f0\">\n" + 
				"          <transition ObjectID=\"f79f4b8\" name=\"YTransitionf79f4b8\" source=\"//@packages.1/@ownedMemberPackage.2/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.2/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@packages.1/@ownedMemberPackage.2/@ownedOperation.0/@stateMachine/@trAttach.0\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f68bf82\" name=\"YPseudostatef68bf82\" outgoing=\"//@packages.1/@ownedMemberPackage.2/@ownedOperation.0/@stateMachine/@transition.0\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f68c2fb\" name=\"YFinalStatef68c2fb\" incoming=\"//@packages.1/@ownedMemberPackage.2/@ownedOperation.0/@stateMachine/@transition.0\"/>\n" + 
				"          <trAttach ObjectID=\"f352f8d\" name=\"YTrAttachmentf352f8d\" transition=\"//@packages.1/@ownedMemberPackage.2/@ownedOperation.0/@stateMachine/@transition.0\" guardStringRep=\"true;\">\n" + 
				"            <effects ObjectID=\"f284471\" effectStringRep=\"setReturnValue(false);\"/>\n" + 
				"          </trAttach>\n" + 
				"        </stateMachine>\n" + 
				"      </ownedOperation>\n" + 
				"    </ownedMemberPackage>\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f2a26c9\" name=\"Event\" package=\"//@packages.1\" superClass=\"//@clazz.0\">\n" + 
				"      <ownedAttribute ObjectID=\"f3128f5\" name=\"timeStep\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@packages.1/@ownedMemberPackage.3\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f4063c7\" name=\"receivingType\" isUnique=\"true\" type=\"//@clazz.1\" clazz=\"//@packages.1/@ownedMemberPackage.3\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f197074\" name=\"description\" type=\"//@packages.0/@ownedMemberPackage.3\" clazz=\"//@packages.1/@ownedMemberPackage.3\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f94f5c\" name=\"receivingObject\" association=\"true\" isUnique=\"true\" type=\"//@packages.1/@ownedMemberPackage.2\" clazz=\"//@packages.1/@ownedMemberPackage.3\">\n" + 
				"        <ownedElement xsi:type=\"yammDiagram:YParameter\" ObjectID=\"f465861\" name=\"timeStep\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\n" + 
				"      </ownedAttribute>\n" + 
				"      <ownedAttribute ObjectID=\"f210054\" name=\"objectAttached\" association=\"true\" isUnique=\"true\" type=\"//@packages.1/@ownedMemberPackage.2\" clazz=\"//@packages.1/@ownedMemberPackage.3\"/>\n" + 
				"      <ownedOperation ObjectID=\"f6b9c0b\" name=\"toString\" clazz=\"//@packages.1/@ownedMemberPackage.3\" returnType=\"//@packages.0/@ownedMemberPackage.3\">\n" + 
				"        <stateMachine ObjectID=\"f694554\" name=\"YStateMachinef694554\">\n" + 
				"          <transition ObjectID=\"f76f663\" name=\"YTransitionf76f663\" source=\"//@packages.1/@ownedMemberPackage.3/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.3/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@packages.1/@ownedMemberPackage.3/@ownedOperation.0/@stateMachine/@trAttach.0\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f759d05\" name=\"YPseudostatef759d05\" outgoing=\"//@packages.1/@ownedMemberPackage.3/@ownedOperation.0/@stateMachine/@transition.0\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f190b71\" name=\"YFinalStatef190b71\" incoming=\"//@packages.1/@ownedMemberPackage.3/@ownedOperation.0/@stateMachine/@transition.0\"/>\n" + 
				"          <trAttach ObjectID=\"f776ef5\" name=\"YTrAttachmentf776ef5\" transition=\"//@packages.1/@ownedMemberPackage.3/@ownedOperation.0/@stateMachine/@transition.0\" guardStringRep=\"true;\">\n" + 
				"            <effects ObjectID=\"f1ac343\" effectStringRep=\"setReturnValue(&quot;TODO: Event.toString()&quot;);\"/>\n" + 
				"          </trAttach>\n" + 
				"        </stateMachine>\n" + 
				"      </ownedOperation>\n" + 
				"    </ownedMemberPackage>\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f5961ed\" name=\"Randomizer\" package=\"//@packages.1\" superClass=\"//@clazz.0\">\n" + 
				"      <ownedAttribute ObjectID=\"f49b547\" name=\"random\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.4\" clazz=\"//@clazz.12\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f13e889\" name=\"USE_GAUSSIAN\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.2\" clazz=\"//@packages.1/@ownedMemberPackage.4\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f66b9ac\" name=\"i\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@packages.1/@ownedMemberPackage.4\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f19d97b\" name=\"prob2Int\" association=\"true\" upper=\"-1\" type=\"//@packages.1/@ownedMemberPackage.5\" clazz=\"//@packages.1/@ownedMemberPackage.4\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f41fa4e\" name=\"entry\" association=\"true\" isUnique=\"true\" type=\"//@packages.1/@ownedMemberPackage.5\" clazz=\"//@packages.1/@ownedMemberPackage.4\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f7d11a1\" name=\"r\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.1\" clazz=\"//@packages.1/@ownedMemberPackage.4\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f672a3d\" name=\"x\" isUnique=\"true\" defaultValue=\"&quot;0&quot;\" type=\"//@packages.0/@ownedMemberPackage.1\" clazz=\"//@packages.1/@ownedMemberPackage.4\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f64dcec\" name=\"sumAllProp\" isUnique=\"true\" defaultValue=\"&quot;0&quot;\" type=\"//@packages.0/@ownedMemberPackage.1\" clazz=\"//@packages.1/@ownedMemberPackage.4\"/>\n" + 
				"      <ownedOperation ObjectID=\"f27d00b\" name=\"addProbInt\" clazz=\"//@packages.1/@ownedMemberPackage.4\">\n" + 
				"        <ownedParameter ObjectID=\"f46955f\" name=\"to\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.1\"/>\n" + 
				"        <ownedParameter ObjectID=\"f547076\" name=\"value\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\"/>\n" + 
				"        <stateMachine ObjectID=\"f7f9230\" name=\"YStateMachinef7f9230\">\n" + 
				"          <transition ObjectID=\"f16bfc2\" name=\"YTransitionf16bfc2\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.0/@stateMachine/@trAttach.0\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f5ef90\" name=\"YPseudostatef5ef90\" outgoing=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.0/@stateMachine/@transition.0\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f3b08da\" name=\"YFinalStatef3b08da\" incoming=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.0/@stateMachine/@transition.0\"/>\n" + 
				"          <trAttach ObjectID=\"f4c947d\" name=\"YTrAttachmentf4c947d\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.0/@stateMachine/@transition.0\" guardStringRep=\"true;\">\n" + 
				"            <effects ObjectID=\"f46566a\" effectStringRep=\"sumAllProp = sumAllProp + to;\"/>\n" + 
				"            <effects ObjectID=\"f4dc7ba\" effectStringRep=\"prob2Int.add(new Probability2Value);\"/>\n" + 
				"            <effects ObjectID=\"f20b257\" effectStringRep=\"prob2Int.get(prob2Int.size - 1).probabilityUpperLimit = to;\"/>\n" + 
				"            <effects ObjectID=\"f5793d3\" effectStringRep=\"prob2Int.get(prob2Int.size - 1).value = value;\"/>\n" + 
				"          </trAttach>\n" + 
				"        </stateMachine>\n" + 
				"      </ownedOperation>\n" + 
				"      <ownedOperation ObjectID=\"f66c63\" name=\"nextInt\" clazz=\"//@packages.1/@ownedMemberPackage.4\" returnType=\"//@packages.0/@ownedMemberPackage.0\">\n" + 
				"        <stateMachine ObjectID=\"f30aac5\" name=\"YStateMachinef30aac5\">\n" + 
				"          <transition ObjectID=\"f5626fe\" name=\"YTransitionf5626fe\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.2\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@trAttach.0\"/>\n" + 
				"          <transition ObjectID=\"f43cf6d\" name=\"YTransitionf43cf6d\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.0\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.2\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@trAttach.1\"/>\n" + 
				"          <transition ObjectID=\"f532d9a\" name=\"YTransitionf532d9a\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.5\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.3\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@trAttach.2\"/>\n" + 
				"          <transition ObjectID=\"f1d935c\" name=\"YTransitionf1d935c\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.4\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.3\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@trAttach.3\"/>\n" + 
				"          <transition ObjectID=\"f7c9630\" name=\"YTransitionf7c9630\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.3\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.4\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@trAttach.4\"/>\n" + 
				"          <transition ObjectID=\"f146bd8\" name=\"YTransitionf146bd8\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.3\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.1\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@trAttach.5\"/>\n" + 
				"          <transition ObjectID=\"f19a4e3\" name=\"YTransitionf19a4e3\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.4\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.1\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@trAttach.6\"/>\n" + 
				"          <transition ObjectID=\"f1440f2\" name=\"YTransitionf1440f2\" source=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.2\" target=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@subvertex.5\" attachment=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@trAttach.7\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f311e7\" name=\"YPseudostatef311e7\" outgoing=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.0 //@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.1\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f4ede39\" name=\"YFinalStatef4ede39\" incoming=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.5 //@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.6\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f1c1425\" name=\"YStatef1c1425\" outgoing=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.7\" incoming=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.0 //@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.1\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f6c9142\" name=\"YStatef6c9142\" outgoing=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.4 //@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.5\" incoming=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.2 //@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.3\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f6995d3\" name=\"YStatef6995d3\" outgoing=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.3 //@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.6\" incoming=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.4\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f577f47\" name=\"YStatef577f47\" outgoing=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.2\" incoming=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.7\"/>\n" + 
				"          <trAttach ObjectID=\"f59536\" name=\"YTrAttachmentf59536\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.0\" guardStringRep=\"USE_GAUSSIAN;\">\n" + 
				"            <effects ObjectID=\"f6de5ab\" effectStringRep=\"r = (random as java.util.Random).nextGaussian;\"/>\n" + 
				"          </trAttach>\n" + 
				"          <trAttach ObjectID=\"f70685\" name=\"YTrAttachmentf70685\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.1\" guardStringRep=\"!USE_GAUSSIAN;\">\n" + 
				"            <effects ObjectID=\"f325de1\" effectStringRep=\"r = (random as java.util.Random).nextDouble;\"/>\n" + 
				"          </trAttach>\n" + 
				"          <trAttach ObjectID=\"f2dd09a\" name=\"YTrAttachmentf2dd09a\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.2\" guardStringRep=\"true;\">\n" + 
				"            <effects ObjectID=\"f2050fd\" effectStringRep=\"x = 0;\"/>\n" + 
				"            <effects ObjectID=\"f728e4a\" effectStringRep=\"i = 0;\"/>\n" + 
				"          </trAttach>\n" + 
				"          <trAttach ObjectID=\"f654c2c\" name=\"YTrAttachmentf654c2c\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.3\" guardStringRep=\"r > entry.probabilityUpperLimit + x;\"/>\n" + 
				"          <trAttach ObjectID=\"f177a55\" name=\"YTrAttachmentf177a55\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.4\" guardStringRep=\"i &lt; prob2Int.size;\">\n" + 
				"            <effects ObjectID=\"f2bde0d\" effectStringRep=\"entry = prob2Int.get(i++);\"/>\n" + 
				"            <effects ObjectID=\"f4be425\" effectStringRep=\"x = x + entry.probabilityUpperLimit;\"/>\n" + 
				"          </trAttach>\n" + 
				"          <trAttach ObjectID=\"f34e904\" name=\"YTrAttachmentf34e904\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.5\" guardStringRep=\"i >= prob2Int.size;\">\n" + 
				"            <effects ObjectID=\"f1b61b9\" effectStringRep=\"setReturnValue(0);\"/>\n" + 
				"          </trAttach>\n" + 
				"          <trAttach ObjectID=\"f6e4855\" name=\"YTrAttachmentf6e4855\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.6\" guardStringRep=\"r &lt;= entry.probabilityUpperLimit + x;\">\n" + 
				"            <effects ObjectID=\"f7a9b6f\" effectStringRep=\"setReturnValue(entry.value);\"/>\n" + 
				"          </trAttach>\n" + 
				"          <trAttach ObjectID=\"f7758dd\" name=\"YTrAttachmentf7758dd\" transition=\"//@packages.1/@ownedMemberPackage.4/@ownedOperation.1/@stateMachine/@transition.7\" guardStringRep=\"true;\">\n" + 
				"            <effects ObjectID=\"f5dc2c3\" effectStringRep=\"r = r * sumAllProp;\"/>\n" + 
				"          </trAttach>\n" + 
				"        </stateMachine>\n" + 
				"      </ownedOperation>\n" + 
				"    </ownedMemberPackage>\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f6019cc\" name=\"Probability2Value\" package=\"//@packages.1\" superClass=\"//@clazz.0\">\n" + 
				"      <ownedAttribute ObjectID=\"f5512dc\" name=\"probabilityUpperLimit\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.1\" clazz=\"//@packages.1/@ownedMemberPackage.5\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f6e635c\" name=\"value\" isUnique=\"true\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@packages.1/@ownedMemberPackage.5\"/>\n" + 
				"    </ownedMemberPackage>\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f67d23f\" name=\"Delay\" package=\"//@packages.1\" superClass=\"//@clazz.0 //@packages.1/@ownedMemberPackage.3\"/>\n" + 
				"  </packages>\n" + 
				"  <packages ObjectID=\"f59cafd\" name=\"Observer\">\n" + 
				"    <ownedMemberPackage xsi:type=\"yammDiagram:YClass\" ObjectID=\"f3ecad1\" name=\"ObserverA\" package=\"//@packages.2\" superClass=\"//@clazz.0\">\n" + 
				"      <ownedAttribute ObjectID=\"f7ed1bd\" name=\"i\" type=\"//@packages.0/@ownedMemberPackage.0\" clazz=\"//@packages.2/@ownedMemberPackage.0\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f4a6b7e\" name=\"aaaaaa\" type=\"//@clazz.2\" clazz=\"//@packages.2/@ownedMemberPackage.0\"/>\n" + 
				"      <ownedAttribute ObjectID=\"f737395\" name=\"gravelShipping\" association=\"true\" type=\"//@clazz.12\" clazz=\"//@packages.2/@ownedMemberPackage.0\"/>\n" + 
				"      <ownedOperation ObjectID=\"f1a6920\" name=\"StepObserver\" clazz=\"//@packages.2/@ownedMemberPackage.0\">\n" + 
				"        <stateMachine ObjectID=\"fec090\" name=\"YStateMachinefec090\" initialActive=\"true\" rtc=\"observer\">\n" + 
				"          <transition ObjectID=\"f5b475f\" name=\"YTransitionf5b475f\" source=\"//@packages.2/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@subvertex.3\" target=\"//@packages.2/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@subvertex.2\" attachment=\"//@packages.2/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@trAttach.0\"/>\n" + 
				"          <transition ObjectID=\"f297490\" name=\"YTransitionf297490\" source=\"//@packages.2/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@subvertex.2\" target=\"//@packages.2/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@subvertex.4\"/>\n" + 
				"          <transition ObjectID=\"f3742fb\" name=\"YTransitionf3742fb\" source=\"//@packages.2/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@packages.2/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@subvertex.3\" attachment=\"//@packages.2/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@trAttach.2\"/>\n" + 
				"          <transition ObjectID=\"f7cee32\" name=\"YTransitionf7cee32\" source=\"//@packages.2/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@subvertex.0\" target=\"//@packages.2/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@subvertex.2\" attachment=\"//@packages.2/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@trAttach.3\"/>\n" + 
				"          <transition ObjectID=\"f69580f\" name=\"YTransitionf69580f\" source=\"//@packages.2/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@subvertex.4\" target=\"//@packages.2/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@packages.2/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@trAttach.4\"/>\n" + 
				"          <transition ObjectID=\"f531506\" name=\"YTransitionf531506\" source=\"//@packages.2/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@subvertex.4\" target=\"//@packages.2/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@subvertex.1\" attachment=\"//@packages.2/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@trAttach.5\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YPseudostate\" ObjectID=\"f43f11\" name=\"YPseudostatef43f11\" outgoing=\"//@packages.2/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@transition.2 //@packages.2/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@transition.3\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YFinalState\" ObjectID=\"f512911\" name=\"YFinalStatef512911\" incoming=\"//@packages.2/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@transition.4 //@packages.2/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@transition.5\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f17ebbe\" name=\"YStatef17ebbe\" outgoing=\"//@packages.2/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@transition.1\" incoming=\"//@packages.2/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@transition.0 //@packages.2/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@transition.3\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f2e8817\" name=\"YStatef2e8817\" outgoing=\"//@packages.2/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@transition.0\" incoming=\"//@packages.2/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@transition.2\"/>\n" + 
				"          <subvertex xsi:type=\"yammDiagram:YState\" ObjectID=\"f4f649a\" name=\"YStatef4f649a\" outgoing=\"//@packages.2/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@transition.4 //@packages.2/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@transition.5\" incoming=\"//@packages.2/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@transition.1\"/>\n" + 
				"          <trAttach ObjectID=\"fd33b1\" name=\"YTrAttachmentfd33b1\" transition=\"//@packages.2/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@transition.0\" guardStringRep=\"gravelShipping = (getInstances(1, &quot;GravelShipping&quot;) as java.util.List&lt;GravelShipping>).get(0); gravelShipping != null;\"/>\n" + 
				"          <trAttach ObjectID=\"f3dc57f\" name=\"YTrAttachmentf3dc57f\" guardStringRep=\"true;\">\n" + 
				"            <effects ObjectID=\"f4187fc\" effectStringRep=\"observerAddValue(&quot;valueA&quot;, var_i++);\"/>\n" + 
				"            <effects ObjectID=\"f5d5802\" effectStringRep=\"//Print(&quot;timeStep: &quot; + yTimeStep + &quot; gravel to ship: &quot; + gravelShipping._gravelToShip);\"/>\n" + 
				"          </trAttach>\n" + 
				"          <trAttach ObjectID=\"f2b9ec5\" name=\"YTrAttachmentf2b9ec5\" transition=\"//@packages.2/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@transition.2\" guardStringRep=\"gravelShipping == null;\"/>\n" + 
				"          <trAttach ObjectID=\"f6e6834\" name=\"YTrAttachmentf6e6834\" transition=\"//@packages.2/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@transition.3\" guardStringRep=\"gravelShipping != null;\"/>\n" + 
				"          <trAttach ObjectID=\"f6bec36\" name=\"YTrAttachmentf6bec36\" transition=\"//@packages.2/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@transition.4\" guardStringRep=\"gravelShipping._gravelToShip == 0;\">\n" + 
				"            <effects ObjectID=\"f78d274\" effectStringRep=\"Print(&quot;-------------------------------------------------------------&quot;);\"/>\n" + 
				"          </trAttach>\n" + 
				"          <trAttach ObjectID=\"fdcbe3\" name=\"YTrAttachmentfdcbe3\" transition=\"//@packages.2/@ownedMemberPackage.0/@ownedOperation.0/@stateMachine/@transition.5\" guardStringRep=\"gravelShipping._gravelToShip != 0;\"/>\n" + 
				"        </stateMachine>\n" + 
				"      </ownedOperation>\n" + 
				"    </ownedMemberPackage>\n" + 
				"  </packages>\n" + 
				"</yammDiagram:YModel>\n" + 
				"";
		return GRAVEL_SHIPPING;
	}

}
