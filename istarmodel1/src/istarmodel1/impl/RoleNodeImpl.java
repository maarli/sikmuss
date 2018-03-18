/**
 */
package istarmodel1.impl;

import istarmodel1.IstarmodelPackage;
import istarmodel1.RoleNode;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link istarmodel1.impl.RoleNodeImpl#getIsa <em>Isa</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoleNodeImpl extends ActorRealImpl implements RoleNode {
	/**
	 * The cached value of the '{@link #getIsa() <em>Isa</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsa()
	 * @generated
	 * @ordered
	 */
	protected RoleNode isa;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IstarmodelPackage.Literals.ROLE_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleNode getIsa() {
		if (isa != null && isa.eIsProxy()) {
			InternalEObject oldIsa = (InternalEObject)isa;
			isa = (RoleNode)eResolveProxy(oldIsa);
			if (isa != oldIsa) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IstarmodelPackage.ROLE_NODE__ISA, oldIsa, isa));
			}
		}
		return isa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleNode basicGetIsa() {
		return isa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsa(RoleNode newIsa) {
		RoleNode oldIsa = isa;
		isa = newIsa;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IstarmodelPackage.ROLE_NODE__ISA, oldIsa, isa));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IstarmodelPackage.ROLE_NODE__ISA:
				if (resolve) return getIsa();
				return basicGetIsa();
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
			case IstarmodelPackage.ROLE_NODE__ISA:
				setIsa((RoleNode)newValue);
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
			case IstarmodelPackage.ROLE_NODE__ISA:
				setIsa((RoleNode)null);
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
			case IstarmodelPackage.ROLE_NODE__ISA:
				return isa != null;
		}
		return super.eIsSet(featureID);
	}

} //RoleNodeImpl
