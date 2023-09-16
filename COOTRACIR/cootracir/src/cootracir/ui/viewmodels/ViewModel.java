/**
 */
package cootracir.ui.viewmodels;

import cootracir.ui.UI;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cootracir.ui.viewmodels.ViewModel#getTheUI <em>The UI</em>}</li>
 * </ul>
 *
 * @see cootracir.ui.viewmodels.ViewmodelsPackage#getViewModel()
 * @model abstract="true"
 * @generated
 */
public interface ViewModel extends EObject {
	/**
	 * Returns the value of the '<em><b>The UI</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cootracir.ui.UI#getLstViewModels <em>Lst View Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The UI</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The UI</em>' reference.
	 * @see #setTheUI(UI)
	 * @see cootracir.ui.viewmodels.ViewmodelsPackage#getViewModel_TheUI()
	 * @see cootracir.ui.UI#getLstViewModels
	 * @model opposite="lstViewModels"
	 * @generated
	 */
	UI getTheUI();

	/**
	 * Sets the value of the '{@link cootracir.ui.viewmodels.ViewModel#getTheUI <em>The UI</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The UI</em>' reference.
	 * @see #getTheUI()
	 * @generated
	 */
	void setTheUI(UI value);

} // ViewModel
