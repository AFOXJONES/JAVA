package STRINGS_4.PRACTICA_1;

import java.util.*;

public class EJ_1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str;
        do {
            System.out.println("Escribe la cadena: ");
            str = sc.nextLine();
            if(!str.equalsIgnoreCase("fin")) {
                System.out.println(str.toUpperCase());
            }
        }while(!str.equalsIgnoreCase("fin"));
    }
}
