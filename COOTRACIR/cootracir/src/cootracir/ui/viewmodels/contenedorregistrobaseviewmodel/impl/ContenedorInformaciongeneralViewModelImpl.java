/**
 */
package cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl;

import cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorInformaciongeneralViewModel;
import cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorRegistroBaseViewModel;
import cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelPackage;

import cootracir.ui.viewmodels.impl.ViewModelImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contenedor Informaciongeneral View Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.ContenedorInformaciongeneralViewModelImpl#getOwnedByContenedorRegistroBaseViewModelTheInformaciongeneral <em>Owned By Contenedor Registro Base View Model The Informaciongeneral</em>}</li>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.ContenedorInformaciongeneralViewModelImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.ContenedorInformaciongeneralViewModelImpl#getHora <em>Hora</em>}</li>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.ContenedorInformaciongeneralViewModelImpl#getRuta <em>Ruta</em>}</li>
 *   <li>{@link cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.ContenedorInformaciongeneralViewModelImpl#getFecha <em>Fecha</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContenedorInformaciongeneralViewModelImpl extends ViewModelImpl implements ContenedorInformaciongeneralViewModel {
	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = " ";

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
	 * The default value of the '{@link #getHora() <em>Hora</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHora()
	 * @generated
	 * @ordered
	 */
	protected static final String HORA_EDEFAULT = " ";

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
	 * The default value of the '{@link #getRuta() <em>Ruta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuta()
	 * @generated
	 * @ordered
	 */
	protected static final String RUTA_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getRuta() <em>Ruta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuta()
	 * @generated
	 * @ordered
	 */
	protected String ruta = RUTA_EDEFAULT;

	/**
	 * The default value of the '{@link #getFecha() <em>Fecha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFecha()
	 * @generated
	 * @ordered
	 */
	protected static final String FECHA_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getFecha() <em>Fecha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFecha()
	 * @generated
	 * @ordered
	 */
	protected String fecha = FECHA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContenedorInformaciongeneralViewModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContenedorregistrobaseviewmodelPackage.Literals.CONTENEDOR_INFORMACIONGENERAL_VIEW_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorRegistroBaseViewModel getOwnedByContenedorRegistroBaseViewModelTheInformaciongeneral() {
		if (eContainerFeatureID() != ContenedorregistrobaseviewmodelPackage.CONTENEDOR_INFORMACIONGENERAL_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_THE_INFORMACIONGENERAL) return null;
		return (ContenedorRegistroBaseViewModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByContenedorRegistroBaseViewModelTheInformaciongeneral(ContenedorRegistroBaseViewModel newOwnedByContenedorRegistroBaseViewModelTheInformaciongeneral, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnedByContenedorRegistroBaseViewModelTheInformaciongeneral, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_INFORMACIONGENERAL_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_THE_INFORMACIONGENERAL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedByContenedorRegistroBaseViewModelTheInformaciongeneral(ContenedorRegistroBaseViewModel newOwnedByContenedorRegistroBaseViewModelTheInformaciongeneral) {
		if (newOwnedByContenedorRegistroBaseViewModelTheInformaciongeneral != eInternalContainer() || (eContainerFeatureID() != ContenedorregistrobaseviewmodelPackage.CONTENEDOR_INFORMACIONGENERAL_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_THE_INFORMACIONGENERAL && newOwnedByContenedorRegistroBaseViewModelTheInformaciongeneral != null)) {
			if (EcoreUtil.isAncestor(this, newOwnedByContenedorRegistroBaseViewModelTheInformaciongeneral))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByContenedorRegistroBaseViewModelTheInformaciongeneral != null)
				msgs = ((InternalEObject)newOwnedByContenedorRegistroBaseViewModelTheInformaciongeneral).eInverseAdd(this, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__THE_INFORMACIONGENERAL, ContenedorRegistroBaseViewModel.class, msgs);
			msgs = basicSetOwnedByContenedorRegistroBaseViewModelTheInformaciongeneral(newOwnedByContenedorRegistroBaseViewModelTheInformaciongeneral, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_INFORMACIONGENERAL_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_THE_INFORMACIONGENERAL, newOwnedByContenedorRegistroBaseViewModelTheInformaciongeneral, newOwnedByContenedorRegistroBaseViewModelTheInformaciongeneral));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_INFORMACIONGENERAL_VIEW_MODEL__NOMBRE, oldNombre, nombre));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_INFORMACIONGENERAL_VIEW_MODEL__HORA, oldHora, hora));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRuta() {
		return ruta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuta(String newRuta) {
		String oldRuta = ruta;
		ruta = newRuta;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_INFORMACIONGENERAL_VIEW_MODEL__RUTA, oldRuta, ruta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFecha() {
		return fecha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFecha(String newFecha) {
		String oldFecha = fecha;
		fecha = newFecha;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_INFORMACIONGENERAL_VIEW_MODEL__FECHA, oldFecha, fecha));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_INFORMACIONGENERAL_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_THE_INFORMACIONGENERAL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByContenedorRegistroBaseViewModelTheInformaciongeneral((ContenedorRegistroBaseViewModel)otherEnd, msgs);
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
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_INFORMACIONGENERAL_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_THE_INFORMACIONGENERAL:
				return basicSetOwnedByContenedorRegistroBaseViewModelTheInformaciongeneral(null, msgs);
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
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_INFORMACIONGENERAL_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_THE_INFORMACIONGENERAL:
				return eInternalContainer().eInverseRemove(this, ContenedorregistrobaseviewmodelPackage.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__THE_INFORMACIONGENERAL, ContenedorRegistroBaseViewModel.class, msgs);
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
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_INFORMACIONGENERAL_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_THE_INFORMACIONGENERAL:
				return getOwnedByContenedorRegistroBaseViewModelTheInformaciongeneral();
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_INFORMACIONGENERAL_VIEW_MODEL__NOMBRE:
				return getNombre();
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_INFORMACIONGENERAL_VIEW_MODEL__HORA:
				return getHora();
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_INFORMACIONGENERAL_VIEW_MODEL__RUTA:
				return getRuta();
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_INFORMACIONGENERAL_VIEW_MODEL__FECHA:
				return getFecha();
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
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_INFORMACIONGENERAL_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_THE_INFORMACIONGENERAL:
				setOwnedByContenedorRegistroBaseViewModelTheInformaciongeneral((ContenedorRegistroBaseViewModel)newValue);
				return;
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_INFORMACIONGENERAL_VIEW_MODEL__NOMBRE:
				setNombre((String)newValue);
				return;
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_INFORMACIONGENERAL_VIEW_MODEL__HORA:
				setHora((String)newValue);
				return;
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_INFORMACIONGENERAL_VIEW_MODEL__RUTA:
				setRuta((String)newValue);
				return;
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_INFORMACIONGENERAL_VIEW_MODEL__FECHA:
				setFecha((String)newValue);
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
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_INFORMACIONGENERAL_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_THE_INFORMACIONGENERAL:
				setOwnedByContenedorRegistroBaseViewModelTheInformaciongeneral((ContenedorRegistroBaseViewModel)null);
				return;
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_INFORMACIONGENERAL_VIEW_MODEL__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_INFORMACIONGENERAL_VIEW_MODEL__HORA:
				setHora(HORA_EDEFAULT);
				return;
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_INFORMACIONGENERAL_VIEW_MODEL__RUTA:
				setRuta(RUTA_EDEFAULT);
				return;
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_INFORMACIONGENERAL_VIEW_MODEL__FECHA:
				setFecha(FECHA_EDEFAULT);
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
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_INFORMACIONGENERAL_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_BASE_VIEW_MODEL_THE_INFORMACIONGENERAL:
				return getOwnedByContenedorRegistroBaseViewModelTheInformaciongeneral() != null;
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_INFORMACIONGENERAL_VIEW_MODEL__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_INFORMACIONGENERAL_VIEW_MODEL__HORA:
				return HORA_EDEFAULT == null ? hora != null : !HORA_EDEFAULT.equals(hora);
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_INFORMACIONGENERAL_VIEW_MODEL__RUTA:
				return RUTA_EDEFAULT == null ? ruta != null : !RUTA_EDEFAULT.equals(ruta);
			case ContenedorregistrobaseviewmodelPackage.CONTENEDOR_INFORMACIONGENERAL_VIEW_MODEL__FECHA:
				return FECHA_EDEFAULT == null ? fecha != null : !FECHA_EDEFAULT.equals(fecha);
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
		result.append(", hora: ");
		result.append(hora);
		result.append(", ruta: ");
		result.append(ruta);
		result.append(", fecha: ");
		result.append(fecha);
		result.append(')');
		return result.toString();
	}

} //ContenedorInformaciongeneralViewModelImpl
