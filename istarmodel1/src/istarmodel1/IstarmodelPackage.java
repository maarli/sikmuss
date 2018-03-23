/**
 */
package istarmodel1;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see istarmodel1.IstarmodelFactory
 * @model kind="package"
 * @generated
 */
public interface IstarmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "istarmodel1";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/sirius/example/istarmodel1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "istarmodel1";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IstarmodelPackage eINSTANCE = istarmodel1.impl.IstarmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link istarmodel1.impl.ActorContainerImpl <em>Actor Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istarmodel1.impl.ActorContainerImpl
	 * @see istarmodel1.impl.IstarmodelPackageImpl#getActorContainer()
	 * @generated
	 */
	int ACTOR_CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_CONTAINER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_CONTAINER__CONTAINS = 1;

	/**
	 * The feature id for the '<em><b>Has</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_CONTAINER__HAS = 2;

	/**
	 * The number of structural features of the '<em>Actor Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_CONTAINER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Actor Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link istarmodel1.impl.AgentContainerImpl <em>Agent Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istarmodel1.impl.AgentContainerImpl
	 * @see istarmodel1.impl.IstarmodelPackageImpl#getAgentContainer()
	 * @generated
	 */
	int AGENT_CONTAINER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_CONTAINER__NAME = ACTOR_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_CONTAINER__CONTAINS = ACTOR_CONTAINER__CONTAINS;

	/**
	 * The feature id for the '<em><b>Has</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_CONTAINER__HAS = ACTOR_CONTAINER__HAS;

	/**
	 * The feature id for the '<em><b>Plays</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_CONTAINER__PLAYS = ACTOR_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Agent Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_CONTAINER_FEATURE_COUNT = ACTOR_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Agent Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_CONTAINER_OPERATION_COUNT = ACTOR_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link istarmodel1.impl.RoleContainerImpl <em>Role Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istarmodel1.impl.RoleContainerImpl
	 * @see istarmodel1.impl.IstarmodelPackageImpl#getRoleContainer()
	 * @generated
	 */
	int ROLE_CONTAINER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CONTAINER__NAME = ACTOR_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CONTAINER__CONTAINS = ACTOR_CONTAINER__CONTAINS;

	/**
	 * The feature id for the '<em><b>Has</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CONTAINER__HAS = ACTOR_CONTAINER__HAS;

	/**
	 * The number of structural features of the '<em>Role Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CONTAINER_FEATURE_COUNT = ACTOR_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Role Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CONTAINER_OPERATION_COUNT = ACTOR_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link istarmodel1.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istarmodel1.impl.ElementImpl
	 * @see istarmodel1.impl.IstarmodelPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 17;

	/**
	 * The feature id for the '<em><b>Depend</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__DEPEND = 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link istarmodel1.impl.IntentionalElementImpl <em>Intentional Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istarmodel1.impl.IntentionalElementImpl
	 * @see istarmodel1.impl.IstarmodelPackageImpl#getIntentionalElement()
	 * @generated
	 */
	int INTENTIONAL_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Depend</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTIONAL_ELEMENT__DEPEND = ELEMENT__DEPEND;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTIONAL_ELEMENT__NAME = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contributes To Help</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTIONAL_ELEMENT__CONTRIBUTES_TO_HELP = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Contributes To Hurt</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTIONAL_ELEMENT__CONTRIBUTES_TO_HURT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Contributes To Break</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTIONAL_ELEMENT__CONTRIBUTES_TO_BREAK = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Contributes To Make</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTIONAL_ELEMENT__CONTRIBUTES_TO_MAKE = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Intentional Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTIONAL_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Intentional Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTIONAL_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link istarmodel1.impl.GoalTaskElementImpl <em>Goal Task Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istarmodel1.impl.GoalTaskElementImpl
	 * @see istarmodel1.impl.IstarmodelPackageImpl#getGoalTaskElement()
	 * @generated
	 */
	int GOAL_TASK_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Depend</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_TASK_ELEMENT__DEPEND = INTENTIONAL_ELEMENT__DEPEND;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_TASK_ELEMENT__NAME = INTENTIONAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Contributes To Help</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_TASK_ELEMENT__CONTRIBUTES_TO_HELP = INTENTIONAL_ELEMENT__CONTRIBUTES_TO_HELP;

	/**
	 * The feature id for the '<em><b>Contributes To Hurt</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_TASK_ELEMENT__CONTRIBUTES_TO_HURT = INTENTIONAL_ELEMENT__CONTRIBUTES_TO_HURT;

	/**
	 * The feature id for the '<em><b>Contributes To Break</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_TASK_ELEMENT__CONTRIBUTES_TO_BREAK = INTENTIONAL_ELEMENT__CONTRIBUTES_TO_BREAK;

	/**
	 * The feature id for the '<em><b>Contributes To Make</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_TASK_ELEMENT__CONTRIBUTES_TO_MAKE = INTENTIONAL_ELEMENT__CONTRIBUTES_TO_MAKE;

	/**
	 * The feature id for the '<em><b>And Refinement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_TASK_ELEMENT__AND_REFINEMENT = INTENTIONAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Or Refinement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_TASK_ELEMENT__OR_REFINEMENT = INTENTIONAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Goal Task Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_TASK_ELEMENT_FEATURE_COUNT = INTENTIONAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Goal Task Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_TASK_ELEMENT_OPERATION_COUNT = INTENTIONAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link istarmodel1.impl.QualityImpl <em>Quality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istarmodel1.impl.QualityImpl
	 * @see istarmodel1.impl.IstarmodelPackageImpl#getQuality()
	 * @generated
	 */
	int QUALITY = 5;

	/**
	 * The feature id for the '<em><b>Depend</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY__DEPEND = INTENTIONAL_ELEMENT__DEPEND;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY__NAME = INTENTIONAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Contributes To Help</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY__CONTRIBUTES_TO_HELP = INTENTIONAL_ELEMENT__CONTRIBUTES_TO_HELP;

	/**
	 * The feature id for the '<em><b>Contributes To Hurt</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY__CONTRIBUTES_TO_HURT = INTENTIONAL_ELEMENT__CONTRIBUTES_TO_HURT;

	/**
	 * The feature id for the '<em><b>Contributes To Break</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY__CONTRIBUTES_TO_BREAK = INTENTIONAL_ELEMENT__CONTRIBUTES_TO_BREAK;

	/**
	 * The feature id for the '<em><b>Contributes To Make</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY__CONTRIBUTES_TO_MAKE = INTENTIONAL_ELEMENT__CONTRIBUTES_TO_MAKE;

	/**
	 * The feature id for the '<em><b>Qualifies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY__QUALIFIES = INTENTIONAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Quality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_FEATURE_COUNT = INTENTIONAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Quality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_OPERATION_COUNT = INTENTIONAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link istarmodel1.impl.ResourceElementImpl <em>Resource Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istarmodel1.impl.ResourceElementImpl
	 * @see istarmodel1.impl.IstarmodelPackageImpl#getResourceElement()
	 * @generated
	 */
	int RESOURCE_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Depend</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ELEMENT__DEPEND = INTENTIONAL_ELEMENT__DEPEND;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ELEMENT__NAME = INTENTIONAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Contributes To Help</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ELEMENT__CONTRIBUTES_TO_HELP = INTENTIONAL_ELEMENT__CONTRIBUTES_TO_HELP;

	/**
	 * The feature id for the '<em><b>Contributes To Hurt</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ELEMENT__CONTRIBUTES_TO_HURT = INTENTIONAL_ELEMENT__CONTRIBUTES_TO_HURT;

	/**
	 * The feature id for the '<em><b>Contributes To Break</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ELEMENT__CONTRIBUTES_TO_BREAK = INTENTIONAL_ELEMENT__CONTRIBUTES_TO_BREAK;

	/**
	 * The feature id for the '<em><b>Contributes To Make</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ELEMENT__CONTRIBUTES_TO_MAKE = INTENTIONAL_ELEMENT__CONTRIBUTES_TO_MAKE;

	/**
	 * The feature id for the '<em><b>Needed By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ELEMENT__NEEDED_BY = INTENTIONAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resource Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ELEMENT_FEATURE_COUNT = INTENTIONAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Resource Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ELEMENT_OPERATION_COUNT = INTENTIONAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link istarmodel1.impl.GoalImpl <em>Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istarmodel1.impl.GoalImpl
	 * @see istarmodel1.impl.IstarmodelPackageImpl#getGoal()
	 * @generated
	 */
	int GOAL = 7;

	/**
	 * The feature id for the '<em><b>Depend</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__DEPEND = GOAL_TASK_ELEMENT__DEPEND;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__NAME = GOAL_TASK_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Contributes To Help</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__CONTRIBUTES_TO_HELP = GOAL_TASK_ELEMENT__CONTRIBUTES_TO_HELP;

	/**
	 * The feature id for the '<em><b>Contributes To Hurt</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__CONTRIBUTES_TO_HURT = GOAL_TASK_ELEMENT__CONTRIBUTES_TO_HURT;

	/**
	 * The feature id for the '<em><b>Contributes To Break</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__CONTRIBUTES_TO_BREAK = GOAL_TASK_ELEMENT__CONTRIBUTES_TO_BREAK;

	/**
	 * The feature id for the '<em><b>Contributes To Make</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__CONTRIBUTES_TO_MAKE = GOAL_TASK_ELEMENT__CONTRIBUTES_TO_MAKE;

	/**
	 * The feature id for the '<em><b>And Refinement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__AND_REFINEMENT = GOAL_TASK_ELEMENT__AND_REFINEMENT;

	/**
	 * The feature id for the '<em><b>Or Refinement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__OR_REFINEMENT = GOAL_TASK_ELEMENT__OR_REFINEMENT;

	/**
	 * The number of structural features of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_FEATURE_COUNT = GOAL_TASK_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_OPERATION_COUNT = GOAL_TASK_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link istarmodel1.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istarmodel1.impl.TaskImpl
	 * @see istarmodel1.impl.IstarmodelPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 8;

	/**
	 * The feature id for the '<em><b>Depend</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DEPEND = GOAL_TASK_ELEMENT__DEPEND;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = GOAL_TASK_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Contributes To Help</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__CONTRIBUTES_TO_HELP = GOAL_TASK_ELEMENT__CONTRIBUTES_TO_HELP;

	/**
	 * The feature id for the '<em><b>Contributes To Hurt</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__CONTRIBUTES_TO_HURT = GOAL_TASK_ELEMENT__CONTRIBUTES_TO_HURT;

	/**
	 * The feature id for the '<em><b>Contributes To Break</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__CONTRIBUTES_TO_BREAK = GOAL_TASK_ELEMENT__CONTRIBUTES_TO_BREAK;

	/**
	 * The feature id for the '<em><b>Contributes To Make</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__CONTRIBUTES_TO_MAKE = GOAL_TASK_ELEMENT__CONTRIBUTES_TO_MAKE;

	/**
	 * The feature id for the '<em><b>And Refinement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__AND_REFINEMENT = GOAL_TASK_ELEMENT__AND_REFINEMENT;

	/**
	 * The feature id for the '<em><b>Or Refinement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__OR_REFINEMENT = GOAL_TASK_ELEMENT__OR_REFINEMENT;

	/**
	 * The feature id for the '<em><b>Provides</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PROVIDES = GOAL_TASK_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = GOAL_TASK_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = GOAL_TASK_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link istarmodel1.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istarmodel1.impl.ResourceImpl
	 * @see istarmodel1.impl.IstarmodelPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 9;

	/**
	 * The feature id for the '<em><b>Depend</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__DEPEND = RESOURCE_ELEMENT__DEPEND;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NAME = RESOURCE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Contributes To Help</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__CONTRIBUTES_TO_HELP = RESOURCE_ELEMENT__CONTRIBUTES_TO_HELP;

	/**
	 * The feature id for the '<em><b>Contributes To Hurt</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__CONTRIBUTES_TO_HURT = RESOURCE_ELEMENT__CONTRIBUTES_TO_HURT;

	/**
	 * The feature id for the '<em><b>Contributes To Break</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__CONTRIBUTES_TO_BREAK = RESOURCE_ELEMENT__CONTRIBUTES_TO_BREAK;

	/**
	 * The feature id for the '<em><b>Contributes To Make</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__CONTRIBUTES_TO_MAKE = RESOURCE_ELEMENT__CONTRIBUTES_TO_MAKE;

	/**
	 * The feature id for the '<em><b>Needed By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NEEDED_BY = RESOURCE_ELEMENT__NEEDED_BY;

	/**
	 * The feature id for the '<em><b>Diagram Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__DIAGRAM_LINK = RESOURCE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = RESOURCE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = RESOURCE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link istarmodel1.impl.IstarDiagramImpl <em>Istar Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istarmodel1.impl.IstarDiagramImpl
	 * @see istarmodel1.impl.IstarmodelPackageImpl#getIstarDiagram()
	 * @generated
	 */
	int ISTAR_DIAGRAM = 10;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAR_DIAGRAM__ACTORS = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAR_DIAGRAM__ELEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAR_DIAGRAM__NAME = 2;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAR_DIAGRAM__NODES = 3;

	/**
	 * The number of structural features of the '<em>Istar Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAR_DIAGRAM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Istar Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAR_DIAGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link istarmodel1.impl.DiagramContainerImpl <em>Diagram Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istarmodel1.impl.DiagramContainerImpl
	 * @see istarmodel1.impl.IstarmodelPackageImpl#getDiagramContainer()
	 * @generated
	 */
	int DIAGRAM_CONTAINER = 11;

	/**
	 * The feature id for the '<em><b>Diagrams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_CONTAINER__DIAGRAMS = 0;

	/**
	 * The number of structural features of the '<em>Diagram Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Diagram Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link istarmodel1.impl.ActorRealImpl <em>Actor Real</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istarmodel1.impl.ActorRealImpl
	 * @see istarmodel1.impl.IstarmodelPackageImpl#getActorReal()
	 * @generated
	 */
	int ACTOR_REAL = 14;

	/**
	 * The feature id for the '<em><b>Depend</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_REAL__DEPEND = ELEMENT__DEPEND;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_REAL__NAME = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Participatesin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_REAL__PARTICIPATESIN = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Actor Real</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_REAL_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Actor Real</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_REAL_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link istarmodel1.impl.RoleNodeImpl <em>Role Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istarmodel1.impl.RoleNodeImpl
	 * @see istarmodel1.impl.IstarmodelPackageImpl#getRoleNode()
	 * @generated
	 */
	int ROLE_NODE = 12;

	/**
	 * The feature id for the '<em><b>Depend</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_NODE__DEPEND = ACTOR_REAL__DEPEND;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_NODE__NAME = ACTOR_REAL__NAME;

	/**
	 * The feature id for the '<em><b>Participatesin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_NODE__PARTICIPATESIN = ACTOR_REAL__PARTICIPATESIN;

	/**
	 * The feature id for the '<em><b>Isa</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_NODE__ISA = ACTOR_REAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Role Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_NODE_FEATURE_COUNT = ACTOR_REAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Role Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_NODE_OPERATION_COUNT = ACTOR_REAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link istarmodel1.impl.AgentNodeImpl <em>Agent Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istarmodel1.impl.AgentNodeImpl
	 * @see istarmodel1.impl.IstarmodelPackageImpl#getAgentNode()
	 * @generated
	 */
	int AGENT_NODE = 13;

	/**
	 * The feature id for the '<em><b>Depend</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_NODE__DEPEND = ACTOR_REAL__DEPEND;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_NODE__NAME = ACTOR_REAL__NAME;

	/**
	 * The feature id for the '<em><b>Participatesin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_NODE__PARTICIPATESIN = ACTOR_REAL__PARTICIPATESIN;

	/**
	 * The number of structural features of the '<em>Agent Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_NODE_FEATURE_COUNT = ACTOR_REAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Agent Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_NODE_OPERATION_COUNT = ACTOR_REAL_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link istarmodel1.impl.ActorNodeImpl <em>Actor Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istarmodel1.impl.ActorNodeImpl
	 * @see istarmodel1.impl.IstarmodelPackageImpl#getActorNode()
	 * @generated
	 */
	int ACTOR_NODE = 15;

	/**
	 * The feature id for the '<em><b>Depend</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_NODE__DEPEND = ACTOR_REAL__DEPEND;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_NODE__NAME = ACTOR_REAL__NAME;

	/**
	 * The feature id for the '<em><b>Participatesin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_NODE__PARTICIPATESIN = ACTOR_REAL__PARTICIPATESIN;

	/**
	 * The number of structural features of the '<em>Actor Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_NODE_FEATURE_COUNT = ACTOR_REAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Actor Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_NODE_OPERATION_COUNT = ACTOR_REAL_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link istarmodel1.impl.ActorContainerImpImpl <em>Actor Container Imp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istarmodel1.impl.ActorContainerImpImpl
	 * @see istarmodel1.impl.IstarmodelPackageImpl#getActorContainerImp()
	 * @generated
	 */
	int ACTOR_CONTAINER_IMP = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_CONTAINER_IMP__NAME = ACTOR_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_CONTAINER_IMP__CONTAINS = ACTOR_CONTAINER__CONTAINS;

	/**
	 * The feature id for the '<em><b>Has</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_CONTAINER_IMP__HAS = ACTOR_CONTAINER__HAS;

	/**
	 * The number of structural features of the '<em>Actor Container Imp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_CONTAINER_IMP_FEATURE_COUNT = ACTOR_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Actor Container Imp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_CONTAINER_IMP_OPERATION_COUNT = ACTOR_CONTAINER_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link istarmodel1.ActorContainer <em>Actor Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor Container</em>'.
	 * @see istarmodel1.ActorContainer
	 * @generated
	 */
	EClass getActorContainer();

	/**
	 * Returns the meta object for the attribute '{@link istarmodel1.ActorContainer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see istarmodel1.ActorContainer#getName()
	 * @see #getActorContainer()
	 * @generated
	 */
	EAttribute getActorContainer_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link istarmodel1.ActorContainer#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains</em>'.
	 * @see istarmodel1.ActorContainer#getContains()
	 * @see #getActorContainer()
	 * @generated
	 */
	EReference getActorContainer_Contains();

	/**
	 * Returns the meta object for the containment reference '{@link istarmodel1.ActorContainer#getHas <em>Has</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has</em>'.
	 * @see istarmodel1.ActorContainer#getHas()
	 * @see #getActorContainer()
	 * @generated
	 */
	EReference getActorContainer_Has();

	/**
	 * Returns the meta object for class '{@link istarmodel1.AgentContainer <em>Agent Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agent Container</em>'.
	 * @see istarmodel1.AgentContainer
	 * @generated
	 */
	EClass getAgentContainer();

	/**
	 * Returns the meta object for the reference list '{@link istarmodel1.AgentContainer#getPlays <em>Plays</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Plays</em>'.
	 * @see istarmodel1.AgentContainer#getPlays()
	 * @see #getAgentContainer()
	 * @generated
	 */
	EReference getAgentContainer_Plays();

	/**
	 * Returns the meta object for class '{@link istarmodel1.RoleContainer <em>Role Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Container</em>'.
	 * @see istarmodel1.RoleContainer
	 * @generated
	 */
	EClass getRoleContainer();

	/**
	 * Returns the meta object for class '{@link istarmodel1.IntentionalElement <em>Intentional Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intentional Element</em>'.
	 * @see istarmodel1.IntentionalElement
	 * @generated
	 */
	EClass getIntentionalElement();

	/**
	 * Returns the meta object for the attribute '{@link istarmodel1.IntentionalElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see istarmodel1.IntentionalElement#getName()
	 * @see #getIntentionalElement()
	 * @generated
	 */
	EAttribute getIntentionalElement_Name();

	/**
	 * Returns the meta object for the reference list '{@link istarmodel1.IntentionalElement#getContributesToHelp <em>Contributes To Help</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contributes To Help</em>'.
	 * @see istarmodel1.IntentionalElement#getContributesToHelp()
	 * @see #getIntentionalElement()
	 * @generated
	 */
	EReference getIntentionalElement_ContributesToHelp();

	/**
	 * Returns the meta object for the reference list '{@link istarmodel1.IntentionalElement#getContributesToHurt <em>Contributes To Hurt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contributes To Hurt</em>'.
	 * @see istarmodel1.IntentionalElement#getContributesToHurt()
	 * @see #getIntentionalElement()
	 * @generated
	 */
	EReference getIntentionalElement_ContributesToHurt();

	/**
	 * Returns the meta object for the reference list '{@link istarmodel1.IntentionalElement#getContributesToBreak <em>Contributes To Break</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contributes To Break</em>'.
	 * @see istarmodel1.IntentionalElement#getContributesToBreak()
	 * @see #getIntentionalElement()
	 * @generated
	 */
	EReference getIntentionalElement_ContributesToBreak();

	/**
	 * Returns the meta object for the reference list '{@link istarmodel1.IntentionalElement#getContributesToMake <em>Contributes To Make</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contributes To Make</em>'.
	 * @see istarmodel1.IntentionalElement#getContributesToMake()
	 * @see #getIntentionalElement()
	 * @generated
	 */
	EReference getIntentionalElement_ContributesToMake();

	/**
	 * Returns the meta object for class '{@link istarmodel1.GoalTaskElement <em>Goal Task Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal Task Element</em>'.
	 * @see istarmodel1.GoalTaskElement
	 * @generated
	 */
	EClass getGoalTaskElement();

	/**
	 * Returns the meta object for the reference list '{@link istarmodel1.GoalTaskElement#getAndRefinement <em>And Refinement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>And Refinement</em>'.
	 * @see istarmodel1.GoalTaskElement#getAndRefinement()
	 * @see #getGoalTaskElement()
	 * @generated
	 */
	EReference getGoalTaskElement_AndRefinement();

	/**
	 * Returns the meta object for the reference list '{@link istarmodel1.GoalTaskElement#getOrRefinement <em>Or Refinement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Or Refinement</em>'.
	 * @see istarmodel1.GoalTaskElement#getOrRefinement()
	 * @see #getGoalTaskElement()
	 * @generated
	 */
	EReference getGoalTaskElement_OrRefinement();

	/**
	 * Returns the meta object for class '{@link istarmodel1.Quality <em>Quality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quality</em>'.
	 * @see istarmodel1.Quality
	 * @generated
	 */
	EClass getQuality();

	/**
	 * Returns the meta object for the reference list '{@link istarmodel1.Quality#getQualifies <em>Qualifies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Qualifies</em>'.
	 * @see istarmodel1.Quality#getQualifies()
	 * @see #getQuality()
	 * @generated
	 */
	EReference getQuality_Qualifies();

	/**
	 * Returns the meta object for class '{@link istarmodel1.ResourceElement <em>Resource Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Element</em>'.
	 * @see istarmodel1.ResourceElement
	 * @generated
	 */
	EClass getResourceElement();

	/**
	 * Returns the meta object for the reference list '{@link istarmodel1.ResourceElement#getNeededBy <em>Needed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Needed By</em>'.
	 * @see istarmodel1.ResourceElement#getNeededBy()
	 * @see #getResourceElement()
	 * @generated
	 */
	EReference getResourceElement_NeededBy();

	/**
	 * Returns the meta object for class '{@link istarmodel1.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal</em>'.
	 * @see istarmodel1.Goal
	 * @generated
	 */
	EClass getGoal();

	/**
	 * Returns the meta object for class '{@link istarmodel1.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see istarmodel1.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the reference list '{@link istarmodel1.Task#getProvides <em>Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Provides</em>'.
	 * @see istarmodel1.Task#getProvides()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Provides();

	/**
	 * Returns the meta object for class '{@link istarmodel1.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see istarmodel1.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the reference '{@link istarmodel1.Resource#getDiagramLink <em>Diagram Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Diagram Link</em>'.
	 * @see istarmodel1.Resource#getDiagramLink()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_DiagramLink();

	/**
	 * Returns the meta object for class '{@link istarmodel1.IstarDiagram <em>Istar Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Istar Diagram</em>'.
	 * @see istarmodel1.IstarDiagram
	 * @generated
	 */
	EClass getIstarDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link istarmodel1.IstarDiagram#getActors <em>Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actors</em>'.
	 * @see istarmodel1.IstarDiagram#getActors()
	 * @see #getIstarDiagram()
	 * @generated
	 */
	EReference getIstarDiagram_Actors();

	/**
	 * Returns the meta object for the containment reference list '{@link istarmodel1.IstarDiagram#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see istarmodel1.IstarDiagram#getElements()
	 * @see #getIstarDiagram()
	 * @generated
	 */
	EReference getIstarDiagram_Elements();

	/**
	 * Returns the meta object for the attribute '{@link istarmodel1.IstarDiagram#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see istarmodel1.IstarDiagram#getName()
	 * @see #getIstarDiagram()
	 * @generated
	 */
	EAttribute getIstarDiagram_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link istarmodel1.IstarDiagram#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see istarmodel1.IstarDiagram#getNodes()
	 * @see #getIstarDiagram()
	 * @generated
	 */
	EReference getIstarDiagram_Nodes();

	/**
	 * Returns the meta object for class '{@link istarmodel1.DiagramContainer <em>Diagram Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Container</em>'.
	 * @see istarmodel1.DiagramContainer
	 * @generated
	 */
	EClass getDiagramContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link istarmodel1.DiagramContainer#getDiagrams <em>Diagrams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diagrams</em>'.
	 * @see istarmodel1.DiagramContainer#getDiagrams()
	 * @see #getDiagramContainer()
	 * @generated
	 */
	EReference getDiagramContainer_Diagrams();

	/**
	 * Returns the meta object for class '{@link istarmodel1.RoleNode <em>Role Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Node</em>'.
	 * @see istarmodel1.RoleNode
	 * @generated
	 */
	EClass getRoleNode();

	/**
	 * Returns the meta object for the reference '{@link istarmodel1.RoleNode#getIsa <em>Isa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Isa</em>'.
	 * @see istarmodel1.RoleNode#getIsa()
	 * @see #getRoleNode()
	 * @generated
	 */
	EReference getRoleNode_Isa();

	/**
	 * Returns the meta object for class '{@link istarmodel1.AgentNode <em>Agent Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agent Node</em>'.
	 * @see istarmodel1.AgentNode
	 * @generated
	 */
	EClass getAgentNode();

	/**
	 * Returns the meta object for class '{@link istarmodel1.ActorReal <em>Actor Real</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor Real</em>'.
	 * @see istarmodel1.ActorReal
	 * @generated
	 */
	EClass getActorReal();

	/**
	 * Returns the meta object for the attribute '{@link istarmodel1.ActorReal#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see istarmodel1.ActorReal#getName()
	 * @see #getActorReal()
	 * @generated
	 */
	EAttribute getActorReal_Name();

	/**
	 * Returns the meta object for the reference '{@link istarmodel1.ActorReal#getParticipatesin <em>Participatesin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Participatesin</em>'.
	 * @see istarmodel1.ActorReal#getParticipatesin()
	 * @see #getActorReal()
	 * @generated
	 */
	EReference getActorReal_Participatesin();

	/**
	 * Returns the meta object for class '{@link istarmodel1.ActorNode <em>Actor Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor Node</em>'.
	 * @see istarmodel1.ActorNode
	 * @generated
	 */
	EClass getActorNode();

	/**
	 * Returns the meta object for class '{@link istarmodel1.ActorContainerImp <em>Actor Container Imp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor Container Imp</em>'.
	 * @see istarmodel1.ActorContainerImp
	 * @generated
	 */
	EClass getActorContainerImp();

	/**
	 * Returns the meta object for class '{@link istarmodel1.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see istarmodel1.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the reference list '{@link istarmodel1.Element#getDepend <em>Depend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Depend</em>'.
	 * @see istarmodel1.Element#getDepend()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Depend();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IstarmodelFactory getIstarmodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link istarmodel1.impl.ActorContainerImpl <em>Actor Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see istarmodel1.impl.ActorContainerImpl
		 * @see istarmodel1.impl.IstarmodelPackageImpl#getActorContainer()
		 * @generated
		 */
		EClass ACTOR_CONTAINER = eINSTANCE.getActorContainer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR_CONTAINER__NAME = eINSTANCE.getActorContainer_Name();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR_CONTAINER__CONTAINS = eINSTANCE.getActorContainer_Contains();

		/**
		 * The meta object literal for the '<em><b>Has</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR_CONTAINER__HAS = eINSTANCE.getActorContainer_Has();

		/**
		 * The meta object literal for the '{@link istarmodel1.impl.AgentContainerImpl <em>Agent Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see istarmodel1.impl.AgentContainerImpl
		 * @see istarmodel1.impl.IstarmodelPackageImpl#getAgentContainer()
		 * @generated
		 */
		EClass AGENT_CONTAINER = eINSTANCE.getAgentContainer();

		/**
		 * The meta object literal for the '<em><b>Plays</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT_CONTAINER__PLAYS = eINSTANCE.getAgentContainer_Plays();

		/**
		 * The meta object literal for the '{@link istarmodel1.impl.RoleContainerImpl <em>Role Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see istarmodel1.impl.RoleContainerImpl
		 * @see istarmodel1.impl.IstarmodelPackageImpl#getRoleContainer()
		 * @generated
		 */
		EClass ROLE_CONTAINER = eINSTANCE.getRoleContainer();

		/**
		 * The meta object literal for the '{@link istarmodel1.impl.IntentionalElementImpl <em>Intentional Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see istarmodel1.impl.IntentionalElementImpl
		 * @see istarmodel1.impl.IstarmodelPackageImpl#getIntentionalElement()
		 * @generated
		 */
		EClass INTENTIONAL_ELEMENT = eINSTANCE.getIntentionalElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTENTIONAL_ELEMENT__NAME = eINSTANCE.getIntentionalElement_Name();

		/**
		 * The meta object literal for the '<em><b>Contributes To Help</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTENTIONAL_ELEMENT__CONTRIBUTES_TO_HELP = eINSTANCE.getIntentionalElement_ContributesToHelp();

		/**
		 * The meta object literal for the '<em><b>Contributes To Hurt</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTENTIONAL_ELEMENT__CONTRIBUTES_TO_HURT = eINSTANCE.getIntentionalElement_ContributesToHurt();

		/**
		 * The meta object literal for the '<em><b>Contributes To Break</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTENTIONAL_ELEMENT__CONTRIBUTES_TO_BREAK = eINSTANCE.getIntentionalElement_ContributesToBreak();

		/**
		 * The meta object literal for the '<em><b>Contributes To Make</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTENTIONAL_ELEMENT__CONTRIBUTES_TO_MAKE = eINSTANCE.getIntentionalElement_ContributesToMake();

		/**
		 * The meta object literal for the '{@link istarmodel1.impl.GoalTaskElementImpl <em>Goal Task Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see istarmodel1.impl.GoalTaskElementImpl
		 * @see istarmodel1.impl.IstarmodelPackageImpl#getGoalTaskElement()
		 * @generated
		 */
		EClass GOAL_TASK_ELEMENT = eINSTANCE.getGoalTaskElement();

		/**
		 * The meta object literal for the '<em><b>And Refinement</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL_TASK_ELEMENT__AND_REFINEMENT = eINSTANCE.getGoalTaskElement_AndRefinement();

		/**
		 * The meta object literal for the '<em><b>Or Refinement</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL_TASK_ELEMENT__OR_REFINEMENT = eINSTANCE.getGoalTaskElement_OrRefinement();

		/**
		 * The meta object literal for the '{@link istarmodel1.impl.QualityImpl <em>Quality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see istarmodel1.impl.QualityImpl
		 * @see istarmodel1.impl.IstarmodelPackageImpl#getQuality()
		 * @generated
		 */
		EClass QUALITY = eINSTANCE.getQuality();

		/**
		 * The meta object literal for the '<em><b>Qualifies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALITY__QUALIFIES = eINSTANCE.getQuality_Qualifies();

		/**
		 * The meta object literal for the '{@link istarmodel1.impl.ResourceElementImpl <em>Resource Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see istarmodel1.impl.ResourceElementImpl
		 * @see istarmodel1.impl.IstarmodelPackageImpl#getResourceElement()
		 * @generated
		 */
		EClass RESOURCE_ELEMENT = eINSTANCE.getResourceElement();

		/**
		 * The meta object literal for the '<em><b>Needed By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_ELEMENT__NEEDED_BY = eINSTANCE.getResourceElement_NeededBy();

		/**
		 * The meta object literal for the '{@link istarmodel1.impl.GoalImpl <em>Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see istarmodel1.impl.GoalImpl
		 * @see istarmodel1.impl.IstarmodelPackageImpl#getGoal()
		 * @generated
		 */
		EClass GOAL = eINSTANCE.getGoal();

		/**
		 * The meta object literal for the '{@link istarmodel1.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see istarmodel1.impl.TaskImpl
		 * @see istarmodel1.impl.IstarmodelPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Provides</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__PROVIDES = eINSTANCE.getTask_Provides();

		/**
		 * The meta object literal for the '{@link istarmodel1.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see istarmodel1.impl.ResourceImpl
		 * @see istarmodel1.impl.IstarmodelPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Diagram Link</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__DIAGRAM_LINK = eINSTANCE.getResource_DiagramLink();

		/**
		 * The meta object literal for the '{@link istarmodel1.impl.IstarDiagramImpl <em>Istar Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see istarmodel1.impl.IstarDiagramImpl
		 * @see istarmodel1.impl.IstarmodelPackageImpl#getIstarDiagram()
		 * @generated
		 */
		EClass ISTAR_DIAGRAM = eINSTANCE.getIstarDiagram();

		/**
		 * The meta object literal for the '<em><b>Actors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISTAR_DIAGRAM__ACTORS = eINSTANCE.getIstarDiagram_Actors();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISTAR_DIAGRAM__ELEMENTS = eINSTANCE.getIstarDiagram_Elements();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISTAR_DIAGRAM__NAME = eINSTANCE.getIstarDiagram_Name();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISTAR_DIAGRAM__NODES = eINSTANCE.getIstarDiagram_Nodes();

		/**
		 * The meta object literal for the '{@link istarmodel1.impl.DiagramContainerImpl <em>Diagram Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see istarmodel1.impl.DiagramContainerImpl
		 * @see istarmodel1.impl.IstarmodelPackageImpl#getDiagramContainer()
		 * @generated
		 */
		EClass DIAGRAM_CONTAINER = eINSTANCE.getDiagramContainer();

		/**
		 * The meta object literal for the '<em><b>Diagrams</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_CONTAINER__DIAGRAMS = eINSTANCE.getDiagramContainer_Diagrams();

		/**
		 * The meta object literal for the '{@link istarmodel1.impl.RoleNodeImpl <em>Role Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see istarmodel1.impl.RoleNodeImpl
		 * @see istarmodel1.impl.IstarmodelPackageImpl#getRoleNode()
		 * @generated
		 */
		EClass ROLE_NODE = eINSTANCE.getRoleNode();

		/**
		 * The meta object literal for the '<em><b>Isa</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_NODE__ISA = eINSTANCE.getRoleNode_Isa();

		/**
		 * The meta object literal for the '{@link istarmodel1.impl.AgentNodeImpl <em>Agent Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see istarmodel1.impl.AgentNodeImpl
		 * @see istarmodel1.impl.IstarmodelPackageImpl#getAgentNode()
		 * @generated
		 */
		EClass AGENT_NODE = eINSTANCE.getAgentNode();

		/**
		 * The meta object literal for the '{@link istarmodel1.impl.ActorRealImpl <em>Actor Real</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see istarmodel1.impl.ActorRealImpl
		 * @see istarmodel1.impl.IstarmodelPackageImpl#getActorReal()
		 * @generated
		 */
		EClass ACTOR_REAL = eINSTANCE.getActorReal();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR_REAL__NAME = eINSTANCE.getActorReal_Name();

		/**
		 * The meta object literal for the '<em><b>Participatesin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR_REAL__PARTICIPATESIN = eINSTANCE.getActorReal_Participatesin();

		/**
		 * The meta object literal for the '{@link istarmodel1.impl.ActorNodeImpl <em>Actor Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see istarmodel1.impl.ActorNodeImpl
		 * @see istarmodel1.impl.IstarmodelPackageImpl#getActorNode()
		 * @generated
		 */
		EClass ACTOR_NODE = eINSTANCE.getActorNode();

		/**
		 * The meta object literal for the '{@link istarmodel1.impl.ActorContainerImpImpl <em>Actor Container Imp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see istarmodel1.impl.ActorContainerImpImpl
		 * @see istarmodel1.impl.IstarmodelPackageImpl#getActorContainerImp()
		 * @generated
		 */
		EClass ACTOR_CONTAINER_IMP = eINSTANCE.getActorContainerImp();

		/**
		 * The meta object literal for the '{@link istarmodel1.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see istarmodel1.impl.ElementImpl
		 * @see istarmodel1.impl.IstarmodelPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Depend</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__DEPEND = eINSTANCE.getElement_Depend();

	}

} //IstarmodelPackage
