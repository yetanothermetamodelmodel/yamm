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

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import javax.inject.Inject;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.part.ViewPart;

import online.yamm.ChartManagement;
import online.yamm.ObjectManagement;
import online.yamm.gui.LayerView;

/**
 * This sample class demonstrates how to plug-in a new workbench view. The view
 * shows data obtained from the model. The sample creates a dummy model on the
 * fly, but a real implementation would connect to the model available either in
 * this or another plug-in (e.g. the workspace). The view is connected to the
 * model using a content provider.
 * <p>
 * The view uses a label provider to define how model objects should be
 * presented in the view. Each view can present the same model objects using
 * different labels and icons, if needed. Alternatively, a single label provider
 * can be shared between views in order to ensure that objects of the same type
 * are presented in the same way everywhere.
 * <p>
 */

public class EventQueueView extends ViewPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "online.yamm.ui.eventQueueView";

	@Inject
	IWorkbench workbench;

	private Composite parent;
	private Group view;
	private StyledText eventQueueWidget;
	private StyledText consumedEventsWidget;
	private java.util.List<EObject> eventQueue;
	private java.util.List<EObject> consumedEvents;
	private boolean viewIsBuild = false;
	private int countRemoved = 0;
	private int countEvent = 0;
	private ChartManagement.SimulationIsRunningListener simulationIsRunningListener;
	
	@Override
	public void dispose()
	{
		LayerView.yamm.reflectivStateChart.simulationIsRunningListener.remove(simulationIsRunningListener);
		
		super.dispose();
	}
	
	@Override
	public void createPartControl(Composite parent) {
		this.parent = parent;
		LayerView.yamm.reflectivStateChart.simulationIsRunningListener
		.add(simulationIsRunningListener = new ChartManagement.SimulationIsRunningListener() {
			public void changed(boolean isRunning) {
				if(isRunning) 
					Display.getDefault().syncExec(new Runnable() {
						public void run() {
							if (Display.getDefault().getThread() != Thread.currentThread()) {
								Display.getDefault().asyncExec(new Runnable() {
									public void run() {
										activate();
									}
								});
							} else {
								Display.getDefault().syncExec(new Runnable() {
									public void run() {
										activate();
									}
								});
							}
						}
					});
			}
		});

		if (LayerView.yamm.reflectivStateChart.simulationIsRunning)
			activate();
	}

	public void activate() 
	{
		if (!viewIsBuild)
		{
			countRemoved = 0;
			countEvent = 0;
			buildView();
			viewIsBuild = true;
			
			eventQueue = LayerView.yamm.reflectivStateChart.objectManagement.eventQueue.get(1);	
			consumedEvents = LayerView.yamm.reflectivStateChart.objectManagement.consumedEvents.get(1);	

			eventQueueWidget = new StyledText(view, SWT.BORDER);
			eventQueueWidget.setEditable(false);
			eventQueueWidget.setText("EventQueue\n" + (eventQueue != null ? generateEventQueueText(eventQueue, false) : ""));
			StyleRange styleRange = new StyleRange();
			styleRange.start = 0;
			styleRange.length = 10;
			styleRange.fontStyle = SWT.BOLD;
			eventQueueWidget.setStyleRange(styleRange);

			consumedEventsWidget = new StyledText(view, SWT.BORDER);
			consumedEventsWidget.setEditable(false);
			consumedEventsWidget.setText(consumedEvents != null ? generateEventQueueText(consumedEvents, true) : "");

			parent.layout();

			LayerView.yamm.reflectivStateChart.objectManagement.eventQueueListener
			.add((event, object, queue) -> {
				Display.getDefault().asyncExec(new Runnable() {
					public void run() {
						if (Display.getDefault().getThread() != Thread.currentThread()) {
							Display.getDefault().asyncExec(new Runnable() {
								public void run() {
									update(event, object);
								}
							});
						} else {
							Display.getDefault().asyncExec(new Runnable() {
								public void run() {
									update(event, object);
								}
							});
						}
					}
				});		
			});
		}
		else
		{
			countRemoved = 0;
			countEvent = 0;
			
			eventQueue = LayerView.yamm.reflectivStateChart.objectManagement.eventQueue.get(1);	
			consumedEvents = LayerView.yamm.reflectivStateChart.objectManagement.consumedEvents.get(1);	
			consumedEventsWidget.setText(generateEventQueueText(consumedEvents, true));
			eventQueueWidget.setText("EventQueue\n" + generateEventQueueText(eventQueue, false));
			consumedEventsWidget.getParent().layout();
			
			LayerView.yamm.reflectivStateChart.objectManagement.eventQueueListener
			.add((event, object, queue) -> {
				if (Display.getDefault().getThread() != Thread.currentThread()) {
					Display.getDefault().asyncExec(new Runnable() {
						public void run() {
							update(event, object);
						}
					});
				} else {
					Display.getDefault().syncExec(new Runnable() {
						public void run() {
							update(event, object);
						}
					});
				}
			});
		}
	}

	private void update(int event, EObject object)
	{
		if (event == ObjectManagement.QueueListener.ADD)
		{
			eventQueueWidget.setText("EventQueue\n" + generateEventQueueText(eventQueue, false));
			StyleRange styleRange = new StyleRange();
			styleRange.start = 0;
			styleRange.length = 10;
			styleRange.fontStyle = SWT.BOLD;
			eventQueueWidget.setStyleRange(styleRange);
			eventQueueWidget.getParent().layout();
		}
		else if (event == ObjectManagement.QueueListener.REMOVE)
		{
			eventQueueWidget.setText("EventQueue\n" + generateEventQueueText(eventQueue, false));
			StyleRange styleRange = new StyleRange();
			styleRange.start = 0;
			styleRange.length = 10;
			styleRange.fontStyle = SWT.BOLD;
			eventQueueWidget.setStyleRange(styleRange);
			consumedEventsWidget.setText(getTextEntry(object) + " | " + (countRemoved++ % 10 == 0 ? "\n": "") + consumedEventsWidget.getText());
			eventQueueWidget.getParent().layout();
		}
	}
	
	private String getTextEntry(EObject event) {
		String timeStep = "";
		String name = "";
		String type = "";
		EClass eventType = event.eClass();
		EStructuralFeature feature = eventType.getEStructuralFeature("name");
		if (feature != null)
			name = (String) event.eGet(feature);
		feature = eventType.getEStructuralFeature("timeStep");
		if (feature != null)
			timeStep = "" + event.eGet(feature);
		type = eventType.getName();

		return timeStep + ":" + name + ":" + type; 
	}

	private String generateEventQueueText(List<EObject> eventQueue, boolean reverse) {
		String text = "";
		if (reverse)
			Collections.reverse(eventQueue = new LinkedList<EObject>(eventQueue));
		int lineCounter = 0;
		for(Iterator<EObject> eventIter = eventQueue.iterator(); eventIter.hasNext();)
		{
			EObject event = eventIter.next();

			text += getTextEntry(event); 
			if (eventIter.hasNext())
				text += " | ";
			if (++lineCounter % 10 == 0)
				text += "\n";
			
		}
		return text;
	}

	private void buildView() {
		Label label;

		// 1
//		ScrolledComposite scrolledComposite = new ScrolledComposite( parent, SWT.H_SCROLL | SWT.V_SCROLL );
//		label = new Label( scrolledComposite, SWT.NONE );
////		label.setBackground( display.getSystemColor( SWT.COLOR_DARK_GREEN ) );
//		label.setSize( 400, 400 );
//		scrolledComposite.setExpandHorizontal( true );
//		scrolledComposite.setExpandVertical( true );
//		scrolledComposite.setMinSize( 250, 250 );
//		scrolledComposite.setContent( label );

		
		// nicht 4
		parent.setLayout(new FillLayout());

		// 2
		ScrolledComposite scrolledComposite = new ScrolledComposite(parent, SWT.H_SCROLL | SWT.V_SCROLL);
		scrolledComposite.setExpandHorizontal(true);
		scrolledComposite.setExpandVertical(true);
		scrolledComposite.setMinSize(2000, 1250);

		// 3
//	    ScrolledComposite sc = new ScrolledComposite(parent, SWT.H_SCROLL
//	            | SWT.V_SCROLL);
//	        // Create a child composite to hold the controls
//	        Composite scrolledComposite = new Composite(sc, SWT.NONE);
//	        scrolledComposite.setLayout(new FillLayout());
//	        sc.setContent(scrolledComposite);

		// 4
//	    ScrolledComposite sc = new ScrolledComposite(parent, SWT.BORDER
//	    		| SWT.V_SCROLL | SWT.H_SCROLL);
//	    	GridData gd = new GridData();
//	    	gd.horizontalSpan = 2;
//	    	gd.horizontalAlignment = GridData.FILL;
//	    	sc.setLayoutData(gd);
//	    	Composite ownerInfo = new Composite(sc, SWT.NONE);
//	    	FillLayout fillLayout = new FillLayout();
//	    	fillLayout.type = SWT.VERTICAL;
//	    	ownerInfo.setLayout(fillLayout);

		// nicht 4
		view = new Group(scrolledComposite, SWT.NULL);
		scrolledComposite.setContent(view);
		view.setText("Queues");
		GridLayout gridLayout = new GridLayout();
		view.setLayout(gridLayout);
		GridData gridData = new GridData(GridData.HORIZONTAL_ALIGN_FILL);
		view.setLayoutData(gridData);

//		StyledText widget = new StyledText(view, SWT.BORDER);
//		widget.setEditable(false);
////		widget.setWordWrap(true);    
////		widget.setBounds(10,10,100,100);
//		widget.setText(
//				"<QueueName>:<Type> : <Name> | <Name> |\n <Name> | <Name> | <Name>> | <Name> | <Name> | <Name> | <Name>> | <Name> | <Name> | <Name> | <Name>> | <Name> | <Name> | <Name> | <Name>> | <Name> | <Name> | <Name> | <Name>");
//
//		StyleRange styleRange = new StyleRange();
//		styleRange.start = 0;
//		styleRange.length = 10;
//		styleRange.fontStyle = SWT.BOLD;
//		styleRange.foreground = new Color(null, 255, 127, 0);
//		widget.setStyleRange(styleRange);
////		
//
//		Button button = new Button(view, SWT.PUSH);
//		button.setText("reload");
//		button = new Button(view, SWT.CHECK);
//		button.setText("breakpoint");
//
//		label = new Label(view, SWT.NULL);
//		label.setText("EventQueue: <TimeStamp>:<Name>:<Type> | <TimeStamp>:<Name>:<Type> ");
//		label.addListener(SWT.Paint, new Listener() {
//
//			@Override
//			public void handleEvent(Event event) {
//				System.out.println();
//
//			}
//		});
//
//		label = new Label(view, SWT.NULL);
//		label.setText(" ");
//
//		label = new Label(view, SWT.NULL);
//		label.setText("<QueueName>:<Type> : <Name> | <Name> | <Name>");
//
//		label = new Label(view, SWT.NULL);
//		label.setText("<QueueName>:<Type> : <Name> | <Name> | <Name>");
//
//		label = new Label(view, SWT.NULL);
//		label.setText(
//				"<QueueName>:<Type> : <Name> | <Name> | <Name> | <Name> | <Name>> | <Name> | <Name> | <Name> | <Name>> | <Name> | <Name> | <Name> | <Name>> | <Name> | <Name> | <Name> | <Name>> | <Name> | <Name> | <Name> | <Name>");
//
//		// 4
////		sc.setContent(ownerInfo);
////    	sc.setMinSize(100, 50);
////    	sc.setExpandHorizontal(true);
////    	sc.setExpandVertical(true);
	}

	@Override
	public void setFocus() {

	}

}
