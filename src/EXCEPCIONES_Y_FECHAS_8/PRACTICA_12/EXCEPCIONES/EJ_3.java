package EXCEPCIONES_Y_FECHAS_8.PRACTICA_12.EXCEPCIONES;

import java.util.*;

public class EJ_3 {
    public static void main(String[] args){
        //Crea un array de tamaño 5 y rellénalo con números aleatorios.
        // Pide al usuario que te anote una posición del array y muestra el contenido de esa celda.
        // El proceso termina cuando se han mostrado al menos una vez todos los números del array.
        // Maneja la excepción ArrayIndexBoundException para controlar
        // que no intentamos acceder fuera del array, si es así mostramos un error y volvemos a intentarlo.


        //Solo he conseguido que funcione si los numeros del array no se repiten
        int[] array ={1,3,4,5,6};
        Set<Integer> numerosUnicos = new HashSet<>();

        Scanner scanner = new Scanner(System.in);


        while (numerosUnicos.size() < array.length) {
            try {
                System.out.println("Ingrese una posición del array (0-4):");
                int posicion = Integer.parseInt(scanner.nextLine());


                if (numerosUnicos.add(array[posicion])) {
                    System.out.println("Contenido en la posición " + posicion + ": " + array[posicion]);
                } else {
                    System.out.println("Ya se ha mostrado este número. Inténtelo de nuevo.");
                }
            } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
                System.out.println("Error: Ingrese una posición válida del array.");
            }
        }

        System.out.println("Se han mostrado al menos una vez todos los números únicos del array. Fin del programa.");
        scanner.close();
    }
}
