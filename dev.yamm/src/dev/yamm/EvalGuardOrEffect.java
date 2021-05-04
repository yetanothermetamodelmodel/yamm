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
package dev.yamm;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.DynamicEObjectImpl;
import org.eclipse.xtext.xbase.XExpression;

import dev.yamm.gui.Layer;
import dev.yamm.logger.YAMMLogger;
import dev.yamm.operations.AccessStaticFeaturesFormClassLiterals;
import dev.yamm.operations.CalculateSubEffects;
import dev.yamm.operations.ChartOperation;
import dev.yamm.operations.CheckStateMachine;
import dev.yamm.operations.ColorObjects;
import dev.yamm.operations.CreateInstance;
import dev.yamm.operations.CreateObjectID;
import dev.yamm.operations.Des;
import dev.yamm.operations.Enumerations;
import dev.yamm.operations.GetInstances;
import dev.yamm.operations.GetInstancesOf;
import dev.yamm.operations.GetLayerInformation;
import dev.yamm.operations.GetSet;
import dev.yamm.operations.GetValue;
import dev.yamm.operations.IsInstanceOf;
import dev.yamm.operations.Lifeness;
import dev.yamm.operations.LoadModel;
import dev.yamm.operations.ManageContext;
import dev.yamm.operations.ManageTraces;
import dev.yamm.operations.NodeInfo;
import dev.yamm.operations.OpCall;
import dev.yamm.operations.PauseExecution;
import dev.yamm.operations.Print;
import dev.yamm.operations.TestUtil;
import dev.yamm.operations.Util;

public class EvalGuardOrEffect {

	private static YAMMLogger logger = YAMMLogger.getYAMMLogger("YAMM Log");

	public String ID;
	public String ID_0;

	static Boolean separateLoggingViewsString = false;

	public ChartManagement reflectivStateChart;
	
	// implementations of actionlanguage commands
	// (generated code has a connection to EvalGuardOrEffect)
	public CalculateSubEffects calculateOperation = new CalculateSubEffects(this);
	public CreateObjectID getID = new CreateObjectID(this);
	public Print print = new Print(this);
	public ManageTraces traceOperations = new ManageTraces(this);
	public PauseExecution pauseExecution = new PauseExecution(this);
	public Lifeness lifeness = new Lifeness(this);
	public ColorObjects coloring = new ColorObjects(this);
	public OpCall opCall = new OpCall(this);
	public CreateInstance createInstance = new CreateInstance(this);
	public IsInstanceOf isInstanceOf = new IsInstanceOf(this);
	public GetInstancesOf getInstancesOf = new GetInstancesOf(this);
	public GetInstances getInstances = new GetInstances(this);
	public ManageContext context = new ManageContext(this);
	public GetValue getValue = new GetValue(this);
	public ChartOperation chartOperation = new ChartOperation(this);
	public GetSet getSet = new GetSet(this);
	public NodeInfo nodeInfo = new NodeInfo(this);
	public CheckStateMachine checkStateMachine = new CheckStateMachine(this);
	public TestUtil testUtil = new TestUtil(this);
	public Util util = new Util(this);
	public GetLayerInformation getLayerInformation = new GetLayerInformation(this);
	public LoadModel loadModel = new LoadModel(this);
	public Enumerations enumations = new Enumerations(this);
	public Des des = new Des(this);
	public AccessStaticFeaturesFormClassLiterals accessStaticFeaturesFormClassLiterals = new AccessStaticFeaturesFormClassLiterals(this);
 
	public HashMap<Integer, HashMap<String, HashMap<String, String>>> guardCache = new HashMap<Integer, HashMap<String, HashMap<String, String>>>();

	public HashMap<Integer, HashMap<String, HashMap<String, String>>> effectCache = new HashMap<Integer, HashMap<String, HashMap<String, String>>>();

	/** one of the main stores for instances of the runtime model and its meta data(the other one is ObjectManagemnt.layerInformations);
	 *  always the same as ObjectManagement.objectCaches 
	 *  [0] metadata (runtime model) and instances of SMH and GSM
	 *  [1] instances of runtime model
	 *  */
	public EMap<String,EObject> maps[];

	public EvalGuardOrEffect(ChartManagement reflectivStateChart) {
		this.reflectivStateChart = reflectivStateChart;
	}

