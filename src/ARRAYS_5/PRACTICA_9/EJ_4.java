package ARRAYS_5.PRACTICA_9;

import java.util.*;

public class EJ_4 {
    public static void main(String[] args){
        //Programa que lee 5 nombres de personas.
        // Introducirlos en un array y ordenarlos alfabéticamente (usar método sort de la clase Arrays).
        // Comprobar si otro nombre introducido después se encuentra entre esos 5.

        Scanner sc=new Scanner(System.in);

        String nombres[]=new String[5];

        for(int i=0;nombres.length>i;i++){
            System.out.println("Añada un nombre: ");
            String nombre=sc.nextLine();
            nombres[i]=nombre;
        }

        System.out.println("introduzca nombre a buscar:");
        String nomBuscar=sc.nextLine();
        boolean encontrado=false;

        for(String nom : nombres){
            if(!encontrado) {
                encontrado = nom.toUpperCase().equals(nomBuscar.toUpperCase());
            }
        }
        if(encontrado){
            System.out.println("SE HA ENCONTRADO");
        }else{
            System.out.println("NO SE HA ENCONTRADO");

        }
    }
}
