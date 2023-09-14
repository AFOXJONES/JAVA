package SENTENCIAS_DE_CONTROL.PRACTICA_3;

import java.util.*;
import java.util.Scanner;

public class EJ3 {
    public static void main(String[] args) {

        //3. Programa que lee dos números (no necesariamente distintos) y los escribe ordenados

        Scanner sc=new Scanner(System.in);

        List<Double> list=new ArrayList<>();


        System.out.print("Primer numero: ");
        double n1=sc.nextDouble();

        list.add(n1);

        System.out.print("Segundo numero: ");
        double n2=sc.nextInt();

        list.add(n2);

        System.out.print("Tercer numero: ");
        double n3=sc.nextInt();

        list.add(n3);

        Collections.sort(list);

        System.out.println("LISTA ORDENADA");
        System.out.print(list);
    }
}
