/**
 */
package istarmodel1.impl;

import istarmodel1.ActorContainer;
import istarmodel1.ActorReal;
import istarmodel1.IntentionalElement;
import istarmodel1.IstarDiagram;
import istarmodel1.IstarmodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Istar Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link istarmodel1.impl.IstarDiagramImpl#getActors <em>Actors</em>}</li>
 *   <li>{@link istarmodel1.impl.IstarDiagramImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link istarmodel1.impl.IstarDiagramImpl#getName <em>Name</em>}</li>
 *   <li>{@link istarmodel1.impl.IstarDiagramImpl#getNodes <em>Nodes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IstarDiagramImpl extends MinimalEObjectImpl.Container implements IstarDiagram {
	/**
	 * The cached value of the '{@link #getActors() <em>Actors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActors()
	 * @generated
	 * @ordered
	 */
	protected EList<ActorContainer> actors;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<IntentionalElement> elements;

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
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<ActorReal> nodes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IstarDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IstarmodelPackage.Literals.ISTAR_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActorContainer> getActors() {
		if (actors == null) {
			actors = new EObjectContainmentEList<ActorContainer>(ActorContainer.class, this, IstarmodelPackage.ISTAR_DIAGRAM__ACTORS);
		}
		return actors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IntentionalElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<IntentionalElement>(IntentionalElement.class, this, IstarmodelPackage.ISTAR_DIAGRAM__ELEMENTS);
		}
		return elements;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IstarmodelPackage.ISTAR_DIAGRAM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActorReal> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentEList<ActorReal>(ActorReal.class, this, IstarmodelPackage.ISTAR_DIAGRAM__NODES);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IstarmodelPackage.ISTAR_DIAGRAM__ACTORS:
				return ((InternalEList<?>)getActors()).basicRemove(otherEnd, msgs);
			case IstarmodelPackage.ISTAR_DIAGRAM__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
			case IstarmodelPackage.ISTAR_DIAGRAM__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IstarmodelPackage.ISTAR_DIAGRAM__ACTORS:
				return getActors();
			case IstarmodelPackage.ISTAR_DIAGRAM__ELEMENTS:
				return getElements();
			case IstarmodelPackage.ISTAR_DIAGRAM__NAME:
				return getName();
			case IstarmodelPackage.ISTAR_DIAGRAM__NODES:
				return getNodes();
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
			case IstarmodelPackage.ISTAR_DIAGRAM__ACTORS:
				getActors().clear();
				getActors().addAll((Collection<? extends ActorContainer>)newValue);
				return;
			case IstarmodelPackage.ISTAR_DIAGRAM__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends IntentionalElement>)newValue);
				return;
			case IstarmodelPackage.ISTAR_DIAGRAM__NAME:
				setName((String)newValue);
				return;
			case IstarmodelPackage.ISTAR_DIAGRAM__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends ActorReal>)newValue);
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
			case IstarmodelPackage.ISTAR_DIAGRAM__ACTORS:
				getActors().clear();
				return;
			case IstarmodelPackage.ISTAR_DIAGRAM__ELEMENTS:
				getElements().clear();
				return;
			case IstarmodelPackage.ISTAR_DIAGRAM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case IstarmodelPackage.ISTAR_DIAGRAM__NODES:
				getNodes().clear();
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
			case IstarmodelPackage.ISTAR_DIAGRAM__ACTORS:
				return actors != null && !actors.isEmpty();
			case IstarmodelPackage.ISTAR_DIAGRAM__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case IstarmodelPackage.ISTAR_DIAGRAM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case IstarmodelPackage.ISTAR_DIAGRAM__NODES:
				return nodes != null && !nodes.isEmpty();
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

} //IstarDiagramImpl
