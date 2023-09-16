/**
 */
package cootracir.ui.viewmodels.contenedorregistrobaseviewmodel;

import cootracir.ui.viewmodels.ViewModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contenedor Busqueda View Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorBusquedaViewModel#getOwnedByContenedorRegistroBaseViewModelTheBusqueda <em>Owned By Contenedor Registro Base View Model The Busqueda</em>}</li>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorBusquedaViewModel#getTxtNombredelconductorViewModel <em>Txt Nombredelconductor View Model</em>}</li>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorBusquedaViewModel#getTxtRutadelconductorViewModel <em>Txt Rutadelconductor View Model</em>}</li>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorBusquedaViewModel#getListaNombredelconductorViewModel <em>Lista Nombredelconductor View Model</em>}</li>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorBusquedaViewModel#getNombredelconductorViewModel <em>Nombredelconductor View Model</em>}</li>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorBusquedaViewModel#getSelectedNombredelconductorViewModel <em>Selected Nombredelconductor View Model</em>}</li>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorBusquedaViewModel#getListaRutadelconductorViewModel <em>Lista Rutadelconductor View Model</em>}</li>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorBusquedaViewModel#getRutadelconductorViewModel <em>Rutadelconductor View Model</em>}</li>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorBusquedaViewModel#getSelectedRutadelconductorViewModel <em>Selected Rutadelconductor View Model</em>}</li>
 * </ul>
 *
 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelPackage#getContenedorBusquedaViewModel()
 * @model
 * @generated
 */
public interface ContenedorBusquedaViewModel extends ViewModel {
	/**
	 * Returns the value of the '<em><b>Owned By Contenedor Registro Base View Model The Busqueda</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorRegistroBaseViewModel#getTheBusqueda <em>The Busqueda</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned By Contenedor Registro Base View Model The Busqueda</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Contenedor Registro Base View Model The Busqueda</em>' container reference.
	 * @see #setOwnedByContenedorRegistroBaseViewModelTheBusqueda(ContenedorRegistroBaseViewModel)
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelPackage#getContenedorBusquedaViewModel_OwnedByContenedorRegistroBaseViewModelTheBusqueda()
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorRegistroBaseViewModel#getTheBusqueda
	 * @model opposite="theBusqueda" transient="false"
	 * @generated
	 */
	ContenedorRegistroBaseViewModel getOwnedByContenedorRegistroBaseViewModelTheBusqueda();

	/**
	 * Sets the value of the '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorBusquedaViewModel#getOwnedByContenedorRegistroBaseViewModelTheBusqueda <em>Owned By Contenedor Registro Base View Model The Busqueda</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned By Contenedor Registro Base View Model The Busqueda</em>' container reference.
	 * @see #getOwnedByContenedorRegistroBaseViewModelTheBusqueda()
	 * @generated
	 */
	void setOwnedByContenedorRegistroBaseViewModelTheBusqueda(ContenedorRegistroBaseViewModel value);

	/**
	 * Returns the value of the '<em><b>Txt Nombredelconductor View Model</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Txt Nombredelconductor View Model</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Txt Nombredelconductor View Model</em>' attribute.
	 * @see #setTxtNombredelconductorViewModel(String)
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelPackage#getContenedorBusquedaViewModel_TxtNombredelconductorViewModel()
	 * @model default=" " dataType="cootracir.String"
	 * @generated
	 */
	String getTxtNombredelconductorViewModel();

	/**
	 * Sets the value of the '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorBusquedaViewModel#getTxtNombredelconductorViewModel <em>Txt Nombredelconductor View Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Txt Nombredelconductor View Model</em>' attribute.
	 * @see #getTxtNombredelconductorViewModel()
	 * @generated
	 */
	void setTxtNombredelconductorViewModel(String value);

	/**
	 * Returns the value of the '<em><b>Txt Rutadelconductor View Model</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Txt Rutadelconductor View Model</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Txt Rutadelconductor View Model</em>' attribute.
	 * @see #setTxtRutadelconductorViewModel(String)
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelPackage#getContenedorBusquedaViewModel_TxtRutadelconductorViewModel()
	 * @model default=" " dataType="cootracir.String"
	 * @generated
	 */
	String getTxtRutadelconductorViewModel();

	/**
	 * Sets the value of the '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorBusquedaViewModel#getTxtRutadelconductorViewModel <em>Txt Rutadelconductor View Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Txt Rutadelconductor View Model</em>' attribute.
	 * @see #getTxtRutadelconductorViewModel()
	 * @generated
	 */
	void setTxtRutadelconductorViewModel(String value);

	/**
	 * Returns the value of the '<em><b>Lista Nombredelconductor View Model</b></em>' containment reference list.
	 * The list contents are of type {@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.NombredelconductorViewModel}.
	 * It is bidirectional and its opposite is '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.NombredelconductorViewModel#getOwnedContenedorBusquedaViewModel <em>Owned Contenedor Busqueda View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Nombredelconductor View Model</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Nombredelconductor View Model</em>' containment reference list.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelPackage#getContenedorBusquedaViewModel_ListaNombredelconductorViewModel()
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.NombredelconductorViewModel#getOwnedContenedorBusquedaViewModel
	 * @model opposite="ownedContenedorBusquedaViewModel" containment="true"
	 * @generated
	 */
	EList<NombredelconductorViewModel> getListaNombredelconductorViewModel();

