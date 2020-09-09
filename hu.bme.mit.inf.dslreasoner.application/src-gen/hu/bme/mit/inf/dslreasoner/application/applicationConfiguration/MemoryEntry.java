/**
 * generated by Xtext 2.22.0
 */
package hu.bme.mit.inf.dslreasoner.application.applicationConfiguration;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Memory Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.MemoryEntry#getMegabyteLimit <em>Megabyte Limit</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ApplicationConfigurationPackage#getMemoryEntry()
 * @model
 * @generated
 */
public interface MemoryEntry extends ConfigEntry
{
  /**
   * Returns the value of the '<em><b>Megabyte Limit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Megabyte Limit</em>' attribute.
   * @see #setMegabyteLimit(int)
   * @see hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ApplicationConfigurationPackage#getMemoryEntry_MegabyteLimit()
   * @model
   * @generated
   */
  int getMegabyteLimit();

  /**
   * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.MemoryEntry#getMegabyteLimit <em>Megabyte Limit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Megabyte Limit</em>' attribute.
   * @see #getMegabyteLimit()
   * @generated
   */
  void setMegabyteLimit(int value);

} // MemoryEntry
