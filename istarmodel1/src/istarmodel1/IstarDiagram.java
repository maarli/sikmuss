/**
 */
package istarmodel1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Istar Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link istarmodel1.IstarDiagram#getActors <em>Actors</em>}</li>
 *   <li>{@link istarmodel1.IstarDiagram#getElements <em>Elements</em>}</li>
 *   <li>{@link istarmodel1.IstarDiagram#getName <em>Name</em>}</li>
 *   <li>{@link istarmodel1.IstarDiagram#getNodes <em>Nodes</em>}</li>
 * </ul>
 *
 * @see istarmodel1.IstarmodelPackage#getIstarDiagram()
 * @model
 * @generated
 */
public interface IstarDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Actors</b></em>' containment reference list.
	 * The list contents are of type {@link istarmodel1.ActorContainer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actors</em>' containment reference list.
	 * @see istarmodel1.IstarmodelPackage#getIstarDiagram_Actors()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActorContainer> getActors();

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link istarmodel1.IntentionalElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see istarmodel1.IstarmodelPackage#getIstarDiagram_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<IntentionalElement> getElements();

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
	 * @see istarmodel1.IstarmodelPackage#getIstarDiagram_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link istarmodel1.IstarDiagram#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link istarmodel1.ActorReal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see istarmodel1.IstarmodelPackage#getIstarDiagram_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActorReal> getNodes();

} // IstarDiagram
