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
package dev.yamm.coreModel.design;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionListener;
import org.eclipse.sirius.business.api.session.SessionManagerListener;

import dev.yamm.coreModelDiagram.yammDiagram.YModel;
import dev.yamm.coreModelDiagram.yammDiagram.xmiToText.DslConverter;

public class RmofSessionManagerListener extends  SessionManagerListener.Stub
{
	@Override
	public void notifyAddSession(final Session newSession)
	{
		newSession.getEventBroker().addLocalTrigger(SetOppositeTrigger.NOTIFICATION_FILTER, new SetOppositeTrigger(newSession));
		newSession.getEventBroker().addLocalTrigger(ChangeAssociationTrigger.NOTIFICATION_FILTER, new ChangeAssociationTrigger(newSession));
		newSession.getEventBroker().addLocalTrigger(DeleteTypeOfPropertyTrigger.NOTIFICATION_FILTER, new DeleteTypeOfPropertyTrigger(newSession));
		newSession.getEventBroker().addLocalTrigger(ChangeTypeOfPropertyWhichHasAnOppositeTrigger.NOTIFICATION_FILTER, new ChangeTypeOfPropertyWhichHasAnOppositeTrigger(newSession));
		newSession.getEventBroker().addLocalTrigger(PasteToolFinishedTrigger.NOTIFICATION_FILTER, new PasteToolFinishedTrigger(newSession));
		newSession.getEventBroker().addLocalTrigger(PasteToolClassDiagramFinishedTrigger.NOTIFICATION_FILTER, new PasteToolClassDiagramFinishedTrigger(newSession));

//		newSession.getEventBroker().addLocalTrigger(PropertyNameChanged.NOTIFICATION_FILTER, new PropertyNameChanged(newSession));
		newSession.getEventBroker().addLocalTrigger(ForbidModifcationOfObjectID.NOTIFICATION_FILTER, new ForbidModifcationOfObjectID(newSession));

		
	}

	@Override
	public void notify(Session updated, int notification) {

		
		if (notification == SessionListener.OPENED
				&& !updated.getSemanticResources().isEmpty())
		{
			Resource semRes = updated.getSemanticResources().iterator().next();
			if (semRes.getContents().get(0) instanceof YModel)
			{
				YModel model = (YModel) semRes.getContents().get(0);
				DslConverter dslConverter = null;
				for (Adapter adapter : model.eAdapters())
				{
					if (adapter instanceof DslConverter)
					{
						dslConverter = (DslConverter) adapter;
					}
				}
				String projectName = URI.createPlatformResourceURI(semRes.getURI().toPlatformString(true), false).segments()[1];
				// create converter
				if (dslConverter == null)
				{
					dslConverter = new DslConverter();
					model.eAdapters().add(dslConverter);
					dslConverter.init(model, projectName);
				}
			}
		}
	}

}
