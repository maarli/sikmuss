/**
 */
package istarmodel1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agent Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link istarmodel1.AgentContainer#getPlays <em>Plays</em>}</li>
 * </ul>
 *
 * @see istarmodel1.IstarmodelPackage#getAgentContainer()
 * @model
 * @generated
 */
public interface AgentContainer extends ActorContainer {
	/**
	 * Returns the value of the '<em><b>Plays</b></em>' reference list.
	 * The list contents are of type {@link istarmodel1.RoleContainer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plays</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plays</em>' reference list.
	 * @see istarmodel1.IstarmodelPackage#getAgentContainer_Plays()
	 * @model
	 * @generated
	 */
	EList<RoleContainer> getPlays();

} // AgentContainer
