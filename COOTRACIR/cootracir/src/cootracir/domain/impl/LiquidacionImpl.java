/**
 */
package cootracir.domain.impl;

import cootracir.domain.Bus;
import cootracir.domain.Cajero;
import cootracir.domain.Conductor;
import cootracir.domain.DomainPackage;
import cootracir.domain.FactoryGestionInventario;
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
 * An implementation of the model object '<em><b>Liquidacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cootracir.domain.impl.LiquidacionImpl#getLstBus <em>Lst Bus</em>}</li>
 *   <li>{@link cootracir.domain.impl.LiquidacionImpl#getCajero <em>Cajero</em>}</li>
 *   <li>{@link cootracir.domain.impl.LiquidacionImpl#getConductor <em>Conductor</em>}</li>
 *   <li>{@link cootracir.domain.impl.LiquidacionImpl#getCostes <em>Costes</em>}</li>
 *   <li>{@link cootracir.domain.impl.LiquidacionImpl#getEstado <em>Estado</em>}</li>
 *   <li>{@link cootracir.domain.impl.LiquidacionImpl#getId <em>Id</em>}</li>
 *   <li>{@link cootracir.domain.impl.LiquidacionImpl#getValorLiquidacion <em>Valor Liquidacion</em>}</li>
 *   <li>{@link cootracir.domain.impl.LiquidacionImpl#getFactoryGestionInventario <em>Factory Gestion Inventario</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LiquidacionImpl extends EObjectImpl implements Liquidacion {
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
	 * The cached value of the '{@link #getCajero() <em>Cajero</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCajero()
	 * @generated
	 * @ordered
	 */
	protected Cajero cajero;

	/**
	 * The cached value of the '{@link #getConductor() <em>Conductor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConductor()
	 * @generated
	 * @ordered
	 */
	protected Conductor conductor;

	/**
	 * The default value of the '{@link #getCostes() <em>Costes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostes()
	 * @generated
	 * @ordered
	 */
	protected static final String COSTES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCostes() <em>Costes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostes()
	 * @generated
	 * @ordered
	 */
	protected String costes = COSTES_EDEFAULT;

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
	 * The default value of the '{@link #getValorLiquidacion() <em>Valor Liquidacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValorLiquidacion()
	 * @generated
	 * @ordered
	 */
	protected static final String VALOR_LIQUIDACION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValorLiquidacion() <em>Valor Liquidacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValorLiquidacion()
	 * @generated
	 * @ordered
	 */
	protected String valorLiquidacion = VALOR_LIQUIDACION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiquidacionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.LIQUIDACION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Bus> getLstBus() {
		if (lstBus == null) {
			lstBus = new EObjectWithInverseResolvingEList.ManyInverse<Bus>(Bus.class, this, DomainPackage.LIQUIDACION__LST_BUS, DomainPackage.BUS__LST_LIQUIDACION);
		}
		return lstBus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cajero getCajero() {
		if (cajero != null && cajero.eIsProxy()) {
			InternalEObject oldCajero = (InternalEObject)cajero;
			cajero = (Cajero)eResolveProxy(oldCajero);
			if (cajero != oldCajero) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.LIQUIDACION__CAJERO, oldCajero, cajero));
			}
		}
		return cajero;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cajero basicGetCajero() {
		return cajero;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCajero(Cajero newCajero, NotificationChain msgs) {
		Cajero oldCajero = cajero;
		cajero = newCajero;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.LIQUIDACION__CAJERO, oldCajero, newCajero);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCajero(Cajero newCajero) {
		if (newCajero != cajero) {
			NotificationChain msgs = null;
			if (cajero != null)
				msgs = ((InternalEObject)cajero).eInverseRemove(this, DomainPackage.CAJERO__LST_LIQUIDACIONES, Cajero.class, msgs);
			if (newCajero != null)
				msgs = ((InternalEObject)newCajero).eInverseAdd(this, DomainPackage.CAJERO__LST_LIQUIDACIONES, Cajero.class, msgs);
			msgs = basicSetCajero(newCajero, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.LIQUIDACION__CAJERO, newCajero, newCajero));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conductor getConductor() {
		if (conductor != null && conductor.eIsProxy()) {
			InternalEObject oldConductor = (InternalEObject)conductor;
			conductor = (Conductor)eResolveProxy(oldConductor);
			if (conductor != oldConductor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.LIQUIDACION__CONDUCTOR, oldConductor, conductor));
			}
		}
		return conductor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conductor basicGetConductor() {
		return conductor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConductor(Conductor newConductor, NotificationChain msgs) {
		Conductor oldConductor = conductor;
		conductor = newConductor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.LIQUIDACION__CONDUCTOR, oldConductor, newConductor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConductor(Conductor newConductor) {
		if (newConductor != conductor) {
			NotificationChain msgs = null;
			if (conductor != null)
				msgs = ((InternalEObject)conductor).eInverseRemove(this, DomainPackage.CONDUCTOR__LST_LIQUIDACIONES, Conductor.class, msgs);
			if (newConductor != null)
				msgs = ((InternalEObject)newConductor).eInverseAdd(this, DomainPackage.CONDUCTOR__LST_LIQUIDACIONES, Conductor.class, msgs);
			msgs = basicSetConductor(newConductor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.LIQUIDACION__CONDUCTOR, newConductor, newConductor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCostes() {
		return costes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCostes(String newCostes) {
		String oldCostes = costes;
		costes = newCostes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.LIQUIDACION__COSTES, oldCostes, costes));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.LIQUIDACION__ESTADO, oldEstado, estado));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.LIQUIDACION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValorLiquidacion() {
		return valorLiquidacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValorLiquidacion(String newValorLiquidacion) {
		String oldValorLiquidacion = valorLiquidacion;
		valorLiquidacion = newValorLiquidacion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.LIQUIDACION__VALOR_LIQUIDACION, oldValorLiquidacion, valorLiquidacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactoryGestionInventario getFactoryGestionInventario() {
		if (eContainerFeatureID() != DomainPackage.LIQUIDACION__FACTORY_GESTION_INVENTARIO) return null;
		return (FactoryGestionInventario)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFactoryGestionInventario(FactoryGestionInventario newFactoryGestionInventario, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newFactoryGestionInventario, DomainPackage.LIQUIDACION__FACTORY_GESTION_INVENTARIO, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFactoryGestionInventario(FactoryGestionInventario newFactoryGestionInventario) {
		if (newFactoryGestionInventario != eInternalContainer() || (eContainerFeatureID() != DomainPackage.LIQUIDACION__FACTORY_GESTION_INVENTARIO && newFactoryGestionInventario != null)) {
			if (EcoreUtil.isAncestor(this, newFactoryGestionInventario))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFactoryGestionInventario != null)
				msgs = ((InternalEObject)newFactoryGestionInventario).eInverseAdd(this, DomainPackage.FACTORY_GESTION_INVENTARIO__LST_LIQUIDACIONES, FactoryGestionInventario.class, msgs);
			msgs = basicSetFactoryGestionInventario(newFactoryGestionInventario, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.LIQUIDACION__FACTORY_GESTION_INVENTARIO, newFactoryGestionInventario, newFactoryGestionInventario));
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
			case DomainPackage.LIQUIDACION__LST_BUS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLstBus()).basicAdd(otherEnd, msgs);
			case DomainPackage.LIQUIDACION__CAJERO:
				if (cajero != null)
					msgs = ((InternalEObject)cajero).eInverseRemove(this, DomainPackage.CAJERO__LST_LIQUIDACIONES, Cajero.class, msgs);
				return basicSetCajero((Cajero)otherEnd, msgs);
			case DomainPackage.LIQUIDACION__CONDUCTOR:
				if (conductor != null)
					msgs = ((InternalEObject)conductor).eInverseRemove(this, DomainPackage.CONDUCTOR__LST_LIQUIDACIONES, Conductor.class, msgs);
				return basicSetConductor((Conductor)otherEnd, msgs);
			case DomainPackage.LIQUIDACION__FACTORY_GESTION_INVENTARIO:
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
			case DomainPackage.LIQUIDACION__LST_BUS:
				return ((InternalEList<?>)getLstBus()).basicRemove(otherEnd, msgs);
			case DomainPackage.LIQUIDACION__CAJERO:
				return basicSetCajero(null, msgs);
			case DomainPackage.LIQUIDACION__CONDUCTOR:
				return basicSetConductor(null, msgs);
			case DomainPackage.LIQUIDACION__FACTORY_GESTION_INVENTARIO:
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
			case DomainPackage.LIQUIDACION__FACTORY_GESTION_INVENTARIO:
				return eInternalContainer().eInverseRemove(this, DomainPackage.FACTORY_GESTION_INVENTARIO__LST_LIQUIDACIONES, FactoryGestionInventario.class, msgs);
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
			case DomainPackage.LIQUIDACION__LST_BUS:
				return getLstBus();
			case DomainPackage.LIQUIDACION__CAJERO:
				if (resolve) return getCajero();
				return basicGetCajero();
			case DomainPackage.LIQUIDACION__CONDUCTOR:
				if (resolve) return getConductor();
				return basicGetConductor();
			case DomainPackage.LIQUIDACION__COSTES:
				return getCostes();
			case DomainPackage.LIQUIDACION__ESTADO:
				return getEstado();
			case DomainPackage.LIQUIDACION__ID:
				return getId();
			case DomainPackage.LIQUIDACION__VALOR_LIQUIDACION:
				return getValorLiquidacion();
			case DomainPackage.LIQUIDACION__FACTORY_GESTION_INVENTARIO:
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
			case DomainPackage.LIQUIDACION__LST_BUS:
				getLstBus().clear();
				getLstBus().addAll((Collection<? extends Bus>)newValue);
				return;
			case DomainPackage.LIQUIDACION__CAJERO:
				setCajero((Cajero)newValue);
				return;
			case DomainPackage.LIQUIDACION__CONDUCTOR:
				setConductor((Conductor)newValue);
				return;
			case DomainPackage.LIQUIDACION__COSTES:
				setCostes((String)newValue);
				return;
			case DomainPackage.LIQUIDACION__ESTADO:
				setEstado((String)newValue);
				return;
			case DomainPackage.LIQUIDACION__ID:
				setId((String)newValue);
				return;
			case DomainPackage.LIQUIDACION__VALOR_LIQUIDACION:
				setValorLiquidacion((String)newValue);
				return;
			case DomainPackage.LIQUIDACION__FACTORY_GESTION_INVENTARIO:
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
			case DomainPackage.LIQUIDACION__LST_BUS:
				getLstBus().clear();
				return;
			case DomainPackage.LIQUIDACION__CAJERO:
				setCajero((Cajero)null);
				return;
			case DomainPackage.LIQUIDACION__CONDUCTOR:
				setConductor((Conductor)null);
				return;
			case DomainPackage.LIQUIDACION__COSTES:
				setCostes(COSTES_EDEFAULT);
				return;
			case DomainPackage.LIQUIDACION__ESTADO:
				setEstado(ESTADO_EDEFAULT);
				return;
			case DomainPackage.LIQUIDACION__ID:
				setId(ID_EDEFAULT);
				return;
			case DomainPackage.LIQUIDACION__VALOR_LIQUIDACION:
				setValorLiquidacion(VALOR_LIQUIDACION_EDEFAULT);
				return;
			case DomainPackage.LIQUIDACION__FACTORY_GESTION_INVENTARIO:
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
			case DomainPackage.LIQUIDACION__LST_BUS:
				return lstBus != null && !lstBus.isEmpty();
			case DomainPackage.LIQUIDACION__CAJERO:
				return cajero != null;
			case DomainPackage.LIQUIDACION__CONDUCTOR:
				return conductor != null;
			case DomainPackage.LIQUIDACION__COSTES:
				return COSTES_EDEFAULT == null ? costes != null : !COSTES_EDEFAULT.equals(costes);
			case DomainPackage.LIQUIDACION__ESTADO:
				return ESTADO_EDEFAULT == null ? estado != null : !ESTADO_EDEFAULT.equals(estado);
			case DomainPackage.LIQUIDACION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case DomainPackage.LIQUIDACION__VALOR_LIQUIDACION:
				return VALOR_LIQUIDACION_EDEFAULT == null ? valorLiquidacion != null : !VALOR_LIQUIDACION_EDEFAULT.equals(valorLiquidacion);
			case DomainPackage.LIQUIDACION__FACTORY_GESTION_INVENTARIO:
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
		result.append(" (costes: ");
		result.append(costes);
		result.append(", estado: ");
		result.append(estado);
		result.append(", id: ");
		result.append(id);
		result.append(", valorLiquidacion: ");
		result.append(valorLiquidacion);
		result.append(')');
		return result.toString();
	}

	public void addBus(Bus bus) {
		lstBus.add(bus);
	}

} //LiquidacionImpl
