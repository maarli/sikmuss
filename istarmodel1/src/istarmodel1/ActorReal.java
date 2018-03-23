/**
 */
package istarmodel1;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor Real</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link istarmodel1.ActorReal#getName <em>Name</em>}</li>
 *   <li>{@link istarmodel1.ActorReal#getParticipatesin <em>Participatesin</em>}</li>
 * </ul>
 *
 * @see istarmodel1.IstarmodelPackage#getActorReal()
 * @model
 * @generated
 */
public interface ActorReal extends Element {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see istarmodel1.IstarmodelPackage#getActorReal_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link istarmodel1.ActorReal#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Participatesin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participatesin</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participatesin</em>' reference.
	 * @see #setParticipatesin(ActorReal)
	 * @see istarmodel1.IstarmodelPackage#getActorReal_Participatesin()
	 * @model
	 * @generated
	 */
	ActorReal getParticipatesin();

	/**
	 * Sets the value of the '{@link istarmodel1.ActorReal#getParticipatesin <em>Participatesin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Participatesin</em>' reference.
	 * @see #getParticipatesin()
	 * @generated
	 */
	void setParticipatesin(ActorReal value);

} // ActorReal
