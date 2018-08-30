
package sumador;

/**
 *
 * @author ivandavid
 */
public class Sumador {
    public static void main(String[] args) 
{
    float sum = 0;
    for (int i = 0; i < args.length; i++) 
{
        sum = sum + Float.parseFloat(args[i]);
    }
    
System.out.println("Esos números suman un total de: " + sum);
    }
}
