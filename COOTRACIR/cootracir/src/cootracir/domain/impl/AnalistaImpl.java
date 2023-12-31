/**
 */
package cootracir.domain.impl;

import cootracir.domain.Analista;
import cootracir.domain.Conductor;
import cootracir.domain.DomainPackage;
import cootracir.domain.FactoryGestionHumana;

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
 * An implementation of the model object '<em><b>Analista</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cootracir.domain.impl.AnalistaImpl#getDireccion <em>Direccion</em>}</li>
 *   <li>{@link cootracir.domain.impl.AnalistaImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link cootracir.domain.impl.AnalistaImpl#getEstado <em>Estado</em>}</li>
 *   <li>{@link cootracir.domain.impl.AnalistaImpl#getId <em>Id</em>}</li>
 *   <li>{@link cootracir.domain.impl.AnalistaImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link cootracir.domain.impl.AnalistaImpl#getTelefono <em>Telefono</em>}</li>
 *   <li>{@link cootracir.domain.impl.AnalistaImpl#getFactoryGestionHumana <em>Factory Gestion Humana</em>}</li>
 *   <li>{@link cootracir.domain.impl.AnalistaImpl#getLstConductores <em>Lst Conductores</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnalistaImpl extends EObjectImpl implements Analista {
	/**
	 * The default value of the '{@link #getDireccion() <em>Direccion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDireccion()
	 * @generated
	 * @ordered
	 */
	protected static final String DIRECCION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDireccion() <em>Direccion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDireccion()
	 * @generated
	 * @ordered
	 */
	protected String direccion = DIRECCION_EDEFAULT;

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
	 * The cached value of the '{@link #getLstConductores() <em>Lst Conductores</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstConductores()
	 * @generated
	 * @ordered
	 */
	protected EList<Conductor> lstConductores;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalistaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.ANALISTA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDireccion(String newDireccion) {
		String oldDireccion = direccion;
		direccion = newDireccion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.ANALISTA__DIRECCION, oldDireccion, direccion));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.ANALISTA__EMAIL, oldEmail, email));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.ANALISTA__ESTADO, oldEstado, estado));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.ANALISTA__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.ANALISTA__NOMBRE, oldNombre, nombre));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.ANALISTA__TELEFONO, oldTelefono, telefono));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactoryGestionHumana getFactoryGestionHumana() {
		if (eContainerFeatureID() != DomainPackage.ANALISTA__FACTORY_GESTION_HUMANA) return null;
		return (FactoryGestionHumana)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFactoryGestionHumana(FactoryGestionHumana newFactoryGestionHumana, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newFactoryGestionHumana, DomainPackage.ANALISTA__FACTORY_GESTION_HUMANA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFactoryGestionHumana(FactoryGestionHumana newFactoryGestionHumana) {
		if (newFactoryGestionHumana != eInternalContainer() || (eContainerFeatureID() != DomainPackage.ANALISTA__FACTORY_GESTION_HUMANA && newFactoryGestionHumana != null)) {
			if (EcoreUtil.isAncestor(this, newFactoryGestionHumana))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFactoryGestionHumana != null)
				msgs = ((InternalEObject)newFactoryGestionHumana).eInverseAdd(this, DomainPackage.FACTORY_GESTION_HUMANA__LST_ANALISTAS, FactoryGestionHumana.class, msgs);
			msgs = basicSetFactoryGestionHumana(newFactoryGestionHumana, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.ANALISTA__FACTORY_GESTION_HUMANA, newFactoryGestionHumana, newFactoryGestionHumana));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Conductor> getLstConductores() {
		if (lstConductores == null) {
			lstConductores = new EObjectWithInverseResolvingEList<Conductor>(Conductor.class, this, DomainPackage.ANALISTA__LST_CONDUCTORES, DomainPackage.CONDUCTOR__ANALISTA);
		}
		return lstConductores;
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
			case DomainPackage.ANALISTA__FACTORY_GESTION_HUMANA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetFactoryGestionHumana((FactoryGestionHumana)otherEnd, msgs);
			case DomainPackage.ANALISTA__LST_CONDUCTORES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLstConductores()).basicAdd(otherEnd, msgs);
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
			case DomainPackage.ANALISTA__FACTORY_GESTION_HUMANA:
				return basicSetFactoryGestionHumana(null, msgs);
			case DomainPackage.ANALISTA__LST_CONDUCTORES:
				return ((InternalEList<?>)getLstConductores()).basicRemove(otherEnd, msgs);
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
			case DomainPackage.ANALISTA__FACTORY_GESTION_HUMANA:
				return eInternalContainer().eInverseRemove(this, DomainPackage.FACTORY_GESTION_HUMANA__LST_ANALISTAS, FactoryGestionHumana.class, msgs);
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
			case DomainPackage.ANALISTA__DIRECCION:
				return getDireccion();
			case DomainPackage.ANALISTA__EMAIL:
				return getEmail();
			case DomainPackage.ANALISTA__ESTADO:
				return getEstado();
			case DomainPackage.ANALISTA__ID:
				return getId();
			case DomainPackage.ANALISTA__NOMBRE:
				return getNombre();
			case DomainPackage.ANALISTA__TELEFONO:
				return getTelefono();
			case DomainPackage.ANALISTA__FACTORY_GESTION_HUMANA:
				return getFactoryGestionHumana();
			case DomainPackage.ANALISTA__LST_CONDUCTORES:
				return getLstConductores();
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
			case DomainPackage.ANALISTA__DIRECCION:
				setDireccion((String)newValue);
				return;
			case DomainPackage.ANALISTA__EMAIL:
				setEmail((String)newValue);
				return;
			case DomainPackage.ANALISTA__ESTADO:
				setEstado((String)newValue);
				return;
			case DomainPackage.ANALISTA__ID:
				setId((String)newValue);
				return;
			case DomainPackage.ANALISTA__NOMBRE:
				setNombre((String)newValue);
				return;
			case DomainPackage.ANALISTA__TELEFONO:
				setTelefono((String)newValue);
				return;
			case DomainPackage.ANALISTA__FACTORY_GESTION_HUMANA:
				setFactoryGestionHumana((FactoryGestionHumana)newValue);
				return;
			case DomainPackage.ANALISTA__LST_CONDUCTORES:
				getLstConductores().clear();
				getLstConductores().addAll((Collection<? extends Conductor>)newValue);
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
			case DomainPackage.ANALISTA__DIRECCION:
				setDireccion(DIRECCION_EDEFAULT);
				return;
			case DomainPackage.ANALISTA__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case DomainPackage.ANALISTA__ESTADO:
				setEstado(ESTADO_EDEFAULT);
				return;
			case DomainPackage.ANALISTA__ID:
				setId(ID_EDEFAULT);
				return;
			case DomainPackage.ANALISTA__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case DomainPackage.ANALISTA__TELEFONO:
				setTelefono(TELEFONO_EDEFAULT);
				return;
			case DomainPackage.ANALISTA__FACTORY_GESTION_HUMANA:
				setFactoryGestionHumana((FactoryGestionHumana)null);
				return;
			case DomainPackage.ANALISTA__LST_CONDUCTORES:
				getLstConductores().clear();
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
			case DomainPackage.ANALISTA__DIRECCION:
				return DIRECCION_EDEFAULT == null ? direccion != null : !DIRECCION_EDEFAULT.equals(direccion);
			case DomainPackage.ANALISTA__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case DomainPackage.ANALISTA__ESTADO:
				return ESTADO_EDEFAULT == null ? estado != null : !ESTADO_EDEFAULT.equals(estado);
			case DomainPackage.ANALISTA__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case DomainPackage.ANALISTA__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case DomainPackage.ANALISTA__TELEFONO:
				return TELEFONO_EDEFAULT == null ? telefono != null : !TELEFONO_EDEFAULT.equals(telefono);
			case DomainPackage.ANALISTA__FACTORY_GESTION_HUMANA:
				return getFactoryGestionHumana() != null;
			case DomainPackage.ANALISTA__LST_CONDUCTORES:
				return lstConductores != null && !lstConductores.isEmpty();
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
		result.append(" (direccion: ");
		result.append(direccion);
		result.append(", email: ");
		result.append(email);
		result.append(", estado: ");
		result.append(estado);
		result.append(", id: ");
		result.append(id);
		result.append(", nombre: ");
		result.append(nombre);
		result.append(", telefono: ");
		result.append(telefono);
		result.append(')');
		return result.toString();
	}

} //AnalistaImpl
