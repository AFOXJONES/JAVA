package STRINGS_4.PRACTICA_1;

import java.util.Scanner;

public class EJ_7 {
    public static void main(String[] args){
        //Programa que lee una cadena y un carácter y cuenta el número de veces que aparece dicho carácter en la cadena.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cadena: ");
        String cadena = scanner.nextLine().toUpperCase();

        System.out.print("Ingrese el caracter: ");
        String caracter = scanner.nextLine().toUpperCase();


        int longitudOriginal=cadena.length();

        //hay que implementar el metodo de Charsequence, charsequence, para que deja meter un string
        //o bien el de char,char pero leer un char y combertirlo a toString
        String cadenaSinCaracter = cadena.replace(caracter, "");

        int vecesRepetidas = (longitudOriginal - cadenaSinCaracter.length())/caracter.length();


        System.out.println("El caracter secuencia de caracteres "+caracter+" se repite "+vecesRepetidas+" veces");

        System.out.println(cadenaSinCaracter);

    }
}
