/**
 */
package cootracir.domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Liquidacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cootracir.domain.Liquidacion#getLstBus <em>Lst Bus</em>}</li>
 *   <li>{@link cootracir.domain.Liquidacion#getCajero <em>Cajero</em>}</li>
 *   <li>{@link cootracir.domain.Liquidacion#getConductor <em>Conductor</em>}</li>
 *   <li>{@link cootracir.domain.Liquidacion#getCostes <em>Costes</em>}</li>
 *   <li>{@link cootracir.domain.Liquidacion#getEstado <em>Estado</em>}</li>
 *   <li>{@link cootracir.domain.Liquidacion#getId <em>Id</em>}</li>
 *   <li>{@link cootracir.domain.Liquidacion#getValorLiquidacion <em>Valor Liquidacion</em>}</li>
 *   <li>{@link cootracir.domain.Liquidacion#getFactoryGestionInventario <em>Factory Gestion Inventario</em>}</li>
 * </ul>
 *
 * @see cootracir.domain.DomainPackage#getLiquidacion()
 * @model
 * @generated
 */
public interface Liquidacion extends EObject {
	/**
	 * Returns the value of the '<em><b>Lst Bus</b></em>' reference list.
	 * The list contents are of type {@link cootracir.domain.Bus}.
	 * It is bidirectional and its opposite is '{@link cootracir.domain.Bus#getLstLiquidacion <em>Lst Liquidacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Bus</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Bus</em>' reference list.
	 * @see cootracir.domain.DomainPackage#getLiquidacion_LstBus()
	 * @see cootracir.domain.Bus#getLstLiquidacion
	 * @model opposite="lstLiquidacion"
	 * @generated
	 */
	EList<Bus> getLstBus();

	/**
	 * Returns the value of the '<em><b>Cajero</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cootracir.domain.Cajero#getLstLiquidaciones <em>Lst Liquidaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cajero</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cajero</em>' reference.
	 * @see #setCajero(Cajero)
	 * @see cootracir.domain.DomainPackage#getLiquidacion_Cajero()
	 * @see cootracir.domain.Cajero#getLstLiquidaciones
	 * @model opposite="lstLiquidaciones"
	 * @generated
	 */
	Cajero getCajero();

	/**
	 * Sets the value of the '{@link cootracir.domain.Liquidacion#getCajero <em>Cajero</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cajero</em>' reference.
	 * @see #getCajero()
	 * @generated
	 */
	void setCajero(Cajero value);

	/**
	 * Returns the value of the '<em><b>Conductor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cootracir.domain.Conductor#getLstLiquidaciones <em>Lst Liquidaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conductor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conductor</em>' reference.
	 * @see #setConductor(Conductor)
	 * @see cootracir.domain.DomainPackage#getLiquidacion_Conductor()
	 * @see cootracir.domain.Conductor#getLstLiquidaciones
	 * @model opposite="lstLiquidaciones"
	 * @generated
	 */
	Conductor getConductor();

	/**
	 * Sets the value of the '{@link cootracir.domain.Liquidacion#getConductor <em>Conductor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conductor</em>' reference.
	 * @see #getConductor()
	 * @generated
	 */
	void setConductor(Conductor value);

	/**
	 * Returns the value of the '<em><b>Costes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Costes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Costes</em>' attribute.
	 * @see #setCostes(String)
	 * @see cootracir.domain.DomainPackage#getLiquidacion_Costes()
	 * @model dataType="cootracir.String"
	 * @generated
	 */
	String getCostes();

	/**
	 * Sets the value of the '{@link cootracir.domain.Liquidacion#getCostes <em>Costes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Costes</em>' attribute.
	 * @see #getCostes()
	 * @generated
	 */
	void setCostes(String value);

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
	 * @see cootracir.domain.DomainPackage#getLiquidacion_Estado()
	 * @model dataType="cootracir.String"
	 * @generated
	 */
	String getEstado();

	/**
	 * Sets the value of the '{@link cootracir.domain.Liquidacion#getEstado <em>Estado</em>}' attribute.
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
	 * @see cootracir.domain.DomainPackage#getLiquidacion_Id()
	 * @model dataType="cootracir.String"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link cootracir.domain.Liquidacion#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Valor Liquidacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valor Liquidacion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valor Liquidacion</em>' attribute.
	 * @see #setValorLiquidacion(String)
	 * @see cootracir.domain.DomainPackage#getLiquidacion_ValorLiquidacion()
	 * @model dataType="cootracir.String"
	 * @generated
	 */
	String getValorLiquidacion();

	/**
	 * Sets the value of the '{@link cootracir.domain.Liquidacion#getValorLiquidacion <em>Valor Liquidacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valor Liquidacion</em>' attribute.
	 * @see #getValorLiquidacion()
	 * @generated
	 */
	void setValorLiquidacion(String value);

	/**
	 * Returns the value of the '<em><b>Factory Gestion Inventario</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link cootracir.domain.FactoryGestionInventario#getLstLiquidaciones <em>Lst Liquidaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Factory Gestion Inventario</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factory Gestion Inventario</em>' container reference.
	 * @see #setFactoryGestionInventario(FactoryGestionInventario)
	 * @see cootracir.domain.DomainPackage#getLiquidacion_FactoryGestionInventario()
	 * @see cootracir.domain.FactoryGestionInventario#getLstLiquidaciones
	 * @model opposite="lstLiquidaciones" transient="false"
	 * @generated
	 */
	FactoryGestionInventario getFactoryGestionInventario();

	/**
	 * Sets the value of the '{@link cootracir.domain.Liquidacion#getFactoryGestionInventario <em>Factory Gestion Inventario</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factory Gestion Inventario</em>' container reference.
	 * @see #getFactoryGestionInventario()
	 * @generated
	 */
	void setFactoryGestionInventario(FactoryGestionInventario value);

} // Liquidacion
