/**
 */
package cootracir.domain.main1;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link cootracir.domain.main1.DetalleRegistro#getLstRegistrador <em>Lst Registrador</em>}</li>
 *   <li>{@link cootracir.domain.main1.DetalleRegistro#getLugar <em>Lugar</em>}</li>
 *   <li>{@link cootracir.domain.main1.DetalleRegistro#getHora <em>Hora</em>}</li>
 *   <li>{@link cootracir.domain.main1.DetalleRegistro#getIncidencias <em>Incidencias</em>}</li>
 *   <li>{@link cootracir.domain.main1.DetalleRegistro#getId <em>Id</em>}</li>
 *   <li>{@link cootracir.domain.main1.DetalleRegistro#getEstado <em>Estado</em>}</li>
 * </ul>
 *
 * @see cootracir.domain.main1.Main1Package#getDetalleRegistro()
 * @model
 * @generated
 */
public interface DetalleRegistro extends EObject {
	/**
	 * Returns the value of the '<em><b>Lst Registrador</b></em>' reference list.
	 * The list contents are of type {@link cootracir.domain.main1.Registrador}.
	 * It is bidirectional and its opposite is '{@link cootracir.domain.main1.Registrador#getLstDetalleRegistro <em>Lst Detalle Registro</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Registrador</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Registrador</em>' reference list.
	 * @see cootracir.domain.main1.Main1Package#getDetalleRegistro_LstRegistrador()
	 * @see cootracir.domain.main1.Registrador#getLstDetalleRegistro
	 * @model opposite="lstDetalleRegistro"
	 * @generated
	 */
	EList<Registrador> getLstRegistrador();

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
	 * @see cootracir.domain.main1.Main1Package#getDetalleRegistro_Lugar()
	 * @model dataType="cootracir.String"
	 * @generated
	 */
	String getLugar();

	/**
	 * Sets the value of the '{@link cootracir.domain.main1.DetalleRegistro#getLugar <em>Lugar</em>}' attribute.
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
	 * @see cootracir.domain.main1.Main1Package#getDetalleRegistro_Hora()
	 * @model dataType="cootracir.String"
	 * @generated
	 */
	String getHora();

	/**
	 * Sets the value of the '{@link cootracir.domain.main1.DetalleRegistro#getHora <em>Hora</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hora</em>' attribute.
	 * @see #getHora()
	 * @generated
	 */
	void setHora(String value);

	/**
	 * Returns the value of the '<em><b>Incidencias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incidencias</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incidencias</em>' attribute.
	 * @see #setIncidencias(String)
	 * @see cootracir.domain.main1.Main1Package#getDetalleRegistro_Incidencias()
	 * @model dataType="cootracir.String"
	 * @generated
	 */
	String getIncidencias();

	/**
	 * Sets the value of the '{@link cootracir.domain.main1.DetalleRegistro#getIncidencias <em>Incidencias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incidencias</em>' attribute.
	 * @see #getIncidencias()
	 * @generated
	 */
	void setIncidencias(String value);

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
	 * @see cootracir.domain.main1.Main1Package#getDetalleRegistro_Id()
	 * @model dataType="cootracir.String"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link cootracir.domain.main1.DetalleRegistro#getId <em>Id</em>}' attribute.
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
	 * @see cootracir.domain.main1.Main1Package#getDetalleRegistro_Estado()
	 * @model dataType="cootracir.String"
	 * @generated
	 */
	String getEstado();

	/**
	 * Sets the value of the '{@link cootracir.domain.main1.DetalleRegistro#getEstado <em>Estado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estado</em>' attribute.
	 * @see #getEstado()
	 * @generated
	 */
	void setEstado(String value);

} // DetalleRegistro
