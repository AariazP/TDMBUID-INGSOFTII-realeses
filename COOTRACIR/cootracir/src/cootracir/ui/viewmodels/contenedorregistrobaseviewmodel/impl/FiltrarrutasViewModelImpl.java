/**
 */
package cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl;

import cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorRegistroBaseViewModel;
import cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelPackage;
import cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.FiltrarrutasViewModel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filtrarrutas View Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.FiltrarrutasViewModelImpl#getOwnedByContenedorRegistroBaseViewModel <em>Owned By Contenedor Registro Base View Model</em>}</li>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.FiltrarrutasViewModelImpl#getTheContenedorRegistroBaseViewModelFiltrarrutasViewModelFiltrarrutasViewModel <em>The Contenedor Registro Base View Model Filtrarrutas View Model Filtrarrutas View Model</em>}</li>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.FiltrarrutasViewModelImpl#getTheContenedorRegistroBaseViewModelselectedFiltrarrutasViewModel <em>The Contenedor Registro Base View Modelselected Filtrarrutas View Model</em>}</li>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.FiltrarrutasViewModelImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FiltrarrutasViewModelImpl extends EObjectImpl implements FiltrarrutasViewModel {
	/**
	 * The cached value of the '{@link #getTheContenedorRegistroBaseViewModelFiltrarrutasViewModelFiltrarrutasViewModel() <em>The Contenedor Registro Base View Model Filtrarrutas View Model Filtrarrutas View Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheContenedorRegistroBaseViewModelFiltrarrutasViewModelFiltrarrutasViewModel()
	 * @generated
	 * @ordered
	 */
	protected ContenedorRegistroBaseViewModel theContenedorRegistroBaseViewModelFiltrarrutasViewModelFiltrarrutasViewModel;

	/**
	 * The cached value of the '{@link #getTheContenedorRegistroBaseViewModelselectedFiltrarrutasViewModel() <em>The Contenedor Registro Base View Modelselected Filtrarrutas View Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheContenedorRegistroBaseViewModelselectedFiltrarrutasViewModel()
	 * @generated
	 * @ordered
	 */
	protected ContenedorRegistroBaseViewModel theContenedorRegistroBaseViewModelselectedFiltrarrutasViewModel;

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
	public FiltrarrutasViewModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContenedorregistrobaseviewmodelPackage.Literals.FILTRARRUTAS_VIEW_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorRegistroBaseViewModel getOwnedByContenedorRegistroBaseViewModel() {
		if (eContainerFeatureID() != ContenedorregistrobaseviewmodelPackage.FILTRARRUTAS_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL) return null;
		return (ContenedorRegistroBaseViewModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByContenedorRegistroBaseViewModel(ContenedorRegistroBaseViewModel newOwnedByContenedorRegistroBaseViewModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnedByContenedorRegistroBaseViewModel, ContenedorregistrobaseviewmodelPackage.FILTRARRUTAS_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedByContenedorRegistroBaseViewModel(ContenedorRegistroBaseViewModel newOwnedByContenedorRegistroBaseViewModel) {
		if (newOwnedByContenedorRegistroBaseViewModel != eInternalContainer() || (eContainerFeatureID() != ContenedorregistrobaseviewmodelPackage.FILTRARRUTAS_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL && newOwnedByContenedorRegistroBaseViewModel != null)) {
			if (EcoreUtil.isAncestor(this, newOwnedByContenedorRegistroBaseViewModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByContenedorRegistroBaseViewModel != null)
				msgs = ((InternalEObject)newOwnedByContenedorRegistroBaseViewModel).eInverseAdd(this, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__LISTA_FILTRARRUTAS_VIEW_MODEL, ContenedorRegistroBaseViewModel.class, msgs);
			msgs = basicSetOwnedByContenedorRegistroBaseViewModel(newOwnedByContenedorRegistroBaseViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorregistrobaseviewmodelPackage.FILTRARRUTAS_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL, newOwnedByContenedorRegistroBaseViewModel, newOwnedByContenedorRegistroBaseViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorRegistroBaseViewModel getTheContenedorRegistroBaseViewModelFiltrarrutasViewModelFiltrarrutasViewModel() {
		if (theContenedorRegistroBaseViewModelFiltrarrutasViewModelFiltrarrutasViewModel != null && theContenedorRegistroBaseViewModelFiltrarrutasViewModelFiltrarrutasViewModel.eIsProxy()) {
			InternalEObject oldTheContenedorRegistroBaseViewModelFiltrarrutasViewModelFiltrarrutasViewModel = (InternalEObject)theContenedorRegistroBaseViewModelFiltrarrutasViewModelFiltrarrutasViewModel;
			theContenedorRegistroBaseViewModelFiltrarrutasViewModelFiltrarrutasViewModel = (ContenedorRegistroBaseViewModel)eResolveProxy(oldTheContenedorRegistroBaseViewModelFiltrarrutasViewModelFiltrarrutasViewModel);
			if (theContenedorRegistroBaseViewModelFiltrarrutasViewModelFiltrarrutasViewModel != oldTheContenedorRegistroBaseViewModelFiltrarrutasViewModelFiltrarrutasViewModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContenedorregistrobaseviewmodelPackage.FILTRARRUTAS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_FILTRARRUTAS_VIEW_MODEL_FILTRARRUTAS_VIEW_MODEL, oldTheContenedorRegistroBaseViewModelFiltrarrutasViewModelFiltrarrutasViewModel, theContenedorRegistroBaseViewModelFiltrarrutasViewModelFiltrarrutasViewModel));
			}
		}
		return theContenedorRegistroBaseViewModelFiltrarrutasViewModelFiltrarrutasViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorRegistroBaseViewModel basicGetTheContenedorRegistroBaseViewModelFiltrarrutasViewModelFiltrarrutasViewModel() {
		return theContenedorRegistroBaseViewModelFiltrarrutasViewModelFiltrarrutasViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheContenedorRegistroBaseViewModelFiltrarrutasViewModelFiltrarrutasViewModel(ContenedorRegistroBaseViewModel newTheContenedorRegistroBaseViewModelFiltrarrutasViewModelFiltrarrutasViewModel, NotificationChain msgs) {
		ContenedorRegistroBaseViewModel oldTheContenedorRegistroBaseViewModelFiltrarrutasViewModelFiltrarrutasViewModel = theContenedorRegistroBaseViewModelFiltrarrutasViewModelFiltrarrutasViewModel;
		theContenedorRegistroBaseViewModelFiltrarrutasViewModelFiltrarrutasViewModel = newTheContenedorRegistroBaseViewModelFiltrarrutasViewModelFiltrarrutasViewModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContenedorregistrobaseviewmodelPackage.FILTRARRUTAS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_FILTRARRUTAS_VIEW_MODEL_FILTRARRUTAS_VIEW_MODEL, oldTheContenedorRegistroBaseViewModelFiltrarrutasViewModelFiltrarrutasViewModel, newTheContenedorRegistroBaseViewModelFiltrarrutasViewModelFiltrarrutasViewModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheContenedorRegistroBaseViewModelFiltrarrutasViewModelFiltrarrutasViewModel(ContenedorRegistroBaseViewModel newTheContenedorRegistroBaseViewModelFiltrarrutasViewModelFiltrarrutasViewModel) {
		if (newTheContenedorRegistroBaseViewModelFiltrarrutasViewModelFiltrarrutasViewModel != theContenedorRegistroBaseViewModelFiltrarrutasViewModelFiltrarrutasViewModel) {
			NotificationChain msgs = null;
			if (theContenedorRegistroBaseViewModelFiltrarrutasViewModelFiltrarrutasViewModel != null)
				msgs = ((InternalEObject)theContenedorRegistroBaseViewModelFiltrarrutasViewModelFiltrarrutasViewModel).eInverseRemove(this, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__FILTRARRUTAS_VIEW_MODEL, ContenedorRegistroBaseViewModel.class, msgs);
			if (newTheContenedorRegistroBaseViewModelFiltrarrutasViewModelFiltrarrutasViewModel != null)
				msgs = ((InternalEObject)newTheContenedorRegistroBaseViewModelFiltrarrutasViewModelFiltrarrutasViewModel).eInverseAdd(this, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__FILTRARRUTAS_VIEW_MODEL, ContenedorRegistroBaseViewModel.class, msgs);
			msgs = basicSetTheContenedorRegistroBaseViewModelFiltrarrutasViewModelFiltrarrutasViewModel(newTheContenedorRegistroBaseViewModelFiltrarrutasViewModelFiltrarrutasViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorregistrobaseviewmodelPackage.FILTRARRUTAS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_FILTRARRUTAS_VIEW_MODEL_FILTRARRUTAS_VIEW_MODEL, newTheContenedorRegistroBaseViewModelFiltrarrutasViewModelFiltrarrutasViewModel, newTheContenedorRegistroBaseViewModelFiltrarrutasViewModelFiltrarrutasViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorRegistroBaseViewModel getTheContenedorRegistroBaseViewModelselectedFiltrarrutasViewModel() {
		if (theContenedorRegistroBaseViewModelselectedFiltrarrutasViewModel != null && theContenedorRegistroBaseViewModelselectedFiltrarrutasViewModel.eIsProxy()) {
			InternalEObject oldTheContenedorRegistroBaseViewModelselectedFiltrarrutasViewModel = (InternalEObject)theContenedorRegistroBaseViewModelselectedFiltrarrutasViewModel;
			theContenedorRegistroBaseViewModelselectedFiltrarrutasViewModel = (ContenedorRegistroBaseViewModel)eResolveProxy(oldTheContenedorRegistroBaseViewModelselectedFiltrarrutasViewModel);
			if (theContenedorRegistroBaseViewModelselectedFiltrarrutasViewModel != oldTheContenedorRegistroBaseViewModelselectedFiltrarrutasViewModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContenedorregistrobaseviewmodelPackage.FILTRARRUTAS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODELSELECTED_FILTRARRUTAS_VIEW_MODEL, oldTheContenedorRegistroBaseViewModelselectedFiltrarrutasViewModel, theContenedorRegistroBaseViewModelselectedFiltrarrutasViewModel));
			}
		}
		return theContenedorRegistroBaseViewModelselectedFiltrarrutasViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorRegistroBaseViewModel basicGetTheContenedorRegistroBaseViewModelselectedFiltrarrutasViewModel() {
		return theContenedorRegistroBaseViewModelselectedFiltrarrutasViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheContenedorRegistroBaseViewModelselectedFiltrarrutasViewModel(ContenedorRegistroBaseViewModel newTheContenedorRegistroBaseViewModelselectedFiltrarrutasViewModel, NotificationChain msgs) {
		ContenedorRegistroBaseViewModel oldTheContenedorRegistroBaseViewModelselectedFiltrarrutasViewModel = theContenedorRegistroBaseViewModelselectedFiltrarrutasViewModel;
		theContenedorRegistroBaseViewModelselectedFiltrarrutasViewModel = newTheContenedorRegistroBaseViewModelselectedFiltrarrutasViewModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContenedorregistrobaseviewmodelPackage.FILTRARRUTAS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODELSELECTED_FILTRARRUTAS_VIEW_MODEL, oldTheContenedorRegistroBaseViewModelselectedFiltrarrutasViewModel, newTheContenedorRegistroBaseViewModelselectedFiltrarrutasViewModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheContenedorRegistroBaseViewModelselectedFiltrarrutasViewModel(ContenedorRegistroBaseViewModel newTheContenedorRegistroBaseViewModelselectedFiltrarrutasViewModel) {
		if (newTheContenedorRegistroBaseViewModelselectedFiltrarrutasViewModel != theContenedorRegistroBaseViewModelselectedFiltrarrutasViewModel) {
			NotificationChain msgs = null;
			if (theContenedorRegistroBaseViewModelselectedFiltrarrutasViewModel != null)
				msgs = ((InternalEObject)theContenedorRegistroBaseViewModelselectedFiltrarrutasViewModel).eInverseRemove(this, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__SELECTED_FILTRARRUTAS_VIEW_MODEL, ContenedorRegistroBaseViewModel.class, msgs);
			if (newTheContenedorRegistroBaseViewModelselectedFiltrarrutasViewModel != null)
				msgs = ((InternalEObject)newTheContenedorRegistroBaseViewModelselectedFiltrarrutasViewModel).eInverseAdd(this, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__SELECTED_FILTRARRUTAS_VIEW_MODEL, ContenedorRegistroBaseViewModel.class, msgs);
			msgs = basicSetTheContenedorRegistroBaseViewModelselectedFiltrarrutasViewModel(newTheContenedorRegistroBaseViewModelselectedFiltrarrutasViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorregistrobaseviewmodelPackage.FILTRARRUTAS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODELSELECTED_FILTRARRUTAS_VIEW_MODEL, newTheContenedorRegistroBaseViewModelselectedFiltrarrutasViewModel, newTheContenedorRegistroBaseViewModelselectedFiltrarrutasViewModel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorregistrobaseviewmodelPackage.FILTRARRUTAS_VIEW_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContenedorregistrobaseviewmodelPackage.FILTRARRUTAS_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByContenedorRegistroBaseViewModel((ContenedorRegistroBaseViewModel)otherEnd, msgs);
			case ContenedorregistrobaseviewmodelPackage.FILTRARRUTAS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_FILTRARRUTAS_VIEW_MODEL_FILTRARRUTAS_VIEW_MODEL:
				if (theContenedorRegistroBaseViewModelFiltrarrutasViewModelFiltrarrutasViewModel != null)
					msgs = ((InternalEObject)theContenedorRegistroBaseViewModelFiltrarrutasViewModelFiltrarrutasViewModel).eInverseRemove(this, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__FILTRARRUTAS_VIEW_MODEL, ContenedorRegistroBaseViewModel.class, msgs);
				return basicSetTheContenedorRegistroBaseViewModelFiltrarrutasViewModelFiltrarrutasViewModel((ContenedorRegistroBaseViewModel)otherEnd, msgs);
			case ContenedorregistrobaseviewmodelPackage.FILTRARRUTAS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODELSELECTED_FILTRARRUTAS_VIEW_MODEL:
				if (theContenedorRegistroBaseViewModelselectedFiltrarrutasViewModel != null)
					msgs = ((InternalEObject)theContenedorRegistroBaseViewModelselectedFiltrarrutasViewModel).eInverseRemove(this, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__SELECTED_FILTRARRUTAS_VIEW_MODEL, ContenedorRegistroBaseViewModel.class, msgs);
				return basicSetTheContenedorRegistroBaseViewModelselectedFiltrarrutasViewModel((ContenedorRegistroBaseViewModel)otherEnd, msgs);
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
			case ContenedorregistrobaseviewmodelPackage.FILTRARRUTAS_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL:
				return basicSetOwnedByContenedorRegistroBaseViewModel(null, msgs);
			case ContenedorregistrobaseviewmodelPackage.FILTRARRUTAS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_FILTRARRUTAS_VIEW_MODEL_FILTRARRUTAS_VIEW_MODEL:
				return basicSetTheContenedorRegistroBaseViewModelFiltrarrutasViewModelFiltrarrutasViewModel(null, msgs);
			case ContenedorregistrobaseviewmodelPackage.FILTRARRUTAS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODELSELECTED_FILTRARRUTAS_VIEW_MODEL:
				return basicSetTheContenedorRegistroBaseViewModelselectedFiltrarrutasViewModel(null, msgs);
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
			case ContenedorregistrobaseviewmodelPackage.FILTRARRUTAS_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL:
				return eInternalContainer().eInverseRemove(this, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__LISTA_FILTRARRUTAS_VIEW_MODEL, ContenedorRegistroBaseViewModel.class, msgs);
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
			case ContenedorregistrobaseviewmodelPackage.FILTRARRUTAS_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL:
				return getOwnedByContenedorRegistroBaseViewModel();
			case ContenedorregistrobaseviewmodelPackage.FILTRARRUTAS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_FILTRARRUTAS_VIEW_MODEL_FILTRARRUTAS_VIEW_MODEL:
				if (resolve) return getTheContenedorRegistroBaseViewModelFiltrarrutasViewModelFiltrarrutasViewModel();
				return basicGetTheContenedorRegistroBaseViewModelFiltrarrutasViewModelFiltrarrutasViewModel();
			case ContenedorregistrobaseviewmodelPackage.FILTRARRUTAS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODELSELECTED_FILTRARRUTAS_VIEW_MODEL:
				if (resolve) return getTheContenedorRegistroBaseViewModelselectedFiltrarrutasViewModel();
				return basicGetTheContenedorRegistroBaseViewModelselectedFiltrarrutasViewModel();
			case ContenedorregistrobaseviewmodelPackage.FILTRARRUTAS_VIEW_MODEL__NAME:
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
			case ContenedorregistrobaseviewmodelPackage.FILTRARRUTAS_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL:
				setOwnedByContenedorRegistroBaseViewModel((ContenedorRegistroBaseViewModel)newValue);
				return;
			case ContenedorregistrobaseviewmodelPackage.FILTRARRUTAS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_FILTRARRUTAS_VIEW_MODEL_FILTRARRUTAS_VIEW_MODEL:
				setTheContenedorRegistroBaseViewModelFiltrarrutasViewModelFiltrarrutasViewModel((ContenedorRegistroBaseViewModel)newValue);
				return;
			case ContenedorregistrobaseviewmodelPackage.FILTRARRUTAS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODELSELECTED_FILTRARRUTAS_VIEW_MODEL:
				setTheContenedorRegistroBaseViewModelselectedFiltrarrutasViewModel((ContenedorRegistroBaseViewModel)newValue);
				return;
			case ContenedorregistrobaseviewmodelPackage.FILTRARRUTAS_VIEW_MODEL__NAME:
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
			case ContenedorregistrobaseviewmodelPackage.FILTRARRUTAS_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL:
				setOwnedByContenedorRegistroBaseViewModel((ContenedorRegistroBaseViewModel)null);
				return;
			case ContenedorregistrobaseviewmodelPackage.FILTRARRUTAS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_FILTRARRUTAS_VIEW_MODEL_FILTRARRUTAS_VIEW_MODEL:
				setTheContenedorRegistroBaseViewModelFiltrarrutasViewModelFiltrarrutasViewModel((ContenedorRegistroBaseViewModel)null);
				return;
			case ContenedorregistrobaseviewmodelPackage.FILTRARRUTAS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODELSELECTED_FILTRARRUTAS_VIEW_MODEL:
				setTheContenedorRegistroBaseViewModelselectedFiltrarrutasViewModel((ContenedorRegistroBaseViewModel)null);
				return;
			case ContenedorregistrobaseviewmodelPackage.FILTRARRUTAS_VIEW_MODEL__NAME:
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
			case ContenedorregistrobaseviewmodelPackage.FILTRARRUTAS_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL:
				return getOwnedByContenedorRegistroBaseViewModel() != null;
			case ContenedorregistrobaseviewmodelPackage.FILTRARRUTAS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_FILTRARRUTAS_VIEW_MODEL_FILTRARRUTAS_VIEW_MODEL:
				return theContenedorRegistroBaseViewModelFiltrarrutasViewModelFiltrarrutasViewModel != null;
			case ContenedorregistrobaseviewmodelPackage.FILTRARRUTAS_VIEW_MODEL__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODELSELECTED_FILTRARRUTAS_VIEW_MODEL:
				return theContenedorRegistroBaseViewModelselectedFiltrarrutasViewModel != null;
			case ContenedorregistrobaseviewmodelPackage.FILTRARRUTAS_VIEW_MODEL__NAME:
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

} //FiltrarrutasViewModelImpl
