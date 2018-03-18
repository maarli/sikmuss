/**
 */
package istarmodel1.impl;

import istarmodel1.IstarmodelPackage;
import istarmodel1.Resource;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link istarmodel1.impl.ResourceImpl#getDiagramLink <em>Diagram Link</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceImpl extends ResourceElementImpl implements Resource {
	/**
	 * The cached value of the '{@link #getDiagramLink() <em>Diagram Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagramLink()
	 * @generated
	 * @ordered
	 */
	protected Resource diagramLink;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IstarmodelPackage.Literals.RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getDiagramLink() {
		if (diagramLink != null && diagramLink.eIsProxy()) {
			InternalEObject oldDiagramLink = (InternalEObject)diagramLink;
			diagramLink = (Resource)eResolveProxy(oldDiagramLink);
			if (diagramLink != oldDiagramLink) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IstarmodelPackage.RESOURCE__DIAGRAM_LINK, oldDiagramLink, diagramLink));
			}
		}
		return diagramLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetDiagramLink() {
		return diagramLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagramLink(Resource newDiagramLink) {
		Resource oldDiagramLink = diagramLink;
		diagramLink = newDiagramLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IstarmodelPackage.RESOURCE__DIAGRAM_LINK, oldDiagramLink, diagramLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IstarmodelPackage.RESOURCE__DIAGRAM_LINK:
				if (resolve) return getDiagramLink();
				return basicGetDiagramLink();
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
			case IstarmodelPackage.RESOURCE__DIAGRAM_LINK:
				setDiagramLink((Resource)newValue);
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
			case IstarmodelPackage.RESOURCE__DIAGRAM_LINK:
				setDiagramLink((Resource)null);
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
			case IstarmodelPackage.RESOURCE__DIAGRAM_LINK:
				return diagramLink != null;
		}
		return super.eIsSet(featureID);
	}

} //ResourceImpl
