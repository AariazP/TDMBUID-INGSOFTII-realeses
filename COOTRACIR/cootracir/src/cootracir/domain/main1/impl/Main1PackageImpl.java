/**
 */
package cootracir.domain.main1.impl;

import cootracir.cootracirPackage;

import cootracir.domain.DomainPackage;

import cootracir.domain.impl.DomainPackageImpl;

import cootracir.domain.main1.Bus;
import cootracir.domain.main1.DetalleRegistro;
import cootracir.domain.main1.Main1Factory;
import cootracir.domain.main1.Main1Package;
import cootracir.domain.main1.Registrador;
import cootracir.domain.main1.Ruta;

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
public class Main1PackageImpl extends EPackageImpl implements Main1Package {
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
	private EClass rutaEClass = null;

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
	private EClass detalleRegistroEClass = null;

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
	 * @see cootracir.domain.main1.Main1Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Main1PackageImpl() {
		super(eNS_URI, Main1Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Main1Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Main1Package init() {
		if (isInited) return (Main1Package)EPackage.Registry.INSTANCE.getEPackage(Main1Package.eNS_URI);

		// Obtain or create and register package
		Main1PackageImpl theMain1Package = (Main1PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Main1PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Main1PackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		cootracirPackageImpl thecootracirPackage = (cootracirPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(cootracirPackage.eNS_URI) instanceof cootracirPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(cootracirPackage.eNS_URI) : cootracirPackage.eINSTANCE);
		DomainPackageImpl theDomainPackage = (DomainPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) instanceof DomainPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) : DomainPackage.eINSTANCE);
		UiPackageImpl theUiPackage = (UiPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) instanceof UiPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) : UiPackage.eINSTANCE);
		ViewmodelsPackageImpl theViewmodelsPackage = (ViewmodelsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ViewmodelsPackage.eNS_URI) instanceof ViewmodelsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ViewmodelsPackage.eNS_URI) : ViewmodelsPackage.eINSTANCE);
		ContenedorregistrobaseviewmodelPackageImpl theContenedorregistrobaseviewmodelPackage = (ContenedorregistrobaseviewmodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContenedorregistrobaseviewmodelPackage.eNS_URI) instanceof ContenedorregistrobaseviewmodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContenedorregistrobaseviewmodelPackage.eNS_URI) : ContenedorregistrobaseviewmodelPackage.eINSTANCE);

		// Create package meta-data objects
		theMain1Package.createPackageContents();
		thecootracirPackage.createPackageContents();
		theDomainPackage.createPackageContents();
		theUiPackage.createPackageContents();
		theViewmodelsPackage.createPackageContents();
		theContenedorregistrobaseviewmodelPackage.createPackageContents();

		// Initialize created meta-data
		theMain1Package.initializePackageContents();
		thecootracirPackage.initializePackageContents();
		theDomainPackage.initializePackageContents();
		theUiPackage.initializePackageContents();
		theViewmodelsPackage.initializePackageContents();
		theContenedorregistrobaseviewmodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMain1Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Main1Package.eNS_URI, theMain1Package);
		return theMain1Package;
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
	public EReference getBus_LstConductor() {
		return (EReference)busEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBus_Id() {
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
	public EAttribute getBus_Estado() {
		return (EAttribute)busEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBus_LstRuta() {
		return (EReference)busEClass.getEStructuralFeatures().get(4);
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
	public EAttribute getRuta_PrecioRuta() {
		return (EAttribute)rutaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuta_Id() {
		return (EAttribute)rutaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuta_Estado() {
		return (EAttribute)rutaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuta_LstBus() {
		return (EReference)rutaEClass.getEStructuralFeatures().get(3);
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
	public EReference getRegistrador_LstConductor() {
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
	public EReference getRegistrador_LstDetalleRegistro() {
		return (EReference)registradorEClass.getEStructuralFeatures().get(3);
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
	public EReference getDetalleRegistro_LstRegistrador() {
		return (EReference)detalleRegistroEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDetalleRegistro_Lugar() {
		return (EAttribute)detalleRegistroEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDetalleRegistro_Hora() {
		return (EAttribute)detalleRegistroEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDetalleRegistro_Incidencias() {
		return (EAttribute)detalleRegistroEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDetalleRegistro_Id() {
		return (EAttribute)detalleRegistroEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDetalleRegistro_Estado() {
		return (EAttribute)detalleRegistroEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Main1Factory getMain1Factory() {
		return (Main1Factory)getEFactoryInstance();
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
		busEClass = createEClass(BUS);
		createEReference(busEClass, BUS__LST_CONDUCTOR);
		createEAttribute(busEClass, BUS__ID);
		createEAttribute(busEClass, BUS__NUMERO_PUESTOS);
		createEAttribute(busEClass, BUS__ESTADO);
		createEReference(busEClass, BUS__LST_RUTA);

		rutaEClass = createEClass(RUTA);
		createEAttribute(rutaEClass, RUTA__PRECIO_RUTA);
		createEAttribute(rutaEClass, RUTA__ID);
		createEAttribute(rutaEClass, RUTA__ESTADO);
		createEReference(rutaEClass, RUTA__LST_BUS);

		registradorEClass = createEClass(REGISTRADOR);
		createEReference(registradorEClass, REGISTRADOR__LST_CONDUCTOR);
		createEAttribute(registradorEClass, REGISTRADOR__ID);
		createEAttribute(registradorEClass, REGISTRADOR__ESTADO);
		createEReference(registradorEClass, REGISTRADOR__LST_DETALLE_REGISTRO);

		detalleRegistroEClass = createEClass(DETALLE_REGISTRO);
		createEReference(detalleRegistroEClass, DETALLE_REGISTRO__LST_REGISTRADOR);
		createEAttribute(detalleRegistroEClass, DETALLE_REGISTRO__LUGAR);
		createEAttribute(detalleRegistroEClass, DETALLE_REGISTRO__HORA);
		createEAttribute(detalleRegistroEClass, DETALLE_REGISTRO__INCIDENCIAS);
		createEAttribute(detalleRegistroEClass, DETALLE_REGISTRO__ID);
		createEAttribute(detalleRegistroEClass, DETALLE_REGISTRO__ESTADO);
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
		DomainPackage theDomainPackage = (DomainPackage)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI);
		cootracirPackage thecootracirPackage = (cootracirPackage)EPackage.Registry.INSTANCE.getEPackage(cootracirPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(busEClass, Bus.class, "Bus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBus_LstConductor(), theDomainPackage.getConductor(), theDomainPackage.getConductor_LstBus(), "lstConductor", null, 0, -1, Bus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBus_Id(), thecootracirPackage.getString(), "id", null, 0, 1, Bus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBus_NumeroPuestos(), thecootracirPackage.getString(), "numeroPuestos", null, 0, 1, Bus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBus_Estado(), thecootracirPackage.getString(), "estado", null, 0, 1, Bus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBus_LstRuta(), this.getRuta(), this.getRuta_LstBus(), "lstRuta", null, 0, -1, Bus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rutaEClass, Ruta.class, "Ruta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRuta_PrecioRuta(), thecootracirPackage.getString(), "precioRuta", null, 0, 1, Ruta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuta_Id(), thecootracirPackage.getString(), "id", null, 0, 1, Ruta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuta_Estado(), thecootracirPackage.getString(), "estado", null, 0, 1, Ruta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuta_LstBus(), this.getBus(), this.getBus_LstRuta(), "lstBus", null, 0, -1, Ruta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(registradorEClass, Registrador.class, "Registrador", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegistrador_LstConductor(), theDomainPackage.getConductor(), theDomainPackage.getConductor_LstRegistrador(), "lstConductor", null, 0, -1, Registrador.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegistrador_Id(), thecootracirPackage.getString(), "id", null, 0, 1, Registrador.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegistrador_Estado(), thecootracirPackage.getString(), "estado", null, 0, 1, Registrador.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegistrador_LstDetalleRegistro(), this.getDetalleRegistro(), this.getDetalleRegistro_LstRegistrador(), "lstDetalleRegistro", null, 0, -1, Registrador.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(detalleRegistroEClass, DetalleRegistro.class, "DetalleRegistro", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDetalleRegistro_LstRegistrador(), this.getRegistrador(), this.getRegistrador_LstDetalleRegistro(), "lstRegistrador", null, 0, -1, DetalleRegistro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDetalleRegistro_Lugar(), thecootracirPackage.getString(), "lugar", null, 0, 1, DetalleRegistro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDetalleRegistro_Hora(), thecootracirPackage.getString(), "hora", null, 0, 1, DetalleRegistro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDetalleRegistro_Incidencias(), thecootracirPackage.getString(), "incidencias", null, 0, 1, DetalleRegistro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDetalleRegistro_Id(), thecootracirPackage.getString(), "id", null, 0, 1, DetalleRegistro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDetalleRegistro_Estado(), thecootracirPackage.getString(), "estado", null, 0, 1, DetalleRegistro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //Main1PackageImpl