	/**
	 * Returns the value of the '<em><b>Nombredelconductor View Model</b></em>' reference list.
	 * The list contents are of type {@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.NombredelconductorViewModel}.
	 * It is bidirectional and its opposite is '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.NombredelconductorViewModel#getTheContenedorBusquedaViewModelNombredelconductorViewModelNombredelconductorViewModel <em>The Contenedor Busqueda View Model Nombredelconductor View Model Nombredelconductor View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombredelconductor View Model</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombredelconductor View Model</em>' reference list.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelPackage#getContenedorBusquedaViewModel_NombredelconductorViewModel()
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.NombredelconductorViewModel#getTheContenedorBusquedaViewModelNombredelconductorViewModelNombredelconductorViewModel
	 * @model opposite="theContenedorBusquedaViewModelNombredelconductorViewModelNombredelconductorViewModel"
	 * @generated
	 */
	EList<NombredelconductorViewModel> getNombredelconductorViewModel();

	/**
	 * Returns the value of the '<em><b>Selected Nombredelconductor View Model</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.NombredelconductorViewModel#getTheContenedorBusquedaViewModelselectedNombredelconductorViewModel <em>The Contenedor Busqueda View Modelselected Nombredelconductor View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected Nombredelconductor View Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected Nombredelconductor View Model</em>' reference.
	 * @see #setSelectedNombredelconductorViewModel(NombredelconductorViewModel)
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelPackage#getContenedorBusquedaViewModel_SelectedNombredelconductorViewModel()
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.NombredelconductorViewModel#getTheContenedorBusquedaViewModelselectedNombredelconductorViewModel
	 * @model opposite="theContenedorBusquedaViewModelselectedNombredelconductorViewModel"
	 * @generated
	 */
	NombredelconductorViewModel getSelectedNombredelconductorViewModel();

	/**
	 * Sets the value of the '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorBusquedaViewModel#getSelectedNombredelconductorViewModel <em>Selected Nombredelconductor View Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected Nombredelconductor View Model</em>' reference.
	 * @see #getSelectedNombredelconductorViewModel()
	 * @generated
	 */
	void setSelectedNombredelconductorViewModel(NombredelconductorViewModel value);

	/**
	 * Returns the value of the '<em><b>Lista Rutadelconductor View Model</b></em>' containment reference list.
	 * The list contents are of type {@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.RutadelconductorViewModel}.
	 * It is bidirectional and its opposite is '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.RutadelconductorViewModel#getOwnedContenedorBusquedaViewModel <em>Owned Contenedor Busqueda View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Rutadelconductor View Model</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Rutadelconductor View Model</em>' containment reference list.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelPackage#getContenedorBusquedaViewModel_ListaRutadelconductorViewModel()
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.RutadelconductorViewModel#getOwnedContenedorBusquedaViewModel
	 * @model opposite="ownedContenedorBusquedaViewModel" containment="true"
	 * @generated
	 */
	EList<RutadelconductorViewModel> getListaRutadelconductorViewModel();

	/**
	 * Returns the value of the '<em><b>Rutadelconductor View Model</b></em>' reference list.
	 * The list contents are of type {@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.RutadelconductorViewModel}.
	 * It is bidirectional and its opposite is '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.RutadelconductorViewModel#getTheContenedorBusquedaViewModelRutadelconductorViewModelRutadelconductorViewModel <em>The Contenedor Busqueda View Model Rutadelconductor View Model Rutadelconductor View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rutadelconductor View Model</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rutadelconductor View Model</em>' reference list.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelPackage#getContenedorBusquedaViewModel_RutadelconductorViewModel()
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.RutadelconductorViewModel#getTheContenedorBusquedaViewModelRutadelconductorViewModelRutadelconductorViewModel
	 * @model opposite="theContenedorBusquedaViewModelRutadelconductorViewModelRutadelconductorViewModel"
	 * @generated
	 */
	EList<RutadelconductorViewModel> getRutadelconductorViewModel();

	/**
	 * Returns the value of the '<em><b>Selected Rutadelconductor View Model</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.RutadelconductorViewModel#getTheContenedorBusquedaViewModelselectedRutadelconductorViewModel <em>The Contenedor Busqueda View Modelselected Rutadelconductor View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected Rutadelconductor View Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected Rutadelconductor View Model</em>' reference.
	 * @see #setSelectedRutadelconductorViewModel(RutadelconductorViewModel)
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelPackage#getContenedorBusquedaViewModel_SelectedRutadelconductorViewModel()
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.RutadelconductorViewModel#getTheContenedorBusquedaViewModelselectedRutadelconductorViewModel
	 * @model opposite="theContenedorBusquedaViewModelselectedRutadelconductorViewModel"
	 * @generated
	 */
	RutadelconductorViewModel getSelectedRutadelconductorViewModel();

	/**
	 * Sets the value of the '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorBusquedaViewModel#getSelectedRutadelconductorViewModel <em>Selected Rutadelconductor View Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected Rutadelconductor View Model</em>' reference.
	 * @see #getSelectedRutadelconductorViewModel()
	 * @generated
	 */
	void setSelectedRutadelconductorViewModel(RutadelconductorViewModel value);

} // ContenedorBusquedaViewModel
