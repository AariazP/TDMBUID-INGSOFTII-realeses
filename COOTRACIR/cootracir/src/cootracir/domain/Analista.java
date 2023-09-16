/**
 */
package cootracir.domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analista</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cootracir.domain.Analista#getDireccion <em>Direccion</em>}</li>
 *   <li>{@link cootracir.domain.Analista#getEmail <em>Email</em>}</li>
 *   <li>{@link cootracir.domain.Analista#getEstado <em>Estado</em>}</li>
 *   <li>{@link cootracir.domain.Analista#getId <em>Id</em>}</li>
 *   <li>{@link cootracir.domain.Analista#getNombre <em>Nombre</em>}</li>
 *   <li>{@link cootracir.domain.Analista#getTelefono <em>Telefono</em>}</li>
 *   <li>{@link cootracir.domain.Analista#getFactoryGestionHumana <em>Factory Gestion Humana</em>}</li>
 *   <li>{@link cootracir.domain.Analista#getLstConductores <em>Lst Conductores</em>}</li>
 * </ul>
 *
 * @see cootracir.domain.DomainPackage#getAnalista()
 * @model
 * @generated
 */
public interface Analista extends EObject {
	/**
	 * Returns the value of the '<em><b>Direccion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direccion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direccion</em>' attribute.
	 * @see #setDireccion(String)
	 * @see cootracir.domain.DomainPackage#getAnalista_Direccion()
	 * @model dataType="cootracir.String"
	 * @generated
	 */
	String getDireccion();

	/**
	 * Sets the value of the '{@link cootracir.domain.Analista#getDireccion <em>Direccion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direccion</em>' attribute.
	 * @see #getDireccion()
	 * @generated
	 */
	void setDireccion(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see cootracir.domain.DomainPackage#getAnalista_Email()
	 * @model dataType="cootracir.String"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link cootracir.domain.Analista#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

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
	 * @see cootracir.domain.DomainPackage#getAnalista_Estado()
	 * @model dataType="cootracir.String"
	 * @generated
	 */
	String getEstado();

	/**
	 * Sets the value of the '{@link cootracir.domain.Analista#getEstado <em>Estado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estado</em>' attribute.
	 * @see #getEstado()
	 * @generated
	 */
	void setEstado(String value);

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
	 * @see cootracir.domain.DomainPackage#getAnalista_Id()
	 * @model dataType="cootracir.String"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link cootracir.domain.Analista#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

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
	 * @see cootracir.domain.DomainPackage#getAnalista_Nombre()
	 * @model dataType="cootracir.String"
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link cootracir.domain.Analista#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Telefono</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Telefono</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Telefono</em>' attribute.
	 * @see #setTelefono(String)
	 * @see cootracir.domain.DomainPackage#getAnalista_Telefono()
	 * @model dataType="cootracir.String"
	 * @generated
	 */
	String getTelefono();

	/**
	 * Sets the value of the '{@link cootracir.domain.Analista#getTelefono <em>Telefono</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Telefono</em>' attribute.
	 * @see #getTelefono()
	 * @generated
	 */
	void setTelefono(String value);

	/**
	 * Returns the value of the '<em><b>Factory Gestion Humana</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link cootracir.domain.FactoryGestionHumana#getLstAnalistas <em>Lst Analistas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Factory Gestion Humana</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factory Gestion Humana</em>' container reference.
	 * @see #setFactoryGestionHumana(FactoryGestionHumana)
	 * @see cootracir.domain.DomainPackage#getAnalista_FactoryGestionHumana()
	 * @see cootracir.domain.FactoryGestionHumana#getLstAnalistas
	 * @model opposite="lstAnalistas" transient="false"
	 * @generated
	 */
	FactoryGestionHumana getFactoryGestionHumana();

	/**
	 * Sets the value of the '{@link cootracir.domain.Analista#getFactoryGestionHumana <em>Factory Gestion Humana</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factory Gestion Humana</em>' container reference.
	 * @see #getFactoryGestionHumana()
	 * @generated
	 */
	void setFactoryGestionHumana(FactoryGestionHumana value);

	/**
	 * Returns the value of the '<em><b>Lst Conductores</b></em>' reference list.
	 * The list contents are of type {@link cootracir.domain.Conductor}.
	 * It is bidirectional and its opposite is '{@link cootracir.domain.Conductor#getAnalista <em>Analista</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Conductores</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Conductores</em>' reference list.
	 * @see cootracir.domain.DomainPackage#getAnalista_LstConductores()
	 * @see cootracir.domain.Conductor#getAnalista
	 * @model opposite="analista"
	 * @generated
	 */
	EList<Conductor> getLstConductores();

} // Analista
