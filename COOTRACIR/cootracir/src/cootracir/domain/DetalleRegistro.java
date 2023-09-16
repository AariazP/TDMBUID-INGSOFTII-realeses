/**
 */
package cootracir.domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Detalle Registro</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cootracir.domain.DetalleRegistro#getLugar <em>Lugar</em>}</li>
 *   <li>{@link cootracir.domain.DetalleRegistro#getHora <em>Hora</em>}</li>
 *   <li>{@link cootracir.domain.DetalleRegistro#getIncidencia <em>Incidencia</em>}</li>
 *   <li>{@link cootracir.domain.DetalleRegistro#getId <em>Id</em>}</li>
 *   <li>{@link cootracir.domain.DetalleRegistro#getEstado <em>Estado</em>}</li>
 *   <li>{@link cootracir.domain.DetalleRegistro#getRegistrador <em>Registrador</em>}</li>
 *   <li>{@link cootracir.domain.DetalleRegistro#getFactoryGestionInventario <em>Factory Gestion Inventario</em>}</li>
 *   <li>{@link cootracir.domain.DetalleRegistro#getRuta <em>Ruta</em>}</li>
 * </ul>
 *
 * @see cootracir.domain.DomainPackage#getDetalleRegistro()
 * @model
 * @generated
 */
public interface DetalleRegistro extends EObject {
	/**
	 * Returns the value of the '<em><b>Lugar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lugar</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lugar</em>' attribute.
	 * @see #setLugar(String)
	 * @see cootracir.domain.DomainPackage#getDetalleRegistro_Lugar()
	 * @model dataType="cootracir.String"
	 * @generated
	 */
	String getLugar();

	/**
	 * Sets the value of the '{@link cootracir.domain.DetalleRegistro#getLugar <em>Lugar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lugar</em>' attribute.
	 * @see #getLugar()
	 * @generated
	 */
	void setLugar(String value);

	/**
	 * Returns the value of the '<em><b>Hora</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hora</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hora</em>' attribute.
	 * @see #setHora(String)
	 * @see cootracir.domain.DomainPackage#getDetalleRegistro_Hora()
	 * @model dataType="cootracir.String"
	 * @generated
	 */
	String getHora();

	/**
	 * Sets the value of the '{@link cootracir.domain.DetalleRegistro#getHora <em>Hora</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hora</em>' attribute.
	 * @see #getHora()
	 * @generated
	 */
	void setHora(String value);

	/**
	 * Returns the value of the '<em><b>Incidencia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incidencia</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incidencia</em>' attribute.
	 * @see #setIncidencia(String)
	 * @see cootracir.domain.DomainPackage#getDetalleRegistro_Incidencia()
	 * @model dataType="cootracir.String"
	 * @generated
	 */
	String getIncidencia();

	/**
	 * Sets the value of the '{@link cootracir.domain.DetalleRegistro#getIncidencia <em>Incidencia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incidencia</em>' attribute.
	 * @see #getIncidencia()
	 * @generated
	 */
	void setIncidencia(String value);

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
	 * @see cootracir.domain.DomainPackage#getDetalleRegistro_Id()
	 * @model dataType="cootracir.String"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link cootracir.domain.DetalleRegistro#getId <em>Id</em>}' attribute.
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
	 * @see cootracir.domain.DomainPackage#getDetalleRegistro_Estado()
	 * @model dataType="cootracir.String"
	 * @generated
	 */
	String getEstado();

	/**
	 * Sets the value of the '{@link cootracir.domain.DetalleRegistro#getEstado <em>Estado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estado</em>' attribute.
	 * @see #getEstado()
	 * @generated
	 */
	void setEstado(String value);

	/**
	 * Returns the value of the '<em><b>Registrador</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cootracir.domain.Registrador#getLstDetalleRegistros <em>Lst Detalle Registros</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registrador</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registrador</em>' reference.
	 * @see #setRegistrador(Registrador)
	 * @see cootracir.domain.DomainPackage#getDetalleRegistro_Registrador()
	 * @see cootracir.domain.Registrador#getLstDetalleRegistros
	 * @model opposite="lstDetalleRegistros"
	 * @generated
	 */
	Registrador getRegistrador();

	/**
	 * Sets the value of the '{@link cootracir.domain.DetalleRegistro#getRegistrador <em>Registrador</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registrador</em>' reference.
	 * @see #getRegistrador()
	 * @generated
	 */
	void setRegistrador(Registrador value);

	/**
	 * Returns the value of the '<em><b>Factory Gestion Inventario</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link cootracir.domain.FactoryGestionInventario#getLstDetalleRegistro <em>Lst Detalle Registro</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Factory Gestion Inventario</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factory Gestion Inventario</em>' container reference.
	 * @see #setFactoryGestionInventario(FactoryGestionInventario)
	 * @see cootracir.domain.DomainPackage#getDetalleRegistro_FactoryGestionInventario()
	 * @see cootracir.domain.FactoryGestionInventario#getLstDetalleRegistro
	 * @model opposite="lstDetalleRegistro" transient="false"
	 * @generated
	 */
	FactoryGestionInventario getFactoryGestionInventario();

	/**
	 * Sets the value of the '{@link cootracir.domain.DetalleRegistro#getFactoryGestionInventario <em>Factory Gestion Inventario</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factory Gestion Inventario</em>' container reference.
	 * @see #getFactoryGestionInventario()
	 * @generated
	 */
	void setFactoryGestionInventario(FactoryGestionInventario value);

	/**
	 * Returns the value of the '<em><b>Ruta</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cootracir.domain.Ruta#getLstDetalleRegistro <em>Lst Detalle Registro</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ruta</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ruta</em>' reference.
	 * @see #setRuta(Ruta)
	 * @see cootracir.domain.DomainPackage#getDetalleRegistro_Ruta()
	 * @see cootracir.domain.Ruta#getLstDetalleRegistro
	 * @model opposite="lstDetalleRegistro"
	 * @generated
	 */
	Ruta getRuta();

	/**
	 * Sets the value of the '{@link cootracir.domain.DetalleRegistro#getRuta <em>Ruta</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ruta</em>' reference.
	 * @see #getRuta()
	 * @generated
	 */
	void setRuta(Ruta value);

} // DetalleRegistro
