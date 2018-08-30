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
public class Curso {
    private ArrayList<Alumno> listAlumn;

    public Curso() {
        this.listAlumn = new ArrayList<>();
    }

    public void adAlumnos(Alumno estudiante) {
        listAlumn.add(estudiante);
    }
    public void mostrarAlm(){
        for (Alumno alumno : listAlumn) {
//            System.out.println("Result: "+alumno);
               for (Materia mater : alumno.getListMater()) {
                    System.out.println("* "+alumno+ mater);
            }
        }
     
    }
    public void mostrarCurso(){
        
    }
    
    public ArrayList<Alumno> getListAlumn() {
        return listAlumn;
    }

    public void setListAlumn(ArrayList<Alumno> listAlumn) {
        this.listAlumn = listAlumn;
    }
    
    
}
