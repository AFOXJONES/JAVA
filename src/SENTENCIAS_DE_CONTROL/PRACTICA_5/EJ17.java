package SENTENCIAS_DE_CONTROL.PRACTICA_5;

import java.util.*;

public class EJ17 {
    public static void main(String[] args) {

        //17 Programa que lee una secuencia 5 números y escribe cual ha sido el mayor

        Scanner sc=new Scanner(System.in);

        List<Double> lista=new ArrayList<>();

        int cont=0;
        do {
            System.out.print("Introduzca numero: ");
            lista.add(sc.nextDouble());
            cont++;
        }while(cont!=5);
        Collections.sort(lista);

        System.out.println("Numero mayor: "+lista.get(4));


    }
}
