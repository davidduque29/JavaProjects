/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lasvariables;

import java.util.Scanner; //1-  se trae la libreria

/**
 *
 * @author ivandavid
 */
public class LasVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        short edad;
        Scanner coso = new Scanner(System.in);
        System.out.println("pf digite su edad: ");
        edad = coso.nextShort();
        if (edad < 18) {
            System.out.println("No puede tomar compre gaseosa");

        } else if (edad < 21 && edad > 18) {
            System.out.println("Puede tomar compre Cerveza Aguila");
        }
  
    
    else {
            System.out.println("SALUDDDD");
    }
}
}
//Object obj = new Object();
//System.out.println("Buenas por favor digite algo: ");
//Scanner otraCosa= new Scanner(System.in); //2 - crea objeto instanciamos un objeto - solo clases mayus
//String lora= otraCosa.nextLine();//3 - usa el objeto - newo + tabulador crea objeto
//    System.out.println("Roa rrr dice que cristian lo crucifican de rodillas "+ lora);
//}

//} ///////// fin ///////
//    public static void main(String[] args) {
//        boolean vof;
//        vof=true;
//        System.out.println("SU variable tienen un valor: "+ vof);
//        
//        char sexo;
//        sexo='*';
//        System.out.println("EL Sexo de cristian es: " + sexo);
//        
//        byte edad;
//        edad=50;
//        System.out.println("Su edad es: "+ edad);
//        
//        short ext=120, ext2=350;
//        System.out.println("Su recorrido fue: "+ ext + ext2 + " KM");
//                
//        long cel; //excepecion l al final
//        cel= 316445l;
//        System.out.println("Su extension es: "+ cel);     
//        
//        int tel;
//        tel= 8576800;
//        System.out.println("Su Telefono es: "+ tel);
//                
//        float fraccion=1.5f; //excepecion l al final
//        System.out.println("Su fraccion es: "+ fraccion); 
//                
//        double doble=0.333333;
//        System.out.println("Su doble es: "+ doble); 
//       
//       
 //   }
    
//}
