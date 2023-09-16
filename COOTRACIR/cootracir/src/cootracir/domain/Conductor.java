/**
 */
package cootracir.domain;

import cootracir.domain.main1.Registrador;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conductor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cootracir.domain.Conductor#getAnalista <em>Analista</em>}</li>
 *   <li>{@link cootracir.domain.Conductor#getCajero <em>Cajero</em>}</li>
 *   <li>{@link cootracir.domain.Conductor#getNombre <em>Nombre</em>}</li>
 *   <li>{@link cootracir.domain.Conductor#getId <em>Id</em>}</li>
 *   <li>{@link cootracir.domain.Conductor#getTelefono <em>Telefono</em>}</li>
 *   <li>{@link cootracir.domain.Conductor#getEmail <em>Email</em>}</li>
 *   <li>{@link cootracir.domain.Conductor#getEstado <em>Estado</em>}</li>
 *   <li>{@link cootracir.domain.Conductor#getBus <em>Bus</em>}</li>
 *   <li>{@link cootracir.domain.Conductor#getFactoryGestionHumana <em>Factory Gestion Humana</em>}</li>
 *   <li>{@link cootracir.domain.Conductor#getLstRegistrador <em>Lst Registrador</em>}</li>
 *   <li>{@link cootracir.domain.Conductor#getLstBus <em>Lst Bus</em>}</li>
 *   <li>{@link cootracir.domain.Conductor#getLstLiquidaciones <em>Lst Liquidaciones</em>}</li>
 * </ul>
 *
 * @see cootracir.domain.DomainPackage#getConductor()
 * @model
 * @generated
 */
public interface Conductor extends EObject {
	/**
	 * Returns the value of the '<em><b>Analista</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cootracir.domain.Analista#getLstConductores <em>Lst Conductores</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Analista</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analista</em>' reference.
	 * @see #setAnalista(Analista)
	 * @see cootracir.domain.DomainPackage#getConductor_Analista()
	 * @see cootracir.domain.Analista#getLstConductores
	 * @model opposite="lstConductores"
	 * @generated
	 */
	Analista getAnalista();

	/**
	 * Sets the value of the '{@link cootracir.domain.Conductor#getAnalista <em>Analista</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Analista</em>' reference.
	 * @see #getAnalista()
	 * @generated
	 */
	void setAnalista(Analista value);

	/**
	 * Returns the value of the '<em><b>Cajero</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cootracir.domain.Cajero#getLstConductores <em>Lst Conductores</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cajero</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cajero</em>' reference.
	 * @see #setCajero(Cajero)
	 * @see cootracir.domain.DomainPackage#getConductor_Cajero()
	 * @see cootracir.domain.Cajero#getLstConductores
	 * @model opposite="lstConductores"
	 * @generated
	 */
	Cajero getCajero();

	/**
	 * Sets the value of the '{@link cootracir.domain.Conductor#getCajero <em>Cajero</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cajero</em>' reference.
	 * @see #getCajero()
	 * @generated
	 */
	void setCajero(Cajero value);

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
	 * @see cootracir.domain.DomainPackage#getConductor_Nombre()
	 * @model dataType="cootracir.String"
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link cootracir.domain.Conductor#getNombre <em>Nombre</em>}' attribute.
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
	 * @see cootracir.domain.DomainPackage#getConductor_Id()
	 * @model dataType="cootracir.String"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link cootracir.domain.Conductor#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

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
	 * @see cootracir.domain.DomainPackage#getConductor_Telefono()
	 * @model dataType="cootracir.String"
	 * @generated
	 */
	String getTelefono();

	/**
	 * Sets the value of the '{@link cootracir.domain.Conductor#getTelefono <em>Telefono</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Telefono</em>' attribute.
	 * @see #getTelefono()
	 * @generated
	 */
	void setTelefono(String value);

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
	 * @see cootracir.domain.DomainPackage#getConductor_Email()
	 * @model dataType="cootracir.String"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link cootracir.domain.Conductor#getEmail <em>Email</em>}' attribute.
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
	 * @see cootracir.domain.DomainPackage#getConductor_Estado()
	 * @model dataType="cootracir.String"
	 * @generated
	 */
	String getEstado();

	/**
	 * Sets the value of the '{@link cootracir.domain.Conductor#getEstado <em>Estado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estado</em>' attribute.
	 * @see #getEstado()
	 * @generated
	 */
	void setEstado(String value);

	/**
	 * Returns the value of the '<em><b>Bus</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cootracir.domain.Bus#getConductor <em>Conductor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bus</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus</em>' reference.
	 * @see #setBus(Bus)
	 * @see cootracir.domain.DomainPackage#getConductor_Bus()
	 * @see cootracir.domain.Bus#getConductor
	 * @model opposite="conductor"
	 * @generated
	 */
	Bus getBus();

	/**
	 * Sets the value of the '{@link cootracir.domain.Conductor#getBus <em>Bus</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bus</em>' reference.
	 * @see #getBus()
	 * @generated
	 */
	void setBus(Bus value);

	/**
	 * Returns the value of the '<em><b>Factory Gestion Humana</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link cootracir.domain.FactoryGestionHumana#getLstConductores <em>Lst Conductores</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Factory Gestion Humana</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factory Gestion Humana</em>' container reference.
	 * @see #setFactoryGestionHumana(FactoryGestionHumana)
	 * @see cootracir.domain.DomainPackage#getConductor_FactoryGestionHumana()
	 * @see cootracir.domain.FactoryGestionHumana#getLstConductores
	 * @model opposite="lstConductores" transient="false"
	 * @generated
	 */
	FactoryGestionHumana getFactoryGestionHumana();

	/**
	 * Sets the value of the '{@link cootracir.domain.Conductor#getFactoryGestionHumana <em>Factory Gestion Humana</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factory Gestion Humana</em>' container reference.
	 * @see #getFactoryGestionHumana()
	 * @generated
	 */
	void setFactoryGestionHumana(FactoryGestionHumana value);

	/**
	 * Returns the value of the '<em><b>Lst Registrador</b></em>' reference list.
	 * The list contents are of type {@link cootracir.domain.main1.Registrador}.
	 * It is bidirectional and its opposite is '{@link cootracir.domain.main1.Registrador#getLstConductor <em>Lst Conductor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Registrador</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Registrador</em>' reference list.
	 * @see cootracir.domain.DomainPackage#getConductor_LstRegistrador()
	 * @see cootracir.domain.main1.Registrador#getLstConductor
	 * @model opposite="lstConductor"
	 * @generated
	 */
	EList<Registrador> getLstRegistrador();

	/**
	 * Returns the value of the '<em><b>Lst Bus</b></em>' reference list.
	 * The list contents are of type {@link cootracir.domain.main1.Bus}.
	 * It is bidirectional and its opposite is '{@link cootracir.domain.main1.Bus#getLstConductor <em>Lst Conductor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Bus</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Bus</em>' reference list.
	 * @see cootracir.domain.DomainPackage#getConductor_LstBus()
	 * @see cootracir.domain.main1.Bus#getLstConductor
	 * @model opposite="lstConductor"
	 * @generated
	 */
	EList<cootracir.domain.main1.Bus> getLstBus();

	/**
	 * Returns the value of the '<em><b>Lst Liquidaciones</b></em>' reference list.
	 * The list contents are of type {@link cootracir.domain.Liquidacion}.
	 * It is bidirectional and its opposite is '{@link cootracir.domain.Liquidacion#getConductor <em>Conductor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Liquidaciones</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Liquidaciones</em>' reference list.
	 * @see cootracir.domain.DomainPackage#getConductor_LstLiquidaciones()
	 * @see cootracir.domain.Liquidacion#getConductor
	 * @model opposite="conductor"
	 * @generated
	 */
	EList<Liquidacion> getLstLiquidaciones();

} // Conductor
