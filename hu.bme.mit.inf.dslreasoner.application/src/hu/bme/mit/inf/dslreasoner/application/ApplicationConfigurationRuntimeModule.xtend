/*
 * generated by Xtext 2.10.0
 */
package hu.bme.mit.inf.dslreasoner.application

import com.google.inject.Binder
import com.google.inject.multibindings.Multibinder
import hu.bme.mit.inf.dslreasoner.application.linking.ApplicationConfigurationLinkingService
import hu.bme.mit.inf.dslreasoner.application.valueconverter.ApplicationConfigurationValueConverterService
import org.apache.log4j.Logger
import org.eclipse.viatra.query.patternlanguage.emf.GenmodelExtensionLoader
import org.eclipse.viatra.query.patternlanguage.emf.IGenmodelMappingLoader
import org.eclipse.viatra.query.patternlanguage.emf.scoping.CompoundMetamodelProviderService
import org.eclipse.viatra.query.patternlanguage.emf.scoping.IMetamodelProvider
import org.eclipse.viatra.query.patternlanguage.emf.scoping.IMetamodelProviderInstance
import org.eclipse.viatra.query.patternlanguage.emf.scoping.MetamodelProviderService
import org.eclipse.viatra.query.patternlanguage.emf.scoping.ResourceSetMetamodelProviderService
import org.eclipse.viatra.query.tooling.core.targetplatform.TargetPlatformMetamodelProviderService
import org.eclipse.viatra.query.tooling.core.targetplatform.ITargetPlatformMetamodelLoader
import org.eclipse.viatra.query.tooling.core.targetplatform.TargetPlatformMetamodelsIndex

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class ApplicationConfigurationRuntimeModule extends AbstractApplicationConfigurationRuntimeModule {
	override bindILinkingService() {
		ApplicationConfigurationLinkingService
	}
	
	def configureLoggerImplementation(Binder binder) {
        binder.bind(Logger).toInstance(Logger.getLogger(ApplicationConfigurationRuntimeModule))
    }

    def Class<? extends IMetamodelProvider> bindIMetamodelProvider() {
        CompoundMetamodelProviderService
    }

    def configureMetamodelProviderInstance(Binder binder) {
        val metamodelProviderBinder = Multibinder.newSetBinder(binder, IMetamodelProviderInstance)
        metamodelProviderBinder.addBinding.to(MetamodelProviderService)
        metamodelProviderBinder.addBinding.to(ResourceSetMetamodelProviderService)
        metamodelProviderBinder.addBinding.to(TargetPlatformMetamodelProviderService)
    }
	
    def Class<? extends IGenmodelMappingLoader> bindIGenmodelMappingLoader() {
        GenmodelExtensionLoader
    }
    
    override bindIValueConverterService() {
		ApplicationConfigurationValueConverterService
	}
	
	def Class<? extends ITargetPlatformMetamodelLoader> bindITargetPlatformMetamodelLoader() {
		TargetPlatformMetamodelsIndex
	}
	
//	override bindIQualifiedNameProvider() {
//		ApplicationConfigurationQualifiedNameProvider
//	}
}
