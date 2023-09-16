package cootracir.view.views;
import cootracir.ui.UiPackage.Literals;
import org.eclipse.swt.custom.ScrolledComposite;
import cootracir.ModelFactory;
import cootracir.domain.Conductor;
import cootracir.domain.DetalleRegistro;
import cootracir.domain.Ruta;
import cootracir.domain.impl.ConductorImpl;
import cootracir.ui.*;
import cootracir.ModelFactory;
import cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.*;
import cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.FiltrarrutasViewModelImpl;
import cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.ListapreciosViewModelImpl;
import cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.impl.RegistrosViewModelImpl;
import cootracir.view.model.ModelFactoryModel;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.StatusLineManager;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.window.ApplicationWindow;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Table;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.jface.viewers.TreeViewer;import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.widgets.DateTime;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Set;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.core.databinding.observable.map.IObservableMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.databinding.viewers.ObservableMapLabelProvider;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.MouseAdapter;import org.eclipse.swt.events.MouseEvent;import org.eclipse.swt.widgets.TabFolder;import org.eclipse.swt.widgets.TabItem;import org.eclipse.swt.SWT;import org.eclipse.swt.dnd.DND;import org.eclipse.swt.dnd.Transfer;import org.eclipse.jface.resource.ImageDescriptor;import org.eclipse.jface.action.IMenuListener;import org.eclipse.jface.action.IMenuManager;import org.eclipse.jface.action.IToolBarManager;import org.eclipse.jface.action.MenuManager;import org.eclipse.jface.dialogs.MessageDialog;import org.eclipse.swt.widgets.Tree;import org.eclipse.swt.widgets.TreeColumn;import org.eclipse.ui.forms.widgets.ScrolledForm;import org.eclipse.core.runtime.FileLocator;import org.eclipse.core.runtime.IPath;import org.eclipse.core.runtime.Path;import org.eclipse.core.runtime.Platform;import org.osgi.framework.Bundle;

import com.ibm.icu.util.BytesTrie.Iterator;

import org.eclipse.swt.events.KeyAdapter;import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.VerifyEvent;
/**
 * 
 * @author Grupo SINFOCI 
 *
 */
public class RegistroBaseViewPart  extends ViewPart {


	public static final String ID = "cootracir.view.views.RegistroBase";

