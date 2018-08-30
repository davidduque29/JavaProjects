/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * Super clase
 */
public class Animal {
   private String nombre;
   private String clasificacion;
   
   public Animal(String nombre, String clasificacion){
       this.nombre = nombre;
       this.clasificacion = clasificacion;
   }
    public void Rugido(){
        System.out.println("Hace algun rugido");
    }
    public void Nacimiento(){
        System.out.println("Ha nacido un animal");
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }
   
}
