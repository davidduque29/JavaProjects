/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto3_f;

import java.util.ArrayList;

/**
 *
 * @author ivandavid
 */
public class ProcesoProduccion {
    private String codProceso;
    private int codProcesoInt;
    private String nombre;
    private String nombreInt;
    private ArrayList<ProcesoProduccion> ListaProceso;

    public ProcesoProduccion(String codProceso, String nombre) {
        this.codProceso = codProceso;
        this.nombre = nombre;
    }
     public ProcesoProduccion(int codProcesoInt, String nombreInt) {
        this.codProcesoInt=codProcesoInt;
        this.nombre = nombreInt;
    }
    
 public void añadirProceso(ProcesoProduccion proc){
         ListaProceso.add(proc);
    }
    public void mostrarProceso(){
        for ( ProcesoProduccion procesoList : ListaProceso) {
                    System.out.println("proceso: \n"+procesoList);
                    }       
        }

    
    public String getCodProceso() {
        return codProceso;
    }

    public void setCodProceso(String codProceso) {
        this.codProceso = codProceso;
    }
     public void setCodProceso(int codProceso) {
        this.codProcesoInt=codProceso;
    }

    public int getCodProcesoInt() {
        return codProcesoInt;
    }
  

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreInt() {
        return nombreInt;
    }

    public void setNombreInt(String nombreInt) {
        this.nombreInt = nombreInt;
    }

    public ArrayList<ProcesoProduccion> getListaProceso() {
        return ListaProceso;
    }

    public void setListaProceso(ArrayList<ProcesoProduccion> ListaProceso) {
        this.ListaProceso = ListaProceso;
    }
    
    
}
