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

import java.lang.reflect.Method;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Vector;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.DynamicEObjectImpl;

import dev.yamm.coreModelXmi.yamm.YNamedElement;
import dev.yamm.coreModelXmi.yamm.YObject;
import dev.yamm.gui.Layer;
import dev.yamm.logger.YAMMLogger;

/**
 * The central class to manage the storing, the access, the manipulating 
 * the runtime model and their instances.
 *
 */
public class ObjectManagement {
	public static YAMMLogger logger = YAMMLogger.getYAMMLogger("YAMM Log");
	
	
	public List<QueueListener> eventQueueListener = new ArrayList<>();	
	public List<QueueListener> queueListener = new ArrayList<>();
	public List<AddQueueListener> addQueueListener = new ArrayList<>();
	public List<QueueListener> delayQueueListener = new ArrayList<>();
	
	public Map<Integer, List<EObject>> simulationObjectInsances = new HashMap<>();	
	public Map<Integer, List<EObject>> eventQueue = new HashMap<>(); 
	public Map<Integer, List<EObject>> consumedEvents = new HashMap<>();  
	public Map<Integer, Map<Object, List<EObject>>> queues = new HashMap<>();
	public Map<Integer, Map<Object, List<EObject>>> delayQueues = new HashMap<>();
	public PropertyObserver propertyObserver;
	public QueueObserver queueObserver;
	
	private Map<String,Method> outputEvalMethods = new HashMap<>();
	private Map<String,Object> outputEvalObject = new HashMap<>();
	
	public interface QueueListener {
		public static int ADD = 1;
		public static int REMOVE = 2;
		void changed(int event, EObject object, Object queue);
	}
	public void addEvent(EObject event, int layer)
	{
		eventQueue.get(layer).add(event);
		eventQueueListener.forEach(listener -> listener.changed(QueueListener.ADD, event, null)); 
	}
	public void removeEvent(EObject event, int layer)
	{
		consumedEvents.get(layer).add(event);
		eventQueue.get(layer).remove(event);
		eventQueueListener.forEach(listener -> listener.changed(QueueListener.REMOVE, event, null));
	}
	
	public void addQueueElement(EObject queue, EObject element , int layer)
	{
		if(queues.get(layer).containsKey(queue))
		{	
			queues.get(layer).get(queue).add(element);
			queueListener.forEach(listener -> listener.changed(QueueListener.ADD, element, queue));
		}
	}
	public void removeQueueElement(EObject queue, EObject element , int layer)
	{
		if(queues.get(layer).containsKey(queue))
		{	
			queues.get(layer).get(queue).remove(element);
			queueListener.forEach(listener -> listener.changed(QueueListener.REMOVE, element, queue));
		}
	}
	public void addQueue(EObject queue, int layer)
	{
		List<EObject> queueList = new LinkedList<>();
		List<EObject> delayQueueList = new LinkedList<>();
		queues.get(layer).put(queue, queueList);
		delayQueues.get(layer).put(queue, delayQueueList);
		addQueueListener.forEach(listener -> listener.queueAdded(queue, layer, queueList, delayQueueList));
	}
	
	public void addDelayQueue(EObject queue, int layer)
	{
//		delayQueues.get(layer).put(queue, new LinkedList<>());
	}
	public static interface AddQueueListener
	{
		void queueAdded(EObject queue, int layer, List<EObject> queueList, List<EObject> delayQueueList);
	}
	
	public void addDelayedQueueElement(EObject queue, EObject element , int layer)
	{
		if(delayQueues.get(layer).containsKey(queue))
		{	
			delayQueues.get(layer).get(queue).add(element);
			delayQueueListener.forEach(listener -> listener.changed(QueueListener.ADD, element, queue));
		}
	}
	
	public void removeDelayedQueueElement(EObject queue, EObject element , int layer)
	{
		if(delayQueues.get(layer).containsKey(queue))
		{	
			delayQueues.get(layer).get(queue).remove(element);
			delayQueueListener.forEach(listener -> listener.changed(QueueListener.REMOVE, element, queue));
		}
	}

	public Map<String, Integer> qualifiedTypeNameToNextDefaultNameNumber;
	public List<Map<String, String>> objectIdToName; 
	
	/** used to initialize the yClass reference to access the metadata from within the actionlanguage */
	public Map<EClassifier, EObject> eClassifierToYClassifier = new HashMap<>(); 
	public Map<Integer, Map<String, EObject>> qualifiedNameToYClassifier = new HashMap<>(); 
	public Map<EClassifier, EObject> eClassifierToYClassifierTransformed = new HashMap<>();
	
	public Map<String, Method> getOutputEvalMethods() {
		return outputEvalMethods;
	}
	

	public Map<String, Object> getOutputEvalObject() {
		return outputEvalObject;
	}

//	private List<Method> outputEvalmethods = new ArrayList<>w();
	
	
	/**
	 * Contains instances of class {@code Layer} (according to the number of
	 * layer files in the view).
	 */
	private Vector<Layer> viewLayers = new Vector<Layer>();

	/**
	 * One of the global object stores. Always the same as EvalGuardOrEffects.maps.
	 * 	[0] metadata (runtime model); and instances of SMH and GSM
	 *  [1] instances of the runtime model
	 */
	private Vector<EMap<String, EObject>> objectCaches = new Vector<EMap<String, EObject>>();

	/** Contains the names of the {@link #ePackages}. */
	private Vector<String> packageNames = new Vector<String>();

	/** A vector storing the nsURIs. */
	private Vector<String> nsURIs = new Vector<String>();

	/**
	 * the EPackages to load the models (the Original EPackage and the generated ones for external models)
	 */
	private HashMap<Integer, EPackage> ePackages = new HashMap<Integer, EPackage>();

	/**
	 *  contains static YClasses
	 */
	private Vector<EMap<String, EObject>> statics = new Vector<EMap<String, EObject>>();
	
	/**
	 * layerNumber -> QualifiedClassName -> (static)Feature -> Value
	 */
	public Map<Integer, Map<String, Map<EStructuralFeature, Object>>> staticValues= new HashMap<>();

	/**
	 * contains the metadata of generated methods for the actionlanguage and the instances of the containing classes
	 * --> EvalGaurdOrEffect.evalGuard/Effect()
	 */
	private HashMap<Integer, HashMap<String, Object>> methodMap = new HashMap<Integer, HashMap<String, Object>>();

