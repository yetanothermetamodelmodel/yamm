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
package dev.yamm.coreModel.design.editParts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.impl.NodeImpl;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.DNodeList;
import org.eclipse.sirius.diagram.DiagramFactory;
import org.eclipse.sirius.diagram.GraphicalFilter;
import org.eclipse.sirius.diagram.WorkspaceImage;
import org.eclipse.sirius.diagram.ui.business.internal.view.ShowingViewUtil;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DNodeListEditPart;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.WorkspaceImageEditPart;
import org.eclipse.sirius.diagram.ui.tools.internal.figure.DConnectionLayerEx;

import RmofDiagramExtension.CollapseTrAttachment;
import RmofDiagramExtension.Color;

public class TrAttachmentDNodeListEditPart extends DNodeListEditPart implements YammColorableGuardAndEffect
{

	private DConnectionLayerEx dConnectionLayer;


	TransactionalEditingDomain ted;
	public TrAttachmentDNodeListEditPart(View view) {
		super(view);
	}

	protected EditPart createChild(Object model) {
		if (model instanceof NodeImpl && "5007".equals(((NodeImpl)model).getType()))
			return new TrAttachmentDNodeListNameEditPart((View)model, this);
		if (model instanceof NodeImpl && "7004".equals(((NodeImpl)model).getType()))
			return new TrAttachmentDNodeListViewNodeListCompartment2EditPart((View)model, this);
		if (model instanceof NodeImpl && "collapsed".equals(((NodeImpl)model).getType()))
			return new WorkspaceImageEditPart((View)model);
		return getViewer().getEditPartFactory().createEditPart(this, model);
	}


	private boolean effectOrGuardColored()
	{
		if (getColorGuard() != null)
			return true;
		if (!indexToColorEffect.keySet().isEmpty())
			return true;
		return false;
	}

	@Override
	protected List getModelChildren() {
		if (isCollapsed())
		{
			WorkspaceImage wsImage = DiagramFactory.eINSTANCE.createWorkspaceImage();
			Node imageNode = NotationFactory.eINSTANCE.createNode();
			imageNode.setElement(wsImage);
			imageNode.setType("collapsed");

			if (effectOrGuardColored())
				wsImage.setWorkspacePath("//dev.yamm.coreModel.design/icons/statemachine/TrAttachmentCollapsedColored.gif");
			else
				wsImage.setWorkspacePath("/dev.yamm.coreModel.design/icons/statemachine/TrAttachmentCollapsed.gif");	

			List returnList = new ArrayList<>();
			returnList.add(imageNode);
			return returnList;
			//			return Collections.EMPTY_LIST;
		}

		return ShowingViewUtil.getModelChildren(getModel());

	}



	private boolean isCollapsed()
	{
		DDiagramElement dElement = (DDiagramElement)((View) getModel()).getElement();
		for (GraphicalFilter gf : dElement.getGraphicalFilters())
		{
			if (gf instanceof CollapseTrAttachment)
				return true;
		}
		return false;
	}

	protected void refreshBounds() {
		int width, height;
		Dimension size;
		IFigure figure = getFigure();
		int x = ((Integer) getStructuralFeatureValue(NotationPackage.eINSTANCE.getLocation_X())).intValue();
		int y = ((Integer) getStructuralFeatureValue(NotationPackage.eINSTANCE.getLocation_Y())).intValue();
		if (!isCollapsed())
		{
			width = ((Integer) getStructuralFeatureValue(NotationPackage.eINSTANCE.getSize_Width())).intValue();
			height = ((Integer) getStructuralFeatureValue(NotationPackage.eINSTANCE.getSize_Height())).intValue();
		}
		else
		{
			//TODO: ai width, height --> Preferences
			width = 40;
			height = 40;			
		}
		Point loc = new Point(x, y);
		size = new Dimension(width, height);
		((GraphicalEditPart) getParent()).setLayoutConstraint(
				this,
				figure,
				new Rectangle(loc, size));
	}
//	@Override
//	protected void refreshVisuals() {
////		dConnectionLayer.addFigureListener(new FigureListener() {
////
////			@Override
////			public void figureMoved(IFigure source) {
////				Rectangle bounds = source.getBounds();
////				ViewNodeFigure figure = new ViewNodeFigure();
////				figure.setBounds(bounds);
////				org.eclipse.swt.graphics.Color color = 
////						new org.eclipse.swt.graphics.Color(null, 255,255,0);
////				figure.setBackgroundColor(color);
////				figure.setForegroundColor(color);
////				DefaultSizeNodeFigure result = new AirDefaultSizeNodeFigure(10, 10, null);
////				final EObject eObj = resolveSemanticElement();
//////				if (eObj instanceof DStylizable && eObj instanceof DDiagramElement) {
//////					final DStylizable viewNode = (DStylizable) eObj;
//////					final StyleConfiguration styleConfiguration = IStyleConfigurationRegistry.INSTANCE.getStyleConfiguration(((DDiagramElement) eObj).getDiagramElementMapping(), viewNode.getStyle());
//////					final AnchorProvider anchorProvider = styleConfiguration.getAnchorProvider();
//////					result = new AirDefaultSizeNodeFigure(getMapMode().DPtoLP(5), getMapMode().DPtoLP(5), anchorProvider);
//////					//			            nodePlate = result;
//////				}
////				result.add(figure);
//////				result.add(contentPane);
////				//				figure.
////				//				contentPane.add(figure);
////				dConnectionLayer.add(conten, null, -1);
////				//				dConnectionLayer.add((IFigure)contentPane.getChildren().get(0));
////
////			}
////		});
//		super.refreshVisuals();
//	}
/************************Colorable***************************************/
	
	private Map<Integer, org.eclipse.swt.graphics.Color> indexToColorEffect = new HashMap<>();
	
	private org.eclipse.swt.graphics.Color colorGuard;
	
	@Override
	public void setColorGuard(org.eclipse.swt.graphics.Color color) {
		colorGuard = color;
	}

	@Override
	public void setColorEffect(org.eclipse.swt.graphics.Color color, int effectIndex) {
		indexToColorEffect.put(effectIndex, color);
	}

	@Override
	public void deColorGuard() {
		colorGuard = null;
	}

	@Override
	public void deColorEffect(int effectIndex) {
		indexToColorEffect.remove(effectIndex);
	}


	@Override
	public org.eclipse.swt.graphics.Color getColorColoredEffects(int index) {
		if (indexToColorEffect.containsKey(index))
			return indexToColorEffect.get(index);
		return null;
	}

	@Override
	public org.eclipse.swt.graphics.Color getColorGuard() {
		return colorGuard;
	}

	@Override
	public void deColorAllEffect() {
		indexToColorEffect.clear();		
	}

}
