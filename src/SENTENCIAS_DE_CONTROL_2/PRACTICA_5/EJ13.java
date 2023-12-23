package SENTENCIAS_DE_CONTROL_2.PRACTICA_5;
import java.util.*;
public class EJ13 {
    public static void main(String[] args) {

        //13. Programa que lee un número y escribe todos los anteriores a él

        Scanner sc=new Scanner(System.in);

        System.out.println("Escribe un numero: ");
        int num=sc.nextInt();

        do{
            num--;
            System.out.println(num);
        }while(num!=0);
    }
}
