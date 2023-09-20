package SENTENCIAS_DE_CONTROL.PRACTICA_5;

import java.util.Scanner;

public class EJ15 {
    public static void main(String[] args) {
        //15. Pide un número (que debe estar entre 0 y 10) y mostrar la tabla de multiplicar de
        //dicho número

        Scanner sc=new Scanner(System.in);

        System.out.println("Escribe un numero: ");
        int num=sc.nextInt();

        for(int i=0;i<=10;i++){
            System.out.println(num*i);
        }
    }
}
