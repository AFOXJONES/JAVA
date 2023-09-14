package INICIO.PRACTICA_2;

import java.util.Scanner;

public class EJ3 {
    public static void main(String[] args) {
        //4. Programa que dadas 3 notas calcule la media.

        Scanner sc=new Scanner(System.in);

        System.out.print("Primera nota: ");
        double n1=sc.nextDouble();

        System.out.print("Segunda nota: ");
        double n2=sc.nextInt();

        System.out.print("Tercera nota: ");
        double n3=sc.nextInt();

        media(n1,n2,n3);

    }
    public static void media(double n1,double n2,double n3){
        System.out.println("La media de las notas es: "+(n1+n2+n3)/3);
    }
}
