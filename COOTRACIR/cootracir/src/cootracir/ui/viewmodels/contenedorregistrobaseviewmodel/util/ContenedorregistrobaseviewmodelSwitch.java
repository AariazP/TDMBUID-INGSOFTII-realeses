/**
 */
package cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.util;

import cootracir.ui.viewmodels.ViewModel;

import cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelPackage
 * @generated
 */
public class ContenedorregistrobaseviewmodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ContenedorregistrobaseviewmodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorregistrobaseviewmodelSwitch() {
		if (modelPackage == null) {
			modelPackage = ContenedorregistrobaseviewmodelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL: {
				ContenedorRegistroBaseViewModel contenedorRegistroBaseViewModel = (ContenedorRegistroBaseViewModel)theEObject;
				T result = caseContenedorRegistroBaseViewModel(contenedorRegistroBaseViewModel);
				if (result == null) result = caseViewModel(contenedorRegistroBaseViewModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContenedorregistrobaseviewmodelPackage.FILTRARRUTAS_VIEW_MODEL: {
				FiltrarrutasViewModel filtrarrutasViewModel = (FiltrarrutasViewModel)theEObject;
				T result = caseFiltrarrutasViewModel(filtrarrutasViewModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_INFORMACIONGENERAL_VIEW_MODEL: {
				ContenedorInformaciongeneralViewModel contenedorInformaciongeneralViewModel = (ContenedorInformaciongeneralViewModel)theEObject;
				T result = caseContenedorInformaciongeneralViewModel(contenedorInformaciongeneralViewModel);
				if (result == null) result = caseViewModel(contenedorInformaciongeneralViewModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL: {
				ContenedorBusquedaViewModel contenedorBusquedaViewModel = (ContenedorBusquedaViewModel)theEObject;
				T result = caseContenedorBusquedaViewModel(contenedorBusquedaViewModel);
				if (result == null) result = caseViewModel(contenedorBusquedaViewModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContenedorregistrobaseviewmodelPackage.NOMBREDELCONDUCTOR_VIEW_MODEL: {
				NombredelconductorViewModel nombredelconductorViewModel = (NombredelconductorViewModel)theEObject;
				T result = caseNombredelconductorViewModel(nombredelconductorViewModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContenedorregistrobaseviewmodelPackage.RUTADELCONDUCTOR_VIEW_MODEL: {
				RutadelconductorViewModel rutadelconductorViewModel = (RutadelconductorViewModel)theEObject;
				T result = caseRutadelconductorViewModel(rutadelconductorViewModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContenedorregistrobaseviewmodelPackage.REGISTROS_VIEW_MODEL: {
				RegistrosViewModel registrosViewModel = (RegistrosViewModel)theEObject;
				T result = caseRegistrosViewModel(registrosViewModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContenedorregistrobaseviewmodelPackage.LISTAPRECIOS_VIEW_MODEL: {
				ListapreciosViewModel listapreciosViewModel = (ListapreciosViewModel)theEObject;
				T result = caseListapreciosViewModel(listapreciosViewModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contenedor Registro Base View Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contenedor Registro Base View Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContenedorRegistroBaseViewModel(ContenedorRegistroBaseViewModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filtrarrutas View Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filtrarrutas View Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFiltrarrutasViewModel(FiltrarrutasViewModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contenedor Informaciongeneral View Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contenedor Informaciongeneral View Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContenedorInformaciongeneralViewModel(ContenedorInformaciongeneralViewModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contenedor Busqueda View Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contenedor Busqueda View Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContenedorBusquedaViewModel(ContenedorBusquedaViewModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nombredelconductor View Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nombredelconductor View Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNombredelconductorViewModel(NombredelconductorViewModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rutadelconductor View Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rutadelconductor View Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRutadelconductorViewModel(RutadelconductorViewModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Registros View Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Registros View Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegistrosViewModel(RegistrosViewModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Listaprecios View Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Listaprecios View Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListapreciosViewModel(ListapreciosViewModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewModel(ViewModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ContenedorregistrobaseviewmodelSwitch
