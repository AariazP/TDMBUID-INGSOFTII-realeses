/**
 */
package cootracir.ui.viewmodels.impl;

import cootracir.cootracirPackage;

import cootracir.domain.DomainPackage;

import cootracir.domain.impl.DomainPackageImpl;

import cootracir.domain.main1.Main1Package;

import cootracir.domain.main1.impl.Main1PackageImpl;

import cootracir.impl.cootracirPackageImpl;

import cootracir.ui.UiPackage;

import cootracir.ui.impl.UiPackageImpl;

import cootracir.ui.viewmodels.ViewModel;
import cootracir.ui.viewmodels.ViewmodelsFactory;
import cootracir.ui.viewmodels.ViewmodelsPackage;

import cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelPackage;

import cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.ContenedorregistrobaseviewmodelPackageImpl;

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
public class ViewmodelsPackageImpl extends EPackageImpl implements ViewmodelsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewModelEClass = null;

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
	 * @see cootracir.ui.viewmodels.ViewmodelsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ViewmodelsPackageImpl() {
		super(eNS_URI, ViewmodelsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ViewmodelsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ViewmodelsPackage init() {
		if (isInited) return (ViewmodelsPackage)EPackage.Registry.INSTANCE.getEPackage(ViewmodelsPackage.eNS_URI);

		// Obtain or create and register package
		ViewmodelsPackageImpl theViewmodelsPackage = (ViewmodelsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ViewmodelsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ViewmodelsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		cootracirPackageImpl thecootracirPackage = (cootracirPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(cootracirPackage.eNS_URI) instanceof cootracirPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(cootracirPackage.eNS_URI) : cootracirPackage.eINSTANCE);
		DomainPackageImpl theDomainPackage = (DomainPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) instanceof DomainPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) : DomainPackage.eINSTANCE);
		Main1PackageImpl theMain1Package = (Main1PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Main1Package.eNS_URI) instanceof Main1PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Main1Package.eNS_URI) : Main1Package.eINSTANCE);
		UiPackageImpl theUiPackage = (UiPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) instanceof UiPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) : UiPackage.eINSTANCE);
		ContenedorregistrobaseviewmodelPackageImpl theContenedorregistrobaseviewmodelPackage = (ContenedorregistrobaseviewmodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContenedorregistrobaseviewmodelPackage.eNS_URI) instanceof ContenedorregistrobaseviewmodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContenedorregistrobaseviewmodelPackage.eNS_URI) : ContenedorregistrobaseviewmodelPackage.eINSTANCE);

		// Create package meta-data objects
		theViewmodelsPackage.createPackageContents();
		thecootracirPackage.createPackageContents();
		theDomainPackage.createPackageContents();
		theMain1Package.createPackageContents();
		theUiPackage.createPackageContents();
		theContenedorregistrobaseviewmodelPackage.createPackageContents();

		// Initialize created meta-data
		theViewmodelsPackage.initializePackageContents();
		thecootracirPackage.initializePackageContents();
		theDomainPackage.initializePackageContents();
		theMain1Package.initializePackageContents();
		theUiPackage.initializePackageContents();
		theContenedorregistrobaseviewmodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theViewmodelsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ViewmodelsPackage.eNS_URI, theViewmodelsPackage);
		return theViewmodelsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewModel() {
		return viewModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewModel_TheUI() {
		return (EReference)viewModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewmodelsFactory getViewmodelsFactory() {
		return (ViewmodelsFactory)getEFactoryInstance();
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
		viewModelEClass = createEClass(VIEW_MODEL);
		createEReference(viewModelEClass, VIEW_MODEL__THE_UI);
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
		ContenedorregistrobaseviewmodelPackage theContenedorregistrobaseviewmodelPackage = (ContenedorregistrobaseviewmodelPackage)EPackage.Registry.INSTANCE.getEPackage(ContenedorregistrobaseviewmodelPackage.eNS_URI);
		UiPackage theUiPackage = (UiPackage)EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theContenedorregistrobaseviewmodelPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(viewModelEClass, ViewModel.class, "ViewModel", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getViewModel_TheUI(), theUiPackage.getUI(), theUiPackage.getUI_LstViewModels(), "theUI", null, 0, 1, ViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //ViewmodelsPackageImpl
