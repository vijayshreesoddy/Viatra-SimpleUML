/*
* generated by Xtext
*/
package hu.bme.mit.inf.dslreasoner;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class SmtLanguageStandaloneSetup extends SmtLanguageStandaloneSetupGenerated{

	public static void doSetup() {
		new SmtLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

