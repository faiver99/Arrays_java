package arrays_con_java;

public class ejercicio5 {
    
    public void main() {
        // Valores iniciales
        int totalHabitantes = 0;
        int cantidadPromedioPorPiso = 0;
        int cantidadPromedioPorTorre = 0;

        // Se crea un array bidimensional para almacenar los datos
        int[][] torres = new int[7][20];

        // Bucle para recorrer las torres
        for (int i = 0; i < torres.length; i++) {
            int contadorPiso = 0;

            // Bucle para recorrer los pisos
            for (int j = 0; j < torres[i].length; j++) {
                int contadorDepartamento = 0;

                // Bucle para recorrer los departamentos
                for (int k = 0; k < 6; k++) {
                    // Se asigna un valor aleatorio de entre 1 a 5 personas a cada apartamento
                    int numeroHabitantes = (int) (Math.random() * 5) + 1;
                    contadorDepartamento += numeroHabitantes;
                    totalHabitantes += numeroHabitantes;
                }
                torres[i][j] = contadorDepartamento;
                contadorPiso += contadorDepartamento;
            }
            cantidadPromedioPorPiso += contadorPiso / torres[i].length;
            cantidadPromedioPorTorre += contadorPiso;
        }

        // Se calcula la cantidad promedio de habitantes por torre
        cantidadPromedioPorTorre /= 7;

        // Se muestran los resultados
        System.out.println("Cantidad total de habitantes del complejo: " + totalHabitantes); 
        System.out.println("Cantidad promedio de habitantes por piso de cada torre: " + cantidadPromedioPorPiso / 7);
        System.out.println("Cantidad promedio de habitantes por torre: " + cantidadPromedioPorTorre);
    }
}