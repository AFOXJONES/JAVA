package SENTENCIAS_DE_CONTROL_2.PRACTICA_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EJ4 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {

        //4. Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se
        //han introducido.
        List<Integer> list=new ArrayList<>();

        int num;
        int cont = 0;
        do {
            System.out.println("Introduzca numero");
            num = sc.nextInt();
            if(num>0){
                cont++;
                list.add(num);
            }

        } while (num > 0);

        System.out.println("Contador de numeros: "+cont);
        System.out.println("Numeros introducidos: "+list);

    }
}
