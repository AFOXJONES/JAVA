package SENTENCIAS_DE_CONTROL_2.PRACTICA_4;

import java.util.Scanner;

public class EJ2 {
    public static void main(String[] args) {

        //2. Dado un número entero positivo de tres cifras (leído como tal), escríbase un
        //programa que escriba en pantalla sus cifras en orden inverso

        Scanner sc = new Scanner(System.in);

        int num;
        do {
            System.out.println("Escribe un numero de 3 cifras: ");
            num = sc.nextInt();
            if(num / 100 < 1 || num / 100 > 10)
                System.out.println("El numero debe de ser de 3 cifras");
        } while (num / 100 < 1 || num / 100 > 10);

        int cifra1,cifra2,cifra3;

        cifra1=num%10;
        cifra2=(num%100)/10;
        cifra3=num/100;

        String cifraReverse=cifra1+""+cifra2+""+cifra3;

        System.out.println("El numero al reves es: "+cifraReverse);

    }


}