	/**
	 * Each entry represents the EClassifier of one EPackage. As key: the
	 * EPackages nsURI, as value: a map containing the names of the ECLassifier and
	 * the EClassifier themselves.
	 * 
	 */
	private HashMap<String, HashMap<String, EClassifier>> classifiers = new HashMap<String, HashMap<String, EClassifier>>();


	/**
	 * model files.
	 */
	private HashMap<String, Long> files = new HashMap<String, Long>();

	private boolean hasBeenSoftReseted = false;

	/**
	 * beside objectCaches(and EvalGuardorEffect.maps) this is the second central object storage. 
	 * Contains lists of instances of a class with their name as key(GetInsancesOf(...)). And contains
	 * the structure of a statemachine as key-value pairs for faster access(f34da3-target: [YTransition(ID:xy), YTransition(ID:xyz)])
	 * 
	 */
	private HashMap<Integer, LayerInformation> layerInformations = new HashMap<Integer, LayerInformation>();

	
	/** modified objects */
	private HashMap<EObject, HashMap<EStructuralFeature, Object>> eObjectsModified = new HashMap<EObject, HashMap<EStructuralFeature, Object>>(); // to
																																					// restore
																																					// all
																																					// modified
																																					// eObjects

	private HashMap<Integer, EMap<String, EObject>> initialObjectCaches = new HashMap<Integer, EMap<String, EObject>>(); // to
																															// restore
																															// the
																															// global
																															// object
																															// map

	private HashMap<Integer, LayerInformation> initialLayerInformation = new HashMap<Integer, LayerInformation>();

	private ArrayList<String> objectIDsIntroduced = new ArrayList<String>();

	private static Boolean semaphore = new Boolean(true);

	/** A ChartManagement object. */
	public ChartManagement reflectivStateChart;

	
	private List<Map<String, Class<?>>> layerClassObjects;
	
	
	/**
	 * The constructor accepting a ChartManagement object.
	 * 
	 * @param reflectivStateChart : the ChartManagement object initializing
	 *                            {@link #reflectivStateChart}.
	 */
	public ObjectManagement(ChartManagement reflectivStateChart) {
		this.reflectivStateChart = reflectivStateChart;
	}

	public ObjectManagement() {
		
	}
	
	public ResourceManagement getResourceManagement() {
		return reflectivStateChart.resourceManagement;
	}
	
	public List<Map<String, Class<?>>> getLayerClassObjects() {
		if (layerClassObjects == null)
			layerClassObjects = new ArrayList<>();
		return layerClassObjects;
	}
	/**
	 * A nested class representing one layer by storing its model elements in
	 * {@link LayerInformation#eObjectsAccordingEClassOrObjectID}. and also
	 * including the information, if its valid or not.
	 */
	public class LayerInformation {
		/** marks an LayerInformation object as valid or invalid. */
		boolean valid = false;

		/**
		 * HashMap containing model elements (as key: model element name; as
		 * value: the model element/s itself/themselves)
		 */
		public HashMap<String, EList<EObject>> eObjectsAccordingEClassOrObjectID = new HashMap<String, EList<EObject>>();

		public String toString() {
			return valid + "__" + eObjectsAccordingEClassOrObjectID.size() + "_" + eObjectsAccordingEClassOrObjectID;
		}
	}

	/**
	 * Copies a LayerInformation object - but does not include the value of
	 * attribute {@link #valid}.
	 * 
	 * @param original : the original LayerInformation object
	 * @return copy - the copy
	 */
	LayerInformation copyLayerInformations(LayerInformation original) {
		LayerInformation copy = new LayerInformation();
		copy.eObjectsAccordingEClassOrObjectID.putAll(original.eObjectsAccordingEClassOrObjectID);
		return copy;
	}

	/**
	 * Adds a new element to the global object store
	 * 
	 * @return the added object cache
	 */
	public int addObjectCache() {
		objectCaches.add(new BasicEMap<String, EObject>());
		return objectCaches.size() - 1;
	}

	/**
	 * Gets the {@link #objectCaches} size.
	 * 
	 * @return size
	 */
	public int getObjectCachesSize() {
		return objectCaches.size();
	}

	/**
	 * A getter for an {@link #objectCaches} element considering a specified layer
	 * number.
	 * 
	 * @param layer : the specified layer as the index
	 * @return the element / null - if there is no element found under the given
	 *         index.
	 */
	public EMap<String, EObject> getObjectCache(int layer) {
		if (layer > -1 && layer < objectCaches.size())
			return objectCaches.get(layer);

		return null;
	}
	
	public boolean instanceOf(Object obj, String typeName) {
		EClassifier eclassifier = getEClassifier(typeName, 1);
		if (obj instanceof EObject)
		{
			return ((EObject)obj).eClass() == eclassifier;
		} else {
			return false;
		}
		
	}
	

	/**
	 * Clears the global object store {@link #objectCaches}.
	 */
	public void clearObjectCaches() {
		objectCaches.clear();
		Common.printlnMessage("Object Cache cleared.", DUMPMESSAGETO.INFO, true, true);
	}

	/**
	 * Clears a specified element of {@link #objectCaches}.
	 * 
	 * @param layer : specifies the element to clear
	 * @return true: if the object cache is cleared/ false: if layer number is wrong
	 */
	public boolean clearObjectCache(int layer) {
		if (layer > -1 && layer < objectCaches.size()) {
			objectCaches.get(layer).clear();
			Common.printlnMessage("Object Cache cleared for layer \"" + layer + "\" cleared", DUMPMESSAGETO.INFO, true,
					true);
			return true;
		}
		return false;
	}

	/**
	 * A getter for {@link #ePackages} considering a specified layer number.
	 * 
	 * @param layer : the layer of the ePackage to get.
	 * @return EPackage - the {@code EPackage} associated with the parameter
	 *         {@code layer}
	 */
	public EPackage getEPackage(int layer) {
		if (layer > -1 && layer < ePackages.size()) {
			return ePackages.get(layer);
		}
		return null;
	}

	/**
	 * Adds an EPackage to {@link #ePackages}: At index 0 a YammPackage, as of index
	 * 1 the (merged) EPackage.
	 * 
	 * @param layer    : the layer
	 * @param ePackage : the EPackage
	 */
	public void setEPackage(Integer layer, EPackage ePackage) {
		logger.info("Package " + ePackage.getName() + " (with nsURI \"" + ePackage.getNsURI() + "\") set for layer "
				+ layer + ".");
		ePackages.put(layer, ePackage);
	}

	/**
	 * Clears the HashMap {@link #ePackages}.
	 */
	public void clearEPackages() {
		ePackages.clear();
	}

	/**
	 * A getter for Vector {@link #packageNames}.
	 * 
	 * @return packageNames - the names
	 */
	public Vector<String> getPackageNames() {
		return packageNames;
	}

	/**
	 * Adds a new element to Vector {@link #packageNames}.
	 * 
	 * @param newPackageName
	 */
	public void addPackageName(String newPackageName) {
		packageNames.add(newPackageName);
		logger.debug("Package name \"" + newPackageName + "\" added in Object Management for layer "
				+ (packageNames.size() - 1) + ".");
	}

	/**
	 * A setter for the Vector {@link #packageNames}.
	 * 
	 * @param packageNames : a vector of package names
	 */
	public void setPackageNames(Vector<String> packageNames) {
		this.packageNames = packageNames;
		if (packageNames != null) {
			for (Integer i = 0; i < packageNames.size(); i++) {
				logger.info(
						i.toString().concat(". package name set to " + packageNames.get(i)) + " in Object Management.");
			}
		}
	}

	/**
	 * A getter for EClasses.
	 * 
	 * @param ePackage  : contains the EClasses
	 * @param className : the EClass name
	 * @return EClass - the EClass
	 */
	public EClass getEClass(EPackage ePackage, String className) {
		if (ePackage != null) {
			EClassifier eClassifier = ePackage.getEClassifier(className);
			if (eClassifier instanceof EClass) {
				return (EClass) eClassifier;
			}
		}
		return null;
	}

	/**
	 * loads all classifies of the generated (runtime-)Ecore model. As key: the particular nsURI,
	 * as Value: the associated Map of a certain layers classifiers.
	 * 
	 * @param registry : the ResourceManagment.resourceSet PackageRegistry
	 */
	public void loadClassifiers(Registry registry) {
		for (String nsURI : nsURIs) {
			if (!classifiers.containsKey(nsURI)) {
				EPackage ePackage = registry.getEPackage(nsURI);
				HashMap<String, EClassifier> classifier = new HashMap<String, EClassifier>();
				String prefix = "";
				addClassifier(ePackage, classifier, prefix);
				classifiers.put(nsURI, classifier);
			}
		}
	}

	/**
	 * Adds ECLassifier of an EPackage to a HashMap (as key: name of the
	 * ECLassifier, as value: the EClassifier itself). Recursive method calls in
	 * case the EPackage contains ESubpackages.
	 * 
	 * @param actPackage : the EPackage
	 * @param classifier : the target HashMap
	 * @param prefix     : prefix
	 */
	private void addClassifier(EPackage actPackage, HashMap<String, EClassifier> classifier, String prefix) {
		for (EClassifier actClass : actPackage.getEClassifiers()) {
//			if (actClass.getName().equals("YClass")) {
//				classifier.put(prefix + actClass.getName(), actClass);
////				classifier.put(prefix + actClass.getName(), YammPackage.Literals.YCLASS);
//			} else if ( actClass.getName().equals("YProperty")) {
//				classifier.put(prefix + actClass.getName(), YammPackage.Literals.YPROPERTY);
//			} else if ( actClass.getName().equals("YOperation")) {
//				classifier.put(prefix + actClass.getName(), YammPackage.Literals.YOPERATION);
//			} else if ( actClass.getName().equals("YStateMachine")) {
//				classifier.put(prefix + actClass.getName(), YammPackage.Literals.YSTATE_MACHINE);
//			} 
//			else if ( actClass.getName().equals("YStateMachineHandler")) {
//				classifier.put(prefix + actClass.getName(), YammPackage.Literals.YSTATE_MACHINE_HANDLER);
//			} else if ( actClass.getName().equals("YGlobalStateMachine")) {
//				classifier.put(prefix + actClass.getName(), YammPackage.Literals.YGLOBAL_STATE_MACHINE);
//			} 
//			else {
				classifier.put(prefix + actClass.getName(), actClass);
//			}	
		}
		for (EPackage subPackage : actPackage.getESubpackages()) {
			String oldPrefix = prefix;
			prefix = prefix + subPackage.getName() + ".";
			addClassifier(subPackage, classifier, prefix);
			prefix = oldPrefix;
		}
	}

	/**
	 * A getter for an EClassifier out of {@link #classifiers}
	 * 
	 * @param className : the class name for getting the one EClassifier
	 * @param layer     : the layer number for getting the nsURI needed as a key for
	 *                  all EClassifiers of the layer
	 * @return EClassifier
	 */
	public EClassifier getEClassifier(String className, int layer) {
		String nsURI = nsURIs.get(layer);
		HashMap<String, EClassifier> classifier = classifiers.get(nsURI);
		return classifier.get(className);
	}

	/**
	 * Gets a layer specific nsURI out of {@link #nsURIs}.
	 * 
	 * @param layer : the layer specifying the nsURI
	 * @return nsURI - if the layer number is valid / null otherwise
	 */
	public String getNsURI(int layer) {
		if (layer > -1 && layer < nsURIs.size())
			return nsURIs.get(layer);
		return null;
	}

	/**
	 * Returns the {@link #nsURIs} size.
	 * 
	 * @return {@code nsURIs} size
	 */
	public int nsURISize() {
		return nsURIs.size();
	}

	/**
	 * Sets the nsURI for layer > 0. The place where the nsURI of layer 0 is
	 * set: {@link #resetNSURIs()}.
	 * 
	 * @param nsURI the layers nsURI.
	 */
	public void addNSURI(String nsURI) {
		nsURIs.add(nsURI);
		logger.info("Setting nsURI \"" + nsURI + "\" for layer " + (nsURIs.size() - 1) + ".");
	}

	/**
	 * Replaces the nsURI of the modified EPackage with a nsURI having an
	 * appendix according to the relevant layer.
	 * 
	 * @param position : the position of the respective nsURI (correlates with the
	 *                 currents layers number).
	 * @param nsURIOLD : the old nsURI.
	 * @param nsURINew : the nsURI with the current layer appended.
	 */
	public void changeNSURI(int position, String nsURIOld, String nsURINew) {
		if (position > 0 && position < nsURIs.size()) {
			nsURIs.remove(position);
			nsURIs.add(position, nsURINew);
			logger.info("Resetting nsURI \"" + nsURINew + "\" for layer " + position + ".");
		}
	}

	/**
	 * A getter for {@link #viewLayers}.
	 * 
	 * @return {@code viewLayers}
	 */
	public Vector<Layer> getViewLayers() {
		return viewLayers;
	}

