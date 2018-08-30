
package division;


public class Division {

     public static void main(String[] args) {
        if (args.length == 2) {
            int resultado = 0;
            try {
                resultado = Integer.parseInt(args[0]) /
                  Integer.parseInt(args[1]);
                System.out.println(args[0] + " dividido por "
                    + args[1] + " igual a " + resultado);
            } catch (NumberFormatException e) {
                System.out.println("Ambos argumentos deben ser números.");
                throw e;
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
                throw e;
            }
           /* finally {
                   System.out.println("El bloque try-catch ha finalizado. Se ejecuta siempre finally");
               }*/
        }
    }
    
}
