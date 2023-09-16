/**
 */
package cootracir.ui.impl;

import cootracir.ModelFactory;
import cootracir.cootracirPackage;

import cootracir.domain.Domain;
import cootracir.domain.DomainPackage;

import cootracir.ui.UI;
import cootracir.ui.UiPackage;

import cootracir.ui.viewmodels.ViewModel;
import cootracir.ui.viewmodels.ViewmodelsPackage;
import cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorBusquedaViewModel;
import cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorInformaciongeneralViewModel;
import cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorRegistroBaseViewModel;
import cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cootracir.ui.impl.UIImpl#getTheModelFactory <em>The Model Factory</em>}</li>
 *   <li>{@link cootracir.ui.impl.UIImpl#getTheDomain <em>The Domain</em>}</li>
 *   <li>{@link cootracir.ui.impl.UIImpl#getLstViewModels <em>Lst View Models</em>}</li>
 *   <li>{@link cootracir.ui.impl.UIImpl#getTheContenedorRegistroBaseViewModel <em>The Contenedor Registro Base View Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UIImpl extends EObjectImpl implements UI {
	/**
	 * The cached value of the '{@link #getTheDomain() <em>The Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheDomain()
	 * @generated
	 * @ordered
	 */
	protected Domain theDomain;

	/**
	 * The cached value of the '{@link #getLstViewModels() <em>Lst View Models</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstViewModels()
	 * @generated
	 * @ordered
	 */
	protected EList<ViewModel> lstViewModels;

	/**
	 * The cached value of the '{@link #getTheContenedorRegistroBaseViewModel() <em>The Contenedor Registro Base View Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheContenedorRegistroBaseViewModel()
	 * @generated
	 * @ordered
	 */
	protected ContenedorRegistroBaseViewModel theContenedorRegistroBaseViewModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiPackage.Literals.UI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory getTheModelFactory() {
		if (eContainerFeatureID() != UiPackage.UI__THE_MODEL_FACTORY) return null;
		return (ModelFactory)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheModelFactory(ModelFactory newTheModelFactory, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTheModelFactory, UiPackage.UI__THE_MODEL_FACTORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheModelFactory(ModelFactory newTheModelFactory) {
		if (newTheModelFactory != eInternalContainer() || (eContainerFeatureID() != UiPackage.UI__THE_MODEL_FACTORY && newTheModelFactory != null)) {
			if (EcoreUtil.isAncestor(this, newTheModelFactory))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTheModelFactory != null)
				msgs = ((InternalEObject)newTheModelFactory).eInverseAdd(this, cootracirPackage.MODEL_FACTORY__THE_UI, ModelFactory.class, msgs);
			msgs = basicSetTheModelFactory(newTheModelFactory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.UI__THE_MODEL_FACTORY, newTheModelFactory, newTheModelFactory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain getTheDomain() {
		if (theDomain != null && theDomain.eIsProxy()) {
			InternalEObject oldTheDomain = (InternalEObject)theDomain;
			theDomain = (Domain)eResolveProxy(oldTheDomain);
			if (theDomain != oldTheDomain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiPackage.UI__THE_DOMAIN, oldTheDomain, theDomain));
			}
		}
		return theDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain basicGetTheDomain() {
		return theDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheDomain(Domain newTheDomain, NotificationChain msgs) {
		Domain oldTheDomain = theDomain;
		theDomain = newTheDomain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiPackage.UI__THE_DOMAIN, oldTheDomain, newTheDomain);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheDomain(Domain newTheDomain) {
		if (newTheDomain != theDomain) {
			NotificationChain msgs = null;
			if (theDomain != null)
				msgs = ((InternalEObject)theDomain).eInverseRemove(this, DomainPackage.DOMAIN__THE_UI, Domain.class, msgs);
			if (newTheDomain != null)
				msgs = ((InternalEObject)newTheDomain).eInverseAdd(this, DomainPackage.DOMAIN__THE_UI, Domain.class, msgs);
			msgs = basicSetTheDomain(newTheDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.UI__THE_DOMAIN, newTheDomain, newTheDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ViewModel> getLstViewModels() {
		if (lstViewModels == null) {
			lstViewModels = new EObjectWithInverseResolvingEList<ViewModel>(ViewModel.class, this, UiPackage.UI__LST_VIEW_MODELS, ViewmodelsPackage.VIEW_MODEL__THE_UI);
		}
		return lstViewModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorRegistroBaseViewModel getTheContenedorRegistroBaseViewModel() {
		return theContenedorRegistroBaseViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheContenedorRegistroBaseViewModel(ContenedorRegistroBaseViewModel newTheContenedorRegistroBaseViewModel, NotificationChain msgs) {
		ContenedorRegistroBaseViewModel oldTheContenedorRegistroBaseViewModel = theContenedorRegistroBaseViewModel;
		theContenedorRegistroBaseViewModel = newTheContenedorRegistroBaseViewModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiPackage.UI__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL, oldTheContenedorRegistroBaseViewModel, newTheContenedorRegistroBaseViewModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheContenedorRegistroBaseViewModel(ContenedorRegistroBaseViewModel newTheContenedorRegistroBaseViewModel) {
		if (newTheContenedorRegistroBaseViewModel != theContenedorRegistroBaseViewModel) {
			NotificationChain msgs = null;
			if (theContenedorRegistroBaseViewModel != null)
				msgs = ((InternalEObject)theContenedorRegistroBaseViewModel).eInverseRemove(this, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__OWNED_BY_UI, ContenedorRegistroBaseViewModel.class, msgs);
			if (newTheContenedorRegistroBaseViewModel != null)
				msgs = ((InternalEObject)newTheContenedorRegistroBaseViewModel).eInverseAdd(this, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__OWNED_BY_UI, ContenedorRegistroBaseViewModel.class, msgs);
			msgs = basicSetTheContenedorRegistroBaseViewModel(newTheContenedorRegistroBaseViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.UI__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL, newTheContenedorRegistroBaseViewModel, newTheContenedorRegistroBaseViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void implementarModelo() {
		//TODO implementarModelo
		
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
			case UiPackage.UI__THE_MODEL_FACTORY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTheModelFactory((ModelFactory)otherEnd, msgs);
			case UiPackage.UI__THE_DOMAIN:
				if (theDomain != null)
					msgs = ((InternalEObject)theDomain).eInverseRemove(this, DomainPackage.DOMAIN__THE_UI, Domain.class, msgs);
				return basicSetTheDomain((Domain)otherEnd, msgs);
			case UiPackage.UI__LST_VIEW_MODELS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLstViewModels()).basicAdd(otherEnd, msgs);
			case UiPackage.UI__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL:
				if (theContenedorRegistroBaseViewModel != null)
					msgs = ((InternalEObject)theContenedorRegistroBaseViewModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiPackage.UI__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL, null, msgs);
				return basicSetTheContenedorRegistroBaseViewModel((ContenedorRegistroBaseViewModel)otherEnd, msgs);
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
			case UiPackage.UI__THE_MODEL_FACTORY:
				return basicSetTheModelFactory(null, msgs);
			case UiPackage.UI__THE_DOMAIN:
				return basicSetTheDomain(null, msgs);
			case UiPackage.UI__LST_VIEW_MODELS:
				return ((InternalEList<?>)getLstViewModels()).basicRemove(otherEnd, msgs);
			case UiPackage.UI__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL:
				return basicSetTheContenedorRegistroBaseViewModel(null, msgs);
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
			case UiPackage.UI__THE_MODEL_FACTORY:
				return eInternalContainer().eInverseRemove(this, cootracirPackage.MODEL_FACTORY__THE_UI, ModelFactory.class, msgs);
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
			case UiPackage.UI__THE_MODEL_FACTORY:
				return getTheModelFactory();
			case UiPackage.UI__THE_DOMAIN:
				if (resolve) return getTheDomain();
				return basicGetTheDomain();
			case UiPackage.UI__LST_VIEW_MODELS:
				return getLstViewModels();
			case UiPackage.UI__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL:
				return getTheContenedorRegistroBaseViewModel();
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
			case UiPackage.UI__THE_MODEL_FACTORY:
				setTheModelFactory((ModelFactory)newValue);
				return;
			case UiPackage.UI__THE_DOMAIN:
				setTheDomain((Domain)newValue);
				return;
			case UiPackage.UI__LST_VIEW_MODELS:
				getLstViewModels().clear();
				getLstViewModels().addAll((Collection<? extends ViewModel>)newValue);
				return;
			case UiPackage.UI__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL:
				setTheContenedorRegistroBaseViewModel((ContenedorRegistroBaseViewModel)newValue);
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
			case UiPackage.UI__THE_MODEL_FACTORY:
				setTheModelFactory((ModelFactory)null);
				return;
			case UiPackage.UI__THE_DOMAIN:
				setTheDomain((Domain)null);
				return;
			case UiPackage.UI__LST_VIEW_MODELS:
				getLstViewModels().clear();
				return;
			case UiPackage.UI__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL:
				setTheContenedorRegistroBaseViewModel((ContenedorRegistroBaseViewModel)null);
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
			case UiPackage.UI__THE_MODEL_FACTORY:
				return getTheModelFactory() != null;
			case UiPackage.UI__THE_DOMAIN:
				return theDomain != null;
			case UiPackage.UI__LST_VIEW_MODELS:
				return lstViewModels != null && !lstViewModels.isEmpty();
			case UiPackage.UI__THE_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL:
				return theContenedorRegistroBaseViewModel != null;
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public void limpiarCampos(ContenedorBusquedaViewModel contenedorbusquedaViewModel,
			ContenedorInformaciongeneralViewModel contenedorinformaciongeneralViewModel,
			ContenedorRegistroBaseViewModel contenedorregistroBaseViewModel) {
		theContenedorRegistroBaseViewModel.limpiarCampos(contenedorbusquedaViewModel, contenedorinformaciongeneralViewModel, contenedorregistroBaseViewModel);

	}

} //UIImpl