	/**
	 * Returns the {link {@link #methodMap}.
	 * 
	 * @param layer : the current layer
	 * @return methodMap - the specified methodMap entry according to the current
	 *         layer
	 */
	public HashMap<String, Object> getMethodMap(Integer layer) {
		if (layer > -1 && layer < methodMap.size()) {
			return methodMap.get(layer + 1);
		}
		return null;
	}

	/**
	 * Initializes the {@link #methodMap}.
	 * 
	 * @param layer : the current layer
	 */
	public void initializeMethodMap(Integer layer) {
		if (layer > -1) {
			if (methodMap.get(layer + 1) == null)
				methodMap.put(layer + 1, new HashMap<String, Object>());
		}
	}

	/**
	 * A Getter for the {@link #files}.
	 * 
	 * @return {@code files} - the files
	 */
	public HashMap<String, Long> getFiles() {
		return files;
	}

	/**
	 * A getter for {@link #statics}.
	 * 
	 * @return {@code statics}
	 */
	public Vector<EMap<String, EObject>> getStatics() {
		return statics;
	}

	/**
	 * A getter for {@link #statics} accepting a parameter.
	 * 
	 * @param layer : the layer
	 * @return {@code statics}
	 */
	public EMap<String, EObject> getStatics(int layer) {
		return statics.get(layer);
	}

	public boolean isHasBeenSoftReseted() {
		return hasBeenSoftReseted;
	}

	public void setHasBeenSoftResetted(boolean hasBeenSoftReseted) {
		this.hasBeenSoftReseted = hasBeenSoftReseted;
	}

	public void softReset() {

		
		resultMarkedProperties = null;
		resultObserver = null;
		resultQueue = null;
		resultSimObjActive = new HashMap<>();
		qualifiedTypeNameToNextDefaultNameNumber = new HashMap<>();
		objectIdToName = new ArrayList<>();
		
		simulationObjectInsances.clear();
		eventQueue.clear();
		consumedEvents.clear();
		//classifiers.clear(); 
		//ePackages.clear();   	
		eventQueueListener.clear(); 
		//layerInfo.clear();		
		queues.clear();
		delayQueues.clear();
		
		eventQueueListener.clear();
		queueListener.clear();
		addQueueListener.clear();
		delayQueueListener.clear();
		
		outputEvalMethods.clear();
		outputEvalObject.clear();
		
		staticValues.clear();
		oneInstanceForEveryClassJustForAccessOfStaticFeatures.clear();
		
		for (int layerNumber = 0; layerNumber < objectCaches.size(); layerNumber++) {
			
			objectIdToName.add(new HashMap<>());	
			
			EMap<String, EObject> eMap = new BasicEMap<String, EObject>();
			eMap.addAll(initialObjectCaches.get(layerNumber));
			objectCaches.set(layerNumber, eMap);
			layerInformations.put(layerNumber, copyLayerInformations(initialLayerInformation.get(layerNumber)));
			
			reflectivStateChart.objectManagement.simulationObjectInsances.put(layerNumber + 1, new ArrayList<>());
			reflectivStateChart.objectManagement.eventQueue.put(layerNumber + 1, new ArrayList<>());
			reflectivStateChart.objectManagement.consumedEvents.put(layerNumber + 1, new ArrayList<>());
			reflectivStateChart.objectManagement.queues.put(layerNumber + 1, new HashMap<>());
			reflectivStateChart.objectManagement.delayQueues.put(layerNumber + 1, new HashMap<>());
			//reflectivStateChart.objectManagement.qualifiedNameToYClassifier.put(layerNumber + 1, new HashMap<>());
		}

		setHasBeenSoftResetted(true);

		for (EObject eObject : eObjectsModified.keySet()) {
			HashMap<EStructuralFeature, Object> eStructuralFeatures = eObjectsModified.get(eObject);
			for (EStructuralFeature eStructuralFeature : eStructuralFeatures.keySet()) {
				set(eObject, eStructuralFeatures.get(eStructuralFeature), eStructuralFeature.getName());
			}
			eStructuralFeatures.clear();
		}

		eObjectsModified.clear();
		objectIDsIntroduced.clear();
	}

	public void setObjectCaches() {
		initialObjectCaches.clear();
		for (int layerNumber = 0; layerNumber < objectCaches.size(); layerNumber++) {
			EMap<String, EObject> layer = objectCaches.get(layerNumber);
			EMap<String, EObject> layerCopy = new BasicEMap<String, EObject>();
			layerCopy.addAll((Collection<? extends Entry<String, EObject>>) layer);
			initialObjectCaches.put(layerNumber, layerCopy);
			buildStructureInformation(layerNumber);
			initialLayerInformation.put(layerNumber, copyLayerInformations(layerInformations.get(layerNumber)));
		}
	}

	/**
	 * Prepares the loading of the model elements and the merging of the
	 * EPackages by clearing/ initializing some maps/ vectors and adding the first
	 * element - a YammPackage - to {@link #ePackages}. Is also invoked when
	 * simulation stops.
	 */
	public void reset() {
		
		resultMarkedProperties = null;
		resultObserver = null;
		resultQueue = null;
		resultSimObjActive = new HashMap<>();
		qualifiedTypeNameToNextDefaultNameNumber = new HashMap<>();
		objectIdToName = new ArrayList<>();
		
		
		simulationObjectInsances.clear();
		eventQueue.clear();
		consumedEvents.clear();
		classifiers.clear();
		ePackages.clear();
		eventQueueListener.clear();
		layerInfo.clear();
		queues.clear();
		delayQueues.clear();
		
		eventQueueListener.clear();
		queueListener.clear();
		addQueueListener.clear();
		delayQueueListener.clear();
		
		outputEvalMethods.clear();
		outputEvalObject.clear();
		
		staticValues.clear();
		oneInstanceForEveryClassJustForAccessOfStaticFeatures.clear();
		
		// check if something has already been loaded
		if (reflectivStateChart.resourceManagement.resourceSet != null) {
			setEPackage(0, (reflectivStateChart.resourceManagement.resourceSet.getPackageRegistry()
					.getEPackage("http://www.yamm.dev/coreModelXmi/Yamm")));
			// reflectivStateChart.resourceManagement.registerMetaModelPackages(false);

			objectCaches = new Vector<EMap<String, EObject>>();
			packageNames = new Vector<String>();
			resetNSURIs();
			// methodMap.clear();
			statics.clear();
		}
		setInvalidStructureInformationForAllLayers();
	}

