/**
 */
package cootracir.ui.impl;

import cootracir.cootracirPackage;

import cootracir.domain.DomainPackage;

import cootracir.domain.impl.DomainPackageImpl;

import cootracir.domain.main1.Main1Package;

import cootracir.domain.main1.impl.Main1PackageImpl;

import cootracir.impl.cootracirPackageImpl;

import cootracir.ui.UiFactory;
import cootracir.ui.UiPackage;

import cootracir.ui.viewmodels.ViewmodelsPackage;

import cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelPackage;

import cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.ContenedorregistrobaseviewmodelPackageImpl;

import cootracir.ui.viewmodels.impl.ViewmodelsPackageImpl;

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
public class UiPackageImpl extends EPackageImpl implements UiPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiEClass = null;

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
	 * @see cootracir.ui.UiPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UiPackageImpl() {
		super(eNS_URI, UiFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link UiPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UiPackage init() {
		if (isInited) return (UiPackage)EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI);

		// Obtain or create and register package
		UiPackageImpl theUiPackage = (UiPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UiPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UiPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		cootracirPackageImpl thecootracirPackage = (cootracirPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(cootracirPackage.eNS_URI) instanceof cootracirPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(cootracirPackage.eNS_URI) : cootracirPackage.eINSTANCE);
		DomainPackageImpl theDomainPackage = (DomainPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) instanceof DomainPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) : DomainPackage.eINSTANCE);
		Main1PackageImpl theMain1Package = (Main1PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Main1Package.eNS_URI) instanceof Main1PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Main1Package.eNS_URI) : Main1Package.eINSTANCE);
		ViewmodelsPackageImpl theViewmodelsPackage = (ViewmodelsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ViewmodelsPackage.eNS_URI) instanceof ViewmodelsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ViewmodelsPackage.eNS_URI) : ViewmodelsPackage.eINSTANCE);
		ContenedorregistrobaseviewmodelPackageImpl theContenedorregistrobaseviewmodelPackage = (ContenedorregistrobaseviewmodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContenedorregistrobaseviewmodelPackage.eNS_URI) instanceof ContenedorregistrobaseviewmodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContenedorregistrobaseviewmodelPackage.eNS_URI) : ContenedorregistrobaseviewmodelPackage.eINSTANCE);

		// Create package meta-data objects
		theUiPackage.createPackageContents();
		thecootracirPackage.createPackageContents();
		theDomainPackage.createPackageContents();
		theMain1Package.createPackageContents();
		theViewmodelsPackage.createPackageContents();
		theContenedorregistrobaseviewmodelPackage.createPackageContents();

		// Initialize created meta-data
		theUiPackage.initializePackageContents();
		thecootracirPackage.initializePackageContents();
		theDomainPackage.initializePackageContents();
		theMain1Package.initializePackageContents();
		theViewmodelsPackage.initializePackageContents();
		theContenedorregistrobaseviewmodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUiPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UiPackage.eNS_URI, theUiPackage);
		return theUiPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUI() {
		return uiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUI_TheModelFactory() {
		return (EReference)uiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUI_TheDomain() {
		return (EReference)uiEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUI_LstViewModels() {
		return (EReference)uiEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUI_TheContenedorRegistroBaseViewModel() {
		return (EReference)uiEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiFactory getUiFactory() {
		return (UiFactory)getEFactoryInstance();
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
		uiEClass = createEClass(UI);
		createEReference(uiEClass, UI__THE_MODEL_FACTORY);
		createEReference(uiEClass, UI__THE_DOMAIN);
		createEReference(uiEClass, UI__LST_VIEW_MODELS);
		createEReference(uiEClass, UI__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL);
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
		ViewmodelsPackage theViewmodelsPackage = (ViewmodelsPackage)EPackage.Registry.INSTANCE.getEPackage(ViewmodelsPackage.eNS_URI);
		cootracirPackage thecootracirPackage = (cootracirPackage)EPackage.Registry.INSTANCE.getEPackage(cootracirPackage.eNS_URI);
		DomainPackage theDomainPackage = (DomainPackage)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI);
		ContenedorregistrobaseviewmodelPackage theContenedorregistrobaseviewmodelPackage = (ContenedorregistrobaseviewmodelPackage)EPackage.Registry.INSTANCE.getEPackage(ContenedorregistrobaseviewmodelPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theViewmodelsPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(uiEClass, cootracir.ui.UI.class, "UI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUI_TheModelFactory(), thecootracirPackage.getModelFactory(), thecootracirPackage.getModelFactory_TheUI(), "theModelFactory", null, 0, 1, cootracir.ui.UI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUI_TheDomain(), theDomainPackage.getDomain(), theDomainPackage.getDomain_TheUI(), "theDomain", null, 0, 1, cootracir.ui.UI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUI_LstViewModels(), theViewmodelsPackage.getViewModel(), theViewmodelsPackage.getViewModel_TheUI(), "lstViewModels", null, 0, -1, cootracir.ui.UI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUI_TheContenedorRegistroBaseViewModel(), theContenedorregistrobaseviewmodelPackage.getContenedorRegistroBaseViewModel(), theContenedorregistrobaseviewmodelPackage.getContenedorRegistroBaseViewModel_OwnedByUI(), "theContenedorRegistroBaseViewModel", null, 0, 1, cootracir.ui.UI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(uiEClass, null, "implementarModelo", 0, 1, IS_UNIQUE, IS_ORDERED);
	}

} //UiPackageImpl
