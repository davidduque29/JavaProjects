
package probarreferencias;

import java.io.*;

public class RaizNuevo2 {
    
    public static void main(String args[]) throws IOException{
       BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Escribe un número:");
       String str = buff.readLine();
       int conversion = Integer.parseInt(str );
       System. out.println("La raíz cuadrada de "
             + conversion
             + " es "
             + Math.sqrt(conversion) );
     }
}
