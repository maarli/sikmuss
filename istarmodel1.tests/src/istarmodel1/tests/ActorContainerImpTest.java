/**
 */
package istarmodel1.tests;

import istarmodel1.ActorContainerImp;
import istarmodel1.IstarmodelFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Actor Container Imp</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActorContainerImpTest extends ActorContainerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ActorContainerImpTest.class);
	}

	/**
	 * Constructs a new Actor Container Imp test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActorContainerImpTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Actor Container Imp test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ActorContainerImp getFixture() {
		return (ActorContainerImp)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(IstarmodelFactory.eINSTANCE.createActorContainerImp());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ActorContainerImpTest
