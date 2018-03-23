/**
 */
package istarmodel1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link istarmodel1.Element#getDepend <em>Depend</em>}</li>
 * </ul>
 *
 * @see istarmodel1.IstarmodelPackage#getElement()
 * @model
 * @generated
 */
public interface Element extends EObject {
	/**
	 * Returns the value of the '<em><b>Depend</b></em>' reference list.
	 * The list contents are of type {@link istarmodel1.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depend</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depend</em>' reference list.
	 * @see istarmodel1.IstarmodelPackage#getElement_Depend()
	 * @model
	 * @generated
	 */
	EList<Element> getDepend();

} // Element
