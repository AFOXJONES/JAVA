package ARRAYS_5.MATRICES;

import java.util.*;

public class Ej_2 {
    public static void main(String[] args) {
        //Programa que genera una matriz unidad cuadrada de dimensión dada
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la dimensión de la matriz cuadrada: ");
        int dimension = scanner.nextInt();

        if (dimension <= 0) {
            System.out.println("La dimensión de la matriz debe ser un número positivo.");
            return;
        }

        int[][] matrizIdentidad = generarMatrizIdentidad(dimension);

        // Mostrar la matriz por pantalla
        System.out.println("Matriz Identidad de dimensión " + dimension + ":");
        mostrarMatriz(matrizIdentidad);



        scanner.close();
    }

    // Método para generar una matriz identidad
    private static int[][] generarMatrizIdentidad(int dimension) {
        int[][] matrizIdentidad = new int[dimension][dimension];

        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                matrizIdentidad[i][j] = (i == j) ? 1 : 0;
            }
        }

        return matrizIdentidad;
    }

    // Método para mostrar una matriz por pantalla
    private static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

}
