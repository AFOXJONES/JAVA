package SENTENCIAS_DE_CONTROL.PRACTICA_3;

import java.util.*;

public class EJ11 {
    public static void main(String[] args) {
        //11. Una empresa maneja códigos numéricos con las siguientes características:

        //Cada código consta de cuatro dígitos
        //El primero representa a una provincia
        //El segundo el tipo de operación
        //Los dos últimos el número de la operación

        //Escriba un programa que lea de teclado un número de cuatro dígitos, y posteriormente
        //imprima en pantalla la siguiente información:

        //PROVINCIA &
        //TIPO DE OPERACIÓN &
        //NÚMERO DE OPERACIÓN &&

        //En caso de que el número tenga más de 4 dígitos, en lugar del mensaje anterior, habrá que
        //imprimir en pantalla el siguiente mensaje de error: ERROR: CÓDIGO NO VÁLIDO. Si tiene
        //menos de 4 dígitos se suponen 0 los primeros.

        Scanner sc = new Scanner(System.in);

        System.out.println("Inserte el código:");
        int cod = sc.nextInt();

        int provincia = 0,operacion=0,num=0;
        if(cod/1000<=10){
            num=(cod%1100)%100;
            operacion=((cod-num)%1000)/100;
            provincia=cod/1000;

            System.out.println("PROVINCIA                    "+provincia);
            System.out.println("TIPO DE OPERACIÓN            "+operacion);
            System.out.println("NÚMERO DE OPERACIÓN          "+num);
        }

        System.out.println("codigo erroneo");



    }
}
