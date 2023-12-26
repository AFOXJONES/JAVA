package STRINGS_4.PRACTICA_1;

import java.util.Scanner;

public class EJ_8 {
    public static void main(String[] args){
//Programa que dadas dos cadenas nos dice si la menor está contenida en la mayor y si es así nos dice la posición en la cual la ha encontrado.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cadena: ");
        String cadena = scanner.nextLine().toUpperCase();

        System.out.print("Ingrese la cadena a buscar: ");
        String cadenaABuscar = scanner.nextLine().toUpperCase();

        int encontrado=cadena.indexOf(cadenaABuscar);

        if(encontrado==0){
            System.out.println("No se ha encontrado");
        }else{
            System.out.println("Se ha encontrado en la posicion "+encontrado);
        }
    }
}
