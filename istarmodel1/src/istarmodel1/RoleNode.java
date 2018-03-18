/**
 */
package istarmodel1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link istarmodel1.RoleNode#getIsa <em>Isa</em>}</li>
 * </ul>
 *
 * @see istarmodel1.IstarmodelPackage#getRoleNode()
 * @model
 * @generated
 */
public interface RoleNode extends ActorReal {
	/**
	 * Returns the value of the '<em><b>Isa</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Isa</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Isa</em>' reference.
	 * @see #setIsa(RoleNode)
	 * @see istarmodel1.IstarmodelPackage#getRoleNode_Isa()
	 * @model
	 * @generated
	 */
	RoleNode getIsa();

	/**
	 * Sets the value of the '{@link istarmodel1.RoleNode#getIsa <em>Isa</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Isa</em>' reference.
	 * @see #getIsa()
	 * @generated
	 */
	void setIsa(RoleNode value);

} // RoleNode
