/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author ivandavid
 */
public class Coche {
    private int velocidad;
    private int aceleracion;
    private String nombre;
    private static String nombre2; // el atrib statico lo compartiran todos los objetos
    
    // constructor - lleva el nivel de seguridad (public, private)
    // nombre de la clase
    // los parametros - cuando llamo a un constructor estoy:
    // llamando una serie de parametros
    // nunca se llama un constructor
    public Coche (int velocidad, int aceleracion, String nombre, String nombre2){
        this.velocidad=velocidad;
        this.aceleracion=aceleracion;
        this.nombre=nombre;
        this.nombre2=nombre2;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(int aceleracion) {
        this.aceleracion = aceleracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public static String getNombre2(){
        return nombre2;
    }
    public static void setNombre2(String nombre2){
        Coche.nombre2= nombre2;
    }
        
}
