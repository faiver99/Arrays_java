
package arrays_con_java;

import java.util.Random; 

public class ejercicio2 { 
  
    public void altr () { 
        Random aleatorio = new Random(); 
        int[] vector = new int[15]; 
        boolean repetido; 
  
        // Llenando el vector de forma aleatoria 
        for (int i = 0; i < 15; i++) { 
            do { 
                vector[i] = aleatorio.nextInt(100); 
  
                // Verificando si hay un numero repetido 
                repetido = false; 
                for (int j = 0; j < i; j++) { 
                    if (vector[i] == vector[j]) { 
                        repetido = true; 
                    } 
                } 
            } while (repetido); 
        } 
  
        // Mostrando el vector 
        System.out.println("");
        System.out.println("Vector:"); 
        for (int i = 0; i < 15; i++) { 
            System.out.print(vector[i] + " "); 
        } 
    } 
}