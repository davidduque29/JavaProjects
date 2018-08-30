
package circulo;


public class Circulo {

   int x, y, radio;
    Circulo(int puntoX, int puntoY, int tamRadio) {
      this.x = puntoX;
      this.y = puntoY;
      this.radio = tamRadio;
      Resultado();
         }
    Circulo(int puntoX, int puntoY) {
       this(puntoX, puntoY, 2 ) ;
       Resultado();
       
    }
    void Resultado(){
        int resultado = x*y*radio;
        System.out.println(resultado);
    }
    public static void main(String[] arguments) {
       Circulo circulo = new Circulo(2,3,4);
    }
    
}
