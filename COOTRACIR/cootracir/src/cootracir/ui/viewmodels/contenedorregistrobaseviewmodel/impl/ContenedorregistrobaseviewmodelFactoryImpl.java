/**
 */
package cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl;

import cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContenedorregistrobaseviewmodelFactoryImpl extends EFactoryImpl implements ContenedorregistrobaseviewmodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ContenedorregistrobaseviewmodelFactory init() {
		try {
			ContenedorregistrobaseviewmodelFactory theContenedorregistrobaseviewmodelFactory = (ContenedorregistrobaseviewmodelFactory)EPackage.Registry.INSTANCE.getEFactory(ContenedorregistrobaseviewmodelPackage.eNS_URI);
			if (theContenedorregistrobaseviewmodelFactory != null) {
				return theContenedorregistrobaseviewmodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ContenedorregistrobaseviewmodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorregistrobaseviewmodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL: return createContenedorRegistroBaseViewModel();
			case ContenedorregistrobaseviewmodelPackage.FILTRARRUTAS_VIEW_MODEL: return createFiltrarrutasViewModel();
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_INFORMACIONGENERAL_VIEW_MODEL: return createContenedorInformaciongeneralViewModel();
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL: return createContenedorBusquedaViewModel();
			case ContenedorregistrobaseviewmodelPackage.NOMBREDELCONDUCTOR_VIEW_MODEL: return createNombredelconductorViewModel();
			case ContenedorregistrobaseviewmodelPackage.RUTADELCONDUCTOR_VIEW_MODEL: return createRutadelconductorViewModel();
			case ContenedorregistrobaseviewmodelPackage.REGISTROS_VIEW_MODEL: return createRegistrosViewModel();
			case ContenedorregistrobaseviewmodelPackage.LISTAPRECIOS_VIEW_MODEL: return createListapreciosViewModel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorRegistroBaseViewModel createContenedorRegistroBaseViewModel() {
		ContenedorRegistroBaseViewModelImpl contenedorRegistroBaseViewModel = new ContenedorRegistroBaseViewModelImpl();
		return contenedorRegistroBaseViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FiltrarrutasViewModel createFiltrarrutasViewModel() {
		FiltrarrutasViewModelImpl filtrarrutasViewModel = new FiltrarrutasViewModelImpl();
		return filtrarrutasViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorInformaciongeneralViewModel createContenedorInformaciongeneralViewModel() {
		ContenedorInformaciongeneralViewModelImpl contenedorInformaciongeneralViewModel = new ContenedorInformaciongeneralViewModelImpl();
		return contenedorInformaciongeneralViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorBusquedaViewModel createContenedorBusquedaViewModel() {
		ContenedorBusquedaViewModelImpl contenedorBusquedaViewModel = new ContenedorBusquedaViewModelImpl();
		return contenedorBusquedaViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NombredelconductorViewModel createNombredelconductorViewModel() {
		NombredelconductorViewModelImpl nombredelconductorViewModel = new NombredelconductorViewModelImpl();
		return nombredelconductorViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RutadelconductorViewModel createRutadelconductorViewModel() {
		RutadelconductorViewModelImpl rutadelconductorViewModel = new RutadelconductorViewModelImpl();
		return rutadelconductorViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistrosViewModel createRegistrosViewModel() {
		RegistrosViewModelImpl registrosViewModel = new RegistrosViewModelImpl();
		return registrosViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListapreciosViewModel createListapreciosViewModel() {
		ListapreciosViewModelImpl listapreciosViewModel = new ListapreciosViewModelImpl();
		return listapreciosViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorregistrobaseviewmodelPackage getContenedorregistrobaseviewmodelPackage() {
		return (ContenedorregistrobaseviewmodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ContenedorregistrobaseviewmodelPackage getPackage() {
		return ContenedorregistrobaseviewmodelPackage.eINSTANCE;
	}

} //ContenedorregistrobaseviewmodelFactoryImpl
