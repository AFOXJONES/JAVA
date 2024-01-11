package EXCEPCIONES_Y_FECHAS_8.PRACTICA_12.EXCEPCIONES;

import java.util.*;

public class EJ_2 {
    public static void main(String[] args){
        //Programa que lee un String formado por 4 números y dos letras (ej 4535FA)
        // y lo valida manejando NumberFormatException.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un String formado por 4 números y dos letras (ej 4535FA):");
        String input = scanner.nextLine();

        try {

            if (input.length() != 6) {
                throw new NumberFormatException("El formato no es válido. Deben ser 4 números y dos letras.");
            }

            int numeros = Integer.parseInt(input.substring(0, 4));


            String letras = input.substring(4);
            if (!letras.matches("[a-zA-Z]+")) {
                throw new NumberFormatException("El formato no es válido. Los últimos 2 caracteres deben ser letras.");
            }

            System.out.println("Número: " + numeros);
            System.out.println("Letras: " + letras);
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }

    }
}
