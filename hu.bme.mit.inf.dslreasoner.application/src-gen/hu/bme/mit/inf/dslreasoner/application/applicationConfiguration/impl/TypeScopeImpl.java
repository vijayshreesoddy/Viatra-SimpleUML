/**
 * generated by Xtext 2.22.0
 */
package hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.impl;

import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ApplicationConfigurationPackage;
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.NumberSpecification;
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.TypeScope;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Scope</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.impl.TypeScopeImpl#isSetsNew <em>Sets New</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.impl.TypeScopeImpl#isSetsSum <em>Sets Sum</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.impl.TypeScopeImpl#getNumber <em>Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeScopeImpl extends MinimalEObjectImpl.Container implements TypeScope
{
  /**
   * The default value of the '{@link #isSetsNew() <em>Sets New</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetsNew()
   * @generated
   * @ordered
   */
  protected static final boolean SETS_NEW_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSetsNew() <em>Sets New</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetsNew()
   * @generated
   * @ordered
   */
  protected boolean setsNew = SETS_NEW_EDEFAULT;

  /**
   * The default value of the '{@link #isSetsSum() <em>Sets Sum</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetsSum()
   * @generated
   * @ordered
   */
  protected static final boolean SETS_SUM_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSetsSum() <em>Sets Sum</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetsSum()
   * @generated
   * @ordered
   */
  protected boolean setsSum = SETS_SUM_EDEFAULT;

  /**
   * The cached value of the '{@link #getNumber() <em>Number</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumber()
   * @generated
   * @ordered
   */
  protected NumberSpecification number;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeScopeImpl()
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
    return ApplicationConfigurationPackage.Literals.TYPE_SCOPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isSetsNew()
  {
    return setsNew;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSetsNew(boolean newSetsNew)
  {
    boolean oldSetsNew = setsNew;
    setsNew = newSetsNew;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationConfigurationPackage.TYPE_SCOPE__SETS_NEW, oldSetsNew, setsNew));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isSetsSum()
  {
    return setsSum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSetsSum(boolean newSetsSum)
  {
    boolean oldSetsSum = setsSum;
    setsSum = newSetsSum;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationConfigurationPackage.TYPE_SCOPE__SETS_SUM, oldSetsSum, setsSum));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NumberSpecification getNumber()
  {
    return number;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNumber(NumberSpecification newNumber, NotificationChain msgs)
  {
    NumberSpecification oldNumber = number;
    number = newNumber;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplicationConfigurationPackage.TYPE_SCOPE__NUMBER, oldNumber, newNumber);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNumber(NumberSpecification newNumber)
  {
    if (newNumber != number)
    {
      NotificationChain msgs = null;
      if (number != null)
        msgs = ((InternalEObject)number).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplicationConfigurationPackage.TYPE_SCOPE__NUMBER, null, msgs);
      if (newNumber != null)
        msgs = ((InternalEObject)newNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplicationConfigurationPackage.TYPE_SCOPE__NUMBER, null, msgs);
      msgs = basicSetNumber(newNumber, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationConfigurationPackage.TYPE_SCOPE__NUMBER, newNumber, newNumber));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ApplicationConfigurationPackage.TYPE_SCOPE__NUMBER:
        return basicSetNumber(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case ApplicationConfigurationPackage.TYPE_SCOPE__SETS_NEW:
        return isSetsNew();
      case ApplicationConfigurationPackage.TYPE_SCOPE__SETS_SUM:
        return isSetsSum();
      case ApplicationConfigurationPackage.TYPE_SCOPE__NUMBER:
        return getNumber();
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
      case ApplicationConfigurationPackage.TYPE_SCOPE__SETS_NEW:
        setSetsNew((Boolean)newValue);
        return;
      case ApplicationConfigurationPackage.TYPE_SCOPE__SETS_SUM:
        setSetsSum((Boolean)newValue);
        return;
      case ApplicationConfigurationPackage.TYPE_SCOPE__NUMBER:
        setNumber((NumberSpecification)newValue);
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
      case ApplicationConfigurationPackage.TYPE_SCOPE__SETS_NEW:
        setSetsNew(SETS_NEW_EDEFAULT);
        return;
      case ApplicationConfigurationPackage.TYPE_SCOPE__SETS_SUM:
        setSetsSum(SETS_SUM_EDEFAULT);
        return;
      case ApplicationConfigurationPackage.TYPE_SCOPE__NUMBER:
        setNumber((NumberSpecification)null);
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
      case ApplicationConfigurationPackage.TYPE_SCOPE__SETS_NEW:
        return setsNew != SETS_NEW_EDEFAULT;
      case ApplicationConfigurationPackage.TYPE_SCOPE__SETS_SUM:
        return setsSum != SETS_SUM_EDEFAULT;
      case ApplicationConfigurationPackage.TYPE_SCOPE__NUMBER:
        return number != null;
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
    result.append(" (setsNew: ");
    result.append(setsNew);
    result.append(", setsSum: ");
    result.append(setsSum);
    result.append(')');
    return result.toString();
  }

} //TypeScopeImpl
