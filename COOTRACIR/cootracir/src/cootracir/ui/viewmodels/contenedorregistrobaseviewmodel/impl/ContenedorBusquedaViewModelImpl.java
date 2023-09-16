/**
 */
package cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl;

import cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorBusquedaViewModel;
import cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorRegistroBaseViewModel;
import cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelPackage;
import cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.NombredelconductorViewModel;
import cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.RutadelconductorViewModel;

import cootracir.ui.viewmodels.impl.ViewModelImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contenedor Busqueda View Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.ContenedorBusquedaViewModelImpl#getOwnedByContenedorRegistroBaseViewModelTheBusqueda <em>Owned By Contenedor Registro Base View Model The Busqueda</em>}</li>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.ContenedorBusquedaViewModelImpl#getTxtNombredelconductorViewModel <em>Txt Nombredelconductor View Model</em>}</li>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.ContenedorBusquedaViewModelImpl#getTxtRutadelconductorViewModel <em>Txt Rutadelconductor View Model</em>}</li>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.ContenedorBusquedaViewModelImpl#getListaNombredelconductorViewModel <em>Lista Nombredelconductor View Model</em>}</li>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.ContenedorBusquedaViewModelImpl#getNombredelconductorViewModel <em>Nombredelconductor View Model</em>}</li>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.ContenedorBusquedaViewModelImpl#getSelectedNombredelconductorViewModel <em>Selected Nombredelconductor View Model</em>}</li>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.ContenedorBusquedaViewModelImpl#getListaRutadelconductorViewModel <em>Lista Rutadelconductor View Model</em>}</li>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.ContenedorBusquedaViewModelImpl#getRutadelconductorViewModel <em>Rutadelconductor View Model</em>}</li>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.ContenedorBusquedaViewModelImpl#getSelectedRutadelconductorViewModel <em>Selected Rutadelconductor View Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContenedorBusquedaViewModelImpl extends ViewModelImpl implements ContenedorBusquedaViewModel {
	/**
	 * The default value of the '{@link #getTxtNombredelconductorViewModel() <em>Txt Nombredelconductor View Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTxtNombredelconductorViewModel()
	 * @generated
	 * @ordered
	 */
	protected static final String TXT_NOMBREDELCONDUCTOR_VIEW_MODEL_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getTxtNombredelconductorViewModel() <em>Txt Nombredelconductor View Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTxtNombredelconductorViewModel()
	 * @generated
	 * @ordered
	 */
	protected String txtNombredelconductorViewModel = TXT_NOMBREDELCONDUCTOR_VIEW_MODEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTxtRutadelconductorViewModel() <em>Txt Rutadelconductor View Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTxtRutadelconductorViewModel()
	 * @generated
	 * @ordered
	 */
	protected static final String TXT_RUTADELCONDUCTOR_VIEW_MODEL_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getTxtRutadelconductorViewModel() <em>Txt Rutadelconductor View Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTxtRutadelconductorViewModel()
	 * @generated
	 * @ordered
	 */
	protected String txtRutadelconductorViewModel = TXT_RUTADELCONDUCTOR_VIEW_MODEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getListaNombredelconductorViewModel() <em>Lista Nombredelconductor View Model</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaNombredelconductorViewModel()
	 * @generated
	 * @ordered
	 */
	protected EList<NombredelconductorViewModel> listaNombredelconductorViewModel;

	/**
	 * The cached value of the '{@link #getNombredelconductorViewModel() <em>Nombredelconductor View Model</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombredelconductorViewModel()
	 * @generated
	 * @ordered
	 */
	protected EList<NombredelconductorViewModel> nombredelconductorViewModel;

	/**
	 * The cached value of the '{@link #getSelectedNombredelconductorViewModel() <em>Selected Nombredelconductor View Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedNombredelconductorViewModel()
	 * @generated
	 * @ordered
	 */
	protected NombredelconductorViewModel selectedNombredelconductorViewModel;

	/**
	 * The cached value of the '{@link #getListaRutadelconductorViewModel() <em>Lista Rutadelconductor View Model</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaRutadelconductorViewModel()
	 * @generated
	 * @ordered
	 */
	protected EList<RutadelconductorViewModel> listaRutadelconductorViewModel;

	/**
	 * The cached value of the '{@link #getRutadelconductorViewModel() <em>Rutadelconductor View Model</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRutadelconductorViewModel()
	 * @generated
	 * @ordered
	 */
	protected EList<RutadelconductorViewModel> rutadelconductorViewModel;

	/**
	 * The cached value of the '{@link #getSelectedRutadelconductorViewModel() <em>Selected Rutadelconductor View Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedRutadelconductorViewModel()
	 * @generated
	 * @ordered
	 */
	protected RutadelconductorViewModel selectedRutadelconductorViewModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContenedorBusquedaViewModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContenedorregistrobaseviewmodelPackage.Literals.CONTENEDOR_BUSQUEDA_VIEW_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorRegistroBaseViewModel getOwnedByContenedorRegistroBaseViewModelTheBusqueda() {
		if (eContainerFeatureID() != ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_THE_BUSQUEDA) return null;
		return (ContenedorRegistroBaseViewModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByContenedorRegistroBaseViewModelTheBusqueda(ContenedorRegistroBaseViewModel newOwnedByContenedorRegistroBaseViewModelTheBusqueda, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnedByContenedorRegistroBaseViewModelTheBusqueda, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_THE_BUSQUEDA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedByContenedorRegistroBaseViewModelTheBusqueda(ContenedorRegistroBaseViewModel newOwnedByContenedorRegistroBaseViewModelTheBusqueda) {
		if (newOwnedByContenedorRegistroBaseViewModelTheBusqueda != eInternalContainer() || (eContainerFeatureID() != ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_THE_BUSQUEDA && newOwnedByContenedorRegistroBaseViewModelTheBusqueda != null)) {
			if (EcoreUtil.isAncestor(this, newOwnedByContenedorRegistroBaseViewModelTheBusqueda))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByContenedorRegistroBaseViewModelTheBusqueda != null)
				msgs = ((InternalEObject)newOwnedByContenedorRegistroBaseViewModelTheBusqueda).eInverseAdd(this, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__THE_BUSQUEDA, ContenedorRegistroBaseViewModel.class, msgs);
			msgs = basicSetOwnedByContenedorRegistroBaseViewModelTheBusqueda(newOwnedByContenedorRegistroBaseViewModelTheBusqueda, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_THE_BUSQUEDA, newOwnedByContenedorRegistroBaseViewModelTheBusqueda, newOwnedByContenedorRegistroBaseViewModelTheBusqueda));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTxtNombredelconductorViewModel() {
		return txtNombredelconductorViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTxtNombredelconductorViewModel(String newTxtNombredelconductorViewModel) {
		String oldTxtNombredelconductorViewModel = txtNombredelconductorViewModel;
		txtNombredelconductorViewModel = newTxtNombredelconductorViewModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__TXT_NOMBREDELCONDUCTOR_VIEW_MODEL, oldTxtNombredelconductorViewModel, txtNombredelconductorViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTxtRutadelconductorViewModel() {
		return txtRutadelconductorViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTxtRutadelconductorViewModel(String newTxtRutadelconductorViewModel) {
		String oldTxtRutadelconductorViewModel = txtRutadelconductorViewModel;
		txtRutadelconductorViewModel = newTxtRutadelconductorViewModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__TXT_RUTADELCONDUCTOR_VIEW_MODEL, oldTxtRutadelconductorViewModel, txtRutadelconductorViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NombredelconductorViewModel> getListaNombredelconductorViewModel() {
		if (listaNombredelconductorViewModel == null) {
			listaNombredelconductorViewModel = new EObjectContainmentWithInverseEList<NombredelconductorViewModel>(NombredelconductorViewModel.class, this, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__LISTA_NOMBREDELCONDUCTOR_VIEW_MODEL, ContenedorregistrobaseviewmodelPackage.NOMBREDELCONDUCTOR_VIEW_MODEL__OWNED_CONTENEDOR_BUSQUEDA_VIEW_MODEL);
		}
		return listaNombredelconductorViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NombredelconductorViewModel> getNombredelconductorViewModel() {
		if (nombredelconductorViewModel == null) {
			nombredelconductorViewModel = new EObjectWithInverseResolvingEList<NombredelconductorViewModel>(NombredelconductorViewModel.class, this, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__NOMBREDELCONDUCTOR_VIEW_MODEL, ContenedorregistrobaseviewmodelPackage.NOMBREDELCONDUCTOR_VIEW_MODEL__THE_CONTENEDOR_BUSQUEDA_VIEW_MODEL_NOMBREDELCONDUCTOR_VIEW_MODEL_NOMBREDELCONDUCTOR_VIEW_MODEL);
		}
		return nombredelconductorViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NombredelconductorViewModel getSelectedNombredelconductorViewModel() {
		if (selectedNombredelconductorViewModel != null && selectedNombredelconductorViewModel.eIsProxy()) {
			InternalEObject oldSelectedNombredelconductorViewModel = (InternalEObject)selectedNombredelconductorViewModel;
			selectedNombredelconductorViewModel = (NombredelconductorViewModel)eResolveProxy(oldSelectedNombredelconductorViewModel);
			if (selectedNombredelconductorViewModel != oldSelectedNombredelconductorViewModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__SELECTED_NOMBREDELCONDUCTOR_VIEW_MODEL, oldSelectedNombredelconductorViewModel, selectedNombredelconductorViewModel));
			}
		}
		return selectedNombredelconductorViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NombredelconductorViewModel basicGetSelectedNombredelconductorViewModel() {
		return selectedNombredelconductorViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelectedNombredelconductorViewModel(NombredelconductorViewModel newSelectedNombredelconductorViewModel, NotificationChain msgs) {
		NombredelconductorViewModel oldSelectedNombredelconductorViewModel = selectedNombredelconductorViewModel;
		selectedNombredelconductorViewModel = newSelectedNombredelconductorViewModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__SELECTED_NOMBREDELCONDUCTOR_VIEW_MODEL, oldSelectedNombredelconductorViewModel, newSelectedNombredelconductorViewModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectedNombredelconductorViewModel(NombredelconductorViewModel newSelectedNombredelconductorViewModel) {
		if (newSelectedNombredelconductorViewModel != selectedNombredelconductorViewModel) {
			NotificationChain msgs = null;
			if (selectedNombredelconductorViewModel != null)
				msgs = ((InternalEObject)selectedNombredelconductorViewModel).eInverseRemove(this, ContenedorregistrobaseviewmodelPackage.NOMBREDELCONDUCTOR_VIEW_MODEL__THE_CONTENEDOR_BUSQUEDA_VIEW_MODELSELECTED_NOMBREDELCONDUCTOR_VIEW_MODEL, NombredelconductorViewModel.class, msgs);
			if (newSelectedNombredelconductorViewModel != null)
				msgs = ((InternalEObject)newSelectedNombredelconductorViewModel).eInverseAdd(this, ContenedorregistrobaseviewmodelPackage.NOMBREDELCONDUCTOR_VIEW_MODEL__THE_CONTENEDOR_BUSQUEDA_VIEW_MODELSELECTED_NOMBREDELCONDUCTOR_VIEW_MODEL, NombredelconductorViewModel.class, msgs);
			msgs = basicSetSelectedNombredelconductorViewModel(newSelectedNombredelconductorViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__SELECTED_NOMBREDELCONDUCTOR_VIEW_MODEL, newSelectedNombredelconductorViewModel, newSelectedNombredelconductorViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RutadelconductorViewModel> getListaRutadelconductorViewModel() {
		if (listaRutadelconductorViewModel == null) {
			listaRutadelconductorViewModel = new EObjectContainmentWithInverseEList<RutadelconductorViewModel>(RutadelconductorViewModel.class, this, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__LISTA_RUTADELCONDUCTOR_VIEW_MODEL, ContenedorregistrobaseviewmodelPackage.RUTADELCONDUCTOR_VIEW_MODEL__OWNED_CONTENEDOR_BUSQUEDA_VIEW_MODEL);
		}
		return listaRutadelconductorViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RutadelconductorViewModel> getRutadelconductorViewModel() {
		if (rutadelconductorViewModel == null) {
			rutadelconductorViewModel = new EObjectWithInverseResolvingEList<RutadelconductorViewModel>(RutadelconductorViewModel.class, this, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__RUTADELCONDUCTOR_VIEW_MODEL, ContenedorregistrobaseviewmodelPackage.RUTADELCONDUCTOR_VIEW_MODEL__THE_CONTENEDOR_BUSQUEDA_VIEW_MODEL_RUTADELCONDUCTOR_VIEW_MODEL_RUTADELCONDUCTOR_VIEW_MODEL);
		}
		return rutadelconductorViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RutadelconductorViewModel getSelectedRutadelconductorViewModel() {
		if (selectedRutadelconductorViewModel != null && selectedRutadelconductorViewModel.eIsProxy()) {
			InternalEObject oldSelectedRutadelconductorViewModel = (InternalEObject)selectedRutadelconductorViewModel;
			selectedRutadelconductorViewModel = (RutadelconductorViewModel)eResolveProxy(oldSelectedRutadelconductorViewModel);
			if (selectedRutadelconductorViewModel != oldSelectedRutadelconductorViewModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__SELECTED_RUTADELCONDUCTOR_VIEW_MODEL, oldSelectedRutadelconductorViewModel, selectedRutadelconductorViewModel));
			}
		}
		return selectedRutadelconductorViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RutadelconductorViewModel basicGetSelectedRutadelconductorViewModel() {
		return selectedRutadelconductorViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelectedRutadelconductorViewModel(RutadelconductorViewModel newSelectedRutadelconductorViewModel, NotificationChain msgs) {
		RutadelconductorViewModel oldSelectedRutadelconductorViewModel = selectedRutadelconductorViewModel;
		selectedRutadelconductorViewModel = newSelectedRutadelconductorViewModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__SELECTED_RUTADELCONDUCTOR_VIEW_MODEL, oldSelectedRutadelconductorViewModel, newSelectedRutadelconductorViewModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectedRutadelconductorViewModel(RutadelconductorViewModel newSelectedRutadelconductorViewModel) {
		if (newSelectedRutadelconductorViewModel != selectedRutadelconductorViewModel) {
			NotificationChain msgs = null;
			if (selectedRutadelconductorViewModel != null)
				msgs = ((InternalEObject)selectedRutadelconductorViewModel).eInverseRemove(this, ContenedorregistrobaseviewmodelPackage.RUTADELCONDUCTOR_VIEW_MODEL__THE_CONTENEDOR_BUSQUEDA_VIEW_MODELSELECTED_RUTADELCONDUCTOR_VIEW_MODEL, RutadelconductorViewModel.class, msgs);
			if (newSelectedRutadelconductorViewModel != null)
				msgs = ((InternalEObject)newSelectedRutadelconductorViewModel).eInverseAdd(this, ContenedorregistrobaseviewmodelPackage.RUTADELCONDUCTOR_VIEW_MODEL__THE_CONTENEDOR_BUSQUEDA_VIEW_MODELSELECTED_RUTADELCONDUCTOR_VIEW_MODEL, RutadelconductorViewModel.class, msgs);
			msgs = basicSetSelectedRutadelconductorViewModel(newSelectedRutadelconductorViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__SELECTED_RUTADELCONDUCTOR_VIEW_MODEL, newSelectedRutadelconductorViewModel, newSelectedRutadelconductorViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_THE_BUSQUEDA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByContenedorRegistroBaseViewModelTheBusqueda((ContenedorRegistroBaseViewModel)otherEnd, msgs);
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__LISTA_NOMBREDELCONDUCTOR_VIEW_MODEL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getListaNombredelconductorViewModel()).basicAdd(otherEnd, msgs);
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__NOMBREDELCONDUCTOR_VIEW_MODEL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNombredelconductorViewModel()).basicAdd(otherEnd, msgs);
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__SELECTED_NOMBREDELCONDUCTOR_VIEW_MODEL:
				if (selectedNombredelconductorViewModel != null)
					msgs = ((InternalEObject)selectedNombredelconductorViewModel).eInverseRemove(this, ContenedorregistrobaseviewmodelPackage.NOMBREDELCONDUCTOR_VIEW_MODEL__THE_CONTENEDOR_BUSQUEDA_VIEW_MODELSELECTED_NOMBREDELCONDUCTOR_VIEW_MODEL, NombredelconductorViewModel.class, msgs);
				return basicSetSelectedNombredelconductorViewModel((NombredelconductorViewModel)otherEnd, msgs);
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__LISTA_RUTADELCONDUCTOR_VIEW_MODEL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getListaRutadelconductorViewModel()).basicAdd(otherEnd, msgs);
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__RUTADELCONDUCTOR_VIEW_MODEL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRutadelconductorViewModel()).basicAdd(otherEnd, msgs);
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__SELECTED_RUTADELCONDUCTOR_VIEW_MODEL:
				if (selectedRutadelconductorViewModel != null)
					msgs = ((InternalEObject)selectedRutadelconductorViewModel).eInverseRemove(this, ContenedorregistrobaseviewmodelPackage.RUTADELCONDUCTOR_VIEW_MODEL__THE_CONTENEDOR_BUSQUEDA_VIEW_MODELSELECTED_RUTADELCONDUCTOR_VIEW_MODEL, RutadelconductorViewModel.class, msgs);
				return basicSetSelectedRutadelconductorViewModel((RutadelconductorViewModel)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_THE_BUSQUEDA:
				return basicSetOwnedByContenedorRegistroBaseViewModelTheBusqueda(null, msgs);
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__LISTA_NOMBREDELCONDUCTOR_VIEW_MODEL:
				return ((InternalEList<?>)getListaNombredelconductorViewModel()).basicRemove(otherEnd, msgs);
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__NOMBREDELCONDUCTOR_VIEW_MODEL:
				return ((InternalEList<?>)getNombredelconductorViewModel()).basicRemove(otherEnd, msgs);
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__SELECTED_NOMBREDELCONDUCTOR_VIEW_MODEL:
				return basicSetSelectedNombredelconductorViewModel(null, msgs);
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__LISTA_RUTADELCONDUCTOR_VIEW_MODEL:
				return ((InternalEList<?>)getListaRutadelconductorViewModel()).basicRemove(otherEnd, msgs);
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__RUTADELCONDUCTOR_VIEW_MODEL:
				return ((InternalEList<?>)getRutadelconductorViewModel()).basicRemove(otherEnd, msgs);
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__SELECTED_RUTADELCONDUCTOR_VIEW_MODEL:
				return basicSetSelectedRutadelconductorViewModel(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_THE_BUSQUEDA:
				return eInternalContainer().eInverseRemove(this, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__THE_BUSQUEDA, ContenedorRegistroBaseViewModel.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_THE_BUSQUEDA:
				return getOwnedByContenedorRegistroBaseViewModelTheBusqueda();
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__TXT_NOMBREDELCONDUCTOR_VIEW_MODEL:
				return getTxtNombredelconductorViewModel();
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__TXT_RUTADELCONDUCTOR_VIEW_MODEL:
				return getTxtRutadelconductorViewModel();
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__LISTA_NOMBREDELCONDUCTOR_VIEW_MODEL:
				return getListaNombredelconductorViewModel();
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__NOMBREDELCONDUCTOR_VIEW_MODEL:
				return getNombredelconductorViewModel();
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__SELECTED_NOMBREDELCONDUCTOR_VIEW_MODEL:
				if (resolve) return getSelectedNombredelconductorViewModel();
				return basicGetSelectedNombredelconductorViewModel();
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__LISTA_RUTADELCONDUCTOR_VIEW_MODEL:
				return getListaRutadelconductorViewModel();
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__RUTADELCONDUCTOR_VIEW_MODEL:
				return getRutadelconductorViewModel();
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__SELECTED_RUTADELCONDUCTOR_VIEW_MODEL:
				if (resolve) return getSelectedRutadelconductorViewModel();
				return basicGetSelectedRutadelconductorViewModel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_THE_BUSQUEDA:
				setOwnedByContenedorRegistroBaseViewModelTheBusqueda((ContenedorRegistroBaseViewModel)newValue);
				return;
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__TXT_NOMBREDELCONDUCTOR_VIEW_MODEL:
				setTxtNombredelconductorViewModel((String)newValue);
				return;
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__TXT_RUTADELCONDUCTOR_VIEW_MODEL:
				setTxtRutadelconductorViewModel((String)newValue);
				return;
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__LISTA_NOMBREDELCONDUCTOR_VIEW_MODEL:
				getListaNombredelconductorViewModel().clear();
				getListaNombredelconductorViewModel().addAll((Collection<? extends NombredelconductorViewModel>)newValue);
				return;
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__NOMBREDELCONDUCTOR_VIEW_MODEL:
				getNombredelconductorViewModel().clear();
				getNombredelconductorViewModel().addAll((Collection<? extends NombredelconductorViewModel>)newValue);
				return;
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__SELECTED_NOMBREDELCONDUCTOR_VIEW_MODEL:
				setSelectedNombredelconductorViewModel((NombredelconductorViewModel)newValue);
				return;
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__LISTA_RUTADELCONDUCTOR_VIEW_MODEL:
				getListaRutadelconductorViewModel().clear();
				getListaRutadelconductorViewModel().addAll((Collection<? extends RutadelconductorViewModel>)newValue);
				return;
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__RUTADELCONDUCTOR_VIEW_MODEL:
				getRutadelconductorViewModel().clear();
				getRutadelconductorViewModel().addAll((Collection<? extends RutadelconductorViewModel>)newValue);
				return;
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__SELECTED_RUTADELCONDUCTOR_VIEW_MODEL:
				setSelectedRutadelconductorViewModel((RutadelconductorViewModel)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_THE_BUSQUEDA:
				setOwnedByContenedorRegistroBaseViewModelTheBusqueda((ContenedorRegistroBaseViewModel)null);
				return;
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__TXT_NOMBREDELCONDUCTOR_VIEW_MODEL:
				setTxtNombredelconductorViewModel(TXT_NOMBREDELCONDUCTOR_VIEW_MODEL_EDEFAULT);
				return;
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__TXT_RUTADELCONDUCTOR_VIEW_MODEL:
				setTxtRutadelconductorViewModel(TXT_RUTADELCONDUCTOR_VIEW_MODEL_EDEFAULT);
				return;
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__LISTA_NOMBREDELCONDUCTOR_VIEW_MODEL:
				getListaNombredelconductorViewModel().clear();
				return;
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__NOMBREDELCONDUCTOR_VIEW_MODEL:
				getNombredelconductorViewModel().clear();
				return;
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__SELECTED_NOMBREDELCONDUCTOR_VIEW_MODEL:
				setSelectedNombredelconductorViewModel((NombredelconductorViewModel)null);
				return;
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__LISTA_RUTADELCONDUCTOR_VIEW_MODEL:
				getListaRutadelconductorViewModel().clear();
				return;
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__RUTADELCONDUCTOR_VIEW_MODEL:
				getRutadelconductorViewModel().clear();
				return;
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__SELECTED_RUTADELCONDUCTOR_VIEW_MODEL:
				setSelectedRutadelconductorViewModel((RutadelconductorViewModel)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_THE_BUSQUEDA:
				return getOwnedByContenedorRegistroBaseViewModelTheBusqueda() != null;
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__TXT_NOMBREDELCONDUCTOR_VIEW_MODEL:
				return TXT_NOMBREDELCONDUCTOR_VIEW_MODEL_EDEFAULT == null ? txtNombredelconductorViewModel != null : !TXT_NOMBREDELCONDUCTOR_VIEW_MODEL_EDEFAULT.equals(txtNombredelconductorViewModel);
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__TXT_RUTADELCONDUCTOR_VIEW_MODEL:
				return TXT_RUTADELCONDUCTOR_VIEW_MODEL_EDEFAULT == null ? txtRutadelconductorViewModel != null : !TXT_RUTADELCONDUCTOR_VIEW_MODEL_EDEFAULT.equals(txtRutadelconductorViewModel);
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__LISTA_NOMBREDELCONDUCTOR_VIEW_MODEL:
				return listaNombredelconductorViewModel != null && !listaNombredelconductorViewModel.isEmpty();
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__NOMBREDELCONDUCTOR_VIEW_MODEL:
				return nombredelconductorViewModel != null && !nombredelconductorViewModel.isEmpty();
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__SELECTED_NOMBREDELCONDUCTOR_VIEW_MODEL:
				return selectedNombredelconductorViewModel != null;
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__LISTA_RUTADELCONDUCTOR_VIEW_MODEL:
				return listaRutadelconductorViewModel != null && !listaRutadelconductorViewModel.isEmpty();
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__RUTADELCONDUCTOR_VIEW_MODEL:
				return rutadelconductorViewModel != null && !rutadelconductorViewModel.isEmpty();
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__SELECTED_RUTADELCONDUCTOR_VIEW_MODEL:
				return selectedRutadelconductorViewModel != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (txtNombredelconductorViewModel: ");
		result.append(txtNombredelconductorViewModel);
		result.append(", txtRutadelconductorViewModel: ");
		result.append(txtRutadelconductorViewModel);
		result.append(')');
		return result.toString();
	}

} //ContenedorBusquedaViewModelImpl
