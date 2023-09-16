/**
 */
package cootracir.ui.viewmodels.contenedorregistrobaseviewmodel;

import cootracir.ui.viewmodels.ViewmodelsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelFactory
 * @model kind="package"
 * @generated
 */
public interface ContenedorregistrobaseviewmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "contenedorregistrobaseviewmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///cootracir/ui/viewmodels/contenedorregistrobaseviewmodel.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cootracir.ui.viewmodels.contenedorregistrobaseviewmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContenedorregistrobaseviewmodelPackage eINSTANCE = cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.ContenedorregistrobaseviewmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.ContenedorRegistroBaseViewModelImpl <em>Contenedor Registro Base View Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.ContenedorRegistroBaseViewModelImpl
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.ContenedorregistrobaseviewmodelPackageImpl#getContenedorRegistroBaseViewModel()
	 * @generated
	 */
	int CONTENEDOR_REGISTRO_BASE_VIEW_MODEL = 0;

	/**
	 * The feature id for the '<em><b>The UI</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__THE_UI = ViewmodelsPackage.VIEW_MODEL__THE_UI;

	/**
	 * The feature id for the '<em><b>Owned By UI</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__OWNED_BY_UI = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Notificacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__NOTIFICACION = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Txt Filtrarrutas View Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__TXT_FILTRARRUTAS_VIEW_MODEL = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lista Filtrarrutas View Model</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__LISTA_FILTRARRUTAS_VIEW_MODEL = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Filtrarrutas View Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__FILTRARRUTAS_VIEW_MODEL = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Selected Filtrarrutas View Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__SELECTED_FILTRARRUTAS_VIEW_MODEL = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>The Informaciongeneral</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__THE_INFORMACIONGENERAL = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>The Busqueda</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__THE_BUSQUEDA = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Lista Registros View Model</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__LISTA_REGISTROS_VIEW_MODEL = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Selected Registros View Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__SELECTED_REGISTROS_VIEW_MODEL = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Registros View Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__REGISTROS_VIEW_MODEL = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Lista Listaprecios View Model</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__LISTA_LISTAPRECIOS_VIEW_MODEL = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Selected Listaprecios View Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__SELECTED_LISTAPRECIOS_VIEW_MODEL = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Listaprecios View Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__LISTAPRECIOS_VIEW_MODEL = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Contenedor Registro Base View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_FEATURE_COUNT = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.FiltrarrutasViewModelImpl <em>Filtrarrutas View Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.FiltrarrutasViewModelImpl
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.ContenedorregistrobaseviewmodelPackageImpl#getFiltrarrutasViewModel()
	 * @generated
	 */
	int FILTRARRUTAS_VIEW_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Owned By Contenedor Registro Base View Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTRARRUTAS_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL = 0;

	/**
	 * The feature id for the '<em><b>The Contenedor Registro Base View Model Filtrarrutas View Model Filtrarrutas View Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTRARRUTAS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_FILTRARRUTAS_VIEW_MODEL_FILTRARRUTAS_VIEW_MODEL = 1;

	/**
	 * The feature id for the '<em><b>The Contenedor Registro Base View Modelselected Filtrarrutas View Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTRARRUTAS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODELSELECTED_FILTRARRUTAS_VIEW_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTRARRUTAS_VIEW_MODEL__NAME = 3;

	/**
	 * The number of structural features of the '<em>Filtrarrutas View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTRARRUTAS_VIEW_MODEL_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.ContenedorInformaciongeneralViewModelImpl <em>Contenedor Informaciongeneral View Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.ContenedorInformaciongeneralViewModelImpl
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.ContenedorregistrobaseviewmodelPackageImpl#getContenedorInformaciongeneralViewModel()
	 * @generated
	 */
	int CONTENEDOR_INFORMACIONGENERAL_VIEW_MODEL = 2;

	/**
	 * The feature id for the '<em><b>The UI</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_INFORMACIONGENERAL_VIEW_MODEL__THE_UI = ViewmodelsPackage.VIEW_MODEL__THE_UI;

	/**
	 * The feature id for the '<em><b>Owned By Contenedor Registro Base View Model The Informaciongeneral</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_INFORMACIONGENERAL_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_THE_INFORMACIONGENERAL = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_INFORMACIONGENERAL_VIEW_MODEL__NOMBRE = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Hora</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_INFORMACIONGENERAL_VIEW_MODEL__HORA = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ruta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_INFORMACIONGENERAL_VIEW_MODEL__RUTA = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fecha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_INFORMACIONGENERAL_VIEW_MODEL__FECHA = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Contenedor Informaciongeneral View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_INFORMACIONGENERAL_VIEW_MODEL_FEATURE_COUNT = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.ContenedorBusquedaViewModelImpl <em>Contenedor Busqueda View Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.ContenedorBusquedaViewModelImpl
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.ContenedorregistrobaseviewmodelPackageImpl#getContenedorBusquedaViewModel()
	 * @generated
	 */
	int CONTENEDOR_BUSQUEDA_VIEW_MODEL = 3;

	/**
	 * The feature id for the '<em><b>The UI</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_BUSQUEDA_VIEW_MODEL__THE_UI = ViewmodelsPackage.VIEW_MODEL__THE_UI;

	/**
	 * The feature id for the '<em><b>Owned By Contenedor Registro Base View Model The Busqueda</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_BUSQUEDA_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_THE_BUSQUEDA = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Txt Nombredelconductor View Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_BUSQUEDA_VIEW_MODEL__TXT_NOMBREDELCONDUCTOR_VIEW_MODEL = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Txt Rutadelconductor View Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_BUSQUEDA_VIEW_MODEL__TXT_RUTADELCONDUCTOR_VIEW_MODEL = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lista Nombredelconductor View Model</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_BUSQUEDA_VIEW_MODEL__LISTA_NOMBREDELCONDUCTOR_VIEW_MODEL = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Nombredelconductor View Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_BUSQUEDA_VIEW_MODEL__NOMBREDELCONDUCTOR_VIEW_MODEL = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Selected Nombredelconductor View Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_BUSQUEDA_VIEW_MODEL__SELECTED_NOMBREDELCONDUCTOR_VIEW_MODEL = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Lista Rutadelconductor View Model</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_BUSQUEDA_VIEW_MODEL__LISTA_RUTADELCONDUCTOR_VIEW_MODEL = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Rutadelconductor View Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_BUSQUEDA_VIEW_MODEL__RUTADELCONDUCTOR_VIEW_MODEL = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Selected Rutadelconductor View Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_BUSQUEDA_VIEW_MODEL__SELECTED_RUTADELCONDUCTOR_VIEW_MODEL = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Contenedor Busqueda View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_BUSQUEDA_VIEW_MODEL_FEATURE_COUNT = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.NombredelconductorViewModelImpl <em>Nombredelconductor View Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.NombredelconductorViewModelImpl
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.ContenedorregistrobaseviewmodelPackageImpl#getNombredelconductorViewModel()
	 * @generated
	 */
	int NOMBREDELCONDUCTOR_VIEW_MODEL = 4;

	/**
	 * The feature id for the '<em><b>Owned Contenedor Busqueda View Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOMBREDELCONDUCTOR_VIEW_MODEL__OWNED_CONTENEDOR_BUSQUEDA_VIEW_MODEL = 0;

	/**
	 * The feature id for the '<em><b>The Contenedor Busqueda View Model Nombredelconductor View Model Nombredelconductor View Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOMBREDELCONDUCTOR_VIEW_MODEL__THE_CONTENEDOR_BUSQUEDA_VIEW_MODEL_NOMBREDELCONDUCTOR_VIEW_MODEL_NOMBREDELCONDUCTOR_VIEW_MODEL = 1;

	/**
	 * The feature id for the '<em><b>The Contenedor Busqueda View Modelselected Nombredelconductor View Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOMBREDELCONDUCTOR_VIEW_MODEL__THE_CONTENEDOR_BUSQUEDA_VIEW_MODELSELECTED_NOMBREDELCONDUCTOR_VIEW_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOMBREDELCONDUCTOR_VIEW_MODEL__NAME = 3;

	/**
	 * The number of structural features of the '<em>Nombredelconductor View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOMBREDELCONDUCTOR_VIEW_MODEL_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.RutadelconductorViewModelImpl <em>Rutadelconductor View Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.RutadelconductorViewModelImpl
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.ContenedorregistrobaseviewmodelPackageImpl#getRutadelconductorViewModel()
	 * @generated
	 */
	int RUTADELCONDUCTOR_VIEW_MODEL = 5;

	/**
	 * The feature id for the '<em><b>Owned Contenedor Busqueda View Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUTADELCONDUCTOR_VIEW_MODEL__OWNED_CONTENEDOR_BUSQUEDA_VIEW_MODEL = 0;

	/**
	 * The feature id for the '<em><b>The Contenedor Busqueda View Model Rutadelconductor View Model Rutadelconductor View Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUTADELCONDUCTOR_VIEW_MODEL__THE_CONTENEDOR_BUSQUEDA_VIEW_MODEL_RUTADELCONDUCTOR_VIEW_MODEL_RUTADELCONDUCTOR_VIEW_MODEL = 1;

	/**
	 * The feature id for the '<em><b>The Contenedor Busqueda View Modelselected Rutadelconductor View Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUTADELCONDUCTOR_VIEW_MODEL__THE_CONTENEDOR_BUSQUEDA_VIEW_MODELSELECTED_RUTADELCONDUCTOR_VIEW_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUTADELCONDUCTOR_VIEW_MODEL__NAME = 3;

	/**
	 * The number of structural features of the '<em>Rutadelconductor View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUTADELCONDUCTOR_VIEW_MODEL_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.RegistrosViewModelImpl <em>Registros View Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.RegistrosViewModelImpl
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.ContenedorregistrobaseviewmodelPackageImpl#getRegistrosViewModel()
	 * @generated
	 */
	int REGISTROS_VIEW_MODEL = 6;

	/**
	 * The feature id for the '<em><b>Owned By Contenedor Registro Base View Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTROS_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL = 0;

	/**
	 * The feature id for the '<em><b>The Contenedor Registro Base View Modelselected Registros View Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTROS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODELSELECTED_REGISTROS_VIEW_MODEL = 1;

	/**
	 * The feature id for the '<em><b>The Contenedor Registro Base View Model Registros View Model Registros View Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTROS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_REGISTROS_VIEW_MODEL_REGISTROS_VIEW_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTROS_VIEW_MODEL__ID = 3;

	/**
	 * The feature id for the '<em><b>Hora</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTROS_VIEW_MODEL__HORA = 4;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTROS_VIEW_MODEL__ESTADO = 5;

	/**
	 * The feature id for the '<em><b>Incidencia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTROS_VIEW_MODEL__INCIDENCIA = 6;

	/**
	 * The feature id for the '<em><b>Lugar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTROS_VIEW_MODEL__LUGAR = 7;

	/**
	 * The number of structural features of the '<em>Registros View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTROS_VIEW_MODEL_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.ListapreciosViewModelImpl <em>Listaprecios View Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.ListapreciosViewModelImpl
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.ContenedorregistrobaseviewmodelPackageImpl#getListapreciosViewModel()
	 * @generated
	 */
	int LISTAPRECIOS_VIEW_MODEL = 7;

	/**
	 * The feature id for the '<em><b>Owned By Contenedor Registro Base View Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTAPRECIOS_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL = 0;

	/**
	 * The feature id for the '<em><b>The Contenedor Registro Base View Modelselected Listaprecios View Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTAPRECIOS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODELSELECTED_LISTAPRECIOS_VIEW_MODEL = 1;

	/**
	 * The feature id for the '<em><b>The Contenedor Registro Base View Model Listaprecios View Model Listaprecios View Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTAPRECIOS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_LISTAPRECIOS_VIEW_MODEL_LISTAPRECIOS_VIEW_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Ruta1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTAPRECIOS_VIEW_MODEL__RUTA1 = 3;

	/**
	 * The feature id for the '<em><b>Ruta2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTAPRECIOS_VIEW_MODEL__RUTA2 = 4;

	/**
	 * The feature id for the '<em><b>Pecio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTAPRECIOS_VIEW_MODEL__PECIO = 5;

	/**
	 * The number of structural features of the '<em>Listaprecios View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTAPRECIOS_VIEW_MODEL_FEATURE_COUNT = 6;


	/**
	 * Returns the meta object for class '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorRegistroBaseViewModel <em>Contenedor Registro Base View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contenedor Registro Base View Model</em>'.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorRegistroBaseViewModel
	 * @generated
	 */
	EClass getContenedorRegistroBaseViewModel();

	/**
	 * Returns the meta object for the container reference '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorRegistroBaseViewModel#getOwnedByUI <em>Owned By UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By UI</em>'.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorRegistroBaseViewModel#getOwnedByUI()
	 * @see #getContenedorRegistroBaseViewModel()
	 * @generated
	 */
	EReference getContenedorRegistroBaseViewModel_OwnedByUI();

	/**
	 * Returns the meta object for the attribute '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorRegistroBaseViewModel#getNotificacion <em>Notificacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notificacion</em>'.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorRegistroBaseViewModel#getNotificacion()
	 * @see #getContenedorRegistroBaseViewModel()
	 * @generated
	 */
	EAttribute getContenedorRegistroBaseViewModel_Notificacion();

	/**
	 * Returns the meta object for the attribute '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorRegistroBaseViewModel#getTxtFiltrarrutasViewModel <em>Txt Filtrarrutas View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Txt Filtrarrutas View Model</em>'.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorRegistroBaseViewModel#getTxtFiltrarrutasViewModel()
	 * @see #getContenedorRegistroBaseViewModel()
	 * @generated
	 */
	EAttribute getContenedorRegistroBaseViewModel_TxtFiltrarrutasViewModel();

	/**
	 * Returns the meta object for the containment reference list '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorRegistroBaseViewModel#getListaFiltrarrutasViewModel <em>Lista Filtrarrutas View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Filtrarrutas View Model</em>'.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorRegistroBaseViewModel#getListaFiltrarrutasViewModel()
	 * @see #getContenedorRegistroBaseViewModel()
	 * @generated
	 */
	EReference getContenedorRegistroBaseViewModel_ListaFiltrarrutasViewModel();

	/**
	 * Returns the meta object for the reference list '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorRegistroBaseViewModel#getFiltrarrutasViewModel <em>Filtrarrutas View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Filtrarrutas View Model</em>'.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorRegistroBaseViewModel#getFiltrarrutasViewModel()
	 * @see #getContenedorRegistroBaseViewModel()
	 * @generated
	 */
	EReference getContenedorRegistroBaseViewModel_FiltrarrutasViewModel();

	/**
	 * Returns the meta object for the reference '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorRegistroBaseViewModel#getSelectedFiltrarrutasViewModel <em>Selected Filtrarrutas View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Selected Filtrarrutas View Model</em>'.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorRegistroBaseViewModel#getSelectedFiltrarrutasViewModel()
	 * @see #getContenedorRegistroBaseViewModel()
	 * @generated
	 */
	EReference getContenedorRegistroBaseViewModel_SelectedFiltrarrutasViewModel();

	/**
	 * Returns the meta object for the containment reference '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorRegistroBaseViewModel#getTheInformaciongeneral <em>The Informaciongeneral</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Informaciongeneral</em>'.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorRegistroBaseViewModel#getTheInformaciongeneral()
	 * @see #getContenedorRegistroBaseViewModel()
	 * @generated
	 */
	EReference getContenedorRegistroBaseViewModel_TheInformaciongeneral();

	/**
	 * Returns the meta object for the containment reference '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorRegistroBaseViewModel#getTheBusqueda <em>The Busqueda</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Busqueda</em>'.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorRegistroBaseViewModel#getTheBusqueda()
	 * @see #getContenedorRegistroBaseViewModel()
	 * @generated
	 */
	EReference getContenedorRegistroBaseViewModel_TheBusqueda();

	/**
	 * Returns the meta object for the containment reference list '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorRegistroBaseViewModel#getListaRegistrosViewModel <em>Lista Registros View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Registros View Model</em>'.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorRegistroBaseViewModel#getListaRegistrosViewModel()
	 * @see #getContenedorRegistroBaseViewModel()
	 * @generated
	 */
	EReference getContenedorRegistroBaseViewModel_ListaRegistrosViewModel();

	/**
	 * Returns the meta object for the reference '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorRegistroBaseViewModel#getSelectedRegistrosViewModel <em>Selected Registros View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Selected Registros View Model</em>'.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorRegistroBaseViewModel#getSelectedRegistrosViewModel()
	 * @see #getContenedorRegistroBaseViewModel()
	 * @generated
	 */
	EReference getContenedorRegistroBaseViewModel_SelectedRegistrosViewModel();

	/**
	 * Returns the meta object for the reference list '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorRegistroBaseViewModel#getRegistrosViewModel <em>Registros View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Registros View Model</em>'.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorRegistroBaseViewModel#getRegistrosViewModel()
	 * @see #getContenedorRegistroBaseViewModel()
	 * @generated
	 */
	EReference getContenedorRegistroBaseViewModel_RegistrosViewModel();

	/**
	 * Returns the meta object for the containment reference list '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorRegistroBaseViewModel#getListaListapreciosViewModel <em>Lista Listaprecios View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Listaprecios View Model</em>'.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorRegistroBaseViewModel#getListaListapreciosViewModel()
	 * @see #getContenedorRegistroBaseViewModel()
	 * @generated
	 */
	EReference getContenedorRegistroBaseViewModel_ListaListapreciosViewModel();

	/**
	 * Returns the meta object for the reference '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorRegistroBaseViewModel#getSelectedListapreciosViewModel <em>Selected Listaprecios View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Selected Listaprecios View Model</em>'.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorRegistroBaseViewModel#getSelectedListapreciosViewModel()
	 * @see #getContenedorRegistroBaseViewModel()
	 * @generated
	 */
	EReference getContenedorRegistroBaseViewModel_SelectedListapreciosViewModel();

	/**
	 * Returns the meta object for the reference list '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorRegistroBaseViewModel#getListapreciosViewModel <em>Listaprecios View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Listaprecios View Model</em>'.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorRegistroBaseViewModel#getListapreciosViewModel()
	 * @see #getContenedorRegistroBaseViewModel()
	 * @generated
	 */
	EReference getContenedorRegistroBaseViewModel_ListapreciosViewModel();

	/**
	 * Returns the meta object for class '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.FiltrarrutasViewModel <em>Filtrarrutas View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filtrarrutas View Model</em>'.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.FiltrarrutasViewModel
	 * @generated
	 */
	EClass getFiltrarrutasViewModel();

	/**
	 * Returns the meta object for the container reference '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.FiltrarrutasViewModel#getOwnedByContenedorRegistroBaseViewModel <em>Owned By Contenedor Registro Base View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By Contenedor Registro Base View Model</em>'.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.FiltrarrutasViewModel#getOwnedByContenedorRegistroBaseViewModel()
	 * @see #getFiltrarrutasViewModel()
	 * @generated
	 */
	EReference getFiltrarrutasViewModel_OwnedByContenedorRegistroBaseViewModel();

	/**
	 * Returns the meta object for the reference '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.FiltrarrutasViewModel#getTheContenedorRegistroBaseViewModelFiltrarrutasViewModelFiltrarrutasViewModel <em>The Contenedor Registro Base View Model Filtrarrutas View Model Filtrarrutas View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>The Contenedor Registro Base View Model Filtrarrutas View Model Filtrarrutas View Model</em>'.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.FiltrarrutasViewModel#getTheContenedorRegistroBaseViewModelFiltrarrutasViewModelFiltrarrutasViewModel()
	 * @see #getFiltrarrutasViewModel()
	 * @generated
	 */
	EReference getFiltrarrutasViewModel_TheContenedorRegistroBaseViewModelFiltrarrutasViewModelFiltrarrutasViewModel();

	/**
	 * Returns the meta object for the reference '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.FiltrarrutasViewModel#getTheContenedorRegistroBaseViewModelselectedFiltrarrutasViewModel <em>The Contenedor Registro Base View Modelselected Filtrarrutas View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>The Contenedor Registro Base View Modelselected Filtrarrutas View Model</em>'.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.FiltrarrutasViewModel#getTheContenedorRegistroBaseViewModelselectedFiltrarrutasViewModel()
	 * @see #getFiltrarrutasViewModel()
	 * @generated
	 */
	EReference getFiltrarrutasViewModel_TheContenedorRegistroBaseViewModelselectedFiltrarrutasViewModel();

	/**
	 * Returns the meta object for the attribute '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.FiltrarrutasViewModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.FiltrarrutasViewModel#getName()
	 * @see #getFiltrarrutasViewModel()
	 * @generated
	 */
	EAttribute getFiltrarrutasViewModel_Name();

	/**
	 * Returns the meta object for class '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorInformaciongeneralViewModel <em>Contenedor Informaciongeneral View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contenedor Informaciongeneral View Model</em>'.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorInformaciongeneralViewModel
	 * @generated
	 */
	EClass getContenedorInformaciongeneralViewModel();

	/**
	 * Returns the meta object for the container reference '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorInformaciongeneralViewModel#getOwnedByContenedorRegistroBaseViewModelTheInformaciongeneral <em>Owned By Contenedor Registro Base View Model The Informaciongeneral</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By Contenedor Registro Base View Model The Informaciongeneral</em>'.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorInformaciongeneralViewModel#getOwnedByContenedorRegistroBaseViewModelTheInformaciongeneral()
	 * @see #getContenedorInformaciongeneralViewModel()
	 * @generated
	 */
	EReference getContenedorInformaciongeneralViewModel_OwnedByContenedorRegistroBaseViewModelTheInformaciongeneral();

	/**
	 * Returns the meta object for the attribute '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorInformaciongeneralViewModel#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorInformaciongeneralViewModel#getNombre()
	 * @see #getContenedorInformaciongeneralViewModel()
	 * @generated
	 */
	EAttribute getContenedorInformaciongeneralViewModel_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorInformaciongeneralViewModel#getHora <em>Hora</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hora</em>'.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorInformaciongeneralViewModel#getHora()
	 * @see #getContenedorInformaciongeneralViewModel()
	 * @generated
	 */
	EAttribute getContenedorInformaciongeneralViewModel_Hora();

	/**
	 * Returns the meta object for the attribute '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorInformaciongeneralViewModel#getRuta <em>Ruta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ruta</em>'.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorInformaciongeneralViewModel#getRuta()
	 * @see #getContenedorInformaciongeneralViewModel()
	 * @generated
	 */
	EAttribute getContenedorInformaciongeneralViewModel_Ruta();

	/**
	 * Returns the meta object for the attribute '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorInformaciongeneralViewModel#getFecha <em>Fecha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fecha</em>'.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorInformaciongeneralViewModel#getFecha()
	 * @see #getContenedorInformaciongeneralViewModel()
	 * @generated
	 */
	EAttribute getContenedorInformaciongeneralViewModel_Fecha();

	/**
	 * Returns the meta object for class '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorBusquedaViewModel <em>Contenedor Busqueda View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contenedor Busqueda View Model</em>'.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorBusquedaViewModel
	 * @generated
	 */
	EClass getContenedorBusquedaViewModel();

	/**
	 * Returns the meta object for the container reference '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorBusquedaViewModel#getOwnedByContenedorRegistroBaseViewModelTheBusqueda <em>Owned By Contenedor Registro Base View Model The Busqueda</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By Contenedor Registro Base View Model The Busqueda</em>'.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorBusquedaViewModel#getOwnedByContenedorRegistroBaseViewModelTheBusqueda()
	 * @see #getContenedorBusquedaViewModel()
	 * @generated
	 */
	EReference getContenedorBusquedaViewModel_OwnedByContenedorRegistroBaseViewModelTheBusqueda();

	/**
	 * Returns the meta object for the attribute '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorBusquedaViewModel#getTxtNombredelconductorViewModel <em>Txt Nombredelconductor View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Txt Nombredelconductor View Model</em>'.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorBusquedaViewModel#getTxtNombredelconductorViewModel()
	 * @see #getContenedorBusquedaViewModel()
	 * @generated
	 */
	EAttribute getContenedorBusquedaViewModel_TxtNombredelconductorViewModel();

	/**
	 * Returns the meta object for the attribute '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorBusquedaViewModel#getTxtRutadelconductorViewModel <em>Txt Rutadelconductor View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Txt Rutadelconductor View Model</em>'.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorBusquedaViewModel#getTxtRutadelconductorViewModel()
	 * @see #getContenedorBusquedaViewModel()
	 * @generated
	 */
	EAttribute getContenedorBusquedaViewModel_TxtRutadelconductorViewModel();

	/**
	 * Returns the meta object for the containment reference list '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorBusquedaViewModel#getListaNombredelconductorViewModel <em>Lista Nombredelconductor View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Nombredelconductor View Model</em>'.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorBusquedaViewModel#getListaNombredelconductorViewModel()
	 * @see #getContenedorBusquedaViewModel()
	 * @generated
	 */
	EReference getContenedorBusquedaViewModel_ListaNombredelconductorViewModel();

	/**
	 * Returns the meta object for the reference list '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorBusquedaViewModel#getNombredelconductorViewModel <em>Nombredelconductor View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Nombredelconductor View Model</em>'.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorBusquedaViewModel#getNombredelconductorViewModel()
	 * @see #getContenedorBusquedaViewModel()
	 * @generated
	 */
	EReference getContenedorBusquedaViewModel_NombredelconductorViewModel();

	/**
	 * Returns the meta object for the reference '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorBusquedaViewModel#getSelectedNombredelconductorViewModel <em>Selected Nombredelconductor View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Selected Nombredelconductor View Model</em>'.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorBusquedaViewModel#getSelectedNombredelconductorViewModel()
	 * @see #getContenedorBusquedaViewModel()
	 * @generated
	 */
	EReference getContenedorBusquedaViewModel_SelectedNombredelconductorViewModel();

	/**
	 * Returns the meta object for the containment reference list '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorBusquedaViewModel#getListaRutadelconductorViewModel <em>Lista Rutadelconductor View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Rutadelconductor View Model</em>'.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorBusquedaViewModel#getListaRutadelconductorViewModel()
	 * @see #getContenedorBusquedaViewModel()
	 * @generated
	 */
	EReference getContenedorBusquedaViewModel_ListaRutadelconductorViewModel();

	/**
	 * Returns the meta object for the reference list '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorBusquedaViewModel#getRutadelconductorViewModel <em>Rutadelconductor View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rutadelconductor View Model</em>'.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorBusquedaViewModel#getRutadelconductorViewModel()
	 * @see #getContenedorBusquedaViewModel()
	 * @generated
	 */
	EReference getContenedorBusquedaViewModel_RutadelconductorViewModel();

	/**
	 * Returns the meta object for the reference '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorBusquedaViewModel#getSelectedRutadelconductorViewModel <em>Selected Rutadelconductor View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Selected Rutadelconductor View Model</em>'.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorBusquedaViewModel#getSelectedRutadelconductorViewModel()
	 * @see #getContenedorBusquedaViewModel()
	 * @generated
	 */
	EReference getContenedorBusquedaViewModel_SelectedRutadelconductorViewModel();

	/**
	 * Returns the meta object for class '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.NombredelconductorViewModel <em>Nombredelconductor View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nombredelconductor View Model</em>'.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.NombredelconductorViewModel
	 * @generated
	 */
	EClass getNombredelconductorViewModel();

	/**
	 * Returns the meta object for the container reference '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.NombredelconductorViewModel#getOwnedContenedorBusquedaViewModel <em>Owned Contenedor Busqueda View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned Contenedor Busqueda View Model</em>'.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.NombredelconductorViewModel#getOwnedContenedorBusquedaViewModel()
	 * @see #getNombredelconductorViewModel()
	 * @generated
	 */
	EReference getNombredelconductorViewModel_OwnedContenedorBusquedaViewModel();

	/**
	 * Returns the meta object for the reference '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.NombredelconductorViewModel#getTheContenedorBusquedaViewModelNombredelconductorViewModelNombredelconductorViewModel <em>The Contenedor Busqueda View Model Nombredelconductor View Model Nombredelconductor View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>The Contenedor Busqueda View Model Nombredelconductor View Model Nombredelconductor View Model</em>'.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.NombredelconductorViewModel#getTheContenedorBusquedaViewModelNombredelconductorViewModelNombredelconductorViewModel()
	 * @see #getNombredelconductorViewModel()
	 * @generated
	 */
	EReference getNombredelconductorViewModel_TheContenedorBusquedaViewModelNombredelconductorViewModelNombredelconductorViewModel();

	/**
	 * Returns the meta object for the reference '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.NombredelconductorViewModel#getTheContenedorBusquedaViewModelselectedNombredelconductorViewModel <em>The Contenedor Busqueda View Modelselected Nombredelconductor View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>The Contenedor Busqueda View Modelselected Nombredelconductor View Model</em>'.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.NombredelconductorViewModel#getTheContenedorBusquedaViewModelselectedNombredelconductorViewModel()
	 * @see #getNombredelconductorViewModel()
	 * @generated
	 */
	EReference getNombredelconductorViewModel_TheContenedorBusquedaViewModelselectedNombredelconductorViewModel();

	/**
	 * Returns the meta object for the attribute '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.NombredelconductorViewModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.NombredelconductorViewModel#getName()
	 * @see #getNombredelconductorViewModel()
	 * @generated
	 */
	EAttribute getNombredelconductorViewModel_Name();

	/**
	 * Returns the meta object for class '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.RutadelconductorViewModel <em>Rutadelconductor View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rutadelconductor View Model</em>'.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.RutadelconductorViewModel
	 * @generated
	 */
	EClass getRutadelconductorViewModel();

	/**
	 * Returns the meta object for the container reference '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.RutadelconductorViewModel#getOwnedContenedorBusquedaViewModel <em>Owned Contenedor Busqueda View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned Contenedor Busqueda View Model</em>'.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.RutadelconductorViewModel#getOwnedContenedorBusquedaViewModel()
	 * @see #getRutadelconductorViewModel()
	 * @generated
	 */
	EReference getRutadelconductorViewModel_OwnedContenedorBusquedaViewModel();

	/**
	 * Returns the meta object for the reference '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.RutadelconductorViewModel#getTheContenedorBusquedaViewModelRutadelconductorViewModelRutadelconductorViewModel <em>The Contenedor Busqueda View Model Rutadelconductor View Model Rutadelconductor View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>The Contenedor Busqueda View Model Rutadelconductor View Model Rutadelconductor View Model</em>'.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.RutadelconductorViewModel#getTheContenedorBusquedaViewModelRutadelconductorViewModelRutadelconductorViewModel()
	 * @see #getRutadelconductorViewModel()
	 * @generated
	 */
	EReference getRutadelconductorViewModel_TheContenedorBusquedaViewModelRutadelconductorViewModelRutadelconductorViewModel();

	/**
	 * Returns the meta object for the reference '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.RutadelconductorViewModel#getTheContenedorBusquedaViewModelselectedRutadelconductorViewModel <em>The Contenedor Busqueda View Modelselected Rutadelconductor View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>The Contenedor Busqueda View Modelselected Rutadelconductor View Model</em>'.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.RutadelconductorViewModel#getTheContenedorBusquedaViewModelselectedRutadelconductorViewModel()
	 * @see #getRutadelconductorViewModel()
	 * @generated
	 */
	EReference getRutadelconductorViewModel_TheContenedorBusquedaViewModelselectedRutadelconductorViewModel();

	/**
	 * Returns the meta object for the attribute '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.RutadelconductorViewModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.RutadelconductorViewModel#getName()
	 * @see #getRutadelconductorViewModel()
	 * @generated
	 */
	EAttribute getRutadelconductorViewModel_Name();

	/**
	 * Returns the meta object for class '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.RegistrosViewModel <em>Registros View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Registros View Model</em>'.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.RegistrosViewModel
	 * @generated
	 */
	EClass getRegistrosViewModel();

	/**
	 * Returns the meta object for the container reference '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.RegistrosViewModel#getOwnedByContenedorRegistroBaseViewModel <em>Owned By Contenedor Registro Base View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By Contenedor Registro Base View Model</em>'.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.RegistrosViewModel#getOwnedByContenedorRegistroBaseViewModel()
	 * @see #getRegistrosViewModel()
	 * @generated
	 */
	EReference getRegistrosViewModel_OwnedByContenedorRegistroBaseViewModel();

	/**
	 * Returns the meta object for the reference '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.RegistrosViewModel#getTheContenedorRegistroBaseViewModelselectedRegistrosViewModel <em>The Contenedor Registro Base View Modelselected Registros View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>The Contenedor Registro Base View Modelselected Registros View Model</em>'.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.RegistrosViewModel#getTheContenedorRegistroBaseViewModelselectedRegistrosViewModel()
	 * @see #getRegistrosViewModel()
	 * @generated
	 */
	EReference getRegistrosViewModel_TheContenedorRegistroBaseViewModelselectedRegistrosViewModel();

	/**
	 * Returns the meta object for the reference '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.RegistrosViewModel#getTheContenedorRegistroBaseViewModelRegistrosViewModelRegistrosViewModel <em>The Contenedor Registro Base View Model Registros View Model Registros View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>The Contenedor Registro Base View Model Registros View Model Registros View Model</em>'.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.RegistrosViewModel#getTheContenedorRegistroBaseViewModelRegistrosViewModelRegistrosViewModel()
	 * @see #getRegistrosViewModel()
	 * @generated
	 */
	EReference getRegistrosViewModel_TheContenedorRegistroBaseViewModelRegistrosViewModelRegistrosViewModel();

	/**
	 * Returns the meta object for the attribute '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.RegistrosViewModel#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.RegistrosViewModel#getId()
	 * @see #getRegistrosViewModel()
	 * @generated
	 */
	EAttribute getRegistrosViewModel_Id();

	/**
	 * Returns the meta object for the attribute '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.RegistrosViewModel#getHora <em>Hora</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hora</em>'.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.RegistrosViewModel#getHora()
	 * @see #getRegistrosViewModel()
	 * @generated
	 */
	EAttribute getRegistrosViewModel_Hora();

	/**
	 * Returns the meta object for the attribute '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.RegistrosViewModel#getEstado <em>Estado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estado</em>'.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.RegistrosViewModel#getEstado()
	 * @see #getRegistrosViewModel()
	 * @generated
	 */
	EAttribute getRegistrosViewModel_Estado();

	/**
	 * Returns the meta object for the attribute '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.RegistrosViewModel#getIncidencia <em>Incidencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Incidencia</em>'.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.RegistrosViewModel#getIncidencia()
	 * @see #getRegistrosViewModel()
	 * @generated
	 */
	EAttribute getRegistrosViewModel_Incidencia();

	/**
	 * Returns the meta object for the attribute '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.RegistrosViewModel#getLugar <em>Lugar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lugar</em>'.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.RegistrosViewModel#getLugar()
	 * @see #getRegistrosViewModel()
	 * @generated
	 */
	EAttribute getRegistrosViewModel_Lugar();

	/**
	 * Returns the meta object for class '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ListapreciosViewModel <em>Listaprecios View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Listaprecios View Model</em>'.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ListapreciosViewModel
	 * @generated
	 */
	EClass getListapreciosViewModel();

	/**
	 * Returns the meta object for the container reference '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ListapreciosViewModel#getOwnedByContenedorRegistroBaseViewModel <em>Owned By Contenedor Registro Base View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By Contenedor Registro Base View Model</em>'.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ListapreciosViewModel#getOwnedByContenedorRegistroBaseViewModel()
	 * @see #getListapreciosViewModel()
	 * @generated
	 */
	EReference getListapreciosViewModel_OwnedByContenedorRegistroBaseViewModel();

	/**
	 * Returns the meta object for the reference '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ListapreciosViewModel#getTheContenedorRegistroBaseViewModelselectedListapreciosViewModel <em>The Contenedor Registro Base View Modelselected Listaprecios View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>The Contenedor Registro Base View Modelselected Listaprecios View Model</em>'.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ListapreciosViewModel#getTheContenedorRegistroBaseViewModelselectedListapreciosViewModel()
	 * @see #getListapreciosViewModel()
	 * @generated
	 */
	EReference getListapreciosViewModel_TheContenedorRegistroBaseViewModelselectedListapreciosViewModel();

	/**
	 * Returns the meta object for the reference '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ListapreciosViewModel#getTheContenedorRegistroBaseViewModelListapreciosViewModelListapreciosViewModel <em>The Contenedor Registro Base View Model Listaprecios View Model Listaprecios View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>The Contenedor Registro Base View Model Listaprecios View Model Listaprecios View Model</em>'.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ListapreciosViewModel#getTheContenedorRegistroBaseViewModelListapreciosViewModelListapreciosViewModel()
	 * @see #getListapreciosViewModel()
	 * @generated
	 */
	EReference getListapreciosViewModel_TheContenedorRegistroBaseViewModelListapreciosViewModelListapreciosViewModel();

	/**
	 * Returns the meta object for the attribute '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ListapreciosViewModel#getRuta1 <em>Ruta1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ruta1</em>'.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ListapreciosViewModel#getRuta1()
	 * @see #getListapreciosViewModel()
	 * @generated
	 */
	EAttribute getListapreciosViewModel_Ruta1();

	/**
	 * Returns the meta object for the attribute '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ListapreciosViewModel#getRuta2 <em>Ruta2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ruta2</em>'.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ListapreciosViewModel#getRuta2()
	 * @see #getListapreciosViewModel()
	 * @generated
	 */
	EAttribute getListapreciosViewModel_Ruta2();

	/**
	 * Returns the meta object for the attribute '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ListapreciosViewModel#getPecio <em>Pecio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pecio</em>'.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ListapreciosViewModel#getPecio()
	 * @see #getListapreciosViewModel()
	 * @generated
	 */
	EAttribute getListapreciosViewModel_Pecio();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ContenedorregistrobaseviewmodelFactory getContenedorregistrobaseviewmodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.ContenedorRegistroBaseViewModelImpl <em>Contenedor Registro Base View Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.ContenedorRegistroBaseViewModelImpl
		 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.ContenedorregistrobaseviewmodelPackageImpl#getContenedorRegistroBaseViewModel()
		 * @generated
		 */
		EClass CONTENEDOR_REGISTRO_BASE_VIEW_MODEL = eINSTANCE.getContenedorRegistroBaseViewModel();

		/**
		 * The meta object literal for the '<em><b>Owned By UI</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__OWNED_BY_UI = eINSTANCE.getContenedorRegistroBaseViewModel_OwnedByUI();

		/**
		 * The meta object literal for the '<em><b>Notificacion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__NOTIFICACION = eINSTANCE.getContenedorRegistroBaseViewModel_Notificacion();

		/**
		 * The meta object literal for the '<em><b>Txt Filtrarrutas View Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__TXT_FILTRARRUTAS_VIEW_MODEL = eINSTANCE.getContenedorRegistroBaseViewModel_TxtFiltrarrutasViewModel();

		/**
		 * The meta object literal for the '<em><b>Lista Filtrarrutas View Model</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__LISTA_FILTRARRUTAS_VIEW_MODEL = eINSTANCE.getContenedorRegistroBaseViewModel_ListaFiltrarrutasViewModel();

		/**
		 * The meta object literal for the '<em><b>Filtrarrutas View Model</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__FILTRARRUTAS_VIEW_MODEL = eINSTANCE.getContenedorRegistroBaseViewModel_FiltrarrutasViewModel();

		/**
		 * The meta object literal for the '<em><b>Selected Filtrarrutas View Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__SELECTED_FILTRARRUTAS_VIEW_MODEL = eINSTANCE.getContenedorRegistroBaseViewModel_SelectedFiltrarrutasViewModel();

		/**
		 * The meta object literal for the '<em><b>The Informaciongeneral</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__THE_INFORMACIONGENERAL = eINSTANCE.getContenedorRegistroBaseViewModel_TheInformaciongeneral();

		/**
		 * The meta object literal for the '<em><b>The Busqueda</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__THE_BUSQUEDA = eINSTANCE.getContenedorRegistroBaseViewModel_TheBusqueda();

		/**
		 * The meta object literal for the '<em><b>Lista Registros View Model</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__LISTA_REGISTROS_VIEW_MODEL = eINSTANCE.getContenedorRegistroBaseViewModel_ListaRegistrosViewModel();

		/**
		 * The meta object literal for the '<em><b>Selected Registros View Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__SELECTED_REGISTROS_VIEW_MODEL = eINSTANCE.getContenedorRegistroBaseViewModel_SelectedRegistrosViewModel();

		/**
		 * The meta object literal for the '<em><b>Registros View Model</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__REGISTROS_VIEW_MODEL = eINSTANCE.getContenedorRegistroBaseViewModel_RegistrosViewModel();

		/**
		 * The meta object literal for the '<em><b>Lista Listaprecios View Model</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__LISTA_LISTAPRECIOS_VIEW_MODEL = eINSTANCE.getContenedorRegistroBaseViewModel_ListaListapreciosViewModel();

		/**
		 * The meta object literal for the '<em><b>Selected Listaprecios View Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__SELECTED_LISTAPRECIOS_VIEW_MODEL = eINSTANCE.getContenedorRegistroBaseViewModel_SelectedListapreciosViewModel();

		/**
		 * The meta object literal for the '<em><b>Listaprecios View Model</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__LISTAPRECIOS_VIEW_MODEL = eINSTANCE.getContenedorRegistroBaseViewModel_ListapreciosViewModel();

		/**
		 * The meta object literal for the '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.FiltrarrutasViewModelImpl <em>Filtrarrutas View Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.FiltrarrutasViewModelImpl
		 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.ContenedorregistrobaseviewmodelPackageImpl#getFiltrarrutasViewModel()
		 * @generated
		 */
		EClass FILTRARRUTAS_VIEW_MODEL = eINSTANCE.getFiltrarrutasViewModel();

		/**
		 * The meta object literal for the '<em><b>Owned By Contenedor Registro Base View Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTRARRUTAS_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL = eINSTANCE.getFiltrarrutasViewModel_OwnedByContenedorRegistroBaseViewModel();

		/**
		 * The meta object literal for the '<em><b>The Contenedor Registro Base View Model Filtrarrutas View Model Filtrarrutas View Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTRARRUTAS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_FILTRARRUTAS_VIEW_MODEL_FILTRARRUTAS_VIEW_MODEL = eINSTANCE.getFiltrarrutasViewModel_TheContenedorRegistroBaseViewModelFiltrarrutasViewModelFiltrarrutasViewModel();

		/**
		 * The meta object literal for the '<em><b>The Contenedor Registro Base View Modelselected Filtrarrutas View Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTRARRUTAS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODELSELECTED_FILTRARRUTAS_VIEW_MODEL = eINSTANCE.getFiltrarrutasViewModel_TheContenedorRegistroBaseViewModelselectedFiltrarrutasViewModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTRARRUTAS_VIEW_MODEL__NAME = eINSTANCE.getFiltrarrutasViewModel_Name();

		/**
		 * The meta object literal for the '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.ContenedorInformaciongeneralViewModelImpl <em>Contenedor Informaciongeneral View Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.ContenedorInformaciongeneralViewModelImpl
		 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.ContenedorregistrobaseviewmodelPackageImpl#getContenedorInformaciongeneralViewModel()
		 * @generated
		 */
		EClass CONTENEDOR_INFORMACIONGENERAL_VIEW_MODEL = eINSTANCE.getContenedorInformaciongeneralViewModel();

		/**
		 * The meta object literal for the '<em><b>Owned By Contenedor Registro Base View Model The Informaciongeneral</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_INFORMACIONGENERAL_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_THE_INFORMACIONGENERAL = eINSTANCE.getContenedorInformaciongeneralViewModel_OwnedByContenedorRegistroBaseViewModelTheInformaciongeneral();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENEDOR_INFORMACIONGENERAL_VIEW_MODEL__NOMBRE = eINSTANCE.getContenedorInformaciongeneralViewModel_Nombre();

		/**
		 * The meta object literal for the '<em><b>Hora</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENEDOR_INFORMACIONGENERAL_VIEW_MODEL__HORA = eINSTANCE.getContenedorInformaciongeneralViewModel_Hora();

		/**
		 * The meta object literal for the '<em><b>Ruta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENEDOR_INFORMACIONGENERAL_VIEW_MODEL__RUTA = eINSTANCE.getContenedorInformaciongeneralViewModel_Ruta();

		/**
		 * The meta object literal for the '<em><b>Fecha</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENEDOR_INFORMACIONGENERAL_VIEW_MODEL__FECHA = eINSTANCE.getContenedorInformaciongeneralViewModel_Fecha();

		/**
		 * The meta object literal for the '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.ContenedorBusquedaViewModelImpl <em>Contenedor Busqueda View Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.ContenedorBusquedaViewModelImpl
		 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.ContenedorregistrobaseviewmodelPackageImpl#getContenedorBusquedaViewModel()
		 * @generated
		 */
		EClass CONTENEDOR_BUSQUEDA_VIEW_MODEL = eINSTANCE.getContenedorBusquedaViewModel();

		/**
		 * The meta object literal for the '<em><b>Owned By Contenedor Registro Base View Model The Busqueda</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_BUSQUEDA_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_THE_BUSQUEDA = eINSTANCE.getContenedorBusquedaViewModel_OwnedByContenedorRegistroBaseViewModelTheBusqueda();

		/**
		 * The meta object literal for the '<em><b>Txt Nombredelconductor View Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENEDOR_BUSQUEDA_VIEW_MODEL__TXT_NOMBREDELCONDUCTOR_VIEW_MODEL = eINSTANCE.getContenedorBusquedaViewModel_TxtNombredelconductorViewModel();

		/**
		 * The meta object literal for the '<em><b>Txt Rutadelconductor View Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENEDOR_BUSQUEDA_VIEW_MODEL__TXT_RUTADELCONDUCTOR_VIEW_MODEL = eINSTANCE.getContenedorBusquedaViewModel_TxtRutadelconductorViewModel();

		/**
		 * The meta object literal for the '<em><b>Lista Nombredelconductor View Model</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_BUSQUEDA_VIEW_MODEL__LISTA_NOMBREDELCONDUCTOR_VIEW_MODEL = eINSTANCE.getContenedorBusquedaViewModel_ListaNombredelconductorViewModel();

		/**
		 * The meta object literal for the '<em><b>Nombredelconductor View Model</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_BUSQUEDA_VIEW_MODEL__NOMBREDELCONDUCTOR_VIEW_MODEL = eINSTANCE.getContenedorBusquedaViewModel_NombredelconductorViewModel();

		/**
		 * The meta object literal for the '<em><b>Selected Nombredelconductor View Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_BUSQUEDA_VIEW_MODEL__SELECTED_NOMBREDELCONDUCTOR_VIEW_MODEL = eINSTANCE.getContenedorBusquedaViewModel_SelectedNombredelconductorViewModel();

		/**
		 * The meta object literal for the '<em><b>Lista Rutadelconductor View Model</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_BUSQUEDA_VIEW_MODEL__LISTA_RUTADELCONDUCTOR_VIEW_MODEL = eINSTANCE.getContenedorBusquedaViewModel_ListaRutadelconductorViewModel();

		/**
		 * The meta object literal for the '<em><b>Rutadelconductor View Model</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_BUSQUEDA_VIEW_MODEL__RUTADELCONDUCTOR_VIEW_MODEL = eINSTANCE.getContenedorBusquedaViewModel_RutadelconductorViewModel();

		/**
		 * The meta object literal for the '<em><b>Selected Rutadelconductor View Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_BUSQUEDA_VIEW_MODEL__SELECTED_RUTADELCONDUCTOR_VIEW_MODEL = eINSTANCE.getContenedorBusquedaViewModel_SelectedRutadelconductorViewModel();

		/**
		 * The meta object literal for the '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.NombredelconductorViewModelImpl <em>Nombredelconductor View Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.NombredelconductorViewModelImpl
		 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.ContenedorregistrobaseviewmodelPackageImpl#getNombredelconductorViewModel()
		 * @generated
		 */
		EClass NOMBREDELCONDUCTOR_VIEW_MODEL = eINSTANCE.getNombredelconductorViewModel();

		/**
		 * The meta object literal for the '<em><b>Owned Contenedor Busqueda View Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOMBREDELCONDUCTOR_VIEW_MODEL__OWNED_CONTENEDOR_BUSQUEDA_VIEW_MODEL = eINSTANCE.getNombredelconductorViewModel_OwnedContenedorBusquedaViewModel();

		/**
		 * The meta object literal for the '<em><b>The Contenedor Busqueda View Model Nombredelconductor View Model Nombredelconductor View Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOMBREDELCONDUCTOR_VIEW_MODEL__THE_CONTENEDOR_BUSQUEDA_VIEW_MODEL_NOMBREDELCONDUCTOR_VIEW_MODEL_NOMBREDELCONDUCTOR_VIEW_MODEL = eINSTANCE.getNombredelconductorViewModel_TheContenedorBusquedaViewModelNombredelconductorViewModelNombredelconductorViewModel();

		/**
		 * The meta object literal for the '<em><b>The Contenedor Busqueda View Modelselected Nombredelconductor View Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOMBREDELCONDUCTOR_VIEW_MODEL__THE_CONTENEDOR_BUSQUEDA_VIEW_MODELSELECTED_NOMBREDELCONDUCTOR_VIEW_MODEL = eINSTANCE.getNombredelconductorViewModel_TheContenedorBusquedaViewModelselectedNombredelconductorViewModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOMBREDELCONDUCTOR_VIEW_MODEL__NAME = eINSTANCE.getNombredelconductorViewModel_Name();

		/**
		 * The meta object literal for the '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.RutadelconductorViewModelImpl <em>Rutadelconductor View Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.RutadelconductorViewModelImpl
		 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.ContenedorregistrobaseviewmodelPackageImpl#getRutadelconductorViewModel()
		 * @generated
		 */
		EClass RUTADELCONDUCTOR_VIEW_MODEL = eINSTANCE.getRutadelconductorViewModel();

		/**
		 * The meta object literal for the '<em><b>Owned Contenedor Busqueda View Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUTADELCONDUCTOR_VIEW_MODEL__OWNED_CONTENEDOR_BUSQUEDA_VIEW_MODEL = eINSTANCE.getRutadelconductorViewModel_OwnedContenedorBusquedaViewModel();

		/**
		 * The meta object literal for the '<em><b>The Contenedor Busqueda View Model Rutadelconductor View Model Rutadelconductor View Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUTADELCONDUCTOR_VIEW_MODEL__THE_CONTENEDOR_BUSQUEDA_VIEW_MODEL_RUTADELCONDUCTOR_VIEW_MODEL_RUTADELCONDUCTOR_VIEW_MODEL = eINSTANCE.getRutadelconductorViewModel_TheContenedorBusquedaViewModelRutadelconductorViewModelRutadelconductorViewModel();

		/**
		 * The meta object literal for the '<em><b>The Contenedor Busqueda View Modelselected Rutadelconductor View Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUTADELCONDUCTOR_VIEW_MODEL__THE_CONTENEDOR_BUSQUEDA_VIEW_MODELSELECTED_RUTADELCONDUCTOR_VIEW_MODEL = eINSTANCE.getRutadelconductorViewModel_TheContenedorBusquedaViewModelselectedRutadelconductorViewModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUTADELCONDUCTOR_VIEW_MODEL__NAME = eINSTANCE.getRutadelconductorViewModel_Name();

		/**
		 * The meta object literal for the '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.RegistrosViewModelImpl <em>Registros View Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.RegistrosViewModelImpl
		 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.ContenedorregistrobaseviewmodelPackageImpl#getRegistrosViewModel()
		 * @generated
		 */
		EClass REGISTROS_VIEW_MODEL = eINSTANCE.getRegistrosViewModel();

		/**
		 * The meta object literal for the '<em><b>Owned By Contenedor Registro Base View Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTROS_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL = eINSTANCE.getRegistrosViewModel_OwnedByContenedorRegistroBaseViewModel();

		/**
		 * The meta object literal for the '<em><b>The Contenedor Registro Base View Modelselected Registros View Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTROS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODELSELECTED_REGISTROS_VIEW_MODEL = eINSTANCE.getRegistrosViewModel_TheContenedorRegistroBaseViewModelselectedRegistrosViewModel();

		/**
		 * The meta object literal for the '<em><b>The Contenedor Registro Base View Model Registros View Model Registros View Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTROS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_REGISTROS_VIEW_MODEL_REGISTROS_VIEW_MODEL = eINSTANCE.getRegistrosViewModel_TheContenedorRegistroBaseViewModelRegistrosViewModelRegistrosViewModel();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTROS_VIEW_MODEL__ID = eINSTANCE.getRegistrosViewModel_Id();

		/**
		 * The meta object literal for the '<em><b>Hora</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTROS_VIEW_MODEL__HORA = eINSTANCE.getRegistrosViewModel_Hora();

		/**
		 * The meta object literal for the '<em><b>Estado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTROS_VIEW_MODEL__ESTADO = eINSTANCE.getRegistrosViewModel_Estado();

		/**
		 * The meta object literal for the '<em><b>Incidencia</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTROS_VIEW_MODEL__INCIDENCIA = eINSTANCE.getRegistrosViewModel_Incidencia();

		/**
		 * The meta object literal for the '<em><b>Lugar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTROS_VIEW_MODEL__LUGAR = eINSTANCE.getRegistrosViewModel_Lugar();

		/**
		 * The meta object literal for the '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.ListapreciosViewModelImpl <em>Listaprecios View Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.ListapreciosViewModelImpl
		 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.ContenedorregistrobaseviewmodelPackageImpl#getListapreciosViewModel()
		 * @generated
		 */
		EClass LISTAPRECIOS_VIEW_MODEL = eINSTANCE.getListapreciosViewModel();

		/**
		 * The meta object literal for the '<em><b>Owned By Contenedor Registro Base View Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LISTAPRECIOS_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL = eINSTANCE.getListapreciosViewModel_OwnedByContenedorRegistroBaseViewModel();

		/**
		 * The meta object literal for the '<em><b>The Contenedor Registro Base View Modelselected Listaprecios View Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LISTAPRECIOS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODELSELECTED_LISTAPRECIOS_VIEW_MODEL = eINSTANCE.getListapreciosViewModel_TheContenedorRegistroBaseViewModelselectedListapreciosViewModel();

		/**
		 * The meta object literal for the '<em><b>The Contenedor Registro Base View Model Listaprecios View Model Listaprecios View Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LISTAPRECIOS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_LISTAPRECIOS_VIEW_MODEL_LISTAPRECIOS_VIEW_MODEL = eINSTANCE.getListapreciosViewModel_TheContenedorRegistroBaseViewModelListapreciosViewModelListapreciosViewModel();

		/**
		 * The meta object literal for the '<em><b>Ruta1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LISTAPRECIOS_VIEW_MODEL__RUTA1 = eINSTANCE.getListapreciosViewModel_Ruta1();

		/**
		 * The meta object literal for the '<em><b>Ruta2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LISTAPRECIOS_VIEW_MODEL__RUTA2 = eINSTANCE.getListapreciosViewModel_Ruta2();

		/**
		 * The meta object literal for the '<em><b>Pecio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LISTAPRECIOS_VIEW_MODEL__PECIO = eINSTANCE.getListapreciosViewModel_Pecio();

	}

} //ContenedorregistrobaseviewmodelPackage
