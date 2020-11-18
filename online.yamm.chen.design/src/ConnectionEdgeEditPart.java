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


import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.diagram.ui.edit.api.part.AbstractDiagramEdgeEditPart;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DEdgeEditPart;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DNodeEditPart;
import org.eclipse.sirius.diagram.ui.tools.internal.figure.ViewNodeFigure;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;

import online.yamm.chen.chen.Relationship;

public class ConnectionEdgeEditPart extends DEdgeEditPart
{

	public ConnectionEdgeEditPart(View view) 
	{
		super(view);
	}

	@Override
	public void refreshVisuals() {
		super.refreshVisuals();
	}
	
	@Override
	protected Connection createConnectionFigure() {
		return new ViewEdgeFigure();
	}

	/**
	 * The figure.
	 */
	public class ViewEdgeFigure extends AbstractDiagramEdgeEditPart.ViewEdgeFigure {

		/**
		 * Constructor.
		 */
		public ViewEdgeFigure() {
			super();
		}

		@Override
		protected void outlineShape(Graphics g) 
		{
			online.yamm.chen.chen.Connection chenConnection = (online.yamm.chen.chen.Connection) ((DSemanticDecorator) ((View) ConnectionEdgeEditPart.this.getModel()).getElement()).getTarget();

			if (chenConnection.isTotalPartizipation())
			{
				PointList displayPointsWithoutJumpLinks = getSmoothPoints(false);

				DNodeEditPart sourceEditPart = (DNodeEditPart) ConnectionEdgeEditPart.this.getSource();
				DNodeEditPart targetEditPart = (DNodeEditPart) ConnectionEdgeEditPart.this.getTarget();
				
				ViewNodeFigure sourcePrimaryShape= sourceEditPart.getPrimaryShape();
		
//				Point firstPoint = displayPointsWithoutJumpLinks.getFirstPoint();
//				Point secondPoint = displayPointsWithoutJumpLinks.getPoint(1);
//				Point calculatedFirstPoint = null;
//				if (chenConnection.getSource() instanceof Relationship)
//				{
//					Point vectorFirstSegment = new Point(secondPoint.x - firstPoint.x, secondPoint.y - firstPoint.y);
//					double m1 = vectorFirstSegment.y / (double) vectorFirstSegment.x;		
//					double b1 = firstPoint.y - ((double) m1 * firstPoint.x);
//					
//					Rectangle rect = sourcePrimaryShape.getParent().getParent().getBounds();
//					
//					Point centerLeft = rect.getLeft();
//					Point centerRight = rect.getRight();
//					Point centerTop = rect.getTop();
//					Point centerBottom = rect.getBottom();
//					
//					Point vectorSegmentRealtionship = null;
//					double m2 = 0, b2 = 0;
//					if (firstPoint.y > centerLeft.y)
//					{ // bottom
//						if (firstPoint.x > centerTop.x)
//						{ // right
//							vectorSegmentRealtionship = new Point(centerBottom.x - centerRight.x, centerBottom.y - centerRight.y);
//							m2 = vectorSegmentRealtionship.y / (double) vectorSegmentRealtionship.x;		
//							b2 = centerBottom.y - ((double) m2 * centerBottom.x);
//						}
//						else if (firstPoint.x > centerTop.x)
//						{ // left
//							vectorSegmentRealtionship = new Point(centerBottom.x - centerLeft.x, centerBottom.y - centerLeft.y);
//							m2 = vectorSegmentRealtionship.y / (double) vectorSegmentRealtionship.x;		
//							b2 = centerBottom.y - ((double) m2 * centerBottom.x);
//						}
//						else
//						{
//							// TODO
//						}
//					}
//					else if (firstPoint.y < centerLeft.y)
//					{ //top
//						if (firstPoint.x > centerTop.x)
//						{ // right
//							vectorSegmentRealtionship = new Point(centerTop.x - centerRight.x, centerTop.y - centerRight.y);
//							m2 = vectorSegmentRealtionship.y / (double) vectorSegmentRealtionship.x;		
//							b2 = centerTop.y - ((double) m2 * centerTop.x);
//						}
//						else if (firstPoint.x > centerTop.x)
//						{ // left
//							vectorSegmentRealtionship = new Point(centerTop.x - centerLeft.x, centerTop.y - centerLeft.y);
//							m2 = vectorSegmentRealtionship.y / (double) vectorSegmentRealtionship.x;		
//							b2 = centerTop.y - ((double) m2 * centerTop.x);
//						}
//						else
//						{
//							// TODO
//						}
//					}
//					else
//					{
//						//TODO
//					}
//					
//					int x = (int) ((b2-b1) / (m1-m2));
//					int y = (int) (m1 * ((b2-b1) / (m1-m2)) + b1);
//					calculatedFirstPoint = new Point(x, y);
//				}
				
				
				for (int index = displayPointsWithoutJumpLinks.size() - 1; index > 0; index--)
				{
					Point point1;
					Point point2;
				
					point1 = displayPointsWithoutJumpLinks.getPoint(index);
					point2 = displayPointsWithoutJumpLinks.getPoint(index - 1);
					
				

					Point diff = new Point(point2.x - point1.x, point2.y - point1.y);

					double length = Math.sqrt(Math.pow(diff.x, 2) + Math.pow(diff.y, 2));

					Point orthogonalNorm = new Point(diff.y/(length / 3), - diff.x/(length / 3));     	

					Point p1 = new Point(point1.x + orthogonalNorm.x, point1.y + orthogonalNorm.y);
					Point p2 = new Point(point2.x + orthogonalNorm.x, point2.y + orthogonalNorm.y);
					Point p3 = new Point(point1.x - orthogonalNorm.x, point1.y - orthogonalNorm.y);
					Point p4 = new Point(point2.x - orthogonalNorm.x, point2.y - orthogonalNorm.y);
					
					if (index == 1)
					{
						Point firstPoint = p2;
						Point secondPoint = p1;
						Point calculatedFirstPoint = null;
						if (chenConnection.getSource() instanceof Relationship)
						{
							Point vectorFirstSegment = new Point(secondPoint.x - firstPoint.x, secondPoint.y - firstPoint.y);
							double m1 = vectorFirstSegment.y / (double) vectorFirstSegment.x;		
							double b1 = firstPoint.y - ((double) m1 * firstPoint.x);
							
							Rectangle rect = sourcePrimaryShape.getParent().getParent().getBounds();
							
							Point centerLeft = rect.getLeft();
							Point centerRight = rect.getRight();
							Point centerTop = rect.getTop();
							Point centerBottom = rect.getBottom();
							
							Point vectorSegmentRealtionship = null;
							double m2 = 0, b2 = 0;
							if (firstPoint.y > centerLeft.y)
							{ // bottom
								if (firstPoint.x > centerTop.x)
								{ // right
									vectorSegmentRealtionship = new Point(centerBottom.x - centerRight.x, centerBottom.y - centerRight.y);
									m2 = vectorSegmentRealtionship.y / (double) vectorSegmentRealtionship.x;		
									b2 = centerBottom.y - ((double) m2 * centerBottom.x);
								}
								else if (firstPoint.x > centerTop.x)
								{ // left
									vectorSegmentRealtionship = new Point(centerBottom.x - centerLeft.x, centerBottom.y - centerLeft.y);
									m2 = vectorSegmentRealtionship.y / (double) vectorSegmentRealtionship.x;		
									b2 = centerBottom.y - ((double) m2 * centerBottom.x);
								}
								else
								{
									// TODO
								}
							}
							else if (firstPoint.y < centerLeft.y)
							{ //top
								if (firstPoint.x > centerTop.x)
								{ // right
									vectorSegmentRealtionship = new Point(centerTop.x - centerRight.x, centerTop.y - centerRight.y);
									m2 = vectorSegmentRealtionship.y / (double) vectorSegmentRealtionship.x;		
									b2 = centerTop.y - ((double) m2 * centerTop.x);
								}
								else if (firstPoint.x > centerTop.x)
								{ // left
									vectorSegmentRealtionship = new Point(centerTop.x - centerLeft.x, centerTop.y - centerLeft.y);
									m2 = vectorSegmentRealtionship.y / (double) vectorSegmentRealtionship.x;		
									b2 = centerTop.y - ((double) m2 * centerTop.x);
								}
								else
								{
									// TODO
								}
							}
							else
							{
								//TODO
							}
							
							int x = (int) ((b2-b1) / (m1-m2));
							int y = (int) (m1 * ((b2-b1) / (m1-m2)) + b1);
							p2 = new Point(x, y);
						}
						
						firstPoint = p4;
						secondPoint = p3;
						calculatedFirstPoint = null;
						if (chenConnection.getSource() instanceof Relationship)
						{
							Point vectorFirstSegment = new Point(secondPoint.x - firstPoint.x, secondPoint.y - firstPoint.y);
							double m1 = vectorFirstSegment.y / (double) vectorFirstSegment.x;		
							double b1 = firstPoint.y - ((double) m1 * firstPoint.x);
							
							Rectangle rect = sourcePrimaryShape.getParent().getParent().getBounds();
							
							Point centerLeft = rect.getLeft();
							Point centerRight = rect.getRight();
							Point centerTop = rect.getTop();
							Point centerBottom = rect.getBottom();
							
							Point vectorSegmentRealtionship = null;
							double m2 = 0, b2 = 0;
							if (firstPoint.y > centerLeft.y)
							{ // bottom
								if (firstPoint.x > centerTop.x)
								{ // right
									vectorSegmentRealtionship = new Point(centerBottom.x - centerRight.x, centerBottom.y - centerRight.y);
									m2 = vectorSegmentRealtionship.y / (double) vectorSegmentRealtionship.x;		
									b2 = centerBottom.y - ((double) m2 * centerBottom.x);
								}
								else if (firstPoint.x > centerTop.x)
								{ // left
									vectorSegmentRealtionship = new Point(centerBottom.x - centerLeft.x, centerBottom.y - centerLeft.y);
									m2 = vectorSegmentRealtionship.y / (double) vectorSegmentRealtionship.x;		
									b2 = centerBottom.y - ((double) m2 * centerBottom.x);
								}
								else
								{
									// TODO
								}
							}
							else if (firstPoint.y < centerLeft.y)
							{ //top
								if (firstPoint.x > centerTop.x)
								{ // right
									vectorSegmentRealtionship = new Point(centerTop.x - centerRight.x, centerTop.y - centerRight.y);
									m2 = vectorSegmentRealtionship.y / (double) vectorSegmentRealtionship.x;		
									b2 = centerTop.y - ((double) m2 * centerTop.x);
								}
								else if (firstPoint.x > centerTop.x)
								{ // left
									vectorSegmentRealtionship = new Point(centerTop.x - centerLeft.x, centerTop.y - centerLeft.y);
									m2 = vectorSegmentRealtionship.y / (double) vectorSegmentRealtionship.x;		
									b2 = centerTop.y - ((double) m2 * centerTop.x);
								}
								else
								{
									// TODO
								}
							}
							else
							{
								//TODO
							}
							
							int x = (int) ((b2-b1) / (m1-m2));
							int y = (int) (m1 * ((b2-b1) / (m1-m2)) + b1);
							p4 = new Point(x, y);
						}
					}
					
					g.drawLine(p1, p2);
					g.drawLine(p3, p4);
					
				}
			}
			if (chenConnection.isGeneralization())
			{			
				PointList displayPointsWithoutJumpLinks = getSmoothPoints(false);
				Point midPoint = displayPointsWithoutJumpLinks.getMidpoint();
				
				Point orientation;
				if (displayPointsWithoutJumpLinks.size() % 2 == 1)
				{
					Point first = displayPointsWithoutJumpLinks.getFirstPoint();
					Point last = displayPointsWithoutJumpLinks.getLastPoint();
					
					orientation = new Point(last.y - first.y, -(last.x - first.x));
				}
				else
				{
					int indexPoint2 = displayPointsWithoutJumpLinks.size() / 2;
					int indexPoint1 = indexPoint2 - 1;
					Point point1 = displayPointsWithoutJumpLinks.getPoint(indexPoint1);
					Point point2 = displayPointsWithoutJumpLinks.getPoint(indexPoint2);
					
					orientation = new Point(point2.y - point1.y, -(point2.x - point1.x));
				}
				double hypothenuse = orientation.getDistance(new Point(0,0));
				int startAngle = -5;
				int alpha = (int) Math.toDegrees(Math.asin(Math.abs(orientation.y) / hypothenuse));
				if (orientation.x >= 0 && orientation.y <= 0)
					startAngle += alpha;
				else if (orientation.x <= 0 && orientation.y <= 0)
					startAngle += 180 - alpha;
				else if (orientation.x <= 0 && orientation.y >= 0)
					startAngle += 180 + alpha;
				else if (orientation.x >= 0 && orientation.y >= 0)
					startAngle += 360 - alpha;
				
				if (chenConnection.isGeneralizationOrientation() == false)
					startAngle += 180;
				
				Point pointA = new Point(-8, -8);
				
//				Point pointB = new Point((int) ((-8)*Math.cos(startAngle) - (0)*Math.sin(startAngle))
//						, (int) ((-8)*Math.sin(startAngle) + (0)*Math.cos(startAngle)));
//				
//				Point pointC = new Point((int) ((-8)*Math.cos(startAngle) - (16)*Math.sin(startAngle))
//						, (int) ((-8)*Math.sin(startAngle) + (16)*Math.cos(startAngle)));
//				
//				Point pointD = new Point((int) ((8)*Math.cos(startAngle) - (0)*Math.sin(startAngle))
//						, (int) ((8)*Math.sin(startAngle) + (0)*Math.cos(startAngle)));
//				
//				Point pointE = new Point((int) ((8)*Math.cos(startAngle) - (16)*Math.sin(startAngle))
//						, (int) ((8)*Math.sin(startAngle) + (16)*Math.cos(startAngle)));
				
				Point pointATranslated = pointA.getTranslated(midPoint);

				g.drawArc(pointATranslated.x, pointATranslated.y, 16, 16, startAngle, 190);
//				g.drawLine(pointB.getTranslated(midPoint), pointC.getTranslated(midPoint));
//				g.drawLine(pointD.getTranslated(midPoint), pointE.getTranslated(midPoint));
			}
			if (!chenConnection.isTotalPartizipation())
			{
				super.outlineShape(g);
			}
		}
	}

}
