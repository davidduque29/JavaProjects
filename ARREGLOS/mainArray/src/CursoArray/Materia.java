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
public class Materia { // una materia esta compuesta de notas
    private String nombre;
    private ArrayList<Double> notas;// 1. creo array para guardar notas

    public void agregarNotas (Double nota){ //2. agrego la nota
        notas.add(nota);
    }
    public void mostrarNotas (Double nota){//3. muestro la nota
        for (Double calificacion : notas) {
            System.out.println(calificacion);
        }
    }
    public double Promedio(){
       double suma=0d;
       double promedio=0d;
       for (Double nota : notas) {
            //suma=suma+nota;
            suma += nota;
        }
        promedio = suma / notas.size();
        return promedio;
    }
    
    public Materia(String nombre) { // [_] constructor
        this.nombre = nombre;
        this.notas = new ArrayList <>();
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Materia{" + "nombre=" + nombre + ", notas=" + notas + '}';
    }
    
    
}
