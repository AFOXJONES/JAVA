package SENTENCIAS_DE_CONTROL.PRACTICA_5;

import java.util.Scanner;

public class EJ7 {
    public static void main(String[] args) {

        //7. Pedir números hasta que se introduzca uno negativo, y calcular la media.

        Scanner sc = new Scanner(System.in);

        int num;
        int suma=0;
        int cont=0;
        do {
            System.out.println("Inserta numero a sumar en la media: ");
            num = sc.nextInt();
            suma+=num;
            cont++;
        } while (num>=0);

        double media= (double) suma /cont;

        System.out.println("La media de todos los numeros es: "+media);
    }


}
