/**
 */
package cootracir.domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ruta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cootracir.domain.Ruta#getLstDetalleRegistro <em>Lst Detalle Registro</em>}</li>
 *   <li>{@link cootracir.domain.Ruta#getPrecioRuta <em>Precio Ruta</em>}</li>
 *   <li>{@link cootracir.domain.Ruta#getId <em>Id</em>}</li>
 *   <li>{@link cootracir.domain.Ruta#getEstado <em>Estado</em>}</li>
 *   <li>{@link cootracir.domain.Ruta#getNombre <em>Nombre</em>}</li>
 *   <li>{@link cootracir.domain.Ruta#getBus <em>Bus</em>}</li>
 *   <li>{@link cootracir.domain.Ruta#getFactoryGestionInventario <em>Factory Gestion Inventario</em>}</li>
 * </ul>
 *
 * @see cootracir.domain.DomainPackage#getRuta()
 * @model
 * @generated
 */
public interface Ruta extends EObject {
	/**
	 * Returns the value of the '<em><b>Lst Detalle Registro</b></em>' reference list.
	 * The list contents are of type {@link cootracir.domain.DetalleRegistro}.
	 * It is bidirectional and its opposite is '{@link cootracir.domain.DetalleRegistro#getRuta <em>Ruta</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Detalle Registro</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Detalle Registro</em>' reference list.
	 * @see cootracir.domain.DomainPackage#getRuta_LstDetalleRegistro()
	 * @see cootracir.domain.DetalleRegistro#getRuta
	 * @model opposite="ruta"
	 * @generated
	 */
	EList<DetalleRegistro> getLstDetalleRegistro();

	/**
	 * Returns the value of the '<em><b>Precio Ruta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precio Ruta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precio Ruta</em>' attribute.
	 * @see #setPrecioRuta(String)
	 * @see cootracir.domain.DomainPackage#getRuta_PrecioRuta()
	 * @model dataType="cootracir.String"
	 * @generated
	 */
	String getPrecioRuta();

	/**
	 * Sets the value of the '{@link cootracir.domain.Ruta#getPrecioRuta <em>Precio Ruta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precio Ruta</em>' attribute.
	 * @see #getPrecioRuta()
	 * @generated
	 */
	void setPrecioRuta(String value);

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
	 * @see cootracir.domain.DomainPackage#getRuta_Id()
	 * @model dataType="cootracir.String"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link cootracir.domain.Ruta#getId <em>Id</em>}' attribute.
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
	 * @see cootracir.domain.DomainPackage#getRuta_Estado()
	 * @model dataType="cootracir.String"
	 * @generated
	 */
	String getEstado();

	/**
	 * Sets the value of the '{@link cootracir.domain.Ruta#getEstado <em>Estado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estado</em>' attribute.
	 * @see #getEstado()
	 * @generated
	 */
	void setEstado(String value);

	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see cootracir.domain.DomainPackage#getRuta_Nombre()
	 * @model dataType="cootracir.String"
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link cootracir.domain.Ruta#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Bus</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cootracir.domain.Bus#getLstRuta <em>Lst Ruta</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bus</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus</em>' reference.
	 * @see #setBus(Bus)
	 * @see cootracir.domain.DomainPackage#getRuta_Bus()
	 * @see cootracir.domain.Bus#getLstRuta
	 * @model opposite="lstRuta"
	 * @generated
	 */
	Bus getBus();

	/**
	 * Sets the value of the '{@link cootracir.domain.Ruta#getBus <em>Bus</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bus</em>' reference.
	 * @see #getBus()
	 * @generated
	 */
	void setBus(Bus value);

	/**
	 * Returns the value of the '<em><b>Factory Gestion Inventario</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link cootracir.domain.FactoryGestionInventario#getLstRuta <em>Lst Ruta</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Factory Gestion Inventario</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factory Gestion Inventario</em>' container reference.
	 * @see #setFactoryGestionInventario(FactoryGestionInventario)
	 * @see cootracir.domain.DomainPackage#getRuta_FactoryGestionInventario()
	 * @see cootracir.domain.FactoryGestionInventario#getLstRuta
	 * @model opposite="lstRuta" transient="false"
	 * @generated
	 */
	FactoryGestionInventario getFactoryGestionInventario();

	/**
	 * Sets the value of the '{@link cootracir.domain.Ruta#getFactoryGestionInventario <em>Factory Gestion Inventario</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factory Gestion Inventario</em>' container reference.
	 * @see #getFactoryGestionInventario()
	 * @generated
	 */
	void setFactoryGestionInventario(FactoryGestionInventario value);

} // Ruta
