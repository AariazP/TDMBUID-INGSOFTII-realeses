/**
 */
package cootracir.domain.impl;

import cootracir.domain.Bus;
import cootracir.domain.Conductor;
import cootracir.domain.DomainPackage;
import cootracir.domain.FactoryGestionInventario;
import cootracir.domain.Liquidacion;
import cootracir.domain.Registrador;
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
 * An implementation of the model object '<em><b>Bus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cootracir.domain.impl.BusImpl#getId <em>Id</em>}</li>
 *   <li>{@link cootracir.domain.impl.BusImpl#getEstado <em>Estado</em>}</li>
 *   <li>{@link cootracir.domain.impl.BusImpl#getNumeroPuestos <em>Numero Puestos</em>}</li>
 *   <li>{@link cootracir.domain.impl.BusImpl#getFactoryGestionInventario <em>Factory Gestion Inventario</em>}</li>
 *   <li>{@link cootracir.domain.impl.BusImpl#getLstLiquidacion <em>Lst Liquidacion</em>}</li>
 *   <li>{@link cootracir.domain.impl.BusImpl#getConductor <em>Conductor</em>}</li>
 *   <li>{@link cootracir.domain.impl.BusImpl#getRegistrador <em>Registrador</em>}</li>
 *   <li>{@link cootracir.domain.impl.BusImpl#getLstRuta <em>Lst Ruta</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BusImpl extends EObjectImpl implements Bus {
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
	 * The cached value of the '{@link #getLstLiquidacion() <em>Lst Liquidacion</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstLiquidacion()
	 * @generated
	 * @ordered
	 */
	protected EList<Liquidacion> lstLiquidacion;

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
	 * The cached value of the '{@link #getRegistrador() <em>Registrador</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistrador()
	 * @generated
	 * @ordered
	 */
	protected Registrador registrador;

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
		return DomainPackage.Literals.BUS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.BUS__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.BUS__ESTADO, oldEstado, estado));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.BUS__NUMERO_PUESTOS, oldNumeroPuestos, numeroPuestos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactoryGestionInventario getFactoryGestionInventario() {
		if (eContainerFeatureID() != DomainPackage.BUS__FACTORY_GESTION_INVENTARIO) return null;
		return (FactoryGestionInventario)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFactoryGestionInventario(FactoryGestionInventario newFactoryGestionInventario, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newFactoryGestionInventario, DomainPackage.BUS__FACTORY_GESTION_INVENTARIO, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFactoryGestionInventario(FactoryGestionInventario newFactoryGestionInventario) {
		if (newFactoryGestionInventario != eInternalContainer() || (eContainerFeatureID() != DomainPackage.BUS__FACTORY_GESTION_INVENTARIO && newFactoryGestionInventario != null)) {
			if (EcoreUtil.isAncestor(this, newFactoryGestionInventario))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFactoryGestionInventario != null)
				msgs = ((InternalEObject)newFactoryGestionInventario).eInverseAdd(this, DomainPackage.FACTORY_GESTION_INVENTARIO__LST_BUSES, FactoryGestionInventario.class, msgs);
			msgs = basicSetFactoryGestionInventario(newFactoryGestionInventario, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.BUS__FACTORY_GESTION_INVENTARIO, newFactoryGestionInventario, newFactoryGestionInventario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Liquidacion> getLstLiquidacion() {
		if (lstLiquidacion == null) {
			lstLiquidacion = new EObjectWithInverseResolvingEList.ManyInverse<Liquidacion>(Liquidacion.class, this, DomainPackage.BUS__LST_LIQUIDACION, DomainPackage.LIQUIDACION__LST_BUS);
		}
		return lstLiquidacion;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.BUS__CONDUCTOR, oldConductor, conductor));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.BUS__CONDUCTOR, oldConductor, newConductor);
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
				msgs = ((InternalEObject)conductor).eInverseRemove(this, DomainPackage.CONDUCTOR__BUS, Conductor.class, msgs);
			if (newConductor != null)
				msgs = ((InternalEObject)newConductor).eInverseAdd(this, DomainPackage.CONDUCTOR__BUS, Conductor.class, msgs);
			msgs = basicSetConductor(newConductor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.BUS__CONDUCTOR, newConductor, newConductor));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.BUS__REGISTRADOR, oldRegistrador, registrador));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.BUS__REGISTRADOR, oldRegistrador, newRegistrador);
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
				msgs = ((InternalEObject)registrador).eInverseRemove(this, DomainPackage.REGISTRADOR__BUS, Registrador.class, msgs);
			if (newRegistrador != null)
				msgs = ((InternalEObject)newRegistrador).eInverseAdd(this, DomainPackage.REGISTRADOR__BUS, Registrador.class, msgs);
			msgs = basicSetRegistrador(newRegistrador, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.BUS__REGISTRADOR, newRegistrador, newRegistrador));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ruta> getLstRuta() {
		if (lstRuta == null) {
			lstRuta = new EObjectWithInverseResolvingEList<Ruta>(Ruta.class, this, DomainPackage.BUS__LST_RUTA, DomainPackage.RUTA__BUS);
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
			case DomainPackage.BUS__FACTORY_GESTION_INVENTARIO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetFactoryGestionInventario((FactoryGestionInventario)otherEnd, msgs);
			case DomainPackage.BUS__LST_LIQUIDACION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLstLiquidacion()).basicAdd(otherEnd, msgs);
			case DomainPackage.BUS__CONDUCTOR:
				if (conductor != null)
					msgs = ((InternalEObject)conductor).eInverseRemove(this, DomainPackage.CONDUCTOR__BUS, Conductor.class, msgs);
				return basicSetConductor((Conductor)otherEnd, msgs);
			case DomainPackage.BUS__REGISTRADOR:
				if (registrador != null)
					msgs = ((InternalEObject)registrador).eInverseRemove(this, DomainPackage.REGISTRADOR__BUS, Registrador.class, msgs);
				return basicSetRegistrador((Registrador)otherEnd, msgs);
			case DomainPackage.BUS__LST_RUTA:
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
			case DomainPackage.BUS__FACTORY_GESTION_INVENTARIO:
				return basicSetFactoryGestionInventario(null, msgs);
			case DomainPackage.BUS__LST_LIQUIDACION:
				return ((InternalEList<?>)getLstLiquidacion()).basicRemove(otherEnd, msgs);
			case DomainPackage.BUS__CONDUCTOR:
				return basicSetConductor(null, msgs);
			case DomainPackage.BUS__REGISTRADOR:
				return basicSetRegistrador(null, msgs);
			case DomainPackage.BUS__LST_RUTA:
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case DomainPackage.BUS__FACTORY_GESTION_INVENTARIO:
				return eInternalContainer().eInverseRemove(this, DomainPackage.FACTORY_GESTION_INVENTARIO__LST_BUSES, FactoryGestionInventario.class, msgs);
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
			case DomainPackage.BUS__ID:
				return getId();
			case DomainPackage.BUS__ESTADO:
				return getEstado();
			case DomainPackage.BUS__NUMERO_PUESTOS:
				return getNumeroPuestos();
			case DomainPackage.BUS__FACTORY_GESTION_INVENTARIO:
				return getFactoryGestionInventario();
			case DomainPackage.BUS__LST_LIQUIDACION:
				return getLstLiquidacion();
			case DomainPackage.BUS__CONDUCTOR:
				if (resolve) return getConductor();
				return basicGetConductor();
			case DomainPackage.BUS__REGISTRADOR:
				if (resolve) return getRegistrador();
				return basicGetRegistrador();
			case DomainPackage.BUS__LST_RUTA:
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
			case DomainPackage.BUS__ID:
				setId((String)newValue);
				return;
			case DomainPackage.BUS__ESTADO:
				setEstado((String)newValue);
				return;
			case DomainPackage.BUS__NUMERO_PUESTOS:
				setNumeroPuestos((String)newValue);
				return;
			case DomainPackage.BUS__FACTORY_GESTION_INVENTARIO:
				setFactoryGestionInventario((FactoryGestionInventario)newValue);
				return;
			case DomainPackage.BUS__LST_LIQUIDACION:
				getLstLiquidacion().clear();
				getLstLiquidacion().addAll((Collection<? extends Liquidacion>)newValue);
				return;
			case DomainPackage.BUS__CONDUCTOR:
				setConductor((Conductor)newValue);
				return;
			case DomainPackage.BUS__REGISTRADOR:
				setRegistrador((Registrador)newValue);
				return;
			case DomainPackage.BUS__LST_RUTA:
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
			case DomainPackage.BUS__ID:
				setId(ID_EDEFAULT);
				return;
			case DomainPackage.BUS__ESTADO:
				setEstado(ESTADO_EDEFAULT);
				return;
			case DomainPackage.BUS__NUMERO_PUESTOS:
				setNumeroPuestos(NUMERO_PUESTOS_EDEFAULT);
				return;
			case DomainPackage.BUS__FACTORY_GESTION_INVENTARIO:
				setFactoryGestionInventario((FactoryGestionInventario)null);
				return;
			case DomainPackage.BUS__LST_LIQUIDACION:
				getLstLiquidacion().clear();
				return;
			case DomainPackage.BUS__CONDUCTOR:
				setConductor((Conductor)null);
				return;
			case DomainPackage.BUS__REGISTRADOR:
				setRegistrador((Registrador)null);
				return;
			case DomainPackage.BUS__LST_RUTA:
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
			case DomainPackage.BUS__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case DomainPackage.BUS__ESTADO:
				return ESTADO_EDEFAULT == null ? estado != null : !ESTADO_EDEFAULT.equals(estado);
			case DomainPackage.BUS__NUMERO_PUESTOS:
				return NUMERO_PUESTOS_EDEFAULT == null ? numeroPuestos != null : !NUMERO_PUESTOS_EDEFAULT.equals(numeroPuestos);
			case DomainPackage.BUS__FACTORY_GESTION_INVENTARIO:
				return getFactoryGestionInventario() != null;
			case DomainPackage.BUS__LST_LIQUIDACION:
				return lstLiquidacion != null && !lstLiquidacion.isEmpty();
			case DomainPackage.BUS__CONDUCTOR:
				return conductor != null;
			case DomainPackage.BUS__REGISTRADOR:
				return registrador != null;
			case DomainPackage.BUS__LST_RUTA:
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
		result.append(", estado: ");
		result.append(estado);
		result.append(", numeroPuestos: ");
		result.append(numeroPuestos);
		result.append(')');
		return result.toString();
	}
	
	@Override
	public void addLiquidacion(LiquidacionImpl liquidacionImpl) {
		getLstLiquidacion().add(liquidacionImpl);
	}

} //BusImpl
