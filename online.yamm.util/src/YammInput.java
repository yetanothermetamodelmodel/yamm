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
import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class YammInput {

	public static boolean booleanDialog(String message)
	{
		List<Integer> returnValue = new ArrayList<>();
		Display.getDefault().syncExec(new Runnable()
		{
			public void run()
			{
				MessageDialog dialog = new MessageDialog(new Shell(), "Input", null,
					    message, MessageDialog.INFORMATION, new String[] { "Yes",
					    "No" }, 0);
				returnValue.add(dialog.open());
			}
		});
		
		if (!returnValue.isEmpty() && returnValue.get(0) == 0)
			return true;
		else
			return false;
	}
	
	public static Integer integerDialog(String message)
	{
		List<Integer> returnValue = new ArrayList<>();
		Display.getDefault().syncExec(new Runnable()
		{
			public void run()
			{
				ValueDialog dialog = new ValueDialog(new Shell(), message, "Integer");
				dialog.create();
				if (dialog.open() == Window.OK) {
					try {
						returnValue.add(Integer.parseInt(dialog.getValue()));
					} catch (Exception e) {
						returnValue.add(0);
					}
				}
			}
		});
		
		if (!returnValue.isEmpty())
			return returnValue.get(0);
		else
			return 0;
	}
	
	public static Double doubleDialog(String message)
	{
		List<Double> returnValue = new ArrayList<>();
		Display.getDefault().syncExec(new Runnable()
		{
			public void run()
			{
				ValueDialog dialog = new ValueDialog(new Shell(), message, "Double");
				dialog.create();
				if (dialog.open() == Window.OK) {
					try {
						returnValue.add(Double.parseDouble(dialog.getValue()));
					} catch (Exception e) {
						returnValue.add(0.0);
					}
				}
			}
		});
		
		if (!returnValue.isEmpty())
			return returnValue.get(0);
		else
			return 0.0;
	}
	
	public static String stringDialog(String message)
	{
		List<String> returnValue = new ArrayList<>();
		Display.getDefault().syncExec(new Runnable()
		{
			public void run()
			{
				ValueDialog dialog = new ValueDialog(new Shell(), message, "String");
				dialog.create();
				if (dialog.open() == Window.OK) {
					returnValue.add(dialog.getValue());
				}
			}
		});
		
		if (!returnValue.isEmpty() && returnValue.get(0) != null)
			return returnValue.get(0);
		else
			return "";
	}
		
	
}















class ValueDialog extends TitleAreaDialog {

    private Text valueTextField;
    private String message; 

    private String value;
    private String label;
    

    public ValueDialog(Shell parentShell, String message, String label) {
    	super(parentShell);
    	this.message = message;
    	this.label = label;
    }

    @Override
    public void create() {
        super.create();
        setTitle("Input");
        setMessage(message, IMessageProvider.INFORMATION);
    }

    @Override
    protected Control createDialogArea(Composite parent) {
        Composite area = (Composite) super.createDialogArea(parent);
        Composite container = new Composite(area, SWT.NONE);
        container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        GridLayout layout = new GridLayout(2, false);
        container.setLayout(layout);

        createValueTextField(container);

        return area;
    }

    private void createValueTextField(Composite container) {
        Label labelElement = new Label(container, SWT.NONE);
        labelElement.setText(label);

        GridData dataValue = new GridData();
        dataValue.grabExcessHorizontalSpace = true;
        dataValue.horizontalAlignment = GridData.FILL;

        valueTextField = new Text(container, SWT.BORDER);
        valueTextField.setLayoutData(dataValue);
    }

    @Override
    protected boolean isResizable() {
        return true;
    }

    private void saveInput() {
        value = valueTextField.getText();
    }

    @Override
    protected void okPressed() {
        saveInput();
        super.okPressed();
    }

    public String getValue() {
        return value;
    }

}
