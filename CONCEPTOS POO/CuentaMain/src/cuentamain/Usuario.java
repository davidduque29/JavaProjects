/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentamain;

import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private ArrayList<String> listaClave;

   public void cambiarClave(String newKey){
       listaClave.add(0,newKey);
   }
    public void mostrarClaves(){
        System.out.println("Usuario :" + this.nombre);
        for (int i = 0; i < listaClave.size(); i++) {
            System.out.println(listaClave.get(i));
        }
        
    }
    
    public Usuario(String nombre) {// constructor
        this.nombre = nombre;
        this.listaClave= new ArrayList<>();
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getListaClave() {
        return listaClave;
    }

    public void setListaClave(ArrayList<String> listaClave) {
        this.listaClave = listaClave;
    }
    
}
