package arrays_con_java;

import java.util.ArrayList;

public class ejercicio7 {

    public void matriz() {
        double[][] array = new double[3][4];
        array[0][0] = 4;
        array[0][1] = 5;
        array[0][2] = 6;
        array[0][3] = 2;
        array[1][0] = 1;
        array[1][1] = 8;
        array[1][2] = 9;
        array[1][3] = 7;
        array[2][0] = 3;
        array[2][1] = 4;
        array[2][2] = 10;
        array[2][3] = 5;

        double sum = 0;
        int count = 0;
        double average;
        ArrayList<Double> greaterThanAverage = new ArrayList<>();

        //calculate sum of all elements
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }

        //calculate average
        average = sum / 12;

        //check which elements are greater than average
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > average) {
                    count++;
                    greaterThanAverage.add(array[i][j]);
                }
            }
        }

        //print results
        System.out.println("Promedio: " + average);
        System.out.println("Número de datos mayores que el promedio: " + count);
        System.out.print("Lista de valores mayores que el promedio: ");
        for (int i = 0; i < greaterThanAverage.size(); i++) {
            System.out.print(greaterThanAverage.get(i) + " ");
        }
    }
}
