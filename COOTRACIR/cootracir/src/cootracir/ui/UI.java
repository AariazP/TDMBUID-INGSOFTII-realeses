/**
 */
package cootracir.ui;

import cootracir.ModelFactory;

import cootracir.domain.Domain;

import cootracir.ui.viewmodels.ViewModel;
import cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorBusquedaViewModel;
import cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorInformaciongeneralViewModel;
import cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorRegistroBaseViewModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cootracir.ui.UI#getTheModelFactory <em>The Model Factory</em>}</li>
 *   <li>{@link cootracir.ui.UI#getTheDomain <em>The Domain</em>}</li>
 *   <li>{@link cootracir.ui.UI#getLstViewModels <em>Lst View Models</em>}</li>
 *   <li>{@link cootracir.ui.UI#getTheContenedorRegistroBaseViewModel <em>The Contenedor Registro Base View Model</em>}</li>
 * </ul>
 *
 * @see cootracir.ui.UiPackage#getUI()
 * @model
 * @generated
 */
public interface UI extends EObject {
	/**
	 * Returns the value of the '<em><b>The Model Factory</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link cootracir.ModelFactory#getTheUI <em>The UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Model Factory</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Model Factory</em>' container reference.
	 * @see #setTheModelFactory(ModelFactory)
	 * @see cootracir.ui.UiPackage#getUI_TheModelFactory()
	 * @see cootracir.ModelFactory#getTheUI
	 * @model opposite="theUI" transient="false"
	 * @generated
	 */
	ModelFactory getTheModelFactory();

	/**
	 * Sets the value of the '{@link cootracir.ui.UI#getTheModelFactory <em>The Model Factory</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Model Factory</em>' container reference.
	 * @see #getTheModelFactory()
	 * @generated
	 */
	void setTheModelFactory(ModelFactory value);

	/**
	 * Returns the value of the '<em><b>The Domain</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cootracir.domain.Domain#getTheUI <em>The UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Domain</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Domain</em>' reference.
	 * @see #setTheDomain(Domain)
	 * @see cootracir.ui.UiPackage#getUI_TheDomain()
	 * @see cootracir.domain.Domain#getTheUI
	 * @model opposite="theUI"
	 * @generated
	 */
	Domain getTheDomain();

	/**
	 * Sets the value of the '{@link cootracir.ui.UI#getTheDomain <em>The Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Domain</em>' reference.
	 * @see #getTheDomain()
	 * @generated
	 */
	void setTheDomain(Domain value);

	/**
	 * Returns the value of the '<em><b>Lst View Models</b></em>' reference list.
	 * The list contents are of type {@link cootracir.ui.viewmodels.ViewModel}.
	 * It is bidirectional and its opposite is '{@link cootracir.ui.viewmodels.ViewModel#getTheUI <em>The UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst View Models</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst View Models</em>' reference list.
	 * @see cootracir.ui.UiPackage#getUI_LstViewModels()
	 * @see cootracir.ui.viewmodels.ViewModel#getTheUI
	 * @model opposite="theUI"
	 * @generated
	 */
	EList<ViewModel> getLstViewModels();

	/**
	 * Returns the value of the '<em><b>The Contenedor Registro Base View Model</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorRegistroBaseViewModel#getOwnedByUI <em>Owned By UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Contenedor Registro Base View Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Contenedor Registro Base View Model</em>' containment reference.
	 * @see #setTheContenedorRegistroBaseViewModel(ContenedorRegistroBaseViewModel)
	 * @see cootracir.ui.UiPackage#getUI_TheContenedorRegistroBaseViewModel()
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorRegistroBaseViewModel#getOwnedByUI
	 * @model opposite="ownedByUI" containment="true"
	 * @generated
	 */
	ContenedorRegistroBaseViewModel getTheContenedorRegistroBaseViewModel();

	/**
	 * Sets the value of the '{@link cootracir.ui.UI#getTheContenedorRegistroBaseViewModel <em>The Contenedor Registro Base View Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Contenedor Registro Base View Model</em>' containment reference.
	 * @see #getTheContenedorRegistroBaseViewModel()
	 * @generated
	 */
	void setTheContenedorRegistroBaseViewModel(ContenedorRegistroBaseViewModel value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='//TODO implementarModelo\n'"
	 * @generated
	 */
	void implementarModelo();

	void limpiarCampos(ContenedorBusquedaViewModel contenedorbusquedaViewModel,
			ContenedorInformaciongeneralViewModel contenedorinformaciongeneralViewModel,
			ContenedorRegistroBaseViewModel contenedorregistroBaseViewModel);

} // UI
