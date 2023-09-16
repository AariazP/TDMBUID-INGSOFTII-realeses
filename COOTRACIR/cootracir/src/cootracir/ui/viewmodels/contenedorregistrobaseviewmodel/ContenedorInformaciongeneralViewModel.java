/**
 */
package cootracir.ui.viewmodels.contenedorregistrobaseviewmodel;

import cootracir.ui.viewmodels.ViewModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contenedor Informaciongeneral View Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorInformaciongeneralViewModel#getOwnedByContenedorRegistroBaseViewModelTheInformaciongeneral <em>Owned By Contenedor Registro Base View Model The Informaciongeneral</em>}</li>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorInformaciongeneralViewModel#getNombre <em>Nombre</em>}</li>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorInformaciongeneralViewModel#getHora <em>Hora</em>}</li>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorInformaciongeneralViewModel#getRuta <em>Ruta</em>}</li>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorInformaciongeneralViewModel#getFecha <em>Fecha</em>}</li>
 * </ul>
 *
 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelPackage#getContenedorInformaciongeneralViewModel()
 * @model
 * @generated
 */
public interface ContenedorInformaciongeneralViewModel extends ViewModel {
	/**
	 * Returns the value of the '<em><b>Owned By Contenedor Registro Base View Model The Informaciongeneral</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorRegistroBaseViewModel#getTheInformaciongeneral <em>The Informaciongeneral</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned By Contenedor Registro Base View Model The Informaciongeneral</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Contenedor Registro Base View Model The Informaciongeneral</em>' container reference.
	 * @see #setOwnedByContenedorRegistroBaseViewModelTheInformaciongeneral(ContenedorRegistroBaseViewModel)
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelPackage#getContenedorInformaciongeneralViewModel_OwnedByContenedorRegistroBaseViewModelTheInformaciongeneral()
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorRegistroBaseViewModel#getTheInformaciongeneral
	 * @model opposite="theInformaciongeneral" transient="false"
	 * @generated
	 */
	ContenedorRegistroBaseViewModel getOwnedByContenedorRegistroBaseViewModelTheInformaciongeneral();

	/**
	 * Sets the value of the '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorInformaciongeneralViewModel#getOwnedByContenedorRegistroBaseViewModelTheInformaciongeneral <em>Owned By Contenedor Registro Base View Model The Informaciongeneral</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned By Contenedor Registro Base View Model The Informaciongeneral</em>' container reference.
	 * @see #getOwnedByContenedorRegistroBaseViewModelTheInformaciongeneral()
	 * @generated
	 */
	void setOwnedByContenedorRegistroBaseViewModelTheInformaciongeneral(ContenedorRegistroBaseViewModel value);

	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelPackage#getContenedorInformaciongeneralViewModel_Nombre()
	 * @model default=" " dataType="cootracir.String"
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorInformaciongeneralViewModel#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Hora</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hora</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hora</em>' attribute.
	 * @see #setHora(String)
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelPackage#getContenedorInformaciongeneralViewModel_Hora()
	 * @model default=" " dataType="cootracir.String"
	 * @generated
	 */
	String getHora();

	/**
	 * Sets the value of the '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorInformaciongeneralViewModel#getHora <em>Hora</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hora</em>' attribute.
	 * @see #getHora()
	 * @generated
	 */
	void setHora(String value);

	/**
	 * Returns the value of the '<em><b>Ruta</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ruta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ruta</em>' attribute.
	 * @see #setRuta(String)
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelPackage#getContenedorInformaciongeneralViewModel_Ruta()
	 * @model default=" " dataType="cootracir.String"
	 * @generated
	 */
	String getRuta();

	/**
	 * Sets the value of the '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorInformaciongeneralViewModel#getRuta <em>Ruta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ruta</em>' attribute.
	 * @see #getRuta()
	 * @generated
	 */
	void setRuta(String value);

	/**
	 * Returns the value of the '<em><b>Fecha</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fecha</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fecha</em>' attribute.
	 * @see #setFecha(String)
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelPackage#getContenedorInformaciongeneralViewModel_Fecha()
	 * @model default=" " dataType="cootracir.String"
	 * @generated
	 */
	String getFecha();

	/**
	 * Sets the value of the '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorInformaciongeneralViewModel#getFecha <em>Fecha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fecha</em>' attribute.
	 * @see #getFecha()
	 * @generated
	 */
	void setFecha(String value);

} // ContenedorInformaciongeneralViewModel
