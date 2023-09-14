package SENTENCIAS_DE_CONTROL.PRACTICA_3;

import java.util.Scanner;

public class EJ2 {
    public static void main(String[] args) {
        //2. Programa que lee dos números (distintos) y nos dice cual es el mayor

        Scanner sc=new Scanner(System.in);

        System.out.print("Primer numero: ");
        double n1=sc.nextDouble();

        System.out.print("Segundo numero: ");
        double n2=sc.nextInt();

        numeroMayor(n1,n2);
    }
    public static void numeroMayor(double n1,double n2){
        if(n1>n2)
            System.out.print(n1+" es mayor que "+n2);
        else if(n2>n1)
            System.out.print(n2+" es mayor que "+n1);
        else
            System.out.print("O son iguales o hay algun error");
    }
}
