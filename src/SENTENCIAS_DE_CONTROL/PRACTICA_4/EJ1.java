package SENTENCIAS_DE_CONTROL.PRACTICA_4;

import java.util.Scanner;

public class EJ1 {
    public static void main(String[] args) {

        //1. Programa que lee como datos de entrada una fecha expresada en día (del 1 al
        //31), mes (del 1 al 12) y año (en número) y nos dice la fecha que será al día
        //siguiente.

        Scanner sc = new Scanner(System.in);


        int dia;

        do {
            System.out.println("Introduce el dia del 1 al 31:");
            dia = sc.nextInt();
            if (dia < 1 | dia > 31)
                System.out.println("El dia debe ser del 1 al 31");
        } while (dia < 1 | dia > 31);


        int mes;

        do {
            System.out.println("Introduce el mes del 1 al 12:");
            mes = sc.nextInt();
            if (mes < 1 | mes > 12)
                System.out.println("El mes debe ser del 1 al 12");
            if(dia==31 & (mes==4 || mes==6 || mes==9 || mes==11))
                System.out.println("No puede ser ese mes debido al numero de dias seleccionados");
            if((dia==30 || dia==29) & mes==2)
                System.out.println("No puede ser ese mes debido al numero de dias seleccionados");
        } while (mes < 1 | mes > 12 || (dia==31 & (mes==2 || mes==4 || mes==6 || mes==9 || mes==11)) || (dia==30 & mes==2));


        System.out.println("Introduce el año:");
        int anio = sc.nextInt();

        dia++;
        if(dia==32){
            dia=1;
            if(mes==12){
                mes=1;
                anio++;
            }else
                mes++;
        }else if(dia==31 && (mes==4 || mes==6 || mes==9 || mes==11)){
            dia=1;
            mes++;
        }else if(dia==29 && mes==2){
            dia=1;
            mes++;
        }

        System.out.println("Dia:      "+dia);
        System.out.println("Mes:      "+mes);
        System.out.println("Año:      "+anio);


    }
}
