/**
 */
package cootracir.domain.main1.impl;

import cootracir.domain.Conductor;
import cootracir.domain.DomainPackage;

import cootracir.domain.main1.DetalleRegistro;
import cootracir.domain.main1.Main1Package;
import cootracir.domain.main1.Registrador;

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
 * An implementation of the model object '<em><b>Registrador</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cootracir.domain.main1.impl.RegistradorImpl#getLstConductor <em>Lst Conductor</em>}</li>
 *   <li>{@link cootracir.domain.main1.impl.RegistradorImpl#getId <em>Id</em>}</li>
 *   <li>{@link cootracir.domain.main1.impl.RegistradorImpl#getEstado <em>Estado</em>}</li>
 *   <li>{@link cootracir.domain.main1.impl.RegistradorImpl#getLstDetalleRegistro <em>Lst Detalle Registro</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegistradorImpl extends EObjectImpl implements Registrador {
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
	 * The cached value of the '{@link #getLstDetalleRegistro() <em>Lst Detalle Registro</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstDetalleRegistro()
	 * @generated
	 * @ordered
	 */
	protected EList<DetalleRegistro> lstDetalleRegistro;

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
		return Main1Package.Literals.REGISTRADOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Conductor> getLstConductor() {
		if (lstConductor == null) {
			lstConductor = new EObjectWithInverseResolvingEList.ManyInverse<Conductor>(Conductor.class, this, Main1Package.REGISTRADOR__LST_CONDUCTOR, DomainPackage.CONDUCTOR__LST_REGISTRADOR);
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
			eNotify(new ENotificationImpl(this, Notification.SET, Main1Package.REGISTRADOR__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Main1Package.REGISTRADOR__ESTADO, oldEstado, estado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DetalleRegistro> getLstDetalleRegistro() {
		if (lstDetalleRegistro == null) {
			lstDetalleRegistro = new EObjectWithInverseResolvingEList.ManyInverse<DetalleRegistro>(DetalleRegistro.class, this, Main1Package.REGISTRADOR__LST_DETALLE_REGISTRO, Main1Package.DETALLE_REGISTRO__LST_REGISTRADOR);
		}
		return lstDetalleRegistro;
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
			case Main1Package.REGISTRADOR__LST_CONDUCTOR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLstConductor()).basicAdd(otherEnd, msgs);
			case Main1Package.REGISTRADOR__LST_DETALLE_REGISTRO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLstDetalleRegistro()).basicAdd(otherEnd, msgs);
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
			case Main1Package.REGISTRADOR__LST_CONDUCTOR:
				return ((InternalEList<?>)getLstConductor()).basicRemove(otherEnd, msgs);
			case Main1Package.REGISTRADOR__LST_DETALLE_REGISTRO:
				return ((InternalEList<?>)getLstDetalleRegistro()).basicRemove(otherEnd, msgs);
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
			case Main1Package.REGISTRADOR__LST_CONDUCTOR:
				return getLstConductor();
			case Main1Package.REGISTRADOR__ID:
				return getId();
			case Main1Package.REGISTRADOR__ESTADO:
				return getEstado();
			case Main1Package.REGISTRADOR__LST_DETALLE_REGISTRO:
				return getLstDetalleRegistro();
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
			case Main1Package.REGISTRADOR__LST_CONDUCTOR:
				getLstConductor().clear();
				getLstConductor().addAll((Collection<? extends Conductor>)newValue);
				return;
			case Main1Package.REGISTRADOR__ID:
				setId((String)newValue);
				return;
			case Main1Package.REGISTRADOR__ESTADO:
				setEstado((String)newValue);
				return;
			case Main1Package.REGISTRADOR__LST_DETALLE_REGISTRO:
				getLstDetalleRegistro().clear();
				getLstDetalleRegistro().addAll((Collection<? extends DetalleRegistro>)newValue);
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
			case Main1Package.REGISTRADOR__LST_CONDUCTOR:
				getLstConductor().clear();
				return;
			case Main1Package.REGISTRADOR__ID:
				setId(ID_EDEFAULT);
				return;
			case Main1Package.REGISTRADOR__ESTADO:
				setEstado(ESTADO_EDEFAULT);
				return;
			case Main1Package.REGISTRADOR__LST_DETALLE_REGISTRO:
				getLstDetalleRegistro().clear();
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
			case Main1Package.REGISTRADOR__LST_CONDUCTOR:
				return lstConductor != null && !lstConductor.isEmpty();
			case Main1Package.REGISTRADOR__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Main1Package.REGISTRADOR__ESTADO:
				return ESTADO_EDEFAULT == null ? estado != null : !ESTADO_EDEFAULT.equals(estado);
			case Main1Package.REGISTRADOR__LST_DETALLE_REGISTRO:
				return lstDetalleRegistro != null && !lstDetalleRegistro.isEmpty();
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
