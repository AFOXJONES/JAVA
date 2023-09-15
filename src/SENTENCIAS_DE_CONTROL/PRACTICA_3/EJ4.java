package SENTENCIAS_DE_CONTROL.PRACTICA_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EJ4 {
    public static void main(String[] args) {

        //4. Programa que lee tres números distintos y nos dice cuál de ellos es el mayor

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

        System.out.println("NUMERO MAYOR:");
        System.out.print(list.get(2));
    }
}
