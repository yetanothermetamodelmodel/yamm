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
package online.yamm.gui;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.StringTokenizer;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;

import online.yamm.ResourceManagement;
import online.yamm.coreModelXmi.yamm.YClass;
import online.yamm.coreModelXmi.yamm.YEffect;
import online.yamm.coreModelXmi.yamm.YModel;
import online.yamm.coreModelXmi.yamm.YProperty;
import online.yamm.coreModelXmi.yamm.YState;
import online.yamm.coreModelXmi.yamm.YStateMachine;
import online.yamm.coreModelXmi.yamm.YTrAttachment;
import online.yamm.coreModelXmi.yamm.YTransition;
import online.yamm.coreModelXmi.yamm.YType;
import online.yamm.coreModelXmi.yamm.YammFactory;
import online.yamm.coreModelXmi.yamm.YammPackage;
import online.yamm.coreModelXmi.yamm.impl.YammPackageImpl;
import online.yamm.ecj.ParameterManagement;
import online.yamm.logger.YAMMLogger;

/**
 * in case SEARCH muss noch etwas angepasst werden:
 	 	//													if (effect.getEffect() != null) 
		//													{
		//														boolean found = false;
		//														int stringCounter = 0;
		//														while (found == false && stringCounter < parameterList.size()) 
		//														{
		//															if (effect.getEffect().contains(parameterList.get(stringCounter))) 
		//															{
		//																found = true;
		//																if (shouldBeColored)
		//																	effects.add((Effect) eObject);
		//																logger.debug("Found \"".concat(parameterList.get(stringCounter))
		//																		.concat("\" in Effect (OID:").concat(effect.getObjectID()).concat(") \"")
		//																		.concat(effect.getEffect().trim()).concat("\" on layer ") + (layerNumber+1) + ".", false, false);	
		//															}
		//															stringCounter++;
		//														}
		//													}
 *      UND:
		//													if (trAttachment.getGuard() != null && !trAttachment.getGuard().isEmpty()) 
		//													{
		//														boolean found = false;
		//														int stringCounter = 0;
		//														while (found == false && stringCounter < parameterList.size()) 
		//														{
		//															if (trAttachment.getGuard().contains(parameterList.get(stringCounter)))
		//															{
		//																found = true;
		//																logger.debug("Found \"".concat(parameterList.get(stringCounter))
		//																		.concat("\" in Guard(-name) (OID - TRAttachment :")
		//																		.concat(trAttachment.getObjectID()).concat(") \"")
		//																		.concat(trAttachment.getGuard().trim())
		//																		.concat("\" on layer ") + (layerNumber+1) + ".", false, false);
		//																if (shouldBeColored)
		//																	trAttachments.add(trAttachment);
		//															}
		//															stringCounter++;
		//														}
		//													}
		//												}
 *
 *    Das Einf�rben funktioniert nicht (drei stellen, ModifyRmofDiagram...)
 *    
 *    loadResource funkioniert vielleicht nicht. Wir nur beutzt wenn man IMPORT eingibt(?)
 * 
 *
 */
public class TextInputField 
{
	private Text nsURIField;
	private enum searchANDExecutemode {UNDEFINED, SEARCH, CLEAR, DASH , LS, CD, IMPORT, GENERATE};
	public static final String SYNTAX_SEARCH_AND_EXECUTE = 
			"Syntax: search Expression_1:String [Expression_2:String] ... [Expression_N:String]\n" +
					"| clear\n" + 
					"| generate <layer>?<class>[<subclass1, subclass2, *>] // Left-Hand Site Part1 - if subclasses are specified only those are matched\n" +
					"\t{<attribute>=<value1, value2, *>; *} // Left-Hand Site Part2 - can be empty {} //\n" +
					"\t when <attribute>=objectID all ObjectIDs are stored for referencing purposes\n" + 
					"\t!{<attribute>=<value>; <method e.g, connectAllLooseEnds>*} // Right-Hand Site (fix) //\n" +

					"\t+{<attribute>[<subclass1, subclass2, *>][=<value1, value2, *>]; *} // Right-Hand Site (generated) only subclasses are created and only values are used if specified //\n" +
					"\t// an attribute can use \".\" notation e.g., a.b.c and indexes e.g., a[4], a[4,6,8], a[4-99]\n" +
					"\t// an attribute can have a reference assigned e.g., c is a reference to a.b in a.b/c for example used as value as in d=/b\n" +

					"\t// <value> are e.g., 3, 3.1415, \"Hello\"\n" +

					"\tpath,p = // absolute path to store files //\n" +
					"\tparamspath,pp = // absolute path to store parameter file //\n" +
					"\tparamspathprefix,ppp = // prefix used in parameter file (e.g., online.yamm.yammAnalysisComplexTypes.) //\n" +
					"| softreset | dash [TransitionID layer] | ls | cd <dir>\n" +
					"| import <yammSource:File> <yammTarget:File> <dryRun:Boolean> <dummyClass:Boolean> <yammClass>*";	
	
	private String SearchAndExecuteDirectory = ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString();
	private ArrayList<String> searchAndExecuteHistory = new ArrayList<String>();
	private Integer searchAndExecuteHistoryIndex = new Integer (0);
	
	// for search input field directory completion
	private ArrayList<String> toBeConsidered = null;
	private String previousSearchString = null;
	private String lastWord = null;
	private int toBeConsideredIndex = 0;
	private int lastSeparator = 0;
	private String absolutePath = null;
	public static YAMMLogger logger = YAMMLogger.getYAMMLogger("YAMM Log");
	public static ResourceManagement resManagement ;
	
	/**
	 * A constructor accepting a {@code Composite} instance.
	 * 
	 * @param parent	:	the text input field
	 */
	public TextInputField (Composite parent, ResourceManagement resManagement) 
	{
		this.resManagement = resManagement;
		createSearchAndExecuteField(parent);
	}
			
