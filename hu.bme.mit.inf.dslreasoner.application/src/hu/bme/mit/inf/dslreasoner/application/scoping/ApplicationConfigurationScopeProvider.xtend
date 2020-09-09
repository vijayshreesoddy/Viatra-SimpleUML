/*
 * generated by Xtext 2.10.0
 */
package hu.bme.mit.inf.dslreasoner.application.scoping

import com.google.common.base.Function
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.AllPackageEntry
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.AllPatternEntry
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ApplicationConfigurationPackage
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ClassReference
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ConfigurationScript
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.EPackageImport
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.MetamodelElement
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.MetamodelSpecification
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.PatternElement
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.PatternSpecification
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ViatraImport
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.viatra.query.patternlanguage.emf.vql.PatternModel
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class ApplicationConfigurationScopeProvider extends AbstractApplicationConfigurationScopeProvider {
	
	private val language = ApplicationConfigurationPackage.eINSTANCE
	protected val nameConverter = new Function<PatternModel,QualifiedName>() {
		override apply(PatternModel input) {
			println(input)
			val res = QualifiedName.create(input.packageName.split("\\."))
			println(res.toString)
			return res
		}
	}
	
	override getScope(EObject context, EReference reference) {
		val document = EcoreUtil2.getContainerOfType(context,ConfigurationScript)
		if(context instanceof MetamodelElement) {
			return context.scopeForMetamodelElement(reference,document)
		} else if(context instanceof MetamodelSpecification) {
			return context.scopeForMetamodelSpecification(reference,document)
		} else if(context instanceof AllPackageEntry){
			return context.scopeForAllPackageEntry(reference,document)
		} else if(context instanceof PatternElement) {
			return context.scopeForPatternElement(reference,document)
		} else if(context instanceof PatternSpecification) {
			return context.scopeForPatternSpecification(reference,document)
		} else if(context instanceof AllPatternEntry) {
			return context.scopeForAllPatternEntry(reference,document)
		} else if(context instanceof ClassReference) {
			return context.scopeForClassReference(reference,document)
		}else {
			return super.getScope(context,reference)
		}
	}
	
	private def allEPackages(ConfigurationScript document) {
		return document.imports.filter(EPackageImport).map[it.importedPackage].filterNull
	}
	private def allViatraPackages(ConfigurationScript document) {
		val res = document.imports.filter(ViatraImport).map[it.importedViatra].filterNull
		//println('''All packages: «res.map[packageName].toList»''')
		return  res
	}
	private def allEClassifiers(ConfigurationScript document) {
		document.allEPackages.map[EClassifiers].flatten
	}
	private def allPatterns(ConfigurationScript document) {
		val res = document.allViatraPackages.map[patterns].flatten
		//println('''All patterns: «res.map[name].toList»''')
		return res
	}

	protected def scopeForMetamodelElement(MetamodelElement context, EReference reference, ConfigurationScript document) {
		if(reference === language.metamodelEntry_Package) {
			return Scopes.scopeFor(document.allEPackages)
		} else if(reference === language.metamodelElement_Classifier) {
			if(context.package !== null) {
				return Scopes.scopeFor(context.package.EClassifiers)
			} else {
				return Scopes.scopeFor(document.allEClassifiers)
			}
		} if (reference === language.metamodelElement_Feature) {
			val referredClassifier = context.classifier
			if(referredClassifier instanceof EClass) {
				return Scopes.scopeFor(referredClassifier.EAllStructuralFeatures)
			} else if(referredClassifier instanceof EEnum) {
				return Scopes.scopeFor(referredClassifier.ELiterals)
			} else {
				super.getScope(context,reference)
			}
		}
	}
	
	protected def scopeForMetamodelSpecification(MetamodelSpecification context, EReference reference, ConfigurationScript document) {
		if(reference === language.metamodelEntry_Package) {
			return Scopes.scopeFor(document.allEPackages)
		} else if(reference ===language.metamodelElement_Classifier) {
			return Scopes.scopeFor(document.allEClassifiers)
		} else {
			return super.getScope(context,reference)
		}
	}
	
	protected def scopeForAllPackageEntry(AllPackageEntry context, EReference reference, ConfigurationScript document) {
		if(reference === language.metamodelEntry_Package) {
			return Scopes.scopeFor(document.allEPackages)
		} else if(reference === language.metamodelElement_Classifier) {
			if(context.package === null) {
				return Scopes.scopeFor(document.allEClassifiers)
			} else {
				return Scopes.scopeFor(context.package.EClassifiers)
			}
		} else {
			return super.getScope(context,reference)
		}
	}
	
	//////////
	
	def IScope scopeForClassReference(ClassReference classReference, EReference eReference, ConfigurationScript document) {
		if(eReference === language.metamodelEntry_Package) {
			return Scopes.scopeFor(document.allEPackages)
		} else if(eReference === language.metamodelElement_Classifier) {
			Scopes.scopeFor(document.allEClassifiers)
		} else {
			return super.getScope(classReference,eReference)
		}
	}
	
	//////////
	
	protected def scopeForPatternElement(PatternElement context, EReference reference, ConfigurationScript document) {
		if(reference === language.patternEntry_Package) {
			return Scopes.scopeFor(document.allViatraPackages,nameConverter,super.getScope(context,reference))
		} else if(reference === language.patternElement_Pattern) {
			if(context.package !== null) {
				return Scopes.scopeFor(context.package.patterns)
			} else {
				return Scopes.scopeFor(document.allPatterns)
			}
		} else {
			super.getScope(context,reference)
		}
	}
	
	protected def scopeForPatternSpecification(PatternSpecification context, EReference reference, ConfigurationScript document) {
		if(reference === language.patternEntry_Package) {
			return Scopes.scopeFor(document.allViatraPackages,nameConverter,super.getScope(context,reference))
		} else if(reference ===language.patternElement_Pattern) {
			return Scopes.scopeFor(document.allPatterns)
		} else {
			return super.getScope(context,reference)
		}
	}
	
	protected def scopeForAllPatternEntry(AllPatternEntry context, EReference reference, ConfigurationScript document) {
		if(reference === language.patternEntry_Package) {
			val res =  Scopes.scopeFor(document.allViatraPackages,nameConverter,super.getScope(context,reference))
			return res
		} else if(reference === language.patternElement_Pattern) {
			if(context.package === null) {
				return Scopes.scopeFor(document.allPatterns)
			} else {
				return Scopes.scopeFor(context.package.patterns)
			}
		} else {
			return super.getScope(context,reference)
		}
	}
}
