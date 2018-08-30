/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testmain;

import java.util.ArrayList;

/**
 *
 * @author ivandavid
 */
public class Alumno {
    private String nombre;
    private String tarjeta;
    private ArrayList<Materia> listMater;

    public String getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }

    public Alumno(String nombre, String tarjeta) {
        this.nombre = nombre;
        this.tarjeta = tarjeta;
        this.listMater=new ArrayList<>();
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Materia> getListMater() {
        return listMater;
    }

    public void setListMater(ArrayList<Materia> listMater) {
        this.listMater = listMater;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", tarjeta=" + tarjeta + '}';
    }
    
    
}
