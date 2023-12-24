package STRINGS_4.PRACTICA_1;

import java.util.*;

public class EJ_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el dni: ");
        String dni=sc.nextLine();

        if(esDNI(dni)){
            System.out.println("El dni es valido");
        }else{
            System.out.println("El dni NO es valido");
        }
    }
    public static boolean esDNI(String dni){
        dni=dni.trim();
        char ultimoCaracter=dni.charAt(dni.length() - 1);
        if(dni.length()==9 && dni.substring(0,8).matches("\\d+") && Character.isLetter(ultimoCaracter)){
            return true;
        }
        return false;
    }
}
