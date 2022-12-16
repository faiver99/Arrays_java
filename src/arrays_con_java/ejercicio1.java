
package arrays_con_java;

import java.util.Arrays;
import java.util.Random;

public class ejercicio1 { 
  
    public void  hola() { 
        Random aleatorio = new Random(); 
        int m = 5; 
        int[][] matriz = new int[m][m]; 
        int[] vector = new int[m*m];
        int mayorColumna = Integer.MIN_VALUE; 
        int menorFila = Integer.MAX_VALUE; 
  
        // Llenando la matriz de forma aleatoria 
        for (int i = 0; i < m; i++) { 
            for (int j = 0; j < m; j++) { 
                matriz[i][j] = aleatorio.nextInt(100); 
            } 
        } 
  
        // Mostrando la matriz 
        System.out.println("Matriz original:"); 
        for (int i = 0; i < m; i++) { 
            for (int j = 0; j < m; j++) { 
                System.out.print(matriz[i][j] + " "); 
            } 
            System.out.println(); 
        } 
  
        // Encontrando el mayor por columna 
        for (int i = 0; i < m; i++) { 
            for (int j = 0; j < m; j++) { 
                if (matriz[i][j] > mayorColumna) { 
                    mayorColumna = matriz[i][j]; 
                } 
            } 
            System.out.println("Mayor elemento de la columna " + i + " es: " + mayorColumna); 
            mayorColumna = Integer.MIN_VALUE; 
        } 
  
        // Encontrando el menor por fila 
        for (int i = 0; i < m; i++) { 
            for (int j = 0; j < m; j++) { 
                if (matriz[i][j] < menorFila) { 
                    menorFila = matriz[i][j]; 
                } 
            } 
            System.out.println("Menor elemento de la fila " + i + " es: " + menorFila); 
            menorFila = Integer.MAX_VALUE; 
        } 
  
        // Llenando el vector con los elementos de la matriz 
        int cont = 0; 
        for (int i = 0; i < m; i++) { 
            for (int j = 0; j < m; j++) { 
                vector[cont] = matriz[i][j]; 
                cont++; 
            } 
        } 
  
        // Ordenando el vector de forma descendente 
        for (int i = 0; i < m*m; i++) { 
            for (int j = 0; j < m*m; j++) { 
                if (vector[i] > vector[j]) { 
                    int aux = vector[i]; 
                    vector[i] = vector[j]; 
                    vector[j] = aux; 
                } 
            } 
        } 
  
        // Mostrando el vector ordenado 
        System.out.println("Vector ordenado:"); 
        for (int i = 0; i < m*m; i++) { 
            System.out.print(vector[i] + " "); 
        } 
    } 
}