	private void createSearchAndExecuteField(Composite parent) 
	{
		nsURIField = new Text(parent, SWT.MULTI | SWT.BORDER | SWT.WRAP | SWT.V_SCROLL | SWT.RESIZE);
		nsURIField.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, true));
		nsURIField.setText(SYNTAX_SEARCH_AND_EXECUTE);
		nsURIField.setForeground(new Color(null, 137, 137, 137));
		nsURIField.addMouseListener(new MouseListener() {

			@Override
			public void mouseDoubleClick(MouseEvent e) 
			{
				nsURIField.setForeground(new Color(null, 137, 137, 137));
				nsURIField.setText(SYNTAX_SEARCH_AND_EXECUTE);
			}

			@Override
			public void mouseDown(MouseEvent e) 
			{
				if (nsURIField.getText().startsWith("Syntax: ")) 
				{
					nsURIField.setText("");
					nsURIField.setForeground(new Color(null, 0, 0, 0));
				}
			}

			@Override
			public void mouseUp(MouseEvent e) 
			{
			}
		});

		nsURIField.addKeyListener(new KeyListener() 
		{
			@SuppressWarnings("unchecked")
			@Override
			public void keyReleased(KeyEvent e) 
			{
				ArrayList<YEffect> effects = new ArrayList<YEffect>();
				ArrayList<YState> states = new ArrayList<YState>();
				ArrayList<YTransition> transitions = new ArrayList<YTransition>();
				ArrayList<YStateMachine> stateMachines = new ArrayList<YStateMachine>();
				ArrayList<YTrAttachment> trAttachments = new ArrayList<YTrAttachment>();

				int key = e.character;
				if (key == 0) {
					key = e.keyCode;
				}
				else
				{
					if (0 <= key && key <= 0x1F)
					{
						if ((e.stateMask & SWT.CTRL) != 0) {
							key += 0x40;
						}
					} 
					else
					{
						if ('a' <= key && key <= 'z') {
							key -= 'a' - 'A';
						}
					}
				}
				int mods = e.stateMask & SWT.MODIFIER_MASK;
				int accelerator = mods + key;

				absolutePath = "";
				String searchFileName = "";
				String searchInput = nsURIField.getText();	

				if (accelerator == 262219) //ctrl+k
				{
					if (searchAndExecuteHistoryIndex > 0) 
					{
						searchAndExecuteHistoryIndex--;
						nsURIField.setText(searchAndExecuteHistory.get(searchAndExecuteHistoryIndex));
						nsURIField.setSelection(searchAndExecuteHistory.get(searchAndExecuteHistoryIndex)
								.length(), searchAndExecuteHistory.get(searchAndExecuteHistoryIndex).length());
					}
					return;
				} 
				else if (accelerator == 262220) //ctrl+l 
				{
					
					if (searchAndExecuteHistoryIndex < searchAndExecuteHistory.size()) 
					{
						searchAndExecuteHistoryIndex++;
						nsURIField.setText(searchAndExecuteHistory.get(searchAndExecuteHistoryIndex));
						nsURIField.setSelection(searchAndExecuteHistory.get(searchAndExecuteHistoryIndex).length(), searchAndExecuteHistory
								.get(searchAndExecuteHistoryIndex).length());
					} 
					else if (searchAndExecuteHistoryIndex == searchAndExecuteHistory.size())
					{
						nsURIField.setText("");
					}
					return;
				}
				else if (accelerator == 262214 // ctrl+f
						&& (searchInput.startsWith("cd") 
								|| searchInput.startsWith("ls") 
								|| searchInput.startsWith("import") 
								|| searchInput.startsWith("generate"))) 
				{
					if ((previousSearchString == null || !previousSearchString.equals(searchInput))) 
					{
						// determine last word
						lastWord = searchInput.lastIndexOf(" ") != -1 ? searchInput.substring(searchInput.lastIndexOf(" ") + 1)
								.replace("/", "\\") : "";
						if (lastWord.isEmpty()) 
						{
							return;
						}
						// determine absolute path
						absolutePath = lastWord;
						if (!checkIfRootDirectory(new File(lastWord), true)) 
						{
							absolutePath = SearchAndExecuteDirectory + "\\" + lastWord;			
						}
						// dissolve ".." relationships
						try {
							absolutePath = dissolveDoubleDots(absolutePath);
						} 
						catch (Exception e1) 
						{
							return;
						}

						lastSeparator = absolutePath.lastIndexOf("\\");
						if (lastSeparator < absolutePath.length()) 
						{
							searchFileName = absolutePath.substring(lastSeparator+1, absolutePath.length());
							absolutePath = absolutePath.substring(0, lastSeparator);
						}
						else 
						{
							if (absolutePath.startsWith(SearchAndExecuteDirectory)) 
							{
								absolutePath = absolutePath.substring(0, SearchAndExecuteDirectory.length());
							}
							String newText = searchInput.substring(0, searchInput.length() - lastWord.length()).concat(absolutePath);
							nsURIField.setText(newText);
							nsURIField.setSelection(newText.length(), newText.length());
						}
						File currentDirectory = new File(absolutePath);
						String[] filenames = currentDirectory.list();
						toBeConsidered = new ArrayList<String>();
						toBeConsideredIndex = 0;
						for (int i = 0; i < filenames.length; i++) 
						{
							String filename = filenames[i];
							File file = new File(absolutePath + "\\" + filename);
							if (searchFileName.equals("*") || file.canRead() && filename.startsWith(searchFileName)) 
							{
								toBeConsidered.add(filename);
							}	
						}
						previousSearchString = searchInput;

						if (toBeConsidered.size() > 0) 
						{
							if (toBeConsideredIndex >= toBeConsidered.size()) 
							{
								toBeConsideredIndex = 0;
							} 
							if (absolutePath.startsWith(SearchAndExecuteDirectory))
							{
								absolutePath = absolutePath.substring(SearchAndExecuteDirectory.length(), absolutePath.length());
								absolutePath = absolutePath.length() > 0 && absolutePath.charAt(0) == '\\' ?
										absolutePath.substring(1, absolutePath.length()) 
										: absolutePath;
							}
							if (!absolutePath.isEmpty()) 
							{
								absolutePath = absolutePath + "\\";
							}
							String newText = searchInput.substring(0, searchInput.length() - lastWord.length()) + absolutePath 
									+ toBeConsidered.get(toBeConsideredIndex);
							nsURIField.setText(newText);
							nsURIField.setSelection(newText.length(), newText.length());
							previousSearchString = newText;
							toBeConsideredIndex++;
						}
					}
					return;
				}
				else if (false)//accelerator == 262232 || accelerator == 524288) // ctrl+x
				{
					StringTokenizer stringTokenizer = new StringTokenizer(searchInput);
					int stringPosition = 0;
					ArrayList<String> parameterList = new ArrayList<String>();
					searchANDExecutemode mode = searchANDExecutemode.UNDEFINED;
					String transitionIDForDash = "";
					Integer layerForDash = 0; 
					boolean parseError = false;

					while (stringTokenizer.hasMoreTokens() 
							&& mode != searchANDExecutemode.CLEAR 
							&& mode != searchANDExecutemode.GENERATE 
							&& !parseError) 
					{
						String currentToken = stringTokenizer.nextToken();
						if (stringPosition == 0) 
						{
							if (currentToken.equals("search")) 
							{
								stringPosition++;
								mode = searchANDExecutemode.SEARCH;
							} 
							else if (currentToken.toLowerCase().equals("ls"))
							{
								stringPosition++;
								mode = searchANDExecutemode.LS;
							} 
							else if (currentToken.toLowerCase().equals("cd")) 
							{
								stringPosition++;
								mode = searchANDExecutemode.CD;		
							} 
							else if (currentToken.toLowerCase().equals("import")) 
							{
								stringPosition++;
								mode = searchANDExecutemode.IMPORT;
							} 
							else if (currentToken.toLowerCase().equals("clear")) 
							{
								stringPosition++;
								mode = searchANDExecutemode.CLEAR;
							} 
							else if (currentToken.toLowerCase().equals("generate")) 
							{
								stringPosition++;
								mode = searchANDExecutemode.GENERATE;
							} 
							else if (currentToken.toLowerCase().equals("dash")) 
							{
								stringPosition++;
								mode = searchANDExecutemode.DASH;
								transitionIDForDash = stringTokenizer.nextToken();
								String layerForDashString = stringTokenizer.nextToken();
								try 
								{
									layerForDash = Integer.parseInt(layerForDashString);
								} 
								catch (NumberFormatException ne)
								{
									logger.error("ERROR: Unable to parse layer number " + layerForDashString, false, false);
									printSyntaxForCommandLine();								
								}
							} 
							else if (currentToken.equals("softreset")) 
							{
								resManagement.reflectivStateChart.objectManagement.softReset();
								return;
							} 
							else 
							{
								parseError = true;
							}
						} 
						else if (stringPosition > 0) 
						{
							if (mode == searchANDExecutemode.SEARCH || mode == searchANDExecutemode.IMPORT || mode == searchANDExecutemode.LS) { 
								parameterList.add(currentToken);
								stringPosition++;
							} 
							else if (mode == searchANDExecutemode.GENERATE) 
							{

							}
						} 
						else if (stringPosition == 1 && mode == searchANDExecutemode.CD) 
						{
							parameterList.add(currentToken);
							stringPosition++;
						} 
						else 
						{
							parseError = true;
						}
					}

					if (parseError) 
					{
						logger.error("ERROR: Unable to parse \"".concat(searchInput).concat("\""), false, false);
						nsURIField.setText("");
						printSyntaxForCommandLine();
						return;
					}

					if (resManagement.reflectivStateChart.objectManagement.getViewLayers().size()==0
							&& mode != searchANDExecutemode.LS 
							&& mode != searchANDExecutemode.CD && mode != searchANDExecutemode.IMPORT 
							&& mode != searchANDExecutemode.GENERATE) 
					{
						MessageDialog.openInformation(null, Messages.dialogInformationTitleSampleView,
								Messages.dialogInformationNoLayerAttached); 
						nsURIField.setText("");
					} 
					else 
					{
						if (!LayerView.run  //TODO Testen
								&& mode != searchANDExecutemode.LS 
								&& mode != searchANDExecutemode.CD 
								&& mode != searchANDExecutemode.IMPORT 
								&& mode != searchANDExecutemode.GENERATE) 
						{
							logger.info("No simulation run started ... try to load layers.", false, false);
							resManagement.reflectivStateChart.loading.loadAllInstances(null, null);
						}
						switch (mode) 
						{
						case LS : 
							listDirectory(parameterList);
							break;
						case CD : 
							changeDirectory(parameterList.get(0));
							break;
						case IMPORT : 
							if (parameterList.size() < 4) 
							{
								logger.error("ERROR: Import command requires at least four arguments!", false, false);
								printSyntaxForCommandLine();
								return;
							} 
							Boolean parseDryRun = parseBoolean(parameterList.get(2));
							Boolean introduceDummyClass = parseBoolean(parameterList.get(3));

							ArrayList<String> importClasses = new ArrayList<String>(parameterList.subList(4, parameterList.size()));
							importModel(parameterList.get(0), parameterList.get(1), parseDryRun, introduceDummyClass, importClasses);
							break;
						case GENERATE :
							if (resManagement.reflectivStateChart.objectManagement.getViewLayers().size() == 0)
							{
								logger.error("No layer attached!");
								return;
							}
							// would corrupt simulation run
							if (LayerView.run)  //TODO Testen
							{
								logger.error("Simulation currently running! Generation is not possible because of required "
										+ "operations (like model merge)!");
								return;
							}
							// required?
							resManagement.stop();
							resManagement.reflectivStateChart.buildAndMergeModelLayers("Build and Merge modeling layers", false, null, null);
							ParameterManagement ecjParams = new ParameterManagement(searchInput.substring("generate".length()), 
									resManagement.reflectivStateChart.objectManagement);
							if (ecjParams.parseSuccess) 
								logger.info("Parse SUCCESS!");
							else 
							{
								logger.error("Parse FAIL!");
								printSyntaxForCommandLine();
							}

							break;
						case SEARCH :
							//Vector<EMap<String, EObject>> allLayers = rmof.reflectivStateChart.overAll.getObjectCaches();
							boolean shouldBeColored = true;

							// search all layers
							for (int layerNumber = 0; layerNumber < resManagement.reflectivStateChart.objectManagement.getObjectCachesSize(); layerNumber++) 
							{
								if (resManagement.reflectivStateChart.objectManagement.getObjectCache(layerNumber) instanceof BasicEMap<?, ?>) 
								{
									BasicEMap<String, EObject> layer = (BasicEMap<String, EObject>) 
											resManagement.reflectivStateChart.objectManagement.getObjectCache(layerNumber);
									Iterator<Entry<String, EObject>>  objectIterator = layer.iterator();

									if (resManagement.reflectivStateChart.objectManagement.getViewLayers() != null 
											&& resManagement.reflectivStateChart.objectManagement.getViewLayers().get(layerNumber) instanceof Layer 
											&& resManagement.reflectivStateChart.objectManagement.getViewLayers().get(layerNumber) != null)
										shouldBeColored = ((Layer) resManagement.reflectivStateChart.objectManagement.getViewLayers()
												.get(layerNumber)).getColorLayer();
									// search "cache" filling with required elements and search all effects and state names (for each layer)
									while (objectIterator.hasNext()) 
									{
										Object object = objectIterator.next();
										if (object instanceof Entry)
										{
											if (((Entry) object).getValue() instanceof EObject)
											{
												EObject eObject = (EObject) ((Entry) object).getValue();
												if (eObject instanceof YEffect) 
												{
													YEffect effect = (YEffect) eObject;
//													if (effect.getEffect() != null) 
//													{
//														boolean found = false;
//														int stringCounter = 0;
//														while (found == false && stringCounter < parameterList.size()) 
//														{
//															if (effect.getEffect().contains(parameterList.get(stringCounter))) 
//															{
//																found = true;
//																if (shouldBeColored)
//																	effects.add((Effect) eObject);
//																logger.debug("Found \"".concat(parameterList.get(stringCounter))
//																		.concat("\" in Effect (OID:").concat(effect.getObjectID()).concat(") \"")
//																		.concat(effect.getEffect().trim()).concat("\" on layer ") + (layerNumber+1) + ".", false, false);	
//															}
//															stringCounter++;
//														}
//													}
												} 
												else if (eObject instanceof YState) 
												{
													YState state = (YState) eObject;
													states.add(state);
													if (state.getName() != null) 
													{
														boolean found = false;
														int stringCounter = 0;
														while (found == false && stringCounter < parameterList.size()) 
														{
															if (state.getName().contains(parameterList.get(stringCounter))) 
															{
																found = true;
																logger.debug("Found \"".concat(parameterList.get(stringCounter))
																		.concat("\" in State(-name) (OID:").concat(state.getObjectID()).concat(") \"")
																		.concat(state.getName().trim())
																		.concat("\" on layer ") + (layerNumber+1) + ".", false, false);
																if (shouldBeColored)
																{
																	//Sirius modified:
//																	ModifyYAMMDiagram.colorState(state.getContainer().getObjectID(), state.getObjectID(), layerNumber, false);
																	//																	ORIGINAL:
																	//																	ModifyYAMMDiagram.colorState(ModifyYAMMDiagram.getYammDiagramEditor(
																	//																		ModifyYAMMDiagram.findStateMachineEditPartForStateMachine(state.getContainer(), layerNumber)), state.getObjectID(), layerNumber, false);
																}
															}
															stringCounter++;
														}
													}
												} 
												else if (eObject instanceof YTransition) 
												{
													transitions.add((YTransition) eObject);
												} 
												else if (eObject instanceof YStateMachine) 
												{
													stateMachines.add((YStateMachine) eObject);
												} 
												else if (eObject instanceof YTrAttachment) 
												{
													YTrAttachment trAttachment = (YTrAttachment) eObject;
//													if (trAttachment.getGuard() != null && !trAttachment.getGuard().isEmpty()) 
//													{
//														boolean found = false;
//														int stringCounter = 0;
//														while (found == false && stringCounter < parameterList.size()) 
//														{
//															if (trAttachment.getGuard().contains(parameterList.get(stringCounter)))
//															{
//																found = true;
//																logger.debug("Found \"".concat(parameterList.get(stringCounter))
//																		.concat("\" in Guard(-name) (OID - TRAttachment :")
//																		.concat(trAttachment.getObjectID()).concat(") \"")
//																		.concat(trAttachment.getGuard().trim())
//																		.concat("\" on layer ") + (layerNumber+1) + ".", false, false);
//																if (shouldBeColored)
//																	trAttachments.add(trAttachment);
//															}
//															stringCounter++;
//														}
//													}
//												}
											}
										}
									}
								} // while ...

								if (shouldBeColored) 
								{
									// find containing transition (and statemachine) for the (found) effect to color it 
									YTransition transition = null, transitionCompare = null;
									YStateMachine stateMachine = null, stateMachineCompare = null;
									for (YEffect effect : effects) 
									{
										Iterator<YTransition> transitionIterator = transitions.iterator();
										while (transitionIterator.hasNext() && transition == null) {
											transitionCompare = (YTransition) transitionIterator.next();
											if (transitionCompare.getAttachment() != null && transitionCompare.getAttachment().getEffects().contains(effect))
												transition = transitionCompare;
										}
										// transition was found ... search containing statemachine
										if (transition != null) {
											Iterator<YStateMachine> stateMachineIterator = stateMachines.iterator();
											while (stateMachineIterator.hasNext() && stateMachine == null) {
												stateMachineCompare = (YStateMachine) stateMachineIterator.next();
												if (stateMachineCompare.getTransition().contains(transition)) 
													stateMachine = stateMachineCompare;
											}
											if (stateMachine != null) {
//												ModifyYAMMDiagram.colorEffect(stateMachine, transition, effect.getObjectID(), layerNumber, false);
												transition = null;
												stateMachine = null;
											}
										}
									}

									// find containing transition (and statemachine) for the (found) guard to color it 
									transition = null; transitionCompare = null;
									stateMachine = null; stateMachineCompare = null;
									for (YTrAttachment trAttachment : trAttachments) 
									{
										Iterator<YTransition> transitionIterator = transitions.iterator();
										while (transitionIterator.hasNext() && transition == null) {
											transitionCompare = (YTransition) transitionIterator.next();
											if (transitionCompare.getAttachment() != null && transitionCompare.getAttachment().equals(trAttachment))
												transition = transitionCompare;
										}
										// transition was found ... search containing statemachine
										if (transition != null) {
											Iterator<YStateMachine> stateMachineIterator = stateMachines.iterator();
											while (stateMachineIterator.hasNext() && stateMachine == null) {
												stateMachineCompare = (YStateMachine) stateMachineIterator.next();
												if (stateMachineCompare.getTransition().contains(transition)) 
													stateMachine = stateMachineCompare;
											}
											if (stateMachine != null) {
												// Sirius modified
//												ModifyYAMMDiagram.colorTransitionAndGuard(stateMachine.getObjectID(), transition.getObjectID(), false, false, layerNumber);
												//												ORIGINAL:
												//												EditPart stateMachineEditPart = ModifyYAMMDiagram.findStateMachineEditPartForStateMachine(stateMachine, layerNumber);
												//												ModifyYAMMDiagram.colorTransitionAndGuard(ModifyYAMMDiagram.getYammDiagramEditor(stateMachineEditPart), transition.getObjectID(), false, false);
												transition = null;
												stateMachine = null;
											}
										}
									}

									effects.clear();
									states.clear();
									transitions.clear();
									stateMachines.clear();
									trAttachments.clear();
								}
							} }break;
						case CLEAR :
//							ModifyYAMMDiagram.clear();
							break;

						case DASH : 
							//allLayers = yamm.reflectivStateChart.overAll.getObjectCaches();
							if (layerForDash < resManagement.reflectivStateChart.objectManagement.getObjectCachesSize())
							{
								BasicEMap<?,?> layer = (BasicEMap<?,?>) resManagement.reflectivStateChart.objectManagement.getObjectCache(layerForDash);
								Iterator<?> objectIterator = layer.iterator();
								YTransition transition = null;
								YStateMachine stateMachine = null, stateMachineCompare = null;
								while (objectIterator.hasNext()) {
									Object object = objectIterator.next();
									if (object instanceof Entry<?,?>) 
									{
										if (((Entry<?,?>) object).getValue() instanceof EObject) 
										{
											EObject eObject = (EObject) ((Entry<?,?>) object).getValue();
											if (eObject instanceof YStateMachine) 
											{
												stateMachines.add((YStateMachine) eObject);
											} 
											else if (eObject instanceof YTransition)
											{
												transition = (YTransition) eObject;
												if (transition.getObjectID().equals(transitionIDForDash))
													transitions.add((YTransition) eObject);
											}
										}
									}
								}

								Iterator<YStateMachine> stateMachineIterator = stateMachines.iterator();
								while (stateMachineIterator.hasNext() && stateMachine == null) 
								{
									stateMachineCompare = (YStateMachine) stateMachineIterator.next();
									if (stateMachineCompare.getTransition().contains(transition)) 
										stateMachine = stateMachineCompare;
								}
								if (stateMachine != null) 
								{
									// Sirius modified
//									ModifyYAMMDiagram.dashTransition(stateMachine.getObjectID(), transition.getObjectID(), layerForDash);
									//									ORIGINAL:
									//									EditPart stateMachineEditPart = ModifyYAMMDiagram.findStateMachineEditPartForStateMachine(stateMachine, layerForDash);
									//									ModifyYAMMDiagram.dashTransition(ModifyYAMMDiagram.getYammDiagramEditor(stateMachineEditPart), transition.getObjectID());
								}
								break;
							}
						case UNDEFINED:
							break;
						default:
							break;
						} 
					}
					searchAndExecuteHistory.add(nsURIField.getText());
					if (searchAndExecuteHistory.size() > 1000) {
						searchAndExecuteHistory.remove(0);
					}
					searchAndExecuteHistoryIndex = searchAndExecuteHistory.size();
					nsURIField.setText("");
					PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() 
					{
						public void run() 
						{
							nsURIField.setFocus();
						}
					});

				}
			}

			@Override
			public void keyPressed(KeyEvent e) 
			{
			}

		});
	}  
	
	
	/**
	 * 
	 * Shows the command syntax for the input of the text field: assists in performing the desired 
	 * function.
	 */
	protected void printSyntaxForCommandLine()
	{
		logger.info("", false,false);
		StringTokenizer tokenizer = new StringTokenizer(SYNTAX_SEARCH_AND_EXECUTE);
		String token = tokenizer.nextToken("|:");
		while (tokenizer.hasMoreTokens()) 
		{
			if (token.startsWith(": ")) 
			{
				token = " ".concat(token.substring(2, token.length()));
			}
			logger.info(token, false, false);
			token = tokenizer.nextToken("|");
		}
	}
	
	/**
	 * imports from a (rmof) model to an (rmof) model
	 * @param source - source model file
	 * @param filter - importFilter
	 * @param target - target model file
	 */
	protected void generateModel(String source, ArrayList<String> generatedClasses) 
	{

		File sourceFile = findFile(source);

		if (sourceFile != null) 
		{
			ResourceManagement rmof = new ResourceManagement();
			// Register packages to ensure it is available during loading.
			logger.info("Registered Package : ".concat(YammPackage.eNS_URI.toString()), false, false);	
			rmof.resourceSet.getPackageRegistry().put(YammPackage.eNS_URI, YammPackageImpl.eINSTANCE);
			rmof.resourceSet.getResources().clear();

			Resource sourceResource = loadResource(sourceFile, rmof);
			ArrayList<YClass> foundSourceElements = searchElements(generatedClasses, sourceResource, true);

			// some elements have been found
			if (foundSourceElements.size() > 0)
			{
				for (YClass clazz : foundSourceElements) 
				{
					EList<YProperty> properties = clazz.getOwnedAttribute();
					for (YProperty property : properties)
					{
						YType type = property.getType();
						logger.debug("- " + property.getName() + type.getName(), false, false, false);
					}
				}
			} 
			else 
			{
				logger.error("No classes found!", false, false);
			}
		}
	}


	/**
	 * imports from a (rmof) model to an (rmof) model
	 * @param source - source model file
	 * @param filter - importFilter
	 * @param target - target model file
	 */
	protected void importModel(String source, String target, Boolean dryRun, Boolean introduceDummyClass, ArrayList<String> importedClasses)
	{
		File sourceFile = findFile(source);
		File targetFile = findFile(target);

		if (sourceFile != null && targetFile != null)
		{
			ResourceManagement rmof = new ResourceManagement();

			// Register packages to ensure it is available during loading.
			logger.info("Registered Package : ".concat(YammPackage.eNS_URI.toString()), false, false);	
			rmof.resourceSet.getPackageRegistry().put(YammPackage.eNS_URI, YammPackageImpl.eINSTANCE);

			Resource sourceResource = loadResource(sourceFile, rmof);
			ArrayList<YClass> foundSourceElements = searchElements(importedClasses, sourceResource, true);
			Resource targetResource = null;

			// some elements have been found
			if (foundSourceElements.size() > 0) 
			{
				targetResource = loadResource(targetFile, rmof);
				ArrayList<YClass> dublicates = new ArrayList<YClass>();
				ArrayList<Integer> indexOfDublicates = new ArrayList<Integer>();
				for (int i = 0; i < foundSourceElements.size(); i++) 
				{
					ArrayList<String> toBeSearched = new ArrayList<String>();
					toBeSearched.add(foundSourceElements.get(i).getName());
					dublicates = searchElements(toBeSearched, targetResource, false);
					if (dublicates.size() > 0) 
					{
						indexOfDublicates.add(i);
					}
				}
				// now ... remove them
				for (int i : indexOfDublicates)
				{
					int toBeRemovedIndex = indexOfDublicates.get(i) - i;
					logger.error("Element ".concat(foundSourceElements.get(toBeRemovedIndex).getName().concat(" was removed because of redundancy.")), false, false);
					foundSourceElements.remove(toBeRemovedIndex);
				}
			}
			// try to find all type (references)
			if (foundSourceElements.size() > 0) 
			{
				for (YClass clazz : foundSourceElements) 
				{
					logger.debug("Class " + clazz.getName(), false, false);
					EList<YProperty> properties = clazz.getOwnedAttribute();
					for (YProperty property : properties) 
					{
						YType type = property.getType();
						logger.debug("- ".concat(property.getName()).concat(" : ").concat(type.getName()), false, false, false);
						boolean found = false;
						for (YClass clazzCompare : foundSourceElements) 
						{
							//System.out.println(type.getName() + " searchedElement : " + clazzCompare.getName());
							if (clazzCompare.getName().equals(type.getName()))
							{
								found = true;
								break;
							}
						}
						if (!found) 
						{
							ArrayList<YClass> foundTargetElements = searchElements(type.getName(), targetResource, false);
							if (foundTargetElements.size() == 1) 
							{
								found = true;
							}
						}
						if (found) 
						{
							logger.debug(" ... type found in source classes.", false, false, true);
						} 
						else 
						{
							if (!introduceDummyClass)
							{
								ArrayList<String> toBeSearched = new ArrayList<String>();
								toBeSearched.add(type.getName());
								ArrayList<YClass> foundInTargetElements = searchElements(toBeSearched, targetResource, false);
								if (foundInTargetElements.size() == 0)
								{
									logger.error(" ... could not be found and dummy class is prohibited!", false, false);
									return;
								}
							} 
							else 
							{
								Integer dummyClassesNameExtension = 0;
								ArrayList<YClass> dummyClasses = searchElements("dummy"+dummyClassesNameExtension++, targetResource, true);
								while (dummyClasses.size() > 1) {
									dummyClasses = searchElements("dummy"+dummyClassesNameExtension++, targetResource, true);
								}
								YClass dummyClass = null;
								// if not a unique dummy class exist ... create one
								if (dummyClasses.size() == 0)
								{
									dummyClass = YammFactory.eINSTANCE.createYClass();
									dummyClass.setName("dummy"+dummyClassesNameExtension);
								} 
								else
								{
									dummyClass = dummyClasses.get(0);
								}
								YModel model = getRootModel(targetResource);
								model.getClazz().add(dummyClass);
								if (model == null) 
								{
									logger.error("Could not find root model!", false, false);
									return;
								}
								logger.error(" ... changed to dummy type \"" + "dummy"+dummyClassesNameExtension 
										+ "\" because not found in source model classes and target model.", false, false);
								property.setType(dummyClass);
							}
						}
					}
				}
			}
			if (foundSourceElements.size() > 0) 
			{
				YModel model = getRootModel(targetResource);
				if (model == null) {
					logger.error("Could not find root model!", false, false);
					return;
				}
				for (YClass clazz : foundSourceElements) 
				{
					model.getClazz().add(clazz);
					logger.info("Imported " + clazz.getName(), false, false);
				}
			}			
			printResource(targetResource);
			if (!dryRun) 
			{
				HashMap<String, Boolean> options = new HashMap<String, Boolean>();
				options.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
				try 
				{
					targetResource.save(options);
				} 
				catch (IOException e)
				{
					e.printStackTrace();
				}
				logger.info("Successfully written to ".concat(targetResource.getURI().toFileString()), false, false);
			}
			else 
			{
				logger.info("Only dry run ... not written to ".concat(targetResource.getURI().toFileString()), false, false);
			}

		} 
		else
		{
			logger.error("No Element left to import!", false, false);
		}
	} 


	private YModel getRootModel(Resource targetResource) 
	{
		for (EObject eObject : targetResource.getContents())
		{
			if (eObject instanceof YModel) 
			{
				return (YModel) eObject;
			}
		}			
		return null;
	}

	private ArrayList<YClass> searchElements(String filter, Resource resource, boolean containment) 
	{
		ArrayList<String> elementsToBeSearched = new ArrayList<String>();
		elementsToBeSearched.add(filter);
		return searchElements(elementsToBeSearched, resource, containment);
	}

	/** searches a given resource
	 * @param filters - defines filter strings
	 * @param resource - the given resource to be searched
	 * @param containment - containment filters
	 * @return List of found class elements
	 */
	private ArrayList<YClass> searchElements(ArrayList<String> filters, Resource resource, boolean containment)
	{
		ArrayList<YClass> foundElements = new ArrayList<YClass>();
		TreeIterator<EObject> tree = resource.getAllContents();
		for (; tree.hasNext(); ) 
		{
			EObject eObject = (EObject) tree.next();
			if (eObject instanceof YClass) {
				YClass clazz = (YClass) eObject;
				if (filters.size() > 0 && filters.get(0).equals("*"))
				{
					logger.debug("Found Element ".concat(clazz.getName()).concat(" in model ").concat(resource.getURI().toString()).concat(".") , false, false);
					foundElements.add(clazz);
				} 
				else 
				{
					for (String filter : filters)
					{
						if (containment && clazz.getName().contains(filter)
								|| !containment 
								&& clazz.getName().equals(filter))
						{
							logger.debug("Found Element ".concat(clazz.getName())
									.concat(" in model ").concat(resource.getURI().toString()).concat(".") , false, false);
							foundElements.add(clazz);
						} 
					}
				}
			}
		}
		return foundElements;
	}

	/** prints a given resource
	 */
	private void printResource(Resource resource) 
	{
		TreeIterator<EObject> tree = resource.getAllContents();
		EObject eObject = null;
		for (; tree.hasNext(); ) 
		{
			eObject = (EObject) tree.next();
			if (eObject instanceof YClass) 
			{
				YClass clazz = (YClass) eObject;
				logger.trace("Class " + clazz.getName(), false, false);
				EList<YProperty> properties = clazz.getOwnedAttribute();
				for (YProperty property : properties) {
					YType type = property.getType();
					logger.trace("- Property " + property.getName() + " : " + type.getName(), false, false);
				}
			}
		}
		logger.trace("", false, false);
	}

	
	
	

	/**
	 * @param file file: (an rmof based) resource
	 * @param rmof  rmof 
	 * @return the resource loaded
	 */
	private Resource loadResource(File file, ResourceManagement rmof)
	{
		URI sourceFileURI = URI.createFileURI(file.getAbsolutePath());	
		HashMap<String, Boolean> options = new HashMap<String, Boolean>();
		options.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
		Resource sourceResource = rmof.resourceSet.createResource(sourceFileURI);
		logger.info("Loading model files ".concat(sourceFileURI.toString().concat(" ... ")), false, false, false);
		try
		{
			sourceResource.load(options);
		} catch (IOException e) {
			e.printStackTrace();
		}
		logger.info("done.", false, false);
		return sourceResource;
	}

	/**
	 * findFile 
	 * @param fileName : file to File
	 * @param File (return) : returns the file handler of the file if found - otherwise null 
	 */
	private File findFile(String fileName) 
	{
		File file = null;
		if (fileName.startsWith("\\\\") || checkIfRootDirectory(new File(fileName), true)) 
		{
			file = new File(fileName);
			if (!file.exists()) 
			{
				logger.error("Model File ".concat(fileName.concat(" does not exist!")), false, false);
				return null;
			} 
			else if (!file.canRead())
			{
				logger.error("Can't read Model File ".concat(fileName.concat(" !")), false, false);
				return null;			
			} 
		} 
		else 
		{
			file = new File(fileName);
			if (!file.exists()) 
			{
				String absPath = SearchAndExecuteDirectory.concat("\\\\").concat(fileName);
				file = new File(absPath);
				if (!file.exists()) 
				{
					logger.error("Model File ".concat(fileName.concat(" does not exist!")), false, false);
					return null;
				} 
				else 
				{
					fileName = absPath;
				}
			}
		}
		logger.info("Found Model File ".concat(fileName).concat("."), false, false);
		return file;
	}

	/**
	 * changes SearchAndExecuteDirectory 
	 * @param newDirectory - the new Directory
	 */
	private void changeDirectory(String newDirectory) 
	{
		File directory = null;
		newDirectory = newDirectory.replace("/","\\\\");
		if (newDirectory.startsWith("\\\\") || checkIfRootDirectory(new File(newDirectory), true)) 
		{
			directory = new File (newDirectory);
		} 
		else if (newDirectory.equals("..")) 
		{
			if (checkIfRootDirectory(new File(SearchAndExecuteDirectory), false)) 
			{
				logger.error(SearchAndExecuteDirectory.concat(" is already a root directory!"), false, false);
			} 
			else
			{
				int lastPosition = SearchAndExecuteDirectory.lastIndexOf("\\");
				directory = new File (SearchAndExecuteDirectory.substring(0,lastPosition));
			}
		} 
		else
		{
			directory = new File (SearchAndExecuteDirectory.concat("\\\\").concat(newDirectory));
		}
		if (!directory.isDirectory())
		{	
			logger.error(directory.toString().concat(" is not a directory!"), false, false);
		}
		else 
		{
			logger.info("*** " + directory + " ***", false, false);
			SearchAndExecuteDirectory = directory.toString();
		}
	}

	/**
	 * lists the content of SearchAndExecuteDirectory in the log view
	 */
	private void listDirectory(ArrayList<String> directoryNames)
	{
		ArrayList<File> directories = new ArrayList<File>();
		if (directoryNames.size() == 0) 
		{
			File directory = new File(SearchAndExecuteDirectory);
			if (directory.exists())
			{
				directories.add(new File (SearchAndExecuteDirectory));
			} 
			else
			{
				logger.error("Current directory does not exist?!?", false, false);
				return;
			}
		}
		else 
		{
			for (String directoryName : directoryNames)
			{
				File directory = new File (directoryName);
				if (directory.exists()) {
					directories.add(directory);
				}
				else 
				{
					directory = new File (SearchAndExecuteDirectory + "\\\\" + directoryName);
					if (directory.exists()) 
					{
						directories.add(directory);
					} 
					else
					{
						logger.error("Directory " + directory + " does not exist! Neither absolute or relative! ", false, false);
					}
				}		
			}
		}
		for (File directory : directories)
		{
			logger.info("", false, false);
			logger.info("*** " + directory + " ***", false, false);

			if (!checkIfRootDirectory(directory, false))
			{
				logger.info("dxr- ..",false,false);
			}
			String[] filenames = directory.list();
			for (String filename : filenames)
			{
				File file = new File(SearchAndExecuteDirectory + "\\\\" + filename);
				String prefix = "";
				if (file.isDirectory()) 
				{
					prefix = "d";
				} 
				else 
				{
					prefix = "f";
				}
				if (file.canExecute())
				{
					prefix += "x";
				} 
				else
				{
					prefix += "-";
				}
				if (file.canRead()) 
				{
					prefix += "r";
				} 
				else 
				{
					prefix += "-";
				}
				if (file.canWrite())
				{
					prefix += "w";
				} 
				else 
				{
					prefix += "-";
				}
				prefix += " ";
				logger.info(prefix.concat(filename), false, false);
			}
		}
	}

	/** checks if it is a root directory (e.g., on a windows system something like "C:\", "D:\"
	 * @param directory
	 * @param startingWithARootDirectory - if directory is specified as absolute path
	 * @return true - is directory is a root directory
	 */
	private boolean checkIfRootDirectory(File directory, boolean startingWithARootDirectory) 
	{
		boolean isRootDirectory = false;
		for (File f : File.listRoots()) 
		{
			if (!startingWithARootDirectory && f.toString().equals(directory.toString()))
			{
				isRootDirectory = true;
			} 
			else if (startingWithARootDirectory && f.toString().startsWith(directory.toString()))
			{
				isRootDirectory = true;
			}
		}
		return isRootDirectory;
	}

	/**
	 * dissolves '..' on a path
	 * @param path - the given path
	 * @return path without '..'
	 */
	private String dissolveDoubleDots(String path) throws Exception
	{
		int doubleDotPosition = path.indexOf("..");
		while (doubleDotPosition != -1) 
		{										
			int previousPathPosEnd = path.substring(0, doubleDotPosition).lastIndexOf("\\");		
			int previousPathPosStart = path.substring(0,previousPathPosEnd-1).lastIndexOf("\\");
			if (previousPathPosStart == -1) 
			{
				logger.error("Could not find previous path in path :".concat(absolutePath), false, false);
				throw new Exception("Could not find previous path in path :".concat(absolutePath));
			}
			path = doubleDotPosition+2 >= path.length() ? path.substring(0, previousPathPosStart+1) :
				path.substring(0, previousPathPosStart).concat(path.substring(doubleDotPosition+2, path.length()));
			doubleDotPosition = path.indexOf("..");
		}
		return path;
	}

	/**
	 * @param searchStrings
	 * @param parseDryRun
	 * @return
	 */
	private Boolean parseBoolean(String searchString) 
	{
		Boolean value = null;
		try 
		{
			value = Boolean.parseBoolean(searchString);
		} 
		catch (Exception ex)
		{
			logger.error("ERROR: Could not parse ".concat(searchString).concat("  as boolean."), false, false);
			return null;
		}
		return value;
	}
}
