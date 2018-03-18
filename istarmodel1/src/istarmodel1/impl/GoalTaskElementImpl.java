/**
 */
package istarmodel1.impl;

import istarmodel1.GoalTaskElement;
import istarmodel1.IstarmodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Goal Task Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link istarmodel1.impl.GoalTaskElementImpl#getAndRefinement <em>And Refinement</em>}</li>
 *   <li>{@link istarmodel1.impl.GoalTaskElementImpl#getOrRefinement <em>Or Refinement</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class GoalTaskElementImpl extends IntentionalElementImpl implements GoalTaskElement {
	/**
	 * The cached value of the '{@link #getAndRefinement() <em>And Refinement</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAndRefinement()
	 * @generated
	 * @ordered
	 */
	protected EList<GoalTaskElement> andRefinement;

	/**
	 * The cached value of the '{@link #getOrRefinement() <em>Or Refinement</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrRefinement()
	 * @generated
	 * @ordered
	 */
	protected EList<GoalTaskElement> orRefinement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GoalTaskElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IstarmodelPackage.Literals.GOAL_TASK_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GoalTaskElement> getAndRefinement() {
		if (andRefinement == null) {
			andRefinement = new EObjectResolvingEList<GoalTaskElement>(GoalTaskElement.class, this, IstarmodelPackage.GOAL_TASK_ELEMENT__AND_REFINEMENT);
		}
		return andRefinement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GoalTaskElement> getOrRefinement() {
		if (orRefinement == null) {
			orRefinement = new EObjectResolvingEList<GoalTaskElement>(GoalTaskElement.class, this, IstarmodelPackage.GOAL_TASK_ELEMENT__OR_REFINEMENT);
		}
		return orRefinement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IstarmodelPackage.GOAL_TASK_ELEMENT__AND_REFINEMENT:
				return getAndRefinement();
			case IstarmodelPackage.GOAL_TASK_ELEMENT__OR_REFINEMENT:
				return getOrRefinement();
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
			case IstarmodelPackage.GOAL_TASK_ELEMENT__AND_REFINEMENT:
				getAndRefinement().clear();
				getAndRefinement().addAll((Collection<? extends GoalTaskElement>)newValue);
				return;
			case IstarmodelPackage.GOAL_TASK_ELEMENT__OR_REFINEMENT:
				getOrRefinement().clear();
				getOrRefinement().addAll((Collection<? extends GoalTaskElement>)newValue);
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
			case IstarmodelPackage.GOAL_TASK_ELEMENT__AND_REFINEMENT:
				getAndRefinement().clear();
				return;
			case IstarmodelPackage.GOAL_TASK_ELEMENT__OR_REFINEMENT:
				getOrRefinement().clear();
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
			case IstarmodelPackage.GOAL_TASK_ELEMENT__AND_REFINEMENT:
				return andRefinement != null && !andRefinement.isEmpty();
			case IstarmodelPackage.GOAL_TASK_ELEMENT__OR_REFINEMENT:
				return orRefinement != null && !orRefinement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GoalTaskElementImpl
