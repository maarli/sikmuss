/**
 */
package istarmodel1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intentional Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link istarmodel1.IntentionalElement#getName <em>Name</em>}</li>
 *   <li>{@link istarmodel1.IntentionalElement#getContributesToHelp <em>Contributes To Help</em>}</li>
 *   <li>{@link istarmodel1.IntentionalElement#getContributesToHurt <em>Contributes To Hurt</em>}</li>
 *   <li>{@link istarmodel1.IntentionalElement#getContributesToBreak <em>Contributes To Break</em>}</li>
 *   <li>{@link istarmodel1.IntentionalElement#getContributesToMake <em>Contributes To Make</em>}</li>
 * </ul>
 *
 * @see istarmodel1.IstarmodelPackage#getIntentionalElement()
 * @model abstract="true"
 * @generated
 */
public interface IntentionalElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see istarmodel1.IstarmodelPackage#getIntentionalElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link istarmodel1.IntentionalElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Contributes To Help</b></em>' reference list.
	 * The list contents are of type {@link istarmodel1.Quality}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contributes To Help</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contributes To Help</em>' reference list.
	 * @see istarmodel1.IstarmodelPackage#getIntentionalElement_ContributesToHelp()
	 * @model
	 * @generated
	 */
	EList<Quality> getContributesToHelp();

	/**
	 * Returns the value of the '<em><b>Contributes To Hurt</b></em>' reference list.
	 * The list contents are of type {@link istarmodel1.Quality}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contributes To Hurt</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contributes To Hurt</em>' reference list.
	 * @see istarmodel1.IstarmodelPackage#getIntentionalElement_ContributesToHurt()
	 * @model
	 * @generated
	 */
	EList<Quality> getContributesToHurt();

	/**
	 * Returns the value of the '<em><b>Contributes To Break</b></em>' reference list.
	 * The list contents are of type {@link istarmodel1.Quality}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contributes To Break</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contributes To Break</em>' reference list.
	 * @see istarmodel1.IstarmodelPackage#getIntentionalElement_ContributesToBreak()
	 * @model
	 * @generated
	 */
	EList<Quality> getContributesToBreak();

	/**
	 * Returns the value of the '<em><b>Contributes To Make</b></em>' reference list.
	 * The list contents are of type {@link istarmodel1.Quality}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contributes To Make</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contributes To Make</em>' reference list.
	 * @see istarmodel1.IstarmodelPackage#getIntentionalElement_ContributesToMake()
	 * @model
	 * @generated
	 */
	EList<Quality> getContributesToMake();

} // IntentionalElement
