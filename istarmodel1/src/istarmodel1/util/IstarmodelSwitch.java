/**
 */
package istarmodel1.util;

import istarmodel1.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see istarmodel1.IstarmodelPackage
 * @generated
 */
public class IstarmodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IstarmodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IstarmodelSwitch() {
		if (modelPackage == null) {
			modelPackage = IstarmodelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case IstarmodelPackage.ACTOR_CONTAINER: {
				ActorContainer actorContainer = (ActorContainer)theEObject;
				T result = caseActorContainer(actorContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IstarmodelPackage.AGENT_CONTAINER: {
				AgentContainer agentContainer = (AgentContainer)theEObject;
				T result = caseAgentContainer(agentContainer);
				if (result == null) result = caseActorContainer(agentContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IstarmodelPackage.ROLE_CONTAINER: {
				RoleContainer roleContainer = (RoleContainer)theEObject;
				T result = caseRoleContainer(roleContainer);
				if (result == null) result = caseActorContainer(roleContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IstarmodelPackage.INTENTIONAL_ELEMENT: {
				IntentionalElement intentionalElement = (IntentionalElement)theEObject;
				T result = caseIntentionalElement(intentionalElement);
				if (result == null) result = caseElement(intentionalElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IstarmodelPackage.GOAL_TASK_ELEMENT: {
				GoalTaskElement goalTaskElement = (GoalTaskElement)theEObject;
				T result = caseGoalTaskElement(goalTaskElement);
				if (result == null) result = caseIntentionalElement(goalTaskElement);
				if (result == null) result = caseElement(goalTaskElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IstarmodelPackage.QUALITY: {
				Quality quality = (Quality)theEObject;
				T result = caseQuality(quality);
				if (result == null) result = caseIntentionalElement(quality);
				if (result == null) result = caseElement(quality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IstarmodelPackage.RESOURCE_ELEMENT: {
				ResourceElement resourceElement = (ResourceElement)theEObject;
				T result = caseResourceElement(resourceElement);
				if (result == null) result = caseIntentionalElement(resourceElement);
				if (result == null) result = caseElement(resourceElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IstarmodelPackage.GOAL: {
				Goal goal = (Goal)theEObject;
				T result = caseGoal(goal);
				if (result == null) result = caseGoalTaskElement(goal);
				if (result == null) result = caseIntentionalElement(goal);
				if (result == null) result = caseElement(goal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IstarmodelPackage.TASK: {
				Task task = (Task)theEObject;
				T result = caseTask(task);
				if (result == null) result = caseGoalTaskElement(task);
				if (result == null) result = caseIntentionalElement(task);
				if (result == null) result = caseElement(task);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IstarmodelPackage.RESOURCE: {
				Resource resource = (Resource)theEObject;
				T result = caseResource(resource);
				if (result == null) result = caseResourceElement(resource);
				if (result == null) result = caseIntentionalElement(resource);
				if (result == null) result = caseElement(resource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IstarmodelPackage.ISTAR_DIAGRAM: {
				IstarDiagram istarDiagram = (IstarDiagram)theEObject;
				T result = caseIstarDiagram(istarDiagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IstarmodelPackage.DIAGRAM_CONTAINER: {
				DiagramContainer diagramContainer = (DiagramContainer)theEObject;
				T result = caseDiagramContainer(diagramContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IstarmodelPackage.ROLE_NODE: {
				RoleNode roleNode = (RoleNode)theEObject;
				T result = caseRoleNode(roleNode);
				if (result == null) result = caseActorReal(roleNode);
				if (result == null) result = caseElement(roleNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IstarmodelPackage.AGENT_NODE: {
				AgentNode agentNode = (AgentNode)theEObject;
				T result = caseAgentNode(agentNode);
				if (result == null) result = caseActorReal(agentNode);
				if (result == null) result = caseElement(agentNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IstarmodelPackage.ACTOR_REAL: {
				ActorReal actorReal = (ActorReal)theEObject;
				T result = caseActorReal(actorReal);
				if (result == null) result = caseElement(actorReal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IstarmodelPackage.ACTOR_NODE: {
				ActorNode actorNode = (ActorNode)theEObject;
				T result = caseActorNode(actorNode);
				if (result == null) result = caseActorReal(actorNode);
				if (result == null) result = caseElement(actorNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IstarmodelPackage.ACTOR_CONTAINER_IMP: {
				ActorContainerImp actorContainerImp = (ActorContainerImp)theEObject;
				T result = caseActorContainerImp(actorContainerImp);
				if (result == null) result = caseActorContainer(actorContainerImp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IstarmodelPackage.ELEMENT: {
				Element element = (Element)theEObject;
				T result = caseElement(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actor Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actor Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActorContainer(ActorContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agent Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agent Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgentContainer(AgentContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleContainer(RoleContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intentional Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intentional Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntentionalElement(IntentionalElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Goal Task Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Goal Task Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoalTaskElement(GoalTaskElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuality(Quality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceElement(ResourceElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Goal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Goal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoal(Goal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTask(Task object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResource(Resource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Istar Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Istar Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIstarDiagram(IstarDiagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagramContainer(DiagramContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleNode(RoleNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agent Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agent Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgentNode(AgentNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actor Real</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actor Real</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActorReal(ActorReal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actor Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actor Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActorNode(ActorNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actor Container Imp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actor Container Imp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActorContainerImp(ActorContainerImp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //IstarmodelSwitch
