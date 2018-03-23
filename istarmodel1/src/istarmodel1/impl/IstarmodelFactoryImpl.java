/**
 */
package istarmodel1.impl;

import istarmodel1.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IstarmodelFactoryImpl extends EFactoryImpl implements IstarmodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IstarmodelFactory init() {
		try {
			IstarmodelFactory theIstarmodelFactory = (IstarmodelFactory)EPackage.Registry.INSTANCE.getEFactory(IstarmodelPackage.eNS_URI);
			if (theIstarmodelFactory != null) {
				return theIstarmodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IstarmodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IstarmodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case IstarmodelPackage.ACTOR_CONTAINER: return createActorContainer();
			case IstarmodelPackage.AGENT_CONTAINER: return createAgentContainer();
			case IstarmodelPackage.ROLE_CONTAINER: return createRoleContainer();
			case IstarmodelPackage.QUALITY: return createQuality();
			case IstarmodelPackage.GOAL: return createGoal();
			case IstarmodelPackage.TASK: return createTask();
			case IstarmodelPackage.RESOURCE: return createResource();
			case IstarmodelPackage.ISTAR_DIAGRAM: return createIstarDiagram();
			case IstarmodelPackage.DIAGRAM_CONTAINER: return createDiagramContainer();
			case IstarmodelPackage.ROLE_NODE: return createRoleNode();
			case IstarmodelPackage.AGENT_NODE: return createAgentNode();
			case IstarmodelPackage.ACTOR_REAL: return createActorReal();
			case IstarmodelPackage.ACTOR_NODE: return createActorNode();
			case IstarmodelPackage.ACTOR_CONTAINER_IMP: return createActorContainerImp();
			case IstarmodelPackage.ELEMENT: return createElement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActorContainer createActorContainer() {
		ActorContainerImpl actorContainer = new ActorContainerImpl();
		return actorContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgentContainer createAgentContainer() {
		AgentContainerImpl agentContainer = new AgentContainerImpl();
		return agentContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleContainer createRoleContainer() {
		RoleContainerImpl roleContainer = new RoleContainerImpl();
		return roleContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quality createQuality() {
		QualityImpl quality = new QualityImpl();
		return quality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goal createGoal() {
		GoalImpl goal = new GoalImpl();
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource createResource() {
		ResourceImpl resource = new ResourceImpl();
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IstarDiagram createIstarDiagram() {
		IstarDiagramImpl istarDiagram = new IstarDiagramImpl();
		return istarDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramContainer createDiagramContainer() {
		DiagramContainerImpl diagramContainer = new DiagramContainerImpl();
		return diagramContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleNode createRoleNode() {
		RoleNodeImpl roleNode = new RoleNodeImpl();
		return roleNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgentNode createAgentNode() {
		AgentNodeImpl agentNode = new AgentNodeImpl();
		return agentNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActorReal createActorReal() {
		ActorRealImpl actorReal = new ActorRealImpl();
		return actorReal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActorNode createActorNode() {
		ActorNodeImpl actorNode = new ActorNodeImpl();
		return actorNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActorContainerImp createActorContainerImp() {
		ActorContainerImpImpl actorContainerImp = new ActorContainerImpImpl();
		return actorContainerImp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element createElement() {
		ElementImpl element = new ElementImpl();
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IstarmodelPackage getIstarmodelPackage() {
		return (IstarmodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IstarmodelPackage getPackage() {
		return IstarmodelPackage.eINSTANCE;
	}

} //IstarmodelFactoryImpl