	/**
	 * Creates a new Vector <String> as a container for nsURIs. The first
	 * element at index 0 is set with http://www.yamm.dev/coreModelXmi/Yamm. The following
	 * elements represent the nsURI of the current layer {@link #addNSURI()}.
	 */
	public void resetNSURIs() {
		nsURIs = new Vector<String>();
		logger.info("Setting nsURI \"http://www.yamm.dev/coreModelXmi/Yamm\" for layer 0.");
		nsURIs.add("http://www.yamm.dev/coreModelXmi/Yamm");
	}

	/**
	 * Removes every {link {@link #layerInformations} entry.
	 */
	public void setInvalidStructureInformationForAllLayers() {
		int layerNumber = 0;
		// set existing layer information to invalid
		if (layerNumber <= viewLayers.size()) {
			setInvalidStructureInformation(layerNumber);
		}
		// delete rest
		while (layerInformations.containsKey(layerNumber)) {
			layerInformations.remove(layerNumber++);
		}
	}

	/**
	 * Sets the LayerInformation attribute valid false.
	 * 
	 * @param layerNumber : the layer number
	 */
	public void setInvalidStructureInformation(Integer layerNumber) {
		if (layerInformations.containsKey(layerNumber)) {
			layerInformations.get(layerNumber).valid = false;
		}
	}

	/**
	 * Invokes the building of all structure information (layerInformation).
	 * 
	 * @param onlyReBuildIfRequired : only if a layer is marked "invalid"
	 */
	public void buildStructureInformationForAllLayers(
			boolean onlyReBuildIfRequired)
	{
		for (int layerNumber = 0; layerNumber < objectCaches.size(); layerNumber++) {
			if (onlyReBuildIfRequired && layerInformations.containsKey(layerNumber)
					&& layerInformations.get(layerNumber).valid == false)
				continue;
			buildStructureInformation(layerNumber);
		}
	}

	// "existing" -> "forceOverwrite" parameter ?
	/**
	 * Rebuilds the structure information for a layer (layerInformation).
	 * 
	 * @param layerNumber : number of the layer the structure information is rebuild
	 *                    for
	 */
	public void buildStructureInformation(Integer layerNumber) {
		Object object = null;

		LayerInformation layerInformation = new LayerInformation();
		logger.debug(
				"Building structure information for layer " + layerNumber + ", objects: " + objectCaches.size() + ".");

		// filling the layer information
		if (layerNumber <= objectCaches.size() && objectCaches.get(layerNumber) instanceof BasicEMap<?, ?>) {
			BasicEMap<?, ?> layer = (BasicEMap<?, ?>) objectCaches.get(layerNumber);
			Iterator<?> objectIterator = layer.iterator();

			while (objectIterator.hasNext()) {
				object = objectIterator.next();
				if (object instanceof Entry<?, ?> && object != null) {
					if (((Entry<?, ?>) object).getValue() instanceof EObject)
						addEObjectToLayerInformation(layerInformation, (EObject) ((Entry<?, ?>) object).getValue());
				}
			} // while
		}
		// assign
		layerInformations.put(layerNumber, layerInformation);
		layerInformations.get(layerNumber).valid = true;
	}


