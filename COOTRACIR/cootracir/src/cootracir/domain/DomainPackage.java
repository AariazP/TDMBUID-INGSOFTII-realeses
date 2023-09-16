/**
 */
package cootracir.domain;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see cootracir.domain.DomainFactory
 * @model kind="package"
 * @generated
 */
public interface DomainPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "domain";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///cootracir/domain.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cootracir.domain";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DomainPackage eINSTANCE = cootracir.domain.impl.DomainPackageImpl.init();

	/**
	 * The meta object id for the '{@link cootracir.domain.impl.AnalistaImpl <em>Analista</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cootracir.domain.impl.AnalistaImpl
	 * @see cootracir.domain.impl.DomainPackageImpl#getAnalista()
	 * @generated
	 */
	int ANALISTA = 0;

	/**
	 * The feature id for the '<em><b>Direccion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALISTA__DIRECCION = 0;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALISTA__EMAIL = 1;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALISTA__ESTADO = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALISTA__ID = 3;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALISTA__NOMBRE = 4;

	/**
	 * The feature id for the '<em><b>Telefono</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALISTA__TELEFONO = 5;

	/**
	 * The feature id for the '<em><b>Factory Gestion Humana</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALISTA__FACTORY_GESTION_HUMANA = 6;

	/**
	 * The feature id for the '<em><b>Lst Conductores</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALISTA__LST_CONDUCTORES = 7;

	/**
	 * The number of structural features of the '<em>Analista</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALISTA_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link cootracir.domain.impl.BusImpl <em>Bus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cootracir.domain.impl.BusImpl
	 * @see cootracir.domain.impl.DomainPackageImpl#getBus()
	 * @generated
	 */
	int BUS = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__ID = 0;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__ESTADO = 1;

	/**
	 * The feature id for the '<em><b>Numero Puestos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__NUMERO_PUESTOS = 2;

	/**
	 * The feature id for the '<em><b>Factory Gestion Inventario</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__FACTORY_GESTION_INVENTARIO = 3;

	/**
	 * The feature id for the '<em><b>Lst Liquidacion</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__LST_LIQUIDACION = 4;

	/**
	 * The feature id for the '<em><b>Conductor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__CONDUCTOR = 5;

	/**
	 * The feature id for the '<em><b>Registrador</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__REGISTRADOR = 6;

	/**
	 * The feature id for the '<em><b>Lst Ruta</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__LST_RUTA = 7;

	/**
	 * The number of structural features of the '<em>Bus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link cootracir.domain.impl.CajeroImpl <em>Cajero</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cootracir.domain.impl.CajeroImpl
	 * @see cootracir.domain.impl.DomainPackageImpl#getCajero()
	 * @generated
	 */
	int CAJERO = 2;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAJERO__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAJERO__ID = 1;

	/**
	 * The feature id for the '<em><b>Edad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAJERO__EDAD = 2;

	/**
	 * The feature id for the '<em><b>Telefono</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAJERO__TELEFONO = 3;

	/**
	 * The feature id for the '<em><b>Dinero Recibido</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAJERO__DINERO_RECIBIDO = 4;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAJERO__EMAIL = 5;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAJERO__ESTADO = 6;

	/**
	 * The feature id for the '<em><b>Factory Gestion Humana</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAJERO__FACTORY_GESTION_HUMANA = 7;

	/**
	 * The feature id for the '<em><b>Lst Conductores</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAJERO__LST_CONDUCTORES = 8;

	/**
	 * The feature id for the '<em><b>Lst Liquidaciones</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAJERO__LST_LIQUIDACIONES = 9;

	/**
	 * The number of structural features of the '<em>Cajero</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAJERO_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link cootracir.domain.impl.ConductorImpl <em>Conductor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cootracir.domain.impl.ConductorImpl
	 * @see cootracir.domain.impl.DomainPackageImpl#getConductor()
	 * @generated
	 */
	int CONDUCTOR = 3;

	/**
	 * The feature id for the '<em><b>Analista</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__ANALISTA = 0;

	/**
	 * The feature id for the '<em><b>Cajero</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__CAJERO = 1;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__NOMBRE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__ID = 3;

	/**
	 * The feature id for the '<em><b>Telefono</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__TELEFONO = 4;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__EMAIL = 5;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__ESTADO = 6;

	/**
	 * The feature id for the '<em><b>Bus</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__BUS = 7;

	/**
	 * The feature id for the '<em><b>Factory Gestion Humana</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__FACTORY_GESTION_HUMANA = 8;

	/**
	 * The feature id for the '<em><b>Lst Registrador</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__LST_REGISTRADOR = 9;

	/**
	 * The feature id for the '<em><b>Lst Bus</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__LST_BUS = 10;

	/**
	 * The feature id for the '<em><b>Lst Liquidaciones</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__LST_LIQUIDACIONES = 11;

	/**
	 * The number of structural features of the '<em>Conductor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_FEATURE_COUNT = 12;

	/**
	 * The meta object id for the '{@link cootracir.domain.impl.DetalleRegistroImpl <em>Detalle Registro</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cootracir.domain.impl.DetalleRegistroImpl
	 * @see cootracir.domain.impl.DomainPackageImpl#getDetalleRegistro()
	 * @generated
	 */
	int DETALLE_REGISTRO = 4;

	/**
	 * The feature id for the '<em><b>Lugar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETALLE_REGISTRO__LUGAR = 0;

	/**
	 * The feature id for the '<em><b>Hora</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETALLE_REGISTRO__HORA = 1;

	/**
	 * The feature id for the '<em><b>Incidencia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETALLE_REGISTRO__INCIDENCIA = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETALLE_REGISTRO__ID = 3;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETALLE_REGISTRO__ESTADO = 4;

	/**
	 * The feature id for the '<em><b>Registrador</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETALLE_REGISTRO__REGISTRADOR = 5;

	/**
	 * The feature id for the '<em><b>Factory Gestion Inventario</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETALLE_REGISTRO__FACTORY_GESTION_INVENTARIO = 6;

	/**
	 * The feature id for the '<em><b>Ruta</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETALLE_REGISTRO__RUTA = 7;

	/**
	 * The number of structural features of the '<em>Detalle Registro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETALLE_REGISTRO_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link cootracir.domain.impl.DomainImpl <em>Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cootracir.domain.impl.DomainImpl
	 * @see cootracir.domain.impl.DomainPackageImpl#getDomain()
	 * @generated
	 */
	int DOMAIN = 5;

	/**
	 * The feature id for the '<em><b>The Model Factory</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__THE_MODEL_FACTORY = 0;

	/**
	 * The feature id for the '<em><b>Factory Gestion Humana</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__FACTORY_GESTION_HUMANA = 1;

	/**
	 * The feature id for the '<em><b>Factory Gestion Inventario</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__FACTORY_GESTION_INVENTARIO = 2;

	/**
	 * The feature id for the '<em><b>The UI</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__THE_UI = 3;

	/**
	 * The number of structural features of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link cootracir.domain.impl.FactoryGestionHumanaImpl <em>Factory Gestion Humana</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cootracir.domain.impl.FactoryGestionHumanaImpl
	 * @see cootracir.domain.impl.DomainPackageImpl#getFactoryGestionHumana()
	 * @generated
	 */
	int FACTORY_GESTION_HUMANA = 6;

	/**
	 * The feature id for the '<em><b>Lst Analistas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_GESTION_HUMANA__LST_ANALISTAS = 0;

	/**
	 * The feature id for the '<em><b>Lst Cajeros</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_GESTION_HUMANA__LST_CAJEROS = 1;

	/**
	 * The feature id for the '<em><b>Lst Conductores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_GESTION_HUMANA__LST_CONDUCTORES = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_GESTION_HUMANA__ID = 3;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_GESTION_HUMANA__ESTADO = 4;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_GESTION_HUMANA__DOMAIN = 5;

	/**
	 * The number of structural features of the '<em>Factory Gestion Humana</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_GESTION_HUMANA_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link cootracir.domain.impl.FactoryGestionInventarioImpl <em>Factory Gestion Inventario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cootracir.domain.impl.FactoryGestionInventarioImpl
	 * @see cootracir.domain.impl.DomainPackageImpl#getFactoryGestionInventario()
	 * @generated
	 */
	int FACTORY_GESTION_INVENTARIO = 7;

	/**
	 * The feature id for the '<em><b>Lst Buses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_GESTION_INVENTARIO__LST_BUSES = 0;

	/**
	 * The feature id for the '<em><b>Lst Detalle Registro</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_GESTION_INVENTARIO__LST_DETALLE_REGISTRO = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_GESTION_INVENTARIO__ID = 2;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_GESTION_INVENTARIO__ESTADO = 3;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_GESTION_INVENTARIO__DOMAIN = 4;

	/**
	 * The feature id for the '<em><b>Lst Liquidaciones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_GESTION_INVENTARIO__LST_LIQUIDACIONES = 5;

	/**
	 * The feature id for the '<em><b>Lst Registrador</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_GESTION_INVENTARIO__LST_REGISTRADOR = 6;

	/**
	 * The feature id for the '<em><b>Lst Ruta</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_GESTION_INVENTARIO__LST_RUTA = 7;

	/**
	 * The number of structural features of the '<em>Factory Gestion Inventario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_GESTION_INVENTARIO_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link cootracir.domain.impl.LiquidacionImpl <em>Liquidacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cootracir.domain.impl.LiquidacionImpl
	 * @see cootracir.domain.impl.DomainPackageImpl#getLiquidacion()
	 * @generated
	 */
	int LIQUIDACION = 8;

	/**
	 * The feature id for the '<em><b>Lst Bus</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIQUIDACION__LST_BUS = 0;

	/**
	 * The feature id for the '<em><b>Cajero</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIQUIDACION__CAJERO = 1;

	/**
	 * The feature id for the '<em><b>Conductor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIQUIDACION__CONDUCTOR = 2;

	/**
	 * The feature id for the '<em><b>Costes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIQUIDACION__COSTES = 3;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIQUIDACION__ESTADO = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIQUIDACION__ID = 5;

	/**
	 * The feature id for the '<em><b>Valor Liquidacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIQUIDACION__VALOR_LIQUIDACION = 6;

	/**
	 * The feature id for the '<em><b>Factory Gestion Inventario</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIQUIDACION__FACTORY_GESTION_INVENTARIO = 7;

	/**
	 * The number of structural features of the '<em>Liquidacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIQUIDACION_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link cootracir.domain.impl.RegistradorImpl <em>Registrador</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cootracir.domain.impl.RegistradorImpl
	 * @see cootracir.domain.impl.DomainPackageImpl#getRegistrador()
	 * @generated
	 */
	int REGISTRADOR = 9;

	/**
	 * The feature id for the '<em><b>Lst Detalle Registros</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRADOR__LST_DETALLE_REGISTROS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRADOR__ID = 1;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRADOR__ESTADO = 2;

	/**
	 * The feature id for the '<em><b>Bus</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRADOR__BUS = 3;

	/**
	 * The feature id for the '<em><b>Factory Gestion Inventario</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRADOR__FACTORY_GESTION_INVENTARIO = 4;

	/**
	 * The number of structural features of the '<em>Registrador</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRADOR_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link cootracir.domain.impl.RutaImpl <em>Ruta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cootracir.domain.impl.RutaImpl
	 * @see cootracir.domain.impl.DomainPackageImpl#getRuta()
	 * @generated
	 */
	int RUTA = 10;

	/**
	 * The feature id for the '<em><b>Lst Detalle Registro</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUTA__LST_DETALLE_REGISTRO = 0;

	/**
	 * The feature id for the '<em><b>Precio Ruta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUTA__PRECIO_RUTA = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUTA__ID = 2;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUTA__ESTADO = 3;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUTA__NOMBRE = 4;

	/**
	 * The feature id for the '<em><b>Bus</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUTA__BUS = 5;

	/**
	 * The feature id for the '<em><b>Factory Gestion Inventario</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUTA__FACTORY_GESTION_INVENTARIO = 6;

	/**
	 * The number of structural features of the '<em>Ruta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUTA_FEATURE_COUNT = 7;


	/**
	 * Returns the meta object for class '{@link cootracir.domain.Analista <em>Analista</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analista</em>'.
	 * @see cootracir.domain.Analista
	 * @generated
	 */
	EClass getAnalista();

	/**
	 * Returns the meta object for the attribute '{@link cootracir.domain.Analista#getDireccion <em>Direccion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direccion</em>'.
	 * @see cootracir.domain.Analista#getDireccion()
	 * @see #getAnalista()
	 * @generated
	 */
	EAttribute getAnalista_Direccion();

	/**
	 * Returns the meta object for the attribute '{@link cootracir.domain.Analista#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see cootracir.domain.Analista#getEmail()
	 * @see #getAnalista()
	 * @generated
	 */
	EAttribute getAnalista_Email();

	/**
	 * Returns the meta object for the attribute '{@link cootracir.domain.Analista#getEstado <em>Estado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estado</em>'.
	 * @see cootracir.domain.Analista#getEstado()
	 * @see #getAnalista()
	 * @generated
	 */
	EAttribute getAnalista_Estado();

	/**
	 * Returns the meta object for the attribute '{@link cootracir.domain.Analista#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see cootracir.domain.Analista#getId()
	 * @see #getAnalista()
	 * @generated
	 */
	EAttribute getAnalista_Id();

	/**
	 * Returns the meta object for the attribute '{@link cootracir.domain.Analista#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see cootracir.domain.Analista#getNombre()
	 * @see #getAnalista()
	 * @generated
	 */
	EAttribute getAnalista_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link cootracir.domain.Analista#getTelefono <em>Telefono</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Telefono</em>'.
	 * @see cootracir.domain.Analista#getTelefono()
	 * @see #getAnalista()
	 * @generated
	 */
	EAttribute getAnalista_Telefono();

	/**
	 * Returns the meta object for the container reference '{@link cootracir.domain.Analista#getFactoryGestionHumana <em>Factory Gestion Humana</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Factory Gestion Humana</em>'.
	 * @see cootracir.domain.Analista#getFactoryGestionHumana()
	 * @see #getAnalista()
	 * @generated
	 */
	EReference getAnalista_FactoryGestionHumana();

	/**
	 * Returns the meta object for the reference list '{@link cootracir.domain.Analista#getLstConductores <em>Lst Conductores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lst Conductores</em>'.
	 * @see cootracir.domain.Analista#getLstConductores()
	 * @see #getAnalista()
	 * @generated
	 */
	EReference getAnalista_LstConductores();

	/**
	 * Returns the meta object for class '{@link cootracir.domain.Bus <em>Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus</em>'.
	 * @see cootracir.domain.Bus
	 * @generated
	 */
	EClass getBus();

	/**
	 * Returns the meta object for the attribute '{@link cootracir.domain.Bus#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see cootracir.domain.Bus#getId()
	 * @see #getBus()
	 * @generated
	 */
	EAttribute getBus_Id();

	/**
	 * Returns the meta object for the attribute '{@link cootracir.domain.Bus#getEstado <em>Estado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estado</em>'.
	 * @see cootracir.domain.Bus#getEstado()
	 * @see #getBus()
	 * @generated
	 */
	EAttribute getBus_Estado();

	/**
	 * Returns the meta object for the attribute '{@link cootracir.domain.Bus#getNumeroPuestos <em>Numero Puestos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numero Puestos</em>'.
	 * @see cootracir.domain.Bus#getNumeroPuestos()
	 * @see #getBus()
	 * @generated
	 */
	EAttribute getBus_NumeroPuestos();

	/**
	 * Returns the meta object for the container reference '{@link cootracir.domain.Bus#getFactoryGestionInventario <em>Factory Gestion Inventario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Factory Gestion Inventario</em>'.
	 * @see cootracir.domain.Bus#getFactoryGestionInventario()
	 * @see #getBus()
	 * @generated
	 */
	EReference getBus_FactoryGestionInventario();

	/**
	 * Returns the meta object for the reference list '{@link cootracir.domain.Bus#getLstLiquidacion <em>Lst Liquidacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lst Liquidacion</em>'.
	 * @see cootracir.domain.Bus#getLstLiquidacion()
	 * @see #getBus()
	 * @generated
	 */
	EReference getBus_LstLiquidacion();

	/**
	 * Returns the meta object for the reference '{@link cootracir.domain.Bus#getConductor <em>Conductor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conductor</em>'.
	 * @see cootracir.domain.Bus#getConductor()
	 * @see #getBus()
	 * @generated
	 */
	EReference getBus_Conductor();

	/**
	 * Returns the meta object for the reference '{@link cootracir.domain.Bus#getRegistrador <em>Registrador</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Registrador</em>'.
	 * @see cootracir.domain.Bus#getRegistrador()
	 * @see #getBus()
	 * @generated
	 */
	EReference getBus_Registrador();

	/**
	 * Returns the meta object for the reference list '{@link cootracir.domain.Bus#getLstRuta <em>Lst Ruta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lst Ruta</em>'.
	 * @see cootracir.domain.Bus#getLstRuta()
	 * @see #getBus()
	 * @generated
	 */
	EReference getBus_LstRuta();

	/**
	 * Returns the meta object for class '{@link cootracir.domain.Cajero <em>Cajero</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cajero</em>'.
	 * @see cootracir.domain.Cajero
	 * @generated
	 */
	EClass getCajero();

	/**
	 * Returns the meta object for the attribute '{@link cootracir.domain.Cajero#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see cootracir.domain.Cajero#getNombre()
	 * @see #getCajero()
	 * @generated
	 */
	EAttribute getCajero_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link cootracir.domain.Cajero#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see cootracir.domain.Cajero#getId()
	 * @see #getCajero()
	 * @generated
	 */
	EAttribute getCajero_Id();

	/**
	 * Returns the meta object for the attribute '{@link cootracir.domain.Cajero#getEdad <em>Edad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edad</em>'.
	 * @see cootracir.domain.Cajero#getEdad()
	 * @see #getCajero()
	 * @generated
	 */
	EAttribute getCajero_Edad();

	/**
	 * Returns the meta object for the attribute '{@link cootracir.domain.Cajero#getTelefono <em>Telefono</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Telefono</em>'.
	 * @see cootracir.domain.Cajero#getTelefono()
	 * @see #getCajero()
	 * @generated
	 */
	EAttribute getCajero_Telefono();

	/**
	 * Returns the meta object for the attribute '{@link cootracir.domain.Cajero#getDineroRecibido <em>Dinero Recibido</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dinero Recibido</em>'.
	 * @see cootracir.domain.Cajero#getDineroRecibido()
	 * @see #getCajero()
	 * @generated
	 */
	EAttribute getCajero_DineroRecibido();

	/**
	 * Returns the meta object for the attribute '{@link cootracir.domain.Cajero#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see cootracir.domain.Cajero#getEmail()
	 * @see #getCajero()
	 * @generated
	 */
	EAttribute getCajero_Email();

	/**
	 * Returns the meta object for the attribute '{@link cootracir.domain.Cajero#getEstado <em>Estado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estado</em>'.
	 * @see cootracir.domain.Cajero#getEstado()
	 * @see #getCajero()
	 * @generated
	 */
	EAttribute getCajero_Estado();

	/**
	 * Returns the meta object for the container reference '{@link cootracir.domain.Cajero#getFactoryGestionHumana <em>Factory Gestion Humana</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Factory Gestion Humana</em>'.
	 * @see cootracir.domain.Cajero#getFactoryGestionHumana()
	 * @see #getCajero()
	 * @generated
	 */
	EReference getCajero_FactoryGestionHumana();

	/**
	 * Returns the meta object for the reference list '{@link cootracir.domain.Cajero#getLstConductores <em>Lst Conductores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lst Conductores</em>'.
	 * @see cootracir.domain.Cajero#getLstConductores()
	 * @see #getCajero()
	 * @generated
	 */
	EReference getCajero_LstConductores();

	/**
	 * Returns the meta object for the reference list '{@link cootracir.domain.Cajero#getLstLiquidaciones <em>Lst Liquidaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lst Liquidaciones</em>'.
	 * @see cootracir.domain.Cajero#getLstLiquidaciones()
	 * @see #getCajero()
	 * @generated
	 */
	EReference getCajero_LstLiquidaciones();

	/**
	 * Returns the meta object for class '{@link cootracir.domain.Conductor <em>Conductor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conductor</em>'.
	 * @see cootracir.domain.Conductor
	 * @generated
	 */
	EClass getConductor();

	/**
	 * Returns the meta object for the reference '{@link cootracir.domain.Conductor#getAnalista <em>Analista</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Analista</em>'.
	 * @see cootracir.domain.Conductor#getAnalista()
	 * @see #getConductor()
	 * @generated
	 */
	EReference getConductor_Analista();

	/**
	 * Returns the meta object for the reference '{@link cootracir.domain.Conductor#getCajero <em>Cajero</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cajero</em>'.
	 * @see cootracir.domain.Conductor#getCajero()
	 * @see #getConductor()
	 * @generated
	 */
	EReference getConductor_Cajero();

	/**
	 * Returns the meta object for the attribute '{@link cootracir.domain.Conductor#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see cootracir.domain.Conductor#getNombre()
	 * @see #getConductor()
	 * @generated
	 */
	EAttribute getConductor_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link cootracir.domain.Conductor#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see cootracir.domain.Conductor#getId()
	 * @see #getConductor()
	 * @generated
	 */
	EAttribute getConductor_Id();

	/**
	 * Returns the meta object for the attribute '{@link cootracir.domain.Conductor#getTelefono <em>Telefono</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Telefono</em>'.
	 * @see cootracir.domain.Conductor#getTelefono()
	 * @see #getConductor()
	 * @generated
	 */
	EAttribute getConductor_Telefono();

	/**
	 * Returns the meta object for the attribute '{@link cootracir.domain.Conductor#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see cootracir.domain.Conductor#getEmail()
	 * @see #getConductor()
	 * @generated
	 */
	EAttribute getConductor_Email();

	/**
	 * Returns the meta object for the attribute '{@link cootracir.domain.Conductor#getEstado <em>Estado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estado</em>'.
	 * @see cootracir.domain.Conductor#getEstado()
	 * @see #getConductor()
	 * @generated
	 */
	EAttribute getConductor_Estado();

	/**
	 * Returns the meta object for the reference '{@link cootracir.domain.Conductor#getBus <em>Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bus</em>'.
	 * @see cootracir.domain.Conductor#getBus()
	 * @see #getConductor()
	 * @generated
	 */
	EReference getConductor_Bus();

	/**
	 * Returns the meta object for the container reference '{@link cootracir.domain.Conductor#getFactoryGestionHumana <em>Factory Gestion Humana</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Factory Gestion Humana</em>'.
	 * @see cootracir.domain.Conductor#getFactoryGestionHumana()
	 * @see #getConductor()
	 * @generated
	 */
	EReference getConductor_FactoryGestionHumana();

	/**
	 * Returns the meta object for the reference list '{@link cootracir.domain.Conductor#getLstRegistrador <em>Lst Registrador</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lst Registrador</em>'.
	 * @see cootracir.domain.Conductor#getLstRegistrador()
	 * @see #getConductor()
	 * @generated
	 */
	EReference getConductor_LstRegistrador();

	/**
	 * Returns the meta object for the reference list '{@link cootracir.domain.Conductor#getLstBus <em>Lst Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lst Bus</em>'.
	 * @see cootracir.domain.Conductor#getLstBus()
	 * @see #getConductor()
	 * @generated
	 */
	EReference getConductor_LstBus();

	/**
	 * Returns the meta object for the reference list '{@link cootracir.domain.Conductor#getLstLiquidaciones <em>Lst Liquidaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lst Liquidaciones</em>'.
	 * @see cootracir.domain.Conductor#getLstLiquidaciones()
	 * @see #getConductor()
	 * @generated
	 */
	EReference getConductor_LstLiquidaciones();

	/**
	 * Returns the meta object for class '{@link cootracir.domain.DetalleRegistro <em>Detalle Registro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Detalle Registro</em>'.
	 * @see cootracir.domain.DetalleRegistro
	 * @generated
	 */
	EClass getDetalleRegistro();

	/**
	 * Returns the meta object for the attribute '{@link cootracir.domain.DetalleRegistro#getLugar <em>Lugar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lugar</em>'.
	 * @see cootracir.domain.DetalleRegistro#getLugar()
	 * @see #getDetalleRegistro()
	 * @generated
	 */
	EAttribute getDetalleRegistro_Lugar();

	/**
	 * Returns the meta object for the attribute '{@link cootracir.domain.DetalleRegistro#getHora <em>Hora</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hora</em>'.
	 * @see cootracir.domain.DetalleRegistro#getHora()
	 * @see #getDetalleRegistro()
	 * @generated
	 */
	EAttribute getDetalleRegistro_Hora();

	/**
	 * Returns the meta object for the attribute '{@link cootracir.domain.DetalleRegistro#getIncidencia <em>Incidencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Incidencia</em>'.
	 * @see cootracir.domain.DetalleRegistro#getIncidencia()
	 * @see #getDetalleRegistro()
	 * @generated
	 */
	EAttribute getDetalleRegistro_Incidencia();

	/**
	 * Returns the meta object for the attribute '{@link cootracir.domain.DetalleRegistro#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see cootracir.domain.DetalleRegistro#getId()
	 * @see #getDetalleRegistro()
	 * @generated
	 */
	EAttribute getDetalleRegistro_Id();

	/**
	 * Returns the meta object for the attribute '{@link cootracir.domain.DetalleRegistro#getEstado <em>Estado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estado</em>'.
	 * @see cootracir.domain.DetalleRegistro#getEstado()
	 * @see #getDetalleRegistro()
	 * @generated
	 */
	EAttribute getDetalleRegistro_Estado();

	/**
	 * Returns the meta object for the reference '{@link cootracir.domain.DetalleRegistro#getRegistrador <em>Registrador</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Registrador</em>'.
	 * @see cootracir.domain.DetalleRegistro#getRegistrador()
	 * @see #getDetalleRegistro()
	 * @generated
	 */
	EReference getDetalleRegistro_Registrador();

	/**
	 * Returns the meta object for the container reference '{@link cootracir.domain.DetalleRegistro#getFactoryGestionInventario <em>Factory Gestion Inventario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Factory Gestion Inventario</em>'.
	 * @see cootracir.domain.DetalleRegistro#getFactoryGestionInventario()
	 * @see #getDetalleRegistro()
	 * @generated
	 */
	EReference getDetalleRegistro_FactoryGestionInventario();

	/**
	 * Returns the meta object for the reference '{@link cootracir.domain.DetalleRegistro#getRuta <em>Ruta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ruta</em>'.
	 * @see cootracir.domain.DetalleRegistro#getRuta()
	 * @see #getDetalleRegistro()
	 * @generated
	 */
	EReference getDetalleRegistro_Ruta();

	/**
	 * Returns the meta object for class '{@link cootracir.domain.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain</em>'.
	 * @see cootracir.domain.Domain
	 * @generated
	 */
	EClass getDomain();

	/**
	 * Returns the meta object for the container reference '{@link cootracir.domain.Domain#getTheModelFactory <em>The Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>The Model Factory</em>'.
	 * @see cootracir.domain.Domain#getTheModelFactory()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_TheModelFactory();

	/**
	 * Returns the meta object for the containment reference '{@link cootracir.domain.Domain#getFactoryGestionHumana <em>Factory Gestion Humana</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Factory Gestion Humana</em>'.
	 * @see cootracir.domain.Domain#getFactoryGestionHumana()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_FactoryGestionHumana();

	/**
	 * Returns the meta object for the containment reference '{@link cootracir.domain.Domain#getFactoryGestionInventario <em>Factory Gestion Inventario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Factory Gestion Inventario</em>'.
	 * @see cootracir.domain.Domain#getFactoryGestionInventario()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_FactoryGestionInventario();

	/**
	 * Returns the meta object for the reference '{@link cootracir.domain.Domain#getTheUI <em>The UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>The UI</em>'.
	 * @see cootracir.domain.Domain#getTheUI()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_TheUI();

	/**
	 * Returns the meta object for class '{@link cootracir.domain.FactoryGestionHumana <em>Factory Gestion Humana</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Factory Gestion Humana</em>'.
	 * @see cootracir.domain.FactoryGestionHumana
	 * @generated
	 */
	EClass getFactoryGestionHumana();

	/**
	 * Returns the meta object for the containment reference list '{@link cootracir.domain.FactoryGestionHumana#getLstAnalistas <em>Lst Analistas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Analistas</em>'.
	 * @see cootracir.domain.FactoryGestionHumana#getLstAnalistas()
	 * @see #getFactoryGestionHumana()
	 * @generated
	 */
	EReference getFactoryGestionHumana_LstAnalistas();

	/**
	 * Returns the meta object for the containment reference list '{@link cootracir.domain.FactoryGestionHumana#getLstCajeros <em>Lst Cajeros</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Cajeros</em>'.
	 * @see cootracir.domain.FactoryGestionHumana#getLstCajeros()
	 * @see #getFactoryGestionHumana()
	 * @generated
	 */
	EReference getFactoryGestionHumana_LstCajeros();

	/**
	 * Returns the meta object for the containment reference list '{@link cootracir.domain.FactoryGestionHumana#getLstConductores <em>Lst Conductores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Conductores</em>'.
	 * @see cootracir.domain.FactoryGestionHumana#getLstConductores()
	 * @see #getFactoryGestionHumana()
	 * @generated
	 */
	EReference getFactoryGestionHumana_LstConductores();

	/**
	 * Returns the meta object for the attribute '{@link cootracir.domain.FactoryGestionHumana#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see cootracir.domain.FactoryGestionHumana#getId()
	 * @see #getFactoryGestionHumana()
	 * @generated
	 */
	EAttribute getFactoryGestionHumana_Id();

	/**
	 * Returns the meta object for the attribute '{@link cootracir.domain.FactoryGestionHumana#getEstado <em>Estado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estado</em>'.
	 * @see cootracir.domain.FactoryGestionHumana#getEstado()
	 * @see #getFactoryGestionHumana()
	 * @generated
	 */
	EAttribute getFactoryGestionHumana_Estado();

	/**
	 * Returns the meta object for the container reference '{@link cootracir.domain.FactoryGestionHumana#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Domain</em>'.
	 * @see cootracir.domain.FactoryGestionHumana#getDomain()
	 * @see #getFactoryGestionHumana()
	 * @generated
	 */
	EReference getFactoryGestionHumana_Domain();

	/**
	 * Returns the meta object for class '{@link cootracir.domain.FactoryGestionInventario <em>Factory Gestion Inventario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Factory Gestion Inventario</em>'.
	 * @see cootracir.domain.FactoryGestionInventario
	 * @generated
	 */
	EClass getFactoryGestionInventario();

	/**
	 * Returns the meta object for the containment reference list '{@link cootracir.domain.FactoryGestionInventario#getLstBuses <em>Lst Buses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Buses</em>'.
	 * @see cootracir.domain.FactoryGestionInventario#getLstBuses()
	 * @see #getFactoryGestionInventario()
	 * @generated
	 */
	EReference getFactoryGestionInventario_LstBuses();

	/**
	 * Returns the meta object for the containment reference list '{@link cootracir.domain.FactoryGestionInventario#getLstDetalleRegistro <em>Lst Detalle Registro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Detalle Registro</em>'.
	 * @see cootracir.domain.FactoryGestionInventario#getLstDetalleRegistro()
	 * @see #getFactoryGestionInventario()
	 * @generated
	 */
	EReference getFactoryGestionInventario_LstDetalleRegistro();

	/**
	 * Returns the meta object for the attribute '{@link cootracir.domain.FactoryGestionInventario#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see cootracir.domain.FactoryGestionInventario#getId()
	 * @see #getFactoryGestionInventario()
	 * @generated
	 */
	EAttribute getFactoryGestionInventario_Id();

	/**
	 * Returns the meta object for the attribute '{@link cootracir.domain.FactoryGestionInventario#getEstado <em>Estado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estado</em>'.
	 * @see cootracir.domain.FactoryGestionInventario#getEstado()
	 * @see #getFactoryGestionInventario()
	 * @generated
	 */
	EAttribute getFactoryGestionInventario_Estado();

	/**
	 * Returns the meta object for the container reference '{@link cootracir.domain.FactoryGestionInventario#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Domain</em>'.
	 * @see cootracir.domain.FactoryGestionInventario#getDomain()
	 * @see #getFactoryGestionInventario()
	 * @generated
	 */
	EReference getFactoryGestionInventario_Domain();

	/**
	 * Returns the meta object for the containment reference list '{@link cootracir.domain.FactoryGestionInventario#getLstLiquidaciones <em>Lst Liquidaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Liquidaciones</em>'.
	 * @see cootracir.domain.FactoryGestionInventario#getLstLiquidaciones()
	 * @see #getFactoryGestionInventario()
	 * @generated
	 */
	EReference getFactoryGestionInventario_LstLiquidaciones();

	/**
	 * Returns the meta object for the containment reference list '{@link cootracir.domain.FactoryGestionInventario#getLstRegistrador <em>Lst Registrador</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Registrador</em>'.
	 * @see cootracir.domain.FactoryGestionInventario#getLstRegistrador()
	 * @see #getFactoryGestionInventario()
	 * @generated
	 */
	EReference getFactoryGestionInventario_LstRegistrador();

	/**
	 * Returns the meta object for the containment reference list '{@link cootracir.domain.FactoryGestionInventario#getLstRuta <em>Lst Ruta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Ruta</em>'.
	 * @see cootracir.domain.FactoryGestionInventario#getLstRuta()
	 * @see #getFactoryGestionInventario()
	 * @generated
	 */
	EReference getFactoryGestionInventario_LstRuta();

	/**
	 * Returns the meta object for class '{@link cootracir.domain.Liquidacion <em>Liquidacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Liquidacion</em>'.
	 * @see cootracir.domain.Liquidacion
	 * @generated
	 */
	EClass getLiquidacion();

	/**
	 * Returns the meta object for the reference list '{@link cootracir.domain.Liquidacion#getLstBus <em>Lst Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lst Bus</em>'.
	 * @see cootracir.domain.Liquidacion#getLstBus()
	 * @see #getLiquidacion()
	 * @generated
	 */
	EReference getLiquidacion_LstBus();

	/**
	 * Returns the meta object for the reference '{@link cootracir.domain.Liquidacion#getCajero <em>Cajero</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cajero</em>'.
	 * @see cootracir.domain.Liquidacion#getCajero()
	 * @see #getLiquidacion()
	 * @generated
	 */
	EReference getLiquidacion_Cajero();

	/**
	 * Returns the meta object for the reference '{@link cootracir.domain.Liquidacion#getConductor <em>Conductor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conductor</em>'.
	 * @see cootracir.domain.Liquidacion#getConductor()
	 * @see #getLiquidacion()
	 * @generated
	 */
	EReference getLiquidacion_Conductor();

	/**
	 * Returns the meta object for the attribute '{@link cootracir.domain.Liquidacion#getCostes <em>Costes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Costes</em>'.
	 * @see cootracir.domain.Liquidacion#getCostes()
	 * @see #getLiquidacion()
	 * @generated
	 */
	EAttribute getLiquidacion_Costes();

	/**
	 * Returns the meta object for the attribute '{@link cootracir.domain.Liquidacion#getEstado <em>Estado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estado</em>'.
	 * @see cootracir.domain.Liquidacion#getEstado()
	 * @see #getLiquidacion()
	 * @generated
	 */
	EAttribute getLiquidacion_Estado();

	/**
	 * Returns the meta object for the attribute '{@link cootracir.domain.Liquidacion#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see cootracir.domain.Liquidacion#getId()
	 * @see #getLiquidacion()
	 * @generated
	 */
	EAttribute getLiquidacion_Id();

	/**
	 * Returns the meta object for the attribute '{@link cootracir.domain.Liquidacion#getValorLiquidacion <em>Valor Liquidacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor Liquidacion</em>'.
	 * @see cootracir.domain.Liquidacion#getValorLiquidacion()
	 * @see #getLiquidacion()
	 * @generated
	 */
	EAttribute getLiquidacion_ValorLiquidacion();

	/**
	 * Returns the meta object for the container reference '{@link cootracir.domain.Liquidacion#getFactoryGestionInventario <em>Factory Gestion Inventario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Factory Gestion Inventario</em>'.
	 * @see cootracir.domain.Liquidacion#getFactoryGestionInventario()
	 * @see #getLiquidacion()
	 * @generated
	 */
	EReference getLiquidacion_FactoryGestionInventario();

	/**
	 * Returns the meta object for class '{@link cootracir.domain.Registrador <em>Registrador</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Registrador</em>'.
	 * @see cootracir.domain.Registrador
	 * @generated
	 */
	EClass getRegistrador();

	/**
	 * Returns the meta object for the reference list '{@link cootracir.domain.Registrador#getLstDetalleRegistros <em>Lst Detalle Registros</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lst Detalle Registros</em>'.
	 * @see cootracir.domain.Registrador#getLstDetalleRegistros()
	 * @see #getRegistrador()
	 * @generated
	 */
	EReference getRegistrador_LstDetalleRegistros();

	/**
	 * Returns the meta object for the attribute '{@link cootracir.domain.Registrador#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see cootracir.domain.Registrador#getId()
	 * @see #getRegistrador()
	 * @generated
	 */
	EAttribute getRegistrador_Id();

	/**
	 * Returns the meta object for the attribute '{@link cootracir.domain.Registrador#getEstado <em>Estado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estado</em>'.
	 * @see cootracir.domain.Registrador#getEstado()
	 * @see #getRegistrador()
	 * @generated
	 */
	EAttribute getRegistrador_Estado();

	/**
	 * Returns the meta object for the reference '{@link cootracir.domain.Registrador#getBus <em>Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bus</em>'.
	 * @see cootracir.domain.Registrador#getBus()
	 * @see #getRegistrador()
	 * @generated
	 */
	EReference getRegistrador_Bus();

	/**
	 * Returns the meta object for the container reference '{@link cootracir.domain.Registrador#getFactoryGestionInventario <em>Factory Gestion Inventario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Factory Gestion Inventario</em>'.
	 * @see cootracir.domain.Registrador#getFactoryGestionInventario()
	 * @see #getRegistrador()
	 * @generated
	 */
	EReference getRegistrador_FactoryGestionInventario();

	/**
	 * Returns the meta object for class '{@link cootracir.domain.Ruta <em>Ruta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ruta</em>'.
	 * @see cootracir.domain.Ruta
	 * @generated
	 */
	EClass getRuta();

	/**
	 * Returns the meta object for the reference list '{@link cootracir.domain.Ruta#getLstDetalleRegistro <em>Lst Detalle Registro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lst Detalle Registro</em>'.
	 * @see cootracir.domain.Ruta#getLstDetalleRegistro()
	 * @see #getRuta()
	 * @generated
	 */
	EReference getRuta_LstDetalleRegistro();

	/**
	 * Returns the meta object for the attribute '{@link cootracir.domain.Ruta#getPrecioRuta <em>Precio Ruta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precio Ruta</em>'.
	 * @see cootracir.domain.Ruta#getPrecioRuta()
	 * @see #getRuta()
	 * @generated
	 */
	EAttribute getRuta_PrecioRuta();

	/**
	 * Returns the meta object for the attribute '{@link cootracir.domain.Ruta#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see cootracir.domain.Ruta#getId()
	 * @see #getRuta()
	 * @generated
	 */
	EAttribute getRuta_Id();

	/**
	 * Returns the meta object for the attribute '{@link cootracir.domain.Ruta#getEstado <em>Estado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estado</em>'.
	 * @see cootracir.domain.Ruta#getEstado()
	 * @see #getRuta()
	 * @generated
	 */
	EAttribute getRuta_Estado();

	/**
	 * Returns the meta object for the attribute '{@link cootracir.domain.Ruta#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see cootracir.domain.Ruta#getNombre()
	 * @see #getRuta()
	 * @generated
	 */
	EAttribute getRuta_Nombre();

	/**
	 * Returns the meta object for the reference '{@link cootracir.domain.Ruta#getBus <em>Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bus</em>'.
	 * @see cootracir.domain.Ruta#getBus()
	 * @see #getRuta()
	 * @generated
	 */
	EReference getRuta_Bus();

	/**
	 * Returns the meta object for the container reference '{@link cootracir.domain.Ruta#getFactoryGestionInventario <em>Factory Gestion Inventario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Factory Gestion Inventario</em>'.
	 * @see cootracir.domain.Ruta#getFactoryGestionInventario()
	 * @see #getRuta()
	 * @generated
	 */
	EReference getRuta_FactoryGestionInventario();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DomainFactory getDomainFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link cootracir.domain.impl.AnalistaImpl <em>Analista</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cootracir.domain.impl.AnalistaImpl
		 * @see cootracir.domain.impl.DomainPackageImpl#getAnalista()
		 * @generated
		 */
		EClass ANALISTA = eINSTANCE.getAnalista();

		/**
		 * The meta object literal for the '<em><b>Direccion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALISTA__DIRECCION = eINSTANCE.getAnalista_Direccion();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALISTA__EMAIL = eINSTANCE.getAnalista_Email();

		/**
		 * The meta object literal for the '<em><b>Estado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALISTA__ESTADO = eINSTANCE.getAnalista_Estado();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALISTA__ID = eINSTANCE.getAnalista_Id();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALISTA__NOMBRE = eINSTANCE.getAnalista_Nombre();

		/**
		 * The meta object literal for the '<em><b>Telefono</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALISTA__TELEFONO = eINSTANCE.getAnalista_Telefono();

		/**
		 * The meta object literal for the '<em><b>Factory Gestion Humana</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALISTA__FACTORY_GESTION_HUMANA = eINSTANCE.getAnalista_FactoryGestionHumana();

		/**
		 * The meta object literal for the '<em><b>Lst Conductores</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALISTA__LST_CONDUCTORES = eINSTANCE.getAnalista_LstConductores();

		/**
		 * The meta object literal for the '{@link cootracir.domain.impl.BusImpl <em>Bus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cootracir.domain.impl.BusImpl
		 * @see cootracir.domain.impl.DomainPackageImpl#getBus()
		 * @generated
		 */
		EClass BUS = eINSTANCE.getBus();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUS__ID = eINSTANCE.getBus_Id();

		/**
		 * The meta object literal for the '<em><b>Estado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUS__ESTADO = eINSTANCE.getBus_Estado();

		/**
		 * The meta object literal for the '<em><b>Numero Puestos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUS__NUMERO_PUESTOS = eINSTANCE.getBus_NumeroPuestos();

		/**
		 * The meta object literal for the '<em><b>Factory Gestion Inventario</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS__FACTORY_GESTION_INVENTARIO = eINSTANCE.getBus_FactoryGestionInventario();

		/**
		 * The meta object literal for the '<em><b>Lst Liquidacion</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS__LST_LIQUIDACION = eINSTANCE.getBus_LstLiquidacion();

		/**
		 * The meta object literal for the '<em><b>Conductor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS__CONDUCTOR = eINSTANCE.getBus_Conductor();

		/**
		 * The meta object literal for the '<em><b>Registrador</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS__REGISTRADOR = eINSTANCE.getBus_Registrador();

		/**
		 * The meta object literal for the '<em><b>Lst Ruta</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS__LST_RUTA = eINSTANCE.getBus_LstRuta();

		/**
		 * The meta object literal for the '{@link cootracir.domain.impl.CajeroImpl <em>Cajero</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cootracir.domain.impl.CajeroImpl
		 * @see cootracir.domain.impl.DomainPackageImpl#getCajero()
		 * @generated
		 */
		EClass CAJERO = eINSTANCE.getCajero();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAJERO__NOMBRE = eINSTANCE.getCajero_Nombre();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAJERO__ID = eINSTANCE.getCajero_Id();

		/**
		 * The meta object literal for the '<em><b>Edad</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAJERO__EDAD = eINSTANCE.getCajero_Edad();

		/**
		 * The meta object literal for the '<em><b>Telefono</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAJERO__TELEFONO = eINSTANCE.getCajero_Telefono();

		/**
		 * The meta object literal for the '<em><b>Dinero Recibido</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAJERO__DINERO_RECIBIDO = eINSTANCE.getCajero_DineroRecibido();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAJERO__EMAIL = eINSTANCE.getCajero_Email();

		/**
		 * The meta object literal for the '<em><b>Estado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAJERO__ESTADO = eINSTANCE.getCajero_Estado();

		/**
		 * The meta object literal for the '<em><b>Factory Gestion Humana</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAJERO__FACTORY_GESTION_HUMANA = eINSTANCE.getCajero_FactoryGestionHumana();

		/**
		 * The meta object literal for the '<em><b>Lst Conductores</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAJERO__LST_CONDUCTORES = eINSTANCE.getCajero_LstConductores();

		/**
		 * The meta object literal for the '<em><b>Lst Liquidaciones</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAJERO__LST_LIQUIDACIONES = eINSTANCE.getCajero_LstLiquidaciones();

		/**
		 * The meta object literal for the '{@link cootracir.domain.impl.ConductorImpl <em>Conductor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cootracir.domain.impl.ConductorImpl
		 * @see cootracir.domain.impl.DomainPackageImpl#getConductor()
		 * @generated
		 */
		EClass CONDUCTOR = eINSTANCE.getConductor();

		/**
		 * The meta object literal for the '<em><b>Analista</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDUCTOR__ANALISTA = eINSTANCE.getConductor_Analista();

		/**
		 * The meta object literal for the '<em><b>Cajero</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDUCTOR__CAJERO = eINSTANCE.getConductor_Cajero();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDUCTOR__NOMBRE = eINSTANCE.getConductor_Nombre();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDUCTOR__ID = eINSTANCE.getConductor_Id();

		/**
		 * The meta object literal for the '<em><b>Telefono</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDUCTOR__TELEFONO = eINSTANCE.getConductor_Telefono();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDUCTOR__EMAIL = eINSTANCE.getConductor_Email();

		/**
		 * The meta object literal for the '<em><b>Estado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDUCTOR__ESTADO = eINSTANCE.getConductor_Estado();

		/**
		 * The meta object literal for the '<em><b>Bus</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDUCTOR__BUS = eINSTANCE.getConductor_Bus();

		/**
		 * The meta object literal for the '<em><b>Factory Gestion Humana</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDUCTOR__FACTORY_GESTION_HUMANA = eINSTANCE.getConductor_FactoryGestionHumana();

		/**
		 * The meta object literal for the '<em><b>Lst Registrador</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDUCTOR__LST_REGISTRADOR = eINSTANCE.getConductor_LstRegistrador();

		/**
		 * The meta object literal for the '<em><b>Lst Bus</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDUCTOR__LST_BUS = eINSTANCE.getConductor_LstBus();

		/**
		 * The meta object literal for the '<em><b>Lst Liquidaciones</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDUCTOR__LST_LIQUIDACIONES = eINSTANCE.getConductor_LstLiquidaciones();

		/**
		 * The meta object literal for the '{@link cootracir.domain.impl.DetalleRegistroImpl <em>Detalle Registro</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cootracir.domain.impl.DetalleRegistroImpl
		 * @see cootracir.domain.impl.DomainPackageImpl#getDetalleRegistro()
		 * @generated
		 */
		EClass DETALLE_REGISTRO = eINSTANCE.getDetalleRegistro();

		/**
		 * The meta object literal for the '<em><b>Lugar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETALLE_REGISTRO__LUGAR = eINSTANCE.getDetalleRegistro_Lugar();

		/**
		 * The meta object literal for the '<em><b>Hora</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETALLE_REGISTRO__HORA = eINSTANCE.getDetalleRegistro_Hora();

		/**
		 * The meta object literal for the '<em><b>Incidencia</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETALLE_REGISTRO__INCIDENCIA = eINSTANCE.getDetalleRegistro_Incidencia();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETALLE_REGISTRO__ID = eINSTANCE.getDetalleRegistro_Id();

		/**
		 * The meta object literal for the '<em><b>Estado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETALLE_REGISTRO__ESTADO = eINSTANCE.getDetalleRegistro_Estado();

		/**
		 * The meta object literal for the '<em><b>Registrador</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DETALLE_REGISTRO__REGISTRADOR = eINSTANCE.getDetalleRegistro_Registrador();

		/**
		 * The meta object literal for the '<em><b>Factory Gestion Inventario</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DETALLE_REGISTRO__FACTORY_GESTION_INVENTARIO = eINSTANCE.getDetalleRegistro_FactoryGestionInventario();

		/**
		 * The meta object literal for the '<em><b>Ruta</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DETALLE_REGISTRO__RUTA = eINSTANCE.getDetalleRegistro_Ruta();

		/**
		 * The meta object literal for the '{@link cootracir.domain.impl.DomainImpl <em>Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cootracir.domain.impl.DomainImpl
		 * @see cootracir.domain.impl.DomainPackageImpl#getDomain()
		 * @generated
		 */
		EClass DOMAIN = eINSTANCE.getDomain();

		/**
		 * The meta object literal for the '<em><b>The Model Factory</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__THE_MODEL_FACTORY = eINSTANCE.getDomain_TheModelFactory();

		/**
		 * The meta object literal for the '<em><b>Factory Gestion Humana</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__FACTORY_GESTION_HUMANA = eINSTANCE.getDomain_FactoryGestionHumana();

		/**
		 * The meta object literal for the '<em><b>Factory Gestion Inventario</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__FACTORY_GESTION_INVENTARIO = eINSTANCE.getDomain_FactoryGestionInventario();

		/**
		 * The meta object literal for the '<em><b>The UI</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__THE_UI = eINSTANCE.getDomain_TheUI();

		/**
		 * The meta object literal for the '{@link cootracir.domain.impl.FactoryGestionHumanaImpl <em>Factory Gestion Humana</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cootracir.domain.impl.FactoryGestionHumanaImpl
		 * @see cootracir.domain.impl.DomainPackageImpl#getFactoryGestionHumana()
		 * @generated
		 */
		EClass FACTORY_GESTION_HUMANA = eINSTANCE.getFactoryGestionHumana();

		/**
		 * The meta object literal for the '<em><b>Lst Analistas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACTORY_GESTION_HUMANA__LST_ANALISTAS = eINSTANCE.getFactoryGestionHumana_LstAnalistas();

		/**
		 * The meta object literal for the '<em><b>Lst Cajeros</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACTORY_GESTION_HUMANA__LST_CAJEROS = eINSTANCE.getFactoryGestionHumana_LstCajeros();

		/**
		 * The meta object literal for the '<em><b>Lst Conductores</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACTORY_GESTION_HUMANA__LST_CONDUCTORES = eINSTANCE.getFactoryGestionHumana_LstConductores();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACTORY_GESTION_HUMANA__ID = eINSTANCE.getFactoryGestionHumana_Id();

		/**
		 * The meta object literal for the '<em><b>Estado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACTORY_GESTION_HUMANA__ESTADO = eINSTANCE.getFactoryGestionHumana_Estado();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACTORY_GESTION_HUMANA__DOMAIN = eINSTANCE.getFactoryGestionHumana_Domain();

		/**
		 * The meta object literal for the '{@link cootracir.domain.impl.FactoryGestionInventarioImpl <em>Factory Gestion Inventario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cootracir.domain.impl.FactoryGestionInventarioImpl
		 * @see cootracir.domain.impl.DomainPackageImpl#getFactoryGestionInventario()
		 * @generated
		 */
		EClass FACTORY_GESTION_INVENTARIO = eINSTANCE.getFactoryGestionInventario();

		/**
		 * The meta object literal for the '<em><b>Lst Buses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACTORY_GESTION_INVENTARIO__LST_BUSES = eINSTANCE.getFactoryGestionInventario_LstBuses();

		/**
		 * The meta object literal for the '<em><b>Lst Detalle Registro</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACTORY_GESTION_INVENTARIO__LST_DETALLE_REGISTRO = eINSTANCE.getFactoryGestionInventario_LstDetalleRegistro();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACTORY_GESTION_INVENTARIO__ID = eINSTANCE.getFactoryGestionInventario_Id();

		/**
		 * The meta object literal for the '<em><b>Estado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACTORY_GESTION_INVENTARIO__ESTADO = eINSTANCE.getFactoryGestionInventario_Estado();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACTORY_GESTION_INVENTARIO__DOMAIN = eINSTANCE.getFactoryGestionInventario_Domain();

		/**
		 * The meta object literal for the '<em><b>Lst Liquidaciones</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACTORY_GESTION_INVENTARIO__LST_LIQUIDACIONES = eINSTANCE.getFactoryGestionInventario_LstLiquidaciones();

		/**
		 * The meta object literal for the '<em><b>Lst Registrador</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACTORY_GESTION_INVENTARIO__LST_REGISTRADOR = eINSTANCE.getFactoryGestionInventario_LstRegistrador();

		/**
		 * The meta object literal for the '<em><b>Lst Ruta</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACTORY_GESTION_INVENTARIO__LST_RUTA = eINSTANCE.getFactoryGestionInventario_LstRuta();

		/**
		 * The meta object literal for the '{@link cootracir.domain.impl.LiquidacionImpl <em>Liquidacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cootracir.domain.impl.LiquidacionImpl
		 * @see cootracir.domain.impl.DomainPackageImpl#getLiquidacion()
		 * @generated
		 */
		EClass LIQUIDACION = eINSTANCE.getLiquidacion();

		/**
		 * The meta object literal for the '<em><b>Lst Bus</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIQUIDACION__LST_BUS = eINSTANCE.getLiquidacion_LstBus();

		/**
		 * The meta object literal for the '<em><b>Cajero</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIQUIDACION__CAJERO = eINSTANCE.getLiquidacion_Cajero();

		/**
		 * The meta object literal for the '<em><b>Conductor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIQUIDACION__CONDUCTOR = eINSTANCE.getLiquidacion_Conductor();

		/**
		 * The meta object literal for the '<em><b>Costes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIQUIDACION__COSTES = eINSTANCE.getLiquidacion_Costes();

		/**
		 * The meta object literal for the '<em><b>Estado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIQUIDACION__ESTADO = eINSTANCE.getLiquidacion_Estado();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIQUIDACION__ID = eINSTANCE.getLiquidacion_Id();

		/**
		 * The meta object literal for the '<em><b>Valor Liquidacion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIQUIDACION__VALOR_LIQUIDACION = eINSTANCE.getLiquidacion_ValorLiquidacion();

		/**
		 * The meta object literal for the '<em><b>Factory Gestion Inventario</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIQUIDACION__FACTORY_GESTION_INVENTARIO = eINSTANCE.getLiquidacion_FactoryGestionInventario();

		/**
		 * The meta object literal for the '{@link cootracir.domain.impl.RegistradorImpl <em>Registrador</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cootracir.domain.impl.RegistradorImpl
		 * @see cootracir.domain.impl.DomainPackageImpl#getRegistrador()
		 * @generated
		 */
		EClass REGISTRADOR = eINSTANCE.getRegistrador();

		/**
		 * The meta object literal for the '<em><b>Lst Detalle Registros</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRADOR__LST_DETALLE_REGISTROS = eINSTANCE.getRegistrador_LstDetalleRegistros();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRADOR__ID = eINSTANCE.getRegistrador_Id();

		/**
		 * The meta object literal for the '<em><b>Estado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRADOR__ESTADO = eINSTANCE.getRegistrador_Estado();

		/**
		 * The meta object literal for the '<em><b>Bus</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRADOR__BUS = eINSTANCE.getRegistrador_Bus();

		/**
		 * The meta object literal for the '<em><b>Factory Gestion Inventario</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRADOR__FACTORY_GESTION_INVENTARIO = eINSTANCE.getRegistrador_FactoryGestionInventario();

		/**
		 * The meta object literal for the '{@link cootracir.domain.impl.RutaImpl <em>Ruta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cootracir.domain.impl.RutaImpl
		 * @see cootracir.domain.impl.DomainPackageImpl#getRuta()
		 * @generated
		 */
		EClass RUTA = eINSTANCE.getRuta();

		/**
		 * The meta object literal for the '<em><b>Lst Detalle Registro</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUTA__LST_DETALLE_REGISTRO = eINSTANCE.getRuta_LstDetalleRegistro();

		/**
		 * The meta object literal for the '<em><b>Precio Ruta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUTA__PRECIO_RUTA = eINSTANCE.getRuta_PrecioRuta();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUTA__ID = eINSTANCE.getRuta_Id();

		/**
		 * The meta object literal for the '<em><b>Estado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUTA__ESTADO = eINSTANCE.getRuta_Estado();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUTA__NOMBRE = eINSTANCE.getRuta_Nombre();

		/**
		 * The meta object literal for the '<em><b>Bus</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUTA__BUS = eINSTANCE.getRuta_Bus();

		/**
		 * The meta object literal for the '<em><b>Factory Gestion Inventario</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUTA__FACTORY_GESTION_INVENTARIO = eINSTANCE.getRuta_FactoryGestionInventario();

	}

} //DomainPackage
