package SENTENCIAS_DE_CONTROL.PRACTICA_5;
import java.util.*;
public class EJ5 {
    public static void main(String[] args) {

        //5. Realizar un juego para adivinar un número. Para ello pedir un número N, y luego ir
        //pidiendo números indicando “mayor” o “menor” según sea mayor o menor con
        //respecto a N. El proceso termina cuando el usuario acierta.

        Scanner sc = new Scanner(System.in);


        int numeroAdivinar= (int) ((Math.random()*10)+1);
        System.out.println(numeroAdivinar);
        int num;
        do {
            System.out.println("Intenta adivinar el numero del 1 al 10 ");
            num = sc.nextInt();
        } while (!adivinarNumero(num,numeroAdivinar));


    }
    public static boolean adivinarNumero(int num,int numeroAdivinar){
        if(num==numeroAdivinar){
            System.out.println("Has adivinado el numero");
            return true;
        }else{
            if(num>numeroAdivinar)
                System.out.println("Menor");
            if(num<numeroAdivinar)
                System.out.println("Mayor");
            return false;
        }

    }
}
