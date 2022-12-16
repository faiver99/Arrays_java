
package arrays_con_java;


public class ejercicio4 {

    public void prom() {
        int[][] calificaciones = new int[30][6];
        int[] promedioAlumno = new int[30];
        int[] promedioAsignatura = new int[6];
        int sumaAlumno = 0;
        int sumaAsignatura = 0;
        int promedioTotalAlumno = 0;
        int promedioTotalAsignatura = 0;

        //inicializando las calificaciones
        for (int i = 0; i < calificaciones.length; i++) {
            for (int j = 0; j < calificaciones[i].length; j++) {
                calificaciones[i][j] = (int) (Math.random() * 10) + 1;
            }
        }

        //calculando el promedio de cada alumno
        for (int i = 0; i < calificaciones.length; i++) {
            for (int j = 0; j < calificaciones[i].length; j++) {
                sumaAlumno += calificaciones[i][j];
            }
            promedioAlumno[i] = sumaAlumno / calificaciones[i].length;
            sumaAlumno = 0;
        }

        //calculando el promedio de cada asignatura
        for (int j = 0; j < calificaciones[0].length; j++) {
            for (int i = 0; i < calificaciones.length; i++) {
                sumaAsignatura += calificaciones[i][j];
            }
            promedioAsignatura[j] = sumaAsignatura / calificaciones.length;
            sumaAsignatura = 0;
        }

        //calculando el promedio total
        for (int i = 0; i < promedioAlumno.length; i++) {
            promedioTotalAlumno += promedioAlumno[i];
        }
        promedioTotalAlumno = promedioTotalAlumno / promedioAlumno.length;

        for (int i = 0; i < promedioAsignatura.length; i++) {
            promedioTotalAsignatura += promedioAsignatura[i];
        }
        promedioTotalAsignatura = promedioTotalAsignatura / promedioAsignatura.length;

        //Imprimiendo los resultados
        System.out.println("Calificaciones:");
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.print("Alumno " + (i + 1) + ": ");
            for (int j = 0; j < calificaciones[i].length; j++) {
                System.out.print(calificaciones[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nPromedio por alumno:");
        for (int i = 0; i < promedioAlumno.length; i++) {
            System.out.println("Alumno " + (i + 1) + ": " + promedioAlumno[i]);
        }

        System.out.println("\nPromedio por asignatura:");
        for (int i = 0; i < promedioAsignatura.length; i++) {
            System.out.println("Asignatura " + (i + 1) + ": " + promedioAsignatura[i]);
        }

        System.out.println("\nPromedio general de alumnos: " + promedioTotalAlumno);
        System.out.println("Promedio general de asignaturas: " + promedioTotalAsignatura);
    }

}