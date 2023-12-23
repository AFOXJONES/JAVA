package SENTENCIAS_DE_CONTROL_2.PRACTICA_6;

import java.util.Scanner;

public class EJ1 {
    public static void main(String[] args) {
        //1. Programa que lee una secuencia de 50 letras y escribe el número de veces que se repite la
        //primera de ellas.

        Scanner sc=new Scanner(System.in);

        System.out.print("Introduzca secuencia de 50 letras: ");
        String secuencia=sc.nextLine();

        char primeraLetra=secuencia.charAt(0);

        int cont =0;
        for(int i=0;secuencia.length()>i;i++){
            if(secuencia.charAt(i)==primeraLetra)
                cont++;
        }

        System.out.println("Numero de veces que se repite la primera letra: "+(cont));

    }
}
