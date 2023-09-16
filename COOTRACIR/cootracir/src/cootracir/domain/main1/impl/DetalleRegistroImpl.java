/**
 */
package cootracir.domain.main1.impl;

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
 * An implementation of the model object '<em><b>Detalle Registro</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cootracir.domain.main1.impl.DetalleRegistroImpl#getLstRegistrador <em>Lst Registrador</em>}</li>
 *   <li>{@link cootracir.domain.main1.impl.DetalleRegistroImpl#getLugar <em>Lugar</em>}</li>
 *   <li>{@link cootracir.domain.main1.impl.DetalleRegistroImpl#getHora <em>Hora</em>}</li>
 *   <li>{@link cootracir.domain.main1.impl.DetalleRegistroImpl#getIncidencias <em>Incidencias</em>}</li>
 *   <li>{@link cootracir.domain.main1.impl.DetalleRegistroImpl#getId <em>Id</em>}</li>
 *   <li>{@link cootracir.domain.main1.impl.DetalleRegistroImpl#getEstado <em>Estado</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DetalleRegistroImpl extends EObjectImpl implements DetalleRegistro {
	/**
	 * The cached value of the '{@link #getLstRegistrador() <em>Lst Registrador</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstRegistrador()
	 * @generated
	 * @ordered
	 */
	protected EList<Registrador> lstRegistrador;

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
	 * The default value of the '{@link #getIncidencias() <em>Incidencias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncidencias()
	 * @generated
	 * @ordered
	 */
	protected static final String INCIDENCIAS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIncidencias() <em>Incidencias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncidencias()
	 * @generated
	 * @ordered
	 */
	protected String incidencias = INCIDENCIAS_EDEFAULT;

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
		return Main1Package.Literals.DETALLE_REGISTRO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Registrador> getLstRegistrador() {
		if (lstRegistrador == null) {
			lstRegistrador = new EObjectWithInverseResolvingEList.ManyInverse<Registrador>(Registrador.class, this, Main1Package.DETALLE_REGISTRO__LST_REGISTRADOR, Main1Package.REGISTRADOR__LST_DETALLE_REGISTRO);
		}
		return lstRegistrador;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Main1Package.DETALLE_REGISTRO__LUGAR, oldLugar, lugar));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Main1Package.DETALLE_REGISTRO__HORA, oldHora, hora));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIncidencias() {
		return incidencias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncidencias(String newIncidencias) {
		String oldIncidencias = incidencias;
		incidencias = newIncidencias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Main1Package.DETALLE_REGISTRO__INCIDENCIAS, oldIncidencias, incidencias));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Main1Package.DETALLE_REGISTRO__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Main1Package.DETALLE_REGISTRO__ESTADO, oldEstado, estado));
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
			case Main1Package.DETALLE_REGISTRO__LST_REGISTRADOR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLstRegistrador()).basicAdd(otherEnd, msgs);
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
			case Main1Package.DETALLE_REGISTRO__LST_REGISTRADOR:
				return ((InternalEList<?>)getLstRegistrador()).basicRemove(otherEnd, msgs);
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
			case Main1Package.DETALLE_REGISTRO__LST_REGISTRADOR:
				return getLstRegistrador();
			case Main1Package.DETALLE_REGISTRO__LUGAR:
				return getLugar();
			case Main1Package.DETALLE_REGISTRO__HORA:
				return getHora();
			case Main1Package.DETALLE_REGISTRO__INCIDENCIAS:
				return getIncidencias();
			case Main1Package.DETALLE_REGISTRO__ID:
				return getId();
			case Main1Package.DETALLE_REGISTRO__ESTADO:
				return getEstado();
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
			case Main1Package.DETALLE_REGISTRO__LST_REGISTRADOR:
				getLstRegistrador().clear();
				getLstRegistrador().addAll((Collection<? extends Registrador>)newValue);
				return;
			case Main1Package.DETALLE_REGISTRO__LUGAR:
				setLugar((String)newValue);
				return;
			case Main1Package.DETALLE_REGISTRO__HORA:
				setHora((String)newValue);
				return;
			case Main1Package.DETALLE_REGISTRO__INCIDENCIAS:
				setIncidencias((String)newValue);
				return;
			case Main1Package.DETALLE_REGISTRO__ID:
				setId((String)newValue);
				return;
			case Main1Package.DETALLE_REGISTRO__ESTADO:
				setEstado((String)newValue);
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
			case Main1Package.DETALLE_REGISTRO__LST_REGISTRADOR:
				getLstRegistrador().clear();
				return;
			case Main1Package.DETALLE_REGISTRO__LUGAR:
				setLugar(LUGAR_EDEFAULT);
				return;
			case Main1Package.DETALLE_REGISTRO__HORA:
				setHora(HORA_EDEFAULT);
				return;
			case Main1Package.DETALLE_REGISTRO__INCIDENCIAS:
				setIncidencias(INCIDENCIAS_EDEFAULT);
				return;
			case Main1Package.DETALLE_REGISTRO__ID:
				setId(ID_EDEFAULT);
				return;
			case Main1Package.DETALLE_REGISTRO__ESTADO:
				setEstado(ESTADO_EDEFAULT);
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
			case Main1Package.DETALLE_REGISTRO__LST_REGISTRADOR:
				return lstRegistrador != null && !lstRegistrador.isEmpty();
			case Main1Package.DETALLE_REGISTRO__LUGAR:
				return LUGAR_EDEFAULT == null ? lugar != null : !LUGAR_EDEFAULT.equals(lugar);
			case Main1Package.DETALLE_REGISTRO__HORA:
				return HORA_EDEFAULT == null ? hora != null : !HORA_EDEFAULT.equals(hora);
			case Main1Package.DETALLE_REGISTRO__INCIDENCIAS:
				return INCIDENCIAS_EDEFAULT == null ? incidencias != null : !INCIDENCIAS_EDEFAULT.equals(incidencias);
			case Main1Package.DETALLE_REGISTRO__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Main1Package.DETALLE_REGISTRO__ESTADO:
				return ESTADO_EDEFAULT == null ? estado != null : !ESTADO_EDEFAULT.equals(estado);
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
		result.append(", incidencias: ");
		result.append(incidencias);
		result.append(", id: ");
		result.append(id);
		result.append(", estado: ");
		result.append(estado);
		result.append(')');
		return result.toString();
	}

} //DetalleRegistroImpl