	ModelFactoryModel mfm;
	UI ui;
	ModelFactory modelFactory;
	private DataBindingContext m_bindingContext;
	cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorRegistroBaseViewModel   contenedorregistroBaseViewModel;
	public Label lblPlanilladeRegistro; 
	public Text textNotificacion; 
	public Label lblNotificacion; 
	public Button btnHacerliquidacion;
 	public Button btnAplicarpromedio;
 	public Button btnLimpiar;
 	public ComboViewer comboViewerFiltrarrutas;
 	public Combo comboFiltrarrutas; 
	cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.FiltrarrutasViewModel   filtrarrutasViewModelSeleccionadoCombo; 
	public Button btnFiltrar;
 	public Label lblLospreciosdelarutasonigualesenambossentidos; 
	public Group groupInformaciongeneral; 
	cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorInformaciongeneralViewModel   contenedorinformaciongeneralViewModel;
	public Label lblNombreFromTheInformaciongeneral; 
	public Text textNombreFromTheInformaciongeneral; 
	public Label lblHoraFromTheInformaciongeneral; 
	public Text textHoraFromTheInformaciongeneral; 
	public Label lblRutaFromTheInformaciongeneral; 
	public Text textRutaFromTheInformaciongeneral; 
	public Label lblFechaFromTheInformaciongeneral; 
	public Text textFechaFromTheInformaciongeneral; 
	public Group groupBusqueda; 
	cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorBusquedaViewModel   contenedorbusquedaViewModel;
	public ComboViewer comboViewerNombredelconductorFromTheBusqueda;
 	public Combo comboNombredelconductorFromTheBusqueda; 
	cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.NombredelconductorViewModel   nombredelconductorFromTheBusquedaViewModelSeleccionadoCombo; 
	public Button btnAplicarFromTheBusqueda;
 	public ComboViewer comboViewerRutadelconductorFromTheBusqueda;
 	public Combo comboRutadelconductorFromTheBusqueda; 
	cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.RutadelconductorViewModel   rutadelconductorFromTheBusquedaViewModelSeleccionadoCombo; 
	public Button btnSeleccionarFromTheBusqueda;
 	public Table tabletableRegistros;
 	public TableViewer tableRegistros;
 	cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.RegistrosViewModel   tableRegistrosViewModelSeleccionadoTabla; 
	public Table tabletableListaprecios;
 	public TableViewer tableListaprecios;
 	cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ListapreciosViewModel   tableListapreciosViewModelSeleccionadoTabla; 
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());
	private ConductorImpl conductorImpl;
	public RegistroBaseViewPart() {
	  try {
	    mfm = ModelFactoryModel.getInstance();
	    mfm.setRegistroBaseViewPart(this);
	    cargarContenedores(); 
	    syncModel();
	    constructorRegistroBaseViewPart();
	  }
	  catch (Exception e) {
	  }
	}
	public void cargarContenedores(){
	  mfm 								= ModelFactoryModel.getInstance(); 
	  contenedorregistroBaseViewModel = mfm.getTheContenedorRegistroBaseViewModel();
	  contenedorinformaciongeneralViewModel = mfm.getTheInformaciongeneralViewModelOfRegistroBase();
	  contenedorbusquedaViewModel = mfm.getTheBusquedaViewModelOfRegistroBase();
	  
         }
	public void updateData(){
		if(!mfm.getEstado().equals("ACTUALIZADO")) {
			mfm.cargar();

		}
		cargarContenedores();
		try {
			initDataBindings();
		} catch (Exception e) {
		}


		comboNombredelconductorFromTheBusqueda.addKeyListener(new KeyListener() {

			@Override
			public void keyReleased(KeyEvent e) {

				String text = comboNombredelconductorFromTheBusqueda.getText();
				comboNombredelconductorFromTheBusqueda.removeAll();

				EList<Conductor>conductors = mfm.getTheDomain().getFactoryGestionHumana().getLstConductores();
				for(Conductor conductor: conductors) {

					if(conductor.getNombre().contains(text))comboNombredelconductorFromTheBusqueda.add(conductor.getNombre() + "(" + conductor.getId() + ")");

				}

				comboNombredelconductorFromTheBusqueda.setText(text); 

			}

			@Override
			public void keyPressed(KeyEvent e) {


			}




		});

		comboRutadelconductorFromTheBusqueda.addKeyListener(new KeyListener() {

			@Override
			public void keyReleased(KeyEvent e) {


				String content = comboRutadelconductorFromTheBusqueda.getText();
				comboRutadelconductorFromTheBusqueda.removeAll();

				EList<Ruta> rutas = mfm.getRutas();



				if(content.equals("")) {
					for(Ruta r: rutas) {

						comboRutadelconductorFromTheBusqueda.add(r.getNombre()+" ("+r.getId()+")");

					}
				}else {

					for(Ruta r: rutas) {

						if(r.getId().contains(content) || r.getNombre().contains(content))comboRutadelconductorFromTheBusqueda.add(r.getNombre()+" ("+r.getId()+")");

					}

				}



			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub

			}
		});
	}
	public void createPartControl(Composite parent) {
		ScrolledComposite sc = new ScrolledComposite(parent, SWT.H_SCROLL |	SWT.V_SCROLL | SWT.BORDER);
		Composite container = formToolkit.createComposite(sc, SWT.NONE);

		sc.setContent(container);
		sc.setExpandHorizontal(true);
		sc.setExpandVertical(true);
		sc.setMinSize(container.computeSize(996, 903));
		formToolkit.paintBordersFor(container);

        lblPlanilladeRegistro = formToolkit.createLabel(container,"Planilla de Registro",SWT.NONE);
        lblPlanilladeRegistro.setForeground(SWTResourceManager.getColor(0, 0, 139)) ;
        lblPlanilladeRegistro.setBounds(366,27,170,24);

        lblPlanilladeRegistro.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		textNotificacion = formToolkit.createText(container, "New Text", SWT.NONE);
		textNotificacion.setText("Notificacion");
		textNotificacion.setBounds(34,765,553,27);

		textNotificacion.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {

				//TODO Action textNotificacionde la view RegistroBase
				String texto = textNotificacion.getText();
			textNotificacion_ModifyText_LogicalEvent (texto);
			}
		});
        lblNotificacion = formToolkit.createLabel(container,"Notificacion",SWT.NONE);
        lblNotificacion.setForeground(SWTResourceManager.getColor(0, 0, 139)) ;
        lblNotificacion.setBounds(34,731,70,24);

        lblNotificacion.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		btnHacerliquidacion = formToolkit.createButton(container,"Hacer liquidacion",SWT.NONE);
		btnHacerliquidacion.setBounds(78,825,127,22);

		btnHacerliquidacion.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		btnHacerliquidacion.addSelectionListener(new SelectionAdapter() {

		public void widgetSelected(SelectionEvent e) {
				//TODO Action ButtonbtnHacerliquidacionde la view RegistroBase
				 btnHacerliquidacion_Selection_LogicalEvent ( "event" );
		 }
		});
		btnAplicarpromedio = formToolkit.createButton(container,"Aplicar promedio",SWT.NONE);
		btnAplicarpromedio.setBounds(244,825,136,22);

		btnAplicarpromedio.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		btnAplicarpromedio.addSelectionListener(new SelectionAdapter() {

		public void widgetSelected(SelectionEvent e) {
				//TODO Action ButtonbtnAplicarpromediode la view RegistroBase
				 btnAplicarpromedio_Selection_LogicalEvent ( "event" );
		 }
		});
		btnLimpiar = formToolkit.createButton(container,"Limpiar",SWT.NONE);
		btnLimpiar.setBounds(436,825,85,22);

		btnLimpiar.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		btnLimpiar.addSelectionListener(new SelectionAdapter() {

		public void widgetSelected(SelectionEvent e) {
				//TODO Action ButtonbtnLimpiarde la view RegistroBase
				 btnLimpiar_Selection_LogicalEvent ( "event" );
		 }
		});
		comboViewerFiltrarrutas = new ComboViewer(container,SWT.NONE);
		comboFiltrarrutas =  comboViewerFiltrarrutas.getCombo();
		comboFiltrarrutas.setBounds(626,71,168,24);
		comboFiltrarrutas.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		formToolkit.paintBordersFor(comboFiltrarrutas);

		comboFiltrarrutas.addSelectionListener(new SelectionAdapter() {
		   public void widgetSelected(SelectionEvent e) { 
		    //TODO ActionCombo ViewFiltrarrutas de la viewRegistroBase
		     IStructuredSelection is = (IStructuredSelection) comboViewerFiltrarrutas.getSelection();
		   filtrarrutasViewModelSeleccionadoCombo = (cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.FiltrarrutasViewModel) is.getFirstElement();
		   comboFiltrarrutas_Selection_LogicalEvent ( "event" );
		   }
		
		});
		comboFiltrarrutas.addKeyListener(new KeyAdapter() {
		   public void keyReleased(KeyEvent e) { 
		    //TODO ActionCombo ViewFiltrarrutas de la viewRegistroBase
				String texto = comboFiltrarrutas.getText();
		   		comboFiltrarrutas_ModifyText_LogicalEvent (texto);
		   		comboFiltrarrutas.setText(texto);
		   		int stringLength = comboFiltrarrutas.getText().length();
		   		comboFiltrarrutas.setSelection(new Point (stringLength, stringLength));
		   		comboFiltrarrutas.setVisibleItemCount(100);
		   }		
		});
		btnFiltrar = formToolkit.createButton(container,"filtrar",SWT.NONE);
		btnFiltrar.setBounds(846,75,85,22);

		btnFiltrar.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		btnFiltrar.addSelectionListener(new SelectionAdapter() {

		public void widgetSelected(SelectionEvent e) {
				//TODO Action ButtonbtnFiltrarde la view RegistroBase
				 btnFiltrar_Selection_LogicalEvent ( "event" );
		 }
		});
        lblLospreciosdelarutasonigualesenambossentidos = formToolkit.createLabel(container,"Los precios de la ruta son iguales en ambos sentidos",SWT.NONE);
        lblLospreciosdelarutasonigualesenambossentidos.setForeground(SWTResourceManager.getColor(0, 0, 139)) ;
        lblLospreciosdelarutasonigualesenambossentidos.setBounds(660,779,70,24);

        lblLospreciosdelarutasonigualesenambossentidos.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		groupInformaciongeneral = new Group(container, SWT.NONE);
		groupInformaciongeneral.setBounds(30,71,557,213);
		groupInformaciongeneral.setText("Informacion general");
		groupInformaciongeneral.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		formToolkit.adapt(groupInformaciongeneral);
		formToolkit.paintBordersFor(groupInformaciongeneral);

        lblNombreFromTheInformaciongeneral = formToolkit.createLabel(groupInformaciongeneral,"nombre",SWT.NONE);
        lblNombreFromTheInformaciongeneral.setForeground(SWTResourceManager.getColor(0, 0, 139)) ;
        lblNombreFromTheInformaciongeneral.setBounds(42,33,70,24);

        lblNombreFromTheInformaciongeneral.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		textNombreFromTheInformaciongeneral = formToolkit.createText(groupInformaciongeneral, "New Text", SWT.NONE);
		textNombreFromTheInformaciongeneral.setText("nombre");
		textNombreFromTheInformaciongeneral.setBounds(139,33,369,24);

		textNombreFromTheInformaciongeneral.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {

				//TODO Action textNombreFromTheInformaciongeneralde la view RegistroBase
				String texto = textNombreFromTheInformaciongeneral.getText();
			textNombreFromTheInformaciongeneral_ModifyText_LogicalEvent (texto);
			}
		});
        lblHoraFromTheInformaciongeneral = formToolkit.createLabel(groupInformaciongeneral,"hora",SWT.NONE);
        lblHoraFromTheInformaciongeneral.setForeground(SWTResourceManager.getColor(0, 0, 139)) ;
        lblHoraFromTheInformaciongeneral.setBounds(42,66,70,24);

        lblHoraFromTheInformaciongeneral.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		textHoraFromTheInformaciongeneral = formToolkit.createText(groupInformaciongeneral, "New Text", SWT.NONE);
		textHoraFromTheInformaciongeneral.setText("hora");
		textHoraFromTheInformaciongeneral.setBounds(139,66,369,24);

		textHoraFromTheInformaciongeneral.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {

				//TODO Action textHoraFromTheInformaciongeneralde la view RegistroBase
				String texto = textHoraFromTheInformaciongeneral.getText();
			textHoraFromTheInformaciongeneral_ModifyText_LogicalEvent (texto);
			}
		});
        lblRutaFromTheInformaciongeneral = formToolkit.createLabel(groupInformaciongeneral,"ruta",SWT.NONE);
        lblRutaFromTheInformaciongeneral.setForeground(SWTResourceManager.getColor(0, 0, 139)) ;
        lblRutaFromTheInformaciongeneral.setBounds(42,106,70,24);

        lblRutaFromTheInformaciongeneral.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		textRutaFromTheInformaciongeneral = formToolkit.createText(groupInformaciongeneral, "New Text", SWT.NONE);
		textRutaFromTheInformaciongeneral.setText("ruta");
		textRutaFromTheInformaciongeneral.setBounds(141,106,367,24);

		textRutaFromTheInformaciongeneral.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {

				//TODO Action textRutaFromTheInformaciongeneralde la view RegistroBase
				String texto = textRutaFromTheInformaciongeneral.getText();
			textRutaFromTheInformaciongeneral_ModifyText_LogicalEvent (texto);
			}
		});
        lblFechaFromTheInformaciongeneral = formToolkit.createLabel(groupInformaciongeneral,"fecha",SWT.NONE);
        lblFechaFromTheInformaciongeneral.setForeground(SWTResourceManager.getColor(0, 0, 139)) ;
        lblFechaFromTheInformaciongeneral.setBounds(44,144,70,24);

        lblFechaFromTheInformaciongeneral.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		textFechaFromTheInformaciongeneral = formToolkit.createText(groupInformaciongeneral, "New Text", SWT.NONE);
		textFechaFromTheInformaciongeneral.setText("fecha");
		textFechaFromTheInformaciongeneral.setBounds(141,144,367,24);

		textFechaFromTheInformaciongeneral.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {

				//TODO Action textFechaFromTheInformaciongeneralde la view RegistroBase
				String texto = textFechaFromTheInformaciongeneral.getText();
			textFechaFromTheInformaciongeneral_ModifyText_LogicalEvent (texto);
			}
		});
		groupBusqueda = new Group(container, SWT.NONE);
		groupBusqueda.setBounds(30,307,557,151);
		groupBusqueda.setText("Busqueda");
		groupBusqueda.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		formToolkit.adapt(groupBusqueda);
		formToolkit.paintBordersFor(groupBusqueda);

		comboViewerNombredelconductorFromTheBusqueda = new ComboViewer(groupBusqueda,SWT.NONE);
		comboNombredelconductorFromTheBusqueda =  comboViewerNombredelconductorFromTheBusqueda.getCombo();
		comboNombredelconductorFromTheBusqueda.setBounds(39,30,317,25);
		comboNombredelconductorFromTheBusqueda.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		formToolkit.paintBordersFor(comboNombredelconductorFromTheBusqueda);

		comboNombredelconductorFromTheBusqueda.addSelectionListener(new SelectionAdapter() {
		   public void widgetSelected(SelectionEvent e) { 
		    //TODO ActionCombo ViewNombredelconductorFromTheBusqueda de la viewRegistroBase
		     IStructuredSelection is = (IStructuredSelection) comboViewerNombredelconductorFromTheBusqueda.getSelection();
		   nombredelconductorFromTheBusquedaViewModelSeleccionadoCombo = (cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.NombredelconductorViewModel) is.getFirstElement();
		   comboNombredelconductorFromTheBusqueda_Selection_LogicalEvent ( "event" );
		   }
		
		});
		comboNombredelconductorFromTheBusqueda.addKeyListener(new KeyAdapter() {
		   public void keyReleased(KeyEvent e) { 
		    //TODO ActionCombo ViewNombredelconductorFromTheBusqueda de la viewRegistroBase
				String texto = comboNombredelconductorFromTheBusqueda.getText();
		   		comboNombredelconductorFromTheBusqueda_ModifyText_LogicalEvent (texto);
		   		comboNombredelconductorFromTheBusqueda.setText(texto);
		   		int stringLength = comboNombredelconductorFromTheBusqueda.getText().length();
		   		comboNombredelconductorFromTheBusqueda.setSelection(new Point (stringLength, stringLength));
		   		comboNombredelconductorFromTheBusqueda.setVisibleItemCount(100);
		   }		
		});
		btnAplicarFromTheBusqueda = formToolkit.createButton(groupBusqueda,"Aplicar",SWT.NONE);
		btnAplicarFromTheBusqueda.setBounds(399,33,145,22);

		btnAplicarFromTheBusqueda.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		btnAplicarFromTheBusqueda.addSelectionListener(new SelectionAdapter() {

		public void widgetSelected(SelectionEvent e) {
				//TODO Action ButtonbtnAplicarFromTheBusquedade la view RegistroBase
				 btnAplicarFromTheBusqueda_Selection_LogicalEvent ( "event" );
		 }
		});
		comboViewerRutadelconductorFromTheBusqueda = new ComboViewer(groupBusqueda,SWT.NONE);
		comboRutadelconductorFromTheBusqueda =  comboViewerRutadelconductorFromTheBusqueda.getCombo();
		comboRutadelconductorFromTheBusqueda.setBounds(39,74,317,17);
		comboRutadelconductorFromTheBusqueda.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		formToolkit.paintBordersFor(comboRutadelconductorFromTheBusqueda);

		comboRutadelconductorFromTheBusqueda.addSelectionListener(new SelectionAdapter() {
		   public void widgetSelected(SelectionEvent e) { 
		    //TODO ActionCombo ViewRutadelconductorFromTheBusqueda de la viewRegistroBase
		     IStructuredSelection is = (IStructuredSelection) comboViewerRutadelconductorFromTheBusqueda.getSelection();
		   rutadelconductorFromTheBusquedaViewModelSeleccionadoCombo = (cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.RutadelconductorViewModel) is.getFirstElement();
		   comboRutadelconductorFromTheBusqueda_Selection_LogicalEvent ( "event" );
		   }
		
		});
		comboRutadelconductorFromTheBusqueda.addKeyListener(new KeyAdapter() {
		   public void keyReleased(KeyEvent e) { 
		    //TODO ActionCombo ViewRutadelconductorFromTheBusqueda de la viewRegistroBase
				String texto = comboRutadelconductorFromTheBusqueda.getText();
		   		comboRutadelconductorFromTheBusqueda_ModifyText_LogicalEvent (texto);
		   		comboRutadelconductorFromTheBusqueda.setText(texto);
		   		int stringLength = comboRutadelconductorFromTheBusqueda.getText().length();
		   		comboRutadelconductorFromTheBusqueda.setSelection(new Point (stringLength, stringLength));
		   		comboRutadelconductorFromTheBusqueda.setVisibleItemCount(100);
		   }		
		});
		btnSeleccionarFromTheBusqueda = formToolkit.createButton(groupBusqueda,"Seleccionar",SWT.NONE);
		btnSeleccionarFromTheBusqueda.setBounds(399,75,145,22);

		btnSeleccionarFromTheBusqueda.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		btnSeleccionarFromTheBusqueda.addSelectionListener(new SelectionAdapter() {

		public void widgetSelected(SelectionEvent e) {
				//TODO Action ButtonbtnSeleccionarFromTheBusquedade la view RegistroBase
				 btnSeleccionarFromTheBusqueda_Selection_LogicalEvent ( "event" );
		 }
		});
		tableRegistros = new TableViewer(container, SWT.BORDER | SWT.FULL_SELECTION);
		tabletableRegistros = tableRegistros.getTable();
		tabletableRegistros.setLinesVisible(true);
		tabletableRegistros.setHeaderVisible(true);
		tabletableRegistros.setBounds(34,487,553,229);
		tabletableRegistros.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		formToolkit.paintBordersFor(tabletableRegistros);

		TableViewerColumn  columId0 = new TableViewerColumn(tableRegistros, SWT.NONE);
		TableColumn tblclmncolumId0 = columId0.getColumn();
		tblclmncolumId0.setWidth(100);
		tblclmncolumId0 .setText("id");

		TableViewerColumn  columHora1 = new TableViewerColumn(tableRegistros, SWT.NONE);
		TableColumn tblclmncolumHora1 = columHora1.getColumn();
		tblclmncolumHora1.setWidth(100);
		tblclmncolumHora1 .setText("hora");

		TableViewerColumn  columEstado2 = new TableViewerColumn(tableRegistros, SWT.NONE);
		TableColumn tblclmncolumEstado2 = columEstado2.getColumn();
		tblclmncolumEstado2.setWidth(100);
		tblclmncolumEstado2 .setText("estado");

		TableViewerColumn  columIncidencia3 = new TableViewerColumn(tableRegistros, SWT.NONE);
		TableColumn tblclmncolumIncidencia3 = columIncidencia3.getColumn();
		tblclmncolumIncidencia3.setWidth(100);
		tblclmncolumIncidencia3 .setText("incidencia");

		TableViewerColumn  columLugar4 = new TableViewerColumn(tableRegistros, SWT.NONE);
		TableColumn tblclmncolumLugar4 = columLugar4.getColumn();
		tblclmncolumLugar4.setWidth(100);
		tblclmncolumLugar4 .setText("lugar");

		tabletableRegistros.addSelectionListener(new SelectionAdapter(){
		    public void widgetSelected(SelectionEvent e) {
		    //TODO ActionTable ViewtableRegistrosde la viewRegistroBase
		        tableRegistrosViewModelSeleccionadoTabla  = (cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.RegistrosViewModel)e.item.getData();
		        tableRegistros_Selection_LogicalEvent ( "event" );
		  } 
});
		tableListaprecios = new TableViewer(container, SWT.BORDER | SWT.FULL_SELECTION);
		tabletableListaprecios = tableListaprecios.getTable();
		tabletableListaprecios.setLinesVisible(true);
		tabletableListaprecios.setHeaderVisible(true);
		tabletableListaprecios.setBounds(632,136,299,580);
		tabletableListaprecios.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		formToolkit.paintBordersFor(tabletableListaprecios);

		TableViewerColumn  columRuta15 = new TableViewerColumn(tableListaprecios, SWT.NONE);
		TableColumn tblclmncolumRuta15 = columRuta15.getColumn();
		tblclmncolumRuta15.setWidth(100);
		tblclmncolumRuta15 .setText("ruta 1");

		TableViewerColumn  columRuta26 = new TableViewerColumn(tableListaprecios, SWT.NONE);
		TableColumn tblclmncolumRuta26 = columRuta26.getColumn();
		tblclmncolumRuta26.setWidth(100);
		tblclmncolumRuta26 .setText("ruta2");

		TableViewerColumn  columPecio7 = new TableViewerColumn(tableListaprecios, SWT.NONE);
		TableColumn tblclmncolumPecio7 = columPecio7.getColumn();
		tblclmncolumPecio7.setWidth(100);
		tblclmncolumPecio7 .setText("pecio");

		tabletableListaprecios.addSelectionListener(new SelectionAdapter(){
		    public void widgetSelected(SelectionEvent e) {
		    //TODO ActionTable ViewtableListapreciosde la viewRegistroBase
		        tableListapreciosViewModelSeleccionadoTabla  = (cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ListapreciosViewModel)e.item.getData();
		        tableListaprecios_Selection_LogicalEvent ( "event" );
		  } 
});
		try {
			initDataBindings();
          }catch (Exception e) {
        }

		viewPartLoadedAction();
	}
	public void setFocus() {
		// Set the focus
	}

      public void viewPartLoadedAction (){
             /**
		 * TODO El c�digo de esta secci�n se sincroniza
		 * con el semantic de la clase : RegistroBaseViewPart
		 */
      }

      public void reboot (){
             /**
		 * TODO El c�digo de esta secci�n se sincroniza
		 * con el semantic de la clase : RegistroBaseViewPart
		 */
      }

      public void syncModel (){
             /**
		 * TODO El c�digo de esta secci�n se sincroniza
		 * con el semantic de la clase : RegistroBaseViewPart
		 */
      }

      public void constructorRegistroBaseViewPart (){
             /**
		 * TODO El c�digo de esta secci�n se sincroniza
		 * con el semantic de la clase : RegistroBaseViewPart
		 */
      }

      public void textNotificacion_ModifyText_LogicalEvent ( String  event ){
             /**
		 * TODO El c�digo de esta secci�n se sincroniza
		 * con el semantic de la clase : RegistroBaseViewPart
		 */
      }

      public void btnHacerliquidacion_Selection_LogicalEvent ( String  event ){
    	  if(textNotificacion.getText().equals("")) {
  			
  			if(conductorImpl == null )textNotificacion.setText("Seleccione un conductor");

  			else if(conductorImpl != null && conductorImpl.getBus() != null) {

  				
  				String valorLiquidacion = mfm.getTheDomain().hacerLiquidacion(conductorImpl);
  				
  				textNotificacion.setText("Se aplico una liquidacio de valor de "+ valorLiquidacion + " pesos al conductor "+conductorImpl.getNombre());
  				mfm.salvar();

  			}

  			else if (!textNotificacion.getText().equals("")) {
  				textNotificacion.setText("Verifique la informacion del conductor");
  			}
  			
  		}else {
  			textNotificacion.setText("El formulario no se ha diligenciado correctamente. No se pudo hacer la liquidacion");
  		}

      }

      public void btnAplicarpromedio_Selection_LogicalEvent ( String  event ){
             if(conductorImpl == null )textNotificacion.setText("Seleccione un conductor");

		else if(conductorImpl != null && conductorImpl.getBus() != null) {

			
			String promedio = mfm.getTheDomain().aplicarPromedio(conductorImpl);
			
			textNotificacion.setText("Se aplico un promedio de "+ promedio + " al conductor "+conductorImpl.getNombre());
			mfm.salvar();

		}

		else if (!textNotificacion.getText().equals("")) {
			textNotificacion.setText("Verifique la informacion del conductor");
		}
      }

      public void btnLimpiar_Selection_LogicalEvent ( String  event ){
             limpiar();
      }
      
      private void limpiar() {
  		mfm.getTheUI().limpiarCampos(contenedorbusquedaViewModel, contenedorinformaciongeneralViewModel, contenedorregistroBaseViewModel);

  		comboNombredelconductorFromTheBusqueda.setText("");
  		comboRutadelconductorFromTheBusqueda.setText("");
  		textNotificacion.setText("");
  		mfm.getTheUI().getTheContenedorRegistroBaseViewModel().getListaRegistrosViewModel().clear();
  		conductorImpl = null;
  		//updateData();

  	}

      public void comboFiltrarrutas_Selection_LogicalEvent ( String  event ){
             contenedorregistroBaseViewModel.setSelectedFiltrarrutasViewModel(filtrarrutasViewModelSeleccionadoCombo);
      }

      public void comboFiltrarrutas_ModifyText_LogicalEvent ( String  event ){
             
    	  mfm.getTheUI().getTheContenedorRegistroBaseViewModel().getListaListapreciosViewModel().clear();
    	  
    	  String content = comboFiltrarrutas.getText();
    	  
    	  HashMap<String, Double> rutas = mfm.getlistaRutas();
    	  
    	  if(content == null || content.equals("") ) {
    		  
    		  
    		 Set<String> keySet = rutas.keySet();
    		 java.util.Iterator<String> iterator = keySet.iterator();
    		 
    		 while (iterator.hasNext()) {
				
    			 
    			 String keySetString = iterator.next();
    			 
    			 Double precio = rutas.get(keySetString);
    			 
    			 String ruta1 = keySetString.split("-")[0];
    			 String ruta2 = keySetString.split("-")[1];
    			 
    			 ListapreciosViewModel item = new ListapreciosViewModelImpl();
    			 item.setRuta1(ruta1);
    			 item.setRuta2(ruta2);
    			 item.setPecio(precio+"");
    			 mfm.getTheUI().getTheContenedorRegistroBaseViewModel().getListaListapreciosViewModel().add(item);
    			 
			}
    		  
    		  
    	  }else {
    		  
     		 Set<String> keySet = rutas.keySet();
     		 java.util.Iterator<String> iterator = keySet.iterator();
     		 
     		 while (iterator.hasNext()) {
 				
     			 
     			 String keySetString = iterator.next();
     			 
     			 Double precio = rutas.get(keySetString);
     			 
     			 String ruta1 = keySetString.split("-")[0];
     			 String ruta2 = keySetString.split("-")[1];
     			 
     			 if(ruta1.contains(content) || ruta2.contains(content)) {
     				 ListapreciosViewModel item = new ListapreciosViewModelImpl();
        			 item.setRuta1(ruta1);
        			 item.setRuta2(ruta2);
        			 item.setPecio(precio+"");
        			 mfm.getTheUI().getTheContenedorRegistroBaseViewModel().getListaListapreciosViewModel().add(item);
     			 }
     			 
     		 }
    		  
		}
    	  
    	  

      }

      public void btnFiltrar_Selection_LogicalEvent ( String  event ){
             /**
    	   * TODO El c�digo de esta secci�n se sincroniza
    	   * con el semantic de la clase : RegistroBaseViewPart
    	   */

      }

      public void textNombreFromTheInformaciongeneral_ModifyText_LogicalEvent ( String  event ){
             /**
		 * TODO El c�digo de esta secci�n se sincroniza
		 * con el semantic de la clase : RegistroBaseViewPart
		 */
      }

      public void textHoraFromTheInformaciongeneral_ModifyText_LogicalEvent ( String  event ){
             /**
		 * TODO El c�digo de esta secci�n se sincroniza
		 * con el semantic de la clase : RegistroBaseViewPart
		 */
      }

      public void textRutaFromTheInformaciongeneral_ModifyText_LogicalEvent ( String  event ){
             /**
		 * TODO El c�digo de esta secci�n se sincroniza
		 * con el semantic de la clase : RegistroBaseViewPart
		 */
      }

      public void textFechaFromTheInformaciongeneral_ModifyText_LogicalEvent ( String  event ){
             /**
		 * TODO El c�digo de esta secci�n se sincroniza
		 * con el semantic de la clase : RegistroBaseViewPart
		 */
      }

      public void comboNombredelconductorFromTheBusqueda_Selection_LogicalEvent ( String  event ){
             contenedorbusquedaViewModel.setSelectedNombredelconductorViewModel(nombredelconductorFromTheBusquedaViewModelSeleccionadoCombo);
      }

      public void comboNombredelconductorFromTheBusqueda_ModifyText_LogicalEvent ( String  event ){
             /**
		 * TODO El c�digo de esta secci�n se sincroniza
		 * con el semantic de la clase : RegistroBaseViewPart
		 */
      }

      public void btnAplicarFromTheBusqueda_Selection_LogicalEvent ( String  event ){

  		String contentString = comboNombredelconductorFromTheBusqueda.getText();
  		limpiar();
  		
  		if(contentString.length()<=1) {
  			textNotificacion.setText("No se ha agregado informacion correcta en el formulario. verifique");
  			return;
  		}
  		String idConductor = contentString.substring(contentString.indexOf("(")+1, contentString.indexOf(")"));

  		conductorImpl = mfm.getConductorID(idConductor);

  		updateInfoConductor(conductorImpl);


  		if(!textNotificacion.getText().contains("El conductor no tiene bus")) {

  			EList<DetalleRegistro> detalleRegistros = conductorImpl.getBus().getLstRuta().get(0).getLstDetalleRegistro();


  			mfm.getTheUI().getTheContenedorRegistroBaseViewModel().getListaRegistrosViewModel().clear();
  			for(DetalleRegistro d: detalleRegistros) {

  				RegistrosViewModelImpl registrosViewModelImpl = new RegistrosViewModelImpl();
  				registrosViewModelImpl.setId(d.getId());
  				registrosViewModelImpl.setHora(d.getHora());
  				registrosViewModelImpl.setIncidencia(d.getIncidencia());
  				registrosViewModelImpl.setLugar(d.getLugar());
  				registrosViewModelImpl.setEstado(d.getEstado());

  				mfm.getTheUI().getTheContenedorRegistroBaseViewModel().getListaRegistrosViewModel().add(registrosViewModelImpl);


  			}
  			mfm.cargar();

  		}

      }

      public void comboRutadelconductorFromTheBusqueda_Selection_LogicalEvent ( String  event ){
             contenedorbusquedaViewModel.setSelectedRutadelconductorViewModel(rutadelconductorFromTheBusquedaViewModelSeleccionadoCombo);
      }

      public void comboRutadelconductorFromTheBusqueda_ModifyText_LogicalEvent ( String  event ){
             /**
		 * TODO El c�digo de esta secci�n se sincroniza
		 * con el semantic de la clase : RegistroBaseViewPart
		 */
      }

      public void btnSeleccionarFromTheBusqueda_Selection_LogicalEvent ( String  event ){
             String contentString = comboRutadelconductorFromTheBusqueda.getText();


		if(contentString.equals("")) textNotificacion.setText("No se ha seleccionado una ruta");
		else {
			String id = contentString.substring(contentString.indexOf("(")+1, contentString.indexOf(")"));

			Ruta ruta = mfm.getRuta(id);

			conductorImpl = (ConductorImpl) ruta.getBus().getConductor();

			updateInfoConductor( conductorImpl );

			EList<DetalleRegistro> detalleRegistros = ruta.getLstDetalleRegistro();

			mfm.getTheUI().getTheContenedorRegistroBaseViewModel().getListaRegistrosViewModel().clear();

			for(DetalleRegistro d: detalleRegistros) {

				RegistrosViewModelImpl registrosViewModelImpl = new RegistrosViewModelImpl();
				registrosViewModelImpl.setId(d.getId());
				registrosViewModelImpl.setHora(d.getHora());
				registrosViewModelImpl.setIncidencia(d.getIncidencia());
				registrosViewModelImpl.setLugar(d.getLugar());
				registrosViewModelImpl.setEstado(d.getEstado());

				mfm.getTheUI().getTheContenedorRegistroBaseViewModel().getListaRegistrosViewModel().add(registrosViewModelImpl);


			}

		}
      }
      private void updateInfoConductor(ConductorImpl conductorImpl) {

  		textNombreFromTheInformaciongeneral.setText(conductorImpl.getNombre());
  		textFechaFromTheInformaciongeneral.setText(LocalDateTime.now().toString().split("T")[0]);
  		textHoraFromTheInformaciongeneral.setText(LocalDateTime.now().toString().split("T")[1].substring(0,8));
  		if(conductorImpl.getBus()==null||conductorImpl.getBus().getLstRuta().get(0) == null || conductorImpl.getBus().getLstRuta().get(0).getId() == null) textNotificacion.setText(textNotificacion.getText()+"El conductor no tiene bus");
  		else textRutaFromTheInformaciongeneral.setText(conductorImpl.getBus().getLstRuta().get(0).getId()); 

  	}

      public void tableRegistros_Selection_LogicalEvent ( String  event ){
             contenedorregistroBaseViewModel.setSelectedRegistrosViewModel(tableRegistrosViewModelSeleccionadoTabla);
      }

      public void tableListaprecios_Selection_LogicalEvent ( String  event ){
             contenedorregistroBaseViewModel.setSelectedListapreciosViewModel(tableListapreciosViewModelSeleccionadoTabla);
      }
      protected DataBindingContext initDataBindings() {
//
        DataBindingContext bindingContext = new DataBindingContext();
        IObservableValue observeTexttextNotificacionObserveWidget = WidgetProperties.text(SWT.Modify).observe(textNotificacion);
        IObservableValue contenedorregistroBasetextNotificacionObserveValue = EMFObservables.observeValue(contenedorregistroBaseViewModel,cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelPackage.Literals.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__NOTIFICACION);
        bindingContext.bindValue(observeTexttextNotificacionObserveWidget,contenedorregistroBasetextNotificacionObserveValue, null, null);
        //

      ObservableListContentProvider listContentProvider1= new ObservableListContentProvider();
        IObservableMap[] observeMaps1= EMFObservables.observeMaps(listContentProvider1.getKnownElements(),
        new EStructuralFeature[]{cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelPackage.Literals.FILTRARRUTAS_VIEW_MODEL__NAME});
        comboViewerFiltrarrutas.setLabelProvider(new ObservableMapLabelProvider(observeMaps1));
        comboViewerFiltrarrutas.setContentProvider(listContentProvider1);

        IObservableList observeList1= EMFObservables.observeList(Realm.getDefault(),contenedorregistroBaseViewModel,
        cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelPackage.Literals.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__LISTA_FILTRARRUTAS_VIEW_MODEL);
        comboViewerFiltrarrutas.setInput(observeList1);
        //
        IObservableValue observeTexttextNombreFromTheInformaciongeneralObserveWidget = WidgetProperties.text(SWT.Modify).observe(textNombreFromTheInformaciongeneral);
        IObservableValue contenedorinformaciongeneraltextNombreFromTheInformaciongeneralObserveValue = EMFObservables.observeValue(contenedorinformaciongeneralViewModel,cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelPackage.Literals.CONTENEDOR_INFORMACIONGENERAL_VIEW_MODEL__NOMBRE);
        bindingContext.bindValue(observeTexttextNombreFromTheInformaciongeneralObserveWidget,contenedorinformaciongeneraltextNombreFromTheInformaciongeneralObserveValue, null, null);
        //
        IObservableValue observeTexttextHoraFromTheInformaciongeneralObserveWidget = WidgetProperties.text(SWT.Modify).observe(textHoraFromTheInformaciongeneral);
        IObservableValue contenedorinformaciongeneraltextHoraFromTheInformaciongeneralObserveValue = EMFObservables.observeValue(contenedorinformaciongeneralViewModel,cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelPackage.Literals.CONTENEDOR_INFORMACIONGENERAL_VIEW_MODEL__HORA);
        bindingContext.bindValue(observeTexttextHoraFromTheInformaciongeneralObserveWidget,contenedorinformaciongeneraltextHoraFromTheInformaciongeneralObserveValue, null, null);
        //
        IObservableValue observeTexttextRutaFromTheInformaciongeneralObserveWidget = WidgetProperties.text(SWT.Modify).observe(textRutaFromTheInformaciongeneral);
        IObservableValue contenedorinformaciongeneraltextRutaFromTheInformaciongeneralObserveValue = EMFObservables.observeValue(contenedorinformaciongeneralViewModel,cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelPackage.Literals.CONTENEDOR_INFORMACIONGENERAL_VIEW_MODEL__RUTA);
        bindingContext.bindValue(observeTexttextRutaFromTheInformaciongeneralObserveWidget,contenedorinformaciongeneraltextRutaFromTheInformaciongeneralObserveValue, null, null);
        //
        IObservableValue observeTexttextFechaFromTheInformaciongeneralObserveWidget = WidgetProperties.text(SWT.Modify).observe(textFechaFromTheInformaciongeneral);
        IObservableValue contenedorinformaciongeneraltextFechaFromTheInformaciongeneralObserveValue = EMFObservables.observeValue(contenedorinformaciongeneralViewModel,cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelPackage.Literals.CONTENEDOR_INFORMACIONGENERAL_VIEW_MODEL__FECHA);
        bindingContext.bindValue(observeTexttextFechaFromTheInformaciongeneralObserveWidget,contenedorinformaciongeneraltextFechaFromTheInformaciongeneralObserveValue, null, null);
        //

      ObservableListContentProvider listContentProviderNombredelconductorFromTheBusqueda= new ObservableListContentProvider();
        IObservableMap[] observeMapsNombredelconductorFromTheBusqueda= EMFObservables.observeMaps(listContentProviderNombredelconductorFromTheBusqueda.getKnownElements(),
        new EStructuralFeature[]{cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelPackage.Literals.NOMBREDELCONDUCTOR_VIEW_MODEL__NAME});
        comboViewerNombredelconductorFromTheBusqueda.setLabelProvider(new ObservableMapLabelProvider(observeMapsNombredelconductorFromTheBusqueda));
        comboViewerNombredelconductorFromTheBusqueda.setContentProvider(listContentProviderNombredelconductorFromTheBusqueda);

        IObservableList observeListNombredelconductorFromTheBusqueda= EMFObservables.observeList(Realm.getDefault(),contenedorbusquedaViewModel,
        cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelPackage.Literals.CONTENEDOR_BUSQUEDA_VIEW_MODEL__LISTA_NOMBREDELCONDUCTOR_VIEW_MODEL);
        comboViewerNombredelconductorFromTheBusqueda.setInput(observeListNombredelconductorFromTheBusqueda);
        //

      ObservableListContentProvider listContentProviderRutadelconductorFromTheBusqueda= new ObservableListContentProvider();
        IObservableMap[] observeMapsRutadelconductorFromTheBusqueda= EMFObservables.observeMaps(listContentProviderRutadelconductorFromTheBusqueda.getKnownElements(),
        new EStructuralFeature[]{cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelPackage.Literals.RUTADELCONDUCTOR_VIEW_MODEL__NAME});
        comboViewerRutadelconductorFromTheBusqueda.setLabelProvider(new ObservableMapLabelProvider(observeMapsRutadelconductorFromTheBusqueda));
        comboViewerRutadelconductorFromTheBusqueda.setContentProvider(listContentProviderRutadelconductorFromTheBusqueda);

        IObservableList observeListRutadelconductorFromTheBusqueda= EMFObservables.observeList(Realm.getDefault(),contenedorbusquedaViewModel,
        cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelPackage.Literals.CONTENEDOR_BUSQUEDA_VIEW_MODEL__LISTA_RUTADELCONDUCTOR_VIEW_MODEL);
        comboViewerRutadelconductorFromTheBusqueda.setInput(observeListRutadelconductorFromTheBusqueda);
        //
        ObservableListContentProvider listContentProviderTableRegistrosTableViewer = new ObservableListContentProvider();
        IObservableMap[] observeMapsTableRegistrosTableViewer= EMFObservables.observeMaps(listContentProviderTableRegistrosTableViewer.getKnownElements(),
        new EStructuralFeature[]{cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelPackage.Literals.REGISTROS_VIEW_MODEL__ID,cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelPackage.Literals.REGISTROS_VIEW_MODEL__HORA,cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelPackage.Literals.REGISTROS_VIEW_MODEL__ESTADO,cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelPackage.Literals.REGISTROS_VIEW_MODEL__INCIDENCIA,cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelPackage.Literals.REGISTROS_VIEW_MODEL__LUGAR});
        tableRegistros.setLabelProvider(new ObservableMapLabelProvider(observeMapsTableRegistrosTableViewer));
        tableRegistros.setContentProvider(listContentProviderTableRegistrosTableViewer);

        //
        IObservableList observeListTableRegistrosTableViewer= EMFObservables.observeList(Realm.getDefault(),contenedorregistroBaseViewModel,
        cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelPackage.Literals.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__LISTA_REGISTROS_VIEW_MODEL);
        tableRegistros.setInput(observeListTableRegistrosTableViewer);
            //
        ObservableListContentProvider listContentProviderTableListapreciosTableViewer = new ObservableListContentProvider();
        IObservableMap[] observeMapsTableListapreciosTableViewer= EMFObservables.observeMaps(listContentProviderTableListapreciosTableViewer.getKnownElements(),
        new EStructuralFeature[]{cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelPackage.Literals.LISTAPRECIOS_VIEW_MODEL__RUTA1,cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelPackage.Literals.LISTAPRECIOS_VIEW_MODEL__RUTA2,cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelPackage.Literals.LISTAPRECIOS_VIEW_MODEL__PECIO});
        tableListaprecios.setLabelProvider(new ObservableMapLabelProvider(observeMapsTableListapreciosTableViewer));
        tableListaprecios.setContentProvider(listContentProviderTableListapreciosTableViewer);

        //
        IObservableList observeListTableListapreciosTableViewer= EMFObservables.observeList(Realm.getDefault(),contenedorregistroBaseViewModel,
        cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorregistrobaseviewmodelPackage.Literals.CONTENEDOR_REGISTRO_BASE_VIEW_MODEL__LISTA_LISTAPRECIOS_VIEW_MODEL);
        tableListaprecios.setInput(observeListTableListapreciosTableViewer);
            //

         return bindingContext;
//
      }
}
