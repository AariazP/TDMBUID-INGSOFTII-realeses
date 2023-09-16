/**
 */
package cootracir.domain.main1.impl;

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
 * An implementation of the model object '<em><b>Ruta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cootracir.domain.main1.impl.RutaImpl#getPrecioRuta <em>Precio Ruta</em>}</li>
 *   <li>{@link cootracir.domain.main1.impl.RutaImpl#getId <em>Id</em>}</li>
 *   <li>{@link cootracir.domain.main1.impl.RutaImpl#getEstado <em>Estado</em>}</li>
 *   <li>{@link cootracir.domain.main1.impl.RutaImpl#getLstBus <em>Lst Bus</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RutaImpl extends EObjectImpl implements Ruta {
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
	 * The cached value of the '{@link #getLstBus() <em>Lst Bus</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstBus()
	 * @generated
	 * @ordered
	 */
	protected EList<Bus> lstBus;

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
		return Main1Package.Literals.RUTA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Main1Package.RUTA__PRECIO_RUTA, oldPrecioRuta, precioRuta));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Main1Package.RUTA__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Main1Package.RUTA__ESTADO, oldEstado, estado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Bus> getLstBus() {
		if (lstBus == null) {
			lstBus = new EObjectWithInverseResolvingEList.ManyInverse<Bus>(Bus.class, this, Main1Package.RUTA__LST_BUS, Main1Package.BUS__LST_RUTA);
		}
		return lstBus;
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
			case Main1Package.RUTA__LST_BUS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLstBus()).basicAdd(otherEnd, msgs);
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
			case Main1Package.RUTA__LST_BUS:
				return ((InternalEList<?>)getLstBus()).basicRemove(otherEnd, msgs);
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
			case Main1Package.RUTA__PRECIO_RUTA:
				return getPrecioRuta();
			case Main1Package.RUTA__ID:
				return getId();
			case Main1Package.RUTA__ESTADO:
				return getEstado();
			case Main1Package.RUTA__LST_BUS:
				return getLstBus();
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
			case Main1Package.RUTA__PRECIO_RUTA:
				setPrecioRuta((String)newValue);
				return;
			case Main1Package.RUTA__ID:
				setId((String)newValue);
				return;
			case Main1Package.RUTA__ESTADO:
				setEstado((String)newValue);
				return;
			case Main1Package.RUTA__LST_BUS:
				getLstBus().clear();
				getLstBus().addAll((Collection<? extends Bus>)newValue);
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
			case Main1Package.RUTA__PRECIO_RUTA:
				setPrecioRuta(PRECIO_RUTA_EDEFAULT);
				return;
			case Main1Package.RUTA__ID:
				setId(ID_EDEFAULT);
				return;
			case Main1Package.RUTA__ESTADO:
				setEstado(ESTADO_EDEFAULT);
				return;
			case Main1Package.RUTA__LST_BUS:
				getLstBus().clear();
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
			case Main1Package.RUTA__PRECIO_RUTA:
				return PRECIO_RUTA_EDEFAULT == null ? precioRuta != null : !PRECIO_RUTA_EDEFAULT.equals(precioRuta);
			case Main1Package.RUTA__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Main1Package.RUTA__ESTADO:
				return ESTADO_EDEFAULT == null ? estado != null : !ESTADO_EDEFAULT.equals(estado);
			case Main1Package.RUTA__LST_BUS:
				return lstBus != null && !lstBus.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //RutaImpl
