
package probarreferencias;


public class CastingVariables {
    public static void main(String[ ] arguments) {
        double x = 56.01;
        float y = (float)(2 * x);
        System.out.println(y);

        double temp1 = 3.4 * y;
        int temp2 = (int)(temp1);
        System.out.println(temp2);
     }
}
