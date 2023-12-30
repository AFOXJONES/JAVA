package ARRAYS_5.MATRICES;

import java.util.*;

public class EJ_1 {
    public static void main(String[] args) {

        //Leer una matriz de 5 filas y 4 columnas, mostrarla por pantalla y escribir el máximo y el mínimo.

        int filas = 5;
        int columnas = 4;
        int[][] matriz = new int[filas][columnas];

        // Leer la matriz desde el usuario
        leerMatriz(matriz);

        // Mostrar la matriz por pantalla
        System.out.println("Matriz ingresada:");
        mostrarMatriz(matriz);

        // Encontrar y mostrar el máximo y el mínimo
        int maximo = encontrarMaximo(matriz);
        int minimo = encontrarMinimo(matriz);

        System.out.println("El máximo es: " + maximo);
        System.out.println("El mínimo es: " + minimo);
    }

    // Método para leer una matriz desde el usuario
    private static void leerMatriz(int[][] matriz) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("Ingrese el valor en la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        scanner.close();
    }

    // Método para mostrar una matriz por pantalla
    private static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Método para encontrar el valor máximo en una matriz
    private static int encontrarMaximo(int[][] matriz) {
        int maximo = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] > maximo) {
                    maximo = matriz[i][j];
                }
            }
        }

        return maximo;
    }

    // Método para encontrar el valor mínimo en una matriz
    private static int encontrarMinimo(int[][] matriz) {
        int minimo = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] < minimo) {
                    minimo = matriz[i][j];
                }
            }
        }

        return minimo;
    }

}
