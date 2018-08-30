
import com.illasaron.paratienda.*;

 public class Regalos {
    public static void main( String[ ] arguments) {
         Escaparate almacen = new Escaparate();
         almacen.addArticulo("C01" , "ZAPATILLAS", "9.99" , "150") ;
         almacen.addArticulo("C02" , "BOLSA DEPORTIVA", " 12.99" , "82" );
         almacen.addArticulo("C03" , "SUDADERA", "10.49" , "800") ;
         almacen.addArticulo("D01" , "CAMISETA" , "16.99", "90") ;
         almacen.sort();

         for (int i = 0; i < almacen.getSize(); i++) {
             Articulos mostrar = ( Articulos) almacen.getArticulo(i) ;
             System.out.println( "\nArticulos ID: " + mostrar.getId( ) +
                 " \nNombre: " + mostrar.getNombre() +
                 " \nPrecio Detalle: " + mostrar.getDetalle() + " €" +
                 " \nPrecio: " + mostrar.getPrecio() + " €" +
                 " \nCantidad: " + mostrar.getCantidad( )) ;
         }
     }
 }