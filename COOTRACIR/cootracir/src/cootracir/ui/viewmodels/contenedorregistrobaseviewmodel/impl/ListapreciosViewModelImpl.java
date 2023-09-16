/**
 */
package cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl;

import cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorRegistroBaseViewModel;
import cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelPackage;
import cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ListapreciosViewModel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Listaprecios View Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.ListapreciosViewModelImpl#getOwnedByContenedorRegistroBaseViewModel <em>Owned By Contenedor Registro Base View Model</em>}</li>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.ListapreciosViewModelImpl#getTheContenedorRegistroBaseViewModelselectedListapreciosViewModel <em>The Contenedor Registro Base View Modelselected Listaprecios View Model</em>}</li>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.ListapreciosViewModelImpl#getTheContenedorRegistroBaseViewModelListapreciosViewModelListapreciosViewModel <em>The Contenedor Registro Base View Model Listaprecios View Model Listaprecios View Model</em>}</li>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.ListapreciosViewModelImpl#getRuta1 <em>Ruta1</em>}</li>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.ListapreciosViewModelImpl#getRuta2 <em>Ruta2</em>}</li>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.ListapreciosViewModelImpl#getPecio <em>Pecio</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListapreciosViewModelImpl extends EObjectImpl implements ListapreciosViewModel {
	/**
	 * The cached value of the '{@link #getTheContenedorRegistroBaseViewModelselectedListapreciosViewModel() <em>The Contenedor Registro Base View Modelselected Listaprecios View Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheContenedorRegistroBaseViewModelselectedListapreciosViewModel()
	 * @generated
	 * @ordered
	 */
	protected ContenedorRegistroBaseViewModel theContenedorRegistroBaseViewModelselectedListapreciosViewModel;

	/**
	 * The cached value of the '{@link #getTheContenedorRegistroBaseViewModelListapreciosViewModelListapreciosViewModel() <em>The Contenedor Registro Base View Model Listaprecios View Model Listaprecios View Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheContenedorRegistroBaseViewModelListapreciosViewModelListapreciosViewModel()
	 * @generated
	 * @ordered
	 */
	protected ContenedorRegistroBaseViewModel theContenedorRegistroBaseViewModelListapreciosViewModelListapreciosViewModel;

	/**
	 * The default value of the '{@link #getRuta1() <em>Ruta1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuta1()
	 * @generated
	 * @ordered
	 */
	protected static final String RUTA1_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getRuta1() <em>Ruta1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuta1()
	 * @generated
	 * @ordered
	 */
	protected String ruta1 = RUTA1_EDEFAULT;

	/**
	 * The default value of the '{@link #getRuta2() <em>Ruta2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuta2()
	 * @generated
	 * @ordered
	 */
	protected static final String RUTA2_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getRuta2() <em>Ruta2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuta2()
	 * @generated
	 * @ordered
	 */
	protected String ruta2 = RUTA2_EDEFAULT;

	/**
	 * The default value of the '{@link #getPecio() <em>Pecio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPecio()
	 * @generated
	 * @ordered
	 */
	protected static final String PECIO_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getPecio() <em>Pecio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPecio()
	 * @generated
	 * @ordered
	 */
	protected String pecio = PECIO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListapreciosViewModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContenedorregistrobaseviewmodelPackage.Literals.LISTAPRECIOS_VIEW_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorRegistroBaseViewModel getOwnedByContenedorRegistroBaseViewModel() {
		if (eContainerFeatureID() != ContenedorregistrobaseviewmodelPackage.LISTAPRECIOS_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL) return null;
		return (ContenedorRegistroBaseViewModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByContenedorRegistroBaseViewModel(ContenedorRegistroBaseViewModel newOwnedByContenedorRegistroBaseViewModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnedByContenedorRegistroBaseViewModel, ContenedorregistrobaseviewmodelPackage.LISTAPRECIOS_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedByContenedorRegistroBaseViewModel(ContenedorRegistroBaseViewModel newOwnedByContenedorRegistroBaseViewModel) {
		if (newOwnedByContenedorRegistroBaseViewModel != eInternalContainer() || (eContainerFeatureID() != ContenedorregistrobaseviewmodelPackage.LISTAPRECIOS_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL && newOwnedByContenedorRegistroBaseViewModel != null)) {
			if (EcoreUtil.isAncestor(this, newOwnedByContenedorRegistroBaseViewModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByContenedorRegistroBaseViewModel != null)
				msgs = ((InternalEObject)newOwnedByContenedorRegistroBaseViewModel).eInverseAdd(this, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__LISTA_LISTAPRECIOS_VIEW_MODEL, ContenedorRegistroBaseViewModel.class, msgs);
			msgs = basicSetOwnedByContenedorRegistroBaseViewModel(newOwnedByContenedorRegistroBaseViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorregistrobaseviewmodelPackage.LISTAPRECIOS_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL, newOwnedByContenedorRegistroBaseViewModel, newOwnedByContenedorRegistroBaseViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorRegistroBaseViewModel getTheContenedorRegistroBaseViewModelselectedListapreciosViewModel() {
		if (theContenedorRegistroBaseViewModelselectedListapreciosViewModel != null && theContenedorRegistroBaseViewModelselectedListapreciosViewModel.eIsProxy()) {
			InternalEObject oldTheContenedorRegistroBaseViewModelselectedListapreciosViewModel = (InternalEObject)theContenedorRegistroBaseViewModelselectedListapreciosViewModel;
			theContenedorRegistroBaseViewModelselectedListapreciosViewModel = (ContenedorRegistroBaseViewModel)eResolveProxy(oldTheContenedorRegistroBaseViewModelselectedListapreciosViewModel);
			if (theContenedorRegistroBaseViewModelselectedListapreciosViewModel != oldTheContenedorRegistroBaseViewModelselectedListapreciosViewModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContenedorregistrobaseviewmodelPackage.LISTAPRECIOS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODELSELECTED_LISTAPRECIOS_VIEW_MODEL, oldTheContenedorRegistroBaseViewModelselectedListapreciosViewModel, theContenedorRegistroBaseViewModelselectedListapreciosViewModel));
			}
		}
		return theContenedorRegistroBaseViewModelselectedListapreciosViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorRegistroBaseViewModel basicGetTheContenedorRegistroBaseViewModelselectedListapreciosViewModel() {
		return theContenedorRegistroBaseViewModelselectedListapreciosViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheContenedorRegistroBaseViewModelselectedListapreciosViewModel(ContenedorRegistroBaseViewModel newTheContenedorRegistroBaseViewModelselectedListapreciosViewModel, NotificationChain msgs) {
		ContenedorRegistroBaseViewModel oldTheContenedorRegistroBaseViewModelselectedListapreciosViewModel = theContenedorRegistroBaseViewModelselectedListapreciosViewModel;
		theContenedorRegistroBaseViewModelselectedListapreciosViewModel = newTheContenedorRegistroBaseViewModelselectedListapreciosViewModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContenedorregistrobaseviewmodelPackage.LISTAPRECIOS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODELSELECTED_LISTAPRECIOS_VIEW_MODEL, oldTheContenedorRegistroBaseViewModelselectedListapreciosViewModel, newTheContenedorRegistroBaseViewModelselectedListapreciosViewModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheContenedorRegistroBaseViewModelselectedListapreciosViewModel(ContenedorRegistroBaseViewModel newTheContenedorRegistroBaseViewModelselectedListapreciosViewModel) {
		if (newTheContenedorRegistroBaseViewModelselectedListapreciosViewModel != theContenedorRegistroBaseViewModelselectedListapreciosViewModel) {
			NotificationChain msgs = null;
			if (theContenedorRegistroBaseViewModelselectedListapreciosViewModel != null)
				msgs = ((InternalEObject)theContenedorRegistroBaseViewModelselectedListapreciosViewModel).eInverseRemove(this, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__SELECTED_LISTAPRECIOS_VIEW_MODEL, ContenedorRegistroBaseViewModel.class, msgs);
			if (newTheContenedorRegistroBaseViewModelselectedListapreciosViewModel != null)
				msgs = ((InternalEObject)newTheContenedorRegistroBaseViewModelselectedListapreciosViewModel).eInverseAdd(this, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__SELECTED_LISTAPRECIOS_VIEW_MODEL, ContenedorRegistroBaseViewModel.class, msgs);
			msgs = basicSetTheContenedorRegistroBaseViewModelselectedListapreciosViewModel(newTheContenedorRegistroBaseViewModelselectedListapreciosViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorregistrobaseviewmodelPackage.LISTAPRECIOS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODELSELECTED_LISTAPRECIOS_VIEW_MODEL, newTheContenedorRegistroBaseViewModelselectedListapreciosViewModel, newTheContenedorRegistroBaseViewModelselectedListapreciosViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorRegistroBaseViewModel getTheContenedorRegistroBaseViewModelListapreciosViewModelListapreciosViewModel() {
		if (theContenedorRegistroBaseViewModelListapreciosViewModelListapreciosViewModel != null && theContenedorRegistroBaseViewModelListapreciosViewModelListapreciosViewModel.eIsProxy()) {
			InternalEObject oldTheContenedorRegistroBaseViewModelListapreciosViewModelListapreciosViewModel = (InternalEObject)theContenedorRegistroBaseViewModelListapreciosViewModelListapreciosViewModel;
			theContenedorRegistroBaseViewModelListapreciosViewModelListapreciosViewModel = (ContenedorRegistroBaseViewModel)eResolveProxy(oldTheContenedorRegistroBaseViewModelListapreciosViewModelListapreciosViewModel);
			if (theContenedorRegistroBaseViewModelListapreciosViewModelListapreciosViewModel != oldTheContenedorRegistroBaseViewModelListapreciosViewModelListapreciosViewModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContenedorregistrobaseviewmodelPackage.LISTAPRECIOS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_LISTAPRECIOS_VIEW_MODEL_LISTAPRECIOS_VIEW_MODEL, oldTheContenedorRegistroBaseViewModelListapreciosViewModelListapreciosViewModel, theContenedorRegistroBaseViewModelListapreciosViewModelListapreciosViewModel));
			}
		}
		return theContenedorRegistroBaseViewModelListapreciosViewModelListapreciosViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorRegistroBaseViewModel basicGetTheContenedorRegistroBaseViewModelListapreciosViewModelListapreciosViewModel() {
		return theContenedorRegistroBaseViewModelListapreciosViewModelListapreciosViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheContenedorRegistroBaseViewModelListapreciosViewModelListapreciosViewModel(ContenedorRegistroBaseViewModel newTheContenedorRegistroBaseViewModelListapreciosViewModelListapreciosViewModel, NotificationChain msgs) {
		ContenedorRegistroBaseViewModel oldTheContenedorRegistroBaseViewModelListapreciosViewModelListapreciosViewModel = theContenedorRegistroBaseViewModelListapreciosViewModelListapreciosViewModel;
		theContenedorRegistroBaseViewModelListapreciosViewModelListapreciosViewModel = newTheContenedorRegistroBaseViewModelListapreciosViewModelListapreciosViewModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContenedorregistrobaseviewmodelPackage.LISTAPRECIOS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_LISTAPRECIOS_VIEW_MODEL_LISTAPRECIOS_VIEW_MODEL, oldTheContenedorRegistroBaseViewModelListapreciosViewModelListapreciosViewModel, newTheContenedorRegistroBaseViewModelListapreciosViewModelListapreciosViewModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheContenedorRegistroBaseViewModelListapreciosViewModelListapreciosViewModel(ContenedorRegistroBaseViewModel newTheContenedorRegistroBaseViewModelListapreciosViewModelListapreciosViewModel) {
		if (newTheContenedorRegistroBaseViewModelListapreciosViewModelListapreciosViewModel != theContenedorRegistroBaseViewModelListapreciosViewModelListapreciosViewModel) {
			NotificationChain msgs = null;
			if (theContenedorRegistroBaseViewModelListapreciosViewModelListapreciosViewModel != null)
				msgs = ((InternalEObject)theContenedorRegistroBaseViewModelListapreciosViewModelListapreciosViewModel).eInverseRemove(this, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__LISTAPRECIOS_VIEW_MODEL, ContenedorRegistroBaseViewModel.class, msgs);
			if (newTheContenedorRegistroBaseViewModelListapreciosViewModelListapreciosViewModel != null)
				msgs = ((InternalEObject)newTheContenedorRegistroBaseViewModelListapreciosViewModelListapreciosViewModel).eInverseAdd(this, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__LISTAPRECIOS_VIEW_MODEL, ContenedorRegistroBaseViewModel.class, msgs);
			msgs = basicSetTheContenedorRegistroBaseViewModelListapreciosViewModelListapreciosViewModel(newTheContenedorRegistroBaseViewModelListapreciosViewModelListapreciosViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorregistrobaseviewmodelPackage.LISTAPRECIOS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_LISTAPRECIOS_VIEW_MODEL_LISTAPRECIOS_VIEW_MODEL, newTheContenedorRegistroBaseViewModelListapreciosViewModelListapreciosViewModel, newTheContenedorRegistroBaseViewModelListapreciosViewModelListapreciosViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRuta1() {
		return ruta1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuta1(String newRuta1) {
		String oldRuta1 = ruta1;
		ruta1 = newRuta1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorregistrobaseviewmodelPackage.LISTAPRECIOS_VIEW_MODEL__RUTA1, oldRuta1, ruta1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRuta2() {
		return ruta2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuta2(String newRuta2) {
		String oldRuta2 = ruta2;
		ruta2 = newRuta2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorregistrobaseviewmodelPackage.LISTAPRECIOS_VIEW_MODEL__RUTA2, oldRuta2, ruta2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPecio() {
		return pecio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPecio(String newPecio) {
		String oldPecio = pecio;
		pecio = newPecio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorregistrobaseviewmodelPackage.LISTAPRECIOS_VIEW_MODEL__PECIO, oldPecio, pecio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContenedorregistrobaseviewmodelPackage.LISTAPRECIOS_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByContenedorRegistroBaseViewModel((ContenedorRegistroBaseViewModel)otherEnd, msgs);
			case ContenedorregistrobaseviewmodelPackage.LISTAPRECIOS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODELSELECTED_LISTAPRECIOS_VIEW_MODEL:
				if (theContenedorRegistroBaseViewModelselectedListapreciosViewModel != null)
					msgs = ((InternalEObject)theContenedorRegistroBaseViewModelselectedListapreciosViewModel).eInverseRemove(this, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__SELECTED_LISTAPRECIOS_VIEW_MODEL, ContenedorRegistroBaseViewModel.class, msgs);
				return basicSetTheContenedorRegistroBaseViewModelselectedListapreciosViewModel((ContenedorRegistroBaseViewModel)otherEnd, msgs);
			case ContenedorregistrobaseviewmodelPackage.LISTAPRECIOS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_LISTAPRECIOS_VIEW_MODEL_LISTAPRECIOS_VIEW_MODEL:
				if (theContenedorRegistroBaseViewModelListapreciosViewModelListapreciosViewModel != null)
					msgs = ((InternalEObject)theContenedorRegistroBaseViewModelListapreciosViewModelListapreciosViewModel).eInverseRemove(this, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__LISTAPRECIOS_VIEW_MODEL, ContenedorRegistroBaseViewModel.class, msgs);
				return basicSetTheContenedorRegistroBaseViewModelListapreciosViewModelListapreciosViewModel((ContenedorRegistroBaseViewModel)otherEnd, msgs);
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
			case ContenedorregistrobaseviewmodelPackage.LISTAPRECIOS_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL:
				return basicSetOwnedByContenedorRegistroBaseViewModel(null, msgs);
			case ContenedorregistrobaseviewmodelPackage.LISTAPRECIOS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODELSELECTED_LISTAPRECIOS_VIEW_MODEL:
				return basicSetTheContenedorRegistroBaseViewModelselectedListapreciosViewModel(null, msgs);
			case ContenedorregistrobaseviewmodelPackage.LISTAPRECIOS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_LISTAPRECIOS_VIEW_MODEL_LISTAPRECIOS_VIEW_MODEL:
				return basicSetTheContenedorRegistroBaseViewModelListapreciosViewModelListapreciosViewModel(null, msgs);
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
			case ContenedorregistrobaseviewmodelPackage.LISTAPRECIOS_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL:
				return eInternalContainer().eInverseRemove(this, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__LISTA_LISTAPRECIOS_VIEW_MODEL, ContenedorRegistroBaseViewModel.class, msgs);
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
			case ContenedorregistrobaseviewmodelPackage.LISTAPRECIOS_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL:
				return getOwnedByContenedorRegistroBaseViewModel();
			case ContenedorregistrobaseviewmodelPackage.LISTAPRECIOS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODELSELECTED_LISTAPRECIOS_VIEW_MODEL:
				if (resolve) return getTheContenedorRegistroBaseViewModelselectedListapreciosViewModel();
				return basicGetTheContenedorRegistroBaseViewModelselectedListapreciosViewModel();
			case ContenedorregistrobaseviewmodelPackage.LISTAPRECIOS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_LISTAPRECIOS_VIEW_MODEL_LISTAPRECIOS_VIEW_MODEL:
				if (resolve) return getTheContenedorRegistroBaseViewModelListapreciosViewModelListapreciosViewModel();
				return basicGetTheContenedorRegistroBaseViewModelListapreciosViewModelListapreciosViewModel();
			case ContenedorregistrobaseviewmodelPackage.LISTAPRECIOS_VIEW_MODEL__RUTA1:
				return getRuta1();
			case ContenedorregistrobaseviewmodelPackage.LISTAPRECIOS_VIEW_MODEL__RUTA2:
				return getRuta2();
			case ContenedorregistrobaseviewmodelPackage.LISTAPRECIOS_VIEW_MODEL__PECIO:
				return getPecio();
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
			case ContenedorregistrobaseviewmodelPackage.LISTAPRECIOS_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL:
				setOwnedByContenedorRegistroBaseViewModel((ContenedorRegistroBaseViewModel)newValue);
				return;
			case ContenedorregistrobaseviewmodelPackage.LISTAPRECIOS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODELSELECTED_LISTAPRECIOS_VIEW_MODEL:
				setTheContenedorRegistroBaseViewModelselectedListapreciosViewModel((ContenedorRegistroBaseViewModel)newValue);
				return;
			case ContenedorregistrobaseviewmodelPackage.LISTAPRECIOS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_LISTAPRECIOS_VIEW_MODEL_LISTAPRECIOS_VIEW_MODEL:
				setTheContenedorRegistroBaseViewModelListapreciosViewModelListapreciosViewModel((ContenedorRegistroBaseViewModel)newValue);
				return;
			case ContenedorregistrobaseviewmodelPackage.LISTAPRECIOS_VIEW_MODEL__RUTA1:
				setRuta1((String)newValue);
				return;
			case ContenedorregistrobaseviewmodelPackage.LISTAPRECIOS_VIEW_MODEL__RUTA2:
				setRuta2((String)newValue);
				return;
			case ContenedorregistrobaseviewmodelPackage.LISTAPRECIOS_VIEW_MODEL__PECIO:
				setPecio((String)newValue);
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
			case ContenedorregistrobaseviewmodelPackage.LISTAPRECIOS_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL:
				setOwnedByContenedorRegistroBaseViewModel((ContenedorRegistroBaseViewModel)null);
				return;
			case ContenedorregistrobaseviewmodelPackage.LISTAPRECIOS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODELSELECTED_LISTAPRECIOS_VIEW_MODEL:
				setTheContenedorRegistroBaseViewModelselectedListapreciosViewModel((ContenedorRegistroBaseViewModel)null);
				return;
			case ContenedorregistrobaseviewmodelPackage.LISTAPRECIOS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_LISTAPRECIOS_VIEW_MODEL_LISTAPRECIOS_VIEW_MODEL:
				setTheContenedorRegistroBaseViewModelListapreciosViewModelListapreciosViewModel((ContenedorRegistroBaseViewModel)null);
				return;
			case ContenedorregistrobaseviewmodelPackage.LISTAPRECIOS_VIEW_MODEL__RUTA1:
				setRuta1(RUTA1_EDEFAULT);
				return;
			case ContenedorregistrobaseviewmodelPackage.LISTAPRECIOS_VIEW_MODEL__RUTA2:
				setRuta2(RUTA2_EDEFAULT);
				return;
			case ContenedorregistrobaseviewmodelPackage.LISTAPRECIOS_VIEW_MODEL__PECIO:
				setPecio(PECIO_EDEFAULT);
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
			case ContenedorregistrobaseviewmodelPackage.LISTAPRECIOS_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL:
				return getOwnedByContenedorRegistroBaseViewModel() != null;
			case ContenedorregistrobaseviewmodelPackage.LISTAPRECIOS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODELSELECTED_LISTAPRECIOS_VIEW_MODEL:
				return theContenedorRegistroBaseViewModelselectedListapreciosViewModel != null;
			case ContenedorregistrobaseviewmodelPackage.LISTAPRECIOS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_LISTAPRECIOS_VIEW_MODEL_LISTAPRECIOS_VIEW_MODEL:
				return theContenedorRegistroBaseViewModelListapreciosViewModelListapreciosViewModel != null;
			case ContenedorregistrobaseviewmodelPackage.LISTAPRECIOS_VIEW_MODEL__RUTA1:
				return RUTA1_EDEFAULT == null ? ruta1 != null : !RUTA1_EDEFAULT.equals(ruta1);
			case ContenedorregistrobaseviewmodelPackage.LISTAPRECIOS_VIEW_MODEL__RUTA2:
				return RUTA2_EDEFAULT == null ? ruta2 != null : !RUTA2_EDEFAULT.equals(ruta2);
			case ContenedorregistrobaseviewmodelPackage.LISTAPRECIOS_VIEW_MODEL__PECIO:
				return PECIO_EDEFAULT == null ? pecio != null : !PECIO_EDEFAULT.equals(pecio);
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
		result.append(" (ruta1: ");
		result.append(ruta1);
		result.append(", ruta2: ");
		result.append(ruta2);
		result.append(", pecio: ");
		result.append(pecio);
		result.append(')');
		return result.toString();
	}

} //ListapreciosViewModelImpl
