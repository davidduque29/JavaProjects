
package revisorstrings;



public class RevisorStrings {

     public static void main(String[] args) {
    
    String str = "La estupidez insiste siempre";
        System.out.println( "El string es: " + str);
        System.out.println( "Tamaño de este string: " + str.length( ));
        System.out.println( "El carácter en la posición 5: "
             + str.charAt(5) );
        System.out.println( "El substring de 3 a 12: "
             + str.substring(3, 12));
        System.out.println( "El index del carácter z: "
             + str.indexOf('z' ));
        System.out.println( "El index del inicio del "
             + "substring \" siempre\": " + str.indexOf( "siempre") );
        System.out.println( "El string en mayúsculas: "
             + str.toUpperCase() ) ; 

    }
    
}
