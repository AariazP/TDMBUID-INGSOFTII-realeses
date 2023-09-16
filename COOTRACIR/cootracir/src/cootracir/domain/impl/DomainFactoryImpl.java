/**
 */
package cootracir.domain.impl;

import cootracir.domain.*;

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
public class DomainFactoryImpl extends EFactoryImpl implements DomainFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DomainFactory init() {
		try {
			DomainFactory theDomainFactory = (DomainFactory)EPackage.Registry.INSTANCE.getEFactory(DomainPackage.eNS_URI);
			if (theDomainFactory != null) {
				return theDomainFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DomainFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainFactoryImpl() {
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
			case DomainPackage.ANALISTA: return createAnalista();
			case DomainPackage.BUS: return createBus();
			case DomainPackage.CAJERO: return createCajero();
			case DomainPackage.CONDUCTOR: return createConductor();
			case DomainPackage.DETALLE_REGISTRO: return createDetalleRegistro();
			case DomainPackage.DOMAIN: return createDomain();
			case DomainPackage.FACTORY_GESTION_HUMANA: return createFactoryGestionHumana();
			case DomainPackage.FACTORY_GESTION_INVENTARIO: return createFactoryGestionInventario();
			case DomainPackage.LIQUIDACION: return createLiquidacion();
			case DomainPackage.REGISTRADOR: return createRegistrador();
			case DomainPackage.RUTA: return createRuta();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Analista createAnalista() {
		AnalistaImpl analista = new AnalistaImpl();
		return analista;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bus createBus() {
		BusImpl bus = new BusImpl();
		return bus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cajero createCajero() {
		CajeroImpl cajero = new CajeroImpl();
		return cajero;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conductor createConductor() {
		ConductorImpl conductor = new ConductorImpl();
		return conductor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetalleRegistro createDetalleRegistro() {
		DetalleRegistroImpl detalleRegistro = new DetalleRegistroImpl();
		return detalleRegistro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain createDomain() {
		DomainImpl domain = new DomainImpl();
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactoryGestionHumana createFactoryGestionHumana() {
		FactoryGestionHumanaImpl factoryGestionHumana = new FactoryGestionHumanaImpl();
		return factoryGestionHumana;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactoryGestionInventario createFactoryGestionInventario() {
		FactoryGestionInventarioImpl factoryGestionInventario = new FactoryGestionInventarioImpl();
		return factoryGestionInventario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Liquidacion createLiquidacion() {
		LiquidacionImpl liquidacion = new LiquidacionImpl();
		return liquidacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Registrador createRegistrador() {
		RegistradorImpl registrador = new RegistradorImpl();
		return registrador;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ruta createRuta() {
		RutaImpl ruta = new RutaImpl();
		return ruta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainPackage getDomainPackage() {
		return (DomainPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DomainPackage getPackage() {
		return DomainPackage.eINSTANCE;
	}

} //DomainFactoryImpl
