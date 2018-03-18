/**
 */
package istarmodel1.impl;

import istarmodel1.ActorReal;
import istarmodel1.IstarmodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actor Real</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link istarmodel1.impl.ActorRealImpl#getName <em>Name</em>}</li>
 *   <li>{@link istarmodel1.impl.ActorRealImpl#getParticipatesin <em>Participatesin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActorRealImpl extends MinimalEObjectImpl.Container implements ActorReal {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParticipatesin() <em>Participatesin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipatesin()
	 * @generated
	 * @ordered
	 */
	protected ActorReal participatesin;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActorRealImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IstarmodelPackage.Literals.ACTOR_REAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IstarmodelPackage.ACTOR_REAL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActorReal getParticipatesin() {
		if (participatesin != null && participatesin.eIsProxy()) {
			InternalEObject oldParticipatesin = (InternalEObject)participatesin;
			participatesin = (ActorReal)eResolveProxy(oldParticipatesin);
			if (participatesin != oldParticipatesin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IstarmodelPackage.ACTOR_REAL__PARTICIPATESIN, oldParticipatesin, participatesin));
			}
		}
		return participatesin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActorReal basicGetParticipatesin() {
		return participatesin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParticipatesin(ActorReal newParticipatesin) {
		ActorReal oldParticipatesin = participatesin;
		participatesin = newParticipatesin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IstarmodelPackage.ACTOR_REAL__PARTICIPATESIN, oldParticipatesin, participatesin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IstarmodelPackage.ACTOR_REAL__NAME:
				return getName();
			case IstarmodelPackage.ACTOR_REAL__PARTICIPATESIN:
				if (resolve) return getParticipatesin();
				return basicGetParticipatesin();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IstarmodelPackage.ACTOR_REAL__NAME:
				setName((String)newValue);
				return;
			case IstarmodelPackage.ACTOR_REAL__PARTICIPATESIN:
				setParticipatesin((ActorReal)newValue);
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
			case IstarmodelPackage.ACTOR_REAL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case IstarmodelPackage.ACTOR_REAL__PARTICIPATESIN:
				setParticipatesin((ActorReal)null);
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
			case IstarmodelPackage.ACTOR_REAL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case IstarmodelPackage.ACTOR_REAL__PARTICIPATESIN:
				return participatesin != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ActorRealImpl
