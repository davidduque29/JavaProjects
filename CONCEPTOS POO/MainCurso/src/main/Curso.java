/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ivandavid
 */
public class Curso {
    Scanner leer = new Scanner(System.in);
    private int id;
    private String nombre;
    private ArrayList<Alumno> estudiante;

    
    public ArrayList<Alumno> getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(ArrayList<Alumno> estudiante) {
        this.estudiante = estudiante;
    }
    
    public Curso (int id, String nombre){
        this.id=id;
        this.nombre= nombre;
        this.estudiante=new ArrayList<>();
    }
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public void setString(String nombre){
        this.nombre=nombre;
    }
     public String getNombre(){
        return nombre;
    }
    public void agregarAlumno(Alumno alumno){
        
        estudiante.add(alumno);
    }
    public void mostrarAlumno(){
        for (Alumno aprendiz : estudiante) {
            System.out.println(aprendiz.toString());
        }
    }
    
}
