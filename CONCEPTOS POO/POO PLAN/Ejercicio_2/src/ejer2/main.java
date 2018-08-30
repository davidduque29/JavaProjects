package ejer2;

import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del arreglo a instanciar");
        ColeccionEntero col = new ColeccionEntero(leer.nextInt());
        col.desplegarColeccion();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
        col.invertir();
        System.out.println("Ingrese el numero a buscar");
        int valorBuscado = leer.nextInt();
        System.out.println(col.exiteValor(valorBuscado));
        System.out.println("El numero Maximo es: " + col.maximoValor());
        System.out.println("Ingrese un numero");
        col.deplegarPosicionMultiplo(leer.nextInt());
        System.out.println("El promedio de los valores es " + col.promedioValores());
        
        
    }
    
}
