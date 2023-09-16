/**
 */
package cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl;

import cootracir.ui.UI;
import cootracir.ui.UiPackage;

import cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorBusquedaViewModel;
import cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorInformaciongeneralViewModel;
import cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorRegistroBaseViewModel;
import cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelPackage;
import cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.FiltrarrutasViewModel;
import cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ListapreciosViewModel;
import cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.RegistrosViewModel;

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
 * An implementation of the model object '<em><b>Contenedor Registro Base View Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.ContenedorRegistroBaseViewModelImpl#getOwnedByUI <em>Owned By UI</em>}</li>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.ContenedorRegistroBaseViewModelImpl#getNotificacion <em>Notificacion</em>}</li>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.ContenedorRegistroBaseViewModelImpl#getTxtFiltrarrutasViewModel <em>Txt Filtrarrutas View Model</em>}</li>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.ContenedorRegistroBaseViewModelImpl#getListaFiltrarrutasViewModel <em>Lista Filtrarrutas View Model</em>}</li>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.ContenedorRegistroBaseViewModelImpl#getFiltrarrutasViewModel <em>Filtrarrutas View Model</em>}</li>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.ContenedorRegistroBaseViewModelImpl#getSelectedFiltrarrutasViewModel <em>Selected Filtrarrutas View Model</em>}</li>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.ContenedorRegistroBaseViewModelImpl#getTheInformaciongeneral <em>The Informaciongeneral</em>}</li>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.ContenedorRegistroBaseViewModelImpl#getTheBusqueda <em>The Busqueda</em>}</li>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.ContenedorRegistroBaseViewModelImpl#getListaRegistrosViewModel <em>Lista Registros View Model</em>}</li>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.ContenedorRegistroBaseViewModelImpl#getSelectedRegistrosViewModel <em>Selected Registros View Model</em>}</li>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.ContenedorRegistroBaseViewModelImpl#getRegistrosViewModel <em>Registros View Model</em>}</li>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.ContenedorRegistroBaseViewModelImpl#getListaListapreciosViewModel <em>Lista Listaprecios View Model</em>}</li>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.ContenedorRegistroBaseViewModelImpl#getSelectedListapreciosViewModel <em>Selected Listaprecios View Model</em>}</li>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.ContenedorRegistroBaseViewModelImpl#getListapreciosViewModel <em>Listaprecios View Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContenedorRegistroBaseViewModelImpl extends ViewModelImpl implements ContenedorRegistroBaseViewModel {
	/**
	 * The default value of the '{@link #getNotificacion() <em>Notificacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotificacion()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTIFICACION_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getNotificacion() <em>Notificacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotificacion()
	 * @generated
	 * @ordered
	 */
	protected String notificacion = NOTIFICACION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTxtFiltrarrutasViewModel() <em>Txt Filtrarrutas View Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTxtFiltrarrutasViewModel()
	 * @generated
	 * @ordered
	 */
	protected static final String TXT_FILTRARRUTAS_VIEW_MODEL_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getTxtFiltrarrutasViewModel() <em>Txt Filtrarrutas View Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTxtFiltrarrutasViewModel()
	 * @generated
	 * @ordered
	 */
	protected String txtFiltrarrutasViewModel = TXT_FILTRARRUTAS_VIEW_MODEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getListaFiltrarrutasViewModel() <em>Lista Filtrarrutas View Model</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaFiltrarrutasViewModel()
	 * @generated
	 * @ordered
	 */
	protected EList<FiltrarrutasViewModel> listaFiltrarrutasViewModel;

	/**
	 * The cached value of the '{@link #getFiltrarrutasViewModel() <em>Filtrarrutas View Model</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiltrarrutasViewModel()
	 * @generated
	 * @ordered
	 */
	protected EList<FiltrarrutasViewModel> filtrarrutasViewModel;

	/**
	 * The cached value of the '{@link #getSelectedFiltrarrutasViewModel() <em>Selected Filtrarrutas View Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedFiltrarrutasViewModel()
	 * @generated
	 * @ordered
	 */
	protected FiltrarrutasViewModel selectedFiltrarrutasViewModel;

	/**
	 * The cached value of the '{@link #getTheInformaciongeneral() <em>The Informaciongeneral</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheInformaciongeneral()
	 * @generated
	 * @ordered
	 */
	protected ContenedorInformaciongeneralViewModel theInformaciongeneral;

	/**
	 * The cached value of the '{@link #getTheBusqueda() <em>The Busqueda</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheBusqueda()
	 * @generated
	 * @ordered
	 */
	protected ContenedorBusquedaViewModel theBusqueda;

	/**
	 * The cached value of the '{@link #getListaRegistrosViewModel() <em>Lista Registros View Model</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaRegistrosViewModel()
	 * @generated
	 * @ordered
	 */
	protected EList<RegistrosViewModel> listaRegistrosViewModel;

	/**
	 * The cached value of the '{@link #getSelectedRegistrosViewModel() <em>Selected Registros View Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedRegistrosViewModel()
	 * @generated
	 * @ordered
	 */
	protected RegistrosViewModel selectedRegistrosViewModel;

	/**
	 * The cached value of the '{@link #getRegistrosViewModel() <em>Registros View Model</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistrosViewModel()
	 * @generated
	 * @ordered
	 */
	protected EList<RegistrosViewModel> registrosViewModel;

	/**
	 * The cached value of the '{@link #getListaListapreciosViewModel() <em>Lista Listaprecios View Model</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaListapreciosViewModel()
	 * @generated
	 * @ordered
	 */
	protected EList<ListapreciosViewModel> listaListapreciosViewModel;

	/**
	 * The cached value of the '{@link #getSelectedListapreciosViewModel() <em>Selected Listaprecios View Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedListapreciosViewModel()
	 * @generated
	 * @ordered
	 */
	protected ListapreciosViewModel selectedListapreciosViewModel;

	/**
	 * The cached value of the '{@link #getListapreciosViewModel() <em>Listaprecios View Model</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListapreciosViewModel()
	 * @generated
	 * @ordered
	 */
	protected EList<ListapreciosViewModel> listapreciosViewModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContenedorRegistroBaseViewModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContenedorregistrobaseviewmodelPackage.Literals.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UI getOwnedByUI() {
		if (eContainerFeatureID() != ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__OWNED_BY_UI) return null;
		return (UI)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByUI(UI newOwnedByUI, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnedByUI, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__OWNED_BY_UI, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedByUI(UI newOwnedByUI) {
		if (newOwnedByUI != eInternalContainer() || (eContainerFeatureID() != ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__OWNED_BY_UI && newOwnedByUI != null)) {
			if (EcoreUtil.isAncestor(this, newOwnedByUI))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByUI != null)
				msgs = ((InternalEObject)newOwnedByUI).eInverseAdd(this, UiPackage.UI__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL, UI.class, msgs);
			msgs = basicSetOwnedByUI(newOwnedByUI, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__OWNED_BY_UI, newOwnedByUI, newOwnedByUI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNotificacion() {
		return notificacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotificacion(String newNotificacion) {
		String oldNotificacion = notificacion;
		notificacion = newNotificacion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__NOTIFICACION, oldNotificacion, notificacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTxtFiltrarrutasViewModel() {
		return txtFiltrarrutasViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTxtFiltrarrutasViewModel(String newTxtFiltrarrutasViewModel) {
		String oldTxtFiltrarrutasViewModel = txtFiltrarrutasViewModel;
		txtFiltrarrutasViewModel = newTxtFiltrarrutasViewModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__TXT_FILTRARRUTAS_VIEW_MODEL, oldTxtFiltrarrutasViewModel, txtFiltrarrutasViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FiltrarrutasViewModel> getListaFiltrarrutasViewModel() {
		if (listaFiltrarrutasViewModel == null) {
			listaFiltrarrutasViewModel = new EObjectContainmentWithInverseEList<FiltrarrutasViewModel>(FiltrarrutasViewModel.class, this, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__LISTA_FILTRARRUTAS_VIEW_MODEL, ContenedorregistrobaseviewmodelPackage.FILTRARRUTAS_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL);
		}
		return listaFiltrarrutasViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FiltrarrutasViewModel> getFiltrarrutasViewModel() {
		if (filtrarrutasViewModel == null) {
			filtrarrutasViewModel = new EObjectWithInverseResolvingEList<FiltrarrutasViewModel>(FiltrarrutasViewModel.class, this, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__FILTRARRUTAS_VIEW_MODEL, ContenedorregistrobaseviewmodelPackage.FILTRARRUTAS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_FILTRARRUTAS_VIEW_MODEL_FILTRARRUTAS_VIEW_MODEL);
		}
		return filtrarrutasViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FiltrarrutasViewModel getSelectedFiltrarrutasViewModel() {
		if (selectedFiltrarrutasViewModel != null && selectedFiltrarrutasViewModel.eIsProxy()) {
			InternalEObject oldSelectedFiltrarrutasViewModel = (InternalEObject)selectedFiltrarrutasViewModel;
			selectedFiltrarrutasViewModel = (FiltrarrutasViewModel)eResolveProxy(oldSelectedFiltrarrutasViewModel);
			if (selectedFiltrarrutasViewModel != oldSelectedFiltrarrutasViewModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__SELECTED_FILTRARRUTAS_VIEW_MODEL, oldSelectedFiltrarrutasViewModel, selectedFiltrarrutasViewModel));
			}
		}
		return selectedFiltrarrutasViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FiltrarrutasViewModel basicGetSelectedFiltrarrutasViewModel() {
		return selectedFiltrarrutasViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelectedFiltrarrutasViewModel(FiltrarrutasViewModel newSelectedFiltrarrutasViewModel, NotificationChain msgs) {
		FiltrarrutasViewModel oldSelectedFiltrarrutasViewModel = selectedFiltrarrutasViewModel;
		selectedFiltrarrutasViewModel = newSelectedFiltrarrutasViewModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__SELECTED_FILTRARRUTAS_VIEW_MODEL, oldSelectedFiltrarrutasViewModel, newSelectedFiltrarrutasViewModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectedFiltrarrutasViewModel(FiltrarrutasViewModel newSelectedFiltrarrutasViewModel) {
		if (newSelectedFiltrarrutasViewModel != selectedFiltrarrutasViewModel) {
			NotificationChain msgs = null;
			if (selectedFiltrarrutasViewModel != null)
				msgs = ((InternalEObject)selectedFiltrarrutasViewModel).eInverseRemove(this, ContenedorregistrobaseviewmodelPackage.FILTRARRUTAS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODELSELECTED_FILTRARRUTAS_VIEW_MODEL, FiltrarrutasViewModel.class, msgs);
			if (newSelectedFiltrarrutasViewModel != null)
				msgs = ((InternalEObject)newSelectedFiltrarrutasViewModel).eInverseAdd(this, ContenedorregistrobaseviewmodelPackage.FILTRARRUTAS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODELSELECTED_FILTRARRUTAS_VIEW_MODEL, FiltrarrutasViewModel.class, msgs);
			msgs = basicSetSelectedFiltrarrutasViewModel(newSelectedFiltrarrutasViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__SELECTED_FILTRARRUTAS_VIEW_MODEL, newSelectedFiltrarrutasViewModel, newSelectedFiltrarrutasViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorInformaciongeneralViewModel getTheInformaciongeneral() {
		return theInformaciongeneral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheInformaciongeneral(ContenedorInformaciongeneralViewModel newTheInformaciongeneral, NotificationChain msgs) {
		ContenedorInformaciongeneralViewModel oldTheInformaciongeneral = theInformaciongeneral;
		theInformaciongeneral = newTheInformaciongeneral;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__THE_INFORMACIONGENERAL, oldTheInformaciongeneral, newTheInformaciongeneral);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheInformaciongeneral(ContenedorInformaciongeneralViewModel newTheInformaciongeneral) {
		if (newTheInformaciongeneral != theInformaciongeneral) {
			NotificationChain msgs = null;
			if (theInformaciongeneral != null)
				msgs = ((InternalEObject)theInformaciongeneral).eInverseRemove(this, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_INFORMACIONGENERAL_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_THE_INFORMACIONGENERAL, ContenedorInformaciongeneralViewModel.class, msgs);
			if (newTheInformaciongeneral != null)
				msgs = ((InternalEObject)newTheInformaciongeneral).eInverseAdd(this, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_INFORMACIONGENERAL_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_THE_INFORMACIONGENERAL, ContenedorInformaciongeneralViewModel.class, msgs);
			msgs = basicSetTheInformaciongeneral(newTheInformaciongeneral, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__THE_INFORMACIONGENERAL, newTheInformaciongeneral, newTheInformaciongeneral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorBusquedaViewModel getTheBusqueda() {
		return theBusqueda;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheBusqueda(ContenedorBusquedaViewModel newTheBusqueda, NotificationChain msgs) {
		ContenedorBusquedaViewModel oldTheBusqueda = theBusqueda;
		theBusqueda = newTheBusqueda;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__THE_BUSQUEDA, oldTheBusqueda, newTheBusqueda);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheBusqueda(ContenedorBusquedaViewModel newTheBusqueda) {
		if (newTheBusqueda != theBusqueda) {
			NotificationChain msgs = null;
			if (theBusqueda != null)
				msgs = ((InternalEObject)theBusqueda).eInverseRemove(this, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_THE_BUSQUEDA, ContenedorBusquedaViewModel.class, msgs);
			if (newTheBusqueda != null)
				msgs = ((InternalEObject)newTheBusqueda).eInverseAdd(this, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_THE_BUSQUEDA, ContenedorBusquedaViewModel.class, msgs);
			msgs = basicSetTheBusqueda(newTheBusqueda, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__THE_BUSQUEDA, newTheBusqueda, newTheBusqueda));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RegistrosViewModel> getListaRegistrosViewModel() {
		if (listaRegistrosViewModel == null) {
			listaRegistrosViewModel = new EObjectContainmentWithInverseEList<RegistrosViewModel>(RegistrosViewModel.class, this, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__LISTA_REGISTROS_VIEW_MODEL, ContenedorregistrobaseviewmodelPackage.REGISTROS_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL);
		}
		return listaRegistrosViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistrosViewModel getSelectedRegistrosViewModel() {
		if (selectedRegistrosViewModel != null && selectedRegistrosViewModel.eIsProxy()) {
			InternalEObject oldSelectedRegistrosViewModel = (InternalEObject)selectedRegistrosViewModel;
			selectedRegistrosViewModel = (RegistrosViewModel)eResolveProxy(oldSelectedRegistrosViewModel);
			if (selectedRegistrosViewModel != oldSelectedRegistrosViewModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__SELECTED_REGISTROS_VIEW_MODEL, oldSelectedRegistrosViewModel, selectedRegistrosViewModel));
			}
		}
		return selectedRegistrosViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistrosViewModel basicGetSelectedRegistrosViewModel() {
		return selectedRegistrosViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelectedRegistrosViewModel(RegistrosViewModel newSelectedRegistrosViewModel, NotificationChain msgs) {
		RegistrosViewModel oldSelectedRegistrosViewModel = selectedRegistrosViewModel;
		selectedRegistrosViewModel = newSelectedRegistrosViewModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__SELECTED_REGISTROS_VIEW_MODEL, oldSelectedRegistrosViewModel, newSelectedRegistrosViewModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectedRegistrosViewModel(RegistrosViewModel newSelectedRegistrosViewModel) {
		if (newSelectedRegistrosViewModel != selectedRegistrosViewModel) {
			NotificationChain msgs = null;
			if (selectedRegistrosViewModel != null)
				msgs = ((InternalEObject)selectedRegistrosViewModel).eInverseRemove(this, ContenedorregistrobaseviewmodelPackage.REGISTROS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODELSELECTED_REGISTROS_VIEW_MODEL, RegistrosViewModel.class, msgs);
			if (newSelectedRegistrosViewModel != null)
				msgs = ((InternalEObject)newSelectedRegistrosViewModel).eInverseAdd(this, ContenedorregistrobaseviewmodelPackage.REGISTROS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODELSELECTED_REGISTROS_VIEW_MODEL, RegistrosViewModel.class, msgs);
			msgs = basicSetSelectedRegistrosViewModel(newSelectedRegistrosViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__SELECTED_REGISTROS_VIEW_MODEL, newSelectedRegistrosViewModel, newSelectedRegistrosViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RegistrosViewModel> getRegistrosViewModel() {
		if (registrosViewModel == null) {
			registrosViewModel = new EObjectWithInverseResolvingEList<RegistrosViewModel>(RegistrosViewModel.class, this, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__REGISTROS_VIEW_MODEL, ContenedorregistrobaseviewmodelPackage.REGISTROS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_REGISTROS_VIEW_MODEL_REGISTROS_VIEW_MODEL);
		}
		return registrosViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ListapreciosViewModel> getListaListapreciosViewModel() {
		if (listaListapreciosViewModel == null) {
			listaListapreciosViewModel = new EObjectContainmentWithInverseEList<ListapreciosViewModel>(ListapreciosViewModel.class, this, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__LISTA_LISTAPRECIOS_VIEW_MODEL, ContenedorregistrobaseviewmodelPackage.LISTAPRECIOS_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL);
		}
		return listaListapreciosViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListapreciosViewModel getSelectedListapreciosViewModel() {
		if (selectedListapreciosViewModel != null && selectedListapreciosViewModel.eIsProxy()) {
			InternalEObject oldSelectedListapreciosViewModel = (InternalEObject)selectedListapreciosViewModel;
			selectedListapreciosViewModel = (ListapreciosViewModel)eResolveProxy(oldSelectedListapreciosViewModel);
			if (selectedListapreciosViewModel != oldSelectedListapreciosViewModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__SELECTED_LISTAPRECIOS_VIEW_MODEL, oldSelectedListapreciosViewModel, selectedListapreciosViewModel));
			}
		}
		return selectedListapreciosViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListapreciosViewModel basicGetSelectedListapreciosViewModel() {
		return selectedListapreciosViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelectedListapreciosViewModel(ListapreciosViewModel newSelectedListapreciosViewModel, NotificationChain msgs) {
		ListapreciosViewModel oldSelectedListapreciosViewModel = selectedListapreciosViewModel;
		selectedListapreciosViewModel = newSelectedListapreciosViewModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__SELECTED_LISTAPRECIOS_VIEW_MODEL, oldSelectedListapreciosViewModel, newSelectedListapreciosViewModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectedListapreciosViewModel(ListapreciosViewModel newSelectedListapreciosViewModel) {
		if (newSelectedListapreciosViewModel != selectedListapreciosViewModel) {
			NotificationChain msgs = null;
			if (selectedListapreciosViewModel != null)
				msgs = ((InternalEObject)selectedListapreciosViewModel).eInverseRemove(this, ContenedorregistrobaseviewmodelPackage.LISTAPRECIOS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODELSELECTED_LISTAPRECIOS_VIEW_MODEL, ListapreciosViewModel.class, msgs);
			if (newSelectedListapreciosViewModel != null)
				msgs = ((InternalEObject)newSelectedListapreciosViewModel).eInverseAdd(this, ContenedorregistrobaseviewmodelPackage.LISTAPRECIOS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODELSELECTED_LISTAPRECIOS_VIEW_MODEL, ListapreciosViewModel.class, msgs);
			msgs = basicSetSelectedListapreciosViewModel(newSelectedListapreciosViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__SELECTED_LISTAPRECIOS_VIEW_MODEL, newSelectedListapreciosViewModel, newSelectedListapreciosViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ListapreciosViewModel> getListapreciosViewModel() {
		if (listapreciosViewModel == null) {
			listapreciosViewModel = new EObjectWithInverseResolvingEList<ListapreciosViewModel>(ListapreciosViewModel.class, this, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__LISTAPRECIOS_VIEW_MODEL, ContenedorregistrobaseviewmodelPackage.LISTAPRECIOS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_LISTAPRECIOS_VIEW_MODEL_LISTAPRECIOS_VIEW_MODEL);
		}
		return listapreciosViewModel;
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
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__OWNED_BY_UI:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByUI((UI)otherEnd, msgs);
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__LISTA_FILTRARRUTAS_VIEW_MODEL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getListaFiltrarrutasViewModel()).basicAdd(otherEnd, msgs);
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__FILTRARRUTAS_VIEW_MODEL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFiltrarrutasViewModel()).basicAdd(otherEnd, msgs);
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__SELECTED_FILTRARRUTAS_VIEW_MODEL:
				if (selectedFiltrarrutasViewModel != null)
					msgs = ((InternalEObject)selectedFiltrarrutasViewModel).eInverseRemove(this, ContenedorregistrobaseviewmodelPackage.FILTRARRUTAS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODELSELECTED_FILTRARRUTAS_VIEW_MODEL, FiltrarrutasViewModel.class, msgs);
				return basicSetSelectedFiltrarrutasViewModel((FiltrarrutasViewModel)otherEnd, msgs);
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__THE_INFORMACIONGENERAL:
				if (theInformaciongeneral != null)
					msgs = ((InternalEObject)theInformaciongeneral).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__THE_INFORMACIONGENERAL, null, msgs);
				return basicSetTheInformaciongeneral((ContenedorInformaciongeneralViewModel)otherEnd, msgs);
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__THE_BUSQUEDA:
				if (theBusqueda != null)
					msgs = ((InternalEObject)theBusqueda).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__THE_BUSQUEDA, null, msgs);
				return basicSetTheBusqueda((ContenedorBusquedaViewModel)otherEnd, msgs);
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__LISTA_REGISTROS_VIEW_MODEL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getListaRegistrosViewModel()).basicAdd(otherEnd, msgs);
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__SELECTED_REGISTROS_VIEW_MODEL:
				if (selectedRegistrosViewModel != null)
					msgs = ((InternalEObject)selectedRegistrosViewModel).eInverseRemove(this, ContenedorregistrobaseviewmodelPackage.REGISTROS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODELSELECTED_REGISTROS_VIEW_MODEL, RegistrosViewModel.class, msgs);
				return basicSetSelectedRegistrosViewModel((RegistrosViewModel)otherEnd, msgs);
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__REGISTROS_VIEW_MODEL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRegistrosViewModel()).basicAdd(otherEnd, msgs);
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__LISTA_LISTAPRECIOS_VIEW_MODEL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getListaListapreciosViewModel()).basicAdd(otherEnd, msgs);
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__SELECTED_LISTAPRECIOS_VIEW_MODEL:
				if (selectedListapreciosViewModel != null)
					msgs = ((InternalEObject)selectedListapreciosViewModel).eInverseRemove(this, ContenedorregistrobaseviewmodelPackage.LISTAPRECIOS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODELSELECTED_LISTAPRECIOS_VIEW_MODEL, ListapreciosViewModel.class, msgs);
				return basicSetSelectedListapreciosViewModel((ListapreciosViewModel)otherEnd, msgs);
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__LISTAPRECIOS_VIEW_MODEL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getListapreciosViewModel()).basicAdd(otherEnd, msgs);
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
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__OWNED_BY_UI:
				return basicSetOwnedByUI(null, msgs);
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__LISTA_FILTRARRUTAS_VIEW_MODEL:
				return ((InternalEList<?>)getListaFiltrarrutasViewModel()).basicRemove(otherEnd, msgs);
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__FILTRARRUTAS_VIEW_MODEL:
				return ((InternalEList<?>)getFiltrarrutasViewModel()).basicRemove(otherEnd, msgs);
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__SELECTED_FILTRARRUTAS_VIEW_MODEL:
				return basicSetSelectedFiltrarrutasViewModel(null, msgs);
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__THE_INFORMACIONGENERAL:
				return basicSetTheInformaciongeneral(null, msgs);
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__THE_BUSQUEDA:
				return basicSetTheBusqueda(null, msgs);
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__LISTA_REGISTROS_VIEW_MODEL:
				return ((InternalEList<?>)getListaRegistrosViewModel()).basicRemove(otherEnd, msgs);
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__SELECTED_REGISTROS_VIEW_MODEL:
				return basicSetSelectedRegistrosViewModel(null, msgs);
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__REGISTROS_VIEW_MODEL:
				return ((InternalEList<?>)getRegistrosViewModel()).basicRemove(otherEnd, msgs);
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__LISTA_LISTAPRECIOS_VIEW_MODEL:
				return ((InternalEList<?>)getListaListapreciosViewModel()).basicRemove(otherEnd, msgs);
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__SELECTED_LISTAPRECIOS_VIEW_MODEL:
				return basicSetSelectedListapreciosViewModel(null, msgs);
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__LISTAPRECIOS_VIEW_MODEL:
				return ((InternalEList<?>)getListapreciosViewModel()).basicRemove(otherEnd, msgs);
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
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__OWNED_BY_UI:
				return eInternalContainer().eInverseRemove(this, UiPackage.UI__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL, UI.class, msgs);
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
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__OWNED_BY_UI:
				return getOwnedByUI();
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__NOTIFICACION:
				return getNotificacion();
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__TXT_FILTRARRUTAS_VIEW_MODEL:
				return getTxtFiltrarrutasViewModel();
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__LISTA_FILTRARRUTAS_VIEW_MODEL:
				return getListaFiltrarrutasViewModel();
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__FILTRARRUTAS_VIEW_MODEL:
				return getFiltrarrutasViewModel();
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__SELECTED_FILTRARRUTAS_VIEW_MODEL:
				if (resolve) return getSelectedFiltrarrutasViewModel();
				return basicGetSelectedFiltrarrutasViewModel();
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__THE_INFORMACIONGENERAL:
				return getTheInformaciongeneral();
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__THE_BUSQUEDA:
				return getTheBusqueda();
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__LISTA_REGISTROS_VIEW_MODEL:
				return getListaRegistrosViewModel();
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__SELECTED_REGISTROS_VIEW_MODEL:
				if (resolve) return getSelectedRegistrosViewModel();
				return basicGetSelectedRegistrosViewModel();
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__REGISTROS_VIEW_MODEL:
				return getRegistrosViewModel();
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__LISTA_LISTAPRECIOS_VIEW_MODEL:
				return getListaListapreciosViewModel();
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__SELECTED_LISTAPRECIOS_VIEW_MODEL:
				if (resolve) return getSelectedListapreciosViewModel();
				return basicGetSelectedListapreciosViewModel();
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__LISTAPRECIOS_VIEW_MODEL:
				return getListapreciosViewModel();
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
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__OWNED_BY_UI:
				setOwnedByUI((UI)newValue);
				return;
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__NOTIFICACION:
				setNotificacion((String)newValue);
				return;
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__TXT_FILTRARRUTAS_VIEW_MODEL:
				setTxtFiltrarrutasViewModel((String)newValue);
				return;
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__LISTA_FILTRARRUTAS_VIEW_MODEL:
				getListaFiltrarrutasViewModel().clear();
				getListaFiltrarrutasViewModel().addAll((Collection<? extends FiltrarrutasViewModel>)newValue);
				return;
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__FILTRARRUTAS_VIEW_MODEL:
				getFiltrarrutasViewModel().clear();
				getFiltrarrutasViewModel().addAll((Collection<? extends FiltrarrutasViewModel>)newValue);
				return;
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__SELECTED_FILTRARRUTAS_VIEW_MODEL:
				setSelectedFiltrarrutasViewModel((FiltrarrutasViewModel)newValue);
				return;
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__THE_INFORMACIONGENERAL:
				setTheInformaciongeneral((ContenedorInformaciongeneralViewModel)newValue);
				return;
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__THE_BUSQUEDA:
				setTheBusqueda((ContenedorBusquedaViewModel)newValue);
				return;
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__LISTA_REGISTROS_VIEW_MODEL:
				getListaRegistrosViewModel().clear();
				getListaRegistrosViewModel().addAll((Collection<? extends RegistrosViewModel>)newValue);
				return;
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__SELECTED_REGISTROS_VIEW_MODEL:
				setSelectedRegistrosViewModel((RegistrosViewModel)newValue);
				return;
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__REGISTROS_VIEW_MODEL:
				getRegistrosViewModel().clear();
				getRegistrosViewModel().addAll((Collection<? extends RegistrosViewModel>)newValue);
				return;
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__LISTA_LISTAPRECIOS_VIEW_MODEL:
				getListaListapreciosViewModel().clear();
				getListaListapreciosViewModel().addAll((Collection<? extends ListapreciosViewModel>)newValue);
				return;
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__SELECTED_LISTAPRECIOS_VIEW_MODEL:
				setSelectedListapreciosViewModel((ListapreciosViewModel)newValue);
				return;
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__LISTAPRECIOS_VIEW_MODEL:
				getListapreciosViewModel().clear();
				getListapreciosViewModel().addAll((Collection<? extends ListapreciosViewModel>)newValue);
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
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__OWNED_BY_UI:
				setOwnedByUI((UI)null);
				return;
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__NOTIFICACION:
				setNotificacion(NOTIFICACION_EDEFAULT);
				return;
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__TXT_FILTRARRUTAS_VIEW_MODEL:
				setTxtFiltrarrutasViewModel(TXT_FILTRARRUTAS_VIEW_MODEL_EDEFAULT);
				return;
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__LISTA_FILTRARRUTAS_VIEW_MODEL:
				getListaFiltrarrutasViewModel().clear();
				return;
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__FILTRARRUTAS_VIEW_MODEL:
				getFiltrarrutasViewModel().clear();
				return;
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__SELECTED_FILTRARRUTAS_VIEW_MODEL:
				setSelectedFiltrarrutasViewModel((FiltrarrutasViewModel)null);
				return;
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__THE_INFORMACIONGENERAL:
				setTheInformaciongeneral((ContenedorInformaciongeneralViewModel)null);
				return;
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__THE_BUSQUEDA:
				setTheBusqueda((ContenedorBusquedaViewModel)null);
				return;
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__LISTA_REGISTROS_VIEW_MODEL:
				getListaRegistrosViewModel().clear();
				return;
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__SELECTED_REGISTROS_VIEW_MODEL:
				setSelectedRegistrosViewModel((RegistrosViewModel)null);
				return;
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__REGISTROS_VIEW_MODEL:
				getRegistrosViewModel().clear();
				return;
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__LISTA_LISTAPRECIOS_VIEW_MODEL:
				getListaListapreciosViewModel().clear();
				return;
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__SELECTED_LISTAPRECIOS_VIEW_MODEL:
				setSelectedListapreciosViewModel((ListapreciosViewModel)null);
				return;
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__LISTAPRECIOS_VIEW_MODEL:
				getListapreciosViewModel().clear();
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
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__OWNED_BY_UI:
				return getOwnedByUI() != null;
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__NOTIFICACION:
				return NOTIFICACION_EDEFAULT == null ? notificacion != null : !NOTIFICACION_EDEFAULT.equals(notificacion);
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__TXT_FILTRARRUTAS_VIEW_MODEL:
				return TXT_FILTRARRUTAS_VIEW_MODEL_EDEFAULT == null ? txtFiltrarrutasViewModel != null : !TXT_FILTRARRUTAS_VIEW_MODEL_EDEFAULT.equals(txtFiltrarrutasViewModel);
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__LISTA_FILTRARRUTAS_VIEW_MODEL:
				return listaFiltrarrutasViewModel != null && !listaFiltrarrutasViewModel.isEmpty();
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__FILTRARRUTAS_VIEW_MODEL:
				return filtrarrutasViewModel != null && !filtrarrutasViewModel.isEmpty();
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__SELECTED_FILTRARRUTAS_VIEW_MODEL:
				return selectedFiltrarrutasViewModel != null;
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__THE_INFORMACIONGENERAL:
				return theInformaciongeneral != null;
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__THE_BUSQUEDA:
				return theBusqueda != null;
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__LISTA_REGISTROS_VIEW_MODEL:
				return listaRegistrosViewModel != null && !listaRegistrosViewModel.isEmpty();
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__SELECTED_REGISTROS_VIEW_MODEL:
				return selectedRegistrosViewModel != null;
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__REGISTROS_VIEW_MODEL:
				return registrosViewModel != null && !registrosViewModel.isEmpty();
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__LISTA_LISTAPRECIOS_VIEW_MODEL:
				return listaListapreciosViewModel != null && !listaListapreciosViewModel.isEmpty();
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__SELECTED_LISTAPRECIOS_VIEW_MODEL:
				return selectedListapreciosViewModel != null;
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__LISTAPRECIOS_VIEW_MODEL:
				return listapreciosViewModel != null && !listapreciosViewModel.isEmpty();
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
		result.append(" (notificacion: ");
		result.append(notificacion);
		result.append(", txtFiltrarrutasViewModel: ");
		result.append(txtFiltrarrutasViewModel);
		result.append(')');
		return result.toString();
	}

	@Override
	public void limpiarCampos(ContenedorBusquedaViewModel contenedorbusquedaViewModel,
			ContenedorInformaciongeneralViewModel contenedorinformaciongeneralViewModel,
			ContenedorRegistroBaseViewModel contenedorregistroBaseViewModel) {
		contenedorinformaciongeneralViewModel.setNombre("");
		contenedorinformaciongeneralViewModel.setFecha("");
		contenedorinformaciongeneralViewModel.setRuta("");
		contenedorinformaciongeneralViewModel.setHora("");
		
	}

} //ContenedorRegistroBaseViewModelImpl
