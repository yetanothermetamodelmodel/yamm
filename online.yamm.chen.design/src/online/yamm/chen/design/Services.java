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
package online.yamm.chen.design;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.sirius.business.api.query.EObjectQuery;

import online.yamm.chen.chen.Attribute;
import online.yamm.chen.chen.Chen;
import online.yamm.chen.chen.ChenPackage;
import online.yamm.chen.chen.Connection;
import online.yamm.chen.chen.Entity;
import online.yamm.chen.chen.Generalization;
import online.yamm.chen.chen.Relationship;
import online.yamm.chen.chen.Type;

/**
 * The services class used by VSM.
 */
public class Services {

	/**
	 * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
	 */
	public EObject myService(EObject self, String arg) {
		// TODO Auto-generated code
		return self;
	}

	public EObject initConnection(Connection connection, EObject source, EObject target) 
	{
		connection.setSource(source);
		connection.setTarget(target);
	 
		if (source instanceof Generalization || target instanceof Generalization)
		{
			connection.setGeneralizationConnection(true);
		}
		else if (source instanceof Entity && target instanceof Entity)
		{
			connection.setGeneralizationConnection(true);
			connection.setGeneralization(true);
		}
//		if (target instanceof Attribute || source instanceof Attribute)
//		{
//			if (target instanceof Attribute && source instanceof Attribute)
//			{
//				((Attribute) source).get
//			}
//			else if (target instanceof Relationship)
//			{
//				connection
//			}
//		}
//		else if (source instanceof Relationship)
//		{
//			((Relationship) source).getConnectionsToEntities().add(connection);
//			((Entity) target).getConnectionsToRelations().add(connection);
//		}
//		else if (source instanceof Entity)
//		{
//			((Entity) source).getConnectionsToRelations().add(connection);
//			((Relationship) target).getConnectionsToEntities().add(connection);
//		}

		return connection;
	}
	
	public Boolean connectionCreateCondition(EObject self, EObject preSource, EObject preTarget)
	{
		if (preSource == preTarget)
			return false;
		if ((preSource instanceof Attribute && preTarget instanceof Attribute)
				|| (preSource instanceof Entity && preTarget instanceof Entity))
			return true;
		if (preSource.eClass() == preTarget.eClass())
			return false;
		
//		if (preSource instanceof Relationship && preTarget instanceof Entity)
//		{
//			((Relationship) preSource).get
//		}
		
		return true;
	}
	
	public EObject connectionLabelEditDummyService(EObject self) {
		// end/begin role label edit is done in ConnectionLabelEditProvider,
		// see: Obeo UML Designer
		return self;
	}
	
	public Boolean showProperty(EObject self, Object _eStructuralFeature)
	{

		EStructuralFeature eStructuralFeature = (EStructuralFeature) _eStructuralFeature;

		if (ChenPackage.Literals.ATTRIBUTE == self.eClass())
		{
			if (ChenPackage.Literals.ATTRIBUTE__CONNECTIONS_TO_RELATION_OR_ENTITY == eStructuralFeature
					|| ChenPackage.Literals.ATTRIBUTE__CONNECTIONS_TO_SUB_ATTRIBUTES== eStructuralFeature)
				return false;
		}
		else if (ChenPackage.Literals.ENTITY == self.eClass())
		{
			if (ChenPackage.Literals.ENTITY__CONNECTIONS_TO_ATTRIBUTES == eStructuralFeature
					|| ChenPackage.Literals.ENTITY__CONNECTIONS_TO_RELATIONS== eStructuralFeature)
				return false;
		}
		else if (ChenPackage.Literals.RELATIONSHIP == self.eClass())
		{
			if (ChenPackage.Literals.RELATIONSHIP__CONNECTIONS_TO_ATTRIBUTES == eStructuralFeature
					|| ChenPackage.Literals.RELATIONSHIP__CONNECTIONS_TO_ENTITIES== eStructuralFeature)
				return false;
		}
		else if (ChenPackage.Literals.CONNECTION == self.eClass())
		{
			if (ChenPackage.Literals.CONNECTION__SOURCE == eStructuralFeature
					|| ChenPackage.Literals.CONNECTION__TARGET == eStructuralFeature
					|| ChenPackage.Literals.CONNECTION__GENERALIZATION_CONNECTION == eStructuralFeature)
				return false;
			Connection connection = (Connection) self;
			if (!connection.isGeneralizationConnection() && (connection.getSource() instanceof Attribute || connection.getTarget() instanceof Attribute))
			{
				return false;		
			}
			if (connection.isGeneralizationConnection())
			{
				if (ChenPackage.Literals.CONNECTION__KARDINALITY == eStructuralFeature
						|| ChenPackage.Literals.CONNECTION__ROLE == eStructuralFeature
//						|| ChenPackage.Literals.CONNECTION__TOTAL == eStructuralFeature
//						|| ChenPackage.Literals.CONNECTION__HAS_GENERALIZATION_SYMBOL == eStructuralFeature
//						|| ChenPackage.Literals.CONNECTION__ORIENTATION_GENERALIZATION_SYMBOL == eStructuralFeature
						)
					return false;
			}
			else
			{
				if (ChenPackage.Literals.CONNECTION__GENERALIZATION == eStructuralFeature
						|| ChenPackage.Literals.CONNECTION__GENERALIZATION_ORIENTATION == eStructuralFeature)
					return false;
			}
		}

		return true;	
	}
	
	public Boolean isConnectionWithLabel(Connection connection)
	{
		if (connection.isGeneralizationConnection() || connection.getSource() instanceof Attribute || connection.getTarget() instanceof Attribute)
		{
			return false;		
		}
		return true;
	}
	
	public Boolean showBegin(EObject self)
	{
		if (self instanceof Connection)
		{
			Connection connection = (Connection) self;
			if (connection.isGeneralizationConnection() || connection.getSource() instanceof Attribute || connection.getTarget() instanceof Attribute)
				return false;
			if (connection.getSource() instanceof Relationship)
				return true;
			return false;
		}
		else
		{
			return false;
		}
	}
	
	public Boolean showEnd(EObject self)
	{
		if (self instanceof Connection)
		{
			Connection connection = (Connection) self;
			if (connection.isGeneralizationConnection() || connection.getSource() instanceof Attribute || connection.getTarget() instanceof Attribute)
				return false;
			if (connection.getTarget() instanceof Relationship)
				return true;
			return false;
		}
		else
		{
			return false;
		}
	}
	
	public String getGeneralizationLabel(Generalization generalization)
	{
		if (generalization.getType() == Type.DISJUNKT)
			return "d";
		if (generalization.getType() == Type.UNION)
			return "u";
		if (generalization.getType() == Type.OVERLAPPING)
			return "o";
		return "";
	}
	
	public EObject changeGeneralizationType(EObject self, EObject _generalization)
	{
		Generalization generalization = (Generalization) _generalization;
		if (generalization.getType() == Type.DISJUNKT)
			generalization.setType(Type.OVERLAPPING);
		else if (generalization.getType() == Type.UNION)
			generalization.setType(Type.DISJUNKT);
		else if (generalization.getType() == Type.OVERLAPPING)
			generalization.setType(Type.UNION);
		return _generalization;
	}

	public EObject changeEntityType(EObject self, EObject _entity)
	{
		Entity entity = (Entity) _entity;
		if (entity.isWeakEntityType())
			entity.setWeakEntityType(false);
		else
			entity.setWeakEntityType(true);

		return _entity;
	}
	
	public EObject changeRelationshipType(EObject self, EObject _relationship)
	{
		Relationship relationship = (Relationship) _relationship;
		if (relationship.isIndentifyingRelationship())
			relationship.setIndentifyingRelationship(false);
		else
			relationship.setIndentifyingRelationship(true);

		return _relationship;
	}
	
	
	public EObject changeConnectionType(EObject self, EObject _connection)
	{
		Connection connection = (Connection) _connection;
		if (connection.isGeneralizationConnection())
		{
			if (connection.isGeneralization())
				connection.setGeneralization(false);
			else
				connection.setGeneralization(true);
			return _connection;
		}
		if (connection.getSource() instanceof Attribute || connection.getTarget() instanceof Attribute)
			return _connection;
		if (connection.isTotalPartizipation())
			connection.setTotalPartizipation(false);
		else
			connection.setTotalPartizipation(true);

		return _connection;
	}
	
