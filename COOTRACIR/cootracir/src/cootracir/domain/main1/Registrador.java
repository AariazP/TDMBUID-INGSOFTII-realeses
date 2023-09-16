/**
 */
package cootracir.domain.main1;

import cootracir.domain.Conductor;

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
 *   <li>{@link cootracir.domain.main1.Registrador#getLstConductor <em>Lst Conductor</em>}</li>
 *   <li>{@link cootracir.domain.main1.Registrador#getId <em>Id</em>}</li>
 *   <li>{@link cootracir.domain.main1.Registrador#getEstado <em>Estado</em>}</li>
 *   <li>{@link cootracir.domain.main1.Registrador#getLstDetalleRegistro <em>Lst Detalle Registro</em>}</li>
 * </ul>
 *
 * @see cootracir.domain.main1.Main1Package#getRegistrador()
 * @model
 * @generated
 */
public interface Registrador extends EObject {
	/**
	 * Returns the value of the '<em><b>Lst Conductor</b></em>' reference list.
	 * The list contents are of type {@link cootracir.domain.Conductor}.
	 * It is bidirectional and its opposite is '{@link cootracir.domain.Conductor#getLstRegistrador <em>Lst Registrador</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Conductor</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Conductor</em>' reference list.
	 * @see cootracir.domain.main1.Main1Package#getRegistrador_LstConductor()
	 * @see cootracir.domain.Conductor#getLstRegistrador
	 * @model opposite="lstRegistrador"
	 * @generated
	 */
	EList<Conductor> getLstConductor();

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
	 * @see cootracir.domain.main1.Main1Package#getRegistrador_Id()
	 * @model dataType="cootracir.String"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link cootracir.domain.main1.Registrador#getId <em>Id</em>}' attribute.
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
	 * @see cootracir.domain.main1.Main1Package#getRegistrador_Estado()
	 * @model dataType="cootracir.String"
	 * @generated
	 */
	String getEstado();

	/**
	 * Sets the value of the '{@link cootracir.domain.main1.Registrador#getEstado <em>Estado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estado</em>' attribute.
	 * @see #getEstado()
	 * @generated
	 */
	void setEstado(String value);

	/**
	 * Returns the value of the '<em><b>Lst Detalle Registro</b></em>' reference list.
	 * The list contents are of type {@link cootracir.domain.main1.DetalleRegistro}.
	 * It is bidirectional and its opposite is '{@link cootracir.domain.main1.DetalleRegistro#getLstRegistrador <em>Lst Registrador</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Detalle Registro</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Detalle Registro</em>' reference list.
	 * @see cootracir.domain.main1.Main1Package#getRegistrador_LstDetalleRegistro()
	 * @see cootracir.domain.main1.DetalleRegistro#getLstRegistrador
	 * @model opposite="lstRegistrador"
	 * @generated
	 */
	EList<DetalleRegistro> getLstDetalleRegistro();

} // Registrador
