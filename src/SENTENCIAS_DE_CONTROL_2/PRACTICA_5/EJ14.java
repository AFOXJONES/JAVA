package SENTENCIAS_DE_CONTROL_2.PRACTICA_5;

import java.util.Scanner;

public class EJ14 {
    public static void main(String[] args) {

        //14. Programa que lee un número y escribe todos los pares anteriores a él

        Scanner sc=new Scanner(System.in);

        System.out.println("Escribe un numero: ");
        int num=sc.nextInt();

        do{
            num--;
            if(num%2==0)
                System.out.println(num);
        }while(num!=0);
    }
}
