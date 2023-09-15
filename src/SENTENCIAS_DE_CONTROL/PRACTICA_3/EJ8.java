package SENTENCIAS_DE_CONTROL.PRACTICA_3;
import java.util.*;
public class EJ8 {
    public static void main(String[] args) {

        //8. Programa que lee un número y nos dice si es par o impar

        Scanner sc=new Scanner(System.in);

        System.out.println("Introduce el numero a comprobar: ");
        int num=sc.nextInt();

        if(num%2==0)
            System.out.println(num+" es par");
        else
            System.out.println(num+" es impar");
    }
}
