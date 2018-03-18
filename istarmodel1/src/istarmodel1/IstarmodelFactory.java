/**
 */
package istarmodel1;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see istarmodel1.IstarmodelPackage
 * @generated
 */
public interface IstarmodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IstarmodelFactory eINSTANCE = istarmodel1.impl.IstarmodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Actor Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actor Container</em>'.
	 * @generated
	 */
	ActorContainer createActorContainer();

	/**
	 * Returns a new object of class '<em>Agent Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Agent Container</em>'.
	 * @generated
	 */
	AgentContainer createAgentContainer();

	/**
	 * Returns a new object of class '<em>Role Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Container</em>'.
	 * @generated
	 */
	RoleContainer createRoleContainer();

	/**
	 * Returns a new object of class '<em>Quality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quality</em>'.
	 * @generated
	 */
	Quality createQuality();

	/**
	 * Returns a new object of class '<em>Goal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Goal</em>'.
	 * @generated
	 */
	Goal createGoal();

	/**
	 * Returns a new object of class '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task</em>'.
	 * @generated
	 */
	Task createTask();

	/**
	 * Returns a new object of class '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource</em>'.
	 * @generated
	 */
	Resource createResource();

	/**
	 * Returns a new object of class '<em>Istar Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Istar Diagram</em>'.
	 * @generated
	 */
	IstarDiagram createIstarDiagram();

	/**
	 * Returns a new object of class '<em>Diagram Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagram Container</em>'.
	 * @generated
	 */
	DiagramContainer createDiagramContainer();

	/**
	 * Returns a new object of class '<em>Role Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Node</em>'.
	 * @generated
	 */
	RoleNode createRoleNode();

	/**
	 * Returns a new object of class '<em>Agent Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Agent Node</em>'.
	 * @generated
	 */
	AgentNode createAgentNode();

	/**
	 * Returns a new object of class '<em>Actor Real</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actor Real</em>'.
	 * @generated
	 */
	ActorReal createActorReal();

	/**
	 * Returns a new object of class '<em>Actor Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actor Node</em>'.
	 * @generated
	 */
	ActorNode createActorNode();

	/**
	 * Returns a new object of class '<em>Actor Container Imp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actor Container Imp</em>'.
	 * @generated
	 */
	ActorContainerImp createActorContainerImp();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IstarmodelPackage getIstarmodelPackage();

} //IstarmodelFactory
