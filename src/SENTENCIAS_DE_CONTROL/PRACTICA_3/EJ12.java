package SENTENCIAS_DE_CONTROL.PRACTICA_3;

import java.util.*;

public class EJ12 {
    public static void main(String[] args) {
        //12. Programa que lee una nota numérica y escribe la correspondiente calificación
        //5 .......... SUFICIENTE

        Scanner sc = new Scanner(System.in);

        System.out.println("INSERTE LA NOTA:");
        double nota = sc.nextDouble();

        if(nota<5)
            System.out.println(nota+"..........INSUFICIENTE");
        if(nota>=5 & nota<6)
            System.out.println(nota+"..........SUFICIENTE");
        if(nota>=6 & nota<7)
            System.out.println(nota+"..........BIEN");
        if(nota>=7 & nota<=8)
            System.out.println(nota+"..........NOTABLE");
        if(nota>=9 & nota<=10)
            System.out.println(nota+"..........SOBRESALIENTE");
    }
}
