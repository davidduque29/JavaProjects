/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaseguridad;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        String usuario;
        String contrasena;
        boolean ingresoCorrecto;
        int conteo = 0;
        int contador = 0;
        String opc = "si";

        Usuarios usuario1 = new Usuarios("andrez", "12345");

        Scanner lector = new Scanner(System.in);
        do {
            System.out.println("*************  LOGIN  **********************");

            System.out.print("Ingrese su usuario : ");
            usuario = lector.next();

            System.out.println();

            System.out.print("Ingrese su contraseña : ");
            contrasena = lector.next();

            ingresoCorrecto = usuario1.validarIngreso(usuario, contrasena);

            if (ingresoCorrecto) {

                String nuevaContrasena;

                System.out.println("Ingrese su nueva contraseña");
                nuevaContrasena = lector.next();
                usuario1.cambiarContrasena(nuevaContrasena);

                contador = usuario1.CantidadIngresos(ingresoCorrecto);
                System.out.println("El usuario a ingresado al sistema " + contador + " veces");
            }
            
            System.out.println("Deseas ingresar de nuevo");
            System.out.println("si - no");
            opc = lector.next();
        } while (!opc.equals("no"));
    }

}
