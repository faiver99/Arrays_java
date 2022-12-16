
package arrays_con_java;



public class ejercicio3 {
    public void cincuenta() {

        // Vector para almacenar los números
        int[] numeros = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50};

        // Variable para almacenar la suma de los números
        int suma = 0;

        // Bucle para sumar los números
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        // Variable para almacenar el promedio
        int promedio = suma / numeros.length;

        // Mostrar por pantalla el promedio
        System.out.println("El promedio es: " + promedio);

        // Mostrar por pantalla los números mayores que el promedio
        System.out.println("Los números mayores que el promedio son: ");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > promedio) {
                System.out.print(numeros[i]);
                System.out.print(" ");
            }
        }
    }
}