	/**
	 * Sets the value of the parameter {@code attributeNames} as an attribute
	 * of {@code EObject} to the new value (parameter {@code value}).
	 * 
	 * @param eObject : the EObject, which feature is to set
	 * @param value   : the new value of the EObjects feature
	 * @param         attributeNames: the feature to set
	 */
	public Object set(Object object, Object value, String... attributeNames) {
		// object: EObject or EList
		String featureOrListElemntNumber = "";
		for (int i = 0; i < attributeNames.length; i++) {
			featureOrListElemntNumber = attributeNames[i];
			if (i < attributeNames.length - 1) {
				EStructuralFeature feature = ((EObject) object).eClass()
						.getEStructuralFeature(featureOrListElemntNumber);
				object = ((EObject) object).eGet(feature);
			}

		}
		EStructuralFeature lastFeature = null;

		lastFeature = ((EObject) object).eClass().getEStructuralFeature(featureOrListElemntNumber);

		if (lastFeature.getUpperBound() == -1 && (value == null || value instanceof EList && ((EList) value).isEmpty()))
			((EObject) object).eUnset(lastFeature);
		else {
			EClassifier featureType = lastFeature.getEType();
			if (featureType instanceof EDataType) {
				if ("EDouble".equals(featureType.getName())) {
					value = ((Number)value).doubleValue();
				} else if ("EInteger".equals(featureType.getName())) {
					value = ((Number)value).intValue();
				} else if ("EFloat".equals(featureType.getName())) {
					value = ((Number)value).floatValue();
				} else if ("ELong".equals(featureType.getName())) {
					value = ((Number)value).longValue();
				}			
			}		
			try {

				boolean isStatic = false;
				Integer layer = null;
				String qualifiedClassName = null;
				EAnnotation annotation = lastFeature.getEAnnotation("staticFeature");
				Map<EStructuralFeature, Object> staticMap = null;
				if (annotation != null)
				{
					isStatic = true;
					layer = Integer.valueOf(annotation.getDetails().get("layer"));
					qualifiedClassName = annotation.getDetails().get("qualifiedClassName");
					staticMap = staticValues.get(layer).get(qualifiedClassName);
				}
				
				if (featureType instanceof EEnum)
				{
					if (value instanceof String)
						if (isStatic)
							staticMap.put(lastFeature, ((EEnum) featureType).getEEnumLiteral((String) value).getInstance());
						else
							((EObject) object).eSet(lastFeature, ((EEnum) featureType).getEEnumLiteral((String) value).getInstance());
					else if (value instanceof Integer)
						if (isStatic)
							staticMap.put(lastFeature, ((EEnum) featureType).getEEnumLiteral(((Integer)value).intValue()).getInstance());
						else
							((EObject) object).eSet(lastFeature, ((EEnum) featureType).getEEnumLiteral(((Integer)value).intValue()).getInstance());
					else if (value instanceof EEnumLiteralAdapter)
						if (isStatic)
							staticMap.put(lastFeature, ((EEnum) featureType).getEEnumLiteral(((EEnumLiteralAdapter)value).ordinal()).getInstance());
						else
							((EObject) object).eSet(lastFeature, ((EEnum) featureType).getEEnumLiteral(((EEnumLiteralAdapter)value).ordinal()).getInstance());
				}
				else
				{
					if (isStatic)
						staticMap.put(lastFeature, value);
					else
						((EObject) object).eSet(lastFeature, value);
				}
					
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		return value;
	}

	public void flushObjectValueCache() { 
		// HashMap<String, String> subCache;
		// for (EObject eObject : objectValueKeyCache.keySet()) {
		// subCache = objectValueKeyCache.get(eObject);
		// for (String attributeName : subCache.keySet()) {
		// System.out.println(eObject + "." + attributeName + " = " +
		// objectValueCache.get(subCache.get(attributeName)));
		// eObject.eSet(eObject.eClass().getEStructuralFeature(attributeName),
		// objectValueCache.get(subCache.get(attributeName)));
		// }
		// }
	}

	public <T> T getGen(EObject eObject, String... attributeNames) {
		return (T) get("", eObject, attributeNames);
	}
	
	public Object get(EObject eObject, String... attributeNames) {
		return get("", eObject, attributeNames);
	}
	
	/**
	 * Gets an object: Either out of the {@link #objectValueCache} - if an
	 * entry already exists. Or by querying the corresponding {@code eObject}s
	 * EStructuralFeature first and getting the associated object via
	 * EObject.eGet(EstructuralFeature feature) then.
	 * 
	 * @param eObject : the eObject containing the first (or if it is the only)
	 *                parameter
	 * @param         attributeNames: a variable number of names of attributes. The
	 *                first is contained by the eObject, the second by the first and
	 *                so on. The last parameter corresponds to the object to return
	 * @return targetObject - the object to get
	 */
	public Object get(String postfix, EObject eObject, String... attributeNames) {

		if (attributeNames == null || (attributeNames != null && attributeNames.length == 0))
			return eObject;

		boolean lastFeatureIsStatic = false;
		Integer layer = null;
		String qualifiedClassName = null;
		Map<EStructuralFeature, Object> staticMap = null;
		EStructuralFeature feature = null;
		
		Object result = null;
		String lastFeatureName = null;
		
		for (String featureName : attributeNames) {
			lastFeatureName = featureName;
			
			if (featureName.equals("yContainer") || featureName.equals("container") || featureName.equals("rContainer") ) {
				result = eObject.eContainer();
			} else {
				feature = eObject.eClass().getEStructuralFeature(featureName);
				try {
					feature.getEAnnotation("staticFeature");
				} catch (Exception e) {
					e.printStackTrace();
				}
				EAnnotation annotation = feature.getEAnnotation("staticFeature");
				if (annotation != null)
				{
					lastFeatureIsStatic = true;
					layer = Integer.valueOf(annotation.getDetails().get("layer"));
					qualifiedClassName = annotation.getDetails().get("qualifiedClassName");
					result = (staticMap = staticValues.get(layer).get(qualifiedClassName)).get(feature);
				}
				else 
				{
					lastFeatureIsStatic = false;
					result = eObject.eGet(feature);		
				}
			}
			if (result instanceof EObject) {
				eObject = (EObject) result;
			}

		}
		if (!"".equals(postfix)) {
			if (!lastFeatureIsStatic)
			{
				if (result instanceof Double) {
					if ("++".equals(postfix))
						eObject.eSet(eObject.eClass().getEStructuralFeature(lastFeatureName), ((Double) result).doubleValue() + 1);
					else if ("--".equals(postfix))
						eObject.eSet(eObject.eClass().getEStructuralFeature(lastFeatureName), ((Double) result).doubleValue() - 1);
				} else if (result instanceof Integer) {
					if ("++".equals(postfix))
						eObject.eSet(eObject.eClass().getEStructuralFeature(lastFeatureName), ((Integer) result).intValue() + 1);
					else if ("--".equals(postfix))
						eObject.eSet(eObject.eClass().getEStructuralFeature(lastFeatureName), ((Integer) result).intValue() - 1);
				} else if (result instanceof Float) {
					if ("++".equals(postfix))
						eObject.eSet(eObject.eClass().getEStructuralFeature(lastFeatureName), ((Float) result).floatValue() + 1);
					else if ("--".equals(postfix))
						eObject.eSet(eObject.eClass().getEStructuralFeature(lastFeatureName), ((Float) result).floatValue() - 1);
				} else if (result instanceof Long) {
					if ("++".equals(postfix))
						eObject.eSet(eObject.eClass().getEStructuralFeature(lastFeatureName), ((Long) result).longValue() + 1);
					else if ("--".equals(postfix))
						eObject.eSet(eObject.eClass().getEStructuralFeature(lastFeatureName), ((Long) result).longValue() - 1);
				}
			}
			else
			{
				if (result instanceof Double) {
					if ("++".equals(postfix))
						staticMap.put(feature, ((Double) result).doubleValue() + 1);
					else if ("--".equals(postfix))
						staticMap.put(feature, ((Double) result).doubleValue() - 1);
				} else if (result instanceof Integer) {
					if ("++".equals(postfix))
						staticMap.put(feature, ((Integer) result).intValue() + 1);
					else if ("--".equals(postfix))
						staticMap.put(feature, ((Integer) result).intValue() - 1);
				} else if (result instanceof Float) {
					if ("++".equals(postfix))
						staticMap.put(feature, ((Float) result).floatValue() + 1);
					else if ("--".equals(postfix))
						staticMap.put(feature, ((Float) result).floatValue() - 1);
				} else if (result instanceof Long) {
					if ("++".equals(postfix))
						staticMap.put(feature, ((Long) result).longValue() + 1);
					else if ("--".equals(postfix))
						staticMap.put(feature, ((Long) result).longValue() - 1);
				}
			}
		}
		return result;
	}

	/**
	 * per layer: one instance of every class. 
	 * 
	 * Objectmanagement.get needs an instance of a class!
	 * -->
	 * effect: ClassA.staticFeature -> get(getInstanceForStaticAccess("ClassA", <layer>), "staticFeature") in generated code
	 * so it is like:
	 * effect: anInstanceOfClassA.staticFeature -> get(anInstanceOfClassA, "staticFeature") in generated code
	 */
	public Map<Integer, Map<String, EObject>> oneInstanceForEveryClassJustForAccessOfStaticFeatures = new HashMap<>();	
	public EObject getInstanceForStaticAccess(String qualifiedClassName, Integer layer)
	{
		EObject instance;
		if (null == (instance = oneInstanceForEveryClassJustForAccessOfStaticFeatures.get(layer).get(qualifiedClassName)))
		{
			EClass metaClassOfInstance = ((EClass) getEClassifier(qualifiedClassName, layer));
			instance = metaClassOfInstance.getEPackage().getEFactoryInstance().create(metaClassOfInstance);
			oneInstanceForEveryClassJustForAccessOfStaticFeatures.get(layer).put(qualifiedClassName, instance);
		}
		return instance;
	}

	
	/**
	 * Adds an {@code Object} to HashMap {@link #objectValueCache} but only if
	 * it is an EList<?>. Does nothing otherwise.
	 * 
	 * @param eObject   : the EObject containing the object to add
	 * @param addObject : the object to add to the EList<?> first and to
	 *                  {@link #objectValueCache} then.
	 * @param           attributeNames: a variable number of attribute names
	 */
	public void add(EObject eObject, Object addObject, String... attributeNames) {
		Object object = get(eObject, attributeNames);
		if (object instanceof EList<?>) {
			EList<Object> list = (EList<Object>) object;
			list.add(addObject);
		}
	}

	/**
	 * Adds each EObject of the model to LayerInformations 
	 * {@link LayerInformation#eObjectsAccordingEClassOrObjectID}.
	 * 
	 * @param layerInformation : a LayerInformation object
	 * @param eObject          : current model element
	 */
	private void addEObjectToLayerInformation(LayerInformation layerInformation, EObject eObject) {

		String eClassName = eObject.eClass().getName();
		EPackage pack = eObject.eClass().getEPackage();

		while (pack.getESuperPackage() != null) {
			eClassName = pack.getName() + "." + eClassName;
			pack = pack.getESuperPackage();
		}

		EList<EObject> eObjects = layerInformation.eObjectsAccordingEClassOrObjectID.containsKey(eClassName)
				? layerInformation.eObjectsAccordingEClassOrObjectID.get(eClassName)
				: new BasicEList<EObject>();
		eObjects.add(eObject);
		layerInformation.eObjectsAccordingEClassOrObjectID.put(eClassName, eObjects);

		if (eClassName.equals("YTransition")) {
			addObjectIDOfEObjectToLayerInformation(layerInformation,
					"source-"+ get(eObject, "source", "ObjectID"), eObject);
			addObjectIDOfEObjectToLayerInformation(layerInformation,
					"target-" + get(eObject, "target", "ObjectID"), eObject);
			addObjectIDOfEObjectToLayerInformation(layerInformation,
					eClassName + "-container-" + get(eObject, "container", "ObjectID"), eObject);
		} else if (eClassName.equals("YPseudostate") || eClassName.equals("YState") || eClassName.equals("YFinalState")) {
			addObjectIDOfEObjectToLayerInformation(layerInformation,
					eClassName + "-container-" + get(eObject, "container", "ObjectID"), eObject);
		}
		else if ("YProperty".equals(eClassName) 
				&& (Boolean) eObject.eGet(eObject.eClass().getEStructuralFeature("observe")))
		{
			addObjectIDOfEObjectToLayerInformation(layerInformation,
					"ObserveProperty:", eObject);
		}
	}

	/**
	 * Adds the ID of an EObject to the LayerInformations instances HashMap
	 * (as key: model element ID, as value: the model element itself). Is only
	 * called when the ID is needed by the LayerInformation - this is the case when
	 * the EObject is a Transition, Pseudostate, State or FinalState.
	 * 
	 * @param layerInformation : the LayerInformation object
	 * @param objectID         : the objectID
	 * @param eObject          : the EObject, can be a Transition, Pseudostate,
	 *                         State or FinalState
	 */
	private void addObjectIDOfEObjectToLayerInformation(LayerInformation layerInformation, String objectID,
			EObject eObject) {
		EList<EObject> eObjects;
		if (layerInformation.eObjectsAccordingEClassOrObjectID.containsKey(objectID)) {
			eObjects = layerInformation.eObjectsAccordingEClassOrObjectID.get(objectID);
			eObjects.add(eObject);
		} else {
			eObjects = new BasicEList<EObject>();
			eObjects.add(eObject);
			layerInformation.eObjectsAccordingEClassOrObjectID.put(objectID, eObjects);
		}
	}

	/**
	 * Ensures that the LayerInformation entry (according to the specified
	 * layer) has correctly been built. If not, this will be done here: {link
	 * {@link #buildStructureInformation(Integer)}.
	 * 
	 * @param layerNumber
	 */
	private void makeSureStructureInformationIsValid(Integer layerNumber) {
		if (layerInformations.containsKey(layerNumber) && layerInformations.get(layerNumber).valid)
			return;
		buildStructureInformation(layerNumber);
	}


	/**
	 * A getter for a list of EObjects as an entry of HashMap
	 * {@link LayerInformation#eObjectsAccordingEClassOrObjectID}.
	 * 
	 * @param layerNumber       : the layer
	 * @param eObjectIdentifier : name of the EObject(s) to get
	 * @return eObjects - if a relevant entry is found / new BasicEList<EObject> -
	 *         otherwise
	 */
	public EList<EObject> getEObjects(Integer layerNumber, String eObjectIdentifier) {
		makeSureStructureInformationIsValid(layerNumber);
		LayerInformation layerInformation = layerInformations.get(layerNumber);
		if (layerInformation != null) {
			EList<EObject> eObjects = layerInformation.eObjectsAccordingEClassOrObjectID.get(eObjectIdentifier);
			if (eObjects != null)
				return eObjects;
		}
		return new BasicEList<EObject>();
	}

	/**
	 * Adds an EObject to a specified LayerInformation instance in case it is
	 * not sure if there is a valid layerInformations entry yet.
	 * 
	 * @param layerNumber : the key under which the related LayerInformation
	 *                    instance is found
	 * @param eObject     : the EObject which is to be added
	 */
	public void introduceEObjectToLayerInformation(Integer layerNumber, EObject eObject) {
		makeSureStructureInformationIsValid(layerNumber);
		addEObjectToLayerInformation(layerInformations.get(layerNumber), eObject);
	}

	/**
	 * Adds an object to the global object store.
	 * 
	 * @param layerNumber : the current layer
	 * @param eObject     : the EObject
	 * @return objectIDToAssign - the ID of the EObject
	 */
	public String introduceObjectToObjectCache(int layerNumber, EObject eObject) {
		if (!(eObject instanceof YObject || eObject instanceof DynamicEObjectImpl)) {
			// System.err.println("Cannot introduce object " + eObject + " to objectCache
			// because it's"
			// + " not instance of YObject or dynamically created!");
			return null;
		}

		Integer objectIDNumber = null;
		Object existingObjectID = null;
		String objectIDToAssign = null;
		int radix = 16;

		existingObjectID = get(eObject, "ObjectID");
		if (existingObjectID != null && existingObjectID instanceof String && !((String) existingObjectID).isEmpty()) {
			try {
				objectIDNumber = Integer.parseInt((String) existingObjectID, radix);
			} catch (NumberFormatException e) {
				objectIDNumber = eObject.hashCode();
			}
		} else {
			objectIDNumber = eObject.hashCode();
		}

		while (objectCaches.get(layerNumber).containsKey(Integer.toHexString(objectIDNumber)))
			objectIDNumber++;

		objectIDToAssign = Integer.toHexString(objectIDNumber);

		if (existingObjectID == null || !objectIDToAssign.equals(existingObjectID))
			set(eObject, objectIDToAssign, "ObjectID");

		// set name
		if (eObject instanceof YNamedElement) {
			Object existingName = get(eObject, "name");

			if (existingName == null || !(existingName instanceof String) && ((String) existingName).isEmpty())
				set(eObject, objectIDToAssign, "name");
		}

		objectIDsIntroduced.add(objectIDToAssign);
		objectCaches.get(layerNumber).put(objectIDToAssign, eObject);

		return objectIDToAssign;
	}

	/**
	 * Copies modied metadata to eObjectsModified.
	 * 
	 * @param layer
	 * @param eObject
	 * @param eStructuralFeature
	 */
	public void addToEObjectsModified(int layer, EObject eObject, EStructuralFeature eStructuralFeature) {
		// the object (initial object Cache) ... only those objects are resetted

		if (initialObjectCaches != null && initialObjectCaches.get(layer) != null && eObject != null
				&& eStructuralFeature != null) {
			String objectID = null;
			if (eObject instanceof YObject)
				objectID = ((YObject) eObject).getObjectID();
			else if (eObject instanceof DynamicEObjectImpl) {
				EStructuralFeature objectIDFeature = eObject.eClass().getEStructuralFeature("ObjectID");
				if (objectIDFeature == null)
					return;

				objectID = (String) eObject.eGet(objectIDFeature);
			}
			if (objectID != null && initialObjectCaches.get(layer).containsKey(objectID)) {
				HashMap<EStructuralFeature, Object> entry = null;

				synchronized (semaphore) {
					entry = eObjectsModified.get(eObject);

					if (entry == null)
						entry = new HashMap<EStructuralFeature, Object>();
					else if (entry.containsKey(eStructuralFeature))
						return;

					Object object = get(eObject, eStructuralFeature.getName());

					// copy objects if a collection
					if (object instanceof EList<?>) {
						ArrayList<Object> values = new ArrayList<Object>();
						values.addAll((EList<?>) object);
						entry.put(eStructuralFeature, values);
					} else
					{
						
						entry.put(eStructuralFeature, object);
					}

					eObjectsModified.put(eObject, entry);
				}
			}
		}
	}

	private Map<Integer, HashMap<String, EList<EObject>>> layerInfo = new HashMap<Integer, HashMap<String, EList<EObject>>>();


	public Map<String, List<EObject>> observedValues;


	
	public Map<Integer, HashMap<String, EList<EObject>>> getLayerInformation() {		
		layerInfo.clear();
		for (Entry<Integer, LayerInformation> layer : layerInformations.entrySet()) {
			layerInfo.put(layer.getKey(), layer.getValue().eObjectsAccordingEClassOrObjectID);
		}
		return layerInfo;
	}
	
	public Entry<Map<String, Pair<String>>,Map<String, List<Pair<String>>>> resultMarkedProperties;	
	public List<List<String>> resultObserver;
	public Map<String, List<Entry<Integer, Integer>>> resultQueue;
	public Map<String, List<Entry<Integer, Boolean>>> resultSimObjActive;
	
	public void setResultMarkedProperties(Map<String, Pair<String>> title, Map<String, List<Pair<String>>> data) {
		resultMarkedProperties = new AbstractMap.SimpleEntry<>(title,data);
	}

	public void setResultObserver(List<List<String>> output) {
		resultObserver = output;
	}
	
	public void setResultQueue(Map<String, List<Entry<Integer, Integer>>> output) {
		resultQueue = output;
	}

	public void resetresultSimObjActive() {
		resultSimObjActive = new HashMap<>();
	}
	
	public void addSimObject(int layer, EObject addingObject) {
		simulationObjectInsances.get(layer).add(addingObject);
		EStructuralFeature activeFeature = addingObject.eClass().getEStructuralFeature("active");
		if (activeFeature != null)
		{
			String name = (String) ((EObject) addingObject).eGet(((EObject) addingObject).eClass().getEStructuralFeature("name"));
			String objectId = (String) ((EObject) addingObject).eGet(((EObject) addingObject).eClass().getEStructuralFeature("ObjectID"));
			String type = ((EObject) addingObject).eClass().getName();
			String typeAndId; 
			if (name != null)
			{
				typeAndId = type + " " + objectId + " " + name; 
			}
			else
			{
				typeAndId = type + " " + objectId;
			}
			
			resultSimObjActive.put(typeAndId, new ArrayList<>());			
			
			addingObject.eAdapters().add(new AdapterImpl() {
				
				String id2 = typeAndId;
				String objectId2 = objectId;
				String type2 = type;
				
				@Override
				public void notifyChanged(Notification msg) {
					if (msg.getFeature() instanceof EAttribute 
							&& "active".equals(((EAttribute) msg.getFeature()).getName()))
					{
						if (msg.getNewBooleanValue() != msg.getOldBooleanValue())
						{
							int timeStep = reflectivStateChart.internal.getSimulationTime();
							resultSimObjActive.get(id2).add(new AbstractMap.SimpleEntry<Integer, Boolean>(timeStep, msg.getNewBooleanValue()));
						}
					}
					else if (msg.getFeature() instanceof EAttribute 
							&& "name".equals(((EAttribute) msg.getFeature()).getName()))
					{
						String name = (String) ((EObject) addingObject).eGet(((EObject) addingObject).eClass().getEStructuralFeature("name"));
						resultSimObjActive.remove(id2);
						objectIdToName.get(layer).put(objectId2, name);
						resultSimObjActive.put(id2 = type2 + " " + objectId2 + " " + name, new ArrayList<>());
					}
				}
			});
		}
	}


}

