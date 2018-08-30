/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CursoArray;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ivandavid
 */
public class Alumno { // un alumno tiene materias
    private String nombre;
    private int cedula;
    private int edad;
    private ArrayList<Materia> materias;
    
    public void registrarMateria(Materia materia){ //1.se añade las materias
        materias.add(materia);
    }
    
     public void mostrarMateria(){ //2.se muestran las materias
         for (Materia area : materias) {
             System.out.println(area);
         }
    }
     
    public Alumno(String nombre, int cedula, int edad) {// [_] constructor
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
        this.materias = new ArrayList<>();
    }
    
    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

   public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", cedula=" + cedula + ", edad=" + edad + ", materias=" + materias + '}';
    }
    
    
}
