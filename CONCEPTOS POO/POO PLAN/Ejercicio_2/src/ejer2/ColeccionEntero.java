package ejer2;

import java.util.Random;
public class ColeccionEntero {
    
    private int[] arreglo;
    
    public ColeccionEntero(int tamaño){
    
        arreglo = new int[tamaño];
        Random azar = new Random();
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = azar.nextInt(100);
        }
    }
    
    public void desplegarColeccion(){
    
        for (int i = 0; i <arreglo.length; i++) {
            System.out.println("Valor en "+i+ "Es "+arreglo[i]);
        }
    }
    public boolean exiteValor(int valorBuscado){
        
        for (int i = 0; i < arreglo.length; i++) {
            if (valorBuscado== arreglo[i]) {
                
            }
        }
        return false;
    }
    
    public int maximoValor(){
        int max=0;
        for (int i = 0; i < arreglo.length; i++) {
            if (max < arreglo[i]) {
                max= arreglo[i];
            }
        }
        return max;
    }
    public void deplegarPosicionMultiplo(int valor){
        for (int i = 0; i < arreglo.length; i++) {
            if (i%valor == 0) {
                System.out.println("Valor en: "+ i + "es " + arreglo[i]);
            }
        }
    }
    
    public double promedioValores(){
        double suma=0;
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }
        return suma/arreglo.length;
    }
    
    public void invertir(){
        int k = arreglo.length - 1;
        for (int i = 0; i < arreglo.length/2; i++) {
            int temp = arreglo [i];
            arreglo[i] = arreglo[k-i];
            arreglo[k-i] = temp;
        }
        desplegarColeccion();
    }
}
