/**
 */
package cootracir;

import cootracir.domain.Domain;

import cootracir.ui.UI;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Factory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cootracir.ModelFactory#getTheDomain <em>The Domain</em>}</li>
 *   <li>{@link cootracir.ModelFactory#getTheUI <em>The UI</em>}</li>
 * </ul>
 *
 * @see cootracir.cootracirPackage#getModelFactory()
 * @model
 * @generated
 */
public interface ModelFactory extends EObject {
	/**
	 * Returns the value of the '<em><b>The Domain</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link cootracir.domain.Domain#getTheModelFactory <em>The Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Domain</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Domain</em>' containment reference.
	 * @see #setTheDomain(Domain)
	 * @see cootracir.cootracirPackage#getModelFactory_TheDomain()
	 * @see cootracir.domain.Domain#getTheModelFactory
	 * @model opposite="theModelFactory" containment="true"
	 * @generated
	 */
	Domain getTheDomain();

	/**
	 * Sets the value of the '{@link cootracir.ModelFactory#getTheDomain <em>The Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Domain</em>' containment reference.
	 * @see #getTheDomain()
	 * @generated
	 */
	void setTheDomain(Domain value);

	/**
	 * Returns the value of the '<em><b>The UI</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link cootracir.ui.UI#getTheModelFactory <em>The Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The UI</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The UI</em>' containment reference.
	 * @see #setTheUI(UI)
	 * @see cootracir.cootracirPackage#getModelFactory_TheUI()
	 * @see cootracir.ui.UI#getTheModelFactory
	 * @model opposite="theModelFactory" containment="true"
	 * @generated
	 */
	UI getTheUI();

	/**
	 * Sets the value of the '{@link cootracir.ModelFactory#getTheUI <em>The UI</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The UI</em>' containment reference.
	 * @see #getTheUI()
	 * @generated
	 */
	void setTheUI(UI value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model rutaDataType="cootracir.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='ModelFactory modelFactory = null;\norg.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI(\"platform:/resource/\"+ruta);\norg.eclipse.emf.ecore.resource.ResourceSet resourceSet= new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();\norg.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);\ntry {\nresource.load(java.util.Collections.EMPTY_MAP);\nmodelFactory = (ModelFactory) resource.getContents().get(0);\n} catch (java.io.IOException e) {\n// TO-DO Auto-generated catch block\ne.printStackTrace();\n}\n\nreturn modelFactory;\n'"
	 * @generated
	 */
	ModelFactory cargar(String ruta);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='//TODO implementarModelo\n'"
	 * @generated
	 */
	void implementarModelo();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model rutaDataType="cootracir.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='ModelFactory modelFactory = this;\norg.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI(\"platform:/resource/\"+ruta);\norg.eclipse.emf.ecore.resource.ResourceSet resourceSet= new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();\norg.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);\nresource.getContents().add(modelFactory);\ntry {\nresource.save(java.util.Collections.EMPTY_MAP);\n} catch (java.io.IOException e) {\n// TO-DO Auto-generated catch block\ne.printStackTrace();\n}\n\nreturn;\n'"
	 * @generated
	 */
	void salvar(String ruta);

} // ModelFactory
