/**
 */
package istarmodel1.util;

import istarmodel1.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see istarmodel1.IstarmodelPackage
 * @generated
 */
public class IstarmodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IstarmodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IstarmodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = IstarmodelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IstarmodelSwitch<Adapter> modelSwitch =
		new IstarmodelSwitch<Adapter>() {
			@Override
			public Adapter caseActorContainer(ActorContainer object) {
				return createActorContainerAdapter();
			}
			@Override
			public Adapter caseAgentContainer(AgentContainer object) {
				return createAgentContainerAdapter();
			}
			@Override
			public Adapter caseRoleContainer(RoleContainer object) {
				return createRoleContainerAdapter();
			}
			@Override
			public Adapter caseIntentionalElement(IntentionalElement object) {
				return createIntentionalElementAdapter();
			}
			@Override
			public Adapter caseGoalTaskElement(GoalTaskElement object) {
				return createGoalTaskElementAdapter();
			}
			@Override
			public Adapter caseQuality(Quality object) {
				return createQualityAdapter();
			}
			@Override
			public Adapter caseResourceElement(ResourceElement object) {
				return createResourceElementAdapter();
			}
			@Override
			public Adapter caseGoal(Goal object) {
				return createGoalAdapter();
			}
			@Override
			public Adapter caseTask(Task object) {
				return createTaskAdapter();
			}
			@Override
			public Adapter caseResource(Resource object) {
				return createResourceAdapter();
			}
			@Override
			public Adapter caseIstarDiagram(IstarDiagram object) {
				return createIstarDiagramAdapter();
			}
			@Override
			public Adapter caseDiagramContainer(DiagramContainer object) {
				return createDiagramContainerAdapter();
			}
			@Override
			public Adapter caseRoleNode(RoleNode object) {
				return createRoleNodeAdapter();
			}
			@Override
			public Adapter caseAgentNode(AgentNode object) {
				return createAgentNodeAdapter();
			}
			@Override
			public Adapter caseActorReal(ActorReal object) {
				return createActorRealAdapter();
			}
			@Override
			public Adapter caseActorNode(ActorNode object) {
				return createActorNodeAdapter();
			}
			@Override
			public Adapter caseActorContainerImp(ActorContainerImp object) {
				return createActorContainerImpAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link istarmodel1.ActorContainer <em>Actor Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see istarmodel1.ActorContainer
	 * @generated
	 */
	public Adapter createActorContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link istarmodel1.AgentContainer <em>Agent Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see istarmodel1.AgentContainer
	 * @generated
	 */
	public Adapter createAgentContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link istarmodel1.RoleContainer <em>Role Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see istarmodel1.RoleContainer
	 * @generated
	 */
	public Adapter createRoleContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link istarmodel1.IntentionalElement <em>Intentional Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see istarmodel1.IntentionalElement
	 * @generated
	 */
	public Adapter createIntentionalElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link istarmodel1.GoalTaskElement <em>Goal Task Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see istarmodel1.GoalTaskElement
	 * @generated
	 */
	public Adapter createGoalTaskElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link istarmodel1.Quality <em>Quality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see istarmodel1.Quality
	 * @generated
	 */
	public Adapter createQualityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link istarmodel1.ResourceElement <em>Resource Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see istarmodel1.ResourceElement
	 * @generated
	 */
	public Adapter createResourceElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link istarmodel1.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see istarmodel1.Goal
	 * @generated
	 */
	public Adapter createGoalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link istarmodel1.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see istarmodel1.Task
	 * @generated
	 */
	public Adapter createTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link istarmodel1.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see istarmodel1.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link istarmodel1.IstarDiagram <em>Istar Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see istarmodel1.IstarDiagram
	 * @generated
	 */
	public Adapter createIstarDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link istarmodel1.DiagramContainer <em>Diagram Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see istarmodel1.DiagramContainer
	 * @generated
	 */
	public Adapter createDiagramContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link istarmodel1.RoleNode <em>Role Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see istarmodel1.RoleNode
	 * @generated
	 */
	public Adapter createRoleNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link istarmodel1.AgentNode <em>Agent Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see istarmodel1.AgentNode
	 * @generated
	 */
	public Adapter createAgentNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link istarmodel1.ActorReal <em>Actor Real</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see istarmodel1.ActorReal
	 * @generated
	 */
	public Adapter createActorRealAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link istarmodel1.ActorNode <em>Actor Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see istarmodel1.ActorNode
	 * @generated
	 */
	public Adapter createActorNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link istarmodel1.ActorContainerImp <em>Actor Container Imp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see istarmodel1.ActorContainerImp
	 * @generated
	 */
	public Adapter createActorContainerImpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link istarmodel1.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see istarmodel1.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //IstarmodelAdapterFactory
