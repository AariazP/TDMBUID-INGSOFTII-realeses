/**
 */
package cootracir.ui.viewmodels.contenedorregistrobaseviewmodel;

import cootracir.ui.UI;

import cootracir.ui.viewmodels.ViewModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contenedor Registro Base View Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorRegistroBaseViewModel#getOwnedByUI <em>Owned By UI</em>}</li>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorRegistroBaseViewModel#getNotificacion <em>Notificacion</em>}</li>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorRegistroBaseViewModel#getTxtFiltrarrutasViewModel <em>Txt Filtrarrutas View Model</em>}</li>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorRegistroBaseViewModel#getListaFiltrarrutasViewModel <em>Lista Filtrarrutas View Model</em>}</li>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorRegistroBaseViewModel#getFiltrarrutasViewModel <em>Filtrarrutas View Model</em>}</li>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorRegistroBaseViewModel#getSelectedFiltrarrutasViewModel <em>Selected Filtrarrutas View Model</em>}</li>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorRegistroBaseViewModel#getTheInformaciongeneral <em>The Informaciongeneral</em>}</li>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorRegistroBaseViewModel#getTheBusqueda <em>The Busqueda</em>}</li>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorRegistroBaseViewModel#getListaRegistrosViewModel <em>Lista Registros View Model</em>}</li>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorRegistroBaseViewModel#getSelectedRegistrosViewModel <em>Selected Registros View Model</em>}</li>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorRegistroBaseViewModel#getRegistrosViewModel <em>Registros View Model</em>}</li>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorRegistroBaseViewModel#getListaListapreciosViewModel <em>Lista Listaprecios View Model</em>}</li>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorRegistroBaseViewModel#getSelectedListapreciosViewModel <em>Selected Listaprecios View Model</em>}</li>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorRegistroBaseViewModel#getListapreciosViewModel <em>Listaprecios View Model</em>}</li>
 * </ul>
 *
 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelPackage#getContenedorRegistroBaseViewModel()
 * @model
 * @generated
 */
public interface ContenedorRegistroBaseViewModel extends ViewModel {
	/**
	 * Returns the value of the '<em><b>Owned By UI</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link cootracir.ui.UI#getTheContenedorRegistroBaseViewModel <em>The Contenedor Registro Base View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned By UI</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By UI</em>' container reference.
	 * @see #setOwnedByUI(UI)
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelPackage#getContenedorRegistroBaseViewModel_OwnedByUI()
	 * @see cootracir.ui.UI#getTheContenedorRegistroBaseViewModel
	 * @model opposite="theContenedorRegistroBaseViewModel" transient="false"
	 * @generated
	 */
	UI getOwnedByUI();

	/**
	 * Sets the value of the '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorRegistroBaseViewModel#getOwnedByUI <em>Owned By UI</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned By UI</em>' container reference.
	 * @see #getOwnedByUI()
	 * @generated
	 */
	void setOwnedByUI(UI value);

	/**
	 * Returns the value of the '<em><b>Notificacion</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notificacion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notificacion</em>' attribute.
	 * @see #setNotificacion(String)
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelPackage#getContenedorRegistroBaseViewModel_Notificacion()
	 * @model default=" " dataType="cootracir.String"
	 * @generated
	 */
	String getNotificacion();

	/**
	 * Sets the value of the '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorRegistroBaseViewModel#getNotificacion <em>Notificacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notificacion</em>' attribute.
	 * @see #getNotificacion()
	 * @generated
	 */
	void setNotificacion(String value);

	/**
	 * Returns the value of the '<em><b>Txt Filtrarrutas View Model</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Txt Filtrarrutas View Model</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Txt Filtrarrutas View Model</em>' attribute.
	 * @see #setTxtFiltrarrutasViewModel(String)
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelPackage#getContenedorRegistroBaseViewModel_TxtFiltrarrutasViewModel()
	 * @model default=" " dataType="cootracir.String"
	 * @generated
	 */
	String getTxtFiltrarrutasViewModel();

	/**
	 * Sets the value of the '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorRegistroBaseViewModel#getTxtFiltrarrutasViewModel <em>Txt Filtrarrutas View Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Txt Filtrarrutas View Model</em>' attribute.
	 * @see #getTxtFiltrarrutasViewModel()
	 * @generated
	 */
	void setTxtFiltrarrutasViewModel(String value);

	/**
	 * Returns the value of the '<em><b>Lista Filtrarrutas View Model</b></em>' containment reference list.
	 * The list contents are of type {@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.FiltrarrutasViewModel}.
	 * It is bidirectional and its opposite is '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.FiltrarrutasViewModel#getOwnedByContenedorRegistroBaseViewModel <em>Owned By Contenedor Registro Base View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Filtrarrutas View Model</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Filtrarrutas View Model</em>' containment reference list.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelPackage#getContenedorRegistroBaseViewModel_ListaFiltrarrutasViewModel()
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.FiltrarrutasViewModel#getOwnedByContenedorRegistroBaseViewModel
	 * @model opposite="ownedByContenedorRegistroBaseViewModel" containment="true"
	 * @generated
	 */
	EList<FiltrarrutasViewModel> getListaFiltrarrutasViewModel();

	/**
	 * Returns the value of the '<em><b>Filtrarrutas View Model</b></em>' reference list.
	 * The list contents are of type {@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.FiltrarrutasViewModel}.
	 * It is bidirectional and its opposite is '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.FiltrarrutasViewModel#getTheContenedorRegistroBaseViewModelFiltrarrutasViewModelFiltrarrutasViewModel <em>The Contenedor Registro Base View Model Filtrarrutas View Model Filtrarrutas View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filtrarrutas View Model</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filtrarrutas View Model</em>' reference list.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelPackage#getContenedorRegistroBaseViewModel_FiltrarrutasViewModel()
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.FiltrarrutasViewModel#getTheContenedorRegistroBaseViewModelFiltrarrutasViewModelFiltrarrutasViewModel
	 * @model opposite="theContenedorRegistroBaseViewModelFiltrarrutasViewModelFiltrarrutasViewModel"
	 * @generated
	 */
	EList<FiltrarrutasViewModel> getFiltrarrutasViewModel();

	/**
	 * Returns the value of the '<em><b>Selected Filtrarrutas View Model</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.FiltrarrutasViewModel#getTheContenedorRegistroBaseViewModelselectedFiltrarrutasViewModel <em>The Contenedor Registro Base View Modelselected Filtrarrutas View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected Filtrarrutas View Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected Filtrarrutas View Model</em>' reference.
	 * @see #setSelectedFiltrarrutasViewModel(FiltrarrutasViewModel)
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelPackage#getContenedorRegistroBaseViewModel_SelectedFiltrarrutasViewModel()
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.FiltrarrutasViewModel#getTheContenedorRegistroBaseViewModelselectedFiltrarrutasViewModel
	 * @model opposite="theContenedorRegistroBaseViewModelselectedFiltrarrutasViewModel"
	 * @generated
	 */
	FiltrarrutasViewModel getSelectedFiltrarrutasViewModel();

	/**
	 * Sets the value of the '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorRegistroBaseViewModel#getSelectedFiltrarrutasViewModel <em>Selected Filtrarrutas View Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected Filtrarrutas View Model</em>' reference.
	 * @see #getSelectedFiltrarrutasViewModel()
	 * @generated
	 */
	void setSelectedFiltrarrutasViewModel(FiltrarrutasViewModel value);

	/**
	 * Returns the value of the '<em><b>The Informaciongeneral</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorInformaciongeneralViewModel#getOwnedByContenedorRegistroBaseViewModelTheInformaciongeneral <em>Owned By Contenedor Registro Base View Model The Informaciongeneral</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Informaciongeneral</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Informaciongeneral</em>' containment reference.
	 * @see #setTheInformaciongeneral(ContenedorInformaciongeneralViewModel)
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelPackage#getContenedorRegistroBaseViewModel_TheInformaciongeneral()
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorInformaciongeneralViewModel#getOwnedByContenedorRegistroBaseViewModelTheInformaciongeneral
	 * @model opposite="ownedByContenedorRegistroBaseViewModelTheInformaciongeneral" containment="true"
	 * @generated
	 */
	ContenedorInformaciongeneralViewModel getTheInformaciongeneral();

	/**
	 * Sets the value of the '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorRegistroBaseViewModel#getTheInformaciongeneral <em>The Informaciongeneral</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Informaciongeneral</em>' containment reference.
	 * @see #getTheInformaciongeneral()
	 * @generated
	 */
	void setTheInformaciongeneral(ContenedorInformaciongeneralViewModel value);

	/**
	 * Returns the value of the '<em><b>The Busqueda</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorBusquedaViewModel#getOwnedByContenedorRegistroBaseViewModelTheBusqueda <em>Owned By Contenedor Registro Base View Model The Busqueda</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Busqueda</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Busqueda</em>' containment reference.
	 * @see #setTheBusqueda(ContenedorBusquedaViewModel)
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelPackage#getContenedorRegistroBaseViewModel_TheBusqueda()
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorBusquedaViewModel#getOwnedByContenedorRegistroBaseViewModelTheBusqueda
	 * @model opposite="ownedByContenedorRegistroBaseViewModelTheBusqueda" containment="true"
	 * @generated
	 */
	ContenedorBusquedaViewModel getTheBusqueda();

	/**
	 * Sets the value of the '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorRegistroBaseViewModel#getTheBusqueda <em>The Busqueda</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Busqueda</em>' containment reference.
	 * @see #getTheBusqueda()
	 * @generated
	 */
	void setTheBusqueda(ContenedorBusquedaViewModel value);

	/**
	 * Returns the value of the '<em><b>Lista Registros View Model</b></em>' containment reference list.
	 * The list contents are of type {@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.RegistrosViewModel}.
	 * It is bidirectional and its opposite is '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.RegistrosViewModel#getOwnedByContenedorRegistroBaseViewModel <em>Owned By Contenedor Registro Base View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Registros View Model</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Registros View Model</em>' containment reference list.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelPackage#getContenedorRegistroBaseViewModel_ListaRegistrosViewModel()
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.RegistrosViewModel#getOwnedByContenedorRegistroBaseViewModel
	 * @model opposite="ownedByContenedorRegistroBaseViewModel" containment="true"
	 * @generated
	 */
	EList<RegistrosViewModel> getListaRegistrosViewModel();

	/**
	 * Returns the value of the '<em><b>Selected Registros View Model</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.RegistrosViewModel#getTheContenedorRegistroBaseViewModelselectedRegistrosViewModel <em>The Contenedor Registro Base View Modelselected Registros View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected Registros View Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected Registros View Model</em>' reference.
	 * @see #setSelectedRegistrosViewModel(RegistrosViewModel)
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelPackage#getContenedorRegistroBaseViewModel_SelectedRegistrosViewModel()
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.RegistrosViewModel#getTheContenedorRegistroBaseViewModelselectedRegistrosViewModel
	 * @model opposite="theContenedorRegistroBaseViewModelselectedRegistrosViewModel"
	 * @generated
	 */
	RegistrosViewModel getSelectedRegistrosViewModel();

	/**
	 * Sets the value of the '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorRegistroBaseViewModel#getSelectedRegistrosViewModel <em>Selected Registros View Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected Registros View Model</em>' reference.
	 * @see #getSelectedRegistrosViewModel()
	 * @generated
	 */
	void setSelectedRegistrosViewModel(RegistrosViewModel value);

