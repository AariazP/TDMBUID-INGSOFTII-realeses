/**
 */
package cootracir.domain.main1.impl;

import cootracir.domain.main1.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Main1FactoryImpl extends EFactoryImpl implements Main1Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Main1Factory init() {
		try {
			Main1Factory theMain1Factory = (Main1Factory)EPackage.Registry.INSTANCE.getEFactory(Main1Package.eNS_URI);
			if (theMain1Factory != null) {
				return theMain1Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Main1FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Main1FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Main1Package.BUS: return createBus();
			case Main1Package.RUTA: return createRuta();
			case Main1Package.REGISTRADOR: return createRegistrador();
			case Main1Package.DETALLE_REGISTRO: return createDetalleRegistro();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bus createBus() {
		BusImpl bus = new BusImpl();
		return bus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ruta createRuta() {
		RutaImpl ruta = new RutaImpl();
		return ruta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Registrador createRegistrador() {
		RegistradorImpl registrador = new RegistradorImpl();
		return registrador;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetalleRegistro createDetalleRegistro() {
		DetalleRegistroImpl detalleRegistro = new DetalleRegistroImpl();
		return detalleRegistro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Main1Package getMain1Package() {
		return (Main1Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Main1Package getPackage() {
		return Main1Package.eINSTANCE;
	}

} //Main1FactoryImpl
