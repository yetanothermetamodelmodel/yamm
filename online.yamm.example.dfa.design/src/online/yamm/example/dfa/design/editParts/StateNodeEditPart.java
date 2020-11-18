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
package online.yamm.example.dfa.design.editParts;

import java.util.List;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.impl.NodeImpl;
import org.eclipse.sirius.diagram.DiagramFactory;
import org.eclipse.sirius.diagram.WorkspaceImage;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DNodeEditPart;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.WorkspaceImageEditPart;
import org.eclipse.swt.graphics.Color;

@SuppressWarnings("restriction")
public class StateNodeEditPart extends DNodeEditPart implements Colorable {

	private boolean colored = false;

	public StateNodeEditPart(View view) {
		super(view);
	}

	@Override
	public void setColor(Color color) {
		this.colored = (color != null);
	}

	@Override
	public void deColor() {
		this.colored = false;
	}
	
	@Override
	public void refresh() {
		super.refresh();
	}

	@Override
	protected void refreshVisuals() {
		super.refreshVisuals();
	}

	@Override
	protected EditPart createChild(Object model) {
		if (model instanceof NodeImpl && "3005".equals(((NodeImpl) model).getType()) && colored)
			return new WorkspaceImageEditPart((View) model);
		return super.createChild(model);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	protected List getModelChildren() {
		List out = super.getModelChildren();
		if (colored) {
			for (Object obj : out) {
				if (obj instanceof Node) {
					Node node = (Node) obj;
					if (node.getType().equals("3005") & colored) {
						if (node.getElement() instanceof WorkspaceImage) {
							// Change the image-path to the colored
							WorkspaceImage image = (WorkspaceImage) node.getElement();
							int endOfFile = image.getWorkspacePath().lastIndexOf(".");
							String colImgPath = image.getWorkspacePath().substring(0, endOfFile) + "_col"
									+ image.getWorkspacePath().substring(endOfFile);

							// Replace the original with the colored node
							Node colNode = EcoreUtil.copy(node);
							WorkspaceImage colImg = DiagramFactory.eINSTANCE.createWorkspaceImage();
							colImg.setWorkspacePath(colImgPath);
							colNode.setElement(colImg);
							out.add(colNode);
							out.remove(node);
						}
					}
				}
			}

		}
		return out;
	}

}
