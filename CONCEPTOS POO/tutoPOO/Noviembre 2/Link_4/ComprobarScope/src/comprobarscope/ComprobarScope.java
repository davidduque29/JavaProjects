
package comprobarscope;


public class ComprobarScope {

    int test = 12;
    void imprimirTest() {
     int test = 20;
     System.out.println("Test: " + this.test);
   }
    public static void main(String[ ] args) {
      ComprobarScope st = new ComprobarScope( ) ;
      st.imprimirTest();
   }
    
}
