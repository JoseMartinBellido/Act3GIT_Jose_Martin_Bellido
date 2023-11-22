package bucles;

import java.util.Random;
import java.util.Scanner;

public class BucleAleatorios {
  
  // Método main
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    //Definición del programa para el usuario
    System.out.println("Programa de impresión de números enteros en intervalos.");
    
    // Solicitamos los números enteros para el intervalo y el número intermedio. Todo ello irá en una estructura try/catch.
    try {
      System.out.print("Introduzca un valor entero para el intervalo: ");
      int numero1 = Integer.parseInt(sc.nextLine());
      
      System.out.print("Introduzca segundo valor entero para el intervalo: ");
      int numero2 = Integer.parseInt(sc.nextLine());
      
      System.out.print("Introduzca un tercer valor entero. "
          + "Si se encuentra en el intervalo de los dos anteriores, se imprimirá por pantalla: ");
      int numeroIntervalo = Integer.parseInt(sc.nextLine());
      
      //Usamos el método que imprime los números dentro del intervalo
      imprimeEnIntervalos(numero1,numero2,numeroIntervalo);
      
    } catch (NumberFormatException e) {
      // Mensaje de error en caso de que no se introduzca uno de los valores en el formato deseado
      System.out.println("Uno de los datos introducidos es errónea.");
    }

  }
  

  // Método imprimeAleatorios
  public static void imprimeAleatorios() {
    
    // Usamos la clase Random de Java de forma auxiliar para generar los números aleatorios
    Random random = new Random();
    
    // Creamos un bucle que imprima 20 números del 1 al 10.
    for (int i = 0; i < 20; i++) {
      
      int numAleatorio = random.nextInt(1,10);
      System.out.println(numAleatorio);
    }
  }
  
  // Método imprimeEnIntervalos con dos valores
  public static void imprimeEnIntervalos(int numero1, int numero2) {
    
    // Definimos el límite inferior y superior en función de los distintos casos para trabajar sobre ellos sin tener que distinguir.
    int limiteInferior;
    int limiteSuperior;
    
    // Nuestro programa sólo funciona mientras que ambos números sean distintos. Sino, no imprimimos nada.
    if(numero1 != numero2) {
      if (numero2 < numero1) {
        limiteInferior = numero2;
        limiteSuperior = numero1;
      } else {
        limiteInferior = numero1;
        limiteSuperior = numero2;
      }
      
      // Imprimimos mientras el límite inferior (variable que iremos aumentando) siga siendo menor o igual al límite superior.
      while (limiteInferior <= limiteSuperior) {
        System.out.println(limiteInferior);
        limiteInferior += 7;

      }
    }
  }
  
  // Método imprimeEnIntervalos con tres valores
  public static void imprimeEnIntervalos(int numero1, int numero2, int numeroIntermedio) {
    
    // Definimos el límite inferior y superior en función de los distintos casos para trabajar sobre ellos sin tener que distinguir.
    int limiteInferior;
    int limiteSuperior;
    
    // Nuestro programa sólo funciona mientras que ambos números sean distintos. Sino, no imprimimos nada.
    if(numero1 != numero2) {
      if (numero2 < numero1) {
        limiteInferior = numero2;
        limiteSuperior = numero1;
      } else {
        limiteInferior = numero1;
        limiteSuperior = numero2;
      }
      
      // Imprimimos mientras el límite inferior (variable que iremos aumentando) siga siendo menor o igual al límite superior.
      while (limiteInferior <= limiteSuperior) {
        System.out.println(limiteInferior);
        
        // Si el tercer número se encuentra en el intervalo, lo imprimimos respetando el orden. 
        // Si es igual a uno de los límites, saldrá repetido.
        if (numeroIntermedio >= limiteInferior && numeroIntermedio <= limiteInferior + 6) {
          System.out.println(numeroIntermedio);
        }
        
        limiteInferior += 7;

      }
    }
  }
  
}
