package SENTENCIAS_DE_CONTROL_2.PRACTICA_4;
import java.util.*;
public class EJ5 {
    public static void main(String[] args) {

        //5. Programa que lee como dato de entrada un año y nos dice si se trata de un año
        //bisiesto o no. Se sabe que son bisiestos todos los años múltiplos de 4, excepto
        //los que sean múltiplos de 100 sin ser múltiplos de 400.

        Scanner sc=new Scanner(System.in);

        System.out.println("Introduce un año: ");
        int year=sc.nextInt();

        if(isBisiesto(year))
            System.out.println("Es un año bisiesto");
        else
            System.out.println("No es un año bisiesto");

    }
    public static boolean isBisiesto(int year){
        if(year%4==0) {
            if (year % 100 == 0 && year % 400 != 0)
                return false;
            return true;
        }
    return false;
    }
}
