package STRINGS_4.PRACTICA_1;

import java.util.Scanner;

public class EJ_6 {
    public static void main(String[] args){
        //Programa que nos dice si una palabra se lee igual del derecho que del revés.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la palabra: ");
        String palabra = scanner.nextLine();

        //lo hace de una
        String palabraInvertida=new StringBuilder(palabra).reverse().toString();

        //haciendolo poco a poco
        StringBuilder palabraInvertida2=new StringBuilder(palabra);
        palabraInvertida2.reverse();
        String palabrainvertida3=palabraInvertida2.toString();


        if(palabra.equals(palabraInvertida) && palabra.equals(palabrainvertida3)){
            System.out.println("ES un palindromo");
        }else{
            System.out.println("No es un palindromo");
        }

    }
}
