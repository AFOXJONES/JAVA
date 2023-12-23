package SENTENCIAS_DE_CONTROL_2.PRACTICA_3;

import java.util.Scanner;

public class EJ9 {
    public static void main(String[] args) {

        //9. Programa que recibe como datos de entrada una hora expresada en horas, minutos y
        //segundos y nos devuelve la hora, minutos y segundos que serán transcurridos un segundo
        //más tarde

        Scanner sc=new Scanner(System.in);


        System.out.print("Ingrese la hora (0-23): ");
        int hora = sc.nextInt();
        System.out.print("Ingrese los minutos (0-59): ");
        int minutos = sc.nextInt();
        System.out.print("Ingrese los segundos (0-59): ");
        int segundos = sc.nextInt();


        if (hora < 0 || hora > 23 || minutos < 0 || minutos > 59 || segundos < 0 || segundos > 59) {
            System.out.println("Los valores ingresados no son válidos.");
        } else {

            segundos++;
            if (segundos == 60) {
                segundos = 0;
                minutos++;
                if (minutos == 60) {
                    minutos = 0;
                    hora++;
                    if (hora == 24) {
                        hora = 0;
                    }
                }
            }

            System.out.println("Un segundo más tarde será: " + hora + " horas, " + minutos + " minutos, " + segundos + " segundos.");
        }
    }
}
