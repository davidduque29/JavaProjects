/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CursoArray;

import java.util.Scanner;

/**
 *
 * @author ivandavid
 */
public class MainArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.println("::: COLEGIO SIMULATOR  :::\n");
        Curso curso = new Curso();
        
        Alumno alumn1 = new Alumno("Ivan", 1054549309, 27);
        alumn1.getMaterias().add(new Materia ("Ingles"));
        alumn1.getMaterias().get(0).agregarNotas(4.0);
        alumn1.getMaterias().get(0).agregarNotas(3.5);
        alumn1.getMaterias().get(0).agregarNotas(4.2);
        alumn1.getMaterias().get(0).agregarNotas(5.0);
        
         alumn1.getMaterias().add(new Materia ("depo"));
        alumn1.getMaterias().get(1).agregarNotas(2.0);
        alumn1.getMaterias().get(1).agregarNotas(2.5);
        alumn1.getMaterias().get(1).agregarNotas(4.2);
        alumn1.getMaterias().get(1).agregarNotas(5.0);
        
      /*  Alumno alumn2 = new Alumno("Mario", 1054549309, 20);
        alumn2.getMaterias().add(new Materia ("linguistica"));
        alumn2.getMaterias().get(0).agregarNotas(5.0);
        alumn2.getMaterias().get(0).agregarNotas(3.5);
        alumn2.getMaterias().get(0).agregarNotas(3.2);
        alumn2.getMaterias().get(0).agregarNotas(3.0);
        */
        curso.agregarAlumno(alumn1);
//        curso.agregarAlumno(alumn2);
        curso.mostrarAlumno();
        
        
    }
    
}
