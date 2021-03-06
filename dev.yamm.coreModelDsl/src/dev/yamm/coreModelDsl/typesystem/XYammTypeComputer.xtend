/*
 * generated by Xtext 2.14.0
 */
package dev.yamm.coreModelDsl.typesystem

import dev.yamm.coreModelXmi.yamm.YColorDFAObject
import dev.yamm.coreModelXmi.yamm.YCreateInstanceExpression
import dev.yamm.coreModelXmi.yamm.YGetInstances
import dev.yamm.coreModelXmi.yamm.YGetInstancesOfExpression
import dev.yamm.coreModelXmi.yamm.YGetLayerInformation
import dev.yamm.coreModelXmi.yamm.YGetObjectManagement
import dev.yamm.coreModelXmi.yamm.YLoadModel
import dev.yamm.coreModelXmi.yamm.YObserverAddValue
import dev.yamm.coreModelXmi.yamm.YPrintExpression
import dev.yamm.coreModelXmi.yamm.YSetReturnValue
import dev.yamm.coreModelXmi.yamm.YTimeStep
import org.eclipse.xtext.xbase.typesystem.computation.ITypeComputationState
import org.eclipse.xtext.xbase.typesystem.computation.XbaseTypeComputer
import org.eclipse.xtext.xbase.typesystem.references.LightweightTypeReference

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class XYammTypeComputer extends XbaseTypeComputer {


	def dispatch void computeTypes(YObserverAddValue getInstancesOfExp, ITypeComputationState state) {
		state.withNonVoidExpectation.computeTypes(getInstancesOfExp.parameter.get(0))
		state.withNonVoidExpectation.computeTypes(getInstancesOfExp.parameter.get(1))
//		state.acceptActualType(getRawTypeForName(String, state)
	}
	
	def dispatch void computeTypes(YTimeStep exp, ITypeComputationState state) {
		var LightweightTypeReference result = getTypeForName(Integer, state);
		state.acceptActualType(result);
	}
	
	def dispatch void computeTypes(YGetLayerInformation exp, ITypeComputationState state) {
		var LightweightTypeReference result = getTypeForName(Integer, state);
		state.acceptActualType(result);
//		state.withNonVoidExpectation.computeTypes(printExp.expression)
//		state.acceptActualType(getRawTypeForName(String, state))
	}
	
	def dispatch void computeTypes(YGetObjectManagement exp, ITypeComputationState state) {
		var LightweightTypeReference result = getTypeForName(Object, state);
		state.acceptActualType(result);
//		state.withNonVoidExpectation.computeTypes(printExp.expression)
//		state.acceptActualType(getRawTypeForName(String, state))
	}
	
	
	def dispatch void computeTypes(YCreateInstanceExpression createExp, ITypeComputationState state) {
//		state.withNonVoidExpectation.computeTypes(createExp.)
//		state.acceptActualType(getRawTypeForName(Object, state))
	}

	def dispatch void computeTypes(YPrintExpression printExp, ITypeComputationState state) {

		state.withNonVoidExpectation.computeTypes(printExp.expression)
		state.acceptActualType(getRawTypeForName(String, state))
	}

	def dispatch void computeTypes(YColorDFAObject colorDFAObject, ITypeComputationState state) {

		state.withNonVoidExpectation.computeTypes(colorDFAObject.id)
		state.acceptActualType(getRawTypeForName(String, state))
	}

	def dispatch void computeTypes(YSetReturnValue opCallExp, ITypeComputationState state) {

		state.withNonVoidExpectation.computeTypes(opCallExp.value)
//		state.acceptActualType(getRawTypeForName(String, state))
	}

	def dispatch void computeTypes(YGetInstancesOfExpression getInstancesOfExp, ITypeComputationState state) {
//		state.withNonVoidExpectation.computeTypes(printExp.expression)
//		state.acceptActualType(getRawTypeForName(String, state))
	}

	def dispatch void computeTypes(YGetInstances getInstancesExp, ITypeComputationState state) {
		state.withNonVoidExpectation.computeTypes(getInstancesExp.parameter.get(1))
//		state.acceptActualType(getRawTypeForName(String, state))
	}

//	def dispatch void computeTypes(YCountFinalStates countFinalStatesExp, ITypeComputationState state) {
//		var LightweightTypeReference result = getTypeForName(Integer, state);
//		state.acceptActualType(result);
////		state.withNonVoidExpectation.computeTypes(printExp.expression)
////		state.acceptActualType(getRawTypeForName(String, state))
//	}
//
//	def dispatch void computeTypes(YCountInitialStates countInitialStatesExp, ITypeComputationState state) {
//		var LightweightTypeReference result = getTypeForName(Integer, state);
//		state.acceptActualType(result);
////		state.withNonVoidExpectation.computeTypes(printExp.expression)
////		state.acceptActualType(getRawTypeForName(String, state))
//	}
//
//	def dispatch void computeTypes(YCountStates exp, ITypeComputationState state) {
//		var LightweightTypeReference result = getTypeForName(Integer, state);
//		state.acceptActualType(result);
////		state.withNonVoidExpectation.computeTypes(printExp.expression)
////		state.acceptActualType(getRawTypeForName(String, state))
//	}
//
//	def dispatch void computeTypes(YSetAbsoluteNodePropability exp, ITypeComputationState state) {
//		
////		state.withNonVoidExpectation.computeTypes(printExp.expression)
////		state.acceptActualType(getRawTypeForName(String, state))
//	}
//
//	def dispatch void computeTypes(YCountReachableStates exp, ITypeComputationState state) {
//		var LightweightTypeReference result = getTypeForName(Integer, state);
//		state.acceptActualType(result);
////		state.withNonVoidExpectation.computeTypes(printExp.expression)
////		state.acceptActualType(getRawTypeForName(String, state))
//	}
//
//	def dispatch void computeTypes(YCountInValidTransitions exp, ITypeComputationState state) {
////		state.withNonVoidExpectation.computeTypes(printExp.expression)
////		state.acceptActualType(getRawTypeForName(String, state))
//	}
//
//	def dispatch void computeTypes(YSetPopulationSize exp, ITypeComputationState state) {
////		state.withNonVoidExpectation.computeTypes(printExp.expression)
////		state.acceptActualType(getRawTypeForName(String, state))
//	}

	def dispatch void computeTypes(YLoadModel loadModelExp, ITypeComputationState state) {

//		state.withNonVoidExpectation.computeTypes(loadModelExp.relModelPath)
//		state.acceptActualType(getRawTypeForName(String, state))
		state.withNonVoidExpectation.computeTypes(loadModelExp.getRelModelPath)
		var LightweightTypeReference result = getTypeForName(Object, state);
		state.acceptActualType(result);
		
	}
}
