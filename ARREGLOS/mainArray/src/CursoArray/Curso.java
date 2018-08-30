/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CursoArray;

import java.util.ArrayList;

/**
 *
 * @author ivandavid
 */
public class Curso {// un curso esta compuesto de alumnos
    private ArrayList<Alumno> listAlumnos;// 1. creo array para guardar alumnos

    public void agregarAlumno(Alumno student){// 2. agrego el alumno en el main
        listAlumnos.add(student);
    }
     public void mostrarAlumno(){//2. muestro el alumno
         for (Alumno Alumnos : listAlumnos) {
             System.out.println("* "+Alumnos);
         }
         for (Alumno mat : listAlumnos) {
             System.out.println(""+ mat);
         }
    }
    public Curso() { // [_] constructor
        this.listAlumnos = new ArrayList <>();
    }
    
    public ArrayList<Alumno> getListAlumnos() {
        return listAlumnos;
    }

    public void setListAlumnos(ArrayList<Alumno> listAlumnos) {
        this.listAlumnos = listAlumnos;
    }

    @Override
    public String toString() {
        return "Curso{" + "listAlumnos=" + listAlumnos + '}';
    }
    
    
}
