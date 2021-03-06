/**
 */
package hu.bme.mit.inf.dslreasoner.alloyLanguage.impl;

import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSDirectProduct;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSMultiplicity;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSTerm;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.AlloyLanguagePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ALS Direct Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSDirectProductImpl#getLeftOperand <em>Left Operand</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSDirectProductImpl#getLeftMultiplicit <em>Left Multiplicit</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSDirectProductImpl#getRightMultiplicit <em>Right Multiplicit</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSDirectProductImpl#getRightOperand <em>Right Operand</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ALSDirectProductImpl extends ALSTermImpl implements ALSDirectProduct
{
  /**
   * The cached value of the '{@link #getLeftOperand() <em>Left Operand</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftOperand()
   * @generated
   * @ordered
   */
  protected ALSTerm leftOperand;

  /**
   * The default value of the '{@link #getLeftMultiplicit() <em>Left Multiplicit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftMultiplicit()
   * @generated
   * @ordered
   */
  protected static final ALSMultiplicity LEFT_MULTIPLICIT_EDEFAULT = ALSMultiplicity.ALL;

  /**
   * The cached value of the '{@link #getLeftMultiplicit() <em>Left Multiplicit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftMultiplicit()
   * @generated
   * @ordered
   */
  protected ALSMultiplicity leftMultiplicit = LEFT_MULTIPLICIT_EDEFAULT;

  /**
   * The default value of the '{@link #getRightMultiplicit() <em>Right Multiplicit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightMultiplicit()
   * @generated
   * @ordered
   */
  protected static final ALSMultiplicity RIGHT_MULTIPLICIT_EDEFAULT = ALSMultiplicity.ALL;

  /**
   * The cached value of the '{@link #getRightMultiplicit() <em>Right Multiplicit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightMultiplicit()
   * @generated
   * @ordered
   */
  protected ALSMultiplicity rightMultiplicit = RIGHT_MULTIPLICIT_EDEFAULT;

  /**
   * The cached value of the '{@link #getRightOperand() <em>Right Operand</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightOperand()
   * @generated
   * @ordered
   */
  protected ALSTerm rightOperand;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ALSDirectProductImpl()
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
    return AlloyLanguagePackage.Literals.ALS_DIRECT_PRODUCT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ALSTerm getLeftOperand()
  {
    return leftOperand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeftOperand(ALSTerm newLeftOperand, NotificationChain msgs)
  {
    ALSTerm oldLeftOperand = leftOperand;
    leftOperand = newLeftOperand;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlloyLanguagePackage.ALS_DIRECT_PRODUCT__LEFT_OPERAND, oldLeftOperand, newLeftOperand);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeftOperand(ALSTerm newLeftOperand)
  {
    if (newLeftOperand != leftOperand)
    {
      NotificationChain msgs = null;
      if (leftOperand != null)
        msgs = ((InternalEObject)leftOperand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlloyLanguagePackage.ALS_DIRECT_PRODUCT__LEFT_OPERAND, null, msgs);
      if (newLeftOperand != null)
        msgs = ((InternalEObject)newLeftOperand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlloyLanguagePackage.ALS_DIRECT_PRODUCT__LEFT_OPERAND, null, msgs);
      msgs = basicSetLeftOperand(newLeftOperand, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlloyLanguagePackage.ALS_DIRECT_PRODUCT__LEFT_OPERAND, newLeftOperand, newLeftOperand));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ALSMultiplicity getLeftMultiplicit()
  {
    return leftMultiplicit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeftMultiplicit(ALSMultiplicity newLeftMultiplicit)
  {
    ALSMultiplicity oldLeftMultiplicit = leftMultiplicit;
    leftMultiplicit = newLeftMultiplicit == null ? LEFT_MULTIPLICIT_EDEFAULT : newLeftMultiplicit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlloyLanguagePackage.ALS_DIRECT_PRODUCT__LEFT_MULTIPLICIT, oldLeftMultiplicit, leftMultiplicit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ALSMultiplicity getRightMultiplicit()
  {
    return rightMultiplicit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRightMultiplicit(ALSMultiplicity newRightMultiplicit)
  {
    ALSMultiplicity oldRightMultiplicit = rightMultiplicit;
    rightMultiplicit = newRightMultiplicit == null ? RIGHT_MULTIPLICIT_EDEFAULT : newRightMultiplicit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlloyLanguagePackage.ALS_DIRECT_PRODUCT__RIGHT_MULTIPLICIT, oldRightMultiplicit, rightMultiplicit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ALSTerm getRightOperand()
  {
    return rightOperand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRightOperand(ALSTerm newRightOperand, NotificationChain msgs)
  {
    ALSTerm oldRightOperand = rightOperand;
    rightOperand = newRightOperand;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlloyLanguagePackage.ALS_DIRECT_PRODUCT__RIGHT_OPERAND, oldRightOperand, newRightOperand);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRightOperand(ALSTerm newRightOperand)
  {
    if (newRightOperand != rightOperand)
    {
      NotificationChain msgs = null;
      if (rightOperand != null)
        msgs = ((InternalEObject)rightOperand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlloyLanguagePackage.ALS_DIRECT_PRODUCT__RIGHT_OPERAND, null, msgs);
      if (newRightOperand != null)
        msgs = ((InternalEObject)newRightOperand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlloyLanguagePackage.ALS_DIRECT_PRODUCT__RIGHT_OPERAND, null, msgs);
      msgs = basicSetRightOperand(newRightOperand, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlloyLanguagePackage.ALS_DIRECT_PRODUCT__RIGHT_OPERAND, newRightOperand, newRightOperand));
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
      case AlloyLanguagePackage.ALS_DIRECT_PRODUCT__LEFT_OPERAND:
        return basicSetLeftOperand(null, msgs);
      case AlloyLanguagePackage.ALS_DIRECT_PRODUCT__RIGHT_OPERAND:
        return basicSetRightOperand(null, msgs);
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
      case AlloyLanguagePackage.ALS_DIRECT_PRODUCT__LEFT_OPERAND:
        return getLeftOperand();
      case AlloyLanguagePackage.ALS_DIRECT_PRODUCT__LEFT_MULTIPLICIT:
        return getLeftMultiplicit();
      case AlloyLanguagePackage.ALS_DIRECT_PRODUCT__RIGHT_MULTIPLICIT:
        return getRightMultiplicit();
      case AlloyLanguagePackage.ALS_DIRECT_PRODUCT__RIGHT_OPERAND:
        return getRightOperand();
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
      case AlloyLanguagePackage.ALS_DIRECT_PRODUCT__LEFT_OPERAND:
        setLeftOperand((ALSTerm)newValue);
        return;
      case AlloyLanguagePackage.ALS_DIRECT_PRODUCT__LEFT_MULTIPLICIT:
        setLeftMultiplicit((ALSMultiplicity)newValue);
        return;
      case AlloyLanguagePackage.ALS_DIRECT_PRODUCT__RIGHT_MULTIPLICIT:
        setRightMultiplicit((ALSMultiplicity)newValue);
        return;
      case AlloyLanguagePackage.ALS_DIRECT_PRODUCT__RIGHT_OPERAND:
        setRightOperand((ALSTerm)newValue);
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
      case AlloyLanguagePackage.ALS_DIRECT_PRODUCT__LEFT_OPERAND:
        setLeftOperand((ALSTerm)null);
        return;
      case AlloyLanguagePackage.ALS_DIRECT_PRODUCT__LEFT_MULTIPLICIT:
        setLeftMultiplicit(LEFT_MULTIPLICIT_EDEFAULT);
        return;
      case AlloyLanguagePackage.ALS_DIRECT_PRODUCT__RIGHT_MULTIPLICIT:
        setRightMultiplicit(RIGHT_MULTIPLICIT_EDEFAULT);
        return;
      case AlloyLanguagePackage.ALS_DIRECT_PRODUCT__RIGHT_OPERAND:
        setRightOperand((ALSTerm)null);
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
      case AlloyLanguagePackage.ALS_DIRECT_PRODUCT__LEFT_OPERAND:
        return leftOperand != null;
      case AlloyLanguagePackage.ALS_DIRECT_PRODUCT__LEFT_MULTIPLICIT:
        return leftMultiplicit != LEFT_MULTIPLICIT_EDEFAULT;
      case AlloyLanguagePackage.ALS_DIRECT_PRODUCT__RIGHT_MULTIPLICIT:
        return rightMultiplicit != RIGHT_MULTIPLICIT_EDEFAULT;
      case AlloyLanguagePackage.ALS_DIRECT_PRODUCT__RIGHT_OPERAND:
        return rightOperand != null;
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

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (leftMultiplicit: ");
    result.append(leftMultiplicit);
    result.append(", rightMultiplicit: ");
    result.append(rightMultiplicit);
    result.append(')');
    return result.toString();
  }

} //ALSDirectProductImpl
