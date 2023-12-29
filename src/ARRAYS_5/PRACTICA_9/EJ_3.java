package ARRAYS_5.PRACTICA_9;

import java.util.*;

public class EJ_3 {
    public static void main(String[] args){
        //El usuario dice cuántos números va a leer, a continuación leemos la cantidad de números indicada
        // y los guardamos en un array. Decid cuántas veces se repite el último número.

        Scanner sc=new Scanner(System.in);

        System.out.println("Cuantos numeros desea leer?");
        int numerosALeer=sc.nextInt();
        int numeros[]=new int[numerosALeer];

        for(int i=0;numeros.length>i;i++){
            System.out.println("Inserte numero:");
            int n=sc.nextInt();
            numeros[i]=n;
        }

        int cont=0;

        for(int num : numeros){
            if(numeros[numerosALeer-1]==num) {
                cont++;
            }
        }
        System.out.println("Hay "+cont+" numeros iguales al ultimo numero '"+numeros[numerosALeer-1]+"'");
    }
}
