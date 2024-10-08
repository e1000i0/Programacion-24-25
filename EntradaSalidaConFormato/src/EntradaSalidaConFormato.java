

/*
 * Pruebas de el método printf
 * 
 */
public class EntradaSalidaConFormato {
    
    public static void main(String[] args) {
      long n = 461012;
      double pi = Math.PI;
      
      System.out.printf("Entero y salto de linea %d\n", n);      
      System.out.printf("Completando hasta 8 con ceros:%08d\n", n);   
      System.out.printf("Completando hasta 8 con blanco:%8d\n", n);    
    
   

      System.out.printf("Real y salto de linea %f\n", pi);       // -->  "3,141593"
      System.out.printf("Real con 3 decimales %.3f\n", pi);     // -->  "3,142"
      System.out.printf("Real con tamaño 10 (blancos delante):%10.3f<<<\n", pi);   // -->  "     3,142"
      System.out.printf("Real con tamaño 10 (blancos detras):%-10.3f<<<\n", pi);  // -->  "3,142     "
      
      System.out.printf("La hora es %02d:%02d:%02d", 8, 7, 3);
      
      System.out.printf("Caracter con 3 espaciospor delante:%3c<<<\n",'A');
      System.out.printf("Caracter con 3 espacios por detas:%-3c<<<\n", 'B');
    }
}