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
import java.util.Set;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.sirius.business.api.session.ModelChangeTrigger;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.ext.base.Option;
import org.eclipse.sirius.ext.base.Options;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;

//import com.google.inject.Guice;
//import com.google.inject.Injector;
//import com.google.inject.Module;

import online.yamm.coreModelDiagram.yammDiagram.YParameter;
import online.yamm.coreModelDiagram.yammDiagram.YProperty;

public class PropertyNameChanged implements ModelChangeTrigger {
	private Session session;

//	static Injector injector = Guice.createInjector((Module) new YammRuntimeModule());
//
//	static IJvmModelAssociations jvmModelAssociations = injector.getInstance(IJvmModelAssociations.class);
	
	public PropertyNameChanged(Session session) {
		this.session = session;
	}

	public static final NotificationFilter NOTIFICATION_FILTER = new NotificationFilter.Custom() {
		public boolean matches(Notification input) {
			if (input.getEventType() == 1 && (input.getNotifier() instanceof YProperty || input.getNotifier() instanceof YParameter)
					&& input.getFeature() instanceof EAttribute 
					&& "name".equals(((EAttribute) input.getFeature()).getName())) {		
				return true;			
			}
			return false;
		}
	};

	@Override
	public Option<Command> localChangesAboutToCommit(Collection<Notification> notifications) {
//		Notification notification = notifications.iterator().next();
//
//		Set<EObject> jvmElements = jvmModelAssociations.getJvmElements((EObject) notification.getNotifier());
//		
//		if (jvmElements.isEmpty())
//			return Options.newNone();
//			
//		return Options.newSome(new RecordingCommand(TransactionUtil.getEditingDomain(notification.getNotifier())) {
//			@Override
//			protected void doExecute() {
//				for (EObject jvmElement: jvmElements) {
//					if (jvmElement instanceof JvmField)
//						((JvmField) jvmElement).setSimpleName(notification.getNewStringValue());
//					else if (jvmElement instanceof JvmFormalParameter)
//						((JvmFormalParameter) jvmElement).setName(notification.getNewStringValue());
//				}
//				
//			}
//		});
		return Options.newNone();
	}

	@Override
	public int priority() {
		return 0;
	}

}
