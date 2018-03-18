/**
 */
package istarmodel1.impl;

import istarmodel1.IntentionalElement;
import istarmodel1.IstarmodelPackage;
import istarmodel1.Quality;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quality</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link istarmodel1.impl.QualityImpl#getQualifies <em>Qualifies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QualityImpl extends IntentionalElementImpl implements Quality {
	/**
	 * The cached value of the '{@link #getQualifies() <em>Qualifies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifies()
	 * @generated
	 * @ordered
	 */
	protected EList<IntentionalElement> qualifies;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QualityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IstarmodelPackage.Literals.QUALITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IntentionalElement> getQualifies() {
		if (qualifies == null) {
			qualifies = new EObjectResolvingEList<IntentionalElement>(IntentionalElement.class, this, IstarmodelPackage.QUALITY__QUALIFIES);
		}
		return qualifies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IstarmodelPackage.QUALITY__QUALIFIES:
				return getQualifies();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IstarmodelPackage.QUALITY__QUALIFIES:
				getQualifies().clear();
				getQualifies().addAll((Collection<? extends IntentionalElement>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case IstarmodelPackage.QUALITY__QUALIFIES:
				getQualifies().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case IstarmodelPackage.QUALITY__QUALIFIES:
				return qualifies != null && !qualifies.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QualityImpl
