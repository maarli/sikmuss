/**
 */
package istarmodel1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link istarmodel1.Resource#getDiagramLink <em>Diagram Link</em>}</li>
 * </ul>
 *
 * @see istarmodel1.IstarmodelPackage#getResource()
 * @model
 * @generated
 */
public interface Resource extends ResourceElement {
	/**
	 * Returns the value of the '<em><b>Diagram Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram Link</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram Link</em>' reference.
	 * @see #setDiagramLink(Resource)
	 * @see istarmodel1.IstarmodelPackage#getResource_DiagramLink()
	 * @model
	 * @generated
	 */
	Resource getDiagramLink();

	/**
	 * Sets the value of the '{@link istarmodel1.Resource#getDiagramLink <em>Diagram Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram Link</em>' reference.
	 * @see #getDiagramLink()
	 * @generated
	 */
	void setDiagramLink(Resource value);

} // Resource
