package SENTENCIAS_DE_CONTROL_2.PRACTICA_5;

import java.util.Scanner;

public class EJ3 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {

        //3. Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar.


        int num;
        do {
            System.out.println("Introduzca numero");
            num = sc.nextInt();
            if(num%2==0)
                System.out.println("Numero par");
            else
                System.out.println("Numero impar");
        } while (num != 0);
    }
}
