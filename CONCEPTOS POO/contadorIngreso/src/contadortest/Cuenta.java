/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contadortest;

import java.util.ArrayList;

public class Cuenta {
   private String nombre;
   private String clave;
   private ArrayList<Cuenta> listaCuenta;

    public Cuenta(String nombre, String clave) {
        this.nombre = nombre;
        this.clave = clave;
        this.listaCuenta=new ArrayList<>();
    }
   public void agregarCuenta(Cuenta count){
       this.listaCuenta.add(count);
   }
    public void mostrarDatos(){
        for (Cuenta datosCuentas : listaCuenta) {
            System.out.println("datos: "+datosCuentas);
        }
    }
    public void mostrarallDatos(){
        for (int i = 0; i < listaCuenta.size(); i++) {
            System.out.println(listaCuenta.get(i).toString());
        }
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public ArrayList<Cuenta> getListaCuenta() {
        return listaCuenta;
    }

    public void setListaCuenta(ArrayList<Cuenta> listaCuenta) {
        this.listaCuenta = listaCuenta;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "nombre=" + nombre + ", clave=" + clave + '}';
    }

   
   
   
    
}
