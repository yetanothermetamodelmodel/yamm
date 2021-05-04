/**
 * Copyright (C) 2019 yamm.dev, Ralf Buschermöhle
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
package dev.yamm.gui;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

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

import dev.yamm.ChartManagement;
import dev.yamm.ObjectManagement;
import dev.yamm.gui.LayerView;


public class QueueView extends ViewPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "dev.yamm.ui.queueView";

	@Inject
	IWorkbench workbench;

	private Composite parent;
	private Group view;
	private boolean viewIsBuild = false;
	private Map<Object, String> ids = new HashMap<>();
	private Map<Object, StyledText> queueWidgets = new HashMap<>();
	private Map<Object, StyledText> delayQueueWidgets = new HashMap<>();
	private Map<Object, List<EObject>> queueLists = new HashMap<>();
	private Map<Object, List<EObject>> delayQueueLists = new HashMap<>();
	private Map<Object, String> headers = new HashMap<>();
	
	private ChartManagement.SimulationIsRunningListener simulationIsRunningListener;
	private ObjectManagement.AddQueueListener addQueueListener;
	private List<ObjectManagement.QueueListener> queueListeners;
	
	private ScrolledComposite scrolledComposite;
	
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
								Display.getDefault().syncExec(new Runnable() {
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
		if (viewIsBuild)
		{
			view.getParent().dispose();
		}

		buildView();
		viewIsBuild = true;
		ids.clear();
		queueLists.clear();
		queueWidgets.clear();
		headers.clear();
		
		Map<Object, List<EObject>> queues = LayerView.yamm.reflectivStateChart.objectManagement.queues.get(1);	
		Map<Object, List<EObject>> delayQueues = LayerView.yamm.reflectivStateChart.objectManagement.delayQueues.get(1);	
		
		for (Entry<Object, List<EObject>> queueEntry : queues.entrySet())
		{
			EObject queue = (EObject) queueEntry.getKey();
			List<EObject> queueList = queueEntry.getValue();
			createEntry(queue, queueList, delayQueues.get(queue));
			Label separator = new Label(view, SWT.HORIZONTAL | SWT.SEPARATOR);
		}

		parent.layout();

		LayerView.yamm.reflectivStateChart.objectManagement.addQueueListener
		.add((queue, layer, queueList, delayQueueList) -> {
//			List<EObject> queueList = (List<EObject>) queue.eGet(queue.eClass().getEStructuralFeature("queue"));
//			List<EObject> delayQueueList = (List<EObject>) queue.eGet(queue.eClass().getEStructuralFeature("delayed"));
			
			if (Display.getDefault().getThread() != Thread.currentThread()) {
				Display.getDefault().syncExec(new Runnable() {
					public void run() {
						createEntry(queue, queueList, delayQueueList);
						Label separator = new Label(view, SWT.HORIZONTAL | SWT.SEPARATOR);
					}
				});
			} else {
				Display.getDefault().syncExec(new Runnable() {
					public void run() {
						createEntry(queue, queueList, delayQueueList);
						Label separator = new Label(view, SWT.HORIZONTAL | SWT.SEPARATOR);
					}
				});
			}
			
		});
		
		LayerView.yamm.reflectivStateChart.objectManagement.queueListener
		.add((event, object, queue) -> {
			Display.getDefault().syncExec(new Runnable() {
				public void run() {
					if (Display.getDefault().getThread() != Thread.currentThread()) {
						Display.getDefault().syncExec(new Runnable() {
							public void run() {
								update(event, object, queue);
							}
						});
					} else {
						Display.getDefault().syncExec(new Runnable() {
							public void run() {
								update(event, object, queue);
							}
						});
					}
				}
			});		
		});
		
		LayerView.yamm.reflectivStateChart.objectManagement.delayQueueListener
		.add((event, object, queue) -> {
			Display.getDefault().syncExec(new Runnable() {
				public void run() {
					if (Display.getDefault().getThread() != Thread.currentThread()) {
						Display.getDefault().syncExec(new Runnable() {
							public void run() {
								updateDelay(event, object, queue);
							}
						});
					} else {
						Display.getDefault().syncExec(new Runnable() {
							public void run() {
								updateDelay(event, object, queue);
							}
						});
					}
				}
			});		
		});
	}

	private void createEntry(EObject queue, List<EObject> queueList, List<EObject> delayQueueList)
	{
		EClass yClassQueue = queue.eClass();
		String name = (String) queue.eGet(yClassQueue.getEStructuralFeature("name"));
		String type = yClassQueue.getName();
		String objectId = (String) queue.eGet(yClassQueue.getEStructuralFeature("ObjectID"));
		String id = name + "_" + objectId; 
		ids.put(queue, name);
		
		EStructuralFeature typeFeature = yClassQueue.getEStructuralFeature("type");
		String header = (name != null ? name : Integer.toHexString(queue.hashCode())) + " : " + type;
		if (typeFeature != null)
			header += " <" + typeFeature.getEType().getName() + ">";
		headers.put(queue, header);
		
		StyledText queueWidget = new StyledText(view, SWT.BORDER);
		queueWidget.setEditable(false);
		queueLists.put(queue, queueList);
		String text = generateQueueText(queueList, false);
		queueWidget.setText(headers.get(queue) + "\n" + (text != null ? text : ""));
		StyleRange styleRange = new StyleRange();
		styleRange.start = 0;
		styleRange.length = header.length();
		styleRange.fontStyle = SWT.BOLD;
		queueWidget.setStyleRange(styleRange);
		queueWidgets.put(queue, queueWidget);
		
		queueWidget = new StyledText(view, SWT.BORDER);
		queueWidget.setEditable(false);
		delayQueueLists.put(queue, delayQueueList);
		text = generateQueueText(delayQueueList, false);
		queueWidget.setText("delayed\n" + (text != null ? text : ""));
		styleRange = new StyleRange();
		styleRange.start = 0;
		styleRange.length = 7;
		styleRange.fontStyle = SWT.BOLD;
		queueWidget.setStyleRange(styleRange);
		delayQueueWidgets.put(queue, queueWidget);
		
	}
	
	private void update(int event, EObject object, Object queue)
	{
		if (event == ObjectManagement.QueueListener.ADD)
		{
			String text = generateQueueText(queueLists.get(queue), false);
			queueWidgets.get(queue).setText(headers.get(queue) + "\n" + (text != null ? text : ""));
			StyleRange styleRange = new StyleRange();
			styleRange.start = 0;
			styleRange.length = headers.get(queue).length();
			styleRange.fontStyle = SWT.BOLD;
			queueWidgets.get(queue).setStyleRange(styleRange);
			queueWidgets.get(queue).getParent().layout();
		}
		else if (event == ObjectManagement.QueueListener.REMOVE)
		{
			String text = generateQueueText(queueLists.get(queue), false);
			queueWidgets.get(queue).setText(headers.get(queue) + "\n" + (text != null ? text : ""));
			StyleRange styleRange = new StyleRange();
			styleRange.start = 0;
			styleRange.length = headers.get(queue).length();
			styleRange.fontStyle = SWT.BOLD;
			queueWidgets.get(queue).setStyleRange(styleRange);
			queueWidgets.get(queue).getParent().layout();
		}
	}
	
	private void updateDelay(int event, EObject object, Object queue)
	{
		if (event == ObjectManagement.QueueListener.ADD)
		{
			String text = generateQueueText(delayQueueLists.get(queue), false);
			delayQueueWidgets.get(queue).setText("delayed\n" + (text != null ? text : ""));
			StyleRange styleRange = new StyleRange();
			styleRange.start = 0;
			styleRange.length = 7;
			styleRange.fontStyle = SWT.BOLD;
			delayQueueWidgets.get(queue).setStyleRange(styleRange);
			delayQueueWidgets.get(queue).getParent().layout();
		}
		else if (event == ObjectManagement.QueueListener.REMOVE)
		{
			String text = generateQueueText(delayQueueLists.get(queue), false);
			delayQueueWidgets.get(queue).setText("delayed\n" + (text != null ? text : ""));
			StyleRange styleRange = new StyleRange();
			styleRange.start = 0;
			styleRange.length = 7;
			styleRange.fontStyle = SWT.BOLD;
			delayQueueWidgets.get(queue).setStyleRange(styleRange);
			delayQueueWidgets.get(queue).getParent().layout();
		}
	}
	
	private String getTextEntry(EObject element) {
		String name = null;
		EClass eventType = element.eClass();
		EStructuralFeature feature = eventType.getEStructuralFeature("name");
		if (feature != null)
			name = (String) element.eGet(feature);
		return name != null ? name : Integer.toHexString(element.hashCode()); 
	}

	private String generateQueueText(List<EObject> eventQueue, boolean reverse) {
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

		parent.setLayout(new FillLayout());

		scrolledComposite = new ScrolledComposite(parent, SWT.H_SCROLL | SWT.V_SCROLL);
		scrolledComposite.setExpandHorizontal(true);
		scrolledComposite.setExpandVertical(true);
		scrolledComposite.setMinSize(2000, 1250);

		view = new Group(scrolledComposite, SWT.NULL);
		scrolledComposite.setContent(view);
		view.setText("Queues");
		GridLayout gridLayout = new GridLayout();
		view.setLayout(gridLayout);
		GridData gridData = new GridData(GridData.HORIZONTAL_ALIGN_FILL);
		view.setLayoutData(gridData);
	}

	@Override
	public void setFocus() {

	}

}
