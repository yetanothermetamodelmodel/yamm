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

import org.eclipse.nebula.widgets.nattable.config.AbstractRegistryConfiguration;
import org.eclipse.nebula.widgets.nattable.config.CellConfigAttributes;
import org.eclipse.nebula.widgets.nattable.config.IConfigRegistry;
import org.eclipse.nebula.widgets.nattable.data.convert.PercentageDisplayConverter;
import org.eclipse.nebula.widgets.nattable.grid.GridRegion;
import org.eclipse.nebula.widgets.nattable.painter.cell.PercentageBarCellPainter;
import org.eclipse.nebula.widgets.nattable.painter.cell.decorator.PercentageBarDecorator;
import org.eclipse.nebula.widgets.nattable.style.CellStyleAttributes;
import org.eclipse.nebula.widgets.nattable.style.DisplayMode;
import org.eclipse.nebula.widgets.nattable.style.HorizontalAlignmentEnum;
import org.eclipse.nebula.widgets.nattable.style.Style;
import org.eclipse.nebula.widgets.nattable.style.VerticalAlignmentEnum;
import org.eclipse.nebula.widgets.nattable.util.GUIHelper;
import org.eclipse.swt.graphics.RGB;

public class LoadingbarLayerViewLaboratory extends AbstractRegistryConfiguration{

	@Override
	public void configureRegistry(IConfigRegistry configRegistry) {
		 // Register cell style
        Style cellStyle = new Style();
        cellStyle.setAttributeValue(
                CellStyleAttributes.HORIZONTAL_ALIGNMENT,
                HorizontalAlignmentEnum.CENTER);
        cellStyle.setAttributeValue(CellStyleAttributes.VERTICAL_ALIGNMENT,
                VerticalAlignmentEnum.MIDDLE);

        cellStyle
                .setAttributeValue(
                        PercentageBarDecorator.PERCENTAGE_BAR_COMPLETE_REGION_START_COLOR,
                        GUIHelper.getColor(new RGB(0, 255, 0)));
        cellStyle
                .setAttributeValue(
                        PercentageBarDecorator.PERCENTAGE_BAR_COMPLETE_REGION_END_COLOR,
                        GUIHelper.getColor(new RGB(0, 255, 0)));
        cellStyle
                .setAttributeValue(
                        PercentageBarDecorator.PERCENTAGE_BAR_INCOMPLETE_REGION_COLOR,
                        GUIHelper.getColor(new RGB(255, 255, 255)));

        configRegistry.registerConfigAttribute(
                CellConfigAttributes.CELL_STYLE, cellStyle);

        // Register custom painter, paints bars
        configRegistry.registerConfigAttribute(
                CellConfigAttributes.CELL_PAINTER,
                new PercentageBarCellPainter(), DisplayMode.NORMAL,
                "LOADING");

        // Register custom converter, converts to percentage
        configRegistry.registerConfigAttribute(
                CellConfigAttributes.DISPLAY_CONVERTER,
                new PercentageDisplayConverter(), DisplayMode.NORMAL,
                "LOADING");

		
	}

}
