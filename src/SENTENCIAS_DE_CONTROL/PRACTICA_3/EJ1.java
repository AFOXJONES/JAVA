package SENTENCIAS_DE_CONTROL.PRACTICA_3;
import java.util.*;
public class EJ1 {
    public static void main(String[] args) {

        //1. Programa que lee dos números, si son positivos los suma, si son negativos los resta y si
        //alguno es nulo saca un mensaje de error

        Scanner sc=new Scanner(System.in);

        System.out.print("Primer numero: ");
        double n1=sc.nextDouble();

        System.out.print("Segundo numero: ");
        double n2=sc.nextInt();

        compruebaPositivo(n1,n2);

    }
    public static void compruebaPositivo(double num1,double num2){
        if(num1>=0 & num2>=0)
            System.out.println("Los sumamos: "+(num1+num2));
        else if(num1<0 & num2<0)
            System.out.println("Los restamos: "+(num1+num2));
        else
            System.out.println("Error, algun numero es nulo o se han introducido valores positivos y negativos ");
    }
}
