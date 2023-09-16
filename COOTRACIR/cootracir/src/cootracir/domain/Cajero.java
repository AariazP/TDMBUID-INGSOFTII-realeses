/**
 */
package cootracir.domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import cootracir.domain.impl.ConductorImpl;
import cootracir.domain.impl.LiquidacionImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cajero</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cootracir.domain.Cajero#getNombre <em>Nombre</em>}</li>
 *   <li>{@link cootracir.domain.Cajero#getId <em>Id</em>}</li>
 *   <li>{@link cootracir.domain.Cajero#getEdad <em>Edad</em>}</li>
 *   <li>{@link cootracir.domain.Cajero#getTelefono <em>Telefono</em>}</li>
 *   <li>{@link cootracir.domain.Cajero#getDineroRecibido <em>Dinero Recibido</em>}</li>
 *   <li>{@link cootracir.domain.Cajero#getEmail <em>Email</em>}</li>
 *   <li>{@link cootracir.domain.Cajero#getEstado <em>Estado</em>}</li>
 *   <li>{@link cootracir.domain.Cajero#getFactoryGestionHumana <em>Factory Gestion Humana</em>}</li>
 *   <li>{@link cootracir.domain.Cajero#getLstConductores <em>Lst Conductores</em>}</li>
 *   <li>{@link cootracir.domain.Cajero#getLstLiquidaciones <em>Lst Liquidaciones</em>}</li>
 * </ul>
 *
 * @see cootracir.domain.DomainPackage#getCajero()
 * @model
 * @generated
 */
public interface Cajero extends EObject {
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
	 * @see cootracir.domain.DomainPackage#getCajero_Nombre()
	 * @model dataType="cootracir.String"
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link cootracir.domain.Cajero#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

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
	 * @see cootracir.domain.DomainPackage#getCajero_Id()
	 * @model dataType="cootracir.String"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link cootracir.domain.Cajero#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Edad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edad</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edad</em>' attribute.
	 * @see #setEdad(String)
	 * @see cootracir.domain.DomainPackage#getCajero_Edad()
	 * @model dataType="cootracir.String"
	 * @generated
	 */
	String getEdad();

	/**
	 * Sets the value of the '{@link cootracir.domain.Cajero#getEdad <em>Edad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edad</em>' attribute.
	 * @see #getEdad()
	 * @generated
	 */
	void setEdad(String value);

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
	 * @see cootracir.domain.DomainPackage#getCajero_Telefono()
	 * @model dataType="cootracir.String"
	 * @generated
	 */
	String getTelefono();

	/**
	 * Sets the value of the '{@link cootracir.domain.Cajero#getTelefono <em>Telefono</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Telefono</em>' attribute.
	 * @see #getTelefono()
	 * @generated
	 */
	void setTelefono(String value);

	/**
	 * Returns the value of the '<em><b>Dinero Recibido</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dinero Recibido</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dinero Recibido</em>' attribute.
	 * @see #setDineroRecibido(String)
	 * @see cootracir.domain.DomainPackage#getCajero_DineroRecibido()
	 * @model dataType="cootracir.String"
	 * @generated
	 */
	String getDineroRecibido();

	/**
	 * Sets the value of the '{@link cootracir.domain.Cajero#getDineroRecibido <em>Dinero Recibido</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dinero Recibido</em>' attribute.
	 * @see #getDineroRecibido()
	 * @generated
	 */
	void setDineroRecibido(String value);

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
	 * @see cootracir.domain.DomainPackage#getCajero_Email()
	 * @model dataType="cootracir.String"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link cootracir.domain.Cajero#getEmail <em>Email</em>}' attribute.
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
	 * @see cootracir.domain.DomainPackage#getCajero_Estado()
	 * @model dataType="cootracir.String"
	 * @generated
	 */
	String getEstado();

	/**
	 * Sets the value of the '{@link cootracir.domain.Cajero#getEstado <em>Estado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estado</em>' attribute.
	 * @see #getEstado()
	 * @generated
	 */
	void setEstado(String value);

	/**
	 * Returns the value of the '<em><b>Factory Gestion Humana</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link cootracir.domain.FactoryGestionHumana#getLstCajeros <em>Lst Cajeros</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Factory Gestion Humana</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factory Gestion Humana</em>' container reference.
	 * @see #setFactoryGestionHumana(FactoryGestionHumana)
	 * @see cootracir.domain.DomainPackage#getCajero_FactoryGestionHumana()
	 * @see cootracir.domain.FactoryGestionHumana#getLstCajeros
	 * @model opposite="lstCajeros" transient="false"
	 * @generated
	 */
	FactoryGestionHumana getFactoryGestionHumana();

	/**
	 * Sets the value of the '{@link cootracir.domain.Cajero#getFactoryGestionHumana <em>Factory Gestion Humana</em>}' container reference.
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
	 * It is bidirectional and its opposite is '{@link cootracir.domain.Conductor#getCajero <em>Cajero</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Conductores</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Conductores</em>' reference list.
	 * @see cootracir.domain.DomainPackage#getCajero_LstConductores()
	 * @see cootracir.domain.Conductor#getCajero
	 * @model opposite="cajero"
	 * @generated
	 */
	EList<Conductor> getLstConductores();

	/**
	 * Returns the value of the '<em><b>Lst Liquidaciones</b></em>' reference list.
	 * The list contents are of type {@link cootracir.domain.Liquidacion}.
	 * It is bidirectional and its opposite is '{@link cootracir.domain.Liquidacion#getCajero <em>Cajero</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Liquidaciones</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Liquidaciones</em>' reference list.
	 * @see cootracir.domain.DomainPackage#getCajero_LstLiquidaciones()
	 * @see cootracir.domain.Liquidacion#getCajero
	 * @model opposite="cajero"
	 * @generated
	 */
	EList<Liquidacion> getLstLiquidaciones();

	void addLiquidacion(LiquidacionImpl liquidacionImpl);

	void addConductor(ConductorImpl conductorImpl);

} // Cajero
