/**
 */
package cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl;

import cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorBusquedaViewModel;
import cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelPackage;
import cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.NombredelconductorViewModel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nombredelconductor View Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.NombredelconductorViewModelImpl#getOwnedContenedorBusquedaViewModel <em>Owned Contenedor Busqueda View Model</em>}</li>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.NombredelconductorViewModelImpl#getTheContenedorBusquedaViewModelNombredelconductorViewModelNombredelconductorViewModel <em>The Contenedor Busqueda View Model Nombredelconductor View Model Nombredelconductor View Model</em>}</li>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.NombredelconductorViewModelImpl#getTheContenedorBusquedaViewModelselectedNombredelconductorViewModel <em>The Contenedor Busqueda View Modelselected Nombredelconductor View Model</em>}</li>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.NombredelconductorViewModelImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NombredelconductorViewModelImpl extends EObjectImpl implements NombredelconductorViewModel {
	/**
	 * The cached value of the '{@link #getTheContenedorBusquedaViewModelNombredelconductorViewModelNombredelconductorViewModel() <em>The Contenedor Busqueda View Model Nombredelconductor View Model Nombredelconductor View Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheContenedorBusquedaViewModelNombredelconductorViewModelNombredelconductorViewModel()
	 * @generated
	 * @ordered
	 */
	protected ContenedorBusquedaViewModel theContenedorBusquedaViewModelNombredelconductorViewModelNombredelconductorViewModel;

	/**
	 * The cached value of the '{@link #getTheContenedorBusquedaViewModelselectedNombredelconductorViewModel() <em>The Contenedor Busqueda View Modelselected Nombredelconductor View Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheContenedorBusquedaViewModelselectedNombredelconductorViewModel()
	 * @generated
	 * @ordered
	 */
	protected ContenedorBusquedaViewModel theContenedorBusquedaViewModelselectedNombredelconductorViewModel;

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
	protected NombredelconductorViewModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContenedorregistrobaseviewmodelPackage.Literals.NOMBREDELCONDUCTOR_VIEW_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorBusquedaViewModel getOwnedContenedorBusquedaViewModel() {
		if (eContainerFeatureID() != ContenedorregistrobaseviewmodelPackage.NOMBREDELCONDUCTOR_VIEW_MODEL__OWNED_CONTENEDOR_BUSQUEDA_VIEW_MODEL) return null;
		return (ContenedorBusquedaViewModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedContenedorBusquedaViewModel(ContenedorBusquedaViewModel newOwnedContenedorBusquedaViewModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnedContenedorBusquedaViewModel, ContenedorregistrobaseviewmodelPackage.NOMBREDELCONDUCTOR_VIEW_MODEL__OWNED_CONTENEDOR_BUSQUEDA_VIEW_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedContenedorBusquedaViewModel(ContenedorBusquedaViewModel newOwnedContenedorBusquedaViewModel) {
		if (newOwnedContenedorBusquedaViewModel != eInternalContainer() || (eContainerFeatureID() != ContenedorregistrobaseviewmodelPackage.NOMBREDELCONDUCTOR_VIEW_MODEL__OWNED_CONTENEDOR_BUSQUEDA_VIEW_MODEL && newOwnedContenedorBusquedaViewModel != null)) {
			if (EcoreUtil.isAncestor(this, newOwnedContenedorBusquedaViewModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedContenedorBusquedaViewModel != null)
				msgs = ((InternalEObject)newOwnedContenedorBusquedaViewModel).eInverseAdd(this, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__LISTA_NOMBREDELCONDUCTOR_VIEW_MODEL, ContenedorBusquedaViewModel.class, msgs);
			msgs = basicSetOwnedContenedorBusquedaViewModel(newOwnedContenedorBusquedaViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorregistrobaseviewmodelPackage.NOMBREDELCONDUCTOR_VIEW_MODEL__OWNED_CONTENEDOR_BUSQUEDA_VIEW_MODEL, newOwnedContenedorBusquedaViewModel, newOwnedContenedorBusquedaViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorBusquedaViewModel getTheContenedorBusquedaViewModelNombredelconductorViewModelNombredelconductorViewModel() {
		if (theContenedorBusquedaViewModelNombredelconductorViewModelNombredelconductorViewModel != null && theContenedorBusquedaViewModelNombredelconductorViewModelNombredelconductorViewModel.eIsProxy()) {
			InternalEObject oldTheContenedorBusquedaViewModelNombredelconductorViewModelNombredelconductorViewModel = (InternalEObject)theContenedorBusquedaViewModelNombredelconductorViewModelNombredelconductorViewModel;
			theContenedorBusquedaViewModelNombredelconductorViewModelNombredelconductorViewModel = (ContenedorBusquedaViewModel)eResolveProxy(oldTheContenedorBusquedaViewModelNombredelconductorViewModelNombredelconductorViewModel);
			if (theContenedorBusquedaViewModelNombredelconductorViewModelNombredelconductorViewModel != oldTheContenedorBusquedaViewModelNombredelconductorViewModelNombredelconductorViewModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContenedorregistrobaseviewmodelPackage.NOMBREDELCONDUCTOR_VIEW_MODEL__THE_CONTENEDOR_BUSQUEDA_VIEW_MODEL_NOMBREDELCONDUCTOR_VIEW_MODEL_NOMBREDELCONDUCTOR_VIEW_MODEL, oldTheContenedorBusquedaViewModelNombredelconductorViewModelNombredelconductorViewModel, theContenedorBusquedaViewModelNombredelconductorViewModelNombredelconductorViewModel));
			}
		}
		return theContenedorBusquedaViewModelNombredelconductorViewModelNombredelconductorViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorBusquedaViewModel basicGetTheContenedorBusquedaViewModelNombredelconductorViewModelNombredelconductorViewModel() {
		return theContenedorBusquedaViewModelNombredelconductorViewModelNombredelconductorViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheContenedorBusquedaViewModelNombredelconductorViewModelNombredelconductorViewModel(ContenedorBusquedaViewModel newTheContenedorBusquedaViewModelNombredelconductorViewModelNombredelconductorViewModel, NotificationChain msgs) {
		ContenedorBusquedaViewModel oldTheContenedorBusquedaViewModelNombredelconductorViewModelNombredelconductorViewModel = theContenedorBusquedaViewModelNombredelconductorViewModelNombredelconductorViewModel;
		theContenedorBusquedaViewModelNombredelconductorViewModelNombredelconductorViewModel = newTheContenedorBusquedaViewModelNombredelconductorViewModelNombredelconductorViewModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContenedorregistrobaseviewmodelPackage.NOMBREDELCONDUCTOR_VIEW_MODEL__THE_CONTENEDOR_BUSQUEDA_VIEW_MODEL_NOMBREDELCONDUCTOR_VIEW_MODEL_NOMBREDELCONDUCTOR_VIEW_MODEL, oldTheContenedorBusquedaViewModelNombredelconductorViewModelNombredelconductorViewModel, newTheContenedorBusquedaViewModelNombredelconductorViewModelNombredelconductorViewModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheContenedorBusquedaViewModelNombredelconductorViewModelNombredelconductorViewModel(ContenedorBusquedaViewModel newTheContenedorBusquedaViewModelNombredelconductorViewModelNombredelconductorViewModel) {
		if (newTheContenedorBusquedaViewModelNombredelconductorViewModelNombredelconductorViewModel != theContenedorBusquedaViewModelNombredelconductorViewModelNombredelconductorViewModel) {
			NotificationChain msgs = null;
			if (theContenedorBusquedaViewModelNombredelconductorViewModelNombredelconductorViewModel != null)
				msgs = ((InternalEObject)theContenedorBusquedaViewModelNombredelconductorViewModelNombredelconductorViewModel).eInverseRemove(this, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__NOMBREDELCONDUCTOR_VIEW_MODEL, ContenedorBusquedaViewModel.class, msgs);
			if (newTheContenedorBusquedaViewModelNombredelconductorViewModelNombredelconductorViewModel != null)
				msgs = ((InternalEObject)newTheContenedorBusquedaViewModelNombredelconductorViewModelNombredelconductorViewModel).eInverseAdd(this, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__NOMBREDELCONDUCTOR_VIEW_MODEL, ContenedorBusquedaViewModel.class, msgs);
			msgs = basicSetTheContenedorBusquedaViewModelNombredelconductorViewModelNombredelconductorViewModel(newTheContenedorBusquedaViewModelNombredelconductorViewModelNombredelconductorViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorregistrobaseviewmodelPackage.NOMBREDELCONDUCTOR_VIEW_MODEL__THE_CONTENEDOR_BUSQUEDA_VIEW_MODEL_NOMBREDELCONDUCTOR_VIEW_MODEL_NOMBREDELCONDUCTOR_VIEW_MODEL, newTheContenedorBusquedaViewModelNombredelconductorViewModelNombredelconductorViewModel, newTheContenedorBusquedaViewModelNombredelconductorViewModelNombredelconductorViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorBusquedaViewModel getTheContenedorBusquedaViewModelselectedNombredelconductorViewModel() {
		if (theContenedorBusquedaViewModelselectedNombredelconductorViewModel != null && theContenedorBusquedaViewModelselectedNombredelconductorViewModel.eIsProxy()) {
			InternalEObject oldTheContenedorBusquedaViewModelselectedNombredelconductorViewModel = (InternalEObject)theContenedorBusquedaViewModelselectedNombredelconductorViewModel;
			theContenedorBusquedaViewModelselectedNombredelconductorViewModel = (ContenedorBusquedaViewModel)eResolveProxy(oldTheContenedorBusquedaViewModelselectedNombredelconductorViewModel);
			if (theContenedorBusquedaViewModelselectedNombredelconductorViewModel != oldTheContenedorBusquedaViewModelselectedNombredelconductorViewModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContenedorregistrobaseviewmodelPackage.NOMBREDELCONDUCTOR_VIEW_MODEL__THE_CONTENEDOR_BUSQUEDA_VIEW_MODELSELECTED_NOMBREDELCONDUCTOR_VIEW_MODEL, oldTheContenedorBusquedaViewModelselectedNombredelconductorViewModel, theContenedorBusquedaViewModelselectedNombredelconductorViewModel));
			}
		}
		return theContenedorBusquedaViewModelselectedNombredelconductorViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorBusquedaViewModel basicGetTheContenedorBusquedaViewModelselectedNombredelconductorViewModel() {
		return theContenedorBusquedaViewModelselectedNombredelconductorViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheContenedorBusquedaViewModelselectedNombredelconductorViewModel(ContenedorBusquedaViewModel newTheContenedorBusquedaViewModelselectedNombredelconductorViewModel, NotificationChain msgs) {
		ContenedorBusquedaViewModel oldTheContenedorBusquedaViewModelselectedNombredelconductorViewModel = theContenedorBusquedaViewModelselectedNombredelconductorViewModel;
		theContenedorBusquedaViewModelselectedNombredelconductorViewModel = newTheContenedorBusquedaViewModelselectedNombredelconductorViewModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContenedorregistrobaseviewmodelPackage.NOMBREDELCONDUCTOR_VIEW_MODEL__THE_CONTENEDOR_BUSQUEDA_VIEW_MODELSELECTED_NOMBREDELCONDUCTOR_VIEW_MODEL, oldTheContenedorBusquedaViewModelselectedNombredelconductorViewModel, newTheContenedorBusquedaViewModelselectedNombredelconductorViewModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheContenedorBusquedaViewModelselectedNombredelconductorViewModel(ContenedorBusquedaViewModel newTheContenedorBusquedaViewModelselectedNombredelconductorViewModel) {
		if (newTheContenedorBusquedaViewModelselectedNombredelconductorViewModel != theContenedorBusquedaViewModelselectedNombredelconductorViewModel) {
			NotificationChain msgs = null;
			if (theContenedorBusquedaViewModelselectedNombredelconductorViewModel != null)
				msgs = ((InternalEObject)theContenedorBusquedaViewModelselectedNombredelconductorViewModel).eInverseRemove(this, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__SELECTED_NOMBREDELCONDUCTOR_VIEW_MODEL, ContenedorBusquedaViewModel.class, msgs);
			if (newTheContenedorBusquedaViewModelselectedNombredelconductorViewModel != null)
				msgs = ((InternalEObject)newTheContenedorBusquedaViewModelselectedNombredelconductorViewModel).eInverseAdd(this, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__SELECTED_NOMBREDELCONDUCTOR_VIEW_MODEL, ContenedorBusquedaViewModel.class, msgs);
			msgs = basicSetTheContenedorBusquedaViewModelselectedNombredelconductorViewModel(newTheContenedorBusquedaViewModelselectedNombredelconductorViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorregistrobaseviewmodelPackage.NOMBREDELCONDUCTOR_VIEW_MODEL__THE_CONTENEDOR_BUSQUEDA_VIEW_MODELSELECTED_NOMBREDELCONDUCTOR_VIEW_MODEL, newTheContenedorBusquedaViewModelselectedNombredelconductorViewModel, newTheContenedorBusquedaViewModelselectedNombredelconductorViewModel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorregistrobaseviewmodelPackage.NOMBREDELCONDUCTOR_VIEW_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContenedorregistrobaseviewmodelPackage.NOMBREDELCONDUCTOR_VIEW_MODEL__OWNED_CONTENEDOR_BUSQUEDA_VIEW_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedContenedorBusquedaViewModel((ContenedorBusquedaViewModel)otherEnd, msgs);
			case ContenedorregistrobaseviewmodelPackage.NOMBREDELCONDUCTOR_VIEW_MODEL__THE_CONTENEDOR_BUSQUEDA_VIEW_MODEL_NOMBREDELCONDUCTOR_VIEW_MODEL_NOMBREDELCONDUCTOR_VIEW_MODEL:
				if (theContenedorBusquedaViewModelNombredelconductorViewModelNombredelconductorViewModel != null)
					msgs = ((InternalEObject)theContenedorBusquedaViewModelNombredelconductorViewModelNombredelconductorViewModel).eInverseRemove(this, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__NOMBREDELCONDUCTOR_VIEW_MODEL, ContenedorBusquedaViewModel.class, msgs);
				return basicSetTheContenedorBusquedaViewModelNombredelconductorViewModelNombredelconductorViewModel((ContenedorBusquedaViewModel)otherEnd, msgs);
			case ContenedorregistrobaseviewmodelPackage.NOMBREDELCONDUCTOR_VIEW_MODEL__THE_CONTENEDOR_BUSQUEDA_VIEW_MODELSELECTED_NOMBREDELCONDUCTOR_VIEW_MODEL:
				if (theContenedorBusquedaViewModelselectedNombredelconductorViewModel != null)
					msgs = ((InternalEObject)theContenedorBusquedaViewModelselectedNombredelconductorViewModel).eInverseRemove(this, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__SELECTED_NOMBREDELCONDUCTOR_VIEW_MODEL, ContenedorBusquedaViewModel.class, msgs);
				return basicSetTheContenedorBusquedaViewModelselectedNombredelconductorViewModel((ContenedorBusquedaViewModel)otherEnd, msgs);
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
			case ContenedorregistrobaseviewmodelPackage.NOMBREDELCONDUCTOR_VIEW_MODEL__OWNED_CONTENEDOR_BUSQUEDA_VIEW_MODEL:
				return basicSetOwnedContenedorBusquedaViewModel(null, msgs);
			case ContenedorregistrobaseviewmodelPackage.NOMBREDELCONDUCTOR_VIEW_MODEL__THE_CONTENEDOR_BUSQUEDA_VIEW_MODEL_NOMBREDELCONDUCTOR_VIEW_MODEL_NOMBREDELCONDUCTOR_VIEW_MODEL:
				return basicSetTheContenedorBusquedaViewModelNombredelconductorViewModelNombredelconductorViewModel(null, msgs);
			case ContenedorregistrobaseviewmodelPackage.NOMBREDELCONDUCTOR_VIEW_MODEL__THE_CONTENEDOR_BUSQUEDA_VIEW_MODELSELECTED_NOMBREDELCONDUCTOR_VIEW_MODEL:
				return basicSetTheContenedorBusquedaViewModelselectedNombredelconductorViewModel(null, msgs);
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
			case ContenedorregistrobaseviewmodelPackage.NOMBREDELCONDUCTOR_VIEW_MODEL__OWNED_CONTENEDOR_BUSQUEDA_VIEW_MODEL:
				return eInternalContainer().eInverseRemove(this, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__LISTA_NOMBREDELCONDUCTOR_VIEW_MODEL, ContenedorBusquedaViewModel.class, msgs);
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
			case ContenedorregistrobaseviewmodelPackage.NOMBREDELCONDUCTOR_VIEW_MODEL__OWNED_CONTENEDOR_BUSQUEDA_VIEW_MODEL:
				return getOwnedContenedorBusquedaViewModel();
			case ContenedorregistrobaseviewmodelPackage.NOMBREDELCONDUCTOR_VIEW_MODEL__THE_CONTENEDOR_BUSQUEDA_VIEW_MODEL_NOMBREDELCONDUCTOR_VIEW_MODEL_NOMBREDELCONDUCTOR_VIEW_MODEL:
				if (resolve) return getTheContenedorBusquedaViewModelNombredelconductorViewModelNombredelconductorViewModel();
				return basicGetTheContenedorBusquedaViewModelNombredelconductorViewModelNombredelconductorViewModel();
			case ContenedorregistrobaseviewmodelPackage.NOMBREDELCONDUCTOR_VIEW_MODEL__THE_CONTENEDOR_BUSQUEDA_VIEW_MODELSELECTED_NOMBREDELCONDUCTOR_VIEW_MODEL:
				if (resolve) return getTheContenedorBusquedaViewModelselectedNombredelconductorViewModel();
				return basicGetTheContenedorBusquedaViewModelselectedNombredelconductorViewModel();
			case ContenedorregistrobaseviewmodelPackage.NOMBREDELCONDUCTOR_VIEW_MODEL__NAME:
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
			case ContenedorregistrobaseviewmodelPackage.NOMBREDELCONDUCTOR_VIEW_MODEL__OWNED_CONTENEDOR_BUSQUEDA_VIEW_MODEL:
				setOwnedContenedorBusquedaViewModel((ContenedorBusquedaViewModel)newValue);
				return;
			case ContenedorregistrobaseviewmodelPackage.NOMBREDELCONDUCTOR_VIEW_MODEL__THE_CONTENEDOR_BUSQUEDA_VIEW_MODEL_NOMBREDELCONDUCTOR_VIEW_MODEL_NOMBREDELCONDUCTOR_VIEW_MODEL:
				setTheContenedorBusquedaViewModelNombredelconductorViewModelNombredelconductorViewModel((ContenedorBusquedaViewModel)newValue);
				return;
			case ContenedorregistrobaseviewmodelPackage.NOMBREDELCONDUCTOR_VIEW_MODEL__THE_CONTENEDOR_BUSQUEDA_VIEW_MODELSELECTED_NOMBREDELCONDUCTOR_VIEW_MODEL:
				setTheContenedorBusquedaViewModelselectedNombredelconductorViewModel((ContenedorBusquedaViewModel)newValue);
				return;
			case ContenedorregistrobaseviewmodelPackage.NOMBREDELCONDUCTOR_VIEW_MODEL__NAME:
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
			case ContenedorregistrobaseviewmodelPackage.NOMBREDELCONDUCTOR_VIEW_MODEL__OWNED_CONTENEDOR_BUSQUEDA_VIEW_MODEL:
				setOwnedContenedorBusquedaViewModel((ContenedorBusquedaViewModel)null);
				return;
			case ContenedorregistrobaseviewmodelPackage.NOMBREDELCONDUCTOR_VIEW_MODEL__THE_CONTENEDOR_BUSQUEDA_VIEW_MODEL_NOMBREDELCONDUCTOR_VIEW_MODEL_NOMBREDELCONDUCTOR_VIEW_MODEL:
				setTheContenedorBusquedaViewModelNombredelconductorViewModelNombredelconductorViewModel((ContenedorBusquedaViewModel)null);
				return;
			case ContenedorregistrobaseviewmodelPackage.NOMBREDELCONDUCTOR_VIEW_MODEL__THE_CONTENEDOR_BUSQUEDA_VIEW_MODELSELECTED_NOMBREDELCONDUCTOR_VIEW_MODEL:
				setTheContenedorBusquedaViewModelselectedNombredelconductorViewModel((ContenedorBusquedaViewModel)null);
				return;
			case ContenedorregistrobaseviewmodelPackage.NOMBREDELCONDUCTOR_VIEW_MODEL__NAME:
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
			case ContenedorregistrobaseviewmodelPackage.NOMBREDELCONDUCTOR_VIEW_MODEL__OWNED_CONTENEDOR_BUSQUEDA_VIEW_MODEL:
				return getOwnedContenedorBusquedaViewModel() != null;
			case ContenedorregistrobaseviewmodelPackage.NOMBREDELCONDUCTOR_VIEW_MODEL__THE_CONTENEDOR_BUSQUEDA_VIEW_MODEL_NOMBREDELCONDUCTOR_VIEW_MODEL_NOMBREDELCONDUCTOR_VIEW_MODEL:
				return theContenedorBusquedaViewModelNombredelconductorViewModelNombredelconductorViewModel != null;
			case ContenedorregistrobaseviewmodelPackage.NOMBREDELCONDUCTOR_VIEW_MODEL__THE_CONTENEDOR_BUSQUEDA_VIEW_MODELSELECTED_NOMBREDELCONDUCTOR_VIEW_MODEL:
				return theContenedorBusquedaViewModelselectedNombredelconductorViewModel != null;
			case ContenedorregistrobaseviewmodelPackage.NOMBREDELCONDUCTOR_VIEW_MODEL__NAME:
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

} //NombredelconductorViewModelImpl
