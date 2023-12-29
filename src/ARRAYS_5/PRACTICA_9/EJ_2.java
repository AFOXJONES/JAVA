package ARRAYS_5.PRACTICA_9;

import java.util.*;

public class EJ_2 {
    public static void main(String[] args){
        //Leed 5 números en un array, sólo dejad introducir cada número si es positivo,
        // si no lo es volved a pedirlo hasta que lo sea.
        // Después recorred el array y mostrad sus cuadrados.

        Scanner sc=new Scanner(System.in);

         int numeros[]=new int[5];

        for (int i = 0; i < 5; i++) {
            boolean esPositivo = false;

            while (!esPositivo) {
                System.out.print("Introduce un número positivo: ");
                int numero = sc.nextInt();

                if (numero >= 0) {
                    numeros[i] = numero;
                    esPositivo = true;
                } else {
                    System.out.println("Por favor, introduce un número positivo.");
                }
            }
        }

        mostrarCuadrados(numeros);


    }
    public static void mostrarCuadrados(int[] numeros){
        for(int i=0;numeros.length>i;i++){
            System.out.println("Cuadrado de "+numeros[i]+" = "+numeros[i]*numeros[i]);
        }
    }
}