	/**
	 * ObjectManagemnt.objectCaches --> maps
	 * called before simulation
	 */
	@SuppressWarnings("unchecked")
	public void loadMaps() {
		int N = reflectivStateChart.objectManagement.getObjectCachesSize();
		maps = new BasicEMap[N];
		for(int i = N; --i != -1;) 
		{
			maps[i] = (EMap) reflectivStateChart.objectManagement.getObjectCache(i);
		}
	}

	/**
	 * Executes an effect. Invoked from the zerochart in state SubEffectIdentified.
	 * A class is generated and compiles at runtime for every operation/statemachine
	 * with one method for every effect. It can be accessed form ObjectManegement.methodMap and invoked via reflection.
	 * To find the right method in this map the key must be assembled. The methodMap also contains an instance of the generated class
	 * on which the method will be invoked. The parameter for this call is the (dynamic) instance of the operation class
	 * (part of the stackframe representation; connection to the runtime model).
	 * @param itsClassID ID of the operation instance e.g. 64a57b90 -> DynamicEObjectImpl@64a57b90 (eClass: EClassImpl@65c64fb9 (name: ClassAopAe5fd8d6))  
	 * @param transitionOrControlFlow a YTransition
	 * @param effectCount the number of the effect to evaluate in the transitionOrControlFlow
	 * @param layer = 1
	 */
	public void evalEffect(String itsClassID, Object transitionOrControlFlow, int effectCount, Integer layer) {
		String oldID = ID;
		ID = itsClassID;
		EMap<String, EObject> objectLayer = maps[layer+1]; //  [5155c915->DynamicEObjectImpl@68f757ce (eClass: EClassImpl@1fcd06d6 (name: ClassA)), 64a57b90->DynamicEObjectImpl@64a57b90 (eClass: EClassImpl@65c64fb9 (name: ClassAopAe5fd8d6))]
		String curID = itsClassID;
		if(!objectLayer.containsKey(curID) && !(transitionOrControlFlow instanceof EObject && ((EObject) transitionOrControlFlow).eClass().getName().equals("ControlFlow"))) {
			EMap<String, EObject> upperLayer = maps[layer];
			Object curObject = upperLayer.get(curID);
			String metaInstanceName = "";
			try {
				Method getMethod = curObject.getClass().getMethod("getName", (Class<?>)null);
				metaInstanceName = (String) getMethod.invoke(curObject, (Class<?>)null);
			} catch (SecurityException e) {
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				e.printStackTrace();
			}
			catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
			EClass eclass = (EClass) reflectivStateChart.objectManagement.getEClassifier(metaInstanceName,layer+1);
			EObject created = eclass.getEPackage().getEFactoryInstance().create(eclass);
			//Connection ID(upperObject) -> Object
			objectLayer.put(curID, created);

		}

		Object root = objectLayer.get(ID);
		if (root == null) {
			objectLayer = maps[layer];
			root = objectLayer.get(ID);
		}

		String rootName;
		if(root instanceof DynamicEObjectImpl) {
			DynamicEObjectImpl curDynamic = (DynamicEObjectImpl) root;
			rootName = curDynamic.eClass().getName();
		} else {
			rootName = root.toString();
			rootName = rootName.substring(0, rootName.length() - 1);
		}

		String opName = null;
		String effectCacheKey = null;
		String effectString = null;
		String transitionName = null;
		String transitionObjectID = null;
		String containerObjectID = null;

		
		if (transitionOrControlFlow instanceof EObject) { 
			EObject transitionOrControlFlowEObject = (EObject) transitionOrControlFlow; // e.g. YTransition
			String transitionOrControlFlowEClassName = transitionOrControlFlowEObject.eClass().getName(); // e.g.YTransition
			if (transitionOrControlFlowEClassName.equals("YTransition")) {
				opName = (String) reflectivStateChart.objectManagement.get(transitionOrControlFlowEObject, "source", "container", "operation", "name"); // e.g.YTransition
			} else if (transitionOrControlFlowEClassName.equals("ControlFlow")) {
				opName = ((String) reflectivStateChart.objectManagement.get(transitionOrControlFlowEObject, "container", "name")).replace(' ', '_');	
			}	
			EList<EObject> effects = (EList<EObject>) reflectivStateChart.objectManagement.get(transitionOrControlFlowEObject, "attachment", "effects"); // e.g. [YEffect, YEffect]
			effectString = (String) reflectivStateChart.objectManagement.get(effects.get(effectCount), "ObjectID"); // e.g. classB = createInstance(ClassB);
			transitionName = (String) reflectivStateChart.objectManagement.get(transitionOrControlFlowEObject, "name"); // e.g. 0

			transitionObjectID = (String) reflectivStateChart.objectManagement.get(transitionOrControlFlowEObject, "ObjectID"); // e.g. 3443316d the ID of the transition
			containerObjectID = (String) reflectivStateChart.objectManagement.get(transitionOrControlFlowEObject, "container", "ObjectID"); // e.g. 3f3f2b3 the ID of the statemachine
			effectCacheKey = effectCache.get(layer).get(rootName).get(effectString); // e.g. ClassAopAe5fd8d6opAeffect0_0
		}

		// get the instance of the compiled class
		Object objectInvokedOn = reflectivStateChart.objectManagement.getMethodMap(layer).get(rootName.concat(opName)); // e.g. ClassAopACompile@3f36dedf
		EObject eobject = (EObject) root;  // e.g. [org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64a57b90 (eClass: EClassImpl@65c64fb9 (name: ClassAopAe5fd8d6))]
		Object[] objects = { eobject };
		try {
			// get the Method-object of the compiled class for the effect effectCacheKey and invoke it with the operation class as its parameter
			((Method) reflectivStateChart.objectManagement.getMethodMap(layer).get(effectCacheKey)).invoke(objectInvokedOn, objects);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {

			e.printStackTrace();

			logger.error("EFFECT - InvocationTargetException" 
					+"\nLayer : "+layer
					+"\nEffectCacheKey : "+effectCacheKey
					+"\nMethod called : "+(Method) reflectivStateChart.objectManagement.getMethodMap(layer).get(effectCacheKey)
					+"\nAvailable methods : "+reflectivStateChart.objectManagement.getMethodMap(layer) 
					+"\nRoot Object : " +objectInvokedOn
					+"\nCalled with Objects: "+objects);
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			PrintStream ps = new PrintStream(baos);
			e.printStackTrace(ps);
			String result = baos.toString();
			int startResult = result.indexOf("Caused by:");
			int endResult = result.indexOf('\r', startResult);
			if (startResult != -1 && endResult != -1 && startResult < endResult)
				logger.error(result.substring(startResult, endResult));
			else
				logger.error(result);
		}	


		// logging
		if (!reflectivStateChart.resourceManagement.threads) {
			logger.debug("Executing : \"" + effectCacheKey + "\"");
			if(((Layer)reflectivStateChart.objectManagement.getViewLayers().get(layer)).isLogLayer()) {
				if (!reflectivStateChart.resourceManagement.threads && ConfigurationManagement.isSeparateLoggingViewsForEachLayer()) {
					if(transitionName == null) 
						transitionName = "";
					YAMMLogger logger = YAMMLogger.getYAMMLogger("YAMM Log Layer" + (layer+1));
					logger.setLevel(ConfigurationManagement.getAndSetPreferencesLoggingLevel());
					logger.trace("Effect \"".concat(Common.rmWSAQM(effectString))
							.concat("\" of Transition \"").concat(transitionName).concat("\" (ID: ").concat(transitionObjectID)
							.concat(") of State Machine (ID: ")
							.concat(containerObjectID).concat(") was successfully executed."));
				} else {
					if(transitionName == null) 
						transitionName = "";
					logger.trace("Effect \"".concat(Common.rmWSAQM(effectString))
							.concat("\" of Transition \"").concat(transitionName).concat("\" (ID: ").concat(transitionObjectID)
							.concat(") of State Machine (ID: ")
							.concat(containerObjectID).concat(") was successfully executed on layer " + (layer+1) + "."));
				}
			}
		}

		ID = oldID;
	}

	/**
	 * Evalutes a guard. Is invoked from the zerochart in state TransitionIdentified or from the effect evalGuard(...).
	 * Similar to evalEffect...
	 * @param contextObjectID
	 * @param transitionOrControlFlow
	 * @param layer
	 * @return
	 */
	public boolean evalGuard(Object contextObjectID, Object transitionOrControlFlow, Integer layer) {
		String ID = (String) contextObjectID;
		EObject transitionOrControlFlowEObject = (EObject) transitionOrControlFlow;

		if (reflectivStateChart.objectManagement.get(transitionOrControlFlowEObject, "attachment") == null)
			return true;

		XExpression guard = (XExpression) reflectivStateChart.objectManagement.get(transitionOrControlFlowEObject, "attachment", "guard");
		if (guard == null)
			return true;

		String contextName = ((String) reflectivStateChart.objectManagement.get(transitionOrControlFlowEObject, "source", "container", "operation", "name")).replace(' ', '_');
		String key = guardCache.get(layer).get(contextName).get((String) reflectivStateChart.objectManagement.get(transitionOrControlFlowEObject, "attachment", "ObjectID"));
		EObject root = reflectivStateChart.objectManagement.getObjectCache(layer+1).get(ID);

		try {
			if (reflectivStateChart.resourceManagement.threads) {
				return (Boolean) ((Method) reflectivStateChart.objectManagement.getMethodMap(layer).get(key)).invoke(
						reflectivStateChart.objectManagement.getMethodMap(layer).get(root.eClass().getName().concat(contextName)), new Object[] { root });
			} else {
				boolean result = (Boolean) ((Method) reflectivStateChart.objectManagement.getMethodMap(layer).get(key)).invoke(
						reflectivStateChart.objectManagement.getMethodMap(layer).get(root.eClass().getName().concat(contextName)), new Object[] { root });
//				logEvaluatedGuard(reflectivStateChart.resourceManagement.threads, layer, transitionOrControlFlowEObject, result);
				return result;
			}

		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			logger.error("GUARD - Invocation Target Exception on layer: "+layer+"\n method: "+
					((Method) reflectivStateChart.objectManagement.getMethodMap(layer).get(key))
					+"\n object: "+reflectivStateChart.objectManagement.getMethodMap(layer)+"\n root: "+root);
			e.printStackTrace();
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			PrintStream ps = new PrintStream(baos);
			e.printStackTrace(ps);
			String result = baos.toString();
			int startResult = result.indexOf("Caused by:");
			int endResult = result.indexOf('\r', startResult);
			if (startResult != -1 && endResult != -1 && startResult < endResult)
				logger.error(result.substring(startResult, endResult));
			else
				logger.error(result);
		}
		return false;
	}


	/**
	 * @param layer
	 * @param transitionOrControlFlow
	 * @param result
	 */
	public void logEvaluatedGuard(boolean threadVariant, int layer, EObject transitionOrControlFlow, boolean result) {
		String eClassName = transitionOrControlFlow.eClass().getName();

		if (eClassName.equals("Transition") || eClassName.equals("ControlFlow")) {
			String guard = "null";
			String objectID = "null";
			String transitionName = null;
			String containerName = null;
			String containerObjectID = null;
			EObject attachmentEObject = (EObject) reflectivStateChart.objectManagement.get(transitionOrControlFlow, "attachment");

			if (attachmentEObject != null) {
				guard = (String) reflectivStateChart.objectManagement.get(attachmentEObject, "guard");
				objectID = (String) reflectivStateChart.objectManagement.get(attachmentEObject, "ObjectID");
			}

			transitionName = (String) reflectivStateChart.objectManagement.get(transitionOrControlFlow, "name");
			EObject containerEObject = (EObject) reflectivStateChart.objectManagement.get(transitionOrControlFlow, "container");

			if (containerEObject != null) {
				containerName = (String) reflectivStateChart.objectManagement.get(containerEObject, "name");
				containerObjectID = (String) reflectivStateChart.objectManagement.get(containerEObject, "ObjectID");
			}

			String message = "Evaluated Guard \"" + Common.rmWSAQM(guard) + "\" (ID: " + objectID + ")"  
					+ " of Transition \"" + Common.rmWSAQM(transitionName) + "\" (ID: " + objectID + ") of State Machine \""
					+ Common.rmWSAQM(containerName) + "\" (ID: " + containerObjectID + ") to : \"" + result + "\"";

			if (!threadVariant && ConfigurationManagement.isSeparateLoggingViewsForEachLayer()) {
				if(((Layer)reflectivStateChart.objectManagement.getViewLayers().get(layer)).isLogLayer()) {
					YAMMLogger logger = YAMMLogger.getYAMMLogger("YAMM Log Layer".concat(((Integer)(layer+1)).toString()));
					logger.trace(message.concat("."));	
				}
			} else {
				logger.trace(message.concat(" of layer ").concat(((Integer)(layer+1)).toString().concat(".")));
			}
		}
	}
}
