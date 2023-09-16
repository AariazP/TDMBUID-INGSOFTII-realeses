/**
 */
package cootracir.domain.impl;

import cootracir.domain.DetalleRegistro;
import cootracir.domain.DomainPackage;
import cootracir.domain.FactoryGestionInventario;
import cootracir.domain.Registrador;
import cootracir.domain.Ruta;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Detalle Registro</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cootracir.domain.impl.DetalleRegistroImpl#getLugar <em>Lugar</em>}</li>
 *   <li>{@link cootracir.domain.impl.DetalleRegistroImpl#getHora <em>Hora</em>}</li>
 *   <li>{@link cootracir.domain.impl.DetalleRegistroImpl#getIncidencia <em>Incidencia</em>}</li>
 *   <li>{@link cootracir.domain.impl.DetalleRegistroImpl#getId <em>Id</em>}</li>
 *   <li>{@link cootracir.domain.impl.DetalleRegistroImpl#getEstado <em>Estado</em>}</li>
 *   <li>{@link cootracir.domain.impl.DetalleRegistroImpl#getRegistrador <em>Registrador</em>}</li>
 *   <li>{@link cootracir.domain.impl.DetalleRegistroImpl#getFactoryGestionInventario <em>Factory Gestion Inventario</em>}</li>
 *   <li>{@link cootracir.domain.impl.DetalleRegistroImpl#getRuta <em>Ruta</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DetalleRegistroImpl extends EObjectImpl implements DetalleRegistro {
	/**
	 * The default value of the '{@link #getLugar() <em>Lugar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLugar()
	 * @generated
	 * @ordered
	 */
	protected static final String LUGAR_EDEFAULT = null;

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
	 * The default value of the '{@link #getHora() <em>Hora</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHora()
	 * @generated
	 * @ordered
	 */
	protected static final String HORA_EDEFAULT = null;

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
	 * The default value of the '{@link #getIncidencia() <em>Incidencia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncidencia()
	 * @generated
	 * @ordered
	 */
	protected static final String INCIDENCIA_EDEFAULT = null;

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
	 * The cached value of the '{@link #getRegistrador() <em>Registrador</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistrador()
	 * @generated
	 * @ordered
	 */
	protected Registrador registrador;

	/**
	 * The cached value of the '{@link #getRuta() <em>Ruta</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuta()
	 * @generated
	 * @ordered
	 */
	protected Ruta ruta;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DetalleRegistroImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.DETALLE_REGISTRO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DETALLE_REGISTRO__LUGAR, oldLugar, lugar));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DETALLE_REGISTRO__HORA, oldHora, hora));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DETALLE_REGISTRO__INCIDENCIA, oldIncidencia, incidencia));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DETALLE_REGISTRO__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DETALLE_REGISTRO__ESTADO, oldEstado, estado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Registrador getRegistrador() {
		if (registrador != null && registrador.eIsProxy()) {
			InternalEObject oldRegistrador = (InternalEObject)registrador;
			registrador = (Registrador)eResolveProxy(oldRegistrador);
			if (registrador != oldRegistrador) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.DETALLE_REGISTRO__REGISTRADOR, oldRegistrador, registrador));
			}
		}
		return registrador;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Registrador basicGetRegistrador() {
		return registrador;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegistrador(Registrador newRegistrador, NotificationChain msgs) {
		Registrador oldRegistrador = registrador;
		registrador = newRegistrador;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.DETALLE_REGISTRO__REGISTRADOR, oldRegistrador, newRegistrador);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistrador(Registrador newRegistrador) {
		if (newRegistrador != registrador) {
			NotificationChain msgs = null;
			if (registrador != null)
				msgs = ((InternalEObject)registrador).eInverseRemove(this, DomainPackage.REGISTRADOR__LST_DETALLE_REGISTROS, Registrador.class, msgs);
			if (newRegistrador != null)
				msgs = ((InternalEObject)newRegistrador).eInverseAdd(this, DomainPackage.REGISTRADOR__LST_DETALLE_REGISTROS, Registrador.class, msgs);
			msgs = basicSetRegistrador(newRegistrador, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DETALLE_REGISTRO__REGISTRADOR, newRegistrador, newRegistrador));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactoryGestionInventario getFactoryGestionInventario() {
		if (eContainerFeatureID() != DomainPackage.DETALLE_REGISTRO__FACTORY_GESTION_INVENTARIO) return null;
		return (FactoryGestionInventario)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFactoryGestionInventario(FactoryGestionInventario newFactoryGestionInventario, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newFactoryGestionInventario, DomainPackage.DETALLE_REGISTRO__FACTORY_GESTION_INVENTARIO, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFactoryGestionInventario(FactoryGestionInventario newFactoryGestionInventario) {
		if (newFactoryGestionInventario != eInternalContainer() || (eContainerFeatureID() != DomainPackage.DETALLE_REGISTRO__FACTORY_GESTION_INVENTARIO && newFactoryGestionInventario != null)) {
			if (EcoreUtil.isAncestor(this, newFactoryGestionInventario))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFactoryGestionInventario != null)
				msgs = ((InternalEObject)newFactoryGestionInventario).eInverseAdd(this, DomainPackage.FACTORY_GESTION_INVENTARIO__LST_DETALLE_REGISTRO, FactoryGestionInventario.class, msgs);
			msgs = basicSetFactoryGestionInventario(newFactoryGestionInventario, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DETALLE_REGISTRO__FACTORY_GESTION_INVENTARIO, newFactoryGestionInventario, newFactoryGestionInventario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ruta getRuta() {
		if (ruta != null && ruta.eIsProxy()) {
			InternalEObject oldRuta = (InternalEObject)ruta;
			ruta = (Ruta)eResolveProxy(oldRuta);
			if (ruta != oldRuta) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.DETALLE_REGISTRO__RUTA, oldRuta, ruta));
			}
		}
		return ruta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ruta basicGetRuta() {
		return ruta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRuta(Ruta newRuta, NotificationChain msgs) {
		Ruta oldRuta = ruta;
		ruta = newRuta;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.DETALLE_REGISTRO__RUTA, oldRuta, newRuta);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuta(Ruta newRuta) {
		if (newRuta != ruta) {
			NotificationChain msgs = null;
			if (ruta != null)
				msgs = ((InternalEObject)ruta).eInverseRemove(this, DomainPackage.RUTA__LST_DETALLE_REGISTRO, Ruta.class, msgs);
			if (newRuta != null)
				msgs = ((InternalEObject)newRuta).eInverseAdd(this, DomainPackage.RUTA__LST_DETALLE_REGISTRO, Ruta.class, msgs);
			msgs = basicSetRuta(newRuta, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DETALLE_REGISTRO__RUTA, newRuta, newRuta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomainPackage.DETALLE_REGISTRO__REGISTRADOR:
				if (registrador != null)
					msgs = ((InternalEObject)registrador).eInverseRemove(this, DomainPackage.REGISTRADOR__LST_DETALLE_REGISTROS, Registrador.class, msgs);
				return basicSetRegistrador((Registrador)otherEnd, msgs);
			case DomainPackage.DETALLE_REGISTRO__FACTORY_GESTION_INVENTARIO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetFactoryGestionInventario((FactoryGestionInventario)otherEnd, msgs);
			case DomainPackage.DETALLE_REGISTRO__RUTA:
				if (ruta != null)
					msgs = ((InternalEObject)ruta).eInverseRemove(this, DomainPackage.RUTA__LST_DETALLE_REGISTRO, Ruta.class, msgs);
				return basicSetRuta((Ruta)otherEnd, msgs);
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
			case DomainPackage.DETALLE_REGISTRO__REGISTRADOR:
				return basicSetRegistrador(null, msgs);
			case DomainPackage.DETALLE_REGISTRO__FACTORY_GESTION_INVENTARIO:
				return basicSetFactoryGestionInventario(null, msgs);
			case DomainPackage.DETALLE_REGISTRO__RUTA:
				return basicSetRuta(null, msgs);
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
			case DomainPackage.DETALLE_REGISTRO__FACTORY_GESTION_INVENTARIO:
				return eInternalContainer().eInverseRemove(this, DomainPackage.FACTORY_GESTION_INVENTARIO__LST_DETALLE_REGISTRO, FactoryGestionInventario.class, msgs);
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
			case DomainPackage.DETALLE_REGISTRO__LUGAR:
				return getLugar();
			case DomainPackage.DETALLE_REGISTRO__HORA:
				return getHora();
			case DomainPackage.DETALLE_REGISTRO__INCIDENCIA:
				return getIncidencia();
			case DomainPackage.DETALLE_REGISTRO__ID:
				return getId();
			case DomainPackage.DETALLE_REGISTRO__ESTADO:
				return getEstado();
			case DomainPackage.DETALLE_REGISTRO__REGISTRADOR:
				if (resolve) return getRegistrador();
				return basicGetRegistrador();
			case DomainPackage.DETALLE_REGISTRO__FACTORY_GESTION_INVENTARIO:
				return getFactoryGestionInventario();
			case DomainPackage.DETALLE_REGISTRO__RUTA:
				if (resolve) return getRuta();
				return basicGetRuta();
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
			case DomainPackage.DETALLE_REGISTRO__LUGAR:
				setLugar((String)newValue);
				return;
			case DomainPackage.DETALLE_REGISTRO__HORA:
				setHora((String)newValue);
				return;
			case DomainPackage.DETALLE_REGISTRO__INCIDENCIA:
				setIncidencia((String)newValue);
				return;
			case DomainPackage.DETALLE_REGISTRO__ID:
				setId((String)newValue);
				return;
			case DomainPackage.DETALLE_REGISTRO__ESTADO:
				setEstado((String)newValue);
				return;
			case DomainPackage.DETALLE_REGISTRO__REGISTRADOR:
				setRegistrador((Registrador)newValue);
				return;
			case DomainPackage.DETALLE_REGISTRO__FACTORY_GESTION_INVENTARIO:
				setFactoryGestionInventario((FactoryGestionInventario)newValue);
				return;
			case DomainPackage.DETALLE_REGISTRO__RUTA:
				setRuta((Ruta)newValue);
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
			case DomainPackage.DETALLE_REGISTRO__LUGAR:
				setLugar(LUGAR_EDEFAULT);
				return;
			case DomainPackage.DETALLE_REGISTRO__HORA:
				setHora(HORA_EDEFAULT);
				return;
			case DomainPackage.DETALLE_REGISTRO__INCIDENCIA:
				setIncidencia(INCIDENCIA_EDEFAULT);
				return;
			case DomainPackage.DETALLE_REGISTRO__ID:
				setId(ID_EDEFAULT);
				return;
			case DomainPackage.DETALLE_REGISTRO__ESTADO:
				setEstado(ESTADO_EDEFAULT);
				return;
			case DomainPackage.DETALLE_REGISTRO__REGISTRADOR:
				setRegistrador((Registrador)null);
				return;
			case DomainPackage.DETALLE_REGISTRO__FACTORY_GESTION_INVENTARIO:
				setFactoryGestionInventario((FactoryGestionInventario)null);
				return;
			case DomainPackage.DETALLE_REGISTRO__RUTA:
				setRuta((Ruta)null);
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
			case DomainPackage.DETALLE_REGISTRO__LUGAR:
				return LUGAR_EDEFAULT == null ? lugar != null : !LUGAR_EDEFAULT.equals(lugar);
			case DomainPackage.DETALLE_REGISTRO__HORA:
				return HORA_EDEFAULT == null ? hora != null : !HORA_EDEFAULT.equals(hora);
			case DomainPackage.DETALLE_REGISTRO__INCIDENCIA:
				return INCIDENCIA_EDEFAULT == null ? incidencia != null : !INCIDENCIA_EDEFAULT.equals(incidencia);
			case DomainPackage.DETALLE_REGISTRO__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case DomainPackage.DETALLE_REGISTRO__ESTADO:
				return ESTADO_EDEFAULT == null ? estado != null : !ESTADO_EDEFAULT.equals(estado);
			case DomainPackage.DETALLE_REGISTRO__REGISTRADOR:
				return registrador != null;
			case DomainPackage.DETALLE_REGISTRO__FACTORY_GESTION_INVENTARIO:
				return getFactoryGestionInventario() != null;
			case DomainPackage.DETALLE_REGISTRO__RUTA:
				return ruta != null;
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
		result.append(" (lugar: ");
		result.append(lugar);
		result.append(", hora: ");
		result.append(hora);
		result.append(", incidencia: ");
		result.append(incidencia);
		result.append(", id: ");
		result.append(id);
		result.append(", estado: ");
		result.append(estado);
		result.append(')');
		return result.toString();
	}

} //DetalleRegistroImpl
