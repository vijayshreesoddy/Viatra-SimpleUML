/**
 * generated by Xtext 2.22.0
 */
package hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.impl;

import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ApplicationConfigurationPackage;
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.RuntimeEntry;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Runtime Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.impl.RuntimeEntryImpl#getMillisecLimit <em>Millisec Limit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuntimeEntryImpl extends ConfigEntryImpl implements RuntimeEntry
{
  /**
   * The default value of the '{@link #getMillisecLimit() <em>Millisec Limit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMillisecLimit()
   * @generated
   * @ordered
   */
  protected static final int MILLISEC_LIMIT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMillisecLimit() <em>Millisec Limit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMillisecLimit()
   * @generated
   * @ordered
   */
  protected int millisecLimit = MILLISEC_LIMIT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RuntimeEntryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ApplicationConfigurationPackage.Literals.RUNTIME_ENTRY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getMillisecLimit()
  {
    return millisecLimit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMillisecLimit(int newMillisecLimit)
  {
    int oldMillisecLimit = millisecLimit;
    millisecLimit = newMillisecLimit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationConfigurationPackage.RUNTIME_ENTRY__MILLISEC_LIMIT, oldMillisecLimit, millisecLimit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ApplicationConfigurationPackage.RUNTIME_ENTRY__MILLISEC_LIMIT:
        return getMillisecLimit();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ApplicationConfigurationPackage.RUNTIME_ENTRY__MILLISEC_LIMIT:
        setMillisecLimit((Integer)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ApplicationConfigurationPackage.RUNTIME_ENTRY__MILLISEC_LIMIT:
        setMillisecLimit(MILLISEC_LIMIT_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ApplicationConfigurationPackage.RUNTIME_ENTRY__MILLISEC_LIMIT:
        return millisecLimit != MILLISEC_LIMIT_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (millisecLimit: ");
    result.append(millisecLimit);
    result.append(')');
    return result.toString();
  }

} //RuntimeEntryImpl
