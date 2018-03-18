/**
 */
package istarmodel1.impl;

import istarmodel1.AgentContainer;
import istarmodel1.IstarmodelPackage;
import istarmodel1.RoleContainer;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agent Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link istarmodel1.impl.AgentContainerImpl#getPlays <em>Plays</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AgentContainerImpl extends ActorContainerImpl implements AgentContainer {
	/**
	 * The cached value of the '{@link #getPlays() <em>Plays</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlays()
	 * @generated
	 * @ordered
	 */
	protected EList<RoleContainer> plays;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgentContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IstarmodelPackage.Literals.AGENT_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoleContainer> getPlays() {
		if (plays == null) {
			plays = new EObjectResolvingEList<RoleContainer>(RoleContainer.class, this, IstarmodelPackage.AGENT_CONTAINER__PLAYS);
		}
		return plays;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IstarmodelPackage.AGENT_CONTAINER__PLAYS:
				return getPlays();
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
			case IstarmodelPackage.AGENT_CONTAINER__PLAYS:
				getPlays().clear();
				getPlays().addAll((Collection<? extends RoleContainer>)newValue);
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
			case IstarmodelPackage.AGENT_CONTAINER__PLAYS:
				getPlays().clear();
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
			case IstarmodelPackage.AGENT_CONTAINER__PLAYS:
				return plays != null && !plays.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AgentContainerImpl
