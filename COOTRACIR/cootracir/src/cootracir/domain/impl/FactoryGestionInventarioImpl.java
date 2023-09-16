/**
 */
package cootracir.domain.impl;

import cootracir.domain.Bus;
import cootracir.domain.DetalleRegistro;
import cootracir.domain.Domain;
import cootracir.domain.DomainPackage;
import cootracir.domain.FactoryGestionInventario;
import cootracir.domain.Liquidacion;
import cootracir.domain.Registrador;
import cootracir.domain.Ruta;

import java.util.Collection;
import java.util.HashMap;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Factory Gestion Inventario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cootracir.domain.impl.FactoryGestionInventarioImpl#getLstBuses <em>Lst Buses</em>}</li>
 *   <li>{@link cootracir.domain.impl.FactoryGestionInventarioImpl#getLstDetalleRegistro <em>Lst Detalle Registro</em>}</li>
 *   <li>{@link cootracir.domain.impl.FactoryGestionInventarioImpl#getId <em>Id</em>}</li>
 *   <li>{@link cootracir.domain.impl.FactoryGestionInventarioImpl#getEstado <em>Estado</em>}</li>
 *   <li>{@link cootracir.domain.impl.FactoryGestionInventarioImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link cootracir.domain.impl.FactoryGestionInventarioImpl#getLstLiquidaciones <em>Lst Liquidaciones</em>}</li>
 *   <li>{@link cootracir.domain.impl.FactoryGestionInventarioImpl#getLstRegistrador <em>Lst Registrador</em>}</li>
 *   <li>{@link cootracir.domain.impl.FactoryGestionInventarioImpl#getLstRuta <em>Lst Ruta</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FactoryGestionInventarioImpl extends EObjectImpl implements FactoryGestionInventario {
	/**
	 * The cached value of the '{@link #getLstBuses() <em>Lst Buses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstBuses()
	 * @generated
	 * @ordered
	 */
	protected EList<Bus> lstBuses;

	/**
	 * The cached value of the '{@link #getLstDetalleRegistro() <em>Lst Detalle Registro</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstDetalleRegistro()
	 * @generated
	 * @ordered
	 */
	protected EList<DetalleRegistro> lstDetalleRegistro;

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
	 * The cached value of the '{@link #getLstLiquidaciones() <em>Lst Liquidaciones</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstLiquidaciones()
	 * @generated
	 * @ordered
	 */
	protected EList<Liquidacion> lstLiquidaciones;

	/**
	 * The cached value of the '{@link #getLstRegistrador() <em>Lst Registrador</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstRegistrador()
	 * @generated
	 * @ordered
	 */
	protected EList<Registrador> lstRegistrador;

	/**
	 * The cached value of the '{@link #getLstRuta() <em>Lst Ruta</em>}' containment reference list.
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
	
	protected HashMap<String, Double> precioRutas;
	
	protected FactoryGestionInventarioImpl() {
		
		super();
		precioRutas = new HashMap<>();
		cargarRutas();
	}

	private void cargarRutas() {
		precioRutas.put("ARMENIA-CIRCASIA", 3200.0);
		precioRutas.put("CIRCASIA-CIRCASIA", 1000.0);
		precioRutas.put("ARMENIA-SALENTO", 5900.0);
		precioRutas.put("ARMENIA-FILANDIA", 5900.0);
		precioRutas.put("ARMENIA-VARIANTE", 3500.0);
		precioRutas.put("ARMENIA-CRUCES", 4100.0);
		precioRutas.put("CIRCASIA-VARIANTE", 2500.0);
		precioRutas.put("CIRCASIA-CRUCES", 3000.0);
		precioRutas.put("CIRCASIA-FILANDIA", 4100.0);
		precioRutas.put("VARIANTE-VARIANTE", 2200.0);
		precioRutas.put("VARIANTE-CRUCES", 3500.0);
		precioRutas.put("VARIANTE-FILANDIA", 3500.0);
		precioRutas.put("CRUCES-CRUCES", 2000.0);
		precioRutas.put("CRUCES-FILANDIA", 2500.0);
		precioRutas.put("FILANDIA-FILANDIA", 1000.0);
		precioRutas.put("ARMENIA-ARMENIA", 3200.0);
		precioRutas.put("ARMENIA-BOQUIA", 4200.0);
		precioRutas.put("CIRCASIA-BOQUIA", 3000.0);
		precioRutas.put("CIRCASIA-SALENTO", 4000.0);
		precioRutas.put("VARIANTE-BOQUIA", 2200.0);
		precioRutas.put("VARIANTE-SALENTO", 3100.0);
		precioRutas.put("BOQUIA-BOQUIA", 1700.0);
		precioRutas.put("SALENTO-SALENTO", 1700.0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.FACTORY_GESTION_INVENTARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Bus> getLstBuses() {
		if (lstBuses == null) {
			lstBuses = new EObjectContainmentWithInverseEList<Bus>(Bus.class, this, DomainPackage.FACTORY_GESTION_INVENTARIO__LST_BUSES, DomainPackage.BUS__FACTORY_GESTION_INVENTARIO);
		}
		return lstBuses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DetalleRegistro> getLstDetalleRegistro() {
		if (lstDetalleRegistro == null) {
			lstDetalleRegistro = new EObjectContainmentWithInverseEList<DetalleRegistro>(DetalleRegistro.class, this, DomainPackage.FACTORY_GESTION_INVENTARIO__LST_DETALLE_REGISTRO, DomainPackage.DETALLE_REGISTRO__FACTORY_GESTION_INVENTARIO);
		}
		return lstDetalleRegistro;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.FACTORY_GESTION_INVENTARIO__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.FACTORY_GESTION_INVENTARIO__ESTADO, oldEstado, estado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain getDomain() {
		if (eContainerFeatureID() != DomainPackage.FACTORY_GESTION_INVENTARIO__DOMAIN) return null;
		return (Domain)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomain(Domain newDomain, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDomain, DomainPackage.FACTORY_GESTION_INVENTARIO__DOMAIN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomain(Domain newDomain) {
		if (newDomain != eInternalContainer() || (eContainerFeatureID() != DomainPackage.FACTORY_GESTION_INVENTARIO__DOMAIN && newDomain != null)) {
			if (EcoreUtil.isAncestor(this, newDomain))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDomain != null)
				msgs = ((InternalEObject)newDomain).eInverseAdd(this, DomainPackage.DOMAIN__FACTORY_GESTION_INVENTARIO, Domain.class, msgs);
			msgs = basicSetDomain(newDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.FACTORY_GESTION_INVENTARIO__DOMAIN, newDomain, newDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Liquidacion> getLstLiquidaciones() {
		if (lstLiquidaciones == null) {
			lstLiquidaciones = new EObjectContainmentWithInverseEList<Liquidacion>(Liquidacion.class, this, DomainPackage.FACTORY_GESTION_INVENTARIO__LST_LIQUIDACIONES, DomainPackage.LIQUIDACION__FACTORY_GESTION_INVENTARIO);
		}
		return lstLiquidaciones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Registrador> getLstRegistrador() {
		if (lstRegistrador == null) {
			lstRegistrador = new EObjectContainmentWithInverseEList<Registrador>(Registrador.class, this, DomainPackage.FACTORY_GESTION_INVENTARIO__LST_REGISTRADOR, DomainPackage.REGISTRADOR__FACTORY_GESTION_INVENTARIO);
		}
		return lstRegistrador;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ruta> getLstRuta() {
		if (lstRuta == null) {
			lstRuta = new EObjectContainmentWithInverseEList<Ruta>(Ruta.class, this, DomainPackage.FACTORY_GESTION_INVENTARIO__LST_RUTA, DomainPackage.RUTA__FACTORY_GESTION_INVENTARIO);
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
			case DomainPackage.FACTORY_GESTION_INVENTARIO__LST_BUSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLstBuses()).basicAdd(otherEnd, msgs);
			case DomainPackage.FACTORY_GESTION_INVENTARIO__LST_DETALLE_REGISTRO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLstDetalleRegistro()).basicAdd(otherEnd, msgs);
			case DomainPackage.FACTORY_GESTION_INVENTARIO__DOMAIN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDomain((Domain)otherEnd, msgs);
			case DomainPackage.FACTORY_GESTION_INVENTARIO__LST_LIQUIDACIONES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLstLiquidaciones()).basicAdd(otherEnd, msgs);
			case DomainPackage.FACTORY_GESTION_INVENTARIO__LST_REGISTRADOR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLstRegistrador()).basicAdd(otherEnd, msgs);
			case DomainPackage.FACTORY_GESTION_INVENTARIO__LST_RUTA:
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
			case DomainPackage.FACTORY_GESTION_INVENTARIO__LST_BUSES:
				return ((InternalEList<?>)getLstBuses()).basicRemove(otherEnd, msgs);
			case DomainPackage.FACTORY_GESTION_INVENTARIO__LST_DETALLE_REGISTRO:
				return ((InternalEList<?>)getLstDetalleRegistro()).basicRemove(otherEnd, msgs);
			case DomainPackage.FACTORY_GESTION_INVENTARIO__DOMAIN:
				return basicSetDomain(null, msgs);
			case DomainPackage.FACTORY_GESTION_INVENTARIO__LST_LIQUIDACIONES:
				return ((InternalEList<?>)getLstLiquidaciones()).basicRemove(otherEnd, msgs);
			case DomainPackage.FACTORY_GESTION_INVENTARIO__LST_REGISTRADOR:
				return ((InternalEList<?>)getLstRegistrador()).basicRemove(otherEnd, msgs);
			case DomainPackage.FACTORY_GESTION_INVENTARIO__LST_RUTA:
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
			case DomainPackage.FACTORY_GESTION_INVENTARIO__DOMAIN:
				return eInternalContainer().eInverseRemove(this, DomainPackage.DOMAIN__FACTORY_GESTION_INVENTARIO, Domain.class, msgs);
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
			case DomainPackage.FACTORY_GESTION_INVENTARIO__LST_BUSES:
				return getLstBuses();
			case DomainPackage.FACTORY_GESTION_INVENTARIO__LST_DETALLE_REGISTRO:
				return getLstDetalleRegistro();
			case DomainPackage.FACTORY_GESTION_INVENTARIO__ID:
				return getId();
			case DomainPackage.FACTORY_GESTION_INVENTARIO__ESTADO:
				return getEstado();
			case DomainPackage.FACTORY_GESTION_INVENTARIO__DOMAIN:
				return getDomain();
			case DomainPackage.FACTORY_GESTION_INVENTARIO__LST_LIQUIDACIONES:
				return getLstLiquidaciones();
			case DomainPackage.FACTORY_GESTION_INVENTARIO__LST_REGISTRADOR:
				return getLstRegistrador();
			case DomainPackage.FACTORY_GESTION_INVENTARIO__LST_RUTA:
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
			case DomainPackage.FACTORY_GESTION_INVENTARIO__LST_BUSES:
				getLstBuses().clear();
				getLstBuses().addAll((Collection<? extends Bus>)newValue);
				return;
			case DomainPackage.FACTORY_GESTION_INVENTARIO__LST_DETALLE_REGISTRO:
				getLstDetalleRegistro().clear();
				getLstDetalleRegistro().addAll((Collection<? extends DetalleRegistro>)newValue);
				return;
			case DomainPackage.FACTORY_GESTION_INVENTARIO__ID:
				setId((String)newValue);
				return;
			case DomainPackage.FACTORY_GESTION_INVENTARIO__ESTADO:
				setEstado((String)newValue);
				return;
			case DomainPackage.FACTORY_GESTION_INVENTARIO__DOMAIN:
				setDomain((Domain)newValue);
				return;
			case DomainPackage.FACTORY_GESTION_INVENTARIO__LST_LIQUIDACIONES:
				getLstLiquidaciones().clear();
				getLstLiquidaciones().addAll((Collection<? extends Liquidacion>)newValue);
				return;
			case DomainPackage.FACTORY_GESTION_INVENTARIO__LST_REGISTRADOR:
				getLstRegistrador().clear();
				getLstRegistrador().addAll((Collection<? extends Registrador>)newValue);
				return;
			case DomainPackage.FACTORY_GESTION_INVENTARIO__LST_RUTA:
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
			case DomainPackage.FACTORY_GESTION_INVENTARIO__LST_BUSES:
				getLstBuses().clear();
				return;
			case DomainPackage.FACTORY_GESTION_INVENTARIO__LST_DETALLE_REGISTRO:
				getLstDetalleRegistro().clear();
				return;
			case DomainPackage.FACTORY_GESTION_INVENTARIO__ID:
				setId(ID_EDEFAULT);
				return;
			case DomainPackage.FACTORY_GESTION_INVENTARIO__ESTADO:
				setEstado(ESTADO_EDEFAULT);
				return;
			case DomainPackage.FACTORY_GESTION_INVENTARIO__DOMAIN:
				setDomain((Domain)null);
				return;
			case DomainPackage.FACTORY_GESTION_INVENTARIO__LST_LIQUIDACIONES:
				getLstLiquidaciones().clear();
				return;
			case DomainPackage.FACTORY_GESTION_INVENTARIO__LST_REGISTRADOR:
				getLstRegistrador().clear();
				return;
			case DomainPackage.FACTORY_GESTION_INVENTARIO__LST_RUTA:
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
			case DomainPackage.FACTORY_GESTION_INVENTARIO__LST_BUSES:
				return lstBuses != null && !lstBuses.isEmpty();
			case DomainPackage.FACTORY_GESTION_INVENTARIO__LST_DETALLE_REGISTRO:
				return lstDetalleRegistro != null && !lstDetalleRegistro.isEmpty();
			case DomainPackage.FACTORY_GESTION_INVENTARIO__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case DomainPackage.FACTORY_GESTION_INVENTARIO__ESTADO:
				return ESTADO_EDEFAULT == null ? estado != null : !ESTADO_EDEFAULT.equals(estado);
			case DomainPackage.FACTORY_GESTION_INVENTARIO__DOMAIN:
				return getDomain() != null;
			case DomainPackage.FACTORY_GESTION_INVENTARIO__LST_LIQUIDACIONES:
				return lstLiquidaciones != null && !lstLiquidaciones.isEmpty();
			case DomainPackage.FACTORY_GESTION_INVENTARIO__LST_REGISTRADOR:
				return lstRegistrador != null && !lstRegistrador.isEmpty();
			case DomainPackage.FACTORY_GESTION_INVENTARIO__LST_RUTA:
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
		result.append(')');
		return result.toString();
	}
	

	@Override
	public void addLiquidacion(LiquidacionImpl liquidacionImpl) {
		getLstLiquidaciones().add(liquidacionImpl);
		
	}

	@Override
	public double getPromedio() {
	double promedio = 0;
		
		for(Liquidacion l :getLstLiquidaciones() ) {
			
			
			if(l != null) promedio += Double.parseDouble(l.getValorLiquidacion());
		}
		
		if (promedio == 0) return 0;
		
		
		return promedio/lstLiquidaciones.size();
	}

	@Override
	public double calcularLiquidacion(ConductorImpl conductorImpl) {
		
		double valorLiquidacion = 0;
		
		
		EList<DetalleRegistro> registros = conductorImpl.getBus().getLstRuta().get(0).getLstDetalleRegistro();
		
		for(DetalleRegistro detalle: registros) {
			
			valorLiquidacion += precioRutas.get(detalle.getLugar());
			
		}
		
		return valorLiquidacion;
		
	}

	@Override
	public HashMap<String, Double> getListaRutas() {
		return precioRutas;
	}


} //FactoryGestionInventarioImpl
