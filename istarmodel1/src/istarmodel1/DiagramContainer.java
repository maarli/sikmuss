/**
 */
package istarmodel1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link istarmodel1.DiagramContainer#getDiagrams <em>Diagrams</em>}</li>
 * </ul>
 *
 * @see istarmodel1.IstarmodelPackage#getDiagramContainer()
 * @model
 * @generated
 */
public interface DiagramContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Diagrams</b></em>' containment reference list.
	 * The list contents are of type {@link istarmodel1.IstarDiagram}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagrams</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagrams</em>' containment reference list.
	 * @see istarmodel1.IstarmodelPackage#getDiagramContainer_Diagrams()
	 * @model containment="true"
	 * @generated
	 */
	EList<IstarDiagram> getDiagrams();

} // DiagramContainer
