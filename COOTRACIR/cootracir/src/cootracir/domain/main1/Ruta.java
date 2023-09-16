/**
 */
package cootracir.domain.main1;

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
 *   <li>{@link cootracir.domain.main1.Ruta#getPrecioRuta <em>Precio Ruta</em>}</li>
 *   <li>{@link cootracir.domain.main1.Ruta#getId <em>Id</em>}</li>
 *   <li>{@link cootracir.domain.main1.Ruta#getEstado <em>Estado</em>}</li>
 *   <li>{@link cootracir.domain.main1.Ruta#getLstBus <em>Lst Bus</em>}</li>
 * </ul>
 *
 * @see cootracir.domain.main1.Main1Package#getRuta()
 * @model
 * @generated
 */
public interface Ruta extends EObject {
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
	 * @see cootracir.domain.main1.Main1Package#getRuta_PrecioRuta()
	 * @model dataType="cootracir.String"
	 * @generated
	 */
	String getPrecioRuta();

	/**
	 * Sets the value of the '{@link cootracir.domain.main1.Ruta#getPrecioRuta <em>Precio Ruta</em>}' attribute.
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
	 * @see cootracir.domain.main1.Main1Package#getRuta_Id()
	 * @model dataType="cootracir.String"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link cootracir.domain.main1.Ruta#getId <em>Id</em>}' attribute.
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
	 * @see cootracir.domain.main1.Main1Package#getRuta_Estado()
	 * @model dataType="cootracir.String"
	 * @generated
	 */
	String getEstado();

	/**
	 * Sets the value of the '{@link cootracir.domain.main1.Ruta#getEstado <em>Estado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estado</em>' attribute.
	 * @see #getEstado()
	 * @generated
	 */
	void setEstado(String value);

	/**
	 * Returns the value of the '<em><b>Lst Bus</b></em>' reference list.
	 * The list contents are of type {@link cootracir.domain.main1.Bus}.
	 * It is bidirectional and its opposite is '{@link cootracir.domain.main1.Bus#getLstRuta <em>Lst Ruta</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Bus</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Bus</em>' reference list.
	 * @see cootracir.domain.main1.Main1Package#getRuta_LstBus()
	 * @see cootracir.domain.main1.Bus#getLstRuta
	 * @model opposite="lstRuta"
	 * @generated
	 */
	EList<Bus> getLstBus();

} // Ruta
