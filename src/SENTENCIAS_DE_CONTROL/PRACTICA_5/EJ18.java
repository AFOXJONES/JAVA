package SENTENCIAS_DE_CONTROL.PRACTICA_5;

import java.util.Scanner;

public class EJ18 {
    public static void main(String[] args) {

        //18. Programa que lea dos números enteros y muestre por pantalla todos los números
        //comprendidos entre esos dos, ambos incluidos. El programa no debe suponer que
        //el primero será menor que el segundo ni viceversa, pero sí deberá tenerlo en
        //cuenta para mostrar los números en orden creciente o decreciente según
        //corresponda

        Scanner sc=new Scanner(System.in);

        System.out.print("Introduzca numero 1: ");
        int num1=sc.nextInt();

        System.out.print("Introduzca numero 2: ");
        int num2=sc.nextInt();

        if(num1>num2)
            for(int i=num1;num2<=i;i--)
                System.out.println(i);

        if(num1<num2)
            for(int i=num1;num2>=i;i++)
                System.out.println(i);



    }
}
