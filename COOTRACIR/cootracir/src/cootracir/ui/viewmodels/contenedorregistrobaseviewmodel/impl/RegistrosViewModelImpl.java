/**
 */
package cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl;

import cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorRegistroBaseViewModel;
import cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelPackage;
import cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.RegistrosViewModel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Registros View Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.RegistrosViewModelImpl#getOwnedByContenedorRegistroBaseViewModel <em>Owned By Contenedor Registro Base View Model</em>}</li>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.RegistrosViewModelImpl#getTheContenedorRegistroBaseViewModelselectedRegistrosViewModel <em>The Contenedor Registro Base View Modelselected Registros View Model</em>}</li>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.RegistrosViewModelImpl#getTheContenedorRegistroBaseViewModelRegistrosViewModelRegistrosViewModel <em>The Contenedor Registro Base View Model Registros View Model Registros View Model</em>}</li>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.RegistrosViewModelImpl#getId <em>Id</em>}</li>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.RegistrosViewModelImpl#getHora <em>Hora</em>}</li>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.RegistrosViewModelImpl#getEstado <em>Estado</em>}</li>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.RegistrosViewModelImpl#getIncidencia <em>Incidencia</em>}</li>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.RegistrosViewModelImpl#getLugar <em>Lugar</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegistrosViewModelImpl extends EObjectImpl implements RegistrosViewModel {
	/**
	 * The cached value of the '{@link #getTheContenedorRegistroBaseViewModelselectedRegistrosViewModel() <em>The Contenedor Registro Base View Modelselected Registros View Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheContenedorRegistroBaseViewModelselectedRegistrosViewModel()
	 * @generated
	 * @ordered
	 */
	protected ContenedorRegistroBaseViewModel theContenedorRegistroBaseViewModelselectedRegistrosViewModel;

	/**
	 * The cached value of the '{@link #getTheContenedorRegistroBaseViewModelRegistrosViewModelRegistrosViewModel() <em>The Contenedor Registro Base View Model Registros View Model Registros View Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheContenedorRegistroBaseViewModelRegistrosViewModelRegistrosViewModel()
	 * @generated
	 * @ordered
	 */
	protected ContenedorRegistroBaseViewModel theContenedorRegistroBaseViewModelRegistrosViewModelRegistrosViewModel;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getHora() <em>Hora</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHora()
	 * @generated
	 * @ordered
	 */
	protected static final String HORA_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getHora() <em>Hora</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHora()
	 * @generated
	 * @ordered
	 */
	protected String hora = HORA_EDEFAULT;

	/**
	 * The default value of the '{@link #getEstado() <em>Estado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstado()
	 * @generated
	 * @ordered
	 */
	protected static final String ESTADO_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getEstado() <em>Estado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstado()
	 * @generated
	 * @ordered
	 */
	protected String estado = ESTADO_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncidencia() <em>Incidencia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncidencia()
	 * @generated
	 * @ordered
	 */
	protected static final String INCIDENCIA_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getIncidencia() <em>Incidencia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncidencia()
	 * @generated
	 * @ordered
	 */
	protected String incidencia = INCIDENCIA_EDEFAULT;

	/**
	 * The default value of the '{@link #getLugar() <em>Lugar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLugar()
	 * @generated
	 * @ordered
	 */
	protected static final String LUGAR_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getLugar() <em>Lugar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLugar()
	 * @generated
	 * @ordered
	 */
	protected String lugar = LUGAR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistrosViewModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContenedorregistrobaseviewmodelPackage.Literals.REGISTROS_VIEW_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorRegistroBaseViewModel getOwnedByContenedorRegistroBaseViewModel() {
		if (eContainerFeatureID() != ContenedorregistrobaseviewmodelPackage.REGISTROS_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL) return null;
		return (ContenedorRegistroBaseViewModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByContenedorRegistroBaseViewModel(ContenedorRegistroBaseViewModel newOwnedByContenedorRegistroBaseViewModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnedByContenedorRegistroBaseViewModel, ContenedorregistrobaseviewmodelPackage.REGISTROS_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedByContenedorRegistroBaseViewModel(ContenedorRegistroBaseViewModel newOwnedByContenedorRegistroBaseViewModel) {
		if (newOwnedByContenedorRegistroBaseViewModel != eInternalContainer() || (eContainerFeatureID() != ContenedorregistrobaseviewmodelPackage.REGISTROS_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL && newOwnedByContenedorRegistroBaseViewModel != null)) {
			if (EcoreUtil.isAncestor(this, newOwnedByContenedorRegistroBaseViewModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByContenedorRegistroBaseViewModel != null)
				msgs = ((InternalEObject)newOwnedByContenedorRegistroBaseViewModel).eInverseAdd(this, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__LISTA_REGISTROS_VIEW_MODEL, ContenedorRegistroBaseViewModel.class, msgs);
			msgs = basicSetOwnedByContenedorRegistroBaseViewModel(newOwnedByContenedorRegistroBaseViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorregistrobaseviewmodelPackage.REGISTROS_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL, newOwnedByContenedorRegistroBaseViewModel, newOwnedByContenedorRegistroBaseViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorRegistroBaseViewModel getTheContenedorRegistroBaseViewModelselectedRegistrosViewModel() {
		if (theContenedorRegistroBaseViewModelselectedRegistrosViewModel != null && theContenedorRegistroBaseViewModelselectedRegistrosViewModel.eIsProxy()) {
			InternalEObject oldTheContenedorRegistroBaseViewModelselectedRegistrosViewModel = (InternalEObject)theContenedorRegistroBaseViewModelselectedRegistrosViewModel;
			theContenedorRegistroBaseViewModelselectedRegistrosViewModel = (ContenedorRegistroBaseViewModel)eResolveProxy(oldTheContenedorRegistroBaseViewModelselectedRegistrosViewModel);
			if (theContenedorRegistroBaseViewModelselectedRegistrosViewModel != oldTheContenedorRegistroBaseViewModelselectedRegistrosViewModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContenedorregistrobaseviewmodelPackage.REGISTROS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODELSELECTED_REGISTROS_VIEW_MODEL, oldTheContenedorRegistroBaseViewModelselectedRegistrosViewModel, theContenedorRegistroBaseViewModelselectedRegistrosViewModel));
			}
		}
		return theContenedorRegistroBaseViewModelselectedRegistrosViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorRegistroBaseViewModel basicGetTheContenedorRegistroBaseViewModelselectedRegistrosViewModel() {
		return theContenedorRegistroBaseViewModelselectedRegistrosViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheContenedorRegistroBaseViewModelselectedRegistrosViewModel(ContenedorRegistroBaseViewModel newTheContenedorRegistroBaseViewModelselectedRegistrosViewModel, NotificationChain msgs) {
		ContenedorRegistroBaseViewModel oldTheContenedorRegistroBaseViewModelselectedRegistrosViewModel = theContenedorRegistroBaseViewModelselectedRegistrosViewModel;
		theContenedorRegistroBaseViewModelselectedRegistrosViewModel = newTheContenedorRegistroBaseViewModelselectedRegistrosViewModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContenedorregistrobaseviewmodelPackage.REGISTROS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODELSELECTED_REGISTROS_VIEW_MODEL, oldTheContenedorRegistroBaseViewModelselectedRegistrosViewModel, newTheContenedorRegistroBaseViewModelselectedRegistrosViewModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheContenedorRegistroBaseViewModelselectedRegistrosViewModel(ContenedorRegistroBaseViewModel newTheContenedorRegistroBaseViewModelselectedRegistrosViewModel) {
		if (newTheContenedorRegistroBaseViewModelselectedRegistrosViewModel != theContenedorRegistroBaseViewModelselectedRegistrosViewModel) {
			NotificationChain msgs = null;
			if (theContenedorRegistroBaseViewModelselectedRegistrosViewModel != null)
				msgs = ((InternalEObject)theContenedorRegistroBaseViewModelselectedRegistrosViewModel).eInverseRemove(this, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__SELECTED_REGISTROS_VIEW_MODEL, ContenedorRegistroBaseViewModel.class, msgs);
			if (newTheContenedorRegistroBaseViewModelselectedRegistrosViewModel != null)
				msgs = ((InternalEObject)newTheContenedorRegistroBaseViewModelselectedRegistrosViewModel).eInverseAdd(this, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__SELECTED_REGISTROS_VIEW_MODEL, ContenedorRegistroBaseViewModel.class, msgs);
			msgs = basicSetTheContenedorRegistroBaseViewModelselectedRegistrosViewModel(newTheContenedorRegistroBaseViewModelselectedRegistrosViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorregistrobaseviewmodelPackage.REGISTROS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODELSELECTED_REGISTROS_VIEW_MODEL, newTheContenedorRegistroBaseViewModelselectedRegistrosViewModel, newTheContenedorRegistroBaseViewModelselectedRegistrosViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorRegistroBaseViewModel getTheContenedorRegistroBaseViewModelRegistrosViewModelRegistrosViewModel() {
		if (theContenedorRegistroBaseViewModelRegistrosViewModelRegistrosViewModel != null && theContenedorRegistroBaseViewModelRegistrosViewModelRegistrosViewModel.eIsProxy()) {
			InternalEObject oldTheContenedorRegistroBaseViewModelRegistrosViewModelRegistrosViewModel = (InternalEObject)theContenedorRegistroBaseViewModelRegistrosViewModelRegistrosViewModel;
			theContenedorRegistroBaseViewModelRegistrosViewModelRegistrosViewModel = (ContenedorRegistroBaseViewModel)eResolveProxy(oldTheContenedorRegistroBaseViewModelRegistrosViewModelRegistrosViewModel);
			if (theContenedorRegistroBaseViewModelRegistrosViewModelRegistrosViewModel != oldTheContenedorRegistroBaseViewModelRegistrosViewModelRegistrosViewModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContenedorregistrobaseviewmodelPackage.REGISTROS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_REGISTROS_VIEW_MODEL_REGISTROS_VIEW_MODEL, oldTheContenedorRegistroBaseViewModelRegistrosViewModelRegistrosViewModel, theContenedorRegistroBaseViewModelRegistrosViewModelRegistrosViewModel));
			}
		}
		return theContenedorRegistroBaseViewModelRegistrosViewModelRegistrosViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorRegistroBaseViewModel basicGetTheContenedorRegistroBaseViewModelRegistrosViewModelRegistrosViewModel() {
		return theContenedorRegistroBaseViewModelRegistrosViewModelRegistrosViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheContenedorRegistroBaseViewModelRegistrosViewModelRegistrosViewModel(ContenedorRegistroBaseViewModel newTheContenedorRegistroBaseViewModelRegistrosViewModelRegistrosViewModel, NotificationChain msgs) {
		ContenedorRegistroBaseViewModel oldTheContenedorRegistroBaseViewModelRegistrosViewModelRegistrosViewModel = theContenedorRegistroBaseViewModelRegistrosViewModelRegistrosViewModel;
		theContenedorRegistroBaseViewModelRegistrosViewModelRegistrosViewModel = newTheContenedorRegistroBaseViewModelRegistrosViewModelRegistrosViewModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContenedorregistrobaseviewmodelPackage.REGISTROS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_REGISTROS_VIEW_MODEL_REGISTROS_VIEW_MODEL, oldTheContenedorRegistroBaseViewModelRegistrosViewModelRegistrosViewModel, newTheContenedorRegistroBaseViewModelRegistrosViewModelRegistrosViewModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheContenedorRegistroBaseViewModelRegistrosViewModelRegistrosViewModel(ContenedorRegistroBaseViewModel newTheContenedorRegistroBaseViewModelRegistrosViewModelRegistrosViewModel) {
		if (newTheContenedorRegistroBaseViewModelRegistrosViewModelRegistrosViewModel != theContenedorRegistroBaseViewModelRegistrosViewModelRegistrosViewModel) {
			NotificationChain msgs = null;
			if (theContenedorRegistroBaseViewModelRegistrosViewModelRegistrosViewModel != null)
				msgs = ((InternalEObject)theContenedorRegistroBaseViewModelRegistrosViewModelRegistrosViewModel).eInverseRemove(this, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__REGISTROS_VIEW_MODEL, ContenedorRegistroBaseViewModel.class, msgs);
			if (newTheContenedorRegistroBaseViewModelRegistrosViewModelRegistrosViewModel != null)
				msgs = ((InternalEObject)newTheContenedorRegistroBaseViewModelRegistrosViewModelRegistrosViewModel).eInverseAdd(this, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__REGISTROS_VIEW_MODEL, ContenedorRegistroBaseViewModel.class, msgs);
			msgs = basicSetTheContenedorRegistroBaseViewModelRegistrosViewModelRegistrosViewModel(newTheContenedorRegistroBaseViewModelRegistrosViewModelRegistrosViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorregistrobaseviewmodelPackage.REGISTROS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_REGISTROS_VIEW_MODEL_REGISTROS_VIEW_MODEL, newTheContenedorRegistroBaseViewModelRegistrosViewModelRegistrosViewModel, newTheContenedorRegistroBaseViewModelRegistrosViewModelRegistrosViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorregistrobaseviewmodelPackage.REGISTROS_VIEW_MODEL__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHora() {
		return hora;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHora(String newHora) {
		String oldHora = hora;
		hora = newHora;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorregistrobaseviewmodelPackage.REGISTROS_VIEW_MODEL__HORA, oldHora, hora));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstado(String newEstado) {
		String oldEstado = estado;
		estado = newEstado;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorregistrobaseviewmodelPackage.REGISTROS_VIEW_MODEL__ESTADO, oldEstado, estado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIncidencia() {
		return incidencia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncidencia(String newIncidencia) {
		String oldIncidencia = incidencia;
		incidencia = newIncidencia;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorregistrobaseviewmodelPackage.REGISTROS_VIEW_MODEL__INCIDENCIA, oldIncidencia, incidencia));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLugar() {
		return lugar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLugar(String newLugar) {
		String oldLugar = lugar;
		lugar = newLugar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorregistrobaseviewmodelPackage.REGISTROS_VIEW_MODEL__LUGAR, oldLugar, lugar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContenedorregistrobaseviewmodelPackage.REGISTROS_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByContenedorRegistroBaseViewModel((ContenedorRegistroBaseViewModel)otherEnd, msgs);
			case ContenedorregistrobaseviewmodelPackage.REGISTROS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODELSELECTED_REGISTROS_VIEW_MODEL:
				if (theContenedorRegistroBaseViewModelselectedRegistrosViewModel != null)
					msgs = ((InternalEObject)theContenedorRegistroBaseViewModelselectedRegistrosViewModel).eInverseRemove(this, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__SELECTED_REGISTROS_VIEW_MODEL, ContenedorRegistroBaseViewModel.class, msgs);
				return basicSetTheContenedorRegistroBaseViewModelselectedRegistrosViewModel((ContenedorRegistroBaseViewModel)otherEnd, msgs);
			case ContenedorregistrobaseviewmodelPackage.REGISTROS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_REGISTROS_VIEW_MODEL_REGISTROS_VIEW_MODEL:
				if (theContenedorRegistroBaseViewModelRegistrosViewModelRegistrosViewModel != null)
					msgs = ((InternalEObject)theContenedorRegistroBaseViewModelRegistrosViewModelRegistrosViewModel).eInverseRemove(this, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__REGISTROS_VIEW_MODEL, ContenedorRegistroBaseViewModel.class, msgs);
				return basicSetTheContenedorRegistroBaseViewModelRegistrosViewModelRegistrosViewModel((ContenedorRegistroBaseViewModel)otherEnd, msgs);
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
			case ContenedorregistrobaseviewmodelPackage.REGISTROS_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL:
				return basicSetOwnedByContenedorRegistroBaseViewModel(null, msgs);
			case ContenedorregistrobaseviewmodelPackage.REGISTROS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODELSELECTED_REGISTROS_VIEW_MODEL:
				return basicSetTheContenedorRegistroBaseViewModelselectedRegistrosViewModel(null, msgs);
			case ContenedorregistrobaseviewmodelPackage.REGISTROS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_REGISTROS_VIEW_MODEL_REGISTROS_VIEW_MODEL:
				return basicSetTheContenedorRegistroBaseViewModelRegistrosViewModelRegistrosViewModel(null, msgs);
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
			case ContenedorregistrobaseviewmodelPackage.REGISTROS_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL:
				return eInternalContainer().eInverseRemove(this, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__LISTA_REGISTROS_VIEW_MODEL, ContenedorRegistroBaseViewModel.class, msgs);
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
			case ContenedorregistrobaseviewmodelPackage.REGISTROS_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL:
				return getOwnedByContenedorRegistroBaseViewModel();
			case ContenedorregistrobaseviewmodelPackage.REGISTROS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODELSELECTED_REGISTROS_VIEW_MODEL:
				if (resolve) return getTheContenedorRegistroBaseViewModelselectedRegistrosViewModel();
				return basicGetTheContenedorRegistroBaseViewModelselectedRegistrosViewModel();
			case ContenedorregistrobaseviewmodelPackage.REGISTROS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_REGISTROS_VIEW_MODEL_REGISTROS_VIEW_MODEL:
				if (resolve) return getTheContenedorRegistroBaseViewModelRegistrosViewModelRegistrosViewModel();
				return basicGetTheContenedorRegistroBaseViewModelRegistrosViewModelRegistrosViewModel();
			case ContenedorregistrobaseviewmodelPackage.REGISTROS_VIEW_MODEL__ID:
				return getId();
			case ContenedorregistrobaseviewmodelPackage.REGISTROS_VIEW_MODEL__HORA:
				return getHora();
			case ContenedorregistrobaseviewmodelPackage.REGISTROS_VIEW_MODEL__ESTADO:
				return getEstado();
			case ContenedorregistrobaseviewmodelPackage.REGISTROS_VIEW_MODEL__INCIDENCIA:
				return getIncidencia();
			case ContenedorregistrobaseviewmodelPackage.REGISTROS_VIEW_MODEL__LUGAR:
				return getLugar();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ContenedorregistrobaseviewmodelPackage.REGISTROS_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL:
				setOwnedByContenedorRegistroBaseViewModel((ContenedorRegistroBaseViewModel)newValue);
				return;
			case ContenedorregistrobaseviewmodelPackage.REGISTROS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODELSELECTED_REGISTROS_VIEW_MODEL:
				setTheContenedorRegistroBaseViewModelselectedRegistrosViewModel((ContenedorRegistroBaseViewModel)newValue);
				return;
			case ContenedorregistrobaseviewmodelPackage.REGISTROS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_REGISTROS_VIEW_MODEL_REGISTROS_VIEW_MODEL:
				setTheContenedorRegistroBaseViewModelRegistrosViewModelRegistrosViewModel((ContenedorRegistroBaseViewModel)newValue);
				return;
			case ContenedorregistrobaseviewmodelPackage.REGISTROS_VIEW_MODEL__ID:
				setId((String)newValue);
				return;
			case ContenedorregistrobaseviewmodelPackage.REGISTROS_VIEW_MODEL__HORA:
				setHora((String)newValue);
				return;
			case ContenedorregistrobaseviewmodelPackage.REGISTROS_VIEW_MODEL__ESTADO:
				setEstado((String)newValue);
				return;
			case ContenedorregistrobaseviewmodelPackage.REGISTROS_VIEW_MODEL__INCIDENCIA:
				setIncidencia((String)newValue);
				return;
			case ContenedorregistrobaseviewmodelPackage.REGISTROS_VIEW_MODEL__LUGAR:
				setLugar((String)newValue);
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
			case ContenedorregistrobaseviewmodelPackage.REGISTROS_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL:
				setOwnedByContenedorRegistroBaseViewModel((ContenedorRegistroBaseViewModel)null);
				return;
			case ContenedorregistrobaseviewmodelPackage.REGISTROS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODELSELECTED_REGISTROS_VIEW_MODEL:
				setTheContenedorRegistroBaseViewModelselectedRegistrosViewModel((ContenedorRegistroBaseViewModel)null);
				return;
			case ContenedorregistrobaseviewmodelPackage.REGISTROS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_REGISTROS_VIEW_MODEL_REGISTROS_VIEW_MODEL:
				setTheContenedorRegistroBaseViewModelRegistrosViewModelRegistrosViewModel((ContenedorRegistroBaseViewModel)null);
				return;
			case ContenedorregistrobaseviewmodelPackage.REGISTROS_VIEW_MODEL__ID:
				setId(ID_EDEFAULT);
				return;
			case ContenedorregistrobaseviewmodelPackage.REGISTROS_VIEW_MODEL__HORA:
				setHora(HORA_EDEFAULT);
				return;
			case ContenedorregistrobaseviewmodelPackage.REGISTROS_VIEW_MODEL__ESTADO:
				setEstado(ESTADO_EDEFAULT);
				return;
			case ContenedorregistrobaseviewmodelPackage.REGISTROS_VIEW_MODEL__INCIDENCIA:
				setIncidencia(INCIDENCIA_EDEFAULT);
				return;
			case ContenedorregistrobaseviewmodelPackage.REGISTROS_VIEW_MODEL__LUGAR:
				setLugar(LUGAR_EDEFAULT);
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
			case ContenedorregistrobaseviewmodelPackage.REGISTROS_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL:
				return getOwnedByContenedorRegistroBaseViewModel() != null;
			case ContenedorregistrobaseviewmodelPackage.REGISTROS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODELSELECTED_REGISTROS_VIEW_MODEL:
				return theContenedorRegistroBaseViewModelselectedRegistrosViewModel != null;
			case ContenedorregistrobaseviewmodelPackage.REGISTROS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_REGISTROS_VIEW_MODEL_REGISTROS_VIEW_MODEL:
				return theContenedorRegistroBaseViewModelRegistrosViewModelRegistrosViewModel != null;
			case ContenedorregistrobaseviewmodelPackage.REGISTROS_VIEW_MODEL__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ContenedorregistrobaseviewmodelPackage.REGISTROS_VIEW_MODEL__HORA:
				return HORA_EDEFAULT == null ? hora != null : !HORA_EDEFAULT.equals(hora);
			case ContenedorregistrobaseviewmodelPackage.REGISTROS_VIEW_MODEL__ESTADO:
				return ESTADO_EDEFAULT == null ? estado != null : !ESTADO_EDEFAULT.equals(estado);
			case ContenedorregistrobaseviewmodelPackage.REGISTROS_VIEW_MODEL__INCIDENCIA:
				return INCIDENCIA_EDEFAULT == null ? incidencia != null : !INCIDENCIA_EDEFAULT.equals(incidencia);
			case ContenedorregistrobaseviewmodelPackage.REGISTROS_VIEW_MODEL__LUGAR:
				return LUGAR_EDEFAULT == null ? lugar != null : !LUGAR_EDEFAULT.equals(lugar);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", hora: ");
		result.append(hora);
		result.append(", estado: ");
		result.append(estado);
		result.append(", incidencia: ");
		result.append(incidencia);
		result.append(", lugar: ");
		result.append(lugar);
		result.append(')');
		return result.toString();
	}

} //RegistrosViewModelImpl
