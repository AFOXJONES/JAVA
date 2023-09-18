package SENTENCIAS_DE_CONTROL.PRACTICA_5;
import java.util.*;
public class EJ2 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {

        //2. Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que
        //se introduzca un 0.

        int num;
        do {
            System.out.println("Introduzca numero");
            num = sc.nextInt();
            if(num>0)
                System.out.println("Numero positivo");
            else
                System.out.println("Numero negativo");
        } while (num != 0);
    }
}
