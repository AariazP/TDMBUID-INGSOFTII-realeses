/**
 */
package cootracir.domain.main1;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see cootracir.domain.main1.Main1Package
 * @generated
 */
public interface Main1Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Main1Factory eINSTANCE = cootracir.domain.main1.impl.Main1FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Bus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bus</em>'.
	 * @generated
	 */
	Bus createBus();

	/**
	 * Returns a new object of class '<em>Ruta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ruta</em>'.
	 * @generated
	 */
	Ruta createRuta();

	/**
	 * Returns a new object of class '<em>Registrador</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Registrador</em>'.
	 * @generated
	 */
	Registrador createRegistrador();

	/**
	 * Returns a new object of class '<em>Detalle Registro</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Detalle Registro</em>'.
	 * @generated
	 */
	DetalleRegistro createDetalleRegistro();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Main1Package getMain1Package();

} //Main1Factory
