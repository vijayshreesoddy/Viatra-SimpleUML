/**
 * generated by Xtext 2.22.0
 */
package hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.impl;

import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ApplicationConfigurationPackage;
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.MetamodelDeclaration;
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.MetamodelReference;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metamodel Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.impl.MetamodelReferenceImpl#getReferred <em>Referred</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetamodelReferenceImpl extends MetamodelImpl implements MetamodelReference
{
  /**
   * The cached value of the '{@link #getReferred() <em>Referred</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferred()
   * @generated
   * @ordered
   */
  protected MetamodelDeclaration referred;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MetamodelReferenceImpl()
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
    return ApplicationConfigurationPackage.Literals.METAMODEL_REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MetamodelDeclaration getReferred()
  {
    if (referred != null && referred.eIsProxy())
    {
      InternalEObject oldReferred = (InternalEObject)referred;
      referred = (MetamodelDeclaration)eResolveProxy(oldReferred);
      if (referred != oldReferred)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApplicationConfigurationPackage.METAMODEL_REFERENCE__REFERRED, oldReferred, referred));
      }
    }
    return referred;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetamodelDeclaration basicGetReferred()
  {
    return referred;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setReferred(MetamodelDeclaration newReferred)
  {
    MetamodelDeclaration oldReferred = referred;
    referred = newReferred;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationConfigurationPackage.METAMODEL_REFERENCE__REFERRED, oldReferred, referred));
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
      case ApplicationConfigurationPackage.METAMODEL_REFERENCE__REFERRED:
        if (resolve) return getReferred();
        return basicGetReferred();
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
      case ApplicationConfigurationPackage.METAMODEL_REFERENCE__REFERRED:
        setReferred((MetamodelDeclaration)newValue);
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
      case ApplicationConfigurationPackage.METAMODEL_REFERENCE__REFERRED:
        setReferred((MetamodelDeclaration)null);
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
      case ApplicationConfigurationPackage.METAMODEL_REFERENCE__REFERRED:
        return referred != null;
    }
    return super.eIsSet(featureID);
  }

} //MetamodelReferenceImpl
