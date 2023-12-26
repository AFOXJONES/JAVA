package STRINGS_4.PRACTICA_1;

import java.util.Scanner;

public class EJ_2 {
    public static void main(String[] args){
        //Programa que lee nombres de ciudades europeas y cuenta cuantas
        // empiezan por una letra introducida por teclado
        Scanner sc=new Scanner(System.in);
        String str;
        int count=0;

        System.out.println("Escribe la letra por la que quieres comprobar: ");
        String character = sc.next();
        character=character.substring(0,1);
        sc.nextLine();
        do {
            System.out.println("Escribe el nombre de la ciudad ");
            str = sc.nextLine();
            if(!str.equalsIgnoreCase("fin")) {
                if(str.substring(0,1).equals(character)){
                    count++;
                }
            }
        }while(!str.equalsIgnoreCase("fin"));

        System.out.println("Hay "+count+" ciudades que empiezan por la letra "+character);
    }
}
