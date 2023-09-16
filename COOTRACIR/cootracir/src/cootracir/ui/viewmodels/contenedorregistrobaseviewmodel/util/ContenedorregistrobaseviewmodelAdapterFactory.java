/**
 */
package cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.util;

import cootracir.ui.viewmodels.ViewModel;

import cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelPackage
 * @generated
 */
public class ContenedorregistrobaseviewmodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ContenedorregistrobaseviewmodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorregistrobaseviewmodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ContenedorregistrobaseviewmodelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContenedorregistrobaseviewmodelSwitch<Adapter> modelSwitch =
		new ContenedorregistrobaseviewmodelSwitch<Adapter>() {
			@Override
			public Adapter caseContenedorRegistroBaseViewModel(ContenedorRegistroBaseViewModel object) {
				return createContenedorRegistroBaseViewModelAdapter();
			}
			@Override
			public Adapter caseFiltrarrutasViewModel(FiltrarrutasViewModel object) {
				return createFiltrarrutasViewModelAdapter();
			}
			@Override
			public Adapter caseContenedorInformaciongeneralViewModel(ContenedorInformaciongeneralViewModel object) {
				return createContenedorInformaciongeneralViewModelAdapter();
			}
			@Override
			public Adapter caseContenedorBusquedaViewModel(ContenedorBusquedaViewModel object) {
				return createContenedorBusquedaViewModelAdapter();
			}
			@Override
			public Adapter caseNombredelconductorViewModel(NombredelconductorViewModel object) {
				return createNombredelconductorViewModelAdapter();
			}
			@Override
			public Adapter caseRutadelconductorViewModel(RutadelconductorViewModel object) {
				return createRutadelconductorViewModelAdapter();
			}
			@Override
			public Adapter caseRegistrosViewModel(RegistrosViewModel object) {
				return createRegistrosViewModelAdapter();
			}
			@Override
			public Adapter caseListapreciosViewModel(ListapreciosViewModel object) {
				return createListapreciosViewModelAdapter();
			}
			@Override
			public Adapter caseViewModel(ViewModel object) {
				return createViewModelAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorRegistroBaseViewModel <em>Contenedor Registro Base View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorRegistroBaseViewModel
	 * @generated
	 */
	public Adapter createContenedorRegistroBaseViewModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.FiltrarrutasViewModel <em>Filtrarrutas View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.FiltrarrutasViewModel
	 * @generated
	 */
	public Adapter createFiltrarrutasViewModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorInformaciongeneralViewModel <em>Contenedor Informaciongeneral View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorInformaciongeneralViewModel
	 * @generated
	 */
	public Adapter createContenedorInformaciongeneralViewModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorBusquedaViewModel <em>Contenedor Busqueda View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorBusquedaViewModel
	 * @generated
	 */
	public Adapter createContenedorBusquedaViewModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.NombredelconductorViewModel <em>Nombredelconductor View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.NombredelconductorViewModel
	 * @generated
	 */
	public Adapter createNombredelconductorViewModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.RutadelconductorViewModel <em>Rutadelconductor View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.RutadelconductorViewModel
	 * @generated
	 */
	public Adapter createRutadelconductorViewModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.RegistrosViewModel <em>Registros View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.RegistrosViewModel
	 * @generated
	 */
	public Adapter createRegistrosViewModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ListapreciosViewModel <em>Listaprecios View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ListapreciosViewModel
	 * @generated
	 */
	public Adapter createListapreciosViewModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cootracir.ui.viewmodels.ViewModel <em>View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cootracir.ui.viewmodels.ViewModel
	 * @generated
	 */
	public Adapter createViewModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ContenedorregistrobaseviewmodelAdapterFactory
