/**
 */
package cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl;

import cootracir.cootracirPackage;

import cootracir.domain.DomainPackage;

import cootracir.domain.impl.DomainPackageImpl;

import cootracir.domain.main1.Main1Package;

import cootracir.domain.main1.impl.Main1PackageImpl;

import cootracir.impl.cootracirPackageImpl;

import cootracir.ui.UiPackage;

import cootracir.ui.impl.UiPackageImpl;

import cootracir.ui.viewmodels.ViewmodelsPackage;

import cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorBusquedaViewModel;
import cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorInformaciongeneralViewModel;
import cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorRegistroBaseViewModel;
import cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelFactory;
import cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelPackage;
import cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.FiltrarrutasViewModel;
import cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ListapreciosViewModel;
import cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.NombredelconductorViewModel;
import cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.RegistrosViewModel;
import cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.RutadelconductorViewModel;

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
public class ContenedorregistrobaseviewmodelPackageImpl extends EPackageImpl implements ContenedorregistrobaseviewmodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contenedorRegistroBaseViewModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filtrarrutasViewModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contenedorInformaciongeneralViewModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contenedorBusquedaViewModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nombredelconductorViewModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rutadelconductorViewModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registrosViewModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listapreciosViewModelEClass = null;

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
	 * @see cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ContenedorregistrobaseviewmodelPackageImpl() {
		super(eNS_URI, ContenedorregistrobaseviewmodelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ContenedorregistrobaseviewmodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ContenedorregistrobaseviewmodelPackage init() {
		if (isInited) return (ContenedorregistrobaseviewmodelPackage)EPackage.Registry.INSTANCE.getEPackage(ContenedorregistrobaseviewmodelPackage.eNS_URI);

		// Obtain or create and register package
		ContenedorregistrobaseviewmodelPackageImpl theContenedorregistrobaseviewmodelPackage = (ContenedorregistrobaseviewmodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ContenedorregistrobaseviewmodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ContenedorregistrobaseviewmodelPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		cootracirPackageImpl thecootracirPackage = (cootracirPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(cootracirPackage.eNS_URI) instanceof cootracirPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(cootracirPackage.eNS_URI) : cootracirPackage.eINSTANCE);
		DomainPackageImpl theDomainPackage = (DomainPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) instanceof DomainPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) : DomainPackage.eINSTANCE);
		Main1PackageImpl theMain1Package = (Main1PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Main1Package.eNS_URI) instanceof Main1PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Main1Package.eNS_URI) : Main1Package.eINSTANCE);
		UiPackageImpl theUiPackage = (UiPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) instanceof UiPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) : UiPackage.eINSTANCE);
		ViewmodelsPackageImpl theViewmodelsPackage = (ViewmodelsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ViewmodelsPackage.eNS_URI) instanceof ViewmodelsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ViewmodelsPackage.eNS_URI) : ViewmodelsPackage.eINSTANCE);

		// Create package meta-data objects
		theContenedorregistrobaseviewmodelPackage.createPackageContents();
		thecootracirPackage.createPackageContents();
		theDomainPackage.createPackageContents();
		theMain1Package.createPackageContents();
		theUiPackage.createPackageContents();
		theViewmodelsPackage.createPackageContents();

		// Initialize created meta-data
		theContenedorregistrobaseviewmodelPackage.initializePackageContents();
		thecootracirPackage.initializePackageContents();
		theDomainPackage.initializePackageContents();
		theMain1Package.initializePackageContents();
		theUiPackage.initializePackageContents();
		theViewmodelsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theContenedorregistrobaseviewmodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ContenedorregistrobaseviewmodelPackage.eNS_URI, theContenedorregistrobaseviewmodelPackage);
		return theContenedorregistrobaseviewmodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContenedorRegistroBaseViewModel() {
		return contenedorRegistroBaseViewModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorRegistroBaseViewModel_OwnedByUI() {
		return (EReference)contenedorRegistroBaseViewModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContenedorRegistroBaseViewModel_Notificacion() {
		return (EAttribute)contenedorRegistroBaseViewModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContenedorRegistroBaseViewModel_TxtFiltrarrutasViewModel() {
		return (EAttribute)contenedorRegistroBaseViewModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorRegistroBaseViewModel_ListaFiltrarrutasViewModel() {
		return (EReference)contenedorRegistroBaseViewModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorRegistroBaseViewModel_FiltrarrutasViewModel() {
		return (EReference)contenedorRegistroBaseViewModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorRegistroBaseViewModel_SelectedFiltrarrutasViewModel() {
		return (EReference)contenedorRegistroBaseViewModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorRegistroBaseViewModel_TheInformaciongeneral() {
		return (EReference)contenedorRegistroBaseViewModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorRegistroBaseViewModel_TheBusqueda() {
		return (EReference)contenedorRegistroBaseViewModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorRegistroBaseViewModel_ListaRegistrosViewModel() {
		return (EReference)contenedorRegistroBaseViewModelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorRegistroBaseViewModel_SelectedRegistrosViewModel() {
		return (EReference)contenedorRegistroBaseViewModelEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorRegistroBaseViewModel_RegistrosViewModel() {
		return (EReference)contenedorRegistroBaseViewModelEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorRegistroBaseViewModel_ListaListapreciosViewModel() {
		return (EReference)contenedorRegistroBaseViewModelEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorRegistroBaseViewModel_SelectedListapreciosViewModel() {
		return (EReference)contenedorRegistroBaseViewModelEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorRegistroBaseViewModel_ListapreciosViewModel() {
		return (EReference)contenedorRegistroBaseViewModelEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFiltrarrutasViewModel() {
		return filtrarrutasViewModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFiltrarrutasViewModel_OwnedByContenedorRegistroBaseViewModel() {
		return (EReference)filtrarrutasViewModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFiltrarrutasViewModel_TheContenedorRegistroBaseViewModelFiltrarrutasViewModelFiltrarrutasViewModel() {
		return (EReference)filtrarrutasViewModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFiltrarrutasViewModel_TheContenedorRegistroBaseViewModelselectedFiltrarrutasViewModel() {
		return (EReference)filtrarrutasViewModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFiltrarrutasViewModel_Name() {
		return (EAttribute)filtrarrutasViewModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContenedorInformaciongeneralViewModel() {
		return contenedorInformaciongeneralViewModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorInformaciongeneralViewModel_OwnedByContenedorRegistroBaseViewModelTheInformaciongeneral() {
		return (EReference)contenedorInformaciongeneralViewModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContenedorInformaciongeneralViewModel_Nombre() {
		return (EAttribute)contenedorInformaciongeneralViewModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContenedorInformaciongeneralViewModel_Hora() {
		return (EAttribute)contenedorInformaciongeneralViewModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContenedorInformaciongeneralViewModel_Ruta() {
		return (EAttribute)contenedorInformaciongeneralViewModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContenedorInformaciongeneralViewModel_Fecha() {
		return (EAttribute)contenedorInformaciongeneralViewModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContenedorBusquedaViewModel() {
		return contenedorBusquedaViewModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorBusquedaViewModel_OwnedByContenedorRegistroBaseViewModelTheBusqueda() {
		return (EReference)contenedorBusquedaViewModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContenedorBusquedaViewModel_TxtNombredelconductorViewModel() {
		return (EAttribute)contenedorBusquedaViewModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContenedorBusquedaViewModel_TxtRutadelconductorViewModel() {
		return (EAttribute)contenedorBusquedaViewModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorBusquedaViewModel_ListaNombredelconductorViewModel() {
		return (EReference)contenedorBusquedaViewModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorBusquedaViewModel_NombredelconductorViewModel() {
		return (EReference)contenedorBusquedaViewModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorBusquedaViewModel_SelectedNombredelconductorViewModel() {
		return (EReference)contenedorBusquedaViewModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorBusquedaViewModel_ListaRutadelconductorViewModel() {
		return (EReference)contenedorBusquedaViewModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorBusquedaViewModel_RutadelconductorViewModel() {
		return (EReference)contenedorBusquedaViewModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorBusquedaViewModel_SelectedRutadelconductorViewModel() {
		return (EReference)contenedorBusquedaViewModelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNombredelconductorViewModel() {
		return nombredelconductorViewModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNombredelconductorViewModel_OwnedContenedorBusquedaViewModel() {
		return (EReference)nombredelconductorViewModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNombredelconductorViewModel_TheContenedorBusquedaViewModelNombredelconductorViewModelNombredelconductorViewModel() {
		return (EReference)nombredelconductorViewModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNombredelconductorViewModel_TheContenedorBusquedaViewModelselectedNombredelconductorViewModel() {
		return (EReference)nombredelconductorViewModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNombredelconductorViewModel_Name() {
		return (EAttribute)nombredelconductorViewModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRutadelconductorViewModel() {
		return rutadelconductorViewModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRutadelconductorViewModel_OwnedContenedorBusquedaViewModel() {
		return (EReference)rutadelconductorViewModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRutadelconductorViewModel_TheContenedorBusquedaViewModelRutadelconductorViewModelRutadelconductorViewModel() {
		return (EReference)rutadelconductorViewModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRutadelconductorViewModel_TheContenedorBusquedaViewModelselectedRutadelconductorViewModel() {
		return (EReference)rutadelconductorViewModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRutadelconductorViewModel_Name() {
		return (EAttribute)rutadelconductorViewModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegistrosViewModel() {
		return registrosViewModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegistrosViewModel_OwnedByContenedorRegistroBaseViewModel() {
		return (EReference)registrosViewModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegistrosViewModel_TheContenedorRegistroBaseViewModelselectedRegistrosViewModel() {
		return (EReference)registrosViewModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegistrosViewModel_TheContenedorRegistroBaseViewModelRegistrosViewModelRegistrosViewModel() {
		return (EReference)registrosViewModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegistrosViewModel_Id() {
		return (EAttribute)registrosViewModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegistrosViewModel_Hora() {
		return (EAttribute)registrosViewModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegistrosViewModel_Estado() {
		return (EAttribute)registrosViewModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegistrosViewModel_Incidencia() {
		return (EAttribute)registrosViewModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegistrosViewModel_Lugar() {
		return (EAttribute)registrosViewModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListapreciosViewModel() {
		return listapreciosViewModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListapreciosViewModel_OwnedByContenedorRegistroBaseViewModel() {
		return (EReference)listapreciosViewModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListapreciosViewModel_TheContenedorRegistroBaseViewModelselectedListapreciosViewModel() {
		return (EReference)listapreciosViewModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListapreciosViewModel_TheContenedorRegistroBaseViewModelListapreciosViewModelListapreciosViewModel() {
		return (EReference)listapreciosViewModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListapreciosViewModel_Ruta1() {
		return (EAttribute)listapreciosViewModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListapreciosViewModel_Ruta2() {
		return (EAttribute)listapreciosViewModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListapreciosViewModel_Pecio() {
		return (EAttribute)listapreciosViewModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorregistrobaseviewmodelFactory getContenedorregistrobaseviewmodelFactory() {
		return (ContenedorregistrobaseviewmodelFactory)getEFactoryInstance();
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
		contenedorRegistroBaseViewModelEClass = createEClass(CONTENEDOR_REGISTRO_BASE_VIEW_MODEL);
		createEReference(contenedorRegistroBaseViewModelEClass, CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__OWNED_BY_UI);
		createEAttribute(contenedorRegistroBaseViewModelEClass, CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__NOTIFICACION);
		createEAttribute(contenedorRegistroBaseViewModelEClass, CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__TXT_FILTRARRUTAS_VIEW_MODEL);
		createEReference(contenedorRegistroBaseViewModelEClass, CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__LISTA_FILTRARRUTAS_VIEW_MODEL);
		createEReference(contenedorRegistroBaseViewModelEClass, CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__FILTRARRUTAS_VIEW_MODEL);
		createEReference(contenedorRegistroBaseViewModelEClass, CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__SELECTED_FILTRARRUTAS_VIEW_MODEL);
		createEReference(contenedorRegistroBaseViewModelEClass, CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__THE_INFORMACIONGENERAL);
		createEReference(contenedorRegistroBaseViewModelEClass, CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__THE_BUSQUEDA);
		createEReference(contenedorRegistroBaseViewModelEClass, CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__LISTA_REGISTROS_VIEW_MODEL);
		createEReference(contenedorRegistroBaseViewModelEClass, CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__SELECTED_REGISTROS_VIEW_MODEL);
		createEReference(contenedorRegistroBaseViewModelEClass, CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__REGISTROS_VIEW_MODEL);
		createEReference(contenedorRegistroBaseViewModelEClass, CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__LISTA_LISTAPRECIOS_VIEW_MODEL);
		createEReference(contenedorRegistroBaseViewModelEClass, CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__SELECTED_LISTAPRECIOS_VIEW_MODEL);
		createEReference(contenedorRegistroBaseViewModelEClass, CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__LISTAPRECIOS_VIEW_MODEL);

		filtrarrutasViewModelEClass = createEClass(FILTRARRUTAS_VIEW_MODEL);
		createEReference(filtrarrutasViewModelEClass, FILTRARRUTAS_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL);
		createEReference(filtrarrutasViewModelEClass, FILTRARRUTAS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_FILTRARRUTAS_VIEW_MODEL_FILTRARRUTAS_VIEW_MODEL);
		createEReference(filtrarrutasViewModelEClass, FILTRARRUTAS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODELSELECTED_FILTRARRUTAS_VIEW_MODEL);
		createEAttribute(filtrarrutasViewModelEClass, FILTRARRUTAS_VIEW_MODEL__NAME);

		contenedorInformaciongeneralViewModelEClass = createEClass(CONTENEDOR_INFORMACIONGENERAL_VIEW_MODEL);
		createEReference(contenedorInformaciongeneralViewModelEClass, CONTENEDOR_INFORMACIONGENERAL_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_THE_INFORMACIONGENERAL);
		createEAttribute(contenedorInformaciongeneralViewModelEClass, CONTENEDOR_INFORMACIONGENERAL_VIEW_MODEL__NOMBRE);
		createEAttribute(contenedorInformaciongeneralViewModelEClass, CONTENEDOR_INFORMACIONGENERAL_VIEW_MODEL__HORA);
		createEAttribute(contenedorInformaciongeneralViewModelEClass, CONTENEDOR_INFORMACIONGENERAL_VIEW_MODEL__RUTA);
		createEAttribute(contenedorInformaciongeneralViewModelEClass, CONTENEDOR_INFORMACIONGENERAL_VIEW_MODEL__FECHA);

		contenedorBusquedaViewModelEClass = createEClass(CONTENEDOR_BUSQUEDA_VIEW_MODEL);
		createEReference(contenedorBusquedaViewModelEClass, CONTENEDOR_BUSQUEDA_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_THE_BUSQUEDA);
		createEAttribute(contenedorBusquedaViewModelEClass, CONTENEDOR_BUSQUEDA_VIEW_MODEL__TXT_NOMBREDELCONDUCTOR_VIEW_MODEL);
		createEAttribute(contenedorBusquedaViewModelEClass, CONTENEDOR_BUSQUEDA_VIEW_MODEL__TXT_RUTADELCONDUCTOR_VIEW_MODEL);
		createEReference(contenedorBusquedaViewModelEClass, CONTENEDOR_BUSQUEDA_VIEW_MODEL__LISTA_NOMBREDELCONDUCTOR_VIEW_MODEL);
		createEReference(contenedorBusquedaViewModelEClass, CONTENEDOR_BUSQUEDA_VIEW_MODEL__NOMBREDELCONDUCTOR_VIEW_MODEL);
		createEReference(contenedorBusquedaViewModelEClass, CONTENEDOR_BUSQUEDA_VIEW_MODEL__SELECTED_NOMBREDELCONDUCTOR_VIEW_MODEL);
		createEReference(contenedorBusquedaViewModelEClass, CONTENEDOR_BUSQUEDA_VIEW_MODEL__LISTA_RUTADELCONDUCTOR_VIEW_MODEL);
		createEReference(contenedorBusquedaViewModelEClass, CONTENEDOR_BUSQUEDA_VIEW_MODEL__RUTADELCONDUCTOR_VIEW_MODEL);
		createEReference(contenedorBusquedaViewModelEClass, CONTENEDOR_BUSQUEDA_VIEW_MODEL__SELECTED_RUTADELCONDUCTOR_VIEW_MODEL);

		nombredelconductorViewModelEClass = createEClass(NOMBREDELCONDUCTOR_VIEW_MODEL);
		createEReference(nombredelconductorViewModelEClass, NOMBREDELCONDUCTOR_VIEW_MODEL__OWNED_CONTENEDOR_BUSQUEDA_VIEW_MODEL);
		createEReference(nombredelconductorViewModelEClass, NOMBREDELCONDUCTOR_VIEW_MODEL__THE_CONTENEDOR_BUSQUEDA_VIEW_MODEL_NOMBREDELCONDUCTOR_VIEW_MODEL_NOMBREDELCONDUCTOR_VIEW_MODEL);
		createEReference(nombredelconductorViewModelEClass, NOMBREDELCONDUCTOR_VIEW_MODEL__THE_CONTENEDOR_BUSQUEDA_VIEW_MODELSELECTED_NOMBREDELCONDUCTOR_VIEW_MODEL);
		createEAttribute(nombredelconductorViewModelEClass, NOMBREDELCONDUCTOR_VIEW_MODEL__NAME);

		rutadelconductorViewModelEClass = createEClass(RUTADELCONDUCTOR_VIEW_MODEL);
		createEReference(rutadelconductorViewModelEClass, RUTADELCONDUCTOR_VIEW_MODEL__OWNED_CONTENEDOR_BUSQUEDA_VIEW_MODEL);
		createEReference(rutadelconductorViewModelEClass, RUTADELCONDUCTOR_VIEW_MODEL__THE_CONTENEDOR_BUSQUEDA_VIEW_MODEL_RUTADELCONDUCTOR_VIEW_MODEL_RUTADELCONDUCTOR_VIEW_MODEL);
		createEReference(rutadelconductorViewModelEClass, RUTADELCONDUCTOR_VIEW_MODEL__THE_CONTENEDOR_BUSQUEDA_VIEW_MODELSELECTED_RUTADELCONDUCTOR_VIEW_MODEL);
		createEAttribute(rutadelconductorViewModelEClass, RUTADELCONDUCTOR_VIEW_MODEL__NAME);

		registrosViewModelEClass = createEClass(REGISTROS_VIEW_MODEL);
		createEReference(registrosViewModelEClass, REGISTROS_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL);
		createEReference(registrosViewModelEClass, REGISTROS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODELSELECTED_REGISTROS_VIEW_MODEL);
		createEReference(registrosViewModelEClass, REGISTROS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_REGISTROS_VIEW_MODEL_REGISTROS_VIEW_MODEL);
		createEAttribute(registrosViewModelEClass, REGISTROS_VIEW_MODEL__ID);
		createEAttribute(registrosViewModelEClass, REGISTROS_VIEW_MODEL__HORA);
		createEAttribute(registrosViewModelEClass, REGISTROS_VIEW_MODEL__ESTADO);
		createEAttribute(registrosViewModelEClass, REGISTROS_VIEW_MODEL__INCIDENCIA);
		createEAttribute(registrosViewModelEClass, REGISTROS_VIEW_MODEL__LUGAR);

		listapreciosViewModelEClass = createEClass(LISTAPRECIOS_VIEW_MODEL);
		createEReference(listapreciosViewModelEClass, LISTAPRECIOS_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL);
		createEReference(listapreciosViewModelEClass, LISTAPRECIOS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODELSELECTED_LISTAPRECIOS_VIEW_MODEL);
		createEReference(listapreciosViewModelEClass, LISTAPRECIOS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_LISTAPRECIOS_VIEW_MODEL_LISTAPRECIOS_VIEW_MODEL);
		createEAttribute(listapreciosViewModelEClass, LISTAPRECIOS_VIEW_MODEL__RUTA1);
		createEAttribute(listapreciosViewModelEClass, LISTAPRECIOS_VIEW_MODEL__RUTA2);
		createEAttribute(listapreciosViewModelEClass, LISTAPRECIOS_VIEW_MODEL__PECIO);
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
		UiPackage theUiPackage = (UiPackage)EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI);
		cootracirPackage thecootracirPackage = (cootracirPackage)EPackage.Registry.INSTANCE.getEPackage(cootracirPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		contenedorRegistroBaseViewModelEClass.getESuperTypes().add(theViewmodelsPackage.getViewModel());
		contenedorInformaciongeneralViewModelEClass.getESuperTypes().add(theViewmodelsPackage.getViewModel());
		contenedorBusquedaViewModelEClass.getESuperTypes().add(theViewmodelsPackage.getViewModel());

		// Initialize classes and features; add operations and parameters
		initEClass(contenedorRegistroBaseViewModelEClass, ContenedorRegistroBaseViewModel.class, "ContenedorRegistroBaseViewModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContenedorRegistroBaseViewModel_OwnedByUI(), theUiPackage.getUI(), theUiPackage.getUI_TheContenedorRegistroBaseViewModel(), "ownedByUI", null, 0, 1, ContenedorRegistroBaseViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContenedorRegistroBaseViewModel_Notificacion(), thecootracirPackage.getString(), "notificacion", " ", 0, 1, ContenedorRegistroBaseViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContenedorRegistroBaseViewModel_TxtFiltrarrutasViewModel(), thecootracirPackage.getString(), "txtFiltrarrutasViewModel", " ", 0, 1, ContenedorRegistroBaseViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedorRegistroBaseViewModel_ListaFiltrarrutasViewModel(), this.getFiltrarrutasViewModel(), this.getFiltrarrutasViewModel_OwnedByContenedorRegistroBaseViewModel(), "listaFiltrarrutasViewModel", null, 0, -1, ContenedorRegistroBaseViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedorRegistroBaseViewModel_FiltrarrutasViewModel(), this.getFiltrarrutasViewModel(), this.getFiltrarrutasViewModel_TheContenedorRegistroBaseViewModelFiltrarrutasViewModelFiltrarrutasViewModel(), "filtrarrutasViewModel", null, 0, -1, ContenedorRegistroBaseViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedorRegistroBaseViewModel_SelectedFiltrarrutasViewModel(), this.getFiltrarrutasViewModel(), this.getFiltrarrutasViewModel_TheContenedorRegistroBaseViewModelselectedFiltrarrutasViewModel(), "selectedFiltrarrutasViewModel", null, 0, 1, ContenedorRegistroBaseViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedorRegistroBaseViewModel_TheInformaciongeneral(), this.getContenedorInformaciongeneralViewModel(), this.getContenedorInformaciongeneralViewModel_OwnedByContenedorRegistroBaseViewModelTheInformaciongeneral(), "theInformaciongeneral", null, 0, 1, ContenedorRegistroBaseViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedorRegistroBaseViewModel_TheBusqueda(), this.getContenedorBusquedaViewModel(), this.getContenedorBusquedaViewModel_OwnedByContenedorRegistroBaseViewModelTheBusqueda(), "theBusqueda", null, 0, 1, ContenedorRegistroBaseViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedorRegistroBaseViewModel_ListaRegistrosViewModel(), this.getRegistrosViewModel(), this.getRegistrosViewModel_OwnedByContenedorRegistroBaseViewModel(), "listaRegistrosViewModel", null, 0, -1, ContenedorRegistroBaseViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedorRegistroBaseViewModel_SelectedRegistrosViewModel(), this.getRegistrosViewModel(), this.getRegistrosViewModel_TheContenedorRegistroBaseViewModelselectedRegistrosViewModel(), "selectedRegistrosViewModel", null, 0, 1, ContenedorRegistroBaseViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedorRegistroBaseViewModel_RegistrosViewModel(), this.getRegistrosViewModel(), this.getRegistrosViewModel_TheContenedorRegistroBaseViewModelRegistrosViewModelRegistrosViewModel(), "registrosViewModel", null, 0, -1, ContenedorRegistroBaseViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedorRegistroBaseViewModel_ListaListapreciosViewModel(), this.getListapreciosViewModel(), this.getListapreciosViewModel_OwnedByContenedorRegistroBaseViewModel(), "listaListapreciosViewModel", null, 0, -1, ContenedorRegistroBaseViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedorRegistroBaseViewModel_SelectedListapreciosViewModel(), this.getListapreciosViewModel(), this.getListapreciosViewModel_TheContenedorRegistroBaseViewModelselectedListapreciosViewModel(), "selectedListapreciosViewModel", null, 0, 1, ContenedorRegistroBaseViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedorRegistroBaseViewModel_ListapreciosViewModel(), this.getListapreciosViewModel(), this.getListapreciosViewModel_TheContenedorRegistroBaseViewModelListapreciosViewModelListapreciosViewModel(), "listapreciosViewModel", null, 0, -1, ContenedorRegistroBaseViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(filtrarrutasViewModelEClass, FiltrarrutasViewModel.class, "FiltrarrutasViewModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFiltrarrutasViewModel_OwnedByContenedorRegistroBaseViewModel(), this.getContenedorRegistroBaseViewModel(), this.getContenedorRegistroBaseViewModel_ListaFiltrarrutasViewModel(), "ownedByContenedorRegistroBaseViewModel", null, 0, 1, FiltrarrutasViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFiltrarrutasViewModel_TheContenedorRegistroBaseViewModelFiltrarrutasViewModelFiltrarrutasViewModel(), this.getContenedorRegistroBaseViewModel(), this.getContenedorRegistroBaseViewModel_FiltrarrutasViewModel(), "theContenedorRegistroBaseViewModelFiltrarrutasViewModelFiltrarrutasViewModel", null, 0, 1, FiltrarrutasViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFiltrarrutasViewModel_TheContenedorRegistroBaseViewModelselectedFiltrarrutasViewModel(), this.getContenedorRegistroBaseViewModel(), this.getContenedorRegistroBaseViewModel_SelectedFiltrarrutasViewModel(), "theContenedorRegistroBaseViewModelselectedFiltrarrutasViewModel", null, 0, 1, FiltrarrutasViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFiltrarrutasViewModel_Name(), thecootracirPackage.getString(), "name", " ", 0, 1, FiltrarrutasViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contenedorInformaciongeneralViewModelEClass, ContenedorInformaciongeneralViewModel.class, "ContenedorInformaciongeneralViewModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContenedorInformaciongeneralViewModel_OwnedByContenedorRegistroBaseViewModelTheInformaciongeneral(), this.getContenedorRegistroBaseViewModel(), this.getContenedorRegistroBaseViewModel_TheInformaciongeneral(), "ownedByContenedorRegistroBaseViewModelTheInformaciongeneral", null, 0, 1, ContenedorInformaciongeneralViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContenedorInformaciongeneralViewModel_Nombre(), thecootracirPackage.getString(), "nombre", " ", 0, 1, ContenedorInformaciongeneralViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContenedorInformaciongeneralViewModel_Hora(), thecootracirPackage.getString(), "hora", " ", 0, 1, ContenedorInformaciongeneralViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContenedorInformaciongeneralViewModel_Ruta(), thecootracirPackage.getString(), "ruta", " ", 0, 1, ContenedorInformaciongeneralViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContenedorInformaciongeneralViewModel_Fecha(), thecootracirPackage.getString(), "fecha", " ", 0, 1, ContenedorInformaciongeneralViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contenedorBusquedaViewModelEClass, ContenedorBusquedaViewModel.class, "ContenedorBusquedaViewModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContenedorBusquedaViewModel_OwnedByContenedorRegistroBaseViewModelTheBusqueda(), this.getContenedorRegistroBaseViewModel(), this.getContenedorRegistroBaseViewModel_TheBusqueda(), "ownedByContenedorRegistroBaseViewModelTheBusqueda", null, 0, 1, ContenedorBusquedaViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContenedorBusquedaViewModel_TxtNombredelconductorViewModel(), thecootracirPackage.getString(), "txtNombredelconductorViewModel", " ", 0, 1, ContenedorBusquedaViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContenedorBusquedaViewModel_TxtRutadelconductorViewModel(), thecootracirPackage.getString(), "txtRutadelconductorViewModel", " ", 0, 1, ContenedorBusquedaViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedorBusquedaViewModel_ListaNombredelconductorViewModel(), this.getNombredelconductorViewModel(), this.getNombredelconductorViewModel_OwnedContenedorBusquedaViewModel(), "listaNombredelconductorViewModel", null, 0, -1, ContenedorBusquedaViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedorBusquedaViewModel_NombredelconductorViewModel(), this.getNombredelconductorViewModel(), this.getNombredelconductorViewModel_TheContenedorBusquedaViewModelNombredelconductorViewModelNombredelconductorViewModel(), "nombredelconductorViewModel", null, 0, -1, ContenedorBusquedaViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedorBusquedaViewModel_SelectedNombredelconductorViewModel(), this.getNombredelconductorViewModel(), this.getNombredelconductorViewModel_TheContenedorBusquedaViewModelselectedNombredelconductorViewModel(), "selectedNombredelconductorViewModel", null, 0, 1, ContenedorBusquedaViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedorBusquedaViewModel_ListaRutadelconductorViewModel(), this.getRutadelconductorViewModel(), this.getRutadelconductorViewModel_OwnedContenedorBusquedaViewModel(), "listaRutadelconductorViewModel", null, 0, -1, ContenedorBusquedaViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedorBusquedaViewModel_RutadelconductorViewModel(), this.getRutadelconductorViewModel(), this.getRutadelconductorViewModel_TheContenedorBusquedaViewModelRutadelconductorViewModelRutadelconductorViewModel(), "rutadelconductorViewModel", null, 0, -1, ContenedorBusquedaViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedorBusquedaViewModel_SelectedRutadelconductorViewModel(), this.getRutadelconductorViewModel(), this.getRutadelconductorViewModel_TheContenedorBusquedaViewModelselectedRutadelconductorViewModel(), "selectedRutadelconductorViewModel", null, 0, 1, ContenedorBusquedaViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nombredelconductorViewModelEClass, NombredelconductorViewModel.class, "NombredelconductorViewModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNombredelconductorViewModel_OwnedContenedorBusquedaViewModel(), this.getContenedorBusquedaViewModel(), this.getContenedorBusquedaViewModel_ListaNombredelconductorViewModel(), "ownedContenedorBusquedaViewModel", null, 0, 1, NombredelconductorViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNombredelconductorViewModel_TheContenedorBusquedaViewModelNombredelconductorViewModelNombredelconductorViewModel(), this.getContenedorBusquedaViewModel(), this.getContenedorBusquedaViewModel_NombredelconductorViewModel(), "theContenedorBusquedaViewModelNombredelconductorViewModelNombredelconductorViewModel", null, 0, 1, NombredelconductorViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNombredelconductorViewModel_TheContenedorBusquedaViewModelselectedNombredelconductorViewModel(), this.getContenedorBusquedaViewModel(), this.getContenedorBusquedaViewModel_SelectedNombredelconductorViewModel(), "theContenedorBusquedaViewModelselectedNombredelconductorViewModel", null, 0, 1, NombredelconductorViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNombredelconductorViewModel_Name(), thecootracirPackage.getString(), "name", " ", 0, 1, NombredelconductorViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rutadelconductorViewModelEClass, RutadelconductorViewModel.class, "RutadelconductorViewModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRutadelconductorViewModel_OwnedContenedorBusquedaViewModel(), this.getContenedorBusquedaViewModel(), this.getContenedorBusquedaViewModel_ListaRutadelconductorViewModel(), "ownedContenedorBusquedaViewModel", null, 0, 1, RutadelconductorViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRutadelconductorViewModel_TheContenedorBusquedaViewModelRutadelconductorViewModelRutadelconductorViewModel(), this.getContenedorBusquedaViewModel(), this.getContenedorBusquedaViewModel_RutadelconductorViewModel(), "theContenedorBusquedaViewModelRutadelconductorViewModelRutadelconductorViewModel", null, 0, 1, RutadelconductorViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRutadelconductorViewModel_TheContenedorBusquedaViewModelselectedRutadelconductorViewModel(), this.getContenedorBusquedaViewModel(), this.getContenedorBusquedaViewModel_SelectedRutadelconductorViewModel(), "theContenedorBusquedaViewModelselectedRutadelconductorViewModel", null, 0, 1, RutadelconductorViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRutadelconductorViewModel_Name(), thecootracirPackage.getString(), "name", " ", 0, 1, RutadelconductorViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(registrosViewModelEClass, RegistrosViewModel.class, "RegistrosViewModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegistrosViewModel_OwnedByContenedorRegistroBaseViewModel(), this.getContenedorRegistroBaseViewModel(), this.getContenedorRegistroBaseViewModel_ListaRegistrosViewModel(), "ownedByContenedorRegistroBaseViewModel", null, 0, 1, RegistrosViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegistrosViewModel_TheContenedorRegistroBaseViewModelselectedRegistrosViewModel(), this.getContenedorRegistroBaseViewModel(), this.getContenedorRegistroBaseViewModel_SelectedRegistrosViewModel(), "theContenedorRegistroBaseViewModelselectedRegistrosViewModel", null, 0, 1, RegistrosViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegistrosViewModel_TheContenedorRegistroBaseViewModelRegistrosViewModelRegistrosViewModel(), this.getContenedorRegistroBaseViewModel(), this.getContenedorRegistroBaseViewModel_RegistrosViewModel(), "theContenedorRegistroBaseViewModelRegistrosViewModelRegistrosViewModel", null, 0, 1, RegistrosViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegistrosViewModel_Id(), thecootracirPackage.getString(), "id", " ", 0, 1, RegistrosViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegistrosViewModel_Hora(), thecootracirPackage.getString(), "hora", " ", 0, 1, RegistrosViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegistrosViewModel_Estado(), thecootracirPackage.getString(), "estado", " ", 0, 1, RegistrosViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegistrosViewModel_Incidencia(), thecootracirPackage.getString(), "incidencia", " ", 0, 1, RegistrosViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegistrosViewModel_Lugar(), thecootracirPackage.getString(), "lugar", " ", 0, 1, RegistrosViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listapreciosViewModelEClass, ListapreciosViewModel.class, "ListapreciosViewModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListapreciosViewModel_OwnedByContenedorRegistroBaseViewModel(), this.getContenedorRegistroBaseViewModel(), this.getContenedorRegistroBaseViewModel_ListaListapreciosViewModel(), "ownedByContenedorRegistroBaseViewModel", null, 0, 1, ListapreciosViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getListapreciosViewModel_TheContenedorRegistroBaseViewModelselectedListapreciosViewModel(), this.getContenedorRegistroBaseViewModel(), this.getContenedorRegistroBaseViewModel_SelectedListapreciosViewModel(), "theContenedorRegistroBaseViewModelselectedListapreciosViewModel", null, 0, 1, ListapreciosViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getListapreciosViewModel_TheContenedorRegistroBaseViewModelListapreciosViewModelListapreciosViewModel(), this.getContenedorRegistroBaseViewModel(), this.getContenedorRegistroBaseViewModel_ListapreciosViewModel(), "theContenedorRegistroBaseViewModelListapreciosViewModelListapreciosViewModel", null, 0, 1, ListapreciosViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getListapreciosViewModel_Ruta1(), thecootracirPackage.getString(), "ruta1", " ", 0, 1, ListapreciosViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getListapreciosViewModel_Ruta2(), thecootracirPackage.getString(), "ruta2", " ", 0, 1, ListapreciosViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getListapreciosViewModel_Pecio(), thecootracirPackage.getString(), "pecio", " ", 0, 1, ListapreciosViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //ContenedorregistrobaseviewmodelPackageImpl
