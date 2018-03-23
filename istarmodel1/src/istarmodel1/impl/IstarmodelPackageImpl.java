/**
 */
package istarmodel1.impl;

import istarmodel1.ActorContainer;
import istarmodel1.ActorContainerImp;
import istarmodel1.ActorNode;
import istarmodel1.ActorReal;
import istarmodel1.AgentContainer;
import istarmodel1.AgentNode;
import istarmodel1.DiagramContainer;
import istarmodel1.Element;
import istarmodel1.Goal;
import istarmodel1.GoalTaskElement;
import istarmodel1.IntentionalElement;
import istarmodel1.IstarDiagram;
import istarmodel1.IstarmodelFactory;
import istarmodel1.IstarmodelPackage;
import istarmodel1.Quality;
import istarmodel1.Resource;
import istarmodel1.ResourceElement;
import istarmodel1.RoleContainer;
import istarmodel1.RoleNode;
import istarmodel1.Task;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IstarmodelPackageImpl extends EPackageImpl implements IstarmodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agentContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intentionalElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goalTaskElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass istarDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagramContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agentNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorRealEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorContainerImpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see istarmodel1.IstarmodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IstarmodelPackageImpl() {
		super(eNS_URI, IstarmodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link IstarmodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IstarmodelPackage init() {
		if (isInited) return (IstarmodelPackage)EPackage.Registry.INSTANCE.getEPackage(IstarmodelPackage.eNS_URI);

		// Obtain or create and register package
		IstarmodelPackageImpl theIstarmodelPackage = (IstarmodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IstarmodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new IstarmodelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theIstarmodelPackage.createPackageContents();

		// Initialize created meta-data
		theIstarmodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIstarmodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IstarmodelPackage.eNS_URI, theIstarmodelPackage);
		return theIstarmodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActorContainer() {
		return actorContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActorContainer_Name() {
		return (EAttribute)actorContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActorContainer_Contains() {
		return (EReference)actorContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActorContainer_Has() {
		return (EReference)actorContainerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAgentContainer() {
		return agentContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgentContainer_Plays() {
		return (EReference)agentContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleContainer() {
		return roleContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntentionalElement() {
		return intentionalElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntentionalElement_Name() {
		return (EAttribute)intentionalElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntentionalElement_ContributesToHelp() {
		return (EReference)intentionalElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntentionalElement_ContributesToHurt() {
		return (EReference)intentionalElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntentionalElement_ContributesToBreak() {
		return (EReference)intentionalElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntentionalElement_ContributesToMake() {
		return (EReference)intentionalElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGoalTaskElement() {
		return goalTaskElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoalTaskElement_AndRefinement() {
		return (EReference)goalTaskElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoalTaskElement_OrRefinement() {
		return (EReference)goalTaskElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuality() {
		return qualityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuality_Qualifies() {
		return (EReference)qualityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceElement() {
		return resourceElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceElement_NeededBy() {
		return (EReference)resourceElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGoal() {
		return goalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Provides() {
		return (EReference)taskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResource() {
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResource_DiagramLink() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIstarDiagram() {
		return istarDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIstarDiagram_Actors() {
		return (EReference)istarDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIstarDiagram_Elements() {
		return (EReference)istarDiagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIstarDiagram_Name() {
		return (EAttribute)istarDiagramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIstarDiagram_Nodes() {
		return (EReference)istarDiagramEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagramContainer() {
		return diagramContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagramContainer_Diagrams() {
		return (EReference)diagramContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleNode() {
		return roleNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleNode_Isa() {
		return (EReference)roleNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAgentNode() {
		return agentNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActorReal() {
		return actorRealEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActorReal_Name() {
		return (EAttribute)actorRealEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActorReal_Participatesin() {
		return (EReference)actorRealEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActorNode() {
		return actorNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActorContainerImp() {
		return actorContainerImpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_Depend() {
		return (EReference)elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IstarmodelFactory getIstarmodelFactory() {
		return (IstarmodelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		actorContainerEClass = createEClass(ACTOR_CONTAINER);
		createEAttribute(actorContainerEClass, ACTOR_CONTAINER__NAME);
		createEReference(actorContainerEClass, ACTOR_CONTAINER__CONTAINS);
		createEReference(actorContainerEClass, ACTOR_CONTAINER__HAS);

		agentContainerEClass = createEClass(AGENT_CONTAINER);
		createEReference(agentContainerEClass, AGENT_CONTAINER__PLAYS);

		roleContainerEClass = createEClass(ROLE_CONTAINER);

		intentionalElementEClass = createEClass(INTENTIONAL_ELEMENT);
		createEAttribute(intentionalElementEClass, INTENTIONAL_ELEMENT__NAME);
		createEReference(intentionalElementEClass, INTENTIONAL_ELEMENT__CONTRIBUTES_TO_HELP);
		createEReference(intentionalElementEClass, INTENTIONAL_ELEMENT__CONTRIBUTES_TO_HURT);
		createEReference(intentionalElementEClass, INTENTIONAL_ELEMENT__CONTRIBUTES_TO_BREAK);
		createEReference(intentionalElementEClass, INTENTIONAL_ELEMENT__CONTRIBUTES_TO_MAKE);

		goalTaskElementEClass = createEClass(GOAL_TASK_ELEMENT);
		createEReference(goalTaskElementEClass, GOAL_TASK_ELEMENT__AND_REFINEMENT);
		createEReference(goalTaskElementEClass, GOAL_TASK_ELEMENT__OR_REFINEMENT);

		qualityEClass = createEClass(QUALITY);
		createEReference(qualityEClass, QUALITY__QUALIFIES);

		resourceElementEClass = createEClass(RESOURCE_ELEMENT);
		createEReference(resourceElementEClass, RESOURCE_ELEMENT__NEEDED_BY);

		goalEClass = createEClass(GOAL);

		taskEClass = createEClass(TASK);
		createEReference(taskEClass, TASK__PROVIDES);

		resourceEClass = createEClass(RESOURCE);
		createEReference(resourceEClass, RESOURCE__DIAGRAM_LINK);

		istarDiagramEClass = createEClass(ISTAR_DIAGRAM);
		createEReference(istarDiagramEClass, ISTAR_DIAGRAM__ACTORS);
		createEReference(istarDiagramEClass, ISTAR_DIAGRAM__ELEMENTS);
		createEAttribute(istarDiagramEClass, ISTAR_DIAGRAM__NAME);
		createEReference(istarDiagramEClass, ISTAR_DIAGRAM__NODES);

		diagramContainerEClass = createEClass(DIAGRAM_CONTAINER);
		createEReference(diagramContainerEClass, DIAGRAM_CONTAINER__DIAGRAMS);

		roleNodeEClass = createEClass(ROLE_NODE);
		createEReference(roleNodeEClass, ROLE_NODE__ISA);

		agentNodeEClass = createEClass(AGENT_NODE);

		actorRealEClass = createEClass(ACTOR_REAL);
		createEAttribute(actorRealEClass, ACTOR_REAL__NAME);
		createEReference(actorRealEClass, ACTOR_REAL__PARTICIPATESIN);

		actorNodeEClass = createEClass(ACTOR_NODE);

		actorContainerImpEClass = createEClass(ACTOR_CONTAINER_IMP);

		elementEClass = createEClass(ELEMENT);
		createEReference(elementEClass, ELEMENT__DEPEND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		agentContainerEClass.getESuperTypes().add(this.getActorContainer());
		roleContainerEClass.getESuperTypes().add(this.getActorContainer());
		intentionalElementEClass.getESuperTypes().add(this.getElement());
		goalTaskElementEClass.getESuperTypes().add(this.getIntentionalElement());
		qualityEClass.getESuperTypes().add(this.getIntentionalElement());
		resourceElementEClass.getESuperTypes().add(this.getIntentionalElement());
		goalEClass.getESuperTypes().add(this.getGoalTaskElement());
		taskEClass.getESuperTypes().add(this.getGoalTaskElement());
		resourceEClass.getESuperTypes().add(this.getResourceElement());
		roleNodeEClass.getESuperTypes().add(this.getActorReal());
		agentNodeEClass.getESuperTypes().add(this.getActorReal());
		actorRealEClass.getESuperTypes().add(this.getElement());
		actorNodeEClass.getESuperTypes().add(this.getActorReal());
		actorContainerImpEClass.getESuperTypes().add(this.getActorContainer());

		// Initialize classes, features, and operations; add parameters
		initEClass(actorContainerEClass, ActorContainer.class, "ActorContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActorContainer_Name(), ecorePackage.getEString(), "name", null, 0, 1, ActorContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActorContainer_Contains(), this.getIntentionalElement(), null, "contains", null, 0, -1, ActorContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActorContainer_Has(), this.getActorReal(), null, "has", null, 0, 1, ActorContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(agentContainerEClass, AgentContainer.class, "AgentContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAgentContainer_Plays(), this.getRoleContainer(), null, "plays", null, 0, -1, AgentContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleContainerEClass, RoleContainer.class, "RoleContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(intentionalElementEClass, IntentionalElement.class, "IntentionalElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntentionalElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, IntentionalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntentionalElement_ContributesToHelp(), this.getQuality(), null, "contributesToHelp", null, 0, -1, IntentionalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntentionalElement_ContributesToHurt(), this.getQuality(), null, "contributesToHurt", null, 0, -1, IntentionalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntentionalElement_ContributesToBreak(), this.getQuality(), null, "contributesToBreak", null, 0, -1, IntentionalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntentionalElement_ContributesToMake(), this.getQuality(), null, "contributesToMake", null, 0, -1, IntentionalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(goalTaskElementEClass, GoalTaskElement.class, "GoalTaskElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGoalTaskElement_AndRefinement(), this.getGoalTaskElement(), null, "andRefinement", null, 0, -1, GoalTaskElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGoalTaskElement_OrRefinement(), this.getGoalTaskElement(), null, "orRefinement", null, 0, -1, GoalTaskElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qualityEClass, Quality.class, "Quality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuality_Qualifies(), this.getIntentionalElement(), null, "qualifies", null, 0, -1, Quality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceElementEClass, ResourceElement.class, "ResourceElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceElement_NeededBy(), this.getTask(), null, "neededBy", null, 0, -1, ResourceElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(goalEClass, Goal.class, "Goal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTask_Provides(), this.getResource(), null, "provides", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceEClass, Resource.class, "Resource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResource_DiagramLink(), this.getResource(), null, "diagramLink", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(istarDiagramEClass, IstarDiagram.class, "IstarDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIstarDiagram_Actors(), this.getActorContainer(), null, "actors", null, 0, -1, IstarDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIstarDiagram_Elements(), this.getIntentionalElement(), null, "elements", null, 0, -1, IstarDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIstarDiagram_Name(), ecorePackage.getEString(), "name", null, 0, 1, IstarDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIstarDiagram_Nodes(), this.getActorReal(), null, "nodes", null, 0, -1, IstarDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diagramContainerEClass, DiagramContainer.class, "DiagramContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiagramContainer_Diagrams(), this.getIstarDiagram(), null, "diagrams", null, 0, -1, DiagramContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleNodeEClass, RoleNode.class, "RoleNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoleNode_Isa(), this.getRoleNode(), null, "isa", null, 0, 1, RoleNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(agentNodeEClass, AgentNode.class, "AgentNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actorRealEClass, ActorReal.class, "ActorReal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActorReal_Name(), ecorePackage.getEString(), "name", null, 0, 1, ActorReal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActorReal_Participatesin(), this.getActorReal(), null, "participatesin", null, 0, 1, ActorReal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actorNodeEClass, ActorNode.class, "ActorNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actorContainerImpEClass, ActorContainerImp.class, "ActorContainerImp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(elementEClass, Element.class, "Element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElement_Depend(), this.getElement(), null, "depend", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //IstarmodelPackageImpl
