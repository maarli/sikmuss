/**
 */
package istarmodel1.impl;

import istarmodel1.IstarmodelPackage;
import istarmodel1.ResourceElement;
import istarmodel1.Task;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link istarmodel1.impl.ResourceElementImpl#getNeededBy <em>Needed By</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ResourceElementImpl extends IntentionalElementImpl implements ResourceElement {
	/**
	 * The cached value of the '{@link #getNeededBy() <em>Needed By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeededBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> neededBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IstarmodelPackage.Literals.RESOURCE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getNeededBy() {
		if (neededBy == null) {
			neededBy = new EObjectResolvingEList<Task>(Task.class, this, IstarmodelPackage.RESOURCE_ELEMENT__NEEDED_BY);
		}
		return neededBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IstarmodelPackage.RESOURCE_ELEMENT__NEEDED_BY:
				return getNeededBy();
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
			case IstarmodelPackage.RESOURCE_ELEMENT__NEEDED_BY:
				getNeededBy().clear();
				getNeededBy().addAll((Collection<? extends Task>)newValue);
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
			case IstarmodelPackage.RESOURCE_ELEMENT__NEEDED_BY:
				getNeededBy().clear();
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
			case IstarmodelPackage.RESOURCE_ELEMENT__NEEDED_BY:
				return neededBy != null && !neededBy.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResourceElementImpl
