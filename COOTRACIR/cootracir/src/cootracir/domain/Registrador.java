/**
 */
package cootracir.domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Registrador</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cootracir.domain.Registrador#getLstDetalleRegistros <em>Lst Detalle Registros</em>}</li>
 *   <li>{@link cootracir.domain.Registrador#getId <em>Id</em>}</li>
 *   <li>{@link cootracir.domain.Registrador#getEstado <em>Estado</em>}</li>
 *   <li>{@link cootracir.domain.Registrador#getBus <em>Bus</em>}</li>
 *   <li>{@link cootracir.domain.Registrador#getFactoryGestionInventario <em>Factory Gestion Inventario</em>}</li>
 * </ul>
 *
 * @see cootracir.domain.DomainPackage#getRegistrador()
 * @model
 * @generated
 */
public interface Registrador extends EObject {
	/**
	 * Returns the value of the '<em><b>Lst Detalle Registros</b></em>' reference list.
	 * The list contents are of type {@link cootracir.domain.DetalleRegistro}.
	 * It is bidirectional and its opposite is '{@link cootracir.domain.DetalleRegistro#getRegistrador <em>Registrador</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Detalle Registros</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Detalle Registros</em>' reference list.
	 * @see cootracir.domain.DomainPackage#getRegistrador_LstDetalleRegistros()
	 * @see cootracir.domain.DetalleRegistro#getRegistrador
	 * @model opposite="registrador"
	 * @generated
	 */
	EList<DetalleRegistro> getLstDetalleRegistros();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see cootracir.domain.DomainPackage#getRegistrador_Id()
	 * @model dataType="cootracir.String"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link cootracir.domain.Registrador#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estado</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estado</em>' attribute.
	 * @see #setEstado(String)
	 * @see cootracir.domain.DomainPackage#getRegistrador_Estado()
	 * @model dataType="cootracir.String"
	 * @generated
	 */
	String getEstado();

	/**
	 * Sets the value of the '{@link cootracir.domain.Registrador#getEstado <em>Estado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estado</em>' attribute.
	 * @see #getEstado()
	 * @generated
	 */
	void setEstado(String value);

	/**
	 * Returns the value of the '<em><b>Bus</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cootracir.domain.Bus#getRegistrador <em>Registrador</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bus</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus</em>' reference.
	 * @see #setBus(Bus)
	 * @see cootracir.domain.DomainPackage#getRegistrador_Bus()
	 * @see cootracir.domain.Bus#getRegistrador
	 * @model opposite="registrador"
	 * @generated
	 */
	Bus getBus();

	/**
	 * Sets the value of the '{@link cootracir.domain.Registrador#getBus <em>Bus</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bus</em>' reference.
	 * @see #getBus()
	 * @generated
	 */
	void setBus(Bus value);

	/**
	 * Returns the value of the '<em><b>Factory Gestion Inventario</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link cootracir.domain.FactoryGestionInventario#getLstRegistrador <em>Lst Registrador</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Factory Gestion Inventario</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factory Gestion Inventario</em>' container reference.
	 * @see #setFactoryGestionInventario(FactoryGestionInventario)
	 * @see cootracir.domain.DomainPackage#getRegistrador_FactoryGestionInventario()
	 * @see cootracir.domain.FactoryGestionInventario#getLstRegistrador
	 * @model opposite="lstRegistrador" transient="false"
	 * @generated
	 */
	FactoryGestionInventario getFactoryGestionInventario();

	/**
	 * Sets the value of the '{@link cootracir.domain.Registrador#getFactoryGestionInventario <em>Factory Gestion Inventario</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factory Gestion Inventario</em>' container reference.
	 * @see #getFactoryGestionInventario()
	 * @generated
	 */
	void setFactoryGestionInventario(FactoryGestionInventario value);

} // Registrador
