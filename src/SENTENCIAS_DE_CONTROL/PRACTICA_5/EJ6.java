package SENTENCIAS_DE_CONTROL.PRACTICA_5;

import java.util.Scanner;

public class EJ6 {
    public static void main(String[] args) {

        //6. Programa que va leyendo números desde teclado y calcula la suma de todos ellos.
        //El programa finaliza cuando el número leído es 0.

        Scanner sc = new Scanner(System.in);

        int num;
        int suma=0;
        do {
            System.out.println("Inserta numero a sumar: ");
            num = sc.nextInt();
            suma+=num;
        } while (num!=0);

        System.out.println("La suma de todos los numeros es: "+suma);
    }
}
