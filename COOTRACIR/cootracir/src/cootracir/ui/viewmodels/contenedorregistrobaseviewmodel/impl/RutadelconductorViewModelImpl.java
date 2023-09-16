/**
 */
package cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl;

import cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorBusquedaViewModel;
import cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelPackage;
import cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.RutadelconductorViewModel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rutadelconductor View Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.RutadelconductorViewModelImpl#getOwnedContenedorBusquedaViewModel <em>Owned Contenedor Busqueda View Model</em>}</li>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.RutadelconductorViewModelImpl#getTheContenedorBusquedaViewModelRutadelconductorViewModelRutadelconductorViewModel <em>The Contenedor Busqueda View Model Rutadelconductor View Model Rutadelconductor View Model</em>}</li>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.RutadelconductorViewModelImpl#getTheContenedorBusquedaViewModelselectedRutadelconductorViewModel <em>The Contenedor Busqueda View Modelselected Rutadelconductor View Model</em>}</li>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.RutadelconductorViewModelImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RutadelconductorViewModelImpl extends EObjectImpl implements RutadelconductorViewModel {
	/**
	 * The cached value of the '{@link #getTheContenedorBusquedaViewModelRutadelconductorViewModelRutadelconductorViewModel() <em>The Contenedor Busqueda View Model Rutadelconductor View Model Rutadelconductor View Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheContenedorBusquedaViewModelRutadelconductorViewModelRutadelconductorViewModel()
	 * @generated
	 * @ordered
	 */
	protected ContenedorBusquedaViewModel theContenedorBusquedaViewModelRutadelconductorViewModelRutadelconductorViewModel;

	/**
	 * The cached value of the '{@link #getTheContenedorBusquedaViewModelselectedRutadelconductorViewModel() <em>The Contenedor Busqueda View Modelselected Rutadelconductor View Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheContenedorBusquedaViewModelselectedRutadelconductorViewModel()
	 * @generated
	 * @ordered
	 */
	protected ContenedorBusquedaViewModel theContenedorBusquedaViewModelselectedRutadelconductorViewModel;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RutadelconductorViewModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContenedorregistrobaseviewmodelPackage.Literals.RUTADELCONDUCTOR_VIEW_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorBusquedaViewModel getOwnedContenedorBusquedaViewModel() {
		if (eContainerFeatureID() != ContenedorregistrobaseviewmodelPackage.RUTADELCONDUCTOR_VIEW_MODEL__OWNED_CONTENEDOR_BUSQUEDA_VIEW_MODEL) return null;
		return (ContenedorBusquedaViewModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedContenedorBusquedaViewModel(ContenedorBusquedaViewModel newOwnedContenedorBusquedaViewModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnedContenedorBusquedaViewModel, ContenedorregistrobaseviewmodelPackage.RUTADELCONDUCTOR_VIEW_MODEL__OWNED_CONTENEDOR_BUSQUEDA_VIEW_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedContenedorBusquedaViewModel(ContenedorBusquedaViewModel newOwnedContenedorBusquedaViewModel) {
		if (newOwnedContenedorBusquedaViewModel != eInternalContainer() || (eContainerFeatureID() != ContenedorregistrobaseviewmodelPackage.RUTADELCONDUCTOR_VIEW_MODEL__OWNED_CONTENEDOR_BUSQUEDA_VIEW_MODEL && newOwnedContenedorBusquedaViewModel != null)) {
			if (EcoreUtil.isAncestor(this, newOwnedContenedorBusquedaViewModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedContenedorBusquedaViewModel != null)
				msgs = ((InternalEObject)newOwnedContenedorBusquedaViewModel).eInverseAdd(this, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__LISTA_RUTADELCONDUCTOR_VIEW_MODEL, ContenedorBusquedaViewModel.class, msgs);
			msgs = basicSetOwnedContenedorBusquedaViewModel(newOwnedContenedorBusquedaViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorregistrobaseviewmodelPackage.RUTADELCONDUCTOR_VIEW_MODEL__OWNED_CONTENEDOR_BUSQUEDA_VIEW_MODEL, newOwnedContenedorBusquedaViewModel, newOwnedContenedorBusquedaViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorBusquedaViewModel getTheContenedorBusquedaViewModelRutadelconductorViewModelRutadelconductorViewModel() {
		if (theContenedorBusquedaViewModelRutadelconductorViewModelRutadelconductorViewModel != null && theContenedorBusquedaViewModelRutadelconductorViewModelRutadelconductorViewModel.eIsProxy()) {
			InternalEObject oldTheContenedorBusquedaViewModelRutadelconductorViewModelRutadelconductorViewModel = (InternalEObject)theContenedorBusquedaViewModelRutadelconductorViewModelRutadelconductorViewModel;
			theContenedorBusquedaViewModelRutadelconductorViewModelRutadelconductorViewModel = (ContenedorBusquedaViewModel)eResolveProxy(oldTheContenedorBusquedaViewModelRutadelconductorViewModelRutadelconductorViewModel);
			if (theContenedorBusquedaViewModelRutadelconductorViewModelRutadelconductorViewModel != oldTheContenedorBusquedaViewModelRutadelconductorViewModelRutadelconductorViewModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContenedorregistrobaseviewmodelPackage.RUTADELCONDUCTOR_VIEW_MODEL__THE_CONTENEDOR_BUSQUEDA_VIEW_MODEL_RUTADELCONDUCTOR_VIEW_MODEL_RUTADELCONDUCTOR_VIEW_MODEL, oldTheContenedorBusquedaViewModelRutadelconductorViewModelRutadelconductorViewModel, theContenedorBusquedaViewModelRutadelconductorViewModelRutadelconductorViewModel));
			}
		}
		return theContenedorBusquedaViewModelRutadelconductorViewModelRutadelconductorViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorBusquedaViewModel basicGetTheContenedorBusquedaViewModelRutadelconductorViewModelRutadelconductorViewModel() {
		return theContenedorBusquedaViewModelRutadelconductorViewModelRutadelconductorViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheContenedorBusquedaViewModelRutadelconductorViewModelRutadelconductorViewModel(ContenedorBusquedaViewModel newTheContenedorBusquedaViewModelRutadelconductorViewModelRutadelconductorViewModel, NotificationChain msgs) {
		ContenedorBusquedaViewModel oldTheContenedorBusquedaViewModelRutadelconductorViewModelRutadelconductorViewModel = theContenedorBusquedaViewModelRutadelconductorViewModelRutadelconductorViewModel;
		theContenedorBusquedaViewModelRutadelconductorViewModelRutadelconductorViewModel = newTheContenedorBusquedaViewModelRutadelconductorViewModelRutadelconductorViewModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContenedorregistrobaseviewmodelPackage.RUTADELCONDUCTOR_VIEW_MODEL__THE_CONTENEDOR_BUSQUEDA_VIEW_MODEL_RUTADELCONDUCTOR_VIEW_MODEL_RUTADELCONDUCTOR_VIEW_MODEL, oldTheContenedorBusquedaViewModelRutadelconductorViewModelRutadelconductorViewModel, newTheContenedorBusquedaViewModelRutadelconductorViewModelRutadelconductorViewModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheContenedorBusquedaViewModelRutadelconductorViewModelRutadelconductorViewModel(ContenedorBusquedaViewModel newTheContenedorBusquedaViewModelRutadelconductorViewModelRutadelconductorViewModel) {
		if (newTheContenedorBusquedaViewModelRutadelconductorViewModelRutadelconductorViewModel != theContenedorBusquedaViewModelRutadelconductorViewModelRutadelconductorViewModel) {
			NotificationChain msgs = null;
			if (theContenedorBusquedaViewModelRutadelconductorViewModelRutadelconductorViewModel != null)
				msgs = ((InternalEObject)theContenedorBusquedaViewModelRutadelconductorViewModelRutadelconductorViewModel).eInverseRemove(this, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__RUTADELCONDUCTOR_VIEW_MODEL, ContenedorBusquedaViewModel.class, msgs);
			if (newTheContenedorBusquedaViewModelRutadelconductorViewModelRutadelconductorViewModel != null)
				msgs = ((InternalEObject)newTheContenedorBusquedaViewModelRutadelconductorViewModelRutadelconductorViewModel).eInverseAdd(this, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__RUTADELCONDUCTOR_VIEW_MODEL, ContenedorBusquedaViewModel.class, msgs);
			msgs = basicSetTheContenedorBusquedaViewModelRutadelconductorViewModelRutadelconductorViewModel(newTheContenedorBusquedaViewModelRutadelconductorViewModelRutadelconductorViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorregistrobaseviewmodelPackage.RUTADELCONDUCTOR_VIEW_MODEL__THE_CONTENEDOR_BUSQUEDA_VIEW_MODEL_RUTADELCONDUCTOR_VIEW_MODEL_RUTADELCONDUCTOR_VIEW_MODEL, newTheContenedorBusquedaViewModelRutadelconductorViewModelRutadelconductorViewModel, newTheContenedorBusquedaViewModelRutadelconductorViewModelRutadelconductorViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorBusquedaViewModel getTheContenedorBusquedaViewModelselectedRutadelconductorViewModel() {
		if (theContenedorBusquedaViewModelselectedRutadelconductorViewModel != null && theContenedorBusquedaViewModelselectedRutadelconductorViewModel.eIsProxy()) {
			InternalEObject oldTheContenedorBusquedaViewModelselectedRutadelconductorViewModel = (InternalEObject)theContenedorBusquedaViewModelselectedRutadelconductorViewModel;
			theContenedorBusquedaViewModelselectedRutadelconductorViewModel = (ContenedorBusquedaViewModel)eResolveProxy(oldTheContenedorBusquedaViewModelselectedRutadelconductorViewModel);
			if (theContenedorBusquedaViewModelselectedRutadelconductorViewModel != oldTheContenedorBusquedaViewModelselectedRutadelconductorViewModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContenedorregistrobaseviewmodelPackage.RUTADELCONDUCTOR_VIEW_MODEL__THE_CONTENEDOR_BUSQUEDA_VIEW_MODELSELECTED_RUTADELCONDUCTOR_VIEW_MODEL, oldTheContenedorBusquedaViewModelselectedRutadelconductorViewModel, theContenedorBusquedaViewModelselectedRutadelconductorViewModel));
			}
		}
		return theContenedorBusquedaViewModelselectedRutadelconductorViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorBusquedaViewModel basicGetTheContenedorBusquedaViewModelselectedRutadelconductorViewModel() {
		return theContenedorBusquedaViewModelselectedRutadelconductorViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheContenedorBusquedaViewModelselectedRutadelconductorViewModel(ContenedorBusquedaViewModel newTheContenedorBusquedaViewModelselectedRutadelconductorViewModel, NotificationChain msgs) {
		ContenedorBusquedaViewModel oldTheContenedorBusquedaViewModelselectedRutadelconductorViewModel = theContenedorBusquedaViewModelselectedRutadelconductorViewModel;
		theContenedorBusquedaViewModelselectedRutadelconductorViewModel = newTheContenedorBusquedaViewModelselectedRutadelconductorViewModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContenedorregistrobaseviewmodelPackage.RUTADELCONDUCTOR_VIEW_MODEL__THE_CONTENEDOR_BUSQUEDA_VIEW_MODELSELECTED_RUTADELCONDUCTOR_VIEW_MODEL, oldTheContenedorBusquedaViewModelselectedRutadelconductorViewModel, newTheContenedorBusquedaViewModelselectedRutadelconductorViewModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheContenedorBusquedaViewModelselectedRutadelconductorViewModel(ContenedorBusquedaViewModel newTheContenedorBusquedaViewModelselectedRutadelconductorViewModel) {
		if (newTheContenedorBusquedaViewModelselectedRutadelconductorViewModel != theContenedorBusquedaViewModelselectedRutadelconductorViewModel) {
			NotificationChain msgs = null;
			if (theContenedorBusquedaViewModelselectedRutadelconductorViewModel != null)
				msgs = ((InternalEObject)theContenedorBusquedaViewModelselectedRutadelconductorViewModel).eInverseRemove(this, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__SELECTED_RUTADELCONDUCTOR_VIEW_MODEL, ContenedorBusquedaViewModel.class, msgs);
			if (newTheContenedorBusquedaViewModelselectedRutadelconductorViewModel != null)
				msgs = ((InternalEObject)newTheContenedorBusquedaViewModelselectedRutadelconductorViewModel).eInverseAdd(this, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__SELECTED_RUTADELCONDUCTOR_VIEW_MODEL, ContenedorBusquedaViewModel.class, msgs);
			msgs = basicSetTheContenedorBusquedaViewModelselectedRutadelconductorViewModel(newTheContenedorBusquedaViewModelselectedRutadelconductorViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorregistrobaseviewmodelPackage.RUTADELCONDUCTOR_VIEW_MODEL__THE_CONTENEDOR_BUSQUEDA_VIEW_MODELSELECTED_RUTADELCONDUCTOR_VIEW_MODEL, newTheContenedorBusquedaViewModelselectedRutadelconductorViewModel, newTheContenedorBusquedaViewModelselectedRutadelconductorViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorregistrobaseviewmodelPackage.RUTADELCONDUCTOR_VIEW_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContenedorregistrobaseviewmodelPackage.RUTADELCONDUCTOR_VIEW_MODEL__OWNED_CONTENEDOR_BUSQUEDA_VIEW_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedContenedorBusquedaViewModel((ContenedorBusquedaViewModel)otherEnd, msgs);
			case ContenedorregistrobaseviewmodelPackage.RUTADELCONDUCTOR_VIEW_MODEL__THE_CONTENEDOR_BUSQUEDA_VIEW_MODEL_RUTADELCONDUCTOR_VIEW_MODEL_RUTADELCONDUCTOR_VIEW_MODEL:
				if (theContenedorBusquedaViewModelRutadelconductorViewModelRutadelconductorViewModel != null)
					msgs = ((InternalEObject)theContenedorBusquedaViewModelRutadelconductorViewModelRutadelconductorViewModel).eInverseRemove(this, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__RUTADELCONDUCTOR_VIEW_MODEL, ContenedorBusquedaViewModel.class, msgs);
				return basicSetTheContenedorBusquedaViewModelRutadelconductorViewModelRutadelconductorViewModel((ContenedorBusquedaViewModel)otherEnd, msgs);
			case ContenedorregistrobaseviewmodelPackage.RUTADELCONDUCTOR_VIEW_MODEL__THE_CONTENEDOR_BUSQUEDA_VIEW_MODELSELECTED_RUTADELCONDUCTOR_VIEW_MODEL:
				if (theContenedorBusquedaViewModelselectedRutadelconductorViewModel != null)
					msgs = ((InternalEObject)theContenedorBusquedaViewModelselectedRutadelconductorViewModel).eInverseRemove(this, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__SELECTED_RUTADELCONDUCTOR_VIEW_MODEL, ContenedorBusquedaViewModel.class, msgs);
				return basicSetTheContenedorBusquedaViewModelselectedRutadelconductorViewModel((ContenedorBusquedaViewModel)otherEnd, msgs);
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
			case ContenedorregistrobaseviewmodelPackage.RUTADELCONDUCTOR_VIEW_MODEL__OWNED_CONTENEDOR_BUSQUEDA_VIEW_MODEL:
				return basicSetOwnedContenedorBusquedaViewModel(null, msgs);
			case ContenedorregistrobaseviewmodelPackage.RUTADELCONDUCTOR_VIEW_MODEL__THE_CONTENEDOR_BUSQUEDA_VIEW_MODEL_RUTADELCONDUCTOR_VIEW_MODEL_RUTADELCONDUCTOR_VIEW_MODEL:
				return basicSetTheContenedorBusquedaViewModelRutadelconductorViewModelRutadelconductorViewModel(null, msgs);
			case ContenedorregistrobaseviewmodelPackage.RUTADELCONDUCTOR_VIEW_MODEL__THE_CONTENEDOR_BUSQUEDA_VIEW_MODELSELECTED_RUTADELCONDUCTOR_VIEW_MODEL:
				return basicSetTheContenedorBusquedaViewModelselectedRutadelconductorViewModel(null, msgs);
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
			case ContenedorregistrobaseviewmodelPackage.RUTADELCONDUCTOR_VIEW_MODEL__OWNED_CONTENEDOR_BUSQUEDA_VIEW_MODEL:
				return eInternalContainer().eInverseRemove(this, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__LISTA_RUTADELCONDUCTOR_VIEW_MODEL, ContenedorBusquedaViewModel.class, msgs);
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
			case ContenedorregistrobaseviewmodelPackage.RUTADELCONDUCTOR_VIEW_MODEL__OWNED_CONTENEDOR_BUSQUEDA_VIEW_MODEL:
				return getOwnedContenedorBusquedaViewModel();
			case ContenedorregistrobaseviewmodelPackage.RUTADELCONDUCTOR_VIEW_MODEL__THE_CONTENEDOR_BUSQUEDA_VIEW_MODEL_RUTADELCONDUCTOR_VIEW_MODEL_RUTADELCONDUCTOR_VIEW_MODEL:
				if (resolve) return getTheContenedorBusquedaViewModelRutadelconductorViewModelRutadelconductorViewModel();
				return basicGetTheContenedorBusquedaViewModelRutadelconductorViewModelRutadelconductorViewModel();
			case ContenedorregistrobaseviewmodelPackage.RUTADELCONDUCTOR_VIEW_MODEL__THE_CONTENEDOR_BUSQUEDA_VIEW_MODELSELECTED_RUTADELCONDUCTOR_VIEW_MODEL:
				if (resolve) return getTheContenedorBusquedaViewModelselectedRutadelconductorViewModel();
				return basicGetTheContenedorBusquedaViewModelselectedRutadelconductorViewModel();
			case ContenedorregistrobaseviewmodelPackage.RUTADELCONDUCTOR_VIEW_MODEL__NAME:
				return getName();
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
			case ContenedorregistrobaseviewmodelPackage.RUTADELCONDUCTOR_VIEW_MODEL__OWNED_CONTENEDOR_BUSQUEDA_VIEW_MODEL:
				setOwnedContenedorBusquedaViewModel((ContenedorBusquedaViewModel)newValue);
				return;
			case ContenedorregistrobaseviewmodelPackage.RUTADELCONDUCTOR_VIEW_MODEL__THE_CONTENEDOR_BUSQUEDA_VIEW_MODEL_RUTADELCONDUCTOR_VIEW_MODEL_RUTADELCONDUCTOR_VIEW_MODEL:
				setTheContenedorBusquedaViewModelRutadelconductorViewModelRutadelconductorViewModel((ContenedorBusquedaViewModel)newValue);
				return;
			case ContenedorregistrobaseviewmodelPackage.RUTADELCONDUCTOR_VIEW_MODEL__THE_CONTENEDOR_BUSQUEDA_VIEW_MODELSELECTED_RUTADELCONDUCTOR_VIEW_MODEL:
				setTheContenedorBusquedaViewModelselectedRutadelconductorViewModel((ContenedorBusquedaViewModel)newValue);
				return;
			case ContenedorregistrobaseviewmodelPackage.RUTADELCONDUCTOR_VIEW_MODEL__NAME:
				setName((String)newValue);
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
			case ContenedorregistrobaseviewmodelPackage.RUTADELCONDUCTOR_VIEW_MODEL__OWNED_CONTENEDOR_BUSQUEDA_VIEW_MODEL:
				setOwnedContenedorBusquedaViewModel((ContenedorBusquedaViewModel)null);
				return;
			case ContenedorregistrobaseviewmodelPackage.RUTADELCONDUCTOR_VIEW_MODEL__THE_CONTENEDOR_BUSQUEDA_VIEW_MODEL_RUTADELCONDUCTOR_VIEW_MODEL_RUTADELCONDUCTOR_VIEW_MODEL:
				setTheContenedorBusquedaViewModelRutadelconductorViewModelRutadelconductorViewModel((ContenedorBusquedaViewModel)null);
				return;
			case ContenedorregistrobaseviewmodelPackage.RUTADELCONDUCTOR_VIEW_MODEL__THE_CONTENEDOR_BUSQUEDA_VIEW_MODELSELECTED_RUTADELCONDUCTOR_VIEW_MODEL:
				setTheContenedorBusquedaViewModelselectedRutadelconductorViewModel((ContenedorBusquedaViewModel)null);
				return;
			case ContenedorregistrobaseviewmodelPackage.RUTADELCONDUCTOR_VIEW_MODEL__NAME:
				setName(NAME_EDEFAULT);
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
			case ContenedorregistrobaseviewmodelPackage.RUTADELCONDUCTOR_VIEW_MODEL__OWNED_CONTENEDOR_BUSQUEDA_VIEW_MODEL:
				return getOwnedContenedorBusquedaViewModel() != null;
			case ContenedorregistrobaseviewmodelPackage.RUTADELCONDUCTOR_VIEW_MODEL__THE_CONTENEDOR_BUSQUEDA_VIEW_MODEL_RUTADELCONDUCTOR_VIEW_MODEL_RUTADELCONDUCTOR_VIEW_MODEL:
				return theContenedorBusquedaViewModelRutadelconductorViewModelRutadelconductorViewModel != null;
			case ContenedorregistrobaseviewmodelPackage.RUTADELCONDUCTOR_VIEW_MODEL__THE_CONTENEDOR_BUSQUEDA_VIEW_MODELSELECTED_RUTADELCONDUCTOR_VIEW_MODEL:
				return theContenedorBusquedaViewModelselectedRutadelconductorViewModel != null;
			case ContenedorregistrobaseviewmodelPackage.RUTADELCONDUCTOR_VIEW_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //RutadelconductorViewModelImpl
