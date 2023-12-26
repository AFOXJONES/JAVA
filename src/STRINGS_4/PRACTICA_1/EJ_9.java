package STRINGS_4.PRACTICA_1;

import java.util.Scanner;

public class EJ_9 {
    public static void main(String[] args){
        //Programa que lee dos cadenas por teclado y calcula el número
        // de veces que se repite la de menor
        // longitud en la de mayor sustituyendo todas sus apariciones
        // por mayúsculas
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cadena: ");
        String cadena = scanner.nextLine().toLowerCase();

        System.out.print("Ingrese la cadena a sustituir: ");
        String cadenaASustituir = scanner.nextLine().toLowerCase();

        int longitud=cadenaASustituir.length();
        int contador=0;

        for(int i=0;cadena.length()-longitud>=i;i++){
            if(cadena.substring(i,i+longitud).equalsIgnoreCase(cadenaASustituir)){
                contador++;
            }
        }

        cadena=cadena.replace(cadenaASustituir,cadenaASustituir.toUpperCase());

        System.out.println(cadena);
        System.out.println("Se ha sustituido "+contador+" veces");
    }
}
