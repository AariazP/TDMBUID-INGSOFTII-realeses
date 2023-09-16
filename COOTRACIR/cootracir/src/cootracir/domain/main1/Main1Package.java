/**
 */
package cootracir.domain.main1;

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
 * @see cootracir.domain.main1.Main1Factory
 * @model kind="package"
 * @generated
 */
public interface Main1Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "main1";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///cootracir/domain/main1.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cootracir.domain.main1";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Main1Package eINSTANCE = cootracir.domain.main1.impl.Main1PackageImpl.init();

	/**
	 * The meta object id for the '{@link cootracir.domain.main1.impl.BusImpl <em>Bus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cootracir.domain.main1.impl.BusImpl
	 * @see cootracir.domain.main1.impl.Main1PackageImpl#getBus()
	 * @generated
	 */
	int BUS = 0;

	/**
	 * The feature id for the '<em><b>Lst Conductor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__LST_CONDUCTOR = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__ID = 1;

	/**
	 * The feature id for the '<em><b>Numero Puestos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__NUMERO_PUESTOS = 2;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__ESTADO = 3;

	/**
	 * The feature id for the '<em><b>Lst Ruta</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__LST_RUTA = 4;

	/**
	 * The number of structural features of the '<em>Bus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link cootracir.domain.main1.impl.RutaImpl <em>Ruta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cootracir.domain.main1.impl.RutaImpl
	 * @see cootracir.domain.main1.impl.Main1PackageImpl#getRuta()
	 * @generated
	 */
	int RUTA = 1;

	/**
	 * The feature id for the '<em><b>Precio Ruta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUTA__PRECIO_RUTA = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUTA__ID = 1;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUTA__ESTADO = 2;

	/**
	 * The feature id for the '<em><b>Lst Bus</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUTA__LST_BUS = 3;

	/**
	 * The number of structural features of the '<em>Ruta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUTA_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link cootracir.domain.main1.impl.RegistradorImpl <em>Registrador</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cootracir.domain.main1.impl.RegistradorImpl
	 * @see cootracir.domain.main1.impl.Main1PackageImpl#getRegistrador()
	 * @generated
	 */
	int REGISTRADOR = 2;

	/**
	 * The feature id for the '<em><b>Lst Conductor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRADOR__LST_CONDUCTOR = 0;

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
	 * The feature id for the '<em><b>Lst Detalle Registro</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRADOR__LST_DETALLE_REGISTRO = 3;

	/**
	 * The number of structural features of the '<em>Registrador</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRADOR_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link cootracir.domain.main1.impl.DetalleRegistroImpl <em>Detalle Registro</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cootracir.domain.main1.impl.DetalleRegistroImpl
	 * @see cootracir.domain.main1.impl.Main1PackageImpl#getDetalleRegistro()
	 * @generated
	 */
	int DETALLE_REGISTRO = 3;

	/**
	 * The feature id for the '<em><b>Lst Registrador</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETALLE_REGISTRO__LST_REGISTRADOR = 0;

	/**
	 * The feature id for the '<em><b>Lugar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETALLE_REGISTRO__LUGAR = 1;

	/**
	 * The feature id for the '<em><b>Hora</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETALLE_REGISTRO__HORA = 2;

	/**
	 * The feature id for the '<em><b>Incidencias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETALLE_REGISTRO__INCIDENCIAS = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETALLE_REGISTRO__ID = 4;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETALLE_REGISTRO__ESTADO = 5;

	/**
	 * The number of structural features of the '<em>Detalle Registro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETALLE_REGISTRO_FEATURE_COUNT = 6;


	/**
	 * Returns the meta object for class '{@link cootracir.domain.main1.Bus <em>Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus</em>'.
	 * @see cootracir.domain.main1.Bus
	 * @generated
	 */
	EClass getBus();

	/**
	 * Returns the meta object for the reference list '{@link cootracir.domain.main1.Bus#getLstConductor <em>Lst Conductor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lst Conductor</em>'.
	 * @see cootracir.domain.main1.Bus#getLstConductor()
	 * @see #getBus()
	 * @generated
	 */
	EReference getBus_LstConductor();

	/**
	 * Returns the meta object for the attribute '{@link cootracir.domain.main1.Bus#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see cootracir.domain.main1.Bus#getId()
	 * @see #getBus()
	 * @generated
	 */
	EAttribute getBus_Id();

	/**
	 * Returns the meta object for the attribute '{@link cootracir.domain.main1.Bus#getNumeroPuestos <em>Numero Puestos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numero Puestos</em>'.
	 * @see cootracir.domain.main1.Bus#getNumeroPuestos()
	 * @see #getBus()
	 * @generated
	 */
	EAttribute getBus_NumeroPuestos();

	/**
	 * Returns the meta object for the attribute '{@link cootracir.domain.main1.Bus#getEstado <em>Estado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estado</em>'.
	 * @see cootracir.domain.main1.Bus#getEstado()
	 * @see #getBus()
	 * @generated
	 */
	EAttribute getBus_Estado();

	/**
	 * Returns the meta object for the reference list '{@link cootracir.domain.main1.Bus#getLstRuta <em>Lst Ruta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lst Ruta</em>'.
	 * @see cootracir.domain.main1.Bus#getLstRuta()
	 * @see #getBus()
	 * @generated
	 */
	EReference getBus_LstRuta();

	/**
	 * Returns the meta object for class '{@link cootracir.domain.main1.Ruta <em>Ruta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ruta</em>'.
	 * @see cootracir.domain.main1.Ruta
	 * @generated
	 */
	EClass getRuta();

	/**
	 * Returns the meta object for the attribute '{@link cootracir.domain.main1.Ruta#getPrecioRuta <em>Precio Ruta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precio Ruta</em>'.
	 * @see cootracir.domain.main1.Ruta#getPrecioRuta()
	 * @see #getRuta()
	 * @generated
	 */
	EAttribute getRuta_PrecioRuta();

	/**
	 * Returns the meta object for the attribute '{@link cootracir.domain.main1.Ruta#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see cootracir.domain.main1.Ruta#getId()
	 * @see #getRuta()
	 * @generated
	 */
	EAttribute getRuta_Id();

	/**
	 * Returns the meta object for the attribute '{@link cootracir.domain.main1.Ruta#getEstado <em>Estado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estado</em>'.
	 * @see cootracir.domain.main1.Ruta#getEstado()
	 * @see #getRuta()
	 * @generated
	 */
	EAttribute getRuta_Estado();

	/**
	 * Returns the meta object for the reference list '{@link cootracir.domain.main1.Ruta#getLstBus <em>Lst Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lst Bus</em>'.
	 * @see cootracir.domain.main1.Ruta#getLstBus()
	 * @see #getRuta()
	 * @generated
	 */
	EReference getRuta_LstBus();

	/**
	 * Returns the meta object for class '{@link cootracir.domain.main1.Registrador <em>Registrador</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Registrador</em>'.
	 * @see cootracir.domain.main1.Registrador
	 * @generated
	 */
	EClass getRegistrador();

	/**
	 * Returns the meta object for the reference list '{@link cootracir.domain.main1.Registrador#getLstConductor <em>Lst Conductor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lst Conductor</em>'.
	 * @see cootracir.domain.main1.Registrador#getLstConductor()
	 * @see #getRegistrador()
	 * @generated
	 */
	EReference getRegistrador_LstConductor();

	/**
	 * Returns the meta object for the attribute '{@link cootracir.domain.main1.Registrador#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see cootracir.domain.main1.Registrador#getId()
	 * @see #getRegistrador()
	 * @generated
	 */
	EAttribute getRegistrador_Id();

	/**
	 * Returns the meta object for the attribute '{@link cootracir.domain.main1.Registrador#getEstado <em>Estado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estado</em>'.
	 * @see cootracir.domain.main1.Registrador#getEstado()
	 * @see #getRegistrador()
	 * @generated
	 */
	EAttribute getRegistrador_Estado();

	/**
	 * Returns the meta object for the reference list '{@link cootracir.domain.main1.Registrador#getLstDetalleRegistro <em>Lst Detalle Registro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lst Detalle Registro</em>'.
	 * @see cootracir.domain.main1.Registrador#getLstDetalleRegistro()
	 * @see #getRegistrador()
	 * @generated
	 */
	EReference getRegistrador_LstDetalleRegistro();

	/**
	 * Returns the meta object for class '{@link cootracir.domain.main1.DetalleRegistro <em>Detalle Registro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Detalle Registro</em>'.
	 * @see cootracir.domain.main1.DetalleRegistro
	 * @generated
	 */
	EClass getDetalleRegistro();

	/**
	 * Returns the meta object for the reference list '{@link cootracir.domain.main1.DetalleRegistro#getLstRegistrador <em>Lst Registrador</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lst Registrador</em>'.
	 * @see cootracir.domain.main1.DetalleRegistro#getLstRegistrador()
	 * @see #getDetalleRegistro()
	 * @generated
	 */
	EReference getDetalleRegistro_LstRegistrador();

	/**
	 * Returns the meta object for the attribute '{@link cootracir.domain.main1.DetalleRegistro#getLugar <em>Lugar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lugar</em>'.
	 * @see cootracir.domain.main1.DetalleRegistro#getLugar()
	 * @see #getDetalleRegistro()
	 * @generated
	 */
	EAttribute getDetalleRegistro_Lugar();

	/**
	 * Returns the meta object for the attribute '{@link cootracir.domain.main1.DetalleRegistro#getHora <em>Hora</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hora</em>'.
	 * @see cootracir.domain.main1.DetalleRegistro#getHora()
	 * @see #getDetalleRegistro()
	 * @generated
	 */
	EAttribute getDetalleRegistro_Hora();

	/**
	 * Returns the meta object for the attribute '{@link cootracir.domain.main1.DetalleRegistro#getIncidencias <em>Incidencias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Incidencias</em>'.
	 * @see cootracir.domain.main1.DetalleRegistro#getIncidencias()
	 * @see #getDetalleRegistro()
	 * @generated
	 */
	EAttribute getDetalleRegistro_Incidencias();

	/**
	 * Returns the meta object for the attribute '{@link cootracir.domain.main1.DetalleRegistro#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see cootracir.domain.main1.DetalleRegistro#getId()
	 * @see #getDetalleRegistro()
	 * @generated
	 */
	EAttribute getDetalleRegistro_Id();

	/**
	 * Returns the meta object for the attribute '{@link cootracir.domain.main1.DetalleRegistro#getEstado <em>Estado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estado</em>'.
	 * @see cootracir.domain.main1.DetalleRegistro#getEstado()
	 * @see #getDetalleRegistro()
	 * @generated
	 */
	EAttribute getDetalleRegistro_Estado();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Main1Factory getMain1Factory();

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
		 * The meta object literal for the '{@link cootracir.domain.main1.impl.BusImpl <em>Bus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cootracir.domain.main1.impl.BusImpl
		 * @see cootracir.domain.main1.impl.Main1PackageImpl#getBus()
		 * @generated
		 */
		EClass BUS = eINSTANCE.getBus();

		/**
		 * The meta object literal for the '<em><b>Lst Conductor</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS__LST_CONDUCTOR = eINSTANCE.getBus_LstConductor();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUS__ID = eINSTANCE.getBus_Id();

		/**
		 * The meta object literal for the '<em><b>Numero Puestos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUS__NUMERO_PUESTOS = eINSTANCE.getBus_NumeroPuestos();

		/**
		 * The meta object literal for the '<em><b>Estado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUS__ESTADO = eINSTANCE.getBus_Estado();

		/**
		 * The meta object literal for the '<em><b>Lst Ruta</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS__LST_RUTA = eINSTANCE.getBus_LstRuta();

		/**
		 * The meta object literal for the '{@link cootracir.domain.main1.impl.RutaImpl <em>Ruta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cootracir.domain.main1.impl.RutaImpl
		 * @see cootracir.domain.main1.impl.Main1PackageImpl#getRuta()
		 * @generated
		 */
		EClass RUTA = eINSTANCE.getRuta();

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
		 * The meta object literal for the '<em><b>Lst Bus</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUTA__LST_BUS = eINSTANCE.getRuta_LstBus();

		/**
		 * The meta object literal for the '{@link cootracir.domain.main1.impl.RegistradorImpl <em>Registrador</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cootracir.domain.main1.impl.RegistradorImpl
		 * @see cootracir.domain.main1.impl.Main1PackageImpl#getRegistrador()
		 * @generated
		 */
		EClass REGISTRADOR = eINSTANCE.getRegistrador();

		/**
		 * The meta object literal for the '<em><b>Lst Conductor</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRADOR__LST_CONDUCTOR = eINSTANCE.getRegistrador_LstConductor();

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
		 * The meta object literal for the '<em><b>Lst Detalle Registro</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRADOR__LST_DETALLE_REGISTRO = eINSTANCE.getRegistrador_LstDetalleRegistro();

		/**
		 * The meta object literal for the '{@link cootracir.domain.main1.impl.DetalleRegistroImpl <em>Detalle Registro</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cootracir.domain.main1.impl.DetalleRegistroImpl
		 * @see cootracir.domain.main1.impl.Main1PackageImpl#getDetalleRegistro()
		 * @generated
		 */
		EClass DETALLE_REGISTRO = eINSTANCE.getDetalleRegistro();

		/**
		 * The meta object literal for the '<em><b>Lst Registrador</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DETALLE_REGISTRO__LST_REGISTRADOR = eINSTANCE.getDetalleRegistro_LstRegistrador();

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
		 * The meta object literal for the '<em><b>Incidencias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETALLE_REGISTRO__INCIDENCIAS = eINSTANCE.getDetalleRegistro_Incidencias();

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

	}

} //Main1Package