	/**
	 * Returns the value of the '<em><b>Registros View Model</b></em>' reference list.
	 * The list contents are of type {@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.RegistrosViewModel}.
	 * It is bidirectional and its opposite is '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.RegistrosViewModel#getTheContenedorRegistroBaseViewModelRegistrosViewModelRegistrosViewModel <em>The Contenedor Registro Base View Model Registros View Model Registros View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registros View Model</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registros View Model</em>' reference list.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelPackage#getContenedorRegistroBaseViewModel_RegistrosViewModel()
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.RegistrosViewModel#getTheContenedorRegistroBaseViewModelRegistrosViewModelRegistrosViewModel
	 * @model opposite="theContenedorRegistroBaseViewModelRegistrosViewModelRegistrosViewModel"
	 * @generated
	 */
	EList<RegistrosViewModel> getRegistrosViewModel();

	/**
	 * Returns the value of the '<em><b>Lista Listaprecios View Model</b></em>' containment reference list.
	 * The list contents are of type {@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ListapreciosViewModel}.
	 * It is bidirectional and its opposite is '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ListapreciosViewModel#getOwnedByContenedorRegistroBaseViewModel <em>Owned By Contenedor Registro Base View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Listaprecios View Model</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Listaprecios View Model</em>' containment reference list.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelPackage#getContenedorRegistroBaseViewModel_ListaListapreciosViewModel()
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ListapreciosViewModel#getOwnedByContenedorRegistroBaseViewModel
	 * @model opposite="ownedByContenedorRegistroBaseViewModel" containment="true"
	 * @generated
	 */
	EList<ListapreciosViewModel> getListaListapreciosViewModel();

	/**
	 * Returns the value of the '<em><b>Selected Listaprecios View Model</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ListapreciosViewModel#getTheContenedorRegistroBaseViewModelselectedListapreciosViewModel <em>The Contenedor Registro Base View Modelselected Listaprecios View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected Listaprecios View Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected Listaprecios View Model</em>' reference.
	 * @see #setSelectedListapreciosViewModel(ListapreciosViewModel)
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelPackage#getContenedorRegistroBaseViewModel_SelectedListapreciosViewModel()
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ListapreciosViewModel#getTheContenedorRegistroBaseViewModelselectedListapreciosViewModel
	 * @model opposite="theContenedorRegistroBaseViewModelselectedListapreciosViewModel"
	 * @generated
	 */
	ListapreciosViewModel getSelectedListapreciosViewModel();

	/**
	 * Sets the value of the '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorRegistroBaseViewModel#getSelectedListapreciosViewModel <em>Selected Listaprecios View Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected Listaprecios View Model</em>' reference.
	 * @see #getSelectedListapreciosViewModel()
	 * @generated
	 */
	void setSelectedListapreciosViewModel(ListapreciosViewModel value);

	/**
	 * Returns the value of the '<em><b>Listaprecios View Model</b></em>' reference list.
	 * The list contents are of type {@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ListapreciosViewModel}.
	 * It is bidirectional and its opposite is '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ListapreciosViewModel#getTheContenedorRegistroBaseViewModelListapreciosViewModelListapreciosViewModel <em>The Contenedor Registro Base View Model Listaprecios View Model Listaprecios View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Listaprecios View Model</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Listaprecios View Model</em>' reference list.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelPackage#getContenedorRegistroBaseViewModel_ListapreciosViewModel()
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ListapreciosViewModel#getTheContenedorRegistroBaseViewModelListapreciosViewModelListapreciosViewModel
	 * @model opposite="theContenedorRegistroBaseViewModelListapreciosViewModelListapreciosViewModel"
	 * @generated
	 */
	EList<ListapreciosViewModel> getListapreciosViewModel();

	void limpiarCampos(ContenedorBusquedaViewModel contenedorbusquedaViewModel,
			ContenedorInformaciongeneralViewModel contenedorinformaciongeneralViewModel,
			ContenedorRegistroBaseViewModel contenedorregistroBaseViewModel);

} // ContenedorRegistroBaseViewModel
