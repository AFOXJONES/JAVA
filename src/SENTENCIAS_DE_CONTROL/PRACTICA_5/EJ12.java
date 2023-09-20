package SENTENCIAS_DE_CONTROL.PRACTICA_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EJ12 {

    public static void main(String[] args) {
        //12. Programa que lee las notas en programación de esta clase y cuenta el nº de
        //aprobados

        List<Integer> list=new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        int num;
        int cont=0;
        do {
            System.out.println("Inserta la nota del alumno: ");
            num = sc.nextInt();
            list.add(num);
            cont++;
        } while (cont<10);

        int aprobados=0;
        int suspensos=0;
        for(int i = 0; list.size()>i; i++){
            int n=list.get(i);
            if(n>=5)
                aprobados++;
            else
                suspensos++;
        }
        System.out.println("Numero de alumnos aprobados: "+aprobados);
        System.out.println("Numero de alumnos suspensos: "+suspensos);
    }
}
