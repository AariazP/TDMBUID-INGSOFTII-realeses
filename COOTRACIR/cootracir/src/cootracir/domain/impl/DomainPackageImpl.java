/**
 */
package cootracir.domain.impl;

import cootracir.cootracirPackage;

import cootracir.domain.Analista;
import cootracir.domain.Bus;
import cootracir.domain.Cajero;
import cootracir.domain.Conductor;
import cootracir.domain.DetalleRegistro;
import cootracir.domain.Domain;
import cootracir.domain.DomainFactory;
import cootracir.domain.DomainPackage;
import cootracir.domain.FactoryGestionHumana;
import cootracir.domain.FactoryGestionInventario;
import cootracir.domain.Liquidacion;
import cootracir.domain.Registrador;
import cootracir.domain.Ruta;

import cootracir.domain.main1.Main1Package;

import cootracir.domain.main1.impl.Main1PackageImpl;

import cootracir.impl.cootracirPackageImpl;

import cootracir.ui.UiPackage;

import cootracir.ui.impl.UiPackageImpl;

import cootracir.ui.viewmodels.ViewmodelsPackage;

import cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelPackage;

import cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.ContenedorregistrobaseviewmodelPackageImpl;

import cootracir.ui.viewmodels.impl.ViewmodelsPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DomainPackageImpl extends EPackageImpl implements DomainPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analistaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass busEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cajeroEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conductorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass detalleRegistroEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass factoryGestionHumanaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass factoryGestionInventarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liquidacionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registradorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rutaEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see cootracir.domain.DomainPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DomainPackageImpl() {
		super(eNS_URI, DomainFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DomainPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DomainPackage init() {
		if (isInited) return (DomainPackage)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI);

		// Obtain or create and register package
		DomainPackageImpl theDomainPackage = (DomainPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DomainPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DomainPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		cootracirPackageImpl thecootracirPackage = (cootracirPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(cootracirPackage.eNS_URI) instanceof cootracirPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(cootracirPackage.eNS_URI) : cootracirPackage.eINSTANCE);
		Main1PackageImpl theMain1Package = (Main1PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Main1Package.eNS_URI) instanceof Main1PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Main1Package.eNS_URI) : Main1Package.eINSTANCE);
		UiPackageImpl theUiPackage = (UiPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) instanceof UiPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) : UiPackage.eINSTANCE);
		ViewmodelsPackageImpl theViewmodelsPackage = (ViewmodelsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ViewmodelsPackage.eNS_URI) instanceof ViewmodelsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ViewmodelsPackage.eNS_URI) : ViewmodelsPackage.eINSTANCE);
		ContenedorregistrobaseviewmodelPackageImpl theContenedorregistrobaseviewmodelPackage = (ContenedorregistrobaseviewmodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContenedorregistrobaseviewmodelPackage.eNS_URI) instanceof ContenedorregistrobaseviewmodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContenedorregistrobaseviewmodelPackage.eNS_URI) : ContenedorregistrobaseviewmodelPackage.eINSTANCE);

		// Create package meta-data objects
		theDomainPackage.createPackageContents();
		thecootracirPackage.createPackageContents();
		theMain1Package.createPackageContents();
		theUiPackage.createPackageContents();
		theViewmodelsPackage.createPackageContents();
		theContenedorregistrobaseviewmodelPackage.createPackageContents();

		// Initialize created meta-data
		theDomainPackage.initializePackageContents();
		thecootracirPackage.initializePackageContents();
		theMain1Package.initializePackageContents();
		theUiPackage.initializePackageContents();
		theViewmodelsPackage.initializePackageContents();
		theContenedorregistrobaseviewmodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDomainPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DomainPackage.eNS_URI, theDomainPackage);
		return theDomainPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnalista() {
		return analistaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalista_Direccion() {
		return (EAttribute)analistaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalista_Email() {
		return (EAttribute)analistaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalista_Estado() {
		return (EAttribute)analistaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalista_Id() {
		return (EAttribute)analistaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalista_Nombre() {
		return (EAttribute)analistaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalista_Telefono() {
		return (EAttribute)analistaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalista_FactoryGestionHumana() {
		return (EReference)analistaEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalista_LstConductores() {
		return (EReference)analistaEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBus() {
		return busEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBus_Id() {
		return (EAttribute)busEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBus_Estado() {
		return (EAttribute)busEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBus_NumeroPuestos() {
		return (EAttribute)busEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBus_FactoryGestionInventario() {
		return (EReference)busEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBus_LstLiquidacion() {
		return (EReference)busEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBus_Conductor() {
		return (EReference)busEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBus_Registrador() {
		return (EReference)busEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBus_LstRuta() {
		return (EReference)busEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCajero() {
		return cajeroEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCajero_Nombre() {
		return (EAttribute)cajeroEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCajero_Id() {
		return (EAttribute)cajeroEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCajero_Edad() {
		return (EAttribute)cajeroEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCajero_Telefono() {
		return (EAttribute)cajeroEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCajero_DineroRecibido() {
		return (EAttribute)cajeroEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCajero_Email() {
		return (EAttribute)cajeroEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCajero_Estado() {
		return (EAttribute)cajeroEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCajero_FactoryGestionHumana() {
		return (EReference)cajeroEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCajero_LstConductores() {
		return (EReference)cajeroEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCajero_LstLiquidaciones() {
		return (EReference)cajeroEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConductor() {
		return conductorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConductor_Analista() {
		return (EReference)conductorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConductor_Cajero() {
		return (EReference)conductorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConductor_Nombre() {
		return (EAttribute)conductorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConductor_Id() {
		return (EAttribute)conductorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConductor_Telefono() {
		return (EAttribute)conductorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConductor_Email() {
		return (EAttribute)conductorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConductor_Estado() {
		return (EAttribute)conductorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConductor_Bus() {
		return (EReference)conductorEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConductor_FactoryGestionHumana() {
		return (EReference)conductorEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConductor_LstRegistrador() {
		return (EReference)conductorEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConductor_LstBus() {
		return (EReference)conductorEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConductor_LstLiquidaciones() {
		return (EReference)conductorEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDetalleRegistro() {
		return detalleRegistroEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDetalleRegistro_Lugar() {
		return (EAttribute)detalleRegistroEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDetalleRegistro_Hora() {
		return (EAttribute)detalleRegistroEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDetalleRegistro_Incidencia() {
		return (EAttribute)detalleRegistroEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDetalleRegistro_Id() {
		return (EAttribute)detalleRegistroEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDetalleRegistro_Estado() {
		return (EAttribute)detalleRegistroEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDetalleRegistro_Registrador() {
		return (EReference)detalleRegistroEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDetalleRegistro_FactoryGestionInventario() {
		return (EReference)detalleRegistroEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDetalleRegistro_Ruta() {
		return (EReference)detalleRegistroEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomain() {
		return domainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_TheModelFactory() {
		return (EReference)domainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_FactoryGestionHumana() {
		return (EReference)domainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_FactoryGestionInventario() {
		return (EReference)domainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_TheUI() {
		return (EReference)domainEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFactoryGestionHumana() {
		return factoryGestionHumanaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactoryGestionHumana_LstAnalistas() {
		return (EReference)factoryGestionHumanaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactoryGestionHumana_LstCajeros() {
		return (EReference)factoryGestionHumanaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactoryGestionHumana_LstConductores() {
		return (EReference)factoryGestionHumanaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFactoryGestionHumana_Id() {
		return (EAttribute)factoryGestionHumanaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFactoryGestionHumana_Estado() {
		return (EAttribute)factoryGestionHumanaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactoryGestionHumana_Domain() {
		return (EReference)factoryGestionHumanaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFactoryGestionInventario() {
		return factoryGestionInventarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactoryGestionInventario_LstBuses() {
		return (EReference)factoryGestionInventarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactoryGestionInventario_LstDetalleRegistro() {
		return (EReference)factoryGestionInventarioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFactoryGestionInventario_Id() {
		return (EAttribute)factoryGestionInventarioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFactoryGestionInventario_Estado() {
		return (EAttribute)factoryGestionInventarioEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactoryGestionInventario_Domain() {
		return (EReference)factoryGestionInventarioEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactoryGestionInventario_LstLiquidaciones() {
		return (EReference)factoryGestionInventarioEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactoryGestionInventario_LstRegistrador() {
		return (EReference)factoryGestionInventarioEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactoryGestionInventario_LstRuta() {
		return (EReference)factoryGestionInventarioEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiquidacion() {
		return liquidacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLiquidacion_LstBus() {
		return (EReference)liquidacionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLiquidacion_Cajero() {
		return (EReference)liquidacionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLiquidacion_Conductor() {
		return (EReference)liquidacionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiquidacion_Costes() {
		return (EAttribute)liquidacionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiquidacion_Estado() {
		return (EAttribute)liquidacionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiquidacion_Id() {
		return (EAttribute)liquidacionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiquidacion_ValorLiquidacion() {
		return (EAttribute)liquidacionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLiquidacion_FactoryGestionInventario() {
		return (EReference)liquidacionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegistrador() {
		return registradorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegistrador_LstDetalleRegistros() {
		return (EReference)registradorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegistrador_Id() {
		return (EAttribute)registradorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegistrador_Estado() {
		return (EAttribute)registradorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegistrador_Bus() {
		return (EReference)registradorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegistrador_FactoryGestionInventario() {
		return (EReference)registradorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuta() {
		return rutaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuta_LstDetalleRegistro() {
		return (EReference)rutaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuta_PrecioRuta() {
		return (EAttribute)rutaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuta_Id() {
		return (EAttribute)rutaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuta_Estado() {
		return (EAttribute)rutaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuta_Nombre() {
		return (EAttribute)rutaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuta_Bus() {
		return (EReference)rutaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuta_FactoryGestionInventario() {
		return (EReference)rutaEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainFactory getDomainFactory() {
		return (DomainFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		analistaEClass = createEClass(ANALISTA);
		createEAttribute(analistaEClass, ANALISTA__DIRECCION);
		createEAttribute(analistaEClass, ANALISTA__EMAIL);
		createEAttribute(analistaEClass, ANALISTA__ESTADO);
		createEAttribute(analistaEClass, ANALISTA__ID);
		createEAttribute(analistaEClass, ANALISTA__NOMBRE);
		createEAttribute(analistaEClass, ANALISTA__TELEFONO);
		createEReference(analistaEClass, ANALISTA__FACTORY_GESTION_HUMANA);
		createEReference(analistaEClass, ANALISTA__LST_CONDUCTORES);

		busEClass = createEClass(BUS);
		createEAttribute(busEClass, BUS__ID);
		createEAttribute(busEClass, BUS__ESTADO);
		createEAttribute(busEClass, BUS__NUMERO_PUESTOS);
		createEReference(busEClass, BUS__FACTORY_GESTION_INVENTARIO);
		createEReference(busEClass, BUS__LST_LIQUIDACION);
		createEReference(busEClass, BUS__CONDUCTOR);
		createEReference(busEClass, BUS__REGISTRADOR);
		createEReference(busEClass, BUS__LST_RUTA);

		cajeroEClass = createEClass(CAJERO);
		createEAttribute(cajeroEClass, CAJERO__NOMBRE);
		createEAttribute(cajeroEClass, CAJERO__ID);
		createEAttribute(cajeroEClass, CAJERO__EDAD);
		createEAttribute(cajeroEClass, CAJERO__TELEFONO);
		createEAttribute(cajeroEClass, CAJERO__DINERO_RECIBIDO);
		createEAttribute(cajeroEClass, CAJERO__EMAIL);
		createEAttribute(cajeroEClass, CAJERO__ESTADO);
		createEReference(cajeroEClass, CAJERO__FACTORY_GESTION_HUMANA);
		createEReference(cajeroEClass, CAJERO__LST_CONDUCTORES);
		createEReference(cajeroEClass, CAJERO__LST_LIQUIDACIONES);

		conductorEClass = createEClass(CONDUCTOR);
		createEReference(conductorEClass, CONDUCTOR__ANALISTA);
		createEReference(conductorEClass, CONDUCTOR__CAJERO);
		createEAttribute(conductorEClass, CONDUCTOR__NOMBRE);
		createEAttribute(conductorEClass, CONDUCTOR__ID);
		createEAttribute(conductorEClass, CONDUCTOR__TELEFONO);
		createEAttribute(conductorEClass, CONDUCTOR__EMAIL);
		createEAttribute(conductorEClass, CONDUCTOR__ESTADO);
		createEReference(conductorEClass, CONDUCTOR__BUS);
		createEReference(conductorEClass, CONDUCTOR__FACTORY_GESTION_HUMANA);
		createEReference(conductorEClass, CONDUCTOR__LST_REGISTRADOR);
		createEReference(conductorEClass, CONDUCTOR__LST_BUS);
		createEReference(conductorEClass, CONDUCTOR__LST_LIQUIDACIONES);

		detalleRegistroEClass = createEClass(DETALLE_REGISTRO);
		createEAttribute(detalleRegistroEClass, DETALLE_REGISTRO__LUGAR);
		createEAttribute(detalleRegistroEClass, DETALLE_REGISTRO__HORA);
		createEAttribute(detalleRegistroEClass, DETALLE_REGISTRO__INCIDENCIA);
		createEAttribute(detalleRegistroEClass, DETALLE_REGISTRO__ID);
		createEAttribute(detalleRegistroEClass, DETALLE_REGISTRO__ESTADO);
		createEReference(detalleRegistroEClass, DETALLE_REGISTRO__REGISTRADOR);
		createEReference(detalleRegistroEClass, DETALLE_REGISTRO__FACTORY_GESTION_INVENTARIO);
		createEReference(detalleRegistroEClass, DETALLE_REGISTRO__RUTA);

		domainEClass = createEClass(DOMAIN);
		createEReference(domainEClass, DOMAIN__THE_MODEL_FACTORY);
		createEReference(domainEClass, DOMAIN__FACTORY_GESTION_HUMANA);
		createEReference(domainEClass, DOMAIN__FACTORY_GESTION_INVENTARIO);
		createEReference(domainEClass, DOMAIN__THE_UI);

		factoryGestionHumanaEClass = createEClass(FACTORY_GESTION_HUMANA);
		createEReference(factoryGestionHumanaEClass, FACTORY_GESTION_HUMANA__LST_ANALISTAS);
		createEReference(factoryGestionHumanaEClass, FACTORY_GESTION_HUMANA__LST_CAJEROS);
		createEReference(factoryGestionHumanaEClass, FACTORY_GESTION_HUMANA__LST_CONDUCTORES);
		createEAttribute(factoryGestionHumanaEClass, FACTORY_GESTION_HUMANA__ID);
		createEAttribute(factoryGestionHumanaEClass, FACTORY_GESTION_HUMANA__ESTADO);
		createEReference(factoryGestionHumanaEClass, FACTORY_GESTION_HUMANA__DOMAIN);

		factoryGestionInventarioEClass = createEClass(FACTORY_GESTION_INVENTARIO);
		createEReference(factoryGestionInventarioEClass, FACTORY_GESTION_INVENTARIO__LST_BUSES);
		createEReference(factoryGestionInventarioEClass, FACTORY_GESTION_INVENTARIO__LST_DETALLE_REGISTRO);
		createEAttribute(factoryGestionInventarioEClass, FACTORY_GESTION_INVENTARIO__ID);
		createEAttribute(factoryGestionInventarioEClass, FACTORY_GESTION_INVENTARIO__ESTADO);
		createEReference(factoryGestionInventarioEClass, FACTORY_GESTION_INVENTARIO__DOMAIN);
		createEReference(factoryGestionInventarioEClass, FACTORY_GESTION_INVENTARIO__LST_LIQUIDACIONES);
		createEReference(factoryGestionInventarioEClass, FACTORY_GESTION_INVENTARIO__LST_REGISTRADOR);
		createEReference(factoryGestionInventarioEClass, FACTORY_GESTION_INVENTARIO__LST_RUTA);

		liquidacionEClass = createEClass(LIQUIDACION);
		createEReference(liquidacionEClass, LIQUIDACION__LST_BUS);
		createEReference(liquidacionEClass, LIQUIDACION__CAJERO);
		createEReference(liquidacionEClass, LIQUIDACION__CONDUCTOR);
		createEAttribute(liquidacionEClass, LIQUIDACION__COSTES);
		createEAttribute(liquidacionEClass, LIQUIDACION__ESTADO);
		createEAttribute(liquidacionEClass, LIQUIDACION__ID);
		createEAttribute(liquidacionEClass, LIQUIDACION__VALOR_LIQUIDACION);
		createEReference(liquidacionEClass, LIQUIDACION__FACTORY_GESTION_INVENTARIO);

		registradorEClass = createEClass(REGISTRADOR);
		createEReference(registradorEClass, REGISTRADOR__LST_DETALLE_REGISTROS);
		createEAttribute(registradorEClass, REGISTRADOR__ID);
		createEAttribute(registradorEClass, REGISTRADOR__ESTADO);
		createEReference(registradorEClass, REGISTRADOR__BUS);
		createEReference(registradorEClass, REGISTRADOR__FACTORY_GESTION_INVENTARIO);

		rutaEClass = createEClass(RUTA);
		createEReference(rutaEClass, RUTA__LST_DETALLE_REGISTRO);
		createEAttribute(rutaEClass, RUTA__PRECIO_RUTA);
		createEAttribute(rutaEClass, RUTA__ID);
		createEAttribute(rutaEClass, RUTA__ESTADO);
		createEAttribute(rutaEClass, RUTA__NOMBRE);
		createEReference(rutaEClass, RUTA__BUS);
		createEReference(rutaEClass, RUTA__FACTORY_GESTION_INVENTARIO);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		Main1Package theMain1Package = (Main1Package)EPackage.Registry.INSTANCE.getEPackage(Main1Package.eNS_URI);
		cootracirPackage thecootracirPackage = (cootracirPackage)EPackage.Registry.INSTANCE.getEPackage(cootracirPackage.eNS_URI);
		UiPackage theUiPackage = (UiPackage)EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theMain1Package);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(analistaEClass, Analista.class, "Analista", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnalista_Direccion(), thecootracirPackage.getString(), "direccion", null, 0, 1, Analista.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnalista_Email(), thecootracirPackage.getString(), "email", null, 0, 1, Analista.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnalista_Estado(), thecootracirPackage.getString(), "estado", null, 0, 1, Analista.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnalista_Id(), thecootracirPackage.getString(), "id", null, 0, 1, Analista.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnalista_Nombre(), thecootracirPackage.getString(), "nombre", null, 0, 1, Analista.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnalista_Telefono(), thecootracirPackage.getString(), "telefono", null, 0, 1, Analista.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalista_FactoryGestionHumana(), this.getFactoryGestionHumana(), this.getFactoryGestionHumana_LstAnalistas(), "factoryGestionHumana", null, 0, 1, Analista.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalista_LstConductores(), this.getConductor(), this.getConductor_Analista(), "lstConductores", null, 0, -1, Analista.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(busEClass, Bus.class, "Bus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBus_Id(), thecootracirPackage.getString(), "id", null, 0, 1, Bus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBus_Estado(), thecootracirPackage.getString(), "estado", null, 0, 1, Bus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBus_NumeroPuestos(), thecootracirPackage.getString(), "numeroPuestos", null, 0, 1, Bus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBus_FactoryGestionInventario(), this.getFactoryGestionInventario(), this.getFactoryGestionInventario_LstBuses(), "factoryGestionInventario", null, 0, 1, Bus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBus_LstLiquidacion(), this.getLiquidacion(), this.getLiquidacion_LstBus(), "lstLiquidacion", null, 0, -1, Bus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBus_Conductor(), this.getConductor(), this.getConductor_Bus(), "conductor", null, 0, 1, Bus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBus_Registrador(), this.getRegistrador(), this.getRegistrador_Bus(), "registrador", null, 0, 1, Bus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBus_LstRuta(), this.getRuta(), this.getRuta_Bus(), "lstRuta", null, 0, -1, Bus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cajeroEClass, Cajero.class, "Cajero", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCajero_Nombre(), thecootracirPackage.getString(), "nombre", null, 0, 1, Cajero.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCajero_Id(), thecootracirPackage.getString(), "id", null, 0, 1, Cajero.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCajero_Edad(), thecootracirPackage.getString(), "edad", null, 0, 1, Cajero.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCajero_Telefono(), thecootracirPackage.getString(), "telefono", null, 0, 1, Cajero.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCajero_DineroRecibido(), thecootracirPackage.getString(), "dineroRecibido", null, 0, 1, Cajero.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCajero_Email(), thecootracirPackage.getString(), "email", null, 0, 1, Cajero.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCajero_Estado(), thecootracirPackage.getString(), "estado", null, 0, 1, Cajero.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCajero_FactoryGestionHumana(), this.getFactoryGestionHumana(), this.getFactoryGestionHumana_LstCajeros(), "factoryGestionHumana", null, 0, 1, Cajero.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCajero_LstConductores(), this.getConductor(), this.getConductor_Cajero(), "lstConductores", null, 0, -1, Cajero.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCajero_LstLiquidaciones(), this.getLiquidacion(), this.getLiquidacion_Cajero(), "lstLiquidaciones", null, 0, -1, Cajero.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conductorEClass, Conductor.class, "Conductor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConductor_Analista(), this.getAnalista(), this.getAnalista_LstConductores(), "analista", null, 0, 1, Conductor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConductor_Cajero(), this.getCajero(), this.getCajero_LstConductores(), "cajero", null, 0, 1, Conductor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConductor_Nombre(), thecootracirPackage.getString(), "nombre", null, 0, 1, Conductor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConductor_Id(), thecootracirPackage.getString(), "id", null, 0, 1, Conductor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConductor_Telefono(), thecootracirPackage.getString(), "telefono", null, 0, 1, Conductor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConductor_Email(), thecootracirPackage.getString(), "email", null, 0, 1, Conductor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConductor_Estado(), thecootracirPackage.getString(), "estado", null, 0, 1, Conductor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConductor_Bus(), this.getBus(), this.getBus_Conductor(), "bus", null, 0, 1, Conductor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConductor_FactoryGestionHumana(), this.getFactoryGestionHumana(), this.getFactoryGestionHumana_LstConductores(), "factoryGestionHumana", null, 0, 1, Conductor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConductor_LstRegistrador(), theMain1Package.getRegistrador(), theMain1Package.getRegistrador_LstConductor(), "lstRegistrador", null, 0, -1, Conductor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConductor_LstBus(), theMain1Package.getBus(), theMain1Package.getBus_LstConductor(), "lstBus", null, 0, -1, Conductor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConductor_LstLiquidaciones(), this.getLiquidacion(), this.getLiquidacion_Conductor(), "lstLiquidaciones", null, 0, -1, Conductor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(detalleRegistroEClass, DetalleRegistro.class, "DetalleRegistro", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDetalleRegistro_Lugar(), thecootracirPackage.getString(), "lugar", null, 0, 1, DetalleRegistro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDetalleRegistro_Hora(), thecootracirPackage.getString(), "hora", null, 0, 1, DetalleRegistro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDetalleRegistro_Incidencia(), thecootracirPackage.getString(), "incidencia", null, 0, 1, DetalleRegistro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDetalleRegistro_Id(), thecootracirPackage.getString(), "id", null, 0, 1, DetalleRegistro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDetalleRegistro_Estado(), thecootracirPackage.getString(), "estado", null, 0, 1, DetalleRegistro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDetalleRegistro_Registrador(), this.getRegistrador(), this.getRegistrador_LstDetalleRegistros(), "registrador", null, 0, 1, DetalleRegistro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDetalleRegistro_FactoryGestionInventario(), this.getFactoryGestionInventario(), this.getFactoryGestionInventario_LstDetalleRegistro(), "factoryGestionInventario", null, 0, 1, DetalleRegistro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDetalleRegistro_Ruta(), this.getRuta(), this.getRuta_LstDetalleRegistro(), "ruta", null, 0, 1, DetalleRegistro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainEClass, Domain.class, "Domain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomain_TheModelFactory(), thecootracirPackage.getModelFactory(), thecootracirPackage.getModelFactory_TheDomain(), "theModelFactory", null, 0, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_FactoryGestionHumana(), this.getFactoryGestionHumana(), this.getFactoryGestionHumana_Domain(), "factoryGestionHumana", null, 0, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_FactoryGestionInventario(), this.getFactoryGestionInventario(), this.getFactoryGestionInventario_Domain(), "factoryGestionInventario", null, 0, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_TheUI(), theUiPackage.getUI(), theUiPackage.getUI_TheDomain(), "theUI", null, 0, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(domainEClass, null, "implementarModelo", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(factoryGestionHumanaEClass, FactoryGestionHumana.class, "FactoryGestionHumana", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFactoryGestionHumana_LstAnalistas(), this.getAnalista(), this.getAnalista_FactoryGestionHumana(), "lstAnalistas", null, 0, -1, FactoryGestionHumana.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFactoryGestionHumana_LstCajeros(), this.getCajero(), this.getCajero_FactoryGestionHumana(), "lstCajeros", null, 0, -1, FactoryGestionHumana.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFactoryGestionHumana_LstConductores(), this.getConductor(), this.getConductor_FactoryGestionHumana(), "lstConductores", null, 0, -1, FactoryGestionHumana.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFactoryGestionHumana_Id(), thecootracirPackage.getString(), "id", null, 0, 1, FactoryGestionHumana.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFactoryGestionHumana_Estado(), thecootracirPackage.getString(), "estado", null, 0, 1, FactoryGestionHumana.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFactoryGestionHumana_Domain(), this.getDomain(), this.getDomain_FactoryGestionHumana(), "domain", null, 0, 1, FactoryGestionHumana.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(factoryGestionInventarioEClass, FactoryGestionInventario.class, "FactoryGestionInventario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFactoryGestionInventario_LstBuses(), this.getBus(), this.getBus_FactoryGestionInventario(), "lstBuses", null, 0, -1, FactoryGestionInventario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFactoryGestionInventario_LstDetalleRegistro(), this.getDetalleRegistro(), this.getDetalleRegistro_FactoryGestionInventario(), "lstDetalleRegistro", null, 0, -1, FactoryGestionInventario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFactoryGestionInventario_Id(), thecootracirPackage.getString(), "id", null, 0, 1, FactoryGestionInventario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFactoryGestionInventario_Estado(), thecootracirPackage.getString(), "estado", null, 0, 1, FactoryGestionInventario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFactoryGestionInventario_Domain(), this.getDomain(), this.getDomain_FactoryGestionInventario(), "domain", null, 0, 1, FactoryGestionInventario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFactoryGestionInventario_LstLiquidaciones(), this.getLiquidacion(), this.getLiquidacion_FactoryGestionInventario(), "lstLiquidaciones", null, 0, -1, FactoryGestionInventario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFactoryGestionInventario_LstRegistrador(), this.getRegistrador(), this.getRegistrador_FactoryGestionInventario(), "lstRegistrador", null, 0, -1, FactoryGestionInventario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFactoryGestionInventario_LstRuta(), this.getRuta(), this.getRuta_FactoryGestionInventario(), "lstRuta", null, 0, -1, FactoryGestionInventario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liquidacionEClass, Liquidacion.class, "Liquidacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLiquidacion_LstBus(), this.getBus(), this.getBus_LstLiquidacion(), "lstBus", null, 0, -1, Liquidacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLiquidacion_Cajero(), this.getCajero(), this.getCajero_LstLiquidaciones(), "cajero", null, 0, 1, Liquidacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLiquidacion_Conductor(), this.getConductor(), this.getConductor_LstLiquidaciones(), "conductor", null, 0, 1, Liquidacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiquidacion_Costes(), thecootracirPackage.getString(), "costes", null, 0, 1, Liquidacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiquidacion_Estado(), thecootracirPackage.getString(), "estado", null, 0, 1, Liquidacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiquidacion_Id(), thecootracirPackage.getString(), "id", null, 0, 1, Liquidacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiquidacion_ValorLiquidacion(), thecootracirPackage.getString(), "valorLiquidacion", null, 0, 1, Liquidacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLiquidacion_FactoryGestionInventario(), this.getFactoryGestionInventario(), this.getFactoryGestionInventario_LstLiquidaciones(), "factoryGestionInventario", null, 0, 1, Liquidacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(registradorEClass, Registrador.class, "Registrador", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegistrador_LstDetalleRegistros(), this.getDetalleRegistro(), this.getDetalleRegistro_Registrador(), "lstDetalleRegistros", null, 0, -1, Registrador.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegistrador_Id(), thecootracirPackage.getString(), "id", null, 0, 1, Registrador.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegistrador_Estado(), thecootracirPackage.getString(), "estado", null, 0, 1, Registrador.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegistrador_Bus(), this.getBus(), this.getBus_Registrador(), "bus", null, 0, 1, Registrador.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegistrador_FactoryGestionInventario(), this.getFactoryGestionInventario(), this.getFactoryGestionInventario_LstRegistrador(), "factoryGestionInventario", null, 0, 1, Registrador.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rutaEClass, Ruta.class, "Ruta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRuta_LstDetalleRegistro(), this.getDetalleRegistro(), this.getDetalleRegistro_Ruta(), "lstDetalleRegistro", null, 0, -1, Ruta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuta_PrecioRuta(), thecootracirPackage.getString(), "precioRuta", null, 0, 1, Ruta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuta_Id(), thecootracirPackage.getString(), "id", null, 0, 1, Ruta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuta_Estado(), thecootracirPackage.getString(), "estado", null, 0, 1, Ruta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuta_Nombre(), thecootracirPackage.getString(), "nombre", null, 0, 1, Ruta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuta_Bus(), this.getBus(), this.getBus_LstRuta(), "bus", null, 0, 1, Ruta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuta_FactoryGestionInventario(), this.getFactoryGestionInventario(), this.getFactoryGestionInventario_LstRuta(), "factoryGestionInventario", null, 0, 1, Ruta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //DomainPackageImpl
