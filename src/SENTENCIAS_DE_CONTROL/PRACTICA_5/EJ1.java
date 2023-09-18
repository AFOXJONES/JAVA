package SENTENCIAS_DE_CONTROL.PRACTICA_5;
import java.util.*;
public class EJ1 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {

        //1. Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca
        //un número negativo.

        mostrarCuadrado();


    }
    public static void mostrarCuadrado() {
        int num;
        do {
            System.out.println("Introduzca numero: ");
            num = sc.nextInt();
            if (num >= 0)
                System.out.println("Cuadrado de " + num + " = " + num * num);
        } while (num >= 0);
    }
}
