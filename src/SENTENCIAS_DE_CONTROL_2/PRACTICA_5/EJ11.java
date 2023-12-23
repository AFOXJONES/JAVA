package SENTENCIAS_DE_CONTROL_2.PRACTICA_5;

import java.util.*;

public class EJ11 {
    public static void main(String[] args) {

        //11. Programa que lee 100 números y cuenta cuantos han sido pares, cuantos impares
        //y cuantos nulos

        List<Integer> list=new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        int num;
        int cont=0;
        do {
            System.out.println("Inserta el salario del empleado: ");
            num = sc.nextInt();
            list.add(num);
            cont++;
        } while (cont<10);

        int pares=0;
        int impares=0;
        for(int i = 0; list.size()>i; i++){
            int n=list.get(i);
            if(n%2==0)
                pares++;
            else
                impares++;
        }
        System.out.println("Numero de numeros pares: "+pares);
        System.out.println("Numero de numeros impares: "+impares);
    }
}
