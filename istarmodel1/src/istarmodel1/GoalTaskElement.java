/**
 */
package istarmodel1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goal Task Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link istarmodel1.GoalTaskElement#getAndRefinement <em>And Refinement</em>}</li>
 *   <li>{@link istarmodel1.GoalTaskElement#getOrRefinement <em>Or Refinement</em>}</li>
 * </ul>
 *
 * @see istarmodel1.IstarmodelPackage#getGoalTaskElement()
 * @model abstract="true"
 * @generated
 */
public interface GoalTaskElement extends IntentionalElement {
	/**
	 * Returns the value of the '<em><b>And Refinement</b></em>' reference list.
	 * The list contents are of type {@link istarmodel1.GoalTaskElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>And Refinement</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>And Refinement</em>' reference list.
	 * @see istarmodel1.IstarmodelPackage#getGoalTaskElement_AndRefinement()
	 * @model
	 * @generated
	 */
	EList<GoalTaskElement> getAndRefinement();

	/**
	 * Returns the value of the '<em><b>Or Refinement</b></em>' reference list.
	 * The list contents are of type {@link istarmodel1.GoalTaskElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Or Refinement</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Or Refinement</em>' reference list.
	 * @see istarmodel1.IstarmodelPackage#getGoalTaskElement_OrRefinement()
	 * @model
	 * @generated
	 */
	EList<GoalTaskElement> getOrRefinement();

} // GoalTaskElement
