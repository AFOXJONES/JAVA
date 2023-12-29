package ARRAYS_5.PRACTICA_9;

import java.util.*;

public class EJ_1 {
    public static void main(String[] args) {
        //Leed 10 números en un array. Una vez leídos todos recorred el array y mostrad los que son pares,
        // recorredlo de nuevo para mostrar los impares.

        Scanner sc = new Scanner(System.in);

        int numeros[] = new int[10];
        int num = 0;

        for (int i = 0; numeros.length > i; i++) {
            System.out.println("Anota el siguiente numero: ");
            num = sc.nextInt();
            numeros[i] = num;
        }

        recorrerPares(numeros);

        recorrerImpares(numeros);


    }
    public static void recorrerPares(int[] numeros){
        System.out.println("PARES:");
        for(int i=0;numeros.length>i;i++){
            if(numeros[i]%2==0){
                System.out.println(numeros[i]);
            }
        }
    }

    public static void recorrerImpares(int[] numeros){
        System.out.println("IMPARES:");
        for(int i=0;numeros.length>i;i++){
            if(numeros[i]%2!=0){
                System.out.println(numeros[i]);
            }
        }
    }
}
