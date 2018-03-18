/**
 */
package istarmodel1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link istarmodel1.ResourceElement#getNeededBy <em>Needed By</em>}</li>
 * </ul>
 *
 * @see istarmodel1.IstarmodelPackage#getResourceElement()
 * @model abstract="true"
 * @generated
 */
public interface ResourceElement extends IntentionalElement {
	/**
	 * Returns the value of the '<em><b>Needed By</b></em>' reference list.
	 * The list contents are of type {@link istarmodel1.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Needed By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Needed By</em>' reference list.
	 * @see istarmodel1.IstarmodelPackage#getResourceElement_NeededBy()
	 * @model
	 * @generated
	 */
	EList<Task> getNeededBy();

} // ResourceElement
