package ARRAYS_5.MATRICES;

import java.util.*;


public class EJ_3 {
    public static void main(String[] args) {
        //Generar una matriz con números aleatorios, mostrarla por pantalla y después mostrar su transpuesta, es decir cambiar las filas por columnas.

        // Definir las dimensiones de la matriz
        int filas = 3;
        int columnas = 4;

        // Generar una matriz aleatoria
        int[][] matriz = generarMatrizAleatoria(filas, columnas);

        // Mostrar la matriz original
        System.out.println("Matriz Original:");
        mostrarMatriz(matriz);

        // Calcular la transpuesta de la matriz
        int[][] transpuesta = calcularTranspuesta(matriz);

        // Mostrar la matriz transpuesta
        System.out.println("Matriz Transpuesta:");
        mostrarMatriz(transpuesta);
    }

    // Método para generar una matriz aleatoria
    private static int[][] generarMatrizAleatoria(int filas, int columnas) {
        Random random = new Random();
        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = random.nextInt(100); // Números aleatorios entre 0 y 99
            }
        }

        return matriz;
    }

    // Método para mostrar una matriz por pantalla
    private static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Método para calcular la transpuesta de una matriz
    private static int[][] calcularTranspuesta(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        int[][] transpuesta = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }

        return transpuesta;
    }
}