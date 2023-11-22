package bucles;

import java.util.Random;

public class BucleAleatorios {

  public static void imprimeAleatorios() {
    
    // Usamos la clase Random de Java de forma auxiliar para generar los números aleatorios
    Random random = new Random();
    
    // Creamos un bucle que imprima 30 números del 1 al 10.
    for (int i = 0; i < 30; i++) {
      
      int numAleatorio = random.nextInt(1,10);
      System.out.println(numAleatorio);
    }
  }
  
}
