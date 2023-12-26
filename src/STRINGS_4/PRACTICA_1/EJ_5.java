package STRINGS_4.PRACTICA_1;

import java.util.*;


public class EJ_5 {
    public static void main(String[] args){
        //Programa que lee tres cadenas y las escribe por orden alfabético, ignorando mayúsculas y minúsculas.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la primera cadena: ");
        String cadena1 = scanner.nextLine();

        System.out.print("Ingrese la segunda cadena: ");
        String cadena2 = scanner.nextLine();

        System.out.print("Ingrese la tercera cadena: ");
        String cadena3 = scanner.nextLine();


        String[] cadenas = {cadena1, cadena2, cadena3};

        // Ordena el array alfabéticamente ignorando mayúsculas y minúsculas
        Arrays.sort(cadenas, String.CASE_INSENSITIVE_ORDER);

        // Imprime las cadenas ordenadas
        System.out.println("Cadenas ordenadas alfabéticamente:");
        for (String cadena : cadenas) {
            System.out.println(cadena);
        }

        scanner.close();
    }
}
