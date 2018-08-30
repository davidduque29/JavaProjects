
package TokenPrueba2;

import java.util.StringTokenizer;

public class TokenPrueba2 {
    
    public static void main(String[] args){
    
        StringTokenizer st1 , st2;
        String cita = " prueba2@9 32/ 25@2/17";
        st1 = new StringTokenizer(cita );
        System. out. println( "Token 1 : " +st1.nextToken() ) ;
        System. out. println( "Token 2: " + st1.nextToken() ) ;
        System. out. println( "Token 3: " + st1.nextToken() ) ;
        
        
        st2 = new StringTokenizer(cita, "@");
         System. out. println( "\nToken 1: " + st2.nextToken() ) ;
         System. out. println( "Token 2: " + st2.nextToken() ) ;
         System. out. println( "Token 3: " + st2.nextToken() ) ;
    
    }
    
}
