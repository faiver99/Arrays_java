
package arrays_con_java;


import java.util.Scanner;

public class ejercicio6 {
    public void master() {
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[10];

        System.out.println("Introduzca los 10 numeros :");
        for (int i = 0; i < vector.length; i++) {
            vector[i] = sc.nextInt();
        }

        int[] vectorInverso = new int[10];
        for (int i = 0; i < vector.length; i++) {
            vectorInverso[i] = vector[vector.length - i - 1];
        }

        System.out.println("Vector inverso:");
        for (int numero : vectorInverso) {
            System.out.println(numero);
        }
    }
}