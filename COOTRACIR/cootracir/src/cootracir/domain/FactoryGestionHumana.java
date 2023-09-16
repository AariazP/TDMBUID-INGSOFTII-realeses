/**
 */
package cootracir.domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import cootracir.domain.impl.ConductorImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Factory Gestion Humana</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cootracir.domain.FactoryGestionHumana#getLstAnalistas <em>Lst Analistas</em>}</li>
 *   <li>{@link cootracir.domain.FactoryGestionHumana#getLstCajeros <em>Lst Cajeros</em>}</li>
 *   <li>{@link cootracir.domain.FactoryGestionHumana#getLstConductores <em>Lst Conductores</em>}</li>
 *   <li>{@link cootracir.domain.FactoryGestionHumana#getId <em>Id</em>}</li>
 *   <li>{@link cootracir.domain.FactoryGestionHumana#getEstado <em>Estado</em>}</li>
 *   <li>{@link cootracir.domain.FactoryGestionHumana#getDomain <em>Domain</em>}</li>
 * </ul>
 *
 * @see cootracir.domain.DomainPackage#getFactoryGestionHumana()
 * @model
 * @generated
 */
public interface FactoryGestionHumana extends EObject {
	/**
	 * Returns the value of the '<em><b>Lst Analistas</b></em>' containment reference list.
	 * The list contents are of type {@link cootracir.domain.Analista}.
	 * It is bidirectional and its opposite is '{@link cootracir.domain.Analista#getFactoryGestionHumana <em>Factory Gestion Humana</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Analistas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Analistas</em>' containment reference list.
	 * @see cootracir.domain.DomainPackage#getFactoryGestionHumana_LstAnalistas()
	 * @see cootracir.domain.Analista#getFactoryGestionHumana
	 * @model opposite="factoryGestionHumana" containment="true"
	 * @generated
	 */
	EList<Analista> getLstAnalistas();

	/**
	 * Returns the value of the '<em><b>Lst Cajeros</b></em>' containment reference list.
	 * The list contents are of type {@link cootracir.domain.Cajero}.
	 * It is bidirectional and its opposite is '{@link cootracir.domain.Cajero#getFactoryGestionHumana <em>Factory Gestion Humana</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Cajeros</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Cajeros</em>' containment reference list.
	 * @see cootracir.domain.DomainPackage#getFactoryGestionHumana_LstCajeros()
	 * @see cootracir.domain.Cajero#getFactoryGestionHumana
	 * @model opposite="factoryGestionHumana" containment="true"
	 * @generated
	 */
	EList<Cajero> getLstCajeros();

	/**
	 * Returns the value of the '<em><b>Lst Conductores</b></em>' containment reference list.
	 * The list contents are of type {@link cootracir.domain.Conductor}.
	 * It is bidirectional and its opposite is '{@link cootracir.domain.Conductor#getFactoryGestionHumana <em>Factory Gestion Humana</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Conductores</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Conductores</em>' containment reference list.
	 * @see cootracir.domain.DomainPackage#getFactoryGestionHumana_LstConductores()
	 * @see cootracir.domain.Conductor#getFactoryGestionHumana
	 * @model opposite="factoryGestionHumana" containment="true"
	 * @generated
	 */
	EList<Conductor> getLstConductores();

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
	 * @see cootracir.domain.DomainPackage#getFactoryGestionHumana_Id()
	 * @model dataType="cootracir.String"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link cootracir.domain.FactoryGestionHumana#getId <em>Id</em>}' attribute.
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
	 * @see cootracir.domain.DomainPackage#getFactoryGestionHumana_Estado()
	 * @model dataType="cootracir.String"
	 * @generated
	 */
	String getEstado();

	/**
	 * Sets the value of the '{@link cootracir.domain.FactoryGestionHumana#getEstado <em>Estado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estado</em>' attribute.
	 * @see #getEstado()
	 * @generated
	 */
	void setEstado(String value);

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link cootracir.domain.Domain#getFactoryGestionHumana <em>Factory Gestion Humana</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' container reference.
	 * @see #setDomain(Domain)
	 * @see cootracir.domain.DomainPackage#getFactoryGestionHumana_Domain()
	 * @see cootracir.domain.Domain#getFactoryGestionHumana
	 * @model opposite="factoryGestionHumana" transient="false"
	 * @generated
	 */
	Domain getDomain();

	/**
	 * Sets the value of the '{@link cootracir.domain.FactoryGestionHumana#getDomain <em>Domain</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' container reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(Domain value);

	ConductorImpl getConductorID(String idConductor);

	Cajero getCajeroActivo();

	String aplicarPromedio(ConductorImpl conductorImpl);

} // FactoryGestionHumana
