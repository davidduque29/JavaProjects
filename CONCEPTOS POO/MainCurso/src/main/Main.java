/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
         Alumno alumn = new Alumno("luis", 23);
        Curso curso = new Curso(12,"6");
        curso.getEstudiante().add(alumn);
        System.out.println(curso.getEstudiante()+"curso: "+curso.getNombre());
    }
    
}
