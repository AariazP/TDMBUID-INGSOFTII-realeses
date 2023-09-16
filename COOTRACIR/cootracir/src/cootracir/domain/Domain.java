/**
 */
package cootracir.domain;

import cootracir.ModelFactory;
import cootracir.domain.impl.ConductorImpl;
import cootracir.ui.UI;

import java.util.HashMap;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cootracir.domain.Domain#getTheModelFactory <em>The Model Factory</em>}</li>
 *   <li>{@link cootracir.domain.Domain#getFactoryGestionHumana <em>Factory Gestion Humana</em>}</li>
 *   <li>{@link cootracir.domain.Domain#getFactoryGestionInventario <em>Factory Gestion Inventario</em>}</li>
 *   <li>{@link cootracir.domain.Domain#getTheUI <em>The UI</em>}</li>
 * </ul>
 *
 * @see cootracir.domain.DomainPackage#getDomain()
 * @model
 * @generated
 */
public interface Domain extends EObject {
	/**
	 * Returns the value of the '<em><b>The Model Factory</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link cootracir.ModelFactory#getTheDomain <em>The Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Model Factory</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Model Factory</em>' container reference.
	 * @see #setTheModelFactory(ModelFactory)
	 * @see cootracir.domain.DomainPackage#getDomain_TheModelFactory()
	 * @see cootracir.ModelFactory#getTheDomain
	 * @model opposite="theDomain" transient="false"
	 * @generated
	 */
	ModelFactory getTheModelFactory();

	/**
	 * Sets the value of the '{@link cootracir.domain.Domain#getTheModelFactory <em>The Model Factory</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Model Factory</em>' container reference.
	 * @see #getTheModelFactory()
	 * @generated
	 */
	void setTheModelFactory(ModelFactory value);

	/**
	 * Returns the value of the '<em><b>Factory Gestion Humana</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link cootracir.domain.FactoryGestionHumana#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Factory Gestion Humana</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factory Gestion Humana</em>' containment reference.
	 * @see #setFactoryGestionHumana(FactoryGestionHumana)
	 * @see cootracir.domain.DomainPackage#getDomain_FactoryGestionHumana()
	 * @see cootracir.domain.FactoryGestionHumana#getDomain
	 * @model opposite="domain" containment="true"
	 * @generated
	 */
	FactoryGestionHumana getFactoryGestionHumana();

	/**
	 * Sets the value of the '{@link cootracir.domain.Domain#getFactoryGestionHumana <em>Factory Gestion Humana</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factory Gestion Humana</em>' containment reference.
	 * @see #getFactoryGestionHumana()
	 * @generated
	 */
	void setFactoryGestionHumana(FactoryGestionHumana value);

	/**
	 * Returns the value of the '<em><b>Factory Gestion Inventario</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link cootracir.domain.FactoryGestionInventario#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Factory Gestion Inventario</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factory Gestion Inventario</em>' containment reference.
	 * @see #setFactoryGestionInventario(FactoryGestionInventario)
	 * @see cootracir.domain.DomainPackage#getDomain_FactoryGestionInventario()
	 * @see cootracir.domain.FactoryGestionInventario#getDomain
	 * @model opposite="domain" containment="true"
	 * @generated
	 */
	FactoryGestionInventario getFactoryGestionInventario();

	/**
	 * Sets the value of the '{@link cootracir.domain.Domain#getFactoryGestionInventario <em>Factory Gestion Inventario</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factory Gestion Inventario</em>' containment reference.
	 * @see #getFactoryGestionInventario()
	 * @generated
	 */
	void setFactoryGestionInventario(FactoryGestionInventario value);

	/**
	 * Returns the value of the '<em><b>The UI</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cootracir.ui.UI#getTheDomain <em>The Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The UI</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The UI</em>' reference.
	 * @see #setTheUI(UI)
	 * @see cootracir.domain.DomainPackage#getDomain_TheUI()
	 * @see cootracir.ui.UI#getTheDomain
	 * @model opposite="theDomain"
	 * @generated
	 */
	UI getTheUI();

	/**
	 * Sets the value of the '{@link cootracir.domain.Domain#getTheUI <em>The UI</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The UI</em>' reference.
	 * @see #getTheUI()
	 * @generated
	 */
	void setTheUI(UI value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='//TODO implementarModelo\n'"
	 * @generated
	 */
	void implementarModelo();

	EList<Ruta> getRutas();

	ConductorImpl getConductorID(String idConductor);

	String aplicarPromedio(ConductorImpl conductorImpl);

	String hacerLiquidacion(ConductorImpl conductorImpl);

	HashMap<String, Double> getListaRutas();

} // Domain
