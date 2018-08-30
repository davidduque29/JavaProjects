/*
Diseñe un programa (en consola) que solicite por teclado el nombre de un artículo, su
valor de unidad, cantidad a llevar, y si es o no de la canasta familiar, como resultado debe
mostrar el total del valor de los productos a llevar y si no son de la canasta familiar se le
sume el IVA 16%.
 */
package canastafamiliar;

import java.io.IOException;
import java.util.Scanner;

public class CanastaFamiliar {

    public static void main(String[] args) throws IOException {

        Scanner producto = new Scanner(System.in);

        String articulo;
        int valor, cantidad, canasta, total=0, oprimir;

do {
        System.out.println("------------------------");
        System.out.println("Bienvenido al programa:");
        System.out.println("SUPER MERCADO LA GRANJA");
        System.out.println("------------------------");
        System.out.println("");
        System.out.println("Objetivo: Saber el valor total del producto que se va a comprar.");
        System.out.println("");
        System.out.println("Por favor digite el nombre del artículo: ");
        articulo = producto.nextLine();

        System.out.println("");
        System.out.println("Digite el valor del producto: ");
        valor = producto.nextInt();
        System.out.println("");

        System.out.println("Cuantos articulos desea llevar: ");
        cantidad = producto.nextInt();
        System.out.println("");

        System.out.println("* Si el articulo es de canasta familiar digite [1]: ");
        System.out.println("  sino digite [2] ");
        canasta = producto.nextInt();

        if (canasta == 1) {
            total = ((valor * 116)/100)* cantidad;
        } else {
        }
        if (canasta == 2) {
            total = (valor * cantidad);
        }
        System.out.println("");
        System.out.println(":::::::::::::::::::::::::::::::");
        System.out.println("Articulo: " + articulo);
        System.out.println("Valor unidad: $ " + valor);
        System.out.println("Cantidad:" + cantidad);
        System.out.println("Valor total: $" + total);
        System.out.println(":::::::::::::::::::::::::::::::");
        
          System.out.println("");
        System.out.println("------------------------------------");
        System.out.println("Para repetir el programa marque(1)");
        System.out.println("de lo contrario otro número. ");
        System.out.println("------------------------------------");
        oprimir=producto.nextInt();
        } while (oprimir == 1);
    }

}
