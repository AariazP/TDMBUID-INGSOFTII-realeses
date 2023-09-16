package cootracir.view.model;
import cootracir.view.*;
import cootracir.view.views.*;

import java.util.HashMap;

import org.eclipse.emf.common.util.EList;

import cootracir.*;
import cootracir.domain.*;
import cootracir.domain.Ruta;
import cootracir.domain.impl.ConductorImpl;
import cootracir.domain.main1.*;
import cootracir.ui.*;
import cootracir.ui.viewmodels.*;
import cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.*;



public class ModelFactoryModel {

//------------------------------  Singleton ------------------------------------------------

// Clase estatica oculta. Tan solo se instanciara el singleton una vez

   private static class SingletonHolder {
       private final static ModelFactoryModel eINSTANCE = new ModelFactoryModel();
   }

           // M�todo para obtener la instancia de nuestra clase

   public static ModelFactoryModel getInstance()  { 
       return SingletonHolder.eINSTANCE;
   }

   RegistroBaseViewPart registroBaseViewPart = null;

   public RegistroBaseViewPart getRegistroBaseViewPart(){
       return  registroBaseViewPart;
   }

  public void setRegistroBaseViewPart(RegistroBaseViewPart registroBaseViewPart) {
      this.registroBaseViewPart = registroBaseViewPart ;
   }

     private String estado = "NOINICIALIZADO";
     ModelFactory modelFactory = cootracirFactory.eINSTANCE.createModelFactory();

   static String URL = "/test/src/model/model.cootracir";
               
   public ModelFactoryModel() {
        ModelFactory tempModelFactory = modelFactory;
        modelFactory = modelFactory.cargar(URL);
        modelFactory.implementarModelo();
        modelFactory.salvar(URL);
   }

   public ModelFactory getFactoryModel() {
     return modelFactory;
   }
   public void salvar(){
        modelFactory.salvar(URL);
  }

    public void cargar(){
       modelFactory = modelFactory.cargar(URL);
  }
   public UI getTheUI() {
     // TODO Auto-generated method stub
	     return modelFactory.getTheUI();
   }

   public Domain getTheDomain() {
   	// TODO Auto-generated method stub
   	return modelFactory.getTheDomain();
   }
//referencias de la interfaz RegistroBase

   public cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorRegistroBaseViewModel getTheContenedorRegistroBaseViewModel() {
     return getTheUI().getTheContenedorRegistroBaseViewModel();
   }
   public cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorInformaciongeneralViewModel getTheInformaciongeneralViewModelOfRegistroBase() {
     return getTheContenedorRegistroBaseViewModel().getTheInformaciongeneral();
   }
   public cootracir.ui.viewmodels.contenedorregistrobaseviewmodel.ContenedorBusquedaViewModel getTheBusquedaViewModelOfRegistroBase() {
     return getTheContenedorRegistroBaseViewModel().getTheBusqueda();
   }
//----------------referencias de la interfaz RegistroBase

   public void actualizarEstado(String evento) {
	   if(this.estado.equals("NOINICIALIZADO")) {
		   if(evento.equals("iniciar")) {
			   this.estado = "DESACTUALIZADO";
		   }
	   }
	   if(this.estado.equals("ACTUALIZADO")) {
		   if(evento.equals("iniciar")) {
			   this.estado = "DESACTUALIZADO";
		   }
	   }
	   if(this.estado.equals("DESACTUALIZADO")) {
		   if(evento.equals("actualizar")) {
			   this.estado = "ACTUALIZADO";
		   }
	   }
   }

   public String getEstado() {
	   // TODO Auto-generated method stub
	   return estado;
   }

   public EList<Ruta> getRutas() {
		return getTheDomain().getRutas();
	}

  public ConductorImpl getConductorID(String idConductor) {
		return getTheDomain().getConductorID(idConductor);
	}

public Ruta getRuta(String id) {
	EList<Ruta> rutas = getTheDomain().getRutas();
	
	for(Ruta r: rutas) {
		
		if(r.getId().equals(id)) return r;
		
	}
	
	return null;
}

	public String aplicarPromedio(ConductorImpl conductorImpl) {
		return getTheDomain().aplicarPromedio(conductorImpl);
	}

	public HashMap<String, Double> getlistaRutas() {
		return getTheDomain().getListaRutas();
	}

}