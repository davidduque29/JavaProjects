
package nombrepunto;

import java.awt.Point;

    class NombrePunto extends Point {
     String nombre;

     NombrePunto(int x, int y, String nombre) {
         super(x,y);
         this.nombre = nombre;
     }

     public static void main(String[ ] arguments) {
         NombrePunto np = new NombrePunto(5, 5, "PuntoEncuentro") ;
         System. out. println( "x es " + np.x) ;
         System. out. println( "y es " + np.y) ;
         System. out. println( "Nombre es " + np.nombre) ;
     }
    
}
