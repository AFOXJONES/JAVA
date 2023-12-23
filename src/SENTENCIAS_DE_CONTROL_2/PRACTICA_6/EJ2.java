package SENTENCIAS_DE_CONTROL_2.PRACTICA_6;

import java.util.Scanner;

public class EJ2 {
    public static void main(String[] args) {
        //2. Leer números de teclado hasta que la suma de todos ellos sea mayor a 100, y decir si se ha
        //anotado algún cero.

        Scanner sc=new Scanner(System.in);

        int suma=0;
        int contCero=0;
        do {
            System.out.print("Introduzca numero: ");
            int num = sc.nextInt();

            suma+=num;
            if(num==0)
                contCero++;
        }while(suma<=100);

        System.out.println(suma);
        System.out.println("Ceros anotados: "+contCero);

    }
}
