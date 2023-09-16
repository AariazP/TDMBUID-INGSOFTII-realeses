/**
 */
package cootracir.domain.impl;

import cootracir.domain.Bus;
import cootracir.domain.DetalleRegistro;
import cootracir.domain.DomainPackage;
import cootracir.domain.FactoryGestionInventario;
import cootracir.domain.Ruta;

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
 * An implementation of the model object '<em><b>Ruta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cootracir.domain.impl.RutaImpl#getLstDetalleRegistro <em>Lst Detalle Registro</em>}</li>
 *   <li>{@link cootracir.domain.impl.RutaImpl#getPrecioRuta <em>Precio Ruta</em>}</li>
 *   <li>{@link cootracir.domain.impl.RutaImpl#getId <em>Id</em>}</li>
 *   <li>{@link cootracir.domain.impl.RutaImpl#getEstado <em>Estado</em>}</li>
 *   <li>{@link cootracir.domain.impl.RutaImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link cootracir.domain.impl.RutaImpl#getBus <em>Bus</em>}</li>
 *   <li>{@link cootracir.domain.impl.RutaImpl#getFactoryGestionInventario <em>Factory Gestion Inventario</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RutaImpl extends EObjectImpl implements Ruta {
	/**
	 * The cached value of the '{@link #getLstDetalleRegistro() <em>Lst Detalle Registro</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstDetalleRegistro()
	 * @generated
	 * @ordered
	 */
	protected EList<DetalleRegistro> lstDetalleRegistro;

	/**
	 * The default value of the '{@link #getPrecioRuta() <em>Precio Ruta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecioRuta()
	 * @generated
	 * @ordered
	 */
	protected static final String PRECIO_RUTA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrecioRuta() <em>Precio Ruta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecioRuta()
	 * @generated
	 * @ordered
	 */
	protected String precioRuta = PRECIO_RUTA_EDEFAULT;

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
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

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
	protected RutaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.RUTA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DetalleRegistro> getLstDetalleRegistro() {
		if (lstDetalleRegistro == null) {
			lstDetalleRegistro = new EObjectWithInverseResolvingEList<DetalleRegistro>(DetalleRegistro.class, this, DomainPackage.RUTA__LST_DETALLE_REGISTRO, DomainPackage.DETALLE_REGISTRO__RUTA);
		}
		return lstDetalleRegistro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrecioRuta() {
		return precioRuta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecioRuta(String newPrecioRuta) {
		String oldPrecioRuta = precioRuta;
		precioRuta = newPrecioRuta;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.RUTA__PRECIO_RUTA, oldPrecioRuta, precioRuta));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.RUTA__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.RUTA__ESTADO, oldEstado, estado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.RUTA__NOMBRE, oldNombre, nombre));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.RUTA__BUS, oldBus, bus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.RUTA__BUS, oldBus, newBus);
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
				msgs = ((InternalEObject)bus).eInverseRemove(this, DomainPackage.BUS__LST_RUTA, Bus.class, msgs);
			if (newBus != null)
				msgs = ((InternalEObject)newBus).eInverseAdd(this, DomainPackage.BUS__LST_RUTA, Bus.class, msgs);
			msgs = basicSetBus(newBus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.RUTA__BUS, newBus, newBus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactoryGestionInventario getFactoryGestionInventario() {
		if (eContainerFeatureID() != DomainPackage.RUTA__FACTORY_GESTION_INVENTARIO) return null;
		return (FactoryGestionInventario)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFactoryGestionInventario(FactoryGestionInventario newFactoryGestionInventario, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newFactoryGestionInventario, DomainPackage.RUTA__FACTORY_GESTION_INVENTARIO, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFactoryGestionInventario(FactoryGestionInventario newFactoryGestionInventario) {
		if (newFactoryGestionInventario != eInternalContainer() || (eContainerFeatureID() != DomainPackage.RUTA__FACTORY_GESTION_INVENTARIO && newFactoryGestionInventario != null)) {
			if (EcoreUtil.isAncestor(this, newFactoryGestionInventario))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFactoryGestionInventario != null)
				msgs = ((InternalEObject)newFactoryGestionInventario).eInverseAdd(this, DomainPackage.FACTORY_GESTION_INVENTARIO__LST_RUTA, FactoryGestionInventario.class, msgs);
			msgs = basicSetFactoryGestionInventario(newFactoryGestionInventario, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.RUTA__FACTORY_GESTION_INVENTARIO, newFactoryGestionInventario, newFactoryGestionInventario));
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
			case DomainPackage.RUTA__LST_DETALLE_REGISTRO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLstDetalleRegistro()).basicAdd(otherEnd, msgs);
			case DomainPackage.RUTA__BUS:
				if (bus != null)
					msgs = ((InternalEObject)bus).eInverseRemove(this, DomainPackage.BUS__LST_RUTA, Bus.class, msgs);
				return basicSetBus((Bus)otherEnd, msgs);
			case DomainPackage.RUTA__FACTORY_GESTION_INVENTARIO:
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
			case DomainPackage.RUTA__LST_DETALLE_REGISTRO:
				return ((InternalEList<?>)getLstDetalleRegistro()).basicRemove(otherEnd, msgs);
			case DomainPackage.RUTA__BUS:
				return basicSetBus(null, msgs);
			case DomainPackage.RUTA__FACTORY_GESTION_INVENTARIO:
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
			case DomainPackage.RUTA__FACTORY_GESTION_INVENTARIO:
				return eInternalContainer().eInverseRemove(this, DomainPackage.FACTORY_GESTION_INVENTARIO__LST_RUTA, FactoryGestionInventario.class, msgs);
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
			case DomainPackage.RUTA__LST_DETALLE_REGISTRO:
				return getLstDetalleRegistro();
			case DomainPackage.RUTA__PRECIO_RUTA:
				return getPrecioRuta();
			case DomainPackage.RUTA__ID:
				return getId();
			case DomainPackage.RUTA__ESTADO:
				return getEstado();
			case DomainPackage.RUTA__NOMBRE:
				return getNombre();
			case DomainPackage.RUTA__BUS:
				if (resolve) return getBus();
				return basicGetBus();
			case DomainPackage.RUTA__FACTORY_GESTION_INVENTARIO:
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
			case DomainPackage.RUTA__LST_DETALLE_REGISTRO:
				getLstDetalleRegistro().clear();
				getLstDetalleRegistro().addAll((Collection<? extends DetalleRegistro>)newValue);
				return;
			case DomainPackage.RUTA__PRECIO_RUTA:
				setPrecioRuta((String)newValue);
				return;
			case DomainPackage.RUTA__ID:
				setId((String)newValue);
				return;
			case DomainPackage.RUTA__ESTADO:
				setEstado((String)newValue);
				return;
			case DomainPackage.RUTA__NOMBRE:
				setNombre((String)newValue);
				return;
			case DomainPackage.RUTA__BUS:
				setBus((Bus)newValue);
				return;
			case DomainPackage.RUTA__FACTORY_GESTION_INVENTARIO:
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
			case DomainPackage.RUTA__LST_DETALLE_REGISTRO:
				getLstDetalleRegistro().clear();
				return;
			case DomainPackage.RUTA__PRECIO_RUTA:
				setPrecioRuta(PRECIO_RUTA_EDEFAULT);
				return;
			case DomainPackage.RUTA__ID:
				setId(ID_EDEFAULT);
				return;
			case DomainPackage.RUTA__ESTADO:
				setEstado(ESTADO_EDEFAULT);
				return;
			case DomainPackage.RUTA__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case DomainPackage.RUTA__BUS:
				setBus((Bus)null);
				return;
			case DomainPackage.RUTA__FACTORY_GESTION_INVENTARIO:
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
			case DomainPackage.RUTA__LST_DETALLE_REGISTRO:
				return lstDetalleRegistro != null && !lstDetalleRegistro.isEmpty();
			case DomainPackage.RUTA__PRECIO_RUTA:
				return PRECIO_RUTA_EDEFAULT == null ? precioRuta != null : !PRECIO_RUTA_EDEFAULT.equals(precioRuta);
			case DomainPackage.RUTA__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case DomainPackage.RUTA__ESTADO:
				return ESTADO_EDEFAULT == null ? estado != null : !ESTADO_EDEFAULT.equals(estado);
			case DomainPackage.RUTA__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case DomainPackage.RUTA__BUS:
				return bus != null;
			case DomainPackage.RUTA__FACTORY_GESTION_INVENTARIO:
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
		result.append(" (precioRuta: ");
		result.append(precioRuta);
		result.append(", id: ");
		result.append(id);
		result.append(", estado: ");
		result.append(estado);
		result.append(", nombre: ");
		result.append(nombre);
		result.append(')');
		return result.toString();
	}

} //RutaImpl
