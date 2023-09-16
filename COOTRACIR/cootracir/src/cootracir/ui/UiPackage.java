/**
 */
package cootracir.ui;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see cootracir.ui.UiFactory
 * @model kind="package"
 * @generated
 */
public interface UiPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ui";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///cootracir/ui.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cootracir.ui";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UiPackage eINSTANCE = cootracir.ui.impl.UiPackageImpl.init();

	/**
	 * The meta object id for the '{@link cootracir.ui.impl.UIImpl <em>UI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cootracir.ui.impl.UIImpl
	 * @see cootracir.ui.impl.UiPackageImpl#getUI()
	 * @generated
	 */
	int UI = 0;

	/**
	 * The feature id for the '<em><b>The Model Factory</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__THE_MODEL_FACTORY = 0;

	/**
	 * The feature id for the '<em><b>The Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__THE_DOMAIN = 1;

	/**
	 * The feature id for the '<em><b>Lst View Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__LST_VIEW_MODELS = 2;

	/**
	 * The feature id for the '<em><b>The Contenedor Registro Base View Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL = 3;

	/**
	 * The number of structural features of the '<em>UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_FEATURE_COUNT = 4;


	/**
	 * Returns the meta object for class '{@link cootracir.ui.UI <em>UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI</em>'.
	 * @see cootracir.ui.UI
	 * @generated
	 */
	EClass getUI();

	/**
	 * Returns the meta object for the container reference '{@link cootracir.ui.UI#getTheModelFactory <em>The Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>The Model Factory</em>'.
	 * @see cootracir.ui.UI#getTheModelFactory()
	 * @see #getUI()
	 * @generated
	 */
	EReference getUI_TheModelFactory();

	/**
	 * Returns the meta object for the reference '{@link cootracir.ui.UI#getTheDomain <em>The Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>The Domain</em>'.
	 * @see cootracir.ui.UI#getTheDomain()
	 * @see #getUI()
	 * @generated
	 */
	EReference getUI_TheDomain();

	/**
	 * Returns the meta object for the reference list '{@link cootracir.ui.UI#getLstViewModels <em>Lst View Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lst View Models</em>'.
	 * @see cootracir.ui.UI#getLstViewModels()
	 * @see #getUI()
	 * @generated
	 */
	EReference getUI_LstViewModels();

	/**
	 * Returns the meta object for the containment reference '{@link cootracir.ui.UI#getTheContenedorRegistroBaseViewModel <em>The Contenedor Registro Base View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Contenedor Registro Base View Model</em>'.
	 * @see cootracir.ui.UI#getTheContenedorRegistroBaseViewModel()
	 * @see #getUI()
	 * @generated
	 */
	EReference getUI_TheContenedorRegistroBaseViewModel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UiFactory getUiFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link cootracir.ui.impl.UIImpl <em>UI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cootracir.ui.impl.UIImpl
		 * @see cootracir.ui.impl.UiPackageImpl#getUI()
		 * @generated
		 */
		EClass UI = eINSTANCE.getUI();

		/**
		 * The meta object literal for the '<em><b>The Model Factory</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI__THE_MODEL_FACTORY = eINSTANCE.getUI_TheModelFactory();

		/**
		 * The meta object literal for the '<em><b>The Domain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI__THE_DOMAIN = eINSTANCE.getUI_TheDomain();

		/**
		 * The meta object literal for the '<em><b>Lst View Models</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI__LST_VIEW_MODELS = eINSTANCE.getUI_LstViewModels();

		/**
		 * The meta object literal for the '<em><b>The Contenedor Registro Base View Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL = eINSTANCE.getUI_TheContenedorRegistroBaseViewModel();

	}

} //UiPackage
