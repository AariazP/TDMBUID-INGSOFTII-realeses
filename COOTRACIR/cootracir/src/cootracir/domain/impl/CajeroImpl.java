/**
 */
package cootracir.domain.impl;

import cootracir.domain.Cajero;
import cootracir.domain.Conductor;
import cootracir.domain.DomainPackage;
import cootracir.domain.FactoryGestionHumana;
import cootracir.domain.Liquidacion;

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
 * An implementation of the model object '<em><b>Cajero</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cootracir.domain.impl.CajeroImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link cootracir.domain.impl.CajeroImpl#getId <em>Id</em>}</li>
 *   <li>{@link cootracir.domain.impl.CajeroImpl#getEdad <em>Edad</em>}</li>
 *   <li>{@link cootracir.domain.impl.CajeroImpl#getTelefono <em>Telefono</em>}</li>
 *   <li>{@link cootracir.domain.impl.CajeroImpl#getDineroRecibido <em>Dinero Recibido</em>}</li>
 *   <li>{@link cootracir.domain.impl.CajeroImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link cootracir.domain.impl.CajeroImpl#getEstado <em>Estado</em>}</li>
 *   <li>{@link cootracir.domain.impl.CajeroImpl#getFactoryGestionHumana <em>Factory Gestion Humana</em>}</li>
 *   <li>{@link cootracir.domain.impl.CajeroImpl#getLstConductores <em>Lst Conductores</em>}</li>
 *   <li>{@link cootracir.domain.impl.CajeroImpl#getLstLiquidaciones <em>Lst Liquidaciones</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CajeroImpl extends EObjectImpl implements Cajero {
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
	 * The default value of the '{@link #getEdad() <em>Edad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdad()
	 * @generated
	 * @ordered
	 */
	protected static final String EDAD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEdad() <em>Edad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdad()
	 * @generated
	 * @ordered
	 */
	protected String edad = EDAD_EDEFAULT;

	/**
	 * The default value of the '{@link #getTelefono() <em>Telefono</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelefono()
	 * @generated
	 * @ordered
	 */
	protected static final String TELEFONO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTelefono() <em>Telefono</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelefono()
	 * @generated
	 * @ordered
	 */
	protected String telefono = TELEFONO_EDEFAULT;

	/**
	 * The default value of the '{@link #getDineroRecibido() <em>Dinero Recibido</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDineroRecibido()
	 * @generated
	 * @ordered
	 */
	protected static final String DINERO_RECIBIDO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDineroRecibido() <em>Dinero Recibido</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDineroRecibido()
	 * @generated
	 * @ordered
	 */
	protected String dineroRecibido = DINERO_RECIBIDO_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

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
	 * The cached value of the '{@link #getLstConductores() <em>Lst Conductores</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstConductores()
	 * @generated
	 * @ordered
	 */
	protected EList<Conductor> lstConductores;

	/**
	 * The cached value of the '{@link #getLstLiquidaciones() <em>Lst Liquidaciones</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstLiquidaciones()
	 * @generated
	 * @ordered
	 */
	protected EList<Liquidacion> lstLiquidaciones;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CajeroImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.CAJERO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.CAJERO__NOMBRE, oldNombre, nombre));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.CAJERO__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEdad() {
		return edad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdad(String newEdad) {
		String oldEdad = edad;
		edad = newEdad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.CAJERO__EDAD, oldEdad, edad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTelefono(String newTelefono) {
		String oldTelefono = telefono;
		telefono = newTelefono;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.CAJERO__TELEFONO, oldTelefono, telefono));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDineroRecibido() {
		return dineroRecibido;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDineroRecibido(String newDineroRecibido) {
		String oldDineroRecibido = dineroRecibido;
		dineroRecibido = newDineroRecibido;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.CAJERO__DINERO_RECIBIDO, oldDineroRecibido, dineroRecibido));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.CAJERO__EMAIL, oldEmail, email));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.CAJERO__ESTADO, oldEstado, estado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactoryGestionHumana getFactoryGestionHumana() {
		if (eContainerFeatureID() != DomainPackage.CAJERO__FACTORY_GESTION_HUMANA) return null;
		return (FactoryGestionHumana)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFactoryGestionHumana(FactoryGestionHumana newFactoryGestionHumana, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newFactoryGestionHumana, DomainPackage.CAJERO__FACTORY_GESTION_HUMANA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFactoryGestionHumana(FactoryGestionHumana newFactoryGestionHumana) {
		if (newFactoryGestionHumana != eInternalContainer() || (eContainerFeatureID() != DomainPackage.CAJERO__FACTORY_GESTION_HUMANA && newFactoryGestionHumana != null)) {
			if (EcoreUtil.isAncestor(this, newFactoryGestionHumana))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFactoryGestionHumana != null)
				msgs = ((InternalEObject)newFactoryGestionHumana).eInverseAdd(this, DomainPackage.FACTORY_GESTION_HUMANA__LST_CAJEROS, FactoryGestionHumana.class, msgs);
			msgs = basicSetFactoryGestionHumana(newFactoryGestionHumana, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.CAJERO__FACTORY_GESTION_HUMANA, newFactoryGestionHumana, newFactoryGestionHumana));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Conductor> getLstConductores() {
		if (lstConductores == null) {
			lstConductores = new EObjectWithInverseResolvingEList<Conductor>(Conductor.class, this, DomainPackage.CAJERO__LST_CONDUCTORES, DomainPackage.CONDUCTOR__CAJERO);
		}
		return lstConductores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Liquidacion> getLstLiquidaciones() {
		if (lstLiquidaciones == null) {
			lstLiquidaciones = new EObjectWithInverseResolvingEList<Liquidacion>(Liquidacion.class, this, DomainPackage.CAJERO__LST_LIQUIDACIONES, DomainPackage.LIQUIDACION__CAJERO);
		}
		return lstLiquidaciones;
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
			case DomainPackage.CAJERO__FACTORY_GESTION_HUMANA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetFactoryGestionHumana((FactoryGestionHumana)otherEnd, msgs);
			case DomainPackage.CAJERO__LST_CONDUCTORES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLstConductores()).basicAdd(otherEnd, msgs);
			case DomainPackage.CAJERO__LST_LIQUIDACIONES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLstLiquidaciones()).basicAdd(otherEnd, msgs);
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
			case DomainPackage.CAJERO__FACTORY_GESTION_HUMANA:
				return basicSetFactoryGestionHumana(null, msgs);
			case DomainPackage.CAJERO__LST_CONDUCTORES:
				return ((InternalEList<?>)getLstConductores()).basicRemove(otherEnd, msgs);
			case DomainPackage.CAJERO__LST_LIQUIDACIONES:
				return ((InternalEList<?>)getLstLiquidaciones()).basicRemove(otherEnd, msgs);
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
			case DomainPackage.CAJERO__FACTORY_GESTION_HUMANA:
				return eInternalContainer().eInverseRemove(this, DomainPackage.FACTORY_GESTION_HUMANA__LST_CAJEROS, FactoryGestionHumana.class, msgs);
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
			case DomainPackage.CAJERO__NOMBRE:
				return getNombre();
			case DomainPackage.CAJERO__ID:
				return getId();
			case DomainPackage.CAJERO__EDAD:
				return getEdad();
			case DomainPackage.CAJERO__TELEFONO:
				return getTelefono();
			case DomainPackage.CAJERO__DINERO_RECIBIDO:
				return getDineroRecibido();
			case DomainPackage.CAJERO__EMAIL:
				return getEmail();
			case DomainPackage.CAJERO__ESTADO:
				return getEstado();
			case DomainPackage.CAJERO__FACTORY_GESTION_HUMANA:
				return getFactoryGestionHumana();
			case DomainPackage.CAJERO__LST_CONDUCTORES:
				return getLstConductores();
			case DomainPackage.CAJERO__LST_LIQUIDACIONES:
				return getLstLiquidaciones();
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
			case DomainPackage.CAJERO__NOMBRE:
				setNombre((String)newValue);
				return;
			case DomainPackage.CAJERO__ID:
				setId((String)newValue);
				return;
			case DomainPackage.CAJERO__EDAD:
				setEdad((String)newValue);
				return;
			case DomainPackage.CAJERO__TELEFONO:
				setTelefono((String)newValue);
				return;
			case DomainPackage.CAJERO__DINERO_RECIBIDO:
				setDineroRecibido((String)newValue);
				return;
			case DomainPackage.CAJERO__EMAIL:
				setEmail((String)newValue);
				return;
			case DomainPackage.CAJERO__ESTADO:
				setEstado((String)newValue);
				return;
			case DomainPackage.CAJERO__FACTORY_GESTION_HUMANA:
				setFactoryGestionHumana((FactoryGestionHumana)newValue);
				return;
			case DomainPackage.CAJERO__LST_CONDUCTORES:
				getLstConductores().clear();
				getLstConductores().addAll((Collection<? extends Conductor>)newValue);
				return;
			case DomainPackage.CAJERO__LST_LIQUIDACIONES:
				getLstLiquidaciones().clear();
				getLstLiquidaciones().addAll((Collection<? extends Liquidacion>)newValue);
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
			case DomainPackage.CAJERO__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case DomainPackage.CAJERO__ID:
				setId(ID_EDEFAULT);
				return;
			case DomainPackage.CAJERO__EDAD:
				setEdad(EDAD_EDEFAULT);
				return;
			case DomainPackage.CAJERO__TELEFONO:
				setTelefono(TELEFONO_EDEFAULT);
				return;
			case DomainPackage.CAJERO__DINERO_RECIBIDO:
				setDineroRecibido(DINERO_RECIBIDO_EDEFAULT);
				return;
			case DomainPackage.CAJERO__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case DomainPackage.CAJERO__ESTADO:
				setEstado(ESTADO_EDEFAULT);
				return;
			case DomainPackage.CAJERO__FACTORY_GESTION_HUMANA:
				setFactoryGestionHumana((FactoryGestionHumana)null);
				return;
			case DomainPackage.CAJERO__LST_CONDUCTORES:
				getLstConductores().clear();
				return;
			case DomainPackage.CAJERO__LST_LIQUIDACIONES:
				getLstLiquidaciones().clear();
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
			case DomainPackage.CAJERO__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case DomainPackage.CAJERO__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case DomainPackage.CAJERO__EDAD:
				return EDAD_EDEFAULT == null ? edad != null : !EDAD_EDEFAULT.equals(edad);
			case DomainPackage.CAJERO__TELEFONO:
				return TELEFONO_EDEFAULT == null ? telefono != null : !TELEFONO_EDEFAULT.equals(telefono);
			case DomainPackage.CAJERO__DINERO_RECIBIDO:
				return DINERO_RECIBIDO_EDEFAULT == null ? dineroRecibido != null : !DINERO_RECIBIDO_EDEFAULT.equals(dineroRecibido);
			case DomainPackage.CAJERO__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case DomainPackage.CAJERO__ESTADO:
				return ESTADO_EDEFAULT == null ? estado != null : !ESTADO_EDEFAULT.equals(estado);
			case DomainPackage.CAJERO__FACTORY_GESTION_HUMANA:
				return getFactoryGestionHumana() != null;
			case DomainPackage.CAJERO__LST_CONDUCTORES:
				return lstConductores != null && !lstConductores.isEmpty();
			case DomainPackage.CAJERO__LST_LIQUIDACIONES:
				return lstLiquidaciones != null && !lstLiquidaciones.isEmpty();
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
		result.append(" (nombre: ");
		result.append(nombre);
		result.append(", id: ");
		result.append(id);
		result.append(", edad: ");
		result.append(edad);
		result.append(", telefono: ");
		result.append(telefono);
		result.append(", dineroRecibido: ");
		result.append(dineroRecibido);
		result.append(", email: ");
		result.append(email);
		result.append(", estado: ");
		result.append(estado);
		result.append(')');
		return result.toString();
	}
	@Override
	public void addLiquidacion(LiquidacionImpl liquidacionImpl) {
		lstLiquidaciones.add(liquidacionImpl);
	}

	@Override
	public void addConductor(ConductorImpl conductorImpl) {
		lstConductores.add(conductorImpl);
	}

} //CajeroImpl
