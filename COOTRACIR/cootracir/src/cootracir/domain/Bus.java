/**
 */
package cootracir.domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import cootracir.domain.impl.LiquidacionImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cootracir.domain.Bus#getId <em>Id</em>}</li>
 *   <li>{@link cootracir.domain.Bus#getEstado <em>Estado</em>}</li>
 *   <li>{@link cootracir.domain.Bus#getNumeroPuestos <em>Numero Puestos</em>}</li>
 *   <li>{@link cootracir.domain.Bus#getFactoryGestionInventario <em>Factory Gestion Inventario</em>}</li>
 *   <li>{@link cootracir.domain.Bus#getLstLiquidacion <em>Lst Liquidacion</em>}</li>
 *   <li>{@link cootracir.domain.Bus#getConductor <em>Conductor</em>}</li>
 *   <li>{@link cootracir.domain.Bus#getRegistrador <em>Registrador</em>}</li>
 *   <li>{@link cootracir.domain.Bus#getLstRuta <em>Lst Ruta</em>}</li>
 * </ul>
 *
 * @see cootracir.domain.DomainPackage#getBus()
 * @model
 * @generated
 */
public interface Bus extends EObject {
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
	 * @see cootracir.domain.DomainPackage#getBus_Id()
	 * @model dataType="cootracir.String"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link cootracir.domain.Bus#getId <em>Id</em>}' attribute.
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
	 * @see cootracir.domain.DomainPackage#getBus_Estado()
	 * @model dataType="cootracir.String"
	 * @generated
	 */
	String getEstado();

	/**
	 * Sets the value of the '{@link cootracir.domain.Bus#getEstado <em>Estado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estado</em>' attribute.
	 * @see #getEstado()
	 * @generated
	 */
	void setEstado(String value);

	/**
	 * Returns the value of the '<em><b>Numero Puestos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero Puestos</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero Puestos</em>' attribute.
	 * @see #setNumeroPuestos(String)
	 * @see cootracir.domain.DomainPackage#getBus_NumeroPuestos()
	 * @model dataType="cootracir.String"
	 * @generated
	 */
	String getNumeroPuestos();

	/**
	 * Sets the value of the '{@link cootracir.domain.Bus#getNumeroPuestos <em>Numero Puestos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Puestos</em>' attribute.
	 * @see #getNumeroPuestos()
	 * @generated
	 */
	void setNumeroPuestos(String value);

	/**
	 * Returns the value of the '<em><b>Factory Gestion Inventario</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link cootracir.domain.FactoryGestionInventario#getLstBuses <em>Lst Buses</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Factory Gestion Inventario</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factory Gestion Inventario</em>' container reference.
	 * @see #setFactoryGestionInventario(FactoryGestionInventario)
	 * @see cootracir.domain.DomainPackage#getBus_FactoryGestionInventario()
	 * @see cootracir.domain.FactoryGestionInventario#getLstBuses
	 * @model opposite="lstBuses" transient="false"
	 * @generated
	 */
	FactoryGestionInventario getFactoryGestionInventario();

	/**
	 * Sets the value of the '{@link cootracir.domain.Bus#getFactoryGestionInventario <em>Factory Gestion Inventario</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factory Gestion Inventario</em>' container reference.
	 * @see #getFactoryGestionInventario()
	 * @generated
	 */
	void setFactoryGestionInventario(FactoryGestionInventario value);

	/**
	 * Returns the value of the '<em><b>Lst Liquidacion</b></em>' reference list.
	 * The list contents are of type {@link cootracir.domain.Liquidacion}.
	 * It is bidirectional and its opposite is '{@link cootracir.domain.Liquidacion#getLstBus <em>Lst Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Liquidacion</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Liquidacion</em>' reference list.
	 * @see cootracir.domain.DomainPackage#getBus_LstLiquidacion()
	 * @see cootracir.domain.Liquidacion#getLstBus
	 * @model opposite="lstBus"
	 * @generated
	 */
	EList<Liquidacion> getLstLiquidacion();

	/**
	 * Returns the value of the '<em><b>Conductor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cootracir.domain.Conductor#getBus <em>Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conductor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conductor</em>' reference.
	 * @see #setConductor(Conductor)
	 * @see cootracir.domain.DomainPackage#getBus_Conductor()
	 * @see cootracir.domain.Conductor#getBus
	 * @model opposite="bus"
	 * @generated
	 */
	Conductor getConductor();

	/**
	 * Sets the value of the '{@link cootracir.domain.Bus#getConductor <em>Conductor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conductor</em>' reference.
	 * @see #getConductor()
	 * @generated
	 */
	void setConductor(Conductor value);

	/**
	 * Returns the value of the '<em><b>Registrador</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cootracir.domain.Registrador#getBus <em>Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registrador</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registrador</em>' reference.
	 * @see #setRegistrador(Registrador)
	 * @see cootracir.domain.DomainPackage#getBus_Registrador()
	 * @see cootracir.domain.Registrador#getBus
	 * @model opposite="bus"
	 * @generated
	 */
	Registrador getRegistrador();

	/**
	 * Sets the value of the '{@link cootracir.domain.Bus#getRegistrador <em>Registrador</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registrador</em>' reference.
	 * @see #getRegistrador()
	 * @generated
	 */
	void setRegistrador(Registrador value);

	/**
	 * Returns the value of the '<em><b>Lst Ruta</b></em>' reference list.
	 * The list contents are of type {@link cootracir.domain.Ruta}.
	 * It is bidirectional and its opposite is '{@link cootracir.domain.Ruta#getBus <em>Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Ruta</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Ruta</em>' reference list.
	 * @see cootracir.domain.DomainPackage#getBus_LstRuta()
	 * @see cootracir.domain.Ruta#getBus
	 * @model opposite="bus"
	 * @generated
	 */
	EList<Ruta> getLstRuta();

	void addLiquidacion(LiquidacionImpl liquidacionImpl);

} // Bus
