
package accesoria;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        accesoria ac = new accesoria();
        ac.Operaciones(0);
        ac.mostrarArray();
        ac.mostrarIterador();
        ac.mostrarDatosPosicion();
        ac.mostrarElemento14();
    }
    
}
