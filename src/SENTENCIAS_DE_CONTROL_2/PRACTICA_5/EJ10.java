package SENTENCIAS_DE_CONTROL_2.PRACTICA_5;

import java.util.Scanner;

public class EJ10 {
    public static void main(String[] args) {

        //10. Programa que lee una secuencia de notas (0 – 10) terminada al introducir –1 y
        //cuenta el nº de suspensos, aprobados, notables y sobresalientes. Validar que las
        //notas introducidas sean correctas.

        Scanner sc = new Scanner(System.in);

        int num;
        int suspensos = 0,aprobados = 0,notables = 0,sobresalientes = 0;

        do {
            System.out.println("Inserta nota: ");
            num = sc.nextInt();
            if(num<5)
                suspensos++;
            if(num>=5 && num<7)
                aprobados++;
            if(num>=7 && num<9)
                notables++;
            if(num>=9)
                sobresalientes++;

        } while (num==-1);

        System.out.println("Suspensos: "+suspensos);
        System.out.println("Aprobados: "+aprobados);
        System.out.println("Notables: "+notables);
        System.out.println("Sobresalientes: "+sobresalientes);
    }

}