	public EObject deleteEntity(EObject objectToDelete)
	{
		Chen chen = (Chen) objectToDelete.eContainer();
		// get Crossreferences:
		EObjectQuery objectQuery = new EObjectQuery(objectToDelete);

		Collection<EObject> connections = objectQuery
				.getInverseReferences(ChenPackage.Literals.CONNECTION__SOURCE);
		connections.addAll(objectQuery
				.getInverseReferences(ChenPackage.Literals.CONNECTION__TARGET));
		
		for (EObject connection : connections)
		{
			chen.getConnections().remove(connection);
		}
		
		if (objectToDelete instanceof Entity) {
			chen.getEntities().remove(objectToDelete);			
		}
		else if (objectToDelete instanceof Relationship)
		{
			chen.getRealtionships().remove(objectToDelete);
		}
		else if (objectToDelete instanceof Generalization)
		{
			chen.getGeneralizations().remove(objectToDelete);
		}
		else if (objectToDelete instanceof Attribute)
		{
			chen.getAttributes().remove(objectToDelete);
		}
		
		return objectToDelete;
	}
	
	public Boolean reconnectConnectionPrecondition(Connection self, EObject source, EObject target)
	{
		EObject elementOnotherSideOfConnection;
		if (self.getTarget() == source)
			elementOnotherSideOfConnection = self.getSource();
		else
			elementOnotherSideOfConnection = self.getTarget();
		
		if (target == elementOnotherSideOfConnection)
			return false;
		
		if (elementOnotherSideOfConnection instanceof Attribute)
		{
			if (target instanceof Attribute
					|| target instanceof Entity
					|| target instanceof Relationship)
				return true;
			else
				return false;
		}
		
		if (elementOnotherSideOfConnection instanceof Entity)
		{
			return true;
		}
		
		if (elementOnotherSideOfConnection instanceof Relationship)
		{
			if (target instanceof Attribute
					|| target instanceof Entity)
				return true;
			else
				return false;
		}
		
		if (elementOnotherSideOfConnection instanceof Generalization)
		{
			if (target instanceof Entity
					|| target instanceof Generalization)
				return true;
			else
				return false;
		}
		
		return true;
	}

	public EObject reconnectConnection(Connection self, EObject source, EObject target, EObject element)
	{
		EObject elementOnotherSideOfConnection;
		if (self.getTarget() == source)
		{
			elementOnotherSideOfConnection = self.getSource();
			self.setTarget(target);
		}
		else
		{
			elementOnotherSideOfConnection = self.getTarget();
			self.setSource(target);
		}
		
		if (elementOnotherSideOfConnection instanceof Attribute || target instanceof Attribute)
		{
			self.setGeneralizationConnection(false);
		}		
		else if (elementOnotherSideOfConnection instanceof Entity)
		{
			if (target instanceof Entity
					|| target instanceof Generalization)
			{
				self.setGeneralizationConnection(true);
			}
			else
				self.setGeneralizationConnection(false);
		}
		else if (elementOnotherSideOfConnection instanceof Relationship)
		{
			self.setGeneralizationConnection(false);
		}
		else if (elementOnotherSideOfConnection instanceof Generalization)
		{
			self.setGeneralizationConnection(true);
		}
		
		return self;
	}
	
	public String attributeLabel(Attribute attribute)
	{
		String label = "";
		if (attribute.getName() != null && !attribute.getName().isEmpty())
			label += attribute.getName();
		if (attribute.getType() != null && !attribute.getType().isEmpty())
			label += ":" + attribute.getType();

		return label;
	}
	
}
