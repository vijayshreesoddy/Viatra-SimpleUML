/*
 * generated by Xtext
 */
package hu.bme.mit.inf.dslreasoner.scoping

import java.util.Set
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSortedVariable
import org.eclipse.emf.ecore.EObject
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTQuantifiedExpression
import java.util.Collections
import java.util.HashSet
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTInlineConstantDefinition
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTLet
import java.util.Collection
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTFunctionDefinition
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSymbolicValue
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTDocument
import org.eclipse.xtext.scoping.IScope
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSymbolicDeclaration
import org.eclipse.emf.ecore.EReference
import java.util.HashMap
import java.util.Map
import org.eclipse.xtext.scoping.Scopes
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTModelResult
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTComplexTypeReference
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTEnumLiteral
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTEnumeratedTypeDeclaration
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTFunctionDeclaration

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#scoping
 * on how and when to use it 
 *
 */
class SmtLanguageScopeProvider extends org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider {
		/**
	 * Search for the first instance of containerType up in the containment hierarchy.
	 * @param containerType
	 * @param from
	 * @return
	 */
	@SuppressWarnings("unchecked")
	def private <ContainerType> ContainerType getTop(Class<ContainerType> containerType, EObject from){
		var actualLevel = from.eContainer();
		while(actualLevel!=null){
			if(containerType.isInstance(actualLevel)) { return actualLevel as ContainerType}
			else { actualLevel = actualLevel.eContainer() }
		}
		return null;
	}
	
	def private Set<SMTSortedVariable> getQuantifiedVariables(EObject from) {
		//The most inner quantified variables are in this expression:
		val quantifiedExpression = getTop(typeof(SMTQuantifiedExpression), from);
		if(quantifiedExpression==null) return Collections.emptySet();
		
		//The variables can be referred by a symbolic reference
		val Set<SMTSortedVariable> result = new HashSet(quantifiedExpression.getQuantifiedVariables());
		//The variables can defined in an outer quantifier
		result.addAll(getQuantifiedVariables(quantifiedExpression));
		//println(result.map[name].join(","))
		return result;
	}
	
	def private Set<SMTInlineConstantDefinition> getInlineConstantDefinitions(EObject from) {
		//The most inner quantified variables are in this expression:
		val let = getTop(typeof(SMTLet), from);
		if(let==null) return Collections.emptySet();
		
		//The variables can be referred by a symbolic reference
		val result = new HashSet(let.getInlineConstantDefinitions());
		//The variables can defined in an outer quantifier
		result.addAll(getInlineConstantDefinitions(let));
		return result;
	}
	
	def private Collection<SMTSortedVariable> getParameters(SMTSymbolicValue from) {
		val functionDefinition = getTop(typeof(SMTFunctionDefinition), from);
		if(functionDefinition!=null) {
			return functionDefinition.getParameters();
		}
		else return Collections.emptySet();
	}
	
	def private Set<SMTEnumLiteral> getFiniteElements(SMTSymbolicValue value) {
		val Set<SMTEnumLiteral> result = new HashSet();
		val document = getTop(typeof(SMTDocument),value)
		for(type : document.input.getTypeDeclarations().filter(typeof(SMTEnumeratedTypeDeclaration))) {
			result.addAll(type.getElements());
		}
		return result;
	}
	
	def private Set<SMTSymbolicDeclaration> getFunctions(SMTSymbolicValue value) {
		val document = getTop(typeof(SMTDocument),value);
		val input = document.input
		var SMTModelResult output = null;
		if(document.output != null && document.output.getModelResult instanceof SMTModelResult) {
			output = document.output.getModelResult as SMTModelResult
		}
		
		val Map<String, SMTFunctionDeclaration> declarations = new HashMap
		val Set<SMTFunctionDefinition> definitions =new HashSet
		
		input.functionDeclarations.forEach[declarations.put(it.name,it)]
		if(output != null) {
			output.newFunctionDeclarations.forEach[declarations.put(it.name,it)]
		}
		input.functionDefinition.filter[!declarations.containsKey(it.name)].forEach[definitions += it]
		if(output != null) {
			output.newFunctionDefinitions.filter[!declarations.containsKey(it.name)].forEach[definitions += it]
		}
		
		val referrables = new HashSet<SMTSymbolicDeclaration>;
		referrables.addAll(declarations.values)
		referrables.addAll(definitions)
		return referrables
	}
	
	def public IScope scope_SMTSymbolicValue_symbolicReference(SMTSymbolicValue value, EReference ref) {
		val Set<SMTSymbolicDeclaration> referrables = new HashSet;
		
		referrables.addAll(value.getFiniteElements)
		referrables.addAll(value.getParameters)
		referrables.addAll(value.getFunctions)
		referrables.addAll(value.getQuantifiedVariables)
		referrables.addAll(value.getInlineConstantDefinitions)
	
		return Scopes.scopeFor(referrables);
	}
	
	// Any type defined in the input section can be referred.
	def public IScope scope_SMTComplexTypeReference_referred(SMTComplexTypeReference reference, EReference ref){
		val types = getTop(typeof(SMTDocument),reference).input.typeDeclarations
		return Scopes.scopeFor(types)
	}
}
