/**
 */
package istarmodel1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link istarmodel1.Task#getProvides <em>Provides</em>}</li>
 * </ul>
 *
 * @see istarmodel1.IstarmodelPackage#getTask()
 * @model
 * @generated
 */
public interface Task extends GoalTaskElement {
	/**
	 * Returns the value of the '<em><b>Provides</b></em>' reference list.
	 * The list contents are of type {@link istarmodel1.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provides</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provides</em>' reference list.
	 * @see istarmodel1.IstarmodelPackage#getTask_Provides()
	 * @model
	 * @generated
	 */
	EList<Resource> getProvides();

} // Task
