package SENTENCIAS_DE_CONTROL_2.PRACTICA_6;
import java.util.*;
public class EJ7 {
    public static void main(String[] args) {

        //7. Programa que determina cuantas cifras tiene un número

        Scanner sc=new Scanner(System.in);


        System.out.println("Escriba un numero: ");
        int numero=sc.nextInt();

        int cont=0;
        for(int i=1;numero/i!=0;i=i*10){
            cont++;
        }

        System.out.println("Tienes un numero de cifras de: "+cont);
    }
}
