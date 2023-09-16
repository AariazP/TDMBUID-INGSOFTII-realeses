/**
 */
package cootracir.domain.impl;

import cootracir.domain.Bus;
import cootracir.domain.DetalleRegistro;
import cootracir.domain.DomainPackage;
import cootracir.domain.FactoryGestionInventario;
import cootracir.domain.Registrador;

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
 * An implementation of the model object '<em><b>Registrador</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cootracir.domain.impl.RegistradorImpl#getLstDetalleRegistros <em>Lst Detalle Registros</em>}</li>
 *   <li>{@link cootracir.domain.impl.RegistradorImpl#getId <em>Id</em>}</li>
 *   <li>{@link cootracir.domain.impl.RegistradorImpl#getEstado <em>Estado</em>}</li>
 *   <li>{@link cootracir.domain.impl.RegistradorImpl#getBus <em>Bus</em>}</li>
 *   <li>{@link cootracir.domain.impl.RegistradorImpl#getFactoryGestionInventario <em>Factory Gestion Inventario</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegistradorImpl extends EObjectImpl implements Registrador {
	/**
	 * The cached value of the '{@link #getLstDetalleRegistros() <em>Lst Detalle Registros</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstDetalleRegistros()
	 * @generated
	 * @ordered
	 */
	protected EList<DetalleRegistro> lstDetalleRegistros;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

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
	 * The default value of the '{@link #getEstado() <em>Estado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstado()
	 * @generated
	 * @ordered
	 */
	protected static final String ESTADO_EDEFAULT = null;

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
	 * The cached value of the '{@link #getBus() <em>Bus</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBus()
	 * @generated
	 * @ordered
	 */
	protected Bus bus;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegistradorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.REGISTRADOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DetalleRegistro> getLstDetalleRegistros() {
		if (lstDetalleRegistros == null) {
			lstDetalleRegistros = new EObjectWithInverseResolvingEList<DetalleRegistro>(DetalleRegistro.class, this, DomainPackage.REGISTRADOR__LST_DETALLE_REGISTROS, DomainPackage.DETALLE_REGISTRO__REGISTRADOR);
		}
		return lstDetalleRegistros;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.REGISTRADOR__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.REGISTRADOR__ESTADO, oldEstado, estado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bus getBus() {
		if (bus != null && bus.eIsProxy()) {
			InternalEObject oldBus = (InternalEObject)bus;
			bus = (Bus)eResolveProxy(oldBus);
			if (bus != oldBus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.REGISTRADOR__BUS, oldBus, bus));
			}
		}
		return bus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bus basicGetBus() {
		return bus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBus(Bus newBus, NotificationChain msgs) {
		Bus oldBus = bus;
		bus = newBus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.REGISTRADOR__BUS, oldBus, newBus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBus(Bus newBus) {
		if (newBus != bus) {
			NotificationChain msgs = null;
			if (bus != null)
				msgs = ((InternalEObject)bus).eInverseRemove(this, DomainPackage.BUS__REGISTRADOR, Bus.class, msgs);
			if (newBus != null)
				msgs = ((InternalEObject)newBus).eInverseAdd(this, DomainPackage.BUS__REGISTRADOR, Bus.class, msgs);
			msgs = basicSetBus(newBus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.REGISTRADOR__BUS, newBus, newBus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactoryGestionInventario getFactoryGestionInventario() {
		if (eContainerFeatureID() != DomainPackage.REGISTRADOR__FACTORY_GESTION_INVENTARIO) return null;
		return (FactoryGestionInventario)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFactoryGestionInventario(FactoryGestionInventario newFactoryGestionInventario, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newFactoryGestionInventario, DomainPackage.REGISTRADOR__FACTORY_GESTION_INVENTARIO, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFactoryGestionInventario(FactoryGestionInventario newFactoryGestionInventario) {
		if (newFactoryGestionInventario != eInternalContainer() || (eContainerFeatureID() != DomainPackage.REGISTRADOR__FACTORY_GESTION_INVENTARIO && newFactoryGestionInventario != null)) {
			if (EcoreUtil.isAncestor(this, newFactoryGestionInventario))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFactoryGestionInventario != null)
				msgs = ((InternalEObject)newFactoryGestionInventario).eInverseAdd(this, DomainPackage.FACTORY_GESTION_INVENTARIO__LST_REGISTRADOR, FactoryGestionInventario.class, msgs);
			msgs = basicSetFactoryGestionInventario(newFactoryGestionInventario, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.REGISTRADOR__FACTORY_GESTION_INVENTARIO, newFactoryGestionInventario, newFactoryGestionInventario));
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
			case DomainPackage.REGISTRADOR__LST_DETALLE_REGISTROS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLstDetalleRegistros()).basicAdd(otherEnd, msgs);
			case DomainPackage.REGISTRADOR__BUS:
				if (bus != null)
					msgs = ((InternalEObject)bus).eInverseRemove(this, DomainPackage.BUS__REGISTRADOR, Bus.class, msgs);
				return basicSetBus((Bus)otherEnd, msgs);
			case DomainPackage.REGISTRADOR__FACTORY_GESTION_INVENTARIO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetFactoryGestionInventario((FactoryGestionInventario)otherEnd, msgs);
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
			case DomainPackage.REGISTRADOR__LST_DETALLE_REGISTROS:
				return ((InternalEList<?>)getLstDetalleRegistros()).basicRemove(otherEnd, msgs);
			case DomainPackage.REGISTRADOR__BUS:
				return basicSetBus(null, msgs);
			case DomainPackage.REGISTRADOR__FACTORY_GESTION_INVENTARIO:
				return basicSetFactoryGestionInventario(null, msgs);
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
			case DomainPackage.REGISTRADOR__FACTORY_GESTION_INVENTARIO:
				return eInternalContainer().eInverseRemove(this, DomainPackage.FACTORY_GESTION_INVENTARIO__LST_REGISTRADOR, FactoryGestionInventario.class, msgs);
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
			case DomainPackage.REGISTRADOR__LST_DETALLE_REGISTROS:
				return getLstDetalleRegistros();
			case DomainPackage.REGISTRADOR__ID:
				return getId();
			case DomainPackage.REGISTRADOR__ESTADO:
				return getEstado();
			case DomainPackage.REGISTRADOR__BUS:
				if (resolve) return getBus();
				return basicGetBus();
			case DomainPackage.REGISTRADOR__FACTORY_GESTION_INVENTARIO:
				return getFactoryGestionInventario();
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
			case DomainPackage.REGISTRADOR__LST_DETALLE_REGISTROS:
				getLstDetalleRegistros().clear();
				getLstDetalleRegistros().addAll((Collection<? extends DetalleRegistro>)newValue);
				return;
			case DomainPackage.REGISTRADOR__ID:
				setId((String)newValue);
				return;
			case DomainPackage.REGISTRADOR__ESTADO:
				setEstado((String)newValue);
				return;
			case DomainPackage.REGISTRADOR__BUS:
				setBus((Bus)newValue);
				return;
			case DomainPackage.REGISTRADOR__FACTORY_GESTION_INVENTARIO:
				setFactoryGestionInventario((FactoryGestionInventario)newValue);
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
			case DomainPackage.REGISTRADOR__LST_DETALLE_REGISTROS:
				getLstDetalleRegistros().clear();
				return;
			case DomainPackage.REGISTRADOR__ID:
				setId(ID_EDEFAULT);
				return;
			case DomainPackage.REGISTRADOR__ESTADO:
				setEstado(ESTADO_EDEFAULT);
				return;
			case DomainPackage.REGISTRADOR__BUS:
				setBus((Bus)null);
				return;
			case DomainPackage.REGISTRADOR__FACTORY_GESTION_INVENTARIO:
				setFactoryGestionInventario((FactoryGestionInventario)null);
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
			case DomainPackage.REGISTRADOR__LST_DETALLE_REGISTROS:
				return lstDetalleRegistros != null && !lstDetalleRegistros.isEmpty();
			case DomainPackage.REGISTRADOR__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case DomainPackage.REGISTRADOR__ESTADO:
				return ESTADO_EDEFAULT == null ? estado != null : !ESTADO_EDEFAULT.equals(estado);
			case DomainPackage.REGISTRADOR__BUS:
				return bus != null;
			case DomainPackage.REGISTRADOR__FACTORY_GESTION_INVENTARIO:
				return getFactoryGestionInventario() != null;
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
		result.append(", estado: ");
		result.append(estado);
		result.append(')');
		return result.toString();
	}

} //RegistradorImpl
