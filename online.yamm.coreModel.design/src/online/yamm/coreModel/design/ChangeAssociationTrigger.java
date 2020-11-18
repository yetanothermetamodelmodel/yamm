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
package online.yamm.coreModel.design;

import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.sirius.business.api.session.ModelChangeTrigger;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.ext.base.Option;
import org.eclipse.sirius.ext.base.Options;

import online.yamm.coreModelDiagram.yammDiagram.YProperty;

public class ChangeAssociationTrigger  implements ModelChangeTrigger
{

	public static final NotificationFilter NOTIFICATION_FILTER = new NotificationFilter.Custom() {
		public boolean matches(Notification input) 
		{
			if (input.getNotifier() instanceof YProperty)
			{
				if (input.getFeature() instanceof EAttribute)
				{
					if ("association".equals(((EAttribute) input.getFeature()).getName()))
					{
						return true;
					}
				}
			}
			return false;
		}
	};
	
	Session session;
	
	public ChangeAssociationTrigger(Session session) 
	{
		this.session = session;
	}

	@Override
	public Option<Command> localChangesAboutToCommit(Collection<Notification> notifications) 
	{
		for (Notification notfication : notifications)
		{
			YProperty opposite = ((YProperty) notfication.getNotifier()).getOpposite();
			if (opposite != null)
			{
				RecordingCommand cmd = new RecordingCommand(session.getTransactionalEditingDomain()) {
					
					@Override
					protected void doExecute() {
						opposite.setAssociation((Boolean)notfication.getNewValue());						
					}
				};
				return Options.newSome(cmd);
			}
		}
		return Options.newNone();
	}

	@Override
	public int priority() 
	{
		return 0;
	}

}
