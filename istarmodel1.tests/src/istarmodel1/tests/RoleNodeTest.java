/**
 */
package istarmodel1.tests;

import istarmodel1.IstarmodelFactory;
import istarmodel1.RoleNode;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Role Node</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RoleNodeTest extends ActorRealTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RoleNodeTest.class);
	}

	/**
	 * Constructs a new Role Node test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleNodeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Role Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RoleNode getFixture() {
		return (RoleNode)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(IstarmodelFactory.eINSTANCE.createRoleNode());
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

} //RoleNodeTest
