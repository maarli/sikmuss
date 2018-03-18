/**
 */
package istarmodel1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link istarmodel1.Quality#getQualifies <em>Qualifies</em>}</li>
 * </ul>
 *
 * @see istarmodel1.IstarmodelPackage#getQuality()
 * @model
 * @generated
 */
public interface Quality extends IntentionalElement {
	/**
	 * Returns the value of the '<em><b>Qualifies</b></em>' reference list.
	 * The list contents are of type {@link istarmodel1.IntentionalElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualifies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifies</em>' reference list.
	 * @see istarmodel1.IstarmodelPackage#getQuality_Qualifies()
	 * @model
	 * @generated
	 */
	EList<IntentionalElement> getQualifies();

} // Quality
