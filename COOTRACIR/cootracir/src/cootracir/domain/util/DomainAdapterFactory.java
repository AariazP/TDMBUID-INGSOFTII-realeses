/**
 */
package cootracir.domain.util;

import cootracir.domain.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see cootracir.domain.DomainPackage
 * @generated
 */
public class DomainAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DomainPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DomainPackage.eINSTANCE;
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
	protected DomainSwitch<Adapter> modelSwitch =
		new DomainSwitch<Adapter>() {
			@Override
			public Adapter caseAnalista(Analista object) {
				return createAnalistaAdapter();
			}
			@Override
			public Adapter caseBus(Bus object) {
				return createBusAdapter();
			}
			@Override
			public Adapter caseCajero(Cajero object) {
				return createCajeroAdapter();
			}
			@Override
			public Adapter caseConductor(Conductor object) {
				return createConductorAdapter();
			}
			@Override
			public Adapter caseDetalleRegistro(DetalleRegistro object) {
				return createDetalleRegistroAdapter();
			}
			@Override
			public Adapter caseDomain(Domain object) {
				return createDomainAdapter();
			}
			@Override
			public Adapter caseFactoryGestionHumana(FactoryGestionHumana object) {
				return createFactoryGestionHumanaAdapter();
			}
			@Override
			public Adapter caseFactoryGestionInventario(FactoryGestionInventario object) {
				return createFactoryGestionInventarioAdapter();
			}
			@Override
			public Adapter caseLiquidacion(Liquidacion object) {
				return createLiquidacionAdapter();
			}
			@Override
			public Adapter caseRegistrador(Registrador object) {
				return createRegistradorAdapter();
			}
			@Override
			public Adapter caseRuta(Ruta object) {
				return createRutaAdapter();
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
	 * Creates a new adapter for an object of class '{@link cootracir.domain.Analista <em>Analista</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cootracir.domain.Analista
	 * @generated
	 */
	public Adapter createAnalistaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cootracir.domain.Bus <em>Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cootracir.domain.Bus
	 * @generated
	 */
	public Adapter createBusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cootracir.domain.Cajero <em>Cajero</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cootracir.domain.Cajero
	 * @generated
	 */
	public Adapter createCajeroAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cootracir.domain.Conductor <em>Conductor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cootracir.domain.Conductor
	 * @generated
	 */
	public Adapter createConductorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cootracir.domain.DetalleRegistro <em>Detalle Registro</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cootracir.domain.DetalleRegistro
	 * @generated
	 */
	public Adapter createDetalleRegistroAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cootracir.domain.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cootracir.domain.Domain
	 * @generated
	 */
	public Adapter createDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cootracir.domain.FactoryGestionHumana <em>Factory Gestion Humana</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cootracir.domain.FactoryGestionHumana
	 * @generated
	 */
	public Adapter createFactoryGestionHumanaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cootracir.domain.FactoryGestionInventario <em>Factory Gestion Inventario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cootracir.domain.FactoryGestionInventario
	 * @generated
	 */
	public Adapter createFactoryGestionInventarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cootracir.domain.Liquidacion <em>Liquidacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cootracir.domain.Liquidacion
	 * @generated
	 */
	public Adapter createLiquidacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cootracir.domain.Registrador <em>Registrador</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cootracir.domain.Registrador
	 * @generated
	 */
	public Adapter createRegistradorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cootracir.domain.Ruta <em>Ruta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cootracir.domain.Ruta
	 * @generated
	 */
	public Adapter createRutaAdapter() {
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

} //DomainAdapterFactory
