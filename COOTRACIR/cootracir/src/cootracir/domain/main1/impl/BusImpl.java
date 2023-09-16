/**
 */
package cootracir.domain.main1.impl;

import cootracir.domain.Conductor;
import cootracir.domain.DomainPackage;

import cootracir.domain.main1.Bus;
import cootracir.domain.main1.Main1Package;
import cootracir.domain.main1.Ruta;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cootracir.domain.main1.impl.BusImpl#getLstConductor <em>Lst Conductor</em>}</li>
 *   <li>{@link cootracir.domain.main1.impl.BusImpl#getId <em>Id</em>}</li>
 *   <li>{@link cootracir.domain.main1.impl.BusImpl#getNumeroPuestos <em>Numero Puestos</em>}</li>
 *   <li>{@link cootracir.domain.main1.impl.BusImpl#getEstado <em>Estado</em>}</li>
 *   <li>{@link cootracir.domain.main1.impl.BusImpl#getLstRuta <em>Lst Ruta</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BusImpl extends EObjectImpl implements Bus {
	/**
	 * The cached value of the '{@link #getLstConductor() <em>Lst Conductor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstConductor()
	 * @generated
	 * @ordered
	 */
	protected EList<Conductor> lstConductor;

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
	 * The default value of the '{@link #getNumeroPuestos() <em>Numero Puestos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroPuestos()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMERO_PUESTOS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumeroPuestos() <em>Numero Puestos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroPuestos()
	 * @generated
	 * @ordered
	 */
	protected String numeroPuestos = NUMERO_PUESTOS_EDEFAULT;

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
	 * The cached value of the '{@link #getLstRuta() <em>Lst Ruta</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstRuta()
	 * @generated
	 * @ordered
	 */
	protected EList<Ruta> lstRuta;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Main1Package.Literals.BUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Conductor> getLstConductor() {
		if (lstConductor == null) {
			lstConductor = new EObjectWithInverseResolvingEList.ManyInverse<Conductor>(Conductor.class, this, Main1Package.BUS__LST_CONDUCTOR, DomainPackage.CONDUCTOR__LST_BUS);
		}
		return lstConductor;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Main1Package.BUS__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumeroPuestos() {
		return numeroPuestos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroPuestos(String newNumeroPuestos) {
		String oldNumeroPuestos = numeroPuestos;
		numeroPuestos = newNumeroPuestos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Main1Package.BUS__NUMERO_PUESTOS, oldNumeroPuestos, numeroPuestos));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Main1Package.BUS__ESTADO, oldEstado, estado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ruta> getLstRuta() {
		if (lstRuta == null) {
			lstRuta = new EObjectWithInverseResolvingEList.ManyInverse<Ruta>(Ruta.class, this, Main1Package.BUS__LST_RUTA, Main1Package.RUTA__LST_BUS);
		}
		return lstRuta;
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
			case Main1Package.BUS__LST_CONDUCTOR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLstConductor()).basicAdd(otherEnd, msgs);
			case Main1Package.BUS__LST_RUTA:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLstRuta()).basicAdd(otherEnd, msgs);
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
			case Main1Package.BUS__LST_CONDUCTOR:
				return ((InternalEList<?>)getLstConductor()).basicRemove(otherEnd, msgs);
			case Main1Package.BUS__LST_RUTA:
				return ((InternalEList<?>)getLstRuta()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Main1Package.BUS__LST_CONDUCTOR:
				return getLstConductor();
			case Main1Package.BUS__ID:
				return getId();
			case Main1Package.BUS__NUMERO_PUESTOS:
				return getNumeroPuestos();
			case Main1Package.BUS__ESTADO:
				return getEstado();
			case Main1Package.BUS__LST_RUTA:
				return getLstRuta();
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
			case Main1Package.BUS__LST_CONDUCTOR:
				getLstConductor().clear();
				getLstConductor().addAll((Collection<? extends Conductor>)newValue);
				return;
			case Main1Package.BUS__ID:
				setId((String)newValue);
				return;
			case Main1Package.BUS__NUMERO_PUESTOS:
				setNumeroPuestos((String)newValue);
				return;
			case Main1Package.BUS__ESTADO:
				setEstado((String)newValue);
				return;
			case Main1Package.BUS__LST_RUTA:
				getLstRuta().clear();
				getLstRuta().addAll((Collection<? extends Ruta>)newValue);
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
			case Main1Package.BUS__LST_CONDUCTOR:
				getLstConductor().clear();
				return;
			case Main1Package.BUS__ID:
				setId(ID_EDEFAULT);
				return;
			case Main1Package.BUS__NUMERO_PUESTOS:
				setNumeroPuestos(NUMERO_PUESTOS_EDEFAULT);
				return;
			case Main1Package.BUS__ESTADO:
				setEstado(ESTADO_EDEFAULT);
				return;
			case Main1Package.BUS__LST_RUTA:
				getLstRuta().clear();
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
			case Main1Package.BUS__LST_CONDUCTOR:
				return lstConductor != null && !lstConductor.isEmpty();
			case Main1Package.BUS__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Main1Package.BUS__NUMERO_PUESTOS:
				return NUMERO_PUESTOS_EDEFAULT == null ? numeroPuestos != null : !NUMERO_PUESTOS_EDEFAULT.equals(numeroPuestos);
			case Main1Package.BUS__ESTADO:
				return ESTADO_EDEFAULT == null ? estado != null : !ESTADO_EDEFAULT.equals(estado);
			case Main1Package.BUS__LST_RUTA:
				return lstRuta != null && !lstRuta.isEmpty();
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
		result.append(", numeroPuestos: ");
		result.append(numeroPuestos);
		result.append(", estado: ");
		result.append(estado);
		result.append(')');
		return result.toString();
	}

} //BusImpl
