/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizarrahistoria;

/**
 *
 * @author ivandavid
 */
public class PizarraHistoria {

    String estatus;
int numeroPregunta;
int puntuacion;

PizarraHistoria(String entrada1, int entrada2, int entrada3){
    estatus = entrada1;
    numeroPregunta = entrada2;
    puntuacion = entrada3;
}
public static void main(String[] args) {
    PizarraHistoria grecia = new PizarraHistoria("activa", 3, 6);
    System.out.println(grecia.estatus);
    System.out.println(grecia.numeroPregunta);
    System.out.println(grecia.puntuacion);
}
    
}
