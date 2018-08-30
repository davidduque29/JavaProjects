
package comprobarscope;

public class ComprobarAlcance {
 int test=12; 
   void imprimirTest(){
   int test=24;
       System.out.println("Test:" + this.test);
   }
   public static void main(String[] args){
       ComprobarAlcance sc = new ComprobarAlcance();
       sc.imprimirTest();
   }
}
