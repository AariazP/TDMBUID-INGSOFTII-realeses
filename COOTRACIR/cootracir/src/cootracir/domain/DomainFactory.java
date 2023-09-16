/**
 */
package cootracir.domain;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see cootracir.domain.DomainPackage
 * @generated
 */
public interface DomainFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DomainFactory eINSTANCE = cootracir.domain.impl.DomainFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Analista</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Analista</em>'.
	 * @generated
	 */
	Analista createAnalista();

	/**
	 * Returns a new object of class '<em>Bus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bus</em>'.
	 * @generated
	 */
	Bus createBus();

	/**
	 * Returns a new object of class '<em>Cajero</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cajero</em>'.
	 * @generated
	 */
	Cajero createCajero();

	/**
	 * Returns a new object of class '<em>Conductor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conductor</em>'.
	 * @generated
	 */
	Conductor createConductor();

	/**
	 * Returns a new object of class '<em>Detalle Registro</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Detalle Registro</em>'.
	 * @generated
	 */
	DetalleRegistro createDetalleRegistro();

	/**
	 * Returns a new object of class '<em>Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain</em>'.
	 * @generated
	 */
	Domain createDomain();

	/**
	 * Returns a new object of class '<em>Factory Gestion Humana</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Factory Gestion Humana</em>'.
	 * @generated
	 */
	FactoryGestionHumana createFactoryGestionHumana();

	/**
	 * Returns a new object of class '<em>Factory Gestion Inventario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Factory Gestion Inventario</em>'.
	 * @generated
	 */
	FactoryGestionInventario createFactoryGestionInventario();

	/**
	 * Returns a new object of class '<em>Liquidacion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Liquidacion</em>'.
	 * @generated
	 */
	Liquidacion createLiquidacion();

	/**
	 * Returns a new object of class '<em>Registrador</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Registrador</em>'.
	 * @generated
	 */
	Registrador createRegistrador();

	/**
	 * Returns a new object of class '<em>Ruta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ruta</em>'.
	 * @generated
	 */
	Ruta createRuta();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DomainPackage getDomainPackage();

} //DomainFactory
