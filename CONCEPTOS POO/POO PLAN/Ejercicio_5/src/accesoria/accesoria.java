/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoria;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author personal
 */
public class accesoria {

    public int contador = 1;
    public int numero;
    ArrayList<Integer> numeros;
    public int dato;
    
    public class complejo{
        private double real;
        private double imag;
        
        public complejo(){
            real=0.0;
            imag=0.0;
        }
        
        public complejo(double real, double imag){
            this.real=real;
            this.imag=imag;
        }
    }
    
    public void Operaciones(int dato) {
        Scanner leer = new Scanner(System.in);
        numeros = new ArrayList<Integer>();
        int detener = 1;
        

        do {
            for (int i = 0; i < contador; i++) {
                System.out.println("Por favor ingrese un dato: 0 para finalizar");
                dato = leer.nextInt();
                if (dato != 0) {
                    numeros.add(dato);
                }
                
                
                //contador = contador + 1;
            }
        } while (dato !=0);

    }

    public void mostrarArray() {

        for (int i = 0; i < numeros.size(); i++) {
            System.out.println("Datos en la posición " + i + " Numero = " + numeros.get(i));
        }

    }

    public void mostrarIterador() {
        Iterator<Integer> nombreIterator = numeros.iterator();
        while (nombreIterator.hasNext()) {
            int numeros = nombreIterator.next();
            System.out.print(numeros + " / ");
        }
    }

    public void mostrarDatosPosicion() {
        Scanner leer = new Scanner(System.in);
        int posicion;
        System.out.println("Ingrese el numero de la posicion que desea ver: ");
        posicion = leer.nextInt();
        
        System.out.println("En la posicion "+posicion+" esta: "+numeros.get(posicion));

    }
    public void mostrarElemento14(){
        System.out.println("El Numero de la posicion 14 es "+numeros.get(14));
    }
}
