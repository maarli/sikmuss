/**
 */
package istarmodel1.impl;

import istarmodel1.IntentionalElement;
import istarmodel1.IstarmodelPackage;
import istarmodel1.Quality;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intentional Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link istarmodel1.impl.IntentionalElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link istarmodel1.impl.IntentionalElementImpl#getContributesToHelp <em>Contributes To Help</em>}</li>
 *   <li>{@link istarmodel1.impl.IntentionalElementImpl#getContributesToHurt <em>Contributes To Hurt</em>}</li>
 *   <li>{@link istarmodel1.impl.IntentionalElementImpl#getContributesToBreak <em>Contributes To Break</em>}</li>
 *   <li>{@link istarmodel1.impl.IntentionalElementImpl#getContributesToMake <em>Contributes To Make</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class IntentionalElementImpl extends ElementImpl implements IntentionalElement {
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
	 * The cached value of the '{@link #getContributesToHelp() <em>Contributes To Help</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContributesToHelp()
	 * @generated
	 * @ordered
	 */
	protected EList<Quality> contributesToHelp;

	/**
	 * The cached value of the '{@link #getContributesToHurt() <em>Contributes To Hurt</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContributesToHurt()
	 * @generated
	 * @ordered
	 */
	protected EList<Quality> contributesToHurt;

	/**
	 * The cached value of the '{@link #getContributesToBreak() <em>Contributes To Break</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContributesToBreak()
	 * @generated
	 * @ordered
	 */
	protected EList<Quality> contributesToBreak;

	/**
	 * The cached value of the '{@link #getContributesToMake() <em>Contributes To Make</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContributesToMake()
	 * @generated
	 * @ordered
	 */
	protected EList<Quality> contributesToMake;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntentionalElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IstarmodelPackage.Literals.INTENTIONAL_ELEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IstarmodelPackage.INTENTIONAL_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Quality> getContributesToHelp() {
		if (contributesToHelp == null) {
			contributesToHelp = new EObjectResolvingEList<Quality>(Quality.class, this, IstarmodelPackage.INTENTIONAL_ELEMENT__CONTRIBUTES_TO_HELP);
		}
		return contributesToHelp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Quality> getContributesToHurt() {
		if (contributesToHurt == null) {
			contributesToHurt = new EObjectResolvingEList<Quality>(Quality.class, this, IstarmodelPackage.INTENTIONAL_ELEMENT__CONTRIBUTES_TO_HURT);
		}
		return contributesToHurt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Quality> getContributesToBreak() {
		if (contributesToBreak == null) {
			contributesToBreak = new EObjectResolvingEList<Quality>(Quality.class, this, IstarmodelPackage.INTENTIONAL_ELEMENT__CONTRIBUTES_TO_BREAK);
		}
		return contributesToBreak;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Quality> getContributesToMake() {
		if (contributesToMake == null) {
			contributesToMake = new EObjectResolvingEList<Quality>(Quality.class, this, IstarmodelPackage.INTENTIONAL_ELEMENT__CONTRIBUTES_TO_MAKE);
		}
		return contributesToMake;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IstarmodelPackage.INTENTIONAL_ELEMENT__NAME:
				return getName();
			case IstarmodelPackage.INTENTIONAL_ELEMENT__CONTRIBUTES_TO_HELP:
				return getContributesToHelp();
			case IstarmodelPackage.INTENTIONAL_ELEMENT__CONTRIBUTES_TO_HURT:
				return getContributesToHurt();
			case IstarmodelPackage.INTENTIONAL_ELEMENT__CONTRIBUTES_TO_BREAK:
				return getContributesToBreak();
			case IstarmodelPackage.INTENTIONAL_ELEMENT__CONTRIBUTES_TO_MAKE:
				return getContributesToMake();
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
			case IstarmodelPackage.INTENTIONAL_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case IstarmodelPackage.INTENTIONAL_ELEMENT__CONTRIBUTES_TO_HELP:
				getContributesToHelp().clear();
				getContributesToHelp().addAll((Collection<? extends Quality>)newValue);
				return;
			case IstarmodelPackage.INTENTIONAL_ELEMENT__CONTRIBUTES_TO_HURT:
				getContributesToHurt().clear();
				getContributesToHurt().addAll((Collection<? extends Quality>)newValue);
				return;
			case IstarmodelPackage.INTENTIONAL_ELEMENT__CONTRIBUTES_TO_BREAK:
				getContributesToBreak().clear();
				getContributesToBreak().addAll((Collection<? extends Quality>)newValue);
				return;
			case IstarmodelPackage.INTENTIONAL_ELEMENT__CONTRIBUTES_TO_MAKE:
				getContributesToMake().clear();
				getContributesToMake().addAll((Collection<? extends Quality>)newValue);
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
			case IstarmodelPackage.INTENTIONAL_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case IstarmodelPackage.INTENTIONAL_ELEMENT__CONTRIBUTES_TO_HELP:
				getContributesToHelp().clear();
				return;
			case IstarmodelPackage.INTENTIONAL_ELEMENT__CONTRIBUTES_TO_HURT:
				getContributesToHurt().clear();
				return;
			case IstarmodelPackage.INTENTIONAL_ELEMENT__CONTRIBUTES_TO_BREAK:
				getContributesToBreak().clear();
				return;
			case IstarmodelPackage.INTENTIONAL_ELEMENT__CONTRIBUTES_TO_MAKE:
				getContributesToMake().clear();
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
			case IstarmodelPackage.INTENTIONAL_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case IstarmodelPackage.INTENTIONAL_ELEMENT__CONTRIBUTES_TO_HELP:
				return contributesToHelp != null && !contributesToHelp.isEmpty();
			case IstarmodelPackage.INTENTIONAL_ELEMENT__CONTRIBUTES_TO_HURT:
				return contributesToHurt != null && !contributesToHurt.isEmpty();
			case IstarmodelPackage.INTENTIONAL_ELEMENT__CONTRIBUTES_TO_BREAK:
				return contributesToBreak != null && !contributesToBreak.isEmpty();
			case IstarmodelPackage.INTENTIONAL_ELEMENT__CONTRIBUTES_TO_MAKE:
				return contributesToMake != null && !contributesToMake.isEmpty();
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

} //IntentionalElementImpl
